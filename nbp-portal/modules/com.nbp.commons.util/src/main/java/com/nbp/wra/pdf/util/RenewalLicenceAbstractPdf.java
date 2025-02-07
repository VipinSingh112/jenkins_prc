package com.nbp.wra.pdf.util;

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
import com.nbp.wra.application.form.service.model.RenewLicAbstractAndWater;
import com.nbp.wra.application.form.service.model.WRAAppPayment;
import com.nbp.wra.application.form.service.model.WRAApplication;
import com.nbp.wra.application.form.service.model.WRAReqIrrigation;
import com.nbp.wra.application.form.service.service.RenewLicAbstractAndWaterLocalServiceUtil;
import com.nbp.wra.application.form.service.service.WRAAppPaymentLocalServiceUtil;
import com.nbp.wra.application.form.service.service.WRAApplicationLocalServiceUtil;
import com.nbp.wra.application.form.service.service.WRAReqIrrigationLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class RenewalLicenceAbstractPdf {
	public static String replaceSignatureForWra(long wraApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Abstract Renew Signature Applicant");
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

	
public static String getRenewLicAbstractAndUserWaterPdf(long wraApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		WRAApplication wraApplication=null;
		RenewLicAbstractAndWater renewAbstractInfo = null;
		WRAAppPayment wraPayment=null;
		List<WRAReqIrrigation> wraReqIrr=null;
		
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		//Signatures
		String signatureForWraApp = null;
		
		try {
			wraApplication= WRAApplicationLocalServiceUtil.getWRAApplication(wraApplicationId);
		}catch (Exception e) {
		}
		try {
			renewAbstractInfo= RenewLicAbstractAndWaterLocalServiceUtil.getWRA_By_Id(wraApplicationId);
		} catch (Exception e) {
		}
		try {
			  wraReqIrr= WRAReqIrrigationLocalServiceUtil.getWRA_By_Id(wraApplicationId);
		  } catch (Exception e) {}
		try {
			wraPayment= WRAAppPaymentLocalServiceUtil.getgetWRA_By_Id(wraApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "WRA Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(), String.valueOf(wraApplication.getWraApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//signatures
		try {
			signatureForWraApp =replaceSignatureForWra(renewAbstractInfo.getWraApplicationId(), "Abstract Renew Signature Applicant",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"renewal-licence-1");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"renewal-licence");
					}catch (Exception e) {
						e.printStackTrace();
					}
				}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, 
			new String[] {
			//Applicant details
				"[$NameA$]", "[$ContAct$]", "[$JobTi$]", "[$TeleNum$]", "[$FaxNumb$]", "[$Pari3$]", "[$Add$]", "[$SoName$]",
				"[$Prish4$]", "[$ApplicantLocation$]", "[$Abrate$]", "[$Used$]", "[$Methodabs$]", "[$MeasuringAttach$]", 
				"[$Statedevice$]","[$AbstractSub$]","[$Name1$]","[$Dateappli$]",
				"[$SignatureSi$]","[$PaymentMethodOut$]",
				/*"[$NameA$]", "[$ContAct$]", "[$JobTi$]", "[$TeleNum$]", "[$FaxNumb$]", "[$Pari3$]", "[$Add$]", "[$SoName$]",
				"[$Prish4$]", "[$ApplicantLocation$]", "[$Abrate$]", "[$Used$]", "[$Methodabs$]", "[$MeasuringAttach$]", 
				"[$Statedevice$]", "[$AbstractSub$]", "[$Name1$]", "[$Dateappli$]", 
				"[$SignatureSi$]"*/


			},
			new String[] {
    		//Applicant details
    		Validator.isNotNull(renewAbstractInfo)&&Validator.isNotNull(renewAbstractInfo.getRenewName())?renewAbstractInfo.getRenewName():"",
			Validator.isNotNull(renewAbstractInfo)&&Validator.isNotNull(renewAbstractInfo.getRenewContact())?renewAbstractInfo.getRenewContact():"",
			Validator.isNotNull(renewAbstractInfo)&&Validator.isNotNull(renewAbstractInfo.getRenewJobTitle())?renewAbstractInfo.getRenewJobTitle():"",
			Validator.isNotNull(renewAbstractInfo)&&Validator.isNotNull(renewAbstractInfo.getRenewTelephoneNum())?renewAbstractInfo.getRenewTelephoneNum():"",
			Validator.isNotNull(renewAbstractInfo)&&Validator.isNotNull(renewAbstractInfo.getRenewFaxNum())?renewAbstractInfo.getRenewFaxNum():"",
			Validator.isNotNull(renewAbstractInfo)&&Validator.isNotNull(renewAbstractInfo.getRenewParishLocation())?renewAbstractInfo.getRenewParishLocation():"",
			Validator.isNotNull(renewAbstractInfo)&&Validator.isNotNull(renewAbstractInfo.getRenewAddress())?renewAbstractInfo.getRenewAddress():"",
			Validator.isNotNull(renewAbstractInfo)&&Validator.isNotNull(renewAbstractInfo.getRenewSourceName())?renewAbstractInfo.getRenewSourceName():"",
					
			Validator.isNotNull(renewAbstractInfo)&&Validator.isNotNull(renewAbstractInfo.getRenewDetailsParishAdd())?renewAbstractInfo.getRenewDetailsParishAdd():"",
			Validator.isNotNull(renewAbstractInfo)&&Validator.isNotNull(renewAbstractInfo.getRenewDetailsLocation())?renewAbstractInfo.getRenewDetailsLocation():"",
			Validator.isNotNull(renewAbstractInfo)&&Validator.isNotNull(renewAbstractInfo.getRenewAbstractionRate())?renewAbstractInfo.getRenewAbstractionRate():"",
			Validator.isNotNull(renewAbstractInfo)&&Validator.isNotNull(renewAbstractInfo.getRenewDetailsUse())?renewAbstractInfo.getRenewDetailsUse():"",
			Validator.isNotNull(renewAbstractInfo)&&Validator.isNotNull(renewAbstractInfo.getRenewAbstractionMethod())?renewAbstractInfo.getRenewAbstractionMethod():"",
					
			Validator.isNotNull(renewAbstractInfo)&&Validator.isNotNull(renewAbstractInfo.getAttachedDevice())?renewAbstractInfo.getAttachedDevice():"",
			Validator.isNotNull(renewAbstractInfo)&&Validator.isNotNull(renewAbstractInfo.getRenewStateDevice())?renewAbstractInfo.getRenewStateDevice():"",
 			Validator.isNotNull(renewAbstractInfo)&&Validator.isNotNull(renewAbstractInfo.getAbstractionData())?renewAbstractInfo.getAbstractionData():"",
			Validator.isNotNull(renewAbstractInfo)&&Validator.isNotNull(renewAbstractInfo.getRenewSignName())?renewAbstractInfo.getRenewSignName():"",
			Validator.isNotNull(renewAbstractInfo)&&Validator.isNotNull(renewAbstractInfo.getRenewDate())?dateFormat.format(renewAbstractInfo.getRenewDate()):"",
			signatureForWraApp,
			Validator.isNotNull(wraPayment)&&Validator.isNotNull(wraPayment.getPaymentMethod())?wraPayment.getPaymentMethod():"",
			
			});
				    }catch (Exception e) {
						// TODO: handle exception
					}
			
		if (!checkPdfDownloadWithoutDocument.equals("false")) {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
			String proofVol = "";
			String certificate = "";
			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
				} catch (Exception e) {}
				if(title.equals("Proof of “Volume Based Fee” Paid")) {
					proofVol = fileName;
				}else if (title.equals("Certificate of Good Standing")) {
					certificate = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
				"[$OutData$]","[$AbsData$]",
				},
				new String[] {
						proofVol, certificate, 
						
						
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
