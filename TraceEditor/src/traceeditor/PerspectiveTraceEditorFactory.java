package traceeditor;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class PerspectiveTraceEditorFactory implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		// TODO Auto-generated method stub
		
		// Editors are placed for free.
        String editorArea = layout.getEditorArea();

        // Place navigator and outline to left of
        // editor area.
        IFolderLayout left =
                layout.createFolder("left", IPageLayout.LEFT, (float) 0.20, editorArea);
        left.addView(IPageLayout.ID_PROJECT_EXPLORER);
        IFolderLayout bottom =
            layout.createFolder("bottom", IPageLayout.BOTTOM, (float) 0.20, editorArea);
        bottom.addView(IPageLayout.ID_OUTLINE);
        IFolderLayout leftbottom =
            layout.createFolder("leftbottom", IPageLayout.BOTTOM, (float) 0.20, editorArea);
        leftbottom.addView(IPageLayout.ID_PROBLEM_VIEW);
	}

}
