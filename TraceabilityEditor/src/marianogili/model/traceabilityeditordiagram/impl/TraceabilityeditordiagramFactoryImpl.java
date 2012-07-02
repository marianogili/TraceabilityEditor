/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package marianogili.model.traceabilityeditordiagram.impl;

import marianogili.model.traceabilityeditordiagram.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceabilityeditordiagramFactoryImpl extends EFactoryImpl implements TraceabilityeditordiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TraceabilityeditordiagramFactory init() {
		try {
			TraceabilityeditordiagramFactory theTraceabilityeditordiagramFactory = (TraceabilityeditordiagramFactory)EPackage.Registry.INSTANCE.getEFactory("http://traceabilityeditordiagram/1.0"); 
			if (theTraceabilityeditordiagramFactory != null) {
				return theTraceabilityeditordiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TraceabilityeditordiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityeditordiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM: return createTraceabilityEditorDiagram();
			case TraceabilityeditordiagramPackage.TRANSFORMATION: return createTransformation();
			case TraceabilityeditordiagramPackage.TRACE_LINK: return createTraceLink();
			case TraceabilityeditordiagramPackage.ARTEFACT: return createArtefact();
			case TraceabilityeditordiagramPackage.DIBUJO: return createDibujo();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityEditorDiagram createTraceabilityEditorDiagram() {
		TraceabilityEditorDiagramImpl traceabilityEditorDiagram = new TraceabilityEditorDiagramImpl();
		return traceabilityEditorDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation createTransformation() {
		TransformationImpl transformation = new TransformationImpl();
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceLink createTraceLink() {
		TraceLinkImpl traceLink = new TraceLinkImpl();
		return traceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artefact createArtefact() {
		ArtefactImpl artefact = new ArtefactImpl();
		return artefact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dibujo createDibujo() {
		DibujoImpl dibujo = new DibujoImpl();
		return dibujo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityeditordiagramPackage getTraceabilityeditordiagramPackage() {
		return (TraceabilityeditordiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TraceabilityeditordiagramPackage getPackage() {
		return TraceabilityeditordiagramPackage.eINSTANCE;
	}

} //TraceabilityeditordiagramFactoryImpl
