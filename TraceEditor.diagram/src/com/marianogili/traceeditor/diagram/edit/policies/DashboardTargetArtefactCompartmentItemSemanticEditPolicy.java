package com.marianogili.traceeditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import com.marianogili.traceeditor.diagram.edit.commands.Artefact2CreateCommand;
import com.marianogili.traceeditor.diagram.providers.TraceEditorElementTypes;

/**
 * @generated
 */
public class DashboardTargetArtefactCompartmentItemSemanticEditPolicy extends
		TraceEditorBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DashboardTargetArtefactCompartmentItemSemanticEditPolicy() {
		super(TraceEditorElementTypes.Dashboard_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TraceEditorElementTypes.Artefact_3004 == req.getElementType()) {
			return getGEFWrapper(new Artefact2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
