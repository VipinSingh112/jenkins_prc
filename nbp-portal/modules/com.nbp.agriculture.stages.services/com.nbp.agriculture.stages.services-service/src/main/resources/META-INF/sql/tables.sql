create table nbp_agri_desk_verification (
	agriDeskVerificationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	agricultureApplicationId LONG,
	documentName VARCHAR(75) null,
	documentStatus VARCHAR(75) null
);

create table nbp_agriculture_app_stages (
	agricultureApplicationstageId LONG not null primary key,
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
	agricultureApplicationId LONG,
	caseId VARCHAR(75) null,
	updatedBySource VARCHAR(75) null
);

create table nbp_agriculture_inspection (
	agricultureInspectionId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	dateOfInspection DATE null,
	insectionDateRange VARCHAR(75) null,
	invities VARCHAR(75) null,
	location VARCHAR(75) null,
	updatedBySource VARCHAR(75) null,
	status VARCHAR(75) null,
	agriApplicationId LONG,
	slotBookedByUser LONG
);

create table nbp_agriculture_permit (
	agriculturePermitId LONG not null primary key,
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
	pirCertificateNUmber LONG
);