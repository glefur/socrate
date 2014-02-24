/**
 */
package fr.sc.crator.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.sc.crator.model.CRA;
import fr.sc.crator.model.CRAtor;
import fr.sc.crator.model.CratorPackage;
import fr.sc.crator.model.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CR Ator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.sc.crator.model.impl.CRAtorImpl#getCras <em>Cras</em>}</li>
 *   <li>{@link fr.sc.crator.model.impl.CRAtorImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CRAtorImpl extends EObjectImpl implements CRAtor {
	/**
	 * The cached value of the '{@link #getCras() <em>Cras</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCras()
	 * @generated
	 * @ordered
	 */
	protected EList<CRA> cras;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CRAtorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CratorPackage.Literals.CR_ATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CRA> getCras() {
		if (cras == null) {
			cras = new EObjectContainmentWithInverseEList<CRA>(CRA.class, this, CratorPackage.CR_ATOR__CRAS, CratorPackage.CRA__CRATOR);
		}
		return cras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, CratorPackage.CR_ATOR__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Task getTask(String code) {
		for (Task task : getTasks()) {
			if (code.equals(task.getCode())) {
				return task;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CratorPackage.CR_ATOR__CRAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCras()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CratorPackage.CR_ATOR__CRAS:
				return ((InternalEList<?>)getCras()).basicRemove(otherEnd, msgs);
			case CratorPackage.CR_ATOR__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CratorPackage.CR_ATOR__CRAS:
				return getCras();
			case CratorPackage.CR_ATOR__TASKS:
				return getTasks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CratorPackage.CR_ATOR__CRAS:
				getCras().clear();
				getCras().addAll((Collection<? extends CRA>)newValue);
				return;
			case CratorPackage.CR_ATOR__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CratorPackage.CR_ATOR__CRAS:
				getCras().clear();
				return;
			case CratorPackage.CR_ATOR__TASKS:
				getTasks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CratorPackage.CR_ATOR__CRAS:
				return cras != null && !cras.isEmpty();
			case CratorPackage.CR_ATOR__TASKS:
				return tasks != null && !tasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CRAtorImpl
