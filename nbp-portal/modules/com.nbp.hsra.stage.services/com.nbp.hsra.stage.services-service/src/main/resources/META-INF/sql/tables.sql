create table nbp_hsra_app_duediligence (
	hsraAppDDId LONG not null primary key,
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
	hsraApplicationId LONG,
	updatedBySource VARCHAR(75) null,
	durationOfTimeSpent VARCHAR(75) null,
	agencyDecision VARCHAR(75) null,
	status VARCHAR(75) null,
	caseId VARCHAR(75) null
);

create table nbp_hsra_application_stage (
	uuid_ VARCHAR(75) null,
	hsraApplicationStagesId LONG not null primary key,
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
	hsraApplicationId LONG,
	caseId VARCHAR(75) null,
	updateBySource VARCHAR(75) null
);

create table nbp_hsra_desk_verifi (
	hsraApplicationDeskVeriId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	hsraApplicationId LONG,
	documentStatus VARCHAR(75) null,
	documentName VARCHAR(700) null
);

create table nbp_hsra_inspection (
	hsraInspectionId LONG not null primary key,
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
	hsraApplicationId LONG,
	slotBookedByUser LONG
);

create table nbp_hsra_lic_iss (
	hsraFullLicenseId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	licenseNumber VARCHAR(75) null,
	dateOfIssue DATE null,
	dateOfExpiry DATE null,
	status VARCHAR(75) null,
	feePaidAmount VARCHAR(75) null,
	receiptNumber VARCHAR(75) null,
	dueDate DATE null,
	leadTime VARCHAR(75) null,
	caseId VARCHAR(75) null,
	licenseDocId VARCHAR(75) null
);

create table nbp_hsra_payment_confirm (
	hsraPaymentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	amountDue VARCHAR(75) null,
	dateReceived DATE null,
	amountreceived VARCHAR(75) null,
	receivedNumber VARCHAR(75) null,
	comments VARCHAR(75) null,
	amountOutstanding VARCHAR(75) null,
	dueDate DATE null,
	status VARCHAR(75) null,
	paymentreceiptFileEntryId LONG
);