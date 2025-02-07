package com.nbp.ogt.application.form.web.portlet;

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
import com.nbp.ogt.application.form.services.model.OGTAppCurrentStage;
import com.nbp.ogt.application.form.services.model.OgtApplication;
import com.nbp.ogt.application.form.services.service.OGTAppCurrentStageLocalServiceUtil;
import com.nbp.ogt.application.form.services.service.OgtApplicationLocalServiceUtil;
import com.nbp.ogt.application.form.web.constants.OGTApplicationWorkflowConstant;
import com.nbp.ogt.application.form.web.constants.OgtApplicationFormWebPortletKeys;

import java.io.IOException;
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
		"javax.portlet.name=" + OgtApplicationFormWebPortletKeys.OGTAPPLICATIONFORMWEB,
		"mvc.command.name=/draft/ogt/application" }, service = MVCResourceCommand.class)

public class OGTApplicationDraftResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(OGTApplicationDraftResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
			JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
			ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
			_log.info("OGT Draft Resource Command Start");
			long ogtApplicationId = ParamUtil.getLong(resourceRequest, "ogtApplicationId");
			String doYouWant = ParamUtil.getString(resourceRequest, "doYouWant");
			String typeOfApplicant = ParamUtil.getString(resourceRequest, "typeOfApplicant");
			String natureOfInsolvent = ParamUtil.getString(resourceRequest, "natureOfInsolvent");
			String typeOfMatter = ParamUtil.getString(resourceRequest, "typeOfMatter");
			String typeOfDebt = ParamUtil.getString(resourceRequest, "typeOfDebt");
			String debtstatute = ParamUtil.getString(resourceRequest, "debtstatute");
			String registeredManufacturer = ParamUtil.getString(resourceRequest, "registeredManufacturer");
			String registrationLicenceNum = ParamUtil.getString(resourceRequest, "registrationLicenceNum");
			String typeOfBankruptcy = ParamUtil.getString(resourceRequest, "typeOfBankruptcy");
			String currentStage = ParamUtil.getString(resourceRequest, "currentStage");
			String lastFormDetailsStep = ParamUtil.getString(resourceRequest, "lastFormDetailsStep");

			OgtApplication ogtApplication=null;
			OGTAppCurrentStage ogtCurrentStage=null;
			try {
				ogtApplication= OgtApplicationLocalServiceUtil.getOgtApplication(ogtApplicationId);
			}catch (Exception e) {
			}
			if (Validator.isNull(ogtApplication)) {
				ogtApplication =OgtApplicationLocalServiceUtil.createOgtApplication(CounterLocalServiceUtil.increment());
			}
			ogtApplication.setDoYouWant(doYouWant);
			ogtApplication.setTypeOfApplicant(typeOfApplicant);
			ogtApplication.setNatureOfApplicant(natureOfInsolvent);
			ogtApplication.setTypeOfMatter(typeOfMatter);
			ogtApplication.setTypeOfDebt(typeOfDebt);
			ogtApplication.setDebtStatute(debtstatute);
			ogtApplication.setRegisteredManufacturer(registeredManufacturer);
			ogtApplication.setProspectingRightsNum(registrationLicenceNum);
			ogtApplication.setTypeOfBankruptcy(typeOfBankruptcy);
			ogtApplication.setCompanyId(themeDisplay.getCompanyId());
			ogtApplication.setCreateDate(new Date());
			ogtApplication.setUserId(themeDisplay.getUserId());
			ogtApplication.setUserName(themeDisplay.getUser().getFullName());
			ogtApplication.setStatus(OGTApplicationWorkflowConstant.PENDING_AND_DRAFT);

			if (Validator.isNull(ogtApplication.getApplicationNumber())) {
				DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
				String formattedDate = df.format(Calendar.getInstance().getTime());
				SecureRandom random = new SecureRandom();
				int num = random.nextInt(100000);
				String formatted = String.format("%05d", num);
				ogtApplication.setApplicationNumber(formatted + "/" + formattedDate);
			}
			OgtApplicationLocalServiceUtil.updateOgtApplication(ogtApplication);
			// Updating Current Stage
			try {
				ogtCurrentStage = OGTAppCurrentStageLocalServiceUtil.getByOGT_Stage(ogtApplication.getOgtApplicationId());
			} catch (Exception e) {
			}
			if (ogtCurrentStage == null) {
				ogtCurrentStage = OGTAppCurrentStageLocalServiceUtil.createOGTAppCurrentStage(CounterLocalServiceUtil.increment());
			}
			ogtCurrentStage.setCurrentStage(currentStage);
			ogtCurrentStage.setLastFormStep(lastFormDetailsStep);
			ogtCurrentStage.setOgtApplicationId(ogtApplication.getOgtApplicationId());
			OGTAppCurrentStageLocalServiceUtil.updateOGTAppCurrentStage(ogtCurrentStage);

			jsonOBJ.put("ogtAppNo", ogtApplication.getApplicationNumber());
			jsonOBJ.put("category", ogtApplication.getTypeOfMatter());
			jsonOBJ.put("ogtApplicationId", ogtApplication.getOgtApplicationId());
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
