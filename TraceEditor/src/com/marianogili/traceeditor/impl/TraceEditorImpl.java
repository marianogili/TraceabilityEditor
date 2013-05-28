/**
 */
package com.marianogili.traceeditor.impl;

import com.marianogili.traceeditor.Configuration;
import com.marianogili.traceeditor.Dashboard;
import com.marianogili.traceeditor.TraceEditor;
import com.marianogili.traceeditor.TraceeditorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Editor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.marianogili.traceeditor.impl.TraceEditorImpl#getDashboard <em>Dashboard</em>}</li>
 *   <li>{@link com.marianogili.traceeditor.impl.TraceEditorImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceEditorImpl extends EObjectImpl implements TraceEditor {
	/**
	 * The cached value of the '{@link #getDashboard() <em>Dashboard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDashboard()
	 * @generated
	 * @ordered
	 */
	protected Dashboard dashboard;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Configuration configuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceEditorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceeditorPackage.Literals.TRACE_EDITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dashboard getDashboard() {
		return dashboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDashboard(Dashboard newDashboard, NotificationChain msgs) {
		Dashboard oldDashboard = dashboard;
		dashboard = newDashboard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TraceeditorPackage.TRACE_EDITOR__DASHBOARD, oldDashboard, newDashboard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDashboard(Dashboard newDashboard) {
		if (newDashboard != dashboard) {
			NotificationChain msgs = null;
			if (dashboard != null)
				msgs = ((InternalEObject)dashboard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TraceeditorPackage.TRACE_EDITOR__DASHBOARD, null, msgs);
			if (newDashboard != null)
				msgs = ((InternalEObject)newDashboard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TraceeditorPackage.TRACE_EDITOR__DASHBOARD, null, msgs);
			msgs = basicSetDashboard(newDashboard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceeditorPackage.TRACE_EDITOR__DASHBOARD, newDashboard, newDashboard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(Configuration newConfiguration, NotificationChain msgs) {
		Configuration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TraceeditorPackage.TRACE_EDITOR__CONFIGURATION, oldConfiguration, newConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(Configuration newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TraceeditorPackage.TRACE_EDITOR__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TraceeditorPackage.TRACE_EDITOR__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceeditorPackage.TRACE_EDITOR__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceeditorPackage.TRACE_EDITOR__DASHBOARD:
				return basicSetDashboard(null, msgs);
			case TraceeditorPackage.TRACE_EDITOR__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
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
			case TraceeditorPackage.TRACE_EDITOR__DASHBOARD:
				return getDashboard();
			case TraceeditorPackage.TRACE_EDITOR__CONFIGURATION:
				return getConfiguration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TraceeditorPackage.TRACE_EDITOR__DASHBOARD:
				setDashboard((Dashboard)newValue);
				return;
			case TraceeditorPackage.TRACE_EDITOR__CONFIGURATION:
				setConfiguration((Configuration)newValue);
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
			case TraceeditorPackage.TRACE_EDITOR__DASHBOARD:
				setDashboard((Dashboard)null);
				return;
			case TraceeditorPackage.TRACE_EDITOR__CONFIGURATION:
				setConfiguration((Configuration)null);
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
			case TraceeditorPackage.TRACE_EDITOR__DASHBOARD:
				return dashboard != null;
			case TraceeditorPackage.TRACE_EDITOR__CONFIGURATION:
				return configuration != null;
		}
		return super.eIsSet(featureID);
	}

} //TraceEditorImpl
