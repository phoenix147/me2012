/**
 */
package at.ac.tuwien.big.me12.csv.csvmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregation Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.me12.csv.csvmm.AggregationField#getAggType <em>Agg Type</em>}</li>
 *   <li>{@link at.ac.tuwien.big.me12.csv.csvmm.AggregationField#getAggregatedFields <em>Aggregated Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.me12.csv.csvmm.CSVPackage#getAggregationField()
 * @model
 * @generated
 */
public interface AggregationField extends DerivedField {
	/**
	 * Returns the value of the '<em><b>Agg Type</b></em>' attribute.
	 * The literals are from the enumeration {@link at.ac.tuwien.big.me12.csv.csvmm.AggregationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agg Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agg Type</em>' attribute.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.AggregationType
	 * @see #setAggType(AggregationType)
	 * @see at.ac.tuwien.big.me12.csv.csvmm.CSVPackage#getAggregationField_AggType()
	 * @model
	 * @generated
	 */
	AggregationType getAggType();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.me12.csv.csvmm.AggregationField#getAggType <em>Agg Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agg Type</em>' attribute.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.AggregationType
	 * @see #getAggType()
	 * @generated
	 */
	void setAggType(AggregationType value);

	/**
	 * Returns the value of the '<em><b>Aggregated Fields</b></em>' reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.me12.csv.csvmm.FieldDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregated Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregated Fields</em>' reference list.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.CSVPackage#getAggregationField_AggregatedFields()
	 * @model required="true"
	 * @generated
	 */
	EList<FieldDefinition> getAggregatedFields();

} // AggregationField
