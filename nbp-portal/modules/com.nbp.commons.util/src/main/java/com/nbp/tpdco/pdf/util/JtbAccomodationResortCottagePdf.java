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
import com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec;
import com.nbp.jtb.application.form.service.model.AccoNonHotelLicence;
import com.nbp.jtb.application.form.service.model.AccoNonHotelRequiredLic;
import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.service.AccoNonHotelGenDecLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AccoNonHotelLicenceLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AccoNonHotelRequiredLicLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class JtbAccomodationResortCottagePdf {
	public static String replaceSignatureForResortApp(long jtbApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Resort Signature of Applicant");
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


public static String getJtbAccomodationResortCottagesPdf(long jtbApplicationId, ThemeDisplay themeDisplay,
	String checkPdfDownloadWithoutDocument) {
String pdfTemplate = StringPool.BLANK;
DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
JTBApplication jtbApplication=null;
AccoNonHotelLicence accoNonHotelLic=null;
AccoNonHotelRequiredLic reqLicence=null;
AccoNonHotelGenDec accoNonHotelGenDec=null;



//folder
List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
DLFolder supportingDocumentsFolder = null;
DLFolder supportingDocumentsParentFolder = null;
FileEntry fileEntry = null;
//Signatures
String signatureOfResortApplicant = null;

try {
	jtbApplication = JTBApplicationLocalServiceUtil.getJTBApplication(jtbApplicationId);
}catch (Exception e) {
}
try{
	accoNonHotelLic= AccoNonHotelLicenceLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
}catch(Exception e){}
try{
	reqLicence= AccoNonHotelRequiredLicLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
}catch(Exception e){}
try{
	accoNonHotelGenDec= AccoNonHotelGenDecLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
}catch(Exception e){}


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
	  signatureOfResortApplicant=replaceSignatureForResortApp
			  (accoNonHotelGenDec.getJtbApplicationId(), "Resort Signature of Applicant", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
  } catch (Exception e) {}
  

//pdf go in launch case
		if (checkPdfDownloadWithoutDocument.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
					"accommodation-resort-1");
		} else {
			try {
			pdfTemplate = getTemplateFromJournalArticlePDF
					(themeDisplay.getScopeGroupId(),
					"accommodation-resort");
			}catch (Exception e) {
				
			}
		}
try {
	pdfTemplate = StringUtil.replace(pdfTemplate, 
	new String[] {
		"[$AccommodationName$]", "[$ResortTeleNo$]", "[$ResortAddress$]", "[$ResortEmail$]", "[$ResortEmployees$]",
		"[$ResortOfferedType$]", "[$ResortRoomNumber$]", "[$ResortOwnerName$]", "[$OwnerTeleNo$]", "[$OwnerAddress$]", 
		"[$ResortCompanyName$]", "[$CompanyAddress$]", "[$ResortManagerName$]", "[$ManagerAddress$]", "[$ManagerTelephone$]", "[$ManagerEmail$]",
		
		"[$LicenceRequirement$]","[$BedroomsRequirement$]","[$BathroomsRequirement$]",
		
		"[$NonHotelOperator$]","[$From$]","[$To$]",
		"[$AccommodationSince$]","[$Date$]","[$ApplicantSign$]",
				
				
	},
	new String[] {
	//Applicant details
				Validator.isNotNull(accoNonHotelLic)&&Validator.isNotNull(accoNonHotelLic.getAccoName())?accoNonHotelLic.getAccoName():"" ,
				Validator.isNotNull(accoNonHotelLic)&&Validator.isNotNull(accoNonHotelLic.getAccoTeleNo())?accoNonHotelLic.getAccoTeleNo():"",
				Validator.isNotNull(accoNonHotelLic)&&Validator.isNotNull(accoNonHotelLic.getAccoAddress())?accoNonHotelLic.getAccoAddress():"",
				Validator.isNotNull(accoNonHotelLic)&&Validator.isNotNull(accoNonHotelLic.getAccoEmail())?accoNonHotelLic.getAccoEmail():"",
				Validator.isNotNull(accoNonHotelLic)&&Validator.isNotNull(accoNonHotelLic.getAccoNoOfEmp())?accoNonHotelLic.getAccoNoOfEmp():"",
				Validator.isNotNull(accoNonHotelLic)&&Validator.isNotNull(accoNonHotelLic.getAccoOfferedType())?accoNonHotelLic.getAccoOfferedType():"",
						
				Validator.isNotNull(accoNonHotelLic)&&Validator.isNotNull(accoNonHotelLic.getNoOfRooms())?accoNonHotelLic.getNoOfRooms():"",
				Validator.isNotNull(accoNonHotelLic)&&Validator.isNotNull(accoNonHotelLic.getOwnerName())?accoNonHotelLic.getOwnerName():"",
				Validator.isNotNull(accoNonHotelLic)&&Validator.isNotNull(accoNonHotelLic.getOwnerTeleNo())?accoNonHotelLic.getOwnerTeleNo():"",
				Validator.isNotNull(accoNonHotelLic)&&Validator.isNotNull(accoNonHotelLic.getOwnerAddress())?accoNonHotelLic.getOwnerAddress():"",
				Validator.isNotNull(accoNonHotelLic)&&Validator.isNotNull(accoNonHotelLic.getOperCompName())?accoNonHotelLic.getOperCompName():"",
				Validator.isNotNull(accoNonHotelLic)&&Validator.isNotNull(accoNonHotelLic.getOperAddress())?accoNonHotelLic.getOperAddress():"",
				Validator.isNotNull(accoNonHotelLic)&&Validator.isNotNull(accoNonHotelLic.getManagerName())?accoNonHotelLic.getManagerName():"",
				Validator.isNotNull(accoNonHotelLic)&&Validator.isNotNull(accoNonHotelLic.getManagerAddress())?accoNonHotelLic.getManagerAddress():"",
				Validator.isNotNull(accoNonHotelLic)&&Validator.isNotNull(accoNonHotelLic.getManagerTeleNo())?accoNonHotelLic.getManagerTeleNo():"",
				Validator.isNotNull(accoNonHotelLic)&&Validator.isNotNull(accoNonHotelLic.getManagerEmail())?accoNonHotelLic.getManagerEmail():"",
				
				Validator.isNotNull(reqLicence)&&Validator.isNotNull(reqLicence.getRequiredLicence())?reqLicence.getRequiredLicence():"",
				Validator.isNotNull(reqLicence)&&Validator.isNotNull(reqLicence.getRequiredBedroom())?reqLicence.getRequiredBedroom():"",
				Validator.isNotNull(reqLicence)&&Validator.isNotNull(reqLicence.getRequiredBathroom())?reqLicence.getRequiredBathroom():"",
						
				Validator.isNotNull(accoNonHotelGenDec)&&Validator.isNotNull(accoNonHotelGenDec.getNhAccoOperatorName())?accoNonHotelGenDec.getNhAccoOperatorName():"",
				Validator.isNotNull(accoNonHotelGenDec)&&Validator.isNotNull(accoNonHotelGenDec.getDateFrom())?dateFormat.format(accoNonHotelGenDec.getDateFrom()):"",
				Validator.isNotNull(accoNonHotelGenDec)&&Validator.isNotNull(accoNonHotelGenDec.getDateTo())?dateFormat.format(accoNonHotelGenDec.getDateTo()):"",
				Validator.isNotNull(accoNonHotelGenDec)&&Validator.isNotNull(accoNonHotelGenDec.getNhAccoSince())?dateFormat.format(accoNonHotelGenDec.getNhAccoSince()):"",
				Validator.isNotNull(accoNonHotelGenDec)&&Validator.isNotNull(accoNonHotelGenDec.getNhAccoDate())?dateFormat.format(accoNonHotelGenDec.getNhAccoDate()):"",
						
						
				signatureOfResortApplicant,
																																											
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
			String accoLife="";
			String accoWork = "";
			String accoTenure="";
			String accoJob="";
			String accoJamaica="";
			String accoPsra="";
			
			
			
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
				}else if (title.equals("Letter of “Good Standing” – Companies Office of Jamaica (where applicable)")) {
					accoStanding = fileName;
				}else if (title.equals("Copy of Taxpayer Registration Number (TRN)")) {
					accoTax = fileName;
				}else if (title.equals("List of Directors")) {
					accoList = fileName;
				}else if (title.equals("Copy of Title/Lease or Rental Agreement")) {
					accoLease = fileName;
				}else if (title.equals("Copy of Public Liability Insurance")) {
					accoInsurance = fileName;
				}else if (title.equals("Approval from local planning authority (e.g. KSAMC St. James Municipal Corporation)")) {
					accoApproval = fileName;
				}else if (title.equals("Copy of Public Health Certificate")) {
					accoPublic = fileName;
				}else if (title.equals("Copy of Valid Food Handler’s permit (s)")) {
					accoPermit = fileName;
				}else if (title.equals("Copy of  Fire Certificate")) {
					accoCopyFire = fileName;
				}else if (title.equals("Copy of Public Health Swimming Pool Permit (where applicable)")) {
					accoSwimming = fileName;
				}else if (title.equals("Proper Security arrangements (e.g. copy of Security Contract / certified personnel)")) {
					accoArrangement = fileName;
				}else if (title.equals("Copy of PSRA Certification for security company/personnel contracted")) {
					accoSecurity = fileName;
				}else if (title.equals("Security Approval From Resort Area Division of the JCF")) {
					accoResort = fileName;
				}else if (title.equals("Copy of  Beach Licence from NEPA (where applicable)")) {
					accoBeach = fileName;
				}else if (title.equals("Copy of CPR First Aid (Life Saving Skills)")) {
					accoAid = fileName;
				}else if (title.equals("Life Guard Certification (Where Applicable )")) {
					accoLife = fileName;
				}else if (title.equals("Copy of Work Permit (s) (where applicable)")) {
					accoWork = fileName;
				}else if (title.equals("Proof Of Land Tenure")) {
					accoTenure = fileName;
				}else if (title.equals("List Of Employees Stating Job Titles")) {
					accoJob = fileName;
				}else if (title.equals("Written Approval From The Jamaica National Heritage Trust (Where Applicable )")) {
					accoJamaica = fileName;
				}else if (title.equals("roof Of Security Arrangements From A Registered Security Company Along With PSRA Certification")) {
					accoPsra = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
				"[$AccommodationCertificate$]","[$AccommodationName1$]","[$AccommodationStanding$]","[$AccommodationTax$]",
				"[$AccommodationList$]","[$AccommodationLease$]","[$AccommodationInsurance$]","[$AccommodationApproval$]",
				"[$AccommodationPublic$]","[$AccommodationPermit$]","[$AccommodationCopyFire$]","[$AccommodationSwimming$]",
				"[$AccommodationArrangement$]","[$AccommodationSecurity$]","[$AccommodationResort$]","[$AccommodationBeach$]",
				"[$AccommodationAid$]","[$AccommodationLife$]","[$AccommodationWork$]","[$AccommodationTenure$]","[$AccommodationJob$]","[$AccommodationJamaica$]","[$AccommodationPsra$]",
				},
				new String[] {
						accoCertificate, accoName, accoStanding,accoTax, accoList,accoLease,
						 accoInsurance,accoApproval,accoPublic,accoPermit,accoCopyFire,accoSwimming,
						 accoArrangement, accoSecurity, accoResort, accoBeach, accoAid, accoLife, accoWork,accoTenure,accoJob,accoJamaica,accoPsra,
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
