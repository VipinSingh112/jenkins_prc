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
import com.nbp.janaac.application.form.service.model.AddCerScopeService;
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
import com.nbp.janaac.application.form.service.service.AddCerScopeServiceLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddOutsourcedActivitiesLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.JanaacApplicationLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.JanaacApplicationPaymentLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class CertificationBodies17065Pdf {
	public static String replaceSignatureForJanaac(long janaacApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Second Cat Second Authorised");
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
				"Signature of Second Cat Second Comapny");
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
				"Signature of Second Cat Second Represent");
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
	public static String janaacCertificationBodies17065Pdf(long janaacApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		JanaacApplication janaacApplication=null;
		
		AccMediLabApplicationInfo application = null;
		
	List<AddCerApplicationInfo> creAppliInfo = null;
	
	AccCerBodyGeneral accCerGeneral=null;
	
	List<AddCerScopeService> scopeService = null;
	
	AccCerBodyProdScope accBodyScope=null;
		
	AccCerBodyPersonnel accBodyPersonnel=null;
	
	List<AddCerPersonnelFirst> cerPersonnelFirst = null;
	List<AddCerPersonnelSecond> cerPersonnelSecond = null;
	List<AddOutsourcedActivities> outsourcedActivities=null;
	
	AccCerBodyInfo accBodyInfo=null;
	
	AccCerBodyMngReqTwo accBodyManage=null;
	
	AccInsBodiesOtherReq accInsBodies=null;
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
			creAppliInfo=AddCerApplicationInfoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			accCerGeneral=AccCerBodyGeneralLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			scopeService=AddCerScopeServiceLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			accBodyScope=AccCerBodyProdScopeLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		
		try {
			accBodyPersonnel=AccCerBodyPersonnelLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			cerPersonnelFirst=AddCerPersonnelFirstLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			cerPersonnelSecond=AddCerPersonnelSecondLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			outsourcedActivities=AddOutsourcedActivitiesLocalServiceUtil.getJanaac_OutSrc_Id(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			accBodyInfo=AccCerBodyInfoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			accBodyManage=AccCerBodyMngReqTwoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			accInsBodies=AccInsBodiesOtherReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
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
			  signatureForAuthorizedPersonnel =replaceSignatureForJanaac(janaacApplication.getJanaacApplicationId(), "Signature of Second Cat Second Authorised", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}
		  try { 
			  companySealCertificationBodies =replaceCompanySealForJanaac(janaacApplication.getJanaacApplicationId(), "Signature of Second Cat Second Comapny", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}
		  try { 
			  signatureOtherRequirement =replaceSignOtherForJanaac(janaacApplication.getJanaacApplicationId(), "Signature of Second Cat Second Represent", themeDisplay.getScopeGroupId(),
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
							"certification-bodies-second");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = 
					StringUtil.replace(pdfTemplate, 
			new String[] {
					
			//first form start
					
			//Application Information 2
					
			"[$InformationName$]","[$AddressInformation$]",
			
			//Contact Information 7
			
			"[$TeleInformation$]","[$FaxInformation$]","[$webInformation$]","[$certificationInformation$]","[$InformationStandard$]","[$Certification$]","[$emailInformation$]",
			
			//add more first 5
			
			"[$NameSt1$]","[$EMailSt1$]",
			"[$NameSt2$]","[$EMailSt2$]",
			"[$NameSt3$]","[$EMailSt3$]",
			"[$NameSt4$]","[$EMailSt4$]",
			"[$NameSt5$]","[$EMailSt5$]",
			
			//other remaining  8
			
			"[$ConNamepSt$]","[$ConEmailPerSt$]","[$FinancialManNameSt$]",
			"[$FinancialManEmailSt$]","[$RequesrtStandard$]","[$NameAuthorizedSt$]",
			"[$PositionAckSt$]","[$dateAckSt$]",
			
			//signature 1
			
			"[$SignAuthorizedSt$]",
			
			//seal 1
			
			"[$CompanySealSignSt$]",

			//form 1 complete
			
			//form 2 start  3
			
			"[$CertificationLegal$]","[$ownershipLegal$]","[$GovernmentStandard$]",
			
			//form 2 complete
			
			//form 3 start 
			
			// add more first  5
			
			"[$OrganizationCli1$]","[$Scheme1$]","[$ProductsSer1$]","[$GrantedfirstStand1$]",
			"[$OrganizationCli2$]","[$Scheme2$]","[$ProductsSer2$]","[$GrantedfirstStand2$]",
			"[$OrganizationCli3$]","[$Scheme3$]","[$ProductsSer3$]","[$GrantedfirstStand3$]",
			"[$OrganizationCli4$]","[$Scheme4$]","[$ProductsSer4$]","[$GrantedfirstStand4$]",
			"[$OrganizationCli5$]","[$Scheme5$]","[$ProductsSer5$]","[$GrantedfirstStand5$]",
			//other remaining  10
			
			"[$clientsStaff$]","[$Certificationentities$]","[$BrieflyNatureservices$]",
			"[$Relationships$]","[$DescriptionNature$]","[$consultancyPro$]",
			"[$accreditationCer$]","[$responsibleRecent$]","[$expiryAcc$]","[$Scopecertification$]",
			
			//form 3 complete
			
			//form 4 start
			
			//FIRST 3
			"[$ResourcesSize$]","[$ResourcesNum$]","[$ResourcesNumContracted$]",
			
			//FIRST ADD MORE   5	
			
			"[$StaffNm1$]","[$JobTitle1$]","[$ResponsibilitiesMajor1$]","[$SpecificStaffs1$]",
			"[$StaffNm2$]","[$JobTitle2$]","[$ResponsibilitiesMajor2$]","[$SpecificStaffs2$]",
			"[$StaffNm3$]","[$JobTitle3$]","[$ResponsibilitiesMajor3$]","[$SpecificStaffs3$]",
			"[$StaffNm4$]","[$JobTitle4$]","[$ResponsibilitiesMajor4$]","[$SpecificStaffs4$]",
			"[$StaffNm5$]","[$JobTitle5$]","[$ResponsibilitiesMajor5$]","[$SpecificStaffs5$]",
			
			//SECOND ADD MORE 5
			"[$technicalName1$]","[$technicalRole1$]","[$technicalCertication1$]","[$technicalArea1$]",
			"[$technicalName2$]","[$technicalRole2$]","[$technicalCertication2$]","[$technicalArea2$]",
			"[$technicalName3$]","[$technicalRole3$]","[$technicalCertication3$]","[$technicalArea3$]",
			"[$technicalName4$]","[$technicalRole4$]","[$technicalCertication4$]","[$technicalArea4$]",
			"[$technicalName5$]","[$technicalRole5$]","[$technicalCertication5$]","[$technicalArea5$]",
			//OTHER 1
			
			"[$evaluationAct$]",
			
			//THIRD ADD MORE 5
			
			"[$OutsourcedAct1$]","[$SupplierAct1$]","[$rr1$]",
			"[$OutsourcedAct2$]","[$SupplierAct2$]","[$rr2$]",
			"[$OutsourcedAct3$]","[$SupplierAct3$]","[$rr3$]",
			"[$OutsourcedAct4$]","[$SupplierAct4$]","[$rr4$]",
			"[$OutsourcedAct5$]","[$SupplierAct5$]","[$rr5$]",
			
			//other 1
			"[$arrangementsFacilities$]",
			
			//form 4 complete
			
			//form 5 start
			
			"[$MechanismsArrangements$]",
			
			//form 5 complete
   		 
		     //form 6 start 
	 
				
			"[$managementOption$]",                          //1
			
			 //General Requirements     14
	        "[$CertificationAgreement$]","[$RelevantRef$]",
			
			"[$assessmentRiskIm$]","[$assessmentMitigation$]",
			
			"[$Confidentiality$]","[$ConfidentialityQuality$]",
			
			"[$PubliclyScheme$]","[$PubliclyOther$]",
			
			"[$FinancialSupport$]","[$FinancialFees$]",
			
			"[$clientsDuties$]","[$clientsRelevant$]",
			
			"[$complaintsAppeals$]","[$complaintsHandling$]",
		
			
			
			//Structural Requirements   6
			"[$responsibilitiesDuties$]","[$Relevantresponsibilities$]",
			
			"[$terms$]","[$termsReference$]",
			
			"[$impartiality$]","[$impartialityOther$]",
		
			//Resource Requirements  8
			
			"[$competenciesDuties$]","[$RelevantCompetencies$]",
			
			"[$ContractPer$]","[$template$]",
			
			"[$SampleTemplate$]","[$outsourcedRelevant$]",
			
			"[$qualificationPro$]","[$qualificationOther$]",
			
			
			
			 
		     //Process Requirements 20
			"[$normativeDocument$]","[$normativeManual$]",
			
			"[$sampleTeApplication$]","[$ApplicationSample$]",
			
			"[$ReviewApplication$]","[$QualityManual$]",
			
			"[$identifyClient$]","[$productIdentify$]",
			
			"[$activitiesPlan$]","[$activitiesManagementRelevant$]",
			
			"[$reviewEva$]","[$QualityRefe$]",
			
            "[$Prodecision$]","[$decisionOther$]",
			
			"[$CertificationDocu$]","[$documentationSampleTem$]",
			
			"[$DirectoryCertified$]","[$CertifiedClient$]",
			
			"[$appealsReceive$]","[$receiveRelevant$]",
			
			
			
			
		//	Management System Requirements Option A  14
			"[$GeneralManagement$]","[$GeneralSystem$]",
			
			"[$ControlDocument$]","[$ControlArrgu$]",
			
			"[$recordsControl$]","[$recordsManual$]",
			
			"[$ManagementReview$]","[$ManagementManual$]",
			
		    "[$InternalAuditsMa$]","[$QualityRele$]",
			
			"[$actionCorrective$]","[$actionManual$]",
			
			"[$PreventiveAction$]","[$PreventiveManualOther$]",
			
			
			
			
			//Management System Requirements Option B - ISO 9001      2
			
	         "[$keepingReq$]","[$ManualManagementOther$]",
			
			
			
	
			//form 6 complete
			
			//form 7 start 6
			
            "[$feesSubmittedApp$]","[$paymentMethodState$]","[$representativeAppName$]",
			
			"[$positionAppName$]","[$DateBodyName$]","[$PositionSignatureName$]"
			
			//form 7 end
			
			},
			new String[] {
		    //Application Information 2
    		Validator.isNotNull(application)&&Validator.isNotNull(application.getNameOfApplicant())?application.getNameOfApplicant():"",
    		Validator.isNotNull(application)&&Validator.isNotNull(application.getApplicantAddress())?application.getApplicantAddress():"",
    			
    		//Contact Information 7
			Validator.isNotNull(application)&&Validator.isNotNull(application.getAppliTelephoneNo())?application.getAppliTelephoneNo():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getAppliFaxNo())?application.getAppliFaxNo():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getAppliWebsite())?application.getAppliWebsite():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getLaboratoryName())?application.getLaboratoryName():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getLaboratoryAddress())?application.getLaboratoryAddress():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getNameOfIncharge())?application.getNameOfIncharge():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getEmailOfIncharge())?application.getEmailOfIncharge():"",
				
			//add more first 5
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
					
					
			Validator.isNotNull(application)&&Validator.isNotNull(application.getPersonnelQMName())?application.getPersonnelQMName():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getPersonnelQMEmail())?application.getPersonnelQMEmail():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getPersonnelFMName())?application.getPersonnelFMName():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getPersonnelFMEmail())?application.getPersonnelFMEmail():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getAccRequestType())?application.getAccRequestType():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getAuthorizedPersonnelName())?application.getAuthorizedPersonnelName():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getAuthorizedPosition())?application.getAuthorizedPosition():"",
		    Validator.isNotNull(application)&&Validator.isNotNull(application.getAuthorizedPersonnelDate())?dateFormat.format(application.getAuthorizedPersonnelDate()):"",
			

			//signature Detail 1
		   signatureForAuthorizedPersonnel,
		    
		    
		    //company seal 1
		     companySealCertificationBodies,
		     
		     //form 1 complete
		     
		     //form 2 start 3
		     
            Validator.isNotNull(accCerGeneral)&&Validator.isNotNull(accCerGeneral.getCerLegalEntity())?accCerGeneral.getCerLegalEntity():"",
 			Validator.isNotNull(accCerGeneral)&&Validator.isNotNull(accCerGeneral.getCerLegalStatusEntity())?accCerGeneral.getCerLegalStatusEntity():"",
 			Validator.isNotNull(accCerGeneral)&&Validator.isNotNull(accCerGeneral.getCerMajorIncomeSources())?accCerGeneral.getCerMajorIncomeSources():"",
 			
 		    //form 2 complete
 					
 			//form 3 start 

      
	
	       //add more first 5

            (scopeService!=null)&&(scopeService.size()>0)?scopeService.get(0).getClientOrganization():"",
		    (scopeService!=null)&&(scopeService.size()>0)?scopeService.get(0).getCertificationStandards():"",
		    (scopeService!=null)&&(scopeService.size()>0)?scopeService.get(0).getCurrentCertification():"",
		    (scopeService!=null)&&(scopeService.size()>0)?dateFormat.format(scopeService.get(0).getDateFirstGranted()):"",
		    				  
		    
					    				
			(scopeService!=null)&&(scopeService.size()>1)?scopeService.get(1).getClientOrganization():"",
			(scopeService!=null)&&(scopeService.size()>1)?scopeService.get(1).getCertificationStandards():"",
			(scopeService!=null)&&(scopeService.size()>1)?scopeService.get(1).getCurrentCertification():"",
		    (scopeService!=null)&&(scopeService.size()>1)?dateFormat.format(scopeService.get(1).getDateFirstGranted()):"",
							
			
								
			(scopeService!=null)&&(scopeService.size()>2)?scopeService.get(2).getClientOrganization():"",
			(scopeService!=null)&&(scopeService.size()>2)?scopeService.get(2).getCertificationStandards():"",
			(scopeService!=null)&&(scopeService.size()>2)?scopeService.get(2).getCurrentCertification():"",
		    (scopeService!=null)&&(scopeService.size()>2)?dateFormat.format(scopeService.get(2).getDateFirstGranted()):"",
							
			
			
			(scopeService!=null)&&(scopeService.size()>3)?scopeService.get(3).getClientOrganization():"",
			(scopeService!=null)&&(scopeService.size()>3)?scopeService.get(3).getCertificationStandards():"",
			(scopeService!=null)&&(scopeService.size()>3)?scopeService.get(3).getCurrentCertification():"",
		    (scopeService!=null)&&(scopeService.size()>3)?dateFormat.format(scopeService.get(3).getDateFirstGranted()):"",
							


			(scopeService!=null)&&(scopeService.size()>4)?scopeService.get(4).getClientOrganization():"",
			(scopeService!=null)&&(scopeService.size()>4)?scopeService.get(4).getCertificationStandards():"",
			(scopeService!=null)&&(scopeService.size()>4)?scopeService.get(4).getCurrentCertification():"",
			(scopeService!=null)&&(scopeService.size()>4)?dateFormat.format(scopeService.get(4).getDateFirstGranted()):"",
	
					
		//other remaining  10
					
					
	        Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getCerIntrestedParties())?accBodyScope.getCerIntrestedParties():"",
            Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getOtherServices())?accBodyScope.getOtherServices():"",
 			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getOtherServicesDescribe())?accBodyScope.getOtherServicesDescribe():"",
 			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getEstablishedRelation())?accBodyScope.getEstablishedRelation():"",
	        Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getEstablishedRelDesc())?accBodyScope.getEstablishedRelDesc():"",
			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getClientService())?accBodyScope.getClientService():"",		
 			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getOrgAccredited())?accBodyScope.getOrgAccredited():"",
			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getResponsibleBody())?accBodyScope.getResponsibleBody():"",
			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getAccExpDate())?dateFormat.format(accBodyScope.getAccExpDate()):"",
		    Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getCertBodyScope())?accBodyScope.getCertBodyScope():"",


			//form 3 complete
			
			//form 4 start
		    		
		   //FIRST 3
			
            Validator.isNotNull(accBodyPersonnel)&&Validator.isNotNull(accBodyPersonnel.getInternalStaffSize())?accBodyPersonnel.getInternalStaffSize():"",
            Validator.isNotNull(accBodyPersonnel)&&Validator.isNotNull(accBodyPersonnel.getAuditorsNum())?accBodyPersonnel.getAuditorsNum():"",
 			Validator.isNotNull(accBodyPersonnel)&&Validator.isNotNull(accBodyPersonnel.getContractedPerNum())?accBodyPersonnel.getContractedPerNum():"",
 		
		
			//FIRST ADD MORE   5
 					
 					 
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
		
							
          //SECOND ADD MORE 5

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
					
		   //OTHER 1
					
	      Validator.isNotNull(accBodyPersonnel)&&Validator.isNotNull(accBodyPersonnel.getBodyOutsource())?accBodyPersonnel.getBodyOutsource():"",
	    		  
	      //THIRD ADD MORE 5
	    		  
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
					
	 			
		//other 1
		
	     Validator.isNotNull(accBodyPersonnel)&&Validator.isNotNull(accBodyPersonnel.getDescSecurity())?accBodyPersonnel.getDescSecurity():"",

        //form 4 complete
	    		 
	    //form 5 start
    
	     Validator.isNotNull(accBodyInfo)&&Validator.isNotNull(accBodyInfo.getDescribeMechanism())?accBodyInfo.getDescribeMechanism():"",

		//form 5 complete
	    		 
	      //form 6 start
	    		 
        Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getOptionFollow())?accBodyManage.getOptionFollow():"",
		
        //General Requirements     14
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
		
			
				
		//form 6 end
		
		//form 7 start 5
				
        Validator.isNotNull(accInsBodies)&&Validator.isNotNull(accInsBodies.getApplicationFees())?accInsBodies.getApplicationFees():"",
		Validator.isNotNull(accInsBodies)&&Validator.isNotNull(accInsBodies.getInsPaymentMethod())?accInsBodies.getInsPaymentMethod():"",
		Validator.isNotNull(accInsBodies)&&Validator.isNotNull(accInsBodies.getApplicantRepName())?accInsBodies.getApplicantRepName():"",
		Validator.isNotNull(accInsBodies)&&Validator.isNotNull(accInsBodies.getApplicantRepPosition())?accInsBodies.getApplicantRepPosition():"",
		Validator.isNotNull(accInsBodies)&&Validator.isNotNull(accInsBodies.getSignatureDate())?dateFormat.format(accInsBodies.getSignatureDate()):"",
			
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
			if(title.equals("Proof of legal status/identity of the Certification Body (CLAUSE 4.1.1)")) {
				proofOfLegal = fileName;
			}else if (title.equals("Evidence of adequate provisions to cover liabilities arising from the operations of the organization insurance (CLAUSE 4.3)")) {
				genericCertificate = fileName;
			}else if(title.equals("Evidence of qualifications competence and industry scopes for all auditors/technical experts utilized by the organization to conduct certification audits See also Section B Question 17 (CLAUSE 6.1)")) {
				authorizedPolicy=fileName;
			}else if(title.equals("Copies of certificates of qualification of personnel within the Certification Body (including committee members) as well as any other person(s) with signatory authority (include specimen signatures) (CLAUSE 6.1)")) {
				policyProcedure=fileName;
			}else if(title.equals("Sample of (blank) certification documentation (CLAUSE 7.7)")) {
				policyPotential=fileName;
			}else if(title.equals("Directory of Certified Products (CLAUSE 7.8)")) {
				authorizedCopy=fileName;
			}else if(title.equals("An authorized copy of the management system manual and/or associated documents that outline compliance to the requirements of ISO/IEC 17065 and all other applicable standards. See also Section B Question 24 (CLAUSE 8.1.2; 8.2)")) {
				evidenceQualification=fileName;
			}else if(title.equals("Evidence of accreditation received from any other accreditation body if applicable")) {
				certificateOfQualification=fileName;
			}else if(title.equals("List of all current audit clients under the proposed accreditation scope indicating: client name; date of the last audit")) {
				evidenceOfAdequate=fileName;
			}else if(title.equals("Documentation outlining the organizational structure including relationship to other parts within the same legal entity")) {
				sampleOfBlank=fileName;
			}
		}
		
		pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
			"[$CertificationBodyLegal$]","[$insurancePro$]","[$qualificationsCom$]","[$qualificationPersonnel$]","[$documentationBlank$]","[$CertifiedPro$]","[$complianceAuthorized$]","[$bodyAccreditation$]","[$accreditationRScope$]","[$structureOut$]",
			
			},
			new String[] {
					proofOfLegal, genericCertificate,authorizedPolicy,policyProcedure,policyPotential,authorizedCopy,evidenceQualification,certificateOfQualification,
					evidenceOfAdequate,sampleOfBlank,
				});
		}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] { "[$PayMethodOutine$]" },
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




