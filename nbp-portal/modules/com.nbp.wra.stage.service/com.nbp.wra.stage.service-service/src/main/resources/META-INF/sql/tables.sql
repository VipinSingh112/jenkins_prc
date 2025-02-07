create table nbp_wra_app_duediligence (
	wRAApplicationDueDiligenceId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	transactionNumber VARCHAR(75) null,
	entityName VARCHAR(75) null,
	dateOfApplication DATE null,
	agencyContactName VARCHAR(75) null,
	agencyEmailAddress VARCHAR(75) null,
	licenseNumber VARCHAR(75) null,
	agencyName VARCHAR(75) null,
	submittedToAgencyDate DATE null,
	feedbackReceivedDate DATE null,
	feedbackReceived VARCHAR(75) null,
	deadlineDate DATE null,
	wraApplicationId LONG,
	updatedBySource VARCHAR(75) null,
	durationOfTimeSpent VARCHAR(75) null,
	agencyDecision VARCHAR(75) null,
	status VARCHAR(75) null,
	caseId VARCHAR(75) null
);

create table nbp_wra_desk_verifi (
	wraApplicationDeskVeriId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	wraApplicationId LONG,
	documentStatus VARCHAR(75) null,
	documentName VARCHAR(500) null
);

create table nbp_wra_inspec (
	wraInspectionId LONG not null primary key,
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
	wraApplicationId LONG,
	slotBookedByUser LONG
);

create table nbp_wra_licence_issu (
	wraCertificateIssuanceId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	licenceNumber VARCHAR(75) null,
	status VARCHAR(75) null,
	Category VARCHAR(75) null,
	dateOfLicIssuance DATE null,
	dateOfLicenseExpiration DATE null,
	docLicFileEntryId LONG
);

create table nbp_wra_payment_confirm (
	wraPaymentConfirmationId LONG not null primary key,
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

create table nbp_wra_stage_services (
	uuid_ VARCHAR(75) null,
	wraApplicationStageId LONG not null primary key,
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
	wraApplicationId LONG,
	caseId VARCHAR(75) null,
	updateBySource VARCHAR(75) null
);