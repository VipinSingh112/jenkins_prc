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
import com.nbp.mining.lease.application.service.model.MiningLeaseApplication;
import com.nbp.mining.lease.application.service.model.MiningRenewalLicence;
import com.nbp.mining.lease.application.service.service.MiningLeaseApplicationLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningRenewalLicenceLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MiningLeaseRenewPdf {
  public static String replaceSignatureForMining(long miningApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"LEASE Signature of Applicant");
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

public static String miningLeaseRenewPdf(long miningApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		MiningLeaseApplication miningApplication=null;
		MiningRenewalLicence  miningRenewalLicence=null;
	
		
		
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		
		  //Signatures 
		String signatureForMiningLeaseRenew = null;
		
		
		
		try {
			miningApplication= MiningLeaseApplicationLocalServiceUtil.getMiningLeaseApplication(miningApplicationId);
		}catch (Exception e) {
		}
		try {
			miningRenewalLicence= MiningRenewalLicenceLocalServiceUtil.getMiningById(miningApplicationId);
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
			  signatureForMiningLeaseRenew =replaceSignatureForMining(miningApplication.getMiningLeaseApplicationId(), "LEASE Signature of Applicant", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}
		 
		 
		
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"mining-lease-renew-1");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"mining-lease-renew");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = 
					StringUtil.replace(pdfTemplate, 
			new String[] {
			//Applicant details 7
			"[$renewLeaseName$]","[$renewTrnNum$]","[$leaseRenewTelephoneNo$]","[$leaseRenewEmailAdd$]","[$renewLeaseNumber$]","[$renewLeaseMineral$]","[$renewLeaseLength$]",
			
			
			//date 1
			"[$renewLeaseDate$]",
		

			
			//signature 1
			"[$miningLeaseRenewSign$]",	
			
			
		
			
			},
			new String[] {
    		//Applicant details 7
    		Validator.isNotNull(miningRenewalLicence)&&Validator.isNotNull(miningRenewalLicence.getRenewApplicantName())?miningRenewalLicence.getRenewApplicantName():"",
			Validator.isNotNull(miningRenewalLicence)&&Validator.isNotNull(miningRenewalLicence.getRenewTrnNum())?miningRenewalLicence.getRenewTrnNum():"",
			Validator.isNotNull(miningRenewalLicence)&&Validator.isNotNull(miningRenewalLicence.getRenewTelephone())?miningRenewalLicence.getRenewTelephone():"",
			Validator.isNotNull(miningRenewalLicence)&&Validator.isNotNull(miningRenewalLicence.getRenewEmailAddr())?miningRenewalLicence.getRenewEmailAddr():"",
			Validator.isNotNull(miningRenewalLicence)&&Validator.isNotNull(miningRenewalLicence.getRenewNumOfApplicantLease())?miningRenewalLicence.getRenewNumOfApplicantLease():"",
			Validator.isNotNull(miningRenewalLicence)&&Validator.isNotNull(miningRenewalLicence.getRenApplicantDesireToMine())?miningRenewalLicence.getRenApplicantDesireToMine():"",
			Validator.isNotNull(miningRenewalLicence)&&Validator.isNotNull(miningRenewalLicence.getRenewTermDesired())?miningRenewalLicence.getRenewTermDesired():"",
		
   
			//date 1
		    Validator.isNotNull(miningRenewalLicence)&&Validator.isNotNull(miningRenewalLicence.getRenewDate())?dateFormat.format(miningRenewalLicence.getRenewDate()):"",
			
     	
			//signature Detail 1
			signatureForMiningLeaseRenew,
			
			
		
			
			
			});
				    }catch (Exception e) {
						// TODO: handle exception
					}
			
		
	
		 if (!checkPdfDownloadWithoutDocument.equals("false")) {
		String title = "";
		String fileName = "";
		if (Validator.isNotNull(supportingDocumentsFolder)) {
		String RenewalStatement = "";
		
		
		
		
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			try {
				fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
				fileName = fileEntry.getFileName();
				title=fileEntry.getTitle();
			} catch (Exception e) {}
			if(title.equals("If renewal is sought for only a part delineation an approximate area must be given and a sketch plan or the area applied for must be attached.")) {
				RenewalStatement = fileName;
			}
		}
		
		pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
			"[$approximateRenew$]",
			
			},
			new String[] {
					RenewalStatement, 
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









