/**
 */
package csvml_metamodel.impl;

import csvml_metamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class Csvml_metamodelFactoryImpl extends EFactoryImpl implements Csvml_metamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Csvml_metamodelFactory init() {
		try {
			Csvml_metamodelFactory theCsvml_metamodelFactory = (Csvml_metamodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://csvml_metamodel/1.0"); 
			if (theCsvml_metamodelFactory != null) {
				return theCsvml_metamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Csvml_metamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Csvml_metamodelFactoryImpl() {
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
			case Csvml_metamodelPackage.FILE_DEFINITION_SET: return createFileDefinitionSet();
			case Csvml_metamodelPackage.FILE_DEFINITION: return createFileDefinition();
			case Csvml_metamodelPackage.STATIC_FIELD: return createStaticField();
			case Csvml_metamodelPackage.AGGREGATION_FIELD: return createAggregationField();
			case Csvml_metamodelPackage.RULE_BASED_FIELD: return createRuleBasedField();
			case Csvml_metamodelPackage.COMPARISON_RULE: return createComparisonRule();
			case Csvml_metamodelPackage.COMPOSITE_RULE: return createCompositeRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Csvml_metamodelPackage.FIELD_TYPE:
				return createFieldTypeFromString(eDataType, initialValue);
			case Csvml_metamodelPackage.AGG_OPERATION:
				return createAggOperationFromString(eDataType, initialValue);
			case Csvml_metamodelPackage.OPERATOR:
				return createOperatorFromString(eDataType, initialValue);
			case Csvml_metamodelPackage.LOGICAL_OPERATOR:
				return createLogicalOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Csvml_metamodelPackage.FIELD_TYPE:
				return convertFieldTypeToString(eDataType, instanceValue);
			case Csvml_metamodelPackage.AGG_OPERATION:
				return convertAggOperationToString(eDataType, instanceValue);
			case Csvml_metamodelPackage.OPERATOR:
				return convertOperatorToString(eDataType, instanceValue);
			case Csvml_metamodelPackage.LOGICAL_OPERATOR:
				return convertLogicalOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileDefinitionSet createFileDefinitionSet() {
		FileDefinitionSetImpl fileDefinitionSet = new FileDefinitionSetImpl();
		return fileDefinitionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileDefinition createFileDefinition() {
		FileDefinitionImpl fileDefinition = new FileDefinitionImpl();
		return fileDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticField createStaticField() {
		StaticFieldImpl staticField = new StaticFieldImpl();
		return staticField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationField createAggregationField() {
		AggregationFieldImpl aggregationField = new AggregationFieldImpl();
		return aggregationField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleBasedField createRuleBasedField() {
		RuleBasedFieldImpl ruleBasedField = new RuleBasedFieldImpl();
		return ruleBasedField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonRule createComparisonRule() {
		ComparisonRuleImpl comparisonRule = new ComparisonRuleImpl();
		return comparisonRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeRule createCompositeRule() {
		CompositeRuleImpl compositeRule = new CompositeRuleImpl();
		return compositeRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldType createFieldTypeFromString(EDataType eDataType, String initialValue) {
		FieldType result = FieldType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFieldTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggOperation createAggOperationFromString(EDataType eDataType, String initialValue) {
		AggOperation result = AggOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperatorFromString(EDataType eDataType, String initialValue) {
		Operator result = Operator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperator createLogicalOperatorFromString(EDataType eDataType, String initialValue) {
		LogicalOperator result = LogicalOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Csvml_metamodelPackage getCsvml_metamodelPackage() {
		return (Csvml_metamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Csvml_metamodelPackage getPackage() {
		return Csvml_metamodelPackage.eINSTANCE;
	}

} //Csvml_metamodelFactoryImpl
