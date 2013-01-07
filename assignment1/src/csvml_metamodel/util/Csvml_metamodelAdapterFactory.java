/**
 */
package csvml_metamodel.util;

import csvml_metamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see csvml_metamodel.Csvml_metamodelPackage
 * @generated
 */
public class Csvml_metamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Csvml_metamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Csvml_metamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Csvml_metamodelPackage.eINSTANCE;
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
	protected Csvml_metamodelSwitch<Adapter> modelSwitch =
		new Csvml_metamodelSwitch<Adapter>() {
			@Override
			public Adapter caseFileDefinitionSet(FileDefinitionSet object) {
				return createFileDefinitionSetAdapter();
			}
			@Override
			public Adapter caseFileDefinition(FileDefinition object) {
				return createFileDefinitionAdapter();
			}
			@Override
			public Adapter caseFieldDefinition(FieldDefinition object) {
				return createFieldDefinitionAdapter();
			}
			@Override
			public Adapter caseStaticField(StaticField object) {
				return createStaticFieldAdapter();
			}
			@Override
			public Adapter caseDerivedField(DerivedField object) {
				return createDerivedFieldAdapter();
			}
			@Override
			public Adapter caseAggregationField(AggregationField object) {
				return createAggregationFieldAdapter();
			}
			@Override
			public Adapter caseRuleBasedField(RuleBasedField object) {
				return createRuleBasedFieldAdapter();
			}
			@Override
			public Adapter caseComparisonRule(ComparisonRule object) {
				return createComparisonRuleAdapter();
			}
			@Override
			public Adapter caseCompositeRule(CompositeRule object) {
				return createCompositeRuleAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
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
	 * Creates a new adapter for an object of class '{@link csvml_metamodel.FileDefinitionSet <em>File Definition Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csvml_metamodel.FileDefinitionSet
	 * @generated
	 */
	public Adapter createFileDefinitionSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csvml_metamodel.FileDefinition <em>File Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csvml_metamodel.FileDefinition
	 * @generated
	 */
	public Adapter createFileDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csvml_metamodel.FieldDefinition <em>Field Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csvml_metamodel.FieldDefinition
	 * @generated
	 */
	public Adapter createFieldDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csvml_metamodel.StaticField <em>Static Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csvml_metamodel.StaticField
	 * @generated
	 */
	public Adapter createStaticFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csvml_metamodel.DerivedField <em>Derived Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csvml_metamodel.DerivedField
	 * @generated
	 */
	public Adapter createDerivedFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csvml_metamodel.AggregationField <em>Aggregation Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csvml_metamodel.AggregationField
	 * @generated
	 */
	public Adapter createAggregationFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csvml_metamodel.RuleBasedField <em>Rule Based Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csvml_metamodel.RuleBasedField
	 * @generated
	 */
	public Adapter createRuleBasedFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csvml_metamodel.ComparisonRule <em>Comparison Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csvml_metamodel.ComparisonRule
	 * @generated
	 */
	public Adapter createComparisonRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csvml_metamodel.CompositeRule <em>Composite Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csvml_metamodel.CompositeRule
	 * @generated
	 */
	public Adapter createCompositeRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csvml_metamodel.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csvml_metamodel.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
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

} //Csvml_metamodelAdapterFactory
