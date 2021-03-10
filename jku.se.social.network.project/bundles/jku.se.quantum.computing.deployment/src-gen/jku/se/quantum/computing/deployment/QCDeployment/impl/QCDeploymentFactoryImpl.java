/**
 */
package jku.se.quantum.computing.deployment.QCDeployment.impl;

import jku.se.quantum.computing.deployment.QCDeployment.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QCDeploymentFactoryImpl extends EFactoryImpl implements QCDeploymentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QCDeploymentFactory init() {
		try {
			QCDeploymentFactory theQCDeploymentFactory = (QCDeploymentFactory) EPackage.Registry.INSTANCE
					.getEFactory(QCDeploymentPackage.eNS_URI);
			if (theQCDeploymentFactory != null) {
				return theQCDeploymentFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QCDeploymentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCDeploymentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case QCDeploymentPackage.DEPLOYMENT:
			return createDeployment();
		case QCDeploymentPackage.ALGORITHM_EXECUTION:
			return createAlgorithmExecution();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment() {
		DeploymentImpl deployment = new DeploymentImpl();
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmExecution createAlgorithmExecution() {
		AlgorithmExecutionImpl algorithmExecution = new AlgorithmExecutionImpl();
		return algorithmExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCDeploymentPackage getQCDeploymentPackage() {
		return (QCDeploymentPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QCDeploymentPackage getPackage() {
		return QCDeploymentPackage.eINSTANCE;
	}

} //QCDeploymentFactoryImpl
