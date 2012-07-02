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
import marianogili.model.traceabilityeditordiagram.TraceabilityeditordiagramPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link marianogili.model.traceabilityeditordiagram.impl.TraceLinkImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link marianogili.model.traceabilityeditordiagram.impl.TraceLinkImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceLinkImpl extends DiagramElementImpl implements TraceLink {
	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<Artefact> sources;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
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
	protected TraceLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityeditordiagramPackage.Literals.TRACE_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artefact> getSources() {
		if (sources == null) {
			sources = new EObjectResolvingEList<Artefact>(Artefact.class, this, TraceabilityeditordiagramPackage.TRACE_LINK__SOURCES);
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
			targets = new EObjectResolvingEList<Artefact>(Artefact.class, this, TraceabilityeditordiagramPackage.TRACE_LINK__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraceabilityeditordiagramPackage.TRACE_LINK__SOURCES:
				return getSources();
			case TraceabilityeditordiagramPackage.TRACE_LINK__TARGETS:
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
			case TraceabilityeditordiagramPackage.TRACE_LINK__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends Artefact>)newValue);
				return;
			case TraceabilityeditordiagramPackage.TRACE_LINK__TARGETS:
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
			case TraceabilityeditordiagramPackage.TRACE_LINK__SOURCES:
				getSources().clear();
				return;
			case TraceabilityeditordiagramPackage.TRACE_LINK__TARGETS:
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
			case TraceabilityeditordiagramPackage.TRACE_LINK__SOURCES:
				return sources != null && !sources.isEmpty();
			case TraceabilityeditordiagramPackage.TRACE_LINK__TARGETS:
				return targets != null && !targets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceLinkImpl
