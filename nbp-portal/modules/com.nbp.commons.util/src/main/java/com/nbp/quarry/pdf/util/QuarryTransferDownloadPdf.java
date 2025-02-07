package com.nbp.quarry.pdf.util;

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
import com.nbp.quary.application.form.service.model.DirectorDetailsAdd;
import com.nbp.quary.application.form.service.model.QuarryApplication;
import com.nbp.quary.application.form.service.model.QuarryTransferApplicantInfo;
import com.nbp.quary.application.form.service.service.DirectorDetailsAddLocalServiceUtil;
import com.nbp.quary.application.form.service.service.QuarryApplicationLocalServiceUtil;
import com.nbp.quary.application.form.service.service.QuarryTransferApplicantInfoLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class QuarryTransferDownloadPdf {

	public static String replaceSignatureOfApplicant(long quarryApplicationId, String folderName, long groupId,
	long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
	DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
			"Transfer Applicant Signature");
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
	
	public static String replaceSignatureOfTransfer(long quarryApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
			DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
					"Transfer Statement Signature");
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
	
	public static String replaceSignatureOfMinister(long quarryApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
			DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
					"General Info Signature");
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


public static String getQuarryTransferPdf(long quarryApplicationId, ThemeDisplay themeDisplay, String checkPdfDownloadWithoutDocument) {
String pdfTemplate = StringPool.BLANK;
DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
QuarryApplication quarryApplication=null;
QuarryTransferApplicantInfo  transferApplicantInfo=null;
List<DirectorDetailsAdd> directorDetailsAdd=null;


//folder
List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
DLFolder supportingDocumentsFolder = null;
DLFolder supportingDocumentsParentFolder = null;
FileEntry fileEntry = null;
//Signatures
String signatureApplicant = null;
String signatureTransfer = null;
String signatureMinister = null;

try {
	quarryApplication = QuarryApplicationLocalServiceUtil.getQuarryApplication(quarryApplicationId);
}catch (Exception e) {
}
try{
	transferApplicantInfo= QuarryTransferApplicantInfoLocalServiceUtil.getQuarryTransferApplicantInfoBy_Id(quarryApplicationId);
}catch(Exception e){}

try{
	directorDetailsAdd= DirectorDetailsAddLocalServiceUtil.getQuarry_ById(quarryApplicationId);
}catch(Exception e){}


try {
	supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Quarry Supported Documents");
	supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingDocumentsParentFolder.getFolderId(), String.valueOf(quarryApplication.getQuarryApplicationId()));
	supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
			supportingDocumentsFolder.getFolderId());
} catch (Exception e) {
	e.printStackTrace();
}
//signatures first
 		try { 
 			signatureApplicant=replaceSignatureOfApplicant(quarryApplication.getQuarryApplicationId(), "Transfer Applicant Signature", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
 		} catch (Exception e) {}
 //signature second 
 		try { 
 			signatureTransfer=replaceSignatureOfTransfer(quarryApplication.getQuarryApplicationId(), "Transfer Statement Signature", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
 		} catch (Exception e) {}
 //third signature
 		try { 
 			signatureMinister=replaceSignatureOfMinister(quarryApplication.getQuarryApplicationId(), "General Info Signature", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
 		} catch (Exception e) {}
 
  

//pdf go in launch case
		if (checkPdfDownloadWithoutDocument.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
					"quary-transfer-licence-1");
		} else {
			try {
			pdfTemplate = getTemplateFromJournalArticlePDF
					(themeDisplay.getScopeGroupId(),
					"quary-transfer-licence");
			}catch (Exception e) {
				
			}
		}
try {
	pdfTemplate = StringUtil.replace(pdfTemplate, 
	new String[] {
	//Transfer Form No. 9 (Regulation 19, 29) 4
		"[$NameofPerson$]", "[$LicenceNum$]", "[$TranferLease$]", "[$ReasonsApplication$]", 
		
		
	//The following are the particulars of the person to whom I am applying for permission to transfer	6
		
		"[$NameApplicant$]", "[$Telepho$]", "[$Email$]", "[$TrnNo$]", "[$NationalityApplicant$]","[$AddressServed$]",
		
		//Name and nationality of directors of the company, body of persons or partnership (if any) 10
		"[$Name1$]","[$Nationality1$]",
		"[$Name2$]","[$Nationality2$]",
		"[$Name3$]","[$Nationality3$]",
		"[$Name4$]","[$Nationality4$]",
		"[$Name5$]","[$Nationality5$]",
		//signature,s 3
		"[$SignaturE$]","[$SignatuRe$]","[$Signature3$]",
		
		//date 1
		"[$LastDate$]",
		
		
	
	},
	new String[] {
				//Applicant details 10
				Validator.isNotNull(transferApplicantInfo)&&Validator.isNotNull(transferApplicantInfo.getTransferCompanyName())?transferApplicantInfo.getTransferCompanyName():"" ,
				Validator.isNotNull(transferApplicantInfo)&&Validator.isNotNull(transferApplicantInfo.getTransferLicenceNumber())?transferApplicantInfo.getTransferLicenceNumber():"",
				Validator.isNotNull(transferApplicantInfo)&&Validator.isNotNull(transferApplicantInfo.getTransferLicenseLease())?transferApplicantInfo.getTransferLicenseLease():"",
				Validator.isNotNull(transferApplicantInfo)&&Validator.isNotNull(transferApplicantInfo.getTransferLeaseReason())?transferApplicantInfo.getTransferLeaseReason():"",
				Validator.isNotNull(transferApplicantInfo)&&Validator.isNotNull(transferApplicantInfo.getNameOfApplicant())?transferApplicantInfo.getNameOfApplicant():"",
				Validator.isNotNull(transferApplicantInfo)&&Validator.isNotNull(transferApplicantInfo.getTelephone())?transferApplicantInfo.getTelephone():"",
				Validator.isNotNull(transferApplicantInfo)&&Validator.isNotNull(transferApplicantInfo.getEmail())?transferApplicantInfo.getEmail():"" ,
				Validator.isNotNull(transferApplicantInfo)&&Validator.isNotNull(transferApplicantInfo.getTrnAndTcc())?transferApplicantInfo.getTrnAndTcc():"" ,
				Validator.isNotNull(transferApplicantInfo)&&Validator.isNotNull(transferApplicantInfo.getNationalityOfApplicant())?transferApplicantInfo.getNationalityOfApplicant():"",
				Validator.isNotNull(transferApplicantInfo)&&Validator.isNotNull(transferApplicantInfo.getAddressInJamaica())?transferApplicantInfo.getAddressInJamaica():"",
				
				//add more 	10
						
				(directorDetailsAdd!=null)&&(directorDetailsAdd.size()>0)?directorDetailsAdd.get(0).getDirectorName():"",	
				(directorDetailsAdd!=null)&&(directorDetailsAdd.size()>0)?directorDetailsAdd.get(0).getDirectorNationality():"",	
						
				(directorDetailsAdd!=null)&&(directorDetailsAdd.size()>1)?directorDetailsAdd.get(1).getDirectorName():"",	
				(directorDetailsAdd!=null)&&(directorDetailsAdd.size()>1)?directorDetailsAdd.get(1).getDirectorNationality():"",	
						
				(directorDetailsAdd!=null)&&(directorDetailsAdd.size()>2)?directorDetailsAdd.get(2).getDirectorName():"",	
				(directorDetailsAdd!=null)&&(directorDetailsAdd.size()>2)?directorDetailsAdd.get(2).getDirectorNationality():"",	
						
				(directorDetailsAdd!=null)&&(directorDetailsAdd.size()>3)?directorDetailsAdd.get(3).getDirectorName():"",	
				(directorDetailsAdd!=null)&&(directorDetailsAdd.size()>3)?directorDetailsAdd.get(3).getDirectorNationality():"",	

				(directorDetailsAdd!=null)&&(directorDetailsAdd.size()>4)?directorDetailsAdd.get(4).getDirectorName():"",	
				(directorDetailsAdd!=null)&&(directorDetailsAdd.size()>4)?directorDetailsAdd.get(4).getDirectorNationality():"",	
				
				//first signature 1	
				signatureApplicant,
				//second signature 1
				signatureTransfer,
				//third signature 1
				signatureMinister,
				//date 1
				Validator.isNotNull(transferApplicantInfo.getDateOfTransfer())?dateFormat.format(transferApplicantInfo.getDateOfTransfer()): "",
																																											
		});
		    }catch (Exception e) {
				// TODO: handle exception
			}
	
if (!checkPdfDownloadWithoutDocument.equals("false"))  {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
			String landOwner = "";
			String locMap = "";
			String surveyArea = "";
			String resourceReport = "";
			String testResult = "";
			String restorationBond = "";
			String taxComp = "";
			String testCertificate = "";
			String resourceEval = "";
			String prodReturn = "";
			String outstandingTax = "";
			String quarryPlan = "";
			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
				} catch (Exception e) {}
				if(title.equals("Proof of land ownership (Title or Stamped Lease or Sale Agreement)")) {
					landOwner = fileName;
				}else if (title.equals("Location Map (1:12500 scale)")) {
					locMap = fileName;
				}else if (title.equals("Survey Diagram (at least 1:6000 scale) showing exact area to be quarried")) {
					surveyArea = fileName;
				}else if (title.equals("Resource Evaluation Report (Sand and Gravel only)")) {
					resourceReport = fileName;
				}else if (title.equals("Test Results Certificate")) {
					testResult = fileName;
				}else if (title.equals("Restoration Bond")) {
					restorationBond = fileName;
				}else if (title.equals("Tax Compliance Certificate.")) {
					taxComp = fileName;
				}else if (title.equals("Test Results Certificate – (fitness for purpose of material to be quarried)")) {
					testCertificate = fileName;
				}else if (title.equals("Resource Evaluation Report")) {
					resourceEval = fileName;
				}else if (title.equals("Quarry Tax Production Returns")) {
					prodReturn = fileName;
				}else if (title.equals("Outstanding Quarry Tax payments")) {
					outstandingTax = fileName;
				}else if (title.equals("Quarry Plan")) {
					quarryPlan = fileName;
				
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
					"[$ProofLand$]", "[$LocationMap$]", "[$SurveyBe$]", "[$ResourceReport$]", "[$TestResult$]",
					 "[$RestorationB$]", "[$TaxComp$]", "[$TestCerti$]", "[$ResourceRep$]", "[$QuarryTax$]", "[$OutstandingTax$]", "[$QuarryP$]",
				},
				new String[] {
						landOwner ,locMap ,surveyArea ,resourceReport ,testResult ,restorationBond ,taxComp ,testCertificate,
						resourceEval ,prodReturn ,outstandingTax ,quarryPlan ,
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
