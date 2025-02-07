create table ManuAdditionalCompanyInfo (
	manuAdditionalCompanyInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	companyNameRepresentative VARCHAR(75) null,
	companySignatureRepresentative VARCHAR(75) null,
	signatureDate VARCHAR(75) null,
	customBrokerName VARCHAR(75) null,
	customBrokerAddress VARCHAR(75) null,
	telephoneNumber VARCHAR(75) null,
	brokerId VARCHAR(75) null,
	manufacturingApplicationId LONG
);

create table ManuCompanyInfo (
	manuCompanyInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	companyName VARCHAR(75) null,
	directorName VARCHAR(75) null,
	businessAddress VARCHAR(75) null,
	tccNumber VARCHAR(75) null,
	incorporationDate VARCHAR(75) null,
	factoryAddress VARCHAR(75) null,
	telephoneNumber VARCHAR(75) null,
	emailAddress VARCHAR(75) null,
	companyWebsite VARCHAR(75) null,
	manufacturingApplicationId LONG
);

create table ManuEquipment (
	manuEquipmentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	equipmentImported VARCHAR(75) null,
	land VARCHAR(75) null,
	equipment VARCHAR(75) null,
	building VARCHAR(75) null,
	Other VARCHAR(75) null,
	equipmentName VARCHAR(75) null,
	jamaicanDollor VARCHAR(75) null,
	capitalExpenditure VARCHAR(75) null,
	equipmentMaintained VARCHAR(75) null,
	equipmentCreated VARCHAR(75) null,
	skilledEmp VARCHAR(75) null,
	clericalEmp VARCHAR(75) null,
	otherEmp VARCHAR(75) null,
	totalEmp VARCHAR(75) null,
	manufacturingApplicationId LONG
);

create table ManuExportData (
	manuExportDataId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	companyInvolved VARCHAR(75) null,
	itemsName VARCHAR(75) null,
	quantity VARCHAR(75) null,
	monetary VARCHAR(75) null,
	countryName VARCHAR(75) null,
	manufacturingApplicationId LONG
);

create table ManuInternationalCertificate (
	manuInternationalCertificateId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	companyCertified VARCHAR(75) null,
	other VARCHAR(75) null,
	manufacturingApplicationId LONG
);

create table ManufacturingApplication (
	manufacturingApplicationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	requestType VARCHAR(75) null,
	licenseRequest VARCHAR(75) null,
	licenseCategory VARCHAR(75) null,
	licenseSubCategory VARCHAR(75) null,
	parish VARCHAR(75) null
);

create table PackagingProcess (
	packagingProcessId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	packagingProcess VARCHAR(75) null,
	manufacturingApplicationId LONG
);

create table ProductionProcess (
	productionProcessId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	productionProcess VARCHAR(75) null,
	manufacturingApplicationId LONG
);

create table ProductiveInputsForm (
	productiveInputsFormId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	categoryOfGoods VARCHAR(75) null,
	manufactureProducts VARCHAR(75) null,
	proposedProducts VARCHAR(75) null,
	tariffCode VARCHAR(75) null,
	manufactureItem VARCHAR(75) null,
	rawMaterialPurchased VARCHAR(75) null,
	manufacturingApplicationId LONG
);

create table nbp_manu_com_Info_Address (
	manuCompanyInfoAddressId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	factoryAddress VARCHAR(500) null,
	telephoneNumber VARCHAR(75) null,
	emailAddress VARCHAR(75) null,
	companyWebsite VARCHAR(75) null,
	parish VARCHAR(75) null,
	counter VARCHAR(75) null,
	manufacturingApplicationId LONG,
	manuCompanyInfoId LONG
);

create table nbp_manu_equipment_Add (
	manuEquipmentAddId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	equipmentName VARCHAR(500) null,
	jamaicanDollor VARCHAR(75) null,
	counter VARCHAR(75) null,
	manufacturingApplicationId LONG,
	manuEquipmentId LONG
);

create table nbp_manu_inter_certificate (
	manuInternationalCertificateId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	companyCertified VARCHAR(75) null,
	other VARCHAR(75) null,
	manufacturingApplicationId LONG
);

create table nbp_manu_pro_input_add (
	productiveInputsFormAddId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	processType VARCHAR(75) null,
	tariffCode VARCHAR(75) null,
	manufactureItem VARCHAR(75) null,
	importedCaricom VARCHAR(75) null,
	counter VARCHAR(75) null,
	manufacturingApplicationId LONG,
	productiveInputsFormId LONG
);

create table nbp_manu_productive_Inputsform (
	productiveInputsFormId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	categoryOfGoods VARCHAR(75) null,
	manufactureProducts VARCHAR(500) null,
	proposedProducts VARCHAR(500) null,
	processType VARCHAR(75) null,
	tariffCode VARCHAR(75) null,
	manufactureItem VARCHAR(75) null,
	importedCaricom VARCHAR(75) null,
	rawMaterialPurchased VARCHAR(500) null,
	manufacturingApplicationId LONG
);

create table nbp_manufacture_add_comp_info (
	manuAdditionalCompanyInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	companyNameRepresentative VARCHAR(75) null,
	companySignatureRepresentative VARCHAR(75) null,
	signatureDate DATE null,
	customBrokerName VARCHAR(75) null,
	customBrokerAddress VARCHAR(500) null,
	telephoneNumber VARCHAR(75) null,
	brokerId VARCHAR(75) null,
	manufacturingApplicationId LONG
);

create table nbp_manufacture_application (
	manufacturingApplicationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	entityId VARCHAR(75) null,
	requestType VARCHAR(75) null,
	licenseRequest VARCHAR(75) null,
	licenseCategory VARCHAR(500) null,
	licenseSubCategory VARCHAR(800) null,
	parish VARCHAR(75) null,
	status INTEGER,
	applicationNumber VARCHAR(75) null,
	expiredLicenseAppNumber VARCHAR(75) null,
	caseId VARCHAR(500) null,
	icmDocumentsPath VARCHAR(500) null,
	pdfFileEntryId LONG,
	dateOfExpiration DATE null,
	appCurrentStageName VARCHAR(75) null
);

create table nbp_manufacture_company_info (
	manuCompanyInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	companyName VARCHAR(75) null,
	directorName VARCHAR(500) null,
	businessAddress VARCHAR(500) null,
	tccNumber VARCHAR(75) null,
	incorporationDate DATE null,
	factoryAddress VARCHAR(500) null,
	telephoneNumber VARCHAR(75) null,
	emailAddress VARCHAR(75) null,
	companyWebsite VARCHAR(75) null,
	applicantTRN VARCHAR(75) null,
	beneficieryTRN VARCHAR(75) null,
	parish VARCHAR(75) null,
	manufacturingApplicationId LONG
);

create table nbp_manufacture_equipment (
	manuEquipmentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	equipmentImported VARCHAR(500) null,
	land VARCHAR(75) null,
	equipment VARCHAR(75) null,
	building VARCHAR(75) null,
	Other VARCHAR(75) null,
	equipmentName VARCHAR(500) null,
	jamaicanDollor VARCHAR(75) null,
	capitalExpenditure VARCHAR(75) null,
	nameOFPurpose VARCHAR(75) null,
	equipmentMaintained VARCHAR(75) null,
	equipmentCreated VARCHAR(75) null,
	skilledEmp VARCHAR(75) null,
	clericalEmp VARCHAR(75) null,
	otherEmp VARCHAR(75) null,
	totalEmp VARCHAR(75) null,
	manufacturingApplicationId LONG
);

create table nbp_manufacture_export_data (
	manuExportDataId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	companyInvolved VARCHAR(75) null,
	itemsName VARCHAR(75) null,
	quantity VARCHAR(75) null,
	monetary VARCHAR(75) null,
	countryName VARCHAR(500) null,
	manufacturingApplicationId LONG
);

create table nbp_manufacture_packaging_pro (
	packagingProcessId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	packagingProcess VARCHAR(500) null,
	manufacturingApplicationId LONG
);

create table nbp_manufacture_production_pro (
	productionProcessId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	productionProcess VARCHAR(500) null,
	manufacturingApplicationId LONG
);

create table nbp_manufacture_stage (
	manuApplicationCuurentStageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	currentStage VARCHAR(75) null,
	lastFormDetailsStep VARCHAR(75) null,
	manufacturingApplicationId LONG
);