/**
 */
package com.marianogili.traceeditor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.marianogili.traceeditor.Transformation#getTraceLinks <em>Trace Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.marianogili.traceeditor.TraceeditorPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Trace Links</b></em>' containment reference list.
	 * The list contents are of type {@link com.marianogili.traceeditor.TraceLink}.
	 * It is bidirectional and its opposite is '{@link com.marianogili.traceeditor.TraceLink#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Links</em>' containment reference list.
	 * @see com.marianogili.traceeditor.TraceeditorPackage#getTransformation_TraceLinks()
	 * @see com.marianogili.traceeditor.TraceLink#getTransformation
	 * @model opposite="transformation" containment="true"
	 * @generated
	 */
	EList<TraceLink> getTraceLinks();

} // Transformation
