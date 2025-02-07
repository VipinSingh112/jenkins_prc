create table nbp_fire_app_payment (
	fireBrigadeAppPaymentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	paymentMethod VARCHAR(75) null,
	paymentFee VARCHAR(75) null,
	amountPaid VARCHAR(75) null,
	amountCurrency VARCHAR(75) null,
	fireBrigadeApplicationId LONG
);

create table nbp_fire_app_stage (
	fireBrigadeAppliCurrentStageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	currentStage VARCHAR(75) null,
	lastFormStep VARCHAR(75) null,
	fireBrigadeApplicationId LONG
);

create table nbp_fire_brigade_application (
	uuid_ VARCHAR(75) null,
	fireBrigadeApplicationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	certificateType VARCHAR(75) null,
	typeOfTransaction VARCHAR(75) null,
	typeOfApplicant VARCHAR(75) null,
	typeOfPermises VARCHAR(75) null,
	purposeOfCertificate VARCHAR(75) null,
	parish VARCHAR(75) null,
	status INTEGER,
	applicationNumber VARCHAR(75) null,
	caseId VARCHAR(500) null,
	expiredLicenseNumber VARCHAR(75) null,
	icmDocumentsPath VARCHAR(500) null,
	pdfFileEntryId LONG,
	appCurrentStageName VARCHAR(75) null,
	entityId VARCHAR(75) null
);

create table nbp_fire_certi_purpose_info (
	fireBrigadeCerPurposeInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	certificatePurposePre VARCHAR(1000) null,
	otherCertificatePurpose VARCHAR(75) null,
	fireBrigadeApplicationId LONG
);

create table nbp_fire_hazar_sub_info (
	fireBrigadeHazardousSubInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	lpgCylinder VARCHAR(75) null,
	flammableGases VARCHAR(75) null,
	flammableCombustibleLiquid VARCHAR(75) null,
	chemicalsLiquid VARCHAR(75) null,
	chemicalsPowder VARCHAR(75) null,
	explosives VARCHAR(75) null,
	otherHazardousSubstance VARCHAR(75) null,
	fireBrigadeApplicationId LONG
);

create table nbp_fire_mul_floor_info (
	fireBrigadeMultFloorInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	floorAlternateExist VARCHAR(75) null,
	buildingRisingMain VARCHAR(75) null,
	equipmentConnection VARCHAR(75) null,
	buildingParkingGarage VARCHAR(75) null,
	fireBrigadeApplicationId LONG
);

create table nbp_fire_operator_detail (
	fireBrigadeOperatorDetailId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	operatorName VARCHAR(75) null,
	businessName VARCHAR(75) null,
	address VARCHAR(500) null,
	premisesUses VARCHAR(75) null,
	premisesOccupancy VARCHAR(75) null,
	premisesBusiness VARCHAR(75) null,
	maxWorkingPersons VARCHAR(75) null,
	maxNumPersonsAtAnyOneTime VARCHAR(75) null,
	fireBrigadeApplicationId LONG
);

create table nbp_fire_permises_info (
	fireBrigadePremisesInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	premises VARCHAR(75) null,
	premisesCertified VARCHAR(75) null,
	expirationDate DATE null,
	certificateNumber VARCHAR(75) null,
	name VARCHAR(75) null,
	Address VARCHAR(500) null,
	fireBrigadeApplicationId LONG
);

create table nbp_fire_pro_equipment_info (
	fireBrigadeProEquipmentInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	equipmentProtectionPre VARCHAR(1000) null,
	equipmentProtectionOne VARCHAR(75) null,
	equipmentProtectionTwo VARCHAR(75) null,
	equipmentProtectionThree VARCHAR(75) null,
	equipmentProtectionFour VARCHAR(75) null,
	equipmentProtectionFive VARCHAR(75) null,
	equipmentProtectionSix VARCHAR(75) null,
	otherEquipment VARCHAR(75) null,
	fireBrigadeApplicationId LONG
);

create table nbp_fire_signature_info (
	fireBrigadeSignatureInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	title VARCHAR(75) null,
	name VARCHAR(75) null,
	telephone VARCHAR(75) null,
	fax VARCHAR(75) null,
	trn VARCHAR(75) null,
	email VARCHAR(75) null,
	date_ DATE null,
	Address VARCHAR(500) null,
	fireBrigadeApplicationId LONG
);