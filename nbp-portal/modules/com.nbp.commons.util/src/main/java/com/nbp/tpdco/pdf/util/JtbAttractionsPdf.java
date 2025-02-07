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
import com.nbp.jtb.application.form.service.model.AttractDetailFormInfo;
import com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo;
import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.model.JTBPaymentMethod;
import com.nbp.jtb.application.form.service.model.JtbAddCraftApplicantInfo;
import com.nbp.jtb.application.form.service.service.AttractDetailFormInfoLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractionGenDeclareInfoLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBPaymentMethodLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JtbAddCraftApplicantInfoLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class JtbAttractionsPdf {
	public static String replaceSignatureForApplicant(long jtbApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Attraction Signature of Applicant");
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


public static String getJtbAccomodationAttractionPdf(long jtbApplicationId, ThemeDisplay themeDisplay, String checkPdfDownloadWithoutDocument) {
String pdfTemplate = StringPool.BLANK;
DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
JTBApplication jtbApplication=null;
AttractDetailFormInfo attractApplicant=null;
AttractionGenDeclareInfo attractiongenDec=null;
List<JtbAddCraftApplicantInfo> operatinManager=null;
JTBPaymentMethod jtbPayment=null;


//folder
List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
DLFolder supportingDocumentsFolder = null;
DLFolder supportingDocumentsParentFolder = null;
FileEntry fileEntry = null;
//Signatures
String signatureOfApplicant = null;

try {
	jtbApplication = JTBApplicationLocalServiceUtil.getJTBApplication(jtbApplicationId);
}catch (Exception e) {
}
try{
	attractApplicant= AttractDetailFormInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
}catch(Exception e){}
try{
	attractiongenDec= AttractionGenDeclareInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
}catch(Exception e){}
try{
	operatinManager= JtbAddCraftApplicantInfoLocalServiceUtil.getByJtbAppId(jtbApplicationId);
}catch(Exception e){}
try{
	jtbPayment= JTBPaymentMethodLocalServiceUtil.getJTBById(jtbApplicationId);
}catch(Exception e){}


try {
	supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "JTB Supported Documents");
	supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingDocumentsParentFolder.getFolderId(), String.valueOf(jtbApplication.getJtbApplicationId()));
	supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
			supportingDocumentsFolder.getFolderId());
} catch (Exception e) {
	e.printStackTrace();
}
//signatures
 
  try { 
	  signatureOfApplicant =replaceSignatureForApplicant
			  (attractApplicant.getJtbApplicationId(), "Attraction Signature of Applicant", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
  } catch (Exception e) {}
  

//pdf go in launch case
		if (checkPdfDownloadWithoutDocument.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
					"attraction-1");
		} else {
			try {
			pdfTemplate = getTemplateFromJournalArticlePDF
					(themeDisplay.getScopeGroupId(),
					"attraction");
			}catch (Exception e) {
				
			}
		}
try {
	pdfTemplate = StringUtil.replace(pdfTemplate, 
	new String[] {
	//Hotel Licence
			/* "[$AttractionType$]", */"[$OwnerNameAttr$]","[$MailingAddress$]","[$EmployNum$]","[$AttractionParish$]",
 
			"[$ManagerName1$]", "[$Location1$]", "[$EmailAddress1$]", "[$Telephone1$]",
			"[$ManagerName2$]", "[$Location2$]", "[$EmailAddress2$]", "[$Telephone2$]",
			"[$ManagerName3$]", "[$Location3$]", "[$EmailAddress3$]", "[$Telephone3$]",
			"[$ManagerName4$]", "[$Location4$]", "[$EmailAddress4$]", "[$Telephone4$]",
			"[$ManagerName5$]", "[$Location5$]", "[$EmailAddress5$]", "[$Telephone5$]",
			
			"[$AttractionOwnerName$]", "[$AttractionLaws$]", "[$AttractionDate$]", "[$AttractionName$]", "[$OperatingSinceDate$]",
			"[$AcresLand$]", "[$FollowingActivities$]", "[$DateAttraction$]", "[$SignAttraction$]",
					/* */
	},
	new String[] {
	//Applicant details
				Validator.isNotNull(attractApplicant)&&Validator.isNotNull(attractApplicant.getNewAttractionsOwnerName())?attractApplicant.getNewAttractionsOwnerName():"" ,
				Validator.isNotNull(attractApplicant)&&Validator.isNotNull(attractApplicant.getNewAttractionsMailing())?attractApplicant.getNewAttractionsMailing():"",
				Validator.isNotNull(attractApplicant)&&Validator.isNotNull(attractApplicant.getNewAttractionsEmpNum())?attractApplicant.getNewAttractionsEmpNum():"",
				Validator.isNotNull(attractApplicant)&&Validator.isNotNull(attractApplicant.getNewAttractionsParish())?attractApplicant.getNewAttractionsParish():"",
				
				(operatinManager!=null)&&(operatinManager.size()>0)?operatinManager.get(0).getOwnerName():"",
				(operatinManager!=null)&&(operatinManager.size()>0)?operatinManager.get(0).getOwnerAddress():"",
				(operatinManager!=null)&&(operatinManager.size()>0)?operatinManager.get(0).getOperatingEmail():"",
				(operatinManager!=null)&&(operatinManager.size()>0)?operatinManager.get(0).getOwnerPhoneNo():"",
				
						
				(operatinManager!=null)&&(operatinManager.size()>1)?operatinManager.get(1).getOwnerName():"",
				(operatinManager!=null)&&(operatinManager.size()>1)?operatinManager.get(1).getOwnerAddress():"",
				(operatinManager!=null)&&(operatinManager.size()>1)?operatinManager.get(1).getOperatingEmail():"",
				(operatinManager!=null)&&(operatinManager.size()>1)?operatinManager.get(1).getOwnerPhoneNo():"",
				
				
				(operatinManager!=null)&&(operatinManager.size()>2)?operatinManager.get(2).getOwnerName():"",
				(operatinManager!=null)&&(operatinManager.size()>2)?operatinManager.get(2).getOwnerAddress():"",
				(operatinManager!=null)&&(operatinManager.size()>2)?operatinManager.get(2).getOperatingEmail():"",
				(operatinManager!=null)&&(operatinManager.size()>2)?operatinManager.get(2).getOwnerPhoneNo():"",
				
																						
				(operatinManager!=null)&&(operatinManager.size()>3)?operatinManager.get(3).getOwnerName():"",
				(operatinManager!=null)&&(operatinManager.size()>3)?operatinManager.get(3).getOwnerAddress():"",
				(operatinManager!=null)&&(operatinManager.size()>3)?operatinManager.get(3).getOperatingEmail():"",
				(operatinManager!=null)&&(operatinManager.size()>3)?operatinManager.get(3).getOwnerPhoneNo():"",
				
				
				(operatinManager!=null)&&(operatinManager.size()>4)?operatinManager.get(4).getOwnerName():"",
				(operatinManager!=null)&&(operatinManager.size()>4)?operatinManager.get(4).getOwnerAddress():"",
				(operatinManager!=null)&&(operatinManager.size()>4)?operatinManager.get(4).getOperatingEmail():"",
				(operatinManager!=null)&&(operatinManager.size()>4)?operatinManager.get(4).getOwnerPhoneNo():"",
				
				Validator.isNotNull(attractiongenDec)&&Validator.isNotNull(attractiongenDec.getNewAttractionsGenOwnerName())?attractiongenDec.getNewAttractionsGenOwnerName():"",
				Validator.isNotNull(attractiongenDec)&&Validator.isNotNull(attractiongenDec.getNewAttractionsCompanyLaw())?attractiongenDec.getNewAttractionsCompanyLaw():"",
				Validator.isNotNull(attractiongenDec)&&Validator.isNotNull(attractiongenDec.getNewAttractionsDate())?dateFormat.format(attractiongenDec.getNewAttractionsDate()):"",		
				Validator.isNotNull(attractiongenDec)&&Validator.isNotNull(attractiongenDec.getNewAttractionsName())?attractiongenDec.getNewAttractionsName():"" ,
				Validator.isNotNull(attractiongenDec)&&Validator.isNotNull(attractiongenDec.getNewAttractionsStartDate())?dateFormat.format(attractiongenDec.getNewAttractionsStartDate()):"",
				Validator.isNotNull(attractiongenDec)&&Validator.isNotNull(attractiongenDec.getNewAttractionsSituatedLand())?attractiongenDec.getNewAttractionsSituatedLand():"",
				Validator.isNotNull(attractiongenDec)&&Validator.isNotNull(attractiongenDec.getNewAttractionsActivities())?attractiongenDec.getNewAttractionsActivities():"",
				
				Validator.isNotNull(attractiongenDec)&&Validator.isNotNull(attractiongenDec.getAttractionNewDate())?dateFormat.format(attractiongenDec.getAttractionNewDate()):"",
				signatureOfApplicant,
				//
						
		});
		    }catch (Exception e) {
				// TODO: handle exception
			}
	
	if (!checkPdfDownloadWithoutDocument.equals("false")) {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
				String attractTax = "";
				String attractionInsurance = "";
				String attractionDirectorsList = "";
				String attractionIncorporation = "";
				String differentCompany = "";
				String standingLetter = "";
				String foodHandeler = "";
				String certificateAttra = "";
				String poolPermit = "";
				String fireCertificateAttraction = "";
				String planningLocal = "";
				String ownershipLand = "";
				String surveyorsId = "";
				String agrementLease = "";
				String writtenNepa = "";
				String riverPermission = "";
				String jamaicaHeritage = "";
				String printedLists = "";
				String maintenanceStaff = "";
				String veterinaryAttr = "";
				String tourGuide = "";
				String attractionFitness = "";
				String attractionEmploye = "";
				String attractionSecurity = "";
				String tourismApproval = "";
				String permitAttraction = "";
				String beachLicence = "";
				String landTenure="";
				String jamaicaList="";
				String coastalMaster="";
				String paintBall="";
				String fleetList="";
				String listEvent="";
				String waterMaritime="";
				String waterFish="";
				String waterFirstAid="";
				String divingLic="";
				String lifeGuard="";
				String waterCoxwin="";
				
				
			
			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
				} catch (Exception e) {}
				if (title.equals("Copy of Tax Registration Number (TRN)")) {
				    attractTax = fileName;
				} else if (title.equals("Copy of Public Liability Insurance")) {
				    attractionInsurance = fileName;
				} else if (title.equals("List of Directors")) {
				    attractionDirectorsList = fileName;
				} else if (title.equals("Copy of Certificate of Incorporation")) {
				    attractionIncorporation = fileName;
				} else if (title.equals("Copy of Registration of Business Name (where applicable i.e. if Business Name is different from the name of the Company)")) {
				    differentCompany = fileName;
				} else if (title.equals("Letter of “Good Standing” – Companies Office of Jamaica")) {
				    standingLetter = fileName;
				} else if (title.equals("Copy of Food Handler’s Permits (where applicable)")) {
				    foodHandeler = fileName;
				} else if (title.equals("Copy of Public Health Food Establishment Certificate (where applicable)")) {
					certificateAttra = fileName;
				} else if (title.equals("Copy of Public Health Swimming Pool Permit (where applicable)")) {
				    poolPermit = fileName;
				} else if (title.equals("Copy of Fire Certificate")) {
				    fireCertificateAttraction = fileName;
				} else if (title.equals("Approval from local planning authority (Parish Council e.g. KSAC/ St. James Parish Council)")) {
				    planningLocal = fileName;
				} else if (title.equals("Proof of Ownership (Copy of Land Title)")) {
				    ownershipLand = fileName;
				} else if (title.equals("Surveyors ID")) {
				    surveyorsId = fileName;
				} else if (title.equals("Certified Lease or Rental Agreement (where Applicable)")) {
				    agrementLease = fileName;
				} else if (title.equals("Written approval from NEPA")) {
				    writtenNepa = fileName;
				} else if (title.equals("Permission from River Rafting Authority to Operate on River (where applicable)")) {
				    riverPermission = fileName;
				} else if (title.equals("Written approval from the Jamaica National Heritage Trust as a Heritage site (where applicable)")) {
				    jamaicaHeritage = fileName;
				} else if (title.equals("Printed brochures")) {
				    printedLists = fileName;
				} else if (title.equals("Management plans regarding maintenance disaster preparedness and safety measures in place and to include health safety & Environmental rules and regulations; training of staff")) {
				    maintenanceStaff = fileName;
				} else if (title.equals("Letter or Certificate from Government Veterinary (where applicable)")) {
					veterinaryAttr = fileName;
				} else if (title.equals("Copy of TPDCo Certification of Tour Guides")) {
				    tourGuide = fileName;
				} else if (title.equals("Fitness Certificate for motorized transportation used for the touring of property (where applicable)")) {
				    attractionFitness = fileName;
				} else if (title.equals("List of employees (with job titles)")) {
					attractionEmploye = fileName;
				} else if (title.equals("Proper Security Arrangements (Certified Personnel)")) {
					attractionSecurity = fileName;
				} else if (title.equals("Security Approval From Police Tourism Liaison Section")) {
				    tourismApproval = fileName;
				} else if (title.equals("Copy of Beach Licence from NEPA (where applicable)")) {
					beachLicence = fileName;
				} else if (title.equals("Copy of Work Permit (where applicable)")) {
				    permitAttraction = fileName;
				}else if (title.equals("Proof of Land Tenure")) {
					landTenure = fileName;
				}else if (title.equals("Team Jamaica Certification (list)")) {
					jamaicaList = fileName;
				}else if (title.equals("Coastal Master Licence (where applicable)")) {
					coastalMaster = fileName;
				}else if (title.equals("Paint Ball - Written Approval From Ministry Of National Security")) {
					paintBall = fileName;
				}else if (title.equals("Fleet Listing")) {
					fleetList = fileName;
				}else if (title.equals("List Of Events /Activities")) {
					listEvent = fileName;
				}else if (title.equals("COPY OF MARITIME AUTHORITY SAFETY CERTIFICATE FOR EACH VESSEL (where applicable)")) {
					waterMaritime = fileName;
				}else if (title.equals("COPY OF FISHERIES LICENCE (FOR VESSEL(S) AND EMPLOYEES)")) {
					waterFish = fileName;
				}else if (title.equals("COPY OF FIRST AID AND CPR CERTIFICATE FROM ROYAL LIFE SAVING SOCIETY")) {
					waterFirstAid = fileName;
				}else if (title.equals("DIVING CERTIFICATE")) {
					divingLic = fileName;
				}else if (title.equals("LIFEGUARD LICENCE FROM NEPA")) {
					lifeGuard = fileName;
				}else if (title.equals("COXSWAIN LICENCE FROM MARITIME AUTORITY OF JAMAICA")) {
					waterCoxwin = fileName;
				}

			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
					"[$NumberTax$]", "[$InsuranceAttra$]", "[$DirectorsListAttraction$]", "[$IncorporationAttraction$]",
					"[$DifferentCompany$]", "[$StandingLetter$]", "[$FoodHandeler$]", "[$CertificateAttra$]" ,"[$PoolPermit$]",
					"[$FireCertificateAttraction$]", "[$PlanningLocal$]", "[$OwnershipLand$]", "[$SurveyorsId$]",
					"[$AgrementLease$]", "[$WrittenNepa$]", "[$RiverPermission$]", "[$JamaicaHeritage$]", "[$PrintedLists$]",
					"[$MaintenanceStaff$]","[$VeterinaryAttr$]" ,"[$TourGuide$]", "[$AttractionFitness$]", "[$AttractionEmploye$]",
					"[$AttractionSecurity$]", "[$TourismApproval$]",
					"[$PermitAttraction$]","[$BeachLicence$]", "[$ProofTenure$]", "[$JamaicaLis$]", "[$Master$]", "[$BallLic$]", "[$FleetLic$]", "[$ListActivity$]",
					"[$MaritimeLic$]","[$FishLic$]","[$FirstAidLic$]","[$DivingCerti$]","[$LifeGuardLic$]","[$CoxwinCerti$]", "[$PaymentAttraction$]",

				},
				new String[] {
						 attractTax,attractionInsurance,attractionDirectorsList,
						 attractionIncorporation, differentCompany,
						 standingLetter, foodHandeler,certificateAttra,
						 poolPermit,fireCertificateAttraction,
						 planningLocal,ownershipLand,
						 surveyorsId,agrementLease,
						 writtenNepa,riverPermission,
						 jamaicaHeritage,printedLists,
						 maintenanceStaff,veterinaryAttr ,tourGuide,attractionFitness,attractionEmploye,attractionSecurity,
						 tourismApproval,permitAttraction,beachLicence,landTenure,jamaicaList,coastalMaster,paintBall,fleetList,listEvent,
						 waterMaritime,waterFish,waterFirstAid,divingLic,lifeGuard,waterCoxwin,
						 Validator.isNotNull(jtbPayment)&&Validator.isNotNull(jtbPayment.getPaymentMethod())?jtbPayment.getPaymentMethod():"",
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
