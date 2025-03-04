create table nbp_jtb_acco_gen_dec (
	uuid_ VARCHAR(75) null,
	accoGenDeclarationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	noOfBedroom VARCHAR(75) null,
	ownerOfHotel VARCHAR(75) null,
	addressOne VARCHAR(500) null,
	compIncorporatedOne VARCHAR(75) null,
	companyDate DATE null,
	hotelOperator VARCHAR(75) null,
	hotelOperatorDateSince DATE null,
	addressTwo VARCHAR(500) null,
	compIncorporatedTwo VARCHAR(75) null,
	hotelOperatorName VARCHAR(75) null,
	dateTwo DATE null,
	hotelIncepDate DATE null,
	financeOfOper VARCHAR(75) null,
	noOfEmployee VARCHAR(75) null,
	signatureDate DATE null,
	nameOfManager VARCHAR(75) null,
	jtbApplicationId LONG
);

create table nbp_jtb_acco_home_stay_lic (
	uuid_ VARCHAR(75) null,
	accoHomeStayId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	homeAccoName VARCHAR(75) null,
	homeOwnerName VARCHAR(75) null,
	propertyAddress VARCHAR(500) null,
	homeTeleNo VARCHAR(75) null,
	homeMobile VARCHAR(75) null,
	homeEmail VARCHAR(75) null,
	homeEmployeeNo VARCHAR(75) null,
	website VARCHAR(75) null,
	propDirection VARCHAR(500) null,
	numOfBedrooms VARCHAR(75) null,
	numOfGuestBedroom VARCHAR(75) null,
	withBathroom VARCHAR(75) null,
	sharedBathroom VARCHAR(75) null,
	signDate DATE null,
	certifiedBy VARCHAR(75) null,
	jtbApplicationId LONG
);

create table nbp_jtb_acco_licence (
	uuid_ VARCHAR(75) null,
	accoHotelLicenceId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nameOfOwner VARCHAR(75) null,
	nameOfHotel VARCHAR(75) null,
	telephoneNo VARCHAR(75) null,
	faxNo VARCHAR(75) null,
	emailAddress VARCHAR(75) null,
	parish VARCHAR(75) null,
	address VARCHAR(500) null,
	jtbApplicationId LONG
);

create table nbp_jtb_acco_non_hotel_gen (
	uuid_ VARCHAR(75) null,
	accoNonHotelGenDecId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nhAccoOperatorName VARCHAR(75) null,
	dateFrom DATE null,
	dateTo DATE null,
	nhAccoSince DATE null,
	nhAccoDate DATE null,
	jtbApplicationId LONG
);

create table nbp_jtb_acco_non_hotel_lic (
	uuid_ VARCHAR(75) null,
	accoNonHotelLicenceId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	accoName VARCHAR(75) null,
	accoAddress VARCHAR(500) null,
	accoTeleNo VARCHAR(75) null,
	accoFaxNo VARCHAR(75) null,
	accoEmail VARCHAR(75) null,
	accoNoOfEmp VARCHAR(75) null,
	accoOfferedType VARCHAR(75) null,
	noOfRooms VARCHAR(75) null,
	ownerName VARCHAR(75) null,
	ownerAddress VARCHAR(500) null,
	ownerTeleNo VARCHAR(75) null,
	ownerFaxNo VARCHAR(75) null,
	operCompName VARCHAR(75) null,
	operAddress VARCHAR(500) null,
	managerName VARCHAR(75) null,
	managerAddress VARCHAR(500) null,
	managerTeleNo VARCHAR(75) null,
	managerFaxNo VARCHAR(75) null,
	managerEmail VARCHAR(75) null,
	jtbApplicationId LONG
);

create table nbp_jtb_applications (
	uuid_ VARCHAR(75) null,
	jtbApplicationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	entityId VARCHAR(75) null,
	typeOfApplication VARCHAR(75) null,
	categoryTypeValAccomo VARCHAR(75) null,
	nonHotelSubCategory VARCHAR(75) null,
	jtbTransactionTypeVal VARCHAR(75) null,
	attractionCategoryTypeVal VARCHAR(75) null,
	domesticToursType VARCHAR(75) null,
	otherCategories VARCHAR(75) null,
	operatorName VARCHAR(75) null,
	dateOfIssue DATE null,
	dateOfExp DATE null,
	status INTEGER,
	applicationNumber VARCHAR(75) null,
	expiredLicenseAppNumber VARCHAR(75) null,
	caseId VARCHAR(500) null,
	icmDocumentsPath VARCHAR(500) null,
	pdfFileEntryId LONG,
	dateOfExpiration DATE null,
	appCurrentStageName VARCHAR(75) null
);

create table nbp_jtb_attract_detail (
	attractDetailFormInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	newAttractionsOwnerName VARCHAR(75) null,
	newAttractionsLocation VARCHAR(75) null,
	newAttractionsMailing VARCHAR(500) null,
	newAttractionsTelephone VARCHAR(75) null,
	newAttractionsFaxNum VARCHAR(75) null,
	newAttractionsEmailAddr VARCHAR(75) null,
	newAttractionsEmpNum VARCHAR(75) null,
	newAttractionsParish VARCHAR(75) null,
	jtbApplicationId LONG
);

create table nbp_jtb_attract_gen_dec (
	attractionGenDeclareInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	newAttractionsGenOwnerName VARCHAR(75) null,
	newAttractionsCompanyLaw VARCHAR(75) null,
	newAttractionsDate DATE null,
	newAttractionsName VARCHAR(75) null,
	newAttractionsStartDate DATE null,
	newAttractionsSituatedLand VARCHAR(75) null,
	newAttractionsActivities VARCHAR(75) null,
	attractionNewDate DATE null,
	jtbApplicationId LONG
);

create table nbp_jtb_bike_rental (
	attractionBikeRentalInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	applicantName VARCHAR(75) null,
	address VARCHAR(500) null,
	companyName VARCHAR(75) null,
	exactLocation VARCHAR(500) null,
	telephone VARCHAR(75) null,
	email VARCHAR(75) null,
	registrationDate DATE null,
	managerName VARCHAR(75) null,
	numberOfBikes VARCHAR(75) null,
	numberOfHelmets VARCHAR(75) null,
	numberOfEmployees VARCHAR(75) null,
	signatureDate DATE null,
	motorBikeIndustry VARCHAR(2000) null,
	jtbApplicationId LONG
);

create table nbp_jtb_branch_detail (
	jtbBranchDetailInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	counter VARCHAR(75) null,
	branchOfficeDetails VARCHAR(75) null,
	branchOfficeLocation VARCHAR(75) null,
	jtbApplicationId LONG
);

create table nbp_jtb_car_rent_condition (
	attractionCarRenConditId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ncrConditionProp VARCHAR(3000) null,
	jtbApplicationId LONG
);

create table nbp_jtb_car_rent_licence (
	attractionCarRentLicenceId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	newCarRentApplicantName VARCHAR(75) null,
	newCarRentAddress VARCHAR(75) null,
	newCarRentCompanyName VARCHAR(75) null,
	newCarRentCompanyAddr VARCHAR(75) null,
	newCarRentTelephone VARCHAR(75) null,
	newCarRentEmail VARCHAR(75) null,
	newCarRentManagerName VARCHAR(75) null,
	newCarRentDate DATE null,
	newCarRentVehiclesNo VARCHAR(75) null,
	newCarRentEmployeesNo VARCHAR(75) null,
	newCarRentOfficeLoc VARCHAR(75) null,
	newCarRentPosition VARCHAR(75) null,
	newCarRentOfficeLoc VARCHAR(75) null,
	newCarRentDate DATE null,
	jtbApplicationId LONG
);

create table nbp_jtb_car_rental_licence (
	attractionCarRentalLicId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ncrApplicantName VARCHAR(75) null,
	ncrAddress VARCHAR(500) null,
	ncrCompanyName VARCHAR(75) null,
	ncrCompanyAddr VARCHAR(500) null,
	ncrTelephone VARCHAR(75) null,
	ncrEmail VARCHAR(75) null,
	ncrManagerName VARCHAR(75) null,
	ncrDate DATE null,
	ncrVehiclesNo VARCHAR(75) null,
	ncrEmployeesNo VARCHAR(75) null,
	ncrOfficeLoc VARCHAR(75) null,
	ncrPosition VARCHAR(75) null,
	ncrSignDate DATE null,
	jtbApplicationId LONG
);

create table nbp_jtb_contract_carriage (
	attractionConCarriageInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ownerName VARCHAR(75) null,
	homeAddress VARCHAR(500) null,
	email VARCHAR(75) null,
	telephone VARCHAR(75) null,
	parish VARCHAR(75) null,
	newContractDate DATE null,
	newContarctVehiclesNo VARCHAR(75) null,
	newContractTrn VARCHAR(75) null,
	contractOrganization VARCHAR(75) null,
	ownerSignDate DATE null,
	jtbApplicationId LONG
);

create table nbp_jtb_craft_applicant (
	jtbAddCraftApplicantInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	counter VARCHAR(75) null,
	ownerName VARCHAR(75) null,
	ownerAddress VARCHAR(75) null,
	ownerPhoneNo VARCHAR(75) null,
	sellingLocation VARCHAR(75) null,
	operatingEmail VARCHAR(75) null,
	jtbApplicationId LONG
);

create table nbp_jtb_craft_employee (
	jtbAddCraftEmployeeInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	counter VARCHAR(75) null,
	empName VARCHAR(75) null,
	empAddress VARCHAR(75) null,
	empPhoneNo VARCHAR(75) null,
	jtbApplicationId LONG
);

create table nbp_jtb_craft_trader_permit (
	attractionCraftTraderId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	craftTradersAppliOwner VARCHAR(75) null,
	craftTradersAppliAddress VARCHAR(500) null,
	craftTradersAppliPhoneNo VARCHAR(75) null,
	craftTradersAppliEmail VARCHAR(75) null,
	occupyLocation VARCHAR(75) null,
	craftTraderGoodsType VARCHAR(75) null,
	craftTraderName VARCHAR(75) null,
	craftTraderPosition VARCHAR(75) null,
	craftTraderMinisterAddr VARCHAR(500) null,
	craftTraderMinisterName VARCHAR(75) null,
	craftTraderMinisterNamePos VARCHAR(75) null,
	craftTraderAddressOwner VARCHAR(500) null,
	craftTraderSignDate DATE null,
	craftTraderAssistSiDate DATE null,
	jtbApplicationId LONG
);

create table nbp_jtb_current_stage (
	jTBCurrentStageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	currentStage VARCHAR(75) null,
	lastFormStep VARCHAR(75) null,
	jtbApplicationId LONG
);

create table nbp_jtb_domestic_service (
	attractionDomesticServId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	individualsApartment VARCHAR(75) null,
	airportAssistance VARCHAR(75) null,
	entireTour VARCHAR(75) null,
	transfersDeparture VARCHAR(75) null,
	individualGroups VARCHAR(75) null,
	organizedconJunction VARCHAR(75) null,
	dailyTransportation VARCHAR(75) null,
	entertainment VARCHAR(75) null,
	domesticTourSealDate DATE null,
	jtbApplicationId LONG
);

create table nbp_jtb_domestic_tour (
	attractionDomesticTourId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	domesticTourApplicantName VARCHAR(75) null,
	domesticTourAddress VARCHAR(500) null,
	domesticTourCompanyName VARCHAR(75) null,
	domesticTourExactLocation VARCHAR(500) null,
	domesticTourTelephone VARCHAR(75) null,
	domesticTourEmail VARCHAR(75) null,
	domesticTourDate DATE null,
	domesticTourManagerName VARCHAR(75) null,
	domesticTourVehiclesNum VARCHAR(75) null,
	domesticTourEmployeesNo VARCHAR(75) null,
	domesticTourOfficeLocation VARCHAR(75) null,
	domesticTourSignDate DATE null,
	jtbApplicationId LONG
);

create table nbp_jtb_list_driver (
	jtbAddListDriverInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	counter VARCHAR(75) null,
	driverName VARCHAR(75) null,
	driverLicence VARCHAR(75) null,
	driverExpiryDate DATE null,
	jtbApplicationId LONG
);

create table nbp_jtb_list_value_regst (
	jtbAddListVehicleRegstId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	counter VARCHAR(75) null,
	vehicleRegstYear VARCHAR(75) null,
	vehicleRegstModel VARCHAR(75) null,
	vehicleRegstPlate VARCHAR(75) null,
	vehicleRegstExpDate DATE null,
	vehicleRegstFitnessDate DATE null,
	vehicleRegstChassis VARCHAR(75) null,
	vehicleRegstBased VARCHAR(75) null,
	vehicleRegstInsuranceCom VARCHAR(75) null,
	vehicleRegstPolicyNum VARCHAR(75) null,
	vehicleRegstExpiryDate DATE null,
	vehicleRegstPlateNum VARCHAR(75) null,
	jtbApplicationId LONG
);

create table nbp_jtb_non_hotel_req_lic (
	accoNonHotelRequiredLicId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	requiredLicence VARCHAR(500) null,
	requiredBedroom VARCHAR(500) null,
	requiredBathroom VARCHAR(500) null,
	jtbApplicationId LONG
);

create table nbp_jtb_payment (
	jTBPaymentMethodId LONG not null primary key,
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
	jtbApplicationId LONG
);

create table nbp_jtb_place_interest (
	attractionPlaceOfInterestId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	placeOfInterest VARCHAR(75) null,
	typeOfRole VARCHAR(75) null,
	placeInterestOwnerName VARCHAR(75) null,
	nameOfInterestLocation VARCHAR(75) null,
	placeOfInterestLocation VARCHAR(75) null,
	placeOfInterestMailing VARCHAR(75) null,
	placeOfInterestTelephone VARCHAR(75) null,
	placeOfInterestEmail VARCHAR(75) null,
	placeOfInterestEmployeesNo VARCHAR(75) null,
	placeOfInterestParish VARCHAR(75) null,
	placeOfInterestOwnerGenDec VARCHAR(75) null,
	placeOfInterestHotelLaws VARCHAR(75) null,
	placeOfInterestDate DATE null,
	placeOfInterestName VARCHAR(75) null,
	placeOfInterestOperating DATE null,
	placeOfInterestAcresLand VARCHAR(75) null,
	walkingTour VARCHAR(75) null,
	cemeteryTour VARCHAR(75) null,
	gardenTour VARCHAR(75) null,
	placeOfInterestRooms VARCHAR(75) null,
	placeOfInterestTentSpace VARCHAR(75) null,
	placeOfInterestShowers VARCHAR(75) null,
	placeOfInterestSanitary VARCHAR(75) null,
	placeOfInterestSignDate DATE null,
	jtbApplicationId LONG
);

create table nbp_jtb_tarvel_agency (
	attractionTravelAgencyId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	applicantName VARCHAR(75) null,
	agencyAddress VARCHAR(500) null,
	agencyTelephone VARCHAR(75) null,
	agencyName VARCHAR(75) null,
	agencyAddressSec VARCHAR(500) null,
	agencyTelephoneNum VARCHAR(75) null,
	isRegistered VARCHAR(75) null,
	regstParticulars VARCHAR(500) null,
	proprietorName VARCHAR(75) null,
	managerName VARCHAR(75) null,
	managerAddress VARCHAR(500) null,
	secretaryName VARCHAR(75) null,
	secretaryAddress VARCHAR(500) null,
	bankerName VARCHAR(75) null,
	bondingCompanyName VARCHAR(75) null,
	bondingCompanyAddress VARCHAR(500) null,
	auditorsName VARCHAR(75) null,
	auditorsAddress VARCHAR(500) null,
	numberOfEmployees VARCHAR(75) null,
	signDate DATE null,
	jtbApplicationId LONG
);

create table nbp_jtb_travel_halt_app (
	attractionTravelHaltAppId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	travelHaltApplicantName VARCHAR(75) null,
	travelHaltAddress VARCHAR(500) null,
	travelHaltTelephone VARCHAR(75) null,
	travelHaltEmail VARCHAR(75) null,
	travelHaltName VARCHAR(75) null,
	travelHaltLocation VARCHAR(500) null,
	travelHaltTelephoneNum VARCHAR(75) null,
	travelHaltEmployeesNo VARCHAR(75) null,
	travelHaltSignDate DATE null,
	gasStation VARCHAR(75) null,
	refreshment VARCHAR(75) null,
	drinks VARCHAR(75) null,
	restaurant VARCHAR(75) null,
	wirelessinternet VARCHAR(75) null,
	restrooms VARCHAR(75) null,
	jtbApplicationId LONG
);

create table nbp_jtb_water_employee (
	attractionWaterEmpLicId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	applicantName VARCHAR(75) null,
	applicantAddress VARCHAR(500) null,
	applicantAge VARCHAR(75) null,
	applicantNationality VARCHAR(75) null,
	workPermitApplied VARCHAR(75) null,
	workPermitDate DATE null,
	qualification VARCHAR(75) null,
	placeOfEmployment VARCHAR(75) null,
	ownerName VARCHAR(75) null,
	cpr VARCHAR(75) null,
	firstAid VARCHAR(75) null,
	medicFirstAid VARCHAR(75) null,
	lifeguard VARCHAR(75) null,
	rescueDiver VARCHAR(75) null,
	otherRescue VARCHAR(75) null,
	employeeSignatureDate DATE null,
	timePeriod VARCHAR(75) null,
	jtbApplicationId LONG
);

create table nbp_jtb_water_general (
	attractionWaterGenDeclareId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	firstAid VARCHAR(75) null,
	cpr VARCHAR(75) null,
	divingCertificate VARCHAR(75) null,
	rlss VARCHAR(75) null,
	lifeguard VARCHAR(75) null,
	breathing VARCHAR(75) null,
	operationName VARCHAR(75) null,
	operationAddress VARCHAR(500) null,
	insuranceAmount VARCHAR(75) null,
	managerSignDate DATE null,
	jtbApplicationId LONG
);

create table nbp_jtb_water_required (
	attractionWaterRequiredId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	generalOperator VARCHAR(500) null,
	waterCraft VARCHAR(500) null,
	waterSki VARCHAR(500) null,
	sunfishSail VARCHAR(500) null,
	parasail VARCHAR(500) null,
	scubaDiving VARCHAR(500) null,
	glassBoat VARCHAR(500) null,
	bananaBoat VARCHAR(500) null,
	jtbApplicationId LONG
);

create table nbp_jtb_water_sport_operate (
	attractionWaterSportId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	waterSportBusinessName VARCHAR(75) null,
	waterSportMailingaAdd VARCHAR(500) null,
	waterSportOpLocationAddr VARCHAR(500) null,
	waterSportOpPhone VARCHAR(75) null,
	waterSportOpEmail VARCHAR(75) null,
	waterSportOpOwnerName VARCHAR(75) null,
	waterSportOpAddressOwner VARCHAR(500) null,
	waterSportOpManagerName VARCHAR(75) null,
	waterSportOpApplicantName VARCHAR(75) null,
	waterSportOpNationality VARCHAR(75) null,
	waterSportOpEmployeesNo VARCHAR(75) null,
	waterSportOpActivityList VARCHAR(75) null,
	occupyLocation VARCHAR(75) null,
	proposalSubmitted VARCHAR(75) null,
	foreignNationalsInvolved VARCHAR(75) null,
	workPermitApplied VARCHAR(75) null,
	jtbApplicationId LONG
);