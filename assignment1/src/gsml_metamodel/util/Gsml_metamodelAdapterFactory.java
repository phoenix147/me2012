/**
 */
package gsml_metamodel.util;

import gsml_metamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gsml_metamodel.Gsml_metamodelPackage
 * @generated
 */
public class Gsml_metamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Gsml_metamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gsml_metamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Gsml_metamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Gsml_metamodelSwitch<Adapter> modelSwitch =
		new Gsml_metamodelSwitch<Adapter>() {
			@Override
			public Adapter caseGradingSystem(GradingSystem object) {
				return createGradingSystemAdapter();
			}
			@Override
			public Adapter caseCourse(Course object) {
				return createCourseAdapter();
			}
			@Override
			public Adapter caseGrading(Grading object) {
				return createGradingAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseGradingScheme(GradingScheme object) {
				return createGradingSchemeAdapter();
			}
			@Override
			public Adapter caseGrade(Grade object) {
				return createGradeAdapter();
			}
			@Override
			public Adapter caseConcreteTask(ConcreteTask object) {
				return createConcreteTaskAdapter();
			}
			@Override
			public Adapter caseTaskGroup(TaskGroup object) {
				return createTaskGroupAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gsml_metamodel.GradingSystem <em>Grading System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsml_metamodel.GradingSystem
	 * @generated
	 */
	public Adapter createGradingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsml_metamodel.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsml_metamodel.Course
	 * @generated
	 */
	public Adapter createCourseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsml_metamodel.Grading <em>Grading</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsml_metamodel.Grading
	 * @generated
	 */
	public Adapter createGradingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsml_metamodel.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsml_metamodel.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsml_metamodel.GradingScheme <em>Grading Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsml_metamodel.GradingScheme
	 * @generated
	 */
	public Adapter createGradingSchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsml_metamodel.Grade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsml_metamodel.Grade
	 * @generated
	 */
	public Adapter createGradeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsml_metamodel.ConcreteTask <em>Concrete Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsml_metamodel.ConcreteTask
	 * @generated
	 */
	public Adapter createConcreteTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsml_metamodel.TaskGroup <em>Task Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsml_metamodel.TaskGroup
	 * @generated
	 */
	public Adapter createTaskGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Gsml_metamodelAdapterFactory
