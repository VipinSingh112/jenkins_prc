create table nbp_collaboration (
	uuid_ VARCHAR(75) null,
	collaborationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	stageName VARCHAR(75) null,
	userType VARCHAR(75) null,
	comment_ VARCHAR(75) null,
	status VARCHAR(75) null,
	uploadedDocId VARCHAR(75) null,
	caseId VARCHAR(75) null,
	applicationId VARCHAR(75) null,
	archived INTEGER
);