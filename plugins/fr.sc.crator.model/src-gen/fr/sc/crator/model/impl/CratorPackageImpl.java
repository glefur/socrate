/**
 */
package fr.sc.crator.model.impl;

import fr.sc.crator.model.CRADay;
import fr.sc.crator.model.CRAWeek;
import fr.sc.crator.model.CRAtor;
import fr.sc.crator.model.CratorFactory;
import fr.sc.crator.model.CratorPackage;
import fr.sc.crator.model.SpreadCRA;
import fr.sc.crator.model.Task;
import fr.sc.crator.model.VoidCRA;
import fr.sc.crator.model.Work;

import org.apache.poi.ss.usermodel.Sheet;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CratorPackageImpl extends EPackageImpl implements CratorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crAtorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass craEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass craWeekEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass craDayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spreadCRAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voidCRAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType spreadSheetEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.sc.crator.model.CratorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CratorPackageImpl() {
		super(eNS_URI, CratorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CratorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CratorPackage init() {
		if (isInited) return (CratorPackage)EPackage.Registry.INSTANCE.getEPackage(CratorPackage.eNS_URI);

		// Obtain or create and register package
		CratorPackageImpl theCratorPackage = (CratorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CratorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CratorPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCratorPackage.createPackageContents();

		// Initialize created meta-data
		theCratorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCratorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CratorPackage.eNS_URI, theCratorPackage);
		return theCratorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCRAtor() {
		return crAtorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCRAtor_Cras() {
		return (EReference)crAtorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCRAtor_Tasks() {
		return (EReference)crAtorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCRA() {
		return craEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCRA_WeekNumber() {
		return (EAttribute)craEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCRA_Week() {
		return (EReference)craEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCRA_Source() {
		return (EAttribute)craEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCRA_Crator() {
		return (EReference)craEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCRAWeek() {
		return craWeekEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCRAWeek_Days() {
		return (EReference)craWeekEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCRADay() {
		return craDayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCRADay_Day() {
		return (EAttribute)craDayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCRADay_Works() {
		return (EReference)craDayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Code() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Description() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWork() {
		return workEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWork_Load() {
		return (EAttribute)workEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWork_Task() {
		return (EReference)workEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpreadCRA() {
		return spreadCRAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpreadCRA_Sheet() {
		return (EAttribute)spreadCRAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoidCRA() {
		return voidCRAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSpreadSheet() {
		return spreadSheetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CratorFactory getCratorFactory() {
		return (CratorFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		crAtorEClass = createEClass(CR_ATOR);
		createEReference(crAtorEClass, CR_ATOR__CRAS);
		createEReference(crAtorEClass, CR_ATOR__TASKS);

		craEClass = createEClass(CRA);
		createEAttribute(craEClass, CRA__WEEK_NUMBER);
		createEReference(craEClass, CRA__WEEK);
		createEAttribute(craEClass, CRA__SOURCE);
		createEReference(craEClass, CRA__CRATOR);

		craWeekEClass = createEClass(CRA_WEEK);
		createEReference(craWeekEClass, CRA_WEEK__DAYS);

		craDayEClass = createEClass(CRA_DAY);
		createEAttribute(craDayEClass, CRA_DAY__DAY);
		createEReference(craDayEClass, CRA_DAY__WORKS);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__CODE);
		createEAttribute(taskEClass, TASK__DESCRIPTION);

		workEClass = createEClass(WORK);
		createEAttribute(workEClass, WORK__LOAD);
		createEReference(workEClass, WORK__TASK);

		spreadCRAEClass = createEClass(SPREAD_CRA);
		createEAttribute(spreadCRAEClass, SPREAD_CRA__SHEET);

		voidCRAEClass = createEClass(VOID_CRA);

		// Create data types
		spreadSheetEDataType = createEDataType(SPREAD_SHEET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		spreadCRAEClass.getESuperTypes().add(this.getCRA());
		voidCRAEClass.getESuperTypes().add(this.getCRA());

		// Initialize classes and features; add operations and parameters
		initEClass(crAtorEClass, CRAtor.class, "CRAtor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCRAtor_Cras(), this.getCRA(), this.getCRA_Crator(), "cras", null, 0, -1, CRAtor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCRAtor_Tasks(), this.getTask(), null, "tasks", null, 0, -1, CRAtor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(crAtorEClass, this.getTask(), "getTask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "code", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(craEClass, fr.sc.crator.model.CRA.class, "CRA", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCRA_WeekNumber(), ecorePackage.getEInt(), "weekNumber", null, 1, 1, fr.sc.crator.model.CRA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCRA_Week(), this.getCRAWeek(), null, "week", null, 1, 1, fr.sc.crator.model.CRA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCRA_Source(), ecorePackage.getEString(), "source", null, 1, 1, fr.sc.crator.model.CRA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCRA_Crator(), this.getCRAtor(), this.getCRAtor_Cras(), "crator", null, 1, 1, fr.sc.crator.model.CRA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(craWeekEClass, CRAWeek.class, "CRAWeek", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCRAWeek_Days(), this.getCRADay(), null, "days", null, 5, 5, CRAWeek.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(craWeekEClass, this.getCRADay(), "getDay", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "day", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(craWeekEClass, ecorePackage.getEDouble(), "totalLoad", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(craDayEClass, CRADay.class, "CRADay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCRADay_Day(), ecorePackage.getEInt(), "day", null, 1, 1, CRADay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCRADay_Works(), this.getWork(), null, "works", null, 0, -1, CRADay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(craDayEClass, ecorePackage.getEDouble(), "totalLoad", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Code(), ecorePackage.getEString(), "code", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Description(), ecorePackage.getEString(), "description", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEClass, Work.class, "Work", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWork_Load(), ecorePackage.getEDouble(), "load", null, 1, 1, Work.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWork_Task(), this.getTask(), null, "task", null, 1, 1, Work.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spreadCRAEClass, SpreadCRA.class, "SpreadCRA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpreadCRA_Sheet(), this.getSpreadSheet(), "sheet", null, 1, 1, SpreadCRA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voidCRAEClass, VoidCRA.class, "VoidCRA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(spreadSheetEDataType, Sheet.class, "SpreadSheet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CratorPackageImpl
