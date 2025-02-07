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
import com.nbp.wra.application.form.web.constants.WRAApplicationWorkflowConstant;

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
		"javax.portlet.name=" + WRAApplicationFormPortletKeys.WRAAPPLICATIONFORM,
		"mvc.command.name=/draft/Wra/Application/Url" }, service = MVCResourceCommand.class)

public class WRAApplicationDraftResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(WRAApplicationDraftResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
			JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
			ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
			long wraApplicationId = ParamUtil.getLong(resourceRequest, "wraApplicationId");
			String typeOfApplication = HtmlUtil.unescape(ParamUtil.getString(resourceRequest, "typeOfApplication"));
			String typeOfPermit = ParamUtil.getString(resourceRequest, "typeOfPermit");
			String typeOfTransationPermit = ParamUtil.getString(resourceRequest, "typeOfTransationPermit");
			String typeOfTransaction = ParamUtil.getString(resourceRequest, "typeOfTransaction");
			String userWaterTypeCategories=ParamUtil.getString(resourceRequest, "userWaterTypeCategories");
			String consumptiveSubCategories=ParamUtil.getString(resourceRequest, "consumptiveSubCategories");
			String industrialTypeSubCategories=ParamUtil.getString(resourceRequest, "industrialTypeSubCategories");
			String nonConsumptiveSubCategories=ParamUtil.getString(resourceRequest, "nonConsumptiveSubCategories");
			String currentStage = ParamUtil.getString(resourceRequest, "currentStage");
			String lastFormDetailsStep = ParamUtil.getString(resourceRequest, "lastFormDetailsStep");

			WRAApplication wraApplication=null;
			WRAAppCurrentStage wraCurrentStage=null;
			try {
				wraApplication= WRAApplicationLocalServiceUtil.getWRAApplication(wraApplicationId);
			}catch (Exception e) {
			}
			if (wraApplication==null) {
				wraApplication =WRAApplicationLocalServiceUtil.createWRAApplication(CounterLocalServiceUtil.increment());
			}
			wraApplication.setTypeOfApplication(typeOfApplication);
			wraApplication.setTypeOfPermit(typeOfPermit);
			wraApplication.setTypeOfTransacPermit(typeOfTransationPermit);
			wraApplication.setTypeOfTransaction(typeOfTransaction);
			wraApplication.setUserWaterTypeCat(userWaterTypeCategories);
			wraApplication.setConsumptiveSubCat(consumptiveSubCategories);
			wraApplication.setNonConsumptiveSubCat(nonConsumptiveSubCategories);
			wraApplication.setIndustrialTypeSubCat(industrialTypeSubCategories);
			wraApplication.setCompanyId(themeDisplay.getCompanyId());
			wraApplication.setCreateDate(new Date());
			wraApplication.setUserId(themeDisplay.getUserId());
			wraApplication.setUserName(themeDisplay.getUser().getFullName());
			wraApplication.setStatus(WRAApplicationWorkflowConstant.PENDING_AND_DRAFT);

			if (Validator.isNull(wraApplication.getApplicationNumber())) {
				DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
				String formattedDate = df.format(Calendar.getInstance().getTime());
				SecureRandom random = new SecureRandom();
				int num = random.nextInt(100000);
				String formatted = String.format("%05d", num);
				wraApplication.setApplicationNumber(formatted + "/" + formattedDate);
			}
			WRAApplicationLocalServiceUtil.updateWRAApplication(wraApplication);
			// Updating Current Stage
			try {
				wraCurrentStage = WRAAppCurrentStageLocalServiceUtil.getByWRA_Stage(wraApplication.getWraApplicationId());
			} catch (Exception e) {
			}
			if (wraCurrentStage == null) {
				wraCurrentStage = WRAAppCurrentStageLocalServiceUtil.createWRAAppCurrentStage(CounterLocalServiceUtil.increment());
			}
			wraCurrentStage.setCurrentStage(currentStage);
			wraCurrentStage.setLastFormStep(lastFormDetailsStep);
			wraCurrentStage.setWraApplicationId(wraApplication.getWraApplicationId());
			WRAAppCurrentStageLocalServiceUtil.updateWRAAppCurrentStage(wraCurrentStage);

			jsonOBJ.put("wraAppNum", wraApplication.getApplicationNumber());
			jsonOBJ.put("category", wraApplication.getTypeOfApplication());
			jsonOBJ.put("wraApplicationId", wraApplication.getWraApplicationId());
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
