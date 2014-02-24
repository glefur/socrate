/**
 */
package fr.sc.crator.model;

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
 *   <li>{@link fr.sc.crator.model.CRAtor#getCras <em>Cras</em>}</li>
 *   <li>{@link fr.sc.crator.model.CRAtor#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.sc.crator.model.CratorPackage#getCRAtor()
 * @model
 * @generated
 */
public interface CRAtor extends EObject {
	/**
	 * Returns the value of the '<em><b>Cras</b></em>' containment reference list.
	 * The list contents are of type {@link fr.sc.crator.model.CRA}.
	 * It is bidirectional and its opposite is '{@link fr.sc.crator.model.CRA#getCrator <em>Crator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cras</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cras</em>' containment reference list.
	 * @see fr.sc.crator.model.CratorPackage#getCRAtor_Cras()
	 * @see fr.sc.crator.model.CRA#getCrator
	 * @model opposite="crator" containment="true"
	 * @generated
	 */
	EList<CRA> getCras();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link fr.sc.crator.model.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see fr.sc.crator.model.CratorPackage#getCRAtor_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model codeRequired="true"
	 * @generated
	 */
	Task getTask(String code);

} // CRAtor
