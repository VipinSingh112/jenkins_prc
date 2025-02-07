package com.nbp.osi.services.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.osi.services.application.form.service.model.OSIServiceCurrentStage;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplication;
import com.nbp.osi.services.application.form.service.service.OSIServiceCurrentStageLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesApplicationLocalServiceUtil;
import com.nbp.osi.services.application.form.web.constants.OSIServiceApplicationWorkflowConstant;
import com.nbp.osi.services.application.form.web.constants.OSIServicesApplicationFormPortletKeys;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + OSIServicesApplicationFormPortletKeys.OSISERVICESAPPLICATIONFORM,
		"mvc.command.name=/osi/service/pending" }, service = MVCResourceCommand.class)

public class OSIServicePendingresourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String certificateTypeVal = ParamUtil.getString(resourceRequest, "certificateTypeVal");
		String trusteeLicenceTypeVal = ParamUtil.getString(resourceRequest, "trusteeLicenceTypeVal");
		String trusteeTransactionTypeVal = ParamUtil.getString(resourceRequest, "trusteeTransactionTypeVal");
		String assignmentCertificateTypeVal = ParamUtil.getString(resourceRequest, "assignmentCertificateTypeVal");
		String lastFormDetailsStep = ParamUtil.getString(resourceRequest, "lastFormDetailsStep");
		String currentStage = ParamUtil.getString(resourceRequest, "currentStage");
		long osiServiceApplicationId = ParamUtil.getLong(resourceRequest, "osiServiceApplicationId");

		OsiServicesApplication osiServicesApplication = null;
		OSIServiceCurrentStage currentStageOsi = null;
		try {
			osiServicesApplication = OsiServicesApplicationLocalServiceUtil
					.getOsiServicesApplication(osiServiceApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (osiServicesApplication == null) {
			osiServicesApplication = OsiServicesApplicationLocalServiceUtil
					.createOsiServicesApplication(CounterLocalServiceUtil.increment());
		}
		osiServicesApplication.setDoYouWant(certificateTypeVal);
		osiServicesApplication.setTypeOfApplicant(assignmentCertificateTypeVal);
		osiServicesApplication.setNatureOfApplicant(trusteeLicenceTypeVal);
		osiServicesApplication.setStatus(OSIServiceApplicationWorkflowConstant.DRAFT);
		osiServicesApplication.setTypeOfTransaction(trusteeTransactionTypeVal);

		if (Validator.isNull(osiServicesApplication.getApplicationNumber())) {
			DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
			String formattedDate = df.format(Calendar.getInstance().getTime());
			SecureRandom random = new SecureRandom();
			int num = random.nextInt(100000);
			String formatted = String.format("%05d", num);
			osiServicesApplication.setApplicationNumber(formatted + "/" + formattedDate);
		}
		osiServicesApplication.setCompanyId(themeDisplay.getCompanyId());
		osiServicesApplication.setGroupId(themeDisplay.getScopeGroupId());
		osiServicesApplication.setCreateDate(new Date());
		osiServicesApplication.setUserId(themeDisplay.getUserId());
		osiServicesApplication.setUserName(themeDisplay.getUser().getFullName());
		OsiServicesApplicationLocalServiceUtil.updateOsiServicesApplication(osiServicesApplication);
		// OSI Service Current Stage
		try {
			currentStageOsi = OSIServiceCurrentStageLocalServiceUtil.getOsiServiceCS_By_CI(osiServiceApplicationId);
		} catch (Exception e) {
		}
		if (currentStageOsi == null) {
			currentStageOsi = OSIServiceCurrentStageLocalServiceUtil
					.createOSIServiceCurrentStage(CounterLocalServiceUtil.increment());
		}
		currentStageOsi.setCurrentStage(currentStage);
		currentStageOsi.setLastFormDetailsStep(lastFormDetailsStep);
		currentStageOsi.setOsiServicesApplicationId(osiServicesApplication.getOsiServicesApplicationId());
		OSIServiceCurrentStageLocalServiceUtil.updateOSIServiceCurrentStage(currentStageOsi);
		jsonOBJ.put("osiServiceApplicationId", osiServicesApplication.getOsiServicesApplicationId());
		jsonOBJ.put("status", OSIServiceApplicationWorkflowConstant.DRAFT_Label);
		jsonOBJ.put("categories", osiServicesApplication.getDoYouWant());
		jsonOBJ.put("applicationNumber", osiServicesApplication.getApplicationNumber());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return false;
	}

}
