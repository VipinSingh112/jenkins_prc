create table nbp_ncra_applicant_details (
	ncraApplicantDetailInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	applicantBusinessName VARCHAR(75) null,
	applicantAddress VARCHAR(500) null,
	applicantContact VARCHAR(75) null,
	applicantTeleNum VARCHAR(75) null,
	applicantFaxNo VARCHAR(75) null,
	applicantEmailAddr VARCHAR(75) null,
	applicantLocation VARCHAR(500) null,
	ncraApplicationId LONG
);

create table nbp_ncra_application (
	ncraApplicationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	entityId VARCHAR(75) null,
	doYouWant VARCHAR(75) null,
	typeOfTransaction VARCHAR(75) null,
	status INTEGER,
	applicationNumber VARCHAR(75) null,
	expiredLicenseAppNumber VARCHAR(75) null,
	caseId VARCHAR(500) null,
	icmDocumentsPath VARCHAR(500) null,
	pdfFileEntryId LONG,
	appCurrentStageName VARCHAR(75) null
);

create table nbp_ncra_applications (
	ncraApplicationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	entityId VARCHAR(75) null,
	doYouWant VARCHAR(75) null,
	typeOfTransaction VARCHAR(75) null,
	status INTEGER,
	applicationNumber VARCHAR(75) null,
	expiredLicenseAppNumber VARCHAR(75) null,
	caseId VARCHAR(500) null,
	icmDocumentsPath VARCHAR(500) null,
	pdfFileEntryId LONG,
	appCurrentStageName VARCHAR(75) null
);

create table nbp_ncra_current_stage (
	ncraCurrentStageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	currentStage VARCHAR(75) null,
	lastFormStepDetails VARCHAR(75) null,
	ncraApplicationId LONG
);

create table nbp_ncra_current_stages (
	ncraCurrentStageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	currentStage VARCHAR(75) null,
	lastFormStepDetails VARCHAR(75) null,
	ncraApplicationId LONG
);

create table nbp_ncra_fee_payment (
	ncraFeeSubmissionId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	creditStatus VARCHAR(75) null,
	ncraApplicationId LONG
);

create table nbp_ncra_veri_weigh_date (
	ncraVerifyWeighingDateId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	weighingDate DATE null,
	ncraApplicationId LONG
);

create table nbp_ncra_verify_weigh_info (
	ncraVerifyWeighingDeviceInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	typeofDevice VARCHAR(75) null,
	manufacturer VARCHAR(75) null,
	serialNumber VARCHAR(75) null,
	quantity VARCHAR(75) null,
	maximumCapacity VARCHAR(75) null,
	counter VARCHAR(75) null,
	ncraApplicationId LONG
);