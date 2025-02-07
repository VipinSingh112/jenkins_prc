create table nbp_quarry__info (
	auarryInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	location VARCHAR(500) null,
	district VARCHAR(75) null,
	parish VARCHAR(75) null,
	actualSizeOfQuary VARCHAR(75) null,
	hasQuarrySubmitted VARCHAR(75) null,
	sixCopiesOfLocation VARCHAR(500) null,
	legalAccessToLand VARCHAR(75) null,
	ownerShipEnclosed VARCHAR(75) null,
	adjacentPropOwner VARCHAR(75) null,
	measurement VARCHAR(75) null,
	landOwnerName VARCHAR(75) null,
	landOwnerAddress VARCHAR(500) null,
	quarryApplicationId LONG
);

create table nbp_quarry_add_director (
	directorDetailsAddId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	directorName VARCHAR(75) null,
	directorNationality VARCHAR(75) null,
	quarryApplicationId LONG,
	counter VARCHAR(75) null
);

create table nbp_quarry_app_payment (
	quarryApplicationPaymentId LONG not null primary key,
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
	quarryApplicationId LONG
);

create table nbp_quarry_applicant_info (
	auarryApplicantId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nameOfApplicant VARCHAR(75) null,
	addressOfApplicant VARCHAR(500) null,
	telephoneOfApplicant VARCHAR(75) null,
	emailOfApplicant VARCHAR(75) null,
	trnAndTcc VARCHAR(75) null,
	quarryApplicationId LONG
);

create table nbp_quarry_application (
	uuid_ VARCHAR(75) null,
	quarryApplicationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	entityId LONG,
	natureOfApplicant VARCHAR(75) null,
	typeOfTransaction VARCHAR(75) null,
	renewLicenceNumber VARCHAR(75) null,
	typeOfMaterialQuarried VARCHAR(75) null,
	caseId VARCHAR(500) null,
	status INTEGER,
	icmDocumentPath VARCHAR(500) null,
	applicationNumber VARCHAR(75) null,
	expiredLicenseAppNumber VARCHAR(75) null,
	pdfFileEntryId LONG,
	appCurrentStageName VARCHAR(75) null
);

create table nbp_quarry_general_info (
	generalInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	proposedNumberOfEmploy VARCHAR(75) null,
	nonRefundableFee VARCHAR(75) null,
	convictedUnderQuarryLaw VARCHAR(75) null,
	giveDetails VARCHAR(75) null,
	licenseRefused VARCHAR(75) null,
	dateOfSignature DATE null,
	quarryApplicationId LONG
);

create table nbp_quarry_machines_equip (
	uuid_ VARCHAR(75) null,
	quarryApplicationMachinId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	manchineName VARCHAR(75) null,
	isManchineNameChecked VARCHAR(75) null,
	quantity VARCHAR(75) null,
	locationOfPermises VARCHAR(500) null,
	locatedOnLocation VARCHAR(500) null,
	otherValue VARCHAR(75) null,
	quarryApplicationId VARCHAR(75) null
);

create table nbp_quarry_machines_equip_mi (
	uuid_ VARCHAR(75) null,
	miMachineId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	manchineName VARCHAR(75) null,
	isManchineNameChecked VARCHAR(75) null,
	locatedOnProposedSite VARCHAR(75) null,
	quarryApplicationId VARCHAR(75) null
);

create table nbp_quarry_material_List_info (
	materialInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	machineName VARCHAR(75) null,
	quantity VARCHAR(75) null,
	locatedOnPermises VARCHAR(500) null,
	isManchineNameChecked VARCHAR(75) null,
	otherValue VARCHAR(75) null,
	quarryApplicationId LONG
);

create table nbp_quarry_material_info (
	materialInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	typeOfMaterial VARCHAR(75) null,
	reserveEstimate VARCHAR(75) null,
	estimateDailyProd VARCHAR(75) null,
	actualSizeOfQuary VARCHAR(75) null,
	hasQuarrySubmitted VARCHAR(75) null,
	sixCopiesOfLocation VARCHAR(500) null,
	legalAccessToLand VARCHAR(75) null,
	ownerShipEnclosed VARCHAR(75) null,
	adjacentPropOwner VARCHAR(75) null,
	quarryApplicationId LONG
);

create table nbp_quarry_stage (
	auarryStageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	currentStage VARCHAR(75) null,
	lastFormDetailsStep VARCHAR(75) null,
	quarryApplicationId LONG
);

create table nbp_quarry_transfer_info (
	quarryTransferInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	transferCompanyName VARCHAR(75) null,
	transferLicenceNumber VARCHAR(75) null,
	transferLicenseLease VARCHAR(75) null,
	transferLeaseReason VARCHAR(75) null,
	nameOfApplicant VARCHAR(75) null,
	telephone VARCHAR(75) null,
	email VARCHAR(75) null,
	nationalityOfApplicant VARCHAR(75) null,
	addressInJamaica VARCHAR(500) null,
	nameOfDirector VARCHAR(75) null,
	nationalityOfDirector VARCHAR(75) null,
	dateOfTransfer DATE null,
	trnAndTcc VARCHAR(75) null,
	quarryApplicationId LONG
);