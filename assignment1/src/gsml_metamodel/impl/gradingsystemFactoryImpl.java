/**
 */
package gsml_metamodel.impl;

import gsml_metamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class gradingsystemFactoryImpl extends EFactoryImpl implements gradingsystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static gradingsystemFactory init() {
		try {
			gradingsystemFactory thegradingsystemFactory = (gradingsystemFactory)EPackage.Registry.INSTANCE.getEFactory("http://gsml/1.0"); 
			if (thegradingsystemFactory != null) {
				return thegradingsystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new gradingsystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gradingsystemFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case gradingsystemPackage.GRADING_SYSTEM: return createGradingSystem();
			case gradingsystemPackage.COURSE: return createCourse();
			case gradingsystemPackage.GRADING: return createGrading();
			case gradingsystemPackage.GRADING_SCHEME: return createGradingScheme();
			case gradingsystemPackage.GRADE: return createGrade();
			case gradingsystemPackage.CONCRETE_TASK: return createConcreteTask();
			case gradingsystemPackage.TASK_GROUP: return createTaskGroup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradingSystem createGradingSystem() {
		GradingSystemImpl gradingSystem = new GradingSystemImpl();
		return gradingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grading createGrading() {
		GradingImpl grading = new GradingImpl();
		return grading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradingScheme createGradingScheme() {
		GradingSchemeImpl gradingScheme = new GradingSchemeImpl();
		return gradingScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grade createGrade() {
		GradeImpl grade = new GradeImpl();
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteTask createConcreteTask() {
		ConcreteTaskImpl concreteTask = new ConcreteTaskImpl();
		return concreteTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskGroup createTaskGroup() {
		TaskGroupImpl taskGroup = new TaskGroupImpl();
		return taskGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gradingsystemPackage getgradingsystemPackage() {
		return (gradingsystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static gradingsystemPackage getPackage() {
		return gradingsystemPackage.eINSTANCE;
	}

} //gradingsystemFactoryImpl
