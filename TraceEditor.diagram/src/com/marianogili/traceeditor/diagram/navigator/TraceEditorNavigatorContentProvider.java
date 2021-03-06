package com.marianogili.traceeditor.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import com.marianogili.traceeditor.diagram.edit.parts.Artefact2EditPart;
import com.marianogili.traceeditor.diagram.edit.parts.ArtefactEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardDashBoardTransformationCompartmentEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardSourceArtefactCompartmentEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardTargetArtefactCompartmentEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardTraceLinkCompartmentEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TraceEditorEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TraceLink2EditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TraceLinkEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TraceLinkSourcesEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TraceLinkTargetsEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TransformationEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TransformationTransformationCompartmentEditPart;
import com.marianogili.traceeditor.diagram.part.Messages;
import com.marianogili.traceeditor.diagram.part.TraceEditorVisualIDRegistry;

/**
 * @generated
 */
public class TraceEditorNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public TraceEditorNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<TraceEditorNavigatorItem> result = new ArrayList<TraceEditorNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, TraceEditorEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof TraceEditorNavigatorGroup) {
			TraceEditorNavigatorGroup group = (TraceEditorNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof TraceEditorNavigatorItem) {
			TraceEditorNavigatorItem navigatorItem = (TraceEditorNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (TraceEditorVisualIDRegistry.getVisualID(view)) {

		case TraceLink2EditPart.VISUAL_ID: {
			LinkedList<TraceEditorAbstractNavigatorItem> result = new LinkedList<TraceEditorAbstractNavigatorItem>();
			Node sv = (Node) view;
			TraceEditorNavigatorGroup outgoinglinks = new TraceEditorNavigatorGroup(
					Messages.NavigatorGroupName_TraceLink_3005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(TraceLinkSourcesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(TraceLinkTargetsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TransformationEditPart.VISUAL_ID: {
			LinkedList<TraceEditorAbstractNavigatorItem> result = new LinkedList<TraceEditorAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(TransformationTransformationCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TraceEditorVisualIDRegistry
							.getType(TraceLink2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case TraceLinkSourcesEditPart.VISUAL_ID: {
			LinkedList<TraceEditorAbstractNavigatorItem> result = new LinkedList<TraceEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TraceEditorNavigatorGroup target = new TraceEditorNavigatorGroup(
					Messages.NavigatorGroupName_TraceLinkSources_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TraceEditorNavigatorGroup source = new TraceEditorNavigatorGroup(
					Messages.NavigatorGroupName_TraceLinkSources_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(ArtefactEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(Artefact2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(TraceLinkEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(TraceLink2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case Artefact2EditPart.VISUAL_ID: {
			LinkedList<TraceEditorAbstractNavigatorItem> result = new LinkedList<TraceEditorAbstractNavigatorItem>();
			Node sv = (Node) view;
			TraceEditorNavigatorGroup incominglinks = new TraceEditorNavigatorGroup(
					Messages.NavigatorGroupName_Artefact_3004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(TraceLinkSourcesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(TraceLinkTargetsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case TraceLinkTargetsEditPart.VISUAL_ID: {
			LinkedList<TraceEditorAbstractNavigatorItem> result = new LinkedList<TraceEditorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TraceEditorNavigatorGroup target = new TraceEditorNavigatorGroup(
					Messages.NavigatorGroupName_TraceLinkTargets_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TraceEditorNavigatorGroup source = new TraceEditorNavigatorGroup(
					Messages.NavigatorGroupName_TraceLinkTargets_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(ArtefactEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(Artefact2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(TraceLinkEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(TraceLink2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case TraceEditorEditPart.VISUAL_ID: {
			LinkedList<TraceEditorAbstractNavigatorItem> result = new LinkedList<TraceEditorAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			TraceEditorNavigatorGroup links = new TraceEditorNavigatorGroup(
					Messages.NavigatorGroupName_TraceEditor_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(DashboardEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(TraceLinkSourcesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(TraceLinkTargetsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case TraceLinkEditPart.VISUAL_ID: {
			LinkedList<TraceEditorAbstractNavigatorItem> result = new LinkedList<TraceEditorAbstractNavigatorItem>();
			Node sv = (Node) view;
			TraceEditorNavigatorGroup outgoinglinks = new TraceEditorNavigatorGroup(
					Messages.NavigatorGroupName_TraceLink_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(TraceLinkSourcesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(TraceLinkTargetsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ArtefactEditPart.VISUAL_ID: {
			LinkedList<TraceEditorAbstractNavigatorItem> result = new LinkedList<TraceEditorAbstractNavigatorItem>();
			Node sv = (Node) view;
			TraceEditorNavigatorGroup incominglinks = new TraceEditorNavigatorGroup(
					Messages.NavigatorGroupName_Artefact_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(TraceLinkSourcesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(TraceLinkTargetsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case DashboardEditPart.VISUAL_ID: {
			LinkedList<TraceEditorAbstractNavigatorItem> result = new LinkedList<TraceEditorAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(DashboardSourceArtefactCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TraceEditorVisualIDRegistry
							.getType(ArtefactEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(DashboardTraceLinkCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TraceEditorVisualIDRegistry
							.getType(TraceLinkEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(DashboardDashBoardTransformationCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TraceEditorVisualIDRegistry
							.getType(TransformationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					TraceEditorVisualIDRegistry
							.getType(DashboardTargetArtefactCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TraceEditorVisualIDRegistry
							.getType(Artefact2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return TraceEditorEditPart.MODEL_ID.equals(TraceEditorVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<TraceEditorNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<TraceEditorNavigatorItem> result = new ArrayList<TraceEditorNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new TraceEditorNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof TraceEditorAbstractNavigatorItem) {
			TraceEditorAbstractNavigatorItem abstractNavigatorItem = (TraceEditorAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
