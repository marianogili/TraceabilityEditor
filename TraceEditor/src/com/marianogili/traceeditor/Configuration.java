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
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.marianogili.traceeditor.Configuration#getLinkTypes <em>Link Types</em>}</li>
 *   <li>{@link com.marianogili.traceeditor.Configuration#getTypeArtefacts <em>Type Artefacts</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.marianogili.traceeditor.TraceeditorPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Link Types</b></em>' containment reference list.
	 * The list contents are of type {@link com.marianogili.traceeditor.LinkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Types</em>' containment reference list.
	 * @see com.marianogili.traceeditor.TraceeditorPackage#getConfiguration_LinkTypes()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<LinkType> getLinkTypes();

	/**
	 * Returns the value of the '<em><b>Type Artefacts</b></em>' containment reference list.
	 * The list contents are of type {@link com.marianogili.traceeditor.TypeArtefact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Artefacts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Artefacts</em>' containment reference list.
	 * @see com.marianogili.traceeditor.TraceeditorPackage#getConfiguration_TypeArtefacts()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<TypeArtefact> getTypeArtefacts();

} // Configuration
