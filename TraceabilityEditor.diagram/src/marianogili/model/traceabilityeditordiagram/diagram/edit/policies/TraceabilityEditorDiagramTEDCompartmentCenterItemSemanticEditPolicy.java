package marianogili.model.traceabilityeditordiagram.diagram.edit.policies;

import marianogili.model.traceabilityeditordiagram.diagram.edit.commands.TransformationCreateCommand;
import marianogili.model.traceabilityeditordiagram.diagram.providers.TraceabilityEditorDiagramElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class TraceabilityEditorDiagramTEDCompartmentCenterItemSemanticEditPolicy
		extends TraceabilityEditorDiagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TraceabilityEditorDiagramTEDCompartmentCenterItemSemanticEditPolicy() {
		super(
				TraceabilityEditorDiagramElementTypes.TraceabilityEditorDiagram_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TraceabilityEditorDiagramElementTypes.Transformation_3002 == req
				.getElementType()) {
			return getGEFWrapper(new TransformationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
