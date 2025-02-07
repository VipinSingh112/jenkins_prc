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
import com.nbp.wra.application.form.service.model.PermitToDrillAWell;
import com.nbp.wra.application.form.service.model.WRAAppPayment;
import com.nbp.wra.application.form.service.model.WRAApplication;
import com.nbp.wra.application.form.service.service.PermitToDrillAWellLocalServiceUtil;
import com.nbp.wra.application.form.service.service.WRAAppPaymentLocalServiceUtil;
import com.nbp.wra.application.form.service.service.WRAApplicationLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class PermitToDrillWellPdf {
	public static String replaceSignatureForPermit(long wraApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Permit Signature Applicant");
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

	
public static String getPermitToDrillWellPdf(long wraApplicationId, ThemeDisplay themeDisplay,String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		WRAApplication wraApplication=null;
		PermitToDrillAWell permitToDrillAWell=null;
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
			permitToDrillAWell= PermitToDrillAWellLocalServiceUtil.getPermitToDrillAWell_By_WRAAppId(wraApplicationId);
		}catch(Exception e){}
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
			signatureForWraApp =replaceSignatureForPermit(permitToDrillAWell.getWraApplicationId(), "Permit Signature Applicant",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"new-permit-1");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"new-permit");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, 
			new String[] {
			//Applicant details
				"[$AppNo$]", "[$Applicantname$]", "[$Pari6$]", "[$MailingApp$]", "[$Emailad$]", "[$OfficePh$]", "[$Mphone$]", "[$Hphone$]",
				"[$Locationwork$]", "[$Indicateland$]", "[$NameContract$]", "[$ParishA$]", "[$Addcon$]", "[$PurposeDrill$]", 
				"[$Depthwell$]", "[$Diametercenti$]", "[$MethodDrill$]", "[$Mconstruction$]", "[$Inlining$]", 
				"[$OtherTech$]", "[$VolumeDay$]", "[$AnyApp$]", "[$SignatureSi$]", "[$DateDrilling$]","[$PaymentMethod$]",

			},
			new String[] {
    		//Applicant details
    		Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getPermitDrillApplicationNum())?permitToDrillAWell.getPermitDrillApplicationNum():"",
			Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getPermitDrillingApplicantName())?permitToDrillAWell.getPermitDrillingApplicantName():"",
			Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getPermitDrillingMailingAddParish())?permitToDrillAWell.getPermitDrillingMailingAddParish():"",
			Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getPermitDrillingMailingAddress())?permitToDrillAWell.getPermitDrillingMailingAddress():"",
			Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getPermitDrillingEmailAddress())?permitToDrillAWell.getPermitDrillingEmailAddress():"",
			Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getPermitDrillingOfficePhone())?permitToDrillAWell.getPermitDrillingOfficePhone():"",
			Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getPermitDrillingMobilePhone())?permitToDrillAWell.getPermitDrillingMobilePhone():"",
			Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getWellDrillingHomePhone())?permitToDrillAWell.getWellDrillingHomePhone():"",
			//Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getPermitDrillingWorkLocation())?permitToDrillAWell.getPermitDrillingWorkLocation():"",
			Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getPermitDrillingLocation())?permitToDrillAWell.getPermitDrillingLocation():"",
			Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getPermitDrillingNature())?permitToDrillAWell.getPermitDrillingNature():"",
			Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getPermitDrillingContractorName())?permitToDrillAWell.getPermitDrillingContractorName():"",
			Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getPermitDrillContractAddress())?permitToDrillAWell.getPermitDrillContractAddress():"",
			Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getPermitDrillingContractorAdd())?permitToDrillAWell.getPermitDrillingContractorAdd():"",
			Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getPermitDrillingPurpose())?permitToDrillAWell.getPermitDrillingPurpose():"",
			Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getPermitDrillingBoreholeDepth())?permitToDrillAWell.getPermitDrillingBoreholeDepth():"",
			Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getPermitDrillingDiameterBorehole())?permitToDrillAWell.getPermitDrillingDiameterBorehole():"",
			Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getPermitDrillingMethod())?permitToDrillAWell.getPermitDrillingMethod():"",
			Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getPermitDrillingConstMethod())?permitToDrillAWell.getPermitDrillingConstMethod():"",
			Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getPermitDrillingSupplies())?permitToDrillAWell.getPermitDrillingSupplies():"",
			Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getPermitDrillingTechnicalInfo())?permitToDrillAWell.getPermitDrillingTechnicalInfo():"",
			Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getPermitDrillingCubic())?permitToDrillAWell.getPermitDrillingCubic():"",
			Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getPermitDrillingAuthority())?permitToDrillAWell.getPermitDrillingAuthority():"",
			signatureForWraApp,
			Validator.isNotNull(permitToDrillAWell)&&Validator.isNotNull(permitToDrillAWell.getPermitDrillingSignDate())?dateFormat.format(permitToDrillAWell.getPermitDrillingSignDate()):"",
			//signatureForWraApp,
			Validator.isNotNull(wraPayment)&&Validator.isNotNull(wraPayment.getPaymentMethod())?wraPayment.getPaymentMethod():"",		
					
			});
				    }catch (Exception e) {
						// TODO: handle exception
					}
			
		if (!checkPdfDownloadWithoutDocument.equals("false")) {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
			String siteLoc = "";
			String proofLoc = "";
			String siteAdv = "";
			String payAppli = "";
			String goodStand = "";
			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
				} catch (Exception e) {}
				if(title.equals("Site Map at scale of 1:50.000-showing location of proposed well(2set)")) {
					siteLoc = fileName;
				}else if (title.equals("Proof of ownership - or right to access of property on which water source is located")) {
					proofLoc = fileName;
				}else if (title.equals("Advertisements (2) in a Local Daily Newspaper - indicating intent to drill well at requested site")) {
					siteAdv = fileName;
				}else if (title.equals("Payment Voucher - for the non-refundable application and processing fee should be presented upon submission of the application")) {
					payAppli = fileName;
				}else if (title.equals("Certificate of Good Standing")) {
					goodStand = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
				"[$SiteLocation$]","[$ProofLocated$]","[$AdvertisementSite$]","[$PayAppli$]",
				},
				new String[] {
						siteLoc, proofLoc, siteAdv,payAppli, 
						
						
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
