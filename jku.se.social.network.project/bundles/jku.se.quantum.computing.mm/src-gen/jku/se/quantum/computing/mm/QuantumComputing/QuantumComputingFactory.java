/**
 */
package jku.se.quantum.computing.mm.QuantumComputing;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jku.se.quantum.computing.mm.QuantumComputing.QuantumComputingPackage
 * @generated
 */
public interface QuantumComputingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuantumComputingFactory eINSTANCE = jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumComputingFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Quantum Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantum Library</em>'.
	 * @generated
	 */
	QuantumLibrary createQuantumLibrary();

	/**
	 * Returns a new object of class '<em>Quantum Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantum Algorithm</em>'.
	 * @generated
	 */
	QuantumAlgorithm createQuantumAlgorithm();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QuantumComputingPackage getQuantumComputingPackage();

} //QuantumComputingFactory
