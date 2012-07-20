package traceeditor;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class PerspectiveTraceEditorFactory implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {

		String editorArea = layout.getEditorArea();
        
        layout.addView(IPageLayout.ID_PROJECT_EXPLORER, IPageLayout.LEFT, (float) 0.20, editorArea);
        layout.addView(IPageLayout.ID_OUTLINE, IPageLayout.BOTTOM, (float) 0.50, IPageLayout.ID_PROJECT_EXPLORER);
        
        layout.addView(IPageLayout.ID_PROP_SHEET, IPageLayout.BOTTOM, (float) 0.75, editorArea);
        
        layout.addView(IPageLayout.ID_PROBLEM_VIEW, IPageLayout.RIGHT, (float) 0.75, editorArea);
        
	}

}
