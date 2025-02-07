create table nbp_comapny_director_info (
	creativeComDirectorInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	directorFullName VARCHAR(75) null,
	directorTitle VARCHAR(75) null,
	directorTrn VARCHAR(75) null,
	telephoneNumber VARCHAR(75) null,
	faxNumber VARCHAR(75) null,
	emailAddress VARCHAR(75) null,
	socialMedia VARCHAR(75) null,
	profileName VARCHAR(75) null,
	isOperatorDifferentFromOwner VARCHAR(75) null,
	operatorFirstName VARCHAR(75) null,
	operatorMiddleName VARCHAR(75) null,
	operatorLastName VARCHAR(75) null,
	city VARCHAR(75) null,
	country VARCHAR(75) null,
	sex VARCHAR(75) null,
	trn VARCHAR(75) null,
	cell VARCHAR(75) null,
	email VARCHAR(75) null,
	CreativeApplicationId LONG
);

create table nbp_creactive_company_dia (
	creativeComDirectorAddressId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	streetAddress VARCHAR(500) null,
	streetAddressLineTwo VARCHAR(500) null,
	CreativeApplicationId LONG,
	creativeComDirectorInfoId LONG
);

create table nbp_creative_application (
	uuid_ VARCHAR(75) null,
	CreativeApplicationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	entityId VARCHAR(75) null,
	practitionerStatus VARCHAR(75) null,
	eRegistryNumber VARCHAR(75) null,
	entertainerType VARCHAR(75) null,
	IndividualType VARCHAR(75) null,
	companyType VARCHAR(75) null,
	primaryCategory VARCHAR(75) null,
	mainCategories VARCHAR(75) null,
	status INTEGER,
	applicationNumber VARCHAR(75) null,
	caseId VARCHAR(500) null,
	icmDocumentsPath VARCHAR(500) null,
	pdfFileEntryId LONG,
	appCurrentStageName VARCHAR(75) null
);

create table nbp_creative_com_appli_info (
	creativeCompanyApplicantInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	prefix VARCHAR(75) null,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	sex VARCHAR(75) null,
	trn VARCHAR(75) null,
	countryOfResidence VARCHAR(75) null,
	nationality VARCHAR(75) null,
	cell VARCHAR(75) null,
	email VARCHAR(75) null,
	CreativeApplicationId LONG
);

create table nbp_creative_com_detail_addres (
	creativeComDetailsAddressId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	addressType VARCHAR(75) null,
	streetAddress VARCHAR(500) null,
	streetAddressLineTwo VARCHAR(500) null,
	city VARCHAR(75) null,
	country VARCHAR(75) null,
	CreativeApplicationId LONG,
	creativeCompanyDetailsId LONG
);

create table nbp_creative_com_eco_effect (
	creativeComEconomicEffectId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	assessmentcountryOfOrigin VARCHAR(75) null,
	ssessmentjointVenture VARCHAR(75) null,
	assessmentLocal VARCHAR(75) null,
	assessmentForeign VARCHAR(75) null,
	shareJmd VARCHAR(75) null,
	shareExchangeRate VARCHAR(75) null,
	shareUsd VARCHAR(75) null,
	localJmd VARCHAR(75) null,
	localExchangeRate VARCHAR(75) null,
	localUsd VARCHAR(75) null,
	otherJmd VARCHAR(75) null,
	otherExchangeRate VARCHAR(75) null,
	OtherUsd VARCHAR(75) null,
	permanentLocalMale VARCHAR(75) null,
	permanentLocalFemale VARCHAR(75) null,
	permanentForeignMale VARCHAR(75) null,
	permanentForeignFemale VARCHAR(75) null,
	temporaryLocalMale VARCHAR(75) null,
	temporaryLocalFemale VARCHAR(75) null,
	temporaryForeignMale VARCHAR(75) null,
	temporaryForgeignFemale VARCHAR(75) null,
	totalLocalMale VARCHAR(75) null,
	totalLocalFemale VARCHAR(75) null,
	totalForeignMale VARCHAR(75) null,
	totalForeignFemale VARCHAR(75) null,
	CreativeApplicationId LONG
);

create table nbp_creative_company_detail (
	creativeCompanyDetailsId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	companyName VARCHAR(75) null,
	companyBusinessRegistrationNo VARCHAR(75) null,
	dateOfCompanyRegistration DATE null,
	companyTrn VARCHAR(75) null,
	companyTcc VARCHAR(75) null,
	companyProfile VARCHAR(75) null,
	CreativeApplicationId LONG
);

create table nbp_creative_company_gen_info (
	creativeCompanyGeneralInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	HaveYouRecievedAny VARCHAR(75) null,
	mprsStartDate DATE null,
	mprsEndDate DATE null,
	mttStartDate DATE null,
	mttEndDate DATE null,
	CreativeApplicationId LONG
);

create table nbp_creative_contact_box (
	creativeContactBoxId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	contactTelephone VARCHAR(75) null,
	contactFax VARCHAR(75) null,
	contactEmailAddress VARCHAR(75) null,
	counterContact VARCHAR(75) null,
	CreativeApplicationId LONG
);

create table nbp_creative_current_stage (
	creativeAppliCurrentStageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	currentStage VARCHAR(75) null,
	lastFormStep VARCHAR(75) null,
	CreativeApplicationId LONG
);

create table nbp_creative_director_box (
	creativeDirectorBoxId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	fullName VARCHAR(75) null,
	title VARCHAR(75) null,
	trn VARCHAR(75) null,
	directorCountre VARCHAR(75) null,
	CreativeApplicationId LONG
);

create table nbp_creative_economic_effect (
	creativeIndiEcoEffectId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	shareCapitalJmd VARCHAR(75) null,
	shareCapitalExchangeRate VARCHAR(75) null,
	shareCapitalUsd VARCHAR(75) null,
	localCapitalJmd VARCHAR(75) null,
	localCapitalExchangeRate VARCHAR(75) null,
	localCapitalUsd VARCHAR(75) null,
	otherJmd VARCHAR(75) null,
	otherExchangeRate VARCHAR(75) null,
	otherUsd VARCHAR(75) null,
	estimatedLocalExpenditure VARCHAR(75) null,
	otherEstimatedLocal  VARCHAR(75) null,
	annualYearOne VARCHAR(75) null,
	annualOneUsd VARCHAR(75) null,
	annualYearTwo VARCHAR(75) null,
	annualTwoUsd VARCHAR(75) null,
	annualYearThree VARCHAR(75) null,
	annualThreeUsd VARCHAR(75) null,
	targetMarketLocal VARCHAR(75) null,
	targetMarketForeign VARCHAR(75) null,
	targetMarketCountries VARCHAR(75) null,
	declareInformationProvide VARCHAR(75) null,
	CreativeApplicationId LONG
);

create table nbp_creative_ida (
	creativeIndiDetailsAddressId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	streetAddress VARCHAR(500) null,
	streetAddressLineTwo VARCHAR(500) null,
	CreativeApplicationId LONG,
	creativeIndividualDetailsId LONG
);

create table nbp_creative_indi_general_info (
	creativeIndiGeneralInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	profile VARCHAR(75) null,
	CreativeApplicationId LONG
);

create table nbp_creative_individual_detail (
	creativeIndividualDetailsId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	sectorOfPractice VARCHAR(75) null,
	firstName VARCHAR(75) null,
	middleName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	trn VARCHAR(75) null,
	city VARCHAR(75) null,
	country VARCHAR(75) null,
	sex VARCHAR(75) null,
	cell VARCHAR(75) null,
	email VARCHAR(75) null,
	areYouStudent VARCHAR(75) null,
	companyEmail VARCHAR(75) null,
	companyWebsite VARCHAR(75) null,
	CreativeApplicationId LONG
);

create table nbp_creative_social_box (
	creativeSocialBoxId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	socialMedia VARCHAR(75) null,
	profileName VARCHAR(75) null,
	counterSocislMedia VARCHAR(75) null,
	CreativeApplicationId LONG
);