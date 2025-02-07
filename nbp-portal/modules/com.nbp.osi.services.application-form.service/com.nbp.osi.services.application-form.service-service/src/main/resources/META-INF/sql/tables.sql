create table nbp_osi_services_appli_info (
	uuid_ VARCHAR(75) null,
	osiServicesApplicanId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	applicantNature VARCHAR(75) null,
	indiFirstName VARCHAR(75) null,
	indiLastName VARCHAR(75) null,
	companyName VARCHAR(75) null,
	address VARCHAR(500) null,
	emailAddress VARCHAR(75) null,
	telephone VARCHAR(75) null,
	applicationDate DATE null,
	trnNumber VARCHAR(75) null,
	osiServicesApplicationId LONG
);

create table nbp_osi_services_application (
	uuid_ VARCHAR(75) null,
	osiServicesApplicationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	entityId LONG,
	doYouWant VARCHAR(75) null,
	typeOfApplicant VARCHAR(75) null,
	natureOfApplicant VARCHAR(75) null,
	typeOfTransaction VARCHAR(75) null,
	caseId VARCHAR(500) null,
	status INTEGER,
	icmDocumentPath VARCHAR(500) null,
	applicationNumber VARCHAR(75) null,
	expiredLicenseAppNumber VARCHAR(75) null,
	pdfFileEntryId LONG,
	appCurrentStageName VARCHAR(75) null
);

create table nbp_osi_services_assignm_det (
	uuid_ VARCHAR(75) null,
	osiADId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	assignmentName VARCHAR(75) null,
	assignmentDated DATE null,
	selectedAssignmentAttached VARCHAR(500) null,
	assignmentAddress VARCHAR(500) null,
	trusteeAct VARCHAR(75) null,
	osiServicesApplicationId LONG
);

create table nbp_osi_services_benef_cred (
	uuid_ VARCHAR(75) null,
	osiBOCInsoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	creditorName VARCHAR(75) null,
	creditorDate DATE null,
	creditorAddress VARCHAR(500) null,
	osiServicesApplicationId LONG
);

create table nbp_osi_services_fee_payment (
	osiServicesAppPaymentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	paymentMethod VARCHAR(75) null,
	paymentFee VARCHAR(75) null,
	amountPaid VARCHAR(75) null,
	amountCurrency VARCHAR(75) null,
	osiServicesApplicationId LONG
);

create table nbp_osi_services_inso_per (
	uuid_ VARCHAR(75) null,
	osiServicesInsoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	insolventPersonNature VARCHAR(75) null,
	insolventIndiFirstName VARCHAR(75) null,
	insolventIndiLastName VARCHAR(75) null,
	insolventCompanyName VARCHAR(75) null,
	insolventAddress VARCHAR(500) null,
	insolventParish VARCHAR(75) null,
	insolventEmailAddress VARCHAR(75) null,
	insolventTelephone VARCHAR(75) null,
	insolventApplicationDate DATE null,
	insolventTrnNumber VARCHAR(75) null,
	osiServicesApplicationId LONG
);

create table nbp_osi_services_stage (
	osiCurrentStageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	currentStage VARCHAR(75) null,
	lastFormDetailsStep VARCHAR(75) null,
	osiServicesApplicationId LONG
);

create table nbp_osi_services_sup_doc_ind (
	oSIServiceSupportingDocIndId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	supportingDocCheckboxes TEXT null,
	nonProvisionReasonReq1 VARCHAR(75) null,
	expectedDateReq1 DATE null,
	nonProvisionReasonReq2 VARCHAR(75) null,
	expectedDateReq2 DATE null,
	nonProvisionReasonReq3 VARCHAR(75) null,
	expectedDateReq3 DATE null,
	nonProvisionReasonReq4 VARCHAR(75) null,
	expectedDateReq4 DATE null,
	nonProvisionReasonReq5 VARCHAR(75) null,
	expectedDateReq5 DATE null,
	nonProvisionReasonReq6 VARCHAR(75) null,
	expectedDateReq6 DATE null,
	nonProvisionReasonReq7 VARCHAR(75) null,
	expectedDateReq7 DATE null,
	nonProvisionReasonReq8 VARCHAR(75) null,
	expectedDateReq8 DATE null,
	nonProvisionReasonReq9 VARCHAR(75) null,
	expectedDateReq9 DATE null,
	nonProvisionReasonReq10 VARCHAR(75) null,
	expectedDateReq10 DATE null,
	nonProvisionReasonReq11 VARCHAR(75) null,
	expectedDateReq11 DATE null,
	nonProvisionReasonReq12 VARCHAR(75) null,
	expectedDateReq12 DATE null,
	category VARCHAR(75) null,
	osiServicesApplicationId LONG
);

create table nbp_osi_services_tru_brak_add (
	uuid_ VARCHAR(75) null,
	osiTrusId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	breakdownWorkingYear VARCHAR(75) null,
	workingBankrupties VARCHAR(75) null,
	workingProposal VARCHAR(75) null,
	workingComBankrupts VARCHAR(75) null,
	workingComProposal VARCHAR(75) null,
	workingInterimReceive VARCHAR(75) null,
	breakdownWorkingCreditors VARCHAR(75) null,
	breakdownWorkingOther VARCHAR(75) null,
	counter VARCHAR(75) null,
	osiServicesApplicationId LONG
);

create table nbp_osi_services_trus_co_info (
	uuid_ VARCHAR(75) null,
	osiTrusId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	comCorporationName VARCHAR(75) null,
	comHeadOfficeAddress VARCHAR(1000) null,
	comTeleNo VARCHAR(75) null,
	comFaxNo VARCHAR(75) null,
	comEmail VARCHAR(75) null,
	otherCountry VARCHAR(75) null,
	comIncorporationDate DATE null,
	comLicenceRequest VARCHAR(75) null,
	osiServicesApplicationId LONG
);

create table nbp_osi_services_trus_com_sign (
	osiComSignId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	comSignDate DATE null,
	osiServicesApplicationId LONG
);

create table nbp_osi_services_trus_in_decl (
	uuid_ VARCHAR(75) null,
	osiDeclerationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	indiUndersignedApplicantName VARCHAR(75) null,
	indiUndersignedDated DATE null,
	osiServicesApplicationId LONG
);

create table nbp_osi_services_trus_in_gen (
	uuid_ VARCHAR(75) null,
	osTIId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	indiFamilyName VARCHAR(75) null,
	indiGivenName VARCHAR(75) null,
	indiDateOfBirth DATE null,
	indiOtherLegalNames VARCHAR(75) null,
	indiBusinessAddress VARCHAR(1000) null,
	indiBusinessTeleNo VARCHAR(75) null,
	indiBusinessFaxNo VARCHAR(75) null,
	indiBusinessEmail VARCHAR(75) null,
	indiHomeAddress VARCHAR(1000) null,
	indiHomeTeleNo VARCHAR(75) null,
	indiHomeFaxNo VARCHAR(75) null,
	indiHomeEmail VARCHAR(75) null,
	indiCurrentEmployer VARCHAR(75) null,
	indiDateOfEmployment DATE null,
	indiProfessionalOrg VARCHAR(1000) null,
	osiServicesApplicationId LONG
);

create table nbp_osi_services_trus_in_lic (
	uuid_ VARCHAR(75) null,
	osiLicBreakId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	indiBreakdownApplicantName VARCHAR(75) null,
	indiBreakdownFirm VARCHAR(75) null,
	indiBreakdownDated DATE null,
	indiBreakdownTrusteeName VARCHAR(75) null,
	indiBreakdownTrusteeDate DATE null,
	osiServicesApplicationId LONG
);

create table nbp_osi_services_trus_in_qual (
	uuid_ VARCHAR(75) null,
	osQualificationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	orgMember VARCHAR(75) null,
	osiServicesApplicationId LONG
);