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
import com.nbp.hsra.application.service.model.BrokerDeclarationInfo;
import com.nbp.hsra.application.service.model.BrokerRegistrationInfo;
import com.nbp.hsra.application.service.model.HsraApplication;
import com.nbp.hsra.application.service.model.HsraApplicationPayment;
import com.nbp.hsra.application.service.service.BrokerDeclarationInfoLocalServiceUtil;
import com.nbp.hsra.application.service.service.BrokerRegistrationInfoLocalServiceUtil;
import com.nbp.hsra.application.service.service.HsraApplicationLocalServiceUtil;
import com.nbp.hsra.application.service.service.HsraApplicationPaymentLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class HsraBrokerPdf {
	
	public static String replaceSignatureForHsra(long hsraApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Broker");
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
	

	
public static String hraBrokerPdf(long hsraApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		HsraApplication hsraApplication=null;
		BrokerRegistrationInfo brokerRegst = null;
		BrokerDeclarationInfo brokerDeclare = null;
		HsraApplicationPayment hsraAppPayment = null;
	    
		
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		
		
		  //Signatures
		String signatureForBroker = null;
		 
		
		try {
			brokerRegst=BrokerRegistrationInfoLocalServiceUtil.getHsraById(hsraApplicationId);
		}catch (Exception e) {
		}
		try {
			hsraApplication=HsraApplicationLocalServiceUtil.getHsraApplication(hsraApplicationId);
		}catch (Exception e) {
		}
		try {
			brokerDeclare=BrokerDeclarationInfoLocalServiceUtil.getHsraById(hsraApplicationId);
		}catch(Exception e) {
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
			  signatureForBroker =replaceSignatureForHsra(hsraApplication.getHsraApplicationId(), "Signature of Broker", themeDisplay.getScopeGroupId(),
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
							"brokers");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = 
					StringUtil.replace(pdfTemplate, 
			new String[] {
			//Type Of Application 1
					
			"[$AppType$]",
			
			//Applicant details 6
			
			"[$NameOrganization$]","[$PrincipalBusi$]","[$OrganiT$]","[$Tele$]","[$FaxNum$]","[$AddEmail$]",
			
			//Type Of Business 1
			
			"[$TypeOf$]",
			
			//Proof of Legal Status 3
			
			"[$BusinessNum$]","[$CoropNum$]","[$PublicSpecify$]",
			
			//License Customs Brokers Information 2
			
			"[$NumLicense$]","[$ExpiDate$]",
			
			//Does the applicant understand the meaning of the following terms 9
			

			"[$RadioMate$]","[$MaterialNu$]","[$TechNuclear$]","[$IonizingApp$]","[$RadioSource$]","[$SourceUse$]",
			"[$ProtectionAct$]","[$StorageDetails$]","[$AdditionalInfo$]",
			
			
			//Declaration 2
			
			"[$LegalOp$]","[$TitlE$]",
			
			
			//signature 1
			"[$SigNatureMi$]",
			
			//date 1
			"[$DaTe$]",
			
			
		  //payment 1
			"[$Pay$]",
			
			},
			new String[] {
		    //Type Of Application 1
    		Validator.isNotNull(hsraApplication)&&Validator.isNotNull(hsraApplication.getBrokerTransactionType())?hsraApplication.getBrokerTransactionType():"",
    			
    	    //Applicant details 6
			Validator.isNotNull(brokerRegst)&&Validator.isNotNull(brokerRegst.getOrganizationNameD())?brokerRegst.getOrganizationNameD():"",
			Validator.isNotNull(brokerRegst)&&Validator.isNotNull(brokerRegst.getBusinessPlace())?brokerRegst.getBusinessPlace():"",
			Validator.isNotNull(brokerRegst)&&Validator.isNotNull(brokerRegst.getOrganizationTrn())?brokerRegst.getOrganizationTrn():"",
			Validator.isNotNull(brokerRegst)&&Validator.isNotNull(brokerRegst.getOrganizationTeleNum())?brokerRegst.getOrganizationTeleNum():"",
			Validator.isNotNull(brokerRegst)&&Validator.isNotNull(brokerRegst.getOrganizationFaxNum())?brokerRegst.getOrganizationFaxNum():"",
			Validator.isNotNull(brokerRegst)&&Validator.isNotNull(brokerRegst.getOrganizationEmailAdd())?brokerRegst.getOrganizationEmailAdd():"",
				
			//Type Of Business 1
			Validator.isNotNull(brokerRegst)&&Validator.isNotNull(brokerRegst.getBusinessTypeBroker())?brokerRegst.getBusinessTypeBroker():"",
					
			//Proof of Legal Status 3		
			Validator.isNotNull(brokerRegst)&&Validator.isNotNull(brokerRegst.getBusinessNumberBroker())?brokerRegst.getBusinessNumberBroker():"",
			Validator.isNotNull(brokerRegst)&&Validator.isNotNull(brokerRegst.getCorporationNumberBroker())?brokerRegst.getCorporationNumberBroker():"",
			Validator.isNotNull(brokerRegst)&&Validator.isNotNull(brokerRegst.getPublicActBroker())?brokerRegst.getPublicActBroker():"",
					
		    //License Customs Brokers Information 2
		    Validator.isNotNull(brokerRegst)&&Validator.isNotNull(brokerRegst.getLicenceNumberBroker())?brokerRegst.getLicenceNumberBroker():"",
		    Validator.isNotNull(brokerRegst)&&Validator.isNotNull(brokerRegst.getExpirationDateBroker())?dateFormat.format(brokerRegst.getExpirationDateBroker()):"",
					
		    //Does the applicant understand the meaning of the following terms 9
			Validator.isNotNull(brokerRegst)&&Validator.isNotNull(brokerRegst.getRadioactiveMaterial())?brokerRegst.getRadioactiveMaterial():"",
			Validator.isNotNull(brokerRegst)&&Validator.isNotNull(brokerRegst.getNuclearMaterial())?brokerRegst.getNuclearMaterial():"",
			Validator.isNotNull(brokerRegst)&&Validator.isNotNull(brokerRegst.getNuclearTechnology())?brokerRegst.getNuclearTechnology():"",  
			Validator.isNotNull(brokerRegst)&&Validator.isNotNull(brokerRegst.getIonizingApparatus())?(brokerRegst.getIonizingApparatus()):"",
			Validator.isNotNull(brokerRegst)&&Validator.isNotNull(brokerRegst.getRadiationSource())?brokerRegst.getRadiationSource():"",
			Validator.isNotNull(brokerRegst)&&Validator.isNotNull(brokerRegst.getOrganizationTransfer())?brokerRegst.getOrganizationTransfer():"",
			Validator.isNotNull(brokerRegst)&&Validator.isNotNull(brokerRegst.getNuclearProtection())?brokerRegst.getNuclearProtection():"",  
			Validator.isNotNull(brokerRegst)&&Validator.isNotNull(brokerRegst.getStorageFacility())?(brokerRegst.getStorageFacility()):"",
			Validator.isNotNull(brokerRegst)&&Validator.isNotNull(brokerRegst.getAdditionalInformation())?brokerRegst.getAdditionalInformation():"",
			
			//Declaration 2
			Validator.isNotNull(brokerDeclare)&&Validator.isNotNull(brokerDeclare.getBrokerOperatorName())?brokerDeclare.getBrokerOperatorName():"",
			Validator.isNotNull(brokerDeclare)&&Validator.isNotNull(brokerDeclare.getBrokerTitle())?brokerDeclare.getBrokerTitle():"",

			//signature Detail 1
		    signatureForBroker,
		    
		    //date 1
		    Validator.isNotNull(brokerDeclare)&&Validator.isNotNull(brokerDeclare.getSignDate())?dateFormat.format(brokerDeclare.getSignDate()):"",
		    
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
				ValidPhoto = fileName;
			}
		}
		
		pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
			"[$BusinessIncorp$]","[$CopyPhoto$]",
			
			},
			new String[] {
					RegistrationCertificate, ValidPhoto,
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
