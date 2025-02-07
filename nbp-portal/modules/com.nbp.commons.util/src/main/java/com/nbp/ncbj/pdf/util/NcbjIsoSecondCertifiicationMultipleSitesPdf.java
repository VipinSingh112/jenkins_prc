package com.nbp.ncbj.pdf.util;

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
import com.nbp.ncbj.application.form.service.model.NcbjApplication;
import com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen;
import com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAdd;
import com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail;
import com.nbp.ncbj.application.form.service.model.NcbjPremisesLocation;
import com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetail;
import com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd;
import com.nbp.ncbj.application.form.service.model.NcbjSectionFour;
import com.nbp.ncbj.application.form.service.model.NcbjSectionThree;
import com.nbp.ncbj.application.form.service.model.NcbjSectionTwo;
import com.nbp.ncbj.application.form.service.model.NcbjSpecificActivities;
import com.nbp.ncbj.application.form.service.service.NcbjApplicationLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjCompanyDetailGenLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjNumOfEmpAddLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjOrganizationDetailLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjPremisesLocationLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjProductServiceDetailLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjSectionDetailAddLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjSectionFourLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjSectionThreeLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjSectionTwoLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjSpecificActivitiesLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class NcbjIsoSecondCertifiicationMultipleSitesPdf {
	public static String replaceSignatureForFromSingle(long ncbjApplicationId, String folderName, long groupId,
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
	
	public static String getIsoSecondFormMultipleSitesPdf(long ncbjApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		NcbjApplication ncbjApplication=null;
		List<NcbjCompanyDetailGen> companyDetail=null;
		List<NcbjCompanyDetailGen> companyDetailTwo=null;
		List<NcbjProductServiceDetail> productDetail=null;
		NcbjPremisesLocation premisesLocation=null;
		List<NcbjNumOfEmpAdd> numOfEmp = null;
		List<NcbjSectionDetailAdd> workPattern = null;
		NcbjSectionTwo processDetails=null;
		NcbjSectionThree sectionThree=null;
		NcbjSectionFour consultService=null;
		NcbjOrganizationDetail quotationFormTwo=null;
		List<NcbjSpecificActivities> specificActivities = null;
		
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		//Signatures
		String signatureForFormSingle = null;
		String signatureForAssignment = null;
		
		try {
			ncbjApplication= NcbjApplicationLocalServiceUtil.getNcbjApplication(ncbjApplicationId);
		}catch (Exception e) {
		}
		try {
			companyDetail= NcbjCompanyDetailGenLocalServiceUtil.getNCBJListByAppId(ncbjApplicationId);
		} catch (Exception e) {
		}
		try {
			companyDetailTwo= NcbjCompanyDetailGenLocalServiceUtil.getNCBJListByAppId(ncbjApplicationId);
		} catch (Exception e) {
		}
		try {
			productDetail= NcbjProductServiceDetailLocalServiceUtil.getNCBJ_ByAppId(ncbjApplicationId);
		} catch (Exception e) {
		}
		try {
			premisesLocation= NcbjPremisesLocationLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
		} catch (Exception e) {
		}
		try {
			numOfEmp= NcbjNumOfEmpAddLocalServiceUtil.getNCBJById(ncbjApplicationId);
		} catch (Exception e) {
		}
		try {
			workPattern= NcbjSectionDetailAddLocalServiceUtil.getNCBJById(ncbjApplicationId);
		} catch (Exception e) {
		}
		try {
			processDetails= NcbjSectionTwoLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
		} catch (Exception e) {
		}
		try {
			sectionThree= NcbjSectionThreeLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			consultService= NcbjSectionFourLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
		} catch (Exception e) {
		}
		try {
			quotationFormTwo= NcbjOrganizationDetailLocalServiceUtil.getNCBJ_ByAppId(ncbjApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			specificActivities= NcbjSpecificActivitiesLocalServiceUtil.getNcbjById(ncbjApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("List of Specific Activities---->>>>"+specificActivities);
				
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "NCBJ Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(), String.valueOf(ncbjApplication.getNcbjApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//signatures
		try {
			signatureForFormSingle =replaceSignatureForFromSingle(
					consultService.getNcbjApplicationId(), "Signature",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"iso-22000-2018-certification-multiple-2");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"iso-22000-2018-certification-multiple");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, 
			new String[] {
			//Applicant details
					
			"[$ComDetailsInfo1$]", "[$ComAddInfo1$]", "[$ComTitleInfo1$]", "[$ComJobInfo1$]", "[$ComEmailInfo1$]","[$ComTeleNum1$]", "[$ComContactNum1$]", "[$ComJobInfo1$]", "[$ComAddressSec1$]", "[$ComTelephone1$]",
			"[$ComDetailsInfo2$]", "[$ComAddInfo2$]", "[$ComTitleInfo2$]", "[$ComJobInfo2$]", "[$ComEmailInfo2$]","[$ComTeleNum2$]", "[$ComContactNum2$]", "[$ComJobInfo2$]", "[$ComAddressSec2$]", "[$ComTelephone2$]",
			"[$ComDetailsInfo3$]", "[$ComAddInfo3$]", "[$ComTitleInfo3$]", "[$ComJobInfo3$]", "[$ComEmailInfo3$]","[$ComTeleNum3$]", "[$ComContactNum3$]", "[$ComJobInfo3$]", "[$ComAddressSec3$]", "[$ComTelephone3$]",
			"[$ComDetailsInfo4$]", "[$ComAddInfo4$]", "[$ComTitleInfo4$]", "[$ComJobInfo4$]", "[$ComEmailInfo4$]","[$ComTeleNum4$]", "[$ComContactNum4$]", "[$ComJobInfo4$]", "[$ComAddressSec4$]", "[$ComTelephone4$]",
			"[$ComDetailsInfo5$]", "[$ComAddInfo5$]", "[$ComTitleInfo5$]", "[$ComJobInfo5$]", "[$ComEmailInfo5$]","[$ComTeleNum5$]", "[$ComContactNum5$]", "[$ComJobInfo5$]", "[$ComAddressSec5$]", "[$ComTelephone5$]",

		
			"[$CompanyOff1$]", "[$CompanyAdd1$]", "[$TitleJ1$]", "[$Jtitle1$]", "[$EmailAdd1$]","[$TeleNum1$]", "[$ContactN1$]", "[$JobT1$]", "[$AddE1$]", "[$TeleN1$]",
			"[$CompanyOff2$]", "[$CompanyAdd2$]", "[$TitleJ2$]", "[$Jtitle2$]", "[$EmailAdd2$]","[$TeleNum2$]", "[$ContactN2$]", "[$JobT2$]", "[$AddE2$]", "[$TeleN2$]",
			"[$CompanyOff3$]", "[$CompanyAdd3$]", "[$TitleJ3$]", "[$Jtitle3$]", "[$EmailAdd3$]","[$TeleNum3$]", "[$ContactN3$]", "[$JobT3$]", "[$AddE3$]", "[$TeleN3$]",
			"[$CompanyOff4$]", "[$CompanyAdd4$]", "[$TitleJ4$]", "[$Jtitle4$]", "[$EmailAdd4$]","[$TeleNum4$]", "[$ContactN4$]", "[$JobT4$]", "[$AddE4$]", "[$TeleN4$]",
			"[$CompanyOff5$]", "[$CompanyAdd5$]", "[$TitleJ5$]", "[$Jtitle5$]", "[$EmailAdd5$]","[$TeleNum5$]", "[$ContactN5$]", "[$JobT5$]", "[$AddE5$]", "[$TeleN5$]",

			
			"[$NuberType1$]", "[$ListP1$]", "[$ProductionLi1$]",
			"[$NuberType2$]", "[$ListP2$]", "[$ProductionLi2$]",
			"[$NuberType3$]", "[$ListP3$]", "[$ProductionLi3$]",
			"[$NuberType4$]", "[$ListP4$]", "[$ProductionLi4$]",
			"[$NuberType5$]", "[$ListP5$]", "[$ProductionLi5$]",
			
			"[$ScopeD$]", "[$ActivitiesTo$]", "[$DescribeCom$]",
			
			"[$OfficeH1$]", "[$AdminOffice1$]", "[$ProduCtion1$]", "[$MaintenS1$]", "[$LogisT1$]","[$TotaL1$]", "[$SeasonAl1$]", "[$Temp1$]", "[$SubCont1$]",
			"[$OfficeH2$]", "[$AdminOffice2$]", "[$ProduCtion2$]", "[$MaintenS2$]", "[$LogisT2$]","[$TotaL2$]", "[$SeasonAl2$]", "[$Temp2$]", "[$SubCont2$]",
			"[$OfficeH3$]", "[$AdminOffice3$]", "[$ProduCtion3$]", "[$MaintenS3$]", "[$LogisT3$]","[$TotaL3$]", "[$SeasonAl3$]", "[$Temp3$]", "[$SubCont3$]",
			"[$OfficeH4$]", "[$AdminOffice4$]", "[$ProduCtion4$]", "[$MaintenS4$]", "[$LogisT4$]","[$TotaL4$]", "[$SeasonAl4$]", "[$Temp4$]", "[$SubCont4$]",
			"[$OfficeH5$]", "[$AdminOffice5$]", "[$ProduCtion5$]", "[$MaintenS5$]", "[$LogisT5$]","[$TotaL5$]", "[$SeasonAl5$]", "[$Temp5$]", "[$SubCont5$]",
			
		
			"[$EmployeeS1$]", "[$EmployeeS2$]", "[$EmployeeS3$]", "[$EmployeeS4$]", "[$EmployeeS5$]",
			
			"[$StateOf$]", "[$SizeOf$]", "[$LocationState$]", "[$GiveD$]", 
			"[$InMaterials$]", "[$ProductS$]", "[$BuildingAspect$]", "[$WasteDi$]", "[$TransporT$]", "[$SubMain$]", 
		
			"[$processActiv$]", "[$ExtenThe$]", "[$incomingDes$]", "[$processesDes$]", 
			//checkbox
			"[$FrimTele1$]", "[$EmailConsul1$]",
			"[$FrimTele2$]", "[$EmailConsul2$]",
			"[$FrimTele3$]", "[$EmailConsul3$]",
			"[$FrimTele4$]", "[$EmailConsul4$]",
			"[$FrimTele5$]", "[$EmailConsul5$]",
			"[$FrimTele6$]", "[$EmailConsul6$]",
			"[$FrimTele7$]", "[$EmailConsul7$]",
			"[$FrimTele8$]", "[$EmailConsul8$]",
			"[$FrimTele9$]", "[$EmailConsul9$]",
			"[$FrimTele10$]", "[$EmailConsul10$]",
			
			"[$ExplainIfNeed$]", 
			
			"[$HaccpStudy1$]", "[$HaccpStudy2$]", "[$HaccpStudy3$]", "[$HaccpStudy4$]", "[$HaccpStudy5$]",
			"[$HazardAnalysis1$]", "[$HazardAnalysis2$]", "[$HazardAnalysis3$]", "[$HazardAnalysis4$]", "[$HazardAnalysis5$]",
			"[$ConsentsLicence1$]", "[$ConsentsLicence2$]", "[$ConsentsLicence3$]", "[$ConsentsLicence4$]", "[$ConsentsLicence5$]",
			
			"[$ManufacturingCategories$]",
			"[$ManagementSystem$]","[$ConsFrimTele$]", "[$EmailConsuls$]", 
			"[$StaGe$]", "[$StagE$]", "[$SurAudit$]", "[$RecertiAudit$]", "[$PreAduit$]",
			"[$AnyService$]", "[$NamE$]", "[$PosiTion$]", "[$SigNaturE$]", "[$DaTeCom$]",

			"[$OrgaName$]", "[$Add$]", "[$TelePhoneCo$]", "[$NumF$]", "[$MailAdd$]", "[$Pos$]", "[$ContPerson$]", "[$PosT$]", "[$ImpleProcess$]",
			"[$ScoprOf$]", "[$TypePro$]", "[$NumLine$]", "[$NumbSt$]", "[$NumbPoint$]", "[$OptionalPrer$]", "[$SizeFaciliti$]", "[$WarehouseSize$]",
			"[$ManufactureServices$]", "[$IsYour$]"

			},
			new String[] {
    		//Applicant details
			(companyDetail!=null)&&(companyDetail.size()>0)?companyDetail.get(0).getCompanyName():"",
			(companyDetail!=null)&&(companyDetail.size()>0)?companyDetail.get(0).getCompanyAddress():"",
			(companyDetail!=null)&&(companyDetail.size()>0)?companyDetail.get(0).getHeadOfCompany():"",
			(companyDetail!=null)&&(companyDetail.size()>0)?companyDetail.get(0).getJobTitleOne():"",
			(companyDetail!=null)&&(companyDetail.size()>0)?companyDetail.get(0).getCompanyEmailOne():"",
			(companyDetail!=null)&&(companyDetail.size()>0)?companyDetail.get(0).getCompanyNumOne():"",
			(companyDetail!=null)&&(companyDetail.size()>0)?companyDetail.get(0).getContactName():"",
			(companyDetail!=null)&&(companyDetail.size()>0)?companyDetail.get(0).getJobTitleTwo():"",
			(companyDetail!=null)&&(companyDetail.size()>0)?companyDetail.get(0).getCompanyEmailTwo():"",
			(companyDetail!=null)&&(companyDetail.size()>0)?companyDetail.get(0).getCompanyNumTwo():"",
									
			(companyDetail!=null)&&(companyDetail.size()>1)?companyDetail.get(1).getCompanyName():"",
			(companyDetail!=null)&&(companyDetail.size()>1)?companyDetail.get(1).getCompanyAddress():"",
			(companyDetail!=null)&&(companyDetail.size()>1)?companyDetail.get(1).getHeadOfCompany():"",
			(companyDetail!=null)&&(companyDetail.size()>1)?companyDetail.get(1).getJobTitleOne():"",
			(companyDetail!=null)&&(companyDetail.size()>1)?companyDetail.get(1).getCompanyEmailOne():"",
			(companyDetail!=null)&&(companyDetail.size()>1)?companyDetail.get(1).getCompanyNumOne():"",
			(companyDetail!=null)&&(companyDetail.size()>1)?companyDetail.get(1).getContactName():"",
			(companyDetail!=null)&&(companyDetail.size()>1)?companyDetail.get(1).getJobTitleTwo():"",
			(companyDetail!=null)&&(companyDetail.size()>1)?companyDetail.get(1).getCompanyEmailTwo():"",
			(companyDetail!=null)&&(companyDetail.size()>1)?companyDetail.get(1).getCompanyNumTwo():"",
			
			(companyDetail!=null)&&(companyDetail.size()>2)?companyDetail.get(2).getCompanyName():"",
			(companyDetail!=null)&&(companyDetail.size()>2)?companyDetail.get(2).getCompanyAddress():"",
			(companyDetail!=null)&&(companyDetail.size()>2)?companyDetail.get(2).getHeadOfCompany():"",
			(companyDetail!=null)&&(companyDetail.size()>2)?companyDetail.get(2).getJobTitleOne():"",
			(companyDetail!=null)&&(companyDetail.size()>2)?companyDetail.get(2).getCompanyEmailOne():"",
			(companyDetail!=null)&&(companyDetail.size()>2)?companyDetail.get(2).getCompanyNumOne():"",
			(companyDetail!=null)&&(companyDetail.size()>2)?companyDetail.get(2).getContactName():"",
			(companyDetail!=null)&&(companyDetail.size()>2)?companyDetail.get(2).getJobTitleTwo():"",
			(companyDetail!=null)&&(companyDetail.size()>2)?companyDetail.get(2).getCompanyEmailTwo():"",
			(companyDetail!=null)&&(companyDetail.size()>2)?companyDetail.get(2).getCompanyNumTwo():"",
			
			(companyDetail!=null)&&(companyDetail.size()>3)?companyDetail.get(3).getCompanyName():"",
			(companyDetail!=null)&&(companyDetail.size()>3)?companyDetail.get(3).getCompanyAddress():"",
			(companyDetail!=null)&&(companyDetail.size()>3)?companyDetail.get(3).getHeadOfCompany():"",
			(companyDetail!=null)&&(companyDetail.size()>3)?companyDetail.get(3).getJobTitleOne():"",
			(companyDetail!=null)&&(companyDetail.size()>3)?companyDetail.get(3).getCompanyEmailOne():"",
			(companyDetail!=null)&&(companyDetail.size()>3)?companyDetail.get(3).getCompanyNumOne():"",
			(companyDetail!=null)&&(companyDetail.size()>3)?companyDetail.get(3).getContactName():"",
			(companyDetail!=null)&&(companyDetail.size()>3)?companyDetail.get(3).getJobTitleTwo():"",
			(companyDetail!=null)&&(companyDetail.size()>3)?companyDetail.get(3).getCompanyEmailTwo():"",
			(companyDetail!=null)&&(companyDetail.size()>3)?companyDetail.get(3).getCompanyNumTwo():"",
			
			(companyDetail!=null)&&(companyDetail.size()>4)?companyDetail.get(4).getCompanyName():"",
			(companyDetail!=null)&&(companyDetail.size()>4)?companyDetail.get(4).getCompanyAddress():"",
			(companyDetail!=null)&&(companyDetail.size()>4)?companyDetail.get(4).getHeadOfCompany():"",
			(companyDetail!=null)&&(companyDetail.size()>4)?companyDetail.get(4).getJobTitleOne():"",
			(companyDetail!=null)&&(companyDetail.size()>4)?companyDetail.get(4).getCompanyEmailOne():"",
			(companyDetail!=null)&&(companyDetail.size()>4)?companyDetail.get(4).getCompanyNumOne():"",
			(companyDetail!=null)&&(companyDetail.size()>4)?companyDetail.get(4).getContactName():"",
			(companyDetail!=null)&&(companyDetail.size()>4)?companyDetail.get(4).getJobTitleTwo():"",
			(companyDetail!=null)&&(companyDetail.size()>4)?companyDetail.get(4).getCompanyEmailTwo():"",
			(companyDetail!=null)&&(companyDetail.size()>4)?companyDetail.get(4).getCompanyNumTwo():"",
				
					//section II-company detail
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>0)?companyDetailTwo.get(0).getCompanyName():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>0)?companyDetailTwo.get(0).getCompanyAddress():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>0)?companyDetailTwo.get(0).getHeadOfCompany():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>0)?companyDetailTwo.get(0).getJobTitleOne():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>0)?companyDetailTwo.get(0).getCompanyEmailOne():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>0)?companyDetailTwo.get(0).getCompanyNumOne():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>0)?companyDetailTwo.get(0).getContactName():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>0)?companyDetailTwo.get(0).getJobTitleTwo():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>0)?companyDetailTwo.get(0).getCompanyEmailTwo():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>0)?companyDetailTwo.get(0).getCompanyNumTwo():"",

			(companyDetailTwo!=null)&&(companyDetailTwo.size()>1)?companyDetailTwo.get(1).getCompanyName():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>1)?companyDetailTwo.get(1).getCompanyAddress():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>1)?companyDetailTwo.get(1).getHeadOfCompany():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>1)?companyDetailTwo.get(1).getJobTitleOne():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>1)?companyDetailTwo.get(1).getCompanyEmailOne():"",
					(companyDetailTwo!=null)&&(companyDetailTwo.size()>1)?companyDetailTwo.get(1).getCompanyNumOne():"",
					(companyDetailTwo!=null)&&(companyDetailTwo.size()>1)?companyDetailTwo.get(1).getContactName():"",
					(companyDetailTwo!=null)&&(companyDetailTwo.size()>1)?companyDetailTwo.get(1).getJobTitleTwo():"",
					(companyDetailTwo!=null)&&(companyDetailTwo.size()>1)?companyDetailTwo.get(1).getCompanyEmailTwo():"",
					(companyDetailTwo!=null)&&(companyDetailTwo.size()>1)?companyDetailTwo.get(1).getCompanyNumTwo():"",

			(companyDetailTwo!=null)&&(companyDetailTwo.size()>2)?companyDetailTwo.get(2).getCompanyName():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>2)?companyDetailTwo.get(2).getCompanyAddress():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>2)?companyDetailTwo.get(2).getHeadOfCompany():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>2)?companyDetailTwo.get(2).getJobTitleOne():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>2)?companyDetailTwo.get(2).getCompanyEmailOne():"",
					(companyDetailTwo!=null)&&(companyDetailTwo.size()>2)?companyDetailTwo.get(2).getCompanyNumOne():"",
					(companyDetailTwo!=null)&&(companyDetailTwo.size()>2)?companyDetailTwo.get(2).getContactName():"",
					(companyDetailTwo!=null)&&(companyDetailTwo.size()>2)?companyDetailTwo.get(2).getJobTitleTwo():"",
					(companyDetailTwo!=null)&&(companyDetailTwo.size()>2)?companyDetailTwo.get(2).getCompanyEmailTwo():"",
					(companyDetailTwo!=null)&&(companyDetailTwo.size()>2)?companyDetailTwo.get(2).getCompanyNumTwo():"",

			
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>3)?companyDetailTwo.get(3).getCompanyName():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>3)?companyDetailTwo.get(3).getCompanyAddress():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>3)?companyDetailTwo.get(3).getHeadOfCompany():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>3)?companyDetailTwo.get(3).getJobTitleOne():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>3)?companyDetailTwo.get(3).getCompanyEmailOne():"",
					(companyDetailTwo!=null)&&(companyDetailTwo.size()>3)?companyDetailTwo.get(3).getCompanyNumOne():"",
					(companyDetailTwo!=null)&&(companyDetailTwo.size()>3)?companyDetailTwo.get(3).getContactName():"",
					(companyDetailTwo!=null)&&(companyDetailTwo.size()>3)?companyDetailTwo.get(3).getJobTitleTwo():"",
					(companyDetailTwo!=null)&&(companyDetailTwo.size()>3)?companyDetailTwo.get(3).getCompanyEmailTwo():"",
					(companyDetailTwo!=null)&&(companyDetailTwo.size()>3)?companyDetailTwo.get(3).getCompanyNumTwo():"",

			
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>4)?companyDetailTwo.get(4).getCompanyName():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>4)?companyDetailTwo.get(4).getCompanyAddress():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>4)?companyDetailTwo.get(4).getHeadOfCompany():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>4)?companyDetailTwo.get(4).getJobTitleOne():"",
			(companyDetailTwo!=null)&&(companyDetailTwo.size()>4)?companyDetailTwo.get(4).getCompanyEmailOne():"",
				(companyDetailTwo!=null)&&(companyDetailTwo.size()>4)?companyDetailTwo.get(4).getCompanyNumOne():"",
				(companyDetailTwo!=null)&&(companyDetailTwo.size()>4)?companyDetailTwo.get(4).getContactName():"",
				(companyDetailTwo!=null)&&(companyDetailTwo.size()>4)?companyDetailTwo.get(4).getJobTitleTwo():"",
				(companyDetailTwo!=null)&&(companyDetailTwo.size()>4)?companyDetailTwo.get(4).getCompanyEmailTwo():"",
				(companyDetailTwo!=null)&&(companyDetailTwo.size()>4)?companyDetailTwo.get(4).getCompanyNumTwo():"",
					
						
			(productDetail!=null)&&(productDetail.size()>0)?productDetail.get(0).getProductType():"",
			(productDetail!=null)&&(productDetail.size()>0)?productDetail.get(0).getProductList():"",
			(productDetail!=null)&&(productDetail.size()>0)?productDetail.get(0).getProductLines():"",
					
			(productDetail!=null)&&(productDetail.size()>1)?productDetail.get(1).getProductType():"",
			(productDetail!=null)&&(productDetail.size()>1)?productDetail.get(1).getProductList():"",
			(productDetail!=null)&&(productDetail.size()>1)?productDetail.get(1).getProductLines():"",
			
			(productDetail!=null)&&(productDetail.size()>2)?productDetail.get(2).getProductType():"",
			(productDetail!=null)&&(productDetail.size()>2)?productDetail.get(2).getProductList():"",
			(productDetail!=null)&&(productDetail.size()>2)?productDetail.get(2).getProductLines():"",
			
			(productDetail!=null)&&(productDetail.size()>3)?productDetail.get(3).getProductType():"",
			(productDetail!=null)&&(productDetail.size()>3)?productDetail.get(3).getProductList():"",
			(productDetail!=null)&&(productDetail.size()>3)?productDetail.get(3).getProductLines():"",
			
			(productDetail!=null)&&(productDetail.size()>4)?productDetail.get(4).getProductType():"",
			(productDetail!=null)&&(productDetail.size()>4)?productDetail.get(4).getProductList():"",
			(productDetail!=null)&&(productDetail.size()>4)?productDetail.get(4).getProductLines():"",
														
			Validator.isNotNull(premisesLocation)&&Validator.isNotNull(premisesLocation.getTransferReasonDraft())?premisesLocation.getTransferReasonDraft():"",
			Validator.isNotNull(premisesLocation)&&Validator.isNotNull(premisesLocation.getActivityExclusion())?premisesLocation.getActivityExclusion():"",
			Validator.isNotNull(premisesLocation)&&Validator.isNotNull(premisesLocation.getTransferReasonAct())?premisesLocation.getTransferReasonAct():"",
				
			(numOfEmp!=null)&&(numOfEmp.size()>0)?numOfEmp.get(0).getHeadOffice():"",
			(numOfEmp!=null)&&(numOfEmp.size()>0)?numOfEmp.get(0).getAdministrationOffice():"",
			(numOfEmp!=null)&&(numOfEmp.size()>0)?numOfEmp.get(0).getProductionProcessing():"",		
			(numOfEmp!=null)&&(numOfEmp.size()>0)?numOfEmp.get(0).getMaintenanceService():"",		
			(numOfEmp!=null)&&(numOfEmp.size()>0)?numOfEmp.get(0).getLogistics():"",	
				(numOfEmp!=null)&&(numOfEmp.size()>0)?numOfEmp.get(0).getTotal():"",		
				(numOfEmp!=null)&&(numOfEmp.size()>0)?numOfEmp.get(0).getSeasonal():"",		
				(numOfEmp!=null)&&(numOfEmp.size()>0)?numOfEmp.get(0).getTemporary():"",		
				(numOfEmp!=null)&&(numOfEmp.size()>0)?numOfEmp.get(0).getSubcontracted():"",		
							
					
			(numOfEmp!=null)&&(numOfEmp.size()>1)?numOfEmp.get(1).getHeadOffice():"",
			(numOfEmp!=null)&&(numOfEmp.size()>1)?numOfEmp.get(1).getAdministrationOffice():"",
			(numOfEmp!=null)&&(numOfEmp.size()>1)?numOfEmp.get(1).getProductionProcessing():"",		
			(numOfEmp!=null)&&(numOfEmp.size()>1)?numOfEmp.get(1).getMaintenanceService():"",		
			(numOfEmp!=null)&&(numOfEmp.size()>1)?numOfEmp.get(1).getLogistics():"",	
				(numOfEmp!=null)&&(numOfEmp.size()>1)?numOfEmp.get(1).getTotal():"",		
				(numOfEmp!=null)&&(numOfEmp.size()>1)?numOfEmp.get(1).getSeasonal():"",		
				(numOfEmp!=null)&&(numOfEmp.size()>1)?numOfEmp.get(1).getTemporary():"",		
				(numOfEmp!=null)&&(numOfEmp.size()>1)?numOfEmp.get(1).getSubcontracted():"",		
					
			
			(numOfEmp!=null)&&(numOfEmp.size()>2)?numOfEmp.get(2).getHeadOffice():"",
			(numOfEmp!=null)&&(numOfEmp.size()>2)?numOfEmp.get(2).getAdministrationOffice():"",
			(numOfEmp!=null)&&(numOfEmp.size()>2)?numOfEmp.get(2).getProductionProcessing():"",		
			(numOfEmp!=null)&&(numOfEmp.size()>2)?numOfEmp.get(2).getMaintenanceService():"",		
			(numOfEmp!=null)&&(numOfEmp.size()>2)?numOfEmp.get(2).getLogistics():"",	
				(numOfEmp!=null)&&(numOfEmp.size()>2)?numOfEmp.get(2).getTotal():"",		
				(numOfEmp!=null)&&(numOfEmp.size()>2)?numOfEmp.get(2).getSeasonal():"",		
				(numOfEmp!=null)&&(numOfEmp.size()>2)?numOfEmp.get(2).getTemporary():"",		
				(numOfEmp!=null)&&(numOfEmp.size()>2)?numOfEmp.get(2).getSubcontracted():"",		
					
			
			(numOfEmp!=null)&&(numOfEmp.size()>3)?numOfEmp.get(3).getHeadOffice():"",
			(numOfEmp!=null)&&(numOfEmp.size()>3)?numOfEmp.get(3).getAdministrationOffice():"",
			(numOfEmp!=null)&&(numOfEmp.size()>3)?numOfEmp.get(3).getProductionProcessing():"",		
			(numOfEmp!=null)&&(numOfEmp.size()>3)?numOfEmp.get(3).getMaintenanceService():"",		
			(numOfEmp!=null)&&(numOfEmp.size()>3)?numOfEmp.get(3).getLogistics():"",
				(numOfEmp!=null)&&(numOfEmp.size()>3)?numOfEmp.get(3).getTotal():"",		
				(numOfEmp!=null)&&(numOfEmp.size()>3)?numOfEmp.get(3).getSeasonal():"",		
				(numOfEmp!=null)&&(numOfEmp.size()>3)?numOfEmp.get(3).getTemporary():"",		
				(numOfEmp!=null)&&(numOfEmp.size()>3)?numOfEmp.get(3).getSubcontracted():"",		
							
			
			(numOfEmp!=null)&&(numOfEmp.size()>4)?numOfEmp.get(4).getHeadOffice():"",
			(numOfEmp!=null)&&(numOfEmp.size()>4)?numOfEmp.get(4).getAdministrationOffice():"",
			(numOfEmp!=null)&&(numOfEmp.size()>4)?numOfEmp.get(4).getProductionProcessing():"",		
			(numOfEmp!=null)&&(numOfEmp.size()>4)?numOfEmp.get(4).getMaintenanceService():"",		
			(numOfEmp!=null)&&(numOfEmp.size()>4)?numOfEmp.get(4).getLogistics():"",	
				(numOfEmp!=null)&&(numOfEmp.size()>4)?numOfEmp.get(4).getTotal():"",		
				(numOfEmp!=null)&&(numOfEmp.size()>4)?numOfEmp.get(4).getSeasonal():"",		
				(numOfEmp!=null)&&(numOfEmp.size()>4)?numOfEmp.get(4).getTemporary():"",		
				(numOfEmp!=null)&&(numOfEmp.size()>4)?numOfEmp.get(4).getSubcontracted():"",	
			
			(workPattern!=null)&&(workPattern.size()>0)?workPattern.get(0).getAddDetails():"",		
			(workPattern!=null)&&(workPattern.size()>1)?workPattern.get(1).getAddDetails():"",		
			(workPattern!=null)&&(workPattern.size()>2)?workPattern.get(2).getAddDetails():"",		
			(workPattern!=null)&&(workPattern.size()>3)?workPattern.get(3).getAddDetails():"",		
			(workPattern!=null)&&(workPattern.size()>4)?workPattern.get(4).getAddDetails():"",	
		
			Validator.isNotNull(premisesLocation)&&Validator.isNotNull(premisesLocation.getProductionFacilitySize())?premisesLocation.getProductionFacilitySize():"",
			Validator.isNotNull(premisesLocation)&&Validator.isNotNull(premisesLocation.getWarehouseFacilitySize())?premisesLocation.getWarehouseFacilitySize():"",
			Validator.isNotNull(premisesLocation)&&Validator.isNotNull(premisesLocation.getFacilitiesLocation())?premisesLocation.getFacilitiesLocation():"",
			Validator.isNotNull(premisesLocation)&&Validator.isNotNull(premisesLocation.getDetailForDiffManagement())?premisesLocation.getDetailForDiffManagement():"",
					
			Validator.isNotNull(processDetails) && Validator.isNotNull(processDetails.getIncomingMaterials()) ? processDetails.getIncomingMaterials() : "",
			Validator.isNotNull(processDetails) && Validator.isNotNull(processDetails.getProductStorage()) ? processDetails.getProductStorage() : "",
			Validator.isNotNull(processDetails) && Validator.isNotNull(processDetails.getBuildingSiteAspects()) ? processDetails.getBuildingSiteAspects() : "",
			Validator.isNotNull(processDetails) && Validator.isNotNull(processDetails.getWasteDischarges()) ? processDetails.getWasteDischarges() : "",
			Validator.isNotNull(processDetails) && Validator.isNotNull(processDetails.getTransportDetails()) ? processDetails.getTransportDetails() : "",
			Validator.isNotNull(processDetails) && Validator.isNotNull(processDetails.getSubcontractedActivities()) ? processDetails.getSubcontractedActivities() : "",
			Validator.isNotNull(sectionThree) && Validator.isNotNull(sectionThree.getProcessActivityDescription()) ? sectionThree.getProcessActivityDescription() : "",
					
			Validator.isNotNull(sectionThree) && Validator.isNotNull(sectionThree.getProcessActivitiesList()) ? sectionThree.getProcessActivitiesList() : "",
							
			Validator.isNotNull(sectionThree) && Validator.isNotNull(sectionThree.getIncomingMaterialsDes()) ? sectionThree.getIncomingMaterialsDes() : "",
			Validator.isNotNull(sectionThree) && Validator.isNotNull(sectionThree.getProcessDescription()) ? sectionThree.getProcessDescription() : "",
					//checkbox fields to be fetched
			(specificActivities!=null)&&(specificActivities.size()>1)?specificActivities.get(1).getSpecificActivityNumber():"",
			(specificActivities!=null)&&(specificActivities.size()>1)?specificActivities.get(1).getSpecificActivityChecked():"",
			
			(specificActivities!=null)&&(specificActivities.size()>2)?specificActivities.get(2).getSpecificActivityNumber():"",
			(specificActivities!=null)&&(specificActivities.size()>2)?specificActivities.get(2).getSpecificActivityChecked():"",
			
			(specificActivities!=null)&&(specificActivities.size()>3)?specificActivities.get(3).getSpecificActivityNumber():"",
			(specificActivities!=null)&&(specificActivities.size()>3)?specificActivities.get(3).getSpecificActivityChecked():"",
			
			(specificActivities!=null)&&(specificActivities.size()>4)?specificActivities.get(4).getSpecificActivityNumber():"",
			(specificActivities!=null)&&(specificActivities.size()>4)?specificActivities.get(4).getSpecificActivityChecked():"",
			
			(specificActivities!=null)&&(specificActivities.size()>5)?specificActivities.get(5).getSpecificActivityNumber():"",
			(specificActivities!=null)&&(specificActivities.size()>5)?specificActivities.get(5).getSpecificActivityChecked():"",
			
			(specificActivities!=null)&&(specificActivities.size()>6)?specificActivities.get(6).getSpecificActivityNumber():"",
			(specificActivities!=null)&&(specificActivities.size()>6)?specificActivities.get(6).getSpecificActivityChecked():"",
			
			(specificActivities!=null)&&(specificActivities.size()>7)?specificActivities.get(7).getSpecificActivityNumber():"",
			(specificActivities!=null)&&(specificActivities.size()>7)?specificActivities.get(7).getSpecificActivityChecked():"",
			
			(specificActivities!=null)&&(specificActivities.size()>8)?specificActivities.get(8).getSpecificActivityNumber():"",
			(specificActivities!=null)&&(specificActivities.size()>8)?specificActivities.get(8).getSpecificActivityChecked():"",
			
			(specificActivities!=null)&&(specificActivities.size()>9)?specificActivities.get(9).getSpecificActivityNumber():"",
			(specificActivities!=null)&&(specificActivities.size()>9)?specificActivities.get(9).getSpecificActivityChecked():"",
					
			(specificActivities!=null)&&(specificActivities.size()>10)?specificActivities.get(10).getSpecificActivityNumber():"",
			(specificActivities!=null)&&(specificActivities.size()>10)?specificActivities.get(10).getSpecificActivityChecked():"",

			Validator.isNotNull(sectionThree) && Validator.isNotNull(sectionThree.getExplainationBox()) ? sectionThree.getExplainationBox() : "",
			(workPattern!=null)&&(workPattern.size()>0)?workPattern.get(0).getAddNumHaccp():"",		
			(workPattern!=null)&&(workPattern.size()>1)?workPattern.get(1).getAddNumHaccp():"",		
			(workPattern!=null)&&(workPattern.size()>2)?workPattern.get(2).getAddNumHaccp():"",		
			(workPattern!=null)&&(workPattern.size()>3)?workPattern.get(3).getAddNumHaccp():"",		
			(workPattern!=null)&&(workPattern.size()>4)?workPattern.get(4).getAddNumHaccp():"",	
			(workPattern!=null)&&(workPattern.size()>0)?workPattern.get(0).getAddHazard():"",		
			(workPattern!=null)&&(workPattern.size()>1)?workPattern.get(1).getAddHazard():"",		
			(workPattern!=null)&&(workPattern.size()>2)?workPattern.get(2).getAddHazard():"",		
			(workPattern!=null)&&(workPattern.size()>3)?workPattern.get(3).getAddHazard():"",		
			(workPattern!=null)&&(workPattern.size()>4)?workPattern.get(4).getAddHazard():"",	
			(workPattern!=null)&&(workPattern.size()>0)?workPattern.get(0).getAddConsentLic():"",		
			(workPattern!=null)&&(workPattern.size()>1)?workPattern.get(1).getAddConsentLic():"",		
			(workPattern!=null)&&(workPattern.size()>2)?workPattern.get(2).getAddConsentLic():"",		
			(workPattern!=null)&&(workPattern.size()>3)?workPattern.get(3).getAddConsentLic():"",		
			(workPattern!=null)&&(workPattern.size()>4)?workPattern.get(4).getAddConsentLic():"",	
					//Manufacturing 
			Validator.isNotNull(sectionThree) && Validator.isNotNull(sectionThree.getCategoryOne()) ? sectionThree.getCategoryOne() : "",
			Validator.isNotNull(consultService) && Validator.isNotNull(consultService.getConsultService()) ? consultService.getConsultService() : "",
			Validator.isNotNull(consultService) && Validator.isNotNull(consultService.getConsultTelephone()) ? consultService.getConsultTelephone() : "",
			Validator.isNotNull(consultService) && Validator.isNotNull(consultService.getConsultEmail()) ? consultService.getConsultEmail() : "",
					
			Validator.isNotNull(consultService) && Validator.isNotNull(consultService.getConsultStageOne()) ? dateFormat.format(consultService.getConsultStageOne()) : "",
			Validator.isNotNull(consultService) && Validator.isNotNull(consultService.getConsultStageTwo()) ? dateFormat.format(consultService.getConsultStageTwo()): "",
			Validator.isNotNull(consultService) && Validator.isNotNull(consultService.getConsultSurveillanceAudit()) ? dateFormat.format(consultService.getConsultSurveillanceAudit()) : "",
			Validator.isNotNull(consultService) && Validator.isNotNull(consultService.getConsultRecertificationAudit()) ? dateFormat.format(consultService.getConsultRecertificationAudit()) : "",
			Validator.isNotNull(consultService) && Validator.isNotNull(consultService.getConsultPreassessmentAudit()) ? dateFormat.format(consultService.getConsultPreassessmentAudit()) : "",
			Validator.isNotNull(consultService) && Validator.isNotNull(consultService.getConsultOtherService()) ? dateFormat.format(consultService.getConsultOtherService()) : "",
			Validator.isNotNull(consultService) && Validator.isNotNull(consultService.getConsultName()) ? consultService.getConsultName() : "",
			Validator.isNotNull(consultService) && Validator.isNotNull(consultService.getConsultPosition()) ? consultService.getConsultPosition() : "",
					//signature
				signatureForFormSingle,
			Validator.isNotNull(consultService) && Validator.isNotNull(consultService.getConsultDate()) ? dateFormat.format(consultService.getConsultDate()) : "",
					
					//quotation two
			Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getNameOfOrganization()) ? quotationFormTwo.getNameOfOrganization() : "",
			Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getAddress()) ? quotationFormTwo.getAddress() : "",
			Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getTelephoneNumber()) ? quotationFormTwo.getTelephoneNumber() : "",
			Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getFaxNumber()) ? quotationFormTwo.getFaxNumber() : "",
			Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getEmailAddress()) ? quotationFormTwo.getEmailAddress() : "",
			Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getHeadOfOrganization()) ? quotationFormTwo.getHeadOfOrganization() : "",
			Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getContactPersonName()) ? quotationFormTwo.getContactPersonName() : "",
			Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getPositionSecondFo()) ? quotationFormTwo.getPositionSecondFo() : "",
			Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getManagementSystemFo()) ? quotationFormTwo.getManagementSystemFo() : "",
			Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getDeterminedTheScope()) ? quotationFormTwo.getDeterminedTheScope() : "",
			Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getProductTypes()) ? quotationFormTwo.getProductTypes() : "",
			Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getProductLine()) ? quotationFormTwo.getProductLine() : "",
			Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getHaccpStudies()) ? quotationFormTwo.getHaccpStudies() : "",
			Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getCriticalControlPoints()) ? quotationFormTwo.getCriticalControlPoints() : "",
			Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getOperationalNumber()) ? quotationFormTwo.getOperationalNumber() : "",
			Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getProductionSize()) ? quotationFormTwo.getProductionSize() : "",
			Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getWarehouseSize()) ? quotationFormTwo.getWarehouseSize() : "",
			Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getWarehouseDetailSize()) ? quotationFormTwo.getWarehouseDetailSize() : "",
			Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getSeasonalProcess()) ? quotationFormTwo.getSeasonalProcess() : ""

			});
				    }catch (Exception e) {
						// TODO: handle exception
					}
			
		/*if (!checkPdfDownloadWithoutDocument.equals("false")) {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
			String statementOfAffairs = "";
			String resolutionOfTheCorporation = "";
			String cojForm = "";
			
			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
				} catch (Exception e) {}
				if(title.equals("Statement of Affairs (Form 3)")) {
					statementOfAffairs = fileName;
				}else if (title.equals("Resolution of the corporation authorizing the assignment")) {
					resolutionOfTheCorporation = fileName;
				}else if (title.equals("COJ’s Form 5 Notification Filing Receipt")) {
					cojForm = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
					"[$StatementAffairs$]","[$ResolutionCorporation$]","[$FilingReceipt$]"
				},
				new String[] {
						statementOfAffairs,	resolutionOfTheCorporation,cojForm
					});
			}
		}*/
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
