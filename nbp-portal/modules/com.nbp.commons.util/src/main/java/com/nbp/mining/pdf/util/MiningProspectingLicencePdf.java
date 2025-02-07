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
import com.nbp.mining.lease.application.service.model.MiningProspectingLicense;
import com.nbp.mining.lease.application.service.model.MiningProspectingLicenseAdd;
import com.nbp.mining.lease.application.service.service.MiningAppPaymentLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningFormFiveDelineationLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningLeaseApplicationLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningProspectingLicenseAddLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningProspectingLicenseLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MiningProspectingLicencePdf {
	public static String replaceSignatureForMining(long miningApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Licence Signature of Applicant");
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

	
public static String miningProspectingLicencePdf(long miningApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		MiningLeaseApplication miningApplication=null;
		MiningProspectingLicense miningProspLicence = null;
		MiningAppPayment paymentMethod=null;
		MiningFormFiveDelineation miningFormFiveDelineation=null;
		List<MiningProspectingLicenseAdd> miningProspectingLicenseAdd=null;
		
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		
		  //Signatures 
		String signatureForProspectingLicenceApp = null;
		 
		
		try {
			miningProspLicence=MiningProspectingLicenseLocalServiceUtil.getMinningById(miningApplicationId);
		}catch (Exception e) {
		}
		try {
			miningApplication= MiningLeaseApplicationLocalServiceUtil.getMiningLeaseApplication(miningApplicationId);
		}catch (Exception e) {
		}
		try {
			miningFormFiveDelineation= MiningFormFiveDelineationLocalServiceUtil.getMiningById(miningApplicationId);
		}catch (Exception e) {
		}
		try {
			miningProspectingLicenseAdd= MiningProspectingLicenseAddLocalServiceUtil.getMinningById(miningApplicationId);
		}catch (Exception e) {
		}
		try {
			paymentMethod= MiningAppPaymentLocalServiceUtil.getMiningById(miningApplicationId);
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
			  signatureForProspectingLicenceApp =replaceSignatureForMining(miningApplication.getMiningLeaseApplicationId(), "Licence Signature of Applicant", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}
		 
		
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"prospecting-licence-1");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"prospecting-licence");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = 
					StringUtil.replace(pdfTemplate, 
			new String[] {
			//Applicant details 3
			"[$NameLic$]","[$TrnLic$]","[$LicenceNationality$]",
			
			
			//Director Detail 5
			"[$CompanyDirectors1$]","[$Nationality1$]","[$Partnership1$]",
			"[$CompanyDirectors2$]","[$Nationality2$]","[$Partnership2$]",
			"[$CompanyDirectors3$]","[$Nationality3$]","[$Partnership3$]",
			"[$CompanyDirectors4$]","[$Nationality4$]","[$Partnership4$]",
			"[$CompanyDirectors5$]","[$Nationality5$]","[$Partnership5$]",
			
			
			// 4
			"[$LicenceNotices$]","[$TelephoneLic$]","[$LicEmail$]","[$ProspectingNum$]",
			
			//Agent as Individual 10

			"[$AgentName$]","[$LicRightNum$]","[$GrantSpecialAgent$]","[$AgentLicence$]","[$LicParish$]","[$StateLandMark$]","[$ApproximateArea$]","[$DesiresProspect$]",
			"[$ArticlesIncorporation$]","[$Location$]",
			
			//Delineation of Area 31
			
			"[$SquareKilo$]","[$LocationFirst$]","[$Coordinates$]","[$NorthFirst$]","[$EastFirst$]","[$CornerFirst$]","[$NorthSec$]","[$EastSec$]","[$LocationSec$]",
			"[$CornerThird$]","[$NorthThird$]","[$EastThird$]","[$GridThird$]","[$CornerFour$]","[$NorthFour$]","[$EastFour$]","[$GridFour$]","[$DegreesFour$]","[$LocationFour$]",
			"[$CornerFive$]","[$NorthFive$]","[$EastFive$]","[$GridFive$]","[$DegreesFive$]","[$LocationFive$]","[$CornerSix$]","[$NorthSix$]","[$EastSix$]","[$GridSix$]","[$DegreesSix$]","[$LocationSix$]",
			
			

			
			//signature 2
			"[$LicenceProSign$]",
			"[$PaymentMethodLicence$]",
			
			},
			new String[] {
    		//Applicant details 3
    		Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getNameOfApplicant())?miningProspLicence.getNameOfApplicant():"",
			Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getTrnNumber())?miningProspLicence.getTrnNumber():"",
			Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getNationalityOfApplicant())?miningProspLicence.getNationalityOfApplicant():"",
					
			//add more 5	
		    (miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>0)?miningProspectingLicenseAdd.get(0).getName():"",
		    (miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>0)?miningProspectingLicenseAdd.get(0).getNationality():"",
		    (miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>0)?miningProspectingLicenseAdd.get(0).getDirectorsOfCompany():"",
		    		
			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>1)?miningProspectingLicenseAdd.get(1).getName():"",
			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>1)?miningProspectingLicenseAdd.get(1).getNationality():"",
			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>1)?miningProspectingLicenseAdd.get(1).getDirectorsOfCompany():"",
								
			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>2)?miningProspectingLicenseAdd.get(2).getName():"",
			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>2)?miningProspectingLicenseAdd.get(2).getNationality():"",
			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>2)?miningProspectingLicenseAdd.get(2).getDirectorsOfCompany():"",
			
			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>3)?miningProspectingLicenseAdd.get(3).getName():"",
			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>3)?miningProspectingLicenseAdd.get(3).getNationality():"",
			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>3)?miningProspectingLicenseAdd.get(3).getDirectorsOfCompany():"",
					

			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>4)?miningProspectingLicenseAdd.get(4).getName():"",
			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>4)?miningProspectingLicenseAdd.get(4).getNationality():"",
			(miningProspectingLicenseAdd!=null)&&(miningProspectingLicenseAdd.size()>4)?miningProspectingLicenseAdd.get(4).getDirectorsOfCompany():"",
   

	  //14				
					//4
			Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getAddressInJamaica())?miningProspLicence.getAddressInJamaica():"",
			Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getTelephoneNumber())?miningProspLicence.getTelephoneNumber():"",
			Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getEmailAddress())?miningProspLicence.getEmailAddress():"",
			Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getNumberOfApplicant())?miningProspLicence.getNumberOfApplicant():"",
				//10
			Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getNameOfTheAgent())?miningProspLicence.getNameOfTheAgent():"",
			Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getNumberOfThisProspecting())?miningProspLicence.getNumberOfThisProspecting():"",
			Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getProspectingRight())?miningProspLicence.getProspectingRight():"",
			Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getParish())?miningProspLicence.getParish():"",
			Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getLicence())?miningProspLicence.getLicence():"",
			Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getStateTheNearestLandmark())?miningProspLicence.getStateTheNearestLandmark():"",
			Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getApproximateArea())?miningProspLicence.getApproximateArea():"",
			Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getMineralForWhichApplicant())?miningProspLicence.getMineralForWhichApplicant():"",
		    Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getCopyOfArticle())?miningProspLicence.getCopyOfArticle():"",  
		    Validator.isNotNull(miningProspLicence)&&Validator.isNotNull(miningProspLicence.getDateUponTheLocation())?dateFormat.format(miningProspLicence.getDateUponTheLocation()):"",
		    
     	   // delineation 31
					
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
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getThirdGridL())?miningFormFiveDelineation.getThirdGridL():"",				   
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getThirdDegrees())?miningFormFiveDelineation.getThirdEastSide():"",
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getThirdGridLoc())?miningFormFiveDelineation.getThirdGridLoc():"",
		    		
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getFourthCoordinates())?miningFormFiveDelineation.getFourthCoordinates():"",
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getFourthNorthSide())?miningFormFiveDelineation.getFourthNorthSide():"",
/*6*/		Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getFourthEastSide())?miningFormFiveDelineation.getFourthEastSide():"",
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getFourthGridL())?miningFormFiveDelineation.getFourthGridL():"",				   
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getFourthDegrees())?miningFormFiveDelineation.getFourthDegrees():"",
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getFourthGridLoc())?miningFormFiveDelineation.getFourthGridLoc():"",
		    		
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getFifthCoordinates())?miningFormFiveDelineation.getFifthCoordinates():"",
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getFifthNorthSide())?miningFormFiveDelineation.getFifthNorthSide():"",
/*6*/       Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getFifthEastSide())?miningFormFiveDelineation.getFifthEastSide():"",
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getFifthGridL())?miningFormFiveDelineation.getFifthGridL():"",				   
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getFifthDegrees())?miningFormFiveDelineation.getFifthDegrees():"",
		    Validator.isNotNull(miningFormFiveDelineation)&&Validator.isNotNull(miningFormFiveDelineation.getFifthGridLoc())?miningFormFiveDelineation.getFifthGridLoc():"",
		    		    				   		
			//signature Detail 2
		   signatureForProspectingLicenceApp,	
		    Validator.isNotNull(paymentMethod)&&Validator.isNotNull(paymentMethod.getPaymentMethod())?paymentMethod.getPaymentMethod():"",			
					
			});
				    }catch (Exception e) {
						// TODO: handle exception
					}
			
		
	
		 if (!checkPdfDownloadWithoutDocument.equals("false")) {
		String title = "";
		String fileName = "";
		if (Validator.isNotNull(supportingDocumentsFolder)) {
		String RightCertificate = "";
		String LocationMap = "";
		String FinancialStatement = "";
		String ArticalIncorporation = "";
		String SketchPlan = "";
		
		
		
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			try {
				fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
				fileName = fileEntry.getFileName();
				title=fileEntry.getTitle();
			} catch (Exception e) {}
			if(title.equals("Prospecting Right Certification")) {
				RightCertificate = fileName;
			}else if (title.equals("Location map (1:50000 scale) – 3 Copies")) {
				LocationMap = fileName;
			}else if (title.equals("Financial Statement")) {
				FinancialStatement = fileName;
			}else if (title.equals("Articles of Incorporation")) {
				ArticalIncorporation = fileName;
			}else if (title.equals("A Sketch Plan (Detailing financing of planned operations)")) {
				SketchPlan = fileName;
			}
		}
		
		pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
			"[$CertificateLicence$]","[$LocationCopies$]","[$FinancialStatementLicence$]","[$IncorporationArticlesLic$]","[$SketchPlanLic$]",
			
			},
			new String[] {
					RightCertificate, LocationMap, FinancialStatement,ArticalIncorporation,SketchPlan,
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



