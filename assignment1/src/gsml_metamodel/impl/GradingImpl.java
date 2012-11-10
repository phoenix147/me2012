/**
 */
package gsml_metamodel.impl;

import gsml_metamodel.Grading;
import gsml_metamodel.GradingScheme;
import gsml_metamodel.Gsml_metamodelPackage;
import gsml_metamodel.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gsml_metamodel.impl.GradingImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link gsml_metamodel.impl.GradingImpl#getConsistsOf <em>Consists Of</em>}</li>
 *   <li>{@link gsml_metamodel.impl.GradingImpl#getSpecifiedBy <em>Specified By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GradingImpl extends EObjectImpl implements Grading {
	/**
	 * The default value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMESTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected String semester = SEMESTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConsistsOf() <em>Consists Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistsOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> consistsOf;

	/**
	 * The cached value of the '{@link #getSpecifiedBy() <em>Specified By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifiedBy()
	 * @generated
	 * @ordered
	 */
	protected GradingScheme specifiedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GradingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsml_metamodelPackage.Literals.GRADING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSemester() {
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemester(String newSemester) {
		String oldSemester = semester;
		semester = newSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsml_metamodelPackage.GRADING__SEMESTER, oldSemester, semester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getConsistsOf() {
		if (consistsOf == null) {
			consistsOf = new EObjectContainmentEList<Task>(Task.class, this, Gsml_metamodelPackage.GRADING__CONSISTS_OF);
		}
		return consistsOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradingScheme getSpecifiedBy() {
		return specifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecifiedBy(GradingScheme newSpecifiedBy, NotificationChain msgs) {
		GradingScheme oldSpecifiedBy = specifiedBy;
		specifiedBy = newSpecifiedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gsml_metamodelPackage.GRADING__SPECIFIED_BY, oldSpecifiedBy, newSpecifiedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecifiedBy(GradingScheme newSpecifiedBy) {
		if (newSpecifiedBy != specifiedBy) {
			NotificationChain msgs = null;
			if (specifiedBy != null)
				msgs = ((InternalEObject)specifiedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Gsml_metamodelPackage.GRADING__SPECIFIED_BY, null, msgs);
			if (newSpecifiedBy != null)
				msgs = ((InternalEObject)newSpecifiedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Gsml_metamodelPackage.GRADING__SPECIFIED_BY, null, msgs);
			msgs = basicSetSpecifiedBy(newSpecifiedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsml_metamodelPackage.GRADING__SPECIFIED_BY, newSpecifiedBy, newSpecifiedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gsml_metamodelPackage.GRADING__CONSISTS_OF:
				return ((InternalEList<?>)getConsistsOf()).basicRemove(otherEnd, msgs);
			case Gsml_metamodelPackage.GRADING__SPECIFIED_BY:
				return basicSetSpecifiedBy(null, msgs);
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
			case Gsml_metamodelPackage.GRADING__SEMESTER:
				return getSemester();
			case Gsml_metamodelPackage.GRADING__CONSISTS_OF:
				return getConsistsOf();
			case Gsml_metamodelPackage.GRADING__SPECIFIED_BY:
				return getSpecifiedBy();
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
			case Gsml_metamodelPackage.GRADING__SEMESTER:
				setSemester((String)newValue);
				return;
			case Gsml_metamodelPackage.GRADING__CONSISTS_OF:
				getConsistsOf().clear();
				getConsistsOf().addAll((Collection<? extends Task>)newValue);
				return;
			case Gsml_metamodelPackage.GRADING__SPECIFIED_BY:
				setSpecifiedBy((GradingScheme)newValue);
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
			case Gsml_metamodelPackage.GRADING__SEMESTER:
				setSemester(SEMESTER_EDEFAULT);
				return;
			case Gsml_metamodelPackage.GRADING__CONSISTS_OF:
				getConsistsOf().clear();
				return;
			case Gsml_metamodelPackage.GRADING__SPECIFIED_BY:
				setSpecifiedBy((GradingScheme)null);
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
			case Gsml_metamodelPackage.GRADING__SEMESTER:
				return SEMESTER_EDEFAULT == null ? semester != null : !SEMESTER_EDEFAULT.equals(semester);
			case Gsml_metamodelPackage.GRADING__CONSISTS_OF:
				return consistsOf != null && !consistsOf.isEmpty();
			case Gsml_metamodelPackage.GRADING__SPECIFIED_BY:
				return specifiedBy != null;
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
		result.append(" (Semester: ");
		result.append(semester);
		result.append(')');
		return result.toString();
	}

} //GradingImpl
