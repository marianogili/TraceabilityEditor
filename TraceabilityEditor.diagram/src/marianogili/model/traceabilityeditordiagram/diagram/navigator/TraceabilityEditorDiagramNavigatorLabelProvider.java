package marianogili.model.traceabilityeditordiagram.diagram.navigator;

import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.Artefact2EditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.ArtefactEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.ArtefactName2EditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.ArtefactNameEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.DibujoEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.TraceabilityEditorDiagramEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.TransformationEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.TransformationNameEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.part.TraceabilityEditorDiagramDiagramEditorPlugin;
import marianogili.model.traceabilityeditordiagram.diagram.part.TraceabilityEditorDiagramVisualIDRegistry;
import marianogili.model.traceabilityeditordiagram.diagram.providers.TraceabilityEditorDiagramElementTypes;
import marianogili.model.traceabilityeditordiagram.diagram.providers.TraceabilityEditorDiagramParserProvider;

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

/**
 * @generated
 */
public class TraceabilityEditorDiagramNavigatorLabelProvider extends
		LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		TraceabilityEditorDiagramDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		TraceabilityEditorDiagramDiagramEditorPlugin
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
		if (element instanceof TraceabilityEditorDiagramNavigatorItem
				&& !isOwnView(((TraceabilityEditorDiagramNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof TraceabilityEditorDiagramNavigatorGroup) {
			TraceabilityEditorDiagramNavigatorGroup group = (TraceabilityEditorDiagramNavigatorGroup) element;
			return TraceabilityEditorDiagramDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof TraceabilityEditorDiagramNavigatorItem) {
			TraceabilityEditorDiagramNavigatorItem navigatorItem = (TraceabilityEditorDiagramNavigatorItem) element;
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
		switch (TraceabilityEditorDiagramVisualIDRegistry.getVisualID(view)) {
		case DibujoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://traceabilityeditordiagram/1.0?Dibujo", TraceabilityEditorDiagramElementTypes.Dibujo_1000); //$NON-NLS-1$
		case TraceabilityEditorDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://traceabilityeditordiagram/1.0?TraceabilityEditorDiagram", TraceabilityEditorDiagramElementTypes.TraceabilityEditorDiagram_2001); //$NON-NLS-1$
		case ArtefactEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://traceabilityeditordiagram/1.0?Artefact", TraceabilityEditorDiagramElementTypes.Artefact_3001); //$NON-NLS-1$
		case TransformationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://traceabilityeditordiagram/1.0?Transformation", TraceabilityEditorDiagramElementTypes.Transformation_3002); //$NON-NLS-1$
		case Artefact2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://traceabilityeditordiagram/1.0?Artefact", TraceabilityEditorDiagramElementTypes.Artefact_3003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = TraceabilityEditorDiagramDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& TraceabilityEditorDiagramElementTypes
						.isKnownElementType(elementType)) {
			image = TraceabilityEditorDiagramElementTypes.getImage(elementType);
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
		if (element instanceof TraceabilityEditorDiagramNavigatorGroup) {
			TraceabilityEditorDiagramNavigatorGroup group = (TraceabilityEditorDiagramNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof TraceabilityEditorDiagramNavigatorItem) {
			TraceabilityEditorDiagramNavigatorItem navigatorItem = (TraceabilityEditorDiagramNavigatorItem) element;
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
		switch (TraceabilityEditorDiagramVisualIDRegistry.getVisualID(view)) {
		case DibujoEditPart.VISUAL_ID:
			return getDibujo_1000Text(view);
		case TraceabilityEditorDiagramEditPart.VISUAL_ID:
			return getTraceabilityEditorDiagram_2001Text(view);
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
	private String getDibujo_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTraceabilityEditorDiagram_2001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getArtefact_3001Text(View view) {
		IParser parser = TraceabilityEditorDiagramParserProvider.getParser(
				TraceabilityEditorDiagramElementTypes.Artefact_3001, view
						.getElement() != null ? view.getElement() : view,
				TraceabilityEditorDiagramVisualIDRegistry
						.getType(ArtefactNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityEditorDiagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransformation_3002Text(View view) {
		IParser parser = TraceabilityEditorDiagramParserProvider.getParser(
				TraceabilityEditorDiagramElementTypes.Transformation_3002, view
						.getElement() != null ? view.getElement() : view,
				TraceabilityEditorDiagramVisualIDRegistry
						.getType(TransformationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityEditorDiagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArtefact_3003Text(View view) {
		IParser parser = TraceabilityEditorDiagramParserProvider.getParser(
				TraceabilityEditorDiagramElementTypes.Artefact_3003, view
						.getElement() != null ? view.getElement() : view,
				TraceabilityEditorDiagramVisualIDRegistry
						.getType(ArtefactName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityEditorDiagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
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
		return DibujoEditPart.MODEL_ID
				.equals(TraceabilityEditorDiagramVisualIDRegistry
						.getModelID(view));
	}

}
