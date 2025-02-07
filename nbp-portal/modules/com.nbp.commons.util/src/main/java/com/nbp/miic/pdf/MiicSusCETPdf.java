package com.nbp.miic.pdf;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.journal.model.JournalArticle;
import com.liferay.journal.model.JournalArticleDisplay;
import com.liferay.journal.service.JournalArticleLocalServiceUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.miic.application.form.services.model.MiicApplicantDetails;
import com.nbp.miic.application.form.services.model.MiicApplication;
import com.nbp.miic.application.form.services.model.MiicSuspensionOfCet;
import com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAdd;
import com.nbp.miic.application.form.services.service.MiicApplicantDetailsLocalServiceUtil;
import com.nbp.miic.application.form.services.service.MiicApplicationLocalServiceUtil;
import com.nbp.miic.application.form.services.service.MiicSuspensionOfCetAddLocalServiceUtil;
import com.nbp.miic.application.form.services.service.MiicSuspensionOfCetLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MiicSusCETPdf {
	/*public static String replaceSignatureForNCRA(long ncraApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature");
		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
				signatureFolder.getFolderId());
		String previewUrl = "";
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
		}
		return previewUrl;
	}*/

	
public static String getMiicCetPdf(long miicApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		MiicApplication miicApplication=null;
		MiicApplicantDetails applicantDetail=null;
		List<MiicSuspensionOfCetAdd> susOfCetAdd=null;
		MiicSuspensionOfCet suspensionCheck=null;
		
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		//Signatures
		//String signatureForNcraApp = null;
		
		try {
			applicantDetail= MiicApplicantDetailsLocalServiceUtil.getMiicById(miicApplicationId);
		}catch (Exception e) {
		}
		try {
			miicApplication= MiicApplicationLocalServiceUtil.getMiicApplication(miicApplicationId);
		}catch (Exception e) {
		}
		try {
			susOfCetAdd= MiicSuspensionOfCetAddLocalServiceUtil.getMiicById(miicApplicationId);
		} catch (Exception e) {}
		
		try {
			suspensionCheck= MiicSuspensionOfCetLocalServiceUtil.getMiicById(miicApplicationId);
		} catch (Exception e) {}
		
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Miic Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(), String.valueOf(miicApplication.getMiicApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//signatures
		/*
		 * try { signatureForNcraApp
		 * =replaceSignatureForNCRA(dateWeighInfo.getNcraApplicationId(), "Signature",
		 * themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),
		 * themeDisplay); } catch (Exception e) {}
		 */
		
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"suspension-of-cet-1");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"suspension-of-cet");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, 
			new String[] {
			//Applicant details
			"[$OFApplicant$]","[$RequesterName$]","[$FirstName$]","[$LastName$]","[$CompanyName$]","[$AddressCet$]","[$EmailCet$]",
			"[$TelephoneCet$]","[$DaApplication$]","[$TRNNumber$]",
			
			//Material Required
			/* "[$Name1$]", */"[$TariffHeading1$]",/*"[$AddressC1$]",*/"[$Description1$]","[$AQuantity1$]","[$Estimate1$]","[$Specification1$]","[$CETRate1$]","[$RProposed1$]","[$RateChangeTogeFrom1$]","[$RateChangeTo1$]",
			/* "[$Name2$]", */"[$TariffHeading2$]",/*"[$AddressC2$]",*/"[$Description2$]","[$AQuantity2$]","[$Estimate2$]","[$Specification2$]","[$CETRate2$]","[$RProposed2$]","[$RateChangeTogeFrom2$]","[$RateChangeTo2$]",
			/* "[$Name3$]", */"[$TariffHeading3$]",/*"[$AddressC3$]",*/"[$Description3$]","[$AQuantity3$]","[$Estimate3$]","[$Specification3$]","[$CETRate3$]","[$RProposed3$]","[$RateChangeTogeFrom3$]","[$RateChangeTo3$]",
			/* "[$Name4$]", */"[$TariffHeading4$]",/*"[$AddressC4$]",*/"[$Description4$]","[$AQuantity4$]","[$Estimate4$]","[$Specification4$]","[$CETRate4$]","[$RProposed4$]","[$RateChangeTogeFrom4$]","[$RateChangeTo4$]",
			/* "[$Name5$]", */"[$TariffHeading5$]",/*"[$AddressC5$]",*/"[$Description5$]","[$AQuantity5$]","[$Estimate5$]","[$Specification5$]","[$CETRate5$]","[$RProposed5$]","[$RateChangeTogeFrom5$]","[$RateChangeTo5$]",
			
			
			//check 
			"[$IndicationUrgency$]","[$RequestRate$]","[$EviInability$]","[$EvidenceConsultation$]",
			
			
			},
			new String[] {
    		//Applicant details
    		Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getNatureOfApplicant())?applicantDetail.getNatureOfApplicant():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getApplicantName())?applicantDetail.getApplicantName():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getFirstName())?applicantDetail.getFirstName():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getLastName())?applicantDetail.getLastName():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getCompanyName())?applicantDetail.getCompanyName():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getAddress())?applicantDetail.getAddress():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getEmail())?applicantDetail.getEmail():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getTelephone())?applicantDetail.getTelephone():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getDateOfApplication())?dateFormat.format(applicantDetail.getDateOfApplication()):"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getTrnNumber())?applicantDetail.getTrnNumber():"",
					
			//Verification for Weighing Device
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>0)?susOfCetAdd.get(0).getTariffHeadingNum():"",
			//(susOfCetAdd!=null)&&(susOfCetAdd.size()>0)?susOfCetAdd.get(0).getAddress():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>0)?susOfCetAdd.get(0).getDescription():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>0)?susOfCetAdd.get(0).getAmountQuantity():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>0)?susOfCetAdd.get(0).getAmountEstimateInUs():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>0)?susOfCetAdd.get(0).getTechnologySpecification():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>0)?susOfCetAdd.get(0).getCetRate():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>0)?susOfCetAdd.get(0).getRateProposed():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>0)?dateFormat.format(susOfCetAdd.get(0).getPeriodOfRateChangeFrom()):"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>0)?dateFormat.format(susOfCetAdd.get(0).getPeriodOfRateChangeTo()):"",
					
					
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>1)?susOfCetAdd.get(1).getTariffHeadingNum():"",
//			(susOfCetAdd!=null)&&(susOfCetAdd.size()>1)?susOfCetAdd.get(1).getAddress():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>1)?susOfCetAdd.get(1).getDescription():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>1)?susOfCetAdd.get(1).getAmountQuantity():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>1)?susOfCetAdd.get(1).getAmountEstimateInUs():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>1)?susOfCetAdd.get(1).getTechnologySpecification():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>1)?susOfCetAdd.get(1).getCetRate():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>1)?susOfCetAdd.get(1).getRateProposed():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>1)?dateFormat.format(susOfCetAdd.get(1).getPeriodOfRateChangeFrom()):"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>1)?dateFormat.format(susOfCetAdd.get(1).getPeriodOfRateChangeTo()):"",
			
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>2)?susOfCetAdd.get(2).getTariffHeadingNum():"",
//			(susOfCetAdd!=null)&&(susOfCetAdd.size()>2)?susOfCetAdd.get(2).getAddress():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>2)?susOfCetAdd.get(2).getDescription():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>2)?susOfCetAdd.get(2).getAmountQuantity():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>2)?susOfCetAdd.get(2).getAmountEstimateInUs():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>2)?susOfCetAdd.get(2).getTechnologySpecification():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>2)?susOfCetAdd.get(2).getCetRate():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>2)?susOfCetAdd.get(2).getRateProposed():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>2)?dateFormat.format(susOfCetAdd.get(2).getPeriodOfRateChangeFrom()):"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>2)?dateFormat.format(susOfCetAdd.get(2).getPeriodOfRateChangeTo()):"",
			
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>3)?susOfCetAdd.get(3).getTariffHeadingNum():"",
//			(susOfCetAdd!=null)&&(susOfCetAdd.size()>3)?susOfCetAdd.get(3).getAddress():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>3)?susOfCetAdd.get(3).getDescription():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>3)?susOfCetAdd.get(3).getAmountQuantity():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>3)?susOfCetAdd.get(3).getAmountEstimateInUs():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>3)?susOfCetAdd.get(3).getTechnologySpecification():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>3)?susOfCetAdd.get(3).getCetRate():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>3)?susOfCetAdd.get(3).getRateProposed():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>3)?dateFormat.format(susOfCetAdd.get(3).getPeriodOfRateChangeFrom()):"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>3)?dateFormat.format(susOfCetAdd.get(3).getPeriodOfRateChangeTo()):"",
			
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>4)?susOfCetAdd.get(4).getTariffHeadingNum():"",
//			(susOfCetAdd!=null)&&(susOfCetAdd.size()>4)?susOfCetAdd.get(4).getAddress():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>4)?susOfCetAdd.get(4).getDescription():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>4)?susOfCetAdd.get(4).getAmountQuantity():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>4)?susOfCetAdd.get(4).getAmountEstimateInUs():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>4)?susOfCetAdd.get(4).getTechnologySpecification():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>4)?susOfCetAdd.get(4).getCetRate():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>4)?susOfCetAdd.get(4).getRateProposed():"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>4)?dateFormat.format(susOfCetAdd.get(4).getPeriodOfRateChangeFrom()):"",
			(susOfCetAdd!=null)&&(susOfCetAdd.size()>4)?dateFormat.format(susOfCetAdd.get(4).getPeriodOfRateChangeTo()):"",
			
			Validator.isNotNull(suspensionCheck)&&Validator.isNotNull(suspensionCheck.getIndicationOfUrgency())?suspensionCheck.getIndicationOfUrgency():"",
			Validator.isNotNull(suspensionCheck)&&Validator.isNotNull(suspensionCheck.getRequestForSuspension())?suspensionCheck.getRequestForSuspension():"",
			Validator.isNotNull(suspensionCheck)&&Validator.isNotNull(suspensionCheck.getEvidenceOfInability())?suspensionCheck.getEvidenceOfInability():"",
			Validator.isNotNull(suspensionCheck)&&Validator.isNotNull(suspensionCheck.getEvidenceOfConsultation())?suspensionCheck.getEvidenceOfConsultation():"",
					
					
			});
				    }catch (Exception e) {
						// TODO: handle exception
					}
			
		if (checkPdfDownloadWithoutDocument.equals("true")) {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
			String caricomValue = "";
			String technicalCom = "";
			
			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					
				} catch (Exception e) {}
				fileName = fileEntry.getFileName();
				title=fileEntry.getTitle();
				if(title.equals("Caricom Value Form")) {
					caricomValue = fileName;
				}else if (title.equals("Technical Specifications of Commodity")) {
					technicalCom = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
					"[$Caricom$]","[$Commodity$]",
				},
				new String[] {
						caricomValue,technicalCom,
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
