package com.marianogili.traceeditor.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
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
		paletteRoot.add(createTransformaciones1Group());
		paletteRoot.add(createTrazas2Group());
		paletteRoot.add(createPorsacar3Group());
	}

	/**
	 * Creates "Transformaciones" palette tool group
	 * @generated
	 */
	private PaletteContainer createTransformaciones1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Transformaciones1Group_title);
		paletteContainer.setId("createTransformaciones1Group"); //$NON-NLS-1$
		paletteContainer.add(createTransformación1CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createArtefactoorigen3CreationTool());
		paletteContainer.add(createArtefactodestino4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Trazas" palette tool group
	 * @generated
	 */
	private PaletteContainer createTrazas2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Trazas2Group_title);
		paletteContainer.setId("createTrazas2Group"); //$NON-NLS-1$
		paletteContainer.add(createTraza1CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createOrigendelatraza3CreationTool());
		paletteContainer.add(createDestinodelatraza4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Por sacar" palette tool group
	 * @generated
	 */
	private PaletteContainer createPorsacar3Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Porsacar3Group_title);
		paletteContainer.setId("createPorsacar3Group"); //$NON-NLS-1$
		paletteContainer.add(createTablero1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransformación1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Transformación1CreationTool_title,
				Messages.Transformación1CreationTool_desc,
				Collections
						.singletonList(TraceEditorElementTypes.Transformation_3003));
		entry.setId("createTransformación1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceEditorElementTypes
				.getImageDescriptor(TraceEditorElementTypes.Transformation_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArtefactoorigen3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Artefactoorigen3CreationTool_title,
				Messages.Artefactoorigen3CreationTool_desc,
				Collections
						.singletonList(TraceEditorElementTypes.Artefact_3001));
		entry.setId("createArtefactoorigen3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceEditorElementTypes
				.getImageDescriptor(TraceEditorElementTypes.Artefact_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArtefactodestino4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Artefactodestino4CreationTool_title,
				Messages.Artefactodestino4CreationTool_desc,
				Collections
						.singletonList(TraceEditorElementTypes.Artefact_3004));
		entry.setId("createArtefactodestino4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceEditorElementTypes
				.getImageDescriptor(TraceEditorElementTypes.Artefact_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTraza1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Traza1CreationTool_title,
				Messages.Traza1CreationTool_desc,
				Collections
						.singletonList(TraceEditorElementTypes.TraceLink_3002));
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
		ToolEntry entry = new ToolEntry(
				Messages.Origendelatraza3CreationTool_title,
				Messages.Origendelatraza3CreationTool_desc, null, null) {
		};
		entry.setId("createOrigendelatraza3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDestinodelatraza4CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.Destinodelatraza4CreationTool_title,
				Messages.Destinodelatraza4CreationTool_desc, null, null) {
		};
		entry.setId("createDestinodelatraza4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTablero1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Tablero1CreationTool_title,
				Messages.Tablero1CreationTool_desc,
				Collections
						.singletonList(TraceEditorElementTypes.Dashboard_2001));
		entry.setId("createTablero1CreationTool"); //$NON-NLS-1$
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
}
