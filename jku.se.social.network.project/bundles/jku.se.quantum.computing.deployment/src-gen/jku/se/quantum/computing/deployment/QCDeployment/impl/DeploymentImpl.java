/**
 */
package jku.se.quantum.computing.deployment.QCDeployment.impl;

import java.util.Collection;

import jku.se.quantum.computing.deployment.QCDeployment.AlgorithmExecution;
import jku.se.quantum.computing.deployment.QCDeployment.Credential;
import jku.se.quantum.computing.deployment.QCDeployment.Deployment;
import jku.se.quantum.computing.deployment.QCDeployment.QCDeploymentPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jku.se.quantum.computing.deployment.QCDeployment.impl.DeploymentImpl#getCredential <em>Credential</em>}</li>
 *   <li>{@link jku.se.quantum.computing.deployment.QCDeployment.impl.DeploymentImpl#getAlgorithmexecution <em>Algorithmexecution</em>}</li>
 *   <li>{@link jku.se.quantum.computing.deployment.QCDeployment.impl.DeploymentImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentImpl extends MinimalEObjectImpl.Container implements Deployment {
	/**
	 * The cached value of the '{@link #getCredential() <em>Credential</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredential()
	 * @generated
	 * @ordered
	 */
	protected EList<Credential> credential;

	/**
	 * The cached value of the '{@link #getAlgorithmexecution() <em>Algorithmexecution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmexecution()
	 * @generated
	 * @ordered
	 */
	protected EList<AlgorithmExecution> algorithmexecution;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QCDeploymentPackage.Literals.DEPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Credential> getCredential() {
		if (credential == null) {
			credential = new EObjectContainmentEList<Credential>(Credential.class, this,
					QCDeploymentPackage.DEPLOYMENT__CREDENTIAL);
		}
		return credential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlgorithmExecution> getAlgorithmexecution() {
		if (algorithmexecution == null) {
			algorithmexecution = new EObjectContainmentEList<AlgorithmExecution>(AlgorithmExecution.class, this,
					QCDeploymentPackage.DEPLOYMENT__ALGORITHMEXECUTION);
		}
		return algorithmexecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QCDeploymentPackage.DEPLOYMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QCDeploymentPackage.DEPLOYMENT__CREDENTIAL:
			return ((InternalEList<?>) getCredential()).basicRemove(otherEnd, msgs);
		case QCDeploymentPackage.DEPLOYMENT__ALGORITHMEXECUTION:
			return ((InternalEList<?>) getAlgorithmexecution()).basicRemove(otherEnd, msgs);
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
		case QCDeploymentPackage.DEPLOYMENT__CREDENTIAL:
			return getCredential();
		case QCDeploymentPackage.DEPLOYMENT__ALGORITHMEXECUTION:
			return getAlgorithmexecution();
		case QCDeploymentPackage.DEPLOYMENT__NAME:
			return getName();
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
		case QCDeploymentPackage.DEPLOYMENT__CREDENTIAL:
			getCredential().clear();
			getCredential().addAll((Collection<? extends Credential>) newValue);
			return;
		case QCDeploymentPackage.DEPLOYMENT__ALGORITHMEXECUTION:
			getAlgorithmexecution().clear();
			getAlgorithmexecution().addAll((Collection<? extends AlgorithmExecution>) newValue);
			return;
		case QCDeploymentPackage.DEPLOYMENT__NAME:
			setName((String) newValue);
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
		case QCDeploymentPackage.DEPLOYMENT__CREDENTIAL:
			getCredential().clear();
			return;
		case QCDeploymentPackage.DEPLOYMENT__ALGORITHMEXECUTION:
			getAlgorithmexecution().clear();
			return;
		case QCDeploymentPackage.DEPLOYMENT__NAME:
			setName(NAME_EDEFAULT);
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
		case QCDeploymentPackage.DEPLOYMENT__CREDENTIAL:
			return credential != null && !credential.isEmpty();
		case QCDeploymentPackage.DEPLOYMENT__ALGORITHMEXECUTION:
			return algorithmexecution != null && !algorithmexecution.isEmpty();
		case QCDeploymentPackage.DEPLOYMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DeploymentImpl
