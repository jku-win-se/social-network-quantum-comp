/**
 */
package jku.se.quantum.computing.deployment.QCDeployment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Auth</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jku.se.quantum.computing.deployment.QCDeployment.BasicAuth#getUsername <em>Username</em>}</li>
 *   <li>{@link jku.se.quantum.computing.deployment.QCDeployment.BasicAuth#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see jku.se.quantum.computing.deployment.QCDeployment.QCDeploymentPackage#getBasicAuth()
 * @model
 * @generated
 */
public interface BasicAuth extends Credential {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see jku.se.quantum.computing.deployment.QCDeployment.QCDeploymentPackage#getBasicAuth_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link jku.se.quantum.computing.deployment.QCDeployment.BasicAuth#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see jku.se.quantum.computing.deployment.QCDeployment.QCDeploymentPackage#getBasicAuth_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link jku.se.quantum.computing.deployment.QCDeployment.BasicAuth#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // BasicAuth
