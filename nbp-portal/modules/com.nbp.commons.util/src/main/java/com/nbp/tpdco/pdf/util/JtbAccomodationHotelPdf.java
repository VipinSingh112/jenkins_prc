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
import com.nbp.jtb.application.form.service.model.AccoGenDeclaration;
import com.nbp.jtb.application.form.service.model.AccoHotelLicence;
import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.service.AccoGenDeclarationLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AccoHotelLicenceLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class JtbAccomodationHotelPdf {
	public static String replaceSignatureForHotel(long jtbApplicationId, String folderName, long groupId,
	long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
	DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
			"Hotel Signature Of Applicant");
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
	public static String replaceSignatureForHotelManager(long jtbApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Hotel Signature Of Manager");
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


public static String getJtbAccomodationHotelPdf(long jtbApplicationId, ThemeDisplay themeDisplay,
	String checkPdfDownloadWithoutDocument) {
String pdfTemplate = StringPool.BLANK;
DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
JTBApplication jtbApplication=null;
AccoHotelLicence accoHotelLic =null;
AccoGenDeclaration accoHotelGenDec = null;


//folder
List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
DLFolder supportingDocumentsFolder = null;
DLFolder supportingDocumentsParentFolder = null;
FileEntry fileEntry = null;
//Signatures
String signatureOfHotelApplicant = null;
String signatureOfHotelManager = null;

try {
	jtbApplication = JTBApplicationLocalServiceUtil.getJTBApplication(jtbApplicationId);
}catch (Exception e) {
}
try {
	accoHotelLic=AccoHotelLicenceLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
}catch (Exception e) {
}
try {
	accoHotelGenDec=AccoGenDeclarationLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
} catch (Exception e) {}


try {
	supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "JTB Supported Documents");
	supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingDocumentsParentFolder.getFolderId(), String.valueOf(jtbApplication.getJtbApplicationId()));
	supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
			supportingDocumentsFolder.getFolderId());
} catch (Exception e) {
	e.printStackTrace();
}
//signatures

  try { 
	  signatureOfHotelApplicant=replaceSignatureForHotel
			  (accoHotelGenDec.getJtbApplicationId(), "Hotel Signature Of Applicant", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
	  } catch (Exception e) {}
 
  try { 
	  signatureOfHotelManager=replaceSignatureForHotelManager
			  (accoHotelGenDec.getJtbApplicationId(), "Hotel Signature Of Manager", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
  } catch (Exception e) {}
  

//pdf go in launch case
		if (checkPdfDownloadWithoutDocument.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
					"accommodation-hotels-1");
		} else {
			try {
			pdfTemplate = getTemplateFromJournalArticlePDF
					(themeDisplay.getScopeGroupId(),
					"accommodation-hotels");
			}catch (Exception e) {
				
			}
		}
try {
	pdfTemplate = StringUtil.replace(pdfTemplate, 
	new String[] {
	//Hotel Licence
		"[$HotelDirector$]","[$HotelName$]","[$HotelTeleNo$]","[$HotelEmail$]","[$HoParish$]","[$HotelAddress$]",
		
	//Hotel General Declarations
		"[$HotelBedroom$]","[$HotelOwner$]","[$HotelAddressSec$]","[$CompanyLaws$]","[$IncorporationDate$]","[$OperatorNameHotel$]","[$OpSinceDate$]","[$InceptionDate$]",
		"[$AddressThree$]","[$FinancesEnquires$]","[$EmployeesNumber$]","[$ApplicantSignature$]","[$DateSign$]","[$ManagerName$]","[$ManagerSign$]",
	
	},
	new String[] {
	//Applicant details
			Validator.isNotNull(accoHotelLic)&&Validator.isNotNull(accoHotelLic.getNameOfOwner())?accoHotelLic.getNameOfOwner():"" ,
				Validator.isNotNull(accoHotelLic)&&Validator.isNotNull(accoHotelLic.getNameOfHotel())?accoHotelLic.getNameOfHotel():"",
				Validator.isNotNull(accoHotelLic)&&Validator.isNotNull(accoHotelLic.getTelephoneNo())?accoHotelLic.getTelephoneNo():"",
				Validator.isNotNull(accoHotelLic)&&Validator.isNotNull(accoHotelLic.getEmailAddress())?accoHotelLic.getEmailAddress():"",
				Validator.isNotNull(accoHotelLic)&&Validator.isNotNull(accoHotelLic.getParish())?accoHotelLic.getParish():"",
				Validator.isNotNull(accoHotelLic)&&Validator.isNotNull(accoHotelLic.getAddress())?accoHotelLic.getAddress():"",
						
				Validator.isNotNull(accoHotelGenDec)&&Validator.isNotNull(accoHotelGenDec.getNoOfBedroom())?accoHotelGenDec.getNoOfBedroom():"" ,
				Validator.isNotNull(accoHotelGenDec)&&Validator.isNotNull(accoHotelGenDec.getOwnerOfHotel())?accoHotelGenDec.getOwnerOfHotel():"",
				Validator.isNotNull(accoHotelGenDec)&&Validator.isNotNull(accoHotelGenDec.getAddressOne())?accoHotelGenDec.getAddressOne():"",
				Validator.isNotNull(accoHotelGenDec)&&Validator.isNotNull(accoHotelGenDec.getCompIncorporatedOne())?accoHotelGenDec.getCompIncorporatedOne():"",
				Validator.isNotNull(accoHotelGenDec)&&Validator.isNotNull(accoHotelGenDec.getCompanyDate())?dateFormat.format(accoHotelGenDec.getCompanyDate()):"",
				Validator.isNotNull(accoHotelGenDec)&&Validator.isNotNull(accoHotelGenDec.getHotelOperator())?accoHotelGenDec.getHotelOperator():"",
				Validator.isNotNull(accoHotelGenDec)&&Validator.isNotNull(accoHotelGenDec.getHotelOperatorDateSince())?dateFormat.format(accoHotelGenDec.getHotelOperatorDateSince()):"",
				Validator.isNotNull(accoHotelGenDec)&&Validator.isNotNull(accoHotelGenDec.getHotelIncepDate())?dateFormat.format(accoHotelGenDec.getHotelIncepDate()):"",
				Validator.isNotNull(accoHotelGenDec)&&Validator.isNotNull(accoHotelGenDec.getAddressTwo())?accoHotelGenDec.getAddressTwo():"",
				Validator.isNotNull(accoHotelGenDec)&&Validator.isNotNull(accoHotelGenDec.getFinanceOfOper())?accoHotelGenDec.getFinanceOfOper():"",
				Validator.isNotNull(accoHotelGenDec)&&Validator.isNotNull(accoHotelGenDec.getNoOfEmployee())?accoHotelGenDec.getNoOfEmployee():"",
				
				signatureOfHotelApplicant,		
				Validator.isNotNull(accoHotelGenDec)&&Validator.isNotNull(accoHotelGenDec.getSignatureDate())?dateFormat.format(accoHotelGenDec.getSignatureDate()):"",
				Validator.isNotNull(accoHotelGenDec)&&Validator.isNotNull(accoHotelGenDec.getNameOfManager())?accoHotelGenDec.getNameOfManager():"",
				signatureOfHotelManager,
																																											
		});
		    }catch (Exception e) {
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
			String accoCopyFire = "";
			String accoSwimming = "";
			String accoArrangement = "";
			String accoSecurity = "";
			String accoResort = "";
			String accoBeach = "";
			String accoAid = "";
			String accoWork = "";
			String landTenure="";
			String jobTitle="";
			String certiList="";
			String national="";
			
			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
				} catch (Exception e) {}
				if(title.equals("Copy of Certificate of Incorporation")) {
					accoCertificate = fileName;
				}else if (title.equals("Copy of Registration of Business Name (where applicable i.e. if Business Name is different from the name of the Company)")) {
					accoName = fileName;
				}else if (title.equals("Letter of “Good Standing” – Companies Office of Jamaica")) {
					accoStanding = fileName;
				}else if (title.equals("Copy of Taxpayer Registration Number (TRN)")) {
					accoTax = fileName;
				}else if (title.equals("List of Directors")) {
					accoList = fileName;
				}else if (title.equals("Copy of Title/Lease Agreement")) {
					accoLease = fileName;
				}else if (title.equals("Copy of Public Liability Insurance")) {
					accoInsurance = fileName;
				}else if (title.equals("Approval from local planning authority (e.g. KSAMC St. James Municipal Corporation)")) {
					accoApproval = fileName;
				}else if (title.equals("Copy of Public Health Certificate")) {
					accoPublic = fileName;
				}else if (title.equals("Copy of Valid Food Handler’s permit(s)")) {
					accoPermit = fileName;
				}else if (title.equals("Copy of  Fire Certificate")) {
					accoCopyFire = fileName;
				}else if (title.equals("Copy of Public Health Swimming Pool Permit")) {
					accoSwimming = fileName;
				}else if (title.equals("Proof Of Security Arrangements From A Registered Security Company Along With PSRA Certification")) {
					accoArrangement = fileName;
				}else if (title.equals("Life Guard Certification (Where Applicable)")) {
					accoSecurity = fileName;
				}else if (title.equals("Security Approval From Resort Area Division of the Jamaica Constabulary Force")) {
					accoResort = fileName;
				}else if (title.equals("Copy of  Beach Licence from NEPA (where applicable)")) {
					accoBeach = fileName;
				}else if (title.equals("CPR First Aid (Life Saving Skills)")) {
					accoAid = fileName;
				}else if (title.equals("Copy of Work Permit (where applicable)")) {
					accoWork = fileName;
				}else if (title.equals("Proof of Land Tenure")) {
					landTenure = fileName;
				}else if (title.equals("List Of Employees Stating Job Titles")) {
					jobTitle = fileName;
				}else if (title.equals("Team Jamaica Certification (List)")) {
					certiList = fileName;
				}else if (title.equals("Written Approval From The Jamaica National Heritage Trust (Where Applicable)")) {
					national = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
				"[$AccommodationCertificate$]","[$AccommodationName$]","[$AccommodationStanding$]","[$AccommodationTax$]",
				"[$AccommodationList$]","[$AccommodationLease$]","[$AccommodationInsurance$]","[$AccommodationApproval$]",
				"[$AccommodationPublic$]","[$AccommodationPermit$]","[$AccommodationCopyFire$]","[$AccommodationSwimming$]",
				"[$AccommodationArrangement$]","[$AccommodationSecurity$]","[$AccommodationResort$]","[$AccommodationBeach$]",
				"[$AccommodationAid$]","[$AccommodationWork$]","[$Accommodationland$]","[$AccommodationTitle$]","[$AccommodationCertiList$]","[$AccommodationNational$]",
				},
				new String[] {
						accoCertificate, accoName, accoStanding,accoTax, accoList,accoLease,
						 accoInsurance,accoApproval,accoPublic,accoPermit,accoCopyFire,accoSwimming,
						 accoArrangement, accoSecurity, accoResort, accoBeach,accoAid,accoWork,landTenure,jobTitle,certiList,national,
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
