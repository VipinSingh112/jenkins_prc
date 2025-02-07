create table nbp_miic_app_stages (
	uuid_ VARCHAR(75) null,
	miicApplicationStagesId LONG not null primary key,
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
	miicApplicationId LONG,
	caseId VARCHAR(75) null,
	updatedBySource VARCHAR(75) null
);

create table nbp_miic_certificate_of_issuan (
	miicCertificateOfIssuanceId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	certificateNumber VARCHAR(75) null,
	dateCertificateIssued DATE null,
	dateOfExpiration DATE null,
	documentFileEntryId LONG,
	caseId VARCHAR(75) null,
	nameOfLicensedTrustee VARCHAR(75) null
);

create table nbp_miic_recommen_decision (
	miicRecommendationsDecisionId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	dateOfRecommendationsDecision DATE null,
	recommendationsDecision VARCHAR(75) null,
	caseId VARCHAR(75) null
);

create table nbp_miic_stage (
	uuid_ VARCHAR(75) null,
	miicApplicationStagesId LONG not null primary key,
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
	miicApplicationId LONG,
	caseId VARCHAR(75) null,
	updatedBySource VARCHAR(75) null
);