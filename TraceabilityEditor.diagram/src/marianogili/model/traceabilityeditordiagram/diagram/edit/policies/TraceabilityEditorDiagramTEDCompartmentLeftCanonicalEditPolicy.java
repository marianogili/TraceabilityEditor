package marianogili.model.traceabilityeditordiagram.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import marianogili.model.traceabilityeditordiagram.TraceabilityeditordiagramPackage;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.ArtefactEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.part.TraceabilityEditorDiagramDiagramUpdater;
import marianogili.model.traceabilityeditordiagram.diagram.part.TraceabilityEditorDiagramNodeDescriptor;
import marianogili.model.traceabilityeditordiagram.diagram.part.TraceabilityEditorDiagramVisualIDRegistry;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TraceabilityEditorDiagramTEDCompartmentLeftCanonicalEditPolicy
		extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = TraceabilityEditorDiagramDiagramUpdater
				.getTraceabilityEditorDiagramTEDCompartmentLeft_7001SemanticChildren(
						viewObject).iterator(); it.hasNext();) {
			result.add(((TraceabilityEditorDiagramNodeDescriptor) it.next())
					.getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = TraceabilityEditorDiagramVisualIDRegistry
				.getVisualID(view);
		switch (visualID) {
		case ArtefactEditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize
					.add(TraceabilityeditordiagramPackage.eINSTANCE
							.getTraceabilityEditorDiagram_Sources());
		}
		return myFeaturesToSynchronize;
	}

}
