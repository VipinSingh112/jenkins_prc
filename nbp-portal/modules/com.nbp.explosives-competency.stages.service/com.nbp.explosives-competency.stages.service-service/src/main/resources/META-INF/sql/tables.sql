create table nbp_explosive_app_stages (
	uuid_ VARCHAR(75) null,
	expApplicationStagesId LONG not null primary key,
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
	explosiveApplicationId LONG,
	caseId VARCHAR(75) null,
	updatedBySource VARCHAR(75) null
);

create table nbp_explosive_commision_decis (
	uuid_ VARCHAR(75) null,
	commisiondecId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	commisionDecision VARCHAR(75) null,
	decisionDate DATE null,
	caseId VARCHAR(75) null
);

create table nbp_explosive_issu_lic (
	uuid_ VARCHAR(75) null,
	issuanceId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	dateOfIssuance DATE null,
	dateOfExpiration DATE null,
	certificateNumber VARCHAR(75) null,
	certificateNumberId LONG,
	caseId VARCHAR(75) null
);

create table nbp_explosive_rev_ver (
	uuid_ VARCHAR(75) null,
	issuanceId LONG not null primary key,
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