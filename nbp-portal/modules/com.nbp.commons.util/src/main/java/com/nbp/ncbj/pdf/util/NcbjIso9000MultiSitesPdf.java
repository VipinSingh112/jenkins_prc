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
import com.nbp.ncbj.application.form.service.model.NcbjAddLocMultiSite;
import com.nbp.ncbj.application.form.service.model.NcbjApplicantDetail;
import com.nbp.ncbj.application.form.service.model.NcbjApplication;
import com.nbp.ncbj.application.form.service.model.NcbjBusinessDetail;
import com.nbp.ncbj.application.form.service.model.NcbjBusinessDetailAdd;
import com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfo;
import com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail;
import com.nbp.ncbj.application.form.service.service.NcbjAddLocMultiSiteLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjApplicantDetailLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjApplicationLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjBusinessDetailAddLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjBusinessDetailLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjOrgDetailInfoLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjOrganizationDetailLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class NcbjIso9000MultiSitesPdf {
	public static String replaceSignatureForFrom(long ncbjApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Applicant");
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
	
	public static String getNcbjIso9000MultiSitesPdf(long ncbjApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		NcbjApplication ncbjApplication=null;
		List<NcbjBusinessDetailAdd> businessDetail=null;
		NcbjApplicantDetail preferredDate=null;
		NcbjOrgDetailInfo orgDetailInfo=null;
		NcbjAddLocMultiSite ncbjAdditionalLocation=null;
		NcbjOrganizationDetail ncbjOrganizationDetail=null;
		List<NcbjBusinessDetail> quotationBusinDetail=null;
		
		
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		//Signatures
		String signatureForForm = null;
		String signatureForAssignment = null;
		
		try {
			ncbjApplication= NcbjApplicationLocalServiceUtil.getNcbjApplication(ncbjApplicationId);
		}catch (Exception e) {
		}
		try {
			businessDetail= NcbjBusinessDetailAddLocalServiceUtil.getNCBJById(ncbjApplicationId);
		}catch (Exception e) {
		}
		try {
			preferredDate=NcbjApplicantDetailLocalServiceUtil.getNCBJById(ncbjApplicationId);
		} catch (Exception e) {
		}
		try {
			orgDetailInfo= NcbjOrgDetailInfoLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			ncbjAdditionalLocation= NcbjAddLocMultiSiteLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			ncbjOrganizationDetail= NcbjOrganizationDetailLocalServiceUtil.getNCBJ_ByAppId(ncbjApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			quotationBusinDetail= NcbjBusinessDetailLocalServiceUtil.getByNcbjBusiDetail(ncbjApplicationId);
		}catch (Exception e) {
		}
				
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
			signatureForForm =replaceSignatureForFrom(
					ncbjAdditionalLocation.getNcbjApplicationId(), "Signature of Applicant",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"iso-9001-2015-certification-multi-2");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"iso-9001-2015-certification-multi");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, 
			new String[] {
			//Applicant details
					//40
			"[$BussinessPr1$]", "[$NumberTime1$]", "[$TypeSer1$]", "[$HeadOf1$]", "[$NumberFullTime1$]","[$ParTime1$]", "[$NumberCont1$]", "[$ContrWork1$]", 
			"[$BussinessPr2$]", "[$NumberTime2$]", "[$TypeSer2$]", "[$HeadOf2$]", "[$NumberFullTime2$]","[$ParTime2$]", "[$NumberCont2$]", "[$ContrWork2$]",
			"[$BussinessPr3$]", "[$NumberTime3$]", "[$TypeSer3$]", "[$HeadOf3$]", "[$NumberFullTime3$]","[$ParTime3$]", "[$NumberCont3$]", "[$ContrWork3$]",
			"[$BussinessPr4$]", "[$NumberTime4$]", "[$TypeSer4$]", "[$HeadOf4$]", "[$NumberFullTime4$]","[$ParTime4$]", "[$NumberCont4$]", "[$ContrWork4$]",
			"[$BussinessPr5$]", "[$NumberTime5$]", "[$TypeSer5$]", "[$HeadOf5$]", "[$NumberFullTime5$]","[$ParTime5$]", "[$NumberCont5$]", "[$ContrWork5$]",

			//6
			"[$StaG1$]", "[$StaGe2$]","[$SurVe$]", "[$Recerti$]","[$PreAudit$]", "[$AnyOther$]",
			//5
			"[$CompanyN$]", "[$MailAdd$]","[$CityB$]", "[$CodeP$]","[$Count$]","[$PhysicalAddress$]",
			//12
			"[$CityA$]", "[$PostalC$]","[$CounT$]","[$HeadComp$]", "[$TiTle$]","[$ContactComp$]", "[$TitLe$]",
			"[$TeleNumb$]", "[$FaxNum$]","[$EmailAdd$]", "[$WebSite$]","[$ScopeOfCerti$]",
			//11
			"[$CaluseOf$]","[$PleaseDet$]","[$YorAffect$]","[$RelevantReq$]","[$PleaseRequired$]","[$AreSystem$]","[$AreSystemDetail$]",
			"[$InterCore$]","[$CertiDes$]", "[$ReasonTransfer$]","[$SurveillDes$]",
			//9-manage
			"[$ManageSystem$]", "[$IndiStandard$]","[$ByBody$]", "[$NameCerti$]","[$UseService$]","[$ConsultFrim$]",  "[$TeLe$]", "[$EmaIl$]",
			//11
			"[$contractual$]", "[$management$]","[$substantially$]","[$procedure$]","[$internal$]", "[$corrective$]","[$organizational$]",
			"[$NaMe$]", "[$Pos$]","[$SigNaturePi$]","[$DaTeSS$]",
			//12
			"[$OrganiZ$]", "[$Add$]","[$TeNum$]", "[$FNumber$]","[$EAdd$]", "[$HeadOrg$]","[$Pos2$]", "[$ContactName$]",
			"[$ContactEmail$]", "[$Posit$]","[$ProcessIn$]","[$HaveScope$]",
			
			"[$corporateGa$]",
			//45
			"[$PhysicalLoc1$]", "[$ProductsSer1$]", "[$ShiftsBusi1$]", "[$EmployeeNum1$]","[$HeadOff1$]", "[$NumTimeEm1$]", "[$PartTimeEmp1$]", "[$contractorsNum1$]", "[$workersNum1$]",
			"[$PhysicalLoc2$]", "[$ProductsSer2$]", "[$ShiftsBusi2$]", "[$EmployeeNum2$]","[$HeadOff2$]", "[$NumTimeEm2$]", "[$PartTimeEmp2$]", "[$contractorsNum2$]", "[$workersNum2$]",
			"[$PhysicalLoc3$]", "[$ProductsSer3$]", "[$ShiftsBusi3$]", "[$EmployeeNum3$]","[$HeadOff3$]", "[$NumTimeEm3$]", "[$PartTimeEmp3$]", "[$contractorsNum3$]", "[$workersNum3$]",
			"[$PhysicalLoc4$]", "[$ProductsSer4$]", "[$ShiftsBusi4$]", "[$EmployeeNum4$]","[$HeadOff4$]", "[$NumTimeEm4$]", "[$PartTimeEmp4$]", "[$contractorsNum4$]", "[$workersNum4$]",
			"[$PhysicalLoc5$]", "[$ProductsSer5$]", "[$ShiftsBusi5$]", "[$EmployeeNum5$]","[$HeadOff5$]", "[$NumTimeEm5$]", "[$PartTimeEmp5$]", "[$contractorsNum5$]", "[$workersNum5$]",
			
	
			},
			new String[] {
    		//Applicant details
					//40
			(businessDetail!=null)&&(businessDetail.size()>0)?businessDetail.get(0).getBusinessAddress():"",
			(businessDetail!=null)&&(businessDetail.size()>0)?businessDetail.get(0).getNumberAndTimeOfShift():"",
			(businessDetail!=null)&&(businessDetail.size()>0)?businessDetail.get(0).getTypeOfProduct():"",
			(businessDetail!=null)&&(businessDetail.size()>0)?businessDetail.get(0).getHeadOffices():"",
			(businessDetail!=null)&&(businessDetail.size()>0)?businessDetail.get(0).getNoOfFullTimeEmployees():"",
			(businessDetail!=null)&&(businessDetail.size()>0)?businessDetail.get(0).getNoOfPartTimeEmployees():"",
			(businessDetail!=null)&&(businessDetail.size()>0)?businessDetail.get(0).getNoOfContractors():"",
			(businessDetail!=null)&&(businessDetail.size()>0)?businessDetail.get(0).getNoOfContractedWorkers():"",
					
			(businessDetail!=null)&&(businessDetail.size()>1)?businessDetail.get(1).getBusinessAddress():"",
			(businessDetail!=null)&&(businessDetail.size()>1)?businessDetail.get(1).getNumberAndTimeOfShift():"",
			(businessDetail!=null)&&(businessDetail.size()>1)?businessDetail.get(1).getTypeOfProduct():"",
			(businessDetail!=null)&&(businessDetail.size()>1)?businessDetail.get(1).getHeadOffices():"",
			(businessDetail!=null)&&(businessDetail.size()>1)?businessDetail.get(1).getNoOfFullTimeEmployees():"",
			(businessDetail!=null)&&(businessDetail.size()>1)?businessDetail.get(1).getNoOfPartTimeEmployees():"",
			(businessDetail!=null)&&(businessDetail.size()>1)?businessDetail.get(1).getNoOfContractors():"",
			(businessDetail!=null)&&(businessDetail.size()>1)?businessDetail.get(1).getNoOfContractedWorkers():"",
			
			(businessDetail!=null)&&(businessDetail.size()>2)?businessDetail.get(2).getBusinessAddress():"",
			(businessDetail!=null)&&(businessDetail.size()>2)?businessDetail.get(2).getNumberAndTimeOfShift():"",
			(businessDetail!=null)&&(businessDetail.size()>2)?businessDetail.get(2).getTypeOfProduct():"",
			(businessDetail!=null)&&(businessDetail.size()>2)?businessDetail.get(2).getHeadOffices():"",
			(businessDetail!=null)&&(businessDetail.size()>2)?businessDetail.get(2).getNoOfFullTimeEmployees():"",
			(businessDetail!=null)&&(businessDetail.size()>2)?businessDetail.get(2).getNoOfPartTimeEmployees():"",
			(businessDetail!=null)&&(businessDetail.size()>2)?businessDetail.get(2).getNoOfContractors():"",
			(businessDetail!=null)&&(businessDetail.size()>2)?businessDetail.get(2).getNoOfContractedWorkers():"",
			
			(businessDetail!=null)&&(businessDetail.size()>3)?businessDetail.get(3).getBusinessAddress():"",
			(businessDetail!=null)&&(businessDetail.size()>3)?businessDetail.get(3).getNumberAndTimeOfShift():"",
			(businessDetail!=null)&&(businessDetail.size()>3)?businessDetail.get(3).getTypeOfProduct():"",
			(businessDetail!=null)&&(businessDetail.size()>3)?businessDetail.get(3).getHeadOffices():"",
			(businessDetail!=null)&&(businessDetail.size()>3)?businessDetail.get(3).getNoOfFullTimeEmployees():"",
			(businessDetail!=null)&&(businessDetail.size()>3)?businessDetail.get(3).getNoOfPartTimeEmployees():"",
			(businessDetail!=null)&&(businessDetail.size()>3)?businessDetail.get(3).getNoOfContractors():"",
			(businessDetail!=null)&&(businessDetail.size()>3)?businessDetail.get(3).getNoOfContractedWorkers():"",
			
			(businessDetail!=null)&&(businessDetail.size()>4)?businessDetail.get(4).getBusinessAddress():"",
			(businessDetail!=null)&&(businessDetail.size()>4)?businessDetail.get(4).getNumberAndTimeOfShift():"",
			(businessDetail!=null)&&(businessDetail.size()>4)?businessDetail.get(4).getTypeOfProduct():"",
			(businessDetail!=null)&&(businessDetail.size()>4)?businessDetail.get(4).getHeadOffices():"",
			(businessDetail!=null)&&(businessDetail.size()>4)?businessDetail.get(4).getNoOfFullTimeEmployees():"",
			(businessDetail!=null)&&(businessDetail.size()>4)?businessDetail.get(4).getNoOfPartTimeEmployees():"",
			(businessDetail!=null)&&(businessDetail.size()>4)?businessDetail.get(4).getNoOfContractors():"",
			(businessDetail!=null)&&(businessDetail.size()>4)?businessDetail.get(4).getNoOfContractedWorkers():"",
			//6
    		Validator.isNotNull(preferredDate)&&Validator.isNotNull(preferredDate.getStageOne())?dateFormat.format(preferredDate.getStageOne()):"",
			Validator.isNotNull(preferredDate)&&Validator.isNotNull(preferredDate.getStageTwo())?dateFormat.format(preferredDate.getStageTwo()):"",
			Validator.isNotNull(preferredDate)&&Validator.isNotNull(preferredDate.getSurveillanceAudit())?dateFormat.format(preferredDate.getSurveillanceAudit()):"",
			Validator.isNotNull(preferredDate)&&Validator.isNotNull(preferredDate.getRecertificationAudit())?dateFormat.format(preferredDate.getRecertificationAudit()):"",
			Validator.isNotNull(preferredDate)&&Validator.isNotNull(preferredDate.getPreAassessmentAudit())?dateFormat.format(preferredDate.getPreAassessmentAudit()):"",
			Validator.isNotNull(preferredDate)&&Validator.isNotNull(preferredDate.getAnyOtherService())?dateFormat.format(preferredDate.getAnyOtherService()):"",
					
			//5
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getNewCompanyName()) ? orgDetailInfo.getNewCompanyName() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getMailingAddress()) ? orgDetailInfo.getMailingAddress() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCity()) ? orgDetailInfo.getCity() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getPostalCode()) ? orgDetailInfo.getPostalCode() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCountry()) ? orgDetailInfo.getCountry() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getPhysicalAddress()) ? orgDetailInfo.getPhysicalAddress() : "",
					//12
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getPhysicalCity()) ? orgDetailInfo.getPhysicalCity() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getPhysicalPostalCode()) ? orgDetailInfo.getPhysicalPostalCode() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getPhysicalCountry()) ? orgDetailInfo.getPhysicalCountry() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCompanyHead()) ? orgDetailInfo.getCompanyHead() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCompanyTitle()) ? orgDetailInfo.getCompanyTitle() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCompanyContact()) ? orgDetailInfo.getCompanyContact() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCompanyContactTitle()) ? orgDetailInfo.getCompanyContactTitle() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCompanyTelephone()) ? orgDetailInfo.getCompanyTelephone() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCompanyFax()) ? orgDetailInfo.getCompanyFax() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCompanyEmail()) ? orgDetailInfo.getCompanyEmail() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCompanyWebsite()) ? orgDetailInfo.getCompanyWebsite() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCertificationScope()) ? orgDetailInfo.getCertificationScope() : "",
					//11
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCertificationScopeRadio()) ? orgDetailInfo.getCertificationScopeRadio() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getManageAccessToAuditDet()) ? orgDetailInfo.getManageAccessToAuditDet() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getOutsourceProcess()) ? orgDetailInfo.getOutsourceProcess() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getRelevantRequirement()) ? orgDetailInfo.getRelevantRequirement() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getRelevantRequirementList()) ? orgDetailInfo.getRelevantRequirementList() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getManagementAccessToAudit()) ? orgDetailInfo.getManagementAccessToAudit() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getPleaseManageDetail()) ? orgDetailInfo.getPleaseManageDetail() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getKeyActivity()) ? orgDetailInfo.getKeyActivity() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getDesiredCertification()) ? orgDetailInfo.getDesiredCertification() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getTransferReason()) ? orgDetailInfo.getTransferReason() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getSurveillanceSchedule()) ? orgDetailInfo.getSurveillanceSchedule() : "",
			//manage-9
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCertifiedManagement()) ? orgDetailInfo.getCertifiedManagement() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getIndicateStandard()) ? orgDetailInfo.getIndicateStandard() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCertifiedAccreditedCerti()) ? orgDetailInfo.getCertifiedAccreditedCerti() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCeritificationBodyName()) ? orgDetailInfo.getCeritificationBodyName() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCompanyUsedConsulting()) ? orgDetailInfo.getCompanyUsedConsulting() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getConsultingFirm()) ? orgDetailInfo.getConsultingFirm() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getConsultant()) ? orgDetailInfo.getConsultant() : "",
			Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getTelephone()) ? orgDetailInfo.getTelephone() : "",
										
			//Form of Assignment
					//11
					
			Validator.isNotNull(ncbjAdditionalLocation)&&Validator.isNotNull(ncbjAdditionalLocation.getCentralOfficeLink())?ncbjAdditionalLocation.getCentralOfficeLink():"",
			Validator.isNotNull(ncbjAdditionalLocation)&&Validator.isNotNull(ncbjAdditionalLocation.getCommonManagementSystem())?ncbjAdditionalLocation.getCommonManagementSystem():"",	
			Validator.isNotNull(ncbjAdditionalLocation)&&Validator.isNotNull(ncbjAdditionalLocation.getSubstantiallySameProcess())?ncbjAdditionalLocation.getSubstantiallySameProcess():"",
			Validator.isNotNull(ncbjAdditionalLocation)&&Validator.isNotNull(ncbjAdditionalLocation.getSiteSimilarMethod())?ncbjAdditionalLocation.getSiteSimilarMethod():"",
			Validator.isNotNull(ncbjAdditionalLocation)&&Validator.isNotNull(ncbjAdditionalLocation.getSiteUnderAudit())?ncbjAdditionalLocation.getSiteUnderAudit():"",
			Validator.isNotNull(ncbjAdditionalLocation)&&Validator.isNotNull(ncbjAdditionalLocation.getSiteCorrectiveRight())?ncbjAdditionalLocation.getSiteCorrectiveRight():"",
			Validator.isNotNull(ncbjAdditionalLocation)&&Validator.isNotNull(ncbjAdditionalLocation.getChangesAuthority())?ncbjAdditionalLocation.getChangesAuthority():"",
			Validator.isNotNull(ncbjAdditionalLocation)&&Validator.isNotNull(ncbjAdditionalLocation.getSignatureName())?ncbjAdditionalLocation.getSignatureName():"",
			Validator.isNotNull(ncbjAdditionalLocation)&&Validator.isNotNull(ncbjAdditionalLocation.getPosition())?ncbjAdditionalLocation.getPosition():"",
					signatureForForm,
			Validator.isNotNull(ncbjAdditionalLocation)&&Validator.isNotNull(ncbjAdditionalLocation.getDate())?dateFormat.format(ncbjAdditionalLocation.getDate()):"",
					
			//Application for Assignment
					//12
			Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getNameOfOrganization())?ncbjOrganizationDetail.getNameOfOrganization():"",
			Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getAddress())?ncbjOrganizationDetail.getAddress():"",
			Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getTelephoneNumber())?ncbjOrganizationDetail.getTelephoneNumber():"",
			Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getFaxNumber())?ncbjOrganizationDetail.getFaxNumber():"",
			Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getEmailAddress())?ncbjOrganizationDetail.getEmailAddress():"",
			Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getHeadOfOrganization())?ncbjOrganizationDetail.getHeadOfOrganization():"",
			Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getPosition())?ncbjOrganizationDetail.getPosition():"",
			Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getContactPersonName())?ncbjOrganizationDetail.getContactPersonName():"",
			Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getContactPersonEmailAddress())?ncbjOrganizationDetail.getContactPersonEmailAddress():"",
			Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getContactPersonPosition())?ncbjOrganizationDetail.getContactPersonPosition():"",
			Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getManagementSystem())?ncbjOrganizationDetail.getManagementSystem():"",
			Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getDeterminedTheScope())?ncbjOrganizationDetail.getDeterminedTheScope():"",
			Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getPleaseStageTheScope())?ncbjOrganizationDetail.getPleaseStageTheScope():"",
			
			//45
					
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>0)?quotationBusinDetail.get(0).getQuotationAddressOne():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>0)?quotationBusinDetail.get(0).getQuotationProductTypes():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>0)?quotationBusinDetail.get(0).getQuotationApplicantShifts():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>0)?quotationBusinDetail.get(0).getQuotationEmpNum():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>0)?quotationBusinDetail.get(0).getQuotationHeadOffices():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>0)?quotationBusinDetail.get(0).getQuotationFullTimeEmploy():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>0)?quotationBusinDetail.get(0).getQuotationPartTimeEmploy():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>0)?quotationBusinDetail.get(0).getQuotationContractors():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>0)?quotationBusinDetail.get(0).getQuotationContractedWorker():"",

			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>1)?quotationBusinDetail.get(1).getQuotationAddressOne():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>1)?quotationBusinDetail.get(1).getQuotationProductTypes():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>1)?quotationBusinDetail.get(1).getQuotationApplicantShifts():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>1)?quotationBusinDetail.get(1).getQuotationEmpNum():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>1)?quotationBusinDetail.get(1).getQuotationHeadOffices():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>1)?quotationBusinDetail.get(1).getQuotationFullTimeEmploy():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>1)?quotationBusinDetail.get(1).getQuotationPartTimeEmploy():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>1)?quotationBusinDetail.get(1).getQuotationContractors():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>1)?quotationBusinDetail.get(1).getQuotationContractedWorker():"",
											
			
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>2)?quotationBusinDetail.get(2).getQuotationAddressOne():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>2)?quotationBusinDetail.get(2).getQuotationProductTypes():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>2)?quotationBusinDetail.get(2).getQuotationApplicantShifts():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>2)?quotationBusinDetail.get(2).getQuotationEmpNum():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>2)?quotationBusinDetail.get(2).getQuotationHeadOffices():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>2)?quotationBusinDetail.get(2).getQuotationFullTimeEmploy():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>2)?quotationBusinDetail.get(2).getQuotationPartTimeEmploy():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>2)?quotationBusinDetail.get(2).getQuotationContractors():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>2)?quotationBusinDetail.get(2).getQuotationContractedWorker():"",
							
			
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>3)?quotationBusinDetail.get(3).getQuotationAddressOne():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>3)?quotationBusinDetail.get(3).getQuotationProductTypes():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>3)?quotationBusinDetail.get(3).getQuotationApplicantShifts():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>3)?quotationBusinDetail.get(3).getQuotationEmpNum():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>3)?quotationBusinDetail.get(3).getQuotationHeadOffices():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>3)?quotationBusinDetail.get(3).getQuotationFullTimeEmploy():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>3)?quotationBusinDetail.get(3).getQuotationPartTimeEmploy():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>3)?quotationBusinDetail.get(3).getQuotationContractors():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>3)?quotationBusinDetail.get(3).getQuotationContractedWorker():"",
			
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>4)?quotationBusinDetail.get(4).getQuotationAddressOne():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>4)?quotationBusinDetail.get(4).getQuotationProductTypes():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>4)?quotationBusinDetail.get(4).getQuotationApplicantShifts():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>4)?quotationBusinDetail.get(4).getQuotationEmpNum():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>4)?quotationBusinDetail.get(4).getQuotationHeadOffices():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>4)?quotationBusinDetail.get(4).getQuotationFullTimeEmploy():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>4)?quotationBusinDetail.get(4).getQuotationPartTimeEmploy():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>4)?quotationBusinDetail.get(4).getQuotationContractors():"",
			(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>4)?quotationBusinDetail.get(4).getQuotationContractedWorker():"",
																					
					
					
					
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
