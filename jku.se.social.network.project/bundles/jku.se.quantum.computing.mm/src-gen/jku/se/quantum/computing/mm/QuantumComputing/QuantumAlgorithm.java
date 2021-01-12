/**
 */
package jku.se.quantum.computing.mm.QuantumComputing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantum Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jku.se.quantum.computing.mm.QuantumComputing.QuantumAlgorithm#getParameters <em>Parameters</em>}</li>
 *   <li>{@link jku.se.quantum.computing.mm.QuantumComputing.QuantumAlgorithm#getFile <em>File</em>}</li>
 * </ul>
 *
 * @see jku.se.quantum.computing.mm.QuantumComputing.QuantumComputingPackage#getQuantumAlgorithm()
 * @model
 * @generated
 */
public interface QuantumAlgorithm extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link jku.se.quantum.computing.mm.QuantumComputing.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see jku.se.quantum.computing.mm.QuantumComputing.QuantumComputingPackage#getQuantumAlgorithm_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' reference.
	 * @see #setFile(File)
	 * @see jku.se.quantum.computing.mm.QuantumComputing.QuantumComputingPackage#getQuantumAlgorithm_File()
	 * @model required="true"
	 * @generated
	 */
	File getFile();

	/**
	 * Sets the value of the '{@link jku.se.quantum.computing.mm.QuantumComputing.QuantumAlgorithm#getFile <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(File value);

} // QuantumAlgorithm
