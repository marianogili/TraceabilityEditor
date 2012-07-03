package marianogili.model.traceabilityeditordiagram.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import marianogili.model.traceabilityeditordiagram.TraceabilityeditordiagramPackage;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.Artefact2EditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.ArtefactEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.DibujoEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.TraceabilityEditorDiagramEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.edit.parts.TransformationEditPart;
import marianogili.model.traceabilityeditordiagram.diagram.part.TraceabilityEditorDiagramDiagramEditorPlugin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class TraceabilityEditorDiagramElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private TraceabilityEditorDiagramElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Dibujo_1000 = getElementType("TraceabilityEditor.diagram.Dibujo_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TraceabilityEditorDiagram_2001 = getElementType("TraceabilityEditor.diagram.TraceabilityEditorDiagram_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Artefact_3001 = getElementType("TraceabilityEditor.diagram.Artefact_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transformation_3002 = getElementType("TraceabilityEditor.diagram.Transformation_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Artefact_3003 = getElementType("TraceabilityEditor.diagram.Artefact_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return TraceabilityEditorDiagramDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(Dibujo_1000,
					TraceabilityeditordiagramPackage.eINSTANCE.getDibujo());

			elements.put(TraceabilityEditorDiagram_2001,
					TraceabilityeditordiagramPackage.eINSTANCE
							.getTraceabilityEditorDiagram());

			elements.put(Artefact_3001,
					TraceabilityeditordiagramPackage.eINSTANCE.getArtefact());

			elements.put(Transformation_3002,
					TraceabilityeditordiagramPackage.eINSTANCE
							.getTransformation());

			elements.put(Artefact_3003,
					TraceabilityeditordiagramPackage.eINSTANCE.getArtefact());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(Dibujo_1000);
			KNOWN_ELEMENT_TYPES.add(TraceabilityEditorDiagram_2001);
			KNOWN_ELEMENT_TYPES.add(Artefact_3001);
			KNOWN_ELEMENT_TYPES.add(Transformation_3002);
			KNOWN_ELEMENT_TYPES.add(Artefact_3003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case DibujoEditPart.VISUAL_ID:
			return Dibujo_1000;
		case TraceabilityEditorDiagramEditPart.VISUAL_ID:
			return TraceabilityEditorDiagram_2001;
		case ArtefactEditPart.VISUAL_ID:
			return Artefact_3001;
		case TransformationEditPart.VISUAL_ID:
			return Transformation_3002;
		case Artefact2EditPart.VISUAL_ID:
			return Artefact_3003;
		}
		return null;
	}

}
