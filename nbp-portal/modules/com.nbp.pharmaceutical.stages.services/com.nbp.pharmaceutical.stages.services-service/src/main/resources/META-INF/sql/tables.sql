create table nbp_pharma_app_duediligence (
	pharmaAppDDId LONG not null primary key,
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
	deadlineDate DATE null,
	pharmaApplicationId LONG,
	updatedBySource VARCHAR(75) null,
	durationOfTimeSpent VARCHAR(75) null,
	agencyDecision VARCHAR(75) null,
	status VARCHAR(75) null,
	caseId VARCHAR(75) null
);

create table nbp_pharma_app_stages (
	pharmaApplicationstageId LONG not null primary key,
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
	pharmaApplicationId LONG,
	caseId VARCHAR(75) null,
	updatedBySource VARCHAR(75) null
);

create table nbp_pharma_comm_decision (
	pharmaCommitteeDecisionId LONG not null primary key,
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

create table nbp_pharma_desk_verification (
	pharmaDeskVerificationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	pharmaApplicationId LONG,
	document VARCHAR(75) null,
	documentName VARCHAR(500) null
);

create table nbp_pharma_full_license (
	pharmaFullLicenseId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	licenseNumber VARCHAR(75) null,
	dateOfIssue DATE null,
	feePaidAmount VARCHAR(75) null,
	receiptNumber VARCHAR(75) null,
	dueDate DATE null,
	leadTime VARCHAR(75) null,
	caseId VARCHAR(75) null,
	licenseDocId VARCHAR(75) null
);

create table nbp_pharma_payment_confirm (
	pharmaPaymentId LONG not null primary key,
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