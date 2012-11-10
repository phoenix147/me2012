/**
 */
package gsml_metamodel.impl;

import gsml_metamodel.Gsml_metamodelPackage;
import gsml_metamodel.Task;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gsml_metamodel.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link gsml_metamodel.impl.TaskImpl#getMinRequierment <em>Min Requierment</em>}</li>
 *   <li>{@link gsml_metamodel.impl.TaskImpl#isRequiermentIsAbsolute <em>Requierment Is Absolute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TaskImpl extends EObjectImpl implements Task {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinRequierment() <em>Min Requierment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRequierment()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_REQUIERMENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinRequierment() <em>Min Requierment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRequierment()
	 * @generated
	 * @ordered
	 */
	protected float minRequierment = MIN_REQUIERMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequiermentIsAbsolute() <em>Requierment Is Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiermentIsAbsolute()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIERMENT_IS_ABSOLUTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequiermentIsAbsolute() <em>Requierment Is Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiermentIsAbsolute()
	 * @generated
	 * @ordered
	 */
	protected boolean requiermentIsAbsolute = REQUIERMENT_IS_ABSOLUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsml_metamodelPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsml_metamodelPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinRequierment() {
		return minRequierment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRequierment(float newMinRequierment) {
		float oldMinRequierment = minRequierment;
		minRequierment = newMinRequierment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsml_metamodelPackage.TASK__MIN_REQUIERMENT, oldMinRequierment, minRequierment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequiermentIsAbsolute() {
		return requiermentIsAbsolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiermentIsAbsolute(boolean newRequiermentIsAbsolute) {
		boolean oldRequiermentIsAbsolute = requiermentIsAbsolute;
		requiermentIsAbsolute = newRequiermentIsAbsolute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsml_metamodelPackage.TASK__REQUIERMENT_IS_ABSOLUTE, oldRequiermentIsAbsolute, requiermentIsAbsolute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Gsml_metamodelPackage.TASK__NAME:
				return getName();
			case Gsml_metamodelPackage.TASK__MIN_REQUIERMENT:
				return getMinRequierment();
			case Gsml_metamodelPackage.TASK__REQUIERMENT_IS_ABSOLUTE:
				return isRequiermentIsAbsolute();
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
			case Gsml_metamodelPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case Gsml_metamodelPackage.TASK__MIN_REQUIERMENT:
				setMinRequierment((Float)newValue);
				return;
			case Gsml_metamodelPackage.TASK__REQUIERMENT_IS_ABSOLUTE:
				setRequiermentIsAbsolute((Boolean)newValue);
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
			case Gsml_metamodelPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Gsml_metamodelPackage.TASK__MIN_REQUIERMENT:
				setMinRequierment(MIN_REQUIERMENT_EDEFAULT);
				return;
			case Gsml_metamodelPackage.TASK__REQUIERMENT_IS_ABSOLUTE:
				setRequiermentIsAbsolute(REQUIERMENT_IS_ABSOLUTE_EDEFAULT);
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
			case Gsml_metamodelPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Gsml_metamodelPackage.TASK__MIN_REQUIERMENT:
				return minRequierment != MIN_REQUIERMENT_EDEFAULT;
			case Gsml_metamodelPackage.TASK__REQUIERMENT_IS_ABSOLUTE:
				return requiermentIsAbsolute != REQUIERMENT_IS_ABSOLUTE_EDEFAULT;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", MinRequierment: ");
		result.append(minRequierment);
		result.append(", RequiermentIsAbsolute: ");
		result.append(requiermentIsAbsolute);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
