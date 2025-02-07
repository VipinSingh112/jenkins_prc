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
import com.nbp.mining.lease.application.service.model.MiningProspectingLicenseAdd;
import com.nbp.mining.lease.application.service.service.MiningAppPaymentLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningLeaseApplicationLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningProspectingLicenseAddLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningProspectingLicenseLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MiningProspectingLicenceTransferPdf {
	public static String replaceSignatureForMining(long miningApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Transfer Signature of Applicant");
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
	public static String replaceSignatureForMining1(long miningApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Transfer Signature of the person application");
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
				"Transfer Signature of Minister");
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
	


	
public static String miningProspectingLicenceTransferPdf(long miningApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		MiningLeaseApplication miningApplication=null;
		MiningProspectingLicense miningProspLicence = null;
		MiningAppPayment paymentMethod=null;
	
		List<MiningProspectingLicenseAdd> miningProspectingLicenseAdd=null;
		
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		
		  //Signatures 
		String signatureForProspectingLicenceTransferApp = null;
		String signatureForProspectingLicenceTransferApp1 = null;
		String signatureForProspectingLicenceTransferApp2= null;
		 
		
		try {
			miningProspLicence=MiningProspectingLicenseLocalServiceUtil.getMinningById(miningApplicationId);
		}catch (Exception e) {
		}
		try {
			miningApplication= MiningLeaseApplicationLocalServiceUtil.getMiningLeaseApplication(miningApplicationId);
		}catch (Exception e) {
		}
		
		try {
			miningProspectingLicenseAdd= MiningProspectingLicenseAddLocalServiceUtil.getMinningById(miningApplicationId);
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
			  signatureForProspectingLicenceTransferApp =replaceSignatureForMining(miningApplication.getMiningLeaseApplicationId(), "Transfer Signature of Applicant", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}
		  try { 
			  signatureForProspectingLicenceTransferApp1 =replaceSignatureForMining1(miningApplication.getMiningLeaseApplicationId(), "Transfer Signature of the person application", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}
		 
		  try { 
			  signatureForProspectingLicenceTransferApp2 =replaceSignatureForMining2(miningApplication.getMiningLeaseApplicationId(), "Transfer Signature of Minister", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}
		 
		 
		
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"transfer-2");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"transfer");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = 
					StringUtil.replace(pdfTemplate, 
			new String[] {
			//Applicant details 6
			"[$TransferApplicantName$]","[$TransferTelephone$]","[$TransferEmail$]","[$TransferTccNum$]","[$TransferNationality$]","[$TransferAddress$]",
			
			
			//Director Detail 5
			"[$TransferCompanyDirectors1$]","[$TransferNationality1$]","[$TransferPartnership1$]",
			"[$TransferCompanyDirectors2$]","[$TransferNationality2$]","[$TransferPartnership2$]",
			"[$TransferCompanyDirectors3$]","[$TransferNationality3$]","[$TransferPartnership3$]",
			"[$TransferCompanyDirectors4$]","[$TransferNationality4$]","[$TransferPartnership4$]",
			"[$TransferCompanyDirectors5$]","[$TransferNationality5$]","[$TransferPartnership5$]",
			
			
		

			
			//signature 3
			"[$TransferSign$]",	"[$TransferSignPerson$]","[$TransferSignMinister$]",
			
			//date 1
			"[$TradersDate$]",
			
			//PaymentMethod 1
			"[$PaymentMeth$]",
			
			},
			new String[] {
    		//Applicant details 6
    		Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getNameOfApplicant())?miningProspLicence.getNameOfApplicant():"",
			Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getTelephoneNumber())?miningProspLicence.getTelephoneNumber():"",
			Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getEmailAddress())?miningProspLicence.getEmailAddress():"",
			Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getTrnNumber())?miningProspLicence.getTrnNumber():"",
			Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getNationalityOfApplicant())?miningProspLicence.getNationalityOfApplicant():"",
			Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getAddressInJamaica())?miningProspLicence.getAddressInJamaica():"",
			
			//add more 5	
		    (miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>0)?miningProspectingLicenseAdd.get(0).getName():"",
		    (miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>0)?miningProspectingLicenseAdd.get(0).getNationality():"",
		    (miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>0)?miningProspectingLicenseAdd.get(0).getDirectorsOfCompany():"",
		    		
			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>1)?miningProspectingLicenseAdd.get(1).getName():"",
			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>1)?miningProspectingLicenseAdd.get(1).getNationality():"",
			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>1)?miningProspectingLicenseAdd.get(1).getDirectorsOfCompany():"",
								
			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>2)?miningProspectingLicenseAdd.get(2).getName():"",
			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>2)?miningProspectingLicenseAdd.get(2).getNationality():"",
			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>2)?miningProspectingLicenseAdd.get(2).getDirectorsOfCompany():"",
			
			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>3)?miningProspectingLicenseAdd.get(3).getName():"",
			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>3)?miningProspectingLicenseAdd.get(3).getNationality():"",
			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>3)?miningProspectingLicenseAdd.get(3).getDirectorsOfCompany():"",
					

			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>4)?miningProspectingLicenseAdd.get(4).getName():"",
			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>4)?miningProspectingLicenseAdd.get(4).getNationality():"",
			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>4)?miningProspectingLicenseAdd.get(4).getDirectorsOfCompany():"",
   

     	
			//signature Detail 3
			signatureForProspectingLicenceTransferApp,
			signatureForProspectingLicenceTransferApp1,
			signatureForProspectingLicenceTransferApp2,
			
			//date 1
		    Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getDateUponTheLocation())?dateFormat.format(miningProspLicence.getDateUponTheLocation()):"",
			
			
			//payment 1
		    Validator.isNotNull(paymentMethod)&&Validator.isNotNull(paymentMethod.getPaymentMethod())?paymentMethod.getPaymentMethod():"",			
					
			});
				    }catch (Exception e) {
						// TODO: handle exception
					}
			
		
	
		 if (!checkPdfDownloadWithoutDocument.equals("false")) {
		String title = "";
		String fileName = "";
		if (Validator.isNotNull(supportingDocumentsFolder)) {
		String FinancialStatement = "";
		
		
		
		
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			try {
				fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
				fileName = fileEntry.getFileName();
				title=fileEntry.getTitle();
			} catch (Exception e) {}
			if(title.equals("A financial statement of the position of the applicant")) {
				FinancialStatement = fileName;
			}
		}
		
		pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
			"[$FinancialStatement$]",
			
			},
			new String[] {
					FinancialStatement, 
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






