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
		paletteContainer.add(createTransformación1CreationTool());
		paletteContainer.add(createTraza2CreationTool());
		paletteContainer.add(createOrigendelatraza3CreationTool());
		paletteContainer.add(createDestinodelatraza4CreationTool());
		paletteContainer.add(createArtefacto5CreationTool());
		paletteContainer.add(createDashboard6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransformación1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TraceEditorElementTypes.Transformation_3002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Transformación1CreationTool_title,
				Messages.Transformación1CreationTool_desc, types);
		entry.setId("createTransformación1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(TraceEditorElementTypes
						.getImageDescriptor(TraceEditorElementTypes.Transformation_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTraza2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(TraceEditorElementTypes.TraceLink_3004);
		types.add(TraceEditorElementTypes.TraceLink_3005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Traza2CreationTool_title,
				Messages.Traza2CreationTool_desc, types);
		entry.setId("createTraza2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceEditorElementTypes
				.getImageDescriptor(TraceEditorElementTypes.TraceLink_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOrigendelatraza3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TraceEditorElementTypes.TraceLinkSources_4001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Origendelatraza3CreationTool_title,
				Messages.Origendelatraza3CreationTool_desc, types);
		entry.setId("createOrigendelatraza3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(TraceEditorDiagramEditorPlugin
						.findImageDescriptor("/TraceEditor.edit/icons/full/obj16/EdgeSource.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(TraceEditorDiagramEditorPlugin
						.findImageDescriptor("/TraceEditor.edit/icons/full/obj16/EdgeSource.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDestinodelatraza4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TraceEditorElementTypes.TraceLinkTargets_4002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Destinodelatraza4CreationTool_title,
				Messages.Destinodelatraza4CreationTool_desc, types);
		entry.setId("createDestinodelatraza4CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(TraceEditorDiagramEditorPlugin
						.findImageDescriptor("/TraceEditor.edit/icons/full/obj16/EdgeTarget.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(TraceEditorDiagramEditorPlugin
						.findImageDescriptor("/TraceEditor.edit/icons/full/obj16/EdgeTarget.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArtefacto5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(TraceEditorElementTypes.Artefact_3001);
		types.add(TraceEditorElementTypes.Artefact_3003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Artefacto5CreationTool_title,
				Messages.Artefacto5CreationTool_desc, types);
		entry.setId("createArtefacto5CreationTool"); //$NON-NLS-1$
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
