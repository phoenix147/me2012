/**
 */
package csvml_metamodel.tests;

import csvml_metamodel.AggregationField;
import csvml_metamodel.Csvml_metamodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Aggregation Field</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AggregationFieldTest extends DerivedFieldTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AggregationFieldTest.class);
	}

	/**
	 * Constructs a new Aggregation Field test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationFieldTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Aggregation Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AggregationField getFixture() {
		return (AggregationField)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Csvml_metamodelFactory.eINSTANCE.createAggregationField());
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

} //AggregationFieldTest
