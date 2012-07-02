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
 * A representation of the model object '<em><b>Trace Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link marianogili.model.traceabilityeditordiagram.TraceLink#getSources <em>Sources</em>}</li>
 *   <li>{@link marianogili.model.traceabilityeditordiagram.TraceLink#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see marianogili.model.traceabilityeditordiagram.TraceabilityeditordiagramPackage#getTraceLink()
 * @model
 * @generated
 */
public interface TraceLink extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Sources</b></em>' reference list.
	 * The list contents are of type {@link marianogili.model.traceabilityeditordiagram.Artefact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' reference list.
	 * @see marianogili.model.traceabilityeditordiagram.TraceabilityeditordiagramPackage#getTraceLink_Sources()
	 * @model
	 * @generated
	 */
	EList<Artefact> getSources();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link marianogili.model.traceabilityeditordiagram.Artefact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see marianogili.model.traceabilityeditordiagram.TraceabilityeditordiagramPackage#getTraceLink_Targets()
	 * @model
	 * @generated
	 */
	EList<Artefact> getTargets();

} // TraceLink
