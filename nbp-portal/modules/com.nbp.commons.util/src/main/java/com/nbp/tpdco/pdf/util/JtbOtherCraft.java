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
import com.nbp.jtb.application.form.service.model.AttractionBikeRentalInfo;
import com.nbp.jtb.application.form.service.model.AttractionCraftTrader;
import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.model.JTBPaymentMethod;
import com.nbp.jtb.application.form.service.model.JtbAddCraftApplicantInfo;
import com.nbp.jtb.application.form.service.model.JtbAddCraftEmployeeInfo;
import com.nbp.jtb.application.form.service.service.AttractionBikeRentalInfoLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractionCraftTraderLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBPaymentMethodLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JtbAddCraftApplicantInfoLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JtbAddCraftEmployeeInfoLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class JtbOtherCraft {
	public static String replaceSignatureOfVendor(long jtbApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Craft Vendor's Signature");
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
	public static String replaceSignatureForVendorAssistant(long jtbApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Craft Vendor's Assistant Signature");
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
	public static String getJtbCraftPdf(long jtbApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {

		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		JTBApplication jtbApplication = null;
		AttractionCraftTrader craftTrader = null;
		List<JtbAddCraftApplicantInfo> jtbAddCraftApplicantInfo=null;
		List<JtbAddCraftEmployeeInfo> jtbAddCraftEmployeeInfos=null;
		JTBPaymentMethod jtbPayment=null;
		try{
			jtbPayment= JTBPaymentMethodLocalServiceUtil.getJTBById(jtbApplicationId);
		}catch(Exception e){}
		
		//Signatures
				String signatureOfVendor = null;
				String signatureOfVendorAssistant = null;
		
		try {
			jtbApplication = JTBApplicationLocalServiceUtil.getJTBApplication(jtbApplicationId);
		} catch (Exception e) {
		}
		try {
			craftTrader = AttractionCraftTraderLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
		}
		try {
			jtbAddCraftEmployeeInfos = JtbAddCraftEmployeeInfoLocalServiceUtil.getByJtbAppId(jtbApplicationId);
		} catch (Exception e) {
		}
		try {
			jtbAddCraftApplicantInfo = JtbAddCraftApplicantInfoLocalServiceUtil.getByJtbAppId(jtbApplicationId);
		} catch (Exception e) {
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
		//Signatures
				try {
					signatureOfVendor=replaceSignatureOfVendor
							  (craftTrader.getJtbApplicationId(), "Craft Vendor's Signature", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
				} catch (Exception e) {
					// TODO: handle exception
				}
				try {
					signatureOfVendorAssistant=replaceSignatureForVendorAssistant
							(craftTrader.getJtbApplicationId(), "Craft Vendor's Assistant Signature", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
				} catch (Exception e) {
					// TODO: handle exception
				}
		
//pdf go in launch case
		if (checkPdfDownloadWithoutDocument.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(), "other-crafttrader-1");
		} else {
			try {
				pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(), "other-crafttrader");
			} catch (Exception e) {

			}
		}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
					"[$CraftOwnerName$]", "[$CraftHomeAddr$]", "[$CraftPhoneNum$]", "[$CraftEmailAdd$]", 
					"[$Location1$]",
					"[$Location2$]",
					"[$Location3$]",
					"[$Location4$]",
					"[$Location5$]",
					// -------------------------------------------------------------------------------
					"[$EmployeeNam1$]", "[$EmpAddress1$]", "[$EmpPhone1$]",
					"[$EmployeeNam2$]", "[$EmpAddress2$]", "[$EmpPhone2$]",
					"[$EmployeeNam3$]", "[$EmpAddress3$]", "[$EmpPhone3$]",
					"[$EmployeeNam4$]", "[$EmpAddress4$]", "[$EmpPhone4$]",
					"[$EmployeeNam5$]", "[$EmpAddress5$]", "[$EmpPhone5$]",
					"[$OccupyLoc$]", "[$GoodsSold$]",
					"[$OwnerName$]", "[$OwnerPosition$]",
					"[$OwnerAddress$]", "[$EmpName$]",
					"[$EmpPosition$]", "[$EmpAddress$]",
					"[$CraftSign$]","[$CraftDate$]","[$CraftSecSign$]", "[$CraftSecDate$]",
					
			},
					

					new String[] {
							// Applicant details
							Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTradersAppliOwner())?craftTrader.getCraftTradersAppliOwner():"",
							Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTradersAppliAddress())?craftTrader.getCraftTradersAppliAddress():"",
							Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTradersAppliPhoneNo())?craftTrader.getCraftTradersAppliPhoneNo():"",
							Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTradersAppliEmail())?craftTrader.getCraftTradersAppliEmail():"",
							
							
							jtbAddCraftApplicantInfo!=null&&jtbAddCraftApplicantInfo.size()>0?jtbAddCraftApplicantInfo.get(0).getSellingLocation():"",
							jtbAddCraftApplicantInfo!=null&&jtbAddCraftApplicantInfo.size()>1?jtbAddCraftApplicantInfo.get(1).getSellingLocation():"",
							jtbAddCraftApplicantInfo!=null&&jtbAddCraftApplicantInfo.size()>2?jtbAddCraftApplicantInfo.get(2).getSellingLocation():"",
							jtbAddCraftApplicantInfo!=null&&jtbAddCraftApplicantInfo.size()>3?jtbAddCraftApplicantInfo.get(3).getSellingLocation():"",
							jtbAddCraftApplicantInfo!=null&&jtbAddCraftApplicantInfo.size()>4?jtbAddCraftApplicantInfo.get(4).getSellingLocation():"",
																																																								
							jtbAddCraftEmployeeInfos!=null&&jtbAddCraftEmployeeInfos.size()>0?jtbAddCraftEmployeeInfos.get(0).getEmpName():"",
							jtbAddCraftEmployeeInfos!=null&&jtbAddCraftEmployeeInfos.size()>0?jtbAddCraftEmployeeInfos.get(0).getEmpAddress():"",
							jtbAddCraftEmployeeInfos!=null&&jtbAddCraftEmployeeInfos.size()>0?jtbAddCraftEmployeeInfos.get(0).getEmpPhoneNo():"",

						jtbAddCraftEmployeeInfos!=null&&jtbAddCraftEmployeeInfos.size()>1?jtbAddCraftEmployeeInfos.get(1).getEmpName():"",
						jtbAddCraftEmployeeInfos!=null&&jtbAddCraftEmployeeInfos.size()>1?jtbAddCraftEmployeeInfos.get(1).getEmpAddress():"",
						jtbAddCraftEmployeeInfos!=null&&jtbAddCraftEmployeeInfos.size()>1?jtbAddCraftEmployeeInfos.get(1).getEmpPhoneNo():"",
																																																																				
						jtbAddCraftEmployeeInfos!=null&&jtbAddCraftEmployeeInfos.size()>2?jtbAddCraftEmployeeInfos.get(2).getEmpName():"",
						jtbAddCraftEmployeeInfos!=null&&jtbAddCraftEmployeeInfos.size()>2?jtbAddCraftEmployeeInfos.get(2).getEmpAddress():"",
						jtbAddCraftEmployeeInfos!=null&&jtbAddCraftEmployeeInfos.size()>2?jtbAddCraftEmployeeInfos.get(2).getEmpPhoneNo():"",
																																																																										
						jtbAddCraftEmployeeInfos!=null&&jtbAddCraftEmployeeInfos.size()>3?jtbAddCraftEmployeeInfos.get(3).getEmpName():"",
						jtbAddCraftEmployeeInfos!=null&&jtbAddCraftEmployeeInfos.size()>3?jtbAddCraftEmployeeInfos.get(3).getEmpAddress():"",
						jtbAddCraftEmployeeInfos!=null&&jtbAddCraftEmployeeInfos.size()>3?jtbAddCraftEmployeeInfos.get(3).getEmpPhoneNo():"",
																											
					jtbAddCraftEmployeeInfos!=null&&jtbAddCraftEmployeeInfos.size()>4?jtbAddCraftEmployeeInfos.get(4).getEmpName():"",
					jtbAddCraftEmployeeInfos!=null&&jtbAddCraftEmployeeInfos.size()>4?jtbAddCraftEmployeeInfos.get(4).getEmpAddress():"",
					jtbAddCraftEmployeeInfos!=null&&jtbAddCraftEmployeeInfos.size()>4?jtbAddCraftEmployeeInfos.get(4).getEmpPhoneNo():"",
																																																																																						
																																																								
					Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getOccupyLocation())?craftTrader.getOccupyLocation():"",
					Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTraderGoodsType())?craftTrader.getCraftTraderGoodsType():"",
					Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTraderName())?craftTrader.getCraftTraderName():"",
					Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTraderPosition())?craftTrader.getCraftTraderPosition():"",
					Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTraderMinisterAddr())?craftTrader.getCraftTraderMinisterAddr():"",
					Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTraderMinisterName())?craftTrader.getCraftTraderMinisterName():"",
					Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTraderMinisterNamePos())?craftTrader.getCraftTraderMinisterNamePos():"",
					Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTraderAddressOwner())?craftTrader.getCraftTraderAddressOwner():"",
					signatureOfVendor,
					Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTraderSignDate())?dateFormat.format(craftTrader.getCraftTraderSignDate()):"",
					signatureOfVendorAssistant,
					Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTraderAssistSiDate())?dateFormat.format(craftTrader.getCraftTraderAssistSiDate()):"",
							});
			} catch (Exception e) {
		}
		if (!checkPdfDownloadWithoutDocument.equals("false")) {
			String fileName = null;
			String title = null;
			String copyOfCertificate = null;
			String copyOfRegistration = null;
			String letterOfGood = null;
			String copyOfTax = null;
			String listOfDiretor = null;
			String copyOfPublic = null;
			String approvalFromTheLocal = null;
			String permissionFood = null;
			
			for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
				try {
					fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
				} catch (PortalException e) {
					e.printStackTrace();
				}
				fileName = fileEntry.getFileName();
				title = fileEntry.getTitle();
				if (title.equals("Recommendation from the President of the designated Craft Traders Association")) {
					copyOfCertificate = fileName;
				} else if (title.equals(
						"One (1) Certified Photograph")) {
					copyOfRegistration = fileName;
				} else if (title.equals("Recommendation from either a Minister of Religion or Teacher or Justice of the Peace (Applicable every two (2) years)")) {
					letterOfGood = fileName;
				} else if (title.equals("No Objection Letter from Landlord (repayment of rent ) or last three (3) months rent receipt")) {
					copyOfTax = fileName;
				} else if (title.equals("Copy of Team Jamaica Certificate")) {
					listOfDiretor = fileName;
				} else if (title.equals("Copy of Tax Registration Number (TRN)")) {
					copyOfPublic = fileName;
				} else if (title.equals("Approval From Local Planning Authority")) {
					approvalFromTheLocal = fileName;
				}else if (title.equals("Food Handlers Permit")) {
					permissionFood = fileName;
				}
			}
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//for the document 
					"[$Association$]","[$CertificatePhoto$]","[$ReligionTeacher$]","[$LetterLast$]","[$JamaicaCertifiedOwner$]",
					"[$TaxNum$]",	"[$approvalLocal$]",	"[$FoodPer$]",
					"[$PaymentMethCraft$]",
					},
					new String[] { copyOfCertificate, copyOfRegistration, letterOfGood, copyOfTax, listOfDiretor,
							copyOfPublic,approvalFromTheLocal,permissionFood,
							Validator.isNotNull(jtbPayment)&&Validator.isNotNull(jtbPayment.getPaymentMethod())?jtbPayment.getPaymentMethod():"",});
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
