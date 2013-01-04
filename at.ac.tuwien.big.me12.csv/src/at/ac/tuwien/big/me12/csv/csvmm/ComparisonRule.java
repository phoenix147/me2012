/**
 */
package at.ac.tuwien.big.me12.csv.csvmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.me12.csv.csvmm.ComparisonRule#getOperator <em>Operator</em>}</li>
 *   <li>{@link at.ac.tuwien.big.me12.csv.csvmm.ComparisonRule#getComparisonValue <em>Comparison Value</em>}</li>
 *   <li>{@link at.ac.tuwien.big.me12.csv.csvmm.ComparisonRule#getInputField <em>Input Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.me12.csv.csvmm.CSVPackage#getComparisonRule()
 * @model
 * @generated
 */
public interface ComparisonRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link at.ac.tuwien.big.me12.csv.csvmm.ComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.ComparisonOperator
	 * @see #setOperator(ComparisonOperator)
	 * @see at.ac.tuwien.big.me12.csv.csvmm.CSVPackage#getComparisonRule_Operator()
	 * @model required="true"
	 * @generated
	 */
	ComparisonOperator getOperator();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.me12.csv.csvmm.ComparisonRule#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.ComparisonOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparisonOperator value);

	/**
	 * Returns the value of the '<em><b>Comparison Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparison Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Value</em>' attribute.
	 * @see #setComparisonValue(String)
	 * @see at.ac.tuwien.big.me12.csv.csvmm.CSVPackage#getComparisonRule_ComparisonValue()
	 * @model required="true"
	 * @generated
	 */
	String getComparisonValue();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.me12.csv.csvmm.ComparisonRule#getComparisonValue <em>Comparison Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Value</em>' attribute.
	 * @see #getComparisonValue()
	 * @generated
	 */
	void setComparisonValue(String value);

	/**
	 * Returns the value of the '<em><b>Input Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Field</em>' reference.
	 * @see #setInputField(FieldDefinition)
	 * @see at.ac.tuwien.big.me12.csv.csvmm.CSVPackage#getComparisonRule_InputField()
	 * @model required="true"
	 * @generated
	 */
	FieldDefinition getInputField();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.me12.csv.csvmm.ComparisonRule#getInputField <em>Input Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Field</em>' reference.
	 * @see #getInputField()
	 * @generated
	 */
	void setInputField(FieldDefinition value);

} // ComparisonRule
