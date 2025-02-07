<%@ include file="../init.jsp" %>
<script>
function accFDAThirdPartyAppliInfo(isSaveAndContinue) {
	applicantName=$("#applicantNameThirdParty").val();
	applicantAddress=$("#applicantAddressThirdParty").val();
	applicantTelephone=$("#applicantTelephoneThirdParty").val();
	applicantFaxNo=$("#applicantFaxThirdParty").val();
	applicantWebsite=$("#applicantWebsiteThirdParty").val();
	certificationName=$("#certificationNameThirdParty").val();
	certiAddress=$("#certAddressThirdParty").val();
	personnelName=$("#personnelNameThirdParty").val();
	personnelEmail=$("#personnelEmailThirdParty").val();
	personnelContactName=$("#contactPersonNameThirdParty").val();
	personnelContactEmail=$("#contactPersonEmailThirdParty").val();
	personnelFMName=$("#financialManagerNameThirdParty").val();
	personnelFMEmail=$("#financialManagerEmailThirdParty").val();
	accreditationRequest=$("input[name='accreditationRequestThirdParty']:checked").val();
	accFdaScheme=$("input[name='accreditationFdaScheme']:checked").val();
	specifyOther=$("#accreditationFdaSchemeOther").val();
	supplementaryCertificate=$("input[name='supplementaryCertificateStandard']:checked").val();	
	supplementaryOther=$("#supplementaryCertificateStandardOther").val();
	listOfStandard=$("#listOfStandardThirdParty").val();	
	authorizedPersonnelName=$("#authorizedPersonnelThirdPartyName").val();
	authorizedPersonnelPos=$("#authorizedPersonnelThirdPartyPosition").val();
	authorizedPersonnelDate=$("#authorizedPersonnelThirdPartyDate").val();
	janaacApplicationId = $("#janaacApplicationId").val();
	applicantNameThirdParty=$("#applicantNameThirdParty").val();
	authorizedPersonnelThirdPartyName=$("#authorizedPersonnelThirdPartyName").val();
	submitForm= true;
	if(!isSaveAndContinue){ 
	if(!applicantNameThirdParty){
			$("#applicantNameThirdPartyValidation").removeClass("hide");
			$("#applicantNameThirdParty").focus();
			submitForm= false;
		}else{
			$("#applicantNameThirdPartyValidation").addClass("hide");
		}
		if(!authorizedPersonnelThirdPartyName){
			$("#authorizedPersonnelThirdPartyNameValidation").removeClass("hide");
			$("#authorizedPersonnelThirdPartyName").focus();
			submitForm= false;
		}else{
			$("#authorizedPersonnelThirdPartyNameValidation").addClass("hide");
		}
	}
		if(submitForm){
	$.ajax({
		type : "POST",
		url : "${addAccThirdPartyAppliInfo}",
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
			"<portlet:namespace/>accFdaScheme" : accFdaScheme,
			"<portlet:namespace/>specifyOther" : specifyOther,
			"<portlet:namespace/>supplementaryCertificate" : supplementaryCertificate,
			"<portlet:namespace/>supplementaryOther" : supplementaryOther,			
			"<portlet:namespace/>listOfStandard" : listOfStandard,
			"<portlet:namespace/>authorizedPersonnelName" : authorizedPersonnelName,
			"<portlet:namespace/>authorizedPersonnelPos" : authorizedPersonnelPos,
			"<portlet:namespace/>authorizedPersonnelDate" : authorizedPersonnelDate,
			"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
			},
		success : function(data) {
			 uploadDocuments('authorizedPersonnelThirdPartyBtn',"Signature of Authorized Personnel Fda",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
			 uploadDocuments('companyStampThirdPartyBtn',"Application Company Stamp Fda",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
			$("#janaacFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			if(!isSaveAndContinue){
					 applicantInfo();
					 addPersonResponsibleThirdPartyDetail();
			    }
		},
		error : function(data) {
		},
	});
  }
}
function accFDAThirdPartyGeneral(isSaveAndContinue) {
	cerLegalEntity = $("input[name='thirdPartyLegalEntity']:checked").val();
	cerLegalStatusEntity=$("#thirdPartyLegalStatusEntity").val();
	cerMajorIncomeSources=$("#incomeMajorSourcesThirdParty").val();
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
function accFDAThirdPartyScopeService(isSaveAndContinue) {
	 var accreditationCategories = new Array();
	  $("input:checkbox[name=accreditationCategory]:checked").each(function () {
		  accreditationCategories.push($(this).val());
	 });	
  var accreditationCategory= accreditationCategories.toString();
  foodProduct1 = $("#foodProduct1").val();
  foodRegulation1 = $("#foodRegulation1").val();   
  foodProduct2 = $("#foodProduct2").val();
   foodRegulation2 = $("#foodRegulation2").val();   
   foodProduct3 = $("#foodProduct3").val();
   foodRegulation3 = $("#foodRegulation3").val();
   foodProduct4 = $("#foodProduct4").val();
   foodRegulation4 = $("#foodRegulation4").val();
   foodProduct5 = $("#foodProduct5").val();
   foodRegulation5 = $("#foodRegulation5").val();
   foodProduct6 = $("#foodProduct6").val();
   foodRegulation6 = $("#foodRegulation6").val();
   foodProduct7 = $("#foodProduct7").val();
   foodRegulation7 = $("#foodRegulation7").val();
   foodProduct8 = $("#foodProduct8").val();
   foodRegulation8 = $("#foodRegulation8").val();
   foodProduct9 = $("#foodProduct9").val();
   foodRegulation9 = $("#foodRegulation9").val();
   foodProduct10 = $("#foodProduct10").val();
   foodRegulation10 = $("#foodRegulation10").val();
   accCategoryOther = $("#accreditationCategoryOther").val();
   foodProduct11 = $("#foodProduct11").val();
   foodRegulation11 = $("#foodRegulation11").val();
   accCategoryOther12 = $("#accreditationCategoryOther12").val();   
   foodProduct12 = $("#foodProduct12").val();
   foodRegulation12 = $("#foodRegulation12").val();
   cerIntrestedParties = $("#intrestedPartiesThirdParty").val();
   otherServices = $("input[name='thirdPartyOtherServices']:checked").val();
   otherServicesDescribe=$("#thirdPartyOtherServicesDescribe").val();
	establishedRelation = $("input[name='thirdPartyEstablishedRelation']:checked").val();
	establishedRelDesc=$("#thirdPartyEstablishedRelationDesc").val();
	clientService = $("input[name='thirdPartyCertificationService']:checked").val();
	certificationCerBody = $("input[name='orgProvideCertificateThirdParty']:checked").val();
	orgAccredited= $("input[name='orgPreviouslyAccreditedThirdParty']:checked").val();
	responsibleBody=$("#responsibleBodyAccreditationThirdParty").val();	 
	accExpDate=$("#accreditationExpDateThirdParty").val();
	certBodyScope=$("#certBodyScopeThirdParty").val();
	janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${addAccFDAThirdPartyScopeService}",
					data : {
						 "<portlet:namespace/>accreditationCategory" : accreditationCategory,
							"<portlet:namespace/>foodProduct1" : foodProduct1,
							"<portlet:namespace/>foodRegulation1" : foodRegulation1,														
							"<portlet:namespace/>foodProduct2" : foodProduct2,
							"<portlet:namespace/>foodRegulation2" : foodRegulation2,							
							"<portlet:namespace/>foodProduct3" : foodProduct3,
							"<portlet:namespace/>foodRegulation3" : foodRegulation3,														
							"<portlet:namespace/>foodProduct4" : foodProduct4,
							"<portlet:namespace/>foodRegulation4" : foodRegulation4,														
							"<portlet:namespace/>foodProduct5" : foodProduct5,
							"<portlet:namespace/>foodRegulation5" : foodRegulation5,							
							"<portlet:namespace/>foodProduct6" : foodProduct6,
							"<portlet:namespace/>foodRegulation6" : foodRegulation6,														
							"<portlet:namespace/>foodProduct7" : foodProduct7,
							"<portlet:namespace/>foodRegulation7" : foodRegulation7,							
							"<portlet:namespace/>foodProduct8" : foodProduct8,
							"<portlet:namespace/>foodRegulation8" : foodRegulation8,							
							"<portlet:namespace/>foodProduct9" : foodProduct9,
							"<portlet:namespace/>foodRegulation9" : foodRegulation9,							
							"<portlet:namespace/>foodProduct10" : foodProduct10,
							"<portlet:namespace/>foodRegulation10" : foodRegulation10,							
							"<portlet:namespace/>accCategoryOther" : accCategoryOther,							
							"<portlet:namespace/>foodProduct11" : foodProduct11,
							"<portlet:namespace/>foodRegulation11" : foodRegulation11,							
							"<portlet:namespace/>accCategoryOther12" : accCategoryOther12,							
							"<portlet:namespace/>foodProduct12" : foodProduct12,
							"<portlet:namespace/>foodRegulation12" : foodRegulation12,							
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
					      addRegisteredClientOrgThirdPartyDetail();
			            }
					},
					error : function(data) {
					},
				});
}
function accThirdPersonnelResource(isSaveAndContinue) {
	 internalStaffSize=$("#internalStaffSizeThirdParty").val();
	 auditorsNum=$("#auditorsNumThirdParty").val();
	 contractedPerNum=$("#contractedPerNumThirdParty").val();
	 bodyOutsource = $("input[name='thirdPartyBodyOutsource']:checked").val();
	 descSecurity=$("#descSecurityArrangementsThirdParty").val();
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
						   addStaffDetailThirdParty();
						   addAuditorListThirdParty();
						   addOutsourceActNatureThirdParty();
						   addActivityPerformedLocThirdParty();
			           }

					},
					error : function(data) {
					},
				});
}
function accThirdPartyInformation(isSaveAndContinue) {
	describeMechanism=$("#describeMechanismThirdParty").val();
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
function accThirdPartyManagementSysReq(isSaveAndContinue) {
	 optionFollow = $("input[name='managementImplementedWithOrgThirdParty']:checked").val();
	 impartialityPolicy =$("input[name='impartialityThirdParty1']:checked").val();
	 qMRefImpartiality=$("#impartialityRefThirdParty1").val();
	 interestedPartyNeedsB =$("input[name='impartialityThirdParty2']:checked").val();
	 qMRefInterestedB=$("#impartialityRefThirdParty2").val();	 
	 riskAssessment = $("input[name='impartialityThirdParty3']:checked").val();
	 qMRefRisk=$("#impartialityRefThirdParty3").val();
	 managementReviewB = $("input[name='impartialityThirdParty4']:checked").val();
	 qMRefmanagementReviewB=$("#impartialityRefThirdParty4").val();
	 orgStructure = $("input[name='orgStructureThirdParty1']:checked").val();
	 qMRefOrgStruct=$("#orgStructureRefThirdParty1").val();
	 termsOfReference = $("input[name='orgStructureThirdParty2']:checked").val();
	 qMRefTerms=$("#orgStructureRefThirdParty2").val();
	 processForControl = $("input[name='orgStructureThirdParty3']:checked").val();
	 qMRefProcess=$("#orgStructureRefThirdParty3").val();
	 criteriaReq = $("input[name='resourcesThirdParty1']:checked").val();
	 qMRefCriteria=$("#resourcesRefThirdParty1").val();	 
	 initialCompetence = $("input[name='resourcesThirdParty2']:checked").val();
	 qMRefInitial=$("#resourcesRefThirdParty2").val();
	 selectingTraining = $("input[name='resourcesThirdParty3']:checked").val();
	 qMRefSelecting=$("#resourcesRefThirdParty3").val();
	 monitoringCompetence = $("input[name='resourcesThirdParty4']:checked").val();
	 qMRefMonitoring=$("#resourcesRefThirdParty4").val();
	 writtenAgreement = $("input[name='resourcesThirdParty5']:checked").val();
	 qMRefWritten=$("#resourcesRefThirdParty5").val();
	 descOfProcess = $("input[name='resourcesThirdParty6']:checked").val();
	 qMRefDescProcess=$("#resourcesRefThirdParty6").val();
	 processForMonitor = $("input[name='resourcesThirdParty7']:checked").val();
	 qMRefMonitorProcess=$("#resourcesRefThirdParty7").val();
	 designDevB = $("input[name='resourcesThirdParty8']:checked").val();
	 qMRefDesignB=$("#resourcesRefThirdParty8").val();
	 auditProcess = $("input[name='informationThirdParty1']:checked").val();
	 qMRefAuditProcess=$("#informationRefThirdParty1").val();
	 processGranting = $("input[name='informationThirdParty2']:checked").val();
	 qMRefGranting=$("#informationRefThirdParty2").val();	 
	 managemntSys = $("input[name='informationThirdParty3']:checked").val();
	 qMRefManagemnt=$("#informationRefThirdParty3").val();
	 useOfCertification = $("input[name='informationThirdParty4']:checked").val();
	 qMRefUseOfCerti=$("#informationRefThirdParty4").val();
	 handlingReq = $("input[name='informationThirdParty5']:checked").val();
	 qMRefHandling=$("#informationRefThirdParty5").val();
	 impartialityPolicies = $("input[name='informationThirdParty6']:checked").val();
	 qMRefImpartPolicy=$("#informationRefThirdParty6").val();
	 provisionInform = $("input[name='informationThirdParty7']:checked").val();
	 qMRefProvision=$("#informationRefThirdParty7").val();
	 certificationDoc = $("input[name='informationThirdParty8']:checked").val();
	 qMRefCertification=$("#informationRefThirdParty8").val();
	 rulesGoverning = $("input[name='informationThirdParty9']:checked").val();
	 qMRefGoverning=$("#informationRefThirdParty9").val();
	 enforcableArrangements = $("input[name='informationThirdParty10']:checked").val();
	 qMRefEnforcable=$("#informationRefThirdParty10").val();
	 ensureConfidential = $("input[name='informationThirdParty11']:checked").val();
	 qMRefEnsureConfid=$("#informationRefThirdParty11").val();
	 informingMechanism = $("input[name='informationThirdParty12']:checked").val();
	 qMRefInforming=$("#informationRefThirdParty12").val();
	 applicationProcess = $("input[name='cerProcessThirdParty1']:checked").val();
	 qMRefApplication=$("#cerProcessRefThirdParty1").val();
	 applicationReview = $("input[name='cerProcessThirdParty2']:checked").val();
	 qMRefReview=$("#cerProcessRefThirdParty2").val();
	 certificationCycle = $("input[name='cerProcessThirdParty3']:checked").val();
	 qMRefCertiCycle=$("#cerProcessRefThirdParty3").val();
	 auditTime = $("input[name='cerProcessThirdParty4']:checked").val();
	 qMRefAuditTime=$("#cerProcessRefThirdParty4").val();
	 samplingProgram = $("input[name='cerProcessThirdParty5']:checked").val();
	 qMRefSampling=$("#cerProcessRefThirdParty5").val();
	 auditPlanning = $("input[name='cerProcessThirdParty6']:checked").val();
	 qMRefPlanning=$("#cerProcessRefThirdParty6").val();
	 auditTeam = $("input[name='cerProcessThirdParty7']:checked").val();
	 qMRefAuditTeam=$("#cerProcessRefThirdParty7").val();
	 onSiteAudit = $("input[name='cerProcessThirdParty8']:checked").val();
	 qMRefonSiteAudit=$("#cerProcessRefThirdParty8").val();
	 auditReport = $("input[name='cerProcessThirdParty9']:checked").val();
	 qMRefAuditReport=$("#cerProcessRefThirdParty9").val();
	 correctiveActions = $("input[name='cerProcessThirdParty10']:checked").val();
	 qMRefCorrective=$("#cerProcessRefThirdParty10").val();
	 reviewPriorDecision = $("input[name='cerProcessThirdParty11']:checked").val();
	 qMRefReviewPrior=$("#cerProcessRefThirdParty11").val();
	 transferCertification = $("input[name='cerProcessThirdParty12']:checked").val();
	 qMRefTransfer=$("#cerProcessRefThirdParty12").val();
	 suspensionPolicies = $("input[name='cerProcessThirdParty13']:checked").val();
	 qMRefSuspension=$("#cerProcessRefThirdParty13").val();
	 suspensionProcedure = $("input[name='cerProcessThirdParty14']:checked").val();
	 qMRefSuspensionProc=$("#cerProcessRefThirdParty14").val();
	 decisionOnAppeals = $("input[name='cerProcessThirdParty15']:checked").val();
	 qMRefDecision=$("#cerProcessRefThirdParty15").val();
	 handlingComplaints  = $("input[name='cerProcessThirdParty16']:checked").val();
	 qMRefComplaints=$("#cerProcessRefThirdParty16").val();
	 recordRetentionPolicy = $("input[name='cerProcessThirdParty17']:checked").val();
	 qMRefRetentionPolicy=$("#cerProcessRefThirdParty17").val();
	 manageSysPolicies = $("input[name='managementSysThirdParty1']:checked").val();
	 qMRefPolicies=$("#managementSysRefThirdParty1").val();
	 manageSysObjective = $("input[name='managementSysThirdParty2']:checked").val();
	 qMRefObjective=$("#managementSysRefThirdParty2").val();
	 manageSysManual = $("input[name='managementSysThirdParty3']:checked").val();
	 qMRefManual=$("#managementSysRefThirdParty3").val();
	 docControlProc = $("input[name='managementSysThirdParty4']:checked").val();
	 qMRefDocControl=$("#managementSysRefThirdParty4").val();
	 recControlProc = $("input[name='managementSysThirdParty5']:checked").val();
	 qMRefRecControl=$("#managementSysRefThirdParty5").val();
	 managementReview = $("input[name='managementSysThirdParty6']:checked").val();
	 qMRefManagementRev=$("#managementSysRefThirdParty6").val();
	 internalAudits = $("input[name='managementSysThirdParty7']:checked").val();
	 qMRefInternal=$("#managementSysRefThirdParty7").val();
	 identificationProc = $("input[name='managementSysThirdParty8']:checked").val();
	 qMRefIdentification=$("#managementSysRefThirdParty8").val();	 
	 recordRetentionProc = $("input[name='managementSysThirdParty9']:checked").val();
	 qMRefRetentionProc=$("#managementSysRefThirdParty9").val();
	 janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${addAccCerBodiesManagementSysReq}",
					data : {
						 "<portlet:namespace/>optionFollow" : optionFollow,
							"<portlet:namespace/>impartialityPolicy" : impartialityPolicy,
							"<portlet:namespace/>qMRefImpartiality" : qMRefImpartiality,
							"<portlet:namespace/>interestedPartyNeedsB" : interestedPartyNeedsB,
							"<portlet:namespace/>qMRefInterestedB" : qMRefInterestedB,
							"<portlet:namespace/>riskAssessment" : riskAssessment,
							"<portlet:namespace/>qMRefRisk" : qMRefRisk,
							"<portlet:namespace/>managementReviewB" : managementReviewB,
							"<portlet:namespace/>qMRefmanagementReviewB" : qMRefmanagementReviewB,							
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
							"<portlet:namespace/>designDevB" : designDevB,
							"<portlet:namespace/>qMRefDesignB" : qMRefDesignB,							
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
							 "<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						},
						async: false,
					success : function(data) {
						var result = data.APP_DATA;
					 $("#janaacApplicationId").html(result["janaacApplicationId"]);
			    uploadDocuments('impartialityRefThirdPartyAttach1',"fda approval impartiality first",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('impartialityRefThirdPartyAttach2',"fda approval impartiality second",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('impartialityRefThirdPartyAttach3',"fda approval impartiality third",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('impartialityRefThirdPartyAttach4',"fda approval impartiality four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('orgStructureRefThirdPartyAttach1',"fda approval org structure first",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('orgStructureRefThirdPartyAttach2',"fda approval org structure two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('orgStructureRefThirdPartyAttach3',"fda approval org structure three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('resourcesRefThirdPartyAttach1',"fda approval third party first",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('resourcesRefThirdPartyAttach2',"fda approval third party second",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('resourcesRefThirdPartyAttach3',"fda approval third party third",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('resourcesRefThirdPartyAttach4',"fda approval third party four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('resourcesRefThirdPartyAttach5',"fda approval third party five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('resourcesRefThirdPartyAttach6',"fda approval third party six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('resourcesRefThirdPartyAttach7',"fda approval third party seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('resourcesRefThirdPartyAttach8',"fda approval third party eight",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('informationRefThirdPartyAttach1',"fda approval info ref one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('informationRefThirdPartyAttach2',"fda approval info ref two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('informationRefThirdPartyAttach3',"fda approval info ref three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('informationRefThirdPartyAttach4',"fda approval info ref four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('informationRefThirdPartyAttach5',"fda approval info ref five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('informationRefThirdPartyAttach6',"fda approval info ref six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('informationRefThirdPartyAttach7',"fda approval info ref seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('informationRefThirdPartyAttach8',"fda approval info ref eight",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('informationRefThirdPartyAttach9',"fda approval info ref nine",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('informationRefThirdPartyAttach10',"fda approval info ref ten",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('informationRefThirdPartyAttach11',"fda approval info ref eleven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('informationRefThirdPartyAttach12',"fda approval info ref twelve",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('cerProcessRefThirdPartyAttach1',"fda approval cer pro ref one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('cerProcessRefThirdPartyAttach2',"fda approval cer pro ref two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('cerProcessRefThirdPartyAttach3',"fda approval cer pro ref three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('cerProcessRefThirdPartyAttach4',"fda approval cer pro ref four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('cerProcessRefThirdPartyAttach5',"fda approval cer pro ref five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('cerProcessRefThirdPartyAttach6',"fda approval cer pro ref six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('cerProcessRefThirdPartyAttach7',"fda approval cer pro ref seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('cerProcessRefThirdPartyAttach8',"fda approval cer pro ref eight",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('cerProcessRefThirdPartyAttach9',"fda approval cer pro ref nine",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('cerProcessRefThirdPartyAttach10',"fda approval cer pro ref ten",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('cerProcessRefThirdPartyAttach11',"fda approval cer pro ref eleven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('cerProcessRefThirdPartyAttach12',"fda approval cer pro ref twelve",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('cerProcessRefThirdPartyAttach13',"fda approval cer pro ref thirteen",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('cerProcessRefThirdPartyAttach14',"fda approval cer pro ref fourteen",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('cerProcessRefThirdPartyAttach15',"fda approval cer pro ref fivteen",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('cerProcessRefThirdPartyAttach16',"fda approval cer pro ref sixteen",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('cerProcessRefThirdPartyAttach17',"fda approval cer pro ref seventeen",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSysRefThirdPartyAttach1',"fda approval man sys one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSysRefThirdPartyAttach2',"fda approval man sys two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSysRefThirdPartyAttach3',"fda approval man sys three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSysRefThirdPartyAttach4',"fda approval man sys four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSysRefThirdPartyAttach5',"fda approval man sys five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSysRefThirdPartyAttach6',"fda approval man sys six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSysRefThirdPartyAttach7',"fda approval man sys seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSysRefThirdPartyAttach8',"fda approval man sys eight",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				uploadDocuments('managementSysRefThirdPartyAttach9',"fda approval man sys nine",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					
				if(!isSaveAndContinue){
					applicantInfo();
			    }
			},
					error : function(data) {
					},
				});
}
function accThirdPartyOtherReq(isSaveAndContinue) {
	 applicationFees = $("input[name='otherFeeReqThirdParty']:checked").val();
	 insPaymentMethod=$("#otherFeePayMethodThirdParty").val();
	 applicantRepName=$("#applicantRepresentativeNameThirdParty").val();
	 applicantRepPosition=$("#applicantRepresentativePositionThirdParty").val();
	 signatureDate=$("#applicantRepresentativeThirdPartyDate").val();
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
					 uploadDocuments('applicantRepresentativeThirdPartySignatureBtn',"Signature of Applicant Representive Fda",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
						if(!isSaveAndContinue){
					applicantInfo();
			    }
					},
					error : function(data) {
					},
				});
}
</script>