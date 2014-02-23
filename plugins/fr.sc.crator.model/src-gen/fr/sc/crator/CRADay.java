/**
 */
package fr.sc.crator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CRA Day</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.sc.crator.CRADay#getDay <em>Day</em>}</li>
 *   <li>{@link fr.sc.crator.CRADay#getWorks <em>Works</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.sc.crator.CratorPackage#getCRADay()
 * @model
 * @generated
 */
public interface CRADay extends EObject {
	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #setDay(int)
	 * @see fr.sc.crator.CratorPackage#getCRADay_Day()
	 * @model required="true"
	 * @generated
	 */
	int getDay();

	/**
	 * Sets the value of the '{@link fr.sc.crator.CRADay#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(int value);

	/**
	 * Returns the value of the '<em><b>Works</b></em>' containment reference list.
	 * The list contents are of type {@link fr.sc.crator.Work}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Works</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Works</em>' containment reference list.
	 * @see fr.sc.crator.CratorPackage#getCRADay_Works()
	 * @model containment="true"
	 * @generated
	 */
	EList<Work> getWorks();

} // CRADay
