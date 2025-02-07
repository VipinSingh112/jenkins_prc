create table nbp_sez_app_stage (
	uuid_ VARCHAR(75) null,
	sezStageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	currentStage VARCHAR(75) null,
	lastFormStep VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_consultancy_service (
	sezConsultancyInspectionId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	doYouWant VARCHAR(75) null,
	consultancyName VARCHAR(75) null,
	consultancyEmail VARCHAR(75) null,
	consultancyPhoneNum VARCHAR(75) null,
	consultancyDateBirth DATE null,
	consultancyBirthCountry VARCHAR(75) null,
	consultancyCountry VARCHAR(75) null,
	consultancySezStatus VARCHAR(75) null,
	agendaName VARCHAR(75) null,
	dateForInspection DATE null,
	consultancyTime VARCHAR(75) null
);

create table nbp_sez_dev_Inves_and_financ (
	sezDevInvestmentAndFinancialId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	valueOfLand VARCHAR(75) null,
	buildingFactoryDevelop VARCHAR(75) null,
	onSiteInfrastructure VARCHAR(75) null,
	port VARCHAR(75) null,
	airPort VARCHAR(75) null,
	other VARCHAR(75) null,
	total VARCHAR(75) null,
	totalLocalDirector VARCHAR(75) null,
	totalForeignDirector VARCHAR(75) null,
	companyName VARCHAR(75) null,
	resisdentAddress VARCHAR(75) null,
	sourceOfFunds VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_dev_Pro_develop_plan (
	sezDevPropDevelopmentPlanId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	existingBuilding VARCHAR(75) null,
	existingBuildingForBusiDetail VARCHAR(75) null,
	activitiesForSingleEntity VARCHAR(75) null,
	volume VARCHAR(75) null,
	folio VARCHAR(75) null,
	buildingNum VARCHAR(75) null,
	townCity VARCHAR(75) null,
	zipCode VARCHAR(75) null,
	zoningClassification VARCHAR(75) null,
	landUse VARCHAR(75) null,
	sezAreaHectares VARCHAR(75) null,
	sezAreaAcres VARCHAR(75) null,
	customsHectares VARCHAR(75) null,
	customsAcres VARCHAR(75) null,
	topography VARCHAR(75) null,
	northBoundaries VARCHAR(75) null,
	eastBoundaries VARCHAR(75) null,
	westBoundaries VARCHAR(75) null,
	southBoundaries VARCHAR(75) null,
	customLandMeasurement VARCHAR(75) null,
	customPercent VARCHAR(75) null,
	commonLandMeasurement VARCHAR(75) null,
	commonPercent VARCHAR(75) null,
	bufferLandMeasurement VARCHAR(75) null,
	bufferPercent VARCHAR(75) null,
	zoneLandMeasurement VARCHAR(75) null,
	zonePercent VARCHAR(75) null,
	ResidentialLandMeasurement VARCHAR(75) null,
	ResidentialPercent VARCHAR(75) null,
	totalLandMeasurement VARCHAR(75) null,
	totalPercent VARCHAR(75) null,
	industrialProcess VARCHAR(75) null,
	drinkingPurpose VARCHAR(75) null,
	otherSpecify VARCHAR(75) null,
	totalRequirement VARCHAR(75) null,
	quantumAndNature VARCHAR(75) null,
	specifyWhetherOwn VARCHAR(75) null,
	reqOfPower VARCHAR(75) null,
	mainRoadRowWidth VARCHAR(75) null,
	mainRoadTypeOfPavement VARCHAR(75) null,
	secondRowWidhth VARCHAR(75) null,
	secondTypeOfPavement VARCHAR(75) null,
	tertiaryRowWidhth VARCHAR(75) null,
	tertiaryTypeOfPavement VARCHAR(75) null,
	waterInstallationReq VARCHAR(75) null,
	powerInstallationReq VARCHAR(75) null,
	teleComInstallationReq VARCHAR(75) null,
	cctvInstallationReq VARCHAR(75) null,
	securityInterconnection VARCHAR(75) null,
	fireFightingInstallationReq VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_dev_corp_bus_add (
	sezDevCorporationBusinessAddId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	company VARCHAR(75) null,
	relationship VARCHAR(75) null,
	counter VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_dev_details (
	sezDeveloperDetailsId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	developerName VARCHAR(75) null,
	developerNumber VARCHAR(75) null,
	developerControl VARCHAR(75) null,
	letterOfApprovalDate DATE null,
	sezDeveloperDate DATE null,
	letterOfApprovalEntrtyId LONG,
	sezDeveloperAgreementEntryId LONG,
	sezStatusApplicationId LONG
);

create table nbp_sez_dev_disast_manag_add (
	sezDevDisasterManagementAddId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	disasterMitigationPlan VARCHAR(75) null,
	counter VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_dev_disaster_manage (
	sezDevDisasterManagementId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	disasterManagement VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_dev_emp_define_occ_add (
	sezDevEmployeeDefineOccuAddId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	occuSafetySystem VARCHAR(75) null,
	counter VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_dev_emp_safety_add (
	sezDevEmployeeSafetyInfoAddId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	securityMeasures VARCHAR(75) null,
	counter VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_dev_emploment_info (
	sezDevEmplomentInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	firstYearDirect VARCHAR(75) null,
	firstYearInDirect VARCHAR(75) null,
	firstYearMale VARCHAR(75) null,
	firstYearFemale VARCHAR(75) null,
	firstYearLocal VARCHAR(75) null,
	firstYearForeign VARCHAR(75) null,
	secondYearDirect VARCHAR(75) null,
	secondYearIndirect VARCHAR(75) null,
	secondYearMale VARCHAR(75) null,
	secondYearFemale VARCHAR(75) null,
	secondYearLocal VARCHAR(75) null,
	secondYearForeign VARCHAR(75) null,
	thirdYearDirect VARCHAR(75) null,
	thirdYearIndirect VARCHAR(75) null,
	thirdYearMale VARCHAR(75) null,
	thirdYearFemale VARCHAR(75) null,
	thirdYearLocal VARCHAR(75) null,
	thirdYearForeign VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_dev_gen_busi_info_add (
	sezDevGenBusinessInfoAddId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	companyName VARCHAR(75) null,
	buildingNum VARCHAR(75) null,
	townCity VARCHAR(75) null,
	parish VARCHAR(75) null,
	country VARCHAR(75) null,
	telephoneNum VARCHAR(75) null,
	faxNum VARCHAR(75) null,
	emailAddress VARCHAR(75) null,
	counter VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_dev_gen_business_info (
	sezDevGeneralBusinessIfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	applicationDate DATE null,
	applicantName VARCHAR(75) null,
	companyName VARCHAR(75) null,
	buildingNum VARCHAR(75) null,
	townCity VARCHAR(75) null,
	Parish VARCHAR(75) null,
	country VARCHAR(75) null,
	telephoneNum VARCHAR(75) null,
	faxNum VARCHAR(75) null,
	emailAddress VARCHAR(75) null,
	website VARCHAR(75) null,
	headOfficeBuildingNum VARCHAR(75) null,
	headOfficeTown VARCHAR(75) null,
	headOfficeParish VARCHAR(75) null,
	authRepName VARCHAR(75) null,
	authRepBuildingNum VARCHAR(75) null,
	authRepTown VARCHAR(75) null,
	authRepParish VARCHAR(75) null,
	authRepCountry VARCHAR(75) null,
	authReptelephoneNum VARCHAR(75) null,
	authRepFaxNum VARCHAR(75) null,
	autheEmailAddress VARCHAR(75) null,
	joinVenture VARCHAR(75) null,
	existingJamicanCom VARCHAR(75) null,
	articleOfIncorporation VARCHAR(75) null,
	pleaseSpecify VARCHAR(75) null,
	companyClassified VARCHAR(75) null,
	taxRegisNum VARCHAR(75) null,
	genConsumptionNum VARCHAR(75) null,
	taxComplianceCertificateNum VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_dev_please_state_add (
	sezDevPleaseStateAddId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	counter VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_dev_prop_project_add (
	sezDevProposedProjectAddId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nameOfZone VARCHAR(75) null,
	parish VARCHAR(75) null,
	counter VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_dev_proposed_project (
	sezDevProposedProjectId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	previouslyFreeZone VARCHAR(75) null,
	curentlyOperatingZone VARCHAR(75) null,
	businessConductedZone VARCHAR(75) null,
	locally VARCHAR(75) null,
	overseas VARCHAR(75) null,
	proposedName VARCHAR(75) null,
	specialEconomicZone VARCHAR(75) null,
	pleaseDescribe VARCHAR(75) null,
	seaPortKm VARCHAR(75) null,
	seaPortMi VARCHAR(75) null,
	airportKm VARCHAR(75) null,
	airportMi VARCHAR(75) null,
	roadKm VARCHAR(75) null,
	roadMi VARCHAR(75) null,
	railKm VARCHAR(75) null,
	railMi VARCHAR(75) null,
	customProcessingKm VARCHAR(75) null,
	customProcessingMi VARCHAR(75) null,
	indicateTheLandMeasurement VARCHAR(75) null,
	building VARCHAR(75) null,
	landArea VARCHAR(75) null,
	ownerShip VARCHAR(75) null,
	otherPleaseSpecify VARCHAR(75) null,
	landOwnerName VARCHAR(75) null,
	lnadOwnerAddressOne VARCHAR(75) null,
	lnadOwnerAddressTwo VARCHAR(75) null,
	lnadOwnerTenure VARCHAR(75) null,
	stepToAcquireLand VARCHAR(75) null,
	stateWheatherTheProposedArea VARCHAR(75) null,
	applicantPreviously VARCHAR(75) null,
	pleaseProvideBrief VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_dev_share_com_dire_add (
	sezDevSharComDirectorShipAddId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	company VARCHAR(75) null,
	replationship VARCHAR(75) null,
	counter VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_dev_share_director_add (
	sezDevShareDirectorAddId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	shareholderName VARCHAR(75) null,
	numOfShare VARCHAR(75) null,
	counter VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_dev_share_pricipal_add (
	sezDevSharePrincipalAddId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	buildingNum VARCHAR(75) null,
	parishPost VARCHAR(75) null,
	country VARCHAR(75) null,
	nationality VARCHAR(75) null,
	taxRegistrationNum VARCHAR(75) null,
	counter VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_dev_shareholding_info (
	sezDevShareholdingInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	authorised VARCHAR(75) null,
	subscribed VARCHAR(75) null,
	paidUpShareCapital VARCHAR(75) null,
	directorBankrupts VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_dev_sub_checklist (
	sezSubmissionChecklistId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	selectedGeneral VARCHAR(1000) null,
	selectedComInfoReq VARCHAR(1000) null,
	paidShareCapProof VARCHAR(1000) null,
	selectedSwornStateReq VARCHAR(1000) null,
	selectedLandOccuReq VARCHAR(1000) null,
	selectedSafetyHealthReq VARCHAR(1000) null,
	selectedLandDevlopmentReq VARCHAR(1000) null,
	selectedTechInfoReq VARCHAR(1000) null,
	selectedSezPreliminaryReq VARCHAR(1000) null,
	selectedSezDevDetailReq VARCHAR(1000) null,
	selectedApprovalReq VARCHAR(1000) null,
	nameReq VARCHAR(75) null,
	dateReq DATE null,
	sezStatusApplicationId LONG
);

create table nbp_sez_dev_undertaking (
	sezDeveloperUndertakingId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	titleOfApplicant VARCHAR(75) null,
	nameOfApplicant VARCHAR(75) null,
	telephoneNum VARCHAR(75) null,
	emailAddress VARCHAR(75) null,
	applicantSignatureDate DATE null,
	nameOfNotaryPublic VARCHAR(75) null,
	publicNotarySignatureDate DATE null,
	sezStatusApplicationId LONG
);

create table nbp_sez_occ_dev_under_info (
	sezOccDevUnderId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	occUndertakingDevName VARCHAR(75) null,
	occUndertakingApprLetter VARCHAR(75) null,
	occUndertakingDate DATE null,
	occUndertakingAgreeNum VARCHAR(75) null,
	occUndertakingAgreeDate DATE null,
	occUndertakingControlNum VARCHAR(75) null,
	occDevApplicantTitle VARCHAR(75) null,
	occDevApplicantName VARCHAR(75) null,
	occDevApplicantTele VARCHAR(75) null,
	occDevApplicantEmail VARCHAR(75) null,
	occDevApplicantSignDate DATE null,
	occDevPublicNotaryName VARCHAR(75) null,
	occDevPublicNotarySignDate DATE null,
	sezStatusApplicationId LONG
);

create table nbp_sez_occ_dir_part_spon (
	sezOccDirectSpoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	occAppDate DATE null,
	occDirectorName VARCHAR(75) null,
	occDirectorStreetAddress VARCHAR(75) null,
	occDirectorZipCode VARCHAR(75) null,
	occDirectorCountry VARCHAR(75) null,
	counter VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_occ_employee_info (
	sezOccEmpId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	occLabourYear VARCHAR(75) null,
	occLabourDirect VARCHAR(75) null,
	occLabourMale VARCHAR(75) null,
	occLabourFemale VARCHAR(75) null,
	occLabourLocal VARCHAR(75) null,
	occLabourForeign VARCHAR(75) null,
	occEmpCounter VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_occ_exist_prop_info (
	sezOccExistPorpId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	occBusinessDesc VARCHAR(75) null,
	occDeniedFreeZoneAppr VARCHAR(75) null,
	occDeniedFreeZoneApprDate DATE null,
	occDeniedFreeZoneApprType VARCHAR(75) null,
	occFreeZoneLocation VARCHAR(75) null,
	occSezDevLoc VARCHAR(75) null,
	occSezDevLocDesc VARCHAR(75) null,
	occSubConcessionBuilding VARCHAR(75) null,
	occSubConcessionTown VARCHAR(75) null,
	occSubConcessionParish VARCHAR(75) null,
	occCompleteSurveyTechDesc VARCHAR(75) null,
	occNorthBoundaries VARCHAR(75) null,
	occEastBoundaries VARCHAR(75) null,
	occWestBoundaries VARCHAR(75) null,
	occSouthBoundaries VARCHAR(75) null,
	occOwnership VARCHAR(75) null,
	occLeaseYears VARCHAR(75) null,
	occVolume VARCHAR(75) null,
	occFolio VARCHAR(75) null,
	occFloorNum VARCHAR(75) null,
	occUndertakenService VARCHAR(75) null,
	occUndertakenManufacturing VARCHAR(75) null,
	occSeaPortDistanceKM VARCHAR(75) null,
	occSeaPortDistanceMI VARCHAR(75) null,
	occAirportDistanceKM VARCHAR(75) null,
	occAirportDistanceMI VARCHAR(75) null,
	occRoadDistanceKM VARCHAR(75) null,
	occRoadDistanceMI VARCHAR(75) null,
	occRailDistanceKM VARCHAR(75) null,
	occRailDistanceMI VARCHAR(75) null,
	occCustomDistanceKM VARCHAR(75) null,
	occCustomDistanceMI VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_occ_gen_buss_address (
	sezOccGenBussAddressId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	occName VARCHAR(75) null,
	occStreetAddress VARCHAR(75) null,
	occTown VARCHAR(75) null,
	occParish VARCHAR(75) null,
	occCountry VARCHAR(75) null,
	addresstype VARCHAR(75) null,
	sezOccGenBussId LONG,
	sezStatusApplicationId LONG
);

create table nbp_sez_occ_gen_bussiness (
	sezOccGenBussId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	occAppDate DATE null,
	occSezDevName VARCHAR(75) null,
	occSezDevControlNum VARCHAR(75) null,
	occExistingCom VARCHAR(75) null,
	occFormArticle VARCHAR(75) null,
	occFormArticleOther VARCHAR(75) null,
	occTRN VARCHAR(75) null,
	occGCT VARCHAR(75) null,
	occTCC VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_occ_invest_fina_info (
	sezOccInvestFinancId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	occInfraBuilding VARCHAR(75) null,
	occInfraEquipment VARCHAR(75) null,
	occInfraMachines VARCHAR(75) null,
	occInfraTotal VARCHAR(75) null,
	occInfraFinanceSource VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_occ_location_add (
	sezOccLocationAddId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	developerLocation VARCHAR(75) null,
	developerLocationDescription VARCHAR(75) null,
	counter VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_occ_location_add_box (
	sezOccLocationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	developerCodeLocation VARCHAR(75) null,
	descTypeOfAct VARCHAR(75) null,
	locationCounter VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_occ_prin_offic_add (
	sezOccPrincOffId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	position VARCHAR(75) null,
	principlOfficerCounter VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_occ_princ_dir_info (
	sezOccPrincDirectId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	occShareholderName VARCHAR(75) null,
	occShareholderNation VARCHAR(75) null,
	occShareholderShares VARCHAR(75) null,
	occShareholderCounter VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_occ_prop_area_info (
	sezOccPropAreaId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	occProcessingArea VARCHAR(75) null,
	occNonProcessingArea VARCHAR(75) null,
	occOfficeRequirement VARCHAR(75) null,
	occFactoryRequirement VARCHAR(75) null,
	otherBuildUpRequirement VARCHAR(75) null,
	occOtherAreaReqName VARCHAR(75) null,
	occOtherAreaRequirement VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_occ_share_hold_info (
	sezOccShareHolderId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	occAuthorised VARCHAR(75) null,
	occSubscribed VARCHAR(75) null,
	occShareHolderCounter VARCHAR(75) null,
	occPaidCapital VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_occ_sub_check_info (
	sezOccCheckSubmitId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	occNameReq VARCHAR(1000) null,
	occDateReq VARCHAR(1000) null,
	occGeneral VARCHAR(1000) null,
	occComInfoRequest VARCHAR(1000) null,
	occSwanStateRequest VARCHAR(1000) null,
	occSelectedRequest VARCHAR(1000) null,
	occSelectedFacilityRequest VARCHAR(1000) null,
	occSelectedApprovals VARCHAR(1000) null,
	occSelectedSecurityRequest VARCHAR(1000) null,
	occSelectedSDetailedBussiness VARCHAR(1000) null,
	occPaidShareCapProof VARCHAR(1000) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_occ_user_under_info (
	sezOccUserunderId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	occApplicantTitle VARCHAR(75) null,
	occApplicantName VARCHAR(75) null,
	occApplicantTeleNum VARCHAR(75) null,
	occApplicantEmail VARCHAR(75) null,
	occApplicantSignDate DATE null,
	occPublicNotaryName VARCHAR(75) null,
	occPublicNotarySignDate DATE null,
	sezStatusApplicationId LONG
);

create table nbp_sez_status_app_payment (
	sezStatusAppPaymentId LONG not null primary key,
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
	sezStatusApplicationId LONG
);

create table nbp_sez_status_application (
	sezStatusApplicationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	entityId VARCHAR(75) null,
	sezStatus VARCHAR(75) null,
	typeOfTransaction VARCHAR(75) null,
	zoningClassification VARCHAR(75) null,
	specialEconomicZone VARCHAR(500) null,
	parish VARCHAR(75) null,
	industries VARCHAR(75) null,
	status INTEGER,
	applicationNumber VARCHAR(75) null,
	caseId VARCHAR(75) null,
	expiredLicenseAppNumber VARCHAR(75) null,
	icmDocumentsPath VARCHAR(500) null,
	pdfFileEntryId LONG,
	appCurrentStageName VARCHAR(75) null,
	doYouWantTo VARCHAR(75) null,
	typeOfTransactionWFH VARCHAR(75) null,
	controlNumberWFH VARCHAR(75) null,
	applicantStatusWFH VARCHAR(75) null
);

create table nbp_sez_status_work_home (
	sezStatusWorkFromHomeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	companyName VARCHAR(75) null,
	contactPersonName VARCHAR(75) null,
	contactPersonEmail VARCHAR(75) null,
	controlNumber VARCHAR(75) null,
	workerUtilizingIncentive VARCHAR(75) null,
	workerUtilizingIncentiveMonth VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_status_work_home_loc (
	sezStatusWFHLocId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	controlNumber VARCHAR(75) null,
	location VARCHAR(75) null,
	parish VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_zone_dev_under_info (
	sezZoneDevUnderInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	developerName VARCHAR(75) null,
	approvalLetterNum VARCHAR(75) null,
	approvalLetterDate DATE null,
	developerAgreeNum VARCHAR(75) null,
	developerAgreeDate DATE null,
	developerControlNum VARCHAR(75) null,
	declarantTitle VARCHAR(75) null,
	declarantName VARCHAR(75) null,
	declarantTelephoneNum VARCHAR(75) null,
	declarantEmail VARCHAR(75) null,
	signatureDate DATE null,
	publicNotaryName VARCHAR(75) null,
	publicNotarySignatureDate DATE null,
	sezStatusApplicationId LONG
);

create table nbp_sez_zone_emp_info (
	sezZoneEmpInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	labourRequirementYear VARCHAR(75) null,
	labourRequirementDirect VARCHAR(75) null,
	labourRequirementMale VARCHAR(75) null,
	labourRequirementFemale VARCHAR(75) null,
	labourRequirementLocal VARCHAR(75) null,
	labourRequirementForeign VARCHAR(75) null,
	counter VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_zone_financial_info (
	sezZoneFinancialnfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	buildingInfrastructure VARCHAR(75) null,
	equipmentInfrastructure VARCHAR(75) null,
	machinesInfrastructure VARCHAR(75) null,
	totalInfrastructure VARCHAR(75) null,
	financeSource VARCHAR(1000) null,
	otherFinanceSource VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_zone_gen_business_info (
	sezZoneGeneralBusinessInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	applicationDate DATE null,
	developerName VARCHAR(75) null,
	LocationName VARCHAR(75) null,
	controlNum VARCHAR(75) null,
	existingCompany VARCHAR(75) null,
	articleForm VARCHAR(75) null,
	otherArticleForm VARCHAR(75) null,
	nonResidentCom VARCHAR(75) null,
	taxRegisNum VARCHAR(75) null,
	genConsumptionNum VARCHAR(75) null,
	taxComplianceCertificateNum VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_zone_gen_buss_address (
	sezZoneGenBussAddressId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	zoneName VARCHAR(75) null,
	zoneStreetAddress VARCHAR(75) null,
	zoneTown VARCHAR(75) null,
	zoneParish VARCHAR(75) null,
	zoneCountry VARCHAR(75) null,
	addresstype VARCHAR(75) null,
	sezZoneGeneralBusinessInfoId LONG,
	sezStatusApplicationId LONG
);

create table nbp_sez_zone_location_add (
	sezZoneLocationAddId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	developerLocation VARCHAR(75) null,
	developerLocationDescription VARCHAR(75) null,
	counter VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_zone_pro_proj_info (
	sezZoneProposedProjectInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	entityDeniedApproval VARCHAR(75) null,
	deniedApprovalDate DATE null,
	deniedApprovalProjectType VARCHAR(75) null,
	freeZoneLocation VARCHAR(75) null,
	leasedBuildingNum VARCHAR(75) null,
	leasedTown VARCHAR(75) null,
	leasedParish VARCHAR(75) null,
	leaseYears VARCHAR(75) null,
	volume VARCHAR(75) null,
	folio VARCHAR(75) null,
	floorNum VARCHAR(75) null,
	sezStatusApplicationId LONG
);

create table nbp_sez_zone_sub_check_info (
	sezZoneSubCheckInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	generalRequirement VARCHAR(1000) null,
	companyInformation VARCHAR(1000) null,
	swornState VARCHAR(1000) null,
	occupancyRequirement VARCHAR(1000) null,
	approvals VARCHAR(1000) null,
	signatureName VARCHAR(75) null,
	signatureDate DATE null,
	sezStatusApplicationId LONG
);

create table nbp_sez_zone_user_under_info (
	sezZoneUserUnderInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	declarantTitle VARCHAR(75) null,
	declarantName VARCHAR(75) null,
	declarantTeleNum VARCHAR(75) null,
	declarantEmail VARCHAR(75) null,
	applicantSignatureDate DATE null,
	publicNotaryName VARCHAR(75) null,
	publicNotarySignatureDate DATE null,
	sezStatusApplicationId LONG
);