/**
 */
package csvml_metamodel.impl;

import csvml_metamodel.AggOperation;
import csvml_metamodel.AggregationField;
import csvml_metamodel.ComparisonRule;
import csvml_metamodel.CompositeRule;
import csvml_metamodel.Csvml_metamodelFactory;
import csvml_metamodel.Csvml_metamodelPackage;
import csvml_metamodel.DerivedField;
import csvml_metamodel.FieldDefinition;
import csvml_metamodel.FieldType;
import csvml_metamodel.FileDefinition;
import csvml_metamodel.FileDefinitionSet;
import csvml_metamodel.LogicalOperator;
import csvml_metamodel.Operator;
import csvml_metamodel.Rule;
import csvml_metamodel.RuleBasedField;
import csvml_metamodel.StaticField;

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
public class Csvml_metamodelPackageImpl extends EPackageImpl implements Csvml_metamodelPackage {
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
	private EClass comparisonRuleEClass = null;

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
	private EClass ruleEClass = null;

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
	private EEnum aggOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorEEnum = null;

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
	 * @see csvml_metamodel.Csvml_metamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Csvml_metamodelPackageImpl() {
		super(eNS_URI, Csvml_metamodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Csvml_metamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Csvml_metamodelPackage init() {
		if (isInited) return (Csvml_metamodelPackage)EPackage.Registry.INSTANCE.getEPackage(Csvml_metamodelPackage.eNS_URI);

		// Obtain or create and register package
		Csvml_metamodelPackageImpl theCsvml_metamodelPackage = (Csvml_metamodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Csvml_metamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Csvml_metamodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCsvml_metamodelPackage.createPackageContents();

		// Initialize created meta-data
		theCsvml_metamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCsvml_metamodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Csvml_metamodelPackage.eNS_URI, theCsvml_metamodelPackage);
		return theCsvml_metamodelPackage;
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
	public EReference getFileDefinitionSet_Comprises() {
		return (EReference)fileDefinitionSetEClass.getEStructuralFeatures().get(0);
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
	public EReference getFileDefinition_ConsistsOF() {
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
	public EAttribute getFieldDefinition_Index() {
		return (EAttribute)fieldDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldDefinition_Name() {
		return (EAttribute)fieldDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldDefinition_Type() {
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
	public EAttribute getAggregationField_Operation() {
		return (EAttribute)aggregationFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregationField_Fields() {
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
	public EAttribute getRuleBasedField_DefaultValue() {
		return (EAttribute)ruleBasedFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleBasedField_HasRules() {
		return (EReference)ruleBasedFieldEClass.getEStructuralFeatures().get(1);
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
	public EReference getComparisonRule_Compares() {
		return (EReference)comparisonRuleEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getComparisonRule_Operator() {
		return (EAttribute)comparisonRuleEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getCompositeRule_Operator() {
		return (EAttribute)compositeRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeRule_ComposedOf() {
		return (EReference)compositeRuleEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getRule_RIndex() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
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
	public EEnum getAggOperation() {
		return aggOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperator() {
		return operatorEEnum;
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
	public Csvml_metamodelFactory getCsvml_metamodelFactory() {
		return (Csvml_metamodelFactory)getEFactoryInstance();
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
		fileDefinitionSetEClass = createEClass(FILE_DEFINITION_SET);
		createEReference(fileDefinitionSetEClass, FILE_DEFINITION_SET__COMPRISES);

		fileDefinitionEClass = createEClass(FILE_DEFINITION);
		createEAttribute(fileDefinitionEClass, FILE_DEFINITION__NAME);
		createEReference(fileDefinitionEClass, FILE_DEFINITION__CONSISTS_OF);

		fieldDefinitionEClass = createEClass(FIELD_DEFINITION);
		createEAttribute(fieldDefinitionEClass, FIELD_DEFINITION__INDEX);
		createEAttribute(fieldDefinitionEClass, FIELD_DEFINITION__NAME);
		createEAttribute(fieldDefinitionEClass, FIELD_DEFINITION__TYPE);

		staticFieldEClass = createEClass(STATIC_FIELD);

		derivedFieldEClass = createEClass(DERIVED_FIELD);

		aggregationFieldEClass = createEClass(AGGREGATION_FIELD);
		createEAttribute(aggregationFieldEClass, AGGREGATION_FIELD__OPERATION);
		createEReference(aggregationFieldEClass, AGGREGATION_FIELD__FIELDS);

		ruleBasedFieldEClass = createEClass(RULE_BASED_FIELD);
		createEAttribute(ruleBasedFieldEClass, RULE_BASED_FIELD__DEFAULT_VALUE);
		createEReference(ruleBasedFieldEClass, RULE_BASED_FIELD__HAS_RULES);

		comparisonRuleEClass = createEClass(COMPARISON_RULE);
		createEReference(comparisonRuleEClass, COMPARISON_RULE__COMPARES);
		createEAttribute(comparisonRuleEClass, COMPARISON_RULE__COMPARISON_VALUE);
		createEAttribute(comparisonRuleEClass, COMPARISON_RULE__OPERATOR);

		compositeRuleEClass = createEClass(COMPOSITE_RULE);
		createEAttribute(compositeRuleEClass, COMPOSITE_RULE__OPERATOR);
		createEReference(compositeRuleEClass, COMPOSITE_RULE__COMPOSED_OF);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__RESULT_VALUE);
		createEAttribute(ruleEClass, RULE__RINDEX);

		// Create enums
		fieldTypeEEnum = createEEnum(FIELD_TYPE);
		aggOperationEEnum = createEEnum(AGG_OPERATION);
		operatorEEnum = createEEnum(OPERATOR);
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
		comparisonRuleEClass.getESuperTypes().add(this.getRule());
		compositeRuleEClass.getESuperTypes().add(this.getRule());

		// Initialize classes and features; add operations and parameters
		initEClass(fileDefinitionSetEClass, FileDefinitionSet.class, "FileDefinitionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFileDefinitionSet_Comprises(), this.getFileDefinition(), null, "comprises", null, 1, -1, FileDefinitionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileDefinitionEClass, FileDefinition.class, "FileDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileDefinition_Name(), ecorePackage.getEString(), "Name", null, 0, 1, FileDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileDefinition_ConsistsOF(), this.getFieldDefinition(), null, "consistsOF", null, 1, -1, FileDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldDefinitionEClass, FieldDefinition.class, "FieldDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldDefinition_Index(), ecorePackage.getEInt(), "Index", null, 0, 1, FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldDefinition_Name(), ecorePackage.getEString(), "Name", null, 0, 1, FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldDefinition_Type(), this.getFieldType(), "Type", null, 0, 1, FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticFieldEClass, StaticField.class, "StaticField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(derivedFieldEClass, DerivedField.class, "DerivedField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aggregationFieldEClass, AggregationField.class, "AggregationField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAggregationField_Operation(), this.getAggOperation(), "operation", null, 0, 1, AggregationField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAggregationField_Fields(), this.getFieldDefinition(), null, "fields", null, 1, -1, AggregationField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleBasedFieldEClass, RuleBasedField.class, "RuleBasedField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleBasedField_DefaultValue(), ecorePackage.getEString(), "DefaultValue", null, 0, 1, RuleBasedField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleBasedField_HasRules(), this.getRule(), null, "hasRules", null, 1, -1, RuleBasedField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonRuleEClass, ComparisonRule.class, "ComparisonRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComparisonRule_Compares(), this.getFieldDefinition(), null, "compares", null, 1, 1, ComparisonRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparisonRule_ComparisonValue(), ecorePackage.getEString(), "ComparisonValue", null, 0, 1, ComparisonRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparisonRule_Operator(), this.getOperator(), "Operator", null, 0, 1, ComparisonRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeRuleEClass, CompositeRule.class, "CompositeRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompositeRule_Operator(), this.getLogicalOperator(), "Operator", null, 0, 1, CompositeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeRule_ComposedOf(), this.getRule(), null, "composedOf", null, 1, -1, CompositeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_ResultValue(), ecorePackage.getEString(), "ResultValue", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_RIndex(), ecorePackage.getEInt(), "RIndex", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(fieldTypeEEnum, FieldType.class, "FieldType");
		addEEnumLiteral(fieldTypeEEnum, FieldType.STRING);
		addEEnumLiteral(fieldTypeEEnum, FieldType.INTEGER);
		addEEnumLiteral(fieldTypeEEnum, FieldType.BOOLEAN);

		initEEnum(aggOperationEEnum, AggOperation.class, "AggOperation");
		addEEnumLiteral(aggOperationEEnum, AggOperation.SUM);
		addEEnumLiteral(aggOperationEEnum, AggOperation.AVERAGE);
		addEEnumLiteral(aggOperationEEnum, AggOperation.MINIMUM);
		addEEnumLiteral(aggOperationEEnum, AggOperation.MAXIMUM);

		initEEnum(operatorEEnum, Operator.class, "Operator");
		addEEnumLiteral(operatorEEnum, Operator.GREATER);
		addEEnumLiteral(operatorEEnum, Operator.GREATER_OR_EQUALS);
		addEEnumLiteral(operatorEEnum, Operator.LOWER);
		addEEnumLiteral(operatorEEnum, Operator.LOWER_OR_EQUALS);
		addEEnumLiteral(operatorEEnum, Operator.UN_EQUALS);
		addEEnumLiteral(operatorEEnum, Operator.EQUALS);

		initEEnum(logicalOperatorEEnum, LogicalOperator.class, "LogicalOperator");
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.AND);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.OR);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.NOT);

		// Create resource
		createResource(eNS_URI);
	}

} //Csvml_metamodelPackageImpl
