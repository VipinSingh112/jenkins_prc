create table OGT_STAGE_OgtApplicationStage (
	uuid_ VARCHAR(75) null,
	ogtStagesId LONG not null primary key,
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
	ogtApplicationId LONG,
	caseId VARCHAR(75) null,
	updateBySource VARCHAR(75) null
);

create table nbp_ogt_application_stages (
	uuid_ VARCHAR(75) null,
	ogtStagesId LONG not null primary key,
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
	ogtApplicationId LONG,
	caseId VARCHAR(75) null,
	updateBySource VARCHAR(75) null
);