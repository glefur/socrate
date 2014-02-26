/**
 */
package fr.sc.crator.model;

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
 *   <li>{@link fr.sc.crator.model.CRAWeek#getWorkedLoad <em>Worked Load</em>}</li>
 *   <li>{@link fr.sc.crator.model.CRAWeek#getDays <em>Days</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.sc.crator.model.CratorPackage#getCRAWeek()
 * @model
 * @generated
 */
public interface CRAWeek extends EObject {
	/**
	 * Returns the value of the '<em><b>Worked Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worked Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worked Load</em>' attribute.
	 * @see #setWorkedLoad(double)
	 * @see fr.sc.crator.model.CratorPackage#getCRAWeek_WorkedLoad()
	 * @model required="true"
	 * @generated
	 */
	double getWorkedLoad();

	/**
	 * Sets the value of the '{@link fr.sc.crator.model.CRAWeek#getWorkedLoad <em>Worked Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worked Load</em>' attribute.
	 * @see #getWorkedLoad()
	 * @generated
	 */
	void setWorkedLoad(double value);

	/**
	 * Returns the value of the '<em><b>Days</b></em>' containment reference list.
	 * The list contents are of type {@link fr.sc.crator.model.CRADay}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Days</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Days</em>' containment reference list.
	 * @see fr.sc.crator.model.CratorPackage#getCRAWeek_Days()
	 * @model containment="true" lower="5" upper="5"
	 * @generated
	 */
	EList<CRADay> getDays();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" dayRequired="true"
	 * @generated
	 */
	CRADay getDay(int day);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	double totalLoad();

} // CRAWeek
