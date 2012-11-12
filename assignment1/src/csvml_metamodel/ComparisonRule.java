/**
 */
package csvml_metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csvml_metamodel.ComparisonRule#getCompares <em>Compares</em>}</li>
 *   <li>{@link csvml_metamodel.ComparisonRule#getComparisonValue <em>Comparison Value</em>}</li>
 *   <li>{@link csvml_metamodel.ComparisonRule#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see csvml_metamodel.Csvml_metamodelPackage#getComparisonRule()
 * @model
 * @generated
 */
public interface ComparisonRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Compares</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compares</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compares</em>' reference.
	 * @see #setCompares(FieldDefinition)
	 * @see csvml_metamodel.Csvml_metamodelPackage#getComparisonRule_Compares()
	 * @model required="true"
	 * @generated
	 */
	FieldDefinition getCompares();

	/**
	 * Sets the value of the '{@link csvml_metamodel.ComparisonRule#getCompares <em>Compares</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compares</em>' reference.
	 * @see #getCompares()
	 * @generated
	 */
	void setCompares(FieldDefinition value);

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
	 * @see csvml_metamodel.Csvml_metamodelPackage#getComparisonRule_ComparisonValue()
	 * @model
	 * @generated
	 */
	String getComparisonValue();

	/**
	 * Sets the value of the '{@link csvml_metamodel.ComparisonRule#getComparisonValue <em>Comparison Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Value</em>' attribute.
	 * @see #getComparisonValue()
	 * @generated
	 */
	void setComparisonValue(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link csvml_metamodel.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see csvml_metamodel.Operator
	 * @see #setOperator(Operator)
	 * @see csvml_metamodel.Csvml_metamodelPackage#getComparisonRule_Operator()
	 * @model
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link csvml_metamodel.ComparisonRule#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see csvml_metamodel.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

} // ComparisonRule
