package com.marianogili.traceeditor.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

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

			case TransformationEditPart.VISUAL_ID:
				return new TransformationEditPart(view);

			case TransformationNameEditPart.VISUAL_ID:
				return new TransformationNameEditPart(view);

			case TraceLinkEditPart.VISUAL_ID:
				return new TraceLinkEditPart(view);

			case TraceLinkNameEditPart.VISUAL_ID:
				return new TraceLinkNameEditPart(view);

			case LabelEditPart.VISUAL_ID:
				return new LabelEditPart(view);

			case Artefact2EditPart.VISUAL_ID:
				return new Artefact2EditPart(view);

			case ArtefactName2EditPart.VISUAL_ID:
				return new ArtefactName2EditPart(view);

			case TraceLink2EditPart.VISUAL_ID:
				return new TraceLink2EditPart(view);

			case TraceLinkName2EditPart.VISUAL_ID:
				return new TraceLinkName2EditPart(view);

			case Label2EditPart.VISUAL_ID:
				return new Label2EditPart(view);

			case DashboardDashboardCompartmentLeftEditPart.VISUAL_ID:
				return new DashboardDashboardCompartmentLeftEditPart(view);

			case DashboardDashboardCompartmentCenterEditPart.VISUAL_ID:
				return new DashboardDashboardCompartmentCenterEditPart(view);

			case DashboardDashboardCompartmentRightEditPart.VISUAL_ID:
				return new DashboardDashboardCompartmentRightEditPart(view);

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
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapOn()
					&& getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont())
					.getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
					SWT.DEFAULT)).expand(avr * 2, 0));
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
