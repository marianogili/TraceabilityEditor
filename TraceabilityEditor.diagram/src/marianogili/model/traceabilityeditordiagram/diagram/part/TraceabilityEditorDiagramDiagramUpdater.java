package marianogili.model.traceabilityeditordiagram.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import marianogili.model.traceabilityeditordiagram.Artefact;
import marianogili.model.traceabilityeditordiagram.Dibujo;
import marianogili.model.traceabilityeditordiagram.TraceabilityEditorDiagram;
import marianogili.model.traceabilityeditordiagram.Transformation;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.Artefact2EditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.ArtefactEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.DibujoEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.TraceabilityEditorDiagramEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.TraceabilityEditorDiagramTEDCompartmentCenterEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.TraceabilityEditorDiagramTEDCompartmentLeftEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.TraceabilityEditorDiagramTEDCompartmentRightEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.TransformationEditPart;

import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TraceabilityEditorDiagramDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (TraceabilityEditorDiagramVisualIDRegistry.getVisualID(view)) {
		case TraceabilityEditorDiagramTEDCompartmentLeftEditPart.VISUAL_ID:
			return getTraceabilityEditorDiagramTEDCompartmentLeft_7001SemanticChildren(view);
		case TraceabilityEditorDiagramTEDCompartmentCenterEditPart.VISUAL_ID:
			return getTraceabilityEditorDiagramTEDCompartmentCenter_7002SemanticChildren(view);
		case TraceabilityEditorDiagramTEDCompartmentRightEditPart.VISUAL_ID:
			return getTraceabilityEditorDiagramTEDCompartmentRight_7003SemanticChildren(view);
		case DibujoEditPart.VISUAL_ID:
			return getDibujo_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTraceabilityEditorDiagramTEDCompartmentLeft_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		TraceabilityEditorDiagram modelElement = (TraceabilityEditorDiagram) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getSources().iterator(); it.hasNext();) {
			Artefact childElement = (Artefact) it.next();
			int visualID = TraceabilityEditorDiagramVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ArtefactEditPart.VISUAL_ID) {
				result.add(new TraceabilityEditorDiagramNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTraceabilityEditorDiagramTEDCompartmentCenter_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		TraceabilityEditorDiagram modelElement = (TraceabilityEditorDiagram) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getTransformations().iterator(); it
				.hasNext();) {
			Transformation childElement = (Transformation) it.next();
			int visualID = TraceabilityEditorDiagramVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == TransformationEditPart.VISUAL_ID) {
				result.add(new TraceabilityEditorDiagramNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTraceabilityEditorDiagramTEDCompartmentRight_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		TraceabilityEditorDiagram modelElement = (TraceabilityEditorDiagram) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getTargets().iterator(); it.hasNext();) {
			Artefact childElement = (Artefact) it.next();
			int visualID = TraceabilityEditorDiagramVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Artefact2EditPart.VISUAL_ID) {
				result.add(new TraceabilityEditorDiagramNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDibujo_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Dibujo modelElement = (Dibujo) view.getElement();
		List result = new LinkedList();
		{
			TraceabilityEditorDiagram childElement = modelElement
					.getEReference0();
			int visualID = TraceabilityEditorDiagramVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == TraceabilityEditorDiagramEditPart.VISUAL_ID) {
				result.add(new TraceabilityEditorDiagramNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (TraceabilityEditorDiagramVisualIDRegistry.getVisualID(view)) {
		case DibujoEditPart.VISUAL_ID:
			return getDibujo_1000ContainedLinks(view);
		case TraceabilityEditorDiagramEditPart.VISUAL_ID:
			return getTraceabilityEditorDiagram_2001ContainedLinks(view);
		case ArtefactEditPart.VISUAL_ID:
			return getArtefact_3001ContainedLinks(view);
		case TransformationEditPart.VISUAL_ID:
			return getTransformation_3002ContainedLinks(view);
		case Artefact2EditPart.VISUAL_ID:
			return getArtefact_3003ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (TraceabilityEditorDiagramVisualIDRegistry.getVisualID(view)) {
		case TraceabilityEditorDiagramEditPart.VISUAL_ID:
			return getTraceabilityEditorDiagram_2001IncomingLinks(view);
		case ArtefactEditPart.VISUAL_ID:
			return getArtefact_3001IncomingLinks(view);
		case TransformationEditPart.VISUAL_ID:
			return getTransformation_3002IncomingLinks(view);
		case Artefact2EditPart.VISUAL_ID:
			return getArtefact_3003IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (TraceabilityEditorDiagramVisualIDRegistry.getVisualID(view)) {
		case TraceabilityEditorDiagramEditPart.VISUAL_ID:
			return getTraceabilityEditorDiagram_2001OutgoingLinks(view);
		case ArtefactEditPart.VISUAL_ID:
			return getArtefact_3001OutgoingLinks(view);
		case TransformationEditPart.VISUAL_ID:
			return getTransformation_3002OutgoingLinks(view);
		case Artefact2EditPart.VISUAL_ID:
			return getArtefact_3003OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDibujo_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTraceabilityEditorDiagram_2001ContainedLinks(View view) {
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
	public static List getArtefact_3003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTraceabilityEditorDiagram_2001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getArtefact_3001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
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
	public static List getArtefact_3003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTraceabilityEditorDiagram_2001OutgoingLinks(View view) {
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
	public static List getArtefact_3003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

}
