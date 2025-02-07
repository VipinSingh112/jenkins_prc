<%@ include file="../init.jsp" %>
<script>
function accCerBodyProductManageSysReq(isSaveAndContinue) {
	 optionFollow = $("input[name='cerProductImplementedWithOrg']:checked").val();
	 certiAgreement =$("input[name='genReqCerProductOne']:checked").val();
	 qMRefCertiAgreement=$("#managementRefCerProductOne").val();
	 riskAssessment = $("input[name='genReqCerProductTwo']:checked").val();
	 qMRefRisk=$("#managementRefCerProductTwo").val();
	 confidentiality = $("input[name='genReqCerProductThree']:checked").val();
	 qMRefConfidentiality=$("#managementRefCerProductThree").val();
	 security = $("input[name='genReqCerProductFour']:checked").val();
	 qMRefSecurity=$("#managementRefCerProductFour").val();
	 certificationScheme = $("input[name='genReqCerProductFive']:checked").val();
	 qMRefCertifiScheme=$("#managementRefCerProductFive").val();	 
	 validCertification = $("input[name='genReqCerProductSix']:checked").val();
	 qMRefValidCertification=$("#managementRefCerProductSix").val();	 
	 preRequisites = $("input[name='genReqCerProductSeven']:checked").val();
	 qMRefPrerequisites=$("#managementRefCerProductSeven").val();
	 orgStructure = $("input[name='structuralReqCerProductOne']:checked").val();
	 qMRefOrgStructure =$("#managementStrucRefCerProductOne").val();
	 formalRules = $("input[name='structuralReqCerProductTwo']:checked").val();
	 qMRefFormalRules=$("#managementStrucRefCerProductTwo").val();
	 safeguardingMechanism = $("input[name='structuralReqCerProductThree']:checked").val();
	 qMRefSafeguarding=$("#managementStrucRefCerProductThree").val();
	 managementProc = $("input[name='resourceReqCerProductOne']:checked").val();
	 qMRefManagementProc=$("#managementResourceRefCerProductOne").val();
	 contractExaminer = $("input[name='resourceReqCerProductTwo']:checked").val();
	 qMRefExaminer=$("#managementResourceRefCerProductTwo").val();
	 contractBody = $("input[name='resourceReqCerProductThree']:checked").val();
	 qMRefContractBody=$("#managementResourceRefCerProductThree").val();
	 docPolicies = $("input[name='resourceReqCerProductFour']:checked").val();
	 qMRefDocPolicies=$("#managementResourceRefCerProductFour").val();
	 specifiedStandard = $("input[name='processReqCerProductOne']:checked").val();
	 qMRefSpecified=$("#managementProcessRefCerProductOne").val();
	 applicationForm = $("input[name='processReqCerProductTwo']:checked").val();
	 qMRefAppliForm=$("#managementProcessRefCerProductTwo").val();
	 applicationReview = $("input[name='processReqCerProductThree']:checked").val();
	 qMRefAppliReview=$("#managementProcessRefCerProductThree").val();
	 assessmentPlan = $("input[name='processReqCerProductFour']:checked").val();
	 qMRefAssessmentPlan=$("#managementProcessRefCerProductFour").val();
	 examinationProcess = $("input[name='processReqCerProductFive']:checked").val();
	 qMRefExamProcess=$("#managementProcessRefCerProductFive").val();
	 certificationDecision = $("input[name='processReqCerProductSix']:checked").val();
	 qMRefCertiDecision=$("#managementProcessRefCerProductSix").val();
	 certificationDoc = $("input[name='processReqCerProductSeven']:checked").val();
	 qMRefCertiDoc=$("#managementProcessRefCerProductSeven").val();
	 useOfCertificates = $("input[name='processReqCerProductEight']:checked").val();
	 qMRefUseOfCertificate=$("#managementProcessRefCerProductEight").val();
	 suspension = $("input[name='processReqCerProductNine']:checked").val();
	 qMRefSuspension=$("#managementProcessRefCerProductNine").val();
	 processToReceive = $("input[name='processReqCerProductTen']:checked").val();
	 qMRefReceiveProcess=$("#managementProcessRefCerProductTen").val();
	 generalManage = $("input[name='managementSystemCerProductReqOne']:checked").val();
	 qMRefGeneral=$("#managementSystemCerProductRefOne").val();
	 docControl = $("input[name='managementSystemCerProductReqTwo']:checked").val();
	 qMRefDocControl=$("#managementSystemCerProductRefTwo").val();
	 recordControl = $("input[name='managementSystemCerProductReqThree']:checked").val();
	 qMRefRecControl=$("#managementSystemCerProductRefThree").val();
	 manageReview = $("input[name='managementSystemCerProductReqFour']:checked").val();
	 qMRefManageReview=$("#managementSystemCerProductRefFour").val();
	 internalAudit = $("input[name='managementSystemCerProductReqFive']:checked").val();
	 qMRefInternal=$("#managementSystemCerProductRefFive").val();
	 correctiveAction = $("input[name='managementSystemCerProductReqSix']:checked").val();
	 qMRefCorrective=$("#managementSystemCerProductRefSix").val();
	 preventiveAction = $("input[name='managementSystemCerProductReqSeven']:checked").val();
	 qMRefPreventive=$("#managementSystemCerProductRefSeven").val();
	 docInKeeping = $("input[name='managementSystemCerProductBReqOne']:checked").val();
	 qMRefDocInKeeping=$("#managementSystemCerProductBRefOne").val();
	 janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${addAccCerBodiesManagementSystemReq}",
					data : {
						"<portlet:namespace/>optionFollow" : optionFollow,
						"<portlet:namespace/>certiAgreement" : certiAgreement,
						"<portlet:namespace/>qMRefCertiAgreement" : qMRefCertiAgreement,
						"<portlet:namespace/>riskAssessment" : riskAssessment,
						"<portlet:namespace/>qMRefRisk" : qMRefRisk,
						"<portlet:namespace/>confidentiality" : confidentiality,
						"<portlet:namespace/>qMRefConfidentiality" : qMRefConfidentiality,
						"<portlet:namespace/>security" : security,
						"<portlet:namespace/>qMRefSecurity" : qMRefSecurity,
						"<portlet:namespace/>certificationScheme" : certificationScheme,
						"<portlet:namespace/>qMRefCertifiScheme" : qMRefCertifiScheme,
						"<portlet:namespace/>validCertification" : validCertification,
						"<portlet:namespace/>qMRefValidCertification" : qMRefValidCertification,
						"<portlet:namespace/>preRequisites" : preRequisites,
						"<portlet:namespace/>qMRefPrerequisites" : qMRefPrerequisites,
						"<portlet:namespace/>orgStructure" : orgStructure,
						"<portlet:namespace/>qMRefOrgStructure" : qMRefOrgStructure,
						"<portlet:namespace/>formalRules" : formalRules,
						"<portlet:namespace/>qMRefFormalRules" : qMRefFormalRules,
						"<portlet:namespace/>safeguardingMechanism" : safeguardingMechanism,
						"<portlet:namespace/>qMRefSafeguarding" : qMRefSafeguarding,
						"<portlet:namespace/>managementProc" : managementProc,
						"<portlet:namespace/>qMRefManagementProc" : qMRefManagementProc,
						"<portlet:namespace/>contractExaminer" : contractExaminer,
						"<portlet:namespace/>qMRefExaminer" : qMRefExaminer,
						"<portlet:namespace/>contractBody" : contractBody,
						"<portlet:namespace/>qMRefContractBody" : qMRefContractBody,
						"<portlet:namespace/>docPolicies" : docPolicies,
						"<portlet:namespace/>qMRefDocPolicies" : qMRefDocPolicies,
						"<portlet:namespace/>specifiedStandard" : specifiedStandard,
						"<portlet:namespace/>qMRefSpecified" : qMRefSpecified,
						"<portlet:namespace/>applicationForm" : applicationForm,
						"<portlet:namespace/>qMRefAppliForm" : qMRefAppliForm,
						"<portlet:namespace/>applicationReview" : applicationReview,
						"<portlet:namespace/>qMRefAppliReview" : qMRefAppliReview,
						"<portlet:namespace/>assessmentPlan" : assessmentPlan,
						"<portlet:namespace/>qMRefAssessmentPlan" : qMRefAssessmentPlan,
						"<portlet:namespace/>examinationProcess" : examinationProcess,
						"<portlet:namespace/>qMRefExamProcess" : qMRefExamProcess,
						"<portlet:namespace/>certificationDecision" : certificationDecision,
						"<portlet:namespace/>qMRefCertiDecision" : qMRefCertiDecision,
						"<portlet:namespace/>certificationDoc" : certificationDoc,
						"<portlet:namespace/>qMRefCertiDoc" : qMRefCertiDoc,
						"<portlet:namespace/>useOfCertificates" : useOfCertificates,
						"<portlet:namespace/>qMRefUseOfCertificate" : qMRefUseOfCertificate,
						"<portlet:namespace/>suspension" : suspension,
						"<portlet:namespace/>qMRefSuspension" : qMRefSuspension,
						"<portlet:namespace/>processToReceive" : processToReceive,
						"<portlet:namespace/>qMRefReceiveProcess" : qMRefReceiveProcess,
						"<portlet:namespace/>generalManage" : generalManage,
						"<portlet:namespace/>qMRefGeneral" : qMRefGeneral,
						"<portlet:namespace/>docControl" : docControl,
						"<portlet:namespace/>qMRefDocControl" : qMRefDocControl,
						"<portlet:namespace/>recordControl" : recordControl,
						"<portlet:namespace/>qMRefRecControl" : qMRefRecControl,
						"<portlet:namespace/>manageReview" : manageReview,
						"<portlet:namespace/>qMRefManageReview" : qMRefManageReview,
						"<portlet:namespace/>internalAudit" : internalAudit,
						"<portlet:namespace/>qMRefInternal" : qMRefInternal,
						"<portlet:namespace/>correctiveAction" : correctiveAction,
						"<portlet:namespace/>qMRefCorrective" : qMRefCorrective,
						"<portlet:namespace/>preventiveAction" : preventiveAction,
						"<portlet:namespace/>qMRefPreventive" : qMRefPreventive,
						"<portlet:namespace/>docInKeeping" : docInKeeping,
						"<portlet:namespace/>qMRefDocInKeeping" : qMRefDocInKeeping,						
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
					
					},
					success : function(data) {
						var result = data.APP_DATA;
				$("#janaacApplicationId").html(result["janaacApplicationId"]);
				uploadDocuments('managementRefCerProductAttach1',"cert 17065 man ref one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementRefCerProductAttach2',"cert 17065 man ref two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
				uploadDocuments('managementRefCerProductAttach3',"cert 17065 man ref three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementRefCerProductAttach4',"cert 17065 man ref four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
				uploadDocuments('managementRefCerProductAttach5',"cert 17065 man ref five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementRefCerProductAttach6',"cert 17065 man ref six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
				uploadDocuments('managementRefCerProductAttach7',"cert 17065 man ref seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementStrucRefCerProductAttach1',"cert 17065 man struct one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
				uploadDocuments('managementStrucRefCerProductAttach2',"cert 17065 man struct two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementStrucRefCerProductAttach3',"cert 17065 man struct three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementResourceRefCerProductAttach1',"cert 17065 man resource one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementResourceRefCerProductAttach2',"cert 17065 man resource two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementResourceRefCerProductAttach3',"cert 17065 man resource three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementResourceRefCerProductAttach4',"cert 17065 man resource four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefCerProductAttach1',"cert 17065 man process one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefCerProductAttach2',"cert 17065 man process two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefCerProductAttach3',"cert 17065 man process three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefCerProductAttach4',"cert 17065 man process four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefCerProductAttach5',"cert 17065 man process five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefCerProductAttach6',"cert 17065 man process six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefCerProductAttach7',"cert 17065 man process seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefCerProductAttach8',"cert 17065 man process eight",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefCerProductAttach9',"cert 17065 man process nine",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefCerProductAttach10',"cert 17065 man process ten",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSystemCerProductRefAttach1',"cert 17065 man system one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSystemCerProductRefAttach2',"cert 17065 man system two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSystemCerProductRefAttach3',"cert 17065 man system three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSystemCerProductRefAttach4',"cert 17065 man system four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSystemCerProductRefAttach5',"cert 17065 man system five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSystemCerProductRefAttach6',"cert 17065 man system six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSystemCerProductRefAttach7',"cert 17065 man system seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
                uploadDocuments('managementSystemCerProductBRefAttach1',"cert 17065 man require one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				if(!isSaveAndContinue){
						applicantInfo();
	    	 		}
					
			},
					error : function(data) {
					},
				});
}

function accCerBodiesProductOtherReq() {
	 applicationFees = $("input[name='otherFeeReqCerProduct']:checked").val();
	 insPaymentMethod=$("#otherFeePayMethodCerProduct").val();
	 applicantRepName=$("#applicantRepresentativeNameCerPro").val();
	 applicantRepPosition=$("#applicantRepresentativePositionCerPro").val();
	 signatureDate=$("#applicantRepresentativeCerProDate").val();
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
			    var result = data.APP_DATA;
			    $("#janaacApplicationId").html(result["janaacApplicationId"]);
			    uploadDocuments('applicantRepresentativeCerProSignatureBtn',"Accre Certi 17065 Applicant Representative Signature",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
					},
					error : function(data) {
					},
				});
}

function accCerBodiesAppliInfo(isSaveAndContinue) {
	applicantName=$("#applicantNameCerBodies").val();
	applicantAddress=$("#applicantAddressCerBodies").val();
	applicantTelephone=$("#applicantTelephoneCerBodies").val();
	applicantFaxNo=$("#applicantFaxCerBodies").val();
	applicantWebsite=$("#applicantWebsiteCerBodies").val();
	laboratoryName=$("#certificationNameCerBodies").val();
	laboratoryAddress=$("#cerBodiesCertAddress").val();
	personnelName=$("#personnelNameCerBodies").val();
	personnelEmail=$("#personnelEmailCerBodies").val();
	personnelQMName=$("#contactPersonNameCerBodies").val();
	personnelQMEmail=$("#contactPersonNameCerBodies").val();
	personnelFMName=$("#financialManagerNameCerBodies").val();
	personnelFMEmail=$("#financialManagerEmailCerBodies").val();
	accreditationRequest=$("input[name='accreditationRequestCerBodies']:checked").val();
	authorizedPersonnelName=$("#authorizedPersonnelCerBodiesName").val();
	authorizedPersonnelPosition=$("#authorizedPersonnelCerBodiesPosition").val();
	authorizedPersonnelDate=$("#authorizedPersonnelCerBodiesDate").val();
	janaacApplicationId = $("#janaacApplicationId").val();
	submitForm= true;
	if(!isSaveAndContinue){
		if(!authorizedPersonnelName){
			$("#authorizedPersonnelCerBodiesNameValidation").removeClass("hide");
			$("#authorizedPersonnelCerBodiesName").focus();
			submitForm= false;
		}else{
			$("#authorizedPersonnelCerBodiesNameValidation").addClass("hide");
		}
		if(!applicantName){
			$("#applicantNameCerBodiesValidation").removeClass("hide");
			$("#applicantNameCerBodies").focus();
			submitForm= false;
		}else{
			$("#applicantNameCerBodiesValidation").addClass("hide");
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
				if(!isSaveAndContinue){
					applicantInfo();
					addPersonResponsibleCerBodiesDetail();
				}
		    var result = data.APP_DATA;
		    $("#janaacApplicationId").html(result["janaacApplicationId"]);
		    uploadDocuments('authorizedPersonnelCerBodiesBtn',"Accre Cert 17024 Signature of Authorized",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
		    uploadDocuments('companyStampCerBodiesBtn',"Accre Cert 17024 Company Stamp",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
		   $("#janaacFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			},
			error : function(data) {
			},
		});
	}		
 }
function accCertiBodiesGeneral(isSaveAndContinue) {
	cerLegalEntity = $("input[name='cerBodiesLegalEntity']:checked").val();
	cerLegalStatusEntity=$("#cerBodiesLegalStatusEntity").val();
	cerMajorIncomeSources=$("#incomeMajorSourcesCerBodies").val();
	janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${addAccCerBodiesGeneral}",
					data : {
						"<portlet:namespace/>cerLegalEntity" : cerLegalEntity,
						"<portlet:namespace/>cerLegalStatusEntity" : cerLegalStatusEntity,
						"<portlet:namespace/>cerMajorIncomeSources" : cerMajorIncomeSources,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						},
					success : function(data) {
						if(!isSaveAndContinue){
					applicantInfo();
				}
					},
					error : function(data) {
					},
				});
}
function accCertiBodiesScopeService(isSaveAndContinue) {
	cerIntrestedParties = $("#cerBodiesIntrestedParties").val();
   otherServices = $("input[name='cerBodiesOtherServices']:checked").val();
   otherServicesDescribe=$("#cerBodiesOtherServicesDescribe").val();
	establishedRelation = $("input[name='cerBodiesEstablishedRelation']:checked").val();
	establishedRelDesc=$("#cerBodiesEstablishedRelationDesc").val();
	clientService = $("input[name='cerBodiesClientService']:checked").val();
	orgAccredited= $("input[name='orgAccreditedAnotherAccreditationCerBodies']:checked").val();
	responsibleBody=$("#responsibleBodyAccreditationCerBodies").val();	 
	accExpDate=$("#accreditationExpDateCerBodies").val();
	certBodyScope=$("#certBodyScopeCerBodies").val();
	janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${addAccCerBodiesProductScopeService}",
					data : {
							"<portlet:namespace/>cerIntrestedParties" : cerIntrestedParties,
							"<portlet:namespace/>otherServices" : otherServices,
							"<portlet:namespace/>otherServicesDescribe" : otherServicesDescribe,
							"<portlet:namespace/>establishedRelation" : establishedRelation,
							"<portlet:namespace/>establishedRelDesc" : establishedRelDesc,
							"<portlet:namespace/>clientService" : clientService,
							 "<portlet:namespace/>orgAccredited" : orgAccredited,
							 "<portlet:namespace/>responsibleBody" : responsibleBody,
							 "<portlet:namespace/>accExpDate" : accExpDate,	
							 "<portlet:namespace/>certBodyScope" : certBodyScope,							
						     "<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						},
					success : function(data) {

						if(!isSaveAndContinue){
					applicantInfo();
				}

					},
					error : function(data) {
					},
				});
}		
function accCerBodyOrgPersonnel(isSaveAndContinue) {
	 internalStaffSize=$("#internalStaffSizeCerBodies").val();
	 auditorsNum=$("#auditorsNumCerBodies").val();
	 contractedPerNum=$("#contractedPerNumCerBodies").val();
	 bodyOutsource = $("input[name='cerBodiesBodyOutsource']:checked").val();
	 descSecurity=$("#descSecurityArrangementsCerBodies").val();
 	 janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${addAccCerBodyPersonnelResource}",
					data : {
						"<portlet:namespace/>internalStaffSize" : internalStaffSize,
						"<portlet:namespace/>auditorsNum" : auditorsNum,
						"<portlet:namespace/>contractedPerNum" : contractedPerNum,
						"<portlet:namespace/>bodyOutsource" : bodyOutsource,
						"<portlet:namespace/>descSecurity" : descSecurity,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						},
					success : function(data) {
						if(!isSaveAndContinue){
							applicantInfo();
							addStaffDetailCerBodies();
							addAuditorListCerBodies();
							addOutsourceActNatureCerBodies();
						}
					},
					error : function(data) {
					},
				});
}
function accCertiBodyInformation(isSaveAndContinue) {
	describeMechanism=$("#describeMechanismCerBodies").val();
 	 janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${addAccCerBodyInformation}",
					data : {
						"<portlet:namespace/>describeMechanism" : describeMechanism,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						},
					success : function(data) {
						
						if(!isSaveAndContinue){
						applicantInfo();
	    	 		}
					},
					error : function(data) {
					},
				});
}
function accCerBodiesManagementSystemReq() {
	 optionFollow = $("input[name='managementImplementedWithOrgCerBodies']:checked").val();
	 certiAgreement =$("input[name='genReqCerBodiesOne']:checked").val();
	 qMRefCertiAgreement=$("#managementRefCerBodiesOne").val();
	 riskAssessment = $("input[name='genReqCerBodiesTwo']:checked").val();
	 qMRefRisk=$("#managementRefCerBodiesTwo").val();
	 confidentiality = $("input[name='genReqCerBodiesThree']:checked").val();
	 qMRefConfidentiality=$("#managementRefCerBodiesThree").val();
	 security = $("input[name='genReqCerBodiesFour']:checked").val();
	 qMRefSecurity=$("#managementRefCerBodiesFour").val();
	 certificationScheme = $("input[name='genReqCerBodiesFive']:checked").val();
	 qMRefCertifiScheme=$("#managementRefCerBodiesFive").val();	 
	 validCertification = $("input[name='genReqCerBodiesSix']:checked").val();
	 qMRefValidCertification=$("#managementRefCerBodiesSix").val();	 
	 preRequisites = $("input[name='genReqCerBodiesSeven']:checked").val();
	 qMRefPrerequisites=$("#managementRefCerBodiesSeven").val();
	 infoProvided = $("input[name='genReqCerBodiesEight']:checked").val();
	 qMRefInfoProvided=$("#managementRefCerBodiesEight").val();
	 handlingAppeals = $("input[name='genReqCerBodiesNine']:checked").val();
	 qMRefHandlingAppeals=$("#managementRefCerBodiesNine").val();
	 handlingComplaints = $("input[name='genReqCerBodiesTen']:checked").val();
	 qMRefHandlingComplaint=$("#managementRefCerBodiesTen").val();
	 orgStructure = $("input[name='structuralReqCerBodiesOne']:checked").val();
	 qMRefOrgStructure =$("#managementStrucRefCerBodiesOne").val();
	 formalRules = $("input[name='structuralReqCerBodiesTwo']:checked").val();
	 qMRefFormalRules=$("#managementStrucRefCerBodiesTwo").val();
	 safeguardingMechanism = $("input[name='structuralReqCerBodiesThree']:checked").val();
	 qMRefSafeguarding=$("#managementStrucRefCerBodiesThree").val();
	 managementProc = $("input[name='resourceReqCerBodiesOne']:checked").val();
	 qMRefManagementProc=$("#managementResourceRefCerBodiesOne").val();
	 contractExaminer = $("input[name='resourceReqCerBodiesTwo']:checked").val();
	 qMRefExaminer=$("#managementResourceRefCerBodiesTwo").val();
	 contractBody = $("input[name='resourceReqCerBodiesThree']:checked").val();
	 qMRefContractBody=$("#managementResourceRefCerBodiesThree").val();
	 docPolicies = $("input[name='resourceReqCerBodiesFour']:checked").val();
	 qMRefDocPolicies=$("#managementResourceRefCerBodiesFour").val();
	 specifiedStandard = $("input[name='processReqCerBodiesOne']:checked").val();
	 qMRefSpecified=$("#managementProcessRefCerBodiesOne").val();
	 applicationForm = $("input[name='processReqCerBodiesTwo']:checked").val();
	 qMRefAppliForm=$("#managementProcessRefCerBodiesTwo").val();
	 applicationReview = $("input[name='processReqCerBodiesThree']:checked").val();
	 qMRefAppliReview=$("#managementProcessRefCerBodiesThree").val();
	 assessmentPlan = $("input[name='processReqCerBodiesFour']:checked").val();
	 qMRefAssessmentPlan=$("#managementProcessRefCerBodiesFour").val();
	 examinationProcess = $("input[name='processReqCerBodiesFive']:checked").val();
	 qMRefExamProcess=$("#managementProcessRefCerBodiesFive").val();
	 certificationDecision = $("input[name='processReqCerBodiesSix']:checked").val();
	 qMRefCertiDecision=$("#managementProcessRefCerBodiesSix").val();
	 certificationDoc = $("input[name='processReqCerBodiesSeven']:checked").val();
	 qMRefCertiDoc=$("#managementProcessRefCerBodiesSeven").val();
	 useOfCertificates = $("input[name='processReqCerBodiesEight']:checked").val();
	 qMRefUseOfCertificate=$("#managementProcessRefCerBodiesEight").val();
	 suspension = $("input[name='processReqCerBodiesNine']:checked").val();
	 qMRefSuspension=$("#managementProcessRefCerBodiesNine").val();
	 processToReceive = $("input[name='processReqCerBodiesTen']:checked").val();
	 qMRefReceiveProcess=$("#managementProcessRefCerBodiesTen").val();
	 generalManage = $("input[name='managementSystemCerBodiesReqOne']:checked").val();
	 qMRefGeneral=$("#managementSystemCerBodiesRefOne").val();
	 docControl = $("input[name='managementSystemCerBodiesReqTwo']:checked").val();
	 qMRefDocControl=$("#managementSystemCerBodiesRefTwo").val();
	 recordControl = $("input[name='managementSystemCerBodiesReqThree']:checked").val();
	 qMRefRecControl=$("#managementSystemCerBodiesRefThree").val();
	 manageReview = $("input[name='managementSystemCerBodiesReqFour']:checked").val();
	 qMRefManageReview=$("#managementSystemCerBodiesRefFour").val();
	 internalAudit = $("input[name='managementSystemCerBodiesReqFive']:checked").val();
	 qMRefInternal=$("#managementSystemCerBodiesRefFive").val();
	 correctiveAction = $("input[name='managementSystemCerBodiesReqSix']:checked").val();
	 qMRefCorrective=$("#managementSystemCerBodiesRefSix").val();
	 preventiveAction = $("input[name='managementSystemCerBodiesReqSeven']:checked").val();
	 qMRefPreventive=$("#managementSystemCerBodiesRefSeven").val();
	 docInKeeping = $("input[name='managementSystemCerBodiesBReqOne']:checked").val();
	 qMRefDocInKeeping=$("#managementSystemCerBodiesBRefOne").val();
	 janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${addAccCerBodiesManagementSystemReq}",
					data : {
						"<portlet:namespace/>optionFollow" : optionFollow,
						"<portlet:namespace/>certiAgreement" : certiAgreement,
						"<portlet:namespace/>qMRefCertiAgreement" : qMRefCertiAgreement,
						"<portlet:namespace/>riskAssessment" : riskAssessment,
						"<portlet:namespace/>qMRefRisk" : qMRefRisk,
						"<portlet:namespace/>confidentiality" : confidentiality,
						"<portlet:namespace/>qMRefConfidentiality" : qMRefConfidentiality,
						"<portlet:namespace/>security" : security,
						"<portlet:namespace/>qMRefSecurity" : qMRefSecurity,
						"<portlet:namespace/>certificationScheme" : certificationScheme,
						"<portlet:namespace/>qMRefCertifiScheme" : qMRefCertifiScheme,
						"<portlet:namespace/>validCertification" : validCertification,
						"<portlet:namespace/>qMRefValidCertification" : qMRefValidCertification,
						"<portlet:namespace/>preRequisites" : preRequisites,
						"<portlet:namespace/>qMRefPrerequisites" : qMRefPrerequisites,
						"<portlet:namespace/>infoProvided" : infoProvided,
						"<portlet:namespace/>qMRefInfoProvided" : qMRefInfoProvided,
						"<portlet:namespace/>handlingAppeals" : handlingAppeals,
						"<portlet:namespace/>qMRefHandlingAppeals" : qMRefHandlingAppeals,
						"<portlet:namespace/>handlingComplaints" : handlingComplaints,
						"<portlet:namespace/>qMRefHandlingComplaint" : qMRefHandlingComplaint,
						"<portlet:namespace/>orgStructure" : orgStructure,
						"<portlet:namespace/>qMRefOrgStructure" : qMRefOrgStructure,
						"<portlet:namespace/>formalRules" : formalRules,
						"<portlet:namespace/>qMRefFormalRules" : qMRefFormalRules,
						"<portlet:namespace/>safeguardingMechanism" : safeguardingMechanism,
						"<portlet:namespace/>qMRefSafeguarding" : qMRefSafeguarding,
						"<portlet:namespace/>managementProc" : managementProc,
						"<portlet:namespace/>qMRefManagementProc" : qMRefManagementProc,
						"<portlet:namespace/>contractExaminer" : contractExaminer,
						"<portlet:namespace/>qMRefExaminer" : qMRefExaminer,
						"<portlet:namespace/>contractBody" : contractBody,
						"<portlet:namespace/>qMRefContractBody" : qMRefContractBody,
						"<portlet:namespace/>docPolicies" : docPolicies,
						"<portlet:namespace/>qMRefDocPolicies" : qMRefDocPolicies,
						"<portlet:namespace/>specifiedStandard" : specifiedStandard,
						"<portlet:namespace/>qMRefSpecified" : qMRefSpecified,
						"<portlet:namespace/>applicationForm" : applicationForm,
						"<portlet:namespace/>qMRefAppliForm" : qMRefAppliForm,
						"<portlet:namespace/>applicationReview" : applicationReview,
						"<portlet:namespace/>qMRefAppliReview" : qMRefAppliReview,
						"<portlet:namespace/>assessmentPlan" : assessmentPlan,
						"<portlet:namespace/>qMRefAssessmentPlan" : qMRefAssessmentPlan,
						"<portlet:namespace/>examinationProcess" : examinationProcess,
						"<portlet:namespace/>qMRefExamProcess" : qMRefExamProcess,
						"<portlet:namespace/>certificationDecision" : certificationDecision,
						"<portlet:namespace/>qMRefCertiDecision" : qMRefCertiDecision,
						"<portlet:namespace/>certificationDoc" : certificationDoc,
						"<portlet:namespace/>qMRefCertiDoc" : qMRefCertiDoc,
						"<portlet:namespace/>useOfCertificates" : useOfCertificates,
						"<portlet:namespace/>qMRefUseOfCertificate" : qMRefUseOfCertificate,
						"<portlet:namespace/>suspension" : suspension,
						"<portlet:namespace/>qMRefSuspension" : qMRefSuspension,
						"<portlet:namespace/>processToReceive" : processToReceive,
						"<portlet:namespace/>qMRefReceiveProcess" : qMRefReceiveProcess,
						"<portlet:namespace/>generalManage" : generalManage,
						"<portlet:namespace/>qMRefGeneral" : qMRefGeneral,
						"<portlet:namespace/>docControl" : docControl,
						"<portlet:namespace/>qMRefDocControl" : qMRefDocControl,
						"<portlet:namespace/>recordControl" : recordControl,
						"<portlet:namespace/>qMRefRecControl" : qMRefRecControl,
						"<portlet:namespace/>manageReview" : manageReview,
						"<portlet:namespace/>qMRefManageReview" : qMRefManageReview,
						"<portlet:namespace/>internalAudit" : internalAudit,
						"<portlet:namespace/>qMRefInternal" : qMRefInternal,
						"<portlet:namespace/>correctiveAction" : correctiveAction,
						"<portlet:namespace/>qMRefCorrective" : qMRefCorrective,
						"<portlet:namespace/>preventiveAction" : preventiveAction,
						"<portlet:namespace/>qMRefPreventive" : qMRefPreventive,
						"<portlet:namespace/>docInKeeping" : docInKeeping,
						"<portlet:namespace/>qMRefDocInKeeping" : qMRefDocInKeeping,						
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						},
					success : function(data) {
					   var result = data.APP_DATA;
				      $("#janaacApplicationId").html(result["janaacApplicationId"]);
					uploadDocuments('managementRefCerBodiesAttach1',"cert 17024 man ref one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementRefCerBodiesAttach2',"cert 17024 man ref two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
					uploadDocuments('managementRefCerBodiesAttach3',"cert 17024 man ref three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementRefCerBodiesAttach4',"cert 17024 man ref four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
					uploadDocuments('managementRefCerBodiesAttach5',"cert 17024 man ref five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementRefCerBodiesAttach6',"cert 17024 man ref six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
					uploadDocuments('managementRefCerBodiesAttach7',"cert 17024 man ref seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementRefCerBodiesAttach8',"cert 17024 man struct eight",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
					uploadDocuments('managementRefCerBodiesAttach9',"cert 17024 man struct nine",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementRefCerBodiesAttach10',"cert 17024 man struct ten",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementStrucRefCerBodiesAttach1',"cert 17024 man struc one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementStrucRefCerBodiesAttach2',"cert 17024 man struc two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementStrucRefCerBodiesAttach3',"cert 17024 man struc three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceRefCerBodiesAttach1',"cert 17024 man resource one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceRefCerBodiesAttach2',"cert 17024 man resource two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceRefCerBodiesAttach3',"cert 17024 man resource three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceRefCerBodiesAttach4',"cert 17024 man resource four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementProcessRefCerBodiesAttach1',"cert 17024 man process one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementProcessRefCerBodiesAttach2',"cert 17024 man process two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementProcessRefCerBodiesAttach3',"cert 17024 man process three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementProcessRefCerBodiesAttach4',"cert 17024 man process four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementProcessRefCerBodiesAttach5',"cert 17024 man process five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementProcessRefCerBodiesAttach6',"cert 17024 man process six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementProcessRefCerBodiesAttach7',"cert 17024 man process seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementProcessRefCerBodiesAttach8',"cert 17024 man process eight",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementProcessRefCerBodiesAttach9',"cert 17024 man process nine",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementProcessRefCerBodiesAttach10',"cert 17024 man process ten",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementSystemCerBodiesRefAttach1',"cert 17024 man system one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementSystemCerBodiesRefAttach2',"cert 17024 man system two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementSystemCerBodiesRefAttach3',"cert 17024 man system three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementSystemCerBodiesRefAttach4',"cert 17024 man system four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementSystemCerBodiesRefAttach5',"cert 17024 man system five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementSystemCerBodiesRefAttach6',"cert 17024 man system six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementSystemCerBodiesRefAttach7',"cert 17024 man system seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementSystemCerBodiesBRefAttach1',"cert 17024 man requirement one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					},
					error : function(data) {
					},
				});
}
function accCertiBodiesOtherReq() {
	 applicationFees = $("input[name='otherFeeReqCerBodies']:checked").val();
	 insPaymentMethod=$("#otherFeePayMethodCerBodies").val();
	 applicantRepName=$("#applicantRepresentativeNameCerBodies").val();
	 applicantRepPosition=$("#applicantRepresentativePositionCerBodies").val();
	 signatureDate=$("#applicantRepresentativeDateCerBodies").val();
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
					uploadDocuments('applicantRepresentativeCerBodiesSignatureBtn',"cert 17024 second cat rep sign",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					},
					error : function(data) {
					},
				});
}
function accCertiBodiesScopeService(isSaveAndContinue) {
	cerIntrestedParties = $("#cerBodiesIntrestedParties").val();
   otherServices = $("input[name='cerBodiesOtherServices']:checked").val();
   otherServicesDescribe=$("#cerBodiesOtherServicesDescribe").val();
	establishedRelation = $("input[name='cerBodiesEstablishedRelation']:checked").val();
	establishedRelDesc=$("#cerBodiesEstablishedRelationDesc").val();
	clientService = $("input[name='cerBodiesClientService']:checked").val();
	orgAccredited= $("input[name='orgAccreditedAnotherAccreditationCerBodies']:checked").val();
	responsibleBody=$("#responsibleBodyAccreditationCerBodies").val();	 
	accExpDate=$("#accreditationExpDateCerBodies").val();
	certBodyScope=$("#certBodyScopeCerBodies").val();
	janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${addAccCerBodiesProductScopeService}",
					data : {
							"<portlet:namespace/>cerIntrestedParties" : cerIntrestedParties,
							"<portlet:namespace/>otherServices" : otherServices,
							"<portlet:namespace/>otherServicesDescribe" : otherServicesDescribe,
							"<portlet:namespace/>establishedRelation" : establishedRelation,
							"<portlet:namespace/>establishedRelDesc" : establishedRelDesc,
							"<portlet:namespace/>clientService" : clientService,
							 "<portlet:namespace/>orgAccredited" : orgAccredited,
							 "<portlet:namespace/>responsibleBody" : responsibleBody,
							 "<portlet:namespace/>accExpDate" : accExpDate,	
							 "<portlet:namespace/>certBodyScope" : certBodyScope,							
						     "<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						},
					success : function(data) {

						if(!isSaveAndContinue){
					applicantInfo();
				}

					},
					error : function(data) {
					},
				});
}		
/* function accCerBodyOrgPersonnel() {
	 internalStaffSize=$("#internalStaffSizeCerBodies").val();
	 auditorsNum=$("#auditorsNumCerBodies").val();
	 contractedPerNum=$("#contractedPerNumCerBodies").val();
	 bodyOutsource = $("input[name='cerBodiesBodyOutsource']:checked").val();
	 descSecurity=$("#descSecurityArrangementsCerBodies").val();
  	 janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${addAccCerBodyPersonnelResource}",
					data : {
						"<portlet:namespace/>internalStaffSize" : internalStaffSize,
						"<portlet:namespace/>auditorsNum" : auditorsNum,
						"<portlet:namespace/>contractedPerNum" : contractedPerNum,
						"<portlet:namespace/>bodyOutsource" : bodyOutsource,
						"<portlet:namespace/>descSecurity" : descSecurity,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						},
					success : function(data) {
					},
					error : function(data) {
					},
				});
} */
function accCertiBodyInformation(isSaveAndContinue) {
	describeMechanism=$("#describeMechanismCerBodies").val();
  	 janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${addAccCerBodyInformation}",
					data : {
						"<portlet:namespace/>describeMechanism" : describeMechanism,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						},
					success : function(data) {
						
						if(!isSaveAndContinue){
						applicantInfo();
	    	 		}
					},
					error : function(data) {
					},
				});
}
function accCerBodiesManagementSystemReq() {
	 optionFollow = $("input[name='managementImplementedWithOrgCerBodies']:checked").val();
	 certiAgreement =$("input[name='genReqCerBodiesOne']:checked").val();
	 qMRefCertiAgreement=$("#managementRefCerBodiesOne").val();
	 riskAssessment = $("input[name='genReqCerBodiesTwo']:checked").val();
	 qMRefRisk=$("#managementRefCerBodiesTwo").val();
	 confidentiality = $("input[name='genReqCerBodiesThree']:checked").val();
	 qMRefConfidentiality=$("#managementRefCerBodiesThree").val();
	 security = $("input[name='genReqCerBodiesFour']:checked").val();
	 qMRefSecurity=$("#managementRefCerBodiesFour").val();
	 certificationScheme = $("input[name='genReqCerBodiesFive']:checked").val();
	 qMRefCertifiScheme=$("#managementRefCerBodiesFive").val();	 
	 validCertification = $("input[name='genReqCerBodiesSix']:checked").val();
	 qMRefValidCertification=$("#managementRefCerBodiesSix").val();	 
	 preRequisites = $("input[name='genReqCerBodiesSeven']:checked").val();
	 qMRefPrerequisites=$("#managementRefCerBodiesSeven").val();
	 infoProvided = $("input[name='genReqCerBodiesEight']:checked").val();
	 qMRefInfoProvided=$("#managementRefCerBodiesEight").val();
	 handlingAppeals = $("input[name='genReqCerBodiesNine']:checked").val();
	 qMRefHandlingAppeals=$("#managementRefCerBodiesNine").val();
	 handlingComplaints = $("input[name='genReqCerBodiesTen']:checked").val();
	 qMRefHandlingComplaint=$("#managementRefCerBodiesTen").val();
	 orgStructure = $("input[name='structuralReqCerBodiesOne']:checked").val();
	 qMRefOrgStructure =$("#managementStrucRefCerBodiesOne").val();
	 formalRules = $("input[name='structuralReqCerBodiesTwo']:checked").val();
	 qMRefFormalRules=$("#managementStrucRefCerBodiesTwo").val();
	 safeguardingMechanism = $("input[name='structuralReqCerBodiesThree']:checked").val();
	 qMRefSafeguarding=$("#managementStrucRefCerBodiesThree").val();
	 managementProc = $("input[name='resourceReqCerBodiesOne']:checked").val();
	 qMRefManagementProc=$("#managementResourceRefCerBodiesOne").val();
	 contractExaminer = $("input[name='resourceReqCerBodiesTwo']:checked").val();
	 qMRefExaminer=$("#managementResourceRefCerBodiesTwo").val();
	 contractBody = $("input[name='resourceReqCerBodiesThree']:checked").val();
	 qMRefContractBody=$("#managementResourceRefCerBodiesThree").val();
	 docPolicies = $("input[name='resourceReqCerBodiesFour']:checked").val();
	 qMRefDocPolicies=$("#managementResourceRefCerBodiesFour").val();
	 specifiedStandard = $("input[name='processReqCerBodiesOne']:checked").val();
	 qMRefSpecified=$("#managementProcessRefCerBodiesOne").val();
	 applicationForm = $("input[name='processReqCerBodiesTwo']:checked").val();
	 qMRefAppliForm=$("#managementProcessRefCerBodiesTwo").val();
	 applicationReview = $("input[name='processReqCerBodiesThree']:checked").val();
	 qMRefAppliReview=$("#managementProcessRefCerBodiesThree").val();
	 assessmentPlan = $("input[name='processReqCerBodiesFour']:checked").val();
	 qMRefAssessmentPlan=$("#managementProcessRefCerBodiesFour").val();
	 examinationProcess = $("input[name='processReqCerBodiesFive']:checked").val();
	 qMRefExamProcess=$("#managementProcessRefCerBodiesFive").val();
	 certificationDecision = $("input[name='processReqCerBodiesSix']:checked").val();
	 qMRefCertiDecision=$("#managementProcessRefCerBodiesSix").val();
	 certificationDoc = $("input[name='processReqCerBodiesSeven']:checked").val();
	 qMRefCertiDoc=$("#managementProcessRefCerBodiesSeven").val();
	 useOfCertificates = $("input[name='processReqCerBodiesEight']:checked").val();
	 qMRefUseOfCertificate=$("#managementProcessRefCerBodiesEight").val();
	 suspension = $("input[name='processReqCerBodiesNine']:checked").val();
	 qMRefSuspension=$("#managementProcessRefCerBodiesNine").val();
	 processToReceive = $("input[name='processReqCerBodiesTen']:checked").val();
	 qMRefReceiveProcess=$("#managementProcessRefCerBodiesTen").val();
	 generalManage = $("input[name='managementSystemCerBodiesReqOne']:checked").val();
	 qMRefGeneral=$("#managementSystemCerBodiesRefOne").val();
	 docControl = $("input[name='managementSystemCerBodiesReqTwo']:checked").val();
	 qMRefDocControl=$("#managementSystemCerBodiesRefTwo").val();
	 recordControl = $("input[name='managementSystemCerBodiesReqThree']:checked").val();
	 qMRefRecControl=$("#managementSystemCerBodiesRefThree").val();
	 manageReview = $("input[name='managementSystemCerBodiesReqFour']:checked").val();
	 qMRefManageReview=$("#managementSystemCerBodiesRefFour").val();
	 internalAudit = $("input[name='managementSystemCerBodiesReqFive']:checked").val();
	 qMRefInternal=$("#managementSystemCerBodiesRefFive").val();
	 correctiveAction = $("input[name='managementSystemCerBodiesReqSix']:checked").val();
	 qMRefCorrective=$("#managementSystemCerBodiesRefSix").val();
	 preventiveAction = $("input[name='managementSystemCerBodiesReqSeven']:checked").val();
	 qMRefPreventive=$("#managementSystemCerBodiesRefSeven").val();
	 docInKeeping = $("input[name='managementSystemCerBodiesBReqOne']:checked").val();
	 qMRefDocInKeeping=$("#managementSystemCerBodiesBRefOne").val();
	 janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${addAccCerBodiesManagementSystemReq}",
					data : {
						"<portlet:namespace/>optionFollow" : optionFollow,
						"<portlet:namespace/>certiAgreement" : certiAgreement,
						"<portlet:namespace/>qMRefCertiAgreement" : qMRefCertiAgreement,
						"<portlet:namespace/>riskAssessment" : riskAssessment,
						"<portlet:namespace/>qMRefRisk" : qMRefRisk,
						"<portlet:namespace/>confidentiality" : confidentiality,
						"<portlet:namespace/>qMRefConfidentiality" : qMRefConfidentiality,
						"<portlet:namespace/>security" : security,
						"<portlet:namespace/>qMRefSecurity" : qMRefSecurity,
						"<portlet:namespace/>certificationScheme" : certificationScheme,
						"<portlet:namespace/>qMRefCertifiScheme" : qMRefCertifiScheme,
						"<portlet:namespace/>validCertification" : validCertification,
						"<portlet:namespace/>qMRefValidCertification" : qMRefValidCertification,
						"<portlet:namespace/>preRequisites" : preRequisites,
						"<portlet:namespace/>qMRefPrerequisites" : qMRefPrerequisites,
						"<portlet:namespace/>infoProvided" : infoProvided,
						"<portlet:namespace/>qMRefInfoProvided" : qMRefInfoProvided,
						"<portlet:namespace/>handlingAppeals" : handlingAppeals,
						"<portlet:namespace/>qMRefHandlingAppeals" : qMRefHandlingAppeals,
						"<portlet:namespace/>handlingComplaints" : handlingComplaints,
						"<portlet:namespace/>qMRefHandlingComplaint" : qMRefHandlingComplaint,
						"<portlet:namespace/>orgStructure" : orgStructure,
						"<portlet:namespace/>qMRefOrgStructure" : qMRefOrgStructure,
						"<portlet:namespace/>formalRules" : formalRules,
						"<portlet:namespace/>qMRefFormalRules" : qMRefFormalRules,
						"<portlet:namespace/>safeguardingMechanism" : safeguardingMechanism,
						"<portlet:namespace/>qMRefSafeguarding" : qMRefSafeguarding,
						"<portlet:namespace/>managementProc" : managementProc,
						"<portlet:namespace/>qMRefManagementProc" : qMRefManagementProc,
						"<portlet:namespace/>contractExaminer" : contractExaminer,
						"<portlet:namespace/>qMRefExaminer" : qMRefExaminer,
						"<portlet:namespace/>contractBody" : contractBody,
						"<portlet:namespace/>qMRefContractBody" : qMRefContractBody,
						"<portlet:namespace/>docPolicies" : docPolicies,
						"<portlet:namespace/>qMRefDocPolicies" : qMRefDocPolicies,
						"<portlet:namespace/>specifiedStandard" : specifiedStandard,
						"<portlet:namespace/>qMRefSpecified" : qMRefSpecified,
						"<portlet:namespace/>applicationForm" : applicationForm,
						"<portlet:namespace/>qMRefAppliForm" : qMRefAppliForm,
						"<portlet:namespace/>applicationReview" : applicationReview,
						"<portlet:namespace/>qMRefAppliReview" : qMRefAppliReview,
						"<portlet:namespace/>assessmentPlan" : assessmentPlan,
						"<portlet:namespace/>qMRefAssessmentPlan" : qMRefAssessmentPlan,
						"<portlet:namespace/>examinationProcess" : examinationProcess,
						"<portlet:namespace/>qMRefExamProcess" : qMRefExamProcess,
						"<portlet:namespace/>certificationDecision" : certificationDecision,
						"<portlet:namespace/>qMRefCertiDecision" : qMRefCertiDecision,
						"<portlet:namespace/>certificationDoc" : certificationDoc,
						"<portlet:namespace/>qMRefCertiDoc" : qMRefCertiDoc,
						"<portlet:namespace/>useOfCertificates" : useOfCertificates,
						"<portlet:namespace/>qMRefUseOfCertificate" : qMRefUseOfCertificate,
						"<portlet:namespace/>suspension" : suspension,
						"<portlet:namespace/>qMRefSuspension" : qMRefSuspension,
						"<portlet:namespace/>processToReceive" : processToReceive,
						"<portlet:namespace/>qMRefReceiveProcess" : qMRefReceiveProcess,
						"<portlet:namespace/>generalManage" : generalManage,
						"<portlet:namespace/>qMRefGeneral" : qMRefGeneral,
						"<portlet:namespace/>docControl" : docControl,
						"<portlet:namespace/>qMRefDocControl" : qMRefDocControl,
						"<portlet:namespace/>recordControl" : recordControl,
						"<portlet:namespace/>qMRefRecControl" : qMRefRecControl,
						"<portlet:namespace/>manageReview" : manageReview,
						"<portlet:namespace/>qMRefManageReview" : qMRefManageReview,
						"<portlet:namespace/>internalAudit" : internalAudit,
						"<portlet:namespace/>qMRefInternal" : qMRefInternal,
						"<portlet:namespace/>correctiveAction" : correctiveAction,
						"<portlet:namespace/>qMRefCorrective" : qMRefCorrective,
						"<portlet:namespace/>preventiveAction" : preventiveAction,
						"<portlet:namespace/>qMRefPreventive" : qMRefPreventive,
						"<portlet:namespace/>docInKeeping" : docInKeeping,
						"<portlet:namespace/>qMRefDocInKeeping" : qMRefDocInKeeping,						
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						},
					success : function(data) {
					   var result = data.APP_DATA;
				      $("#janaacApplicationId").html(result["janaacApplicationId"]);
					uploadDocuments('managementRefCerBodiesAttach1',"cert 17024 man ref one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementRefCerBodiesAttach2',"cert 17024 man ref two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
					uploadDocuments('managementRefCerBodiesAttach3',"cert 17024 man ref three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementRefCerBodiesAttach4',"cert 17024 man ref four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
					uploadDocuments('managementRefCerBodiesAttach5',"cert 17024 man ref five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementRefCerBodiesAttach6',"cert 17024 man ref six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
					uploadDocuments('managementRefCerBodiesAttach7',"cert 17024 man ref seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementRefCerBodiesAttach8',"cert 17024 man struct eight",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
					uploadDocuments('managementRefCerBodiesAttach9',"cert 17024 man struct nine",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementRefCerBodiesAttach10',"cert 17024 man struct ten",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementStrucRefCerBodiesAttach1',"cert 17024 man struc one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementStrucRefCerBodiesAttach2',"cert 17024 man struc two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementStrucRefCerBodiesAttach3',"cert 17024 man struc three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceRefCerBodiesAttach1',"cert 17024 man resource one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceRefCerBodiesAttach2',"cert 17024 man resource two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceRefCerBodiesAttach3',"cert 17024 man resource three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceRefCerBodiesAttach4',"cert 17024 man resource four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementProcessRefCerBodiesAttach1',"cert 17024 man process one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementProcessRefCerBodiesAttach2',"cert 17024 man process two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementProcessRefCerBodiesAttach3',"cert 17024 man process three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementProcessRefCerBodiesAttach4',"cert 17024 man process four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementProcessRefCerBodiesAttach5',"cert 17024 man process five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementProcessRefCerBodiesAttach6',"cert 17024 man process six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementProcessRefCerBodiesAttach7',"cert 17024 man process seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementProcessRefCerBodiesAttach8',"cert 17024 man process eight",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementProcessRefCerBodiesAttach9',"cert 17024 man process nine",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementProcessRefCerBodiesAttach10',"cert 17024 man process ten",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementSystemCerBodiesRefAttach1',"cert 17024 man system one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementSystemCerBodiesRefAttach2',"cert 17024 man system two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementSystemCerBodiesRefAttach3',"cert 17024 man system three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementSystemCerBodiesRefAttach4',"cert 17024 man system four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementSystemCerBodiesRefAttach5',"cert 17024 man system five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementSystemCerBodiesRefAttach6',"cert 17024 man system six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementSystemCerBodiesRefAttach7',"cert 17024 man system seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementSystemCerBodiesBRefAttach1',"cert 17024 man requirement one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					},
					error : function(data) {
					},
				});
}
function accCertiBodiesOtherReq() {
	 applicationFees = $("input[name='otherFeeReqCerBodies']:checked").val();
	 insPaymentMethod=$("#otherFeePayMethodCerBodies").val();
	 applicantRepName=$("#applicantRepresentativeNameCerBodies").val();
	 applicantRepPosition=$("#applicantRepresentativePositionCerBodies").val();
	 signatureDate=$("#applicantRepresentativeDateCerBodies").val();
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
					},
					error : function(data) {
					},
				});
}
</script>