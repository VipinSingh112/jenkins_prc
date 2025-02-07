create table nbp_osi_inso_data_verification (
	osiInsolDataVerificationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	status VARCHAR(75) null
);

create table nbp_osi_inso_desk_verification (
	OsiInsolveDeskVerificationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	documentName VARCHAR(75) null,
	status VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_inso_payment_con (
	osiIRPaymentId LONG not null primary key,
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

create table nbp_osi_insol_issu_of_report (
	osiInsoIIssuanceOfReportId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	dateOfReport DATE null,
	nameOfApplicant VARCHAR(75) null,
	typeOfApplicant VARCHAR(75) null,
	decision VARCHAR(75) null,
	docFileEntry LONG
);

create table nbp_osi_insolvency_app_stages (
	uuid_ VARCHAR(75) null,
	osiInsolveApplicationStagesId LONG not null primary key,
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
	osiInsolvencyId LONG,
	caseId VARCHAR(75) null,
	updatedBySource VARCHAR(75) null
);