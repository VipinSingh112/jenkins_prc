package com.nbp.osi.services.pdf.util;

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
import com.nbp.osi.services.application.form.service.model.OsiServicesApplicantinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplication;
import com.nbp.osi.services.application.form.service.model.OsiServicesAssignmentDetailinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesGeneralBenefitOfCreditorsinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesInsolventPersoninfo;
import com.nbp.osi.services.application.form.service.service.OsiServicesApplicantinfoLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesApplicationLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesAssignmentDetailinfoLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesInsolventPersoninfoLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class CertificateAssignmentPdf {
	public static String replaceSignatureForFrom(long osiServicesApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature General Benefit Creditors");
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
	public static String replaceSignatureForAssignment(long osiServicesApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature Assignment");
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
	public static String getCertificateAssignmentPdf(long osiServicesApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		OsiServicesApplication osiServicesApplication=null;
		OsiServicesApplicantinfo applicantDetail=null;
		OsiServicesInsolventPersoninfo insolventPersonInfo=null;
		OsiServicesGeneralBenefitOfCreditorsinfo formOfAssignment=null;
		OsiServicesAssignmentDetailinfo assignmentDetails=null;
		
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		//Signatures
		String signatureForForm = null;
		String signatureForAssignment = null;
		
		try {
			applicantDetail=OsiServicesApplicantinfoLocalServiceUtil.getOsiServiceApplicantInfoById(osiServicesApplicationId);
		}catch (Exception e) {
		}
		try {
			osiServicesApplication= OsiServicesApplicationLocalServiceUtil.getOsiServicesApplication(osiServicesApplicationId);
		}catch (Exception e) {
		}
		try {
			insolventPersonInfo= OsiServicesInsolventPersoninfoLocalServiceUtil.getOsiServicesInsolventPersoninfoById(osiServicesApplicationId);
		} catch (Exception e) {}
		try {
			formOfAssignment= OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceUtil.getOsiServicesGeneralBenefitOfCreditorsinfoById(osiServicesApplicationId);
		} catch (Exception e) {}
		try {
			assignmentDetails= OsiServicesAssignmentDetailinfoLocalServiceUtil.getOsiServiceAssignmentInfoById(osiServicesApplicationId);
		} catch (Exception e) {}
				
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Osi Services Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(), String.valueOf(osiServicesApplication.getOsiServicesApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//signatures
		try {
			signatureForForm =replaceSignatureForFrom(
					formOfAssignment.getOsiServicesApplicationId(), "Signature General Benefit Creditors",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		
		try {
			signatureForAssignment =replaceSignatureForAssignment(
					assignmentDetails.getOsiServicesApplicationId(), "Signature Assignment",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"sez-zone-user-1");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"certificates-of-assignment");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, 
			new String[] {
			//Applicant details
			"[$ApplicantName$]","[$CompanyName$]","[$FirstName$]","[$LastName$]","[$Address$]","[$EmailAddress$]","[$Telephone$]",
			"[$DateApplication$]","[$TRN$]",
			
			//Insolvent Person Details
			"[$InsolventPerson$]","[$CompanyNa$]","[$FirstNa$]","[$LastNa$]","[$AddressDe$]","[$ParishDe$]","[$EmailAddressDe$]","[$TelephoneDe$]","[$TRNDe$]",
			
			
			//Form of Assignment
			"[$GeneralName$]","[$Datedday$]","[$GeneralAddress$]","[$SignatureLegal$]",
			
			//Application for Assignment
			"[$Attachedare$]","[$NameAss$]","[$DatedAss$]","[$AddressAss$]",
			"[$SignatureAss$]",
			
			},
			new String[] {
    		//Applicant details
    		Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getApplicantNature())?applicantDetail.getApplicantNature():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getCompanyName())?applicantDetail.getCompanyName():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getIndiFirstName())?applicantDetail.getIndiFirstName():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getIndiLastName())?applicantDetail.getIndiLastName():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getAddress())?applicantDetail.getAddress():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getEmailAddress())?applicantDetail.getEmailAddress():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getTelephone())?applicantDetail.getTelephone():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getApplicationDate())?dateFormat.format(applicantDetail.getApplicationDate()):"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getTrnNumber())?applicantDetail.getTrnNumber():"",
					
			//Insolvent Person Details
			
			Validator.isNotNull(insolventPersonInfo)&&Validator.isNotNull(insolventPersonInfo.getInsolventPersonNature())?insolventPersonInfo.getInsolventPersonNature():"",
			Validator.isNotNull(insolventPersonInfo)&&Validator.isNotNull(insolventPersonInfo.getInsolventCompanyName())?insolventPersonInfo.getInsolventCompanyName():"",
			Validator.isNotNull(insolventPersonInfo)&&Validator.isNotNull(insolventPersonInfo.getInsolventIndiFirstName())?insolventPersonInfo.getInsolventIndiFirstName():"",
			Validator.isNotNull(insolventPersonInfo)&&Validator.isNotNull(insolventPersonInfo.getInsolventIndiLastName())?insolventPersonInfo.getInsolventIndiLastName():"",
			Validator.isNotNull(insolventPersonInfo)&&Validator.isNotNull(insolventPersonInfo.getInsolventAddress())?insolventPersonInfo.getInsolventAddress():"",
			Validator.isNotNull(insolventPersonInfo)&&Validator.isNotNull(insolventPersonInfo.getInsolventParish())?insolventPersonInfo.getInsolventParish():"",
			Validator.isNotNull(insolventPersonInfo)&&Validator.isNotNull(insolventPersonInfo.getInsolventEmailAddress())?insolventPersonInfo.getInsolventEmailAddress():"",
			Validator.isNotNull(insolventPersonInfo)&&Validator.isNotNull(insolventPersonInfo.getInsolventTelephone())?insolventPersonInfo.getInsolventTelephone():"",
			Validator.isNotNull(insolventPersonInfo)&&Validator.isNotNull(insolventPersonInfo.getInsolventTrnNumber())?insolventPersonInfo.getInsolventTrnNumber():"",
			
			//Form of Assignment
			Validator.isNotNull(formOfAssignment)&&Validator.isNotNull(formOfAssignment.getCreditorName())?formOfAssignment.getCreditorName():"",
			Validator.isNotNull(formOfAssignment)&&Validator.isNotNull(formOfAssignment.getCreditorDate())?dateFormat.format(formOfAssignment.getCreditorDate()):"",
			Validator.isNotNull(formOfAssignment)&&Validator.isNotNull(formOfAssignment.getCreditorAddress())?formOfAssignment.getCreditorAddress():"",
					signatureForForm,
					
			//Application for Assignment
			Validator.isNotNull(assignmentDetails)&&Validator.isNotNull(assignmentDetails.getSelectedAssignmentAttached())?assignmentDetails.getSelectedAssignmentAttached():"",
			Validator.isNotNull(assignmentDetails)&&Validator.isNotNull(assignmentDetails.getAssignmentName())?assignmentDetails.getAssignmentName():"",
			Validator.isNotNull(assignmentDetails)&&Validator.isNotNull(assignmentDetails.getAssignmentDated())?dateFormat.format(assignmentDetails.getAssignmentDated()):"",
			Validator.isNotNull(assignmentDetails)&&Validator.isNotNull(assignmentDetails.getAssignmentAddress())?assignmentDetails.getAssignmentAddress():"",
					signatureForAssignment
					
			});
				    }catch (Exception e) {
						// TODO: handle exception
					}
			
		if (!checkPdfDownloadWithoutDocument.equals("false")) {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
			String statementOfAffairs = "";
			String resolutionOfTheCorporation = "";
			String cojForm = "";
			
			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
				} catch (Exception e) {}
				if(title.equals("Statement of Affairs (Form 3)")) {
					statementOfAffairs = fileName;
				}else if (title.equals("Resolution of the corporation authorizing the assignment")) {
					resolutionOfTheCorporation = fileName;
				}else if (title.equals("COJ’s Form 5 Notification Filing Receipt")) {
					cojForm = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
					"[$StatementAffairs$]","[$ResolutionCorporation$]","[$FilingReceipt$]"
				},
				new String[] {
						statementOfAffairs,	resolutionOfTheCorporation,cojForm
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
