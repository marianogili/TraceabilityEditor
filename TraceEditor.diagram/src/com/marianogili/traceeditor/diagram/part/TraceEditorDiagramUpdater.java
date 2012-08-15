package com.marianogili.traceeditor.diagram.part;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;

import com.marianogili.traceeditor.Dashboard;
import com.marianogili.traceeditor.TraceEditor;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TraceEditorEditPart;

/**
 * @generated
 */
public class TraceEditorDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (TraceEditorVisualIDRegistry.getVisualID(view)) {
		case TraceEditorEditPart.VISUAL_ID:
			return getTraceEditor_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTraceEditor_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		TraceEditor modelElement = (TraceEditor) view.getElement();
		List result = new LinkedList();
		{
			Dashboard childElement = modelElement.getDashboard();
			int visualID = TraceEditorVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DashboardEditPart.VISUAL_ID) {
				result
						.add(new TraceEditorNodeDescriptor(childElement,
								visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (TraceEditorVisualIDRegistry.getVisualID(view)) {
		case TraceEditorEditPart.VISUAL_ID:
			return getTraceEditor_1000ContainedLinks(view);
		case DashboardEditPart.VISUAL_ID:
			return getDashboard_2001ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (TraceEditorVisualIDRegistry.getVisualID(view)) {
		case DashboardEditPart.VISUAL_ID:
			return getDashboard_2001IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (TraceEditorVisualIDRegistry.getVisualID(view)) {
		case DashboardEditPart.VISUAL_ID:
			return getDashboard_2001OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTraceEditor_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDashboard_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDashboard_2001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDashboard_2001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

}
