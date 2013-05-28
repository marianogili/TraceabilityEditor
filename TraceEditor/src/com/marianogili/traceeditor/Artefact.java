/**
 */
package com.marianogili.traceeditor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artefact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.marianogili.traceeditor.Artefact#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.marianogili.traceeditor.TraceeditorPackage#getArtefact()
 * @model
 * @generated
 */
public interface Artefact extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeArtefact)
	 * @see com.marianogili.traceeditor.TraceeditorPackage#getArtefact_Type()
	 * @model
	 * @generated
	 */
	TypeArtefact getType();

	/**
	 * Sets the value of the '{@link com.marianogili.traceeditor.Artefact#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeArtefact value);

} // Artefact
