/**
 */
package csvml_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Definition Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csvml_metamodel.FileDefinitionSet#getComprises <em>Comprises</em>}</li>
 * </ul>
 * </p>
 *
 * @see csvml_metamodel.Csvml_metamodelPackage#getFileDefinitionSet()
 * @model
 * @generated
 */
public interface FileDefinitionSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Comprises</b></em>' containment reference list.
	 * The list contents are of type {@link csvml_metamodel.FileDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comprises</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comprises</em>' containment reference list.
	 * @see csvml_metamodel.Csvml_metamodelPackage#getFileDefinitionSet_Comprises()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FileDefinition> getComprises();

} // FileDefinitionSet
