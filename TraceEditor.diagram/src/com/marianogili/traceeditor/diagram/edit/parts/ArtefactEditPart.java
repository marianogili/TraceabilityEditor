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

import com.marianogili.traceeditor.diagram.edit.policies.ArtefactItemSemanticEditPolicy;
import com.marianogili.traceeditor.diagram.part.TraceEditorVisualIDRegistry;
import com.marianogili.traceeditor.diagram.providers.TraceEditorElementTypes;

/**
 * @generated
 */
public class ArtefactEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

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
	public ArtefactEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ArtefactItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
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
		return primaryShape = new SourceArtefactFigure();
	}

	/**
	 * @generated
	 */
	public SourceArtefactFigure getPrimaryShape() {
		return (SourceArtefactFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ArtefactNameEditPart) {
			((ArtefactNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureSourceArtefactNameFigure());
			return true;
		}
		if (childEditPart instanceof WrappingLabelEditPart) {
			((WrappingLabelEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureSourceArtefactTypeFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ArtefactNameEditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabelEditPart) {
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
				.getType(ArtefactNameEditPart.VISUAL_ID));
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
	public class SourceArtefactFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSourceArtefactNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSourceArtefactTypeFigure;
		/**
		 * @generated
		 */
		private RoundedRectangle fFigureSourceArtefactFigureInt;

		/**
		 * @generated
		 */
		public SourceArtefactFigure() {
			this.setOutline(false);
			this.setFill(false);
			this.setOpaque(false);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(30), getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(30)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureSourceArtefactFigureInt = new RoundedRectangle();

			fFigureSourceArtefactFigureInt.setCornerDimensions(new Dimension(
					getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			fFigureSourceArtefactFigureInt
					.setForegroundColor(ColorConstants.black);
			fFigureSourceArtefactFigureInt
					.setBackgroundColor(ColorConstants.lightGreen);

			this.add(fFigureSourceArtefactFigureInt);

			GridLayout layoutFFigureSourceArtefactFigureInt = new GridLayout();
			layoutFFigureSourceArtefactFigureInt.numColumns = 2;
			layoutFFigureSourceArtefactFigureInt.makeColumnsEqualWidth = false;
			fFigureSourceArtefactFigureInt
					.setLayoutManager(layoutFFigureSourceArtefactFigureInt);

			WrappingLabel sourceArtefactLabelNameFigure1 = new WrappingLabel();

			sourceArtefactLabelNameFigure1.setText("nombre:");

			sourceArtefactLabelNameFigure1
					.setFont(SOURCEARTEFACTLABELNAMEFIGURE1_FONT);

			GridData constraintSourceArtefactLabelNameFigure1 = new GridData();
			constraintSourceArtefactLabelNameFigure1.verticalAlignment = GridData.END;
			constraintSourceArtefactLabelNameFigure1.horizontalAlignment = GridData.BEGINNING;
			constraintSourceArtefactLabelNameFigure1.horizontalIndent = 0;
			constraintSourceArtefactLabelNameFigure1.horizontalSpan = 1;
			constraintSourceArtefactLabelNameFigure1.verticalSpan = 1;
			constraintSourceArtefactLabelNameFigure1.grabExcessHorizontalSpace = false;
			constraintSourceArtefactLabelNameFigure1.grabExcessVerticalSpace = false;
			fFigureSourceArtefactFigureInt.add(sourceArtefactLabelNameFigure1,
					constraintSourceArtefactLabelNameFigure1);

			fFigureSourceArtefactNameFigure = new WrappingLabel();

			fFigureSourceArtefactNameFigure.setText(" ");

			fFigureSourceArtefactNameFigure
					.setFont(FFIGURESOURCEARTEFACTNAMEFIGURE_FONT);

			GridData constraintFFigureSourceArtefactNameFigure = new GridData();
			constraintFFigureSourceArtefactNameFigure.verticalAlignment = GridData.END;
			constraintFFigureSourceArtefactNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureSourceArtefactNameFigure.horizontalIndent = 0;
			constraintFFigureSourceArtefactNameFigure.horizontalSpan = 1;
			constraintFFigureSourceArtefactNameFigure.verticalSpan = 1;
			constraintFFigureSourceArtefactNameFigure.grabExcessHorizontalSpace = false;
			constraintFFigureSourceArtefactNameFigure.grabExcessVerticalSpace = false;
			constraintFFigureSourceArtefactNameFigure.widthHint = 120;
			constraintFFigureSourceArtefactNameFigure.heightHint = 20;
			fFigureSourceArtefactFigureInt.add(fFigureSourceArtefactNameFigure,
					constraintFFigureSourceArtefactNameFigure);

			WrappingLabel sourceArtefactLabelTypeFigure1 = new WrappingLabel();

			sourceArtefactLabelTypeFigure1.setText("tipo:");

			sourceArtefactLabelTypeFigure1
					.setFont(SOURCEARTEFACTLABELTYPEFIGURE1_FONT);

			GridData constraintSourceArtefactLabelTypeFigure1 = new GridData();
			constraintSourceArtefactLabelTypeFigure1.verticalAlignment = GridData.END;
			constraintSourceArtefactLabelTypeFigure1.horizontalAlignment = GridData.BEGINNING;
			constraintSourceArtefactLabelTypeFigure1.horizontalIndent = 0;
			constraintSourceArtefactLabelTypeFigure1.horizontalSpan = 1;
			constraintSourceArtefactLabelTypeFigure1.verticalSpan = 1;
			constraintSourceArtefactLabelTypeFigure1.grabExcessHorizontalSpace = false;
			constraintSourceArtefactLabelTypeFigure1.grabExcessVerticalSpace = false;
			fFigureSourceArtefactFigureInt.add(sourceArtefactLabelTypeFigure1,
					constraintSourceArtefactLabelTypeFigure1);

			fFigureSourceArtefactTypeFigure = new WrappingLabel();

			fFigureSourceArtefactTypeFigure.setText(" ");

			fFigureSourceArtefactTypeFigure
					.setFont(FFIGURESOURCEARTEFACTTYPEFIGURE_FONT);

			GridData constraintFFigureSourceArtefactTypeFigure = new GridData();
			constraintFFigureSourceArtefactTypeFigure.verticalAlignment = GridData.END;
			constraintFFigureSourceArtefactTypeFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureSourceArtefactTypeFigure.horizontalIndent = 0;
			constraintFFigureSourceArtefactTypeFigure.horizontalSpan = 1;
			constraintFFigureSourceArtefactTypeFigure.verticalSpan = 1;
			constraintFFigureSourceArtefactTypeFigure.grabExcessHorizontalSpace = false;
			constraintFFigureSourceArtefactTypeFigure.grabExcessVerticalSpace = false;
			constraintFFigureSourceArtefactTypeFigure.widthHint = 120;
			constraintFFigureSourceArtefactTypeFigure.heightHint = 20;
			fFigureSourceArtefactFigureInt.add(fFigureSourceArtefactTypeFigure,
					constraintFFigureSourceArtefactTypeFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSourceArtefactNameFigure() {
			return fFigureSourceArtefactNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSourceArtefactTypeFigure() {
			return fFigureSourceArtefactTypeFigure;
		}

		/**
		 * @generated
		 */
		public RoundedRectangle getFigureSourceArtefactFigureInt() {
			return fFigureSourceArtefactFigureInt;
		}

	}

	/**
	 * @generated
	 */
	static final Font SOURCEARTEFACTLABELNAMEFIGURE1_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 7, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Font FFIGURESOURCEARTEFACTNAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font SOURCEARTEFACTLABELTYPEFIGURE1_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 7, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Font FFIGURESOURCEARTEFACTTYPEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

}
