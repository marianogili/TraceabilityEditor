package marianogili.model.traceabilityeditordiagram.diagram.edit.policies;

import marianogili.model.traceabilityeditordiagram.diagram.edit.commands.ArtefactCreateCommand;
import marianogili.model.traceabilityeditordiagram.diagram.providers.TraceabilityEditorDiagramElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class TraceabilityEditorDiagramTEDCompartmentLeftItemSemanticEditPolicy
		extends TraceabilityEditorDiagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TraceabilityEditorDiagramTEDCompartmentLeftItemSemanticEditPolicy() {
		super(
				TraceabilityEditorDiagramElementTypes.TraceabilityEditorDiagram_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TraceabilityEditorDiagramElementTypes.Artefact_3001 == req
				.getElementType()) {
			return getGEFWrapper(new ArtefactCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
