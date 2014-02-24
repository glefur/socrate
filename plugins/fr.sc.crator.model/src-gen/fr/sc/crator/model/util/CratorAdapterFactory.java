/**
 */
package fr.sc.crator.model.util;

import fr.sc.crator.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.sc.crator.model.CratorPackage
 * @generated
 */
public class CratorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CratorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CratorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CratorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CratorSwitch<Adapter> modelSwitch =
		new CratorSwitch<Adapter>() {
			@Override
			public Adapter caseCRAtor(CRAtor object) {
				return createCRAtorAdapter();
			}
			@Override
			public Adapter caseCRA(CRA object) {
				return createCRAAdapter();
			}
			@Override
			public Adapter caseCRAWeek(CRAWeek object) {
				return createCRAWeekAdapter();
			}
			@Override
			public Adapter caseCRADay(CRADay object) {
				return createCRADayAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseWork(Work object) {
				return createWorkAdapter();
			}
			@Override
			public Adapter caseSpreadCRA(SpreadCRA object) {
				return createSpreadCRAAdapter();
			}
			@Override
			public Adapter caseVoidCRA(VoidCRA object) {
				return createVoidCRAAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.sc.crator.model.CRAtor <em>CR Ator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.sc.crator.model.CRAtor
	 * @generated
	 */
	public Adapter createCRAtorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.sc.crator.model.CRA <em>CRA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.sc.crator.model.CRA
	 * @generated
	 */
	public Adapter createCRAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.sc.crator.model.CRAWeek <em>CRA Week</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.sc.crator.model.CRAWeek
	 * @generated
	 */
	public Adapter createCRAWeekAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.sc.crator.model.CRADay <em>CRA Day</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.sc.crator.model.CRADay
	 * @generated
	 */
	public Adapter createCRADayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.sc.crator.model.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.sc.crator.model.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.sc.crator.model.Work <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.sc.crator.model.Work
	 * @generated
	 */
	public Adapter createWorkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.sc.crator.model.SpreadCRA <em>Spread CRA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.sc.crator.model.SpreadCRA
	 * @generated
	 */
	public Adapter createSpreadCRAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.sc.crator.model.VoidCRA <em>Void CRA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.sc.crator.model.VoidCRA
	 * @generated
	 */
	public Adapter createVoidCRAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CratorAdapterFactory
