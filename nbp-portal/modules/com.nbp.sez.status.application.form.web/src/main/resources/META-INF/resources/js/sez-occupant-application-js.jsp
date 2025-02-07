<%@ include file="/init.jsp" %>
<portlet:resourceURL var="addOccDirectorDetailInfoUrl" id="addOccDirectorDetailInfoUrl"/>
<portlet:resourceURL var="addOccDirectorShareholderInfoUrl" id="addOccDirectorShareholderInfoUrl"/>
<portlet:resourceURL var="addOccPrincipalOfficersInfoUrl" id="addOccPrincipalOfficersInfoUrl"/>
<portlet:resourceURL var = "addOccFreeZoneLocInfoUrl" id="addOccFreeZoneLocInfoUrl"/>
<portlet:resourceURL var = "addOccLabourReqInfoUrl" id="addOccLabourReqInfoUrl"/>
<portlet:resourceURL var = "addOccFreeZoneLocBoxDataUrl" id="/occ/proposed/freeLoc"/>
<script>
	function occupantGeneralBusinessInfo(isSaveAndCont){
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
		sezStatusApplicationId = $("#sezStatusApplicationId").val();
		submitForm = true;
		if(!occAuthRepName){
			$("#occAuthRepName").focus();
			$("#occAuthRepNameValidation").removeClass("hide");
			submitForm = false;
		}else{
			$("#occAuthRepNameValidation").addClass("hide");
		}
		if(!occSezDevName){
			$("#occSezDevName").focus();
			$("#occSezDevNameValidation").removeClass("hide");
			submitForm = false;
		}else{
			$("#occSezDevNameValidation").addClass("hide");
		}
		if(submitForm){
		 $.ajax({
				type: "POST",
				url: "${sezOccupantGeneralBussinessInfo}",
				data: {
					"<portlet:namespace/>occAppDate": occAppDate,
					"<portlet:namespace/>occSezDevName": occSezDevName,
					"<portlet:namespace/>occSezDevControlNum": occSezDevControlNum,
					"<portlet:namespace/>occCompanyName": occCompanyName,
					"<portlet:namespace/>occCompanyStreetAddress": occCompanyStreetAddress,
					"<portlet:namespace/>occCompanyTown": occCompanyTown,
					"<portlet:namespace/>occCompanyParish": occCompanyParish,
					"<portlet:namespace/>occAuthRepName": occAuthRepName,
					"<portlet:namespace/>occAuthRepStreetAddress": occAuthRepStreetAddress,
					"<portlet:namespace/>occAuthRepTown": occAuthRepTown,
					"<portlet:namespace/>occAuthRepZipCode": occAuthRepZipCode,
					"<portlet:namespace/>occAuthRepCountry": occAuthRepCountry,
					"<portlet:namespace/>occSponsorComName": occSponsorComName,
					"<portlet:namespace/>occSponsorStreetAddress": occSponsorStreetAddress,
					"<portlet:namespace/>occSponsorTown": occSponsorTown,
					"<portlet:namespace/>occSponsorZipCode": occSponsorZipCode,
					"<portlet:namespace/>occSponsorCountry": occSponsorCountry,
					"<portlet:namespace/>occExistingCom": occExistingCom,
					"<portlet:namespace/>occFormArticle": occFormArticle,
					"<portlet:namespace/>occFormArticleOther": occFormArticleOther,
					"<portlet:namespace/>occTRN": occTRN,
					"<portlet:namespace/>occGCT": occGCT,
					"<portlet:namespace/>occTCC": occTCC,
					"<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
							  },
				success: function (data) { 
					if(!isSaveAndCont){
						nextButtonCall();}
					/* var $active = $('.nav-tabs li>.active');
					$active.parent().next().find('.nav-link').removeClass('disabled');
					$active.parent().next().find('.nav-link span').removeClass('gray');
					nextTab($active); */
			},
				error: function (data) {
				},
			  });
		}
	}
	function occupantShareholdingInfo(isSaveAndCont){
		occAuthorised = $("#occAuthorised").val();
		occSubscribed = $("#occSubscribed").val();
		occPaidCapital = $("#occPaidCapital").val();
		sezStatusApplicationId = $("#sezStatusApplicationId").val();
		counterVal=$("#occDirectorShareholdersVal").val();
		  $.ajax({
				type: "POST",
				url: "${occupantShareHoldingInfo}", 
				data: {
					"<portlet:namespace/>occAuthorised": occAuthorised,
					"<portlet:namespace/>occSubscribed": occSubscribed,
					"<portlet:namespace/>occPaidCapital": occPaidCapital,
					"<portlet:namespace/>counterVal": counterVal,
					"<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
				},
				success: function (data) {
					if(!isSaveAndCont){
					nextButtonCall();}
					/* var $active = $('.nav-tabs li>.active');
					$active.parent().next().find('.nav-link').removeClass('disabled');
					$active.parent().next().find('.nav-link span').removeClass('gray');
					nextTab($active); */
					addOccDirectorDetailBox();
					addOccDirectorShareholdersBox();
					addOccPrincipalOfficersBox();
				},
				error: function (data) {
				}
			});
		}
	function occupantDirectorInfo(counter){
		if(counter!=""){
		directorFormApplicationId = $("#sez-app-director-id"+counter).val();
		occDirectorName = $("#editDirectorName"+counter).val();
		occDirectorStreetAddress = $("#editDirectorStreetAddress"+counter).val();
		occDirectorZipCode = $("#editDirectorZipCode"+counter).val();
		occDirectorCountry = $("#editDirectorCountry"+counter).val();
		}else{
		counterOccDirector = $("#occDirectorDetailVal").val();
		occDirectorName = $("#directorName").val();
		occDirectorStreetAddress = $("#directorStreetAddress").val();
		occDirectorZipCode = $("#directorZipCode").val();
		occDirectorCountry = $("#directorCountry").val();
		directorFormApplicationId = $("#sez-app-director-id").val();
		}
		sezStatusApplicationId = $("#sezStatusApplicationId").val();
		counterOccDirector = $("#occDirectorDetailVal").val();
		  $.ajax({
				type: "POST",
				url: "${occupantDirectorAddForm}", 
				data: {
					"<portlet:namespace/>occDirectorName": occDirectorName,
					"<portlet:namespace/>occDirectorStreetAddress": occDirectorStreetAddress,
					"<portlet:namespace/>occDirectorZipCode": occDirectorZipCode,
					"<portlet:namespace/>occDirectorCountry": occDirectorCountry,
					"<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
					"<portlet:namespace/>directorFormApplicationId": directorFormApplicationId,
					"<portlet:namespace/>counterOccDirector": counterOccDirector,
				},
				success: function (data) {
					var result=data.APP_DATA;
					var counter=result["counter"];
					$("#sez-app-director-id"+counter).val(result["directorId"]);
				},
				error: function (data) {
				}
			});
		}
	function principleShareholdingInfo(shareHolderCounter){
		/* addOnForm */
		if(shareHolderCounter!=""){
		shareholderApplicationId = $("#sez-app-shareholder-id"+shareHolderCounter).val();
		occShareholderName = $("#editOccShareholderName"+shareHolderCounter).val();
		occShareholderNationality = $("#editOccShareholderNationality"+shareHolderCounter).val();
		occShareholderShares = $("#editOccShareholderShares"+shareHolderCounter).val();
		}else{
		occShareholderName = $("#occShareholderName").val();
		occShareholderNationality = $("#occShareholderNationality").val();
		occShareholderShares = $("#occShareholderShares").val();
		shareholderApplicationId = $("#sez-app-shareholder-id").val();
		}
		sezStatusApplicationId = $("#sezStatusApplicationId").val();
		occDirectorShareholderCounter = $("#occDirectorShareholdersVal").val();
		
		  $.ajax({
				type: "POST",
				url: "${occupantPrincipleShareHoldingInfo}", 
				data: {
					"<portlet:namespace/>occShareholderName": occShareholderName,
					"<portlet:namespace/>occShareholderNationality": occShareholderNationality,
					"<portlet:namespace/>occShareholderShares": occShareholderShares,
					"<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
					"<portlet:namespace/>shareholderApplicationId": shareholderApplicationId,
					"<portlet:namespace/>occDirectorShareholderCounter": occDirectorShareholderCounter,
				},
				success: function (data) {
					var result=data.APP_DATA;
					var counter=result["shareHolderCounter"];
					$("#sez-app-shareholder-id"+counter).val(result["shareHolderId"]);
				},
				error: function (data) {
				}
			});
		}
	function occupantPrincipleOfficer(counterPrincipleOfficer){
		/* addOnForm */
		if(counterPrincipleOfficer!=""){
		occPrincipleOfficerId = $("#sez-app-principle-officer-id"+counterPrincipleOfficer).val();
		occPrincipalName = $("#editOccPrincipalName"+counterPrincipleOfficer).val();
		occPrincipalPosition = $("#editOccPrincipalPosition"+counterPrincipleOfficer).val();
		}else{
		occPrincipalName = $("#occPrincipalName").val();
		occPrincipalPosition = $("#occPrincipalPosition").val();
		occPrincipleOfficerId = $("#sez-app-principle-officer-id").val();
		}
		sezStatusApplicationId = $("#sezStatusApplicationId").val();
		principleOfficerCounter = $("#occPrincipalOfficersVal").val();
		  $.ajax({
				type: "POST",
				url: "${occupantPrincipleOfficerInfo}", 
				data: {
					"<portlet:namespace/>occPrincipalName": occPrincipalName,
					"<portlet:namespace/>occPrincipalPosition": occPrincipalPosition,
					"<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
					"<portlet:namespace/>occPrincipleOfficerId": occPrincipleOfficerId,
					"<portlet:namespace/>principleOfficerCounter": principleOfficerCounter,
				},
				success: function (data) {
				var resultJsonObject=data.APP_DATA;
				var counterOfPrincipalOfficer=resultJsonObject["principleCounter"];
				$("#sez-app-principle-officer-id"+counterOfPrincipalOfficer).val(resultJsonObject["principleOfficerId"]);
				},
				error: function (data) {
				}
			});
		}
	function occupantProposedProjInfo(isSaveAndCont){
		occBusinessDesc = $("#occBusinessDesc").val();
		occDeniedFreeZoneAppr = $("input[name='occDeniedFreeZoneAppr']:checked").val();
		occDeniedFreeZoneApprDate = $("#occDeniedFreeZoneApprDate").val();
		occDeniedFreeZoneApprType = $("#occDeniedFreeZoneApprType").val();
		occFreeZoneLocation = $("input[name='occFreeZoneLocation']:checked").val();
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
		sezStatusApplicationId = $("#sezStatusApplicationId").val();
		   $.ajax({
				type: "POST",
				url: "${occupantProposedProjectInfo}", 
				data: {
					"<portlet:namespace/>occBusinessDesc": occBusinessDesc,
					"<portlet:namespace/>occDeniedFreeZoneAppr": occDeniedFreeZoneAppr,
					"<portlet:namespace/>occDeniedFreeZoneApprDate": occDeniedFreeZoneApprDate,
					"<portlet:namespace/>occDeniedFreeZoneApprType": occDeniedFreeZoneApprType,
					"<portlet:namespace/>occFreeZoneLocation": occFreeZoneLocation,
					"<portlet:namespace/>occSubConcessionBuilding": occSubConcessionBuilding,
					"<portlet:namespace/>occSubConcessionTown": occSubConcessionTown,
					"<portlet:namespace/>occSubConcessionParish": occSubConcessionParish,
					"<portlet:namespace/>occCompleteSurveyTechDesc": occCompleteSurveyTechDesc,
					"<portlet:namespace/>occNorthBoundaries": occNorthBoundaries,
					"<portlet:namespace/>occEastBoundaries": occEastBoundaries,
					"<portlet:namespace/>occWestBoundaries": occWestBoundaries,
					"<portlet:namespace/>occSouthBoundaries": occSouthBoundaries,
					"<portlet:namespace/>occOwnership": occOwnership,
					"<portlet:namespace/>occLeaseYears": occLeaseYears,
					"<portlet:namespace/>occVolume": occVolume,
					"<portlet:namespace/>occFolio": occFolio,
					"<portlet:namespace/>occFloorNum": occFloorNum,
					"<portlet:namespace/>occUndertakenService": occUndertakenService,
					"<portlet:namespace/>occUndertakenManufacturing": occUndertakenManufacturing,
					"<portlet:namespace/>occSeaPortDistanceKM": occSeaPortDistanceKM,
					"<portlet:namespace/>occSeaPortDistanceMI": occSeaPortDistanceMI,
					"<portlet:namespace/>occAirportDistanceKM": occAirportDistanceKM,
					"<portlet:namespace/>occAirportDistanceMI": occAirportDistanceMI,
					"<portlet:namespace/>occRoadDistanceKM": occRoadDistanceKM,
					"<portlet:namespace/>occRoadDistanceMI": occRoadDistanceMI,
					"<portlet:namespace/>occRailDistanceKM": occRailDistanceKM,
					"<portlet:namespace/>occRailDistanceMI": occRailDistanceMI,
					"<portlet:namespace/>occCustomDistanceKM": occCustomDistanceKM,
					"<portlet:namespace/>occCustomDistanceMI": occCustomDistanceMI,
					"<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
				},
				success: function (data) {
					if(!isSaveAndCont){
						nextButtonCall();}
					addOccFreeZoneLocBox();
				},
				error: function (data) {
					// Handle error
				}
			});
		}
	

     function occupantProposedDevelopmentInfo(isSaveAndCont){
		occProcessingArea = $("#occProcessingArea").val();
		occNonProcessingArea = $("#occNonProcessingArea").val();
		occOfficeRequirement = $("#occOfficeRequirement").val();
		occFactoryRequirement = $("#occFactoryRequirement").val();
		otherBuildUpRequirement = $("input:checkbox[name=otherBuildUpRequirement]:checked").val();
		occOtherAreaReqName = $("#occOtherAreaReqName").val();
		occOtherAreaRequirement = $("#occOtherAreaRequirement").val();
		sezStatusApplicationId = $("#sezStatusApplicationId").val();
		 $.ajax({
				type: "POST",
				url: "${proposedDevelopmentInfo}", 
				data: {
					"<portlet:namespace/>occProcessingArea": occProcessingArea,
					"<portlet:namespace/>occNonProcessingArea": occNonProcessingArea,
					"<portlet:namespace/>occOfficeRequirement": occOfficeRequirement,
					"<portlet:namespace/>occFactoryRequirement": occFactoryRequirement,
					"<portlet:namespace/>otherBuildUpRequirement": otherBuildUpRequirement,
					"<portlet:namespace/>occOtherAreaReqName": occOtherAreaReqName,
					"<portlet:namespace/>occOtherAreaRequirement": occOtherAreaRequirement,
					"<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
				},
				success: function (data) {
					/* var $active = $('.nav-tabs li>.active');
					$active.parent().next().find('.nav-link').removeClass('disabled');
					$active.parent().next().find('.nav-link span').removeClass('gray');
					nextTab($active); */
					if(!isSaveAndCont){
						nextButtonCall();}
				},
				error: function (data) {
				}
			});
		}
	function occupantInvestmentInfo(isSaveAndCont){
		occInfraBuilding = $("#occInfraBuilding").val();
		occInfraEquipment = $("#occInfraEquipment").val();
		occInfraMachines = $("#occInfraMachines").val();
		occInfraTotal = $("#occInfraTotal").val();
		occInfraFinanceSource = $("#occInfraFinanceSource").val();
		sezStatusApplicationId = $("#sezStatusApplicationId").val();
		$.ajax({
			type: "POST",
			url: "${occupantInvestmentInfo}", 
			data: {
				"<portlet:namespace/>occInfraBuilding": occInfraBuilding,
				"<portlet:namespace/>occInfraEquipment": occInfraEquipment,
				"<portlet:namespace/>occInfraMachines": occInfraMachines,
				"<portlet:namespace/>occInfraTotal": occInfraTotal,
				"<portlet:namespace/>occInfraFinanceSource": occInfraFinanceSource,
				"<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
			},
			success: function (data) {
				/* var $active = $('.nav-tabs li>.active');
				$active.parent().next().find('.nav-link').removeClass('disabled');
				$active.parent().next().find('.nav-link span').removeClass('gray');
				nextTab($active); */
				if(!isSaveAndCont){
					nextButtonCall();}
			},
			error: function (data) {
			}
		});
	}
	function occupantEmploymentInfo(employeeCounter){
		/* addOnForm */
		if(employeeCounter!=""){
		occLabourId=$("#sez-app-labour-id"+employeeCounter).val();	
		occLabourYear = $("#editOccLabourYear"+employeeCounter).val();
		occLabourDirect = $("#editOccLabourDirect"+employeeCounter).val();
		occLabourMale = $("#editOccLabourMale"+employeeCounter).val();
		occLabourFemale = $("#editOccLabourFemale"+employeeCounter).val();
		occLabourLocal = $("#editOccLabourLocal"+employeeCounter).val();
		occLabourForeign = $("#editOccLabourForeign"+employeeCounter).val();
		}else{
		occLabourYear = $("#occLabourYear").val();
		occLabourDirect = $("#occLabourDirect").val();
		occLabourMale = $("#occLabourMale").val();
		occLabourFemale = $("#occLabourFemale").val();
		occLabourLocal = $("#occLabourLocal").val();
		occLabourForeign = $("#occLabourForeign").val();
		occLabourId=$("#sez-app-principle-officer-id").val();
		}
		sezStatusApplicationId = $("#sezStatusApplicationId").val();
		occLabourCounter = $("#occLabourReqVal").val();
		  $.ajax({
				type: "POST",
				url: "${occupantEmploymentInfo}",
				data: {
					"<portlet:namespace/>occLabourYear": occLabourYear,
					"<portlet:namespace/>occLabourDirect": occLabourDirect,
					"<portlet:namespace/>occLabourMale": occLabourMale,
					"<portlet:namespace/>occLabourFemale": occLabourFemale,
					"<portlet:namespace/>occLabourLocal": occLabourLocal,
					"<portlet:namespace/>occLabourForeign": occLabourForeign,
					"<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
					"<portlet:namespace/>occLabourId": occLabourId,
					"<portlet:namespace/>occLabourCounter": occLabourCounter,
				},
				success: function (data) {
					var resultJsonObject=data.APP_DATA;
					var counterOfEmp=resultJsonObject["employeeCounter"];
					$("#sez-app-labour-id"+counterOfEmp).val(resultJsonObject["employeeId"]);
					addOccLabourReqBox();
				},
				error: function (data) {
					// Handle error
				}
			});
		}
	function occupantZoneUndertakingInfo(isSaveAndCont){
		occApplicantTitle = $("#occApplicantTitle").val();
		occApplicantName = $("#occApplicantName").val();
		occApplicantTeleNum = $("#occApplicantTeleNum").val();
		occApplicantEmail = $("#occApplicantEmail").val();
		occApplicantSignatureDate = $("#occ-applicant-signature-date").val();
		occPublicNotaryName = $("#occPublicNotaryName").val();
		occPublicNotarySignatureDate = $("#occ-public-notary-signature-date").val();
		sezStatusApplicationId = $("#sezStatusApplicationId").val();
		submitForm = true;
		var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		if(!occPublicNotaryName){
			$("#occPublicNotaryName").focus();
			$("#occPublicNotaryNameValidation").removeClass("hide");
			submitForm = false;
		}else{
			$("#occPublicNotaryNameValidation").addClass("hide");
		}
		if(!occApplicantEmail){
			  $("#occApplicantEmailValidation").removeClass("hide");
			  $("#occApplicantEmailValidation").text("Please enter E-mail address");
			  $("#occApplicantEmail").focus();
			  submitForm= false;
		  }else if(occApplicantEmail.match(mailformat)){ 
				$("#occApplicantEmailValidation").addClass("hide");
			}else
				{
					$("#occApplicantEmailValidation").removeClass("hide");
					$("#occApplicantEmailValidation").text("You have entered an invalid email address");
					$("#occApplicantEmail").focus();
					submitForm= false;
				}
		if(!occApplicantName){
			$("#occApplicantName").focus();
			$("#occApplicantNameValidation").removeClass("hide");
			submitForm = false;
		}else{
			$("#occApplicantNameValidation").addClass("hide");
		}
		if(submitForm){
		 $.ajax({
				type: "POST",
				url: "${occupantZoneUndertakingInfol}", 
				data: {
					"<portlet:namespace/>occApplicantTitle": occApplicantTitle,
					"<portlet:namespace/>occApplicantName": occApplicantName,
					"<portlet:namespace/>occApplicantTeleNum": occApplicantTeleNum,
					"<portlet:namespace/>occApplicantEmail": occApplicantEmail,
					"<portlet:namespace/>occApplicantSignatureDate": occApplicantSignatureDate,
					"<portlet:namespace/>occPublicNotaryName": occPublicNotaryName,
					"<portlet:namespace/>occPublicNotarySignatureDate": occPublicNotarySignatureDate,
					"<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
				},
				async: false,
				success: function (data) {
					uploadDocuments('occ-applicant-signature-upload-btn','Signature of Occupant Zone Undertaking','');
					uploadDocuments('occ-public-notary-signature-upload-btn','Signature of Occupant Zone Undertaking Notary','');
					/* var $active = $('.nav-tabs li>.active');
					$active.parent().next().find('.nav-link').removeClass('disabled');
					$active.parent().next().find('.nav-link span').removeClass('gray');
					nextTab($active); */
					$("#SezStatusFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
					if(!isSaveAndCont){
						nextButtonCall();}
				},
				error: function (data) {
				}
			});
		}
	}
	function occupantDeveloperUndertakingInfo(isSaveAndCont){
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
		sezStatusApplicationId = $("#sezStatusApplicationId").val();
		   $.ajax({
				type: "POST",
				url: "${occupantDeliveryUndertakingInfo}",
				data: {
					"<portlet:namespace/>occUndertakingDevName": occUndertakingDevName,
					"<portlet:namespace/>occUndertakingApprLetter": occUndertakingApprLetter,
					"<portlet:namespace/>occUndertakingDate": occUndertakingDate,
					"<portlet:namespace/>occUndertakingAgreeNum": occUndertakingAgreeNum,
					"<portlet:namespace/>occUndertakingAgreeDate": occUndertakingAgreeDate,
					"<portlet:namespace/>occUndertakingControlNum": occUndertakingControlNum,
					"<portlet:namespace/>occDevApplicantTitle": occDevApplicantTitle,
					"<portlet:namespace/>occDevApplicantName": occDevApplicantName,
					"<portlet:namespace/>occDevApplicantTele": occDevApplicantTele,
					"<portlet:namespace/>occDevApplicantEmail": occDevApplicantEmail,
					"<portlet:namespace/>occDevApplicantSignatureDate": occDevApplicantSignatureDate,
					"<portlet:namespace/>occDevPublicNotaryName": occDevPublicNotaryName,
					"<portlet:namespace/>occDevPublicNotarySignatureDate": occDevPublicNotarySignatureDate,
					"<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
				},
				async: false,
				success: function (data) {
					if(!isSaveAndCont){
						nextButtonCall();}
					uploadDocuments('occ-dev-applicant-signature-upload-btn','Signature of Occupant Developer Undertaking Stamp','');
					uploadDocuments('occ-dev-public-notary-signature-upload-btn','Signature of Occupant Developer Undertaking Notary','');
					/* var $active = $('.nav-tabs li>.active');
					$active.parent().next().find('.nav-link').removeClass('disabled');
					$active.parent().next().find('.nav-link span').removeClass('gray');
					nextTab($active); */
				},
				error: function (data) {
					// Handle error
				}
			});
		}
	function locationAddBoxExistingPropsed(locationCounter){
		if(locationCounter!=""){
		locationAppId=$("#sez-app-location-id"+locationCounter).val();
		developerCodeOrLocation=$("#editOccSezDevLoc"+locationCounter).val();
		descOrtypeOfAct=$("#editOccSezDevLocDesc"+locationCounter).val();
		}else{
		developerCodeOrLocation=$("#occSezDevLoc").val();
		descOrtypeOfAct=$("#occSezDevLocDesc").val();
		locationAppId=$("#sez-app-location-id").val();
		}
		sezStatusApplicationId = $("#sezStatusApplicationId").val();
		occFreeZoneCounter= $("#occFreeZoneLocVal").val();
		 $.ajax({
				type: "POST",
				url: "${locationBoxAddFormInfo}",
				data: {
					"<portlet:namespace/>developerCodeOrLocation": developerCodeOrLocation,
					"<portlet:namespace/>descOrtypeOfAct": descOrtypeOfAct,
					"<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
					"<portlet:namespace/>locationAppId": locationAppId,
					"<portlet:namespace/>occFreeZoneCounter": occFreeZoneCounter,
				},
				success: function (data) {
					var resultJsonObject=data.APP_DATA;
					var counterOfLocation=resultJsonObject["locationCounter"];
					$("#sez-app-location-id"+counterOfLocation).val(resultJsonObject["locationId"]);
				},
				error: function (data) {
				}
			});
		}
	function occupantSubmissionChecklistInfo(){
		var selectedOccGeneral = new Array();
		$("input:checkbox[name=occGeneralReq]:checked").each(function(){
			selectedOccGeneral.push($(this).val());
		});
		
		var selectedOccComInfoReq = new Array();
		$("input:checkbox[name=occComInfoReq]:checked").each(function(){
			selectedOccComInfoReq.push($(this).val());
		});
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
		var occGeneral=selectedOccGeneral.toString();
		var occComInfoRequest=selectedOccComInfoReq.toString();
		var occComInfoRequest=selectedOccComInfoReq.toString();
		var occSwanStateRequest=selectedOccSwornStateReq.toString();
		var occSelectedRequest=selectedOccSupportingDoc.toString();
		var occSelectedFacilityRequest=selectedOccFacilitiesReq.toString();
		var occSelectedApprovals=selectedOccApprovals.toString();
		var occSelectedSecurityRequest=selectedOccSecurityReq.toString();
		var occSelectedSDetailedBussiness=selectedOccDetailedBusiPlan.toString();
		occPaidShareCapProof = $("input[name=occPaidShareCapProof]:checked").val();
		sezStatusApplicationId = $("#sezStatusApplicationId").val();
		  $.ajax({
				type: "POST",
			   url: "${occupantSubmissionInfo}",
				data: {
					"<portlet:namespace/>occNameReq": occNameReq,
					"<portlet:namespace/>occDateReq": occDateReq,
					"<portlet:namespace/>occGeneral": occGeneral,
					"<portlet:namespace/>occComInfoRequest": occComInfoRequest,
					"<portlet:namespace/>occSwanStateRequest": occSwanStateRequest,
					"<portlet:namespace/>occSelectedRequest": occSelectedRequest,
					"<portlet:namespace/>occSelectedFacilityRequest": occSelectedFacilityRequest,
					"<portlet:namespace/>occSelectedApprovals": occSelectedApprovals,
					"<portlet:namespace/>occSelectedSecurityRequest": occSelectedSecurityRequest,
					"<portlet:namespace/>occSelectedSDetailedBussiness": occSelectedSDetailedBussiness,
					"<portlet:namespace/>occPaidShareCapProof": occPaidShareCapProof,
					"<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
				},
				success: function (data) {
					uploadDocuments('occ-sign-req-upload-btn','Signature of Occupant Submission Checklist Stamp','');
					var $active = $('.nav-tabs li>.active');
					$active.parent().next().find('.nav-link').removeClass('disabled');
					$active.parent().next().find('.nav-link span').removeClass('gray');
					nextTab($active);
				},
				error: function (data) {
				}
			});
	}
	$('input[type = radio][name = occExistingCom]').change(function(){
		if( $(this).val() == "Yes"){
			$("#occExistingComBox, #occExistingComBoxPre").removeClass("hide");
		}else{
			$("#occExistingComBox, #occExistingComBoxPre").addClass("hide");
		}
	});
	$('#occFormArticle').change(function(){
		if( $(this).val() == "Other"){
			$("#occFormArticleOtherBox, #occFormArticleOtherBoxPre").removeClass("hide");
		}else{
			$("#occFormArticleOtherBox, #occFormArticleOtherBoxPre").addClass("hide");
		}
	});
	$('input[type = radio][name = occOwnership]').change(function(){
		if( $(this).val() == "Lease"){
			$("#occLeaseYearsBox, #occLeaseYearsBoxPre").removeClass("hide");
		}else{
			$("#occLeaseYearsBox, #occLeaseYearsBoxPre").addClass("hide");
		}
	});
	$('input[type = radio][name = occFreeZoneLocation]').change(function(){
		if( $(this).val() == "Yes"){
			$("#occFreeZoneLocBox, #occFreeZoneLocBoxPre").removeClass("hide");
		}else{
			$("#occFreeZoneLocBox, #occFreeZoneLocBoxPre").addClass("hide");
		}
	});
	$('input[type = radio][name = occDeniedFreeZoneAppr]').change(function(){
		if( $(this).val() == "Yes"){
			$(".occDeniedFreeZoneApprData, .occDeniedFreeZoneApprDataPre").removeClass("hide");
		}else{
			$(".occDeniedFreeZoneApprData, .occDeniedFreeZoneApprDataPre").addClass("hide");
		}
	});
	function showOtherOptions() {
		  if ($("#otherBuildUpRequirement").is(":checked")){
			  $(".otherBuildUpRequirementBox").removeClass("hide");
		  } else {
			  $(".otherBuildUpRequirementBox").addClass("hide");
			 }
		}
	
		$("#otherBuildUpRequirement").click(function () {
			showOtherOptions();
		});
		$(document).on('change', '#occ-applicant-signature-upload-btn', function() {
			//Get count of selected files
			var countFiles = $(this)[0].files.length;
			var imgPath = $(this)[0].value;
			var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
			var image_holder = $("#occ-applicant-sign-image-holder");
			var form1a_image_holder = $("#occ-applicant-sign-image-holder-pre");
			image_holder.empty();
			form1a_image_holder.empty();
			if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
			  if (typeof(FileReader) != "undefined") {
				//loop for each file selected for uploaded.
				for (var i = 0; i < countFiles; i++) 
				{
				  var reader = new FileReader();
				  reader.onload = function(e) {
					$("<img />", {
					  "src": e.target.result,
					  "class": "thumb-image",
					  "height":"100",
					  "width":"100"
					}).appendTo(image_holder);
					$("<img />", {
						"src": e.target.result,
						"class": "thumb-image",
						"height":"100",
						"width":"100"
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
		$(document).on('change', '#occ-public-notary-signature-upload-btn', function() {
			//Get count of selected files
			var countFiles = $(this)[0].files.length;
			var imgPath = $(this)[0].value;
			var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
			var image_holder = $("#occ-public-notary-sign-image-holder");
			var form1a_image_holder = $("#occ-public-notary-sign-image-holder-pre");
			image_holder.empty();
			form1a_image_holder.empty();
			if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
			  if (typeof(FileReader) != "undefined") {
				//loop for each file selected for uploaded.
				for (var i = 0; i < countFiles; i++) 
				{
				  var reader = new FileReader();
				  reader.onload = function(e) {
					$("<img />", {
					  "src": e.target.result,
					  "class": "thumb-image",
					  "height":"100",
					  "width":"100"
					}).appendTo(image_holder);
					$("<img />", {
						"src": e.target.result,
						"class": "thumb-image",
						"height":"100",
						"width":"100"
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
		$(document).on('change', '#occ-dev-applicant-signature-upload-btn', function() {
			//Get count of selected files
			var countFiles = $(this)[0].files.length;
			var imgPath = $(this)[0].value;
			var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
			var image_holder = $("#occ-dev-applicant-sign-image-holder");
			var form1a_image_holder = $("#occ-dev-applicant-sign-image-holder-pre");
			image_holder.empty();
			form1a_image_holder.empty();
			if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
			  if (typeof(FileReader) != "undefined") {
				//loop for each file selected for uploaded.
				for (var i = 0; i < countFiles; i++) 
				{
				  var reader = new FileReader();
				  reader.onload = function(e) {
					$("<img />", {
					  "src": e.target.result,
					  "class": "thumb-image",
					  "height":"100",
					  "width":"100"
					}).appendTo(image_holder);
					$("<img />", {
						"src": e.target.result,
						"class": "thumb-image",
						"height":"100",
						"width":"100"
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
		$(document).on('change', '#occ-dev-public-notary-signature-upload-btn', function() {
			//Get count of selected files
			var countFiles = $(this)[0].files.length;
			var imgPath = $(this)[0].value;
			var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
			var image_holder = $("#occ-dev-public-notary-sign-image-holder");
			var form1a_image_holder = $("#occ-dev-public-notary-sign-image-holder-pre");
			image_holder.empty();
			form1a_image_holder.empty();
			if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
			  if (typeof(FileReader) != "undefined") {
				//loop for each file selected for uploaded.
				for (var i = 0; i < countFiles; i++) 
				{
				  var reader = new FileReader();
				  reader.onload = function(e) {
					$("<img />", {
					  "src": e.target.result,
					  "class": "thumb-image",
					  "height":"100",
					  "width":"100"
					}).appendTo(image_holder);
					$("<img />", {
						"src": e.target.result,
						"class": "thumb-image",
						"height":"100",
						"width":"100"
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
		$("#occApprovals1").change(function(){
			var selectedOccApproval = new Array();
			$("input:checkbox[name=occApprovals]:checked").each(function(){
				selectedOccApproval.push($(this).val());
			});
			if(selectedOccApproval.includes('Proof of Application')){
				$("#occApprovals2").prop('checked', false);
			}
		});
		$("#occApprovals2").change(function(){
			var selectedOccApproval = new Array();
			$("input:checkbox[name=occApprovals]:checked").each(function(){
				selectedOccApproval.push($(this).val());
			});
			if(selectedOccApproval.includes('Fire Approval Letter or Fire Safety Certificate from the Jamaica Brigade Fire Service')){
				$("#occApprovals1").prop('checked', false);
			}
		});
		$("#occSupportingDoc2").change(function(){
			var selectedOccApproval = new Array();
			$("input:checkbox[name=occSupportingDoc]:checked").each(function(){
				selectedOccApproval.push($(this).val());
			});
			if(selectedOccApproval.includes('Copy of lease agreement')){
				$("#occSupportingDoc3").prop('checked', false);
			}
		});
		$("#occSupportingDoc3").change(function(){
			var selectedOccApproval = new Array();
			$("input:checkbox[name=occSupportingDoc]:checked").each(function(){
				selectedOccApproval.push($(this).val());
			});
			if(selectedOccApproval.includes('Letter indicating proposed terms of tenancy within the approved SEZ')){
				$("#occSupportingDoc2").prop('checked', false);
			}
		});
		$(document).on('change', '#occ-sign-req-upload-btn', function() {
			//Get count of selected files
			var countFiles = $(this)[0].files.length;
			var imgPath = $(this)[0].value;
			var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
			var image_holder = $("#occ-sign-req-image-holder");
			var form1a_image_holder = $("#occ-sign-req-image-holder-pre");
			image_holder.empty();
			form1a_image_holder.empty();
			if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
			  if (typeof(FileReader) != "undefined") {
				//loop for each file selected for uploaded.
				for (var i = 0; i < countFiles; i++) 
				{
				  var reader = new FileReader();
				  reader.onload = function(e) {
					$("<img />", {
					  "src": e.target.result,
					  "class": "thumb-image",
					  "height":"100",
					  "width":"100"
					}).appendTo(image_holder);
					$("<img />", {
						"src": e.target.result,
						"class": "thumb-image",
						"height":"100",
						"width":"100"
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

/* add disasterMitigationPlanBox*/
function addOccDirectorDetailBox(){
	occDirectorDetailVal = $("#occDirectorDetailVal").val();
	
	occDirectorName = $("#directorName").val();
	occDirectorStreetAddress = $("#directorStreetAddress").val();
	occDirectorZipCode = $("#directorZipCode").val();
	occDirectorCountry = $("#directorCountry").val();
	 if(occDirectorName != "" || occDirectorStreetAddress !="" || occDirectorZipCode !="" || occDirectorCountry !=""){
	$(".occDirectorDetailTableBox").removeClass("hide");
	$.ajax({
		type : "POST",
		url : "${addOccDirectorDetailInfoUrl}",
		data : {
			"<portlet:namespace/>occDirectorDetailVal" : occDirectorDetailVal,
		},
		async:false,
		success : function(data) {
			/* APPEND ROW JSP INTO TABLE */
			$(".occDirectorDetailTable").each(function(index) {
				if (index === 0) {
					$(this).append(data);
				} else {
					$cloneRow = $(data).clone();
					$cloneRow.find('td').slice(-2).remove();
					$(this).append($cloneRow);
				}
			});
			/* APPEND DATA INTO TABLE */
			$(".occDirectorName" + occDirectorDetailVal).append(occDirectorName);
			$(".occDirectorStreetAddress" + occDirectorDetailVal).append(occDirectorStreetAddress);
			$(".occDirectorZipCode" + occDirectorDetailVal).append(occDirectorZipCode);
			$(".occDirectorCountry" + occDirectorDetailVal).append(occDirectorCountry);
			
			occupantDirectorInfo("");
			/* VALUE INCREAMENT */
			occDirectorDetailVal++;
			$("#occDirectorDetailVal").val(occDirectorDetailVal);
			/* RESET FORM FIELDS */
			$("#directorName").val("");
			$("#directorStreetAddress").val("");
			$("#directorZipCode").val("");
			$("#directorCountry").val("");
		}
	});
  }else{
	  $("#directorName").focus();
  }
}
function occDirectorDetailEditTab(occDirectorDetailVal){
	$(".editOccDirectorDetailPopup").modal("show");
	$(".editDirectorName").attr("id" , "editDirectorName"+occDirectorDetailVal);
	$(".editDirectorStreetAddress").attr("id" , "editDirectorStreetAddress"+occDirectorDetailVal);
	$(".editDirectorZipCode").attr("id" , "editDirectorZipCode"+occDirectorDetailVal);
	$(".editDirectorCountry").attr("id" , "editDirectorCountry"+occDirectorDetailVal);
	
	occDirectorName = $(".occDirectorName"+occDirectorDetailVal+":first").text().trim();
	occDirectorStreetAddress = $(".occDirectorStreetAddress"+occDirectorDetailVal+":first").text().trim();
	occDirectorZipCode = $(".occDirectorZipCode"+occDirectorDetailVal+":first").text().trim();
	occDirectorCountry = $(".occDirectorCountry"+occDirectorDetailVal+":first").text().trim();
	
	$("#editDirectorName"+occDirectorDetailVal).val(occDirectorName);
	$("#editDirectorStreetAddress"+occDirectorDetailVal).val(occDirectorStreetAddress);
	$("#editDirectorZipCode"+occDirectorDetailVal).val(occDirectorZipCode);
	$("#editDirectorCountry"+occDirectorDetailVal).val(occDirectorCountry);
	
	$(".saveEditOccDirectorDetailPopupDataBtn").attr("onclick" , "OccDirectorDetailEditData("+occDirectorDetailVal+")");
}
function OccDirectorDetailEditData(occDirectorDetailVal){
	occupantDirectorInfo(occDirectorDetailVal);
	$(".occDirectorName" + occDirectorDetailVal).html($("#editDirectorName"+occDirectorDetailVal).val());
	$(".occDirectorStreetAddress" + occDirectorDetailVal).html($("#editDirectorStreetAddress"+occDirectorDetailVal).val());
	$(".occDirectorZipCode" + occDirectorDetailVal).html($("#editDirectorZipCode"+occDirectorDetailVal).val());
	$(".occDirectorCountry" + occDirectorDetailVal).html($("#editDirectorCountry"+occDirectorDetailVal).val());
	
	$(".editDirectorName").val("");
	$(".editDirectorStreetAddress").val("");
	$(".editDirectorZipCode").val("");
	$(".editDirectorCountry").val("");
}
function occDirectorDeleteData(occDirectorDetailValData) {
	  var occDirectorCountCounter = $("#occDirectorDetailVal").val();
	  $("#occDirectorDetailVal").val(occDirectorCountCounter - 1);
	  var delRowElement = $(".occ-director-row" + occDirectorDetailValData); 
	  delRowElement.remove();
	  var j = parseInt(occDirectorDetailValData) + 1;
	  // Update the row numbers and IDs for each row
	  for (var i = j; i <= occDirectorCountCounter; i++) {
	    var prevCounter = i - 1;
	    var rowElement = $(".occ-director-row" + i);
	    // Update the IDs for relevant elementsd
	    rowElement.attr("class", "occ-director-row" + prevCounter);
	    rowElement.find("td.occDirectorName"+i).removeClass("occDirectorName"+i).addClass("occDirectorName"+prevCounter);
	    rowElement.find("td.occDirectorStreetAddress"+i).removeClass("occDirectorStreetAddress"+i).addClass("occDirectorStreetAddress"+prevCounter);
	    rowElement.find("td.occDirectorZipCode"+i).removeClass("occDirectorZipCode"+i).addClass("occDirectorZipCode"+prevCounter);
	    rowElement.find("td.occDirectorCountry"+i).removeClass("occDirectorCountry"+i).addClass("occDirectorCountry"+prevCounter);
	    rowElement.find("#occDirectorDeleteDataTab").attr('onclick', 'occDirectorDeleteData(' +prevCounter+ ')');
	    rowElement.find("#occDirectorDetailEditTab").attr('onclick', 'occDirectorDetailEditTab(' +prevCounter+ ')');
	  }
}

/* add DirectorShareholders*/
function addOccDirectorShareholdersBox(){
	occDirectorShareholdersVal = $("#occDirectorShareholdersVal").val();
	
	occShareholderName = $("#occShareholderName").val();
	occShareholderNationality = $("#occShareholderNationality").val();
	occShareholderShares = $("#occShareholderShares").val();
	 if(occShareholderName != "" || occShareholderNationality !="" || occShareholderShares !=""){
	$(".occDirectorShareholderTableBox").removeClass("hide");
	$.ajax({
		type : "POST",
		url : "${addOccDirectorShareholderInfoUrl}",
		data : {
			"<portlet:namespace/>occDirectorShareholdersVal" : occDirectorShareholdersVal,
		},
		success : function(data) {
			/* APPEND ROW JSP INTO TABLE */
			$(".occDirectorShareholderTable").each(function(index) {
				if (index === 0) {
					$(this).append(data);
				} else {
					$cloneRow = $(data).clone();
					$cloneRow.find('td').slice(-2).remove();
					$(this).append($cloneRow);
				}
			});
			/* APPEND DATA INTO TABLE */
			
			$(".occShareholderName" + occDirectorShareholdersVal).append(occShareholderName);
			$(".occShareholderNationality" + occDirectorShareholdersVal).append(occShareholderNationality);
			$(".occShareholderShares" + occDirectorShareholdersVal).append(occShareholderShares);
			principleShareholdingInfo("");
			
			/* VALUE INCREAMENT */
			occDirectorShareholdersVal++;
			$("#occDirectorShareholdersVal").val(occDirectorShareholdersVal);
			
			/* RESET FORM FIELDS */
			$("#occShareholderName").val("");
			$("#occShareholderNationality").val("");
			$("#occShareholderShares").val("");
		}
	});
    }else{
		  $("#occShareholderName").focus();
	  }	
}
function occDirectorShareholderEditTab(occDirectorShareholdersVal){
	$(".editOccDirectorShareholderPopup").modal("show");
	$(".editOccShareholderName").attr("id" , "editOccShareholderName"+occDirectorShareholdersVal);
	$(".editOccShareholderNationality").attr("id" , "editOccShareholderNationality"+occDirectorShareholdersVal);
	$(".editOccShareholderShares").attr("id" , "editOccShareholderShares"+occDirectorShareholdersVal);
	
	occShareholderName = $(".occShareholderName"+occDirectorShareholdersVal).text().trim();
	occShareholderNationality = $(".occShareholderNationality"+occDirectorShareholdersVal+":first").text().trim();
	occShareholderShares = $(".occShareholderShares"+occDirectorShareholdersVal+":first").text().trim();
	
	$("#editOccShareholderName"+occDirectorShareholdersVal+":first").val(occShareholderName);
	$("#editOccShareholderNationality"+occDirectorShareholdersVal+":first").val(occShareholderNationality);
	$("#editOccShareholderShares"+occDirectorShareholdersVal+":first").val(occShareholderShares);
	
	$(".saveEditOccDirectorShareholderPopupDataBtn").attr("onclick" , "OccDirectorShareholderEditData("+occDirectorShareholdersVal+")");
}
function OccDirectorShareholderEditData(occDirectorShareholdersVal){
	principleShareholdingInfo(occDirectorShareholdersVal);
	$(".occShareholderName" + occDirectorShareholdersVal).html($("#editOccShareholderName"+occDirectorShareholdersVal).val());
	$(".occShareholderNationality" + occDirectorShareholdersVal).html($("#editOccShareholderNationality"+occDirectorShareholdersVal).val());
	$(".occShareholderShares" + occDirectorShareholdersVal).html($("#editOccShareholderShares"+occDirectorShareholdersVal).val());
	
	$(".editOccShareholderName").val("");
	$(".editOccShareholderNationality").val("");
	$(".editOccShareholderShares").val("");
}
function occDirectorShareholderDeleteData(occDirectorShareholdersValData) {
	  var occShareholderCountCounter = $("#occDirectorShareholdersVal").val();
	  $("#occDirectorShareholdersVal").val(occShareholderCountCounter - 1);
	  var delRowElement = $(".occ-director-share-holder-row" + occDirectorShareholdersValData); 
	  delRowElement.remove();
	  var j = parseInt(occDirectorShareholdersValData) + 1;
	  // Update the row numbers and IDs for each row
	  for (var i = j; i <= occShareholderCountCounter; i++) {
	    var prevCounter = i - 1;
	    var rowElement = $(".occ-director-share-holder-row" + i);
	    // Update the IDs for relevant elementsd
	    rowElement.attr("class", "occ-director-share-holder-row" + prevCounter);
	    rowElement.find("td.occShareholderName"+i).removeClass("occShareholderName"+i).addClass("occShareholderName"+prevCounter);
	    rowElement.find("td.occShareholderNationality"+i).removeClass("occShareholderNationality"+i).addClass("occShareholderNationality"+prevCounter);
	    rowElement.find("td.occShareholderShares"+i).removeClass("occShareholderShares"+i).addClass("occShareholderShares"+prevCounter);
	    rowElement.find("#occDirectorShareholderDeleteDataTab").attr('onclick', 'occDirectorShareholderDeleteData(' +prevCounter+ ')');
	    rowElement.find("#occDirectorShareholderEditTab").attr('onclick', 'occDirectorShareholderEditTab(' +prevCounter+ ')');
	  }
}

/* add Principal Officers*/
function addOccPrincipalOfficersBox(){ 
	occPrincipalOfficersVal = $("#occPrincipalOfficersVal").val();
	
	occPrincipalName = $("#occPrincipalName").val();
	occPrincipalPosition = $("#occPrincipalPosition").val();
	if(occPrincipalName != "" || occPrincipalPosition !=""){
	$(".occPrincipalOfficersTableBox").removeClass("hide");
	$.ajax({
		type : "POST",
		url : "${addOccPrincipalOfficersInfoUrl}",
		data : {
			"<portlet:namespace/>occPrincipalOfficersVal" : occPrincipalOfficersVal,
		},
		success : function(data) {
			/* APPEND ROW JSP INTO TABLE */
			$(".occPrincipalOfficersTable").each(function(index) {
				if (index === 0) {
					$(this).append(data);
				} else {
					$cloneRow = $(data).clone();
					$cloneRow.find('td').slice(-2).remove();
					$(this).append($cloneRow);
				}
			});
			/* APPEND DATA INTO TABLE */
			$(".occPrincipalName" + occPrincipalOfficersVal).append(occPrincipalName);
			$(".occPrincipalPosition" + occPrincipalOfficersVal).append(occPrincipalPosition);
			occupantPrincipleOfficer("");
			
			/* VALUE INCREAMENT */
			occPrincipalOfficersVal++;
			$("#occPrincipalOfficersVal").val(occPrincipalOfficersVal);
			
			/* RESET FORM FIELDS */
			$("#occPrincipalName").val("");
			$("#occPrincipalPosition").val("");
		}
	});
  }else{
		  $("#occPrincipalName").focus();
  }	
}
function occPrincipalOfficersEditTab(occPrincipalOfficersVal){
	$(".editOccPrincipalOfficersPopup").modal("show");
	$(".editOccPrincipalName").attr("id" , "editOccPrincipalName"+occPrincipalOfficersVal);
	$(".editOccPrincipalPosition").attr("id" , "editOccPrincipalPosition"+occPrincipalOfficersVal);
	
	occPrincipalName = $(".occPrincipalName"+occPrincipalOfficersVal+":first").text().trim();
	occPrincipalPosition = $(".occPrincipalPosition"+occPrincipalOfficersVal+":first").text().trim();
	
	$("#editOccPrincipalName"+occPrincipalOfficersVal).val(occPrincipalName);
	$("#editOccPrincipalPosition"+occPrincipalOfficersVal).val(occPrincipalPosition);
	$(".saveEditOccPrincipalOfficersPopupDataBtn").attr("onclick" , "OccPrincipalOfficersEditData("+occPrincipalOfficersVal+")");
}
function OccPrincipalOfficersEditData(occPrincipalOfficersVal){
	occupantPrincipleOfficer(occPrincipalOfficersVal);
	$(".occPrincipalName" + occPrincipalOfficersVal).html($("#editOccPrincipalName"+occPrincipalOfficersVal).val());
	$(".occPrincipalPosition" + occPrincipalOfficersVal).html($("#editOccPrincipalPosition"+occPrincipalOfficersVal).val());
	
	$(".editOccPrincipalName").val("");
	$(".editOccPrincipalPosition").val("");
}
function occPrincipalOfficersDeleteData(occPrincipalOfficersValData) {
	  var occPrincipalOfficersCountCounter = $("#occPrincipalOfficersVal").val();
	  $("#occPrincipalOfficersVal").val(occPrincipalOfficersCountCounter - 1);
	  var delRowElement = $(".occ-principal-officers-row" + occPrincipalOfficersValData); 
	  delRowElement.remove();
	  var j = parseInt(occPrincipalOfficersValData) + 1;
	  // Update the row numbers and IDs for each row
	  for (var i = j; i <= occPrincipalOfficersCountCounter; i++) {
	    var prevCounter = i - 1;
	    var rowElement = $(".occ-principal-officers-row" + i);
	    // Update the IDs for relevant elementsd
	    rowElement.attr("class", "occ-principal-officers-row" + prevCounter);
	    rowElement.find("td.occPrincipalName"+i).removeClass("occPrincipalName"+i).addClass("occPrincipalName"+prevCounter);
	    rowElement.find("td.occPrincipalPosition"+i).removeClass("occPrincipalPosition"+i).addClass("occPrincipalPosition"+prevCounter);
	    rowElement.find("#occPrincipalOfficersDeleteDataTab").attr('onclick', 'occPrincipalOfficersDeleteData(' +prevCounter+ ')');
	    rowElement.find("#occPrincipalOfficersEditTab").attr('onclick', 'occPrincipalOfficersEditTab(' +prevCounter+ ')');
	  }
}

/* add Occ Free Zone Loc*/
function addOccFreeZoneLocBox(){ 
	occFreeZoneLocVal = $("#occFreeZoneLocVal").val();
	
	occSezDevLoc = $("#occSezDevLoc").val();
	occSezDevLocDesc = $("#occSezDevLocDesc").val();
	if(occSezDevLoc != "" || occSezDevLocDesc !=""){
	$(".occFreeZoneLocTableBox").removeClass("hide");
	$.ajax({
		type : "POST",
		url : "${addOccFreeZoneLocInfoUrl}",
		data : {
			"<portlet:namespace/>occFreeZoneLocVal" : occFreeZoneLocVal,
		},
		success : function(data) {
			/* APPEND ROW JSP INTO TABLE */
			$(".occFreeZoneLocTable").each(function(index) {
				if (index === 0) {
					$(this).append(data);
				} else {
					$cloneRow = $(data).clone();
					$cloneRow.find('td').slice(-2).remove();
					$(this).append($cloneRow);
				}
			});
			/* APPEND DATA INTO TABLE */
			$(".occSezDevLoc" + occFreeZoneLocVal).append(occSezDevLoc);
			$(".occSezDevLocDesc" + occFreeZoneLocVal).append(occSezDevLocDesc);
			/* locationAddBoxExistingPropsed(""); */
			
			addOccFreeZoneLocBoxData("");
			
			/* VALUE INCREAMENT */
			occFreeZoneLocVal++;
			$("#occFreeZoneLocVal").val(occFreeZoneLocVal);
			
			/* RESET FORM FIELDS */
			$("#occSezDevLoc").val("");
			$("#occSezDevLocDesc").val("");
		}
	});
  }else{
		$("#occSezDevLoc").focus();
  }		
}
function occFreeZoneLocEditTab(occFreeZoneLocVal){
	$(".editOccFreeZoneLocPopup").modal("show");
	$(".editOccSezDevLoc").attr("id" , "editOccSezDevLoc"+occFreeZoneLocVal);
	$(".editOccSezDevLocDesc").attr("id" , "editOccSezDevLocDesc"+occFreeZoneLocVal);
	
	occSezDevLoc = $(".occSezDevLoc"+occFreeZoneLocVal+":first").text().trim();
	occSezDevLocDesc = $(".occSezDevLocDesc"+occFreeZoneLocVal+":first").text().trim();
	
	$("#editOccSezDevLoc"+occFreeZoneLocVal).val(occSezDevLoc);
	$("#editOccSezDevLocDesc"+occFreeZoneLocVal).val(occSezDevLocDesc);
	$(".saveEditOccSezDevLocPopupDataBtn").attr("onclick" , "OccSezDevLocEditData("+occFreeZoneLocVal+")");
}
function OccSezDevLocEditData(occFreeZoneLocVal){
	locationAddBoxExistingPropsed(occFreeZoneLocVal);
	$(".occSezDevLoc" + occFreeZoneLocVal).html($("#editOccSezDevLoc"+occFreeZoneLocVal).val());
	$(".occSezDevLocDesc" + occFreeZoneLocVal).html($("#editOccSezDevLocDesc"+occFreeZoneLocVal).val());
	
	$(".editOccSezDevLoc").val("");
	$(".editOccSezDevLocDesc").val("");
}
function occFreeZoneLocDeleteData(occFreeZoneLocValData) {
	  var occFreeZoneLocCountCounter = $("#occFreeZoneLocVal").val();
	  $("#occFreeZoneLocVal").val(occFreeZoneLocCountCounter - 1);
	  var delRowElement = $(".occ-free-zone-loc-row" + occFreeZoneLocValData); 
	  delRowElement.remove();
	  var j = parseInt(occFreeZoneLocValData) + 1;
	  // Update the row numbers and IDs for each row
	  for (var i = j; i <= occFreeZoneLocCountCounter; i++) {
	    var prevCounter = i - 1;
	    var rowElement = $(".occ-free-zone-loc-row" + i);
	    // Update the IDs for relevant elementsd
	    rowElement.attr("class", "occ-free-zone-loc-row" + prevCounter);
	    rowElement.find("td.occSezDevLoc"+i).removeClass("occSezDevLoc"+i).addClass("occSezDevLoc"+prevCounter);
	    rowElement.find("td.occSezDevLocDesc"+i).removeClass("occSezDevLocDesc"+i).addClass("occSezDevLocDesc"+prevCounter);
	    rowElement.find("#occFreeZoneLocDeleteDataTab").attr('onclick', 'occFreeZoneLocDeleteData(' +prevCounter+ ')');
	    rowElement.find("#occFreeZoneLocEditTab").attr('onclick', 'occFreeZoneLocEditTab(' +prevCounter+ ')');
	  }
}

/* add Occ labour requiremen*/
function addOccLabourReqBox(){ 
	occLabourReqVal = $("#occLabourReqVal").val();
	
	occLabourYear = $("#occLabourYear").val();
	occLabourDirect = $("#occLabourDirect").val();
	occLabourMale = $("#occLabourMale").val();
	occLabourFemale = $("#occLabourFemale").val();
	occLabourLocal = $("#occLabourLocal").val();
	occLabourForeign = $("#occLabourForeign").val();
	if(occLabourYear != "" || occLabourDirect !="" || occLabourMale !="" || occLabourFemale !="" || occLabourLocal !="" || occLabourForeign !=""){
	$(".occLabourReqTableBox").removeClass("hide");
	$.ajax({
		type : "POST",
		url : "${addOccLabourReqInfoUrl}",
		data : {
			"<portlet:namespace/>occLabourReqVal" : occLabourReqVal,
		},
		success : function(data) {
			/* APPEND ROW JSP INTO TABLE */
			$(".occLabourReqTable").each(function(index) {
				if (index === 0) {
					$(this).append(data);
				} else {
					$cloneRow = $(data).clone();
					$cloneRow.find('td').slice(-2).remove();
					$(this).append($cloneRow);
				}
			});
			/* APPEND DATA INTO TABLE */
			$(".occLabourYear" + occLabourReqVal).append(occLabourYear);
			$(".occLabourDirect" + occLabourReqVal).append(occLabourDirect);
			$(".occLabourMale" + occLabourReqVal).append(occLabourMale);
			$(".occLabourFemale" + occLabourReqVal).append(occLabourFemale);
			$(".occLabourLocal" + occLabourReqVal).append(occLabourLocal);
			$(".occLabourForeign" + occLabourReqVal).append(occLabourForeign);
			occupantEmploymentInfo("");
			
			/* VALUE INCREAMENT */
			occLabourReqVal++;
			$("#occLabourReqVal").val(occLabourReqVal);
			
			/* RESET FORM FIELDS */
			$("#occLabourYear").val("");
			$("#occLabourDirect").val("");
			$("#occLabourMale").val("");
			$("#occLabourFemale").val("");
			$("#occLabourLocal").val("");
			$("#occLabourForeign").val("");
		}
	});
  }else{
		$("#occLabourYear").focus();
	}		
}
function occLabourReqEditTab(occLabourReqVal){
	$(".editOccLabourReqPopup").modal("show");
	$(".editOccLabourYear").attr("id" , "editOccLabourYear"+occLabourReqVal);
	$(".editOccLabourDirect").attr("id" , "editOccLabourDirect"+occLabourReqVal);
	$(".editOccLabourMale").attr("id" , "editOccLabourMale"+occLabourReqVal);
	$(".editOccLabourFemale").attr("id" , "editOccLabourFemale"+occLabourReqVal);
	$(".editOccLabourLocal").attr("id" , "editOccLabourLocal"+occLabourReqVal);
	$(".editOccLabourForeign").attr("id" , "editOccLabourForeign"+occLabourReqVal);
	
	occLabourYear = $(".occLabourYear"+occLabourReqVal+":first").text().trim();
	occLabourDirect = $(".occLabourDirect"+occLabourReqVal+":first").text().trim();
	occLabourMale = $(".occLabourMale"+occLabourReqVal+":first").text().trim();
	occLabourFemale = $(".occLabourFemale"+occLabourReqVal+":first").text().trim();
	occLabourLocal = $(".occLabourLocal"+occLabourReqVal+":first").text().trim();
	occLabourForeign = $(".occLabourForeign"+occLabourReqVal+":first").text().trim();
	
	$("#editOccLabourYear"+occLabourReqVal).val(occLabourYear);
	$("#editOccLabourDirect"+occLabourReqVal).val(occLabourDirect);
	$("#editOccLabourMale"+occLabourReqVal).val(occLabourMale);
	$("#editOccLabourFemale"+occLabourReqVal).val(occLabourFemale);
	$("#editOccLabourLocal"+occLabourReqVal).val(occLabourLocal);
	$("#editOccLabourForeign"+occLabourReqVal).val(occLabourForeign);
	$(".saveEditOccLabourReqPopupDataBtn").attr("onclick" , "OccLabourReqEditData("+occLabourReqVal+")");
}
function OccLabourReqEditData(occLabourReqVal){
	occupantEmploymentInfo(occLabourReqVal);
	$(".occLabourYear" + occLabourReqVal).html($("#editOccLabourYear"+occLabourReqVal).val());
	$(".occLabourDirect" + occLabourReqVal).html($("#editOccLabourDirect"+occLabourReqVal).val());
	$(".occLabourMale" + occLabourReqVal).html($("#editOccLabourMale"+occLabourReqVal).val());
	$(".occLabourFemale" + occLabourReqVal).html($("#editOccLabourFemale"+occLabourReqVal).val());
	$(".occLabourLocal" + occLabourReqVal).html($("#editOccLabourLocal"+occLabourReqVal).val());
	$(".occLabourForeign" + occLabourReqVal).html($("#editOccLabourForeign"+occLabourReqVal).val());
	
	$(".editOccLabourYear").val("");
	$(".editOccLabourDirect").val("");
	$(".editOccLabourMale").val("");
	$(".occLabourFemale").val("");
	$(".occLabourLocal").val("");
	$(".occLabourForeign").val("");
}
function occLabourReqDeleteData(occLabourReqValData) {
	  var occLabourReqCountCounter = $("#occLabourReqVal").val();
	  $("#occLabourReqVal").val(occLabourReqCountCounter - 1);
	  var delRowElement = $(".occ-labour-req-row" + occLabourReqValData); 
	  delRowElement.remove();
	  var j = parseInt(occLabourReqValData) + 1;
	  // Update the row numbers and IDs for each row
	  for (var i = j; i <= occLabourReqCountCounter; i++) {
	    var prevCounter = i - 1;
	    var rowElement = $(".occ-labour-req-row" + i);
	    // Update the IDs for relevant elementsd
	    rowElement.attr("class", "occ-labour-req-row" + prevCounter);
	    rowElement.find("td.occLabourYear"+i).removeClass("occLabourYear"+i).addClass("occLabourYear"+prevCounter);
	    rowElement.find("td.occLabourDirect"+i).removeClass("occLabourDirect"+i).addClass("occLabourDirect"+prevCounter);
	    rowElement.find("td.occLabourMale"+i).removeClass("occLabourMale"+i).addClass("occLabourMale"+prevCounter);
	    rowElement.find("td.occLabourFemale"+i).removeClass("occLabourFemale"+i).addClass("occLabourFemale"+prevCounter);
	    rowElement.find("td.occLabourLocal"+i).removeClass("occLabourLocal"+i).addClass("occLabourLocal"+prevCounter);
	    rowElement.find("td.occLabourForeign"+i).removeClass("occLabourForeign"+i).addClass("occLabourForeign"+prevCounter);
	    rowElement.find("#occLabourReqDeleteDataTab").attr('onclick', 'occLabourReqDeleteData(' +prevCounter+ ')');
	    rowElement.find("#occLabourReqEditTab").attr('onclick', 'occLabourReqEditTab(' +prevCounter+ ')');
	  }
}
function addOccFreeZoneLocBoxData(counter) {
	debugger;
	if (counter != "") {
	 sezAppLocationId=$("#sezAppLocationId"+ counter).val();
	 occSezDevLoc = $("#occSezDevLoc"+ counter).val();
	 occSezDevLocDesc = $("#occSezDevLocDesc"+ counter).val();
     
	} else {
	 sezAppLocationId=$("#sezAppLocationId").val();
	 occSezDevLoc = $("#occSezDevLoc").val();
	 occSezDevLocDesc = $("#occSezDevLocDesc").val();
    
	    }
	 sezStatusApplicationId=$("#sezStatusApplicationId").val();
	 counterOccFreeZoneLocVal = $("#occFreeZoneLocVal").val();
	$
			.ajax({
				type : "POST",
				url: "${addOccFreeZoneLocBoxDataUrl}",
				data : {
					"<portlet:namespace/>occSezDevLoc" :  occSezDevLoc,
					"<portlet:namespace/>occSezDevLocDesc" :  occSezDevLocDesc,
					"<portlet:namespace/>sezAppLocationId" :   sezAppLocationId,
					"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
					"<portlet:namespace/>counterOccFreeZoneLocVal" : counterOccFreeZoneLocVal,
				
				},
				success : function(data) {
					debugger;
					var result = data.APP_DATA;
					var counter = result["counter"];
					$("#sezAppLocationId"+counter).val(result["sezAppLocationId"]);
				},
				error : function(data) {
				}
			});
}
</script>