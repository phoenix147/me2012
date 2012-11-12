/**
 */
package csvml_metamodel.impl;

import csvml_metamodel.Csvml_metamodelPackage;
import csvml_metamodel.FileDefinition;
import csvml_metamodel.FileDefinitionSet;

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
 * An implementation of the model object '<em><b>File Definition Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link csvml_metamodel.impl.FileDefinitionSetImpl#getComprises <em>Comprises</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileDefinitionSetImpl extends EObjectImpl implements FileDefinitionSet {
	/**
	 * The cached value of the '{@link #getComprises() <em>Comprises</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComprises()
	 * @generated
	 * @ordered
	 */
	protected EList<FileDefinition> comprises;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileDefinitionSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Csvml_metamodelPackage.Literals.FILE_DEFINITION_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileDefinition> getComprises() {
		if (comprises == null) {
			comprises = new EObjectContainmentEList<FileDefinition>(FileDefinition.class, this, Csvml_metamodelPackage.FILE_DEFINITION_SET__COMPRISES);
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
			case Csvml_metamodelPackage.FILE_DEFINITION_SET__COMPRISES:
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
			case Csvml_metamodelPackage.FILE_DEFINITION_SET__COMPRISES:
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
			case Csvml_metamodelPackage.FILE_DEFINITION_SET__COMPRISES:
				getComprises().clear();
				getComprises().addAll((Collection<? extends FileDefinition>)newValue);
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
			case Csvml_metamodelPackage.FILE_DEFINITION_SET__COMPRISES:
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
			case Csvml_metamodelPackage.FILE_DEFINITION_SET__COMPRISES:
				return comprises != null && !comprises.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FileDefinitionSetImpl
