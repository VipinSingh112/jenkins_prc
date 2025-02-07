package com.nbp.hsra.pdf.util;

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
import com.nbp.hsra.application.service.model.AddMedicalPractitioner;
import com.nbp.hsra.application.service.model.AlternateRsoAdd;
import com.nbp.hsra.application.service.model.AlternateRsoOneAdd;
import com.nbp.hsra.application.service.model.DetailOfApplicantSecTwo;
import com.nbp.hsra.application.service.model.DetailOfBusinessSecThree;
import com.nbp.hsra.application.service.model.GenEquipmentData;
import com.nbp.hsra.application.service.model.HsraApplication;
import com.nbp.hsra.application.service.model.HsraApplicationPayment;
import com.nbp.hsra.application.service.model.MedicalPractitionerAdd;
import com.nbp.hsra.application.service.model.NotifiLegalInfo;
import com.nbp.hsra.application.service.model.PurposeOfPropLicence;
import com.nbp.hsra.application.service.model.QualifedExpertAdd;
import com.nbp.hsra.application.service.model.QualifedExpertOneAdd;
import com.nbp.hsra.application.service.model.RadiationDeclaration;
import com.nbp.hsra.application.service.model.RadiationDevicesAdd;
import com.nbp.hsra.application.service.model.RadiationProtectionSecOne;
import com.nbp.hsra.application.service.model.RadiationSafetyLowRisk;
import com.nbp.hsra.application.service.model.RadiationSafetyProgram;
import com.nbp.hsra.application.service.model.RadionuclideAdd;
import com.nbp.hsra.application.service.model.RadionuclideInfo;
import com.nbp.hsra.application.service.model.SealedSourcesAdd;
import com.nbp.hsra.application.service.model.SourcesDetailAdd;
import com.nbp.hsra.application.service.model.SpecificReqPropLicActivity;
import com.nbp.hsra.application.service.model.UnsealedSourceAdd;
import com.nbp.hsra.application.service.service.AddMedicalPractitionerLocalServiceUtil;
import com.nbp.hsra.application.service.service.AlternateRsoAddLocalServiceUtil;
import com.nbp.hsra.application.service.service.AlternateRsoOneAddLocalServiceUtil;
import com.nbp.hsra.application.service.service.DetailOfApplicantSecTwoLocalServiceUtil;
import com.nbp.hsra.application.service.service.DetailOfBusinessSecThreeLocalServiceUtil;
import com.nbp.hsra.application.service.service.GenEquipmentDataLocalServiceUtil;
import com.nbp.hsra.application.service.service.HsraApplicationLocalServiceUtil;
import com.nbp.hsra.application.service.service.HsraApplicationPaymentLocalServiceUtil;
import com.nbp.hsra.application.service.service.MedicalPractitionerAddLocalServiceUtil;
import com.nbp.hsra.application.service.service.NotifiLegalInfoLocalServiceUtil;
import com.nbp.hsra.application.service.service.PurposeOfPropLicenceLocalServiceUtil;
import com.nbp.hsra.application.service.service.QualifedExpertAddLocalServiceUtil;
import com.nbp.hsra.application.service.service.QualifedExpertOneAddLocalServiceUtil;
import com.nbp.hsra.application.service.service.RadiationDeclarationLocalServiceUtil;
import com.nbp.hsra.application.service.service.RadiationDevicesAddLocalServiceUtil;
import com.nbp.hsra.application.service.service.RadiationProtectionSecOneLocalServiceUtil;
import com.nbp.hsra.application.service.service.RadiationSafetyLowRiskLocalServiceUtil;
import com.nbp.hsra.application.service.service.RadiationSafetyProgramLocalServiceUtil;
import com.nbp.hsra.application.service.service.RadionuclideAddLocalServiceUtil;
import com.nbp.hsra.application.service.service.RadionuclideInfoLocalServiceUtil;
import com.nbp.hsra.application.service.service.SealedSourcesAddLocalServiceUtil;
import com.nbp.hsra.application.service.service.SourcesDetailAddLocalServiceUtil;
import com.nbp.hsra.application.service.service.SpecificReqPropLicActivityLocalServiceUtil;
import com.nbp.hsra.application.service.service.UnsealedSourceAddLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class HsraRadiationPdf {
	 public static String replaceSignatureForHsraSection5(long hsraApplicationId, String folderName, long groupId,
				long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
			DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
					"Signature of Representative");
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
		public static String replaceSignatureForMedical(long hsraApplicationId, String folderName, long groupId,
				long supportingDocumentsFolderId, ThemeDisplay themeDisplay, String counter) throws PortalException {
				DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
						"Signature of Acknowledgement Medical"+counter);
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
		public static String replaceSignatureForLegalOperator(long hsraApplicationId, String folderName, long groupId,
				long supportingDocumentsFolderId, ThemeDisplay themeDisplay, String counter) throws PortalException {
			DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
					"Signature of Applicant Medical"+counter);
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
		public static String replaceSignatureForRadiationGeneratingEquipment(long hsraApplicationId, String folderName, long groupId,
				long supportingDocumentsFolderId, ThemeDisplay themeDisplay, String counter) throws PortalException {
			DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
					"Signature of Equip"+counter);
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
	/* public static String replaceSignatureForHsraDeclaration(long hsraApplicationId, String folderName, long groupId,
				long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
			DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
					"Signature of Representative");
			List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
					signatureFolder.getFolderId());
			String previewUrl = "";
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
			}
			return previewUrl;
		}*/
	
		

		
	public static String hsraRadiationPdf(long hsraApplicationId, ThemeDisplay themeDisplay,
				String checkPdfDownloadWithoutDocument) {
			String pdfTemplate = StringPool.BLANK;
			DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
			HsraApplication hsraApplication=null;
			RadiationProtectionSecOne radSectionOne=null;
			DetailOfApplicantSecTwo applicantDetail = null;
			DetailOfBusinessSecThree detailOfBusiness = null;
			PurposeOfPropLicence purposeLicence = null;
			HsraApplicationPayment hsraAppPayment = null;
			List<UnsealedSourceAdd> unsealedInfo=null;
			List<SealedSourcesAdd> sealedInfo = null;
		    List<RadiationDevicesAdd> rasoInfo=null;
		    RadiationSafetyProgram radiationSafetyProgram = null;
			RadiationDeclaration radiationDeclaration = null;
			List<QualifedExpertAdd> expertInfo = null;
			List<AlternateRsoAdd>rasoInfo1 = null;
			RadiationSafetyLowRisk lowRiskSafety = null;
			List<AlternateRsoOneAdd> rsoOneAddInfo = null;
			List<QualifedExpertOneAdd> expertOneInfo = null;
			List<MedicalPractitionerAdd> medicalInfo = null;
			SpecificReqPropLicActivity specificRquirements = null;
			NotifiLegalInfo legalInfo = null;
			List<SourcesDetailAdd> sourceInfo = null;
			List<RadionuclideAdd> radionuclideInfo = null;
			RadionuclideInfo radionuclideInfo1 =null;
			List<GenEquipmentData> genEquipInfo = null;
			List<AddMedicalPractitioner> medical = null;
			
				
		
		    
			
			//folder
			List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
			DLFolder supportingDocumentsFolder = null;
			DLFolder supportingDocumentsParentFolder = null;
			FileEntry fileEntry = null;
			
			
			  //Signatures
			String signatureForRadiationForSection5 = null;
		/*	String signatureForRadiationForDeclaration=null;*/	
			
		 //BO Medical
           String signatureForMedicalPractice1=null;
           String signatureForMedicalPractice2=null;
           String signatureForMedicalPractice3=null;
           String signatureForMedicalPractice4=null;
           String signatureForMedicalPractice5=null;
           
           //Bo Legal Operator
           String signatureForLegalOperator1=null;
           String signatureForLegalOperator2=null;
           String signatureForLegalOperator3=null;
           String signatureForLegalOperator4=null;
           String signatureForLegalOperator5=null;
           //Bo Radiation Generating Equipment
           String signatureForRadiationGeneratingEquipment1=null;
           String signatureForRadiationGeneratingEquipment2=null;
           String signatureForRadiationGeneratingEquipment3=null;
           String signatureForRadiationGeneratingEquipment4=null;
           String signatureForRadiationGeneratingEquipment5=null;
           
			
			try {
				hsraApplication=HsraApplicationLocalServiceUtil.getHsraApplication(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				radSectionOne=RadiationProtectionSecOneLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				applicantDetail=DetailOfApplicantSecTwoLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				detailOfBusiness=DetailOfBusinessSecThreeLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				purposeLicence=PurposeOfPropLicenceLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				unsealedInfo=UnsealedSourceAddLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				sealedInfo=SealedSourcesAddLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				rasoInfo=RadiationDevicesAddLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				radiationSafetyProgram=RadiationSafetyProgramLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				radiationDeclaration=RadiationDeclarationLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				expertInfo=QualifedExpertAddLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				rasoInfo1=AlternateRsoAddLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				lowRiskSafety=RadiationSafetyLowRiskLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				rsoOneAddInfo=AlternateRsoOneAddLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				expertOneInfo=QualifedExpertOneAddLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				medicalInfo=MedicalPractitionerAddLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				specificRquirements=SpecificReqPropLicActivityLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				legalInfo=NotifiLegalInfoLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				sourceInfo=SourcesDetailAddLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				radionuclideInfo=RadionuclideAddLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				radionuclideInfo1=RadionuclideInfoLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				genEquipInfo=GenEquipmentDataLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				medical=AddMedicalPractitionerLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}


			try {
				hsraAppPayment=HsraApplicationPaymentLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch(Exception e) {
			}
			
			
			try {
				supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
						DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "HSRA Supporting Documents");
				supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
						supportingDocumentsParentFolder.getFolderId(), String.valueOf(hsraApplication.getHsraApplicationId()));
				supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
						supportingDocumentsFolder.getFolderId());
			} catch (Exception e) {
				e.printStackTrace();
			}
			 //signatures
			
			  try { 
				  signatureForRadiationForSection5 =replaceSignatureForHsraSection5(hsraApplication.getHsraApplicationId(), "Signature of Representative", themeDisplay.getScopeGroupId(),
					  supportingDocumentsFolder.getFolderId(),themeDisplay);
			  } catch (Exception e) {}
			/*  try { 
				  signatureForRadiationForDeclaration =replaceSignatureForHsraDeclaration(hsraApplication.getHsraApplicationId(), "Signature of Representative", themeDisplay.getScopeGroupId(),
					  supportingDocumentsFolder.getFolderId(),themeDisplay);
			  } catch (Exception e) {}*/
			  
			  try { 
				  signatureForMedicalPractice1=replaceSignatureForMedical
						  (hsraApplication.getHsraApplicationId(), "Signature of Acknowledgement Medical1", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay,"1"); 
			  } catch (Exception e) {}
			  try { 
				  signatureForMedicalPractice2=replaceSignatureForMedical
						  (hsraApplication.getHsraApplicationId(), "Signature of Acknowledgement Medical2", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay,"2"); 
			  } catch (Exception e) {}
			  try { 
				  signatureForMedicalPractice3=replaceSignatureForMedical
						  (hsraApplication.getHsraApplicationId(), "Signature of Acknowledgement Medical3", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay,"3"); 
			  } catch (Exception e) {}
			  try { 
				  signatureForMedicalPractice4=replaceSignatureForMedical
						  (hsraApplication.getHsraApplicationId(), "Signature of Acknowledgement Medical4", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay,"4"); 
			  } catch (Exception e) {}
			  try { 
				  signatureForMedicalPractice5=replaceSignatureForMedical
						  (hsraApplication.getHsraApplicationId(), "Signature of Acknowledgement Medical5", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay,"5"); 
			  } catch (Exception e) {}
			  
			  //bio Legal Operator
			  
			  try { 
				  signatureForLegalOperator1=replaceSignatureForLegalOperator
						  (hsraApplication.getHsraApplicationId(), "Signature of Applicant Medical1", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay,"1"); 
			  } catch (Exception e) {}
			  try { 
				  signatureForLegalOperator2=replaceSignatureForLegalOperator
						  (hsraApplication.getHsraApplicationId(), "Signature of Applicant Medical2", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay,"2"); 
			  } catch (Exception e) {}
			  try { 
				  signatureForLegalOperator3=replaceSignatureForLegalOperator
						  (hsraApplication.getHsraApplicationId(), "Signature of Applicant Medical3", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay,"3"); 
			  } catch (Exception e) {}
			  try { 
				  signatureForLegalOperator4=replaceSignatureForLegalOperator
						  (hsraApplication.getHsraApplicationId(), "Signature of Applicant Medical4", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay,"4"); 
			  } catch (Exception e) {}
			  try { 
				  signatureForLegalOperator5=replaceSignatureForLegalOperator
						  (hsraApplication.getHsraApplicationId(), "Signature of Acknowledgement Medical5", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay,"5"); 
			  } catch (Exception e) {}
			  //bio Radiation Generating Equipment
			  
			  try { 
				  signatureForRadiationGeneratingEquipment1=replaceSignatureForRadiationGeneratingEquipment
						  (hsraApplication.getHsraApplicationId(), "Signature of Equip1", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay,"1"); 
			  } catch (Exception e) {}
			  try { 
				  signatureForRadiationGeneratingEquipment2=replaceSignatureForRadiationGeneratingEquipment
						  (hsraApplication.getHsraApplicationId(), "Signature of Equip2", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay,"2"); 
			  } catch (Exception e) {}
			  try { 
				  signatureForRadiationGeneratingEquipment3=replaceSignatureForRadiationGeneratingEquipment
						  (hsraApplication.getHsraApplicationId(), "Signature of Equip3", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay,"3"); 
			  } catch (Exception e) {}
			  try { 
				  signatureForRadiationGeneratingEquipment4=replaceSignatureForRadiationGeneratingEquipment
						  (hsraApplication.getHsraApplicationId(), "Signature of Equip4", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay,"4"); 
			  } catch (Exception e) {}
			  try { 
				  signatureForRadiationGeneratingEquipment5=replaceSignatureForRadiationGeneratingEquipment
						  (hsraApplication.getHsraApplicationId(), "Signature of Equip5", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay,"5"); 
			  } catch (Exception e) {}
			  
			  
			  
			  
			  
			  
			
			//pdf go in launch case
					if (checkPdfDownloadWithoutDocument.equals("false")) {
						pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
								"weighing-device");
					} else {
						try {
						pdfTemplate = getTemplateFromJournalArticlePDF
								(themeDisplay.getScopeGroupId(),
								"users-of-radiation-sources");
						}catch (Exception e) {
							
						}
					}
			try {
				pdfTemplate = 
						StringUtil.replace(pdfTemplate, 
				new String[] {
			
				//Section one 3
				
				"[$TypeLi$]","[$CurrentAuth$]","[$AmenReason$]",
				
				//section two 7
				
				"[$NameOrgani$]","[$MailAdd$]","[$Pari$]","[$OrganiZ$]","[$TeleP$]","[$FNum$]","[$EmailAdd$]",
				
				//section three 11
				"[$BusiT$]","[$NBusiness$]","[$CorpNum$]","[$ForPub$]","[$NameA$]","[$Add$]","[$ParshiDe$]","[$PhoneT$]","[$NumberFa$]","[$AddEm$]","[$GuarFi$]",
				
				
				//Section four 5
				
				"[$RegiAct$]","[$AddressPl$]","[$MainAny$]","[$locationBoth$]","[$InfoRegard$]",
				
				//section four add more first 5
				
				"[$Radio1$]","[$PossessMaxi1$]","[$TotalAct1$]","[$UsE1$]",
				"[$Radio2$]","[$PossessMaxi2$]","[$TotalAct2$]","[$UsE2$]",
				"[$Radio3$]","[$PossessMaxi3$]","[$TotalAct3$]","[$UsE3$]",
				"[$Radio4$]","[$PossessMaxi4$]","[$TotalAct4$]","[$UsE4$]",
				"[$Radio5$]","[$PossessMaxi5$]","[$TotalAct5$]","[$UsE5$]",
				//section four add more second  5
				
				"[$RadioNu1$]","[$MaximumAct1$]","[$DateAct1$]","[$NumberSe1$]","[$UseB1$]",
				"[$RadioNu2$]","[$MaximumAct2$]","[$DateAct2$]","[$NumberSe2$]","[$UseB2$]",
				"[$RadioNu3$]","[$MaximumAct3$]","[$DateAct3$]","[$NumberSe3$]","[$UseB3$]",
				"[$RadioNu4$]","[$MaximumAct4$]","[$DateAct4$]","[$NumberSe4$]","[$UseB4$]",
				"[$RadioNu5$]","[$MaximumAct5$]","[$DateAct5$]","[$NumberSe5$]","[$UseB5$]",
				
				
				//section four add more third 5  correct----------------
			
				"[$RadioLi1$]","[$MaximumTy1$]","[$DeviceName1$]","[$TypeAct1$]","[$Number1$]","[$DeviceOf1$]","[$UseA1$]",
				"[$RadioLi2$]","[$MaximumTy2$]","[$DeviceName2$]","[$TypeAct2$]","[$Number2$]","[$DeviceOf2$]","[$UseA2$]",
				"[$RadioLi3$]","[$MaximumTy3$]","[$DeviceName3$]","[$TypeAct3$]","[$Number3$]","[$DeviceOf3$]","[$UseA3$]",
				"[$RadioLi4$]","[$MaximumTy4$]","[$DeviceName4$]","[$TypeAct4$]","[$Number4$]","[$DeviceOf4$]","[$UseA4$]",
				"[$RadioLi5$]","[$MaximumTy5$]","[$DeviceName5$]","[$TypeAct5$]","[$Number5$]","[$DeviceOf5$]","[$UseA5$]",
				// section five  7
				
				"[$SafetyName$]","[$SafetyTitle$]","[$SafeTelephone$]","[$SafeExt$]","[$SafeFax$]","[$SafeEmailAdd$]","[$AlternateRso$]",
				 
				
			    // add more first 5
				"[$RName1$]","[$TitleTi1$]","[$TelePh1$]","[$ExtA1$]","[$FaxA1$]","[$EmailB1$]",
				"[$RName2$]","[$TitleTi2$]","[$TelePh2$]","[$ExtA2$]","[$FaxA2$]","[$EmailB2$]",
				"[$RName3$]","[$TitleTi3$]","[$TelePh3$]","[$ExtA3$]","[$FaxA3$]","[$EmailB3$]",
				"[$RName4$]","[$TitleTi4$]","[$TelePh4$]","[$ExtA4$]","[$FaxA4$]","[$EmailB4$]",
				"[$RName5$]","[$TitleTi5$]","[$TelePh5$]","[$ExtA5$]","[$FaxA5$]","[$EmailB5$]",
				
				// qualified expert details 9
				"[$SafetyNameHsra$]","[$SafetyHsraTitle$]","[$SafeHsraTelephone$]","[$SafeHsraExt$]","[$SafeHsraFax$]","[$SafeHsraEmailAdd$]",
				"[$SafeRegNo$]","[$SafeHsraRegExpDate$]","[$AlternateRso1$]",
			
				//alternate qualified expert 5
				"[$QualiExper1$]","[$TitLE1$]","[$TelePho1$]","[$ExtC1$]","[$FaxC1$]","[$EmaiLUi1$]","[$HSRARegiNo1$]","[$ExpiD1$]",
				"[$QualiExper2$]","[$TitLE2$]","[$TelePho2$]","[$ExtC2$]","[$FaxC2$]","[$EmaiLUi2$]","[$HSRARegiNo2$]","[$ExpiD2$]",
				"[$QualiExper3$]","[$TitLE3$]","[$TelePho3$]","[$ExtC3$]","[$FaxC3$]","[$EmaiLUi3$]","[$HSRARegiNo3$]","[$ExpiD3$]",
				"[$QualiExper4$]","[$TitLE4$]","[$TelePho4$]","[$ExtC4$]","[$FaxC4$]","[$EmaiLUi4$]","[$HSRARegiNo4$]","[$ExpiD4$]",
				"[$QualiExper5$]","[$TitLE5$]","[$TelePho5$]","[$ExtC5$]","[$FaxC5$]","[$EmaiLUi5$]","[$HSRARegiNo5$]","[$ExpiD5$]",
				
				//Other Representative(s) of applicant 4
				
				"[$RepName$]","[$RepTitle$]","[$RepLimitation$]","[$RepDate$]",
				
				//SIGNATURE  1
				"[$SigNatureDior$]",
				
				// 4
				"[$ExpertAsso$]",/*"[$IndiviPro$]"*/"[$ScopeOf$]","[$ManageY$]",
				
				//Monitoring Occupational Exposure 18
				
				"[$RecordingDo$]","[$ForNew$]","[$ForRenewPro$]","[$LimitOp$]","[$AcquisitionMon$]","[$ClassArea$]",
				"[$ControlRa$]","[$Instruments$]","[$HealthSu$]","[$InvensLevel$]","[$MatrialReme$]","[$ControlSec$]","[$SourceCon$]",
				"[$WorkerTrain$]","[$ControlPublic$]","[$ManageR$]","[$EmeregPro$]","[$Decom$]",
				
				//Radiation Protection Program Policies
				
				"[$LowReason$]","[$TestingSeal$]","[$TransSource$]","[$NuclearMate$]","[$PackingTrans$]","[$InternalR$]","[$AssessInvo$]",
				
				//-------------------till now it is correct----------------------------
				//Radiation Safety Officer (RSO) Details  correct-------------------------
				
				"[$LowSourceName$]","[$LowSourceTitle$]","[$LowSourceTelephone$]","[$LowSourceExt$]","[$LowSourceFax$]","[$LowSourceEmailAdd$]","[$AlternateRsoLowSource$]",
			
				//Alternate RSO FROM
				
				"[$RsoAlName1$]","[$TitleRsoFrom1$]","[$TelePhoneRso1$]","[$ExtRso1$]","[$FaxRso1$]","[$EmailRsoAdd1$]",
				"[$RsoAlName2$]","[$TitleRsoFrom2$]","[$TelePhoneRso2$]","[$ExtRso2$]","[$FaxRso2$]","[$EmailRsoAdd2$]",
				"[$RsoAlName3$]","[$TitleRsoFrom3$]","[$TelePhoneRso3$]","[$ExtRso3$]","[$FaxRso3$]","[$EmailRsoAdd3$]",
				"[$RsoAlName4$]","[$TitleRsoFrom4$]","[$TelePhoneRso4$]","[$ExtRso4$]","[$FaxRso4$]","[$EmailRsoAdd4$]",
				"[$RsoAlName5$]","[$TitleRsoFrom5$]","[$TelePhoneRso5$]","[$ExtRso5$]","[$FaxRso5$]","[$EmailRsoAdd5$]",
				
				//Qualified Expert Details 9
				
				"[$ExpertNameHsra$]","[$ExpertHsraTitle$]","[$ExpertExpertHsraTelephone$]","[$ExpertExpertHsraExt$]","[$ExpertExpertHsraFax$]","[$ExpertExpertHsraEmailAdd$]",
				"[$ExpertExpertHsrarRegNo$]","[$ExpertExpertHsraRegistrationDate$]","[$AlternateRsoExpert$]",
				
				//Alternate Qualified Expert Form 
				"[$QualifiedHsra1$]","[$TitleHsra1$]","[$TelephoneHsra1$]","[$ExtHsra1$]","[$FaxHsra1$]","[$EmailHrsa1$]","[$HSRARegistration1$]","[$ExpirationDate1$]",
				"[$QualifiedHsra2$]","[$TitleHsra2$]","[$TelephoneHsra2$]","[$ExtHsra2$]","[$FaxHsra2$]","[$EmailHrsa2$]","[$HSRARegistration2$]","[$ExpirationDate2$]",
				"[$QualifiedHsra3$]","[$TitleHsra3$]","[$TelephoneHsra3$]","[$ExtHsra3$]","[$FaxHsra3$]","[$EmailHrsa3$]","[$HSRARegistration3$]","[$ExpirationDate3$]",
				"[$QualifiedHsra4$]","[$TitleHsra4$]","[$TelephoneHsra4$]","[$ExtHsra4$]","[$FaxHsra4$]","[$EmailHrsa4$]","[$HSRARegistration4$]","[$ExpirationDate4$]",
				"[$QualifiedHsra5$]","[$TitleHsra5$]","[$TelephoneHsra5$]","[$ExtHsra5$]","[$FaxHsra5$]","[$EmailHrsa5$]","[$HSRARegistration5$]","[$ExpirationDate5$]",
				
				//-------------
				
				"[$ExposeOc$]","[$RecordSystem$]","[$AccessSecurity$]","[$WorkerTr$]","[$LeakSealed$]","[$EmergePro$]","[$ManageRadio$]",
			//------------------till now it is correct------------------------	
				//SECTION 7
				"[$NameUi1$]","[$AddressJ1$]","[$TelePe1$]","[$FaxNu1$]","[$EmailVi1$]","[$LicenceN1$]",
				"[$NameUi2$]","[$AddressJ2$]","[$TelePe2$]","[$FaxNu2$]","[$EmailVi2$]","[$LicenceN2$]",
				"[$NameUi3$]","[$AddressJ3$]","[$TelePe3$]","[$FaxNu3$]","[$EmailVi3$]","[$LicenceN3$]",
				"[$NameUi4$]","[$AddressJ4$]","[$TelePe4$]","[$FaxNu4$]","[$EmailVi4$]","[$LicenceN4$]",
				"[$NameUi5$]","[$AddressJ5$]","[$TelePe5$]","[$FaxNu5$]","[$EmailVi5$]","[$LicenceN5$]",
				
				//Acknowledgement of Medical Practitioner
				
				"[$Signature1$]","[$AcknowDate1$]",
				"[$Signature2$]","[$AcknowDate2$]",
			    "[$Signature3$]","[$AcknowDate3$]",
				"[$Signature4$]","[$AcknowDate4$]",
				"[$Signature5$]","[$AcknowDate5$]",
				
				//Signature of Applicant's Legal Operator to indicate designation of Medical Practitioner
				
				"[$SignatureLegal1$]","[$AcknowDateMedical1$]",
				"[$SignatureLegal2$]","[$AcknowDateMedical2$]",
				"[$SignatureLegal3$]","[$AcknowDateMedical3$]",
				"[$SignatureLegal4$]","[$AcknowDateMedical4$]",
				"[$SignatureLegal5$]","[$AcknowDateMedical5$]",
				
				//
				
				"[$AdministDo$]","[$ProgrameQuality$]","[$InstructCareg$]","[$PatientsFamilie$]","[$ReleasePatients$]","[$ReleaseRoom$]",
				"[$MedicalEmerg$]","[$ForTherape$]","[$DiagnosProtocol$]","[$BioResearch$]","[$CommiteReview$]",
				
				//Industrial Radiography
				
				"[$EmergencyOperating$]","[$PackagesApplication$]","[$MaintenanceExposure$]","[$SafetyEmergency$]","[$PlanTrans$]",
				
				//Vetrinary Nuclear Medicine
				

				"[$AdministerinfTreat$]","[$HousingAnimal$]","[$DisposalWaste$]","[$MonitoringRelease$]","[$AniRel$]",
				
				//Other Industries That Use Nuclear Material
				
				"[$ProceduresNu$]","[$DisposalsNuclear$]","[$MonitoringNuclear$]",
				
				//Gauges (Fixed & Portable)
				
				"[$ProcedureHand$]","[$RulesEntry$]","[$OperatingAnd$]","[$FixedType$]","[$InstallG$]","[$TransportP$]",
				"[$ProcedureEm$]",
				
				//Petroleum Exploration (Well Logging)
				
				"[$ReleaseSources$]","[$FishinStuck$]","[$SealedSources$]","[$AbandonmentUnsealed$]",
				
				//Servicing
				
				"[$ServicingPro$]",
				
				//Manufacturing
				"[$ManufacturingDevelopment$]",
				
				//Declaration
				"[$LegalOp$]","[$TitlE$]",
				
			/*	//signature 1
				
				"[$SigNatureMi$]",*/
				
				//date 1
				"[$DaTe$]",
				
				//Form for Notification of Practices and Sources    after all section form 1
				
				"[$LegalPerName$]","[$LegalPerAdd$]","[$NameOrg$]","[$AddOrg$]","[$ContatNumber$]","[$EmailAddress$]",
				"[$NatureUsed$]",
				
				//Details of Source
				
				"[$Identification1$]","[$StateField1$]", 
				"[$Identification2$]","[$StateField2$]", 
				"[$Identification3$]","[$StateField3$]", 
				"[$Identification4$]","[$StateField4$]", 
				"[$Identification5$]","[$StateField5$]", 
				
				//Section 3 : Radionuclide
				"[$RadioRad1$]","[$ActivBq1$]","[$ActivDa1$]","[$ChemiForm1$]","[$SeriaLRad1$]","[$LocatioN1$]",
				"[$RadioRad2$]","[$ActivBq2$]","[$ActivDa2$]","[$ChemiForm2$]","[$SeriaLRad2$]","[$LocatioN2$]",
				"[$RadioRad3$]","[$ActivBq3$]","[$ActivDa3$]","[$ChemiForm3$]","[$SeriaLRad3$]","[$LocatioN3$]",
				"[$RadioRad4$]","[$ActivBq4$]","[$ActivDa4$]","[$ChemiForm4$]","[$SeriaLRad4$]","[$LocatioN4$]",
				"[$RadioRad5$]","[$ActivBq5$]","[$ActivDa5$]","[$ChemiForm5$]","[$SeriaLRad5$]","[$LocatioN5$]",
				
				"[$SealSo$]","[$ManuF$]","[$Mno$]","[$IdentificationCode$]","[$StaUs$]",
				
			//Section 4 : Radiation Generating Equipment
				
				"[$ManuTu1$]","[$ModelN1$]","[$SeriaL1$]","[$MaxOperating1$]","[$NatureOf1$]","[$LocaTion1$]","[$ModeL1$]","[$StaT1$]","[$DateN1$]","[$Signaturelast1$]",
				"[$ManuTu2$]","[$ModelN2$]","[$SeriaL2$]","[$MaxOperating2$]","[$NatureOf2$]","[$LocaTion2$]","[$ModeL2$]","[$StaT2$]","[$DateN2$]","[$Signaturelast2$]",
				"[$ManuTu3$]","[$ModelN3$]","[$SeriaL3$]","[$MaxOperating3$]","[$NatureOf3$]","[$LocaTion3$]","[$ModeL3$]","[$StaT3$]","[$DateN3$]","[$Signaturelast3$]",
				"[$ManuTu4$]","[$ModelN4$]","[$SeriaL4$]","[$MaxOperating4$]","[$NatureOf4$]","[$LocaTion4$]","[$ModeL4$]","[$StaT4$]","[$DateN4$]","[$Signaturelast4$]",
				"[$ManuTu5$]","[$ModelN5$]","[$SeriaL5$]","[$MaxOperating5$]","[$NatureOf5$]","[$LocaTion5$]","[$ModeL5$]","[$StaT5$]","[$DateN5$]","[$Signaturelast5$]", 
				
				
			
			  //payment 1
				"[$PayMethod$]",
				
				},
				new String[] {
			   
       //section one 3
		Validator.isNotNull(hsraApplication)&&Validator.isNotNull(hsraApplication.getTypeOfTransaction())?hsraApplication.getTypeOfTransaction():"",
		Validator.isNotNull(radSectionOne)&&Validator.isNotNull(radSectionOne.getCurrentAuthNum())?radSectionOne.getCurrentAuthNum():"",
		Validator.isNotNull(radSectionOne)&&Validator.isNotNull(radSectionOne.getReasonForAmendment())?radSectionOne.getReasonForAmendment():"",
		

	   //section two 7
					
		Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getOrganizationName())?applicantDetail.getOrganizationName():"",	
		Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getNuclearMailingAddr())?applicantDetail.getNuclearMailingAddr():"",
		Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getParish())?applicantDetail.getParish():"",
		Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getNuclearTrnNumber())?applicantDetail.getNuclearTrnNumber():"",
		Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getNuclearTelephoneNo())?applicantDetail.getNuclearTelephoneNo():"",
		Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getNuclearFaxNo())?applicantDetail.getNuclearFaxNo():"",
		Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getNuclearEmailAddr())?applicantDetail.getNuclearEmailAddr():"",

		// SECTION THREE 11
		
		    
		Validator.isNotNull(detailOfBusiness)&&Validator.isNotNull(detailOfBusiness.getBusinessType())?detailOfBusiness.getBusinessType():"",
		Validator.isNotNull(detailOfBusiness)&&Validator.isNotNull(detailOfBusiness.getNuclearBusinessNumber())?detailOfBusiness.getNuclearBusinessNumber():"",
		Validator.isNotNull(detailOfBusiness)&&Validator.isNotNull(detailOfBusiness.getNuclearCorporationNum())?detailOfBusiness.getNuclearCorporationNum():"",  
		Validator.isNotNull(detailOfBusiness)&&Validator.isNotNull(detailOfBusiness.getNuclearPublicAct())?(detailOfBusiness.getNuclearPublicAct()):"",
		Validator.isNotNull(detailOfBusiness)&&Validator.isNotNull(detailOfBusiness.getNuclearName())?detailOfBusiness.getNuclearName():"",
		Validator.isNotNull(detailOfBusiness)&&Validator.isNotNull(detailOfBusiness.getNuclearAddressThird())?detailOfBusiness.getNuclearAddressThird():"",
		Validator.isNotNull(detailOfBusiness)&&Validator.isNotNull(detailOfBusiness.getNuclearThirdParish())?detailOfBusiness.getNuclearThirdParish():"",  
		Validator.isNotNull(detailOfBusiness)&&Validator.isNotNull(detailOfBusiness.getNuclearTelephoneNum())?(detailOfBusiness.getNuclearTelephoneNum()):"",
		Validator.isNotNull(detailOfBusiness)&&Validator.isNotNull(detailOfBusiness.getNuclearfaxNumber())?detailOfBusiness.getNuclearfaxNumber():"",
		Validator.isNotNull(detailOfBusiness)&&Validator.isNotNull(detailOfBusiness.getNuclearEmailAdd())?detailOfBusiness.getNuclearEmailAdd():"",
		Validator.isNotNull(detailOfBusiness)&&Validator.isNotNull(detailOfBusiness.getNuclearFinancial())?detailOfBusiness.getNuclearFinancial():"",
		
		// SECTION Four 5
				
		Validator.isNotNull(purposeLicence)&&Validator.isNotNull(purposeLicence.getNuclearRegstLic())?(purposeLicence.getNuclearRegstLic()):"",
		Validator.isNotNull(purposeLicence)&&Validator.isNotNull(purposeLicence.getNuclearBusinessPlace())?purposeLicence.getNuclearBusinessPlace():"",
		Validator.isNotNull(purposeLicence)&&Validator.isNotNull(purposeLicence.getNuclearActivityMainAdd())?purposeLicence.getNuclearActivityMainAdd():"",
		Validator.isNotNull(purposeLicence)&&Validator.isNotNull(purposeLicence.getApplicationType())?purposeLicence.getApplicationType():"",
		Validator.isNotNull(purposeLicence)&&Validator.isNotNull(purposeLicence.getNuclearAdditionalLoc())?purposeLicence.getNuclearAdditionalLoc():"",
				

     //section four add more first 5
				
	    (unsealedInfo!=null)&&(unsealedInfo.size()>0)?unsealedInfo.get(0).getUnsealedSourcesRadionu():"",
	    (unsealedInfo!=null)&&(unsealedInfo.size()>0)?unsealedInfo.get(0).getUnsealedSourcesActivity():"",
	    (unsealedInfo!=null)&&(unsealedInfo.size()>0)?unsealedInfo.get(0).getUnsealedSourcesTotalYear():"",
	    (unsealedInfo!=null)&&(unsealedInfo.size()>0)?unsealedInfo.get(0).getUnsealedSourcesUse():"",
				    				
		(unsealedInfo!=null)&&(unsealedInfo.size()>1)?unsealedInfo.get(1).getUnsealedSourcesRadionu():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>1)?unsealedInfo.get(1).getUnsealedSourcesActivity():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>1)?unsealedInfo.get(1).getUnsealedSourcesTotalYear():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>1)?unsealedInfo.get(1).getUnsealedSourcesUse():"",
							
		(unsealedInfo!=null)&&(unsealedInfo.size()>2)?unsealedInfo.get(2).getUnsealedSourcesRadionu():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>2)?unsealedInfo.get(2).getUnsealedSourcesActivity():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>2)?unsealedInfo.get(2).getUnsealedSourcesTotalYear():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>2)?unsealedInfo.get(2).getUnsealedSourcesUse():"",
		
		(unsealedInfo!=null)&&(unsealedInfo.size()>3)?unsealedInfo.get(3).getUnsealedSourcesRadionu():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>3)?unsealedInfo.get(3).getUnsealedSourcesActivity():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>3)?unsealedInfo.get(3).getUnsealedSourcesTotalYear():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>3)?unsealedInfo.get(3).getUnsealedSourcesUse():"",		

		(unsealedInfo!=null)&&(unsealedInfo.size()>4)?unsealedInfo.get(4).getUnsealedSourcesRadionu():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>4)?unsealedInfo.get(4).getUnsealedSourcesActivity():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>4)?unsealedInfo.get(4).getUnsealedSourcesTotalYear():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>4)?unsealedInfo.get(4).getUnsealedSourcesUse():"",
				
				
		//Section Four Add more second 5
		(sealedInfo!=null)&&(sealedInfo.size()>0)?sealedInfo.get(0).getSealedSourcesRadionu():"",
		(sealedInfo!=null)&&(sealedInfo.size()>0)?sealedInfo.get(0).getSealedSourcesMaxActivity():"",
		(sealedInfo!=null)&&(sealedInfo.size()>0)?dateFormat.format(sealedInfo.get(0).getSealedSourcesActivityDate()):"",
		(sealedInfo!=null)&&(sealedInfo.size()>0)?sealedInfo.get(0).getSealedSourcesCategories():"",	
		(sealedInfo!=null)&&(sealedInfo.size()>0)?sealedInfo.get(0).getSealedSourcesUse():"",
				    				
		(sealedInfo!=null)&&(sealedInfo.size()>1)?sealedInfo.get(1).getSealedSourcesRadionu():"",
		(sealedInfo!=null)&&(sealedInfo.size()>1)?sealedInfo.get(1).getSealedSourcesMaxActivity():"",
		(sealedInfo!=null)&&(sealedInfo.size()>1)?dateFormat.format(sealedInfo.get(1).getSealedSourcesActivityDate()):"",
		(sealedInfo!=null)&&(sealedInfo.size()>1)?sealedInfo.get(1).getSealedSourcesCategories():"",	
		(sealedInfo!=null)&&(sealedInfo.size()>1)?sealedInfo.get(1).getSealedSourcesUse():"",
							
		(sealedInfo!=null)&&(sealedInfo.size()>2)?sealedInfo.get(2).getSealedSourcesRadionu():"",
		(sealedInfo!=null)&&(sealedInfo.size()>2)?sealedInfo.get(2).getSealedSourcesMaxActivity():"",
		(sealedInfo!=null)&&(sealedInfo.size()>2)?dateFormat.format(sealedInfo.get(2).getSealedSourcesActivityDate()):"",
		(sealedInfo!=null)&&(sealedInfo.size()>2)?sealedInfo.get(2).getSealedSourcesCategories():"",	
		(sealedInfo!=null)&&(sealedInfo.size()>2)?sealedInfo.get(2).getSealedSourcesUse():"",
		
		(sealedInfo!=null)&&(sealedInfo.size()>3)?sealedInfo.get(3).getSealedSourcesRadionu():"",
		(sealedInfo!=null)&&(sealedInfo.size()>3)?sealedInfo.get(3).getSealedSourcesMaxActivity():"",
		(sealedInfo!=null)&&(sealedInfo.size()>3)?dateFormat.format(sealedInfo.get(3).getSealedSourcesActivityDate()):"",
		(sealedInfo!=null)&&(sealedInfo.size()>3)?sealedInfo.get(3).getSealedSourcesCategories():"",	
		(sealedInfo!=null)&&(sealedInfo.size()>3)?sealedInfo.get(3).getSealedSourcesUse():"",		
		
		(sealedInfo!=null)&&(sealedInfo.size()>4)?sealedInfo.get(4).getSealedSourcesRadionu():"",
		(sealedInfo!=null)&&(sealedInfo.size()>4)?sealedInfo.get(4).getSealedSourcesMaxActivity():"",
		(sealedInfo!=null)&&(sealedInfo.size()>4)?dateFormat.format(sealedInfo.get(4).getSealedSourcesActivityDate()):"",
		(sealedInfo!=null)&&(sealedInfo.size()>4)?sealedInfo.get(4).getSealedSourcesCategories():"",	
		(sealedInfo!=null)&&(sealedInfo.size()>4)?sealedInfo.get(4).getSealedSourcesUse():"",
				
		//Section Four Add more Third 5  correct----------------
		(rasoInfo!=null)&&(rasoInfo.size()>0)?rasoInfo.get(0).getRadiationDevicesRadio():"",
		(rasoInfo!=null)&&(rasoInfo.size()>0)?rasoInfo.get(0).getRadiationDevicesMaxActivity():"",
		(rasoInfo!=null)&&(rasoInfo.size()>0)?rasoInfo.get(0).getRadiationDevicesManufacturer():"",
		(rasoInfo!=null)&&(rasoInfo.size()>0)?rasoInfo.get(0).getRadiationDevicesName():"",
		(rasoInfo!=null)&&(rasoInfo.size()>0)?rasoInfo.get(0).getRadiationDevicesModelNo():"",
		(rasoInfo!=null)&&(rasoInfo.size()>0)?rasoInfo.get(0).getRadiationDevicesNumber():"",	
		(rasoInfo!=null)&&(rasoInfo.size()>0)?rasoInfo.get(0).getRadiationDevicesUse():"",
				    				
		(rasoInfo!=null)&&(rasoInfo.size()>1)?rasoInfo.get(1).getRadiationDevicesRadio():"",
		(rasoInfo!=null)&&(rasoInfo.size()>1)?rasoInfo.get(1).getRadiationDevicesMaxActivity():"",
		(rasoInfo!=null)&&(rasoInfo.size()>1)?rasoInfo.get(1).getRadiationDevicesManufacturer():"",
		(rasoInfo!=null)&&(rasoInfo.size()>1)?rasoInfo.get(1).getRadiationDevicesName():"",	
		(rasoInfo!=null)&&(rasoInfo.size()>1)?rasoInfo.get(1).getRadiationDevicesModelNo():"",
		(rasoInfo!=null)&&(rasoInfo.size()>1)?rasoInfo.get(1).getRadiationDevicesNumber():"",
		(rasoInfo!=null)&&(rasoInfo.size()>1)?rasoInfo.get(1).getRadiationDevicesUse():"",
							
		(rasoInfo!=null)&&(rasoInfo.size()>2)?rasoInfo.get(2).getRadiationDevicesRadio():"",
		(rasoInfo!=null)&&(rasoInfo.size()>2)?rasoInfo.get(2).getRadiationDevicesMaxActivity():"",
		(rasoInfo!=null)&&(rasoInfo.size()>2)?rasoInfo.get(2).getRadiationDevicesManufacturer():"",
		(rasoInfo!=null)&&(rasoInfo.size()>2)?rasoInfo.get(2).getRadiationDevicesName():"",	
		(rasoInfo!=null)&&(rasoInfo.size()>2)?rasoInfo.get(2).getRadiationDevicesModelNo():"",
		(rasoInfo!=null)&&(rasoInfo.size()>2)?rasoInfo.get(2).getRadiationDevicesNumber():"",
		(rasoInfo!=null)&&(rasoInfo.size()>2)?rasoInfo.get(2).getRadiationDevicesUse():"",
		
		(rasoInfo!=null)&&(rasoInfo.size()>3)?rasoInfo.get(3).getRadiationDevicesRadio():"",
		(rasoInfo!=null)&&(rasoInfo.size()>3)?rasoInfo.get(3).getRadiationDevicesMaxActivity():"",
		(rasoInfo!=null)&&(rasoInfo.size()>3)?rasoInfo.get(3).getRadiationDevicesManufacturer():"",
		(rasoInfo!=null)&&(rasoInfo.size()>3)?rasoInfo.get(3).getRadiationDevicesName():"",	
		(rasoInfo!=null)&&(rasoInfo.size()>3)?rasoInfo.get(3).getRadiationDevicesModelNo():"",
		(rasoInfo!=null)&&(rasoInfo.size()>3)?rasoInfo.get(3).getRadiationDevicesNumber():"",
		(rasoInfo!=null)&&(rasoInfo.size()>3)?rasoInfo.get(3).getRadiationDevicesUse():"",
		
		(rasoInfo!=null)&&(rasoInfo.size()>4)?rasoInfo.get(4).getRadiationDevicesRadio():"",
		(rasoInfo!=null)&&(rasoInfo.size()>4)?rasoInfo.get(4).getRadiationDevicesMaxActivity():"",
		(rasoInfo!=null)&&(rasoInfo.size()>4)?rasoInfo.get(4).getRadiationDevicesManufacturer():"",
		(rasoInfo!=null)&&(rasoInfo.size()>4)?rasoInfo.get(4).getRadiationDevicesName():"",	
		(rasoInfo!=null)&&(rasoInfo.size()>4)?rasoInfo.get(4).getRadiationDevicesModelNo():"",
		(rasoInfo!=null)&&(rasoInfo.size()>4)?rasoInfo.get(4).getRadiationDevicesNumber():"",
		(rasoInfo!=null)&&(rasoInfo.size()>4)?rasoInfo.get(4).getRadiationDevicesUse():"",
		
		
		//Section Five 7
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getNuclearRsoName())?radiationSafetyProgram.getNuclearRsoName():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getNuclearRsoTitle())?radiationSafetyProgram.getNuclearRsoTitle():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getNuclearRsoTeleNo())?radiationSafetyProgram.getNuclearRsoTeleNo():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getNuclearRsoExt())?radiationSafetyProgram.getNuclearRsoExt():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getNuclearRsoFax())?radiationSafetyProgram.getNuclearRsoFax():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getNuclearRsoEmail())?radiationSafetyProgram.getNuclearRsoEmail():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getRsoDetails())?radiationSafetyProgram.getRsoDetails():"",
      //add more first 5
			  
		(rasoInfo1!=null)&&(rasoInfo1.size()>0)?rasoInfo1.get(0).getAlternateRsoName():"",
		(rasoInfo1!=null)&&(rasoInfo1.size()>0)?rasoInfo1.get(0).getAlternateRsoTitle():"",
		(rasoInfo1!=null)&&(rasoInfo1.size()>0)?rasoInfo1.get(0).getAlternateRsoTelephone():"",
		(rasoInfo1!=null)&&(rasoInfo1.size()>0)?rasoInfo1.get(0).getAlternateRsoExt():"",
		(rasoInfo1!=null)&&(rasoInfo1.size()>0)?rasoInfo1.get(0).getAlternateRsoFax():"",
		(rasoInfo1!=null)&&(rasoInfo1.size()>0)?rasoInfo1.get(0).getAlternateRsoEmailAdd():"",	
		
				    				
		(rasoInfo1!=null)&&(rasoInfo1.size()>1)?rasoInfo1.get(1).getAlternateRsoName():"",
		(rasoInfo1!=null)&&(rasoInfo1.size()>1)?rasoInfo1.get(1).getAlternateRsoTitle():"",
		(rasoInfo1!=null)&&(rasoInfo1.size()>1)?rasoInfo1.get(1).getAlternateRsoTelephone():"",
		(rasoInfo1!=null)&&(rasoInfo1.size()>1)?rasoInfo1.get(1).getAlternateRsoExt():"",	
		(rasoInfo1!=null)&&(rasoInfo1.size()>1)?rasoInfo1.get(1).getAlternateRsoFax():"",
		(rasoInfo1!=null)&&(rasoInfo1.size()>1)?rasoInfo1.get(1).getAlternateRsoEmailAdd():"",
		
							
		(rasoInfo1!=null)&&(rasoInfo1.size()>2)?rasoInfo1.get(2).getAlternateRsoName():"",
		(rasoInfo1!=null)&&(rasoInfo1.size()>2)?rasoInfo1.get(2).getAlternateRsoTitle():"",
		(rasoInfo1!=null)&&(rasoInfo1.size()>2)?rasoInfo1.get(2).getAlternateRsoTelephone():"",
		(rasoInfo1!=null)&&(rasoInfo1.size()>2)?rasoInfo1.get(2).getAlternateRsoExt():"",	
		(rasoInfo1!=null)&&(rasoInfo1.size()>2)?rasoInfo1.get(2).getAlternateRsoFax():"",
		(rasoInfo1!=null)&&(rasoInfo1.size()>2)?rasoInfo1.get(2).getAlternateRsoEmailAdd():"",
		
		
		(rasoInfo1!=null)&&(rasoInfo1.size()>3)?rasoInfo1.get(3).getAlternateRsoName():"",
		(rasoInfo1!=null)&&(rasoInfo1.size()>3)?rasoInfo1.get(3).getAlternateRsoTitle():"",
		(rasoInfo1!=null)&&(rasoInfo1.size()>3)?rasoInfo1.get(3).getAlternateRsoTelephone():"",
		(rasoInfo1!=null)&&(rasoInfo1.size()>3)?rasoInfo1.get(3).getAlternateRsoExt():"",	
		(rasoInfo1!=null)&&(rasoInfo1.size()>3)?rasoInfo1.get(3).getAlternateRsoFax():"",
		(rasoInfo1!=null)&&(rasoInfo1.size()>3)?rasoInfo1.get(3).getAlternateRsoEmailAdd():"",
		
		
		(rasoInfo1!=null)&&(rasoInfo1.size()>4)?rasoInfo1.get(4).getAlternateRsoName():"",
		(rasoInfo1!=null)&&(rasoInfo1.size()>4)?rasoInfo1.get(4).getAlternateRsoTitle():"",
		(rasoInfo1!=null)&&(rasoInfo1.size()>4)?rasoInfo1.get(4).getAlternateRsoTelephone():"",
		(rasoInfo1!=null)&&(rasoInfo1.size()>4)?rasoInfo1.get(4).getAlternateRsoExt():"",	
		(rasoInfo1!=null)&&(rasoInfo1.size()>4)?rasoInfo1.get(4).getAlternateRsoFax():"",
		(rasoInfo1!=null)&&(rasoInfo1.size()>4)?rasoInfo1.get(4).getAlternateRsoEmailAdd():"",
		
						  
		  
		  
		  
		 // 9
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getQualifiedExpertName())?radiationSafetyProgram.getQualifiedExpertName():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getQualifiedExpertTitle())?radiationSafetyProgram.getQualifiedExpertTitle():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getQualifiedExpertTele())?radiationSafetyProgram.getQualifiedExpertTele():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getQualifiedExpertExt())?radiationSafetyProgram.getQualifiedExpertExt():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getQualifiedExpertFax())?radiationSafetyProgram.getQualifiedExpertFax():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getQualifiedExpertEmail())?radiationSafetyProgram.getQualifiedExpertEmail():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getQualifiedExpertRegstNo())?radiationSafetyProgram.getQualifiedExpertRegstNo():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getQualifiedExpertDate())?dateFormat.format(radiationSafetyProgram.getQualifiedExpertDate()):"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getQualifiedDetails())?radiationSafetyProgram.getQualifiedDetails():"",
	  
		//add more second 5
				  
	(expertInfo!=null)&&(expertInfo.size()>0)?expertInfo.get(0).getQualifedName():"",
	(expertInfo!=null)&&(expertInfo.size()>0)?expertInfo.get(0).getQualifedTitle():"",
	(expertInfo!=null)&&(expertInfo.size()>0)?expertInfo.get(0).getQualifedTelephone():"",
	(expertInfo!=null)&&(expertInfo.size()>0)?expertInfo.get(0).getQualifedExt():"",
	(expertInfo!=null)&&(expertInfo.size()>0)?expertInfo.get(0).getQualifedFax():"",
	(expertInfo!=null)&&(expertInfo.size()>0)?expertInfo.get(0).getQualifedEmailAdd():"",
	(expertInfo!=null)&&(expertInfo.size()>0)?expertInfo.get(0).getQualifedRegistrationNo():"",
	(expertInfo!=null)&&(expertInfo.size()>0)?dateFormat.format(expertInfo.get(0).getQualifedExpirationDate()):"",
	

	(expertInfo!=null)&&(expertInfo.size()>1)?expertInfo.get(1).getQualifedName():"",
	(expertInfo!=null)&&(expertInfo.size()>1)?expertInfo.get(1).getQualifedTitle():"",
	(expertInfo!=null)&&(expertInfo.size()>1)?expertInfo.get(1).getQualifedTelephone():"",
	(expertInfo!=null)&&(expertInfo.size()>1)?expertInfo.get(1).getQualifedExt():"",
	(expertInfo!=null)&&(expertInfo.size()>1)?expertInfo.get(1).getQualifedFax():"",
	(expertInfo!=null)&&(expertInfo.size()>1)?expertInfo.get(1).getQualifedEmailAdd():"",
	(expertInfo!=null)&&(expertInfo.size()>1)?expertInfo.get(1).getQualifedRegistrationNo():"",
	(expertInfo!=null)&&(expertInfo.size()>1)?dateFormat.format(expertInfo.get(1).getQualifedExpirationDate()):"",
				
						
	(expertInfo!=null)&&(expertInfo.size()>2)?expertInfo.get(2).getQualifedName():"",
	(expertInfo!=null)&&(expertInfo.size()>2)?expertInfo.get(2).getQualifedTitle():"",
	(expertInfo!=null)&&(expertInfo.size()>2)?expertInfo.get(2).getQualifedTelephone():"",
	(expertInfo!=null)&&(expertInfo.size()>2)?expertInfo.get(2).getQualifedExt():"",
	(expertInfo!=null)&&(expertInfo.size()>2)?expertInfo.get(2).getQualifedFax():"",
	(expertInfo!=null)&&(expertInfo.size()>2)?expertInfo.get(2).getQualifedEmailAdd():"",
	(expertInfo!=null)&&(expertInfo.size()>2)?expertInfo.get(2).getQualifedRegistrationNo():"",
	(expertInfo!=null)&&(expertInfo.size()>2)?dateFormat.format(expertInfo.get(2).getQualifedExpirationDate()):"",
	
	
	(expertInfo!=null)&&(expertInfo.size()>3)?expertInfo.get(3).getQualifedName():"",
	(expertInfo!=null)&&(expertInfo.size()>3)?expertInfo.get(3).getQualifedTitle():"",
	(expertInfo!=null)&&(expertInfo.size()>3)?expertInfo.get(3).getQualifedTelephone():"",
	(expertInfo!=null)&&(expertInfo.size()>3)?expertInfo.get(3).getQualifedExt():"",	
	(expertInfo!=null)&&(expertInfo.size()>3)?expertInfo.get(3).getQualifedFax():"",
	(expertInfo!=null)&&(expertInfo.size()>3)?expertInfo.get(3).getQualifedEmailAdd():"",
	(expertInfo!=null)&&(expertInfo.size()>3)?expertInfo.get(3).getQualifedRegistrationNo():"",
	(expertInfo!=null)&&(expertInfo.size()>3)?dateFormat.format(expertInfo.get(3).getQualifedExpirationDate()):"",		

	
	(expertInfo!=null)&&(expertInfo.size()>4)?expertInfo.get(4).getQualifedName():"",
	(expertInfo!=null)&&(expertInfo.size()>4)?expertInfo.get(4).getQualifedTitle():"",
	(expertInfo!=null)&&(expertInfo.size()>4)?expertInfo.get(4).getQualifedTelephone():"",
	(expertInfo!=null)&&(expertInfo.size()>4)?expertInfo.get(4).getQualifedExt():"",
	(expertInfo!=null)&&(expertInfo.size()>4)?expertInfo.get(4).getQualifedFax():"",
	(expertInfo!=null)&&(expertInfo.size()>4)?expertInfo.get(4).getQualifedEmailAdd():"",
	(expertInfo!=null)&&(expertInfo.size()>4)?expertInfo.get(4).getQualifedRegistrationNo():"",
	(expertInfo!=null)&&(expertInfo.size()>4)?dateFormat.format(expertInfo.get(4).getQualifedExpirationDate()):"",
	
		
// 4
			  
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getApplicantName())?radiationSafetyProgram.getApplicantName():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getApplicantTitle())?radiationSafetyProgram.getApplicantTitle():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getOtherLimitationAuth())?radiationSafetyProgram.getOtherLimitationAuth():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getOtherDate())?dateFormat.format(radiationSafetyProgram.getOtherDate()):"",
			  
	  //sign   correct----------------------
			  
	  signatureForRadiationForSection5,		  
			  
	
			  
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getClassifiWorkersList())?radiationSafetyProgram.getClassifiWorkersList():"",
//    Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getRespiPleaseSpecify())?radiationSafetyProgram.getRespiPleaseSpecify():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getScopeOfActivities())?radiationSafetyProgram.getScopeOfActivities():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getManagementSystem())?radiationSafetyProgram.getManagementSystem():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getWorkerRecordings())?radiationSafetyProgram.getWorkerRecordings():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getCategoriesLicence())?radiationSafetyProgram.getCategoriesLicence():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getRenewalsSummary())?radiationSafetyProgram.getRenewalsSummary():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getConstraintsLimits())?radiationSafetyProgram.getConstraintsLimits():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getEquipmentMonitoring())?radiationSafetyProgram.getEquipmentMonitoring():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getAreasControl())?radiationSafetyProgram.getAreasControl():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getRadioactiveSources())?radiationSafetyProgram.getRadioactiveSources():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getRadiationiInstruments())?radiationSafetyProgram.getRadiationiInstruments():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getHealthWorkers())?radiationSafetyProgram.getHealthWorkers():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getInvestigationLevel())?radiationSafetyProgram.getInvestigationLevel():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getPolicyDetails())?radiationSafetyProgram.getPolicyDetails():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getSecurityAccess())?radiationSafetyProgram.getSecurityAccess():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getRaditionSources())?radiationSafetyProgram.getRaditionSources():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getWorkerTraining())?radiationSafetyProgram.getWorkerTraining():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getPublicControl())?radiationSafetyProgram.getPublicControl():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getManagementSources())?radiationSafetyProgram.getManagementSources():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getEmergencyProcedure())?radiationSafetyProgram.getEmergencyProcedure():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getLicenceLocation())?radiationSafetyProgram.getLicenceLocation():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getAchievableProgram())?radiationSafetyProgram.getAchievableProgram():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getLeakedTestingSources())?radiationSafetyProgram.getLeakedTestingSources():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getTransferSources())?radiationSafetyProgram.getTransferSources():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getNuclearMaterials())?radiationSafetyProgram.getNuclearMaterials():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getTransportPackaging())?radiationSafetyProgram.getTransportPackaging():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getInternalReview())?radiationSafetyProgram.getInternalReview():"",
	  Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getSourcesActivities())?radiationSafetyProgram.getSourcesActivities():"",
	 //--------------till now it is correct---------------------------------
			  
			  
			  //section 6 correct-------------------
			  
	  Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getAppendixRsoName())?lowRiskSafety.getAppendixRsoName():"",
	  Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getAppendixRsoTitle())?lowRiskSafety.getAppendixRsoTitle():"",
	  Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getAppendixRsoTeleNo())?lowRiskSafety.getAppendixRsoTeleNo():"",
	  Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getAppendixRsoExt())?lowRiskSafety.getAppendixRsoExt():"",
	  Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getAppendixRsoFax())?lowRiskSafety.getAppendixRsoFax():"",
	  Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getAppendixRsoEmail())?lowRiskSafety.getAppendixRsoEmail():"",
	  Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getAppendixRsoDetails())?lowRiskSafety.getAppendixRsoDetails():"",
	  
			  
			  //add more first
			  
			  
			  
		  
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>0)?rsoOneAddInfo.get(0).getAlternateRsoOneName():"",
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>0)?rsoOneAddInfo.get(0).getAlternateRsoOneTitle():"",
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>0)?rsoOneAddInfo.get(0).getAlternateRsoOneTelephone():"",
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>0)?rsoOneAddInfo.get(0).getAlternateRsoOneExt():"",
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>0)?rsoOneAddInfo.get(0).getAlternateRsoOneFax():"",
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>0)?rsoOneAddInfo.get(0).getAlternateRsoOneEmailAdd():"",	
		
				    				
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>1)?rsoOneAddInfo.get(1).getAlternateRsoOneName():"",
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>1)?rsoOneAddInfo.get(1).getAlternateRsoOneTitle():"",
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>1)?rsoOneAddInfo.get(1).getAlternateRsoOneTelephone():"",
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>1)?rsoOneAddInfo.get(1).getAlternateRsoOneExt():"",	
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>1)?rsoOneAddInfo.get(1).getAlternateRsoOneFax():"",
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>1)?rsoOneAddInfo.get(1).getAlternateRsoOneEmailAdd():"",
		
							
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>2)?rsoOneAddInfo.get(2).getAlternateRsoOneName():"",
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>2)?rsoOneAddInfo.get(2).getAlternateRsoOneTitle():"",
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>2)?rsoOneAddInfo.get(2).getAlternateRsoOneTelephone():"",
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>2)?rsoOneAddInfo.get(2).getAlternateRsoOneExt():"",	
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>2)?rsoOneAddInfo.get(2).getAlternateRsoOneFax():"",
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>2)?rsoOneAddInfo.get(2).getAlternateRsoOneEmailAdd():"",
		
		
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>3)?rsoOneAddInfo.get(3).getAlternateRsoOneName():"",
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>3)?rsoOneAddInfo.get(3).getAlternateRsoOneTitle():"",
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>3)?rsoOneAddInfo.get(3).getAlternateRsoOneTelephone():"",
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>3)?rsoOneAddInfo.get(3).getAlternateRsoOneExt():"",	
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>3)?rsoOneAddInfo.get(3).getAlternateRsoOneFax():"",
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>3)?rsoOneAddInfo.get(3).getAlternateRsoOneEmailAdd():"",
		
		
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>4)?rsoOneAddInfo.get(4).getAlternateRsoOneName():"",
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>4)?rsoOneAddInfo.get(4).getAlternateRsoOneTitle():"",
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>4)?rsoOneAddInfo.get(4).getAlternateRsoOneTelephone():"",
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>4)?rsoOneAddInfo.get(4).getAlternateRsoOneExt():"",	
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>4)?rsoOneAddInfo.get(4).getAlternateRsoOneFax():"",
		(rsoOneAddInfo!=null)&&(rsoOneAddInfo.size()>4)?rsoOneAddInfo.get(4).getAlternateRsoOneEmailAdd():"",
					
									  
		  //correct--------------------------------------
			
			  //---------------- 9
			  
	  Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getQualifiedAppendixName())?lowRiskSafety.getQualifiedAppendixName():"",
	  Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getQualifiedAppendixTitle())?lowRiskSafety.getQualifiedAppendixTitle():"",
	  Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getQualifiedAppendixTele())?lowRiskSafety.getQualifiedAppendixTele():"",
	  Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getQualifiedAppendixExt())?lowRiskSafety.getQualifiedAppendixExt():"",
	  Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getQualifiedAppendixFax())?lowRiskSafety.getQualifiedAppendixFax():"",
	  Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getQualifiedAppendixEmail())?lowRiskSafety.getQualifiedAppendixEmail():"",
	  Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getQualifiedAppendixRegstNo())?lowRiskSafety.getQualifiedAppendixRegstNo():"",
	  Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getQualifiedAppendixDate())?dateFormat.format(lowRiskSafety.getQualifiedAppendixDate()):"",
	  Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getQualifiedAppendixDetails())?lowRiskSafety.getQualifiedAppendixDetails():"",
	 
	  
	  //add more second
			  
		(expertOneInfo!=null)&&(expertOneInfo.size()>0)?expertOneInfo.get(0).getQualifedOneName():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>0)?expertOneInfo.get(0).getQualifedOneTitle():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>0)?expertOneInfo.get(0).getQualifedOneTelephone():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>0)?expertOneInfo.get(0).getQualifedOneExt():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>0)?expertOneInfo.get(0).getQualifedOneFax():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>0)?expertOneInfo.get(0).getQualifedOneEmailAdd():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>0)?expertOneInfo.get(0).getQualifedOneRegistrationNo():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>0)?dateFormat.format(expertOneInfo.get(0).getQualifedOneExpirationDate()):"",
		
		
		(expertOneInfo!=null)&&(expertOneInfo.size()>1)?expertOneInfo.get(1).getQualifedOneName():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>1)?expertOneInfo.get(1).getQualifedOneTitle():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>1)?expertOneInfo.get(1).getQualifedOneTelephone():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>1)?expertOneInfo.get(1).getQualifedOneExt():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>1)?expertOneInfo.get(1).getQualifedOneFax():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>1)?expertOneInfo.get(1).getQualifedOneEmailAdd():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>1)?expertOneInfo.get(1).getQualifedOneRegistrationNo():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>1)?dateFormat.format(expertOneInfo.get(1).getQualifedOneExpirationDate()):"",
					
							
		(expertOneInfo!=null)&&(expertOneInfo.size()>2)?expertOneInfo.get(2).getQualifedOneName():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>2)?expertOneInfo.get(2).getQualifedOneTitle():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>2)?expertOneInfo.get(2).getQualifedOneTelephone():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>2)?expertOneInfo.get(2).getQualifedOneExt():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>2)?expertOneInfo.get(2).getQualifedOneFax():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>2)?expertOneInfo.get(2).getQualifedOneEmailAdd():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>2)?expertOneInfo.get(2).getQualifedOneRegistrationNo():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>2)?dateFormat.format(expertOneInfo.get(2).getQualifedOneExpirationDate()):"",
		
		
		(expertOneInfo!=null)&&(expertOneInfo.size()>3)?expertOneInfo.get(3).getQualifedOneName():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>3)?expertOneInfo.get(3).getQualifedOneTitle():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>3)?expertOneInfo.get(3).getQualifedOneTelephone():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>3)?expertOneInfo.get(3).getQualifedOneExt():"",	
		(expertOneInfo!=null)&&(expertOneInfo.size()>3)?expertOneInfo.get(3).getQualifedOneFax():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>3)?expertOneInfo.get(3).getQualifedOneEmailAdd():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>3)?expertOneInfo.get(3).getQualifedOneRegistrationNo():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>3)?dateFormat.format(expertOneInfo.get(3).getQualifedOneExpirationDate()):"",		
		
		
		(expertOneInfo!=null)&&(expertOneInfo.size()>4)?expertOneInfo.get(4).getQualifedOneName():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>4)?expertOneInfo.get(4).getQualifedOneTitle():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>4)?expertOneInfo.get(4).getQualifedOneTelephone():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>4)?expertOneInfo.get(4).getQualifedOneExt():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>4)?expertOneInfo.get(4).getQualifedOneFax():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>4)?expertOneInfo.get(4).getQualifedOneEmailAdd():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>4)?expertOneInfo.get(4).getQualifedOneRegistrationNo():"",
		(expertOneInfo!=null)&&(expertOneInfo.size()>4)?dateFormat.format(expertOneInfo.get(4).getQualifedOneExpirationDate()):"",
			  
			  
    	//------------	  
	  Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getMonitoringExposure())?lowRiskSafety.getMonitoringExposure():"",
	  Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getRecordSystem())?lowRiskSafety.getRecordSystem():"",
	  Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getSecurityAccess())?lowRiskSafety.getSecurityAccess():"",
	  Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getTrainingInformation())?lowRiskSafety.getTrainingInformation():"",
	  Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getLeakTesting())?lowRiskSafety.getLeakTesting():"",
	  Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getEmergencyProcedures())?lowRiskSafety.getEmergencyProcedures():"",
	  Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getManagementSourcesDis())?lowRiskSafety.getManagementSourcesDis():"",
							
	  //-------------------till  now everything is correct---------------------
				  
		//SECTION 7
			  
			  // A. (i)FIRST ADD MORE 
			  
			  
		(medicalInfo!=null)&&(medicalInfo.size()>0)?medicalInfo.get(0).getMedicalPractitionerName():"",
		(medicalInfo!=null)&&(medicalInfo.size()>0)?medicalInfo.get(0).getMedicalPractitionerAddress():"",
		(medicalInfo!=null)&&(medicalInfo.size()>0)?medicalInfo.get(0).getMedicalPractitionerTelephone():"",
		(medicalInfo!=null)&&(medicalInfo.size()>0)?medicalInfo.get(0).getMedicalPractitionerFax():"",
		(medicalInfo!=null)&&(medicalInfo.size()>0)?medicalInfo.get(0).getMedicalPractitionerEmail():"",
		(medicalInfo!=null)&&(medicalInfo.size()>0)?medicalInfo.get(0).getMedicalPractitionerLicenceNo():"",	
		
				    				
		(medicalInfo!=null)&&(medicalInfo.size()>1)?medicalInfo.get(1).getMedicalPractitionerName():"",
		(medicalInfo!=null)&&(medicalInfo.size()>1)?medicalInfo.get(1).getMedicalPractitionerAddress():"",
		(medicalInfo!=null)&&(medicalInfo.size()>1)?medicalInfo.get(1).getMedicalPractitionerTelephone():"",
		(medicalInfo!=null)&&(medicalInfo.size()>1)?medicalInfo.get(1).getMedicalPractitionerFax():"",	
		(medicalInfo!=null)&&(medicalInfo.size()>1)?medicalInfo.get(1).getMedicalPractitionerEmail():"",
		(medicalInfo!=null)&&(medicalInfo.size()>1)?medicalInfo.get(1).getMedicalPractitionerLicenceNo():"",
		
							
		(medicalInfo!=null)&&(medicalInfo.size()>2)?medicalInfo.get(2).getMedicalPractitionerName():"",
		(medicalInfo!=null)&&(medicalInfo.size()>2)?medicalInfo.get(2).getMedicalPractitionerAddress():"",
		(medicalInfo!=null)&&(medicalInfo.size()>2)?medicalInfo.get(2).getMedicalPractitionerTelephone():"",
		(medicalInfo!=null)&&(medicalInfo.size()>2)?medicalInfo.get(2).getMedicalPractitionerFax():"",	
		(medicalInfo!=null)&&(medicalInfo.size()>2)?medicalInfo.get(2).getMedicalPractitionerEmail():"",
		(medicalInfo!=null)&&(medicalInfo.size()>2)?medicalInfo.get(2).getMedicalPractitionerLicenceNo():"",
		
		
		(medicalInfo!=null)&&(medicalInfo.size()>3)?medicalInfo.get(3).getMedicalPractitionerName():"",
		(medicalInfo!=null)&&(medicalInfo.size()>3)?medicalInfo.get(3).getMedicalPractitionerAddress():"",
		(medicalInfo!=null)&&(medicalInfo.size()>3)?medicalInfo.get(3).getMedicalPractitionerTelephone():"",
		(medicalInfo!=null)&&(medicalInfo.size()>3)?medicalInfo.get(3).getMedicalPractitionerFax():"",	
		(medicalInfo!=null)&&(medicalInfo.size()>3)?medicalInfo.get(3).getMedicalPractitionerEmail():"",
		(medicalInfo!=null)&&(medicalInfo.size()>3)?medicalInfo.get(3).getMedicalPractitionerLicenceNo():"",
		
		
		(medicalInfo!=null)&&(medicalInfo.size()>4)?medicalInfo.get(4).getMedicalPractitionerName():"",
		(medicalInfo!=null)&&(medicalInfo.size()>4)?medicalInfo.get(4).getMedicalPractitionerAddress():"",
		(medicalInfo!=null)&&(medicalInfo.size()>4)?medicalInfo.get(4).getMedicalPractitionerTelephone():"",
		(medicalInfo!=null)&&(medicalInfo.size()>4)?medicalInfo.get(4).getMedicalPractitionerFax():"",	
		(medicalInfo!=null)&&(medicalInfo.size()>4)?medicalInfo.get(4).getMedicalPractitionerEmail():"",
		(medicalInfo!=null)&&(medicalInfo.size()>4)?medicalInfo.get(4).getMedicalPractitionerLicenceNo():"",
				
			
	//SECTION A  (ii)Acknowledgement of Medical Practitioner
													  
		signatureForMedicalPractice1,	
		(medical!=null)&&(medical.size()>0)&&(medical.get(0).getMedicalPractitionerDate()!=null)?dateFormat.format(medical.get(0).getMedicalPractitionerDate()):"",
	
	    signatureForMedicalPractice2,  				
		(medical!=null)&&(medical.size()>1)&&(medical.get(1).getMedicalPractitionerDate()!=null)?dateFormat.format(medical.get(1).getMedicalPractitionerDate()):"",
		
		signatureForMedicalPractice3,				
		(medical!=null)&&(medical.size()>2)&&(medical.get(2).getMedicalPractitionerDate()!=null)?dateFormat.format(medical.get(2).getMedicalPractitionerDate()):"",
		
		signatureForMedicalPractice4,	
		(medical!=null)&&(medical.size()>3)&&(medical.get(3).getMedicalPractitionerDate()!=null)?dateFormat.format(medical.get(3).getMedicalPractitionerDate()):"",
		
		signatureForMedicalPractice5,
		(medical!=null)&&(medical.size()>4)&&(medical.get(4).getMedicalPractitionerDate()!=null)?dateFormat.format(medical.get(4).getMedicalPractitionerDate()):"",
		
						
				
   //section A (iii)Signature of Applicant's Legal Operator to indicate designation of Medical Practitioner
				
		signatureForLegalOperator1,
		(medical!=null)&&(medical.size()>0)&&(medical.get(0).getApplicantDate()!=null)?dateFormat.format(medical.get(0).getApplicantDate()):"",
		
		signatureForLegalOperator2,
		(medical!=null)&&(medical.size()>1)&&(medical.get(1).getApplicantDate()!=null)?dateFormat.format(medical.get(1).getApplicantDate()):"",
						
		signatureForLegalOperator3,
		(medical!=null)&&(medical.size()>2)&&(medical.get(2).getApplicantDate()!=null)?dateFormat.format(medical.get(2).getApplicantDate()):"",
		
		signatureForLegalOperator4,
		(medical!=null)&&(medical.size()>3)&&(medical.get(3).getApplicantDate()!=null)?dateFormat.format(medical.get(3).getApplicantDate()):"",
		
		signatureForLegalOperator5,
		(medical!=null)&&(medical.size()>4)&&(medical.get(4).getApplicantDate()!=null)?dateFormat.format(medical.get(4).getApplicantDate()):"",
				
	//----------------------------------all remaining of section 7-------(37)---------------------------------------
				
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getAdminTreatment())?specificRquirements.getAdminTreatment():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getQualityProgramme())?specificRquirements.getQualityProgramme():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getInstructionsCaregivers())?specificRquirements.getInstructionsCaregivers():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getInstructionsPatients())?specificRquirements.getInstructionsPatients():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getPatientsRelease())?specificRquirements.getPatientsRelease():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getTreatmentRooms())?specificRquirements.getTreatmentRooms():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getMedicalEmergencies())?specificRquirements.getMedicalEmergencies():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getNuclearMedicine())?specificRquirements.getNuclearMedicine():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getDiagnosticStudies())?specificRquirements.getDiagnosticStudies():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getBiomedicalResearch())?specificRquirements.getBiomedicalResearch():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getResearchReview())?specificRquirements.getResearchReview():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getEmergencyOperating())?specificRquirements.getEmergencyOperating():"",		
	
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getCertificatePackages())?specificRquirements.getCertificatePackages():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getExposureDevices())?specificRquirements.getExposureDevices():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getEquipmentSafety())?specificRquirements.getEquipmentSafety():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getTransportPlan())?specificRquirements.getTransportPlan():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getAnimalsTreatment())?specificRquirements.getAnimalsTreatment():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getAnimalHousing())?specificRquirements.getAnimalHousing():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getDisposalWaste())?specificRquirements.getDisposalWaste():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getMonitoringAnimalHousing())?specificRquirements.getMonitoringAnimalHousing():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getReleaseAnimals())?specificRquirements.getReleaseAnimals():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getProceduresApp())?specificRquirements.getProceduresApp():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getDisposalsApp())?specificRquirements.getDisposalsApp():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getMonitoringMaterialNu())?specificRquirements.getMonitoringMaterialNu():"",  
	  
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getHandlingProcedures())?specificRquirements.getHandlingProcedures():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getHoppersEntry())?specificRquirements.getHoppersEntry():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getOperatingConditions())?specificRquirements.getOperatingConditions():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getInsertionType())?specificRquirements.getInsertionType():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getInstallationFixed())?specificRquirements.getInstallationFixed():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getTransportPlanGauge())?specificRquirements.getTransportPlanGauge():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getEmergencyAddition())?specificRquirements.getEmergencyAddition():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getNuclearEnviroment())?specificRquirements.getNuclearEnviroment():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getFishingTool())?specificRquirements.getFishingTool():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getSealedSources())?specificRquirements.getSealedSources():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getAbandonmentZone())?specificRquirements.getAbandonmentZone():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getServicingCopy())?specificRquirements.getServicingCopy():"",
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getManufacturingDevelopment())?specificRquirements.getManufacturingDevelopment():"",
			  
			   
			  
	    //Section Eight 2
	 Validator.isNotNull(radiationDeclaration)&&Validator.isNotNull(radiationDeclaration.getLegalOperatorName())?radiationDeclaration.getLegalOperatorName():"",
	 Validator.isNotNull(radiationDeclaration)&&Validator.isNotNull(radiationDeclaration.getOperatorTitle())?radiationDeclaration.getOperatorTitle():"",
											  
	/*// signature 
	 signatureForRadiationForDeclaration,*/
					
	//date 1
	Validator.isNotNull(radiationDeclaration)&&Validator.isNotNull(radiationDeclaration.getOperatorDate())?dateFormat.format(radiationDeclaration.getOperatorDate()):"",
	    
			
			
	// after all section form 1
			
	Validator.isNotNull(legalInfo)&&Validator.isNotNull(legalInfo.getLegalPersonName())?legalInfo.getLegalPersonName():"",	
	Validator.isNotNull(legalInfo)&&Validator.isNotNull(legalInfo.getLegalPersonAddress())?legalInfo.getLegalPersonAddress():"",
	Validator.isNotNull(legalInfo)&&Validator.isNotNull(legalInfo.getOrganizationName())?legalInfo.getOrganizationName():"",
	Validator.isNotNull(legalInfo)&&Validator.isNotNull(legalInfo.getOrganizationAddress())?legalInfo.getOrganizationAddress():"",
	Validator.isNotNull(legalInfo)&&Validator.isNotNull(legalInfo.getContactNumber())?legalInfo.getContactNumber():"",
	Validator.isNotNull(legalInfo)&&Validator.isNotNull(legalInfo.getLegalPersonEmail())?legalInfo.getLegalPersonEmail():"",
	Validator.isNotNull(legalInfo)&&Validator.isNotNull(legalInfo.getPracticeNature())?legalInfo.getPracticeNature():"",
			
			
	 //after all section form 2
			
		(sourceInfo!=null)&&(sourceInfo.size()>0)?sourceInfo.get(0).getSourceIdentification():"",
		(sourceInfo!=null)&&(sourceInfo.size()>0)?sourceInfo.get(0).getStateActivity():"",
		
				    				
		(sourceInfo!=null)&&(sourceInfo.size()>1)?sourceInfo.get(1).getSourceIdentification():"",
		(sourceInfo!=null)&&(sourceInfo.size()>1)?sourceInfo.get(1).getStateActivity():"",
		
							
		(sourceInfo!=null)&&(sourceInfo.size()>2)?sourceInfo.get(2).getSourceIdentification():"",
		(sourceInfo!=null)&&(sourceInfo.size()>2)?sourceInfo.get(2).getStateActivity():"",
		
		
		(sourceInfo!=null)&&(sourceInfo.size()>3)?sourceInfo.get(3).getSourceIdentification():"",
		(sourceInfo!=null)&&(sourceInfo.size()>3)?sourceInfo.get(3).getStateActivity():"",
		
		(sourceInfo!=null)&&(sourceInfo.size()>4)?sourceInfo.get(4).getSourceIdentification():"",
		(sourceInfo!=null)&&(sourceInfo.size()>4)?sourceInfo.get(4).getStateActivity():"",
		
				
				
				
	//after all section form 3
				
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>0)?radionuclideInfo.get(0).getRadionuclideDetails():"",
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>0)?radionuclideInfo.get(0).getActivityDetails():"",
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>0)?dateFormat.format(radionuclideInfo.get(0).getActivityDate()):"",
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>0)?radionuclideInfo.get(0).getChemicalDetailsForm():"",
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>0)?radionuclideInfo.get(0).getSerialNo():"",
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>0)?radionuclideInfo.get(0).getRadionuclideLocation():"",	

					    				
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>1)?radionuclideInfo.get(1).getRadionuclideDetails():"",
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>1)?radionuclideInfo.get(1).getActivityDetails():"",
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>1)?dateFormat.format(radionuclideInfo.get(1).getActivityDate()):"",
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>1)?radionuclideInfo.get(1).getChemicalDetailsForm():"",	
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>1)?radionuclideInfo.get(1).getSerialNo():"",
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>1)?radionuclideInfo.get(1).getRadionuclideLocation():"",
		
								
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>2)?radionuclideInfo.get(2).getRadionuclideDetails():"",
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>2)?radionuclideInfo.get(2).getActivityDetails():"",
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>2)?dateFormat.format(radionuclideInfo.get(2).getActivityDate()):"",
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>2)?radionuclideInfo.get(2).getChemicalDetailsForm():"",	
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>2)?radionuclideInfo.get(2).getSerialNo():"",
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>2)?radionuclideInfo.get(2).getRadionuclideLocation():"",
			
			
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>3)?radionuclideInfo.get(3).getRadionuclideDetails():"",
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>3)?radionuclideInfo.get(3).getActivityDetails():"",
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>3)?dateFormat.format(radionuclideInfo.get(3).getActivityDate()):"",
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>3)?radionuclideInfo.get(3).getChemicalDetailsForm():"",	
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>3)?radionuclideInfo.get(3).getSerialNo():"",
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>3)?radionuclideInfo.get(3).getRadionuclideLocation():"",
			
			
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>4)?radionuclideInfo.get(4).getRadionuclideDetails():"",
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>4)?radionuclideInfo.get(4).getActivityDetails():"",
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>4)?dateFormat.format(radionuclideInfo.get(4).getActivityDate()):"",
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>4)?radionuclideInfo.get(4).getChemicalDetailsForm():"",	
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>4)?radionuclideInfo.get(4).getSerialNo():"",
			(radionuclideInfo!=null)&&(radionuclideInfo.size()>4)?radionuclideInfo.get(4).getRadionuclideLocation():"",
			

			
			Validator.isNotNull(radionuclideInfo1)&&Validator.isNotNull(radionuclideInfo1.getSealedSource())?radionuclideInfo1.getSealedSource():"",
			Validator.isNotNull(radionuclideInfo1)&&Validator.isNotNull(radionuclideInfo1.getManufacturerDetails())?radionuclideInfo1.getManufacturerDetails():"",
			Validator.isNotNull(radionuclideInfo1)&&Validator.isNotNull(radionuclideInfo1.getModelNo())?radionuclideInfo1.getModelNo():"",
			Validator.isNotNull(radionuclideInfo1)&&Validator.isNotNull(radionuclideInfo1.getIdentificationNo())?radionuclideInfo1.getIdentificationNo():"",		
			Validator.isNotNull(radionuclideInfo1)&&Validator.isNotNull(radionuclideInfo1.getStatusDetails())?radionuclideInfo1.getStatusDetails():"",
					
			
			
  // AFTER ALL SECTION FORM 4
					
					  
		(genEquipInfo!=null)&&(genEquipInfo.size()>0)?genEquipInfo.get(0).getManufacturerEquipment():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>0)?genEquipInfo.get(0).getEquipmentModel():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>0)?genEquipInfo.get(0).getEquipmentSerial():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>0)?genEquipInfo.get(0).getOperatingPotential():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>0)?genEquipInfo.get(0).getNatureEquipment():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>0)?genEquipInfo.get(0).getRadiationGeneratingLoc():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>0)?genEquipInfo.get(0).getEquipmentModels():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>0)?genEquipInfo.get(0).getEquipmentStatusDetail():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>0)&&(genEquipInfo.get(0).getEquipmentDate()!=null)?dateFormat.format(genEquipInfo.get(0).getEquipmentDate()):"",
		signatureForRadiationGeneratingEquipment1,
		
		
		(genEquipInfo!=null)&&(genEquipInfo.size()>1)?genEquipInfo.get(1).getManufacturerEquipment():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>1)?genEquipInfo.get(1).getEquipmentModel():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>1)?genEquipInfo.get(1).getEquipmentSerial():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>1)?genEquipInfo.get(1).getOperatingPotential():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>1)?genEquipInfo.get(1).getNatureEquipment():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>1)?genEquipInfo.get(1).getRadiationGeneratingLoc():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>1)?genEquipInfo.get(1).getEquipmentModels():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>1)?genEquipInfo.get(1).getEquipmentStatusDetail():"",
				(genEquipInfo!=null)&&(genEquipInfo.size()>1)&&(genEquipInfo.get(1).getEquipmentDate()!=null)?dateFormat.format(genEquipInfo.get(1).getEquipmentDate()):"",
		signatureForRadiationGeneratingEquipment2,
					
							
		(genEquipInfo!=null)&&(genEquipInfo.size()>2)?genEquipInfo.get(2).getManufacturerEquipment():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>2)?genEquipInfo.get(2).getEquipmentModel():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>2)?genEquipInfo.get(2).getEquipmentSerial():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>2)?genEquipInfo.get(2).getOperatingPotential():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>2)?genEquipInfo.get(2).getNatureEquipment():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>2)?genEquipInfo.get(2).getRadiationGeneratingLoc():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>2)?genEquipInfo.get(2).getEquipmentModels():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>2)?genEquipInfo.get(2).getEquipmentStatusDetail():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>2)&&(genEquipInfo.get(2).getEquipmentDate()!=null)?dateFormat.format(genEquipInfo.get(2).getEquipmentDate()):"",
		signatureForRadiationGeneratingEquipment3,
		
		
		(genEquipInfo!=null)&&(genEquipInfo.size()>3)?genEquipInfo.get(3).getManufacturerEquipment():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>3)?genEquipInfo.get(3).getEquipmentModel():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>3)?genEquipInfo.get(3).getEquipmentSerial():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>3)?genEquipInfo.get(3).getOperatingPotential():"",	
		(genEquipInfo!=null)&&(genEquipInfo.size()>3)?genEquipInfo.get(3).getNatureEquipment():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>3)?genEquipInfo.get(3).getRadiationGeneratingLoc():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>3)?genEquipInfo.get(3).getEquipmentModels():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>3)?genEquipInfo.get(3).getEquipmentStatusDetail():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>3)&&(genEquipInfo.get(3).getEquipmentDate()!=null)?dateFormat.format(genEquipInfo.get(3).getEquipmentDate()):"",
		signatureForRadiationGeneratingEquipment4,
		
		
		(genEquipInfo!=null)&&(genEquipInfo.size()>4)?genEquipInfo.get(4).getManufacturerEquipment():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>4)?genEquipInfo.get(4).getEquipmentModel():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>4)?genEquipInfo.get(4).getEquipmentSerial():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>4)?genEquipInfo.get(4).getOperatingPotential():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>4)?genEquipInfo.get(4).getNatureEquipment():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>4)?genEquipInfo.get(4).getRadiationGeneratingLoc():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>4)?genEquipInfo.get(4).getEquipmentModels():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>4)?genEquipInfo.get(4).getEquipmentStatusDetail():"",
		(genEquipInfo!=null)&&(genEquipInfo.size()>4)&&(genEquipInfo.get(4).getEquipmentDate()!=null)?dateFormat.format(genEquipInfo.get(4).getEquipmentDate()):"",
		signatureForRadiationGeneratingEquipment5,
		 
	   //payment 1
	Validator.isNotNull(hsraAppPayment)&&Validator.isNotNull(hsraAppPayment.getPaymentMethod())?hsraAppPayment.getPaymentMethod():"",
				
			
				});
				System.out.println("--------------------------after Pdf completed----------------------");
					    }catch (Exception e) {
							// TODO: handle exception
						}
				
			
		
			 if (!checkPdfDownloadWithoutDocument.equals("false")) {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
			String registrationCertificate = "";
			String certification = "";
			String validPhoto = "";
			
			
			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
				} catch (Exception e) {}
				if(title.equals("Certified Copy of Certificate of Incorporation or Certificate of Registration of Business")) {
					registrationCertificate = fileName;
				}else if (title.equals("Certified Copy Valid Photo Identification for Authorized Signatories")) {
					certification = fileName;
				}else if (title.equals("Fit and Proper Declaration Form")) {
					validPhoto = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
				"[$BusinessIncorp$]","[$CopyPhoto$]","[$FitAndProper$]",
				
				},
				new String[] {
						registrationCertificate, certification, validPhoto,
						
					});
			}
			}
			 System.out.println("--------------------------before return pdf template----------------------");
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











