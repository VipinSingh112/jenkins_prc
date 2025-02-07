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
import com.nbp.quary.application.form.service.model.QuarryApplication;
//import com.nbp.quary.application.form.service.model.QuarryApplicationPayment;
import com.nbp.quary.application.form.service.model.QuarryApplicatntInformation;
import com.nbp.quary.application.form.service.model.QuarryGeneralInformation;
import com.nbp.quary.application.form.service.model.QuarryInformaation;
import com.nbp.quary.application.form.service.model.QuarryMaterialInformation;
import com.nbp.quary.application.form.service.model.QuarryMaterialInformationEquipmentList;
import com.nbp.quary.application.form.service.service.QuarryApplicationLocalServiceUtil;
//import com.nbp.quary.application.form.service.service.QuarryApplicationPaymentLocalServiceUtil;
import com.nbp.quary.application.form.service.service.QuarryApplicatntInformationLocalServiceUtil;
import com.nbp.quary.application.form.service.service.QuarryGeneralInformationLocalServiceUtil;
import com.nbp.quary.application.form.service.service.QuarryInformaationLocalServiceUtil;
import com.nbp.quary.application.form.service.service.QuarryMaterialInformationEquipmentListLocalServiceUtil;
import com.nbp.quary.application.form.service.service.QuarryMaterialInformationLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class QuarryApplicationPdf {

	public static String replaceSignatureOfApplicant(long quarryApplicationId, String folderName, long groupId,
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


public static String getQuarryAppPdf(long quarryApplicationId, ThemeDisplay themeDisplay, String checkPdfDownloadWithoutDocument) {
String pdfTemplate = StringPool.BLANK;
DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
QuarryApplication quarryApplication=null;
QuarryApplicatntInformation applicantInfo=null;
QuarryInformaation quarryInfo=null;
QuarryMaterialInformation materialInfo=null;
List<QuarryMaterialInformationEquipmentList> materialEquipmentList=null;
QuarryGeneralInformation generalInformation=null;
//QuarryApplicationPayment quarryPayment=null;

//folder
List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
DLFolder supportingDocumentsFolder = null;
DLFolder supportingDocumentsParentFolder = null;
FileEntry fileEntry = null;
//Signatures
String signatureApplicant = null;

try {
	quarryApplication = QuarryApplicationLocalServiceUtil.getQuarryApplication(quarryApplicationId);
}catch (Exception e) {
}
try{
	applicantInfo= QuarryApplicatntInformationLocalServiceUtil.getQuarryApplicantBy_Id(quarryApplicationId);
}catch(Exception e){}
try{
	quarryInfo= QuarryInformaationLocalServiceUtil.getQuarryInformaationBy_Id(quarryApplicationId);
}catch(Exception e){}
try{
	materialInfo= QuarryMaterialInformationLocalServiceUtil.getQuarryMaterialInformationBy_Id(quarryApplicationId);
}catch(Exception e){}
try{
	materialEquipmentList= QuarryMaterialInformationEquipmentListLocalServiceUtil.getQuarryMaterialList_By_Id(quarryApplicationId);
}catch(Exception e){}
try {
	generalInformation = QuarryGeneralInformationLocalServiceUtil.getQuarryGeneralInformationBy_Id(quarryApplicationId);
} catch (Exception e) {}
/*try {
	quarryPayment = QuarryApplicationPaymentLocalServiceUtil.getPaymentBy_Id(quarryApplicationId);
} catch (Exception e) {}*/

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
//signatures
 try { 
	  signatureApplicant=replaceSignatureOfApplicant
			  (quarryApplication.getQuarryApplicationId(), "General Info Signature", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
	  } catch (Exception e) {}
 
  

//pdf go in launch case
		if (checkPdfDownloadWithoutDocument.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
					"quarry");
		} else {
			try {
			pdfTemplate = getTemplateFromJournalArticlePDF
					(themeDisplay.getScopeGroupId(),
					"quarry-1");
			}catch (Exception e) {
				
			}
		}
try {
	pdfTemplate = StringUtil.replace(pdfTemplate, 
	new String[] {
	//Hotel Licence
		"[$ApplicantName$]", "[$ApplicantAddress$]", "[$ApplicantTelephone$]", "[$ApplicantEmail$]", "[$TrnNo$]",
		"[$LocationA$]", "[$DistrictA$]", "[$ParishB$]", "[$Mvalue$]", "[$Aquarry$]",
		"[$Hasbeensubmitted$]", "[$Mapenclosed$]", "[$Lname$]", "[$AddressL$]", "[$Applicantland$]",
		"[$Ownershipenclosed$]", "[$Propertyowner$]",
		
		"[$MaterialQuarried$]", "[$ReserveEst$]", "[$DailyProdEst$]", "[$Cruscher$]", "[$LocatedP$]", "[$Screen$]","[$ScreenSite$]", 
		"[$BulldozerLoc$]", "[$LocatedBull$]","[$Frontloader$]", "[$LoaderPro$]","[$PowerShovel$]", "[$ProposedSite$]","[$BackHoe$]", "[$ProBack$]",
		"[$AirTrack$]", "[$AirDrill$]","[$AirCompressor$]", "[$ProposedCompressor$]","[$HandShovel$]", "[$HandShovelSite$]","[$OtherAir$]", "[$OtherPropSite$]",
		"[$OtherEquipment$]",
		
		
		"[$Proposedemp$]", "[$Isincluded$]", "[$Hasapplicant$]", "[$Gdetails$]", "[$Refusedapplicant$]",
		"[$SignatureSi$]", "[$WeighingDate$]",
	
	},
	new String[] {
	//Applicant details
				Validator.isNotNull(applicantInfo)&&Validator.isNotNull(applicantInfo.getNameOfApplicant())?applicantInfo.getNameOfApplicant():"" ,
				Validator.isNotNull(applicantInfo)&&Validator.isNotNull(applicantInfo.getAddressOfApplicant())?applicantInfo.getAddressOfApplicant():"",
				Validator.isNotNull(applicantInfo)&&Validator.isNotNull(applicantInfo.getTelephoneOfApplicant())?applicantInfo.getTelephoneOfApplicant():"",
				Validator.isNotNull(applicantInfo)&&Validator.isNotNull(applicantInfo.getEmailOfApplicant())?applicantInfo.getEmailOfApplicant():"",
				Validator.isNotNull(applicantInfo)&&Validator.isNotNull(applicantInfo.getTrnAndTcc())?applicantInfo.getTrnAndTcc():"",
						
				Validator.isNotNull(quarryInfo)&&Validator.isNotNull(quarryInfo.getLocation())?quarryInfo.getLocation():"",
				Validator.isNotNull(quarryInfo)&&Validator.isNotNull(quarryInfo.getDistrict())?quarryInfo.getDistrict():"" ,
				Validator.isNotNull(quarryInfo)&&Validator.isNotNull(quarryInfo.getParish())?quarryInfo.getParish():"",
				Validator.isNotNull(quarryInfo)&&Validator.isNotNull(quarryInfo.getMeasurement())?quarryInfo.getMeasurement():"",
				Validator.isNotNull(quarryInfo)&&Validator.isNotNull(quarryInfo.getActualSizeOfQuary())?quarryInfo.getActualSizeOfQuary():"",
				Validator.isNotNull(quarryInfo)&&Validator.isNotNull(quarryInfo.getHasQuarrySubmitted())?quarryInfo.getHasQuarrySubmitted():"",
				Validator.isNotNull(quarryInfo)&&Validator.isNotNull(quarryInfo.getSixCopiesOfLocation())?quarryInfo.getSixCopiesOfLocation():"",
				Validator.isNotNull(quarryInfo)&&Validator.isNotNull(quarryInfo.getLandOwnerName())?quarryInfo.getLandOwnerName():"",
				Validator.isNotNull(quarryInfo)&&Validator.isNotNull(quarryInfo.getLandOwnerAddress())?quarryInfo.getLandOwnerAddress():"",
				Validator.isNotNull(quarryInfo)&&Validator.isNotNull(quarryInfo.getLegalAccessToLand())?quarryInfo.getLegalAccessToLand():"",
				Validator.isNotNull(quarryInfo)&&Validator.isNotNull(quarryInfo.getOwnerShipEnclosed())?quarryInfo.getOwnerShipEnclosed():"",
				Validator.isNotNull(quarryInfo)&&Validator.isNotNull(quarryInfo.getAdjacentPropOwner())?quarryInfo.getAdjacentPropOwner():"",
						
				Validator.isNotNull(materialInfo)&&Validator.isNotNull(materialInfo.getTypeOfMaterial())?materialInfo.getTypeOfMaterial():"",
				Validator.isNotNull(materialInfo)&&Validator.isNotNull(materialInfo.getReserveEstimate())?materialInfo.getReserveEstimate():"",
				Validator.isNotNull(materialInfo)&&Validator.isNotNull(materialInfo.getEstimateDailyProd())?materialInfo.getEstimateDailyProd():"",
						
						(materialEquipmentList!=null)&&(materialEquipmentList.size()>4)?materialEquipmentList.get(4).getIsManchineNameChecked():"",	
								(materialEquipmentList!=null)&&(materialEquipmentList.size()>4)?materialEquipmentList.get(4).getLocatedOnPermises():"",	
										
								(materialEquipmentList!=null)&&(materialEquipmentList.size()>9)?materialEquipmentList.get(9).getIsManchineNameChecked():"",	
								(materialEquipmentList!=null)&&(materialEquipmentList.size()>9)?materialEquipmentList.get(9).getLocatedOnPermises():"",	
										
								(materialEquipmentList!=null)&&(materialEquipmentList.size()>3)?materialEquipmentList.get(3).getIsManchineNameChecked():"",	
								(materialEquipmentList!=null)&&(materialEquipmentList.size()>3)?materialEquipmentList.get(3).getLocatedOnPermises():"",	
										
								(materialEquipmentList!=null)&&(materialEquipmentList.size()>5)?materialEquipmentList.get(5).getIsManchineNameChecked():"",	
								(materialEquipmentList!=null)&&(materialEquipmentList.size()>5)?materialEquipmentList.get(5).getLocatedOnPermises():"",	

								(materialEquipmentList!=null)&&(materialEquipmentList.size()>8)?materialEquipmentList.get(8).getIsManchineNameChecked():"",	
								(materialEquipmentList!=null)&&(materialEquipmentList.size()>8)?materialEquipmentList.get(8).getLocatedOnPermises():"",	
								
								(materialEquipmentList!=null)&&(materialEquipmentList.size()>2)?materialEquipmentList.get(2).getIsManchineNameChecked():"",	
								(materialEquipmentList!=null)&&(materialEquipmentList.size()>2)?materialEquipmentList.get(2).getLocatedOnPermises():"",	
								
								(materialEquipmentList!=null)&&(materialEquipmentList.size()>1)?materialEquipmentList.get(1).getIsManchineNameChecked():"",	
								(materialEquipmentList!=null)&&(materialEquipmentList.size()>1)?materialEquipmentList.get(1).getLocatedOnPermises():"",	
								
								(materialEquipmentList!=null)&&(materialEquipmentList.size()>4)?materialEquipmentList.get(0).getIsManchineNameChecked():"",	
								(materialEquipmentList!=null)&&(materialEquipmentList.size()>4)?materialEquipmentList.get(0).getLocatedOnPermises():"",	
								
								(materialEquipmentList!=null)&&(materialEquipmentList.size()>6)?materialEquipmentList.get(6).getIsManchineNameChecked():"",	
								(materialEquipmentList!=null)&&(materialEquipmentList.size()>6)?materialEquipmentList.get(6).getLocatedOnPermises():"",	
										
								(materialEquipmentList!=null)&&(materialEquipmentList.size()>7)?materialEquipmentList.get(7).getIsManchineNameChecked():"",	
								(materialEquipmentList!=null)&&(materialEquipmentList.size()>7)?materialEquipmentList.get(7).getLocatedOnPermises():"",	
																																		
								(materialEquipmentList!=null)&&(materialEquipmentList.size()>7)?materialEquipmentList.get(7).getOtherValue():"",		
					
						
				generalInformation!=null&&generalInformation.getProposedNumberOfEmploy()!=null?generalInformation.getProposedNumberOfEmploy():"",		
				generalInformation!=null&&generalInformation.getNonRefundableFee()!=null?generalInformation.getNonRefundableFee():"",		
				generalInformation!=null&&generalInformation.getConvictedUnderQuarryLaw()!=null?generalInformation.getConvictedUnderQuarryLaw():"",		
				generalInformation!=null&&generalInformation.getGiveDetails()!=null?generalInformation.getGiveDetails():"",		
				generalInformation!=null&&generalInformation.getLicenseRefused()!=null?generalInformation.getLicenseRefused():"",	
				signatureApplicant,
				Validator.isNotNull(generalInformation.getDateOfSignature())?dateFormat.format(generalInformation.getDateOfSignature()): "",
																																											
		});
		    }catch (Exception e) {
				// TODO: handle exception
			}
	
  if (!checkPdfDownloadWithoutDocument.equals("false")) {
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
				"[$ProofAgree$]", "[$LocationM$]", "[$Surveyarea$]", "[$ResourceRep$]", "[$TestCerti$]",
				 "[$Restbond$]", "[$Taxcomp$]", "[$Resultcert$]", "[$Resourceeva$]", "[$Quarryre$]", "[$Outstandpay$]", "[$Planquarry$]",
//				 "[$PaymentMethod$]",
				},
				new String[] {
						landOwner ,locMap ,surveyArea ,resourceReport ,testResult ,restorationBond ,taxComp ,testCertificate,
						resourceEval ,prodReturn ,outstandingTax ,quarryPlan ,
//						Validator.isNotNull(quarryPayment)&&Validator.isNotNull(quarryPayment.getPaymentMethod())?quarryPayment.getPaymentMethod():"",
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
