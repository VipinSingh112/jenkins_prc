package com.nbp.ncra.pdf.util;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.journal.model.JournalArticle;
import com.liferay.journal.model.JournalArticleDisplay;
import com.liferay.journal.service.JournalArticleLocalServiceUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo;
import com.nbp.ncra.application.form.service.model.NcraApplication;
import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDate;
import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo;
import com.nbp.ncra.application.form.service.service.NcraApplicantDetailInfoLocalServiceUtil;
import com.nbp.ncra.application.form.service.service.NcraApplicationLocalServiceUtil;
import com.nbp.ncra.application.form.service.service.NcraVerifyWeighingDateLocalServiceUtil;
import com.nbp.ncra.application.form.service.service.NcraVerifyWeighingDeviceInfoLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class NcraImportedPetrolPdf {
	public static String ncraPetrolAppPdf(long ncraApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		NcraApplication ncraApplication=null;
		NcraApplicantDetailInfo applicantDetail=null;
		
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		//Signatures
		String signatureForNcraApp = null;
		
		try {
			ncraApplication= NcraApplicationLocalServiceUtil.getNcraApplication(ncraApplicationId);
			
		} catch (Exception e) {}
		try {
			applicantDetail= NcraApplicantDetailInfoLocalServiceUtil.getNcraDetail_By_App_Id(ncraApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "NCRA Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(), String.valueOf(ncraApplication.getNcraApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//signatures
		/*try {
			signatureForNcraApp =replaceSignatureForNCRA(dateWeighInfo.getNcraApplicationId(), "Signature",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}*/
		
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"imported-petrol-sample-1");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"imported-petrol-sample");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, 
			new String[] {
			//Applicant details
			"[$NameBusinessPe$]","[$AddressPe$]","[$ContactPersonPe$]","[$TelephoneNumberPe$]","[$FaxNoPe$]","[$EmailPe$]","[$LocationPe$]",
			
			},
			new String[] {
    		//Applicant details
    		Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getApplicantBusinessName())?applicantDetail.getApplicantBusinessName():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getApplicantAddress())?applicantDetail.getApplicantAddress():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getApplicantContact())?applicantDetail.getApplicantContact():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getApplicantTeleNum())?applicantDetail.getApplicantTeleNum():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getApplicantFaxNo())?applicantDetail.getApplicantFaxNo():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getApplicantEmailAddr())?applicantDetail.getApplicantEmailAddr():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getApplicantLocation())?applicantDetail.getApplicantLocation():"",
					
					
			});
				    }catch (Exception e) {
						// TODO: handle exception
					}
			
		if (checkPdfDownloadWithoutDocument.equals("true")) {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
			String qualityCertificate = "";
			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
				} catch (Exception e) {}
				if(title.equals("Certificate of Quality")) {
					qualityCertificate = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
				"[$CertificateOf$]",
				},
				new String[] {
						qualityCertificate,
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
