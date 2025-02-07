<%@ include file="../init.jsp" %>
<script>
function accCerBodiesApplicationInfo(isSaveAndContinue) {
		applicantName=$("#applicantNameCertification").val();
		applicantAddress=$("#applicantAddressCertification").val();
		applicantTelephone=$("#applicantTelephoneCertification").val();
		applicantFaxNo=$("#applicantFaxCertification").val();
		applicantWebsite=$("#applicantWebsiteCertification").val();
		certificationName=$("#certificationName").val();
		certiAddress=$("#certificationAddress").val();
		personnelName=$("#personnelNameCertification").val();
		personnelEmail=$("#personnelEmailCertification").val();
		personnelContactName=$("#contactPersonName").val();
		personnelContactEmail=$("#contactPersonEmail").val();
		personnelFMName=$("#financialManagerName").val();
		personnelFMEmail=$("#financialManagerEmail").val();
		accreditationRequest=$("input[name='accreditationRequestCertification']:checked").val();
		managementSystem=$("input[name='managementSystem']:checked").val();
		specifyOther=$("#specifyOtherManagementSystem").val();
		listOfStandard=$("#listOfStandard").val();
		authorizedPersonnelName=$("#authorizedPersonnelManagementName").val();
		authorizedPersonnelPos=$("#authorizedPersonnelManagementPosition").val();
		authorizedPersonnelDate=$("#authorizedPersonnelManagementDate").val();
		janaacApplicationId = $("#janaacApplicationId").val();
		submitForm= true;
		if(!isSaveAndContinue){
			if(!authorizedPersonnelName){
				$("#authorizedPersonnelManagementNameValidation").removeClass("hide");
				$("#authorizedPersonnelManagementName").focus();
				submitForm= false;
			}else{
				$("#authorizedPersonnelManagementNameValidation").addClass("hide");
			}
			if(!applicantName){
				$("#applicantNameCertificationValidation").removeClass("hide");
				$("#applicantNameCertification").focus();
				submitForm= false;
			}else{
				$("#applicantNameCertificationValidation").addClass("hide");
			}
		}
		if(submitForm){
			$.ajax({
				type : "POST",
				url : "${addAccCerBodiesApplicationInfo}",
				data : {
					"<portlet:namespace/>applicantName" : applicantName,
					"<portlet:namespace/>applicantAddress" : applicantAddress,
					"<portlet:namespace/>applicantTelephone" : applicantTelephone,
					"<portlet:namespace/>applicantFaxNo" : applicantFaxNo,
					"<portlet:namespace/>applicantWebsite" : applicantWebsite,
					"<portlet:namespace/>certificationName" : certificationName,
					"<portlet:namespace/>certiAddress" : certiAddress,
					"<portlet:namespace/>personnelName" : personnelName,
					"<portlet:namespace/>personnelEmail" : personnelEmail,
					"<portlet:namespace/>personnelContactName" : personnelContactName,
					"<portlet:namespace/>personnelContactEmail" : personnelContactEmail,
					"<portlet:namespace/>personnelFMName" : personnelFMName,
					"<portlet:namespace/>personnelFMEmail" : personnelFMEmail,
					"<portlet:namespace/>accreditationRequest" : accreditationRequest,
					"<portlet:namespace/>managementSystem" : managementSystem,
					"<portlet:namespace/>specifyOther" : specifyOther,
					"<portlet:namespace/>listOfStandard" : listOfStandard,
					"<portlet:namespace/>authorizedPersonnelName" : authorizedPersonnelName,
					"<portlet:namespace/>authorizedPersonnelPos" : authorizedPersonnelPos,
					"<portlet:namespace/>authorizedPersonnelDate" : authorizedPersonnelDate,
					"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
					},
				success : function(data) {
					if(!isSaveAndContinue){
						applicantInfo();
						addPersonResponsibleCerDetail();
					}
					var result = data.APP_DATA;
					$("#janaacApplicationId").html(result["janaacApplicationId"]);
					uploadDocuments('authorizedPersonnelManagementBtn',"Signature of Authorized Personnel Certfi Bodies",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
					uploadDocuments('companyStampManagementBtn',"Company Seals Certfi Bodies",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
					$("#janaacFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				},
				error : function(data) {
				},
			});
		}
	 }

function accCertificationBodiesGeneral(isSaveAndContinue) {
	cerLegalEntity = $("input[name='certificationLegalEntity']:checked").val();
	cerLegalStatusEntity=$("#certificationLegalStatusEntity").val();
	cerMajorIncomeSources=$("#incomeMajorSources").val();
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
function accCerBodiesScopeService(isSaveAndContinue) {
	 var certificationStandards = new Array();
	  $("input:checkbox[name=certificationStandard]:checked").each(function () {
		  certificationStandards.push($(this).val());
	 });	
   var certificationStandard= certificationStandards.toString();
    expertiseField1 = $("#expertiseField1").val();
    expertiseField2 = $("#expertiseField2").val();
    expertiseField3 = $("#expertiseField3").val();
    expertiseField4 = $("#expertiseField4").val();
    expertiseField5 = $("#expertiseField5").val();
    expertiseField6 = $("#expertiseField6").val();
    expertiseField7 = $("#expertiseField7").val();
    expertiseField8 = $("#expertiseField8").val();
    expertiseField9 = $("#expertiseField9").val();
    expertiseField10 = $("#expertiseField10").val();
    expertiseField11 = $("#expertiseField11").val();
    expertiseField12 = $("#expertiseField12").val();
    expertiseField13 = $("#expertiseField13").val();
    expertiseField14 = $("#expertiseField14").val();
    cerIntrestedParties = $("#certificationIntrestedParties").val();
    otherServices = $("input[name='certificationOtherServices']:checked").val();
    otherServicesDescribe=$("#certificationOtherServicesDescribe").val();
	establishedRelation = $("input[name='certificationEstablishedRelation']:checked").val();
	establishedRelDesc=$("#certificationEstablishedRelationDesc").val();
	clientService = $("input[name='certificationClientService']:checked").val();
	certificationCerBody = $("input[name='certificationForCerBodyService']:checked").val();
 	orgAccredited= $("input[name='orgAccreditedAnotherAccreditation']:checked").val();
 	responsibleBody=$("#responsibleBodyAccreditation").val();	 
 	accExpDate=$("#accreditationExpDate").val();
 	certBodyScope=$("#certBodyScope").val();
	janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${addAccCerBodiesScopeService}",
					data : {
						 "<portlet:namespace/>certificationStandard" : certificationStandard,
							"<portlet:namespace/>expertiseField1" : expertiseField1,
							"<portlet:namespace/>expertiseField2" : expertiseField2,
							"<portlet:namespace/>expertiseField3" : expertiseField3,
							"<portlet:namespace/>expertiseField4" : expertiseField4,
							"<portlet:namespace/>expertiseField5" : expertiseField5,
							"<portlet:namespace/>expertiseField6" : expertiseField6,
							"<portlet:namespace/>expertiseField7" : expertiseField7,
							"<portlet:namespace/>expertiseField8" : expertiseField8,
							"<portlet:namespace/>expertiseField9" : expertiseField9,
							"<portlet:namespace/>expertiseField10" : expertiseField10,
							"<portlet:namespace/>expertiseField11" : expertiseField11,
							"<portlet:namespace/>expertiseField12" : expertiseField12,
							"<portlet:namespace/>expertiseField13" : expertiseField13,							
						    "<portlet:namespace/>expertiseField14" : expertiseField14,
							"<portlet:namespace/>cerIntrestedParties" : cerIntrestedParties,
							"<portlet:namespace/>otherServices" : otherServices,
							"<portlet:namespace/>otherServicesDescribe" : otherServicesDescribe,
							"<portlet:namespace/>establishedRelation" : establishedRelation,
							"<portlet:namespace/>establishedRelDesc" : establishedRelDesc,
							"<portlet:namespace/>clientService" : clientService,
							"<portlet:namespace/>certificationCerBody" : certificationCerBody,
							 "<portlet:namespace/>orgAccredited" : orgAccredited,
							 "<portlet:namespace/>responsibleBody" : responsibleBody,
							 "<portlet:namespace/>accExpDate" : accExpDate,	
							 "<portlet:namespace/>certBodyScope" : certBodyScope,							
						     "<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						},
					success : function(data) {
						if(!isSaveAndContinue){
						applicantInfo();
						addRegisteredClientOrgDetail();
	    	 		}
					},
					error : function(data) {
					},
				});
}			
function accCerBodyPersonnelResource(isSaveAndContinue) {
	 internalStaffSize=$("#internalStaffSize").val();
	 auditorsNum=$("#auditorsNum").val();
	 contractedPerNum=$("#contractedPerNum").val();
	 bodyOutsource = $("input[name='certificationBodyOutsource']:checked").val();
	 descSecurity=$("#descSecurityArrangements").val();
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
						addStaffDetailCertification();
						addAuditorList();
						addOutsourceActNature();
						addActivityPerformLocations();
	    	 		}
					},
					error : function(data) {
					},
				});
}
function accCerBodyInformation(isSaveAndContinue) {
	describeMechanism=$("#describeMechanism").val();
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
function accCerBodiesManagementSysReq(isSaveAndContinue) {
	 optionFollow = $("input[name='managementImplementedWithOrg']:checked").val();
	 impartialityPolicy =$("input[name='genReqOne']:checked").val();
	 qMRefImpartiality=$("#managementRefOne").val();
	 riskAssessment = $("input[name='genReqTwo']:checked").val();
	 qMRefRisk=$("#managementRefTwo").val();
	 orgStructure = $("input[name='structuralReqOne']:checked").val();
	 qMRefOrgStruct=$("#managementStrucRefOne").val();
	 termsOfReference = $("input[name='structuralReqTwo']:checked").val();
	 qMRefTerms=$("#managementStrucRefTwo").val();
	 processForControl = $("input[name='structuralReqThree']:checked").val();
	 qMRefProcess=$("#managementStrucRefThree").val();
	 criteriaReq = $("input[name='resourceReqOne']:checked").val();
	 qMRefCriteria=$("#managementResourceRefOne").val();	 
	 initialCompetence = $("input[name='resourceReqTwo']:checked").val();
	 qMRefInitial=$("#managementResourceRefTwo").val();
	 selectingTraining = $("input[name='resourceReqThree']:checked").val();
	 qMRefSelecting=$("#managementResourceRefThree").val();
	 monitoringCompetence = $("input[name='resourceReqFour']:checked").val();
	 qMRefMonitoring=$("#managementResourceRefFour").val();
	 writtenAgreement = $("input[name='resourceReqFive']:checked").val();
	 qMRefWritten=$("#managementResourceRefFive").val();
	 descOfProcess = $("input[name='resourceReqSix']:checked").val();
	 qMRefDescProcess=$("#managementResourceRefSix").val();
	 processForMonitor = $("input[name='resourceReqSeven']:checked").val();
	 qMRefMonitorProcess=$("#managementResourceRefSeven").val();
	 auditProcess = $("input[name='informationReqOne']:checked").val();
	 qMRefAuditProcess=$("#managementInformationRefOne").val();
	 processGranting = $("input[name='informationReqTwo']:checked").val();
	 qMRefGranting=$("#managementInformationRefTwo").val();	 
	 managemntSys = $("input[name='informationReqThree']:checked").val();
	 qMRefManagemnt=$("#managementInformationRefThree").val();
	 useOfCertification = $("input[name='informationReqFour']:checked").val();
	 qMRefUseOfCerti=$("#managementInformationRefFour").val();
	 handlingReq = $("input[name='informationReqFive']:checked").val();
	 qMRefHandling=$("#managementInformationRefFive").val();
	 impartialityPolicies = $("input[name='informationReqSix']:checked").val();
	 qMRefImpartPolicy=$("#managementInformationRefSix").val();
	 provisionInform = $("input[name='informationReqSeven']:checked").val();
	 qMRefProvision=$("#managementInformationRefSeven").val();
	 certificationDoc = $("input[name='informationReqEight']:checked").val();
	 qMRefCertification=$("#managementInformationRefEight").val();
	 rulesGoverning = $("input[name='informationReqNine']:checked").val();
	 qMRefGoverning=$("#managementInformationRefNine").val();
	 enforcableArrangements = $("input[name='informationReqTen']:checked").val();
	 qMRefEnforcable=$("#managementInformationRefTen").val();
	 ensureConfidential = $("input[name='informationReqEleven']:checked").val();
	 qMRefEnsureConfid=$("#managementInformationRefEleven").val();
	 informingMechanism = $("input[name='informationReqTwelve']:checked").val();
	 qMRefInforming=$("#managementInformationRefTwelve").val();
	 applicationProcess = $("input[name='processReqOne']:checked").val();
	 qMRefApplication=$("#managementProcessRefOne").val();
	 applicationReview = $("input[name='processReqTwo']:checked").val();
	 qMRefReview=$("#managementProcessRefTwo").val();
	 certificationCycle = $("input[name='processReqThree']:checked").val();
	 qMRefCertiCycle=$("#managementProcessRefThree").val();
	 auditTime = $("input[name='processReqFour']:checked").val();
	 qMRefAuditTime=$("#managementProcessRefFour").val();
	 samplingProgram = $("input[name='processReqFive']:checked").val();
	 qMRefSampling=$("#managementProcessRefFive").val();
	 auditPlanning = $("input[name='processReqSix']:checked").val();
	 qMRefPlanning=$("#managementProcessRefSix").val();
	 auditTeam = $("input[name='processReqSeven']:checked").val();
	 qMRefAuditTeam=$("#managementProcessRefSeven").val();
	 onSiteAudit = $("input[name='processReqEight']:checked").val();
	 qMRefonSiteAudit=$("#managementProcessRefEight").val();
	 auditReport = $("input[name='processReqNine']:checked").val();
	 qMRefAuditReport=$("#managementProcessRefNine").val();
	 correctiveActions = $("input[name='processReqTen']:checked").val();
	 qMRefCorrective=$("#managementProcessRefTen").val();
	 reviewPriorDecision = $("input[name='processReqEleven']:checked").val();
	 qMRefReviewPrior=$("#managementProcessRefEleven").val();
	 transferCertification = $("input[name='processReqTwelve']:checked").val();
	 qMRefTransfer=$("#managementProcessRefTwelve").val();
	 suspensionPolicies = $("input[name='processReqThirteen']:checked").val();
	 qMRefSuspension=$("#managementProcessRefThirteen").val();
	 suspensionProcedure = $("input[name='processReqFourteen']:checked").val();
	 qMRefSuspensionProc=$("#managementProcessRefFourteen").val();
	 decisionOnAppeals = $("input[name='processReqFifteen']:checked").val();
	 qMRefDecision=$("#managementProcessRefFifteen").val();
	 handlingComplaints  = $("input[name='processReqSixteen']:checked").val();
	 qMRefComplaints=$("#managementProcessRefSixteen").val();
	 recordRetentionPolicy = $("input[name='processReqSeventeen']:checked").val();
	 qMRefRetentionPolicy=$("#managementProcessRefSeventeen").val();
	 recordRetentionProc = $("input[name='processReqEighteen']:checked").val();
	 qMRefRetentionProc=$("#managementProcessRefEighteen").val();
	 manageSysPolicies = $("input[name='managementSystemReqOne']:checked").val();
	 qMRefPolicies=$("#managementSystemRefOne").val();
	 manageSysObjective = $("input[name='managementSystemReqTwo']:checked").val();
	 qMRefObjective=$("#managementSystemRefTwo").val();
	 manageSysManual = $("input[name='managementSystemReqThree']:checked").val();
	 qMRefManual=$("#managementSystemRefThree").val();
	 docControlProc = $("input[name='managementSystemReqFour']:checked").val();
	 qMRefDocControl=$("#managementSystemRefFour").val();
	 recControlProc = $("input[name='managementSystemReqFive']:checked").val();
	 qMRefRecControl=$("#managementSystemRefFive").val();
	 managementReview = $("input[name='managementSystemReqSix']:checked").val();
	 qMRefManagementRev=$("#managementSystemRefSix").val();
	 internalAudits = $("input[name='managementSystemReqSeven']:checked").val();
	 qMRefInternal=$("#managementSystemRefSeven").val();
	 identificationProc = $("input[name='managementSystemReqEight']:checked").val();
	 qMRefIdentification=$("#managementSystemRefEight").val();	 
	 qMSScopeB = $("input[name='managementSystemBReqOne']:checked").val();
	 qMRefQMSScopeB=$("#managementSystemBRefOne").val();
	 designDevB = $("input[name='managementSystemBReqTwo']:checked").val();
	 qMRefDesignB=$("#managementSystemBRefTwo").val();
	 interestedPartyNeedsB = $("input[name='managementSystemBReqThree']:checked").val();
	 qMRefInterestedB=$("#managementSystemBRefThree").val();
	 managementReviewB = $("input[name='managementSystemBReqFour']:checked").val();
	 qMRefmanagementReviewB=$("#managementSystemBRefFour").val();
	 janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${addAccCerBodiesManagementSysReq}",
					data : {
						 "<portlet:namespace/>optionFollow" : optionFollow,
							"<portlet:namespace/>impartialityPolicy" : impartialityPolicy,
							"<portlet:namespace/>qMRefImpartiality" : qMRefImpartiality,
							"<portlet:namespace/>riskAssessment" : riskAssessment,
							"<portlet:namespace/>qMRefRisk" : qMRefRisk,
							"<portlet:namespace/>orgStructure" : orgStructure,
							"<portlet:namespace/>qMRefOrgStruct" : qMRefOrgStruct,
							"<portlet:namespace/>termsOfReference" : termsOfReference,
							"<portlet:namespace/>qMRefTerms" : qMRefTerms,
							"<portlet:namespace/>processForControl" : processForControl,
							"<portlet:namespace/>qMRefProcess" : qMRefProcess,
							"<portlet:namespace/>criteriaReq" : criteriaReq,
							"<portlet:namespace/>qMRefCriteria" : qMRefCriteria,
							"<portlet:namespace/>initialCompetence" : initialCompetence,							
						    "<portlet:namespace/>qMRefInitial" : qMRefInitial,
							"<portlet:namespace/>selectingTraining" : selectingTraining,
							"<portlet:namespace/>qMRefSelecting" : qMRefSelecting,
							"<portlet:namespace/>monitoringCompetence" : monitoringCompetence,
							"<portlet:namespace/>qMRefMonitoring" : qMRefMonitoring,
							"<portlet:namespace/>writtenAgreement" : writtenAgreement,
							"<portlet:namespace/>qMRefWritten" : qMRefWritten,
							"<portlet:namespace/>descOfProcess" : descOfProcess,
							"<portlet:namespace/>qMRefDescProcess" : qMRefDescProcess,							
							"<portlet:namespace/>processForMonitor" : processForMonitor,
							"<portlet:namespace/>qMRefMonitorProcess" : qMRefMonitorProcess,
							"<portlet:namespace/>auditProcess" : auditProcess,
							"<portlet:namespace/>qMRefAuditProcess" : qMRefAuditProcess,
							"<portlet:namespace/>processGranting" : processGranting,
							"<portlet:namespace/>qMRefGranting" : qMRefGranting,
							"<portlet:namespace/>managemntSys" : managemntSys,							
							 "<portlet:namespace/>qMRefManagemnt" : qMRefManagemnt,
							 "<portlet:namespace/>useOfCertification" : useOfCertification,
							 "<portlet:namespace/>qMRefUseOfCerti" : qMRefUseOfCerti,
					   		 "<portlet:namespace/>handlingReq" : handlingReq,
							 "<portlet:namespace/>qMRefHandling" : qMRefHandling,
							 "<portlet:namespace/>impartialityPolicies" : impartialityPolicies,
							 "<portlet:namespace/>qMRefImpartPolicy" : qMRefImpartPolicy,
							 "<portlet:namespace/>provisionInform" : provisionInform,
							 "<portlet:namespace/>qMRefProvision" : qMRefProvision,
							 "<portlet:namespace/>certificationDoc" : certificationDoc,
							 "<portlet:namespace/>qMRefCertification" : qMRefCertification,	
							 "<portlet:namespace/>rulesGoverning" : rulesGoverning,	
							 "<portlet:namespace/>qMRefGoverning" : qMRefGoverning,	
							 "<portlet:namespace/>enforcableArrangements" : enforcableArrangements,	
							 "<portlet:namespace/>qMRefEnforcable" : qMRefEnforcable,	
							 "<portlet:namespace/>ensureConfidential" : ensureConfidential,	
							 "<portlet:namespace/>qMRefEnsureConfid" : qMRefEnsureConfid,	
							 "<portlet:namespace/>informingMechanism" : informingMechanism,	
							 "<portlet:namespace/>qMRefInforming" : qMRefInforming,	
							 "<portlet:namespace/>applicationProcess" : applicationProcess,	
							 "<portlet:namespace/>qMRefApplication" : qMRefApplication,	
							 "<portlet:namespace/>applicationReview" : applicationReview,								 
							 "<portlet:namespace/>qMRefReview" : qMRefReview,	
							 "<portlet:namespace/>certificationCycle" : certificationCycle,	
							 "<portlet:namespace/>qMRefCertiCycle" : qMRefCertiCycle,	
							 "<portlet:namespace/>auditTime" : auditTime,	
							 "<portlet:namespace/>qMRefAuditTime" : qMRefAuditTime,	
							 "<portlet:namespace/>samplingProgram" : samplingProgram,	
							 "<portlet:namespace/>qMRefSampling" : qMRefSampling,	
							 "<portlet:namespace/>auditPlanning" : auditPlanning,	
							 "<portlet:namespace/>qMRefPlanning" : qMRefPlanning,	
							 "<portlet:namespace/>auditTeam" : auditTeam,	
							 "<portlet:namespace/>qMRefAuditTeam" : qMRefAuditTeam,	
							 "<portlet:namespace/>onSiteAudit" : onSiteAudit,	
							 "<portlet:namespace/>qMRefonSiteAudit" : qMRefonSiteAudit,	
							 "<portlet:namespace/>auditReport" : auditReport,								 
							 "<portlet:namespace/>qMRefAuditReport" : qMRefAuditReport,	
							 "<portlet:namespace/>correctiveActions" : correctiveActions,	
							 "<portlet:namespace/>qMRefCorrective" : qMRefCorrective,	
							 "<portlet:namespace/>reviewPriorDecision" : reviewPriorDecision,	
							 "<portlet:namespace/>qMRefReviewPrior" : qMRefReviewPrior,	
							 "<portlet:namespace/>transferCertification" : transferCertification,	
							 "<portlet:namespace/>qMRefTransfer" : qMRefTransfer,	
							 "<portlet:namespace/>suspensionPolicies" : suspensionPolicies,	
							 "<portlet:namespace/>qMRefSuspension" : qMRefSuspension,	
							 "<portlet:namespace/>suspensionProcedure" : suspensionProcedure,	
							 "<portlet:namespace/>qMRefSuspensionProc" : qMRefSuspension,	
							 "<portlet:namespace/>decisionOnAppeals" : decisionOnAppeals,	
							 "<portlet:namespace/>qMRefDecision" : qMRefDecision,	
							 "<portlet:namespace/>handlingComplaints" : handlingComplaints,	
							 "<portlet:namespace/>qMRefComplaints" : qMRefComplaints,	
							 "<portlet:namespace/>recordRetentionPolicy" : recordRetentionPolicy,	
							 "<portlet:namespace/>qMRefRetentionPolicy" : qMRefRetentionPolicy,	
							 "<portlet:namespace/>recordRetentionProc" : recordRetentionProc,								 
							 "<portlet:namespace/>qMRefRetentionProc" : qMRefRetentionProc,	
							 "<portlet:namespace/>manageSysPolicies" : manageSysPolicies,	
							 "<portlet:namespace/>qMRefPolicies" : qMRefPolicies,	
							 "<portlet:namespace/>manageSysObjective" : manageSysObjective,	
							 "<portlet:namespace/>qMRefObjective" : qMRefObjective,	
							 "<portlet:namespace/>manageSysManual" : manageSysManual,	
							 "<portlet:namespace/>qMRefManual" : qMRefManual,	
							 "<portlet:namespace/>docControlProc" : docControlProc,	
							 "<portlet:namespace/>qMRefDocControl" : qMRefDocControl,	
							 "<portlet:namespace/>recControlProc" : recControlProc,	
							 "<portlet:namespace/>qMRefRecControl" : qMRefRecControl,	
							 "<portlet:namespace/>managementReview" : managementReview,	
							 "<portlet:namespace/>qMRefManagementRev" : qMRefManagementRev,	
							 "<portlet:namespace/>internalAudits" : internalAudits,	
							 "<portlet:namespace/>qMRefInternal" : qMRefInternal,	
							 "<portlet:namespace/>identificationProc" : identificationProc,	
							 "<portlet:namespace/>qMRefIdentification" : qMRefIdentification,	
							 "<portlet:namespace/>qMSScopeB" : qMSScopeB,	
							 "<portlet:namespace/>qMRefQMSScopeB" : qMRefQMSScopeB,	
							 "<portlet:namespace/>designDevB" : designDevB,								 
							 "<portlet:namespace/>qMRefDesignB" : qMRefDesignB,	
							 "<portlet:namespace/>interestedPartyNeedsB" : interestedPartyNeedsB,	
							 "<portlet:namespace/>qMRefInterestedB" : qMRefInterestedB,	
							 "<portlet:namespace/>managementReviewB" : managementReviewB,	
							 "<portlet:namespace/>qMRefmanagementReviewB" : qMRefmanagementReviewB,															
							 "<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						},
						async:false,
					success : function(data) {
						var result = data.APP_DATA;
			    $("#janaacApplicationId").html(result["janaacApplicationId"]);
				uploadDocuments('managementRefAttach1',"cert 17021 man ref one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementRefAttach2',"cert 17021 man ref two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
				uploadDocuments('managementStrucRefAttach1',"cert 17021 man struc one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementStrucRefAttach2',"cert 17021 man struc two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
				uploadDocuments('managementStrucRefAttach3',"cert 17021 man struc three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementResourceRefAttach1',"cert 17021 man resource one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
				uploadDocuments('managementResourceRefAttach2',"cert 17021 man resource two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementResourceRefAttach3',"cert 17021 man resource three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
				uploadDocuments('managementResourceRefAttach4',"cert 17021 man resource four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementResourceRefAttach5',"cert 17021 man resource five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementResourceRefAttach6',"cert 17021 man resource six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementResourceRefAttach7',"cert 17021 man resource seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementInformationRefAttach1',"cert 17021 man info one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementInformationRefAttach2',"cert 17021 man info two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementInformationRefAttach3',"cert 17021 man info three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementInformationRefAttach4',"cert 17021 man info four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementInformationRefAttach5',"cert 17021 man info five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementInformationRefAttach6',"cert 17021 man info six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementInformationRefAttach7',"cert 17021 man info seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementInformationRefAttach8',"cert 17021 man info eight",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementInformationRefAttach9',"cert 17021 man info nine",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementInformationRefAttach10',"cert 17021 man info ten",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementInformationRefAttach11',"cert 17021 man info eleven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementInformationRefAttach12',"cert 17021 man info twelev",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefAttach1',"cert 17021 man process one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefAttach2',"cert 17021 man process two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefAttach3',"cert 17021 man process three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefAttach4',"cert 17021 man process four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefAttach5',"cert 17021 man process five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefAttach6',"cert 17021 man process six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefAttach7',"cert 17021 man process seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefAttach8',"cert 17021 man process eight",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefAttach9',"cert 17021 man process nine",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefAttach10',"cert 17021 man process ten",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefAttach11',"cert 17021 man process eleven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefAttach12',"cert 17021 man process twelve",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefAttach13',"cert 17021 man process thirteen",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefAttach14',"cert 17021 man process fourteen",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefAttach15',"cert 17021 man process fivteen",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefAttach16',"cert 17021 man process sixteen",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefAttach17',"cert 17021 man process seventeen",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementProcessRefAttach18',"cert 17021 man process eighteen",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSystemRefAttach1',"cert 17021 man system ref one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSystemRefAttach2',"cert 17021 man system ref two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSystemRefAttach3',"cert 17021 man system ref three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSystemRefAttach4',"cert 17021 man system ref four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSystemRefAttach5',"cert 17021 man system ref five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSystemRefAttach6',"cert 17021 man system ref six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSystemRefAttach7',"cert 17021 man system ref seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSystemRefAttach8',"cert 17021 man system ref eight",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSystemBRefAttach1',"cert 17021 man system bref one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSystemBRefAttach2',"cert 17021 man system bref two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSystemBRefAttach3',"cert 17021 man system bref three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSystemBRefAttach4',"cert 17021 man system bref four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				if(!isSaveAndContinue){
						applicantInfo();
	    	 		}
			},
					error : function(data) {
					},
				});
}
function accCerBodiesOtherReq() {
	 applicationFees = $("input[name='otherFeeReq']:checked").val();
	 insPaymentMethod=$("#otherFeePayMethod").val();
	 applicantRepName=$("#applicantRepresentativeCerName").val();
	 applicantRepPosition=$("#applicantRepresentativeCerPosition").val();
	 signatureDate=$("#applicantRepresentativeCerDate").val();
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
		    uploadDocuments('applicantRepresentativeCerSignatureBtn',"Accre Certi Bodies 17021 representative signature",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
					},
					error : function(data) {
					},
				});
}
function accCerBodiesProductAppliInfo(isSaveAndContinue) {
	applicantName=$("#applicantNameCerProduct").val();
	applicantAddress=$("#applicantAddressCerProduct").val();
	applicantTelephone=$("#applicantTelephoneCerProduct").val();
	applicantFaxNo=$("#applicantFaxCerProduct").val();
	applicantWebsite=$("#applicantWebsiteCerProduct").val();
	laboratoryName=$("#cerProductName").val();
	laboratoryAddress=$("#cerProductAddress").val();
	personnelName=$("#personnelNameCerProduct").val();
	personnelEmail=$("#personnelEmailCerProduct").val();
	personnelQMName=$("#contactPersonNameCerProduct").val();
	personnelQMEmail=$("#contactPersonEmailCerProduct").val();
	personnelFMName=$("#financialManagerNameCerProduct").val();
	personnelFMEmail=$("#financialManagerEmailCerProduct").val();
	accreditationRequest=$("input[name='accreditationRequestCerProduct']:checked").val();
	authorizedPersonnelName=$("#authorizedPersonnelCerProductName").val();
	authorizedPersonnelPosition=$("#authorizedPersonnelCerProductPosition").val();
	authorizedPersonnelDate=$("#authorizedPersonnelCerProductDate").val();
	janaacApplicationId = $("#janaacApplicationId").val();
	submitForm= true;
	if(!isSaveAndContinue){
		if(!authorizedPersonnelName){
			$("#authorizedPersonnelCerProductNameValidation").removeClass("hide");
			$("#authorizedPersonnelCerProductName").focus();
			submitForm= false;
		}else{
			$("#authorizedPersonnelCerProductNameValidation").addClass("hide");
		}
		if(!applicantName){
			$("#applicantNameCertificationValidation").removeClass("hide");
			$("#applicantNameCerProduct").focus();
			submitForm= false;
		}else{
			$("#applicantNameCertificationValidation").addClass("hide");
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
				}
				var result = data.APP_DATA;
			    $("#janaacApplicationId").html(result["janaacApplicationId"]);
			    uploadDocuments('authorizedPersonnelCerProductBtn',"Accre Certi 17065 Signature Authorized Personnel",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
			    uploadDocuments('companyStampCerProductBtn',"Accre Certi 17065 Company Stamp",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
				$("#janaacFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			},
			error : function(data) {
			},
		});
	}
 }
function accCerBodiesProductGeneral(isSaveAndContinue) {
	cerLegalEntity = $("input[name='cerProductLegalEntity']:checked").val();
	cerLegalStatusEntity=$("#cerProductLegalStatusEntity").val();
	cerMajorIncomeSources=$("#incomeMajorSourcesCerProduct").val();
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
function accCerBodiesProductScopeService(isSaveAndContinue) {
	cerIntrestedParties = $("#cerProductIntrestedParties").val();
   otherServices = $("input[name='cerProductOtherServices']:checked").val();
   otherServicesDescribe=$("#cerProductOtherServicesDescribe").val();
	establishedRelation = $("input[name='cerProductEstablishedRelation']:checked").val();
	establishedRelDesc=$("#cerProEstablishedRelationDesc").val();
	clientService = $("input[name='cerProductClientService']:checked").val();
	orgAccredited= $("input[name='orgAccreditedAnotherAccreditationCerProduct']:checked").val();
	responsibleBody=$("#responsibleBodyAccreditationCerProduct").val();	 
	accExpDate=$("#accreditationExpDateCerProduct").val();
	certBodyScope=$("#certBodyScopeCerProduct").val();
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
						 addRegisteredClientOrgCerProductDetail();
	    	 		}
					},
					error : function(data) {
					},
				});
}		
function accCerBodyProductOrgPersonnel(isSaveAndContinue) {
	 internalStaffSize=$("#internalStaffSizePro").val();
	 auditorsNum=$("#auditorsNumPro").val();
	 contractedPerNum=$("#contractedPerNumPro").val();
	 bodyOutsource = $("input[name='CerProductBodyOutsource']:checked").val();
	 descSecurity=$("#descSecurityArrangementsPro").val();
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
						addStaffDetailCerProduct();
						addAuditorListCerProduct();
						addOutsourceActNatureCertProduct();
	    	 		}
					},
					error : function(data) {
					},
				});
}
function accCerBodyProductInformation(isSaveAndContinue) {
	describeMechanism=$("#describeMechanismCertProduct").val();
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
				}
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
</script>