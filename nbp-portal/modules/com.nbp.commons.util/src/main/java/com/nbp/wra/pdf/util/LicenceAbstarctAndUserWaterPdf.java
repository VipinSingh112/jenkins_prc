package com.nbp.wra.pdf.util;

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
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.wra.application.form.service.model.LicenceToAbstractInfo;
import com.nbp.wra.application.form.service.model.WRAAppPayment;
import com.nbp.wra.application.form.service.model.WRAApplication;
import com.nbp.wra.application.form.service.model.WRAReqIrrigation;
import com.nbp.wra.application.form.service.service.LicenceToAbstractInfoLocalServiceUtil;
import com.nbp.wra.application.form.service.service.WRAAppPaymentLocalServiceUtil;
import com.nbp.wra.application.form.service.service.WRAApplicationLocalServiceUtil;
import com.nbp.wra.application.form.service.service.WRAReqIrrigationLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class LicenceAbstarctAndUserWaterPdf {
	public static String replaceSignatureForWra(long wraApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Abstract Signature Applicant");
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

	
public static String getLicenceAbstractAndUserWaterPdf(long wraApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		WRAApplication wraApplication=null;
		LicenceToAbstractInfo wraAbstractInfo=null;
		WRAAppPayment wraPayment=null;
		List<WRAReqIrrigation> wraReqIrr=null;
		
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		//Signatures
		String signatureForWraApp = null;
		
		try {
			wraApplication= WRAApplicationLocalServiceUtil.getWRAApplication(wraApplicationId);
		}catch (Exception e) {
		}
		try{
			wraAbstractInfo= LicenceToAbstractInfoLocalServiceUtil.getLicenceToAbstract_By_Id(wraApplicationId);
		}catch(Exception e){}
		try {
			  wraReqIrr= WRAReqIrrigationLocalServiceUtil.getWRA_By_CtrAppId(wraApplicationId, OrderByComparatorFactoryUtil.create("WraReqIrrigation", "counter", true));
		  } catch (Exception e) {}
		try {
			wraPayment= WRAAppPaymentLocalServiceUtil.getgetWRA_By_Id(wraApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "WRA Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(), String.valueOf(wraApplication.getWraApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//signatures
		try {
			signatureForWraApp =replaceSignatureForWra(wraAbstractInfo.getWraApplicationId(), "Abstract Signature Applicant",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"new-licence-1");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"new-licence");
					}catch (Exception e) {
						e.printStackTrace();
					}
				}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, 
			new String[] {
			//Applicant details
				"[$AppNo$]", "[$Applicantname$]", "[$Pari$]", "[$Mailappli$]", "[$EmailAdd$]", "[$Officeone$]", "[$Mobiphone$]", "[$Homepho$]",
				"[$Locationpro$]", "[$Namecontra$]", "[$ParishV$]", "[$AddressCon$]", "[$SourceWater$]", "[$PurposeBe$]", 
				"[$Areacrop1$]","[$SsytemIrri1$]",
				"[$Areacrop2$]","[$SsytemIrri2$]",
				"[$Areacrop3$]","[$SsytemIrri3$]",
				"[$Areacrop4$]","[$SsytemIrri4$]",
				"[$Areacrop5$]","[$SsytemIrri5$]",
				"[$Meanexcess$]", "[$Estimatmetres$]", "[$DiameterOr$]", "[$Inlining$]", "[$Geologicalgravel$]", "[$Methodwater$]", 
				"[$Maximumcubic$]", "[$Typerate$]", "[$RelevantTech$]", "[$Supplywater$]", "[$TakeInto$]", "[$SignatureSi$]", "[$ProsDate$]",
				"[$PaymentMeth$]"

			},
			new String[] {
    		//Applicant details
    		Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getApplicationNum())?wraAbstractInfo.getApplicationNum():"",
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getNameOfApplicant())?wraAbstractInfo.getNameOfApplicant():"",
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getParishApplicant())?wraAbstractInfo.getParishApplicant():"",
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getMailingAddOfApplicant())?wraAbstractInfo.getMailingAddOfApplicant():"",
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getEmailOfApplicant())?wraAbstractInfo.getEmailOfApplicant():"",
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getOfficePhone())?wraAbstractInfo.getOfficePhone():"",
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getMobilePhone())?wraAbstractInfo.getMobilePhone():"",
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getHomePhone())?wraAbstractInfo.getHomePhone():"",
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getLocationOfProParishWork())?wraAbstractInfo.getLocationOfProParishWork():"",
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getNameOfContractor())?wraAbstractInfo.getNameOfContractor():"",
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getParishContractor())?wraAbstractInfo.getParishContractor():"",
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getAddressOfContractor())?wraAbstractInfo.getAddressOfContractor():"",
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getSourceOfWater())?wraAbstractInfo.getSourceOfWater():"",
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getPurposeWaterUse())?wraAbstractInfo.getPurposeWaterUse():"",

			(wraReqIrr!=null)&&(wraReqIrr.size()>0)?wraReqIrr.get(0).getAbstractAreaIrrigated():"",
			(wraReqIrr!=null)&&(wraReqIrr.size()>0)?wraReqIrr.get(0).getAbstractSystemIrrigated():"",
					
			(wraReqIrr!=null)&&(wraReqIrr.size()>1)?wraReqIrr.get(1).getAbstractAreaIrrigated():"",
			(wraReqIrr!=null)&&(wraReqIrr.size()>1)?wraReqIrr.get(1).getAbstractSystemIrrigated():"",
			
			(wraReqIrr!=null)&&(wraReqIrr.size()>2)?wraReqIrr.get(2).getAbstractAreaIrrigated():"",
			(wraReqIrr!=null)&&(wraReqIrr.size()>2)?wraReqIrr.get(2).getAbstractSystemIrrigated():"",
			
			(wraReqIrr!=null)&&(wraReqIrr.size()>3)?wraReqIrr.get(3).getAbstractAreaIrrigated():"",
			(wraReqIrr!=null)&&(wraReqIrr.size()>3)?wraReqIrr.get(3).getAbstractSystemIrrigated():"",
			
			(wraReqIrr!=null)&&(wraReqIrr.size()>4)?wraReqIrr.get(4).getAbstractAreaIrrigated():"",
			(wraReqIrr!=null)&&(wraReqIrr.size()>4)?wraReqIrr.get(4).getAbstractSystemIrrigated():"",
			
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getMeansOfDisposal())?wraAbstractInfo.getMeansOfDisposal():"",
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getEstimateDepthOfBorewell())?wraAbstractInfo.getEstimateDepthOfBorewell():"",
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getDiameterOfBorewell())?wraAbstractInfo.getDiameterOfBorewell():"",
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getArtesianSupply())?wraAbstractInfo.getArtesianSupply():"",
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getGeologicalStrait())?wraAbstractInfo.getGeologicalStrait():"",
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getMethodOfAbstractingWater())?wraAbstractInfo.getMethodOfAbstractingWater():"",
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getMaxDailyQuant())?wraAbstractInfo.getMaxDailyQuant():"",
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getTypeOfAppratusProposed())?wraAbstractInfo.getTypeOfAppratusProposed():"",
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getOtherInformation())?wraAbstractInfo.getOtherInformation():"",
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getRequestToSupplyWater())?wraAbstractInfo.getRequestToSupplyWater():"",
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getAuthorityInformation())?wraAbstractInfo.getAuthorityInformation():"",
			signatureForWraApp,
			Validator.isNotNull(wraAbstractInfo)&&Validator.isNotNull(wraAbstractInfo.getDateOfSign())?dateFormat.format(wraAbstractInfo.getDateOfSign()):"",
			Validator.isNotNull(wraPayment)&&Validator.isNotNull(wraPayment.getPaymentMethod())?wraPayment.getPaymentMethod():"",	
			});
				    }catch (Exception e) {
						// TODO: handle exception
					}
			
		if (!checkPdfDownloadWithoutDocument.equals("false")) {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
			String ownership = "";
			String locMap = "";
			String hydrogeo = "";
			String sitePlan = "";
			String copyEnv = "";
			String copyPermit = "";
			String copyMining = "";
			String drillPermit = "";
			String borehole = "";
			String compReport = "";
			String waterQuality = "";
			String pumpSystem = "";
			String recentUtility = "";
			String trn = "";
			String certiGood = "";
			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
				} catch (Exception e) {}
				if(title.equals("Proof of ownership or authorization")) {
					ownership = fileName;
				}else if (title.equals("Site Location Map at a scale of 1:50.000")) {
					locMap = fileName;
				}else if (title.equals("Hydrogeological study (if applicable)")) {
					hydrogeo = fileName;
				}else if (title.equals("Site plan and well design")) {
					sitePlan = fileName;
				}else if (title.equals("Copy of Environmental License Application (if applicable)")) {
					copyEnv = fileName;
				}else if (title.equals("Copy of Permit Application or Permit to construct subdivision/development if applicable.")) {
					copyPermit = fileName;
				}else if (title.equals("Copy of Mining or Quarry Licence if applicable.")) {
					copyMining = fileName;
				}else if (title.equals("Well drilling permit")) {
					drillPermit = fileName;
				}else if (title.equals("Borehole/Corehole Report (if applicable)")) {
					borehole = fileName;
				}else if (title.equals("Well Completion Report including yield test data")) {
					compReport = fileName;
				}else if (title.equals("Water quality testing")) {
					waterQuality = fileName;
				}else if (title.equals("Pumping system design")) {
					pumpSystem = fileName;
				}else if (title.equals("Two recent utility bills (for individual applicants) or Signed Proof of Address Letter from a JP")) {
					recentUtility = fileName;
				}else if (title.equals("Company/Individual TRN")) {
					trn = fileName;
				}else if (title.equals("Certificate of Good Standing (if applicable)")) {
					certiGood = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
				"[$ProofAuthor$]","[$SiteMap$]","[$HydroStudy$]","[$SitePlanS$]","[$Sitedesign$]",
				"[$CopyApp$]","[$Copyquarry$]","[$Wellpermit$]","[$ReportApp$]","[$Welldata$]",
				"[$Watertesting$]","[$Pumpingdesign$]","[$TwoJP$]","[$CompanyTRN$]","[$Certicable$]",
				
				},
				new String[] {
						ownership, locMap, hydrogeo,sitePlan, 
						copyEnv, copyPermit, copyMining,drillPermit, 
						borehole, compReport,waterQuality, 
						pumpSystem, recentUtility, trn,certiGood, 
						
						
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
