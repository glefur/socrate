/**
 */
package fr.sc.crator.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CRA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.sc.crator.model.CRA#getWeekNumber <em>Week Number</em>}</li>
 *   <li>{@link fr.sc.crator.model.CRA#getWeek <em>Week</em>}</li>
 *   <li>{@link fr.sc.crator.model.CRA#getSource <em>Source</em>}</li>
 *   <li>{@link fr.sc.crator.model.CRA#getCrator <em>Crator</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.sc.crator.model.CratorPackage#getCRA()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CRA extends EObject {
	/**
	 * Returns the value of the '<em><b>Week Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Week Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Week Number</em>' attribute.
	 * @see #setWeekNumber(int)
	 * @see fr.sc.crator.model.CratorPackage#getCRA_WeekNumber()
	 * @model required="true"
	 * @generated
	 */
	int getWeekNumber();

	/**
	 * Sets the value of the '{@link fr.sc.crator.model.CRA#getWeekNumber <em>Week Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Week Number</em>' attribute.
	 * @see #getWeekNumber()
	 * @generated
	 */
	void setWeekNumber(int value);

	/**
	 * Returns the value of the '<em><b>Week</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Week</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Week</em>' containment reference.
	 * @see #setWeek(CRAWeek)
	 * @see fr.sc.crator.model.CratorPackage#getCRA_Week()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CRAWeek getWeek();

	/**
	 * Sets the value of the '{@link fr.sc.crator.model.CRA#getWeek <em>Week</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Week</em>' containment reference.
	 * @see #getWeek()
	 * @generated
	 */
	void setWeek(CRAWeek value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see fr.sc.crator.model.CratorPackage#getCRA_Source()
	 * @model required="true"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link fr.sc.crator.model.CRA#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Crator</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.sc.crator.model.CRAtor#getCras <em>Cras</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crator</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crator</em>' container reference.
	 * @see #setCrator(CRAtor)
	 * @see fr.sc.crator.model.CratorPackage#getCRA_Crator()
	 * @see fr.sc.crator.model.CRAtor#getCras
	 * @model opposite="cras" required="true" transient="false"
	 * @generated
	 */
	CRAtor getCrator();

	/**
	 * Sets the value of the '{@link fr.sc.crator.model.CRA#getCrator <em>Crator</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crator</em>' container reference.
	 * @see #getCrator()
	 * @generated
	 */
	void setCrator(CRAtor value);

} // CRA
