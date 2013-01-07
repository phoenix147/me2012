/**
 */
package gsml_metamodel.impl;

import gsml_metamodel.ConcreteTask;
import gsml_metamodel.gradingsystemPackage;
import gsml_metamodel.Gsml_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gsml_metamodel.impl.ConcreteTaskImpl#getMaxPoints <em>Max Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcreteTaskImpl extends TaskImpl implements ConcreteTask {
	/**
	 * The default value of the '{@link #getMaxPoints() <em>Max Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxPoints() <em>Max Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPoints()
	 * @generated
	 * @ordered
	 */
	protected int maxPoints = MAX_POINTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsml_metamodelPackage.Literals.CONCRETE_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxPoints() {
		return maxPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxPoints(int newMaxPoints) {
		int oldMaxPoints = maxPoints;
		maxPoints = newMaxPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsml_metamodelPackage.CONCRETE_TASK__MAX_POINTS, oldMaxPoints, maxPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Gsml_metamodelPackage.CONCRETE_TASK__MAX_POINTS:
				return getMaxPoints();
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
			case Gsml_metamodelPackage.CONCRETE_TASK__MAX_POINTS:
				setMaxPoints((Integer)newValue);
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
			case Gsml_metamodelPackage.CONCRETE_TASK__MAX_POINTS:
				setMaxPoints(MAX_POINTS_EDEFAULT);
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
			case Gsml_metamodelPackage.CONCRETE_TASK__MAX_POINTS:
				return maxPoints != MAX_POINTS_EDEFAULT;
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
		result.append(" (MaxPoints: ");
		result.append(maxPoints);
		result.append(')');
		return result.toString();
	}

} //ConcreteTaskImpl
