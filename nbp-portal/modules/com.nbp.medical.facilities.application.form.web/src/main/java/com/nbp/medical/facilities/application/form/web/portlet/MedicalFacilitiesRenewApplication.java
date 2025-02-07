package com.nbp.medical.facilities.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
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
import com.nbp.medical.facilities.application.form.service.model.MedicalCurrentStage;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesApp;
import com.nbp.medical.facilities.application.form.service.service.MedicalCurrentStageLocalServiceUtil;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesAppLocalServiceUtil;
import com.nbp.medical.facilities.application.form.web.constants.MedicalFacilitiesApplicationFormPortletKeys;
import com.nbp.medical.facilities.application.form.web.constants.MedicalFacilitiesApplicationWorkflowConstant;
import com.nbp.medical.facilities.application.util.MedicalApplicationDocumentCopyUtil;
import com.nbp.medical.facilities.application.util.MedicalApplicationRenewUtil;
import com.nbp.medical.facilities.application.util.MedicalApplicationUserdDataCopyUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + MedicalFacilitiesApplicationFormPortletKeys.MEDICALFACILITIESAPPLICATIONFORM,
		"mvc.command.name=/renew/license/url" }, service = MVCResourceCommand.class)

public class MedicalFacilitiesRenewApplication implements MVCResourceCommand {
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "Medical Supported Documents";
	private static Log _log = LogFactoryUtil.getLog(MedicalFacilitiesNursingStaffDetailResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		_log.info("-------inside renew medical facilities----------------------------");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String licenseNumber = ParamUtil.getString(resourceRequest, "transactionNum");
		_log.info("transaction Number-------------" + licenseNumber);
		MedicalFacilitiesApp medicalApplications = null;
		if (Validator.isNotNull(licenseNumber)) {
			System.out.println("licenseNumber********************"+licenseNumber);
			try {
				medicalApplications = MedicalFacilitiesAppLocalServiceUtil.getMedicalByAppNo(licenseNumber);
				_log.info("medicalApplications is -------------" + medicalApplications);
			} catch (Exception e) {
				_log.error(e.getMessage());
			}
		}
		try {
			if (Validator.isNull(medicalApplications)) {
				_log.info("medicalApplications is -------------" + medicalApplications);
				if (Validator.isNull(licenseNumber)) {
					jsonOBJ.put("licenseNumberCheck", "0");
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().write(jsonFeed.toString());
					
					_log.info("medicalApplications Not  found-------------" + medicalApplications);
				} else {
					String renewUrl = MedicalApplicationRenewUtil.getRenewalData(licenseNumber, themeDisplay,resourceRequest, resourceResponse);
					_log.info("medicalApplications Not  found-------------" + renewUrl);
					jsonOBJ.put("renewLicenseUrl", renewUrl);
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().print(jsonFeed.toString());
				}
			} else {
				_log.info("medicalApplications   found-------------" + medicalApplications);
				if (medicalApplications.getStatus() == MedicalFacilitiesApplicationWorkflowConstant.SUBMITTED) {
					MedicalFacilitiesApp renewMedicalApp = null;
					MedicalCurrentStage medicalCurrentStage = null;
					MedicalCurrentStage medicalCurrentStageRenew = null;
					try {
						renewMedicalApp = MedicalFacilitiesAppLocalServiceUtil
								.getMedicalApplicationByExpiredNUmber(licenseNumber);
					} catch (Exception e) {
					}

					if (Validator.isNull(renewMedicalApp)) {
						_log.info("renew medical -------------");
						renewMedicalApp = MedicalFacilitiesAppLocalServiceUtil.createMedicalFacilitiesApp(CounterLocalServiceUtil.increment());
						renewMedicalApp.setCompanyId(themeDisplay.getCompanyId());
						renewMedicalApp.setGroupId(themeDisplay.getScopeGroupId());
						renewMedicalApp.setUserId(themeDisplay.getUserId());
						renewMedicalApp.setUserName(themeDisplay.getUser().getFullName());
						renewMedicalApp.setNatureOfApplicant(medicalApplications.getNatureOfApplicant());
						renewMedicalApp.setTypeOfTransaction(medicalApplications.getTypeOfTransaction());
						renewMedicalApp.setMedicalCategory(medicalApplications.getMedicalCategory());
						renewMedicalApp.setSubCategory(medicalApplications.getSubCategory());
						renewMedicalApp.setNumberOfBeds(medicalApplications.getNumberOfBeds());
						renewMedicalApp.setNursingHomesCategory(medicalApplications.getNursingHomesCategory());
						renewMedicalApp.setNursingSubCategoryVal(medicalApplications.getNursingSubCategoryVal());
						renewMedicalApp.setCompanyId(themeDisplay.getCompanyId());
						renewMedicalApp.setGroupId(themeDisplay.getScopeGroupId());
						renewMedicalApp.setCreateDate(new Date());
						renewMedicalApp.setUserId(themeDisplay.getUserId());
						renewMedicalApp.setUserName(themeDisplay.getUser().getFullName());
						renewMedicalApp.setStatus(MedicalFacilitiesApplicationWorkflowConstant.PENDING_AND_DRAFT);
						renewMedicalApp.setTypeOfTransaction(MedicalFacilitiesApplicationWorkflowConstant.RENEW_PROCESS);
						_log.info("renew medical after update-------------");
						DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
						String formattedDate = df.format(Calendar.getInstance().getTime());
						SecureRandom random = new SecureRandom();
						int num = random.nextInt(100000);
						String formatted = String.format("%05d", num);
						renewMedicalApp.setApplicationNumber(formatted + "/" + formattedDate);

						renewMedicalApp.setExpiredLicenseAppNumber(licenseNumber);
						MedicalFacilitiesAppLocalServiceUtil.updateMedicalFacilitiesApp(renewMedicalApp);

						// Updating Current Stage
						_log.info("renew Medical app stages----------start---"+renewMedicalApp.getMedicalFacilitiesAppId());
							medicalCurrentStageRenew = MedicalCurrentStageLocalServiceUtil
									.createMedicalCurrentStage(CounterLocalServiceUtil.increment());
							medicalCurrentStageRenew.setCurrentStage("APPLICATION FORM DETAILS");
							medicalCurrentStageRenew.setLastFormStep("childStep1");
							medicalCurrentStageRenew.setMedicalFacilitiesAppId(renewMedicalApp.getMedicalFacilitiesAppId());
							MedicalCurrentStageLocalServiceUtil.updateMedicalCurrentStage(medicalCurrentStageRenew);
						_log.info("renew Medical app stages----------updated---");
						MedicalApplicationUserdDataCopyUtil.copyUserdData(
								medicalApplications.getMedicalFacilitiesAppId(),
								renewMedicalApp.getMedicalFacilitiesAppId(), themeDisplay);
						_log.info("Data Copied---------------------------------------------");
						DLFolder parentDlFolder = null;
						DLFolder supportingDocMainDlFolder = null;
						ServiceContext serviceContext = new ServiceContext();
						try {
							parentDlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
							supportingDocMainDlFolder = DLFolderLocalServiceUtil.getFolder(
									themeDisplay.getScopeGroupId(), parentDlFolder.getFolderId(),
									String.valueOf(medicalApplications.getMedicalFacilitiesAppId()));
							serviceContext = ServiceContextFactory
									.getInstance(MedicalFacilitiesRenewApplication.class.getName(), resourceRequest);
						} catch (Exception e) {
							e.printStackTrace();
						}
						MedicalApplicationDocumentCopyUtil.copyFolder(themeDisplay.getScopeGroupId(),
								supportingDocMainDlFolder.getFolderId(), parentDlFolder.getFolderId(),
								String.valueOf(medicalApplications.getMedicalFacilitiesAppId()),
								supportingDocMainDlFolder.getDescription(), serviceContext,
								supportingDocMainDlFolder.getFolderId(), themeDisplay.getUserId(),
								renewMedicalApp.getMedicalFacilitiesAppId());
						_log.info("Document Copied- after copying document--------------------------------------------");
					}
					String renewLicenseUrl ="/group/guest/medical-facilities-application-form?medicalApplicationId="
							+ renewMedicalApp.getMedicalFacilitiesAppId();
					jsonOBJ.put("renewLicenseUrl", renewLicenseUrl);
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().write(jsonFeed.toString());
				} else {
					System.out.println("-------------------form not submitted----------------going in else-------------------");
					jsonOBJ.put("licenseNumberCheck", "0");
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().write(jsonFeed.toString());
				}
			}
		} catch (Exception e) {

		}
		return false;
	}
}