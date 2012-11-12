/**
 */
package csvml_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregation Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csvml_metamodel.AggregationField#getOperation <em>Operation</em>}</li>
 *   <li>{@link csvml_metamodel.AggregationField#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see csvml_metamodel.Csvml_metamodelPackage#getAggregationField()
 * @model
 * @generated
 */
public interface AggregationField extends DerivedField {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link csvml_metamodel.AggOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see csvml_metamodel.AggOperation
	 * @see #setOperation(AggOperation)
	 * @see csvml_metamodel.Csvml_metamodelPackage#getAggregationField_Operation()
	 * @model
	 * @generated
	 */
	AggOperation getOperation();

	/**
	 * Sets the value of the '{@link csvml_metamodel.AggregationField#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see csvml_metamodel.AggOperation
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(AggOperation value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link csvml_metamodel.FieldDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see csvml_metamodel.Csvml_metamodelPackage#getAggregationField_Fields()
	 * @model required="true"
	 * @generated
	 */
	EList<FieldDefinition> getFields();

} // AggregationField
