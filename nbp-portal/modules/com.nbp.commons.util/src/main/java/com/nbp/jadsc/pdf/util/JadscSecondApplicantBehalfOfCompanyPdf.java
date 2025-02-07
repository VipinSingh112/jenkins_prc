package com.nbp.jadsc.pdf.util;

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
import com.nbp.jadsc.application.form.service.model.JADSCApplication;
import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfService;
import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfServiceAddForm;
import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfVeracity;
import com.nbp.jadsc.application.form.service.model.JADSCChecklist;
import com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd;
import com.nbp.jadsc.application.form.service.model.JADSCInformationRequest;
import com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance;
import com.nbp.jadsc.application.form.service.model.JADSCOathRequest;
import com.nbp.jadsc.application.form.service.service.JADSCApplicationLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCCertificateOfServiceAddFormLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCCertificateOfServiceLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCCertificateOfVeracityLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCChecklistAddLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCChecklistLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCInformationRequestLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCNoticeOfAppearanceLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCOathRequestLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class JadscSecondApplicantBehalfOfCompanyPdf {

	//signature 
	public static String replaceSignatureForJadsc(long jadscApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Oath Submitter Sign");
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
	
	public static String replaceSignatureSecondForJadsc(long jadscApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Oath Jutice Sign");
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
	//one sign upload button is require
	
	public static String replaceSignatureThirdForJadsc(long jadscApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Certificate of Service Sign");
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
	
	public static String replaceSignatureFourthForJadsc(long jadscApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Certificate of Veracity Sign");
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
	
	public static String replaceSignatureFifthForJadsc(long jadscApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Certificate of Veracity Peace Justice");
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
	
	
	public static String replaceSignatureForSixthJadscApp(long jadscApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Notice of Appearance Sign");
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
	
	
	



public static String jadscSecondApplicantBehalfOfCompanyPdf(long jadscApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		JADSCApplication jadscApplication=null;
		JADSCInformationRequest informationRequest=null;
		JADSCOathRequest jadscOathRequest = null;
		JADSCCertificateOfService certificateOfService = null;
		List<JADSCCertificateOfServiceAddForm> certificateOfServiceAddForm=null;
		JADSCCertificateOfVeracity certificateOfVeracity=null;
		JADSCNoticeOfAppearance jadscNoticeOfAppearance=null;
		List<JADSCChecklistAdd> jadscChecklistAdd=null;
		List<JADSCChecklist> checklist = null;
		

		
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		
	//Signatures
		String signatureForJadscApp=null;
		String signatureForSecondJadscApp=null;
		String signatureForThirdJadscApp=null;
		String signatureForFourthJadscApp=null;
		String signatureForFifthJadscApp=null;
		String signatureForSixthJadscApp=null;
		

		
		try {
			jadscApplication= JADSCApplicationLocalServiceUtil.getJADSCApplication(jadscApplicationId);	
		}catch (Exception e) {
		}
		try {
			informationRequest=JADSCInformationRequestLocalServiceUtil.getJADSCBy_Id(jadscApplicationId);
		}catch (Exception e) {
		}
		try {
			jadscOathRequest=JADSCOathRequestLocalServiceUtil.getJADSCBy_Id(jadscApplicationId);
		}catch (Exception e) {
		}
		try {
			certificateOfService=JADSCCertificateOfServiceLocalServiceUtil.getJADSCBy_Id(jadscApplicationId);
		}catch (Exception e) {
		}
		try {
			certificateOfServiceAddForm=JADSCCertificateOfServiceAddFormLocalServiceUtil.getJADSCDataListBy_Id(jadscApplicationId);
		}catch (Exception e) {
		}
		try {
			certificateOfVeracity=JADSCCertificateOfVeracityLocalServiceUtil.getJADSCBy_Id(jadscApplicationId);
		}catch (Exception e) {
		}
		try {
			jadscChecklistAdd=JADSCChecklistAddLocalServiceUtil.getAppIdJADSC(jadscApplicationId);
		}catch (Exception e) {
		}

		try {
			jadscNoticeOfAppearance= JADSCNoticeOfAppearanceLocalServiceUtil.getJADSCNoticeOfAppearanceBy_Id(jadscApplicationId);
		}catch (Exception e) {
		}
		try {
			checklist=JADSCChecklistLocalServiceUtil.getJADSC_ByAppId(jadscApplicationId);
		}catch (Exception e) {
		}
		
		
		
	try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "JADSC Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(), String.valueOf(jadscApplication.getJadscApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	//signatures
		try {
			signatureForJadscApp =replaceSignatureForJadsc(jadscApplication.getJadscApplicationId(),"Oath Submitter Sign",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
	//second signature
		try {
			signatureForSecondJadscApp =replaceSignatureSecondForJadsc(jadscApplication.getJadscApplicationId(),"Oath Jutice Sign",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}		
	//Third signature	
		try {
			signatureForThirdJadscApp =replaceSignatureThirdForJadsc(jadscApplication.getJadscApplicationId(),"Certificate of Service Sign",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		//fourth signature
		try {
			signatureForFourthJadscApp =replaceSignatureFourthForJadsc(jadscApplication.getJadscApplicationId(),"Certificate of Veracity Sign",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		//fifth signature
		try {
			signatureForFifthJadscApp =replaceSignatureFifthForJadsc(jadscApplication.getJadscApplicationId(),"Certificate of Veracity Peace Justice",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		//Sixth signature:
		try {
			signatureForSixthJadscApp =replaceSignatureForSixthJadscApp(jadscApplication.getJadscApplicationId(),"Notice of Appearance Sign",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
	
	
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"adsc-legal-council");
				} else {
					try {
						pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"adsc-legal-council-1");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate =  
					StringUtil.replace(pdfTemplate, 
			new String[] {
			//ADSC - Anti- Dumping and Subsidies Commission(Jamaica):2
					
			"[$CompanyName$]","[$CompanyAddress$]",
			//phone:6
			"[$MainPhone$]","[$OfficePhone$]","[$CellPhone$]","[$WhatsappPhone$]","[$Other$]","[$Email$]",
			//contact Person:4
			"[$NameContactPerson$]","[$PositionContactPerson$]","[$PhoneContactPerson$]","[$EmailContactPerson$]",
			//Alternate Contact:11
			"[$NameAlternateContact$]","[$PositionAlternateContact$]","[$PhoneAlternateContact$]","[$EmailAlternateContact$]","[$CompanyYearsOf$]",
			"[$ProductCom$]","[$ApproximateShare$]","[$InjuryBoxes$]","[$InvestmentsLast$]","[$PlanCapacity$]","[$FiveYearsInvestment$]",
			
			
			
			//Oath for request for Treatment of information as confidential:4
			"[$InvestigationType$]","[$PartyName$]","[$RequestReasons$]","[$OfficialCompany$]",
			//Submitter's Signature:3
			"[$SubmitterSignature$]",
			"[$SubmitterSignatureDate$]",
			"[$JusticeOfPeaceSignature$]",
			
			
			//Certificate of Service:1
			"[$CertificateServiceDate$]",
			//Address:15
			"[$CertificateServiceName1$]","[$CertificateServiceCompany1$]","[$CertificateServiceAddress1$]",
			"[$CertificateServiceName2$]","[$CertificateServiceCompany2$]","[$CertificateServiceAddress2$]",
			"[$CertificateServiceName3$]","[$CertificateServiceCompany3$]","[$CertificateServiceAddress3$]",
			"[$CertificateServiceName4$]","[$CertificateServiceCompany4$]","[$CertificateServiceAddress4$]",
			"[$CertificateServiceName5$]","[$CertificateServiceCompany5$]","[$CertificateServiceAddress5$]",
			 //Signed:5
			"[$CertificateServiceSigned$]",
			"[$NameOfSignatory$]","[$SignatoryDate$]","[$TelephoneNoOfSignatory$]","[$FaxNoOfSignatory$]",
			
			
			//Certificate of Veracity, Accuracy and Completeness:3
			"[$CertificateName$]","[$CertificatePosition$]","[$CertificateCompany$]",	
			//signed:6
			"[$CertificateSignedOne$]",
			
			"[$CertificateSignedDate$]","[$CertificateSignatoryTelephone$]","[$CertificateSignatoryFax$]","[$CertificateSignatoryAddress$]",
			
			"[$SignatoryJusticeOfPeaceSignature$]",
			
			//Notice of Appearance:
			"[$FullNameAd$]","[$AdscAddress$]","[$AdscDate$]","[$NoticeSignature$]","[$NoticeName$]","[$NoticeFirm$]","[$NoticeAddress$]","[$NoticeTele$]",
			
//			//Specific Activities
			"[$JamaicanProducer$]","[$Description$]",
			"[$Producergood$]","[$DescriptionId$]",
			"[$DomesticValue$]","[$DescriptionValue$]",
			"[$Consideration$]","[$DescriptionUnder$]",
			"[$ExportUnder$]","[$DescriptionOrigin$]",
			"[$ForProducer$]","[$DescriptionExporter$]",
			"[$InformationPrices$]","[$DescriptionInfo$]",
			"[$Appropriate$]","[$DescriptionPrices$]",
			"[$ImportedVolume$]","[$DescriptionJamaica$]",
			"[$EffecctsGood$]","[$DescriptionEffect$]",
			"[$ConsequentImports$]","[$DescriptionImpact$]",
			"[$FactorsDomestic$]","[$DescriptionOther$]",
			"[$InformationVolume$]","[$DescriptionFores$]",
			"[$Industry$]","[$DescriptionAdjust$]",
			"[$Duties$]","[$DescriptionSeeking$]",
			
//			//Add Items to the Checklist:
      		"[$Item1$]","[$Item2$]","[$Item3$]","[$Item4$]","[$Item5$]",
		
			
	},
			new String[] {
					
					
			//ADSC - Anti- Dumping and Subsidies Commission(Jamaica):2
    		Validator.isNotNull(informationRequest)&&Validator.isNotNull(informationRequest.getCompanyName())?informationRequest.getCompanyName():"",
			Validator.isNotNull(informationRequest)&&Validator.isNotNull(informationRequest.getAddress())?informationRequest.getAddress():"",
			//phone:6
			Validator.isNotNull(informationRequest)&&Validator.isNotNull(informationRequest.getMainTelephone())?informationRequest.getMainTelephone():"",
			Validator.isNotNull(informationRequest)&&Validator.isNotNull(informationRequest.getOfficeTelephone())?informationRequest.getOfficeTelephone():"",
			Validator.isNotNull(informationRequest)&&Validator.isNotNull(informationRequest.getCellTelephone())?informationRequest.getCellTelephone():"",
		    Validator.isNotNull(informationRequest)&&Validator.isNotNull(informationRequest.getWhatsappTelephone())?informationRequest.getWhatsappTelephone():"",					
			Validator.isNotNull(informationRequest)&&Validator.isNotNull(informationRequest.getOtherContact())?informationRequest.getOtherContact():"",
			Validator.isNotNull(informationRequest)&&Validator.isNotNull(informationRequest.getEmailContact())?informationRequest.getEmailContact():"",					
			//contact Person:4
			Validator.isNotNull(informationRequest)&&Validator.isNotNull(informationRequest.getContactPerName())?informationRequest.getContactPerName():"",
		    Validator.isNotNull(informationRequest)&&Validator.isNotNull(informationRequest.getContactPerPosition())?informationRequest.getContactPerPosition():"",					
			Validator.isNotNull(informationRequest)&&Validator.isNotNull(informationRequest.getContactPerPhone())?informationRequest.getContactPerPhone():"",
     		Validator.isNotNull(informationRequest)&&Validator.isNotNull(informationRequest.getContactPerEmail())?informationRequest.getContactPerEmail():"",		
			//Alternate Contact:11
			Validator.isNotNull(informationRequest)&&Validator.isNotNull(informationRequest.getAltContactPerName())?informationRequest.getAltContactPerName():"",
			Validator.isNotNull(informationRequest)&&Validator.isNotNull(informationRequest.getAltContactPerPosition())?informationRequest.getAltContactPerPosition():"",					
			Validator.isNotNull(informationRequest)&&Validator.isNotNull(informationRequest.getAltContactPerPhone())?informationRequest.getAltContactPerPhone():"",
			Validator.isNotNull(informationRequest)&&Validator.isNotNull(informationRequest.getAltContactPerEmail())?informationRequest.getAltContactPerEmail():"",	
			Validator.isNotNull(informationRequest)&&Validator.isNotNull(informationRequest.getComOperationYear())?informationRequest.getComOperationYear():"",
			Validator.isNotNull(informationRequest)&&Validator.isNotNull(informationRequest.getProducts())?informationRequest.getProducts():"",					
			Validator.isNotNull(informationRequest)&&Validator.isNotNull(informationRequest.getMarketSharePer())?informationRequest.getMarketSharePer():"",
			Validator.isNotNull(informationRequest)&&Validator.isNotNull(informationRequest.getTradeRemedyMeasure())?informationRequest.getTradeRemedyMeasure():"",	
			Validator.isNotNull(informationRequest)&&Validator.isNotNull(informationRequest.getFiveYearsInvestment())?informationRequest.getFiveYearsInvestment():"",
			Validator.isNotNull(informationRequest)&&Validator.isNotNull(informationRequest.getPlanCapacity())?informationRequest.getPlanCapacity():"",	
			Validator.isNotNull(informationRequest)&&Validator.isNotNull(informationRequest.getGrowthProjection())?informationRequest.getGrowthProjection():"",	
					
			//Oath for request for Treatment of information as confidential:4
			Validator.isNotNull(jadscOathRequest)&&Validator.isNotNull(jadscOathRequest.getInvestigationType())?jadscOathRequest.getInvestigationType():"",
			Validator.isNotNull(jadscOathRequest)&&Validator.isNotNull(jadscOathRequest.getPartyName())?jadscOathRequest.getPartyName():"",		
			Validator.isNotNull(jadscOathRequest)&&Validator.isNotNull(jadscOathRequest.getRequestReason())?jadscOathRequest.getRequestReason():"",
			Validator.isNotNull(jadscOathRequest)&&Validator.isNotNull(jadscOathRequest.getComOfficial())?jadscOathRequest.getComOfficial():"",		
			
			//Submitter's Signature:3
					
					signatureForJadscApp,
					 Validator.isNotNull(jadscOathRequest)&&Validator.isNotNull(jadscOathRequest.getSignatureDate())?dateFormat.format(jadscOathRequest.getSignatureDate()):"",
					signatureForSecondJadscApp,	
			//Certificate of Service:1
					
					 Validator.isNotNull(certificateOfService)&&Validator.isNotNull(certificateOfService.getDocSubmitDate())?dateFormat.format(certificateOfService.getDocSubmitDate()):"",
		   //Address Add more 5:15
							 
									
		    (certificateOfServiceAddForm!=null)&&(certificateOfServiceAddForm.size()>0)?certificateOfServiceAddForm.get(0).getDocServeName():"",
		    (certificateOfServiceAddForm!=null)&&(certificateOfServiceAddForm.size()>0)?certificateOfServiceAddForm.get(0).getDocServeCom():"",
		    (certificateOfServiceAddForm!=null)&&(certificateOfServiceAddForm.size()>0)?certificateOfServiceAddForm.get(0).getDocServeAddress():"",
		    		
			(certificateOfServiceAddForm!=null)&&(certificateOfServiceAddForm.size()>1)?certificateOfServiceAddForm.get(1).getDocServeName():"",
			(certificateOfServiceAddForm!=null)&&(certificateOfServiceAddForm.size()>1)?certificateOfServiceAddForm.get(1).getDocServeCom():"",
			(certificateOfServiceAddForm!=null)&&(certificateOfServiceAddForm.size()>1)?certificateOfServiceAddForm.get(1).getDocServeAddress():"",
								
			(certificateOfServiceAddForm!=null)&&(certificateOfServiceAddForm.size()>2)?certificateOfServiceAddForm.get(2).getDocServeName():"",
			(certificateOfServiceAddForm!=null)&&(certificateOfServiceAddForm.size()>2)?certificateOfServiceAddForm.get(2).getDocServeCom():"",
			(certificateOfServiceAddForm!=null)&&(certificateOfServiceAddForm.size()>2)?certificateOfServiceAddForm.get(2).getDocServeAddress():"",
			
			(certificateOfServiceAddForm!=null)&&(certificateOfServiceAddForm.size()>3)?certificateOfServiceAddForm.get(3).getDocServeName():"",
			(certificateOfServiceAddForm!=null)&&(certificateOfServiceAddForm.size()>3)?certificateOfServiceAddForm.get(3).getDocServeCom():"",
			(certificateOfServiceAddForm!=null)&&(certificateOfServiceAddForm.size()>3)?certificateOfServiceAddForm.get(3).getDocServeAddress():"",
					

			(certificateOfServiceAddForm!=null)&&(certificateOfServiceAddForm.size()>4)?certificateOfServiceAddForm.get(4).getDocServeName():"",
			(certificateOfServiceAddForm!=null)&&(certificateOfServiceAddForm.size()>4)?certificateOfServiceAddForm.get(4).getDocServeCom():"",
			(certificateOfServiceAddForm!=null)&&(certificateOfServiceAddForm.size()>4)?certificateOfServiceAddForm.get(4).getDocServeAddress():"",
   			 
			//Third Signature:5
					signatureForThirdJadscApp,
					
			 Validator.isNotNull(certificateOfService)&&Validator.isNotNull(certificateOfService.getSignatoryName())?(certificateOfService.getSignatoryName()):"",
			 Validator.isNotNull(certificateOfService)&&Validator.isNotNull(certificateOfService.getSignatoryDate())?dateFormat.format(certificateOfService.getSignatoryDate()):"",
			 Validator.isNotNull(certificateOfService)&&Validator.isNotNull(certificateOfService.getSignatoryTelephone())?(certificateOfService.getSignatoryTelephone()):"",
			 Validator.isNotNull(certificateOfService)&&Validator.isNotNull(certificateOfService.getSignatoryFax())?(certificateOfService.getSignatoryFax()):"",
			 
			//Certificate of Veracity, Accuracy and Completeness:3
			 Validator.isNotNull(certificateOfVeracity)&&Validator.isNotNull(certificateOfVeracity.getVeracityComName())?(certificateOfVeracity.getVeracityComName()):"",
			 Validator.isNotNull(certificateOfVeracity)&&Validator.isNotNull(certificateOfVeracity.getVeracityComPosition())?(certificateOfVeracity.getVeracityComPosition()):"",
			 Validator.isNotNull(certificateOfVeracity)&&Validator.isNotNull(certificateOfVeracity.getVeracityComCompany())?(certificateOfVeracity.getVeracityComCompany()):"",
					 
			//fourth signature:6
				signatureForFourthJadscApp,
				 Validator.isNotNull(certificateOfVeracity)&&Validator.isNotNull(certificateOfVeracity.getVeracitySignedDate())?dateFormat.format(certificateOfVeracity.getVeracitySignedDate()):"",
				 Validator.isNotNull(certificateOfVeracity)&&Validator.isNotNull(certificateOfVeracity.getVeracitySignedTelephone())?(certificateOfVeracity.getVeracitySignedTelephone()):"",
				 Validator.isNotNull(certificateOfVeracity)&&Validator.isNotNull(certificateOfVeracity.getVeracitySignedFax())?(certificateOfVeracity.getVeracitySignedFax()):"",
				 Validator.isNotNull(certificateOfVeracity)&&Validator.isNotNull(certificateOfVeracity.getVeracitySignedAddress())?(certificateOfVeracity.getVeracitySignedAddress()):"",
				 signatureForFifthJadscApp,
				 
		   //Notice of Appearance:		 
		 
			Validator.isNotNull(jadscNoticeOfAppearance)&&Validator.isNotNull(jadscNoticeOfAppearance.getFullName())?jadscNoticeOfAppearance.getFullName():"",
			Validator.isNotNull(jadscNoticeOfAppearance)&&Validator.isNotNull(jadscNoticeOfAppearance.getAddressOne())?jadscNoticeOfAppearance.getAddressOne():"",
			Validator.isNotNull(jadscNoticeOfAppearance)&&Validator.isNotNull(jadscNoticeOfAppearance.getDate())?dateFormat.format(jadscNoticeOfAppearance.getDate()):"",	 
			signatureForSixthJadscApp,
			Validator.isNotNull(jadscNoticeOfAppearance)&&Validator.isNotNull(jadscNoticeOfAppearance.getName())?jadscNoticeOfAppearance.getName():"",
			Validator.isNotNull(jadscNoticeOfAppearance)&&Validator.isNotNull(jadscNoticeOfAppearance.getFirm())?jadscNoticeOfAppearance.getFirm():"",
			Validator.isNotNull(jadscNoticeOfAppearance)&&Validator.isNotNull(jadscNoticeOfAppearance.getAddress())?jadscNoticeOfAppearance.getAddress():"",
			Validator.isNotNull(jadscNoticeOfAppearance)&&Validator.isNotNull(jadscNoticeOfAppearance.getTelephone())?jadscNoticeOfAppearance.getTelephone():"",	 
					 
					 
			//Checklist
								 		 
		(checklist!=null)&&(checklist.size()>14)?checklist.get(14).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>14)?checklist.get(14).getDescription():"",
		
		(checklist!=null)&&(checklist.size()>13)?checklist.get(13).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>13)?checklist.get(13).getDescription():"",
		
		(checklist!=null)&&(checklist.size()>12)?checklist.get(12).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>12)?checklist.get(12).getDescription():"",
		
		(checklist!=null)&&(checklist.size()>11)?checklist.get(11).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>11)?checklist.get(11).getDescription():"",
		
		(checklist!=null)&&(checklist.size()>10)?checklist.get(10).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>10)?checklist.get(10).getDescription():"",
		
		(checklist!=null)&&(checklist.size()>9)?checklist.get(9).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>9)?checklist.get(9).getDescription():"",
		
		(checklist!=null)&&(checklist.size()>8)?checklist.get(8).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>8)?checklist.get(8).getDescription():"",	
		
		(checklist!=null)&&(checklist.size()>7)?checklist.get(7).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>7)?checklist.get(7).getDescription():"",
		
		(checklist!=null)&&(checklist.size()>6)?checklist.get(6).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>6)?checklist.get(6).getDescription():"",	
		
		(checklist!=null)&&(checklist.size()>5)?checklist.get(5).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>5)?checklist.get(5).getDescription():"",	
		
		(checklist!=null)&&(checklist.size()>4)?checklist.get(4).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>4)?checklist.get(4).getDescription():"",	
		
		(checklist!=null)&&(checklist.size()>3)?checklist.get(3).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>3)?checklist.get(3).getDescription():"",
		
		(checklist!=null)&&(checklist.size()>2)?checklist.get(2).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>2)?checklist.get(2).getDescription():"",
		
		(checklist!=null)&&(checklist.size()>1)?checklist.get(1).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>1)?checklist.get(1).getDescription():"",
		
		 (checklist!=null)&&(checklist.size()>0)?checklist.get(0).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>0)?checklist.get(0).getDescription():"",
		
				
			//Add Items to the Checklist:
				 
			 (jadscChecklistAdd!=null)&&(jadscChecklistAdd.size()>0)?jadscChecklistAdd.get(0).getAddItem():"",
			 
			 (jadscChecklistAdd!=null)&&(jadscChecklistAdd.size()>1)?jadscChecklistAdd.get(1).getAddItem():"",
			 
			 (jadscChecklistAdd!=null)&&(jadscChecklistAdd.size()>2)?jadscChecklistAdd.get(2).getAddItem():"",
			 
			 (jadscChecklistAdd!=null)&&(jadscChecklistAdd.size()>3)?jadscChecklistAdd.get(3).getAddItem():"",
			 
			 (jadscChecklistAdd!=null)&&(jadscChecklistAdd.size()>4)?jadscChecklistAdd.get(4).getAddItem():"",
			 
							 
							 
							 
			});
				    }catch (Exception e) {
						// TODO: handle exception
					}
			
		if (!checkPdfDownloadWithoutDocument.equals("false")) {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
			String Proposal = "";
			
			
			
			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
				} catch (Exception e) {}
				if(title.equals("Application Proposal Document")) {
					Proposal = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
				"[$ApplicationProposalDocument$]",
				},
				new String[] {
						Proposal, 
					});
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

	
	

