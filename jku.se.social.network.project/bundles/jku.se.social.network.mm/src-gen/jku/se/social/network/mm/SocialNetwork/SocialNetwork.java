/**
 */
package jku.se.social.network.mm.SocialNetwork;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Social Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jku.se.social.network.mm.SocialNetwork.SocialNetwork#getPersons <em>Persons</em>}</li>
 *   <li>{@link jku.se.social.network.mm.SocialNetwork.SocialNetwork#getClusters <em>Clusters</em>}</li>
 *   <li>{@link jku.se.social.network.mm.SocialNetwork.SocialNetwork#getRelationships <em>Relationships</em>}</li>
 * </ul>
 *
 * @see jku.se.social.network.mm.SocialNetwork.SocialNetworkPackage#getSocialNetwork()
 * @model
 * @generated
 */
public interface SocialNetwork extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link jku.se.social.network.mm.SocialNetwork.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see jku.se.social.network.mm.SocialNetwork.SocialNetworkPackage#getSocialNetwork_Persons()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * Returns the value of the '<em><b>Clusters</b></em>' containment reference list.
	 * The list contents are of type {@link jku.se.social.network.mm.SocialNetwork.Cluster}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clusters</em>' containment reference list.
	 * @see jku.se.social.network.mm.SocialNetwork.SocialNetworkPackage#getSocialNetwork_Clusters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cluster> getClusters();

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link jku.se.social.network.mm.SocialNetwork.Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see jku.se.social.network.mm.SocialNetwork.SocialNetworkPackage#getSocialNetwork_Relationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationship> getRelationships();

} // SocialNetwork
