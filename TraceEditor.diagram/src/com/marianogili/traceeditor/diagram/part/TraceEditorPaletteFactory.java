package com.marianogili.traceeditor.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
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
		paletteRoot.add(createTransformaciónyArtefactos1Group());
		paletteRoot.add(createTrazas2Group());
	}

	/**
	 * Creates "Transformación y Artefactos" palette tool group
	 * @generated
	 */
	private PaletteContainer createTransformaciónyArtefactos1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.TransformaciónyArtefactos1Group_title);
		paletteContainer.setId("createTransformaciónyArtefactos1Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(Messages.TransformaciónyArtefactos1Group_desc);
		paletteContainer.add(createTransformación1CreationTool());
		paletteContainer.add(createArtefacto2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Trazas" palette tool group
	 * @generated
	 */
	private PaletteContainer createTrazas2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Trazas2Group_title);
		paletteContainer.setId("createTrazas2Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Trazas2Group_desc);
		paletteContainer.add(createTraza1CreationTool());
		paletteContainer.add(createOrigendelatraza2CreationTool());
		paletteContainer.add(createDestinodelatraza3CreationTool());
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
	private ToolEntry createArtefacto2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(TraceEditorElementTypes.Artefact_3001);
		types.add(TraceEditorElementTypes.Artefact_3003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Artefacto2CreationTool_title,
				Messages.Artefacto2CreationTool_desc, types);
		entry.setId("createArtefacto2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceEditorElementTypes
				.getImageDescriptor(TraceEditorElementTypes.Artefact_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTraza1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(TraceEditorElementTypes.TraceLink_3004);
		types.add(TraceEditorElementTypes.TraceLink_3005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Traza1CreationTool_title,
				Messages.Traza1CreationTool_desc, types);
		entry.setId("createTraza1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceEditorElementTypes
				.getImageDescriptor(TraceEditorElementTypes.TraceLink_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOrigendelatraza2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TraceEditorElementTypes.TraceLinkSources_4001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Origendelatraza2CreationTool_title,
				Messages.Origendelatraza2CreationTool_desc, types);
		entry.setId("createOrigendelatraza2CreationTool"); //$NON-NLS-1$
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
	private ToolEntry createDestinodelatraza3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TraceEditorElementTypes.TraceLinkTargets_4002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Destinodelatraza3CreationTool_title,
				Messages.Destinodelatraza3CreationTool_desc, types);
		entry.setId("createDestinodelatraza3CreationTool"); //$NON-NLS-1$
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
