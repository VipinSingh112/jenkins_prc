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
import com.nbp.janaac.application.form.service.model.AddLabDescOfActivity;
import com.nbp.janaac.application.form.service.model.AddLabResourceReqFirst;
import com.nbp.janaac.application.form.service.model.AddLabResourceReqSec;
import com.nbp.janaac.application.form.service.model.AddLabStructuralRequirement;
import com.nbp.janaac.application.form.service.model.AddLabTestStructuralReqSec;
import com.nbp.janaac.application.form.service.model.JanaacApplication;
import com.nbp.janaac.application.form.service.model.JanaacApplicationPayment;
import com.nbp.janaac.application.form.service.service.AccMediLabApplicationInfoLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccMediLabOtherReqLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccMediLabTestDescriptionLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccMediLabTestManageReqLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccMediLabTestResourceReqLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccMediLabTestStructuralLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddLabAppliInfoLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddLabDescOfActivityLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddLabResourceReqFirstLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddLabResourceReqSecLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddLabStructuralRequirementLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddLabTestStructuralReqSecLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.JanaacApplicationLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.JanaacApplicationPaymentLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class TestingLab17025Pdf {

	public static String replaceSignatureAuthorizedJanaac(long janaacApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Accer Test Signature of Authorized Personnel");
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
	public static String replaceCompanySealJanaac(long janaacApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Accer Test Company Stamp");
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
	
	
	public static String replacerepresentativeSignatureJanaac(long janaacApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Accre Test representative signature");
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
	
public static String janaacTestingLab17025Pdf(long janaacApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
	
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		JanaacApplication janaacApplication=null;
		AccMediLabApplicationInfo mediLabApplicationInfo = null;
		List<AddLabAppliInfo> labAppliInfo = null;
		AccMediLabTestDescription mediLabTestDescription=null;
		List<AddLabDescOfActivity> descOfActivity = null;
		AccMediLabTestStructural mediLabTestStructural=null;
		List<AddLabStructuralRequirement> labStuctInfo = null;
		List<AddLabTestStructuralReqSec> labStructInfo = null;
		AccMediLabTestResourceReq mediLabTestResourceReq=null;
		List<AddLabResourceReqFirst> labResourceReqfirstInfo = null;
		List<AddLabResourceReqSec> labResourceReqSecInfo=null;
		AccMediLabTestManageReq mediLabTestManageReq=null;
		AccMediLabOtherReq mediLabOtherReq=null;
		JanaacApplicationPayment payment=null;
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		
		 //Signatures 
		String signatureForAuthorizedPersonnel = null;
		String signaturecompanySeal=null;
		String signaturerepresentative=null;
	
		try {
			janaacApplication=JanaacApplicationLocalServiceUtil.getJanaacApplication(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			mediLabApplicationInfo= AccMediLabApplicationInfoLocalServiceUtil.getApplicantInfo(janaacApplicationId);            
		}catch (Exception e) {
		}
		try {
			labAppliInfo= AddLabAppliInfoLocalServiceUtil.getJanaacById(janaacApplicationId);           
		}catch (Exception e) {
		}
		try {
			mediLabTestDescription= AccMediLabTestDescriptionLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			descOfActivity= AddLabDescOfActivityLocalServiceUtil.getJanaacById(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			mediLabTestStructural= AccMediLabTestStructuralLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			labStuctInfo = AddLabStructuralRequirementLocalServiceUtil.getJanaacById(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			labStructInfo =AddLabTestStructuralReqSecLocalServiceUtil.getJanaacById(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			mediLabTestResourceReq =AccMediLabTestResourceReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			labResourceReqfirstInfo =AddLabResourceReqFirstLocalServiceUtil.getJanaacById(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			labResourceReqSecInfo =AddLabResourceReqSecLocalServiceUtil.getJanaacById(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			mediLabTestManageReq =AccMediLabTestManageReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			mediLabOtherReq =AccMediLabOtherReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
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
		 //signatures
		  try { 
			  signatureForAuthorizedPersonnel =replaceSignatureAuthorizedJanaac(janaacApplication.getJanaacApplicationId(), "Accer Test Signature of Authorized Personnel", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}
		  
		  try { 
			  signaturecompanySeal =replaceCompanySealJanaac(janaacApplication.getJanaacApplicationId(), "Accer Test Company Stamp", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}
		  
		  try { 
			  signaturerepresentative = replacerepresentativeSignatureJanaac(janaacApplication.getJanaacApplicationId(),"Accre Test representative signature" , themeDisplay.getScopeGroupId(),
					  supportingDocumentsFolder.getFolderId(),themeDisplay);
				
		  } catch (Exception e) {}
		  
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"weighing-device");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"accreditation-of-testing-second-cat");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = 
					StringUtil.replace(pdfTemplate, new String[] {
					
			//Application Information 2
			"[$ApplicantNameTestingLab$]","[$TestingLabAddress$]",
			
			//Contact Information 13
			"[$TestingLabTelephone$]","[$TestingLabFaxNo$]","[$TestingLabWebsite$]","[$TestingLabSeeking$]","[$TestingLabSeekingAdd$]","[$CerTestingLab$]","[$TestingLabEmail$]",
			"[$QualityLabPer$]","[$TestingLabManEmail$]","[$TestingLabAlternate$]","[$TestingLabCharge$]","[$TestingLabFinancial$]","[$TestingLabMatter$]",
			
			//Name & Email Address of Personnel Responsible for Technical Management 10
			"[$TestingLabName1$]","[$TestingLabEmail1$]",
			"[$TestingLabName2$]","[$TestingLabEmail2$]",
			"[$TestingLabName3$]","[$TestingLabEmail3$]",
			"[$TestingLabName4$]","[$TestingLabEmail4$]",
			"[$TestingLabName5$]","[$TestingLabEmail5$]",
			
			//other remaining  4
			"[$TestingLabTickApp$]","[$TestingLabAuthorized$]","[$TestingLabPosition$]","[$TestingLabDate$]",
			
			//first signature: 1
			"[$SignTestingLab$]",
			
			//second Signature 1
			"[$CompanyTestingLab$]",
			
			//Description of Activities 2
			"[$ClinicalTestingLab$]","[$ShiftWorkTestingLab$]",
			
			//Specimen Collection Sites 10
			"[$NumberTestingLab1$]","[$LocationMed1$]",
			"[$NumberTestingLab2$]","[$LocationMed2$]",
			"[$NumberTestingLab3$]","[$LocationMed3$]",
			"[$NumberTestingLab4$]","[$LocationMed4$]",
			"[$NumberTestingLab5$]","[$LocationTestingLab5$]",
			
			//The Organization    missing 5
			"[$laboratoryLegal$]","[$legalTestingLab$]","[$activitiesLarger$]","[$OrganizationNam$]","[$OrganizationRelationship$]",
			
			//Indicate Staff Size  2
			"[$ManagerialTestingLab$]","[$TechnicalTestingLab$]",
			
			//Staff Details 21
			"[$ClientStaffLab1$]","[$JobTitle1$]","[$MajorResponse1$]","[$scopeIndicate1$]",
			"[$ClientStaffLab2$]","[$JobTitle2$]","[$MajorResponse2$]","[$scopeIndicate2$]",
			"[$ClientStaffLab3$]","[$JobTitle3$]","[$MajorResponse3$]","[$scopeIndicate3$]",
			"[$ClientStaffLab4$]","[$JobTitle4$]","[$MajorResponse4$]","[$scopeIndicate4$]",
			"[$ClientStaffLab5$]","[$JobTitle5$]","[$MajorResponse5$]","[$scopeIndicate5$]",
			"[$standardsRelevant$]",
			
			// List the scope of the tests for which accreditation is being	32
			"[$LabMaterial1$]","[$LabTests1$]","[$LabTechnique1$]","[$LabEquipment1$]","[$Capability1$]","[$UncertaintyTesting1$]",
			"[$LabMaterial2$]","[$LabTests2$]","[$LabTechnique2$]","[$LabEquipment2$]","[$Capability2$]","[$UncertaintyTesting2$]",
			"[$LabMaterial3$]","[$LabTests3$]","[$LabTechnique3$]","[$LabEquipment3$]","[$Capability3$]","[$UncertaintyTesting3$]",
			"[$LabMaterial4$]","[$LabTests4$]","[$LabTechnique4$]","[$LabEquipment4$]","[$Capability4$]","[$UncertaintyTesting4$]",
			"[$LabMaterial5$]","[$LabTests5$]","[$LabTechnique5$]","[$LabEquipment5$]","[$Capability5$]","[$UncertaintyTesting5$]",
			"[$TestingLabincome$]","[$LaboratoryServicesClient$]",
			
			//Resource Requirements Personnel 2
			"[$influenceLab$]","[$qualificationsRequirementPro$]",
			
			//If your application covers activities performed at more than one location (including virtual sites if applicable), provide details in the table below 20
			"[$TestingLabNo1$]","[$TestingLabAddress1$]","[$LocationActivitiesLab1$]","[$ContactLocationDe1$]",
			"[$TestingLabNo2$]","[$TestingLabAddress2$]","[$LocationActivitiesLab2$]","[$ContactLocationDe2$]",
			"[$TestingLabNo3$]","[$TestingLabAddress3$]","[$LocationActivitiesLab3$]","[$ContactLocationDe3$]",
			"[$TestingLabNo4$]","[$TestingLabAddress4$]","[$LocationActivitiesLab4$]","[$ContactLocationDe4$]",
			"[$TestingLabNo5$]","[$TestingLabAddress5$]","[$LocationActivitiesLab5$]","[$ContactLocationDe5$]",
			
			//Describe the layout (include the floor plan) identifying personnel and material flow(s) of (CLAUSES 6.3) 7
			"[$laboratoryFacilitiesLab$]","[$ContractedLabTesting$]","[$LabFacilitiesTerms$]","[$environmentalConditions$]","[$MonitoringEnviromental$]",
			"[$fireProtection$]","[$unauthorizedSafety$]",
			
			//List the major equipment used in the tests for which accreditation is being sought Include equipment contracted for use by the laboratory (CLAUSE 6.4) 30
			"[$InventoryNum1$]","[$LabTItem1$]","[$ManufacturerLab1$]","[$ModelNumberLab1$]","[$CalibrationIntervalLab1$]","[$CalibratedTestingLab1$]",
			"[$InventoryNum2$]","[$LabTItem2$]","[$ManufacturerLab2$]","[$ModelNumberLab2$]","[$CalibrationIntervalLab2$]","[$CalibratedTestingLab2$]",
			"[$InventoryNum3$]","[$LabTItem3$]","[$ManufacturerLab3$]","[$ModelNumberLab3$]","[$CalibrationIntervalLab3$]","[$CalibratedTestingLab3$]",
			"[$InventoryNum4$]","[$LabTItem4$]","[$ManufacturerLab4$]","[$ModelNumberLab4$]","[$CalibrationIntervalLab4$]","[$CalibratedTestingLab4$]",
			"[$InventoryNum5$]","[$LabTItem5$]","[$ManufacturerLab5$]","[$ModelNumberLab5$]","[$CalibrationIntervalLab5$]","[$CalibratedTestingLab5$]",
			
			//Management System Requirements 14
			"[$objectivesFulfilling$]","[$DocumentationLab$]",
			"[$normativeReference$]","[$StandardsLab$]",
			"[$ProvisionsCon$]","[$confidentialityDocument$]",
			"[$implementationContinuous$]","[$ImplementedOther$]","[$managementOtherDocument$]","[$RefLaboratory$]","[$describingRoles$]","[$DesRolesDoc$]",
			"[$personnelResponsibilitiesTab$]","[$interrelationshipPerson$]",
			
			
			//Management System Documentation - Resource Requirements 14
			"[$tendersCon$]","[$contractsReq$]",
			"[$SelectionTraning$]","[$supervisionDocument$]",
			"[$storageUse$]","[$maintenanceEquipment$]",
			"[$CalibrationPro$]","[$ProgrameTestLab$]","[$DefiningReview$]","[$requirementsExternally$]","[$monitoringPerformance$]","[$servicesLab$]",
			"[$necessaryTab$]","[$ServiceLabTab$]",
			
			//Management System Documentation - Process Requirements 18
			"[$ReviewStand$]","[$LaboratoryRef$]",
			"[$ProceduresFor$]","[$norStand$]",
			"[$validationTest$]","[$TestingRefTo$]",
			"[$samplingPlan$]","[$PlanReference$]",
			"[$TransportationReceipt$]","[$protectionStorage$]",
			"[$measurementUnc$]","[$LaboratoryRefTT$]",
			"[$MonitoringResult$]","[$validityResult$]",
			"[$ComplaintsAct$]","[$ComActTest$]",
			"[$NonconformingWork$]","[$WorkNonconforming$]",
			
			//Management System Procedures - Management Requirements 18
			"[$identificationUnique$]","[$managementSysT$]",
			"[$IdentificationCurrent$]","[$statusStatus$]",
			"[$Docchanges$]","[$Testingchanges$]",
			"[$ControlPlan$]","[$LaboratoryDocm$]",
			"[$addressRisk$]","[$DocumentationLab$]",
			"[$improvementOpp$]","[$ReferenceTo$]",
			"[$actionCorr$]","[$LaboratoryDocum$]",
			"[$auditsInternal$]","[$LaboratoryTestS$]",
			"[$reviewsManag$]","[$WorkTforming$]",
			
			//Other Requirements 4
			"[$submittedMethodApp$]","[$representativeApplicantName$]",
			"[$positionMethodRepre$]","[$DateMethodPosition$]",
			
			//signature 1
			"[$MethodSignatureRep$]"
			
			
			
			
			},
			new String[] {
		    //Application Information 2
    		Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getNameOfApplicant())?mediLabApplicationInfo.getNameOfApplicant():"",
    		Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getApplicantAddress())?mediLabApplicationInfo.getApplicantAddress():"",
    			
    		//Contact Information 13
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getAppliTelephoneNo())?mediLabApplicationInfo.getAppliTelephoneNo():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getAppliFaxNo())?mediLabApplicationInfo.getAppliFaxNo():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getAppliWebsite())?mediLabApplicationInfo.getAppliWebsite():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getLaboratoryName())?mediLabApplicationInfo.getLaboratoryName():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getLaboratoryAddress())?mediLabApplicationInfo.getLaboratoryAddress():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getNameOfIncharge())?mediLabApplicationInfo.getNameOfIncharge():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getEmailOfIncharge())?mediLabApplicationInfo.getEmailOfIncharge():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getPersonnelQMName())?mediLabApplicationInfo.getPersonnelQMName():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getPersonnelQMEmail())?mediLabApplicationInfo.getPersonnelQMEmail():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getDeputyInchargeName())?mediLabApplicationInfo.getDeputyInchargeName():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getDeputyInchargeEmail())?mediLabApplicationInfo.getDeputyInchargeEmail():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getPersonnelFMName())?mediLabApplicationInfo.getPersonnelFMName():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getPersonnelFMEmail())?mediLabApplicationInfo.getPersonnelFMEmail():"",
								
				
			//Name & Email Address of Person Responsible for Technical Management 10
            (labAppliInfo!=null)&&(labAppliInfo.size()>0)?labAppliInfo.get(0).getName():"",
		    (labAppliInfo!=null)&&(labAppliInfo.size()>0)?labAppliInfo.get(0).getEmail():"",
		    
					    				
			(labAppliInfo!=null)&&(labAppliInfo.size()>1)?labAppliInfo.get(1).getName():"",
			(labAppliInfo!=null)&&(labAppliInfo.size()>1)?labAppliInfo.get(1).getEmail():"",
			
								
			(labAppliInfo!=null)&&(labAppliInfo.size()>2)?labAppliInfo.get(2).getName():"",
			(labAppliInfo!=null)&&(labAppliInfo.size()>2)?labAppliInfo.get(2).getEmail():"",
			
			
			(labAppliInfo!=null)&&(labAppliInfo.size()>3)?labAppliInfo.get(3).getName():"",
			(labAppliInfo!=null)&&(labAppliInfo.size()>3)?labAppliInfo.get(3).getEmail():"",
			

			(labAppliInfo!=null)&&(labAppliInfo.size()>4)?labAppliInfo.get(4).getName():"",
			(labAppliInfo!=null)&&(labAppliInfo.size()>4)?labAppliInfo.get(4).getEmail():"",
					
					
			//other remaining  4
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getAccRequestType())?mediLabApplicationInfo.getAccRequestType():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getAuthorizedPersonnelName())?mediLabApplicationInfo.getAuthorizedPersonnelName():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getAuthorizedPosition())?mediLabApplicationInfo.getAuthorizedPosition():"",
		    Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getAuthorizedPersonnelDate())?dateFormat.format(mediLabApplicationInfo.getAuthorizedPersonnelDate()):"",

			//Signature of Authorized Personnel 1
		    signatureForAuthorizedPersonnel,
		    
		    //Company Seal/ Company Stamp 1
		    signaturecompanySeal,
		    
		    
		    //The Organization 2
    		Validator.isNotNull(mediLabTestDescription)&&Validator.isNotNull(mediLabTestDescription.getTestClinicalActivity())?mediLabTestDescription.getTestClinicalActivity():"",
			Validator.isNotNull(mediLabTestDescription)&&Validator.isNotNull(mediLabTestDescription.getTestLabShiftWork())?mediLabTestDescription.getTestLabShiftWork():"",
					
		 
			//Specimen Collection Sites 10
		    (descOfActivity!=null)&&(descOfActivity.size()>0)?descOfActivity.get(0).getNumber():"",
			(descOfActivity!=null)&&(descOfActivity.size()>0)?descOfActivity.get(0).getLocation():"",
					    				
			(descOfActivity!=null)&&(descOfActivity.size()>1)?descOfActivity.get(1).getNumber():"",
			(descOfActivity!=null)&&(descOfActivity.size()>1)?descOfActivity.get(1).getLocation():"",
								
			(descOfActivity!=null)&&(descOfActivity.size()>2)?descOfActivity.get(2).getNumber():"",
			(descOfActivity!=null)&&(descOfActivity.size()>2)?descOfActivity.get(2).getLocation():"",
			
			(descOfActivity!=null)&&(descOfActivity.size()>3)?descOfActivity.get(3).getNumber():"",
			(descOfActivity!=null)&&(descOfActivity.size()>3)?descOfActivity.get(3).getLocation():"",
			
			(descOfActivity!=null)&&(descOfActivity.size()>4)?descOfActivity.get(4).getNumber():"",
			(descOfActivity!=null)&&(descOfActivity.size()>4)?descOfActivity.get(4).getLocation():"",	
					
					
			//The Organization 7
			Validator.isNotNull(mediLabTestStructural)&&Validator.isNotNull(mediLabTestStructural.getTestLabLegalEntity())?mediLabTestStructural.getTestLabLegalEntity():"",
			Validator.isNotNull(mediLabTestStructural)&&Validator.isNotNull(mediLabTestStructural.getTestlegalStatus())?mediLabTestStructural.getTestlegalStatus():"",
			Validator.isNotNull(mediLabTestStructural)&&Validator.isNotNull(mediLabTestStructural.getTestlabPartOfOrg())?mediLabTestStructural.getTestlabPartOfOrg():"",
			Validator.isNotNull(mediLabTestStructural)&&Validator.isNotNull(mediLabTestStructural.getTestlabPartOfOrgName())?mediLabTestStructural.getTestlabPartOfOrgName():"",
			Validator.isNotNull(mediLabTestStructural)&&Validator.isNotNull(mediLabTestStructural.getTestLabPartOfOrgPos())?mediLabTestStructural.getTestLabPartOfOrgPos():"",
			Validator.isNotNull(mediLabTestStructural)&&Validator.isNotNull(mediLabTestStructural.getTestMangerialStaff())?mediLabTestStructural.getTestMangerialStaff():"",
			Validator.isNotNull(mediLabTestStructural)&&Validator.isNotNull(mediLabTestStructural.getTestTechnicalStaff())?mediLabTestStructural.getTestTechnicalStaff():"",
			
			//	Staff Details 21
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
			 
			Validator.isNotNull(mediLabTestStructural)&&Validator.isNotNull(mediLabTestStructural.getTestingRelevantDoc())?mediLabTestStructural.getTestingRelevantDoc():"",		
					
			// List the scope of the tests for which accreditation is being	32
			(labStructInfo!=null)&&(labStructInfo.size()>0)?labStructInfo.get(0).getProductMaterial():"",
			(labStructInfo!=null)&&(labStructInfo.size()>0)?labStructInfo.get(0).getTests():"",
			(labStructInfo!=null)&&(labStructInfo.size()>0)?labStructInfo.get(0).getMethod():"",
			(labStructInfo!=null)&&(labStructInfo.size()>0)?labStructInfo.get(0).getEquipment():"",
			(labStructInfo!=null)&&(labStructInfo.size()>0)?labStructInfo.get(0).getListOfCapability():"",
			(labStructInfo!=null)&&(labStructInfo.size()>0)?labStructInfo.get(0).getEstimateOfMeasurement():"",
				
			(labStructInfo!=null)&&(labStructInfo.size()>1)?labStructInfo.get(1).getProductMaterial():"",
			(labStructInfo!=null)&&(labStructInfo.size()>1)?labStructInfo.get(1).getTests():"",
			(labStructInfo!=null)&&(labStructInfo.size()>1)?labStructInfo.get(1).getMethod():"",
			(labStructInfo!=null)&&(labStructInfo.size()>1)?labStructInfo.get(1).getEquipment():"",
			(labStructInfo!=null)&&(labStructInfo.size()>1)?labStructInfo.get(1).getListOfCapability():"",
			(labStructInfo!=null)&&(labStructInfo.size()>1)?labStructInfo.get(1).getEstimateOfMeasurement():"",
			
			(labStructInfo!=null)&&(labStructInfo.size()>2)?labStructInfo.get(2).getProductMaterial():"",
			(labStructInfo!=null)&&(labStructInfo.size()>2)?labStructInfo.get(2).getTests():"",
			(labStructInfo!=null)&&(labStructInfo.size()>2)?labStructInfo.get(2).getMethod():"",
			(labStructInfo!=null)&&(labStructInfo.size()>2)?labStructInfo.get(2).getEquipment():"",
			(labStructInfo!=null)&&(labStructInfo.size()>2)?labStructInfo.get(2).getListOfCapability():"",
			(labStructInfo!=null)&&(labStructInfo.size()>2)?labStructInfo.get(2).getEstimateOfMeasurement():"",
					
			(labStructInfo!=null)&&(labStructInfo.size()>3)?labStructInfo.get(3).getProductMaterial():"",
			(labStructInfo!=null)&&(labStructInfo.size()>3)?labStructInfo.get(3).getTests():"",
			(labStructInfo!=null)&&(labStructInfo.size()>3)?labStructInfo.get(3).getMethod():"",
			(labStructInfo!=null)&&(labStructInfo.size()>3)?labStructInfo.get(3).getEquipment():"",
			(labStructInfo!=null)&&(labStructInfo.size()>3)?labStructInfo.get(3).getListOfCapability():"",
			(labStructInfo!=null)&&(labStructInfo.size()>3)?labStructInfo.get(3).getEstimateOfMeasurement():"",
					
			(labStructInfo!=null)&&(labStructInfo.size()>4)?labStructInfo.get(4).getProductMaterial():"",
			(labStructInfo!=null)&&(labStructInfo.size()>4)?labStructInfo.get(4).getTests():"",
			(labStructInfo!=null)&&(labStructInfo.size()>4)?labStructInfo.get(4).getMethod():"",
			(labStructInfo!=null)&&(labStructInfo.size()>4)?labStructInfo.get(4).getEquipment():"",
			(labStructInfo!=null)&&(labStructInfo.size()>4)?labStructInfo.get(4).getListOfCapability():"",
			(labStructInfo!=null)&&(labStructInfo.size()>4)?labStructInfo.get(4).getEstimateOfMeasurement():"",		
			
			 Validator.isNotNull(mediLabTestStructural)&&Validator.isNotNull(mediLabTestStructural.getTestMajorIncome())?mediLabTestStructural.getTestMajorIncome():"",
			 Validator.isNotNull(mediLabTestStructural)&&Validator.isNotNull(mediLabTestStructural.getTestLabClients())?mediLabTestStructural.getTestLabClients():"",
					
			//	Resource Requirements	2
			Validator.isNotNull(mediLabTestResourceReq)&&Validator.isNotNull(mediLabTestResourceReq.getTestExternal())?mediLabTestResourceReq.getTestExternal():"",
			Validator.isNotNull(mediLabTestResourceReq)&&Validator.isNotNull(mediLabTestResourceReq.getTestCompetence())?mediLabTestResourceReq.getTestCompetence():"",
				
			//f your application covers activities performed at more than one location 	27	
			(labResourceReqfirstInfo!=null)&&(labResourceReqfirstInfo.size()>0)?labResourceReqfirstInfo.get(0).getNum():"",
			(labResourceReqfirstInfo!=null)&&(labResourceReqfirstInfo.size()>0)?labResourceReqfirstInfo.get(0).getLocation():"",
			(labResourceReqfirstInfo!=null)&&(labResourceReqfirstInfo.size()>0)?labResourceReqfirstInfo.get(0).getActivities():"",
			(labResourceReqfirstInfo!=null)&&(labResourceReqfirstInfo.size()>0)?labResourceReqfirstInfo.get(0).getContactDetails():"",
				
			(labResourceReqfirstInfo!=null)&&(labResourceReqfirstInfo.size()>1)?labResourceReqfirstInfo.get(1).getNum():"",
			(labResourceReqfirstInfo!=null)&&(labResourceReqfirstInfo.size()>1)?labResourceReqfirstInfo.get(1).getLocation():"",
			(labResourceReqfirstInfo!=null)&&(labResourceReqfirstInfo.size()>1)?labResourceReqfirstInfo.get(1).getActivities():"",
			(labResourceReqfirstInfo!=null)&&(labResourceReqfirstInfo.size()>1)?labResourceReqfirstInfo.get(1).getContactDetails():"",
			
			(labResourceReqfirstInfo!=null)&&(labResourceReqfirstInfo.size()>2)?labResourceReqfirstInfo.get(2).getNum():"",
			(labResourceReqfirstInfo!=null)&&(labResourceReqfirstInfo.size()>2)?labResourceReqfirstInfo.get(2).getLocation():"",
			(labResourceReqfirstInfo!=null)&&(labResourceReqfirstInfo.size()>2)?labResourceReqfirstInfo.get(2).getActivities():"",
			(labResourceReqfirstInfo!=null)&&(labResourceReqfirstInfo.size()>2)?labResourceReqfirstInfo.get(2).getContactDetails():"",
					
			(labResourceReqfirstInfo!=null)&&(labResourceReqfirstInfo.size()>3)?labResourceReqfirstInfo.get(3).getNum():"",
			(labResourceReqfirstInfo!=null)&&(labResourceReqfirstInfo.size()>3)?labResourceReqfirstInfo.get(3).getLocation():"",
			(labResourceReqfirstInfo!=null)&&(labResourceReqfirstInfo.size()>3)?labResourceReqfirstInfo.get(3).getActivities():"",
			(labResourceReqfirstInfo!=null)&&(labResourceReqfirstInfo.size()>3)?labResourceReqfirstInfo.get(3).getContactDetails():"",
					
			(labResourceReqfirstInfo!=null)&&(labResourceReqfirstInfo.size()>4)?labResourceReqfirstInfo.get(4).getNum():"",
			(labResourceReqfirstInfo!=null)&&(labResourceReqfirstInfo.size()>4)?labResourceReqfirstInfo.get(4).getLocation():"",
			(labResourceReqfirstInfo!=null)&&(labResourceReqfirstInfo.size()>4)?labResourceReqfirstInfo.get(4).getActivities():"",
			(labResourceReqfirstInfo!=null)&&(labResourceReqfirstInfo.size()>4)?labResourceReqfirstInfo.get(4).getContactDetails():"",
					
			Validator.isNotNull(mediLabTestResourceReq)&&Validator.isNotNull(mediLabTestResourceReq.getTestLabFacilities())?mediLabTestResourceReq.getTestLabFacilities():"",
			Validator.isNotNull(mediLabTestResourceReq)&&Validator.isNotNull(mediLabTestResourceReq.getTestLabContracted())?mediLabTestResourceReq.getTestLabContracted():"",
			Validator.isNotNull(mediLabTestResourceReq)&&Validator.isNotNull(mediLabTestResourceReq.getTestLabFacilityEnv())?mediLabTestResourceReq.getTestLabFacilityEnv():"",
			Validator.isNotNull(mediLabTestResourceReq)&&Validator.isNotNull(mediLabTestResourceReq.getTestSpecialEnv())?mediLabTestResourceReq.getTestSpecialEnv():"",
			Validator.isNotNull(mediLabTestResourceReq)&&Validator.isNotNull(mediLabTestResourceReq.getTestMonitoringAct())?mediLabTestResourceReq.getTestMonitoringAct():"",
			Validator.isNotNull(mediLabTestResourceReq)&&Validator.isNotNull(mediLabTestResourceReq.getTestLabRelatedEquip())?mediLabTestResourceReq.getTestLabRelatedEquip():"",
			Validator.isNotNull(mediLabTestResourceReq)&&Validator.isNotNull(mediLabTestResourceReq.getTestSecurityArrange())?mediLabTestResourceReq.getTestSecurityArrange():"",		

			//List the major equipment used in the tests for which accreditation 30		
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>0)?labResourceReqSecInfo.get(0).getInventoryNumber():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>0)?labResourceReqSecInfo.get(0).getItem():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>0)?labResourceReqSecInfo.get(0).getManufacturer():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>0)?labResourceReqSecInfo.get(0).getModelNumber():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>0)?labResourceReqSecInfo.get(0).getCalibrationInterval():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>0)?labResourceReqSecInfo.get(0).getCalibratedBy():"",
					
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>1)?labResourceReqSecInfo.get(1).getInventoryNumber():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>1)?labResourceReqSecInfo.get(1).getItem():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>1)?labResourceReqSecInfo.get(1).getManufacturer():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>1)?labResourceReqSecInfo.get(1).getModelNumber():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>1)?labResourceReqSecInfo.get(1).getCalibrationInterval():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>1)?labResourceReqSecInfo.get(1).getCalibratedBy():"",

			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>2)?labResourceReqSecInfo.get(2).getInventoryNumber():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>2)?labResourceReqSecInfo.get(2).getItem():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>2)?labResourceReqSecInfo.get(2).getManufacturer():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>2)?labResourceReqSecInfo.get(2).getModelNumber():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>2)?labResourceReqSecInfo.get(2).getCalibrationInterval():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>2)?labResourceReqSecInfo.get(2).getCalibratedBy():"",
					
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>3)?labResourceReqSecInfo.get(3).getInventoryNumber():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>3)?labResourceReqSecInfo.get(3).getItem():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>3)?labResourceReqSecInfo.get(3).getManufacturer():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>3)?labResourceReqSecInfo.get(3).getModelNumber():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>3)?labResourceReqSecInfo.get(3).getCalibrationInterval():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>3)?labResourceReqSecInfo.get(3).getCalibratedBy():"",
					
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>4)?labResourceReqSecInfo.get(4).getInventoryNumber():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>4)?labResourceReqSecInfo.get(4).getItem():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>4)?labResourceReqSecInfo.get(4).getManufacturer():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>4)?labResourceReqSecInfo.get(4).getModelNumber():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>4)?labResourceReqSecInfo.get(4).getCalibrationInterval():"",
			(labResourceReqSecInfo!=null)&&(labResourceReqSecInfo.size()>4)?labResourceReqSecInfo.get(4).getCalibratedBy():"",		

					
			//Management System Requirements	64	
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getPoliciesForFulfil())?mediLabTestManageReq.getPoliciesForFulfil():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefPolicies())?mediLabTestManageReq.getLabDocRefPolicies():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getImpartialityProvision())?mediLabTestManageReq.getImpartialityProvision():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefImpartProv())?mediLabTestManageReq.getLabDocRefImpartProv():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getConfidientialityProv())?mediLabTestManageReq.getConfidientialityProv():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefConfid())?mediLabTestManageReq.getLabDocRefConfid():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getCommitmentEvidence())?mediLabTestManageReq.getCommitmentEvidence():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefCommitment())?mediLabTestManageReq.getLabDocRefCommitment():"",	
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getReferenceEvidence())?mediLabTestManageReq.getReferenceEvidence():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefReference())?mediLabTestManageReq.getLabDocRefReference():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getDocDescribingRole())?mediLabTestManageReq.getDocDescribingRole():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefDocDes())?mediLabTestManageReq.getLabDocRefDocDes():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getRolesofPersonnel())?mediLabTestManageReq.getRolesofPersonnel():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefRoles())?mediLabTestManageReq.getLabDocRefRoles():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getCompetenceReq())?mediLabTestManageReq.getCompetenceReq():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefCompetence())?mediLabTestManageReq.getLabDocRefCompetence():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getSelectionOfPerson())?mediLabTestManageReq.getSelectionOfPerson():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefSelection())?mediLabTestManageReq.getLabDocRefSelection():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getHandlingEquip())?mediLabTestManageReq.getHandlingEquip():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefHandling())?mediLabTestManageReq.getLabDocRefHandling():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getCalibrationProgram())?mediLabTestManageReq.getCalibrationProgram():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefCalibrat())?mediLabTestManageReq.getLabDocRefCalibrat():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getApprovingReq())?mediLabTestManageReq.getApprovingReq():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefApproving())?mediLabTestManageReq.getLabDocRefApproving():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getMonitorPerformance())?mediLabTestManageReq.getMonitorPerformance():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefMonitor())?mediLabTestManageReq.getLabDocRefMonitor():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getEnsuringService())?mediLabTestManageReq.getEnsuringService():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefEnsuring())?mediLabTestManageReq.getLabDocRefEnsuring():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getReviewOfRequest())?mediLabTestManageReq.getReviewOfRequest():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefRequest())?mediLabTestManageReq.getLabDocRefRequest():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getProcedureForLab())?mediLabTestManageReq.getProcedureForLab():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefProcedure())?mediLabTestManageReq.getLabDocRefProcedure():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getTestMethodValidat())?mediLabTestManageReq.getTestMethodValidat():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefTestMethod())?mediLabTestManageReq.getLabDocRefTestMethod():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getSamplingPlan())?mediLabTestManageReq.getSamplingPlan():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefSampling())?mediLabTestManageReq.getLabDocRefSampling():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getTransportationReciept())?mediLabTestManageReq.getTransportationReciept():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefTransport())?mediLabTestManageReq.getLabDocRefTransport():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getUncertainityMeasure())?mediLabTestManageReq.getUncertainityMeasure():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefUncertain())?mediLabTestManageReq.getLabDocRefUncertain():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getTestResultValidity())?mediLabTestManageReq.getTestResultValidity():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocReftestResult())?mediLabTestManageReq.getLabDocReftestResult():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getComplaints())?mediLabTestManageReq.getComplaints():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefComplaints())?mediLabTestManageReq.getLabDocRefComplaints():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getNonConformingWork())?mediLabTestManageReq.getNonConformingWork():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefNonConfirm())?mediLabTestManageReq.getLabDocRefNonConfirm():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getUniqueIdentification())?mediLabTestManageReq.getUniqueIdentification():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefUnique())?mediLabTestManageReq.getLabDocRefUnique():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getCurrentRevisionStatus())?mediLabTestManageReq.getCurrentRevisionStatus():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefCurrentRev())?mediLabTestManageReq.getLabDocRefCurrentRev():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getDocChangeIdentify())?mediLabTestManageReq.getDocChangeIdentify():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefDocChange())?mediLabTestManageReq.getLabDocRefDocChange():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getRecordControl())?mediLabTestManageReq.getRecordControl():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefRecordControl())?mediLabTestManageReq.getLabDocRefRecordControl():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getPlannedAction())?mediLabTestManageReq.getPlannedAction():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefPlanned())?mediLabTestManageReq.getLabDocRefPlanned():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getImporvementOpportunity())?mediLabTestManageReq.getImporvementOpportunity():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefImprovement())?mediLabTestManageReq.getLabDocRefImprovement():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getCorrectiveAction())?mediLabTestManageReq.getCorrectiveAction():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefCorrective())?mediLabTestManageReq.getLabDocRefCorrective():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getInternalAudits())?mediLabTestManageReq.getInternalAudits():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefInternal())?mediLabTestManageReq.getLabDocRefInternal():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getManagementReview())?mediLabTestManageReq.getManagementReview():"",
			Validator.isNotNull(mediLabTestManageReq)&&Validator.isNotNull(mediLabTestManageReq.getLabDocRefManagement())?mediLabTestManageReq.getLabDocRefManagement():"",
					
		
			//Other Requirements 4	
			Validator.isNotNull(mediLabOtherReq)&&Validator.isNotNull(mediLabOtherReq.getPaymentMethod())?mediLabOtherReq.getPaymentMethod():"",
			Validator.isNotNull(mediLabOtherReq)&&Validator.isNotNull(mediLabOtherReq.getRepresentativeName())?mediLabOtherReq.getRepresentativeName():"",
			Validator.isNotNull(mediLabOtherReq)&&Validator.isNotNull(mediLabOtherReq.getRepresentativePos())?mediLabOtherReq.getRepresentativePos():"",
			Validator.isNotNull(mediLabOtherReq)&&Validator.isNotNull(mediLabOtherReq.getSignDate())?dateFormat.format(mediLabOtherReq.getSignDate()):"",
			
			//signature 1
			signaturerepresentative	
					
			
     
		  			
					
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
		String accreditationApplicable="";
		String includingRelationship="";
		
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
				accreditationApplicable=fileName;
			}else if(title.equals("Proficiency testing (PT) programme and PT and or interlaboratory comparison results obtained within the last two years")) {
				includingRelationship=fileName;
			}
			
		}
		pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
			"[$premisesOwned$]","[$stampedLaboratoryDulySig$]","[$equipmentActivities$]","[$objectivesFu$]","[$organizationalChart$]","[$InfluencingCompetence$]",
			"[$TestMethod$]","[$qualificationCertificates$]","[$normativeDocument$]","[$ProficiencyResults$]",
			
			},
			new String[] {
					proofOfLegal, genericCertificate,authorizedPolicy,policyProcedure,policyPotential,authorizedCopy,evidenceQualification,certificateOfQualification,accreditationApplicable,includingRelationship,
				});
		}

		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] { "[$PayMethodTechnical$]" },
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