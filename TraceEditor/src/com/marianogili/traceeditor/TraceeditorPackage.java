/**
 */
package com.marianogili.traceeditor;

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
 * @see com.marianogili.traceeditor.TraceeditorFactory
 * @model kind="package"
 * @generated
 */
public interface TraceeditorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "traceeditor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://traceeditor/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "traceeditor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraceeditorPackage eINSTANCE = com.marianogili.traceeditor.impl.TraceeditorPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.marianogili.traceeditor.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.marianogili.traceeditor.impl.NamedElementImpl
	 * @see com.marianogili.traceeditor.impl.TraceeditorPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.marianogili.traceeditor.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.marianogili.traceeditor.impl.TransformationImpl
	 * @see com.marianogili.traceeditor.impl.TraceeditorPackageImpl#getTransformation()
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
	int TRANSFORMATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Trace Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TRACE_LINKS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.marianogili.traceeditor.impl.TraceLinkImpl <em>Trace Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.marianogili.traceeditor.impl.TraceLinkImpl
	 * @see com.marianogili.traceeditor.impl.TraceeditorPackageImpl#getTraceLink()
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
	int TRACE_LINK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__SOURCES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__TARGETS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__TRANSFORMATION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Trace Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.marianogili.traceeditor.impl.ArtefactImpl <em>Artefact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.marianogili.traceeditor.impl.ArtefactImpl
	 * @see com.marianogili.traceeditor.impl.TraceeditorPackageImpl#getArtefact()
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
	int ARTEFACT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Artefact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.marianogili.traceeditor.impl.DashboardImpl <em>Dashboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.marianogili.traceeditor.impl.DashboardImpl
	 * @see com.marianogili.traceeditor.impl.TraceeditorPackageImpl#getDashboard()
	 * @generated
	 */
	int DASHBOARD = 4;

	/**
	 * The feature id for the '<em><b>Source Artefacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__SOURCE_ARTEFACTS = 0;

	/**
	 * The feature id for the '<em><b>Target Artefacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__TARGET_ARTEFACTS = 1;

	/**
	 * The feature id for the '<em><b>Trace Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__TRACE_LINKS = 2;

	/**
	 * The feature id for the '<em><b>Transformations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__TRANSFORMATIONS = 3;

	/**
	 * The number of structural features of the '<em>Dashboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.marianogili.traceeditor.impl.TraceEditorImpl <em>Trace Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.marianogili.traceeditor.impl.TraceEditorImpl
	 * @see com.marianogili.traceeditor.impl.TraceeditorPackageImpl#getTraceEditor()
	 * @generated
	 */
	int TRACE_EDITOR = 5;

	/**
	 * The feature id for the '<em><b>Dashboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_EDITOR__DASHBOARD = 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_EDITOR__CONFIGURATION = 1;

	/**
	 * The number of structural features of the '<em>Trace Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_EDITOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.marianogili.traceeditor.impl.TypeArtefactImpl <em>Type Artefact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.marianogili.traceeditor.impl.TypeArtefactImpl
	 * @see com.marianogili.traceeditor.impl.TraceeditorPackageImpl#getTypeArtefact()
	 * @generated
	 */
	int TYPE_ARTEFACT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ARTEFACT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ARTEFACT__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ARTEFACT__PARENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Artefact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ARTEFACT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.marianogili.traceeditor.impl.LinkTypeImpl <em>Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.marianogili.traceeditor.impl.LinkTypeImpl
	 * @see com.marianogili.traceeditor.impl.TraceeditorPackageImpl#getLinkType()
	 * @generated
	 */
	int LINK_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__PARENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.marianogili.traceeditor.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.marianogili.traceeditor.impl.ConfigurationImpl
	 * @see com.marianogili.traceeditor.impl.TraceeditorPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 8;

	/**
	 * The feature id for the '<em><b>Link Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__LINK_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Type Artefacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__TYPE_ARTEFACTS = 1;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link com.marianogili.traceeditor.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see com.marianogili.traceeditor.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.marianogili.traceeditor.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.marianogili.traceeditor.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link com.marianogili.traceeditor.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see com.marianogili.traceeditor.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.marianogili.traceeditor.Transformation#getTraceLinks <em>Trace Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trace Links</em>'.
	 * @see com.marianogili.traceeditor.Transformation#getTraceLinks()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_TraceLinks();

	/**
	 * Returns the meta object for class '{@link com.marianogili.traceeditor.TraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Link</em>'.
	 * @see com.marianogili.traceeditor.TraceLink
	 * @generated
	 */
	EClass getTraceLink();

	/**
	 * Returns the meta object for the reference list '{@link com.marianogili.traceeditor.TraceLink#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sources</em>'.
	 * @see com.marianogili.traceeditor.TraceLink#getSources()
	 * @see #getTraceLink()
	 * @generated
	 */
	EReference getTraceLink_Sources();

	/**
	 * Returns the meta object for the reference list '{@link com.marianogili.traceeditor.TraceLink#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see com.marianogili.traceeditor.TraceLink#getTargets()
	 * @see #getTraceLink()
	 * @generated
	 */
	EReference getTraceLink_Targets();

	/**
	 * Returns the meta object for the reference '{@link com.marianogili.traceeditor.TraceLink#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.marianogili.traceeditor.TraceLink#getType()
	 * @see #getTraceLink()
	 * @generated
	 */
	EReference getTraceLink_Type();

	/**
	 * Returns the meta object for the container reference '{@link com.marianogili.traceeditor.TraceLink#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transformation</em>'.
	 * @see com.marianogili.traceeditor.TraceLink#getTransformation()
	 * @see #getTraceLink()
	 * @generated
	 */
	EReference getTraceLink_Transformation();

	/**
	 * Returns the meta object for class '{@link com.marianogili.traceeditor.Artefact <em>Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artefact</em>'.
	 * @see com.marianogili.traceeditor.Artefact
	 * @generated
	 */
	EClass getArtefact();

	/**
	 * Returns the meta object for the reference '{@link com.marianogili.traceeditor.Artefact#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.marianogili.traceeditor.Artefact#getType()
	 * @see #getArtefact()
	 * @generated
	 */
	EReference getArtefact_Type();

	/**
	 * Returns the meta object for class '{@link com.marianogili.traceeditor.Dashboard <em>Dashboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dashboard</em>'.
	 * @see com.marianogili.traceeditor.Dashboard
	 * @generated
	 */
	EClass getDashboard();

	/**
	 * Returns the meta object for the containment reference list '{@link com.marianogili.traceeditor.Dashboard#getSourceArtefacts <em>Source Artefacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Artefacts</em>'.
	 * @see com.marianogili.traceeditor.Dashboard#getSourceArtefacts()
	 * @see #getDashboard()
	 * @generated
	 */
	EReference getDashboard_SourceArtefacts();

	/**
	 * Returns the meta object for the containment reference list '{@link com.marianogili.traceeditor.Dashboard#getTargetArtefacts <em>Target Artefacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Artefacts</em>'.
	 * @see com.marianogili.traceeditor.Dashboard#getTargetArtefacts()
	 * @see #getDashboard()
	 * @generated
	 */
	EReference getDashboard_TargetArtefacts();

	/**
	 * Returns the meta object for the containment reference list '{@link com.marianogili.traceeditor.Dashboard#getTraceLinks <em>Trace Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trace Links</em>'.
	 * @see com.marianogili.traceeditor.Dashboard#getTraceLinks()
	 * @see #getDashboard()
	 * @generated
	 */
	EReference getDashboard_TraceLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link com.marianogili.traceeditor.Dashboard#getTransformations <em>Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformations</em>'.
	 * @see com.marianogili.traceeditor.Dashboard#getTransformations()
	 * @see #getDashboard()
	 * @generated
	 */
	EReference getDashboard_Transformations();

	/**
	 * Returns the meta object for class '{@link com.marianogili.traceeditor.TraceEditor <em>Trace Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Editor</em>'.
	 * @see com.marianogili.traceeditor.TraceEditor
	 * @generated
	 */
	EClass getTraceEditor();

	/**
	 * Returns the meta object for the containment reference '{@link com.marianogili.traceeditor.TraceEditor#getDashboard <em>Dashboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dashboard</em>'.
	 * @see com.marianogili.traceeditor.TraceEditor#getDashboard()
	 * @see #getTraceEditor()
	 * @generated
	 */
	EReference getTraceEditor_Dashboard();

	/**
	 * Returns the meta object for the containment reference '{@link com.marianogili.traceeditor.TraceEditor#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see com.marianogili.traceeditor.TraceEditor#getConfiguration()
	 * @see #getTraceEditor()
	 * @generated
	 */
	EReference getTraceEditor_Configuration();

	/**
	 * Returns the meta object for class '{@link com.marianogili.traceeditor.TypeArtefact <em>Type Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Artefact</em>'.
	 * @see com.marianogili.traceeditor.TypeArtefact
	 * @generated
	 */
	EClass getTypeArtefact();

	/**
	 * Returns the meta object for the attribute '{@link com.marianogili.traceeditor.TypeArtefact#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.marianogili.traceeditor.TypeArtefact#getDescription()
	 * @see #getTypeArtefact()
	 * @generated
	 */
	EAttribute getTypeArtefact_Description();

	/**
	 * Returns the meta object for the reference '{@link com.marianogili.traceeditor.TypeArtefact#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see com.marianogili.traceeditor.TypeArtefact#getParent()
	 * @see #getTypeArtefact()
	 * @generated
	 */
	EReference getTypeArtefact_Parent();

	/**
	 * Returns the meta object for class '{@link com.marianogili.traceeditor.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Type</em>'.
	 * @see com.marianogili.traceeditor.LinkType
	 * @generated
	 */
	EClass getLinkType();

	/**
	 * Returns the meta object for the reference '{@link com.marianogili.traceeditor.LinkType#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see com.marianogili.traceeditor.LinkType#getParent()
	 * @see #getLinkType()
	 * @generated
	 */
	EReference getLinkType_Parent();

	/**
	 * Returns the meta object for the attribute '{@link com.marianogili.traceeditor.LinkType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.marianogili.traceeditor.LinkType#getDescription()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_Description();

	/**
	 * Returns the meta object for class '{@link com.marianogili.traceeditor.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see com.marianogili.traceeditor.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link com.marianogili.traceeditor.Configuration#getLinkTypes <em>Link Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Types</em>'.
	 * @see com.marianogili.traceeditor.Configuration#getLinkTypes()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_LinkTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.marianogili.traceeditor.Configuration#getTypeArtefacts <em>Type Artefacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Artefacts</em>'.
	 * @see com.marianogili.traceeditor.Configuration#getTypeArtefacts()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_TypeArtefacts();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraceeditorFactory getTraceeditorFactory();

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
		 * The meta object literal for the '{@link com.marianogili.traceeditor.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.marianogili.traceeditor.impl.NamedElementImpl
		 * @see com.marianogili.traceeditor.impl.TraceeditorPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link com.marianogili.traceeditor.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.marianogili.traceeditor.impl.TransformationImpl
		 * @see com.marianogili.traceeditor.impl.TraceeditorPackageImpl#getTransformation()
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
		 * The meta object literal for the '{@link com.marianogili.traceeditor.impl.TraceLinkImpl <em>Trace Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.marianogili.traceeditor.impl.TraceLinkImpl
		 * @see com.marianogili.traceeditor.impl.TraceeditorPackageImpl#getTraceLink()
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
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK__TYPE = eINSTANCE.getTraceLink_Type();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK__TRANSFORMATION = eINSTANCE.getTraceLink_Transformation();

		/**
		 * The meta object literal for the '{@link com.marianogili.traceeditor.impl.ArtefactImpl <em>Artefact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.marianogili.traceeditor.impl.ArtefactImpl
		 * @see com.marianogili.traceeditor.impl.TraceeditorPackageImpl#getArtefact()
		 * @generated
		 */
		EClass ARTEFACT = eINSTANCE.getArtefact();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTEFACT__TYPE = eINSTANCE.getArtefact_Type();

		/**
		 * The meta object literal for the '{@link com.marianogili.traceeditor.impl.DashboardImpl <em>Dashboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.marianogili.traceeditor.impl.DashboardImpl
		 * @see com.marianogili.traceeditor.impl.TraceeditorPackageImpl#getDashboard()
		 * @generated
		 */
		EClass DASHBOARD = eINSTANCE.getDashboard();

		/**
		 * The meta object literal for the '<em><b>Source Artefacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASHBOARD__SOURCE_ARTEFACTS = eINSTANCE.getDashboard_SourceArtefacts();

		/**
		 * The meta object literal for the '<em><b>Target Artefacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASHBOARD__TARGET_ARTEFACTS = eINSTANCE.getDashboard_TargetArtefacts();

		/**
		 * The meta object literal for the '<em><b>Trace Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASHBOARD__TRACE_LINKS = eINSTANCE.getDashboard_TraceLinks();

		/**
		 * The meta object literal for the '<em><b>Transformations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASHBOARD__TRANSFORMATIONS = eINSTANCE.getDashboard_Transformations();

		/**
		 * The meta object literal for the '{@link com.marianogili.traceeditor.impl.TraceEditorImpl <em>Trace Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.marianogili.traceeditor.impl.TraceEditorImpl
		 * @see com.marianogili.traceeditor.impl.TraceeditorPackageImpl#getTraceEditor()
		 * @generated
		 */
		EClass TRACE_EDITOR = eINSTANCE.getTraceEditor();

		/**
		 * The meta object literal for the '<em><b>Dashboard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_EDITOR__DASHBOARD = eINSTANCE.getTraceEditor_Dashboard();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_EDITOR__CONFIGURATION = eINSTANCE.getTraceEditor_Configuration();

		/**
		 * The meta object literal for the '{@link com.marianogili.traceeditor.impl.TypeArtefactImpl <em>Type Artefact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.marianogili.traceeditor.impl.TypeArtefactImpl
		 * @see com.marianogili.traceeditor.impl.TraceeditorPackageImpl#getTypeArtefact()
		 * @generated
		 */
		EClass TYPE_ARTEFACT = eINSTANCE.getTypeArtefact();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_ARTEFACT__DESCRIPTION = eINSTANCE.getTypeArtefact_Description();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_ARTEFACT__PARENT = eINSTANCE.getTypeArtefact_Parent();

		/**
		 * The meta object literal for the '{@link com.marianogili.traceeditor.impl.LinkTypeImpl <em>Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.marianogili.traceeditor.impl.LinkTypeImpl
		 * @see com.marianogili.traceeditor.impl.TraceeditorPackageImpl#getLinkType()
		 * @generated
		 */
		EClass LINK_TYPE = eINSTANCE.getLinkType();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_TYPE__PARENT = eINSTANCE.getLinkType_Parent();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__DESCRIPTION = eINSTANCE.getLinkType_Description();

		/**
		 * The meta object literal for the '{@link com.marianogili.traceeditor.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.marianogili.traceeditor.impl.ConfigurationImpl
		 * @see com.marianogili.traceeditor.impl.TraceeditorPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Link Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__LINK_TYPES = eINSTANCE.getConfiguration_LinkTypes();

		/**
		 * The meta object literal for the '<em><b>Type Artefacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__TYPE_ARTEFACTS = eINSTANCE.getConfiguration_TypeArtefacts();

	}

} //TraceeditorPackage
