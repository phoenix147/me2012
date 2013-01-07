/**
 */
package csvml_metamodel.util;

import csvml_metamodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see csvml_metamodel.Csvml_metamodelPackage
 * @generated
 */
public class Csvml_metamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Csvml_metamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Csvml_metamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = Csvml_metamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Csvml_metamodelPackage.FILE_DEFINITION_SET: {
				FileDefinitionSet fileDefinitionSet = (FileDefinitionSet)theEObject;
				T result = caseFileDefinitionSet(fileDefinitionSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Csvml_metamodelPackage.FILE_DEFINITION: {
				FileDefinition fileDefinition = (FileDefinition)theEObject;
				T result = caseFileDefinition(fileDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Csvml_metamodelPackage.FIELD_DEFINITION: {
				FieldDefinition fieldDefinition = (FieldDefinition)theEObject;
				T result = caseFieldDefinition(fieldDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Csvml_metamodelPackage.STATIC_FIELD: {
				StaticField staticField = (StaticField)theEObject;
				T result = caseStaticField(staticField);
				if (result == null) result = caseFieldDefinition(staticField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Csvml_metamodelPackage.DERIVED_FIELD: {
				DerivedField derivedField = (DerivedField)theEObject;
				T result = caseDerivedField(derivedField);
				if (result == null) result = caseFieldDefinition(derivedField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Csvml_metamodelPackage.AGGREGATION_FIELD: {
				AggregationField aggregationField = (AggregationField)theEObject;
				T result = caseAggregationField(aggregationField);
				if (result == null) result = caseDerivedField(aggregationField);
				if (result == null) result = caseFieldDefinition(aggregationField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Csvml_metamodelPackage.RULE_BASED_FIELD: {
				RuleBasedField ruleBasedField = (RuleBasedField)theEObject;
				T result = caseRuleBasedField(ruleBasedField);
				if (result == null) result = caseDerivedField(ruleBasedField);
				if (result == null) result = caseFieldDefinition(ruleBasedField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Csvml_metamodelPackage.COMPARISON_RULE: {
				ComparisonRule comparisonRule = (ComparisonRule)theEObject;
				T result = caseComparisonRule(comparisonRule);
				if (result == null) result = caseRule(comparisonRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Csvml_metamodelPackage.COMPOSITE_RULE: {
				CompositeRule compositeRule = (CompositeRule)theEObject;
				T result = caseCompositeRule(compositeRule);
				if (result == null) result = caseRule(compositeRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Csvml_metamodelPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Definition Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Definition Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileDefinitionSet(FileDefinitionSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileDefinition(FileDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldDefinition(FieldDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticField(StaticField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedField(DerivedField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationField(AggregationField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Based Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Based Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleBasedField(RuleBasedField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonRule(ComparisonRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeRule(CompositeRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Csvml_metamodelSwitch
