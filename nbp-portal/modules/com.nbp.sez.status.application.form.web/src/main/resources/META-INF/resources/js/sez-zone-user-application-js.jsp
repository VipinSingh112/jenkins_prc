<%@ include file="/init.jsp" %>
<portlet:resourceURL var="addZoneGeneralBusinessInfoUrl" id="/zone/general/business"/>
<portlet:resourceURL var="addZoneProposedProjInfoUrl" id="/zone/proposed/project"/>
<portlet:resourceURL var="addZoneProposedFreeLocationInfoUrl" id="/zone/proposed/freeLoc"/>
<portlet:resourceURL var="addZoneInvestmentInfoUrl" id="/zone/investment"/>
<portlet:resourceURL var="addZoneEmploymentInfoUrl" id="/zone/employment"/>
<portlet:resourceURL var="addZoneUserUndertakingInfoUrl" id="/zone/userUndertaking"/>
<portlet:resourceURL var="addZoneDeveloperUndertakingInfoUrl" id="/zone/developerUndertaking"/>
<portlet:resourceURL var="addZoneSubmissionChecklistInfoUrl" id="/zone/submissionChecklist"/>
<portlet:resourceURL var="addZoneUserFreeZoneLocInfoUrl" id="addZoneUserFreeZoneLocInfoUrl"/>
<portlet:resourceURL var="addZoneUserLabourReqInfoUrl" id="addZoneUserLabourReqInfoUrl"/>

<script>
function zoneGeneralBusinessInfo(isSaveAndCont){
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
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	submitForm= true;
	if(!zoneUserSponsorComName){
		$("#zoneUserSponsorComNameValidation").removeClass("hide");
		$("#zoneUserSponsorComName").focus();
		submitForm= false;
	}else{
		$("#zoneUserSponsorComNameValidation").addClass("hide");
	}
	if(!zoneUserAuthRepName){
		$("#zoneUserAuthRepNameValidation").removeClass("hide");
		$("#zoneUserAuthRepName").focus();
		submitForm= false;
	}else{
		$("#zoneUserAuthRepNameValidation").addClass("hide");
	}
	if(!zoneUserCompanyName){
		$("#zoneUserCompanyNameValidation").removeClass("hide");
		$("#zoneUserCompanyName").focus();
		submitForm= false;
	}else{
		$("#zoneUserCompanyNameValidation").addClass("hide");
	}
	if(!sezZoneUserDevName){
		$("#sezZoneUserDevNameValidation").removeClass("hide");
		$("#sezZoneUserDevName").focus();
		submitForm= false;
	}else{
		$("#sezZoneUserDevNameValidation").addClass("hide");
	}
	if(submitForm){
		$.ajax({
			type : "POST",
			url : "${addZoneGeneralBusinessInfoUrl}",
			data : {
				"<portlet:namespace/>zoneUserAppDate" : zoneUserAppDate,
				"<portlet:namespace/>sezZoneUserDevName" : sezZoneUserDevName,
				"<portlet:namespace/>sezZoneUserLocName" : sezZoneUserLocName,
				"<portlet:namespace/>sezZoneDevControlNum" : sezZoneDevControlNum,
				"<portlet:namespace/>zoneUserCompanyName" : zoneUserCompanyName,
				"<portlet:namespace/>zoneUserCompanyStreetAddress" : zoneUserCompanyStreetAddress,
				"<portlet:namespace/>zoneUserCompanyTown" : zoneUserCompanyTown,
				"<portlet:namespace/>zoneUserCompanyParish" : zoneUserCompanyParish,
				"<portlet:namespace/>zoneUserAuthRepName" : zoneUserAuthRepName,
				"<portlet:namespace/>zoneUserAuthRepStreetAddress" : zoneUserAuthRepStreetAddress,
				"<portlet:namespace/>zoneUserAuthRepTown" : zoneUserAuthRepTown,
				"<portlet:namespace/>zoneUserAuthRepZipCode" : zoneUserAuthRepZipCode,
				"<portlet:namespace/>zoneUserAuthRepCountry" : zoneUserAuthRepCountry,
				"<portlet:namespace/>zoneUserSponsorComName" : zoneUserSponsorComName,
				"<portlet:namespace/>zoneUserSponsorStreetAddress" : zoneUserSponsorStreetAddress,
				"<portlet:namespace/>zoneUserSponsorTown" : zoneUserSponsorTown,		
				"<portlet:namespace/>zoneUserSponsorZipCode" : zoneUserSponsorZipCode,
				"<portlet:namespace/>zoneUserSponsorCountry" : zoneUserSponsorCountry,
				"<portlet:namespace/>zoneUserExistingCom" : zoneUserExistingCom,
				"<portlet:namespace/>zoneUserFormArticle" : zoneUserFormArticle,
				"<portlet:namespace/>zoneUserFormArticleOther" : zoneUserFormArticleOther,
				"<portlet:namespace/>zoneUserNonResiCom" : zoneUserNonResiCom,
				"<portlet:namespace/>zoneUserTRN" : zoneUserTRN,
				"<portlet:namespace/>zoneUserGCT" : zoneUserGCT,
				"<portlet:namespace/>zoneUserTCC" : zoneUserTCC,
				"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
			},
			success : function(data) {
				if(!isSaveAndCont){
				nextButtonCall();}
				$("#SezStatusFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
			}
		});
	}
}
function zoneProposedProjInfo(isSaveAndCont){
	zoneUserEntityDeniedAppr = $("input[name='zoneUserEntityDeniedAppr']:checked").val();
	zoneUserDeniedApprDate = $("#zoneUserDeniedApprDate").val();
	zoneUserDeniedApprProjectType = $("#zoneUserDeniedApprProjectType").val();
	zoneUserFreeZoneLocation = $("input[name='zoneUserFreeZoneLocation']:checked").val();
	zoneUserLeasedBuildingNum = $("#zoneUserLeasedBuildingNum").val();
	zoneUserLeasedTown = $("#zoneUserLeasedTown").val();
	zoneUserLeasedParish = $("#zoneUserLeasedParish").val();
	zoneUserLeaseYears = $("#zoneUserLeaseYears").val();
	zoneUserVolume = $("#zoneUserVolume").val();
	zoneUserFolio = $("#zoneUserFolio").val();
	zoneUserFloorNum = $("#zoneUserFloorNum").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	$.ajax({
		type : "POST",
		url : "${addZoneProposedProjInfoUrl}",
		data : {
			"<portlet:namespace/>zoneUserEntityDeniedAppr" : zoneUserEntityDeniedAppr,
			"<portlet:namespace/>zoneUserDeniedApprDate" : zoneUserDeniedApprDate,
			"<portlet:namespace/>zoneUserDeniedApprProjectType" : zoneUserDeniedApprProjectType,
			"<portlet:namespace/>zoneUserFreeZoneLocation" : zoneUserFreeZoneLocation,
			"<portlet:namespace/>zoneUserLeasedBuildingNum" : zoneUserLeasedBuildingNum,
			"<portlet:namespace/>zoneUserLeasedTown" : zoneUserLeasedTown,
			"<portlet:namespace/>zoneUserLeasedParish" : zoneUserLeasedParish,
			"<portlet:namespace/>zoneUserLeaseYears" : zoneUserLeaseYears,
			"<portlet:namespace/>zoneUserVolume" : zoneUserVolume,
			"<portlet:namespace/>zoneUserFolio" : zoneUserFolio,
			"<portlet:namespace/>zoneUserFloorNum" : zoneUserFloorNum,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
			if(!isSaveAndCont){
				nextButtonCall();}
			addZoneUserFreeZoneLocBox();
			}
	});
}

function zoneInvestmentInfo(isSaveAndCont){
	zoneUserInfraBuilding = $("#zoneUserInfraBuilding").val();
	zoneUserInfraEquipment = $("#zoneUserInfraEquipment").val();
	zoneUserInfraMachines = $("#zoneUserInfraMachines").val();
	zoneUserInfraTotal = $("#zoneUserInfraTotal").val();
	 var selectedZoneUserFinanceSource = new Array();
	  $("input:checkbox[name=zoneUserFinanceSource]:checked").each(function () {
		  selectedZoneUserFinanceSource.push($(this).val());

	 });	
   var financeSource= selectedZoneUserFinanceSource.toString();
  zoneUserOtherFinanceSource= $("#zoneUserOtherFinanceSource").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	$.ajax({
		type : "POST",
		url : "${addZoneInvestmentInfoUrl}",
		data : {
			"<portlet:namespace/>zoneUserInfraBuilding" : zoneUserInfraBuilding,
			"<portlet:namespace/>zoneUserInfraEquipment" : zoneUserInfraEquipment,
			"<portlet:namespace/>zoneUserInfraMachines" : zoneUserInfraMachines,
			"<portlet:namespace/>zoneUserInfraTotal" : zoneUserInfraTotal,
			"<portlet:namespace/>financeSource" : financeSource,
			"<portlet:namespace/>zoneUserOtherFinanceSource" : zoneUserOtherFinanceSource,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
			if(!isSaveAndCont){
				nextButtonCall();}
		}
	});
}
function zoneEmploymentInfo(){
	zoneUserLabourYear = $("#zoneUserLabourYear").val();
	zoneUserLabourDirect = $("#zoneUserLabourDirect").val();
	zoneUserLabourMale = $("#zoneUserLabourMale").val();
	zoneUserLabourFemale = $("#zoneUserLabourFemale").val();
	zoneUserLabourLocal = $("#zoneUserLabourLocal").val();
	zoneUserLabourForeign = $("#zoneUserLabourForeign").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	zoneUserLabourReqVal = $("#zoneUserLabourReqVal").val();
	$.ajax({
		type : "POST",
		url : "${addZoneEmploymentInfoUrl}",
		data : {
			"<portlet:namespace/>zoneUserLabourYear" : zoneUserLabourYear,
			"<portlet:namespace/>zoneUserLabourDirect" : zoneUserLabourDirect,
			"<portlet:namespace/>zoneUserLabourMale" : zoneUserLabourMale,
			"<portlet:namespace/>zoneUserLabourFemale" : zoneUserLabourFemale,
			"<portlet:namespace/>zoneUserLabourLocal" : zoneUserLabourLocal,
			"<portlet:namespace/>zoneUserLabourForeign" : zoneUserLabourForeign,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
			"<portlet:namespace/>counter" : zoneUserLabourReqVal,
		},
		success : function(data) {
			var result=data.APP_DATA;
			console.log(result["counter"]);
			$("#sezZoneEmpInfoId"+result["counter"]).val(result["sezZoneEmpIoyeenfoId"]);
			addZoneUserLabourReqBox();
		}
	});
}
function zoneZoneUserUndertakingInfo(isSaveAndCont){
	zoneUserDeclarantTitle = $("#zoneUserDeclarantTitle").val();
	zoneUserDeclarantName = $("#zoneUserDeclarantName").val();
	zoneUserDeclarantTeleNum = $("#zoneUserDeclarantTeleNum").val();
	zoneUserDeclarantEmail = $("#zoneUserDeclarantEmail").val();
	zoneUserApplicantSignatureDate = $("#zone-user-applicant-signature-date").val();
	zoneUserPublicNotaryName = $("#zoneUserPublicNotaryName").val();
	zoneUserPublicNotarySignatureDate = $("#zone-user-public-notary-signature-date").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	submitForm= true;
	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	if(!zoneUserPublicNotaryName){
		$("#zoneUserPublicNotaryName").focus();
		$("#zoneUserPublicNotaryNameValidation").removeClass("hide");
		submitForm= false;
	}else{
		$("#zoneUserPublicNotaryNameValidation").addClass("hide");
	}
	if(!zoneUserDeclarantEmail){
		  $("#zoneUserDeclarantEmailValidation").removeClass("hide");
		  $("#zoneUserDeclarantEmailValidation").text("Please Enter E-mail address");
		  $("#zoneUserDeclarantEmail").focus();
		  submitForm= false;
	  }else if(zoneUserDeclarantEmail.match(mailformat)){ 
			$("#zoneUserDeclarantEmailValidation").addClass("hide");
		}else
			{
				$("#zoneUserDeclarantEmailValidation").removeClass("hide");
				$("#zoneUserDeclarantEmailValidation").text("You have entered an invalid Email address");
				$("#zoneUserDeclarantEmail").focus();
				submitForm= false;
			}
	if(!zoneUserDeclarantName){
		$("#zoneUserDeclarantName").focus();
		$("#zoneUserDeclarantNameValidation").removeClass("hide");
		submitForm= false;
	}else{
		$("#zoneUserDeclarantNameValidation").addClass("hide");
	}
	if(submitForm){
		$.ajax({
			type : "POST",
			url : "${addZoneUserUndertakingInfoUrl}",
			data : {
				"<portlet:namespace/>zoneUserDeclarantTitle" : zoneUserDeclarantTitle,
				"<portlet:namespace/>zoneUserDeclarantName" : zoneUserDeclarantName,
				"<portlet:namespace/>zoneUserDeclarantTeleNum" : zoneUserDeclarantTeleNum,
				"<portlet:namespace/>zoneUserDeclarantEmail" : zoneUserDeclarantEmail,
				"<portlet:namespace/>zoneUserApplicantSignatureDate" : zoneUserApplicantSignatureDate,
				"<portlet:namespace/>zoneUserPublicNotaryName" : zoneUserPublicNotaryName,
				"<portlet:namespace/>zoneUserPublicNotarySignatureDate" : zoneUserPublicNotarySignatureDate,
				"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
			},
			success : function(data) {
				uploadDocuments('zone-user-applicant-signature-upload-btn','Signature of Zone User Undertaking Declarant','<%=signatureUploadInSEZFormUrl%>');
				uploadDocuments('zone-user-public-notary-signature-upload-btn','Signature Of Zone User Undertaking Notary','<%=signatureUploadInSEZFormUrl%>');
				if(!isSaveAndCont){
					nextButtonCall();}
			}
		});
	}
}
function zoneDeveloperUndertakingInfo(isSaveAndCont){
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
	zoneDevPublicNotaryName = $("#zoneDevPublicNotaryName").val();
	zoneDevPublicNotarySignatureDate = $("#zone-dev-public-notary-signature-date").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	submitForm= true;
	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	if(!zoneDevPublicNotaryName){
		$("#zoneDevPublicNotaryName").focus();
		$("#zoneDevPublicNotaryNameValidation").removeClass("hide");
		submitForm= false;
	}else{
		$("#zoneDevPublicNotaryNameValidation").addClass("hide");
	}
	if(!zoneDevApplicantEmail){
		  $("#zoneDevApplicantEmailValidation").removeClass("hide");
		  $("#zoneDevApplicantEmailValidation").text("Please enter E-mail address");
		  $("#zoneDevApplicantEmail").focus();
		  submitForm= false;
	  }else if(zoneDevApplicantEmail.match(mailformat)){ 
			$("#zoneDevApplicantEmailValidation").addClass("hide");
		}else
			{
				$("#zoneDevApplicantEmailValidation").removeClass("hide");
				$("#zoneDevApplicantEmailValidation").text("You have entered an invalid email address");
				$("#zoneDevApplicantEmail").focus();
				submitForm= false;
			}
	if(!zoneDevApplicantName){
		$("#zoneDevApplicantName").focus();
		$("#zoneDevApplicantNameValidation").removeClass("hide");
		submitForm= false;
	}else{
		$("#zoneDevApplicantNameValidation").addClass("hide");
	}
	if(!zoneDevUndertakingDevName){
		$("#zoneDevUndertakingDevName").focus();
		$("#zoneDevUndertakingDevNameValidation").removeClass("hide");
		submitForm= false;
	}else{
		$("#zoneDevUndertakingDevNameValidation").addClass("hide");
	}
	if(submitForm){
		$.ajax({
			type : "POST",
			url : "${addZoneDeveloperUndertakingInfoUrl}",
			data : {
				"<portlet:namespace/>zoneDevUndertakingDevName" : zoneDevUndertakingDevName,
				"<portlet:namespace/>zoneDevUndertakingApprLetter" : zoneDevUndertakingApprLetter,
				"<portlet:namespace/>zoneDevUndertakingDate" : zoneDevUndertakingDate,
				"<portlet:namespace/>zoneDevUndertakingAgreeNum" : zoneDevUndertakingAgreeNum,
				"<portlet:namespace/>zoneDevUndertakingAgreeDate" : zoneDevUndertakingAgreeDate,
				"<portlet:namespace/>zoneDevUndertakingControlNum" : zoneDevUndertakingControlNum,
				"<portlet:namespace/>zoneDevApplicantTitle" : zoneDevApplicantTitle,
				"<portlet:namespace/>zoneDevApplicantName" : zoneDevApplicantName,
				"<portlet:namespace/>zoneDevApplicantTele" : zoneDevApplicantTele,
				"<portlet:namespace/>zoneDevApplicantEmail" : zoneDevApplicantEmail,
				"<portlet:namespace/>zoneDevApplicantSignatureDate" : zoneDevApplicantSignatureDate,
				"<portlet:namespace/>zoneDevPublicNotaryName" : zoneDevPublicNotaryName,
				"<portlet:namespace/>zoneDevPublicNotarySignatureDate" : zoneDevPublicNotarySignatureDate,
				"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
			},
			success : function(data) {
				uploadDocuments('zone-user-dev-applicant-signature-upload-btn','Signature of Zone User Developer Declarant','<%=signatureUploadInSEZFormUrl%>');
				uploadDocuments('zone-user-dev-public-notary-signature-upload-btn','Signature Of Zone User Developer Notary','<%=signatureUploadInSEZFormUrl%>');
				$("#SezStatusFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				if(!isSaveAndCont){
					nextButtonCall();}
			}
		});
	}
}
function zoneSubmissionChecklistInfo(){
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
	var zoneUserGeneralReq=selectedZoneUserGeneralReq.toString();
	var zoneUserComInfoReq=selectedZoneUserComInfoReq.toString();
	var zoneSwornStateReq=selectedZoneSwornStateReq.toString();
	var zoneOccupancyReq=selectedZoneOccupancyReq.toString();
	var zoneUserApprovals=selectedZoneUserApprovals.toString();
	zoneUserNameReq = $("#zoneUserNameReq").val();
	zoneUserDateReq = $("#zoneUserDateReq").val();
	typeOfSezStatus=$("#sez-submit-application-type-option-value").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	$.ajax({
		type : "POST",
		url : "${addZoneSubmissionChecklistInfoUrl}",
		data : {																	
			"<portlet:namespace/>zoneUserGeneralReq" : zoneUserGeneralReq,
			"<portlet:namespace/>zoneUserComInfoReq" : zoneUserComInfoReq,
			"<portlet:namespace/>zoneSwornStateReq" : zoneSwornStateReq,
			"<portlet:namespace/>zoneOccupancyReq" : zoneOccupancyReq,
			"<portlet:namespace/>zoneUserApprovals" : zoneUserApprovals,
			"<portlet:namespace/>zoneUserNameReq" : zoneUserNameReq,
			"<portlet:namespace/>zoneUserDateReq" : zoneUserDateReq,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
			if(typeOfSezStatus=="SEZ Zone User"){
			uploadDocuments('zone-user-sign-req-upload-btn','Signature of Zone User Submission','<%=signatureUploadInSEZFormUrl%>');
		}
		}
	});
}
$('input[type = radio][name = zoneUserExistingCom]').change(function(){
	if( $(this).val() == "Yes"){
		$("#zoneUserExistingComBox, #zoneUserExistingComBoxPre").removeClass("hide");
	}else{
		$("#zoneUserExistingComBox, #zoneUserExistingComBoxPre").addClass("hide");
	}
});
$('#zoneUserFormArticle').change(function(){
	if( $(this).val() == "Other"){
		$("#zoneUserFormArticleOtherBox, #zoneUserFormArticleOtherBoxPre").removeClass("hide");
	}else{
		$("#zoneUserFormArticleOtherBox, #zoneUserFormArticleOtherBoxPre").addClass("hide");
	}
});
$('input[type = radio][name = zoneUserEntityDeniedAppr]').change(function(){
	if( $(this).val() == "Yes"){
		$(".zoneUserDeniedFreeZoneApprData, .zoneUserDeniedFreeZoneApprDataPre").removeClass("hide");
	}else{
		$(".zoneUserDeniedFreeZoneApprData, .zoneUserDeniedFreeZoneApprDataPre").addClass("hide");
	}
});
$('input[type = radio][name = zoneUserFreeZoneLocation]').change(function(){
	if( $(this).val() == "Yes"){
		$("#zoneUserFreeZoneLocBox, #zoneUserFreeZoneLocBoxPre").removeClass("hide");
	}else{
		$("#zoneUserFreeZoneLocBox, #zoneUserFreeZoneLocBoxPre").addClass("hide");
	}
});
$("#zoneUserComInfoReq2").change(function(){
	var selectedItem = new Array();
	$("input:checkbox[name=zoneUserComInfoReq]:checked").each(function(){
		selectedItem.push($(this).val());
	});
	if(selectedItem.includes('Certified copy of Business registration if the applicant is not incorporated')){
		$("#zoneUserComInfoReq3").prop('checked', false);
	}
});
$("#zoneUserComInfoReq3").change(function(){
	var selectedItem = new Array();
	$("input:checkbox[name=zoneUserComInfoReq]:checked").each(function(){
		selectedItem.push($(this).val());
	});
	if(selectedItem.includes('Certified copy of Certificate of Incorporation')){
		$("#zoneUserComInfoReq2").prop('checked', false);
	}
});
$("#zoneUserFinanceSource4").change(function(){
	var selectedItem = new Array();
	$("input:checkbox[name=zoneUserFinanceSource]:checked").each(function(){
		selectedItem.push($(this).val());
	});
	if(selectedItem.includes('Other')){
		$("#zoneUserOtherFinanceSourceBox, #zoneUserOtherFinanceSourceBoxPre").removeClass("hide");
	}else{
		$("#zoneUserOtherFinanceSourceBox, #zoneUserOtherFinanceSourceBoxPre").addClass("hide");
	}
});
$(document).on('change', '#zone-user-applicant-signature-upload-btn', function() {
    //Get count of selected files
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $("#zone-user-applicant-sign-image-holder");
    var form1a_image_holder = $("#zone-user-applicant-sign-image-holder-pre");
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
$(document).on('change', '#zone-user-public-notary-signature-upload-btn', function() {
    //Get count of selected files
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $("#zone-user-public-notary-sign-image-holder");
    var form1a_image_holder = $("#zone-user-public-notary-sign-image-holder-pre");
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
$(document).on('change', '#zone-user-dev-applicant-signature-upload-btn', function() {
    //Get count of selected files
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $("#zone-user-dev-applicant-sign-image-holder");
    var form1a_image_holder = $("#zone-user-dev-applicant-sign-image-holder-pre");
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
$(document).on('change', '#zone-user-dev-public-notary-signature-upload-btn', function() {
    //Get count of selected files
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $("#zone-user-dev-public-notary-sign-image-holder");
    var form1a_image_holder = $("#zone-user-dev-public-notary-sign-image-holder-pre");
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
$(document).on('change', '#zone-user-sign-req-upload-btn', function() {
    //Get count of selected files
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $("#zone-user-sign-req-image-holder");
    var form1a_image_holder = $("#zone-user-sign-req-image-holder-pre");
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
function zoneProposedFreeLocInfo(){
	/* addOnForm */
	zoneUserFreeZoneLocCounter=$("#zoneUserFreeZoneLocVal").val();
	zoneUserSezDevLoc = $("#zoneUserSezDevLoc").val();
	zoneUserSezDevLocDesc = $("#zoneUserSezDevLocDesc").val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	$.ajax({
		type : "POST",
		url : "${addZoneProposedFreeLocationInfoUrl}",
		data : {
			"<portlet:namespace/>zoneUserSezDevLoc" : zoneUserSezDevLoc,
			"<portlet:namespace/>zoneUserSezDevLocDesc" : zoneUserSezDevLocDesc,
			"<portlet:namespace/>counter" : zoneUserFreeZoneLocCounter,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
			var result=data.APP_DATA;
			$("#zoneProposedFreeLocAppId"+result["counter"]).val(result["zoneProposedFreeLocAppId"]);
		}
	});
}
/* add ZoneUserFreeZoneLoc*/
function addZoneUserFreeZoneLocBox(){
	zoneUserFreeZoneLocVal = $("#zoneUserFreeZoneLocVal").val();
	
	zoneUserSezDevLoc = $("#zoneUserSezDevLoc").val();
	zoneUserSezDevLocDesc = $("#zoneUserSezDevLocDesc").val();
	 if(zoneUserSezDevLoc != "" || zoneUserSezDevLocDesc !=""){
	$(".zoneUserFreeZoneLocTableBox").removeClass("hide");
	$.ajax({
		type : "POST",
		url : "${addZoneUserFreeZoneLocInfoUrl}",
		data : {
			"<portlet:namespace/>zoneUserFreeZoneLocVal" : zoneUserFreeZoneLocVal,
		},
		success : function(data) {
			/* APPEND ROW JSP INTO TABLE */
			$(".zoneUserFreeZoneLocTable").each(function(index) {
				if (index === 0) {
					$(this).append(data);
				} else {
					$cloneRow = $(data).clone();
					$cloneRow.find('td').slice(-2).remove();
					$(this).append($cloneRow);
				}
			});
			/* APPEND DATA INTO TABLE */
			$(".zoneUserSezDevLoc" + zoneUserFreeZoneLocVal).append(zoneUserSezDevLoc);
			$(".zoneUserSezDevLocDesc" + zoneUserFreeZoneLocVal).append(zoneUserSezDevLocDesc);
			zoneProposedFreeLocInfo();
			
			/* VALUE INCREAMENT */
			zoneUserFreeZoneLocVal++;
			$("#zoneUserFreeZoneLocVal").val(zoneUserFreeZoneLocVal);
			
			/* RESET FORM FIELDS */
			$("#zoneUserSezDevLoc").val("");
			$("#zoneUserSezDevLocDesc").val("");
		}
	});
   }else{
		  $("#zoneUserSezDevLoc").focus();
	  }	
}
function zoneUserSezDevLocEditTab(zoneUserFreeZoneLocVal){
	$(".editZoneUserFreeZoneLocPopup").modal("show");
	$(".editZoneUserSezDevLoc").attr("id" , "editZoneUserSezDevLoc"+zoneUserFreeZoneLocVal);
	$(".editZoneUserSezDevLocDesc").attr("id" , "editZoneUserSezDevLocDesc"+zoneUserFreeZoneLocVal);
	zoneUserSezDevLoc = $(".zoneUserSezDevLoc"+zoneUserFreeZoneLocVal+":first").text().trim();
	zoneUserSezDevLocDesc = $(".zoneUserSezDevLocDesc"+zoneUserFreeZoneLocVal+":first").text().trim();
	$("#editZoneUserSezDevLoc"+zoneUserFreeZoneLocVal).val(zoneUserSezDevLoc);
	$("#editZoneUserSezDevLocDesc"+zoneUserFreeZoneLocVal).val(zoneUserSezDevLocDesc);
	$(".saveEditZoneUserFreeZoneLocPopupDataBtn").attr("onclick" , "zoneUserFreeZoneLocEditData("+zoneUserFreeZoneLocVal+")");
}
function zoneUserFreeZoneLocEditData(zoneUserFreeZoneLocVal){
	$(".zoneUserSezDevLoc" + zoneUserFreeZoneLocVal).html($("#editZoneUserSezDevLoc"+zoneUserFreeZoneLocVal).val());
	$(".zoneUserSezDevLocDesc" + zoneUserFreeZoneLocVal).html($("#editZoneUserSezDevLocDesc"+zoneUserFreeZoneLocVal).val());
	
	zoneUserSezDevLoc = $(".editZoneUserSezDevLoc").val();
	zoneUserSezDevLocDesc = $(".editZoneUserSezDevLocDesc").val();
	
	
	zoneProposedFreeLocAppId=$("#zoneProposedFreeLocAppId"+ zoneUserFreeZoneLocVal).val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	$(".editZoneUserSezDevLoc").val("");
	$(".editZoneUserSezDevLocDesc").val("");
	$.ajax({
		type : "POST",
		url : "${addZoneProposedFreeLocationInfoUrl}",
		data : {
			"<portlet:namespace/>zoneUserSezDevLoc" : zoneUserSezDevLoc,
			"<portlet:namespace/>zoneUserSezDevLocDesc" : zoneUserSezDevLocDesc,
			"<portlet:namespace/>zoneProposedFreeLocAppId" : zoneProposedFreeLocAppId,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
		}
	});
}
function zoneUserSezDevLocDeleteData(zoneUserFreeZoneLocValData) {
	var zoneUserSezDevLocCountCounter = $("#zoneUserFreeZoneLocVal").val();
	$("#zoneUserFreeZoneLocVal").val(zoneUserSezDevLocCountCounter - 1);
	var delRowElement = $(".zone-user-free-row" + zoneUserFreeZoneLocValData); 
	delRowElement.remove();
	var j = parseInt(zoneUserFreeZoneLocValData) + 1;
	// Update the row numbers and IDs for each row
	for (var i = j; i <= zoneUserSezDevLocCountCounter; i++) {
	  var prevCounter = i - 1;
	  var rowElement = $(".zone-user-free-row" + i);
	  // Update the IDs for relevant elementsd
	  rowElement.attr("class", "zone-user-free-row" + prevCounter);
	  rowElement.find("td.zoneUserSezDevLoc"+i).removeClass("zoneUserSezDevLoc"+i).addClass("zoneUserSezDevLoc"+prevCounter);
	  rowElement.find("td.zoneUserSezDevLocDesc"+i).removeClass("zoneUserSezDevLocDesc"+i).addClass("zoneUserSezDevLocDesc"+prevCounter);
	  rowElement.find("#zoneUserSezDevLocDeleteDataTab").attr('onclick', 'zoneUserSezDevLocDeleteData(' +prevCounter+ ')');
	  rowElement.find("#zoneUserSezDevLocEditTab").attr('onclick', 'zoneUserSezDevLocEditTab(' +prevCounter+ ')');
	}
}
/* add ZoneUserLabourReq*/
function addZoneUserLabourReqBox(){
	debugger;
	zoneUserLabourReqCounter = $("#zoneUserLabourReqCounter").val();
	console.log(" value of counter- "+zoneUserLabourReqCounter);
	zoneUserLabourYear = $("#zoneUserLabourYear").val();
	zoneUserLabourDirect = $("#zoneUserLabourDirect").val();
	zoneUserLabourMale = $("#zoneUserLabourMale").val();
	zoneUserLabourFemale = $("#zoneUserLabourFemale").val();
	zoneUserLabourLocal = $("#zoneUserLabourLocal").val();
	zoneUserLabourForeign = $("#zoneUserLabourForeign").val();
	if(zoneUserLabourYear != "" || zoneUserLabourDirect !="" || zoneUserLabourMale !="" || 
			zoneUserLabourFemale !="" || zoneUserLabourLocal !="" || zoneUserLabourForeign !=""){
	$(".zoneUserLabourReqTableBox").removeClass("hide");
	$.ajax({
		type : "POST",
		url : "${addZoneUserLabourReqInfoUrl}",
		data : {
			"<portlet:namespace/>zoneUserLabourReqVal" : zoneUserLabourReqCounter,
		},
		success : function(data) {
			/* APPEND ROW JSP INTO TABLE */
			$(".zoneUserLabourReqTable").each(function(index) {
				if (index === 0) {
					$(this).append(data);
				} else {
					$cloneRow = $(data).clone();
					$cloneRow.find('td').slice(-2).remove();
					$(this).append($cloneRow);
				}
			});
			/* APPEND DATA INTO TABLE */
			$(".zoneUserLabourYear" + zoneUserLabourReqCounter).append(zoneUserLabourYear);
			$(".zoneUserLabourDirect" + zoneUserLabourReqCounter).append(zoneUserLabourDirect);
			$(".zoneUserLabourMale" + zoneUserLabourReqCounter).append(zoneUserLabourMale);
			$(".zoneUserLabourFemale" + zoneUserLabourReqCounter).append(zoneUserLabourFemale);
			$(".zoneUserLabourLocal" + zoneUserLabourReqCounter).append(zoneUserLabourLocal);
			$(".zoneUserLabourForeign" + zoneUserLabourReqCounter).append(zoneUserLabourForeign);
			zoneEmploymentInfo();
			console.log(" value is- "+zoneUserLabourReqCounter);
			/* VALUE INCREAMENT */
			zoneUserLabourReqCounter++;
			console.log("increamented value - "+zoneUserLabourReqCounter);
			$("#zoneUserLabourReqCounter").val(zoneUserLabourReqCounter);
			
			/* RESET FORM FIELDS */
			$("#zoneUserLabourYear").val("");
			$("#zoneUserLabourDirect").val("");
			$("#zoneUserLabourMale").val("");
			$("#zoneUserLabourFemale").val("");
			$("#zoneUserLabourLocal").val("");
			$("#zoneUserLabourForeign").val("");
		}
	});
   }else{
		$("#zoneUserLabourYear").focus();
	}
}
function zoneUserLabourReqEditTab(zoneUserLabourReqVal){

	$(".editZoneUserLabourReqPopup").modal("show");
	$(".editZoneUserLabourYear").attr("id" , "editZoneUserLabourYear"+zoneUserLabourReqVal);
	$(".editZoneUserLabourDirect").attr("id" , "editZoneUserLabourDirect"+zoneUserLabourReqVal);
	$(".editZoneUserLabourMale").attr("id" , "editZoneUserLabourMale"+zoneUserLabourReqVal);
	$(".editZoneUserLabourFemale").attr("id" , "editZoneUserLabourFemale"+zoneUserLabourReqVal);
	$(".editZoneUserLabourLocal").attr("id" , "editZoneUserLabourLocal"+zoneUserLabourReqVal);
	$(".editZoneUserLabourForeign").attr("id" , "editZoneUserLabourForeign"+zoneUserLabourReqVal);
	
	zoneUserLabourYear = $(".zoneUserLabourYear"+zoneUserLabourReqVal+":first").text().trim();
	zoneUserLabourDirect = $(".zoneUserLabourDirect"+zoneUserLabourReqVal+":first").text().trim();
	zoneUserLabourMale = $(".zoneUserLabourMale"+zoneUserLabourReqVal+":first").text().trim();
	zoneUserLabourFemale = $(".zoneUserLabourFemale"+zoneUserLabourReqVal+":first").text().trim();
	zoneUserLabourLocal = $(".zoneUserLabourLocal"+zoneUserLabourReqVal+":first").text().trim();
	zoneUserLabourForeign = $(".zoneUserLabourForeign"+zoneUserLabourReqVal+":first").text().trim();
	
	$("#editZoneUserLabourYear"+zoneUserLabourReqVal).val(zoneUserLabourYear);
	$("#editZoneUserLabourDirect"+zoneUserLabourReqVal).val(zoneUserLabourDirect);
	$("#editZoneUserLabourMale"+zoneUserLabourReqVal).val(zoneUserLabourMale);
	$("#editZoneUserLabourFemale"+zoneUserLabourReqVal).val(zoneUserLabourFemale);
	$("#editZoneUserLabourLocal"+zoneUserLabourReqVal).val(zoneUserLabourLocal);
	$("#editZoneUserLabourForeign"+zoneUserLabourReqVal).val(zoneUserLabourForeign);
	
	$(".saveEditZoneUserLabourReqPopupDataBtn").attr("onclick" , "zoneUserLabourReqEditData("+zoneUserLabourReqVal+")");
}
function zoneUserLabourReqEditData(zoneUserLabourReqVal){
	$(".zoneUserLabourYear" + zoneUserLabourReqVal).html($("#editZoneUserLabourYear"+zoneUserLabourReqVal).val());
	$(".zoneUserLabourDirect" + zoneUserLabourReqVal).html($("#editZoneUserLabourDirect"+zoneUserLabourReqVal).val());
	$(".zoneUserLabourMale" + zoneUserLabourReqVal).html($("#editZoneUserLabourMale"+zoneUserLabourReqVal).val());
	$(".zoneUserLabourFemale" + zoneUserLabourReqVal).html($("#editZoneUserLabourFemale"+zoneUserLabourReqVal).val());
	$(".zoneUserLabourLocal" + zoneUserLabourReqVal).html($("#editZoneUserLabourLocal"+zoneUserLabourReqVal).val());
	$(".zoneUserLabourForeign" + zoneUserLabourReqVal).html($("#editZoneUserLabourForeign"+zoneUserLabourReqVal).val());
	
	editZoneUserLabourYear = $(".editZoneUserLabourYear").val();
	editZoneUserLabourDirect = $(".editZoneUserLabourDirect").val();
	editZoneUserLabourMale = $(".editZoneUserLabourMale").val();
	editZoneUserLabourFemale = $(".editZoneUserLabourFemale").val();
	editZoneUserLabourLocal = $(".editZoneUserLabourLocal").val();
	editZoneUserLabourForeign = $(".editZoneUserLabourForeign").val();
	sezZoneEmpInfoId = $("#sezZoneEmpInfoId"+zoneUserLabourReqVal).val();
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	
	$(".editZoneUserLabourYear").val("");
	$(".editZoneUserLabourDirect").val("");
	$(".editZoneUserLabourMale").val("");
	$(".editZoneUserLabourFemale").val("");
	$(".editZoneUserLabourLocal").val("");
	$(".editZoneUserLabourForeign").val("");
	$.ajax({
		type : "POST",
		url : "${addZoneEmploymentInfoUrl}",
		data : {
			"<portlet:namespace/>zoneUserLabourYear" : editZoneUserLabourYear,
			"<portlet:namespace/>zoneUserLabourDirect" : editZoneUserLabourDirect,
			"<portlet:namespace/>zoneUserLabourMale" : editZoneUserLabourMale,
			"<portlet:namespace/>zoneUserLabourFemale" : editZoneUserLabourFemale,
			"<portlet:namespace/>zoneUserLabourLocal" : editZoneUserLabourLocal,
			"<portlet:namespace/>zoneUserLabourForeign" : editZoneUserLabourForeign,
			"<portlet:namespace/>sezZoneEmpInfoId" : sezZoneEmpInfoId,
			"<portlet:namespace/>sezStatusApplicationId" : sezStatusApplicationId,
		},
		success : function(data) {
		}
	});
}
function zoneUserLabourReqDeleteData(zoneUserLabourReqValData) {
	var zoneUserLabourReqCountCounter = $("#zoneUserLabourReqVal").val();
	$("#zoneUserLabourReqVal").val(zoneUserLabourReqCountCounter - 1);
	var delRowElement = $(".zone-user-labour-row" + zoneUserLabourReqValData); 
	delRowElement.remove();
	var j = parseInt(zoneUserLabourReqValData) + 1;
	// Update the row numbers and IDs for each row
	for (var i = j; i <= zoneUserLabourReqCountCounter; i++) {
	  var prevCounter = i - 1;
	  var rowElement = $(".zone-user-labour-row" + i);
	  // Update the IDs for relevant elementsd
	  rowElement.attr("class", "zone-user-labour-row" + prevCounter);
	  rowElement.find("td.zoneUserLabourYear"+i).removeClass("zoneUserLabourYear"+i).addClass("zoneUserLabourYear"+prevCounter);
	  rowElement.find("td.zoneUserLabourDirect"+i).removeClass("zoneUserLabourDirect"+i).addClass("zoneUserLabourDirect"+prevCounter);
	  rowElement.find("td.zoneUserLabourMale"+i).removeClass("zoneUserLabourMale"+i).addClass("zoneUserLabourMale"+prevCounter);
	  rowElement.find("td.zoneUserLabourFemale"+i).removeClass("zoneUserLabourFemale"+i).addClass("zoneUserLabourFemale"+prevCounter);
	  rowElement.find("td.zoneUserLabourLocal"+i).removeClass("zoneUserLabourLocal"+i).addClass("zoneUserLabourLocal"+prevCounter);
	  rowElement.find("td.zoneUserLabourForeign"+i).removeClass("zoneUserLabourForeign"+i).addClass("zoneUserLabourForeign"+prevCounter);
	  rowElement.find("#zoneUserLabourReqDeleteDataTab").attr('onclick', 'zoneUserLabourReqDeleteData(' +prevCounter+ ')');
	  rowElement.find("#zoneUserLabourReqEditTab").attr('onclick', 'zoneUserLabourReqEditTab(' +prevCounter+ ')');
	}
}
</script>