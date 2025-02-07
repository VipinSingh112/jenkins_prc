package com.nbp.fire.brigade.dashboard.web.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.fire.brigade.dashboard.web.constants.FireBrigadeDashbaordPortletKeys;
import com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection;
import com.nbp.fire.brigade.stage.service.service.FireBrigadeInspectionLocalServiceUtil;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = { "javax.portlet.name=" +  FireBrigadeDashbaordPortletKeys.FIREBRIGADEDASHBAORD,
		"mvc.command.name=/fireBrigade/inspection/update"
		}, service = MVCResourceCommand.class)

public class UpdateInspectionRecordResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(UpdateInspectionRecordResourceCommand.class);
	
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		DateFormat bpmDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long selectedslot = ParamUtil.getLong(resourceRequest, "selectedslot");
		FireBrigadeInspection fireBrigadeInspection = null;
		try {
			fireBrigadeInspection= FireBrigadeInspectionLocalServiceUtil.getFireBrigadeInspection(selectedslot);
		}catch (Exception e) {
		}
		String inspectiondate=null;
		try {
		 inspectiondate=new SimpleDateFormat("yyyy-MM-dd").format(fireBrigadeInspection.getDateOfInspection());
		}catch (Exception e) {
		}
		String inspectionDate=inspectiondate.toString();
		fireBrigadeInspection.setSlotBookedByUser(themeDisplay.getUserId());
		fireBrigadeInspection.setStatus(FireBrigadeDashbaordPortletKeys.CONFRIMED_Label);
		FireBrigadeInspectionLocalServiceUtil.updateFireBrigadeInspection(fireBrigadeInspection);
		resourceRequest.setAttribute("fireBrigadeInspectionScheduled",fireBrigadeInspection);
		try {
			resourceRequest.getPortletContext().getRequestDispatcher("/inspection-confirmation.jsp").include(resourceRequest, resourceResponse);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		User user=null;
		try {
			 user = UserLocalServiceUtil.getUser(themeDisplay.getUserId());
		} catch (PortalException e1) {
			e1.printStackTrace();
		}
		try {
		String body = commonsUtil.getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),"mail-for-inspection-tab-from-user");
				if (Validator.isNotNull(body)) {
			body = StringUtil.replace(body,
					new String[] { "[$username$]","[$date$]"},
					
					new String[] {  
							fireBrigadeInspection.getUserName(),inspectionDate,
							});
				}	
			 commonsUtil.sendMailToUsers("Your Application Submitted",
					"lpa@liferay.com",themeDisplay.getUser().getEmailAddress(), body);
			 commonsUtil.sendMailToUsers("Your Application Submitted",
						"lpa@liferay.com",user.getEmailAddress(), body);
			 _log.info("Mail Sent To Address ----------------" + themeDisplay.getUser().getEmailAddress());
	}catch(Exception e) 
		{
		e.printStackTrace();
	}
		String time =null;
		String timeConversion=null;
		try {
			time=TimeConversionUtil.convertTo24HourFormat(fireBrigadeInspection.getTimeOfInspection());
			String str=bpmDateFormat.format(fireBrigadeInspection.getDateOfInspection());
			 timeConversion= str.replace("T00:00","T"+time); // Replace "T00:00" with "T"+time
		} catch (ParseException e1) {
		}
		
		JSONObject jsonObject=JSONFactoryUtil.createJSONObject();
		JSONObject jsonObject1=JSONFactoryUtil.createJSONObject();
		JSONArray jsonArray=JSONFactoryUtil.createJSONArray();
		try {
		jsonObject.put("caseId", fireBrigadeInspection.getCaseId());
		jsonObject.put("solutionType", "PIRP_Agriculture");
		jsonObject.put("properties", jsonArray);
		jsonArray.put(jsonObject1);
		jsonObject1.put("key", "PIRP_InspectiondateScheduled");
		jsonObject1.put("value", timeConversion);
		}catch (Exception e) {
			e.printStackTrace();
		}
		_log.info("Request json--------------" + jsonObject.toString());
		String launchCaseUrl = (String) themeDisplay.getScopeGroup().getExpandoBridge()
				.getAttribute("icm-launch-case-url");
		_log.info("*************launchCaseUrl in FireBrigadeDashboard************" + launchCaseUrl);
		String updateCaseEndpoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
				.getAttribute("Update Case Endpoint");
		_log.info("*************updateCaseEndpoint in FireBrigadeDashboard************" +launchCaseUrl+updateCaseEndpoint);
		Boolean isBPMEnabled = (Boolean) themeDisplay.getScopeGroup().getExpandoBridge()
				.getAttribute("bpm-enabled");
		_log.info("*************isBPMEnabled in FireBrigade************" + isBPMEnabled);
		if (isBPMEnabled) {
			Unirest.setTimeouts(20000, 120000);
			com.mashape.unirest.http.HttpResponse<String> response=null;
			try {
				response = Unirest.post(launchCaseUrl + updateCaseEndpoint)
						.header("Accept", "application/json").header("Content-Type", "application/json")
						.body(jsonObject.toString()).asString();
			} catch (UnirestException e) {
				e.printStackTrace();
			}
			_log.info("Response body--------------" + response.getBody());
			_log.info("Response code--------------" + response.getCode());
		}
    return false;
	}
	@Reference
	private CommonsUtil commonsUtil;
}
