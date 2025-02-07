package com.nbp.sez.pdf.util;

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
import com.nbp.sez.status.application.form.service.model.SezStatusAppPayment;
import com.nbp.sez.status.application.form.service.model.SezStatusApplication;
import com.nbp.sez.status.application.form.service.model.SezZoneDevUnderInfo;
import com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo;
import com.nbp.sez.status.application.form.service.model.SezZoneFinancialInfo;
import com.nbp.sez.status.application.form.service.model.SezZoneGeneralBusinessInfo;
import com.nbp.sez.status.application.form.service.model.SezZoneGeneralBussinessAddress;
import com.nbp.sez.status.application.form.service.model.SezZoneLocationAdd;
import com.nbp.sez.status.application.form.service.model.SezZoneProposedProjectInfo;
import com.nbp.sez.status.application.form.service.model.SezZoneSubCheckInfo;
import com.nbp.sez.status.application.form.service.model.SezZoneUserUnderInfo;
import com.nbp.sez.status.application.form.service.service.SezStatusAppPaymentLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezStatusApplicationLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezZoneDevUnderInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezZoneEmployInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezZoneFinancialInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezZoneGeneralBusinessInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezZoneGeneralBussinessAddressLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezZoneLocationAddLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezZoneProposedProjectInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezZoneSubCheckInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezZoneUserUnderInfoLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class SezZoneUserPdf{
	
	public static String replaceSignforSezZoneUnderNotary(long sezStatusApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature Of Zone User Undertaking Notary");
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
	public static String replaceSignforSezZoneUnderNotDeclarant(long sezStatusApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature Of Zone User Undertaking Declerant");
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
	public static String replaceSignforSezZoneDevNotary(long sezStatusApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature Of Zone User Developer Notary");
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
	public static String replaceSignforSezZoneDevNotDeclarant(long sezStatusApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Zone User Developer Declarant");
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
	public static String replaceSignforSezZoneUserSubmission(long sezStatusApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Zone User Submission");
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
	
	public static String sezPdfForZoneUser(long sezStatusApplicationId, ThemeDisplay themeDisplay,
			String checkPdfSendingInLaunchCaseWithoutDoc)throws PortalException{
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		String pdfTemplate= StringPool.BLANK;
		SezStatusApplication sezApplication=null;
		SezZoneGeneralBusinessInfo sezZoneGenBusInfo=null;
		SezZoneGeneralBussinessAddress sezZoneGenBusAddr=null;
		SezZoneProposedProjectInfo sezZonePropProjInfo=null;
		List<SezZoneLocationAdd> sezZoneLocation=null;
		SezZoneFinancialInfo sezZoneFinancial=null;
		List<SezZoneEmployInfo> sezZoneEmpInfo=null;
		SezZoneUserUnderInfo sezZoneUserUnderInfo=null;
		SezZoneDevUnderInfo sezZoneDevUndertaking=null;
		SezZoneSubCheckInfo sezZoneSubCheckInfo=null;
		SezStatusAppPayment sezZonePayment=null;
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		//Signatures
		String signatureSezZoneUnderNotary = null;
		String signatureSezZoneUnderNotDeclarant = null;
		String signatureDeveloperSezZoneNotary = null;
		String signatureDeveloperSezZoneNotDeclarant = null;
		String signatureSezZoneUserSubmission = null;
		try {
			sezApplication=SezStatusApplicationLocalServiceUtil.getSezStatusApplication(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezZoneGenBusInfo= SezZoneGeneralBusinessInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezZoneGenBusAddr= SezZoneGeneralBussinessAddressLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezZonePropProjInfo= SezZoneProposedProjectInfoLocalServiceUtil.getSezStatusById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezZoneLocation=SezZoneLocationAddLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezZoneFinancial= SezZoneFinancialInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezZoneEmpInfo=SezZoneEmployInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezZoneUserUnderInfo= SezZoneUserUnderInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezZoneDevUndertaking= SezZoneDevUnderInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezZoneSubCheckInfo=SezZoneSubCheckInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezZonePayment= SezStatusAppPaymentLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
		} catch (Exception e) {
			}
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Sez Status Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(), String.valueOf(sezApplication.getSezStatusApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
		}
		//signatures
		try {
			signatureSezZoneUnderNotary =replaceSignforSezZoneUnderNotary(
					sezZoneUserUnderInfo.getSezStatusApplicationId(), "Signature Of Zone User Undertaking Notary",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		
		try {
			signatureSezZoneUnderNotDeclarant =replaceSignforSezZoneUnderNotDeclarant(
					sezZoneUserUnderInfo.getSezStatusApplicationId(), "Signature Of Zone User Undertaking Declerant",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		
		try {
			signatureDeveloperSezZoneNotary =replaceSignforSezZoneDevNotary(
					sezZoneUserUnderInfo.getSezStatusApplicationId(), "Signature Of Zone User Developer Notary",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		
		try {
			signatureDeveloperSezZoneNotDeclarant =replaceSignforSezZoneDevNotDeclarant(
					sezZoneUserUnderInfo.getSezStatusApplicationId(), "Signature of Zone User Developer Declarant",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		
		try {
			signatureSezZoneUserSubmission =replaceSignforSezZoneUserSubmission(
					sezZoneUserUnderInfo.getSezStatusApplicationId(), "Signature of Zone User Submission",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		
		
		
		//pdf go in launch case
		if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
					"sez-zone-user-1");
		} else {
			try {
			pdfTemplate = getTemplateFromJournalArticlePDF
					(themeDisplay.getScopeGroupId(),
					"sez-zone-user");
			}catch (Exception e) {
				
			}
		}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
			"[$Application$]", "[$SEZDeveloper$]", "[$SezLocation$]", "[$ControlNumber$]", 
			
			//Name and full address of applicant firm/ company
			"[$CompanyName$]", "[$BuildingNo$]", "[$TownC$]","[$ParishN$]",
			
			//Name and address of Authorised Representative for the Zone User application
			"[$CName$]", "[$BuildingNoStreet$]", "[$TownCity$]", "[$ParishZip$]","[$Country$]",
			
			
			//State the name of the Sponsor
			"[$CompanyN$]", "[$BuildingAddress$]", "[$City$]", "[$ParishState$]","[$CountryReg$]",
			"[$Companies$]", "[$ArticlesIncorporation$]", "[$PleaseSpecify$]", "[$NonResident$]","[$TRN$]",
			"[$GCT$]", "[$TCC$]", 
			
			//operate as a SEZ entity
			"[$SEZentity$]", "[$DateApplication$]", "[$TypeProposed$]", "[$ZoneStatus$]",
			
			//location
			"[$DevelopersCode1$]", "[$Activity1$]",
			"[$DevelopersCode2$]", "[$Activity2$]",
			"[$DevelopersCode3$]", "[$Activity3$]",
			"[$DevelopersCode4$]", "[$Activity4$]",
			"[$DevelopersCode5$]", "[$Activity5$]",
			
			//Address of Leased Premises
			"[$StreetAddress$]", "[$AddTown$]", "[$AddParish$]",
			
			//State lease term
			"[$Year$]", "[$Volume$]", "[$Folio$]", "[$FloorNumber$]",
			
			//Infrastructure
			"[$facilities$]", "[$Equipment$]", "[$Machines$]", "[$Total$]",
			"[$SourceFinance$]", "[$PleaseInfrastructure$]",
			
			//Projected labour requirement over a three year period
			"[$Year1$]", "[$Direct1$]", "[$Male1$]", "[$Female1$]","[$Local1$]","[$Foreign1$]",
			"[$Year2$]", "[$Direct2$]", "[$Male2$]", "[$Female2$]","[$Local2$]","[$Foreign2$]",
			"[$Year3$]", "[$Direct3$]", "[$Male3$]", "[$Female3$]","[$Local3$]","[$Foreign3$]",
			"[$Year4$]", "[$Direct4$]", "[$Male4$]", "[$Female4$]","[$Local4$]","[$Foreign4$]",
			"[$Year5$]", "[$Direct5$]", "[$Male5$]", "[$Female5$]","[$Local5$]","[$Foreign5$]",
			
			//Applicant signature and certification
			"[$ZoneUser$]", "[$UserApplication$]", "[$TelephoneN$]", "[$E-mailAddress$]",
			"[$Signature$]", "[$Stamp$]",
			"[$CreateDate$]", "[$Notary$]", "[$CoDate$]",
			
			
			//Address of Leased Premises
			"[$DevelopersName$]", "[$LetterApproval$]", "[$AdDate$]", "[$SEZAgreement$]","[$SezDate$]","[$ControlNumber$]",
			
			//Developer's signature and certification
			"[$TitleDeclarant$]", "[$NameofDeveloper$]", "[$TelephoneNum$]", "[$EAddress$]",
			"[$Signature1$]","[$Stamp1$]",
			"[$TeDate$]","[$JusticePeace$]","[$CoDate1$]",
			
			//Basic Eligibility Requirement
			"[$General$]", "[$CompanyInformation$]", "[$SwornStatements$]", "[$Occupancy$]","[$Approvals$]",
			"[$SignatureSign$]",
			"[$SwornName$]","[$SDate$]"
			

			},
			new String[] {
			Validator.isNotNull(sezZoneGenBusInfo.getApplicationDate())?dateFormat.format(sezZoneGenBusInfo.getApplicationDate()): "",
			Validator.isNotNull(sezZoneGenBusInfo)&&Validator.isNotNull(sezZoneGenBusInfo.getDeveloperName())?sezZoneGenBusInfo.getDeveloperName():"",
			Validator.isNotNull(sezZoneGenBusInfo)&&Validator.isNotNull(sezZoneGenBusInfo.getLocationName())?sezZoneGenBusInfo.getLocationName():"",
			Validator.isNotNull(sezZoneGenBusInfo)&&Validator.isNotNull(sezZoneGenBusInfo.getControlNum())?sezZoneGenBusInfo.getControlNum():"",
				
			//Name and full address of applicant firm/company
			Validator.isNotNull(sezZoneGenBusAddr)&&Validator.isNotNull(sezZoneGenBusAddr.getZoneName())?sezZoneGenBusAddr.getZoneName():"",
			Validator.isNotNull(sezZoneGenBusAddr)&&Validator.isNotNull(sezZoneGenBusAddr.getZoneStreetAddress())?sezZoneGenBusAddr.getZoneStreetAddress():"",
			Validator.isNotNull(sezZoneGenBusAddr)&&Validator.isNotNull(sezZoneGenBusAddr.getZoneTown())?sezZoneGenBusAddr.getZoneTown():"",
			Validator.isNotNull(sezZoneGenBusAddr)&&Validator.isNotNull(sezZoneGenBusAddr.getZoneParish())?sezZoneGenBusAddr.getZoneParish():"",
			
			//Name and address of Authorised Representative for the Zone User application
			Validator.isNotNull(sezZoneGenBusAddr)&&Validator.isNotNull(sezZoneGenBusAddr.getZoneName())?sezZoneGenBusAddr.getZoneName():"",
			Validator.isNotNull(sezZoneGenBusAddr)&&Validator.isNotNull(sezZoneGenBusAddr.getZoneStreetAddress())?sezZoneGenBusAddr.getZoneStreetAddress():"",
			Validator.isNotNull(sezZoneGenBusAddr)&&Validator.isNotNull(sezZoneGenBusAddr.getZoneTown())?sezZoneGenBusAddr.getZoneTown():"",
			Validator.isNotNull(sezZoneGenBusAddr)&&Validator.isNotNull(sezZoneGenBusAddr.getZoneParish())?sezZoneGenBusAddr.getZoneParish():"",
			Validator.isNotNull(sezZoneGenBusAddr)&&Validator.isNotNull(sezZoneGenBusAddr.getZoneCountry())?sezZoneGenBusAddr.getZoneCountry():"",
			
					
			//State the name of the Sponsor
			Validator.isNotNull(sezZoneGenBusAddr)&&Validator.isNotNull(sezZoneGenBusAddr.getZoneName())?sezZoneGenBusAddr.getZoneName():"",		
			Validator.isNotNull(sezZoneGenBusAddr)&&Validator.isNotNull(sezZoneGenBusAddr.getZoneStreetAddress())?sezZoneGenBusAddr.getZoneStreetAddress():"",		
			Validator.isNotNull(sezZoneGenBusAddr)&&Validator.isNotNull(sezZoneGenBusAddr.getZoneTown())?sezZoneGenBusAddr.getZoneTown():"",		
			Validator.isNotNull(sezZoneGenBusAddr)&&Validator.isNotNull(sezZoneGenBusAddr.getZoneParish())?sezZoneGenBusAddr.getZoneParish():"",		
			Validator.isNotNull(sezZoneGenBusAddr)&&Validator.isNotNull(sezZoneGenBusAddr.getZoneCountry())?sezZoneGenBusAddr.getZoneCountry():"",
					
			Validator.isNotNull(sezZoneGenBusInfo)&&Validator.isNotNull(sezZoneGenBusInfo.getExistingCompany())?sezZoneGenBusInfo.getExistingCompany():"",		
			Validator.isNotNull(sezZoneGenBusInfo)&&Validator.isNotNull(sezZoneGenBusInfo.getArticleForm())?sezZoneGenBusInfo.getArticleForm():"",		
			Validator.isNotNull(sezZoneGenBusInfo)&&Validator.isNotNull(sezZoneGenBusInfo.getOtherArticleForm())?sezZoneGenBusInfo.getOtherArticleForm():"",		
			Validator.isNotNull(sezZoneGenBusInfo)&&Validator.isNotNull(sezZoneGenBusInfo.getNonResidentCom())?sezZoneGenBusInfo.getNonResidentCom():"",
					
			Validator.isNotNull(sezZoneGenBusInfo)&&Validator.isNotNull(sezZoneGenBusInfo.getTaxRegisNum())?sezZoneGenBusInfo.getExistingCompany():"",
			Validator.isNotNull(sezZoneGenBusInfo)&&Validator.isNotNull(sezZoneGenBusInfo.getGenConsumptionNum())?sezZoneGenBusInfo.getGenConsumptionNum():"",
			Validator.isNotNull(sezZoneGenBusInfo)&&Validator.isNotNull(sezZoneGenBusInfo.getTaxComplianceCertificateNum())?sezZoneGenBusInfo.getTaxComplianceCertificateNum():"",
									
			//operate as a SEZ entity
			Validator.isNotNull(sezZonePropProjInfo)&&Validator.isNotNull(sezZonePropProjInfo.getEntityDeniedApproval())?sezZonePropProjInfo.getEntityDeniedApproval():"",	
			Validator.isNotNull(sezZonePropProjInfo.getDeniedApprovalDate())?dateFormat.format(sezZonePropProjInfo.getDeniedApprovalDate()): "",
			Validator.isNotNull(sezZonePropProjInfo)&&Validator.isNotNull(sezZonePropProjInfo.getDeniedApprovalProjectType())?sezZonePropProjInfo.getDeniedApprovalProjectType():"",	
			Validator.isNotNull(sezZonePropProjInfo)&&Validator.isNotNull(sezZonePropProjInfo.getFreeZoneLocation())?sezZonePropProjInfo.getFreeZoneLocation():"",	
					
			//location		
			(sezZoneLocation!=null)&&(sezZoneLocation.size()>0)?sezZoneLocation.get(0).getDeveloperLocation():"",
			(sezZoneLocation!=null)&&(sezZoneLocation.size()>0)?sezZoneLocation.get(0).getDeveloperLocationDescription():"",
					
			(sezZoneLocation!=null)&&(sezZoneLocation.size()>1)?sezZoneLocation.get(1).getDeveloperLocation():"",
			(sezZoneLocation!=null)&&(sezZoneLocation.size()>1)?sezZoneLocation.get(1).getDeveloperLocationDescription():"",
			    
			(sezZoneLocation!=null)&&(sezZoneLocation.size()>2)?sezZoneLocation.get(2).getDeveloperLocation():"",
			(sezZoneLocation!=null)&&(sezZoneLocation.size()>2)?sezZoneLocation.get(2).getDeveloperLocationDescription():"",
			    
			(sezZoneLocation!=null)&&(sezZoneLocation.size()>3)?sezZoneLocation.get(3).getDeveloperLocation():"",
			(sezZoneLocation!=null)&&(sezZoneLocation.size()>3)?sezZoneLocation.get(3).getDeveloperLocationDescription():"",
			    
			(sezZoneLocation!=null)&&(sezZoneLocation.size()>4)?sezZoneLocation.get(4).getDeveloperLocation():"",
			(sezZoneLocation!=null)&&(sezZoneLocation.size()>4)?sezZoneLocation.get(4).getDeveloperLocationDescription():"",		
			
			//Address of Leased Premises
			Validator.isNotNull(sezZonePropProjInfo)&&Validator.isNotNull(sezZonePropProjInfo.getLeasedBuildingNum())?sezZonePropProjInfo.getLeasedBuildingNum():"",
			Validator.isNotNull(sezZonePropProjInfo)&&Validator.isNotNull(sezZonePropProjInfo.getLeasedTown())?sezZonePropProjInfo.getLeasedTown():"",
			Validator.isNotNull(sezZonePropProjInfo)&&Validator.isNotNull(sezZonePropProjInfo.getLeasedParish())?sezZonePropProjInfo.getLeasedParish():"",
			
			//State lease term
			Validator.isNotNull(sezZonePropProjInfo)&&Validator.isNotNull(sezZonePropProjInfo.getLeaseYears())?sezZonePropProjInfo.getLeaseYears():"",		
			Validator.isNotNull(sezZonePropProjInfo)&&Validator.isNotNull(sezZonePropProjInfo.getVolume())?sezZonePropProjInfo.getVolume():"",		
			Validator.isNotNull(sezZonePropProjInfo)&&Validator.isNotNull(sezZonePropProjInfo.getFolio())?sezZonePropProjInfo.getFolio():"",		
			Validator.isNotNull(sezZonePropProjInfo)&&Validator.isNotNull(sezZonePropProjInfo.getFloorNum())?sezZonePropProjInfo.getFloorNum():"",		
					
			//Infrastructure
			Validator.isNotNull(sezZoneFinancial)&&Validator.isNotNull(sezZoneFinancial.getBuildingInfrastructure())?sezZoneFinancial.getBuildingInfrastructure():"",
			Validator.isNotNull(sezZoneFinancial)&&Validator.isNotNull(sezZoneFinancial.getEquipmentInfrastructure())?sezZoneFinancial.getEquipmentInfrastructure():"",
			Validator.isNotNull(sezZoneFinancial)&&Validator.isNotNull(sezZoneFinancial.getMachinesInfrastructure())?sezZoneFinancial.getMachinesInfrastructure():"",
			Validator.isNotNull(sezZoneFinancial)&&Validator.isNotNull(sezZoneFinancial.getTotalInfrastructure())?sezZoneFinancial.getTotalInfrastructure():"",
			Validator.isNotNull(sezZoneFinancial)&&Validator.isNotNull(sezZoneFinancial.getFinanceSource())?sezZoneFinancial.getFinanceSource():"",		
			Validator.isNotNull(sezZoneFinancial)&&Validator.isNotNull(sezZoneFinancial.getOtherFinanceSource())?sezZoneFinancial.getOtherFinanceSource():"",		
			
			//Projected labour requirement over a three year period
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>0)?sezZoneEmpInfo.get(0).getLabourRequirementYear():"",
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>0)?sezZoneEmpInfo.get(0).getLabourRequirementDirect():"",
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>0)?sezZoneEmpInfo.get(0).getLabourRequirementMale():"",
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>0)?sezZoneEmpInfo.get(0).getLabourRequirementFemale():"",
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>0)?sezZoneEmpInfo.get(0).getLabourRequirementLocal():"",
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>0)?sezZoneEmpInfo.get(0).getLabourRequirementForeign():"",
					
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>1)?sezZoneEmpInfo.get(1).getLabourRequirementYear():"",
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>1)?sezZoneEmpInfo.get(1).getLabourRequirementDirect():"",
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>1)?sezZoneEmpInfo.get(1).getLabourRequirementMale():"",
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>1)?sezZoneEmpInfo.get(1).getLabourRequirementFemale():"",
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>1)?sezZoneEmpInfo.get(1).getLabourRequirementLocal():"",
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>1)?sezZoneEmpInfo.get(1).getLabourRequirementForeign():"",
			    
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>2)?sezZoneEmpInfo.get(2).getLabourRequirementYear():"",
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>2)?sezZoneEmpInfo.get(2).getLabourRequirementDirect():"",
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>2)?sezZoneEmpInfo.get(2).getLabourRequirementMale():"",
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>2)?sezZoneEmpInfo.get(2).getLabourRequirementFemale():"",
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>2)?sezZoneEmpInfo.get(2).getLabourRequirementLocal():"",
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>2)?sezZoneEmpInfo.get(2).getLabourRequirementForeign():"",
			    
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>3)?sezZoneEmpInfo.get(3).getLabourRequirementYear():"",
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>3)?sezZoneEmpInfo.get(3).getLabourRequirementDirect():"",
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>3)?sezZoneEmpInfo.get(3).getLabourRequirementMale():"",
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>3)?sezZoneEmpInfo.get(3).getLabourRequirementFemale():"",
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>3)?sezZoneEmpInfo.get(3).getLabourRequirementLocal():"",
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>3)?sezZoneEmpInfo.get(3).getLabourRequirementForeign():"",
			    
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>4)?sezZoneEmpInfo.get(4).getLabourRequirementYear():"",
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>4)?sezZoneEmpInfo.get(4).getLabourRequirementDirect():"",		
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>4)?sezZoneEmpInfo.get(4).getLabourRequirementMale():"",
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>4)?sezZoneEmpInfo.get(4).getLabourRequirementFemale():"",		
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>4)?sezZoneEmpInfo.get(4).getLabourRequirementLocal():"",
			(sezZoneEmpInfo!=null)&&(sezZoneEmpInfo.size()>4)?sezZoneEmpInfo.get(4).getLabourRequirementForeign():"",		
					
			//Applicant signature and certification
			Validator.isNotNull(sezZoneUserUnderInfo)&&Validator.isNotNull(sezZoneUserUnderInfo.getDeclarantTitle())?sezZoneUserUnderInfo.getDeclarantTitle():"",		
			Validator.isNotNull(sezZoneUserUnderInfo)&&Validator.isNotNull(sezZoneUserUnderInfo.getDeclarantName())?sezZoneUserUnderInfo.getDeclarantName():"",		
			Validator.isNotNull(sezZoneUserUnderInfo)&&Validator.isNotNull(sezZoneUserUnderInfo.getDeclarantTeleNum())?sezZoneUserUnderInfo.getDeclarantTeleNum():"",		
			Validator.isNotNull(sezZoneUserUnderInfo)&&Validator.isNotNull(sezZoneUserUnderInfo.getDeclarantEmail())?sezZoneUserUnderInfo.getDeclarantEmail():"",		
			//Signature and Stamp- zone user undertaking
			signatureSezZoneUnderNotary,signatureSezZoneUnderNotDeclarant,
			Validator.isNotNull(sezZoneUserUnderInfo.getApplicantSignatureDate())?dateFormat.format(sezZoneUserUnderInfo.getApplicantSignatureDate()): "",		
			Validator.isNotNull(sezZoneUserUnderInfo)&&Validator.isNotNull(sezZoneUserUnderInfo.getPublicNotaryName())?sezZoneUserUnderInfo.getPublicNotaryName():"",		
			Validator.isNotNull(sezZoneUserUnderInfo.getPublicNotarySignatureDate())?dateFormat.format(sezZoneUserUnderInfo.getPublicNotarySignatureDate()): "",	
			
			//Address of Leased Premises
			Validator.isNotNull(sezZoneDevUndertaking)&&Validator.isNotNull(sezZoneDevUndertaking.getDeveloperName())?sezZoneDevUndertaking.getDeveloperName():"",
			Validator.isNotNull(sezZoneDevUndertaking)&&Validator.isNotNull(sezZoneDevUndertaking.getApprovalLetterNum())?sezZoneDevUndertaking.getApprovalLetterNum():"",
			Validator.isNotNull(sezZoneDevUndertaking.getApprovalLetterDate())?dateFormat.format(sezZoneDevUndertaking.getApprovalLetterDate()): "",
			Validator.isNotNull(sezZoneDevUndertaking)&&Validator.isNotNull(sezZoneDevUndertaking.getDeveloperAgreeNum())?sezZoneDevUndertaking.getDeveloperAgreeNum():"",
			Validator.isNotNull(sezZoneDevUndertaking.getDeveloperAgreeDate())?dateFormat.format(sezZoneDevUndertaking.getDeveloperAgreeDate()): "",
			Validator.isNotNull(sezZoneDevUndertaking)&&Validator.isNotNull(sezZoneDevUndertaking.getDeveloperControlNum())?sezZoneDevUndertaking.getDeveloperControlNum():"",
			
			//Developer's signature and certification
			Validator.isNotNull(sezZoneDevUndertaking)&&Validator.isNotNull(sezZoneDevUndertaking.getDeclarantTitle())?sezZoneDevUndertaking.getDeveloperControlNum():"",
			Validator.isNotNull(sezZoneDevUndertaking)&&Validator.isNotNull(sezZoneDevUndertaking.getDeclarantName())?sezZoneDevUndertaking.getDeclarantName():"",
			Validator.isNotNull(sezZoneDevUndertaking)&&Validator.isNotNull(sezZoneDevUndertaking.getDeclarantTelephoneNum())?sezZoneDevUndertaking.getDeclarantTelephoneNum():"",
			Validator.isNotNull(sezZoneDevUndertaking)&&Validator.isNotNull(sezZoneDevUndertaking.getDeclarantEmail())?sezZoneDevUndertaking.getDeclarantEmail():"",
			//Developer's signature
			signatureDeveloperSezZoneNotary,signatureDeveloperSezZoneNotDeclarant,
			Validator.isNotNull(sezZoneDevUndertaking.getSignatureDate())?dateFormat.format(sezZoneDevUndertaking.getSignatureDate()): "",
			Validator.isNotNull(sezZoneDevUndertaking)&&Validator.isNotNull(sezZoneDevUndertaking.getPublicNotaryName())?sezZoneDevUndertaking.getPublicNotaryName():"",
			Validator.isNotNull(sezZoneDevUndertaking.getPublicNotarySignatureDate())?dateFormat.format(sezZoneDevUndertaking.getPublicNotarySignatureDate()): "",
			
			//Basic Eligibility Requirement
			Validator.isNotNull(sezZoneSubCheckInfo)&&Validator.isNotNull(sezZoneSubCheckInfo.getGeneralRequirement())?sezZoneSubCheckInfo.getGeneralRequirement():"",
			Validator.isNotNull(sezZoneSubCheckInfo)&&Validator.isNotNull(sezZoneSubCheckInfo.getCompanyInformation())?sezZoneSubCheckInfo.getCompanyInformation():"",
			Validator.isNotNull(sezZoneSubCheckInfo)&&Validator.isNotNull(sezZoneSubCheckInfo.getSwornState())?sezZoneSubCheckInfo.getSwornState():"",
			Validator.isNotNull(sezZoneSubCheckInfo)&&Validator.isNotNull(sezZoneSubCheckInfo.getOccupancyRequirement())?sezZoneSubCheckInfo.getOccupancyRequirement():"",
			Validator.isNotNull(sezZoneSubCheckInfo)&&Validator.isNotNull(sezZoneSubCheckInfo.getApprovals())?sezZoneSubCheckInfo.getApprovals():"",
			//Signature
			signatureSezZoneUserSubmission,		
			Validator.isNotNull(sezZoneSubCheckInfo)&&Validator.isNotNull(sezZoneSubCheckInfo.getSignatureName())?sezZoneSubCheckInfo.getSignatureName():"",
			Validator.isNotNull(sezZoneSubCheckInfo.getSignatureDate())?dateFormat.format(sezZoneSubCheckInfo.getSignatureDate()): "",
		

			});
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//DOCUMENTS
		if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
			String articlesOfAssociation = "";
			String certificateOfIncorporation = "";
			String certificateCopyBusinessRegist = "";
			String certificateCopyOfTRN = "";
			String certificateCopyOfGCT = "";
			String proposalTemplate = "";
			String planOfLogisticsAndSecurity = "";
			String affidavitSetting = "";
			String copyOfLeaseAgreement = "";
			String certificateCopyOfFireSafety = "";
			String certificateCopyOfEnvironmentPermit = "";
			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
				} catch (Exception e) {}
				if(title.equals("Certified copy of the companys Memorandum and Articles of Association")) {
					articlesOfAssociation = fileName;
				}else if (title.equals("Certified copy of Certificate of Incorporation")) {
					certificateOfIncorporation = fileName;
				}else if (title.equals("Certified copy of Business registration")) {
					certificateCopyBusinessRegist = fileName;
				}else if (title.equals("Certified copy of Tax Registration Number (TRN)")) {
					certificateCopyOfTRN = fileName;
				}else if (title.equals("Certified copy of General Consumption Tax (GCT) number")) {
					certificateCopyOfGCT = fileName;
				}else if (title.equals("Brief of business activities See “Zone User Business Proposal Template” provided")) {
					proposalTemplate = fileName;
				}else if (title.equals("Plan of logistics and security arrangements; if retail activities will be undertaken by the Zone User within the Special Economic Zone. See “General Security Guidelines” provided.")) {
					planOfLogisticsAndSecurity = fileName;
				}else if (title.equals("An affidavit setting out all relevant commercial information of the Zone User applicant")) {
					affidavitSetting = fileName;
				}else if (title.equals("Copy of lease agreement")) {
					copyOfLeaseAgreement = fileName;
				}else if (title.equals("Certified copy of the Fire Safety Certificate")) {
					certificateCopyOfFireSafety = fileName;
				}else if (title.equals("Certified copy of the relevant environment permit")) {
					certificateCopyOfEnvironmentPermit = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
				"[$Certifiedcopy$]","[$Certificate$]","[$CopyofBusiness$]","[$RegistrationNumber$]",
				"[$ConsumptionTax$]","[$ProposalTemplate$]","[$LogisticsAndSecurity$]",
				"[$AffidavitSetting$]","[$LeaseAgreement$]","[$SafetyCertificate$]","[$EnvironmentPermit$]","[$PaymentMethod$]"
				},
				new String[] {
					articlesOfAssociation,certificateOfIncorporation,certificateCopyBusinessRegist,certificateCopyOfTRN
					,certificateCopyOfGCT,proposalTemplate,planOfLogisticsAndSecurity,affidavitSetting,
					copyOfLeaseAgreement,certificateCopyOfFireSafety,certificateCopyOfEnvironmentPermit,
					Validator.isNotNull(sezZonePayment)&&Validator.isNotNull(sezZonePayment.getPaymentMethod())?sezZonePayment.getPaymentMethod():""
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