package com.marianogili.traceeditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

import com.marianogili.traceeditor.diagram.edit.commands.TraceLinkCreateCommand;
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
		super(TraceEditorElementTypes.Transformation_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TraceEditorElementTypes.TraceLink_3004 == req.getElementType()) {
			return getGEFWrapper(new TraceLinkCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated NOT
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		if (request instanceof DestroyRequest) {
			return null;
		}
		return super.getSemanticCommand(request);
	}

}
