/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.marianogili.traceeditor.presentation;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EventObject;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.ui.MarkerHelper;
import org.eclipse.emf.common.ui.celleditor.ExtendedComboBoxCellEditor;
import org.eclipse.emf.common.ui.editor.ProblemEditorPart;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;
import org.eclipse.emf.edit.ui.util.EditUIMarkerHelper;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.document.FileEditorInputProxy;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.part.MultiPageSelectionProvider;
import org.eclipse.ui.views.contentoutline.ContentOutline;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.views.properties.PropertySheetPage;

import com.marianogili.traceeditor.Artefact;
import com.marianogili.traceeditor.Configuration;
import com.marianogili.traceeditor.LinkType;
import com.marianogili.traceeditor.TraceEditor;
import com.marianogili.traceeditor.TraceLink;
import com.marianogili.traceeditor.TraceeditorPackage;
import com.marianogili.traceeditor.Transformation;
import com.marianogili.traceeditor.TypeArtefact;
import com.marianogili.traceeditor.diagram.part.TraceEditorDiagramEditor;
import com.marianogili.traceeditor.provider.TraceeditorItemProviderAdapterFactory;

/**
 * This is an example of a Traceeditor model editor. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class TraceeditorEditor extends MultiPageEditorPart implements
		IEditingDomainProvider, IMenuListener, IViewerProvider, IGotoMarker {
	/**
	 * This keeps track of the editing domain that is used to track all changes
	 * to the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AdapterFactoryEditingDomain editingDomain;

	/**
	 * This is the one adapter factory used for providing views of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComposedAdapterFactory adapterFactory;

	/**
	 * This is the content outline page. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected IContentOutlinePage contentOutlinePage;

	/**
	 * This is a kludge... <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IStatusLineManager contentOutlineStatusLineManager;

	/**
	 * This is the content outline page's viewer. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected TreeViewer contentOutlineViewer;

	/**
	 * This is the property sheet page. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected PropertySheetPage propertySheetPage;

	/**
	 * This is the viewer that shadows the selection in the content outline. The
	 * parent relation must be correctly defined for this to work. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TreeViewer selectionViewer;

	/**
	 * This shows how a table view works. A table can be used as a list with
	 * icons. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
//	protected TableViewer tableViewer;

	/**
	 * This keeps track of the active content viewer, which may be either one of
	 * the viewers in the pages or the content outline viewer. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Viewer currentViewer;

	/**
	 * The MarkerHelper is responsible for creating workspace resource markers
	 * presented in Eclipse's Problems View. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected MarkerHelper markerHelper = new EditUIMarkerHelper();

	/**
	 * This listens for when the outline becomes active <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IPartListener partListener = new IPartListener() {
		public void partActivated(IWorkbenchPart p) {
			if (p instanceof ContentOutline) {
				if (((ContentOutline) p).getCurrentPage() == contentOutlinePage) {
					getActionBarContributor().setActiveEditor(
							TraceeditorEditor.this);

					setCurrentViewer(contentOutlineViewer);
				}
			} else if (p instanceof PropertySheet) {
				if (((PropertySheet) p).getCurrentPage() == propertySheetPage) {
					getActionBarContributor().setActiveEditor(
							TraceeditorEditor.this);
					handleActivate();
				}
			} else if (p == TraceeditorEditor.this) {
				handleActivate();
			}
		}

		public void partBroughtToTop(IWorkbenchPart p) {
			// Ignore.
		}

		public void partClosed(IWorkbenchPart p) {
			// Ignore.
		}

		public void partDeactivated(IWorkbenchPart p) {
			// Ignore.
		}

		public void partOpened(IWorkbenchPart p) {
			// Ignore.
		}
	};

	/**
	 * Resources that have been removed since last activation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<Resource> removedResources = new ArrayList<Resource>();

	/**
	 * Resources that have been changed since last activation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<Resource> changedResources = new ArrayList<Resource>();

	/**
	 * Resources that have been saved. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected Collection<Resource> savedResources = new ArrayList<Resource>();

	/**
	 * Map to store the diagnostic associated with a resource. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Map<Resource, Diagnostic> resourceToDiagnosticMap = new LinkedHashMap<Resource, Diagnostic>();

	/**
	 * Controls whether the problem indication should be updated. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected boolean updateProblemIndication = true;

	/**
	 * Adapter used to update the problem indication when resources are demanded
	 * loaded. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EContentAdapter problemIndicationAdapter = new EContentAdapter() {
		@Override
		public void notifyChanged(Notification notification) {
			if (notification.getNotifier() instanceof Resource) {
				switch (notification.getFeatureID(Resource.class)) {
				case Resource.RESOURCE__IS_LOADED:
				case Resource.RESOURCE__ERRORS:
				case Resource.RESOURCE__WARNINGS: {
					Resource resource = (Resource) notification.getNotifier();
					Diagnostic diagnostic = analyzeResourceProblems(resource,
							null);
					if (diagnostic.getSeverity() != Diagnostic.OK) {
						resourceToDiagnosticMap.put(resource, diagnostic);
					} else {
						resourceToDiagnosticMap.remove(resource);
					}

					if (updateProblemIndication) {
						getSite().getShell().getDisplay().asyncExec(
								new Runnable() {
									public void run() {
										updateProblemIndication();
									}
								});
					}
					break;
				}
				}
			} else {
				super.notifyChanged(notification);
			}
		}

		@Override
		protected void setTarget(Resource target) {
			basicSetTarget(target);
		}

		@Override
		protected void unsetTarget(Resource target) {
			basicUnsetTarget(target);
		}
	};

	/**
	 * This listens for workspace changes. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected IResourceChangeListener resourceChangeListener = new IResourceChangeListener() {
		public void resourceChanged(IResourceChangeEvent event) {
			IResourceDelta delta = event.getDelta();
			try {
				class ResourceDeltaVisitor implements IResourceDeltaVisitor {
					protected ResourceSet resourceSet = editingDomain
							.getResourceSet();
					protected Collection<Resource> changedResources = new ArrayList<Resource>();
					protected Collection<Resource> removedResources = new ArrayList<Resource>();

					public boolean visit(IResourceDelta delta) {
						if (delta.getResource().getType() == IResource.FILE) {
							if (delta.getKind() == IResourceDelta.REMOVED
									|| delta.getKind() == IResourceDelta.CHANGED
									&& delta.getFlags() != IResourceDelta.MARKERS) {
								Resource resource = resourceSet.getResource(
										URI
												.createPlatformResourceURI(
														delta.getFullPath()
																.toString(),
														true), false);
								if (resource != null) {
									if (delta.getKind() == IResourceDelta.REMOVED) {
										removedResources.add(resource);
									} else if (!savedResources.remove(resource)) {
										changedResources.add(resource);
									}
								}
							}
						}

						return true;
					}

					public Collection<Resource> getChangedResources() {
						return changedResources;
					}

					public Collection<Resource> getRemovedResources() {
						return removedResources;
					}
				}

				final ResourceDeltaVisitor visitor = new ResourceDeltaVisitor();
				delta.accept(visitor);

				if (!visitor.getRemovedResources().isEmpty()) {
					getSite().getShell().getDisplay().asyncExec(new Runnable() {
						public void run() {
							removedResources.addAll(visitor
									.getRemovedResources());
							if (!isDirty()) {
								getSite().getPage().closeEditor(
										TraceeditorEditor.this, false);
							}
						}
					});
				}

				if (!visitor.getChangedResources().isEmpty()) {
					getSite().getShell().getDisplay().asyncExec(new Runnable() {
						public void run() {
							changedResources.addAll(visitor
									.getChangedResources());
							if (getSite().getPage().getActiveEditor() == TraceeditorEditor.this) {
								handleActivate();
							}
						}
					});
				}
			} catch (CoreException exception) {
				TraceEditorEditorPlugin.INSTANCE.log(exception);
			}
		}
	};

	private IEditorInput wrappedInput;

	private TableEditorPart tableEditorPart;

	private MultiPageSelectionProvider selectionProvider;

	private TraceEditorDiagramEditor diagramEditor;

	/**
	 * Handles activation of the editor or it's associated views. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void handleActivate() {
		// Recompute the read only state.
		//
		if (editingDomain.getResourceToReadOnlyMap() != null) {
			editingDomain.getResourceToReadOnlyMap().clear();

			// Refresh any actions that may become enabled or disabled.
			//
			selectionProvider.setSelection(selectionProvider.getSelection());
		}

		if (!removedResources.isEmpty()) {
			if (handleDirtyConflict()) {
				getSite().getPage().closeEditor(TraceeditorEditor.this, false);
			} else {
				removedResources.clear();
				changedResources.clear();
				savedResources.clear();
			}
		} else if (!changedResources.isEmpty()) {
			changedResources.removeAll(savedResources);
			handleChangedResources();
			changedResources.clear();
			savedResources.clear();
		}
	}

	/**
	 * Handles what to do with changed resources on activation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void handleChangedResources() {
		if (!changedResources.isEmpty()
				&& (!isDirty() || handleDirtyConflict())) {
			if (isDirty()) {
				changedResources.addAll(editingDomain.getResourceSet()
						.getResources());
			}
			editingDomain.getCommandStack().flush();

			updateProblemIndication = false;
			for (Resource resource : changedResources) {
				if (resource.isLoaded()) {
					resource.unload();
					try {
						resource.load(Collections.EMPTY_MAP);
					} catch (IOException exception) {
						if (!resourceToDiagnosticMap.containsKey(resource)) {
							resourceToDiagnosticMap
									.put(resource, analyzeResourceProblems(
											resource, exception));
						}
					}
				}
			}

			updateProblemIndication = true;
			updateProblemIndication();
		}
	}

	/**
	 * Updates the problems indication with the information described in the
	 * specified diagnostic. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void updateProblemIndication() {
		if (updateProblemIndication) {
			BasicDiagnostic diagnostic = new BasicDiagnostic(Diagnostic.OK,
					"TraceEditor.editor", 0, null, new Object[] { editingDomain
							.getResourceSet() });
			for (Diagnostic childDiagnostic : resourceToDiagnosticMap.values()) {
				if (childDiagnostic.getSeverity() != Diagnostic.OK) {
					diagnostic.add(childDiagnostic);
				}
			}

			int lastEditorPage = getPageCount() - 1;
			if (lastEditorPage >= 0
					&& getEditor(lastEditorPage) instanceof ProblemEditorPart) {
				((ProblemEditorPart) getEditor(lastEditorPage))
						.setDiagnostic(diagnostic);
				if (diagnostic.getSeverity() != Diagnostic.OK) {
					setActivePage(lastEditorPage);
				}
			} else if (diagnostic.getSeverity() != Diagnostic.OK) {
				ProblemEditorPart problemEditorPart = new ProblemEditorPart();
				problemEditorPart.setDiagnostic(diagnostic);
				problemEditorPart.setMarkerHelper(markerHelper);
				try {
					addPage(++lastEditorPage, problemEditorPart,
							getEditorInput());
					setPageText(lastEditorPage, problemEditorPart.getPartName());
					setActivePage(lastEditorPage);
					showTabs();
				} catch (PartInitException exception) {
					TraceEditorEditorPlugin.INSTANCE.log(exception);
				}
			}

			if (markerHelper.hasMarkers(editingDomain.getResourceSet())) {
				markerHelper.deleteMarkers(editingDomain.getResourceSet());
				if (diagnostic.getSeverity() != Diagnostic.OK) {
					try {
						markerHelper.createMarkers(diagnostic);
					} catch (CoreException exception) {
						TraceEditorEditorPlugin.INSTANCE.log(exception);
					}
				}
			}
		}
	}

	/**
	 * Shows a dialog that asks if conflicting changes should be discarded. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected boolean handleDirtyConflict() {
		return MessageDialog.openQuestion(getSite().getShell(),
				getString("_UI_FileConflict_label"),
				getString("_WARN_FileConflict"));
	}

	/**
	 * This creates a model editor. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated NOT
	 */
	public TraceeditorEditor() {
		super();
		initializeEditingDomain();
		selectionProvider = new MultiPageSelectionProvider(this);
		selectionProvider
				.addSelectionChangedListener(new ISelectionChangedListener() {
					public void selectionChanged(SelectionChangedEvent event) {
						setStatusLineManager(event.getSelection());
					}
				});
	}

	protected IEditorInput getWrappedInput() {
		if (wrappedInput == null) {
			if (getEditorInput() instanceof IFileEditorInput) {
				wrappedInput = new FileEditorInputProxy(
						(IFileEditorInput) getEditorInput(),
						(TransactionalEditingDomain) getEditingDomain());
			} else {
				wrappedInput = getEditorInput();
			}
		}
		return wrappedInput;
	}

	/**
	 * This sets up the editing domain for the model editor. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void initializeEditingDomain() {
		// Create an adapter factory that yields item providers.
		//
		adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory
				.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new TraceeditorItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		// Create a transactional editing domain
		//
		TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE
				.createEditingDomain();
		domain.setID("TraceEditor.diagram.EditingDomain");

		// Create the command stack that will notify this editor as commands are
		// executed.
		//
		// BasicCommandStack commandStack = new BasicCommandStack();

		// Add a listener to set the most recent command's affected objects to
		// be the selection of the viewer with focus.
		//
		domain.getCommandStack().addCommandStackListener(
				new CommandStackListener() {
					public void commandStackChanged(final EventObject event) {
						getContainer().getDisplay().asyncExec(new Runnable() {
							public void run() {
								firePropertyChange(IEditorPart.PROP_DIRTY);

								// Try to select the affected objects.
								//
								Command mostRecentCommand = ((CommandStack) event
										.getSource()).getMostRecentCommand();
								if (mostRecentCommand != null) {
									setSelectionToViewer(mostRecentCommand
											.getAffectedObjects());
								}
								if (propertySheetPage != null
										&& !propertySheetPage.getControl()
												.isDisposed()) {
									propertySheetPage.refresh();
								}
							}
						});
					}
				});

		// Create the editing domain with a special command stack.
		//
		editingDomain = (AdapterFactoryEditingDomain) domain;
	}

	/**
	 * This is here for the listener to be able to call it. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void firePropertyChange(int action) {
		super.firePropertyChange(action);
	}

	/**
	 * This sets the selection into whichever viewer is active. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSelectionToViewer(Collection<?> collection) {
		final Collection<?> theSelection = collection;
		// Make sure it's okay.
		//
		if (theSelection != null && !theSelection.isEmpty()) {
			Runnable runnable = new Runnable() {
				public void run() {
					// Try to select the items in the current content viewer of
					// the editor.
					//
					if (currentViewer != null) {
						currentViewer.setSelection(new StructuredSelection(
								theSelection.toArray()), true);
					}
				}
			};
			getSite().getShell().getDisplay().asyncExec(runnable);
		}
	}

	/**
	 * This returns the editing domain as required by the
	 * {@link IEditingDomainProvider} interface. This is important for
	 * implementing the static methods of {@link AdapterFactoryEditingDomain}
	 * and for supporting {@link org.eclipse.emf.edit.ui.action.CommandAction}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public class ReverseAdapterFactoryContentProvider extends
			AdapterFactoryContentProvider {
		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public ReverseAdapterFactoryContentProvider(
				AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		@Override
		public Object[] getElements(Object object) {
			Object parent = super.getParent(object);
			return (parent == null ? Collections.EMPTY_SET : Collections
					.singleton(parent)).toArray();
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		@Override
		public Object[] getChildren(Object object) {
			Object parent = super.getParent(object);
			return (parent == null ? Collections.EMPTY_SET : Collections
					.singleton(parent)).toArray();
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		@Override
		public boolean hasChildren(Object object) {
			Object parent = super.getParent(object);
			return parent != null;
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		@Override
		public Object getParent(Object object) {
			return null;
		}
	}

	/**
	 * This makes sure that one content viewer, either for the current page or
	 * the outline view, if it has focus, is the current one. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setCurrentViewer(Viewer viewer) {
		if (currentViewer != viewer) {
			currentViewer = viewer;
		}
	}

	/**
	 * This returns the viewer as required by the {@link IViewerProvider}
	 * interface. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Viewer getViewer() {
		return currentViewer;
	}

	/**
	 * This creates a context menu for the viewer and adds a listener as well
	 * registering the menu for extension. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createContextMenuFor(StructuredViewer viewer) {
		MenuManager contextMenu = new MenuManager("#PopUp");
		contextMenu.add(new Separator("additions"));
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);
		Menu menu = contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(contextMenu,
				new UnwrappingSelectionProvider(viewer));

		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
		viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(
				viewer));
		viewer.addDropSupport(dndOperations, transfers,
				new EditingDomainViewerDropAdapter(editingDomain, viewer));
	}

	/**
	 * This is the method called to load a resource into the editing domain's
	 * resource set based on the editor's input. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public void createModel() {
		URI resourceURI = EditUIUtil.getURI(getEditorInput());
		Exception exception = null;
		Resource resource = null;
		try {
			// Load the resource through the editing domain.
			//
			resource = editingDomain.getResourceSet().getResource(resourceURI,
					true);
		} catch (Exception e) {
			exception = e;
			resource = editingDomain.getResourceSet().getResource(resourceURI,
					false);
		}

		Diagnostic diagnostic = analyzeResourceProblems(resource, exception);
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			resourceToDiagnosticMap.put(resource, analyzeResourceProblems(
					resource, exception));
		}
		editingDomain.getResourceSet().eAdapters()
				.add(problemIndicationAdapter);
	}

	/**
	 * Returns a diagnostic describing the errors and warnings listed in the
	 * resource and the specified exception (if any). <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Diagnostic analyzeResourceProblems(Resource resource,
			Exception exception) {
		if (!resource.getErrors().isEmpty()
				|| !resource.getWarnings().isEmpty()) {
			BasicDiagnostic basicDiagnostic = new BasicDiagnostic(
					Diagnostic.ERROR, "TraceEditor.editor", 0, getString(
							"_UI_CreateModelError_message", resource.getURI()),
					new Object[] { exception == null ? (Object) resource
							: exception });
			basicDiagnostic.merge(EcoreUtil.computeDiagnostic(resource, true));
			return basicDiagnostic;
		} else if (exception != null) {
			return new BasicDiagnostic(Diagnostic.ERROR, "TraceEditor.editor",
					0, getString("_UI_CreateModelError_message", resource
							.getURI()), new Object[] { exception });
		} else {
			return Diagnostic.OK_INSTANCE;
		}
	}

	private class TransformationBuffer {
		public Transformation transformation;
		public TraceLink traceLink;
		public Artefact source;
		public Artefact target;

		public TransformationBuffer(Transformation transformation,
				TraceLink traceLink, Artefact source, Artefact target) {
			super();
			this.transformation = transformation;
			this.traceLink = traceLink;
			this.source = source;
			this.target = target;
		}
	}

	private abstract class TraceeditorEditorPart extends EditorPart implements
			IMenuListener, IEditingDomainProvider {

		protected TraceeditorEditor parentEditor;

		public TraceeditorEditorPart(TraceeditorEditor parent) {
			super();
			this.parentEditor = parent;
		}

		protected String getString(String key) {
			return TraceEditorEditorPlugin.INSTANCE.getString(key);
		}

		public EditingDomain getEditingDomain() {
			return parentEditor.getEditingDomain();
		}

		protected BasicCommandStack getCommandStack() {
			return ((BasicCommandStack) getEditingDomain().getCommandStack());
		}

		protected AdapterFactory getAdapterFactory() {
			return ((AdapterFactoryEditingDomain) ((FileEditorInputProxy) getEditorInput())
					.getEditingDomain()).getAdapterFactory();
		}

		protected void createContextMenuFor(StructuredViewer viewer) {
			MenuManager contextMenu = new MenuManager("#PopUp");
			contextMenu.add(new Separator("additions"));
			contextMenu.setRemoveAllWhenShown(true);
			contextMenu.addMenuListener(this);
			Menu menu = contextMenu.createContextMenu(viewer.getControl());
			viewer.getControl().setMenu(menu);
			getSite().registerContextMenu(contextMenu,
					new UnwrappingSelectionProvider(viewer));

			int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
			Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
			viewer.addDragSupport(dndOperations, transfers,
					new ViewerDragAdapter(viewer));
			viewer.addDropSupport(dndOperations, transfers,
					new EditingDomainViewerDropAdapter(getEditingDomain(),
							viewer));
		}

		@Override
		public void doSave(IProgressMonitor monitor) {
			// nothing to do here - this is handled by the parent editor
		}

		@Override
		public void doSaveAs() {
			// nothing to do here - this is handled by the parent editor
		}

		@Override
		public void init(IEditorSite site, IEditorInput input)
				throws PartInitException {
			setSite(site);
			setInput(input);
		}

		@Override
		public boolean isDirty() {
			return getCommandStack().isSaveNeeded();
		}

		@Override
		public boolean isSaveAsAllowed() {
			return true;
		}

		public void menuAboutToShow(IMenuManager manager) {
			// pass the request to show the context menu on to the parent editor
			((IMenuListener) parentEditor.getEditorSite()
					.getActionBarContributor()).menuAboutToShow(manager);
		}

		public abstract void setInput(Object input);
	}

	private class TableEditorPart extends TraceeditorEditorPart {

		protected TableViewer viewer;

		public TableEditorPart(TraceeditorEditor parent) {
			super(parent);
		}

		private TableViewerColumn createTableViewerColumn(String title,
				int bound, final int colNumber) {
			final TableViewerColumn viewerColumn = new TableViewerColumn(
					viewer, SWT.NONE);
			final TableColumn column = viewerColumn.getColumn();
			column.setText(title);
			column.setWidth(bound);
			column.setResizable(true);
			column.setMoveable(true);
			return viewerColumn;
		}

		@Override
		public void createPartControl(Composite parent) {
			viewer = new TableViewer(parent, SWT.NONE);
			Table table = viewer.getTable();

			TableLayout layout = new TableLayout();
			table.setLayout(layout);
			table.setHeaderVisible(true);
			table.setLinesVisible(true);

			// Comienzo de configuración de las columnas.
			//

			// Transformación
			TableViewerColumn col = createTableViewerColumn("Transformación",
					150, 0);
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
			col.setEditingSupport(new EditingSupport(viewer) {

				@Override
				protected void setValue(Object element, Object value) {
					TransformationBuffer buffer = (TransformationBuffer) element;
					Command cmd = SetCommand.create(editingDomain,
							buffer.transformation,
							TraceeditorPackage.Literals.NAMED_ELEMENT__NAME,
							value);
					editingDomain.getCommandStack().execute(cmd);
					viewer.refresh();
				}

				@Override
				protected Object getValue(Object element) {
					return ((TransformationBuffer) element).transformation
							.getName();
				}

				@Override
				protected CellEditor getCellEditor(Object element) {
					return new TextCellEditor(viewer.getTable());
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
			col.setEditingSupport(new EditingSupport(viewer) {

				@Override
				protected void setValue(Object element, Object value) {
					TransformationBuffer buffer = (TransformationBuffer) element;
					TraceLink traceElement = (TraceLink) buffer.traceLink;
					Command cmd = SetCommand.create(editingDomain,
							traceElement,
							TraceeditorPackage.Literals.NAMED_ELEMENT__NAME,
							value);
					editingDomain.getCommandStack().execute(cmd);
					viewer.refresh();
				}

				@Override
				protected Object getValue(Object element) {
					return ((TransformationBuffer) element).traceLink.getName();
				}

				@Override
				protected CellEditor getCellEditor(Object element) {
					return new TextCellEditor(viewer.getTable());
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
			col.setEditingSupport(new EditingSupport(viewer) {

				@Override
				protected void setValue(Object element, Object value) {
					TraceLink traceLink = ((TransformationBuffer) element).traceLink;
					Command cmd = SetCommand
							.create(
									editingDomain,
									traceLink,
									TraceeditorPackage.Literals.TRACE_LINK__TYPE,
									value);
					editingDomain.getCommandStack().execute(cmd);
					viewer.refresh();
				}

				@Override
				protected Object getValue(Object element) {
					return ((TransformationBuffer) element).traceLink.getType();
				}

				@Override
				protected CellEditor getCellEditor(Object element) {
					Resource resource = editingDomain.getResourceSet()
							.getResources().get(1);

					Configuration configuration = (Configuration) resource
							.getContents().get(0);

					return new ExtendedComboBoxCellEditor(viewer
							.getTable(), configuration.getLinkTypes(),
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
			col.setEditingSupport(new EditingSupport(viewer) {

				@Override
				protected void setValue(Object element, Object value) {
					Artefact artefactElement = ((TransformationBuffer) element).source;
					Command cmd = SetCommand.create(editingDomain,
							artefactElement,
							TraceeditorPackage.Literals.NAMED_ELEMENT__NAME,
							value);
					editingDomain.getCommandStack().execute(cmd);
					viewer.refresh();
				}

				@Override
				protected Object getValue(Object element) {
					return ((TransformationBuffer) element).source.getName();
				}

				@Override
				protected CellEditor getCellEditor(Object element) {
					return new TextCellEditor(viewer.getTable());
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
			col.setEditingSupport(new EditingSupport(viewer) {

				@Override
				protected void setValue(Object element, Object value) {
					Artefact artefact = ((TransformationBuffer) element).source;
					Command cmd = SetCommand.create(editingDomain, artefact,
							TraceeditorPackage.Literals.ARTEFACT__TYPE, value);
					editingDomain.getCommandStack().execute(cmd);
					viewer.refresh();
				}

				@Override
				protected Object getValue(Object element) {
					return ((TransformationBuffer) element).source.getType();
				}

				@Override
				protected CellEditor getCellEditor(Object element) {
					Resource resource = editingDomain.getResourceSet()
							.getResources().get(1);

					Configuration configuration = (Configuration) resource
							.getContents().get(0);

					return new ExtendedComboBoxCellEditor(viewer
							.getTable(), configuration.getTypeArtefacts(),
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
			col.setEditingSupport(new EditingSupport(viewer) {

				@Override
				protected void setValue(Object element, Object value) {
					Artefact artefactElement = ((TransformationBuffer) element).target;
					Command cmd = SetCommand.create(editingDomain,
							artefactElement,
							TraceeditorPackage.Literals.NAMED_ELEMENT__NAME,
							value);
					editingDomain.getCommandStack().execute(cmd);
					viewer.refresh();
				}

				@Override
				protected Object getValue(Object element) {
					return ((TransformationBuffer) element).target.getName();
				}

				@Override
				protected CellEditor getCellEditor(Object element) {
					return new TextCellEditor(viewer.getTable());
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
			col.setEditingSupport(new EditingSupport(viewer) {

				@Override
				protected void setValue(Object element, Object value) {
					Artefact artefact = ((TransformationBuffer) element).target;
					Command cmd = SetCommand.create(editingDomain, artefact,
							TraceeditorPackage.Literals.ARTEFACT__TYPE, value);
					editingDomain.getCommandStack().execute(cmd);
					viewer.refresh();
				}

				@Override
				protected Object getValue(Object element) {
					return ((TransformationBuffer) element).target.getType();
				}

				@Override
				protected CellEditor getCellEditor(Object element) {
					Resource resource = editingDomain.getResourceSet()
							.getResources().get(1);

					Configuration configuration = (Configuration) resource
							.getContents().get(0);

					return new ExtendedComboBoxCellEditor(viewer
							.getTable(), configuration.getTypeArtefacts(),
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

			viewer.setColumnProperties(new String[] { "a", "b" });
			viewer.setContentProvider(new AdapterFactoryContentProvider(
					adapterFactory) {
				private void TraceLinksTreeToList(ArrayList<Object> elements,
						List<TraceLink> traceLinks,
						Transformation aTransformation) {
					TransformationBuffer element;

					for (TraceLink aTraceLink : traceLinks) {
						// Caso traza sin orígenes
						if (aTraceLink.getSources().size() == 0) {
							// Caso traza sin orígenes ni destinos
							if (aTraceLink.getTargets().size() == 0) {
								element = new TransformationBuffer(
										aTransformation, aTraceLink, null, null);
								elements.add(element);
							}
							// Caso traza sin orígenes pero con
							// destinos
							for (Artefact aTarget : aTraceLink.getTargets()) {
								element = new TransformationBuffer(
										aTransformation, aTraceLink, null,
										aTarget);
								elements.add(element);
							}
						}
						for (Artefact aSource : aTraceLink.getSources()) {
							// Caso trazas con orígenes sin destinos
							if (aTraceLink.getTargets().size() == 0) {
								element = new TransformationBuffer(
										aTransformation, aTraceLink, aSource,
										null);
								elements.add(element);
							}
							// Caso trazas con orígenes y destinos
							for (Artefact aTarget : aTraceLink.getTargets()) {
								element = new TransformationBuffer(
										aTransformation, aTraceLink, aSource,
										aTarget);
								elements.add(element);
							}
						}
					}
				}

				public Object[] getElements(Object object) {
					// Primero agrupo los enlaces sueltos, o sea que
					// no pertenecen a una transformación.
					//
					List<TraceLink> traceLinks = ((TraceEditor) object)
							.getDashboard().getTraceLinks();
					ArrayList<Object> elements = new ArrayList<Object>(
							traceLinks.size());

					this.TraceLinksTreeToList(elements, traceLinks, null);

					// Ahora los enlaces de las transformaciones.
					//
					List<Transformation> transformations = ((TraceEditor) object)
							.getDashboard().getTransformations();
					for (Transformation aTransformation : transformations) {
						this.TraceLinksTreeToList(elements, aTransformation
								.getTraceLinks(), aTransformation);
					}

					return elements.toArray();
				}

				public void notifyChanged(Notification notification) {
					switch (notification.getEventType()) {
					case Notification.ADD:
					case Notification.ADD_MANY:
						if (notification.getFeature() != TraceeditorPackage.eINSTANCE
								.getTransformation_TraceLinks())
							return;
					}
					super.notifyChanged(notification);
				}
			});

			// Resource resource = (Resource) editingDomain.getResourceSet()
			// .getResources().get(0);
			// Object rootObject = resource.getContents().get(0);
			// if (rootObject instanceof TraceEditor) {
			// tableViewer.setInput(rootObject);
			// viewerPane.setTitle(rootObject);
			// }

			createContextMenuFor(viewer);
			getEditorSite().setSelectionProvider(viewer);
		}

		@Override
		public void setFocus() {
			viewer.getTable().setFocus();
		}

		@Override
		public void setInput(Object input) {
			viewer.setInput(input);
		}
		
		/**
		 * @return the viewer
		 */
		public TableViewer getViewer() {
			return viewer;
		}
	}

	/**
	 * This is the method used by the framework to install your own controls.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void createPages() {
		// Creates the model from the editor input
		//
		createModel();

		// Only creates the other pages if there is something that can be edited
		//
		if (!getEditingDomain().getResourceSet().getResources().isEmpty()
				&& !(getEditingDomain().getResourceSet().getResources().get(0))
						.getContents().isEmpty()) {

			try {
				int pageIndex;
				// This is the page for the table viewer.
				//
				tableEditorPart = new TableEditorPart(this);
				pageIndex = addPage(tableEditorPart, getWrappedInput());
				setPageText(pageIndex, getString("_UI_TablePage_label"));

				// This is the page for the graphical diagram viewer.
				//
				diagramEditor = new TraceEditorDiagramEditor();
				pageIndex = addPage(diagramEditor, getEditorInput());
				setPageText(pageIndex, "Diagram");

				Resource resource = (Resource) editingDomain.getResourceSet()
						.getResources().get(0);
				Object rootObject = resource.getContents().get(0);
				if (rootObject instanceof TraceEditor) {
					tableEditorPart.getViewer().setInput(rootObject);
				}
			} catch (PartInitException e) {
				// add some error handling for production-quality coding
				e.printStackTrace();
			}

			getSite().getShell().getDisplay().asyncExec(new Runnable() {
				public void run() {
					setActivePage(0);
				}
			});
		}

		// Ensures that this editor will only display the page's tab
		// area if there are more than one page
		//
		getContainer().addControlListener(new ControlAdapter() {
			boolean guard = false;

			@Override
			public void controlResized(ControlEvent event) {
				if (!guard) {
					guard = true;
					hideTabs();
					guard = false;
				}
			}
		});

		getSite().getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				updateProblemIndication();
			}
		});
	}

	/**
	 * If there is just one page in the multi-page editor part, this hides the
	 * single tab at the bottom. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void hideTabs() {
		if (getPageCount() <= 1) {
			setPageText(0, "");
			if (getContainer() instanceof CTabFolder) {
				((CTabFolder) getContainer()).setTabHeight(1);
				Point point = getContainer().getSize();
				getContainer().setSize(point.x, point.y + 6);
			}
		}
	}

	/**
	 * If there is more than one page in the multi-page editor part, this shows
	 * the tabs at the bottom. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void showTabs() {
		if (getPageCount() > 1) {
			setPageText(0, getString("_UI_SelectionPage_label"));
			if (getContainer() instanceof CTabFolder) {
				((CTabFolder) getContainer()).setTabHeight(SWT.DEFAULT);
				Point point = getContainer().getSize();
				getContainer().setSize(point.x, point.y - 6);
			}
		}
	}

	/**
	 * This is used to track the active viewer. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void pageChange(int pageIndex) {
		super.pageChange(pageIndex);

		if (contentOutlinePage != null) {
			handleContentOutlineSelection(contentOutlinePage.getSelection());
		}
	}

	/**
	 * This is how the framework determines which interfaces we implement. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object getAdapter(Class key) {
		if (key.equals(IContentOutlinePage.class)) {
			return showOutlineView() ? getContentOutlinePage() : null;
		} else if (key.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		} else if (key.equals(IGotoMarker.class)) {
			return this;
		} else {
			return super.getAdapter(key);
		}
	}

	/**
	 * This accesses a cached version of the content outliner. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IContentOutlinePage getContentOutlinePage() {
		if (contentOutlinePage == null) {
			// The content outline is just a tree.
			//
			class MyContentOutlinePage extends ContentOutlinePage {
				@Override
				public void createControl(Composite parent) {
					super.createControl(parent);
					contentOutlineViewer = getTreeViewer();
					contentOutlineViewer.addSelectionChangedListener(this);

					// Set up the tree viewer.
					//
					contentOutlineViewer
							.setContentProvider(new AdapterFactoryContentProvider(
									adapterFactory));
					contentOutlineViewer
							.setLabelProvider(new AdapterFactoryLabelProvider(
									adapterFactory));
					contentOutlineViewer.setInput(editingDomain
							.getResourceSet());

					// Make sure our popups work.
					//
					createContextMenuFor(contentOutlineViewer);

					if (!editingDomain.getResourceSet().getResources()
							.isEmpty()) {
						// Select the root object in the view.
						//
						contentOutlineViewer
								.setSelection(new StructuredSelection(
										editingDomain.getResourceSet()
												.getResources().get(0)), true);
					}
				}

				@Override
				public void makeContributions(IMenuManager menuManager,
						IToolBarManager toolBarManager,
						IStatusLineManager statusLineManager) {
					super.makeContributions(menuManager, toolBarManager,
							statusLineManager);
					contentOutlineStatusLineManager = statusLineManager;
				}

				@Override
				public void setActionBars(IActionBars actionBars) {
					super.setActionBars(actionBars);
					getActionBarContributor().shareGlobalActions(this,
							actionBars);
				}
			}

			contentOutlinePage = new MyContentOutlinePage();

			// Listen to selection so that we can handle it is a special way.
			//
			contentOutlinePage
					.addSelectionChangedListener(new ISelectionChangedListener() {
						// This ensures that we handle selections correctly.
						//
						public void selectionChanged(SelectionChangedEvent event) {
							handleContentOutlineSelection(event.getSelection());
						}
					});
		}

		return contentOutlinePage;
	}

	/**
	 * This accesses a cached version of the property sheet. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IPropertySheetPage getPropertySheetPage() {
		if (propertySheetPage == null) {
			propertySheetPage = new ExtendedPropertySheetPage(editingDomain) {
				@Override
				public void setSelectionToViewer(List<?> selection) {
					TraceeditorEditor.this.setSelectionToViewer(selection);
					TraceeditorEditor.this.setFocus();
				}

				@Override
				public void setActionBars(IActionBars actionBars) {
					super.setActionBars(actionBars);
					getActionBarContributor().shareGlobalActions(this,
							actionBars);
				}
			};
			propertySheetPage
					.setPropertySourceProvider(new AdapterFactoryContentProvider(
							adapterFactory));
		}

		return propertySheetPage;
	}

	/**
	 * This deals with how we want selection in the outliner to affect the other
	 * views. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void handleContentOutlineSelection(ISelection selection) {
		if (!selection.isEmpty() && selection instanceof IStructuredSelection) {
			List selectedElements = ((IStructuredSelection) selection).toList();
			if (getActiveEditor() == diagramEditor) {
				// If the diagram viewer is active, we need to map the selection
				// to the corresponding EditParts.
				//
				ArrayList<Object> selectionList = new ArrayList<Object>();
				for (Object selectedElement : selectedElements) {
					if (selectedElement instanceof EObject) {
						String elementID = EMFCoreUtil
								.getProxyID((EObject) selectedElement);
						selectionList.addAll(diagramEditor
								.getDiagramGraphicalViewer()
								.findEditPartsForElement(elementID,
										IGraphicalEditPart.class));
					}
					selectionProvider.setSelection(new StructuredSelection(
							selectionList));
				}
			} else {
				((TraceeditorEditorPart) getActiveEditor())
						.setInput(selectedElements.get(0));
			}
		}
	}

	/**
	 * This is for implementing {@link IEditorPart} and simply saves the model
	 * file. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		// Save only resources that have actually changed.
		//
		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
				Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);

		// Do the work within an operation because this is a long running
		// activity that modifies the workbench.
		//
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			// This is the method that gets invoked when the operation runs.
			//
			@Override
			public void execute(IProgressMonitor monitor) {
				// Save the resources to the file system.
				//
				boolean first = true;
				for (Resource resource : editingDomain.getResourceSet()
						.getResources()) {
					if ((first || !resource.getContents().isEmpty() || isPersisted(resource))
							&& !editingDomain.isReadOnly(resource)) {
						try {
							long timeStamp = resource.getTimeStamp();
							resource.save(saveOptions);
							if (resource.getTimeStamp() != timeStamp) {
								savedResources.add(resource);
							}
						} catch (Exception exception) {
							resourceToDiagnosticMap
									.put(resource, analyzeResourceProblems(
											resource, exception));
						}
						first = false;
					}
				}
			}
		};

		updateProblemIndication = false;
		try {
			// This runs the options, and shows progress.
			//
			new ProgressMonitorDialog(getSite().getShell()).run(true, false,
					operation);

			// Refresh the necessary state.
			//
			((BasicCommandStack) editingDomain.getCommandStack()).saveIsDone();
			firePropertyChange(IEditorPart.PROP_DIRTY);
		} catch (Exception exception) {
			// Something went wrong that shouldn't.
			//
			TraceEditorEditorPlugin.INSTANCE.log(exception);
		}
		updateProblemIndication = true;
		updateProblemIndication();
	}

	/**
	 * This returns whether something has been persisted to the URI of the
	 * specified resource. The implementation uses the URI converter from the
	 * editor's resource set to try to open an input stream. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected boolean isPersisted(Resource resource) {
		boolean result = false;
		try {
			InputStream stream = editingDomain.getResourceSet()
					.getURIConverter().createInputStream(resource.getURI());
			if (stream != null) {
				result = true;
				stream.close();
			}
		} catch (IOException e) {
			// Ignore
		}
		return result;
	}

	/**
	 * This always returns true because it is not currently supported. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	/**
	 * This also changes the editor's input. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void doSaveAs() {
		SaveAsDialog saveAsDialog = new SaveAsDialog(getSite().getShell());
		saveAsDialog.open();
		IPath path = saveAsDialog.getResult();
		if (path != null) {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			if (file != null) {
				doSaveAs(URI.createPlatformResourceURI(file.getFullPath()
						.toString(), true), new FileEditorInput(file));
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void doSaveAs(URI uri, IEditorInput editorInput) {
		(editingDomain.getResourceSet().getResources().get(0)).setURI(uri);
		setInputWithNotify(editorInput);
		setPartName(editorInput.getName());
		IProgressMonitor progressMonitor = getActionBars()
				.getStatusLineManager() != null ? getActionBars()
				.getStatusLineManager().getProgressMonitor()
				: new NullProgressMonitor();
		doSave(progressMonitor);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void gotoMarker(IMarker marker) {
		try {
			if (marker.getType().equals(EValidator.MARKER)) {
				String uriAttribute = marker.getAttribute(
						EValidator.URI_ATTRIBUTE, null);
				if (uriAttribute != null) {
					URI uri = URI.createURI(uriAttribute);
					EObject eObject = editingDomain.getResourceSet()
							.getEObject(uri, true);
					if (eObject != null) {
						setSelectionToViewer(Collections
								.singleton(editingDomain.getWrapper(eObject)));
					}
				}
			}
		} catch (CoreException exception) {
			TraceEditorEditorPlugin.INSTANCE.log(exception);
		}
	}

	/**
	 * This is called during startup. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public void init(IEditorSite site, IEditorInput editorInput) {
		setSite(site);
		setInputWithNotify(editorInput);
		setPartName(editorInput.getName());
		site.setSelectionProvider(selectionProvider);
		site.getPage().addPartListener(partListener);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(
				resourceChangeListener, IResourceChangeEvent.POST_CHANGE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStatusLineManager(ISelection selection) {
		IStatusLineManager statusLineManager = currentViewer != null
				&& currentViewer == contentOutlineViewer ? contentOutlineStatusLineManager
				: getActionBars().getStatusLineManager();

		if (statusLineManager != null) {
			if (selection instanceof IStructuredSelection) {
				Collection<?> collection = ((IStructuredSelection) selection)
						.toList();
				switch (collection.size()) {
				case 0: {
					statusLineManager
							.setMessage(getString("_UI_NoObjectSelected"));
					break;
				}
				case 1: {
					String text = new AdapterFactoryItemDelegator(
							adapterFactory).getText(collection.iterator()
							.next());
					statusLineManager.setMessage(getString(
							"_UI_SingleObjectSelected", text));
					break;
				}
				default: {
					statusLineManager.setMessage(getString(
							"_UI_MultiObjectSelected", Integer
									.toString(collection.size())));
					break;
				}
				}
			} else {
				statusLineManager.setMessage("");
			}
		}
	}

	/**
	 * This looks up a string in the plugin's plugin.properties file. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static String getString(String key) {
		return TraceEditorEditorPlugin.INSTANCE.getString(key);
	}

	/**
	 * This looks up a string in plugin.properties, making a substitution. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static String getString(String key, Object s1) {
		return TraceEditorEditorPlugin.INSTANCE.getString(key,
				new Object[] { s1 });
	}

	/**
	 * This implements {@link org.eclipse.jface.action.IMenuListener} to help
	 * fill the context menus with contributions from the Edit menu. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void menuAboutToShow(IMenuManager menuManager) {
		((IMenuListener) getEditorSite().getActionBarContributor())
				.menuAboutToShow(menuManager);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EditingDomainActionBarContributor getActionBarContributor() {
		return (EditingDomainActionBarContributor) getEditorSite()
				.getActionBarContributor();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IActionBars getActionBars() {
		return getActionBarContributor().getActionBars();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void dispose() {
		updateProblemIndication = false;

		ResourcesPlugin.getWorkspace().removeResourceChangeListener(
				resourceChangeListener);

		getSite().getPage().removePartListener(partListener);

		adapterFactory.dispose();

		if (getActionBarContributor().getActiveEditor() == this) {
			getActionBarContributor().setActiveEditor(null);
		}

		if (propertySheetPage != null) {
			propertySheetPage.dispose();
		}

		if (contentOutlinePage != null) {
			contentOutlinePage.dispose();
		}

		super.dispose();
	}

	/**
	 * Returns whether the outline view should be presented to the user. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected boolean showOutlineView() {
		return true;
	}
}
