/**
 */
package jku.se.quantum.computing.deployment.QCDeployment.impl;

import jku.se.quantum.computing.deployment.QCDeployment.AlgorithmExecution;
import jku.se.quantum.computing.deployment.QCDeployment.Deployment;
import jku.se.quantum.computing.deployment.QCDeployment.QCDeploymentFactory;
import jku.se.quantum.computing.deployment.QCDeployment.QCDeploymentPackage;

import jku.se.quantum.computing.mm.QuantumComputing.QuantumComputingPackage;

import jku.se.social.network.mm.SocialNetwork.SocialNetworkPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QCDeploymentPackageImpl extends EPackageImpl implements QCDeploymentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algorithmExecutionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see jku.se.quantum.computing.deployment.QCDeployment.QCDeploymentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QCDeploymentPackageImpl() {
		super(eNS_URI, QCDeploymentFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link QCDeploymentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QCDeploymentPackage init() {
		if (isInited)
			return (QCDeploymentPackage) EPackage.Registry.INSTANCE.getEPackage(QCDeploymentPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredQCDeploymentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		QCDeploymentPackageImpl theQCDeploymentPackage = registeredQCDeploymentPackage instanceof QCDeploymentPackageImpl
				? (QCDeploymentPackageImpl) registeredQCDeploymentPackage
				: new QCDeploymentPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		QuantumComputingPackage.eINSTANCE.eClass();
		SocialNetworkPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQCDeploymentPackage.createPackageContents();

		// Initialize created meta-data
		theQCDeploymentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQCDeploymentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QCDeploymentPackage.eNS_URI, theQCDeploymentPackage);
		return theQCDeploymentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployment() {
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_Algorithmexecution() {
		return (EReference) deploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_Name() {
		return (EAttribute) deploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlgorithmExecution() {
		return algorithmExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithmExecution_Algorithmexecution() {
		return (EReference) algorithmExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithmExecution_Data() {
		return (EReference) algorithmExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCDeploymentFactory getQCDeploymentFactory() {
		return (QCDeploymentFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		deploymentEClass = createEClass(DEPLOYMENT);
		createEReference(deploymentEClass, DEPLOYMENT__ALGORITHMEXECUTION);
		createEAttribute(deploymentEClass, DEPLOYMENT__NAME);

		algorithmExecutionEClass = createEClass(ALGORITHM_EXECUTION);
		createEReference(algorithmExecutionEClass, ALGORITHM_EXECUTION__ALGORITHMEXECUTION);
		createEReference(algorithmExecutionEClass, ALGORITHM_EXECUTION__DATA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		QuantumComputingPackage theQuantumComputingPackage = (QuantumComputingPackage) EPackage.Registry.INSTANCE
				.getEPackage(QuantumComputingPackage.eNS_URI);
		SocialNetworkPackage theSocialNetworkPackage = (SocialNetworkPackage) EPackage.Registry.INSTANCE
				.getEPackage(SocialNetworkPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeployment_Algorithmexecution(), this.getAlgorithmExecution(), null, "algorithmexecution",
				null, 1, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Deployment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(algorithmExecutionEClass, AlgorithmExecution.class, "AlgorithmExecution", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlgorithmExecution_Algorithmexecution(), theQuantumComputingPackage.getQuantumAlgorithm(),
				null, "algorithmexecution", null, 1, 1, AlgorithmExecution.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgorithmExecution_Data(), theSocialNetworkPackage.getSocialNetwork(), null, "data", null, 1,
				1, AlgorithmExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //QCDeploymentPackageImpl
