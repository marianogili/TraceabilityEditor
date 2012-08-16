package com.marianogili.traceeditor.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

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

import com.marianogili.traceeditor.TraceeditorPackage;
import com.marianogili.traceeditor.diagram.edit.parts.Artefact2EditPart;
import com.marianogili.traceeditor.diagram.edit.parts.ArtefactEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.DashboardEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TraceEditorEditPart;
import com.marianogili.traceeditor.diagram.edit.parts.TransformationEditPart;
import com.marianogili.traceeditor.diagram.part.TraceEditorDiagramEditorPlugin;

/**
 * @generated
 */
public class TraceEditorElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private TraceEditorElementTypes() {
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
	public static final IElementType TraceEditor_1000 = getElementType("TraceEditor.diagram.TraceEditor_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Dashboard_2001 = getElementType("TraceEditor.diagram.Dashboard_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Artefact_3001 = getElementType("TraceEditor.diagram.Artefact_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transformation_3002 = getElementType("TraceEditor.diagram.Transformation_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Artefact_3003 = getElementType("TraceEditor.diagram.Artefact_3003"); //$NON-NLS-1$

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
				return TraceEditorDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
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

			elements.put(TraceEditor_1000, TraceeditorPackage.eINSTANCE
					.getTraceEditor());

			elements.put(Dashboard_2001, TraceeditorPackage.eINSTANCE
					.getDashboard());

			elements.put(Artefact_3001, TraceeditorPackage.eINSTANCE
					.getArtefact());

			elements.put(Transformation_3002, TraceeditorPackage.eINSTANCE
					.getTransformation());

			elements.put(Artefact_3003, TraceeditorPackage.eINSTANCE
					.getArtefact());
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
			KNOWN_ELEMENT_TYPES.add(TraceEditor_1000);
			KNOWN_ELEMENT_TYPES.add(Dashboard_2001);
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
		case TraceEditorEditPart.VISUAL_ID:
			return TraceEditor_1000;
		case DashboardEditPart.VISUAL_ID:
			return Dashboard_2001;
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
