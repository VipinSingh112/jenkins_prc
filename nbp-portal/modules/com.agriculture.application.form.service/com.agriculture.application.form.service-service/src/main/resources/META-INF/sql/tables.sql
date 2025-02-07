create table agriculture_apiculture (
	agricultureApicultureId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	apicultureType VARCHAR(75) null,
	numberOfColonies VARCHAR(75) null,
	averageAnnualProduction VARCHAR(75) null,
	marketLocal VARCHAR(75) null,
	marketForeign VARCHAR(75) null,
	valueOfSale VARCHAR(75) null,
	apicultureCounter VARCHAR(75) null,
	agricultureApplicationId LONG
);

create table agriculture_application (
	agricultureApplicationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	entityId VARCHAR(75) null,
	registrationStatus VARCHAR(75) null,
	farmLicenseNumber VARCHAR(75) null,
	requestType VARCHAR(75) null,
	primaryProduct VARCHAR(500) null,
	status INTEGER,
	applicationNumber VARCHAR(75) null,
	expiredLicenseAppNo VARCHAR(75) null,
	caseId VARCHAR(500) null,
	icmDocumentsPath VARCHAR(500) null,
	pdfFileEntryId LONG,
	appCurrentStageName VARCHAR(75) null
);

create table agriculture_aqaculture (
	agricultureAquacultureId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	aquacultureType VARCHAR(75) null,
	waterHectare VARCHAR(75) null,
	averageAnnualProduction VARCHAR(75) null,
	marketLocal VARCHAR(75) null,
	marketForeign VARCHAR(75) null,
	valueOfSale VARCHAR(75) null,
	aquacultureCounter VARCHAR(75) null,
	agricultureApplicationId LONG
);

create table agriculture_building (
	agricultureBuildingId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	buildingPurpose VARCHAR(500) null,
	buildingSize VARCHAR(75) null,
	machineryDescription VARCHAR(500) null,
	dateOfAcquisition DATE null,
	buildingCost VARCHAR(75) null,
	presentBookValue VARCHAR(75) null,
	buildingCounter VARCHAR(75) null,
	agricultureApplicationId LONG
);

create table agriculture_crop (
	agricultureCropId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	cropType VARCHAR(75) null,
	cropHectare VARCHAR(75) null,
	averageAnnualProduction VARCHAR(75) null,
	cropMarketLocal VARCHAR(75) null,
	cropMarketForeign VARCHAR(75) null,
	valueOfSale VARCHAR(75) null,
	cropCounter VARCHAR(75) null,
	agricultureApplicationId LONG
);

create table agriculture_farm (
	agricultureFarmId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	locationOfFarm VARCHAR(75) null,
	landTenure VARCHAR(75) null,
	numberOfHectares VARCHAR(75) null,
	numberOfYears VARCHAR(75) null,
	numberOfParcels VARCHAR(75) null,
	sizeOfParcel VARCHAR(75) null,
	topography VARCHAR(75) null,
	numberOF VARCHAR(75) null,
	farmCounter VARCHAR(75) null,
	agricultureApplicationId LONG
);

create table agriculture_farmer (
	agricultueFarmerId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	farmerDetail VARCHAR(75) null,
	nameOfApplicant VARCHAR(75) null,
	nameOfFarm VARCHAR(75) null,
	nameOfProprietor VARCHAR(75) null,
	parishAddress VARCHAR(500) null,
	localAddress VARCHAR(500) null,
	taxpayerRegistrationNumber VARCHAR(75) null,
	farmerRegistrationNumber VARCHAR(75) null,
	dateOfIncorporation DATE null,
	telephoneNumber VARCHAR(75) null,
	emailAddress VARCHAR(75) null,
	agricultureApplicationId LONG
);

create table agriculture_forestry (
	agriultureForestryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	forestryType VARCHAR(75) null,
	forestryHectare VARCHAR(75) null,
	averageAnnulaProduction VARCHAR(75) null,
	forestryMarketLocal VARCHAR(75) null,
	forestryMarketForeign VARCHAR(75) null,
	valueOfSale VARCHAR(75) null,
	forestryCounter VARCHAR(75) null,
	agricultureApplicationId LONG
);

create table agriculture_livestock (
	agricultureLivestockId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	livestockType VARCHAR(75) null,
	numberOFAnimalsByCategory VARCHAR(75) null,
	averageAnnualProduction VARCHAR(75) null,
	livestockMarketlocal VARCHAR(75) null,
	livestockMarketForeign VARCHAR(75) null,
	valueOfSale VARCHAR(75) null,
	Livestockcounter VARCHAR(75) null,
	agricultureApplicationId LONG
);

create table agriculture_ornamental (
	agricultureOrnamentalId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ornamentalType VARCHAR(75) null,
	ornamentalProduceArea VARCHAR(75) null,
	averageAnnualProduction VARCHAR(75) null,
	ornamentalMarketLocal VARCHAR(75) null,
	ornamentalMarketForeign VARCHAR(75) null,
	valueOfSale VARCHAR(75) null,
	ornamentalCounter VARCHAR(75) null,
	agricultureApplicationId LONG
);

create table agriculture_poultry (
	agriculturePoultryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	poultryType VARCHAR(75) null,
	numberOFBirdsByCategory VARCHAR(75) null,
	averageAnnualProduction VARCHAR(75) null,
	poultryMarketLocal VARCHAR(75) null,
	poultryMarketForeign VARCHAR(75) null,
	valueOfSale VARCHAR(75) null,
	poultryCounter VARCHAR(75) null,
	agricultureApplicationId LONG
);

create table nbp_agriculture_stage (
	agriApplicationCurrentStageId LONG not null primary key,
	agricultureStageId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	currentStage VARCHAR(75) null,
	lastFormStage VARCHAR(75) null,
	agricultureApplicationId LONG
);