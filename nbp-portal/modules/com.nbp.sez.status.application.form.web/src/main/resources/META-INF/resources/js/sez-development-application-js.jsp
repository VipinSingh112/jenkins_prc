<jsp:include page="/init.jsp" />
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@page import="javax.portlet.RenderResponse"%>
<%@page import="javax.portlet.PortletResponse"%>
<liferay-theme:defineObjects />
<portlet:defineObjects />
<portlet:resourceURL var="addDevVentureComInfoUrl" id="addDevVentureComInfoUrl"/>
<portlet:resourceURL var="addDevShareholderInfoUrl" id="addDevShareholderInfoUrl"/>
<portlet:resourceURL var="addDevDirectorShareholderInfoUrl" id="addDevDirectorShareholderInfoUrl"/>
<portlet:resourceURL var="addDevComDirectorInfoUrl" id="addDevComDirectorInfoUrl"/>
<portlet:resourceURL var="addDevCorporationInfoUrl" id="addDevCorporationInfoUrl"/>
<portlet:resourceURL var="addDirectorBankruptInvolveInfoUrl" id="addDirectorBankruptInvolveInfoUrl"/>
<portlet:resourceURL var="addOperatingZoneLocationInfoUrl" id="addOperatingZoneLocationInfoUrl"/>
<portlet:resourceURL var="addSecurityMeasuresInfoUrl" id="addSecurityMeasuresInfoUrl"/>
<portlet:resourceURL var="addOccuSafetySystemInfoUrl" id="addOccuSafetySystemInfoUrl"/>
<portlet:resourceURL var="addDisasterMitigationPlanInfoUrl" id="addDisasterMitigationPlanInfoUrl"/>
<portlet:resourceURL var="addDeveloperGeneralBusinessInfoUrl" id="/developer/general/business/info"/>
<portlet:resourceURL var="addDeveloperGenBusinessParentComAndAddressUrl" id="/developer/gen/business/parent/com/add"/>
<portlet:resourceURL var="addDeveloperShareholdingInfoUrl" id="/developer/shareholding/info"/>
<portlet:resourceURL var="addShareholdingDetailOfPrincipleUrl" id="/shareholding/detail/of/principle"/>
<portlet:resourceURL var="addShareholdingPrincipleShareholderUrl" id="/shareholding/principle/Shareholder"/>
<portlet:resourceURL var="addListOfComDirectorUrl" id="/list/of/com/director"/>
<portlet:resourceURL var="addCorporationBusinessUrl" id="/corporation/business"/>
<portlet:resourceURL var="addNameOfDirectorUrl" id="name/of/director"/>
<portlet:resourceURL var="addDeveloperProposedPorjectInfoUrl" id="/developer/proposed/porject/info"/>
<portlet:resourceURL var="addProjectPleaseStateUrl" id="/project/please/state"/>
<portlet:resourceURL var="addProposedDevelopmentInfoUrl" id="/proposed/Development/Info"/>
<portlet:resourceURL var="addDevEmployeeSafetyInfoUrl" id="/dev/employee/safety/info"/>
<portlet:resourceURL var="addDevDefineYourOccuUrl" id="/dev/define/your/occu"/>
<portlet:resourceURL var="addDevEmployementUrl" id="/dev/employement"/>
<portlet:resourceURL var="addDevDisasterManagementInfoUrl" id="/dev/disaster/management"/>
<portlet:resourceURL var="addDeveloperDisasterManagementUrl" id="/developer/Disaster/Management/add"/>
<portlet:resourceURL var="addDeveloperInvestmentInfoUrl" id="/developer/Investment/Info"/>
<portlet:resourceURL var="addDeveloperUndertakingInfoUrl" id="/developer/undertaking/Info"/>
<portlet:resourceURL var="addDeveloperSubmissionChecklistInfoUrl" id="/developer/submission/checklist/Info"/>

<script>

function developerGeneralBusinessInfo(isSaveAndCont) {
	devAppDate = $("#devAppDate").val();
	devAppName = $("#devAppName").val();
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
	devExistingCom = $("input[name='devExistingCom']:checked").val();
	devFormArticle = $("#devFormArticle").val();
	devFormArticleOther = $("#devFormArticleOther").val();
	devCompanyClassified = $("input[name='devCompanyClassified']:checked").val();
	devTRN = $("#devTRN").val();
	devGCT = $("#devGCT").val();
	devTCC = $("#devTCC").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	submitForm= true;
	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	if(!devRepEmail){
		  $("#devRepEmailValidation").removeClass("hide");
		  $("#devRepEmailValidation").text("Please Enter E-mail address");
		  $("#devRepEmail").focus();
		  submitForm= false;
	  }else if(devRepEmail.match(mailformat)){ 
			$("#devRepEmailValidation").addClass("hide");
		}else
			{
				$("#devRepEmailValidation").removeClass("hide");
				$("#devRepEmailValidation").text("You have entered an invalid email address");
				$("#devRepEmail").focus();
				submitForm= false;
			}
	if(!devEmail){
		  $("#devEmailValidation").removeClass("hide");
		  $("#devEmailValidation").text("Please Enter E-mail address");
		  $("#devEmail").focus();
		  submitForm= false;
	  }else if(devRepEmail.match(mailformat)){ 
			$("#devEmailValidation").addClass("hide");
		}else
			{
				$("#devEmailValidation").removeClass("hide");
				$("#devEmailValidation").text("You have entered an invalid email address");
				$("#devEmail").focus();
				submitForm= false;
			}
	if(!devAppName){
		$("#devAppNameValidation").removeClass("hide");
		$("#devAppName").focus();
		submitForm= false;
	}else{
		$("#devAppNameValidation").addClass("hide");
	}
	if(!devRepName){
		$("#devRepNameValidation").removeClass("hide");
		$("#devRepName").focus();
		submitForm= false;
	}else{
		$("#devRepNameValidation").addClass("hide");
	}
	
	if(submitForm){
		$.ajax({
			type : "POST",
			url : "${addDeveloperGeneralBusinessInfoUrl}",
			data : {
				"<portlet:namespace/>devAppDate" : devAppDate,
				"<portlet:namespace/>devAppName" : devAppName,
				"<portlet:namespace/>devCompanyName" : devCompanyName,
				"<portlet:namespace/>devCompanyStreetAddress" : devCompanyStreetAddress,
				"<portlet:namespace/>devCompanyTown" : devCompanyTown,
				"<portlet:namespace/>devCompanyZipCode" : devCompanyZipCode,
				"<portlet:namespace/>devCountry" : devCountry,
				"<portlet:namespace/>devTelephone" : devTelephone,
				"<portlet:namespace/>devFax" : devFax,
				"<portlet:namespace/>devEmail" : devEmail,
				"<portlet:namespace/>devWebsite" : devWebsite,
				"<portlet:namespace/>devLocalStreetAddress" : devLocalStreetAddress,
				"<portlet:namespace/>devLocalTown" : devLocalTown,
				"<portlet:namespace/>devLocalZipCode" : devLocalZipCode,
				"<portlet:namespace/>devRepName" : devRepName,
				"<portlet:namespace/>devRepStreetAddress" : devRepStreetAddress,
				"<portlet:namespace/>devRepTown" : devRepTown,
		        "<portlet:namespace/>devRepZipCode" : devRepZipCode,
		        "<portlet:namespace/>devRepCountry" : devRepCountry,
		        "<portlet:namespace/>devRepTelephone" : devRepTelephone,
		        "<portlet:namespace/>devRepFax" : devRepFax,
		        "<portlet:namespace/>devRepEmail" : devRepEmail,
		        "<portlet:namespace/>devJointVenture" : devJointVenture,
		        "<portlet:namespace/>devExistingCom" : devExistingCom,
		        "<portlet:namespace/>devFormArticle" : devFormArticle,
		        "<portlet:namespace/>devFormArticleOther" : devFormArticleOther,
		        "<portlet:namespace/>devCompanyClassified" : devCompanyClassified,
		        "<portlet:namespace/>devTRN" : devTRN,
		        "<portlet:namespace/>devGCT" : devGCT,
		        "<portlet:namespace/>devTCC" : devTCC,
		        "<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
			},
			success : function(data) {
				if(!isSaveAndCont){
					nextButtonCall();
				}
				
				addVentureComInfoBox();
			}
		});
	}
} 
function AddMoreParentCompanyNameAndAddress(){
	devVentureComInfoVal = $("#devVentureComInfoVal").val();
	devJointVenCompanyName =$("#devJointVenCompanyName").val();
	devJointVenStreetAddress =$("#devJointVenStreetAddress").val();
	devJointVenTown =$("#devJointVenTown").val();
	devJointVenZipCode =$("#devJointVenZipCode").val();
	devJointVenCountry =$("#devJointVenCountry").val();
	devJointVenTelephone =$("#devJointVenTelephone").val();
	devJointVenFax = $("#devJointVenFax").val();
	devJointVenEmail =$("#devJointVenEmail").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	submitForm= true;
	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	if(!devJointVenEmail){
		  $("#devJointVenEmailValidation").removeClass("hide");
		  $("#devJointVenEmailValidation").text("Please Enter E-mail address");
		  $("#devJointVenEmail").focus();
		  submitForm= false;
	  }else if(devJointVenEmail.match(mailformat)){ 
			$("#devJointVenEmailValidation").addClass("hide");
		}else
			{
				$("#devJointVenEmailValidation").removeClass("hide");
				$("#devJointVenEmailValidation").text("You have entered an invalid E-mail address");
				$("#devJointVenEmail").focus();
				submitForm= false;
			}
	if(submitForm){
	$.ajax({
		type : "POST",
		url : "${addDeveloperGenBusinessParentComAndAddressUrl}",
		data : {
			"<portlet:namespace/>devJointVenCompanyName" : devJointVenCompanyName,
			"<portlet:namespace/>devJointVenStreetAddress" : devJointVenStreetAddress,
			"<portlet:namespace/>devJointVenTown" : devJointVenTown,
			"<portlet:namespace/>devJointVenZipCode" : devJointVenZipCode,
			"<portlet:namespace/>devJointVenCountry" : devJointVenCountry,
			"<portlet:namespace/>devJointVenTelephone" : devJointVenTelephone,
			"<portlet:namespace/>devJointVenFax" : devJointVenFax,
			"<portlet:namespace/>devJointVenEmail" : devJointVenEmail,
			"<portlet:namespace/>count" : devVentureComInfoVal,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
			var result=data.APP_DATA;
			$("#devVentureAppId"+result["counter"]).val(result["sezDevGenBusinessInfoAddId"]);
		}
	});
}
}

function developerShareholdingInfo(isSaveAndCont) {
	debugger;
	devEquityAuthorised = $("#devEquityAuthorised").val();
	devEquitySubscribed = $("#devEquitySubscribed").val();
	devEquityPaidCapital = $("#devEquityPaidCapital").val();
	comDirectorBankruptInvolve = $("input[name='comDirectorBankruptInvolve']:checked").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	submitForm= true;
if(submitForm){
	$.ajax({
		type : "POST",
		url : "${addDeveloperShareholdingInfoUrl}",
		data : {
			"<portlet:namespace/>devEquityAuthorised" : devEquityAuthorised,
			"<portlet:namespace/>devEquitySubscribed" : devEquitySubscribed,
			"<portlet:namespace/>devEquityPaidCapital" : devEquityPaidCapital,
			"<portlet:namespace/>comDirectorBankruptInvolve" : comDirectorBankruptInvolve,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
			if(!isSaveAndCont){
			nextButtonCall();
			}
			addShareholderDetailBox();
			addDirectorShareholdersBox();
			addComDirectorBox();
			addCorporationBox();
			addDirectorBankruptInvolveBox();
		}
	});
	}
	}
	
function addShareholdingDetailOfPrinciple(){
	shareholderName = $("#shareholderName").val();
	shareholderStreetAddress = $("#shareholderStreetAddress").val();
	shareholderZipCode = $("#shareholderZipCode").val();
	shareholderCountry = $("#shareholderCountry").val();
	shareholderNationality = $("#shareholderNationality").val();
	shareholderTRN = $("#shareholderTRN").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	devShareholderDetailVal = $("#devShareholderDetailVal").val();
	$.ajax({
		type : "POST",
		url : "${addShareholdingDetailOfPrincipleUrl}",
		data : {
			"<portlet:namespace/>shareholderName" : shareholderName,
			"<portlet:namespace/>shareholderStreetAddress" : shareholderStreetAddress,
			"<portlet:namespace/>shareholderZipCode" : shareholderZipCode,
			"<portlet:namespace/>shareholderCountry" : shareholderCountry,
			"<portlet:namespace/>shareholderNationality" : shareholderNationality,
			"<portlet:namespace/>shareholderTRN" : shareholderTRN,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
			"<portlet:namespace/>count" : devShareholderDetailVal,
		},
		success : function(data) {
			var result=data.APP_DATA;
			$("#devShareholderDetailId"+result["counter"]).val(result["sezDevSharePrincipalAddId"]);
		}
	});
} 

function addShareholdingPrincipleShareholder(){
	principalShareholderName = $("#principalShareholderName").val();
	principalShareholderShares = $("#principalShareholderShares").val();
	devDirectorShareholderVal = $("#devDirectorShareholderVal").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	$.ajax({
		type : "POST",
		url : "${addShareholdingPrincipleShareholderUrl}",
		data : {
			"<portlet:namespace/>principalShareholderName" : principalShareholderName,
			"<portlet:namespace/>principalShareholderShares" : principalShareholderShares,
			"<portlet:namespace/>count" : devDirectorShareholderVal,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
			var result=data.APP_DATA;
			$("#devDirectorShareholderId"+result["counter"]).val(result["sezDevSharePrincipalAddId"]);
		}
	});
} 

function addShareholdingListOfCompanyDirectorship(){
	comDirectorName = $("#comDirectorName").val();
	comDirectorCompanyName = $("#comDirectorCompanyName").val();
	comDirectorRelationship = $("#comDirectorRelationship").val();
	devComDirectorVal = $("#devComDirectorVal").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	$.ajax({
		type : "POST",
		url : "${addListOfComDirectorUrl}",
		data : {
			"<portlet:namespace/>comDirectorName" : comDirectorName,
			"<portlet:namespace/>comDirectorCompanyName" : comDirectorCompanyName,
			"<portlet:namespace/>comDirectorRelationship" : comDirectorRelationship,
			"<portlet:namespace/>count" : devComDirectorVal,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
			var result=data.APP_DATA;
			$("#devComDirectorId"+result["counter"]).val(result["sezDevSharComDirectorShipAddId"]);
		}
	});
}

function addShareholdingCorporationBusiness(){
	comCorporationPersonName = $("#comCorporationPersonName").val();
	comCorporationName = $("#comCorporationName").val();
	comCorporationRelationship = $("#comCorporationRelationship").val();
	devCorporationVal = $("#devCorporationVal").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	$.ajax({
		type : "POST",
		url : "${addCorporationBusinessUrl}",
		data : {
			"<portlet:namespace/>comCorporationPersonName" : comCorporationPersonName,
			"<portlet:namespace/>comCorporationName" : comCorporationName,
			"<portlet:namespace/>comCorporationRelationship" : comCorporationRelationship,
			"<portlet:namespace/>count" : devCorporationVal,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
			var result=data.APP_DATA;
			$("#devCorporationBusinessId"+result["counter"]).val(result["sezDevCorporationBusinessAddId"]);
		}
	});
}

function addShareholdingNameOfDirector(){
	comDirectorBankruptName = $("#comDirectorBankruptName").val();
	devDirectorBankruptInvolveVal = $("#devDirectorBankruptInvolveVal").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	$.ajax({
		type : "POST",
		url : "${addNameOfDirectorUrl}",
		data : {
			"<portlet:namespace/>comDirectorBankruptName" : comDirectorBankruptName,
			"<portlet:namespace/>count" : devDirectorBankruptInvolveVal,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
			var result=data.APP_DATA;
			$("#devDirectorBankruptInvolveId"+result["counter"]).val(result["sezDevPleaseStateAddId"]);
		}
	});
}


function developerEmployeeSafety(){
	addSecurityMeasuresBox();
	addOccuSafetySystemBox();
}

function developerProposedPorjectInfo(isSaveAndCont) {
	sezFreePreviousZone = $("input[name='sezFreePreviousZone']:checked").val();
	sezFreeCurrentZone =$("input[name='sezFreeCurrentZone']:checked").val();
	businessZoneNature = $("#businessZoneNature").val();
	distributedOutputPerLocal = $("#distributedOutputPerLocal").val();
	distributedOutputPerOverseas = $("#distributedOutputPerOverseas").val();
	sezProposedName = $("#sezProposedName").val();
	applicationEconomicZone = $("#applicationEconomicZone").val();
	applicationSpecialisedZoneDesc = $("#applicationSpecialisedZoneDesc").val();
	seaPortDistanceKM = $("#seaPortDistanceKM").val();
	seaPortDistanceMI = $("#seaPortDistanceMI").val();
	airportDistanceKM = $("#airportDistanceKM").val();
	airportDistanceMI = $("#airportDistanceMI").val();
	roadDistanceKM = $("#roadDistanceKM").val();
	roadDistanceMI = $("#roadDistanceMI").val();
	railDistanceKM = $("#railDistanceKM").val();
	railDistanceMI = $("#railDistanceMI").val();
	customDistanceKM = $("#customDistanceKM").val();
	customDistanceMI = $("#customDistanceMI").val();
	proposedLandMeasurement = $("#proposedLandMeasurement").val();
	buildingSquareFootage = $("#buildingSquareFootage").val();
	landSquareFootage = $("#landSquareFootage").val();
	landOwnership = $("#landOwnership").val();
	otherSpecifyLandOwnership = $("#otherSpecifyLandOwnership").val();
	landOwnerName = $("#landOwnerName").val();
	landOwnerAddrOne = $("#landOwnerAddrOne").val();
	landOwnerAddrTwo = $("#landOwnerAddrTwo").val();
	leaseAgreeTenure = $("#leaseAgreeTenure").val();
	stepToAcquireLand = $("input[name='stepToAcquireLand']:checked").val();
	proposedAreaDesc = $("#proposedAreaDesc").val();
	freeZonePrmissionDenied = $("input[name='freeZonePrmissionDenied']:checked").val();
	deniedPermissionDetail = $("#deniedPermissionDetail").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	submitForm= true;
	if(submitForm){
	$.ajax({
		type : "POST",
		url : "${addDeveloperProposedPorjectInfoUrl}",
		data : {
			"<portlet:namespace/>sezFreePreviousZone" : sezFreePreviousZone,
			"<portlet:namespace/>sezFreeCurrentZone" : sezFreeCurrentZone,
			"<portlet:namespace/>businessZoneNature" : businessZoneNature,
			"<portlet:namespace/>distributedOutputPerLocal" : distributedOutputPerLocal,
			"<portlet:namespace/>distributedOutputPerOverseas" : distributedOutputPerOverseas,
			"<portlet:namespace/>sezProposedName" : sezProposedName,
			"<portlet:namespace/>applicationEconomicZone" : applicationEconomicZone,
			"<portlet:namespace/>applicationSpecialisedZoneDesc" : applicationSpecialisedZoneDesc,
			"<portlet:namespace/>seaPortDistanceKM" : seaPortDistanceKM,
			"<portlet:namespace/>seaPortDistanceMI" : seaPortDistanceMI,
			"<portlet:namespace/>airportDistanceKM" : airportDistanceKM,
			"<portlet:namespace/>airportDistanceMI" : airportDistanceMI,
			"<portlet:namespace/>roadDistanceKM" : roadDistanceKM,
			"<portlet:namespace/>roadDistanceMI" : roadDistanceMI,
			"<portlet:namespace/>railDistanceKM" : railDistanceKM,
			"<portlet:namespace/>railDistanceMI" : railDistanceMI,
			"<portlet:namespace/>customDistanceKM" : customDistanceKM,
			"<portlet:namespace/>customDistanceMI" : customDistanceMI,
			"<portlet:namespace/>proposedLandMeasurement" : proposedLandMeasurement,
			"<portlet:namespace/>buildingSquareFootage" : buildingSquareFootage,
			"<portlet:namespace/>landSquareFootage" : landSquareFootage,
			"<portlet:namespace/>landOwnership" : landOwnership,
			"<portlet:namespace/>otherSpecifyLandOwnership" : otherSpecifyLandOwnership,
			"<portlet:namespace/>landOwnerName" : landOwnerName,
			"<portlet:namespace/>landOwnerAddrOne" : landOwnerAddrOne,
			"<portlet:namespace/>landOwnerAddrTwo" : landOwnerAddrTwo,
			"<portlet:namespace/>leaseAgreeTenure" : leaseAgreeTenure,
			"<portlet:namespace/>stepToAcquireLand" : stepToAcquireLand,
			"<portlet:namespace/>proposedAreaDesc" : proposedAreaDesc,
			"<portlet:namespace/>freeZonePrmissionDenied" : freeZonePrmissionDenied,
			"<portlet:namespace/>deniedPermissionDetail" : deniedPermissionDetail,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
			if(!isSaveAndCont){
			nextButtonCall();
			}
			addOperatingZoneLocationBox();
		}
	});
 }
}

function addProposedProjectPleaseState(){
	sezFreeCurrentZoneName = $("#sezFreeCurrentZoneName").val();
	sezFreeCurrentZoneParish = $("#sezFreeCurrentZoneParish").val();
	devOperatingZoneLocationVal = $("#devOperatingZoneLocationVal").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	$.ajax({
		type : "POST",
		url : "${addProjectPleaseStateUrl}",
		data : {
			"<portlet:namespace/>sezFreeCurrentZoneName" : sezFreeCurrentZoneName,
			"<portlet:namespace/>sezFreeCurrentZoneParish" : sezFreeCurrentZoneParish,
			"<portlet:namespace/>count" : devOperatingZoneLocationVal,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
			var result=data.APP_DATA;
			$("#devOperatingZoneLocationId"+result["counter"]).val(result["sezDevProposedProjectAddId"]);
		}
	});
}

function developerProposedDevelopmentInfo(isSaveAndCont) {
	existingBuildingForBusi = $("input[name='existingBuildingForBusi']:checked").val();
	existingBuildingForBusiDetailing = $("#existingBuildingForBusiDetailing").val();
	activitiesForSingleEntity = $("#activitiesForSingleEntity").val();
	sezDevelopmentVolume = $("#sezDevelopmentVolume").val();
	sezDevelopmentFolio = $("#sezDevelopmentFolio").val();
	sezDevelopmentStreetAddress = $("#sezDevelopmentStreetAddress").val();
	sezDevelopmentTown = $("#sezDevelopmentTown").val();
	sezDevelopmentZipCode = $("#sezDevelopmentZipCode").val();
	zoningClassification = $("#zoningClassification").val();
	sezDevelopmentLandUse = $("#sezDevelopmentLandUse").val();
	sezAreaDevelopmentHectareArea = $("#sezAreaDevelopmentHectareArea").val();
	sezAreaDevelopmentAcresArea = $("#sezAreaDevelopmentAcresArea").val();
	sezCustomsDevelopmentHectareArea = $("#sezCustomsDevelopmentHectareArea").val();
	sezCustomsDevelopmentAcresArea = $("#sezCustomsDevelopmentAcresArea").val();
	topography = $("#topography").val();
	northBoundaries = $("#northBoundaries").val();
	eastBoundaries = $("#eastBoundaries").val();
	westBoundaries = $("#westBoundaries").val();
	southBoundaries = $("#southBoundaries").val();
	customLandMeasurement = $("#customLandMeasurement").val();
	customPercent = $("#customPercent").val();
	commonLandMeasurement = $("#commonLandMeasurement").val();
	commonPercent = $("#commonPercent").val();
	bufferLandMeasurement = $("#bufferLandMeasurement").val();
	bufferPercent = $("#bufferPercent").val();
	zoneLandMeasurement = $("#zoneLandMeasurement").val();
	zonePercent = $("#zonePercent").val();
	residentialLandMeasurement = $("#residentialLandMeasurement").val();
	residentialPercent = $("#residentialPercent").val();
	totalLandMeasurement = $("#totalLandMeasurement").val();
	totalPercent = $("#totalPercent").val();
	industrialWaterReq = $("#industrialWaterReq").val();
	drinkingWaterReq = $("#drinkingWaterReq").val();
	otherWaterReq = $("#otherWaterReq").val();
	totalWaterReq = $("#totalWaterReq").val();
	disposalMode = $("#disposalMode").val();
	wasteWaterTreatment = $("#wasteWaterTreatment").val();
	powerReqirement = $("#powerReqirement").val();
	mainRoadWidth = $("#mainRoadWidth").val();
	mainRoadPavement = $("#mainRoadPavement").val();
	secondaryRoadWidth = $("#secondaryRoadWidth").val();
	secondaryRoadPavement = $("#secondaryRoadPavement").val();
	tertiaryRoadWidth = $("#tertiaryRoadWidth").val();
	tertiaryRoadPavement = $("#tertiaryRoadPavement").val();
	waterInstallationReq = $("input[name='waterInstallationReq']:checked").val();
	powerInstallationReq = $("input[name='powerInstallationReq']:checked").val();
	teleComInstallationReq = $("input[name='teleComInstallationReq']:checked").val();
	cctvInstallationReq = $("input[name='cctvInstallationReq']:checked").val();
	securityInterconnection = $("input[name='securityInterconnection']:checked").val();
	fireFightingInstallationReq = $("input[name='fireFightingInstallationReq']:checked").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	submitForm= true;
	
	
	if(submitForm){
	$.ajax({
		type : "POST",
		url : "${addProposedDevelopmentInfoUrl}",
		data : {
			"<portlet:namespace/>existingBuildingForBusi" : existingBuildingForBusi,
			"<portlet:namespace/>existingBuildingForBusiDetailing" : existingBuildingForBusiDetailing,
			"<portlet:namespace/>activitiesForSingleEntity" : activitiesForSingleEntity,
			"<portlet:namespace/>sezDevelopmentVolume" : sezDevelopmentVolume,
			"<portlet:namespace/>sezDevelopmentFolio" : sezDevelopmentFolio,
			"<portlet:namespace/>sezDevelopmentStreetAddress" : sezDevelopmentStreetAddress,
			"<portlet:namespace/>sezDevelopmentTown" : sezDevelopmentTown,
			"<portlet:namespace/>sezDevelopmentZipCode" : sezDevelopmentZipCode,
			"<portlet:namespace/>zoningClassification" : zoningClassification,
			"<portlet:namespace/>sezDevelopmentLandUse" : sezDevelopmentLandUse,
			"<portlet:namespace/>sezAreaDevelopmentHectareArea" : sezAreaDevelopmentHectareArea,
			"<portlet:namespace/>sezAreaDevelopmentAcresArea" : sezAreaDevelopmentAcresArea,
			"<portlet:namespace/>sezCustomsDevelopmentHectareArea" : sezCustomsDevelopmentHectareArea,
			"<portlet:namespace/>sezCustomsDevelopmentAcresArea" : sezCustomsDevelopmentAcresArea,
			"<portlet:namespace/>topography" : topography,
			"<portlet:namespace/>northBoundaries" : northBoundaries,
			"<portlet:namespace/>eastBoundaries" : eastBoundaries,
			"<portlet:namespace/>westBoundaries" : westBoundaries,
			"<portlet:namespace/>southBoundaries" : southBoundaries,
			"<portlet:namespace/>customLandMeasurement" : customLandMeasurement,
			"<portlet:namespace/>customPercent" : customPercent,
			"<portlet:namespace/>commonLandMeasurement" : commonLandMeasurement,
			"<portlet:namespace/>commonPercent" : commonPercent,
			"<portlet:namespace/>bufferLandMeasurement" : bufferLandMeasurement,
			"<portlet:namespace/>bufferPercent" : bufferPercent,
			"<portlet:namespace/>zoneLandMeasurement" : zoneLandMeasurement,
			"<portlet:namespace/>zonePercent" : zonePercent,
			"<portlet:namespace/>residentialLandMeasurement" : residentialLandMeasurement,
			"<portlet:namespace/>residentialPercent" : residentialPercent,
			"<portlet:namespace/>totalLandMeasurement" : totalLandMeasurement,
			"<portlet:namespace/>totalPercent" : totalPercent,
			"<portlet:namespace/>industrialWaterReq" : industrialWaterReq,
			"<portlet:namespace/>drinkingWaterReq" : drinkingWaterReq,
			"<portlet:namespace/>otherWaterReq" : otherWaterReq,
			"<portlet:namespace/>totalWaterReq" : totalWaterReq,
			"<portlet:namespace/>disposalMode" : disposalMode,
			"<portlet:namespace/>wasteWaterTreatment" : wasteWaterTreatment,
			"<portlet:namespace/>powerReqirement" : powerReqirement,
			"<portlet:namespace/>mainRoadWidth" : mainRoadWidth,
			"<portlet:namespace/>mainRoadPavement" : mainRoadPavement,
			"<portlet:namespace/>secondaryRoadWidth" : secondaryRoadWidth,
			"<portlet:namespace/>secondaryRoadPavement" : secondaryRoadPavement,
			"<portlet:namespace/>tertiaryRoadWidth" : tertiaryRoadWidth,
			"<portlet:namespace/>tertiaryRoadPavement" : tertiaryRoadPavement,
			"<portlet:namespace/>waterInstallationReq" : waterInstallationReq,
			"<portlet:namespace/>powerInstallationReq" : powerInstallationReq,
			"<portlet:namespace/>teleComInstallationReq" : teleComInstallationReq,
			"<portlet:namespace/>cctvInstallationReq" : cctvInstallationReq,
			"<portlet:namespace/>securityInterconnection" : securityInterconnection,
			"<portlet:namespace/>fireFightingInstallationReq" : fireFightingInstallationReq,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
			if(!isSaveAndCont){
			nextButtonCall();
			}
		}
	});
	}
}

function addDeveloperEmployeeSafetyInfo() {
	securityMeasures = $("#securityMeasures").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	devSecurityMeasuresVal = $("#devSecurityMeasuresVal").val();
	$.ajax({
		type : "POST",
		url : "${addDevEmployeeSafetyInfoUrl}",
		data : {
			"<portlet:namespace/>securityMeasures" : securityMeasures,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
			"<portlet:namespace/>count" : devSecurityMeasuresVal,
		},
		success : function(data) {	
		var result=data.APP_DATA;
		$("#devSecurityMeasuresId"+result["counter"]).val(result["sezDevEmployeeSafetyInfoAddId"]);
		}
	});
}
function addDeveloperEmployeeDefineYourOccupationInfo(){
	occuSafetySystem = $("#occuSafetySystem").val();
	devOccuSafetySystemVal = $("#devOccuSafetySystemVal").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	$.ajax({
		type : "POST",
		url : "${addDevDefineYourOccuUrl}",
		data : {
			"<portlet:namespace/>occuSafetySystem" : occuSafetySystem,
			"<portlet:namespace/>count" : devOccuSafetySystemVal,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
			var result=data.APP_DATA;
			$("#devOccuSafetySystemId"+result["counter"]).val(result["sezDevEmployeeDefineOccuAddId"]);
		}
	});
}	
function developerEmployementInfo(isSaveAndCont) {
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
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	$.ajax({
		type : "POST",
		url : "${addDevEmployementUrl}",
		data : {
			    "<portlet:namespace/>directFirstYrEm" : directFirstYrEm,
				"<portlet:namespace/>indirectFirstYrEm" : indirectFirstYrEm,
				"<portlet:namespace/>maleDirectFirstYrEm" : maleDirectFirstYrEm,
				"<portlet:namespace/>femaleDirectFirstYrEm" : femaleDirectFirstYrEm,
				"<portlet:namespace/>localFirstYrEm" : localFirstYrEm,
				"<portlet:namespace/>foreignFirstYrEm" : foreignFirstYrEm,
				"<portlet:namespace/>directSecondYrEm" : directSecondYrEm,
				"<portlet:namespace/>indirectSecondYrEm" : indirectSecondYrEm,
				"<portlet:namespace/>maleDirectSecondYrEm" : maleDirectSecondYrEm,
				"<portlet:namespace/>femaleDirectSecondYrEm" : femaleDirectSecondYrEm,
				"<portlet:namespace/>localSecondYrEm" : localSecondYrEm,
				"<portlet:namespace/>foreignSecondYrEm" : foreignSecondYrEm,
				"<portlet:namespace/>directThirdYrEm" : directThirdYrEm,
				"<portlet:namespace/>indirectThirdYrEm" : indirectThirdYrEm,
				"<portlet:namespace/>maleDirectThirdYrEm" : maleDirectThirdYrEm,
				"<portlet:namespace/>femaleDirectThirdYrEm" : femaleDirectThirdYrEm,
				"<portlet:namespace/>localThirdYrEm" : localThirdYrEm,
				"<portlet:namespace/>foreignThirdYrEm" : foreignThirdYrEm,
				"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
			
		},
		success : function(data) {
			if(!isSaveAndCont){
			nextButtonCall();
			}
		}
	});
}
function developerDisasterManagementInfo(isSaveAndCont) {
	comDisasterManagement = $("input[name='comDisasterManagement']:checked").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	$.ajax({
		type : "POST",
		url : "${addDevDisasterManagementInfoUrl}",
		data : {
			"<portlet:namespace/>comDisasterManagement" : comDisasterManagement,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
			if(!isSaveAndCont){
			nextButtonCall();
			}
			adddisasterMitigationPlanBox();
		}
	});
 }
function addDeveloperDisasterManagement(){
	disasterMitigationPlan = $("#disasterMitigationPlan").val();
	disasterMitigationPlanVal = $("#disasterMitigationPlanVal").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	$.ajax({
		type : "POST",
		url : "${addDeveloperDisasterManagementUrl}",
		data : {
			"<portlet:namespace/>disasterMitigationPlan" : disasterMitigationPlan,
			"<portlet:namespace/>count" : disasterMitigationPlanVal,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
			var result=data.APP_DATA;
			$("#disasterMitigationPlanId"+result["counter"]).val(result["sezDevDisasterManagementAddId"]);
		}
	});
 }
function developerInvestmentInfo(isSaveAndCont) {
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
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	$.ajax({
		type : "POST",
		url : "${addDeveloperInvestmentInfoUrl}",
		data : {
			"<portlet:namespace/>landValue" : landValue,
			"<portlet:namespace/>factoryDevCost" : factoryDevCost,
			"<portlet:namespace/>onSiteInfrastructure" : onSiteInfrastructure,
			"<portlet:namespace/>portInvestDetails" : portInvestDetails,
			"<portlet:namespace/>airportInvestDetails" : airportInvestDetails,
			"<portlet:namespace/>otherInvestDetails" : otherInvestDetails,
			"<portlet:namespace/>totalInvestDetails" : totalInvestDetails,
			"<portlet:namespace/>totalLDI" : totalLDI,
			"<portlet:namespace/>totalFDI" : totalFDI,
			"<portlet:namespace/>fdiComName" : fdiComName,
			"<portlet:namespace/>fdiResidentAddr" : fdiResidentAddr,
			"<portlet:namespace/>fundSources" : fundSources,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
			if(!isSaveAndCont){
			nextButtonCall();}
		}
	});
 }
function developerUndertakingInfo(isSaveAndCont) {
	applicantTitle = $("#applicantTitle").val();
	applicantName = $("#applicantName").val();
	applicantTeleNum = $("#applicantTeleNum").val();
	applicantEmail = $("#applicantEmail").val();
	applicantSignatureDate = $("#applicant-signature-date").val();
	publicNotaryName = $("#publicNotaryName").val();
	publicNotarySignatureDate = $("#public-notary-signature-date").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	submitForm = true;
	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	if(!publicNotaryName){
		$("#publicNotaryName").focus();
		$("#publicNotaryNameValidation").removeClass("hide");
		submitForm = false;
	}else{
		$("#publicNotaryNameValidation").addClass("hide");
	}
	if(!applicantEmail){
		  $("#applicantEmailValidation").removeClass("hide");
		  $("#applicantEmailValidation").text("Please enter E-mail address");
		  $("#applicantEmail").focus();
		  submitForm= false;
	  }else if(applicantEmail.match(mailformat)){ 
			$("#applicantEmailValidation").addClass("hide");
		}else
			{
				$("#applicantEmailValidation").removeClass("hide");
				$("#applicantEmailValidation").text("You have entered an invalid email address");
				$("#applicantEmail").focus();
				submitForm= false;
			}
	if(!applicantName){
		$("#applicantName").focus();
		$("#applicantNameValidation").removeClass("hide");
		submitForm = false;
	}else{
		$("#applicantNameValidation").addClass("hide");
	}
	if(submitForm){
		$.ajax({
			type : "POST",
			url : "${addDeveloperUndertakingInfoUrl}",
			data : {
				"<portlet:namespace/>applicantTitle" : applicantTitle,
				"<portlet:namespace/>applicantName" : applicantName,
				"<portlet:namespace/>applicantTeleNum" : applicantTeleNum,
				"<portlet:namespace/>applicantEmail" : applicantEmail,
				"<portlet:namespace/>applicantSignatureDate" : applicantSignatureDate,
				"<portlet:namespace/>publicNotaryName" : publicNotaryName,
				"<portlet:namespace/>publicNotarySignatureDate" : publicNotarySignatureDate,
				"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
			},
			success : function(data) {
				uploadDocuments('applicant-signature-upload-btn','Signature of Developer Undertaking Declarant','');
				uploadDocuments('public-notary-signature-upload-btn','Signature of Developer Public Notary','');
				if(!isSaveAndCont){
				nextButtonCall();}
				$("#SezStatusFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			}
		});
	}
 }
function developerSubmissionChecklistInfo() {
	var selectedGeneral = new Array();
	$("input:checkbox[name=generalReq]:checked").each(function() {
		selectedGeneral.push($(this).val());
	});
	var selectedComInfoReq = new Array();
	$("input:checkbox[name=comInfoReq]:checked").each(function() {
		selectedComInfoReq.push($(this).val());
	});
	paidShareCapProof = $("input[name='paidShareCapProof']:checked").val();
	var selectedSwornStateReq = new Array();
	$("input:checkbox[name=swornStateReq]:checked").each(function() {
		selectedSwornStateReq.push($(this).val());
	});
	var selectedLandOccuReq = new Array();
	$("input:checkbox[name=landOccuReq]:checked").each(function() {
		selectedLandOccuReq.push($(this).val());
	});
	var selectedSafetyHealthReq = new Array();
	$("input:checkbox[name=safetyHealthReq]:checked").each(function() {
		selectedSafetyHealthReq.push($(this).val());
	});
	var selectedLandDevlopmentReq = new Array();
	$("input:checkbox[name=landDevlopmentReq]:checked").each(function() {
		selectedLandDevlopmentReq.push($(this).val());
	});
	var selectedTechInfoReq = new Array();
	$("input:checkbox[name=techInfoReq]:checked").each(function() {
		selectedTechInfoReq.push($(this).val());
	});
	var selectedSezPreliminaryReq = new Array();
	$("input:checkbox[name=sezPreliminaryReq]:checked").each(function() {
		selectedSezPreliminaryReq.push($(this).val());
	});
	var selectedSezDevDetailReq = new Array();
	$("input:checkbox[name=sezDevDetailReq]:checked").each(function() {
		selectedSezDevDetailReq.push($(this).val());
	});
	var selectedApprovalReq = new Array();
	$("input:checkbox[name=approvalReq]:checked").each(function() {
		selectedApprovalReq.push($(this).val());
	});
	nameReq = $("#nameReq").val();
	dateReq = $("#dateReq").val();
	typeOfSezStatus=$("#sez-submit-application-type-option-value").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	var devSelectedGeneral=selectedGeneral.toString();
	var devSelectedComInfoReq=selectedComInfoReq.toString();
	var devSelectedSwornStateReq=selectedSwornStateReq.toString();
	var devSelectedLandOccuReq=selectedLandOccuReq.toString();
	var devSelectedSafetyHealthReq=selectedSafetyHealthReq.toString();
	var devSelectedLandDevlopmentReq=selectedLandDevlopmentReq.toString();
	var devSelectedTechInfoReq=selectedTechInfoReq.toString();
	var devSelectedSezPreliminaryReq=selectedSezPreliminaryReq.toString();
	var devSelectedSezDevDetailReq=selectedSezDevDetailReq.toString();
	var devSelectedSezDevDetailReq=selectedSezDevDetailReq.toString();
	var devSelectedApprovalReq=selectedApprovalReq.toString();
	$.ajax({
		type : "POST",
		url : "${addDeveloperSubmissionChecklistInfoUrl}",
		data : {
			"<portlet:namespace/>selectedGeneral" : devSelectedGeneral,
			"<portlet:namespace/>selectedComInfoReq" : devSelectedComInfoReq,
			"<portlet:namespace/>paidShareCapProof" : paidShareCapProof,
			"<portlet:namespace/>selectedSwornStateReq" : devSelectedSwornStateReq,
			"<portlet:namespace/>selectedLandOccuReq" : devSelectedLandOccuReq,
			"<portlet:namespace/>selectedSafetyHealthReq" : devSelectedSafetyHealthReq,
			"<portlet:namespace/>selectedLandDevlopmentReq" : devSelectedLandDevlopmentReq,
			"<portlet:namespace/>selectedTechInfoReq" : devSelectedTechInfoReq,
			"<portlet:namespace/>selectedSezPreliminaryReq" : devSelectedSezPreliminaryReq,
			"<portlet:namespace/>selectedSezDevDetailReq" : devSelectedSezDevDetailReq,
			"<portlet:namespace/>selectedApprovalReq" : devSelectedApprovalReq,
			"<portlet:namespace/>nameReq" : nameReq,
			"<portlet:namespace/>dateReq" : dateReq,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
			if(typeOfSezStatus=="SEZ Developer"){
			uploadDocuments('sign-req-upload-btn','Signature of Developer Submission Checklist','');
			}
		}
	});
 }

$('input[type = radio][name = devJointVenture]').change(
		function() {
			if ($(this).val() == "Yes") {
				$("#devJointVentureBox, #devJointVentureBoxPre")
						.removeClass("hide");
			} else {
				$("#devJointVentureBox, #devJointVentureBoxPre").addClass(
						"hide");
			}
		});
$('input[type = radio][name = devExistingCom]').change(function() {
	if ($(this).val() == "Yes") {
		$("#devExistingComBox, #devExistingComBoxPre").removeClass("hide");
	} else {
		$("#devExistingComBox, #devExistingComBoxPre").addClass("hide");
	}
});
$('#devFormArticle').change(
		function() {
			if ($(this).val() == "Other") {
				$("#devFormArticleOtherBox, #devFormArticleOtherBoxPre")
						.removeClass("hide");
			} else {
				$("#devFormArticleOtherBox, #devFormArticleOtherBoxPre")
						.addClass("hide");
			}
		});
$('input[type = radio][name = comDirectorBankruptInvolve]')
		.change(
				function() {
					if ($(this).val() == "Yes") {
						$(
								".comDirectorBankruptInvolveBox, .comDirectorBankruptInvolveBoxPre")
								.removeClass("hide");
					} else {
						$(
								".comDirectorBankruptInvolveBox, .comDirectorBankruptInvolveBoxPre")
								.addClass("hide");
					}
				});
$('input[type = radio][name = freeZonePrmissionDenied]')
		.change(
				function() {
					if ($(this).val() == "Yes") {
						$(
								"#freeZonePrmissionDeniedBox, #freeZonePrmissionDeniedBoxPre")
								.removeClass("hide");
					} else {
						$(
								"#freeZonePrmissionDeniedBox, #freeZonePrmissionDeniedBoxPre")
								.addClass("hide");
					}
				});
$("#applicationEconomicZone")
		.change(
				function() {
					if ($(this).val() == "Specialised Zone") {
						$(
								"#applicationEconomicSpecialisedZoneBox, #applicationEconomicSpecialisedZoneBoxPre")
								.removeClass("hide");
					} else {
						$(
								"#applicationEconomicSpecialisedZoneBox, #applicationEconomicSpecialisedZoneBoxPre")
								.addClass("hide");
					}
				});
$('input[type = radio][name = sezFreePreviousZone]').change(
		function() {
			if ($(this).val() == "Yes") {
				$("#sezFreePreviousZoneBox, #sezFreePreviousZoneBoxPre")
						.removeClass("hide");
			} else {
				$("#sezFreePreviousZoneBox, #sezFreePreviousZoneBoxPre")
						.addClass("hide");
			}
		});
$('input[type = radio][name = sezFreeCurrentZone]').change(
		function() {
			if ($(this).val() == "Yes") {
				$(".sezFreeCurrentZoneBox, #sezFreeCurrentZoneBoxPre")
						.removeClass("hide");
			} else {
				$(".sezFreeCurrentZoneBox, #sezFreeCurrentZoneBoxPre")
						.addClass("hide");
			}
		});
$('input[type = radio][name = existingBuildingForBusi]')
		.change(
				function() {
					if ($(this).val() == "Yes") {
						$(
								"#existingBuildingForBusiBox, #existingBuildingForBusiBoxPre")
								.removeClass("hide");
					} else {
						$(
								"#existingBuildingForBusiBox, #existingBuildingForBusiBoxPre")
								.addClass("hide");
					}
				});
$("#landOwnership")
		.change(
				function() {
					if ($(this).val() == "Full Ownership") {
						$(
								"#landOwnershipBox, #otherLandOwnership, #otherLandOwnershipPre, #landOwnershipBoxPre")
								.addClass("hide");
					} else if ($(this).val() == "Other") {
						$(
								"#landOwnershipBox, #otherLandOwnership, #otherLandOwnershipPre, #landOwnershipBoxPre")
								.removeClass("hide");
					} else {
						$("#otherLandOwnership, #otherLandOwnershipPre")
								.addClass("hide");
						$("#landOwnershipBox, #landOwnershipBoxPre")
								.removeClass("hide");
					}
				});
		$(document).on('change', '#applicant-signature-upload-btn', function() {
					//Get count of selected files
					var countFiles = $(this)[0].files.length;
					var imgPath = $(this)[0].value;
					var extn = imgPath.substring(
							imgPath.lastIndexOf('.') + 1).toLowerCase();
					var image_holder = $("#applicant-sign-image-holder");
					var form1a_image_holder = $("#applicant-sign-image-holder-pre");
					image_holder.empty();
					form1a_image_holder.empty();
					if (extn == "gif" || extn == "png" || extn == "jpg"
							|| extn == "jpeg") {
						if (typeof (FileReader) != "undefined") {
							//loop for each file selected for uploaded.
							for (var i = 0; i < countFiles; i++) {
								var reader = new FileReader();
								reader.onload = function(e) {
									$("<img />", {
										"src" : e.target.result,
										"class" : "thumb-image",
										"height" : "100",
										"width" : "100"
									}).appendTo(image_holder);
									$("<img />", {
										"src" : e.target.result,
										"class" : "thumb-image",
										"height" : "100",
										"width" : "100"
									}).appendTo(form1a_image_holder);
								}
								image_holder.show();
								reader.readAsDataURL($(this)[0].files[i]);
							}
						} else {
							alert("This browser does not support FileReader.");
						}
					} else {
						alert("Pls select only images");
					}
				});
		$(document).on('change', '#public-notary-signature-upload-btn', function() {
					//Get count of selected files
					var countFiles = $(this)[0].files.length;
					var imgPath = $(this)[0].value;
					var extn = imgPath.substring(
							imgPath.lastIndexOf('.') + 1).toLowerCase();
					var image_holder = $("#public-notary-sign-image-holder");
					var form1a_image_holder = $("#public-notary-sign-image-holder-pre");
					image_holder.empty();
					form1a_image_holder.empty();
					if (extn == "gif" || extn == "png" || extn == "jpg"
							|| extn == "jpeg") {
						if (typeof (FileReader) != "undefined") {
							//loop for each file selected for uploaded.
							for (var i = 0; i < countFiles; i++) {
								var reader = new FileReader();
								reader.onload = function(e) {
									$("<img />", {
										"src" : e.target.result,
										"class" : "thumb-image",
										"height" : "100",
										"width" : "100"
									}).appendTo(image_holder);
									$("<img />", {
										"src" : e.target.result,
										"class" : "thumb-image",
										"height" : "100",
										"width" : "100"
									}).appendTo(form1a_image_holder);
								}
								image_holder.show();
								reader.readAsDataURL($(this)[0].files[i]);
							}
						} else {
							alert("This browser does not support FileReader.");
						}
					} else {
						alert("Pls select only images");
					}
				});
		$(document).on('change', '#sign-req-upload-btn', function() {
			//Get count of selected files
			var countFiles = $(this)[0].files.length;
			var imgPath = $(this)[0].value;
			var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1)
					.toLowerCase();
			var image_holder = $("#sign-req-image-holder");
			var form1a_image_holder = $("#sign-req-image-holder-pre");
			image_holder.empty();
			form1a_image_holder.empty();
			if (extn == "gif" || extn == "png" || extn == "jpg"
					|| extn == "jpeg") {
				if (typeof (FileReader) != "undefined") {
					//loop for each file selected for uploaded.
					for (var i = 0; i < countFiles; i++) {
						var reader = new FileReader();
						reader.onload = function(e) {
							$("<img />", {
								"src" : e.target.result,
								"class" : "thumb-image",
								"height" : "100",
								"width" : "100"
							}).appendTo(image_holder);
							$("<img />", {
								"src" : e.target.result,
								"class" : "thumb-image",
								"height" : "100",
								"width" : "100"
							}).appendTo(form1a_image_holder);
						}
						image_holder.show();
						reader.readAsDataURL($(this)[0].files[i]);
					}
				} else {
					alert("This browser does not support FileReader.");
				}
			} else {
				alert("Pls select only images");
			}
		});
function expandDetails(id) {
	var currentIsActive = $("#" + id).hasClass('is-active');
	$("#" + id).removeClass('is-active');
	$("#" + id).next('.accordion__body').removeClass('is-active');
	if (currentIsActive != 1) {
		$("#" + id).addClass('is-active');
		$("#" + id).next('.accordion__body').addClass('is-active');
	}
}
$("#landOccuReq2")
		.change(
				function() {
					var selectedLandOccuReq = new Array();
					$("input:checkbox[name=landOccuReq]:checked").each(
							function() {
								selectedLandOccuReq.push($(this).val());
							});
					if (selectedLandOccuReq
							.includes("Document establishing that the Applicant is in the process of obtaining occupancy rights to the subject land area")) {
						$("#landOccuReq3").prop('checked', false);
					}
				});
$("#landOccuReq3")
		.change(
				function() {
					var selectedLandOccuReq = new Array();
					$("input:checkbox[name=landOccuReq]:checked").each(
							function() {
								selectedLandOccuReq.push($(this).val());
							});
					if (selectedLandOccuReq
							.includes("Certified copy of a long-term lease agreement clearly stating the duration of the lease ( Duration of a minimum of 5 years with some indication of potential for renewal)")) {
						$("#landOccuReq2").prop('checked', false);
					}
				});
$("#approvalReq2").change(function() {
	var selectedApprovalReq = new Array();
	$("input:checkbox[name=approvalReq]:checked").each(function() {
		selectedApprovalReq.push($(this).val());
	});
	if (selectedApprovalReq.includes("Proof of Application")) {
		$("#approvalReq3").prop('checked', false);
	}
});
$("#approvalReq3")
		.change(
				function() {
					var selectedApprovalReq = new Array();
					$("input:checkbox[name=approvalReq]:checked").each(
							function() {
								selectedApprovalReq.push($(this).val());
							});
					if (selectedApprovalReq
							.includes("Fire Approval Letter or Fire Safety Certificate from the Jamaica Brigade Fire Service")) {
						$("#approvalReq2").prop('checked', false);
					}
				});

/* Add On Forms */
function addVentureComInfoBox() {
	devVentureComInfoVal = $("#devVentureComInfoVal").val();
	
	devJointVenCompanyName = $("#devJointVenCompanyName").val();
    devJointVenStreetAddress = $("#devJointVenStreetAddress").val();
	devJointVenTown = $("#devJointVenTown").val();
	devJointVenZipCode = $("#devJointVenZipCode").val();
	devJointVenCountry = $("#devJointVenCountry").val();
	devJointVenTelephone = $("#devJointVenTelephone").val();
	devJointVenFax = $("#devJointVenFax").val();
	devJointVenEmail = $("#devJointVenEmail").val();
	if(devJointVenCompanyName != "" || devJointVenStreetAddress !="" || devJointVenTown !="" || 
		 devJointVenTelephone !="" || devJointVenFax !="" || devJointVenEmail !=""){
	$(".devJointVentureTableBox").removeClass("hide");
	$.ajax({
				type : "POST",
				url : "${addDevVentureComInfoUrl}",
				data : {
					"<portlet:namespace/>devVentureComInfoVal" : devVentureComInfoVal,
				},
				async: false,
				success : function(data) {
					$(".devJointVentureFormTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					
					/* APPEND DATA INTO TABLE */
					
					$(".devJointVenCompanyName" + devVentureComInfoVal)
							.append(devJointVenCompanyName);
					$(".devJointVenStreetAddress" + devVentureComInfoVal)
							.append(devJointVenStreetAddress);
					$(".devJointVenTown" + devVentureComInfoVal).append(
							devJointVenTown);
					$(".devJointVenZipCode" + devVentureComInfoVal).append(
							devJointVenZipCode);
					$(".devJointVenCountry" + devVentureComInfoVal).append(
							devJointVenCountry);
					$(".devJointVenTelephone" + devVentureComInfoVal)
							.append(devJointVenTelephone);
					$(".devJointVenFax" + devVentureComInfoVal).append(
							devJointVenFax);
					$(".devJointVenEmail" + devVentureComInfoVal).append(
							devJointVenEmail);
					
					/* VALUE INCREAMENT */
					AddMoreParentCompanyNameAndAddress();
					devVentureComInfoVal++;
					$("#devVentureComInfoVal").val(devVentureComInfoVal);
					
					/* RESET FORM FIELDS */
					$("#devJointVenCompanyName").val("");
					$("#devJointVenStreetAddress").val("");
					$("#devJointVenTown").val("");
					$("#devJointVenZipCode").val("");
					
					/* $("#devJointVenCountry").val(""); */
					$("#devJointVenTelephone").val("");
					$("#devJointVenFax").val("");
					$("#devJointVenEmail").val("");
				},
				
				error : function(data) {
				},
			});
	}else{
		$("#devJointVenCompanyName").focus();
	}
}
function devVentureComEditTab(devVentureComInfoVal) {
	$(".editDevVentureComPopup").modal("show");
	$(".editDevJointVenCompanyName").attr("id" , "editDevJointVenCompanyName"+devVentureComInfoVal);
	$(".ediDevJointVenStreetAddress").attr("id" , "ediDevJointVenStreetAddress"+devVentureComInfoVal);
	$(".editDevJointVenTown").attr("id" , "editDevJointVenTown"+devVentureComInfoVal);
	$(".editDevJointVenZipCode").attr("id" , "editDevJointVenZipCode"+devVentureComInfoVal);
	$(".editDevJointVenCountry").attr("id" , "editDevJointVenCountry"+devVentureComInfoVal);
	$(".editDevJointVenTelephone").attr("id" , "editDevJointVenTelephone"+devVentureComInfoVal);
	$(".editDevJointVenFax").attr("id" , "editDevJointVenFax"+devVentureComInfoVal);
	$(".editDevJointVenEmail").attr("id" , "editDevJointVenEmail"+devVentureComInfoVal);
	
	devJointVenCompanyName = $(".devJointVenCompanyName"+devVentureComInfoVal+":first").text().trim();
	$("#editDevJointVenCompanyName"+devVentureComInfoVal).val(devJointVenCompanyName);
	devJointVenStreetAddress = $(".devJointVenStreetAddress"+devVentureComInfoVal+":first").text().trim();
	$("#ediDevJointVenStreetAddress"+devVentureComInfoVal).val(devJointVenStreetAddress);
	devJointVenTown = $(".devJointVenTown"+devVentureComInfoVal+":first").text().trim();
	$("#editDevJointVenTown"+devVentureComInfoVal).val(devJointVenTown);
	devJointVenZipCode = $(".devJointVenZipCode"+devVentureComInfoVal+":first").text().trim();
	$("#editDevJointVenZipCode"+devVentureComInfoVal).val(devJointVenZipCode);
	devJointVenCountry = $(".devJointVenCountry"+devVentureComInfoVal+":first").text().trim();
	$("#editDevJointVenCountry"+devVentureComInfoVal).val(devJointVenCountry);
	devJointVenTelephone = $(".devJointVenTelephone"+devVentureComInfoVal+":first").text().trim();
	$("#editDevJointVenTelephone"+devVentureComInfoVal).val(devJointVenTelephone);
	devJointVenFax = $(".devJointVenFax"+devVentureComInfoVal+":first").text().trim();
	$("#editDevJointVenFax"+devVentureComInfoVal).val(devJointVenFax);
	devJointVenEmail = $(".devJointVenEmail"+devVentureComInfoVal+":first").text().trim();
	$("#editDevJointVenEmail"+devVentureComInfoVal).val(devJointVenEmail); 
	$(".saveEditDataBtn").attr("onclick" , "devVentureComEditData("+devVentureComInfoVal+")");
}
function devVentureComEditData(devVentureComInfoVal){
	$(".devJointVenCompanyName" + devVentureComInfoVal).html($("#editDevJointVenCompanyName"+devVentureComInfoVal).val());
	$(".devJointVenStreetAddress" + devVentureComInfoVal).html($("#ediDevJointVenStreetAddress"+devVentureComInfoVal).val());
	$(".devJointVenTown" + devVentureComInfoVal).html($("#editDevJointVenTown"+devVentureComInfoVal).val());
	$(".devJointVenZipCode" + devVentureComInfoVal).html($("#editDevJointVenZipCode"+devVentureComInfoVal).val());
	$(".devJointVenCountry" + devVentureComInfoVal).html($("#editDevJointVenCountry"+devVentureComInfoVal).val());
	$(".devJointVenTelephone" + devVentureComInfoVal).html($("#editDevJointVenTelephone"+devVentureComInfoVal).val());
	$(".devJointVenFax" + devVentureComInfoVal).html($("#editDevJointVenFax"+devVentureComInfoVal).val());
	$(".devJointVenEmail" + devVentureComInfoVal).html($("#editDevJointVenEmail"+devVentureComInfoVal).val());
	devJointVenCompanyName = $(".editDevJointVenCompanyName").val();
	devJointVenStreetAddress = $(".ediDevJointVenStreetAddress").val();
	devJointVenTown = $(".editDevJointVenTown").val();
	devJointVenZipCode=$(".editDevJointVenZipCode").val();
	devJointVenCountry=$(".editDevJointVenCountry").val();
	devJointVenTelephone=$(".editDevJointVenTelephone").val();
	devJointVenFax=$(".editDevJointVenFax").val();
	devJointVenEmail=$(".editDevJointVenEmail").val();
	devVentureAppId=$("#devVentureAppId"+ devVentureComInfoVal).val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	devVentureComInfoVal=$("#devVentureComInfoVal").val();
	
	$(".editDevJointVenCompanyName").val("");
	$(".ediDevJointVenStreetAddress").val("");
	$(".editDevJointVenTown").val("");
	$(".editDevJointVenZipCode").val("");
	$(".editDevJointVenCountry").val("");
	$(".editDevJointVenTelephone").val("");
	$(".editDevJointVenFax").val("");
	$(".editDevJointVenEmail").val("");
	$.ajax({
		type : "POST",
		url : "${addDeveloperGenBusinessParentComAndAddressUrl}",
		data : {
			"<portlet:namespace/>devJointVenCompanyName" : devJointVenCompanyName,
			"<portlet:namespace/>devJointVenStreetAddress" : devJointVenStreetAddress,
			"<portlet:namespace/>devJointVenTown" : devJointVenTown,
			"<portlet:namespace/>devJointVenZipCode" : devJointVenZipCode,
			"<portlet:namespace/>devJointVenCountry" : devJointVenCountry,
			"<portlet:namespace/>devJointVenTelephone" : devJointVenTelephone,
			"<portlet:namespace/>devJointVenFax" : devJointVenFax,
			"<portlet:namespace/>devJointVenEmail" : devJointVenEmail,
			"<portlet:namespace/>devVentureAppId" : devVentureAppId,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
			"<portlet:namespace/>count" : devVentureComInfoVal,
		},
		success : function(data) {
		}
	});
}
function devVentureComDeleteData(devVentureComInfoValData) {
	var devVentureComCountCounter = $("#devVentureComInfoVal").val();
	$("#devVentureComInfoVal").val(devVentureComCountCounter - 1);
	var delRowElement = $(".dev-venture-com-row" + devVentureComInfoValData); 
	delRowElement.remove();
	var j = parseInt(devVentureComInfoValData) + 1;
	// Update the row numbers and IDs for each row
	for (var i = j; i <= devVentureComCountCounter; i++) {
	  var prevCounter = i - 1;
	  var rowElement = $(".dev-venture-com-row" + i);
	  // Update the IDs for relevant elementsd
	  rowElement.attr("class", "dev-venture-com-row" + prevCounter);
	  rowElement.find("td.devJointVenCompanyName"+i).removeClass("devJointVenCompanyName"+i).addClass("devJointVenCompanyName"+prevCounter);
	  rowElement.find("td.devJointVenStreetAddress"+i).removeClass("devJointVenStreetAddress"+i).addClass("devJointVenStreetAddress"+prevCounter);
	  rowElement.find("td.devJointVenTown"+i).removeClass("devJointVenTown"+i).addClass("devJointVenTown"+prevCounter);
	  rowElement.find("td.devJointVenZipCode"+i).removeClass("devJointVenZipCode"+i).addClass("devJointVenZipCode"+prevCounter);
	  rowElement.find("td.devJointVenCountry"+i).removeClass("devJointVenCountry"+i).addClass("devJointVenCountry"+prevCounter);
	  rowElement.find("td.devJointVenTelephone"+i).removeClass("devJointVenTelephone"+i).addClass("devJointVenTelephone"+prevCounter);
	  rowElement.find("td.devJointVenFax"+i).removeClass("devJointVenFax"+i).addClass("devJointVenFax"+prevCounter);
	  rowElement.find("td.devJointVenEmail"+i).removeClass("devJointVenEmail"+i).addClass("devJointVenEmail"+prevCounter);
	  rowElement.find("#devVentureComDeleteDataTab").attr('onclick', 'devVentureComDeleteData(' +prevCounter+ ')');
	  rowElement.find("#devVentureComEditTab").attr('onclick', 'devVentureComEditTab(' +prevCounter+ ')');
	}
}

function addShareholderDetailBox(){
	devShareholderDetailVal = $("#devShareholderDetailVal").val();
	
	shareholderName = $("#shareholderName").val();
	shareholderStreetAddress = $("#shareholderStreetAddress").val();
	shareholderZipCode = $("#shareholderZipCode").val();
	shareholderCountry = $("#shareholderCountry").val();
	shareholderNationality = $("#shareholderNationality").val();
	shareholderTRN = $("#shareholderTRN").val();
	if(shareholderName != "" || shareholderStreetAddress !="" || shareholderZipCode !="" || 
			shareholderCountry !="" || shareholderNationality !="" || shareholderTRN !=""){
	$(".devShareholderDetailTableBox").removeClass("hide");
	$.ajax({
		type : "POST",
		url : "${addDevShareholderInfoUrl}",
		data : {
			"<portlet:namespace/>devShareholderDetailVal" : devShareholderDetailVal,
		},
		success : function(data) {
			/* APPEND ROW JSP INTO TABLE */
			$(".devShareholderDetailFormTable").each(function(index) {
				if (index === 0) {
					$(this).append(data);	
				} else {
					$cloneRow = $(data).clone();
				    $cloneRow.find('td').slice(-2).remove();
					$(this).append($cloneRow);
				}
			});
			/* APPEND DATA INTO TABLE */
			
			$(".shareholderName" + devShareholderDetailVal).append(shareholderName);
			$(".shareholderStreetAddress" + devShareholderDetailVal).append(shareholderStreetAddress);
			$(".shareholderZipCode" + devShareholderDetailVal).append(shareholderZipCode);
			$(".shareholderCountry" + devShareholderDetailVal).append(shareholderCountry);
			$(".shareholderNationality" + devShareholderDetailVal).append(shareholderNationality);
			$(".shareholderTRN" + devShareholderDetailVal).append(shareholderTRN);
			
			/* VALUE INCREAMENT */
			addShareholdingDetailOfPrinciple();
			devShareholderDetailVal++;
			$("#devShareholderDetailVal").val(devShareholderDetailVal);
			
			/* RESET FORM FIELDS */
			$("#shareholderName").val("");
			$("#shareholderStreetAddress").val("");
			$("#shareholderZipCode").val("");
			$("#shareholderCountry").val("");
			$("#shareholderNationality").val("");
			$("#shareholderTRN").val("");
		}
	});
  }else{
			$("#shareholderName").focus();
	}	
}
function devShareholderDetailEditTab(devShareholderDetailVal){
	$(".editDevShareholderDetailPopup").modal("show");
	$(".editShareholderName").attr("id" , "editShareholderName"+devShareholderDetailVal);
	$(".editShareholderStreetAddress").attr("id" , "editShareholderStreetAddress"+devShareholderDetailVal);
	$(".editShareholderZipCode").attr("id" , "editShareholderZipCode"+devShareholderDetailVal);
	$(".editShareholderCountry").attr("id" , "editShareholderCountry"+devShareholderDetailVal);
	$(".editShareholderNationality").attr("id" , "editShareholderNationality"+devShareholderDetailVal);
	$(".editShareholderTRN").attr("id" , "editShareholderTRN"+devShareholderDetailVal);
	
	shareholderName = $(".shareholderName"+devShareholderDetailVal+":first").text().trim();
	$("#editShareholderName"+devShareholderDetailVal).val(shareholderName);
	shareholderStreetAddress = $(".shareholderStreetAddress"+devShareholderDetailVal+":first").text().trim();
	$("#editShareholderStreetAddress"+devShareholderDetailVal).val(shareholderStreetAddress);
	shareholderZipCode = $(".shareholderZipCode"+devShareholderDetailVal+":first").text().trim();
	$("#editShareholderZipCode"+devShareholderDetailVal).val(shareholderZipCode);
	shareholderCountry = $(".shareholderCountry"+devShareholderDetailVal+":first").text().trim();
	$("#editShareholderCountry"+devShareholderDetailVal).val(shareholderCountry);
	shareholderNationality = $(".shareholderNationality"+devShareholderDetailVal+":first").text().trim();
	$("#editShareholderNationality"+devShareholderDetailVal).val(shareholderNationality);
	shareholderTRN = $(".shareholderTRN"+devShareholderDetailVal+":first").text().trim();
	$("#editShareholderTRN"+devShareholderDetailVal).val(shareholderTRN);
	$(".saveEditDevShareholderDataBtn").attr("onclick" , "devShareholderDetailEditData("+devShareholderDetailVal+")");
}
function devShareholderDetailEditData(devShareholderDetailVal){
	$(".shareholderName" + devShareholderDetailVal).html($("#editShareholderName"+devShareholderDetailVal).val());
	$(".shareholderStreetAddress" + devShareholderDetailVal).html($("#editShareholderStreetAddress"+devShareholderDetailVal).val());
	$(".shareholderZipCode" + devShareholderDetailVal).html($("#editShareholderZipCode"+devShareholderDetailVal).val());
	$(".shareholderCountry" + devShareholderDetailVal).html($("#editShareholderCountry"+devShareholderDetailVal).val());
	$(".shareholderNationality" + devShareholderDetailVal).html($("#editShareholderNationality"+devShareholderDetailVal).val());
	$(".shareholderTRN" + devShareholderDetailVal).html($("#editShareholderTRN"+devShareholderDetailVal).val());
	
	shareholderName = $(".editShareholderName").val();
	shareholderStreetAddress = $(".editShareholderStreetAddress").val();
	shareholderZipCode = $(".editShareholderZipCode").val();
	shareholderCountry=$(".editShareholderCountry").val();
	shareholderNationality=$(".editShareholderNationality").val();
	shareholderTRN=$(".editShareholderTRN").val();
	devShareholderDetailId=$("#devShareholderDetailId"+ devShareholderDetailVal).val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	
	$(".editShareholderName").val("");
	$(".editShareholderStreetAddress").val("");
	$(".editShareholderZipCode").val("");
	$(".editShareholderCountry").val("");
	$(".editShareholderNationality").val("");
	$(".editShareholderTRN").val("");
	$.ajax({
		type : "POST",
		url : "${addShareholdingDetailOfPrincipleUrl}",
		data : {
			"<portlet:namespace/>shareholderName" : shareholderName,
			"<portlet:namespace/>shareholderStreetAddress" : shareholderStreetAddress,
			"<portlet:namespace/>shareholderZipCode" : shareholderZipCode,
			"<portlet:namespace/>shareholderCountry" : shareholderCountry,
			"<portlet:namespace/>shareholderNationality" : shareholderNationality,
			"<portlet:namespace/>shareholderTRN" : shareholderTRN,
			"<portlet:namespace/>devShareholderDetailId" : devShareholderDetailId,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
		}
	});
}
function devShareholderDeleteData(devShareholderDetailValData) {
	var devShareholderCountCounter = $("#devShareholderDetailVal").val();
	$("#devShareholderDetailVal").val(devShareholderCountCounter - 1);
	var delRowElement = $(".dev-shareholder-row" + devShareholderDetailValData); 
	delRowElement.remove();
	var j = parseInt(devShareholderDetailValData) + 1;
	// Update the row numbers and IDs for each row
	for (var i = j; i <= devShareholderCountCounter; i++) {
	  var prevCounter = i - 1;
	  var rowElement = $(".dev-shareholder-row" + i);
	  // Update the IDs for relevant elementsd
	  rowElement.attr("class", "dev-shareholder-row" + prevCounter);
	  rowElement.find("td.shareholderName"+i).removeClass("shareholderName"+i).addClass("shareholderName"+prevCounter);
	  rowElement.find("td.shareholderStreetAddress"+i).removeClass("shareholderStreetAddress"+i).addClass("shareholderStreetAddress"+prevCounter);
	  rowElement.find("td.shareholderZipCode"+i).removeClass("shareholderZipCode"+i).addClass("shareholderZipCode"+prevCounter);
	  rowElement.find("td.shareholderCountry"+i).removeClass("shareholderCountry"+i).addClass("shareholderCountry"+prevCounter);
	  rowElement.find("td.shareholderNationality"+i).removeClass("shareholderNationality"+i).addClass("shareholderNationality"+prevCounter);
	  rowElement.find("td.shareholderTRN"+i).removeClass("shareholderTRN"+i).addClass("shareholderTRN"+prevCounter);
	  rowElement.find("#devShareholderDeleteDataTab").attr('onclick', 'devShareholderDeleteData(' +prevCounter+ ')');
	  rowElement.find("#devShareholderDetailEditTab").attr('onclick', 'devShareholderDetailEditTab(' +prevCounter+ ')');
	}
}

function addDirectorShareholdersBox(){
	devDirectorShareholderVal = $("#devDirectorShareholderVal").val();
	
	principalShareholderName = $("#principalShareholderName").val();
	principalShareholderShares = $("#principalShareholderShares").val();
	if(principalShareholderName != "" || principalShareholderShares !=""){
	$(".devDirectorShareholderTableBox").removeClass("hide");
	$.ajax({
		type : "POST",
		url : "${addDevDirectorShareholderInfoUrl}",
		data : {
			"<portlet:namespace/>devDirectorShareholderVal" : devDirectorShareholderVal,
		},
		success : function(data) {
			/* APPEND ROW JSP INTO TABLE */
			$(".devDirectorShareholderTable").each(function(index) {
				if (index === 0) {
					$(this).append(data);
				} else {
					$cloneRow = $(data).clone();
					$cloneRow.find('td').slice(-2).remove();
					$(this).append($cloneRow);
				}
			});
			/* APPEND DATA INTO TABLE */
			
			$(".principalShareholderName" + devDirectorShareholderVal).append(principalShareholderName);
			$(".principalShareholderShares" + devDirectorShareholderVal).append(principalShareholderShares);
			
			/* VALUE INCREAMENT */
			addShareholdingPrincipleShareholder();
			devDirectorShareholderVal++;
			$("#devDirectorShareholderVal").val(devDirectorShareholderVal);
			/* RESET FORM FIELDS */
			 $("#principalShareholderName").val("");
			 $("#principalShareholderShares").val("");
		}
	});
	}else{
		  $("#principalShareholderName").focus();
	  }	
}
function devDirectorShareholderDetailEditTab(devDirectorShareholderVal){
	$(".editDevDirectorShareholderDetailPopup").modal("show");
	$(".editPrincipalShareholderName").attr("id" , "editPrincipalShareholderName"+devDirectorShareholderVal);
	$(".editPrincipalShareholderShares").attr("id" , "editPrincipalShareholderShares"+devDirectorShareholderVal);
	principalShareholderName = $(".principalShareholderName"+devDirectorShareholderVal+":first").text().trim();
	$("#editPrincipalShareholderName"+devDirectorShareholderVal).val(principalShareholderName);
	principalShareholderShares = $(".principalShareholderShares"+devDirectorShareholderVal+":first").text().trim();
	$("#editPrincipalShareholderShares"+devDirectorShareholderVal).val(principalShareholderShares);
	$(".saveEditDevDirectorShareholderDataBtn").attr("onclick" , "devDirectorShareholderDetailEditData("+devDirectorShareholderVal+")");
}
function devDirectorShareholderDetailEditData(devDirectorShareholderVal){
	$(".principalShareholderName" + devDirectorShareholderVal).html($("#editPrincipalShareholderName"+devDirectorShareholderVal).val());
	$(".principalShareholderShares" + devDirectorShareholderVal).html($("#editPrincipalShareholderShares"+devDirectorShareholderVal).val());
	
	principalShareholderName=$(".editPrincipalShareholderName").val();
	principalShareholderShares=$(".editPrincipalShareholderShares").val();
	/*hidden field */
	devDirectorShareholderId=$("#devDirectorShareholderId"+ devDirectorShareholderVal).val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	$(".editPrincipalShareholderName").val("");
	$(".editPrincipalShareholderShares").val("");
	$.ajax({
		type : "POST",
		url : "${addShareholdingPrincipleShareholderUrl}",
		data : {
			"<portlet:namespace/>principalShareholderName" : principalShareholderName,
			"<portlet:namespace/>principalShareholderShares" : principalShareholderShares,
			"<portlet:namespace/>devDirectorShareholderId" : devDirectorShareholderId,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
		}
	});
}
function devDirectorShareholderDeleteData(devDirectorShareholderValData) {
	var devDirectorShareholderCountCounter = $("#devDirectorShareholderVal").val();
	$("#devDirectorShareholderVal").val(devDirectorShareholderCountCounter - 1);
	var delRowElement = $(".dev-director-shareholder-row" + devDirectorShareholderValData); 
	delRowElement.remove();
	var j = parseInt(devDirectorShareholderValData) + 1;
	// Update the row numbers and IDs for each row
	for (var i = j; i <= devDirectorShareholderCountCounter; i++) {
	  var prevCounter = i - 1;
	  var rowElement = $(".dev-director-shareholder-row" + i);
	  // Update the IDs for relevant elementsd
	  rowElement.attr("class", "dev-director-shareholder-row" + prevCounter);
	  rowElement.find("td.principalShareholderName"+i).removeClass("principalShareholderName"+i).addClass("principalShareholderName"+prevCounter);
	  rowElement.find("td.principalShareholderShares"+i).removeClass("principalShareholderShares"+i).addClass("principalShareholderShares"+prevCounter);
	  rowElement.find("#devDirectorShareholderDeleteDataTab").attr('onclick', 'devDirectorShareholderDeleteData(' +prevCounter+ ')');
	  rowElement.find("#devDirectorShareholderDetailEditTab").attr('onclick', 'devDirectorShareholderDetailEditTab(' +prevCounter+ ')');
	}
}

/* devComDirector */
function addComDirectorBox(){
	devComDirectorVal = $("#devComDirectorVal").val();
	
	comDirectorName = $("#comDirectorName").val();
	comDirectorCompanyName = $("#comDirectorCompanyName").val();
	comDirectorRelationship = $("#comDirectorRelationship").val();
	if(comDirectorName != "" || comDirectorCompanyName !="" || comDirectorRelationship !=""){
	$(".addComDirectorTableBox").removeClass("hide");
	$.ajax({
		type : "POST",
		url : "${addDevComDirectorInfoUrl}",
		data : {
			"<portlet:namespace/>devComDirectorVal" : devComDirectorVal,
		},
		success : function(data) {
			/* APPEND ROW JSP INTO TABLE */
			$(".addComDirectorTable").each(function(index) {
				if (index === 0) {
					$(this).append(data);
				} else {
					$cloneRow = $(data).clone();
					$cloneRow.find('td').slice(-2).remove();
					$(this).append($cloneRow);
				}
			});
			/* APPEND DATA INTO TABLE */
			
			$(".comDirectorName" + devComDirectorVal).append(comDirectorName);
			$(".comDirectorCompanyName" + devComDirectorVal).append(comDirectorCompanyName);
			$(".comDirectorRelationship" + devComDirectorVal).append(comDirectorRelationship);
			
			/* VALUE INCREAMENT */
			addShareholdingListOfCompanyDirectorship();
			devComDirectorVal++;
			$("#devComDirectorVal").val(devComDirectorVal);
			/* RESET FORM FIELDS */
			$("#comDirectorName").val("");
			$("#comDirectorCompanyName").val("");
			$("#comDirectorRelationship").val("");
		}
	});
  }else{
		  $("#comDirectorName").focus();
	  }	
}
function devComDirectorEditTab(devComDirectorVal){
	$(".editDevComDirectorPopup").modal("show");
	$(".editComDirectorName").attr("id" , "editComDirectorName"+devComDirectorVal);
	$(".editComDirectorCompanyName").attr("id" , "editComDirectorCompanyName"+devComDirectorVal);
	$(".editComDirectorRelationship").attr("id" , "editComDirectorRelationship"+devComDirectorVal);
	
	comDirectorName = $(".comDirectorName"+devComDirectorVal+":first").text().trim();
	$("#editComDirectorName"+devComDirectorVal).val(comDirectorName);
	comDirectorCompanyName = $(".comDirectorCompanyName"+devComDirectorVal+":first").text().trim();
	$("#editComDirectorCompanyName"+devComDirectorVal).val(comDirectorCompanyName);
	comDirectorRelationship = $(".comDirectorRelationship"+devComDirectorVal+":first").text().trim();
	$("#editComDirectorRelationship"+devComDirectorVal).val(comDirectorRelationship);
	$(".saveEditDevComDirectorDataBtn").attr("onclick" , "devComDirectorEditData("+devComDirectorVal+")");
}
function devComDirectorEditData(devComDirectorVal){
	$(".comDirectorName" + devComDirectorVal).html($("#editComDirectorName"+devComDirectorVal).val());
	$(".comDirectorCompanyName" + devComDirectorVal).html($("#editComDirectorCompanyName"+devComDirectorVal).val());
	$(".comDirectorRelationship" + devComDirectorVal).html($("#editComDirectorRelationship"+devComDirectorVal).val());
	
	comDirectorName = $(".editComDirectorName").val();
	comDirectorCompanyName = $(".editComDirectorCompanyName").val();
	comDirectorRelationship = $(".editComDirectorRelationship").val();
	
	/*hidden field*/
	devComDirectorId=$("#devComDirectorId"+ devComDirectorVal).val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	
	$(".editComDirectorName").val("");
	$(".editComDirectorCompanyName").val("");
	$(".editComDirectorRelationship").val("");
	$.ajax({
		type : "POST",
		url : "${addListOfComDirectorUrl}",
		data : {
			"<portlet:namespace/>comDirectorName" : comDirectorName,
			"<portlet:namespace/>comDirectorCompanyName" : comDirectorCompanyName,
			"<portlet:namespace/>comDirectorRelationship" : comDirectorRelationship,
			"<portlet:namespace/>devComDirectorId" : devComDirectorId,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
		}
	});
}
function devComDirectorDeleteData(devComDirectorValData) {
	var devComDirectorCountCounter = $("#devComDirectorVal").val();
	$("#devComDirectorVal").val(devComDirectorCountCounter - 1);
	var delRowElement = $(".dev-com-director-row" + devComDirectorValData); 
	delRowElement.remove();
	var j = parseInt(devComDirectorValData) + 1;
	// Update the row numbers and IDs for each row
	for (var i = j; i <= devComDirectorCountCounter; i++) {
	  var prevCounter = i - 1;
	  var rowElement = $(".dev-com-director-row" + i);
	  // Update the IDs for relevant elementsd
	  rowElement.attr("class", "dev-com-director-row" + prevCounter);
	  rowElement.find("td.comDirectorName"+i).removeClass("comDirectorName"+i).addClass("comDirectorName"+prevCounter);
	  rowElement.find("td.comDirectorCompanyName"+i).removeClass("comDirectorCompanyName"+i).addClass("comDirectorCompanyName"+prevCounter);
	  rowElement.find("td.comDirectorRelationship"+i).removeClass("comDirectorRelationship"+i).addClass("comDirectorRelationship"+prevCounter);
	  rowElement.find("#devComDirectorDeleteDataTab").attr('onclick', 'devComDirectorDeleteData(' +prevCounter+ ')');
	  rowElement.find("#devComDirectorEditTab").attr('onclick', 'devComDirectorEditTab(' +prevCounter+ ')');
	}
}

/* addCorporation */
function addCorporationBox(){
	devCorporationVal = $("#devCorporationVal").val();
	
	comCorporationPersonName = $("#comCorporationPersonName").val();
	comCorporationName = $("#comCorporationName").val();
	comCorporationRelationship = $("#comCorporationRelationship").val();
	if(comCorporationPersonName != "" || comCorporationName !="" || comCorporationRelationship !=""){
	$(".addCorporationTableBox").removeClass("hide");
	$.ajax({
		type : "POST",
		url : "${addDevCorporationInfoUrl}",
		data : {
			"<portlet:namespace/>devCorporationVal" : devCorporationVal,
		},
		success : function(data) {
			/* APPEND ROW JSP INTO TABLE */
			$(".addCorporationTable").each(function(index) {
				if (index === 0) {
					$(this).append(data);
				} else {
					$cloneRow = $(data).clone();
					$cloneRow.find('td').slice(-2).remove();
					$(this).append($cloneRow);
				}
			});
			/* APPEND DATA INTO TABLE */
			$(".comCorporationPersonName" + devCorporationVal).append(comCorporationPersonName);
			$(".comCorporationName" + devCorporationVal).append(comCorporationName);
			$(".comCorporationRelationship" + devCorporationVal).append(comCorporationRelationship);
			
			/* VALUE INCREAMENT */
			addShareholdingCorporationBusiness();
			devCorporationVal++;
			$("#devCorporationVal").val(devCorporationVal);
			/* RESET FORM FIELDS */
			$("#comCorporationPersonName").val("");
			$("#comCorporationName").val("");
			$("#comCorporationRelationship").val("");
		}
	});
  }else{
		  $("#comCorporationPersonName").focus();
	}	
}
function devCorporationEditTab(devCorporationVal){
	$(".editDevCorporationPopup").modal("show");
	$(".editComCorporationPersonName").attr("id" , "editComCorporationPersonName"+devCorporationVal);
	$(".editComCorporationName").attr("id" , "editComCorporationName"+devCorporationVal);
	$(".editComCorporationRelationship").attr("id" , "editComCorporationRelationship"+devCorporationVal);
	comCorporationPersonName = $(".comCorporationPersonName"+devCorporationVal+":first").text().trim();
	$("#editComCorporationPersonName"+devCorporationVal).val(comCorporationPersonName);
	comCorporationName = $(".comCorporationName"+devCorporationVal+":first").text().trim();
	$("#editComCorporationName"+devCorporationVal).val(comCorporationName);
	comCorporationRelationship = $(".comCorporationRelationship"+devCorporationVal+":first").text().trim();
	$("#editComCorporationRelationship"+devCorporationVal).val(comCorporationRelationship);
	$(".saveEditDevCorporationDataBtn").attr("onclick" , "devCorporationEditData("+devCorporationVal+")");
}
function devCorporationEditData(devCorporationVal){
	$(".comCorporationPersonName" + devCorporationVal).html($("#editComCorporationPersonName"+devCorporationVal).val());
	$(".comCorporationName" + devCorporationVal).html($("#editComCorporationName"+devCorporationVal).val());
	$(".comCorporationRelationship" + devCorporationVal).html($("#editComCorporationRelationship"+devCorporationVal).val());
	comCorporationPersonName = $(".editComCorporationPersonName").val();
	comCorporationName = $(".editComCorporationName").val();
	comCorporationRelationship = $(".editComCorporationRelationship").val();
	/*hidden field*/
	devCorporationBusinessId=$("#devCorporationBusinessId"+ devCorporationVal).val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	$(".editComCorporationPersonName").val("");
	$(".editComCorporationName").val("");
	$(".editComCorporationRelationship").val("");
	$.ajax({
		type : "POST",
		url : "${addCorporationBusinessUrl}",
		data : {
			"<portlet:namespace/>comCorporationPersonName" : comCorporationPersonName,
			"<portlet:namespace/>comCorporationName" : comCorporationName,
			"<portlet:namespace/>comCorporationRelationship" : comCorporationRelationship,
			"<portlet:namespace/>devCorporationBusinessId" : devCorporationBusinessId,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
		}
	});
}
function devCorporationDeleteData(devCorporationValData) {
	var devCorporationCountCounter = $("#devCorporationVal").val();
	$("#devCorporationVal").val(devCorporationCountCounter - 1);
	var delRowElement = $(".dev-corporation-row" + devCorporationValData); 
	delRowElement.remove();
	var j = parseInt(devCorporationValData) + 1;
	// Update the row numbers and IDs for each row
	for (var i = j; i <= devCorporationCountCounter; i++) {
	  var prevCounter = i - 1;
	  var rowElement = $(".dev-corporation-row" + i);
	  // Update the IDs for relevant elementsd
	  rowElement.attr("class", "dev-corporation-row" + prevCounter);
	  rowElement.find("td.comCorporationPersonName"+i).removeClass("comCorporationPersonName"+i).addClass("comCorporationPersonName"+prevCounter);
	  rowElement.find("td.comCorporationName"+i).removeClass("comCorporationName"+i).addClass("comCorporationName"+prevCounter);
	  rowElement.find("td.comCorporationRelationship"+i).removeClass("comCorporationRelationship"+i).addClass("comCorporationRelationship"+prevCounter);
	  rowElement.find("#devCorporationDeleteDataTab").attr('onclick', 'devCorporationDeleteData(' +prevCounter+ ')');
	  rowElement.find("#devCorporationEditTab").attr('onclick', 'devCorporationEditTab(' +prevCounter+ ')');
	}
}

/* addDirectorBankruptInvolve */
function addDirectorBankruptInvolveBox(){
	devDirectorBankruptInvolveVal = $("#devDirectorBankruptInvolveVal").val();
	
	comDirectorBankruptName = $("#comDirectorBankruptName").val();
	if(comDirectorBankruptName != ""){
	$(".directorBankruptInvolveTableBox").removeClass("hide");
	$.ajax({
		type : "POST",
		url : "${addDirectorBankruptInvolveInfoUrl}",
		data : {
			"<portlet:namespace/>devDirectorBankruptInvolveVal" : devDirectorBankruptInvolveVal,
		},
		success : function(data) {
			/* APPEND ROW JSP INTO TABLE */
			$(".directorBankruptInvolveTable").each(function(index) {
				if (index === 0) {
					$(this).append(data);
				} else {
					$cloneRow = $(data).clone();
					$cloneRow.find('td').slice(-2).remove();
					$(this).append($cloneRow);
				}
			});
			/* APPEND DATA INTO TABLE */
			$(".comDirectorBankruptName" + devDirectorBankruptInvolveVal).append(comDirectorBankruptName);
			
			/* VALUE INCREAMENT */
			addShareholdingNameOfDirector();
			devDirectorBankruptInvolveVal++;
			$("#devDirectorBankruptInvolveVal").val(devDirectorBankruptInvolveVal);
			
			/* RESET FORM FIELDS */
			$("#comDirectorBankruptName").val("");
		}
	});
 }else{
		  $("#comDirectorBankruptName").focus();
	}	
}
function devDirectorBankruptEditTab(devDirectorBankruptInvolveVal){
	$(".editDevDirectorBankruptPopup").modal("show");
	$(".editComDirectorBankruptName").attr("id" , "editComDirectorBankruptName"+devDirectorBankruptInvolveVal);
	comDirectorBankruptName = $(".comDirectorBankruptName"+devDirectorBankruptInvolveVal+":first").text().trim();
	$("#editComDirectorBankruptName"+devDirectorBankruptInvolveVal).val(comDirectorBankruptName);
	$(".saveEditDevDirectorBankruptDataBtn").attr("onclick" , "devDirectorBankruptEditData("+devDirectorBankruptInvolveVal+")");
}
function devDirectorBankruptEditData(devDirectorBankruptInvolveVal){
	$(".comDirectorBankruptName" + devDirectorBankruptInvolveVal).html($("#editComDirectorBankruptName"+devDirectorBankruptInvolveVal).val());
	comDirectorBankruptName = $(".editComDirectorBankruptName").val();
	/*hidden field*/
	devDirectorBankruptInvolveId=$("#devDirectorBankruptInvolveId"+ devDirectorBankruptInvolveVal).val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	$(".editComDirectorBankruptName").val("");
	$.ajax({
		type : "POST",
		url : "${addNameOfDirectorUrl}",
		data : {
			"<portlet:namespace/>comDirectorBankruptName" : comDirectorBankruptName,
			"<portlet:namespace/>devDirectorBankruptInvolveId" : devDirectorBankruptInvolveId,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
		}
	});
}
function devDirectorBankruptDeleteData(devDirectorBankruptInvolveValData) {
	var devDirectorBankruptCountCounter = $("#devDirectorBankruptInvolveVal").val();
	$("#devDirectorBankruptInvolveVal").val(devDirectorBankruptCountCounter - 1);
	var delRowElement = $(".dev-director-bankrupt-row" + devDirectorBankruptInvolveValData); 
	delRowElement.remove();
	var j = parseInt(devDirectorBankruptInvolveValData) + 1;
	// Update the row numbers and IDs for each row
	for (var i = j; i <= devDirectorBankruptCountCounter; i++) {
	  var prevCounter = i - 1;
	  var rowElement = $(".dev-director-bankrupt-row" + i);
	  // Update the IDs for relevant elementsd
	  rowElement.attr("class", "dev-director-bankrupt-row" + prevCounter);
	  rowElement.find("td.comDirectorBankruptName"+i).removeClass("comDirectorBankruptName"+i).addClass("comDirectorBankruptName"+prevCounter);
	  rowElement.find("#devDirectorBankruptDeleteDataTab").attr('onclick', 'devDirectorBankruptDeleteData(' +prevCounter+ ')');
	  rowElement.find("#devDirectorBankruptEditTab").attr('onclick', 'devDirectorBankruptEditTab(' +prevCounter+ ')');
	}
}

/* add Operating Zone */
function addOperatingZoneLocationBox(){
	devOperatingZoneLocationVal = $("#devOperatingZoneLocationVal").val();
	
	sezFreeCurrentZoneName = $("#sezFreeCurrentZoneName").val();
	sezFreeCurrentZoneParish = $("#sezFreeCurrentZoneParish").val();
	if(sezFreeCurrentZoneName != "" || sezFreeCurrentZoneParish !=""){
	$(".operatingZoneLocationTableBox").removeClass("hide");
	$.ajax({
		type : "POST",
		url : "${addOperatingZoneLocationInfoUrl}",
		data : {
			"<portlet:namespace/>devOperatingZoneLocationVal" : devOperatingZoneLocationVal,
		},
		success : function(data) {
			/* APPEND ROW JSP INTO TABLE */
			$(".operatingZoneLocationTable").each(function(index) {
				if (index === 0) {
					$(this).append(data);
				} else {
					$cloneRow = $(data).clone();
					$cloneRow.find('td:last').remove().end();
					$(this).append($cloneRow);
				}
			});
			/* APPEND DATA INTO TABLE */

			$(".sezFreeCurrentZoneName" + devOperatingZoneLocationVal).append(sezFreeCurrentZoneName);
			$(".sezFreeCurrentZoneParish" + devOperatingZoneLocationVal).append(sezFreeCurrentZoneParish);
			
			/* VALUE INCREAMENT */
			addProposedProjectPleaseState();
			devOperatingZoneLocationVal++;
			$("#devOperatingZoneLocationVal").val(devOperatingZoneLocationVal);
			
			/* RESET FORM FIELDS */
			$("#sezFreeCurrentZoneName").val("");
			$("#sezFreeCurrentZoneParish").val("");
		}
	});
	}else{
		 $("#sezFreeCurrentZoneName").focus();
	}	
}
function devOperatingZoneLocationEditTab(devOperatingZoneLocationVal){
	$(".editDevOperatingZoneLocationPopup").modal("show");
	$(".editSezFreeCurrentZoneName").attr("id" , "editSezFreeCurrentZoneName"+devOperatingZoneLocationVal);
	$(".editSezFreeCurrentZoneParish").attr("id" , "editSezFreeCurrentZoneParish"+devOperatingZoneLocationVal);
	
	sezFreeCurrentZoneName = $(".sezFreeCurrentZoneName"+devOperatingZoneLocationVal+":first").text().trim();
	$("#editSezFreeCurrentZoneName"+devOperatingZoneLocationVal).val(sezFreeCurrentZoneName);
	sezFreeCurrentZoneParish = $(".sezFreeCurrentZoneParish"+devOperatingZoneLocationVal+":first").text().trim();
	$("#editSezFreeCurrentZoneParish"+devOperatingZoneLocationVal).val(sezFreeCurrentZoneParish);
	$(".saveEditDevOperatingZoneLocationDataBtn").attr("onclick" , "devOperatingZoneLocationEditData("+devOperatingZoneLocationVal+")");
}
function devOperatingZoneLocationEditData(devOperatingZoneLocationVal){
	$(".sezFreeCurrentZoneName" + devOperatingZoneLocationVal).html($("#editSezFreeCurrentZoneName"+devOperatingZoneLocationVal).val());
	$(".sezFreeCurrentZoneParish" + devOperatingZoneLocationVal).html($("#editSezFreeCurrentZoneParish"+devOperatingZoneLocationVal).val());
	sezFreeCurrentZoneName = $(".editSezFreeCurrentZoneName").val();
	sezFreeCurrentZoneParish = $(".editSezFreeCurrentZoneParish").val();
	/*hidden field*/
	devOperatingZoneLocationId=$("#devOperatingZoneLocationId"+ devOperatingZoneLocationVal).val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	$(".editSezFreeCurrentZoneName").val("");
	$(".editSezFreeCurrentZoneParish").val("");
	$.ajax({
		type : "POST",
		url : "${addProjectPleaseStateUrl}",
		data : {
			"<portlet:namespace/>sezFreeCurrentZoneName" : sezFreeCurrentZoneName,
			"<portlet:namespace/>sezFreeCurrentZoneParish" : sezFreeCurrentZoneParish,
			"<portlet:namespace/>devOperatingZoneLocationId" : devOperatingZoneLocationId,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
		}
	});
}
function devOperatingZoneLocationDeleteData(devOperatingZoneLocationValData) {
	var devOperatingZoneLocationCountCounter = $("#devOperatingZoneLocationVal").val();
	$("#devOperatingZoneLocationVal").val(devOperatingZoneLocationCountCounter - 1);
	var delRowElement = $(".dev-operating-zone-location-row" + devOperatingZoneLocationValData); 
	delRowElement.remove();
	var j = parseInt(devOperatingZoneLocationValData) + 1;
	// Update the row numbers and IDs for each row
	for (var i = j; i <= devOperatingZoneLocationCountCounter; i++) {
	  var prevCounter = i - 1;
	  var rowElement = $(".dev-operating-zone-location-row" + i);
	  // Update the IDs for relevant elementsd
	  rowElement.attr("class", "dev-operating-zone-location-row" + prevCounter);
	  rowElement.find("td.sezFreeCurrentZoneName"+i).removeClass("sezFreeCurrentZoneName"+i).addClass("sezFreeCurrentZoneName"+prevCounter);
	  rowElement.find("td.sezFreeCurrentZoneParish"+i).removeClass("sezFreeCurrentZoneParish"+i).addClass("sezFreeCurrentZoneParish"+prevCounter);
	  rowElement.find("#devOperatingZoneLocationDeleteDataTab").attr('onclick', 'devOperatingZoneLocationDeleteData(' +prevCounter+ ')');
	  rowElement.find("#devOperatingZoneLocationEditTab").attr('onclick', 'devOperatingZoneLocationEditTab(' +prevCounter+ ')');
	}
}

/* add SecurityMeasures*/
	function addSecurityMeasuresBox(){
		devSecurityMeasuresVal = $("#devSecurityMeasuresVal").val();
		
		securityMeasures = $("#securityMeasures").val();
		if(securityMeasures != ""){
		$(".securityMeasuresTableBox").removeClass("hide");
		$.ajax({
			type : "POST",
			url : "${addSecurityMeasuresInfoUrl}",
			data : {
				"<portlet:namespace/>devSecurityMeasuresVal" : devSecurityMeasuresVal,
			},
			success : function(data) {
				/* APPEND ROW JSP INTO TABLE */
				$(".securityMeasuresTable").each(function(index) {
					if (index === 0) {
						$(this).append(data);
					} else {
						$cloneRow = $(data).clone();
						$cloneRow.find('td').slice(-2).remove();
						$(this).append($cloneRow);
					}
				});
				/* APPEND DATA INTO TABLE */

				$(".securityMeasures" + devSecurityMeasuresVal).append(securityMeasures);
				
				/* VALUE INCREAMENT */
				addDeveloperEmployeeSafetyInfo();
				devSecurityMeasuresVal++;
				$("#devSecurityMeasuresVal").val(devSecurityMeasuresVal);
				/* RESET FORM FIELDS */
				$("#securityMeasures").val("");
			}
		});
	}else{
			 $("#securityMeasures").focus();
		}	
	}
	function devSecurityMeasuresEditTab(devSecurityMeasuresVal){
		$(".editDevSecurityMeasuresPopup").modal("show");
		$(".editSecurityMeasures").attr("id" , "editSecurityMeasures"+devSecurityMeasuresVal);
		securityMeasures = $(".securityMeasures"+devSecurityMeasuresVal+":first").text().trim();
		$("#editSecurityMeasures"+devSecurityMeasuresVal).val(securityMeasures);
		$(".saveEditDevSecurityMeasuresDataBtn").attr("onclick" , "devSecurityMeasuresEditData("+devSecurityMeasuresVal+")");
	}
	function devSecurityMeasuresEditData(devSecurityMeasuresVal){
		$(".securityMeasures" + devSecurityMeasuresVal).html($("#editSecurityMeasures"+devSecurityMeasuresVal).val());
		securityMeasures = $(".editSecurityMeasures").val();
		/*hidden field*/
		devSecurityMeasuresId=$("#devSecurityMeasuresId"+ devSecurityMeasuresVal).val();
		sezStatusApplicationId=$("#sezStatusApplicationId").val();
		$(".editSecurityMeasures").val("");
		$.ajax({
			type : "POST",
			url : "${addDevEmployeeSafetyInfoUrl}",
			data : {
				"<portlet:namespace/>securityMeasures" : securityMeasures,
				"<portlet:namespace/>devSecurityMeasuresId" : devSecurityMeasuresId,
				"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
			},
			success : function(data) {
			}
		});
	}
	function devSecurityMeasuresDeleteData(devSecurityMeasuresValData) {
		var devSecurityMeasuresCountCounter = $("#devSecurityMeasuresVal").val();
		$("#devSecurityMeasuresVal").val(devSecurityMeasuresCountCounter - 1);
		var delRowElement = $(".dev-security-measures-row" + devSecurityMeasuresValData); 
		delRowElement.remove();
		var j = parseInt(devSecurityMeasuresValData) + 1;
		// Update the row numbers and IDs for each row
		for (var i = j; i <= devSecurityMeasuresCountCounter; i++) {
		  var prevCounter = i - 1;
		  var rowElement = $(".dev-security-measures-row" + i);
		  // Update the IDs for relevant elementsd
		  rowElement.attr("class", "dev-security-measures-row" + prevCounter);
		  rowElement.find("td.securityMeasures"+i).removeClass("securityMeasures"+i).addClass("securityMeasures"+prevCounter);
		  rowElement.find("#devSecurityMeasuresDeleteDataTab").attr('onclick', 'devSecurityMeasuresDeleteData(' +prevCounter+ ')');
		  rowElement.find("#devSecurityMeasuresEditTab").attr('onclick', 'devSecurityMeasuresEditTab(' +prevCounter+ ')');
		}
	}
	
	/* add OccuSafetySystem*/
	function addOccuSafetySystemBox(){
		devOccuSafetySystemVal = $("#devOccuSafetySystemVal").val();
		
		occuSafetySystem = $("#occuSafetySystem").val();
		if(occuSafetySystem != ""){
		$(".occuSafetySystemTableBox").removeClass("hide");
		$.ajax({
			type : "POST",
			url : "${addOccuSafetySystemInfoUrl}",
			data : {
				"<portlet:namespace/>devOccuSafetySystemVal" : devOccuSafetySystemVal,
			},
			success : function(data) {
				/* APPEND ROW JSP INTO TABLE */
				$(".occuSafetySystemTable").each(function(index) {
					if (index === 0) {
						$(this).append(data);
					} else {
						$cloneRow = $(data).clone();
						$cloneRow.find('td').slice(-2).remove();
						$(this).append($cloneRow);
					}
				});
				/* APPEND DATA INTO TABLE */
				
				$(".occuSafetySystem" + devOccuSafetySystemVal).append(occuSafetySystem);
				
				/* VALUE INCREAMENT */
				addDeveloperEmployeeDefineYourOccupationInfo();
				devOccuSafetySystemVal++;
				$("#devOccuSafetySystemVal").val(devOccuSafetySystemVal);
				/* RESET FORM FIELDS */
				$("#occuSafetySystem").val("");
			}
		});
	}else{
		 $("#occuSafetySystem").focus();
	}	
 }
	function devOccuSafetySystemEditTab(devOccuSafetySystemVal){
		$(".editDevOccuSafetySystemPopup").modal("show");
		$(".editOccuSafetySystem").attr("id" , "editOccuSafetySystem"+devOccuSafetySystemVal);
		occuSafetySystem = $(".occuSafetySystem"+devOccuSafetySystemVal+":first").text().trim();
		$("#editOccuSafetySystem"+devOccuSafetySystemVal).val(occuSafetySystem);
		$(".saveEditDevSafetySystemDataBtn").attr("onclick" , "devSafetySystemEditData("+devOccuSafetySystemVal+")");
	}
	function devSafetySystemEditData(devOccuSafetySystemVal){
		$(".occuSafetySystem" + devOccuSafetySystemVal).html($("#editOccuSafetySystem"+devOccuSafetySystemVal).val());
		occuSafetySystem = $(".editOccuSafetySystem").val();
		/*hidden field*/
		devOccuSafetySystemId=$("#devOccuSafetySystemId"+ devOccuSafetySystemVal).val();
		sezStatusApplicationId=$("#sezStatusApplicationId").val();
		$(".editOccuSafetySystem").val("");
		$.ajax({
			type : "POST",
			url : "${addDevDefineYourOccuUrl}",
			data : {
				"<portlet:namespace/>occuSafetySystem" : occuSafetySystem,
				"<portlet:namespace/>devOccuSafetySystemId" : devOccuSafetySystemId,
				"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
			},
			success : function(data) {
			}
		});
	}
	function devOccuSafetySystemDeleteData(devOccuSafetySystemValData) {
		var devOccuSafetySystemCountCounter = $("#devOccuSafetySystemVal").val();
		$("#devOccuSafetySystemVal").val(devOccuSafetySystemCountCounter - 1);
		var delRowElement = $(".dev-occ-safety-system-row" + devOccuSafetySystemValData); 
		delRowElement.remove();
		var j = parseInt(devOccuSafetySystemValData) + 1;
		// Update the row numbers and IDs for each row
		for (var i = j; i <= devOccuSafetySystemCountCounter; i++) {
		  var prevCounter = i - 1;
		  var rowElement = $(".dev-occ-safety-system-row" + i);
		  // Update the IDs for relevant elementsd
		  rowElement.attr("class", "dev-occ-safety-system-row" + prevCounter);
		  rowElement.find("td.occuSafetySystem"+i).removeClass("occuSafetySystem"+i).addClass("occuSafetySystem"+prevCounter);
		  rowElement.find("#devOccuSafetySystemDeleteDataTab").attr('onclick', 'devOccuSafetySystemDeleteData(' +prevCounter+ ')');
		  rowElement.find("#devOccuSafetySystemEditTab").attr('onclick', 'devOccuSafetySystemEditTab(' +prevCounter+ ')');
		}
	}
	
	/* add disasterMitigationPlanBox*/
	function adddisasterMitigationPlanBox(){
		disasterMitigationPlanVal = $("#disasterMitigationPlanVal").val();
		
		disasterMitigationPlan = $("#disasterMitigationPlan").val();
		if(disasterMitigationPlan != ""){
		$(".disasterMitigationPlanTableBox").removeClass("hide");
		$.ajax({
			type : "POST",
			url : "${addDisasterMitigationPlanInfoUrl}",
			data : {
				"<portlet:namespace/>disasterMitigationPlanVal" : disasterMitigationPlanVal,
			},
			success : function(data) {
				/* APPEND ROW JSP INTO TABLE */
				$(".disasterMitigationPlanTable").each(function(index) {
					if (index === 0) {
						$(this).append(data);
					} else {
						$cloneRow = $(data).clone();
						$cloneRow.find('td').slice(-2).remove();
						$(this).append($cloneRow);
					}
				});
				/* APPEND DATA INTO TABLE */
				
				$(".disasterMitigationPlan" + disasterMitigationPlanVal).append(disasterMitigationPlan);
				
				/* VALUE INCREAMENT */
                addDeveloperDisasterManagement();
				disasterMitigationPlanVal++;
				$("#disasterMitigationPlanVal").val(disasterMitigationPlanVal);
				/* RESET FORM FIELDS */
				$("#disasterMitigationPlan").val("");
			}
		});
	  }else{
		 $("#disasterMitigationPlan").focus();
	  }
   }
	function devDisasterMitigationPlanValEditTab(disasterMitigationPlanVal){
		$(".editDevDisasterMitigationPlanPopup").modal("show");
		$(".editDisasterMitigationPlan").attr("id" , "editDisasterMitigationPlan"+disasterMitigationPlanVal);
		disasterMitigationPlan = $(".disasterMitigationPlan"+disasterMitigationPlanVal+":first").text().trim();
		$("#editDisasterMitigationPlan"+disasterMitigationPlanVal).val(disasterMitigationPlan);
		$(".saveEditDevDisasterMitigationPlanDataBtn").attr("onclick" , "devDisasterMitigationPlanEditData("+disasterMitigationPlanVal+")");
	}
	function devDisasterMitigationPlanEditData(disasterMitigationPlanVal){
		$(".disasterMitigationPlan" + disasterMitigationPlanVal).html($("#editDisasterMitigationPlan"+disasterMitigationPlanVal).val());
		
		disasterMitigationPlan = $(".editDisasterMitigationPlan").val();
		/*hidden field*/
		disasterMitigationPlanId=$("#disasterMitigationPlanId"+ disasterMitigationPlanVal).val();
		sezStatusApplicationId=$("#sezStatusApplicationId").val();
		$(".editDisasterMitigationPlan").val("");
		$.ajax({
			type : "POST",
			url : "${addDeveloperDisasterManagementUrl}",
			data : {
				"<portlet:namespace/>disasterMitigationPlan" : disasterMitigationPlan,
				"<portlet:namespace/>disasterMitigationPlanId" : disasterMitigationPlanId,
				"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
			},
			success : function(data) {
			}
		});
	}
	function devDisasterMitigationPlanValDeleteData(disasterMitigationPlanValData) {
		var devDisasterMitigationPlanValCountCounter = $("#disasterMitigationPlanVal").val();
		$("#disasterMitigationPlanVal").val(devDisasterMitigationPlanValCountCounter - 1);
		var delRowElement = $(".dev-disaster-mitigation-plan-row" + disasterMitigationPlanValData); 
		delRowElement.remove();
		var j = parseInt(disasterMitigationPlanValData) + 1;
		// Update the row numbers and IDs for each row
		for (var i = j; i <= devDisasterMitigationPlanValCountCounter; i++) {
		  var prevCounter = i - 1;
		  var rowElement = $(".dev-disaster-mitigation-plan-row" + i);
		  // Update the IDs for relevant elementsd
		  rowElement.attr("class", "dev-disaster-mitigation-plan-row" + prevCounter);
		  rowElement.find("td.disasterMitigationPlan"+i).removeClass("disasterMitigationPlan"+i).addClass("disasterMitigationPlan"+prevCounter);
		  rowElement.find("#devDisasterMitigationPlanValDeleteDataTab").attr('onclick', 'devDisasterMitigationPlanValDeleteData(' +prevCounter+ ')');
		  rowElement.find("#devDisasterMitigationPlanValEditTab").attr('onclick', 'devDisasterMitigationPlanValEditTab(' +prevCounter+ ')');
		}
	}
</script>