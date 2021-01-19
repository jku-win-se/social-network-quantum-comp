/**
 */
package jku.se.quantum.computing.deployment.QCDeployment.util;

import jku.se.quantum.computing.deployment.QCDeployment.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jku.se.quantum.computing.deployment.QCDeployment.QCDeploymentPackage
 * @generated
 */
public class QCDeploymentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QCDeploymentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCDeploymentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QCDeploymentPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QCDeploymentSwitch<Adapter> modelSwitch = new QCDeploymentSwitch<Adapter>() {
		@Override
		public Adapter caseCredential(Credential object) {
			return createCredentialAdapter();
		}

		@Override
		public Adapter caseToken(Token object) {
			return createTokenAdapter();
		}

		@Override
		public Adapter caseBasicAuth(BasicAuth object) {
			return createBasicAuthAdapter();
		}

		@Override
		public Adapter caseDeployment(Deployment object) {
			return createDeploymentAdapter();
		}

		@Override
		public Adapter caseAlgorithmExecution(AlgorithmExecution object) {
			return createAlgorithmExecutionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link jku.se.quantum.computing.deployment.QCDeployment.Credential <em>Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jku.se.quantum.computing.deployment.QCDeployment.Credential
	 * @generated
	 */
	public Adapter createCredentialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jku.se.quantum.computing.deployment.QCDeployment.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jku.se.quantum.computing.deployment.QCDeployment.Token
	 * @generated
	 */
	public Adapter createTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jku.se.quantum.computing.deployment.QCDeployment.BasicAuth <em>Basic Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jku.se.quantum.computing.deployment.QCDeployment.BasicAuth
	 * @generated
	 */
	public Adapter createBasicAuthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jku.se.quantum.computing.deployment.QCDeployment.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jku.se.quantum.computing.deployment.QCDeployment.Deployment
	 * @generated
	 */
	public Adapter createDeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jku.se.quantum.computing.deployment.QCDeployment.AlgorithmExecution <em>Algorithm Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jku.se.quantum.computing.deployment.QCDeployment.AlgorithmExecution
	 * @generated
	 */
	public Adapter createAlgorithmExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QCDeploymentAdapterFactory
