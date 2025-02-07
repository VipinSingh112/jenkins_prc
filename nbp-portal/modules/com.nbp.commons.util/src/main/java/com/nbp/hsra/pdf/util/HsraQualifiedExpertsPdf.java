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
import com.nbp.hsra.application.service.model.HsraApplication;
import com.nbp.hsra.application.service.model.HsraApplicationPayment;
import com.nbp.hsra.application.service.model.QualityApplicantDetail;
import com.nbp.hsra.application.service.model.QualityDeclarationInfo;
import com.nbp.hsra.application.service.model.QualityEmploymentInfo;
import com.nbp.hsra.application.service.model.QualityProficiencyDetail;
import com.nbp.hsra.application.service.service.HsraApplicationLocalServiceUtil;
import com.nbp.hsra.application.service.service.HsraApplicationPaymentLocalServiceUtil;
import com.nbp.hsra.application.service.service.QualityApplicantDetailLocalServiceUtil;
import com.nbp.hsra.application.service.service.QualityDeclarationInfoLocalServiceUtil;
import com.nbp.hsra.application.service.service.QualityEmploymentInfoLocalServiceUtil;
import com.nbp.hsra.application.service.service.QualityProficiencyDetailLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class HsraQualifiedExpertsPdf {
	 public static String replaceSignatureForHsra1(long hsraApplicationId, String folderName, long groupId,
				long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
			DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
					"Signature of Quality Expert");
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
	 public static String replaceSignatureForHsra2(long hsraApplicationId, String folderName, long groupId,
				long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
			DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
					"Signature of Declaration");
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
	 
		

		
	public static String hsraQualifiedExpertsPdf(long hsraApplicationId, ThemeDisplay themeDisplay,
				String checkPdfDownloadWithoutDocument) {
			String pdfTemplate = StringPool.BLANK;
			DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
			HsraApplication hsraApplication=null;
			QualityApplicantDetail qualityApplicant = null;
			QualityEmploymentInfo employmentDetails = null;	  
			QualityDeclarationInfo qualityDeclare = null;
			QualityProficiencyDetail proficiencyDetail = null;
			HsraApplicationPayment hsraAppPayment = null;
		    
			
			//folder
			List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
			DLFolder supportingDocumentsFolder = null;
			DLFolder supportingDocumentsParentFolder = null;
			FileEntry fileEntry = null;
			
			
			  //Signatures
			String signatureForQualifiedExpert1 = null;
			String signatureForQualifiedExpert2 = null;
			
			
			try {
				hsraApplication=HsraApplicationLocalServiceUtil.getHsraApplication(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				qualityApplicant=QualityApplicantDetailLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				employmentDetails=QualityEmploymentInfoLocalServiceUtil.getHsraById(hsraApplicationId);
			}catch (Exception e) {
			}
			try {
				proficiencyDetail=QualityProficiencyDetailLocalServiceUtil.getHsraById(hsraApplicationId);		
			}catch (Exception e) {
			}
			try {
				qualityDeclare=	QualityDeclarationInfoLocalServiceUtil.getHsraById(hsraApplicationId);
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
				  signatureForQualifiedExpert1 =replaceSignatureForHsra1(hsraApplication.getHsraApplicationId(), "Signature of Quality Expert", themeDisplay.getScopeGroupId(),
					  supportingDocumentsFolder.getFolderId(),themeDisplay);
			  } catch (Exception e) {}
			  try { 
				  signatureForQualifiedExpert2 =replaceSignatureForHsra2(hsraApplication.getHsraApplicationId(), "Signature of Declaration", themeDisplay.getScopeGroupId(),
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
								"qualified-experts");
						}catch (Exception e) {
							
						}
					}
			try {
				pdfTemplate = 
						StringUtil.replace(pdfTemplate, 
				new String[] {
			
				
				//Part A :Applicant details 8
				
				"[$SurN$]","[$FirstN$]","[$Id1$]","[$Posi$]","[$TeleP$]","[$Mob$]","[$EmailSi$]","[$DatE$]",
				
				//signature 1
				
				"[$SigNatureJi$]",
				
				// Part B :Employment details
				
				"[$CompyN$]","[$Telep$]","[$AddRess$]","[$Pari$]","[$Mobji$]","[$EmaiL$]",
				
		
				// Part C : Proficiency Details
				

				"[$DiagnosticRadiology$]","[$Duration$]","[$Capacity$]",
				"[$Radiotherapy$]","[$Duration1$]","[$Capacity1$]",
				"[$NuclearMedicine$]","[$Duration2$]","[$Capacity2$]",
				"[$Dentistry$]","[$Duration3$]","[$Capacity3$]",
				"[$Veterinary$]","[$Duration4$]","[$Capacity4$]",
				"[$Testing$]","[$Duration5$]","[$Capacity5$]",
				"[$FixedGauges$]","[$Duration6$]","[$Capacity6$]",
				"[$MobileGauges$]","[$Duration7$]","[$Capacity7$]",
				"[$Research$]","[$Duration8$]","[$Capacity8$]",
				"[$XrayEquipment$]","[$Duration9$]","[$Capacity9$]",
				"[$NuclearReactor$]","[$Duration10$]","[$Capacity10$]",
				"[$OtherApplication$]","[$Duration11$]","[$Capacity11$]",
				
				//signature 1
				"[$SigNatureHi$]",
				
				//date 1
				"[$DatEi$]",
				
			  //payment 1
				"[$PayMethoD$]",
				
				},
				new String[] {
			   
    	    //Applicant details 8
			Validator.isNotNull(qualityApplicant)&&Validator.isNotNull(qualityApplicant.getExpertSurname())?qualityApplicant.getExpertSurname():"",
			Validator.isNotNull(qualityApplicant)&&Validator.isNotNull(qualityApplicant.getExpertFirstName())?qualityApplicant.getExpertFirstName():"",
			Validator.isNotNull(qualityApplicant)&&Validator.isNotNull(qualityApplicant.getExpertId())?qualityApplicant.getExpertId():"",
			Validator.isNotNull(qualityApplicant)&&Validator.isNotNull(qualityApplicant.getExpertPosition())?qualityApplicant.getExpertPosition():"",
			Validator.isNotNull(qualityApplicant)&&Validator.isNotNull(qualityApplicant.getExpertTelephone())?qualityApplicant.getExpertTelephone():"",
			Validator.isNotNull(qualityApplicant)&&Validator.isNotNull(qualityApplicant.getExpertMobile())?qualityApplicant.getExpertMobile():"",
			Validator.isNotNull(qualityApplicant)&&Validator.isNotNull(qualityApplicant.getExpertEmail())?qualityApplicant.getExpertEmail():"",
			Validator.isNotNull(qualityApplicant)&&Validator.isNotNull(qualityApplicant.getExpertDate())?dateFormat.format(qualityApplicant.getExpertDate()):"",
           
		   // signature 1
			signatureForQualifiedExpert1,
					
		   // Part B :Employment details
						
			Validator.isNotNull(employmentDetails)&&Validator.isNotNull(employmentDetails.getCompanyName())?employmentDetails.getCompanyName():"",	
			Validator.isNotNull(employmentDetails)&&Validator.isNotNull(employmentDetails.getTeleNo())?employmentDetails.getTeleNo():"",
			Validator.isNotNull(employmentDetails)&&Validator.isNotNull(employmentDetails.getAddress())?employmentDetails.getAddress():"",
			Validator.isNotNull(employmentDetails)&&Validator.isNotNull(employmentDetails.getParish())?employmentDetails.getParish():"",
			Validator.isNotNull(employmentDetails)&&Validator.isNotNull(employmentDetails.getMobileNo())?employmentDetails.getMobileNo():"",
			Validator.isNotNull(employmentDetails)&&Validator.isNotNull(employmentDetails.getEmailAddress())?employmentDetails.getEmailAddress():"",

			// Part C : Proficiency Details
			
			    
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getProficiencyDetails())?proficiencyDetail.getProficiencyDetails():"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getWorkDurationOne())?proficiencyDetail.getWorkDurationOne():"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getCapacityOne())?proficiencyDetail.getCapacityOne():"",  
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getProficiencyDetails())?(proficiencyDetail.getProficiencyDetails()):"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getWorkDurationTwo())?proficiencyDetail.getWorkDurationTwo():"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getCapacityTwo())?proficiencyDetail.getCapacityTwo():"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getProficiencyDetails())?proficiencyDetail.getProficiencyDetails():"",  
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getWorkDurationThree())?(proficiencyDetail.getWorkDurationThree()):"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getCapacityThree())?proficiencyDetail.getCapacityThree():"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getProficiencyDetails())?proficiencyDetail.getProficiencyDetails():"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getWorkDurationFour())?proficiencyDetail.getWorkDurationFour():"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getCapacityFour())?proficiencyDetail.getCapacityFour():"",  
				    
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getProficiencyDetails())?proficiencyDetail.getProficiencyDetails():"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getWorkDurationFive())?proficiencyDetail.getWorkDurationFive():"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getCapacityFive())?proficiencyDetail.getCapacityFive():"",  
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getProficiencyDetails())?(proficiencyDetail.getProficiencyDetails()):"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getWorkDurationSix())?proficiencyDetail.getWorkDurationSix():"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getCapacitySix())?proficiencyDetail.getCapacitySix():"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getProficiencyDetails())?proficiencyDetail.getProficiencyDetails():"",  
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getWorkDurationSeven())?(proficiencyDetail.getWorkDurationSeven()):"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getCapacitySeven())?proficiencyDetail.getCapacitySeven():"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getProficiencyDetails())?proficiencyDetail.getProficiencyDetails():"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getWorkDurationEight())?proficiencyDetail.getWorkDurationEight():"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getCapacityEight())?proficiencyDetail.getCapacityEight():"",  
			   
		    Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getProficiencyDetails())?proficiencyDetail.getProficiencyDetails():"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getWorkDurationNine())?proficiencyDetail.getWorkDurationNine():"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getCapacityNine())?proficiencyDetail.getCapacityNine():"",  
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getProficiencyDetails())?(proficiencyDetail.getProficiencyDetails()):"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getWorkDurationTen())?proficiencyDetail.getWorkDurationTen():"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getCapacityTen())?proficiencyDetail.getCapacityTen():"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getProficiencyDetails())?proficiencyDetail.getProficiencyDetails():"",  
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getWorkDurationEleven())?(proficiencyDetail.getWorkDurationEleven()):"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getCapacityEleven())?proficiencyDetail.getCapacityEleven():"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getProficiencyDetails())?proficiencyDetail.getProficiencyDetails():"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getWorkDurationTwelve())?proficiencyDetail.getWorkDurationTwelve():"",
			Validator.isNotNull(proficiencyDetail)&&Validator.isNotNull(proficiencyDetail.getCapacityTwelve())?proficiencyDetail.getCapacityTwelve():"",  
			   
			 // signature 1
			signatureForQualifiedExpert2,
					
		    //date 1
		    Validator.isNotNull(qualityDeclare)&&Validator.isNotNull(qualityDeclare.getDeclarationSignDate())?dateFormat.format(qualityDeclare.getDeclarationSignDate()):"",
		    
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
				if(title.equals("Curriculum Vitae")) {
					RegistrationCertificate = fileName;
				}else if (title.equals("Relevant qualifications/ certification")) {
					Certification = fileName;
				}else if (title.equals("Valid Government issued ID")) {
					ValidPhoto = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
				"[$CurriculumVi$]","[$RelevantCerti$]","[$ValidGov$]",
				
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






