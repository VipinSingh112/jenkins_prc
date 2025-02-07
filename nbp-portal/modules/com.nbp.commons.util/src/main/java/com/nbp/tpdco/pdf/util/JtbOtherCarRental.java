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
import com.nbp.jtb.application.form.service.model.AttractionCarRentCondition;
import com.nbp.jtb.application.form.service.model.AttractionCarRentalLicence;
import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.model.JTBPaymentMethod;
import com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo;
import com.nbp.jtb.application.form.service.service.AttractionCarRentConditionLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractionCarRentalLicenceLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBPaymentMethodLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JtbAddBranchDetailInfoLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class JtbOtherCarRental {
	public static String replaceSignatureForCarRental(long jtbApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
			DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
					"Car Rental Signature of Applicant");
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
	public static String getJtbOtherCarRentalPdf(long jtbApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		JTBApplication jtbApplication = null;
		AttractionCarRentalLicence attractionCarRental = null;
		List<JtbAddBranchDetailInfo> branchDetailInfo = null;
		AttractionCarRentCondition carRental = null;
		JTBPaymentMethod jtbPayment=null;
		//Signatures
		String signatureOfCarApplicant = null;
		
		try {
			jtbApplication = JTBApplicationLocalServiceUtil.getJTBApplication(jtbApplicationId);
		} catch (Exception e) {
		}
		try {
			attractionCarRental = AttractionCarRentalLicenceLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
		}
		try {
			branchDetailInfo = JtbAddBranchDetailInfoLocalServiceUtil.getByJtbAppId(jtbApplicationId);
		} catch (Exception e) {
		}
		try {
			carRental = AttractionCarRentConditionLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
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
			  signatureOfCarApplicant=replaceSignatureForCarRental
					  (attractionCarRental.getJtbApplicationId(), "Car Rental Signature of Applicant", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
			  } catch (Exception e) {}
//pdf go in launch case
		  
		//pdf go in launch case
			if (checkPdfDownloadWithoutDocument.equals("false")) {
				pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
						"other-carrental-1");
			} else {
				try {
				pdfTemplate = getTemplateFromJournalArticlePDF
						(themeDisplay.getScopeGroupId(),
						"other-carrental");
				}catch (Exception e) {
					
				}
			}
				
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
					// car rental Licence
					"[$CarApplicantName$]", "[$ApplicantAddCar$]", "[$CarCompanyName$]", "[$CompanyAddress$]",
					"[$TelephoneNoCar$]", "[$CarEmail$]", "[$ComRegistration$]", "[$ManagerName$]", "[$VehiclesFleet$]",
					"[$Employeeno$]", "[$BranchLocation$]",

					"[$BranchOffice1$]", "[$BranchOffice2$]", "[$BranchOffice3$]", "[$BranchOffice4$]","[$BranchOffice5$]",
					"[$TelephoneNoC$]", "[$TelephoneNoC2$]", "[$TelephoneNoC3$]", "[$TelephoneNoC4$]","[$TelephoneNoC5$]",
					"[$ApplicantSignCar$]", "[$PositionCar$]", "[$DateSign$]", "[$ConditionsIndustry$]"

			},

					new String[] {
							// Applicant details
							Validator.isNotNull(attractionCarRental)
									&& Validator.isNotNull(attractionCarRental.getNcrApplicantName())
											? attractionCarRental.getNcrApplicantName()
											: "",
							Validator.isNotNull(attractionCarRental)
									&& Validator.isNotNull(attractionCarRental.getNcrAddress())
											? attractionCarRental.getNcrAddress()
											: "",
							Validator.isNotNull(attractionCarRental)
									&& Validator.isNotNull(attractionCarRental.getNcrCompanyName())
											? attractionCarRental.getNcrCompanyName()
											: "",
							Validator.isNotNull(attractionCarRental)
									&& Validator.isNotNull(attractionCarRental.getNcrCompanyAddr())
											? attractionCarRental.getNcrCompanyAddr()
											: "",
							Validator.isNotNull(attractionCarRental)
									&& Validator.isNotNull(attractionCarRental.getNcrTelephone())
											? attractionCarRental.getNcrTelephone()
											: "",
							Validator.isNotNull(attractionCarRental)
									&& Validator.isNotNull(attractionCarRental.getNcrEmail())
											? attractionCarRental.getNcrEmail()
											: "",
							Validator.isNotNull(attractionCarRental)
									&& Validator.isNotNull(attractionCarRental.getNcrDate())
											? dateFormat.format(attractionCarRental.getNcrDate())
											: "",
							Validator.isNotNull(attractionCarRental)
									&& Validator.isNotNull(attractionCarRental.getNcrManagerName())
											? attractionCarRental.getNcrManagerName()
											: "",
							Validator.isNotNull(attractionCarRental)
									&& Validator.isNotNull(attractionCarRental.getNcrVehiclesNo())
											? attractionCarRental.getNcrVehiclesNo()
											: "",
							Validator.isNotNull(attractionCarRental)
									&& Validator.isNotNull(attractionCarRental.getNcrEmployeesNo())
											? attractionCarRental.getNcrEmployeesNo()
											: "",
							Validator.isNotNull(attractionCarRental)
									&& Validator.isNotNull(attractionCarRental.getNcrOfficeLoc())
											? attractionCarRental.getNcrOfficeLoc()
											: "",
							branchDetailInfo != null && branchDetailInfo.size() > 0? branchDetailInfo.get(0).getBranchOfficeLocation(): "",
							branchDetailInfo != null && branchDetailInfo.size() > 1? branchDetailInfo.get(1).getBranchOfficeLocation(): "",
							branchDetailInfo != null && branchDetailInfo.size() > 2? branchDetailInfo.get(2).getBranchOfficeLocation(): "",
							branchDetailInfo != null && branchDetailInfo.size() > 3? branchDetailInfo.get(3).getBranchOfficeLocation(): "",
							branchDetailInfo != null && branchDetailInfo.size() > 4? branchDetailInfo.get(4).getBranchOfficeLocation(): "",
									
							branchDetailInfo != null && branchDetailInfo.size() > 0
							? branchDetailInfo.get(0).getBranchOfficeDetails()
									: "",
							branchDetailInfo != null && branchDetailInfo.size() > 1
							? branchDetailInfo.get(1).getBranchOfficeDetails()
									: "",
							branchDetailInfo != null && branchDetailInfo.size() > 2
							? branchDetailInfo.get(2).getBranchOfficeDetails()
									: "",
							branchDetailInfo != null && branchDetailInfo.size() > 3
							? branchDetailInfo.get(3).getBranchOfficeDetails()
									: "",
							branchDetailInfo != null && branchDetailInfo.size() > 4
							? branchDetailInfo.get(4).getBranchOfficeDetails()
									: "",
									signatureOfCarApplicant,
							Validator.isNotNull(attractionCarRental)
									&& Validator.isNotNull(attractionCarRental.getNcrPosition())
											? attractionCarRental.getNcrPosition()
											: "",
							Validator.isNotNull(attractionCarRental)
									&& Validator.isNotNull(attractionCarRental.getNcrSignDate())
											? dateFormat.format(attractionCarRental.getNcrSignDate())
											: "",
							Validator.isNotNull(carRental) && Validator.isNotNull(carRental.getNcrConditionProp())
									? carRental.getNcrConditionProp()
									: "", });
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
			String leaseAgreement=null;
			String foodCertificate=null;
			String foodPermit=null;
			String fireCerti=null;
			String jobTitle=null;
			String certiList=null;
			
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
				} else if (title.equals("Letter of “Good Standing” – Companies Office of Jamaica (where applicable)")) {
					letterOfGood = fileName;
				} else if (title.equals("Copy of Tax Registration Number (TRN)")) {
					copyOfTax = fileName;
				} else if (title.equals("List of Directors (where applicable)")) {
					listOfDiretor = fileName;
				} else if (title.equals("Copy of Public Liability Insurance")) {
					copyOfPublic = fileName;
				} else if (title.equals(
						"Approval from the local planning authority (e.g. KSAMC, St. James Municipal Corporation)")) {
					approvalFromTheLocal = fileName;
				} else if (title.equals(
						"Permission to Operate from location (where applicable) – Certified Lease/Rental Agreement")) {
					permissionToOperate = fileName;
				} else if (title.equals(
						"Fleet list indicating year, type, model and licence number (vehicles must be registered in the name of the company making the application)")) {
					fleetList = fileName;
				} else if (title.equals(
						"Copy of deposit requirements, terms and conditions of rental and cancellation and refund policy")) {
					copyOfDeposit = fileName;
				} else if (title.equals("Copy of Work Permit(s) (where applicable)")) {
					copyOfWork = fileName;
				}else if (title.equals("Proof of Land Tenure")) {
					landTenure = fileName;
				}else if (title.equals("Stamped Lease Agreement")) {
					leaseAgreement = fileName;
				}else if (title.equals("Food Establishment Certificate")) {
					foodCertificate = fileName;
				}else if (title.equals("Food Handlers Permit")) {
					foodPermit = fileName;
				}else if (title.equals("Fire Certificate")) {
					fireCerti = fileName;
				}else if (title.equals("List of Employees Stating Job Titles")) {
					jobTitle = fileName;
				}else if (title.equals("Team Jamaica Certification (list)")) {
					certiList = fileName;
				}
			}
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//for the document 
					"[$CarCopy$]", "[$RegistrationCopyC$]", "[$LetterStanding$]", "[$TaxRegistration$]",
					"[$CarDirectors$]", "[$PublicLiability$]", "[$LocalCorporation$]", "[$PermissionOperate$]",
					"[$FleetLicence$]", "[$TermsPolicy$]", "[$WorkPermit$]","[$landProof$]", "[$Agrrement$]", "[$foodCerti$]", "[$foodHandler$]", "[$fireCertificate$]", "[$jobList$]","[$teamJamaica$]","[$PaymentMethCarR$]" },
					new String[] { copyOfCertificate, copyOfRegistration, letterOfGood, copyOfTax, listOfDiretor,
							copyOfPublic, approvalFromTheLocal, permissionToOperate, fleetList, copyOfDeposit,
							copyOfWork,landTenure,leaseAgreement,foodCertificate,foodPermit,fireCerti,jobTitle,certiList,
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
