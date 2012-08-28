package com.marianogili.traceeditor.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

import com.marianogili.traceeditor.TraceeditorPackage;
import com.marianogili.traceeditor.diagram.edit.parts.TraceLinkEditPart;
import com.marianogili.traceeditor.diagram.part.TraceEditorDiagramUpdater;
import com.marianogili.traceeditor.diagram.part.TraceEditorNodeDescriptor;
import com.marianogili.traceeditor.diagram.part.TraceEditorVisualIDRegistry;

/**
 * @generated
 */
public class TransformationTransformationCompartmentCanonicalEditPolicy extends
		CanonicalEditPolicy {

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
		for (Iterator it = TraceEditorDiagramUpdater
				.getTransformationTransformationCompartment_7004SemanticChildren(
						viewObject).iterator(); it.hasNext();) {
			result.add(((TraceEditorNodeDescriptor) it.next())
					.getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = TraceEditorVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case TraceLinkEditPart.VISUAL_ID:
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
			myFeaturesToSynchronize.add(TraceeditorPackage.eINSTANCE
					.getTransformation_TraceLinks());
		}
		return myFeaturesToSynchronize;
	}

}
