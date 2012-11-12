/**
 */
package csvml_metamodel.tests;

import csvml_metamodel.Csvml_metamodelFactory;
import csvml_metamodel.StaticField;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Static Field</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StaticFieldTest extends FieldDefinitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StaticFieldTest.class);
	}

	/**
	 * Constructs a new Static Field test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticFieldTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Static Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StaticField getFixture() {
		return (StaticField)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Csvml_metamodelFactory.eINSTANCE.createStaticField());
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

} //StaticFieldTest
