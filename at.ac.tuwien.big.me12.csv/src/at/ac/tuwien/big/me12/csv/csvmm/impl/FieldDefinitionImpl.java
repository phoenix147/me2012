/**
 */
package at.ac.tuwien.big.me12.csv.csvmm.impl;

import at.ac.tuwien.big.me12.csv.csvmm.CSVPackage;
import at.ac.tuwien.big.me12.csv.csvmm.FieldDefinition;
import at.ac.tuwien.big.me12.csv.csvmm.FieldType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.me12.csv.csvmm.impl.FieldDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.tuwien.big.me12.csv.csvmm.impl.FieldDefinitionImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link at.ac.tuwien.big.me12.csv.csvmm.impl.FieldDefinitionImpl#getFieldType <em>Field Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FieldDefinitionImpl extends EObjectImpl implements FieldDefinition {
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
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getFieldType() <em>Field Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldType()
	 * @generated
	 * @ordered
	 */
	protected static final FieldType FIELD_TYPE_EDEFAULT = FieldType.STRING;

	/**
	 * The cached value of the '{@link #getFieldType() <em>Field Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldType()
	 * @generated
	 * @ordered
	 */
	protected FieldType fieldType = FIELD_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSVPackage.Literals.FIELD_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CSVPackage.FIELD_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSVPackage.FIELD_DEFINITION__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldType getFieldType() {
		return fieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldType(FieldType newFieldType) {
		FieldType oldFieldType = fieldType;
		fieldType = newFieldType == null ? FIELD_TYPE_EDEFAULT : newFieldType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSVPackage.FIELD_DEFINITION__FIELD_TYPE, oldFieldType, fieldType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSVPackage.FIELD_DEFINITION__NAME:
				return getName();
			case CSVPackage.FIELD_DEFINITION__INDEX:
				return getIndex();
			case CSVPackage.FIELD_DEFINITION__FIELD_TYPE:
				return getFieldType();
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
			case CSVPackage.FIELD_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case CSVPackage.FIELD_DEFINITION__INDEX:
				setIndex((Integer)newValue);
				return;
			case CSVPackage.FIELD_DEFINITION__FIELD_TYPE:
				setFieldType((FieldType)newValue);
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
			case CSVPackage.FIELD_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CSVPackage.FIELD_DEFINITION__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case CSVPackage.FIELD_DEFINITION__FIELD_TYPE:
				setFieldType(FIELD_TYPE_EDEFAULT);
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
			case CSVPackage.FIELD_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CSVPackage.FIELD_DEFINITION__INDEX:
				return index != INDEX_EDEFAULT;
			case CSVPackage.FIELD_DEFINITION__FIELD_TYPE:
				return fieldType != FIELD_TYPE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", index: ");
		result.append(index);
		result.append(", fieldType: ");
		result.append(fieldType);
		result.append(')');
		return result.toString();
	}

} //FieldDefinitionImpl
