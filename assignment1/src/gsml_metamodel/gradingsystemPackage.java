/**
 */
package gsml_metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gsml_metamodel.gradingsystemFactory
 * @model kind="package"
 * @generated
 */
public interface gradingsystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gsml_metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gsml/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gsml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	gradingsystemPackage eINSTANCE = gsml_metamodel.impl.gradingsystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link gsml_metamodel.impl.GradingSystemImpl <em>Grading System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsml_metamodel.impl.GradingSystemImpl
	 * @see gsml_metamodel.impl.gradingsystemPackageImpl#getGradingSystem()
	 * @generated
	 */
	int GRADING_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Comprises</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING_SYSTEM__COMPRISES = 0;

	/**
	 * The number of structural features of the '<em>Grading System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING_SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link gsml_metamodel.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsml_metamodel.impl.CourseImpl
	 * @see gsml_metamodel.impl.gradingsystemPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__HAS = 1;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link gsml_metamodel.impl.GradingImpl <em>Grading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsml_metamodel.impl.GradingImpl
	 * @see gsml_metamodel.impl.gradingsystemPackageImpl#getGrading()
	 * @generated
	 */
	int GRADING = 2;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING__SEMESTER = 0;

	/**
	 * The feature id for the '<em><b>Consists Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING__CONSISTS_OF = 1;

	/**
	 * The feature id for the '<em><b>Specified By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING__SPECIFIED_BY = 2;

	/**
	 * The number of structural features of the '<em>Grading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link gsml_metamodel.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsml_metamodel.impl.TaskImpl
	 * @see gsml_metamodel.impl.gradingsystemPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Min Requierment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MIN_REQUIERMENT = 1;

	/**
	 * The feature id for the '<em><b>Requierment Is Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__REQUIERMENT_IS_ABSOLUTE = 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link gsml_metamodel.impl.GradingSchemeImpl <em>Grading Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsml_metamodel.impl.GradingSchemeImpl
	 * @see gsml_metamodel.impl.gradingsystemPackageImpl#getGradingScheme()
	 * @generated
	 */
	int GRADING_SCHEME = 4;

	/**
	 * The feature id for the '<em><b>Consists Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING_SCHEME__CONSISTS_OF = 0;

	/**
	 * The number of structural features of the '<em>Grading Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING_SCHEME_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link gsml_metamodel.impl.GradeImpl <em>Grade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsml_metamodel.impl.GradeImpl
	 * @see gsml_metamodel.impl.gradingsystemPackageImpl#getGrade()
	 * @generated
	 */
	int GRADE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Required Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__REQUIRED_POINTS = 1;

	/**
	 * The feature id for the '<em><b>Default If Not Fullfiled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__DEFAULT_IF_NOT_FULLFILED = 2;

	/**
	 * The number of structural features of the '<em>Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link gsml_metamodel.impl.ConcreteTaskImpl <em>Concrete Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsml_metamodel.impl.ConcreteTaskImpl
	 * @see gsml_metamodel.impl.gradingsystemPackageImpl#getConcreteTask()
	 * @generated
	 */
	int CONCRETE_TASK = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Min Requierment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TASK__MIN_REQUIERMENT = TASK__MIN_REQUIERMENT;

	/**
	 * The feature id for the '<em><b>Requierment Is Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TASK__REQUIERMENT_IS_ABSOLUTE = TASK__REQUIERMENT_IS_ABSOLUTE;

	/**
	 * The feature id for the '<em><b>Max Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TASK__MAX_POINTS = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concrete Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gsml_metamodel.impl.TaskGroupImpl <em>Task Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsml_metamodel.impl.TaskGroupImpl
	 * @see gsml_metamodel.impl.gradingsystemPackageImpl#getTaskGroup()
	 * @generated
	 */
	int TASK_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Min Requierment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__MIN_REQUIERMENT = TASK__MIN_REQUIERMENT;

	/**
	 * The feature id for the '<em><b>Requierment Is Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__REQUIERMENT_IS_ABSOLUTE = TASK__REQUIERMENT_IS_ABSOLUTE;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__CONTAINS = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link gsml_metamodel.GradingSystem <em>Grading System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grading System</em>'.
	 * @see gsml_metamodel.GradingSystem
	 * @generated
	 */
	EClass getGradingSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link gsml_metamodel.GradingSystem#getComprises <em>Comprises</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comprises</em>'.
	 * @see gsml_metamodel.GradingSystem#getComprises()
	 * @see #getGradingSystem()
	 * @generated
	 */
	EReference getGradingSystem_Comprises();

	/**
	 * Returns the meta object for class '{@link gsml_metamodel.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see gsml_metamodel.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link gsml_metamodel.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gsml_metamodel.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link gsml_metamodel.Course#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has</em>'.
	 * @see gsml_metamodel.Course#getHas()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Has();

	/**
	 * Returns the meta object for class '{@link gsml_metamodel.Grading <em>Grading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grading</em>'.
	 * @see gsml_metamodel.Grading
	 * @generated
	 */
	EClass getGrading();

	/**
	 * Returns the meta object for the attribute '{@link gsml_metamodel.Grading#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester</em>'.
	 * @see gsml_metamodel.Grading#getSemester()
	 * @see #getGrading()
	 * @generated
	 */
	EAttribute getGrading_Semester();

	/**
	 * Returns the meta object for the containment reference list '{@link gsml_metamodel.Grading#getConsistsOf <em>Consists Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consists Of</em>'.
	 * @see gsml_metamodel.Grading#getConsistsOf()
	 * @see #getGrading()
	 * @generated
	 */
	EReference getGrading_ConsistsOf();

	/**
	 * Returns the meta object for the containment reference '{@link gsml_metamodel.Grading#getSpecifiedBy <em>Specified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specified By</em>'.
	 * @see gsml_metamodel.Grading#getSpecifiedBy()
	 * @see #getGrading()
	 * @generated
	 */
	EReference getGrading_SpecifiedBy();

	/**
	 * Returns the meta object for class '{@link gsml_metamodel.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see gsml_metamodel.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link gsml_metamodel.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gsml_metamodel.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link gsml_metamodel.Task#getMinRequierment <em>Min Requierment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Requierment</em>'.
	 * @see gsml_metamodel.Task#getMinRequierment()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_MinRequierment();

	/**
	 * Returns the meta object for the attribute '{@link gsml_metamodel.Task#isRequiermentIsAbsolute <em>Requierment Is Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requierment Is Absolute</em>'.
	 * @see gsml_metamodel.Task#isRequiermentIsAbsolute()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_RequiermentIsAbsolute();

	/**
	 * Returns the meta object for class '{@link gsml_metamodel.GradingScheme <em>Grading Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grading Scheme</em>'.
	 * @see gsml_metamodel.GradingScheme
	 * @generated
	 */
	EClass getGradingScheme();

	/**
	 * Returns the meta object for the containment reference list '{@link gsml_metamodel.GradingScheme#getConsistsOf <em>Consists Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consists Of</em>'.
	 * @see gsml_metamodel.GradingScheme#getConsistsOf()
	 * @see #getGradingScheme()
	 * @generated
	 */
	EReference getGradingScheme_ConsistsOf();

	/**
	 * Returns the meta object for class '{@link gsml_metamodel.Grade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grade</em>'.
	 * @see gsml_metamodel.Grade
	 * @generated
	 */
	EClass getGrade();

	/**
	 * Returns the meta object for the attribute '{@link gsml_metamodel.Grade#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gsml_metamodel.Grade#getName()
	 * @see #getGrade()
	 * @generated
	 */
	EAttribute getGrade_Name();

	/**
	 * Returns the meta object for the attribute '{@link gsml_metamodel.Grade#getRequiredPoints <em>Required Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Points</em>'.
	 * @see gsml_metamodel.Grade#getRequiredPoints()
	 * @see #getGrade()
	 * @generated
	 */
	EAttribute getGrade_RequiredPoints();

	/**
	 * Returns the meta object for the attribute '{@link gsml_metamodel.Grade#isDefaultIfNotFullfiled <em>Default If Not Fullfiled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default If Not Fullfiled</em>'.
	 * @see gsml_metamodel.Grade#isDefaultIfNotFullfiled()
	 * @see #getGrade()
	 * @generated
	 */
	EAttribute getGrade_DefaultIfNotFullfiled();

	/**
	 * Returns the meta object for class '{@link gsml_metamodel.ConcreteTask <em>Concrete Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Task</em>'.
	 * @see gsml_metamodel.ConcreteTask
	 * @generated
	 */
	EClass getConcreteTask();

	/**
	 * Returns the meta object for the attribute '{@link gsml_metamodel.ConcreteTask#getMaxPoints <em>Max Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Points</em>'.
	 * @see gsml_metamodel.ConcreteTask#getMaxPoints()
	 * @see #getConcreteTask()
	 * @generated
	 */
	EAttribute getConcreteTask_MaxPoints();

	/**
	 * Returns the meta object for class '{@link gsml_metamodel.TaskGroup <em>Task Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Group</em>'.
	 * @see gsml_metamodel.TaskGroup
	 * @generated
	 */
	EClass getTaskGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link gsml_metamodel.TaskGroup#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see gsml_metamodel.TaskGroup#getContains()
	 * @see #getTaskGroup()
	 * @generated
	 */
	EReference getTaskGroup_Contains();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	gradingsystemFactory getgradingsystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gsml_metamodel.impl.GradingSystemImpl <em>Grading System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsml_metamodel.impl.GradingSystemImpl
		 * @see gsml_metamodel.impl.gradingsystemPackageImpl#getGradingSystem()
		 * @generated
		 */
		EClass GRADING_SYSTEM = eINSTANCE.getGradingSystem();

		/**
		 * The meta object literal for the '<em><b>Comprises</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADING_SYSTEM__COMPRISES = eINSTANCE.getGradingSystem_Comprises();

		/**
		 * The meta object literal for the '{@link gsml_metamodel.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsml_metamodel.impl.CourseImpl
		 * @see gsml_metamodel.impl.gradingsystemPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__HAS = eINSTANCE.getCourse_Has();

		/**
		 * The meta object literal for the '{@link gsml_metamodel.impl.GradingImpl <em>Grading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsml_metamodel.impl.GradingImpl
		 * @see gsml_metamodel.impl.gradingsystemPackageImpl#getGrading()
		 * @generated
		 */
		EClass GRADING = eINSTANCE.getGrading();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADING__SEMESTER = eINSTANCE.getGrading_Semester();

		/**
		 * The meta object literal for the '<em><b>Consists Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADING__CONSISTS_OF = eINSTANCE.getGrading_ConsistsOf();

		/**
		 * The meta object literal for the '<em><b>Specified By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADING__SPECIFIED_BY = eINSTANCE.getGrading_SpecifiedBy();

		/**
		 * The meta object literal for the '{@link gsml_metamodel.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsml_metamodel.impl.TaskImpl
		 * @see gsml_metamodel.impl.gradingsystemPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Min Requierment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__MIN_REQUIERMENT = eINSTANCE.getTask_MinRequierment();

		/**
		 * The meta object literal for the '<em><b>Requierment Is Absolute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__REQUIERMENT_IS_ABSOLUTE = eINSTANCE.getTask_RequiermentIsAbsolute();

		/**
		 * The meta object literal for the '{@link gsml_metamodel.impl.GradingSchemeImpl <em>Grading Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsml_metamodel.impl.GradingSchemeImpl
		 * @see gsml_metamodel.impl.gradingsystemPackageImpl#getGradingScheme()
		 * @generated
		 */
		EClass GRADING_SCHEME = eINSTANCE.getGradingScheme();

		/**
		 * The meta object literal for the '<em><b>Consists Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADING_SCHEME__CONSISTS_OF = eINSTANCE.getGradingScheme_ConsistsOf();

		/**
		 * The meta object literal for the '{@link gsml_metamodel.impl.GradeImpl <em>Grade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsml_metamodel.impl.GradeImpl
		 * @see gsml_metamodel.impl.gradingsystemPackageImpl#getGrade()
		 * @generated
		 */
		EClass GRADE = eINSTANCE.getGrade();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE__NAME = eINSTANCE.getGrade_Name();

		/**
		 * The meta object literal for the '<em><b>Required Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE__REQUIRED_POINTS = eINSTANCE.getGrade_RequiredPoints();

		/**
		 * The meta object literal for the '<em><b>Default If Not Fullfiled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE__DEFAULT_IF_NOT_FULLFILED = eINSTANCE.getGrade_DefaultIfNotFullfiled();

		/**
		 * The meta object literal for the '{@link gsml_metamodel.impl.ConcreteTaskImpl <em>Concrete Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsml_metamodel.impl.ConcreteTaskImpl
		 * @see gsml_metamodel.impl.gradingsystemPackageImpl#getConcreteTask()
		 * @generated
		 */
		EClass CONCRETE_TASK = eINSTANCE.getConcreteTask();

		/**
		 * The meta object literal for the '<em><b>Max Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_TASK__MAX_POINTS = eINSTANCE.getConcreteTask_MaxPoints();

		/**
		 * The meta object literal for the '{@link gsml_metamodel.impl.TaskGroupImpl <em>Task Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsml_metamodel.impl.TaskGroupImpl
		 * @see gsml_metamodel.impl.gradingsystemPackageImpl#getTaskGroup()
		 * @generated
		 */
		EClass TASK_GROUP = eINSTANCE.getTaskGroup();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_GROUP__CONTAINS = eINSTANCE.getTaskGroup_Contains();

	}

} //gradingsystemPackage
