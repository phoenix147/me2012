/**
 */
package csvml_metamodel.impl;

import csvml_metamodel.Csvml_metamodelPackage;
import csvml_metamodel.Rule;
import csvml_metamodel.RuleBasedField;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Based Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link csvml_metamodel.impl.RuleBasedFieldImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link csvml_metamodel.impl.RuleBasedFieldImpl#getHasRules <em>Has Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleBasedFieldImpl extends DerivedFieldImpl implements RuleBasedField {
	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasRules() <em>Has Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> hasRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleBasedFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Csvml_metamodelPackage.Literals.RULE_BASED_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Csvml_metamodelPackage.RULE_BASED_FIELD__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getHasRules() {
		if (hasRules == null) {
			hasRules = new EObjectContainmentEList<Rule>(Rule.class, this, Csvml_metamodelPackage.RULE_BASED_FIELD__HAS_RULES);
		}
		return hasRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Csvml_metamodelPackage.RULE_BASED_FIELD__HAS_RULES:
				return ((InternalEList<?>)getHasRules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Csvml_metamodelPackage.RULE_BASED_FIELD__DEFAULT_VALUE:
				return getDefaultValue();
			case Csvml_metamodelPackage.RULE_BASED_FIELD__HAS_RULES:
				return getHasRules();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Csvml_metamodelPackage.RULE_BASED_FIELD__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case Csvml_metamodelPackage.RULE_BASED_FIELD__HAS_RULES:
				getHasRules().clear();
				getHasRules().addAll((Collection<? extends Rule>)newValue);
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
			case Csvml_metamodelPackage.RULE_BASED_FIELD__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case Csvml_metamodelPackage.RULE_BASED_FIELD__HAS_RULES:
				getHasRules().clear();
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
			case Csvml_metamodelPackage.RULE_BASED_FIELD__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case Csvml_metamodelPackage.RULE_BASED_FIELD__HAS_RULES:
				return hasRules != null && !hasRules.isEmpty();
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
		result.append(" (DefaultValue: ");
		result.append(defaultValue);
		result.append(')');
		return result.toString();
	}

} //RuleBasedFieldImpl
