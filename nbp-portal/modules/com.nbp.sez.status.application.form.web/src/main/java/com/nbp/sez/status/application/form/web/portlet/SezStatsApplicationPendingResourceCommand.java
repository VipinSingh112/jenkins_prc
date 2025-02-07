package com.nbp.sez.status.application.form.web.portlet;

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
import com.nbp.sez.status.application.form.service.model.SezStatusApplication;
import com.nbp.sez.status.application.form.service.model.SezStatusApplicationCurrentStage;
import com.nbp.sez.status.application.form.service.service.SezStatusApplicationCurrentStageLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezStatusApplicationLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationWorkflowConstant;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/sez/status/pending" }, service = MVCResourceCommand.class)
public class SezStatsApplicationPendingResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(SezStatsApplicationPendingResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[SEZ APPLICATION PENDING START]");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		String typeOfApplication = ParamUtil.getString(resourceRequest, "typeOfSezStatus");
		String typeOfIndustry = ParamUtil.getString(resourceRequest, "typeOfIndustry");
		String typeOfTransaction = ParamUtil.getString(resourceRequest, "typeOfTransaction");
		String specialEconomicZoneCheckBoxInfo = ParamUtil.getString(resourceRequest, "specialEconomicZoneCheckBoxInfo");
		String zoningClassificationCheckBoxInfo = ParamUtil.getString(resourceRequest, "zoningClassificationCheckBoxInfo");
		String sezApplicationParish = ParamUtil.getString(resourceRequest, "sezApplicationParish");
		String currentStage = ParamUtil.getString(resourceRequest, "currentStage");
		String lastFormDetailsStep = ParamUtil.getString(resourceRequest, "lastFormDetailsStep");
		String saveAndContinue = ParamUtil.getString(resourceRequest, "saveAndContinue");
		String typeOfTransactionWFH = ParamUtil.getString(resourceRequest, "typeOfTransactionWFH");
		String doYouWantTo = ParamUtil.getString(resourceRequest, "doYouWantTo");
		String ApplicantStatus = ParamUtil.getString(resourceRequest, "ApplicantStatus");
		String controlNumber = ParamUtil.getString(resourceRequest, "controlNumber");
		SezStatusApplication sezApplication = null;
		SezStatusApplicationCurrentStage applicationCurrentStage=null;
		
		try {
			sezApplication=SezStatusApplicationLocalServiceUtil.getSezStatusApplication(sezStatusApplicationId);
		} catch (Exception e) {
		}
		if(Validator.isNull(sezApplication)) {
			sezApplication = SezStatusApplicationLocalServiceUtil
					.createSezStatusApplication(CounterLocalServiceUtil.increment(SezStatsApplicationPendingResourceCommand.class.getName()));
		}
		sezApplication.setSezStatus(typeOfApplication);
		sezApplication.setIndustries(typeOfIndustry);
		sezApplication.setTypeOfTransaction(typeOfTransaction);
		sezApplication.setCompanyId(themeDisplay.getCompanyId());
		sezApplication.setGroupId(themeDisplay.getScopeGroupId());
		sezApplication.setUserId(themeDisplay.getUserId());
		sezApplication.setUserName(themeDisplay.getUser().getFullName());
		sezApplication.setStatus(SezStatusApplicationWorkflowConstant.PENDING_AND_DRAFT);
		sezApplication.setSpecialEconomicZone(specialEconomicZoneCheckBoxInfo);
		sezApplication.setParish(sezApplicationParish);
		sezApplication.setZoningClassification(zoningClassificationCheckBoxInfo);
		sezApplication.setDoYouWantTo(doYouWantTo);
		sezApplication.setTypeOfTransactionWFH(typeOfTransactionWFH);
		sezApplication.setApplicantStatusWFH(ApplicantStatus);
		sezApplication.setControlNumberWFH(controlNumber);
		
		if (Validator.isNull(sezApplication.getApplicationNumber())) {
			  DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
			  String formattedDate = df.format(Calendar.getInstance().getTime());
			  SecureRandom random = new SecureRandom(); int num = random.nextInt(100000);
			  String formatted = String.format("%05d", num);
			  sezApplication.setApplicationNumber(formatted + "/" + formattedDate);
		}
		//Setting Developer Details----------------------------------------------------
		SezStatusApplication updateSezStatusApplication = SezStatusApplicationLocalServiceUtil.updateSezStatusApplication(sezApplication);
		//Updating Current Stage
		try {
			applicationCurrentStage=SezStatusApplicationCurrentStageLocalServiceUtil.getSEZ_Stage_SAI(updateSezStatusApplication.getSezStatusApplicationId());
		} catch (Exception e) {
		}
		if(applicationCurrentStage==null) {
			applicationCurrentStage=SezStatusApplicationCurrentStageLocalServiceUtil.createSezStatusApplicationCurrentStage
					(CounterLocalServiceUtil.increment());
		}
		applicationCurrentStage.setCurrentStage(currentStage);
		applicationCurrentStage.setLastFormStep(lastFormDetailsStep);
		applicationCurrentStage.setSezStatusApplicationId(updateSezStatusApplication.getSezStatusApplicationId());
		SezStatusApplicationCurrentStageLocalServiceUtil.updateSezStatusApplicationCurrentStage(applicationCurrentStage);	
		//In Case Of Save And Continue Button 
		String sezCategory="";
		String category="";
		if(Validator.isNotNull(doYouWantTo)&&doYouWantTo.equals("Submit an Application for A Work From Home Certificate")) {
			sezCategory=updateSezStatusApplication.getApplicantStatusWFH();
			category="Work From Home Certificate";
		}else {
			sezCategory=updateSezStatusApplication.getSezStatus();
            category="Sez Status";
		}
		if(saveAndContinue.equals("true")) {
			jsonOBJ.put("sezApplicationNumber", updateSezStatusApplication.getApplicationNumber());
			jsonOBJ.put("sezCategory",sezCategory);
			jsonOBJ.put("category",category);
		}else {
			jsonOBJ.put("sezApplicationNumber", "");
			jsonOBJ.put("sezCategory", "");
		}
		//Json Object to Get Data in JSP
		jsonOBJ.put("sezStatusApplicationId", sezApplication.getSezStatusApplicationId());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Has Occured", e);
		}
		_log.info("SEZ APPLICATION PENDING END");
		return false;
	}

}
