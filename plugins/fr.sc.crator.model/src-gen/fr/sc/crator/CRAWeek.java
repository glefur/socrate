/**
 */
package fr.sc.crator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CRA Week</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.sc.crator.CRAWeek#getDays <em>Days</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.sc.crator.CratorPackage#getCRAWeek()
 * @model
 * @generated
 */
public interface CRAWeek extends EObject {
	/**
	 * Returns the value of the '<em><b>Days</b></em>' containment reference list.
	 * The list contents are of type {@link fr.sc.crator.CRADay}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Days</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Days</em>' containment reference list.
	 * @see fr.sc.crator.CratorPackage#getCRAWeek_Days()
	 * @model containment="true" lower="5" upper="5"
	 * @generated
	 */
	EList<CRADay> getDays();

} // CRAWeek
