/**
 */
package com.marianogili.traceeditor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.marianogili.traceeditor.TraceeditorPackage
 * @generated
 */
public interface TraceeditorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraceeditorFactory eINSTANCE = com.marianogili.traceeditor.impl.TraceeditorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation</em>'.
	 * @generated
	 */
	Transformation createTransformation();

	/**
	 * Returns a new object of class '<em>Trace Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace Link</em>'.
	 * @generated
	 */
	TraceLink createTraceLink();

	/**
	 * Returns a new object of class '<em>Artefact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artefact</em>'.
	 * @generated
	 */
	Artefact createArtefact();

	/**
	 * Returns a new object of class '<em>Dashboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dashboard</em>'.
	 * @generated
	 */
	Dashboard createDashboard();

	/**
	 * Returns a new object of class '<em>Trace Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace Editor</em>'.
	 * @generated
	 */
	TraceEditor createTraceEditor();

	/**
	 * Returns a new object of class '<em>Type Artefact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Artefact</em>'.
	 * @generated
	 */
	TypeArtefact createTypeArtefact();

	/**
	 * Returns a new object of class '<em>Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Type</em>'.
	 * @generated
	 */
	LinkType createLinkType();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TraceeditorPackage getTraceeditorPackage();

} //TraceeditorFactory
