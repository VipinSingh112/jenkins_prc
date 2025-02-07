package com.nbp.medical.facilities.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesMaterHome;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesMaterHomeLocalServiceUtil;
import com.nbp.medical.facilities.application.form.web.constants.MedicalFacilitiesApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + MedicalFacilitiesApplicationFormPortletKeys.MEDICALFACILITIESAPPLICATIONFORM,
		"mvc.command.name=medical/facilities/maternity/detail" }, service = MVCResourceCommand.class)
public class MedicalFacilitiesMaternityHomeResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(MedicalFacilitiesMaternityHomeResourceCommand.class.getName());

	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("calling Medical Facilities Maternity Home Resource Command");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long medicalApplicationId = ParamUtil.getLong(resourceRequest, "medicalApplicationId");
		long medicalFacilitiesMaterHomeId = ParamUtil.getLong(resourceRequest, "medicalFacilitiesMaterHomeId");
		String maternityHomeName = ParamUtil.getString(resourceRequest, "maternityHomeName");
		String maternityHomeQualifications = ParamUtil.getString(resourceRequest, "maternityHomeQualifications");
		String maternityHomeQualified = ParamUtil.getString(resourceRequest, "maternityHomeQualified");
		String counter = ParamUtil.getString(resourceRequest, "counter");
		String deleteKey = ParamUtil.getString(resourceRequest, "deleteKey");
		if(deleteKey.contains("deleteApplicant")) {
			try {
				MedicalFacilitiesMaterHomeLocalServiceUtil.deleteMedicalFacilitiesMaterHome(medicalFacilitiesMaterHomeId);
			} catch (PortalException e) {
			}
		}else {
		MedicalFacilitiesMaterHome maternityHomeInfo = null;
		if (Validator.isNotNull(medicalFacilitiesMaterHomeId)) {
			try {
				maternityHomeInfo = MedicalFacilitiesMaterHomeLocalServiceUtil.getMedicalFacilitiesMaterHome(medicalFacilitiesMaterHomeId);
			} catch (PortalException e) {}
		} else {
			maternityHomeInfo = MedicalFacilitiesMaterHomeLocalServiceUtil.createMedicalFacilitiesMaterHome(
					CounterLocalServiceUtil.increment());
			maternityHomeInfo.setCounter(counter);
		}
		maternityHomeInfo.setNurseName(maternityHomeName);
		maternityHomeInfo.setNurseQualification(maternityHomeQualifications);
		maternityHomeInfo.setOtherPerson(maternityHomeQualified);
		maternityHomeInfo.setMedicalFacilitiesAppId(medicalApplicationId);
		MedicalFacilitiesMaterHomeLocalServiceUtil.updateMedicalFacilitiesMaterHome(maternityHomeInfo);
		jsonOBJ.put("medicalFacilitiesMaterHomeId", maternityHomeInfo.getMedicalFacilitiesMaterHomeId());
		jsonOBJ.put("counter", counter);
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Has Occured", e);
		 }
		}
		return false;
	}
}