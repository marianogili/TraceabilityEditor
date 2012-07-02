/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package marianogili.model.traceabilityeditordiagram.impl;

import java.util.Collection;

import marianogili.model.traceabilityeditordiagram.Artefact;
import marianogili.model.traceabilityeditordiagram.TraceLink;
import marianogili.model.traceabilityeditordiagram.TraceabilityEditorDiagram;
import marianogili.model.traceabilityeditordiagram.TraceabilityeditordiagramPackage;
import marianogili.model.traceabilityeditordiagram.Transformation;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traceability Editor Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link marianogili.model.traceabilityeditordiagram.impl.TraceabilityEditorDiagramImpl#getTransformations <em>Transformations</em>}</li>
 *   <li>{@link marianogili.model.traceabilityeditordiagram.impl.TraceabilityEditorDiagramImpl#getTraceLinks <em>Trace Links</em>}</li>
 *   <li>{@link marianogili.model.traceabilityeditordiagram.impl.TraceabilityEditorDiagramImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link marianogili.model.traceabilityeditordiagram.impl.TraceabilityEditorDiagramImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceabilityEditorDiagramImpl extends EObjectImpl implements TraceabilityEditorDiagram {
	/**
	 * The cached value of the '{@link #getTransformations() <em>Transformations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformations()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation> transformations;

	/**
	 * The cached value of the '{@link #getTraceLinks() <em>Trace Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<TraceLink> traceLinks;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<Artefact> sources;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<Artefact> targets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceabilityEditorDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityeditordiagramPackage.Literals.TRACEABILITY_EDITOR_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformation> getTransformations() {
		if (transformations == null) {
			transformations = new EObjectContainmentEList<Transformation>(Transformation.class, this, TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__TRANSFORMATIONS);
		}
		return transformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraceLink> getTraceLinks() {
		if (traceLinks == null) {
			traceLinks = new EObjectContainmentEList<TraceLink>(TraceLink.class, this, TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__TRACE_LINKS);
		}
		return traceLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artefact> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentEList<Artefact>(Artefact.class, this, TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artefact> getTargets() {
		if (targets == null) {
			targets = new EObjectContainmentEList<Artefact>(Artefact.class, this, TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__TRANSFORMATIONS:
				return ((InternalEList<?>)getTransformations()).basicRemove(otherEnd, msgs);
			case TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__TRACE_LINKS:
				return ((InternalEList<?>)getTraceLinks()).basicRemove(otherEnd, msgs);
			case TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__SOURCES:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
			case TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__TARGETS:
				return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__TRANSFORMATIONS:
				return getTransformations();
			case TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__TRACE_LINKS:
				return getTraceLinks();
			case TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__SOURCES:
				return getSources();
			case TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__TARGETS:
				return getTargets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__TRANSFORMATIONS:
				getTransformations().clear();
				getTransformations().addAll((Collection<? extends Transformation>)newValue);
				return;
			case TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__TRACE_LINKS:
				getTraceLinks().clear();
				getTraceLinks().addAll((Collection<? extends TraceLink>)newValue);
				return;
			case TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends Artefact>)newValue);
				return;
			case TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends Artefact>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__TRANSFORMATIONS:
				getTransformations().clear();
				return;
			case TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__TRACE_LINKS:
				getTraceLinks().clear();
				return;
			case TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__SOURCES:
				getSources().clear();
				return;
			case TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__TARGETS:
				getTargets().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__TRANSFORMATIONS:
				return transformations != null && !transformations.isEmpty();
			case TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__TRACE_LINKS:
				return traceLinks != null && !traceLinks.isEmpty();
			case TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__SOURCES:
				return sources != null && !sources.isEmpty();
			case TraceabilityeditordiagramPackage.TRACEABILITY_EDITOR_DIAGRAM__TARGETS:
				return targets != null && !targets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceabilityEditorDiagramImpl
