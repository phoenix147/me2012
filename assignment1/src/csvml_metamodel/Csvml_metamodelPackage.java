/**
 */
package csvml_metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see csvml_metamodel.Csvml_metamodelFactory
 * @model kind="package"
 * @generated
 */
public interface Csvml_metamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "csvml_metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://csvml_metamodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "csvml_metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Csvml_metamodelPackage eINSTANCE = csvml_metamodel.impl.Csvml_metamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link csvml_metamodel.impl.FileDefinitionSetImpl <em>File Definition Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml_metamodel.impl.FileDefinitionSetImpl
	 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getFileDefinitionSet()
	 * @generated
	 */
	int FILE_DEFINITION_SET = 0;

	/**
	 * The feature id for the '<em><b>Comprises</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DEFINITION_SET__COMPRISES = 0;

	/**
	 * The number of structural features of the '<em>File Definition Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DEFINITION_SET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link csvml_metamodel.impl.FileDefinitionImpl <em>File Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml_metamodel.impl.FileDefinitionImpl
	 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getFileDefinition()
	 * @generated
	 */
	int FILE_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Consists OF</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DEFINITION__CONSISTS_OF = 1;

	/**
	 * The number of structural features of the '<em>File Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link csvml_metamodel.impl.FieldDefinitionImpl <em>Field Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml_metamodel.impl.FieldDefinitionImpl
	 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getFieldDefinition()
	 * @generated
	 */
	int FIELD_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Field Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link csvml_metamodel.impl.StaticFieldImpl <em>Static Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml_metamodel.impl.StaticFieldImpl
	 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getStaticField()
	 * @generated
	 */
	int STATIC_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FIELD__INDEX = FIELD_DEFINITION__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FIELD__NAME = FIELD_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FIELD__TYPE = FIELD_DEFINITION__TYPE;

	/**
	 * The number of structural features of the '<em>Static Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FIELD_FEATURE_COUNT = FIELD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link csvml_metamodel.impl.DerivedFieldImpl <em>Derived Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml_metamodel.impl.DerivedFieldImpl
	 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getDerivedField()
	 * @generated
	 */
	int DERIVED_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FIELD__INDEX = FIELD_DEFINITION__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FIELD__NAME = FIELD_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FIELD__TYPE = FIELD_DEFINITION__TYPE;

	/**
	 * The number of structural features of the '<em>Derived Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FIELD_FEATURE_COUNT = FIELD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link csvml_metamodel.impl.AggregationFieldImpl <em>Aggregation Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml_metamodel.impl.AggregationFieldImpl
	 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getAggregationField()
	 * @generated
	 */
	int AGGREGATION_FIELD = 5;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FIELD__INDEX = DERIVED_FIELD__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FIELD__NAME = DERIVED_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FIELD__TYPE = DERIVED_FIELD__TYPE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FIELD__OPERATION = DERIVED_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FIELD__FIELDS = DERIVED_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aggregation Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FIELD_FEATURE_COUNT = DERIVED_FIELD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link csvml_metamodel.impl.RuleBasedFieldImpl <em>Rule Based Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml_metamodel.impl.RuleBasedFieldImpl
	 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getRuleBasedField()
	 * @generated
	 */
	int RULE_BASED_FIELD = 6;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_FIELD__INDEX = DERIVED_FIELD__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_FIELD__NAME = DERIVED_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_FIELD__TYPE = DERIVED_FIELD__TYPE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_FIELD__DEFAULT_VALUE = DERIVED_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_FIELD__HAS_RULES = DERIVED_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rule Based Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_FIELD_FEATURE_COUNT = DERIVED_FIELD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link csvml_metamodel.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml_metamodel.impl.RuleImpl
	 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 9;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RESULT_VALUE = 0;

	/**
	 * The feature id for the '<em><b>RIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RINDEX = 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link csvml_metamodel.impl.ComparisonRuleImpl <em>Comparison Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml_metamodel.impl.ComparisonRuleImpl
	 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getComparisonRule()
	 * @generated
	 */
	int COMPARISON_RULE = 7;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_RULE__RESULT_VALUE = RULE__RESULT_VALUE;

	/**
	 * The feature id for the '<em><b>RIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_RULE__RINDEX = RULE__RINDEX;

	/**
	 * The feature id for the '<em><b>Compares</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_RULE__COMPARES = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comparison Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_RULE__COMPARISON_VALUE = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_RULE__OPERATOR = RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comparison Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link csvml_metamodel.impl.CompositeRuleImpl <em>Composite Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml_metamodel.impl.CompositeRuleImpl
	 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getCompositeRule()
	 * @generated
	 */
	int COMPOSITE_RULE = 8;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE__RESULT_VALUE = RULE__RESULT_VALUE;

	/**
	 * The feature id for the '<em><b>RIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE__RINDEX = RULE__RINDEX;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE__OPERATOR = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE__COMPOSED_OF = RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link csvml_metamodel.FieldType <em>Field Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml_metamodel.FieldType
	 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getFieldType()
	 * @generated
	 */
	int FIELD_TYPE = 10;

	/**
	 * The meta object id for the '{@link csvml_metamodel.AggOperation <em>Agg Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml_metamodel.AggOperation
	 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getAggOperation()
	 * @generated
	 */
	int AGG_OPERATION = 11;

	/**
	 * The meta object id for the '{@link csvml_metamodel.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml_metamodel.Operator
	 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 12;

	/**
	 * The meta object id for the '{@link csvml_metamodel.LogicalOperator <em>Logical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml_metamodel.LogicalOperator
	 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 13;


	/**
	 * Returns the meta object for class '{@link csvml_metamodel.FileDefinitionSet <em>File Definition Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Definition Set</em>'.
	 * @see csvml_metamodel.FileDefinitionSet
	 * @generated
	 */
	EClass getFileDefinitionSet();

	/**
	 * Returns the meta object for the containment reference list '{@link csvml_metamodel.FileDefinitionSet#getComprises <em>Comprises</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comprises</em>'.
	 * @see csvml_metamodel.FileDefinitionSet#getComprises()
	 * @see #getFileDefinitionSet()
	 * @generated
	 */
	EReference getFileDefinitionSet_Comprises();

	/**
	 * Returns the meta object for class '{@link csvml_metamodel.FileDefinition <em>File Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Definition</em>'.
	 * @see csvml_metamodel.FileDefinition
	 * @generated
	 */
	EClass getFileDefinition();

	/**
	 * Returns the meta object for the attribute '{@link csvml_metamodel.FileDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see csvml_metamodel.FileDefinition#getName()
	 * @see #getFileDefinition()
	 * @generated
	 */
	EAttribute getFileDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link csvml_metamodel.FileDefinition#getConsistsOF <em>Consists OF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consists OF</em>'.
	 * @see csvml_metamodel.FileDefinition#getConsistsOF()
	 * @see #getFileDefinition()
	 * @generated
	 */
	EReference getFileDefinition_ConsistsOF();

	/**
	 * Returns the meta object for class '{@link csvml_metamodel.FieldDefinition <em>Field Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Definition</em>'.
	 * @see csvml_metamodel.FieldDefinition
	 * @generated
	 */
	EClass getFieldDefinition();

	/**
	 * Returns the meta object for the attribute '{@link csvml_metamodel.FieldDefinition#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see csvml_metamodel.FieldDefinition#getIndex()
	 * @see #getFieldDefinition()
	 * @generated
	 */
	EAttribute getFieldDefinition_Index();

	/**
	 * Returns the meta object for the attribute '{@link csvml_metamodel.FieldDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see csvml_metamodel.FieldDefinition#getName()
	 * @see #getFieldDefinition()
	 * @generated
	 */
	EAttribute getFieldDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link csvml_metamodel.FieldDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see csvml_metamodel.FieldDefinition#getType()
	 * @see #getFieldDefinition()
	 * @generated
	 */
	EAttribute getFieldDefinition_Type();

	/**
	 * Returns the meta object for class '{@link csvml_metamodel.StaticField <em>Static Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Field</em>'.
	 * @see csvml_metamodel.StaticField
	 * @generated
	 */
	EClass getStaticField();

	/**
	 * Returns the meta object for class '{@link csvml_metamodel.DerivedField <em>Derived Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Field</em>'.
	 * @see csvml_metamodel.DerivedField
	 * @generated
	 */
	EClass getDerivedField();

	/**
	 * Returns the meta object for class '{@link csvml_metamodel.AggregationField <em>Aggregation Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation Field</em>'.
	 * @see csvml_metamodel.AggregationField
	 * @generated
	 */
	EClass getAggregationField();

	/**
	 * Returns the meta object for the attribute '{@link csvml_metamodel.AggregationField#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see csvml_metamodel.AggregationField#getOperation()
	 * @see #getAggregationField()
	 * @generated
	 */
	EAttribute getAggregationField_Operation();

	/**
	 * Returns the meta object for the reference list '{@link csvml_metamodel.AggregationField#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see csvml_metamodel.AggregationField#getFields()
	 * @see #getAggregationField()
	 * @generated
	 */
	EReference getAggregationField_Fields();

	/**
	 * Returns the meta object for class '{@link csvml_metamodel.RuleBasedField <em>Rule Based Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Based Field</em>'.
	 * @see csvml_metamodel.RuleBasedField
	 * @generated
	 */
	EClass getRuleBasedField();

	/**
	 * Returns the meta object for the attribute '{@link csvml_metamodel.RuleBasedField#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see csvml_metamodel.RuleBasedField#getDefaultValue()
	 * @see #getRuleBasedField()
	 * @generated
	 */
	EAttribute getRuleBasedField_DefaultValue();

	/**
	 * Returns the meta object for the containment reference list '{@link csvml_metamodel.RuleBasedField#getHasRules <em>Has Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Rules</em>'.
	 * @see csvml_metamodel.RuleBasedField#getHasRules()
	 * @see #getRuleBasedField()
	 * @generated
	 */
	EReference getRuleBasedField_HasRules();

	/**
	 * Returns the meta object for class '{@link csvml_metamodel.ComparisonRule <em>Comparison Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Rule</em>'.
	 * @see csvml_metamodel.ComparisonRule
	 * @generated
	 */
	EClass getComparisonRule();

	/**
	 * Returns the meta object for the reference '{@link csvml_metamodel.ComparisonRule#getCompares <em>Compares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compares</em>'.
	 * @see csvml_metamodel.ComparisonRule#getCompares()
	 * @see #getComparisonRule()
	 * @generated
	 */
	EReference getComparisonRule_Compares();

	/**
	 * Returns the meta object for the attribute '{@link csvml_metamodel.ComparisonRule#getComparisonValue <em>Comparison Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Value</em>'.
	 * @see csvml_metamodel.ComparisonRule#getComparisonValue()
	 * @see #getComparisonRule()
	 * @generated
	 */
	EAttribute getComparisonRule_ComparisonValue();

	/**
	 * Returns the meta object for the attribute '{@link csvml_metamodel.ComparisonRule#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see csvml_metamodel.ComparisonRule#getOperator()
	 * @see #getComparisonRule()
	 * @generated
	 */
	EAttribute getComparisonRule_Operator();

	/**
	 * Returns the meta object for class '{@link csvml_metamodel.CompositeRule <em>Composite Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Rule</em>'.
	 * @see csvml_metamodel.CompositeRule
	 * @generated
	 */
	EClass getCompositeRule();

	/**
	 * Returns the meta object for the attribute '{@link csvml_metamodel.CompositeRule#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see csvml_metamodel.CompositeRule#getOperator()
	 * @see #getCompositeRule()
	 * @generated
	 */
	EAttribute getCompositeRule_Operator();

	/**
	 * Returns the meta object for the containment reference list '{@link csvml_metamodel.CompositeRule#getComposedOf <em>Composed Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composed Of</em>'.
	 * @see csvml_metamodel.CompositeRule#getComposedOf()
	 * @see #getCompositeRule()
	 * @generated
	 */
	EReference getCompositeRule_ComposedOf();

	/**
	 * Returns the meta object for class '{@link csvml_metamodel.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see csvml_metamodel.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link csvml_metamodel.Rule#getResultValue <em>Result Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Value</em>'.
	 * @see csvml_metamodel.Rule#getResultValue()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_ResultValue();

	/**
	 * Returns the meta object for the attribute '{@link csvml_metamodel.Rule#getRIndex <em>RIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RIndex</em>'.
	 * @see csvml_metamodel.Rule#getRIndex()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_RIndex();

	/**
	 * Returns the meta object for enum '{@link csvml_metamodel.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Field Type</em>'.
	 * @see csvml_metamodel.FieldType
	 * @generated
	 */
	EEnum getFieldType();

	/**
	 * Returns the meta object for enum '{@link csvml_metamodel.AggOperation <em>Agg Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Agg Operation</em>'.
	 * @see csvml_metamodel.AggOperation
	 * @generated
	 */
	EEnum getAggOperation();

	/**
	 * Returns the meta object for enum '{@link csvml_metamodel.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see csvml_metamodel.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the meta object for enum '{@link csvml_metamodel.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Operator</em>'.
	 * @see csvml_metamodel.LogicalOperator
	 * @generated
	 */
	EEnum getLogicalOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Csvml_metamodelFactory getCsvml_metamodelFactory();

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
		 * The meta object literal for the '{@link csvml_metamodel.impl.FileDefinitionSetImpl <em>File Definition Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml_metamodel.impl.FileDefinitionSetImpl
		 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getFileDefinitionSet()
		 * @generated
		 */
		EClass FILE_DEFINITION_SET = eINSTANCE.getFileDefinitionSet();

		/**
		 * The meta object literal for the '<em><b>Comprises</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_DEFINITION_SET__COMPRISES = eINSTANCE.getFileDefinitionSet_Comprises();

		/**
		 * The meta object literal for the '{@link csvml_metamodel.impl.FileDefinitionImpl <em>File Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml_metamodel.impl.FileDefinitionImpl
		 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getFileDefinition()
		 * @generated
		 */
		EClass FILE_DEFINITION = eINSTANCE.getFileDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_DEFINITION__NAME = eINSTANCE.getFileDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Consists OF</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_DEFINITION__CONSISTS_OF = eINSTANCE.getFileDefinition_ConsistsOF();

		/**
		 * The meta object literal for the '{@link csvml_metamodel.impl.FieldDefinitionImpl <em>Field Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml_metamodel.impl.FieldDefinitionImpl
		 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getFieldDefinition()
		 * @generated
		 */
		EClass FIELD_DEFINITION = eINSTANCE.getFieldDefinition();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_DEFINITION__INDEX = eINSTANCE.getFieldDefinition_Index();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_DEFINITION__NAME = eINSTANCE.getFieldDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_DEFINITION__TYPE = eINSTANCE.getFieldDefinition_Type();

		/**
		 * The meta object literal for the '{@link csvml_metamodel.impl.StaticFieldImpl <em>Static Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml_metamodel.impl.StaticFieldImpl
		 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getStaticField()
		 * @generated
		 */
		EClass STATIC_FIELD = eINSTANCE.getStaticField();

		/**
		 * The meta object literal for the '{@link csvml_metamodel.impl.DerivedFieldImpl <em>Derived Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml_metamodel.impl.DerivedFieldImpl
		 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getDerivedField()
		 * @generated
		 */
		EClass DERIVED_FIELD = eINSTANCE.getDerivedField();

		/**
		 * The meta object literal for the '{@link csvml_metamodel.impl.AggregationFieldImpl <em>Aggregation Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml_metamodel.impl.AggregationFieldImpl
		 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getAggregationField()
		 * @generated
		 */
		EClass AGGREGATION_FIELD = eINSTANCE.getAggregationField();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATION_FIELD__OPERATION = eINSTANCE.getAggregationField_Operation();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION_FIELD__FIELDS = eINSTANCE.getAggregationField_Fields();

		/**
		 * The meta object literal for the '{@link csvml_metamodel.impl.RuleBasedFieldImpl <em>Rule Based Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml_metamodel.impl.RuleBasedFieldImpl
		 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getRuleBasedField()
		 * @generated
		 */
		EClass RULE_BASED_FIELD = eINSTANCE.getRuleBasedField();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_BASED_FIELD__DEFAULT_VALUE = eINSTANCE.getRuleBasedField_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Has Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_BASED_FIELD__HAS_RULES = eINSTANCE.getRuleBasedField_HasRules();

		/**
		 * The meta object literal for the '{@link csvml_metamodel.impl.ComparisonRuleImpl <em>Comparison Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml_metamodel.impl.ComparisonRuleImpl
		 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getComparisonRule()
		 * @generated
		 */
		EClass COMPARISON_RULE = eINSTANCE.getComparisonRule();

		/**
		 * The meta object literal for the '<em><b>Compares</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_RULE__COMPARES = eINSTANCE.getComparisonRule_Compares();

		/**
		 * The meta object literal for the '<em><b>Comparison Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_RULE__COMPARISON_VALUE = eINSTANCE.getComparisonRule_ComparisonValue();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_RULE__OPERATOR = eINSTANCE.getComparisonRule_Operator();

		/**
		 * The meta object literal for the '{@link csvml_metamodel.impl.CompositeRuleImpl <em>Composite Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml_metamodel.impl.CompositeRuleImpl
		 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getCompositeRule()
		 * @generated
		 */
		EClass COMPOSITE_RULE = eINSTANCE.getCompositeRule();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_RULE__OPERATOR = eINSTANCE.getCompositeRule_Operator();

		/**
		 * The meta object literal for the '<em><b>Composed Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_RULE__COMPOSED_OF = eINSTANCE.getCompositeRule_ComposedOf();

		/**
		 * The meta object literal for the '{@link csvml_metamodel.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml_metamodel.impl.RuleImpl
		 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Result Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__RESULT_VALUE = eINSTANCE.getRule_ResultValue();

		/**
		 * The meta object literal for the '<em><b>RIndex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__RINDEX = eINSTANCE.getRule_RIndex();

		/**
		 * The meta object literal for the '{@link csvml_metamodel.FieldType <em>Field Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml_metamodel.FieldType
		 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getFieldType()
		 * @generated
		 */
		EEnum FIELD_TYPE = eINSTANCE.getFieldType();

		/**
		 * The meta object literal for the '{@link csvml_metamodel.AggOperation <em>Agg Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml_metamodel.AggOperation
		 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getAggOperation()
		 * @generated
		 */
		EEnum AGG_OPERATION = eINSTANCE.getAggOperation();

		/**
		 * The meta object literal for the '{@link csvml_metamodel.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml_metamodel.Operator
		 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link csvml_metamodel.LogicalOperator <em>Logical Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml_metamodel.LogicalOperator
		 * @see csvml_metamodel.impl.Csvml_metamodelPackageImpl#getLogicalOperator()
		 * @generated
		 */
		EEnum LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

	}

} //Csvml_metamodelPackage
