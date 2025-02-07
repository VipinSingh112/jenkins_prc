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
import com.nbp.jtb.application.form.service.model.AttractionWaterGenDeclare;
import com.nbp.jtb.application.form.service.model.AttractionWaterRequired;
import com.nbp.jtb.application.form.service.model.AttractionWaterSport;
import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.model.JTBPaymentMethod;
import com.nbp.jtb.application.form.service.service.AttractionWaterGenDeclareLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractionWaterRequiredLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractionWaterSportLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBPaymentMethodLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class JtbOtherWaterSportsOperatorPdf {
	public static String replaceSignatureOfOwner(long jtbApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Watersports Signature of Owner");
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
	public static String replaceSignatureOfManager(long jtbApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Watersports Signature of Manager");
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


public static String getJtbOtherWaterSportOperatorPdf(long jtbApplicationId, ThemeDisplay themeDisplay, String checkPdfDownloadWithoutDocument) {
String pdfTemplate = StringPool.BLANK;
DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
JTBApplication jtbApplication=null;
AttractionWaterSport waterSport =null;
AttractionWaterGenDeclare waterGeneralDec =null;
AttractionWaterRequired waterRequirement =null;
JTBPaymentMethod jtbPayment=null;
try{
	jtbPayment= JTBPaymentMethodLocalServiceUtil.getJTBById(jtbApplicationId);
	System.out.println("-------payment-----"+jtbPayment);
}catch(Exception e){
	e.printStackTrace();
}


//folder
List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
DLFolder supportingDocumentsFolder = null;
DLFolder supportingDocumentsParentFolder = null;
FileEntry fileEntry = null;
//Signatures
String signatureOfOwner = null;
String signatureOfManager = null;

try {
	jtbApplication = JTBApplicationLocalServiceUtil.getJTBApplication(jtbApplicationId);
}catch (Exception e) {
}
try {
	waterSport=AttractionWaterSportLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
} catch (Exception e) {
}
try {
	waterGeneralDec=AttractionWaterGenDeclareLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
} catch (Exception e) {
}
try {
	waterRequirement=AttractionWaterRequiredLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
} catch (Exception e) {}


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
	  signatureOfOwner =replaceSignatureOfOwner
			  (waterSport.getJtbApplicationId(), "Watersports Signature of Owner", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
  } catch (Exception e) {}
  try { 
	  signatureOfManager =replaceSignatureOfManager
			  (waterSport.getJtbApplicationId(), "Watersports Signature of Manager", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
  } catch (Exception e) {}
  

//pdf go in launch case
		if (checkPdfDownloadWithoutDocument.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
					"other-watersportoperator");
		} else {
			try {
			pdfTemplate = getTemplateFromJournalArticlePDF
					(themeDisplay.getScopeGroupId(),
					"water-sports-operator");
			}catch (Exception e) {
				
			}
		}
try {
	pdfTemplate = StringUtil.replace(pdfTemplate, 
	new String[] {
	//Hotel Licence
			"[$OperatorBusiness$]","[$OperatorMailingAddress$]","[$BusinessLocExact$]","[$PhoneNoOperator$]","[$EmailAddr$]",
			"[$OperatorOwner$]","[$OwnerAdd$]","[$ManagerName$]","[$ApplicantNameO$]","[$NationalityOpertor$]","[$EmployeesName$]","[$ActivitiesList$]",
			"[$OccupyLocation$]","[$ProposalHas$]","[$InvolvedNat$]","[$PermitWork1$]",
			
			"[$FirstAid$]", "[$Cpr$]", "[$DivingCertificate$]", "[$Rlss$]", "[$Lifeguard$]", 
			"[$AirUse$]", "[$BusiName$]", "[$BusiAddress$]", "[$InsuranceAmount$]", "[$OperatorDate$]",
			
			"[$OpertorOwnSign$]", "[$OpertorManagerSign$]",
			
			"[$GeneralAll$]", "[$PersonalWater$]", "[$WaterSki$]", "[$SunfishSail$]", "[$Parasail$]",
			"[$ScubaDiving$]", "[$GlassBottom$]", "[$BananaBoat$]", 

	},
	new String[] {
	//Applicant details
				Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportBusinessName())?waterSport.getWaterSportBusinessName():"",
				Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportMailingaAdd())?waterSport.getWaterSportMailingaAdd():"",
				Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportOpLocationAddr())?waterSport.getWaterSportOpLocationAddr():"",
				Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportOpPhone())?waterSport.getWaterSportOpPhone():"",
				Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportOpEmail())?waterSport.getWaterSportOpEmail():"",
				Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportOpOwnerName())?waterSport.getWaterSportOpOwnerName():"",
				Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportOpAddressOwner())?waterSport.getWaterSportOpAddressOwner():"",
				Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportOpManagerName())?waterSport.getWaterSportOpManagerName():"",
				Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportOpApplicantName())?waterSport.getWaterSportOpApplicantName():"",
				Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportOpNationality())?waterSport.getWaterSportOpNationality():"",
				Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportOpEmployeesNo())?waterSport.getWaterSportOpEmployeesNo():"",
				Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportOpActivityList())?waterSport.getWaterSportOpActivityList():"",
				Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getOccupyLocation())?waterSport.getOccupyLocation():"",
				Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getProposalSubmitted())?waterSport.getProposalSubmitted():"",	
				Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getForeignNationalsInvolved())?waterSport.getForeignNationalsInvolved():"",
				Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportOpActivityList())?waterSport.getWorkPermitApplied():"",	
				
				
				Validator.isNotNull(waterGeneralDec)&&Validator.isNotNull(waterGeneralDec.getFirstAid())?waterGeneralDec.getFirstAid():"",
				Validator.isNotNull(waterGeneralDec)&&Validator.isNotNull(waterGeneralDec.getCpr())?waterGeneralDec.getCpr():"",
				Validator.isNotNull(waterGeneralDec)&&Validator.isNotNull(waterGeneralDec.getDivingCertificate())?waterGeneralDec.getDivingCertificate():"",
				Validator.isNotNull(waterGeneralDec)&&Validator.isNotNull(waterGeneralDec.getRlss())?waterGeneralDec.getRlss():"" ,
				Validator.isNotNull(waterGeneralDec)&&Validator.isNotNull(waterGeneralDec.getLifeguard())?waterGeneralDec.getLifeguard():"" ,
				Validator.isNotNull(waterGeneralDec)&&Validator.isNotNull(waterGeneralDec.getBreathing())?waterGeneralDec.getBreathing():"",
				Validator.isNotNull(waterGeneralDec)&&Validator.isNotNull(waterGeneralDec.getOperationName())?waterGeneralDec.getOperationName():"",
				Validator.isNotNull(waterGeneralDec)&&Validator.isNotNull(waterGeneralDec.getOperationAddress())?waterGeneralDec.getOperationAddress():"",
				Validator.isNotNull(waterGeneralDec)&&Validator.isNotNull(waterGeneralDec.getInsuranceAmount())?waterGeneralDec.getInsuranceAmount():"",
				Validator.isNotNull(waterGeneralDec)&&Validator.isNotNull(waterGeneralDec.getManagerSignDate())?dateFormat.format(waterGeneralDec.getManagerSignDate()):"",
				signatureOfOwner,
				signatureOfManager,
				
				Validator.isNotNull(waterRequirement)&&Validator.isNotNull(waterRequirement.getGeneralOperator())?waterRequirement.getGeneralOperator():"",
				Validator.isNotNull(waterRequirement)&&Validator.isNotNull(waterRequirement.getWaterCraft())?waterRequirement.getWaterCraft():"",
				Validator.isNotNull(waterRequirement)&&Validator.isNotNull(waterRequirement.getWaterSki())?waterRequirement.getWaterSki():"",
				Validator.isNotNull(waterRequirement)&&Validator.isNotNull(waterRequirement.getSunfishSail())?waterRequirement.getSunfishSail():"",
				Validator.isNotNull(waterRequirement)&&Validator.isNotNull(waterRequirement.getParasail())?waterRequirement.getParasail():"",
				Validator.isNotNull(waterRequirement)&&Validator.isNotNull(waterRequirement.getScubaDiving())?waterRequirement.getScubaDiving():"",
				Validator.isNotNull(waterRequirement)&&Validator.isNotNull(waterRequirement.getGlassBoat())?waterRequirement.getGlassBoat():"",
				Validator.isNotNull(waterRequirement)&&Validator.isNotNull(waterRequirement.getBananaBoat())?waterRequirement.getBananaBoat():"",
						
		});
		    }catch (Exception e) {
				// TODO: handle exception
			}
	
	if (!checkPdfDownloadWithoutDocument.equals("false")) {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
				String certificateHalt = null;
				String businessNameOper = null;
				String operatorLetter = null;
				String trnNumberTaxOperator = null;
				String operatorListD = null;
				String publicCopy = null;
				String maritimeEach = null;
				String vesselCopy = null;
				String fisheriesLic = null;
				String licenceBeach = null;
				String jobList = null;
				String locationBase = null;
				String permitWork = null;
				String safetyPlan = null;
				
				String localAuthority=null;
				String landTenure=null;
				String leaseAgree=null;
				String foodCerti=null;
				String foodPermit=null;
				String poolPermit=null;
				String teamJamaica=null;
				String coxwainCerti=null;
				String coastalMaster=null;
				String listEvent=null;
				
				String comApp = null;
				String firstAid = null;
				String divingCerti = null;
				String lifeGuardCerti = null;
				String MariAuth = null;
				String passSize = null;
				String fleet = null;
				String personalWaterCraft = null;
				String certificationOfGuide = null;
				String approvalFromNepa = null;
				String lGuardNew = null;
				


			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
				} catch (Exception e) {}
				if (title.equals("Copy of Certificate of Incorporation of Company")) {
				    certificateHalt = fileName;
				} else if (title.equals("Copy of Registration of Business Name (where applicable i.e. if Business Name is different from the name of  the Company)")) {
				    businessNameOper = fileName;
				} else if (title.equals("Letter of “Good Standing” – Companies Office of Jamaica")) {
				    operatorLetter = fileName;
				} else if (title.equals("Copy of Tax Registration Number (TRN)  (Company)")) {
				    trnNumberTaxOperator = fileName;
				} else if (title.equals("List of Directors")) {
				    operatorListD = fileName;
				} else if (title.equals("Copy of Public Liability Insurance Certificate (showing coverage for location (s) and vessel (s)")) {
				    publicCopy = fileName;
				} else if (title.equals("Copy of Maritime Authority of Jamaica Safety Certificate for each vessel")) {
				    maritimeEach = fileName;
				} else if (title.equals("Copy of Maritime Authority of Jamaica Certificate of Registry for each vessel")) {
				    vesselCopy = fileName;
				} else if (title.equals("Copy of Fisheries Licence (for vessel (s) and employees where applicable)")) {
				    fisheriesLic = fileName;
				} else if (title.equals("Copy of current Beach Licence from NEPA for each location")) {
				    licenceBeach = fileName;
				} else if (title.equals("Detailed list of employees stating job title")) {
				    jobList = fileName;
				} else if (title.equals("Permission to operate from location (s) (Base where vessel is moored and location where operator is allowed to pick up guest(s) –  required each year if no expiry date is stated)")) {
				    locationBase = fileName;
				} else if (title.equals("Copy of Work Permit (s) (where applicable)")) {
				    permitWork = fileName;
				} else if (title.equals("Management plan on site re maintenance/ preservation/ safety/ disaster preparedness/ environmental safe practices and training  of staff")) {
				    safetyPlan = fileName;
				} else if (title.equals("Approval From Local Planning Authority")) {
					localAuthority = fileName;
				} else if (title.equals("Proof of Land Tenure")) {
					landTenure = fileName;
				} else if (title.equals("Stamped Lease Agreement")) {
					leaseAgree = fileName;
				} else if (title.equals("Food Establishment Certificate")) {
					foodCerti = fileName;
				} else if (title.equals("Food Handlers Permit")) {
					foodPermit = fileName;
				} else if (title.equals("Swimming Pool Permit (where applicable)")) {
					poolPermit = fileName;
				} else if (title.equals("Team Jamaica Certification (list)")) {
					teamJamaica = fileName;
				} else if (title.equals("Coxwain Licence (where applicable)")) {
					coxwainCerti = fileName;
				} else if (title.equals("Coastal Master Licence (where applicable)")) {
					coastalMaster = fileName;
				} else if (title.equals("List of Events /Activities")) {
					listEvent = fileName;
				} else if (title.equals("Completed application form for each employee")) {
					comApp = fileName;
				}else if (title.equals("First aid and CPR certificate from the Royal Life Saving Society")) {
					firstAid = fileName;
				}else if (title.equals("Copy of Diving Certificate")) {
					divingCerti = fileName;
				}else if (title.equals("Copy NRCA Lifeguard Licence from the National Environment and Planning Agency (NEPA)")) {
					lifeGuardCerti = fileName;
				}else if (title.equals("Coxswain Certificate of competency from Maritime Authority of Jamaica indicating designated harbor to operate")) {
					MariAuth = fileName;
				}else if (title.equals("One recent passport size photograph to be stamped and signed by Superintendent of Police or Justice of the Peace")) {
					passSize = fileName;
				}else if (title.equals("Fleet Listing")) {
					fleet = fileName;
				}else if (title.equals("Personal Water Craft Launch Site Approval")) {
					personalWaterCraft = fileName;
				}else if (title.equals("Certification of Tour Guides")) {
					certificationOfGuide = fileName;
				}else if (title.equals("Approval From Nepa")) {
					approvalFromNepa = fileName;
				}else if (title.equals("Life Guard Certification (where applicable )")) {
					lGuardNew = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
					"[$IncorporationCertificateHaltOperator$]", "[$BusinessNameOper$]", "[$OperatorLetter$]", "[$TrnNumberTaxOperator$]",
					 "[$OperatorListD$]", "[$PublicCopy$]", "[$MaritimeEach$]", "[$VesselCopy$]", "[$FisheriesLic$]", "[$LicenceBeach$]",
					  "[$JobList$]", "[$LocationBase$]", "[$PermitWork$]", "[$SafetyPlan$]",
					  
					  "[$localAuth$]", "[$landProof$]", "[$AgrreLease$]", "[$CertificateFood$]",
					  "[$PermitFood$]", "[$PermitPool$]", "[$jamaicTeam$]", "[$CertiCoxwain$]",
					  "[$Mastercoastal$]", "[$eventlist$]",
					  
					  "[$AppCom$]", "[$AidFirst$]", "[$CertiDiving$]", "[$CertiGuard$]",
					  "[$AuthMari$]", "[$SizePass$]", 
					  "[$FleetNew$]",
					  "[$PersonalWaterCraftNew$]",
					  "[$CertificationOfGuideNew$]",
					  "[$ApprovalFromNepaNew$]",
					  "[$lifeGuardNew$]",
					  "[$PaymentMethOperator$]"

				},
				new String[] {
						certificateHalt,
						businessNameOper,
						operatorLetter,
						trnNumberTaxOperator,
						operatorListD,
						publicCopy,
						maritimeEach,
						vesselCopy,
						fisheriesLic,
						licenceBeach,
						jobList,
						locationBase,
						permitWork,
						safetyPlan,
						localAuthority,landTenure,leaseAgree,foodCerti,foodPermit,poolPermit,teamJamaica,coxwainCerti,coastalMaster,listEvent,
						comApp,firstAid,divingCerti,lifeGuardCerti,MariAuth,passSize,
						fleet,
						personalWaterCraft,
						certificationOfGuide,
						approvalFromNepa,
						lGuardNew,
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
