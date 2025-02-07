create table nbp_ncbj_app_stage (
	uuid_ VARCHAR(75) null,
	ncbjStagesApplicationId LONG not null primary key,
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
	ncbjApplicationId LONG,
	caseId VARCHAR(75) null,
	updateBySource VARCHAR(75) null
);

create table nbp_ncbj_board_decision (
	ncbjAppBoardDecisionId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	dateOfBoardDecision DATE null,
	committeeDecision VARCHAR(75) null,
	caseId VARCHAR(75) null
);

create table nbp_ncbj_corrective_act (
	ncbjAppCorrActionId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	preApprovalLetterId LONG
);

create table nbp_ncbj_inspection (
	ncbjInspectionId LONG not null primary key,
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
	ncbjApplicationId LONG,
	slotBookedByUser LONG
);

create table nbp_ncbj_licence_certificate (
	ncbjLicenceCertificateId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	licenceCertificate VARCHAR(75) null,
	NameOfApplicant VARCHAR(75) null,
	nameOfCertification VARCHAR(75) null,
	scopeOfCertification VARCHAR(75) null,
	issueDate DATE null,
	expirationDate DATE null,
	status VARCHAR(75) null,
	docFileEntry LONG
);

create table nbp_ncbj_payment_confirm (
	ncbjPaymentConfirmationId LONG not null primary key,
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