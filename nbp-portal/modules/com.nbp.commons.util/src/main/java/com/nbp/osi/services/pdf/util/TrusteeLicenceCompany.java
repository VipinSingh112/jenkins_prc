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
import com.nbp.osi.services.application.form.service.model.OSIServiceComSign;
import com.nbp.osi.services.application.form.service.model.OSIServiceSupportingDocInd;
import com.nbp.osi.services.application.form.service.model.OsiServicesAppPayment;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplication;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeCompanyinfo;
import com.nbp.osi.services.application.form.service.service.OSIServiceComSignLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OSIServiceSupportingDocIndLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesAppPaymentLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesApplicationLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeCompanyinfoLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class TrusteeLicenceCompany {
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
	public static String getCompanyPdf(long osiServicesApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		OsiServicesApplication osiServicesApplication=null;
		OsiServicesTrusteeCompanyinfo trusteeCompanyInfo=null;
		OSIServiceComSign comSignature=null;
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
		String signatureForTrusteeUndersigned = null;
		try {
			osiServicesApplication= OsiServicesApplicationLocalServiceUtil.getOsiServicesApplication(osiServicesApplicationId);
		}catch (Exception e) {
		}
		try {
			trusteeCompanyInfo=OsiServicesTrusteeCompanyinfoLocalServiceUtil.getOsiServicesTrusteeCompanyinfoById(osiServicesApplicationId);
		}catch (Exception e) {
		}
		try {
			comSignature= OSIServiceComSignLocalServiceUtil.getOsiServicesSignBy_Id(osiServicesApplicationId);
		} catch (Exception e) {}
		try {
			supportingDoc= OSIServiceSupportingDocIndLocalServiceUtil.getOSIService_ById(osiServicesApplicationId);
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
			signatureForTrusteeUndersigned =replaceSignatureForTrusteeUndersigned(
					osiServicesApplication.getOsiServicesApplicationId(), "Signature Trustee Undersigned",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
//		
//		try {
//			signatureForAssignment =replaceSignatureForAssignment(
//					assignmentDetails.getOsiServicesApplicationId(), "Signature Assignment",
//					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
//		} catch (Exception e) {}
		
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"sez-zone-user-1");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"osi-company");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, 
			new String[] {
//	for the truesteLicenceIndi
					"[$NameCorporation$]","[$Email$]","[$HeadOffice$]","[$TelephoneN$]","[$FaxNum$]","[$Incorporated$]","[$DateofIn$]","[$LicenceIs$]",
					
//					signature
					"[$SignatureTrustee$]",
					"[$DateOf$]",
//					signature doc
					"[$OriginalOr$]","[$NonProvisionOr$]","[$DateExpectedOr$]",
							/* "[$HeadOffice$]", */"[$NonProvisionHead$]","[$DateExpectedHead$]",
							/* "[$FirmManaging$]", */"[$NonProvisionFirm$]","[$DateExpectedFirm$]",
							/* "[$EachShareholder$]", */"[$NonProvisionEach$]","[$DateExpectedEach$]",
							/* "[$NumberOfShare$]", */"[$NonProvisionNum$]","[$DateExpectedNum$]",
							/* "[$TrusteeIs$]", */"[$NonProvisionTrus$]","[$DateExpectedTrus$]",
							/* "[$ResidentialAdd$]", */"[$NonProvisionAdd$]","[$DateExpectedAdd$]",
							/* "[$BusinessAdd$]", */"[$NonProvisionBus$]","[$DateExpectedBus$]",
							/* "[$InsuranceCoverage$]", */"[$NonProvisionIns$]","[$DateExpectedIns$]",
							/* "[$ChequeFor$]", */"[$NonProvisionFor$]","[$DateExpectedFor$]",
							/* "[$Arrangements$]", */"[$NonProvisionArr$]","[$DateExpectedArr$]",
							/* "[$ResponsibleFor$]", */"[$NonProvisionLet$]","[$DateExpectedLet$]"
			},
			new String[] {
    		//Applicant details
    		Validator.isNotNull(trusteeCompanyInfo)&&Validator.isNotNull(trusteeCompanyInfo.getComCorporationName())?trusteeCompanyInfo.getComCorporationName():"",
			Validator.isNotNull(trusteeCompanyInfo)&&Validator.isNotNull(trusteeCompanyInfo.getComEmail())?trusteeCompanyInfo.getComEmail():"",
			Validator.isNotNull(trusteeCompanyInfo)&&Validator.isNotNull(trusteeCompanyInfo.getComHeadOfficeAddress())?trusteeCompanyInfo.getComHeadOfficeAddress():"",
			Validator.isNotNull(trusteeCompanyInfo)&&Validator.isNotNull(trusteeCompanyInfo.getComTeleNo())?trusteeCompanyInfo.getComTeleNo():"",
			Validator.isNotNull(trusteeCompanyInfo)&&Validator.isNotNull(trusteeCompanyInfo.getComFaxNo())?trusteeCompanyInfo.getComFaxNo():"",
			Validator.isNotNull(trusteeCompanyInfo)&&Validator.isNotNull(trusteeCompanyInfo.getOtherCountry())?trusteeCompanyInfo.getOtherCountry():"",
			Validator.isNotNull(trusteeCompanyInfo)&&Validator.isNotNull(trusteeCompanyInfo.getComIncorporationDate())?dateFormat.format(trusteeCompanyInfo.getComIncorporationDate()):"",
			Validator.isNotNull(trusteeCompanyInfo)&&Validator.isNotNull(trusteeCompanyInfo.getComLicenceRequest())?trusteeCompanyInfo.getComLicenceRequest():"",
//					signature 
					signatureForTrusteeUndersigned,
			Validator.isNotNull(comSignature)&&Validator.isNotNull(comSignature.getComSignDate())?dateFormat.format(comSignature.getComSignDate()):"",
			//for supporting doc 
			
			Validator.isNotNull(supportingDoc)&&Validator.isNotNull(supportingDoc.getSupportingDocCheckboxes())?supportingDoc.getSupportingDocCheckboxes():"",
			Validator.isNotNull(supportingDoc)&&Validator.isNotNull(supportingDoc.getNonProvisionReasonReq1())?supportingDoc.getNonProvisionReasonReq1():"",
			Validator.isNotNull(trusteeCompanyInfo)&&Validator.isNotNull(supportingDoc.getExpectedDateReq1())?dateFormat.format(supportingDoc.getExpectedDateReq1()):"",
			Validator.isNotNull(supportingDoc)&&Validator.isNotNull(supportingDoc.getNonProvisionReasonReq2())?supportingDoc.getNonProvisionReasonReq2():"",
			Validator.isNotNull(trusteeCompanyInfo)&&Validator.isNotNull(supportingDoc.getExpectedDateReq2())?dateFormat.format(supportingDoc.getExpectedDateReq2()):"",
			Validator.isNotNull(supportingDoc)&&Validator.isNotNull(supportingDoc.getNonProvisionReasonReq3())?supportingDoc.getNonProvisionReasonReq3():"",
			Validator.isNotNull(trusteeCompanyInfo)&&Validator.isNotNull(supportingDoc.getExpectedDateReq3())?dateFormat.format(supportingDoc.getExpectedDateReq3()):"",
			Validator.isNotNull(supportingDoc)&&Validator.isNotNull(supportingDoc.getNonProvisionReasonReq4())?supportingDoc.getNonProvisionReasonReq4():"",
			Validator.isNotNull(trusteeCompanyInfo)&&Validator.isNotNull(supportingDoc.getExpectedDateReq4())?dateFormat.format(supportingDoc.getExpectedDateReq4()):"",
			Validator.isNotNull(supportingDoc)&&Validator.isNotNull(supportingDoc.getNonProvisionReasonReq5())?supportingDoc.getNonProvisionReasonReq5():"",
			Validator.isNotNull(trusteeCompanyInfo)&&Validator.isNotNull(supportingDoc.getExpectedDateReq5())?dateFormat.format(supportingDoc.getExpectedDateReq5()):"",
			Validator.isNotNull(supportingDoc)&&Validator.isNotNull(supportingDoc.getNonProvisionReasonReq6())?supportingDoc.getNonProvisionReasonReq6():"",
			Validator.isNotNull(trusteeCompanyInfo)&&Validator.isNotNull(supportingDoc.getExpectedDateReq6())?dateFormat.format(supportingDoc.getExpectedDateReq6()):"",
			Validator.isNotNull(supportingDoc)&&Validator.isNotNull(supportingDoc.getNonProvisionReasonReq7())?supportingDoc.getNonProvisionReasonReq7():"",
			Validator.isNotNull(trusteeCompanyInfo)&&Validator.isNotNull(supportingDoc.getExpectedDateReq7())?dateFormat.format(supportingDoc.getExpectedDateReq7()):"",
					
			Validator.isNotNull(supportingDoc)&&Validator.isNotNull(supportingDoc.getNonProvisionReasonReq8())?supportingDoc.getNonProvisionReasonReq8():"",
			Validator.isNotNull(trusteeCompanyInfo)&&Validator.isNotNull(supportingDoc.getExpectedDateReq8())?dateFormat.format(supportingDoc.getExpectedDateReq8()):"",
			
			Validator.isNotNull(supportingDoc)&&Validator.isNotNull(supportingDoc.getNonProvisionReasonReq9())?supportingDoc.getNonProvisionReasonReq9():"",
			Validator.isNotNull(trusteeCompanyInfo)&&Validator.isNotNull(supportingDoc.getExpectedDateReq9())?dateFormat.format(supportingDoc.getExpectedDateReq9()):"",
					
			Validator.isNotNull(supportingDoc)&&Validator.isNotNull(supportingDoc.getNonProvisionReasonReq10())?supportingDoc.getNonProvisionReasonReq10():"",
			Validator.isNotNull(trusteeCompanyInfo)&&Validator.isNotNull(supportingDoc.getExpectedDateReq10())?dateFormat.format(supportingDoc.getExpectedDateReq10()):"",
																
			Validator.isNotNull(supportingDoc)&&Validator.isNotNull(supportingDoc.getNonProvisionReasonReq11())?supportingDoc.getNonProvisionReasonReq11():"",
			Validator.isNotNull(trusteeCompanyInfo)&&Validator.isNotNull(supportingDoc.getExpectedDateReq11())?dateFormat.format(supportingDoc.getExpectedDateReq11()):"",
			
			Validator.isNotNull(supportingDoc)&&Validator.isNotNull(supportingDoc.getNonProvisionReasonReq12())?supportingDoc.getNonProvisionReasonReq12():"",
			Validator.isNotNull(trusteeCompanyInfo)&&Validator.isNotNull(supportingDoc.getExpectedDateReq12())?dateFormat.format(supportingDoc.getExpectedDateReq12()):"",
										
			});
				    }catch (Exception e) {
						// TODO: handle exception
					}
			
		if (!checkPdfDownloadWithoutDocument.equals("false")) {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
			String theOriginal = "";
			String theAddress = "";
			String thePersonalBalance = "";
			String theNameResidential = "";
			String theNumOfShare = "";
			String aListIndicating = "";
			String theNameResisdential = "";
			String theNameAndBusiness = "";
			String evidenceOfInsurance = "";
			String aCheque = "";
			String detailsOfNecessary = "";
			String whereTheTrustee = "";
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
				} catch (Exception e) {}
				if(title.equals("The original or a certified true copy of the constituting documents")) {
					theOriginal = fileName;
				}else if (title.equals("The address of the head office and of every other office or place of business from which the corporation intends to provide bankruptcy services.")) {
					theAddress = fileName;
				}else if (title.equals("The personal balance sheet of the firm’s managing trustee")) {
					thePersonalBalance = fileName;
				}else if (title.equals("The name residential address and occupation of each shareholder and each person having an indirect proprietary interest in the corporation")) {
					theNameResidential = fileName;
				}else if (title.equals("The number of share and the  classes of shares held by each of the corporation.")) {
					theNumOfShare = fileName;
				}else if (title.equals("A list indicating every trustee who is simultaneously a shareholder of this corporation and the district in which they operate.")) {
					aListIndicating = fileName;
				}else if (title.equals("The name residential address and the occupation of each director and of each officer of the corporation.")) {
					theNameResisdential = fileName;
				}else if (title.equals("The name and business address of every licensed trustee who will practice in an office or place of business of the corporate trustee.")) {
					theNameAndBusiness = fileName;
				}else if (title.equals("Evidence of insurance coverage")) {
					evidenceOfInsurance = fileName;
				}else if (title.equals("A cheque for made out to the order of the Supervisor of Insolvency of Jamaica.")) {
					aCheque = fileName;
				}else if (title.equals("Details of necessary resources")) {
					detailsOfNecessary = fileName;
				}else if (title.equals("Where the trustee responsible for the administration of estates is being replaced")) {
					whereTheTrustee = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
					"[$ConstitutingDocuments$]","[$Services$]","[$ManagingTrustee$]","[$ResidentialAddress$]","[$TheCorporation$]",
					"[$ThisCorporation$]","[$NameResidential$]","[$CorporateTrustee$]","[$EvidenceInsurance$]","[$TheSupervisor$]",
					"[$NecessaryResources$]","[$TheAdministration$]","[$PaymentMethodCom$]"
				},
				new String[] {
						theOriginal,theAddress,thePersonalBalance,theNameResidential,theNumOfShare,aListIndicating,theNameResisdential,theNameAndBusiness,
						evidenceOfInsurance,aCheque,detailsOfNecessary,whereTheTrustee,
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
