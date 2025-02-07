create table nbp_cannabis_app_duediligence (
	cannabisAppDDId LONG not null primary key,
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
	cannabisApplicationId LONG,
	updatedBySource VARCHAR(75) null,
	status VARCHAR(75) null,
	statusOfAgencyLetter VARCHAR(75) null,
	agencyDecision VARCHAR(75) null,
	caseId VARCHAR(75) null
);

create table nbp_cannabis_app_stages (
	cannabisApplicationstageId LONG not null primary key,
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
	cannabisApplicationId LONG,
	caseId VARCHAR(75) null,
	updatedBySource VARCHAR(75) null
);

create table nbp_cannabis_comm_decision (
	fullLicenseCommitteeDecisionId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	licenseFeeDue VARCHAR(75) null,
	bondFeeDue VARCHAR(75) null,
	committeeDecision VARCHAR(75) null,
	totalAmountDue LONG
);

create table nbp_cannabis_con_license (
	cannabisConditonalLicenseId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	entityNumber VARCHAR(75) null,
	entityName VARCHAR(75) null,
	categoryTier VARCHAR(75) null,
	numberOfTheExtension INTEGER,
	ListOfPreconditions TEXT null,
	payentAmtDue VARCHAR(75) null,
	issueDate DATE null,
	expirationDate DATE null,
	cannabisApplicationId LONG,
	updatedBySource VARCHAR(75) null,
	status VARCHAR(75) null,
	caseId VARCHAR(75) null,
	conditionalLicenseFileId LONG
);

create table nbp_cannabis_desk_veri (
	cannabisDeskVerificationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	cannabisApplicationId LONG,
	documentStatus VARCHAR(75) null,
	documentName VARCHAR(75) null
);

create table nbp_cannabis_desk_verifi (
	cannabisDeskVeriId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	cannabisApplicationId LONG,
	documentStatus VARCHAR(75) null,
	documentName VARCHAR(500) null
);

create table nbp_cannabis_inspection (
	cannabisInspectionId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	inspectionDate DATE null,
	insectionDateRange VARCHAR(75) null,
	invities VARCHAR(75) null,
	location VARCHAR(75) null,
	updatedBySource VARCHAR(75) null,
	status VARCHAR(75) null,
	caseId VARCHAR(75) null,
	cannabisApplicationId LONG,
	slotBookedByUser LONG
);

create table nbp_cannabis_license (
	cannabisLicenseId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	entityNumber VARCHAR(75) null,
	entityName VARCHAR(75) null,
	categoryTier VARCHAR(75) null,
	numberOfTheExtension VARCHAR(75) null,
	ListOfConditions TEXT null,
	payentAmtDue VARCHAR(75) null,
	issueDate DATE null,
	expirationDate DATE null,
	cannabisApplicationId LONG,
	updatedBySource VARCHAR(75) null,
	nameOfBPMStep VARCHAR(75) null,
	licenseConditionsFulfilled TEXT null,
	dateFulfilled VARCHAR(75) null,
	feeOptionSelected VARCHAR(75) null,
	feeAmount VARCHAR(75) null,
	feePaidDate DATE null,
	bpmUserNameRole VARCHAR(75) null,
	stageName VARCHAR(75) null,
	status VARCHAR(75) null,
	caseId VARCHAR(75) null,
	licenseNumber VARCHAR(75) null,
	licenseFileId LONG
);

create table nbp_cannabis_license_payment (
	cannabisLicensePaymentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	bondAmtDue VARCHAR(75) null,
	licenseFeeDue VARCHAR(75) null,
	feeIssuanceDue VARCHAR(75) null,
	feeOption VARCHAR(75) null,
	deferredPaymentType VARCHAR(75) null,
	feePaymentdDate DATE null,
	paymentOption VARCHAR(75) null,
	paymentAmtRecieved VARCHAR(75) null,
	paymentStatus VARCHAR(75) null,
	updatedBySource VARCHAR(75) null,
	status VARCHAR(75) null,
	caseId VARCHAR(75) null,
	amountCurrency VARCHAR(75) null,
	cannabisApplicationId LONG
);

create table nbp_cannabis_payment_confirm (
	cannabisAppliPaymentConfirId LONG not null primary key,
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
	comment_ VARCHAR(2000) null,
	amountOutstanding VARCHAR(75) null,
	dueDate DATE null,
	status VARCHAR(75) null,
	docFileEntry LONG
);

create table nbp_cannabis_pre_conditions (
	cannabisPreconditionsId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	precondition VARCHAR(75) null,
	licenseType VARCHAR(75) null,
	status VARCHAR(75) null,
	cannabisApplicationId LONG
);