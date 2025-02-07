create table nbp_cannabis_app_payment (
	cannabisApplicationPaymentId LONG not null primary key,
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
	transactionNumber VARCHAR(75) null,
	cannabisApplicationId LONG,
	paymentReceiptNumber VARCHAR(75) null,
	paymentReceiptDocId LONG,
	amountPaid VARCHAR(75) null,
	amountCurrency VARCHAR(75) null,
	dateReceived DATE null
);

create table nbp_cannabis_applications (
	uuid_ VARCHAR(75) null,
	cannabisApplicationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	entityId VARCHAR(75) null,
	requestType VARCHAR(75) null,
	licenseCategory VARCHAR(75) null,
	licenseSubCategory VARCHAR(75) null,
	typeOfEntity VARCHAR(75) null,
	status INTEGER,
	applicationNumber VARCHAR(75) null,
	expiredLicenseAppNo VARCHAR(75) null,
	caseId VARCHAR(500) null,
	icmDocumentsPath VARCHAR(500) null,
	PdfFileEntryId LONG,
	appCurrentStageName VARCHAR(75) null
);

create table nbp_cannabis_caa (
	uuid_ VARCHAR(75) null,
	cannabisCOAId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	firstName VARCHAR(75) null,
	middleName VARCHAR(75) null,
	surname VARCHAR(75) null,
	position VARCHAR(75) null,
	gender VARCHAR(75) null,
	dateOfBirth DATE null,
	contactPhoneNumber VARCHAR(75) null,
	emailAddress VARCHAR(75) null,
	cannabisApplicationId LONG
);

create table nbp_cannabis_com_address (
	uuid_ VARCHAR(75) null,
	companyAddressId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	addressType VARCHAR(75) null,
	streetName VARCHAR(75) null,
	town VARCHAR(75) null,
	parish VARCHAR(75) null,
	applicationNumber VARCHAR(75) null,
	cannabisApplicationId LONG,
	companyInformationId LONG
);

create table nbp_cannabis_company_info (
	uuid_ VARCHAR(75) null,
	companyInformationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	companyName VARCHAR(75) null,
	trn VARCHAR(75) null,
	typeOfCompany VARCHAR(75) null,
	otherCompanyType VARCHAR(75) null,
	registrationNumber VARCHAR(75) null,
	contactPhoneNumber VARCHAR(75) null,
	emailAddress VARCHAR(75) null,
	status INTEGER,
	applicationNumber VARCHAR(75) null,
	cannabisApplicationId LONG
);

create table nbp_cannabis_cpo (
	uuid_ VARCHAR(75) null,
	cannabisCPOId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	typeOfProperty VARCHAR(75) null,
	descriptionOfProperty VARCHAR(500) null,
	descriptionOfIntendedUse VARCHAR(75) null,
	landType VARCHAR(75) null,
	ownsProperty VARCHAR(75) null,
	cannabisApplicationId LONG
);

create table nbp_cannabis_cso (
	cannabisConsentBySoleOwnerId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ownerName VARCHAR(75) null,
	date_ DATE null,
	ownerPhone VARCHAR(75) null,
	ownerAddress VARCHAR(75) null,
	counter VARCHAR(75) null,
	cannabisApplicationId LONG
);

create table nbp_cannabis_dec_own (
	uuid_ VARCHAR(75) null,
	cannabisDecOfOwnershipId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	firstName VARCHAR(75) null,
	middleName VARCHAR(75) null,
	surname VARCHAR(75) null,
	position VARCHAR(75) null,
	percentOfOwnership VARCHAR(75) null,
	citizenship VARCHAR(75) null,
	trn VARCHAR(75) null,
	dob DATE null,
	idNumber VARCHAR(75) null,
	typeOfId VARCHAR(75) null,
	counter VARCHAR(75) null,
	officialPoliceRecordDocId LONG,
	certifiedCopyofIdDocId LONG,
	signature VARCHAR(75) null,
	cannabisApplicationId LONG
);

create table nbp_cannabis_fee_master (
	cannabisFeeMasterId LONG not null primary key,
	category VARCHAR(75) null,
	subCategory VARCHAR(75) null,
	securityBond DOUBLE,
	licenseFee DOUBLE,
	remarks VARCHAR(75) null
);

create table nbp_cannabis_gd (
	uuid_ VARCHAR(75) null,
	generalDeclarationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	declartionQuestion STRING null,
	answer STRING null,
	cannabisApplicationId LONG
);

create table nbp_cannabis_ind_address (
	uuid_ VARCHAR(75) null,
	IndividualAddressId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	addressType VARCHAR(75) null,
	streetName VARCHAR(75) null,
	town VARCHAR(75) null,
	parish VARCHAR(75) null,
	applicationNumber VARCHAR(75) null,
	cannabisApplicationId LONG,
	individualInformationId LONG
);

create table nbp_cannabis_individaul_info (
	uuid_ VARCHAR(75) null,
	individualInformationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	middleName VARCHAR(75) null,
	otherName VARCHAR(75) null,
	maidenName VARCHAR(75) null,
	motherMaidenName VARCHAR(75) null,
	gender VARCHAR(75) null,
	maritalStatus VARCHAR(75) null,
	dob DATE null,
	placeOfBirth VARCHAR(75) null,
	nationality VARCHAR(75) null,
	durationInJamaika VARCHAR(75) null,
	trn VARCHAR(75) null,
	currentOccupation VARCHAR(75) null,
	drivingLincenseNo VARCHAR(75) null,
	passporNo VARCHAR(75) null,
	nationalIdentityNo VARCHAR(75) null,
	contactHome VARCHAR(75) null,
	contactWork VARCHAR(75) null,
	contactMobile VARCHAR(75) null,
	email VARCHAR(75) null,
	identityNumber VARCHAR(75) null,
	status INTEGER,
	applicationNumber VARCHAR(75) null,
	cannabisApplicationId LONG
);

create table nbp_cannabis_occ_license (
	uuid_ VARCHAR(75) null,
	cannabisOccupationaLicenseId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	firstName VARCHAR(75) null,
	middleName VARCHAR(75) null,
	surname VARCHAR(75) null,
	position VARCHAR(75) null,
	management VARCHAR(75) null,
	director VARCHAR(75) null,
	trn VARCHAR(75) null,
	dob DATE null,
	idNumber VARCHAR(75) null,
	typeOfId VARCHAR(75) null,
	counter VARCHAR(75) null,
	officialPoliceRecordDocId LONG,
	certifiedCopyofIdDocId LONG,
	photoOfEmployeeDocId LONG,
	signature VARCHAR(75) null,
	cannabisApplicationId LONG
);

create table nbp_cannabis_sofh (
	uuid_ VARCHAR(75) null,
	statementOfFinancialHistoryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	statementOfHistoryQuestion STRING null,
	answer VARCHAR(75) null,
	cannabisApplicationId LONG
);

create table nbp_cannabis_stage (
	uuid_ VARCHAR(75) null,
	cannabisStageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	currentStage VARCHAR(75) null,
	lastFormStep VARCHAR(75) null,
	cannabisApplicationId LONG
);

create table nbp_cannabis_supp_info (
	uuid_ VARCHAR(75) null,
	cannabisSupplementalInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	supplementInfoQuestion STRING null,
	answer STRING null,
	cannabisApplicationId LONG
);

create table nbp_cannabis_supporting_docs (
	cannabisSupportingDocMasterId LONG not null primary key,
	applicationType VARCHAR(75) null,
	documentTye VARCHAR(75) null,
	landType VARCHAR(75) null,
	userType VARCHAR(75) null,
	documentName STRING null,
	remarks STRING null,
	status VARCHAR(75) null
);