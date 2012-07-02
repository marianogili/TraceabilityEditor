/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package marianogili.model.traceabilityeditordiagram.impl;

import marianogili.model.traceabilityeditordiagram.Dibujo;
import marianogili.model.traceabilityeditordiagram.TraceabilityEditorDiagram;
import marianogili.model.traceabilityeditordiagram.TraceabilityeditordiagramPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dibujo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link marianogili.model.traceabilityeditordiagram.impl.DibujoImpl#getEReference0 <em>EReference0</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DibujoImpl extends EObjectImpl implements Dibujo {
	/**
	 * The cached value of the '{@link #getEReference0() <em>EReference0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference0()
	 * @generated
	 * @ordered
	 */
	protected TraceabilityEditorDiagram eReference0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DibujoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityeditordiagramPackage.Literals.DIBUJO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityEditorDiagram getEReference0() {
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEReference0(TraceabilityEditorDiagram newEReference0, NotificationChain msgs) {
		TraceabilityEditorDiagram oldEReference0 = eReference0;
		eReference0 = newEReference0;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TraceabilityeditordiagramPackage.DIBUJO__EREFERENCE0, oldEReference0, newEReference0);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference0(TraceabilityEditorDiagram newEReference0) {
		if (newEReference0 != eReference0) {
			NotificationChain msgs = null;
			if (eReference0 != null)
				msgs = ((InternalEObject)eReference0).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TraceabilityeditordiagramPackage.DIBUJO__EREFERENCE0, null, msgs);
			if (newEReference0 != null)
				msgs = ((InternalEObject)newEReference0).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TraceabilityeditordiagramPackage.DIBUJO__EREFERENCE0, null, msgs);
			msgs = basicSetEReference0(newEReference0, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityeditordiagramPackage.DIBUJO__EREFERENCE0, newEReference0, newEReference0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceabilityeditordiagramPackage.DIBUJO__EREFERENCE0:
				return basicSetEReference0(null, msgs);
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
			case TraceabilityeditordiagramPackage.DIBUJO__EREFERENCE0:
				return getEReference0();
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
			case TraceabilityeditordiagramPackage.DIBUJO__EREFERENCE0:
				setEReference0((TraceabilityEditorDiagram)newValue);
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
			case TraceabilityeditordiagramPackage.DIBUJO__EREFERENCE0:
				setEReference0((TraceabilityEditorDiagram)null);
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
			case TraceabilityeditordiagramPackage.DIBUJO__EREFERENCE0:
				return eReference0 != null;
		}
		return super.eIsSet(featureID);
	}

} //DibujoImpl
