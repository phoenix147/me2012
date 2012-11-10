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
public class Gsml_metamodelFactoryImpl extends EFactoryImpl implements Gsml_metamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Gsml_metamodelFactory init() {
		try {
			Gsml_metamodelFactory theGsml_metamodelFactory = (Gsml_metamodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://gsml/1.0"); 
			if (theGsml_metamodelFactory != null) {
				return theGsml_metamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Gsml_metamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gsml_metamodelFactoryImpl() {
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
			case Gsml_metamodelPackage.GRADING_SYSTEM: return createGradingSystem();
			case Gsml_metamodelPackage.COURSE: return createCourse();
			case Gsml_metamodelPackage.GRADING: return createGrading();
			case Gsml_metamodelPackage.GRADING_SCHEME: return createGradingScheme();
			case Gsml_metamodelPackage.GRADE: return createGrade();
			case Gsml_metamodelPackage.CONCRETE_TASK: return createConcreteTask();
			case Gsml_metamodelPackage.TASK_GROUP: return createTaskGroup();
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
	public Gsml_metamodelPackage getGsml_metamodelPackage() {
		return (Gsml_metamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Gsml_metamodelPackage getPackage() {
		return Gsml_metamodelPackage.eINSTANCE;
	}

} //Gsml_metamodelFactoryImpl
