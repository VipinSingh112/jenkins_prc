create table nbp_mining_app_stage (
	uuid_ VARCHAR(75) null,
	miningStagesId LONG not null primary key,
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
	miningApplicationId LONG,
	caseId VARCHAR(75) null,
	updateBySource VARCHAR(75) null
);

create table nbp_mining_cert_issue (
	uuid_ VARCHAR(75) null,
	miningCertIssuId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	dateCertificateIssued DATE null,
	dateOfExpiration DATE null,
	certificateNumber VARCHAR(75) null,
	caseId VARCHAR(75) null,
	documentFileEntryId LONG
);

create table nbp_mining_desk_verifi (
	miningDeskVeriId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	miningApplicationId LONG,
	documentStatus VARCHAR(75) null,
	documentName VARCHAR(75) null
);

create table nbp_mining_due_dili (
	uuid_ VARCHAR(75) null,
	miningDueDiliId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	agencyName VARCHAR(75) null,
	feedbackReceived VARCHAR(75) null,
	status VARCHAR(75) null,
	isSubToAgency VARCHAR(75) null
);

create table nbp_mining_mini_dec (
	uuid_ VARCHAR(75) null,
	miningDecId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	dateOfCommDec DATE null,
	commDecision VARCHAR(75) null
);