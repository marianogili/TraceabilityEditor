package com.marianogili.traceeditor.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import com.marianogili.traceeditor.TraceEditor;
import com.marianogili.traceeditor.TraceeditorPackage;
import com.marianogili.traceeditor.diagram.edit.parts.Artefact2EditPart;
import com.marianogili.traceeditor.diagram.edit.parts.ArtefactEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.ArtefactName2EditPart;
import com.marianogili.traceeditor.diagram.edit.parts.ArtefactNameEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardDashboardCompartmentCenterEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardDashboardCompartmentLeftEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardDashboardCompartmentRightEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TraceEditorEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TransformationEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TransformationNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class TraceEditorVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "TraceEditor.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (TraceEditorEditPart.MODEL_ID.equals(view.getType())) {
				return TraceEditorEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return com.marianogili.traceeditor.diagram.part.TraceEditorVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				TraceEditorDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (TraceeditorPackage.eINSTANCE.getTraceEditor().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((TraceEditor) domainElement)) {
			return TraceEditorEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = com.marianogili.traceeditor.diagram.part.TraceEditorVisualIDRegistry
				.getModelID(containerView);
		if (!TraceEditorEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (TraceEditorEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = com.marianogili.traceeditor.diagram.part.TraceEditorVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TraceEditorEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case DashboardDashboardCompartmentLeftEditPart.VISUAL_ID:
			if (TraceeditorPackage.eINSTANCE.getArtefact().isSuperTypeOf(
					domainElement.eClass())) {
				return ArtefactEditPart.VISUAL_ID;
			}
			break;
		case DashboardDashboardCompartmentCenterEditPart.VISUAL_ID:
			if (TraceeditorPackage.eINSTANCE.getTransformation().isSuperTypeOf(
					domainElement.eClass())) {
				return TransformationEditPart.VISUAL_ID;
			}
			break;
		case DashboardDashboardCompartmentRightEditPart.VISUAL_ID:
			if (TraceeditorPackage.eINSTANCE.getArtefact().isSuperTypeOf(
					domainElement.eClass())) {
				return Artefact2EditPart.VISUAL_ID;
			}
			break;
		case TraceEditorEditPart.VISUAL_ID:
			if (TraceeditorPackage.eINSTANCE.getDashboard().isSuperTypeOf(
					domainElement.eClass())) {
				return DashboardEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = com.marianogili.traceeditor.diagram.part.TraceEditorVisualIDRegistry
				.getModelID(containerView);
		if (!TraceEditorEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (TraceEditorEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = com.marianogili.traceeditor.diagram.part.TraceEditorVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TraceEditorEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case DashboardEditPart.VISUAL_ID:
			if (DashboardDashboardCompartmentLeftEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DashboardDashboardCompartmentCenterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DashboardDashboardCompartmentRightEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArtefactEditPart.VISUAL_ID:
			if (ArtefactNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransformationEditPart.VISUAL_ID:
			if (TransformationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Artefact2EditPart.VISUAL_ID:
			if (ArtefactName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DashboardDashboardCompartmentLeftEditPart.VISUAL_ID:
			if (ArtefactEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DashboardDashboardCompartmentCenterEditPart.VISUAL_ID:
			if (TransformationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DashboardDashboardCompartmentRightEditPart.VISUAL_ID:
			if (Artefact2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceEditorEditPart.VISUAL_ID:
			if (DashboardEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(TraceEditor element) {
		return true;
	}

}
