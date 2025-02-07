create table nbp_tourism_app_stages (
	uuid_ VARCHAR(75) null,
	tourismApplicationStagesId LONG not null primary key,
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
	tourismApplicationId LONG,
	caseId VARCHAR(75) null,
	updatedBySource VARCHAR(75) null
);

create table nbp_tourism_desk_verifica (
	tourismDeskVeriId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	tourismApplicationId LONG,
	documentStatus VARCHAR(75) null,
	documentName VARCHAR(500) null
);

create table nbp_tourism_payment_con (
	tourismPaymentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	caseId VARCHAR(75) null,
	dateReceived DATE null,
	amountReceived VARCHAR(75) null,
	amountDue VARCHAR(75) null,
	receiptNumber VARCHAR(75) null,
	comment_ VARCHAR(75) null,
	amountOutstanding VARCHAR(75) null,
	dueDate DATE null,
	status VARCHAR(75) null,
	docFileEntry LONG
);

create table nbp_tourism_permit (
	tourismgPermitId LONG not null primary key,
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