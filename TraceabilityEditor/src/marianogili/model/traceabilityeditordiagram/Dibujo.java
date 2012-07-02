/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package marianogili.model.traceabilityeditordiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dibujo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link marianogili.model.traceabilityeditordiagram.Dibujo#getEReference0 <em>EReference0</em>}</li>
 * </ul>
 * </p>
 *
 * @see marianogili.model.traceabilityeditordiagram.TraceabilityeditordiagramPackage#getDibujo()
 * @model
 * @generated
 */
public interface Dibujo extends EObject {
	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' containment reference.
	 * @see #setEReference0(TraceabilityEditorDiagram)
	 * @see marianogili.model.traceabilityeditordiagram.TraceabilityeditordiagramPackage#getDibujo_EReference0()
	 * @model containment="true"
	 * @generated
	 */
	TraceabilityEditorDiagram getEReference0();

	/**
	 * Sets the value of the '{@link marianogili.model.traceabilityeditordiagram.Dibujo#getEReference0 <em>EReference0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' containment reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(TraceabilityEditorDiagram value);

} // Dibujo
