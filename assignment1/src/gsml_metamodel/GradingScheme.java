/**
 */
package gsml_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grading Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gsml_metamodel.GradingScheme#getConsistsOf <em>Consists Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see gsml_metamodel.Gsml_metamodelPackage#getGradingScheme()
 * @model
 * @generated
 */
public interface GradingScheme extends EObject {
	/**
	 * Returns the value of the '<em><b>Consists Of</b></em>' containment reference list.
	 * The list contents are of type {@link gsml_metamodel.Grade}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consists Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consists Of</em>' containment reference list.
	 * @see gsml_metamodel.Gsml_metamodelPackage#getGradingScheme_ConsistsOf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Grade> getConsistsOf();

} // GradingScheme
