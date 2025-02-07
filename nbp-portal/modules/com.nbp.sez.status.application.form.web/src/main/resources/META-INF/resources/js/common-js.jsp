<script>
$(".hidePopup").click(function () {
	  $("#commonsavepopup").modal("hide");
	  $(".editDevVentureComPopup").modal("hide");
	  $(".editDevShareholderDetailPopup").modal("hide");
	  $(".editDevDirectorShareholderDetailPopup").modal("hide");
	  $(".editDevComDirectorPopup").modal("hide");
	  $(".editDevCorporationPopup").modal("hide");
	  $(".editDevDirectorBankruptPopup").modal("hide");
	  $(".editDevOperatingZoneLocationPopup").modal("hide");
	  $(".editDevSecurityMeasuresPopup").modal("hide");
	  $(".editDevOccuSafetySystemPopup").modal("hide");
	  $(".editDevDisasterMitigationPlanPopup").modal("hide");
	  $(".editOccDirectorDetailPopup").modal("hide");
	  $(".editOccDirectorShareholderPopup").modal("hide");
	  $(".editOccPrincipalOfficersPopup").modal("hide");
	  $(".editOccFreeZoneLocPopup").modal("hide");
	  $(".editOccLabourReqPopup").modal("hide");
	  $(".editZoneUserFreeZoneLocPopup").modal("hide");
	  $(".editZoneUserLabourReqPopup").modal("hide");
	  $(".editWfhLocationDetailPopup").modal("hide");
});
function validateSezDevNum(data){
	$(".wizard-navigation-box-left, .wizard-navigation-box-right").removeClass("hide");
	if($("#sezDevNumber").val() =="12345"){
		if(data == "SezOccupant"){
			$("#sezDevNumber").val("");
			$("#level-1").removeClass("hide");
			$("#sezDevNumvalidate").addClass("hide");
			$(".feeAmount").html("$USD 1,500.00");
			$("#paymentFee").val("$USD 1,500.00");
			$(".feeHeading").html("SEZ Occupant");
			$("#sezOccupantLevel2").find(" .wizard-card").removeClass("active");
			$("#sezDeveloperLevel2, #sezZoneLevel2, #sezDeveloperLevel3, #sezOccupantLevel3, #sezZoneUserLevel3").addClass("hide");
			$(".sezDevApplicationFormTab, #sezDevApplicationForm, #sezDeveloperSupportingDoc, .sezDevApplicationPreviewTab, #sezDevApplicationPreview").addClass("hide");
			$(".sezZoneApplicationFormTab, #sezZoneApplicationForm, #sezZoneSupportingDoc, .sezZoneApplicationPreviewTab, #sezZoneApplicationPreview").addClass("hide");
			$("#sezOccupantLevel2, .sezOccApplicationFormTab, #sezOccApplicationForm, #sezOccupantSupportingDoc, .sezOccApplicationPreviewTab, #sezOccApplicationPreview").removeClass("hide");
		}
		if(data == "SezZoneUser"){
			$("#sezDevNumber").val("");
			$("#level-1").removeClass("hide");
			$("#sezDevNumvalidate").addClass("hide");
			$(".feeAmount").html("$USD 100.00");
			$("#paymentFee").val("$USD 100.00");
			$(".feeHeading").html("SEZ Zone User");
			$("#sezZoneLevel2").find(" .wizard-card").removeClass("active");
			$("#sezDeveloperLevel2, #sezOccupantLevel2, #sezDeveloperLevel3, #sezOccupantLevel3, #sezZoneUserLevel3").addClass("hide");
			$(".sezDevApplicationFormTab, #sezDevApplicationForm, #sezDeveloperSupportingDoc, .sezDevApplicationPreviewTab, #sezDevApplicationPreview").addClass("hide");
			$(".sezOccApplicationFormTab, #sezOccApplicationForm, #sezOccupantSupportingDoc, .sezOccApplicationPreviewTab, #sezOccApplicationPreview").addClass("hide");
			$("#sezZoneLevel2, .sezZoneApplicationFormTab, #sezZoneApplicationForm, #sezZoneSupportingDoc, .sezZoneApplicationPreviewTab, #sezZoneApplicationPreview").removeClass("hide");
		}
		if(data == "SezMsmeOccupant"){
			$("#sezDevNumber").val("");
			$("#level-1").removeClass("hide");
			$("#sezDevNumvalidate").addClass("hide");
		}
	}else{
		$("#notSezDev").removeClass("hide");
	}
}
$(".sez-dev-back-btn").click(function(){
	$("#level-1").removeClass("hide");
	$("#sezDevNumvalidate").addClass("hide");
	$("#level-1").find(".wizard-card").removeClass("active");
	$(".wizard-navigation-box-left, .wizard-navigation-box-right").removeClass("hide");
});
function nextTab(elem) {
	$(elem).parent().next()
			.find('a[data-toggle="tab"]').click();
}
function showPreviewInLastStage(){
	previewDeveloperGeneralBusinessInfo();
	previewDeveloperShareholdingInfo();
	previewDeveloperProposedPorjectInfo();
	previewDeveloperProposedDevelopmentInfo();
	previewDeveloperEmployeeSafetyInfo();
	previewDeveloperEmployementInfo();
	previewDeveloperDisasterManagementInfo();
	previewDeveloperInvestmentInfo();
	previewDeveloperUndertakingInfo();
	previewDeveloperSubmissionChecklistInfo();
	previewZoneGeneralBusinessInfo();
	previewZoneProposedProjInfo();
	previewZoneInvestmentInfo();
	previewZoneEmploymentInfo();
	previewZoneZoneUserUndertakingInfo();
	previewZoneDeveloperUndertakingInfo();
	previewZoneSubmissionChecklistInfo();
	previewOccupantGeneralBusinessInfo();
	previewOccupantShareholdingInfo();
	previewOccupantProposedProjInfo();
	previewOccupantProposedDevelopmentInfo();
	previewOccupantInvestmentInfo();
	previewOccupantEmploymentInfo();
	previewOccupantZoneUndertakingInfo();
	previewOccupantDeveloperUndertakingInfo();
	previewOccupantSubmissionChecklistInfo();
	}
	
/* SEZ Dev Preview Start */
 
function previewDeveloperGeneralBusinessInfo(){
	devAppDate = $("#devAppDate").val();
	devAppName = $("#devAppName").val();
	devAppAddress = $("#devAppAddress").val();
	devCompanyName = $("#devCompanyName").val();
	devCompanyStreetAddress = $("#devCompanyStreetAddress").val();
	devCompanyTown = $("#devCompanyTown").val();
	devCompanyZipCode = $("#devCompanyZipCode").val();
	devCountry = $("#devCountry").val();
	devTelephone = $("#devTelephone").val();
	devFax = $("#devFax").val();
	devEmail = $("#devEmail").val();
	devWebsite = $("#devWebsite").val();
	devLocalStreetAddress = $("#devLocalStreetAddress").val();
	devLocalTown = $("#devLocalTown").val();
	devLocalZipCode = $("#devLocalZipCode").val();
	devRepName = $("#devRepName").val();
	devRepStreetAddress = $("#devRepStreetAddress").val();
	devRepTown = $("#devRepTown").val();
	devRepZipCode = $("#devRepZipCode").val();
	devRepCountry = $("#devRepCountry").val();
	devRepTelephone = $("#devRepTelephone").val();
	devRepFax = $("#devRepFax").val();
	devRepEmail = $("#devRepEmail").val();
	devJointVenture = $("input[name ='devJointVenture']:checked").val();
	devJointVenCompanyName = $("#devJointVenCompanyName").val();
	devJointVenStreetAddress = $("#devJointVenStreetAddress").val();
	devJointVenTown = $("#devJointVenTown").val();
	devJointVenZipCode = $("#devJointVenZipCode").val();
	devJointVenCountry = $("#devJointVenCountry").val();
	devJointVenTelephone = $("#devJointVenTelephone").val();
	devJointVenFax = $("#devJointVenFax").val();
	devJointVenEmail = $("#devJointVenEmail").val();
	devExistingCom = $("input[name='devExistingCom']:checked").val();
	devFormArticle = $("#devFormArticle").val();
	devFormArticleOther = $("#devFormArticleOther").val();
	devCompanyClassified = $("input[name='devCompanyClassified']:checked").val();
	devTRN = $("#devTRN").val();
	devGCT = $("#devGCT").val();
	devTCC = $("#devTCC").val();

	$("#devAppDatePreview").html(devAppDate);
	$("#devAppNamePreview").html(devAppName);
	$("#devAppAddressPreview").html(devAppAddress);
	$("#devCompanyNamePreview").html(devCompanyName);
	$("#devCompanyStreetAddressPreview").html(devCompanyStreetAddress);
	$("#devCompanyTownPreview").html(devCompanyTown);
	$("#devCompanyZipCodePreview").html(devCompanyZipCode);
	$("#devCountryPreview").html(devCountry);
	$("#devTelephonePreview").html(devTelephone);
	$("#devFaxPreview").html(devFax);
	$("#devEmailPreview").html(devEmail);
	$("#devWebsitePreview").html(devWebsite);
	$("#devLocalStreetAddressPreview").html(devLocalStreetAddress);
	$("#devLocalTownPreview").html(devLocalTown);
	$("#devLocalZipCodePreview").html(devLocalZipCode);
	$("#devRepNamePreview").html(devRepName);
	$("#devRepStreetAddressPreview").html(devRepStreetAddress);
	$("#devRepTownPreview").html(devRepTown);
	$("#devRepZipCodePreview").html(devRepZipCode);
	$("#devRepCountryPreview").html(devRepCountry);
	$("#devRepTelephonePreview").html(devRepTelephone);
	$("#devRepFaxPreview").html(devRepFax);
	$("#devRepEmailPreview").html(devRepEmail);
	$("#devJointVenturePreview").html(devJointVenture);
	$("#devJointVenCompanyNamePreview").html(devJointVenCompanyName);
	$("#devJointVenStreetAddressPreview").html(devJointVenStreetAddress);
	$("#devJointVenTownPreview").html(devJointVenTown);
	$("#devJointVenZipCodePreview").html(devJointVenZipCode);
	$("#devJointVenCountryPreview").html(devJointVenCountry);
	$("#devJointVenTelephonePreview").html(devJointVenTelephone);
	$("#devJointVenFaxPreview").html(devJointVenFax);
	$("#devJointVenEmailPreview").html(devJointVenEmail);
	$("#devExistingComPreview").html(devExistingCom);
	$("#devFormArticlePreview").html(devFormArticle);
	$("#devFormArticleOtherPreview").html(devFormArticleOther);
	$("#devCompanyClassifiedPreview").html(devCompanyClassified);
	$("#devTRNPreview").html(devTRN);
	$("#devGCTPreview").html(devGCT);
	$("#devTCCPreview").html(devTCC);
}
function previewDeveloperShareholdingInfo(){
	devEquityAuthorised = $("#devEquityAuthorised").val();
	devEquitySubscribed = $("#devEquitySubscribed").val();
	devEquityPaidCapital = $("#devEquityPaidCapital").val();
	$("#devEquityAuthorisedPreview").html(devEquityAuthorised);
	$("#devEquitySubscribedPreview").html(devEquitySubscribed);
	$("#devEquityPaidCapitalPreview").html(devEquityPaidCapital);
	/* addOnForms */
	shareholderName = $("#shareholderName").val();
	shareholderStreetAddress = $("#shareholderStreetAddress").val();
	shareholderZipCode = $("#shareholderZipCode").val();
	shareholderCountry = $("#shareholderCountry").val();
	shareholderNationality = $("#shareholderNationality").val();
	shareholderTRN = $("#shareholderTRN").val();
	$("#shareholderNamePreview").html(shareholderName);
	$("#shareholderStreetAddressPreview").html(shareholderStreetAddress);
	$("#shareholderZipCodePreview").html(shareholderZipCode);
	$("#shareholderCountryPreview").html(shareholderCountry);
	$("#shareholderNationalityPreview").html(shareholderNationality);
	$("#shareholderTRNPreview").html(shareholderTRN);
	/* addOnForms */
	principalShareholderName = $("#principalShareholderName").val();
	principalShareholderShares = $("#principalShareholderShares").val();
	$("#principalShareholderNamePreview").html(principalShareholderName);
	$("#principalShareholderSharesPreview").html(principalShareholderShares);
	/* addOnForms */
	/* addOnForms */
	comDirectorName = $("#comDirectorName").val();
	comDirectorCompanyName = $("#comDirectorCompanyName").val();
	comDirectorRelationship = $("#comDirectorRelationship").val();
	$("#comDirectorNamePreview").html(comDirectorName);
	$("#comDirectorCompanyNamePreview").html(comDirectorCompanyName);
	$("#comDirectorRelationshipPreview").html(comDirectorRelationship);
	/* addOnForms */
	comCorporationPersonName = $("#comCorporationPersonName").val();
	comCorporationName = $("#comCorporationName").val();
	comCorporationRelationship = $("#comCorporationRelationship").val();
	$("#comCorporationPersonNamePreview").html(comCorporationPersonName);
	$("#comCorporationNamePreview").html(comCorporationName);
	$("#comCorporationRelationshipPreview").html(comCorporationRelationship);
	/* addOnForms */
	comDirectorBankruptInvolve = $("input[name='comDirectorBankruptInvolve']:checked").val();
	$("#comDirectorBankruptInvolvePreview").html(comDirectorBankruptInvolve);
	/* addOnForms */
	comDirectorBankruptName = $("#comDirectorBankruptName").val();
	$("#comDirectorBankruptNamePreview").html(comDirectorBankruptName);
}
function previewDeveloperProposedPorjectInfo(){
	sezFreePreviousZone = $("input[name='sezFreePreviousZone']:checked").val();
	sezFreeCurrentZone = $("#sezFreeCurrentZone").val();
	$("#sezFreePreviousZonePreview").html(sezFreePreviousZone);
	$("#sezFreeCurrentZonePreview").html(sezFreeCurrentZone);
	
	/* addOnForms */
	sezFreeCurrentZoneName = $("#sezFreeCurrentZoneName").val();
	sezFreeCurrentZoneParish = $("#sezFreeCurrentZoneParish").val();
	$("#sezFreeCurrentZoneNamePreview").html(sezFreeCurrentZoneName);
	$("#sezFreeCurrentZoneParishPreview").html(sezFreeCurrentZoneParish);
	businessZoneNature = $("#businessZoneNature").val();
	distributedOutputPerLocal = $("#distributedOutputPerLocal").val();
	distributedOutputPerOverseas = $("#distributedOutputPerOverseas").val();
	sezProposedName = $("#sezProposedName").val();
	$("#businessZoneNaturePreview").html(businessZoneNature);
	$("#distributedOutputPerLocalPreview").html(distributedOutputPerLocal);
	$("#distributedOutputPerOverseasPreview").html(distributedOutputPerOverseas);
	$("#sezProposedNamePreview").html(sezProposedName);
	applicationEconomicZone = $("#applicationEconomicZone").val();
	applicationSpecialisedZoneDesc = $("#applicationSpecialisedZoneDesc").val();
	seaPortDistanceKM = $("#seaPortDistanceKM").val();
	seaPortDistanceMI = $("#seaPortDistanceMI").val();
	airportDistanceKM = $("#airportDistanceKM").val();
	airportDistanceMI = $("#airportDistanceMI").val();
	$("#applicationEconomicZonePreview").html(applicationEconomicZone);
	$("#applicationSpecialisedZoneDescPreview").html(applicationSpecialisedZoneDesc);
	$("#seaPortDistanceKMPreview").html(seaPortDistanceKM);
	$("#seaPortDistanceMIPreview").html(seaPortDistanceMI);
	$("#airportDistanceKMPreview").html(airportDistanceKM);
	$("#airportDistanceMIPreview").html(airportDistanceMI);
	roadDistanceKM = $("#roadDistanceKM").val();
	roadDistanceMI = $("#roadDistanceMI").val();
	railDistanceKM = $("#railDistanceKM").val();
	railDistanceMI = $("#railDistanceMI").val();
	$("#roadDistanceKMPreview").html(roadDistanceKM);
	$("#roadDistanceMIPreview").html(roadDistanceMI);
	$("#railDistanceKMPreview").html(railDistanceKM);
	$("#railDistanceMIPreview").html(railDistanceMI);
	customDistanceKM = $("#customDistanceKM").val();
	customDistanceMI = $("#customDistanceMI").val();
	proposedLandMeasurement = $("#proposedLandMeasurement").val();
	buildingSquareFootage = $("#buildingSquareFootage").val();
	$("#customDistanceKMPreview").html(customDistanceKM);
	$("#customDistanceMIPreview").html(customDistanceMI);
	$("#proposedLandMeasurementPreview").html(proposedLandMeasurement);
	$("#buildingSquareFootagePreview").html(buildingSquareFootage);
	landSquareFootage = $("#landSquareFootage").val();
	landOwnership = $("#landOwnership").val();
	otherSpecifyLandOwnership = $("#otherSpecifyLandOwnership").val();
	landOwnerName = $("#landOwnerName").val();
	landOwnerAddrOne = $("#landOwnerAddrOne").val();
	landOwnerAddrTwo = $("#landOwnerAddrTwo").val();
	$("#landSquareFootagePreview").html(landSquareFootage);
	$("#landOwnershipPreview").html(landOwnership);
	$("#otherSpecifyLandOwnershipPreview").html(otherSpecifyLandOwnership);
	$("#landOwnerNamePreview").html(landOwnerName);
	$("#landOwnerAddrOnePreview").html(landOwnerAddrOne);
	$("#landOwnerAddrTwoPreview").html(landOwnerAddrTwo);
	leaseAgreeTenure = $("#leaseAgreeTenure").val();
	stepToAcquireLand = $("input[name='stepToAcquireLand']:checked").val();
	proposedAreaDesc = $("#proposedAreaDesc").val();
	freeZonePrmissionDenied = $("input[name='freeZonePrmissionDenied']:checked").val();
	deniedPermissionDetail = $("#deniedPermissionDetail").val();
	$("#leaseAgreeTenurePreview").html(leaseAgreeTenure);
	$("#stepToAcquireLandPreview").html(stepToAcquireLand);
	$("#proposedAreaDescPreview").html(proposedAreaDesc);
	$("#freeZonePrmissionDeniedPreview").html(freeZonePrmissionDenied);
	$("#deniedPermissionDetailPreview").html(deniedPermissionDetail);
}
function previewDeveloperProposedDevelopmentInfo(){
	existingBuildingForBusi = $("input[name='existingBuildingForBusi']:checked").val();
	existingBuildingForBusiDetailing = $("#existingBuildingForBusiDetailing").val();
	activitiesForSingleEntity = $("#activitiesForSingleEntity").val();
	sezDevelopmentVolume = $("#sezDevelopmentVolume").val();
	$("#existingBuildingForBusiPreview").html(existingBuildingForBusi);
	$("#existingBuildingForBusiDetailingPreview").html(existingBuildingForBusiDetailing);
	$("#activitiesForSingleEntityPreview").html(activitiesForSingleEntity);
	$("#sezDevelopmentVolumePreview").html(sezDevelopmentVolume);
	sezDevelopmentFolio = $("#sezDevelopmentFolio").val();
	sezDevelopmentStreetAddress = $("#sezDevelopmentStreetAddress").val();
	sezDevelopmentTown = $("#sezDevelopmentTown").val();
	sezDevelopmentZipCode = $("#sezDevelopmentZipCode").val();
	$("#sezDevelopmentFolioPreview").html(sezDevelopmentFolio);
	$("#sezDevelopmentStreetAddressPreview").html(sezDevelopmentStreetAddress);
	$("#sezDevelopmentTownPreview").html(sezDevelopmentTown);
	$("#sezDevelopmentZipCodePreview").html(sezDevelopmentZipCode);
	zoningClassification = $("#zoningClassification").val();
	sezDevelopmentLandUse = $("#sezDevelopmentLandUse").val();
	sezAreaDevelopmentHectareArea = $("#sezAreaDevelopmentHectareArea").val();
	sezAreaDevelopmentAcresArea = $("#sezAreaDevelopmentAcresArea").val();
	$("#zoningClassificationPreview").html(zoningClassification);
	$("#sezDevelopmentLandUsePreview").html(sezDevelopmentLandUse);
	$("#sezAreaDevelopmentHectareAreaPreview").html(sezAreaDevelopmentHectareArea);
	$("#sezAreaDevelopmentAcresAreaPreview").html(sezAreaDevelopmentAcresArea);
	sezCustomsDevelopmentHectareArea = $("#sezCustomsDevelopmentHectareArea").val();
	sezCustomsDevelopmentAcresArea = $("#sezCustomsDevelopmentAcresArea").val();
	topography = $("#topography").val();
	northBoundaries = $("#northBoundaries").val();
	$("#sezCustomsDevelopmentHectareAreaPreview").html(sezCustomsDevelopmentHectareArea);
	$("#sezCustomsDevelopmentAcresAreaPreview").html(sezCustomsDevelopmentAcresArea);
	$("#topographyPreview").html(topography);
	$("#northBoundariesPreview").html(northBoundaries);
	eastBoundaries = $("#eastBoundaries").val();
	westBoundaries = $("#westBoundaries").val();
	southBoundaries = $("#southBoundaries").val();
	customLandMeasurement = $("#customLandMeasurement").val();
	$("#eastBoundariesPreview").html(eastBoundaries);
	$("#westBoundariesPreview").html(westBoundaries);
	$("#southBoundariesPreview").html(southBoundaries);
	$("#customLandMeasurementPreview").html(customLandMeasurement);
	customPercent = $("#customPercent").val();
	commonLandMeasurement = $("#commonLandMeasurement").val();
	commonPercent = $("#commonPercent").val();
	bufferLandMeasurement = $("#bufferLandMeasurement").val();
	$("#customPercentPreview").html(customPercent);
	$("#commonLandMeasurementPreview").html(commonLandMeasurement);
	$("#commonPercentPreview").html(commonPercent);
	$("#bufferLandMeasurementPreview").html(bufferLandMeasurement);
	bufferPercent = $("#bufferPercent").val();
	zoneLandMeasurement = $("#zoneLandMeasurement").val();
	zonePercent = $("#zonePercent").val();
	residentialLandMeasurement = $("#residentialLandMeasurement").val();
	$("#bufferPercentPreview").html(bufferPercent);
	$("#zoneLandMeasurementPreview").html(zoneLandMeasurement);
	$("#zonePercentPreview").html(zonePercent);
	$("#residentialLandMeasurementPreview").html(residentialLandMeasurement);
	residentialPercent = $("#residentialPercent").val();
	totalLandMeasurement = $("#totalLandMeasurement").val();
	totalPercent = $("#totalPercent").val();
	industrialWaterReq = $("#industrialWaterReq").val();
	$("#residentialPercentPreview").html(residentialPercent);
	$("#totalLandMeasurementPreview").html(totalLandMeasurement);
	$("#totalPercentPreview").html(totalPercent);
	$("#industrialWaterReqPreview").html(industrialWaterReq);
	drinkingWaterReq = $("#drinkingWaterReq").val();
	otherWaterReq = $("#otherWaterReq").val();
	totalWaterReq = $("#totalWaterReq").val();
	disposalMode = $("#disposalMode").val();
	$("#drinkingWaterReqPreview").html(drinkingWaterReq);
	$("#otherWaterReqPreview").html(otherWaterReq);
	$("#totalWaterReqPreview").html(totalWaterReq);
	$("#disposalModePreview").html(disposalMode);
	wasteWaterTreatment = $("#wasteWaterTreatment").val();
	powerReqirement = $("#powerReqirement").val();
	mainRoadWidth = $("#mainRoadWidth").val();
	mainRoadPavement = $("#mainRoadPavement").val();
	$("#wasteWaterTreatmentPreview").html(wasteWaterTreatment);
	$("#powerReqirementPreview").html(powerReqirement);
	$("#mainRoadWidthPreview").html(mainRoadWidth);
	$("#mainRoadPavementPreview").html(mainRoadPavement);
	secondaryRoadWidth = $("#secondaryRoadWidth").val();
	secondaryRoadPavement = $("#secondaryRoadPavement").val();
	tertiaryRoadWidth = $("#tertiaryRoadWidth").val();
	tertiaryRoadPavement = $("#tertiaryRoadPavement").val();
	$("#secondaryRoadWidthPreview").html(secondaryRoadWidth);
	$("#secondaryRoadPavementPreview").html(secondaryRoadPavement);
	$("#tertiaryRoadWidthPreview").html(tertiaryRoadWidth);
	$("#tertiaryRoadPavementPreview").html(tertiaryRoadPavement);
	waterInstallationReq = $("input[name='waterInstallationReq']:checked").val();
	powerInstallationReq = $("input[name='powerInstallationReq']:checked").val();
	teleComInstallationReq = $("input[name='teleComInstallationReq']:checked").val();
	cctvInstallationReq = $("input[name='cctvInstallationReq']:checked").val();
	securityInterconnection = $("input[name='securityInterconnection']:checked").val();
	fireFightingInstallationReq = $("input[name='fireFightingInstallationReq']:checked").val();
	$("#waterInstallationReqPreview").html(waterInstallationReq);
	$("#powerInstallationReqPreview").html(powerInstallationReq);
	$("#teleComInstallationReqPreview").html(teleComInstallationReq);
	$("#cctvInstallationReqPreview").html(cctvInstallationReq);
	$("#securityInterconnectionPreview").html(securityInterconnection);
	$("#fireFightingInstallationReqPreview").html(fireFightingInstallationReq);
}
function previewDeveloperEmployeeSafetyInfo(){
	/* addOnForms */
	securityMeasures = $("#securityMeasures").val();
	/* addOnForms */
	occuSafetySystem = $("#occuSafetySystem").val();
	$("#securityMeasuresPreview").html(securityMeasures);
	$("#occuSafetySystemPreview").html(occuSafetySystem);
}
function previewDeveloperEmployementInfo(){
	directFirstYrEm = $("#directFirstYrEm").val();
	indirectFirstYrEm = $("#indirectFirstYrEm").val();
	maleDirectFirstYrEm = $("#maleDirectFirstYrEm").val();
	femaleDirectFirstYrEm = $("#femaleDirectFirstYrEm").val();
	localFirstYrEm = $("#localFirstYrEm").val();
	foreignFirstYrEm = $("#foreignFirstYrEm").val();
	directSecondYrEm = $("#directSecondYrEm").val();
	indirectSecondYrEm = $("#indirectSecondYrEm").val();
	maleDirectSecondYrEm = $("#maleDirectSecondYrEm").val();
	femaleDirectSecondYrEm = $("#femaleDirectSecondYrEm").val();
	localSecondYrEm = $("#localSecondYrEm").val();
	foreignSecondYrEm = $("#foreignSecondYrEm").val();
	directThirdYrEm = $("#directThirdYrEm").val();
	indirectThirdYrEm = $("#indirectThirdYrEm").val();
	maleDirectThirdYrEm = $("#maleDirectThirdYrEm").val();
	femaleDirectThirdYrEm = $("#femaleDirectThirdYrEm").val();
	localThirdYrEm = $("#localThirdYrEm").val();
	foreignThirdYrEm = $("#foreignThirdYrEm").val();
	$("#directFirstYrEmPreview").html(directFirstYrEm);
	$("#indirectFirstYrEmPreview").html(indirectFirstYrEm);
	$("#maleDirectFirstYrEmPreview").html(maleDirectFirstYrEm);
	$("#femaleDirectFirstYrEmPreview").html(femaleDirectFirstYrEm);
	$("#localFirstYrEmPreview").html(localFirstYrEm);
	$("#foreignFirstYrEmPreview").html(foreignFirstYrEm);
	$("#directSecondYrEmPreview").html(directSecondYrEm);
	$("#indirectSecondYrEmPreview").html(indirectSecondYrEm);
	$("#maleDirectSecondYrEmPreview").html(maleDirectSecondYrEm);
	$("#femaleDirectSecondYrEmPreview").html(femaleDirectSecondYrEm);
	$("#localSecondYrEmPreview").html(localSecondYrEm);
	$("#foreignSecondYrEmPreview").html(foreignSecondYrEm);
	$("#directThirdYrEmPreview").html(directThirdYrEm);
	$("#indirectThirdYrEmPreview").html(indirectThirdYrEm);
	$("#maleDirectThirdYrEmPreview").html(maleDirectThirdYrEm);
	$("#femaleDirectThirdYrEmPreview").html(femaleDirectThirdYrEm);	
	$("#localThirdYrEmPreview").html(localThirdYrEm);
	$("#foreignThirdYrEmPreview").html(foreignThirdYrEm);
}
function previewDeveloperDisasterManagementInfo(){
	comDisasterManagement = $("input[name='comDisasterManagement']:checked").val();
	/* addOnForms */
	disasterMitigationPlan = $("#disasterMitigationPlan").val();
	$("#comDisasterManagementPreview").html(comDisasterManagement);
	$("#disasterMitigationPlanPreview").html(disasterMitigationPlan);
}
function previewDeveloperInvestmentInfo(){
	landValue = $("#landValue").val();
	factoryDevCost = $("#factoryDevCost").val();
	onSiteInfrastructure = $("#onSiteInfrastructure").val();
	portInvestDetails = $("#portInvestDetails").val();
	airportInvestDetails = $("#airportInvestDetails").val();
	otherInvestDetails = $("#otherInvestDetails").val();
	totalInvestDetails = $("#totalInvestDetails").val();
	totalLDI = $("#totalLDI").val();
	totalFDI = $("#totalFDI").val();
	fdiComName = $("#fdiComName").val();
	fdiResidentAddr = $("#fdiResidentAddr").val();
	fundSources = $("#fundSources").val();
	$("#landValuePreview").html(landValue);
	$("#factoryDevCostPreview").html(factoryDevCost);
	$("#onSiteInfrastructurePreview").html(onSiteInfrastructure);
	$("#portInvestDetailsPreview").html(portInvestDetails);
	$("#airportInvestDetailsPreview").html(airportInvestDetails);
	$("#otherInvestDetailsPreview").html(otherInvestDetails);
	$("#totalInvestDetailsPreview").html(totalInvestDetails);
	$("#totalLDIPreview").html(totalLDI);
	$("#totalFDIPreview").html(totalFDI);
	$("#fdiComNamePreview").html(fdiComName);
	$("#fdiResidentAddrPreview").html(fdiResidentAddr);
	$("#fundSourcesPreview").html(fundSources);
}
function previewDeveloperUndertakingInfo(){
	applicantTitle = $("#applicantTitle").val();
	applicantName = $("#applicantName").val();
	applicantTeleNum = $("#applicantTeleNum").val();
	applicantEmail = $("#applicantEmail").val();
	applicantSignatureDate = $("#applicant-signature-date").val();
	publicNotaryName = $("#publicNotaryName").val();
	publicNotarySignatureDate = $("#public-notary-signature-date").val();
	$("#applicantTitlePreview").html(applicantTitle);
	$("#applicantNamePreview").html(applicantName);
	$("#applicantTeleNumPreview").html(applicantTeleNum);
	$("#applicantEmailPreview").html(applicantEmail);
	$("#applicantSignatureDatePreview").html(applicantSignatureDate);
	$("#publicNotaryNamePreview").html(publicNotaryName);
	$("#publicNotarySignatureDatePreview").html(publicNotarySignatureDate);
}
function previewDeveloperSubmissionChecklistInfo(){
	var selectedGeneral = new Array();
	$("input:checkbox[name=generalReq]:checked").each(function(){
		selectedGeneral.push($(this).val());
	});
	$("#selectedGeneralPreview").html(selectedGeneral);
	var selectedComInfoReq = new Array();
	$("input:checkbox[name=comInfoReq]:checked").each(function(){
		selectedComInfoReq.push($(this).val());
	});
	paidShareCapProof = $("input[name='paidShareCapProof']:checked").val();
	
	var selectedSwornStateReq = new Array();
	$("input:checkbox[name=swornStateReq]:checked").each(function(){
		selectedSwornStateReq.push($(this).val());
	});
	var selectedLandOccuReq = new Array();
	$("input:checkbox[name=landOccuReq]:checked").each(function(){
		selectedLandOccuReq.push($(this).val());
	});
	var selectedSafetyHealthReq = new Array();
	$("input:checkbox[name=safetyHealthReq]:checked").each(function(){
		selectedSafetyHealthReq.push($(this).val());
	});
	var selectedLandDevlopmentReq = new Array();
	$("input:checkbox[name=landDevlopmentReq]:checked").each(function(){
		selectedLandDevlopmentReq.push($(this).val());
	});
	var selectedTechInfoReq = new Array();
	$("input:checkbox[name=techInfoReq]:checked").each(function(){
		selectedTechInfoReq.push($(this).val());
	});
	var selectedSezPreliminaryReq = new Array();
	$("input:checkbox[name=sezPreliminaryReq]:checked").each(function(){
		selectedSezPreliminaryReq.push($(this).val());
	});
	var selectedSezDevDetailReq = new Array();
	$("input:checkbox[name=sezDevDetailReq]:checked").each(function(){
		selectedSezDevDetailReq.push($(this).val());
	});
	var selectedApprovalReq = new Array();
	$("input:checkbox[name=approvalReq]:checked").each(function(){
		selectedApprovalReq.push($(this).val());
	});
	nameReq = $("#nameReq").val();
	dateReq = $("#dateReq").val();
	$("#selectedComInfoReqPreview").html(selectedComInfoReq);
	$("#paidShareCapProofPreview").html(paidShareCapProof);
	$("#selectedSwornStateReqPreview").html(selectedSwornStateReq);
	$("#selectedLandOccuReqPreview").html(selectedLandOccuReq);
	$("#selectedSafetyHealthReqPreview").html(selectedSafetyHealthReq);
	$("#selectedLandDevlopmentReqPreview").html(selectedLandDevlopmentReq);
	$("#selectedTechInfoReqPreview").html(selectedTechInfoReq);
	$("#selectedSezPreliminaryReqPreview").html(selectedSezPreliminaryReq);
	$("#selectedSezDevDetailReqPreview").html(selectedSezDevDetailReq);
	$("#selectedApprovalReqPreview").html(selectedApprovalReq);
	$("#nameReqPreview").html(nameReq);
	$("#dateReqPreview").html(dateReq);
}
/* SEZ Dev Preview End */
/* SEZ OCC Preview Start */
 function previewOccupantGeneralBusinessInfo(){
	occAppDate = $("#occAppDate").val();
	occSezDevName = $("#occSezDevName").val();
	occSezDevControlNum = $("#occSezDevControlNum").val();
	occCompanyName = $("#occCompanyName").val();
	occCompanyStreetAddress = $("#occCompanyStreetAddress").val();
	occCompanyTown = $("#occCompanyTown").val();
	occCompanyParish = $("#occCompanyParish").val();
	occAuthRepName = $("#occAuthRepName").val();
	occAuthRepStreetAddress = $("#occAuthRepStreetAddress").val();
	occAuthRepTown = $("#occAuthRepTown").val();
	occAuthRepZipCode = $("#occAuthRepZipCode").val();
	occAuthRepCountry = $("#occAuthRepCountry").val();
	occSponsorComName = $("#occSponsorComName").val();
	occSponsorStreetAddress = $("#occSponsorStreetAddress").val();
	occSponsorTown = $("#occSponsorTown").val();
	occSponsorZipCode = $("#occSponsorZipCode").val();
	occSponsorCountry = $("#occSponsorCountry").val();
	occExistingCom = $("input[name='occExistingCom']:checked").val();
	occFormArticle = $("#occFormArticle").val();
	occFormArticleOther = $("#occFormArticleOther").val();
	occTRN = $("#occTRN").val();
	occGCT = $("#occGCT").val();
	occTCC = $("#occTCC").val();
	$("#occAppDatePreview").html(occAppDate);
	$("#occSezDevNamePreview").html(occSezDevName);
	$("#occSezDevControlNumPreview").html(occSezDevControlNum);
	$("#occCompanyNamePreview").html(occCompanyName);
	$("#occCompanyStreetAddressPreview").html(occCompanyStreetAddress);
	$("#occCompanyTownPreview").html(occCompanyTown);
	$("#occCompanyParishPreview").html(occCompanyParish);
	$("#occAuthRepNamePreview").html(occAuthRepName);
	$("#occAuthRepStreetAddressPreview").html(occAuthRepStreetAddress);
	$("#occAuthRepTownPreview").html(occAuthRepTown);
	$("#occAuthRepZipCodePreview").html(occAuthRepZipCode);
	$("#occAuthRepCountryPreview").html(occAuthRepCountry);
	$("#occSponsorComNamePreview").html(occSponsorComName);
	$("#occSponsorStreetAddressPreview").html(occSponsorStreetAddress);
	$("#occSponsorTownPreview").html(occSponsorTown);
	$("#occSponsorZipCodePreview").html(occSponsorZipCode);
	$("#occSponsorCountryPreview").html(occSponsorCountry);
	$("#occExistingComPreview").html(occExistingCom);
	$("#occFormArticlePreview").html(occFormArticle);
	$("#occFormArticleOtherPreview").html(occFormArticleOther);
	$("#occTRNPreview").html(occTRN);
	$("#occGCTPreview").html(occGCT);
	$("#occTCCPreview").html(occTCC);
}
function previewOccupantShareholdingInfo(){
	occAuthorised = $("#occAuthorised").val();
	occSubscribed = $("#occSubscribed").val();
	occPaidCapital = $("#occPaidCapital").val();
	$("#occAuthorisedPreview").html(occAuthorised);
	$("#occSubscribedPreview").html(occSubscribed);
	$("#occPaidCapitalPreview").html(occPaidCapital);
	/* addOnForm */
	occDirectorName = $("#directorName").val();
	occDirectorStreetAddress = $("#directorStreetAddress").val();
	occDirectorZipCode = $("#directorZipCode").val();
	occDirectorCountry = $("#directorCountry").val();
	$("#occDirectorNamePreview").html(occDirectorName);
	$("#occDirectorStreetAddressPreview").html(occDirectorStreetAddress);
	$("#occDirectorZipCodePreview").html(occDirectorZipCode);
	$("#occDirectorCountryPreview").html(occDirectorCountry);
	/* addOnForm */
	occShareholderName = $("#occShareholderName").val();
	occShareholderNationality = $("#occShareholderNationality").val();
	occShareholderShares = $("#occShareholderShares").val();
	$("#occShareholderNamePreview").html(occShareholderName);
	$("#occShareholderNationalityPreview").html(occShareholderNationality);
	$("#occShareholderSharesPreview").html(occShareholderShares);
	/* addOnForm */
	occPrincipalName = $("#occPrincipalName").val();
	occPrincipalPosition = $("#occPrincipalPosition").val();
	$("#occPrincipalNamePreview").html(occPrincipalName);
	$("#occPrincipalPositionPreview").html(occPrincipalPosition);
}
function previewOccupantProposedProjInfo(){
	occBusinessDesc = $("#occBusinessDesc").val();
	occDeniedFreeZoneAppr = $("input[name='occDeniedFreeZoneAppr']:checked").val();
	occDeniedFreeZoneApprDate = $("#occDeniedFreeZoneApprDate").val();
	occDeniedFreeZoneApprType = $("#occDeniedFreeZoneApprType").val();
	occFreeZoneLocation = $("input[name='occFreeZoneLocation']:checked").val();
	occSezDevLoc = $("#occSezDevLoc").val();
	occSezDevLocDesc = $("#occSezDevLocDesc").val();
	occSubConcessionBuilding = $("#occSubConcessionBuilding").val();
	occSubConcessionTown = $("#occSubConcessionTown").val();
	occSubConcessionParish = $("#occSubConcessionParish").val();
	occCompleteSurveyTechDesc = $("input[name='occCompleteSurveyTechDesc']:checked").val();
	occNorthBoundaries = $("#occNorthBoundaries").val();
	occEastBoundaries = $("#occEastBoundaries").val();
	occWestBoundaries = $("#occWestBoundaries").val();
	occSouthBoundaries = $("#occSouthBoundaries").val();
	occOwnership = $("input[name='occOwnership']:checked").val();
	occLeaseYears = $("#occLeaseYears").val();
	occVolume = $("#occVolume").val();
	occFolio = $("#occFolio").val();
	occFloorNum = $("#occFloorNum").val();
	occUndertakenService = $("#occUndertakenService").val();
	occUndertakenManufacturing = $("#occUndertakenManufacturing").val();
	occSeaPortDistanceKM = $("#occSeaPortDistanceKM").val();
	occSeaPortDistanceMI = $("#occSeaPortDistanceMI").val();
	occAirportDistanceKM = $("#occAirportDistanceKM").val();
	occAirportDistanceMI = $("#occAirportDistanceMI").val();
	occRoadDistanceKM = $("#occRoadDistanceKM").val();
	occRoadDistanceMI = $("#occRoadDistanceMI").val();
	occRailDistanceKM = $("#occRailDistanceKM").val();
	occRailDistanceMI = $("#occRailDistanceMI").val();
	occCustomDistanceKM = $("#occCustomDistanceKM").val();
	occCustomDistanceMI = $("#occCustomDistanceMI").val();
	$("#occBusinessDescPreview").html(occBusinessDesc);
	$("#occDeniedFreeZoneApprPreview").html(occDeniedFreeZoneAppr);
	$("#occDeniedFreeZoneApprDatePreview").html(occDeniedFreeZoneApprDate);
	$("#occDeniedFreeZoneApprTypePreview").html(occDeniedFreeZoneApprType);
	$("#occFreeZoneLocationPreview").html(occFreeZoneLocation);
	$("#occSezDevLocPreview").html(occSezDevLoc);
	$("#occSezDevLocDescPreview").html(occSezDevLocDesc);
	$("#occSubConcessionBuildingPreview").html(occSubConcessionBuilding);
	$("#occSubConcessionTownPreview").html(occSubConcessionTown);
	$("#occSubConcessionParishPreview").html(occSubConcessionParish);
	$("#occCompleteSurveyTechDescPreview").html(occCompleteSurveyTechDesc);
	$("#occNorthBoundariesPreview").html(occNorthBoundaries);
	$("#occEastBoundariesPreview").html(occEastBoundaries);
	$("#occWestBoundariesPreview").html(occWestBoundaries);
	$("#occSouthBoundariesPreview").html(occSouthBoundaries);
	$("#occOwnershipPreview").html(occOwnership);
	$("#occLeaseYearsPreview").html(occLeaseYears);
	$("#occVolumePreview").html(occVolume);
	$("#occFolioPreview").html(occFolio);
	$("#occFloorNumPreview").html(occFloorNum);
	$("#occUndertakenServicePreview").html(occUndertakenService);
	$("#occUndertakenManufacturingPreview").html(occUndertakenManufacturing);
	$("#occSeaPortDistanceKMPreview").html(occSeaPortDistanceKM);
	$("#occSeaPortDistanceMIPreview").html(occSeaPortDistanceMI);
	$("#occAirportDistanceKMPreview").html(occAirportDistanceKM);
	$("#occAirportDistanceMIPreview").html(occAirportDistanceMI);
	$("#occRoadDistanceKMPreview").html(occRoadDistanceKM);
	$("#occRoadDistanceMIPreview").html(occRoadDistanceMI);	
	$("#occRailDistanceKMPreview").html(occRailDistanceKM);
	$("#occRailDistanceMIPreview").html(occRailDistanceMI);
	$("#occCustomDistanceKMPreview").html(occCustomDistanceKM);
	$("#occCustomDistanceMIPreview").html(occCustomDistanceMI);
}
function previewOccupantProposedDevelopmentInfo(){
	occProcessingArea = $("#occProcessingArea").val();
	occNonProcessingArea = $("#occNonProcessingArea").val();
	occOfficeRequirement = $("#occOfficeRequirement").val();
	occFactoryRequirement = $("#occFactoryRequirement").val();
	occOtherAreaReqName = $("#occOtherAreaReqName").val();
	occOtherAreaRequirement = $("#occOtherAreaRequirement").val();
	$("#occProcessingAreaPreview").html(occProcessingArea);
	$("#occNonProcessingAreaPreview").html(occNonProcessingArea);
	$("#occOfficeRequirementPreview").html(occOfficeRequirement);
	$("#occFactoryRequirementPreview").html(occFactoryRequirement);
	$("#occOtherAreaReqNamePreview").html(occOtherAreaReqName);
	$("#occOtherAreaRequirementPreview").html(occOtherAreaRequirement);
}
function previewOccupantInvestmentInfo(){
	occInfraBuilding = $("#occInfraBuilding").val();
	occInfraEquipment = $("#occInfraEquipment").val();
	occInfraMachines = $("#occInfraMachines").val();
	occInfraTotal = $("#occInfraTotal").val();
	occInfraFinanceSource = $("#occInfraFinanceSource").val();
	$("#occInfraBuildingPreview").html(occInfraBuilding);
	$("#occInfraEquipmentPreview").html(occInfraEquipment);
	$("#occInfraMachinesPreview").html(occInfraMachines);
	$("#occInfraTotalPreview").html(occInfraTotal);
	$("#occInfraFinanceSourcePreview").html(occInfraFinanceSource);
}
function previewOccupantEmploymentInfo(){
	/* addOnForm */
	occLabourYear = $("#occLabourYear").val();
	occLabourDirect = $("#occLabourDirect").val();
	occLabourMale = $("#occLabourMale").val();
	occLabourFemale = $("#occLabourFemale").val();
	occLabourLocal = $("#occLabourLocal").val();
	occLabourForeign = $("#occLabourForeign").val();
	$("#occLabourYearPreview").html(occLabourYear);
	$("#occLabourDirectPreview").html(occLabourDirect);
	$("#occLabourMalePreview").html(occLabourMale);
	$("#occLabourFemalePreview").html(occLabourFemale);
	$("#occLabourLocalPreview").html(occLabourLocal);
	$("#occLabourForeignPreview").html(occLabourForeign);
}
function previewOccupantZoneUndertakingInfo(){
	occApplicantTitle = $("#occApplicantTitle").val();
	occApplicantName = $("#occApplicantName").val();
	occApplicantTeleNum = $("#occApplicantTeleNum").val();
	occApplicantEmail = $("#occApplicantEmail").val();
	occApplicantSignatureDate = $("#occ-applicant-signature-date").val();
	occPublicNotaryName = $("#occPublicNotaryName").val();
	occPublicNotarySignatureDate = $("#occ-public-notary-signature-date").val();
	$("#occApplicantTitlePreview").html(occApplicantTitle);
	$("#occApplicantNamePreview").html(occApplicantName);
	$("#occApplicantTeleNumPreview").html(occApplicantTeleNum);
	$("#occApplicantEmailPreview").html(occApplicantEmail);
	$("#occApplicantSignatureDatePreview").html(occApplicantSignatureDate);
	$("#occPublicNotaryNamePreview").html(occPublicNotaryName);
	$("#occPublicNotarySignatureDatePreview").html(occPublicNotarySignatureDate);
}
function previewOccupantDeveloperUndertakingInfo(){
	occUndertakingDevName = $("#occUndertakingDevName").val();
	occUndertakingApprLetter = $("#occUndertakingApprLetter").val();
	occUndertakingDate = $("#occUndertakingDate").val();
	occUndertakingAgreeNum = $("#occUndertakingAgreeNum").val();
	occUndertakingAgreeDate = $("#occUndertakingAgreeDate").val();
	occUndertakingControlNum = $("#occUndertakingControlNum").val();
	occDevApplicantTitle = $("#occDevApplicantTitle").val();
	occDevApplicantName = $("#occDevApplicantName").val();
	occDevApplicantTele = $("#occDevApplicantTele").val();
	occDevApplicantEmail = $("#occDevApplicantEmail").val();
	occDevApplicantSignatureDate = $("#occ-dev-applicant-signature-date").val();
	occDevPublicNotaryName = $("#occDevPublicNotaryName").val();
	occDevPublicNotarySignatureDate = $("#occ-dev-public-notary-signature-date").val();
	$("#occUndertakingDevNamePreview").html(occUndertakingDevName);
	$("#occUndertakingApprLetterPreview").html(occUndertakingApprLetter);
	$("#occUndertakingDatePreview").html(occUndertakingDate);
	$("#occUndertakingAgreeNumPreview").html(occUndertakingAgreeNum);
	$("#occUndertakingAgreeDatePreview").html(occUndertakingAgreeDate);
	$("#occUndertakingControlNumPreview").html(occUndertakingControlNum);
	$("#occDevApplicantTitlePreview").html(occDevApplicantTitle);
	$("#occDevApplicantNamePreview").html(occDevApplicantName);
	$("#occDevApplicantTelePreview").html(occDevApplicantTele);
	$("#occDevApplicantEmailPreview").html(occDevApplicantEmail);
	$("#occDevApplicantSignatureDatePreview").html(occDevApplicantSignatureDate);
	$("#occDevPublicNotaryNamePreview").html(occDevPublicNotaryName);
	$("#occDevPublicNotarySignatureDatePreview").html(occDevPublicNotarySignatureDate);
}
function previewOccupantSubmissionChecklistInfo(){
	var selectedOccGeneral = new Array();
	$("input:checkbox[name=occGeneralReq]:checked").each(function(){
		selectedOccGeneral.push($(this).val());
	});
	var selectedOccComInfoReq = new Array();
	$("input:checkbox[name=occComInfoReq]:checked").each(function(){
		selectedOccComInfoReq.push($(this).val());
	});
	occPaidShareCapProof = $("input[name='occPaidShareCapProof']:checked").val();
	var selectedOccSwornStateReq = new Array();
	$("input:checkbox[name=occSwornStateReq]:checked").each(function(){
		selectedOccSwornStateReq.push($(this).val());
	});
	var selectedOccSupportingDoc = new Array();
	$("input:checkbox[name=occSupportingDoc]:checked").each(function(){
		selectedOccSupportingDoc.push($(this).val());
	});
	var selectedOccFacilitiesReq = new Array();
	$("input:checkbox[name=occFacilitiesReq]:checked").each(function(){
		selectedOccFacilitiesReq.push($(this).val());
	});
	var selectedOccApprovals = new Array();
	$("input:checkbox[name=occApprovals]:checked").each(function(){
		selectedOccApprovals.push($(this).val());
	});
	var selectedOccSecurityReq = new Array();
	$("input:checkbox[name=occSecurityReq]:checked").each(function(){
		selectedOccSecurityReq.push($(this).val());
	});
	var selectedOccDetailedBusiPlan = new Array();
	$("input:checkbox[name=occDetailedBusiPlan]:checked").each(function(){
		selectedOccDetailedBusiPlan.push($(this).val());
	});
	occNameReq = $("#occNameReq").val();
	occDateReq = $("#occDateReq").val();
	$("#selectedOccGeneralPreview").html(selectedOccGeneral);
	$("#selectedOccComInfoReqPreview").html(selectedOccComInfoReq);
	$("#occPaidShareCapProofPreview").html(occPaidShareCapProof);
	$("#selectedOccSwornStateReqPreview").html(selectedOccSwornStateReq);
	$("#selectedOccSupportingDocPreview").html(selectedOccSupportingDoc);
	$("#selectedOccFacilitiesReqPreview").html(selectedOccFacilitiesReq);
	$("#selectedOccApprovalsPreview").html(selectedOccApprovals);
	$("#selectedOccSecurityReqPreview").html(selectedOccSecurityReq);
	$("#selectedOccDetailedBusiPlanPreview").html(selectedOccDetailedBusiPlan);
	$("#occNameReqPreview").html(occNameReq);
	$("#occDateReqPreview").html(occDateReq);
}
 /*Sez Occ End*/
 /*sex zone start*/
 function previewZoneGeneralBusinessInfo(){
	zoneUserAppDate = $("#zoneUserAppDate").val();
	sezZoneUserDevName = $("#sezZoneUserDevName").val();
	sezZoneUserLocName = $("#sezZoneUserLocName").val();
	sezZoneDevControlNum = $("#sezZoneDevControlNum").val();
	zoneUserCompanyName = $("#zoneUserCompanyName").val();
	zoneUserCompanyStreetAddress = $("#zoneUserCompanyStreetAddress").val();
	zoneUserCompanyTown = $("#zoneUserCompanyTown").val();
	zoneUserCompanyParish = $("#zoneUserCompanyParish").val();
	zoneUserAuthRepName = $("#zoneUserAuthRepName").val();
	zoneUserAuthRepStreetAddress = $("#zoneUserAuthRepStreetAddress").val();
	zoneUserAuthRepTown = $("#zoneUserAuthRepTown").val();
	zoneUserAuthRepZipCode = $("#zoneUserAuthRepZipCode").val();
	zoneUserAuthRepCountry = $("#zoneUserAuthRepCountry").val();
	zoneUserSponsorComName = $("#zoneUserSponsorComName").val();
	zoneUserSponsorStreetAddress = $("#zoneUserSponsorStreetAddress").val();
	zoneUserSponsorTown = $("#zoneUserSponsorTown").val();
	zoneUserSponsorZipCode = $("#zoneUserSponsorZipCode").val();
	zoneUserSponsorCountry = $("#zoneUserSponsorCountry").val();
	zoneUserExistingCom = $("input[name='zoneUserExistingCom']:checked").val();
	zoneUserFormArticle = $("#zoneUserFormArticle").val();
	zoneUserFormArticleOther = $("#zoneUserFormArticleOther").val();
	zoneUserNonResiCom = $("input[name='zoneUserNonResiCom']:checked").val();
	zoneUserTRN = $("#zoneUserTRN").val();
	zoneUserGCT = $("#zoneUserGCT").val();
	zoneUserTCC = $("#zoneUserTCC").val();
	$("#zoneUserAppDatePreview").html(zoneUserAppDate);
	$("#sezZoneUserDevNamePreview").html(sezZoneUserDevName);
	$("#sezZoneUserLocNamePreview").html(sezZoneUserLocName);
	$("#sezZoneDevControlNumPreview").html(sezZoneDevControlNum);
	$("#zoneUserCompanyNamePreview").html(zoneUserCompanyName);
	$("#zoneUserCompanyStreetAddressPreview").html(zoneUserCompanyStreetAddress);
	$("#zoneUserCompanyTownPreview").html(zoneUserCompanyTown);
	$("#zoneUserCompanyParishPreview").html(zoneUserCompanyParish);
	$("#zoneUserAuthRepNamePreview").html(zoneUserAuthRepName);
	$("#zoneUserAuthRepStreetAddressPreview").html(zoneUserAuthRepStreetAddress);
	$("#zoneUserAuthRepTownPreview").html(zoneUserAuthRepTown);
	$("#zoneUserAuthRepZipCodePreview").html(zoneUserAuthRepZipCode);
	$("#zoneUserAuthRepCountryPreview").html(zoneUserAuthRepCountry);
	$("#zoneUserSponsorComNamePreview").html(zoneUserSponsorComName);
	$("#zoneUserSponsorStreetAddressPreview").html(zoneUserSponsorStreetAddress);
	$("#zoneUserSponsorTownPreview").html(zoneUserSponsorTown);
	$("#zoneUserSponsorZipCodePreview").html(zoneUserSponsorZipCode);
	$("#zoneUserSponsorCountryPreview").html(zoneUserSponsorCountry);
	$("#zoneUserExistingComPreview").html(zoneUserExistingCom);
	$("#zoneUserFormArticlePreview").html(zoneUserFormArticle);
	$("#zoneUserFormArticleOtherPreview").html(zoneUserFormArticleOther);
	$("#zoneUserNonResiComPreview").html(zoneUserNonResiCom);
	$("#zoneUserTRNPreview").html(zoneUserTRN);
	$("#zoneUserGCTPreview").html(zoneUserGCT);
	$("#zoneUserTCCPreview").html(zoneUserTCC);
}
function previewZoneProposedProjInfo(){
	zoneUserEntityDeniedAppr = $("input[name='zoneUserEntityDeniedAppr']:checked").val();
	zoneUserDeniedApprDate = $("#zoneUserDeniedApprDate").val();
	zoneUserDeniedApprProjectType = $("#zoneUserDeniedApprProjectType").val();
	zoneUserFreeZoneLocation = $("input[name='zoneUserFreeZoneLocation']:checked").val();
	$("#zoneUserEntityDeniedApprPreview").html(zoneUserEntityDeniedAppr);
	$("#zoneUserDeniedApprDatePreview").html(zoneUserDeniedApprDate);
	$("#zoneUserDeniedApprProjectTypePreview").html(zoneUserDeniedApprProjectType);
	$("#zoneUserFreeZoneLocationPreview").html(zoneUserFreeZoneLocation);
	/* addOnForm */
	zoneUserSezDevLoc = $("#zoneUserSezDevLoc").val();
	zoneUserSezDevLocDesc = $("#zoneUserSezDevLocDesc").val();
	$("#zoneUserSezDevLocPreview").html(zoneUserSezDevLoc);
	$("#zoneUserSezDevLocDescPreview").html(zoneUserSezDevLocDesc);
	
	zoneUserLeasedBuildingNum = $("#zoneUserLeasedBuildingNum").val();
	zoneUserLeasedTown = $("#zoneUserLeasedTown").val();
	zoneUserLeasedParish = $("#zoneUserLeasedParish").val();
	zoneUserLeaseYears = $("#zoneUserLeaseYears").val();
	zoneUserVolume = $("#zoneUserVolume").val();
	zoneUserFolio = $("#zoneUserFolio").val();
	zoneUserFloorNum = $("#zoneUserFloorNum").val();
	$("#zoneUserLeasedBuildingNumPreview").html(zoneUserLeasedBuildingNum);
	$("#zoneUserLeasedTownPreview").html(zoneUserLeasedTown);
	$("#zoneUserLeasedParishPreview").html(zoneUserLeasedParish);
	$("#zoneUserLeaseYearsPreview").html(zoneUserLeaseYears);
	$("#zoneUserVolumePreview").html(zoneUserVolume);
	$("#zoneUserFolioPreview").html(zoneUserFolio);
	$("#zoneUserFloorNumPreview").html(zoneUserFloorNum);
}
function previewZoneInvestmentInfo(){
	zoneUserInfraBuilding = $("#zoneUserInfraBuilding").val();
	zoneUserInfraEquipment = $("#zoneUserInfraEquipment").val();
	zoneUserInfraMachines = $("#zoneUserInfraMachines").val();
	zoneUserInfraTotal = $("#zoneUserInfraTotal").val();
	var selectedZoneUserFinanceSource = new Array();
	$("input:checkbox[name=zoneUserFinanceSource]:checked").each(function(){
		selectedZoneUserFinanceSource.push($(this).val());
	});
	zoneUserOtherFinanceSource = $("#zoneUserOtherFinanceSource").val();
	$("#zoneUserInfraBuildingPreview").html(zoneUserInfraBuilding);
	$("#zoneUserInfraEquipmentPreview").html(zoneUserInfraEquipment);
	$("#zoneUserInfraMachinesPreview").html(zoneUserInfraMachines);
	$("#zoneUserInfraTotalPreview").html(zoneUserInfraTotal);
	$("#selectedZoneUserFinanceSourcePreview").html(selectedZoneUserFinanceSource);
	$("#zoneUserOtherFinanceSourcePreview").html(zoneUserOtherFinanceSource);
}
function previewZoneEmploymentInfo(){
	zoneUserLabourYear = $("#zoneUserLabourYear").val();
	zoneUserLabourDirect = $("#zoneUserLabourDirect").val();
	zoneUserLabourMale = $("#zoneUserLabourMale").val();
	zoneUserLabourFemale = $("#zoneUserLabourFemale").val();
	zoneUserLabourLocal = $("#zoneUserLabourLocal").val();
	zoneUserLabourForeign = $("#zoneUserLabourForeign").val();
	$("#zoneUserLabourYearPreview").html(zoneUserLabourYear);
	$("#zoneUserLabourDirectPreview").html(zoneUserLabourDirect);
	$("#zoneUserLabourMalePreview").html(zoneUserLabourMale);
	$("#zoneUserLabourFemalePreview").html(zoneUserLabourFemale);
	$("#zoneUserLabourLocalPreview").html(zoneUserLabourLocal);
	$("#zoneUserLabourForeignPreview").html(zoneUserLabourForeign);
}
function previewZoneZoneUserUndertakingInfo(){
	zoneUserDeclarantTitle = $("#zoneUserDeclarantTitle").val();
	zoneUserDeclarantName = $("#zoneUserDeclarantName").val();
	zoneUserDeclarantTeleNum = $("#zoneUserDeclarantTeleNum").val();
	zoneUserDeclarantEmail = $("#zoneUserDeclarantEmail").val();
	zoneUserApplicantSignatureDate = $("#zone-user-applicant-signature-date").val();
	zoneUserPublicNotaryName = $("#zoneUserPublicNotaryName").val();
	zoneUserPublicNotarySignatureDate = $("#zone-user-public-notary-signature-date").val();
	$("#zoneUserDeclarantTitlePreview").html(zoneUserDeclarantTitle);
	$("#zoneUserDeclarantNamePreview").html(zoneUserDeclarantName);
	$("#zoneUserDeclarantTeleNumPreview").html(zoneUserDeclarantTeleNum);
	$("#zoneUserDeclarantEmailPreview").html(zoneUserDeclarantEmail);
	$("#zoneUserApplicantSignatureDatePreview").html(zoneUserApplicantSignatureDate);
	$("#zoneUserPublicNotaryNamePreview").html(zoneUserPublicNotaryName);
	$("#zoneUserPublicNotarySignatureDatePreview").html(zoneUserPublicNotarySignatureDate);
}
function previewZoneDeveloperUndertakingInfo(){
	zoneDevUndertakingDevName = $("#zoneDevUndertakingDevName").val();
	zoneDevUndertakingApprLetter = $("#zoneDevUndertakingApprLetter").val();
	zoneDevUndertakingDate = $("#zoneDevUndertakingDate").val();
	zoneDevUndertakingAgreeNum = $("#zoneDevUndertakingAgreeNum").val();
	zoneDevUndertakingAgreeDate = $("#zoneDevUndertakingAgreeDate").val();
	zoneDevUndertakingControlNum = $("#zoneDevUndertakingControlNum").val();
	zoneDevApplicantTitle = $("#zoneDevApplicantTitle").val();
	zoneDevApplicantName = $("#zoneDevApplicantName").val();
	zoneDevApplicantTele = $("#zoneDevApplicantTele").val();
	zoneDevApplicantEmail = $("#zoneDevApplicantEmail").val();
	zoneDevApplicantSignatureDate = $("#zone-dev-applicant-signature-date").val();
	zonedevupnotarysignatureName = $("#zoneDevPublicNotaryName").val();
	zonedevupnotarysignaturedate = $("#zone-dev-up-notary-signature-date").val();
	$("#zoneDevUndertakingDevNamePreview").html(zoneDevUndertakingDevName);
	$("#zoneDevUndertakingApprLetterPreview").html(zoneDevUndertakingApprLetter);
	$("#zoneDevUndertakingDatePreview").html(zoneDevUndertakingDate);
	$("#zoneDevUndertakingAgreeNumPreview").html(zoneDevUndertakingAgreeNum);
	$("#zoneDevUndertakingAgreeDatePreview").html(zoneDevUndertakingAgreeDate);
	$("#zoneDevUndertakingControlNumPreview").html(zoneDevUndertakingControlNum);
	$("#zoneDevApplicantTitlePreview").html(zoneDevApplicantTitle);
	$("#zoneDevApplicantNamePreview").html(zoneDevApplicantName);
	$("#zoneDevApplicantTelePreview").html(zoneDevApplicantTele);
	$("#zoneDevApplicantEmailPreview").html(zoneDevApplicantEmail);
	$("#zoneDevApplicantSignatureDatePreview").html(zoneDevApplicantSignatureDate);
	$("#zoneDevPublicNotaryNamePreview").html(zonedevupnotarysignatureName);
	$("#zone-dev-up-notary-signature-datePreview").html(zonedevupnotarysignaturedate);
}
function previewZoneSubmissionChecklistInfo(){
	var selectedZoneUserGeneralReq = new Array();
	$("input:checkbox[name=zoneUserGeneralReq]:checked").each(function(){
		selectedZoneUserGeneralReq.push($(this).val());
	});
	var selectedZoneUserComInfoReq = new Array();
	$("input:checkbox[name=zoneUserComInfoReq]:checked").each(function(){
		selectedZoneUserComInfoReq.push($(this).val());
	});
	var selectedZoneSwornStateReq = new Array();
	$("input:checkbox[name=zoneSwornStateReq]:checked").each(function(){
		selectedZoneSwornStateReq.push($(this).val());
	});
	var selectedZoneOccupancyReq = new Array();
	$("input:checkbox[name=zoneOccupancyReq]:checked").each(function(){
		selectedZoneOccupancyReq.push($(this).val());
	});
	var selectedZoneUserApprovals = new Array();
	$("input:checkbox[name=zoneUserApprovals]:checked").each(function(){
		selectedZoneUserApprovals.push($(this).val());
	});
	zoneUserNameReq = $("#zoneUserNameReq").val();
	zoneUserDateReq = $("#zoneUserDateReq").val();
	$("#selectedZoneUserGeneralReqPreview").html(selectedZoneUserGeneralReq);
	$("#selectedZoneUserComInfoReqPreview").html(selectedZoneUserComInfoReq);
	$("#selectedZoneSwornStateReqPreview").html(selectedZoneSwornStateReq);
	$("#selectedZoneOccupancyReqPreview").html(selectedZoneOccupancyReq);
	$("#selectedZoneUserApprovalsPreview").html(selectedZoneUserApprovals);
	$("#zoneUserNameReqPreview").html(zoneUserNameReq);
	$("#zoneUserDateReqPreview").html(zoneUserDateReq);
}
/*sez zone end*/
/*sez wfh start*/
 function previewWorkFormHomeInfo(){
	companyName = $("#companyNameWfh").val();
	contactPersonName = $("#contactPersonNameWfh").val();
	contactPersonEmail = $("#contactPersonEmailWfh").val();
	controlNumberWorkFromHome = $("#controlNumberWfh").val();
	workerUtillizingWorkFromHome = $("#workerUtillizingWFH").val();
	workerMonthsUtillizingWFH = $("#workerMonthsUtillizingWFH").val();
	$("#companyNameWfhPreview").html(companyName);
	$("#contactPersonNameWfhPreview").html(contactPersonName);
	$("#contactPersonEmailWfhPreview").html(contactPersonEmail);
	$("#controlNumberWfhPreview").html(controlNumberWorkFromHome);
	$("#workerUtillizingWFHPreview").html(workerUtillizingWorkFromHome);
	$("#workerMonthsUtillizingWFHPreview").html(workerMonthsUtillizingWFH);
}
	/* DEVELOPER EDIT TABS */
	$("#dev-general-list-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#dev-general-list-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#dev-director-list-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#dev-director-list-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#dev-project-brief-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#dev-project-brief-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#dev-proposed-dev-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#dev-proposed-dev-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#dev-safety-list-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#dev-safety-list-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#dev-employment-list-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#dev-employment-list-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#dev-disaster-management-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#dev-disaster-management-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#dev-investment-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#dev-investment-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#dev-dev-undertaking-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#dev-dev-undertaking-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#dev-submission-check-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#dev-submission-check-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	/* OCCUPANT EDIT TABS */
	$("#occ-general-list-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#occ-general-list-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#occ-director-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#occ-director-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#occ-proposed-project-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#occ-proposed-project-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#occ-dev-plan-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#occ-dev-plan-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#occ-investment-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#occ-investment-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#occ-employment-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#occ-employment-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#occ-user-undertaking-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#occ-user-undertaking-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#occ-dev-undertaking-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#occ-dev-undertaking-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#occ-submission-list-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#occ-submission-list-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	/* ZONE USER EDIT TABS */
	$("#zone-general-list-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#zone-general-list-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#zone-proposed-project-list-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#zone-proposed-project-list-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#zone-investment-plan-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#zone-investment-plan-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#zone-employment-plan-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#zone-employment-plan-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#zone-undertaking-info-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#zone-undertaking-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#zone-dev-undertaking-info-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#zone-dev-undertaking-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#zone-submission-checklist-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#zone-submission-checklist-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	$("#supporting-doc-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusSupportingDocumentFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $(".supporting-documents").addClass("active");
	       $(".rm, .supporting-documents").removeClass("activated");
		   $(".last-step").removeClass("activated");
	       $(".last-step").removeClass("active");
	       scrollToPageTop();
		   
	   });
	$("#fee-payment-edit-tab").click(function(){
		   $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFeePaymentFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $(".fee-payment").addClass("active");
	       $(".fee-payment").removeClass("activated");
		   $(".last-step").removeClass("activated");
 	   $(".last-step").removeClass("active");
 	   scrollToPageTop();
	   });
	$("#work-from-home-list-edit-tab").click(function(){
		  $('#SezStatusPreviewFieldset').removeClass("show");
		   $('#SezStatusFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#zone-submission-checklist-info-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
</script>