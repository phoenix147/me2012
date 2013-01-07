/**
 */
package gsml_metamodel.tests;

import gsml_metamodel.GradingSystem;
import gsml_metamodel.Gsml_metamodelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Grading System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GradingSystemTest extends TestCase {

	/**
	 * The fixture for this Grading System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GradingSystem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GradingSystemTest.class);
	}

	/**
	 * Constructs a new Grading System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradingSystemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Grading System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GradingSystem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Grading System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GradingSystem getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Gsml_metamodelFactory.eINSTANCE.createGradingSystem());
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

} //GradingSystemTest
