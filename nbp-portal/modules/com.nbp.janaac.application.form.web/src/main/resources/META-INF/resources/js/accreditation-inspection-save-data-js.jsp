<%@ include file="../init.jsp" %>
<script>
function accInsBodiesApplicationInfo(isSaveAndContinue) {
		applicantName=$("#applicantNameInsBodies").val();
		applicantAddress=$("#applicantAddressInsBodies").val();
		applicantTelephone=$("#applicantTelephoneInsBodies").val();
		applicantFaxNo=$("#applicantFaxInsBodies").val();
		applicantWebsite=$("#applicantWebsiteInsBodies").val();
		laboratoryName=$("#certificationNameInsBodies").val();
		laboratoryAddress=$("#insBodiesCertAddress").val();
		personnelName=$("#personnelNameInsBodies").val();
		personnelEmail=$("#personnelEmailInsBodies").val();
		personnelQMName=$("#contactPersonNameInsBodies").val();
		personnelQMEmail=$("#contactPersonEmailInsBodies").val();
		personnelFMName=$("#financialManagerNameInsBodies").val();
		personnelFMEmail=$("#financialManagerEmailInsBodies").val();
		accreditationRequest=$("input[name='accreditationRequestInsBodies']:checked").val();
		authorizedPersonnelName=$("#authorizedPersonnelInsBodiesName").val();
		authorizedPersonnelPosition=$("#authorizedPersonnelInsBodiesPosition").val();
		authorizedPersonnelDate=$("#authorizedPersonnelInsBodiesDate").val();
		janaacApplicationId = $("#janaacApplicationId").val();
		applicantNameInsBodies=$("#applicantNameInsBodies").val();
		authorizedPersonnelInsBodiesName=$("#authorizedPersonnelInsBodiesName").val();
		submitForm= true;
		if(!isSaveAndContinue){
		if(!applicantNameInsBodies){
			$("#applicantNameInsBodiesValidation").removeClass("hide");
			$("#applicantNameInsBodies").focus();
			submitForm= false;
		}else{
			$("#applicantNameInsBodiesValidation").addClass("hide");
		}
		if(!authorizedPersonnelInsBodiesName){
			$("#authorizedPersonnelInsBodiesNameValidation").removeClass("hide");
			$("#authorizedPersonnelInsBodiesName").focus();
			submitForm= false;
		}else{
			$("#authorizedPersonnelInsBodiesNameValidation").addClass("hide");
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
							"<portlet:namespace/>personnelFMName" : personnelFMName,
							"<portlet:namespace/>personnelFMEmail" : personnelFMEmail,
							"<portlet:namespace/>accreditationRequest" : accreditationRequest,
							"<portlet:namespace/>authorizedPersonnelName" : authorizedPersonnelName,
							"<portlet:namespace/>authorizedPersonnelPosition" : authorizedPersonnelPosition,
							"<portlet:namespace/>authorizedPersonnelDate" : authorizedPersonnelDate,
							"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
							},
						success : function(data) {
							
							uploadDocuments('authorizedPersonnelInsBodiesBtn',"Signature of Third Cat Authorized",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
							uploadDocuments('companyStampInsBodiesBtn',"Signature of Third Cat Company stamps",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
							$("#janaacFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
							
							if(!isSaveAndContinue){
					         applicantInfo();
					         addPersonResponsibleInsBodiesDetail();
			                }
						},
						error : function(data) {
						},
					});
		}
	 }
function accInsBodiesOrganization(isSaveAndContinue) {
	 insLegalEntity = $("input[name='insBodiesLegalEntity']:checked").val();
	 insLegalStatusEntity=$("#insBodiesLegalStatusEntity").val();
	 insBodyOrgPart =$("input[name='insBodyOrgPart']:checked").val();
	 insPersonnelName=$("#orgPersonnelNameInsBodies").val();
	 insPersonnelPosition=$("#orgPersonnelPositionInsBodies").val();
	 insStaffSize=$("#staffSizeInsBodies").val();
	 insStaffComplement = $("#staffComplement").val();
	 insIncomeSource=$("#insBodiesIncomeSource").val();
	 insOrgBodyType = $("input[name='orgInsBodyType']:checked").val();
	 insBodyOwnOrgClient=$("#insBodyServiceOwnOrgClient").val();
	 insBodyOtherOrgClient=$("#insBodyServiceOtherOrgClient").val();
	janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${addAccInsBodiesOrganization}",
					data : {
						"<portlet:namespace/>insLegalEntity" : insLegalEntity,
						"<portlet:namespace/>insLegalStatusEntity" : insLegalStatusEntity,
						"<portlet:namespace/>insBodyOrgPart" : insBodyOrgPart,
						"<portlet:namespace/>insPersonnelName" : insPersonnelName,
						"<portlet:namespace/>insPersonnelPosition" : insPersonnelPosition,
						"<portlet:namespace/>insStaffSize" : insStaffSize,
						"<portlet:namespace/>insStaffComplement" : insStaffComplement,
						"<portlet:namespace/>insIncomeSource" : insIncomeSource,
						"<portlet:namespace/>insOrgBodyType" : insOrgBodyType,
						"<portlet:namespace/>insBodyOwnOrgClient" : insBodyOwnOrgClient,
						"<portlet:namespace/>insBodyOtherOrgClient" : insBodyOtherOrgClient,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						},
					success : function(data) {
						if(!isSaveAndContinue){
					applicantInfo();
					addInspectionPersonnelDetails();
					addStaffDetailInsBodies();
					addAccreditationSoughtScope();
			        }
					},
					error : function(data) {
					},
				});
}
function accInsBodiesPhysicalResource(isSaveAndContinue) {
	 insBodiesfacilities=$("#insBodyFacility").val();
	 insSafetyFeatures=$("#safetyFeaturesInsBodies").val();
	 insSecurityArrangements=$("#securityArrangmentInsBodies").val();
	janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${addAccInsBodiesPhysicalResource}",
					data : {
						"<portlet:namespace/>insBodiesfacilities" : insBodiesfacilities,
						"<portlet:namespace/>insSafetyFeatures" : insSafetyFeatures,
						"<portlet:namespace/>insSecurityArrangements" : insSecurityArrangements,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						},
					success : function(data) {

						if(!isSaveAndContinue){
					    applicantInfo();
					    addMajorEquipmentInsBodiesDetail();
						addApplicationActivityLocInsBodiesDetail();
			            }
						
					},
					error : function(data) {
					},
				});
}
function accInsBodiesManagementSysReq(isSaveAndContinue) {
	 optionFollow = $("input[name='managementSysOptionInsBodies']:checked").val();
	 manualApproval =$("input[name='manageSysManualOne']:checked").val();
	 qMRefManual=$("#manageSysManualRefOne").val();
	 relevantPolicies = $("input[name='manageSysManualTwo']:checked").val();
	 qMRefRelevant=$("#manageSysManualRefTwo").val();
	 overallObj = $("input[name='manageSysManualThree']:checked").val();
	 qMRefOverallObj=$("#manageSysManualRefThree").val();
	 supportingProcedure = $("input[name='manageSysManualFour']:checked").val();
	 qMRefSupporting=$("#manageSysManualRefFour").val();
	 technicalMangmnt = $("input[name='manageSysManualFive']:checked").val();
	 qMRefTechnical=$("#manageSysManualRefFive").val();
	 documentation = $("input[name='manageSysManualSix']:checked").val();
	 qMRefDocumentation=$("#manageSysManualRefSix").val();	 
	 docContolProc = $("input[name='manageSysReqOne']:checked").val();
	 qMRefDocControl=$("#manageSysReqRefOne").val();
	 documntChanges = $("input[name='manageSysReqTwo']:checked").val();
	 qMRefDocumntChanges=$("#manageSysReqRefTwo").val();
	 controlOfQuality = $("input[name='manageSysReqThree']:checked").val();
	 qMRefControl=$("#manageSysReqRefThree").val();
	 managementReview = $("input[name='manageSysReqFour']:checked").val();
	 qMRefManage=$("#manageSysReqRefFour").val();
	 insInternalAudits = $("input[name='manageSysReqFive']:checked").val();
	 qMRefInternalAudit=$("#manageSysReqRefFive").val();
	 insCorrectiveAction = $("input[name='manageSysReqSix']:checked").val();
	 qMRefCorrect=$("#manageSysReqRefSix").val();
	 insPreventiveAction = $("input[name='manageSysReqSeven']:checked").val();
	 qMRefPreventive=$("#manageSysReqRefSeven").val();	 
	 personnel = $("input[name='manageSysResourceReqOne']:checked").val();
	 qMRefPersonnel=$("#manageSysResourceReqRefOne").val();
	 equipment = $("input[name='manageSysResourceReqTwo']:checked").val();
	 qMRefEquip=$("#manageSysResourceReqRefTwo").val();	 
	 inspection = $("input[name='manageSysProcessReqOne']:checked").val();
	 qMRefInspection=$("#manageSysProcessReqRefOne").val();
	 contractualArrange = $("input[name='manageSysProcessReqTwo']:checked").val();
	 qMRefContractual=$("#manageSysProcessReqRefTwo").val();
	 handlingInsItem =$("input[name='manageSysProcessReqThree']:checked").val();
	 qMRefHandling=$("#manageSysProcessReqRefThree").val();
	 complaintsAppeals = $("input[name='manageSysProcessReqFour']:checked").val();
	 qMRefComplaints=$("#manageSysProcessReqRefFour").val();
	 janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${addAccInsBodiesManagementSysReq}",
					data : {
						 "<portlet:namespace/>optionFollow" : optionFollow,
							"<portlet:namespace/>manualApproval" : manualApproval,
							"<portlet:namespace/>qMRefManual" : qMRefManual,
							"<portlet:namespace/>relevantPolicies" : relevantPolicies,
							"<portlet:namespace/>qMRefRelevant" : qMRefRelevant,
							"<portlet:namespace/>overallObj" : overallObj,
							"<portlet:namespace/>qMRefOverallObj" : qMRefOverallObj,
							"<portlet:namespace/>supportingProcedure" : supportingProcedure,
							"<portlet:namespace/>qMRefSupporting" : qMRefSupporting,
							"<portlet:namespace/>technicalMangmnt" : technicalMangmnt,
							"<portlet:namespace/>qMRefTechnical" : qMRefTechnical,
							"<portlet:namespace/>documentation" : documentation,
							"<portlet:namespace/>qMRefDocumentation" : qMRefDocumentation,
							"<portlet:namespace/>docContolProc" : docContolProc,							
						    "<portlet:namespace/>qMRefDocControl" : qMRefDocControl,
							"<portlet:namespace/>documntChanges" : documntChanges,
							"<portlet:namespace/>qMRefDocumntChanges" : qMRefDocumntChanges,
							"<portlet:namespace/>controlOfQuality" : controlOfQuality,
							"<portlet:namespace/>qMRefControl" : qMRefControl,
							"<portlet:namespace/>managementReview" : managementReview,
							"<portlet:namespace/>qMRefManage" : qMRefManage,
							"<portlet:namespace/>insInternalAudits" : insInternalAudits,
							"<portlet:namespace/>qMRefInternalAudit" : qMRefInternalAudit,
							"<portlet:namespace/>insCorrectiveAction" : insCorrectiveAction,
							"<portlet:namespace/>qMRefCorrect" : qMRefCorrect,
							"<portlet:namespace/>insPreventiveAction" : insPreventiveAction,
							"<portlet:namespace/>qMRefPreventive" : qMRefPreventive,
							"<portlet:namespace/>personnel" : personnel,							
							 "<portlet:namespace/>qMRefPersonnel" : qMRefPersonnel,
							 "<portlet:namespace/>equipment" : equipment,
							 "<portlet:namespace/>qMRefEquip" : qMRefEquip,
					   		 "<portlet:namespace/>inspection" : inspection,
							 "<portlet:namespace/>qMRefInspection" : qMRefInspection,
							 "<portlet:namespace/>contractualArrange" : contractualArrange,
							 "<portlet:namespace/>qMRefContractual" : qMRefContractual,
							 "<portlet:namespace/>handlingInsItem" : handlingInsItem,
							 "<portlet:namespace/>qMRefHandling" : qMRefHandling,
							 "<portlet:namespace/>complaintsAppeals" : complaintsAppeals,
							 "<portlet:namespace/>qMRefComplaints" : qMRefComplaints,	
						     "<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						},
					success : function(data) {
						 var result = data.APP_DATA;
					      $("#janaacApplicationId").html(result["janaacApplicationId"]);
						uploadDocuments('manageSysManualRefAttach1',"inspection bodies manual ref one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
						uploadDocuments('manageSysManualRefAttach2',"inspection bodies manual ref two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
						uploadDocuments('manageSysManualRefAttach3',"inspection bodies manual ref three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
						uploadDocuments('manageSysManualRefAttach4',"inspection bodies manual ref four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
						uploadDocuments('manageSysManualRefAttach5',"inspection bodies manual ref five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
						uploadDocuments('manageSysManualRefAttach6',"inspection bodies manual ref six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
						uploadDocuments('manageSysReqRefAttach1',"inspection bodies system req one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
						uploadDocuments('manageSysReqRefAttach2',"inspection bodies system req two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
						uploadDocuments('manageSysReqRefAttach3',"inspection bodies system req three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
						uploadDocuments('manageSysReqRefAttach4',"inspection bodies system req four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
						uploadDocuments('manageSysReqRefAttach5',"inspection bodies system req five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
						uploadDocuments('manageSysReqRefAttach6',"inspection bodies system req six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
						uploadDocuments('manageSysReqRefAttach7',"inspection bodies system req seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
						uploadDocuments('manageSysResourceReqRefAttach1',"inspection bodies system resource one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
						uploadDocuments('manageSysResourceReqRefAttach2',"inspection bodies system resource two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
						uploadDocuments('manageSysProcessReqRefAttach1',"inspection bodies process resource one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
						uploadDocuments('manageSysProcessReqRefAttach2',"inspection bodies process resource two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
						uploadDocuments('manageSysProcessReqRefAttach3',"inspection bodies process resource three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
						uploadDocuments('manageSysProcessReqRefAttach4',"inspection bodies process resource four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					
						if(!isSaveAndContinue){
					applicantInfo();
			    }
					},
					error : function(data) {
					},
				});
}
function accInsBodiesOtherReq() {
	 applicationFees = $("input[name='otherFeeReqInsBodies']:checked").val();
	 insPaymentMethod=$("#otherFeePayMethodInsBodies").val();
	 applicantRepName=$("#applicantRepresentativeNameInsBodies").val();
	 applicantRepPosition=$("#applicantRepresentativePositionInsBodies").val();
	 signatureDate=$("#applicantRepresentativeDateInsBodies").val();
	janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${addAccInsBodiesOtherReq}",
					data : {
						"<portlet:namespace/>applicationFees" : applicationFees,
						"<portlet:namespace/>insPaymentMethod" : insPaymentMethod,
						"<portlet:namespace/>applicantRepName" : applicantRepName,
						"<portlet:namespace/>applicantRepPosition" : applicantRepPosition,
						"<portlet:namespace/>signatureDate" : signatureDate,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						},
					success : function(data) {
						 uploadDocuments('applicantRepresentativeInsBodiesSignatureBtn',"Signature of Third Cat Applicant representative",'<%=uloadFormDocumentUrl%>',janaacApplicationId);	
						},
					error : function(data) {
					},
				});
}
</script>