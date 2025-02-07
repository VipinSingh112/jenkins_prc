
package com.nbp.factories.registration.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.factories.registration.application.form.services.model.FactoriesApplicationRegistration;
import com.nbp.factories.registration.application.form.services.model.FactoriesRegstCurrentStage;
import com.nbp.factories.registration.application.form.services.service.FactoriesApplicationRegistrationLocalServiceUtil;
import com.nbp.factories.registration.application.form.services.service.FactoriesRegstCurrentStageLocalServiceUtil;
import com.nbp.factories.registration.application.form.web.constants.FactoriesRegistrationApplicationFormWebPortletKeys;
import com.nbp.factories.registration.application.form.web.constants.FactoriesRegistrationApplicationWorkFlowConstants;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(

		property = {
				"javax.portlet.name="
						+ FactoriesRegistrationApplicationFormWebPortletKeys.FACTORIESREGISTRATIONAPPLICATIONFORMWEB,
				"mvc.command.name=draft/Factories/Application" }, service = MVCResourceCommand.class)

public class FactoriesRegistrationApplicationDraftResourceCommand implements MVCResourceCommand {

	private static Log _log = LogFactoryUtil.getLog(FactoriesRegistrationApplicationDraftResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("DRAFT STARTED");
			JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
			JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
			ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);

			String typeOfTransaction = HtmlUtil.unescape(ParamUtil.getString(resourceRequest, "typeOfTransaction"));
			String productCategories = HtmlUtil.unescape(ParamUtil.getString(resourceRequest, "productCategories"));
			String factoriesApplicationType = ParamUtil.getString(resourceRequest, "factoriesApplicationType");
			String currentStage = ParamUtil.getString(resourceRequest, "currentStage");
			String lastFormDetailsStep = ParamUtil.getString(resourceRequest, "lastFormDetailsStep");
			long factoriesApplicationId = ParamUtil.getLong(resourceRequest, "factoriesApplicationId");
			FactoriesApplicationRegistration factoriesApplication = null;
			 FactoriesRegstCurrentStage factoriesCurrentStage = null;
			try {
				factoriesApplication = FactoriesApplicationRegistrationLocalServiceUtil
						.getFactoriesApplicationRegistration(factoriesApplicationId);
			} catch (Exception e) {
			}
			if (factoriesApplication == null) {
				factoriesApplication = FactoriesApplicationRegistrationLocalServiceUtil
						.createFactoriesApplicationRegistration(CounterLocalServiceUtil.increment(FactoriesRegistrationApplicationDraftResourceCommand.class.getName()));
			}
			
			factoriesApplication.setTypeOfTransaction(typeOfTransaction);
			factoriesApplication.setProductCategory(productCategories);
			factoriesApplication.setAreYouProcessing(factoriesApplicationType);
			factoriesApplication.setCompanyId(themeDisplay.getCompanyId());
			factoriesApplication.setCreateDate(new Date());
			factoriesApplication.setUserId(themeDisplay.getUserId());
			factoriesApplication.setGroupId(themeDisplay.getScopeGroupId());
			factoriesApplication.setUserName(themeDisplay.getUser().getFullName());
			factoriesApplication.setStatus(FactoriesRegistrationApplicationWorkFlowConstants.PENDING_AND_DRAFT);
			if (Validator.isNull(factoriesApplication.getApplicationNumber())) {
				DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
				String formattedDate = df.format(Calendar.getInstance().getTime());
				SecureRandom random = new SecureRandom();
				int num = random.nextInt(100000);
				String formatted = String.format("%05d", num);
				factoriesApplication.setApplicationNumber(formatted + "/" + formattedDate);
			}
			FactoriesApplicationRegistrationLocalServiceUtil.updateFactoriesApplicationRegistration(factoriesApplication);

			// Updating Current Stage
			try {
				factoriesCurrentStage = FactoriesRegstCurrentStageLocalServiceUtil.getByFactories_Stage(factoriesApplication.getFactoriesApplicationId());
			} catch (Exception e) {
			}
			if (factoriesCurrentStage == null) {
				factoriesCurrentStage = FactoriesRegstCurrentStageLocalServiceUtil.createFactoriesRegstCurrentStage(CounterLocalServiceUtil.increment());
			}
			factoriesCurrentStage.setCurrentStage(currentStage);
			factoriesCurrentStage.setLastFormStep(lastFormDetailsStep);
			factoriesCurrentStage.setFactoriesApplicationId(factoriesApplication.getFactoriesApplicationId());
			FactoriesRegstCurrentStageLocalServiceUtil.updateFactoriesRegstCurrentStage(factoriesCurrentStage);

			jsonOBJ.put("factoryAppNo", factoriesApplication.getApplicationNumber());
			jsonOBJ.put("category", factoriesApplication.getTypeOfTransaction());
			jsonOBJ.put("factoriesAppicationId", factoriesApplication.getFactoriesApplicationId());
			jsonFeed.put("APP_DATA", jsonOBJ);
			resourceResponse.setContentType("application/json");
			try {
				resourceResponse.getWriter().write(jsonFeed.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
			_log.info("DRAFT ENDED");
		// TODO Auto-generated method stub

		return false;
	}
}