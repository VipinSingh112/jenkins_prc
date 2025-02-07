create table nbp_acquie_execution (
	acquireExecutionId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	paymentSection VARCHAR(75) null,
	paymentAmountDue VARCHAR(75) null,
	contractSection VARCHAR(75) null,
	dateContractExecuted DATE null,
	docFileEntryId LONG
);

create table nbp_acquire_advertising (
	acquireAdvertisingId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	dateFrom DATE null,
	dateTo DATE null,
	advertisingMediaStatus VARCHAR(75) null
);

create table nbp_acquire_app_stages (
	acquireApplicationStagesId LONG not null primary key,
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
	acquireApplicationId LONG,
	caseId VARCHAR(75) null,
	updatedBySource VARCHAR(75) null
);

create table nbp_acquire_desk_verification (
	acquireDeskVerificationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	acquireApplicationId LONG,
	documentName VARCHAR(75) null,
	documentStatus VARCHAR(75) null
);

create table nbp_acquire_draft_agree (
	acquireDraftId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	paymentAmountDue VARCHAR(75) null,
	docFileEntryId LONG
);

create table nbp_acquire_duediligence (
	sampleId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	siteVisitRequired VARCHAR(75) null,
	preferredSitVisitDate DATE null,
	agencySubmissionStatus VARCHAR(75) null,
	nameOfAgency VARCHAR(75) null,
	caseId VARCHAR(75) null,
	dateSubmittedToAgency DATE null,
	agencyRecommendations VARCHAR(75) null,
	dateFeedbackReceived DATE null,
	acquireApplicationId LONG
);

create table nbp_acquire_evaluation (
	acquireEvaluationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	typeOfCommittee VARCHAR(75) null,
	dateOfCommitteeDecision DATE null,
	committeeDecision VARCHAR(75) null
);

create table nbp_acquire_executed_agree (
	acquirefinalId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	dateContractExecuted DATE null,
	docFileEntryId LONG
);

create table nbp_acquire_payment_confirm (
	acquirePaymentId LONG not null primary key,
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

create table nbp_acquire_tendering (
	acquireTenderingId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	nameOfEachBidders VARCHAR(75) null,
	bidPriceofeachBid VARCHAR(75) null,
	minPriceOfTenderOffer VARCHAR(75) null,
	meetsMinimum VARCHAR(75) null,
	highestOffer VARCHAR(75) null,
	status VARCHAR(75) null
);

create table nbp_acquire_valuation (
	acquireValuationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	valuationNumber VARCHAR(75) null,
	valuationVolume VARCHAR(75) null,
	valuationFolio VARCHAR(75) null,
	valuationStatus VARCHAR(75) null
);