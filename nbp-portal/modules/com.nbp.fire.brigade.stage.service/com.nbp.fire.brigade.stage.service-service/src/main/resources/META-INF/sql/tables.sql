create table nbp_fire_brigade_app_stage (
	uuid_ VARCHAR(75) null,
	fireBrigadeAppStageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	stageName VARCHAR(75) null,
	stageEndDate DATE null,
	stageStartDate DATE null,
	duration VARCHAR(75) null,
	stageStatus VARCHAR(75) null,
	caseId VARCHAR(75) null,
	updatedBySource VARCHAR(75) null
);

create table nbp_fire_brigade_certificate (
	fireBrigadeCertificateId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nameOfOwner VARCHAR(75) null,
	typeOfPremises VARCHAR(75) null,
	issueDate DATE null,
	expirationDate DATE null,
	docFileEntry LONG,
	caseId VARCHAR(75) null,
	certificateNumber VARCHAR(75) null
);

create table nbp_fire_brigade_inspection (
	fireBrigadeInspectionId LONG not null primary key,
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
	fireBrigadeApplicationId LONG,
	slotBookedByUser LONG
);

create table nbp_fire_brigade_payment_conf (
	fireBrigadePaymentConfirId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	dateReceived DATE null,
	amountDue VARCHAR(75) null,
	amountReceived VARCHAR(75) null,
	receiptNumber VARCHAR(75) null,
	comment_ VARCHAR(75) null,
	amountOutstanding VARCHAR(75) null,
	dueDate DATE null,
	status VARCHAR(75) null,
	docFileEntry LONG
);

create table nbp_fire_payment_confirmation (
	fireBrigadePaymentConfirId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	dateReceived DATE null,
	amountDue VARCHAR(75) null,
	amountReceived VARCHAR(75) null,
	receiptNumber VARCHAR(75) null,
	comment_ VARCHAR(75) null,
	amountOutstanding VARCHAR(75) null,
	dueDate DATE null,
	status VARCHAR(75) null,
	docFileEntry LONG
);