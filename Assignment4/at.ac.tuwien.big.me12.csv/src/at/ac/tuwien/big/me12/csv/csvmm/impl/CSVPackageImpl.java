/**
 */
package at.ac.tuwien.big.me12.csv.csvmm.impl;

import at.ac.tuwien.big.me12.csv.csvmm.AggregationField;
import at.ac.tuwien.big.me12.csv.csvmm.AggregationType;
import at.ac.tuwien.big.me12.csv.csvmm.CSVFactory;
import at.ac.tuwien.big.me12.csv.csvmm.CSVPackage;
import at.ac.tuwien.big.me12.csv.csvmm.ComparisonOperator;
import at.ac.tuwien.big.me12.csv.csvmm.ComparisonRule;
import at.ac.tuwien.big.me12.csv.csvmm.CompositeRule;
import at.ac.tuwien.big.me12.csv.csvmm.DerivedField;
import at.ac.tuwien.big.me12.csv.csvmm.FieldDefinition;
import at.ac.tuwien.big.me12.csv.csvmm.FieldType;
import at.ac.tuwien.big.me12.csv.csvmm.FileDefinition;
import at.ac.tuwien.big.me12.csv.csvmm.FileDefinitionSet;
import at.ac.tuwien.big.me12.csv.csvmm.LogicalOperator;
import at.ac.tuwien.big.me12.csv.csvmm.Rule;
import at.ac.tuwien.big.me12.csv.csvmm.RuleBasedField;
import at.ac.tuwien.big.me12.csv.csvmm.StaticField;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CSVPackageImpl extends EPackageImpl implements CSVPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleBasedFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileDefinitionSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fieldTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see at.ac.tuwien.big.me12.csv.csvmm.CSVPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CSVPackageImpl() {
		super(eNS_URI, CSVFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CSVPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CSVPackage init() {
		if (isInited) return (CSVPackage)EPackage.Registry.INSTANCE.getEPackage(CSVPackage.eNS_URI);

		// Obtain or create and register package
		CSVPackageImpl theCSVPackage = (CSVPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CSVPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CSVPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCSVPackage.createPackageContents();

		// Initialize created meta-data
		theCSVPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCSVPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CSVPackage.eNS_URI, theCSVPackage);
		return theCSVPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileDefinition() {
		return fileDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileDefinition_Name() {
		return (EAttribute)fileDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileDefinition_Fields() {
		return (EReference)fileDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldDefinition() {
		return fieldDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldDefinition_Name() {
		return (EAttribute)fieldDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldDefinition_Index() {
		return (EAttribute)fieldDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldDefinition_FieldType() {
		return (EAttribute)fieldDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticField() {
		return staticFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedField() {
		return derivedFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregationField() {
		return aggregationFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregationField_AggType() {
		return (EAttribute)aggregationFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregationField_AggregatedFields() {
		return (EReference)aggregationFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleBasedField() {
		return ruleBasedFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleBasedField_Rules() {
		return (EReference)ruleBasedFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleBasedField_DefaultValue() {
		return (EAttribute)ruleBasedFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_ResultValue() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeRule() {
		return compositeRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeRule_Rules() {
		return (EReference)compositeRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeRule_Operator() {
		return (EAttribute)compositeRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparisonRule() {
		return comparisonRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonRule_Operator() {
		return (EAttribute)comparisonRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonRule_ComparisonValue() {
		return (EAttribute)comparisonRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparisonRule_InputField() {
		return (EReference)comparisonRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileDefinitionSet() {
		return fileDefinitionSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileDefinitionSet_FileDefinitions() {
		return (EReference)fileDefinitionSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFieldType() {
		return fieldTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregationType() {
		return aggregationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparisonOperator() {
		return comparisonOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicalOperator() {
		return logicalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSVFactory getCSVFactory() {
		return (CSVFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		fileDefinitionEClass = createEClass(FILE_DEFINITION);
		createEAttribute(fileDefinitionEClass, FILE_DEFINITION__NAME);
		createEReference(fileDefinitionEClass, FILE_DEFINITION__FIELDS);

		fieldDefinitionEClass = createEClass(FIELD_DEFINITION);
		createEAttribute(fieldDefinitionEClass, FIELD_DEFINITION__NAME);
		createEAttribute(fieldDefinitionEClass, FIELD_DEFINITION__INDEX);
		createEAttribute(fieldDefinitionEClass, FIELD_DEFINITION__FIELD_TYPE);

		staticFieldEClass = createEClass(STATIC_FIELD);

		derivedFieldEClass = createEClass(DERIVED_FIELD);

		aggregationFieldEClass = createEClass(AGGREGATION_FIELD);
		createEAttribute(aggregationFieldEClass, AGGREGATION_FIELD__AGG_TYPE);
		createEReference(aggregationFieldEClass, AGGREGATION_FIELD__AGGREGATED_FIELDS);

		ruleBasedFieldEClass = createEClass(RULE_BASED_FIELD);
		createEReference(ruleBasedFieldEClass, RULE_BASED_FIELD__RULES);
		createEAttribute(ruleBasedFieldEClass, RULE_BASED_FIELD__DEFAULT_VALUE);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__RESULT_VALUE);

		compositeRuleEClass = createEClass(COMPOSITE_RULE);
		createEReference(compositeRuleEClass, COMPOSITE_RULE__RULES);
		createEAttribute(compositeRuleEClass, COMPOSITE_RULE__OPERATOR);

		comparisonRuleEClass = createEClass(COMPARISON_RULE);
		createEAttribute(comparisonRuleEClass, COMPARISON_RULE__OPERATOR);
		createEAttribute(comparisonRuleEClass, COMPARISON_RULE__COMPARISON_VALUE);
		createEReference(comparisonRuleEClass, COMPARISON_RULE__INPUT_FIELD);

		fileDefinitionSetEClass = createEClass(FILE_DEFINITION_SET);
		createEReference(fileDefinitionSetEClass, FILE_DEFINITION_SET__FILE_DEFINITIONS);

		// Create enums
		fieldTypeEEnum = createEEnum(FIELD_TYPE);
		aggregationTypeEEnum = createEEnum(AGGREGATION_TYPE);
		comparisonOperatorEEnum = createEEnum(COMPARISON_OPERATOR);
		logicalOperatorEEnum = createEEnum(LOGICAL_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		staticFieldEClass.getESuperTypes().add(this.getFieldDefinition());
		derivedFieldEClass.getESuperTypes().add(this.getFieldDefinition());
		aggregationFieldEClass.getESuperTypes().add(this.getDerivedField());
		ruleBasedFieldEClass.getESuperTypes().add(this.getDerivedField());
		compositeRuleEClass.getESuperTypes().add(this.getRule());
		comparisonRuleEClass.getESuperTypes().add(this.getRule());

		// Initialize classes and features; add operations and parameters
		initEClass(fileDefinitionEClass, FileDefinition.class, "FileDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1, FileDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileDefinition_Fields(), this.getFieldDefinition(), null, "fields", null, 0, -1, FileDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldDefinitionEClass, FieldDefinition.class, "FieldDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1, FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldDefinition_Index(), ecorePackage.getEInt(), "index", null, 1, 1, FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldDefinition_FieldType(), this.getFieldType(), "fieldType", null, 0, 1, FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticFieldEClass, StaticField.class, "StaticField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(derivedFieldEClass, DerivedField.class, "DerivedField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aggregationFieldEClass, AggregationField.class, "AggregationField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAggregationField_AggType(), this.getAggregationType(), "aggType", null, 0, 1, AggregationField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAggregationField_AggregatedFields(), this.getFieldDefinition(), null, "aggregatedFields", null, 1, -1, AggregationField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleBasedFieldEClass, RuleBasedField.class, "RuleBasedField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleBasedField_Rules(), this.getRule(), null, "rules", null, 1, -1, RuleBasedField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleBasedField_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, RuleBasedField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_ResultValue(), ecorePackage.getEString(), "resultValue", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeRuleEClass, CompositeRule.class, "CompositeRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeRule_Rules(), this.getRule(), null, "rules", null, 1, -1, CompositeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeRule_Operator(), this.getLogicalOperator(), "operator", null, 1, 1, CompositeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonRuleEClass, ComparisonRule.class, "ComparisonRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparisonRule_Operator(), this.getComparisonOperator(), "operator", null, 1, 1, ComparisonRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparisonRule_ComparisonValue(), ecorePackage.getEString(), "comparisonValue", null, 1, 1, ComparisonRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparisonRule_InputField(), this.getFieldDefinition(), null, "inputField", null, 1, 1, ComparisonRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileDefinitionSetEClass, FileDefinitionSet.class, "FileDefinitionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFileDefinitionSet_FileDefinitions(), this.getFileDefinition(), null, "fileDefinitions", null, 0, -1, FileDefinitionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(fieldTypeEEnum, FieldType.class, "FieldType");
		addEEnumLiteral(fieldTypeEEnum, FieldType.STRING);
		addEEnumLiteral(fieldTypeEEnum, FieldType.INTEGER);
		addEEnumLiteral(fieldTypeEEnum, FieldType.BOOLEAN);

		initEEnum(aggregationTypeEEnum, AggregationType.class, "AggregationType");
		addEEnumLiteral(aggregationTypeEEnum, AggregationType.SUM);
		addEEnumLiteral(aggregationTypeEEnum, AggregationType.AVERAGE);
		addEEnumLiteral(aggregationTypeEEnum, AggregationType.MIN);
		addEEnumLiteral(aggregationTypeEEnum, AggregationType.MAX);

		initEEnum(comparisonOperatorEEnum, ComparisonOperator.class, "ComparisonOperator");
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATER);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATER_OR_EQUALS);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LOWER);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.UNEQUALS);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.EQUALS);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LOWER_OR_EQUALS);

		initEEnum(logicalOperatorEEnum, LogicalOperator.class, "LogicalOperator");
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.AND);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.OR);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.NOT);

		// Create resource
		createResource(eNS_URI);
	}

} //CSVPackageImpl
