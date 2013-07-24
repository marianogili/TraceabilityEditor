package com.marianogili.traceeditor.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import com.marianogili.traceeditor.diagram.part.TraceEditorVisualIDRegistry;

/**
 * @generated
 */
public class TraceEditorEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (TraceEditorVisualIDRegistry.getVisualID(view)) {

			case TraceEditorEditPart.VISUAL_ID:
				return new TraceEditorEditPart(view);

			case DashboardEditPart.VISUAL_ID:
				return new DashboardEditPart(view);

			case ArtefactEditPart.VISUAL_ID:
				return new ArtefactEditPart(view);

			case ArtefactNameEditPart.VISUAL_ID:
				return new ArtefactNameEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case TraceLinkEditPart.VISUAL_ID:
				return new TraceLinkEditPart(view);

			case TraceLinkNameEditPart.VISUAL_ID:
				return new TraceLinkNameEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case TransformationEditPart.VISUAL_ID:
				return new TransformationEditPart(view);

			case TransformationNameEditPart.VISUAL_ID:
				return new TransformationNameEditPart(view);

			case TraceLink2EditPart.VISUAL_ID:
				return new TraceLink2EditPart(view);

			case TraceLinkName2EditPart.VISUAL_ID:
				return new TraceLinkName2EditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case Artefact2EditPart.VISUAL_ID:
				return new Artefact2EditPart(view);

			case ArtefactName2EditPart.VISUAL_ID:
				return new ArtefactName2EditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case DashboardSourceArtefactCompartmentEditPart.VISUAL_ID:
				return new DashboardSourceArtefactCompartmentEditPart(view);

			case DashboardTraceLinkCompartmentEditPart.VISUAL_ID:
				return new DashboardTraceLinkCompartmentEditPart(view);

			case DashboardTargetArtefactCompartmentEditPart.VISUAL_ID:
				return new DashboardTargetArtefactCompartmentEditPart(view);

			case DashboardDashBoardTransformationCompartmentEditPart.VISUAL_ID:
				return new DashboardDashBoardTransformationCompartmentEditPart(
						view);

			case TransformationTransformationCompartmentEditPart.VISUAL_ID:
				return new TransformationTransformationCompartmentEditPart(view);

			case TraceLinkSourcesEditPart.VISUAL_ID:
				return new TraceLinkSourcesEditPart(view);

			case TraceLinkTargetsEditPart.VISUAL_ID:
				return new TraceLinkTargetsEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
