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
import com.nbp.janaac.application.form.service.model.AccMediLabActivitiesDesc;
import com.nbp.janaac.application.form.service.model.AccMediLabApplicationInfo;
import com.nbp.janaac.application.form.service.model.AccMediLabManagementReq;
import com.nbp.janaac.application.form.service.model.AccMediLabOrganization;
import com.nbp.janaac.application.form.service.model.AccMediLabOtherReq;
import com.nbp.janaac.application.form.service.model.AccMediLabPhysicalResource;
import com.nbp.janaac.application.form.service.model.AddLabAppliInfo;
import com.nbp.janaac.application.form.service.model.AddLabDescOfActivity;
import com.nbp.janaac.application.form.service.model.AddLabMedicalDescOfActiSec;
import com.nbp.janaac.application.form.service.model.AddLabMedicalOrganFirst;
import com.nbp.janaac.application.form.service.model.AddLabMedicalOrganSec;
import com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalFirst;
import com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalSec;
import com.nbp.janaac.application.form.service.model.AddLaboratoryPartOfOrg;
import com.nbp.janaac.application.form.service.model.JanaacApplication;
import com.nbp.janaac.application.form.service.model.JanaacApplicationPayment;
import com.nbp.janaac.application.form.service.service.AccMediLabActivitiesDescLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccMediLabApplicationInfoLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccMediLabManagementReqLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccMediLabOrganizationLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccMediLabOtherReqLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccMediLabPhysicalResourceLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddLabAppliInfoLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddLabDescOfActivityLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddLabMedicalDescOfActiSecLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddLabMedicalOrganFirstLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddLabMedicalOrganSecLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddLabMedicalPhysicalFirstLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddLabMedicalPhysicalSecLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddLaboratoryPartOfOrgLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.JanaacApplicationLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.JanaacApplicationPaymentLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MedicalLabPdf {
	public static String replaceSignatureForJanaac(long janaacApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Authorized Personnel");
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
				"Application Company Stamp");
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
				"Accre Medical representative signature");
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
	public static String janaacMedicalLabPdf(long janaacApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		JanaacApplication janaacApplication=null;
		
		AccMediLabApplicationInfo application = null;
	
	   List<AddLabAppliInfo> LabAppliInfo = null;
	   
		AccMediLabActivitiesDesc accMedicalActivity=null;
		
	List<AddLabDescOfActivity> descOfActivity = null;
   List<AddLabMedicalDescOfActiSec> medicalDecSecInfo = null;
   
   AccMediLabOrganization accMediLabOrganization=null;
   
  List<AddLaboratoryPartOfOrg> laboratoryPartOfOrg=null; 
 List<AddLabMedicalOrganFirst> organLabFirstInfo = null;
 List<AddLabMedicalOrganSec> organLabSecInfo = null;
 List<AddLabMedicalPhysicalFirst> physicalFirstInfo=null;
 List<AddLabMedicalPhysicalSec> physicalSecondInfo = null;
 
 AccMediLabPhysicalResource accMediPhysical=null;
 
 AccMediLabManagementReq accMediLabManagement=null;
 
 AccMediLabOtherReq otherReq=null;
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
			janaacApplication=JanaacApplicationLocalServiceUtil.getJanaacApplication(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			application=AccMediLabApplicationInfoLocalServiceUtil.getApplicantInfo(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			LabAppliInfo=AddLabAppliInfoLocalServiceUtil.getJanaacById(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			accMedicalActivity=AccMediLabActivitiesDescLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			descOfActivity=AddLabDescOfActivityLocalServiceUtil.getJanaacById(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			medicalDecSecInfo=AddLabMedicalDescOfActiSecLocalServiceUtil.getJanaacById(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			accMediLabOrganization=AccMediLabOrganizationLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			laboratoryPartOfOrg=AddLaboratoryPartOfOrgLocalServiceUtil.getJanaacByAppId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			organLabFirstInfo=AddLabMedicalOrganFirstLocalServiceUtil.getJanaacById(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			organLabSecInfo=AddLabMedicalOrganSecLocalServiceUtil.getJanaacById(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			physicalFirstInfo=AddLabMedicalPhysicalFirstLocalServiceUtil.getJanaacById(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			physicalSecondInfo=AddLabMedicalPhysicalSecLocalServiceUtil.getJanaacById(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			accMediPhysical=AccMediLabPhysicalResourceLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			accMediLabManagement=AccMediLabManagementReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			otherReq=AccMediLabOtherReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
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
			  signatureForAuthorizedPersonnel =replaceSignatureForJanaac(janaacApplication.getJanaacApplicationId(), "Signature of Authorized Personnel", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}
		  try { 
			  companySealCertificationBodies =replaceCompanySealForJanaac(janaacApplication.getJanaacApplicationId(), "Application Company Stamp", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}
		  try { 
			  signatureOtherRequirement =replaceSignOtherForJanaac(janaacApplication.getJanaacApplicationId(), "Accre Medical representative signature", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		    }catch (Exception e) {}

		
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"weighing-device");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"accreditation-of-medical-labs");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = 
					StringUtil.replace(pdfTemplate, 
			new String[] {
					
			//first form start
					
			//Application Information 2
					
			"[$LabMedName$]","[$AddressLabMed$]",
			
			//Contact Information 13
			
			"[$LabMedTele$]","[$FaxLabMed$]","[$WebsiteLabMed$]","[$LabMedSeeking$]","[$LabMedAdd$]","[$CertificationLabMed$]","[$emailLabMed$]",
			"[$CertificationLabMedPerson$]","[$emailLabMedAdd$]","[$LabMedCharges$]","[$LabMedAlterEmail$]","[$LabMedFinancial$]","[$LabMedMatter$]",
			
			//add more first 5
			
			"[$MedicalLabName1$]","[$MedicalLabEmail1$]",
			"[$MedicalLabName2$]","[$MedicalLabEmail2$]",
			"[$MedicalLabName3$]","[$MedicalLabEmail3$]",
			"[$MedicalLabName4$]","[$MedicalLabEmail4$]",
			"[$MedicalLabName5$]","[$MedicalLabEmail5$]",
			
			//other remaining 4
			
			"[$AppropriateLabMed$]","[$NameAuthorizedLabMed$]","[$PositionLabMed$]",
			"[$LegaldateLabMed$]",
			//signature 1
			
			"[$SignLabMed$]",
			
			//seal 1
			
			"[$CompanyLabMed$]",

			//form 1 complete
			
			//form 2 start  3
			
			"[$ClinicalMed$]","[$ShiftWorkMed$]",
			
			
              //add more first 5
			
			"[$NumberMed1$]","[$LocationMed1$]",
			"[$NumberMed2$]","[$LocationMed2$]",
			"[$NumberMed3$]","[$LocationMed3$]",
			"[$NumberMed4$]","[$LocationMed4$]",
			"[$NumberMed5$]","[$LocationMed5$]",
			
			
			
           //add more Second 5
			
			"[$RequestedPoint1$]","[$LocationPoint1$]",
			"[$RequestedPoint2$]","[$LocationPoint2$]",
			"[$RequestedPoint3$]","[$LocationPoint3$]",
			"[$RequestedPoint4$]","[$LocationPoint4$]",
			"[$RequestedPoint5$]","[$LocationPoint5$]",
			//form 2 complete
			
			//form 3 start 3
			
			"[$laboratoryEntit$]","[$legalSta$]","[$OrganizationExaminations$]",
			
			// add more first  5
			
			"[$NameResponsibility1$]","[$PositionsPoint1$]",
			"[$NameResponsibility2$]","[$PositionsPoint2$]",
			"[$NameResponsibility3$]","[$PositionsPoint3$]",
			"[$NameResponsibility4$]","[$PositionsPoint4$]",
			"[$NameResponsibility5$]","[$PositionsPoint5$]",
			
			//other remaining  1
			
			"[$requestedScope$]",
			
			//add more second 5
			
			"[$StaffMedName1$]","[$JobMed1$]","[$ResponsibilitiesMa1$]",
			"[$StaffMedName2$]","[$JobMed2$]","[$ResponsibilitiesMa2$]",
			"[$StaffMedName3$]","[$JobMed3$]","[$ResponsibilitiesMa3$]",
			"[$StaffMedName4$]","[$JobMed4$]","[$ResponsibilitiesMa4$]",
			"[$StaffMedName5$]","[$JobMed5$]","[$ResponsibilitiesMa5$]",
			
			//add more third
			
			"[$ProMaterial1$]","[$ProExaminations1$]","[$ProMethods1$]","[$ProEquipment1$]","[$ReferenceRange1$]","[$MeasurementUn1$]",
			"[$ProMaterial2$]","[$ProExaminations2$]","[$ProMethods2$]","[$ProEquipment2$]","[$ReferenceRange2$]","[$MeasurementUn2$]",
			"[$ProMaterial3$]","[$ProExaminations3$]","[$ProMethods3$]","[$ProEquipment3$]","[$ReferenceRange3$]","[$MeasurementUn3$]",
			"[$ProMaterial4$]","[$ProExaminations4$]","[$ProMethods4$]","[$ProEquipment4$]","[$ReferenceRange4$]","[$MeasurementUn4$]",
			"[$ProMaterial5$]","[$ProExaminations5$]","[$ProMethods5$]","[$ProEquipment5$]","[$ReferenceRange5$]","[$MeasurementUn5$]",
			
			
			//other 2
			
			"[$sourceIncome$]","[$LaboratoryServices$]",
				
			//form 3 complete
			
			//form 4 start
			
			
			//FIRST ADD MORE   5	
			
			"[$InventoryNum1$]","[$ItemM1$]","[$ManufacturerMed1$]","[$ModelNum1$]","[$CalibrationIn1$]","[$IntervalBy1$]",
			"[$InventoryNum2$]","[$ItemM2$]","[$ManufacturerMed2$]","[$ModelNum2$]","[$CalibrationIn2$]","[$IntervalBy2$]",
			"[$InventoryNum3$]","[$ItemM3$]","[$ManufacturerMed3$]","[$ModelNum3$]","[$CalibrationIn3$]","[$IntervalBy3$]",
			"[$InventoryNum4$]","[$ItemM4$]","[$ManufacturerMed4$]","[$ModelNum4$]","[$CalibrationIn4$]","[$IntervalBy4$]",
			"[$InventoryNum5$]","[$ItemM5$]","[$ManufacturerMed5$]","[$ModelNum5$]","[$CalibrationIn5$]","[$IntervalBy5$]",
			
			
			//SECOND ADD MORE 5
			"[$MedReqNo1$]","[$AddLocation1$]","[$performedLocation1$]","[$ContactDetails1$]",
			"[$MedReqNo2$]","[$AddLocation2$]","[$performedLocation2$]","[$ContactDetails2$]",
			"[$MedReqNo3$]","[$AddLocation3$]","[$performedLocation3$]","[$ContactDetails3$]",
			"[$MedReqNo4$]","[$AddLocation4$]","[$performedLocation4$]","[$ContactDetails4$]",
			"[$MedReqNo5$]","[$AddLocation5$]","[$performedLocation5$]","[$ContactDetails5$]",


				
			//OTHER 6
			
			"[$facilitiesType$]",
			"[$equipmentFire$]",
			"[$EnvironmentalSpecial$]",
			"[$monitoringLab$]",
			"[$unauthorizedArrangement$]",
			"[$LabRequirements$]",
		
			
			//form 4 complete
			
		
			//form 5 start
	 
			 //Management System Requirements     16
			"[$establishedImplement$]","[$ImplementedOther$]",
			
			"[$relevantPerson$]","[$temLaboratory$]",
			
			"[$acknowledgedImplemented$]","[$objectivesOther$]",
			
			"[$ControlledFulfilment$]","[$fulfilmentman$]",
			
			"[$legibleRecords$]","[$RecordsManual$]",
		
            "[$activitiesLab$]","[$templateReference$]",
			
			"[$IrrespectiveLab$]","[$outsourcedLab$]",
			
			"[$authorizeLabTest$]","[$authorizeReference$]",
			
			
			 
			//Management Requirements 24
			"[$internalDuties$]","[$internalCompetencies$]",
			
			"[$legibleRecord$]","[$legibleTemplate$]",
			
			"[$proceduresEstablishment$]","[$establishmentService$]",
			
			"[$communicatedPro$]","[$consultantsRef$]",
			
			"[$suppliesDuties$]","[$externalReference$]",
			
			"[$effectiveEnsure$]","[$arrangementsOt$]",
			
            "[$adequateNon$]","[$NonConFormities$]",
			
			"[$programmeCorrective$]","[$correctiveRelevent$]",
			
			"[$opportunities$]","[$RelevantImprovement$]",
			
			"[$recordsPerS$]","[$templateRetain$]",
			
			"[$laboratoryArrangement$]","[$outsourcedRelevant$]",
			
			"[$managementRev$]","[$ManualReference$]",
			
			
			
			//Management System - Resource and Process Requirements 36
			"[$availablePerson$]","[$availableCompetencies$]",
			
			"[$participateTech$]","[$managerialPart$]",
			
			"[$environmentalPlace$]","[$accommodationReference$]",
			
			"[$equipmentPlace$]","[$qualificationEquipment$]",
			
		    "[$verifyReagents$]","[$verifyOther$]",
			
			"[$documentedRr$]","[$preOther$]",
			
			"[$validatedSelected$]","[$ManualQuality$]",
			
			"[$resultsMonitoring$]","[$procedureReference$]",
			
			"[$qmethodsPro$]","[$methodsRele$]",
			
			"[$determinedPer$]","[$ReferenceReference$]",
			
			"[$proceduresRelease$]","[$proceduresLike$]",
			
			"[$programmePrev$]","[$programmeOther$]",
			
			
			"[$procedureCalibration$]","[$calibrationEquipment$]",
			
			"[$comparisonPro$]","[$proficiencyOther$]",
				
            "[$examinationEnsure$]","[$EnsurePlace$]",
			
			"[$accordanceResult$]","[$AccOther$]",
			
			"[$responsibilitiesHow$]","[$ResultReport$]",
			
			"[$laboratoryAuto$]","[$qualiRelevant$]",
			
			
			//form 6 complete
			
			//form 7 start
			
            "[$paymentMethod$]","[$representativeMethod$]","[$positionMethod$]",
			
			"[$DateMethod$]","[$MethodSignature$]"
			
			//form 7 end
			

			
				
			
			},
			new String[] {
		    //Application Information 2
	        Validator.isNotNull(application)&&Validator.isNotNull(application.getNameOfApplicant())?application.getNameOfApplicant():"",
    		Validator.isNotNull(application)&&Validator.isNotNull(application.getApplicantAddress())?application.getApplicantAddress():"",
    			
    		//Contact Information 13
			Validator.isNotNull(application)&&Validator.isNotNull(application.getAppliTelephoneNo())?application.getAppliTelephoneNo():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getAppliFaxNo())?application.getAppliFaxNo():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getAppliWebsite())?application.getAppliWebsite():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getLaboratoryName())?application.getLaboratoryName():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getLaboratoryAddress())?application.getLaboratoryAddress():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getNameOfIncharge())?application.getNameOfIncharge():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getEmailOfIncharge())?application.getEmailOfIncharge():"",
	        Validator.isNotNull(application)&&Validator.isNotNull(application.getPersonnelQMName())?application.getPersonnelQMName():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getPersonnelQMEmail())?application.getPersonnelQMEmail():"",
		    Validator.isNotNull(application)&&Validator.isNotNull(application.getDeputyInchargeName())?application.getDeputyInchargeName():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getDeputyInchargeEmail())?application.getDeputyInchargeEmail():"",						
			Validator.isNotNull(application)&&Validator.isNotNull(application.getPersonnelFMName())?application.getPersonnelFMName():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getPersonnelFMEmail())?application.getPersonnelFMEmail():"",
		
				
			//add more first 5
            (LabAppliInfo!=null)&&(LabAppliInfo.size()>0)?LabAppliInfo.get(0).getName():"",
		    (LabAppliInfo!=null)&&(LabAppliInfo.size()>0)?LabAppliInfo.get(0).getEmail():"",
		    
					    				
			(LabAppliInfo!=null)&&(LabAppliInfo.size()>1)?LabAppliInfo.get(1).getName():"",
			(LabAppliInfo!=null)&&(LabAppliInfo.size()>1)?LabAppliInfo.get(1).getEmail():"",
			
								
			(LabAppliInfo!=null)&&(LabAppliInfo.size()>2)?LabAppliInfo.get(2).getName():"",
			(LabAppliInfo!=null)&&(LabAppliInfo.size()>2)?LabAppliInfo.get(2).getEmail():"",
			
			
			(LabAppliInfo!=null)&&(LabAppliInfo.size()>3)?LabAppliInfo.get(3).getName():"",
			(LabAppliInfo!=null)&&(LabAppliInfo.size()>3)?LabAppliInfo.get(3).getEmail():"",
			

			(LabAppliInfo!=null)&&(LabAppliInfo.size()>4)?LabAppliInfo.get(4).getName():"",
			(LabAppliInfo!=null)&&(LabAppliInfo.size()>4)?LabAppliInfo.get(4).getEmail():"",
					
					
			//other remaining  4
					
				
			Validator.isNotNull(application)&&Validator.isNotNull(application.getAccRequestType())?application.getAccRequestType():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getAuthorizedPersonnelName())?application.getAuthorizedPersonnelName():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getAuthorizedPosition())?application.getAuthorizedPosition():"",
		    Validator.isNotNull(application)&&Validator.isNotNull(application.getAuthorizedPersonnelDate())?dateFormat.format(application.getAuthorizedPersonnelDate()):"",
			

			//signature Detail 1
		   signatureForAuthorizedPersonnel,
		    
		    
		    //company seal 1
		     companySealCertificationBodies,
		     
		     //form 1 complete
		     
		     //form 2 start
		     
            Validator.isNotNull(accMedicalActivity)&&Validator.isNotNull(accMedicalActivity.getActivitiesDescription())?accMedicalActivity.getActivitiesDescription():"",
 			Validator.isNotNull(accMedicalActivity)&&Validator.isNotNull(accMedicalActivity.getShiftWork())?accMedicalActivity.getShiftWork():"",

 					
 					
 			//add more first

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
				
			
			//add more Second
	
	        (medicalDecSecInfo!=null)&&(medicalDecSecInfo.size()>0)?medicalDecSecInfo.get(0).getRequestedPoct():"",
		    (medicalDecSecInfo!=null)&&(medicalDecSecInfo.size()>0)?medicalDecSecInfo.get(0).getLocation():"",
		      		    				
			(medicalDecSecInfo!=null)&&(medicalDecSecInfo.size()>1)?medicalDecSecInfo.get(1).getRequestedPoct():"",
			(medicalDecSecInfo!=null)&&(medicalDecSecInfo.size()>1)?medicalDecSecInfo.get(1).getLocation():"",
							
			(medicalDecSecInfo!=null)&&(medicalDecSecInfo.size()>2)?medicalDecSecInfo.get(2).getRequestedPoct():"",
			(medicalDecSecInfo!=null)&&(medicalDecSecInfo.size()>2)?medicalDecSecInfo.get(2).getLocation():"",
					
			(medicalDecSecInfo!=null)&&(medicalDecSecInfo.size()>3)?medicalDecSecInfo.get(3).getRequestedPoct():"",
			(medicalDecSecInfo!=null)&&(medicalDecSecInfo.size()>3)?medicalDecSecInfo.get(3).getLocation():"",
		
			(medicalDecSecInfo!=null)&&(medicalDecSecInfo.size()>4)?medicalDecSecInfo.get(4).getRequestedPoct():"",
			(medicalDecSecInfo!=null)&&(medicalDecSecInfo.size()>4)?medicalDecSecInfo.get(4).getLocation():"",
				

 					
 			
 		    //form 2 complete
 					
 			//form 3 start

        Validator.isNotNull(accMediLabOrganization)&&Validator.isNotNull(accMediLabOrganization.getLaboratoryLegalEntity())?accMediLabOrganization.getLaboratoryLegalEntity():"",
		Validator.isNotNull(accMediLabOrganization)&&Validator.isNotNull(accMediLabOrganization.getLegalStatus())?accMediLabOrganization.getLegalStatus():"",		
		Validator.isNotNull(accMediLabOrganization)&&Validator.isNotNull(accMediLabOrganization.getLaboratoryPartOfOrg())?accMediLabOrganization.getLaboratoryPartOfOrg():"",
				
 					
 					
 		//add more first 5
 					
        (laboratoryPartOfOrg!=null)&&(laboratoryPartOfOrg.size()>0)?laboratoryPartOfOrg.get(0).getLaboratoryPartOfOrgName():"",
	    (laboratoryPartOfOrg!=null)&&(laboratoryPartOfOrg.size()>0)?laboratoryPartOfOrg.get(0).getLaboratoryPartOfOrgPosition():"",
	      		    				
		(laboratoryPartOfOrg!=null)&&(laboratoryPartOfOrg.size()>1)?laboratoryPartOfOrg.get(1).getLaboratoryPartOfOrgName():"",
		(laboratoryPartOfOrg!=null)&&(laboratoryPartOfOrg.size()>1)?laboratoryPartOfOrg.get(1).getLaboratoryPartOfOrgPosition():"",
						
		(laboratoryPartOfOrg!=null)&&(laboratoryPartOfOrg.size()>2)?laboratoryPartOfOrg.get(2).getLaboratoryPartOfOrgName():"",
		(laboratoryPartOfOrg!=null)&&(laboratoryPartOfOrg.size()>2)?laboratoryPartOfOrg.get(2).getLaboratoryPartOfOrgPosition():"",
				
		(laboratoryPartOfOrg!=null)&&(laboratoryPartOfOrg.size()>3)?laboratoryPartOfOrg.get(3).getLaboratoryPartOfOrgName():"",
		(laboratoryPartOfOrg!=null)&&(laboratoryPartOfOrg.size()>3)?laboratoryPartOfOrg.get(3).getLaboratoryPartOfOrgPosition():"",
	
		(laboratoryPartOfOrg!=null)&&(laboratoryPartOfOrg.size()>4)?laboratoryPartOfOrg.get(4).getLaboratoryPartOfOrgName():"",
		(laboratoryPartOfOrg!=null)&&(laboratoryPartOfOrg.size()>4)?laboratoryPartOfOrg.get(4).getLaboratoryPartOfOrgPosition():"",

 			
	   //other 1
        Validator.isNotNull(accMediLabOrganization)&&Validator.isNotNull(accMediLabOrganization.getNameOfAnalysts())?accMediLabOrganization.getNameOfAnalysts():"",	
        
		//add more second	5

        (organLabFirstInfo!=null)&&(organLabFirstInfo.size()>0)?organLabFirstInfo.get(0).getNameOfStaff():"",
	    (organLabFirstInfo!=null)&&(organLabFirstInfo.size()>0)?organLabFirstInfo.get(0).getJobTitle():"",
	    (organLabFirstInfo!=null)&&(organLabFirstInfo.size()>0)?organLabFirstInfo.get(0).getMajorResponsibilities():"",
	      		    				
		(organLabFirstInfo!=null)&&(organLabFirstInfo.size()>1)?organLabFirstInfo.get(1).getNameOfStaff():"",
		(organLabFirstInfo!=null)&&(organLabFirstInfo.size()>1)?organLabFirstInfo.get(1).getJobTitle():"",
	    (organLabFirstInfo!=null)&&(organLabFirstInfo.size()>1)?organLabFirstInfo.get(1).getMajorResponsibilities():"",		
			    		
		(organLabFirstInfo!=null)&&(organLabFirstInfo.size()>2)?organLabFirstInfo.get(2).getNameOfStaff():"",
		(organLabFirstInfo!=null)&&(organLabFirstInfo.size()>2)?organLabFirstInfo.get(2).getJobTitle():"",
	    (organLabFirstInfo!=null)&&(organLabFirstInfo.size()>2)?organLabFirstInfo.get(2).getMajorResponsibilities():"",
				
		(organLabFirstInfo!=null)&&(organLabFirstInfo.size()>3)?organLabFirstInfo.get(3).getNameOfStaff():"",
		(organLabFirstInfo!=null)&&(organLabFirstInfo.size()>3)?organLabFirstInfo.get(3).getJobTitle():"",
		(organLabFirstInfo!=null)&&(organLabFirstInfo.size()>3)?organLabFirstInfo.get(3).getMajorResponsibilities():"",
	
		(organLabFirstInfo!=null)&&(organLabFirstInfo.size()>4)?organLabFirstInfo.get(4).getNameOfStaff():"",
		(organLabFirstInfo!=null)&&(organLabFirstInfo.size()>4)?organLabFirstInfo.get(4).getJobTitle():"",
		(organLabFirstInfo!=null)&&(organLabFirstInfo.size()>4)?organLabFirstInfo.get(4).getMajorResponsibilities():"",
        		
				
		//add more third 5
				
				
        (organLabSecInfo!=null)&&(organLabSecInfo.size()>0)?organLabSecInfo.get(0).getProduct():"",
	    (organLabSecInfo!=null)&&(organLabSecInfo.size()>0)?organLabSecInfo.get(0).getExamination():"",
	    (organLabSecInfo!=null)&&(organLabSecInfo.size()>0)?organLabSecInfo.get(0).getMethods():"",
	    (organLabSecInfo!=null)&&(organLabSecInfo.size()>0)?organLabSecInfo.get(0).getEquipment():"",
	    (organLabSecInfo!=null)&&(organLabSecInfo.size()>0)?organLabSecInfo.get(0).getReferenceRange():"",
	    (organLabSecInfo!=null)&&(organLabSecInfo.size()>0)?organLabSecInfo.get(0).getMeasurementUncertainty():"",
	    			    				  
				    				
		(organLabSecInfo!=null)&&(organLabSecInfo.size()>1)?organLabSecInfo.get(1).getProduct():"",
		(organLabSecInfo!=null)&&(organLabSecInfo.size()>1)?organLabSecInfo.get(1).getExamination():"",
		(organLabSecInfo!=null)&&(organLabSecInfo.size()>1)?organLabSecInfo.get(1).getMethods():"",
	    (organLabSecInfo!=null)&&(organLabSecInfo.size()>1)?organLabSecInfo.get(1).getEquipment():"",
	    (organLabSecInfo!=null)&&(organLabSecInfo.size()>1)?organLabSecInfo.get(1).getReferenceRange():"",
	    (organLabSecInfo!=null)&&(organLabSecInfo.size()>1)?organLabSecInfo.get(1).getMeasurementUncertainty():"",
	    								
		
							
		(organLabSecInfo!=null)&&(organLabSecInfo.size()>2)?organLabSecInfo.get(2).getProduct():"",
		(organLabSecInfo!=null)&&(organLabSecInfo.size()>2)?organLabSecInfo.get(2).getExamination():"",
		(organLabSecInfo!=null)&&(organLabSecInfo.size()>2)?organLabSecInfo.get(2).getMethods():"",
	    (organLabSecInfo!=null)&&(organLabSecInfo.size()>2)?organLabSecInfo.get(2).getEquipment():"",
	    (organLabSecInfo!=null)&&(organLabSecInfo.size()>2)?organLabSecInfo.get(2).getReferenceRange():"",
	    (organLabSecInfo!=null)&&(organLabSecInfo.size()>2)?organLabSecInfo.get(2).getMeasurementUncertainty():"",
	    								
		
		
		(organLabSecInfo!=null)&&(organLabSecInfo.size()>3)?organLabSecInfo.get(3).getProduct():"",
		(organLabSecInfo!=null)&&(organLabSecInfo.size()>3)?organLabSecInfo.get(3).getExamination():"",
		(organLabSecInfo!=null)&&(organLabSecInfo.size()>3)?organLabSecInfo.get(3).getMethods():"",
	    (organLabSecInfo!=null)&&(organLabSecInfo.size()>3)?organLabSecInfo.get(3).getEquipment():"",
	    (organLabSecInfo!=null)&&(organLabSecInfo.size()>3)?organLabSecInfo.get(3).getReferenceRange():"",
	    (organLabSecInfo!=null)&&(organLabSecInfo.size()>3)?organLabSecInfo.get(3).getMeasurementUncertainty():"",
	    								
			
		(organLabSecInfo!=null)&&(organLabSecInfo.size()>4)?organLabSecInfo.get(4).getProduct():"",
		(organLabSecInfo!=null)&&(organLabSecInfo.size()>4)?organLabSecInfo.get(4).getExamination():"",
		(organLabSecInfo!=null)&&(organLabSecInfo.size()>4)?organLabSecInfo.get(4).getMethods():"",
		(organLabSecInfo!=null)&&(organLabSecInfo.size()>4)?organLabSecInfo.get(4).getEquipment():"",
		(organLabSecInfo!=null)&&(organLabSecInfo.size()>4)?organLabSecInfo.get(4).getReferenceRange():"",
		(organLabSecInfo!=null)&&(organLabSecInfo.size()>4)?organLabSecInfo.get(4).getMeasurementUncertainty():"",
				
		//other
        
		Validator.isNotNull(accMediLabOrganization)&&Validator.isNotNull(accMediLabOrganization.getMajorIncomeSource())?accMediLabOrganization.getMajorIncomeSource():"",
		Validator.isNotNull(accMediLabOrganization)&&Validator.isNotNull(accMediLabOrganization.getLaboratoryClients())?accMediLabOrganization.getLaboratoryClients():"",
				
	        			
		   
		//form 3 complete
			
		//form 4 start
		    		
		  //first add more 5
            (physicalFirstInfo!=null)&&(physicalFirstInfo.size()>0)?physicalFirstInfo.get(0).getInventoryNum():"",
		    (physicalFirstInfo!=null)&&(physicalFirstInfo.size()>0)?physicalFirstInfo.get(0).getItem():"",
		    (physicalFirstInfo!=null)&&(physicalFirstInfo.size()>0)?physicalFirstInfo.get(0).getManufacturer():"",
		    (physicalFirstInfo!=null)&&(physicalFirstInfo.size()>0)?physicalFirstInfo.get(0).getModelNum():"",
		    (physicalFirstInfo!=null)&&(physicalFirstInfo.size()>0)?physicalFirstInfo.get(0).getCalibrationInterval():"",
		    (physicalFirstInfo!=null)&&(physicalFirstInfo.size()>0)?physicalFirstInfo.get(0).getCalibratedBy():"",
		    			    				  
					    				
			(physicalFirstInfo!=null)&&(physicalFirstInfo.size()>1)?physicalFirstInfo.get(1).getInventoryNum():"",
			(physicalFirstInfo!=null)&&(physicalFirstInfo.size()>1)?physicalFirstInfo.get(1).getItem():"",
			(physicalFirstInfo!=null)&&(physicalFirstInfo.size()>1)?physicalFirstInfo.get(1).getManufacturer():"",
		    (physicalFirstInfo!=null)&&(physicalFirstInfo.size()>1)?physicalFirstInfo.get(1).getModelNum():"",
		    (physicalFirstInfo!=null)&&(physicalFirstInfo.size()>1)?physicalFirstInfo.get(1).getCalibrationInterval():"",
		    (physicalFirstInfo!=null)&&(physicalFirstInfo.size()>1)?physicalFirstInfo.get(1).getCalibratedBy():"",
		    								
			
								
			(physicalFirstInfo!=null)&&(physicalFirstInfo.size()>2)?physicalFirstInfo.get(2).getInventoryNum():"",
			(physicalFirstInfo!=null)&&(physicalFirstInfo.size()>2)?physicalFirstInfo.get(2).getItem():"",
			(physicalFirstInfo!=null)&&(physicalFirstInfo.size()>2)?physicalFirstInfo.get(2).getManufacturer():"",
		    (physicalFirstInfo!=null)&&(physicalFirstInfo.size()>2)?physicalFirstInfo.get(2).getModelNum():"",
		    (physicalFirstInfo!=null)&&(physicalFirstInfo.size()>2)?physicalFirstInfo.get(2).getCalibrationInterval():"",
		    (physicalFirstInfo!=null)&&(physicalFirstInfo.size()>2)?physicalFirstInfo.get(2).getCalibratedBy():"",
		    								
			
			
			(physicalFirstInfo!=null)&&(physicalFirstInfo.size()>3)?physicalFirstInfo.get(3).getInventoryNum():"",
			(physicalFirstInfo!=null)&&(physicalFirstInfo.size()>3)?physicalFirstInfo.get(3).getItem():"",
			(physicalFirstInfo!=null)&&(physicalFirstInfo.size()>3)?physicalFirstInfo.get(3).getManufacturer():"",
		    (physicalFirstInfo!=null)&&(physicalFirstInfo.size()>3)?physicalFirstInfo.get(3).getModelNum():"",
		    (physicalFirstInfo!=null)&&(physicalFirstInfo.size()>3)?physicalFirstInfo.get(3).getCalibrationInterval():"",
		    (physicalFirstInfo!=null)&&(physicalFirstInfo.size()>3)?physicalFirstInfo.get(3).getCalibratedBy():"",
		    								
				
			(physicalFirstInfo!=null)&&(physicalFirstInfo.size()>4)?physicalFirstInfo.get(4).getInventoryNum():"",
			(physicalFirstInfo!=null)&&(physicalFirstInfo.size()>4)?physicalFirstInfo.get(4).getItem():"",
			(physicalFirstInfo!=null)&&(physicalFirstInfo.size()>4)?physicalFirstInfo.get(4).getManufacturer():"",
			(physicalFirstInfo!=null)&&(physicalFirstInfo.size()>4)?physicalFirstInfo.get(4).getModelNum():"",
			(physicalFirstInfo!=null)&&(physicalFirstInfo.size()>4)?physicalFirstInfo.get(4).getCalibrationInterval():"",
			(physicalFirstInfo!=null)&&(physicalFirstInfo.size()>4)?physicalFirstInfo.get(4).getCalibratedBy():"",
					

		
			//Second Add more   5
 					
 					 
            (physicalSecondInfo!=null)&&(physicalSecondInfo.size()>0)?physicalSecondInfo.get(0).getNumber():"",
		    (physicalSecondInfo!=null)&&(physicalSecondInfo.size()>0)?physicalSecondInfo.get(0).getLocation():"",
		    (physicalSecondInfo!=null)&&(physicalSecondInfo.size()>0)?physicalSecondInfo.get(0).getActivitiesPerformed():"",
		    (physicalSecondInfo!=null)&&(physicalSecondInfo.size()>0)?physicalSecondInfo.get(0).getContactDetails():"",
		   			    				  
					    				
			(physicalSecondInfo!=null)&&(physicalSecondInfo.size()>1)?physicalSecondInfo.get(1).getNumber():"",
			(physicalSecondInfo!=null)&&(physicalSecondInfo.size()>1)?physicalSecondInfo.get(1).getLocation():"",
			(physicalSecondInfo!=null)&&(physicalSecondInfo.size()>1)?physicalSecondInfo.get(1).getActivitiesPerformed():"",
		    (physicalSecondInfo!=null)&&(physicalSecondInfo.size()>1)?physicalSecondInfo.get(1).getContactDetails():"",
		   								
			
								
			(physicalSecondInfo!=null)&&(physicalSecondInfo.size()>2)?physicalSecondInfo.get(2).getNumber():"",
			(physicalSecondInfo!=null)&&(physicalSecondInfo.size()>2)?physicalSecondInfo.get(2).getLocation():"",
			(physicalSecondInfo!=null)&&(physicalSecondInfo.size()>2)?physicalSecondInfo.get(2).getActivitiesPerformed():"",
		    (physicalSecondInfo!=null)&&(physicalSecondInfo.size()>2)?physicalSecondInfo.get(2).getContactDetails():"",
		   
		    								
			
			
			(physicalSecondInfo!=null)&&(physicalSecondInfo.size()>3)?physicalSecondInfo.get(3).getNumber():"",
			(physicalSecondInfo!=null)&&(physicalSecondInfo.size()>3)?physicalSecondInfo.get(3).getLocation():"",
			(physicalSecondInfo!=null)&&(physicalSecondInfo.size()>3)?physicalSecondInfo.get(3).getActivitiesPerformed():"",
		    (physicalSecondInfo!=null)&&(physicalSecondInfo.size()>3)?physicalSecondInfo.get(3).getContactDetails():"",
		    								
				
			(physicalSecondInfo!=null)&&(physicalSecondInfo.size()>4)?physicalSecondInfo.get(4).getNumber():"",
			(physicalSecondInfo!=null)&&(physicalSecondInfo.size()>4)?physicalSecondInfo.get(4).getLocation():"",
			(physicalSecondInfo!=null)&&(physicalSecondInfo.size()>4)?physicalSecondInfo.get(4).getActivitiesPerformed():"",
			(physicalSecondInfo!=null)&&(physicalSecondInfo.size()>4)?physicalSecondInfo.get(4).getContactDetails():"",
				
       			
		   //OTHER 6
		
	        Validator.isNotNull(accMediPhysical)&&Validator.isNotNull(accMediPhysical.getLaboratoryfacilities())?accMediPhysical.getLaboratoryfacilities():"",
			Validator.isNotNull(accMediPhysical)&&Validator.isNotNull(accMediPhysical.getSafetyFeatures())?accMediPhysical.getSafetyFeatures():"",
			Validator.isNotNull(accMediPhysical)&&Validator.isNotNull(accMediPhysical.getSpecialEnvironment())?accMediPhysical.getSpecialEnvironment():"",
			Validator.isNotNull(accMediPhysical)&&Validator.isNotNull(accMediPhysical.getMonitoringActivities())?accMediPhysical.getMonitoringActivities():"",
			Validator.isNotNull(accMediPhysical)&&Validator.isNotNull(accMediPhysical.getSecurityArrangements())?accMediPhysical.getSecurityArrangements():"",
			Validator.isNotNull(accMediPhysical)&&Validator.isNotNull(accMediPhysical.getLaboratoryDocumented())?accMediPhysical.getLaboratoryDocumented():"",
				
			
 
        //form 4 complete
	    		 
	     //form 5 start
	    		 
      
        //Management System Requirements     16
        Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getManagementEstablished())?accMediLabManagement.getManagementEstablished():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getQMRefManagement())?accMediLabManagement.getQMRefManagement():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getPersonAware())?accMediLabManagement.getPersonAware():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getQMRefPerson())?accMediLabManagement.getQMRefPerson():"",
        Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getPoliciesAcknowledged())?accMediLabManagement.getPoliciesAcknowledged():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getQMRefPolicies())?accMediLabManagement.getQMRefPolicies():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getControlledDocument())?accMediLabManagement.getControlledDocument():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getQMRefControlDoc())?accMediLabManagement.getQMRefControlDoc():"",
        Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLaboratoryEstablished())?accMediLabManagement.getLaboratoryEstablished():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getQMReflabEstab())?accMediLabManagement.getQMReflabEstab():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getIdentifiedRisks())?accMediLabManagement.getIdentifiedRisks():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getQMRefRisks())?accMediLabManagement.getQMRefRisks():"",
        Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getHavePersonnel())?accMediLabManagement.getHavePersonnel():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getQMRefPersonnel())?accMediLabManagement.getQMRefPersonnel():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getAuthorizePersonnel())?accMediLabManagement.getAuthorizePersonnel():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getQMRefAuthorize())?accMediLabManagement.getQMRefAuthorize():"",
					
		//Management Requirements   24
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabControlDocsFulfilment())?accMediLabManagement.getLabControlDocsFulfilment():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getOtherRefFulfil())?accMediLabManagement.getOtherRefFulfil():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLegibleRecordsFulfil())?accMediLabManagement.getLegibleRecordsFulfil():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getOtherRefLegibleRec())?accMediLabManagement.getOtherRefLegibleRec():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getProceduresInPlace())?accMediLabManagement.getProceduresInPlace():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getOtherRefProcedure())?accMediLabManagement.getOtherRefProcedure():"",
        Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getCommunicatedRequirement())?accMediLabManagement.getCommunicatedRequirement():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getOtherRefRequirement())?accMediLabManagement.getOtherRefRequirement():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getProcedureForSelection())?accMediLabManagement.getProcedureForSelection():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getOtherRefSelection())?accMediLabManagement.getOtherRefSelection():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getArrangementInPlace())?accMediLabManagement.getArrangementInPlace():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getOtherRefArrange())?accMediLabManagement.getOtherRefArrange():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getProcessInPlace())?accMediLabManagement.getProcessInPlace():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getOtherRefProcess())?accMediLabManagement.getOtherRefProcess():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getLabOperateProgramme())?accMediLabManagement.getLabOperateProgramme():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getOtherRefLabOperate())?accMediLabManagement.getOtherRefLabOperate():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getIdentifyOpportunities())?accMediLabManagement.getIdentifyOpportunities():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getOtherRefOpportunity())?accMediLabManagement.getOtherRefOpportunity():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getDemonstrateFulfilment())?accMediLabManagement.getDemonstrateFulfilment():"",
        Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getOtherRefDemonstrate())?accMediLabManagement.getOtherRefDemonstrate():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getEnsureLabPlan())?accMediLabManagement.getEnsureLabPlan():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getOtherRefEnsurePlan())?accMediLabManagement.getOtherRefEnsurePlan():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getPlannedManageReview())?accMediLabManagement.getPlannedManageReview():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getOtherRefPlanned())?accMediLabManagement.getOtherRefPlanned():"",
		
	   	//Management System - Resource and Process Requirements 36
		
		
		
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getAvailablePersonnel())?accMediLabManagement.getAvailablePersonnel():"",
        Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getManualRefAvailable())?accMediLabManagement.getManualRefAvailable():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getEducationProgramme())?accMediLabManagement.getEducationProgramme():"",
	    Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getManualRefEducation())?accMediLabManagement.getManualRefEducation():"",
	    Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getEnsureAccomodation())?accMediLabManagement.getEnsureAccomodation():"",
	    Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getManualRefAccom())?accMediLabManagement.getManualRefAccom():"",
        Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getProcessForSelection())?accMediLabManagement.getProcessForSelection():"",	
        Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getManualRefSelection())?accMediLabManagement.getManualRefSelection():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getVerifyReagents())?accMediLabManagement.getVerifyReagents():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getManualRefReagents())?accMediLabManagement.getManualRefReagents():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getDocProcedure())?accMediLabManagement.getDocProcedure():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getManualRefDocProce())?accMediLabManagement.getManualRefDocProce():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getUseExamMethods())?accMediLabManagement.getUseExamMethods():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getManualRefExam())?accMediLabManagement.getManualRefExam():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getMonitoringValidity())?accMediLabManagement.getMonitoringValidity():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getManualRefValidity())?accMediLabManagement.getManualRefValidity():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getValidateExam())?accMediLabManagement.getValidateExam():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getManualRefValidateExam())?accMediLabManagement.getManualRefValidateExam():"",
	    Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getUncertainityReview())?accMediLabManagement.getUncertainityReview():"",
        Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getManualRefUncertainity())?accMediLabManagement.getManualRefUncertainity():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getPreventResRelease())?accMediLabManagement.getPreventResRelease():"",
        Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getManualRefPrevent())?accMediLabManagement.getManualRefPrevent():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getEquipmentMaintenance())?accMediLabManagement.getEquipmentMaintenance():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getManualRefMaintenance())?accMediLabManagement.getManualRefMaintenance():"",	
        Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getEquipCalibration())?accMediLabManagement.getEquipCalibration():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getManualRefCalibrat())?accMediLabManagement.getManualRefCalibrat():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getProficencyTesting())?accMediLabManagement.getProficencyTesting():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getManualRefProfiTest())?accMediLabManagement.getManualRefProfiTest():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getPostExamReliabilty())?accMediLabManagement.getPostExamReliabilty():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getManualRefPostExam())?accMediLabManagement.getManualRefPostExam():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getReportedAccurately())?accMediLabManagement.getReportedAccurately():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getManualRefReported())?accMediLabManagement.getManualRefReported():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getResponsiblitySpecified())?accMediLabManagement.getResponsiblitySpecified():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getManualRefSpecified())?accMediLabManagement.getManualRefSpecified():"",
		Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getEnsureAuthorities())?accMediLabManagement.getEnsureAuthorities():"",
	    Validator.isNotNull(accMediLabManagement)&&Validator.isNotNull(accMediLabManagement.getManualRefAuthorities())?accMediLabManagement.getManualRefAuthorities():"",
	    		
	  
		//form 6 end
		
		//form 7 start
				

		Validator.isNotNull(otherReq)&&Validator.isNotNull(otherReq.getPaymentMethod())?otherReq.getPaymentMethod():"",
		Validator.isNotNull(otherReq)&&Validator.isNotNull(otherReq.getRepresentativeName())?otherReq.getRepresentativeName():"",
		Validator.isNotNull(otherReq)&&Validator.isNotNull(otherReq.getRepresentativePos())?otherReq.getRepresentativePos():"",
		Validator.isNotNull(otherReq)&&Validator.isNotNull(otherReq.getSignDate())?dateFormat.format(otherReq.getSignDate()):"",
			
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
		
		
		
		
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			try {
				fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
				fileName = fileEntry.getFileName();
				title=fileEntry.getTitle();
			} catch (Exception e) {}
			if(title.equals("Copy of approved plans (if premises are owned by the laboratory) or lease/rental contract for the laboratory")) {
				proofOfLegal = fileName;
			}else if (title.equals("Copy of licence to operate the laboratory")) {
				genericCertificate = fileName;
			}else if(title.equals("Layout of laboratory indicating equipment placement for all locations where laboratory activities related to the requested scope of accreditation are performed")) {
				authorizedPolicy=fileName;
			}else if(title.equals("Copy of safety manual")) {
				policyProcedure=fileName;
			}else if(title.equals("Copies of certificates of the head and deputy head of the facility as well as any other person(s) with signatory authority")) {
				policyPotential=fileName;
			}else if(title.equals("Statement of quality policy and objective")) {
				authorizedCopy=fileName;
			}else if(title.equals("Management system policies “Quality manual”")) {
				evidenceQualification=fileName;
			}else if(title.equals("Management system procedures manual (management and technical requirements procedures)")) {
				certificateOfQualification=fileName;
			}
		}
		
		pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
			"[$ApprovedPlans$]","[$operateLab$]","[$equipmentPlaceDoc$]","[$manualSafety$]","[$facilityWell$]","[$deputyCopies$]","[$QualitySystem$]","[$ManagementSystem$]",
			
			},
			new String[] {
					proofOfLegal, genericCertificate,authorizedPolicy,policyProcedure,policyPotential,authorizedCopy,evidenceQualification,certificateOfQualification,
					
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




