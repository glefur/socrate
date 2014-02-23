/**
 */
package fr.sc.crator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see fr.sc.crator.CratorFactory
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
	String eNAME = "crator";

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
	CratorPackage eINSTANCE = fr.sc.crator.impl.CratorPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.sc.crator.impl.CRAtorImpl <em>CR Ator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.sc.crator.impl.CRAtorImpl
	 * @see fr.sc.crator.impl.CratorPackageImpl#getCRAtor()
	 * @generated
	 */
	int CR_ATOR = 0;

	/**
	 * The feature id for the '<em><b>Weeks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CR_ATOR__WEEKS = 0;

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
	 * The meta object id for the '{@link fr.sc.crator.impl.CRAWeekImpl <em>CRA Week</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.sc.crator.impl.CRAWeekImpl
	 * @see fr.sc.crator.impl.CratorPackageImpl#getCRAWeek()
	 * @generated
	 */
	int CRA_WEEK = 1;

	/**
	 * The feature id for the '<em><b>Days</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA_WEEK__DAYS = 0;

	/**
	 * The number of structural features of the '<em>CRA Week</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA_WEEK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.sc.crator.impl.CRADayImpl <em>CRA Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.sc.crator.impl.CRADayImpl
	 * @see fr.sc.crator.impl.CratorPackageImpl#getCRADay()
	 * @generated
	 */
	int CRA_DAY = 2;

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
	 * The meta object id for the '{@link fr.sc.crator.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.sc.crator.impl.TaskImpl
	 * @see fr.sc.crator.impl.CratorPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 3;

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
	 * The meta object id for the '{@link fr.sc.crator.impl.WorkImpl <em>Work</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.sc.crator.impl.WorkImpl
	 * @see fr.sc.crator.impl.CratorPackageImpl#getWork()
	 * @generated
	 */
	int WORK = 4;

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
	 * Returns the meta object for class '{@link fr.sc.crator.CRAtor <em>CR Ator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CR Ator</em>'.
	 * @see fr.sc.crator.CRAtor
	 * @generated
	 */
	EClass getCRAtor();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.sc.crator.CRAtor#getWeeks <em>Weeks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weeks</em>'.
	 * @see fr.sc.crator.CRAtor#getWeeks()
	 * @see #getCRAtor()
	 * @generated
	 */
	EReference getCRAtor_Weeks();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.sc.crator.CRAtor#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see fr.sc.crator.CRAtor#getTasks()
	 * @see #getCRAtor()
	 * @generated
	 */
	EReference getCRAtor_Tasks();

	/**
	 * Returns the meta object for class '{@link fr.sc.crator.CRAWeek <em>CRA Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CRA Week</em>'.
	 * @see fr.sc.crator.CRAWeek
	 * @generated
	 */
	EClass getCRAWeek();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.sc.crator.CRAWeek#getDays <em>Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Days</em>'.
	 * @see fr.sc.crator.CRAWeek#getDays()
	 * @see #getCRAWeek()
	 * @generated
	 */
	EReference getCRAWeek_Days();

	/**
	 * Returns the meta object for class '{@link fr.sc.crator.CRADay <em>CRA Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CRA Day</em>'.
	 * @see fr.sc.crator.CRADay
	 * @generated
	 */
	EClass getCRADay();

	/**
	 * Returns the meta object for the attribute '{@link fr.sc.crator.CRADay#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see fr.sc.crator.CRADay#getDay()
	 * @see #getCRADay()
	 * @generated
	 */
	EAttribute getCRADay_Day();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.sc.crator.CRADay#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Works</em>'.
	 * @see fr.sc.crator.CRADay#getWorks()
	 * @see #getCRADay()
	 * @generated
	 */
	EReference getCRADay_Works();

	/**
	 * Returns the meta object for class '{@link fr.sc.crator.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see fr.sc.crator.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link fr.sc.crator.Task#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see fr.sc.crator.Task#getCode()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Code();

	/**
	 * Returns the meta object for the attribute '{@link fr.sc.crator.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.sc.crator.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Description();

	/**
	 * Returns the meta object for class '{@link fr.sc.crator.Work <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work</em>'.
	 * @see fr.sc.crator.Work
	 * @generated
	 */
	EClass getWork();

	/**
	 * Returns the meta object for the attribute '{@link fr.sc.crator.Work#getLoad <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load</em>'.
	 * @see fr.sc.crator.Work#getLoad()
	 * @see #getWork()
	 * @generated
	 */
	EAttribute getWork_Load();

	/**
	 * Returns the meta object for the reference '{@link fr.sc.crator.Work#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see fr.sc.crator.Work#getTask()
	 * @see #getWork()
	 * @generated
	 */
	EReference getWork_Task();

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
		 * The meta object literal for the '{@link fr.sc.crator.impl.CRAtorImpl <em>CR Ator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.sc.crator.impl.CRAtorImpl
		 * @see fr.sc.crator.impl.CratorPackageImpl#getCRAtor()
		 * @generated
		 */
		EClass CR_ATOR = eINSTANCE.getCRAtor();

		/**
		 * The meta object literal for the '<em><b>Weeks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CR_ATOR__WEEKS = eINSTANCE.getCRAtor_Weeks();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CR_ATOR__TASKS = eINSTANCE.getCRAtor_Tasks();

		/**
		 * The meta object literal for the '{@link fr.sc.crator.impl.CRAWeekImpl <em>CRA Week</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.sc.crator.impl.CRAWeekImpl
		 * @see fr.sc.crator.impl.CratorPackageImpl#getCRAWeek()
		 * @generated
		 */
		EClass CRA_WEEK = eINSTANCE.getCRAWeek();

		/**
		 * The meta object literal for the '<em><b>Days</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRA_WEEK__DAYS = eINSTANCE.getCRAWeek_Days();

		/**
		 * The meta object literal for the '{@link fr.sc.crator.impl.CRADayImpl <em>CRA Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.sc.crator.impl.CRADayImpl
		 * @see fr.sc.crator.impl.CratorPackageImpl#getCRADay()
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
		 * The meta object literal for the '{@link fr.sc.crator.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.sc.crator.impl.TaskImpl
		 * @see fr.sc.crator.impl.CratorPackageImpl#getTask()
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
		 * The meta object literal for the '{@link fr.sc.crator.impl.WorkImpl <em>Work</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.sc.crator.impl.WorkImpl
		 * @see fr.sc.crator.impl.CratorPackageImpl#getWork()
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

	}

} //CratorPackage
