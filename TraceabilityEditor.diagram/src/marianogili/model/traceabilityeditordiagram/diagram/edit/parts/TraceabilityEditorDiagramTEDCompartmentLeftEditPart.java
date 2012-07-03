package marianogili.model.traceabilityeditordiagram.diagram.edit.parts;

import marianogili.model.traceabilityeditordiagram.diagram.edit.policies.TraceabilityEditorDiagramTEDCompartmentLeftCanonicalEditPolicy;
import marianogili.model.traceabilityeditordiagram.diagram.edit.policies.TraceabilityEditorDiagramTEDCompartmentLeftItemSemanticEditPolicy;
import marianogili.model.traceabilityeditordiagram.diagram.part.Messages;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TraceabilityEditorDiagramTEDCompartmentLeftEditPart extends
		ListCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7001;

	/**
	 * @generated
	 */
	public TraceabilityEditorDiagramTEDCompartmentLeftEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		// TODO Auto-generated method stub
		
		if (event.getEventType() == Notification.ADD) {
			this.getFigure().getParent().getPreferredSize().height += 50;
		}
		super.handleNotificationEvent(event);
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.TraceabilityEditorDiagramTEDCompartmentLeftEditPart_title;
	}

	/**
	 * @generated
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new TraceabilityEditorDiagramTEDCompartmentLeftItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new TraceabilityEditorDiagramTEDCompartmentLeftCanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		// nothing to do -- parent layout does not accept Double constraints as ratio
		// super.setRatio(ratio); 
	}

}
