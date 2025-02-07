package com.nbp.ogt.pdf.util;

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
import com.nbp.ogt.application.form.services.model.OgtApplication;
import com.nbp.ogt.application.form.services.model.OgtClaimToProperty;
import com.nbp.ogt.application.form.services.model.OgtClaimToSpouse;
import com.nbp.ogt.application.form.services.model.OgtClaimantDetail;
import com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetail;
import com.nbp.ogt.application.form.services.model.OgtProofOfClaim;
import com.nbp.ogt.application.form.services.service.OgtApplicationLocalServiceUtil;
import com.nbp.ogt.application.form.services.service.OgtClaimToPropertyLocalServiceUtil;
import com.nbp.ogt.application.form.services.service.OgtClaimToSpouseLocalServiceUtil;
import com.nbp.ogt.application.form.services.service.OgtClaimantDetailLocalServiceUtil;
import com.nbp.ogt.application.form.services.service.OgtInsolventPersonDetailLocalServiceUtil;
import com.nbp.ogt.application.form.services.service.OgtProofOfClaimLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class OgtBankruptcyClaimBySpousePdf {
	public static String replaceSignatureForOgt1(long ogtApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Person Completing Form");
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

	public static String replaceSignatureForOgt2(long miningApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Justice Peace");
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

	public static String ogtClaimBySpousePdf(long ogtApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		OgtApplication ogtApplication = null;
		OgtClaimantDetail claimantDetail = null;
		OgtInsolventPersonDetail insolventDetail = null;
		OgtProofOfClaim creditorClaim = null;
		OgtClaimToProperty formB = null;
		OgtClaimToSpouse formC = null;
		// folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;

		// Signatures
		String signatureForOgt1 = null;
		String signatureForOgt2 = null;

		try {
			claimantDetail = OgtClaimantDetailLocalServiceUtil.getOgtById(ogtApplicationId);
		} catch (Exception e) {
		}
		try {
			ogtApplication = OgtApplicationLocalServiceUtil.getOgtApplication(ogtApplicationId);
		} catch (Exception e) {
		}
		try {
			insolventDetail = OgtInsolventPersonDetailLocalServiceUtil.getOgtById(ogtApplicationId);
		} catch (Exception e) {
		}
		try {
			creditorClaim = OgtProofOfClaimLocalServiceUtil.getOgtById(ogtApplicationId);
		} catch (Exception e) {
		}
		try {
			formB = OgtClaimToPropertyLocalServiceUtil.getOgtById(ogtApplicationId);
		} catch (Exception e) {
		}
		try {
			formC = OgtClaimToSpouseLocalServiceUtil.getOgtById(ogtApplicationId);
		} catch (Exception e) {
		}
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "OGT Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(ogtApplication.getOgtApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		// signatures

		try {
			signatureForOgt1 = replaceSignatureForOgt1(ogtApplication.getOgtApplicationId(),
					"Signature of Person Completing Form", themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
		}
		try {
			signatureForOgt2 = replaceSignatureForOgt2(ogtApplication.getOgtApplicationId(),
					"Signature of Justice Peace", themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {
		}

		// pdf go in launch case
		if (checkPdfDownloadWithoutDocument.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(), "ogt-spouse-1");
		} else {
			try {
				pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(), "ogt-spouse");
			} catch (Exception e) {

			}
		}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
					// Claimant details 10

					"[$ClName$]", "[$Fname$]", "[$Lname$]", "[$ComName$]", "[$Adres$]", "[$Eaddress$]", "[$Tphone$]",
					"[$Fno$]", "[$AppDate$]", "[$Tr$]",

					// Insolvent Person Details 4

					"[$NatureDeb$]", "[$NameF$]", "[$NameL$]", "[$Namecompy$]",

					// proof of claim 3

					"[$Inmatter$]", "[$DebtorN$]", "[$ClaimantN$]",
					// NOTICES TO THE CLAIMANT SHOULD BE SENT TO: 4
					"[$Address1$]", "[$Pho$]", "[$NoFax$]", "[$MailAdd$]",
					// CLAIM 3
					"[$Nameform$]", "[$Positionform$]", "[$CertifyAm$]",

					// CLAIM TO PROPERTY (Section 105) (Bankruptcy only) 3
					"[$DateBank$]", "[$Thatday$]",
//					"[$Prointerest$]",

					// CLAIM BY SPOUSE (Section 99) (Bankruptcy Only): 5
					"[$PersonName$]", "[$CompletingDate$]", "[$AddressHalf$]",

					// Signature 1
					"[$Signature1$]",
//					 justice 2
					"[$JusticeName$]", "[$ParishCompleting$]",

					// Signature 1
					"[$Signature$]",

			}, new String[] {

					// Claimant details 10

					Validator.isNotNull(claimantDetail) && Validator.isNotNull(claimantDetail.getClaimantName())
							? claimantDetail.getClaimantName()
							: "",
					Validator.isNotNull(claimantDetail) && Validator.isNotNull(claimantDetail.getClaimantFirstName())
							? claimantDetail.getClaimantFirstName()
							: "",
					Validator.isNotNull(claimantDetail) && Validator.isNotNull(claimantDetail.getClaimantLastName())
							? claimantDetail.getClaimantLastName()
							: "",
					Validator.isNotNull(claimantDetail) && Validator.isNotNull(claimantDetail.getClaimantCompanyName())
							? claimantDetail.getClaimantCompanyName()
							: "",
					Validator.isNotNull(claimantDetail) && Validator.isNotNull(claimantDetail.getClaimantAddress())
							? claimantDetail.getClaimantAddress()
							: "",
					Validator.isNotNull(claimantDetail) && Validator.isNotNull(claimantDetail.getClaimantEmailAddr())
							? claimantDetail.getClaimantEmailAddr()
							: "",
					Validator.isNotNull(claimantDetail) && Validator.isNotNull(claimantDetail.getClaimantTeleNum())
							? claimantDetail.getClaimantTeleNum()
							: "",
					Validator.isNotNull(claimantDetail) && Validator.isNotNull(claimantDetail.getClaimantFaxNo())
							? claimantDetail.getClaimantFaxNo()
							: "",
					Validator.isNotNull(claimantDetail) && Validator.isNotNull(claimantDetail.getClaimantDate())
							? dateFormat.format(claimantDetail.getClaimantDate())
							: "",
					Validator.isNotNull(claimantDetail) && Validator.isNotNull(claimantDetail.getClaimantTrn())
							? claimantDetail.getClaimantTrn()
							: "",

					// Insolvent Person Details 4
					Validator.isNotNull(insolventDetail) && Validator.isNotNull(insolventDetail.getNatureOfInsolvent())
							? insolventDetail.getNatureOfInsolvent()
							: "",
					Validator.isNotNull(insolventDetail) && Validator.isNotNull(insolventDetail.getInsolventFirstName())
							? insolventDetail.getInsolventFirstName()
							: "",
					Validator.isNotNull(insolventDetail) && Validator.isNotNull(insolventDetail.getInsolventLastName())
							? insolventDetail.getInsolventLastName()
							: "",
					Validator.isNotNull(insolventDetail)
							&& Validator.isNotNull(insolventDetail.getInsolventCompanyName())
									? insolventDetail.getInsolventCompanyName()
									: "",

					// proof of claim 3
					Validator.isNotNull(creditorClaim) && Validator.isNotNull(creditorClaim.getClaimProofMatter())
							? creditorClaim.getClaimProofMatter()
							: "",
					Validator.isNotNull(creditorClaim) && Validator.isNotNull(creditorClaim.getClaimDebtorName())
							? creditorClaim.getClaimDebtorName()
							: "",
					Validator.isNotNull(creditorClaim) && Validator.isNotNull(creditorClaim.getClaimantName())
							? creditorClaim.getClaimantName()
							: "",

					// NOTICES TO THE CLAIMANT SHOULD BE SENT TO: 4

					Validator.isNotNull(creditorClaim) && Validator.isNotNull(creditorClaim.getClaimSentAddress())
							? creditorClaim.getClaimSentAddress()
							: "",
					Validator.isNotNull(creditorClaim) && Validator.isNotNull(creditorClaim.getClaimSentPhoneNum())
							? creditorClaim.getClaimSentPhoneNum()
							: "",
					Validator.isNotNull(creditorClaim) && Validator.isNotNull(creditorClaim.getClaimSentFaxNo())
							? creditorClaim.getClaimSentFaxNo()
							: "",
					Validator.isNotNull(creditorClaim) && Validator.isNotNull(creditorClaim.getClaimSentEmailAddr())
							? creditorClaim.getClaimSentEmailAddr()
							: "",

							
							
							
							
							
							
					// CLAIM 3
					Validator.isNotNull(creditorClaim) && Validator.isNotNull(creditorClaim.getClaimCompName())
							? creditorClaim.getClaimCompName()
							: "",
					Validator.isNotNull(creditorClaim) && Validator.isNotNull(creditorClaim.getClaimCompPosition())
							? creditorClaim.getClaimCompPosition()
							: "",
					Validator.isNotNull(creditorClaim) && Validator.isNotNull(creditorClaim.getClaimCertifyCheck())
							? creditorClaim.getClaimCertifyCheck()
							: "",

					// CLAIM TO PROPERTY (Section 105) (Bankruptcy only) 3
					Validator.isNotNull(formB) && Validator.isNotNull(formB.getPropertyDate())
							? dateFormat.format(formB.getPropertyDate())
							: "",
					Validator.isNotNull(formB) && Validator.isNotNull(formB.getPropClaimDesc())
							? formB.getPropClaimDesc()
							: "",
//					Validator.isNotNull(formB) && Validator.isNotNull(formB.getAffidavitDesc())
//							? formB.getAffidavitDesc()
//							: "",

					// CLAIM BY SPOUSE (Section 99) (Bankruptcy Only) 5
			
					Validator.isNotNull(formC) && Validator.isNotNull(formC.getNameCompletionForm())
							? formC.getNameCompletionForm()
							: "",
					Validator.isNotNull(formC) && Validator.isNotNull(formC.getNameCompletionDate())
							? dateFormat.format(formC.getNameCompletionDate())
							: "",
					Validator.isNotNull(formC) && Validator.isNotNull(formC.getCompPersonAddress())
							? formC.getCompPersonAddress()
							: "",

					// signature 1
					signatureForOgt1,

					// justice 2
					Validator.isNotNull(formC) && Validator.isNotNull(formC.getNameJusticeOfPeace())
							? formC.getNameJusticeOfPeace()
							: "",
					Validator.isNotNull(formC) && Validator.isNotNull(formC.getJusticePeaceParish())
							? formC.getJusticePeaceParish()
							: "",

					// signature 1
					signatureForOgt2,

			});

		} catch (Exception e) {
			// TODO: handle exception
		}

		if (!checkPdfDownloadWithoutDocument.equals("false")) {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
				String accoCertificate = "";
				String accoName = "";
				String accoStanding = "";
				String accoTax = "";
				String accoList = "";
				String accoLease = "";
				String accoInsurance = "";
				String accoApproval = "";
				String accoPublic = "";
				String accoPermit = "";

				for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
					try {
						fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
								supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
						fileName = fileEntry.getFileName();
						title = fileEntry.getTitle();
					} catch (Exception e) {
					}
					if (title.equals("The type of debt (secured unsecured and preferred etc)")) {
						accoCertificate = fileName;
					} else if (title
							.equals("The interest applied; same should be calculated to the date of bankruptcy")) {
						accoName = fileName;
					} else if (title.equals("All payments made throughout the history of the account")) {
						accoStanding = fileName;
					} else if (title.equals(
							"Contract document (clearly stating details such as the contracted amount interest charged duration of the contract etc)")) {
						accoTax = fileName;
					} else if (title.equals("Security agreement (re mortgage pledge charge/lien etc)")) {
						accoList = fileName;
					} else if (title.equals("Order/Judgment awarded by the court")) {
						accoLease = fileName;
					} else if (title.equals("The bankrupt counterclaim if any")) {
						accoInsurance = fileName;
					} else if (title.equals("Any write off indicated on the statement provided")) {
						accoApproval = fileName;
					} else if (title.equals("Seizure and/or sale of assets used as security")) {
						accoPublic = fileName;
					} else if (title.equals("Any other document and/or information necessary in proving the claim")) {
						accoPermit = fileName;
					}
				}

				pdfTemplate = StringUtil.replace(pdfTemplate,
						new String[] { "[$TypeDebt$]", "[$AppliedBe$]", "[$Allhistory$]", "[$ContractAmount$]",
								"[$Securlien$]", "[$Ordercourt$]", "[$Theany$]", "[$Indicatedoff$]", "[$Saleused$]",
								"[$InfoOther$]", },
						new String[] { accoCertificate, accoName, accoStanding, accoTax, accoList, accoLease,
								accoInsurance, accoApproval, accoPublic, accoPermit, });
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
