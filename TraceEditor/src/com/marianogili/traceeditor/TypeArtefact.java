/**
 */
package com.marianogili.traceeditor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Artefact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.marianogili.traceeditor.TypeArtefact#getDescription <em>Description</em>}</li>
 *   <li>{@link com.marianogili.traceeditor.TypeArtefact#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.marianogili.traceeditor.TraceeditorPackage#getTypeArtefact()
 * @model
 * @generated
 */
public interface TypeArtefact extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.marianogili.traceeditor.TraceeditorPackage#getTypeArtefact_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.marianogili.traceeditor.TypeArtefact#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(TypeArtefact)
	 * @see com.marianogili.traceeditor.TraceeditorPackage#getTypeArtefact_Parent()
	 * @model
	 * @generated
	 */
	TypeArtefact getParent();

	/**
	 * Sets the value of the '{@link com.marianogili.traceeditor.TypeArtefact#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TypeArtefact value);

} // TypeArtefact
