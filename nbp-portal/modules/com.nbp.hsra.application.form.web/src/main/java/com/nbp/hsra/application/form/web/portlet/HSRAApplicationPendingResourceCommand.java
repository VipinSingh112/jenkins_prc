package com.nbp.hsra.application.form.web.portlet;

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
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationWorkflowConstant;
import com.nbp.hsra.application.service.model.HsraApplication;
import com.nbp.hsra.application.service.model.HsraApplicationCurrentStage;
import com.nbp.hsra.application.service.service.HsraApplicationCurrentStageLocalServiceUtil;
import com.nbp.hsra.application.service.service.HsraApplicationLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
	(immediate = true, 
	property = {
		"javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/hsra/pending" }, service = MVCResourceCommand.class)

public class HSRAApplicationPendingResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(HSRAApplicationPendingResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
			JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
			ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
			_log.info("HSRA Pending Resource Command Started");
			long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
			String typeOfApplicant = ParamUtil.getString(resourceRequest, "typeOfApplicant");
			String typeOfActivities = ParamUtil.getString(resourceRequest, "typeOfActivities");
			String categoryOne = ParamUtil.getString(resourceRequest, "categoryOne");
			String categoryTwo = ParamUtil.getString(resourceRequest, "categoryTwo");
			String categoryThree = ParamUtil.getString(resourceRequest, "categoryThree");
			String categoryFour = ParamUtil.getString(resourceRequest, "categoryFour");
			String categoryFive = ParamUtil.getString(resourceRequest, "categoryFive");
			String riskLevel = ParamUtil.getString(resourceRequest, "riskLevel");
			String typeOfApplication = ParamUtil.getString(resourceRequest, "typeOfApplication");
			String typeOfTransaction = ParamUtil.getString(resourceRequest, "typeOfTransaction");
			String brokerTransactionType = ParamUtil.getString(resourceRequest, "brokerTransactionType");
			String specificApplicable = ParamUtil.getString(resourceRequest, "specificApplicable");
			String currentStage = ParamUtil.getString(resourceRequest, "currentStage");
			String saveAndContinue = ParamUtil.getString(resourceRequest, "saveAndContinue");
			String lastFormDetailsStep = ParamUtil.getString(resourceRequest, "lastFormDetailsStep");
			String qualifiedArea = ParamUtil.getString(resourceRequest, "qualifiedArea");

			HsraApplication hsraApplication=null;
			HsraApplicationCurrentStage hsraApplicationCurrentStage=null;
			try {
				hsraApplication= HsraApplicationLocalServiceUtil.getHsraApplication(hsraApplicationId);
			}catch (Exception e) {
			}
			if (Validator.isNull(hsraApplication)) {
				hsraApplication =HsraApplicationLocalServiceUtil.createHsraApplication(CounterLocalServiceUtil.increment());
			}
			hsraApplication.setTypeOfApplicant(typeOfApplicant);
			hsraApplication.setTypeOfActivities(typeOfActivities);
			hsraApplication.setHighOne(categoryOne);
			hsraApplication.setHighTwo(categoryTwo);
			hsraApplication.setMedium(categoryThree);
			hsraApplication.setLowOne(categoryFour);
			hsraApplication.setLowTwo(categoryFive);
			hsraApplication.setRiskLevel(riskLevel);
			hsraApplication.setTypeOfTransaction(typeOfTransaction);
			hsraApplication.setBrokerTransactionType(brokerTransactionType);
			hsraApplication.setCategoryOfSources(typeOfApplication);
			hsraApplication.setTypeOfApplication(typeOfApplication);
			hsraApplication.setSpecificApplicable(specificApplicable);
			hsraApplication.setGroupId(themeDisplay.getScopeGroupId());
			hsraApplication.setCompanyId(themeDisplay.getCompanyId());
			hsraApplication.setCreateDate(new Date());
			hsraApplication.setUserId(themeDisplay.getUserId());
			hsraApplication.setUserName(themeDisplay.getUser().getFullName());
			hsraApplication.setStatus(HSRAApplicationWorkflowConstant.PENDING_AND_DRAFT);
			hsraApplication.setQualifiedArea(qualifiedArea);

			if (Validator.isNull(hsraApplication.getApplicationNumber())) {
				DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
				String formattedDate = df.format(Calendar.getInstance().getTime());
				SecureRandom random = new SecureRandom();
				int num = random.nextInt(100000);
				String formatted = String.format("%05d", num);
				hsraApplication.setApplicationNumber(formatted + "/" + formattedDate);
			}
			HsraApplicationLocalServiceUtil.updateHsraApplication(hsraApplication);
			
			// Updating Current Stage
			try {
				hsraApplicationCurrentStage = HsraApplicationCurrentStageLocalServiceUtil.getHsra_Stage_HAI(hsraApplicationId);
			} catch (Exception e) {
			}
			if (hsraApplicationCurrentStage == null) {
				hsraApplicationCurrentStage = HsraApplicationCurrentStageLocalServiceUtil.createHsraApplicationCurrentStage(CounterLocalServiceUtil.increment());
			}
			hsraApplicationCurrentStage.setCurrentStage(currentStage);
			hsraApplicationCurrentStage.setLastFormStep(lastFormDetailsStep);
			hsraApplicationCurrentStage.setHsraApplicationId(hsraApplication.getHsraApplicationId());
			HsraApplicationCurrentStageLocalServiceUtil.updateHsraApplicationCurrentStage(hsraApplicationCurrentStage);

			if (saveAndContinue.equals("true")) {
				_log.info("inside true condition");
				jsonOBJ.put("hsraAppNum", hsraApplication.getApplicationNumber());
				jsonOBJ.put("hsraCategory", hsraApplication.getTypeOfApplicant());
				jsonOBJ.put("hsraDraftCategory", hsraApplication.getCategoryOfSources());
			} else {
				jsonOBJ.put("hsraAppNum", "");
				jsonOBJ.put("hsraCategory", "");
				jsonOBJ.put("hsraDraftCategory", "");
			}
			jsonOBJ.put("hsraApplicationId", hsraApplication.getHsraApplicationId());
			jsonFeed.put("APP_DATA", jsonOBJ);
			resourceResponse.setContentType("application/json");
			try {
				resourceResponse.getWriter().write(jsonFeed.toString());
			} catch (java.io.IOException e) {
			}
			return false;
		}
}
