/**
 */
package jku.se.quantum.computing.deployment.QCDeployment.impl;

import jku.se.quantum.computing.deployment.QCDeployment.AlgorithmExecution;
import jku.se.quantum.computing.deployment.QCDeployment.QCDeploymentPackage;

import jku.se.quantum.computing.mm.QuantumComputing.QuantumAlgorithm;

import jku.se.social.network.mm.SocialNetwork.SocialNetwork;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algorithm Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jku.se.quantum.computing.deployment.QCDeployment.impl.AlgorithmExecutionImpl#getAlgorithmexecution <em>Algorithmexecution</em>}</li>
 *   <li>{@link jku.se.quantum.computing.deployment.QCDeployment.impl.AlgorithmExecutionImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlgorithmExecutionImpl extends MinimalEObjectImpl.Container implements AlgorithmExecution {
	/**
	 * The cached value of the '{@link #getAlgorithmexecution() <em>Algorithmexecution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmexecution()
	 * @generated
	 * @ordered
	 */
	protected QuantumAlgorithm algorithmexecution;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected SocialNetwork data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgorithmExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QCDeploymentPackage.Literals.ALGORITHM_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantumAlgorithm getAlgorithmexecution() {
		if (algorithmexecution != null && algorithmexecution.eIsProxy()) {
			InternalEObject oldAlgorithmexecution = (InternalEObject) algorithmexecution;
			algorithmexecution = (QuantumAlgorithm) eResolveProxy(oldAlgorithmexecution);
			if (algorithmexecution != oldAlgorithmexecution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							QCDeploymentPackage.ALGORITHM_EXECUTION__ALGORITHMEXECUTION, oldAlgorithmexecution,
							algorithmexecution));
			}
		}
		return algorithmexecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantumAlgorithm basicGetAlgorithmexecution() {
		return algorithmexecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithmexecution(QuantumAlgorithm newAlgorithmexecution) {
		QuantumAlgorithm oldAlgorithmexecution = algorithmexecution;
		algorithmexecution = newAlgorithmexecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QCDeploymentPackage.ALGORITHM_EXECUTION__ALGORITHMEXECUTION, oldAlgorithmexecution,
					algorithmexecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialNetwork getData() {
		if (data != null && data.eIsProxy()) {
			InternalEObject oldData = (InternalEObject) data;
			data = (SocialNetwork) eResolveProxy(oldData);
			if (data != oldData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							QCDeploymentPackage.ALGORITHM_EXECUTION__DATA, oldData, data));
			}
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialNetwork basicGetData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(SocialNetwork newData) {
		SocialNetwork oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QCDeploymentPackage.ALGORITHM_EXECUTION__DATA,
					oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QCDeploymentPackage.ALGORITHM_EXECUTION__ALGORITHMEXECUTION:
			if (resolve)
				return getAlgorithmexecution();
			return basicGetAlgorithmexecution();
		case QCDeploymentPackage.ALGORITHM_EXECUTION__DATA:
			if (resolve)
				return getData();
			return basicGetData();
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
		case QCDeploymentPackage.ALGORITHM_EXECUTION__ALGORITHMEXECUTION:
			setAlgorithmexecution((QuantumAlgorithm) newValue);
			return;
		case QCDeploymentPackage.ALGORITHM_EXECUTION__DATA:
			setData((SocialNetwork) newValue);
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
		case QCDeploymentPackage.ALGORITHM_EXECUTION__ALGORITHMEXECUTION:
			setAlgorithmexecution((QuantumAlgorithm) null);
			return;
		case QCDeploymentPackage.ALGORITHM_EXECUTION__DATA:
			setData((SocialNetwork) null);
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
		case QCDeploymentPackage.ALGORITHM_EXECUTION__ALGORITHMEXECUTION:
			return algorithmexecution != null;
		case QCDeploymentPackage.ALGORITHM_EXECUTION__DATA:
			return data != null;
		}
		return super.eIsSet(featureID);
	}

} //AlgorithmExecutionImpl
