/**
 */
package fr.sc.crator.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.sc.crator.model.CratorFactory
 * @model kind="package"
 * @generated
 */
public interface CratorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sc.fr/crator/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sc-crator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CratorPackage eINSTANCE = fr.sc.crator.model.impl.CratorPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.sc.crator.model.impl.CRAtorImpl <em>CR Ator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.sc.crator.model.impl.CRAtorImpl
	 * @see fr.sc.crator.model.impl.CratorPackageImpl#getCRAtor()
	 * @generated
	 */
	int CR_ATOR = 0;

	/**
	 * The feature id for the '<em><b>Cras</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CR_ATOR__CRAS = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CR_ATOR__TASKS = 1;

	/**
	 * The number of structural features of the '<em>CR Ator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CR_ATOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.sc.crator.model.CRA <em>CRA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.sc.crator.model.CRA
	 * @see fr.sc.crator.model.impl.CratorPackageImpl#getCRA()
	 * @generated
	 */
	int CRA = 1;

	/**
	 * The feature id for the '<em><b>Week Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA__WEEK_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Week</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA__WEEK = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Crator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA__CRATOR = 3;

	/**
	 * The number of structural features of the '<em>CRA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link fr.sc.crator.model.impl.CRAWeekImpl <em>CRA Week</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.sc.crator.model.impl.CRAWeekImpl
	 * @see fr.sc.crator.model.impl.CratorPackageImpl#getCRAWeek()
	 * @generated
	 */
	int CRA_WEEK = 2;

	/**
	 * The feature id for the '<em><b>Worked Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA_WEEK__WORKED_LOAD = 0;

	/**
	 * The feature id for the '<em><b>Days</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA_WEEK__DAYS = 1;

	/**
	 * The number of structural features of the '<em>CRA Week</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA_WEEK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.sc.crator.model.impl.CRADayImpl <em>CRA Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.sc.crator.model.impl.CRADayImpl
	 * @see fr.sc.crator.model.impl.CratorPackageImpl#getCRADay()
	 * @generated
	 */
	int CRA_DAY = 3;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA_DAY__DAY = 0;

	/**
	 * The feature id for the '<em><b>Works</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA_DAY__WORKS = 1;

	/**
	 * The number of structural features of the '<em>CRA Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA_DAY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.sc.crator.model.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.sc.crator.model.impl.TaskImpl
	 * @see fr.sc.crator.model.impl.CratorPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CODE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.sc.crator.model.impl.WorkImpl <em>Work</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.sc.crator.model.impl.WorkImpl
	 * @see fr.sc.crator.model.impl.CratorPackageImpl#getWork()
	 * @generated
	 */
	int WORK = 5;

	/**
	 * The feature id for the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__LOAD = 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__TASK = 1;

	/**
	 * The number of structural features of the '<em>Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link fr.sc.crator.model.impl.SpreadCRAImpl <em>Spread CRA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.sc.crator.model.impl.SpreadCRAImpl
	 * @see fr.sc.crator.model.impl.CratorPackageImpl#getSpreadCRA()
	 * @generated
	 */
	int SPREAD_CRA = 6;

	/**
	 * The feature id for the '<em><b>Week Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREAD_CRA__WEEK_NUMBER = CRA__WEEK_NUMBER;

	/**
	 * The feature id for the '<em><b>Week</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREAD_CRA__WEEK = CRA__WEEK;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREAD_CRA__SOURCE = CRA__SOURCE;

	/**
	 * The feature id for the '<em><b>Crator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREAD_CRA__CRATOR = CRA__CRATOR;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREAD_CRA__SHEET = CRA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Spread CRA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREAD_CRA_FEATURE_COUNT = CRA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.sc.crator.model.impl.VoidCRAImpl <em>Void CRA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.sc.crator.model.impl.VoidCRAImpl
	 * @see fr.sc.crator.model.impl.CratorPackageImpl#getVoidCRA()
	 * @generated
	 */
	int VOID_CRA = 7;

	/**
	 * The feature id for the '<em><b>Week Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_CRA__WEEK_NUMBER = CRA__WEEK_NUMBER;

	/**
	 * The feature id for the '<em><b>Week</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_CRA__WEEK = CRA__WEEK;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_CRA__SOURCE = CRA__SOURCE;

	/**
	 * The feature id for the '<em><b>Crator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_CRA__CRATOR = CRA__CRATOR;

	/**
	 * The number of structural features of the '<em>Void CRA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_CRA_FEATURE_COUNT = CRA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>Spread Sheet</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.poi.ss.usermodel.Sheet
	 * @see fr.sc.crator.model.impl.CratorPackageImpl#getSpreadSheet()
	 * @generated
	 */
	int SPREAD_SHEET = 8;


	/**
	 * Returns the meta object for class '{@link fr.sc.crator.model.CRAtor <em>CR Ator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CR Ator</em>'.
	 * @see fr.sc.crator.model.CRAtor
	 * @generated
	 */
	EClass getCRAtor();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.sc.crator.model.CRAtor#getCras <em>Cras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cras</em>'.
	 * @see fr.sc.crator.model.CRAtor#getCras()
	 * @see #getCRAtor()
	 * @generated
	 */
	EReference getCRAtor_Cras();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.sc.crator.model.CRAtor#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see fr.sc.crator.model.CRAtor#getTasks()
	 * @see #getCRAtor()
	 * @generated
	 */
	EReference getCRAtor_Tasks();

	/**
	 * Returns the meta object for class '{@link fr.sc.crator.model.CRA <em>CRA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CRA</em>'.
	 * @see fr.sc.crator.model.CRA
	 * @generated
	 */
	EClass getCRA();

	/**
	 * Returns the meta object for the attribute '{@link fr.sc.crator.model.CRA#getWeekNumber <em>Week Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Week Number</em>'.
	 * @see fr.sc.crator.model.CRA#getWeekNumber()
	 * @see #getCRA()
	 * @generated
	 */
	EAttribute getCRA_WeekNumber();

	/**
	 * Returns the meta object for the containment reference '{@link fr.sc.crator.model.CRA#getWeek <em>Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Week</em>'.
	 * @see fr.sc.crator.model.CRA#getWeek()
	 * @see #getCRA()
	 * @generated
	 */
	EReference getCRA_Week();

	/**
	 * Returns the meta object for the attribute '{@link fr.sc.crator.model.CRA#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see fr.sc.crator.model.CRA#getSource()
	 * @see #getCRA()
	 * @generated
	 */
	EAttribute getCRA_Source();

	/**
	 * Returns the meta object for the container reference '{@link fr.sc.crator.model.CRA#getCrator <em>Crator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Crator</em>'.
	 * @see fr.sc.crator.model.CRA#getCrator()
	 * @see #getCRA()
	 * @generated
	 */
	EReference getCRA_Crator();

	/**
	 * Returns the meta object for class '{@link fr.sc.crator.model.CRAWeek <em>CRA Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CRA Week</em>'.
	 * @see fr.sc.crator.model.CRAWeek
	 * @generated
	 */
	EClass getCRAWeek();

	/**
	 * Returns the meta object for the attribute '{@link fr.sc.crator.model.CRAWeek#getWorkedLoad <em>Worked Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worked Load</em>'.
	 * @see fr.sc.crator.model.CRAWeek#getWorkedLoad()
	 * @see #getCRAWeek()
	 * @generated
	 */
	EAttribute getCRAWeek_WorkedLoad();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.sc.crator.model.CRAWeek#getDays <em>Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Days</em>'.
	 * @see fr.sc.crator.model.CRAWeek#getDays()
	 * @see #getCRAWeek()
	 * @generated
	 */
	EReference getCRAWeek_Days();

	/**
	 * Returns the meta object for class '{@link fr.sc.crator.model.CRADay <em>CRA Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CRA Day</em>'.
	 * @see fr.sc.crator.model.CRADay
	 * @generated
	 */
	EClass getCRADay();

	/**
	 * Returns the meta object for the attribute '{@link fr.sc.crator.model.CRADay#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see fr.sc.crator.model.CRADay#getDay()
	 * @see #getCRADay()
	 * @generated
	 */
	EAttribute getCRADay_Day();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.sc.crator.model.CRADay#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Works</em>'.
	 * @see fr.sc.crator.model.CRADay#getWorks()
	 * @see #getCRADay()
	 * @generated
	 */
	EReference getCRADay_Works();

	/**
	 * Returns the meta object for class '{@link fr.sc.crator.model.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see fr.sc.crator.model.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link fr.sc.crator.model.Task#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see fr.sc.crator.model.Task#getCode()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Code();

	/**
	 * Returns the meta object for the attribute '{@link fr.sc.crator.model.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.sc.crator.model.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Description();

	/**
	 * Returns the meta object for class '{@link fr.sc.crator.model.Work <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work</em>'.
	 * @see fr.sc.crator.model.Work
	 * @generated
	 */
	EClass getWork();

	/**
	 * Returns the meta object for the attribute '{@link fr.sc.crator.model.Work#getLoad <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load</em>'.
	 * @see fr.sc.crator.model.Work#getLoad()
	 * @see #getWork()
	 * @generated
	 */
	EAttribute getWork_Load();

	/**
	 * Returns the meta object for the reference '{@link fr.sc.crator.model.Work#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see fr.sc.crator.model.Work#getTask()
	 * @see #getWork()
	 * @generated
	 */
	EReference getWork_Task();

	/**
	 * Returns the meta object for class '{@link fr.sc.crator.model.SpreadCRA <em>Spread CRA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spread CRA</em>'.
	 * @see fr.sc.crator.model.SpreadCRA
	 * @generated
	 */
	EClass getSpreadCRA();

	/**
	 * Returns the meta object for the attribute '{@link fr.sc.crator.model.SpreadCRA#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet</em>'.
	 * @see fr.sc.crator.model.SpreadCRA#getSheet()
	 * @see #getSpreadCRA()
	 * @generated
	 */
	EAttribute getSpreadCRA_Sheet();

	/**
	 * Returns the meta object for class '{@link fr.sc.crator.model.VoidCRA <em>Void CRA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void CRA</em>'.
	 * @see fr.sc.crator.model.VoidCRA
	 * @generated
	 */
	EClass getVoidCRA();

	/**
	 * Returns the meta object for data type '{@link org.apache.poi.ss.usermodel.Sheet <em>Spread Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Spread Sheet</em>'.
	 * @see org.apache.poi.ss.usermodel.Sheet
	 * @model instanceClass="org.apache.poi.ss.usermodel.Sheet"
	 * @generated
	 */
	EDataType getSpreadSheet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CratorFactory getCratorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.sc.crator.model.impl.CRAtorImpl <em>CR Ator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.sc.crator.model.impl.CRAtorImpl
		 * @see fr.sc.crator.model.impl.CratorPackageImpl#getCRAtor()
		 * @generated
		 */
		EClass CR_ATOR = eINSTANCE.getCRAtor();

		/**
		 * The meta object literal for the '<em><b>Cras</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CR_ATOR__CRAS = eINSTANCE.getCRAtor_Cras();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CR_ATOR__TASKS = eINSTANCE.getCRAtor_Tasks();

		/**
		 * The meta object literal for the '{@link fr.sc.crator.model.CRA <em>CRA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.sc.crator.model.CRA
		 * @see fr.sc.crator.model.impl.CratorPackageImpl#getCRA()
		 * @generated
		 */
		EClass CRA = eINSTANCE.getCRA();

		/**
		 * The meta object literal for the '<em><b>Week Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRA__WEEK_NUMBER = eINSTANCE.getCRA_WeekNumber();

		/**
		 * The meta object literal for the '<em><b>Week</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRA__WEEK = eINSTANCE.getCRA_Week();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRA__SOURCE = eINSTANCE.getCRA_Source();

		/**
		 * The meta object literal for the '<em><b>Crator</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRA__CRATOR = eINSTANCE.getCRA_Crator();

		/**
		 * The meta object literal for the '{@link fr.sc.crator.model.impl.CRAWeekImpl <em>CRA Week</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.sc.crator.model.impl.CRAWeekImpl
		 * @see fr.sc.crator.model.impl.CratorPackageImpl#getCRAWeek()
		 * @generated
		 */
		EClass CRA_WEEK = eINSTANCE.getCRAWeek();

		/**
		 * The meta object literal for the '<em><b>Worked Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRA_WEEK__WORKED_LOAD = eINSTANCE.getCRAWeek_WorkedLoad();

		/**
		 * The meta object literal for the '<em><b>Days</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRA_WEEK__DAYS = eINSTANCE.getCRAWeek_Days();

		/**
		 * The meta object literal for the '{@link fr.sc.crator.model.impl.CRADayImpl <em>CRA Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.sc.crator.model.impl.CRADayImpl
		 * @see fr.sc.crator.model.impl.CratorPackageImpl#getCRADay()
		 * @generated
		 */
		EClass CRA_DAY = eINSTANCE.getCRADay();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRA_DAY__DAY = eINSTANCE.getCRADay_Day();

		/**
		 * The meta object literal for the '<em><b>Works</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRA_DAY__WORKS = eINSTANCE.getCRADay_Works();

		/**
		 * The meta object literal for the '{@link fr.sc.crator.model.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.sc.crator.model.impl.TaskImpl
		 * @see fr.sc.crator.model.impl.CratorPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__CODE = eINSTANCE.getTask_Code();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

		/**
		 * The meta object literal for the '{@link fr.sc.crator.model.impl.WorkImpl <em>Work</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.sc.crator.model.impl.WorkImpl
		 * @see fr.sc.crator.model.impl.CratorPackageImpl#getWork()
		 * @generated
		 */
		EClass WORK = eINSTANCE.getWork();

		/**
		 * The meta object literal for the '<em><b>Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK__LOAD = eINSTANCE.getWork_Load();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK__TASK = eINSTANCE.getWork_Task();

		/**
		 * The meta object literal for the '{@link fr.sc.crator.model.impl.SpreadCRAImpl <em>Spread CRA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.sc.crator.model.impl.SpreadCRAImpl
		 * @see fr.sc.crator.model.impl.CratorPackageImpl#getSpreadCRA()
		 * @generated
		 */
		EClass SPREAD_CRA = eINSTANCE.getSpreadCRA();

		/**
		 * The meta object literal for the '<em><b>Sheet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPREAD_CRA__SHEET = eINSTANCE.getSpreadCRA_Sheet();

		/**
		 * The meta object literal for the '{@link fr.sc.crator.model.impl.VoidCRAImpl <em>Void CRA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.sc.crator.model.impl.VoidCRAImpl
		 * @see fr.sc.crator.model.impl.CratorPackageImpl#getVoidCRA()
		 * @generated
		 */
		EClass VOID_CRA = eINSTANCE.getVoidCRA();

		/**
		 * The meta object literal for the '<em>Spread Sheet</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.poi.ss.usermodel.Sheet
		 * @see fr.sc.crator.model.impl.CratorPackageImpl#getSpreadSheet()
		 * @generated
		 */
		EDataType SPREAD_SHEET = eINSTANCE.getSpreadSheet();

	}

} //CratorPackage
