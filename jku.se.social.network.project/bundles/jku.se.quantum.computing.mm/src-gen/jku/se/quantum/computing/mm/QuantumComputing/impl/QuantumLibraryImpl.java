/**
 */
package jku.se.quantum.computing.mm.QuantumComputing.impl;

import java.util.Collection;

import jku.se.quantum.computing.mm.QuantumComputing.File;
import jku.se.quantum.computing.mm.QuantumComputing.QuantumAlgorithm;
import jku.se.quantum.computing.mm.QuantumComputing.QuantumComputingPackage;
import jku.se.quantum.computing.mm.QuantumComputing.QuantumLibrary;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantum Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumLibraryImpl#getQuantumalgorithms <em>Quantumalgorithms</em>}</li>
 *   <li>{@link jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumLibraryImpl#getFiles <em>Files</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantumLibraryImpl extends NamedElementImpl implements QuantumLibrary {
	/**
	 * The cached value of the '{@link #getQuantumalgorithms() <em>Quantumalgorithms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantumalgorithms()
	 * @generated
	 * @ordered
	 */
	protected EList<QuantumAlgorithm> quantumalgorithms;
	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<File> files;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantumLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuantumComputingPackage.Literals.QUANTUM_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuantumAlgorithm> getQuantumalgorithms() {
		if (quantumalgorithms == null) {
			quantumalgorithms = new EObjectContainmentEList<QuantumAlgorithm>(QuantumAlgorithm.class, this,
					QuantumComputingPackage.QUANTUM_LIBRARY__QUANTUMALGORITHMS);
		}
		return quantumalgorithms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<File>(File.class, this, QuantumComputingPackage.QUANTUM_LIBRARY__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QuantumComputingPackage.QUANTUM_LIBRARY__QUANTUMALGORITHMS:
			return ((InternalEList<?>) getQuantumalgorithms()).basicRemove(otherEnd, msgs);
		case QuantumComputingPackage.QUANTUM_LIBRARY__FILES:
			return ((InternalEList<?>) getFiles()).basicRemove(otherEnd, msgs);
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
		case QuantumComputingPackage.QUANTUM_LIBRARY__QUANTUMALGORITHMS:
			return getQuantumalgorithms();
		case QuantumComputingPackage.QUANTUM_LIBRARY__FILES:
			return getFiles();
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
		case QuantumComputingPackage.QUANTUM_LIBRARY__QUANTUMALGORITHMS:
			getQuantumalgorithms().clear();
			getQuantumalgorithms().addAll((Collection<? extends QuantumAlgorithm>) newValue);
			return;
		case QuantumComputingPackage.QUANTUM_LIBRARY__FILES:
			getFiles().clear();
			getFiles().addAll((Collection<? extends File>) newValue);
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
		case QuantumComputingPackage.QUANTUM_LIBRARY__QUANTUMALGORITHMS:
			getQuantumalgorithms().clear();
			return;
		case QuantumComputingPackage.QUANTUM_LIBRARY__FILES:
			getFiles().clear();
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
		case QuantumComputingPackage.QUANTUM_LIBRARY__QUANTUMALGORITHMS:
			return quantumalgorithms != null && !quantumalgorithms.isEmpty();
		case QuantumComputingPackage.QUANTUM_LIBRARY__FILES:
			return files != null && !files.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuantumLibraryImpl