/**
 */
package at.ac.tuwien.big.me12.csv.csvmm;

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
 * @see at.ac.tuwien.big.me12.csv.csvmm.CSVFactory
 * @model kind="package"
 * @generated
 */
public interface CSVPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "csvmm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://csv.me12.big.tuwien.ac.at/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "csv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CSVPackage eINSTANCE = at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.me12.csv.csvmm.impl.FileDefinitionImpl <em>File Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.FileDefinitionImpl
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getFileDefinition()
	 * @generated
	 */
	int FILE_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DEFINITION__FIELDS = 1;

	/**
	 * The number of structural features of the '<em>File Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.me12.csv.csvmm.impl.FieldDefinitionImpl <em>Field Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.FieldDefinitionImpl
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getFieldDefinition()
	 * @generated
	 */
	int FIELD_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION__INDEX = 1;

	/**
	 * The feature id for the '<em><b>Field Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION__FIELD_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Field Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.me12.csv.csvmm.impl.StaticFieldImpl <em>Static Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.StaticFieldImpl
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getStaticField()
	 * @generated
	 */
	int STATIC_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FIELD__NAME = FIELD_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FIELD__INDEX = FIELD_DEFINITION__INDEX;

	/**
	 * The feature id for the '<em><b>Field Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FIELD__FIELD_TYPE = FIELD_DEFINITION__FIELD_TYPE;

	/**
	 * The number of structural features of the '<em>Static Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FIELD_FEATURE_COUNT = FIELD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.me12.csv.csvmm.impl.DerivedFieldImpl <em>Derived Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.DerivedFieldImpl
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getDerivedField()
	 * @generated
	 */
	int DERIVED_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FIELD__NAME = FIELD_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FIELD__INDEX = FIELD_DEFINITION__INDEX;

	/**
	 * The feature id for the '<em><b>Field Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FIELD__FIELD_TYPE = FIELD_DEFINITION__FIELD_TYPE;

	/**
	 * The number of structural features of the '<em>Derived Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FIELD_FEATURE_COUNT = FIELD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.me12.csv.csvmm.impl.AggregationFieldImpl <em>Aggregation Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.AggregationFieldImpl
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getAggregationField()
	 * @generated
	 */
	int AGGREGATION_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FIELD__NAME = DERIVED_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FIELD__INDEX = DERIVED_FIELD__INDEX;

	/**
	 * The feature id for the '<em><b>Field Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FIELD__FIELD_TYPE = DERIVED_FIELD__FIELD_TYPE;

	/**
	 * The feature id for the '<em><b>Agg Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FIELD__AGG_TYPE = DERIVED_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aggregated Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FIELD__AGGREGATED_FIELDS = DERIVED_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aggregation Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FIELD_FEATURE_COUNT = DERIVED_FIELD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.me12.csv.csvmm.impl.RuleBasedFieldImpl <em>Rule Based Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.RuleBasedFieldImpl
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getRuleBasedField()
	 * @generated
	 */
	int RULE_BASED_FIELD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_FIELD__NAME = DERIVED_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_FIELD__INDEX = DERIVED_FIELD__INDEX;

	/**
	 * The feature id for the '<em><b>Field Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_FIELD__FIELD_TYPE = DERIVED_FIELD__FIELD_TYPE;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_FIELD__RULES = DERIVED_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_FIELD__DEFAULT_VALUE = DERIVED_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rule Based Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_FIELD_FEATURE_COUNT = DERIVED_FIELD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.me12.csv.csvmm.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.RuleImpl
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 6;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RESULT_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.me12.csv.csvmm.impl.CompositeRuleImpl <em>Composite Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CompositeRuleImpl
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getCompositeRule()
	 * @generated
	 */
	int COMPOSITE_RULE = 7;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE__RESULT_VALUE = RULE__RESULT_VALUE;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE__RULES = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE__OPERATOR = RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.me12.csv.csvmm.impl.ComparisonRuleImpl <em>Comparison Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.ComparisonRuleImpl
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getComparisonRule()
	 * @generated
	 */
	int COMPARISON_RULE = 8;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_RULE__RESULT_VALUE = RULE__RESULT_VALUE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_RULE__OPERATOR = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comparison Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_RULE__COMPARISON_VALUE = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_RULE__INPUT_FIELD = RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comparison Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.me12.csv.csvmm.impl.FileDefinitionSetImpl <em>File Definition Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.FileDefinitionSetImpl
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getFileDefinitionSet()
	 * @generated
	 */
	int FILE_DEFINITION_SET = 9;

	/**
	 * The feature id for the '<em><b>File Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DEFINITION_SET__FILE_DEFINITIONS = 0;

	/**
	 * The number of structural features of the '<em>File Definition Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DEFINITION_SET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.me12.csv.csvmm.FieldType <em>Field Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.me12.csv.csvmm.FieldType
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getFieldType()
	 * @generated
	 */
	int FIELD_TYPE = 10;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.me12.csv.csvmm.AggregationType <em>Aggregation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.me12.csv.csvmm.AggregationType
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getAggregationType()
	 * @generated
	 */
	int AGGREGATION_TYPE = 11;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.me12.csv.csvmm.ComparisonOperator <em>Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.me12.csv.csvmm.ComparisonOperator
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 12;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.me12.csv.csvmm.LogicalOperator <em>Logical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.me12.csv.csvmm.LogicalOperator
	 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 13;


	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.me12.csv.csvmm.FileDefinition <em>File Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Definition</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.FileDefinition
	 * @generated
	 */
	EClass getFileDefinition();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.me12.csv.csvmm.FileDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.FileDefinition#getName()
	 * @see #getFileDefinition()
	 * @generated
	 */
	EAttribute getFileDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.me12.csv.csvmm.FileDefinition#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.FileDefinition#getFields()
	 * @see #getFileDefinition()
	 * @generated
	 */
	EReference getFileDefinition_Fields();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.me12.csv.csvmm.FieldDefinition <em>Field Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Definition</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.FieldDefinition
	 * @generated
	 */
	EClass getFieldDefinition();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.me12.csv.csvmm.FieldDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.FieldDefinition#getName()
	 * @see #getFieldDefinition()
	 * @generated
	 */
	EAttribute getFieldDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.me12.csv.csvmm.FieldDefinition#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.FieldDefinition#getIndex()
	 * @see #getFieldDefinition()
	 * @generated
	 */
	EAttribute getFieldDefinition_Index();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.me12.csv.csvmm.FieldDefinition#getFieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Type</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.FieldDefinition#getFieldType()
	 * @see #getFieldDefinition()
	 * @generated
	 */
	EAttribute getFieldDefinition_FieldType();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.me12.csv.csvmm.StaticField <em>Static Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Field</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.StaticField
	 * @generated
	 */
	EClass getStaticField();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.me12.csv.csvmm.DerivedField <em>Derived Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Field</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.DerivedField
	 * @generated
	 */
	EClass getDerivedField();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.me12.csv.csvmm.AggregationField <em>Aggregation Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation Field</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.AggregationField
	 * @generated
	 */
	EClass getAggregationField();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.me12.csv.csvmm.AggregationField#getAggType <em>Agg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agg Type</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.AggregationField#getAggType()
	 * @see #getAggregationField()
	 * @generated
	 */
	EAttribute getAggregationField_AggType();

	/**
	 * Returns the meta object for the reference list '{@link at.ac.tuwien.big.me12.csv.csvmm.AggregationField#getAggregatedFields <em>Aggregated Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aggregated Fields</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.AggregationField#getAggregatedFields()
	 * @see #getAggregationField()
	 * @generated
	 */
	EReference getAggregationField_AggregatedFields();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.me12.csv.csvmm.RuleBasedField <em>Rule Based Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Based Field</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.RuleBasedField
	 * @generated
	 */
	EClass getRuleBasedField();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.me12.csv.csvmm.RuleBasedField#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.RuleBasedField#getRules()
	 * @see #getRuleBasedField()
	 * @generated
	 */
	EReference getRuleBasedField_Rules();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.me12.csv.csvmm.RuleBasedField#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.RuleBasedField#getDefaultValue()
	 * @see #getRuleBasedField()
	 * @generated
	 */
	EAttribute getRuleBasedField_DefaultValue();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.me12.csv.csvmm.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.me12.csv.csvmm.Rule#getResultValue <em>Result Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Value</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.Rule#getResultValue()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_ResultValue();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.me12.csv.csvmm.CompositeRule <em>Composite Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Rule</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.CompositeRule
	 * @generated
	 */
	EClass getCompositeRule();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.me12.csv.csvmm.CompositeRule#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.CompositeRule#getRules()
	 * @see #getCompositeRule()
	 * @generated
	 */
	EReference getCompositeRule_Rules();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.me12.csv.csvmm.CompositeRule#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.CompositeRule#getOperator()
	 * @see #getCompositeRule()
	 * @generated
	 */
	EAttribute getCompositeRule_Operator();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.me12.csv.csvmm.ComparisonRule <em>Comparison Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Rule</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.ComparisonRule
	 * @generated
	 */
	EClass getComparisonRule();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.me12.csv.csvmm.ComparisonRule#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.ComparisonRule#getOperator()
	 * @see #getComparisonRule()
	 * @generated
	 */
	EAttribute getComparisonRule_Operator();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.me12.csv.csvmm.ComparisonRule#getComparisonValue <em>Comparison Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Value</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.ComparisonRule#getComparisonValue()
	 * @see #getComparisonRule()
	 * @generated
	 */
	EAttribute getComparisonRule_ComparisonValue();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.me12.csv.csvmm.ComparisonRule#getInputField <em>Input Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Field</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.ComparisonRule#getInputField()
	 * @see #getComparisonRule()
	 * @generated
	 */
	EReference getComparisonRule_InputField();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.me12.csv.csvmm.FileDefinitionSet <em>File Definition Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Definition Set</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.FileDefinitionSet
	 * @generated
	 */
	EClass getFileDefinitionSet();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.me12.csv.csvmm.FileDefinitionSet#getFileDefinitions <em>File Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File Definitions</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.FileDefinitionSet#getFileDefinitions()
	 * @see #getFileDefinitionSet()
	 * @generated
	 */
	EReference getFileDefinitionSet_FileDefinitions();

	/**
	 * Returns the meta object for enum '{@link at.ac.tuwien.big.me12.csv.csvmm.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Field Type</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.FieldType
	 * @generated
	 */
	EEnum getFieldType();

	/**
	 * Returns the meta object for enum '{@link at.ac.tuwien.big.me12.csv.csvmm.AggregationType <em>Aggregation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregation Type</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.AggregationType
	 * @generated
	 */
	EEnum getAggregationType();

	/**
	 * Returns the meta object for enum '{@link at.ac.tuwien.big.me12.csv.csvmm.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Operator</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.ComparisonOperator
	 * @generated
	 */
	EEnum getComparisonOperator();

	/**
	 * Returns the meta object for enum '{@link at.ac.tuwien.big.me12.csv.csvmm.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Operator</em>'.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.LogicalOperator
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
	CSVFactory getCSVFactory();

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
		 * The meta object literal for the '{@link at.ac.tuwien.big.me12.csv.csvmm.impl.FileDefinitionImpl <em>File Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.FileDefinitionImpl
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getFileDefinition()
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
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_DEFINITION__FIELDS = eINSTANCE.getFileDefinition_Fields();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.me12.csv.csvmm.impl.FieldDefinitionImpl <em>Field Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.FieldDefinitionImpl
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getFieldDefinition()
		 * @generated
		 */
		EClass FIELD_DEFINITION = eINSTANCE.getFieldDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_DEFINITION__NAME = eINSTANCE.getFieldDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_DEFINITION__INDEX = eINSTANCE.getFieldDefinition_Index();

		/**
		 * The meta object literal for the '<em><b>Field Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_DEFINITION__FIELD_TYPE = eINSTANCE.getFieldDefinition_FieldType();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.me12.csv.csvmm.impl.StaticFieldImpl <em>Static Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.StaticFieldImpl
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getStaticField()
		 * @generated
		 */
		EClass STATIC_FIELD = eINSTANCE.getStaticField();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.me12.csv.csvmm.impl.DerivedFieldImpl <em>Derived Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.DerivedFieldImpl
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getDerivedField()
		 * @generated
		 */
		EClass DERIVED_FIELD = eINSTANCE.getDerivedField();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.me12.csv.csvmm.impl.AggregationFieldImpl <em>Aggregation Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.AggregationFieldImpl
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getAggregationField()
		 * @generated
		 */
		EClass AGGREGATION_FIELD = eINSTANCE.getAggregationField();

		/**
		 * The meta object literal for the '<em><b>Agg Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATION_FIELD__AGG_TYPE = eINSTANCE.getAggregationField_AggType();

		/**
		 * The meta object literal for the '<em><b>Aggregated Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION_FIELD__AGGREGATED_FIELDS = eINSTANCE.getAggregationField_AggregatedFields();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.me12.csv.csvmm.impl.RuleBasedFieldImpl <em>Rule Based Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.RuleBasedFieldImpl
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getRuleBasedField()
		 * @generated
		 */
		EClass RULE_BASED_FIELD = eINSTANCE.getRuleBasedField();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_BASED_FIELD__RULES = eINSTANCE.getRuleBasedField_Rules();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_BASED_FIELD__DEFAULT_VALUE = eINSTANCE.getRuleBasedField_DefaultValue();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.me12.csv.csvmm.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.RuleImpl
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getRule()
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
		 * The meta object literal for the '{@link at.ac.tuwien.big.me12.csv.csvmm.impl.CompositeRuleImpl <em>Composite Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CompositeRuleImpl
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getCompositeRule()
		 * @generated
		 */
		EClass COMPOSITE_RULE = eINSTANCE.getCompositeRule();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_RULE__RULES = eINSTANCE.getCompositeRule_Rules();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_RULE__OPERATOR = eINSTANCE.getCompositeRule_Operator();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.me12.csv.csvmm.impl.ComparisonRuleImpl <em>Comparison Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.ComparisonRuleImpl
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getComparisonRule()
		 * @generated
		 */
		EClass COMPARISON_RULE = eINSTANCE.getComparisonRule();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_RULE__OPERATOR = eINSTANCE.getComparisonRule_Operator();

		/**
		 * The meta object literal for the '<em><b>Comparison Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_RULE__COMPARISON_VALUE = eINSTANCE.getComparisonRule_ComparisonValue();

		/**
		 * The meta object literal for the '<em><b>Input Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_RULE__INPUT_FIELD = eINSTANCE.getComparisonRule_InputField();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.me12.csv.csvmm.impl.FileDefinitionSetImpl <em>File Definition Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.FileDefinitionSetImpl
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getFileDefinitionSet()
		 * @generated
		 */
		EClass FILE_DEFINITION_SET = eINSTANCE.getFileDefinitionSet();

		/**
		 * The meta object literal for the '<em><b>File Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_DEFINITION_SET__FILE_DEFINITIONS = eINSTANCE.getFileDefinitionSet_FileDefinitions();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.me12.csv.csvmm.FieldType <em>Field Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.me12.csv.csvmm.FieldType
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getFieldType()
		 * @generated
		 */
		EEnum FIELD_TYPE = eINSTANCE.getFieldType();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.me12.csv.csvmm.AggregationType <em>Aggregation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.me12.csv.csvmm.AggregationType
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getAggregationType()
		 * @generated
		 */
		EEnum AGGREGATION_TYPE = eINSTANCE.getAggregationType();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.me12.csv.csvmm.ComparisonOperator <em>Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.me12.csv.csvmm.ComparisonOperator
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getComparisonOperator()
		 * @generated
		 */
		EEnum COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.me12.csv.csvmm.LogicalOperator <em>Logical Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.me12.csv.csvmm.LogicalOperator
		 * @see at.ac.tuwien.big.me12.csv.csvmm.impl.CSVPackageImpl#getLogicalOperator()
		 * @generated
		 */
		EEnum LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

	}

} //CSVPackage
