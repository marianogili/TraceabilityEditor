/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.marianogili.traceeditor;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Editor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.marianogili.traceeditor.TraceEditor#getDashboard <em>Dashboard</em>}</li>
 *   <li>{@link com.marianogili.traceeditor.TraceEditor#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.marianogili.traceeditor.TraceeditorPackage#getTraceEditor()
 * @model
 * @generated
 */
public interface TraceEditor extends EObject {
	/**
	 * Returns the value of the '<em><b>Dashboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dashboard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dashboard</em>' containment reference.
	 * @see #setDashboard(Dashboard)
	 * @see com.marianogili.traceeditor.TraceeditorPackage#getTraceEditor_Dashboard()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Dashboard getDashboard();

	/**
	 * Sets the value of the '{@link com.marianogili.traceeditor.TraceEditor#getDashboard <em>Dashboard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dashboard</em>' containment reference.
	 * @see #getDashboard()
	 * @generated
	 */
	void setDashboard(Dashboard value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(Configuration)
	 * @see com.marianogili.traceeditor.TraceeditorPackage#getTraceEditor_Configuration()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link com.marianogili.traceeditor.TraceEditor#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

} // TraceEditor
