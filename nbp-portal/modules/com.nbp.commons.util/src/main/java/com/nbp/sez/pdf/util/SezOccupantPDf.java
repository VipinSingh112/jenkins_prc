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
import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupantGeneralBussinessAddressException;
import com.nbp.sez.status.application.form.service.model.SezOccLocationAdd;
import com.nbp.sez.status.application.form.service.model.SezOccupantDirectorPartnerSponsorInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupantEmploymentInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupantExistingProposedProjectBriefInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupantGeneralBussinessAddress;
import com.nbp.sez.status.application.form.service.model.SezOccupantGeneralBussinessInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupantInvestAndFinanceInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupantLocationAddBox;
import com.nbp.sez.status.application.form.service.model.SezOccupantPrincipleDirector;
import com.nbp.sez.status.application.form.service.model.SezOccupantPrincipleOfficer;
import com.nbp.sez.status.application.form.service.model.SezOccupantProposedAreaDevelopmentPlanInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupantShareHoldingInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupantUserUndertakingInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupanteDeveloperUndertakingInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupanteSubmissionChecklistInfo;
import com.nbp.sez.status.application.form.service.model.SezStatusAppPayment;
import com.nbp.sez.status.application.form.service.model.SezStatusApplication;
import com.nbp.sez.status.application.form.service.service.SezOccLocationAddLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantDirectorPartnerSponsorInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantEmploymentInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantExistingProposedProjectBriefInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantGeneralBussinessAddressLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantGeneralBussinessInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantInvestAndFinanceInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantLocationAddBoxLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantPrincipleDirectorLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantPrincipleOfficerLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantShareHoldingInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantUserUndertakingInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupanteDeveloperUndertakingInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupanteSubmissionChecklistInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezStatusAppPaymentLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezStatusApplicationLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class SezOccupantPDf {
	public static String replaceSignforSezOccupantDevUndertakingSignature(long sezStatusApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Occupant Zone Undertaking");
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
	public static String replaceSignforSezOccupantDevUndertakingStamp(long sezStatusApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Occupant Zone Undertaking Notary");
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
	
	public static String sezPfdfForOccupant(long sezStatusApplicationId, ThemeDisplay themeDisplay,
			String checkPdfSendingInLaunchCaseWithoutDoc) {
       System.out.println("********Inside Occupant Class **********");
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		SezStatusApplication sezStatusApplication = null;
		SezOccupantGeneralBussinessInfo zoneBusinessInfo = null;
		SezOccupantGeneralBussinessAddress addressOfCompany=null;
		SezOccupantGeneralBussinessAddress adddressSponsorOrRegisteredHeadOffice=null;
		SezOccupantGeneralBussinessAddress addressOfAuthorisedRepresentative=null;
		SezOccupantShareHoldingInfo shareHoldingInfo = null;
		List<SezOccupantDirectorPartnerSponsorInfo> directorPartnerSponsorInfo=null;
		List<SezOccupantPrincipleDirector> principleDirector = null;
		List<SezOccupantPrincipleOfficer> occupantPrincipleOfficer=null;
		SezOccupantExistingProposedProjectBriefInfo projectBriefInfo=null;
		List<SezOccLocationAdd> locationAddBox=null;
		SezOccupantProposedAreaDevelopmentPlanInfo areaDevelopmentPlanInfo = null;
		SezOccupantInvestAndFinanceInfo investAndFinanceInfo =null;
		List<SezOccupantEmploymentInfo> employmentInfo=null;
		SezOccupantUserUndertakingInfo occupantUserUndertakingInfo=null;
		SezOccupanteDeveloperUndertakingInfo developerUndertakingInfo=null;
		SezOccupanteSubmissionChecklistInfo occSubmissionChecklistInfo=null;
		SezStatusAppPayment sezOccupanyPayment=null;
		try {
			sezStatusApplication = SezStatusApplicationLocalServiceUtil.getSezStatusApplication(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			zoneBusinessInfo = SezOccupantGeneralBussinessInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
		} catch (Exception e) {
		}
        try {
			addressOfCompany=SezOccupantGeneralBussinessAddressLocalServiceUtil.
					getSezStatusBy_AT_SAI(sezStatusApplicationId, "Address of Applicant Firm/Company");
		} catch (NoSuchSezOccupantGeneralBussinessAddressException e) {
		}
        try {
        	adddressSponsorOrRegisteredHeadOffice=SezOccupantGeneralBussinessAddressLocalServiceUtil.
					getSezStatusBy_AT_SAI(sezStatusApplicationId, "Address of Sponsor/Registered Head Office");
		} catch (Exception e) {
		}
        try {
        	addressOfAuthorisedRepresentative=SezOccupantGeneralBussinessAddressLocalServiceUtil.
					getSezStatusBy_AT_SAI(sezStatusApplicationId, "Address of Authorised Representative");
		} catch (Exception e) {
		}
        try {
        	shareHoldingInfo=SezOccupantShareHoldingInfoLocalServiceUtil.getSezStatusBy_App_Id(sezStatusApplicationId);
        }catch (Exception e) {
		}try {
        	directorPartnerSponsorInfo=SezOccupantDirectorPartnerSponsorInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
        	principleDirector=SezOccupantPrincipleDirectorLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
        	occupantPrincipleOfficer=SezOccupantPrincipleOfficerLocalServiceUtil.getPrincipleOfficerById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
        	projectBriefInfo=SezOccupantExistingProposedProjectBriefInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
        	locationAddBox=SezOccLocationAddLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
        	areaDevelopmentPlanInfo=SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
        	investAndFinanceInfo=SezOccupantInvestAndFinanceInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
        	employmentInfo=SezOccupantEmploymentInfoLocalServiceUtil.getSezStatusBy_ID(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
        	occupantUserUndertakingInfo=SezOccupantUserUndertakingInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
        	developerUndertakingInfo=SezOccupanteDeveloperUndertakingInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
        	occSubmissionChecklistInfo=SezOccupanteSubmissionChecklistInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
        	sezOccupanyPayment=SezStatusAppPaymentLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
        }catch (Exception e) {
		}
		if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
					"sez-occupant-1");
		} else {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
					"sez-occupant");
		}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
             "[$Applicationdate$]","[$SEZDeveloper$]","[$SezControl$]","[$CompanyNa$]","[$BuildingNoStreet$]","[$TownC$]",
             "[$Parish$]","[$RName$]","[$BuildingNo$]","[$TownCit$]","[$ParishZip$]","[$ContryNam$]",
             "[$ComName$]","[$StreetAddress$]","[$CityAdd$]","[$ZipCode$]","[$ContryAdd]",
             "[$CompaniesAct$]","[$OfIncorporation$]","[$PleaseSpecify1$]","[$TrnNumber]","[$GctNumber$]","[$TccCertificate$]",
//             for the next
             "[$Authorised$]","[$Subscribed$]","[$PaidCapital$]",
//add one             
             "[$CoName1$]","[$StreetAddress1$]","[$Zip1$]","[$Country1$]",
             "[$CoName2$]","[$StreetAddress2$]","[$Zip2$]","[$Country2$]",
             "[$CoName3$]","[$StreetAddress3$]","[$Zip3$]","[$Country3$]",
             "[$CoName4$]","[$StreetAddress4$]","[$Zip4$]","[$Country4$]",
             "[$CoName5$]","[$StreetAddress5$]","[$Zip5$]","[$Country5$]",
//             principal shareholder/directors shareholder
             "[$Shareholder1$]","[$Nationality1$]","[$Shares1$]",
             "[$Shareholder2$]","[$Nationality2$]","[$Shares2$]",
             "[$Shareholder3$]","[$Nationality3$]","[$Shares3$]",
             "[$Shareholder4$]","[$Nationality4$]","[$Shares4$]",
             "[$Shareholder5$]","[$Nationality5$]","[$Shares5$]",
//             for the principal officers 
             "[$NameZone1$]","[$Position1$]",
             "[$NameZone2$]","[$Position2$]",
             "[$NameZone3$]","[$Position3$]",
             "[$NameZone4$]","[$Position4$]",
             "[$NameZone5$]","[$Position5$]",
//             yaha tak sahi hai
             "[$BriefDescription$]","[$FreeZone$]","[$DateApplication$]","[$TypeProposed$]","[$ZoneStatus$]"
//             for the location 
             ,"[$Developers1$]","[$Description1$]","[$Developers2$]","[$Description2$]","[$Developers3$]","[$Description3$]",
             "[$Developers4$]","[$Description4$]","[$Developers5$]","[$Description5$]",
//            location of occupant 
            "[$StreetAddressNo$]","[$Town1$]","[$ParishL$]","[$TechnicalCompleted$]"
//            boundaries 
            ,"[$North$]","[$East$]","[$West$]","[$South$]","[$Ownership$]","[$Years$]","[$Volume$]",
            "[$Folio$]","[$FloorNumber$]","[$ServiceActivities$]","[$ManufacturingActivities$]",
//            distance from the nearest  
            "[$SeaKM$]","[$SeaMi$]","[$AirKM$]","[$AirMi$]","[$RoadKM$]","[$RoadMi$]",
            "[$RailKM$]","[$RailMi$]","[$CusKM$]","[$CusMi$]",
//            procesed Area development plan
            "[$ProcessingArea$]","[$Non-processing$]",
             "[$Offices$]","[$Warehousing$]","[$Other Area$]","[$SquareMetres$]",
//             investment and financial
             "[$BuildingF$]","[$EquipmentF$]",
             "[$Machines$]","[$Total$]","[$OfFinance$]",
             
//           projected labour
             "[$Year1$]","[$Direct1$]","[$Male1$]","[$Female1$]","[$Local1$]","[$Foreign1$]",
             "[$Year2$]","[$Direct2$]","[$Male2$]","[$Female2$]","[$Local2$]","[$Foreign2$]",
             "[$Year3$]","[$Direct3$]","[$Male3$]","[$Female3$]","[$Local3$]","[$Foreign3$]",
             "[$Year4$]","[$Direct4$]","[$Male4$]","[$Female4$]","[$Local4$]","[$Foreign4$]",
             "[$Year5$]","[$Direct5$]","[$Male5$]","[$Female5$]","[$Local5$]","[$Foreign5$]",
//             final done
//             
             "[$TitleofApplicant$]","[$NameApplicant$]","[$Telephone$]","[$Email$]","[$Date$]",
//             yaha add karani hain fields
             "[$NotaryPublic$]","[$CreateDateS$]",
             
//             for the developer undertaking
             "[$DevelopersName$]","[$ApprovalNo$]","[$DateTo$]","[$SEZDeveloperTo$]","[$TiDate$]",
             "[$ControlNumber$]","[$TitleofApp$]","[$ApplicantName$]","[$TelephoneNumber$]","[$EmailAddr$]",
             "[$DateDev$]","[$NotaryPublicNam$]",
//             ye 3 abhi ab hi add huyi hain
//             "[$CreateDate1$]",
//             ,"[$Signature1$]","[$Stamp1$]",
             
//           for the general one 
             "[$General$]","[$CompanyInformation$]","[$SwornStatements$]","[$SupportingDocuments$]",
             "[$FacilitiesRequirments$]","[$Approvals$]","[$OccupationalSafety$]","[$BusinessPlan$]","[$SwornName$]",
             "[$SDate$]"
			},
    new String[] {
Validator.isNotNull(zoneBusinessInfo)&&Validator.isNotNull(zoneBusinessInfo.getOccAppDate())?dateFormat.format(zoneBusinessInfo.getOccAppDate()):"",
Validator.isNotNull(zoneBusinessInfo)&&Validator.isNotNull(zoneBusinessInfo.getOccSezDevName())?zoneBusinessInfo.getOccSezDevName():"",
Validator.isNotNull(zoneBusinessInfo)&&Validator.isNotNull(zoneBusinessInfo.getOccSezDevControlNum())?zoneBusinessInfo.getOccSezDevControlNum():"",
Validator.isNotNull(addressOfCompany)&&Validator.isNotNull(addressOfCompany.getOccName())?addressOfCompany.getOccName():"",
Validator.isNotNull(addressOfCompany)&&Validator.isNotNull(addressOfCompany.getOccStreetAddress())?addressOfCompany.getOccStreetAddress():"",
Validator.isNotNull(zoneBusinessInfo)&&Validator.isNotNull(addressOfCompany.getOccTown())?addressOfCompany.getOccTown():"",
Validator.isNotNull(zoneBusinessInfo)&&Validator.isNotNull(addressOfCompany.getOccParish())?addressOfCompany.getOccParish():"",
Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice)&&Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice.getOccName())?adddressSponsorOrRegisteredHeadOffice.getOccName():"",
Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice)&&Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice.getOccStreetAddress())?adddressSponsorOrRegisteredHeadOffice.getOccStreetAddress():"",
Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice)&&Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice.getOccTown())?adddressSponsorOrRegisteredHeadOffice.getOccTown():"",
Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice)&&Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice.getOccParish())?adddressSponsorOrRegisteredHeadOffice.getOccParish():"",
Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice)&&Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice.getOccCountry())?adddressSponsorOrRegisteredHeadOffice.getOccCountry():"",
Validator.isNotNull(addressOfAuthorisedRepresentative)&&Validator.isNotNull(addressOfAuthorisedRepresentative.getOccName())?addressOfAuthorisedRepresentative.getOccName():"",
Validator.isNotNull(addressOfAuthorisedRepresentative)&&Validator.isNotNull(addressOfAuthorisedRepresentative.getOccStreetAddress())?addressOfAuthorisedRepresentative.getOccStreetAddress():"",
Validator.isNotNull(addressOfAuthorisedRepresentative)&&Validator.isNotNull(addressOfAuthorisedRepresentative.getOccTown())?addressOfAuthorisedRepresentative.getOccTown():"",
Validator.isNotNull(addressOfAuthorisedRepresentative)&&Validator.isNotNull(addressOfAuthorisedRepresentative.getOccParish())?addressOfAuthorisedRepresentative.getOccParish():"",
Validator.isNotNull(addressOfAuthorisedRepresentative)&&Validator.isNotNull(addressOfAuthorisedRepresentative.getOccCountry())?addressOfAuthorisedRepresentative.getOccCountry():"",
Validator.isNotNull(zoneBusinessInfo)&&Validator.isNotNull(zoneBusinessInfo.getOccExistingCom())?zoneBusinessInfo.getOccExistingCom():"",
Validator.isNotNull(zoneBusinessInfo)&&Validator.isNotNull(zoneBusinessInfo.getOccFormArticle())?zoneBusinessInfo.getOccFormArticle():"",
Validator.isNotNull(zoneBusinessInfo)&&Validator.isNotNull(zoneBusinessInfo.getOccFormArticleOther())?zoneBusinessInfo.getOccFormArticleOther():"",
Validator.isNotNull(zoneBusinessInfo)&&Validator.isNotNull(zoneBusinessInfo.getOccTRN())?zoneBusinessInfo.getOccTRN():"",
Validator.isNotNull(zoneBusinessInfo)&&Validator.isNotNull(zoneBusinessInfo.getOccGCT())?zoneBusinessInfo.getOccGCT():"",
Validator.isNotNull(zoneBusinessInfo)&&Validator.isNotNull(zoneBusinessInfo.getOccTCC())?zoneBusinessInfo.getOccTCC():"",
Validator.isNotNull(shareHoldingInfo)&&Validator.isNotNull(shareHoldingInfo.getOccAuthorised())?shareHoldingInfo.getOccAuthorised():"",
Validator.isNotNull(shareHoldingInfo)&&Validator.isNotNull(shareHoldingInfo.getOccAuthorised())?shareHoldingInfo.getOccSubscribed():"",
Validator.isNotNull(shareHoldingInfo)&&Validator.isNotNull(shareHoldingInfo.getOccPaidCapital())?shareHoldingInfo.getOccPaidCapital():"",
directorPartnerSponsorInfo!=null&&directorPartnerSponsorInfo.size()>0?directorPartnerSponsorInfo.get(0).getOccDirectorName():"",
directorPartnerSponsorInfo!=null&&directorPartnerSponsorInfo.size()>0?directorPartnerSponsorInfo.get(0).getOccDirectorStreetAddress():"",
directorPartnerSponsorInfo!=null&&directorPartnerSponsorInfo.size()>0?directorPartnerSponsorInfo.get(0).getOccDirectorZipCode():"",
directorPartnerSponsorInfo!=null&&directorPartnerSponsorInfo.size()>0?directorPartnerSponsorInfo.get(0).getOccDirectorCountry():"",
directorPartnerSponsorInfo!=null&&directorPartnerSponsorInfo.size()>1?directorPartnerSponsorInfo.get(1).getOccDirectorName():"",
directorPartnerSponsorInfo!=null&&directorPartnerSponsorInfo.size()>1?directorPartnerSponsorInfo.get(1).getOccDirectorStreetAddress():"",
directorPartnerSponsorInfo!=null&&directorPartnerSponsorInfo.size()>1?directorPartnerSponsorInfo.get(1).getOccDirectorZipCode():"",
directorPartnerSponsorInfo!=null&&directorPartnerSponsorInfo.size()>1?directorPartnerSponsorInfo.get(1).getOccDirectorCountry():"",
directorPartnerSponsorInfo!=null&&directorPartnerSponsorInfo.size()>2?directorPartnerSponsorInfo.get(2).getOccDirectorName():"",
directorPartnerSponsorInfo!=null&&directorPartnerSponsorInfo.size()>2?directorPartnerSponsorInfo.get(2).getOccDirectorStreetAddress():"",
directorPartnerSponsorInfo!=null&&directorPartnerSponsorInfo.size()>2?directorPartnerSponsorInfo.get(2).getOccDirectorZipCode():"",
directorPartnerSponsorInfo!=null&&directorPartnerSponsorInfo.size()>2?directorPartnerSponsorInfo.get(2).getOccDirectorCountry():"",
directorPartnerSponsorInfo!=null&&directorPartnerSponsorInfo.size()>3?directorPartnerSponsorInfo.get(3).getOccDirectorName():"",
directorPartnerSponsorInfo!=null&&directorPartnerSponsorInfo.size()>3?directorPartnerSponsorInfo.get(3).getOccDirectorStreetAddress():"",
directorPartnerSponsorInfo!=null&&directorPartnerSponsorInfo.size()>3?directorPartnerSponsorInfo.get(3).getOccDirectorZipCode():"",
directorPartnerSponsorInfo!=null&&directorPartnerSponsorInfo.size()>3?directorPartnerSponsorInfo.get(3).getOccDirectorCountry():"",
directorPartnerSponsorInfo!=null&&directorPartnerSponsorInfo.size()>4?directorPartnerSponsorInfo.get(4).getOccDirectorName():"",
directorPartnerSponsorInfo!=null&&directorPartnerSponsorInfo.size()>4?directorPartnerSponsorInfo.get(4).getOccDirectorStreetAddress():"",
directorPartnerSponsorInfo!=null&&directorPartnerSponsorInfo.size()>4?directorPartnerSponsorInfo.get(4).getOccDirectorZipCode():"",
directorPartnerSponsorInfo!=null&&directorPartnerSponsorInfo.size()>4?directorPartnerSponsorInfo.get(4).getOccDirectorCountry():"",
		
		
		
principleDirector!=null&&principleDirector.size()>0?principleDirector.get(0).getOccShareholderName():"",
principleDirector!=null&&principleDirector.size()>0?principleDirector.get(0).getOccShareholderNation():"",
principleDirector!=null&&principleDirector.size()>0?principleDirector.get(0).getOccShareholderShares():"",
principleDirector!=null&&principleDirector.size()>1?principleDirector.get(1).getOccShareholderName():"",
principleDirector!=null&&principleDirector.size()>1?principleDirector.get(1).getOccShareholderNation():"",
principleDirector!=null&&principleDirector.size()>1?principleDirector.get(1).getOccShareholderShares():"",
principleDirector!=null&&principleDirector.size()>2?principleDirector.get(2).getOccShareholderName():"",
principleDirector!=null&&principleDirector.size()>2?principleDirector.get(2).getOccShareholderNation():"",
principleDirector!=null&&principleDirector.size()>2?principleDirector.get(2).getOccShareholderShares():"",
principleDirector!=null&&principleDirector.size()>3?principleDirector.get(3).getOccShareholderName():"",
principleDirector!=null&&principleDirector.size()>3?principleDirector.get(3).getOccShareholderNation():"",
principleDirector!=null&&principleDirector.size()>3?principleDirector.get(3).getOccShareholderShares():"",
principleDirector!=null&&principleDirector.size()>4?principleDirector.get(4).getOccShareholderName():"",
principleDirector!=null&&principleDirector.size()>4?principleDirector.get(4).getOccShareholderNation():"",
principleDirector!=null&&principleDirector.size()>4?principleDirector.get(4).getOccShareholderShares():"",
		
		
occupantPrincipleOfficer!=null&&occupantPrincipleOfficer.size()>0?occupantPrincipleOfficer.get(0).getName():"",
occupantPrincipleOfficer!=null&&occupantPrincipleOfficer.size()>0?occupantPrincipleOfficer.get(0).getPosition():"",
occupantPrincipleOfficer!=null&&occupantPrincipleOfficer.size()>1?occupantPrincipleOfficer.get(1).getName():"",
occupantPrincipleOfficer!=null&&occupantPrincipleOfficer.size()>1?occupantPrincipleOfficer.get(1).getPosition():"",
occupantPrincipleOfficer!=null&&occupantPrincipleOfficer.size()>2?occupantPrincipleOfficer.get(2).getName():"",
occupantPrincipleOfficer!=null&&occupantPrincipleOfficer.size()>2?occupantPrincipleOfficer.get(2).getPosition():"",
occupantPrincipleOfficer!=null&&occupantPrincipleOfficer.size()>3?occupantPrincipleOfficer.get(3).getName():"",
occupantPrincipleOfficer!=null&&occupantPrincipleOfficer.size()>3?occupantPrincipleOfficer.get(3).getPosition():"",
occupantPrincipleOfficer!=null&&occupantPrincipleOfficer.size()>4?occupantPrincipleOfficer.get(4).getName():"",
occupantPrincipleOfficer!=null&&occupantPrincipleOfficer.size()>4?occupantPrincipleOfficer.get(4).getPosition():"",
//		yaha tak sahi hai
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccBusinessDesc())?projectBriefInfo.getOccBusinessDesc():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccDeniedFreeZoneAppr())?projectBriefInfo.getOccDeniedFreeZoneAppr():"",
//		date change karani hai iss mai 
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccDeniedFreeZoneApprDate())?dateFormat.format(projectBriefInfo.getOccDeniedFreeZoneApprDate()):"",
//Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccDeniedFreeZoneApprDate())?dateFormat.format(projectBriefInfo.getOccDeniedFreeZoneApprDate()):"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccDeniedFreeZoneApprType())?projectBriefInfo.getOccDeniedFreeZoneApprType():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccFreeZoneLocation())?projectBriefInfo.getOccFreeZoneLocation():"",
		
locationAddBox!=null&&locationAddBox.size()>0?locationAddBox.get(0).getDeveloperLocation():"",
locationAddBox!=null&&locationAddBox.size()>0?locationAddBox.get(0).getDeveloperLocationDescription():"",
locationAddBox!=null&&locationAddBox.size()>1?locationAddBox.get(1).getDeveloperLocation():"",
locationAddBox!=null&&locationAddBox.size()>1?locationAddBox.get(1).getDeveloperLocationDescription():"",
locationAddBox!=null&&locationAddBox.size()>2?locationAddBox.get(2).getDeveloperLocation():"",
locationAddBox!=null&&locationAddBox.size()>2?locationAddBox.get(2).getDeveloperLocationDescription():"",
locationAddBox!=null&&locationAddBox.size()>3?locationAddBox.get(3).getDeveloperLocation():"",
locationAddBox!=null&&locationAddBox.size()>3?locationAddBox.get(3).getDeveloperLocationDescription():"",
locationAddBox!=null&&locationAddBox.size()>4?locationAddBox.get(4).getDeveloperLocation():"",
locationAddBox!=null&&locationAddBox.size()>4?locationAddBox.get(4).getDeveloperLocationDescription():"",
//	yaha tak sahi hai sec shift 
		
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccSubConcessionBuilding())?projectBriefInfo.getOccSubConcessionBuilding():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccSubConcessionTown())?projectBriefInfo.getOccSubConcessionTown():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccSubConcessionParish())?projectBriefInfo.getOccSubConcessionParish():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccCompleteSurveyTechDesc())?projectBriefInfo.getOccCompleteSurveyTechDesc():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccNorthBoundaries())?projectBriefInfo.getOccNorthBoundaries():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccEastBoundaries())?projectBriefInfo.getOccEastBoundaries():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccWestBoundaries())?projectBriefInfo.getOccWestBoundaries():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccSouthBoundaries())?projectBriefInfo.getOccSouthBoundaries():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccOwnership())?projectBriefInfo.getOccOwnership():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccLeaseYears())?projectBriefInfo.getOccLeaseYears():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccVolume())?projectBriefInfo.getOccVolume():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccFolio())?projectBriefInfo.getOccFolio():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccFloorNum())?projectBriefInfo.getOccFloorNum():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccUndertakenService())?projectBriefInfo.getOccUndertakenService():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccUndertakenManufacturing())?projectBriefInfo.getOccUndertakenManufacturing():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccSeaPortDistanceKM())?projectBriefInfo.getOccSeaPortDistanceKM():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccSeaPortDistanceMI())?projectBriefInfo.getOccSeaPortDistanceMI():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccAirportDistanceKM())?projectBriefInfo.getOccAirportDistanceKM():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccAirportDistanceMI())?projectBriefInfo.getOccAirportDistanceMI():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccRoadDistanceKM())?projectBriefInfo.getOccRoadDistanceKM():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccRoadDistanceMI())?projectBriefInfo.getOccRoadDistanceMI():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccRailDistanceKM())?projectBriefInfo.getOccRailDistanceKM():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccRailDistanceMI())?projectBriefInfo.getOccRailDistanceMI():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccCustomDistanceKM())?projectBriefInfo.getOccCustomDistanceKM():"",
Validator.isNotNull(projectBriefInfo)&&Validator.isNotNull(projectBriefInfo.getOccCustomDistanceMI())?projectBriefInfo.getOccCustomDistanceMI():"",
// procesed Area development plan 
Validator.isNotNull(areaDevelopmentPlanInfo)&&Validator.isNotNull(areaDevelopmentPlanInfo.getOccProcessingArea())?areaDevelopmentPlanInfo.getOccProcessingArea():"",
Validator.isNotNull(areaDevelopmentPlanInfo)&&Validator.isNotNull(areaDevelopmentPlanInfo.getOccNonProcessingArea())?areaDevelopmentPlanInfo.getOccNonProcessingArea():"",
Validator.isNotNull(areaDevelopmentPlanInfo)&&Validator.isNotNull(areaDevelopmentPlanInfo.getOccOfficeRequirement())?areaDevelopmentPlanInfo.getOccOfficeRequirement():"",
Validator.isNotNull(areaDevelopmentPlanInfo)&&Validator.isNotNull(areaDevelopmentPlanInfo.getOccFactoryRequirement())?areaDevelopmentPlanInfo.getOccFactoryRequirement():"",
Validator.isNotNull(areaDevelopmentPlanInfo)&&Validator.isNotNull(areaDevelopmentPlanInfo.getOccOtherAreaReqName())?areaDevelopmentPlanInfo.getOccOtherAreaReqName():"",
Validator.isNotNull(areaDevelopmentPlanInfo)&&Validator.isNotNull(areaDevelopmentPlanInfo.getOccOtherAreaRequirement())?areaDevelopmentPlanInfo.getOccOtherAreaRequirement():"",
//	for the investAndFinanceInfo
Validator.isNotNull(investAndFinanceInfo)&&Validator.isNotNull(investAndFinanceInfo.getOccInfraBuilding())?investAndFinanceInfo.getOccInfraBuilding():"",
Validator.isNotNull(investAndFinanceInfo)&&Validator.isNotNull(investAndFinanceInfo.getOccInfraEquipment())?investAndFinanceInfo.getOccInfraEquipment():"",
Validator.isNotNull(investAndFinanceInfo)&&Validator.isNotNull(investAndFinanceInfo.getOccInfraMachines())?investAndFinanceInfo.getOccInfraMachines():"",
Validator.isNotNull(investAndFinanceInfo)&&Validator.isNotNull(investAndFinanceInfo.getOccInfraTotal())?investAndFinanceInfo.getOccInfraTotal():"",
Validator.isNotNull(investAndFinanceInfo)&&Validator.isNotNull(investAndFinanceInfo.getOccInfraFinanceSource())?investAndFinanceInfo.getOccInfraFinanceSource():"",
		
//for the projected labour
(employmentInfo!=null)&&(employmentInfo.size()>0)?employmentInfo.get(0).getOccLabourYear():"",
(employmentInfo!=null)&&(employmentInfo.size()>0)?employmentInfo.get(0).getOccLabourDirect():"",
(employmentInfo!=null)&&(employmentInfo.size()>0)?employmentInfo.get(0).getOccLabourMale():"",
(employmentInfo!=null)&&(employmentInfo.size()>0)?employmentInfo.get(0).getOccLabourFemale():"",
(employmentInfo!=null)&&(employmentInfo.size()>0)?employmentInfo.get(0).getOccLabourLocal():"",
(employmentInfo!=null)&&(employmentInfo.size()>0)?employmentInfo.get(0).getOccLabourForeign():"",
(employmentInfo!=null)&&(employmentInfo.size()>1)?employmentInfo.get(1).getOccLabourYear():"",
(employmentInfo!=null)&&(employmentInfo.size()>1)?employmentInfo.get(1).getOccLabourDirect():"",
(employmentInfo!=null)&&(employmentInfo.size()>1)?employmentInfo.get(1).getOccLabourMale():"",
(employmentInfo!=null)&&(employmentInfo.size()>1)?employmentInfo.get(1).getOccLabourFemale():"",
(employmentInfo!=null)&&(employmentInfo.size()>1)?employmentInfo.get(1).getOccLabourLocal():"",
(employmentInfo!=null)&&(employmentInfo.size()>1)?employmentInfo.get(1).getOccLabourForeign():"",
(employmentInfo!=null)&&(employmentInfo.size()>2)?employmentInfo.get(2).getOccLabourYear():"",
(employmentInfo!=null)&&(employmentInfo.size()>2)?employmentInfo.get(2).getOccLabourDirect():"",
(employmentInfo!=null)&&(employmentInfo.size()>2)?employmentInfo.get(2).getOccLabourMale():"",
(employmentInfo!=null)&&(employmentInfo.size()>2)?employmentInfo.get(2).getOccLabourFemale():"",
(employmentInfo!=null)&&(employmentInfo.size()>2)?employmentInfo.get(2).getOccLabourLocal():"",
(employmentInfo!=null)&&(employmentInfo.size()>2)?employmentInfo.get(2).getOccLabourForeign():"",
(employmentInfo!=null)&&(employmentInfo.size()>3)?employmentInfo.get(3).getOccLabourYear():"",
(employmentInfo!=null)&&(employmentInfo.size()>3)?employmentInfo.get(3).getOccLabourDirect():"",
(employmentInfo!=null)&&(employmentInfo.size()>3)?employmentInfo.get(3).getOccLabourMale():"",
(employmentInfo!=null)&&(employmentInfo.size()>3)?employmentInfo.get(3).getOccLabourFemale():"",
(employmentInfo!=null)&&(employmentInfo.size()>3)?employmentInfo.get(3).getOccLabourLocal():"",
(employmentInfo!=null)&&(employmentInfo.size()>3)?employmentInfo.get(3).getOccLabourForeign():"",
(employmentInfo!=null)&&(employmentInfo.size()>4)?employmentInfo.get(4).getOccLabourYear():"",
(employmentInfo!=null)&&(employmentInfo.size()>4)?employmentInfo.get(4).getOccLabourDirect():"",
(employmentInfo!=null)&&(employmentInfo.size()>4)?employmentInfo.get(4).getOccLabourMale():"",
(employmentInfo!=null)&&(employmentInfo.size()>4)?employmentInfo.get(4).getOccLabourFemale():"",
(employmentInfo!=null)&&(employmentInfo.size()>4)?employmentInfo.get(4).getOccLabourLocal():"",
(employmentInfo!=null)&&(employmentInfo.size()>4)?employmentInfo.get(4).getOccLabourForeign():"",
		
		
//yaha add honihai Fields
		
//for the occupant zone user undertaking
Validator.isNotNull(occupantUserUndertakingInfo)&&Validator.isNotNull(occupantUserUndertakingInfo.getOccApplicantTitle())?occupantUserUndertakingInfo.getOccApplicantTitle():"",
Validator.isNotNull(occupantUserUndertakingInfo)&&Validator.isNotNull(occupantUserUndertakingInfo.getOccApplicantName())?occupantUserUndertakingInfo.getOccApplicantName():"",
Validator.isNotNull(occupantUserUndertakingInfo)&&Validator.isNotNull(occupantUserUndertakingInfo.getOccApplicantTeleNum())?occupantUserUndertakingInfo.getOccApplicantTeleNum():"",
Validator.isNotNull(occupantUserUndertakingInfo)&&Validator.isNotNull(occupantUserUndertakingInfo.getOccApplicantEmail())?occupantUserUndertakingInfo.getOccApplicantEmail():"",
//		signature 
Validator.isNotNull(occupantUserUndertakingInfo)&&Validator.isNotNull(occupantUserUndertakingInfo.getOccApplicantSignDate())?dateFormat.format(occupantUserUndertakingInfo.getOccApplicantSignDate()):"",
Validator.isNotNull(occupantUserUndertakingInfo)&&Validator.isNotNull(occupantUserUndertakingInfo.getOccPublicNotaryName())?occupantUserUndertakingInfo.getOccPublicNotaryName():"",
//		signature 
Validator.isNotNull(occupantUserUndertakingInfo)&&Validator.isNotNull(occupantUserUndertakingInfo.getOccPublicNotarySignDate())?dateFormat.format(occupantUserUndertakingInfo.getOccPublicNotarySignDate()):"",
		
//					for developer untertaking 
Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccUndertakingDevName())?developerUndertakingInfo.getOccUndertakingDevName():"",
Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccUndertakingApprLetter())?developerUndertakingInfo.getOccUndertakingApprLetter():"",
Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccUndertakingDate())?dateFormat.format(developerUndertakingInfo.getOccUndertakingDate()):"",
Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccUndertakingAgreeNum())?developerUndertakingInfo.getOccUndertakingAgreeNum():"",
Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccUndertakingAgreeDate())?dateFormat.format(developerUndertakingInfo.getOccUndertakingAgreeDate()):"",		
Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccUndertakingControlNum())?developerUndertakingInfo.getOccUndertakingControlNum():"",
Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccDevApplicantTitle())?developerUndertakingInfo.getOccDevApplicantTitle():"",
Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccDevApplicantName())?developerUndertakingInfo.getOccDevApplicantName():"",
Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccDevApplicantTele())?developerUndertakingInfo.getOccDevApplicantTele():"",
Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccDevApplicantSignDate())?dateFormat.format(developerUndertakingInfo.getOccDevApplicantSignDate()):"",
Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccDevPublicNotaryName())?developerUndertakingInfo.getOccDevPublicNotaryName():"",
Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccDevPublicNotarySignDate())?dateFormat.format(developerUndertakingInfo.getOccDevPublicNotarySignDate()):"",
//for the submission checklist
Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccGeneral())?occSubmissionChecklistInfo.getOccGeneral():"",
Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccComInfoRequest())?occSubmissionChecklistInfo.getOccComInfoRequest():"",
Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSwanStateRequest())?occSubmissionChecklistInfo.getOccSwanStateRequest():"",
Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedRequest())?occSubmissionChecklistInfo.getOccSelectedRequest():"",
Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedFacilityRequest())?occSubmissionChecklistInfo.getOccSelectedFacilityRequest():"",
Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedApprovals())?occSubmissionChecklistInfo.getOccSelectedApprovals():"",
Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedSecurityRequest())?occSubmissionChecklistInfo.getOccSelectedSecurityRequest():"",
Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedSDetailedBussiness())?occSubmissionChecklistInfo.getOccSelectedSDetailedBussiness():"",
Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccPaidShareCapProof())?occSubmissionChecklistInfo.getOccPaidShareCapProof():"",
Validator.isNotNull(sezStatusApplication)&&Validator.isNotNull(sezStatusApplication.getCreateDate())?dateFormat.format(sezStatusApplication.getCreateDate()):"",

					});
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Sez Status Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(sezStatusApplication.getSezStatusApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
		}
		if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
			String fileName = null;
			String title = null;
			String certificateCopyOfTheMemorandum = null;
			String certificateOfIncorporation = null;
			String certificateCopyOfTax = null;
			String certifiedCopyOfGen = null;
			String certifiedCopyOfTaxCompliance = null;
			String affidacvitSetting = null;
			String copyOfProposed = null;
			String surveyorId = null;
			String surveyorTechnical = null;
			String surveyorIdSite = null;
			String businessPlan = null;

				try {
					String previewUrl = replaceSignforSezOccupantDevUndertakingSignature(sezStatusApplication.getSezStatusApplicationId(),
							"SEZ Status Supported Documents", themeDisplay.getScopeGroupId(),
							supportingDocumentsFolder.getFolderId(), themeDisplay);
					
					String previewUrlOfStamp = replaceSignforSezOccupantDevUndertakingStamp(sezStatusApplication.getSezStatusApplicationId(),
							"SEZ Status Supported Documents", themeDisplay.getScopeGroupId(),
							supportingDocumentsFolder.getFolderId(), themeDisplay);
					{
						pdfTemplate = StringUtil.replace(pdfTemplate, new String[] { "[$SignatureS$]","[$StampS$]" },
								new String[] { previewUrl ,previewUrlOfStamp});
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

				for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
				try {
					fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
				} catch (PortalException e) {
					e.printStackTrace();
				}
				fileName = fileEntry.getFileName();
				title = fileEntry.getTitle();
				if (title.equals("Certified copy of the memorandum and articles of association")) {
					certificateCopyOfTheMemorandum = fileName;
				} else if (title.equals(
						"Certificate of incorporation")) {
					certificateOfIncorporation = fileName;
				} else if (title.equals("Certified copy of Tax Registration Number")) {
					certificateCopyOfTax = fileName;
				} else if (title.equals("Certified copy of General Consumption Tax number")) {
					certifiedCopyOfGen = fileName;
				} else if (title.equals("Certified copy of Tax Compliance Certificate")) {
					certifiedCopyOfTaxCompliance = fileName;
				}else if (title.equals("Affidavit - setting forth all relevant commercial information of the Applicant including its name address nationality owners board of directors")) {
					affidacvitSetting = fileName;
				}else if (title.equals("Copy of proposed sub-concession lease agreement")) {
					copyOfProposed = fileName;
				}else if (title.equals("Surveyor ID report")) {
					surveyorId = fileName;
				}else if (title.equals("Surveyor Technical Description")) {
					surveyorTechnical = fileName;
				}else if (title.equals("Surveyor ID Site Plan")) {
					surveyorIdSite = fileName;
				}else if (title.equals("Business Plan")) {
					businessPlan = fileName;
				}
			}
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//		for the document 
"[$Certifiedcopy$]","[$Certificate$]","[$RegistrationNumber$]","[$ConsumptionTax$]","[$CopyofTax$]","[$AffidavitSetting$]",
"[$LeaseAgreement$]","[$IDReport$]","[$TechnicalDescription$]","[$IDSitePlan$]","[$BusinessPlanDoc$]","[$PaymentMethod$]"
				},
		new String[] {certificateCopyOfTheMemorandum,
							certificateOfIncorporation,certificateCopyOfTax,certifiedCopyOfGen,
							certifiedCopyOfTaxCompliance,affidacvitSetting,
							copyOfProposed,surveyorId,surveyorTechnical,surveyorIdSite,
							businessPlan,
							Validator.isNotNull(sezOccupanyPayment)&&Validator.isNotNull(sezOccupanyPayment.getPaymentMethod())?sezOccupanyPayment.getPaymentMethod():""
					});
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
