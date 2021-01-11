/**
 */
package jku.se.social.network.mm.SocialNetwork.impl;

import java.util.Collection;

import jku.se.social.network.mm.SocialNetwork.Cluster;
import jku.se.social.network.mm.SocialNetwork.Person;
import jku.se.social.network.mm.SocialNetwork.Relationship;
import jku.se.social.network.mm.SocialNetwork.SocialNetwork;
import jku.se.social.network.mm.SocialNetwork.SocialNetworkPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Social Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jku.se.social.network.mm.SocialNetwork.impl.SocialNetworkImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link jku.se.social.network.mm.SocialNetwork.impl.SocialNetworkImpl#getClusters <em>Clusters</em>}</li>
 *   <li>{@link jku.se.social.network.mm.SocialNetwork.impl.SocialNetworkImpl#getRelationships <em>Relationships</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SocialNetworkImpl extends NamedElementImpl implements SocialNetwork {
	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> persons;

	/**
	 * The cached value of the '{@link #getClusters() <em>Clusters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusters()
	 * @generated
	 * @ordered
	 */
	protected EList<Cluster> clusters;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> relationships;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SocialNetworkPackage.Literals.SOCIAL_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPersons() {
		if (persons == null) {
			persons = new EObjectContainmentEList<Person>(Person.class, this,
					SocialNetworkPackage.SOCIAL_NETWORK__PERSONS);
		}
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cluster> getClusters() {
		if (clusters == null) {
			clusters = new EObjectContainmentEList<Cluster>(Cluster.class, this,
					SocialNetworkPackage.SOCIAL_NETWORK__CLUSTERS);
		}
		return clusters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectContainmentEList<Relationship>(Relationship.class, this,
					SocialNetworkPackage.SOCIAL_NETWORK__RELATIONSHIPS);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SocialNetworkPackage.SOCIAL_NETWORK__PERSONS:
			return ((InternalEList<?>) getPersons()).basicRemove(otherEnd, msgs);
		case SocialNetworkPackage.SOCIAL_NETWORK__CLUSTERS:
			return ((InternalEList<?>) getClusters()).basicRemove(otherEnd, msgs);
		case SocialNetworkPackage.SOCIAL_NETWORK__RELATIONSHIPS:
			return ((InternalEList<?>) getRelationships()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SocialNetworkPackage.SOCIAL_NETWORK__PERSONS:
			return getPersons();
		case SocialNetworkPackage.SOCIAL_NETWORK__CLUSTERS:
			return getClusters();
		case SocialNetworkPackage.SOCIAL_NETWORK__RELATIONSHIPS:
			return getRelationships();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SocialNetworkPackage.SOCIAL_NETWORK__PERSONS:
			getPersons().clear();
			getPersons().addAll((Collection<? extends Person>) newValue);
			return;
		case SocialNetworkPackage.SOCIAL_NETWORK__CLUSTERS:
			getClusters().clear();
			getClusters().addAll((Collection<? extends Cluster>) newValue);
			return;
		case SocialNetworkPackage.SOCIAL_NETWORK__RELATIONSHIPS:
			getRelationships().clear();
			getRelationships().addAll((Collection<? extends Relationship>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SocialNetworkPackage.SOCIAL_NETWORK__PERSONS:
			getPersons().clear();
			return;
		case SocialNetworkPackage.SOCIAL_NETWORK__CLUSTERS:
			getClusters().clear();
			return;
		case SocialNetworkPackage.SOCIAL_NETWORK__RELATIONSHIPS:
			getRelationships().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SocialNetworkPackage.SOCIAL_NETWORK__PERSONS:
			return persons != null && !persons.isEmpty();
		case SocialNetworkPackage.SOCIAL_NETWORK__CLUSTERS:
			return clusters != null && !clusters.isEmpty();
		case SocialNetworkPackage.SOCIAL_NETWORK__RELATIONSHIPS:
			return relationships != null && !relationships.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SocialNetworkImpl
