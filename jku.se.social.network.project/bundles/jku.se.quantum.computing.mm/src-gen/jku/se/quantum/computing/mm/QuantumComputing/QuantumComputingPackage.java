/**
 */
package jku.se.quantum.computing.mm.QuantumComputing;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jku.se.quantum.computing.mm.QuantumComputing.QuantumComputingFactory
 * @model kind="package"
 * @generated
 */
public interface QuantumComputingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "QuantumComputing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://quantum-computing/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuantumComputingPackage eINSTANCE = jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumComputingPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link jku.se.quantum.computing.mm.QuantumComputing.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jku.se.quantum.computing.mm.QuantumComputing.impl.NamedElementImpl
	 * @see jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumComputingPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumLibraryImpl <em>Quantum Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumLibraryImpl
	 * @see jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumComputingPackageImpl#getQuantumLibrary()
	 * @generated
	 */
	int QUANTUM_LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_LIBRARY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Quantumalgorithms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_LIBRARY__QUANTUMALGORITHMS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quantum Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_LIBRARY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Quantum Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_LIBRARY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumAlgorithmImpl <em>Quantum Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumAlgorithmImpl
	 * @see jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumComputingPackageImpl#getQuantumAlgorithm()
	 * @generated
	 */
	int QUANTUM_ALGORITHM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_ALGORITHM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_ALGORITHM__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quantum Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_ALGORITHM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Quantum Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_ALGORITHM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jku.se.quantum.computing.mm.QuantumComputing.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jku.se.quantum.computing.mm.QuantumComputing.impl.ParameterImpl
	 * @see jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumComputingPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DATA_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jku.se.quantum.computing.mm.QuantumComputing.DATATYPE <em>DATATYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jku.se.quantum.computing.mm.QuantumComputing.DATATYPE
	 * @see jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumComputingPackageImpl#getDATATYPE()
	 * @generated
	 */
	int DATATYPE = 4;

	/**
	 * Returns the meta object for class '{@link jku.se.quantum.computing.mm.QuantumComputing.QuantumLibrary <em>Quantum Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantum Library</em>'.
	 * @see jku.se.quantum.computing.mm.QuantumComputing.QuantumLibrary
	 * @generated
	 */
	EClass getQuantumLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link jku.se.quantum.computing.mm.QuantumComputing.QuantumLibrary#getQuantumalgorithms <em>Quantumalgorithms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quantumalgorithms</em>'.
	 * @see jku.se.quantum.computing.mm.QuantumComputing.QuantumLibrary#getQuantumalgorithms()
	 * @see #getQuantumLibrary()
	 * @generated
	 */
	EReference getQuantumLibrary_Quantumalgorithms();

	/**
	 * Returns the meta object for class '{@link jku.se.quantum.computing.mm.QuantumComputing.QuantumAlgorithm <em>Quantum Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantum Algorithm</em>'.
	 * @see jku.se.quantum.computing.mm.QuantumComputing.QuantumAlgorithm
	 * @generated
	 */
	EClass getQuantumAlgorithm();

	/**
	 * Returns the meta object for the containment reference list '{@link jku.se.quantum.computing.mm.QuantumComputing.QuantumAlgorithm#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see jku.se.quantum.computing.mm.QuantumComputing.QuantumAlgorithm#getParameters()
	 * @see #getQuantumAlgorithm()
	 * @generated
	 */
	EReference getQuantumAlgorithm_Parameters();

	/**
	 * Returns the meta object for class '{@link jku.se.quantum.computing.mm.QuantumComputing.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see jku.se.quantum.computing.mm.QuantumComputing.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link jku.se.quantum.computing.mm.QuantumComputing.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jku.se.quantum.computing.mm.QuantumComputing.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link jku.se.quantum.computing.mm.QuantumComputing.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jku.se.quantum.computing.mm.QuantumComputing.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for the attribute '{@link jku.se.quantum.computing.mm.QuantumComputing.Parameter#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see jku.se.quantum.computing.mm.QuantumComputing.Parameter#getDataType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_DataType();

	/**
	 * Returns the meta object for class '{@link jku.se.quantum.computing.mm.QuantumComputing.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see jku.se.quantum.computing.mm.QuantumComputing.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link jku.se.quantum.computing.mm.QuantumComputing.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jku.se.quantum.computing.mm.QuantumComputing.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for enum '{@link jku.se.quantum.computing.mm.QuantumComputing.DATATYPE <em>DATATYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DATATYPE</em>'.
	 * @see jku.se.quantum.computing.mm.QuantumComputing.DATATYPE
	 * @generated
	 */
	EEnum getDATATYPE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QuantumComputingFactory getQuantumComputingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumLibraryImpl <em>Quantum Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumLibraryImpl
		 * @see jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumComputingPackageImpl#getQuantumLibrary()
		 * @generated
		 */
		EClass QUANTUM_LIBRARY = eINSTANCE.getQuantumLibrary();

		/**
		 * The meta object literal for the '<em><b>Quantumalgorithms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTUM_LIBRARY__QUANTUMALGORITHMS = eINSTANCE.getQuantumLibrary_Quantumalgorithms();

		/**
		 * The meta object literal for the '{@link jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumAlgorithmImpl <em>Quantum Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumAlgorithmImpl
		 * @see jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumComputingPackageImpl#getQuantumAlgorithm()
		 * @generated
		 */
		EClass QUANTUM_ALGORITHM = eINSTANCE.getQuantumAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTUM_ALGORITHM__PARAMETERS = eINSTANCE.getQuantumAlgorithm_Parameters();

		/**
		 * The meta object literal for the '{@link jku.se.quantum.computing.mm.QuantumComputing.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jku.se.quantum.computing.mm.QuantumComputing.impl.ParameterImpl
		 * @see jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumComputingPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DATA_TYPE = eINSTANCE.getParameter_DataType();

		/**
		 * The meta object literal for the '{@link jku.se.quantum.computing.mm.QuantumComputing.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jku.se.quantum.computing.mm.QuantumComputing.impl.NamedElementImpl
		 * @see jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumComputingPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link jku.se.quantum.computing.mm.QuantumComputing.DATATYPE <em>DATATYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jku.se.quantum.computing.mm.QuantumComputing.DATATYPE
		 * @see jku.se.quantum.computing.mm.QuantumComputing.impl.QuantumComputingPackageImpl#getDATATYPE()
		 * @generated
		 */
		EEnum DATATYPE = eINSTANCE.getDATATYPE();

	}

} //QuantumComputingPackage
