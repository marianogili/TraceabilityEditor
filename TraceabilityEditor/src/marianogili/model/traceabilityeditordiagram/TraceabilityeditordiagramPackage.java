/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package marianogili.model.traceabilityeditordiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see marianogili.model.traceabilityeditordiagram.TraceabilityeditordiagramFactory
 * @model kind="package"
 * @generated
 */
public interface TraceabilityeditordiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "traceabilityeditordiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://traceabilityeditordiagram/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "traceabilityeditordiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraceabilityeditordiagramPackage eINSTANCE = marianogili.model.traceabilityeditordiagram.impl.TraceabilityeditordiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link marianogili.model.traceabilityeditordiagram.impl.TraceabilityEditorDiagramImpl <em>Traceability Editor Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see marianogili.model.traceabilityeditordiagram.impl.TraceabilityEditorDiagramImpl
	 * @see marianogili.model.traceabilityeditordiagram.impl.TraceabilityeditordiagramPackageImpl#getTraceabilityEditorDiagram()
	 * @generated
	 */
	int TRACEABILITY_EDITOR_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Transformations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_EDITOR_DIAGRAM__TRANSFORMATIONS = 0;

	/**
	 * The feature id for the '<em><b>Trace Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_EDITOR_DIAGRAM__TRACE_LINKS = 1;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_EDITOR_DIAGRAM__SOURCES = 2;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_EDITOR_DIAGRAM__TARGETS = 3;

	/**
	 * The number of structural features of the '<em>Traceability Editor Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_EDITOR_DIAGRAM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link marianogili.model.traceabilityeditordiagram.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see marianogili.model.traceabilityeditordiagram.impl.DiagramElementImpl
	 * @see marianogili.model.traceabilityeditordiagram.impl.TraceabilityeditordiagramPackageImpl#getDiagramElement()
	 * @generated
	 */
	int DIAGRAM_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link marianogili.model.traceabilityeditordiagram.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see marianogili.model.traceabilityeditordiagram.impl.TransformationImpl
	 * @see marianogili.model.traceabilityeditordiagram.impl.TraceabilityeditordiagramPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NAME = DIAGRAM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Trace Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TRACE_LINKS = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link marianogili.model.traceabilityeditordiagram.impl.TraceLinkImpl <em>Trace Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see marianogili.model.traceabilityeditordiagram.impl.TraceLinkImpl
	 * @see marianogili.model.traceabilityeditordiagram.impl.TraceabilityeditordiagramPackageImpl#getTraceLink()
	 * @generated
	 */
	int TRACE_LINK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__NAME = DIAGRAM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__SOURCES = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__TARGETS = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trace Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link marianogili.model.traceabilityeditordiagram.impl.ArtefactImpl <em>Artefact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see marianogili.model.traceabilityeditordiagram.impl.ArtefactImpl
	 * @see marianogili.model.traceabilityeditordiagram.impl.TraceabilityeditordiagramPackageImpl#getArtefact()
	 * @generated
	 */
	int ARTEFACT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT__NAME = DIAGRAM_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Artefact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link marianogili.model.traceabilityeditordiagram.impl.DibujoImpl <em>Dibujo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see marianogili.model.traceabilityeditordiagram.impl.DibujoImpl
	 * @see marianogili.model.traceabilityeditordiagram.impl.TraceabilityeditordiagramPackageImpl#getDibujo()
	 * @generated
	 */
	int DIBUJO = 5;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIBUJO__EREFERENCE0 = 0;

	/**
	 * The number of structural features of the '<em>Dibujo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIBUJO_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link marianogili.model.traceabilityeditordiagram.TraceabilityEditorDiagram <em>Traceability Editor Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traceability Editor Diagram</em>'.
	 * @see marianogili.model.traceabilityeditordiagram.TraceabilityEditorDiagram
	 * @generated
	 */
	EClass getTraceabilityEditorDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link marianogili.model.traceabilityeditordiagram.TraceabilityEditorDiagram#getTransformations <em>Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformations</em>'.
	 * @see marianogili.model.traceabilityeditordiagram.TraceabilityEditorDiagram#getTransformations()
	 * @see #getTraceabilityEditorDiagram()
	 * @generated
	 */
	EReference getTraceabilityEditorDiagram_Transformations();

	/**
	 * Returns the meta object for the containment reference list '{@link marianogili.model.traceabilityeditordiagram.TraceabilityEditorDiagram#getTraceLinks <em>Trace Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trace Links</em>'.
	 * @see marianogili.model.traceabilityeditordiagram.TraceabilityEditorDiagram#getTraceLinks()
	 * @see #getTraceabilityEditorDiagram()
	 * @generated
	 */
	EReference getTraceabilityEditorDiagram_TraceLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link marianogili.model.traceabilityeditordiagram.TraceabilityEditorDiagram#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see marianogili.model.traceabilityeditordiagram.TraceabilityEditorDiagram#getSources()
	 * @see #getTraceabilityEditorDiagram()
	 * @generated
	 */
	EReference getTraceabilityEditorDiagram_Sources();

	/**
	 * Returns the meta object for the containment reference list '{@link marianogili.model.traceabilityeditordiagram.TraceabilityEditorDiagram#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Targets</em>'.
	 * @see marianogili.model.traceabilityeditordiagram.TraceabilityEditorDiagram#getTargets()
	 * @see #getTraceabilityEditorDiagram()
	 * @generated
	 */
	EReference getTraceabilityEditorDiagram_Targets();

	/**
	 * Returns the meta object for class '{@link marianogili.model.traceabilityeditordiagram.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see marianogili.model.traceabilityeditordiagram.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the containment reference list '{@link marianogili.model.traceabilityeditordiagram.Transformation#getTraceLinks <em>Trace Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trace Links</em>'.
	 * @see marianogili.model.traceabilityeditordiagram.Transformation#getTraceLinks()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_TraceLinks();

	/**
	 * Returns the meta object for class '{@link marianogili.model.traceabilityeditordiagram.TraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Link</em>'.
	 * @see marianogili.model.traceabilityeditordiagram.TraceLink
	 * @generated
	 */
	EClass getTraceLink();

	/**
	 * Returns the meta object for the reference list '{@link marianogili.model.traceabilityeditordiagram.TraceLink#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sources</em>'.
	 * @see marianogili.model.traceabilityeditordiagram.TraceLink#getSources()
	 * @see #getTraceLink()
	 * @generated
	 */
	EReference getTraceLink_Sources();

	/**
	 * Returns the meta object for the reference list '{@link marianogili.model.traceabilityeditordiagram.TraceLink#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see marianogili.model.traceabilityeditordiagram.TraceLink#getTargets()
	 * @see #getTraceLink()
	 * @generated
	 */
	EReference getTraceLink_Targets();

	/**
	 * Returns the meta object for class '{@link marianogili.model.traceabilityeditordiagram.Artefact <em>Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artefact</em>'.
	 * @see marianogili.model.traceabilityeditordiagram.Artefact
	 * @generated
	 */
	EClass getArtefact();

	/**
	 * Returns the meta object for class '{@link marianogili.model.traceabilityeditordiagram.DiagramElement <em>Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Element</em>'.
	 * @see marianogili.model.traceabilityeditordiagram.DiagramElement
	 * @generated
	 */
	EClass getDiagramElement();

	/**
	 * Returns the meta object for the attribute '{@link marianogili.model.traceabilityeditordiagram.DiagramElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see marianogili.model.traceabilityeditordiagram.DiagramElement#getName()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EAttribute getDiagramElement_Name();

	/**
	 * Returns the meta object for class '{@link marianogili.model.traceabilityeditordiagram.Dibujo <em>Dibujo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dibujo</em>'.
	 * @see marianogili.model.traceabilityeditordiagram.Dibujo
	 * @generated
	 */
	EClass getDibujo();

	/**
	 * Returns the meta object for the containment reference '{@link marianogili.model.traceabilityeditordiagram.Dibujo#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EReference0</em>'.
	 * @see marianogili.model.traceabilityeditordiagram.Dibujo#getEReference0()
	 * @see #getDibujo()
	 * @generated
	 */
	EReference getDibujo_EReference0();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraceabilityeditordiagramFactory getTraceabilityeditordiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link marianogili.model.traceabilityeditordiagram.impl.TraceabilityEditorDiagramImpl <em>Traceability Editor Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see marianogili.model.traceabilityeditordiagram.impl.TraceabilityEditorDiagramImpl
		 * @see marianogili.model.traceabilityeditordiagram.impl.TraceabilityeditordiagramPackageImpl#getTraceabilityEditorDiagram()
		 * @generated
		 */
		EClass TRACEABILITY_EDITOR_DIAGRAM = eINSTANCE.getTraceabilityEditorDiagram();

		/**
		 * The meta object literal for the '<em><b>Transformations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY_EDITOR_DIAGRAM__TRANSFORMATIONS = eINSTANCE.getTraceabilityEditorDiagram_Transformations();

		/**
		 * The meta object literal for the '<em><b>Trace Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY_EDITOR_DIAGRAM__TRACE_LINKS = eINSTANCE.getTraceabilityEditorDiagram_TraceLinks();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY_EDITOR_DIAGRAM__SOURCES = eINSTANCE.getTraceabilityEditorDiagram_Sources();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY_EDITOR_DIAGRAM__TARGETS = eINSTANCE.getTraceabilityEditorDiagram_Targets();

		/**
		 * The meta object literal for the '{@link marianogili.model.traceabilityeditordiagram.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see marianogili.model.traceabilityeditordiagram.impl.TransformationImpl
		 * @see marianogili.model.traceabilityeditordiagram.impl.TraceabilityeditordiagramPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Trace Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__TRACE_LINKS = eINSTANCE.getTransformation_TraceLinks();

		/**
		 * The meta object literal for the '{@link marianogili.model.traceabilityeditordiagram.impl.TraceLinkImpl <em>Trace Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see marianogili.model.traceabilityeditordiagram.impl.TraceLinkImpl
		 * @see marianogili.model.traceabilityeditordiagram.impl.TraceabilityeditordiagramPackageImpl#getTraceLink()
		 * @generated
		 */
		EClass TRACE_LINK = eINSTANCE.getTraceLink();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK__SOURCES = eINSTANCE.getTraceLink_Sources();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK__TARGETS = eINSTANCE.getTraceLink_Targets();

		/**
		 * The meta object literal for the '{@link marianogili.model.traceabilityeditordiagram.impl.ArtefactImpl <em>Artefact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see marianogili.model.traceabilityeditordiagram.impl.ArtefactImpl
		 * @see marianogili.model.traceabilityeditordiagram.impl.TraceabilityeditordiagramPackageImpl#getArtefact()
		 * @generated
		 */
		EClass ARTEFACT = eINSTANCE.getArtefact();

		/**
		 * The meta object literal for the '{@link marianogili.model.traceabilityeditordiagram.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see marianogili.model.traceabilityeditordiagram.impl.DiagramElementImpl
		 * @see marianogili.model.traceabilityeditordiagram.impl.TraceabilityeditordiagramPackageImpl#getDiagramElement()
		 * @generated
		 */
		EClass DIAGRAM_ELEMENT = eINSTANCE.getDiagramElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_ELEMENT__NAME = eINSTANCE.getDiagramElement_Name();

		/**
		 * The meta object literal for the '{@link marianogili.model.traceabilityeditordiagram.impl.DibujoImpl <em>Dibujo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see marianogili.model.traceabilityeditordiagram.impl.DibujoImpl
		 * @see marianogili.model.traceabilityeditordiagram.impl.TraceabilityeditordiagramPackageImpl#getDibujo()
		 * @generated
		 */
		EClass DIBUJO = eINSTANCE.getDibujo();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIBUJO__EREFERENCE0 = eINSTANCE.getDibujo_EReference0();

	}

} //TraceabilityeditordiagramPackage
