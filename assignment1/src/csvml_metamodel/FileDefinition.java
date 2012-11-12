/**
 */
package csvml_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csvml_metamodel.FileDefinition#getName <em>Name</em>}</li>
 *   <li>{@link csvml_metamodel.FileDefinition#getConsistsOf <em>Consists Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see csvml_metamodel.Csvml_metamodelPackage#getFileDefinition()
 * @model
 * @generated
 */
public interface FileDefinition extends EObject {
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
	 * @see csvml_metamodel.Csvml_metamodelPackage#getFileDefinition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link csvml_metamodel.FileDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Consists Of</b></em>' containment reference list.
	 * The list contents are of type {@link csvml_metamodel.FieldDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consists Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consists Of</em>' containment reference list.
	 * @see csvml_metamodel.Csvml_metamodelPackage#getFileDefinition_ConsistsOf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FieldDefinition> getConsistsOf();

} // FileDefinition
