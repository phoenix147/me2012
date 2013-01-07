/**
 */
package gsml_metamodel.tests;

import gsml_metamodel.ConcreteTask;
import gsml_metamodel.Gsml_metamodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Concrete Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcreteTaskTest extends TaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConcreteTaskTest.class);
	}

	/**
	 * Constructs a new Concrete Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Concrete Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConcreteTask getFixture() {
		return (ConcreteTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Gsml_metamodelFactory.eINSTANCE.createConcreteTask());
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

} //ConcreteTaskTest
