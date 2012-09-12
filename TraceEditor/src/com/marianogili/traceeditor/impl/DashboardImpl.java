/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.marianogili.traceeditor.impl;

import com.marianogili.traceeditor.Artefact;
import com.marianogili.traceeditor.Dashboard;
import com.marianogili.traceeditor.TraceLink;
import com.marianogili.traceeditor.TraceeditorPackage;
import com.marianogili.traceeditor.Transformation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dashboard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.marianogili.traceeditor.impl.DashboardImpl#getSourceArtefacts <em>Source Artefacts</em>}</li>
 *   <li>{@link com.marianogili.traceeditor.impl.DashboardImpl#getTargetArtefacts <em>Target Artefacts</em>}</li>
 *   <li>{@link com.marianogili.traceeditor.impl.DashboardImpl#getTraceLinks <em>Trace Links</em>}</li>
 *   <li>{@link com.marianogili.traceeditor.impl.DashboardImpl#getTransformations <em>Transformations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DashboardImpl extends EObjectImpl implements Dashboard {
	/**
	 * The cached value of the '{@link #getSourceArtefacts() <em>Source Artefacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceArtefacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artefact> sourceArtefacts;

	/**
	 * The cached value of the '{@link #getTargetArtefacts() <em>Target Artefacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetArtefacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artefact> targetArtefacts;

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
	 * The cached value of the '{@link #getTransformations() <em>Transformations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformations()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation> transformations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DashboardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceeditorPackage.Literals.DASHBOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artefact> getSourceArtefacts() {
		if (sourceArtefacts == null) {
			sourceArtefacts = new EObjectContainmentEList.Resolving<Artefact>(Artefact.class, this, TraceeditorPackage.DASHBOARD__SOURCE_ARTEFACTS);
		}
		return sourceArtefacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artefact> getTargetArtefacts() {
		if (targetArtefacts == null) {
			targetArtefacts = new EObjectContainmentEList.Resolving<Artefact>(Artefact.class, this, TraceeditorPackage.DASHBOARD__TARGET_ARTEFACTS);
		}
		return targetArtefacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraceLink> getTraceLinks() {
		if (traceLinks == null) {
			traceLinks = new EObjectContainmentEList.Resolving<TraceLink>(TraceLink.class, this, TraceeditorPackage.DASHBOARD__TRACE_LINKS);
		}
		return traceLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformation> getTransformations() {
		if (transformations == null) {
			transformations = new EObjectContainmentEList.Resolving<Transformation>(Transformation.class, this, TraceeditorPackage.DASHBOARD__TRANSFORMATIONS);
		}
		return transformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceeditorPackage.DASHBOARD__SOURCE_ARTEFACTS:
				return ((InternalEList<?>)getSourceArtefacts()).basicRemove(otherEnd, msgs);
			case TraceeditorPackage.DASHBOARD__TARGET_ARTEFACTS:
				return ((InternalEList<?>)getTargetArtefacts()).basicRemove(otherEnd, msgs);
			case TraceeditorPackage.DASHBOARD__TRACE_LINKS:
				return ((InternalEList<?>)getTraceLinks()).basicRemove(otherEnd, msgs);
			case TraceeditorPackage.DASHBOARD__TRANSFORMATIONS:
				return ((InternalEList<?>)getTransformations()).basicRemove(otherEnd, msgs);
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
			case TraceeditorPackage.DASHBOARD__SOURCE_ARTEFACTS:
				return getSourceArtefacts();
			case TraceeditorPackage.DASHBOARD__TARGET_ARTEFACTS:
				return getTargetArtefacts();
			case TraceeditorPackage.DASHBOARD__TRACE_LINKS:
				return getTraceLinks();
			case TraceeditorPackage.DASHBOARD__TRANSFORMATIONS:
				return getTransformations();
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
			case TraceeditorPackage.DASHBOARD__SOURCE_ARTEFACTS:
				getSourceArtefacts().clear();
				getSourceArtefacts().addAll((Collection<? extends Artefact>)newValue);
				return;
			case TraceeditorPackage.DASHBOARD__TARGET_ARTEFACTS:
				getTargetArtefacts().clear();
				getTargetArtefacts().addAll((Collection<? extends Artefact>)newValue);
				return;
			case TraceeditorPackage.DASHBOARD__TRACE_LINKS:
				getTraceLinks().clear();
				getTraceLinks().addAll((Collection<? extends TraceLink>)newValue);
				return;
			case TraceeditorPackage.DASHBOARD__TRANSFORMATIONS:
				getTransformations().clear();
				getTransformations().addAll((Collection<? extends Transformation>)newValue);
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
			case TraceeditorPackage.DASHBOARD__SOURCE_ARTEFACTS:
				getSourceArtefacts().clear();
				return;
			case TraceeditorPackage.DASHBOARD__TARGET_ARTEFACTS:
				getTargetArtefacts().clear();
				return;
			case TraceeditorPackage.DASHBOARD__TRACE_LINKS:
				getTraceLinks().clear();
				return;
			case TraceeditorPackage.DASHBOARD__TRANSFORMATIONS:
				getTransformations().clear();
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
			case TraceeditorPackage.DASHBOARD__SOURCE_ARTEFACTS:
				return sourceArtefacts != null && !sourceArtefacts.isEmpty();
			case TraceeditorPackage.DASHBOARD__TARGET_ARTEFACTS:
				return targetArtefacts != null && !targetArtefacts.isEmpty();
			case TraceeditorPackage.DASHBOARD__TRACE_LINKS:
				return traceLinks != null && !traceLinks.isEmpty();
			case TraceeditorPackage.DASHBOARD__TRANSFORMATIONS:
				return transformations != null && !transformations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DashboardImpl
