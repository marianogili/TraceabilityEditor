package marianogili.model.traceabilityeditordiagram.diagram.edit.parts;

import marianogili.model.traceabilityeditordiagram.diagram.edit.policies.TraceabilityEditorDiagramItemSemanticEditPolicy;
import marianogili.model.traceabilityeditordiagram.diagram.part.TraceabilityEditorDiagramVisualIDRegistry;
import marianogili.model.traceabilityeditordiagram.diagram.providers.TraceabilityEditorDiagramElementTypes;

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

/**
 * @generated
 */
public class TraceabilityEditorDiagramEditPart extends ShapeNodeEditPart {

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
	public TraceabilityEditorDiagramEditPart(View view) {
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
				new TraceabilityEditorDiagramItemSemanticEditPolicy());
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
		TraceabilityEditorDiagramFigure figure = new TraceabilityEditorDiagramFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public TraceabilityEditorDiagramFigure getPrimaryShape() {
		return (TraceabilityEditorDiagramFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TraceabilityEditorDiagramTEDCompartmentLeftEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureTEDCompartmentLeftFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((TraceabilityEditorDiagramTEDCompartmentLeftEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof TraceabilityEditorDiagramTEDCompartmentCenterEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureTEDCompartmentCenterFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((TraceabilityEditorDiagramTEDCompartmentCenterEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof TraceabilityEditorDiagramTEDCompartmentRightEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureTEDCompartmentRightFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((TraceabilityEditorDiagramTEDCompartmentRightEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TraceabilityEditorDiagramTEDCompartmentLeftEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureTEDCompartmentLeftFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((TraceabilityEditorDiagramTEDCompartmentLeftEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof TraceabilityEditorDiagramTEDCompartmentCenterEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureTEDCompartmentCenterFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((TraceabilityEditorDiagramTEDCompartmentCenterEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof TraceabilityEditorDiagramTEDCompartmentRightEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureTEDCompartmentRightFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((TraceabilityEditorDiagramTEDCompartmentRightEditPart) childEditPart)
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
		if (editPart instanceof TraceabilityEditorDiagramTEDCompartmentLeftEditPart) {
			return getPrimaryShape().getFigureTEDCompartmentLeftFigure();
		}
		if (editPart instanceof TraceabilityEditorDiagramTEDCompartmentCenterEditPart) {
			return getPrimaryShape().getFigureTEDCompartmentCenterFigure();
		}
		if (editPart instanceof TraceabilityEditorDiagramTEDCompartmentRightEditPart) {
			return getPrimaryShape().getFigureTEDCompartmentRightFigure();
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
			if (type == TraceabilityEditorDiagramElementTypes.Artefact_3001) {
				return getChildBySemanticHint(TraceabilityEditorDiagramVisualIDRegistry
						.getType(TraceabilityEditorDiagramTEDCompartmentLeftEditPart.VISUAL_ID));
			}
			if (type == TraceabilityEditorDiagramElementTypes.Transformation_3002) {
				return getChildBySemanticHint(TraceabilityEditorDiagramVisualIDRegistry
						.getType(TraceabilityEditorDiagramTEDCompartmentCenterEditPart.VISUAL_ID));
			}
			if (type == TraceabilityEditorDiagramElementTypes.Artefact_3003) {
				return getChildBySemanticHint(TraceabilityEditorDiagramVisualIDRegistry
						.getType(TraceabilityEditorDiagramTEDCompartmentRightEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class TraceabilityEditorDiagramFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureTEDCompartmentLeftFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureTEDCompartmentCenterFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureTEDCompartmentRightFigure;

		/**
		 * @generated
		 */
		public TraceabilityEditorDiagramFigure() {

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

			fFigureTEDCompartmentLeftFigure = new RectangleFigure();
			fFigureTEDCompartmentLeftFigure.setLineWidth(1);
			fFigureTEDCompartmentLeftFigure.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(200), getMapMode().DPtoLP(500)));

			this.add(fFigureTEDCompartmentLeftFigure);

			ToolbarLayout layoutFFigureTEDCompartmentLeftFigure = new ToolbarLayout();
			layoutFFigureTEDCompartmentLeftFigure.setStretchMinorAxis(false);
			layoutFFigureTEDCompartmentLeftFigure
					.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutFFigureTEDCompartmentLeftFigure.setSpacing(0);
			layoutFFigureTEDCompartmentLeftFigure.setVertical(true);

			fFigureTEDCompartmentLeftFigure
					.setLayoutManager(layoutFFigureTEDCompartmentLeftFigure);

			fFigureTEDCompartmentCenterFigure = new RectangleFigure();
			fFigureTEDCompartmentCenterFigure.setLineWidth(1);
			fFigureTEDCompartmentCenterFigure.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(400), getMapMode().DPtoLP(500)));

			this.add(fFigureTEDCompartmentCenterFigure, BorderLayout.CENTER);

			fFigureTEDCompartmentRightFigure = new RectangleFigure();
			fFigureTEDCompartmentRightFigure.setLineWidth(1);
			fFigureTEDCompartmentRightFigure.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(200), getMapMode().DPtoLP(500)));

			this.add(fFigureTEDCompartmentRightFigure, BorderLayout.CENTER);

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
		public RectangleFigure getFigureTEDCompartmentLeftFigure() {
			return fFigureTEDCompartmentLeftFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureTEDCompartmentCenterFigure() {
			return fFigureTEDCompartmentCenterFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureTEDCompartmentRightFigure() {
			return fFigureTEDCompartmentRightFigure;
		}

	}

}
