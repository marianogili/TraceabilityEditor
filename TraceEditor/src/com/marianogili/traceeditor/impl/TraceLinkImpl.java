/**
 */
package com.marianogili.traceeditor.impl;

import com.marianogili.traceeditor.Artefact;
import com.marianogili.traceeditor.LinkType;
import com.marianogili.traceeditor.TraceLink;
import com.marianogili.traceeditor.TraceeditorPackage;
import com.marianogili.traceeditor.Transformation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.marianogili.traceeditor.impl.TraceLinkImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link com.marianogili.traceeditor.impl.TraceLinkImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link com.marianogili.traceeditor.impl.TraceLinkImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.marianogili.traceeditor.impl.TraceLinkImpl#getTransformation <em>Transformation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceLinkImpl extends NamedElementImpl implements TraceLink {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected LinkType type;

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
		return TraceeditorPackage.Literals.TRACE_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artefact> getSources() {
		if (sources == null) {
			sources = new EObjectResolvingEList<Artefact>(Artefact.class, this, TraceeditorPackage.TRACE_LINK__SOURCES);
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
			targets = new EObjectResolvingEList<Artefact>(Artefact.class, this, TraceeditorPackage.TRACE_LINK__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (LinkType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TraceeditorPackage.TRACE_LINK__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(LinkType newType) {
		LinkType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceeditorPackage.TRACE_LINK__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation getTransformation() {
		if (eContainerFeatureID() != TraceeditorPackage.TRACE_LINK__TRANSFORMATION) return null;
		return (Transformation)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation(Transformation newTransformation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTransformation, TraceeditorPackage.TRACE_LINK__TRANSFORMATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(Transformation newTransformation) {
		if (newTransformation != eInternalContainer() || (eContainerFeatureID() != TraceeditorPackage.TRACE_LINK__TRANSFORMATION && newTransformation != null)) {
			if (EcoreUtil.isAncestor(this, newTransformation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTransformation != null)
				msgs = ((InternalEObject)newTransformation).eInverseAdd(this, TraceeditorPackage.TRANSFORMATION__TRACE_LINKS, Transformation.class, msgs);
			msgs = basicSetTransformation(newTransformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceeditorPackage.TRACE_LINK__TRANSFORMATION, newTransformation, newTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceeditorPackage.TRACE_LINK__TRANSFORMATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTransformation((Transformation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceeditorPackage.TRACE_LINK__TRANSFORMATION:
				return basicSetTransformation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TraceeditorPackage.TRACE_LINK__TRANSFORMATION:
				return eInternalContainer().eInverseRemove(this, TraceeditorPackage.TRANSFORMATION__TRACE_LINKS, Transformation.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraceeditorPackage.TRACE_LINK__SOURCES:
				return getSources();
			case TraceeditorPackage.TRACE_LINK__TARGETS:
				return getTargets();
			case TraceeditorPackage.TRACE_LINK__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case TraceeditorPackage.TRACE_LINK__TRANSFORMATION:
				return getTransformation();
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
			case TraceeditorPackage.TRACE_LINK__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends Artefact>)newValue);
				return;
			case TraceeditorPackage.TRACE_LINK__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends Artefact>)newValue);
				return;
			case TraceeditorPackage.TRACE_LINK__TYPE:
				setType((LinkType)newValue);
				return;
			case TraceeditorPackage.TRACE_LINK__TRANSFORMATION:
				setTransformation((Transformation)newValue);
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
			case TraceeditorPackage.TRACE_LINK__SOURCES:
				getSources().clear();
				return;
			case TraceeditorPackage.TRACE_LINK__TARGETS:
				getTargets().clear();
				return;
			case TraceeditorPackage.TRACE_LINK__TYPE:
				setType((LinkType)null);
				return;
			case TraceeditorPackage.TRACE_LINK__TRANSFORMATION:
				setTransformation((Transformation)null);
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
			case TraceeditorPackage.TRACE_LINK__SOURCES:
				return sources != null && !sources.isEmpty();
			case TraceeditorPackage.TRACE_LINK__TARGETS:
				return targets != null && !targets.isEmpty();
			case TraceeditorPackage.TRACE_LINK__TYPE:
				return type != null;
			case TraceeditorPackage.TRACE_LINK__TRANSFORMATION:
				return getTransformation() != null;
		}
		return super.eIsSet(featureID);
	}

} //TraceLinkImpl
