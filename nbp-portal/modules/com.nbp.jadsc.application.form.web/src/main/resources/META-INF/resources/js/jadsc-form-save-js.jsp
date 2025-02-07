<%@ include file="/init.jsp" %>
<portlet:resourceURL var="setInformationRequestINfoUrl" id="set/Information/Request/INfo/Url"></portlet:resourceURL>
<portlet:resourceURL var="setOatForRequestInfoUrl" id="set/Oat/For/Request/Info/Url"></portlet:resourceURL>
<portlet:resourceURL var="setCertificateOfServiceInfoUrl" id="set/Certificate/Of/Service/Info/Url"></portlet:resourceURL>
<portlet:resourceURL var="setCertificationOfServiceAddFormInfoUrl" id="set/Certification/Of/Service/Add/Form/Info/Url"></portlet:resourceURL>
<portlet:resourceURL var="setCertificationOfVeracityInfoUrl" id="set/Certification/Of/Veracity/Info/Url"></portlet:resourceURL>
<portlet:resourceURL var="setChecklistInfoUrl" id="set/Check/list/Info/Url"></portlet:resourceURL>
<portlet:resourceURL var="setNoticeOfAppearenceInfoUrl" id="set/Notice/Of/Appearence/Info/Url"></portlet:resourceURL>
<script>
	//Function To Save information Request Form
	function setInformationRequestInfo(isSaveAndContinue){
 		companyName=$("#comName").val();
 		address=$("#address").val();
 		mainTelephone=$("#mainTelephone").val();
 		officeTelephone=$("#officeTelephone").val();
 		cellTelephone=$("#cellTelephone").val();
 		otherContact=$("#otherContact").val();
 		whatsappTelephone=$("#whatsappTelephone").val();
 		emailContact=$("#emailContact").val();
 		contactPerName=$("#contactPerName").val();
 		contactPerPosition=$("#contactPerPosition").val();
 		contactPerPhone=$("#contactPerPhone").val();
 		contactPerEmail=$("#contactPerEmail").val();
 		altContactPerName=$("#altContactPerName").val();
 		altContactPerPosition=$("#altContactPerPosition").val();
 		altContactPerPhone=$("#altContactPerPhone").val();
 		altContactPerEmail=$("#altContactPerEmail").val();
 		comOperationYear=$("#comOperationYear").val();
 		products=$("#products").val();
 		marketSharePer=$("#marketSharePer").val();
 		var tradeRemedyMeasure=[];
		$('input[name="businessInjury"]:checked').each(function() {
			tradeRemedyMeasure.push($(this).val());
        });
		tradeRemedyMeasureVal=tradeRemedyMeasure.toString();
		fiveYearsInvestment=$("#fiveYearsInvestment").val();
		planCapacity=$("#planCapacity").val();
		growthProjection=$("#growthProjection").val();
		jadscApplicationId=$("#jadscApplicationId").val();
		comName=$("#comName").val();
		emailContact=$("#emailContact").val();
		submitForm= true;
		if(!isSaveAndContinue){ 
			var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
			if(!emailContact){
				$("#emailContactValidation").removeClass("hide");
				$("#emailContactValidation").text("Please Enter Email Address");
				$("#emailContact").focus();
				submitForm= false;
			}else if(emailContact.match(mailformat)){ 
				$("#emailContactValidation").addClass("hide");
			}else{
				$("#emailContactValidation").removeClass("hide");
				$("#emailContactValidation").text("You have Entered an In-valid email address");
				$("#emailContact").focus();
				submitForm= false;
			}
			if(!comName){
				$("#comNameValidation").removeClass("hide");
				$("#comName").focus();
				submitForm= false;
			}else{
				$("#comNameValidation").addClass("hide");
			}	
		}
		
		if(submitForm){
		 $.ajax({
	            type: "POST",
	            url: '${setInformationRequestINfoUrl}',
	            data: {

	                "<portlet:namespace/>companyName": companyName,
	                "<portlet:namespace/>address": address,
	                "<portlet:namespace/>mainTelephone": mainTelephone,
	                "<portlet:namespace/>officeTelephone": officeTelephone,
	                "<portlet:namespace/>cellTelephone": cellTelephone,
	                "<portlet:namespace/>otherContact": otherContact,
	                "<portlet:namespace/>whatsappTelephone": whatsappTelephone,
	                "<portlet:namespace/>emailContact": emailContact,
	                "<portlet:namespace/>contactPerName": contactPerName,
	                "<portlet:namespace/>contactPerPosition": contactPerPosition,
	                "<portlet:namespace/>contactPerPhone": contactPerPhone,
	                "<portlet:namespace/>contactPerEmail": contactPerEmail,
	                "<portlet:namespace/>altContactPerName": altContactPerName,
	                "<portlet:namespace/>altContactPerPosition": altContactPerPosition,
	                "<portlet:namespace/>altContactPerPhone": altContactPerPhone,
	                "<portlet:namespace/>altContactPerEmail": altContactPerEmail,
	                "<portlet:namespace/>comOperationYear": comOperationYear,
	                "<portlet:namespace/>products": products,
	                "<portlet:namespace/>marketSharePer": marketSharePer,
	                "<portlet:namespace/>tradeRemedyMeasure": tradeRemedyMeasureVal,
	                "<portlet:namespace/>fiveYearsInvestment": fiveYearsInvestment,
	                "<portlet:namespace/>planCapacity": planCapacity,
	                "<portlet:namespace/>growthProjection": growthProjection,
	                "<portlet:namespace/>jadscApplicationId": jadscApplicationId
				    },
				success: function (data) {
		    	
				if(!isSaveAndContinue){
					applicantInfo();
			    }
			},					
			error: function (data) {},	
			});
			
	    };
		}
	
	//Function Oath For Request Form Save Data
	function setOathForRequestInfo(isSaveAndContinue){
		investigationType=$("#investigationType").val();
		partyName=$("#partyName").val();
		requestReason=$("#requestReason").val();
		comOfficial=$("#comOfficial").val();
		signatureDate=$("#signatureDate").val();
		jadscApplicationId=$("#jadscApplicationId").val();
		 $.ajax({
	            type: "POST",
	            url: '${setOatForRequestInfoUrl}',
	            data: {

	                "<portlet:namespace/>investigationType": investigationType,
	                "<portlet:namespace/>partyName": partyName,
	                "<portlet:namespace/>requestReason": requestReason,
	                "<portlet:namespace/>comOfficial": comOfficial,
	                "<portlet:namespace/>signatureDate": signatureDate,
	                "<portlet:namespace/>jadscApplicationId": jadscApplicationId,
				    },
		async: false,  // Make the request synchronous^M
	            success: function(data) {
	            	uploadDocuments('submitterSignatureBtn','Oath Submitter Sign','');
	            	uploadDocuments('justicePeaceBtn','Oath Justice Sign','');

					if(!isSaveAndContinue){
						applicantInfo();
	    	 		}
	            },
	            error: function(data) {}
	    });
		}
	//FunctionCertificationOfService Form Save Data
	function setCertificationOfServiceInfo(isSaveAndContinue){
		docSubmitDate=$("#docSubmitDate").val();
		signatoryName=$("#signatoryName").val();
		signatoryDate=$("#signatoryDate").val();
		signatoryTelephone=$("#signatoryTelephone").val();
		signatoryFax=$("#signatoryFax").val();
		jadscApplicationId=$("#jadscApplicationId").val();
		signatoryName=$("#signatoryName").val();
		submitForm= true;
		if(!isSaveAndContinue){
			if(!signatoryName){
			$("#signatoryNameValidation").removeClass("hide");
			$("#signatoryName").focus();
			submitForm= false;
		}else{
			$("#signatoryNameValidation").addClass("hide");
		}
		}	
	if(submitForm){
		 $.ajax({
	            type: "POST",
	            url: '${setCertificateOfServiceInfoUrl}',
	            data: {

	                "<portlet:namespace/>docSubmitDate": docSubmitDate,
	                "<portlet:namespace/>signatoryName": signatoryName,
	                "<portlet:namespace/>signatoryDate": signatoryDate,
	                "<portlet:namespace/>signatoryTelephone": signatoryTelephone,
	                "<portlet:namespace/>signatoryFax": signatoryFax,
	                "<portlet:namespace/>jadscApplicationId": jadscApplicationId,
				    },
				success: function (data) {
					uploadDocuments('signedBtn','Certificate of Service Sign','');
	
				if(!isSaveAndContinue){
					applicantInfo();
					addDocServedAddressDetail();
				}
			},					
			error: function (data) {},
	    });
		}
	}
	//Function CertificationOfService Add Form Save Data
	function setCertificationOfVeracityFormInfo(isSaveAndContinue){
		veracityComName=$("#veracityComName").val();
		veracityComPosition=$("#veracityComPosition").val();
		veracityComCompany=$("#veracityComCompany").val();
		veracitySignedDate=$("#veracitySignedDate").val();
		veracitySignedTelephone=$("#veracitySignedTelephone").val();
		veracitySignedFax=$("#veracitySignedFax").val();
		veracitySignedAddress=$("#veracitySignedAddress").val();
		jadscApplicationId=$("#jadscApplicationId").val();
		veracityComName=$("#veracityComName").val();
		submitForm= true;
		if(!isSaveAndContinue){
			if(!veracityComName){
			$("#veracityComNameValidation").removeClass("hide");
			$("#veracityComName").focus();
			submitForm= false;
		}else{
			$("#veracityComNameValidation").addClass("hide");
		    }
		}
			
      if(submitForm){
		 $.ajax({
	            type: "POST",
	            url: '${setCertificationOfVeracityInfoUrl}',
	            data: {

	                "<portlet:namespace/>veracityComName": veracityComName,
	                "<portlet:namespace/>veracityComPosition": veracityComPosition,
	                "<portlet:namespace/>veracityComCompany": veracityComCompany,
	                "<portlet:namespace/>veracitySignedDate": veracitySignedDate,
	                "<portlet:namespace/>veracitySignedTelephone": veracitySignedTelephone,
	                "<portlet:namespace/>veracitySignedFax": veracitySignedFax,
	                "<portlet:namespace/>veracitySignedAddress": veracitySignedAddress,
	                "<portlet:namespace/>jadscApplicationId": jadscApplicationId,
				    },
	            success: function(data) {
	            	uploadDocuments('veracitySignedBtn','Certificate of Veracity Sign','');
	            	uploadDocuments('veracityPeaceJusticeBtn','Certificate of Veracity Peace Justice','');
					$("#jadscFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"}); 

					if(!isSaveAndContinue){
						applicantInfo();
					}
	            },
	            error: function(data) {},
			});
		}
	}
	//Function CertificationOfService Add Form Save Data
	function setCertificationOfServiceAddFormInfo(counter,deleteKey){
		if(counter!=''&&deleteKey==''){
			docServedAddressVal=counter;
		docServeName = $("#editDocServeName"+counter).val();
		docServeAddress = $("#editDocServeCom"+counter).val();
		docServeCom = $("#editDocServeAddress"+counter).val();
		}else{
			docServedAddressVal=$("#docServedAddressVal"+counter).val();
		docServeName=$("#docServeName").val();
		docServeAddress=$("#docServeAddress").val();
		docServeCom=$("#docServeCom").val();
		jadscApplicationId=$("#jadscApplicationId").val();
		}
		jadscCOSId=$("#docServedAddress"+counter).val();
		 $.ajax({
	            type: "POST",
	            url: '${setCertificationOfServiceAddFormInfoUrl}',
	            data: {

	                "<portlet:namespace/>docServeName": docServeName,
	                "<portlet:namespace/>docServeAddress": docServeAddress,
	                "<portlet:namespace/>docServeCom": docServeCom,
	                "<portlet:namespace/>jadscApplicationId": jadscApplicationId,
	                "<portlet:namespace/>jadscCOSId": jadscCOSId,
	                "<portlet:namespace/>counter": docServedAddressVal,
	                "<portlet:namespace/>deleteKey": deleteKey,
				    },
	            success: function(data) {
	            	var result=data.APP_DATA;
				    $("#docServedAddress"+result["counter"]).val(result["jadscCOSId"]);
	            },
	            error: function(data) {}
	    });
		}
	//Function Checklist Form Save Data
	function setChecklistFormInfo(){
		for (var i = 0; i <=15; i++) {
			informationRegComplaint = $("#informationRegComplaint" + i).val();
			informationRegComplaintChecked = $("#informationRegComplaint" + i).is(':checked');
			jadscCheckListOther = $("#checklistOther" + i).val();
     		jadscApplicationId=$("#jadscApplicationId").val();
		 $.ajax({
	            type: "POST",
	            url: '${setChecklistInfoUrl}',
	            data: {

	                "<portlet:namespace/>informationRegComplaint": informationRegComplaint,
	                "<portlet:namespace/>informationRegComplaintChecked": informationRegComplaintChecked,
	                "<portlet:namespace/>jadscCheckListOther": jadscCheckListOther,
	                "<portlet:namespace/>jadscApplicationId": jadscApplicationId,
				    },
				    async: false,
	            success: function(data) {
	            	addChecklistDetail();
	            },
	            error: function(data) {}
	    });
	  }
	}
	//Function Notice of Appearance Form Save Data
	function setNoticeOfAppearanceFormInfo(){
		appearanceNoticeFullName=$("#appearanceNoticeFullName").val();
		appearanceNoticeAddressOne=$("#appearanceNoticeAddressOne").val();
		appearanceNoticeDate=$("#appearanceNoticeDate").val();
		appearanceNoticeName=$("#appearanceNoticeName").val();
		appearanceNoticeFirm=$("#appearanceNoticeFirm").val();
		appearanceNoticeAddress=$("#appearanceNoticeAddress").val();
		appearanceNoticeTelephone=$("#appearanceNoticeTelephone").val();
		jadscApplicationId=$("#jadscApplicationId").val();
		 $.ajax({
	            type: "POST",
	            url: '${setNoticeOfAppearenceInfoUrl}',
	            data: {

	                "<portlet:namespace/>appearanceNoticeFullName": appearanceNoticeFullName,
	                "<portlet:namespace/>appearanceNoticeAddressOne": appearanceNoticeAddressOne,
	                "<portlet:namespace/>appearanceNoticeDate": appearanceNoticeDate,
	                "<portlet:namespace/>appearanceNoticeName": appearanceNoticeName,
	                "<portlet:namespace/>appearanceNoticeFirm": appearanceNoticeFirm,
	                "<portlet:namespace/>appearanceNoticeAddress": appearanceNoticeAddress,
	                "<portlet:namespace/>appearanceNoticeTelephone": appearanceNoticeTelephone,
	                "<portlet:namespace/>jadscApplicationId": jadscApplicationId,
				    },
	            success: function(data) {
	            	uploadDocuments('appearanceNoticeSignatureBtn','Notice of Appearance Sign','');
	            },
	            error: function(data) {}
	    });
		}

</script>