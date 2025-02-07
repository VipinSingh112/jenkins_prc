package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppService;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
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
import com.nbp.sez.status.application.form.service.model.SezOccLocationAdd;
import com.nbp.sez.status.application.form.service.model.SezOccupantDirectorPartnerSponsorInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupantEmploymentInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupantExistingProposedProjectBriefInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupantGeneralBussinessAddress;
import com.nbp.sez.status.application.form.service.model.SezOccupantGeneralBussinessInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupantInvestAndFinanceInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupantPrincipleDirector;
import com.nbp.sez.status.application.form.service.model.SezOccupantPrincipleOfficer;
import com.nbp.sez.status.application.form.service.model.SezOccupantProposedAreaDevelopmentPlanInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupantShareHoldingInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupantUserUndertakingInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupanteDeveloperUndertakingInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupanteSubmissionChecklistInfo;
import com.nbp.sez.status.application.form.service.model.SezStatusAppPayment;
import com.nbp.sez.status.application.form.service.model.SezStatusApplication;
import com.nbp.sez.status.application.form.service.model.SezStatusApplicationCurrentStage;
import com.nbp.sez.status.application.form.service.model.SezStatusWFMLocationAdd;
import com.nbp.sez.status.application.form.service.model.SezStatusWorkFromHome;
import com.nbp.sez.status.application.form.service.model.SezZoneDevUnderInfo;
import com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo;
import com.nbp.sez.status.application.form.service.model.SezZoneFinancialInfo;
import com.nbp.sez.status.application.form.service.model.SezZoneGeneralBusinessInfo;
import com.nbp.sez.status.application.form.service.model.SezZoneGeneralBussinessAddress;
import com.nbp.sez.status.application.form.service.model.SezZoneLocationAdd;
import com.nbp.sez.status.application.form.service.model.SezZoneProposedProjectInfo;
import com.nbp.sez.status.application.form.service.model.SezZoneSubCheckInfo;
import com.nbp.sez.status.application.form.service.model.SezZoneUserUnderInfo;
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
import com.nbp.sez.status.application.form.service.service.SezOccLocationAddLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantDirectorPartnerSponsorInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantEmploymentInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantExistingProposedProjectBriefInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantGeneralBussinessAddressLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantGeneralBussinessInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantInvestAndFinanceInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantPrincipleDirectorLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantPrincipleOfficerLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantShareHoldingInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantUserUndertakingInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupanteDeveloperUndertakingInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupanteSubmissionChecklistInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezStatusAppPaymentLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezStatusApplicationCurrentStageLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezStatusApplicationLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezStatusWFMLocationAddLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezStatusWorkFromHomeLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezZoneDevUnderInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezZoneEmployInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezZoneFinancialInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezZoneGeneralBusinessInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezZoneGeneralBussinessAddressLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezZoneLocationAddLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezZoneProposedProjectInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezZoneSubCheckInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezZoneUserUnderInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.sezDeveloperUndertakingLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.sezSubmissionChecklistLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationWorkflowConstant;
import com.nbp.sez.status.application.util.SezStatusApplicationDataCreationUtil;
import com.nbp.sez.status.application.util.SezStatusApplicationDocumentsCopyUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
"mvc.command.name=/renew/license" }, service = MVCResourceCommand.class)

public class RenewSezLicenseResourceCommand implements MVCResourceCommand{
	static Log _log = LogFactoryUtil.getLog(RenewSezLicenseResourceCommand.class);
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "SEZ Status Supported Documents";
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String licenseNumber = ParamUtil.getString(resourceRequest, "licenseNumber");
		String typeOfSezStatus=ParamUtil.getString(resourceRequest, "typeOfSezStatus");
		String controlNumber=ParamUtil.getString(resourceRequest, "controlNumber");
		String wfhCheck=ParamUtil.getString(resourceRequest, "wfhCheck");
		String ApplicantStatus=ParamUtil.getString(resourceRequest, "ApplicantStatus");
		String typeOfTransactionWFH=ParamUtil.getString(resourceRequest, "typeOfTransactionWFH");
		SezStatusApplication sezApplication=null;
		SezStatusApplication sezApplicationRenewalProcess = null;
		String renew=null;
		long sezApplicationId=0;
		try {
			try {
				if (Validator.isNotNull(licenseNumber)) {
					sezApplication = SezStatusApplicationLocalServiceUtil.getSezStatusByAppNo(licenseNumber);
				}
			
				sezApplicationId=sezApplication.getSezStatusApplicationId();
			}catch (Exception e) {
			}
			if(Validator.isNull(sezApplication)) {
				if (Validator.isNull(licenseNumber)){
					jsonOBJ.put("licenseNumberCheck", "0");
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
				    resourceResponse.getWriter().write(jsonFeed.toString());
				}else {
					renew="true";
				String renewUrl = SezStatusApplicationDataCreationUtil.getApplicationData(themeDisplay, licenseNumber,typeOfSezStatus,wfhCheck,ApplicantStatus,typeOfTransactionWFH,renew);
				jsonOBJ.put("renewLicenseUrl", renewUrl);
				jsonFeed.put("APP_DATA", jsonOBJ);
				resourceResponse.setContentType("application/json");
				resourceResponse.getWriter().print(jsonFeed.toString());
				}
			}else {
				if(sezApplication.getStatus()==SezStatusApplicationWorkflowConstant.SUBMITTED) {
					renew="true";
					System.out.println("---------------------------after successfully submitted-----------------------");
					if (Validator.isNotNull(licenseNumber)) {  
						try {
							sezApplicationRenewalProcess = SezStatusApplicationLocalServiceUtil.getSezByAT_AppNo(SezStatusApplicationWorkflowConstant.RENEW_APPLICATION,licenseNumber);			
						} catch (Exception e) {
							_log.error("Error****************" + e.getMessage());
						}
					}if(sezApplicationRenewalProcess==null) {
						SezStatusApplicationCurrentStage renewCurrentStage=null;
						renewCurrentStage=SezStatusApplicationCurrentStageLocalServiceUtil.createSezStatusApplicationCurrentStage(CounterLocalServiceUtil.increment());
						renewCurrentStage.setCurrentStage("APPLICATION FORM DETAILS");
						if(sezApplication.getSezStatus().equals("SEZ Occupant")) {
					    renewCurrentStage.setLastFormStep("childStep11");
						}
						else if(sezApplication.getSezStatus().equals("SEZ Developer")) {
						renewCurrentStage.setLastFormStep("childStep20");
						}
						else if(sezApplication.getSezStatus().equals("SEZ Zone User")) {
							renewCurrentStage.setLastFormStep("childStep20");
						}else if(sezApplication.getDoYouWantTo().equals("Submit an Application for A Work From Home Certificate")) {
							renewCurrentStage.setLastFormStep("childStep20");
						}
						sezApplicationRenewalProcess = SezStatusApplicationLocalServiceUtil.createSezStatusApplication(CounterLocalServiceUtil.increment());
						DateFormat df = new SimpleDateFormat("yy");
						String formattedDate = df.format(Calendar.getInstance().getTime());
						SecureRandom random = new SecureRandom();
						int num = random.nextInt(100000);
						String formatted = String.format("%05d", num);
						sezApplicationRenewalProcess.setCompanyId(themeDisplay.getCompanyId());
						sezApplicationRenewalProcess.setGroupId(themeDisplay.getScopeGroupId());
						sezApplicationRenewalProcess.setCreateDate(new Date());
						sezApplicationRenewalProcess.setUserId(themeDisplay.getUserId());
						sezApplicationRenewalProcess.setUserName(themeDisplay.getUser().getFullName());
						sezApplicationRenewalProcess.setExpiredLicenseAppNumber(licenseNumber);
						sezApplicationRenewalProcess.setApplicationNumber(formatted + "/" + formattedDate);
						if(typeOfSezStatus.equals("SEZ Developer")) {
						sezApplicationRenewalProcess.setTypeOfTransaction("Application for Renewal of SEZ Developer Status");
						}else if(typeOfSezStatus.equals("SEZ Occupant")) {
						sezApplicationRenewalProcess.setTypeOfTransaction(" Application for Renewal of SEZ Occupant Status");	
						}else if(typeOfSezStatus.equals("SEZ Zone User")) {
						sezApplicationRenewalProcess.setTypeOfTransaction(" Application for Re-authorization SEZ Zone User Status");	
						}
						sezApplicationRenewalProcess.setStatus(SezStatusApplicationWorkflowConstant.DRAFT);
						
						sezApplicationRenewalProcess.setDoYouWantTo(sezApplication.getDoYouWantTo());
						sezApplicationRenewalProcess.setSezStatus(sezApplication.getSezStatus());
						sezApplicationRenewalProcess.setIndustries(sezApplication.getIndustries());
						sezApplicationRenewalProcess.setParish(sezApplication.getParish());
						SezStatusApplicationLocalServiceUtil.updateSezStatusApplication(sezApplicationRenewalProcess);
						renewCurrentStage.setSezStatusApplicationId(sezApplicationRenewalProcess.getSezStatusApplicationId());
						SezStatusApplicationCurrentStageLocalServiceUtil.updateSezStatusApplicationCurrentStage(renewCurrentStage);
						copyingDataFromOriginalApplication(sezApplication.getSezStatusApplicationId(), sezApplicationRenewalProcess.getSezStatusApplicationId());
						ServiceContext serviceContext = new ServiceContext();
						DLFolder originalRootDlFolder = null;
						DLFolder supportingDocsMainFolder = null;
						serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), resourceRequest);
						try {
							originalRootDlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
						} catch (PortalException e) {
							_log.error("Error---->>" + e.getMessage());
						}
						try {
							supportingDocsMainFolder = DLFolderLocalServiceUtil.getFolder(
									themeDisplay.getScopeGroupId(), originalRootDlFolder.getFolderId(),
									String.valueOf(sezApplicationId));
						} catch (PortalException e) {
							_log.error("Error----->>" + e.getMessage());
						}
						DLFolder copiedDlFolder = null;
						try {
							copiedDlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									originalRootDlFolder.getFolderId(), String.valueOf(
											sezApplicationRenewalProcess.getSezStatusApplicationId()));
						} catch (Exception e) {
							_log.error("Error----->>" + e.getMessage());
						}
						_log.error("DL Folder");
						if (copiedDlFolder == null) {
							SezStatusApplicationDocumentsCopyUtil.copyFolder(themeDisplay.getScopeGroupId(),
									supportingDocsMainFolder.getFolderId(), originalRootDlFolder.getFolderId(),
									String.valueOf(
											sezApplicationRenewalProcess.getSezStatusApplicationId()),
									supportingDocsMainFolder.getDescription(), serviceContext,
									supportingDocsMainFolder.getFolderId(), themeDisplay.getUserId(),
									sezApplicationRenewalProcess.getSezStatusApplicationId());

						}
						_log.error("DL Folder Copied");
					}
					String renewLicenseUrl = 
							 "/group/guest/sez-status-application-form?sezStatusApplicationId="
									+ sezApplicationRenewalProcess.getSezStatusApplicationId()+"&_renew="+renew;
					jsonOBJ.put("renewLicenseUrl", renewLicenseUrl);
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().write(jsonFeed.toString());
				} 
//				else {
//					System.out.println("-------------------form not submitted----------------going in else-------------------");
//					jsonOBJ.put("licenseNumberCheck", "0");
//					jsonFeed.put("APP_DATA", jsonOBJ);
//					resourceResponse.setContentType("application/json");
//					resourceResponse.getWriter().write(jsonFeed.toString());
//				}
				}
		}
		  catch (Exception e) {
			_log.error("Error****************" + e.getMessage());
			_log.error("Error****************" + e.getCause());
		}
		return false;
	}
	public static void copyingDataFromOriginalApplication(long sezStatusApplicationId,
			long sezStatusRenewalApplicationId) {
	    SezStatusApplication sezApplication=null;
	    try {
	    	sezApplication =SezStatusApplicationLocalServiceUtil.getSezStatusApplication(sezStatusApplicationId);
		}catch (Exception e) {
			_log.error("Error****************" + e.getMessage());
		}
//		 ForWorkFromHome
		 if(sezApplication.getDoYouWantTo().equals("Submit an Application for A Work From Home Certificate")) {
			 System.out.println("indside renew of Work from home---------------");
			 SezStatusWorkFromHome workFromData=null;
			 SezStatusWorkFromHome renewWorkFromData=null;
			 try {
				 workFromData =SezStatusWorkFromHomeLocalServiceUtil.getSezById(sezStatusApplicationId);
					}catch (Exception e) {
						_log.error("Error****************" + e.getMessage());
					}
				if(workFromData!=null) {
					System.out.println("indside work From home data of Work from home---------------");
					renewWorkFromData = SezStatusWorkFromHomeLocalServiceUtil.createSezStatusWorkFromHome(CounterLocalServiceUtil.increment(SezStatusWorkFromHome.class.getName()));
					renewWorkFromData.setCompanyName(workFromData.getCompanyName());
					renewWorkFromData.setContactPersonName(workFromData.getContactPersonName());
					renewWorkFromData.setContactPersonEmail(workFromData.getContactPersonEmail());
					renewWorkFromData.setControlNumber(workFromData.getControlNumber());
					renewWorkFromData.setWorkerUtilizingIncentive(workFromData.getWorkerUtilizingIncentive());
					renewWorkFromData.setWorkerUtilizingIncentiveMonth(workFromData.getWorkerUtilizingIncentiveMonth());
					renewWorkFromData.setSezStatusApplicationId(sezStatusRenewalApplicationId);
					SezStatusWorkFromHomeLocalServiceUtil.updateSezStatusWorkFromHome(renewWorkFromData);
				}
			List<SezStatusWFMLocationAdd> workFromHomeLocationAddData =null;
			SezStatusWFMLocationAdd renewWorkFromHomeLocationAddData =null;
			 try {
				 workFromHomeLocationAddData =SezStatusWFMLocationAddLocalServiceUtil.getSezStatusWFMLocationAddListById(sezStatusApplicationId);
					}catch (Exception e) {
						_log.error("Error****************" + e.getMessage());
					}
				if(workFromHomeLocationAddData!=null) {
			for(SezStatusWFMLocationAdd data : workFromHomeLocationAddData) {
			renewWorkFromHomeLocationAddData = SezStatusWFMLocationAddLocalServiceUtil.createSezStatusWFMLocationAdd(CounterLocalServiceUtil.increment(SezStatusWFMLocationAdd.class.getName()));
			renewWorkFromHomeLocationAddData.setControlNumber(data.getControlNumber());
			renewWorkFromHomeLocationAddData.setLocation(data.getLocation());
			renewWorkFromHomeLocationAddData.setParish(data.getParish());
			renewWorkFromHomeLocationAddData.setSezStatusApplicationId(sezStatusRenewalApplicationId);
			SezStatusWFMLocationAddLocalServiceUtil.updateSezStatusWFMLocationAdd(renewWorkFromHomeLocationAddData);
				}
			}
		 }
		SezDevGeneralBusinessIfo sezStatusApplication = null;
		try {
			sezStatusApplication =SezDevGeneralBusinessIfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
			_log.error("Error****************" + e.getMessage());
		}
		SezDevGeneralBusinessIfo ciData = null;
		try {
			ciData = SezDevGeneralBusinessIfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch(Exception e) {
			_log.error("Error****************" + e.getMessage());
		}
		if(sezStatusApplication != null) {
			//General Business Information
			ciData.setApplicationDate(sezStatusApplication.getApplicationDate());
			ciData.setApplicantName(sezStatusApplication.getApplicantName());
			ciData.setCompanyName(sezStatusApplication.getCompanyName());
			ciData.setBuildingNum(sezStatusApplication.getBuildingNum());
			ciData.setTownCity(sezStatusApplication.getTownCity());
			ciData.setParish(sezStatusApplication.getParish());
			ciData.setCountry(sezStatusApplication.getCountry());
			ciData.setTelephoneNum(sezStatusApplication.getTelephoneNum());
			ciData.setFaxNum(sezStatusApplication.getFaxNum());
			ciData.setEmailAddress(sezStatusApplication.getEmailAddress());
			ciData.setWebsite(sezStatusApplication.getWebsite());
			ciData.setHeadOfficeBuildingNum(sezStatusApplication.getHeadOfficeBuildingNum());
			ciData.setHeadOfficeTown(sezStatusApplication.getHeadOfficeTown());
			ciData.setHeadOfficeParish(sezStatusApplication.getHeadOfficeParish());
			ciData.setAuthRepName(sezStatusApplication.getAuthRepName());
			ciData.setAuthRepBuildingNum(sezStatusApplication.getAuthRepBuildingNum());
			ciData.setAuthRepTown(sezStatusApplication.getAuthRepTown());
			ciData.setAuthRepParish(sezStatusApplication.getAuthRepParish());
			ciData.setAuthRepCountry(sezStatusApplication.getAuthRepCountry());
			ciData.setAuthReptelephoneNum(sezStatusApplication.getAuthReptelephoneNum());
			ciData.setAuthRepFaxNum(sezStatusApplication.getAuthRepFaxNum());
			ciData.setAutheEmailAddress(sezStatusApplication.getAutheEmailAddress());
			ciData.setJoinVenture(sezStatusApplication.getJoinVenture());
			ciData.setExistingJamicanCom(sezStatusApplication.getExistingJamicanCom());
			ciData.setArticleOfIncorporation(sezStatusApplication.getArticleOfIncorporation());
			ciData.setPleaseSpecify(sezStatusApplication.getPleaseSpecify());
			ciData.setCompanyClassified(sezStatusApplication.getCompanyClassified());
			ciData.setTaxRegisNum(sezStatusApplication.getTaxRegisNum());
			ciData.setGenConsumptionNum(sezStatusApplication.getGenConsumptionNum());
			ciData.setTaxComplianceCertificateNum(sezStatusApplication.getTaxComplianceCertificateNum());
			ciData.setSezStatusApplicationId(sezStatusRenewalApplicationId);
			SezDevGeneralBusinessIfoLocalServiceUtil.updateSezDevGeneralBusinessIfo(ciData);
		}
		//add more
		List<SezDevGenBusinessInfoAdd>  sezDevGenBusinessInfoAdd = null;
		SezDevGenBusinessInfoAdd renewSezDevGenBusinessInfoAdd = null;
		try {
			sezDevGenBusinessInfoAdd =SezDevGenBusinessInfoAddLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
			_log.error("Error****************" + e.getMessage());
		}
		if(sezDevGenBusinessInfoAdd != null){
			for (SezDevGenBusinessInfoAdd sezDevGen : sezDevGenBusinessInfoAdd) {
				renewSezDevGenBusinessInfoAdd =SezDevGenBusinessInfoAddLocalServiceUtil.createSezDevGenBusinessInfoAdd(CounterLocalServiceUtil.increment());
				renewSezDevGenBusinessInfoAdd.setCompanyName(sezDevGen.getCompanyName());
				renewSezDevGenBusinessInfoAdd.setBuildingNum(sezDevGen.getBuildingNum());
				renewSezDevGenBusinessInfoAdd.setTownCity(sezDevGen.getTownCity());
				renewSezDevGenBusinessInfoAdd.setParish(sezDevGen.getParish());
				renewSezDevGenBusinessInfoAdd.setCountry(sezDevGen.getCountry());
				renewSezDevGenBusinessInfoAdd.setTelephoneNum(sezDevGen.getTelephoneNum());
				renewSezDevGenBusinessInfoAdd.setFaxNum(sezDevGen.getFaxNum());
				renewSezDevGenBusinessInfoAdd.setEmailAddress(sezDevGen.getEmailAddress());
				renewSezDevGenBusinessInfoAdd.setSezStatusApplicationId(sezStatusRenewalApplicationId);
				SezDevGenBusinessInfoAddLocalServiceUtil.updateSezDevGenBusinessInfoAdd(renewSezDevGenBusinessInfoAdd);
			}	
		}
		
	//Shareholding / Partnership / Director Information
		
		
		SezDevShareholdingInfo devShareholdingInfo = null;
		SezDevShareholdingInfo renewDevShareholdingInfo = null;
		
		try {
			devShareholdingInfo =SezDevShareholdingInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
			_log.error("Error****************" + e.getMessage());
		}
		try {
			renewDevShareholdingInfo = SezDevShareholdingInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
			_log.error("Error****************" + e.getMessage());
		}
		
		if(devShareholdingInfo != null) {
			renewDevShareholdingInfo.setAuthorised(devShareholdingInfo.getAuthorised());
			renewDevShareholdingInfo.setSubscribed(devShareholdingInfo.getSubscribed());
			renewDevShareholdingInfo.setPaidUpShareCapital(devShareholdingInfo.getPaidUpShareCapital());
			renewDevShareholdingInfo.setDirectorBankrupts(devShareholdingInfo.getDirectorBankrupts());
			renewDevShareholdingInfo.setSezStatusApplicationId(sezStatusRenewalApplicationId);
			SezDevShareholdingInfoLocalServiceUtil.updateSezDevShareholdingInfo(renewDevShareholdingInfo);
		}
		
		
		//add more first
		
	List<SezDevSharePrincipalAdd> sharePricipalAdd = null;
	SezDevSharePrincipalAdd renewSharePricipalAdd = null;
		
	try {
		sharePricipalAdd =SezDevSharePrincipalAddLocalServiceUtil.getSezById(sezStatusApplicationId);
	}catch (Exception e) {
		_log.error("Error****************" + e.getMessage());
	}
	
	if(sharePricipalAdd != null){
		for (SezDevSharePrincipalAdd sezDevShare : sharePricipalAdd) {
			renewSharePricipalAdd =SezDevSharePrincipalAddLocalServiceUtil.createSezDevSharePrincipalAdd(CounterLocalServiceUtil.increment());
			renewSharePricipalAdd.setName(sezDevShare.getName());
			renewSharePricipalAdd.setBuildingNum(sezDevShare.getBuildingNum());
			renewSharePricipalAdd.setParishPost(sezDevShare.getParishPost());
			renewSharePricipalAdd.setCountry(sezDevShare.getCountry());
			renewSharePricipalAdd.setNationality(sezDevShare.getNationality());
			renewSharePricipalAdd.setTaxRegistrationNum(sezDevShare.getTaxRegistrationNum());
			renewSharePricipalAdd.setCounter(sezDevShare.getCounter());
			renewSharePricipalAdd.setSezStatusApplicationId(sezStatusRenewalApplicationId);
			SezDevSharePrincipalAddLocalServiceUtil.updateSezDevSharePrincipalAdd(renewSharePricipalAdd);
		}	
	}
	
	//add more second
  List<SezDevShareDirectorAdd> shareDirectror = null;
  SezDevShareDirectorAdd renewShareDirectror = null;
  
  try {
	  shareDirectror =SezDevShareDirectorAddLocalServiceUtil.getSezById(sezStatusApplicationId);
	}catch (Exception e) {
		_log.error("Error****************" + e.getMessage());
	}
  
  if(shareDirectror != null){
		for (SezDevShareDirectorAdd sezDirector : shareDirectror) {
			renewShareDirectror =SezDevShareDirectorAddLocalServiceUtil.createSezDevShareDirectorAdd(CounterLocalServiceUtil.increment());
			renewShareDirectror.setShareholderName(sezDirector.getShareholderName());
			renewShareDirectror.setNumOfShare(sezDirector.getNumOfShare());
			renewShareDirectror.setCounter(sezDirector.getCounter());
			renewShareDirectror.setSezStatusApplicationId(sezStatusRenewalApplicationId);
			SezDevShareDirectorAddLocalServiceUtil.updateSezDevShareDirectorAdd(renewShareDirectror);
		}	
	}
  
  //add more third
  
	List<SezDevShareComDirectorShipAdd> shareComDirectorShip = null;
	SezDevShareComDirectorShipAdd renewShareComDirectorShip = null;
   
	 try {
		 shareComDirectorShip =SezDevShareComDirectorShipAddLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
			_log.error("Error****************" + e.getMessage());
		}
	  
	 if(shareComDirectorShip!= null){
			for (SezDevShareComDirectorShipAdd sezComDirector : shareComDirectorShip) {
				renewShareComDirectorShip =SezDevShareComDirectorShipAddLocalServiceUtil.createSezDevShareComDirectorShipAdd(CounterLocalServiceUtil.increment());
				renewShareComDirectorShip.setName(sezComDirector.getName());
				renewShareComDirectorShip.setCompany(sezComDirector.getCompany());
				renewShareComDirectorShip.setReplationship(sezComDirector.getReplationship());
				renewShareComDirectorShip.setCounter(sezComDirector.getCounter());
				renewShareComDirectorShip.setSezStatusApplicationId(sezStatusRenewalApplicationId);
				SezDevShareComDirectorShipAddLocalServiceUtil.updateSezDevShareComDirectorShipAdd(renewShareComDirectorShip);
			}	
		}
	 
	 
	//add more fourth
	 
	List<SezDevShareCorporationBusAdd> shareCorporationBusiness = null;
		SezDevShareCorporationBusAdd renewShareCorporationBusiness = null;
		
		try {
			shareCorporationBusiness =SezDevShareCorporationBusAddLocalServiceUtil.getSezById(sezStatusApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			}
		
		 if(shareCorporationBusiness!= null){
				for (SezDevShareCorporationBusAdd sezCorporation : shareCorporationBusiness) {
					renewShareCorporationBusiness =SezDevShareCorporationBusAddLocalServiceUtil.createSezDevShareCorporationBusAdd(CounterLocalServiceUtil.increment());
					renewShareCorporationBusiness.setName(sezCorporation.getName());
					renewShareCorporationBusiness.setCompany(sezCorporation.getCompany());
					renewShareCorporationBusiness.setRelationship(sezCorporation.getRelationship());
					renewShareCorporationBusiness.setCounter(sezCorporation.getCounter());
					renewShareCorporationBusiness.setSezStatusApplicationId(sezStatusRenewalApplicationId);
					SezDevShareCorporationBusAddLocalServiceUtil.updateSezDevShareCorporationBusAdd(renewShareCorporationBusiness);
				}	
			}
		 
	
	//add more fifth
		 List<SezDevSharePleaseStateAdd> sharePleaseState = null;
		 SezDevSharePleaseStateAdd renewSharePleaseState = null;
		 
		 try {
			 sharePleaseState =SezDevSharePleaseStateAddLocalServiceUtil.getSezById(sezStatusApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
		 
		 if(sharePleaseState!= null){
				for (SezDevSharePleaseStateAdd sharePlease : sharePleaseState) {
					renewSharePleaseState =SezDevSharePleaseStateAddLocalServiceUtil.createSezDevSharePleaseStateAdd(CounterLocalServiceUtil.increment());
					renewSharePleaseState.setName(sharePlease.getName());
					renewSharePleaseState.setCounter(sharePlease.getCounter());
					renewSharePleaseState.setSezStatusApplicationId(sezStatusRenewalApplicationId);
					SezDevSharePleaseStateAddLocalServiceUtil.updateSezDevSharePleaseStateAdd(renewSharePleaseState);
				}	
			}	
		 
		 
	//Existing and Proposed Project Breif
		 SezDevProposedProject devProposedProject = null;
		 SezDevProposedProject  renewDevProposedProject=null;
		 
	 
	 try {
		 devProposedProject = SezDevProposedProjectLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
			_log.error("Error****************" + e.getMessage());
		}
		try {
			renewDevProposedProject =  SezDevProposedProjectLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
			_log.error("Error****************" + e.getMessage());
		}
	
		if(devProposedProject != null) {
			renewDevProposedProject.setPreviouslyFreeZone(devProposedProject.getPreviouslyFreeZone());
			renewDevProposedProject.setCurentlyOperatingZone(devProposedProject.getCurentlyOperatingZone());
			renewDevProposedProject.setBusinessConductedZone(devProposedProject.getBusinessConductedZone());
			renewDevProposedProject.setLocally(devProposedProject.getLocally());
			renewDevProposedProject.setOverseas(devProposedProject.getOverseas());
			renewDevProposedProject.setProposedName(devProposedProject.getProposedName());
			renewDevProposedProject.setSpecialEconomicZone(devProposedProject.getSpecialEconomicZone());
			renewDevProposedProject.setPleaseDescribe(devProposedProject.getPleaseDescribe());
			renewDevProposedProject.setSeaPortKm(devProposedProject.getSeaPortKm());
			renewDevProposedProject.setSeaPortMi(devProposedProject.getSeaPortMi());
			renewDevProposedProject.setAirportKm(devProposedProject.getAirportKm());
			renewDevProposedProject.setAirportMi(devProposedProject.getAirportMi());
			renewDevProposedProject.setRoadKm(devProposedProject.getRoadKm());
			renewDevProposedProject.setRoadMi(devProposedProject.getRoadMi());
			renewDevProposedProject.setRailKm(devProposedProject.getRailKm());
			renewDevProposedProject.setRailMi(devProposedProject.getRailMi());
			renewDevProposedProject.setCustomProcessingKm(devProposedProject.getCustomProcessingKm());
			renewDevProposedProject.setCustomProcessingMi(devProposedProject.getCustomProcessingMi());
			renewDevProposedProject.setIndicateTheLandMeasurement(devProposedProject.getIndicateTheLandMeasurement());
			renewDevProposedProject.setBuilding(devProposedProject.getBuilding());
			renewDevProposedProject.setLandArea(devProposedProject.getLandArea());
			renewDevProposedProject.setOwnerShip(devProposedProject.getOwnerShip());
			renewDevProposedProject.setOtherPleaseSpecify(devProposedProject.getOtherPleaseSpecify());
			renewDevProposedProject.setLandOwnerName(devProposedProject.getLandOwnerName());
			renewDevProposedProject.setLnadOwnerAddressOne(devProposedProject.getLnadOwnerAddressOne());
			renewDevProposedProject.setLnadOwnerAddressTwo(devProposedProject.getLnadOwnerAddressTwo());
			renewDevProposedProject.setLnadOwnerTenure(devProposedProject.getLnadOwnerTenure());
			renewDevProposedProject.setStepToAcquireLand(devProposedProject.getStepToAcquireLand());
			renewDevProposedProject.setStateWheatherTheProposedArea(devProposedProject.getStateWheatherTheProposedArea());
			renewDevProposedProject.setApplicantPreviously(devProposedProject.getApplicantPreviously());
			renewDevProposedProject.setPleaseProvideBrief(devProposedProject.getPleaseProvideBrief());
			renewDevProposedProject.setSezStatusApplicationId(sezStatusRenewalApplicationId);
			SezDevProposedProjectLocalServiceUtil.updateSezDevProposedProject(renewDevProposedProject);
			
		}
		
		//add more first
		
	List<SezDevProposedProjectAdd> proposedProject = null;
		SezDevProposedProjectAdd renewProposedProject = null;
		
		 try {
			 proposedProject =SezDevProposedProjectAddLocalServiceUtil.getSezById(sezStatusApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
		 
		 if(sharePleaseState!= null){
				for (SezDevProposedProjectAdd sezProposed : proposedProject) {
					renewProposedProject =SezDevProposedProjectAddLocalServiceUtil.createSezDevProposedProjectAdd(CounterLocalServiceUtil.increment());
					renewProposedProject.setNameOfZone(sezProposed.getNameOfZone());
					renewProposedProject.setParish(sezProposed.getParish());
					renewProposedProject.setCounter(sezProposed.getCounter());
					renewProposedProject.setSezStatusApplicationId(sezStatusRenewalApplicationId);
					SezDevProposedProjectAddLocalServiceUtil.updateSezDevProposedProjectAdd(renewProposedProject);
				}	
			}	
		 
		
	
		//Proposed Development Plan
		 
		 SezDevPropDevelopmentPlan proposedDevelopmentPlan=null;
		 SezDevPropDevelopmentPlan renewProposedDevelopmentPlan=null;
		 
		 try {
			 proposedDevelopmentPlan = SezDevPropDevelopmentPlanLocalServiceUtil.getSezById(sezStatusApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			}
		 try {
				renewProposedDevelopmentPlan = SezDevPropDevelopmentPlanLocalServiceUtil.getSezById(sezStatusApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			}

		
		 if(proposedDevelopmentPlan != null) {
			    renewProposedDevelopmentPlan.setExistingBuilding(proposedDevelopmentPlan.getExistingBuilding());
				renewProposedDevelopmentPlan.setExistingBuildingForBusiDetail(proposedDevelopmentPlan.getExistingBuildingForBusiDetail());
				renewProposedDevelopmentPlan.setActivitiesForSingleEntity(proposedDevelopmentPlan.getActivitiesForSingleEntity());
				renewProposedDevelopmentPlan.setVolume(proposedDevelopmentPlan.getVolume());
				renewProposedDevelopmentPlan.setFolio(proposedDevelopmentPlan.getFolio());
				renewProposedDevelopmentPlan.setBuildingNum(proposedDevelopmentPlan.getBuildingNum());
				renewProposedDevelopmentPlan.setTownCity(proposedDevelopmentPlan.getTownCity());
				renewProposedDevelopmentPlan.setZoningClassification(proposedDevelopmentPlan.getZoningClassification());
				renewProposedDevelopmentPlan.setLandUse(proposedDevelopmentPlan.getLandUse());
				renewProposedDevelopmentPlan.setSezAreaHectares(proposedDevelopmentPlan.getSezAreaHectares());
				renewProposedDevelopmentPlan.setSezAreaAcres(proposedDevelopmentPlan.getSezAreaAcres());
				renewProposedDevelopmentPlan.setCustomsHectares(proposedDevelopmentPlan.getCustomsHectares());
				renewProposedDevelopmentPlan.setCustomsAcres(proposedDevelopmentPlan.getCustomsAcres());
				renewProposedDevelopmentPlan.setTopography(proposedDevelopmentPlan.getTopography());
				renewProposedDevelopmentPlan.setNorthBoundaries(proposedDevelopmentPlan.getNorthBoundaries());
				renewProposedDevelopmentPlan.setEastBoundaries(proposedDevelopmentPlan.getEastBoundaries());
				renewProposedDevelopmentPlan.setWestBoundaries(proposedDevelopmentPlan.getWestBoundaries());
				renewProposedDevelopmentPlan.setSouthBoundaries(proposedDevelopmentPlan.getSouthBoundaries());
				renewProposedDevelopmentPlan.setCustomLandMeasurement(proposedDevelopmentPlan.getCustomLandMeasurement());
				renewProposedDevelopmentPlan.setCustomPercent(proposedDevelopmentPlan.getCustomPercent());
				renewProposedDevelopmentPlan.setCommonLandMeasurement(proposedDevelopmentPlan.getCommonLandMeasurement());
				renewProposedDevelopmentPlan.setCommonPercent(proposedDevelopmentPlan.getCommonPercent());
				renewProposedDevelopmentPlan.setBufferLandMeasurement(proposedDevelopmentPlan.getBufferLandMeasurement());
				renewProposedDevelopmentPlan.setBufferPercent(proposedDevelopmentPlan.getBufferPercent());
				renewProposedDevelopmentPlan.setZoneLandMeasurement(proposedDevelopmentPlan.getZoneLandMeasurement());
				renewProposedDevelopmentPlan.setZonePercent(proposedDevelopmentPlan.getZonePercent());
				renewProposedDevelopmentPlan.setResidentialLandMeasurement(proposedDevelopmentPlan.getResidentialLandMeasurement());
				renewProposedDevelopmentPlan.setResidentialPercent(proposedDevelopmentPlan.getResidentialPercent());
				renewProposedDevelopmentPlan.setTotalLandMeasurement(proposedDevelopmentPlan.getTotalLandMeasurement());
				renewProposedDevelopmentPlan.setTotalPercent(proposedDevelopmentPlan.getTotalPercent());
				renewProposedDevelopmentPlan.setIndustrialProcess(proposedDevelopmentPlan.getIndustrialProcess());
				renewProposedDevelopmentPlan.setDrinkingPurpose(proposedDevelopmentPlan.getDrinkingPurpose());
				renewProposedDevelopmentPlan.setOtherSpecify(proposedDevelopmentPlan.getOtherSpecify());
				renewProposedDevelopmentPlan.setTotalRequirement(proposedDevelopmentPlan.getTotalRequirement());
				renewProposedDevelopmentPlan.setQuantumAndNature(proposedDevelopmentPlan.getQuantumAndNature());
				renewProposedDevelopmentPlan.setSpecifyWhetherOwn(proposedDevelopmentPlan.getSpecifyWhetherOwn());
				renewProposedDevelopmentPlan.setReqOfPower(proposedDevelopmentPlan.getReqOfPower());
				renewProposedDevelopmentPlan.setMainRoadRowWidth(proposedDevelopmentPlan.getMainRoadRowWidth());
				renewProposedDevelopmentPlan.setMainRoadTypeOfPavement(proposedDevelopmentPlan.getMainRoadTypeOfPavement());
				renewProposedDevelopmentPlan.setSecondRowWidhth(proposedDevelopmentPlan.getSecondRowWidhth());
				renewProposedDevelopmentPlan.setSecondTypeOfPavement(proposedDevelopmentPlan.getSecondTypeOfPavement());
				renewProposedDevelopmentPlan.setTertiaryRowWidhth(proposedDevelopmentPlan.getTertiaryRowWidhth());
				renewProposedDevelopmentPlan.setTertiaryTypeOfPavement(proposedDevelopmentPlan.getTertiaryTypeOfPavement());
				renewProposedDevelopmentPlan.setWaterInstallationReq(proposedDevelopmentPlan.getWaterInstallationReq());
				renewProposedDevelopmentPlan.setPowerInstallationReq(proposedDevelopmentPlan.getPowerInstallationReq());
				renewProposedDevelopmentPlan.setTeleComInstallationReq(proposedDevelopmentPlan.getTeleComInstallationReq());
				renewProposedDevelopmentPlan.setCctvInstallationReq(proposedDevelopmentPlan.getCctvInstallationReq());
				renewProposedDevelopmentPlan.setSecurityInterconnection(proposedDevelopmentPlan.getSecurityInterconnection());
				renewProposedDevelopmentPlan.setFireFightingInstallationReq(proposedDevelopmentPlan.getFireFightingInstallationReq());
				renewProposedDevelopmentPlan.setZipCode(proposedDevelopmentPlan.getZipCode());
				renewProposedDevelopmentPlan.setSezStatusApplicationId(sezStatusRenewalApplicationId);
				SezDevPropDevelopmentPlanLocalServiceUtil.updateSezDevPropDevelopmentPlan(renewProposedDevelopmentPlan);
			 
			 
		 }
		
		//Employee Safety and Security
		 //add more
		 
		List<SezDevEmployeeSafetyInfoAdd> employeeSafety = null;
			SezDevEmployeeSafetyInfoAdd renewEmployeeSafety = null;
		
			try {
				employeeSafety =SezDevEmployeeSafetyInfoAddLocalServiceUtil.getSezById(sezStatusApplicationId);
					}catch (Exception e) {
						_log.error("Error****************" + e.getMessage());
					}
			 
			 if(employeeSafety!= null){
					for (SezDevEmployeeSafetyInfoAdd employee : employeeSafety) {
						renewEmployeeSafety =SezDevEmployeeSafetyInfoAddLocalServiceUtil.createSezDevEmployeeSafetyInfoAdd(CounterLocalServiceUtil.increment());
						renewEmployeeSafety.setSecurityMeasures(employee.getSecurityMeasures());
						renewEmployeeSafety.setCounter(employee.getCounter());
						renewEmployeeSafety.setSezStatusApplicationId(sezStatusRenewalApplicationId);
						SezDevEmployeeSafetyInfoAddLocalServiceUtil.updateSezDevEmployeeSafetyInfoAdd(renewEmployeeSafety);
					}	
				}	
		
		
     // add more second
		List<SezDevEmployeeDefineOccuAdd> employeeDefineOcuu = null;
			 SezDevEmployeeDefineOccuAdd renewEmployeeDefineOcuu = null;
			 
	try {
		employeeDefineOcuu =SezDevEmployeeDefineOccuAddLocalServiceUtil.getSezById(sezStatusApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			}
	 
	 if(employeeDefineOcuu!= null){
			for (SezDevEmployeeDefineOccuAdd employeeDefine : employeeDefineOcuu) {
				renewEmployeeDefineOcuu =SezDevEmployeeDefineOccuAddLocalServiceUtil.createSezDevEmployeeDefineOccuAdd(CounterLocalServiceUtil.increment());
				renewEmployeeDefineOcuu.setOccuSafetySystem(employeeDefine.getOccuSafetySystem());
				renewEmployeeDefineOcuu.setCounter(employeeDefine.getCounter());
				renewEmployeeDefineOcuu.setSezStatusApplicationId(sezStatusRenewalApplicationId);
				SezDevEmployeeDefineOccuAddLocalServiceUtil.updateSezDevEmployeeDefineOccuAdd(renewEmployeeDefineOcuu);
				
			}	
		}	

	//Employment Information
	 
	 SezDevEmplomentInfo devEmploment = null;
	 SezDevEmplomentInfo renewDevEmploment = null;
	 
	 try {
		 devEmploment = SezDevEmplomentInfoLocalServiceUtil.getgetSezById(sezStatusApplicationId);
		}catch (Exception e) {
			_log.error("Error****************" + e.getMessage());
		}
	 try {
		 renewDevEmploment =  SezDevEmplomentInfoLocalServiceUtil.getgetSezById(sezStatusApplicationId);
		}catch (Exception e) {
			_log.error("Error****************" + e.getMessage());
		}
		
	
	 
			 if(devEmploment!= null){
				    renewDevEmploment.setFirstYearDirect(devEmploment.getFirstYearDirect());
					renewDevEmploment.setFirstYearInDirect(devEmploment.getFirstYearInDirect());
					renewDevEmploment.setFirstYearMale(devEmploment.getFirstYearMale());
					renewDevEmploment.setFirstYearFemale(devEmploment.getFirstYearFemale());
					renewDevEmploment.setFirstYearLocal(devEmploment.getFirstYearLocal());
					renewDevEmploment.setFirstYearForeign(devEmploment.getFirstYearForeign());
					renewDevEmploment.setSecondYearDirect(devEmploment.getSecondYearDirect());
					renewDevEmploment.setSecondYearIndirect(devEmploment.getSecondYearIndirect());
					renewDevEmploment.setSecondYearMale(devEmploment.getSecondYearMale());
					renewDevEmploment.setSecondYearFemale(devEmploment.getSecondYearFemale());
					renewDevEmploment.setSecondYearLocal(devEmploment.getSecondYearLocal());
					renewDevEmploment.setSecondYearForeign(devEmploment.getSecondYearForeign());
					renewDevEmploment.setThirdYearDirect(devEmploment.getThirdYearDirect());
					renewDevEmploment.setThirdYearIndirect(devEmploment.getThirdYearIndirect());
					renewDevEmploment.setThirdYearMale(devEmploment.getThirdYearMale());
					renewDevEmploment.setThirdYearFemale(devEmploment.getThirdYearIndirect());
					renewDevEmploment.setThirdYearLocal(devEmploment.getThirdYearLocal());
					renewDevEmploment.setThirdYearForeign(devEmploment.getThirdYearForeign());
					renewDevEmploment.setSezStatusApplicationId(sezStatusRenewalApplicationId);
					SezDevEmplomentInfoLocalServiceUtil.updateSezDevEmplomentInfo(renewDevEmploment);

				 
			 }

       //Disaster Management And Emergency Plan
			 SezDevDisasterManagement disasterManagement = null;
			 SezDevDisasterManagement renewDisasterManagement = null;
			 
		 
		 try {
			 disasterManagement =SezDevDisasterManagementLocalServiceUtil.getSezById(sezStatusApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			}
		 try {
			 renewDisasterManagement = SezDevDisasterManagementLocalServiceUtil.getSezById(sezStatusApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			} 
		 
		 
		 if(disasterManagement!= null){
			 renewDisasterManagement.setDisasterManagement(disasterManagement.getDisasterManagement());
			 renewDisasterManagement.setSezStatusApplicationId(sezStatusRenewalApplicationId);
			SezDevDisasterManagementLocalServiceUtil.updateSezDevDisasterManagement(renewDisasterManagement);
		 }
		 
		 
			 
      // FIRST ADD MORE
			 
		   List<SezDevDisasterManagementAdd> disManagementAdd = null;
			 SezDevDisasterManagementAdd renewDisManagementAdd = null;
			 
			 
		try {
			disManagementAdd =SezDevDisasterManagementAddLocalServiceUtil.getSezById(sezStatusApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
		 
		 if(disManagementAdd!= null){
				for (SezDevDisasterManagementAdd sezDevDisaster : disManagementAdd) {
					renewDisManagementAdd =SezDevDisasterManagementAddLocalServiceUtil.createSezDevDisasterManagementAdd(CounterLocalServiceUtil.increment());
					renewDisManagementAdd.setDisasterMitigationPlan(sezDevDisaster.getDisasterMitigationPlan());
					renewDisManagementAdd.setCounter(sezDevDisaster.getCounter());
					renewDisManagementAdd.setSezStatusApplicationId(sezStatusRenewalApplicationId);
					SezDevDisasterManagementAddLocalServiceUtil.updateSezDevDisasterManagementAdd(renewDisManagementAdd);
					
				}	
			}	 
	 
	 //Investment and Financial Information
		 
		 
		 SezDevInvestmentAndFinancial devInvesAndFinancial = null;
		 SezDevInvestmentAndFinancial renewDevInvesAndFinancial = null;
		 
		 try {
			 devInvesAndFinancial =SezDevInvestmentAndFinancialLocalServiceUtil.getSezById(sezStatusApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			}
		 try {
			 renewDevInvesAndFinancial = SezDevInvestmentAndFinancialLocalServiceUtil.getSezById(sezStatusApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			} 
		 
		 
		 if(devInvesAndFinancial!= null){
		    renewDevInvesAndFinancial.setValueOfLand(devInvesAndFinancial.getValueOfLand());
			renewDevInvesAndFinancial.setOnSiteInfrastructure(devInvesAndFinancial.getOnSiteInfrastructure());
			renewDevInvesAndFinancial.setBuildingFactoryDevelop(devInvesAndFinancial.getBuildingFactoryDevelop());
			renewDevInvesAndFinancial.setPort(devInvesAndFinancial.getPort());
			renewDevInvesAndFinancial.setAirPort(devInvesAndFinancial.getAirPort());
			renewDevInvesAndFinancial.setOther(devInvesAndFinancial.getOther());
			renewDevInvesAndFinancial.setTotal(devInvesAndFinancial.getTotal());
			renewDevInvesAndFinancial.setTotalLocalDirector(devInvesAndFinancial.getTotalLocalDirector());
			renewDevInvesAndFinancial.setTotalForeignDirector(devInvesAndFinancial.getTotalForeignDirector());
			renewDevInvesAndFinancial.setCompanyName(devInvesAndFinancial.getCompanyName());
			renewDevInvesAndFinancial.setResisdentAddress(devInvesAndFinancial.getResisdentAddress());
			renewDevInvesAndFinancial.setSourceOfFunds(devInvesAndFinancial.getSourceOfFunds());
			renewDevInvesAndFinancial.setSezStatusApplicationId(sezStatusRenewalApplicationId);
			SezDevInvestmentAndFinancialLocalServiceUtil.updateSezDevInvestmentAndFinancial(renewDevInvesAndFinancial);
	 }
	 
	 
		 //Developer's Undertaking
		 
		 sezDeveloperUndertaking developerUndertaking = null;
		 sezDeveloperUndertaking renewdeveloperUndertaking = null;
		 
		 
		 try {
			 developerUndertaking =sezDeveloperUndertakingLocalServiceUtil.getSezById(sezStatusApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			}
		 try {
			 renewdeveloperUndertaking = sezDeveloperUndertakingLocalServiceUtil.getSezById(sezStatusApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			} 
		 
		 
		 if(developerUndertaking!= null){
			 
			 renewdeveloperUndertaking.setTitleOfApplicant(developerUndertaking.getTitleOfApplicant());
			 renewdeveloperUndertaking.setNameOfApplicant(developerUndertaking.getNameOfApplicant());
			 renewdeveloperUndertaking.setTelephoneNum(developerUndertaking.getTelephoneNum());
			 renewdeveloperUndertaking.setEmailAddress(developerUndertaking.getEmailAddress());
			 renewdeveloperUndertaking.setApplicantSignatureDate(developerUndertaking.getApplicantSignatureDate());
			 renewdeveloperUndertaking.setNameOfNotaryPublic(developerUndertaking.getNameOfNotaryPublic());
			 renewdeveloperUndertaking.setPublicNotarySignatureDate(developerUndertaking.getPublicNotarySignatureDate());		
			 renewdeveloperUndertaking.setSezStatusApplicationId(sezStatusRenewalApplicationId);
			 sezDeveloperUndertakingLocalServiceUtil.updatesezDeveloperUndertaking(renewdeveloperUndertaking);								
		 }
	 
	 
	 //  Submission Checklist
		 
		 sezSubmissionChecklist submissionChecklist = null;
		 sezSubmissionChecklist renewSubmissionChecklist = null;
		 
		 
		 try {
			 submissionChecklist =sezSubmissionChecklistLocalServiceUtil.getSezById(sezStatusApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			}
		 try {
			 renewSubmissionChecklist = sezSubmissionChecklistLocalServiceUtil.getSezById(sezStatusApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			} 
		 
		 if(submissionChecklist!= null){
			    renewSubmissionChecklist.setSelectedGeneral(submissionChecklist.getSelectedGeneral());
			    renewSubmissionChecklist.setSelectedComInfoReq(submissionChecklist.getSelectedComInfoReq());
			    renewSubmissionChecklist.setPaidShareCapProof(submissionChecklist.getPaidShareCapProof());
			    renewSubmissionChecklist.setSelectedSwornStateReq(submissionChecklist.getSelectedSwornStateReq());
				renewSubmissionChecklist.setSelectedLandOccuReq(submissionChecklist.getSelectedLandOccuReq());
				renewSubmissionChecklist.setSelectedSafetyHealthReq(submissionChecklist.getSelectedSafetyHealthReq());
				renewSubmissionChecklist.setSelectedLandDevlopmentReq(submissionChecklist.getSelectedLandDevlopmentReq());
				renewSubmissionChecklist.setSelectedTechInfoReq(submissionChecklist.getSelectedTechInfoReq());
				renewSubmissionChecklist.setSelectedSezPreliminaryReq(submissionChecklist.getSelectedSezPreliminaryReq());
				renewSubmissionChecklist.setSelectedSezDevDetailReq(submissionChecklist.getSelectedSezDevDetailReq());
				renewSubmissionChecklist.setSelectedApprovalReq(submissionChecklist.getSelectedApprovalReq());
				renewSubmissionChecklist.setNameReq(submissionChecklist.getNameReq());
				renewSubmissionChecklist.setSezStatusApplicationId(sezStatusRenewalApplicationId);
				renewSubmissionChecklist.setDateReq(submissionChecklist.getDateReq());
				sezSubmissionChecklistLocalServiceUtil.updatesezSubmissionChecklist(renewSubmissionChecklist);
			
			 
		 }
		 
		//second category-----------------------------------------------------
		 
		 //1 form
		 
		 if(sezApplication.getSezStatus().equals("SEZ Occupant")) {
		 SezOccupantGeneralBussinessInfo bussinessInfo=null;
		 SezOccupantGeneralBussinessInfo renewBussinessInfo=null;
		 
		 try {
			 bussinessInfo =SezOccupantGeneralBussinessInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			}
		 try {
			 renewBussinessInfo = SezOccupantGeneralBussinessInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			} 
		 
		 if(bussinessInfo!= null){
			 renewBussinessInfo.setOccAppDate(bussinessInfo.getOccAppDate());
			 renewBussinessInfo.setOccSezDevName(bussinessInfo.getOccSezDevName());
			 renewBussinessInfo.setOccSezDevControlNum(bussinessInfo.getOccSezDevControlNum());
			 renewBussinessInfo.setOccFormArticle(bussinessInfo.getOccFormArticle());
			 renewBussinessInfo.setOccFormArticleOther(bussinessInfo.getOccFormArticleOther());
			 renewBussinessInfo.setOccTRN(bussinessInfo.getOccTRN());
			 renewBussinessInfo.setOccGCT(bussinessInfo.getOccGCT());
			 renewBussinessInfo.setOccTCC(bussinessInfo.getOccTCC());
			 renewBussinessInfo.setSezStatusApplicationId(sezStatusRenewalApplicationId);
		     SezOccupantGeneralBussinessInfoLocalServiceUtil.updateSezOccupantGeneralBussinessInfo(renewBussinessInfo);
		 }
		 
		 SezOccupantGeneralBussinessAddress addressOfCompany=null;
		 SezOccupantGeneralBussinessAddress renewAddressOfCompany=null;
		 
		 try {
			 addressOfCompany =SezOccupantGeneralBussinessAddressLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			}
		 try {
			 renewAddressOfCompany = SezOccupantGeneralBussinessAddressLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			} 
		 
		 if(addressOfCompany!=null) {
			    renewAddressOfCompany.setOccName(addressOfCompany.getOccName());
		        renewAddressOfCompany.setOccStreetAddress(addressOfCompany.getOccStreetAddress());
		        renewAddressOfCompany.setOccTown(addressOfCompany.getOccTown());
		        renewAddressOfCompany.setOccParish(addressOfCompany.getOccParish());
		        renewAddressOfCompany.setSezStatusApplicationId(sezStatusRenewalApplicationId);
		        renewAddressOfCompany.setSezOccGenBussId(renewBussinessInfo.getSezOccGenBussId());
		        SezOccupantGeneralBussinessAddressLocalServiceUtil.updateSezOccupantGeneralBussinessAddress(renewAddressOfCompany);
		 }
	       
		 
	        SezOccupantGeneralBussinessAddress addressOfAuthorisedRepresentative=null;
	        SezOccupantGeneralBussinessAddress renewAddressOfAuthorisedRepresentative=null;
	        
	        try {
	        	addressOfAuthorisedRepresentative =SezOccupantGeneralBussinessAddressLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
			 try {
				 renewAddressOfAuthorisedRepresentative = SezOccupantGeneralBussinessAddressLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
		 
		 
		 if(addressOfAuthorisedRepresentative!=null) {
			 
			    renewAddressOfAuthorisedRepresentative.setOccName(addressOfAuthorisedRepresentative.getOccName());
		        renewAddressOfAuthorisedRepresentative.setOccStreetAddress(addressOfAuthorisedRepresentative.getOccStreetAddress());
		        renewAddressOfAuthorisedRepresentative.setOccTown(addressOfAuthorisedRepresentative.getOccTown());
		        renewAddressOfAuthorisedRepresentative.setOccParish(addressOfAuthorisedRepresentative.getOccParish());
		        renewAddressOfAuthorisedRepresentative.setOccCountry(addressOfAuthorisedRepresentative.getOccCountry());
		        renewAddressOfAuthorisedRepresentative.setSezStatusApplicationId(sezStatusRenewalApplicationId);
		        renewAddressOfAuthorisedRepresentative.setSezOccGenBussId(renewBussinessInfo.getSezOccGenBussId());
		        SezOccupantGeneralBussinessAddressLocalServiceUtil.updateSezOccupantGeneralBussinessAddress(renewAddressOfAuthorisedRepresentative);
		 }
		 
		 
		 SezOccupantGeneralBussinessAddress adddressSponsorOrRegisteredHeadOffice=null;
		 SezOccupantGeneralBussinessAddress renewAdddressSponsorOrRegisteredHeadOffice=null;
		 
		 try {
			 adddressSponsorOrRegisteredHeadOffice =SezOccupantGeneralBussinessAddressLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
			 try {
				 renewAdddressSponsorOrRegisteredHeadOffice = SezOccupantGeneralBussinessAddressLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
		 
		 
		 if(adddressSponsorOrRegisteredHeadOffice!=null) {
			 renewAdddressSponsorOrRegisteredHeadOffice.setOccName(adddressSponsorOrRegisteredHeadOffice.getOccName());
			 renewAdddressSponsorOrRegisteredHeadOffice.setOccStreetAddress(adddressSponsorOrRegisteredHeadOffice.getOccStreetAddress());
			 renewAdddressSponsorOrRegisteredHeadOffice.setOccTown(adddressSponsorOrRegisteredHeadOffice.getOccTown());
			 renewAdddressSponsorOrRegisteredHeadOffice.setOccParish(adddressSponsorOrRegisteredHeadOffice.getOccParish());
			 renewAdddressSponsorOrRegisteredHeadOffice.setOccCountry(adddressSponsorOrRegisteredHeadOffice.getOccCountry());
			 renewAdddressSponsorOrRegisteredHeadOffice.setSezStatusApplicationId(sezStatusRenewalApplicationId);
		     renewAdddressSponsorOrRegisteredHeadOffice.setSezOccGenBussId(renewBussinessInfo.getSezOccGenBussId());
		     SezOccupantGeneralBussinessAddressLocalServiceUtil.updateSezOccupantGeneralBussinessAddress(renewAdddressSponsorOrRegisteredHeadOffice);
		 }
		 
		 
		 //Shareholding / Partnership / Director Information 2 form
		 SezOccupantShareHoldingInfo shareHoldingInfo = null;
		 SezOccupantShareHoldingInfo renewShareHoldingInfo = null;
		 
		 
		 try {
			 shareHoldingInfo =SezOccupantShareHoldingInfoLocalServiceUtil.getSezStatusBy_App_Id(sezStatusApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
			 try {
				 renewShareHoldingInfo =SezOccupantShareHoldingInfoLocalServiceUtil.getSezStatusBy_App_Id(sezStatusApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
		 
		 
		 if(shareHoldingInfo!=null) {
			 
			 renewShareHoldingInfo.setOccAuthorised(shareHoldingInfo.getOccAuthorised());
			 renewShareHoldingInfo.setOccSubscribed(shareHoldingInfo.getOccSubscribed());
			 renewShareHoldingInfo.setOccPaidCapital(shareHoldingInfo.getOccPaidCapital());
			 renewShareHoldingInfo.setSezStatusApplicationId(sezStatusRenewalApplicationId);
			 SezOccupantShareHoldingInfoLocalServiceUtil.updateSezOccupantShareHoldingInfo(renewShareHoldingInfo);
		 }
		 
		 //add more first
		 List<SezOccupantDirectorPartnerSponsorInfo> directorPartnerSponsorInfo = null;
		 SezOccupantDirectorPartnerSponsorInfo renewDirectorPartnerSponsorInfo = null;
		 
		 
	try {
		directorPartnerSponsorInfo =SezOccupantDirectorPartnerSponsorInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			}
	 
	 if(directorPartnerSponsorInfo!= null){
			for (SezOccupantDirectorPartnerSponsorInfo directorPartner : directorPartnerSponsorInfo) {
				renewDirectorPartnerSponsorInfo =SezOccupantDirectorPartnerSponsorInfoLocalServiceUtil.createSezOccupantDirectorPartnerSponsorInfo(CounterLocalServiceUtil.increment());	
				renewDirectorPartnerSponsorInfo.setOccDirectorName(directorPartner.getOccDirectorName());
				renewDirectorPartnerSponsorInfo.setOccDirectorStreetAddress(directorPartner.getOccDirectorStreetAddress());
				renewDirectorPartnerSponsorInfo.setOccDirectorZipCode(directorPartner.getOccDirectorZipCode());
				renewDirectorPartnerSponsorInfo.setOccDirectorCountry(directorPartner.getOccDirectorCountry());
				renewDirectorPartnerSponsorInfo.setCounter(directorPartner.getCounter());
				renewDirectorPartnerSponsorInfo.setSezStatusApplicationId(sezStatusRenewalApplicationId);
			    SezOccupantDirectorPartnerSponsorInfoLocalServiceUtil.updateSezOccupantDirectorPartnerSponsorInfo(renewDirectorPartnerSponsorInfo);
			}	
		}	 
		 
		 
	 
	// add more second 
	 
	List<SezOccupantPrincipleDirector> principleDirector = null;
	 SezOccupantPrincipleDirector renewPrincipleDirector = null;
	 
	 try {
		 principleDirector =SezOccupantPrincipleDirectorLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			}
		
	 if(principleDirector!= null){
			for (SezOccupantPrincipleDirector directorPartner : principleDirector) {
				renewPrincipleDirector = SezOccupantPrincipleDirectorLocalServiceUtil.createSezOccupantPrincipleDirector(CounterLocalServiceUtil.increment());
				renewPrincipleDirector.setOccShareholderName(directorPartner.getOccShareholderName());
				renewPrincipleDirector.setOccShareholderNation(directorPartner.getOccShareholderNation());
				renewPrincipleDirector.setOccShareholderShares(directorPartner.getOccShareholderShares());
				renewPrincipleDirector.setOccShareholderCounter(directorPartner.getOccShareholderCounter());
				renewPrincipleDirector.setSezStatusApplicationId(sezStatusRenewalApplicationId);
				SezOccupantPrincipleDirectorLocalServiceUtil.updateSezOccupantPrincipleDirector(renewPrincipleDirector);
			}	
		}	 
		 
	 //add more third
	 
	List<SezOccupantPrincipleOfficer> occupantPrincipleOfficer=null;
	 SezOccupantPrincipleOfficer renewOccupantPrincipleOfficer=null;
	 
	 try { 
		 occupantPrincipleOfficer =SezOccupantPrincipleOfficerLocalServiceUtil.getPrincipleOfficerById(sezStatusApplicationId);
		}catch (Exception e) {
			_log.error("Error****************" + e.getMessage());
		}
	 
	 
	 if(occupantPrincipleOfficer!= null){
			for (SezOccupantPrincipleOfficer occupantPrincipal : occupantPrincipleOfficer) {
				renewOccupantPrincipleOfficer= SezOccupantPrincipleOfficerLocalServiceUtil.createSezOccupantPrincipleOfficer(CounterLocalServiceUtil.increment());
				renewOccupantPrincipleOfficer.setName(occupantPrincipal.getName());
				renewOccupantPrincipleOfficer.setPosition(occupantPrincipal.getPosition());
				renewOccupantPrincipleOfficer.setSezStatusApplicationId(sezStatusRenewalApplicationId);
				renewOccupantPrincipleOfficer.setPrinciplOfficerCounter(occupantPrincipal.getPrinciplOfficerCounter());
				SezOccupantPrincipleOfficerLocalServiceUtil.updateSezOccupantPrincipleOfficer(renewOccupantPrincipleOfficer);
			}	
		}	 
		 
	 
	 //form 3
	 
	 SezOccupantExistingProposedProjectBriefInfo briefInfo=null;
	 SezOccupantExistingProposedProjectBriefInfo renewBriefInfo=null;
	 
	 try {
		 briefInfo =SezOccupantExistingProposedProjectBriefInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			}
		 try {
			 renewBriefInfo =SezOccupantExistingProposedProjectBriefInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			}
	 
	 
	 if(briefInfo!=null) {
		    renewBriefInfo.setOccBusinessDesc(briefInfo.getOccBusinessDesc());
	        renewBriefInfo.setOccDeniedFreeZoneAppr(briefInfo.getOccDeniedFreeZoneAppr());
	        renewBriefInfo.setOccDeniedFreeZoneApprDate(briefInfo.getOccDeniedFreeZoneApprDate());
	        renewBriefInfo.setOccDeniedFreeZoneApprType(briefInfo.getOccDeniedFreeZoneApprType());
	        renewBriefInfo.setOccFreeZoneLocation(briefInfo.getOccFreeZoneLocation());
	        renewBriefInfo.setOccSubConcessionBuilding(briefInfo.getOccSubConcessionBuilding());
	        renewBriefInfo.setOccSubConcessionTown(briefInfo.getOccSubConcessionTown());
	        renewBriefInfo.setOccSubConcessionParish(briefInfo.getOccSubConcessionParish());
	        renewBriefInfo.setOccCompleteSurveyTechDesc(briefInfo.getOccCompleteSurveyTechDesc());
	        renewBriefInfo.setOccNorthBoundaries(briefInfo.getOccNorthBoundaries());
	        renewBriefInfo.setOccEastBoundaries(briefInfo.getOccEastBoundaries());
	        renewBriefInfo.setOccWestBoundaries(briefInfo.getOccWestBoundaries());
	        renewBriefInfo.setOccSouthBoundaries(briefInfo.getOccSouthBoundaries());
	        renewBriefInfo.setOccOwnership(briefInfo.getOccOwnership());
	        renewBriefInfo.setOccLeaseYears(briefInfo.getOccLeaseYears());
	        renewBriefInfo.setOccVolume(briefInfo.getOccVolume());
	        renewBriefInfo.setOccFolio(briefInfo.getOccFolio());
	        renewBriefInfo.setOccFloorNum(briefInfo.getOccFloorNum());
	        renewBriefInfo.setOccUndertakenService(briefInfo.getOccUndertakenService());
	        renewBriefInfo.setOccUndertakenManufacturing(briefInfo.getOccUndertakenManufacturing());
	        renewBriefInfo.setOccSeaPortDistanceKM(briefInfo.getOccSeaPortDistanceKM());
	        renewBriefInfo.setOccSeaPortDistanceMI(briefInfo.getOccSeaPortDistanceMI());
	        renewBriefInfo.setOccAirportDistanceKM(briefInfo.getOccAirportDistanceKM());
	        renewBriefInfo.setOccAirportDistanceMI(briefInfo.getOccAirportDistanceMI());
	        renewBriefInfo.setOccRoadDistanceKM(briefInfo.getOccRoadDistanceKM());
	        renewBriefInfo.setOccRoadDistanceMI(briefInfo.getOccRoadDistanceMI());
	        renewBriefInfo.setOccRailDistanceKM(briefInfo.getOccRailDistanceKM());
	        renewBriefInfo.setOccRailDistanceMI(briefInfo.getOccRailDistanceMI());
	        renewBriefInfo.setOccCustomDistanceKM(briefInfo.getOccCustomDistanceKM());
	        renewBriefInfo.setOccCustomDistanceMI(briefInfo.getOccCustomDistanceMI());
	        renewBriefInfo.setSezStatusApplicationId(sezStatusRenewalApplicationId);
	        SezOccupantExistingProposedProjectBriefInfoLocalServiceUtil.updateSezOccupantExistingProposedProjectBriefInfo(renewBriefInfo);
		 	 
	 }
	 
	 // add more first form 3
	 
	 
	List<SezOccLocationAdd> sezOccLocationAdd = null;
	 SezOccLocationAdd renewSezOccLocationAdd = null;
	 
	  try { 
		  sezOccLocationAdd =SezOccLocationAddLocalServiceUtil.getSezById(sezStatusApplicationId);
 		}catch (Exception e) {
 			_log.error("Error****************" + e.getMessage());
 		}
 	 
 	 
 	 if(sezOccLocationAdd!= null){
 			for (SezOccLocationAdd OccLocation : sezOccLocationAdd) {
 				renewSezOccLocationAdd = SezOccLocationAddLocalServiceUtil.createSezOccLocationAdd(CounterLocalServiceUtil.increment());
 				renewSezOccLocationAdd.setCounter(OccLocation.getCounter());
 				renewSezOccLocationAdd.setDeveloperLocation(OccLocation.getDeveloperLocation());
 				renewSezOccLocationAdd.setDeveloperLocationDescription(OccLocation.getDeveloperLocationDescription());
 				renewSezOccLocationAdd.setSezStatusApplicationId(sezStatusRenewalApplicationId);
 				SezOccLocationAddLocalServiceUtil.updateSezOccLocationAdd(renewSezOccLocationAdd);
 			}	
 		}	
	 //form four
	 SezOccupantProposedAreaDevelopmentPlanInfo areaDevelopmentPlanInfo = null;
	 SezOccupantProposedAreaDevelopmentPlanInfo renewAreaDevelopmentPlanInfo = null;
	 try {
		 areaDevelopmentPlanInfo =SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			}
		 try {
			 renewAreaDevelopmentPlanInfo =SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			}
	 if(areaDevelopmentPlanInfo!=null) {
		   renewAreaDevelopmentPlanInfo.setOccProcessingArea(areaDevelopmentPlanInfo.getOccProcessingArea());
		   renewAreaDevelopmentPlanInfo.setOccNonProcessingArea(areaDevelopmentPlanInfo.getOccNonProcessingArea());
		   renewAreaDevelopmentPlanInfo.setOccOfficeRequirement(areaDevelopmentPlanInfo.getOccOfficeRequirement());
		   renewAreaDevelopmentPlanInfo.setOccFactoryRequirement(areaDevelopmentPlanInfo.getOccFactoryRequirement());
		   renewAreaDevelopmentPlanInfo.setOtherBuildUpRequirement(areaDevelopmentPlanInfo.getOtherBuildUpRequirement());
		   renewAreaDevelopmentPlanInfo.setOccOtherAreaReqName(areaDevelopmentPlanInfo.getOccOtherAreaReqName());
		   renewAreaDevelopmentPlanInfo.setOccOtherAreaRequirement(areaDevelopmentPlanInfo.getOccOtherAreaRequirement());
		   renewAreaDevelopmentPlanInfo.setSezStatusApplicationId(sezStatusRenewalApplicationId);
		   SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceUtil.updateSezOccupantProposedAreaDevelopmentPlanInfo(renewAreaDevelopmentPlanInfo);
	 }
	 //form 5
	   SezOccupantInvestAndFinanceInfo investAndFinanceInfo =null;
	   SezOccupantInvestAndFinanceInfo renewInvestAndFinanceInfo =null;
	   try {
		   investAndFinanceInfo =SezOccupantInvestAndFinanceInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
			 try {
				 renewInvestAndFinanceInfo =SezOccupantInvestAndFinanceInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
	     if(investAndFinanceInfo!=null) {
			    renewInvestAndFinanceInfo.setOccInfraBuilding(investAndFinanceInfo.getOccInfraBuilding());
		        renewInvestAndFinanceInfo.setOccInfraEquipment(investAndFinanceInfo.getOccInfraEquipment());
		        renewInvestAndFinanceInfo.setOccInfraMachines(investAndFinanceInfo.getOccInfraMachines());
		        renewInvestAndFinanceInfo.setOccInfraTotal(investAndFinanceInfo.getOccInfraTotal());
		        renewInvestAndFinanceInfo.setSezStatusApplicationId(sezStatusRenewalApplicationId);
		        renewInvestAndFinanceInfo.setOccInfraFinanceSource(investAndFinanceInfo.getOccInfraFinanceSource());
		        SezOccupantInvestAndFinanceInfoLocalServiceUtil.updateSezOccupantInvestAndFinanceInfo(renewInvestAndFinanceInfo);
	 
	     }
	 //form 6 ADD  MORE
	 List<SezOccupantEmploymentInfo> employmentInfo=null;
	  SezOccupantEmploymentInfo renewEmploymentInfo=null;
	  try { 
		  employmentInfo =SezOccupantEmploymentInfoLocalServiceUtil.getSezStatusBy_ID(sezStatusApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			}
		 if(employmentInfo!= null){
			 for (SezOccupantEmploymentInfo sezOccupant : employmentInfo) {
					renewEmploymentInfo = SezOccupantEmploymentInfoLocalServiceUtil.createSezOccupantEmploymentInfo(CounterLocalServiceUtil.increment());
					renewEmploymentInfo.setOccEmpCounter(sezOccupant.getOccEmpCounter());
					renewEmploymentInfo.setOccLabourYear(sezOccupant.getOccLabourYear());
					renewEmploymentInfo.setOccLabourDirect(sezOccupant.getOccLabourDirect());
					renewEmploymentInfo.setOccLabourMale(sezOccupant.getOccLabourMale());
					renewEmploymentInfo.setOccLabourFemale(sezOccupant.getOccLabourFemale());
					renewEmploymentInfo.setOccLabourLocal(sezOccupant.getOccLabourLocal());
					renewEmploymentInfo.setOccLabourForeign(sezOccupant.getOccLabourForeign());
		            renewEmploymentInfo.setSezStatusApplicationId(sezStatusRenewalApplicationId);
		            SezOccupantEmploymentInfoLocalServiceUtil.updateSezOccupantEmploymentInfo(renewEmploymentInfo);
			}	 
		 }
		 //form 7
		 SezOccupantUserUndertakingInfo occupantUserUndertakingInfo=null;
		 SezOccupantUserUndertakingInfo renewOccupantUserUndertakingInfo=null;
		 try {
			 occupantUserUndertakingInfo =SezOccupantUserUndertakingInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
			 try {
				 renewOccupantUserUndertakingInfo =SezOccupantUserUndertakingInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
		 if(occupantUserUndertakingInfo!=null) {
			    renewOccupantUserUndertakingInfo.setOccApplicantTitle(occupantUserUndertakingInfo.getOccApplicantTitle());
		        renewOccupantUserUndertakingInfo.setOccApplicantName(occupantUserUndertakingInfo.getOccApplicantName());
		        renewOccupantUserUndertakingInfo.setOccApplicantTeleNum(occupantUserUndertakingInfo.getOccApplicantTeleNum());
		        renewOccupantUserUndertakingInfo.setOccApplicantEmail(occupantUserUndertakingInfo.getOccApplicantEmail());
		        renewOccupantUserUndertakingInfo.setSezStatusApplicationId(sezStatusRenewalApplicationId);
			    renewOccupantUserUndertakingInfo.setOccApplicantSignDate(occupantUserUndertakingInfo.getOccApplicantSignDate());
		        renewOccupantUserUndertakingInfo.setOccPublicNotaryName(occupantUserUndertakingInfo.getOccPublicNotaryName());
			    renewOccupantUserUndertakingInfo.setOccPublicNotarySignDate(occupantUserUndertakingInfo.getOccPublicNotarySignDate());
		        SezOccupantUserUndertakingInfoLocalServiceUtil.updateSezOccupantUserUndertakingInfo(renewOccupantUserUndertakingInfo);
		 }
	//form 8
		 SezOccupanteDeveloperUndertakingInfo developerUndertakingInfo=null;
		 SezOccupanteDeveloperUndertakingInfo renewDeveloperUndertakingInfo=null;
		 try {
			 developerUndertakingInfo =SezOccupanteDeveloperUndertakingInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
			 try {
				 renewDeveloperUndertakingInfo =SezOccupanteDeveloperUndertakingInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
		 if(developerUndertakingInfo!=null) { 
		  renewDeveloperUndertakingInfo.setOccUndertakingDevName(developerUndertakingInfo.getOccUndertakingDevName());
		  renewDeveloperUndertakingInfo.setOccUndertakingApprLetter(developerUndertakingInfo.getOccUndertakingApprLetter());
		  renewDeveloperUndertakingInfo.setOccUndertakingDate(developerUndertakingInfo.getOccUndertakingDate());
		  renewDeveloperUndertakingInfo.setOccUndertakingAgreeNum(developerUndertakingInfo.getOccUndertakingAgreeNum());
		  renewDeveloperUndertakingInfo.setOccUndertakingAgreeDate(developerUndertakingInfo.getOccUndertakingAgreeDate());
		  renewDeveloperUndertakingInfo.setOccUndertakingControlNum(developerUndertakingInfo.getOccUndertakingControlNum());
		  renewDeveloperUndertakingInfo.setOccDevApplicantTitle(developerUndertakingInfo.getOccDevApplicantTitle());
		  renewDeveloperUndertakingInfo.setOccDevApplicantName(developerUndertakingInfo.getOccDevApplicantName());
		  renewDeveloperUndertakingInfo.setOccDevApplicantTele(developerUndertakingInfo.getOccDevApplicantTele());
		  renewDeveloperUndertakingInfo.setOccDevApplicantEmail(developerUndertakingInfo.getOccDevApplicantEmail());
		  renewDeveloperUndertakingInfo.setOccDevApplicantSignDate(developerUndertakingInfo.getOccDevApplicantSignDate());
		  renewDeveloperUndertakingInfo.setOccDevPublicNotaryName(developerUndertakingInfo.getOccDevPublicNotaryName());
		  renewDeveloperUndertakingInfo.setOccDevPublicNotarySignDate(developerUndertakingInfo.getOccDevPublicNotarySignDate());
		  renewDeveloperUndertakingInfo.setSezStatusApplicationId(sezStatusRenewalApplicationId);
		  SezOccupanteDeveloperUndertakingInfoLocalServiceUtil.updateSezOccupanteDeveloperUndertakingInfo(renewDeveloperUndertakingInfo);
		 }
	//form 9
		 SezOccupanteSubmissionChecklistInfo submissionChecklistInfo = null;
		 SezOccupanteSubmissionChecklistInfo renewSubmissionChecklistInfo = null;
		 try {
			 submissionChecklistInfo =SezOccupanteSubmissionChecklistInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
			 try {
				 renewSubmissionChecklistInfo =SezOccupanteSubmissionChecklistInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
			 if(submissionChecklistInfo!=null) { 
				    renewSubmissionChecklistInfo.setOccNameReq(submissionChecklistInfo.getOccNameReq());
					renewSubmissionChecklistInfo.setOccDateReq(submissionChecklistInfo.getOccDateReq());
					renewSubmissionChecklistInfo.setOccGeneral(submissionChecklistInfo.getOccGeneral());
					renewSubmissionChecklistInfo.setOccComInfoRequest(submissionChecklistInfo.getOccComInfoRequest());
					renewSubmissionChecklistInfo.setOccSwanStateRequest(submissionChecklistInfo.getOccSwanStateRequest());
					renewSubmissionChecklistInfo.setOccSelectedRequest(submissionChecklistInfo.getOccSelectedRequest());
					renewSubmissionChecklistInfo.setOccSelectedFacilityRequest(submissionChecklistInfo.getOccSelectedFacilityRequest());
					renewSubmissionChecklistInfo.setOccSelectedApprovals(submissionChecklistInfo.getOccSelectedApprovals());
					renewSubmissionChecklistInfo.setOccSelectedSecurityRequest(submissionChecklistInfo.getOccSelectedSecurityRequest());
					renewSubmissionChecklistInfo.setOccSelectedSDetailedBussiness(submissionChecklistInfo.getOccSelectedSDetailedBussiness());
					renewSubmissionChecklistInfo.setOccPaidShareCapProof(submissionChecklistInfo.getOccPaidShareCapProof());
					renewSubmissionChecklistInfo.setSezStatusApplicationId(sezStatusRenewalApplicationId);
					SezOccupanteSubmissionChecklistInfoLocalServiceUtil.updateSezOccupanteSubmissionChecklistInfo(renewSubmissionChecklistInfo);
			 }
		 }
		 //THIRD CATEGORY
		 //form 1
		 if(sezApplication.getSezStatus().equals("SEZ Zone User")) {
		 SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo = null;
		 SezZoneGeneralBusinessInfo renewSezZoneGeneralBusinessInfo = null;
		 try {
			 sezZoneGeneralBusinessInfo =SezZoneGeneralBusinessInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
			 try {
				 renewSezZoneGeneralBusinessInfo =SezZoneGeneralBusinessInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
		        if(sezZoneGeneralBusinessInfo!=null) {
			        renewSezZoneGeneralBusinessInfo.setApplicationDate(sezZoneGeneralBusinessInfo.getApplicationDate());
					renewSezZoneGeneralBusinessInfo.setDeveloperName(sezZoneGeneralBusinessInfo.getDeveloperName());
					renewSezZoneGeneralBusinessInfo.setLocationName(sezZoneGeneralBusinessInfo.getLocationName());
					renewSezZoneGeneralBusinessInfo.setControlNum(sezZoneGeneralBusinessInfo.getControlNum());
					renewSezZoneGeneralBusinessInfo.setExistingCompany(sezZoneGeneralBusinessInfo.getExistingCompany());
					renewSezZoneGeneralBusinessInfo.setArticleForm(sezZoneGeneralBusinessInfo.getArticleForm());
					renewSezZoneGeneralBusinessInfo.setOtherArticleForm(sezZoneGeneralBusinessInfo.getOtherArticleForm());
					renewSezZoneGeneralBusinessInfo.setNonResidentCom(sezZoneGeneralBusinessInfo.getNonResidentCom());
					renewSezZoneGeneralBusinessInfo.setTaxRegisNum(sezZoneGeneralBusinessInfo.getTaxRegisNum());
					renewSezZoneGeneralBusinessInfo.setGenConsumptionNum(sezZoneGeneralBusinessInfo.getGenConsumptionNum());
					renewSezZoneGeneralBusinessInfo.setTaxComplianceCertificateNum(sezZoneGeneralBusinessInfo.getTaxComplianceCertificateNum());
					renewSezZoneGeneralBusinessInfo.setSezStatusApplicationId(sezStatusRenewalApplicationId);
					SezZoneGeneralBusinessInfoLocalServiceUtil.updateSezZoneGeneralBusinessInfo(renewSezZoneGeneralBusinessInfo);
		 }
		        SezZoneGeneralBussinessAddress addressOfCompany = null;
		        SezZoneGeneralBussinessAddress renewZoneAddressOfCompany = null;
		        try {
		        	addressOfCompany =SezZoneGeneralBussinessAddressLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
						}catch (Exception e) {
							_log.error("Error****************" + e.getMessage());
						}
					 try {
						 renewZoneAddressOfCompany =SezZoneGeneralBussinessAddressLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
						}catch (Exception e) {
							_log.error("Error****************" + e.getMessage());
						}			 
		   if(addressOfCompany!=null) {
				renewZoneAddressOfCompany.setZoneName(addressOfCompany.getZoneName());
				renewZoneAddressOfCompany.setZoneStreetAddress(addressOfCompany.getZoneStreetAddress());
				renewZoneAddressOfCompany.setZoneTown(addressOfCompany.getZoneTown());
				renewZoneAddressOfCompany.setZoneParish(addressOfCompany.getZoneParish());
				renewZoneAddressOfCompany.setSezStatusApplicationId(sezStatusRenewalApplicationId);
				renewZoneAddressOfCompany.setSezZoneGeneralBusinessInfoId(renewSezZoneGeneralBusinessInfo.getSezZoneGeneralBusinessInfoId());
				SezZoneGeneralBussinessAddressLocalServiceUtil.updateSezZoneGeneralBussinessAddress(renewZoneAddressOfCompany);
		   }
		   SezZoneGeneralBussinessAddress addressOfAuthorisedRepresentative = null;
		   SezZoneGeneralBussinessAddress renewZoneAddressOfAuthorisedRepresentative = null;
	        try {
	        	addressOfAuthorisedRepresentative =SezZoneGeneralBussinessAddressLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
					}catch (Exception e) {
						_log.error("Error****************" + e.getMessage());
					}
				 try {
					 renewZoneAddressOfAuthorisedRepresentative =SezZoneGeneralBussinessAddressLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
					}catch (Exception e) {
						_log.error("Error****************" + e.getMessage());
					}			 
	   if(addressOfAuthorisedRepresentative!=null) {
		    renewZoneAddressOfAuthorisedRepresentative.setZoneName(addressOfAuthorisedRepresentative.getZoneName());
			renewZoneAddressOfAuthorisedRepresentative.setZoneStreetAddress(addressOfAuthorisedRepresentative.getZoneStreetAddress());
			renewZoneAddressOfAuthorisedRepresentative.setZoneTown(addressOfAuthorisedRepresentative.getZoneTown());
			renewZoneAddressOfAuthorisedRepresentative.setZoneParish(addressOfAuthorisedRepresentative.getZoneParish());
			renewZoneAddressOfAuthorisedRepresentative.setZoneCountry(addressOfAuthorisedRepresentative.getZoneCountry());
			renewZoneAddressOfAuthorisedRepresentative.setSezStatusApplicationId(sezStatusRenewalApplicationId);
			renewZoneAddressOfAuthorisedRepresentative.setSezZoneGeneralBusinessInfoId(renewSezZoneGeneralBusinessInfo.getSezZoneGeneralBusinessInfoId());
			SezZoneGeneralBussinessAddressLocalServiceUtil.updateSezZoneGeneralBussinessAddress(renewZoneAddressOfAuthorisedRepresentative);
	   }
	   SezZoneGeneralBussinessAddress adddressSponsorOrRegisteredHeadOffice = null;
	   SezZoneGeneralBussinessAddress renewZoneAddressSponsorOrRegisteredHeadOffice = null;
	   try {
		   adddressSponsorOrRegisteredHeadOffice =SezZoneGeneralBussinessAddressLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
			 try {
				 renewZoneAddressSponsorOrRegisteredHeadOffice =SezZoneGeneralBussinessAddressLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}			 
			  if(adddressSponsorOrRegisteredHeadOffice!=null) {
				    renewZoneAddressSponsorOrRegisteredHeadOffice.setZoneName(adddressSponsorOrRegisteredHeadOffice.getZoneName());
					renewZoneAddressSponsorOrRegisteredHeadOffice.setZoneStreetAddress(adddressSponsorOrRegisteredHeadOffice.getZoneStreetAddress());
					renewZoneAddressSponsorOrRegisteredHeadOffice.setZoneTown(adddressSponsorOrRegisteredHeadOffice.getZoneTown());
					renewZoneAddressSponsorOrRegisteredHeadOffice.setZoneParish(adddressSponsorOrRegisteredHeadOffice.getZoneParish());
					renewZoneAddressSponsorOrRegisteredHeadOffice.setZoneCountry(adddressSponsorOrRegisteredHeadOffice.getZoneCountry());
					renewZoneAddressSponsorOrRegisteredHeadOffice.setSezStatusApplicationId(sezStatusRenewalApplicationId);
					renewZoneAddressSponsorOrRegisteredHeadOffice.setSezZoneGeneralBusinessInfoId(renewSezZoneGeneralBusinessInfo.getSezZoneGeneralBusinessInfoId());
					SezZoneGeneralBussinessAddressLocalServiceUtil.updateSezZoneGeneralBussinessAddress(renewZoneAddressSponsorOrRegisteredHeadOffice);
			  }
		 //form 2
				SezZoneProposedProjectInfo sezZoneProposedProjectInfo = null;
				SezZoneProposedProjectInfo renewSezZoneProposedProjectInfo = null;
		 try {
			 sezZoneProposedProjectInfo =SezZoneProposedProjectInfoLocalServiceUtil.getSezStatusById(sezStatusApplicationId);
					}catch (Exception e) {
						_log.error("Error****************" + e.getMessage());
					}
				 try {
					 renewSezZoneProposedProjectInfo =SezZoneProposedProjectInfoLocalServiceUtil.getSezStatusById(sezStatusApplicationId);
					}catch (Exception e) {
						_log.error("Error****************" + e.getMessage());
					}			 
 
         if(sezZoneProposedProjectInfo!=null) {
        	    renewSezZoneProposedProjectInfo.setEntityDeniedApproval(sezZoneProposedProjectInfo.getEntityDeniedApproval());    	 
			    renewSezZoneProposedProjectInfo.setDeniedApprovalDate(sezZoneProposedProjectInfo.getDeniedApprovalDate());
			 	renewSezZoneProposedProjectInfo.setDeniedApprovalProjectType(sezZoneProposedProjectInfo.getDeniedApprovalProjectType());
			 	renewSezZoneProposedProjectInfo.setFreeZoneLocation(sezZoneProposedProjectInfo.getFreeZoneLocation());
			 	renewSezZoneProposedProjectInfo.setLeasedBuildingNum(sezZoneProposedProjectInfo.getLeasedBuildingNum());
			 	renewSezZoneProposedProjectInfo.setLeasedTown(sezZoneProposedProjectInfo.getLeasedTown());
			 	renewSezZoneProposedProjectInfo.setLeasedParish(sezZoneProposedProjectInfo.getLeasedParish());
			 	renewSezZoneProposedProjectInfo.setLeaseYears(sezZoneProposedProjectInfo.getLeaseYears());
			 	renewSezZoneProposedProjectInfo.setVolume(sezZoneProposedProjectInfo.getVolume());
			 	renewSezZoneProposedProjectInfo.setFolio(sezZoneProposedProjectInfo.getFolio());
			 	renewSezZoneProposedProjectInfo.setFloorNum(sezZoneProposedProjectInfo.getFloorNum());
			 	renewSezZoneProposedProjectInfo.setSezStatusApplicationId(sezStatusRenewalApplicationId);
			 	SezZoneProposedProjectInfoLocalServiceUtil.updateSezZoneProposedProjectInfo(renewSezZoneProposedProjectInfo);
         }
    // form 2 add more 1st
         List<SezZoneLocationAdd> sezZoneLocationAdd = null;
         SezZoneLocationAdd renewSezZoneLocationAdd = null;
         try { 
        	 sezZoneLocationAdd =SezZoneLocationAddLocalServiceUtil.getSezById(sezStatusApplicationId);
    		}catch (Exception e) {
    			_log.error("Error****************" + e.getMessage());
    		}
    	 if(sezZoneLocationAdd!= null){
    			for (SezZoneLocationAdd zoneLocation : sezZoneLocationAdd) {
    				renewSezZoneLocationAdd = SezZoneLocationAddLocalServiceUtil.createSezZoneLocationAdd(CounterLocalServiceUtil.increment());
    				renewSezZoneLocationAdd.setCounter(zoneLocation.getCounter());
    			    renewSezZoneLocationAdd.setDeveloperLocation(zoneLocation.getDeveloperLocation());
    			    renewSezZoneLocationAdd.setDeveloperLocationDescription(zoneLocation.getDeveloperLocationDescription());
    			    renewSezZoneLocationAdd.setSezStatusApplicationId(sezStatusRenewalApplicationId);
    			    SezZoneLocationAddLocalServiceUtil.updateSezZoneLocationAdd(renewSezZoneLocationAdd);
    			}	
    		}	 
    	 //form 3
    	 SezZoneFinancialInfo sezZoneFinancialInfo = null;
    	 SezZoneFinancialInfo renewSezZoneFinancialInfo = null;
    	 try {
    		 sezZoneFinancialInfo = SezZoneFinancialInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
					}catch (Exception e) {
						_log.error("Error****************" + e.getMessage());
					}
				 try {
					 renewSezZoneFinancialInfo =SezZoneFinancialInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
					}catch (Exception e) {
						_log.error("Error****************" + e.getMessage());
					}			 
		   if(sezZoneFinancialInfo!=null) {
			    renewSezZoneFinancialInfo.setBuildingInfrastructure(sezZoneFinancialInfo.getBuildingInfrastructure());
				renewSezZoneFinancialInfo.setEquipmentInfrastructure(sezZoneFinancialInfo.getEquipmentInfrastructure());
				renewSezZoneFinancialInfo.setMachinesInfrastructure(sezZoneFinancialInfo.getMachinesInfrastructure());
				renewSezZoneFinancialInfo.setTotalInfrastructure(sezZoneFinancialInfo.getTotalInfrastructure());
				renewSezZoneFinancialInfo.setFinanceSource(sezZoneFinancialInfo.getFinanceSource());
				renewSezZoneFinancialInfo.setOtherFinanceSource(sezZoneFinancialInfo.getOtherFinanceSource());
				renewSezZoneFinancialInfo.setSezStatusApplicationId(sezStatusRenewalApplicationId);
				SezZoneFinancialInfoLocalServiceUtil.updateSezZoneFinancialInfo(renewSezZoneFinancialInfo);
		   }
		   //form 4 add more
	       List<SezZoneEmployInfo> sezZoneEmpInfo = null;
		   SezZoneEmployInfo renewSezZoneEmpInfo = null;
		   try { 
			   sezZoneEmpInfo =SezZoneEmployInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
	    		}catch (Exception e) {
	    			_log.error("Error****************" + e.getMessage());
	    		}
	    	 if(sezZoneEmpInfo!= null){
	    			for (SezZoneEmployInfo zoneEmploy : sezZoneEmpInfo) {
	    			renewSezZoneEmpInfo = SezZoneEmployInfoLocalServiceUtil.createSezZoneEmployInfo(CounterLocalServiceUtil.increment());
	    		    renewSezZoneEmpInfo.setCounter(zoneEmploy.getCounter());
	    			renewSezZoneEmpInfo.setLabourRequirementYear(zoneEmploy.getLabourRequirementYear());
	    			renewSezZoneEmpInfo.setLabourRequirementDirect(zoneEmploy.getLabourRequirementDirect());
	    			renewSezZoneEmpInfo.setLabourRequirementMale(zoneEmploy.getLabourRequirementMale());
	    			renewSezZoneEmpInfo.setLabourRequirementFemale(zoneEmploy.getLabourRequirementFemale());
	    			renewSezZoneEmpInfo.setLabourRequirementLocal(zoneEmploy.getLabourRequirementLocal());
	    			renewSezZoneEmpInfo.setLabourRequirementForeign(zoneEmploy.getLabourRequirementForeign());
	    			renewSezZoneEmpInfo.setSezStatusApplicationId(sezStatusRenewalApplicationId);
	    			SezZoneEmployInfoLocalServiceUtil.updateSezZoneEmployInfo(renewSezZoneEmpInfo);
	    			}	
	    		}	 
		//form 5
	    	 SezZoneUserUnderInfo sezZoneUserUnderInfo = null;
	    	 SezZoneUserUnderInfo renewSezZoneUserUnderInfo = null;
	    	 try {
	    		 sezZoneUserUnderInfo = SezZoneUserUnderInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
						}catch (Exception e) {
							_log.error("Error****************" + e.getMessage());
						}
					 try {
						 renewSezZoneUserUnderInfo =SezZoneUserUnderInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
						}catch (Exception e) {
							_log.error("Error****************" + e.getMessage());
						}			 
			if(sezZoneUserUnderInfo!=null) {
				renewSezZoneUserUnderInfo.setDeclarantTitle(sezZoneUserUnderInfo.getDeclarantTitle());
				renewSezZoneUserUnderInfo.setDeclarantName(sezZoneUserUnderInfo.getDeclarantName());
				renewSezZoneUserUnderInfo.setDeclarantTeleNum(sezZoneUserUnderInfo.getDeclarantTeleNum());
				renewSezZoneUserUnderInfo.setDeclarantEmail(sezZoneUserUnderInfo.getDeclarantEmail());
	            renewSezZoneUserUnderInfo.setApplicantSignatureDate(sezZoneUserUnderInfo.getApplicantSignatureDate());
				renewSezZoneUserUnderInfo.setPublicNotaryName(sezZoneUserUnderInfo.getPublicNotaryName());
				renewSezZoneUserUnderInfo.setPublicNotarySignatureDate(sezZoneUserUnderInfo.getPublicNotarySignatureDate());
				renewSezZoneUserUnderInfo.setSezStatusApplicationId(sezStatusRenewalApplicationId);
				SezZoneUserUnderInfoLocalServiceUtil.updateSezZoneUserUnderInfo(renewSezZoneUserUnderInfo);
			}
			//form 6
			SezZoneDevUnderInfo sezZoneDevUnderInfo = null;
			SezZoneDevUnderInfo renewSezZoneDevUnderInfo = null;
			 try {
				 sezZoneDevUnderInfo = SezZoneDevUnderInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
						}catch (Exception e) {
							_log.error("Error****************" + e.getMessage());
						}
					 try {
						 renewSezZoneDevUnderInfo =SezZoneDevUnderInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
						}catch (Exception e) {
							_log.error("Error****************" + e.getMessage());
						}
					 if(sezZoneDevUnderInfo!=null) {
						    renewSezZoneDevUnderInfo.setDeveloperName(sezZoneDevUnderInfo.getDeveloperName());
							renewSezZoneDevUnderInfo.setApprovalLetterNum(sezZoneDevUnderInfo.getApprovalLetterNum());
							renewSezZoneDevUnderInfo.setApprovalLetterDate(sezZoneDevUnderInfo.getApprovalLetterDate());
							renewSezZoneDevUnderInfo.setDeveloperAgreeNum(sezZoneDevUnderInfo.getDeveloperAgreeNum());
						    renewSezZoneDevUnderInfo.setDeveloperAgreeDate(sezZoneDevUnderInfo.getDeveloperAgreeDate());
							renewSezZoneDevUnderInfo.setDeveloperControlNum(sezZoneDevUnderInfo.getDeveloperControlNum());
							renewSezZoneDevUnderInfo.setDeclarantTitle(sezZoneDevUnderInfo.getDeclarantTitle());
							renewSezZoneDevUnderInfo.setDeclarantName(sezZoneDevUnderInfo.getDeclarantName());
							renewSezZoneDevUnderInfo.setDeclarantTelephoneNum(sezZoneDevUnderInfo.getDeclarantTelephoneNum());
							renewSezZoneDevUnderInfo.setDeclarantEmail(sezZoneDevUnderInfo.getDeclarantEmail());
							renewSezZoneDevUnderInfo.setSignatureDate(sezZoneDevUnderInfo.getSignatureDate());
							renewSezZoneDevUnderInfo.setPublicNotaryName(sezZoneDevUnderInfo.getPublicNotaryName());
							renewSezZoneDevUnderInfo.setPublicNotarySignatureDate(sezZoneDevUnderInfo.getPublicNotarySignatureDate());
							renewSezZoneDevUnderInfo.setSezStatusApplicationId(sezStatusRenewalApplicationId);
							SezZoneDevUnderInfoLocalServiceUtil.updateSezZoneDevUnderInfo(renewSezZoneDevUnderInfo);
					 }
					//form 7
						SezZoneSubCheckInfo sezZoneSubCheckInfo = null;
						SezZoneSubCheckInfo renewSezZoneSubCheckInfo = null;
						 try {
							 sezZoneSubCheckInfo = SezZoneSubCheckInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
									}catch (Exception e) {
										_log.error("Error****************" + e.getMessage());
									}
								 try {
									 renewSezZoneSubCheckInfo = SezZoneSubCheckInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
									}catch (Exception e) {
										_log.error("Error****************" + e.getMessage());
									}
								 if(sezZoneSubCheckInfo!=null) {
									    renewSezZoneSubCheckInfo.setGeneralRequirement(sezZoneSubCheckInfo.getGeneralRequirement());
										renewSezZoneSubCheckInfo.setCompanyInformation(sezZoneSubCheckInfo.getCompanyInformation());
										renewSezZoneSubCheckInfo.setSwornState(sezZoneSubCheckInfo.getSwornState());
										renewSezZoneSubCheckInfo.setOccupancyRequirement(sezZoneSubCheckInfo.getOccupancyRequirement());
										renewSezZoneSubCheckInfo.setApprovals(sezZoneSubCheckInfo.getApprovals());
										renewSezZoneSubCheckInfo.setSignatureName(sezZoneSubCheckInfo.getSignatureName());
										renewSezZoneSubCheckInfo.setSignatureDate(sezZoneSubCheckInfo.getSignatureDate());
										renewSezZoneSubCheckInfo.setSezStatusApplicationId(sezStatusRenewalApplicationId);
										SezZoneSubCheckInfoLocalServiceUtil.updateSezZoneSubCheckInfo(renewSezZoneSubCheckInfo);
								 }
		 }
			SezStatusAppPayment sezStatusAppPayment=null;
			SezStatusAppPayment renewSezStatusAppPayment=null;
			try {
				sezStatusAppPayment=SezStatusAppPaymentLocalServiceUtil.getSezStatusAppPayment(sezStatusApplicationId);
			} catch (Exception e) {
			}
			if (Validator.isNotNull(sezStatusAppPayment)) {
				renewSezStatusAppPayment = SezStatusAppPaymentLocalServiceUtil.createSezStatusAppPayment(CounterLocalServiceUtil.increment(SezStatusAppPayment.class.getName()));
				renewSezStatusAppPayment.setPaymentMethod(sezStatusAppPayment.getPaymentMethod());
				renewSezStatusAppPayment.setPaymentFee(sezStatusAppPayment.getPaymentFee());
				renewSezStatusAppPayment.setAmountPaid(sezStatusAppPayment.getAmountPaid());
				renewSezStatusAppPayment.setAmountCurrency(sezStatusAppPayment.getAmountCurrency());
				renewSezStatusAppPayment.setSezStatusApplicationId(sezStatusRenewalApplicationId);
				SezStatusAppPaymentLocalServiceUtil.updateSezStatusAppPayment(renewSezStatusAppPayment);
		
			}
			_log.error("END-------------------------------------------------");
	}
	
	@Reference
	DLAppService _dlAppService;
}



