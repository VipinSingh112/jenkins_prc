create table nbp_medical_app_payment (
	medicalFaciltiesPaymentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	paymentMethod VARCHAR(75) null,
	paymentDocId VARCHAR(75) null,
	paymentStatus VARCHAR(75) null,
	paymentFee VARCHAR(75) null,
	amountPaid VARCHAR(75) null,
	amountCurrency VARCHAR(75) null,
	transactionNumber VARCHAR(75) null,
	medicalFacilitiesAppId LONG
);

create table nbp_medical_appli_info (
	uuid_ VARCHAR(75) null,
	medicalFacilitiesAppliId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	applicantName VARCHAR(75) null,
	appliTelephoneNumber VARCHAR(75) null,
	appliAddress VARCHAR(500) null,
	appliEmailAddress VARCHAR(75) null,
	appliNationality VARCHAR(75) null,
	counter VARCHAR(75) null,
	medicalFacilitiesAppId LONG
);

create table nbp_medical_company_detail (
	uuid_ VARCHAR(75) null,
	medicalFacilitiesComDetailId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	fullName VARCHAR(75) null,
	privateAddress VARCHAR(500) null,
	registeredOffice VARCHAR(75) null,
	counter VARCHAR(75) null,
	medicalFacilitiesAppId LONG
);

create table nbp_medical_current_stage (
	uuid_ VARCHAR(75) null,
	medicalCurrentStageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	currentStage VARCHAR(75) null,
	lastFormStep VARCHAR(75) null,
	medicalFacilitiesAppId LONG
);

create table nbp_medical_facilities_app (
	uuid_ VARCHAR(75) null,
	medicalFacilitiesAppId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	natureOfApplicant VARCHAR(75) null,
	typeOfTransaction VARCHAR(75) null,
	registrationNumber LONG,
	medicalCategory VARCHAR(75) null,
	subCategory VARCHAR(75) null,
	nursingHomesCategory VARCHAR(500) null,
	nursingSubCategoryVal VARCHAR(75) null,
	numberOfBeds VARCHAR(75) null,
	caseId VARCHAR(500) null,
	status INTEGER,
	icmDocumentPath VARCHAR(500) null,
	applicationNumber VARCHAR(75) null,
	expiredLicenseAppNumber VARCHAR(75) null,
	pdfFileEntryId LONG,
	appCurrentStageName VARCHAR(75) null,
	entityId VARCHAR(75) null
);

create table nbp_medical_home_info (
	uuid_ VARCHAR(75) null,
	medicalFacilitiesHomeInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nameOfOwner VARCHAR(75) null,
	homeAddress VARCHAR(500) null,
	homeTelephoneNumber VARCHAR(75) null,
	homeEmailAddress VARCHAR(75) null,
	description VARCHAR(500) null,
	otherBusinessDetails VARCHAR(75) null,
	maternityPatients VARCHAR(75) null,
	otherPatients VARCHAR(75) null,
	counter VARCHAR(75) null,
	medicalFacilitiesAppId LONG
);

create table nbp_medical_maternity_home (
	uuid_ VARCHAR(75) null,
	medicalFacilitiesMaterHomeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nurseName VARCHAR(75) null,
	nurseQualification VARCHAR(75) null,
	otherPerson VARCHAR(75) null,
	counter VARCHAR(75) null,
	medicalFacilitiesAppId LONG
);

create table nbp_medical_no_of_patient (
	uuid_ VARCHAR(75) null,
	medicalFacilitiesHomeTwoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	maternityPatients VARCHAR(75) null,
	otherPatients VARCHAR(75) null,
	counter VARCHAR(75) null,
	medicalFacilitiesAppId LONG
);

create table nbp_medical_nurse_detail (
	uuid_ VARCHAR(75) null,
	medicalFacilitiesNurseDetailId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	qNurseName VARCHAR(75) null,
	qNurseQualification VARCHAR(75) null,
	ratioOfQNurses VARCHAR(75) null,
	counter VARCHAR(75) null,
	medicalFacilitiesAppId LONG
);

create table nbp_medical_nurse_info (
	uuid_ VARCHAR(75) null,
	medicalFacilitiesQNurseId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	checkQualifiedNurse VARCHAR(75) null,
	name VARCHAR(75) null,
	qualification VARCHAR(75) null,
	nursingStaffCategory VARCHAR(75) null,
	qNurseName VARCHAR(75) null,
	qNurseQualification VARCHAR(75) null,
	ratioOfQNurses VARCHAR(75) null,
	medicalFacilitiesAppId LONG
);

create table nbp_medical_nursing_staff (
	uuid_ VARCHAR(75) null,
	medicalFacilitiesNurseStaffId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nStaffName VARCHAR(75) null,
	nStaffQualification VARCHAR(75) null,
	nStaffState VARCHAR(75) null,
	counter VARCHAR(75) null,
	medicalFacilitiesAppId LONG
);

create table nbp_medical_sign_info (
	uuid_ VARCHAR(75) null,
	medicalFacilitiesSignInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	number_ VARCHAR(75) null,
	particulars VARCHAR(75) null,
	chargedFees VARCHAR(75) null,
	addressOfOtherNHome VARCHAR(500) null,
	enteredDate DATE null,
	medicalFacilitiesAppId LONG
);

create table nbp_medical_staff_premises (
	medicalNurseStaffPremisesId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nursingStaffCategory VARCHAR(75) null,
	medicalFacilitiesAppId LONG
);