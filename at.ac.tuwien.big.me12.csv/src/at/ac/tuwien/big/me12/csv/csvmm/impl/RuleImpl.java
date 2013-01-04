/**
 */
package at.ac.tuwien.big.me12.csv.csvmm.impl;

import at.ac.tuwien.big.me12.csv.csvmm.CSVPackage;
import at.ac.tuwien.big.me12.csv.csvmm.Rule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.me12.csv.csvmm.impl.RuleImpl#getResultValue <em>Result Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RuleImpl extends EObjectImpl implements Rule {
	/**
	 * The default value of the '{@link #getResultValue() <em>Result Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultValue() <em>Result Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultValue()
	 * @generated
	 * @ordered
	 */
	protected String resultValue = RESULT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSVPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultValue() {
		return resultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultValue(String newResultValue) {
		String oldResultValue = resultValue;
		resultValue = newResultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSVPackage.RULE__RESULT_VALUE, oldResultValue, resultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSVPackage.RULE__RESULT_VALUE:
				return getResultValue();
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
			case CSVPackage.RULE__RESULT_VALUE:
				setResultValue((String)newValue);
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
			case CSVPackage.RULE__RESULT_VALUE:
				setResultValue(RESULT_VALUE_EDEFAULT);
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
			case CSVPackage.RULE__RESULT_VALUE:
				return RESULT_VALUE_EDEFAULT == null ? resultValue != null : !RESULT_VALUE_EDEFAULT.equals(resultValue);
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
		result.append(" (resultValue: ");
		result.append(resultValue);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
