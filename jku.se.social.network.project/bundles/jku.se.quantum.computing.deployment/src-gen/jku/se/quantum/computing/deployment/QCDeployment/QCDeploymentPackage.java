/**
 */
package jku.se.quantum.computing.deployment.QCDeployment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jku.se.quantum.computing.deployment.QCDeployment.QCDeploymentFactory
 * @model kind="package"
 * @generated
 */
public interface QCDeploymentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "QCDeployment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://quantum-computing/deployment/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "QCDeployment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QCDeploymentPackage eINSTANCE = jku.se.quantum.computing.deployment.QCDeployment.impl.QCDeploymentPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link jku.se.quantum.computing.deployment.QCDeployment.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jku.se.quantum.computing.deployment.QCDeployment.impl.DeploymentImpl
	 * @see jku.se.quantum.computing.deployment.QCDeployment.impl.QCDeploymentPackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 0;

	/**
	 * The feature id for the '<em><b>Algorithmexecution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__ALGORITHMEXECUTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jku.se.quantum.computing.deployment.QCDeployment.impl.AlgorithmExecutionImpl <em>Algorithm Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jku.se.quantum.computing.deployment.QCDeployment.impl.AlgorithmExecutionImpl
	 * @see jku.se.quantum.computing.deployment.QCDeployment.impl.QCDeploymentPackageImpl#getAlgorithmExecution()
	 * @generated
	 */
	int ALGORITHM_EXECUTION = 1;

	/**
	 * The feature id for the '<em><b>Algorithmexecution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_EXECUTION__ALGORITHMEXECUTION = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_EXECUTION__DATA = 1;

	/**
	 * The number of structural features of the '<em>Algorithm Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_EXECUTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Algorithm Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_EXECUTION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link jku.se.quantum.computing.deployment.QCDeployment.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see jku.se.quantum.computing.deployment.QCDeployment.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the containment reference list '{@link jku.se.quantum.computing.deployment.QCDeployment.Deployment#getAlgorithmexecution <em>Algorithmexecution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Algorithmexecution</em>'.
	 * @see jku.se.quantum.computing.deployment.QCDeployment.Deployment#getAlgorithmexecution()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Algorithmexecution();

	/**
	 * Returns the meta object for the attribute '{@link jku.se.quantum.computing.deployment.QCDeployment.Deployment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jku.se.quantum.computing.deployment.QCDeployment.Deployment#getName()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Name();

	/**
	 * Returns the meta object for class '{@link jku.se.quantum.computing.deployment.QCDeployment.AlgorithmExecution <em>Algorithm Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithm Execution</em>'.
	 * @see jku.se.quantum.computing.deployment.QCDeployment.AlgorithmExecution
	 * @generated
	 */
	EClass getAlgorithmExecution();

	/**
	 * Returns the meta object for the reference '{@link jku.se.quantum.computing.deployment.QCDeployment.AlgorithmExecution#getAlgorithmexecution <em>Algorithmexecution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Algorithmexecution</em>'.
	 * @see jku.se.quantum.computing.deployment.QCDeployment.AlgorithmExecution#getAlgorithmexecution()
	 * @see #getAlgorithmExecution()
	 * @generated
	 */
	EReference getAlgorithmExecution_Algorithmexecution();

	/**
	 * Returns the meta object for the reference '{@link jku.se.quantum.computing.deployment.QCDeployment.AlgorithmExecution#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see jku.se.quantum.computing.deployment.QCDeployment.AlgorithmExecution#getData()
	 * @see #getAlgorithmExecution()
	 * @generated
	 */
	EReference getAlgorithmExecution_Data();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QCDeploymentFactory getQCDeploymentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link jku.se.quantum.computing.deployment.QCDeployment.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jku.se.quantum.computing.deployment.QCDeployment.impl.DeploymentImpl
		 * @see jku.se.quantum.computing.deployment.QCDeployment.impl.QCDeploymentPackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Algorithmexecution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__ALGORITHMEXECUTION = eINSTANCE.getDeployment_Algorithmexecution();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__NAME = eINSTANCE.getDeployment_Name();

		/**
		 * The meta object literal for the '{@link jku.se.quantum.computing.deployment.QCDeployment.impl.AlgorithmExecutionImpl <em>Algorithm Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jku.se.quantum.computing.deployment.QCDeployment.impl.AlgorithmExecutionImpl
		 * @see jku.se.quantum.computing.deployment.QCDeployment.impl.QCDeploymentPackageImpl#getAlgorithmExecution()
		 * @generated
		 */
		EClass ALGORITHM_EXECUTION = eINSTANCE.getAlgorithmExecution();

		/**
		 * The meta object literal for the '<em><b>Algorithmexecution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM_EXECUTION__ALGORITHMEXECUTION = eINSTANCE.getAlgorithmExecution_Algorithmexecution();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM_EXECUTION__DATA = eINSTANCE.getAlgorithmExecution_Data();

	}

} //QCDeploymentPackage
