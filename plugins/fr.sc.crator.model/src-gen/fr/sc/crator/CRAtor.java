/**
 */
package fr.sc.crator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CR Ator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.sc.crator.CRAtor#getWeeks <em>Weeks</em>}</li>
 *   <li>{@link fr.sc.crator.CRAtor#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.sc.crator.CratorPackage#getCRAtor()
 * @model
 * @generated
 */
public interface CRAtor extends EObject {
	/**
	 * Returns the value of the '<em><b>Weeks</b></em>' containment reference list.
	 * The list contents are of type {@link fr.sc.crator.CRAWeek}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weeks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weeks</em>' containment reference list.
	 * @see fr.sc.crator.CratorPackage#getCRAtor_Weeks()
	 * @model containment="true"
	 * @generated
	 */
	EList<CRAWeek> getWeeks();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link fr.sc.crator.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see fr.sc.crator.CratorPackage#getCRAtor_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

} // CRAtor
