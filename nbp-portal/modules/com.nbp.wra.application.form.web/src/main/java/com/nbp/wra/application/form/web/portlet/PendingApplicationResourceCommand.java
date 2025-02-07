package com.nbp.wra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
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
import com.nbp.wra.application.form.service.model.WRAAppCurrentStage;
import com.nbp.wra.application.form.service.model.WRAApplication;
import com.nbp.wra.application.form.service.service.WRAAppCurrentStageLocalServiceUtil;
import com.nbp.wra.application.form.service.service.WRAApplicationLocalServiceUtil;
import com.nbp.wra.application.form.web.constants.WRAApplicationFormPortletKeys;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name="  + WRAApplicationFormPortletKeys.WRAAPPLICATIONFORM,
		"mvc.command.name=/wra/application/pending" }, service = MVCResourceCommand.class)
public class PendingApplicationResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(PendingApplicationResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[WRA APPLICATION PENDING START]");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long wraApplicationId = ParamUtil.getLong(resourceRequest, "wraApplicationId");
		String typeOfTransaction=HtmlUtil.unescape(ParamUtil.getString(resourceRequest, "typeOfTransaction"));
		String typeOfPermit=HtmlUtil.unescape(ParamUtil.getString(resourceRequest, "typeOfPermit"));
		String typeOfTransationPermit=HtmlUtil.unescape(ParamUtil.getString(resourceRequest, "typeOfTransationPermit"));
		String userWaterTypeCategories=ParamUtil.getString(resourceRequest, "userWaterTypeCategories");
		String consumptiveSubCategories=ParamUtil.getString(resourceRequest, "consumptiveSubCategories");
		String industrialTypeSubCategories=ParamUtil.getString(resourceRequest, "industrialTypeSubCategories");
		String nonConsumptiveSubCategories=ParamUtil.getString(resourceRequest, "nonConsumptiveSubCategories");
		String typeOfApplication=HtmlUtil.unescape(ParamUtil.getString(resourceRequest, "typeOfApplication"));
		String currentStage = ParamUtil.getString(resourceRequest, "currentStage");
		String currentFormToSave = ParamUtil.getString(resourceRequest, "currentFormToSave");
		String lastFormDetailsStep = ParamUtil.getString(resourceRequest, "lastFormDetailsStep");
		WRAApplication application=null;
		WRAAppCurrentStage wraCurrentStage=null;
		try {
			application=WRAApplicationLocalServiceUtil.getWRAApplication(wraApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(application==null) {
			application=WRAApplicationLocalServiceUtil.createWRAApplication(CounterLocalServiceUtil.increment());
					
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
		application.setStatus(WRAApplicationFormPortletKeys.PENDING_AND_DRAFT);
		application.setTypeOfApplication(typeOfApplication);
		application.setTypeOfPermit(typeOfPermit);
		application.setTypeOfTransaction(typeOfTransaction);
		application.setTypeOfTransacPermit(typeOfTransationPermit);
		application.setUserWaterTypeCat(userWaterTypeCategories);
		application.setConsumptiveSubCat(consumptiveSubCategories);
		application.setNonConsumptiveSubCat(nonConsumptiveSubCategories);
		application.setIndustrialTypeSubCat(industrialTypeSubCategories);
		WRAApplicationLocalServiceUtil.updateWRAApplication(application);
		
		// Updating Current Stage
		try {
			wraCurrentStage = WRAAppCurrentStageLocalServiceUtil.getByWRA_Stage(application.getWraApplicationId());
		} catch (Exception e) {
		}
		if (wraCurrentStage == null) {
			wraCurrentStage = WRAAppCurrentStageLocalServiceUtil.createWRAAppCurrentStage(CounterLocalServiceUtil.increment());
		}
		wraCurrentStage.setCurrentStage(currentStage);
		wraCurrentStage.setLastFormStep(lastFormDetailsStep);
		wraCurrentStage.setWraApplicationId(application.getWraApplicationId());
		WRAAppCurrentStageLocalServiceUtil.updateWRAAppCurrentStage(wraCurrentStage);

		jsonOBJ.put("wraAppNum", application.getApplicationNumber());
		jsonOBJ.put("category", application.getTypeOfApplication());
		jsonOBJ.put("wraApplicationId", application.getWraApplicationId());
		jsonOBJ.put("wraApplicationId", application.getWraApplicationId());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Has Occured", e);
		}
		_log.info("WRA APPLICATION PENDING END");
		return false;
	}

}
