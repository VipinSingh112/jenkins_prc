<%@ include file="../init.jsp" %>
<script>
function accMediLabManagementSysReq(isSaveAndContinue) {
 managementEstablished = $("input[name='managementSystemOne']:checked").val();
 qMRefManagement=$("#qualityManualRefOne").val();
 personAware =$("input[name='managementSystemTwo']:checked").val();
 qMRefPerson=$("#qualityManualRefTwo").val();
 policiesAcknowledged = $("input[name='managementSystemThree']:checked").val();
 qMRefPolicies=$("#qualityManualRefThree").val();
 controlledDocument = $("input[name='managementSystemFour']:checked").val();
 qMRefControlDoc=$("#qualityManualRefFour").val();
 laboratoryEstablished = $("input[name='managementSystemFive']:checked").val();
 qMRefLabEstab=$("#qualityManualRefFive").val();
 identifiedRisks = $("input[name='managementSystemSix']:checked").val();
 qMRefRisks=$("#qualityManualRefSix").val();
 havePersonnel = $("input[name='managementSystemSeven']:checked").val();
 qMRefPersonnel=$("#qualityManualRefSeven").val();
 authorizePersonnel = $("input[name='managementSystemEight']:checked").val();
 qMRefAuthorize=$("#qualityManualRefEight").val();
 labControlDocsFulfilment = $("input[name='managementRquirementOne']:checked").val();
 otherRefFulfil=$("#managementReQualityManualRefOne").val();
 legibleRecordsFulfil = $("input[name='managementRquirementTwo']:checked").val();
 otherRefLegibleRec=$("#managementReQualityManualRefTwo").val();
 proceduresInPlace = $("input[name='managementRquirementThree']:checked").val();
 otherRefProcedure=$("#managementReQualityManualRefThree").val();
 communicatedRequirement = $("input[name='managementRquirementFour']:checked").val();
 otherRefRequirement=$("#managementReQualityManualRefFour").val();
 procedureForSelection = $("input[name='managementRquirementFive']:checked").val();
 otherRefSelection=$("#managementReQualityManualRefFive").val();
 arrangementInPlace = $("input[name='managementRquirementSix']:checked").val();
 otherRefArrange=$("#managementReQualityManualRefSix").val();
 processInPlace = $("input[name='managementRquirementSeven']:checked").val();
 otherRefProcess=$("#managementReQualityManualRefSeven").val();
 labOperateProgramme = $("input[name='managementRquirementEight']:checked").val();
 otherRefLabOperate=$("#managementReQualityManualRefEight").val();
 identifyOpportunities = $("input[name='managementRquirementNine']:checked").val();
 otherRefOpportunity=$("#managementReQualityManualRefNine").val();
 demonstrateFulfilment = $("input[name='managementRquirementTen']:checked").val();
 otherRefDemonstrate=$("#managementReQualityManualRefTen").val();
 ensureLabPlan = $("input[name='managementRquirementEleven']:checked").val();
 otherRefEnsurePlan=$("#managementReQualityManualRefEleven").val();
 plannedManageReview = $("input[name='managementRquirementTwelve']:checked").val();
 otherRefPlanned=$("#managementResourceQualityManualRefOne").val();
	availablePersonnel = $("input[name='managementResourceRquirementOne']:checked").val();
	manualRefAvailable=$("#managementResourceQualityManualRefOne").val();
	educationProgramme = $("input[name='managementResourceRquirementTwo']:checked").val();
	manualRefEducation=$("#managementResourceQualityManualRefTwo").val();
	ensureAccomodation = $("input[name='managementResourceRquirementThree']:checked").val();
	manualRefAccom=$("#managementResourceQualityManualRefThree").val();
	processForSelection = $("input[name='managementResourceRquirementFour']:checked").val();
	manualRefSelection=$("#managementResourceQualityManualRefFour").val();
	verifyReagents = $("input[name='managementResourceRquirementFive']:checked").val();
	manualRefReagents=$("#managementResourceQualityManualRefFive").val();
	docProcedure = $("input[name='managementResourceRquirementSix']:checked").val();
	manualRefDocProce=$("#managementResourceQualityManualRefSix").val();
	useExamMethods = $("input[name='managementResourceRquirementSeven']:checked").val();
	manualRefExam=$("#managementResourceQualityManualRefSeven").val();
	monitoringValidity = $("input[name='managementResourceRquirementEight']:checked").val();
	manualRefValidity=$("#managementResourceQualityManualRefEight").val();
	validateExam = $("input[name='managementResourceRquirementNine']:checked").val();
	manualRefValidateExam=$("#managementResourceQualityManualRefNine").val();
	uncertainityReview = $("input[name='managementResourceRquirementTen']:checked").val();
	manualRefUncertainity=$("#managementResourceQualityManualRefTen").val();
	preventResRelease = $("input[name='managementResourceRquirementEleven']:checked").val();
	manualRefPrevent=$("#managementResourceQualityManualRefEleven").val();
	equipmentMaintenance = $("input[name='managementResourceRquirementTwelve']:checked").val();
	manualRefMaintenance=$("#managementResourceQualityManualRefTwelve").val();
	equipCalibration = $("input[name='managementResourceRquirementThirteen']:checked").val();
	manualRefCalibrat=$("#managementResourceQualityManualRefThirteen").val();
	proficencyTesting = $("input[name='managementResourceRquirementFourteen']:checked").val();
	manualRefProfiTest=$("#managementResourceQualityManualRefFourteen").val();
	postExamReliabilty = $("input[name='managementResourceRquirementFifteen']:checked").val();
	manualRefPostExam=$("#managementResourceQualityManualRefFifteen").val();
	reportedAccurately = $("input[name='managementResourceRquirementSixteen']:checked").val();
	manualRefReported=$("#managementResourceQualityManualRefSixteen").val();
	responsiblitySpecified = $("input[name='managementResourceRquirementSeventeen']:checked").val();
	manualRefSpecified=$("#managementResourceQualityManualRefSeventeen").val();
	ensureAuthorities = $("input[name='managementResourceRquirementEighteen']:checked").val();
	manualRefAuthorities=$("#managementResourceQualityManualRefEighteen").val();
	janaacApplicationId = $("#janaacApplicationId").val();
	if(!isSaveAndContinue){
		applicantInfo();
	}
	$.ajax({
				type : "POST",
				url : "${addAccMediLabManagementSysReq}",
				data : {
					"<portlet:namespace/>managementEstablished" : managementEstablished,
					"<portlet:namespace/>qMRefManagement" : qMRefManagement,
					"<portlet:namespace/>personAware" : personAware,
					"<portlet:namespace/>qMRefPerson" : qMRefPerson,
					"<portlet:namespace/>policiesAcknowledged" : policiesAcknowledged,
					"<portlet:namespace/>qMRefPolicies" : qMRefPolicies,
					"<portlet:namespace/>controlledDocument" : controlledDocument,
					"<portlet:namespace/>qMRefControlDoc" : qMRefControlDoc,
					"<portlet:namespace/>laboratoryEstablished" : laboratoryEstablished,
					"<portlet:namespace/>qMRefLabEstab" : qMRefLabEstab,
					"<portlet:namespace/>identifiedRisks" : identifiedRisks,
					"<portlet:namespace/>qMRefRisks" : qMRefRisks,
					"<portlet:namespace/>havePersonnel" : havePersonnel,
					"<portlet:namespace/>qMRefPersonnel" : qMRefPersonnel,
					"<portlet:namespace/>authorizePersonnel" : authorizePersonnel,
					"<portlet:namespace/>qMRefAuthorize" : qMRefAuthorize,
					"<portlet:namespace/>labControlDocsFulfilment" : labControlDocsFulfilment,
					"<portlet:namespace/>otherRefFulfil" : otherRefFulfil,
					"<portlet:namespace/>legibleRecordsFulfil" : legibleRecordsFulfil,
					"<portlet:namespace/>otherRefLegibleRec" : otherRefLegibleRec,
					"<portlet:namespace/>proceduresInPlace" : proceduresInPlace,
					"<portlet:namespace/>otherRefProcedure" : otherRefProcedure,
					"<portlet:namespace/>communicatedRequirement" : communicatedRequirement,
					"<portlet:namespace/>otherRefRequirement" : otherRefRequirement,
					"<portlet:namespace/>procedureForSelection" : procedureForSelection,
					"<portlet:namespace/>otherRefSelection" : otherRefSelection,
					"<portlet:namespace/>arrangementInPlace" : arrangementInPlace,
					"<portlet:namespace/>otherRefArrange" : otherRefArrange,
					"<portlet:namespace/>processInPlace" : processInPlace,
					"<portlet:namespace/>otherRefProcess" : otherRefProcess,
					"<portlet:namespace/>labOperateProgramme" : labOperateProgramme,
					"<portlet:namespace/>otherRefLabOperate" : otherRefLabOperate,
					"<portlet:namespace/>identifyOpportunities" : identifyOpportunities,
					"<portlet:namespace/>otherRefOpportunity" : otherRefOpportunity,
					"<portlet:namespace/>demonstrateFulfilment" : demonstrateFulfilment,
					"<portlet:namespace/>otherRefDemonstrate" : otherRefDemonstrate,
					"<portlet:namespace/>ensureLabPlan" : ensureLabPlan,
					"<portlet:namespace/>otherRefEnsurePlan" : otherRefEnsurePlan,
					"<portlet:namespace/>plannedManageReview" : plannedManageReview,
					"<portlet:namespace/>otherRefPlanned" : otherRefPlanned,
					"<portlet:namespace/>availablePersonnel" : availablePersonnel,
					"<portlet:namespace/>manualRefAvailable" : manualRefAvailable,
					"<portlet:namespace/>educationProgramme" : educationProgramme,
					"<portlet:namespace/>manualRefEducation" : manualRefEducation,
					"<portlet:namespace/>ensureAccomodation" : ensureAccomodation,
					"<portlet:namespace/>manualRefAccom" : manualRefAccom,
					"<portlet:namespace/>processForSelection" : processForSelection,
					"<portlet:namespace/>manualRefSelection" : manualRefSelection,
					"<portlet:namespace/>verifyReagents" : verifyReagents,
					"<portlet:namespace/>manualRefReagents" : manualRefReagents,
					"<portlet:namespace/>docProcedure" : docProcedure,
					"<portlet:namespace/>manualRefDocProce" : manualRefDocProce,
					"<portlet:namespace/>useExamMethods" : useExamMethods,
					"<portlet:namespace/>manualRefExam" : manualRefExam,
					"<portlet:namespace/>monitoringValidity" : monitoringValidity,
					"<portlet:namespace/>manualRefValidity" : manualRefValidity,
					"<portlet:namespace/>validateExam" : validateExam,
					"<portlet:namespace/>manualRefValidateExam" : manualRefValidateExam,
					"<portlet:namespace/>uncertainityReview" : uncertainityReview,
					"<portlet:namespace/>manualRefUncertainity" : manualRefUncertainity,
					"<portlet:namespace/>preventResRelease" : preventResRelease,
					"<portlet:namespace/>manualRefPrevent" : manualRefPrevent,
					"<portlet:namespace/>equipmentMaintenance" : equipmentMaintenance,
					"<portlet:namespace/>manualRefMaintenance" : manualRefMaintenance,
					"<portlet:namespace/>equipCalibration" : equipCalibration,
					"<portlet:namespace/>manualRefCalibrat" : manualRefCalibrat,
					"<portlet:namespace/>proficencyTesting" : proficencyTesting,
					"<portlet:namespace/>manualRefProfiTest" : manualRefProfiTest,
					"<portlet:namespace/>postExamReliabilty" : postExamReliabilty,
					"<portlet:namespace/>manualRefPostExam" : manualRefPostExam,
					"<portlet:namespace/>reportedAccurately" : reportedAccurately,
					"<portlet:namespace/>manualRefReported" : manualRefReported,
					"<portlet:namespace/>responsiblitySpecified" : responsiblitySpecified,
					"<portlet:namespace/>manualRefSpecified" : manualRefSpecified,
					"<portlet:namespace/>ensureAuthorities" : ensureAuthorities,
					"<portlet:namespace/>manualRefAuthorities" : manualRefAuthorities,
					"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
					},
				success : function(data) {
					var result = data.APP_DATA;
					$("#janaacApplicationId").html(result["janaacApplicationId"]);
					uploadDocuments('qualityManualRefAttach1',"lab medical Quality manual one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('qualityManualRefAttach2',"lab medical Quality manual two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
					uploadDocuments('qualityManualRefAttach3',"lab medical Quality manual three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('qualityManualRefAttach4',"lab medical Quality manual four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
					uploadDocuments('qualityManualRefAttach5',"lab medical Quality manual five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('qualityManualRefAttach6',"lab medical Quality manual six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
					uploadDocuments('qualityManualRefAttach7',"lab medical Quality manual seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('qualityManualRefAttach8',"lab medical Quality manual eight",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
					uploadDocuments('managementReQualityManualRefAttach1',"lab medical managemet re Qua one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementReQualityManualRefAttach2',"lab medical managemet re Qua two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementReQualityManualRefAttach3',"lab medical managemet re Qua three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementReQualityManualRefAttach4',"lab medical managemet re Qua four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementReQualityManualRefAttach5',"lab medical managemet re Qua five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementReQualityManualRefAttach6',"lab medical managemet re Qua six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementReQualityManualRefAttach7',"lab medical managemet re Qua seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementReQualityManualRefAttach8',"lab medical managemet re Qua eight",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementReQualityManualRefAttach9',"lab medical managemet re Qua nine",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementReQualityManualRefAttach10',"lab medical managemet re Qua ten",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementReQualityManualRefAttach11',"lab medical managemet re Qua eleven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementReQualityManualRefAttach12',"lab medical managemet re Qua twelve",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceQualityManualRefAttach1',"lab medical managemet resource one ",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceQualityManualRefAttach2',"lab medical managemet resource two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceQualityManualRefAttach3',"lab medical managemet resource three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceQualityManualRefAttach4',"lab medical managemet resource four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceQualityManualRefAttach5',"lab medical managemet resource five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceQualityManualRefAttach6',"lab medical managemet resource six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceQualityManualRefAttach7',"lab medical managemet resource seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceQualityManualRefAttach8',"lab medical managemet resource eight",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceQualityManualRefAttach9',"lab medical managemet resource nine",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceQualityManualRefAttach10',"lab medical managemet resource ten",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceQualityManualRefAttach11',"lab medical managemet resource eleven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceQualityManualRefAttach12',"lab medical managemet resource twelev",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceQualityManualRefAttach13',"lab medical managemet resource thirteen",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceQualityManualRefAttach14',"lab medical managemet resource fourteen",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceQualityManualRefAttach15',"lab medical managemet resource fivteen",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceQualityManualRefAttach16',"lab medical managemet resource sixteen",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceQualityManualRefAttach17',"lab medical managemet resource seventeen",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('managementResourceQualityManualRefAttach18',"lab medical managemet resource eighteen",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
							
					
				},
				error : function(data) {
				},
			});
}
function accMediLabOtherReq() {
 paymentMethod=$("#paymentMethodFee").val();
 representativeName=$("#applicantRepresentativeName").val();
 representativePosition=$("#applicantRepresentativePosition").val();
 signDate=$("#applicantRepresentativeDate").val();
janaacApplicationId = $("#janaacApplicationId").val();
	$.ajax({
				type : "POST",
				url : "${addAccMediLabOtherReq}",
				data : {
					"<portlet:namespace/>paymentMethod" : paymentMethod,
					"<portlet:namespace/>representativeName" : representativeName,
					"<portlet:namespace/>representativePosition" : representativePosition,
					"<portlet:namespace/>signDate" : signDate,
					"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
					},
				success : function(data) {
			    var result = data.APP_DATA;
			    $("#janaacApplicationId").html(result["janaacApplicationId"]);
			    uploadDocuments('applicantRepresentativeSignatureBtn',"Accre Medical representative signature",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
				},
				error : function(data) {
				},
			});
}
function accMediLabTestingApplicationInfo(isSaveAndContinue) {
	applicantName=$("#testingApplicantName").val();
	applicantAddress=$("#testingApplicantAddress").val();
	applicantTelephone=$("#testingApplicantTelephone").val();
	applicantFaxNo=$("#testingApplicantFax").val();
	applicantWebsite=$("#testingApplicantWebsite").val();
	laboratoryName=$("#testingLaboratoryName").val();
	laboratoryAddress=$("#testingLaboratoryAddress").val();
	personnelName=$("#testingPersonnelName").val();
	personnelEmail=$("#testingPersonnelEmail").val();
	personnelQMName=$("#testingPersonnelQMName").val();
	personnelQMEmail=$("#testingPersonnelQMEmail").val();
	deputyName=$("#testingDeputyName").val();
	deputyEmail=$("#testingDeputyEmail").val();
	personnelFMName=$("#testingPersonnelFMName").val();
	personnelFMEmail=$("#testingPersonnelFMEmail").val();
	accreditationRequest=$("input[name='testingAccreditationRequest']:checked").val();
	authorizedPersonnelName=$("#testingAuthorizedPersonnelName").val();
	authorizedPersonnelPosition=$("#testingAuthorizedPersonnelPosition").val();
	authorizedPersonnelDate=$("#testingAuthorizedPersonnelDate").val();
	janaacApplicationId = $("#janaacApplicationId").val();
	submitForm= true;
	if(!isSaveAndContinue){
		
		if(!authorizedPersonnelName){
			$("#testingAuthorizedPersonnelNameValidation").removeClass("hide");
			$("#testingAuthorizedPersonnelName").focus();
			submitForm= false;
		}else{
			$("#testingAuthorizedPersonnelNameValidation").addClass("hide");
		}
		if(!applicantName){
			$("#testingApplicantNameValidation").removeClass("hide");
			$("#testingApplicantName").focus();
			submitForm= false;
		}else{
			$("#testingApplicantNameValidation").addClass("hide");
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
					addPersonnelResponsibleTestingDetail();
					$("#janaacFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				}
				var result = data.APP_DATA;
				$("#janaacApplicationId").html(result["janaacApplicationId"]);
				uploadDocuments('authorizedPersonnelTestingBtn',"Accer Test Signature of Authorized Personnel",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
				uploadDocuments('companyStampTestingBtn',"Accer Test Company Stamp",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
				$("#janaacFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			},
			error : function(data) {
			},
		});
	}
 }
function accMediLabTestingActivityDesc(isSaveAndContinue) {
	var clinicalActivities = new Array();
	  $("input:checkbox[name=testingClinicalActivity]:checked").each(function () {
		  clinicalActivities.push($(this).val());

	 });	
    var testingClinicalActivity=clinicalActivities.toString();
    testingLaboratoryWorkShifts=$("#testingLaboratoryWorkShifts").val();
    testingSpecimenNumber=$("#testingSpecimenNumber").val();
    testingSpecimenLocation=$("#testingSpecimenLocation").val();
	janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${addAccMediLabTestingActivityDesc}",
					data : {
						"<portlet:namespace/>testingClinicalActivity" : testingClinicalActivity,
						"<portlet:namespace/>testingLaboratoryWorkShifts" : testingLaboratoryWorkShifts,
						"<portlet:namespace/>testingSpecimenNumber" : testingSpecimenNumber,
						"<portlet:namespace/>testingSpecimenLocation" : testingSpecimenLocation,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						},
					success : function(data) {
						if(!isSaveAndContinue){
					    applicantInfo();
					    addTestingSpecimenCollectionDetail();
    	 		}
					},
					error : function(data) {
					},
				});
 }
function accMediLabTestStructuralReq(isSaveAndContinue) {
 testingLaboratoryLegalEntity = $("input[name='structuralLaboratoryLegalEntity']:checked").val();
 testingLaboratoryLegalEntityDefine=$("#structuralLaboratoryLegalEntityDefine").val();
 testingLaboratoryPartOfOrg =$("input[name='laboratoryPartOfTesting']:checked").val();
 testingLaboratoryPartOfOrgName=$("#testingLaboratoryPartOfOrgName").val();
 testingLaboratoryPartOfOrgPosition=$("#testingLaboratoryPartOfOrgPosition").val();
 testingManagerialStaffSize=$("#testingManagerialStaffSize").val();
 testingTechnicalStaffSize=$("#testingTechnicalStaffSize").val();
 testingRelevantDocuments=$("#allTestingRelevantDocuments").val();
 majorIncomeSourceTesting=$("#majorIncomeSourceTesting").val();
 testingLaboratoryClients=$("#testingLaboratoryClients").val();
janaacApplicationId = $("#janaacApplicationId").val();
	$.ajax({
				type : "POST",
				url : "${addAccMediLabTestStructuralReq}",
				data : {
					"<portlet:namespace/>testingLaboratoryLegalEntity" : testingLaboratoryLegalEntity,
					"<portlet:namespace/>testingLaboratoryLegalEntityDefine" : testingLaboratoryLegalEntityDefine,
					"<portlet:namespace/>testingLaboratoryPartOfOrg" : testingLaboratoryPartOfOrg,
					"<portlet:namespace/>testingLaboratoryPartOfOrgName" : testingLaboratoryPartOfOrgName,
					"<portlet:namespace/>testingLaboratoryPartOfOrgPosition" : testingLaboratoryPartOfOrgPosition,
					"<portlet:namespace/>testingManagerialStaffSize" : testingManagerialStaffSize,
					"<portlet:namespace/>testingTechnicalStaffSize" : testingTechnicalStaffSize,
					"<portlet:namespace/>testingRelevantDocuments" : testingRelevantDocuments,
					"<portlet:namespace/>majorIncomeSourceTesting" : majorIncomeSourceTesting,
					"<portlet:namespace/>testingLaboratoryClients" : testingLaboratoryClients,
					"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
					},
				success : function(data) {
					uploadDocuments('normativeDocuments',"Normatives Documents",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
					if(!isSaveAndContinue){
					applicantInfo();
					addScopeForAccreditationDetail();
					addStaffDetail();
    	 		}
				},
				error : function(data) {
				},
			});
}
function accMediLabTestResourceReq(isSaveAndContinue) {
 testExternalPersonnel=$("#testingExternalPersonnel").val();
 testCompetenceRequirements=$("#testingCompetenceRequirements").val();
 testLabFacilities=$("#laboratoryFacilities").val();
 testLabContractedFacilities=$("#laboratoryContractedFacilities").val();
 testLabFacilityEnvReq=$("#laboratoryFacilityEnvReq").val();
 testSpecialEnvConditions=$("#specialEnvConditions").val();
 testMonitoringActivities=$("#monitoringActivities").val();
 testLabRelatedEquipment=$("#laboratoryRelatedEquipment").val();
 testSecurityArrangements=$("#testingSecurityArrangements").val();
janaacApplicationId = $("#janaacApplicationId").val();
	$.ajax({
				type : "POST",
				url : "${addAccMediLabTestResourceReq}",
				data : {
					"<portlet:namespace/>testExternalPersonnel" : testExternalPersonnel,
					"<portlet:namespace/>testCompetenceRequirements" : testCompetenceRequirements,
					"<portlet:namespace/>testLabFacilities" : testLabFacilities,
					"<portlet:namespace/>testLabContractedFacilities" : testLabContractedFacilities,
					"<portlet:namespace/>testLabFacilityEnvReq" : testLabFacilityEnvReq,
					"<portlet:namespace/>testSpecialEnvConditions" : testSpecialEnvConditions,
					"<portlet:namespace/>testMonitoringActivities" : testMonitoringActivities,
					"<portlet:namespace/>testLabRelatedEquipment" : testLabRelatedEquipment,
					"<portlet:namespace/>testSecurityArrangements" : testSecurityArrangements,
					"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
					},
				success : function(data) {
					if(!isSaveAndContinue){
					applicantInfo();
					addActivityPerformedLocDetail();
					addMajorEquipmentTestingDetail();
    	 		}
				},
				error : function(data) {
				},
			});
}
function accMediLabTestManagementSysReq(isSaveAndContinue) {
 policiesForFulfil = $("input[name='managementSystemTestingOne']:checked").val();
 labDocRefPolicies=$("#labDocRefOne").val();
 impartialityProvision =$("input[name='managementSystemTestingTwo']:checked").val();
 labDocRefImpartProv=$("#labDocRefTwo").val();
 confidientialityProv = $("input[name='managementSystemTestingThree']:checked").val();
 labDocRefConfid=$("#labDocRefThree").val();
 commitmentEvidence = $("input[name='managementSystemTestingFour']:checked").val();
 labDocRefCommitment=$("#labDocRefFour").val();
 referenceEvidence = $("input[name='managementSystemTestingFive']:checked").val();
 labDocRefReference=$("#labDocRefFive").val();
 docDescribingRole = $("input[name='managementSystemTestingSix']:checked").val();
 labDocRefDocDes=$("#labDocRefSix").val();
 rolesofPersonnel = $("input[name='managementSystemTestingSeven']:checked").val();
 labDocRefRoles=$("#labDocRefSeven").val();
 competenceReq = $("input[name='managSysReqResDocOne']:checked").val();
 labDocRefCompetence=$("#labDocResReqRefOne").val();
 selectionOfPerson = $("input[name='managSysReqResDocTwo']:checked").val();
 labDocRefSelection=$("#labDocResReqRefTwo").val();
 handlingEquip = $("input[name='managSysReqResDocThree']:checked").val();
 labDocRefHandling=$("#labDocResReqRefThree").val();
 calibrationProgram = $("input[name='managSysReqResDocFour']:checked").val();
 labDocRefCalibrat=$("#labDocResReqRefFour").val();
 approvingReq = $("input[name='managSysReqResDocFive']:checked").val();
 labDocRefApproving=$("#labDocResReqRefFive").val();
 monitorPerformance = $("input[name='managSysReqResDocSix']:checked").val();
 labDocRefMonitor=$("#labDocResReqRefSix").val();
 ensuringService = $("input[name='managSysReqResDocSeven']:checked").val();
 labDocRefEnsuring=$("#labDocResReqRefSeven").val();
 reviewOfRequest = $("input[name='managSysReqProcessDocOne']:checked").val();
 labDocRefRequest=$("#labDocProcessReqRefOne").val();
 procedureForLab = $("input[name='managSysReqProcessDocTwo']:checked").val();
 labDocRefProcedure=$("#labDocProcessReqRefTwo").val();
 testMethodValidat = $("input[name='managSysReqProcessDocThree']:checked").val();
 labDocRefTestMethod=$("#labDocProcessReqRefThree").val();
 samplingPlan = $("input[name='managSysReqProcessDocFour']:checked").val();
 labDocRefSampling=$("#labDocProcessReqRefFour").val();
 transportationReciept = $("input[name='managSysReqProcessDocFive']:checked").val();
 labDocRefTransport=$("#labDocProcessReqRefFive").val();
 uncertainityMeasure = $("input[name='managSysReqProcessDocSix']:checked").val();
 labDocRefUncertain=$("#labDocProcessReqRefSix").val();
 testResultValidity = $("input[name='managSysReqProcessDocSeven']:checked").val();
 labDocReftestResult=$("#labDocProcessReqRefSeven").val();
 complaints = $("input[name='managSysReqProcessDocEight']:checked").val();
 labDocRefComplaints=$("#labDocProcessReqRefEight").val();
 nonConformingWork = $("input[name='managSysReqProcessDocNine']:checked").val();
 labDocRefNonConfirm=$("#labDocProcessReqRefNine").val();
 uniqueIdentification = $("input[name='managSysReqManagementDocOne']:checked").val();
 labDocRefUnique=$("#labDocManagementReqRefOne").val();
 currentRevisionStatus = $("input[name='managSysReqManagementDocTwo']:checked").val();
 labDocRefCurrentRev=$("#labDocManagementReqRefTwo").val();
 docChangeIdentify = $("input[name='managSysReqManagementDocThree']:checked").val();
 labDocRefDocChange=$("#labDocManagementReqRefThree").val();
 recordControl = $("input[name='managSysReqManagementDocFour']:checked").val();
 labDocRefRecordControl=$("#labDocManagementReqRefFour").val();
 plannedAction = $("input[name='managSysReqManagementDocFive']:checked").val();
 labDocRefPlanned=$("#labDocManagementReqRefFive").val();
 imporvementOpportunity = $("input[name='managSysReqManagementDocSix']:checked").val();
 labDocRefImprovement=$("#labDocManagementReqRefSix").val();
 correctiveAction = $("input[name='managSysReqManagementDocSeven']:checked").val();
 labDocRefCorrective=$("#labDocManagementReqRefSeven").val();
 internalAudits = $("input[name='managSysReqManagementDocEight']:checked").val();
 labDocRefInternal=$("#labDocManagementReqRefEight").val();
 managementReview = $("input[name='managSysReqManagementDocNine']:checked").val();
 labDocRefManagement=$("#labDocManagementReqRefNine").val();
 janaacApplicationId = $("#janaacApplicationId").val();
	$.ajax({
				type : "POST",
				url : "${addAccMediLabTestManagementSysReq}",
				data : {
					 "<portlet:namespace/>policiesForFulfil" : policiesForFulfil,
						"<portlet:namespace/>labDocRefPolicies" : labDocRefPolicies,
						"<portlet:namespace/>impartialityProvision" : impartialityProvision,
						"<portlet:namespace/>labDocRefImpartProv" : labDocRefImpartProv,
						"<portlet:namespace/>confidientialityProv" : confidientialityProv,
						"<portlet:namespace/>labDocRefConfid" : labDocRefConfid,
						"<portlet:namespace/>commitmentEvidence" : commitmentEvidence,
						"<portlet:namespace/>labDocRefCommitment" : labDocRefCommitment,
						"<portlet:namespace/>referenceEvidence" : referenceEvidence,
						"<portlet:namespace/>labDocRefReference" : labDocRefReference,
						"<portlet:namespace/>docDescribingRole" : docDescribingRole,
						"<portlet:namespace/>labDocRefDocDes" : labDocRefDocDes,
						"<portlet:namespace/>rolesofPersonnel" : rolesofPersonnel,
						"<portlet:namespace/>labDocRefRoles" : labDocRefRoles,							
					    "<portlet:namespace/>competenceReq" : competenceReq,
						"<portlet:namespace/>labDocRefCompetence" : labDocRefCompetence,
						"<portlet:namespace/>selectionOfPerson" : selectionOfPerson,
						"<portlet:namespace/>labDocRefSelection" : labDocRefSelection,
						"<portlet:namespace/>handlingEquip" : handlingEquip,
						"<portlet:namespace/>labDocRefHandling" : labDocRefHandling,
						"<portlet:namespace/>calibrationProgram" : calibrationProgram,
						"<portlet:namespace/>labDocRefCalibrat" : labDocRefCalibrat,
						"<portlet:namespace/>approvingReq" : approvingReq,
						"<portlet:namespace/>labDocRefApproving" : labDocRefApproving,
						"<portlet:namespace/>monitorPerformance" : monitorPerformance,
						"<portlet:namespace/>labDocRefMonitor" : labDocRefMonitor,
						"<portlet:namespace/>ensuringService" : ensuringService,
						"<portlet:namespace/>labDocRefEnsuring" : labDocRefEnsuring,							
						 "<portlet:namespace/>reviewOfRequest" : reviewOfRequest,
						 "<portlet:namespace/>labDocRefRequest" : labDocRefRequest,
						 "<portlet:namespace/>procedureForLab" : procedureForLab,
				   		 "<portlet:namespace/>labDocRefProcedure" : labDocRefProcedure,
						 "<portlet:namespace/>testMethodValidat" : testMethodValidat,
						 "<portlet:namespace/>labDocRefTestMethod" : labDocRefTestMethod,
						 "<portlet:namespace/>samplingPlan" : samplingPlan,
						 "<portlet:namespace/>labDocRefSampling" : labDocRefSampling,
						 "<portlet:namespace/>transportationReciept" : transportationReciept,
						 "<portlet:namespace/>labDocRefTransport" : labDocRefTransport,
						 "<portlet:namespace/>uncertainityMeasure" : uncertainityMeasure,
						 "<portlet:namespace/>labDocRefUncertain" : labDocRefUncertain,
						 "<portlet:namespace/>testResultValidity" : testResultValidity,
						 "<portlet:namespace/>labDocReftestResult" : labDocReftestResult,
				 		 "<portlet:namespace/>complaints" : complaints,
						"<portlet:namespace/>labDocRefComplaints" : labDocRefComplaints,
						"<portlet:namespace/>nonConformingWork" : nonConformingWork,
						"<portlet:namespace/>labDocRefNonConfirm" : labDocRefNonConfirm,									
					"<portlet:namespace/>uniqueIdentification" : uniqueIdentification,
					"<portlet:namespace/>labDocRefUnique" : labDocRefUnique,
					"<portlet:namespace/>currentRevisionStatus" : currentRevisionStatus,
					"<portlet:namespace/>labDocRefCurrentRev" : labDocRefCurrentRev,
					"<portlet:namespace/>docChangeIdentify" : docChangeIdentify,
					"<portlet:namespace/>labDocRefDocChange" : labDocRefDocChange,
					"<portlet:namespace/>recordControl" : recordControl,
					"<portlet:namespace/>labDocRefRecordControl" : labDocRefRecordControl,
					"<portlet:namespace/>plannedAction" : plannedAction,
					"<portlet:namespace/>labDocRefPlanned" : labDocRefPlanned,
					"<portlet:namespace/>imporvementOpportunity" : imporvementOpportunity,
					"<portlet:namespace/>labDocRefImprovement" : labDocRefImprovement,
					"<portlet:namespace/>correctiveAction" : correctiveAction,
					"<portlet:namespace/>labDocRefCorrective" : labDocRefCorrective,
					"<portlet:namespace/>internalAudits" : internalAudits,
					"<portlet:namespace/>labDocRefInternal" : labDocRefInternal,
					"<portlet:namespace/>managementReview" : managementReview,
					"<portlet:namespace/>labDocRefManagement" : labDocRefManagement,
					"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
					},
				success : function(data) {
					var result = data.APP_DATA;
				    $("#janaacApplicationId").html(result["janaacApplicationId"]);
					uploadDocuments('labDocRefAttach1',"lab test Doc Ref one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocRefAttach2',"lab test Doc Ref two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocRefAttach3',"lab test Doc Ref three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocRefAttach4',"lab test Doc Ref four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocRefAttach5',"lab test Doc Ref five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocRefAttach6',"lab test Doc Ref six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocRefAttach7',"lab test Doc Ref seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocResReqRefAttach1',"lab test Doc Res one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocResReqRefAttach2',"lab test Doc Res two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocResReqRefAttach3',"lab test Doc Res three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocResReqRefAttach4',"lab test Doc Res four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocResReqRefAttach5',"lab test Doc Res five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocResReqRefAttach6',"lab test Doc Res six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocResReqRefAttach7',"lab test Doc Res seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocProcessReqRefAttach1',"lab test Doc Pro one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocProcessReqRefAttach2',"lab test Doc Pro two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocProcessReqRefAttach3',"lab test Doc Pro three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocProcessReqRefAttach4',"lab test Doc Pro four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocProcessReqRefAttach5',"lab test Doc Pro five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocProcessReqRefAttach6',"lab test Doc Pro six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocProcessReqRefAttach7',"lab test Doc Pro seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocProcessReqRefAttach8',"lab test Doc Pro eight",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocProcessReqRefAttach9',"lab test Doc Pro nine",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocManagementReqRefAttach1',"lab test Doc manage one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocManagementReqRefAttach2',"lab test Doc manage two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocManagementReqRefAttach3',"lab test Doc manage three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocManagementReqRefAttach4',"lab test Doc manage four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocManagementReqRefAttach5',"lab test Doc manage five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocManagementReqRefAttach6',"lab test Doc manage six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocManagementReqRefAttach7',"lab test Doc manage seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocManagementReqRefAttach8',"lab test Doc manage eight",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('labDocManagementReqRefAttach9',"lab test Doc manage nine",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					
					if(!isSaveAndContinue){
					applicantInfo();
    	 		}
				
				},
				error : function(data) {
				},
			});
}
function accMediLabTestOtherReq() {
 paymentMethod=$("#paymentMethodTesting").val();
 representativeName=$("#applicantRepresentativeNameTesting").val();
 representativePosition=$("#applicantRepresentativePositionTesting").val();
 signDate=$("#applicantRepresentativeDateTesting").val();
janaacApplicationId = $("#janaacApplicationId").val();
	$.ajax({
				type : "POST",
				url : "${addAccMediLabOtherReq}",
				data : {
					"<portlet:namespace/>paymentMethod" : paymentMethod,
					"<portlet:namespace/>representativeName" : representativeName,
					"<portlet:namespace/>representativePosition" : representativePosition,
					"<portlet:namespace/>signDate" : signDate,
					"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
					},
				success : function(data) {
					 var result = data.APP_DATA;
			    $("#janaacApplicationId").html(result["janaacApplicationId"]);
			    uploadDocuments('applicantRepresentativeSignatureTestingBtn',"Accre Test representative signature",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
				},
				error : function(data) {
				},
			});
}
function accMediLabCalibrationApplicationInfo(isSaveAndContinue) {
	applicantName=$("#calibrationApplicantName").val();
	applicantAddress=$("#calibrationApplicantAddress").val();
	applicantTelephone=$("#calibrationApplicantTelephone").val();
	applicantFaxNo=$("#calibrationApplicantFax").val();
	applicantWebsite=$("#calibrationApplicantWebsite").val();
	laboratoryName=$("#calibrationLaboratoryName").val();
	laboratoryAddress=$("#calibrationAaboratoryAddress").val();
	personnelName=$("#calibrationPersonnelName").val();
	personnelEmail=$("#calibrationPersonnelEmail").val();
	personnelQMName=$("#calibrationPersonnelQMName").val();
	personnelQMEmail=$("#calibrationPersonnelQMEmail").val();
	deputyName=$("#calibrationDeputyName").val();
	deputyEmail=$("#calibrationDeputyEmail").val();
	personnelFMName=$("#calibrationPersonnelFMEmail").val();
	personnelFMEmail=$("#calibrationPersonnelFMEmail").val();
	accreditationRequest=$("input[name='calibrationAccreditationRequest']:checked").val();
	authorizedPersonnelName=$("#calibrationAuthorizedPersonnelName").val();
	authorizedPersonnelPosition=$("#calibrationAuthorizedPersonnelPosition").val();
	authorizedPersonnelDate=$("#calibrationAuthorizedPersonnelDate").val();
	janaacApplicationId = $("#janaacApplicationId").val();
	submitForm= true;
	if(!isSaveAndContinue){
		
		if(!authorizedPersonnelName){
			$("#calibrationAuthorizedPersonnelNameValidation").removeClass("hide");
			$("#calibrationAuthorizedPersonnelName").focus();
			submitForm= false;
		}else{
			$("#calibrationAuthorizedPersonnelNameValidation").addClass("hide");
		}
		if(!applicantName){
			$("#calibrationApplicantNameValidation").removeClass("hide");
			$("#calibrationApplicantName").focus();
			submitForm= false;
		}else{
			$("#calibrationApplicantNameValidation").addClass("hide");
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
					addPersonnelResponsibleCalibrationDetail();
				}
				  var result = data.APP_DATA;
				    $("#janaacApplicationId").html(result["janaacApplicationId"]);
				    uploadDocuments('authorizedPersonnelCalibrationBtn',"Accre Lab Signature of Authorized Personnel",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
				    uploadDocuments('companyStampCalibrationBtn',"Accre Lab Company Stamp",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
				    $("#janaacFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			}, 
			error : function(data) {
			},
		});
	}
 }
function accMediLabCalibrationActivityDesc(isSaveAndContinue) {
	var clinicalActivities = new Array();
	  $("input:checkbox[name=calibrationClinicalActivity]:checked").each(function () {
		  clinicalActivities.push($(this).val());
	 });	
    var testingClinicalActivity=clinicalActivities.toString();
    testingLaboratoryWorkShifts=$("#calibrationLaboratoryWorkShifts").val();
	janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${addAccMediLabTestingActivityDesc}",
					data : {
						"<portlet:namespace/>testingClinicalActivity" : testingClinicalActivity,
						"<portlet:namespace/>testingLaboratoryWorkShifts" : testingLaboratoryWorkShifts,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						},
					success : function(data) {
						if(!isSaveAndContinue){
					      applicantInfo();
					      addCalibrationSpecimenCollectionDetail();
    	 		}
					},
					error : function(data) {
					},
				});
 }
function accMediLabCalibrationStructuralReq(isSaveAndContinue) {
 testingLaboratoryLegalEntity = $("input[name='calibrationLaboratoryLegalEntity']:checked").val();
 testingLaboratoryLegalEntityDefine=$("#calibrationLaboratoryLegalEntityDefine").val();
 testingLaboratoryPartOfOrg =$("input[name='calibrationLaboratoryPartOfTesting']:checked").val();
 testingLaboratoryPartOfOrgName=$("#calibrationLaboratoryPartOfOrgName").val();
 testingLaboratoryPartOfOrgPosition=$("#calibrationLaboratoryPartOfOrgPosition").val();
 testingManagerialStaffSize=$("#calibrationManagerialStaffSize").val();
 testingTechnicalStaffSize=$("#calibrationTechnicalStaffSize").val();
 testingRelevantDocuments=$("#allRelevantDocuments").val();
 majorIncomeSourceTesting=$("#calibrationMajorIncomeSource").val();
 testingLaboratoryClients=$("#calibrationLaboratoryClients").val();
janaacApplicationId = $("#janaacApplicationId").val();
	$.ajax({
				type : "POST",
				url : "${addAccMediLabTestStructuralReq}",
				data : {
					"<portlet:namespace/>testingLaboratoryLegalEntity" : testingLaboratoryLegalEntity,
					"<portlet:namespace/>testingLaboratoryLegalEntityDefine" : testingLaboratoryLegalEntityDefine,
					"<portlet:namespace/>testingLaboratoryPartOfOrg" : testingLaboratoryPartOfOrg,
					"<portlet:namespace/>testingLaboratoryPartOfOrgName" : testingLaboratoryPartOfOrgName,
					"<portlet:namespace/>testingLaboratoryPartOfOrgPosition" : testingLaboratoryPartOfOrgPosition,
					"<portlet:namespace/>testingManagerialStaffSize" : testingManagerialStaffSize,
					"<portlet:namespace/>testingTechnicalStaffSize" : testingTechnicalStaffSize,
					"<portlet:namespace/>testingRelevantDocuments" : testingRelevantDocuments,
					"<portlet:namespace/>majorIncomeSourceTesting" : majorIncomeSourceTesting,
					"<portlet:namespace/>testingLaboratoryClients" : testingLaboratoryClients,
					"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
					},
				success : function(data) {
					 uploadDocuments('normativeDocumentsCaliber',"Normatives Documents Caliber",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
					if(!isSaveAndContinue){
					 applicantInfo();
					 addStaffDetailCalibration();
					 addScopeForCalibrationsDetail();
    	 		}
				},
				error : function(data) {
				},
			});
}
function accMediLabCalibrationResourceReq(isSaveAndContinue) {
 testExternalPersonnel=$("#calibrationExternalPersonnel").val();
 testCompetenceRequirements=$("#calibrationCompetenceRequirements").val();
 testLabFacilities=$("#laboratoryCalibrationFacilities").val();
 testLabContractedFacilities=$("#laboratoryCalibratioContractedFacilities").val();
 testLabFacilityEnvReq=$("#calibrationLaboratoryFacilityEnvReq").val();
 testSpecialEnvConditions=$("#calibrationSpecialEnvConditions").val();
 testMonitoringActivities=$("#calibrationMonitoringActivities").val();
 testLabRelatedEquipment=$("#calibrationLaboratoryRelatedEquipment").val();
 testSecurityArrangements=$("#calibrationSecurityArrangements").val();
janaacApplicationId = $("#janaacApplicationId").val();
	$.ajax({
				type : "POST",
				url : "${addAccMediLabTestResourceReq}",
				data : {
					"<portlet:namespace/>testExternalPersonnel" : testExternalPersonnel,
					"<portlet:namespace/>testCompetenceRequirements" : testCompetenceRequirements,
					"<portlet:namespace/>testLabFacilities" : testLabFacilities,
					"<portlet:namespace/>testLabContractedFacilities" : testLabContractedFacilities,
					"<portlet:namespace/>testLabFacilityEnvReq" : testLabFacilityEnvReq,
					"<portlet:namespace/>testSpecialEnvConditions" : testSpecialEnvConditions,
					"<portlet:namespace/>testMonitoringActivities" : testMonitoringActivities,
					"<portlet:namespace/>testLabRelatedEquipment" : testLabRelatedEquipment,
					"<portlet:namespace/>testSecurityArrangements" : testSecurityArrangements,
					"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
					},
				success : function(data) {
					if(!isSaveAndContinue){
					 applicantInfo();
					 addActivityPerformedLocCalibrationDetail();
					 addMajorEquipmentCalibrationDetail();
    	 		}
				},
				error : function(data) {
				},
			});
}
function accMediLabCalibrationManagementSysReq(isSaveAndContinue) {
 policiesForFulfil = $("input[name='managementSystemCalibrationOne']:checked").val();
 labDocRefPolicies=$("#calibrationLabDocRefOne").val();
 impartialityProvision =$("input[name='managementSystemCalibrationTwo']:checked").val();
 labDocRefImpartProv=$("#calibrationLabDocRefTwo").val();
 confidientialityProv = $("input[name='managementSystemCalibrationThree']:checked").val();
 labDocRefConfid=$("#calibrationLabDocRefThree").val();
 commitmentEvidence = $("input[name='managementSystemCalibrationFour']:checked").val();
 labDocRefCommitment=$("#calibrationLabDocRefFour").val();
 referenceEvidence = $("input[name='managementSystemCalibrationFive']:checked").val();
 labDocRefReference=$("#calibrationLabDocRefFive").val();
 docDescribingRole = $("input[name='managementSystemCalibrationSix']:checked").val();
 labDocRefDocDes=$("#calibrationLabDocRefSix").val();
 rolesofPersonnel = $("input[name='managementSystemCalibrationSeven']:checked").val();
 labDocRefRoles=$("#calibrationLabDocRefSeven").val();	
 competenceReq = $("input[name='calibrationManagSysReqResDocOne']:checked").val();
 labDocRefCompetence=$("#calibrationLabDocResReqRefOne").val();
 selectionOfPerson = $("input[name='calibrationManagSysReqResDocTwo']:checked").val();
 labDocRefSelection=$("#calibrationLabDocResReqRefTwo").val();
 handlingEquip = $("input[name='calibrationManagSysReqResDocThree']:checked").val();
 labDocRefHandling=$("#calibrationLabDocResReqRefThree").val();
 calibrationProgram = $("input[name='calibrationManagSysReqResDocFour']:checked").val();
 labDocRefCalibrat=$("#calibrationLabDocResReqRefFour").val();
 approvingReq = $("input[name='calibrationManagSysReqResDocFive']:checked").val();
 labDocRefApproving=$("#calibrationLabDocResReqRefFive").val();
 monitorPerformance = $("input[name='calibrationManagSysReqResDocSix']:checked").val();
 labDocRefMonitor=$("#calibrationLabDocResReqRefSix").val();
 ensuringService = $("input[name='calibrationManagSysReqResDocSeven']:checked").val();
 labDocRefEnsuring=$("#calibrationLabDocResReqRefSeven").val();
 reviewOfRequest = $("input[name='calibrationManagSysReqProcessDocOne']:checked").val();
 labDocRefRequest=$("#calibrationLabDocProcessReqRefOne").val();
 procedureForLab = $("input[name='calibrationManagSysReqProcessDocTwo']:checked").val();
 labDocRefProcedure=$("#calibrationLabDocProcessReqRefTwo").val();
 testMethodValidat = $("input[name='calibrationManagSysReqProcessDocThree']:checked").val();
 labDocRefTestMethod=$("#calibrationLabDocProcessReqRefThree").val();
 samplingPlan = $("input[name='calibrationManagSysReqProcessDocFour']:checked").val();
 labDocRefSampling=$("#calibrationLabDocProcessReqRefFour").val();
 transportationReciept = $("input[name='calibrationManagSysReqProcessDocFive']:checked").val();
 labDocRefTransport=$("#calibrationLabDocProcessReqRefFive").val();
 uncertainityMeasure = $("input[name='calibrationManagSysReqProcessDocSix']:checked").val();
 labDocRefUncertain=$("#calibrationLabDocProcessReqRefSix").val();
 testResultValidity = $("input[name='calibrationManagSysReqProcessDocSeven']:checked").val();
 labDocReftestResult=$("#calibrationLabDocProcessReqRefSeven").val();
 complaints = $("input[name='calibrationManagSysReqProcessDocEight']:checked").val();
 labDocRefComplaints=$("#calibrationLabDocProcessReqRefEight").val();
 nonConformingWork = $("input[name='calibrationManagSysReqProcessDocNine']:checked").val();
 labDocRefNonConfirm=$("#calibrationLabDocProcessReqRefNine").val();
 uniqueIdentification = $("input[name='calibrationManagSysReqManagementDocOne']:checked").val();
 labDocRefUnique=$("#calibrationLabDocManagementReqRefOne").val();
 currentRevisionStatus = $("input[name='calibrationManagSysReqManagementDocTwo']:checked").val();
 labDocRefCurrentRev=$("#calibrationLabDocManagementReqRefTwo").val();
 docChangeIdentify = $("input[name='calibrationManagSysReqManagementDocThree']:checked").val();
 labDocRefDocChange=$("#calibrationLabDocManagementReqRefThree").val();
 recordControl = $("input[name='calibrationManagSysReqManagementDocFour']:checked").val();
 labDocRefRecordControl=$("#calibrationLabDocManagementReqRefFour").val();
 plannedAction = $("input[name='calibrationManagSysReqManagementDocFive']:checked").val();
 labDocRefPlanned=$("#calibrationLabDocManagementReqRefFive").val();
 imporvementOpportunity = $("input[name='calibrationManagSysReqManagementDocSix']:checked").val();
 labDocRefImprovement=$("#calibrationLabDocManagementReqRefSix").val();
 correctiveAction = $("input[name='calibrationManagSysReqManagementDocSeven']:checked").val();
 labDocRefCorrective=$("#calibrationLabDocManagementReqRefSeven").val();
 internalAudits = $("input[name='calibrationManagSysReqManagementDocEight']:checked").val();
 labDocRefInternal=$("#calibrationLabDocManagementReqRefEight").val();
 managementReview = $("input[name='calibrationManagSysReqManagementDocNine']:checked").val();
 labDocRefManagement=$("#calibrationLabDocManagementReqRefNine").val();
 janaacApplicationId = $("#janaacApplicationId").val();
	$.ajax({
				type : "POST",
				url : "${addAccMediLabTestManagementSysReq}",
				data : {
					 "<portlet:namespace/>policiesForFulfil" : policiesForFulfil,
						"<portlet:namespace/>labDocRefPolicies" : labDocRefPolicies,
						"<portlet:namespace/>impartialityProvision" : impartialityProvision,
						"<portlet:namespace/>labDocRefImpartProv" : labDocRefImpartProv,
						"<portlet:namespace/>confidientialityProv" : confidientialityProv,
						"<portlet:namespace/>labDocRefConfid" : labDocRefConfid,
						"<portlet:namespace/>commitmentEvidence" : commitmentEvidence,
						"<portlet:namespace/>labDocRefCommitment" : labDocRefCommitment,
						"<portlet:namespace/>referenceEvidence" : referenceEvidence,
						"<portlet:namespace/>labDocRefReference" : labDocRefReference,
						"<portlet:namespace/>docDescribingRole" : docDescribingRole,
						"<portlet:namespace/>labDocRefDocDes" : labDocRefDocDes,
						"<portlet:namespace/>rolesofPersonnel" : rolesofPersonnel,
						"<portlet:namespace/>labDocRefRoles" : labDocRefRoles,							
					    "<portlet:namespace/>competenceReq" : competenceReq,
						"<portlet:namespace/>labDocRefCompetence" : labDocRefCompetence,
						"<portlet:namespace/>selectionOfPerson" : selectionOfPerson,
						"<portlet:namespace/>labDocRefSelection" : labDocRefSelection,
						"<portlet:namespace/>handlingEquip" : handlingEquip,
						"<portlet:namespace/>labDocRefHandling" : labDocRefHandling,
						"<portlet:namespace/>calibrationProgram" : calibrationProgram,
						"<portlet:namespace/>labDocRefCalibrat" : labDocRefCalibrat,
						"<portlet:namespace/>approvingReq" : approvingReq,
						"<portlet:namespace/>labDocRefApproving" : labDocRefApproving,
						"<portlet:namespace/>monitorPerformance" : monitorPerformance,
						"<portlet:namespace/>labDocRefMonitor" : labDocRefMonitor,
						"<portlet:namespace/>ensuringService" : ensuringService,
						"<portlet:namespace/>labDocRefEnsuring" : labDocRefEnsuring,							
						 "<portlet:namespace/>reviewOfRequest" : reviewOfRequest,
						 "<portlet:namespace/>labDocRefRequest" : labDocRefRequest,
						 "<portlet:namespace/>procedureForLab" : procedureForLab,
				   		 "<portlet:namespace/>labDocRefProcedure" : labDocRefProcedure,
						 "<portlet:namespace/>testMethodValidat" : testMethodValidat,
						 "<portlet:namespace/>labDocRefTestMethod" : labDocRefTestMethod,
						 "<portlet:namespace/>samplingPlan" : samplingPlan,
						 "<portlet:namespace/>labDocRefSampling" : labDocRefSampling,
						 "<portlet:namespace/>transportationReciept" : transportationReciept,
						 "<portlet:namespace/>labDocRefTransport" : labDocRefTransport,
						 "<portlet:namespace/>uncertainityMeasure" : uncertainityMeasure,
						 "<portlet:namespace/>labDocRefUncertain" : labDocRefUncertain,
						 "<portlet:namespace/>testResultValidity" : testResultValidity,
						 "<portlet:namespace/>labDocReftestResult" : labDocReftestResult,
				 		 "<portlet:namespace/>complaints" : complaints,
						"<portlet:namespace/>labDocRefComplaints" : labDocRefComplaints,
						"<portlet:namespace/>nonConformingWork" : nonConformingWork,
						"<portlet:namespace/>labDocRefNonConfirm" : labDocRefNonConfirm,								
						"<portlet:namespace/>uniqueIdentification" : uniqueIdentification,
						"<portlet:namespace/>labDocRefUnique" : labDocRefUnique,
						"<portlet:namespace/>currentRevisionStatus" : currentRevisionStatus,
						"<portlet:namespace/>labDocRefCurrentRev" : labDocRefCurrentRev,
						"<portlet:namespace/>docChangeIdentify" : docChangeIdentify,
						"<portlet:namespace/>labDocRefDocChange" : labDocRefDocChange,
						"<portlet:namespace/>recordControl" : recordControl,
						"<portlet:namespace/>labDocRefRecordControl" : labDocRefRecordControl,
						"<portlet:namespace/>plannedAction" : plannedAction,
						"<portlet:namespace/>labDocRefPlanned" : labDocRefPlanned,
						"<portlet:namespace/>imporvementOpportunity" : imporvementOpportunity,
						"<portlet:namespace/>labDocRefImprovement" : labDocRefImprovement,
						"<portlet:namespace/>correctiveAction" : correctiveAction,
						"<portlet:namespace/>labDocRefCorrective" : labDocRefCorrective,
						"<portlet:namespace/>internalAudits" : internalAudits,
						"<portlet:namespace/>labDocRefInternal" : labDocRefInternal,
						"<portlet:namespace/>managementReview" : managementReview,
						"<portlet:namespace/>labDocRefManagement" : labDocRefManagement,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
					},
					async: false,
				success : function(data) {
					var result = data.APP_DATA;
				    $("#janaacApplicationId").html(result["janaacApplicationId"]);
					uploadDocuments('calibrationLabDocRef1',"lab Cali Doc Ref one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocRef2',"lab Cali Doc Ref two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocRef3',"lab Cali Doc Ref three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocRef4',"lab Cali Doc Ref four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocRef5',"lab Cali Doc Ref five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocRef6',"lab Cali Doc Ref six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocRef7',"lab Cali Doc Ref seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocResReqRef1',"lab Cali Doc Res one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocResReqRef2',"lab Cali Doc Res two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocResReqRef3',"lab Cali Doc Res three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocResReqRef4',"lab Cali Doc Res four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocResReqRef5',"lab Cali Doc Res five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocResReqRef6',"lab Cali Doc Res six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocResReqRef7',"lab Cali Doc Res seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocProcessReqRef1',"lab Cali Doc Pro one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocProcessReqRef2',"lab Cali Doc Pro two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocProcessReqRef3',"lab Cali Doc Pro three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocProcessReqRef4',"lab Cali Doc Pro four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocProcessReqRef5',"lab Cali Doc Pro five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocProcessReqRef6',"lab Cali Doc Pro six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocProcessReqRef7',"lab Cali Doc Pro seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocProcessReqRef8',"lab Cali Doc Pro eight",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocProcessReqRef9',"lab Cali Doc Pro nine",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocManagementReqRef1',"lab Cali Doc manage one",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocManagementReqRef2',"lab Cali Doc manage two",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocManagementReqRef3',"lab Cali Doc manage three",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocManagementReqRef4',"lab Cali Doc manage four",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocManagementReqRef5',"lab Cali Doc manage five",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocManagementReqRef6',"lab Cali Doc manage six",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocManagementReqRef7',"lab Cali Doc manage seven",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocManagementReqRef8',"lab Cali Doc manage eight",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
					uploadDocuments('calibrationLabDocManagementReqRef9',"lab Cali Doc manage nine",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");	
					
					if(!isSaveAndContinue){
					applicantInfo();
    	 		}
				},
				error : function(data) {
				},
			});
}
function accMediLabCalibrationOtherReq() {
 paymentMethod=$("#paymentMethodCalibration").val();
 representativeName=$("#applicantRepresentativeNameCalibration").val();
 representativePosition=$("#applicantRepresentativePositionCalibration").val();
 signDate=$("#applicantRepresentativeDateCalibration").val();
janaacApplicationId = $("#janaacApplicationId").val();
	$.ajax({
				type : "POST",
				url : "${addAccMediLabOtherReq}",
				data : {
					"<portlet:namespace/>paymentMethod" : paymentMethod,
					"<portlet:namespace/>representativeName" : representativeName,
					"<portlet:namespace/>representativePosition" : representativePosition,
					"<portlet:namespace/>signDate" : signDate,
					"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
					},
				success : function(data) {
	$("#janaacApplicationId").html(result["janaacApplicationId"]);
    uploadDocuments('applicantRepresentativeSignatureCalibrationBtn',"Accre Cal representative signature",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
				},
				error : function(data) {
				},
			});
}
$(".hidePopup").click(function () {
	$(".editPersonnelResponsibleEditTabPopup").modal("hide");
	$(".editSpecimenCollectionEditTabPopup").modal("hide");
	$(".editPointCareTestingReqPoctEditTabPopup").modal("hide");
	$(".editKeyPersonnelEditTabPopup").modal("hide");
	$(".editSignatoryAuthorityEditTabPopup").modal("hide");
	$(".editExaminationsScopeEditTabPopup").modal("hide");
	$(".editMajorEquipmentEditTabPopup").modal("hide");
	$(".editApplicationActivityLocEditTabPopup").modal("hide");
	$(".editPersonnelResponsibleTestingEditTabPopup").modal("hide");
	$(".editTestingSpecimenCollectionEditTabPopup").modal("hide");
	$(".editStaffDetailTestingEditTabPopup").modal("hide");
	$(".editScopeForAccreditationEditTabPopup").modal("hide");
	$(".editActivityPerformedLocEditTabPopup").modal("hide");
	$(".editMajorEquipmentTestingEditTabPopup").modal("hide");
	$(".editPersonnelResponsibleCalibrationEditTabPopup").modal("hide");
	$(".editCalibrationSpecimenCollectionEditTabPopup").modal("hide");
	$(".editStaffDetailCalibrationEditTabPopup").modal("hide");
	$(".editScopeForCalibrationsEditTabPopup").modal("hide");
	$(".editActivityPerformedLocCalEditTabPopup").modal("hide");
	$(".editMajorEquipmentCalibrationEditTabPopup").modal("hide");
	$(".editPersonResponsibleCerEditTabPopup").modal("hide");
	$(".editRegisteredClientOrgEditTabPopup").modal("hide");
	$(".editStaffDetailCertificationEditTabPopup").modal("hide");
	$(".editAuditorListEditTabPopup").modal("hide");
	$(".editOutsourceActNatureEditTabPopup").modal("hide");
	$(".editActivityPerformLocationsEditTabPopup").modal("hide");
	$(".editPersonResponsibleCerProductEditTabPopup").modal("hide");
	$(".editRegisteredClientOrgCerProductEditTabPopup").modal("hide");
	$(".editStaffDetailCerProductEditTabPopup").modal("hide");
	$(".editAuditorListCerProductEditTabPopup").modal("hide");
	$(".editOutsourceActNatureCertProductEditTabPopup").modal("hide");
	$(".editPersonResponsibleCerBodiesEditTabPopup").modal("hide");
	$(".editRegisteredClientOrgCerBodiesEditTabPopup").modal("hide");
	$(".editStaffDetailCerBodiesEditTabPopup").modal("hide");
	$(".editAuditorListCerBodiesEditTabPopup").modal("hide");
	$(".editOutsourceActNatureCerBodiesEditTabPopup").modal("hide");
	$(".editPersonResponsibleInsBodiesEditTabPopup").modal("hide");
	$(".editInspectionPersonnelEditTabPopup").modal("hide");
	$(".editStaffDetailInsBodiesEditTabPopup").modal("hide");
	$(".editMajorEquipmentInsBodiesEditTabPopup").modal("hide");
	$(".editApplicationActivityLocInsBodiesEditTabPopup").modal("hide");
	$(".editAccreditationSoughtScopeEditTabPopup").modal("hide");
	$(".editPersonResponsibleThirdPartyEditTabPopup").modal("hide");
	$(".editRegisteredClientOrgThirdPartyEditTabPopup").modal("hide");
	$(".editStaffDetailThirdPartyEditTabPopup").modal("hide");
	$(".editAuditorListThirdPartyEditTabPopup").modal("hide");
	$(".editOutsourceActNatureThirdPartyEditTabPopup").modal("hide");
	$(".editActivityPerformedNoEditTabPopup").modal("hide");
});
</script>