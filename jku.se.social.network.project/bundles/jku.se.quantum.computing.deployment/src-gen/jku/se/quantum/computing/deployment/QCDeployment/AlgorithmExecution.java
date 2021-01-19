/**
 */
package jku.se.quantum.computing.deployment.QCDeployment;

import jku.se.quantum.computing.mm.QuantumComputing.QuantumAlgorithm;

import jku.se.social.network.mm.SocialNetwork.SocialNetwork;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algorithm Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jku.se.quantum.computing.deployment.QCDeployment.AlgorithmExecution#getAlgorithmexecution <em>Algorithmexecution</em>}</li>
 *   <li>{@link jku.se.quantum.computing.deployment.QCDeployment.AlgorithmExecution#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see jku.se.quantum.computing.deployment.QCDeployment.QCDeploymentPackage#getAlgorithmExecution()
 * @model
 * @generated
 */
public interface AlgorithmExecution extends EObject {
	/**
	 * Returns the value of the '<em><b>Algorithmexecution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithmexecution</em>' reference.
	 * @see #setAlgorithmexecution(QuantumAlgorithm)
	 * @see jku.se.quantum.computing.deployment.QCDeployment.QCDeploymentPackage#getAlgorithmExecution_Algorithmexecution()
	 * @model required="true"
	 * @generated
	 */
	QuantumAlgorithm getAlgorithmexecution();

	/**
	 * Sets the value of the '{@link jku.se.quantum.computing.deployment.QCDeployment.AlgorithmExecution#getAlgorithmexecution <em>Algorithmexecution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithmexecution</em>' reference.
	 * @see #getAlgorithmexecution()
	 * @generated
	 */
	void setAlgorithmexecution(QuantumAlgorithm value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(SocialNetwork)
	 * @see jku.se.quantum.computing.deployment.QCDeployment.QCDeploymentPackage#getAlgorithmExecution_Data()
	 * @model required="true"
	 * @generated
	 */
	SocialNetwork getData();

	/**
	 * Sets the value of the '{@link jku.se.quantum.computing.deployment.QCDeployment.AlgorithmExecution#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(SocialNetwork value);

} // AlgorithmExecution
