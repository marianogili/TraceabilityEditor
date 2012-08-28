package com.marianogili.traceeditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import com.marianogili.traceeditor.diagram.providers.TraceEditorElementTypes;

/**
 * @generated
 */
public class TraceLinkTargetsItemSemanticEditPolicy extends
		TraceEditorBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TraceLinkTargetsItemSemanticEditPolicy() {
		super(TraceEditorElementTypes.TraceLinkTargets_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
