create table nbp_jadsc_application (
	uuid_ VARCHAR(75) null,
	jadscApplicationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	entityId VARCHAR(75) null,
	typeOfApplication VARCHAR(75) null,
	typeOfComplaint VARCHAR(75) null,
	typeOfTransaction VARCHAR(75) null,
	transactionNumber VARCHAR(75) null,
	typeOfApplicant VARCHAR(75) null,
	industriesImpacted VARCHAR(1000) null,
	breachOfConfidentiality VARCHAR(1000) null,
	categoriesOfConfidentialInfo VARCHAR(3000) null,
	categoriesOfConfiOtherPlease VARCHAR(75) null,
	reasonForConfidentialStatus VARCHAR(500) null,
	nonConfidentialSummary VARCHAR(500) null,
	caseId VARCHAR(500) null,
	status INTEGER,
	icmDocumentPath VARCHAR(500) null,
	applicationNumber VARCHAR(75) null,
	expiredLicenseAppNumber VARCHAR(75) null,
	pdfFileEntryId LONG,
	appCurrentStageName VARCHAR(75) null
);

create table nbp_jadsc_certif_servic (
	uuid_ VARCHAR(75) null,
	jadscCOSId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	docSubmitDate DATE null,
	signatoryName VARCHAR(75) null,
	signatoryDate DATE null,
	signatoryTelephone VARCHAR(75) null,
	signatoryFax VARCHAR(75) null,
	jadscApplicationId LONG
);

create table nbp_jadsc_certif_servic_add (
	uuid_ VARCHAR(75) null,
	jadscCOSId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	docServeCom VARCHAR(75) null,
	docServeAddress VARCHAR(75) null,
	docServeName VARCHAR(75) null,
	counter VARCHAR(75) null,
	jadscApplicationId LONG
);

create table nbp_jadsc_certif_verasity (
	uuid_ VARCHAR(75) null,
	jadscCOVId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	veracityComName VARCHAR(75) null,
	veracityComPosition VARCHAR(75) null,
	veracityComCompany VARCHAR(75) null,
	veracitySignedDate DATE null,
	veracitySignedTelephone VARCHAR(75) null,
	veracitySignedFax VARCHAR(75) null,
	veracitySignedAddress VARCHAR(75) null,
	jadscApplicationId LONG
);

create table nbp_jadsc_checklist_add (
	uuid_ VARCHAR(75) null,
	jADSCChecklistAddId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	AddItem VARCHAR(75) null,
	counter VARCHAR(75) null,
	jadscApplicationId LONG
);

create table nbp_jadsc_checklist_info (
	uuid_ VARCHAR(75) null,
	jadscChecklistId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	informationRegComplaint TEXT null,
	selectedChecklistValues TEXT null,
	description VARCHAR(75) null,
	jadscApplicationId LONG
);

create table nbp_jadsc_current_stage (
	uuid_ VARCHAR(75) null,
	jadscCurrentStageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	currentStage VARCHAR(75) null,
	lastFormStep VARCHAR(75) null,
	jadscApplicationId LONG
);

create table nbp_jadsc_info_request (
	uuid_ VARCHAR(75) null,
	jadscInfoRequestId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	entityId VARCHAR(75) null,
	companyName VARCHAR(75) null,
	address VARCHAR(75) null,
	mainTelephone VARCHAR(75) null,
	officeTelephone VARCHAR(75) null,
	cellTelephone VARCHAR(75) null,
	otherContact VARCHAR(75) null,
	whatsappTelephone VARCHAR(75) null,
	emailContact VARCHAR(75) null,
	contactPerName VARCHAR(75) null,
	contactPerPosition VARCHAR(75) null,
	contactPerPhone VARCHAR(75) null,
	contactPerEmail VARCHAR(75) null,
	altContactPerName VARCHAR(75) null,
	altContactPerPosition VARCHAR(75) null,
	altContactPerPhone VARCHAR(75) null,
	altContactPerEmail VARCHAR(75) null,
	comOperationYear VARCHAR(75) null,
	products VARCHAR(75) null,
	marketSharePer VARCHAR(75) null,
	tradeRemedyMeasure TEXT null,
	fiveYearsInvestment VARCHAR(75) null,
	planCapacity VARCHAR(75) null,
	growthProjection VARCHAR(75) null,
	jadscApplicationId LONG
);

create table nbp_jadsc_notic_of_appr_info (
	uuid_ VARCHAR(75) null,
	jadscNOAId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	fullName VARCHAR(75) null,
	addressOne VARCHAR(75) null,
	date_ DATE null,
	name VARCHAR(75) null,
	firm VARCHAR(75) null,
	address VARCHAR(75) null,
	telephone VARCHAR(75) null,
	jadscApplicationId LONG
);

create table nbp_jadsc_oath_request (
	uuid_ VARCHAR(75) null,
	jadscOathRequestId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	investigationType VARCHAR(75) null,
	partyName VARCHAR(75) null,
	requestReason VARCHAR(75) null,
	comOfficial VARCHAR(75) null,
	signatureDate DATE null,
	jadscApplicationId LONG
);