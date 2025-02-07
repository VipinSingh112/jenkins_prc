create table nbp_factories_app_payment (
	factoriesAppPaymentId LONG not null primary key,
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
	factoriesApplicationId LONG
);

create table nbp_factories_application (
	factoriesApplicationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	entityId VARCHAR(75) null,
	status INTEGER,
	applicationNumber VARCHAR(75) null,
	caseId VARCHAR(500) null,
	expiredLicenseAppNumber VARCHAR(75) null,
	icmDocumentPath VARCHAR(500) null,
	productCategory VARCHAR(1000) null,
	areYouProcessing VARCHAR(75) null,
	typeOfTransaction VARCHAR(75) null,
	pdfFileEntryId LONG,
	appCurrentStageName VARCHAR(75) null
);

create table nbp_factories_current_stage (
	uuid_ VARCHAR(75) null,
	factoriesCurrentStageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	currentStage VARCHAR(75) null,
	lastFormStep VARCHAR(75) null,
	factoriesApplicationId LONG
);

create table nbp_factories_pro_food_act (
	factoriesProcessedFoodActId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	processedActEstablishmentName VARCHAR(75) null,
	processedActParishAddress VARCHAR(500) null,
	processedActAddress VARCHAR(500) null,
	processedActOperatorName VARCHAR(75) null,
	processedActOperatorAddress VARCHAR(500) null,
	processedActParish VARCHAR(75) null,
	processedActDescription VARCHAR(75) null,
	establishmentOperated VARCHAR(75) null,
	processedActLastDate DATE null,
	processedActManufactured VARCHAR(500) null,
	processedActDate DATE null,
	factoriesApplicationId LONG
);

create table nbp_factories_product_det (
	factoriesProductDetailsAddId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	productBrand VARCHAR(75) null,
	product VARCHAR(75) null,
	productSize VARCHAR(75) null,
	productMeasurementVal VARCHAR(75) null,
	counter VARCHAR(75) null,
	factoriesApplicationId LONG
);

create table nbp_factories_stand_act_info (
	factoriesStandardActId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	standardsActEstablishmentName VARCHAR(75) null,
	standardsActAddParish VARCHAR(75) null,
	standardsActAddress VARCHAR(500) null,
	standardsActTel VARCHAR(75) null,
	standardsActWhatsAppNum VARCHAR(75) null,
	standardsActEmail VARCHAR(75) null,
	standardsActFaxNum VARCHAR(75) null,
	standardsActOperatorName VARCHAR(75) null,
	standardsActOperatorAddress VARCHAR(500) null,
	standardsActParish VARCHAR(75) null,
	standardsActOperatorTel VARCHAR(75) null,
	standardActProductManufactured VARCHAR(75) null,
	standardActBrandManufactured VARCHAR(75) null,
	standardsActProductSize VARCHAR(75) null,
	standardsActLastDate DATE null,
	standardsActPurpose VARCHAR(500) null,
	standardsActDate DATE null,
	establishmentBefore VARCHAR(75) null,
	factoriesApplicationId LONG
);