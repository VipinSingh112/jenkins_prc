create table nbp_creative_app_stages (
	uuid_ VARCHAR(75) null,
	creativeApplicationStagesId LONG not null primary key,
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
	creativeApplicationId LONG,
	caseId VARCHAR(75) null,
	updatedBySource VARCHAR(75) null
);

create table nbp_creative_desk_veri (
	creativeDeskVerificationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	creativeApplicationId LONG,
	documentName VARCHAR(500) null,
	documentStatus VARCHAR(75) null
);

create table nbp_creative_inspection (
	creativeInspectionId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	dateOfInspection DATE null,
	timeOfInspection VARCHAR(75) null,
	location VARCHAR(75) null,
	updatedBySource VARCHAR(75) null,
	status VARCHAR(75) null,
	caseId VARCHAR(75) null,
	creativeApplicationId LONG,
	slotBookedByUser LONG
);

create table nbp_creative_permit (
	creativePermitId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	pirPermtNumber VARCHAR(75) null,
	dateofIssue DATE null,
	dateOfExpiration DATE null,
	durationOfPermit VARCHAR(75) null,
	pirCertificateNumber LONG
);