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
 * A representation of the model object '<em><b>Dashboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.marianogili.traceeditor.Dashboard#getSourceArtefacts <em>Source Artefacts</em>}</li>
 *   <li>{@link com.marianogili.traceeditor.Dashboard#getTargetArtefacts <em>Target Artefacts</em>}</li>
 *   <li>{@link com.marianogili.traceeditor.Dashboard#getTraceLinks <em>Trace Links</em>}</li>
 *   <li>{@link com.marianogili.traceeditor.Dashboard#getTransformations <em>Transformations</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.marianogili.traceeditor.TraceeditorPackage#getDashboard()
 * @model
 * @generated
 */
public interface Dashboard extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Artefacts</b></em>' containment reference list.
	 * The list contents are of type {@link com.marianogili.traceeditor.Artefact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Artefacts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Artefacts</em>' containment reference list.
	 * @see com.marianogili.traceeditor.TraceeditorPackage#getDashboard_SourceArtefacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artefact> getSourceArtefacts();

	/**
	 * Returns the value of the '<em><b>Target Artefacts</b></em>' containment reference list.
	 * The list contents are of type {@link com.marianogili.traceeditor.Artefact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Artefacts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Artefacts</em>' containment reference list.
	 * @see com.marianogili.traceeditor.TraceeditorPackage#getDashboard_TargetArtefacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artefact> getTargetArtefacts();

	/**
	 * Returns the value of the '<em><b>Trace Links</b></em>' containment reference list.
	 * The list contents are of type {@link com.marianogili.traceeditor.TraceLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Links</em>' containment reference list.
	 * @see com.marianogili.traceeditor.TraceeditorPackage#getDashboard_TraceLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<TraceLink> getTraceLinks();

	/**
	 * Returns the value of the '<em><b>Transformations</b></em>' containment reference list.
	 * The list contents are of type {@link com.marianogili.traceeditor.Transformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformations</em>' containment reference list.
	 * @see com.marianogili.traceeditor.TraceeditorPackage#getDashboard_Transformations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transformation> getTransformations();

} // Dashboard
