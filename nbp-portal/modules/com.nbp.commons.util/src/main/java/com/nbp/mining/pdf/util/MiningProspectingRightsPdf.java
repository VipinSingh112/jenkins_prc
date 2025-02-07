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
import com.nbp.mining.lease.application.service.model.MiningProspectingRights;
import com.nbp.mining.lease.application.service.service.MiningAppPaymentLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningLeaseApplicationLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningProspectingRightsLocalServiceUtil;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MiningProspectingRightsPdf {
	public static String replaceSignatureForMining(long miningApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Rights Signature of Applicant");
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

	
public static String miningProspectingRightPdf(long miningApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		MiningLeaseApplication miningApplication=null;
		MiningProspectingRights miningProspRights = null;
		MiningAppPayment paymentMethod=null;
		
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		
		  //Signatures 
		String signatureForProspectingRightApp = null;
		 
		
		try {
			miningProspRights= MiningProspectingRightsLocalServiceUtil.getMiningById(miningApplicationId);
		}catch (Exception e) {
		}
		try {
			miningApplication= MiningLeaseApplicationLocalServiceUtil.getMiningLeaseApplication(miningApplicationId);
		}catch (Exception e) {
		}
		try {
			paymentMethod= MiningAppPaymentLocalServiceUtil.getMiningById(miningApplicationId);
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
			  signatureForProspectingRightApp =replaceSignatureForMining(miningApplication.getMiningLeaseApplicationId(), "Rights Signature of Applicant", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}
		 
		
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"prospecting-right");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"prospecting-right-1");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = 
					StringUtil.replace(pdfTemplate, 
			new String[] {
			//Applicant details
			"[$ApplicantName$]","[$TccNo$]","[$ApplicantNationality$]","[$ApplicantAge$]","[$TelephoneNo$]","[$RightEmail$]","[$RightAddress$]","[$ProspectAgent$]",
			
			"[$EmployName$]","[$EmployAddress$]","[$LicencePro$]","[$MiningActEm$]","[$EmployNameOther$]","[$EmployAddressOther$]",
			
			
			//signature
			"[$SignApplicant$]",
			"[$PaymentMiningRight$]",
			
			},
			new String[] {
    		//Applicant details
    		Validator.isNotNull(miningProspRights)&&Validator.isNotNull(miningProspRights.getNameOfApplicant())?miningProspRights.getNameOfApplicant():"",
			Validator.isNotNull(miningProspRights)&&Validator.isNotNull(miningProspRights.getTrnNum())?miningProspRights.getTrnNum():"",
			Validator.isNotNull(miningProspRights)&&Validator.isNotNull(miningProspRights.getNationalityOfApplicant())?miningProspRights.getNationalityOfApplicant():"",
			Validator.isNotNull(miningProspRights)&&Validator.isNotNull(miningProspRights.getAgeOfApplicant())?miningProspRights.getAgeOfApplicant():"",
			Validator.isNotNull(miningProspRights)&&Validator.isNotNull(miningProspRights.getTelephoneNum())?miningProspRights.getTelephoneNum():"",
			Validator.isNotNull(miningProspRights)&&Validator.isNotNull(miningProspRights.getEmailAddr())?miningProspRights.getEmailAddr():"",
			Validator.isNotNull(miningProspRights)&&Validator.isNotNull(miningProspRights.getAddressInJamaica())?miningProspRights.getAddressInJamaica():"",
			Validator.isNotNull(miningProspRights)&&Validator.isNotNull(miningProspRights.getApplicantProspectAcc())?miningProspRights.getApplicantProspectAcc():"",
					
		    Validator.isNotNull(miningProspRights)&&Validator.isNotNull(miningProspRights.getOtherPersonName())?miningProspRights.getOtherPersonName():"",
		    Validator.isNotNull(miningProspRights)&&Validator.isNotNull(miningProspRights.getOtherPersonAddr())?miningProspRights.getOtherPersonAddr():"",
		    Validator.isNotNull(miningProspRights)&&Validator.isNotNull(miningProspRights.getPrevApplication())?miningProspRights.getPrevApplication():"",
		    Validator.isNotNull(miningProspRights)&&Validator.isNotNull(miningProspRights.getOffenceMiningAct())?miningProspRights.getOffenceMiningAct():"",
		    Validator.isNotNull(miningProspRights)&&Validator.isNotNull(miningProspRights.getValidProspectRight())?miningProspRights.getValidProspectRight():"",
		    Validator.isNotNull(miningProspRights)&&Validator.isNotNull(miningProspRights.getSurrenderProspectRight())?miningProspRights.getSurrenderProspectRight():"",			
					
			
			//signature Detail
		    signatureForProspectingRightApp,	
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
