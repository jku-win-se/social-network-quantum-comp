/**
 */
package jku.se.quantum.computing.mm.QuantumComputing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantum Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jku.se.quantum.computing.mm.QuantumComputing.QuantumLibrary#getQuantumalgorithms <em>Quantumalgorithms</em>}</li>
 * </ul>
 *
 * @see jku.se.quantum.computing.mm.QuantumComputing.QuantumComputingPackage#getQuantumLibrary()
 * @model
 * @generated
 */
public interface QuantumLibrary extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Quantumalgorithms</b></em>' containment reference list.
	 * The list contents are of type {@link jku.se.quantum.computing.mm.QuantumComputing.QuantumAlgorithm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantumalgorithms</em>' containment reference list.
	 * @see jku.se.quantum.computing.mm.QuantumComputing.QuantumComputingPackage#getQuantumLibrary_Quantumalgorithms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<QuantumAlgorithm> getQuantumalgorithms();

} // QuantumLibrary
