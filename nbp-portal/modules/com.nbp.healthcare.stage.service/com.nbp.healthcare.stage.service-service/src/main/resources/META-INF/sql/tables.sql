create table nbp_health_desk_verifica (
	healthDeskVerificationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	healthCareApplicationId LONG,
	documentName VARCHAR(75) null,
	documentStatus VARCHAR(75) null
);

create table nbp_healthcare_app_stages (
	uuid_ VARCHAR(75) null,
	healthApplicationStagesId LONG not null primary key,
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
	healthApplicationId LONG,
	caseId VARCHAR(75) null,
	updatedBySource VARCHAR(75) null
);

create table nbp_healthcare_duediligence (
	healthDDId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	dateSubmittedAgency  DATE null,
	nameofAgency VARCHAR(75) null,
	agencyDecision VARCHAR(75) null,
	reasonForObejction VARCHAR(75) null,
	durationOfPeriod VARCHAR(75) null,
	date_ DATE null,
	feedbackReceived DATE null,
	Status VARCHAR(75) null
);

create table nbp_healthcare_permit (
	healthPermitId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	permitTransaction VARCHAR(75) null,
	nameofApplicant VARCHAR(75) null,
	category VARCHAR(75) null,
	pirPermt VARCHAR(75) null,
	bonafideHC VARCHAR(75) null,
	tariffCode VARCHAR(75) null,
	dateofIssue DATE null,
	pirPermitFileEntryId LONG
);