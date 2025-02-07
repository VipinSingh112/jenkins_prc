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
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.sez.status.application.form.service.model.SezDevDisasterManagement;
import com.nbp.sez.status.application.form.service.model.SezDevDisasterManagementAdd;
import com.nbp.sez.status.application.form.service.model.SezDevEmplomentInfo;
import com.nbp.sez.status.application.form.service.model.SezDevEmployeeDefineOccuAdd;
import com.nbp.sez.status.application.form.service.model.SezDevEmployeeSafetyInfoAdd;
import com.nbp.sez.status.application.form.service.model.SezDevGenBusinessInfoAdd;
import com.nbp.sez.status.application.form.service.model.SezDevGeneralBusinessIfo;
import com.nbp.sez.status.application.form.service.model.SezDevInvestmentAndFinancial;
import com.nbp.sez.status.application.form.service.model.SezDevPropDevelopmentPlan;
import com.nbp.sez.status.application.form.service.model.SezDevProposedProject;
import com.nbp.sez.status.application.form.service.model.SezDevProposedProjectAdd;
import com.nbp.sez.status.application.form.service.model.SezDevShareComDirectorShipAdd;
import com.nbp.sez.status.application.form.service.model.SezDevShareCorporationBusAdd;
import com.nbp.sez.status.application.form.service.model.SezDevShareDirectorAdd;
import com.nbp.sez.status.application.form.service.model.SezDevSharePleaseStateAdd;
import com.nbp.sez.status.application.form.service.model.SezDevSharePrincipalAdd;
import com.nbp.sez.status.application.form.service.model.SezDevShareholdingInfo;
import com.nbp.sez.status.application.form.service.model.SezStatusAppPayment;
import com.nbp.sez.status.application.form.service.model.SezStatusApplication;
import com.nbp.sez.status.application.form.service.model.sezDeveloperUndertaking;
import com.nbp.sez.status.application.form.service.model.sezSubmissionChecklist;
import com.nbp.sez.status.application.form.service.service.SezDevDisasterManagementAddLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezDevDisasterManagementLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezDevEmplomentInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezDevEmployeeDefineOccuAddLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezDevEmployeeSafetyInfoAddLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezDevGenBusinessInfoAddLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezDevGeneralBusinessIfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezDevInvestmentAndFinancialLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezDevPropDevelopmentPlanLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezDevProposedProjectAddLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezDevProposedProjectLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezDevShareComDirectorShipAddLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezDevShareCorporationBusAddLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezDevShareDirectorAddLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezDevSharePleaseStateAddLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezDevSharePrincipalAddLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezDevShareholdingInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezStatusAppPaymentLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezStatusApplicationLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.sezDeveloperUndertakingLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.sezSubmissionChecklistLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Reference;

public class SezPdfForDeveloper {
	
	
	public static String sezPDfFOrDeveloper(long sezStatusApplicationId, ThemeDisplay themeDisplay, 
			String checkPdfSendingInLaunchCaseWithoutDoc){
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		String pdfTemplate= StringPool.BLANK;
		SezStatusApplication sezApplication=null;
		SezDevGeneralBusinessIfo sezDevGenBusiness=null;
		List<SezDevGenBusinessInfoAdd> sezDevGenBusAdd=null;
		SezDevShareholdingInfo sezDevShareHolder=null;
		List<SezDevSharePrincipalAdd> sezDevSharePrincipal=null;
		List<SezDevShareDirectorAdd> sezDevShareDirector=null;
		List<SezDevShareComDirectorShipAdd> sezDevShareComDir=null;
		List<SezDevShareCorporationBusAdd> sezDevCorpBus=null;
		List<SezDevSharePleaseStateAdd> sezDevPleaseShareAdd=null;
		SezDevProposedProject sezDevPropProject=null;
		List<SezDevProposedProjectAdd> sezDevPropProjAddress=null;
		SezDevPropDevelopmentPlan sezDevPropDevPLan=null;
		List<SezDevEmployeeSafetyInfoAdd> sezDevEmpSafetyInfo=null;
		List<SezDevEmployeeDefineOccuAdd> sezDevEmpDefOccu=null;
		SezDevEmplomentInfo sezDevEmployementInfo=null;
		SezDevDisasterManagement sezDevDisasterManagement=null;
		List<SezDevDisasterManagementAdd> sezDevDisasterManageAdd=null;
		SezDevInvestmentAndFinancial sezDevInvestmentAndFin=null;
		sezDeveloperUndertaking sezDevUndertaking=null;
		sezSubmissionChecklist sezSubmissionChecklist=null;
		SezStatusAppPayment sezDeveloperPayment=null;
		
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		
		//Signatures
		String signatureSezDevDeclarant= null;
		String signatureSezDevPublicNotary= null;
		String signatureSezDevChecklist= null;
		
		try {
			sezApplication=SezStatusApplicationLocalServiceUtil.getSezStatusApplication(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezDevGenBusiness= SezDevGeneralBusinessIfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezDevGenBusAdd= SezDevGenBusinessInfoAddLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezDevShareHolder=SezDevShareholdingInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezDevSharePrincipal=SezDevSharePrincipalAddLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezDevShareDirector=SezDevShareDirectorAddLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezDevShareComDir=SezDevShareComDirectorShipAddLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezDevCorpBus=SezDevShareCorporationBusAddLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezDevPleaseShareAdd= SezDevSharePleaseStateAddLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezDevPropProject=SezDevProposedProjectLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezDevPropProjAddress= SezDevProposedProjectAddLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezDevPropDevPLan= SezDevPropDevelopmentPlanLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezDevEmpSafetyInfo= SezDevEmployeeSafetyInfoAddLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezDevEmpDefOccu=SezDevEmployeeDefineOccuAddLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezDevEmployementInfo= SezDevEmplomentInfoLocalServiceUtil.getgetSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezDevDisasterManagement= SezDevDisasterManagementLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezDevDisasterManageAdd= SezDevDisasterManagementAddLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezDevInvestmentAndFin= SezDevInvestmentAndFinancialLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezDevUndertaking= sezDeveloperUndertakingLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezSubmissionChecklist= sezSubmissionChecklistLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}try {
			sezDeveloperPayment=SezStatusAppPaymentLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
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
			signatureSezDevDeclarant =replaceSignforSezDevUndertakingDeclarant(
					sezDevUndertaking.getSezStatusApplicationId(), "Signature of Developer Undertaking Declarant",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		
		try {
			signatureSezDevPublicNotary =replaceSignforSezDevUndertakingPublicNotary(
					sezDevUndertaking.getSezStatusApplicationId(), "Signature of Developer Public Notary",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		
		try {
			signatureSezDevChecklist =replaceSignforSezDevChecklist(
					sezSubmissionChecklist.getSezStatusApplicationId(), "Signature of Developer Submission Checklist",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		
		//Sending Pdf in launch case 	
		if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
					"sez-developer-1");
		} else {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
					"sez-developer");
		}
		try {
		pdfTemplate = StringUtil.replace(pdfTemplate,new String[]
			{ "[$Applicationdate$]", "[$ApplicantName$]", "[$CompanyName$]", "[$StreetAddress$]", "[$City$]",
			"[$ZipCode$]", "[$Country$]", "[$TelephoneNo$]", "[$FaxNo$]", "[$E-Mail$]","[$Website$]",
			
			//Address Local Head Office
			"[$BuildingNo$]", "[$Town$]", "[$ZipCode$]",
			
			//Authorised Representative
			"[$Name$]", "[$BuildingNoAdd$]", "[$TownCity$]", "[$ParishPo$]", "[$CountryA1$]","[$TelephoneNumber$]",
			"[$FaxN$]", "[$EAddress$]","[$PurposeVehicle$]",
			
//			for the add one 
			"[$Name1$]", "[$BuildingNo1$]", "[$TownsCity1$]", "[$ZipCodes1$]", "[$CountryN1$]","[$TelephoneNum1$]","[$FaxNum1$]","[$E-MailP1$]",
			"[$Name2$]", "[$BuildingNo2$]", "[$TownsCity2$]", "[$ZipCodes2$]", "[$CountryN2$]","[$TelephoneNum2$]","[$FaxNum2$]","[$E-MailP2$]",
			"[$Name3$]", "[$BuildingNo3$]", "[$TownsCity3$]", "[$ZipCodes3$]", "[$CountryN3$]","[$TelephoneNum3$]","[$FaxNum3$]","[$E-MailP3$]",
			"[$Name4$]", "[$BuildingNo4$]", "[$TownsCity4$]", "[$ZipCodes4$]", "[$CountryN4$]","[$TelephoneNum4$]","[$FaxNum4$]","[$E-MailP4$]",
			"[$Name5$]", "[$BuildingNo5$]", "[$TownsCity5$]", "[$ZipCodes5$]", "[$CountryN5$]","[$TelephoneNum5$]","[$FaxNum5$]","[$E-MailP5$]",
			
			"[$JamaicanCompany$]","[$OfIncorporation$]","[$PleaseSpecify1$]","[$Classified$]",
			"[$Taxpayer$]", "[$GeneralConsumption$]", "[$ComplianceCertificate$]",
			
			//Equity/Share Capital of the registered Jamaican entity to include Foreign Direct Investment
			"[$Authorised$]", "[$Subscribed$]", "[$Paidupshare$]",
			
			//Details of each of the Principal Shareholders
			"[$CompanyName1$]", "[$BuildingNof1$]", "[$Post1$]", "[$Country1$]", "[$Nationality1$]","[$TaxNumber1$]",
			"[$CompanyName2$]", "[$BuildingNof2$]", "[$Post2$]", "[$Country2$]", "[$Nationality2$]","[$TaxNumber2$]",
			"[$CompanyName3$]", "[$BuildingNof3$]", "[$Post3$]", "[$Country3$]", "[$Nationality3$]","[$TaxNumber3$]",
			"[$CompanyName4$]", "[$BuildingNof4$]", "[$Post4$]", "[$Country4$]", "[$Nationality4$]","[$TaxNumber4$]",
			"[$CompanyName5$]", "[$BuildingNof5$]", "[$Post5$]", "[$Country5$]", "[$Nationality5$]","[$TaxNumber5$]",
			
			//Principal Shareholders/Directors shareholding
			"[$Shareholder1$]", "[$Shares1$]",
			"[$Shareholder2$]", "[$Shares2$]",
			"[$Shareholder3$]", "[$Shares3$]",
			"[$Shareholder4$]", "[$Shares4$]",
			"[$Shareholder5$]", "[$Shares5$]",
			
			//List of company directorship/trustees/fiduciary positions 
			"[$Shareholderd1$]", "[$Sharesd1$]", "[$Relationshipd1$]",
			"[$Shareholderd2$]", "[$Sharesd2$]", "[$Relationshipd2$]",
			"[$Shareholderd3$]", "[$Sharesd3$]", "[$Relationshipd3$]",
			"[$Shareholderd4$]", "[$Sharesd4$]", "[$Relationshipd4$]",
			"[$Shareholderd5$]", "[$Sharesd5$]", "[$Relationshipd5$]",
			
			//Corporation/business and companies in which directors have held/holds ownership interest
			"[$Shareholderc1$]", "[$Sharesc1$]", "[$RelationshipC1$]",
			"[$Shareholderc2$]", "[$Sharesc2$]", "[$RelationshipC2$]",
			"[$Shareholderc3$]", "[$Sharesc3$]", "[$RelationshipC3$]",
			"[$Shareholderc4$]", "[$Sharesc4$]", "[$RelationshipC4$]",
			"[$Shareholderc5$]", "[$Sharesc5$]", "[$RelationshipC5$]",
			"[$shareholders$]",
			
			//Please state name of director(s)/shareholder(s)
			"[$NameP1$]",
			"[$NameP2$]",
			"[$NameP3$]",
			"[$NameP4$]",
			"[$NameP5$]",
			
			//SezDevProposedProject
			"[$FreeZone$]", "[$operating$]", "[$Providedescription$]",
			
			"[$NameZone1$]", "[$Parish1$]", 
			"[$NameZone2$]", "[$Parish2$]", 
			"[$NameZone3$]", "[$Parish3$]", 
			"[$NameZone4$]", "[$Parish4$]", 
			"[$NameZone5$]", "[$Parish5$]", 
			
		"[$Locally$]","[$Overseas$]","[$SEZ$]","[$application$]","[$Pleasedescribe$]",	
			"[$SeaKM$]", "[$SeaMi$]", "[$AirKM$]", "[$AirMi$]", "[$RoadKM$]", "[$RoadMi$]", 
			"[$RailKM$]", "[$RailMi$]", "[$CusKM$]", "[$CusMi$]", 
			"[$ProposedSEZ$]", 
			"[$Buildings$]", "[$Landarea$]", "[$Ownership$]", "[$PleaseSpecify$]", 
"[$NameA$]", "[$Address1$]", "[$Address2$]", "[$LeaseAgreement$]","[$AcquireLands$]", 
"[$ProposedArea$]", "[$EconomicZone$]", "[$Detailsofproject$]", 
			"[$Developerbusiness$]", "[$Identification$]", "[$EntityDevelopment$]", 
			"[$Volume$]",
			"[$Folio$]", "[$StreetAddressG$]", 
			"[$TownGreen$]", "[$ZipCodeGreen$]", "[$ZoningClassification$]", "[$LandUse$]",  
			
			"[$Hectares$]", "[$Acres$]", 
			"[$TotalHectares$]", "[$TotalAcres$]", "[$Topography$]", 
			
			"[$North$]", "[$East$]", "[$West$]", "[$South$]", 
			
			"[$Measurement$]", "[$Percent$]",
			"[$CommonMeasurement$]", "[$CommonPercent$]", 
			
			"[$BufferMeasurement$]", "[$BufferPercent$]",
			"[$UserMeasurement$]", "[$UserPercent$]", 
			
			"[$ResidentialMeasurement$]", "[$ResidentialPercent$]",
			"[$TotalMeasurement$]", "[$TotalPercent$]", 
			
			"[$Forindustrial$]","[$Fordrinking$]","[$Others$]", "[$Requirement$]", 
			"[$QuantumandNature$]","[$SpecifyOwn$]",
			"[$KilovoltAmpereKVA$]", 
			"[$RowWidth$]","[$TypeOfPavement$]","[$RoadRowWidth$]", "[$RoadTypeOfPavement$]","[$TertiaryRowWidth$]",
			"[$TertiaryPavement$]",
			"[$WasteWaterSystem$]","[$DistributionSystem$]","[$TelecommunicationInfrastructure$]", 
			"[$CircuitTelevision$]","[$RegulatoryAgencies$]","[$FireFighting$]", 
			"[$Detailedsecurity1$]","[$Detailedsecurity2$]","[$Detailedsecurity3$]", "[$Detailedsecurity4$]","[$Detailedsecurity5$]",
			"[$Policyprocedures1$]","[$Policyprocedures2$]","[$Policyprocedures3$]", "[$Policyprocedures4$]","[$Policyprocedures5$]",
			//EmployementInfo	
			"[$FDirect$]","[$FIndirect$]","[$Maledirect$]", "[$Femaledirect$]","[$FLocal$]","[$ForeignF$]",
			"[$YearDirect$]","[$YearIndirect$]","[$YearMale$]", "[$YearFemale$]","[$YearLocal$]","[$YearForeign$]",
			"[$ThirdDirect$]","[$ThirdIndirect$]","[$ThirdMale$]", "[$ThirdFemale$]","[$ThirdLocal$]","[$ThirdForeign$]",
			//DisasterManagement
			"[$EmergencyPlan$]",
			"[$Managementprocedures1$]","[$Managementprocedures2$]","[$Managementprocedures3$]", "[$Managementprocedures4$]",
			 "[$Managementprocedures5$]",
			//InvestmentAndFinancial
			"[$ValueofLand$]","[$BuildingCost$]","[$On-SiteInfrastructure$]", "[$Ports$]","[$AirportP$]",
			"[$OtherPro$]","[$TotalPro$]","[$DirectInvestment$]", "[$ForeignDirect$]",
			"[$CompanyName$]","[$ReAddress$]","[$SourceofFunds$]",
			//sezDeveloperUndertaking
			"[$TitleofApplicant$]","[$NameApplicant$]","[$Telephone$]", "[$Email$]","[$Date$]","[$NotaryPublic$]","[$CreateDate$]",
			"[$Signature$]","[$Stamp$]",
			//sezSubmissionChecklist
			"[$General$]","[$CompanyInformation$]",
			"[$ProofOfIssued$]","[$SwornStatements$]", "[$LandOccupancy$]","[$Security$]","[$ConstructionRequirements$]","[$OtherTechnical$]",
			"[$PreliminarySez$]","[$DevelopmentPlanSez$]","[$Approvals$]", "[$SwornName$]","[$SDate$]",
			"[$Signature1$]",
			
			
			
		},
		new String[] {
		Validator.isNotNull(sezDevGenBusiness.getApplicationDate())?dateFormat.format(sezDevGenBusiness.getApplicationDate()): "",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getApplicantName())?sezDevGenBusiness.getApplicantName():"",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getCompanyName())?sezDevGenBusiness.getCompanyName():"",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getBuildingNum())?sezDevGenBusiness.getBuildingNum():"",
	    Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getTownCity())?sezDevGenBusiness.getTownCity():"",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getParish())?sezDevGenBusiness.getParish():"",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getCountry())?sezDevGenBusiness.getCountry():"",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getTelephoneNum())?sezDevGenBusiness.getTelephoneNum():"",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getFaxNum())?sezDevGenBusiness.getFaxNum():"",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getEmailAddress())?sezDevGenBusiness.getEmailAddress():"",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getWebsite())?sezDevGenBusiness.getWebsite():"",
		
		//Address Local Head Office
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getHeadOfficeBuildingNum())?sezDevGenBusiness.getHeadOfficeBuildingNum():"",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getHeadOfficeTown())?sezDevGenBusiness.getHeadOfficeTown():"",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getHeadOfficeParish())?sezDevGenBusiness.getHeadOfficeParish():"",
					    
		//Authorised Representative
	    Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getAuthRepName())?sezDevGenBusiness.getAuthRepName():"",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getAuthRepBuildingNum())?sezDevGenBusiness.getAuthRepBuildingNum():"",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getAuthRepTown())?sezDevGenBusiness.getAuthRepTown():"",
	    Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getAuthRepParish())?sezDevGenBusiness.getAuthRepParish():"",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getAuthRepCountry())?sezDevGenBusiness.getAuthRepCountry():"",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getAuthReptelephoneNum())?sezDevGenBusiness.getAuthReptelephoneNum():"",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getAuthRepFaxNum())?sezDevGenBusiness.getAuthRepFaxNum():"",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getAutheEmailAddress())?sezDevGenBusiness.getAutheEmailAddress():"",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getJoinVenture())?sezDevGenBusiness.getJoinVenture():"",
				
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>0)?sezDevGenBusAdd.get(0).getCompanyName():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>0)?sezDevGenBusAdd.get(0).getBuildingNum():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>0)?sezDevGenBusAdd.get(0).getTownCity():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>0)?sezDevGenBusAdd.get(0).getParish():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>0)?sezDevGenBusAdd.get(0).getCountry():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>0)?sezDevGenBusAdd.get(0).getTelephoneNum():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>0)?sezDevGenBusAdd.get(0).getFaxNum():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>0)?sezDevGenBusAdd.get(0).getEmailAddress():"",
				
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>1)?sezDevGenBusAdd.get(1).getCompanyName():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>1)?sezDevGenBusAdd.get(1).getBuildingNum():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>1)?sezDevGenBusAdd.get(1).getTownCity():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>1)?sezDevGenBusAdd.get(1).getParish():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>1)?sezDevGenBusAdd.get(1).getCountry():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>1)?sezDevGenBusAdd.get(1).getTelephoneNum():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>1)?sezDevGenBusAdd.get(1).getFaxNum():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>1)?sezDevGenBusAdd.get(1).getEmailAddress():"",
				
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>2)?sezDevGenBusAdd.get(2).getCompanyName():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>2)?sezDevGenBusAdd.get(2).getBuildingNum():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>2)?sezDevGenBusAdd.get(2).getTownCity():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>2)?sezDevGenBusAdd.get(2).getParish():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>2)?sezDevGenBusAdd.get(2).getCountry():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>2)?sezDevGenBusAdd.get(2).getTelephoneNum():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>2)?sezDevGenBusAdd.get(2).getFaxNum():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>2)?sezDevGenBusAdd.get(2).getEmailAddress():"",
				
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>3)?sezDevGenBusAdd.get(3).getCompanyName():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>3)?sezDevGenBusAdd.get(3).getBuildingNum():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>3)?sezDevGenBusAdd.get(3).getTownCity():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>3)?sezDevGenBusAdd.get(3).getParish():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>3)?sezDevGenBusAdd.get(3).getCountry():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>3)?sezDevGenBusAdd.get(3).getTelephoneNum():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>3)?sezDevGenBusAdd.get(3).getFaxNum():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>3)?sezDevGenBusAdd.get(3).getEmailAddress():"",
				
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>4)?sezDevGenBusAdd.get(4).getCompanyName():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>4)?sezDevGenBusAdd.get(4).getBuildingNum():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>4)?sezDevGenBusAdd.get(4).getTownCity():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>4)?sezDevGenBusAdd.get(4).getParish():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>4)?sezDevGenBusAdd.get(4).getCountry():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>4)?sezDevGenBusAdd.get(4).getTelephoneNum():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>4)?sezDevGenBusAdd.get(4).getFaxNum():"",
		(sezDevGenBusAdd!=null)&&(sezDevGenBusAdd.size()>4)?sezDevGenBusAdd.get(4).getEmailAddress():"",
				
//		seven fields 
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getExistingJamicanCom())?sezDevGenBusiness.getExistingJamicanCom():"",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getArticleOfIncorporation())?sezDevGenBusiness.getArticleOfIncorporation():"",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getPleaseSpecify())?sezDevGenBusiness.getPleaseSpecify():"",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getCompanyClassified())?sezDevGenBusiness.getCompanyClassified():"",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getTaxRegisNum())?sezDevGenBusiness.getTaxRegisNum():"",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getGenConsumptionNum())?sezDevGenBusiness.getGenConsumptionNum():"",
		Validator.isNotNull(sezDevGenBusiness)&&Validator.isNotNull(sezDevGenBusiness.getTaxComplianceCertificateNum())?sezDevGenBusiness.getTaxComplianceCertificateNum():"",
								
		//Equity/Share Capital of the registered Jamaican entity to include Foreign Direct Investment
		Validator.isNotNull(sezDevShareHolder)&&Validator.isNotNull(sezDevShareHolder.getAuthorised())?sezDevShareHolder.getAuthorised():"",
		Validator.isNotNull(sezDevShareHolder)&&Validator.isNotNull(sezDevShareHolder.getSubscribed())?sezDevShareHolder.getSubscribed():"",
		Validator.isNotNull(sezDevShareHolder)&&Validator.isNotNull(sezDevShareHolder.getPaidUpShareCapital())?sezDevShareHolder.getPaidUpShareCapital():"",
		
		//Details of each of the Principal Shareholders
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>0)?sezDevSharePrincipal.get(0).getName():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>0)?sezDevSharePrincipal.get(0).getBuildingNum():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>0)?sezDevSharePrincipal.get(0).getParishPost():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>0)?sezDevSharePrincipal.get(0).getCountry():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>0)?sezDevSharePrincipal.get(0).getNationality():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>0)?sezDevSharePrincipal.get(0).getTaxRegistrationNum():"",
				
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>1)?sezDevSharePrincipal.get(1).getName():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>1)?sezDevSharePrincipal.get(1).getBuildingNum():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>1)?sezDevSharePrincipal.get(1).getParishPost():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>1)?sezDevSharePrincipal.get(1).getCountry():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>1)?sezDevSharePrincipal.get(1).getNationality():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>1)?sezDevSharePrincipal.get(1).getTaxRegistrationNum():"",
				
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>2)?sezDevSharePrincipal.get(2).getBuildingNum():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>2)?sezDevSharePrincipal.get(2).getName():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>2)?sezDevSharePrincipal.get(2).getParishPost():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>2)?sezDevSharePrincipal.get(2).getCountry():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>2)?sezDevSharePrincipal.get(2).getNationality():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>2)?sezDevSharePrincipal.get(2).getTaxRegistrationNum():"",
				
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>3)?sezDevSharePrincipal.get(3).getBuildingNum():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>3)?sezDevSharePrincipal.get(3).getName():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>3)?sezDevSharePrincipal.get(3).getParishPost():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>3)?sezDevSharePrincipal.get(3).getCountry():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>3)?sezDevSharePrincipal.get(3).getNationality():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>3)?sezDevSharePrincipal.get(3).getTaxRegistrationNum():"",
				
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>4)?sezDevSharePrincipal.get(4).getBuildingNum():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>4)?sezDevSharePrincipal.get(4).getName():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>4)?sezDevSharePrincipal.get(4).getParishPost():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>4)?sezDevSharePrincipal.get(4).getCountry():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>3)?sezDevSharePrincipal.get(4).getNationality():"",
		(sezDevSharePrincipal!=null)&&(sezDevSharePrincipal.size()>4)?sezDevSharePrincipal.get(4).getTaxRegistrationNum():"",
				
		//Principal Shareholders/Directors shareholding
		(sezDevShareDirector!=null)&&(sezDevShareDirector.size()>0)?sezDevShareDirector.get(0).getShareholderName():"",
		(sezDevShareDirector!=null)&&(sezDevShareDirector.size()>0)?sezDevShareDirector.get(0).getNumOfShare():"",
				
		(sezDevShareDirector!=null)&&(sezDevShareDirector.size()>1)?sezDevShareDirector.get(1).getShareholderName():"",
		(sezDevShareDirector!=null)&&(sezDevShareDirector.size()>1)?sezDevShareDirector.get(1).getNumOfShare():"",
		    
		(sezDevShareDirector!=null)&&(sezDevShareDirector.size()>2)?sezDevShareDirector.get(2).getShareholderName():"",
		(sezDevShareDirector!=null)&&(sezDevShareDirector.size()>2)?sezDevShareDirector.get(2).getNumOfShare():"",
		    
		(sezDevShareDirector!=null)&&(sezDevShareDirector.size()>3)?sezDevShareDirector.get(3).getShareholderName():"",
		(sezDevShareDirector!=null)&&(sezDevShareDirector.size()>3)?sezDevShareDirector.get(3).getNumOfShare():"",
		    
		(sezDevShareDirector!=null)&&(sezDevShareDirector.size()>4)?sezDevShareDirector.get(4).getShareholderName():"",
		(sezDevShareDirector!=null)&&(sezDevShareDirector.size()>4)?sezDevShareDirector.get(4).getNumOfShare():"",
				
		//List of company directorship/trustees/fiduciary positions 
		(sezDevShareComDir!=null)&&(sezDevShareComDir.size()>0)?sezDevShareComDir.get(0).getName():"",
		(sezDevShareComDir!=null)&&(sezDevShareComDir.size()>0)?sezDevShareComDir.get(0).getCompany():"",
		(sezDevShareComDir!=null)&&(sezDevShareComDir.size()>0)?sezDevShareComDir.get(0).getReplationship():"",
		
		(sezDevShareComDir!=null)&&(sezDevShareComDir.size()>1)?sezDevShareComDir.get(1).getName():"",
		(sezDevShareComDir!=null)&&(sezDevShareComDir.size()>1)?sezDevShareComDir.get(1).getCompany():"",
		(sezDevShareComDir!=null)&&(sezDevShareComDir.size()>1)?sezDevShareComDir.get(1).getReplationship():"",			
		
		(sezDevShareComDir!=null)&&(sezDevShareComDir.size()>2)?sezDevShareComDir.get(2).getName():"",
		(sezDevShareComDir!=null)&&(sezDevShareComDir.size()>2)?sezDevShareComDir.get(2).getCompany():"",
		(sezDevShareComDir!=null)&&(sezDevShareComDir.size()>2)?sezDevShareComDir.get(2).getReplationship():"",		
				
		(sezDevShareComDir!=null)&&(sezDevShareComDir.size()>3)?sezDevShareComDir.get(3).getName():"",
		(sezDevShareComDir!=null)&&(sezDevShareComDir.size()>3)?sezDevShareComDir.get(3).getCompany():"",
		(sezDevShareComDir!=null)&&(sezDevShareComDir.size()>3)?sezDevShareComDir.get(3).getReplationship():"",
		
		(sezDevShareComDir!=null)&&(sezDevShareComDir.size()>4)?sezDevShareComDir.get(4).getName():"",
		(sezDevShareComDir!=null)&&(sezDevShareComDir.size()>4)?sezDevShareComDir.get(4).getCompany():"",
		(sezDevShareComDir!=null)&&(sezDevShareComDir.size()>4)?sezDevShareComDir.get(4).getReplationship():"",
		
		//Corporation/business and companies in which directors have held/holds ownership interest
		(sezDevCorpBus!=null)&&(sezDevCorpBus.size()>0)?sezDevCorpBus.get(0).getName():"",
		(sezDevCorpBus!=null)&&(sezDevCorpBus.size()>0)?sezDevCorpBus.get(0).getCompany():"",
		(sezDevCorpBus!=null)&&(sezDevCorpBus.size()>0)?sezDevCorpBus.get(0).getRelationship():"",
				
		(sezDevCorpBus!=null)&&(sezDevCorpBus.size()>1)?sezDevCorpBus.get(1).getName():"",
		(sezDevCorpBus!=null)&&(sezDevCorpBus.size()>1)?sezDevCorpBus.get(1).getCompany():"",
		(sezDevCorpBus!=null)&&(sezDevCorpBus.size()>1)?sezDevCorpBus.get(1).getRelationship():"",	
				
		(sezDevCorpBus!=null)&&(sezDevCorpBus.size()>2)?sezDevCorpBus.get(2).getName():"",
		(sezDevCorpBus!=null)&&(sezDevCorpBus.size()>2)?sezDevCorpBus.get(2).getCompany():"",
		(sezDevCorpBus!=null)&&(sezDevCorpBus.size()>2)?sezDevCorpBus.get(2).getRelationship():"",	


		(sezDevCorpBus!=null)&&(sezDevCorpBus.size()>3)?sezDevCorpBus.get(3).getName():"",
		(sezDevCorpBus!=null)&&(sezDevCorpBus.size()>3)?sezDevCorpBus.get(3).getCompany():"",
		(sezDevCorpBus!=null)&&(sezDevCorpBus.size()>3)?sezDevCorpBus.get(3).getRelationship():"",	

		(sezDevCorpBus!=null)&&(sezDevCorpBus.size()>4)?sezDevCorpBus.get(4).getName():"",
		(sezDevCorpBus!=null)&&(sezDevCorpBus.size()>4)?sezDevCorpBus.get(4).getCompany():"",
		(sezDevCorpBus!=null)&&(sezDevCorpBus.size()>4)?sezDevCorpBus.get(4).getRelationship():"",	
			
				
				
				
		Validator.isNotNull(sezDevShareHolder)&&Validator.isNotNull(sezDevShareHolder.getDirectorBankrupts())?sezDevShareHolder.getDirectorBankrupts():"",
		//sharholder please share add 
		(sezDevPleaseShareAdd!=null)&&(sezDevPleaseShareAdd.size()>0)?sezDevPleaseShareAdd.get(0).getName():"",
		(sezDevPleaseShareAdd!=null)&&(sezDevPleaseShareAdd.size()>1)?sezDevPleaseShareAdd.get(1).getName():"",
	    (sezDevPleaseShareAdd!=null)&&(sezDevPleaseShareAdd.size()>2)?sezDevPleaseShareAdd.get(2).getName():"",
		(sezDevPleaseShareAdd!=null)&&(sezDevPleaseShareAdd.size()>3)?sezDevPleaseShareAdd.get(3).getName():"",
		(sezDevPleaseShareAdd!=null)&&(sezDevPleaseShareAdd.size()>4)?sezDevPleaseShareAdd.get(4).getName():"",
				
		//SezDevProposedProject
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getPreviouslyFreeZone())?sezDevPropProject.getPreviouslyFreeZone():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getCurentlyOperatingZone())?sezDevPropProject.getCurentlyOperatingZone():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getBusinessConductedZone())?sezDevPropProject.getBusinessConductedZone():"",
		
		(sezDevPropProjAddress!=null)&&(sezDevPropProjAddress.size()>0)?sezDevPropProjAddress.get(0).getNameOfZone():"",
		(sezDevPropProjAddress!=null)&&(sezDevPropProjAddress.size()>0)?sezDevPropProjAddress.get(0).getParish():"",
		
		(sezDevPropProjAddress!=null)&&(sezDevPropProjAddress.size()>1)?sezDevPropProjAddress.get(1).getNameOfZone():"",
		(sezDevPropProjAddress!=null)&&(sezDevPropProjAddress.size()>1)?sezDevPropProjAddress.get(1).getParish():"",
		
		(sezDevPropProjAddress!=null)&&(sezDevPropProjAddress.size()>2)?sezDevPropProjAddress.get(2).getNameOfZone():"",
		(sezDevPropProjAddress!=null)&&(sezDevPropProjAddress.size()>2)?sezDevPropProjAddress.get(2).getParish():"",
		
		(sezDevPropProjAddress!=null)&&(sezDevPropProjAddress.size()>3)?sezDevPropProjAddress.get(3).getNameOfZone():"",
		(sezDevPropProjAddress!=null)&&(sezDevPropProjAddress.size()>3)?sezDevPropProjAddress.get(3).getParish():"",
																
		(sezDevPropProjAddress!=null)&&(sezDevPropProjAddress.size()>4)?sezDevPropProjAddress.get(4).getNameOfZone():"",
		(sezDevPropProjAddress!=null)&&(sezDevPropProjAddress.size()>4)?sezDevPropProjAddress.get(4).getParish():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getLocally())?sezDevPropProject.getLocally():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getOverseas())?sezDevPropProject.getOverseas():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getProposedName())?sezDevPropProject.getProposedName():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getSpecialEconomicZone())?sezDevPropProject.getSpecialEconomicZone():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getPleaseDescribe())?sezDevPropProject.getPleaseDescribe():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getSeaPortKm())?sezDevPropProject.getSeaPortKm():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getSeaPortMi())?sezDevPropProject.getSeaPortMi():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getAirportKm())?sezDevPropProject.getAirportKm():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getAirportMi())?sezDevPropProject.getAirportMi():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getRoadKm())?sezDevPropProject.getRoadKm():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getRoadMi())?sezDevPropProject.getRoadMi():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getRailKm())?sezDevPropProject.getRailKm():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getRailMi())?sezDevPropProject.getRailMi():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getCustomProcessingKm())?sezDevPropProject.getCustomProcessingKm():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getCustomProcessingMi())?sezDevPropProject.getCustomProcessingMi():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getIndicateTheLandMeasurement())?sezDevPropProject.getIndicateTheLandMeasurement():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getBuilding())?sezDevPropProject.getBuilding():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getLandArea())?sezDevPropProject.getLandArea():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getOwnerShip())?sezDevPropProject.getOwnerShip():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getOtherPleaseSpecify())?sezDevPropProject.getOtherPleaseSpecify():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getLandOwnerName())?sezDevPropProject.getLandOwnerName():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getLnadOwnerAddressOne())?sezDevPropProject.getLnadOwnerAddressOne():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getLnadOwnerAddressTwo())?sezDevPropProject.getLnadOwnerAddressTwo():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getLnadOwnerTenure())?sezDevPropProject.getLnadOwnerTenure():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getStepToAcquireLand())?sezDevPropProject.getStepToAcquireLand():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getStateWheatherTheProposedArea())?sezDevPropProject.getStateWheatherTheProposedArea():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getApplicantPreviously())?sezDevPropProject.getApplicantPreviously():"",
		Validator.isNotNull(sezDevPropProject)&&Validator.isNotNull(sezDevPropProject.getPleaseProvideBrief())?sezDevPropProject.getPleaseProvideBrief():"",
		//Project Development Plan / Site Plan
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getExistingBuilding())?sezDevPropDevPLan.getExistingBuilding():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getExistingBuildingForBusiDetail())?sezDevPropDevPLan.getExistingBuildingForBusiDetail():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getActivitiesForSingleEntity())?sezDevPropDevPLan.getActivitiesForSingleEntity():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getVolume())?sezDevPropDevPLan.getVolume():"",
	Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getFolio())?sezDevPropDevPLan.getFolio():"",
	Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getBuildingNum())?sezDevPropDevPLan.getBuildingNum():"",
	Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getTownCity())?sezDevPropDevPLan.getTownCity():"",
	Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getZipCode())?sezDevPropDevPLan.getZipCode():"",
	Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getZoningClassification())?sezDevPropDevPLan.getZoningClassification():"",
	Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getLandUse())?sezDevPropDevPLan.getLandUse():"",
	Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getSezAreaHectares())?sezDevPropDevPLan.getSezAreaHectares():"",
	Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getSezAreaAcres())?sezDevPropDevPLan.getSezAreaAcres():"",
	Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getCustomsHectares())?sezDevPropDevPLan.getCustomsHectares():"",
	Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getCustomsAcres())?sezDevPropDevPLan.getCustomsAcres():"",
	Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getTopography())?sezDevPropDevPLan.getTopography():"",
	Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getNorthBoundaries())?sezDevPropDevPLan.getNorthBoundaries():"",
	Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getEastBoundaries())?sezDevPropDevPLan.getEastBoundaries():"",
	Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getWestBoundaries())?sezDevPropDevPLan.getWestBoundaries():"",
	Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getSouthBoundaries())?sezDevPropDevPLan.getSouthBoundaries():"",
	
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getCustomLandMeasurement())?sezDevPropDevPLan.getCustomLandMeasurement():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getCustomPercent())?sezDevPropDevPLan.getCustomPercent():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getCommonLandMeasurement())?sezDevPropDevPLan.getCommonLandMeasurement():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getCommonPercent())?sezDevPropDevPLan.getCommonPercent():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getBufferLandMeasurement())?sezDevPropDevPLan.getBufferLandMeasurement():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getBufferPercent())?sezDevPropDevPLan.getBufferPercent():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getZoneLandMeasurement())?sezDevPropDevPLan.getZoneLandMeasurement():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getZonePercent())?sezDevPropDevPLan.getZonePercent():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getResidentialLandMeasurement())?sezDevPropDevPLan.getResidentialLandMeasurement():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getResidentialPercent())?sezDevPropDevPLan.getResidentialPercent():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getTotalLandMeasurement())?sezDevPropDevPLan.getTotalLandMeasurement():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getTotalPercent())?sezDevPropDevPLan.getTotalPercent():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getIndustrialProcess())?sezDevPropDevPLan.getIndustrialProcess():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getDrinkingPurpose())?sezDevPropDevPLan.getDrinkingPurpose():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getOtherSpecify())?sezDevPropDevPLan.getOtherSpecify():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getTotalRequirement())?sezDevPropDevPLan.getTotalRequirement():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getQuantumAndNature())?sezDevPropDevPLan.getQuantumAndNature():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getSpecifyWhetherOwn())?sezDevPropDevPLan.getSpecifyWhetherOwn():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getReqOfPower())?sezDevPropDevPLan.getReqOfPower():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getMainRoadRowWidth())?sezDevPropDevPLan.getMainRoadRowWidth():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getMainRoadTypeOfPavement())?sezDevPropDevPLan.getMainRoadTypeOfPavement():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getSecondRowWidhth())?sezDevPropDevPLan.getSecondRowWidhth():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getSecondTypeOfPavement())?sezDevPropDevPLan.getSecondTypeOfPavement():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getTertiaryRowWidhth())?sezDevPropDevPLan.getTertiaryRowWidhth():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getTertiaryTypeOfPavement())?sezDevPropDevPLan.getTertiaryTypeOfPavement():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getWaterInstallationReq())?sezDevPropDevPLan.getWaterInstallationReq():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getPowerInstallationReq())?sezDevPropDevPLan.getPowerInstallationReq():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getTeleComInstallationReq())?sezDevPropDevPLan.getTeleComInstallationReq():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getCctvInstallationReq())?sezDevPropDevPLan.getCctvInstallationReq():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getSecurityInterconnection())?sezDevPropDevPLan.getSecurityInterconnection():"",
		Validator.isNotNull(sezDevPropDevPLan)&&Validator.isNotNull(sezDevPropDevPLan.getFireFightingInstallationReq())?sezDevPropDevPLan.getFireFightingInstallationReq():"",
		
		//EmpSafetyInfo
		(sezDevEmpSafetyInfo!=null)&&(sezDevEmpSafetyInfo.size()>0)?sezDevEmpSafetyInfo.get(0).getSecurityMeasures():"",
		
		(sezDevEmpSafetyInfo!=null)&&(sezDevEmpSafetyInfo.size()>1)?sezDevEmpSafetyInfo.get(1).getSecurityMeasures():"",
				
		(sezDevEmpSafetyInfo!=null)&&(sezDevEmpSafetyInfo.size()>2)?sezDevEmpSafetyInfo.get(2).getSecurityMeasures():"",
		
		(sezDevEmpSafetyInfo!=null)&&(sezDevEmpSafetyInfo.size()>3)?sezDevEmpSafetyInfo.get(3).getSecurityMeasures():"",
		
		(sezDevEmpSafetyInfo!=null)&&(sezDevEmpSafetyInfo.size()>4)?sezDevEmpSafetyInfo.get(4).getSecurityMeasures():"",
																								
		//EmpDefOccu
		(sezDevEmpDefOccu!=null)&&(sezDevEmpDefOccu.size()>0)?sezDevEmpDefOccu.get(0).getOccuSafetySystem():"",
		(sezDevEmpDefOccu!=null)&&(sezDevEmpDefOccu.size()>1)?sezDevEmpDefOccu.get(1).getOccuSafetySystem():"",
		(sezDevEmpDefOccu!=null)&&(sezDevEmpDefOccu.size()>2)?sezDevEmpDefOccu.get(2).getOccuSafetySystem():"",
		(sezDevEmpDefOccu!=null)&&(sezDevEmpDefOccu.size()>3)?sezDevEmpDefOccu.get(3).getOccuSafetySystem():"",
		(sezDevEmpDefOccu!=null)&&(sezDevEmpDefOccu.size()>4)?sezDevEmpDefOccu.get(4).getOccuSafetySystem():"",
		
		//EmployementInfo
		Validator.isNotNull(sezDevEmployementInfo)&&Validator.isNotNull(sezDevEmployementInfo.getFirstYearDirect())?sezDevEmployementInfo.getFirstYearDirect():"",		
		Validator.isNotNull(sezDevEmployementInfo)&&Validator.isNotNull(sezDevEmployementInfo.getFirstYearInDirect())?sezDevEmployementInfo.getFirstYearInDirect():"",		
		Validator.isNotNull(sezDevEmployementInfo)&&Validator.isNotNull(sezDevEmployementInfo.getFirstYearMale())?sezDevEmployementInfo.getFirstYearMale():"",		
		Validator.isNotNull(sezDevEmployementInfo)&&Validator.isNotNull(sezDevEmployementInfo.getFirstYearFemale())?sezDevEmployementInfo.getFirstYearFemale():"",		
		Validator.isNotNull(sezDevEmployementInfo)&&Validator.isNotNull(sezDevEmployementInfo.getFirstYearLocal())?sezDevEmployementInfo.getFirstYearLocal():"",		
		Validator.isNotNull(sezDevEmployementInfo)&&Validator.isNotNull(sezDevEmployementInfo.getFirstYearForeign())?sezDevEmployementInfo.getFirstYearForeign():"",		
		Validator.isNotNull(sezDevEmployementInfo)&&Validator.isNotNull(sezDevEmployementInfo.getSecondYearDirect())?sezDevEmployementInfo.getSecondYearDirect():"",		
		Validator.isNotNull(sezDevEmployementInfo)&&Validator.isNotNull(sezDevEmployementInfo.getSecondYearIndirect())?sezDevEmployementInfo.getSecondYearIndirect():"",		
		Validator.isNotNull(sezDevEmployementInfo)&&Validator.isNotNull(sezDevEmployementInfo.getSecondYearMale())?sezDevEmployementInfo.getSecondYearMale():"",		
		Validator.isNotNull(sezDevEmployementInfo)&&Validator.isNotNull(sezDevEmployementInfo.getSecondYearFemale())?sezDevEmployementInfo.getSecondYearFemale():"",		
		Validator.isNotNull(sezDevEmployementInfo)&&Validator.isNotNull(sezDevEmployementInfo.getSecondYearLocal())?sezDevEmployementInfo.getSecondYearLocal():"",		
		Validator.isNotNull(sezDevEmployementInfo)&&Validator.isNotNull(sezDevEmployementInfo.getSecondYearForeign())?sezDevEmployementInfo.getSecondYearForeign():"",		
		Validator.isNotNull(sezDevEmployementInfo)&&Validator.isNotNull(sezDevEmployementInfo.getThirdYearDirect())?sezDevEmployementInfo.getThirdYearDirect():"",		
		Validator.isNotNull(sezDevEmployementInfo)&&Validator.isNotNull(sezDevEmployementInfo.getThirdYearIndirect())?sezDevEmployementInfo.getThirdYearIndirect():"",		
		Validator.isNotNull(sezDevEmployementInfo)&&Validator.isNotNull(sezDevEmployementInfo.getThirdYearMale())?sezDevEmployementInfo.getThirdYearMale():"",		
		Validator.isNotNull(sezDevEmployementInfo)&&Validator.isNotNull(sezDevEmployementInfo.getThirdYearFemale())?sezDevEmployementInfo.getThirdYearFemale():"",		
		Validator.isNotNull(sezDevEmployementInfo)&&Validator.isNotNull(sezDevEmployementInfo.getThirdYearLocal())?sezDevEmployementInfo.getThirdYearLocal():"",		
		Validator.isNotNull(sezDevEmployementInfo)&&Validator.isNotNull(sezDevEmployementInfo.getThirdYearForeign())?sezDevEmployementInfo.getThirdYearForeign():"",		
				
		//DisasterManagement		
		Validator.isNotNull(sezDevDisasterManagement)&&Validator.isNotNull(sezDevDisasterManagement.getDisasterManagement())?sezDevDisasterManagement.getDisasterManagement():"",		
		(sezDevDisasterManageAdd!=null)&&(sezDevDisasterManageAdd.size()>0)?sezDevDisasterManageAdd.get(0).getDisasterMitigationPlan():"",
		(sezDevDisasterManageAdd!=null)&&(sezDevDisasterManageAdd.size()>1)?sezDevDisasterManageAdd.get(1).getDisasterMitigationPlan():"",
		(sezDevDisasterManageAdd!=null)&&(sezDevDisasterManageAdd.size()>2)?sezDevDisasterManageAdd.get(2).getDisasterMitigationPlan():"",
		(sezDevDisasterManageAdd!=null)&&(sezDevDisasterManageAdd.size()>3)?sezDevDisasterManageAdd.get(3).getDisasterMitigationPlan():"",
		(sezDevDisasterManageAdd!=null)&&(sezDevDisasterManageAdd.size()>4)?sezDevDisasterManageAdd.get(4).getDisasterMitigationPlan():"",
		//InvestmentAndFinancial
		Validator.isNotNull(sezDevInvestmentAndFin)&&Validator.isNotNull(sezDevInvestmentAndFin.getValueOfLand())?sezDevInvestmentAndFin.getValueOfLand():"",		
		Validator.isNotNull(sezDevInvestmentAndFin)&&Validator.isNotNull(sezDevInvestmentAndFin.getBuildingFactoryDevelop())?sezDevInvestmentAndFin.getBuildingFactoryDevelop():"",		
		Validator.isNotNull(sezDevInvestmentAndFin)&&Validator.isNotNull(sezDevInvestmentAndFin.getOnSiteInfrastructure())?sezDevInvestmentAndFin.getOnSiteInfrastructure():"",		
		Validator.isNotNull(sezDevInvestmentAndFin)&&Validator.isNotNull(sezDevInvestmentAndFin.getPort())?sezDevInvestmentAndFin.getPort():"",		
		Validator.isNotNull(sezDevInvestmentAndFin)&&Validator.isNotNull(sezDevInvestmentAndFin.getAirPort())?sezDevInvestmentAndFin.getAirPort():"",		
		Validator.isNotNull(sezDevInvestmentAndFin)&&Validator.isNotNull(sezDevInvestmentAndFin.getOther())?sezDevInvestmentAndFin.getOther():"",		
		Validator.isNotNull(sezDevInvestmentAndFin)&&Validator.isNotNull(sezDevInvestmentAndFin.getTotal())?sezDevInvestmentAndFin.getTotal():"",		
		Validator.isNotNull(sezDevInvestmentAndFin)&&Validator.isNotNull(sezDevInvestmentAndFin.getTotalLocalDirector())?sezDevInvestmentAndFin.getTotalLocalDirector():"",		
		Validator.isNotNull(sezDevInvestmentAndFin)&&Validator.isNotNull(sezDevInvestmentAndFin.getTotalForeignDirector())?sezDevInvestmentAndFin.getTotalForeignDirector():"",		
		Validator.isNotNull(sezDevInvestmentAndFin)&&Validator.isNotNull(sezDevInvestmentAndFin.getCompanyName())?sezDevInvestmentAndFin.getCompanyName():"",		
		Validator.isNotNull(sezDevInvestmentAndFin)&&Validator.isNotNull(sezDevInvestmentAndFin.getResisdentAddress())?sezDevInvestmentAndFin.getResisdentAddress():"",		
		Validator.isNotNull(sezDevInvestmentAndFin)&&Validator.isNotNull(sezDevInvestmentAndFin.getSourceOfFunds())?sezDevInvestmentAndFin.getSourceOfFunds():"",		
							
		//sezDeveloperUndertaking
		Validator.isNotNull(sezDevUndertaking)&&Validator.isNotNull(sezDevUndertaking.getTitleOfApplicant())?sezDevUndertaking.getTitleOfApplicant():"",		
		Validator.isNotNull(sezDevUndertaking)&&Validator.isNotNull(sezDevUndertaking.getNameOfApplicant())?sezDevUndertaking.getNameOfApplicant():"",		
		Validator.isNotNull(sezDevUndertaking)&&Validator.isNotNull(sezDevUndertaking.getTelephoneNum())?sezDevUndertaking.getTelephoneNum():"",		
		Validator.isNotNull(sezDevUndertaking)&&Validator.isNotNull(sezDevUndertaking.getEmailAddress())?sezDevUndertaking.getEmailAddress():"",
		//signature
		Validator.isNotNull(sezDevUndertaking.getApplicantSignatureDate())?dateFormat.format(sezDevUndertaking.getApplicantSignatureDate()): "",				
		Validator.isNotNull(sezDevUndertaking)&&Validator.isNotNull(sezDevUndertaking.getNameOfNotaryPublic())?sezDevUndertaking.getNameOfNotaryPublic():"",		
		Validator.isNotNull(sezDevUndertaking.getPublicNotarySignatureDate())?dateFormat.format(sezDevUndertaking.getPublicNotarySignatureDate()): "",	
		//sign upload undertaking
		signatureSezDevDeclarant,signatureSezDevPublicNotary,
		//SubmissionChecklist
Validator.isNotNull(sezSubmissionChecklist)&&Validator.isNotNull(sezSubmissionChecklist.getSelectedGeneral())?sezSubmissionChecklist.getSelectedGeneral():"",		
Validator.isNotNull(sezSubmissionChecklist)&&Validator.isNotNull(sezSubmissionChecklist.getSelectedComInfoReq())?sezSubmissionChecklist.getSelectedComInfoReq():"",		
Validator.isNotNull(sezSubmissionChecklist)&&Validator.isNotNull(sezSubmissionChecklist.getPaidShareCapProof())?sezSubmissionChecklist.getPaidShareCapProof():"",		
Validator.isNotNull(sezSubmissionChecklist)&&Validator.isNotNull(sezSubmissionChecklist.getSelectedSwornStateReq())?sezSubmissionChecklist.getSelectedSwornStateReq():"",		
Validator.isNotNull(sezSubmissionChecklist)&&Validator.isNotNull(sezSubmissionChecklist.getSelectedLandOccuReq())?sezSubmissionChecklist.getSelectedLandOccuReq():"",		
Validator.isNotNull(sezSubmissionChecklist)&&Validator.isNotNull(sezSubmissionChecklist.getSelectedSafetyHealthReq())?sezSubmissionChecklist.getSelectedSafetyHealthReq():"",		
Validator.isNotNull(sezSubmissionChecklist)&&Validator.isNotNull(sezSubmissionChecklist.getSelectedLandDevlopmentReq())?sezSubmissionChecklist.getSelectedLandDevlopmentReq():"",		
Validator.isNotNull(sezSubmissionChecklist)&&Validator.isNotNull(sezSubmissionChecklist.getSelectedTechInfoReq())?sezSubmissionChecklist.getSelectedTechInfoReq():"",		
Validator.isNotNull(sezSubmissionChecklist)&&Validator.isNotNull(sezSubmissionChecklist.getSelectedSezPreliminaryReq())?sezSubmissionChecklist.getSelectedSezPreliminaryReq():"",		
Validator.isNotNull(sezSubmissionChecklist)&&Validator.isNotNull(sezSubmissionChecklist.getSelectedSezDevDetailReq())?sezSubmissionChecklist.getSelectedSezDevDetailReq():"",		
Validator.isNotNull(sezSubmissionChecklist)&&Validator.isNotNull(sezSubmissionChecklist.getSelectedApprovalReq())?sezSubmissionChecklist.getSelectedApprovalReq():"",		
Validator.isNotNull(sezSubmissionChecklist)&&Validator.isNotNull(sezSubmissionChecklist.getNameReq())?sezSubmissionChecklist.getNameReq():"",		
Validator.isNotNull(sezSubmissionChecklist.getDateReq())?dateFormat.format(sezSubmissionChecklist.getDateReq()): "",						
		//signature upload checklist
signatureSezDevChecklist,

		});
		}catch (Exception e) {
			e.printStackTrace();
			}
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Sez Status Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(sezApplication.getSezStatusApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
		}
		if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
			String fileName = null;
			String title = null;
			String generalConsumption = null;
			String certificateOfIncorporation = null;
			String articleOfIncorportation = null;
			String memorandumOfAssociation = null;
			String articleOfAssociation = null;
			String businessProposal = null;
			String masterPlan = null;
			String preliminaryBusinessPlan = null;
			String certificateOfTitle = null;
			String leaseAgreement = null;
			String projectProfileTeam = null;
			String companyProfile = null;
			String statutoryDeclaration = null;
			String fireSafety = null;
			String firePermit = null;
			String securityPlan = null;
			String occupationalSafety = null;
			String emergenyDisaster = null;
			String financialStatement = null;
			String technicaldocument = null;
			String surveyorsId = null;
			String formOfDeclaration = null;
			String projectSchedule = null;
			String affidavits = null;
			String buildingPermit = null;
			String nepaPermit = null;
			String nwaPermit = null;
			String statutory = null;
			String sourceOfFunds = null;
				for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
				try {
					fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
				} catch (PortalException e) {
					e.printStackTrace();
				}
				fileName = fileEntry.getFileName();
				title = fileEntry.getTitle();
				if (title.equals("General Consumption Tax (GCT) Number")) {
					generalConsumption = fileName;
				} else if (title.equals("Certificate of Incorporation")) {
					certificateOfIncorporation = fileName;
				} else if (title.equals("Articles of Incorporation")) {
					articleOfIncorportation = fileName;
				} else if (title.equals("Memorandum of Association")) {
					memorandumOfAssociation = fileName;
				} else if (title.equals("Articles of Association")) {
					articleOfAssociation = fileName;
				}else if (title.equals("Business Proposal")) {
					businessProposal = fileName;
				}else if (title.equals("Master Plan")) {
					masterPlan = fileName;
				}else if (title.equals("Preliminary Business Plan")) {
					preliminaryBusinessPlan = fileName;
				}else if (title.equals("Certificate of Title")) {
					certificateOfTitle = fileName;
				}else if (title.equals("Lease Agreement")) {
					leaseAgreement = fileName;
				}else if (title.equals("Project Profile Team")) {
					projectProfileTeam = fileName;
				}else if (title.equals("Company Profile")) {
					companyProfile = fileName;
				}else if (title.equals("Statutory Declaration")) {
					statutoryDeclaration = fileName;
				}else if (title.equals("Fire Safety Certificate (Can be provided after Ministerial Approval)")) {
					fireSafety = fileName;
				}else if (title.equals("Fire Permit (Can be provided after Ministerial Approval)")) {
					firePermit = fileName;
				}else if (title.equals("Security Plan (Can be provided after Ministerial Approval)")) {
					securityPlan = fileName;
				}else if (title.equals("Occupational Safety and Health Plan (Can be provided after Ministerial Approval)")) {
					occupationalSafety = fileName;
				}else if (title.equals("Emergency/Disaster Plan (Can be provided after Ministerial Approval)")) {
					emergenyDisaster = fileName;
				}else if (title.equals("Financial Statement (Can be provided after Ministerial Approval)")) {
					financialStatement = fileName;
				}else if (title.equals("Technical Document (Needed before Ministerial Approval)")) {
					technicaldocument = fileName;
				}else if (title.equals("Surveyors ID (Needed before Ministerial Approval)")) {
					surveyorsId = fileName;
				}else if (title.equals("Form of Declaration (Form 9) (Needed before Ministerial Approval)")) {
					formOfDeclaration = fileName;
				}else if (title.equals("Project Schedule/ Implementation Plan (Needed before Ministerial Approval)")) {
					projectSchedule = fileName;
				}else if (title.equals("Affidavits (Conditional once applicable it is required at Intake)")) {
					affidavits = fileName;
				}else if (title.equals("Building Permit (Conditional can be provided after Ministerial Approval but required before Development)")) {
					buildingPermit = fileName;
				}else if (title.equals("NEPA Permit (Conditional can be provided after Ministerial Approval but required before Development)")) {
					nepaPermit = fileName;
				}else if (title.equals("NWA Permit (Conditional can be provided after Ministerial Approval but required before Development)")) {
					nwaPermit = fileName;
				}else if (title.equals("Statutory Declaration (Conditional once applicable it is required at Intake)")) {
					statutory = fileName;
				}else if (title.equals("Source of Funds")) {
					sourceOfFunds = fileName;
				}
			}
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//		for the document 
         "[$TaxNumber$]","[$Certificate$]","[$Incorporation$]","[$Memorandum$]","[$Association$]",
         "[$Business$]","[$Proofofincome$]","[$Preliminary$]","[$CertificateofTitle$]","[$LeaseAgreementDoc$]",
         "[$ProjectProfile$]","[$CompanyProfile$]","[$StatutoryDeclaration$]","[$SafetyCertificate$]",
         "[$FirePermit$]","[$SecurityPlan$]","[$OccupationalSafety$]","[$Emergency$]","[$FinancialStatement$]",
         "[$MinisterialApproval$]","[$SurveyorsID$]","[$FormofDeclaration$]","[$ProjectSchedule$]",
         "[$Affidavits$]","[$BuildingPermit$]","[$NEPAPermit$]","[$NWAPermit$]",
         "[$StatutoryDeclarationDoc$]","[$SourceofFundsDoc$]","[$PaymentMethod$]",
				},
		new String[] {
				generalConsumption,certificateOfIncorporation,articleOfIncorportation,
				memorandumOfAssociation,articleOfAssociation,businessProposal,masterPlan,
				preliminaryBusinessPlan,certificateOfTitle,leaseAgreement,projectProfileTeam,
				companyProfile,statutoryDeclaration,fireSafety,firePermit,securityPlan,
				occupationalSafety,emergenyDisaster,financialStatement,technicaldocument,
				surveyorsId,formOfDeclaration,projectSchedule,affidavits,buildingPermit,
				nepaPermit,nwaPermit,statutory,sourceOfFunds,
				Validator.isNotNull(sezDeveloperPayment)&&Validator.isNotNull(sezDeveloperPayment.getPaymentMethod())?sezDeveloperPayment.getPaymentMethod():""
					});
		}
		return pdfTemplate;
		}
	
	public static String replaceSignforSezDevUndertakingDeclarant(long sezStatusApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Developer Undertaking Declarant");
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
	
	public static String replaceSignforSezDevChecklist(long sezStatusApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Developer Submission Checklist");
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
	
	public static String replaceSignforSezDevUndertakingPublicNotary(long sezStatusApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Developer Public Notary");
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
	
	@Reference
	static
	CommonsUtil commonUtil;
}
