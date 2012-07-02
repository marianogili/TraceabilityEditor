/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package marianogili.model.traceabilityeditordiagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see marianogili.model.traceabilityeditordiagram.TraceabilityeditordiagramPackage
 * @generated
 */
public interface TraceabilityeditordiagramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraceabilityeditordiagramFactory eINSTANCE = marianogili.model.traceabilityeditordiagram.impl.TraceabilityeditordiagramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traceability Editor Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traceability Editor Diagram</em>'.
	 * @generated
	 */
	TraceabilityEditorDiagram createTraceabilityEditorDiagram();

	/**
	 * Returns a new object of class '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation</em>'.
	 * @generated
	 */
	Transformation createTransformation();

	/**
	 * Returns a new object of class '<em>Trace Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace Link</em>'.
	 * @generated
	 */
	TraceLink createTraceLink();

	/**
	 * Returns a new object of class '<em>Artefact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artefact</em>'.
	 * @generated
	 */
	Artefact createArtefact();

	/**
	 * Returns a new object of class '<em>Dibujo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dibujo</em>'.
	 * @generated
	 */
	Dibujo createDibujo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TraceabilityeditordiagramPackage getTraceabilityeditordiagramPackage();

} //TraceabilityeditordiagramFactory
