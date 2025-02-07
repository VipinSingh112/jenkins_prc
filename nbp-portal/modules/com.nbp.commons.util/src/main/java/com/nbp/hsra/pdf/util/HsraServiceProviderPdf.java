package com.nbp.hsra.pdf.util;

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
import com.nbp.hsra.application.service.model.DetailOfApplicantSecTwo;
import com.nbp.hsra.application.service.model.DetailOfBusinessSecThree;
import com.nbp.hsra.application.service.model.HsraApplication;
import com.nbp.hsra.application.service.model.HsraApplicationPayment;
import com.nbp.hsra.application.service.model.PurposeOfPropLicence;
import com.nbp.hsra.application.service.model.RadiationDeclaration;
import com.nbp.hsra.application.service.model.RadiationDevicesAdd;
import com.nbp.hsra.application.service.model.RadiationProtectionSecOne;
import com.nbp.hsra.application.service.model.SealedSourcesAdd;
import com.nbp.hsra.application.service.model.SpecificReqPropLicActivity;
import com.nbp.hsra.application.service.model.UnsealedSourceAdd;
import com.nbp.hsra.application.service.service.DetailOfApplicantSecTwoLocalServiceUtil;
import com.nbp.hsra.application.service.service.DetailOfBusinessSecThreeLocalServiceUtil;
import com.nbp.hsra.application.service.service.HsraApplicationLocalServiceUtil;
import com.nbp.hsra.application.service.service.HsraApplicationPaymentLocalServiceUtil;
import com.nbp.hsra.application.service.service.PurposeOfPropLicenceLocalServiceUtil;
import com.nbp.hsra.application.service.service.RadiationDeclarationLocalServiceUtil;
import com.nbp.hsra.application.service.service.RadiationDevicesAddLocalServiceUtil;
import com.nbp.hsra.application.service.service.RadiationProtectionSecOneLocalServiceUtil;
import com.nbp.hsra.application.service.service.SealedSourcesAddLocalServiceUtil;
import com.nbp.hsra.application.service.service.SpecificReqPropLicActivityLocalServiceUtil;
import com.nbp.hsra.application.service.service.UnsealedSourceAddLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class HsraServiceProviderPdf {
	 public static String replaceSignatureForHsra(long hsraApplicationId, String folderName, long groupId,
				long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
			DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
					"Service Declaration Signature");
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
	
		

		
	public static String hsraServiceProviderPdf(long hsraApplicationId, ThemeDisplay themeDisplay,
				String checkPdfDownloadWithoutDocument) {
			String pdfTemplate = StringPool.BLANK;
			DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
			HsraApplication hsraApplication=null;
			RadiationProtectionSecOne radSectionOne=null;
			DetailOfApplicantSecTwo applicantDetail = null;
			DetailOfBusinessSecThree detailOfBusiness = null;
			PurposeOfPropLicence purposeLicence = null;
			HsraApplicationPayment hsraAppPayment = null;
			List<UnsealedSourceAdd> unsealedInfo=null;
			List<SealedSourcesAdd> sealedInfo = null;
		    List<RadiationDevicesAdd> raditionDeviceInfo=null;
			SpecificReqPropLicActivity specificRquirements = null;
			RadiationDeclaration radiationDeclaration = null;
			
		    
			
			//folder
			List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
			DLFolder supportingDocumentsFolder = null;
			DLFolder supportingDocumentsParentFolder = null;
			FileEntry fileEntry = null;
			
			
			  //Signatures
			String signatureForServiceProvider = null;
			
			
			try {
				hsraApplication=HsraApplicationLocalServiceUtil.getHsraApplication(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				radSectionOne=RadiationProtectionSecOneLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				applicantDetail=DetailOfApplicantSecTwoLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				detailOfBusiness=DetailOfBusinessSecThreeLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				purposeLicence=PurposeOfPropLicenceLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				unsealedInfo=UnsealedSourceAddLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				sealedInfo=SealedSourcesAddLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				raditionDeviceInfo=RadiationDevicesAddLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				specificRquirements=SpecificReqPropLicActivityLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				radiationDeclaration=RadiationDeclarationLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				hsraAppPayment=HsraApplicationPaymentLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch(Exception e) {
			}
			
			
			try {
				supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
						DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "HSRA Supporting Documents");
				supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
						supportingDocumentsParentFolder.getFolderId(), String.valueOf(hsraApplication.getHsraApplicationId()));
				supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
						supportingDocumentsFolder.getFolderId());
			} catch (Exception e) {
				e.printStackTrace();
			}
			 //signatures
			
			  try { 
				  signatureForServiceProvider =replaceSignatureForHsra(hsraApplication.getHsraApplicationId(), "Service Declaration Signature", themeDisplay.getScopeGroupId(),
					  supportingDocumentsFolder.getFolderId(),themeDisplay);
			  } catch (Exception e) {}
			  
			 
			
			//pdf go in launch case
					if (checkPdfDownloadWithoutDocument.equals("false")) {
						pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
								"weighing-device");
					} else {
						try {
						pdfTemplate = getTemplateFromJournalArticlePDF
								(themeDisplay.getScopeGroupId(),
								"services");
						}catch (Exception e) {
							
						}
					}
			try {
				pdfTemplate = 
						StringUtil.replace(pdfTemplate, 
				new String[] {
			
				//Section one 3
				
				"[$TypeLi$]","[$CurrentAuth$]","[$AmenReason$]",
				
				//section two 7
				
				"[$NameOrgani$]","[$MailAdd$]","[$Pari$]","[$OrganiZ$]","[$TeleP$]","[$FNum$]","[$EmailAdd$]",
				
				//section three 11
				"[$BusiT$]","[$NBusiness$]","[$CorpNum$]","[$ForPub$]","[$AddName$]","[$Add$]","[$ParshiDe$]","[$PhoneT$]","[$NumberFa$]","[$AddEm$]","[$GuarFi$]",
				
				
				//Section four 5
				
				"[$RegiAct$]","[$AddressPl$]","[$MainAny$]","[$locationBoth$]","[$InfoRegard$]",
				
				//section four add more first 5
				
				"[$Radio1$]","[$PossessMaxi1$]","[$TotalAct1$]","[$UsE1$]",
				"[$Radio2$]","[$PossessMaxi2$]","[$TotalAct2$]","[$UsE2$]",
				"[$Radio3$]","[$PossessMaxi3$]","[$TotalAct3$]","[$UsE3$]",
				"[$Radio4$]","[$PossessMaxi4$]","[$TotalAct4$]","[$UsE4$]",
				"[$Radio5$]","[$PossessMaxi5$]","[$TotalAct5$]","[$UsE5$]",
				//section four add more second  5
				
				"[$RadioNu1$]","[$MaximumAct1$]","[$DateAct1$]","[$NumberSe1$]","[$UseB1$]",
				"[$RadioNu2$]","[$MaximumAct2$]","[$DateAct2$]","[$NumberSe2$]","[$UseB2$]",
				"[$RadioNu3$]","[$MaximumAct3$]","[$DateAct3$]","[$NumberSe3$]","[$UseB3$]",
				"[$RadioNu4$]","[$MaximumAct4$]","[$DateAct4$]","[$NumberSe4$]","[$UseB4$]",
				"[$RadioNu5$]","[$MaximumAct5$]","[$DateAct5$]","[$NumberSe5$]","[$UseB5$]",
				
				
				//section four add more third 5
			
				"[$RadioLi1$]","[$MaximumTy1$]","[$DeviceName1$]","[$TypeAct1$]","[$Number1$]","[$DeviceOf1$]","[$UseA1$]",
				"[$RadioLi2$]","[$MaximumTy2$]","[$DeviceName2$]","[$TypeAct2$]","[$Number2$]","[$DeviceOf2$]","[$UseA2$]",
				"[$RadioLi3$]","[$MaximumTy3$]","[$DeviceName3$]","[$TypeAct3$]","[$Number3$]","[$DeviceOf3$]","[$UseA3$]",
				"[$RadioLi4$]","[$MaximumTy4$]","[$DeviceName4$]","[$TypeAct4$]","[$Number4$]","[$DeviceOf4$]","[$UseA4$]",
				"[$RadioLi5$]","[$MaximumTy5$]","[$DeviceName5$]","[$TypeAct5$]","[$Number5$]","[$DeviceOf5$]","[$UseA5$]",
				// section five
				
				"[$ServicingPro$]",
				
				//section six
				
				"[$LegalOp$]","[$TitlE$]",
				
				//signature 1
				
				"[$SigNatureMi$]",
				
				//date 1
				"[$DaTeSS$]",
				
			  //payment 1
				"[$PayMethod$]",
				
				},
				new String[] {
			   
   //section one 3
		Validator.isNotNull(hsraApplication)&&Validator.isNotNull(hsraApplication.getTypeOfTransaction())?hsraApplication.getTypeOfTransaction():"",
		Validator.isNotNull(radSectionOne)&&Validator.isNotNull(radSectionOne.getCurrentAuthNum())?radSectionOne.getCurrentAuthNum():"",
		Validator.isNotNull(radSectionOne)&&Validator.isNotNull(radSectionOne.getReasonForAmendment())?radSectionOne.getReasonForAmendment():"",
		

	   //section two 7
					
		Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getOrganizationName())?applicantDetail.getOrganizationName():"",	
		Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getNuclearMailingAddr())?applicantDetail.getNuclearMailingAddr():"",
		Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getParish())?applicantDetail.getParish():"",
		Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getNuclearTrnNumber())?applicantDetail.getNuclearTrnNumber():"",
		Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getNuclearTelephoneNo())?applicantDetail.getNuclearTelephoneNo():"",
		Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getNuclearFaxNo())?applicantDetail.getNuclearFaxNo():"",
		Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getNuclearEmailAddr())?applicantDetail.getNuclearEmailAddr():"",

		// SECTION THREE 11
		
		    
		Validator.isNotNull(detailOfBusiness)&&Validator.isNotNull(detailOfBusiness.getBusinessType())?detailOfBusiness.getBusinessType():"",
		Validator.isNotNull(detailOfBusiness)&&Validator.isNotNull(detailOfBusiness.getNuclearBusinessNumber())?detailOfBusiness.getNuclearBusinessNumber():"",
		Validator.isNotNull(detailOfBusiness)&&Validator.isNotNull(detailOfBusiness.getNuclearCorporationNum())?detailOfBusiness.getNuclearCorporationNum():"",  
		Validator.isNotNull(detailOfBusiness)&&Validator.isNotNull(detailOfBusiness.getNuclearPublicAct())?(detailOfBusiness.getNuclearPublicAct()):"",
		Validator.isNotNull(detailOfBusiness)&&Validator.isNotNull(detailOfBusiness.getNuclearName())?detailOfBusiness.getNuclearName():"",
		Validator.isNotNull(detailOfBusiness)&&Validator.isNotNull(detailOfBusiness.getNuclearAddressThird())?detailOfBusiness.getNuclearAddressThird():"",
		Validator.isNotNull(detailOfBusiness)&&Validator.isNotNull(detailOfBusiness.getNuclearThirdParish())?detailOfBusiness.getNuclearThirdParish():"",  
		Validator.isNotNull(detailOfBusiness)&&Validator.isNotNull(detailOfBusiness.getNuclearTelephoneNum())?(detailOfBusiness.getNuclearTelephoneNum()):"",
		Validator.isNotNull(detailOfBusiness)&&Validator.isNotNull(detailOfBusiness.getNuclearfaxNumber())?detailOfBusiness.getNuclearfaxNumber():"",
		Validator.isNotNull(detailOfBusiness)&&Validator.isNotNull(detailOfBusiness.getNuclearEmailAdd())?detailOfBusiness.getNuclearEmailAdd():"",
		Validator.isNotNull(detailOfBusiness)&&Validator.isNotNull(detailOfBusiness.getNuclearFinancial())?detailOfBusiness.getNuclearFinancial():"",
		
		// SECTION Four 5
				
		Validator.isNotNull(purposeLicence)&&Validator.isNotNull(purposeLicence.getNuclearRegstLic())?(purposeLicence.getNuclearRegstLic()):"",
		Validator.isNotNull(purposeLicence)&&Validator.isNotNull(purposeLicence.getNuclearBusinessPlace())?purposeLicence.getNuclearBusinessPlace():"",
		Validator.isNotNull(purposeLicence)&&Validator.isNotNull(purposeLicence.getNuclearActivityMainAdd())?purposeLicence.getNuclearActivityMainAdd():"",
		Validator.isNotNull(purposeLicence)&&Validator.isNotNull(purposeLicence.getApplicationType())?purposeLicence.getApplicationType():"",
		Validator.isNotNull(purposeLicence)&&Validator.isNotNull(purposeLicence.getNuclearAdditionalLoc())?purposeLicence.getNuclearAdditionalLoc():"",
				

        //section four add more first 5
				
	    (unsealedInfo!=null)&&(unsealedInfo.size()>0)?unsealedInfo.get(0).getUnsealedSourcesRadionu():"",
	    (unsealedInfo!=null)&&(unsealedInfo.size()>0)?unsealedInfo.get(0).getUnsealedSourcesActivity():"",
	    (unsealedInfo!=null)&&(unsealedInfo.size()>0)?unsealedInfo.get(0).getUnsealedSourcesTotalYear():"",
	    (unsealedInfo!=null)&&(unsealedInfo.size()>0)?unsealedInfo.get(0).getUnsealedSourcesUse():"",
				    				
		(unsealedInfo!=null)&&(unsealedInfo.size()>1)?unsealedInfo.get(1).getUnsealedSourcesRadionu():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>1)?unsealedInfo.get(1).getUnsealedSourcesActivity():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>1)?unsealedInfo.get(1).getUnsealedSourcesTotalYear():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>1)?unsealedInfo.get(1).getUnsealedSourcesUse():"",
							
		(unsealedInfo!=null)&&(unsealedInfo.size()>2)?unsealedInfo.get(2).getUnsealedSourcesRadionu():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>2)?unsealedInfo.get(2).getUnsealedSourcesActivity():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>2)?unsealedInfo.get(2).getUnsealedSourcesTotalYear():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>2)?unsealedInfo.get(2).getUnsealedSourcesUse():"",
		
		(unsealedInfo!=null)&&(unsealedInfo.size()>3)?unsealedInfo.get(3).getUnsealedSourcesRadionu():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>3)?unsealedInfo.get(3).getUnsealedSourcesActivity():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>3)?unsealedInfo.get(3).getUnsealedSourcesTotalYear():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>3)?unsealedInfo.get(3).getUnsealedSourcesUse():"",		

		(unsealedInfo!=null)&&(unsealedInfo.size()>4)?unsealedInfo.get(4).getUnsealedSourcesRadionu():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>4)?unsealedInfo.get(4).getUnsealedSourcesActivity():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>4)?unsealedInfo.get(4).getUnsealedSourcesTotalYear():"",
		(unsealedInfo!=null)&&(unsealedInfo.size()>4)?unsealedInfo.get(4).getUnsealedSourcesUse():"",
				
				
		//Section Four Add more second 5
		(sealedInfo!=null)&&(sealedInfo.size()>0)?sealedInfo.get(0).getSealedSourcesRadionu():"",
		(sealedInfo!=null)&&(sealedInfo.size()>0)?sealedInfo.get(0).getSealedSourcesMaxActivity():"",
		(sealedInfo!=null)&&(sealedInfo.size()>0)?dateFormat.format(sealedInfo.get(0).getSealedSourcesActivityDate()):"",
		(sealedInfo!=null)&&(sealedInfo.size()>0)?sealedInfo.get(0).getSealedSourcesCategories():"",	
		(sealedInfo!=null)&&(sealedInfo.size()>0)?sealedInfo.get(0).getSealedSourcesUse():"",
				    				
		(sealedInfo!=null)&&(sealedInfo.size()>1)?sealedInfo.get(1).getSealedSourcesRadionu():"",
		(sealedInfo!=null)&&(sealedInfo.size()>1)?sealedInfo.get(1).getSealedSourcesMaxActivity():"",
		(sealedInfo!=null)&&(sealedInfo.size()>1)?dateFormat.format(sealedInfo.get(1).getSealedSourcesActivityDate()):"",
		(sealedInfo!=null)&&(sealedInfo.size()>1)?sealedInfo.get(1).getSealedSourcesCategories():"",	
		(sealedInfo!=null)&&(sealedInfo.size()>1)?sealedInfo.get(1).getSealedSourcesUse():"",
							
		(sealedInfo!=null)&&(sealedInfo.size()>2)?sealedInfo.get(2).getSealedSourcesRadionu():"",
		(sealedInfo!=null)&&(sealedInfo.size()>2)?sealedInfo.get(2).getSealedSourcesMaxActivity():"",
		(sealedInfo!=null)&&(sealedInfo.size()>2)?dateFormat.format(sealedInfo.get(2).getSealedSourcesActivityDate()):"",
		(sealedInfo!=null)&&(sealedInfo.size()>2)?sealedInfo.get(2).getSealedSourcesCategories():"",	
		(sealedInfo!=null)&&(sealedInfo.size()>2)?sealedInfo.get(2).getSealedSourcesUse():"",
		
		(sealedInfo!=null)&&(sealedInfo.size()>3)?sealedInfo.get(3).getSealedSourcesRadionu():"",
		(sealedInfo!=null)&&(sealedInfo.size()>3)?sealedInfo.get(3).getSealedSourcesMaxActivity():"",
		(sealedInfo!=null)&&(sealedInfo.size()>3)?dateFormat.format(sealedInfo.get(3).getSealedSourcesActivityDate()):"",
		(sealedInfo!=null)&&(sealedInfo.size()>3)?sealedInfo.get(3).getSealedSourcesCategories():"",	
		(sealedInfo!=null)&&(sealedInfo.size()>3)?sealedInfo.get(3).getSealedSourcesUse():"",		
		
		(sealedInfo!=null)&&(sealedInfo.size()>4)?sealedInfo.get(4).getSealedSourcesRadionu():"",
		(sealedInfo!=null)&&(sealedInfo.size()>4)?sealedInfo.get(4).getSealedSourcesMaxActivity():"",
		(sealedInfo!=null)&&(sealedInfo.size()>4)?dateFormat.format(sealedInfo.get(4).getSealedSourcesActivityDate()):"",
		(sealedInfo!=null)&&(sealedInfo.size()>4)?sealedInfo.get(4).getSealedSourcesCategories():"",	
		(sealedInfo!=null)&&(sealedInfo.size()>4)?sealedInfo.get(4).getSealedSourcesUse():"",
				
		//Section Four Add more Third 5
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>0)?raditionDeviceInfo.get(0).getRadiationDevicesRadio():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>0)?raditionDeviceInfo.get(0).getRadiationDevicesMaxActivity():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>0)?raditionDeviceInfo.get(0).getRadiationDevicesManufacturer():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>0)?raditionDeviceInfo.get(0).getRadiationDevicesName():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>0)?raditionDeviceInfo.get(0).getRadiationDevicesModelNo():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>0)?raditionDeviceInfo.get(0).getRadiationDevicesNumber():"",	
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>0)?raditionDeviceInfo.get(0).getRadiationDevicesUse():"",
				    				
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>1)?raditionDeviceInfo.get(1).getRadiationDevicesRadio():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>1)?raditionDeviceInfo.get(1).getRadiationDevicesMaxActivity():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>1)?raditionDeviceInfo.get(1).getRadiationDevicesManufacturer():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>1)?raditionDeviceInfo.get(1).getRadiationDevicesName():"",	
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>1)?raditionDeviceInfo.get(1).getRadiationDevicesModelNo():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>1)?raditionDeviceInfo.get(1).getRadiationDevicesNumber():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>1)?raditionDeviceInfo.get(1).getRadiationDevicesUse():"",
							
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>2)?raditionDeviceInfo.get(2).getRadiationDevicesRadio():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>2)?raditionDeviceInfo.get(2).getRadiationDevicesMaxActivity():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>2)?raditionDeviceInfo.get(2).getRadiationDevicesManufacturer():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>2)?raditionDeviceInfo.get(2).getRadiationDevicesName():"",	
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>2)?raditionDeviceInfo.get(2).getRadiationDevicesModelNo():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>2)?raditionDeviceInfo.get(2).getRadiationDevicesNumber():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>2)?raditionDeviceInfo.get(2).getRadiationDevicesUse():"",
		
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>3)?raditionDeviceInfo.get(3).getRadiationDevicesRadio():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>3)?raditionDeviceInfo.get(3).getRadiationDevicesMaxActivity():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>3)?raditionDeviceInfo.get(3).getRadiationDevicesManufacturer():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>3)?raditionDeviceInfo.get(3).getRadiationDevicesName():"",	
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>3)?raditionDeviceInfo.get(3).getRadiationDevicesModelNo():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>3)?raditionDeviceInfo.get(3).getRadiationDevicesNumber():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>3)?raditionDeviceInfo.get(3).getRadiationDevicesUse():"",
		
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>4)?raditionDeviceInfo.get(4).getRadiationDevicesRadio():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>4)?raditionDeviceInfo.get(4).getRadiationDevicesMaxActivity():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>4)?raditionDeviceInfo.get(4).getRadiationDevicesManufacturer():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>4)?raditionDeviceInfo.get(4).getRadiationDevicesName():"",	
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>4)?raditionDeviceInfo.get(4).getRadiationDevicesModelNo():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>4)?raditionDeviceInfo.get(4).getRadiationDevicesNumber():"",
		(raditionDeviceInfo!=null)&&(raditionDeviceInfo.size()>4)?raditionDeviceInfo.get(4).getRadiationDevicesUse():"",
		
		
		//Section Five 1
	  Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getServicingCopy())?specificRquirements.getServicingCopy():"",
	
	    //Section Eight 2
	 Validator.isNotNull(radiationDeclaration)&&Validator.isNotNull(radiationDeclaration.getLegalOperatorName())?radiationDeclaration.getLegalOperatorName():"",
	 Validator.isNotNull(radiationDeclaration)&&Validator.isNotNull(radiationDeclaration.getOperatorTitle())?radiationDeclaration.getOperatorTitle():"",
											  
	// signature 
	signatureForServiceProvider,
					
	//date 1
	Validator.isNotNull(radiationDeclaration)&&Validator.isNotNull(radiationDeclaration.getOperatorDate())?dateFormat.format(radiationDeclaration.getOperatorDate()):"",
	    
	   //payment 1
	Validator.isNotNull(hsraAppPayment)&&Validator.isNotNull(hsraAppPayment.getPaymentMethod())?hsraAppPayment.getPaymentMethod():"",			
	

				});
					    }catch (Exception e) {
							// TODO: handle exception
						}
				
			
		
			 if (!checkPdfDownloadWithoutDocument.equals("false")) {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
			String RegistrationCertificate = "";
			String Certification = "";
			String ValidPhoto = "";
			
			
			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
				} catch (Exception e) {}
				if(title.equals("Certified Copy of Certificate of Incorporation or Certificate of Registration of Business")) {
					RegistrationCertificate = fileName;
				}else if (title.equals("Certified Copy Valid Photo Identification for Authorized Signatories")) {
					Certification = fileName;
				}else if (title.equals("Fit and Proper Declaration Form")) {
					ValidPhoto = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
				"[$BusinessIncorp$]","[$CopyPhoto$]","[$FitAndProper$]",
				
				},
				new String[] {
						RegistrationCertificate, Certification, ValidPhoto,
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









