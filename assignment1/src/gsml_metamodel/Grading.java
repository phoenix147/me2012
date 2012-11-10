/**
 */
package gsml_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gsml_metamodel.Grading#getSemester <em>Semester</em>}</li>
 *   <li>{@link gsml_metamodel.Grading#getConsistsOf <em>Consists Of</em>}</li>
 *   <li>{@link gsml_metamodel.Grading#getSpecifiedBy <em>Specified By</em>}</li>
 * </ul>
 * </p>
 *
 * @see gsml_metamodel.Gsml_metamodelPackage#getGrading()
 * @model
 * @generated
 */
public interface Grading extends EObject {
	/**
	 * Returns the value of the '<em><b>Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semester</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' attribute.
	 * @see #setSemester(String)
	 * @see gsml_metamodel.Gsml_metamodelPackage#getGrading_Semester()
	 * @model
	 * @generated
	 */
	String getSemester();

	/**
	 * Sets the value of the '{@link gsml_metamodel.Grading#getSemester <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' attribute.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(String value);

	/**
	 * Returns the value of the '<em><b>Consists Of</b></em>' containment reference list.
	 * The list contents are of type {@link gsml_metamodel.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consists Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consists Of</em>' containment reference list.
	 * @see gsml_metamodel.Gsml_metamodelPackage#getGrading_ConsistsOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getConsistsOf();

	/**
	 * Returns the value of the '<em><b>Specified By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specified By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specified By</em>' containment reference.
	 * @see #setSpecifiedBy(GradingScheme)
	 * @see gsml_metamodel.Gsml_metamodelPackage#getGrading_SpecifiedBy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GradingScheme getSpecifiedBy();

	/**
	 * Sets the value of the '{@link gsml_metamodel.Grading#getSpecifiedBy <em>Specified By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specified By</em>' containment reference.
	 * @see #getSpecifiedBy()
	 * @generated
	 */
	void setSpecifiedBy(GradingScheme value);

} // Grading
