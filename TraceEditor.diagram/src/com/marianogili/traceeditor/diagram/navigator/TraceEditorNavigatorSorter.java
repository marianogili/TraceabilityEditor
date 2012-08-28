package com.marianogili.traceeditor.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import com.marianogili.traceeditor.diagram.part.TraceEditorVisualIDRegistry;

/**
 * @generated
 */
public class TraceEditorNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7006;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof TraceEditorNavigatorItem) {
			TraceEditorNavigatorItem item = (TraceEditorNavigatorItem) element;
			return TraceEditorVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
