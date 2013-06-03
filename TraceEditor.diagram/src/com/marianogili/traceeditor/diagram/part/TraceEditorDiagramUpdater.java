package com.marianogili.traceeditor.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import com.marianogili.traceeditor.Artefact;
import com.marianogili.traceeditor.Dashboard;
import com.marianogili.traceeditor.TraceEditor;
import com.marianogili.traceeditor.TraceLink;
import com.marianogili.traceeditor.TraceeditorPackage;
import com.marianogili.traceeditor.Transformation;
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
import com.marianogili.traceeditor.diagram.providers.TraceEditorElementTypes;

/**
 * @generated
 */
public class TraceEditorDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<TraceEditorNodeDescriptor> getSemanticChildren(View view) {
		switch (TraceEditorVisualIDRegistry.getVisualID(view)) {
		case TraceEditorEditPart.VISUAL_ID:
			return getTraceEditor_1000SemanticChildren(view);
		case DashboardSourceArtefactCompartmentEditPart.VISUAL_ID:
			return getDashboardDashboardSourceArtefactCompartment_7001SemanticChildren(view);
		case DashboardTraceLinkCompartmentEditPart.VISUAL_ID:
			return getDashboardDashboardTraceLinkCompartment_7002SemanticChildren(view);
		case DashboardTargetArtefactCompartmentEditPart.VISUAL_ID:
			return getDashboardDashboardTargetArtefactCompartment_7003SemanticChildren(view);
		case DashboardDashBoardTransformationCompartmentEditPart.VISUAL_ID:
			return getDashboardDashBoardTransformationCompartment_7005SemanticChildren(view);
		case TransformationTransformationCompartmentEditPart.VISUAL_ID:
			return getTransformationTransformationCompartment_7004SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorNodeDescriptor> getTraceEditor_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		TraceEditor modelElement = (TraceEditor) view.getElement();
		LinkedList<TraceEditorNodeDescriptor> result = new LinkedList<TraceEditorNodeDescriptor>();
		{
			Dashboard childElement = modelElement.getDashboard();
			int visualID = TraceEditorVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DashboardEditPart.VISUAL_ID) {
				result.add(new TraceEditorNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorNodeDescriptor> getDashboardDashboardSourceArtefactCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Dashboard modelElement = (Dashboard) containerView.getElement();
		LinkedList<TraceEditorNodeDescriptor> result = new LinkedList<TraceEditorNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSourceArtefacts().iterator(); it
				.hasNext();) {
			Artefact childElement = (Artefact) it.next();
			int visualID = TraceEditorVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArtefactEditPart.VISUAL_ID) {
				result.add(new TraceEditorNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorNodeDescriptor> getDashboardDashboardTraceLinkCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Dashboard modelElement = (Dashboard) containerView.getElement();
		LinkedList<TraceEditorNodeDescriptor> result = new LinkedList<TraceEditorNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTraceLinks().iterator(); it
				.hasNext();) {
			TraceLink childElement = (TraceLink) it.next();
			int visualID = TraceEditorVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TraceLinkEditPart.VISUAL_ID) {
				result.add(new TraceEditorNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorNodeDescriptor> getDashboardDashboardTargetArtefactCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Dashboard modelElement = (Dashboard) containerView.getElement();
		LinkedList<TraceEditorNodeDescriptor> result = new LinkedList<TraceEditorNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTargetArtefacts().iterator(); it
				.hasNext();) {
			Artefact childElement = (Artefact) it.next();
			int visualID = TraceEditorVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Artefact2EditPart.VISUAL_ID) {
				result.add(new TraceEditorNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorNodeDescriptor> getDashboardDashBoardTransformationCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Dashboard modelElement = (Dashboard) containerView.getElement();
		LinkedList<TraceEditorNodeDescriptor> result = new LinkedList<TraceEditorNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTransformations().iterator(); it
				.hasNext();) {
			Transformation childElement = (Transformation) it.next();
			int visualID = TraceEditorVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TransformationEditPart.VISUAL_ID) {
				result.add(new TraceEditorNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorNodeDescriptor> getTransformationTransformationCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Transformation modelElement = (Transformation) containerView
				.getElement();
		LinkedList<TraceEditorNodeDescriptor> result = new LinkedList<TraceEditorNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTraceLinks().iterator(); it
				.hasNext();) {
			TraceLink childElement = (TraceLink) it.next();
			int visualID = TraceEditorVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TraceLink2EditPart.VISUAL_ID) {
				result.add(new TraceEditorNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorLinkDescriptor> getContainedLinks(View view) {
		switch (TraceEditorVisualIDRegistry.getVisualID(view)) {
		case TraceEditorEditPart.VISUAL_ID:
			return getTraceEditor_1000ContainedLinks(view);
		case DashboardEditPart.VISUAL_ID:
			return getDashboard_2001ContainedLinks(view);
		case ArtefactEditPart.VISUAL_ID:
			return getArtefact_3001ContainedLinks(view);
		case TraceLinkEditPart.VISUAL_ID:
			return getTraceLink_3002ContainedLinks(view);
		case TransformationEditPart.VISUAL_ID:
			return getTransformation_3003ContainedLinks(view);
		case TraceLink2EditPart.VISUAL_ID:
			return getTraceLink_3005ContainedLinks(view);
		case Artefact2EditPart.VISUAL_ID:
			return getArtefact_3004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorLinkDescriptor> getIncomingLinks(View view) {
		switch (TraceEditorVisualIDRegistry.getVisualID(view)) {
		case DashboardEditPart.VISUAL_ID:
			return getDashboard_2001IncomingLinks(view);
		case ArtefactEditPart.VISUAL_ID:
			return getArtefact_3001IncomingLinks(view);
		case TraceLinkEditPart.VISUAL_ID:
			return getTraceLink_3002IncomingLinks(view);
		case TransformationEditPart.VISUAL_ID:
			return getTransformation_3003IncomingLinks(view);
		case TraceLink2EditPart.VISUAL_ID:
			return getTraceLink_3005IncomingLinks(view);
		case Artefact2EditPart.VISUAL_ID:
			return getArtefact_3004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorLinkDescriptor> getOutgoingLinks(View view) {
		switch (TraceEditorVisualIDRegistry.getVisualID(view)) {
		case DashboardEditPart.VISUAL_ID:
			return getDashboard_2001OutgoingLinks(view);
		case ArtefactEditPart.VISUAL_ID:
			return getArtefact_3001OutgoingLinks(view);
		case TraceLinkEditPart.VISUAL_ID:
			return getTraceLink_3002OutgoingLinks(view);
		case TransformationEditPart.VISUAL_ID:
			return getTransformation_3003OutgoingLinks(view);
		case TraceLink2EditPart.VISUAL_ID:
			return getTraceLink_3005OutgoingLinks(view);
		case Artefact2EditPart.VISUAL_ID:
			return getArtefact_3004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorLinkDescriptor> getTraceEditor_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorLinkDescriptor> getDashboard_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorLinkDescriptor> getArtefact_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorLinkDescriptor> getTraceLink_3002ContainedLinks(
			View view) {
		TraceLink modelElement = (TraceLink) view.getElement();
		LinkedList<TraceEditorLinkDescriptor> result = new LinkedList<TraceEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_TraceLink_Sources_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_TraceLink_Targets_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorLinkDescriptor> getTransformation_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorLinkDescriptor> getTraceLink_3005ContainedLinks(
			View view) {
		TraceLink modelElement = (TraceLink) view.getElement();
		LinkedList<TraceEditorLinkDescriptor> result = new LinkedList<TraceEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_TraceLink_Sources_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_TraceLink_Targets_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorLinkDescriptor> getArtefact_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorLinkDescriptor> getDashboard_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorLinkDescriptor> getArtefact_3001IncomingLinks(
			View view) {
		Artefact modelElement = (Artefact) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TraceEditorLinkDescriptor> result = new LinkedList<TraceEditorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_TraceLink_Sources_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_TraceLink_Targets_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorLinkDescriptor> getTraceLink_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorLinkDescriptor> getTransformation_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorLinkDescriptor> getTraceLink_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorLinkDescriptor> getArtefact_3004IncomingLinks(
			View view) {
		Artefact modelElement = (Artefact) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TraceEditorLinkDescriptor> result = new LinkedList<TraceEditorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_TraceLink_Sources_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_TraceLink_Targets_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorLinkDescriptor> getDashboard_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorLinkDescriptor> getArtefact_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorLinkDescriptor> getTraceLink_3002OutgoingLinks(
			View view) {
		TraceLink modelElement = (TraceLink) view.getElement();
		LinkedList<TraceEditorLinkDescriptor> result = new LinkedList<TraceEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_TraceLink_Sources_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_TraceLink_Targets_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorLinkDescriptor> getTransformation_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorLinkDescriptor> getTraceLink_3005OutgoingLinks(
			View view) {
		TraceLink modelElement = (TraceLink) view.getElement();
		LinkedList<TraceEditorLinkDescriptor> result = new LinkedList<TraceEditorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_TraceLink_Sources_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_TraceLink_Targets_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceEditorLinkDescriptor> getArtefact_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<TraceEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_TraceLink_Sources_4001(
			Artefact target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TraceEditorLinkDescriptor> result = new LinkedList<TraceEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == TraceeditorPackage.eINSTANCE
					.getTraceLink_Sources()) {
				result.add(new TraceEditorLinkDescriptor(setting.getEObject(),
						target, TraceEditorElementTypes.TraceLinkSources_4001,
						TraceLinkSourcesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TraceEditorLinkDescriptor> getIncomingFeatureModelFacetLinks_TraceLink_Targets_4002(
			Artefact target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TraceEditorLinkDescriptor> result = new LinkedList<TraceEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == TraceeditorPackage.eINSTANCE
					.getTraceLink_Targets()) {
				result.add(new TraceEditorLinkDescriptor(setting.getEObject(),
						target, TraceEditorElementTypes.TraceLinkTargets_4002,
						TraceLinkTargetsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TraceEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_TraceLink_Sources_4001(
			TraceLink source) {
		LinkedList<TraceEditorLinkDescriptor> result = new LinkedList<TraceEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getSources().iterator(); destinations
				.hasNext();) {
			Artefact destination = (Artefact) destinations.next();
			result.add(new TraceEditorLinkDescriptor(source, destination,
					TraceEditorElementTypes.TraceLinkSources_4001,
					TraceLinkSourcesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TraceEditorLinkDescriptor> getOutgoingFeatureModelFacetLinks_TraceLink_Targets_4002(
			TraceLink source) {
		LinkedList<TraceEditorLinkDescriptor> result = new LinkedList<TraceEditorLinkDescriptor>();
		for (Iterator<?> destinations = source.getTargets().iterator(); destinations
				.hasNext();) {
			Artefact destination = (Artefact) destinations.next();
			result.add(new TraceEditorLinkDescriptor(source, destination,
					TraceEditorElementTypes.TraceLinkTargets_4002,
					TraceLinkTargetsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<TraceEditorNodeDescriptor> getSemanticChildren(View view) {
			return TraceEditorDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<TraceEditorLinkDescriptor> getContainedLinks(View view) {
			return TraceEditorDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<TraceEditorLinkDescriptor> getIncomingLinks(View view) {
			return TraceEditorDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<TraceEditorLinkDescriptor> getOutgoingLinks(View view) {
			return TraceEditorDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
