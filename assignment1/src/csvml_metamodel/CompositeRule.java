/**
 */
package csvml_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csvml_metamodel.CompositeRule#getOperator <em>Operator</em>}</li>
 *   <li>{@link csvml_metamodel.CompositeRule#getComposedOf <em>Composed Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see csvml_metamodel.Csvml_metamodelPackage#getCompositeRule()
 * @model
 * @generated
 */
public interface CompositeRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link csvml_metamodel.LogicalOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see csvml_metamodel.LogicalOperator
	 * @see #setOperator(LogicalOperator)
	 * @see csvml_metamodel.Csvml_metamodelPackage#getCompositeRule_Operator()
	 * @model
	 * @generated
	 */
	LogicalOperator getOperator();

	/**
	 * Sets the value of the '{@link csvml_metamodel.CompositeRule#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see csvml_metamodel.LogicalOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(LogicalOperator value);

	/**
	 * Returns the value of the '<em><b>Composed Of</b></em>' containment reference list.
	 * The list contents are of type {@link csvml_metamodel.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Of</em>' containment reference list.
	 * @see csvml_metamodel.Csvml_metamodelPackage#getCompositeRule_ComposedOf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Rule> getComposedOf();

} // CompositeRule
