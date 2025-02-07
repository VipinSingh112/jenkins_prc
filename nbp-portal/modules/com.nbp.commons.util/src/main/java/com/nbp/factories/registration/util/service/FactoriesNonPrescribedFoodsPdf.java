package com.nbp.factories.registration.util.service;

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
import com.nbp.factories.registration.application.form.services.model.FactoriesAppPayment;
import com.nbp.factories.registration.application.form.services.model.FactoriesApplicationRegistration;
import com.nbp.factories.registration.application.form.services.model.FactoriesProcessedFoodAct;
import com.nbp.factories.registration.application.form.services.model.FactoriesProductDetailsAdd;
import com.nbp.factories.registration.application.form.services.model.FactoriesStandardActInfo;
import com.nbp.factories.registration.application.form.services.service.FactoriesAppPaymentLocalServiceUtil;
import com.nbp.factories.registration.application.form.services.service.FactoriesApplicationRegistrationLocalServiceUtil;
import com.nbp.factories.registration.application.form.services.service.FactoriesProcessedFoodActLocalServiceUtil;
import com.nbp.factories.registration.application.form.services.service.FactoriesProductDetailsAddLocalServiceUtil;
import com.nbp.factories.registration.application.form.services.service.FactoriesStandardActInfoLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class FactoriesNonPrescribedFoodsPdf {
    public static String replaceSignatureForOperator(long factoriesApplicationId, String folderName, long groupId,
	long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
	DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
			"Standard Act Signature");
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
    
	public static String getNonPrescribedFoodFactRegstPdf(long factoriesApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		FactoriesApplicationRegistration factoriesApplication=null;
		FactoriesProcessedFoodAct processedFoodAct=null;
		FactoriesStandardActInfo standardActInfo=null;
		FactoriesAppPayment factoriesPayment=null; 
		List<FactoriesProductDetailsAdd> productDetailAdd=null;

		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		//Signatures
		String signatureForOperator = null;
		String signatureForOperatorFormA = null;
		
		try{
			factoriesApplication= FactoriesApplicationRegistrationLocalServiceUtil.getFactoriesRegistrationById(factoriesApplicationId);
		}catch(Exception e){}
		try{
			processedFoodAct= FactoriesProcessedFoodActLocalServiceUtil.getFactoriesById(factoriesApplicationId);
		}catch(Exception e){}
		try{
			standardActInfo= FactoriesStandardActInfoLocalServiceUtil.getFactoryStandardActBy_Id(factoriesApplicationId);
		}catch(Exception e){}
		try{
			factoriesPayment= FactoriesAppPaymentLocalServiceUtil.getFactoriesRegistrationById(factoriesApplicationId);
		}catch(Exception e){}
		try{
			productDetailAdd= FactoriesProductDetailsAddLocalServiceUtil.getFactoriesById(factoriesApplicationId);
		}catch(Exception e){}


		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Factories Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(), String.valueOf(factoriesApplication.getFactoriesApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//signatures
		
		 try { 
			  signatureForOperator =replaceSignatureForOperator(standardActInfo.getFactoriesApplicationId(), "Standard Act Signature", themeDisplay.getScopeGroupId(), 
				  supportingDocumentsFolder.getFolderId(),  themeDisplay); 
		  } catch (Exception e) {}
		 

		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"factories-non-prescribed-food-1");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"factories-non-prescribed-food");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, 
			new String[] {
			//Applicant details
				"[$NameEsta$]","[$Pari$]","[$Add$]","[$Telenum$]","[$Whatno$]","[$Emaila$]","[$Faxnum$]","[$Fulleasta$]","[$Aress$]","[$Prish$]","[$Tnum$]",
				"[$Brand1$]","[$Product1$]","[$ProductSize1$]","[$MeasurementValue1$]",
				"[$Brand2$]","[$Product2$]","[$ProductSize2$]","[$MeasurementValue2$]",
				"[$Brand3$]","[$Product3$]","[$ProductSize3$]","[$MeasurementValue3$]",
				"[$Brand4$]","[$Product4$]","[$ProductSize4$]","[$MeasurementValue4$]",
				"[$Brand5$]","[$Product5$]","[$ProductSize5$]","[$MeasurementValue5$]",
				
				"[$Hasbe$]","[$Lastion$]","[$Forpur$]","[$SignatureSi$]","[$WeighingDate$]",
				/*"[$Names$]","[$Pish$]","[$Are$]","[$Fullop$]","[$Add1$]","[$Pari1$]","[$Prescribedesta$]","[$Hasbee$]","[$Lastdate$]","[$Presfood$]",
				"[$SignatureSiA$]","[$ProcessedDate$]"*/
					
			},
			new String[] {
			//Applicant details
					
				Validator.isNotNull(standardActInfo)&&Validator.isNotNull(standardActInfo.getStandardsActEstablishmentName())?standardActInfo.getStandardsActEstablishmentName():"",		
				Validator.isNotNull(standardActInfo)&&Validator.isNotNull(standardActInfo.getStandardsActAddParish())?standardActInfo.getStandardsActAddParish():"",		
				Validator.isNotNull(standardActInfo)&&Validator.isNotNull(standardActInfo.getStandardsActAddress())?standardActInfo.getStandardsActAddress():"",		
				Validator.isNotNull(standardActInfo)&&Validator.isNotNull(standardActInfo.getStandardsActTel())?standardActInfo.getStandardsActTel():"",
				Validator.isNotNull(standardActInfo)&&Validator.isNotNull(standardActInfo.getStandardsActWhatsAppNum())?standardActInfo.getStandardsActWhatsAppNum():"",
				Validator.isNotNull(standardActInfo)&&Validator.isNotNull(standardActInfo.getStandardsActEmail())?standardActInfo.getStandardsActEmail():"",
				Validator.isNotNull(standardActInfo)&&Validator.isNotNull(standardActInfo.getStandardsActFaxNum())?standardActInfo.getStandardsActFaxNum():"",
				Validator.isNotNull(standardActInfo)&&Validator.isNotNull(standardActInfo.getStandardsActOperatorName())?standardActInfo.getStandardsActOperatorName():"",
				Validator.isNotNull(standardActInfo)&&Validator.isNotNull(standardActInfo.getStandardsActOperatorAddress())?standardActInfo.getStandardsActOperatorAddress():"",
				Validator.isNotNull(standardActInfo)&&Validator.isNotNull(standardActInfo.getStandardsActParish())?standardActInfo.getStandardsActParish():"",
				Validator.isNotNull(standardActInfo)&&Validator.isNotNull(standardActInfo.getStandardsActOperatorTel())?standardActInfo.getStandardsActOperatorTel():"",
						
				(productDetailAdd!=null)&&(productDetailAdd.size()>0)?productDetailAdd.get(0).getProductBrand():"",		
				(productDetailAdd!=null)&&(productDetailAdd.size()>0)?productDetailAdd.get(0).getProduct():"",		
				(productDetailAdd!=null)&&(productDetailAdd.size()>0)?productDetailAdd.get(0).getProductSize():"",		
				(productDetailAdd!=null)&&(productDetailAdd.size()>0)?productDetailAdd.get(0).getProductMeasurementVal():"",		
						
				(productDetailAdd!=null)&&(productDetailAdd.size()>1)?productDetailAdd.get(1).getProductBrand():"",		
				(productDetailAdd!=null)&&(productDetailAdd.size()>1)?productDetailAdd.get(1).getProduct():"",		
				(productDetailAdd!=null)&&(productDetailAdd.size()>1)?productDetailAdd.get(1).getProductSize():"",		
				(productDetailAdd!=null)&&(productDetailAdd.size()>1)?productDetailAdd.get(1).getProductMeasurementVal():"",		
				
				(productDetailAdd!=null)&&(productDetailAdd.size()>2)?productDetailAdd.get(2).getProductBrand():"",		
				(productDetailAdd!=null)&&(productDetailAdd.size()>2)?productDetailAdd.get(2).getProduct():"",		
				(productDetailAdd!=null)&&(productDetailAdd.size()>2)?productDetailAdd.get(2).getProductSize():"",		
				(productDetailAdd!=null)&&(productDetailAdd.size()>2)?productDetailAdd.get(2).getProductMeasurementVal():"",		
				
				(productDetailAdd!=null)&&(productDetailAdd.size()>3)?productDetailAdd.get(3).getProductBrand():"",		
				(productDetailAdd!=null)&&(productDetailAdd.size()>3)?productDetailAdd.get(3).getProduct():"",		
				(productDetailAdd!=null)&&(productDetailAdd.size()>3)?productDetailAdd.get(3).getProductSize():"",		
				(productDetailAdd!=null)&&(productDetailAdd.size()>3)?productDetailAdd.get(3).getProductMeasurementVal():"",		
					
				(productDetailAdd!=null)&&(productDetailAdd.size()>4)?productDetailAdd.get(4).getProductBrand():"",		
				(productDetailAdd!=null)&&(productDetailAdd.size()>4)?productDetailAdd.get(4).getProduct():"",		
				(productDetailAdd!=null)&&(productDetailAdd.size()>4)?productDetailAdd.get(4).getProductSize():"",		
				(productDetailAdd!=null)&&(productDetailAdd.size()>4)?productDetailAdd.get(4).getProductMeasurementVal():"",		
						
				Validator.isNotNull(standardActInfo)&&Validator.isNotNull(standardActInfo.getEstablishmentBefore())?standardActInfo.getEstablishmentBefore():"",
				Validator.isNotNull(standardActInfo)&&Validator.isNotNull(standardActInfo.getStandardsActLastDate())?dateFormat.format(standardActInfo.getStandardsActLastDate()):"",
				Validator.isNotNull(standardActInfo)&&Validator.isNotNull(standardActInfo.getStandardsActPurpose())?standardActInfo.getStandardsActPurpose():"",
				signatureForOperator,
				Validator.isNotNull(standardActInfo)&&Validator.isNotNull(standardActInfo.getStandardsActDate())?dateFormat.format(standardActInfo.getStandardsActDate()):"",
				/*Validator.isNotNull(processedFoodAct)&&Validator.isNotNull(processedFoodAct.getProcessedActEstablishmentName())?processedFoodAct.getProcessedActEstablishmentName():"",
				Validator.isNotNull(processedFoodAct)&&Validator.isNotNull(processedFoodAct.getProcessedActParishAddress())?processedFoodAct.getProcessedActParishAddress():"",
				Validator.isNotNull(processedFoodAct)&&Validator.isNotNull(processedFoodAct.getProcessedActAddress())?processedFoodAct.getProcessedActAddress():"",
				Validator.isNotNull(processedFoodAct)&&Validator.isNotNull(processedFoodAct.getProcessedActOperatorName())?processedFoodAct.getProcessedActOperatorName():"",
				Validator.isNotNull(processedFoodAct)&&Validator.isNotNull(processedFoodAct.getProcessedActOperatorAddress())?processedFoodAct.getProcessedActOperatorAddress():"",
				Validator.isNotNull(processedFoodAct)&&Validator.isNotNull(processedFoodAct.getProcessedActParish())?processedFoodAct.getProcessedActParish():"",
				Validator.isNotNull(processedFoodAct)&&Validator.isNotNull(processedFoodAct.getProcessedActDescription())?processedFoodAct.getProcessedActDescription():"",
				Validator.isNotNull(processedFoodAct)&&Validator.isNotNull(processedFoodAct.getEstablishmentOperated())?processedFoodAct.getEstablishmentOperated():"",
				Validator.isNotNull(processedFoodAct)&&Validator.isNotNull(processedFoodAct.getProcessedActLastDate())?dateFormat.format(processedFoodAct.getProcessedActLastDate()):"",
				Validator.isNotNull(processedFoodAct)&&Validator.isNotNull(processedFoodAct.getProcessedActManufactured())?processedFoodAct.getProcessedActManufactured():"",
				signatureForOperatorFormA,
				Validator.isNotNull(processedFoodAct)&&Validator.isNotNull(processedFoodAct.getProcessedActDate())?dateFormat.format(processedFoodAct.getProcessedActDate()):"",
				*/
				//(applicantDetails!=null)&&(applicantDetails.size()>1)?dateFormat.format(applicantDetails.get(1).getPeriodOfImportationFrom()):"",
				//(applicantDetails!=null)&&(applicantDetails.size()>0)?dateFormat.format(applicantDetails.get(0).getPeriodOfImportationTo()):"",
			
			});
				    }catch (Exception e) {
						// TODO: handle exception
					}
			
		if (!checkPdfDownloadWithoutDocument.equals("false")) {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
			String certiRegst = "";
			String prodLabel = "";
			String prodSample = "";
			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					
				} catch (Exception e) {}
				fileName = fileEntry.getFileName();
				title=fileEntry.getTitle();
				if(title.equals("Certificate of Registration/Incorporation (The Companies Office of Jamaica (COJ))")) {
					certiRegst = fileName;
				}else if (title.equals("Product Labelling Report")) {
					prodLabel = fileName;
				}else if (title.equals("Product Sample Report")) {
					prodSample = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
					"[$Metroinfo$]", "[$Productrepo$]", "[$Samplerepo$]", 
					"[$PaymentMethodNu$]"
					
				},
				new String[] {
						certiRegst,prodLabel,prodSample,
						 Validator.isNotNull(factoriesPayment)&&Validator.isNotNull(factoriesPayment.getPaymentMethod())?factoriesPayment.getPaymentMethod():""
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
