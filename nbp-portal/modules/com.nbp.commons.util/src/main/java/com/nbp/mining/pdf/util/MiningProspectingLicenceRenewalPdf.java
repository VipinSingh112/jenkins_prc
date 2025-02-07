package com.nbp.mining.pdf.util;

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
import com.nbp.mining.lease.application.service.model.MiningAppPayment;
import com.nbp.mining.lease.application.service.model.MiningFormFiveDelineation;
import com.nbp.mining.lease.application.service.model.MiningLeaseApplication;
import com.nbp.mining.lease.application.service.model.MiningRenewalLicence;
import com.nbp.mining.lease.application.service.service.MiningAppPaymentLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningFormFiveDelineationLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningLeaseApplicationLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningRenewalLicenceLocalServiceUtil;

import java.util.ArrayList;
import java.util.List;

public class MiningProspectingLicenceRenewalPdf {
	public static String replaceSignatureForMining(long miningApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Renew Signature of Applicant");
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

	
public static String miningProspectingLicenceRenewalPdf(long miningApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		/* DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy"); */
		MiningLeaseApplication miningApplication=null;
		MiningFormFiveDelineation miningFormFiveDelineation=null;
		MiningAppPayment paymentMethod=null;
		MiningRenewalLicence miningRenewalLicence =null;
		
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		
		  //Signatures 
		String signatureForProspectingLicenceRenewalApp = null;
		 
		
		
		try {
			miningApplication= MiningLeaseApplicationLocalServiceUtil.getMiningLeaseApplication(miningApplicationId);
		}catch (Exception e) {
		}
		try {
			paymentMethod= MiningAppPaymentLocalServiceUtil.getMiningById(miningApplicationId);
		}catch (Exception e) {
		}
		try {
			miningRenewalLicence=MiningRenewalLicenceLocalServiceUtil.getMiningById(miningApplicationId);
		}catch (Exception e) {
		}
		try {
			miningFormFiveDelineation=MiningFormFiveDelineationLocalServiceUtil.getMiningById(miningApplicationId);
		}catch (Exception e) {
		}
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Mining Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(), String.valueOf(miningApplication.getMiningLeaseApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//signatures
		
		  try { 
			  signatureForProspectingLicenceRenewalApp =replaceSignatureForMining(miningApplication.getMiningLeaseApplicationId(), "Renew Signature of Applicant", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}
		 
		
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"prospecting-licence-renewal-1");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"prospecting-licence-renewal");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = 
					StringUtil.replace(pdfTemplate, 
			new String[] {
			//Applicant details 4
			"[$ReName$]","[$ReTccNum$]","[$ReLicenceNo$]","[$ReState$]",

			
			
			//Delineation 18
			"[$RenewSquareKilo$]",
			
			"[$RenewLocationFirst$]","[$RenewCoordinates$]","[$RenewNorthFirst$]","[$RenewEastFirst$]",
			 
			"[$RenewCornerFirst$]","[$RenewNorthSec$]","[$RenewEastSec$]","[$RenewLocationSec$]",
			
			"[$RenewCornerThird$]","[$RenewNorthThird$]","[$RenewEastThird$]","[$RenewGridThird$]",
			
			"[$RenewCornerFour$]","[$RenewNorthFour$]","[$RenewEastFour$]","[$RenewGridFour$]","[$RenewDegreesFour$]","[$RenewLocationFour$]",
			
			
			//signature 2
			"[$LicenceProRenewSign$]",
			"[$PaymentMethodRenewal$]",
			
			},
			new String[] {
    		//Applicant details 4
    		Validator.isNotNull(miningRenewalLicence)&&Validator.isNotNull(miningRenewalLicence.getRenewApplicantName())?miningRenewalLicence.getRenewApplicantName():"",
			Validator.isNotNull(miningRenewalLicence)&&Validator.isNotNull(miningRenewalLicence.getRenewTrnNum())?miningRenewalLicence.getRenewTrnNum():"",
			Validator.isNotNull(miningRenewalLicence)&&Validator.isNotNull(miningRenewalLicence.getRenewApplicantLicNum())?miningRenewalLicence.getRenewApplicantLicNum():"",
			Validator.isNotNull(miningRenewalLicence)&&Validator.isNotNull(miningRenewalLicence.getStateWhetherRenewIs())?miningRenewalLicence.getStateWhetherRenewIs():"",

	  	
     	   // delineation 19
					
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getApproximatelyArea())?miningFormFiveDelineation.getApproximatelyArea():"",
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getLocation())?miningFormFiveDelineation.getLocation():"",
/*5*/	    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getCoordinates())?miningFormFiveDelineation.getCoordinates():"",
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getNorthSide())?miningFormFiveDelineation.getNorthSide():"",
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getEastSide())?miningFormFiveDelineation.getEastSide():"",
		    		
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getFirstNorthSide())?miningFormFiveDelineation.getFirstNorthSide():"",
/*4*/		Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getFirstEastSide())?miningFormFiveDelineation.getFirstEastSide():"",
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getFirstLocationGrid())?miningFormFiveDelineation.getFirstLocationGrid():"",
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getFirstDegrees())?miningFormFiveDelineation.getFirstDegrees():"",
		   		
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getSecondNorthSide())?miningFormFiveDelineation.getSecondNorthSide():"",
/*4*/       Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getSecondEastSide())?miningFormFiveDelineation.getSecondEastSide():"",
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getSecondLocationGrid())?miningFormFiveDelineation.getSecondLocationGrid():"",
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getSecondDegrees())?miningFormFiveDelineation.getSecondDegrees():"",
		    

		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getThirdCoordinates())?miningFormFiveDelineation.getSecondNorthSide():"",
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getThirdNorthSide())?miningFormFiveDelineation.getThirdNorthSide():"",
/*6*/		Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getThirdEastSide())?miningFormFiveDelineation.getThirdEastSide():"",
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getThirdDegrees())?miningFormFiveDelineation.getThirdEastSide():"",
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getThirdGridLoc())?miningFormFiveDelineation.getThirdGridLoc():"",
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getThirdGridL())?miningFormFiveDelineation.getThirdGridL():"",				   
		    
		    
		    		
		 
		    		    				   		
			//signature Detail 2
		    signatureForProspectingLicenceRenewalApp,	
		    Validator.isNotNull(paymentMethod)&&Validator.isNotNull(paymentMethod.getPaymentMethod())?paymentMethod.getPaymentMethod():"",			
					
			});
				    }catch (Exception e) {
						// TODO: handle exception
					}
			
		
	
		
		  if (!checkPdfDownloadWithoutDocument.equals("false")) { String title = "";
		  String fileName = ""; if (Validator.isNotNull(supportingDocumentsFolder)) {
		  String SketchPlan = "";
		  
		  
		  
		  for (DLFileEntry dlFileEntry : supportinfDocFileEntries) { try { fileEntry=
		  DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
		  supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle()); fileName =
		  fileEntry.getFileName(); title=fileEntry.getTitle(); } catch (Exception e) {}
		  if(title.
		  equals("If renewal is sought for only a part delineation an approximate area must be given and a sketch plan or the area applied for must be attached."
		  )) { SketchPlan = fileName; } }
		  
		  pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
		  "[$RenewalAreaPart$]", }, new String[] { SketchPlan, }); } }
		 
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






