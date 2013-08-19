package com.marianogili.traceeditor.diagram.edit.parts;

import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
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

import com.marianogili.traceeditor.diagram.edit.policies.TransformationItemSemanticEditPolicy;
import com.marianogili.traceeditor.diagram.part.TraceEditorVisualIDRegistry;
import com.marianogili.traceeditor.diagram.providers.TraceEditorElementTypes;

/**
 * @generated
 */
public class TransformationEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3003;

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
	public TransformationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						TraceEditorVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new TransformationItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
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
		return primaryShape = new TransformationFigure();
	}

	/**
	 * @generated
	 */
	public TransformationFigure getPrimaryShape() {
		return (TransformationFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TransformationNameEditPart) {
			((TransformationNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTransformationNameFigure());
			return true;
		}
		if (childEditPart instanceof TransformationTransformationCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureTransformationRectangleCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((TransformationTransformationCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TransformationNameEditPart) {
			return true;
		}
		if (childEditPart instanceof TransformationTransformationCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureTransformationRectangleCompartment();
			pane.remove(((TransformationTransformationCompartmentEditPart) childEditPart)
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
		if (editPart instanceof TransformationTransformationCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureTransformationRectangleCompartment();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(150, 100);
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
				.getType(TransformationNameEditPart.VISUAL_ID));
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
			if (type == TraceEditorElementTypes.TraceLink_3005) {
				return getChildBySemanticHint(TraceEditorVisualIDRegistry
						.getType(TransformationTransformationCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class TransformationFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureTransformationRectangleCompartment;
		/**
		 * @generated
		 */
		private RoundedRectangle fFigureTransformationFigureInt;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformationNameFigure;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureTransformationRectangleTitle;

		/**
		 * @generated
		 */
		public TransformationFigure() {
			this.setOutline(false);
			this.setFill(false);
			this.setOpaque(false);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(30), getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(10)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureTransformationFigureInt = new RoundedRectangle();

			fFigureTransformationFigureInt.setCornerDimensions(new Dimension(
					getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			fFigureTransformationFigureInt
					.setForegroundColor(ColorConstants.gray);
			fFigureTransformationFigureInt
					.setBackgroundColor(FFIGURETRANSFORMATIONFIGUREINT_BACK);

			this.add(fFigureTransformationFigureInt);

			GridLayout layoutFFigureTransformationFigureInt = new GridLayout();
			layoutFFigureTransformationFigureInt.numColumns = 1;
			layoutFFigureTransformationFigureInt.makeColumnsEqualWidth = true;
			layoutFFigureTransformationFigureInt.horizontalSpacing = 0;
			layoutFFigureTransformationFigureInt.verticalSpacing = 0;
			layoutFFigureTransformationFigureInt.marginWidth = 0;
			layoutFFigureTransformationFigureInt.marginHeight = 0;
			fFigureTransformationFigureInt
					.setLayoutManager(layoutFFigureTransformationFigureInt);

			fFigureTransformationRectangleTitle = new RectangleFigure();

			fFigureTransformationRectangleTitle.setOutline(false);
			fFigureTransformationRectangleTitle.setFill(false);
			fFigureTransformationRectangleTitle.setOpaque(false);

			GridData constraintFFigureTransformationRectangleTitle = new GridData();
			constraintFFigureTransformationRectangleTitle.verticalAlignment = GridData.CENTER;
			constraintFFigureTransformationRectangleTitle.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureTransformationRectangleTitle.horizontalIndent = 0;
			constraintFFigureTransformationRectangleTitle.horizontalSpan = 1;
			constraintFFigureTransformationRectangleTitle.verticalSpan = 1;
			constraintFFigureTransformationRectangleTitle.grabExcessHorizontalSpace = false;
			constraintFFigureTransformationRectangleTitle.grabExcessVerticalSpace = false;
			fFigureTransformationFigureInt.add(
					fFigureTransformationRectangleTitle,
					constraintFFigureTransformationRectangleTitle);

			GridLayout layoutFFigureTransformationRectangleTitle = new GridLayout();
			layoutFFigureTransformationRectangleTitle.numColumns = 2;
			layoutFFigureTransformationRectangleTitle.makeColumnsEqualWidth = false;
			layoutFFigureTransformationRectangleTitle.horizontalSpacing = 5;
			layoutFFigureTransformationRectangleTitle.verticalSpacing = 0;
			layoutFFigureTransformationRectangleTitle.marginWidth = 5;
			layoutFFigureTransformationRectangleTitle.marginHeight = 5;
			fFigureTransformationRectangleTitle
					.setLayoutManager(layoutFFigureTransformationRectangleTitle);

			WrappingLabel labelTransformationName2 = new WrappingLabel();

			labelTransformationName2.setText("TRANSFORMACIÓN:");
			labelTransformationName2
					.setForegroundColor(ColorConstants.darkGray);

			labelTransformationName2.setFont(LABELTRANSFORMATIONNAME2_FONT);

			GridData constraintLabelTransformationName2 = new GridData();
			constraintLabelTransformationName2.verticalAlignment = GridData.CENTER;
			constraintLabelTransformationName2.horizontalAlignment = GridData.BEGINNING;
			constraintLabelTransformationName2.horizontalIndent = 0;
			constraintLabelTransformationName2.horizontalSpan = 1;
			constraintLabelTransformationName2.verticalSpan = 1;
			constraintLabelTransformationName2.grabExcessHorizontalSpace = false;
			constraintLabelTransformationName2.grabExcessVerticalSpace = false;
			fFigureTransformationRectangleTitle.add(labelTransformationName2,
					constraintLabelTransformationName2);

			fFigureTransformationNameFigure = new WrappingLabel();

			fFigureTransformationNameFigure.setText("");

			fFigureTransformationNameFigure
					.setFont(FFIGURETRANSFORMATIONNAMEFIGURE_FONT);

			GridData constraintFFigureTransformationNameFigure = new GridData();
			constraintFFigureTransformationNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureTransformationNameFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureTransformationNameFigure.horizontalIndent = 0;
			constraintFFigureTransformationNameFigure.horizontalSpan = 1;
			constraintFFigureTransformationNameFigure.verticalSpan = 1;
			constraintFFigureTransformationNameFigure.grabExcessHorizontalSpace = false;
			constraintFFigureTransformationNameFigure.grabExcessVerticalSpace = false;
			constraintFFigureTransformationNameFigure.widthHint = 120;
			constraintFFigureTransformationNameFigure.heightHint = 20;
			fFigureTransformationRectangleTitle.add(
					fFigureTransformationNameFigure,
					constraintFFigureTransformationNameFigure);

			fFigureTransformationRectangleCompartment = new RectangleFigure();

			fFigureTransformationRectangleCompartment.setOutline(false);
			fFigureTransformationRectangleCompartment.setFill(false);
			fFigureTransformationRectangleCompartment.setOpaque(false);

			fFigureTransformationFigureInt
					.add(fFigureTransformationRectangleCompartment);

			FlowLayout layoutFFigureTransformationRectangleCompartment = new FlowLayout();
			layoutFFigureTransformationRectangleCompartment
					.setStretchMinorAxis(false);
			layoutFFigureTransformationRectangleCompartment
					.setMinorAlignment(FlowLayout.ALIGN_CENTER);

			layoutFFigureTransformationRectangleCompartment
					.setMajorAlignment(FlowLayout.ALIGN_CENTER);
			layoutFFigureTransformationRectangleCompartment.setMajorSpacing(0);
			layoutFFigureTransformationRectangleCompartment.setMinorSpacing(0);
			layoutFFigureTransformationRectangleCompartment.setHorizontal(true);

			fFigureTransformationRectangleCompartment
					.setLayoutManager(layoutFFigureTransformationRectangleCompartment);

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureTransformationRectangleCompartment() {
			return fFigureTransformationRectangleCompartment;
		}

		/**
		 * @generated
		 */
		public RoundedRectangle getFigureTransformationFigureInt() {
			return fFigureTransformationFigureInt;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformationNameFigure() {
			return fFigureTransformationNameFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureTransformationRectangleTitle() {
			return fFigureTransformationRectangleTitle;
		}

	}

	/**
	 * @generated
	 */
	static final Color FFIGURETRANSFORMATIONFIGUREINT_BACK = new Color(null,
			105, 255, 155);

	/**
	 * @generated
	 */
	static final Font LABELTRANSFORMATIONNAME2_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 7, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Font FFIGURETRANSFORMATIONNAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

}
