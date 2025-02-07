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
import com.nbp.wra.application.form.service.model.LicenceToWellDriller;
import com.nbp.wra.application.form.service.model.WRAAppPayment;
import com.nbp.wra.application.form.service.model.WRAApplication;
import com.nbp.wra.application.form.service.service.LicenceToWellDrillerLocalServiceUtil;
import com.nbp.wra.application.form.service.service.WRAApplicationLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class WellDrillersLicenceApplicationPdf {
	public static String replaceSignatureForWellLic(long wraApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Well Drilling Signature Applicant");
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

	
public static String getWellDrillersLicencePdf(long wraApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		WRAApplication wraApplication=null;
		LicenceToWellDriller licToDrillAWell = null;
		WRAAppPayment wraPayment=null;
		
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
		try{
			licToDrillAWell= LicenceToWellDrillerLocalServiceUtil.getLicenceToWellDriller_By_Id(wraApplicationId);
		}catch(Exception e){}
		
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
			signatureForWraApp =replaceSignatureForWellLic(licToDrillAWell.getWraApplicationId(), "Well Drilling Signature Applicant",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"well-drillers-1");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"well-drillers");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, 
			new String[] {
			//Applicant details
					"[$AppNo$]", "[$Applicantname$]", "[$Pari2$]", "[$ApplicantAdd$]", "[$DateB$]", "[$BackgroundEdu$]", "[$IndicateWell$]",
					"[$Welldrill$]", "[$AreEmp$]"/* , "[$Notemp$]" */, "[$EmpName$]", "[$HowPresent$]", "[$EmployerAdd$]", "[$StateNameFirst$]",
					"[$AddressFirst$]", "[$StateNameSecond$]","[$AddressSecond$]","[$ProcessedDate$]", "[$SignatureSi$]","[$PaymentMeth$]",

			},
			new String[] {
    		//Applicant details
    		Validator.isNotNull(licToDrillAWell)&&Validator.isNotNull(licToDrillAWell.getWellDrillingApplicationNo())?licToDrillAWell.getWellDrillingApplicationNo():"",
			Validator.isNotNull(licToDrillAWell)&&Validator.isNotNull(licToDrillAWell.getPermitDrillingApplicantName())?licToDrillAWell.getPermitDrillingApplicantName():"",
			Validator.isNotNull(licToDrillAWell)&&Validator.isNotNull(licToDrillAWell.getPermitDrillingAddressParish())?licToDrillAWell.getPermitDrillingAddressParish():"",
			Validator.isNotNull(licToDrillAWell)&&Validator.isNotNull(licToDrillAWell.getPermitDrillingApplicantAddress())?licToDrillAWell.getPermitDrillingApplicantAddress():"",
			Validator.isNotNull(licToDrillAWell)&&Validator.isNotNull(licToDrillAWell.getPermitDrillingDOBDate())?dateFormat.format(licToDrillAWell.getPermitDrillingDOBDate()):"",
			Validator.isNotNull(licToDrillAWell)&&Validator.isNotNull(licToDrillAWell.getPermitDrillingEducational())?licToDrillAWell.getPermitDrillingEducational():"",
			Validator.isNotNull(licToDrillAWell)&&Validator.isNotNull(licToDrillAWell.getPermitDrillingSpecificTraining())?licToDrillAWell.getPermitDrillingSpecificTraining():"",
			Validator.isNotNull(licToDrillAWell)&&Validator.isNotNull(licToDrillAWell.getPermitDrillingSpecificExp())?licToDrillAWell.getPermitDrillingSpecificExp():"",
			Validator.isNotNull(licToDrillAWell)&&Validator.isNotNull(licToDrillAWell.getPermitDrillingSelfEmployed())?licToDrillAWell.getPermitDrillingSelfEmployed():"",
					
			Validator.isNotNull(licToDrillAWell)&&Validator.isNotNull(licToDrillAWell.getPermitDrillingName())?licToDrillAWell.getPermitDrillingName():"",
			Validator.isNotNull(licToDrillAWell)&&Validator.isNotNull(licToDrillAWell.getPermitDrillingPresentEmployer())?licToDrillAWell.getPermitDrillingPresentEmployer():"",
			Validator.isNotNull(licToDrillAWell)&&Validator.isNotNull(licToDrillAWell.getPermitDrillingEmployerAddress())?licToDrillAWell.getPermitDrillingEmployerAddress():"",
			Validator.isNotNull(licToDrillAWell)&&Validator.isNotNull(licToDrillAWell.getPermitDrillingFirstRefName())?licToDrillAWell.getPermitDrillingFirstRefName():"",
			Validator.isNotNull(licToDrillAWell)&&Validator.isNotNull(licToDrillAWell.getPermitDrillingFirstRefAdd())?licToDrillAWell.getPermitDrillingFirstRefAdd():"",
			Validator.isNotNull(licToDrillAWell)&&Validator.isNotNull(licToDrillAWell.getPermitDrillingSecondRefName())?licToDrillAWell.getPermitDrillingSecondRefName():"",
			Validator.isNotNull(licToDrillAWell)&&Validator.isNotNull(licToDrillAWell.getPermitDrillingSecondRefAdd())?licToDrillAWell.getPermitDrillingSecondRefAdd():"",
			Validator.isNotNull(licToDrillAWell)&&Validator.isNotNull(licToDrillAWell.getPermitDrillingSignatureDate())?dateFormat.format(licToDrillAWell.getPermitDrillingSignatureDate()):"",
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
			String copyCertificate = "";
			String proofExp = "";
			String recentCerti = "";
			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
					} catch (Exception e) {}
				if(title.equals("Copies of applicant’s academic certificates")) {
					copyCertificate = fileName;
				}else if (title.equals("Proof of experience")) {
					proofExp = fileName;
				}else if (title.equals("A recent Police Certificate of Character")) {
					recentCerti = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
				"[$CopiesCerti$]","[$ProofEx$]","[$RecentCerti$]",
				},
				new String[] {
						copyCertificate, proofExp, recentCerti,
						
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

