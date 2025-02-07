package com.nbp.sez.pdf.util;

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
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.SezStatusApplication;
import com.nbp.sez.status.application.form.service.model.SezStatusWFMLocationAdd;
import com.nbp.sez.status.application.form.service.model.SezStatusWorkFromHome;
import com.nbp.sez.status.application.form.service.service.SezStatusApplicationLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezStatusWFMLocationAddLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezStatusWorkFromHomeLocalServiceUtil;

import java.util.ArrayList;
import java.util.List;

public class SezPdfForWorkFromHome {
	public static String sezPfdfForWorkFromHome(long sezStatusApplicationId, ThemeDisplay themeDisplay,
			String checkPdfSendingInLaunchCaseWithoutDoc) {
       System.out.println("********Inside Work From Class **********");
		String pdfTemplate = StringPool.BLANK;
		SezStatusApplication sezStatusApplication = null;
		SezStatusWorkFromHome workFromHomeData=null;
		List<SezStatusWFMLocationAdd> statusWFhLocationData=null;
		try {
			sezStatusApplication=SezStatusApplicationLocalServiceUtil.getSezStatusApplication(sezStatusApplicationId);
		}catch (Exception e) {
		}
		try {
			workFromHomeData = SezStatusWorkFromHomeLocalServiceUtil.getSezById(sezStatusApplicationId);
		} catch (Exception e) {
		}
		try {
			statusWFhLocationData = SezStatusWFMLocationAddLocalServiceUtil.getSezStatusWFMLocationAddListById(sezStatusApplicationId);
		} catch (Exception e) {
		}
		if(checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),"work-from-home");
		}else {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),"work-from-home");
		}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
"[$SezCompanyName$]","[$ContactPersonName$]","[$SezContactEmail$]",
//location
"[$HomeLocationNum1$]","[$LocationSez1$]","[$ParishProgram1$]",
"[$HomeLocationNum2$]","[$LocationSez2$]","[$ParishProgram2$]",
"[$HomeLocationNum3$]","[$LocationSez3$]","[$ParishProgram3$]",
"[$HomeLocationNum4$]","[$LocationSez4$]","[$ParishProgram4$]",
"[$HomeLocationNum5$]","[$LocationSez5$]","[$ParishProgram5$]",

//How many workers will be utillizing WFH incentive
"[$WorkerNum$]","[$NumberOFMonths$]"
			},
    new String[] {
        Validator.isNotNull(workFromHomeData)&&Validator.isNotNull(workFromHomeData.getCompanyName())?workFromHomeData.getCompanyName():"",
        Validator.isNotNull(workFromHomeData)&&Validator.isNotNull(workFromHomeData.getContactPersonName())?workFromHomeData.getContactPersonName():"",
		Validator.isNotNull(workFromHomeData)&&Validator.isNotNull(workFromHomeData.getContactPersonEmail())?workFromHomeData.getContactPersonEmail():"",
				
		statusWFhLocationData!=null&&statusWFhLocationData.size()>0?statusWFhLocationData.get(0).getControlNumber():"",
	    statusWFhLocationData!=null&&statusWFhLocationData.size()>0?statusWFhLocationData.get(0).getLocation():"",
		statusWFhLocationData!=null&&statusWFhLocationData.size()>0?statusWFhLocationData.get(0).getParish():"",
				
		statusWFhLocationData!=null&&statusWFhLocationData.size()>1?statusWFhLocationData.get(1).getControlNumber():"",
	    statusWFhLocationData!=null&&statusWFhLocationData.size()>1?statusWFhLocationData.get(1).getLocation():"",
		statusWFhLocationData!=null&&statusWFhLocationData.size()>1?statusWFhLocationData.get(1).getParish():"",
						
        statusWFhLocationData!=null&&statusWFhLocationData.size()>2?statusWFhLocationData.get(2).getControlNumber():"",
	    statusWFhLocationData!=null&&statusWFhLocationData.size()>2?statusWFhLocationData.get(2).getLocation():"",
		statusWFhLocationData!=null&&statusWFhLocationData.size()>2?statusWFhLocationData.get(2).getParish():"",
				
	    statusWFhLocationData!=null&&statusWFhLocationData.size()>3?statusWFhLocationData.get(3).getControlNumber():"",
	    statusWFhLocationData!=null&&statusWFhLocationData.size()>3?statusWFhLocationData.get(3).getLocation():"",
		statusWFhLocationData!=null&&statusWFhLocationData.size()>3?statusWFhLocationData.get(3).getParish():"",
				
        statusWFhLocationData!=null&&statusWFhLocationData.size()>4?statusWFhLocationData.get(4).getControlNumber():"",
	    statusWFhLocationData!=null&&statusWFhLocationData.size()>4?statusWFhLocationData.get(4).getLocation():"",
		statusWFhLocationData!=null&&statusWFhLocationData.size()>4?statusWFhLocationData.get(4).getParish():"",
				
        Validator.isNotNull(workFromHomeData)&&Validator.isNotNull(workFromHomeData.getWorkerUtilizingIncentive())?workFromHomeData.getWorkerUtilizingIncentive():"",
		Validator.isNotNull(workFromHomeData)&&Validator.isNotNull(workFromHomeData.getWorkerUtilizingIncentiveMonth())?workFromHomeData.getWorkerUtilizingIncentiveMonth():"",
});
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Sez Status Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(sezStatusApplication.getSezStatusApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
		}
		if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
			String fileName = null;
			String title = null;
			String certificateCopyOfTheCom = null;
			String certificateOfIncorporation = null;
			String certificateCopyOfTax = null;
			String certifiedCopyOfGen = null;
			String certifiedCopyOfTaxCompliance = null;
			String proofOfIssued = null;
				for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
				try {
					fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
				} catch (PortalException e) {
					e.printStackTrace();
				}
				fileName = fileEntry.getFileName();
				title = fileEntry.getTitle();
				if (title.equals("Certified copy of the company Memorandum or Articles of Association")) {
					certificateCopyOfTheCom = fileName;
				} else if (title.equals("Certified copy of Certificate of Incorporation - This document is to be certified by the Companies Office of Jamaica (COJ)")) {
					certificateOfIncorporation = fileName;
				} else if (title.equals("Certified copy of Tax Registration Number (TRN)")) {
					certificateCopyOfTax = fileName;
				} else if (title.equals("Certified copy of the General Consumption Tax (GCT) number")) {
					certifiedCopyOfGen = fileName;
				} else if (title.equals("Certified copy of Tax Compliance Certificate (TCC)")) {
					certifiedCopyOfTaxCompliance = fileName;
				}else if (title.equals("Proof of issued and paid-up shared capital not less than US$25000")) {
					proofOfIssued = fileName;
				}
			}
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//		for the document 
"[$ArticlesAssociation$]","[$IncorporationCopyOffice$]","[$RegistrationTaxNum$]"
,"[$ConsumptionTaxGen$]","[$CertificateCopyTax$]","[$ProofPaidUp$]"			
},
		new String[] {
				certificateCopyOfTheCom,certificateOfIncorporation,certificateCopyOfTax,certifiedCopyOfGen,
				certifiedCopyOfTaxCompliance,proofOfIssued
					});
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
