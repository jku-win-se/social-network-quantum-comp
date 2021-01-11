/**
 */
package jku.se.social.network.mm.SocialNetwork;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jku.se.social.network.mm.SocialNetwork.Cluster#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @see jku.se.social.network.mm.SocialNetwork.SocialNetworkPackage#getCluster()
 * @model
 * @generated
 */
public interface Cluster extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Persons</b></em>' reference list.
	 * The list contents are of type {@link jku.se.social.network.mm.SocialNetwork.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' reference list.
	 * @see jku.se.social.network.mm.SocialNetwork.SocialNetworkPackage#getCluster_Persons()
	 * @model required="true"
	 * @generated
	 */
	EList<Person> getPersons();

} // Cluster
