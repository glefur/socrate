/**
 */
package fr.sc.crator.model;

import org.apache.poi.ss.usermodel.Sheet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spread CRA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.sc.crator.model.SpreadCRA#getSheet <em>Sheet</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.sc.crator.model.CratorPackage#getSpreadCRA()
 * @model
 * @generated
 */
public interface SpreadCRA extends CRA {
	/**
	 * Returns the value of the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet</em>' attribute.
	 * @see #setSheet(Sheet)
	 * @see fr.sc.crator.model.CratorPackage#getSpreadCRA_Sheet()
	 * @model dataType="fr.sc.crator.model.SpreadSheet" required="true"
	 * @generated
	 */
	Sheet getSheet();

	/**
	 * Sets the value of the '{@link fr.sc.crator.model.SpreadCRA#getSheet <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet</em>' attribute.
	 * @see #getSheet()
	 * @generated
	 */
	void setSheet(Sheet value);

} // SpreadCRA
