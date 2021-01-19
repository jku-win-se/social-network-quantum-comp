/**
 */
package jku.se.quantum.computing.deployment.QCDeployment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jku.se.quantum.computing.deployment.QCDeployment.Deployment#getCredential <em>Credential</em>}</li>
 *   <li>{@link jku.se.quantum.computing.deployment.QCDeployment.Deployment#getAlgorithmexecution <em>Algorithmexecution</em>}</li>
 *   <li>{@link jku.se.quantum.computing.deployment.QCDeployment.Deployment#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see jku.se.quantum.computing.deployment.QCDeployment.QCDeploymentPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends EObject {
	/**
	 * Returns the value of the '<em><b>Credential</b></em>' containment reference list.
	 * The list contents are of type {@link jku.se.quantum.computing.deployment.QCDeployment.Credential}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credential</em>' containment reference list.
	 * @see jku.se.quantum.computing.deployment.QCDeployment.QCDeploymentPackage#getDeployment_Credential()
	 * @model containment="true"
	 * @generated
	 */
	EList<Credential> getCredential();

	/**
	 * Returns the value of the '<em><b>Algorithmexecution</b></em>' containment reference list.
	 * The list contents are of type {@link jku.se.quantum.computing.deployment.QCDeployment.AlgorithmExecution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithmexecution</em>' containment reference list.
	 * @see jku.se.quantum.computing.deployment.QCDeployment.QCDeploymentPackage#getDeployment_Algorithmexecution()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AlgorithmExecution> getAlgorithmexecution();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see jku.se.quantum.computing.deployment.QCDeployment.QCDeploymentPackage#getDeployment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link jku.se.quantum.computing.deployment.QCDeployment.Deployment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Deployment
