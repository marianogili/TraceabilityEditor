/**
 */
package com.marianogili.traceeditor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.marianogili.traceeditor.TraceLink#getSources <em>Sources</em>}</li>
 *   <li>{@link com.marianogili.traceeditor.TraceLink#getTargets <em>Targets</em>}</li>
 *   <li>{@link com.marianogili.traceeditor.TraceLink#getType <em>Type</em>}</li>
 *   <li>{@link com.marianogili.traceeditor.TraceLink#getTransformation <em>Transformation</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.marianogili.traceeditor.TraceeditorPackage#getTraceLink()
 * @model
 * @generated
 */
public interface TraceLink extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sources</b></em>' reference list.
	 * The list contents are of type {@link com.marianogili.traceeditor.Artefact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' reference list.
	 * @see com.marianogili.traceeditor.TraceeditorPackage#getTraceLink_Sources()
	 * @model
	 * @generated
	 */
	EList<Artefact> getSources();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link com.marianogili.traceeditor.Artefact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see com.marianogili.traceeditor.TraceeditorPackage#getTraceLink_Targets()
	 * @model
	 * @generated
	 */
	EList<Artefact> getTargets();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(LinkType)
	 * @see com.marianogili.traceeditor.TraceeditorPackage#getTraceLink_Type()
	 * @model
	 * @generated
	 */
	LinkType getType();

	/**
	 * Sets the value of the '{@link com.marianogili.traceeditor.TraceLink#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(LinkType value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.marianogili.traceeditor.Transformation#getTraceLinks <em>Trace Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' container reference.
	 * @see #setTransformation(Transformation)
	 * @see com.marianogili.traceeditor.TraceeditorPackage#getTraceLink_Transformation()
	 * @see com.marianogili.traceeditor.Transformation#getTraceLinks
	 * @model opposite="traceLinks" transient="false"
	 * @generated
	 */
	Transformation getTransformation();

	/**
	 * Sets the value of the '{@link com.marianogili.traceeditor.TraceLink#getTransformation <em>Transformation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' container reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Transformation value);

} // TraceLink
