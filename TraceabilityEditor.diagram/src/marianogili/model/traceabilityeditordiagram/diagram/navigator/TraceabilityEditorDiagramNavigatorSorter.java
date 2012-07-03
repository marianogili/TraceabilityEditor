package marianogili.model.traceabilityeditordiagram.diagram.navigator;

import marianogili.model.traceabilityeditordiagram.diagram.part.TraceabilityEditorDiagramVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class TraceabilityEditorDiagramNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7005;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof TraceabilityEditorDiagramNavigatorItem) {
			TraceabilityEditorDiagramNavigatorItem item = (TraceabilityEditorDiagramNavigatorItem) element;
			return TraceabilityEditorDiagramVisualIDRegistry.getVisualID(item
					.getView());
		}
		return GROUP_CATEGORY;
	}

}
