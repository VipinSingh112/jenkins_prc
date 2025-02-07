create table nbp_janaac_app_stages (
	uuid_ VARCHAR(75) null,
	janaacApplicationStagesId LONG not null primary key,
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
	janaacApplicationId LONG,
	caseId VARCHAR(75) null,
	updateBySource VARCHAR(75) null
);

create table nbp_janaac_committee_decision (
	janaacCommitteeDecisionId LONG not null primary key,
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

create table nbp_janaac_inspection (
	janaacInspectionId LONG not null primary key,
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
	janaacApplicationId LONG,
	slotBookedByUser LONG
);

create table nbp_janaac_payment_verifi (
	janaacPaymentVerificationId LONG not null primary key,
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

create table nbp_janaac_report (
	janaacReportId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	dateOfReport DATE null,
	report VARCHAR(75) null,
	caseId VARCHAR(75) null
);