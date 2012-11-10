/**
 */
package gsml_metamodel.impl;

import gsml_metamodel.Grade;
import gsml_metamodel.Gsml_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gsml_metamodel.impl.GradeImpl#getName <em>Name</em>}</li>
 *   <li>{@link gsml_metamodel.impl.GradeImpl#getRequiredPoints <em>Required Points</em>}</li>
 *   <li>{@link gsml_metamodel.impl.GradeImpl#isDefaultIfNotFullfiled <em>Default If Not Fullfiled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GradeImpl extends EObjectImpl implements Grade {
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
	 * The default value of the '{@link #getRequiredPoints() <em>Required Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int REQUIRED_POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRequiredPoints() <em>Required Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPoints()
	 * @generated
	 * @ordered
	 */
	protected int requiredPoints = REQUIRED_POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isDefaultIfNotFullfiled() <em>Default If Not Fullfiled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultIfNotFullfiled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_IF_NOT_FULLFILED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefaultIfNotFullfiled() <em>Default If Not Fullfiled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultIfNotFullfiled()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultIfNotFullfiled = DEFAULT_IF_NOT_FULLFILED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GradeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsml_metamodelPackage.Literals.GRADE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsml_metamodelPackage.GRADE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRequiredPoints() {
		return requiredPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredPoints(int newRequiredPoints) {
		int oldRequiredPoints = requiredPoints;
		requiredPoints = newRequiredPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsml_metamodelPackage.GRADE__REQUIRED_POINTS, oldRequiredPoints, requiredPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefaultIfNotFullfiled() {
		return defaultIfNotFullfiled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultIfNotFullfiled(boolean newDefaultIfNotFullfiled) {
		boolean oldDefaultIfNotFullfiled = defaultIfNotFullfiled;
		defaultIfNotFullfiled = newDefaultIfNotFullfiled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsml_metamodelPackage.GRADE__DEFAULT_IF_NOT_FULLFILED, oldDefaultIfNotFullfiled, defaultIfNotFullfiled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Gsml_metamodelPackage.GRADE__NAME:
				return getName();
			case Gsml_metamodelPackage.GRADE__REQUIRED_POINTS:
				return getRequiredPoints();
			case Gsml_metamodelPackage.GRADE__DEFAULT_IF_NOT_FULLFILED:
				return isDefaultIfNotFullfiled();
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
			case Gsml_metamodelPackage.GRADE__NAME:
				setName((String)newValue);
				return;
			case Gsml_metamodelPackage.GRADE__REQUIRED_POINTS:
				setRequiredPoints((Integer)newValue);
				return;
			case Gsml_metamodelPackage.GRADE__DEFAULT_IF_NOT_FULLFILED:
				setDefaultIfNotFullfiled((Boolean)newValue);
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
			case Gsml_metamodelPackage.GRADE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Gsml_metamodelPackage.GRADE__REQUIRED_POINTS:
				setRequiredPoints(REQUIRED_POINTS_EDEFAULT);
				return;
			case Gsml_metamodelPackage.GRADE__DEFAULT_IF_NOT_FULLFILED:
				setDefaultIfNotFullfiled(DEFAULT_IF_NOT_FULLFILED_EDEFAULT);
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
			case Gsml_metamodelPackage.GRADE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Gsml_metamodelPackage.GRADE__REQUIRED_POINTS:
				return requiredPoints != REQUIRED_POINTS_EDEFAULT;
			case Gsml_metamodelPackage.GRADE__DEFAULT_IF_NOT_FULLFILED:
				return defaultIfNotFullfiled != DEFAULT_IF_NOT_FULLFILED_EDEFAULT;
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
		result.append(", RequiredPoints: ");
		result.append(requiredPoints);
		result.append(", DefaultIfNotFullfiled: ");
		result.append(defaultIfNotFullfiled);
		result.append(')');
		return result.toString();
	}

} //GradeImpl
