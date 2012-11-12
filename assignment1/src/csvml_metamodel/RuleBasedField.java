/**
 */
package csvml_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Based Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csvml_metamodel.RuleBasedField#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link csvml_metamodel.RuleBasedField#getHasRules <em>Has Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see csvml_metamodel.Csvml_metamodelPackage#getRuleBasedField()
 * @model
 * @generated
 */
public interface RuleBasedField extends DerivedField {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see csvml_metamodel.Csvml_metamodelPackage#getRuleBasedField_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link csvml_metamodel.RuleBasedField#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Has Rules</b></em>' containment reference list.
	 * The list contents are of type {@link csvml_metamodel.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Rules</em>' containment reference list.
	 * @see csvml_metamodel.Csvml_metamodelPackage#getRuleBasedField_HasRules()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Rule> getHasRules();

} // RuleBasedField
