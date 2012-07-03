package marianogili.model.traceabilityeditordiagram.diagram.part;

import marianogili.model.traceabilityeditordiagram.Dibujo;
import marianogili.model.traceabilityeditordiagram.TraceabilityeditordiagramPackage;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.Artefact2EditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.ArtefactEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.ArtefactName2EditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.ArtefactNameEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.DibujoEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.TraceabilityEditorDiagramEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.TraceabilityEditorDiagramTEDCompartmentCenterEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.TraceabilityEditorDiagramTEDCompartmentLeftEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.TraceabilityEditorDiagramTEDCompartmentRightEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.TransformationEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.TransformationNameEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class TraceabilityEditorDiagramVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "TraceabilityEditor.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DibujoEditPart.MODEL_ID.equals(view.getType())) {
				return DibujoEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return marianogili.model.traceabilityeditordiagram.diagram.part.TraceabilityEditorDiagramVisualIDRegistry
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
				TraceabilityEditorDiagramDiagramEditorPlugin.getInstance()
						.logError(
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
		if (TraceabilityeditordiagramPackage.eINSTANCE.getDibujo()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Dibujo) domainElement)) {
			return DibujoEditPart.VISUAL_ID;
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
		String containerModelID = marianogili.model.traceabilityeditordiagram.diagram.part.TraceabilityEditorDiagramVisualIDRegistry
				.getModelID(containerView);
		if (!DibujoEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (DibujoEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = marianogili.model.traceabilityeditordiagram.diagram.part.TraceabilityEditorDiagramVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DibujoEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case TraceabilityEditorDiagramTEDCompartmentLeftEditPart.VISUAL_ID:
			if (TraceabilityeditordiagramPackage.eINSTANCE.getArtefact()
					.isSuperTypeOf(domainElement.eClass())) {
				return ArtefactEditPart.VISUAL_ID;
			}
			break;
		case TraceabilityEditorDiagramTEDCompartmentCenterEditPart.VISUAL_ID:
			if (TraceabilityeditordiagramPackage.eINSTANCE.getTransformation()
					.isSuperTypeOf(domainElement.eClass())) {
				return TransformationEditPart.VISUAL_ID;
			}
			break;
		case TraceabilityEditorDiagramTEDCompartmentRightEditPart.VISUAL_ID:
			if (TraceabilityeditordiagramPackage.eINSTANCE.getArtefact()
					.isSuperTypeOf(domainElement.eClass())) {
				return Artefact2EditPart.VISUAL_ID;
			}
			break;
		case DibujoEditPart.VISUAL_ID:
			if (TraceabilityeditordiagramPackage.eINSTANCE
					.getTraceabilityEditorDiagram().isSuperTypeOf(
							domainElement.eClass())) {
				return TraceabilityEditorDiagramEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = marianogili.model.traceabilityeditordiagram.diagram.part.TraceabilityEditorDiagramVisualIDRegistry
				.getModelID(containerView);
		if (!DibujoEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (DibujoEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = marianogili.model.traceabilityeditordiagram.diagram.part.TraceabilityEditorDiagramVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DibujoEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case TraceabilityEditorDiagramEditPart.VISUAL_ID:
			if (TraceabilityEditorDiagramTEDCompartmentLeftEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TraceabilityEditorDiagramTEDCompartmentCenterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TraceabilityEditorDiagramTEDCompartmentRightEditPart.VISUAL_ID == nodeVisualID) {
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
		case TraceabilityEditorDiagramTEDCompartmentLeftEditPart.VISUAL_ID:
			if (ArtefactEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityEditorDiagramTEDCompartmentCenterEditPart.VISUAL_ID:
			if (TransformationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityEditorDiagramTEDCompartmentRightEditPart.VISUAL_ID:
			if (Artefact2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DibujoEditPart.VISUAL_ID:
			if (TraceabilityEditorDiagramEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(Dibujo element) {
		return true;
	}

}
