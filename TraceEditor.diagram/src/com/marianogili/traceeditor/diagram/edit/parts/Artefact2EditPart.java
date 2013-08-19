package com.marianogili.traceeditor.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import com.marianogili.traceeditor.diagram.edit.policies.Artefact2ItemSemanticEditPolicy;
import com.marianogili.traceeditor.diagram.part.TraceEditorVisualIDRegistry;
import com.marianogili.traceeditor.diagram.providers.TraceEditorElementTypes;

/**
 * @generated
 */
public class Artefact2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3004;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public Artefact2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Artefact2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new TargetArtefactFigure();
	}

	/**
	 * @generated
	 */
	public TargetArtefactFigure getPrimaryShape() {
		return (TargetArtefactFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ArtefactName2EditPart) {
			((ArtefactName2EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureTargetArtefactNameFigure());
			return true;
		}
		if (childEditPart instanceof WrappingLabel4EditPart) {
			((WrappingLabel4EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureTargetArtefactTypeFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ArtefactName2EditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabel4EditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated NOT
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(180, 110) {
			public PointList getPolygonPoints() {
				PointList points = new PointList(5);
				Rectangle anchRect = getHandleBounds();
				points.addPoint(anchRect.x + 30, anchRect.y + 10); // A1
				points.addPoint(anchRect.x + anchRect.width - 30,
						anchRect.y + 10); // A2
				points.addPoint(anchRect.x + anchRect.width - 30, anchRect.y
						+ anchRect.height - 10); // A3
				points.addPoint(anchRect.x + 30, anchRect.y + anchRect.height
						- 10); // A4
				points.addPoint(anchRect.x + 30, anchRect.y + 10); // A1
				return points;
			}
		};
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(TraceEditorVisualIDRegistry
				.getType(ArtefactName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(TraceEditorElementTypes.TraceLinkSources_4001);
		types.add(TraceEditorElementTypes.TraceLinkTargets_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == TraceEditorElementTypes.TraceLinkSources_4001) {
			types.add(TraceEditorElementTypes.TraceLink_3002);
			types.add(TraceEditorElementTypes.TraceLink_3005);
		} else if (relationshipType == TraceEditorElementTypes.TraceLinkTargets_4002) {
			types.add(TraceEditorElementTypes.TraceLink_3002);
			types.add(TraceEditorElementTypes.TraceLink_3005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class TargetArtefactFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTargetArtefactNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTargetArtefactTypeFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureMarginTargetArtefactRectangle;

		/**
		 * @generated
		 */
		public TargetArtefactFigure() {
			this.setOutline(false);
			this.setFill(false);
			this.setOpaque(false);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(30), getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RoundedRectangle targetArtefactFigureInt0 = new RoundedRectangle();

			targetArtefactFigureInt0.setCornerDimensions(new Dimension(
					getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			targetArtefactFigureInt0.setForegroundColor(ColorConstants.gray);
			targetArtefactFigureInt0
					.setBackgroundColor(TARGETARTEFACTFIGUREINT0_BACK);

			this.add(targetArtefactFigureInt0);

			GridLayout layoutTargetArtefactFigureInt0 = new GridLayout();
			layoutTargetArtefactFigureInt0.numColumns = 2;
			layoutTargetArtefactFigureInt0.makeColumnsEqualWidth = false;
			targetArtefactFigureInt0
					.setLayoutManager(layoutTargetArtefactFigureInt0);

			WrappingLabel targetArtefactLabelNameFigure1 = new WrappingLabel();

			targetArtefactLabelNameFigure1.setText("NOMBRE:");
			targetArtefactLabelNameFigure1
					.setForegroundColor(ColorConstants.darkGray);

			targetArtefactLabelNameFigure1
					.setFont(TARGETARTEFACTLABELNAMEFIGURE1_FONT);

			GridData constraintTargetArtefactLabelNameFigure1 = new GridData();
			constraintTargetArtefactLabelNameFigure1.verticalAlignment = GridData.END;
			constraintTargetArtefactLabelNameFigure1.horizontalAlignment = GridData.BEGINNING;
			constraintTargetArtefactLabelNameFigure1.horizontalIndent = 0;
			constraintTargetArtefactLabelNameFigure1.horizontalSpan = 1;
			constraintTargetArtefactLabelNameFigure1.verticalSpan = 1;
			constraintTargetArtefactLabelNameFigure1.grabExcessHorizontalSpace = false;
			constraintTargetArtefactLabelNameFigure1.grabExcessVerticalSpace = false;
			targetArtefactFigureInt0.add(targetArtefactLabelNameFigure1,
					constraintTargetArtefactLabelNameFigure1);

			fFigureTargetArtefactNameFigure = new WrappingLabel();

			fFigureTargetArtefactNameFigure.setText(" ");

			fFigureTargetArtefactNameFigure
					.setFont(FFIGURETARGETARTEFACTNAMEFIGURE_FONT);

			GridData constraintFFigureTargetArtefactNameFigure = new GridData();
			constraintFFigureTargetArtefactNameFigure.verticalAlignment = GridData.END;
			constraintFFigureTargetArtefactNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureTargetArtefactNameFigure.horizontalIndent = 0;
			constraintFFigureTargetArtefactNameFigure.horizontalSpan = 1;
			constraintFFigureTargetArtefactNameFigure.verticalSpan = 1;
			constraintFFigureTargetArtefactNameFigure.grabExcessHorizontalSpace = false;
			constraintFFigureTargetArtefactNameFigure.grabExcessVerticalSpace = false;
			constraintFFigureTargetArtefactNameFigure.widthHint = 120;
			constraintFFigureTargetArtefactNameFigure.heightHint = 20;
			targetArtefactFigureInt0.add(fFigureTargetArtefactNameFigure,
					constraintFFigureTargetArtefactNameFigure);

			WrappingLabel targetArtefactLabelTypeFigure1 = new WrappingLabel();

			targetArtefactLabelTypeFigure1.setText("TIPO:");
			targetArtefactLabelTypeFigure1
					.setForegroundColor(ColorConstants.darkGray);

			targetArtefactLabelTypeFigure1
					.setFont(TARGETARTEFACTLABELTYPEFIGURE1_FONT);

			GridData constraintTargetArtefactLabelTypeFigure1 = new GridData();
			constraintTargetArtefactLabelTypeFigure1.verticalAlignment = GridData.END;
			constraintTargetArtefactLabelTypeFigure1.horizontalAlignment = GridData.BEGINNING;
			constraintTargetArtefactLabelTypeFigure1.horizontalIndent = 0;
			constraintTargetArtefactLabelTypeFigure1.horizontalSpan = 1;
			constraintTargetArtefactLabelTypeFigure1.verticalSpan = 1;
			constraintTargetArtefactLabelTypeFigure1.grabExcessHorizontalSpace = false;
			constraintTargetArtefactLabelTypeFigure1.grabExcessVerticalSpace = false;
			targetArtefactFigureInt0.add(targetArtefactLabelTypeFigure1,
					constraintTargetArtefactLabelTypeFigure1);

			fFigureTargetArtefactTypeFigure = new WrappingLabel();

			fFigureTargetArtefactTypeFigure.setText(" ");

			fFigureTargetArtefactTypeFigure
					.setFont(FFIGURETARGETARTEFACTTYPEFIGURE_FONT);

			GridData constraintFFigureTargetArtefactTypeFigure = new GridData();
			constraintFFigureTargetArtefactTypeFigure.verticalAlignment = GridData.END;
			constraintFFigureTargetArtefactTypeFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureTargetArtefactTypeFigure.horizontalIndent = 0;
			constraintFFigureTargetArtefactTypeFigure.horizontalSpan = 1;
			constraintFFigureTargetArtefactTypeFigure.verticalSpan = 1;
			constraintFFigureTargetArtefactTypeFigure.grabExcessHorizontalSpace = false;
			constraintFFigureTargetArtefactTypeFigure.grabExcessVerticalSpace = false;
			constraintFFigureTargetArtefactTypeFigure.widthHint = 120;
			constraintFFigureTargetArtefactTypeFigure.heightHint = 20;
			targetArtefactFigureInt0.add(fFigureTargetArtefactTypeFigure,
					constraintFFigureTargetArtefactTypeFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTargetArtefactNameFigure() {
			return fFigureTargetArtefactNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTargetArtefactTypeFigure() {
			return fFigureTargetArtefactTypeFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureMarginTargetArtefactRectangle() {
			return fFigureMarginTargetArtefactRectangle;
		}

	}

	/**
	 * @generated
	 */
	static final Color TARGETARTEFACTFIGUREINT0_BACK = new Color(null, 255,
			255, 105);

	/**
	 * @generated
	 */
	static final Font TARGETARTEFACTLABELNAMEFIGURE1_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 7, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Font FFIGURETARGETARTEFACTNAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font TARGETARTEFACTLABELTYPEFIGURE1_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 7, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Font FFIGURETARGETARTEFACTTYPEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

}
