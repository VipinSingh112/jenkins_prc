create table nbp_certificate_of_verifi (
	certificateOfVerificationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nameOfApplicant VARCHAR(75) null,
	productName VARCHAR(75) null,
	dateCertificateIssued DATE null,
	dateOfExpiration DATE null,
	certificateNumber VARCHAR(75) null,
	caseId VARCHAR(75) null,
	documentFileEntryId LONG
);

create table nbp_ncra_inspection (
	ncraInspectionId LONG not null primary key,
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
	ncraApplicationId LONG,
	slotBookedByUser LONG
);

create table nbp_ncra_stage_appli (
	uuid_ VARCHAR(75) null,
	ncraApplciationStage LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	stageName VARCHAR(75) null,
	stageEndDate DATE null,
	stageStartDate DATE null,
	duration VARCHAR(75) null,
	stageStatus VARCHAR(75) null,
	caseId VARCHAR(75) null,
	updatedBySource VARCHAR(75) null
);