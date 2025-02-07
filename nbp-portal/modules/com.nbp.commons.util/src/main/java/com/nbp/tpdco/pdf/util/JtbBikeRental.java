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
import com.nbp.jtb.application.form.service.model.AttractionBikeRentalInfo;
import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.model.JTBPaymentMethod;
import com.nbp.jtb.application.form.service.service.AttractionBikeRentalInfoLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBPaymentMethodLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class JtbBikeRental {
	
	public static String replaceSignatureOfBikeRental(long jtbApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
			DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
					"Bike Rental Signature of Applicant");
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
	public static String getJtbBikeRentalPdf(long jtbApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {

		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		JTBApplication jtbApplication = null;
		AttractionBikeRentalInfo attractionBikeRental = null;
		JTBPaymentMethod jtbPayment=null;
		
		//Signatures
		String signatureOfBikeRental = null;
		
		try {
			jtbApplication = JTBApplicationLocalServiceUtil.getJTBApplication(jtbApplicationId);
		} catch (Exception e) {
		}
		try {
			attractionBikeRental = AttractionBikeRentalInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
		}
		try{
			jtbPayment= JTBPaymentMethodLocalServiceUtil.getJTBById(jtbApplicationId);
		}catch(Exception e){}
		
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
			  signatureOfBikeRental=replaceSignatureOfBikeRental
					  (attractionBikeRental.getJtbApplicationId(), "Bike Rental Signature of Applicant", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
			  } catch (Exception e) {}
		 
		
//pdf go in launch case
		if (checkPdfDownloadWithoutDocument.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(), "other-bikerental-1");
		} else {
			try {
				pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(), "other-bikerental");
			} catch (Exception e) {

			}
		}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
					// car rental Licence
					"[$ApplicantBikeName$]","[$BikeAddress]","[$CompanyNameBike$]","[$ExactLocation]",
					"[$BikeTeleNo$]","[$BikeEmail$]"
					,"[$ComRegistrationBike$]"
					,"[$ManagerNmaeB$]",
					"[$BikeNumberS$]","[$HelmetsNum$]","[$BikerEmpNo$]","[$BikeDate$]","[$bikeApplicantSign$]",
//					Conditions Proposed for Motor Bike Rental
					"[$ConditionsIndustryBike$]"
			},
					

					new String[] {
							// Applicant details
							Validator.isNotNull(attractionBikeRental)
									&& Validator.isNotNull(attractionBikeRental.getApplicantName())
											? attractionBikeRental.getApplicantName()
											: "",
							Validator.isNotNull(attractionBikeRental)
									&& Validator.isNotNull(attractionBikeRental.getAddress())
											?attractionBikeRental.getAddress()
											: "",
							Validator.isNotNull(attractionBikeRental)
									&& Validator.isNotNull(attractionBikeRental.getCompanyName())
											? attractionBikeRental.getCompanyName()
											: "",
							Validator.isNotNull(attractionBikeRental)
									&& Validator.isNotNull(attractionBikeRental.getExactLocation())
											? attractionBikeRental.getExactLocation()
											: "",
							Validator.isNotNull(attractionBikeRental)
									&& Validator.isNotNull(attractionBikeRental.getTelephone())
											? attractionBikeRental.getTelephone()
											: "",
							Validator.isNotNull(attractionBikeRental)
									&& Validator.isNotNull(attractionBikeRental.getEmail())
											? attractionBikeRental.getEmail()
											: "",
											Validator.isNotNull(attractionBikeRental)
											&& Validator.isNotNull(attractionBikeRental.getRegistrationDate())
													? dateFormat.format(attractionBikeRental.getRegistrationDate())
													: "",
											Validator.isNotNull(attractionBikeRental)
											&& Validator.isNotNull(attractionBikeRental.getManagerName())
													? attractionBikeRental.getManagerName()
													: "",
									Validator.isNotNull(attractionBikeRental)
											&& Validator.isNotNull(attractionBikeRental.getNumberOfBikes())
													? attractionBikeRental.getNumberOfBikes()
													: "",
									Validator.isNotNull(attractionBikeRental)
											&& Validator.isNotNull(attractionBikeRental.getNumberOfHelmets())
													? attractionBikeRental.getNumberOfHelmets()
													: "",
									Validator.isNotNull(attractionBikeRental)
											&& Validator.isNotNull(attractionBikeRental.getNumberOfEmployees())
													? attractionBikeRental.getNumberOfEmployees()
													: "",
													Validator.isNotNull(attractionBikeRental)
													&& Validator.isNotNull(attractionBikeRental.getSignatureDate())
															? dateFormat.format(attractionBikeRental.getSignatureDate()): "",
															signatureOfBikeRental,
													Validator.isNotNull(attractionBikeRental)
													&& Validator.isNotNull(attractionBikeRental.getMotorBikeIndustry())
															? attractionBikeRental.getMotorBikeIndustry()
															: "",
											
							});
		} catch (Exception e) {
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
			String approvalFromTheLocal = null;
			String permissionToOperate = null;
			String fleetList = null;
			String copyOfDeposit = null;
			String copyOfWork = null;
			
			String landTenure=null;
			String stampAgree=null;
			String establishCert=null;
			String foodPermit=null;
			String fireCerti=null;
			String statingJob=null;
			String teamList=null;
			String fleetListing=null;
			String cancellation=null;
			
			for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
				try {
					fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
				} catch (PortalException e) {
					e.printStackTrace();
				}
				fileName = fileEntry.getFileName();
				title = fileEntry.getTitle();
				if (title.equals("Copy of Certificate of Incorporation")) {
					copyOfCertificate = fileName;
				} else if (title.equals(
						"Copy of Registration of Business Name (where applicable i.e. if Business Name is different from the name of  the Company)")) {
					copyOfRegistration = fileName;
				} else if (title.equals("Letter of Good Standing – Companies Office of Jamaica (where applicable)")) {
					letterOfGood = fileName;
				} else if (title.equals("Copy of Tax Registration Number (TRN)")) {
					copyOfTax = fileName;
				} else if (title.equals("List of Directors (where applicable)")) {
					listOfDiretor = fileName;
				} else if (title.equals("Copy of Public Liability Insurance")) {
					copyOfPublic = fileName;
				} else if (title.equals(
						"Approval from the local planning authority (e.g. KSAMC/ St. James Municipal Corporation)")) {
					approvalFromTheLocal = fileName;
				} else if (title.equals(
						"Permission to Operate from location (e.g. Title or Certified Lease/Rental Agreement)")) {
					permissionToOperate = fileName;
				} else if (title.equals(
						"List of Bikes in Fleet including year/ type/ model and licence number (vehicles must be registered in the name of the company making the application)")) {
					fleetList = fileName;
				} else if (title.equals(
						"Copy of deposit requirement/ terms and conditions of rental and Cancellation and refund policy")) {
					copyOfDeposit = fileName;
				} else if (title.equals("Copy of Work Permit (s) (where applicable)")) {
					copyOfWork = fileName;
				}else if (title.equals("Proof of Land Tenure")) {
					landTenure = fileName;
				}else if (title.equals("Stamped Lease Agreement")) {
					stampAgree = fileName;
				}else if (title.equals("Food Establishment Certificate")) {
					establishCert = fileName;
				}else if (title.equals("Food Handlers Permit")) {
					foodPermit = fileName;
				}else if (title.equals("Fire Certificate")) {
					fireCerti = fileName;
				}else if (title.equals("List of Employees Stating Job Titles")) {
					statingJob = fileName;
				}else if (title.equals("Team Jamaica Certification (list)")) {
					teamList = fileName;
				}else if (title.equals("Fleet Listing")) {
					fleetListing = fileName;
				}else if (title.equals("Cancellation or Refund Policy")) {
					cancellation = fileName;
				}
			}
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//for the document 
					"[$IncorporationCertificate$]","[$BusinessNameBike$]","[$CompaniesOfficeJa$]","[$TrnNumberTax$]","[$DirectorList$]",
					"[$PublicInsuranceBike$]","[$PlanningAuthority$]","[$LocationPermission$]","[$LicenceNumBike$]","[$RentalCondition$]",
					"[$BikerPermitWork$]",
					
					"[$TenureLand$]","[$AgreeStamp$]","[$CertiEstablish$]",
					"[$PermitFood$]","[$CertiFire$]","[$JobStating$]",
					"[$ListTeam$]","[$ListingFleet$]","[$Cancel2$]",
					"[$PaymentMethBikeR$]",
					},
					new String[] { copyOfCertificate, copyOfRegistration, letterOfGood, copyOfTax, listOfDiretor,
							copyOfPublic, approvalFromTheLocal, permissionToOperate, fleetList, copyOfDeposit,
							copyOfWork,landTenure,stampAgree,establishCert,foodPermit,fireCerti,statingJob,teamList,fleetListing,cancellation,
							Validator.isNotNull(jtbPayment)&&Validator.isNotNull(jtbPayment.getPaymentMethod())?jtbPayment.getPaymentMethod():"",
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
