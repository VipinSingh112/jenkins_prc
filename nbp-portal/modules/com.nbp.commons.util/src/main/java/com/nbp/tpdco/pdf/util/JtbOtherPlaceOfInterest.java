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
import com.nbp.jtb.application.form.service.model.AttractionPlaceOfInterest;
import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.model.JTBPaymentMethod;
import com.nbp.jtb.application.form.service.service.AttractionPlaceOfInterestLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBPaymentMethodLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class JtbOtherPlaceOfInterest {
	public static String replaceSignatureOfPlaceInterest(long jtbApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
			DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
					"Place Signature of Applicant");
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
	public static String getJtbOtherPlaceOfInterestPdf(long jtbApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
String pdfTemplate = StringPool.BLANK;
DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
JTBApplication jtbApplication=null;
AttractionPlaceOfInterest placeOfInterest = null;


//Signatures
String signatureOfInterest = null;

try {
	jtbApplication = JTBApplicationLocalServiceUtil.getJTBApplication(jtbApplicationId);
}catch (Exception e) {
}
try {
	placeOfInterest=AttractionPlaceOfInterestLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
}catch (Exception e) {
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
	  signatureOfInterest=replaceSignatureOfPlaceInterest
			  (placeOfInterest.getJtbApplicationId(), "Place Signature of Applicant", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
	  } catch (Exception e) {}
 
//pdf go in launch case
		if (checkPdfDownloadWithoutDocument.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
					"other-placeofinterest-1");
		} else {
			try {
			pdfTemplate = getTemplateFromJournalArticlePDF
					(themeDisplay.getScopeGroupId(),
					"other-placeofinterest");
			}catch (Exception e) {
				
			}
		}
try {
	pdfTemplate = StringUtil.replace(pdfTemplate, 
	new String[] {
	//car rental Licence
		"[$InterestPlaces$]",
		"[$OwnerP$]",
		"[$ManagersName$]",
		"[$PlaceNameInterest$]",
		"[$WorshipLocation$]",
		"[$MallingAddressPlace$]",
		"[$InterestTeleNo$]",
		"[$InterestEmailAdd$]",
		"[$InterestEmpNo$]",
		"[$InterestParish$]",
		
		"[$WorshipPlace$]",
		"[$ManagerName$]",
		"[$InterestDate$]",
		"[$InterestPlaceName$]",
		"[$InterestOperatingSince$]",
		"[$AcresOfLand$]",
		"[$WalkingTour$]",
		"[$CemeteryTour$]",
		"[$GardenTour$]",
		"[$RoomsCabins$]",
		"[$TentSpace$]",
		"[$Showers$]",
		"[$Conveniences$]",
		"[$placeInterestDate$]","[$PlaceInterestSign$]",
	
	},
	new String[] {
	//Applicant details
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterest())?placeOfInterest.getPlaceOfInterest():"" ,
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getTypeOfRole())?placeOfInterest.getTypeOfRole():"" ,		
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceInterestOwnerName())?placeOfInterest.getPlaceInterestOwnerName():"" ,
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getNameOfInterestLocation())?placeOfInterest.getNameOfInterestLocation():"" ,
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestLocation())?placeOfInterest.getPlaceOfInterestLocation():"" ,
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestMailing())?placeOfInterest.getPlaceOfInterestMailing():"" ,
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestTelephone())?placeOfInterest.getPlaceOfInterestTelephone():"" ,
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestEmail())?placeOfInterest.getPlaceOfInterestEmail():"" ,
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestEmployeesNo())?placeOfInterest.getPlaceOfInterestEmployeesNo():"" ,
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestParish())?placeOfInterest.getPlaceOfInterestParish():"" ,
			
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestOwnerGenDec())?placeOfInterest.getPlaceOfInterestOwnerGenDec():"" ,
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestHotelLaws())?placeOfInterest.getPlaceOfInterestHotelLaws():"" ,
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestDate())?dateFormat.format((placeOfInterest.getPlaceOfInterestDate())):"" ,
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestName())?placeOfInterest.getPlaceOfInterestName():"" ,
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestOperating())?dateFormat.format(placeOfInterest.getPlaceOfInterestOperating()):"" ,
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestAcresLand())?placeOfInterest.getPlaceOfInterestAcresLand():"" ,
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getWalkingTour())?placeOfInterest.getWalkingTour():"" ,
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getCemeteryTour())?placeOfInterest.getCemeteryTour():"" ,
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getGardenTour())?placeOfInterest.getGardenTour():"" ,
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestRooms())?placeOfInterest.getPlaceOfInterestRooms():"" ,
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestTentSpace())?placeOfInterest.getPlaceOfInterestTentSpace():"" ,
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestShowers())?placeOfInterest.getPlaceOfInterestShowers():"" ,
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestSanitary())?placeOfInterest.getPlaceOfInterestSanitary():"" ,
			Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestSignDate())?dateFormat.format(placeOfInterest.getPlaceOfInterestSignDate()):"" ,
					signatureOfInterest,																																							
		});
		    }catch (Exception e) {
			}

if (!checkPdfDownloadWithoutDocument.equals("false")) {
	String fileName = null;
	String title = null;
	String copyOfCertificate = null;
	String copyOfRegistration = null;
	String letterOfGood = null;
	String copyOfTax = null;
	String listOfDiretor = null;
	String proofOfOwnerShip = null;
	String approvalFromLocal = null;
	String appovalFromJamaica = null;
	String writtenApproval = null;
	String copyOfPublic = null;
	String copyOfPublicHealth = null;
	String copyOfFood = null;
	String copyOfFire = null;
	String listAndDescribe = null;
	String descriptionOfProperty = null;
	String listOfEmployee = null;
	String copyOfTpdo = null;
	String properSecurity = null;
	String copyOfPsra = null;
	String securityApproval = null;
	String managementPlan = null;
	
	String landTenure=null;
	String leaseAgreement=null;
	String beachLicence=null;
	String poolPermit=null;
	String guardCerti=null;
	String tourGuide=null;
	String jamaicaList=null;
	String vetCerti=null;
	String writtenApp=null;
	String riverRaft=null;
	String proofSecurity=null;
	String cprAid=null;
	String planSite=null;
	
	for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
		try {
			fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
		} catch (PortalException e) {
			e.printStackTrace();
		}
		fileName = fileEntry.getFileName();
		title = fileEntry.getTitle();
		if (title.equals("Copy of  Certificate of Incorporation")) {
			copyOfCertificate = fileName;
		}else if (title.equals("Copy of Registration of Business Name (where applicable i.e. if Business Name is different from the name of  the Company)")) {
			copyOfRegistration = fileName;
		}else if (title.equals("Letter of “Good Standing” – Companies Office of Jamaica (where applicable)")) {
			letterOfGood = fileName;
		}else if (title.equals("Copy of Tax Registration Number (TRN)")) {
			copyOfTax = fileName;
		}else if (title.equals("List of Directors")) {
			listOfDiretor = fileName;
		}else if (title.equals("Proof of Ownership (eg copy of Land Title) or Certified Lease/Rental Agreement")) {
			proofOfOwnerShip= fileName;
		}else if (title.equals("Approval from local planning authority (e.g. KSAMC, St. James Municipal Corporation)")) {
			approvalFromLocal = fileName;
		} else if (title.equals("Approval from Jamaica National Heritage Trust (where applicable)")) {
			appovalFromJamaica = fileName;
		} else if (title.equals("Written approval from NEPA (where applicable)")) {
			writtenApproval = fileName;
		} else if (title.equals("Copy of Public Liability Insurance")) {
			copyOfPublic = fileName;
		} else if (title.equals("Copy of Public Health Food Establishment Certificate (where applicable)")) {
			copyOfPublicHealth = fileName;
		}else if (title.equals("Copy of Food Handler’s Permit(s) (where applicable)")) {
			copyOfFood = fileName;
		}else if (title.equals("Copy of Fire Certificate")) {
			copyOfFire = fileName;
		}else if (title.equals("List and describe events/activities offered at Place of Interest\\Worship (e.g. in a printed brochure)")) {
			listAndDescribe = fileName;
		}else if (title.equals("Description of property")) {
			descriptionOfProperty = fileName;
		}else if (title.equals("List of Employees (with job titles)")) {
			listOfEmployee = fileName;
		}else if (title.equals("Copy of TPDCo Tour Guide Certification (where applicable)")) {
			copyOfTpdo= fileName;
		}else if (title.equals("Proper Security Arrangements (i.e. security contract/certified personnel)")) {
			properSecurity = fileName;
		}else if (title.equals("Copy of PSRA Certification for Security Company/Personnel contracted")) {
			copyOfPsra = fileName;
		}else if (title.equals("Security Approval From Resort Area Division of the Jamaica Constabulary Force")) {
			securityApproval = fileName;
		}else if (title.equals("Management Plan to include environmental procedure, best practices, maintenance of facility and training of staff")) {
			managementPlan = fileName;
		}else if (title.equals("Proof of Land Tenure")) {
			landTenure = fileName;
		}else if (title.equals("Stamped Lease Agreement")) {
			leaseAgreement = fileName;
		}else if (title.equals("Beach Licence (where applicable)")) {
			beachLicence = fileName;
		}else if (title.equals("Swimming Pool Permit (where applicable)")) {
			poolPermit = fileName;
		}else if (title.equals("Life Guard Certification (where applicable )")) {
			guardCerti = fileName;
		}else if (title.equals("Certification of Tour Guides")) {
			tourGuide = fileName;
		}else if (title.equals("Team Jamaica Certification (list)")) {
			jamaicaList = fileName;
		}else if (title.equals("Veterinary Certificate for Animals Used At Attractions and Tours")) {
			vetCerti = fileName;
		}else if (title.equals("Written Approval From The Jamaica National Heritage Trust (where applicable)")) {
			writtenApp = fileName;
		}else if (title.equals("Permission From River Rafting Authority (where applicable)")) {
			riverRaft = fileName;
		}else if (title.equals("Proof of Security Arrangement From Registered Security Company Along With Psra Certification")) {
			proofSecurity = fileName;
		}else if (title.equals("CPR FIRST AID (LIFE SAVING SKILLS)")) {
			cprAid = fileName;
		}else if (title.equals("Management Plan Re Site Maintenance Preservation Safety Disaster Preparedness and Training")) {
			planSite = fileName;
		}
	}
	pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//for the document 
"[$InterestCerCopy$]","[$InterestRegistration$]","[$InterestOffice$]","[$InterestNumber$]","[$InterestDirectors$]","[$InterestOwnership$]",
"[$InterestLocal$]","[$InterestTrust$]","[$InterestNepa$]","[$InterestLiability$]","[$InterestHealth$]","[$InterestFood$]",
"[$InterestCertificate$]","[$InterestEvents$]","[$InterestProperty$]","[$InterestEmployees$]","[$InterestGuide$]",
"[$InterestProper$]","[$InterestCompany$]","[$InterestDivision$]","[$InterestPlan$]",

"[$TenureLand$]","[$AgreeLease$]","[$LicenecBeach$]","[$PermitPool$]",
"[$CertiGuard$]","[$GuideTour$]","[$ListJamaica$]","[$CeriVet$]",
"[$AppWritten$]","[$RaftRiver$]","[$SecurityProof$]","[$AidCpr$]","[$SitePlan$]",

	},
			new String[] { copyOfCertificate,copyOfRegistration,letterOfGood ,copyOfTax ,listOfDiretor,
					proofOfOwnerShip,approvalFromLocal,appovalFromJamaica,writtenApproval,copyOfPublic,copyOfPublicHealth,copyOfFood,copyOfFire,
					listAndDescribe,descriptionOfProperty,listOfEmployee,copyOfTpdo,properSecurity,copyOfPsra,securityApproval,managementPlan,
					landTenure,leaseAgreement,beachLicence,poolPermit,guardCerti,tourGuide,jamaicaList,vetCerti,writtenApp,riverRaft,proofSecurity,cprAid,planSite});
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
