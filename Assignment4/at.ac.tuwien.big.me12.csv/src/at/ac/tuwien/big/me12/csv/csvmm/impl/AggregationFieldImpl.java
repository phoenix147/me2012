/**
 */
package at.ac.tuwien.big.me12.csv.csvmm.impl;

import at.ac.tuwien.big.me12.csv.csvmm.AggregationField;
import at.ac.tuwien.big.me12.csv.csvmm.AggregationType;
import at.ac.tuwien.big.me12.csv.csvmm.CSVPackage;
import at.ac.tuwien.big.me12.csv.csvmm.FieldDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregation Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.me12.csv.csvmm.impl.AggregationFieldImpl#getAggType <em>Agg Type</em>}</li>
 *   <li>{@link at.ac.tuwien.big.me12.csv.csvmm.impl.AggregationFieldImpl#getAggregatedFields <em>Aggregated Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregationFieldImpl extends DerivedFieldImpl implements AggregationField {
	/**
	 * The default value of the '{@link #getAggType() <em>Agg Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggType()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationType AGG_TYPE_EDEFAULT = AggregationType.SUM;

	/**
	 * The cached value of the '{@link #getAggType() <em>Agg Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggType()
	 * @generated
	 * @ordered
	 */
	protected AggregationType aggType = AGG_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAggregatedFields() <em>Aggregated Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregatedFields()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldDefinition> aggregatedFields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregationFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSVPackage.Literals.AGGREGATION_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationType getAggType() {
		return aggType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggType(AggregationType newAggType) {
		AggregationType oldAggType = aggType;
		aggType = newAggType == null ? AGG_TYPE_EDEFAULT : newAggType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSVPackage.AGGREGATION_FIELD__AGG_TYPE, oldAggType, aggType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldDefinition> getAggregatedFields() {
		if (aggregatedFields == null) {
			aggregatedFields = new EObjectResolvingEList<FieldDefinition>(FieldDefinition.class, this, CSVPackage.AGGREGATION_FIELD__AGGREGATED_FIELDS);
		}
		return aggregatedFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSVPackage.AGGREGATION_FIELD__AGG_TYPE:
				return getAggType();
			case CSVPackage.AGGREGATION_FIELD__AGGREGATED_FIELDS:
				return getAggregatedFields();
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
			case CSVPackage.AGGREGATION_FIELD__AGG_TYPE:
				setAggType((AggregationType)newValue);
				return;
			case CSVPackage.AGGREGATION_FIELD__AGGREGATED_FIELDS:
				getAggregatedFields().clear();
				getAggregatedFields().addAll((Collection<? extends FieldDefinition>)newValue);
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
			case CSVPackage.AGGREGATION_FIELD__AGG_TYPE:
				setAggType(AGG_TYPE_EDEFAULT);
				return;
			case CSVPackage.AGGREGATION_FIELD__AGGREGATED_FIELDS:
				getAggregatedFields().clear();
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
			case CSVPackage.AGGREGATION_FIELD__AGG_TYPE:
				return aggType != AGG_TYPE_EDEFAULT;
			case CSVPackage.AGGREGATION_FIELD__AGGREGATED_FIELDS:
				return aggregatedFields != null && !aggregatedFields.isEmpty();
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
		result.append(" (aggType: ");
		result.append(aggType);
		result.append(')');
		return result.toString();
	}

} //AggregationFieldImpl
