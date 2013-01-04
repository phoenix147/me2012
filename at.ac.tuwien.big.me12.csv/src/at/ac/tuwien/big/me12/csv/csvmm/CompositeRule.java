/**
 */
package at.ac.tuwien.big.me12.csv.csvmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.me12.csv.csvmm.CompositeRule#getRules <em>Rules</em>}</li>
 *   <li>{@link at.ac.tuwien.big.me12.csv.csvmm.CompositeRule#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.me12.csv.csvmm.CSVPackage#getCompositeRule()
 * @model
 * @generated
 */
public interface CompositeRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.me12.csv.csvmm.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.CSVPackage#getCompositeRule_Rules()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link at.ac.tuwien.big.me12.csv.csvmm.LogicalOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.LogicalOperator
	 * @see #setOperator(LogicalOperator)
	 * @see at.ac.tuwien.big.me12.csv.csvmm.CSVPackage#getCompositeRule_Operator()
	 * @model required="true"
	 * @generated
	 */
	LogicalOperator getOperator();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.me12.csv.csvmm.CompositeRule#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.LogicalOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(LogicalOperator value);

} // CompositeRule
