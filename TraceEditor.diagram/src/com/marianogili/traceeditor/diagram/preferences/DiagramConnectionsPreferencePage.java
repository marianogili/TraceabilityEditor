package com.marianogili.traceeditor.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

import com.marianogili.traceeditor.diagram.part.TraceEditorDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(TraceEditorDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
