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
import com.nbp.miic.application.form.services.model.MiicSafeguardGoodAdd;
import com.nbp.miic.application.form.services.model.MiicSafeguardMaterialAdd;
import com.nbp.miic.application.form.services.service.MiicApplicantDetailsLocalServiceUtil;
import com.nbp.miic.application.form.services.service.MiicApplicationLocalServiceUtil;
import com.nbp.miic.application.form.services.service.MiicSafeguardGoodAddLocalServiceUtil;
import com.nbp.miic.application.form.services.service.MiicSafeguardMaterialAddLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MiicSafeguardMechPdf {
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


public static String getMiicSafeguardPdf(long miicApplicationId, ThemeDisplay themeDisplay,
	String checkPdfDownloadWithoutDocument) {
String pdfTemplate = StringPool.BLANK;
DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
MiicApplication miicApplication=null;
MiicApplicantDetails applicantDetail=null;
List<MiicSafeguardMaterialAdd> safeguardMech=null;
List<MiicSafeguardGoodAdd> goodsProduced=null;

//folder
List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
DLFolder supportingDocumentsFolder = null;
DLFolder supportingDocumentsParentFolder = null;
FileEntry fileEntry = null;
//Signatures
String signatureForNcraApp = null;

try {
	applicantDetail= MiicApplicantDetailsLocalServiceUtil.getMiicById(miicApplicationId);
}catch (Exception e) {
}
try {
	miicApplication= MiicApplicationLocalServiceUtil.getMiicApplication(miicApplicationId);
}catch (Exception e) {
}
try {
	safeguardMech= MiicSafeguardMaterialAddLocalServiceUtil.getMiicById(miicApplicationId);
} catch (Exception e) {}
try {
	goodsProduced= MiicSafeguardGoodAddLocalServiceUtil.getMiicById(miicApplicationId);
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
					"safeguard-mechanism-1");
		} else {
			try {
			pdfTemplate = getTemplateFromJournalArticlePDF
					(themeDisplay.getScopeGroupId(),
					"safeguard-mechanism");
			}catch (Exception e) {
				
			}
		}
try {
	pdfTemplate = StringUtil.replace(pdfTemplate, 
	new String[] {
	//Applicant details
	"[$ApplicantSafe$]","[$NameProducer$]","[$FirstNameSafe$]","[$LastNameSafe$]","[$CompanyNameSafe$]","[$AddressSafe$]","[$EmailSafe$]",
	"[$TelephoneSafe$]","[$DateSafe$]","[$TRNNumSafe$]",
	
	//Material Required
	/*"[$NaProducer1$]","[$AddProducer1$]",*/"[$MaDescription1$]","[$TariffNo1$]","[$Amount1$]","[$Quantity1$]","[$TechnologyMa1$]","[$ImpPeriod1$]","[$PeriodTo1$]",
	/*"[$NaProducer2$]","[$AddProducer2$]",*/"[$MaDescription2$]","[$TariffNo2$]","[$Amount2$]","[$Quantity2$]","[$TechnologyMa2$]","[$ImpPeriod2$]","[$PeriodTo2$]",
	/*"[$NaProducer3$]","[$AddProducer3$]",*/"[$MaDescription3$]","[$TariffNo3$]","[$Amount3$]","[$Quantity3$]","[$TechnologyMa3$]","[$ImpPeriod3$]","[$PeriodTo3$]",
	/*"[$NaProducer4$]","[$AddProducer4$]",*/"[$MaDescription4$]","[$TariffNo4$]","[$Amount4$]","[$Quantity4$]","[$TechnologyMa4$]","[$ImpPeriod4$]","[$PeriodTo4$]",
	/*"[$NaProducer5$]","[$AddProducer5$]",*/"[$MaDescription5$]","[$TariffNo5$]","[$Amount5$]","[$Quantity5$]","[$TechnologyMa5$]","[$ImpPeriod5$]","[$PeriodTo5$]",
	
	
	//Goods To Be Produced
	"[$HeadingNo1$]","[$DescriptionTo1$]","[$QuantityTo1$]","[$EstimateTo1$]","[$SafeguardMechanism1$]",
	"[$HeadingNo2$]","[$DescriptionTo2$]","[$QuantityTo2$]","[$Estimateto2$]","[$SafeguardMechanism2$]",
	"[$HeadingNo3$]","[$DescriptionTo3$]","[$QuantityTo3$]","[$EstimateTo3$]","[$SafeguardMechanism3$]",
	"[$HeadingNo4$]","[$DescriptionTo4$]","[$QuantityTo4$]","[$EstimateTo4$]","[$SafeguardMechanism4$]",
	"[$HeadingNo5$]","[$DescriptionTo5$]","[$QuantityTo5$]","[$EstimateTo5$]","[$SafeguardMechanism5$]",
	
	
	},
	new String[] {
	//Applicant details
	Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getNatureOfApplicant())?applicantDetail.getNatureOfApplicant():"",
	Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getNameOfProducer())?applicantDetail.getNameOfProducer():"",
	Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getFirstName())?applicantDetail.getFirstName():"",
	Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getLastName())?applicantDetail.getLastName():"",
	Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getCompanyName())?applicantDetail.getCompanyName():"",
	Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getAddress())?applicantDetail.getAddress():"",
	Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getEmail())?applicantDetail.getEmail():"",
	Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getTelephone())?applicantDetail.getTelephone():"",
	Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getDateOfApplication())?dateFormat.format(applicantDetail.getDateOfApplication()):"",
	Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getTrnNumber())?applicantDetail.getTrnNumber():"",
			
	//Material
//	(safeguardMech!=null)&&(safeguardMech.size()>0)?safeguardMech.get(0).getNameOfProducer():"",
//	(safeguardMech!=null)&&(safeguardMech.size()>0)?safeguardMech.get(0).getAddressOfProducer():"",
	(safeguardMech!=null)&&(safeguardMech.size()>0)?safeguardMech.get(0).getDescription():"",
	(safeguardMech!=null)&&(safeguardMech.size()>0)?safeguardMech.get(0).getTariffHeadingNum():"",
	(safeguardMech!=null)&&(safeguardMech.size()>0)?safeguardMech.get(0).getAmount():"",
	(safeguardMech!=null)&&(safeguardMech.size()>0)?safeguardMech.get(0).getQuantity():"",
	(safeguardMech!=null)&&(safeguardMech.size()>0)?safeguardMech.get(0).getTechnologySpecification():"",
	(safeguardMech!=null)&&(safeguardMech.size()>0)?dateFormat.format(safeguardMech.get(0).getPeriodOfImportationFrom()):"",
	(safeguardMech!=null)&&(safeguardMech.size()>0)?dateFormat.format(safeguardMech.get(0).getPeriodOfImportationTo()):"",
	
			
//	(safeguardMech!=null)&&(safeguardMech.size()>1)?safeguardMech.get(1).getNameOfProducer():"",
//	(safeguardMech!=null)&&(safeguardMech.size()>1)?safeguardMech.get(1).getAddressOfProducer():"",
	(safeguardMech!=null)&&(safeguardMech.size()>1)?safeguardMech.get(1).getDescription():"",
	(safeguardMech!=null)&&(safeguardMech.size()>1)?safeguardMech.get(1).getTariffHeadingNum():"",
	(safeguardMech!=null)&&(safeguardMech.size()>1)?safeguardMech.get(1).getAmount():"",
	(safeguardMech!=null)&&(safeguardMech.size()>1)?safeguardMech.get(1).getQuantity():"",
	(safeguardMech!=null)&&(safeguardMech.size()>1)?safeguardMech.get(1).getTechnologySpecification():"",
	(safeguardMech!=null)&&(safeguardMech.size()>1)?dateFormat.format(safeguardMech.get(1).getPeriodOfImportationFrom()):"",
	(safeguardMech!=null)&&(safeguardMech.size()>1)?dateFormat.format(safeguardMech.get(1).getPeriodOfImportationTo()):"",
	
//	(safeguardMech!=null)&&(safeguardMech.size()>2)?safeguardMech.get(2).getNameOfProducer():"",
//	(safeguardMech!=null)&&(safeguardMech.size()>2)?safeguardMech.get(2).getAddressOfProducer():"",
	(safeguardMech!=null)&&(safeguardMech.size()>2)?safeguardMech.get(2).getDescription():"",
	(safeguardMech!=null)&&(safeguardMech.size()>2)?safeguardMech.get(2).getTariffHeadingNum():"",
	(safeguardMech!=null)&&(safeguardMech.size()>2)?safeguardMech.get(2).getAmount():"",
	(safeguardMech!=null)&&(safeguardMech.size()>2)?safeguardMech.get(2).getQuantity():"",
	(safeguardMech!=null)&&(safeguardMech.size()>2)?safeguardMech.get(2).getTechnologySpecification():"",
	(safeguardMech!=null)&&(safeguardMech.size()>2)?dateFormat.format(safeguardMech.get(2).getPeriodOfImportationFrom()):"",
	(safeguardMech!=null)&&(safeguardMech.size()>2)?dateFormat.format(safeguardMech.get(2).getPeriodOfImportationTo()):"",
	
//	(safeguardMech!=null)&&(safeguardMech.size()>3)?safeguardMech.get(3).getNameOfProducer():"",
//	(safeguardMech!=null)&&(safeguardMech.size()>3)?safeguardMech.get(3).getAddressOfProducer():"",
	(safeguardMech!=null)&&(safeguardMech.size()>3)?safeguardMech.get(3).getDescription():"",
	(safeguardMech!=null)&&(safeguardMech.size()>3)?safeguardMech.get(3).getTariffHeadingNum():"",
	(safeguardMech!=null)&&(safeguardMech.size()>3)?safeguardMech.get(3).getAmount():"",
	(safeguardMech!=null)&&(safeguardMech.size()>3)?safeguardMech.get(3).getQuantity():"",
	(safeguardMech!=null)&&(safeguardMech.size()>3)?safeguardMech.get(3).getTechnologySpecification():"",
	(safeguardMech!=null)&&(safeguardMech.size()>3)?dateFormat.format(safeguardMech.get(3).getPeriodOfImportationFrom()):"",
	(safeguardMech!=null)&&(safeguardMech.size()>3)?dateFormat.format(safeguardMech.get(3).getPeriodOfImportationTo()):"",
	
//	(safeguardMech!=null)&&(safeguardMech.size()>4)?safeguardMech.get(4).getNameOfProducer():"",
//	(safeguardMech!=null)&&(safeguardMech.size()>4)?safeguardMech.get(4).getAddressOfProducer():"",
	(safeguardMech!=null)&&(safeguardMech.size()>4)?safeguardMech.get(4).getDescription():"",
	(safeguardMech!=null)&&(safeguardMech.size()>4)?safeguardMech.get(4).getTariffHeadingNum():"",
	(safeguardMech!=null)&&(safeguardMech.size()>4)?safeguardMech.get(4).getAmount():"",
	(safeguardMech!=null)&&(safeguardMech.size()>4)?safeguardMech.get(4).getQuantity():"",
	(safeguardMech!=null)&&(safeguardMech.size()>4)?safeguardMech.get(4).getTechnologySpecification():"",
	(safeguardMech!=null)&&(safeguardMech.size()>4)?dateFormat.format(safeguardMech.get(4).getPeriodOfImportationFrom()):"",
	(safeguardMech!=null)&&(safeguardMech.size()>4)?dateFormat.format(safeguardMech.get(4).getPeriodOfImportationTo()):"",
																	
			
		//Goods To Be Produced
	(goodsProduced!=null)&&(goodsProduced.size()>0)?goodsProduced.get(0).getTariffHeadingNum():"",
	(goodsProduced!=null)&&(goodsProduced.size()>0)?goodsProduced.get(0).getDescription():"",
	(goodsProduced!=null)&&(goodsProduced.size()>0)?goodsProduced.get(0).getAmountQuantity():"",
	(goodsProduced!=null)&&(goodsProduced.size()>0)?goodsProduced.get(0).getAmountEstimate():"",
	(goodsProduced!=null)&&(goodsProduced.size()>0)?goodsProduced.get(0).getResonForRequest():"",
			
	(goodsProduced!=null)&&(goodsProduced.size()>1)?goodsProduced.get(1).getTariffHeadingNum():"",
	(goodsProduced!=null)&&(goodsProduced.size()>1)?goodsProduced.get(1).getDescription():"",
	(goodsProduced!=null)&&(goodsProduced.size()>1)?goodsProduced.get(1).getAmountQuantity():"",
	(goodsProduced!=null)&&(goodsProduced.size()>1)?goodsProduced.get(1).getAmountEstimate():"",
	(goodsProduced!=null)&&(goodsProduced.size()>1)?goodsProduced.get(1).getResonForRequest():"",
	
	(goodsProduced!=null)&&(goodsProduced.size()>2)?goodsProduced.get(2).getTariffHeadingNum():"",
	(goodsProduced!=null)&&(goodsProduced.size()>2)?goodsProduced.get(2).getDescription():"",
	(goodsProduced!=null)&&(goodsProduced.size()>2)?goodsProduced.get(2).getAmountQuantity():"",
	(goodsProduced!=null)&&(goodsProduced.size()>2)?goodsProduced.get(2).getAmountEstimate():"",
	(goodsProduced!=null)&&(goodsProduced.size()>2)?goodsProduced.get(2).getResonForRequest():"",
	
	(goodsProduced!=null)&&(goodsProduced.size()>3)?goodsProduced.get(3).getTariffHeadingNum():"",
	(goodsProduced!=null)&&(goodsProduced.size()>3)?goodsProduced.get(3).getDescription():"",
	(goodsProduced!=null)&&(goodsProduced.size()>3)?goodsProduced.get(3).getAmountQuantity():"",
	(goodsProduced!=null)&&(goodsProduced.size()>3)?goodsProduced.get(3).getAmountEstimate():"",
	(goodsProduced!=null)&&(goodsProduced.size()>3)?goodsProduced.get(3).getResonForRequest():"",
	
	(goodsProduced!=null)&&(goodsProduced.size()>4)?goodsProduced.get(4).getTariffHeadingNum():"",
	(goodsProduced!=null)&&(goodsProduced.size()>4)?goodsProduced.get(4).getDescription():"",
	(goodsProduced!=null)&&(goodsProduced.size()>4)?goodsProduced.get(4).getAmountQuantity():"",
	(goodsProduced!=null)&&(goodsProduced.size()>4)?goodsProduced.get(4).getAmountEstimate():"",
	(goodsProduced!=null)&&(goodsProduced.size()>4)?goodsProduced.get(4).getResonForRequest():"",
																																											
	});
		    }catch (Exception e) {
				// TODO: handle exception
			}
	
if (checkPdfDownloadWithoutDocument.equals("true")) {
	String title = "";
	String fileName = "";
	if (Validator.isNotNull(supportingDocumentsFolder)) {
	String commodityTech = "";
	
	
	for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
		try {
			fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
			
		} catch (Exception e) {}
		fileName = fileEntry.getFileName();
		title=fileEntry.getTitle();
		if(title.equals("Technical Specifications of Commodity")) {
			commodityTech = fileName;
		}
	}
	
	pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
		"[$TechnicalCom$]",
		},
		new String[] {
				commodityTech,
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
