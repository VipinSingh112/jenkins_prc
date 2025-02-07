package com.nbp.fire.brigade.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeAppliCurrentStage;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeApplication;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeAppliCurrentStageLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeApplicationLocalServiceUtil;
import com.nbp.fire.brigade.application.form.web.constants.FireBrigadeApplicationFormPortletKeys;
import com.nbp.fire.brigade.application.form.web.constants.FireBrigadeApplicationWorkflowConstant;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + FireBrigadeApplicationFormPortletKeys.FIREBRIGADEAPPLICATIONFORM,
		"mvc.command.name=/fire/brigade/pending" }, service = MVCResourceCommand.class)
public class FireBrigadeApplicationPendingResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(FireBrigadeApplicationPendingResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[FIRE BRIGADE APPLICATION PENDING START--------------------");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long fireBrigadeApplicationId = ParamUtil.getLong(resourceRequest, "fireBrigadeApplicationId");
		String certificateType = ParamUtil.getString(resourceRequest, "certificateType");
		String typeOfTransaction = ParamUtil.getString(resourceRequest, "typeOfTransaction");
		String applicantType = ParamUtil.getString(resourceRequest, "applicantType");
		String premisesType = ParamUtil.getString(resourceRequest, "premisesType");
		String certificatePurpose = ParamUtil.getString(resourceRequest, "certificatePurpose");
		String parish = ParamUtil.getString(resourceRequest, "parish");
		String currentStage = ParamUtil.getString(resourceRequest, "currentStage");
		String lastFormDetailsStep = ParamUtil.getString(resourceRequest, "lastFormDetailsStep");
		String saveAndContinue = ParamUtil.getString(resourceRequest, "saveAndContinue");

		FireBrigadeApplication fireBrigadeApplication = null;
		FireBrigadeAppliCurrentStage applicationCurrentStage = null;
		try {
			fireBrigadeApplication = FireBrigadeApplicationLocalServiceUtil
					.getFireBrigadeApplication(fireBrigadeApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(fireBrigadeApplication)) {
			fireBrigadeApplication = FireBrigadeApplicationLocalServiceUtil
					.createFireBrigadeApplication(CounterLocalServiceUtil.increment());
		}
		fireBrigadeApplication.setCertificateType(certificateType);
		fireBrigadeApplication.setTypeOfTransaction(typeOfTransaction);
		fireBrigadeApplication.setTypeOfApplicant(applicantType);
		fireBrigadeApplication.setTypeOfPermises(premisesType);
		fireBrigadeApplication.setPurposeOfCertificate(certificatePurpose);
		fireBrigadeApplication.setParish(parish);
		fireBrigadeApplication.setCompanyId(themeDisplay.getCompanyId());
		fireBrigadeApplication.setGroupId(themeDisplay.getScopeGroupId());
		fireBrigadeApplication.setUserId(themeDisplay.getUserId());
		fireBrigadeApplication.setUserName(themeDisplay.getUser().getFullName());
		fireBrigadeApplication.setStatus(FireBrigadeApplicationWorkflowConstant.PENDING_AND_DRAFT);
		if (Validator.isNull(fireBrigadeApplication.getApplicationNumber())) {
			DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
			String formattedDate = df.format(Calendar.getInstance().getTime());
			SecureRandom random = new SecureRandom();
			int num = random.nextInt(100000);
			String formatted = String.format("%05d", num);
			fireBrigadeApplication.setApplicationNumber(formatted + "/" + formattedDate);
		}
		FireBrigadeApplicationLocalServiceUtil.updateFireBrigadeApplication(fireBrigadeApplication);

		// Updating Current Stage
		try {
			applicationCurrentStage = FireBrigadeAppliCurrentStageLocalServiceUtil
					.getFireBrigade_Stage_FBAI(fireBrigadeApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(applicationCurrentStage)) {
			applicationCurrentStage = FireBrigadeAppliCurrentStageLocalServiceUtil
					.createFireBrigadeAppliCurrentStage(CounterLocalServiceUtil.increment());
		}
		applicationCurrentStage.setCurrentStage(currentStage);
		applicationCurrentStage.setLastFormStep(lastFormDetailsStep);
		applicationCurrentStage.setFireBrigadeApplicationId(fireBrigadeApplication.getFireBrigadeApplicationId());
		FireBrigadeAppliCurrentStageLocalServiceUtil.updateFireBrigadeAppliCurrentStage(applicationCurrentStage);
		// In Case Of Save And Continue Button
		if (saveAndContinue.equals("true")) {
			jsonOBJ.put("fireBrigadeApplicationNumber", fireBrigadeApplication.getApplicationNumber());
			jsonOBJ.put("fireBrigadeCategory", fireBrigadeApplication.getTypeOfPermises());
		} else {
			jsonOBJ.put("fireBrigadeApplicationNumber", "");
			jsonOBJ.put("fireBrigadeCategory", "");
		}
		// Json Object to Get Data in JSP
		jsonOBJ.put("fireBrigadeApplicationId", fireBrigadeApplication.getFireBrigadeApplicationId());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Has Occured", e);
		}
		_log.info("FIRE BRIGADE APPLICATION PENDING END");

		return false;
	}
}