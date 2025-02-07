create table nbp_factories_app_stage (
	uuid_ VARCHAR(75) null,
	factoriesApplicationStageId LONG not null primary key,
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
	factoriesApplicationId LONG,
	caseId VARCHAR(75) null,
	updatedBySource VARCHAR(75) null
);

create table nbp_factories_cert_regis (
	factoriesCerticateOfRegisId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	nameOfEstablishment VARCHAR(75) null,
	parish VARCHAR(75) null,
	procuctCatAndName VARCHAR(75) null,
	certificateIssueDate DATE null,
	dateOfExpiration DATE null,
	registration VARCHAR(75) null,
	status VARCHAR(75) null,
	docFileEntry LONG
);

create table nbp_factories_comm_decision (
	factoriesAppCommiDecId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	dateOfCommitteeDecision DATE null,
	committeeDecision VARCHAR(75) null,
	caseId VARCHAR(75) null
);

create table nbp_factories_inspection (
	factoriesInspectionId LONG not null primary key,
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
	factoriesApplicationId LONG,
	slotBookedByUser LONG
);

create table nbp_factory_payment_confirm (
	factoryPaymentVerificationId LONG not null primary key,
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