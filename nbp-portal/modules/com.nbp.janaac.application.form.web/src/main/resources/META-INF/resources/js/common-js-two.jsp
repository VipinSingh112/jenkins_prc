<%@ include file="../init.jsp" %>
<script>
function openSaveToDraftPopup(){
	$(".savecountinuePopup").modal("show");
	currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
	lastFormDetailsStep = $(".tab-pane.active").attr("id");
	/* New popup code */
	typeOFAccreditationService="";
    typeOfAccreditation = $("#accreditationTypeVal").val();
    janaacTransactionType=$("#janaacTransactionTypeVal").val();
    janaacApplicationId = $("#janaacApplicationId").val();
    if(currentStage == "SUPPORTING DOCUMENTS"){
    	uploadDocuments('janaacGenericUpload',"Generic Documents");
	   }
	   if(currentStage=="APPLICATION FEES PAYMENT"){
		   uploadDocuments('janaacGenericUpload',"Generic Documents");
		   submitFeeDetailsInJanaac();
		  }
    if(typeOfAccreditation == "Accreditation for Labs"){
    	typeOFAccreditationService = $("#laboratoriesAccreditationVal").val();
		if(typeOFAccreditationService == "Accreditation of Medical Labs to the ISO 15189 Standard"){
			 /* currentFormToSaveAccHotel = $("#janaacFormsFieldset .laboratories-medical#side-tabs").find(".active span:nth-child(2)").text(); */
			 currentFormToSaveLabMed =$("#janaacFormsFieldset ul.laboratories-medical").find(".active span:nth-child(2)").text();
			 if(currentFormToSaveLabMed == "Application Information"){
				 addPersonnelResponsibleDetail();
				 accMediLabApplicationInfo(true);
				 uploadDocuments('authorizedPersonnelBtn',"Signature of Authorized Personnel",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
				 uploadDocuments('companyStampBtn',"Application Company Stamp",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
			 }else if(currentFormToSaveLabMed == "Description of Activities"){
				 addSpecimenCollectionDetail();
				 addPointCareTestingDetail();
				 accMediLabDescriptionOfActivity(true);
			 }else if(currentFormToSaveLabMed == "The Organization"){
				 addKeyPersonnelDetails();
				 addSignatoryAuthorityDetail();
				 addExaminationsScopeDetail();
				 accMediLabOrganizationInfo(true);
			 }else if(currentFormToSaveLabMed == "Human Resources"){
				 uploadDocuments('keyMemberResume',"Resume Human Resource",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				 applicantInfo(true);
				
			 }else if(currentFormToSaveLabMed == "Physical Resources"){
				 addMajorEquipmentDetail();
				 addApplicationActivityLocDetail();
				 accMediLabPhysicalResource(true);
			 }else if(currentFormToSaveLabMed == "Management System Requirements"){
				 accMediLabManagementSysReq(true);
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
			 }else if(currentFormToSaveLabMed == "Other Requirements"){
				 accMediLabOtherReq();
				 uploadDocuments('applicantRepresentativeSignatureBtn',"Accre Medical representative signature",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
			 }
			
		}else if(typeOFAccreditationService == "Accreditation of Testing Labs to the ISO/IEC 17025 Standard"){
			currentFormToSaveLabTesting = $("#janaacFormsFieldset ul.laboratories-testing").find(".active span:nth-child(2)").text();
			if(currentFormToSaveLabTesting == "Application Information"){
				addPersonnelResponsibleTestingDetail();
				 accMediLabTestingApplicationInfo(true);
				 uploadDocuments('authorizedPersonnelTestingBtn',"Accer Test Signature of Authorized Personnel",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
				 uploadDocuments('companyStampTestingBtn',"Accer Test Company Stamp",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
			 }else if(currentFormToSaveLabTesting == "Description of Activities"){
				 addTestingSpecimenCollectionDetail();
				 accMediLabTestingActivityDesc(true);
			 }else if(currentFormToSaveLabTesting == "Structural Requirements"){
				 addScopeForAccreditationDetail();
				 addStaffDetail();
				 accMediLabTestStructuralReq(true);
				 uploadDocuments('normativeDocuments',"Normatives Documents",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
			 }else if(currentFormToSaveLabTesting == "Resource Requirements"){
				 addActivityPerformedLocDetail();
				 addMajorEquipmentTestingDetail();
				 accMediLabTestResourceReq(true);
			 }else if(currentFormToSaveLabTesting == "Management System Requirements"){
				 accMediLabTestManagementSysReq(true);
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
			 }else if(currentFormToSaveLabTesting == "Other Requirements"){
				 accMediLabTestOtherReq();
				 uploadDocuments('applicantRepresentativeSignatureTestingBtn',"Accre Test representative signature",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
			 }
			
		}else if(typeOFAccreditationService == "Accreditation of Calibration Labs to the ISO/IEC 17025 Standard"){
			currentFormToSaveLabCalib = $("#janaacFormsFieldset ul.laboratories-calibration").find(".active span:nth-child(2)").text();
			if(currentFormToSaveLabCalib == "Application Information"){
				 addPersonnelResponsibleCalibrationDetail();
				 accMediLabCalibrationApplicationInfo(true);
				 uploadDocuments('authorizedPersonnelCalibrationBtn',"Accre Lab Signature of Authorized Personnel",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
				 uploadDocuments('companyStampCalibrationBtn',"Accre Lab Company Stamp",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
			 }else if(currentFormToSaveLabCalib == "Description of Activities"){
				 addCalibrationSpecimenCollectionDetail();
				 accMediLabCalibrationActivityDesc(true);
			 }else if(currentFormToSaveLabCalib == "Structural Requirements"){
				 addStaffDetailCalibration();
				 addScopeForCalibrationsDetail();
				 accMediLabCalibrationStructuralReq(true);
				 uploadDocuments('normativeDocumentsCaliber',"Normatives Documents Caliber",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
			 }else if(currentFormToSaveLabCalib == "Resource Requirements"){
				 addActivityPerformedLocCalibrationDetail();
				 addMajorEquipmentCalibrationDetail();
				 accMediLabCalibrationResourceReq(true);
			 }else if(currentFormToSaveLabCalib == "Management System Requirements"){
				 accMediLabCalibrationManagementSysReq(true);
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
					
			 }else if(currentFormToSaveLabCalib == "Other Requirements"){
				 accMediLabCalibrationOtherReq();
				 uploadDocuments('applicantRepresentativeSignatureCalibrationBtn',"Accre Cal representative signature",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
			 }
			
		} 
	}
    if(typeOfAccreditation == "Accreditation for Certification Bodies"){
    	typeOFAccreditationService = $("#certificationAccreditationVal").val();
		
		if(typeOFAccreditationService == "Accreditation of Certification Bodies to the ISO/IEC 17021-1 Standard"){
			 currentFormToSaveCertificate = $("#janaacFormsFieldset ul.certification-management").find(".active span:nth-child(2)").text();
			 if(currentFormToSaveCertificate == "Application Information"){
				 addPersonResponsibleCerDetail();
				 accCerBodiesApplicationInfo(true);
				 uploadDocuments('authorizedPersonnelManagementBtn',"Signature of Authorized Personnel Certfi Bodies",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
				 uploadDocuments('companyStampManagementBtn',"Company Seals Certfi Bodies",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
			 }else if(currentFormToSaveCertificate == "General"){
				 accCertificationBodiesGeneral(true);
			 }else if(currentFormToSaveCertificate == "Scope, Services, Clients and Interested Parties"){
				 addRegisteredClientOrgDetail();
				 accCerBodiesScopeService(true);
			 }else if(currentFormToSaveCertificate == "Personnel and Resources"){
				 addStaffDetailCertification();
				 addAuditorList();
				 addOutsourceActNature();
				 addActivityPerformLocations();
				 accCerBodyPersonnelResource();(true);
			 }else if(currentFormToSaveCertificate == "Information"){
				 accCerBodyInformation(true);
			 }else if(currentFormToSaveCertificate == "Management System Requirements"){
				 accCerBodiesManagementSysReq(true);
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
			 }else if(currentFormToSaveCertificate == "Other Requirements"){
				 accCerBodiesOtherReq();
				 uploadDocuments('applicantRepresentativeCerSignatureBtn',"Accre Certi Bodies 17021 representative signature",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
			 }
			
		}else if(typeOFAccreditationService == "Accreditation of Certification Bodies to the ISO/IEC 17065 Standard"){
			currentFormToSaveProduct = $("#janaacFormsFieldset ul.certification-product").find(".active span:nth-child(2)").text();
			if(currentFormToSaveProduct == "Application Information"){
				 addPersonResponsibleCerProductDetail();
				 accCerBodiesProductAppliInfo(true);
				 uploadDocuments('authorizedPersonnelCerProductBtn',"Accre Certi 17065 Signature Authorized Personnel",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
				 uploadDocuments('companyStampCerProductBtn',"Accre Certi 17065 Company Stamp",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
			 }else if(currentFormToSaveProduct == "General"){
				 accCerBodiesProductGeneral(true);
			 }else if(currentFormToSaveProduct == "Scope, Services, Clients and Interested Parties"){
				 addRegisteredClientOrgCerProductDetail();
				 accCerBodiesProductScopeService(true);
			 }else if(currentFormToSaveProduct == "Organization, Personnel and Resources"){
				 addStaffDetailCerProduct();
				 addAuditorListCerProduct();
				 addOutsourceActNatureCertProduct();
				 accCerBodyProductOrgPersonnel(true);
			 }else if(currentFormToSaveProduct == "Information"){
				 accCerBodyProductInformation(true);
			 }else if(currentFormToSaveProduct == "Management System Requirements"){
				 accCerBodyProductManageSysReq(true);
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
					
			 }else if(currentFormToSaveProduct == "Other Requirements"){
				 accCerBodiesProductOtherReq();
				 uploadDocuments('applicantRepresentativeCerProSignatureBtn',"Accre Certi 17065 Applicant Representative Signature",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
			 }
		}else if(typeOFAccreditationService == "Accreditation of Certification Bodies to the ISO/IEC 17024 Standard"){
			currentFormToSaveBodies = $("#janaacFormsFieldset ul.certification-bodies").find(".active span:nth-child(2)").text();
			if(currentFormToSaveBodies == "Application Information"){
				addPersonResponsibleCerBodiesDetail();
				 accCerBodiesAppliInfo(true);
				 uploadDocuments('authorizedPersonnelCerBodiesBtn',"Accre Cert 17024 Signature of Authorized",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
				 uploadDocuments('companyStampCerBodiesBtn',"Accre Cert 17024 Company Stamp",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
			 }else if(currentFormToSaveBodies == "General"){
				 accCertiBodiesGeneral(true);
			 }else if(currentFormToSaveBodies == "Scope, Services, Clients and Interested Parties"){
				 addRegisteredClientOrgCerBodiesDetail();
				 accCertiBodiesScopeService(true);
			 }else if(currentFormToSaveBodies == "Organization, Personnel and Resources"){
				 addStaffDetailCerBodies();
				 addAuditorListCerBodies();
				 addOutsourceActNatureCerBodies();
				 accCerBodyOrgPersonnel(true);
			 }else if(currentFormToSaveBodies == "Information"){
				 accCertiBodyInformation(true);
			 }else if(currentFormToSaveBodies == "Management System Requirements"){
				 accCerBodiesManagementSystemReq(true);
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
					
			 }else if(currentFormToSaveBodies == "Other Requirements"){
				 accCertiBodiesOtherReq();
				 uploadDocuments('applicantRepresentativeCerBodiesSignatureBtn',"cert 17024 second cat rep sign",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
			 }
		} 
    }
    if(typeOfAccreditation == "Accreditation for Inspection Bodies"){
    	typeOFAccreditationService = $("#inspectingAccreditationVal").val();
		
		if(typeOFAccreditationService == "Accreditation of Inspection Bodies to the ISO/IEC 17020 Standard"){
			 currentFormToSaveInspection = $("#janaacFormsFieldset ul.inspection-bodies").find(".active span:nth-child(2)").text();
			 if(currentFormToSaveInspection == "Application Information"){
				 addPersonResponsibleInsBodiesDetail();
				 accInsBodiesApplicationInfo(true);
				 uploadDocuments('authorizedPersonnelInsBodiesBtn',"Signature of Third Cat Authorized",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
				 uploadDocuments('companyStampInsBodiesBtn',"Signature of Third Cat Company stamps",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
			 }else if(currentFormToSaveInspection == "The Organization"){
				 addInspectionPersonnelDetails();
				 addStaffDetailInsBodies();
				 addAccreditationSoughtScope();
				 accInsBodiesOrganization(true);
			 }else if(currentFormToSaveInspection == "Human Resources"){
				 uploadDocuments('keyMemberResumeInsBodies',"Resume Human Resource Ins",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
				 applicantInfo(true);
			 }else if(currentFormToSaveInspection == "Physical Resources - Facilities, Equipment"){
				 addMajorEquipmentInsBodiesDetail();
				 addApplicationActivityLocInsBodiesDetail();
				 accInsBodiesPhysicalResource(true);
			 }else if(currentFormToSaveInspection == "Management System Requirements"){
				 accInsBodiesManagementSysReq(true);
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
			 }else if(currentFormToSaveInspection == "Other Requirements"){
				 accInsBodiesOtherReq();
				 uploadDocuments('applicantRepresentativeInsBodiesSignatureBtn',"Signature of Third Cat Applicant representative",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
			 }
		}
    }
    if(typeOfAccreditation == "FDA Approvals"){
    	typeOFAccreditationService = $("#thirdPartyAccreditationVal").val();
		
		if(typeOFAccreditationService == "FDA TPP Accreditation of 3rd Party Certification Bodies Under the FDA-Food Safety Modernisation Act (FSMA)"){
			 currentFormToSaveThirdParty = $("#janaacFormsFieldset ul.third-party-cer").find(".active span:nth-child(2)").text();
			 if(currentFormToSaveThirdParty == "Application Information"){
				 addPersonResponsibleThirdPartyDetail();
				 accFDAThirdPartyAppliInfo(true);
				 uploadDocuments('authorizedPersonnelThirdPartyBtn',"Signature of Authorized Personnel Fda",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
				 uploadDocuments('companyStampThirdPartyBtn',"Application Company Stamp Fda",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
			 }else if(currentFormToSaveThirdParty == "General"){
				 accFDAThirdPartyGeneral(true);
			 }else if(currentFormToSaveThirdParty == "Scope, Clients and Interested Parties"){
				 addRegisteredClientOrgThirdPartyDetail();
				 accFDAThirdPartyScopeService(true);
			 }else if(currentFormToSaveThirdParty == "Personnel and Resources"){
				 addStaffDetailThirdParty();
				 addAuditorListThirdParty();
				 addOutsourceActNatureThirdParty();
				 addActivityPerformedLocThirdParty();
				 accThirdPersonnelResource(true);
			 }else if(currentFormToSaveThirdParty == "Information"){
				 accThirdPartyInformation(true);
			 }else if(currentFormToSaveThirdParty == "Management System Documentation"){
				 accThirdPartyManagementSysReq(true);
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
			 }else if(currentFormToSaveThirdParty == "Other Requirements"){
				 uploadDocuments('applicantRepresentativeThirdPartySignatureBtn',"Signature of Applicant Representive Fda",'<%=uloadFormDocumentUrl%>',janaacApplicationId);
				 accThirdPartyOtherReq(true);
			 }
		}
    }
	
	saveAndContinue = "true"; 
		$.ajax({
					type : "POST",
					url : "${pendingJanaacApplicationUrl}",
					data : {
						"<portlet:namespace/>typeOfAccreditation" : typeOfAccreditation,
						"<portlet:namespace/>typeOFAccreditationService" : typeOFAccreditationService,
						"<portlet:namespace/>janaacTransactionType" : janaacTransactionType,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>currentStage": currentStage,
				    	"<portlet:namespace/>lastFormDetailsStep": lastFormDetailsStep,
				    	"<portlet:namespace/>saveAndContinue": saveAndContinue,
						},
						async:false,
					success : function(data) {
						var result = data.APP_DATA;
				    	 $("#janaacApplicationId").val(result["janaacApplicationId"]);
							var applicationNumber = result["janaacAppNum"];
							var janaacDraftCategory = result["janaacCategory"];
							
							if (applicationNumber != null
									&& janaacDraftCategory != null) {
								$("#janaac_pop_app_no").html(result["janaacAppNum"]);
								$("#janaac_pop_category").html(result["janaacCategory"]);
							}
					},
					error : function(data) {
					},
				});
}
$(document).ready(function () {
    var selectedFiles = [];
    var selectedGenericFiles = [];
    
    function updateFileInput() {
        var newFileList = new DataTransfer();
        for (var i = 0; i < selectedFiles.length; i++) {
            newFileList.items.add(selectedFiles[i]);
        }
        $('#janaacGenericUpload')[0].files = newFileList.files;
    }

    function renderPreview() {
        $('#uploaded-documents-container').empty();
        counterOfDocAfterSaveAndCon=1;
        selectedFiles.forEach(function (file) {
            var documentContainer = $('<div class="document-container"></div>');
            var deleteButton = $(
            		  '<a class="uploaded-delete mr-2" onClick="deleteAfterSaveConDoc(this.id);" id="deleteButton' +
            		    counterOfDocAfterSaveAndCon +
            		    '" href="#">' +
            		    '<svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">' +
            		    '<path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#282524"></path>' +
            		    '</svg></a>'
            		);
            counterOfDocAfterSaveAndCon++;
            documentContainer.append(deleteButton);
            documentContainer.append('<span>' + file.name + '</span>');
            $('#uploaded-documents-container').append(documentContainer);
        });
    }

    $('#uploaded-documents-container').on('click', '.uploaded-delete', function (e) {
        e.preventDefault();
        var fileNameToRemove = $(this).next('span').text();
        selectedFiles = selectedFiles.filter(function (file) {
            return file.name !== fileNameToRemove;
        });
        renderPreview(); 
        updateFileInput();
    });

    $(document).on('change', '#janaacGenericUpload', function () {
        var files = $(this)[0].files;
        var newFiles = [];

        for (var i = 0; i < files.length; i++) {
            var selectedGenericFiles = $(".generic-document-list")
                .find("#document-name")
                .map(function () {
                    return $(this).html();
                })
                .get();
            var genericFileExists = selectedGenericFiles.some(function (genericFile) {
                return genericFile === files[i].name; 
            });
            
            var fileExists = selectedFiles.some(function (file) {
                return file.name === files[i].name;
            });
            var janaacApplicationId = "<%=janaacApplicationId%>";
        	if(janaacApplicationId > 0 ){
        		if (!fileExists && !genericFileExists) {
                    newFiles.push(files[i]);
                }
        	}else{
        		if (!fileExists) {
                    newFiles.push(files[i]);
                }
        	}
        }
        selectedFiles = selectedFiles.concat(newFiles); 
        renderPreview(); 
        updateFileInput();
        if (selectedFiles.length > 0) {
            $('.uploaded-delete').show();
            $(".noAdditionalSupportingDoc").hide();
            $(".final-submit, .download-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
            $("#janaacFormPreviewFieldset .custom_loader").removeClass("hide");
            $(".preview-section").addClass("hide");
        } else {
        	if($(".generic-document #uploaded-documents-container").find(".document-container").length == 0 && $(".generic-document").find(".supporting-document-card").length == 0){
            $('.uploaded-delete').hide();
            $(".noAdditionalSupportingDoc").show();
            $(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
            $("#janaacFormPreviewFieldset .custom_loader").addClass("hide");
            $(".preview-section").removeClass("hide");
        	}
        }
    });
});
function showFinalSubmitButton(){
	var currentFieldSet = $(".wizard-fieldset.show").attr("id");
	if(currentFieldSet == "janaacfeePaymentFieldset" || currentFieldSet == "janaacFormPreviewFieldset"){
        	$(".form-wizard-next-btn ").hide();
        	$(".form-wizard-save-btn").hide();
        	$(".final-submit").removeClass("hide");
        }else{
        	$(".form-wizard-next-btn").show();
        	$(".form-wizard-save-btn").show();
        	$(".final-submit").addClass("hide");
        }
}
function openSaveToSubmitPopup() {
	$(".final-submit-container").removeClass("hide");
	submitJanaacApplication();
}
$("#makePayment").click(function () {
	  $("#paymentPopUp").modal("show");
	});
$("#credit-card-method").click(function () {
  $("#payment-method-wrapper").addClass("hide");
  $("#credit-card-details").removeClass("hide");
  $("#payment-method").removeClass("hide");
  $("#payment-method span").html($(this).find(".wizard-title").html());
});
$("#direct-deposit-method, #bank-draft-method, #cash-method, #cheque-method, #other-method").click(function () {
  $("#payment-method-wrapper").addClass("hide");
  $("#payment-method").removeClass("hide");
  $("#payment-method span").html($(this).find(".wizard-title").html());
  $("#selected-payment-method").html($(this).find(".wizard-title").html());
  $("#selected-payment-method-inner").html(
    $(this).find(".wizard-title").html()
  );
  $("#all-other-payment-details").removeClass("hide");
});
$("#makePayment").click(function () {
  $("#paymentPopUp").modal("show");
});
$("#choose-payment-method").click(function () {
	$("#payment-method").addClass("hide");
	$("#all-other-payment-details").addClass("hide");
	$("#credit-card-details").addClass("hide");
	$("#payment-method-wrapper").removeClass("hide");
});

$("#payment-upload" ).change(function() {
	selectedfiles = this.files[0].name;
	$("#payment-file-chosen").html(selectedfiles);
	$(".fee-msg").removeClass("hide");
});
$("#payment-method-wrapper a").click(function(){
	oldPaymentProof = $("#paymentMethod").val();
	selectedPaymentProof = $(this).find(".wizard-title").html();
	$(".fee-method-preview").html(selectedPaymentProof);
	$("#paymentMethod").val($(this).find(".wizard-title").html());
	if(selectedPaymentProof != oldPaymentProof){
		$(".fee-payment-wrapper #payment-file-chosen").empty();
		$("#amountPaid, #amountCurrency").val("");
		$(".fee-payment-wrapper #payment-upload").val('');
	}
});
		
	function deleteDocument(fileEntryId) {
		var documentuploadCounter = $("#documentuploadCounter").val();
		$.ajax({
			type : "POST",
			url : '${miningDeleteDocumentUrl}',
			data : {
				"<portlet:namespace/>fileEntryId" : fileEntryId,
			},
			success : function(data) {
				$("#janaacDeletepopup" + fileEntryId).modal("hide");
				$("#unpload-info-card" + fileEntryId).remove();
				$("#documentUpload" + documentuploadCounter).removeClass("disabled");
			},
			error : function(data) {

			}
		});
	}
function expandDetails(id){
	var currentIsActive = $("#"+id).hasClass('is-active');
	$("#"+id).removeClass('is-active');
	$("#"+id).next('.accordion__body').removeClass('is-active');
	if (currentIsActive != 1) {
		$("#"+id).addClass('is-active');
		$("#"+id).next('.accordion__body').addClass('is-active');
	}
}
function applicantInfo(){
	janaacApplicationId = $("#janaacApplicationId").val();
	typeOfAccreditation = $("#accreditationTypeVal").val();
	 if(typeOfAccreditation == "Accreditation for Labs"){
	    uploadDocuments('keyMemberResume',"Resume Human Resource",'<%=uloadFormDocumentUrl%>',janaacApplicationId,"");
	 }
	  if(typeOfAccreditation == "Accreditation for Inspection Bodies"){
		  uploadDocuments('keyMemberResumeInsBodies',"Resume Human Resource Ins",'<%=uloadFormDocumentUrl%>',janaacApplicationId,""); 
	  }
	nextForm();
	pendingJanaacApplication();
}
function nextForm(){
	var $active = $('.nav-tabs li>.active');
	$active.parent().next().find('.nav-link').removeClass('disabled');
	$active.parent().next().find('.nav-link span').removeClass('gray');
	nextTab($active);
	const formSections = document.getElementsByClassName('form-wizard');
	for (const formSection of formSections) {
		formSection.scrollIntoView({ behavior: 'smooth', block: 'start' });
		}
}
function nextTab(elem) {
	$(elem).parent().next()
			.find('a[data-toggle="tab"]').click();
}
$(document).ready(function () {
	$('input[name="analystsName"],input[name="applicantTelephoneLicence"],input[name="laboratoryWorkShifts"],input[name="laboratoryFacilities"],input[name="laboratoryContractedFacilities"],input[name="laboratoryCalibrationFacilities"],input[name="laboratoryCalibratioContractedFacilities"],input[name="listOfStandard"],input[name="testingLaboratoryWorkShifts"],input[name="calibrationLaboratoryWorkShifts"],input[name="insBodyServiceOtherOrgClient"],input[name="listOfStandardThirdParty"]').tagsinput({
		trimValue: true,
		confirmKeys: [13],
		focusClass: 'my-focus-class'
	});
	
	$('.bootstrap-tagsinput input').on('focus', function() {
		$(this).closest('.bootstrap-tagsinput').addClass('has-focus');
	}).on('blur', function() {
		$(this).closest('.bootstrap-tagsinput').removeClass('has-focus');
	});
});
function previewMethod() {
    $("input, textarea, select").each(function() {
        $(this).each(function() {
            if($(this).val() != "") {
                let preId = $(this).prop('id') + "Preview";
                $("#" + preId).html($(this).val());
            }
        });
    });
    $("input[type='radio']").each(function() {
        $(this).each(function() {
            if($(this).is(":checked")) {
                let preId = $(this).prop('name') + "Preview";
                $("#" + preId).html($(this).val());
            }
        });
    });
    $("input[type='checkbox']").each(function() {
        $(this).each(function() {
            let checkedValues = ""; // Initialize an empty string to store checked values
            let checkboxName = $(this).prop('name'); // Get the name of the changed checkbox
            $("input[type='checkbox'][name='" + checkboxName + "']:checked").each(function() {
                checkedValues += $(this).val() + ", "; // Append the value of each checked checkbox
            });
            let preId = checkboxName + "Preview"; // Get the preview element's ID
            $("#" + preId).html(checkedValues.slice(0, -2)); // Update the preview element with checked values
        });
    });
}
$(function() {
	$(document).on('change', '#janaacEnrollDocuments', function() {
		var fileName = $(this).val();
		fileName = fileName.replace("C:\\fakepath\\", "");
		$(this).next('.custom-file-label').html(fileName);
	})
});

</script>