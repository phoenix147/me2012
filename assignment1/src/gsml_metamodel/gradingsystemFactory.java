/**
 */
package gsml_metamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gsml_metamodel.gradingsystemPackage
 * @generated
 */
public interface gradingsystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	gradingsystemFactory eINSTANCE = gsml_metamodel.impl.gradingsystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Grading System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grading System</em>'.
	 * @generated
	 */
	GradingSystem createGradingSystem();

	/**
	 * Returns a new object of class '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course</em>'.
	 * @generated
	 */
	Course createCourse();

	/**
	 * Returns a new object of class '<em>Grading</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grading</em>'.
	 * @generated
	 */
	Grading createGrading();

	/**
	 * Returns a new object of class '<em>Grading Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grading Scheme</em>'.
	 * @generated
	 */
	GradingScheme createGradingScheme();

	/**
	 * Returns a new object of class '<em>Grade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grade</em>'.
	 * @generated
	 */
	Grade createGrade();

	/**
	 * Returns a new object of class '<em>Concrete Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Task</em>'.
	 * @generated
	 */
	ConcreteTask createConcreteTask();

	/**
	 * Returns a new object of class '<em>Task Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Group</em>'.
	 * @generated
	 */
	TaskGroup createTaskGroup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	gradingsystemPackage getgradingsystemPackage();

} //gradingsystemFactory
