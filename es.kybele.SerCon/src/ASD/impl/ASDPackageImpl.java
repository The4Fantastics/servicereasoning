/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ASD.impl;

import ASD.ASDFactory;
import ASD.ASDPackage;
import ASD.Annotation;
import ASD.Assertion;
import ASD.AssertionSet;
import ASD.EEnumDimensionType;
import ASD.EEnumIntention;
import ASD.EEnumMes;
import ASD.EEnumOp;
import ASD.EEnumSubset;
import ASD.EEnumValueType;
import ASD.EEnumlogicalType;
import ASD.InfoType;
import ASD.Message;
import ASD.NamedElement;
import ASD.Operation;
import ASD.Profile;
import ASD.ServiceDescription;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ASDPackageImpl extends EPackageImpl implements ASDPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infoTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eEnumOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eEnumMesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eEnumSubsetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eEnumValueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eEnumlogicalTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eEnumDimensionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eEnumIntentionEEnum = null;

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
	 * @see ASD.ASDPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ASDPackageImpl() {
		super(eNS_URI, ASDFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ASDPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ASDPackage init() {
		if (isInited) return (ASDPackage)EPackage.Registry.INSTANCE.getEPackage(ASDPackage.eNS_URI);

		// Obtain or create and register package
		ASDPackageImpl theASDPackage = (ASDPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ASDPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ASDPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theASDPackage.createPackageContents();

		// Initialize created meta-data
		theASDPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theASDPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ASDPackage.eNS_URI, theASDPackage);
		return theASDPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDescription() {
		return serviceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_Operations() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_Infotypes() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDescription_Profiles() {
		return (EReference)serviceDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_MessagePattern() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Contents() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Service() {
		return (EReference)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Role() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Subset() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_InfoType() {
		return (EReference)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Operation() {
		return (EReference)messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfoType() {
		return infoTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfoType_ValueType() {
		return (EAttribute)infoTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfoType_ValueRange() {
		return (EAttribute)infoTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfoType_Subset() {
		return (EAttribute)infoTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfoType_InfoType() {
		return (EReference)infoTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfoType_Message() {
		return (EReference)infoTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfoType_Service() {
		return (EReference)infoTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfile() {
		return profileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfile_Refers() {
		return (EReference)profileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfile_Sets() {
		return (EReference)profileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfile_Service() {
		return (EReference)profileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertionSet() {
		return assertionSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertionSet_LType() {
		return (EAttribute)assertionSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertionSet_Profile() {
		return (EReference)assertionSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertionSet_Assertions() {
		return (EReference)assertionSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertion() {
		return assertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertion_Dimension() {
		return (EAttribute)assertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertion_DimensionType() {
		return (EAttribute)assertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertion_Role() {
		return (EAttribute)assertionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertion_MinVal() {
		return (EAttribute)assertionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertion_MaxVal() {
		return (EAttribute)assertionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertion_LType() {
		return (EAttribute)assertionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertion_Set() {
		return (EReference)assertionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertion_Subset() {
		return (EAttribute)assertionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_Annotations() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Key() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Value() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_Owner() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEEnumOp() {
		return eEnumOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEEnumMes() {
		return eEnumMesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEEnumSubset() {
		return eEnumSubsetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEEnumValueType() {
		return eEnumValueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEEnumlogicalType() {
		return eEnumlogicalTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEEnumDimensionType() {
		return eEnumDimensionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEEnumIntention() {
		return eEnumIntentionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASDFactory getASDFactory() {
		return (ASDFactory)getEFactoryInstance();
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
		serviceDescriptionEClass = createEClass(SERVICE_DESCRIPTION);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__OPERATIONS);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__INFOTYPES);
		createEReference(serviceDescriptionEClass, SERVICE_DESCRIPTION__PROFILES);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__MESSAGE_PATTERN);
		createEReference(operationEClass, OPERATION__CONTENTS);
		createEReference(operationEClass, OPERATION__SERVICE);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__ROLE);
		createEAttribute(messageEClass, MESSAGE__SUBSET);
		createEReference(messageEClass, MESSAGE__INFO_TYPE);
		createEReference(messageEClass, MESSAGE__OPERATION);

		infoTypeEClass = createEClass(INFO_TYPE);
		createEAttribute(infoTypeEClass, INFO_TYPE__VALUE_TYPE);
		createEAttribute(infoTypeEClass, INFO_TYPE__VALUE_RANGE);
		createEAttribute(infoTypeEClass, INFO_TYPE__SUBSET);
		createEReference(infoTypeEClass, INFO_TYPE__INFO_TYPE);
		createEReference(infoTypeEClass, INFO_TYPE__MESSAGE);
		createEReference(infoTypeEClass, INFO_TYPE__SERVICE);

		profileEClass = createEClass(PROFILE);
		createEReference(profileEClass, PROFILE__REFERS);
		createEReference(profileEClass, PROFILE__SETS);
		createEReference(profileEClass, PROFILE__SERVICE);

		assertionSetEClass = createEClass(ASSERTION_SET);
		createEAttribute(assertionSetEClass, ASSERTION_SET__LTYPE);
		createEReference(assertionSetEClass, ASSERTION_SET__PROFILE);
		createEReference(assertionSetEClass, ASSERTION_SET__ASSERTIONS);

		assertionEClass = createEClass(ASSERTION);
		createEAttribute(assertionEClass, ASSERTION__DIMENSION);
		createEAttribute(assertionEClass, ASSERTION__DIMENSION_TYPE);
		createEAttribute(assertionEClass, ASSERTION__ROLE);
		createEAttribute(assertionEClass, ASSERTION__MIN_VAL);
		createEAttribute(assertionEClass, ASSERTION__MAX_VAL);
		createEAttribute(assertionEClass, ASSERTION__LTYPE);
		createEReference(assertionEClass, ASSERTION__SET);
		createEAttribute(assertionEClass, ASSERTION__SUBSET);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEReference(namedElementEClass, NAMED_ELEMENT__ANNOTATIONS);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__KEY);
		createEAttribute(annotationEClass, ANNOTATION__VALUE);
		createEReference(annotationEClass, ANNOTATION__OWNER);

		// Create enums
		eEnumOpEEnum = createEEnum(EENUM_OP);
		eEnumMesEEnum = createEEnum(EENUM_MES);
		eEnumSubsetEEnum = createEEnum(EENUM_SUBSET);
		eEnumValueTypeEEnum = createEEnum(EENUM_VALUE_TYPE);
		eEnumlogicalTypeEEnum = createEEnum(EENUMLOGICAL_TYPE);
		eEnumDimensionTypeEEnum = createEEnum(EENUM_DIMENSION_TYPE);
		eEnumIntentionEEnum = createEEnum(EENUM_INTENTION);
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
		serviceDescriptionEClass.getESuperTypes().add(this.getNamedElement());
		operationEClass.getESuperTypes().add(this.getNamedElement());
		messageEClass.getESuperTypes().add(this.getNamedElement());
		infoTypeEClass.getESuperTypes().add(this.getNamedElement());
		profileEClass.getESuperTypes().add(this.getNamedElement());
		assertionSetEClass.getESuperTypes().add(this.getNamedElement());
		assertionEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(serviceDescriptionEClass, ServiceDescription.class, "ServiceDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceDescription_Operations(), this.getOperation(), this.getOperation_Service(), "operations", null, 0, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDescription_Infotypes(), this.getInfoType(), this.getInfoType_Service(), "infotypes", null, 0, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDescription_Profiles(), this.getProfile(), this.getProfile_Service(), "profiles", null, 0, -1, ServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_MessagePattern(), this.getEEnumOp(), "messagePattern", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Contents(), this.getMessage(), this.getMessage_Operation(), "contents", null, 1, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Service(), this.getServiceDescription(), this.getServiceDescription_Operations(), "service", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_Role(), this.getEEnumMes(), "role", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Subset(), this.getEEnumSubset(), "subset", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_InfoType(), this.getInfoType(), this.getInfoType_Message(), "infoType", null, 1, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Operation(), this.getOperation(), this.getOperation_Contents(), "operation", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infoTypeEClass, InfoType.class, "InfoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInfoType_ValueType(), this.getEEnumValueType(), "valueType", null, 0, 1, InfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfoType_ValueRange(), ecorePackage.getEString(), "valueRange", null, 0, 1, InfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfoType_Subset(), this.getEEnumSubset(), "subset", null, 0, 1, InfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfoType_InfoType(), this.getInfoType(), null, "infoType", null, 0, -1, InfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfoType_Message(), this.getMessage(), this.getMessage_InfoType(), "message", null, 0, 1, InfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfoType_Service(), this.getServiceDescription(), this.getServiceDescription_Infotypes(), "service", null, 0, 1, InfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(profileEClass, Profile.class, "Profile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProfile_Refers(), this.getOperation(), null, "refers", null, 1, -1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProfile_Sets(), this.getAssertionSet(), this.getAssertionSet_Profile(), "sets", null, 1, -1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProfile_Service(), this.getServiceDescription(), this.getServiceDescription_Profiles(), "service", null, 0, 1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertionSetEClass, AssertionSet.class, "AssertionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssertionSet_LType(), this.getEEnumlogicalType(), "lType", null, 0, 1, AssertionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssertionSet_Profile(), this.getProfile(), this.getProfile_Sets(), "profile", null, 0, 1, AssertionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssertionSet_Assertions(), this.getAssertion(), this.getAssertion_Set(), "assertions", null, 1, -1, AssertionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertionEClass, Assertion.class, "Assertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssertion_Dimension(), ecorePackage.getEString(), "dimension", null, 0, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertion_DimensionType(), this.getEEnumDimensionType(), "dimensionType", null, 0, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertion_Role(), this.getEEnumIntention(), "role", null, 0, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertion_MinVal(), ecorePackage.getEDouble(), "minVal", null, 0, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertion_MaxVal(), ecorePackage.getEDouble(), "maxVal", null, 0, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertion_LType(), this.getEEnumlogicalType(), "lType", null, 0, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssertion_Set(), this.getAssertionSet(), this.getAssertionSet_Assertions(), "set", null, 0, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertion_Subset(), this.getEEnumSubset(), "subset", null, 0, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedElement_Annotations(), this.getAnnotation(), this.getAnnotation_Owner(), "annotations", null, 0, -1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Key(), ecorePackage.getEString(), "key", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotation_Value(), ecorePackage.getEString(), "value", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotation_Owner(), this.getNamedElement(), this.getNamedElement_Annotations(), "owner", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eEnumOpEEnum, EEnumOp.class, "EEnumOp");
		addEEnumLiteral(eEnumOpEEnum, EEnumOp.ONEWAY);
		addEEnumLiteral(eEnumOpEEnum, EEnumOp.NOTIFICATION);
		addEEnumLiteral(eEnumOpEEnum, EEnumOp.REQUESTRESPONSE);
		addEEnumLiteral(eEnumOpEEnum, EEnumOp.SOLICITRESPONSE);

		initEEnum(eEnumMesEEnum, EEnumMes.class, "EEnumMes");
		addEEnumLiteral(eEnumMesEEnum, EEnumMes.INPUT);
		addEEnumLiteral(eEnumMesEEnum, EEnumMes.OUTPUT);
		addEEnumLiteral(eEnumMesEEnum, EEnumMes.FAULT);

		initEEnum(eEnumSubsetEEnum, EEnumSubset.class, "EEnumSubset");
		addEEnumLiteral(eEnumSubsetEEnum, EEnumSubset.REQ);
		addEEnumLiteral(eEnumSubsetEEnum, EEnumSubset.PRO);

		initEEnum(eEnumValueTypeEEnum, EEnumValueType.class, "EEnumValueType");
		addEEnumLiteral(eEnumValueTypeEEnum, EEnumValueType.DOCUMENT);
		addEEnumLiteral(eEnumValueTypeEEnum, EEnumValueType.INT);
		addEEnumLiteral(eEnumValueTypeEEnum, EEnumValueType.FLOAT);
		addEEnumLiteral(eEnumValueTypeEEnum, EEnumValueType.DOUBLE);
		addEEnumLiteral(eEnumValueTypeEEnum, EEnumValueType.STRING);
		addEEnumLiteral(eEnumValueTypeEEnum, EEnumValueType.DATE);

		initEEnum(eEnumlogicalTypeEEnum, EEnumlogicalType.class, "EEnumlogicalType");
		addEEnumLiteral(eEnumlogicalTypeEEnum, EEnumlogicalType.AND);
		addEEnumLiteral(eEnumlogicalTypeEEnum, EEnumlogicalType.OR);

		initEEnum(eEnumDimensionTypeEEnum, EEnumDimensionType.class, "EEnumDimensionType");
		addEEnumLiteral(eEnumDimensionTypeEEnum, EEnumDimensionType.MONOTONIC);
		addEEnumLiteral(eEnumDimensionTypeEEnum, EEnumDimensionType.ANTITONIC);

		initEEnum(eEnumIntentionEEnum, EEnumIntention.class, "EEnumIntention");
		addEEnumLiteral(eEnumIntentionEEnum, EEnumIntention.PROMISE);
		addEEnumLiteral(eEnumIntentionEEnum, EEnumIntention.OBLIGATION);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });							
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";			
		addAnnotation
		  (serviceDescriptionEClass, 
		   source, 
		   new String[] {
			 "foo", "bar",
			 "model.extension", "model",
			 "diagram.extension", "model_diagram"
		   });						
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";				
		addAnnotation
		  (operationEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "figure", "rounded",
			 "label.placement", "external",
			 "color", "135,206,250",
			 "border.width", "4",
			 "size", "200,220"
		   });			
		addAnnotation
		  (messageEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "figure", "rectangle",
			 "color", "193,255,193"
		   });			
		addAnnotation
		  (infoTypeEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "figure", "ellipse",
			 "color", "255,255,153",
			 "border.color", "0,0,0",
			 "border.style", "dot"
		   });	
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";					
		addAnnotation
		  (getOperation_Contents(), 
		   source, 
		   new String[] {
			 "foo", "bar",
			 "layout", "list"
		   });				
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";							
		addAnnotation
		  (getMessage_InfoType(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dot",
			 "tool.description", "Relationship between Message and InfoType"
		   });			
		addAnnotation
		  (getInfoType_InfoType(), 
		   source, 
		   new String[] {
			 "source.decoration", "square",
			 "target.decoration", "square",
			 "style", "dash",
			 "tool.description", "Relationship between InfoTypes"
		   });
	}

} //ASDPackageImpl
