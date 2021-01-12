/**
 */
package jku.se.quantum.computing.mm.QuantumComputing.impl;

import java.util.Collection;

import jku.se.quantum.computing.mm.QuantumComputing.File;
import jku.se.quantum.computing.mm.QuantumComputing.Parameter;
import jku.se.quantum.computing.mm.QuantumComputing.QuantumAlgorithm;
import jku.se.quantum.computing.mm.QuantumComputing.QuantumComputingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantum Algorithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumAlgorithmImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumAlgorithmImpl#getFile <em>File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantumAlgorithmImpl extends NamedElementImpl implements QuantumAlgorithm {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected File file;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantumAlgorithmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuantumComputingPackage.Literals.QUANTUM_ALGORITHM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					QuantumComputingPackage.QUANTUM_ALGORITHM__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getFile() {
		if (file != null && file.eIsProxy()) {
			InternalEObject oldFile = (InternalEObject) file;
			file = (File) eResolveProxy(oldFile);
			if (file != oldFile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							QuantumComputingPackage.QUANTUM_ALGORITHM__FILE, oldFile, file));
			}
		}
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File basicGetFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(File newFile) {
		File oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuantumComputingPackage.QUANTUM_ALGORITHM__FILE,
					oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QuantumComputingPackage.QUANTUM_ALGORITHM__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
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
		case QuantumComputingPackage.QUANTUM_ALGORITHM__PARAMETERS:
			return getParameters();
		case QuantumComputingPackage.QUANTUM_ALGORITHM__FILE:
			if (resolve)
				return getFile();
			return basicGetFile();
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
		case QuantumComputingPackage.QUANTUM_ALGORITHM__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case QuantumComputingPackage.QUANTUM_ALGORITHM__FILE:
			setFile((File) newValue);
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
		case QuantumComputingPackage.QUANTUM_ALGORITHM__PARAMETERS:
			getParameters().clear();
			return;
		case QuantumComputingPackage.QUANTUM_ALGORITHM__FILE:
			setFile((File) null);
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
		case QuantumComputingPackage.QUANTUM_ALGORITHM__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case QuantumComputingPackage.QUANTUM_ALGORITHM__FILE:
			return file != null;
		}
		return super.eIsSet(featureID);
	}

} //QuantumAlgorithmImpl
