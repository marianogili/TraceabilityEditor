package com.marianogili.traceeditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import com.marianogili.traceeditor.diagram.edit.commands.TransformationCreateCommand;
import com.marianogili.traceeditor.diagram.providers.TraceEditorElementTypes;

/**
 * @generated
 */
public class DashboardDashboardCompartmentCenterItemSemanticEditPolicy extends
		TraceEditorBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DashboardDashboardCompartmentCenterItemSemanticEditPolicy() {
		super(TraceEditorElementTypes.Dashboard_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TraceEditorElementTypes.Transformation_3002 == req.getElementType()) {
			return getGEFWrapper(new TransformationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
