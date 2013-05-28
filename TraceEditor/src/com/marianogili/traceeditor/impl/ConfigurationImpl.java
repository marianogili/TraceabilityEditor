/**
 */
package com.marianogili.traceeditor.impl;

import com.marianogili.traceeditor.Configuration;
import com.marianogili.traceeditor.LinkType;
import com.marianogili.traceeditor.TraceeditorPackage;
import com.marianogili.traceeditor.TypeArtefact;

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
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.marianogili.traceeditor.impl.ConfigurationImpl#getLinkTypes <em>Link Types</em>}</li>
 *   <li>{@link com.marianogili.traceeditor.impl.ConfigurationImpl#getTypeArtefacts <em>Type Artefacts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationImpl extends EObjectImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getLinkTypes() <em>Link Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkType> linkTypes;

	/**
	 * The cached value of the '{@link #getTypeArtefacts() <em>Type Artefacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeArtefacts()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeArtefact> typeArtefacts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceeditorPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkType> getLinkTypes() {
		if (linkTypes == null) {
			linkTypes = new EObjectContainmentEList<LinkType>(LinkType.class, this, TraceeditorPackage.CONFIGURATION__LINK_TYPES);
		}
		return linkTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeArtefact> getTypeArtefacts() {
		if (typeArtefacts == null) {
			typeArtefacts = new EObjectContainmentEList<TypeArtefact>(TypeArtefact.class, this, TraceeditorPackage.CONFIGURATION__TYPE_ARTEFACTS);
		}
		return typeArtefacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceeditorPackage.CONFIGURATION__LINK_TYPES:
				return ((InternalEList<?>)getLinkTypes()).basicRemove(otherEnd, msgs);
			case TraceeditorPackage.CONFIGURATION__TYPE_ARTEFACTS:
				return ((InternalEList<?>)getTypeArtefacts()).basicRemove(otherEnd, msgs);
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
			case TraceeditorPackage.CONFIGURATION__LINK_TYPES:
				return getLinkTypes();
			case TraceeditorPackage.CONFIGURATION__TYPE_ARTEFACTS:
				return getTypeArtefacts();
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
			case TraceeditorPackage.CONFIGURATION__LINK_TYPES:
				getLinkTypes().clear();
				getLinkTypes().addAll((Collection<? extends LinkType>)newValue);
				return;
			case TraceeditorPackage.CONFIGURATION__TYPE_ARTEFACTS:
				getTypeArtefacts().clear();
				getTypeArtefacts().addAll((Collection<? extends TypeArtefact>)newValue);
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
			case TraceeditorPackage.CONFIGURATION__LINK_TYPES:
				getLinkTypes().clear();
				return;
			case TraceeditorPackage.CONFIGURATION__TYPE_ARTEFACTS:
				getTypeArtefacts().clear();
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
			case TraceeditorPackage.CONFIGURATION__LINK_TYPES:
				return linkTypes != null && !linkTypes.isEmpty();
			case TraceeditorPackage.CONFIGURATION__TYPE_ARTEFACTS:
				return typeArtefacts != null && !typeArtefacts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
