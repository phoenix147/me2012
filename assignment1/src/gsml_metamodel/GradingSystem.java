/**
 */
package gsml_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grading System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gsml_metamodel.GradingSystem#getComprises <em>Comprises</em>}</li>
 * </ul>
 * </p>
 *
 * @see gsml_metamodel.Gsml_metamodelPackage#getGradingSystem()
 * @model
 * @generated
 */
public interface GradingSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Comprises</b></em>' containment reference list.
	 * The list contents are of type {@link gsml_metamodel.Course}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comprises</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comprises</em>' containment reference list.
	 * @see gsml_metamodel.Gsml_metamodelPackage#getGradingSystem_Comprises()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getComprises();

} // GradingSystem
