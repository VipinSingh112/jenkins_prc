create table nbp_osi_affiliation (
	professionalAffiliationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	professionalAffiliationsDate DATE null,
	affiliationMultivalue VARCHAR(75) null,
	osiApplicationId LONG
);

create table nbp_osi_applicant_details (
	uuid_ VARCHAR(75) null,
	detailOfApplicantId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	applicantName VARCHAR(75) null,
	applicantMiddleName VARCHAR(75) null,
	applicantLastName VARCHAR(75) null,
	applicantAddress VARCHAR(500) null,
	applicantEmail VARCHAR(75) null,
	applicantTeleNum VARCHAR(75) null,
	applicantTrn VARCHAR(75) null,
	applicantIdNumber VARCHAR(75) null,
	applicantDob DATE null,
	applicantOccupation VARCHAR(75) null,
	osiApplicationId LONG
);

create table nbp_osi_application (
	osiApplicationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	entityId VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	applicationType VARCHAR(75) null,
	applicationStatus INTEGER,
	caseId VARCHAR(75) null,
	status INTEGER,
	icmDocumentPath VARCHAR(500) null,
	applicationNumber VARCHAR(75) null,
	expiredLicenseAppNumber VARCHAR(75) null,
	pdfFileEntryId LONG,
	appCurrentStageName VARCHAR(75) null
);

create table nbp_osi_counselling (
	counsellingExperienceId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	company VARCHAR(75) null,
	position VARCHAR(75) null,
	counsellingType VARCHAR(75) null,
	serviceLength VARCHAR(75) null,
	counter VARCHAR(75) null,
	osiApplicationId LONG
);

create table nbp_osi_current_stage (
	osiCurrentStageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	lastFormStep VARCHAR(75) null,
	currentStage VARCHAR(75) null,
	osiApplicationId LONG
);

create table nbp_osi_education_details (
	uuid_ VARCHAR(75) null,
	educationalDetailId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	institution VARCHAR(75) null,
	qualificationType VARCHAR(75) null,
	qualificationPeriod DATE null,
	qualificationGrade VARCHAR(75) null,
	counter VARCHAR(75) null,
	osiApplicationId LONG
);

create table nbp_osi_official_use (
	officialUseId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	receivedBy VARCHAR(75) null,
	receivedByDate DATE null,
	verifiedBy VARCHAR(75) null,
	verifiedByDate DATE null,
	applicationAccepted VARCHAR(75) null,
	dateCertificateIssued DATE null,
	certificateNumber VARCHAR(75) null,
	remarksNotes VARCHAR(500) null,
	osiApplicationId LONG
);