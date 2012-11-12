/**
 */
package csvml_metamodel.impl;

import csvml_metamodel.Csvml_metamodelPackage;
import csvml_metamodel.Rule;

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
 *   <li>{@link csvml_metamodel.impl.RuleImpl#getResultValue <em>Result Value</em>}</li>
 *   <li>{@link csvml_metamodel.impl.RuleImpl#getRIndex <em>RIndex</em>}</li>
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
	 * The default value of the '{@link #getRIndex() <em>RIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int RINDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRIndex() <em>RIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRIndex()
	 * @generated
	 * @ordered
	 */
	protected int rIndex = RINDEX_EDEFAULT;

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
		return Csvml_metamodelPackage.Literals.RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Csvml_metamodelPackage.RULE__RESULT_VALUE, oldResultValue, resultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRIndex() {
		return rIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRIndex(int newRIndex) {
		int oldRIndex = rIndex;
		rIndex = newRIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Csvml_metamodelPackage.RULE__RINDEX, oldRIndex, rIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Csvml_metamodelPackage.RULE__RESULT_VALUE:
				return getResultValue();
			case Csvml_metamodelPackage.RULE__RINDEX:
				return getRIndex();
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
			case Csvml_metamodelPackage.RULE__RESULT_VALUE:
				setResultValue((String)newValue);
				return;
			case Csvml_metamodelPackage.RULE__RINDEX:
				setRIndex((Integer)newValue);
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
			case Csvml_metamodelPackage.RULE__RESULT_VALUE:
				setResultValue(RESULT_VALUE_EDEFAULT);
				return;
			case Csvml_metamodelPackage.RULE__RINDEX:
				setRIndex(RINDEX_EDEFAULT);
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
			case Csvml_metamodelPackage.RULE__RESULT_VALUE:
				return RESULT_VALUE_EDEFAULT == null ? resultValue != null : !RESULT_VALUE_EDEFAULT.equals(resultValue);
			case Csvml_metamodelPackage.RULE__RINDEX:
				return rIndex != RINDEX_EDEFAULT;
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
		result.append(" (ResultValue: ");
		result.append(resultValue);
		result.append(", RIndex: ");
		result.append(rIndex);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
