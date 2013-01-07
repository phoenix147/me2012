/**
 */
package at.ac.tuwien.big.me12.csv.csvmm;

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
 *   <li>{@link at.ac.tuwien.big.me12.csv.csvmm.FileDefinitionSet#getFileDefinitions <em>File Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.me12.csv.csvmm.CSVPackage#getFileDefinitionSet()
 * @model
 * @generated
 */
public interface FileDefinitionSet extends EObject {
	/**
	 * Returns the value of the '<em><b>File Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.me12.csv.csvmm.FileDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Definitions</em>' containment reference list.
	 * @see at.ac.tuwien.big.me12.csv.csvmm.CSVPackage#getFileDefinitionSet_FileDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<FileDefinition> getFileDefinitions();

} // FileDefinitionSet
