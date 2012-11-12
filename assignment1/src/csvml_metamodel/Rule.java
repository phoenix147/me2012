/**
 */
package csvml_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csvml_metamodel.Rule#getResultValue <em>Result Value</em>}</li>
 *   <li>{@link csvml_metamodel.Rule#getRIndex <em>RIndex</em>}</li>
 * </ul>
 * </p>
 *
 * @see csvml_metamodel.Csvml_metamodelPackage#getRule()
 * @model abstract="true"
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Result Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Value</em>' attribute.
	 * @see #setResultValue(String)
	 * @see csvml_metamodel.Csvml_metamodelPackage#getRule_ResultValue()
	 * @model
	 * @generated
	 */
	String getResultValue();

	/**
	 * Sets the value of the '{@link csvml_metamodel.Rule#getResultValue <em>Result Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Value</em>' attribute.
	 * @see #getResultValue()
	 * @generated
	 */
	void setResultValue(String value);

	/**
	 * Returns the value of the '<em><b>RIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RIndex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RIndex</em>' attribute.
	 * @see #setRIndex(int)
	 * @see csvml_metamodel.Csvml_metamodelPackage#getRule_RIndex()
	 * @model
	 * @generated
	 */
	int getRIndex();

	/**
	 * Sets the value of the '{@link csvml_metamodel.Rule#getRIndex <em>RIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RIndex</em>' attribute.
	 * @see #getRIndex()
	 * @generated
	 */
	void setRIndex(int value);

} // Rule
