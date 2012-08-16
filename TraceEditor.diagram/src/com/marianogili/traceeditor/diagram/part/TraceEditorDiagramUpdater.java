package com.marianogili.traceeditor.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;

import com.marianogili.traceeditor.Artefact;
import com.marianogili.traceeditor.Dashboard;
import com.marianogili.traceeditor.TraceEditor;
import com.marianogili.traceeditor.Transformation;
import com.marianogili.traceeditor.diagram.edit.parts.Artefact2EditPart;
import com.marianogili.traceeditor.diagram.edit.parts.ArtefactEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardDashboardCompartmentCenterEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardDashboardCompartmentLeftEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardDashboardCompartmentRightEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TraceEditorEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TransformationEditPart;

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
		case Artefact2EditPart.VISUAL_ID:
			return getArtefact_3003ContainedLinks(view);
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
		case Artefact2EditPart.VISUAL_ID:
			return getArtefact_3003IncomingLinks(view);
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
		case Artefact2EditPart.VISUAL_ID:
			return getArtefact_3003OutgoingLinks(view);
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
	public static List getArtefact_3003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
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
	public static List getArtefact_3003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

}
