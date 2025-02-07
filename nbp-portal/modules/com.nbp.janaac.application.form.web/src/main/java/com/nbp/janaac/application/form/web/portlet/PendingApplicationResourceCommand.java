package com.nbp.janaac.application.form.web.portlet;

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
import com.nbp.janaac.application.form.service.model.JanaacAppliCurrentStage;
import com.nbp.janaac.application.form.service.model.JanaacApplication;
import com.nbp.janaac.application.form.service.service.JanaacAppliCurrentStageLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.JanaacApplicationLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/pending/janaac/application" }, service = MVCResourceCommand.class)
public class PendingApplicationResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(PendingApplicationResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[JANAAC APPLICATION PENDING START]");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String typeOfAccreditation=ParamUtil.getString(resourceRequest, "typeOfAccreditation");
		String typeOFAccreditationService=ParamUtil.getString(resourceRequest, "typeOFAccreditationService");
		String janaacTransactionType=ParamUtil.getString(resourceRequest, "janaacTransactionType");
		String currentStage = ParamUtil.getString(resourceRequest, "currentStage");
		String saveAndContinue = ParamUtil.getString(resourceRequest, "saveAndContinue");
		String lastFormDetailsStep = ParamUtil.getString(resourceRequest, "lastFormDetailsStep");
		
		JanaacApplication application=null;
		JanaacAppliCurrentStage janaacApplicationCurrentStage=null;
		try {
			application=JanaacApplicationLocalServiceUtil.getJanaacApplication(janaacApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(application==null) {
			application=JanaacApplicationLocalServiceUtil.createJanaacApplication(CounterLocalServiceUtil.increment());
					
		}
		if (Validator.isNull(application.getApplicationNumber())) {
			  DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
			  String formattedDate = df.format(Calendar.getInstance().getTime());
			  SecureRandom random = new SecureRandom(); int num = random.nextInt(100000);
			  String formatted = String.format("%05d", num);
			  application.setApplicationNumber(formatted + "/" + formattedDate);
		}
		application.setCompanyId(themeDisplay.getCompanyId());
		application.setGroupId(themeDisplay.getScopeGroupId());
		application.setUserId(themeDisplay.getUserId());
		application.setUserName(themeDisplay.getUser().getFullName());
		application.setStatus(JanaacApplicationFormPortletKeys.PENDING_AND_DRAFT);
		application.setAccreditationType(typeOfAccreditation);
		application.setAccServiceType(typeOFAccreditationService);
		application.setTransactionType(janaacTransactionType);
		JanaacApplicationLocalServiceUtil.updateJanaacApplication(application);
		try {
			janaacApplicationCurrentStage=JanaacAppliCurrentStageLocalServiceUtil.getJanaac_Stage_JAI(janaacApplicationId);
		}catch (Exception e) {
		}
		if(Validator.isNull(janaacApplicationCurrentStage)) {
			janaacApplicationCurrentStage=JanaacAppliCurrentStageLocalServiceUtil.createJanaacAppliCurrentStage(CounterLocalServiceUtil.increment());
		}
		janaacApplicationCurrentStage.setCurrentStage(currentStage);
		janaacApplicationCurrentStage.setLastFormStep(lastFormDetailsStep);
		janaacApplicationCurrentStage.setJanaacApplicationId(application.getJanaacApplicationId());
		JanaacAppliCurrentStageLocalServiceUtil.updateJanaacAppliCurrentStage(janaacApplicationCurrentStage);

		if (saveAndContinue.equals("true")) {
			_log.info("inside true condition");
			jsonOBJ.put("janaacAppNum", application.getApplicationNumber());
			jsonOBJ.put("janaacCategory", application.getAccreditationType());
		} else {
			jsonOBJ.put("janaacAppNum", "");
			jsonOBJ.put("janaacCategory", "");
		}
		jsonOBJ.put("janaacApplicationId", application.getJanaacApplicationId());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (java.io.IOException e) {
		}
		_log.info("JANAAC APPLICATION PENDING END");
		return false;
	}

}
