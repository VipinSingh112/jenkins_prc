create table nbp_quarry_app_stag (
	uuid_ VARCHAR(75) null,
	quarryAppStagesId LONG not null primary key,
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
	quarryApplicationId LONG,
	caseId VARCHAR(75) null,
	updateBySource VARCHAR(75) null
);

create table nbp_quarry_comm_decision (
	quarryAppCommitteeDecisionId LONG not null primary key,
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

create table nbp_quarry_inspection (
	quarryInspectionId LONG not null primary key,
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
	quarryApplicationId LONG,
	slotBookedByUser LONG
);

create table nbp_quarry_licence_certificate (
	queryLicenceCertificateId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	licenceCertificate VARCHAR(75) null,
	category VARCHAR(75) null,
	issueDate DATE null,
	expirationDate DATE null,
	status VARCHAR(75) null,
	docFileEntry LONG
);

create table nbp_quarry_payment_confirm (
	quarryPaymentConfirmationId LONG not null primary key,
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