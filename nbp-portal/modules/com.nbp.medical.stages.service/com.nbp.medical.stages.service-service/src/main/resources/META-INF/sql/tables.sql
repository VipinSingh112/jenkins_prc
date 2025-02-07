create table nbp_medical_app_stage (
	uuid_ VARCHAR(75) null,
	medicalStagesId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	stageName VARCHAR(75) null,
	duration VARCHAR(75) null,
	stageStatus VARCHAR(75) null,
	stageStartDate DATE null,
	stageEndDate DATE null,
	medicalApplicationId LONG,
	caseId VARCHAR(75) null,
	updateBySource VARCHAR(75) null
);

create table nbp_medical_inspection (
	medicalInspectionId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	dateOfInspection DATE null,
	timeOfInspection VARCHAR(75) null,
	location VARCHAR(75) null,
	status VARCHAR(75) null,
	medicalApplicationId LONG,
	slotBookedByUser LONG
);

create table nbp_medical_licence_issu (
	medicalCertificateIssuanceId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	licenceNumber VARCHAR(75) null,
	status VARCHAR(75) null,
	medicalCategory VARCHAR(75) null,
	dateOfLicIssuance DATE null,
	dateOfLicenseExpiration DATE null,
	docLicFileEntryId LONG
);

create table nbp_medical_payment_confirm (
	medicalPaymentConfirmationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	dateReceived DATE null,
	amountReceived VARCHAR(75) null,
	amountDue VARCHAR(75) null,
	receiptNumber VARCHAR(75) null,
	comment_ VARCHAR(75) null,
	amountOutstanding VARCHAR(75) null,
	dueDate DATE null,
	status VARCHAR(75) null,
	docFileEntry LONG
);

create table nbp_mining_licence_issu (
	medicalCertificateIssuanceId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	licenceNumber VARCHAR(75) null,
	status VARCHAR(75) null,
	medicalCategory VARCHAR(75) null,
	dateOfLicIssuance DATE null,
	dateOfLicenseExpiration DATE null,
	docLicFileEntryId LONG
);