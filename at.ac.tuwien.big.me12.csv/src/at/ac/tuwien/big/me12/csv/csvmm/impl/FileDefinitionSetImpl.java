/**
 */
package at.ac.tuwien.big.me12.csv.csvmm.impl;

import at.ac.tuwien.big.me12.csv.csvmm.CSVPackage;
import at.ac.tuwien.big.me12.csv.csvmm.FileDefinition;
import at.ac.tuwien.big.me12.csv.csvmm.FileDefinitionSet;

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
 *   <li>{@link at.ac.tuwien.big.me12.csv.csvmm.impl.FileDefinitionSetImpl#getFileDefinitions <em>File Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileDefinitionSetImpl extends EObjectImpl implements FileDefinitionSet {
	/**
	 * The cached value of the '{@link #getFileDefinitions() <em>File Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<FileDefinition> fileDefinitions;

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
		return CSVPackage.Literals.FILE_DEFINITION_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileDefinition> getFileDefinitions() {
		if (fileDefinitions == null) {
			fileDefinitions = new EObjectContainmentEList<FileDefinition>(FileDefinition.class, this, CSVPackage.FILE_DEFINITION_SET__FILE_DEFINITIONS);
		}
		return fileDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CSVPackage.FILE_DEFINITION_SET__FILE_DEFINITIONS:
				return ((InternalEList<?>)getFileDefinitions()).basicRemove(otherEnd, msgs);
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
			case CSVPackage.FILE_DEFINITION_SET__FILE_DEFINITIONS:
				return getFileDefinitions();
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
			case CSVPackage.FILE_DEFINITION_SET__FILE_DEFINITIONS:
				getFileDefinitions().clear();
				getFileDefinitions().addAll((Collection<? extends FileDefinition>)newValue);
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
			case CSVPackage.FILE_DEFINITION_SET__FILE_DEFINITIONS:
				getFileDefinitions().clear();
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
			case CSVPackage.FILE_DEFINITION_SET__FILE_DEFINITIONS:
				return fileDefinitions != null && !fileDefinitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FileDefinitionSetImpl
