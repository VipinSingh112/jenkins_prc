package com.nbp.fire.brigade.pdf.util;

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
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeAppPayment;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeApplication;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeCerPurposeInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeHazardousSubInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeMultFloorInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeOperatorDetail;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadePremisesInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeProEquipmentInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeSignatureInfo;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeAppPaymentLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeApplicationLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeCerPurposeInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeHazardousSubInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeMultFloorInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeOperatorDetailLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadePremisesInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeProEquipmentInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeSignatureInfoLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class FireBirgadeApplicationPdf {
	
	public static String replaceSignatureForFB(long fireBrigadeApplicationId, String folderName, long groupId,
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
	}
	public static String fireBrigadeAppPdf(long fireBrigadeApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		FireBrigadeApplication fireBrigadeApplication=null;
		FireBrigadeSignatureInfo fbAppSign=null;
		FireBrigadePremisesInfo fbAppPremises=null;
		FireBrigadeOperatorDetail fbAppOperator=null;
		FireBrigadeMultFloorInfo fbAppMultiFloor=null;
		FireBrigadeProEquipmentInfo fbAppProEquip=null;
		FireBrigadeHazardousSubInfo fbAppHazardous=null;
		FireBrigadeCerPurposeInfo fbAppCertificatePurpose=null;
		FireBrigadeAppPayment fbAppPayment=null;
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		//Signatures
		String signatureForFireApp = null;
		
		    try {
			fireBrigadeApplication=FireBrigadeApplicationLocalServiceUtil.getFireBrigadeApplication(fireBrigadeApplicationId);
		    } catch (Exception e) {}
			try {
			fbAppSign= FireBrigadeSignatureInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
			}catch (Exception e) {
			}try {
			fbAppPremises= FireBrigadePremisesInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
			}catch (Exception e) {
			}try {
			fbAppOperator= FireBrigadeOperatorDetailLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
			}catch (Exception e) {
			}try {
			fbAppMultiFloor= FireBrigadeMultFloorInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
			}catch (Exception e) {
			}try {
			fbAppProEquip= FireBrigadeProEquipmentInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
			}catch (Exception e) {
			}try {
			fbAppHazardous= FireBrigadeHazardousSubInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
			}catch (Exception e) {
			}try {
			fbAppCertificatePurpose=FireBrigadeCerPurposeInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
			}catch (Exception e) {
			}try {
			fbAppPayment=FireBrigadeAppPaymentLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
			}catch (Exception e) {
			}
		
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Fire Brigade Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(), String.valueOf(fireBrigadeApplication.getFireBrigadeApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//signatures
		try {
			signatureForFireApp =replaceSignatureForFB(fbAppSign.getFireBrigadeApplicationId(), "Signature",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"fire-brigade");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"fire-brigade-application");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
			//Applicant details
			"[$Title$]","[$ApplicantName$]","[$Telephone$]","[$Fax$]","[$ApplicantTRN$]","[$Email$]","[$Date11$]","[$ApplicantAddress$]",	
			"[$Signatures$]",
			
			//Premises's Detail
			"[$premises$]","[$PremisesCertified$]","[$ExpirationDate$]","[$CertificateNumber$]","[$PremisesName$]","[$PremisesAddress$]",
			
			//Operator's Detail
			"[$OperatorsName$]","[$BusinessName$]","[$Address2$]","[$PremisesPut$]","[$PremisesaIs$]","[$SamePremises$]","[$MaxPremisesa$]","[$NumberPremisesa$]",
			
			//Multiple Floor Structure
			"[$AlternateFloors$]","[$building$]","[$BrigadeEquipment$]","[$ParkingGarage$]",
			
			//fire protection equipment
			"[$CheckOffEquipment$]",
			"[$HouseReels$]","[$PortableExtinguishers$]","[$FireAlarm$]","[$SmokeHeatDetectors$]","[$SprinklerSystem$]","[$Hydrant$]","[$OtherEquipment$]",
			
			//Hazardous substance
			"[$Lpg$]","[$Flammable1$]","[$Combustible$]","[$Chemicals2$]","[$Powder1$]","[$Explosives$]","[$hazardous1$]",
			
			//Certificate purpose
			"[$BeingRequest$]","[$OtherRequested$]",
			
			//Documents
			//"[$Driving$]","[$National$]","[$PowerAttorney$]","[$Verification2$]",
			"[$PaymentMethod$]",
			
			},
			new String[] {
    		//Applicant details
    		Validator.isNotNull(fbAppSign)&&Validator.isNotNull(fbAppSign.getTitle())?fbAppSign.getTitle():"",
			Validator.isNotNull(fbAppSign)&&Validator.isNotNull(fbAppSign.getName())?fbAppSign.getName():"",
			Validator.isNotNull(fbAppSign)&&Validator.isNotNull(fbAppSign.getTelephone())?fbAppSign.getTelephone():"",
			Validator.isNotNull(fbAppSign)&&Validator.isNotNull(fbAppSign.getFax())?fbAppSign.getFax():"",
			Validator.isNotNull(fbAppSign)&&Validator.isNotNull(fbAppSign.getTrn())?fbAppSign.getTrn():"",
			Validator.isNotNull(fbAppSign)&&Validator.isNotNull(fbAppSign.getEmail())?fbAppSign.getEmail():"",
			Validator.isNotNull(fbAppSign)&&Validator.isNotNull(fbAppSign.getDate())?dateFormat.format(fbAppSign.getDate()):"",
			Validator.isNotNull(fbAppSign)&&Validator.isNotNull(fbAppSign.getAddress())?fbAppSign.getAddress():"",
				//signature 
				signatureForFireApp,
					
			//Premises's Detail
			Validator.isNotNull(fbAppPremises)&&Validator.isNotNull(fbAppPremises.getPremises())?fbAppPremises.getPremises():"",		
			Validator.isNotNull(fbAppPremises)&&Validator.isNotNull(fbAppPremises.getPremisesCertified())?fbAppPremises.getPremisesCertified():"",		
			Validator.isNotNull(fbAppPremises)&&Validator.isNotNull(fbAppPremises.getExpirationDate())?dateFormat.format(fbAppPremises.getExpirationDate()):"",		
			Validator.isNotNull(fbAppPremises)&&Validator.isNotNull(fbAppPremises.getCertificateNumber())?fbAppPremises.getCertificateNumber():"",		
			Validator.isNotNull(fbAppPremises)&&Validator.isNotNull(fbAppPremises.getName())?fbAppPremises.getName():"",		
			Validator.isNotNull(fbAppPremises)&&Validator.isNotNull(fbAppPremises.getAddress())?fbAppPremises.getAddress():"",		
					
			//Operator's Detail
			Validator.isNotNull(fbAppOperator)&&Validator.isNotNull(fbAppOperator.getOperatorName())?fbAppOperator.getOperatorName():"",
			Validator.isNotNull(fbAppOperator)&&Validator.isNotNull(fbAppOperator.getBusinessName())?fbAppOperator.getBusinessName():"",
			Validator.isNotNull(fbAppOperator)&&Validator.isNotNull(fbAppOperator.getAddress())?fbAppOperator.getAddress():"",
			Validator.isNotNull(fbAppOperator)&&Validator.isNotNull(fbAppOperator.getPremisesUses())?fbAppOperator.getPremisesUses():"",
			Validator.isNotNull(fbAppOperator)&&Validator.isNotNull(fbAppOperator.getPremisesOccupancy())?fbAppOperator.getPremisesOccupancy():"",
			Validator.isNotNull(fbAppOperator)&&Validator.isNotNull(fbAppOperator.getPremisesBusiness())?fbAppOperator.getPremisesBusiness():"",
			Validator.isNotNull(fbAppOperator)&&Validator.isNotNull(fbAppOperator.getMaxWorkingPersons())?fbAppOperator.getMaxWorkingPersons():"",
			Validator.isNotNull(fbAppOperator)&&Validator.isNotNull(fbAppOperator.getMaxNumPersonsAtAnyOneTime())?fbAppOperator.getMaxNumPersonsAtAnyOneTime():"",
			
				
			//Multiple Floor Structure		
			Validator.isNotNull(fbAppMultiFloor)&&Validator.isNotNull(fbAppMultiFloor.getFloorAlternateExist())?fbAppMultiFloor.getFloorAlternateExist():"",
			Validator.isNotNull(fbAppMultiFloor)&&Validator.isNotNull(fbAppMultiFloor.getBuildingRisingMain())?fbAppMultiFloor.getBuildingRisingMain():"",
			Validator.isNotNull(fbAppMultiFloor)&&Validator.isNotNull(fbAppMultiFloor.getEquipmentConnection())?fbAppMultiFloor.getEquipmentConnection():"",
			Validator.isNotNull(fbAppMultiFloor)&&Validator.isNotNull(fbAppMultiFloor.getBuildingParkingGarage())?fbAppMultiFloor.getBuildingParkingGarage():"",
					
			//fire protection equipment
			Validator.isNotNull(fbAppProEquip)&&Validator.isNotNull(fbAppProEquip.getEquipmentProtectionPre())?fbAppProEquip.getEquipmentProtectionPre():"",
			Validator.isNotNull(fbAppProEquip)&&Validator.isNotNull(fbAppProEquip.getEquipmentProtectionOne())?fbAppProEquip.getEquipmentProtectionOne():"",
			Validator.isNotNull(fbAppProEquip)&&Validator.isNotNull(fbAppProEquip.getEquipmentProtectionTwo())?fbAppProEquip.getEquipmentProtectionTwo():"",
			Validator.isNotNull(fbAppProEquip)&&Validator.isNotNull(fbAppProEquip.getEquipmentProtectionThree())?fbAppProEquip.getEquipmentProtectionThree():"",
			Validator.isNotNull(fbAppProEquip)&&Validator.isNotNull(fbAppProEquip.getEquipmentProtectionFour())?fbAppProEquip.getEquipmentProtectionFour():"",
			Validator.isNotNull(fbAppProEquip)&&Validator.isNotNull(fbAppProEquip.getEquipmentProtectionFive())?fbAppProEquip.getEquipmentProtectionFive():"",
			Validator.isNotNull(fbAppProEquip)&&Validator.isNotNull(fbAppProEquip.getEquipmentProtectionSix())?fbAppProEquip.getEquipmentProtectionSix():"",
			Validator.isNotNull(fbAppProEquip)&&Validator.isNotNull(fbAppProEquip.getOtherEquipment())?fbAppProEquip.getOtherEquipment():"",
			
			//Hazardous substance
			Validator.isNotNull(fbAppHazardous)&&Validator.isNotNull(fbAppHazardous.getLpgCylinder())?fbAppHazardous.getLpgCylinder():"",		
			Validator.isNotNull(fbAppHazardous)&&Validator.isNotNull(fbAppHazardous.getFlammableGases())?fbAppHazardous.getFlammableGases():"",		
			Validator.isNotNull(fbAppHazardous)&&Validator.isNotNull(fbAppHazardous.getFlammableCombustibleLiquid())?fbAppHazardous.getFlammableCombustibleLiquid():"",		
			Validator.isNotNull(fbAppHazardous)&&Validator.isNotNull(fbAppHazardous.getChemicalsLiquid())?fbAppHazardous.getChemicalsLiquid():"",		
			Validator.isNotNull(fbAppHazardous)&&Validator.isNotNull(fbAppHazardous.getChemicalsPowder())?fbAppHazardous.getChemicalsPowder():"",		
			Validator.isNotNull(fbAppHazardous)&&Validator.isNotNull(fbAppHazardous.getExplosives())?fbAppHazardous.getExplosives():"",		
			Validator.isNotNull(fbAppHazardous)&&Validator.isNotNull(fbAppHazardous.getOtherHazardousSubstance())?fbAppHazardous.getOtherHazardousSubstance():"",		
			
			//Certificate purpose
			Validator.isNotNull(fbAppCertificatePurpose)&&Validator.isNotNull(fbAppCertificatePurpose.getCertificatePurposePre())?fbAppCertificatePurpose.getCertificatePurposePre():"",
			Validator.isNotNull(fbAppCertificatePurpose)&&Validator.isNotNull(fbAppCertificatePurpose.getOtherCertificatePurpose())?fbAppCertificatePurpose.getOtherCertificatePurpose():"",
			Validator.isNotNull(fbAppPayment)&&Validator.isNotNull(fbAppPayment.getPaymentMethod())?fbAppPayment.getPaymentMethod():"",
			
			
					
			});
				    }catch (Exception e) {
						// TODO: handle exception
					}
			
		if (!checkPdfDownloadWithoutDocument.equals("false")) {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
			String driverLicence = "";
			String nationalID = "";
			String powerOfAttorney = "";
			String employeeVerification = "";
			
			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
				} catch (Exception e) {}
				if(title.equals("Driver Licence")) {
					driverLicence = fileName;
				}else if (title.equals("National ID")) {
					nationalID = fileName;
				}else if (title.equals("Power of Attorney")) {
					powerOfAttorney = fileName;
				}else if (title.equals("Employee Verification")) {
					employeeVerification = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
				"[$Driving$]","[$National$]","[$PowerAttorney$]","[$Verification2$]",
				},
				new String[] {
						driverLicence,nationalID,powerOfAttorney,employeeVerification,
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
