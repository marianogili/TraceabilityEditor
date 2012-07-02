/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package marianogili.model.traceabilityeditordiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link marianogili.model.traceabilityeditordiagram.Transformation#getTraceLinks <em>Trace Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see marianogili.model.traceabilityeditordiagram.TraceabilityeditordiagramPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Trace Links</b></em>' containment reference list.
	 * The list contents are of type {@link marianogili.model.traceabilityeditordiagram.TraceLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Links</em>' containment reference list.
	 * @see marianogili.model.traceabilityeditordiagram.TraceabilityeditordiagramPackage#getTransformation_TraceLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<TraceLink> getTraceLinks();

} // Transformation
