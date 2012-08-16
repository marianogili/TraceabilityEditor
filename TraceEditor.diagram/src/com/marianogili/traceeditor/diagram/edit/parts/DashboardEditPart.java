package com.marianogili.traceeditor.diagram.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

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
				new CreationEditPolicy());
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

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
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
		DashboardFigure figure = new DashboardFigure();
		return primaryShape = figure;
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
		if (childEditPart instanceof DashboardDashboardCompartmentLeftEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureDashboardCompartmentLeft();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((DashboardDashboardCompartmentLeftEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof DashboardDashboardCompartmentCenterEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureDashboardCompartmentCenter();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((DashboardDashboardCompartmentCenterEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof DashboardDashboardCompartmentRightEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureDashboardCompartmentRight();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((DashboardDashboardCompartmentRightEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DashboardDashboardCompartmentLeftEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureDashboardCompartmentLeft();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((DashboardDashboardCompartmentLeftEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof DashboardDashboardCompartmentCenterEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureDashboardCompartmentCenter();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((DashboardDashboardCompartmentCenterEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof DashboardDashboardCompartmentRightEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureDashboardCompartmentRight();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((DashboardDashboardCompartmentRightEditPart) childEditPart)
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
		if (editPart instanceof DashboardDashboardCompartmentLeftEditPart) {
			return getPrimaryShape().getFigureDashboardCompartmentLeft();
		}
		if (editPart instanceof DashboardDashboardCompartmentCenterEditPart) {
			return getPrimaryShape().getFigureDashboardCompartmentCenter();
		}
		if (editPart instanceof DashboardDashboardCompartmentRightEditPart) {
			return getPrimaryShape().getFigureDashboardCompartmentRight();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(800, 500);
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
						.getType(DashboardDashboardCompartmentLeftEditPart.VISUAL_ID));
			}
			if (type == TraceEditorElementTypes.Transformation_3002) {
				return getChildBySemanticHint(TraceEditorVisualIDRegistry
						.getType(DashboardDashboardCompartmentCenterEditPart.VISUAL_ID));
			}
			if (type == TraceEditorElementTypes.Artefact_3003) {
				return getChildBySemanticHint(TraceEditorVisualIDRegistry
						.getType(DashboardDashboardCompartmentRightEditPart.VISUAL_ID));
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
		private RectangleFigure fFigureDashboardCompartmentLeft;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureDashboardCompartmentCenter;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureDashboardCompartmentRight;

		/**
		 * @generated
		 */
		public DashboardFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(0);
			layoutThis.setMinorSpacing(0);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			this.setLineWidth(1);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(800),
					getMapMode().DPtoLP(500)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureDashboardCompartmentLeft = new RectangleFigure();
			fFigureDashboardCompartmentLeft.setLineWidth(1);
			fFigureDashboardCompartmentLeft.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(200), getMapMode().DPtoLP(500)));

			this.add(fFigureDashboardCompartmentLeft);

			ToolbarLayout layoutFFigureDashboardCompartmentLeft = new ToolbarLayout();
			layoutFFigureDashboardCompartmentLeft.setStretchMinorAxis(false);
			layoutFFigureDashboardCompartmentLeft
					.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutFFigureDashboardCompartmentLeft.setSpacing(0);
			layoutFFigureDashboardCompartmentLeft.setVertical(true);

			fFigureDashboardCompartmentLeft
					.setLayoutManager(layoutFFigureDashboardCompartmentLeft);

			fFigureDashboardCompartmentCenter = new RectangleFigure();
			fFigureDashboardCompartmentCenter.setLineWidth(1);
			fFigureDashboardCompartmentCenter.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(400), getMapMode().DPtoLP(500)));

			this.add(fFigureDashboardCompartmentCenter, BorderLayout.CENTER);

			fFigureDashboardCompartmentRight = new RectangleFigure();
			fFigureDashboardCompartmentRight.setLineWidth(1);
			fFigureDashboardCompartmentRight.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(200), getMapMode().DPtoLP(500)));

			this.add(fFigureDashboardCompartmentRight);

			ToolbarLayout layoutFFigureDashboardCompartmentRight = new ToolbarLayout();
			layoutFFigureDashboardCompartmentRight.setStretchMinorAxis(false);
			layoutFFigureDashboardCompartmentRight
					.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutFFigureDashboardCompartmentRight.setSpacing(0);
			layoutFFigureDashboardCompartmentRight.setVertical(true);

			fFigureDashboardCompartmentRight
					.setLayoutManager(layoutFFigureDashboardCompartmentRight);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureDashboardCompartmentLeft() {
			return fFigureDashboardCompartmentLeft;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureDashboardCompartmentCenter() {
			return fFigureDashboardCompartmentCenter;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureDashboardCompartmentRight() {
			return fFigureDashboardCompartmentRight;
		}

	}

}
