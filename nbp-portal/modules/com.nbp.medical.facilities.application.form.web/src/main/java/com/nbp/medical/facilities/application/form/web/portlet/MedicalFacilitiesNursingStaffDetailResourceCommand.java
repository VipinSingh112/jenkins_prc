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
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesNurseStaff;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesComDetailLocalServiceUtil;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesNurseStaffLocalServiceUtil;
import com.nbp.medical.facilities.application.form.web.constants.MedicalFacilitiesApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + MedicalFacilitiesApplicationFormPortletKeys.MEDICALFACILITIESAPPLICATIONFORM,
		"mvc.command.name=medical/facilities/nursing/staff/detail" }, service = MVCResourceCommand.class)
public class MedicalFacilitiesNursingStaffDetailResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(MedicalFacilitiesNursingStaffDetailResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long medicalApplicationId = ParamUtil.getLong(resourceRequest, "medicalApplicationId");
		long medicalFacilitiesNurseStaffId = ParamUtil.getLong(resourceRequest, "medicalFacilitiesNurseStaffId");
		String nursingStaffName = ParamUtil.getString(resourceRequest, "nursingStaffName");
		String nursingStaffQualifications = ParamUtil.getString(resourceRequest, "nursingStaffQualifications");
		String nursingStaffCategory = ParamUtil.getString(resourceRequest, "nursingStaffCategory");
		String counter = ParamUtil.getString(resourceRequest, "counter");
		String deleteKey = ParamUtil.getString(resourceRequest, "deleteKey");
		if(deleteKey.contains("deleteApplicant")) {
			try {
				MedicalFacilitiesNurseStaffLocalServiceUtil.deleteMedicalFacilitiesNurseStaff(medicalFacilitiesNurseStaffId);
			} catch (PortalException e) {
			}
		}else {
		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff = null;
		if(Validator.isNotNull(medicalFacilitiesNurseStaffId)) {
		try {
			medicalFacilitiesNurseStaff = MedicalFacilitiesNurseStaffLocalServiceUtil
					.getMedicalFacilitiesNurseStaff(medicalFacilitiesNurseStaffId);
		} catch (Exception e) {}
		}else {
			medicalFacilitiesNurseStaff = MedicalFacilitiesNurseStaffLocalServiceUtil.createMedicalFacilitiesNurseStaff(CounterLocalServiceUtil.increment(MedicalFacilitiesNursingStaffDetailResourceCommand.class.getName()));
			medicalFacilitiesNurseStaff.setCounter(counter);
		}
		medicalFacilitiesNurseStaff.setNStaffName(nursingStaffName);
		medicalFacilitiesNurseStaff.setNStaffQualification(nursingStaffQualifications);
		medicalFacilitiesNurseStaff.setNStaffState(nursingStaffCategory);
		
		medicalFacilitiesNurseStaff.setMedicalFacilitiesAppId(medicalApplicationId);
		MedicalFacilitiesNurseStaffLocalServiceUtil.updateMedicalFacilitiesNurseStaff(medicalFacilitiesNurseStaff);
		jsonOBJ.put("medicalFacilitiesNurseStaffId", medicalFacilitiesNurseStaff.getMedicalFacilitiesNurseStaffId());
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
