/**
 */
package jku.se.social.network.mm.SocialNetwork;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jku.se.social.network.mm.SocialNetwork.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link jku.se.social.network.mm.SocialNetwork.Relationship#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see jku.se.social.network.mm.SocialNetwork.SocialNetworkPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Person)
	 * @see jku.se.social.network.mm.SocialNetwork.SocialNetworkPackage#getRelationship_Source()
	 * @model required="true"
	 * @generated
	 */
	Person getSource();

	/**
	 * Sets the value of the '{@link jku.se.social.network.mm.SocialNetwork.Relationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Person value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Person)
	 * @see jku.se.social.network.mm.SocialNetwork.SocialNetworkPackage#getRelationship_Target()
	 * @model required="true"
	 * @generated
	 */
	Person getTarget();

	/**
	 * Sets the value of the '{@link jku.se.social.network.mm.SocialNetwork.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Person value);

} // Relationship
