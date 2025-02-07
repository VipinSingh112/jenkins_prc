create table nbp_renew_abstract_lic (
	renewLicAbstractAndWaterId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	renewName VARCHAR(75) null,
	renewContact VARCHAR(75) null,
	renewJobTitle VARCHAR(75) null,
	renewTelephoneNum VARCHAR(75) null,
	renewFaxNum VARCHAR(75) null,
	renewParishLocation VARCHAR(75) null,
	renewAddress VARCHAR(75) null,
	renewSourceName VARCHAR(75) null,
	renewDetailsParishAdd VARCHAR(75) null,
	renewDetailsLocation VARCHAR(75) null,
	renewAbstractionRate VARCHAR(75) null,
	renewDetailsUse VARCHAR(75) null,
	renewAbstractionMethod VARCHAR(75) null,
	attachedDevice VARCHAR(75) null,
	renewStateDevice VARCHAR(75) null,
	abstractionData VARCHAR(75) null,
	renewSignName VARCHAR(75) null,
	renewDate DATE null,
	wraApplicationId LONG
);

create table nbp_wra_abstract_info (
	abstractLicenceId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	applicationNum VARCHAR(75) null,
	nameOfApplicant VARCHAR(75) null,
	parishApplicant VARCHAR(75) null,
	mailingAddOfApplicant VARCHAR(1000) null,
	emailOfApplicant VARCHAR(75) null,
	officePhone VARCHAR(75) null,
	mobilePhone VARCHAR(75) null,
	homePhone VARCHAR(75) null,
	locationOfProposedParish VARCHAR(75) null,
	locationOfProParishWork VARCHAR(500) null,
	nameOfContractor VARCHAR(75) null,
	parishContractor VARCHAR(75) null,
	addressOfContractor VARCHAR(500) null,
	sourceOfWater VARCHAR(500) null,
	purposeWaterUse VARCHAR(500) null,
	areaAndCropType VARCHAR(75) null,
	systemOfIrrigation VARCHAR(75) null,
	meansOfDisposal VARCHAR(75) null,
	estimateDepthOfBorewell VARCHAR(75) null,
	diameterOfBorewell VARCHAR(75) null,
	artesianSupply VARCHAR(75) null,
	geologicalStrait VARCHAR(75) null,
	methodOfAbstractingWater VARCHAR(75) null,
	maxDailyQuant VARCHAR(75) null,
	typeOfAppratusProposed VARCHAR(75) null,
	otherInformation VARCHAR(75) null,
	requestToSupplyWater VARCHAR(500) null,
	authorityInformation VARCHAR(500) null,
	dateOfSign DATE null,
	wraApplicationId LONG
);

create table nbp_wra_app_payment (
	wraAppPaymentId LONG not null primary key,
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
	wraApplicationId LONG
);

create table nbp_wra_application (
	wraApplicationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	entityId DATE null,
	typeOfApplication VARCHAR(75) null,
	typeOfTransaction VARCHAR(75) null,
	typeOfPermit VARCHAR(75) null,
	typeOfTransacPermit VARCHAR(75) null,
	userWaterTypeCat VARCHAR(75) null,
	consumptiveSubCat VARCHAR(75) null,
	nonConsumptiveSubCat VARCHAR(75) null,
	industrialTypeSubCat VARCHAR(75) null,
	icmDocumentPath VARCHAR(500) null,
	status INTEGER,
	caseId VARCHAR(75) null,
	applicationNumber VARCHAR(75) null,
	pdfFileEntryId LONG,
	expiredLicenseAppNumber VARCHAR(75) null,
	appCurrentStageName VARCHAR(75) null
);

create table nbp_wra_current_stage (
	uuid_ VARCHAR(75) null,
	wraAppCurrentStageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	currentStage VARCHAR(75) null,
	lastFormStep VARCHAR(75) null,
	wraApplicationId LONG
);

create table nbp_wra_drill_well_info (
	drillAWellApplicationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	permitDrillApplicationNum VARCHAR(75) null,
	permitDrillingApplicantName VARCHAR(75) null,
	permitDrillingMailingAddParish VARCHAR(75) null,
	permitDrillingMailingAddress VARCHAR(500) null,
	permitDrillingEmailAddress VARCHAR(75) null,
	permitDrillingOfficePhone VARCHAR(75) null,
	permitDrillingMobilePhone VARCHAR(75) null,
	wellDrillingHomePhone VARCHAR(75) null,
	permitDrillingWorkLocation VARCHAR(500) null,
	permitDrillingLocation VARCHAR(500) null,
	permitDrillingNature VARCHAR(500) null,
	permitDrillingContractorName VARCHAR(75) null,
	permitDrillContractAddress VARCHAR(500) null,
	permitDrillingContractorAdd VARCHAR(500) null,
	permitDrillingPurpose VARCHAR(500) null,
	permitDrillingBoreholeDepth VARCHAR(75) null,
	permitDrillingDiameterBorehole VARCHAR(75) null,
	permitDrillingMethod VARCHAR(500) null,
	permitDrillingConstMethod VARCHAR(500) null,
	permitDrillingSupplies VARCHAR(75) null,
	permitDrillingTechnicalInfo VARCHAR(75) null,
	permitDrillingCubic VARCHAR(75) null,
	permitDrillingAuthority VARCHAR(500) null,
	applicantSignaturePermitBtn VARCHAR(75) null,
	permitDrillingSignDate DATE null,
	wraApplicationId LONG
);

create table nbp_wra_lic_well_drill_info (
	licenceToWellDrillerId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	wellDrillingApplicationNo VARCHAR(75) null,
	permitDrillingApplicantName VARCHAR(75) null,
	permitDrillingAddressParish VARCHAR(75) null,
	permitDrillingApplicantAddress VARCHAR(500) null,
	permitDrillingDOBDate DATE null,
	permitDrillingEducational VARCHAR(500) null,
	permitDrillingSpecificTraining VARCHAR(75) null,
	permitDrillingSpecificExp VARCHAR(75) null,
	permitDrillingSelfEmployed VARCHAR(75) null,
	permitDrillingName VARCHAR(75) null,
	permitDrillingPresentEmployer VARCHAR(75) null,
	permitDrillingEmployerAddress VARCHAR(500) null,
	permitDrillingFirstRefName VARCHAR(75) null,
	permitDrillingFirstRefAdd VARCHAR(500) null,
	permitDrillingSecondRefName VARCHAR(75) null,
	permitDrillingSecondRefAdd VARCHAR(500) null,
	permitDrillingSignature VARCHAR(75) null,
	permitDrillingSignatureDate DATE null,
	wraApplicationId LONG
);

create table nbp_wra_renew_abstract (
	renewLicAbstractAndWaterId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	renewName VARCHAR(75) null,
	renewContact VARCHAR(75) null,
	renewJobTitle VARCHAR(75) null,
	renewTelephoneNum VARCHAR(75) null,
	renewFaxNum VARCHAR(75) null,
	renewParishLocation VARCHAR(75) null,
	renewAddress VARCHAR(500) null,
	renewSourceName VARCHAR(75) null,
	renewDetailsParishAdd VARCHAR(500) null,
	renewDetailsLocation VARCHAR(500) null,
	renewAbstractionRate VARCHAR(75) null,
	renewDetailsUse VARCHAR(75) null,
	renewAbstractionMethod VARCHAR(75) null,
	attachedDevice VARCHAR(75) null,
	renewStateDevice VARCHAR(75) null,
	abstractionData VARCHAR(75) null,
	renewSignName VARCHAR(75) null,
	renewDate DATE null,
	wraApplicationId LONG
);

create table nbp_wra_req_irrigation (
	wraReqIrrigationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	abstractAreaIrrigated VARCHAR(75) null,
	abstractSystemIrrigated VARCHAR(75) null,
	counter VARCHAR(75) null,
	wraApplicationId LONG
);