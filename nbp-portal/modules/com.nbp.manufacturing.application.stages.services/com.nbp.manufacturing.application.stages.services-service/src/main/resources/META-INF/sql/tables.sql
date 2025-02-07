create table nbp_manu_desk_verification (
	manuDeskVerificationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	documentName VARCHAR(75) null,
	status VARCHAR(75) null,
	manufacturingApplicationId LONG
);

create table nbp_manufacturing_app_stages (
	manufacturingAppStagesId LONG not null primary key,
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
	manufacturingApplicationId LONG,
	caseId VARCHAR(75) null,
	updateBySource VARCHAR(75) null
);

create table nbp_manufacturing_inspec (
	manuInspectionId LONG not null primary key,
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
	manufacturingApplicationId LONG,
	slotBookedByUser LONG
);

create table nbp_manufacturing_permit (
	manufacturingPermitId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	PIRPermtNumber VARCHAR(75) null,
	dateOfIssue DATE null,
	dateOfExpiration DATE null,
	durationOfPermit VARCHAR(75) null,
	typeOfPermit VARCHAR(75) null,
	numberOfExtensions VARCHAR(75) null,
	parish VARCHAR(75) null,
	pirPermitCertificateNumber LONG
);

create table nbp_manufacturing_rec_jca (
	manufacturingJCAId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	date_ DATE null,
	recommendationToJCA VARCHAR(75) null,
	recommendation VARCHAR(75) null,
	numberOfMIICInspectors VARCHAR(75) null
);