/**
 */
package gsml_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gsml_metamodel.Task#getName <em>Name</em>}</li>
 *   <li>{@link gsml_metamodel.Task#getMinRequierment <em>Min Requierment</em>}</li>
 *   <li>{@link gsml_metamodel.Task#isRequiermentIsAbsolute <em>Requierment Is Absolute</em>}</li>
 * </ul>
 * </p>
 *
 * @see gsml_metamodel.Gsml_metamodelPackage#getTask()
 * @model abstract="true"
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gsml_metamodel.Gsml_metamodelPackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gsml_metamodel.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Min Requierment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Requierment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Requierment</em>' attribute.
	 * @see #setMinRequierment(float)
	 * @see gsml_metamodel.Gsml_metamodelPackage#getTask_MinRequierment()
	 * @model
	 * @generated
	 */
	float getMinRequierment();

	/**
	 * Sets the value of the '{@link gsml_metamodel.Task#getMinRequierment <em>Min Requierment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Requierment</em>' attribute.
	 * @see #getMinRequierment()
	 * @generated
	 */
	void setMinRequierment(float value);

	/**
	 * Returns the value of the '<em><b>Requierment Is Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requierment Is Absolute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requierment Is Absolute</em>' attribute.
	 * @see #setRequiermentIsAbsolute(boolean)
	 * @see gsml_metamodel.Gsml_metamodelPackage#getTask_RequiermentIsAbsolute()
	 * @model
	 * @generated
	 */
	boolean isRequiermentIsAbsolute();

	/**
	 * Sets the value of the '{@link gsml_metamodel.Task#isRequiermentIsAbsolute <em>Requierment Is Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requierment Is Absolute</em>' attribute.
	 * @see #isRequiermentIsAbsolute()
	 * @generated
	 */
	void setRequiermentIsAbsolute(boolean value);

} // Task
