package com.nbp.explosive.pdf.util;

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
import com.nbp.explosives.competency.application.form.service.model.BlasterCompetencyForm;
import com.nbp.explosives.competency.application.form.service.model.ExplosiveAppPayment;
import com.nbp.explosives.competency.application.form.service.model.ExplosivesApplication;
import com.nbp.explosives.competency.application.form.service.service.BlasterCompetencyFormLocalServiceUtil;
import com.nbp.explosives.competency.application.form.service.service.ExplosiveAppPaymentLocalServiceUtil;
import com.nbp.explosives.competency.application.form.service.service.ExplosivesApplicationLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ExplosiveApplicationPdf {
	
	public static String replaceSignatureOfApplicant(long explosivesApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
			DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
					"Signature of Applicant");
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
	public static String replaceImageOfApplicant(long explosivesApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Image of Applicant");
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


public static String getBlasterPdf(long explosivesApplicationId, ThemeDisplay themeDisplay, String checkPdfDownloadWithoutDocument) {
String pdfTemplate = StringPool.BLANK;
DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
ExplosivesApplication explosivesApplication = null;
BlasterCompetencyForm blaster=null;
ExplosiveAppPayment explosivePayment =null;


//folder
List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
DLFolder supportingDocumentsFolder = null;
DLFolder supportingDocumentsParentFolder = null;
FileEntry fileEntry = null;
//Signatures
String signatureApplicant = null;
String imageApplicant = null;
String paymentMethodPdf="";

try {
	explosivesApplication=ExplosivesApplicationLocalServiceUtil.getExplosivesApplication(explosivesApplicationId);
} catch (Exception e) {}

try {
	blaster= BlasterCompetencyFormLocalServiceUtil.getExplosiveById(explosivesApplicationId);
}catch(Exception e) {}
try {
	explosivePayment= ExplosiveAppPaymentLocalServiceUtil.getExplosiveById(explosivesApplicationId);
	System.out.println("-----------------PaymentMethod----------------------------"+explosivePayment.getPaymentMethod());
	paymentMethodPdf=Validator.isNotNull(explosivePayment)&&Validator.isNotNull(explosivePayment.getPaymentMethod())?explosivePayment.getPaymentMethod():"";
}catch(Exception e) {}

try {
	supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Explosive Supported Documents");
	supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingDocumentsParentFolder.getFolderId(), String.valueOf(explosivesApplication.getExplosivesApplicationId()));
	supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
			supportingDocumentsFolder.getFolderId());
} catch (Exception e) {
	e.printStackTrace();
}
//signatures first
 		try { 
 			signatureApplicant=replaceSignatureOfApplicant(explosivesApplication.getExplosivesApplicationId(), "Signature of Applicant", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
 		} catch (Exception e) {}
 
 		try { 
 			imageApplicant=replaceImageOfApplicant(explosivesApplication.getExplosivesApplicationId(), "Image of Applicant", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
 		} catch (Exception e) {}
 		
//pdf go in launch case
		if (checkPdfDownloadWithoutDocument.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
					"blaster-s-competency-certificate-1");
		} else {
			try {
			pdfTemplate = getTemplateFromJournalArticlePDF
					(themeDisplay.getScopeGroupId(),
					"blaster-s-competency-certificate");
			}catch (Exception e) {
				
			}
		}
try {
	pdfTemplate = StringUtil.replace(pdfTemplate, 
	new String[] {
	//Personal Information         4
		"[$SurName1$]", "[$firstName$]", "[$middleInitial$]", "[$sex1$]", 
		
		
	  //Contact Information 9
		
		"[$OfficePhone$]", "[$CellPhone$]", "[$ApplicantTrn$]", "[$ApplicantBirth$]", "[$ADDress$]","[$EducationBackGround$]",
		"[$BlastingCourse$]", "[$CourceName$]","[$CourseOrganizer$]",
		
		//sign
		
		"[$SubmitterApplicant$]", "[$imageApplicant$]", 
		
		//date        1
		"[$SignatureApplicantDate$]",
		
		
	
	},
	new String[] {
			//Personal Information  4
				Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getSurName())?blaster.getSurName():"" ,
				Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getFirstName())?blaster.getFirstName():"",
				Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getMiddleName())?blaster.getMiddleName():"",
				Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getGender())?blaster.getGender():"",
				
			//contact information  9
				Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getOfficeNumber())?blaster.getOfficeNumber():"" ,
				Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getCellNum())?blaster.getCellNum():"",
				Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getTrnNum())?blaster.getTrnNum():"",
				Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getDateOfBirth())?dateFormat.format(blaster.getDateOfBirth()): "",
				Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getAddress())?blaster.getAddress():"",
				Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getEducationalBack())?blaster.getEducationalBack():"",
				Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getBlastingCourse())?blaster.getBlastingCourse():"",
				Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getNameOfCourse())?blaster.getNameOfCourse():"",	
				Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getCourseOrganiser())?blaster.getCourseOrganiser():"",
		
				//first signature 1	
				signatureApplicant,imageApplicant,
			
				//date 1
				Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getDateAppli())?dateFormat.format(blaster.getDateAppli()): "",
																																											
		});
		    }catch (Exception e) {
		    	System.out.println("---------------------------in catch block--------------------------------");
		    	e.printStackTrace();
				// TODO: handle exception
			}
	
if (!checkPdfDownloadWithoutDocument.equals("false"))  {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
			String photo = "";
			String poilce = "";
			
			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
				} catch (Exception e) {}
				if(title.equals("Photo Identification")) {
					photo = fileName;
				}else if (title.equals("Police Record")) {
					poilce = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
					"[$PhotoIdPyrotech$]", "[$PoliceRPyrotech$]", 
				},
				new String[] {
						photo ,poilce ,
					});
			}
			try {
				pdfTemplate = StringUtil.replace(pdfTemplate, new String[] { "[$PaymentMethodPyrotech$]" },
						new String[] { 
						paymentMethodPdf
						});
			} catch (Exception e) {
				e.printStackTrace();
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
