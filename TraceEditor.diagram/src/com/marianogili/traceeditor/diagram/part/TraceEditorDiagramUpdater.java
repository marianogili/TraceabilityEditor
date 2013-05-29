package com.marianogili.traceeditor.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import com.marianogili.traceeditor.Artefact;
import com.marianogili.traceeditor.Dashboard;
import com.marianogili.traceeditor.TraceEditor;
import com.marianogili.traceeditor.TraceLink;
import com.marianogili.traceeditor.Transformation;
import com.marianogili.traceeditor.diagram.edit.parts.Artefact2EditPart;
import com.marianogili.traceeditor.diagram.edit.parts.ArtefactEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardSourceArtefactCompartmentEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardTargetArtefactCompartmentEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardTraceLinkCompartmentEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardTransformationCompartmentEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TraceEditorEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TraceLinkEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TransformationEditPart;

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
			return getDashboardSourceArtefactCompartment_7001SemanticChildren(view);
		case DashboardTraceLinkCompartmentEditPart.VISUAL_ID:
			return getDashboardTraceLinkCompartment_7002SemanticChildren(view);
		case DashboardTransformationCompartmentEditPart.VISUAL_ID:
			return getDashboardTransformationCompartment_7003SemanticChildren(view);
		case DashboardTargetArtefactCompartmentEditPart.VISUAL_ID:
			return getDashboardTargetArtefactCompartment_7004SemanticChildren(view);
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
	public static List<TraceEditorNodeDescriptor> getDashboardSourceArtefactCompartment_7001SemanticChildren(
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
	public static List<TraceEditorNodeDescriptor> getDashboardTraceLinkCompartment_7002SemanticChildren(
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
	public static List<TraceEditorNodeDescriptor> getDashboardTransformationCompartment_7003SemanticChildren(
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
	public static List<TraceEditorNodeDescriptor> getDashboardTargetArtefactCompartment_7004SemanticChildren(
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
		return Collections.emptyList();
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
		return Collections.emptyList();
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
	public static List<TraceEditorLinkDescriptor> getArtefact_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
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
		return Collections.emptyList();
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
	public static List<TraceEditorLinkDescriptor> getArtefact_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
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
