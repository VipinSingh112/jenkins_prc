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
import com.nbp.jtb.application.form.service.model.AttractionWaterEmployee;
import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.model.JTBPaymentMethod;
import com.nbp.jtb.application.form.service.service.AttractionWaterEmployeeLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBPaymentMethodLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class JtbOtherWaterSportsEmployeesPdf {
	public static String replaceSignatureForWaterEmp(long jtbApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Water Sport Signature of Employee");
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

//public static String replaceSignatureForSuperintendent(long jtbApplicationId, String folderName, long groupId,
//			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
//		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
//				"Superintendent of Police");
//		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
//				signatureFolder.getFolderId());
//		String previewUrl = "";
//		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
//			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
//			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
//					StringPool.BLANK, false, true);
//		}
//		return previewUrl;
//	}


public static String getJtbWaterSportEmployeePdf(long jtbApplicationId, ThemeDisplay themeDisplay,
	String checkPdfDownloadWithoutDocument) {
String pdfTemplate = StringPool.BLANK;
DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
JTBApplication jtbApplication=null;
AttractionWaterEmployee waterEmpLic =null;
JTBPaymentMethod jtbPayment=null;
try{
	jtbPayment= JTBPaymentMethodLocalServiceUtil.getJTBById(jtbApplicationId);
}catch(Exception e){}


//folder
List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
DLFolder supportingDocumentsFolder = null;
DLFolder supportingDocumentsParentFolder = null;
FileEntry fileEntry = null;
//Signatures
String signatureOfWaterEmp = null;
//String signatureOfSuperintendent = null;

try {
	jtbApplication = JTBApplicationLocalServiceUtil.getJTBApplication(jtbApplicationId);
}catch (Exception e) {
}
try{
	waterEmpLic= AttractionWaterEmployeeLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
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
	  signatureOfWaterEmp=replaceSignatureForWaterEmp(waterEmpLic.getJtbApplicationId(), "Water Sport Signature of Employee", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
  } catch (Exception e) {}
//  try { 
//	  signatureOfSuperintendent=replaceSignatureForSuperintendent
//			  (waterEmpLic.getJtbApplicationId(), "Superintendent of Police", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
//  } catch (Exception e) {}
  

//pdf go in launch case
		if (checkPdfDownloadWithoutDocument.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
					"other-watersportemployee");
		} else {
			try {
			pdfTemplate = getTemplateFromJournalArticlePDF
					(themeDisplay.getScopeGroupId(),
					"water-sports-employees");
			}catch (Exception e) {
				
			}
		}
try {
	pdfTemplate = StringUtil.replace(pdfTemplate, 
	new String[] {
		"[$EmpApplicantName$]", "[$EmpApplicantAddress$]", "[$EmpAge$]", "[$EmpNationality$]", "[$EmpPermit$]", "[$EmpOfApplicant$]", "[$EmpQualification$]",
		"[$EmpPlace$]","[$EmpManagerName$]", "[$EmpCpr$]", "[$FirstAid$]", "[$EmpMedicAid$]", "[$EmpLifeGuard$]", "[$EmpRescueDiver$]",
		"[$EmpOther$]", "[$EmpSign$]", "[$EmpDate$]", "[$EmpTimePeriod$]", 
		
					/* "[$EmpSignJustice$]", */
				
				
	},
	new String[] {
	//Applicant details
			Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getApplicantName())?waterEmpLic.getApplicantName():"",
			Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getApplicantAddress())?waterEmpLic.getApplicantAddress():"",
			Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getApplicantAge())?waterEmpLic.getApplicantAge():"",
			Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getApplicantNationality())?waterEmpLic.getApplicantNationality():"",
			Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getWorkPermitApplied())?waterEmpLic.getWorkPermitApplied():"",
			Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getWorkPermitDate())?dateFormat.format(waterEmpLic.getWorkPermitDate()):"",
			Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getQualification())?waterEmpLic.getQualification():"",
			Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getPlaceOfEmployment())?waterEmpLic.getPlaceOfEmployment():"",
			Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getOwnerName())?waterEmpLic.getOwnerName():"",
			Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getCpr())?waterEmpLic.getCpr():"",
			Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getFirstAid())?waterEmpLic.getFirstAid():"",
			Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getMedicFirstAid())?waterEmpLic.getMedicFirstAid():"",
			Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getLifeguard())?waterEmpLic.getLifeguard():"",
			Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getRescueDiver())?waterEmpLic.getRescueDiver():"",
			Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getOtherRescue())?waterEmpLic.getOtherRescue():"",
			signatureOfWaterEmp,
			Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getEmployeeSignatureDate())?dateFormat.format(waterEmpLic.getEmployeeSignatureDate()):"",
			Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getTimePeriod())?waterEmpLic.getTimePeriod():"" ,
//			signatureOfSuperintendent,
						
																																											
		});
		    }catch (Exception e) {
				// TODO: handle exception
			}
	
 	if (!checkPdfDownloadWithoutDocument.equals("false")) {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
			String otherLifesaving = "";
			String onePhoto = "";
			
			String TrnNo=null;
			String approvalAuth=null;
			String foodPermit=null;
			String lifeGuardCerti=null;
			String jamaicaList=null;
			String coxwainCerti=null;
			String coastalMaster=null;
			String maritimeCerti=null;
			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
				} catch (Exception e) {}
				if(title.equals("Copy of First-Aid Lifesaving CPR and/or any other certificates which you may possess")) {
					otherLifesaving = fileName;
				}else if (title.equals("One recent photograph")) {
				    onePhoto = fileName;
				}else if (title.equals("Tax Registration Number (TRN)")) {
					TrnNo = fileName;
				}else if (title.equals("Approval From Local Planning Authority")) {
					approvalAuth = fileName;
				}else if (title.equals("Food Handlers Permit")) {
					foodPermit = fileName;
				}else if (title.equals("Life Guard Certification (where applicable )")) {
					lifeGuardCerti = fileName;
				}else if (title.equals("Team Jamaica Certification (list)")) {
					jamaicaList = fileName;
				}else if (title.equals("Coxwain Licence (where applicable)")) {
					coxwainCerti = fileName;
				}else if (title.equals("Coastal Master Licence (where applicable)")) {
					coastalMaster = fileName;
				}else if (title.equals("Maritime Safety Certificate")) {
					maritimeCerti = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
				"[$FirstAidCpr$]",
				"[$OnePhoto$]",
				"[$NoTrn$]","[$AuthApproval$]","[$PermitFood$]","[$CertiGuard$]","[$ListJamaica$]","[$CertiCoxwain$]","[$MasterCoastal$]","[$CertiMaritime$]",
				"[$PaymentMethWater$]",
				},
				new String[] {
						otherLifesaving,onePhoto,TrnNo,approvalAuth,foodPermit,lifeGuardCerti,jamaicaList,coxwainCerti,coastalMaster,maritimeCerti,
						Validator.isNotNull(jtbPayment)&&Validator.isNotNull(jtbPayment.getPaymentMethod())?jtbPayment.getPaymentMethod():"",
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
