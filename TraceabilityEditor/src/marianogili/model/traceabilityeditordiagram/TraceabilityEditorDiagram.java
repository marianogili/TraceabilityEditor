/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package marianogili.model.traceabilityeditordiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traceability Editor Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link marianogili.model.traceabilityeditordiagram.TraceabilityEditorDiagram#getTransformations <em>Transformations</em>}</li>
 *   <li>{@link marianogili.model.traceabilityeditordiagram.TraceabilityEditorDiagram#getTraceLinks <em>Trace Links</em>}</li>
 *   <li>{@link marianogili.model.traceabilityeditordiagram.TraceabilityEditorDiagram#getSources <em>Sources</em>}</li>
 *   <li>{@link marianogili.model.traceabilityeditordiagram.TraceabilityEditorDiagram#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see marianogili.model.traceabilityeditordiagram.TraceabilityeditordiagramPackage#getTraceabilityEditorDiagram()
 * @model
 * @generated
 */
public interface TraceabilityEditorDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Transformations</b></em>' containment reference list.
	 * The list contents are of type {@link marianogili.model.traceabilityeditordiagram.Transformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformations</em>' containment reference list.
	 * @see marianogili.model.traceabilityeditordiagram.TraceabilityeditordiagramPackage#getTraceabilityEditorDiagram_Transformations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transformation> getTransformations();

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
	 * @see marianogili.model.traceabilityeditordiagram.TraceabilityeditordiagramPackage#getTraceabilityEditorDiagram_TraceLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<TraceLink> getTraceLinks();

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link marianogili.model.traceabilityeditordiagram.Artefact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see marianogili.model.traceabilityeditordiagram.TraceabilityeditordiagramPackage#getTraceabilityEditorDiagram_Sources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artefact> getSources();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference list.
	 * The list contents are of type {@link marianogili.model.traceabilityeditordiagram.Artefact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference list.
	 * @see marianogili.model.traceabilityeditordiagram.TraceabilityeditordiagramPackage#getTraceabilityEditorDiagram_Targets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artefact> getTargets();

} // TraceabilityEditorDiagram
