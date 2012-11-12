/**
 */
package gsml_metamodel.tests;

import gsml_metamodel.Gsml_metamodelFactory;
import gsml_metamodel.TaskGroup;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskGroupTest extends TaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskGroupTest.class);
	}

	/**
	 * Constructs a new Task Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Task Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TaskGroup getFixture() {
		return (TaskGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Gsml_metamodelFactory.eINSTANCE.createTaskGroup());
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

} //TaskGroupTest
