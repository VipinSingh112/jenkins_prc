package com.nbp.tpdco.pdf.util;

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
import com.nbp.jtb.application.form.service.model.AttractionTravelAgency;
import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.model.JTBPaymentMethod;
import com.nbp.jtb.application.form.service.service.AttractionTravelAgencyLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBPaymentMethodLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class JtbTravelAgency {
	public static String replaceSignatureOfBikeRental(long jtbApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
			DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
					"Travel Agency Applicant Sign");
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
	public static String getJtbOtherTravelAgencyPdf(long jtbApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {

		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		JTBApplication jtbApplication = null;
		AttractionTravelAgency attractionTravelAgency = null;
		JTBPaymentMethod jtbPayment=null;
		try{
			jtbPayment= JTBPaymentMethodLocalServiceUtil.getJTBById(jtbApplicationId);
		}catch(Exception e){}
		//Signature
		String signatureOfAgency = null;
		try {
			jtbApplication = JTBApplicationLocalServiceUtil.getJTBApplication(jtbApplicationId);
		} catch (Exception e) {
		}
		try {
			attractionTravelAgency = AttractionTravelAgencyLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
		}
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "JTB Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(jtbApplication.getJtbApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
		}
		
		//signatures

		  try { 
			  signatureOfAgency=replaceSignatureOfBikeRental
					  (attractionTravelAgency.getJtbApplicationId(), "Travel Agency Applicant Sign", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
			  } catch (Exception e) {}
		
//pdf go in launch case
		if (checkPdfDownloadWithoutDocument.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(), "other-travelagencies-1");
		} else {
			try {
				pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(), "other-travelagencies");
			} catch (Exception e) {

			}
		}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
					// car rental Licence
					"[$AgencyApplicantName$]", "[$AgencyAddress$]", "[$AgencyTelephoneNo$]", "[$AgencyTravelName$]",

					"[$AgencyAdd$]",

					"[$AgencyTele$]", "[$AgencyCompanyReg$]",

					"[$AgencyRegistration$]",

					"[$AgencyDirectors$]",

					"[$ManagerName$]",

					"[$ManagerAddress$]",

					"[$SecretaryName$]", "[$SecretaryAddress$]", "[$Bankers$]", "[$CompanyBondingName$]",
					"[$BankersAddress$]", "[$AuditorsName$]", "[$AuditorsAddress$]", "[$AgencyEmpNo$]",
					"[$AgencySignDate$]","[$AgencySignApplicant$]" ,

			}, new String[] {
					// Applicant details
					Validator.isNotNull(attractionTravelAgency)
							&& Validator.isNotNull(attractionTravelAgency.getApplicantName())
									? attractionTravelAgency.getApplicantName()
									: "",
					Validator.isNotNull(attractionTravelAgency)
							&& Validator.isNotNull(attractionTravelAgency.getAgencyAddress())
									? attractionTravelAgency.getAgencyAddress()
									: "",
					Validator.isNotNull(attractionTravelAgency)
							&& Validator.isNotNull(attractionTravelAgency.getAgencyTelephone())
									? attractionTravelAgency.getAgencyTelephone()
									: "",
					Validator.isNotNull(attractionTravelAgency)
							&& Validator.isNotNull(attractionTravelAgency.getAgencyName())
									? attractionTravelAgency.getAgencyName()
									: "",
					Validator.isNotNull(attractionTravelAgency)
							&& Validator.isNotNull(attractionTravelAgency.getAgencyAddressSec())
									? attractionTravelAgency.getAgencyAddressSec()
									: "",
					Validator.isNotNull(attractionTravelAgency)
							&& Validator.isNotNull(attractionTravelAgency.getAgencyTelephoneNum())
									? attractionTravelAgency.getAgencyTelephoneNum()
									: "",
					Validator.isNotNull(attractionTravelAgency)
							&& Validator.isNotNull(attractionTravelAgency.getIsRegistered())
									? attractionTravelAgency.getIsRegistered()
									: "",
					Validator.isNotNull(attractionTravelAgency)
							&& Validator.isNotNull(attractionTravelAgency.getRegstParticulars())
									? attractionTravelAgency.getRegstParticulars()
									: "",
					Validator.isNotNull(attractionTravelAgency)
							&& Validator.isNotNull(attractionTravelAgency.getProprietorName())
									? attractionTravelAgency.getProprietorName()
									: "",
					Validator.isNotNull(attractionTravelAgency)
							&& Validator.isNotNull(attractionTravelAgency.getManagerName())
									? attractionTravelAgency.getManagerName()
									: "",
					Validator.isNotNull(attractionTravelAgency)
							&& Validator.isNotNull(attractionTravelAgency.getManagerAddress())
									? attractionTravelAgency.getManagerAddress()
									: "",
					Validator.isNotNull(attractionTravelAgency)
							&& Validator.isNotNull(attractionTravelAgency.getSecretaryName())
									? attractionTravelAgency.getSecretaryName()
									: "",
					Validator.isNotNull(attractionTravelAgency)
							&& Validator.isNotNull(attractionTravelAgency.getSecretaryAddress())
									? attractionTravelAgency.getSecretaryAddress()
									: "",
					Validator.isNotNull(attractionTravelAgency)
							&& Validator.isNotNull(attractionTravelAgency.getBankerName())
									? attractionTravelAgency.getBankerName()
									: "",
					Validator.isNotNull(attractionTravelAgency)
							&& Validator.isNotNull(attractionTravelAgency.getBondingCompanyName())
									? attractionTravelAgency.getBondingCompanyName()
									: "",
					Validator.isNotNull(attractionTravelAgency)
							&& Validator.isNotNull(attractionTravelAgency.getBondingCompanyAddress())
									? attractionTravelAgency.getBondingCompanyAddress()
									: "",
					Validator.isNotNull(attractionTravelAgency)
							&& Validator.isNotNull(attractionTravelAgency.getAuditorsName())
									? attractionTravelAgency.getAuditorsName()
									: "",
					Validator.isNotNull(attractionTravelAgency)
							&& Validator.isNotNull(attractionTravelAgency.getAuditorsAddress())
									? attractionTravelAgency.getAuditorsAddress()
									: "",
					Validator.isNotNull(attractionTravelAgency)
							&& Validator.isNotNull(attractionTravelAgency.getNumberOfEmployees())
									? attractionTravelAgency.getNumberOfEmployees()
									: "",
					Validator.isNotNull(attractionTravelAgency)
							&& Validator.isNotNull(attractionTravelAgency.getSignDate())
									? dateFormat.format(attractionTravelAgency.getSignDate())
									: "",
									signatureOfAgency,

			});
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (!checkPdfDownloadWithoutDocument.equals("false")) {
			String fileName = null;
			String title = null;
			String copyOfPulic = null;
			String copyOfCertificate = null;
			String copyOfRegistration = null;
			String copiesOrArticle = null;
			String approvalFromLocal = null;
			String permissionToOperate = null;
			String copyOfTax = null;
			String copyOfCancellation = null;
			String evidenceOfFinancial = null;
			String bound = null;
			String fidelityGuarantee = null;
			String copyOfReceipt = null;
			String listDirector=null;
			String letterGoodStanding=null;
			String landTenure=null;
			String leaseAgreement=null;
			String foodCerti=null;
			String foodPermit=null;
			String fireCerti=null;
			String cprAid=null;
			String listOfEmp=null;
			String teamList=null;

			for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
				try {
					fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
				} catch (PortalException e) {
					e.printStackTrace();
				}
				fileName = fileEntry.getFileName();
				title = fileEntry.getTitle();
				if (title.equals("Copy of Public Liability Insurance")) {
					copyOfPulic = fileName;
				} else if (title.equals("Copy of Certificate of Incorporation")) {
					copyOfCertificate = fileName;
				} else if (title.equals(
						"Copy of Registration of Business Name (where applicable i.e. if Business Name is different from the name of the Company)")) {
					copyOfRegistration = fileName;
				} else if (title.equals("Copies or Articles of Memorandum of Association (registered companies)")) {
					copiesOrArticle = fileName;
				} else if (title.equals(
						"Approval from local planning authority (Parish Council e.g. KSAC St. James Parish Council)")) {
					approvalFromLocal = fileName;
				} else if (title.equals("Permission to operate from location (Eg. Lease / Rental Agreement)")) {
					permissionToOperate = fileName;
				} else if (title.equals("Copy of Tax Registration Number (TRN)")) {
					copyOfTax = fileName;
				} else if (title.equals("Copy of Cancellation or Refund Policy")) {
					copyOfCancellation = fileName;
				} else if (title.equals("Evidence of financial ability to operates")) {
					evidenceOfFinancial = fileName;
				} else if (title.equals("Bond of $100000.00")) {
					bound = fileName;
				} else if (title
						.equals("Fidelity Guarantee insurance policy - $25 000.00 in respect of each cashier")) {
					fidelityGuarantee = fileName;
				} else if (title.equals("Copy of receipt for registration fee from Inland Revenue")) {
					copyOfReceipt = fileName;
				} else if (title.equals("List of Directors")) {
					listDirector = fileName;
				} else if (title.equals("Letter of Good Standing")) {
					letterGoodStanding = fileName;
				} else if (title.equals("Proof of Land Tenure")) {
					landTenure = fileName;
				} else if (title.equals("Stamped Lease Agreement")) {
					leaseAgreement = fileName;
				} else if (title.equals("Food Establishment Certificate")) {
					foodCerti = fileName;
				} else if (title.equals("Food Handlers Permit")) {
					foodPermit = fileName;
				} else if (title.equals("Fire Certificate")) {
					fireCerti = fileName;
				} else if (title.equals("CPR First Aid (life saving skills)")) {
					cprAid = fileName;
				} else if (title.equals("List of Employees Stating Job Titles")) {
					listOfEmp = fileName;
				} else if (title.equals("Team Jamaica Certification (list)")) {
					teamList = fileName;
				}
			}
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//for the document 
			"[$AgencyCopy$]", "[$AgencyCertificate$]", "[$AgencyName$]", "[$AgencyArticles$]",
			"[$AgencyApproval$]", "[$AgencyLocation$]", "[$AgencyTax$]", "[$AgencyRefund$]",
			"[$AgencyEvidence$]", "[$AgencyBond$]", "[$AgencyPolicy$]", "[$AgencyFee$]",
			
			"[$listAgency$]", "[$letterStanding$]", "[$ProofTenure$]", "[$AgreementAgency$]",
			"[$FoodCertificate$]", "[$FoodPermitCerti$]", "[$FireCertificate$]", "[$CPRFirst$]",
			"[$ListEmp$]", "[$TeamCerti$]",
			"[$PaymentMethAgency$]", },
			new String[] { copyOfPulic, copyOfCertificate, copyOfRegistration, copiesOrArticle,
					approvalFromLocal, permissionToOperate, copyOfTax, copyOfCancellation, evidenceOfFinancial,
					bound, fidelityGuarantee, copyOfReceipt,listDirector,letterGoodStanding,landTenure,leaseAgreement,foodCerti,foodPermit,fireCerti,cprAid,listOfEmp,teamList,
					Validator.isNotNull(jtbPayment)&& Validator.isNotNull(jtbPayment.getPaymentMethod())? jtbPayment.getPaymentMethod(): ""
							
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
