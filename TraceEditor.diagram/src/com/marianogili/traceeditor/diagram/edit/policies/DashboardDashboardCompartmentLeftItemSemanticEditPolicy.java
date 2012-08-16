package com.marianogili.traceeditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import com.marianogili.traceeditor.diagram.edit.commands.ArtefactCreateCommand;
import com.marianogili.traceeditor.diagram.providers.TraceEditorElementTypes;

/**
 * @generated
 */
public class DashboardDashboardCompartmentLeftItemSemanticEditPolicy extends
		TraceEditorBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DashboardDashboardCompartmentLeftItemSemanticEditPolicy() {
		super(TraceEditorElementTypes.Dashboard_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TraceEditorElementTypes.Artefact_3001 == req.getElementType()) {
			return getGEFWrapper(new ArtefactCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
