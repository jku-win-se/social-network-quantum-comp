/**
 */
package jku.se.quantum.computing.deployment.QCDeployment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jku.se.quantum.computing.deployment.QCDeployment.QCDeploymentPackage
 * @generated
 */
public interface QCDeploymentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QCDeploymentFactory eINSTANCE = jku.se.quantum.computing.deployment.QCDeployment.impl.QCDeploymentFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment</em>'.
	 * @generated
	 */
	Deployment createDeployment();

	/**
	 * Returns a new object of class '<em>Algorithm Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Algorithm Execution</em>'.
	 * @generated
	 */
	AlgorithmExecution createAlgorithmExecution();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QCDeploymentPackage getQCDeploymentPackage();

} //QCDeploymentFactory
