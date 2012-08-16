package com.marianogili.traceeditor.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import com.marianogili.traceeditor.diagram.edit.parts.Artefact2EditPart;
import com.marianogili.traceeditor.diagram.edit.parts.ArtefactEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.ArtefactName2EditPart;
import com.marianogili.traceeditor.diagram.edit.parts.ArtefactNameEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TraceEditorEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TransformationEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TransformationNameEditPart;
import com.marianogili.traceeditor.diagram.part.TraceEditorDiagramEditorPlugin;
import com.marianogili.traceeditor.diagram.part.TraceEditorVisualIDRegistry;
import com.marianogili.traceeditor.diagram.providers.TraceEditorElementTypes;
import com.marianogili.traceeditor.diagram.providers.TraceEditorParserProvider;

/**
 * @generated
 */
public class TraceEditorNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		TraceEditorDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		TraceEditorDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof TraceEditorNavigatorItem
				&& !isOwnView(((TraceEditorNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof TraceEditorNavigatorGroup) {
			TraceEditorNavigatorGroup group = (TraceEditorNavigatorGroup) element;
			return TraceEditorDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof TraceEditorNavigatorItem) {
			TraceEditorNavigatorItem navigatorItem = (TraceEditorNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (TraceEditorVisualIDRegistry.getVisualID(view)) {
		case TraceEditorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://traceeditor/1.0?TraceEditor", TraceEditorElementTypes.TraceEditor_1000); //$NON-NLS-1$
		case DashboardEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://traceeditor/1.0?Dashboard", TraceEditorElementTypes.Dashboard_2001); //$NON-NLS-1$
		case ArtefactEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://traceeditor/1.0?Artefact", TraceEditorElementTypes.Artefact_3001); //$NON-NLS-1$
		case TransformationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://traceeditor/1.0?Transformation", TraceEditorElementTypes.Transformation_3002); //$NON-NLS-1$
		case Artefact2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://traceeditor/1.0?Artefact", TraceEditorElementTypes.Artefact_3003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = TraceEditorDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& TraceEditorElementTypes.isKnownElementType(elementType)) {
			image = TraceEditorElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof TraceEditorNavigatorGroup) {
			TraceEditorNavigatorGroup group = (TraceEditorNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof TraceEditorNavigatorItem) {
			TraceEditorNavigatorItem navigatorItem = (TraceEditorNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (TraceEditorVisualIDRegistry.getVisualID(view)) {
		case TraceEditorEditPart.VISUAL_ID:
			return getTraceEditor_1000Text(view);
		case DashboardEditPart.VISUAL_ID:
			return getDashboard_2001Text(view);
		case ArtefactEditPart.VISUAL_ID:
			return getArtefact_3001Text(view);
		case TransformationEditPart.VISUAL_ID:
			return getTransformation_3002Text(view);
		case Artefact2EditPart.VISUAL_ID:
			return getArtefact_3003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getTraceEditor_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDashboard_2001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getArtefact_3001Text(View view) {
		IParser parser = TraceEditorParserProvider.getParser(
				TraceEditorElementTypes.Artefact_3001,
				view.getElement() != null ? view.getElement() : view,
				TraceEditorVisualIDRegistry
						.getType(ArtefactNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceEditorDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransformation_3002Text(View view) {
		IParser parser = TraceEditorParserProvider.getParser(
				TraceEditorElementTypes.Transformation_3002,
				view.getElement() != null ? view.getElement() : view,
				TraceEditorVisualIDRegistry
						.getType(TransformationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceEditorDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArtefact_3003Text(View view) {
		IParser parser = TraceEditorParserProvider.getParser(
				TraceEditorElementTypes.Artefact_3003,
				view.getElement() != null ? view.getElement() : view,
				TraceEditorVisualIDRegistry
						.getType(ArtefactName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceEditorDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return TraceEditorEditPart.MODEL_ID.equals(TraceEditorVisualIDRegistry
				.getModelID(view));
	}

}
