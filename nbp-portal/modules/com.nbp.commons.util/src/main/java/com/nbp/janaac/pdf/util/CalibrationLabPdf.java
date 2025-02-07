package com.nbp.janaac.pdf.util;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.journal.model.JournalArticle;
import com.liferay.journal.model.JournalArticleDisplay;
import com.liferay.journal.service.JournalArticleLocalServiceUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccMediLabApplicationInfo;
import com.nbp.janaac.application.form.service.model.AccMediLabOtherReq;
import com.nbp.janaac.application.form.service.model.AccMediLabTestDescription;
import com.nbp.janaac.application.form.service.model.AccMediLabTestManageReq;
import com.nbp.janaac.application.form.service.model.AccMediLabTestResourceReq;
import com.nbp.janaac.application.form.service.model.AccMediLabTestStructural;
import com.nbp.janaac.application.form.service.model.AddLabAppliInfo;
import com.nbp.janaac.application.form.service.model.AddLabCalibraStrucReqSec;
import com.nbp.janaac.application.form.service.model.AddLabDescOfActivity;
import com.nbp.janaac.application.form.service.model.AddLabResourceReqFirst;
import com.nbp.janaac.application.form.service.model.AddLabResourceReqSec;
import com.nbp.janaac.application.form.service.model.AddLabStructuralRequirement;
import com.nbp.janaac.application.form.service.model.JanaacApplication;
import com.nbp.janaac.application.form.service.model.JanaacApplicationPayment;
import com.nbp.janaac.application.form.service.service.AccMediLabApplicationInfoLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccMediLabOtherReqLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccMediLabTestDescriptionLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccMediLabTestManageReqLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccMediLabTestResourceReqLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccMediLabTestStructuralLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddLabAppliInfoLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddLabCalibraStrucReqSecLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddLabDescOfActivityLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddLabResourceReqFirstLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddLabResourceReqSecLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddLabStructuralRequirementLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.JanaacApplicationLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.JanaacApplicationPaymentLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

 
 public class CalibrationLabPdf {

	 public static String replaceSignatureForJanaac(long janaacApplicationId, String folderName, long groupId,
				long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
			DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
					"Accre Lab Signature of Authorized Personnel");
			List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
					signatureFolder.getFolderId());
			String previewUrl = "";
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
			}
			return previewUrl;
		}
		public static String replaceCompanySealForJanaac(long janaacApplicationId, String folderName, long groupId,
				long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
			DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
					"Accre Lab Company Stamp");
			List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
					signatureFolder.getFolderId());
			String previewUrl = "";
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
			}
			return previewUrl;
		}
		public static String replaceSignOtherForJanaac(long janaacApplicationId, String folderName, long groupId,
				long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
			DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
					"Accre Cal representative signature");
			List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
					signatureFolder.getFolderId());
			String previewUrl = "";
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
			}
			return previewUrl;
		}
	    public static String janaacCaliberationLabPdf(long janaacApplicationId, ThemeDisplay themeDisplay, String checkPdfDownloadWithoutDocument) {

	        String pdfTemplate = StringPool.BLANK;
	        DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
	        JanaacApplication janaacApplication = null;
	        AccMediLabApplicationInfo application = null;
	        List<AddLabAppliInfo> labAppliInfo = null;
	        AccMediLabTestDescription accMediDes = null;
	        List<AddLabDescOfActivity> descOfActivity = null;
	        AccMediLabTestStructural accMediStructural = null;
	        List<AddLabStructuralRequirement> labStuctInfo = null;
	        List<AddLabCalibraStrucReqSec> labCaliStrucInfo = null;
	        AccMediLabTestResourceReq mediLabTestResourceReq = null;
	        List<AddLabResourceReqFirst> labResourceReqfirstInfo = null;
	        List<AddLabResourceReqSec> labResourceReqSecInfo = null;
	        
	        AccMediLabTestManageReq accMediLabManagement=null;
	        AccMediLabOtherReq accLabOther=null;
	        JanaacApplicationPayment payment=null;
	        
	      //folder
			List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
			DLFolder supportingDocumentsFolder = null;
			DLFolder supportingDocumentsParentFolder = null;
			FileEntry fileEntry = null;
			
			 //Signatures 
			String signatureForAuthorizedPersonnel = null;
			String companySealCertificationBodies=null;
			String signatureOtherRequirement=null;
			
	        try {
	            janaacApplication = JanaacApplicationLocalServiceUtil.getJanaacApplication(janaacApplicationId);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        try {
	            application = AccMediLabApplicationInfoLocalServiceUtil.getApplicantInfo(janaacApplicationId);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        try {
	            labAppliInfo = AddLabAppliInfoLocalServiceUtil.getJanaacById(janaacApplicationId);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        try {
	            accMediDes = AccMediLabTestDescriptionLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        try {
	            descOfActivity = AddLabDescOfActivityLocalServiceUtil.getJanaacById(janaacApplicationId);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        try {
	            accMediStructural = AccMediLabTestStructuralLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        try {
	            labStuctInfo = AddLabStructuralRequirementLocalServiceUtil.getJanaacById(janaacApplicationId);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        try {
	            labCaliStrucInfo = AddLabCalibraStrucReqSecLocalServiceUtil.getJanaacById(janaacApplicationId);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        try {
	            mediLabTestResourceReq = AccMediLabTestResourceReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        try {
	            labResourceReqfirstInfo = AddLabResourceReqFirstLocalServiceUtil.getJanaacById(janaacApplicationId);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        try {
	        	labResourceReqSecInfo = AddLabResourceReqSecLocalServiceUtil.getJanaacById(janaacApplicationId);
	        } catch (Exception e) {
	        	e.printStackTrace();
	        }
	        try {
	        	accMediLabManagement = AccMediLabTestManageReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        try {
	        	accLabOther = AccMediLabOtherReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        try {
				payment =JanaacApplicationPaymentLocalServiceUtil.getJanaacById(janaacApplicationId);
			}catch (Exception e) {
			}

	        try {
	            supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(), 
	            		DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "JANAAC Supported Documents");
	            supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(), 
	            		supportingDocumentsParentFolder.getFolderId(), String.valueOf(janaacApplication.getJanaacApplicationId()));
	            supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
	            		supportingDocumentsFolder.getFolderId());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        try {
	            signatureForAuthorizedPersonnel = replaceSignatureForJanaac(janaacApplication.getJanaacApplicationId(), "Accre Lab Signature of Authorized Personnel", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        try {
	            companySealCertificationBodies = replaceCompanySealForJanaac(janaacApplication.getJanaacApplicationId(), "Accre Lab Company Stamp", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        try {
	            signatureOtherRequirement = replaceSignOtherForJanaac(janaacApplication.getJanaacApplicationId(), "Accre Cal representative signature", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        if (checkPdfDownloadWithoutDocument.equals("false")) {
				pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
						"weighing-device");
			} else {
				try {
				pdfTemplate = getTemplateFromJournalArticlePDF
						(themeDisplay.getScopeGroupId(),
						"accreditation-calibration-labs");
				}catch (Exception e) {
					
				}
			}
	try {
		pdfTemplate = 
				StringUtil.replace(pdfTemplate, 
		new String[] {
				

				//Application Information 2
				"[$ApplicantNameCalibrationLab$]","[$CalibrationLabAddress$]",
				
				//Contact Information 13
				"[$CalibrationLabTelephone$]","[$CalibrationLabFaxNo$]","[$CalibrationLabWebsite$]","[$CalibrationLabSeeking$]","[$CalibrationLabSeekingAdd$]","[$CerCalibrationLab$]","[$CalibrationLabEmail$]",
				"[$QualityLabPer$]","[$CalibrationLabManEmail$]","[$CalibrationLabAlternate$]","[$CalibrationLabCharge$]","[$CalibrationLabFinancial$]","[$CalibrationLabMatter$]",
				
				//Name & Email Address of Personnel Responsible for Technical Management 10
				"[$CalibrationLabName1$]","[$CalibrationLabEmail1$]",
				"[$CalibrationLabName2$]","[$CalibrationLabEmail2$]",
				"[$CalibrationLabName3$]","[$CalibrationLabEmail3$]",
				"[$CalibrationLabName4$]","[$CalibrationLabEmail4$]",
				"[$CalibrationLabName5$]","[$CalibrationLabEmail5$]",
				
				//other remaining  4
				"[$CalibrationLabTickApp$]","[$CalibrationLabAuthorized$]","[$CalibrationLabPosition$]","[$CalibrationLabDate$]",
				
				//first signature: 1
				"[$SignCalibrationLab$]",
				
				//second Signature 1
				"[$CompanyCalibrationLab$]",
				
				//Description of Activities 2
				"[$ClinicalCalibrationLab$]","[$ShiftWorkCalibrationLab$]",
				
				//Specimen Collection Sites 10
				"[$NumberCalibrationLab1$]","[$LocationCalib1$]",
				"[$NumberCalibrationLab2$]","[$LocationCalib2$]",
				"[$NumberCalibrationLab3$]","[$LocationCalib3$]",
				"[$NumberCalibrationLab4$]","[$LocationCalib4$]",
				"[$NumberCalibrationLab5$]","[$LocationCalib5$]",
				
				//The Organization    missing 4
				"[$CalibrationlaboratoryLegal$]","[$CalibrationlegalTestingLab$]","[$CalibrationActivitiesLarger$]","[$OrganizationNam$]","[$OrganizationRelationship$]",
				
				//Indicate Staff Size  2
				"[$ManagerialCalibrationLab$]","[$TechnicalCalibrationLab$]",
				
				//Staff Details 21
				"[$ClientStaffNameC1$]","[$JobTitleDetails1$]","[$MajResponsibilities1$]","[$analystsRequest1$]",
				"[$ClientStaffNameC2$]","[$JobTitleDetails2$]","[$MajResponsibilities2$]","[$analystsRequest2$]",
				"[$ClientStaffNameC3$]","[$JobTitleDetails3$]","[$MajResponsibilities3$]","[$analystsRequest3$]",
				"[$ClientStaffNameC4$]","[$JobTitleDetails4$]","[$MajResponsibilities4$]","[$analystsRequest4$]",
				"[$ClientStaffNameC5$]","[$JobTitleDetails5$]","[$MajResponsibilities5$]","[$analystsRequest5$]",
				
				"[$CodeGuidelines$]",
				
				// List the scope of the tests for which accreditation is being	37
				"[$ScopeNo1$]","[$quantityNum1$]","[$CalibrationScope1$]","[$RangeList1$]","[$MeasurementCal1$]","[$capabilityCMC1$]","[$RemarksR1$]",
				"[$ScopeNo2$]","[$quantityNum2$]","[$CalibrationScope2$]","[$RangeList2$]","[$MeasurementCal2$]","[$capabilityCMC2$]","[$RemarksR2$]",
				"[$ScopeNo3$]","[$quantityNum3$]","[$CalibrationScope3$]","[$RangeList3$]","[$MeasurementCal3$]","[$capabilityCMC3$]","[$RemarksR3$]",
				"[$ScopeNo4$]","[$quantityNum4$]","[$CalibrationScope4$]","[$RangeList4$]","[$MeasurementCal4$]","[$capabilityCMC4$]","[$RemarksR4$]",
				"[$ScopeNo5$]","[$quantityNum5$]","[$CalibrationScope5$]","[$RangeList5$]","[$MeasurementCal5$]","[$capabilityCMC5$]","[$RemarksR5$]",
			
				"[$incomeSourceLab$]","[$servicesClientsProvides$]",
				
				//Resource Requirements Personnel 2
				"[$PersonnelActivities$]","[$WorkRequirementsVerify$]",
				
				//If your application covers activities performed at more than one location (including virtual sites if applicable), provide details in the table below 20
				"[$CalibrationLabNo1$]","[$CalibrationLabAddress1$]","[$ActivitiesPerformedLab1$]","[$ContactDetailsLo1$]",
				"[$CalibrationLabNo2$]","[$CalibrationLabAddress2$]","[$ActivitiesPerformedLab2$]","[$ContactDetailsLo2$]",
				"[$CalibrationLabNo3$]","[$CalibrationLabAddress3$]","[$ActivitiesPerformedLab3$]","[$ContactDetailsLo3$]",
				"[$CalibrationLabNo4$]","[$CalibrationLabAddress4$]","[$ActivitiesPerformedLab4$]","[$ContactDetailsLo4$]",
				"[$CalibrationLabNo5$]","[$CalibrationLabAddress5$]","[$ActivitiesPerformedLab5$]","[$ContactDetailsLo5$]",
					
				//Describe the layout (include the floor plan) identifying personnel and material flow(s) of (CLAUSES 6.3) 7
				"[$PersonnelLabLayout$]","[$materialFlowLab$]","[$DescribeLabTerms$]","[$lightingConditions$]","[$MonitoringActivities$]",
				"[$featuresEquipment$]","[$securityArrangementPre$]",
				
				//List the major equipment used in the tests for which accreditation is being sought Include equipment contracted for use by the laboratory (CLAUSE 6.4) 30
				"[$InventoryNumberLab1$]","[$LabTItemEquipment1$]","[$EquipmentManufacturerNumManufacturer1$]","[$ModelNoCal1$]","[$CalibrationInAcc1$]","[$CalibratedByContract1$]",
				"[$InventoryNumberLab2$]","[$LabTItemEquipment2$]","[$EquipmentManufacturerNumManufacturer2$]","[$ModelNoCal2$]","[$CalibrationInAcc2$]","[$CalibratedByContract2$]",
				"[$InventoryNumberLab3$]","[$LabTItemEquipment3$]","[$EquipmentManufacturerNumManufacturer3$]","[$ModelNoCal3$]","[$CalibrationInAcc3$]","[$CalibratedByContract3$]",
				"[$InventoryNumberLab4$]","[$LabTItemEquipment4$]","[$EquipmentManufacturerNumManufacturer4$]","[$ModelNoCal4$]","[$CalibrationInAcc4$]","[$CalibratedByContract4$]",
				"[$InventoryNumberLab5$]","[$LabTItemEquipment5$]","[$EquipmentManufacturerNumManufacturer5$]","[$ModelNoCal5$]","[$CalibrationInAcc5$]","[$CalibratedByContract5$]",
				//Management System Requirements 14
				"[$obFulfilling$]","[$DocCaliLab$]",
				"[$impartialityPro$]","[$ProvisionsCalibration$]",
				"[$confidentialityTest$]","[$confidentDocumentSign$]",
				"[$commitmentDevelopment$]","[$improvementRefOther$]","[$recordsProcessesEvidence$]","[$documentationSystemCal$]","[$responsibilitiesInter$]","[$interrelationshipSample$]",
				"[$responsibilityRoleTab$]","[$PersonnelTab$]",
				
				
				//Management System Documentation - Resource Requirements 14
				"[$tendersDetermination$]","[$contractsCalibration$]",
				"[$SelectionTraningCalibration$]","[$supervisionCalibration$]",
				"[$storageUseCalibration$]","[$maintenanceEqCalibration$]",
				"[$CalProgramo$]","[$ProgrameCalibrationLab$]","[$DefiningCalibrationReview$]","[$requirementsExCalibration$]","[$monCalibrationPerformance$]","[$serCalibration$]",
				"[$neCalibrationTab$]","[$SerCalibrationLabTabS$]",
				
				//Management System Documentation - Process Requirements 18
				"[$ReviewcontractsStand$]","[$LaboratorycontractsRef$]",
				"[$ProcontractsLab$]","[$norcontractsStand$]",
				"[$validationMethods$]","[$TestingRefMethods$]",
				"[$samplingMethodsPlan$]","[$PlanRefMethods$]",
				"[$TransportationHandling$]","[$HandlingStorage$]",
				"[$measurementtestUnc$]","[$LaboratorytestLab$]",
				"[$MonitoringCalibResult$]","[$validityResultCali$]",
				"[$ComplaintsActresults$]","[$ComActTest$]",
				"[$NonconformingWorkCalbi$]","[$WorkNonconformingDocumentAtion$]",
				
				//Management System Procedures - Management Requirements 18
				"[$identificationSystemUnique$]","[$managementSysTUnique$]",
				"[$IdentificationStatusCurrent$]","[$UniqueStatus$]",
				"[$Docresultschanges$]","[$Testinghandlingchanges$]",
				"[$ControlPlanmethods$]","[$LaboratorymethodsDocm$]",
				"[$addressresults$]","[$DocumentationContracts$]",
				"[$improvementOppIdentification$]","[$ReferenceIdentification$]",
				"[$actionCorrHandling$]","[$LaboratoryStatus$]",
				"[$auditsMethodsInternal$]","[$LaboratoryResults$]",
				"[$reviewsManagStatus$]","[$WorkTStatus$]",
				
				//Other Requirements 4
				"[$submittedMIdentificationApp$]","[$repreStatusApplicantName$]",
				"[$positionMethodTest$]","[$UniqueDate$]",
				
				//signature 1
				"[$MethodSignatureCalibration$]"
				

				
				},
		              new String[] { 
 
	//Application Information 2

	Validator.isNotNull(application) && Validator.isNotNull(application.getNameOfApplicant()) ? application.getNameOfApplicant() : "",
	Validator.isNotNull(application) && Validator.isNotNull(application.getApplicantAddress()) ? application.getApplicantAddress() : "",

  //Contact Information 13
			
    Validator.isNotNull(application) && Validator.isNotNull(application.getAppliTelephoneNo()) ? application.getAppliTelephoneNo() : "",
	Validator.isNotNull(application) && Validator.isNotNull(application.getAppliFaxNo()) ? application.getAppliFaxNo() : "",
	Validator.isNotNull(application) && Validator.isNotNull(application.getAppliWebsite()) ? application.getAppliWebsite() : "",
	Validator.isNotNull(application) && Validator.isNotNull(application.getLaboratoryName()) ? application.getLaboratoryName() : "",
	Validator.isNotNull(application) && Validator.isNotNull(application.getLaboratoryAddress()) ? application.getLaboratoryAddress() : "",
	Validator.isNotNull(application) && Validator.isNotNull(application.getNameOfIncharge()) ? application.getNameOfIncharge() : "",
	Validator.isNotNull(application) && Validator.isNotNull(application.getEmailOfIncharge()) ? application.getEmailOfIncharge() : "",
	Validator.isNotNull(application) && Validator.isNotNull(application.getPersonnelQMName()) ? application.getPersonnelQMName() : "",
	Validator.isNotNull(application) && Validator.isNotNull(application.getPersonnelQMEmail()) ? application.getPersonnelQMEmail() : "",
	Validator.isNotNull(application) && Validator.isNotNull(application.getDeputyInchargeName()) ? application.getDeputyInchargeName() : "",
	Validator.isNotNull(application) && Validator.isNotNull(application.getDeputyInchargeEmail()) ? application.getDeputyInchargeEmail() : "",
	Validator.isNotNull(application) && Validator.isNotNull(application.getPersonnelFMName()) ? application.getPersonnelFMName() : "",
	Validator.isNotNull(application) && Validator.isNotNull(application.getPersonnelFMEmail()) ? application.getPersonnelFMEmail() : "",

 //add more first 5
  (labAppliInfo!=null)&&(labAppliInfo.size()>0)?labAppliInfo.get(0).getName(): "",
  (labAppliInfo!=null)&&(labAppliInfo.size()>0)?labAppliInfo.get(0).getEmail():"",
  
  
  (labAppliInfo!=null)&&(labAppliInfo.size()>1)?labAppliInfo.get(1).getName():"",
  (labAppliInfo!=null)&&(labAppliInfo.size()>1)?labAppliInfo.get(1).getEmail():"",
  
  
  (labAppliInfo!=null)&&(labAppliInfo.size()>2)?labAppliInfo.get(2).getName():"",
  (labAppliInfo!=null)&&(labAppliInfo.size()>2)?labAppliInfo.get(2).getEmail():"",
  
  
  (labAppliInfo!=null)&&(labAppliInfo.size()>3)?labAppliInfo.get(3).getName():"",
  (labAppliInfo!=null)&&(labAppliInfo.size()>3)?labAppliInfo.get(3).getEmail():"",
  
  
  (labAppliInfo!=null)&&(labAppliInfo.size()>4)?labAppliInfo.get(4).getName(): "",
  (labAppliInfo!=null)&&(labAppliInfo.size()>4)?labAppliInfo.get(4).getEmail(): "",
  
  
   //other remaining 4
  

  Validator.isNotNull(application) && Validator.isNotNull(application.getAccRequestType()) ? application.getAccRequestType() : "",
  Validator.isNotNull(application) && Validator.isNotNull(application.getAuthorizedPersonnelName()) ? application.getAuthorizedPersonnelName() : "",
  Validator.isNotNull(application) && Validator.isNotNull(application.getAuthorizedPosition()) ? application.getAuthorizedPosition() : "",
  Validator.isNotNull(application) && Validator.isNotNull(application.getAuthorizedPersonnelDate()) ? dateFormat.format(application.getAuthorizedPersonnelDate()) : "",
 
  //signature Detail 1
   signatureForAuthorizedPersonnel,
 
 
 //company seal 1
   companySealCertificationBodies,
 
 //form 1 complete
 
 //form 2 start
   
   Validator.isNotNull(accMediDes) && Validator.isNotNull(accMediDes.getTestClinicalActivity()) ? accMediDes.getTestClinicalActivity() : "",
   Validator.isNotNull(accMediDes) && Validator.isNotNull(accMediDes.getTestLabShiftWork()) ? accMediDes.getTestLabShiftWork() : "",

  //add more first
  
  (descOfActivity!=null)&&(descOfActivity.size()>0)?descOfActivity.get(0).getNumber():"",
  (descOfActivity!=null)&&(descOfActivity.size()>0)?descOfActivity.get(0).getLocation():"",
  
  (descOfActivity!=null)&&(descOfActivity.size()>1)?descOfActivity.get(1).getNumber():"",
  (descOfActivity!=null)&&(descOfActivity.size()>1)?descOfActivity.get(1).getLocation():"",
  
  (descOfActivity!=null)&&(descOfActivity.size()>2)?descOfActivity.get(2). getNumber():"",
  (descOfActivity!=null)&&(descOfActivity.size()>2)?descOfActivity.get(2). getLocation():"",
  
  (descOfActivity!=null)&&(descOfActivity.size()>3)?descOfActivity.get(3).getNumber():"",
  (descOfActivity!=null)&&(descOfActivity.size()>3)?descOfActivity.get(3).getLocation():"",
  
  (descOfActivity!=null)&&(descOfActivity.size()>4)?descOfActivity.get(4). getNumber():"",
  (descOfActivity!=null)&&(descOfActivity.size()>4)?descOfActivity.get(4).getLocation():"",
  
 
 //form 2 complete
		  
 //form 3 start
		  
  Validator.isNotNull(accMediStructural) && Validator.isNotNull(accMediStructural.getTestLabLegalEntity()) ? accMediStructural.getTestLabLegalEntity() : "",
  Validator.isNotNull(accMediStructural) && Validator.isNotNull(accMediStructural.getTestlegalStatus()) ? accMediStructural.getTestlegalStatus() : "",
  Validator.isNotNull(accMediStructural) && Validator.isNotNull(accMediStructural.getTestlabPartOfOrg()) ? accMediStructural.getTestlabPartOfOrg() : "",
  Validator.isNotNull(accMediStructural) && Validator.isNotNull(accMediStructural.getTestlabPartOfOrgName()) ? accMediStructural.getTestlabPartOfOrgName() : "",
  Validator.isNotNull(accMediStructural) && Validator.isNotNull(accMediStructural.getTestLabPartOfOrgPos()) ? accMediStructural.getTestLabPartOfOrgPos() : "",
  Validator.isNotNull(accMediStructural) && Validator.isNotNull(accMediStructural.getTestMangerialStaff()) ? accMediStructural.getTestMangerialStaff() : "",
  Validator.isNotNull(accMediStructural) && Validator.isNotNull(accMediStructural.getTestTechnicalStaff()) ? accMediStructural.getTestTechnicalStaff() : "",
 
  //add more first 5
  (labStuctInfo!=null)&&(labStuctInfo.size()>0)?labStuctInfo.get(0).getNameOfStaff():"",
  (labStuctInfo!=null)&&(labStuctInfo.size()>0)?labStuctInfo.get(0).getJobTitle():"", 
  (labStuctInfo!=null)&&(labStuctInfo.size()>0)?labStuctInfo.get(0).getMajorResponsibilities():"",
  (labStuctInfo!=null)&&(labStuctInfo.size()>0)?labStuctInfo.get(0).getIndicateAnalysts():"",
  
  (labStuctInfo!=null)&&(labStuctInfo.size()>1)?labStuctInfo.get(1).getNameOfStaff():"",
  (labStuctInfo!=null)&&(labStuctInfo.size()>1)?labStuctInfo.get(1).getJobTitle():"", 
  (labStuctInfo!=null)&&(labStuctInfo.size()>1)?labStuctInfo.get(1).getMajorResponsibilities():"",
  (labStuctInfo!=null)&&(labStuctInfo.size()>1)?labStuctInfo.get(1).getIndicateAnalysts():"",
  
  (labStuctInfo!=null)&&(labStuctInfo.size()>2)?labStuctInfo.get(2).getNameOfStaff():"",
  (labStuctInfo!=null)&&(labStuctInfo.size()>2)?labStuctInfo.get(2).getJobTitle():"", 
  (labStuctInfo!=null)&&(labStuctInfo.size()>2)?labStuctInfo.get(2).getMajorResponsibilities():"",
  (labStuctInfo!=null)&&(labStuctInfo.size()>2)?labStuctInfo.get(2).getIndicateAnalysts():"",
  
  (labStuctInfo!=null)&&(labStuctInfo.size()>3)?labStuctInfo.get(3).getNameOfStaff():"",
  (labStuctInfo!=null)&&(labStuctInfo.size()>3)?labStuctInfo.get(3).getJobTitle():"", 
  (labStuctInfo!=null)&&(labStuctInfo.size()>3)?labStuctInfo.get(3).getMajorResponsibilities():"",
  (labStuctInfo!=null)&&(labStuctInfo.size()>3)?labStuctInfo.get(3).getIndicateAnalysts():"",
  
  (labStuctInfo!=null)&&(labStuctInfo.size()>4)?labStuctInfo.get(4).getNameOfStaff():"",
  (labStuctInfo!=null)&&(labStuctInfo.size()>4)?labStuctInfo.get(4).getJobTitle():"", 
  (labStuctInfo!=null)&&(labStuctInfo.size()>4)?labStuctInfo.get(4).getMajorResponsibilities():"",
  (labStuctInfo!=null)&&(labStuctInfo.size()>4)?labStuctInfo.get(4).getIndicateAnalysts():"",
  
// other 1
 Validator.isNotNull(accMediStructural)&&Validator.isNotNull(accMediStructural.getTestingRelevantDoc())?accMediStructural.getTestingRelevantDoc():"",
 //add more second 5

      (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 0) ? labCaliStrucInfo.get(0).getNumber() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 0) ? labCaliStrucInfo.get(0).getMeasuredQuantity() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 0) ? labCaliStrucInfo.get(0).getCalibrationItem() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 0) ? labCaliStrucInfo.get(0).getRange() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 0) ? labCaliStrucInfo.get(0).getMeasurementProcedure() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 0) ? labCaliStrucInfo.get(0).getCalibration() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 0) ? labCaliStrucInfo.get(0).getRemarks() : "",

	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 1) ? labCaliStrucInfo.get(1).getNumber() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 1) ? labCaliStrucInfo.get(1).getMeasuredQuantity() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 1) ? labCaliStrucInfo.get(1).getCalibrationItem() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 1) ? labCaliStrucInfo.get(1).getRange() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 1) ? labCaliStrucInfo.get(1).getMeasurementProcedure() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 1) ? labCaliStrucInfo.get(1).getCalibration() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 1) ? labCaliStrucInfo.get(1).getRemarks() : "",

	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 2) ? labCaliStrucInfo.get(2).getNumber() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 2) ? labCaliStrucInfo.get(2).getMeasuredQuantity() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 2) ? labCaliStrucInfo.get(2).getCalibrationItem() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 2) ? labCaliStrucInfo.get(2).getRange() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 2) ? labCaliStrucInfo.get(2).getMeasurementProcedure() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 2) ? labCaliStrucInfo.get(2).getCalibration() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 2) ? labCaliStrucInfo.get(2).getRemarks() : "",

	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 3) ? labCaliStrucInfo.get(3).getNumber() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 3) ? labCaliStrucInfo.get(3).getMeasuredQuantity() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 3) ? labCaliStrucInfo.get(3).getCalibrationItem() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 3) ? labCaliStrucInfo.get(3).getRange() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 3) ? labCaliStrucInfo.get(3).getMeasurementProcedure() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 3) ? labCaliStrucInfo.get(3).getCalibration() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 3) ? labCaliStrucInfo.get(3).getRemarks() : "",

	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 4) ? labCaliStrucInfo.get(4).getNumber() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 4) ? labCaliStrucInfo.get(4).getMeasuredQuantity() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 4) ? labCaliStrucInfo.get(4).getCalibrationItem() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 4) ? labCaliStrucInfo.get(4).getRange() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 4) ? labCaliStrucInfo.get(4).getMeasurementProcedure() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 4) ? labCaliStrucInfo.get(4).getCalibration() : "",
	  (labCaliStrucInfo != null) && (labCaliStrucInfo.size() > 4) ? labCaliStrucInfo.get(4).getRemarks() : "",

  
  
   //other
  
	  Validator.isNotNull(accMediStructural) && Validator.isNotNull(accMediStructural.getTestMajorIncome()) ? accMediStructural.getTestMajorIncome() : "",
	  Validator.isNotNull(accMediStructural) && Validator.isNotNull(accMediStructural.getTestLabClients()) ? accMediStructural.getTestLabClients() : "",

  //form 3 complete
  
  //form 4 start 
			  
	  Validator.isNotNull(mediLabTestResourceReq) && Validator.isNotNull(mediLabTestResourceReq.getTestExternal()) ? mediLabTestResourceReq.getTestExternal() : "",
	  Validator.isNotNull(mediLabTestResourceReq) && Validator.isNotNull(mediLabTestResourceReq.getTestCompetence()) ? mediLabTestResourceReq.getTestCompetence() : "",

  //first add more 5
      (labResourceReqfirstInfo != null) && (labResourceReqfirstInfo.size() > 0) ? labResourceReqfirstInfo.get(0).getNum() : "",
	  (labResourceReqfirstInfo != null) && (labResourceReqfirstInfo.size() > 0) ? labResourceReqfirstInfo.get(0).getLocation() : "",
	  (labResourceReqfirstInfo != null) && (labResourceReqfirstInfo.size() > 0) ? labResourceReqfirstInfo.get(0).getActivities() : "",
	  (labResourceReqfirstInfo != null) && (labResourceReqfirstInfo.size() > 0) ? labResourceReqfirstInfo.get(0).getContactDetails() : "",
			  
	  (labResourceReqfirstInfo != null) && (labResourceReqfirstInfo.size() > 1) ? labResourceReqfirstInfo.get(1).getNum() : "",
	  (labResourceReqfirstInfo != null) && (labResourceReqfirstInfo.size() > 1) ? labResourceReqfirstInfo.get(1).getLocation() : "",
	  (labResourceReqfirstInfo != null) && (labResourceReqfirstInfo.size() > 1) ? labResourceReqfirstInfo.get(1).getActivities() : "",
	  (labResourceReqfirstInfo != null) && (labResourceReqfirstInfo.size() > 1) ? labResourceReqfirstInfo.get(1).getContactDetails() : "",
			  
	  (labResourceReqfirstInfo != null) && (labResourceReqfirstInfo.size() > 2) ? labResourceReqfirstInfo.get(2).getNum() : "",
	  (labResourceReqfirstInfo != null) && (labResourceReqfirstInfo.size() > 2) ? labResourceReqfirstInfo.get(2).getLocation() : "",
	  (labResourceReqfirstInfo != null) && (labResourceReqfirstInfo.size() > 2) ? labResourceReqfirstInfo.get(2).getActivities() : "",
	  (labResourceReqfirstInfo != null) && (labResourceReqfirstInfo.size() > 2) ? labResourceReqfirstInfo.get(2).getContactDetails() : "",
			  
	  (labResourceReqfirstInfo != null) && (labResourceReqfirstInfo.size() > 3) ? labResourceReqfirstInfo.get(3).getNum() : "",
	  (labResourceReqfirstInfo != null) && (labResourceReqfirstInfo.size() > 3) ? labResourceReqfirstInfo.get(3).getLocation() : "",
	  (labResourceReqfirstInfo != null) && (labResourceReqfirstInfo.size() > 3) ? labResourceReqfirstInfo.get(3).getActivities() : "",
	  (labResourceReqfirstInfo != null) && (labResourceReqfirstInfo.size() > 3) ? labResourceReqfirstInfo.get(3).getContactDetails() : "",
			  
	  (labResourceReqfirstInfo != null) && (labResourceReqfirstInfo.size() > 4) ? labResourceReqfirstInfo.get(4).getNum() : "",
	  (labResourceReqfirstInfo != null) && (labResourceReqfirstInfo.size() > 4) ? labResourceReqfirstInfo.get(4).getLocation() : "",
	  (labResourceReqfirstInfo != null) && (labResourceReqfirstInfo.size() > 4) ? labResourceReqfirstInfo.get(4).getActivities() : "",
	  (labResourceReqfirstInfo != null) && (labResourceReqfirstInfo.size() > 4) ? labResourceReqfirstInfo.get(4).getContactDetails() : "",

     //other 7 
      Validator.isNotNull(mediLabTestResourceReq) && Validator.isNotNull(mediLabTestResourceReq.getTestLabFacilities()) ? mediLabTestResourceReq.getTestLabFacilities() : "",
	  Validator.isNotNull(mediLabTestResourceReq) && Validator.isNotNull(mediLabTestResourceReq.getTestLabContracted()) ? mediLabTestResourceReq.getTestLabContracted() : "",
	  Validator.isNotNull(mediLabTestResourceReq) && Validator.isNotNull(mediLabTestResourceReq.getTestLabFacilityEnv()) ? mediLabTestResourceReq.getTestLabFacilityEnv() : "",
	  Validator.isNotNull(mediLabTestResourceReq) && Validator.isNotNull(mediLabTestResourceReq.getTestSpecialEnv()) ? mediLabTestResourceReq.getTestSpecialEnv() : "",
	  Validator.isNotNull(mediLabTestResourceReq) && Validator.isNotNull(mediLabTestResourceReq.getTestMonitoringAct()) ? mediLabTestResourceReq.getTestMonitoringAct() : "",
	  Validator.isNotNull(mediLabTestResourceReq) && Validator.isNotNull(mediLabTestResourceReq.getTestLabRelatedEquip()) ? mediLabTestResourceReq.getTestLabRelatedEquip() : "",
	  Validator.isNotNull(mediLabTestResourceReq) && Validator.isNotNull(mediLabTestResourceReq.getTestSecurityArrange()) ? mediLabTestResourceReq.getTestSecurityArrange() : "",

 //second add more 5
 
      (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 0) ? labResourceReqSecInfo.get(0).getInventoryNumber() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 0) ? labResourceReqSecInfo.get(0).getItem() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 0) ? labResourceReqSecInfo.get(0).getManufacturer() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 0) ? labResourceReqSecInfo.get(0).getModelNumber() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 0) ? labResourceReqSecInfo.get(0).getCalibrationInterval() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 0) ? labResourceReqSecInfo.get(0).getCalibratedBy() : "",

      (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 1) ? labResourceReqSecInfo.get(1).getInventoryNumber() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 1) ? labResourceReqSecInfo.get(1).getItem() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 1) ? labResourceReqSecInfo.get(1).getManufacturer() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 1) ? labResourceReqSecInfo.get(1).getModelNumber() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 1) ? labResourceReqSecInfo.get(1).getCalibrationInterval() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 1) ? labResourceReqSecInfo.get(1).getCalibratedBy() : "",
  
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 2) ? labResourceReqSecInfo.get(2).getInventoryNumber() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 2) ? labResourceReqSecInfo.get(2).getItem() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 2) ? labResourceReqSecInfo.get(2).getManufacturer() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 2) ? labResourceReqSecInfo.get(2).getModelNumber() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 2) ? labResourceReqSecInfo.get(2).getCalibrationInterval() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 2) ? labResourceReqSecInfo.get(2).getCalibratedBy() : "",

	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 3) ? labResourceReqSecInfo.get(3).getInventoryNumber() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 3) ? labResourceReqSecInfo.get(3).getItem() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 3) ? labResourceReqSecInfo.get(3).getManufacturer() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 3) ? labResourceReqSecInfo.get(3).getModelNumber() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 3) ? labResourceReqSecInfo.get(3).getCalibrationInterval() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 3) ? labResourceReqSecInfo.get(3).getCalibratedBy() : "",

	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 4) ? labResourceReqSecInfo.get(4).getInventoryNumber() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 4) ? labResourceReqSecInfo.get(4).getItem() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 4) ? labResourceReqSecInfo.get(4).getManufacturer() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 4) ? labResourceReqSecInfo.get(4).getModelNumber() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 4) ? labResourceReqSecInfo.get(4).getCalibrationInterval() : "",
	  (labResourceReqSecInfo != null) && (labResourceReqSecInfo.size() > 4) ? labResourceReqSecInfo.get(4).getCalibratedBy() : "",

  //form 4 complete
 
  //form 5 start
			  
	  //Management System Requirements 14
      Validator.isNotNull(accMediLabManagement) && Validator.isNotNull(accMediLabManagement.getPoliciesForFulfil()) ? accMediLabManagement.getPoliciesForFulfil() : "",
	  Validator.isNotNull(accMediLabManagement) && Validator.isNotNull(accMediLabManagement.getLabDocRefPolicies()) ? accMediLabManagement.getLabDocRefPolicies() : "",
	  Validator.isNotNull(accMediLabManagement) && Validator.isNotNull(accMediLabManagement.getImpartialityProvision()) ? accMediLabManagement.getImpartialityProvision() : "",
	  Validator.isNotNull(accMediLabManagement) && Validator.isNotNull(accMediLabManagement.getLabDocRefImpartProv()) ? accMediLabManagement.getLabDocRefImpartProv() : "",
	  Validator.isNotNull(accMediLabManagement) && Validator.isNotNull(accMediLabManagement.getConfidientialityProv()) ? accMediLabManagement.getConfidientialityProv() : "",
	  Validator.isNotNull(accMediLabManagement) && Validator.isNotNull(accMediLabManagement.getLabDocRefConfid()) ? accMediLabManagement.getLabDocRefConfid() : "",
	  Validator.isNotNull(accMediLabManagement) && Validator.isNotNull(accMediLabManagement.getCommitmentEvidence()) ? accMediLabManagement.getCommitmentEvidence() : "",
	  Validator.isNotNull(accMediLabManagement) && Validator.isNotNull(accMediLabManagement.getLabDocRefCommitment()) ? accMediLabManagement.getLabDocRefCommitment() : "",
	  Validator.isNotNull(accMediLabManagement) && Validator.isNotNull(accMediLabManagement.getReferenceEvidence()) ? accMediLabManagement.getReferenceEvidence() : "",
	  Validator.isNotNull(accMediLabManagement) && Validator.isNotNull(accMediLabManagement.getLabDocRefReference()) ? accMediLabManagement.getLabDocRefReference() : "",
	  Validator.isNotNull(accMediLabManagement) && Validator.isNotNull(accMediLabManagement.getDocDescribingRole()) ? accMediLabManagement.getDocDescribingRole() : "",
	  Validator.isNotNull(accMediLabManagement) && Validator.isNotNull(accMediLabManagement.getLabDocRefDocDes()) ? accMediLabManagement.getLabDocRefDocDes() : "",
	  Validator.isNotNull(accMediLabManagement) && Validator.isNotNull(accMediLabManagement.getRolesofPersonnel()) ? accMediLabManagement.getRolesofPersonnel() : "",
	  Validator.isNotNull(accMediLabManagement) && Validator.isNotNull(accMediLabManagement.getLabDocRefRoles()) ? accMediLabManagement.getLabDocRefRoles() : "",

		//Management Requirements 14
			  
	  Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getCompetenceReq()) ? accMediLabManagement.getCompetenceReq() : "",
	  Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefCompetence()) ? accMediLabManagement.getLabDocRefCompetence() : "",
	  Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getSelectionOfPerson()) ? accMediLabManagement.getSelectionOfPerson() : "",
	  Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefSelection()) ? accMediLabManagement.getLabDocRefSelection() : "",
	  Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getHandlingEquip()) ? accMediLabManagement.getHandlingEquip() : "",
	  Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefHandling()) ? accMediLabManagement.getLabDocRefHandling() : "",
	  Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getCalibrationProgram()) ? accMediLabManagement.getCalibrationProgram() : "",
	  Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefCalibrat()) ? accMediLabManagement.getLabDocRefCalibrat() : "",
      Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getApprovingReq())?accMediLabManagement.getApprovingReq():"",
	  Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefApproving())?accMediLabManagement.getLabDocRefApproving():"",
	  Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getMonitorPerformance())?accMediLabManagement.getMonitorPerformance():"",
	  Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefMonitor())?accMediLabManagement.getLabDocRefMonitor():"",
	  Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getEnsuringService())?accMediLabManagement.getEnsuringService():"",
	  Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefEnsuring())?accMediLabManagement.getLabDocRefEnsuring():"",
	  //Management Requirements 36
				
        Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getReviewOfRequest())?accMediLabManagement.getReviewOfRequest():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefRequest())?accMediLabManagement.getLabDocRefRequest():"",		
        Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getProcedureForLab())?accMediLabManagement.getProcedureForLab():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefProcedure())?accMediLabManagement.getLabDocRefProcedure():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getTestMethodValidat())?accMediLabManagement.getTestMethodValidat():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefTestMethod())?accMediLabManagement.getLabDocRefTestMethod():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getSamplingPlan())?accMediLabManagement.getSamplingPlan():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefSampling())?accMediLabManagement.getLabDocRefSampling():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getTransportationReciept())?accMediLabManagement.getTransportationReciept():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefTransport())?accMediLabManagement.getLabDocRefTransport():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getUncertainityMeasure())?accMediLabManagement.getUncertainityMeasure():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefUncertain())?accMediLabManagement.getLabDocRefUncertain():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getTestResultValidity())?accMediLabManagement.getTestResultValidity():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocReftestResult())?accMediLabManagement.getLabDocReftestResult():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getComplaints())?accMediLabManagement.getComplaints():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefComplaints())?accMediLabManagement.getLabDocRefComplaints():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getNonConformingWork())?accMediLabManagement.getNonConformingWork():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefNonConfirm())?accMediLabManagement.getLabDocRefNonConfirm():"",
				
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getUniqueIdentification())?accMediLabManagement.getUniqueIdentification():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefUnique())?accMediLabManagement.getLabDocRefUnique():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getCurrentRevisionStatus())?accMediLabManagement.getCurrentRevisionStatus():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefCurrentRev())?accMediLabManagement.getLabDocRefCurrentRev():"",		
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getDocChangeIdentify())?accMediLabManagement.getDocChangeIdentify():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefDocChange())?accMediLabManagement.getLabDocRefDocChange():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getRecordControl())?accMediLabManagement.getRecordControl():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefRecordControl())?accMediLabManagement.getLabDocRefRecordControl():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getPlannedAction())?accMediLabManagement.getPlannedAction():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefPlanned())?accMediLabManagement.getLabDocRefPlanned():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getImporvementOpportunity())?accMediLabManagement.getImporvementOpportunity():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefImprovement())?accMediLabManagement.getLabDocRefImprovement():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getCorrectiveAction())?accMediLabManagement.getCorrectiveAction():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefCorrective())?accMediLabManagement.getLabDocRefCorrective():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getInternalAudits())?accMediLabManagement.getInternalAudits():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefInternal())?accMediLabManagement.getLabDocRefInternal():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getManagementReview())?accMediLabManagement.getManagementReview():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabDocRefManagement())?accMediLabManagement.getLabDocRefManagement():"",
				
						    		
			    
						
				//form 6 end
				
				//form 7 start
						
		       
				Validator.isNotNull(accLabOther)&&Validator.isNotNull(accLabOther.getPaymentMethod())?accLabOther.getPaymentMethod():"",
				Validator.isNotNull(accLabOther)&&Validator.isNotNull(accLabOther.getRepresentativeName())?accLabOther.getRepresentativeName():"",
				Validator.isNotNull(accLabOther)&&Validator.isNotNull(accLabOther.getRepresentativePos())?accLabOther.getRepresentativePos():"",
				Validator.isNotNull(accLabOther)&&Validator.isNotNull(accLabOther.getSignDate())?dateFormat.format(accLabOther.getSignDate()):"",
					
			    //sign 1
				
				signatureOtherRequirement
						
					   
					
					});
						    }catch (Exception e) {
								// TODO: handle exception
							}
					
				
			
				 if (!checkPdfDownloadWithoutDocument.equals("false")) {
				String title = "";
				String fileName = "";
				if (Validator.isNotNull(supportingDocumentsFolder)) {
				String proofOfLegal = "";
				String genericCertificate = "";
				String authorizedPolicy="";
				String policyProcedure="";
				String policyPotential="";
				String authorizedCopy="";
				String evidenceQualification="";
				String certificateOfQualification="";
				String evidenceOfAdequate="";
				String sampleOfBlank="";
			
				
				
				
				
				for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
					try {
						fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
						fileName = fileEntry.getFileName();
						title=fileEntry.getTitle();
					} catch (Exception e) {}
					if(title.equals("Copy of approved plans (if premises are owned by the laboratory) or lease/rental contract for the laborator")) {
						proofOfLegal = fileName;
					}else if (title.equals("Copy of licence to operate the laboratory (duly signed stamped and dated)")) {
						genericCertificate = fileName;
					}else if(title.equals("Layout of laboratory indicating equipment placement for all locations where laboratory activities related to the requested scope of accreditation are performed")) {
						authorizedPolicy=fileName;
					}else if(title.equals("Policies and objectives for fulfilling the requirements of the ISO/IEC 17025 standard")) {
						policyProcedure=fileName;
					}else if(title.equals("Description of the organizational structure (including organizational chart if available)")) {
						policyPotential=fileName;
					}else if(title.equals("Documented competence requirements for each function influencing the results of laboratory activities")) {
						authorizedCopy=fileName;
					}else if(title.equals("Test methods and procedures")) {
						evidenceQualification=fileName;
					}else if(title.equals("Copies of certificates of qualification for the head and deputy head of the facility as well as any other key personnel with signatory authority that have been duly signed stamped and dated. Please include specimen signatures).")) {
						certificateOfQualification=fileName;
					}else if(title.equals("Copies of normative documents that govern your operations if permissible/permitted")) {
						evidenceOfAdequate=fileName;
					}else if(title.equals("Proficiency testing (PT) programme and PT and or interlaboratory comparison results obtained within the last two years")) {
						sampleOfBlank=fileName;
					}
					
				}
				
				pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
					"[$ApprovalPalnOwn$]","[$LicenceStamped$]","[$EquipmentPlacementLoc$]","[$PoliciesObjectFulfill$]","[$OrganizationalStructure$]","[$RequirementsDoc$]","[$AdProcedures$]","[$QualificationCertifi$]","[$NormativeDoc$]","[$ProficiencyTestingPro$]",
					
					},
					new String[] {
							proofOfLegal, genericCertificate,authorizedPolicy,policyProcedure,policyPotential,authorizedCopy,evidenceQualification,certificateOfQualification,
							evidenceOfAdequate,sampleOfBlank,
						});
				}
				try {
					pdfTemplate = StringUtil.replace(pdfTemplate, new String[] { "[$PaymentMetLastStep$]" },
							new String[] { 
									  Validator.isNotNull(payment)&&Validator.isNotNull(payment.getPaymentMethod())?payment.getPaymentMethod():"",

							});
				} catch (Exception e) {
					e.printStackTrace();
				}
				}
				 return pdfTemplate;
				 
		}

			public static String getTemplateFromJournalArticlePDF(long groupId, String urlTitle) {
				JournalArticle journalArticle = null;
				String contentBody = StringPool.BLANK;
				try {
					journalArticle = JournalArticleLocalServiceUtil.getArticleByUrlTitle(groupId, urlTitle);
					JournalArticleDisplay articleDisplay = JournalArticleLocalServiceUtil.getArticleDisplay(groupId,
							journalArticle.getArticleId(), null, "en_US", null);
					if (Validator.isNotNull(articleDisplay)) {
						contentBody = articleDisplay.getContent();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			
				return contentBody;
			}
		}




