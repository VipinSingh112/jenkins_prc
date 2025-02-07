package com.nbp.jtb.application.form.web.portlet;

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
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.model.JTBCurrentStage;
import com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBCurrentStageLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/save/To/Draft" }, service = MVCResourceCommand.class)
public class SaveToDraftApplicationResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(SaveToDraftApplicationResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[JTB APPLICATION DRAFT START]");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		String typeOfLicenceApplied=ParamUtil.getString(resourceRequest, "typeOfApplication");
		String accommodationCategoryTypeValAccomodation=ParamUtil.getString(resourceRequest, "accommodationCategoryTypeValAccomodation");
		String nonHotelsCategoryTypeValAccomodation=ParamUtil.getString(resourceRequest, "nonHotelsCategoryTypeValAccomodation");
		String attractionCategoryTypeVal=ParamUtil.getString(resourceRequest, "attractionCategoryTypeVal");
		String jtbTransactionTypeValAccomodation=ParamUtil.getString(resourceRequest, "jtbTransactionTypeValAccomodation");
		String domesticToursTypeVal=ParamUtil.getString(resourceRequest, "domesticToursTypeVal");
		String otherCategories=ParamUtil.getString(resourceRequest, "otherCategories");
		String currentStage = ParamUtil.getString(resourceRequest, "currentStage");
		String saveAndContinue = ParamUtil.getString(resourceRequest, "saveAndContinue");
		String lastFormDetailsStep = ParamUtil.getString(resourceRequest, "lastFormDetailsStep");
		JTBApplication application=null;
		try {
			application=JTBApplicationLocalServiceUtil.getJTBApplication(jtbApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(application==null) {
			application=JTBApplicationLocalServiceUtil.createJTBApplication(CounterLocalServiceUtil.increment());
					
		}
		application.setTypeOfApplication(typeOfLicenceApplied);
		application.setCategoryTypeValAccomo(accommodationCategoryTypeValAccomodation);
		application.setNonHotelSubCategory(nonHotelsCategoryTypeValAccomodation);
		application.setAttractionCategoryTypeVal(attractionCategoryTypeVal);
		application.setDomesticToursType(domesticToursTypeVal);
		application.setOtherCategories(otherCategories);
		application.setJtbTransactionTypeVal(jtbTransactionTypeValAccomodation);
		application.setCompanyId(themeDisplay.getCompanyId());
		application.setGroupId(themeDisplay.getScopeGroupId());
		application.setUserId(themeDisplay.getUserId());
		application.setUserName(themeDisplay.getUser().getFullName());
		application.setStatus(JTBApplicationFormWebPortletKeys.DRAFT);
		if (Validator.isNull(application.getApplicationNumber())) {
			  DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
			  String formattedDate = df.format(Calendar.getInstance().getTime());
			  SecureRandom random = new SecureRandom(); int num = random.nextInt(100000);
			  String formatted = String.format("%05d", num);
			  application.setApplicationNumber(formatted + "/" + formattedDate);
		}
		JTBApplicationLocalServiceUtil.updateJTBApplication(application);
		/* Current Stage */
		JTBCurrentStage jtbCurrentStage = null;
		try {
			jtbCurrentStage = JTBCurrentStageLocalServiceUtil.getByJTB_Stage(application.getJtbApplicationId());
		} catch (Exception e) {
		}
		if (jtbCurrentStage == null) {
			jtbCurrentStage = JTBCurrentStageLocalServiceUtil
					.createJTBCurrentStage(CounterLocalServiceUtil.increment());
		}
		jtbCurrentStage.setLastFormStep(lastFormDetailsStep);
		jtbCurrentStage.setCurrentStage(currentStage);
		jtbCurrentStage.setJtbApplicationId(application.getJtbApplicationId());
		JTBCurrentStageLocalServiceUtil.updateJTBCurrentStage(jtbCurrentStage);
		
		jsonOBJ.put("jtbApplicationId", application.getJtbApplicationId());
		jsonOBJ.put("applicationNumber", application.getApplicationNumber());
		if (application.getTypeOfApplication().contains("Accommodations Licence")) {
			jsonOBJ.put("category", application.getCategoryTypeValAccomo());
		} else if (application.getTypeOfApplication().contains("Attractions")) {
			jsonOBJ.put("category", application.getAttractionCategoryTypeVal());
		} else if (application.getTypeOfApplication().contains("Other Tourism Related Licences")) {
			jsonOBJ.put("category", application.getOtherCategories());
		}
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Has Occured", e);
		}
		_log.info("JTB APPLICATION DRAFT END");
		return false;
	}
	@Reference
	private CommonsUtil commonsUtil;
}
