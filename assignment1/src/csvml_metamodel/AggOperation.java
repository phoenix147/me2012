/**
 */
package csvml_metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Agg Operation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see csvml_metamodel.Csvml_metamodelPackage#getAggOperation()
 * @model
 * @generated
 */
public enum AggOperation implements Enumerator {
	/**
	 * The '<em><b>Sum</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUM_VALUE
	 * @generated
	 * @ordered
	 */
	SUM(1, "sum", "sum"),

	/**
	 * The '<em><b>Average</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_VALUE
	 * @generated
	 * @ordered
	 */
	AVERAGE(4, "average", "average"),

	/**
	 * The '<em><b>Minimum</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINIMUM_VALUE
	 * @generated
	 * @ordered
	 */
	MINIMUM(2, "minimum", "minimum"),

	/**
	 * The '<em><b>Maximum</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXIMUM_VALUE
	 * @generated
	 * @ordered
	 */
	MAXIMUM(3, "maximum", "maximum");

	/**
	 * The '<em><b>Sum</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sum</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUM
	 * @model name="sum"
	 * @generated
	 * @ordered
	 */
	public static final int SUM_VALUE = 1;

	/**
	 * The '<em><b>Average</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Average</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVERAGE
	 * @model name="average"
	 * @generated
	 * @ordered
	 */
	public static final int AVERAGE_VALUE = 4;

	/**
	 * The '<em><b>Minimum</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Minimum</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINIMUM
	 * @model name="minimum"
	 * @generated
	 * @ordered
	 */
	public static final int MINIMUM_VALUE = 2;

	/**
	 * The '<em><b>Maximum</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Maximum</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAXIMUM
	 * @model name="maximum"
	 * @generated
	 * @ordered
	 */
	public static final int MAXIMUM_VALUE = 3;

	/**
	 * An array of all the '<em><b>Agg Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AggOperation[] VALUES_ARRAY =
		new AggOperation[] {
			SUM,
			AVERAGE,
			MINIMUM,
			MAXIMUM,
		};

	/**
	 * A public read-only list of all the '<em><b>Agg Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AggOperation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Agg Operation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AggOperation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AggOperation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Agg Operation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AggOperation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AggOperation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Agg Operation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AggOperation get(int value) {
		switch (value) {
			case SUM_VALUE: return SUM;
			case AVERAGE_VALUE: return AVERAGE;
			case MINIMUM_VALUE: return MINIMUM;
			case MAXIMUM_VALUE: return MAXIMUM;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AggOperation(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AggOperation
