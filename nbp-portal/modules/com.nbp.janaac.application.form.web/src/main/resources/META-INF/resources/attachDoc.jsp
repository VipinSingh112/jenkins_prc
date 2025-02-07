<%@page import="com.nbp.janaac.upload.document.commands.GettingUploadDoccumentData"%>
<%
//download link
String fulfillingRequirementsDocUrl = "";
String impartialityProvisionsDocUrl = "";
String provisionsConfidentialityDocUrl = "";
String implementationContinuousDocUrl = "";
String evidenceReferencesDocUrl = "";
String responsibilitiesInterrelationshipDocUrl = "";
String personnelResponsibilityDocUrl = ""; 
String competenceRequirementsDocUrl = "";
String trainingSupervisionDocUrl = "";
String handlingTransportDocUrl = "";
String calibrationProgrammeDocUrl = "";
String reviewingApprovingDocUrl = "";
String selectionEvaluationDocUrl = ""; 
String laboratoryRequirementsDocUrl = "";
String tendersContractsDocUrl = "";
String proceduresLaboratoryDocUrl = ""; 
String calibrationMethodsDocUrl = "";
String referenceSamplingPlanDocUrl = "";
String disposalCalibrationItemsDocUrl = "";
String uncertaintyMeasurementDocUrl = ""; 
String validityCalibrationResultsDocUrl = "";
String complaintsReferenceLaboratoryDocUrl = "";
String nonconformingWorkDocUrl = "";
String uniqueIdentificationDocUrl = "";
String identificationCurrentRevisionDocUrl = "";
String identificationChangesDocUrl = "";
String referenceRecordsDocUrl = "";
String plannedActionsRisksDocUrl = "";
String improvementsOpportunitiesDocUrl = "";
String correctiveActionActivitiesDocUrl = ""; 
String internalReferenceAuditsDocUrl = "";
String managementReviewsDocUrl = ""; 
//for download link
	try {
    fulfillingRequirementsDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc Ref one", themeDisplay.getScopeGroupId(), janaacApplicationId);    
   } catch (Exception e) {}

try {
    impartialityProvisionsDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc Ref two", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    provisionsConfidentialityDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc Ref three", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    implementationContinuousDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc Ref four", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    evidenceReferencesDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc Ref five", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    responsibilitiesInterrelationshipDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc Ref six", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    personnelResponsibilityDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc Ref seven", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    competenceRequirementsDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc Res one", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    trainingSupervisionDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc Res two", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    handlingTransportDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc Res three", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    calibrationProgrammeDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc Res four", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    reviewingApprovingDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc Res five", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    selectionEvaluationDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc Res six", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    laboratoryRequirementsDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc Res seven", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    tendersContractsDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc Pro one", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    proceduresLaboratoryDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc Pro two", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    calibrationMethodsDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc Pro three", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    referenceSamplingPlanDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc Pro four", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    disposalCalibrationItemsDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc Pro five", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    uncertaintyMeasurementDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc Pro six", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    validityCalibrationResultsDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc Pro seven", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    complaintsReferenceLaboratoryDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc Pro eight", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    nonconformingWorkDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc Pro nine", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    uniqueIdentificationDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc manage one", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    identificationCurrentRevisionDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc manage two", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    identificationChangesDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc manage three", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    referenceRecordsDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc manage four", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    plannedActionsRisksDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc manage five", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    improvementsOpportunitiesDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc manage six", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    correctiveActionActivitiesDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc manage seven", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    internalReferenceAuditsDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc manage eight", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

try {
    managementReviewsDocUrl = GettingUploadDoccumentData.getDocUrl(themeDisplay, "lab Cali Doc manage nine", themeDisplay.getScopeGroupId(), janaacApplicationId);    
} catch (Exception e) {}

//fda
String impartialityQualityOneUrl = "";
String impartialityQualityTwoUrl = "";
String impartialityQualityThreeUrl = "";
String impartialityQualityFourUrl = "";
String orgStruFirstUrl = "";
String orgStruSecUrl = "";
String orgStruFirstThreeUrl = "";
String approvalFirstUrl = "";
String approvalSecUrl = "";
String approvalThirdUrl = "";
String approvalFourUrl = "";
String approvalFiveUrl = "";
String approvalSixUrl = "";
String approvalSevenUrl = "";
String approvalEightUrl = "";
String approvalInfoOneUrl = "";
String approvalInfoTwoUrl = "";
String approvalInfoThreeUrl = "";
String approvalInfoFourUrl = "";
String approvalInfoFiveUrl = "";
String approvalInfoSixUrl = "";
String approvalInfoSevenUrl = "";
String approvalInfoEightUrl = "";
String approvalInfoNineUrl = "";
String approvalInfoTenUrl = "";
String approvalInfoElevenUrl = "";
String approvalInfTwelveUrl = "";
String approvalProOneUrl = "";
String approvalProTwoUrl = "";
String approvalProThreeUrl = "";
String approvalProfourUrl = "";
String approvalProFiveUrl = "";
String approvalProSixUrl = "";
String approvalProSevenUrl = "";
String approvalProEightUrl = "";
String approvalProNineUrl = "";
String approvalProTenUrl = "";
String approvalProElevenUrl = "";
String approvalProTwelveUrl = "";
String approvalProThirteenUrl = "";
String approvalProFourteenUrl = "";
String approvalProFiveteenUrl = "";
String approvalProSixteenUrl = "";
String approvalProSeventeenUrl = "";
String approvalManOneUrl = "";
String approvalManTwoUrl = "";
String approvalManThreeUrl = "";
String approvalManFourUrl = "";
String approvalManFiveUrl = "";
String approvalManSixUrl = "";
String approvalManSevenUrl = "";
String approvalManEightUrl = "";
String approvalManNineUrl = "";
try{
impartialityQualityOneUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval impartiality first", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
impartialityQualityTwoUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval impartiality second", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
impartialityQualityThreeUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval impartiality third", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
impartialityQualityFourUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval impartiality four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
orgStruFirstUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval org structure first", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
orgStruSecUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval org structure two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	orgStruFirstThreeUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval org structure three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalFirstUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval third party first", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalSecUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval third party second", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalThirdUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval third party third", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalFourUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval third party four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalFiveUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval third party five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalSixUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval third party six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalSevenUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval third party seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalEightUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval third party eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfoOneUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval info ref one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfoTwoUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval info ref two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfoThreeUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval info ref three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfoFourUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval info ref four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfoFiveUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval info ref five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfoSixUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval info ref six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfoSevenUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval info ref seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfoEightUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval info ref eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfoNineUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval info ref nine", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfoTenUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval info ref ten", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfoElevenUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval info ref eleven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfTwelveUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval info ref twelve", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
try{
	approvalProOneUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval cer pro ref one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProTwoUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval cer pro ref two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProThreeUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval cer pro ref three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProfourUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval cer pro ref four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProFiveUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval cer pro ref five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProSixUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval cer pro ref six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProSevenUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval cer pro ref seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProEightUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval cer pro ref eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProNineUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval cer pro ref nine", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProTenUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval cer pro ref ten", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProElevenUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval cer pro ref eleven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProTwelveUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval cer pro ref twelve", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProThirteenUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval cer pro ref thirteen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProFourteenUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval cer pro ref fourteen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProFiveteenUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval cer pro ref fivteen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProSixteenUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval cer pro ref sixteen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProSeventeenUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval cer pro ref seventeen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalManOneUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval man sys one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalManTwoUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval man sys two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalManThreeUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval man sys three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalManFourUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval man sys four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalManFiveUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval man sys five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalManSixUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval man sys six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalManSevenUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval man sys seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	approvalManEightUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval man sys eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalManNineUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "fda approval man sys nine", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

//Certificate I:-
String impartialityPolicyDocUrl = "";
String impartialityMitigationDocUrl = "";
String keyCertificationPersonnelDocUrl = "";
String committeesInvolvedDocUrl = "";
String partnershipsAgentsDocUrl = "";
String criteriaRequiredKnowledgeDocUrl = "";
String nitialCompetenceEvaluationDocUrl = "";
String authorizingAuditorsDocUrl = "";
String monitoringCompetenceDocUrl = "";
String technicalExpertsDocUrl = "";
String outsourcingCertificationDocUrl = "";
String outsourcedServicesDocUrl = "";
String publiclyAvailableAccessibleDocUrl = "";
String maintainingRenewingSuspendingDocUrl = "";
String managementSystemsCertificationDocUrl = "";
String certificationMarkLogoDocUrl = "";
String handlingRequestInformationDocUrl = "";
String ImpartialityPoliciesDocUrl = "";
String provisionsInformingDocUrl = "";
String certificationDocumentsDocUrl = "";
String productPackagingDocUrl = "";
String legallyEnforceableArrangementsDocUrl = "";
String ensuringConfidentialityDocUrl = "";
String mechanismsInformingClientsDocUrl = "";
String applicationProcessDocUrl = "";
String processApplicationReviewDocUrl1 = "";
String cycleAuditProgrammeDocUrl = "";
String determiningAuditTimeDocUrl = "";
String samplingProgrammePlanDocUrl = "";
String auditPlanningIncludeDocUrl = "";
String selectingAppointingDocUrl = "";
String processConductingDocUrl = "";
String auditReportSampleDocUrl = "";
String auditNonConformitiesDocUrl = "";
String auditResultsPriorDocUrl = "";
String transferCertificationDocUrl = "";
String withdrawalReductionDocUrl = "";
String suspensionWithdrawalDocUrl = "";
String decisionsAppealsDocUrl = "";
String procedureHandlingComplaintsDocUrl = "";
String recordRetentionPolicyDocUrl = "";
String recordRetentionProcedureDocUrl = "";
String managementSystemPoliciesDocUrl = "";
String managementSystemObjectivesDocUrl = "";
String manualEquivalentDocUrl = "";
String procedureDocumentControlDocUrl = "";
String procedureRecordControlDocUrl = "";
String managementReviewDocUrl1 = "";
String internauditsDocUrl = "";
String managementCorrectiveActionsDocUrl = "";
String ScopeQmsDocUrl = "";
String planningInputsControlsDocUrl = "";
String needsInterestedPartiesDocUrl = "";
String managementDocUrl = "";


try{
	impartialityPolicyDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man ref one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	impartialityMitigationDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man ref two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	keyCertificationPersonnelDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man struc one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	committeesInvolvedDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man struc two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	partnershipsAgentsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man struc three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	criteriaRequiredKnowledgeDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man resource one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	nitialCompetenceEvaluationDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man resource two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	authorizingAuditorsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man resource three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	monitoringCompetenceDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man resource four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	technicalExpertsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man resource five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	outsourcingCertificationDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man resource six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	outsourcedServicesDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man resource seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	publiclyAvailableAccessibleDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man info one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	maintainingRenewingSuspendingDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man info two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	managementSystemsCertificationDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man info three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	certificationMarkLogoDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man info four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	handlingRequestInformationDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man info five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	ImpartialityPoliciesDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man info six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	provisionsInformingDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man info seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	certificationDocumentsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man info eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	productPackagingDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man info nine", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	legallyEnforceableArrangementsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man info ten", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	ensuringConfidentialityDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man info eleven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	mechanismsInformingClientsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man info twelev", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	applicationProcessDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man process one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	processApplicationReviewDocUrl1=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man process two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	cycleAuditProgrammeDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man process three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	determiningAuditTimeDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man process four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	samplingProgrammePlanDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man process five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	auditPlanningIncludeDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man process six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	selectingAppointingDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man process seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	processConductingDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man process eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	auditReportSampleDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man process nine", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	auditNonConformitiesDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man process ten", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	auditResultsPriorDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man process eleven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	transferCertificationDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man process twelve", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	withdrawalReductionDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man process thirteen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	suspensionWithdrawalDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man process fourteen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	decisionsAppealsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man process fivteen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	procedureHandlingComplaintsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man process sixteen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	recordRetentionPolicyDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man process seventeen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	recordRetentionProcedureDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man process eighteen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	managementSystemPoliciesDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man system ref one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	managementSystemObjectivesDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man system ref two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	manualEquivalentDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man system ref three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	procedureDocumentControlDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man system ref four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	procedureRecordControlDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man system ref five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	managementReviewDocUrl1=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man system ref six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	internauditsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man system ref seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	managementCorrectiveActionsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man system ref eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	ScopeQmsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man system bref one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	planningInputsControlsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man system bref two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	needsInterestedPartiesDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man system bref three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	managementDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17021 man system bref four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
//Certi 2:-
String certificationAgreementDocUrl1="";
String impartialityMitigationMeasuresDocUrl1="";
String confidentialityQualityManualDocUrl="";
String publiclyAvailableInformationDocUrl1="";
String financialSupportFeesDocUrl="";
String rightsDutiesApplicantsDocUrl="";
String handlingComplaintsAppealsDocUrl="";
String dutiesResponsibilitiesAuthoritiesDocUrl="";
String termsReferenceOperationDocUrl="";
String mechanismSafeguardingImpartialityDocUrl1="";
String competenciesPersonnelInvolvedDocUrl="";
String contractPersonnelSampleDocUrl="";
String outsourcedServiceDocUrl="";
String qualificationAssessingDocUrl="";
String normativeDocumentsDocUrl="";
String applicationTemplateDocUrl="";
String processApplicationReviewDocUrl17065="";
String certificationIncludesProductDocUrl="";
String planEvaluationActivitiesDocUrl="";
String evaluationReviewSampleDocUrl="";
String certificationDecisionDocUrl="";
String certificationDocumentationSampleDocUrl="";
String directoryCertifiedClientsDocUrl="";
String decisionsComplaintsAppealsDocUrl="";
String generalManagementSystemDocUrl="";
String controlDocumentsDocUrl1="";
String controlRecordsDocUrl17065="";
String managementReviewDocUrl2="";
String internalAuditManageDocUrl="";
String correctiveManageActionDocUrl="";
String preventiveManageActionDocUrl="";
String keepingRequirementsDocUrl="";

try{
	certificationAgreementDocUrl1=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man ref one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		impartialityMitigationMeasuresDocUrl1=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man ref two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		confidentialityQualityManualDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man ref three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		publiclyAvailableInformationDocUrl1=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man ref four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		financialSupportFeesDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man ref five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		rightsDutiesApplicantsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man ref six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		handlingComplaintsAppealsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man ref seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		dutiesResponsibilitiesAuthoritiesDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man struct one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		termsReferenceOperationDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man struct two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		mechanismSafeguardingImpartialityDocUrl1=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man struct three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		competenciesPersonnelInvolvedDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man resource one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		contractPersonnelSampleDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man resource two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		outsourcedServiceDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man resource three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		qualificationAssessingDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man resource four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		normativeDocumentsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man process one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		applicationTemplateDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man process two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		processApplicationReviewDocUrl17065=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man process three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		certificationIncludesProductDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man process four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		planEvaluationActivitiesDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man process five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		evaluationReviewSampleDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man process six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		certificationDecisionDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man process seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		certificationDocumentationSampleDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man process eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		directoryCertifiedClientsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man process nine", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		decisionsComplaintsAppealsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man process ten", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		generalManagementSystemDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man system one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		controlDocumentsDocUrl1=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man system two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		controlRecordsDocUrl17065=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man system three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		managementReviewDocUrl2=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man system four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		internalAuditManageDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man system five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		correctiveManageActionDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man system six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		preventiveManageActionDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man system seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		keepingRequirementsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17065 man require one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	//Certi-3:-
 String certificationAgreementDocUrl="";
String impartialityMitigationMeasuresDocUrl="";
String confidentialityDocUrl = "";
String securityDocUrl = "";
String publiclyAvailableInformationDocUrl="";
String certificationExaminersDocUrl = "";
String PreRequisitesCertificationDocUrl = "";
String bodyIncludingAdvertisingDocUrl = "";
String policiesProceduresHandlingDocUrl = "";
String proceduresHandlingComplaintsDocUrl = "";
String authoritiesManagementDocUrl = "";
String operationCommitteesDocUrl = "";
String mechanismSafeguardingImpartialityDocUrl="";
String competenciesExaminersDocUrl = "";
String contractExaminerSampleDocUrl = "";
String providesOutsourcedServiceDocUrl = "";
String recordsQualificationDocUrl = "";
String otherNormativeDocumentsDocUrl = "";
String applicationSampleTemplateDocUrl = "";
String processApplicationReviewDocUrl="";
String processIncludingRecertificationDocUrl = "";
String examinationProcessDocUrl = "";
String certificationsDecisionDocUrl = "";
String certificationDocumentationDocUrl = "";
String certificatesLogosMarksDocUrl = "";
String suspensionsDocUrl = "";
String decisionsAppealsComplaintsDocUrl = "";
String generalManagementSystemDocumentationDocUrl = "";
String controlDocumentsDocUrl="";
String controlRecordsDocUrl="";
String managementReviewDocUrl3="";
 String internalAuditsDocUrl17024="";
String correctiveActionsDocUrl1 = "";
String preventiveActionsDocUrl1 = "";
String keepingRequirementsIsoDocUrl1 = "";


	try{
		certificationAgreementDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man ref one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		impartialityMitigationMeasuresDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man ref two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		confidentialityDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man ref three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		securityDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man ref four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		publiclyAvailableInformationDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man ref five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		certificationExaminersDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man ref six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		PreRequisitesCertificationDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man ref seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		bodyIncludingAdvertisingDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man struct eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		policiesProceduresHandlingDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man struct nine", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		proceduresHandlingComplaintsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man struct ten", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		authoritiesManagementDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man struc one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		operationCommitteesDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man struc two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		mechanismSafeguardingImpartialityDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man struc three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		competenciesExaminersDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man resource one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		contractExaminerSampleDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man resource two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		providesOutsourcedServiceDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man resource three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		recordsQualificationDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man resource four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		otherNormativeDocumentsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man process one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		applicationSampleTemplateDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man process two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		processApplicationReviewDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man process three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		processIncludingRecertificationDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man process four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		examinationProcessDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man process five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		certificationsDecisionDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man process six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		certificationDocumentationDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man process seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		certificatesLogosMarksDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man process eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	try{
		suspensionsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man process nine", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		decisionsAppealsComplaintsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man process ten", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		generalManagementSystemDocumentationDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man system one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		controlDocumentsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man system two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		controlRecordsDocUrl=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man system three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		managementReviewDocUrl3=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man system four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		internalAuditsDocUrl17024=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man system five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		correctiveActionsDocUrl1=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man system six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		preventiveActionsDocUrl1=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man system seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		keepingRequirementsIsoDocUrl1=GettingUploadDoccumentData.getDocUrl(themeDisplay, "cert 17024 man requirement one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}

%>