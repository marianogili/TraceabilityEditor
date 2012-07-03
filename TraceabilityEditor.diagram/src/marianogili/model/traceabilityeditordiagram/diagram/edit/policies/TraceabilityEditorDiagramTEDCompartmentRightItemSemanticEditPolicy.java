package marianogili.model.traceabilityeditordiagram.diagram.edit.policies;

import marianogili.model.traceabilityeditordiagram.diagram.edit.commands.Artefact2CreateCommand;
import marianogili.model.traceabilityeditordiagram.diagram.providers.TraceabilityEditorDiagramElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class TraceabilityEditorDiagramTEDCompartmentRightItemSemanticEditPolicy
		extends TraceabilityEditorDiagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TraceabilityEditorDiagramTEDCompartmentRightItemSemanticEditPolicy() {
		super(
				TraceabilityEditorDiagramElementTypes.TraceabilityEditorDiagram_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TraceabilityEditorDiagramElementTypes.Artefact_3003 == req
				.getElementType()) {
			return getGEFWrapper(new Artefact2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
