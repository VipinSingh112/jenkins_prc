create table nbp_jadsc_appli_final_deter (
	jadscAppliFinalDeterId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	dateOfFinalDeter DATE null,
	Outcome VARCHAR(75) null,
	caseId VARCHAR(75) null
);

create table nbp_jadsc_appli_initi_inves (
	jadscAppliInvestiId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	dateOfIniInvest DATE null,
	outcome VARCHAR(75) null,
	caseId VARCHAR(75) null
);

create table nbp_jadsc_appli_preli_deter (
	jadscAppliPreliminationDeteId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	dateOfPreDete DATE null,
	Outcome VARCHAR(75) null,
	caseId VARCHAR(75) null
);

create table nbp_jadsc_appli_review_veri (
	jadscAppliReviewAndValidId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	versionOfApplication VARCHAR(75) null,
	status VARCHAR(75) null,
	caseId VARCHAR(75) null
);

create table nbp_jadsc_application_pre (
	jadscAppliPreInitiationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	dateOfPreInitiation DATE null,
	outcome VARCHAR(75) null,
	caseId VARCHAR(75) null
);

create table nbp_jadsc_application_stage (
	uuid_ VARCHAR(75) null,
	jadscAppStageId LONG not null primary key,
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
	jadscApplicationId LONG,
	caseId VARCHAR(75) null,
	updateBySource VARCHAR(75) null
);