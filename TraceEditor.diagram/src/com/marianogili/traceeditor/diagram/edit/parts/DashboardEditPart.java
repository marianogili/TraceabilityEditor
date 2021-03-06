package com.marianogili.traceeditor.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
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
	 * @generated NOT
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
					.getFigureRectangleSourcesCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DashboardSourceArtefactCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof DashboardTraceLinkCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureCentralRectangleCompartmentTraceLinks();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DashboardTraceLinkCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof DashboardTargetArtefactCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureRectangleTargetsCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DashboardTargetArtefactCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof DashboardDashBoardTransformationCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureCentralRectangleCompartmentTranformations();
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
					.getFigureRectangleSourcesCompartment();
			pane.remove(((DashboardSourceArtefactCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof DashboardTraceLinkCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureCentralRectangleCompartmentTraceLinks();
			pane.remove(((DashboardTraceLinkCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof DashboardTargetArtefactCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureRectangleTargetsCompartment();
			pane.remove(((DashboardTargetArtefactCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof DashboardDashBoardTransformationCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureCentralRectangleCompartmentTranformations();
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
			return getPrimaryShape().getFigureRectangleSourcesCompartment();
		}
		if (editPart instanceof DashboardTraceLinkCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureCentralRectangleCompartmentTraceLinks();
		}
		if (editPart instanceof DashboardTargetArtefactCompartmentEditPart) {
			return getPrimaryShape().getFigureRectangleTargetsCompartment();
		}
		if (editPart instanceof DashboardDashBoardTransformationCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureCentralRectangleCompartmentTranformations();
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
			if (type == TraceEditorElementTypes.TraceLink_3002) {
				return getChildBySemanticHint(TraceEditorVisualIDRegistry
						.getType(DashboardTraceLinkCompartmentEditPart.VISUAL_ID));
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
		private RectangleFigure fFigureCentralRectangleCompartmentTranformations;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureCentralRectangleCompartmentTraceLinks;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureRectangleSourcesCompartment;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureRectangleTargetsCompartment;

		/**
		 * @generated
		 */
		public DashboardFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 3;
			layoutThis.makeColumnsEqualWidth = false;
			layoutThis.marginWidth = 5;
			layoutThis.marginHeight = 5;
			this.setLayoutManager(layoutThis);

			this.setForegroundColor(ColorConstants.gray);
			this.setBackgroundColor(ColorConstants.gray);
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

			GridData constraintLeftRectangle0 = new GridData();
			constraintLeftRectangle0.verticalAlignment = GridData.BEGINNING;
			constraintLeftRectangle0.horizontalAlignment = GridData.CENTER;
			constraintLeftRectangle0.horizontalIndent = 0;
			constraintLeftRectangle0.horizontalSpan = 0;
			constraintLeftRectangle0.verticalSpan = 0;
			constraintLeftRectangle0.grabExcessHorizontalSpace = false;
			constraintLeftRectangle0.grabExcessVerticalSpace = false;
			this.add(leftRectangle0, constraintLeftRectangle0);

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

			RectangleFigure leftRectangleCompartment1 = new RectangleFigure();

			leftRectangleCompartment1
					.setBackgroundColor(ColorConstants.lightGray);

			GridData constraintLeftRectangleCompartment1 = new GridData();
			constraintLeftRectangleCompartment1.verticalAlignment = GridData.BEGINNING;
			constraintLeftRectangleCompartment1.horizontalAlignment = GridData.CENTER;
			constraintLeftRectangleCompartment1.horizontalIndent = 0;
			constraintLeftRectangleCompartment1.horizontalSpan = 0;
			constraintLeftRectangleCompartment1.verticalSpan = 0;
			constraintLeftRectangleCompartment1.grabExcessHorizontalSpace = false;
			constraintLeftRectangleCompartment1.grabExcessVerticalSpace = false;
			leftRectangle0.add(leftRectangleCompartment1,
					constraintLeftRectangleCompartment1);

			GridLayout layoutLeftRectangleCompartment1 = new GridLayout();
			layoutLeftRectangleCompartment1.numColumns = 1;
			layoutLeftRectangleCompartment1.makeColumnsEqualWidth = true;
			layoutLeftRectangleCompartment1.horizontalSpacing = 0;
			layoutLeftRectangleCompartment1.verticalSpacing = 0;
			layoutLeftRectangleCompartment1.marginWidth = 0;
			layoutLeftRectangleCompartment1.marginHeight = 0;
			leftRectangleCompartment1
					.setLayoutManager(layoutLeftRectangleCompartment1);

			fFigureRectangleSourcesCompartment = new RectangleFigure();

			fFigureRectangleSourcesCompartment.setOutline(false);
			fFigureRectangleSourcesCompartment.setFill(false);
			fFigureRectangleSourcesCompartment.setOpaque(false);

			GridData constraintFFigureRectangleSourcesCompartment = new GridData();
			constraintFFigureRectangleSourcesCompartment.verticalAlignment = GridData.BEGINNING;
			constraintFFigureRectangleSourcesCompartment.horizontalAlignment = GridData.CENTER;
			constraintFFigureRectangleSourcesCompartment.horizontalIndent = 0;
			constraintFFigureRectangleSourcesCompartment.horizontalSpan = 0;
			constraintFFigureRectangleSourcesCompartment.verticalSpan = 0;
			constraintFFigureRectangleSourcesCompartment.grabExcessHorizontalSpace = false;
			constraintFFigureRectangleSourcesCompartment.grabExcessVerticalSpace = false;
			leftRectangleCompartment1.add(fFigureRectangleSourcesCompartment,
					constraintFFigureRectangleSourcesCompartment);

			RectangleFigure tamaniominimo2 = new RectangleFigure();

			tamaniominimo2.setOutline(false);
			tamaniominimo2.setFill(false);
			tamaniominimo2.setOpaque(false);
			tamaniominimo2.setBackgroundColor(ColorConstants.yellow);
			tamaniominimo2.setPreferredSize(new Dimension(getMapMode().DPtoLP(
					240), getMapMode().DPtoLP(25)));

			leftRectangleCompartment1.add(tamaniominimo2);

			RoundedRectangle centralRectangle0 = new RoundedRectangle();

			centralRectangle0.setCornerDimensions(new Dimension(getMapMode()
					.DPtoLP(8), getMapMode().DPtoLP(8)));
			centralRectangle0.setForegroundColor(ColorConstants.gray);
			centralRectangle0.setBackgroundColor(ColorConstants.white);

			GridData constraintCentralRectangle0 = new GridData();
			constraintCentralRectangle0.verticalAlignment = GridData.BEGINNING;
			constraintCentralRectangle0.horizontalAlignment = GridData.CENTER;
			constraintCentralRectangle0.horizontalIndent = 0;
			constraintCentralRectangle0.horizontalSpan = 0;
			constraintCentralRectangle0.verticalSpan = 0;
			constraintCentralRectangle0.grabExcessHorizontalSpace = false;
			constraintCentralRectangle0.grabExcessVerticalSpace = false;
			this.add(centralRectangle0, constraintCentralRectangle0);

			GridLayout layoutCentralRectangle0 = new GridLayout();
			layoutCentralRectangle0.numColumns = 1;
			layoutCentralRectangle0.makeColumnsEqualWidth = true;
			centralRectangle0.setLayoutManager(layoutCentralRectangle0);

			WrappingLabel centralRectangleTitle1 = new WrappingLabel();

			centralRectangleTitle1.setText("Transformaciones y trazas");

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

			RectangleFigure centralRectangleCompartment1 = new RectangleFigure();

			centralRectangleCompartment1
					.setForegroundColor(ColorConstants.gray);
			centralRectangleCompartment1
					.setBackgroundColor(ColorConstants.lightGray);

			centralRectangle0.add(centralRectangleCompartment1);

			GridLayout layoutCentralRectangleCompartment1 = new GridLayout();
			layoutCentralRectangleCompartment1.numColumns = 2;
			layoutCentralRectangleCompartment1.makeColumnsEqualWidth = false;
			layoutCentralRectangleCompartment1.horizontalSpacing = 0;
			layoutCentralRectangleCompartment1.verticalSpacing = 0;
			layoutCentralRectangleCompartment1.marginWidth = 0;
			layoutCentralRectangleCompartment1.marginHeight = 0;
			centralRectangleCompartment1
					.setLayoutManager(layoutCentralRectangleCompartment1);

			fFigureCentralRectangleCompartmentTranformations = new RectangleFigure();

			fFigureCentralRectangleCompartmentTranformations.setOutline(false);
			fFigureCentralRectangleCompartmentTranformations.setFill(false);
			fFigureCentralRectangleCompartmentTranformations.setOpaque(false);

			GridData constraintFFigureCentralRectangleCompartmentTranformations = new GridData();
			constraintFFigureCentralRectangleCompartmentTranformations.verticalAlignment = GridData.BEGINNING;
			constraintFFigureCentralRectangleCompartmentTranformations.horizontalAlignment = GridData.CENTER;
			constraintFFigureCentralRectangleCompartmentTranformations.horizontalIndent = 0;
			constraintFFigureCentralRectangleCompartmentTranformations.horizontalSpan = 0;
			constraintFFigureCentralRectangleCompartmentTranformations.verticalSpan = 0;
			constraintFFigureCentralRectangleCompartmentTranformations.grabExcessHorizontalSpace = false;
			constraintFFigureCentralRectangleCompartmentTranformations.grabExcessVerticalSpace = false;
			centralRectangleCompartment1.add(
					fFigureCentralRectangleCompartmentTranformations,
					constraintFFigureCentralRectangleCompartmentTranformations);

			fFigureCentralRectangleCompartmentTraceLinks = new RectangleFigure();

			fFigureCentralRectangleCompartmentTraceLinks.setOutline(false);
			fFigureCentralRectangleCompartmentTraceLinks.setFill(false);
			fFigureCentralRectangleCompartmentTraceLinks.setOpaque(false);

			GridData constraintFFigureCentralRectangleCompartmentTraceLinks = new GridData();
			constraintFFigureCentralRectangleCompartmentTraceLinks.verticalAlignment = GridData.BEGINNING;
			constraintFFigureCentralRectangleCompartmentTraceLinks.horizontalAlignment = GridData.CENTER;
			constraintFFigureCentralRectangleCompartmentTraceLinks.horizontalIndent = 0;
			constraintFFigureCentralRectangleCompartmentTraceLinks.horizontalSpan = 0;
			constraintFFigureCentralRectangleCompartmentTraceLinks.verticalSpan = 0;
			constraintFFigureCentralRectangleCompartmentTraceLinks.grabExcessHorizontalSpace = false;
			constraintFFigureCentralRectangleCompartmentTraceLinks.grabExcessVerticalSpace = false;
			centralRectangleCompartment1.add(
					fFigureCentralRectangleCompartmentTraceLinks,
					constraintFFigureCentralRectangleCompartmentTraceLinks);

			RectangleFigure tamaniominimo212 = new RectangleFigure();

			tamaniominimo212.setOutline(false);
			tamaniominimo212.setFill(false);
			tamaniominimo212.setOpaque(false);
			tamaniominimo212.setBackgroundColor(ColorConstants.yellow);
			tamaniominimo212.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(265), getMapMode().DPtoLP(25)));

			centralRectangleCompartment1.add(tamaniominimo212);

			RectangleFigure tamaniominimo222 = new RectangleFigure();

			tamaniominimo222.setOutline(false);
			tamaniominimo222.setFill(false);
			tamaniominimo222.setOpaque(false);
			tamaniominimo222.setBackgroundColor(ColorConstants.yellow);
			tamaniominimo222.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(190), getMapMode().DPtoLP(25)));

			centralRectangleCompartment1.add(tamaniominimo222);

			RoundedRectangle rightRectangle0 = new RoundedRectangle();

			rightRectangle0.setCornerDimensions(new Dimension(getMapMode()
					.DPtoLP(8), getMapMode().DPtoLP(8)));
			rightRectangle0.setForegroundColor(ColorConstants.gray);
			rightRectangle0.setBackgroundColor(ColorConstants.white);

			GridData constraintRightRectangle0 = new GridData();
			constraintRightRectangle0.verticalAlignment = GridData.BEGINNING;
			constraintRightRectangle0.horizontalAlignment = GridData.CENTER;
			constraintRightRectangle0.horizontalIndent = 0;
			constraintRightRectangle0.horizontalSpan = 0;
			constraintRightRectangle0.verticalSpan = 0;
			constraintRightRectangle0.grabExcessHorizontalSpace = false;
			constraintRightRectangle0.grabExcessVerticalSpace = false;
			this.add(rightRectangle0, constraintRightRectangle0);

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

			RectangleFigure rightRectangleCompartment1 = new RectangleFigure();

			rightRectangleCompartment1
					.setBackgroundColor(ColorConstants.lightGray);

			GridData constraintRightRectangleCompartment1 = new GridData();
			constraintRightRectangleCompartment1.verticalAlignment = GridData.BEGINNING;
			constraintRightRectangleCompartment1.horizontalAlignment = GridData.CENTER;
			constraintRightRectangleCompartment1.horizontalIndent = 0;
			constraintRightRectangleCompartment1.horizontalSpan = 0;
			constraintRightRectangleCompartment1.verticalSpan = 0;
			constraintRightRectangleCompartment1.grabExcessHorizontalSpace = false;
			constraintRightRectangleCompartment1.grabExcessVerticalSpace = false;
			rightRectangle0.add(rightRectangleCompartment1,
					constraintRightRectangleCompartment1);

			GridLayout layoutRightRectangleCompartment1 = new GridLayout();
			layoutRightRectangleCompartment1.numColumns = 1;
			layoutRightRectangleCompartment1.makeColumnsEqualWidth = true;
			layoutRightRectangleCompartment1.horizontalSpacing = 0;
			layoutRightRectangleCompartment1.verticalSpacing = 0;
			layoutRightRectangleCompartment1.marginWidth = 0;
			layoutRightRectangleCompartment1.marginHeight = 0;
			rightRectangleCompartment1
					.setLayoutManager(layoutRightRectangleCompartment1);

			fFigureRectangleTargetsCompartment = new RectangleFigure();

			fFigureRectangleTargetsCompartment.setOutline(false);
			fFigureRectangleTargetsCompartment.setFill(false);
			fFigureRectangleTargetsCompartment.setOpaque(false);

			GridData constraintFFigureRectangleTargetsCompartment = new GridData();
			constraintFFigureRectangleTargetsCompartment.verticalAlignment = GridData.BEGINNING;
			constraintFFigureRectangleTargetsCompartment.horizontalAlignment = GridData.CENTER;
			constraintFFigureRectangleTargetsCompartment.horizontalIndent = 0;
			constraintFFigureRectangleTargetsCompartment.horizontalSpan = 0;
			constraintFFigureRectangleTargetsCompartment.verticalSpan = 0;
			constraintFFigureRectangleTargetsCompartment.grabExcessHorizontalSpace = false;
			constraintFFigureRectangleTargetsCompartment.grabExcessVerticalSpace = false;
			rightRectangleCompartment1.add(fFigureRectangleTargetsCompartment,
					constraintFFigureRectangleTargetsCompartment);

			RectangleFigure tamaniominimo32 = new RectangleFigure();

			tamaniominimo32.setOutline(false);
			tamaniominimo32.setFill(false);
			tamaniominimo32.setOpaque(false);
			tamaniominimo32.setBackgroundColor(ColorConstants.yellow);
			tamaniominimo32.setPreferredSize(new Dimension(getMapMode().DPtoLP(
					240), getMapMode().DPtoLP(25)));

			rightRectangleCompartment1.add(tamaniominimo32);

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCentralRectangleCompartmentTranformations() {
			return fFigureCentralRectangleCompartmentTranformations;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCentralRectangleCompartmentTraceLinks() {
			return fFigureCentralRectangleCompartmentTraceLinks;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureRectangleSourcesCompartment() {
			return fFigureRectangleSourcesCompartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureRectangleTargetsCompartment() {
			return fFigureRectangleTargetsCompartment;
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
	static final Font RIGHTRECTANGLETITLE1_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 12, SWT.BOLD);

}
