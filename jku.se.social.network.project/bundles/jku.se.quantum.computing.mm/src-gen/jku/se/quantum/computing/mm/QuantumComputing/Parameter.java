/**
 */
package jku.se.quantum.computing.mm.QuantumComputing;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jku.se.quantum.computing.mm.QuantumComputing.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link jku.se.quantum.computing.mm.QuantumComputing.Parameter#getValue <em>Value</em>}</li>
 *   <li>{@link jku.se.quantum.computing.mm.QuantumComputing.Parameter#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see jku.se.quantum.computing.mm.QuantumComputing.QuantumComputingPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see jku.se.quantum.computing.mm.QuantumComputing.QuantumComputingPackage#getParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link jku.se.quantum.computing.mm.QuantumComputing.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see jku.se.quantum.computing.mm.QuantumComputing.QuantumComputingPackage#getParameter_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link jku.se.quantum.computing.mm.QuantumComputing.Parameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link jku.se.quantum.computing.mm.QuantumComputing.DATATYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see jku.se.quantum.computing.mm.QuantumComputing.DATATYPE
	 * @see #setDataType(DATATYPE)
	 * @see jku.se.quantum.computing.mm.QuantumComputing.QuantumComputingPackage#getParameter_DataType()
	 * @model
	 * @generated
	 */
	DATATYPE getDataType();

	/**
	 * Sets the value of the '{@link jku.se.quantum.computing.mm.QuantumComputing.Parameter#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see jku.se.quantum.computing.mm.QuantumComputing.DATATYPE
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DATATYPE value);

} // Parameter
