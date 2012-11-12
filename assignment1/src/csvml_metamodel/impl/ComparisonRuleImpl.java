/**
 */
package csvml_metamodel.impl;

import csvml_metamodel.ComparisonRule;
import csvml_metamodel.Csvml_metamodelPackage;
import csvml_metamodel.FieldDefinition;
import csvml_metamodel.Operator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link csvml_metamodel.impl.ComparisonRuleImpl#getCompares <em>Compares</em>}</li>
 *   <li>{@link csvml_metamodel.impl.ComparisonRuleImpl#getComparisonValue <em>Comparison Value</em>}</li>
 *   <li>{@link csvml_metamodel.impl.ComparisonRuleImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComparisonRuleImpl extends RuleImpl implements ComparisonRule {
	/**
	 * The cached value of the '{@link #getCompares() <em>Compares</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompares()
	 * @generated
	 * @ordered
	 */
	protected FieldDefinition compares;

	/**
	 * The default value of the '{@link #getComparisonValue() <em>Comparison Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonValue()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPARISON_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComparisonValue() <em>Comparison Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonValue()
	 * @generated
	 * @ordered
	 */
	protected String comparisonValue = COMPARISON_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final Operator OPERATOR_EDEFAULT = Operator.GREATER;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Operator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Csvml_metamodelPackage.Literals.COMPARISON_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldDefinition getCompares() {
		if (compares != null && compares.eIsProxy()) {
			InternalEObject oldCompares = (InternalEObject)compares;
			compares = (FieldDefinition)eResolveProxy(oldCompares);
			if (compares != oldCompares) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Csvml_metamodelPackage.COMPARISON_RULE__COMPARES, oldCompares, compares));
			}
		}
		return compares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldDefinition basicGetCompares() {
		return compares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompares(FieldDefinition newCompares) {
		FieldDefinition oldCompares = compares;
		compares = newCompares;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Csvml_metamodelPackage.COMPARISON_RULE__COMPARES, oldCompares, compares));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComparisonValue() {
		return comparisonValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonValue(String newComparisonValue) {
		String oldComparisonValue = comparisonValue;
		comparisonValue = newComparisonValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Csvml_metamodelPackage.COMPARISON_RULE__COMPARISON_VALUE, oldComparisonValue, comparisonValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Operator newOperator) {
		Operator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Csvml_metamodelPackage.COMPARISON_RULE__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Csvml_metamodelPackage.COMPARISON_RULE__COMPARES:
				if (resolve) return getCompares();
				return basicGetCompares();
			case Csvml_metamodelPackage.COMPARISON_RULE__COMPARISON_VALUE:
				return getComparisonValue();
			case Csvml_metamodelPackage.COMPARISON_RULE__OPERATOR:
				return getOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Csvml_metamodelPackage.COMPARISON_RULE__COMPARES:
				setCompares((FieldDefinition)newValue);
				return;
			case Csvml_metamodelPackage.COMPARISON_RULE__COMPARISON_VALUE:
				setComparisonValue((String)newValue);
				return;
			case Csvml_metamodelPackage.COMPARISON_RULE__OPERATOR:
				setOperator((Operator)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Csvml_metamodelPackage.COMPARISON_RULE__COMPARES:
				setCompares((FieldDefinition)null);
				return;
			case Csvml_metamodelPackage.COMPARISON_RULE__COMPARISON_VALUE:
				setComparisonValue(COMPARISON_VALUE_EDEFAULT);
				return;
			case Csvml_metamodelPackage.COMPARISON_RULE__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Csvml_metamodelPackage.COMPARISON_RULE__COMPARES:
				return compares != null;
			case Csvml_metamodelPackage.COMPARISON_RULE__COMPARISON_VALUE:
				return COMPARISON_VALUE_EDEFAULT == null ? comparisonValue != null : !COMPARISON_VALUE_EDEFAULT.equals(comparisonValue);
			case Csvml_metamodelPackage.COMPARISON_RULE__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ComparisonValue: ");
		result.append(comparisonValue);
		result.append(", Operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //ComparisonRuleImpl
