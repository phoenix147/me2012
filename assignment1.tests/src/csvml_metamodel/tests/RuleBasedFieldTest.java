/**
 */
package csvml_metamodel.tests;

import csvml_metamodel.Csvml_metamodelFactory;
import csvml_metamodel.RuleBasedField;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rule Based Field</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuleBasedFieldTest extends DerivedFieldTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RuleBasedFieldTest.class);
	}

	/**
	 * Constructs a new Rule Based Field test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleBasedFieldTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rule Based Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RuleBasedField getFixture() {
		return (RuleBasedField)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Csvml_metamodelFactory.eINSTANCE.createRuleBasedField());
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

} //RuleBasedFieldTest
