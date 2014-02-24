/**
 */
package fr.sc.crator.model.impl;

import fr.sc.crator.model.*;

import org.apache.poi.ss.usermodel.Sheet;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CratorFactoryImpl extends EFactoryImpl implements CratorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CratorFactory init() {
		try {
			CratorFactory theCratorFactory = (CratorFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sc.fr/crator/1.0"); 
			if (theCratorFactory != null) {
				return theCratorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CratorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CratorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CratorPackage.CR_ATOR: return createCRAtor();
			case CratorPackage.CRA_WEEK: return createCRAWeek();
			case CratorPackage.CRA_DAY: return createCRADay();
			case CratorPackage.TASK: return createTask();
			case CratorPackage.WORK: return createWork();
			case CratorPackage.SPREAD_CRA: return createSpreadCRA();
			case CratorPackage.VOID_CRA: return createVoidCRA();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CratorPackage.SPREAD_SHEET:
				return createSpreadSheetFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CratorPackage.SPREAD_SHEET:
				return convertSpreadSheetToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRAtor createCRAtor() {
		CRAtorImpl crAtor = new CRAtorImpl();
		return crAtor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRAWeek createCRAWeek() {
		CRAWeekImpl craWeek = new CRAWeekImpl();
		return craWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRADay createCRADay() {
		CRADayImpl craDay = new CRADayImpl();
		return craDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Work createWork() {
		WorkImpl work = new WorkImpl();
		return work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadCRA createSpreadCRA() {
		SpreadCRAImpl spreadCRA = new SpreadCRAImpl();
		return spreadCRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoidCRA createVoidCRA() {
		VoidCRAImpl voidCRA = new VoidCRAImpl();
		return voidCRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sheet createSpreadSheetFromString(EDataType eDataType, String initialValue) {
		return (Sheet)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpreadSheetToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CratorPackage getCratorPackage() {
		return (CratorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CratorPackage getPackage() {
		return CratorPackage.eINSTANCE;
	}

} //CratorFactoryImpl
