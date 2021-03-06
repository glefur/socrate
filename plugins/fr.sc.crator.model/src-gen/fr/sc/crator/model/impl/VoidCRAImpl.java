/**
 */
package fr.sc.crator.model.impl;

import fr.sc.crator.model.CRAWeek;
import fr.sc.crator.model.CRAtor;
import fr.sc.crator.model.CratorPackage;
import fr.sc.crator.model.VoidCRA;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Void CRA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.sc.crator.model.impl.VoidCRAImpl#getWeekNumber <em>Week Number</em>}</li>
 *   <li>{@link fr.sc.crator.model.impl.VoidCRAImpl#getWeek <em>Week</em>}</li>
 *   <li>{@link fr.sc.crator.model.impl.VoidCRAImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.sc.crator.model.impl.VoidCRAImpl#getCrator <em>Crator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VoidCRAImpl extends EObjectImpl implements VoidCRA {
	/**
	 * The default value of the '{@link #getWeekNumber() <em>Week Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int WEEK_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWeekNumber() <em>Week Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekNumber()
	 * @generated
	 * @ordered
	 */
	protected int weekNumber = WEEK_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWeek() <em>Week</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeek()
	 * @generated
	 * @ordered
	 */
	protected CRAWeek week;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoidCRAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CratorPackage.Literals.VOID_CRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWeekNumber() {
		return weekNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeekNumber(int newWeekNumber) {
		int oldWeekNumber = weekNumber;
		weekNumber = newWeekNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CratorPackage.VOID_CRA__WEEK_NUMBER, oldWeekNumber, weekNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRAWeek getWeek() {
		return week;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeek(CRAWeek newWeek, NotificationChain msgs) {
		CRAWeek oldWeek = week;
		week = newWeek;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CratorPackage.VOID_CRA__WEEK, oldWeek, newWeek);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeek(CRAWeek newWeek) {
		if (newWeek != week) {
			NotificationChain msgs = null;
			if (week != null)
				msgs = ((InternalEObject)week).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CratorPackage.VOID_CRA__WEEK, null, msgs);
			if (newWeek != null)
				msgs = ((InternalEObject)newWeek).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CratorPackage.VOID_CRA__WEEK, null, msgs);
			msgs = basicSetWeek(newWeek, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CratorPackage.VOID_CRA__WEEK, newWeek, newWeek));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CratorPackage.VOID_CRA__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRAtor getCrator() {
		if (eContainerFeatureID() != CratorPackage.VOID_CRA__CRATOR) return null;
		return (CRAtor)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrator(CRAtor newCrator, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCrator, CratorPackage.VOID_CRA__CRATOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrator(CRAtor newCrator) {
		if (newCrator != eInternalContainer() || (eContainerFeatureID() != CratorPackage.VOID_CRA__CRATOR && newCrator != null)) {
			if (EcoreUtil.isAncestor(this, newCrator))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCrator != null)
				msgs = ((InternalEObject)newCrator).eInverseAdd(this, CratorPackage.CR_ATOR__CRAS, CRAtor.class, msgs);
			msgs = basicSetCrator(newCrator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CratorPackage.VOID_CRA__CRATOR, newCrator, newCrator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean craFilled() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CratorPackage.VOID_CRA__CRATOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCrator((CRAtor)otherEnd, msgs);
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
			case CratorPackage.VOID_CRA__WEEK:
				return basicSetWeek(null, msgs);
			case CratorPackage.VOID_CRA__CRATOR:
				return basicSetCrator(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CratorPackage.VOID_CRA__CRATOR:
				return eInternalContainer().eInverseRemove(this, CratorPackage.CR_ATOR__CRAS, CRAtor.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CratorPackage.VOID_CRA__WEEK_NUMBER:
				return getWeekNumber();
			case CratorPackage.VOID_CRA__WEEK:
				return getWeek();
			case CratorPackage.VOID_CRA__SOURCE:
				return getSource();
			case CratorPackage.VOID_CRA__CRATOR:
				return getCrator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CratorPackage.VOID_CRA__WEEK_NUMBER:
				setWeekNumber((Integer)newValue);
				return;
			case CratorPackage.VOID_CRA__WEEK:
				setWeek((CRAWeek)newValue);
				return;
			case CratorPackage.VOID_CRA__SOURCE:
				setSource((String)newValue);
				return;
			case CratorPackage.VOID_CRA__CRATOR:
				setCrator((CRAtor)newValue);
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
			case CratorPackage.VOID_CRA__WEEK_NUMBER:
				setWeekNumber(WEEK_NUMBER_EDEFAULT);
				return;
			case CratorPackage.VOID_CRA__WEEK:
				setWeek((CRAWeek)null);
				return;
			case CratorPackage.VOID_CRA__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case CratorPackage.VOID_CRA__CRATOR:
				setCrator((CRAtor)null);
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
			case CratorPackage.VOID_CRA__WEEK_NUMBER:
				return weekNumber != WEEK_NUMBER_EDEFAULT;
			case CratorPackage.VOID_CRA__WEEK:
				return week != null;
			case CratorPackage.VOID_CRA__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case CratorPackage.VOID_CRA__CRATOR:
				return getCrator() != null;
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
		result.append(" (weekNumber: ");
		result.append(weekNumber);
		result.append(", source: ");
		result.append(source);
		result.append(')');
		return result.toString();
	}

} //VoidCRAImpl
