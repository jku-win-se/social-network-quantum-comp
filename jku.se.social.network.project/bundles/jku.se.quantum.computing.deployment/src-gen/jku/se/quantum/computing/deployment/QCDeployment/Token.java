/**
 */
package jku.se.quantum.computing.deployment.QCDeployment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jku.se.quantum.computing.deployment.QCDeployment.Token#getTokenValue <em>Token Value</em>}</li>
 * </ul>
 *
 * @see jku.se.quantum.computing.deployment.QCDeployment.QCDeploymentPackage#getToken()
 * @model
 * @generated
 */
public interface Token extends Credential {
	/**
	 * Returns the value of the '<em><b>Token Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Value</em>' attribute.
	 * @see #setTokenValue(String)
	 * @see jku.se.quantum.computing.deployment.QCDeployment.QCDeploymentPackage#getToken_TokenValue()
	 * @model
	 * @generated
	 */
	String getTokenValue();

	/**
	 * Sets the value of the '{@link jku.se.quantum.computing.deployment.QCDeployment.Token#getTokenValue <em>Token Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Value</em>' attribute.
	 * @see #getTokenValue()
	 * @generated
	 */
	void setTokenValue(String value);

} // Token
