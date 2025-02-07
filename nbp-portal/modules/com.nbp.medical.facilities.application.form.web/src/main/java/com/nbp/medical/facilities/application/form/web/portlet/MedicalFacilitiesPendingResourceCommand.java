package com.nbp.medical.facilities.application.form.web.portlet;

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
import com.nbp.medical.facilities.application.form.service.model.MedicalCurrentStage;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesApp;
import com.nbp.medical.facilities.application.form.service.service.MedicalCurrentStageLocalServiceUtil;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesAppLocalServiceUtil;
import com.nbp.medical.facilities.application.form.web.constants.MedicalFacilitiesApplicationFormPortletKeys;
import com.nbp.medical.facilities.application.form.web.constants.MedicalFacilitiesApplicationWorkflowConstant;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + MedicalFacilitiesApplicationFormPortletKeys.MEDICALFACILITIESAPPLICATIONFORM,
		"mvc.command.name=medical/facilities/pending" }, service = MVCResourceCommand.class)
public class MedicalFacilitiesPendingResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(MedicalFacilitiesPendingResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long medicalFacilitiesAppId = ParamUtil.getLong(resourceRequest, "medicalFacilitiesAppId");
		String natureOfApplicant = ParamUtil.getString(resourceRequest, "natureOfApplicant");
		String typeOfTransaction = ParamUtil.getString(resourceRequest, "typeOfTransaction");
		String medicalFacilitiesCategory = ParamUtil.getString(resourceRequest,"medicalFacilitiesCategory");
		String medicalFacilitiesSubCategoryTypeVal = ParamUtil.getString(resourceRequest,"medicalFacilitiesSubCategoryTypeVal");
		String longTermCareFacilities = ParamUtil.getString(resourceRequest, "longTermCareFacilities");
		String nursingHomeCategoryVal = ParamUtil.getString(resourceRequest, "nursingHomeCategoryVal");
		String nursingHomesSubCategoryVal = ParamUtil.getString(resourceRequest, "nursingHomesSubCategoryVal");
		String residentsFacility = ParamUtil.getString(resourceRequest, "residentsFacility");
		String currentStage = ParamUtil.getString(resourceRequest, "currentStage");
		String lastFormDetailsStep = ParamUtil.getString(resourceRequest, "lastFormDetailsStep");
		
		MedicalFacilitiesApp medicalFacilitiesApp = null;
		MedicalCurrentStage medicalCurrentStage=null;
		try {
			medicalFacilitiesApp = MedicalFacilitiesAppLocalServiceUtil.getMedicalFacilitiesApp(medicalFacilitiesAppId);
		} catch (Exception e) {
		}
		if (Validator.isNull(medicalFacilitiesApp)) {
			medicalFacilitiesApp = MedicalFacilitiesAppLocalServiceUtil.createMedicalFacilitiesApp(
					CounterLocalServiceUtil.increment());
		}
		medicalFacilitiesApp.setNatureOfApplicant(natureOfApplicant);
		medicalFacilitiesApp.setTypeOfTransaction(typeOfTransaction);
		medicalFacilitiesApp.setMedicalCategory(medicalFacilitiesCategory);
		medicalFacilitiesApp.setNursingHomesCategory(nursingHomeCategoryVal);
		if(medicalFacilitiesCategory.equals("Long Term Care Facilities")) {
			medicalFacilitiesApp.setSubCategory(longTermCareFacilities);
		}else if (medicalFacilitiesCategory.equals("Hospitals")||medicalFacilitiesCategory.equals("Ambulatory Facilities")) {
			medicalFacilitiesApp.setSubCategory(medicalFacilitiesSubCategoryTypeVal);
		}
		
		medicalFacilitiesApp.setNumberOfBeds(residentsFacility);
		medicalFacilitiesApp.setNursingSubCategoryVal(nursingHomesSubCategoryVal);
		medicalFacilitiesApp.setCompanyId(themeDisplay.getCompanyId());
		medicalFacilitiesApp.setGroupId(themeDisplay.getScopeGroupId());
		medicalFacilitiesApp.setCreateDate(new Date());
		medicalFacilitiesApp.setUserId(themeDisplay.getUserId());
		medicalFacilitiesApp.setUserName(themeDisplay.getUser().getFullName());
		medicalFacilitiesApp.setStatus(MedicalFacilitiesApplicationWorkflowConstant.PENDING_AND_DRAFT);
		if (Validator.isNull(medicalFacilitiesApp.getApplicationNumber())) {
			DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
			String formattedDate = df.format(Calendar.getInstance().getTime());
			SecureRandom random = new SecureRandom();
			int num = random.nextInt(100000);
			String formatted = String.format("%05d", num);
			medicalFacilitiesApp.setApplicationNumber(formatted + "/" + formattedDate);
		}
		MedicalFacilitiesAppLocalServiceUtil.updateMedicalFacilitiesApp(medicalFacilitiesApp);
		
		// Updating Current Stage
		try {
			medicalCurrentStage = MedicalCurrentStageLocalServiceUtil.getByMED_Stage(medicalFacilitiesAppId);
		} catch (Exception e) {
		}
		if (medicalCurrentStage == null) {
			medicalCurrentStage = MedicalCurrentStageLocalServiceUtil.createMedicalCurrentStage(CounterLocalServiceUtil.increment());
		}
		medicalCurrentStage.setCurrentStage(currentStage);
		medicalCurrentStage.setLastFormStep(lastFormDetailsStep);
		medicalCurrentStage.setMedicalFacilitiesAppId(medicalFacilitiesApp.getMedicalFacilitiesAppId());
		MedicalCurrentStageLocalServiceUtil.updateMedicalCurrentStage(medicalCurrentStage);

		jsonOBJ.put("medAppNo", medicalFacilitiesApp.getApplicationNumber());
		jsonOBJ.put("category", medicalFacilitiesApp.getMedicalCategory());
		jsonOBJ.put("medicalApplicationId", medicalFacilitiesApp.getMedicalFacilitiesAppId());

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
