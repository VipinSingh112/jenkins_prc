create table nbp_farm_app_stages (
	uuid_ VARCHAR(75) null,
	farmApplicationStagesId LONG not null primary key,
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
	farmApplicationId LONG,
	caseId VARCHAR(75) null,
	updatedBySource VARCHAR(75) null
);

create table nbp_farm_desk_verifica (
	farmDeskVerificationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	farmerApplicationId LONG,
	documentName VARCHAR(500) null,
	documentStatus VARCHAR(75) null
);

create table nbp_farm_inspection (
	farmInspectionId LONG not null primary key,
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
	farmApplicationId LONG,
	slotBookedByUser LONG
);

create table nbp_farm_permit (
	farmPermitId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	pirPermtNumber VARCHAR(75) null,
	duration VARCHAR(75) null,
	dateofIssue DATE null,
	dateOfExpiration DATE null,
	pirCertificateNUmber LONG
);