package com.marianogili.traceeditor.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

import com.marianogili.traceeditor.diagram.providers.TraceEditorElementTypes;

/**
 * @generated
 */
public class TraceEditorPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createTraceeditor1Group());
	}

	/**
	 * Creates "traceeditor" palette tool group
	 * @generated
	 */
	private PaletteContainer createTraceeditor1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Traceeditor1Group_title);
		paletteContainer.setId("createTraceeditor1Group"); //$NON-NLS-1$
		paletteContainer.add(createTransformation1CreationTool());
		paletteContainer.add(createTraceLink2CreationTool());
		paletteContainer.add(createTraceLinkSources3CreationTool());
		paletteContainer.add(createTraceLinkTargets4CreationTool());
		paletteContainer.add(createArtefact5CreationTool());
		paletteContainer.add(createDashboard6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransformation1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TraceEditorElementTypes.Transformation_3002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Transformation1CreationTool_title,
				Messages.Transformation1CreationTool_desc, types);
		entry.setId("createTransformation1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(TraceEditorElementTypes
						.getImageDescriptor(TraceEditorElementTypes.Transformation_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTraceLink2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(TraceEditorElementTypes.TraceLink_3004);
		types.add(TraceEditorElementTypes.TraceLink_3005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TraceLink2CreationTool_title,
				Messages.TraceLink2CreationTool_desc, types);
		entry.setId("createTraceLink2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceEditorElementTypes
				.getImageDescriptor(TraceEditorElementTypes.TraceLink_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTraceLinkSources3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TraceEditorElementTypes.TraceLinkSources_4001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TraceLinkSources3CreationTool_title,
				Messages.TraceLinkSources3CreationTool_desc, types);
		entry.setId("createTraceLinkSources3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(TraceEditorElementTypes
						.getImageDescriptor(TraceEditorElementTypes.TraceLinkSources_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTraceLinkTargets4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TraceEditorElementTypes.TraceLinkTargets_4002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TraceLinkTargets4CreationTool_title,
				Messages.TraceLinkTargets4CreationTool_desc, types);
		entry.setId("createTraceLinkTargets4CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(TraceEditorElementTypes
						.getImageDescriptor(TraceEditorElementTypes.TraceLinkTargets_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArtefact5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(TraceEditorElementTypes.Artefact_3001);
		types.add(TraceEditorElementTypes.Artefact_3003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Artefact5CreationTool_title,
				Messages.Artefact5CreationTool_desc, types);
		entry.setId("createArtefact5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceEditorElementTypes
				.getImageDescriptor(TraceEditorElementTypes.Artefact_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDashboard6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TraceEditorElementTypes.Dashboard_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Dashboard6CreationTool_title,
				Messages.Dashboard6CreationTool_desc, types);
		entry.setId("createDashboard6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceEditorElementTypes
				.getImageDescriptor(TraceEditorElementTypes.Dashboard_2001));
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

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
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
