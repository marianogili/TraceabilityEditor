/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.marianogili.traceeditor.impl;

import com.marianogili.traceeditor.*;

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
public class TraceeditorFactoryImpl extends EFactoryImpl implements TraceeditorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TraceeditorFactory init() {
		try {
			TraceeditorFactory theTraceeditorFactory = (TraceeditorFactory)EPackage.Registry.INSTANCE.getEFactory("http://traceeditor/1.0"); 
			if (theTraceeditorFactory != null) {
				return theTraceeditorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TraceeditorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceeditorFactoryImpl() {
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
			case TraceeditorPackage.TRANSFORMATION: return createTransformation();
			case TraceeditorPackage.TRACE_LINK: return createTraceLink();
			case TraceeditorPackage.ARTEFACT: return createArtefact();
			case TraceeditorPackage.DASHBOARD: return createDashboard();
			case TraceeditorPackage.TRACE_EDITOR: return createTraceEditor();
			case TraceeditorPackage.TYPE_ARTEFACT: return createTypeArtefact();
			case TraceeditorPackage.LINK_TYPE: return createLinkType();
			case TraceeditorPackage.CONFIGURATION: return createConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public Dashboard createDashboard() {
		DashboardImpl dashboard = new DashboardImpl();
		return dashboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceEditor createTraceEditor() {
		TraceEditorImpl traceEditor = new TraceEditorImpl();
		return traceEditor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeArtefact createTypeArtefact() {
		TypeArtefactImpl typeArtefact = new TypeArtefactImpl();
		return typeArtefact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType createLinkType() {
		LinkTypeImpl linkType = new LinkTypeImpl();
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceeditorPackage getTraceeditorPackage() {
		return (TraceeditorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TraceeditorPackage getPackage() {
		return TraceeditorPackage.eINSTANCE;
	}

} //TraceeditorFactoryImpl
