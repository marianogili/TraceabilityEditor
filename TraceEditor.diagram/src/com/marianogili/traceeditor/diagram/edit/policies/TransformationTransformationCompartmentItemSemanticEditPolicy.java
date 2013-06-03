package com.marianogili.traceeditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import com.marianogili.traceeditor.diagram.edit.commands.TraceLink2CreateCommand;
import com.marianogili.traceeditor.diagram.providers.TraceEditorElementTypes;

/**
 * @generated
 */
public class TransformationTransformationCompartmentItemSemanticEditPolicy
		extends TraceEditorBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TransformationTransformationCompartmentItemSemanticEditPolicy() {
		super(TraceEditorElementTypes.Transformation_3003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TraceEditorElementTypes.TraceLink_3005 == req.getElementType()) {
			return getGEFWrapper(new TraceLink2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
