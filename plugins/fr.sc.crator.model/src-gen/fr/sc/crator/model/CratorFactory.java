/**
 */
package fr.sc.crator.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.sc.crator.model.CratorPackage
 * @generated
 */
public interface CratorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CratorFactory eINSTANCE = fr.sc.crator.model.impl.CratorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CR Ator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CR Ator</em>'.
	 * @generated
	 */
	CRAtor createCRAtor();

	/**
	 * Returns a new object of class '<em>CRA Week</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CRA Week</em>'.
	 * @generated
	 */
	CRAWeek createCRAWeek();

	/**
	 * Returns a new object of class '<em>CRA Day</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CRA Day</em>'.
	 * @generated
	 */
	CRADay createCRADay();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Work</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work</em>'.
	 * @generated
	 */
	Work createWork();

	/**
	 * Returns a new object of class '<em>Spread CRA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spread CRA</em>'.
	 * @generated
	 */
	SpreadCRA createSpreadCRA();

	/**
	 * Returns a new object of class '<em>Void CRA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Void CRA</em>'.
	 * @generated
	 */
	VoidCRA createVoidCRA();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CratorPackage getCratorPackage();

} //CratorFactory
