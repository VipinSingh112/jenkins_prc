create table nbp_osi_app_stages (
	uuid_ VARCHAR(75) null,
	OsiApplicationStagesId LONG not null primary key,
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
	osiApplicationId LONG,
	caseId VARCHAR(75) null,
	updatedBySource VARCHAR(75) null
);

create table nbp_osi_application_permit (
	osiApplicationPermitId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	decision VARCHAR(75) null,
	dateOfDecision DATE null,
	dateOfIssue DATE null,
	dateOfExpiration DATE null,
	permitNumber VARCHAR(75) null,
	fileEntryId VARCHAR(75) null
);

create table nbp_osi_desk_verification (
	osiDeskVerificationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	documentName VARCHAR(75) null,
	status VARCHAR(75) null,
	osiApplicationId LONG
);

create table osi_application_inspec (
	osiInspectionId LONG not null primary key,
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
	osiApplicationId LONG,
	slotBookedByUser LONG
);