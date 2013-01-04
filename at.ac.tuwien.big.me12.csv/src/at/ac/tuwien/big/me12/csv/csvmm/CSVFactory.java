/**
 */
package at.ac.tuwien.big.me12.csv.csvmm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.me12.csv.csvmm.CSVPackage
 * @generated
 */
public interface CSVFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CSVFactory eINSTANCE = at.ac.tuwien.big.me12.csv.csvmm.impl.CSVFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>File Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Definition</em>'.
	 * @generated
	 */
	FileDefinition createFileDefinition();

	/**
	 * Returns a new object of class '<em>Static Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Field</em>'.
	 * @generated
	 */
	StaticField createStaticField();

	/**
	 * Returns a new object of class '<em>Aggregation Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregation Field</em>'.
	 * @generated
	 */
	AggregationField createAggregationField();

	/**
	 * Returns a new object of class '<em>Rule Based Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Based Field</em>'.
	 * @generated
	 */
	RuleBasedField createRuleBasedField();

	/**
	 * Returns a new object of class '<em>Composite Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Rule</em>'.
	 * @generated
	 */
	CompositeRule createCompositeRule();

	/**
	 * Returns a new object of class '<em>Comparison Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparison Rule</em>'.
	 * @generated
	 */
	ComparisonRule createComparisonRule();

	/**
	 * Returns a new object of class '<em>File Definition Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Definition Set</em>'.
	 * @generated
	 */
	FileDefinitionSet createFileDefinitionSet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CSVPackage getCSVPackage();

} //CSVFactory
