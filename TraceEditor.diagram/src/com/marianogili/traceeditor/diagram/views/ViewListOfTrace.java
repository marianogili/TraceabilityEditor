package com.marianogili.traceeditor.diagram.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.ui.celleditor.ExtendedComboBoxCellEditor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import com.marianogili.traceeditor.Artefact;
import com.marianogili.traceeditor.LinkType;
import com.marianogili.traceeditor.TraceEditor;
import com.marianogili.traceeditor.TraceLink;
import com.marianogili.traceeditor.TraceeditorPackage;
import com.marianogili.traceeditor.Transformation;
import com.marianogili.traceeditor.TypeArtefact;
import com.marianogili.traceeditor.diagram.part.TraceEditorDiagramEditor;

public class ViewListOfTrace extends ViewPart {
	
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = 
			"com.marianogili.traceeditor.diagram.views.ViewListOfTrace";
	
	
	private TableViewer tableViewer;

	protected EditingDomain editingDomain;
	
	private IPartListener partListener = new IPartListener() {
		public void partOpened(IWorkbenchPart part) {
			trackOpenTraceEditorDiagramEditor(part);
		}

		public void partClosed(IWorkbenchPart part) {
			trackOpenTraceEditorDiagramEditor(part);
		}

		private void trackOpenTraceEditorDiagramEditor(IWorkbenchPart part) {
			if (!(part instanceof TraceEditorDiagramEditor))
				return;
			TraceEditorDiagramEditor editor = (TraceEditorDiagramEditor) part;
			IEditorInput input = (IEditorInput) editor.getEditorInput();
//			String participant = input.getParticipant();
//			if (openEditors.contains(participant)) {
//				openEditors.remove(participant);
//			} else {
//				openEditors.add(participant);
//			}
//			treeViewer.refresh(true);
		}

		@Override
		public void partActivated(IWorkbenchPart part) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void partBroughtToTop(IWorkbenchPart part) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void partDeactivated(IWorkbenchPart part) {
			// TODO Auto-generated method stub
			
		}
	};

	
	public ViewListOfTrace() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		
		tableViewer = new TableViewer(parent);

		this.armarTabla();
		
		tableViewer.setContentProvider(new TableViewerContentProvider());
		
		getSite().getWorkbenchWindow().getPartService().addPartListener(partListener);
		
//		if (editorPart != null) {
//			tableViewer.setInput(editingDomain.getResourceSet().getResources().get(0));
//		}				
	}

	@Override
	public void dispose() {
		getSite().getWorkbenchWindow().getPartService().removePartListener(partListener);
		super.dispose();
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
	
	private class TableViewerContentProvider implements IStructuredContentProvider {
		
		private void TraceLinksTreeToList (ArrayList<Object> elements, List<TraceLink> traceLinks, Transformation aTransformation) {
			
			TransformationBuffer element;

			for (TraceLink aTraceLink : traceLinks) {
				// Caso traza sin orígenes
				if (aTraceLink.getSources().size() == 0) {
					// Caso traza sin orígenes ni destinos
					if (aTraceLink.getTargets().size() == 0) {
						element = new TransformationBuffer(aTransformation, aTraceLink, null, null);
						elements.add(element);
					}
					// Caso traza sin orígenes pero con destinos
					for (Artefact aTarget : aTraceLink.getTargets()) {
						element = new TransformationBuffer(aTransformation,	aTraceLink, null, aTarget);
						elements.add(element);
					}
				}
				for (Artefact aSource : aTraceLink.getSources()) {
					// Caso trazas con orígenes sin destinos
					if (aTraceLink.getTargets().size() == 0) {
						element = new TransformationBuffer(aTransformation, aTraceLink, aSource, null);
						elements.add(element);
					}
					// Caso trazas con orígenes y destinos
					for (Artefact aTarget : aTraceLink.getTargets()) {
						element = new TransformationBuffer(aTransformation, aTraceLink, aSource, aTarget);
						elements.add(element);
					}
				}
			}
		}

		public Object[] getElements(Object object) {
			Resource resource = (Resource) object;
			Object rootObject = resource.getContents().get(0);
			if (rootObject instanceof TraceEditor) {
				// Primero agrupo los enlaces sueltos, o sea que no pertenecen a una transformación.
				List<TraceLink> traceLinks = ((TraceEditor) rootObject).getDashboard().getTraceLinks();
				ArrayList<Object> elements = new ArrayList<Object>(traceLinks.size());

				this.TraceLinksTreeToList(elements, traceLinks, null);

				// Ahora los enlaces de las transformaciones.
				List<Transformation> transformations = ((TraceEditor) rootObject).getDashboard().getTransformations();
				for (Transformation aTransformation : transformations) {
					this.TraceLinksTreeToList(elements, aTransformation.getTraceLinks(), aTransformation);
				}
				return elements.toArray();
			}
			return new Object[0];
		}

//		public void notifyChanged(Notification notification) {
//			switch (notification.getEventType()) {
//			case Notification.ADD:
//			case Notification.ADD_MANY:
//				if (notification.getFeature() != TraceeditorPackage.eINSTANCE
//						.getTransformation_TraceLinks())
//					return;
//			}
//			super.notifyChanged(notification);
//		}

		@Override
		public void dispose() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			// TODO Auto-generated method stub
			
		}
	}
	
	private TableViewerColumn createTableViewerColumn(String title, int bound, final int colNumber) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		final TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);
		return viewerColumn;
	}

	private class TransformationBuffer {
		public Transformation transformation;
		public TraceLink traceLink;
		public Artefact source;
		public Artefact target;

		public TransformationBuffer(Transformation transformation, TraceLink traceLink, Artefact source, Artefact target) {
			super();
			this.transformation = transformation;
			this.traceLink = traceLink;
			this.source = source;
			this.target = target;
		}
	}

	private void armarTabla() {
		Table table = tableViewer.getTable();
		TableLayout layout = new TableLayout();
		table.setLayout(layout);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		// Comienzo de configuración de las columnas.
		//
		// Transformación
		TableViewerColumn col = createTableViewerColumn("Transformación", 150, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Transformation transformation = ((TransformationBuffer) element).transformation;
				if (transformation != null)
					return transformation.getName();
				else
					return "<< Sin transformación >>";
			}
		});
		col.setEditingSupport(new EditingSupport(tableViewer) {

			@Override
			protected void setValue(Object element, Object value) {
				TransformationBuffer buffer = (TransformationBuffer) element;
				Command cmd = SetCommand.create(editingDomain, buffer.transformation, 
						TraceeditorPackage.Literals.NAMED_ELEMENT__NAME, value);
				editingDomain.getCommandStack().execute(cmd);
				tableViewer.refresh();
			}

			@Override
			protected Object getValue(Object element) {
				return ((TransformationBuffer) element).transformation.getName();
			}

			@Override
			protected CellEditor getCellEditor(Object element) {
				return new TextCellEditor(tableViewer.getTable());
			}

			@Override
			protected boolean canEdit(Object element) {
				return true;
			}
		});

		// Enlace
		col = createTableViewerColumn("Enlace/Traza", 150, 1);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				TraceLink traceLink = ((TransformationBuffer) element).traceLink;
				if (traceLink != null)
					return traceLink.getName();
				else
					return "<< Sin enlace >>";
			}
		});
		col.setEditingSupport(new EditingSupport(tableViewer) {
			@Override
			protected void setValue(Object element, Object value) {
				TransformationBuffer buffer = (TransformationBuffer) element;
				TraceLink traceElement = (TraceLink) buffer.traceLink;
				Command cmd = SetCommand.create(editingDomain, traceElement,
						TraceeditorPackage.Literals.NAMED_ELEMENT__NAME, value);
				editingDomain.getCommandStack().execute(cmd);
				tableViewer.refresh();
			}

			@Override
			protected Object getValue(Object element) {
				return ((TransformationBuffer) element).traceLink.getName();
			}

			@Override
			protected CellEditor getCellEditor(Object element) {
				return new TextCellEditor(tableViewer.getTable());
			}

			@Override
			protected boolean canEdit(Object element) {
				return true;
			}

		});

		// Tipo del enlace
		col = createTableViewerColumn("Tipo del enlace", 150, 2);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				TraceLink traceLink = ((TransformationBuffer) element).traceLink;
				if (traceLink != null && traceLink.getType() != null)
					return traceLink.getType().getName();
				else
					return "<< Sin tipo >>";
			}
		});
		col.setEditingSupport(new EditingSupport(tableViewer) {

			@Override
			protected void setValue(Object element, Object value) {
				TraceLink traceLink = ((TransformationBuffer) element).traceLink;
				Command cmd = SetCommand.create(editingDomain, traceLink,
						TraceeditorPackage.Literals.TRACE_LINK__TYPE, value);
				editingDomain.getCommandStack().execute(cmd);
				tableViewer.refresh();
			}

			@Override
			protected Object getValue(Object element) {
				return ((TransformationBuffer) element).traceLink.getType();
			}

			@Override
			protected CellEditor getCellEditor(Object element) {
				
				Resource resource = (Resource) tableViewer.getInput();
				TraceEditor traceEditor = (TraceEditor) resource.getContents().get(0);

				return new ExtendedComboBoxCellEditor(tableViewer.getTable(),
						traceEditor.getConfiguration().getLinkTypes(),
						new ColumnLabelProvider() {
							@Override
							public String getText(Object element) {
								return ((LinkType) element).getName();
							}
						});
			}

			@Override
			protected boolean canEdit(Object element) {
				return true;
			}
		});

		// Artefacto origen

		col = createTableViewerColumn("Artefacto origen", 150, 3);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Artefact artefact = ((TransformationBuffer) element).source;
				if (artefact != null)
					return artefact.getName();
				else
					return "<< Sin origen >>";
			}
		});
		col.setEditingSupport(new EditingSupport(tableViewer) {
			@Override
			protected void setValue(Object element, Object value) {
				Artefact artefactElement = ((TransformationBuffer) element).source;
				Command cmd = SetCommand.create(editingDomain, artefactElement,
						TraceeditorPackage.Literals.NAMED_ELEMENT__NAME, value);
				editingDomain.getCommandStack().execute(cmd);
				tableViewer.refresh();
			}

			@Override
			protected Object getValue(Object element) {
				return ((TransformationBuffer) element).source.getName();
			}

			@Override
			protected CellEditor getCellEditor(Object element) {
				return new TextCellEditor(tableViewer.getTable());
			}

			@Override
			protected boolean canEdit(Object element) {
				return true;
			}

		});

		// Tipo del artefacto origen
		col = createTableViewerColumn("Tipo del origen", 150, 4);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Artefact artefact = ((TransformationBuffer) element).source;
				if (artefact != null && artefact.getType() != null)
					return artefact.getType().getName();
				else
					return "<< Sin tipo >>";
			}
		});
		col.setEditingSupport(new EditingSupport(tableViewer) {

			@Override
			protected void setValue(Object element, Object value) {
				Artefact artefact = ((TransformationBuffer) element).source;
				Command cmd = SetCommand.create(editingDomain, artefact,
						TraceeditorPackage.Literals.ARTEFACT__TYPE, value);
				editingDomain.getCommandStack().execute(cmd);
				tableViewer.refresh();
			}

			@Override
			protected Object getValue(Object element) {
				return ((TransformationBuffer) element).source.getType();
			}

			@Override
			protected CellEditor getCellEditor(Object element) {

				Resource resource = (Resource) tableViewer.getInput();
				TraceEditor traceEditor = (TraceEditor) resource.getContents().get(0);

				return new ExtendedComboBoxCellEditor(tableViewer.getTable(),
						traceEditor.getConfiguration().getTypeArtefacts(),
						new ColumnLabelProvider() {
							@Override
							public String getText(Object element) {
								return ((TypeArtefact) element).getName();
							}
						});
			}

			@Override
			protected boolean canEdit(Object element) {
				return true;
			}
		});


		// Artefacto destino
		col = createTableViewerColumn("Artefacto destino", 150, 5);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Artefact artefact = ((TransformationBuffer) element).target;
				if (artefact != null)
					return artefact.getName();
				else
					return "<< Sin destino >>";
			}
		});
		col.setEditingSupport(new EditingSupport(tableViewer) {

			@Override
			protected void setValue(Object element, Object value) {
				Artefact artefactElement = ((TransformationBuffer) element).target;
				Command cmd = SetCommand.create(editingDomain, artefactElement,
						TraceeditorPackage.Literals.NAMED_ELEMENT__NAME, value);
				editingDomain.getCommandStack().execute(cmd);
				tableViewer.refresh();
			}

			@Override
			protected Object getValue(Object element) {
				return ((TransformationBuffer) element).target.getName();
			}

			@Override
			protected CellEditor getCellEditor(Object element) {
				return new TextCellEditor(tableViewer.getTable());
			}

			@Override
			protected boolean canEdit(Object element) {
				return true;
			}
		});

		// Tipo del artefacto destino
		col = createTableViewerColumn("Tipo del destino", 150, 6);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Artefact artefact = ((TransformationBuffer) element).target;
				if (artefact != null && artefact.getType() != null)
					return artefact.getType().getName();
				else
					return "<< Sin tipo >>";
			}
		});
		col.setEditingSupport(new EditingSupport(tableViewer) {

			@Override
			protected void setValue(Object element, Object value) {
				Artefact artefact = ((TransformationBuffer) element).target;
				Command cmd = SetCommand.create(editingDomain, artefact,
						TraceeditorPackage.Literals.ARTEFACT__TYPE, value);
				editingDomain.getCommandStack().execute(cmd);
				tableViewer.refresh();
			}

			@Override
			protected Object getValue(Object element) {
				return ((TransformationBuffer) element).target.getType();
			}

			@Override
			protected CellEditor getCellEditor(Object element) {

				Resource resource = (Resource) tableViewer.getInput();
				TraceEditor traceEditor = (TraceEditor) resource.getContents().get(0);

				return new ExtendedComboBoxCellEditor(tableViewer.getTable(),
						traceEditor.getConfiguration().getTypeArtefacts(),
						new ColumnLabelProvider() {
							@Override
							public String getText(Object element) {
								return ((TypeArtefact) element).getName();
							}
						});
			}

			@Override
			protected boolean canEdit(Object element) {
				return true;
			}
		});
		//
		// Fin de configuración de columnas.
	}

}
