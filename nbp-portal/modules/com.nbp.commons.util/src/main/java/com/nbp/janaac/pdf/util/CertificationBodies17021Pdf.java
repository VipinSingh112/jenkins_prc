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
import com.nbp.janaac.application.form.service.model.AccCerBodyApplicantInfo;
import com.nbp.janaac.application.form.service.model.AccCerBodyGeneral;
import com.nbp.janaac.application.form.service.model.AccCerBodyInfo;
import com.nbp.janaac.application.form.service.model.AccCerBodyManageReq;
import com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel;
import com.nbp.janaac.application.form.service.model.AccCerBodyScope;
import com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq;
import com.nbp.janaac.application.form.service.model.AddCerApplicationInfo;
import com.nbp.janaac.application.form.service.model.AddCerPersonnelFirst;
import com.nbp.janaac.application.form.service.model.AddCerPersonnelSecond;
import com.nbp.janaac.application.form.service.model.AddCerPersonnelThird;
import com.nbp.janaac.application.form.service.model.AddCerScopeService;
import com.nbp.janaac.application.form.service.model.AddFdaPersonnelThird;
import com.nbp.janaac.application.form.service.model.JanaacApplication;
import com.nbp.janaac.application.form.service.model.JanaacApplicationPayment;
import com.nbp.janaac.application.form.service.service.AccCerBodyApplicantInfoLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccCerBodyGeneralLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccCerBodyInfoLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccCerBodyManageReqLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccCerBodyPersonnelLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccCerBodyScopeLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccInsBodiesOtherReqLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddCerApplicationInfoLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddCerPersonnelFirstLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddCerPersonnelSecondLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddCerPersonnelThirdLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddCerScopeServiceLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddFdaPersonnelThirdLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.JanaacApplicationLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.JanaacApplicationPaymentLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class CertificationBodies17021Pdf {
	public static String replaceSignatureForJanaac(long janaacApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Authorized Personnel Certfi Bodies");
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
				"Company Seals Certfi Bodies");
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
				"Signature of Second Cat First Represent");
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
	public static String janaacCertificationBodies17021Pdf(long janaacApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		JanaacApplication janaacApplication=null;
		
		AccCerBodyApplicantInfo application=null;
	List<AddCerApplicationInfo> creAppliInfo = null;
	    
	AccCerBodyGeneral accCerGeneral=null;
	
	AccCerBodyScope accBodyScope=null;
List<AddCerScopeService> scopeService = null;
		
	AccCerBodyPersonnel accBodyPersonnel=null;
	
	List<AddFdaPersonnelThird> fdaPersonnelThird = null;
	
List<AddCerPersonnelFirst> cerPersonnelFirst = null;
List<AddCerPersonnelSecond> cerPersonnelSecond = null;
List<AddCerPersonnelThird> cerPersonnelThird = null;

AccCerBodyInfo accBodyInfo=null;

AccCerBodyManageReq accBodyManage=null;

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
			application=AccCerBodyApplicantInfoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
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
			accBodyScope=AccCerBodyScopeLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			scopeService=AddCerScopeServiceLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			accBodyPersonnel=AccCerBodyPersonnelLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			fdaPersonnelThird=AddFdaPersonnelThirdLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
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
			cerPersonnelThird=AddCerPersonnelThirdLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			accBodyInfo=AccCerBodyInfoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			accBodyManage=AccCerBodyManageReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
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
			  signatureForAuthorizedPersonnel =replaceSignatureForJanaac(janaacApplication.getJanaacApplicationId(), "Signature of Authorized Personnel Certfi Bodies", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}
		  try { 
			  companySealCertificationBodies =replaceCompanySealForJanaac(janaacApplication.getJanaacApplicationId(), "Company Seals Certfi Bodies", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}
		  try { 
			  signatureOtherRequirement =replaceSignOtherForJanaac(janaacApplication.getJanaacApplicationId(), "Signature of Second Cat First Represent", themeDisplay.getScopeGroupId(),
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
							"accreditation-of-certification-bodies-first");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = 
					StringUtil.replace(pdfTemplate, 
			new String[] {
					
			//first form start
					
			//Application Information 2
					
			"[$StandardApplicantName$]","[$AddressStandard$]",
			
			//Contact Information 7
			
			"[$TelenoConStandard$]","[$FaxOConStandard$]","[$webConStandard$]","[$certificatesStandard$]","[$AccrediBodStandard$]","[$personCon$]","[$emailStandard$]",
			
			//add more first 5
			
			"[$NameStandard1$]","[$EMailStandard1$]",
			"[$NameStandard2$]","[$EMailStandard2$]",
			"[$NameStandard3$]","[$EMailStandard3$]",
			"[$NameStandard4$]","[$EMailStandard4$]",
			"[$NameStandard5$]","[$EMailStandard5$]",
			
			
			//other remaining  11
			
			"[$ConNamepStandard$]","[$ConEmailPerStandard$]","[$FinancialManNameStandard$]",
			"[$FinancialManEmailStandard$]","[$RequesrtApporiateStandard$]","[$AccreditationBeingStandard$]",
			"[$PleaseSpecifyStandard$]","[$ListStandard$]","[$NameAuthorizedStandard$]",
			"[$PositionAckStandard$]","[$dateAckStandard$]",
			
			//signature 1
			
			"[$SignAuthorizedStandard$]",
			
			//seal 1
			
			"[$CompanySealSignStandard$]",

			//form 1 complete
			
			//form 2 start  3
			
			"[$LegalEntityBodyStandard$]","[$DescribeLegalStatusStandard$]","[$OutlineSourceStandard$]",
			
			//form 2 complete
			
			//form 3 start 28
			
			"[$IsoStandard$]","[$ExpertiseField$]","[$ISOPolicieLe$]",
			"[$ManagementExpertise$]","[$ISOOverall$]","[$ManualExpertise$]",
			"[$ISOReferences$]","[$ReferencesExpertise$]","[$ISOResponsibilitiesRole$]",
			
			"[$TechnicalExpertise$]","[$ISODocumentationJob$]","[$InspectionExpertise$]",
			"[$ISOControlProcedure$]","[$ProcedureExpertise$]","[$ISOChangesDoc$]",
			"[$ChangesExpertise$]","[$ISOQualityInspection$]","[$QualityInsExpertise$]",
			
			"[$ISOManagementSQF$]","[$QualityExpertise$]","[$ISOManagementReview$]",
			"[$QExpertise$]","[$ISOManagementReview50001$]","[$ExpertiseManual$]",
			"[$ISOManagementReview22301$]","[$QManExpertise$]","[$ISOManagementOther$]",
			
			"[$QuExpertiseManual$]",
			
			// add more first  5
			
			"[$ClientStandard1$]","[$FoodStandard1$]","[$FdaRegStand1$]","[$GrantedStand1$]",
			"[$ClientStandard2$]","[$FoodStandard2$]","[$FdaRegStand2$]","[$GrantedStand2$]",
			"[$ClientStandard3$]","[$FoodStandard3$]","[$FdaRegStand3$]","[$GrantedStand3$]",
			"[$ClientStandard4$]","[$FoodStandard4$]","[$FdaRegStand4$]","[$GrantedStand4$]",
			"[$ClientStandard5$]","[$FoodStandard5$]","[$FdaRegStand5$]","[$GrantedStand5$]",

		
			//other remaining  11
			
			"[$IndicateSpecific$]","[$CertificationBody$]","[$BrieflyNature$]",
			"[$consultancy$]","[$DescriptionOrg$]","[$OrganizationProvided$]",
			"[$ServiceCertificate$]","[$AccreditationAccredited$]","[$Recentname$]","[$ExpiryDate$]","[$ScopeBody$]",
			
			//form 3 complete
			
			//form 4 start
			
			//FIRST 3
			"[$StaffBodySize$]","[$auditorsNum$]","[$contractedBodyNum$]",
			
			//FIRST ADD MORE   5	
			
			"[$StaffMemberNm1$]","[$TilestaffJob1$]","[$Responsibilities1$]","[$StaffFunctions1$]",
			"[$StaffMemberNm2$]","[$TilestaffJob2$]","[$Responsibilities2$]","[$StaffFunctions2$]",
			"[$StaffMemberNm3$]","[$TilestaffJob3$]","[$Responsibilities3$]","[$StaffFunctions3$]",
			"[$StaffMemberNm4$]","[$TilestaffJob4$]","[$Responsibilities4$]","[$StaffFunctions4$]",
			"[$StaffMemberNm5$]","[$TilestaffJob5$]","[$Responsibilities5$]","[$StaffFunctions5$]",
			
			
			
			//SECOND ADD MORE 5
			"[$SupportedName1$]","[$RoleName1$]","[$CerticationStandard1$]","[$Industry1$]",
			"[$SupportedName2$]","[$RoleName2$]","[$CerticationStandard2$]","[$Industry2$]",
			"[$SupportedName3$]","[$RoleName3$]","[$CerticationStandard3$]","[$Industry3$]",
			"[$SupportedName4$]","[$RoleName4$]","[$CerticationStandard4$]","[$Industry4$]",
			"[$SupportedName5$]","[$RoleName5$]","[$CerticationStandard5$]","[$Industry5$]",
			
			//OTHER 1
			
			"[$OutsourceCertification$]",
			
			//THIRD ADD MORE 5
			
			"[$OutsourcedAct1$]","[$SupplierAct1$]",
			"[$OutsourcedAct2$]","[$SupplierAct2$]",
			"[$OutsourcedAct3$]","[$SupplierAct3$]",
			"[$OutsourcedAct4$]","[$SupplierAct4$]",
			"[$OutsourcedAct5$]","[$SupplierAct5$]",
			
			//fourth add more 5
			
			"[$NumberCovers1$]","[$AddressCovers1$]","[$activitiesPerformed1$]","[$ContactLocation1$]",
			"[$NumberCovers2$]","[$AddressCovers2$]","[$activitiesPerformed2$]","[$ContactLocation2$]",
			"[$NumberCovers3$]","[$AddressCovers3$]","[$activitiesPerformed3$]","[$ContactLocation3$]",
			"[$NumberCovers4$]","[$AddressCovers4$]","[$activitiesPerformed4$]","[$ContactLocation4$]",
			"[$NumberCovers5$]","[$AddressCovers5$]","[$activitiesPerformed5$]","[$ContactLocation5$]",
				
			
			//other 1
			"[$ArrangementsEquipment$]",
			
			//form 4 complete
			
			//form 5 start
			
			"[$InformationOrganization$]",
			
			//form 5 complete
   		 
		     //form 6 start  59
	 
				
			"[$ManagementSystemCu$]",                          //1
			
			//General Requirements     4
			"[$ImpartialityPolicy$]","[$Impartiality$]",
			
			"[$RiskAssessment$]","[$Risk$]",
			
			
			//Structural Requirements   6
			"[$OrganizationalSt$]","[$structureDuti$]",
			
			"[$referenceFor$]","[$committees$]",
			
			"[$ProcessControl$]","[$Partnerships$]",
		
			//Resource Requirements  14
			
			"[$Criteria$]","[$RelevantRef$]",
			
			"[$competence$]","[$monitoring$]",
			
			"[$trainingPolicy$]","[$trainingImpartiality$]",
			
			"[$Impcertification$]","[$certificationOt$]",
			
			"[$WrittenAgree$]","[$QualityManual$]",
			
			"[$DescriptionProcess$]","[$ManagementManual$]",
			
			"[$provideOutsou$]","[$RelevantIm$]",
		
			
			
			
			 
			//Information Requirements 24
			"[$Audit$]","[$RelevantRef$]",
			
			"[$grantingMain$]","[$ReferenceMan$]",
			
			"[$systemsPolicy$]","[$ManualRefa$]",
			
			"[$bodyCer$]","[$Referencelity$]",
			
			"[$HandlingReq$]","[$requestsFor$]",
			
			"[$ImpartialityPol$]","[$QualityBody$]",
			
            "[$Provisions$]","[$clientsOth$]",
			
			"[$documents$]","[$templateOth$]",
			
			"[$governing$]","[$markRelevant$]",
			
			"[$LegallyEn$]","[$ReferenceManual$]",
			
			"[$confidentialityProcess$]","[$QualityReference$]",
			
			"[$MechanismsCerti$]","[$BodyOther$]",
			
			
			
			//Process Requirements 36
			"[$Requirements$]","[$QualityRequirements$]",
			
			"[$applicationReview$]","[$reviewManual$]",
			
			"[$cyclePolicy$]","[$programme$]",
			
			"[$determining$]","[$ReferenceLo$]",
			
		    "[$planmulti$]","[$RelevantMana$]",
			
			"[$planningInclude$]","[$QualityThen$]",
			
			"[$appointingAudit$]","[$ImpRelevant$]",
			
			"[$conducting$]","[$Quality$]",
			
			"[$Reportsample$]","[$OtherManagement$]",
			
			"[$conformitiesCorrective$]","[$correctiveAction$]",
			
			"[$auditResult$]","[$RelevantFee$]",
			
			"[$transferf$]","[$transferOther$]",
			
			
			"[$suspensionWith$]","[$suspensionScope$]",
			
			"[$withdrawalScope$]","[$withdrawal$]",
				
            "[$decisionsPro$]","[$appealsEva$]",
			
			"[$handlingCom$]","[$complaintsPro$]",
			
			"[$Record$]","[$Manual$]",
			
			"[$retentionPRo$]","[$OtherRe$]",
			
			//Management System Requirements Option A  16
			
			"[$policiesMan$]","[$ImpartQuality$]",
			
			"[$objectivesSym$]","[$systemCall$]",
			
			"[$equivalentdoc$]","[$documentation$]",
			
            "[$controlPro$]","[$documentControl$]",
			
			"[$recordProcon$]","[$recordTesting$]",
			
			"[$reviewManagement$]","[$ManualTime$]",
			
			"[$InternalAudit$]","[$RefTest$]",
			
			"[$identification$]","[$identificationManagement$]",
			
			//Management System Requirements Option B - ISO 9001      8
			
	         "[$ScopeQms$]","[$QualityManagement$]",
			
			"[$developmentPlanning$]","[$developmentMan$]",
			
			"[$interested$]","[$interestedOther$]",
			
			"[$ManagementRev$]","[$QualityReview$]",
		
			
	
			//form 6 complete
			
			//form 7 start
			
            "[$Apprefundable$]","[$payMethod$]","[$representativeApp$]",
			
			"[$positionApp$]","[$DateBody$]","[$PositionSignature$]"
			
			//form 7 end
			
			
			},
			new String[] {
		    //Application Information 2
    		Validator.isNotNull(application)&&Validator.isNotNull(application.getApplicantName())?application.getApplicantName():"",
    		Validator.isNotNull(application)&&Validator.isNotNull(application.getApplicantAddress())?application.getApplicantAddress():"",
    			
    		//Contact Information 7
			Validator.isNotNull(application)&&Validator.isNotNull(application.getApplicantTelephone())?application.getApplicantTelephone():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getApplicantFaxNo())?application.getApplicantFaxNo():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getApplicantWebsite())?application.getApplicantWebsite():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getCertificationName())?application.getCertificationName():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getCertiAddress())?application.getCertiAddress():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getPersonnelName())?application.getPersonnelName():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getPersonnelEmail())?application.getPersonnelEmail():"",
				
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
					
					
			//other remaining  11
					
					
			Validator.isNotNull(application)&&Validator.isNotNull(application.getPersonnelContactName())?application.getPersonnelContactName():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getPersonnelContactEmail())?application.getPersonnelContactEmail():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getPersonnelFMName())?application.getPersonnelFMName():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getPersonnelFMEmail())?application.getPersonnelFMEmail():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getAccreditationRequest())?application.getAccreditationRequest():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getManagementSystem())?application.getManagementSystem():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getSpecifyOther())?application.getSpecifyOther():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getListOfStandard())?application.getListOfStandard():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getAuthorizedPersonnelName())?application.getAuthorizedPersonnelName():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getAuthorizedPersonnelPos())?application.getAuthorizedPersonnelPos():"",
		    Validator.isNotNull(application)&&Validator.isNotNull(application.getAuthorizedPersonnelDate())?dateFormat.format(application.getAuthorizedPersonnelDate()):"",
			

			//signature Detail 1
		   signatureForAuthorizedPersonnel,
		    
		    
		    //company seal 1
		     companySealCertificationBodies,
		     
		     //form 1 complete
		     
		     //form 2 start
		     
            Validator.isNotNull(accCerGeneral)&&Validator.isNotNull(accCerGeneral.getCerLegalEntity())?accCerGeneral.getCerLegalEntity():"",
 			Validator.isNotNull(accCerGeneral)&&Validator.isNotNull(accCerGeneral.getCerLegalStatusEntity())?accCerGeneral.getCerLegalStatusEntity():"",
 			Validator.isNotNull(accCerGeneral)&&Validator.isNotNull(accCerGeneral.getCerMajorIncomeSources())?accCerGeneral.getCerMajorIncomeSources():"",
 			
 		    //form 2 complete
 					
 			//form 3 start 34

            Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getCertificationCerBody())?accBodyScope.getCertificationCerBody():"",
 			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getExpertiseField1())?accBodyScope.getExpertiseField1():"",
 					
 			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getCertificationCerBody())?accBodyScope.getCertificationCerBody():"",
            Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getExpertiseField2())?accBodyScope.getExpertiseField2():"",
            		
 			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getCertificationCerBody())?accBodyScope.getCertificationCerBody():"",
 			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getExpertiseField3())?accBodyScope.getExpertiseField3():"",
 					
	        Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getCertificationCerBody())?accBodyScope.getCertificationCerBody():"",
			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getExpertiseField4())?accBodyScope.getExpertiseField4():"",
					
			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getCertificationCerBody())?accBodyScope.getCertificationCerBody():"",
			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getExpertiseField5())?accBodyScope.getExpertiseField5():"",
					
 			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getCertificationCerBody())?accBodyScope.getCertificationCerBody():"",
 			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getExpertiseField6())?accBodyScope.getExpertiseField6():"",
 					
		    Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getCertificationCerBody())?accBodyScope.getCertificationCerBody():"",
			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getExpertiseField7())?accBodyScope.getExpertiseField7():"",
					
			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getCertificationCerBody())?accBodyScope.getCertificationCerBody():"",		
            Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getExpertiseField8())?accBodyScope.getExpertiseField8():"",
            		
 			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getCertificationCerBody())?accBodyScope.getCertificationCerBody():"",
 			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getExpertiseField9())?accBodyScope.getExpertiseField9():"",
           
 			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getCertificationCerBody())?accBodyScope.getCertificationCerBody():"",
 			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getExpertiseField10())?accBodyScope.getExpertiseField10():"",
 					
 			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getCertificationCerBody())?accBodyScope.getCertificationCerBody():"",
            Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getExpertiseField11())?accBodyScope.getExpertiseField11():"",
            		
 			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getCertificationCerBody())?accBodyScope.getCertificationCerBody():"",
 			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getExpertiseField12())?accBodyScope.getExpertiseField12():"",
 					
            Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getCertificationCerBody())?accBodyScope.getCertificationCerBody():"",
 			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getExpertiseField13())?accBodyScope.getExpertiseField13():"",
 					
 			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getCertificationCerBody())?accBodyScope.getCertificationCerBody():"",
	        Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getExpertiseField14())?accBodyScope.getExpertiseField14():"",
			
	
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
	
					
		//other remaining  11
					
					
	        Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getCerIntrestedParties())?accBodyScope.getCerIntrestedParties():"",
            Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getOtherServices())?accBodyScope.getOtherServices():"",
 			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getOtherServicesDescribe())?accBodyScope.getOtherServicesDescribe():"",
 			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getEstablishedRelation())?accBodyScope.getEstablishedRelation():"",
	        Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getEstablishedRelDesc())?accBodyScope.getEstablishedRelDesc():"",
			Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getClientService())?accBodyScope.getClientService():"",
		    Validator.isNotNull(accBodyScope)&&Validator.isNotNull(accBodyScope.getCertificationCerBody())?accBodyScope.getCertificationCerBody():"", 		
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
	    		  
            (fdaPersonnelThird!=null)&&(fdaPersonnelThird.size()>0)?fdaPersonnelThird.get(0).getOutsourcedActivity():"",
		    (fdaPersonnelThird!=null)&&(fdaPersonnelThird.size()>0)?fdaPersonnelThird.get(0).getSupplierServiceProvider():"",
		      		    				
			(fdaPersonnelThird!=null)&&(fdaPersonnelThird.size()>1)?fdaPersonnelThird.get(1).getOutsourcedActivity():"",
			(fdaPersonnelThird!=null)&&(fdaPersonnelThird.size()>1)?fdaPersonnelThird.get(1).getSupplierServiceProvider():"",
							
			(fdaPersonnelThird!=null)&&(fdaPersonnelThird.size()>2)?fdaPersonnelThird.get(2).getOutsourcedActivity():"",
			(fdaPersonnelThird!=null)&&(fdaPersonnelThird.size()>2)?fdaPersonnelThird.get(2).getSupplierServiceProvider():"",
					
			(fdaPersonnelThird!=null)&&(fdaPersonnelThird.size()>3)?fdaPersonnelThird.get(3).getOutsourcedActivity():"",
			(fdaPersonnelThird!=null)&&(fdaPersonnelThird.size()>3)?fdaPersonnelThird.get(3).getSupplierServiceProvider():"",
		
			(fdaPersonnelThird!=null)&&(fdaPersonnelThird.size()>4)?fdaPersonnelThird.get(4).getOutsourcedActivity():"",
			(fdaPersonnelThird!=null)&&(fdaPersonnelThird.size()>4)?fdaPersonnelThird.get(4).getSupplierServiceProvider():"",
					
	 //        Fourth add more 5
					
					 
            (cerPersonnelThird!=null)&&(cerPersonnelThird.size()>0)?cerPersonnelThird.get(0).getNumber():"",
		    (cerPersonnelThird!=null)&&(cerPersonnelThird.size()>0)?cerPersonnelThird.get(0).getLocation():"",
		    (cerPersonnelThird!=null)&&(cerPersonnelThird.size()>0)?cerPersonnelThird.get(0).getCertificationActivities():"",
		    (cerPersonnelThird!=null)&&(cerPersonnelThird.size()>0)?cerPersonnelThird.get(0).getContactDetails():"",
		    				  
					    				
			(cerPersonnelThird!=null)&&(cerPersonnelThird.size()>1)?cerPersonnelThird.get(1).getNumber():"",
			(cerPersonnelThird!=null)&&(cerPersonnelThird.size()>1)?cerPersonnelThird.get(1).getLocation():"",
			(cerPersonnelThird!=null)&&(cerPersonnelThird.size()>1)?cerPersonnelThird.get(1).getCertificationActivities():"",
		    (cerPersonnelThird!=null)&&(cerPersonnelThird.size()>1)?cerPersonnelThird.get(1).getContactDetails():"",
							
			
								
			(cerPersonnelThird!=null)&&(cerPersonnelThird.size()>2)?cerPersonnelThird.get(2).getNumber():"",
			(cerPersonnelThird!=null)&&(cerPersonnelThird.size()>2)?cerPersonnelThird.get(2).getLocation():"",
			(cerPersonnelThird!=null)&&(cerPersonnelThird.size()>2)?cerPersonnelThird.get(2).getCertificationActivities():"",
		    (cerPersonnelThird!=null)&&(cerPersonnelThird.size()>2)?cerPersonnelThird.get(2).getContactDetails():"",
							
			
			
			(cerPersonnelThird!=null)&&(cerPersonnelThird.size()>3)?cerPersonnelThird.get(3).getNumber():"",
			(cerPersonnelThird!=null)&&(cerPersonnelThird.size()>3)?cerPersonnelThird.get(3).getLocation():"",
			(cerPersonnelThird!=null)&&(cerPersonnelThird.size()>3)?cerPersonnelThird.get(3).getCertificationActivities():"",
		    (cerPersonnelThird!=null)&&(cerPersonnelThird.size()>3)?cerPersonnelThird.get(3).getContactDetails():"",
							


			(cerPersonnelThird!=null)&&(cerPersonnelThird.size()>4)?cerPersonnelThird.get(4).getNumber():"",
			(cerPersonnelThird!=null)&&(cerPersonnelThird.size()>4)?cerPersonnelThird.get(4).getLocation():"",
			(cerPersonnelThird!=null)&&(cerPersonnelThird.size()>4)?cerPersonnelThird.get(4).getCertificationActivities():"",
			(cerPersonnelThird!=null)&&(cerPersonnelThird.size()>4)?cerPersonnelThird.get(4).getContactDetails():"",
					
		//other 1
		
	     Validator.isNotNull(accBodyPersonnel)&&Validator.isNotNull(accBodyPersonnel.getDescSecurity())?accBodyPersonnel.getDescSecurity():"",

        //form 4 complete
	    		 
	    //form 5 start
    
	     Validator.isNotNull(accBodyInfo)&&Validator.isNotNull(accBodyInfo.getDescribeMechanism())?accBodyInfo.getDescribeMechanism():"",

		//form 5 complete
	    		 
	      //form 6 start
	    		 
        Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getOptionFollow())?accBodyManage.getOptionFollow():"",
		
        //General Requirements     4
        Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getImpartialityPolicy())?accBodyManage.getImpartialityPolicy():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefImpartiality())?accBodyManage.getQMRefImpartiality():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getRiskAssessment())?accBodyManage.getRiskAssessment():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefRisk())?accBodyManage.getQMRefRisk():"",
				
		//Structural Requirements   6	
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getOrgStructure())?accBodyManage.getOrgStructure():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefOrgStruct())?accBodyManage.getQMRefOrgStruct():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getTermsOfReference())?accBodyManage.getTermsOfReference():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefTerms())?accBodyManage.getQMRefTerms():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getProcessForControl())?accBodyManage.getProcessForControl():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefProcess())?accBodyManage.getQMRefProcess():"",
		
		//Resource Requirements  14
		
	    Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getCriteriaReq())?accBodyManage.getCriteriaReq():"",					
        Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefCriteria())?accBodyManage.getQMRefCriteria():"",
        Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getInitialCompetence())?accBodyManage.getInitialCompetence():"",
        Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefInitial())?accBodyManage.getQMRefInitial():"",
        Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getSelectingTraining())?accBodyManage.getSelectingTraining():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefSelecting())?accBodyManage.getQMRefSelecting():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getMonitoringCompetence())?accBodyManage.getMonitoringCompetence():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefMonitoring())?accBodyManage.getQMRefMonitoring():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getWrittenAgreement())?accBodyManage.getWrittenAgreement():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefWritten())?accBodyManage.getQMRefWritten():"",
        Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getDescOfProcess())?accBodyManage.getDescOfProcess():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefDescProcess())?accBodyManage.getQMRefDescProcess():"",
	    Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getProcessForMonitor())?accBodyManage.getProcessForMonitor():"",
    	Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefMonitorProcess())?accBodyManage.getQMRefMonitorProcess():"",

    	//Information Requirements 24
		
		
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getAuditProcess())?accBodyManage.getAuditProcess():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefAuditProcess())?accBodyManage.getQMRefAuditProcess():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getProcessGranting())?accBodyManage.getProcessGranting():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefGranting())?accBodyManage.getQMRefGranting():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getManagemntSys())?accBodyManage.getManagemntSys():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefManagemnt())?accBodyManage.getQMRefManagemnt():"",
        Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getUseOfCertification())?accBodyManage.getUseOfCertification():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefUseOfCerti())?accBodyManage.getQMRefUseOfCerti():"",
        Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getHandlingReq())?accBodyManage.getHandlingReq():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefHandling())?accBodyManage.getQMRefHandling():"",
	    Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getImpartialityPolicies())?accBodyManage.getImpartialityPolicies():"",	
        Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefImpartPolicy())?accBodyManage.getQMRefImpartPolicy():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getProvisionInform())?accBodyManage.getProvisionInform():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefProvision())?accBodyManage.getQMRefProvision():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getCertificationDoc())?accBodyManage.getCertificationDoc():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefCertification())?accBodyManage.getQMRefCertification():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getRulesGoverning())?accBodyManage.getRulesGoverning():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefGoverning())?accBodyManage.getQMRefGoverning():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getEnforcableArrangements())?accBodyManage.getEnforcableArrangements():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefEnforcable())?accBodyManage.getQMRefEnforcable():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getEnsureConfidential())?accBodyManage.getEnsureConfidential():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefEnsureConfid())?accBodyManage.getQMRefEnsureConfid():"",
	    Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getInformingMechanism())?accBodyManage.getInformingMechanism():"",
        Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefInforming())?accBodyManage.getQMRefInforming():"",

        //Process Requirements 36
		
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getApplicationProcess())?accBodyManage.getApplicationProcess():"",
        Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefApplication())?accBodyManage.getQMRefApplication():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getApplicationReview())?accBodyManage.getApplicationReview():"",
	    Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefReview())?accBodyManage.getQMRefReview():"",
	    Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getCertificationCycle())?accBodyManage.getCertificationCycle():"",
	    Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefCertiCycle())?accBodyManage.getQMRefCertiCycle():"",
        Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getAuditTime())?accBodyManage.getAuditTime():"",	
        Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefAuditTime())?accBodyManage.getQMRefAuditTime():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getSamplingProgram())?accBodyManage.getSamplingProgram():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefSampling())?accBodyManage.getQMRefSampling():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getAuditPlanning())?accBodyManage.getAuditPlanning():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefPlanning())?accBodyManage.getQMRefPlanning():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getAuditTeam())?accBodyManage.getAuditTeam():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefAuditTeam())?accBodyManage.getQMRefAuditTeam():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getOnSiteAudit())?accBodyManage.getOnSiteAudit():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefonSiteAudit())?accBodyManage.getQMRefonSiteAudit():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getAuditReport())?accBodyManage.getAuditReport():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefAuditReport())?accBodyManage.getQMRefAuditReport():"",
	    Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getCorrectiveActions())?accBodyManage.getCorrectiveActions():"",
        Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefCorrective())?accBodyManage.getQMRefCorrective():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getReviewPriorDecision())?accBodyManage.getReviewPriorDecision():"",
        Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefReviewPrior())?accBodyManage.getQMRefReviewPrior():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getTransferCertification())?accBodyManage.getTransferCertification():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefTransfer())?accBodyManage.getQMRefTransfer():"",	
        Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getSuspensionPolicies())?accBodyManage.getSuspensionPolicies():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefSuspension())?accBodyManage.getQMRefSuspension():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getSuspensionProcedure())?accBodyManage.getSuspensionProcedure():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefSuspensionProc())?accBodyManage.getQMRefSuspensionProc():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getDecisionOnAppeals())?accBodyManage.getDecisionOnAppeals():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefDecision())?accBodyManage.getQMRefDecision():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getHandlingComplaints())?accBodyManage.getHandlingComplaints():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefComplaints())?accBodyManage.getQMRefComplaints():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getRecordRetentionPolicy())?accBodyManage.getRecordRetentionPolicy():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefRetentionPolicy())?accBodyManage.getQMRefRetentionPolicy():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getRecordRetentionProc())?accBodyManage.getRecordRetentionProc():"",
	    Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefRetentionProc())?accBodyManage.getQMRefRetentionProc():"",
	    		
	    //Certification Process 34
	   

        Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getManageSysPolicies())?accBodyManage.getManageSysPolicies():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefPolicies())?accBodyManage.getQMRefPolicies():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getManageSysObjective())?accBodyManage.getManageSysObjective():"",
	    Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefObjective())?accBodyManage.getQMRefObjective():"",
        Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getManageSysManual())?accBodyManage.getManageSysManual():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefManual())?accBodyManage.getQMRefManual():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getDocControlProcedure())?accBodyManage.getDocControlProcedure():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefDocControl())?accBodyManage.getQMRefDocControl():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getRecControlProc())?accBodyManage.getRecControlProc():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefRecControl())?accBodyManage.getQMRefRecControl():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getManagementReview())?accBodyManage.getManagementReview():"",
        Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefManagementRev())?accBodyManage.getQMRefManagementRev():"",
	    Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getInternalAudits())?accBodyManage.getInternalAudits():"",
	    Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefInternal())?accBodyManage.getQMRefInternal():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getIdentificationProc())?accBodyManage.getIdentificationProc():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefIdentification())?accBodyManage.getQMRefIdentification():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMSScopeB())?accBodyManage.getQMSScopeB():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefQMSScopeB())?accBodyManage.getQMRefQMSScopeB():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getDesignDevB())?accBodyManage.getDesignDevB():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefDesignB())?accBodyManage.getQMRefDesignB():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getInterestedPartyNeedsB())?accBodyManage.getInterestedPartyNeedsB():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefInterestedB())?accBodyManage.getQMRefInterestedB():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getManagementReviewB())?accBodyManage.getManagementReviewB():"",
		Validator.isNotNull(accBodyManage)&&Validator.isNotNull(accBodyManage.getQMRefmanagementReviewB())?accBodyManage.getQMRefmanagementReviewB():"",

	
				
		//form 6 end
		
		//form 7 start
				
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
		String evidenceOfAcc="";
		
		
		
		
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			try {
				fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
				fileName = fileEntry.getFileName();
				title=fileEntry.getTitle();
			} catch (Exception e) {}
			if(title.equals("Proof of legal status/identity of the Certification Body (CLAUSE 5.1.1)")) {
				proofOfLegal = fileName;
			}else if (title.equals("Copy generic template of organization legally enforceable client agreement for providing certification services. See Question 24. In Section B (CLAUSE 5.1.2)")) {
				genericCertificate = fileName;
			}else if(title.equals("Risk analysis related to potential conflicts of interest and threats to impartiality (CLAUSE 5.2.3)")) {
				authorizedPolicy=fileName;
			}else if(title.equals("An authorized copy of the management system manual and/or associated documents that outline compliance to the requirements of ISO/IEC 17021-1 and all other applicable standards. See Question 24. In Section B (CLAUSE 10.2.2)")) {
				policyProcedure=fileName;
			}else if(title.equals("Evidence of qualifications competence and industry scopes for all auditors/technical experts utilized by the organization to conduct certification audits (CLAUSE 7.1.3)")) {
				policyPotential=fileName;
			}else if(title.equals("Copies of certificates of qualification of the head and deputy head of the Certification Body as well as any other person(s) with signatory authority (include specimen signatures) (CLAUSE 6.1.1)")) {
				authorizedCopy=fileName;
			}else if(title.equals("Evidence of adequate provisions to cover liabilities arising from the operations of the organization e.g. insurance (CLAUSE 5.3)")) {
				evidenceQualification=fileName;
			}else if(title.equals("Sample of (blank) certification documentation (CLAUSE 8.2)")) {
				certificateOfQualification=fileName;
			}else if(title.equals("Evidence of accreditation received from any other accreditation body if applicable")) {
				evidenceOfAdequate=fileName;
			}else if(title.equals("Documentation outlining organizational structure including relationship to other parts within the same legal entity")) {
				sampleOfBlank=fileName;
			}else if(title.equals("List of all current audit clients under the proposed accreditation scope indicating")) {
				evidenceOfAcc=fileName;
			}
			
		}
		
		pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
			"[$LegalIdentity$]","[$OrganizationLegally$]","[$ConflictsRisk$]","[$associatedCopy$]","[$competenceEvi$]","[$qualificationDeputy$]","[$LiabilitiesArising$]","[$documentationBlank$]","[$accreditationREceived$]","[$relationshipParts$]","[$clientsScope$]",
			
			},
			new String[] {
					proofOfLegal, genericCertificate,authorizedPolicy,policyProcedure,policyPotential,authorizedCopy,evidenceQualification,certificateOfQualification,
					evidenceOfAdequate,sampleOfBlank,evidenceOfAcc,
				});
		}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] { "[$PayMethodOt$]" },
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




