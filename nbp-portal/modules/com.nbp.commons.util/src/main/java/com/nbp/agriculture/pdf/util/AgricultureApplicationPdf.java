package com.nbp.agriculture.pdf.util;

import com.agriculture.application.form.service.model.AgricultueFarmer;
import com.agriculture.application.form.service.model.AgricultureApiculture;
import com.agriculture.application.form.service.model.AgricultureApplication;
import com.agriculture.application.form.service.model.AgricultureAquaculture;
import com.agriculture.application.form.service.model.AgricultureBuilding;
import com.agriculture.application.form.service.model.AgricultureCrop;
import com.agriculture.application.form.service.model.AgricultureFarm;
import com.agriculture.application.form.service.model.AgricultureLivestock;
import com.agriculture.application.form.service.model.AgricultureOrnamental;
import com.agriculture.application.form.service.model.AgriculturePoultry;
import com.agriculture.application.form.service.model.AgriultureForestry;
import com.agriculture.application.form.service.service.AgricultueFarmerLocalServiceUtil;
import com.agriculture.application.form.service.service.AgricultureApicultureLocalServiceUtil;
import com.agriculture.application.form.service.service.AgricultureApplicationLocalServiceUtil;
import com.agriculture.application.form.service.service.AgricultureAquacultureLocalServiceUtil;
import com.agriculture.application.form.service.service.AgricultureBuildingLocalServiceUtil;
import com.agriculture.application.form.service.service.AgricultureCropLocalServiceUtil;
import com.agriculture.application.form.service.service.AgricultureFarmLocalServiceUtil;
import com.agriculture.application.form.service.service.AgricultureLivestockLocalServiceUtil;
import com.agriculture.application.form.service.service.AgricultureOrnamentalLocalServiceUtil;
import com.agriculture.application.form.service.service.AgriculturePoultryLocalServiceUtil;
import com.agriculture.application.form.service.service.AgriultureForestryLocalServiceUtil;
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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class AgricultureApplicationPdf {
	public static String replaceSignatureForAgricullture(long agricultureApplicationId, String folderName, long groupId,
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
	
	public static String AgricutureApplicationPdf(long agricultureApplicationId, ThemeDisplay themeDisplay,
			String checkPdfSendingInLaunchCaseWithoutDoc) throws PortalException {
		System.out.println("checkPdfSendingInLaunchCaseWithoutDoc in Agriculture--------------------------"+checkPdfSendingInLaunchCaseWithoutDoc);
		String pdfTemplate = StringPool.BLANK;
		AgricultureApplication agricultureApplication = null;
		AgricultueFarmer agricultureFarmer = null;
		List<AgricultureFarm> agricultureFarm = null;
		List<AgricultureBuilding> agricultureBuilding = null;
		List<AgricultureLivestock> agricultureLivestocks = null;
		List<AgricultureCrop> agricultureCrops = null;
		List<AgriculturePoultry> agriculturePoultry = null;
		List<AgricultureAquaculture> agricultureAquaculture = null;
		List<AgricultureApiculture> agricultureApiculture = null;
		List<AgriultureForestry> agriultureForesty = null;
		List<AgricultureOrnamental> agricultureOrnamental = null;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			agricultureFarmer = AgricultueFarmerLocalServiceUtil.getAgricultureById(agricultureApplicationId);
		}catch (Exception e) {
		}try {
			agricultureFarm = AgricultureFarmLocalServiceUtil.getAFa_by_AAI(agricultureApplicationId);
		}catch (Exception e) {
		}try {
			agricultureBuilding = AgricultureBuildingLocalServiceUtil.getAB_by_AAI(agricultureApplicationId);
		}catch (Exception e) {
		}try {
			agricultureLivestocks = AgricultureLivestockLocalServiceUtil.getAL_by_AAI(agricultureApplicationId);
		}catch (Exception e) {
		}try {
			agricultureCrops = AgricultureCropLocalServiceUtil.getAC_by_AAI(agricultureApplicationId);
		}catch (Exception e) {
		}try {
			agriculturePoultry = AgriculturePoultryLocalServiceUtil.getAP_by_AAI(agricultureApplicationId);
		}catch (Exception e) {
		}try {
			agricultureAquaculture = AgricultureAquacultureLocalServiceUtil.getAAqa_by_AAI(agricultureApplicationId);
		}catch (Exception e) {
		}try {
			agricultureApiculture = AgricultureApicultureLocalServiceUtil.getAApi_by_AAI(agricultureApplicationId);
		}catch (Exception e) {
		}try {
			agriultureForesty = AgriultureForestryLocalServiceUtil.getAForest_by_AAI(agricultureApplicationId);
		}catch (Exception e) {
		}try {
			agricultureOrnamental = AgricultureOrnamentalLocalServiceUtil.getAO_by_AAI(agricultureApplicationId);
		}catch (Exception e) {
		}try {
			agricultureApplication = AgricultureApplicationLocalServiceUtil.getAgricultureApplication(agricultureApplicationId);
		} catch (Exception e) {
		}
		//pdf go in launch case
		if (checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
			System.out.println("inside if----------------");
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
					"agriculture_form-1");
		}else {
			try {
				System.out.println("inside else ---------------");
			pdfTemplate = getTemplateFromJournalArticlePDF
					(themeDisplay.getScopeGroupId(),
					"agriculture_form");
			}catch (Exception e) {
				
			}
		}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate,
					new String[] { 
//							farmerDetails
				"[$TickTheAppropriateIncentive$]","[$PIRP_ApplicantName$]", "[$PIRP_NameOFFarm$]","[$PIRP_Proprietor$]",
				"[$PIRP_ApplicantAddress$]", "[$Parish$]", "[$PIRP_ApplicantTRN$]","[$PIRP_FarmersRegistration$]",
				"[$PIRP_DateofIncorporationofFarm$]","[$PIRP_ApplicantContactNumber$]", "[$PIRP_ApplicantEmailAddress$]",
//				for the farm details 
			"[$LocationFarm1$]", "[$LandFarm1$]", "[$HectaresFarm1$]", "[$YearsFarm1$]", "[$ParcelsFarm1$]", "[$SizeFarm1$]","[$TopographyFarm1$]", "[$NumberFarm1$]", 
			"[$LocationFarm2$]", "[$LandFarm2$]", "[$HectaresFarm2$]","[$YearsFarm2$]", "[$ParcelsFarm2$]", "[$SizeFarm2$]", "[$TopographyFarm2$]", "[$NumberFarm2$]",
			"[$LocationFarm3$]", "[$LandFarm3$]", "[$HectaresFarm3$]", "[$YearsFarm3$]", "[$ParcelsFarm3$]", "[$SizeFarm3$]","[$TopographyFarm3$]", "[$NumberFarm3$]",
			"[$LocationFarm4$]", "[$LandFarm4$]", "[$HectaresFarm4$]","[$YearsFarm4$]", "[$ParcelsFarm4$]", "[$SizeFarm4$]", "[$TopographyFarm4$]", "[$NumberFarm4$]",
			"[$LocationFarm5$]", "[$LandFarm5$]", "[$HectaresFarm5$]", "[$YearsFarm5$]", "[$ParcelsFarm5$]", "[$SizeFarm5$]","[$TopographyFarm5$]", "[$NumberFarm5$]",

//				for the building 
				"[$Purpose1$]", "[$Size1$]", "[$Description1$]","[$Date of Acquisition1$]", "[$Cost($)1$]", "[$Present1$]",
				"[$Purpose2$]", "[$Size2$]", "[$Description2$]","[$Date of Acquisition2$]","[$Cost($)2$]", "[$Present2$]",
				"[$Purpose3$]", "[$Size3$]", "[$Description3$]","[$Date of Acquisition3$]","[$Cost($)3$]", "[$Present3$]",
				"[$Purpose4$]", "[$Size4$]", "[$Description4$]","[$Date of Acquisition4$]", "[$Cost($)4$]", "[$Present4$]", 
				"[$Purpose5$]", "[$Size5$]", "[$Description5$]","[$Date of Acquisition5$]","[$Cost($)5$]", "[$Present5$]",

//				for the livestock 
			"[$TypeOfLivestock1$]", "[$AnimalsLiveBy1$]", "[$AverageLive1$]", "[$MarketLocalLive1$]", "[$MarketForeignLive1$]","[$ValueLive1$]", 
			"[$TypeOfLivestock2$]", "[$AnimalsLiveBy2$]", "[$AverageLive2$]", "[$MarketLocalLive2$]","[$MarketForeignLive2$]", "[$ValueLive2$]", 
			"[$TypeOfLivestock3$]", "[$AnimalsLiveBy3$]", "[$AverageLive3$]","[$MarketLocalLive3$]", "[$MarketForeignLive3$]", "[$ValueLive3$]",
			"[$TypeOfLivestock4$]", "[$AnimalsLiveBy4$]","[$AverageLive4$]", "[$MarketLocalLive4$]", "[$MarketForeignLive4$]", "[$ValueLive4$]", 
			"[$TypeOfLivestock5$]", "[$AnimalsLiveBy5$]", "[$AverageLive5$]", "[$MarketLocalLive5$]", "[$MarketForeignLive5$]", "[$ValueLive5$]",
//				for the AgricultureCrop 
			"[$TypeAgri1$]", "[$HectareAgri1$]", "[$ProductionAgri1$]", "[$LocalAgri1$]", "[$ForeignAgri1$]","[$AnnualAgri1$]",
			"[$TypeAgri2$]", "[$HectareAgri2$]", "[$ProductionAgri2$]", "[$LocalAgri2$]", "[$ForeignAgri2$]","[$AnnualAgri2$]",
			"[$TypeAgri3$]", "[$HectareAgri3$]", "[$ProductionAgri3$]", "[$LocalAgri3$]", "[$ForeignAgri3$]","[$AnnualAgri3$]",
			"[$TypeAgri4$]", "[$HectareAgri4$]", "[$ProductionAgri4$]", "[$LocalAgri4$]", "[$ForeignAgri4$]","[$AnnualAgri4$]", 
			"[$TypeAgri5$]", "[$HectareAgri5$]", "[$ProductionAgri5$]", "[$LocalAgri5$]", "[$ForeignAgri5$]","[$AnnualAgri5$]",

//				for the poultry 
			"[$TypePol1$]", "[$CategoryPol1$]", "[$AveragePol1$]", "[$MLocalPol1$]", "[$MforeignPol1$]", "[$SalePol1$]",
			"[$TypePol2$]", "[$CategoryPol2$]", "[$AveragePol2$]", "[$MLocalPol2$]", "[$MforeignPol2$]", "[$SalePol2$]",
			"[$TypePol3$]", "[$CategoryPol3$]", "[$AveragePol3$]", "[$MLocalPol3$]", "[$MforeignPol3$]", "[$SalePol3$]",
			"[$TypePol4$]", "[$CategoryPol4$]", "[$AveragePol4$]", "[$MLocalPol4$]", "[$MforeignPol4$]", "[$SalePol4$]",
			"[$TypePol5$]", "[$CategoryPol5$]", "[$AveragePol5$]", "[$MLocalPol5$]", "[$MforeignPol5$]", "[$SalePol5$]",

//				for the aquaculture 
			"[$TypeAqua1$]","[$WaterAqua1$]","[$AverageAnnualAqua1$]","[$MarketLAqua1$]","[$MarketFAqua1$]","[$ValueofAqua1$]",
			"[$TypeAqua2$]","[$WaterAqua2$]","[$AverageAnnualAqua2$]","[$MarketLAqua2$]","[$MarketFAqua2$]","[$ValueofAqua2$]",
			"[$TypeAqua3$]","[$WaterAqua3$]","[$AverageAnnualAqua3$]","[$MarketLAqua3$]","[$MarketFAqua3$]","[$ValueofAqua3$]",
			"[$TypeAqua4$]","[$WaterAqua4$]","[$AverageAnnualAqua4$]","[$MarketLAqua4$]","[$MarketFAqua4$]","[$ValueofAqua4$]", 
			"[$TypeAqua5$]","[$WaterAqua5$]","[$AverageAnnualAqua5$]","[$MarketLAqua5$]","[$MarketFAqua5$]","[$ValueofAqua5$]",

//				for the apiculture 
		    "[$typeApi1$]","[$ColoniesApi1$]","[$AAnnualApi1$]", "[$marketApi1$]", "[$foreignApi1$]","[$SaleAnnualApi1$]", 
		    "[$typeApi2$]","[$ColoniesApi2$]","[$AAnnualApi2$]", "[$marketApi2$]","[$foreignApi2$]", "[$SaleAnnualApi2$]",
		    "[$typeApi3$]","[$ColoniesApi3$]","[$AAnnualApi3$]","[$marketApi3$]", "[$foreignApi3$]", "[$SaleAnnualApi3$]",
		    "[$typeApi4$]","[$ColoniesApi4$]","[$AAnnualApi4$]", "[$marketApi4$]", "[$foreignApi4$]", "[$SaleAnnualApi4$]",
		    "[$typeApi5$]","[$ColoniesApi5$]","[$AAnnualApi5$]", "[$marketApi5$]", "[$foreignApi5$]", "[$SaleAnnualApi5$]",

//				for the forestry
          "[$FtypeForest1$]","[$EquivalentForest1$]", "[$ProductionKgForest1$]", "[$MmarketForest1$]", "[$ketforeignForest1$]","[$fSaleForest1$]",
          "[$FtypeForest2$]","[$EquivalentForest2$]", "[$ProductionKgForest2$]", "[$MmarketForest2$]","[$ketforeignForest2$]", "[$fSaleForest2$]",
          "[$FtypeForest3$]","[$EquivalentForest3$]", "[$ProductionKgForest3$]","[$MmarketForest3$]", "[$ketforeignForest3$]", "[$fSaleForest3$]",
          "[$FtypeForest4$]","[$EquivalentForest4$]","[$ProductionKgForest4$]", "[$MmarketForest4$]", "[$ketforeignForest4$]", "[$fSaleForest4$]", 
          "[$FtypeForest5$]","[$EquivalentForest5$]", "[$ProductionKgForest5$]", "[$MmarketForest5$]", "[$ketforeignForest5$]", "[$fSaleForest5$]",

//				foe the ornamental 
		"[$FtypeOrnamental1$]", "[$EquivalentOrnamental1$]", "[$ProductionOrnamentalKg1$]", "[$MmarketOrnamental1$]","[$ketforeignOrnamental1$]","[$fSaleOrnamental1$]",
		"[$FtypeOrnamental2$]", "[$EquivalentOrnamental2$]", "[$ProductionOrnamentalKg2$]", "[$MmarketOrnamental2$]","[$ketforeignOrnamental2$]", "[$fSaleOrnamental2$]",
		"[$FtypeOrnamental3$]", "[$EquivalentOrnamental3$]", "[$ProductionOrnamentalKg3$]","[$MmarketOrnamental3$]", "[$ketforeignOrnamental3$]", "[$fSaleOrnamental3$]",
		"[$FtypeOrnamental4$]", "[$EquivalentOrnamental4$]","[$ProductionOrnamentalKg4$]", "[$MmarketOrnamental4$]", "[$ketforeignOrnamental4$]", "[$fSaleOrnamental4$]",
		"[$FtypeOrnamental5$]","[$EquivalentOrnamental5$]", "[$ProductionOrnamentalKg5$]", "[$MmarketOrnamental5$]", "[$ketforeignOrnamental5$]", "[$fSaleOrnamental5$]",
							"[$Date$]" },                                                                             

					new String[] {
//							farmerDetails
	Validator.isNotNull(agricultureFarmer)&&Validator.isNotNull(agricultureFarmer.getFarmerDetail())?agricultureFarmer.getFarmerDetail():"",
	Validator.isNotNull(agricultureFarmer)&&Validator.isNotNull(agricultureFarmer.getNameOfApplicant())?agricultureFarmer.getNameOfApplicant():"",
	Validator.isNotNull(agricultureFarmer)&&Validator.isNotNull(agricultureFarmer.getNameOfFarm())?agricultureFarmer.getNameOfFarm():"",
	Validator.isNotNull(agricultureFarmer)&&Validator.isNotNull(agricultureFarmer.getNameOfProprietor())?agricultureFarmer.getNameOfProprietor():"",
	Validator.isNotNull(agricultureFarmer)&&Validator.isNotNull(agricultureFarmer.getLocalAddress())?agricultureFarmer.getLocalAddress():"",
	Validator.isNotNull(agricultureFarmer)&&Validator.isNotNull(agricultureFarmer.getParishAddress())?agricultureFarmer.getParishAddress():"",
    Validator.isNotNull(agricultureFarmer)&&Validator.isNotNull(agricultureFarmer.getTaxpayerRegistrationNumber())?agricultureFarmer.getTaxpayerRegistrationNumber():"",
    Validator.isNotNull(agricultureFarmer)&&Validator.isNotNull(agricultureFarmer.getFarmerRegistrationNumber())?agricultureFarmer.getFarmerRegistrationNumber():"",
    Validator.isNotNull(agricultureFarmer)&&Validator.isNotNull(agricultureFarmer.getDateOfIncorporation())?dateFormat.format(agricultureFarmer.getDateOfIncorporation()):"",
    Validator.isNotNull(agricultureFarmer)&&Validator.isNotNull(agricultureFarmer.getTelephoneNumber())?agricultureFarmer.getTelephoneNumber():"",
    Validator.isNotNull(agricultureFarmer)&&Validator.isNotNull(agricultureFarmer.getEmailAddress())?agricultureFarmer.getEmailAddress():"",

//						for the farm details 
			(agricultureFarm!=null)&&(agricultureFarm.size()>0)?agricultureFarm.get(0).getLocationOfFarm():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>0)?agricultureFarm.get(0).getLandTenure():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>0)?agricultureFarm.get(0).getNumberOfHectares():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>0)?agricultureFarm.get(0).getNumberOfYears():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>0)?agricultureFarm.get(0).getNumberOfParcels():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>0)?agricultureFarm.get(0).getSizeOfParcel():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>0)?agricultureFarm.get(0).getTopography():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>0)?agricultureFarm.get(0).getNumberOF():"",
    		
	        (agricultureFarm!=null)&&(agricultureFarm.size()>1)?agricultureFarm.get(1).getLocationOfFarm():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>1)?agricultureFarm.get(1).getLandTenure():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>1)?agricultureFarm.get(1).getNumberOfHectares():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>1)?agricultureFarm.get(1).getNumberOfYears():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>1)?agricultureFarm.get(1).getNumberOfParcels():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>1)?agricultureFarm.get(1).getSizeOfParcel():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>1)?agricultureFarm.get(1).getTopography():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>1)?agricultureFarm.get(1).getNumberOF():"",	
			
					
            (agricultureFarm!=null)&&(agricultureFarm.size()>2)?agricultureFarm.get(2).getLocationOfFarm():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>2)?agricultureFarm.get(2).getLandTenure():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>2)?agricultureFarm.get(2).getNumberOfHectares():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>2)?agricultureFarm.get(2).getNumberOfYears():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>2)?agricultureFarm.get(2).getNumberOfParcels():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>2)?agricultureFarm.get(2).getSizeOfParcel():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>2)?agricultureFarm.get(2).getTopography():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>2)?agricultureFarm.get(2).getNumberOF():"",			
			
            (agricultureFarm!=null)&&(agricultureFarm.size()>3)?agricultureFarm.get(3).getLocationOfFarm():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>3)?agricultureFarm.get(3).getLandTenure():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>3)?agricultureFarm.get(3).getNumberOfHectares():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>3)?agricultureFarm.get(3).getNumberOfYears():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>3)?agricultureFarm.get(3).getNumberOfParcels():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>3)?agricultureFarm.get(3).getSizeOfParcel():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>3)?agricultureFarm.get(3).getTopography():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>3)?agricultureFarm.get(3).getNumberOF():"",			
					
	        (agricultureFarm!=null)&&(agricultureFarm.size()>4)?agricultureFarm.get(4).getLocationOfFarm():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>4)?agricultureFarm.get(4).getLandTenure():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>4)?agricultureFarm.get(4).getNumberOfHectares():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>4)?agricultureFarm.get(4).getNumberOfYears():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>4)?agricultureFarm.get(4).getNumberOfParcels():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>4)?agricultureFarm.get(4).getSizeOfParcel():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>4)?agricultureFarm.get(4).getTopography():"",
			(agricultureFarm!=null)&&(agricultureFarm.size()>4)?agricultureFarm.get(4).getNumberOF():"",				
						
//			for the building 
            (agricultureBuilding!=null)&&(agricultureBuilding.size()>0)?agricultureBuilding.get(0).getBuildingPurpose():"",
			(agricultureBuilding!=null)&&(agricultureBuilding.size()>0)?agricultureBuilding.get(0).getBuildingSize():"",
			(agricultureBuilding!=null)&&(agricultureBuilding.size()>0)?agricultureBuilding.get(0).getMachineryDescription():"",
			(agricultureBuilding!=null)&&(agricultureBuilding.size()>0)?new SimpleDateFormat("yyyy-MM-dd").format(agricultureBuilding.get(0).getDateOfAcquisition()) :"",
			(agricultureBuilding!=null)&&(agricultureBuilding.size()>0)?agricultureBuilding.get(0).getBuildingCost():"",
			(agricultureBuilding!=null)&&(agricultureBuilding.size()>0)?agricultureBuilding.get(0).getPresentBookValue():"",
					
			(agricultureBuilding!=null)&&(agricultureBuilding.size()>1)?agricultureBuilding.get(1).getBuildingPurpose():"",
			(agricultureBuilding!=null)&&(agricultureBuilding.size()>1)?agricultureBuilding.get(1).getBuildingSize():"",
	        (agricultureBuilding!=null)&&(agricultureBuilding.size()>1)?agricultureBuilding.get(1).getMachineryDescription():"",
			(agricultureBuilding!=null)&&(agricultureBuilding.size()>1)?new SimpleDateFormat("yyyy-MM-dd").format(agricultureBuilding.get(1).getDateOfAcquisition()) :"",
			(agricultureBuilding!=null)&&(agricultureBuilding.size()>1)?agricultureBuilding.get(1).getBuildingCost():"",
			(agricultureBuilding!=null)&&(agricultureBuilding.size()>1)?agricultureBuilding.get(1).getPresentBookValue():"",				
			
					
	        (agricultureBuilding!=null)&&(agricultureBuilding.size()>2)?agricultureBuilding.get(2).getBuildingPurpose():"",
			(agricultureBuilding!=null)&&(agricultureBuilding.size()>2)?agricultureBuilding.get(2).getBuildingSize():"",
	        (agricultureBuilding!=null)&&(agricultureBuilding.size()>2)?agricultureBuilding.get(2).getMachineryDescription():"",
			(agricultureBuilding!=null)&&(agricultureBuilding.size()>2)?new SimpleDateFormat("yyyy-MM-dd").format(agricultureBuilding.get(2).getDateOfAcquisition()) :"",
			(agricultureBuilding!=null)&&(agricultureBuilding.size()>2)?agricultureBuilding.get(2).getBuildingCost():"",
			(agricultureBuilding!=null)&&(agricultureBuilding.size()>2)?agricultureBuilding.get(2).getPresentBookValue():"",
					
            (agricultureBuilding!=null)&&(agricultureBuilding.size()>3)?agricultureBuilding.get(3).getBuildingPurpose():"",
			(agricultureBuilding!=null)&&(agricultureBuilding.size()>3)?agricultureBuilding.get(3).getBuildingSize():"",
	        (agricultureBuilding!=null)&&(agricultureBuilding.size()>3)?agricultureBuilding.get(3).getMachineryDescription():"",
			(agricultureBuilding!=null)&&(agricultureBuilding.size()>3)?new SimpleDateFormat("yyyy-MM-dd").format(agricultureBuilding.get(3).getDateOfAcquisition()) :"",
			(agricultureBuilding!=null)&&(agricultureBuilding.size()>3)?agricultureBuilding.get(3).getBuildingCost():"",
			(agricultureBuilding!=null)&&(agricultureBuilding.size()>3)?agricultureBuilding.get(3).getPresentBookValue():"",
					
            (agricultureBuilding!=null)&&(agricultureBuilding.size()>4)?agricultureBuilding.get(4).getBuildingPurpose():"",
			(agricultureBuilding!=null)&&(agricultureBuilding.size()>4)?agricultureBuilding.get(4).getBuildingSize():"",
	        (agricultureBuilding!=null)&&(agricultureBuilding.size()>4)?agricultureBuilding.get(4).getMachineryDescription():"",
			(agricultureBuilding!=null)&&(agricultureBuilding.size()>4)?new SimpleDateFormat("yyyy-MM-dd").format(agricultureBuilding.get(4).getDateOfAcquisition()) :"",
			(agricultureBuilding!=null)&&(agricultureBuilding.size()>4)?agricultureBuilding.get(4).getBuildingCost():"",
			(agricultureBuilding!=null)&&(agricultureBuilding.size()>4)?agricultureBuilding.get(4).getPresentBookValue():"",
					
//					for the livestock 
	        (agricultureLivestocks!=null)&&(agricultureLivestocks.size()>0)?agricultureLivestocks.get(0).getLivestockType():"",
			(agricultureLivestocks!=null)&&(agricultureLivestocks.size()>0)?agricultureLivestocks.get(0).getNumberOFAnimalsByCategory():"",
			(agricultureLivestocks!=null)&&(agricultureLivestocks.size()>0)?agricultureLivestocks.get(0).getAverageAnnualProduction():"",
			(agricultureLivestocks!=null)&&(agricultureLivestocks.size()>0)?agricultureLivestocks.get(0).getLivestockMarketlocal():"",
			(agricultureLivestocks!=null)&&(agricultureLivestocks.size()>0)?agricultureLivestocks.get(0).getLivestockMarketForeign():"",
			(agricultureLivestocks!=null)&&(agricultureLivestocks.size()>0)?agricultureLivestocks.get(0).getValueOfSale():"",
					
			(agricultureLivestocks!=null)&&(agricultureLivestocks.size()>1)?agricultureLivestocks.get(1).getLivestockType():"",
			(agricultureLivestocks!=null)&&(agricultureLivestocks.size()>1)?agricultureLivestocks.get(1).getNumberOFAnimalsByCategory():"",
	        (agricultureLivestocks!=null)&&(agricultureLivestocks.size()>1)?agricultureLivestocks.get(1).getAverageAnnualProduction():"",
			(agricultureLivestocks!=null)&&(agricultureLivestocks.size()>1)?agricultureLivestocks.get(1).getLivestockMarketlocal():"",
			(agricultureLivestocks!=null)&&(agricultureLivestocks.size()>1)?agricultureLivestocks.get(1).getLivestockMarketForeign():"",
			(agricultureLivestocks!=null)&&(agricultureLivestocks.size()>1)?agricultureLivestocks.get(1).getValueOfSale():"",
					
					
	        (agricultureLivestocks!=null)&&(agricultureLivestocks.size()>2)?agricultureLivestocks.get(2).getLivestockType():"",
			(agricultureLivestocks!=null)&&(agricultureLivestocks.size()>2)?agricultureLivestocks.get(2).getNumberOFAnimalsByCategory():"",
	        (agricultureLivestocks!=null)&&(agricultureLivestocks.size()>2)?agricultureLivestocks.get(2).getAverageAnnualProduction():"",
			(agricultureLivestocks!=null)&&(agricultureLivestocks.size()>2)?agricultureLivestocks.get(2).getLivestockMarketlocal():"",
			(agricultureLivestocks!=null)&&(agricultureLivestocks.size()>2)?agricultureLivestocks.get(2).getLivestockMarketForeign():"",
			(agricultureLivestocks!=null)&&(agricultureLivestocks.size()>2)?agricultureLivestocks.get(2).getValueOfSale():"",
									
	        (agricultureLivestocks!=null)&&(agricultureLivestocks.size()>3)?agricultureLivestocks.get(3).getLivestockType():"",
			(agricultureLivestocks!=null)&&(agricultureLivestocks.size()>3)?agricultureLivestocks.get(3).getNumberOFAnimalsByCategory():"",
	        (agricultureLivestocks!=null)&&(agricultureLivestocks.size()>3)?agricultureLivestocks.get(3).getAverageAnnualProduction():"",
			(agricultureLivestocks!=null)&&(agricultureLivestocks.size()>3)?agricultureLivestocks.get(3).getLivestockMarketlocal():"",
			(agricultureLivestocks!=null)&&(agricultureLivestocks.size()>3)?agricultureLivestocks.get(3).getLivestockMarketForeign():"",
			(agricultureLivestocks!=null)&&(agricultureLivestocks.size()>3)?agricultureLivestocks.get(3).getValueOfSale():"",
													
	        (agricultureLivestocks!=null)&&(agricultureLivestocks.size()>4)?agricultureLivestocks.get(4).getLivestockType():"",
			(agricultureLivestocks!=null)&&(agricultureLivestocks.size()>4)?agricultureLivestocks.get(4).getNumberOFAnimalsByCategory():"",
	        (agricultureLivestocks!=null)&&(agricultureLivestocks.size()>4)?agricultureLivestocks.get(4).getAverageAnnualProduction():"",
			(agricultureLivestocks!=null)&&(agricultureLivestocks.size()>4)?agricultureLivestocks.get(4).getLivestockMarketlocal():"",
			(agricultureLivestocks!=null)&&(agricultureLivestocks.size()>4)?agricultureLivestocks.get(4).getLivestockMarketForeign():"",
			(agricultureLivestocks!=null)&&(agricultureLivestocks.size()>4)?agricultureLivestocks.get(4).getValueOfSale():"",

//							    for the Agriculture Crop
					
            (agricultureCrops!=null)&&(agricultureCrops.size()>0)?agricultureCrops.get(0).getCropType():"",
			(agricultureCrops!=null)&&(agricultureCrops.size()>0)?agricultureCrops.get(0).getCropHectare():"",
	        (agricultureCrops!=null)&&(agricultureCrops.size()>0)?agricultureCrops.get(0).getAverageAnnualProduction():"",
			(agricultureCrops!=null)&&(agricultureCrops.size()>0)?agricultureCrops.get(0).getCropMarketLocal():"",
			(agricultureCrops!=null)&&(agricultureCrops.size()>0)?agricultureCrops.get(0).getCropMarketForeign():"",
			(agricultureCrops!=null)&&(agricultureCrops.size()>0)?agricultureCrops.get(0).getValueOfSale():"",
					
            (agricultureCrops!=null)&&(agricultureCrops.size()>1)?agricultureCrops.get(1).getCropType():"",
   			(agricultureCrops!=null)&&(agricultureCrops.size()>1)?agricultureCrops.get(1).getCropHectare():"",
   	        (agricultureCrops!=null)&&(agricultureCrops.size()>1)?agricultureCrops.get(1).getAverageAnnualProduction():"",
   			(agricultureCrops!=null)&&(agricultureCrops.size()>1)?agricultureCrops.get(1).getCropMarketLocal():"",
   			(agricultureCrops!=null)&&(agricultureCrops.size()>1)?agricultureCrops.get(1).getCropMarketForeign():"",
   			(agricultureCrops!=null)&&(agricultureCrops.size()>1)?agricultureCrops.get(1).getValueOfSale():"",
				   					
            (agricultureCrops!=null)&&(agricultureCrops.size()>2)?agricultureCrops.get(2).getCropType():"",
			(agricultureCrops!=null)&&(agricultureCrops.size()>2)?agricultureCrops.get(2).getCropHectare():"",
	        (agricultureCrops!=null)&&(agricultureCrops.size()>2)?agricultureCrops.get(2).getAverageAnnualProduction():"",
			(agricultureCrops!=null)&&(agricultureCrops.size()>2)?agricultureCrops.get(2).getCropMarketLocal():"",
			(agricultureCrops!=null)&&(agricultureCrops.size()>2)?agricultureCrops.get(2).getCropMarketForeign():"",
			(agricultureCrops!=null)&&(agricultureCrops.size()>2)?agricultureCrops.get(2).getValueOfSale():"",
				   								
            (agricultureCrops!=null)&&(agricultureCrops.size()>3)?agricultureCrops.get(3).getCropType():"",
			(agricultureCrops!=null)&&(agricultureCrops.size()>3)?agricultureCrops.get(3).getCropHectare():"",
	        (agricultureCrops!=null)&&(agricultureCrops.size()>3)?agricultureCrops.get(3).getAverageAnnualProduction():"",
			(agricultureCrops!=null)&&(agricultureCrops.size()>3)?agricultureCrops.get(3).getCropMarketLocal():"",
			(agricultureCrops!=null)&&(agricultureCrops.size()>3)?agricultureCrops.get(3).getCropMarketForeign():"",
			(agricultureCrops!=null)&&(agricultureCrops.size()>3)?agricultureCrops.get(3).getValueOfSale():"",
				   											
            (agricultureCrops!=null)&&(agricultureCrops.size()>4)?agricultureCrops.get(4).getCropType():"",
			(agricultureCrops!=null)&&(agricultureCrops.size()>4)?agricultureCrops.get(4).getCropHectare():"",
	        (agricultureCrops!=null)&&(agricultureCrops.size()>4)?agricultureCrops.get(4).getAverageAnnualProduction():"",
			(agricultureCrops!=null)&&(agricultureCrops.size()>4)?agricultureCrops.get(4).getCropMarketLocal():"",
			(agricultureCrops!=null)&&(agricultureCrops.size()>4)?agricultureCrops.get(4).getCropMarketForeign():"",
			(agricultureCrops!=null)&&(agricultureCrops.size()>4)?agricultureCrops.get(4).getValueOfSale():"",

//							    for the agriculturePoultry
            (agriculturePoultry!=null)&&(agriculturePoultry.size()>0)?agriculturePoultry.get(0).getPoultryType():"",
			(agriculturePoultry!=null)&&(agriculturePoultry.size()>0)?agriculturePoultry.get(0).getNumberOFBirdsByCategory():"",
	        (agriculturePoultry!=null)&&(agriculturePoultry.size()>0)?agriculturePoultry.get(0).getAverageAnnualProduction():"",
			(agriculturePoultry!=null)&&(agriculturePoultry.size()>0)?agriculturePoultry.get(0).getPoultryMarketLocal():"",
			(agriculturePoultry!=null)&&(agriculturePoultry.size()>0)?agriculturePoultry.get(0).getPoultryMarketForeign():"",
			(agriculturePoultry!=null)&&(agriculturePoultry.size()>0)?agriculturePoultry.get(0).getValueOfSale():"",
		
            (agriculturePoultry!=null)&&(agriculturePoultry.size()>1)?agriculturePoultry.get(1).getPoultryType():"",
			(agriculturePoultry!=null)&&(agriculturePoultry.size()>1)?agriculturePoultry.get(1).getNumberOFBirdsByCategory():"",
	        (agriculturePoultry!=null)&&(agriculturePoultry.size()>1)?agriculturePoultry.get(1).getAverageAnnualProduction():"",
			(agriculturePoultry!=null)&&(agriculturePoultry.size()>1)?agriculturePoultry.get(1).getPoultryMarketLocal():"",
			(agriculturePoultry!=null)&&(agriculturePoultry.size()>1)?agriculturePoultry.get(1).getPoultryMarketForeign():"",
			(agriculturePoultry!=null)&&(agriculturePoultry.size()>1)?agriculturePoultry.get(1).getValueOfSale():"",
					
            (agriculturePoultry!=null)&&(agriculturePoultry.size()>2)?agriculturePoultry.get(2).getPoultryType():"",
 			(agriculturePoultry!=null)&&(agriculturePoultry.size()>2)?agriculturePoultry.get(2).getNumberOFBirdsByCategory():"",
 	        (agriculturePoultry!=null)&&(agriculturePoultry.size()>2)?agriculturePoultry.get(2).getAverageAnnualProduction():"",
 			(agriculturePoultry!=null)&&(agriculturePoultry.size()>2)?agriculturePoultry.get(2).getPoultryMarketLocal():"",
 			(agriculturePoultry!=null)&&(agriculturePoultry.size()>2)?agriculturePoultry.get(2).getPoultryMarketForeign():"",
 			(agriculturePoultry!=null)&&(agriculturePoultry.size()>2)?agriculturePoultry.get(2).getValueOfSale():"",
			     					
            (agriculturePoultry!=null)&&(agriculturePoultry.size()>3)?agriculturePoultry.get(3).getPoultryType():"",
			(agriculturePoultry!=null)&&(agriculturePoultry.size()>3)?agriculturePoultry.get(3).getNumberOFBirdsByCategory():"",
	        (agriculturePoultry!=null)&&(agriculturePoultry.size()>3)?agriculturePoultry.get(3).getAverageAnnualProduction():"",
			(agriculturePoultry!=null)&&(agriculturePoultry.size()>3)?agriculturePoultry.get(3).getPoultryMarketLocal():"",
			(agriculturePoultry!=null)&&(agriculturePoultry.size()>3)?agriculturePoultry.get(3).getPoultryMarketForeign():"",
			(agriculturePoultry!=null)&&(agriculturePoultry.size()>3)?agriculturePoultry.get(3).getValueOfSale():"",
			     			    					
			     			    					
            (agriculturePoultry!=null)&&(agriculturePoultry.size()>4)?agriculturePoultry.get(4).getPoultryType():"",
			(agriculturePoultry!=null)&&(agriculturePoultry.size()>4)?agriculturePoultry.get(4).getNumberOFBirdsByCategory():"",
	        (agriculturePoultry!=null)&&(agriculturePoultry.size()>4)?agriculturePoultry.get(4).getAverageAnnualProduction():"",
			(agriculturePoultry!=null)&&(agriculturePoultry.size()>4)?agriculturePoultry.get(4).getPoultryMarketLocal():"",
			(agriculturePoultry!=null)&&(agriculturePoultry.size()>4)?agriculturePoultry.get(4).getPoultryMarketForeign():"",
			(agriculturePoultry!=null)&&(agriculturePoultry.size()>4)?agriculturePoultry.get(4).getValueOfSale():"",

//							    for the agricultureAquaculture
            (agricultureAquaculture!=null)&&(agricultureAquaculture.size()>0)?agricultureAquaculture.get(0).getAquacultureType():"",
			(agricultureAquaculture!=null)&&(agricultureAquaculture.size()>0)?agricultureAquaculture.get(0).getWaterHectare():"",
	        (agricultureAquaculture!=null)&&(agricultureAquaculture.size()>0)?agricultureAquaculture.get(0).getAverageAnnualProduction():"",
			(agricultureAquaculture!=null)&&(agricultureAquaculture.size()>0)?agricultureAquaculture.get(0).getMarketLocal():"",
			(agricultureAquaculture!=null)&&(agricultureAquaculture.size()>0)?agricultureAquaculture.get(0).getMarketForeign():"",
			(agricultureAquaculture!=null)&&(agricultureAquaculture.size()>0)?agricultureAquaculture.get(0).getValueOfSale():"",
					
            (agricultureAquaculture!=null)&&(agricultureAquaculture.size()>1)?agricultureAquaculture.get(1).getAquacultureType():"",
			(agricultureAquaculture!=null)&&(agricultureAquaculture.size()>1)?agricultureAquaculture.get(1).getWaterHectare():"",
	        (agricultureAquaculture!=null)&&(agricultureAquaculture.size()>1)?agricultureAquaculture.get(1).getAverageAnnualProduction():"",
			(agricultureAquaculture!=null)&&(agricultureAquaculture.size()>1)?agricultureAquaculture.get(1).getMarketLocal():"",
			(agricultureAquaculture!=null)&&(agricultureAquaculture.size()>1)?agricultureAquaculture.get(1).getMarketForeign():"",
			(agricultureAquaculture!=null)&&(agricultureAquaculture.size()>1)?agricultureAquaculture.get(1).getValueOfSale():"",
					
            (agricultureAquaculture!=null)&&(agricultureAquaculture.size()>2)?agricultureAquaculture.get(2).getAquacultureType():"",
			(agricultureAquaculture!=null)&&(agricultureAquaculture.size()>2)?agricultureAquaculture.get(2).getWaterHectare():"",
	        (agricultureAquaculture!=null)&&(agricultureAquaculture.size()>2)?agricultureAquaculture.get(2).getAverageAnnualProduction():"",
			(agricultureAquaculture!=null)&&(agricultureAquaculture.size()>2)?agricultureAquaculture.get(2).getMarketLocal():"",
			(agricultureAquaculture!=null)&&(agricultureAquaculture.size()>2)?agricultureAquaculture.get(2).getMarketForeign():"",
			(agricultureAquaculture!=null)&&(agricultureAquaculture.size()>2)?agricultureAquaculture.get(2).getValueOfSale():"",
										
            (agricultureAquaculture!=null)&&(agricultureAquaculture.size()>3)?agricultureAquaculture.get(3).getAquacultureType():"",
			(agricultureAquaculture!=null)&&(agricultureAquaculture.size()>3)?agricultureAquaculture.get(3).getWaterHectare():"",
	        (agricultureAquaculture!=null)&&(agricultureAquaculture.size()>3)?agricultureAquaculture.get(3).getAverageAnnualProduction():"",
			(agricultureAquaculture!=null)&&(agricultureAquaculture.size()>3)?agricultureAquaculture.get(3).getMarketLocal():"",
			(agricultureAquaculture!=null)&&(agricultureAquaculture.size()>3)?agricultureAquaculture.get(3).getMarketForeign():"",
			(agricultureAquaculture!=null)&&(agricultureAquaculture.size()>3)?agricultureAquaculture.get(3).getValueOfSale():"",
															
            (agricultureAquaculture!=null)&&(agricultureAquaculture.size()>4)?agricultureAquaculture.get(4).getAquacultureType():"",
			(agricultureAquaculture!=null)&&(agricultureAquaculture.size()>4)?agricultureAquaculture.get(4).getWaterHectare():"",
	        (agricultureAquaculture!=null)&&(agricultureAquaculture.size()>4)?agricultureAquaculture.get(4).getAverageAnnualProduction():"",
			(agricultureAquaculture!=null)&&(agricultureAquaculture.size()>4)?agricultureAquaculture.get(4).getMarketLocal():"",
			(agricultureAquaculture!=null)&&(agricultureAquaculture.size()>4)?agricultureAquaculture.get(4).getMarketForeign():"",
			(agricultureAquaculture!=null)&&(agricultureAquaculture.size()>4)?agricultureAquaculture.get(4).getValueOfSale():"",
					

//							    for the agricultureApiculture
            (agricultureApiculture!=null)&&(agricultureApiculture.size()>0)?agricultureApiculture.get(0).getApicultureType():"",
			(agricultureApiculture!=null)&&(agricultureApiculture.size()>0)?agricultureApiculture.get(0).getNumberOfColonies():"",
	        (agricultureApiculture!=null)&&(agricultureApiculture.size()>0)?agricultureApiculture.get(0).getAverageAnnualProduction():"",
			(agricultureApiculture!=null)&&(agricultureApiculture.size()>0)?agricultureApiculture.get(0).getMarketLocal():"",
			(agricultureApiculture!=null)&&(agricultureApiculture.size()>0)?agricultureApiculture.get(0).getMarketForeign():"",
			(agricultureApiculture!=null)&&(agricultureApiculture.size()>0)?agricultureApiculture.get(0).getValueOfSale():"",	
					
            (agricultureApiculture!=null)&&(agricultureApiculture.size()>1)?agricultureApiculture.get(1).getApicultureType():"",
			(agricultureApiculture!=null)&&(agricultureApiculture.size()>1)?agricultureApiculture.get(1).getNumberOfColonies():"",
	        (agricultureApiculture!=null)&&(agricultureApiculture.size()>1)?agricultureApiculture.get(1).getAverageAnnualProduction():"",
			(agricultureApiculture!=null)&&(agricultureApiculture.size()>1)?agricultureApiculture.get(1).getMarketLocal():"",
			(agricultureApiculture!=null)&&(agricultureApiculture.size()>1)?agricultureApiculture.get(1).getMarketForeign():"",
			(agricultureApiculture!=null)&&(agricultureApiculture.size()>1)?agricultureApiculture.get(1).getValueOfSale():"",
					
            (agricultureApiculture!=null)&&(agricultureApiculture.size()>2)?agricultureApiculture.get(2).getApicultureType():"",
			(agricultureApiculture!=null)&&(agricultureApiculture.size()>2)?agricultureApiculture.get(2).getNumberOfColonies():"",
	        (agricultureApiculture!=null)&&(agricultureApiculture.size()>2)?agricultureApiculture.get(2).getAverageAnnualProduction():"",
			(agricultureApiculture!=null)&&(agricultureApiculture.size()>2)?agricultureApiculture.get(2).getMarketLocal():"",
			(agricultureApiculture!=null)&&(agricultureApiculture.size()>2)?agricultureApiculture.get(2).getMarketForeign():"",
			(agricultureApiculture!=null)&&(agricultureApiculture.size()>2)?agricultureApiculture.get(2).getValueOfSale():"",
										
            (agricultureApiculture!=null)&&(agricultureApiculture.size()>3)?agricultureApiculture.get(3).getApicultureType():"",
			(agricultureApiculture!=null)&&(agricultureApiculture.size()>3)?agricultureApiculture.get(3).getNumberOfColonies():"",
	        (agricultureApiculture!=null)&&(agricultureApiculture.size()>3)?agricultureApiculture.get(3).getAverageAnnualProduction():"",
			(agricultureApiculture!=null)&&(agricultureApiculture.size()>3)?agricultureApiculture.get(3).getMarketLocal():"",
			(agricultureApiculture!=null)&&(agricultureApiculture.size()>3)?agricultureApiculture.get(3).getMarketForeign():"",
			(agricultureApiculture!=null)&&(agricultureApiculture.size()>3)?agricultureApiculture.get(3).getValueOfSale():"",
															
	        (agricultureApiculture!=null)&&(agricultureApiculture.size()>4)?agricultureApiculture.get(4).getApicultureType():"",
			(agricultureApiculture!=null)&&(agricultureApiculture.size()>4)?agricultureApiculture.get(4).getNumberOfColonies():"",
	        (agricultureApiculture!=null)&&(agricultureApiculture.size()>4)?agricultureApiculture.get(4).getAverageAnnualProduction():"",
			(agricultureApiculture!=null)&&(agricultureApiculture.size()>4)?agricultureApiculture.get(4).getMarketLocal():"",
			(agricultureApiculture!=null)&&(agricultureApiculture.size()>4)?agricultureApiculture.get(4).getMarketForeign():"",
			(agricultureApiculture!=null)&&(agricultureApiculture.size()>4)?agricultureApiculture.get(4).getValueOfSale():"",
						

//							    for the agriultureForesty
            (agriultureForesty!=null)&&(agriultureForesty.size()>0)?agriultureForesty.get(0).getForestryType():"",
			(agriultureForesty!=null)&&(agriultureForesty.size()>0)?agriultureForesty.get(0).getForestryHectare():"",
	        (agriultureForesty!=null)&&(agriultureForesty.size()>0)?agriultureForesty.get(0).getAverageAnnulaProduction():"",
			(agriultureForesty!=null)&&(agriultureForesty.size()>0)?agriultureForesty.get(0).getForestryMarketLocal():"",
			(agriultureForesty!=null)&&(agriultureForesty.size()>0)?agriultureForesty.get(0).getForestryMarketForeign():"",
			(agriultureForesty!=null)&&(agriultureForesty.size()>0)?agriultureForesty.get(0).getValueOfSale():"",
					
	        (agriultureForesty!=null)&&(agriultureForesty.size()>1)?agriultureForesty.get(1).getForestryType():"",
			(agriultureForesty!=null)&&(agriultureForesty.size()>1)?agriultureForesty.get(1).getForestryHectare():"",
	        (agriultureForesty!=null)&&(agriultureForesty.size()>1)?agriultureForesty.get(1).getAverageAnnulaProduction():"",
			(agriultureForesty!=null)&&(agriultureForesty.size()>1)?agriultureForesty.get(1).getForestryMarketLocal():"",
			(agriultureForesty!=null)&&(agriultureForesty.size()>1)?agriultureForesty.get(1).getForestryMarketForeign():"",
			(agriultureForesty!=null)&&(agriultureForesty.size()>1)?agriultureForesty.get(1).getValueOfSale():"",
			      					
			      					
            (agriultureForesty!=null)&&(agriultureForesty.size()>2)?agriultureForesty.get(2).getForestryType():"",
			(agriultureForesty!=null)&&(agriultureForesty.size()>2)?agriultureForesty.get(2).getForestryHectare():"",
	        (agriultureForesty!=null)&&(agriultureForesty.size()>2)?agriultureForesty.get(2).getAverageAnnulaProduction():"",
			(agriultureForesty!=null)&&(agriultureForesty.size()>2)?agriultureForesty.get(2).getForestryMarketLocal():"",
			(agriultureForesty!=null)&&(agriultureForesty.size()>2)?agriultureForesty.get(2).getForestryMarketForeign():"",
			(agriultureForesty!=null)&&(agriultureForesty.size()>2)?agriultureForesty.get(2).getValueOfSale():"",
			      		    					
			      		    					
            (agriultureForesty!=null)&&(agriultureForesty.size()>3)?agriultureForesty.get(3).getForestryType():"",
			(agriultureForesty!=null)&&(agriultureForesty.size()>3)?agriultureForesty.get(3).getForestryHectare():"",
	        (agriultureForesty!=null)&&(agriultureForesty.size()>3)?agriultureForesty.get(3).getAverageAnnulaProduction():"",
			(agriultureForesty!=null)&&(agriultureForesty.size()>3)?agriultureForesty.get(3).getForestryMarketLocal():"",
			(agriultureForesty!=null)&&(agriultureForesty.size()>3)?agriultureForesty.get(3).getForestryMarketForeign():"",
			(agriultureForesty!=null)&&(agriultureForesty.size()>3)?agriultureForesty.get(3).getValueOfSale():"",
			      		    		    					
            (agriultureForesty!=null)&&(agriultureForesty.size()>4)?agriultureForesty.get(4).getForestryType():"",
			(agriultureForesty!=null)&&(agriultureForesty.size()>4)?agriultureForesty.get(4).getForestryHectare():"",
	        (agriultureForesty!=null)&&(agriultureForesty.size()>4)?agriultureForesty.get(4).getAverageAnnulaProduction():"",
			(agriultureForesty!=null)&&(agriultureForesty.size()>4)?agriultureForesty.get(4).getForestryMarketLocal():"",
			(agriultureForesty!=null)&&(agriultureForesty.size()>4)?agriultureForesty.get(4).getForestryMarketForeign():"",
			(agriultureForesty!=null)&&(agriultureForesty.size()>4)?agriultureForesty.get(4).getValueOfSale():"",
					
//							    for the agricultureOrnamental
					
					
	            (agricultureOrnamental!=null)&&(agricultureOrnamental.size()>0)?agricultureOrnamental.get(0).getOrnamentalType():"",
				(agricultureOrnamental!=null)&&(agricultureOrnamental.size()>0)?agricultureOrnamental.get(0).getOrnamentalProduceArea():"",
		        (agricultureOrnamental!=null)&&(agricultureOrnamental.size()>0)?agricultureOrnamental.get(0).getAverageAnnualProduction():"",
				(agricultureOrnamental!=null)&&(agricultureOrnamental.size()>0)?agricultureOrnamental.get(0).getOrnamentalMarketLocal():"",
				(agricultureOrnamental!=null)&&(agricultureOrnamental.size()>0)?agricultureOrnamental.get(0).getOrnamentalMarketForeign():"",
				(agricultureOrnamental!=null)&&(agricultureOrnamental.size()>0)?agricultureOrnamental.get(0).getValueOfSale():"",
						
	            (agricultureOrnamental!=null)&&(agricultureOrnamental.size()>1)?agricultureOrnamental.get(1).getOrnamentalType():"",
				(agricultureOrnamental!=null)&&(agricultureOrnamental.size()>1)?agricultureOrnamental.get(1).getOrnamentalProduceArea():"",
		        (agricultureOrnamental!=null)&&(agricultureOrnamental.size()>1)?agricultureOrnamental.get(1).getAverageAnnualProduction():"",
				(agricultureOrnamental!=null)&&(agricultureOrnamental.size()>1)?agricultureOrnamental.get(1).getOrnamentalMarketLocal():"",
				(agricultureOrnamental!=null)&&(agricultureOrnamental.size()>1)?agricultureOrnamental.get(1).getOrnamentalMarketForeign():"",
				(agricultureOrnamental!=null)&&(agricultureOrnamental.size()>1)?agricultureOrnamental.get(1).getValueOfSale():"",
										
	            (agricultureOrnamental!=null)&&(agricultureOrnamental.size()>2)?agricultureOrnamental.get(2).getOrnamentalType():"",
				(agricultureOrnamental!=null)&&(agricultureOrnamental.size()>2)?agricultureOrnamental.get(2).getOrnamentalProduceArea():"",
		        (agricultureOrnamental!=null)&&(agricultureOrnamental.size()>2)?agricultureOrnamental.get(2).getAverageAnnualProduction():"",
				(agricultureOrnamental!=null)&&(agricultureOrnamental.size()>2)?agricultureOrnamental.get(2).getOrnamentalMarketLocal():"",
				(agricultureOrnamental!=null)&&(agricultureOrnamental.size()>2)?agricultureOrnamental.get(2).getOrnamentalMarketForeign():"",
				(agricultureOrnamental!=null)&&(agricultureOrnamental.size()>2)?agricultureOrnamental.get(2).getValueOfSale():"",
														
	            (agricultureOrnamental!=null)&&(agricultureOrnamental.size()>3)?agricultureOrnamental.get(3).getOrnamentalType():"",
				(agricultureOrnamental!=null)&&(agricultureOrnamental.size()>3)?agricultureOrnamental.get(3).getOrnamentalProduceArea():"",
		        (agricultureOrnamental!=null)&&(agricultureOrnamental.size()>3)?agricultureOrnamental.get(3).getAverageAnnualProduction():"",
				(agricultureOrnamental!=null)&&(agricultureOrnamental.size()>3)?agricultureOrnamental.get(3).getOrnamentalMarketLocal():"",
				(agricultureOrnamental!=null)&&(agricultureOrnamental.size()>3)?agricultureOrnamental.get(3).getOrnamentalMarketForeign():"",
				(agricultureOrnamental!=null)&&(agricultureOrnamental.size()>3)?agricultureOrnamental.get(3).getValueOfSale():"",
																		
	            (agricultureOrnamental!=null)&&(agricultureOrnamental.size()>4)?agricultureOrnamental.get(4).getOrnamentalType():"",
				(agricultureOrnamental!=null)&&(agricultureOrnamental.size()>4)?agricultureOrnamental.get(4).getOrnamentalProduceArea():"",
		        (agricultureOrnamental!=null)&&(agricultureOrnamental.size()>4)?agricultureOrnamental.get(4).getAverageAnnualProduction():"",
				(agricultureOrnamental!=null)&&(agricultureOrnamental.size()>4)?agricultureOrnamental.get(4).getOrnamentalMarketLocal():"",
				(agricultureOrnamental!=null)&&(agricultureOrnamental.size()>4)?agricultureOrnamental.get(4).getOrnamentalMarketForeign():"",
				(agricultureOrnamental!=null)&&(agricultureOrnamental.size()>4)?agricultureOrnamental.get(4).getValueOfSale():"",
				dateFormat.format(agricultureApplication.getCreateDate()) 
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
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Agriculture Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(agricultureApplication.getAgricultureApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
		}
		try {
			String previewUrl = replaceSignatureForAgricullture(agricultureApplication.getAgricultureApplicationId(),
					"Agriculture Supported Documents", themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId(), themeDisplay);
			System.out.println("signature previewUrl in agriculture--------------"+previewUrl);
			{
				pdfTemplate = StringUtil.replace(pdfTemplate, new String[] { "[$Signature$]" },
						new String[] { previewUrl });
			}
		} catch (Exception e) {
		}
		if (!checkPdfSendingInLaunchCaseWithoutDoc.equals("false")) {
			String fileName = null;
			String title = null;
			String applicationForm = null;
			String TccTaj = null;
			for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
				fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
				fileName = fileEntry.getFileName();
				title = fileEntry.getTitle();
				if (title.equals("Application Form")) {
					applicationForm = fileName;
				} else if (title.equals("TCC + TAJ Web Page Print Out")) {
					TccTaj = fileName;
				}
			}
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//		for the document 
					"[$Application Form$]", "[$WebPagePrintOutforOwner$]" }, new String[] { applicationForm, TccTaj });
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
	}
	return contentBody;
}
}
