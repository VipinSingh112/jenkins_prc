create table nbp_health_equip_heading_list (
	healthcareEquipHeadingListId LONG not null primary key,
	healthcareDescription VARCHAR(1000) null,
	healthcareHsHeading VARCHAR(75) null,
	healthcareSubHeading VARCHAR(75) null
);

create table nbp_healthcare_app_payment (
	healthCareApplicationPaymentId LONG not null primary key,
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
	transactionNumber VARCHAR(75) null,
	healthCareApplicationId LONG
);

create table nbp_healthcare_applicant (
	healthCareApplicantInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	emailAddress VARCHAR(75) null,
	telephoneNumber VARCHAR(75) null,
	healthCareApplicationId LONG
);

create table nbp_healthcare_applicant_add (
	healthCareApplicantAddressId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	applicantMailingAddress VARCHAR(500) null,
	healthCareApplicationId LONG,
	healthCareApplicantInfoId LONG
);

create table nbp_healthcare_application (
	healthCareApplicationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	entityId VARCHAR(75) null,
	healthCareFacility VARCHAR(75) null,
	healthCareRegistrationNum VARCHAR(75) null,
	status INTEGER,
	applicationNumber VARCHAR(75) null,
	caseId VARCHAR(500) null,
	icmDocumentPath VARCHAR(500) null,
	pdfFileEntryId LONG,
	appCurrentStageName VARCHAR(75) null
);

create table nbp_healthcare_bussiness (
	healthCareBussinessInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	telephoneNumber VARCHAR(75) null,
	email VARCHAR(75) null,
	parish VARCHAR(75) null,
	companyNumber VARCHAR(75) null,
	trnNumber VARCHAR(75) null,
	healthCareApplicationId LONG
);

create table nbp_healthcare_bussiness_add (
	healthCareBusinessAddressId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	bussinessAddress VARCHAR(500) null,
	healthCareApplicationId LONG,
	healthCareBussinessInfoId LONG
);

create table nbp_healthcare_description (
	healthCareDescriptionId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	descriptionOfService VARCHAR(75) null,
	healthCareApplicationId LONG
);

create table nbp_healthcare_equipment_info (
	healthCareEquipmentInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	healthCareApplicationId LONG,
	equipmentManu VARCHAR(75) null,
	equipmentModel VARCHAR(75) null,
	equipmentMake VARCHAR(75) null,
	yearOfEquipment VARCHAR(75) null,
	serialNumber VARCHAR(75) null,
	quantity VARCHAR(75) null,
	description VARCHAR(500) null,
	hsHeading VARCHAR(75) null,
	hsSubHeading VARCHAR(75) null,
	counter VARCHAR(75) null
);

create table nbp_healthcare_stage (
	HealthCareCurrentStageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	currentStage VARCHAR(75) null,
	lastFormStage VARCHAR(75) null,
	healthCareApplicationId LONG
);