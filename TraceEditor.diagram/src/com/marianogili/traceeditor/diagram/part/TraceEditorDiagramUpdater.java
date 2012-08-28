package com.marianogili.traceeditor.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import java.util.Map;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import com.marianogili.traceeditor.Artefact;
import com.marianogili.traceeditor.Dashboard;
import com.marianogili.traceeditor.TraceEditor;
import com.marianogili.traceeditor.TraceLink;
import com.marianogili.traceeditor.TraceeditorPackage;
import com.marianogili.traceeditor.Transformation;
import com.marianogili.traceeditor.diagram.edit.parts.Artefact2EditPart;
import com.marianogili.traceeditor.diagram.edit.parts.ArtefactEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardDashboardCompartmentCenterEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardDashboardCompartmentLeftEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardDashboardCompartmentRightEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardEditPart;
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
	public static List getSemanticChildren(View view) {
		switch (TraceEditorVisualIDRegistry.getVisualID(view)) {
		case DashboardDashboardCompartmentLeftEditPart.VISUAL_ID:
			return getDashboardDashboardCompartmentLeft_7001SemanticChildren(view);
		case DashboardDashboardCompartmentCenterEditPart.VISUAL_ID:
			return getDashboardDashboardCompartmentCenter_7002SemanticChildren(view);
		case DashboardDashboardCompartmentRightEditPart.VISUAL_ID:
			return getDashboardDashboardCompartmentRight_7003SemanticChildren(view);
		case TransformationTransformationCompartmentEditPart.VISUAL_ID:
			return getTransformationTransformationCompartment_7004SemanticChildren(view);
		case TraceEditorEditPart.VISUAL_ID:
			return getTraceEditor_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDashboardDashboardCompartmentLeft_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Dashboard modelElement = (Dashboard) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getSourceArtefacts().iterator(); it
				.hasNext();) {
			Artefact childElement = (Artefact) it.next();
			int visualID = TraceEditorVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArtefactEditPart.VISUAL_ID) {
				result
						.add(new TraceEditorNodeDescriptor(childElement,
								visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDashboardDashboardCompartmentCenter_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Dashboard modelElement = (Dashboard) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getTransformations().iterator(); it
				.hasNext();) {
			Transformation childElement = (Transformation) it.next();
			int visualID = TraceEditorVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TransformationEditPart.VISUAL_ID) {
				result
						.add(new TraceEditorNodeDescriptor(childElement,
								visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getTraceLinks().iterator(); it
				.hasNext();) {
			TraceLink childElement = (TraceLink) it.next();
			int visualID = TraceEditorVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TraceLink2EditPart.VISUAL_ID) {
				result
						.add(new TraceEditorNodeDescriptor(childElement,
								visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDashboardDashboardCompartmentRight_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Dashboard modelElement = (Dashboard) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getTargetArtefacts().iterator(); it
				.hasNext();) {
			Artefact childElement = (Artefact) it.next();
			int visualID = TraceEditorVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Artefact2EditPart.VISUAL_ID) {
				result
						.add(new TraceEditorNodeDescriptor(childElement,
								visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTransformationTransformationCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Transformation modelElement = (Transformation) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getTraceLinks().iterator(); it
				.hasNext();) {
			TraceLink childElement = (TraceLink) it.next();
			int visualID = TraceEditorVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TraceLinkEditPart.VISUAL_ID) {
				result
						.add(new TraceEditorNodeDescriptor(childElement,
								visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTraceEditor_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		TraceEditor modelElement = (TraceEditor) view.getElement();
		List result = new LinkedList();
		{
			Dashboard childElement = modelElement.getDashboard();
			int visualID = TraceEditorVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DashboardEditPart.VISUAL_ID) {
				result
						.add(new TraceEditorNodeDescriptor(childElement,
								visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (TraceEditorVisualIDRegistry.getVisualID(view)) {
		case TraceEditorEditPart.VISUAL_ID:
			return getTraceEditor_1000ContainedLinks(view);
		case DashboardEditPart.VISUAL_ID:
			return getDashboard_2001ContainedLinks(view);
		case ArtefactEditPart.VISUAL_ID:
			return getArtefact_3001ContainedLinks(view);
		case TransformationEditPart.VISUAL_ID:
			return getTransformation_3002ContainedLinks(view);
		case TraceLinkEditPart.VISUAL_ID:
			return getTraceLink_3004ContainedLinks(view);
		case Artefact2EditPart.VISUAL_ID:
			return getArtefact_3003ContainedLinks(view);
		case TraceLink2EditPart.VISUAL_ID:
			return getTraceLink_3005ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (TraceEditorVisualIDRegistry.getVisualID(view)) {
		case DashboardEditPart.VISUAL_ID:
			return getDashboard_2001IncomingLinks(view);
		case ArtefactEditPart.VISUAL_ID:
			return getArtefact_3001IncomingLinks(view);
		case TransformationEditPart.VISUAL_ID:
			return getTransformation_3002IncomingLinks(view);
		case TraceLinkEditPart.VISUAL_ID:
			return getTraceLink_3004IncomingLinks(view);
		case Artefact2EditPart.VISUAL_ID:
			return getArtefact_3003IncomingLinks(view);
		case TraceLink2EditPart.VISUAL_ID:
			return getTraceLink_3005IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (TraceEditorVisualIDRegistry.getVisualID(view)) {
		case DashboardEditPart.VISUAL_ID:
			return getDashboard_2001OutgoingLinks(view);
		case ArtefactEditPart.VISUAL_ID:
			return getArtefact_3001OutgoingLinks(view);
		case TransformationEditPart.VISUAL_ID:
			return getTransformation_3002OutgoingLinks(view);
		case TraceLinkEditPart.VISUAL_ID:
			return getTraceLink_3004OutgoingLinks(view);
		case Artefact2EditPart.VISUAL_ID:
			return getArtefact_3003OutgoingLinks(view);
		case TraceLink2EditPart.VISUAL_ID:
			return getTraceLink_3005OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTraceEditor_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDashboard_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getArtefact_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTransformation_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTraceLink_3004ContainedLinks(View view) {
		TraceLink modelElement = (TraceLink) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_TraceLink_Sources_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_TraceLink_Targets_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getArtefact_3003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTraceLink_3005ContainedLinks(View view) {
		TraceLink modelElement = (TraceLink) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_TraceLink_Sources_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_TraceLink_Targets_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDashboard_2001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getArtefact_3001IncomingLinks(View view) {
		Artefact modelElement = (Artefact) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_TraceLink_Sources_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_TraceLink_Targets_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTransformation_3002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTraceLink_3004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getArtefact_3003IncomingLinks(View view) {
		Artefact modelElement = (Artefact) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_TraceLink_Sources_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_TraceLink_Targets_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTraceLink_3005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDashboard_2001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getArtefact_3001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTransformation_3002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTraceLink_3004OutgoingLinks(View view) {
		TraceLink modelElement = (TraceLink) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_TraceLink_Sources_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_TraceLink_Targets_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getArtefact_3003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTraceLink_3005OutgoingLinks(View view) {
		TraceLink modelElement = (TraceLink) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_TraceLink_Sources_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_TraceLink_Targets_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_TraceLink_Sources_4001(
			Artefact target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
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
	private static Collection getIncomingFeatureModelFacetLinks_TraceLink_Targets_4002(
			Artefact target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
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
	private static Collection getOutgoingFeatureModelFacetLinks_TraceLink_Sources_4001(
			TraceLink source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getSources().iterator(); destinations
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
	private static Collection getOutgoingFeatureModelFacetLinks_TraceLink_Targets_4002(
			TraceLink source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getTargets().iterator(); destinations
				.hasNext();) {
			Artefact destination = (Artefact) destinations.next();
			result.add(new TraceEditorLinkDescriptor(source, destination,
					TraceEditorElementTypes.TraceLinkTargets_4002,
					TraceLinkTargetsEditPart.VISUAL_ID));
		}
		return result;
	}

}
