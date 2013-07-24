package com.marianogili.traceeditor.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import com.marianogili.traceeditor.TraceeditorPackage;
import com.marianogili.traceeditor.diagram.edit.parts.ArtefactName2EditPart;
import com.marianogili.traceeditor.diagram.edit.parts.ArtefactNameEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TraceLinkName2EditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TraceLinkNameEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TransformationNameEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.WrappingLabel2EditPart;
import com.marianogili.traceeditor.diagram.edit.parts.WrappingLabel3EditPart;
import com.marianogili.traceeditor.diagram.edit.parts.WrappingLabel4EditPart;
import com.marianogili.traceeditor.diagram.edit.parts.WrappingLabelEditPart;
import com.marianogili.traceeditor.diagram.parsers.ArtefactLabelExpressionLabelParser;
import com.marianogili.traceeditor.diagram.parsers.MessageFormatParser;
import com.marianogili.traceeditor.diagram.parsers.TraceLinkLabelExpressionLabelParser;
import com.marianogili.traceeditor.diagram.part.TraceEditorVisualIDRegistry;

/**
 * @generated
 */
public class TraceEditorParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser artefactName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getArtefactName_5001Parser() {
		if (artefactName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { TraceeditorPackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { TraceeditorPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			artefactName_5001Parser = parser;
		}
		return artefactName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser getArtefactLabel_5006Parser() {
		return new ArtefactLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	private IParser traceLinkName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getTraceLinkName_5002Parser() {
		if (traceLinkName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { TraceeditorPackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { TraceeditorPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			traceLinkName_5002Parser = parser;
		}
		return traceLinkName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser getTraceLinkLabel_5007Parser() {
		return new TraceLinkLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	private IParser transformationName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getTransformationName_5003Parser() {
		if (transformationName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { TraceeditorPackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { TraceeditorPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			transformationName_5003Parser = parser;
		}
		return transformationName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser traceLinkName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getTraceLinkName_5005Parser() {
		if (traceLinkName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { TraceeditorPackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { TraceeditorPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			traceLinkName_5005Parser = parser;
		}
		return traceLinkName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser getTraceLinkLabel_5008Parser() {
		return new TraceLinkLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	private IParser artefactName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getArtefactName_5004Parser() {
		if (artefactName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { TraceeditorPackage.eINSTANCE
					.getNamedElement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { TraceeditorPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			artefactName_5004Parser = parser;
		}
		return artefactName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser getArtefactLabel_5009Parser() {
		return new ArtefactLabelExpressionLabelParser();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ArtefactNameEditPart.VISUAL_ID:
			return getArtefactName_5001Parser();
		case WrappingLabelEditPart.VISUAL_ID:
			return getArtefactLabel_5006Parser();
		case TraceLinkNameEditPart.VISUAL_ID:
			return getTraceLinkName_5002Parser();
		case WrappingLabel2EditPart.VISUAL_ID:
			return getTraceLinkLabel_5007Parser();
		case TransformationNameEditPart.VISUAL_ID:
			return getTransformationName_5003Parser();
		case TraceLinkName2EditPart.VISUAL_ID:
			return getTraceLinkName_5005Parser();
		case WrappingLabel3EditPart.VISUAL_ID:
			return getTraceLinkLabel_5008Parser();
		case ArtefactName2EditPart.VISUAL_ID:
			return getArtefactName_5004Parser();
		case WrappingLabel4EditPart.VISUAL_ID:
			return getArtefactLabel_5009Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(TraceEditorVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(TraceEditorVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (TraceEditorElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
