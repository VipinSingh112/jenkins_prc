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
import com.nbp.jtb.application.form.service.model.AccoHomeStay;
import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.service.AccoHomeStayLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class JtbAccomodationHomeStayPdf {
	public static String replaceSignatureForHomeApplicant(long jtbApplicationId, String folderName, long groupId,
	long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
	DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
			"Home Stay Signature Of Applicant");
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
	public static String replaceSignatureForHomeSeal(long jtbApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Home Stay Applicant Seal");
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


public static String getJtbAccomodationHomeStayPdf(long jtbApplicationId, ThemeDisplay themeDisplay, String checkPdfDownloadWithoutDocument) {
String pdfTemplate = StringPool.BLANK;
DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
JTBApplication jtbApplication=null;
AccoHomeStay accoHomeStay=null;


//folder
List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
DLFolder supportingDocumentsFolder = null;
DLFolder supportingDocumentsParentFolder = null;
FileEntry fileEntry = null;
//Signatures
String signatureOfHomeApplicant = null;
String signatureOfHomeSeal = null;

try {
	jtbApplication = JTBApplicationLocalServiceUtil.getJTBApplication(jtbApplicationId);
}catch (Exception e) {
}
try{
	accoHomeStay= AccoHomeStayLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
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
	  signatureOfHomeApplicant=replaceSignatureForHomeApplicant
			  (accoHomeStay.getJtbApplicationId(), "Home Stay Signature Of Applicant", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
	  } catch (Exception e) {}
 
  try { 
	  signatureOfHomeSeal =replaceSignatureForHomeSeal
			  (accoHomeStay.getJtbApplicationId(), "Home Stay Applicant Seal", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
  } catch (Exception e) {}
  

//pdf go in launch case
		if (checkPdfDownloadWithoutDocument.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
					"accommodation-home-stay-1");
		} else {
			try {
			pdfTemplate = getTemplateFromJournalArticlePDF
					(themeDisplay.getScopeGroupId(),
					"accommodation-home-stay");
			}catch (Exception e) {
				
			}
		}
try {
	pdfTemplate = StringUtil.replace(pdfTemplate, 
	new String[] {
	//Hotel Licence
			"[$HomeAccoName$]", "[$HomeOperator$]", "[$HomeAddress$]", "[$HomeTelephoneNo$]", 
			"[$HomeMobile$]", "[$HomeEmail$]", "[$HomeEmyNo$]", "[$WebsiteHome$]", "[$HomeDirection$]",
			"[$HouseBedroomNo$]", "[$AvailableBedrooms$]", "[$WithBathroom$]", "[$SharedBathroom$]", "[$ApplicantSignStay$]",
			"[$DateStay$]", "[$CertifiedPease$]", "[$ManagerHome$]",
		
	
	},
	new String[] {
	//Applicant details
				Validator.isNotNull(accoHomeStay)&&Validator.isNotNull(accoHomeStay.getHomeAccoName())?accoHomeStay.getHomeAccoName():"" ,
				Validator.isNotNull(accoHomeStay)&&Validator.isNotNull(accoHomeStay.getHomeOwnerName())?accoHomeStay.getHomeOwnerName():"",
				Validator.isNotNull(accoHomeStay)&&Validator.isNotNull(accoHomeStay.getPropertyAddress())?accoHomeStay.getPropertyAddress():"",
				Validator.isNotNull(accoHomeStay)&&Validator.isNotNull(accoHomeStay.getHomeTeleNo())?accoHomeStay.getHomeTeleNo():"",
				Validator.isNotNull(accoHomeStay)&&Validator.isNotNull(accoHomeStay.getHomeMobile())?accoHomeStay.getHomeMobile():"",
				Validator.isNotNull(accoHomeStay)&&Validator.isNotNull(accoHomeStay.getHomeEmail())?accoHomeStay.getHomeEmail():"",
						
				Validator.isNotNull(accoHomeStay)&&Validator.isNotNull(accoHomeStay.getHomeEmployeeNo())?accoHomeStay.getHomeEmployeeNo():"" ,
				Validator.isNotNull(accoHomeStay)&&Validator.isNotNull(accoHomeStay.getWebsite())?accoHomeStay.getWebsite():"",
				Validator.isNotNull(accoHomeStay)&&Validator.isNotNull(accoHomeStay.getPropDirection())?accoHomeStay.getPropDirection():"",
				Validator.isNotNull(accoHomeStay)&&Validator.isNotNull(accoHomeStay.getNumOfBedrooms())?accoHomeStay.getNumOfBedrooms():"",
				Validator.isNotNull(accoHomeStay)&&Validator.isNotNull(accoHomeStay.getNumOfGuestBedroom())?accoHomeStay.getNumOfGuestBedroom():"",
				Validator.isNotNull(accoHomeStay)&&Validator.isNotNull(accoHomeStay.getWithBathroom())?accoHomeStay.getWithBathroom():"",
				Validator.isNotNull(accoHomeStay)&&Validator.isNotNull(accoHomeStay.getSharedBathroom())?accoHomeStay.getSharedBathroom():"",
				signatureOfHomeApplicant,
				Validator.isNotNull(accoHomeStay)&&Validator.isNotNull(accoHomeStay.getSignDate())?dateFormat.format(accoHomeStay.getSignDate()):"",
				Validator.isNotNull(accoHomeStay)&&Validator.isNotNull(accoHomeStay.getCertifiedBy())?accoHomeStay.getCertifiedBy():"",
				signatureOfHomeSeal,
																																											
		});
		    }catch (Exception e) {
				// TODO: handle exception
			}
	
  if (!checkPdfDownloadWithoutDocument.equals("false")) {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
			String accoPeace = "";
			String accoCopy = "";
			String accoTax = "";
			String accoProof = "";
			String accoPublic = "";
			String accoJamaica = "";
			String accoHealth = "";
			String accoFood = "";
			String accoLetter = "";
			String accoCharacter = "";
			String accoWork = "";
			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
				} catch (Exception e) {}
				if(title.equals("Completed Application form CERTIFIED by a Justice of the Peace/Minister of Religion/Superintendent of   Police")) {
					accoPeace = fileName;
				}else if (title.equals("Copy of Registration of Business Name (where applicable i.e. if an accommodation is given a name: a Business name should be registered)")) {
					accoCopy = fileName;
				}else if (title.equals("Copy of Tax Registration Number (TRN)")) {
					accoTax = fileName;
				}else if (title.equals("Proof of ownership: tax receipt/title (if property is occupied by Tenant then tenant should submit: written and certified permission from owner)")) {
					accoProof = fileName;
				}else if (title.equals("Copy of Public Liability Insurance")) {
					accoPublic = fileName;
				}else if (title.equals("Copy of Jamaica Fire Certificate")) {
					accoJamaica = fileName;
				}else if (title.equals("Copy of Public Health Tourism Establishment Certificate")) {
					accoHealth = fileName;
				}else if (title.equals("Copy of Valid Food Handlers Permit(s)")) {
					accoFood = fileName;
				}else if (title.equals("Security approval  letter - Resort Areas Division of the Jamaica Constabulary Force")) {
					accoLetter = fileName;
				}else if (title.equals("Character reference from Justice of the Peace/Minister of Religion/Superintendent of Police")) {
					accoCharacter = fileName;
				}else if (title.equals("Work Permit(s) (where applicable)")) {
					accoWork = fileName;
				
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
				"[$ResortPease$]", "[$ResortCopy$]", "[$ResortTax$]", "[$ResortProof$]", "[$ResortPublic$]",
				 "[$ResortJamaica$]", "[$ResortHealth$]", "[$ResortFood$]", "[$ResortLetter$]", "[$ResortCharacter$]", "[$ResortWork$]",
				},
				new String[] {
						accoPeace ,accoCopy ,accoTax ,accoProof ,accoPublic ,accoJamaica ,accoHealth ,
						accoFood ,accoLetter ,accoCharacter ,accoWork ,
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
