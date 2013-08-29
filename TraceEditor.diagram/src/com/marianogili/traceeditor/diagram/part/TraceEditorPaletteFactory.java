package com.marianogili.traceeditor.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import com.marianogili.traceeditor.diagram.providers.TraceEditorElementTypes;

/**
 * @generated
 */
public class TraceEditorPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createTrazas1Group());
	}

	/**
	 * Creates "Trazas" palette tool group
	 * @generated
	 */
	private PaletteContainer createTrazas1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Trazas1Group_title);
		paletteContainer.setId("createTrazas1Group"); //$NON-NLS-1$
		paletteContainer.add(createTraza1CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createOrigendelatraza3CreationTool());
		paletteContainer.add(createDestinodelatraza4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTraza1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(TraceEditorElementTypes.TraceLink_3002);
		types.add(TraceEditorElementTypes.TraceLink_3005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Traza1CreationTool_title,
				Messages.Traza1CreationTool_desc, types);
		entry.setId("createTraza1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceEditorElementTypes
				.getImageDescriptor(TraceEditorElementTypes.TraceLink_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOrigendelatraza3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Origendelatraza3CreationTool_title,
				Messages.Origendelatraza3CreationTool_desc,
				Collections
						.singletonList(TraceEditorElementTypes.TraceLinkSources_4001));
		entry.setId("createOrigendelatraza3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceEditorDiagramEditorPlugin
				.findImageDescriptor("/TraceEditor.edit/icons/full/obj16/EdgeSource.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDestinodelatraza4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Destinodelatraza4CreationTool_title,
				Messages.Destinodelatraza4CreationTool_desc,
				Collections
						.singletonList(TraceEditorElementTypes.TraceLinkTargets_4002));
		entry.setId("createDestinodelatraza4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceEditorDiagramEditorPlugin
				.findImageDescriptor("/TraceEditor.edit/icons/full/obj16/EdgeTarget.gif")); //$NON-NLS-1$
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
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
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

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
