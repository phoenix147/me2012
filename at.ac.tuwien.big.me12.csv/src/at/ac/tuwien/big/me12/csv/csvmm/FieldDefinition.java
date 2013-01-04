/**
 */
package at.ac.tuwien.big.me12.csv.csvmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.me12.csv.csvmm.FieldDefinition#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.tuwien.big.me12.csv.csvmm.FieldDefinition#getIndex <em>Index</em>}</li>
 *   <li>{@link at.ac.tuwien.big.me12.csv.csvmm.FieldDefinition#getFieldType <em>Field Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.me12.csv.csvmm.CSVPackage#getFieldDefinition()
 * @model abstract="true"
 * @generated
 */
public interface FieldDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.ac.tuwien.big.me12.csv.csvmm.CSVPackage#getFieldDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.me12.csv.csvmm.FieldDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see at.ac.tuwien.big.me12.csv.csvmm.CSVPackage#getFieldDefinition_Index()
	 * @model required="true"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.me12.csv.csvmm.FieldDefinition#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Field Type</b></em>' attribute.
	 * The literals are from the enumeration {@link at.ac.tuwien.big.me12.csv.csvmm.FieldType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Type</em>' attribute.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.FieldType
	 * @see #setFieldType(FieldType)
	 * @see at.ac.tuwien.big.me12.csv.csvmm.CSVPackage#getFieldDefinition_FieldType()
	 * @model
	 * @generated
	 */
	FieldType getFieldType();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.me12.csv.csvmm.FieldDefinition#getFieldType <em>Field Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Type</em>' attribute.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.FieldType
	 * @see #getFieldType()
	 * @generated
	 */
	void setFieldType(FieldType value);

} // FieldDefinition
