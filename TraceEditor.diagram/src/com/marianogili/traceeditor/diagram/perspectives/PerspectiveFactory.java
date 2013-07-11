package com.marianogili.traceeditor.diagram.perspectives;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import com.marianogili.traceeditor.diagram.views.ViewListOfTrace;

public class PerspectiveFactory implements IPerspectiveFactory {

	private static final String FOLDER = 
			"com.marianogili.traceeditor.diagram.perspectives.bottomFolder";
	
	private static final String VIEW_ID = ViewListOfTrace.ID;

	@Override
	public void createInitialLayout(IPageLayout myLayout) {
		myLayout.addView(IPageLayout.ID_PROJECT_EXPLORER, IPageLayout.LEFT, 0.20f,
				myLayout.getEditorArea());
		
		myLayout.addView(IPageLayout.ID_OUTLINE, IPageLayout.BOTTOM, 0.6f, 
				IPageLayout.ID_PROJECT_EXPLORER);
		
		IFolderLayout bot = myLayout.createFolder(FOLDER, IPageLayout.BOTTOM,
				0.65f, myLayout.getEditorArea());
		bot.addView(IPageLayout.ID_PROP_SHEET);
		bot.addView(VIEW_ID);
		
	}

}
