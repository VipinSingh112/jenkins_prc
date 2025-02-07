package com.nbp.jadsc.application.form.web.portlet;

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
import com.nbp.jadsc.application.form.service.model.JADSCApplication;
import com.nbp.jadsc.application.form.service.model.JADSCCurrentStage;
import com.nbp.jadsc.application.form.service.service.JADSCApplicationLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCCurrentStageLocalServiceUtil;
import com.nbp.jadsc.application.form.web.constants.JADSCApplicationFormPortletKeys;
import com.nbp.jadsc.application.form.web.constants.JADSCApplicationWorkFlowConstants;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + JADSCApplicationFormPortletKeys.JADSCAPPLICATIONFORM,
		"mvc.command.name=draft/Jadsc/Application/Url" }, service = MVCResourceCommand.class)
public class JADSCApplicationDraftResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(JADSCApplicationDraftResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("DRAFT RESOURCE CMD [STARTED]--->>");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String typeOfApplication = ParamUtil.getString(resourceRequest, "typeOfApplication");
		String typeOfComplaint = ParamUtil.getString(resourceRequest, "typeOfComplaint");
		String typeOfTransaction =ParamUtil.getString(resourceRequest,"typeOfTransaction");
		String typeOfApplicant = ParamUtil.getString(resourceRequest, "typeOfApplicant");
		String industriesImpactedValues = ParamUtil.getString(resourceRequest, "industriesImpactedValues");
		String breachOfConfidentiality = ParamUtil.getString(resourceRequest, "breachOfConfidentiality");
		String selectedInformation = ParamUtil.getString(resourceRequest, "selectedInformation");
		String confidentialStatusReason = ParamUtil.getString(resourceRequest, "confidentialStatusReason");
		String nonConfidentialSummary = ParamUtil.getString(resourceRequest, "nonConfidentialSummary");
		String categoriesOfConfiOtherPleaseSpecify=ParamUtil.getString(resourceRequest,"categoriesOfConfiOtherPleaseSpecify");
		long jadscApplicationId = ParamUtil.getLong(resourceRequest, "jadscApplicationId");
		String currentStage = ParamUtil.getString(resourceRequest, "currentStage");
		String saveAndContinue = ParamUtil.getString(resourceRequest, "saveAndContinue");
		String lastFormDetailsStep = ParamUtil.getString(resourceRequest, "lastFormDetailsStep");
		JADSCApplication application = null;
		JADSCCurrentStage jadscCurrentStage=null;
		try {
			application = JADSCApplicationLocalServiceUtil.getJADSCApplication(jadscApplicationId);
		} catch (Exception e) {
		}
		if (application == null) {
			application = JADSCApplicationLocalServiceUtil.createJADSCApplication(CounterLocalServiceUtil.increment());
		}
		_log.info("row created--DRAFT-->>>");
		application.setTypeOfApplication(typeOfApplication);
		application.setTypeOfComplaint(typeOfComplaint);
		application.setTypeOfTransaction(typeOfTransaction);
		application.setTypeOfApplicant(typeOfApplicant);
		application.setIndustriesImpacted(industriesImpactedValues);
		application.setBreachOfConfidentiality(breachOfConfidentiality);
		application.setCategoriesOfConfidentialInfo(selectedInformation);
		application.setReasonForConfidentialStatus(confidentialStatusReason);
		application.setNonConfidentialSummary(nonConfidentialSummary);
		application.setCategoriesOfConfiOtherPlease(categoriesOfConfiOtherPleaseSpecify);
		application.setCompanyId(themeDisplay.getCompanyId());
		application.setGroupId(themeDisplay.getScopeGroupId());
		application.setCreateDate(new Date());
		application.setUserId(themeDisplay.getUserId());
		application.setUserName(themeDisplay.getUser().getFullName());
		application.setStatus(JADSCApplicationWorkFlowConstants.DRAFT);
		if (Validator.isNull(application.getApplicationNumber())) {
			DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
			String formattedDate = df.format(Calendar.getInstance().getTime());
			SecureRandom random = new SecureRandom();
			int num = random.nextInt(100000);
			String formatted = String.format("%05d", num);
			application.setApplicationNumber(formatted + "/" + formattedDate);
		}
		//application.setJadscApplicationId(jadscApplicationId);
		JADSCApplicationLocalServiceUtil.updateJADSCApplication(application);
		_log.info("DRAFT UPDATED--->>");
		// Updating Current Stage
			try {
				jadscCurrentStage = JADSCCurrentStageLocalServiceUtil.getByJadsc_Stage(jadscApplicationId);
			} catch (Exception e) {
			}
			if (jadscCurrentStage == null) {
				jadscCurrentStage = JADSCCurrentStageLocalServiceUtil.createJADSCCurrentStage(CounterLocalServiceUtil.increment());
			}
			_log.info("CURRENT STAGE CREATED--->>");
			jadscCurrentStage.setCurrentStage(currentStage);
			jadscCurrentStage.setLastFormStep(lastFormDetailsStep);
			jadscCurrentStage.setJadscApplicationId(application.getJadscApplicationId());
			JADSCCurrentStageLocalServiceUtil.updateJADSCCurrentStage(jadscCurrentStage);

			jsonOBJ.put("jadscAppNo", application.getApplicationNumber());
			jsonOBJ.put("category", application.getTypeOfApplication());
			jsonOBJ.put("jadscApplicationId", application.getJadscApplicationId());
			jsonFeed.put("APP_DATA", jsonOBJ);
			resourceResponse.setContentType("application/json");
			try {
				resourceResponse.getWriter().write(jsonFeed.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
			_log.info("DRAFT [ENDED]--->>");
		return false;
	}

}
