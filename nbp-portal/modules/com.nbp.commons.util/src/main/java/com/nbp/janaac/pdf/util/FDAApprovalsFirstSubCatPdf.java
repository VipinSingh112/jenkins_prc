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
import com.nbp.janaac.application.form.service.model.AccCerBodyManageReq;
import com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel;
import com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq;
import com.nbp.janaac.application.form.service.model.AccThirdPartyAppliInfo;
import com.nbp.janaac.application.form.service.model.AccThirdPartyScope;
import com.nbp.janaac.application.form.service.model.AddFdaAppliInfo;
import com.nbp.janaac.application.form.service.model.AddFdaPersonnelFirst;
import com.nbp.janaac.application.form.service.model.AddFdaPersonnelFour;
import com.nbp.janaac.application.form.service.model.AddFdaPersonnelSecond;
import com.nbp.janaac.application.form.service.model.AddFdaPersonnelThird;
import com.nbp.janaac.application.form.service.model.AddFdaScopeClient;
import com.nbp.janaac.application.form.service.model.JanaacApplication;
import com.nbp.janaac.application.form.service.model.JanaacApplicationPayment;
import com.nbp.janaac.application.form.service.service.AccCerBodyGeneralLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccCerBodyInfoLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccCerBodyManageReqLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccCerBodyPersonnelLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccInsBodiesOtherReqLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccThirdPartyAppliInfoLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccThirdPartyScopeLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddFdaAppliInfoLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddFdaPersonnelFirstLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddFdaPersonnelFourLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddFdaPersonnelSecondLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddFdaPersonnelThirdLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddFdaScopeClientLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.JanaacApplicationLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.JanaacApplicationPaymentLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class FDAApprovalsFirstSubCatPdf {
	public static String replaceSignatureForJanaac(long janaacApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Siganture of Authorized Personnel");
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
				"Company Seal FDA");
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
				"Applicant Other Requirements Signature");
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

	
public static String janaacFdaFirstCatPdf(long janaacApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		JanaacApplication janaacApplication=null;
		
		AccThirdPartyAppliInfo application=null;
	  List<AddFdaAppliInfo> fdaAppliInfo = null;
	  
		AccCerBodyGeneral accCerGeneral=null;
		
		AccThirdPartyScope accThirdParty=null;
		
	List<AddFdaScopeClient> fdaScopeClient = null;
	
	  AccCerBodyPersonnel accCerPersonnel=null;
	  
	List<AddFdaPersonnelFirst> fdaPersonnelFirst = null;
	List<AddFdaPersonnelSecond>	fdaPersonnelSecond = null;	
	List<AddFdaPersonnelThird> fdaPersonnelThird = null;
	List<AddFdaPersonnelFour> fdaPersonnelFour = null;
	
	AccCerBodyInfo accCerInfo=null;
	AccCerBodyManageReq accCerBodyManage=null;
	
	AccInsBodiesOtherReq accInsBodies=null;
	JanaacApplicationPayment payment=null;

		
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		
		
		 //Signatures 
		String signatureForAuthorizedPersonnel = null;
		String companySealFDA=null;
		String signatureOtherRequirement=null;
		 
		
	
		try {
			janaacApplication=JanaacApplicationLocalServiceUtil.getJanaacApplication(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			application=AccThirdPartyAppliInfoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			fdaAppliInfo=AddFdaAppliInfoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			accCerGeneral=AccCerBodyGeneralLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			accThirdParty=AccThirdPartyScopeLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			fdaScopeClient=AddFdaScopeClientLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			accCerPersonnel=AccCerBodyPersonnelLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			fdaPersonnelFirst=AddFdaPersonnelFirstLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			fdaPersonnelSecond=AddFdaPersonnelSecondLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			fdaPersonnelThird=AddFdaPersonnelThirdLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			fdaPersonnelFour=AddFdaPersonnelFourLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			accCerInfo=AccCerBodyInfoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			accCerBodyManage=AccCerBodyManageReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
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
			  signatureForAuthorizedPersonnel =replaceSignatureForJanaac(janaacApplication.getJanaacApplicationId(), "Siganture of Authorized Personnel", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}
		  try { 
			  companySealFDA =replaceCompanySealForJanaac(janaacApplication.getJanaacApplicationId(), "Company Seal FDA", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}
		  try { 
			  signatureOtherRequirement =replaceSignOtherForJanaac(janaacApplication.getJanaacApplicationId(), "Applicant Other Requirements Signature", themeDisplay.getScopeGroupId(),
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
							"fda-tpp-accreditation-of-3rd-party-certification-bodies");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = 
					StringUtil.replace(pdfTemplate, 
			new String[] {
					
			//first form start
					
			//Application Information 2
					
			"[$legalApplicantName$]","[$AddressLegal$]",
			
			//Contact Information 7
			
			"[$TelenoCon$]","[$FaxOCon$]","[$webCon$]","[$certificatesCon$]","[$AccrediBodCon$]","[$personCon$]","[$emailCon$]",
			
			//add more first 5
			
			"[$NameTech1$]","[$EMailTech1$]",
			"[$NameTech2$]","[$EMailTech2$]",
			"[$NameTech3$]","[$EMailTech3$]",
			"[$NameTech4$]","[$EMailTech4$]",
			"[$NameTech5$]","[$EMailTech5$]",
			
			//other remaining  12
			
			"[$ConNamep$]","[$ConEmailPer$]","[$FinancialManName$]",
			"[$FinancialManEmail$]","[$RequesrtApporiate$]","[$AccreditationBeing$]",
			"[$OtherPleaseSpecify$]","[$supplementaryCer$]","[$PleaseSpecify$]",
			"[$NameAuthorized$]","[$PositionAck$]","[$dateAck$]",
		
			
			//signature 1
			
			"[$SignAuthorized$]",
			
			//seal 1
			
			"[$CompanySealSign$]",

			//form 1 complete
			
			//form 2 start  3
			
			"[$LegalEntityBody$]","[$DescribeLegalStatus$]","[$OutlineSource$]",
			
			//form 2 complete
			
			//form 3 start 34
			
			"[$PreventiveControl$]","[$ProductsFood$]","[$Regulations$]",
			"[$PreventiveAnimalFoods$]","[$AnimalFoods$]","[$RegulationsAnimalFoods$]",
			"[$AcidifiedFood$]","[$AcidifiedProcess$]","[$RegulationsAcidified$]",
			
			"[$LowAcidFoods$]","[$FoodLowAcid$]","[$RegulationLowAcids$]",
			"[$HazardAnalysis$]","[$ProductsAnalysis$]","[$RegulationsAnalysis$]",
			"[$SeafoodHazard$]","[$ProductsHazard$]","[$RegulationsHazard$]",
			
			"[$Shelleggs$]","[$ProductsShelleggs$]","[$RegulationsShelleggs$]",
			"[$ProduceSafety$]","[$ProductsProcess$]","[$RegulationsSafety$]",
			"[$MedicatedFeed$]","[$MedicatedFoodPro$]","[$MedicatedFdaReg$]",
			
			"[$SupplementsDietary$]","[$SupplementsFood$]","[$SupplementsRegulation$]",
			"[$Other$]","[$FoodOther$]","[$FdaRegOther$]","[$PleaseSpecifyFood$]",
			
			
			// add more first  5
			
			
			"[$ClientOrgani1$]","[$FoodProducts1$]","[$FdaRegulation1$]","[$DateGranted1$]",
			"[$ClientOrgani2$]","[$FoodProducts2$]","[$FdaRegulation2$]","[$DateGranted2$]",
			"[$ClientOrgani3$]","[$FoodProducts3$]","[$FdaRegulation3$]","[$DateGranted3$]",
			"[$ClientOrgani4$]","[$FoodProducts4$]","[$FdaRegulation4$]","[$DateGranted4$]",
			"[$ClientOrgani5$]","[$FoodProducts5$]","[$FdaRegulation5$]","[$DateGranted5$]",
			
			
			//other remaining  11
			
			"[$IndicateInterested$]","[$CertificationEntities$]","[$BrieflyDes$]",
			"[$certificatesEstab$]","[$DescriptionOrg$]","[$OrganizationProvided$]",
			"[$ServiceCertificate$]","[$AccreditationAccredited$]","[$Recentname$]","[$ExpiryDate$]","[$ScopeBody$]",
			
			//form 3 complete
			
			//form 4 start
			
			//FIRST 3
			"[$StaffSize$]","[$auditorsNum$]","[$contractedNum$]",
			
			//FIRST ADD MORE   5	
			
			"[$StaffNameMember1$]","[$TileJob1$]","[$ResponMajor1$]","[$SpeciFunctions1$]",
			"[$StaffNameMember2$]","[$TileJob2$]","[$ResponMajor2$]","[$SpeciFunctions2$]",
			"[$StaffNameMember3$]","[$TileJob3$]","[$ResponMajor3$]","[$SpeciFunctions3$]",
			"[$StaffNameMember4$]","[$TileJob4$]","[$ResponMajor4$]","[$SpeciFunctions4$]",
			"[$StaffNameMember5$]","[$TileJob5$]","[$ResponMajor5$]","[$SpeciFunctions5$]",
			
			
			//SECOND ADD MORE 5
			"[$NameIndus1$]","[$RoleClass1$]","[$CertiStandFda1$]",
			"[$NameIndus2$]","[$RoleClass2$]","[$CertiStandFda2$]",
			"[$NameIndus3$]","[$RoleClass3$]","[$CertiStandFda3$]",
			"[$NameIndus4$]","[$RoleClass4$]","[$CertiStandFda4$]",
			"[$NameIndus5$]","[$RoleClass5$]","[$CertiStandFda5$]",
			
			
			//OTHER 1
			
			"[$OutsourceCertification$]",
			
			//THIRD ADD MORE 5
			
			"[$OutActivityTable1$]","[$SupplierProvider1$]",
			"[$OutActivityTable2$]","[$SupplierProvider2$]",
			"[$OutActivityTable3$]","[$SupplierProvider3$]",
			"[$OutActivityTable4$]","[$SupplierProvider4$]",
			"[$OutActivityTable5$]","[$SupplierProvider5$]",
			
			//fourth add more 5
			
			"[$NumberOffice1$]","[$Addreslocation1$]","[$CertiLocationPerformed1$]","[$ContactDetails1$]",
			"[$NumberOffice2$]","[$Addreslocation2$]","[$CertiLocationPerformed2$]","[$ContactDetails2$]",
			"[$NumberOffice3$]","[$Addreslocation3$]","[$CertiLocationPerformed3$]","[$ContactDetails3$]",
			"[$NumberOffice4$]","[$Addreslocation4$]","[$CertiLocationPerformed4$]","[$ContactDetails4$]",
			"[$NumberOffice5$]","[$Addreslocation5$]","[$CertiLocationPerformed5$]","[$ContactDetails5$]",
			
			
			//other 1
			"[$arrangementsDescribe$]",
			
			//form 4 complete
			
			//form 5 start
			
			"[$MechanismsDescribe$]",
			
			//form 5 complete
   		 
		     //form 6 start  59
	 
				
			"[$accrordanceEmployed$]",                          //1
			
			//Impartiality/Confidentiality      8
			"[$impartialityPolicy$]","[$QualityManual$]",
			
			"[$Impartialitymec$]","[$QualityMechanism$]",
			
			"[$riskAssessment$]","[$Qualityrisk$]",
			
			"[$ConfidentialityAgreement$]","[$QualityConfidentiality$]",
			
			//Organizational Structure    4
			"[$structureDuties$]","[$structureDutiesRelevant$]",
			
			"[$termsReference$]","[$termsRefOther$]",
			
			"[$termsReferenceProcess$]","[$termsRefOtherQual$]",
		
			//Resources   16
			
			"[$procedureManagement$]","[$procedureManagementRelevant$]",
			
			"[$CriteriaReq$]","[$CriteriaReqManual$]",
			
			"[$ProcedureInitial$]","[$ProcedureInitialReference$]",
			
			"[$ProcedureAudit$]","[$ProcedureAuditManual$]",
			
			"[$MonitoringCompetence$]","[$MonitoringOther$]",
			
			"[$DescriptionProcess$]","[$DescriptionRelevant$]",
			
			"[$Contractual$]","[$ContractualManual$]",
			
			"[$arrangementsEntities$]","[$arrangementsEntitiesManual$]",
			
			
			
			 
			//Information  24
			"[$Auditprocesses$]","[$AuditprocessesManual$]",
			
			"[$ProcessesGranting$]","[$ProcessesGrantingManual$]",
			
			"[$ManagementSystems$]","[$ManagementSystemsRelevant$]",
			
			"[$CertificationBody$]","[$CertificationBodyManual$]",
			
			"[$HandlingRequests$]","[$HandlingRequestsManual$]",
			
			"[$ImpartialityPolicyInfor$]","[$ImpartialityPolicyManual$]",
			
            "[$DescriptionDuties$]","[$duties$]",
			
			"[$Descriptionfinancial$]","[$QualityDescriptionfinancial$]",
			
			"[$Provisionssupplying$]","[$ProvisionssupplyingManual$]",
			
			"[$Certifiedproducts$]","[$productsRelevant$]",
			
			"[$CertificationDocuments$]","[$CertificationDocumentsManual$]",
			
			"[$dutiesCertifiedClient$]","[$CertifiedClient$]",
			
			
			
			//Certification Process 34
			"[$ApplicationProcess$]","[$ApplicationProcessRelevant$]",
			
			"[$ProgrammeEvaluation$]","[$ProgrammeEvaluationManual$]",
			
			"[$ProceduresDetermining$]","[$ProceduresManual$]",
			
			"[$SamplingProgramme$]","[$SamplingProgrammeManual$]",
			
		    "[$selectingAppointing$]","[$selectingAppointingManual$]",
			
			"[$ConductingAudits$]","[$QualityConductingAudits$]",
			
			"[$AuditReport$]","[$AuditReportManual$]",
			
			"[$ReviewAudit$]","[$ReviewAuditManual$]",
			
			"[$transferCertification$]","[$transferCertificationQuality$]",
			
			"[$SuspensionWithdrawal$]","[$SuspensionWithdrawalManual$]",
			
			"[$Proceduresuspension$]","[$QualityProceduresuspension$]",
			
			"[$DocumentationCertification$]","[$QualityDocumentationCertification$]",
			
			
			"[$CertifiedDirectory$]","[$CertifiedDirectoryManual$]",
			
			"[$EvaluateReceive$]","[$EvaluateReceiveManual$]",
				
            "[$ProcedureComplaints$]","[$ProcedureComplaintsRele$]",
			
			"[$RetentionRecord$]","[$RetentionRecordManual$]",
			
			"[$RetentionRecordPro$]","[$RetentionRecordManualPro$]",
			
			//Management System  18
			
			"[$ManagementSystem$]","[$ManagementSystemPolicies$]",
			
			"[$ObjectivesSystem$]","[$QualityObjectivesSystem$]",
			
			"[$EquivalentDoc$]","[$QualityMEquivalentDoc$]",
			
            "[$ControlDocument$]","[$QuControlDocument$]",
			
			"[$Recordcontrol$]","[$RecordcontrolManual$]",
			
			"[$ManagementReview$]","[$ManagementReviewOther$]",
			
			"[$InternalAudits$]","[$InternalAuditsOther$]",
			
			"[$Identificationcorrective$]","[$IdentificationcorrectiveOther$]",
			
			"[$ActionsPreventive$]","[$ActionsPreventiveOther$]",
			
			//form 6 complete
			
			//form 7 start
			
            "[$Applicationfees$]","[$PaymentState$]","[$RepresentativeName$]",
			
			"[$PositionRepresentative$]","[$AppDate$]","[$RepresentativeSignature$]"
			
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
            (fdaAppliInfo!=null)&&(fdaAppliInfo.size()>0)?fdaAppliInfo.get(0).getName():"",
		    (fdaAppliInfo!=null)&&(fdaAppliInfo.size()>0)?fdaAppliInfo.get(0).getEmail():"",
		    
					    				
			(fdaAppliInfo!=null)&&(fdaAppliInfo.size()>1)?fdaAppliInfo.get(1).getName():"",
			(fdaAppliInfo!=null)&&(fdaAppliInfo.size()>1)?fdaAppliInfo.get(1).getEmail():"",
			
								
			(fdaAppliInfo!=null)&&(fdaAppliInfo.size()>2)?fdaAppliInfo.get(2).getName():"",
			(fdaAppliInfo!=null)&&(fdaAppliInfo.size()>2)?fdaAppliInfo.get(2).getEmail():"",
			
			
			(fdaAppliInfo!=null)&&(fdaAppliInfo.size()>3)?fdaAppliInfo.get(3).getName():"",
			(fdaAppliInfo!=null)&&(fdaAppliInfo.size()>3)?fdaAppliInfo.get(3).getEmail():"",
			

			(fdaAppliInfo!=null)&&(fdaAppliInfo.size()>4)?fdaAppliInfo.get(4).getName():"",
			(fdaAppliInfo!=null)&&(fdaAppliInfo.size()>4)?fdaAppliInfo.get(4).getEmail():"",
					
					
			//other remaining  12
					
					
			Validator.isNotNull(application)&&Validator.isNotNull(application.getPersonnelContactName())?application.getPersonnelContactName():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getPersonnelContactEmail())?application.getPersonnelContactEmail():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getPersonnelFMName())?application.getPersonnelFMName():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getPersonnelFMEmail())?application.getPersonnelFMEmail():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getAccreditationRequest())?application.getAccreditationRequest():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getAccFdaScheme())?application.getAccFdaScheme():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getSpecifyOther())?application.getSpecifyOther():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getSupplementaryCertificate())?application.getSupplementaryCertificate():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getSupplementaryOther())?application.getSupplementaryOther():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getAuthorizedPersonnelName())?application.getAuthorizedPersonnelName():"",
			Validator.isNotNull(application)&&Validator.isNotNull(application.getAuthorizedPersonnelPos())?application.getAuthorizedPersonnelPos():"",
		    Validator.isNotNull(application)&&Validator.isNotNull(application.getAuthorizedPersonnelDate())?dateFormat.format(application.getAuthorizedPersonnelDate()):"",
			

			//signature Detail 1
		   signatureForAuthorizedPersonnel,
		    
		    
		    //company seal 1
		     companySealFDA,
		     
		     //form 1 complete
		     
		     //form 2 start
		     
            Validator.isNotNull(accCerGeneral)&&Validator.isNotNull(accCerGeneral.getCerLegalEntity())?accCerGeneral.getCerLegalEntity():"",
 			Validator.isNotNull(accCerGeneral)&&Validator.isNotNull(accCerGeneral.getCerLegalStatusEntity())?accCerGeneral.getCerLegalStatusEntity():"",
 			Validator.isNotNull(accCerGeneral)&&Validator.isNotNull(accCerGeneral.getCerMajorIncomeSources())?accCerGeneral.getCerMajorIncomeSources():"",
 			
 		    //form 2 complete
 					
 			//form 3 start 34

            Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getAccreditationCategory())?accThirdParty.getAccreditationCategory():"",
 			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getFoodProduct1())?accThirdParty.getFoodProduct1():"",
 			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getFoodRegulation1())?accThirdParty.getFoodRegulation1():"",
 					
            Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getAccreditationCategory())?accThirdParty.getAccreditationCategory():"",
 			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getFoodProduct2())?accThirdParty.getFoodProduct2():"",
 			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getFoodRegulation2())?accThirdParty.getFoodRegulation2():"",
 					
	        Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getAccreditationCategory())?accThirdParty.getAccreditationCategory():"",
			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getFoodProduct3())?accThirdParty.getFoodProduct3():"",
			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getFoodRegulation3())?accThirdParty.getFoodRegulation3():"",
           
			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getAccreditationCategory())?accThirdParty.getAccreditationCategory():"",
 			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getFoodProduct4())?accThirdParty.getFoodProduct4():"",
 			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getFoodRegulation4())?accThirdParty.getFoodRegulation4():"",
 					
		    Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getAccreditationCategory())?accThirdParty.getAccreditationCategory():"",
			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getFoodProduct5())?accThirdParty.getFoodProduct5():"",
			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getFoodRegulation5())?accThirdParty.getFoodRegulation5():"",
					
            Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getAccreditationCategory())?accThirdParty.getAccreditationCategory():"",
 			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getFoodProduct6())?accThirdParty.getFoodProduct6():"",
 			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getFoodRegulation6())?accThirdParty.getFoodRegulation6():"",
           
 			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getAccreditationCategory())?accThirdParty.getAccreditationCategory():"",
 			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getFoodProduct7())?accThirdParty.getFoodProduct7():"",
 			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getFoodRegulation7())?accThirdParty.getFoodRegulation7():"",
 					
            Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getAccreditationCategory())?accThirdParty.getAccreditationCategory():"",
 			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getFoodProduct8())?accThirdParty.getFoodProduct8():"",
 			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getFoodRegulation8())?accThirdParty.getFoodRegulation8():"",
 					
            Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getAccreditationCategory())?accThirdParty.getAccreditationCategory():"",
 			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getFoodProduct9())?accThirdParty.getFoodProduct9():"",
 			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getFoodRegulation9())?accThirdParty.getFoodRegulation9():"",

	        Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getAccreditationCategory())?accThirdParty.getAccreditationCategory():"",
			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getFoodProduct10())?accThirdParty.getFoodProduct10():"",
		    Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getFoodRegulation10())?accThirdParty.getFoodRegulation10():"",
		    		
 			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getAccreditationCategory())?accThirdParty.getAccreditationCategory():"",
			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getAccCategoryOther())?accThirdParty.getAccCategoryOther():"",
			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getFoodProduct11())?accThirdParty.getFoodProduct11():"",
		    Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getFoodRegulation11())?accThirdParty.getFoodRegulation11():"",

		// add more first 5
		    
            (fdaScopeClient!=null)&&(fdaScopeClient.size()>0)?fdaScopeClient.get(0).getClientOrganization():"",
		    (fdaScopeClient!=null)&&(fdaScopeClient.size()>0)?fdaScopeClient.get(0).getFoodProducts():"",
		    (fdaScopeClient!=null)&&(fdaScopeClient.size()>0)?fdaScopeClient.get(0).getFdaRegulations():"",
		    (fdaScopeClient!=null)&&(fdaScopeClient.size()>0)?dateFormat.format(fdaScopeClient.get(0).getDateGranted()):"",
		    				  
		    
					    				
			(fdaScopeClient!=null)&&(fdaScopeClient.size()>1)?fdaScopeClient.get(1).getClientOrganization():"",
			(fdaScopeClient!=null)&&(fdaScopeClient.size()>1)?fdaScopeClient.get(1).getFoodProducts():"",
			(fdaScopeClient!=null)&&(fdaScopeClient.size()>1)?fdaScopeClient.get(1).getFdaRegulations():"",
		    (fdaScopeClient!=null)&&(fdaScopeClient.size()>1)?dateFormat.format(fdaScopeClient.get(1).getDateGranted()):"",
							
			
								
			(fdaScopeClient!=null)&&(fdaScopeClient.size()>2)?fdaScopeClient.get(2).getClientOrganization():"",
			(fdaScopeClient!=null)&&(fdaScopeClient.size()>2)?fdaScopeClient.get(2).getFoodProducts():"",
			(fdaScopeClient!=null)&&(fdaScopeClient.size()>2)?fdaScopeClient.get(2).getFdaRegulations():"",
		    (fdaScopeClient!=null)&&(fdaScopeClient.size()>2)?dateFormat.format(fdaScopeClient.get(2).getDateGranted()):"",
							
			
			
			(fdaScopeClient!=null)&&(fdaScopeClient.size()>3)?fdaScopeClient.get(3).getClientOrganization():"",
			(fdaScopeClient!=null)&&(fdaScopeClient.size()>3)?fdaScopeClient.get(3).getFoodProducts():"",
			(fdaScopeClient!=null)&&(fdaScopeClient.size()>3)?fdaScopeClient.get(3).getFdaRegulations():"",
		    (fdaScopeClient!=null)&&(fdaScopeClient.size()>3)?dateFormat.format(fdaScopeClient.get(3).getDateGranted()):"",
							


			(fdaScopeClient!=null)&&(fdaScopeClient.size()>4)?fdaScopeClient.get(4).getClientOrganization():"",
			(fdaScopeClient!=null)&&(fdaScopeClient.size()>4)?fdaScopeClient.get(4).getFoodProducts():"",
			(fdaScopeClient!=null)&&(fdaScopeClient.size()>4)?fdaScopeClient.get(4).getFdaRegulations():"",
			(fdaScopeClient!=null)&&(fdaScopeClient.size()>4)?dateFormat.format(fdaScopeClient.get(4).getDateGranted()):"",
					
		//other remaining  11
					
					
	        Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getCerIntrestedParties())?accThirdParty.getCerIntrestedParties():"",
            Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getOtherServices())?accThirdParty.getOtherServices():"",
 			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getOtherServicesDescribe())?accThirdParty.getOtherServicesDescribe():"",
 			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getEstablishedRelation())?accThirdParty.getEstablishedRelation():"",
	        Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getEstablishedRelDesc())?accThirdParty.getEstablishedRelDesc():"",
			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getClientService())?accThirdParty.getClientService():"",
		    Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getCertificationCerBody())?accThirdParty.getCertificationCerBody():"", 		
 			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getOrgAccredited())?accThirdParty.getOrgAccredited():"",
			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getResponsibleBody())?accThirdParty.getResponsibleBody():"",
			Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getAccExpDate())?dateFormat.format(accThirdParty.getAccExpDate()):"",
		    Validator.isNotNull(accThirdParty)&&Validator.isNotNull(accThirdParty.getCertBodyScope())?accThirdParty.getCertBodyScope():"",


			//form 3 complete
			
			//form 4 start
		    		
		   //FIRST 3
			
            Validator.isNotNull(accCerPersonnel)&&Validator.isNotNull(accCerPersonnel.getInternalStaffSize())?accCerPersonnel.getInternalStaffSize():"",
            Validator.isNotNull(accCerPersonnel)&&Validator.isNotNull(accCerPersonnel.getAuditorsNum())?accCerPersonnel.getAuditorsNum():"",
 			Validator.isNotNull(accCerPersonnel)&&Validator.isNotNull(accCerPersonnel.getContractedPerNum())?accCerPersonnel.getContractedPerNum():"",
 		
		
			//FIRST ADD MORE   5
 					
 					 
            (fdaPersonnelFirst!=null)&&(fdaPersonnelFirst.size()>0)?fdaPersonnelFirst.get(0).getNameOfStaff():"",
		    (fdaPersonnelFirst!=null)&&(fdaPersonnelFirst.size()>0)?fdaPersonnelFirst.get(0).getJobTitle():"",
		    (fdaPersonnelFirst!=null)&&(fdaPersonnelFirst.size()>0)?fdaPersonnelFirst.get(0).getMajorResponsibilites():"",
		    (fdaPersonnelFirst!=null)&&(fdaPersonnelFirst.size()>0)?fdaPersonnelFirst.get(0).getSpecificFunctions():"",
		    				  
					    				
			(fdaPersonnelFirst!=null)&&(fdaPersonnelFirst.size()>1)?fdaPersonnelFirst.get(1).getNameOfStaff():"",
			(fdaPersonnelFirst!=null)&&(fdaPersonnelFirst.size()>1)?fdaPersonnelFirst.get(1).getJobTitle():"",
			(fdaPersonnelFirst!=null)&&(fdaPersonnelFirst.size()>1)?fdaPersonnelFirst.get(1).getMajorResponsibilites():"",
		    (fdaPersonnelFirst!=null)&&(fdaPersonnelFirst.size()>1)?fdaPersonnelFirst.get(1).getSpecificFunctions():"",
							
			
								
			(fdaPersonnelFirst!=null)&&(fdaPersonnelFirst.size()>2)?fdaPersonnelFirst.get(2).getNameOfStaff():"",
			(fdaPersonnelFirst!=null)&&(fdaPersonnelFirst.size()>2)?fdaPersonnelFirst.get(2).getJobTitle():"",
			(fdaPersonnelFirst!=null)&&(fdaPersonnelFirst.size()>2)?fdaPersonnelFirst.get(2).getMajorResponsibilites():"",
		    (fdaPersonnelFirst!=null)&&(fdaPersonnelFirst.size()>2)?fdaPersonnelFirst.get(2).getSpecificFunctions():"",
							
			
			
			(fdaPersonnelFirst!=null)&&(fdaPersonnelFirst.size()>3)?fdaPersonnelFirst.get(3).getNameOfStaff():"",
			(fdaPersonnelFirst!=null)&&(fdaPersonnelFirst.size()>3)?fdaPersonnelFirst.get(3).getJobTitle():"",
			(fdaPersonnelFirst!=null)&&(fdaPersonnelFirst.size()>3)?fdaPersonnelFirst.get(3).getMajorResponsibilites():"",
		    (fdaPersonnelFirst!=null)&&(fdaPersonnelFirst.size()>3)?fdaPersonnelFirst.get(3).getSpecificFunctions():"",
							


			(fdaPersonnelFirst!=null)&&(fdaPersonnelFirst.size()>4)?fdaPersonnelFirst.get(4).getNameOfStaff():"",
			(fdaPersonnelFirst!=null)&&(fdaPersonnelFirst.size()>4)?fdaPersonnelFirst.get(4).getJobTitle():"",
			(fdaPersonnelFirst!=null)&&(fdaPersonnelFirst.size()>4)?fdaPersonnelFirst.get(4).getMajorResponsibilites():"",
			(fdaPersonnelFirst!=null)&&(fdaPersonnelFirst.size()>4)?fdaPersonnelFirst.get(4).getSpecificFunctions():"",
		
							
          //SECOND ADD MORE 5

            (fdaPersonnelSecond!=null)&&(fdaPersonnelSecond.size()>0)?fdaPersonnelSecond.get(0).getName():"",
		    (fdaPersonnelSecond!=null)&&(fdaPersonnelSecond.size()>0)?fdaPersonnelSecond.get(0).getRole():"",
		    (fdaPersonnelSecond!=null)&&(fdaPersonnelSecond.size()>0)?fdaPersonnelSecond.get(0).getFdaRegulation():"",
		   
					    				
			(fdaPersonnelSecond!=null)&&(fdaPersonnelSecond.size()>1)?fdaPersonnelSecond.get(1).getName():"",
			(fdaPersonnelSecond!=null)&&(fdaPersonnelSecond.size()>1)?fdaPersonnelSecond.get(1).getRole():"",
			(fdaPersonnelSecond!=null)&&(fdaPersonnelSecond.size()>1)?fdaPersonnelSecond.get(1).getFdaRegulation():"",
		    
							
			(fdaPersonnelSecond!=null)&&(fdaPersonnelSecond.size()>2)?fdaPersonnelSecond.get(2).getName():"",
			(fdaPersonnelSecond!=null)&&(fdaPersonnelSecond.size()>2)?fdaPersonnelSecond.get(2).getRole():"",
			(fdaPersonnelSecond!=null)&&(fdaPersonnelSecond.size()>2)?fdaPersonnelSecond.get(2).getFdaRegulation():"",
		    
							
			(fdaPersonnelSecond!=null)&&(fdaPersonnelSecond.size()>3)?fdaPersonnelSecond.get(3).getName():"",
			(fdaPersonnelSecond!=null)&&(fdaPersonnelSecond.size()>3)?fdaPersonnelSecond.get(3).getRole():"",
			(fdaPersonnelSecond!=null)&&(fdaPersonnelSecond.size()>3)?fdaPersonnelSecond.get(3).getFdaRegulation():"",
		    
						
			(fdaPersonnelSecond!=null)&&(fdaPersonnelSecond.size()>4)?fdaPersonnelSecond.get(4).getName():"",
			(fdaPersonnelSecond!=null)&&(fdaPersonnelSecond.size()>4)?fdaPersonnelSecond.get(4).getRole():"",
			(fdaPersonnelSecond!=null)&&(fdaPersonnelSecond.size()>4)?fdaPersonnelSecond.get(4).getFdaRegulation():"",
					
					
		   //OTHER 1
					
	      Validator.isNotNull(accCerPersonnel)&&Validator.isNotNull(accCerPersonnel.getBodyOutsource())?accCerPersonnel.getBodyOutsource():"",
	    		  
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
					
	         //Fourth add more 5
					
					 
            (fdaPersonnelFour!=null)&&(fdaPersonnelFour.size()>0)?fdaPersonnelFour.get(0).getNumber():"",
		    (fdaPersonnelFour!=null)&&(fdaPersonnelFour.size()>0)?fdaPersonnelFour.get(0).getLocationAddress():"",
		    (fdaPersonnelFour!=null)&&(fdaPersonnelFour.size()>0)?fdaPersonnelFour.get(0).getCertificationActivities():"",
		    (fdaPersonnelFour!=null)&&(fdaPersonnelFour.size()>0)?fdaPersonnelFour.get(0).getContactDetails():"",
		    				  
					    				
			(fdaPersonnelFour!=null)&&(fdaPersonnelFour.size()>1)?fdaPersonnelFour.get(1).getNumber():"",
			(fdaPersonnelFour!=null)&&(fdaPersonnelFour.size()>1)?fdaPersonnelFour.get(1).getLocationAddress():"",
			(fdaPersonnelFour!=null)&&(fdaPersonnelFour.size()>1)?fdaPersonnelFour.get(1).getCertificationActivities():"",
		    (fdaPersonnelFour!=null)&&(fdaPersonnelFour.size()>1)?fdaPersonnelFour.get(1).getContactDetails():"",
							
			
								
			(fdaPersonnelFour!=null)&&(fdaPersonnelFour.size()>2)?fdaPersonnelFour.get(2).getNumber():"",
			(fdaPersonnelFour!=null)&&(fdaPersonnelFour.size()>2)?fdaPersonnelFour.get(2).getLocationAddress():"",
			(fdaPersonnelFour!=null)&&(fdaPersonnelFour.size()>2)?fdaPersonnelFour.get(2).getCertificationActivities():"",
		    (fdaPersonnelFour!=null)&&(fdaPersonnelFour.size()>2)?fdaPersonnelFour.get(2).getContactDetails():"",
							
			
			
			(fdaPersonnelFour!=null)&&(fdaPersonnelFour.size()>3)?fdaPersonnelFour.get(3).getNumber():"",
			(fdaPersonnelFour!=null)&&(fdaPersonnelFour.size()>3)?fdaPersonnelFour.get(3).getLocationAddress():"",
			(fdaPersonnelFour!=null)&&(fdaPersonnelFour.size()>3)?fdaPersonnelFour.get(3).getCertificationActivities():"",
		    (fdaPersonnelFour!=null)&&(fdaPersonnelFour.size()>3)?fdaPersonnelFour.get(3).getContactDetails():"",
							


			(fdaPersonnelFour!=null)&&(fdaPersonnelFour.size()>4)?fdaPersonnelFour.get(4).getNumber():"",
			(fdaPersonnelFour!=null)&&(fdaPersonnelFour.size()>4)?fdaPersonnelFour.get(4).getLocationAddress():"",
			(fdaPersonnelFour!=null)&&(fdaPersonnelFour.size()>4)?fdaPersonnelFour.get(4).getCertificationActivities():"",
			(fdaPersonnelFour!=null)&&(fdaPersonnelFour.size()>4)?fdaPersonnelFour.get(4).getContactDetails():"",
					
		//other 1
		
	     Validator.isNotNull(accCerPersonnel)&&Validator.isNotNull(accCerPersonnel.getDescSecurity())?accCerPersonnel.getDescSecurity():"",

        //form 4 complete
	    		 
	    //form 5 start
    
	     Validator.isNotNull(accCerInfo)&&Validator.isNotNull(accCerInfo.getDescribeMechanism())?accCerInfo.getDescribeMechanism():"",

		//form 5 complete
	    		 
	      //form 6 start
	    		 
        Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getOptionFollow())?accCerBodyManage.getOptionFollow():"",
		
        //Impartiality/Confidentiality      8
        Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getImpartialityPolicy())?accCerBodyManage.getImpartialityPolicy():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefImpartiality())?accCerBodyManage.getQMRefImpartiality():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getInterestedPartyNeedsB())?accCerBodyManage.getInterestedPartyNeedsB():"",
	    Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefInterestedB())?accCerBodyManage.getQMRefInterestedB():"",	
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getRiskAssessment())?accCerBodyManage.getRiskAssessment():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefRisk())?accCerBodyManage.getQMRefRisk():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getManagementReviewB())?accCerBodyManage.getManagementReviewB():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefmanagementReviewB())?accCerBodyManage.getQMRefmanagementReviewB():"",
				
	
        //Organizational Structure    6
				
        Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getOrgStructure())?accCerBodyManage.getOrgStructure():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefOrgStruct())?accCerBodyManage.getQMRefOrgStruct():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getTermsOfReference())?accCerBodyManage.getTermsOfReference():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefTerms())?accCerBodyManage.getQMRefTerms():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getProcessForControl())?accCerBodyManage.getProcessForControl():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefProcess())?accCerBodyManage.getQMRefProcess():"",
				
	        
        //Resources   16
				

        Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getCriteriaReq())?accCerBodyManage.getCriteriaReq():"",					
        Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefCriteria())?accCerBodyManage.getQMRefCriteria():"",
        Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getInitialCompetence())?accCerBodyManage.getInitialCompetence():"",
        Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefInitial())?accCerBodyManage.getQMRefInitial():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getSelectingTraining())?accCerBodyManage.getSelectingTraining():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefSelecting())?accCerBodyManage.getQMRefSelecting():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getMonitoringCompetence())?accCerBodyManage.getMonitoringCompetence():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefMonitoring())?accCerBodyManage.getQMRefMonitoring():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getWrittenAgreement())?accCerBodyManage.getWrittenAgreement():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefWritten())?accCerBodyManage.getQMRefWritten():"",
        Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getDescOfProcess())?accCerBodyManage.getDescOfProcess():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefDescProcess())?accCerBodyManage.getQMRefDescProcess():"",
	    Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getProcessForMonitor())?accCerBodyManage.getProcessForMonitor():"",
    	Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefMonitorProcess())?accCerBodyManage.getQMRefMonitorProcess():"",
    	Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getDesignDevB())?accCerBodyManage.getDesignDevB():"",
    	Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefDesignB())?accCerBodyManage.getQMRefDesignB():"",
    					
    			
		
		//Information  24
		
        Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getAuditProcess())?accCerBodyManage.getAuditProcess():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefAuditProcess())?accCerBodyManage.getQMRefAuditProcess():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getProcessGranting())?accCerBodyManage.getProcessGranting():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefGranting())?accCerBodyManage.getQMRefGranting():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getManagemntSys())?accCerBodyManage.getManagemntSys():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefManagemnt())?accCerBodyManage.getQMRefManagemnt():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getUseOfCertification())?accCerBodyManage.getUseOfCertification():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefUseOfCerti())?accCerBodyManage.getQMRefUseOfCerti():"",
        Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getHandlingReq())?accCerBodyManage.getHandlingReq():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefHandling())?accCerBodyManage.getQMRefHandling():"",
	    Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getImpartialityPolicies())?accCerBodyManage.getImpartialityPolicies():"",	
        Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefImpartPolicy())?accCerBodyManage.getQMRefImpartPolicy():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getProvisionInform())?accCerBodyManage.getProvisionInform():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefProvision())?accCerBodyManage.getQMRefProvision():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getCertificationDoc())?accCerBodyManage.getCertificationDoc():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefCertification())?accCerBodyManage.getQMRefCertification():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getRulesGoverning())?accCerBodyManage.getRulesGoverning():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefGoverning())?accCerBodyManage.getQMRefGoverning():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getEnforcableArrangements())?accCerBodyManage.getEnforcableArrangements():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefEnforcable())?accCerBodyManage.getQMRefEnforcable():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getEnsureConfidential())?accCerBodyManage.getEnsureConfidential():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefEnsureConfid())?accCerBodyManage.getQMRefEnsureConfid():"",
	    Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getInformingMechanism())?accCerBodyManage.getInformingMechanism():"",
        Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefInforming())?accCerBodyManage.getQMRefInforming():"",
        		
        		
		
	    //Certification Process 34
        		
        		
        Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getApplicationProcess())?accCerBodyManage.getApplicationProcess():"",
        Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefApplication())?accCerBodyManage.getQMRefApplication():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getApplicationReview())?accCerBodyManage.getApplicationReview():"",
	    Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefReview())?accCerBodyManage.getQMRefReview():"",
	    Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getCertificationCycle())?accCerBodyManage.getCertificationCycle():"",
	    Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefCertiCycle())?accCerBodyManage.getQMRefCertiCycle():"",
	    Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getAuditTime())?accCerBodyManage.getAuditTime():"",	
        Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefAuditTime())?accCerBodyManage.getQMRefAuditTime():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getSamplingProgram())?accCerBodyManage.getSamplingProgram():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefSampling())?accCerBodyManage.getQMRefSampling():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getAuditPlanning())?accCerBodyManage.getAuditPlanning():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefPlanning())?accCerBodyManage.getQMRefPlanning():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getAuditTeam())?accCerBodyManage.getAuditTeam():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefAuditTeam())?accCerBodyManage.getQMRefAuditTeam():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getOnSiteAudit())?accCerBodyManage.getOnSiteAudit():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefonSiteAudit())?accCerBodyManage.getQMRefonSiteAudit():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getAuditReport())?accCerBodyManage.getAuditReport():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefAuditReport())?accCerBodyManage.getQMRefAuditReport():"",
	    Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getCorrectiveActions())?accCerBodyManage.getCorrectiveActions():"",
        Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefCorrective())?accCerBodyManage.getQMRefCorrective():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getReviewPriorDecision())?accCerBodyManage.getReviewPriorDecision():"",
        Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefReviewPrior())?accCerBodyManage.getQMRefReviewPrior():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getTransferCertification())?accCerBodyManage.getTransferCertification():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefTransfer())?accCerBodyManage.getQMRefTransfer():"",	
        Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getSuspensionPolicies())?accCerBodyManage.getSuspensionPolicies():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefSuspension())?accCerBodyManage.getQMRefSuspension():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getSuspensionProcedure())?accCerBodyManage.getSuspensionProcedure():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefSuspensionProc())?accCerBodyManage.getQMRefSuspensionProc():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getDecisionOnAppeals())?accCerBodyManage.getDecisionOnAppeals():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefDecision())?accCerBodyManage.getQMRefDecision():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getHandlingComplaints())?accCerBodyManage.getHandlingComplaints():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefComplaints())?accCerBodyManage.getQMRefComplaints():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getRecordRetentionPolicy())?accCerBodyManage.getRecordRetentionPolicy():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefRetentionPolicy())?accCerBodyManage.getQMRefRetentionPolicy():"",
						

		//Management System  18
			
				
				
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getManageSysPolicies())?accCerBodyManage.getManageSysPolicies():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefPolicies())?accCerBodyManage.getQMRefPolicies():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getManageSysObjective())?accCerBodyManage.getManageSysObjective():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefObjective())?accCerBodyManage.getQMRefObjective():"",	
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getManageSysManual())?accCerBodyManage.getManageSysManual():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefManual())?accCerBodyManage.getQMRefManual():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getDocControlProcedure())?accCerBodyManage.getDocControlProcedure():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefDocControl())?accCerBodyManage.getQMRefDocControl():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getRecControlProc())?accCerBodyManage.getRecControlProc():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefRecControl())?accCerBodyManage.getQMRefRecControl():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getManagementReview())?accCerBodyManage.getManagementReview():"",
        Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefManagementRev())?accCerBodyManage.getQMRefManagementRev():"",
	    Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getInternalAudits())?accCerBodyManage.getInternalAudits():"",
	    Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefInternal())?accCerBodyManage.getQMRefInternal():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getIdentificationProc())?accCerBodyManage.getIdentificationProc():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefIdentification())?accCerBodyManage.getQMRefIdentification():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getRecordRetentionProc())?accCerBodyManage.getRecordRetentionProc():"",
		Validator.isNotNull(accCerBodyManage)&&Validator.isNotNull(accCerBodyManage.getQMRefRetentionProc())?accCerBodyManage.getQMRefRetentionProc():"",
								
				
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
		String documentationOutlining="";
		
		
		
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			try {
				fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
				fileName = fileEntry.getFileName();
				title=fileEntry.getTitle();
			} catch (Exception e) {}
			if(title.equals("Proof of legal status/identity of the Certification Body")) {
				proofOfLegal = fileName;
			}else if (title.equals("Copy/generic template of organizations legally enforceable client agreement for providing certification services")) {
				genericCertificate = fileName;
			}else if(title.equals("Authorized policy(ies) and agreements outlining the organizations understanding of commitment to and management of impartiality and confidentiality")) {
				authorizedPolicy=fileName;
			}else if(title.equals("Policies/procedures related to the use of license certificates and marks of conformity")) {
				policyProcedure=fileName;
			}else if(title.equals("Policies/procedures related to potential conflicts of interest and threats to impartiality")) {
				policyPotential=fileName;
			}else if(title.equals("An authorized copy of the management system manual and/or associated documents that outline compliance to all applicable requirements as indicated in 11.and 12. of Part A")) {
				authorizedCopy=fileName;
			}else if(title.equals("Evidence of qualifications and competence of all auditors and technical experts (both full time and contracted) that are engaged by the organization to conduct certification audits")) {
				evidenceQualification=fileName;
			}else if(title.equals("Copies of certificates of qualification of the head and deputy head of the Certification Body as well as any other person(s) with signatory authority (include specimen signatures)")) {
				certificateOfQualification=fileName;
			}else if(title.equals("Evidence of adequate provisions to cover liabilities arising from the operations of the organization e.g. insurance")) {
				evidenceOfAdequate=fileName;
			}else if(title.equals("Sample of (blank) certification documentation")) {
				sampleOfBlank=fileName;
			}else if(title.equals("Evidence of accreditation received from any other accreditation body if applicable")) {
				evidenceOfAcc=fileName;
			}else if(title.equals("Documentation outlining organizational structure including relationship to other parts within the same legal entity if applicable and related details for ALL personnel (both full time and contracted) involved in the certification process")) {
				documentationOutlining=fileName;
			}
			
		}
		
		pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
			"[$ProofLegal$]","[$GenericOrganizations$]","[$Agreementsoutlining$]","[$PoliciesRelated$]","[$proceduresConflicts$]","[$AuthorizedManagement$]","[$QualificationsEvidence$]","[$CertificatesCopies$]","[$Adequateliabilities$]","[$Certificationdocumentation$]","[$AccreditationReceived$]","[$OutliningOrganizational$]",
			
			},
			new String[] {
					proofOfLegal, genericCertificate,authorizedPolicy,policyProcedure,policyPotential,authorizedCopy,evidenceQualification,certificateOfQualification,
					evidenceOfAdequate,sampleOfBlank,evidenceOfAcc,documentationOutlining,
				});
		}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] { "[$PaymentMet$]" },
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