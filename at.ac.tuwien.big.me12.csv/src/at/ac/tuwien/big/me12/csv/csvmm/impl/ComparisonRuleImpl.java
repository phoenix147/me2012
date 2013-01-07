/**
 */
package at.ac.tuwien.big.me12.csv.csvmm.impl;

import at.ac.tuwien.big.me12.csv.csvmm.CSVPackage;
import at.ac.tuwien.big.me12.csv.csvmm.ComparisonOperator;
import at.ac.tuwien.big.me12.csv.csvmm.ComparisonRule;
import at.ac.tuwien.big.me12.csv.csvmm.FieldDefinition;

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
 *   <li>{@link at.ac.tuwien.big.me12.csv.csvmm.impl.ComparisonRuleImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link at.ac.tuwien.big.me12.csv.csvmm.impl.ComparisonRuleImpl#getComparisonValue <em>Comparison Value</em>}</li>
 *   <li>{@link at.ac.tuwien.big.me12.csv.csvmm.impl.ComparisonRuleImpl#getInputField <em>Input Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComparisonRuleImpl extends RuleImpl implements ComparisonRule {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonOperator OPERATOR_EDEFAULT = ComparisonOperator.GREATER;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperator operator = OPERATOR_EDEFAULT;

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
	 * The cached value of the '{@link #getInputField() <em>Input Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputField()
	 * @generated
	 * @ordered
	 */
	protected FieldDefinition inputField;

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
		return CSVPackage.Literals.COMPARISON_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(ComparisonOperator newOperator) {
		ComparisonOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSVPackage.COMPARISON_RULE__OPERATOR, oldOperator, operator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CSVPackage.COMPARISON_RULE__COMPARISON_VALUE, oldComparisonValue, comparisonValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldDefinition getInputField() {
		if (inputField != null && inputField.eIsProxy()) {
			InternalEObject oldInputField = (InternalEObject)inputField;
			inputField = (FieldDefinition)eResolveProxy(oldInputField);
			if (inputField != oldInputField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSVPackage.COMPARISON_RULE__INPUT_FIELD, oldInputField, inputField));
			}
		}
		return inputField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldDefinition basicGetInputField() {
		return inputField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputField(FieldDefinition newInputField) {
		FieldDefinition oldInputField = inputField;
		inputField = newInputField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSVPackage.COMPARISON_RULE__INPUT_FIELD, oldInputField, inputField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSVPackage.COMPARISON_RULE__OPERATOR:
				return getOperator();
			case CSVPackage.COMPARISON_RULE__COMPARISON_VALUE:
				return getComparisonValue();
			case CSVPackage.COMPARISON_RULE__INPUT_FIELD:
				if (resolve) return getInputField();
				return basicGetInputField();
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
			case CSVPackage.COMPARISON_RULE__OPERATOR:
				setOperator((ComparisonOperator)newValue);
				return;
			case CSVPackage.COMPARISON_RULE__COMPARISON_VALUE:
				setComparisonValue((String)newValue);
				return;
			case CSVPackage.COMPARISON_RULE__INPUT_FIELD:
				setInputField((FieldDefinition)newValue);
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
			case CSVPackage.COMPARISON_RULE__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case CSVPackage.COMPARISON_RULE__COMPARISON_VALUE:
				setComparisonValue(COMPARISON_VALUE_EDEFAULT);
				return;
			case CSVPackage.COMPARISON_RULE__INPUT_FIELD:
				setInputField((FieldDefinition)null);
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
			case CSVPackage.COMPARISON_RULE__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case CSVPackage.COMPARISON_RULE__COMPARISON_VALUE:
				return COMPARISON_VALUE_EDEFAULT == null ? comparisonValue != null : !COMPARISON_VALUE_EDEFAULT.equals(comparisonValue);
			case CSVPackage.COMPARISON_RULE__INPUT_FIELD:
				return inputField != null;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(", comparisonValue: ");
		result.append(comparisonValue);
		result.append(')');
		return result.toString();
	}

} //ComparisonRuleImpl
