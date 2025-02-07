create table nbp_sez_payment_confirm (
	sezPaymentId LONG not null primary key,
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

create table nbp_sez_pre_approval (
	preApprovalId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	preApprovalLetterId LONG
);

create table nbp_sez_status_app_stages (
	uuid_ VARCHAR(75) null,
	SezStatusApplicationStagesId LONG not null primary key,
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
	sezStatusApplicationId LONG,
	caseId VARCHAR(75) null,
	updatedBySource VARCHAR(75) null
);

create table nbp_sez_status_board_deci (
	uuid_ VARCHAR(75) null,
	sezStatusBoardId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	boardDecision VARCHAR(75) null,
	boardDecisionDate DATE null
);

create table nbp_sez_status_committe_deci (
	uuid_ VARCHAR(75) null,
	sezStatusCommitteeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	committeeDecision VARCHAR(75) null,
	committeeDecisionDate DATE null
);

create table nbp_sez_status_desk_verificat (
	SezDeskVerificationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	sezApplicationId LONG,
	document VARCHAR(75) null,
	documentName VARCHAR(75) null,
	status VARCHAR(75) null
);

create table nbp_sez_status_licence_issu (
	uuid_ VARCHAR(75) null,
	sezStatusLicIssuedId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	licenceNumber VARCHAR(75) null,
	nameOfApplicant VARCHAR(75) null,
	sezStatus VARCHAR(75) null,
	sezDeveloperNumber VARCHAR(75) null,
	dateOfLicIssuance DATE null,
	dateOfLicenseExpiration DATE null,
	docLicFileEntryId LONG
);

create table nbp_sez_status_welcome_pack (
	uuid_ VARCHAR(75) null,
	sezStatusWelcomeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	dateWelcomePackageSigned DATE null,
	welcomePackageSubmitToAppli DATE null,
	docLicFileEntryId LONG
);

create table nbp_sez_status_wfh_app_stages (
	sezWFHAppStagesId LONG not null primary key,
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
	sezStatusApplicationId LONG,
	caseId VARCHAR(75) null,
	updatedBySource VARCHAR(75) null
);