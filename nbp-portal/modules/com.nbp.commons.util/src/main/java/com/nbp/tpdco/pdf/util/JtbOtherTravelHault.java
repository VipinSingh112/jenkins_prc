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
import com.nbp.jtb.application.form.service.model.AttractionTravelHaltApp;
import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.service.AttractionTravelHaltAppLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class JtbOtherTravelHault {
	public static String replaceSignatureOfTravelHalt(long jtbApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
			DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
					"Travel Halt Signature of Applicant");
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
	
	public static String getJtbOtherTravelHaultPdf(long jtbApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {

		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		JTBApplication jtbApplication = null;
		AttractionTravelHaltApp haltApp = null;
		
		try {
			jtbApplication = JTBApplicationLocalServiceUtil.getJTBApplication(jtbApplicationId);
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
		//Signatures
		String signatureOfTravelHalt = null;
				
		/*
		 * List<JtbAddBranchDetailInfo> addBranchDetailInfo = null;
		 * AttractionDomesticService attractionDomesticService = null;
		 */ try {
			 haltApp = AttractionTravelHaltAppLocalServiceUtil.getJTB_ByApplicationId((jtbApplicationId));
		} catch (Exception e) {
		}
		 
		//signatures

		  try { 
			  signatureOfTravelHalt=replaceSignatureOfTravelHalt
					  (haltApp.getJtbApplicationId(), "Travel Halt Signature of Applicant", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
			  } catch (Exception e) {}
		 
//pdf go in launch case
		if (checkPdfDownloadWithoutDocument.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(), "other-travelhalt-1");
		} else {
			try {
				pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(), "other-travelhalt");
			} catch (Exception e) {

			}
		}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate,
					new String[] { "[$TravelApplicantName$]",
							"[$TravelAddress$]",
							"[$TravelTeleNo$]",
							"[$TravelEmailAdd$]",
							"[$TravelHaltName$]",
							"[$TravelHaltLocation$]",
							"[$TravelTelePhoneno$]",
							"[$TravelEmpNum$]",
							"[$TravelSign$]",
							"[$TravelSignDate$]",
							"[$TravelGasStation$]",
							"[$Restrooms$]",
							"[$Refreshment$]",
							"[$travelDrimks$]",
							"[$RestaurantHalt$]",
							"[$WirelessHalt$]"

					},

					new String[] {
							// Applicant details
							Validator.isNotNull(haltApp)&& Validator.isNotNull(haltApp.getTravelHaltApplicantName())?haltApp.getTravelHaltApplicantName(): "",
							Validator.isNotNull(haltApp)&& Validator.isNotNull(haltApp.getTravelHaltAddress())?haltApp.getTravelHaltAddress(): "",
							Validator.isNotNull(haltApp)&& Validator.isNotNull(haltApp.getTravelHaltTelephone())?haltApp.getTravelHaltTelephone(): "",
							Validator.isNotNull(haltApp)&& Validator.isNotNull(haltApp.getTravelHaltEmail())?haltApp.getTravelHaltEmail(): "",
							Validator.isNotNull(haltApp)&& Validator.isNotNull(haltApp.getTravelHaltName())?haltApp.getTravelHaltName(): "",
							Validator.isNotNull(haltApp)&& Validator.isNotNull(haltApp.getTravelHaltLocation())?haltApp.getTravelHaltLocation(): "",
							Validator.isNotNull(haltApp)&& Validator.isNotNull(haltApp.getTravelHaltTelephoneNum())?haltApp.getTravelHaltTelephoneNum(): "",
							Validator.isNotNull(haltApp)&& Validator.isNotNull(haltApp.getTravelHaltEmployeesNo())?haltApp.getTravelHaltEmployeesNo(): "",
							signatureOfTravelHalt,
							Validator.isNotNull(haltApp)&& Validator.isNotNull(haltApp.getTravelHaltSignDate())?dateFormat.format(haltApp.getTravelHaltSignDate()): "",
							Validator.isNotNull(haltApp)&& Validator.isNotNull(haltApp.getGasStation())?haltApp.getGasStation(): "",
							Validator.isNotNull(haltApp)&& Validator.isNotNull(haltApp.getRestrooms())?haltApp.getRestrooms(): "",
							Validator.isNotNull(haltApp)&& Validator.isNotNull(haltApp.getRefreshment())?haltApp.getRefreshment(): "",
							Validator.isNotNull(haltApp)&& Validator.isNotNull(haltApp.getDrinks())?haltApp.getDrinks(): "",
							Validator.isNotNull(haltApp)&& Validator.isNotNull(haltApp.getRestaurant())?haltApp.getRestaurant(): "",
							Validator.isNotNull(haltApp)&& Validator.isNotNull(haltApp.getWirelessinternet())?haltApp.getWirelessinternet(): "",

					});
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if (!checkPdfDownloadWithoutDocument.equals("false")) {
			String fileName = null;
			String title = null;
			String copyOfCertificate = null;
			String copyOfRegistration = null;
			String letterOfGood = null;
			String copyOfTax = null;
			String listOfDiretor = null;
			String copyOfPublic = null;
			String approvalFromNational = null;
			String proofOfOwnership = null;
			String approvalFromLocal = null;
			String brochureShowing = null;
			String copyOfPublicHealth = null;
			String copyOfValid = null;
			String submitFleet = null;
			String submitName = null;
			String submitList = null;
			String copyOfTpdco = null;
			String workPermit = null;
			String copyOfSecurity = null;
			String securityApproval = null;
			
			String landTenure=null;
			String poolPermit=null;
			String guardCerti=null;
			String listJamaica=null;
			String writtenApproval=null;
			String proofSecurity=null;
			String stampLease=null;
			String statingJob=null;
			
			
			
			for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
				try {
					fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
				} catch (PortalException e) {
					e.printStackTrace();
				}
				fileName = fileEntry.getFileName();
				title = fileEntry.getTitle();
				if (title.equals("Copy Certificate of Incorporation")) {
					copyOfCertificate = fileName;
				} else if (title.equals(
						"Copy of Registration of Business Name (where applicable i.e. if Business Name is different from the name of the Company)")) {
					copyOfRegistration = fileName;
				} else if (title.equals("Letter of “Good Standing” – Companies Office of Jamaica")) {
					letterOfGood = fileName;
				} else if (title.equals("Copy of Tax Registration Number (TRN)")) {
					copyOfTax = fileName;
				} else if (title.equals("List of Directors")) {
					listOfDiretor = fileName;
				} else if (title.equals("Proof of permission to occupy premises (Certified Lease/Rental Agreement) or copy of Proof of Ownership (Title)")) {
					copyOfPublic = fileName;
				}else if (title
						.equals("Approval from local planning authority (e.g. KSAMC St. James Municipal Corporation)")) {
					approvalFromNational = fileName;
				}else if (title.equals("Copy of Surveyor’s ID")) {
					proofOfOwnership = fileName;
				} else if (title.equals(
						"Copy of Public Liability Insurance")) {
					approvalFromLocal = fileName;
				} else if (title.equals(
						"Copy of Public Health Food Establishment Certificate")) {
					brochureShowing = fileName;
				} else if (title.equals("Copy of Valid Food Handler’s Permit (s)")) {
					copyOfPublicHealth = fileName;
				} else if (title.equals("Copy of Fire Certificate")) {
					copyOfValid = fileName;
				} else if (title.equals("Copy of Spirit Licence (where applicable)")) {
					submitFleet = fileName;
				} else if (title.equals(
						"Proper Security Arrangements (e.g. Copy of Security Contract/Certified personnel)")) {
					submitName = fileName;
				} else if (title.equals("Copy of PSRA Certification for Security Company/Personnel contracted")) {
					submitList = fileName;
				} else if (title.equals(
						"Security approval from Resort Area Division of the Jamaica Constabulary Force")) {
					copyOfTpdco = fileName;
				} else if (title.equals("Copy of Beach Licence from NEPA (where applicable)")) {
					workPermit = fileName;
				} else if (title.equals("Copy of CPR/First Aid certificates and Lifeguard licences for employees assigned as Lifeguards (where applicable)")) {
					copyOfSecurity = fileName;
				} else if (title.equals(
						"Copy of Work Permit (s) (where applicable)")) {
					securityApproval = fileName;
				} else if (title.equals(
						"Proof of Land Tenure")) {
					landTenure = fileName;
				} else if (title.equals(
						"Swimming Pool Permit (where applicable)")) {
					poolPermit = fileName;
				} else if (title.equals(
						"Life Guard Certification (where applicable )")) {
					guardCerti = fileName;
				} else if (title.equals(
						"Team Jamaica Certification (list)")) {
					listJamaica = fileName;
				} else if (title.equals(
						"Written Approval From the jamaica national heritage trust (where applicable)")) {
					writtenApproval = fileName;
				} else if (title.equals(
						"Proof of Security Arrangement From Registered Security Company Along With Psra Certification")) {
					proofSecurity = fileName;
				} else if (title.equals(
						"STAMPED LEASE AGREEMENT")) {
					stampLease = fileName;
				} else if (title.equals(
						"List Of Employees Stating Job Titles")) {
					statingJob = fileName;
				} 
			}
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//for the document 
					"[$IncorporationCertificateHalt$]", "[$BusinessNameHalt$]", "[$HaltStanding$]",
					"[$TrnNumberTaxHalt$]", "[$HaltList$]", "[$HaltProof$]", "[$HaltLocal$]",
					"[$HaltSurveyor$]",
					"[$HaltPublic$]", "[$PublicHealthHalt$]", "[$HaltPermit$]",
					"[$HaltFire$]", "[$HaltLicence$]", "[$HaltPersonnel$]", "[$HaltCertification$]",
					"[$HaltSecurity$]", "[$HaltBeach$]", "[$HaltCopy$]", "[$HaltWork$]",
					
					"[$tenureLand$]", "[$permitPool$]", "[$CertiGuard$]", "[$JamaicaList$]",
					"[$ApprovalWritten$]", "[$SecurityProof$]", "[$LeaseStamp$]", "[$JobStating$]",
					
					},
					new String[] { copyOfCertificate, copyOfRegistration, letterOfGood, copyOfTax, listOfDiretor,
							copyOfPublic, approvalFromNational, proofOfOwnership, approvalFromLocal, brochureShowing, copyOfPublicHealth,
							copyOfValid, submitFleet, submitName, submitList, copyOfTpdco, workPermit, copyOfSecurity,
							securityApproval,landTenure,poolPermit,guardCerti,listJamaica,writtenApproval,proofSecurity,stampLease,statingJob, });
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