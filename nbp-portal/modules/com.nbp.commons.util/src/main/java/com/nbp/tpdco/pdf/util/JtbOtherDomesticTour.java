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
import com.nbp.jtb.application.form.service.model.AttractionDomesticService;
import com.nbp.jtb.application.form.service.model.AttractionDomesticTour;
import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.model.JTBPaymentMethod;
import com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo;
import com.nbp.jtb.application.form.service.service.AttractionDomesticServiceLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractionDomesticTourLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBPaymentMethodLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JtbAddBranchDetailInfoLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class JtbOtherDomesticTour {
	   public static String replaceSignatureForApplicant(long jtbApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Domestic Signature of Applicant");
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
	  public static String replaceSignatureForService(long jtbApplicationId, String folderName, long groupId,
				long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
			DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
					"Domestic Signature Service");
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
	  public static String replaceSignatureForCompany(long jtbApplicationId, String folderName, long groupId,
				long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
			DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
					"Domestic Company Seal");
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

	
	public static String getJtbOtherDomesticTourPdf(long jtbApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {

		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		JTBApplication jtbApplication = null;
		AttractionDomesticTour attractionDomesticTour = null;
		List<JtbAddBranchDetailInfo> addBranchDetailInfo = null;
		AttractionDomesticService attractionDomesticService = null;
		JTBPaymentMethod jtbPayment=null;
		
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		
		
		//Signatures
		String signatureOfApplicant = null;
		String signatureOfService = null;
		String signatureOfCompany = null;
		try {
			jtbApplication=JTBApplicationLocalServiceUtil.getJTBApplication(jtbApplicationId);
		}catch(Exception e) {}
		try{
			jtbPayment= JTBPaymentMethodLocalServiceUtil.getJTBById(jtbApplicationId);
		}catch(Exception e){}
		
		try {
			attractionDomesticTour = AttractionDomesticTourLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
		}
		try {
			addBranchDetailInfo = JtbAddBranchDetailInfoLocalServiceUtil.getByJtbAppId(jtbApplicationId);
		} catch (Exception e) {
		}
		try {
			attractionDomesticService = AttractionDomesticServiceLocalServiceUtil
					.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
		}
		
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
			  signatureOfApplicant =replaceSignatureForApplicant
					  (jtbApplication.getJtbApplicationId(), "Domestic Signature of Applicant", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
		  } catch (Exception e) {}
		  
		  try { 
			  signatureOfService =replaceSignatureForService(jtbApplication.getJtbApplicationId(), "Domestic Signature Service", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
		  } catch (Exception e) {}
		  try { 
			  signatureOfCompany =replaceSignatureForCompany(jtbApplication.getJtbApplicationId(), "Domestic Company Seal", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
		  } catch (Exception e) {}
		  
         //pdf go in launch case
		  
		if (checkPdfDownloadWithoutDocument.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(), "other-domestictour-1");
		} else {
			try {
				pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(), "other-domestictour");
			} catch (Exception e) {

			}
		}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate,
					new String[] { "[$ApplicantTourName$]", "[$TourAddress]", "[$CompanyNameTour$]",
							"[$ExactLocationTour$]", "[$TourTeleNo$]", "[$TourEmail$]", "[$ComRegistrationTour$]",
							"[$ManagerNameTour$]", "[$TourVehiclesFleet$]", "[$TourEmpNo$]", 
//				for the add 
							"[$TelephoneNoDomTour$]", "[$BranchOfficeLoc$]",
							"[$TelephoneNoDomTour2$]","[$BranchOfficeLoc2$]",
							"[$TelephoneNoDomTour3$]","[$BranchOfficeLoc3$]",
							"[$TelephoneNoDomTour4$]","[$BranchOfficeLoc4$]",
							"[$TelephoneNoDomTour5$]","[$BranchOfficeLoc5$]",
//				signature of applicant 
							"[$TourSign$]",
//              Date	
							"[$TourDate$]",
//				Conditions Proposed for Motor Bike Rental
							"[$SecureAcco$]", "[$AirportService$]", "[$GeneralTour$]", "[$ProvidesServices$]",
							"[$IndividualsGroups$]", "[$ConjunctionTour$]", "[$DriverBasis$]", "[$ArrangeMeals$]",
							
							//sign1
							"[$TourSignature$]",
							//sign2
							"[$CompanySealTour$]",
							//date
							"[$TourDateSign$]",

					},

					new String[] {
							// Applicant details
							Validator.isNotNull(attractionDomesticTour)
									&& Validator.isNotNull(attractionDomesticTour.getDomesticTourApplicantName())
											? attractionDomesticTour.getDomesticTourApplicantName()
											: "",
							Validator.isNotNull(attractionDomesticTour)
									&& Validator.isNotNull(attractionDomesticTour.getDomesticTourAddress())
											? attractionDomesticTour.getDomesticTourAddress()
											: "",
							Validator.isNotNull(attractionDomesticTour)
									&& Validator.isNotNull(attractionDomesticTour.getDomesticTourCompanyName())
											? attractionDomesticTour.getDomesticTourCompanyName()
											: "",
							Validator.isNotNull(attractionDomesticTour)
									&& Validator.isNotNull(attractionDomesticTour.getDomesticTourExactLocation())
											? attractionDomesticTour.getDomesticTourExactLocation()
											: "",
							Validator.isNotNull(attractionDomesticTour)
									&& Validator.isNotNull(attractionDomesticTour.getDomesticTourTelephone())
											? attractionDomesticTour.getDomesticTourTelephone()
											: "",
							Validator.isNotNull(attractionDomesticTour)
									&& Validator.isNotNull(attractionDomesticTour.getDomesticTourEmail())
											? attractionDomesticTour.getDomesticTourEmail()
											: "",
							Validator.isNotNull(attractionDomesticTour)
									&& Validator.isNotNull(attractionDomesticTour.getDomesticTourDate())
											? dateFormat.format(attractionDomesticTour.getDomesticTourDate())
											: "",
							Validator.isNotNull(attractionDomesticTour)
									&& Validator.isNotNull(attractionDomesticTour.getDomesticTourManagerName())
											? attractionDomesticTour.getDomesticTourManagerName()
											: "",
							Validator.isNotNull(attractionDomesticTour)
									&& Validator.isNotNull(attractionDomesticTour.getDomesticTourVehiclesNum())
											? attractionDomesticTour.getDomesticTourVehiclesNum()
											: "",
							Validator.isNotNull(attractionDomesticTour)
									&& Validator.isNotNull(attractionDomesticTour.getDomesticTourEmployeesNo())
											? attractionDomesticTour.getDomesticTourEmployeesNo()
											: "",
							//add more

							addBranchDetailInfo != null && addBranchDetailInfo.size() > 0
									? addBranchDetailInfo.get(0).getBranchOfficeDetails()
									: "",
							addBranchDetailInfo != null && addBranchDetailInfo.size() > 0
									? addBranchDetailInfo.get(0).getBranchOfficeLocation()
									: "",		
									
				
							addBranchDetailInfo != null && addBranchDetailInfo.size() > 1
									? addBranchDetailInfo.get(1).getBranchOfficeDetails()
									: "",
							addBranchDetailInfo != null && addBranchDetailInfo.size() > 1
									? addBranchDetailInfo.get(1).getBranchOfficeLocation()
									: "",	
									
									
							addBranchDetailInfo != null && addBranchDetailInfo.size() > 2
									? addBranchDetailInfo.get(2).getBranchOfficeDetails()
									: "",
							addBranchDetailInfo != null && addBranchDetailInfo.size() > 2
									? addBranchDetailInfo.get(2).getBranchOfficeLocation()
									: "",	
									
									
							addBranchDetailInfo != null && addBranchDetailInfo.size() > 3
									? addBranchDetailInfo.get(3).getBranchOfficeDetails()
									: "",
							addBranchDetailInfo != null && addBranchDetailInfo.size() > 3
									? addBranchDetailInfo.get(3).getBranchOfficeLocation()
									: "",	
									
									
							addBranchDetailInfo != null && addBranchDetailInfo.size() > 4
									? addBranchDetailInfo.get(4).getBranchOfficeDetails()
									: "",
							addBranchDetailInfo != null && addBranchDetailInfo.size() > 4
									? addBranchDetailInfo.get(4).getBranchOfficeDetails()
									: "",
								
									
						    //sign
							signatureOfApplicant,
									
									
							
							//date	
							Validator.isNotNull(attractionDomesticTour)
									&& Validator.isNotNull(attractionDomesticTour.getDomesticTourSignDate())
											? dateFormat.format(attractionDomesticTour.getDomesticTourSignDate())
											: "",

																		
											
											
							//second form				
											
											
							Validator.isNotNull(attractionDomesticService)
									&& Validator.isNotNull(attractionDomesticService.getIndividualsApartment())
											? attractionDomesticService.getIndividualsApartment()
											: "",

							Validator.isNotNull(attractionDomesticService)
									&& Validator.isNotNull(attractionDomesticService.getAirportAssistance())
											? attractionDomesticService.getAirportAssistance()
											: "",
							Validator.isNotNull(attractionDomesticService)
									&& Validator.isNotNull(attractionDomesticService.getEntireTour())
											? attractionDomesticService.getEntireTour()
											: "",
							Validator.isNotNull(attractionDomesticService)
									&& Validator.isNotNull(attractionDomesticService.getTransfersDeparture())
											? attractionDomesticService.getTransfersDeparture()
											: "",
							Validator.isNotNull(attractionDomesticService)
									&& Validator.isNotNull(attractionDomesticService.getIndividualGroups())
											? attractionDomesticService.getIndividualGroups()
											: "",

							Validator.isNotNull(attractionDomesticService)
									&& Validator.isNotNull(attractionDomesticService.getOrganizedconJunction())
											? attractionDomesticService.getOrganizedconJunction()
											: "",
							Validator.isNotNull(attractionDomesticService)
									&& Validator.isNotNull(attractionDomesticService.getDailyTransportation())
											? attractionDomesticService.getDailyTransportation()
											: "",
							Validator.isNotNull(attractionDomesticService)
									&& Validator.isNotNull(attractionDomesticService.getEntertainment())
											? attractionDomesticService.getEntertainment()
											: "",

							//sign1
							signatureOfService,	
											
						   //sign2
							signatureOfCompany,			
											
						//date
							Validator.isNotNull(attractionDomesticService)
									&& Validator.isNotNull(attractionDomesticService.getDomesticTourSealDate())
											? dateFormat.format(attractionDomesticService.getDomesticTourSealDate())
											: "",

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
			String approvalFromNational = null;
			String landTenure=null;
			String leaseAgreement=null;
			String beachLicence=null;
			String fireCerti=null;
			String lifeGuardCerti=null;
			String firstAid=null;
			String jobTitle=null;
			String jamaicaList=null;
			String fitnessCerti=null;
			String listEvent=null;
			String fleetList=null;
			String proofSecurity=null;
			
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
				} else if (title
						.equals("Proof of Ownership (eg copy of Land Title) or Certified Lease/Rental Agreement")) {
					proofOfOwnership = fileName;
				} else if (title.equals(
						"Approval from local planning authority (e.g. KSAMC, St. James Municipal Corporation) – This is required for both Home Based and Commercial Operations")) {
					approvalFromLocal = fileName;
				} else if (title.equals(
						"Brochure showing visitor services offered (Accommodation, Transportation, Meals etc.) only licensed Attractions to be visited. Attraction to have TPDCo certified Tour Guides")) {
					brochureShowing = fileName;
				} else if (title.equals("Copy of Public Health Food Establishment Certificate (where applicable)")) {
					copyOfPublicHealth = fileName;
				} else if (title.equals("Copy of valid Food Handler’s Permit(s) (where applicable)")) {
					copyOfValid = fileName;
				} else if (title.equals("Submit fleet list including year, type, model and licence number")) {
					submitFleet = fileName;
				} else if (title.equals(
						"Submit name of carriers of Jamaica Tourist Board licensed Contract Carriage operators as well as other carriers to be used that are approved by all the relevant authorities")) {
					submitName = fileName;
				} else if (title.equals("Submit list of Tour Guides")) {
					submitList = fileName;
				} else if (title.equals(
						"Copy of TPDCo Tour Guides Certification for each tour guide (Certificates to be submitted with licence application)")) {
					copyOfTpdco = fileName;
				} else if (title.equals("Work Permit(s) (where applicable)")) {
					workPermit = fileName;
				} else if (title.equals("Copy of Security Contract (where applicable)")) {
					copyOfSecurity = fileName;
				} else if (title.equals(
						"Security Approval from Resort Areas Division of the Jamaica Constabulary Force – (where applicable)")) {
					securityApproval = fileName;
				} else if (title
						.equals("Approval from National Environment and Planning Agency (NEPA) – (where applicable)")) {
					approvalFromNational = fileName;
				} else if (title
						.equals("Proof of Land Tenure")) {
					landTenure = fileName;
				} else if (title
						.equals("Stamped Lease Agreement")) {
					leaseAgreement = fileName;
				} else if (title
						.equals("Beach Licence (where applicable)")) {
					beachLicence = fileName;
				} else if (title
						.equals("Fire Certificate")) {
					fireCerti = fileName;
				} else if (title
						.equals("Life Guard Certification (where applicable )")) {
					lifeGuardCerti = fileName;
				} else if (title
						.equals("CPR First Aid (life saving skills)")) {
					firstAid = fileName;
				} else if (title
						.equals("List of Employees Stating Job Titles")) {
					jobTitle = fileName;
				} else if (title
						.equals("Team Jamaica Certification (list)")) {
					jamaicaList = fileName;
				} else if (title
						.equals("Fitness Certificate For Motorized Transportation For Touring Property")) {
					fitnessCerti = fileName;
				}  else if (title
						.equals("List of Events /Activities")) {
					listEvent = fileName;
				}  else if (title
						.equals("Fleet Listing")) {
					fleetList = fileName;
				} else if (title
						.equals("Proof of Security Arrangement From Registered Security Company Along With Psra Certification")) {
					proofSecurity = fileName;
				}
			}
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//for the document 
					"[$IncorporationCertificateTour$]", "[$BusinessNameBikeTour$]", "[$CompaniesOfficeTour$]",
					"[$TrnNumberTaxTour$]", "[$DirectorListTour$]", "[$PublicInsuranceTour$]", "[$ProofOwnershipTour$]",
					"[$PlanningAuthorityTour$]", "[$VisitorServicesTour$]", "[$PublicHealthTour$]",
					"[$FoodHandlerTour$]", "[$FleetYearTour$]", "[$TouristBoardTour$]", "[$SubmitListTour$]",
					"[$GuideLicenceTour$]", "[$WorkPermitTour$]", "[$SecurityContract$]", "[$ResortDivision$]",
					"[$NationalAgency$]", 
					"[$ProofTenure$]", "[$Agreement$]", "[$BeachLic$]", "[$FireCertificate$]",
					"[$LifeGuardCertificate$]", "[$FirstAidCerti$]", "[$JobTitleCerti$]", "[$JamaicaListCerti$]",
					"[$FitnessCertificate$]", "[$ListEventCertificate$]", "[$FleetListCertificate$]", "[$ProofSecurityCerti$]",
					"[$PaymentMethCarR$]", 
					},
					new String[] { copyOfCertificate, copyOfRegistration, letterOfGood, copyOfTax, listOfDiretor,
							copyOfPublic, proofOfOwnership, approvalFromLocal, brochureShowing, copyOfPublicHealth,
							copyOfValid, submitFleet, submitName, submitList, copyOfTpdco, workPermit, copyOfSecurity,
							securityApproval, approvalFromNational,landTenure,leaseAgreement,beachLicence,fireCerti,lifeGuardCerti,firstAid,jobTitle,jamaicaList,fitnessCerti,listEvent,fleetList,proofSecurity,
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