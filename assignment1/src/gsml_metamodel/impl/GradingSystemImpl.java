/**
 */
package gsml_metamodel.impl;

import gsml_metamodel.Course;
import gsml_metamodel.GradingSystem;
import gsml_metamodel.gradingsystemPackage;
import gsml_metamodel.Gsml_metamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grading System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gsml_metamodel.impl.GradingSystemImpl#getComprises <em>Comprises</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GradingSystemImpl extends EObjectImpl implements GradingSystem {
	/**
	 * The cached value of the '{@link #getComprises() <em>Comprises</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComprises()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> comprises;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GradingSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsml_metamodelPackage.Literals.GRADING_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getComprises() {
		if (comprises == null) {
			comprises = new EObjectContainmentEList<Course>(Course.class, this, Gsml_metamodelPackage.GRADING_SYSTEM__COMPRISES);
		}
		return comprises;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gsml_metamodelPackage.GRADING_SYSTEM__COMPRISES:
				return ((InternalEList<?>)getComprises()).basicRemove(otherEnd, msgs);
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
			case Gsml_metamodelPackage.GRADING_SYSTEM__COMPRISES:
				return getComprises();
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
			case Gsml_metamodelPackage.GRADING_SYSTEM__COMPRISES:
				getComprises().clear();
				getComprises().addAll((Collection<? extends Course>)newValue);
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
			case Gsml_metamodelPackage.GRADING_SYSTEM__COMPRISES:
				getComprises().clear();
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
			case Gsml_metamodelPackage.GRADING_SYSTEM__COMPRISES:
				return comprises != null && !comprises.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GradingSystemImpl
