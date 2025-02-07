create table nbp_osi_service_report (
	osiServiceIssuanceOfReportId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	dateOfReport DATE null,
	nameOfApplicant VARCHAR(75) null,
	typeOfApplicant VARCHAR(75) null,
	decision VARCHAR(75) null,
	docFileEntry LONG
);

create table nbp_osi_services_app_stages (
	uuid_ VARCHAR(75) null,
	osiServicesStagesId LONG not null primary key,
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
	osiServciesApplicationId LONG,
	caseId VARCHAR(75) null,
	updatedBySource VARCHAR(75) null
);

create table nbp_osi_services_certi_of_issu (
	oSIServicesCertiOfIssuanceId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nameOfInsolventPerson VARCHAR(75) null,
	dateCertificateIssued DATE null,
	dateOfExpiration DATE null,
	certificateNum VARCHAR(75) null,
	nameOfLicensedTrustee VARCHAR(75) null,
	docFileEntry LONG,
	caseId VARCHAR(75) null
);

create table nbp_osi_services_recommen (
	oSIServicesRecommendationsId LONG not null primary key,
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