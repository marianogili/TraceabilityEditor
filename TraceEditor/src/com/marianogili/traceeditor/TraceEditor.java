/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.marianogili.traceeditor;

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
	 * @model containment="true"
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

} // TraceEditor
