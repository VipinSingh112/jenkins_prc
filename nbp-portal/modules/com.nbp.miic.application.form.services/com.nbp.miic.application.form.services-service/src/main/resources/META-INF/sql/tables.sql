create table nbp_miic_Suspension (
	miicSuspensionOfCetId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	indicationOfUrgency VARCHAR(75) null,
	requestForSuspension VARCHAR(75) null,
	evidenceOfInability VARCHAR(75) null,
	evidenceOfConsultation VARCHAR(75) null,
	evidenceOfConsultationForeign VARCHAR(75) null,
	nameOfAuthorizedPersonnel VARCHAR(75) null,
	miicApplicationId LONG
);

create table nbp_miic_app_stage (
	miicApplicationCurrentStageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	currentStage VARCHAR(75) null,
	lastFormStep VARCHAR(75) null,
	miicApplicationId LONG
);

create table nbp_miic_applicant_details (
	miicApplicantDetailsId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	natureOfApplicant VARCHAR(75) null,
	applicantName  VARCHAR(75) null,
	address VARCHAR(500) null,
	email VARCHAR(75) null,
	telephone VARCHAR(75) null,
	dateOfApplication DATE null,
	trnNumber VARCHAR(75) null,
	miicApplicationId LONG,
	nameOfProducer VARCHAR(75) null,
	companyName VARCHAR(75) null,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null
);

create table nbp_miic_application (
	uuid_ VARCHAR(75) null,
	miicApplicationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	miicApplication VARCHAR(75) null,
	typeOfManufacturer  VARCHAR(75) null,
	typeOfTransaction VARCHAR(75) null,
	caseId VARCHAR(500) null,
	status INTEGER,
	icmDocumentPath VARCHAR(500) null,
	applicationNumber VARCHAR(75) null,
	expiredLicenseAppNumber VARCHAR(75) null,
	pdfFileEntryId LONG,
	appCurrentStageName VARCHAR(75) null,
	entityId VARCHAR(75) null
);

create table nbp_miic_payment (
	miicPaymentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	miicApplicationId LONG
);

create table nbp_miic_safeguard_good (
	miicSafeguardGoodAddId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	tariffHeadingNum VARCHAR(75) null,
	description VARCHAR(500) null,
	amountQuantity VARCHAR(75) null,
	amountEstimate VARCHAR(75) null,
	resonForRequest VARCHAR(75) null,
	counter VARCHAR(75) null,
	miicApplicationId LONG
);

create table nbp_miic_safeguard_material (
	miicSafeguardMaterialAddId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nameOfProducer VARCHAR(75) null,
	addressOfProducer  VARCHAR(500) null,
	description VARCHAR(75) null,
	tariffHeadingNum VARCHAR(75) null,
	amount VARCHAR(75) null,
	quantity VARCHAR(75) null,
	technologySpecification VARCHAR(75) null,
	periodOfImportationFrom DATE null,
	periodOfImportationTo DATE null,
	counter VARCHAR(75) null,
	miicApplicationId LONG
);

create table nbp_miic_suspension_of_cet (
	miicSuspensionOfCetAddId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	tariffHeadingNum  VARCHAR(75) null,
	address VARCHAR(75) null,
	description VARCHAR(500) null,
	amountQuantity VARCHAR(75) null,
	amountEstimateInUs VARCHAR(75) null,
	technologySpecification VARCHAR(75) null,
	cetRate VARCHAR(75) null,
	rateProposed VARCHAR(75) null,
	periodOfRateChangeFrom DATE null,
	periodOfRateChangeTo DATE null,
	indicationOfUrgency VARCHAR(75) null,
	requestForSuspensionOfRate VARCHAR(75) null,
	evidenceOfInability VARCHAR(75) null,
	evidenceOfConsultation VARCHAR(75) null,
	counter VARCHAR(75) null,
	miicApplicationId LONG
);