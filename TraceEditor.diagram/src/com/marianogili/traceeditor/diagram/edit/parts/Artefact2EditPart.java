package com.marianogili.traceeditor.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
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
import org.eclipse.swt.graphics.Color;

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
	public Artefact2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Artefact2ItemSemanticEditPolicy());
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
		ArtefactFigure figure = new ArtefactFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ArtefactFigure getPrimaryShape() {
		return (ArtefactFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ArtefactName2EditPart) {
			((ArtefactName2EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureArtefactNameFigure());
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
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(100, 75);
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
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(TraceEditorElementTypes.TraceLinkSources_4001);
		types.add(TraceEditorElementTypes.TraceLinkTargets_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == TraceEditorElementTypes.TraceLinkSources_4001) {
			types.add(TraceEditorElementTypes.TraceLink_3004);
		}
		if (relationshipType == TraceEditorElementTypes.TraceLinkSources_4001) {
			types.add(TraceEditorElementTypes.TraceLink_3005);
		}
		if (relationshipType == TraceEditorElementTypes.TraceLinkTargets_4002) {
			types.add(TraceEditorElementTypes.TraceLink_3004);
		}
		if (relationshipType == TraceEditorElementTypes.TraceLinkTargets_4002) {
			types.add(TraceEditorElementTypes.TraceLink_3005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class ArtefactFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTypeArtefact;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureArtefactNameFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureArtefactFigureInt;

		/**
		 * @generated
		 */
		public ArtefactFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(false);

			this.setLayoutManager(layoutThis);

			this.setLineWidth(0);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(75)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(2), getMapMode().DPtoLP(3),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureArtefactFigureInt = new RectangleFigure();
			fFigureArtefactFigureInt.setLineWidth(1);
			fFigureArtefactFigureInt
					.setBackgroundColor(FFIGUREARTEFACTFIGUREINT_BACK);
			fFigureArtefactFigureInt.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(100), getMapMode().DPtoLP(70)));

			this.add(fFigureArtefactFigureInt);

			FlowLayout layoutFFigureArtefactFigureInt = new FlowLayout();
			layoutFFigureArtefactFigureInt.setStretchMinorAxis(true);
			layoutFFigureArtefactFigureInt
					.setMinorAlignment(FlowLayout.ALIGN_CENTER);

			layoutFFigureArtefactFigureInt
					.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutFFigureArtefactFigureInt.setMajorSpacing(0);
			layoutFFigureArtefactFigureInt.setMinorSpacing(0);
			layoutFFigureArtefactFigureInt.setHorizontal(false);

			fFigureArtefactFigureInt
					.setLayoutManager(layoutFFigureArtefactFigureInt);

			fFigureArtefactNameFigure = new WrappingLabel();
			fFigureArtefactNameFigure.setText("<...>");

			fFigureArtefactFigureInt.add(fFigureArtefactNameFigure);

			fFigureTypeArtefact = new WrappingLabel();
			fFigureTypeArtefact.setText("<...>");

			fFigureArtefactFigureInt.add(fFigureTypeArtefact);

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
		public WrappingLabel getFigureTypeArtefact() {
			return fFigureTypeArtefact;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureArtefactNameFigure() {
			return fFigureArtefactNameFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureArtefactFigureInt() {
			return fFigureArtefactFigureInt;
		}

	}

	/**
	 * @generated
	 */
	static final Color FFIGUREARTEFACTFIGUREINT_BACK = new Color(null, 255,
			255, 190);

}
