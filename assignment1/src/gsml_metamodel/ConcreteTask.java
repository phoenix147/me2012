/**
 */
package gsml_metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gsml_metamodel.ConcreteTask#getMaxPoints <em>Max Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see gsml_metamodel.Gsml_metamodelPackage#getConcreteTask()
 * @model
 * @generated
 */
public interface ConcreteTask extends Task {
	/**
	 * Returns the value of the '<em><b>Max Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Points</em>' attribute.
	 * @see #setMaxPoints(int)
	 * @see gsml_metamodel.Gsml_metamodelPackage#getConcreteTask_MaxPoints()
	 * @model
	 * @generated
	 */
	int getMaxPoints();

	/**
	 * Sets the value of the '{@link gsml_metamodel.ConcreteTask#getMaxPoints <em>Max Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Points</em>' attribute.
	 * @see #getMaxPoints()
	 * @generated
	 */
	void setMaxPoints(int value);

} // ConcreteTask
