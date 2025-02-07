<%@ include file="../init.jsp" %>
<script>
function accMediLabApplicationInfo(isSaveAndContinue) {
	applicantName=$("#applicantName").val();
	applicantAddress=$("#applicantAddress").val();
	applicantTelephone=$("#applicantTelephone").val();
	applicantFaxNo=$("#applicantFax").val();
	applicantWebsite=$("#applicantWebsite").val();
	laboratoryName=$("#laboratoryName").val();
	laboratoryAddress=$("#laboratoryAddress").val();
	personnelName=$("#personnelName").val();
	personnelEmail=$("#personnelEmail").val();
	personnelQMName=$("#personnelQMName").val();
	personnelQMEmail=$("#personnelQMEmail").val();
	deputyName=$("#deputyName").val();
	deputyEmail=$("#deputyEmail").val();
	personnelFMName=$("#personnelFMName").val();
	personnelFMEmail=$("#personnelFMEmail").val();
	accreditationRequest=$("input[name='accreditationRequest']:checked").val();
	authorizedPersonnelName=$("#authorizedPersonnelName").val();
	authorizedPersonnelPosition=$("#authorizedPersonnelPosition").val();
	authorizedPersonnelDate=$("#authorizedPersonnelDate").val();
	janaacApplicationId = $("#janaacApplicationId").val();
	submitForm= true;
	if(!isSaveAndContinue){
		if(!authorizedPersonnelName){
			$("#authorizedPersonnelNameValidation").removeClass("hide");
			$("#authorizedPersonnelName").focus();
			submitForm= false;
		}else{
			$("#authorizedPersonnelNameValidation").addClass("hide");
		}
		if(!applicantName){
			$("#applicantNameValidation").removeClass("hide");
			$("#applicantName").focus();
			submitForm= false;
		}else{
			$("#applicantNameValidation").addClass("hide");
		}
	}
	if(submitForm){
		$.ajax({
			type : "POST",
			url : "${addMedicalLabApplicationInfo}",
			data : {
				"<portlet:namespace/>applicantName" : applicantName,
				"<portlet:namespace/>applicantAddress" : applicantAddress,
				"<portlet:namespace/>applicantTelephone" : applicantTelephone,
				"<portlet:namespace/>applicantFaxNo" : applicantFaxNo,
				"<portlet:namespace/>applicantWebsite" : applicantWebsite,
				"<portlet:namespace/>laboratoryName" : laboratoryName,
				"<portlet:namespace/>laboratoryAddress" : laboratoryAddress,
				"<portlet:namespace/>personnelName" : personnelName,
				"<portlet:namespace/>personnelEmail" : personnelEmail,
				"<portlet:namespace/>personnelQMName" : personnelQMName,
				"<portlet:namespace/>personnelQMEmail" : personnelQMEmail,
				"<portlet:namespace/>deputyName" : deputyName,
				"<portlet:namespace/>deputyEmail" : deputyEmail,
				"<portlet:namespace/>personnelFMName" : personnelFMName,
				"<portlet:namespace/>personnelFMEmail" : personnelFMEmail,
				"<portlet:namespace/>accreditationRequest" : accreditationRequest,
				"<portlet:namespace/>authorizedPersonnelName" : authorizedPersonnelName,
				"<portlet:namespace/>authorizedPersonnelPosition" : authorizedPersonnelPosition,
				"<portlet:namespace/>authorizedPersonnelDate" : authorizedPersonnelDate,
				"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
				},
			success : function(data) {
				if(!isSaveAndContinue){
					applicantInfo();
					addPersonnelResponsibleDetail();
					$("#janaacFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				}
				var result = data.APP_DATA;
		    	$("#janaacApplicationId").html(result["janaacApplicationId"]);
				uploadDocuments('authorizedPersonnelBtn',"Signature of Authorized Personnel",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
				uploadDocuments('companyStampBtn',"Application Company Stamp",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
			},
			error : function(data) {
			},
		});
	}
 }
 function accMediLabDescriptionOfActivity(isSaveAndContinue) {
		var clinicalActivities = new Array();
		  $("input:checkbox[name=clinicalActivity]:checked").each(function () {
			  clinicalActivities.push($(this).val());
		 });	
	    var clinicalActivity=clinicalActivities.toString();
		laboratoryWorkShifts=$("#laboratoryWorkShifts").val();
		specimenNumber=$("#specimenNumber").val();
		specimenLocation=$("#specimenLocation").val();
		requestedPOCT=$("#requestedPOCT").val();
		requestedPOCTLocation=$("#requestedPOCTLocation").val();
		janaacApplicationId = $("#janaacApplicationId").val();
			$.ajax({
						type : "POST",
						url : "${addMedicalLabDescriptionOfActivity}",
						data : {
							"<portlet:namespace/>clinicalActivity" : clinicalActivity,
							"<portlet:namespace/>laboratoryWorkShifts" : laboratoryWorkShifts,
							"<portlet:namespace/>specimenNumber" : specimenNumber,
							"<portlet:namespace/>specimenLocation" : specimenLocation,
							"<portlet:namespace/>requestedPOCT" : requestedPOCT,
							"<portlet:namespace/>requestedPOCTLocation" : requestedPOCTLocation,
							"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
							},
						success : function(data) {
							if(!isSaveAndContinue){
								applicantInfo();
								addSpecimenCollectionDetail();
								addPointCareTestingDetail();
							}
						},
						error : function(data) {
						},
					});
	 }
 function accMediLabOrganizationInfo(isSaveAndContinue) {
	 laboratoryLegalEntity = $("input[name='laboratoryLegalEntity']:checked").val();
	 laboratoryLegalEntityDefine=$("#laboratoryLegalEntityDefine").val();
	 laboratoryPartOfOrg =$("input[name='laboratoryPartOfOrg']:checked").val();
	 laboratoryPartOfOrgName=$("#laboratoryPartOfOrgName").val();
	 laboratoryPartOfOrgPosition=$("#laboratoryPartOfOrgPosition").val();
	 analystsName=$("#analystsName").val();
	 majorIncomeSource=$("#majorIncomeSource").val();
	 laboratoryClients=$("#laboratoryClients").val();
	janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${addAccMediLabOrganizationInfo}",
					data : {
						"<portlet:namespace/>laboratoryLegalEntity" : laboratoryLegalEntity,
						"<portlet:namespace/>laboratoryLegalEntityDefine" : laboratoryLegalEntityDefine,
						"<portlet:namespace/>laboratoryPartOfOrg" : laboratoryPartOfOrg,
						"<portlet:namespace/>laboratoryPartOfOrgName" : laboratoryPartOfOrgName,
						"<portlet:namespace/>laboratoryPartOfOrgPosition" : laboratoryPartOfOrgPosition,
						"<portlet:namespace/>analystsName" : analystsName,
						"<portlet:namespace/>majorIncomeSource" : majorIncomeSource,
						"<portlet:namespace/>laboratoryClients" : laboratoryClients,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						},
					success : function(data) {
						if(!isSaveAndContinue){
								applicantInfo();
								addKeyPersonnelDetails();
								addSignatoryAuthorityDetail();
								addExaminationsScopeDetail();
							}
					},
					error : function(data) {
					},
				});
 }
 function accMediLabPhysicalResource(isSaveAndContinue) {
	 laboratoryFacility=$("#laboratoryFacility").val();
	 safetyFeatures=$("#safetyFeatures").val();
	 specialEnvironmental=$("#specialEnvironmental").val();
	 laboratoryMonitoringActivity=$("#laboratoryMonitoringActivity").val();
	 securityArrangements=$("#securityArrangements").val();
	 laboratoryDocumented=$("#laboratoryDocumented").val();
	janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${addAccMediLabPhysicalResource}",
					data : {
						"<portlet:namespace/>laboratoryFacility" : laboratoryFacility,
						"<portlet:namespace/>safetyFeatures" : safetyFeatures,
						"<portlet:namespace/>specialEnvironmental" : specialEnvironmental,
						"<portlet:namespace/>laboratoryMonitoringActivity" : laboratoryMonitoringActivity,
						"<portlet:namespace/>securityArrangements" : securityArrangements,
						"<portlet:namespace/>laboratoryDocumented" : laboratoryDocumented,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						},
					success : function(data) {
						if(!isSaveAndContinue){
								applicantInfo();
								addMajorEquipmentDetail();
								addApplicationActivityLocDetail();
							}
					},
					error : function(data) {
					},
				});
 }
</script>