/**
 */
package csvml_metamodel.tests;

import csvml_metamodel.ComparisonRule;
import csvml_metamodel.Csvml_metamodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Comparison Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComparisonRuleTest extends RuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComparisonRuleTest.class);
	}

	/**
	 * Constructs a new Comparison Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Comparison Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComparisonRule getFixture() {
		return (ComparisonRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Csvml_metamodelFactory.eINSTANCE.createComparisonRule());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ComparisonRuleTest
