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

import com.marianogili.traceeditor.diagram.edit.policies.TraceLink2ItemSemanticEditPolicy;
import com.marianogili.traceeditor.diagram.part.TraceEditorVisualIDRegistry;
import com.marianogili.traceeditor.diagram.providers.TraceEditorElementTypes;

/**
 * @generated
 */
public class TraceLink2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3005;

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
	public TraceLink2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new TraceLink2ItemSemanticEditPolicy());
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
		return primaryShape = new TraceLinkFigure();
	}

	/**
	 * @generated
	 */
	public TraceLinkFigure getPrimaryShape() {
		return (TraceLinkFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TraceLinkName2EditPart) {
			((TraceLinkName2EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureTraceLinkNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TraceLinkName2EditPart) {
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
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40) {
			public PointList getPolygonPoints() {
				PointList points = new PointList(5);
				Rectangle anchRect = getHandleBounds();
				points.addPoint(anchRect.x + 10, anchRect.y + 10); // A1
				points.addPoint(anchRect.x + anchRect.width - 10, anchRect.y + 10); // A2
				points.addPoint(anchRect.x + anchRect.width - 10, anchRect.y + anchRect.height - 10); // A3
				points.addPoint(anchRect.x + 10, anchRect.y + anchRect.height - 10); // A4
				points.addPoint(anchRect.x + 10, anchRect.y + 10); // A1
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
				.getType(TraceLinkName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(TraceEditorElementTypes.TraceLinkSources_4001);
		types.add(TraceEditorElementTypes.TraceLinkTargets_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ArtefactEditPart) {
			types.add(TraceEditorElementTypes.TraceLinkSources_4001);
		}
		if (targetEditPart instanceof Artefact2EditPart) {
			types.add(TraceEditorElementTypes.TraceLinkSources_4001);
		}
		if (targetEditPart instanceof ArtefactEditPart) {
			types.add(TraceEditorElementTypes.TraceLinkTargets_4002);
		}
		if (targetEditPart instanceof Artefact2EditPart) {
			types.add(TraceEditorElementTypes.TraceLinkTargets_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == TraceEditorElementTypes.TraceLinkSources_4001) {
			types.add(TraceEditorElementTypes.Artefact_3001);
			types.add(TraceEditorElementTypes.Artefact_3004);
		} else if (relationshipType == TraceEditorElementTypes.TraceLinkTargets_4002) {
			types.add(TraceEditorElementTypes.Artefact_3001);
			types.add(TraceEditorElementTypes.Artefact_3004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class TraceLinkFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTraceLinkNameFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureMarginTraceLink;

		/**
		 * @generated
		 */
		public TraceLinkFigure() {
			this.setOutline(false);
			this.setFill(false);
			this.setOpaque(false);
			this.setBackgroundColor(ColorConstants.lightBlue);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(10), getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(10)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RoundedRectangle traceLinkFigureInt0 = new RoundedRectangle();

			traceLinkFigureInt0.setCornerDimensions(new Dimension(getMapMode()
					.DPtoLP(8), getMapMode().DPtoLP(8)));
			traceLinkFigureInt0.setForegroundColor(ColorConstants.black);
			traceLinkFigureInt0.setBackgroundColor(ColorConstants.lightBlue);

			this.add(traceLinkFigureInt0);

			GridLayout layoutTraceLinkFigureInt0 = new GridLayout();
			layoutTraceLinkFigureInt0.numColumns = 2;
			layoutTraceLinkFigureInt0.makeColumnsEqualWidth = false;
			traceLinkFigureInt0.setLayoutManager(layoutTraceLinkFigureInt0);

			WrappingLabel labelTraceLinkName1 = new WrappingLabel();

			labelTraceLinkName1.setText("traza:");

			labelTraceLinkName1.setFont(LABELTRACELINKNAME1_FONT);

			GridData constraintLabelTraceLinkName1 = new GridData();
			constraintLabelTraceLinkName1.verticalAlignment = GridData.END;
			constraintLabelTraceLinkName1.horizontalAlignment = GridData.BEGINNING;
			constraintLabelTraceLinkName1.horizontalIndent = 0;
			constraintLabelTraceLinkName1.horizontalSpan = 1;
			constraintLabelTraceLinkName1.verticalSpan = 1;
			constraintLabelTraceLinkName1.grabExcessHorizontalSpace = false;
			constraintLabelTraceLinkName1.grabExcessVerticalSpace = false;
			traceLinkFigureInt0.add(labelTraceLinkName1,
					constraintLabelTraceLinkName1);

			fFigureTraceLinkNameFigure = new WrappingLabel();

			fFigureTraceLinkNameFigure.setText("<...>");

			fFigureTraceLinkNameFigure.setFont(FFIGURETRACELINKNAMEFIGURE_FONT);

			GridData constraintFFigureTraceLinkNameFigure = new GridData();
			constraintFFigureTraceLinkNameFigure.verticalAlignment = GridData.END;
			constraintFFigureTraceLinkNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureTraceLinkNameFigure.horizontalIndent = 0;
			constraintFFigureTraceLinkNameFigure.horizontalSpan = 1;
			constraintFFigureTraceLinkNameFigure.verticalSpan = 1;
			constraintFFigureTraceLinkNameFigure.grabExcessHorizontalSpace = false;
			constraintFFigureTraceLinkNameFigure.grabExcessVerticalSpace = false;
			traceLinkFigureInt0.add(fFigureTraceLinkNameFigure,
					constraintFFigureTraceLinkNameFigure);

			WrappingLabel labelTraceLinkType1 = new WrappingLabel();

			labelTraceLinkType1.setText("tipo:");

			labelTraceLinkType1.setFont(LABELTRACELINKTYPE1_FONT);

			GridData constraintLabelTraceLinkType1 = new GridData();
			constraintLabelTraceLinkType1.verticalAlignment = GridData.END;
			constraintLabelTraceLinkType1.horizontalAlignment = GridData.BEGINNING;
			constraintLabelTraceLinkType1.horizontalIndent = 0;
			constraintLabelTraceLinkType1.horizontalSpan = 1;
			constraintLabelTraceLinkType1.verticalSpan = 1;
			constraintLabelTraceLinkType1.grabExcessHorizontalSpace = false;
			constraintLabelTraceLinkType1.grabExcessVerticalSpace = false;
			traceLinkFigureInt0.add(labelTraceLinkType1,
					constraintLabelTraceLinkType1);

			WrappingLabel traceLinkTypeFigure1 = new WrappingLabel();

			traceLinkTypeFigure1.setText("");

			traceLinkTypeFigure1.setFont(TRACELINKTYPEFIGURE1_FONT);

			GridData constraintTraceLinkTypeFigure1 = new GridData();
			constraintTraceLinkTypeFigure1.verticalAlignment = GridData.END;
			constraintTraceLinkTypeFigure1.horizontalAlignment = GridData.CENTER;
			constraintTraceLinkTypeFigure1.horizontalIndent = 0;
			constraintTraceLinkTypeFigure1.horizontalSpan = 1;
			constraintTraceLinkTypeFigure1.verticalSpan = 1;
			constraintTraceLinkTypeFigure1.grabExcessHorizontalSpace = false;
			constraintTraceLinkTypeFigure1.grabExcessVerticalSpace = false;
			traceLinkFigureInt0.add(traceLinkTypeFigure1,
					constraintTraceLinkTypeFigure1);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTraceLinkNameFigure() {
			return fFigureTraceLinkNameFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureMarginTraceLink() {
			return fFigureMarginTraceLink;
		}

	}

	/**
	 * @generated
	 */
	static final Font LABELTRACELINKNAME1_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 7,
			SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Font FFIGURETRACELINKNAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font LABELTRACELINKTYPE1_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 7,
			SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Font TRACELINKTYPEFIGURE1_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

}
