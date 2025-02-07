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
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesAppliInfo;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesAppliInfoLocalServiceUtil;
import com.nbp.medical.facilities.application.form.web.constants.MedicalFacilitiesApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + MedicalFacilitiesApplicationFormPortletKeys.MEDICALFACILITIESAPPLICATIONFORM,
		"mvc.command.name=medical/facilities/applicant/detail" }, service = MVCResourceCommand.class)
public class MedicalFacilitiesApplicantDetailResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(MedicalFacilitiesApplicantDetailResourceCommand.class.getName());

	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("calling Medical Facilities Applicant Detail Resource Command");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long medicalApplicationId = ParamUtil.getLong(resourceRequest, "medicalApplicationId");
		String applicantName = ParamUtil.getString(resourceRequest, "applicantName");
		String applicantTelephone = ParamUtil.getString(resourceRequest, "applicantTelephone");
		String applicantAddress = ParamUtil.getString(resourceRequest, "applicantAddress");
		String applicantEmailAddress = ParamUtil.getString(resourceRequest, "applicantEmailAddress");
		_log.info("applicantEmailAddress****************************"+applicantEmailAddress);
		_log.info("applicantAddress****************************"+applicantAddress);
		String applicantNationality = ParamUtil.getString(resourceRequest, "applicantNationality");
		String deleteKey = ParamUtil.getString(resourceRequest, "deleteKey");
		String counter = ParamUtil.getString(resourceRequest, "counter");
		// primary key of this Entity
		long medicalFacilitiesAppliId = ParamUtil.getLong(resourceRequest, "medicalFacilitiesAppliId");
		if(deleteKey.contains("deleteApplicant")) {
			try {
				MedicalFacilitiesAppliInfoLocalServiceUtil.deleteMedicalFacilitiesAppliInfo(medicalFacilitiesAppliId);
			} catch (PortalException e) {
			}
		}else {
		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo = null;
		if (Validator.isNotNull(medicalFacilitiesAppliId)) {
			try {
				medicalFacilitiesAppliInfo = MedicalFacilitiesAppliInfoLocalServiceUtil
						.getMedicalFacilitiesAppliInfo(medicalFacilitiesAppliId);
			} catch (PortalException e) {}
		} else {
			medicalFacilitiesAppliInfo = MedicalFacilitiesAppliInfoLocalServiceUtil.createMedicalFacilitiesAppliInfo(
					CounterLocalServiceUtil.increment(MedicalFacilitiesApplicantDetailResourceCommand.class.getName()));
			medicalFacilitiesAppliInfo.setCounter(counter);
		}
		medicalFacilitiesAppliInfo.setApplicantName(applicantName);
		medicalFacilitiesAppliInfo.setAppliTelephoneNumber(applicantTelephone);
		medicalFacilitiesAppliInfo.setAppliAddress(applicantAddress);
		medicalFacilitiesAppliInfo.setAppliEmailAddress(applicantEmailAddress);
		medicalFacilitiesAppliInfo.setAppliNationality(applicantNationality);
		medicalFacilitiesAppliInfo.setMedicalFacilitiesAppId(medicalApplicationId);
		MedicalFacilitiesAppliInfoLocalServiceUtil.updateMedicalFacilitiesAppliInfo(medicalFacilitiesAppliInfo);
		jsonOBJ.put("medicalFacilitiesAppliId", medicalFacilitiesAppliInfo.getMedicalFacilitiesAppliId());
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