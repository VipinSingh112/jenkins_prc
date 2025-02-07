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
import com.nbp.osi.services.application.form.service.model.OSIServiceSupportingDocInd;
import com.nbp.osi.services.application.form.service.model.OsiServicesAppPayment;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplicantinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplication;
import com.nbp.osi.services.application.form.service.model.OsiServicesAssignmentDetailinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesGeneralBenefitOfCreditorsinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesInsolventPersoninfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeBreadDownAddinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeDeclerationAndSignatureinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeIndividualDetailinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeIndividualQualificationinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeLicenseBreakdowninfo;
import com.nbp.osi.services.application.form.service.service.OSIServiceSupportingDocIndLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesAppPaymentLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesApplicantinfoLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesApplicationLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesAssignmentDetailinfoLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesInsolventPersoninfoLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeBreadDownAddinfoLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeDeclerationAndSignatureinfoLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeIndividualDetailinfoLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeIndividualQualificationinfoLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeLicenseBreakdowninfoLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class TrusteeLicenceIndividual {
	public static String replaceSignatureForQualification(long osiServicesApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature Trustee Qualification");
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
	public static String replaceSignatureForTrusteeAppli(long osiServicesApplicationId, String folderName, long groupId,
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
	public static String replaceSignatureForTrusteeUndersigned(long osiServicesApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature Trustee Undersigned");
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
	public static String replaceSignatureForApplicant(long osiServicesApplicationId, String folderName, long groupId,
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
	public static String replaceSignatureForTrustee(long osiServicesApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Trustee");
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
	public static String getOsiIndividualPdf(long osiServicesApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		OsiServicesApplication osiServicesApplication=null;
		OsiServicesTrusteeIndividualDetailinfo trusteeIndiDetailInfo=null;
		OsiServicesTrusteeIndividualQualificationinfo indiQualificationInfo=null;
		OsiServicesTrusteeDeclerationAndSignatureinfo declerationAndSignature=null;
		OsiServicesTrusteeLicenseBreakdowninfo licenceBreakdownInfo=null;
		List<OsiServicesTrusteeBreadDownAddinfo> breadDownAddInfo=null;
		OSIServiceSupportingDocInd supportingDoc=null;
		OsiServicesAppPayment osiServicesPayment=null;
		try {
			osiServicesPayment=OsiServicesAppPaymentLocalServiceUtil.getOsiServiceAppPaymentById(osiServicesApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		//Signatures
		String signatureForQualification = null;
		String signatureForTrusteeUndersigned = null;
		String signatureForApplicant = null;
		String signatureForTrustee = null;
		try {
			osiServicesApplication= OsiServicesApplicationLocalServiceUtil.getOsiServicesApplication(osiServicesApplicationId);
		}catch (Exception e) {
		}
		try {
			trusteeIndiDetailInfo=OsiServicesTrusteeIndividualDetailinfoLocalServiceUtil.getOsiServicesTrusteeIndividualDetailinfoById(osiServicesApplicationId);
		}catch (Exception e) {
		}
		try {
			indiQualificationInfo= OsiServicesTrusteeIndividualQualificationinfoLocalServiceUtil.getOsiServicesTrusteeIndividualQualificationinfoById(osiServicesApplicationId);
		} catch (Exception e) {}
		try {
			declerationAndSignature= OsiServicesTrusteeDeclerationAndSignatureinfoLocalServiceUtil.getOsiServicesTrusteeDeclerationAndSignatureinfoById(osiServicesApplicationId);
		} catch (Exception e) {}
		try {
			licenceBreakdownInfo= OsiServicesTrusteeLicenseBreakdowninfoLocalServiceUtil.getOsiServicesTrusteeLicenseBreakdowninfoById(osiServicesApplicationId);
		} catch (Exception e) {}
		try {
			breadDownAddInfo= OsiServicesTrusteeBreadDownAddinfoLocalServiceUtil.getBreakDownAdd_By_Id(osiServicesApplicationId);
		} catch (Exception e) {}
				
		try {
			supportingDoc=OSIServiceSupportingDocIndLocalServiceUtil.getOSIService_ById(osiServicesApplicationId);
		}catch (Exception e) {
		}
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
			signatureForQualification =replaceSignatureForQualification(
					osiServicesApplication.getOsiServicesApplicationId(), "Signature Trustee Qualification",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		try {
			signatureForTrusteeUndersigned =replaceSignatureForTrusteeUndersigned(
					osiServicesApplication.getOsiServicesApplicationId(), "Signature Trustee Undersigned",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		try {
			signatureForApplicant =replaceSignatureForApplicant(
					osiServicesApplication.getOsiServicesApplicationId(), "Signature of Applicant",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		try {
			signatureForTrustee =replaceSignatureForTrustee(
					osiServicesApplication.getOsiServicesApplicationId(), "Signature of Trustee",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
//		
		
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"sez-zone-user-1");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"osi-individual");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, 
			new String[] {
//	for the truesteLicenceIndi
					"[$FamilyName$]","[$GivenName$]","[$DateBirth$]","[$Aliases$]","[$BusinessAddress$]","[$Telephone$]",
					"[$FaxNo$]","[$Email$]","[$HomeAddress$]","[$TelephoneNo$]","[$fax$]","[$EmailAddress$]",
					"[$CurrentEmployer$]","[$DateOfEmployment$]","[$ProfessionalOrganization$]",
					"[$Signature$]",
					"[$MemberProfOrg$]",
//					dec and signature
					"[$BlockLetters$]","[$DatedDay$]",
					"[$SignatureSi$]",
					"[$TrusteeApplicant$]","[$Firm$]",
//					add wale
					"[$During1$]","[$Individual1$]","[$Proposals1$]","[$Bankruptcies1$]","[$Commercial1$]","[$Interim1$]","[$Agency1$]","[$Insolvency1$]",
					"[$During2$]","[$Individual2$]","[$Proposals2$]","[$Bankruptcies2$]","[$Commercial2$]","[$Interim2$]","[$Agency2$]","[$Insolvency2$]",
					"[$During3$]","[$Individual3$]","[$Proposals3$]","[$Bankruptcies3$]","[$Commercial3$]","[$Interim3$]","[$Agency3$]","[$Insolvency3$]",
					"[$During4$]","[$Individual4$]","[$Proposals4$]","[$Bankruptcies4$]","[$Commercial4$]","[$Interim4$]","[$Agency4$]","[$Insolvency4$]",
					"[$During5$]","[$Individual5$]","[$Proposals5$]","[$Bankruptcies5$]","[$Commercial5$]","[$Interim5$]","[$Agency5$]","[$Insolvency5$]",
//					sig
					"[$SignaturePer$]",
					"[$DateOf$]","[$TrusteeLetter$]","[$DateN$]",
					"[$Signaturetrust$]",
//					signature
					"[$CurriculumCheck$]"/*,"[$DetailedDescCheck$]","[$RecentAppCheck$]","[$ChequePayCheck$]","[$SupportingLetterCheck$]","[$BalanceCheck$]",
					"[$ResourcesCheck$]","[$EvidenceOfCheck$]"*/
			
			},
			new String[] {
    		//Applicant details
	Validator.isNotNull(trusteeIndiDetailInfo)&&Validator.isNotNull(trusteeIndiDetailInfo.getIndiFamilyName())?trusteeIndiDetailInfo.getIndiFamilyName():"",
	Validator.isNotNull(trusteeIndiDetailInfo)&&Validator.isNotNull(trusteeIndiDetailInfo.getIndiGivenName())?trusteeIndiDetailInfo.getIndiGivenName():"",
	Validator.isNotNull(trusteeIndiDetailInfo)&&Validator.isNotNull(trusteeIndiDetailInfo.getIndiDateOfBirth())?dateFormat.format(trusteeIndiDetailInfo.getIndiDateOfBirth()):"",
	Validator.isNotNull(trusteeIndiDetailInfo)&&Validator.isNotNull(trusteeIndiDetailInfo.getIndiOtherLegalNames())?trusteeIndiDetailInfo.getIndiOtherLegalNames():"",
	Validator.isNotNull(trusteeIndiDetailInfo)&&Validator.isNotNull(trusteeIndiDetailInfo.getIndiBusinessAddress())?trusteeIndiDetailInfo.getIndiBusinessAddress():"",
	Validator.isNotNull(trusteeIndiDetailInfo)&&Validator.isNotNull(trusteeIndiDetailInfo.getIndiBusinessTeleNo())?trusteeIndiDetailInfo.getIndiBusinessTeleNo():"",
	Validator.isNotNull(trusteeIndiDetailInfo)&&Validator.isNotNull(trusteeIndiDetailInfo.getIndiBusinessFaxNo())?trusteeIndiDetailInfo.getIndiBusinessFaxNo():"",
	Validator.isNotNull(trusteeIndiDetailInfo)&&Validator.isNotNull(trusteeIndiDetailInfo.getIndiBusinessEmail())?trusteeIndiDetailInfo.getIndiBusinessEmail():"",
	Validator.isNotNull(trusteeIndiDetailInfo)&&Validator.isNotNull(trusteeIndiDetailInfo.getIndiHomeAddress())?trusteeIndiDetailInfo.getIndiHomeAddress():"",
	Validator.isNotNull(trusteeIndiDetailInfo)&&Validator.isNotNull(trusteeIndiDetailInfo.getIndiHomeTeleNo())?trusteeIndiDetailInfo.getIndiHomeTeleNo():"",
	Validator.isNotNull(trusteeIndiDetailInfo)&&Validator.isNotNull(trusteeIndiDetailInfo.getIndiHomeFaxNo())?trusteeIndiDetailInfo.getIndiHomeFaxNo():"",
	Validator.isNotNull(trusteeIndiDetailInfo)&&Validator.isNotNull(trusteeIndiDetailInfo.getIndiHomeEmail())?trusteeIndiDetailInfo.getIndiHomeEmail():"",
	Validator.isNotNull(trusteeIndiDetailInfo)&&Validator.isNotNull(trusteeIndiDetailInfo.getIndiCurrentEmployer())?trusteeIndiDetailInfo.getIndiCurrentEmployer():"",
    Validator.isNotNull(trusteeIndiDetailInfo)&&Validator.isNotNull(trusteeIndiDetailInfo.getIndiDateOfEmployment())?dateFormat.format(trusteeIndiDetailInfo.getIndiDateOfEmployment()):"",
    Validator.isNotNull(trusteeIndiDetailInfo)&&Validator.isNotNull(trusteeIndiDetailInfo.getIndiProfessionalOrg())?trusteeIndiDetailInfo.getIndiProfessionalOrg():"",
    		signatureForQualification,
Validator.isNotNull(indiQualificationInfo)&&Validator.isNotNull(indiQualificationInfo.getOrgMember())?indiQualificationInfo.getOrgMember():"",
Validator.isNotNull(declerationAndSignature)&&Validator.isNotNull(declerationAndSignature.getIndiUndersignedApplicantName())?declerationAndSignature.getIndiUndersignedApplicantName():"",
Validator.isNotNull(declerationAndSignature)&&Validator.isNotNull(declerationAndSignature.getIndiUndersignedDated())?dateFormat.format(declerationAndSignature.getIndiUndersignedDated()):"",
//    				signature
		signatureForTrusteeUndersigned,
Validator.isNotNull(licenceBreakdownInfo)&&Validator.isNotNull(licenceBreakdownInfo.getIndiBreakdownApplicantName())?licenceBreakdownInfo.getIndiBreakdownApplicantName():"",
Validator.isNotNull(licenceBreakdownInfo)&&Validator.isNotNull(licenceBreakdownInfo.getIndiBreakdownFirm())?licenceBreakdownInfo.getIndiBreakdownFirm():"",
		
	        (breadDownAddInfo!=null)&&(breadDownAddInfo.size()>0)?breadDownAddInfo.get(0).getBreakdownWorkingYear():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>0)?breadDownAddInfo.get(0).getWorkingBankrupties():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>0)?breadDownAddInfo.get(0).getWorkingProposal():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>0)?breadDownAddInfo.get(0).getWorkingComBankrupts():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>0)?breadDownAddInfo.get(0).getWorkingComProposal():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>0)?breadDownAddInfo.get(0).getWorkingInterimReceive():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>0)?breadDownAddInfo.get(0).getBreakdownWorkingCreditors():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>0)?breadDownAddInfo.get(0).getBreakdownWorkingOther():"",
					
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>1)?breadDownAddInfo.get(1).getBreakdownWorkingYear():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>1)?breadDownAddInfo.get(1).getWorkingBankrupties():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>1)?breadDownAddInfo.get(1).getWorkingProposal():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>1)?breadDownAddInfo.get(1).getWorkingComBankrupts():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>1)?breadDownAddInfo.get(1).getWorkingComProposal():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>1)?breadDownAddInfo.get(1).getWorkingInterimReceive():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>1)?breadDownAddInfo.get(1).getBreakdownWorkingCreditors():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>1)?breadDownAddInfo.get(1).getBreakdownWorkingOther():"",
					
            (breadDownAddInfo!=null)&&(breadDownAddInfo.size()>2)?breadDownAddInfo.get(2).getBreakdownWorkingYear():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>2)?breadDownAddInfo.get(2).getWorkingBankrupties():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>2)?breadDownAddInfo.get(2).getWorkingProposal():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>2)?breadDownAddInfo.get(2).getWorkingComBankrupts():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>2)?breadDownAddInfo.get(2).getWorkingComProposal():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>2)?breadDownAddInfo.get(2).getWorkingInterimReceive():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>2)?breadDownAddInfo.get(2).getBreakdownWorkingCreditors():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>2)?breadDownAddInfo.get(2).getBreakdownWorkingOther():"",
					
            (breadDownAddInfo!=null)&&(breadDownAddInfo.size()>3)?breadDownAddInfo.get(3).getBreakdownWorkingYear():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>3)?breadDownAddInfo.get(3).getWorkingBankrupties():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>3)?breadDownAddInfo.get(3).getWorkingProposal():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>3)?breadDownAddInfo.get(3).getWorkingComBankrupts():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>3)?breadDownAddInfo.get(3).getWorkingComProposal():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>3)?breadDownAddInfo.get(3).getWorkingInterimReceive():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>3)?breadDownAddInfo.get(3).getBreakdownWorkingCreditors():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>3)?breadDownAddInfo.get(3).getBreakdownWorkingOther():"",
					
            (breadDownAddInfo!=null)&&(breadDownAddInfo.size()>4)?breadDownAddInfo.get(4).getBreakdownWorkingYear():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>4)?breadDownAddInfo.get(4).getWorkingBankrupties():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>4)?breadDownAddInfo.get(4).getWorkingProposal():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>4)?breadDownAddInfo.get(4).getWorkingComBankrupts():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>4)?breadDownAddInfo.get(4).getWorkingComProposal():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>4)?breadDownAddInfo.get(4).getWorkingInterimReceive():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>4)?breadDownAddInfo.get(4).getBreakdownWorkingCreditors():"",
			(breadDownAddInfo!=null)&&(breadDownAddInfo.size()>4)?breadDownAddInfo.get(4).getBreakdownWorkingOther():"",
					signatureForApplicant,
					
	Validator.isNotNull(licenceBreakdownInfo)&&Validator.isNotNull(licenceBreakdownInfo.getIndiBreakdownDated())?dateFormat.format(licenceBreakdownInfo.getIndiBreakdownDated()):"",
	Validator.isNotNull(licenceBreakdownInfo)&&Validator.isNotNull(licenceBreakdownInfo.getIndiBreakdownTrusteeName())?licenceBreakdownInfo.getIndiBreakdownTrusteeName():"",
	Validator.isNotNull(licenceBreakdownInfo)&&Validator.isNotNull(licenceBreakdownInfo.getIndiBreakdownTrusteeDate())?dateFormat.format(licenceBreakdownInfo.getIndiBreakdownTrusteeDate()):"",
	signatureForTrustee,
	Validator.isNotNull(supportingDoc)&&Validator.isNotNull(supportingDoc.getSupportingDocCheckboxes())?supportingDoc.getSupportingDocCheckboxes():"",
//					signature
					
			});}catch (Exception e) {
						// TODO: handle exception
					}
			
		if (!checkPdfDownloadWithoutDocument.equals("false")) {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
			String aCurriculum = "";
			String aDetailedDesc = "";
			String aRecentPhotograph = "";
			String aCheque = "";
			String aSupporting = "";
			String aPersonal = "";
			String aDetails = "";
			String evidenceOfInsurance = "";
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
				} catch (Exception e) {}
				if(title.equals("A curriculum vitae containing the applicant academic background")) {
					aCurriculum = fileName;
				}else if (title.equals("A detailed description of experience in bankruptcy administration")) {
					aDetailedDesc = fileName;
				}else if (title.equals("A recent photograph of the applicant")) {
					aRecentPhotograph = fileName;
				}else if (title.equals("A cheque for payable to the Supervisor of Insolvency of Jamaica")) {
					aCheque = fileName;
				}else if (title.equals("A supporting letter in which the employer or a partner undertakes to provide the necessary resources")) {
					aSupporting = fileName;
				}else if (title.equals("A personal balance sheet")) {
					aPersonal = fileName;
				}else if (title.equals("A Details of necessary resources that will be at the applicant disposal")) {
					aDetails = fileName;
				}else if (title.equals("Evidence of insurance coverage for the applicant")) {
					evidenceOfInsurance = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
					"[$Curriculum$]","[$DetailedDescription$]","[$RecentPhotograph$]","[$InsolvencyJamaica$]",
					"[$Resources$]","[$BalanceSheet$]","[$ApplicantDisposal$]","[$Evidence$]",
					"[$PaymentMethodIndi$]"
				},
				new String[] {
						aCurriculum,aDetailedDesc,aRecentPhotograph,aCheque,aSupporting,aPersonal,aDetails,evidenceOfInsurance,
						Validator.isNotNull(osiServicesPayment)&&Validator.isNotNull(osiServicesPayment.getPaymentMethod())?osiServicesPayment.getPaymentMethod():"",
						
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
