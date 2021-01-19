/**
 */
package jku.se.social.network.mm.SocialNetwork.provider;

import java.util.Collection;
import java.util.List;

import jku.se.social.network.mm.SocialNetwork.SocialNetwork;
import jku.se.social.network.mm.SocialNetwork.SocialNetworkFactory;
import jku.se.social.network.mm.SocialNetwork.SocialNetworkPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jku.se.social.network.mm.SocialNetwork.SocialNetwork} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SocialNetworkItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialNetworkItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SocialNetworkPackage.Literals.SOCIAL_NETWORK__PERSONS);
			childrenFeatures.add(SocialNetworkPackage.Literals.SOCIAL_NETWORK__CLUSTERS);
			childrenFeatures.add(SocialNetworkPackage.Literals.SOCIAL_NETWORK__RELATIONSHIPS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SocialNetwork.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SocialNetwork"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SocialNetwork) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_SocialNetwork_type")
				: getString("_UI_SocialNetwork_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SocialNetwork.class)) {
		case SocialNetworkPackage.SOCIAL_NETWORK__PERSONS:
		case SocialNetworkPackage.SOCIAL_NETWORK__CLUSTERS:
		case SocialNetworkPackage.SOCIAL_NETWORK__RELATIONSHIPS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(SocialNetworkPackage.Literals.SOCIAL_NETWORK__PERSONS,
				SocialNetworkFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add(createChildParameter(SocialNetworkPackage.Literals.SOCIAL_NETWORK__CLUSTERS,
				SocialNetworkFactory.eINSTANCE.createCluster()));

		newChildDescriptors.add(createChildParameter(SocialNetworkPackage.Literals.SOCIAL_NETWORK__RELATIONSHIPS,
				SocialNetworkFactory.eINSTANCE.createRelationship()));
	}

}
