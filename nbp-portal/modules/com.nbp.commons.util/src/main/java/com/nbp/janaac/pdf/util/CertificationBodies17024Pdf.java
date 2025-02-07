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
import com.nbp.janaac.application.form.service.model.AccCerBodyGeneral;
import com.nbp.janaac.application.form.service.model.AccCerBodyInfo;
import com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo;
import com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel;
import com.nbp.janaac.application.form.service.model.AccCerBodyProdScope;
import com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq;
import com.nbp.janaac.application.form.service.model.AccMediLabApplicationInfo;
import com.nbp.janaac.application.form.service.model.AddCerApplicationInfo;
import com.nbp.janaac.application.form.service.model.AddCerPersonnelFirst;
import com.nbp.janaac.application.form.service.model.AddCerPersonnelSecond;
import com.nbp.janaac.application.form.service.model.AddCerScopeServiceThird;
import com.nbp.janaac.application.form.service.model.AddOutsourcedActivities;
import com.nbp.janaac.application.form.service.model.JanaacApplication;
import com.nbp.janaac.application.form.service.model.JanaacApplicationPayment;
import com.nbp.janaac.application.form.service.service.AccCerBodyGeneralLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccCerBodyInfoLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccCerBodyMngReqTwoLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccCerBodyPersonnelLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccCerBodyProdScopeLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccInsBodiesOtherReqLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccMediLabApplicationInfoLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddCerApplicationInfoLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddCerPersonnelFirstLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddCerPersonnelSecondLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddCerScopeServiceThirdLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddOutsourcedActivitiesLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.JanaacApplicationLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.JanaacApplicationPaymentLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class CertificationBodies17024Pdf {


	public static String replaceSignatureAuthorizedJanaac(long janaacApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Accre Cert 17024 Signature of Authorized");
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
				"Accre Cert 17024 Company Stamp");
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
				"cert 17024 second cat rep sign");
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
	


	
public static String janaacCertificationBodiesThirdCatPdf(long janaacApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
	
	
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		
		JanaacApplication janaacApplication=null;
		AccMediLabApplicationInfo mediLabApplicationInfo = null;
		List<AddCerApplicationInfo> creAppliInfo = null;
		AccCerBodyGeneral cerBodyGeneral=null;
		List<AddCerScopeServiceThird> cerScopeScopeThird = null;
		AccCerBodyProdScope cerBodyProdScope=null;
		AccCerBodyPersonnel cerBodyPersonnel=null;
		List<AddCerPersonnelFirst> cerPersonnelFirst = null;
		List<AddCerPersonnelSecond> cerPersonnelSecond = null;
		List<AddOutsourcedActivities> outsourcedActivities=null;
		AccCerBodyInfo CerBodyInfo=null;
		AccCerBodyMngReqTwo accBodyManage=null;
		AccInsBodiesOtherReq accInsBodies = null;
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
			creAppliInfo= AddCerApplicationInfoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);           
		}catch (Exception e) {
		}
		try {
			cerBodyGeneral= AccCerBodyGeneralLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			cerScopeScopeThird= AddCerScopeServiceThirdLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			cerBodyProdScope= AccCerBodyProdScopeLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		
		try {
			cerBodyPersonnel = AccCerBodyPersonnelLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			cerPersonnelFirst =AddCerPersonnelFirstLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			cerPersonnelSecond =AddCerPersonnelSecondLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			outsourcedActivities =AddOutsourcedActivitiesLocalServiceUtil.getJanaac_OutSrc_Id(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			CerBodyInfo =AccCerBodyInfoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			accBodyManage =AccCerBodyMngReqTwoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			accInsBodies =AccInsBodiesOtherReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
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
			  signatureForAuthorizedPersonnel =replaceSignatureAuthorizedJanaac(janaacApplication.getJanaacApplicationId(), "Accre Cert 17024 Signature of Authorized", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}
		  
		  try { 
			  signaturecompanySeal =replaceCompanySealJanaac(janaacApplication.getJanaacApplicationId(), "Accre Cert 17024 Company Stamp", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}
		  
		  try { 
			  signaturerepresentative = replacerepresentativeSignatureJanaac(janaacApplication.getJanaacApplicationId(),"" , themeDisplay.getScopeGroupId(),
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
							"accreditation-of-certification-bodies-third");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = 
					StringUtil.replace(pdfTemplate, new String[] {
					
					
			//Application Information 2
					
			"[$InformationLegalName$]","[$AddressLegalInformation$]",
			
			//Contact Information 7
			
			"[$TeleLegalInformation$]","[$FaxLegalInformation$]","[$webLegalInformation$]","[$certificationLegalInformation$]","[$InformationLegalStandard$]","[$CertificationLegal$]","[$emailLegalInformation$]",
			
			
			//Name & Email Address of Personnel Responsible for Technical Management 15
			"[$NameLegalSt1$]","[$EMailLegalSt1$]",
			"[$NameLegalSt2$]","[$EMailLegalSt2$]",
			"[$NameLegalSt3$]","[$EMailLegalSt3$]",
			"[$NameLegalSt4$]","[$EMailLegalSt4$]",
			"[$NameLegalSt5$]","[$EMailLegalSt5$]",
			
			"[$ConNamepLegalSt$]","[$ConEmailPerLegalSt$]","[$FinancialManLegalNameSt$]","[$FinancialManLegalEmailSt$]","[$RequesrtLegalStandard$]",
			
			//We acknowledge the fact that the application fee (paid for the initial assessment) is non-refundable 3
			
			"[$NameAuthorizedLegalSt$]","[$PositionLegalAckSt$]","[$LegaldateAckSt$]",
			
			//first signature: 1
			"[$SignLegalAuthorizedSt$]",
			
			//second Signature 1
			"[$CompanyLegalSealSignSt$]",
			
			//General 3
			
			"[$CertificationEntityDe$]","[$ownershipCorporateDe$]","[$OutlineMajorSourcesFun$]",
			
			//Scope, Services, Clients and Interested Parties Registered Client Organizations 40
			
			"[$OrganizationScopeNm1$]","[$OrganizationAddClient1$]","[$SchemeParties1$]","[$CurrentStatus1$]","[$DateStatus1$]","[$examinationTime1$]",
			"[$OrganizationScopeNm2$]","[$OrganizationAddClient2$]","[$SchemeParties2$]","[$CurrentStatus2$]","[$DateStatus2$]","[$examinationTime2$]",
			"[$OrganizationScopeNm3$]","[$OrganizationAddClient3$]","[$SchemeParties3$]","[$CurrentStatus3$]","[$DateStatus3$]","[$examinationTime3$]",
			"[$OrganizationScopeNm4$]","[$OrganizationAddClient4$]","[$SchemeParties4$]","[$CurrentStatus4$]","[$DateStatus4$]","[$examinationTime4$]",
			"[$OrganizationScopeNm5$]","[$OrganizationAddClient5$]","[$SchemeParties5$]","[$CurrentStatus5$]","[$DateStatus5$]","[$examinationTime5$]",
			
			"[$clientsStaffspecific$]","[$Certificatspecific$]","[$Brieflydescribe$]","[$RelationshipsPerform$]","[$DescriptionServices$]","[$consultancyProvided$]","[$organizationPreviously$]",
			"[$responsibleRecentMostRecent$]","[$expiryDate$]","[$ScopeBodyIs$]",
			
			//Organization, Personnel and Resources 3
			"[$staffInternal$]","[$auditorsNumber$]","[$ResourcesNumContracted$]",
			
			//Add More Staff 20
			
			"[$StaffDetails1$]","[$JobDetails1$]","[$ResponsibilitiesDetails1$]","[$SpecificDetails1$]",
			"[$StaffDetails2$]","[$JobDetails2$]","[$ResponsibilitiesDetails2$]","[$SpecificDetails2$]",
			"[$StaffDetails3$]","[$JobDetails3$]","[$ResponsibilitiesDetails3$]","[$SpecificDetails3$]",
			"[$StaffDetails4$]","[$JobDetails4$]","[$ResponsibilitiesDetails4$]","[$SpecificDetails4$]",
			"[$StaffDetails5$]","[$JobDetails5$]","[$ResponsibilitiesDetails5$]","[$SpecificDetails5$]",
		
			//Add More Supported by documentation in Section A, II, 20:
			
			"[$ActivitiesNameLi1$]","[$ActivitiesRole1$]","[$ActivitiesCertication1$]","[$ActivitiesArea1$]",
			"[$ActivitiesNameLi2$]","[$ActivitiesRole2$]","[$ActivitiesCertication2$]","[$ActivitiesArea2$]",
			"[$ActivitiesNameLi3$]","[$ActivitiesRole3$]","[$ActivitiesCertication3$]","[$ActivitiesArea3$]",
			"[$ActivitiesNameLi4$]","[$ActivitiesRole4$]","[$ActivitiesCertication4$]","[$ActivitiesArea4$]",
			"[$ActivitiesNameLi5$]","[$ActivitiesRole5$]","[$ActivitiesCertication5$]","[$ActivitiesArea5$]",
			
			//normal checkbox 17
			
			"[$outsourceRelated$]",
			
			"[$OutsourcedSupplier1$]","[$ServiceProvider1$]","[$LocationAddr1$]",
			"[$OutsourcedSupplier2$]","[$ServiceProvider2$]","[$LocationAddr2$]",
			"[$OutsourcedSupplier3$]","[$ServiceProvider3$]","[$LocationAddr3$]",
			"[$OutsourcedSupplier4$]","[$ServiceProvider4$]","[$LocationAddr4$]",
			"[$OutsourcedSupplier5$]","[$ServiceProvider5$]","[$LocationAddr5$]",
			
			"[$UnauthorizedAccess$]",
			
			//Information 1
			
			"[$OrganizationInfo$]",
			
			
			
			//Management System Requirements:1
			"[$IndicateManagementOption$]",
			
			//Has your organization established documentation for the following requirements 8
			
			"[$AgreementReq$]","[$requirementsQualityM$]",
			
			"[$RiskRequirements$]","[$requirementsOtherRi$]",
			
			"[$ConfidentialityRequirements$]","[$ConfidentQualityReq$]",
			
			"[$SecurityRequire$]","[$SecurityManual$]",
			
			//Publicly available information 12
			
			"[$DescriptionScheme$]","[$descriptionOther$]",
			
			"[$ValidExam$]","[$QualityManualAa$]",
			
			"[$requisitesSch$]","[$requisitesOther$]",
			
			"[$advertisingInfo$]","[$ManagementManualBody$]",

			"[$PoliciesHandling$]","[$handlingOther$]",
			
			"[$complaintsProce$]","[$complaintsDesp$]",
			
			//Structural Requirements 6
			
			"[$showingDuties$]","[$dutiesResponsibilities$]","[$FormalRules$]","[$ReferenceFormal$]",
			"[$safeguarding$]","[$safeguardingImp$]",
			
			//Resource Requirements 8
			"[$competenciesInvolved$]","[$examinersCom$]","[$templateContract$]","[$templatetemplateRe$]",
			"[$outsourcedSam$]","[$examinersOther$]","[$policiesProrecords$]","[$ReferenceManagement$]",
			
			//Process Requirements 20
			
			"[$specifiedStand$]","[$normativeStand$]",
			
			"[$sampleApplication$]","[$ManualRelevant$]",
			
			"[$reviewStand$]","[$reviewQuality$]",

			"[$recertification$]","[$recertificationAssessment$]",
			
			"[$processTemp$]","[$TemplatePro$]",
			
			"[$decisionCer$]","[$ManagementManual$]",
			
			"[$templateCertification$]","[$documentationSamm$]",
			
			"[$logosMarks$]","[$marksLo$]",

			"[$SuspensionMn$]","[$ReleSuspension$]",
			
			"[$evaluateMake$]","[$complaintsOther$]",
			
			//Management System Requirements Option A 14
			
			"[$systemDocument$]","[$managementDSystem$]",
			
			"[$ControlDoc$]","[$ControlManual$]",
			
			"[$recordsControlTest$]","[$recordsManualRelevant$]",
			
			"[$ManagementReviewMan$]","[$ManagementManualOt$]",
			
			"[$InternalAudi$]","[$QuRelevant$]",

			"[$CorrectiveAction$]","[$ManualQuality$]",
			
			"[$PreventiveAct$]","[$Othermanual$]",
			
			//Management System Requirements Option B - ISO 9001   2
			
			"[$keepingReq$]","[$QualitytOtherType$]",
			
			//Other Requirements 5
			
			"[$nonRefund$]","[$nonPaymentMethod$]","[$RequirementsAppNameOt$]","[$RequirementsPosi$]","[$DateRequirementsOt$]",
			
			//signature third: 1
			"[$PositionSignatureNameOt$]"
			
			},
			new String[] {
		    //Application Information 2
    		Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getNameOfApplicant())?mediLabApplicationInfo.getNameOfApplicant():"",
    		Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getApplicantAddress())?mediLabApplicationInfo.getApplicantAddress():"",
    			
    		//Contact Information 7
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getAppliTelephoneNo())?mediLabApplicationInfo.getAppliTelephoneNo():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getAppliFaxNo())?mediLabApplicationInfo.getAppliFaxNo():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getAppliWebsite())?mediLabApplicationInfo.getAppliWebsite():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getLaboratoryName())?mediLabApplicationInfo.getLaboratoryName():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getLaboratoryAddress())?mediLabApplicationInfo.getLaboratoryAddress():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getNameOfIncharge())?mediLabApplicationInfo.getNameOfIncharge():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getEmailOfIncharge())?mediLabApplicationInfo.getEmailOfIncharge():"",
				
			//Name & Email Address of Person Responsible for Technical Management 10
            (creAppliInfo!=null)&&(creAppliInfo.size()>0)?creAppliInfo.get(0).getName():"",
		    (creAppliInfo!=null)&&(creAppliInfo.size()>0)?creAppliInfo.get(0).getEmail():"",
		    
					    				
			(creAppliInfo!=null)&&(creAppliInfo.size()>1)?creAppliInfo.get(1).getName():"",
			(creAppliInfo!=null)&&(creAppliInfo.size()>1)?creAppliInfo.get(1).getEmail():"",
			
								
			(creAppliInfo!=null)&&(creAppliInfo.size()>2)?creAppliInfo.get(2).getName():"",
			(creAppliInfo!=null)&&(creAppliInfo.size()>2)?creAppliInfo.get(2).getEmail():"",
			
			
			(creAppliInfo!=null)&&(creAppliInfo.size()>3)?creAppliInfo.get(3).getName():"",
			(creAppliInfo!=null)&&(creAppliInfo.size()>3)?creAppliInfo.get(3).getEmail():"",
			

			(creAppliInfo!=null)&&(creAppliInfo.size()>4)?creAppliInfo.get(4).getName():"",
			(creAppliInfo!=null)&&(creAppliInfo.size()>4)?creAppliInfo.get(4).getEmail():"",
					
					
			//other remaining  8
					
					
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getPersonnelQMName())?mediLabApplicationInfo.getPersonnelQMName():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getPersonnelQMEmail())?mediLabApplicationInfo.getPersonnelQMEmail():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getPersonnelFMName())?mediLabApplicationInfo.getPersonnelFMName():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getPersonnelFMEmail())?mediLabApplicationInfo.getPersonnelFMEmail():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getAccRequestType())?mediLabApplicationInfo.getAccRequestType():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getAuthorizedPersonnelName())?mediLabApplicationInfo.getAuthorizedPersonnelName():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getAuthorizedPosition())?mediLabApplicationInfo.getAuthorizedPosition():"",
		    Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getAuthorizedPersonnelDate())?dateFormat.format(mediLabApplicationInfo.getAuthorizedPersonnelDate()):"",

			//Signature of Authorized Personnel 1
		    signatureForAuthorizedPersonnel,
		    
		    
		    //Company Seal/ Company Stamp 1
		    signaturecompanySeal,
		    
		    //The Organization 3
    		Validator.isNotNull(cerBodyGeneral)&&Validator.isNotNull(cerBodyGeneral.getCerLegalEntity())?cerBodyGeneral.getCerLegalEntity():"",
			Validator.isNotNull(cerBodyGeneral)&&Validator.isNotNull(cerBodyGeneral.getCerLegalStatusEntity())?cerBodyGeneral.getCerLegalStatusEntity():"",
			Validator.isNotNull(cerBodyGeneral)&&Validator.isNotNull(cerBodyGeneral.getCerMajorIncomeSources())?cerBodyGeneral.getCerMajorIncomeSources():"",
					
		 
			//Clearly define the scope for which accreditation is being sought (including limits of capability where applicable) 30+10=40
					
					
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>0)?cerScopeScopeThird.get(0).getOrganizationName():"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>0)?cerScopeScopeThird.get(0).getOrganizationAddress():"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>0)?cerScopeScopeThird.get(0).getCertificationScheme():"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>0)?cerScopeScopeThird.get(0).getCurrentStatus():"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>0)?dateFormat.format(cerScopeScopeThird.get(0).getDateFirstGranted()):"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>0)?dateFormat.format(cerScopeScopeThird.get(0).getDateOfNextExamination()):"",
				
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>1)?cerScopeScopeThird.get(1).getOrganizationName():"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>1)?cerScopeScopeThird.get(1).getOrganizationAddress():"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>1)?cerScopeScopeThird.get(1).getCertificationScheme():"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>1)?cerScopeScopeThird.get(1).getCurrentStatus():"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>1)?dateFormat.format(cerScopeScopeThird.get(1).getDateFirstGranted()):"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>1)?dateFormat.format(cerScopeScopeThird.get(1).getDateOfNextExamination()):"",
			
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>2)?cerScopeScopeThird.get(2).getOrganizationName():"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>2)?cerScopeScopeThird.get(2).getOrganizationAddress():"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>2)?cerScopeScopeThird.get(2).getCertificationScheme():"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>2)?cerScopeScopeThird.get(2).getCurrentStatus():"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>2)?dateFormat.format(cerScopeScopeThird.get(2).getDateFirstGranted()):"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>2)?dateFormat.format(cerScopeScopeThird.get(2).getDateOfNextExamination()):"",
					
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>3)?cerScopeScopeThird.get(3).getOrganizationName():"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>3)?cerScopeScopeThird.get(3).getOrganizationAddress():"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>3)?cerScopeScopeThird.get(3).getCertificationScheme():"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>3)?cerScopeScopeThird.get(3).getCurrentStatus():"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>3)?dateFormat.format(cerScopeScopeThird.get(3).getDateFirstGranted()):"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>3)?dateFormat.format(cerScopeScopeThird.get(3).getDateOfNextExamination()):"",
					
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>4)?cerScopeScopeThird.get(4).getOrganizationName():"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>4)?cerScopeScopeThird.get(4).getOrganizationAddress():"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>4)?cerScopeScopeThird.get(4).getCertificationScheme():"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>4)?cerScopeScopeThird.get(4).getCurrentStatus():"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>4)?dateFormat.format(cerScopeScopeThird.get(4).getDateFirstGranted()):"",
			(cerScopeScopeThird!=null)&&(cerScopeScopeThird.size()>4)?dateFormat.format(cerScopeScopeThird.get(4).getDateOfNextExamination()):"",
					
			Validator.isNotNull(cerBodyProdScope)&&Validator.isNotNull(cerBodyProdScope.getCerIntrestedParties())?cerBodyProdScope.getCerIntrestedParties():"",
			Validator.isNotNull(cerBodyProdScope)&&Validator.isNotNull(cerBodyProdScope.getOtherServices())?cerBodyProdScope.getOtherServices():"",
			Validator.isNotNull(cerBodyProdScope)&&Validator.isNotNull(cerBodyProdScope.getOtherServicesDescribe())?cerBodyProdScope.getOtherServicesDescribe():"",
			Validator.isNotNull(cerBodyProdScope)&&Validator.isNotNull(cerBodyProdScope.getEstablishedRelation())?cerBodyProdScope.getEstablishedRelation():"",
			Validator.isNotNull(cerBodyProdScope)&&Validator.isNotNull(cerBodyProdScope.getEstablishedRelDesc())?cerBodyProdScope.getEstablishedRelDesc():"",
			Validator.isNotNull(cerBodyProdScope)&&Validator.isNotNull(cerBodyProdScope.getClientService())?cerBodyProdScope.getClientService():"",
			Validator.isNotNull(cerBodyProdScope)&&Validator.isNotNull(cerBodyProdScope.getOrgAccredited())?cerBodyProdScope.getOrgAccredited():"",
			Validator.isNotNull(cerBodyProdScope)&&Validator.isNotNull(cerBodyProdScope.getResponsibleBody())?cerBodyProdScope.getResponsibleBody():"",
		    Validator.isNotNull(cerBodyProdScope)&&Validator.isNotNull(cerBodyProdScope.getAccExpDate())?dateFormat.format(cerBodyProdScope.getAccExpDate()):"",
			Validator.isNotNull(cerBodyProdScope)&&Validator.isNotNull(cerBodyProdScope.getCertBodyScope())?cerBodyProdScope.getCertBodyScope():"",

					
			
			//Organization, Personnel and Resources 3
			
			Validator.isNotNull(cerBodyPersonnel)&&Validator.isNotNull(cerBodyPersonnel.getInternalStaffSize())?cerBodyPersonnel.getInternalStaffSize():"",
			Validator.isNotNull(cerBodyPersonnel)&&Validator.isNotNull(cerBodyPersonnel.getAuditorsNum())?cerBodyPersonnel.getAuditorsNum():"",
			Validator.isNotNull(cerBodyPersonnel)&&Validator.isNotNull(cerBodyPersonnel.getContractedPerNum())?cerBodyPersonnel.getContractedPerNum():"",
					
					
				
			//Add More Staff 20
			(cerPersonnelFirst!=null)&&(cerPersonnelFirst.size()>0)?cerPersonnelFirst.get(0).getNameOfStaff():"",
			(cerPersonnelFirst!=null)&&(cerPersonnelFirst.size()>0)?cerPersonnelFirst.get(0).getJobTitle():"",
			(cerPersonnelFirst!=null)&&(cerPersonnelFirst.size()>0)?cerPersonnelFirst.get(0).getMajorResponsibility():"",
			(cerPersonnelFirst!=null)&&(cerPersonnelFirst.size()>0)?cerPersonnelFirst.get(0).getSpecificFunctions():"",
				
			(cerPersonnelFirst!=null)&&(cerPersonnelFirst.size()>1)?cerPersonnelFirst.get(1).getNameOfStaff():"",
			(cerPersonnelFirst!=null)&&(cerPersonnelFirst.size()>1)?cerPersonnelFirst.get(1).getJobTitle():"",
			(cerPersonnelFirst!=null)&&(cerPersonnelFirst.size()>1)?cerPersonnelFirst.get(1).getMajorResponsibility():"",
			(cerPersonnelFirst!=null)&&(cerPersonnelFirst.size()>1)?cerPersonnelFirst.get(1).getSpecificFunctions():"",
			
			(cerPersonnelFirst!=null)&&(cerPersonnelFirst.size()>2)?cerPersonnelFirst.get(2).getNameOfStaff():"",
			(cerPersonnelFirst!=null)&&(cerPersonnelFirst.size()>2)?cerPersonnelFirst.get(2).getJobTitle():"",
			(cerPersonnelFirst!=null)&&(cerPersonnelFirst.size()>2)?cerPersonnelFirst.get(2).getMajorResponsibility():"",
			(cerPersonnelFirst!=null)&&(cerPersonnelFirst.size()>2)?cerPersonnelFirst.get(2).getSpecificFunctions():"",
					
			(cerPersonnelFirst!=null)&&(cerPersonnelFirst.size()>3)?cerPersonnelFirst.get(3).getNameOfStaff():"",
			(cerPersonnelFirst!=null)&&(cerPersonnelFirst.size()>3)?cerPersonnelFirst.get(3).getJobTitle():"",
			(cerPersonnelFirst!=null)&&(cerPersonnelFirst.size()>3)?cerPersonnelFirst.get(3).getMajorResponsibility():"",
			(cerPersonnelFirst!=null)&&(cerPersonnelFirst.size()>3)?cerPersonnelFirst.get(3).getSpecificFunctions():"",
					
			(cerPersonnelFirst!=null)&&(cerPersonnelFirst.size()>4)?cerPersonnelFirst.get(4).getNameOfStaff():"",
			(cerPersonnelFirst!=null)&&(cerPersonnelFirst.size()>4)?cerPersonnelFirst.get(4).getJobTitle():"",
			(cerPersonnelFirst!=null)&&(cerPersonnelFirst.size()>4)?cerPersonnelFirst.get(4).getMajorResponsibility():"",
			(cerPersonnelFirst!=null)&&(cerPersonnelFirst.size()>4)?cerPersonnelFirst.get(4).getSpecificFunctions():"",
					
			//Add More Supported by documentation in Section A, II, 20:
			(cerPersonnelSecond!=null)&&(cerPersonnelSecond.size()>0)?cerPersonnelSecond.get(0).getName():"",
			(cerPersonnelSecond!=null)&&(cerPersonnelSecond.size()>0)?cerPersonnelSecond.get(0).getRole():"",
			(cerPersonnelSecond!=null)&&(cerPersonnelSecond.size()>0)?cerPersonnelSecond.get(0).getCertificateStandard():"",
			(cerPersonnelSecond!=null)&&(cerPersonnelSecond.size()>0)?cerPersonnelSecond.get(0).getAreaOfExpertise():"",
				
			(cerPersonnelSecond!=null)&&(cerPersonnelSecond.size()>1)?cerPersonnelSecond.get(1).getName():"",
			(cerPersonnelSecond!=null)&&(cerPersonnelSecond.size()>1)?cerPersonnelSecond.get(1).getRole():"",
			(cerPersonnelSecond!=null)&&(cerPersonnelSecond.size()>1)?cerPersonnelSecond.get(1).getCertificateStandard():"",
			(cerPersonnelSecond!=null)&&(cerPersonnelSecond.size()>1)?cerPersonnelSecond.get(1).getAreaOfExpertise():"",
			
			(cerPersonnelSecond!=null)&&(cerPersonnelSecond.size()>2)?cerPersonnelSecond.get(2).getName():"",
			(cerPersonnelSecond!=null)&&(cerPersonnelSecond.size()>2)?cerPersonnelSecond.get(2).getRole():"",
			(cerPersonnelSecond!=null)&&(cerPersonnelSecond.size()>2)?cerPersonnelSecond.get(2).getCertificateStandard():"",
			(cerPersonnelSecond!=null)&&(cerPersonnelSecond.size()>2)?cerPersonnelSecond.get(2).getAreaOfExpertise():"",
					
			(cerPersonnelSecond!=null)&&(cerPersonnelSecond.size()>3)?cerPersonnelSecond.get(3).getName():"",
			(cerPersonnelSecond!=null)&&(cerPersonnelSecond.size()>3)?cerPersonnelSecond.get(3).getRole():"",
			(cerPersonnelSecond!=null)&&(cerPersonnelSecond.size()>3)?cerPersonnelSecond.get(3).getCertificateStandard():"",
			(cerPersonnelSecond!=null)&&(cerPersonnelSecond.size()>3)?cerPersonnelSecond.get(3).getAreaOfExpertise():"",
					
			(cerPersonnelSecond!=null)&&(cerPersonnelSecond.size()>4)?cerPersonnelSecond.get(4).getName():"",
			(cerPersonnelSecond!=null)&&(cerPersonnelSecond.size()>4)?cerPersonnelSecond.get(4).getRole():"",
			(cerPersonnelSecond!=null)&&(cerPersonnelSecond.size()>4)?cerPersonnelSecond.get(4).getCertificateStandard():"",
			(cerPersonnelSecond!=null)&&(cerPersonnelSecond.size()>4)?cerPersonnelSecond.get(4).getAreaOfExpertise():"",

			//normal checkbox 17
			Validator.isNotNull(cerBodyPersonnel)&&Validator.isNotNull(cerBodyPersonnel.getBodyOutsource())?cerBodyPersonnel.getBodyOutsource():"",	
				
			(outsourcedActivities!=null)&&(outsourcedActivities.size()>0)?outsourcedActivities.get(0).getOutSourcedActivity():"",
			(outsourcedActivities!=null)&&(outsourcedActivities.size()>0)?outsourcedActivities.get(0).getServiceProvider():"",
			(outsourcedActivities!=null)&&(outsourcedActivities.size()>0)?outsourcedActivities.get(0).getLocationAddress():"",
				
			(outsourcedActivities!=null)&&(outsourcedActivities.size()>1)?outsourcedActivities.get(1).getOutSourcedActivity():"",
			(outsourcedActivities!=null)&&(outsourcedActivities.size()>1)?outsourcedActivities.get(1).getServiceProvider():"",
			(outsourcedActivities!=null)&&(outsourcedActivities.size()>1)?outsourcedActivities.get(1).getLocationAddress():"",
			
			(outsourcedActivities!=null)&&(outsourcedActivities.size()>2)?outsourcedActivities.get(2).getOutSourcedActivity():"",
			(outsourcedActivities!=null)&&(outsourcedActivities.size()>2)?outsourcedActivities.get(2).getServiceProvider():"",
			(outsourcedActivities!=null)&&(outsourcedActivities.size()>2)?outsourcedActivities.get(2).getLocationAddress():"",
					
			(outsourcedActivities!=null)&&(outsourcedActivities.size()>3)?outsourcedActivities.get(3).getOutSourcedActivity():"",
			(outsourcedActivities!=null)&&(outsourcedActivities.size()>3)?outsourcedActivities.get(3).getServiceProvider():"",
			(outsourcedActivities!=null)&&(outsourcedActivities.size()>3)?outsourcedActivities.get(3).getLocationAddress():"",
					
			(outsourcedActivities!=null)&&(outsourcedActivities.size()>4)?outsourcedActivities.get(4).getOutSourcedActivity():"",
			(outsourcedActivities!=null)&&(outsourcedActivities.size()>4)?outsourcedActivities.get(4).getServiceProvider():"",
			(outsourcedActivities!=null)&&(outsourcedActivities.size()>4)?outsourcedActivities.get(4).getLocationAddress():"",

					
		    Validator.isNotNull(cerBodyPersonnel)&&Validator.isNotNull(cerBodyPersonnel.getDescSecurity())?cerBodyPersonnel.getDescSecurity():"",	

		    //Information 1
		    		
		     Validator.isNotNull(CerBodyInfo)&&Validator.isNotNull(CerBodyInfo.getDescribeMechanism())?CerBodyInfo.getDescribeMechanism():"",	

		    		 
			//Organization, Personnel and Resources: 21
		    Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getOptionFollow())?accBodyManage.getOptionFollow():"",
		    		 
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getCertiAgreement())?accBodyManage.getCertiAgreement():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefCertiAgreement())?accBodyManage.getQMRefCertiAgreement():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getRiskAssessment())?accBodyManage.getRiskAssessment():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefRisk())?accBodyManage.getQMRefRisk():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getConfidentiality())?accBodyManage.getConfidentiality():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefConfidentiality())?accBodyManage.getQMRefConfidentiality():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getSecurity())?accBodyManage.getSecurity():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefSecurity())?accBodyManage.getQMRefSecurity():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getCertificationScheme())?accBodyManage.getCertificationScheme():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefCertifiScheme())?accBodyManage.getQMRefCertifiScheme():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getValidCertification())?accBodyManage.getValidCertification():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefValidCertification())?accBodyManage.getQMRefValidCertification():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getPreRequisites())?accBodyManage.getPreRequisites():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefPrerequisites())?accBodyManage.getQMRefPrerequisites():"",
			
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getInfoProvided())?accBodyManage.getInfoProvided():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefInfoProvided())?accBodyManage.getQMRefInfoProvided():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getHandlingAppeals())?accBodyManage.getHandlingAppeals():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefHandlingAppeals())?accBodyManage.getQMRefHandlingAppeals():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getHandlingComplaints())?accBodyManage.getHandlingComplaints():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefHandlingComplaint())?accBodyManage.getQMRefHandlingComplaint():"",

			
			//Structural Requirements   6	
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getOrgStructure())?accBodyManage.getOrgStructure():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefOrgStructure())?accBodyManage.getQMRefOrgStructure():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getFormalRules())?accBodyManage.getFormalRules():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefFormalRules())?accBodyManage.getQMRefFormalRules():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getSafeguardingMechanism())?accBodyManage.getSafeguardingMechanism():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefSafeguarding())?accBodyManage.getQMRefSafeguarding():"",
			
			//Resource Requirements  8
			
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getManagementProc())?accBodyManage.getManagementProc():"",					
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefManagementProc())?accBodyManage.getQMRefManagementProc():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getContractExaminer())?accBodyManage.getContractExaminer():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefExaminer())?accBodyManage.getQMRefExaminer():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getContractBody())?accBodyManage.getContractBody():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefContractBody())?accBodyManage.getQMRefContractBody():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getDocPolicies())?accBodyManage.getDocPolicies():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefDocPolicies())?accBodyManage.getQMRefDocPolicies():"",
			   
			 //Process Requirements 20
			
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getSpecifiedStandard())?accBodyManage.getSpecifiedStandard():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefSpecified())?accBodyManage.getQMRefSpecified():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getApplicationForm())?accBodyManage.getApplicationForm():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefAppliForm())?accBodyManage.getQMRefAppliForm():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getApplicationReview())?accBodyManage.getApplicationReview():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefAppliReview())?accBodyManage.getQMRefAppliReview():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getAssessmentPlan())?accBodyManage.getAssessmentPlan():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefAssessmentPlan())?accBodyManage.getQMRefAssessmentPlan():"",	
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getExaminationProcess())?accBodyManage.getExaminationProcess():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefExamProcess())?accBodyManage.getQMRefExamProcess():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getCertificationDecision())?accBodyManage.getCertificationDecision():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefCertiDecision())?accBodyManage.getQMRefCertiDecision():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getCertificationDoc())?accBodyManage.getCertificationDoc():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefCertiDoc())?accBodyManage.getQMRefCertiDoc():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getUseOfCertificates())?accBodyManage.getUseOfCertificates():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefUseOfCertificate())?accBodyManage.getQMRefUseOfCertificate():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getSuspension())?accBodyManage.getSuspension():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefSuspension())?accBodyManage.getQMRefSuspension():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getProcessToReceive())?accBodyManage.getProcessToReceive():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefReceiveProcess())?accBodyManage.getQMRefReceiveProcess():"",
			
			//Management System Requirements 16
			
		    Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getGeneralManage())?accBodyManage.getGeneralManage():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefGeneral())?accBodyManage.getQMRefGeneral():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getDocControl())?accBodyManage.getDocControl():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefDocControl())?accBodyManage.getQMRefDocControl():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getRecordControl())?accBodyManage.getRecordControl():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefRecControl())?accBodyManage.getQMRefRecControl():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getManageReview())?accBodyManage.getManageReview():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefManageReview())?accBodyManage.getQMRefManageReview():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getInternalAudit())?accBodyManage.getInternalAudit():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefInternal())?accBodyManage.getQMRefInternal():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getCorrectiveAction())?accBodyManage.getCorrectiveAction():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefCorrective())?accBodyManage.getQMRefCorrective():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getPreventiveAction())?accBodyManage.getPreventiveAction():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefPreventive())?accBodyManage.getQMRefPreventive():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getDocInKeeping())?accBodyManage.getDocInKeeping():"",
			Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefDocInKeeping())?accBodyManage.getQMRefDocInKeeping():"",
			

			//Other Requirements 5	
					
			Validator.isNotNull(accInsBodies)&&Validator.isNotNull(accInsBodies.getApplicationFees())?accInsBodies.getApplicationFees():"",
			Validator.isNotNull(accInsBodies)&&Validator.isNotNull(accInsBodies.getInsPaymentMethod())?accInsBodies.getInsPaymentMethod():"",
			Validator.isNotNull(accInsBodies)&&Validator.isNotNull(accInsBodies.getApplicantRepName())?accInsBodies.getApplicantRepName():"",
			Validator.isNotNull(accInsBodies)&&Validator.isNotNull(accInsBodies.getApplicantRepPosition())?accInsBodies.getApplicantRepPosition():"",
			Validator.isNotNull(accInsBodies)&&Validator.isNotNull(accInsBodies.getSignatureDate())?dateFormat.format(accInsBodies.getSignatureDate()):"",
			
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
			if(title.equals("Proof of legal status/identity of the Certification Body (CLAUSE 4.1)")) {
				proofOfLegal = fileName;
			}else if (title.equals("Evidence of adequate provisions to cover liabilities arising from the operations of the organization e.g. insurance (CLAUSE 4.4)")) {
				genericCertificate = fileName;
			}else if(title.equals("Copy/generic template of organizations legally enforceable agreement for all information obtained during the certification process")) {
				authorizedPolicy=fileName;
			}else if(title.equals("Evidence of qualifications competence and training for all personnel involved in the certification process. See also Section B Question 15 (CLAUSE 6.1)")) {
				policyProcedure=fileName;
			}else if(title.equals("Copies of certificates of qualification of personnel within the Certification Body (including committee members) as well as any other person(s) with signatory authority (include specimen signatures) (CLAUSE 6.1.5)")) {
				policyPotential=fileName;
			}else if(title.equals("Sample of (blank) certificate documentation (CLAUSE 9.4.8)")) {
				authorizedCopy=fileName;
			}else if(title.equals(" List of Certified Persons and their status. See also Section B Question 4 (CLAUSE 7.1.1)")) {
				evidenceQualification=fileName;
			}else if(title.equals("An authorized copy of the management system manual and/or associated documents that outline compliance to the requirements of ISO/IEC 17024 and all other applicable standards. See also Section B Question 24 (CLAUSE 10.2.1;10.2.2)")) {
				certificateOfQualification=fileName;
			}else if(title.equals(" Evidence of accreditation received from any other accreditation body if applicable")) {
				accreditationApplicable=fileName;
			}else if(title.equals(" Documentation outlining the organizational structure including relationship to other parts within the same legal entity")) {
				includingRelationship=fileName;
			}
			
		}
		
		pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
			"[$CertificationIdentityBody$]","[$provisionsInsurance$]","[$enforceableAgreement$]","[$trainingPersonnel$]","[$qualificationBody$]","[$BlankCertificate$]",
			"[$Liststatus$]","[$systemManual$]","[$accreditationApplicable$]","[$organizationalStructure$]",
			
			},
			new String[] {
					proofOfLegal, genericCertificate,authorizedPolicy,policyProcedure,policyPotential,authorizedCopy,evidenceQualification,certificateOfQualification,accreditationApplicable,includingRelationship,
				});
		}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] { "[$PayMethodInclude$]" },
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
