/**
 */
package fr.sc.crator.model.impl;

import fr.sc.crator.model.CRADay;
import fr.sc.crator.model.CRAWeek;
import fr.sc.crator.model.CratorFactory;
import fr.sc.crator.model.CratorPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CRA Week</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.sc.crator.model.impl.CRAWeekImpl#getWorkedLoad <em>Worked Load</em>}</li>
 *   <li>{@link fr.sc.crator.model.impl.CRAWeekImpl#getDays <em>Days</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CRAWeekImpl extends EObjectImpl implements CRAWeek {
	/**
	 * The default value of the '{@link #getWorkedLoad() <em>Worked Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkedLoad()
	 * @generated
	 * @ordered
	 */
	protected static final double WORKED_LOAD_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getWorkedLoad() <em>Worked Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkedLoad()
	 * @generated
	 * @ordered
	 */
	protected double workedLoad = WORKED_LOAD_EDEFAULT;
	/**
	 * The cached value of the '{@link #getDays() <em>Days</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDays()
	 * @generated
	 * @ordered
	 */
	protected EList<CRADay> days;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CRAWeekImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CratorPackage.Literals.CRA_WEEK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWorkedLoad() {
		return workedLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkedLoad(double newWorkedLoad) {
		double oldWorkedLoad = workedLoad;
		workedLoad = newWorkedLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CratorPackage.CRA_WEEK__WORKED_LOAD, oldWorkedLoad, workedLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CRADay> getDays() {
		if (days == null) {
			days = new EObjectContainmentEList<CRADay>(CRADay.class, this, CratorPackage.CRA_WEEK__DAYS);
		}
		return days;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CRADay getDay(int day) {
		for (CRADay craDay : getDays()) {
			if (craDay.getDay() == day) {
				return craDay;
			}
		}
		CRADay result = CratorFactory.eINSTANCE.createCRADay();
		result.setDay(day);
		getDays().add(result);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double totalLoad() {
		double result = 0;
		for (CRADay craDay : getDays()) {
			result += craDay.totalLoad();
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CratorPackage.CRA_WEEK__DAYS:
				return ((InternalEList<?>)getDays()).basicRemove(otherEnd, msgs);
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
			case CratorPackage.CRA_WEEK__WORKED_LOAD:
				return getWorkedLoad();
			case CratorPackage.CRA_WEEK__DAYS:
				return getDays();
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
			case CratorPackage.CRA_WEEK__WORKED_LOAD:
				setWorkedLoad((Double)newValue);
				return;
			case CratorPackage.CRA_WEEK__DAYS:
				getDays().clear();
				getDays().addAll((Collection<? extends CRADay>)newValue);
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
			case CratorPackage.CRA_WEEK__WORKED_LOAD:
				setWorkedLoad(WORKED_LOAD_EDEFAULT);
				return;
			case CratorPackage.CRA_WEEK__DAYS:
				getDays().clear();
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
			case CratorPackage.CRA_WEEK__WORKED_LOAD:
				return workedLoad != WORKED_LOAD_EDEFAULT;
			case CratorPackage.CRA_WEEK__DAYS:
				return days != null && !days.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (workedLoad: ");
		result.append(workedLoad);
		result.append(')');
		return result.toString();
	}

} //CRAWeekImpl
