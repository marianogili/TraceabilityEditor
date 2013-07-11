package com.marianogili.traceeditor.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import com.marianogili.traceeditor.diagram.edit.policies.DashboardItemSemanticEditPolicy;
import com.marianogili.traceeditor.diagram.part.TraceEditorVisualIDRegistry;
import com.marianogili.traceeditor.diagram.providers.TraceEditorElementTypes;

/**
 * @generated
 */
public class DashboardEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

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
	public DashboardEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						TraceEditorVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new DashboardItemSemanticEditPolicy());
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
		return primaryShape = new DashboardFigure();
	}

	/**
	 * @generated
	 */
	public DashboardFigure getPrimaryShape() {
		return (DashboardFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DashboardSourceArtefactCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureLeftRectangleCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DashboardSourceArtefactCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof DashboardTraceLinkCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureCentralRectangle1Compartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DashboardTraceLinkCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof DashboardTargetArtefactCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureRightRectangleCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DashboardTargetArtefactCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof DashboardDashBoardTransformationCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureCentralRectangleCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DashboardDashBoardTransformationCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DashboardSourceArtefactCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureLeftRectangleCompartment();
			pane.remove(((DashboardSourceArtefactCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof DashboardTraceLinkCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureCentralRectangle1Compartment();
			pane.remove(((DashboardTraceLinkCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof DashboardTargetArtefactCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureRightRectangleCompartment();
			pane.remove(((DashboardTargetArtefactCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof DashboardDashBoardTransformationCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureCentralRectangleCompartment();
			pane.remove(((DashboardDashBoardTransformationCompartmentEditPart) childEditPart)
					.getFigure());
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
		if (editPart instanceof DashboardSourceArtefactCompartmentEditPart) {
			return getPrimaryShape().getFigureLeftRectangleCompartment();
		}
		if (editPart instanceof DashboardTraceLinkCompartmentEditPart) {
			return getPrimaryShape().getFigureCentralRectangle1Compartment();
		}
		if (editPart instanceof DashboardTargetArtefactCompartmentEditPart) {
			return getPrimaryShape().getFigureRightRectangleCompartment();
		}
		if (editPart instanceof DashboardDashBoardTransformationCompartmentEditPart) {
			return getPrimaryShape().getFigureCentralRectangleCompartment();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
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
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == TraceEditorElementTypes.Artefact_3001) {
				return getChildBySemanticHint(TraceEditorVisualIDRegistry
						.getType(DashboardSourceArtefactCompartmentEditPart.VISUAL_ID));
			}
			if (type == TraceEditorElementTypes.Artefact_3004) {
				return getChildBySemanticHint(TraceEditorVisualIDRegistry
						.getType(DashboardTargetArtefactCompartmentEditPart.VISUAL_ID));
			}
			if (type == TraceEditorElementTypes.Transformation_3003) {
				return getChildBySemanticHint(TraceEditorVisualIDRegistry
						.getType(DashboardDashBoardTransformationCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class DashboardFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureCentralRectangleCompartment;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureCentralRectangle1Compartment;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureLeftRectangleCompartment;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureRightRectangleCompartment;

		/**
		 * @generated
		 */
		public DashboardFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 4;
			layoutThis.makeColumnsEqualWidth = false;
			this.setLayoutManager(layoutThis);

			this.setForegroundColor(ColorConstants.black);
			this.setBackgroundColor(ColorConstants.lightGray);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RoundedRectangle leftRectangle0 = new RoundedRectangle();

			leftRectangle0.setCornerDimensions(new Dimension(getMapMode()
					.DPtoLP(8), getMapMode().DPtoLP(8)));
			leftRectangle0.setForegroundColor(ColorConstants.gray);
			leftRectangle0.setBackgroundColor(ColorConstants.white);
			leftRectangle0.setPreferredSize(new Dimension(getMapMode().DPtoLP(
					300), getMapMode().DPtoLP(1000)));

			this.add(leftRectangle0);

			GridLayout layoutLeftRectangle0 = new GridLayout();
			layoutLeftRectangle0.numColumns = 1;
			layoutLeftRectangle0.makeColumnsEqualWidth = true;
			leftRectangle0.setLayoutManager(layoutLeftRectangle0);

			WrappingLabel leftRectangleTitle1 = new WrappingLabel();

			leftRectangleTitle1.setText("Artefactos orígenes");

			leftRectangleTitle1.setFont(LEFTRECTANGLETITLE1_FONT);

			GridData constraintLeftRectangleTitle1 = new GridData();
			constraintLeftRectangleTitle1.verticalAlignment = GridData.CENTER;
			constraintLeftRectangleTitle1.horizontalAlignment = GridData.CENTER;
			constraintLeftRectangleTitle1.horizontalIndent = 0;
			constraintLeftRectangleTitle1.horizontalSpan = 1;
			constraintLeftRectangleTitle1.verticalSpan = 1;
			constraintLeftRectangleTitle1.grabExcessHorizontalSpace = false;
			constraintLeftRectangleTitle1.grabExcessVerticalSpace = false;
			leftRectangle0.add(leftRectangleTitle1,
					constraintLeftRectangleTitle1);

			fFigureLeftRectangleCompartment = new RectangleFigure();

			fFigureLeftRectangleCompartment
					.setBackgroundColor(ColorConstants.orange);
			fFigureLeftRectangleCompartment.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(290), getMapMode().DPtoLP(960)));

			leftRectangle0.add(fFigureLeftRectangleCompartment);

			FlowLayout layoutFFigureLeftRectangleCompartment = new FlowLayout();
			layoutFFigureLeftRectangleCompartment.setStretchMinorAxis(false);
			layoutFFigureLeftRectangleCompartment
					.setMinorAlignment(FlowLayout.ALIGN_CENTER);

			layoutFFigureLeftRectangleCompartment
					.setMajorAlignment(FlowLayout.ALIGN_CENTER);
			layoutFFigureLeftRectangleCompartment.setMajorSpacing(0);
			layoutFFigureLeftRectangleCompartment.setMinorSpacing(0);
			layoutFFigureLeftRectangleCompartment.setHorizontal(true);

			fFigureLeftRectangleCompartment
					.setLayoutManager(layoutFFigureLeftRectangleCompartment);

			RoundedRectangle centralRectangle0 = new RoundedRectangle();

			centralRectangle0.setCornerDimensions(new Dimension(getMapMode()
					.DPtoLP(8), getMapMode().DPtoLP(8)));
			centralRectangle0.setForegroundColor(ColorConstants.gray);
			centralRectangle0.setBackgroundColor(ColorConstants.white);
			centralRectangle0.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(350), getMapMode().DPtoLP(1000)));

			this.add(centralRectangle0);

			GridLayout layoutCentralRectangle0 = new GridLayout();
			layoutCentralRectangle0.numColumns = 1;
			layoutCentralRectangle0.makeColumnsEqualWidth = true;
			centralRectangle0.setLayoutManager(layoutCentralRectangle0);

			WrappingLabel centralRectangleTitle1 = new WrappingLabel();

			centralRectangleTitle1.setText("Transformaciones");

			centralRectangleTitle1.setFont(CENTRALRECTANGLETITLE1_FONT);

			GridData constraintCentralRectangleTitle1 = new GridData();
			constraintCentralRectangleTitle1.verticalAlignment = GridData.CENTER;
			constraintCentralRectangleTitle1.horizontalAlignment = GridData.CENTER;
			constraintCentralRectangleTitle1.horizontalIndent = 0;
			constraintCentralRectangleTitle1.horizontalSpan = 1;
			constraintCentralRectangleTitle1.verticalSpan = 1;
			constraintCentralRectangleTitle1.grabExcessHorizontalSpace = false;
			constraintCentralRectangleTitle1.grabExcessVerticalSpace = false;
			centralRectangle0.add(centralRectangleTitle1,
					constraintCentralRectangleTitle1);

			fFigureCentralRectangleCompartment = new RectangleFigure();

			fFigureCentralRectangleCompartment
					.setBackgroundColor(ColorConstants.orange);
			fFigureCentralRectangleCompartment.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(340), getMapMode().DPtoLP(960)));

			centralRectangle0.add(fFigureCentralRectangleCompartment);

			RoundedRectangle centralRectangle10 = new RoundedRectangle();

			centralRectangle10.setCornerDimensions(new Dimension(getMapMode()
					.DPtoLP(8), getMapMode().DPtoLP(8)));
			centralRectangle10.setForegroundColor(ColorConstants.gray);
			centralRectangle10.setBackgroundColor(ColorConstants.white);
			centralRectangle10.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(350), getMapMode().DPtoLP(1000)));

			this.add(centralRectangle10);

			GridLayout layoutCentralRectangle10 = new GridLayout();
			layoutCentralRectangle10.numColumns = 1;
			layoutCentralRectangle10.makeColumnsEqualWidth = true;
			centralRectangle10.setLayoutManager(layoutCentralRectangle10);

			WrappingLabel centralRectangle1Title1 = new WrappingLabel();

			centralRectangle1Title1.setText("Trazas");

			centralRectangle1Title1.setFont(CENTRALRECTANGLE1TITLE1_FONT);

			GridData constraintCentralRectangle1Title1 = new GridData();
			constraintCentralRectangle1Title1.verticalAlignment = GridData.CENTER;
			constraintCentralRectangle1Title1.horizontalAlignment = GridData.CENTER;
			constraintCentralRectangle1Title1.horizontalIndent = 0;
			constraintCentralRectangle1Title1.horizontalSpan = 1;
			constraintCentralRectangle1Title1.verticalSpan = 1;
			constraintCentralRectangle1Title1.grabExcessHorizontalSpace = false;
			constraintCentralRectangle1Title1.grabExcessVerticalSpace = false;
			centralRectangle10.add(centralRectangle1Title1,
					constraintCentralRectangle1Title1);

			fFigureCentralRectangle1Compartment = new RectangleFigure();

			fFigureCentralRectangle1Compartment
					.setBackgroundColor(ColorConstants.orange);
			fFigureCentralRectangle1Compartment.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(340), getMapMode().DPtoLP(960)));

			centralRectangle10.add(fFigureCentralRectangle1Compartment);

			RoundedRectangle rightRectangle0 = new RoundedRectangle();

			rightRectangle0.setCornerDimensions(new Dimension(getMapMode()
					.DPtoLP(8), getMapMode().DPtoLP(8)));
			rightRectangle0.setForegroundColor(ColorConstants.gray);
			rightRectangle0.setBackgroundColor(ColorConstants.white);
			rightRectangle0.setPreferredSize(new Dimension(getMapMode().DPtoLP(
					300), getMapMode().DPtoLP(1000)));

			this.add(rightRectangle0);

			GridLayout layoutRightRectangle0 = new GridLayout();
			layoutRightRectangle0.numColumns = 1;
			layoutRightRectangle0.makeColumnsEqualWidth = true;
			rightRectangle0.setLayoutManager(layoutRightRectangle0);

			WrappingLabel rightRectangleTitle1 = new WrappingLabel();

			rightRectangleTitle1.setText("Artefactos destinos");

			rightRectangleTitle1.setFont(RIGHTRECTANGLETITLE1_FONT);

			GridData constraintRightRectangleTitle1 = new GridData();
			constraintRightRectangleTitle1.verticalAlignment = GridData.CENTER;
			constraintRightRectangleTitle1.horizontalAlignment = GridData.CENTER;
			constraintRightRectangleTitle1.horizontalIndent = 0;
			constraintRightRectangleTitle1.horizontalSpan = 1;
			constraintRightRectangleTitle1.verticalSpan = 1;
			constraintRightRectangleTitle1.grabExcessHorizontalSpace = false;
			constraintRightRectangleTitle1.grabExcessVerticalSpace = false;
			rightRectangle0.add(rightRectangleTitle1,
					constraintRightRectangleTitle1);

			fFigureRightRectangleCompartment = new RectangleFigure();

			fFigureRightRectangleCompartment
					.setBackgroundColor(ColorConstants.orange);
			fFigureRightRectangleCompartment.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(290), getMapMode().DPtoLP(960)));

			rightRectangle0.add(fFigureRightRectangleCompartment);

			FlowLayout layoutFFigureRightRectangleCompartment = new FlowLayout();
			layoutFFigureRightRectangleCompartment.setStretchMinorAxis(false);
			layoutFFigureRightRectangleCompartment
					.setMinorAlignment(FlowLayout.ALIGN_CENTER);

			layoutFFigureRightRectangleCompartment
					.setMajorAlignment(FlowLayout.ALIGN_CENTER);
			layoutFFigureRightRectangleCompartment.setMajorSpacing(0);
			layoutFFigureRightRectangleCompartment.setMinorSpacing(0);
			layoutFFigureRightRectangleCompartment.setHorizontal(true);

			fFigureRightRectangleCompartment
					.setLayoutManager(layoutFFigureRightRectangleCompartment);

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCentralRectangleCompartment() {
			return fFigureCentralRectangleCompartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCentralRectangle1Compartment() {
			return fFigureCentralRectangle1Compartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureLeftRectangleCompartment() {
			return fFigureLeftRectangleCompartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureRightRectangleCompartment() {
			return fFigureRightRectangleCompartment;
		}

	}

	/**
	 * @generated
	 */
	static final Font LEFTRECTANGLETITLE1_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(),
			12, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font CENTRALRECTANGLETITLE1_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 12, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font CENTRALRECTANGLE1TITLE1_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 12, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font RIGHTRECTANGLETITLE1_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 12, SWT.BOLD);

}