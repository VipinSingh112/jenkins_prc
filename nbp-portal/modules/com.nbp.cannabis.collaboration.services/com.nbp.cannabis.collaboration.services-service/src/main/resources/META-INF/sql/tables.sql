create table nbp_cannabis_collaboration (
	uuid_ VARCHAR(75) null,
	cannabisCollaborationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	cannabisStage VARCHAR(75) null,
	userType VARCHAR(75) null,
	comment_ VARCHAR(75) null,
	status VARCHAR(75) null,
	uploadedDocId VARCHAR(75) null,
	caseId VARCHAR(75) null,
	applicationId VARCHAR(75) null,
	archived INTEGER
);