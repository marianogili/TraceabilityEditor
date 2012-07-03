package marianogili.model.traceabilityeditordiagram.diagram.part;

import java.util.ArrayList;
import java.util.List;

import marianogili.model.traceabilityeditordiagram.diagram.providers.TraceabilityEditorDiagramElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class TraceabilityEditorDiagramPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createTraceabilityeditordiagram1Group());
	}

	/**
	 * Creates "traceabilityeditordiagram" palette tool group
	 * @generated
	 */
	private PaletteContainer createTraceabilityeditordiagram1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Traceabilityeditordiagram1Group_title);
		paletteContainer.setId("createTraceabilityeditordiagram1Group"); //$NON-NLS-1$
		paletteContainer.add(createTraceabilityEditorDiagram1CreationTool());
		paletteContainer.add(createTransformation2CreationTool());
		paletteContainer.add(createTraceLink3CreationTool());
		paletteContainer.add(createArtefact4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTraceabilityEditorDiagram1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(TraceabilityEditorDiagramElementTypes.TraceabilityEditorDiagram_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TraceabilityEditorDiagram1CreationTool_title,
				Messages.TraceabilityEditorDiagram1CreationTool_desc, types);
		entry.setId("createTraceabilityEditorDiagram1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(TraceabilityEditorDiagramElementTypes
						.getImageDescriptor(TraceabilityEditorDiagramElementTypes.TraceabilityEditorDiagram_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransformation2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TraceabilityEditorDiagramElementTypes.Transformation_3002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Transformation2CreationTool_title,
				Messages.Transformation2CreationTool_desc, types);
		entry.setId("createTransformation2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(TraceabilityEditorDiagramElementTypes
						.getImageDescriptor(TraceabilityEditorDiagramElementTypes.Transformation_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTraceLink3CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.TraceLink3CreationTool_title,
				Messages.TraceLink3CreationTool_desc, null, null) {
		};
		entry.setId("createTraceLink3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArtefact4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(TraceabilityEditorDiagramElementTypes.Artefact_3001);
		types.add(TraceabilityEditorDiagramElementTypes.Artefact_3003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Artefact4CreationTool_title,
				Messages.Artefact4CreationTool_desc, types);
		entry.setId("createArtefact4CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(TraceabilityEditorDiagramElementTypes
						.getImageDescriptor(TraceabilityEditorDiagramElementTypes.Artefact_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
