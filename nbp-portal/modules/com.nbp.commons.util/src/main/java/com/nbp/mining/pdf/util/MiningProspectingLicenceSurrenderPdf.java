package com.nbp.mining.pdf.util;

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
import com.nbp.mining.lease.application.service.model.MiningAppPayment;
import com.nbp.mining.lease.application.service.model.MiningLeaseApplication;
import com.nbp.mining.lease.application.service.model.MiningProspectingLicense;
import com.nbp.mining.lease.application.service.service.MiningAppPaymentLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningLeaseApplicationLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningProspectingLicenseLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MiningProspectingLicenceSurrenderPdf {
	public static String replaceSignatureForMining(long miningApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Surrender Signature of Holder");
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
	public static String replaceSignatureForMining2(long miningApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Surrender Signature of Minister");
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

	
public static String miningProspectingLicenceSurrenderPdf(long miningApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		 DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy"); 
		MiningLeaseApplication miningApplication=null;
		
		MiningAppPayment paymentMethod=null;
	
		MiningProspectingLicense miningProspLicence = null;
		
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		
		  //Signatures 
		String signatureForProspectingLicenceSurrenderApp = null;
		String signatureForProspectingLicenceSurrenderApp2 = null;
		 
		
		
		try {
			miningApplication= MiningLeaseApplicationLocalServiceUtil.getMiningLeaseApplication(miningApplicationId);
		}catch (Exception e) {
		}
		try {
			paymentMethod= MiningAppPaymentLocalServiceUtil.getMiningById(miningApplicationId);
		}catch (Exception e) {
		}
		try {
			miningProspLicence= MiningProspectingLicenseLocalServiceUtil.getMinningById(miningApplicationId);
		}catch (Exception e) {
		}

		
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Mining Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(), String.valueOf(miningApplication.getMiningLeaseApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//signatures
		
		  try { 
			  signatureForProspectingLicenceSurrenderApp =replaceSignatureForMining(miningApplication.getMiningLeaseApplicationId(), "Surrender Signature of Holder", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}
		  try { 
			  signatureForProspectingLicenceSurrenderApp2 =replaceSignatureForMining2(miningApplication.getMiningLeaseApplicationId(), "Surrender Signature of Minister", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}
		 
		
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"prospecting-licence-surrender-1");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"prospecting-licence-surrender");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = 
					StringUtil.replace(pdfTemplate, 
			new String[] {
			//Applicant details 4
			"[$SurrenderTeleNo$]","[$SurrenderEmail$]","[$SurrenderDate$]",

			
			
			//signature 2
			"[$SurrenderHolderSign$]","[$SurrenderMinisterSign$]",
			"[$PaymentMethodSurrender$]",
			
			},
			new String[] {
    		//Applicant details 4
    		Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getTelephoneNumber())?miningProspLicence.getTelephoneNumber():"",
			Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getEmailAddress())?miningProspLicence.getEmailAddress():"",
			Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getDateSurrender())?dateFormat.format(miningProspLicence.getDateSurrender()):"",
			
	  	
     	  		   		
			//signature Detail 2
			signatureForProspectingLicenceSurrenderApp,	
			signatureForProspectingLicenceSurrenderApp2,
		    Validator.isNotNull(paymentMethod)&&Validator.isNotNull(paymentMethod.getPaymentMethod())?paymentMethod.getPaymentMethod():"",			
					
			});
				    }catch (Exception e) {
						// TODO: handle exception
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









