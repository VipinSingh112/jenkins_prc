create table nbp_pharma_app_payment (
	pharmaApplicationPaymentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	paymentMethod VARCHAR(75) null,
	paymentDocId VARCHAR(75) null,
	paymentStatus VARCHAR(75) null,
	paymentFee VARCHAR(75) null,
	amountPaid VARCHAR(75) null,
	amountCurrency VARCHAR(75) null,
	transactionNumber VARCHAR(75) null,
	pharmaApplicationId LONG
);

create table nbp_pharma_application (
	pharmaApplicationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	entityId VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	requesttype VARCHAR(75) null,
	typeOfPharmaProduct VARCHAR(75) null,
	typeOfPharmaDrug VARCHAR(75) null,
	secondaryCategory VARCHAR(75) null,
	typeOfProduct VARCHAR(75) null,
	subCategoryFirstField VARCHAR(75) null,
	subCategorySecondField VARCHAR(75) null,
	status INTEGER,
	applicationNumber VARCHAR(75) null,
	caseld VARCHAR(500) null,
	icmDocumentsPath VARCHAR(500) null,
	pdfFileEntryId LONG,
	expiredLicenseAppNumber VARCHAR(75) null,
	appCurrentStageName VARCHAR(75) null
);

create table nbp_pharma_cancel (
	pharmaCancellationFormId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nameOfLicenseHolder VARCHAR(75) null,
	dateOfRecall DATE null,
	initiatedBy VARCHAR(75) null,
	licenseNumber VARCHAR(75) null,
	pharmaApplicationId LONG
);

create table nbp_pharma_current_stage (
	pharmaCurrentStageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	currentStage VARCHAR(75) null,
	lastFormStage VARCHAR(75) null,
	pharmaApplicationId LONG
);

create table nbp_pharma_doc_list (
	pharmaDocListId LONG not null primary key,
	pharmaAppType VARCHAR(75) null,
	pharmaDocList VARCHAR(500) null
);

create table nbp_pharma_drug_Info (
	pharmaDrugInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	pharmaDrugBrandName VARCHAR(200) null,
	pharmaDrugDeisgnation VARCHAR(75) null,
	pharmaDosageForm VARCHAR(75) null,
	pharmaAdministrationRoute VARCHAR(75) null,
	pharmaOriginDispensing VARCHAR(75) null,
	pharmaLicenseHolderName VARCHAR(200) null,
	pharmaLicenseHolderAddress VARCHAR(500) null,
	pharmaApplicationId LONG
);

create table nbp_pharma_manufacturer (
	pharmaManufacturerInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	pharmaDrugManufacturerName VARCHAR(200) null,
	pharmaDrugManufacturerAdd VARCHAR(500) null,
	pharmaDrugDeisgnation VARCHAR(75) null,
	pharmaMarketAuthName VARCHAR(200) null,
	pharmaMarketAuthAddress VARCHAR(500) null,
	pharmaReguOfficerName VARCHAR(200) null,
	pharmaReguOfficerContact VARCHAR(75) null,
	pharmaDrugApplicName VARCHAR(200) null,
	pharmaDrugApplicAddress VARCHAR(500) null,
	pharmaLocalReprName VARCHAR(200) null,
	pharmaLocalReprContact VARCHAR(75) null,
	pharmaLocalReprAdd VARCHAR(500) null,
	pharmaLocalDistName VARCHAR(200) null,
	pharmaLocalDistAddress VARCHAR(500) null,
	pharmaLocalDistContact VARCHAR(75) null,
	pharmaApplicationId LONG
);

create table nbp_pharma_medical_device (
	pharmaMedicalDeviceId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	pharmaDeviceName VARCHAR(200) null,
	pharmaDeviceDeisgnation VARCHAR(75) null,
	pharmaManufacturerName VARCHAR(200) null,
	pharmaManufacturerAddress VARCHAR(500) null,
	pharmaMedicalApplicantName VARCHAR(200) null,
	pharmaMedicalApplicantAddress VARCHAR(500) null,
	pharmaRepresentativeName VARCHAR(200) null,
	pharmaRepresentativeAddress VARCHAR(500) null,
	pharmaApplicationId LONG
);

create table nbp_pharma_recall (
	pharmaRecallFormId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nameOfLicenseHolder VARCHAR(75) null,
	dateOfRecall DATE null,
	initiatedBy VARCHAR(75) null,
	typeOfRecall VARCHAR(75) null,
	licenseNumber VARCHAR(75) null,
	pharmaApplicationId LONG
);

create table nbp_pharma_sub_categories (
	pharmaSubCategoriesMappingId LONG not null primary key,
	pharmaSubCategory VARCHAR(75) null,
	pharmaSubCategoryMapValue VARCHAR(75) null
);