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
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesHomeTwo;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesHomeTwoLocalServiceUtil;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesNurseDetailLocalServiceUtil;
import com.nbp.medical.facilities.application.form.web.constants.MedicalFacilitiesApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + MedicalFacilitiesApplicationFormPortletKeys.MEDICALFACILITIESAPPLICATIONFORM,
		"mvc.command.name=medical/facilities/patient/count" }, service = MVCResourceCommand.class)
public class MedicalFacilitiesPatientProvidedResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(MedicalFacilitiesPatientProvidedResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long medicalApplicationId = ParamUtil.getLong(resourceRequest, "medicalApplicationId");
		long medicalFacilitiesHomeTwoId = ParamUtil.getLong(resourceRequest, "medicalFacilitiesHomeTwoId");
		String maternityPatientNum = ParamUtil.getString(resourceRequest, "maternityPatientNum");
		String otherPatientNum = ParamUtil.getString(resourceRequest, "otherPatientNum");				
		String counter = ParamUtil.getString(resourceRequest, "counter");
		String deleteKey = ParamUtil.getString(resourceRequest, "deleteKey");
		if(deleteKey.contains("deleteApplicant")) {
			try {
				MedicalFacilitiesHomeTwoLocalServiceUtil.deleteMedicalFacilitiesHomeTwo(medicalFacilitiesHomeTwoId);
			} catch (PortalException e) {
			}
		}else {
		MedicalFacilitiesHomeTwo medicalFacilitiesHomeTwo =null;
		if(Validator.isNotNull(medicalFacilitiesHomeTwoId)) {
			try {
				medicalFacilitiesHomeTwo=MedicalFacilitiesHomeTwoLocalServiceUtil.getMedicalFacilitiesHomeTwo(medicalFacilitiesHomeTwoId);
			} catch (Exception e) {}
		}else{
			medicalFacilitiesHomeTwo = MedicalFacilitiesHomeTwoLocalServiceUtil
					.createMedicalFacilitiesHomeTwo(CounterLocalServiceUtil.increment(MedicalFacilitiesHomeDetailResourceCommand.class.getName()));
			medicalFacilitiesHomeTwo.setCounter(counter);
		}
		medicalFacilitiesHomeTwo.setMaternityPatients(maternityPatientNum);
		medicalFacilitiesHomeTwo.setOtherPatients(otherPatientNum);
		
		medicalFacilitiesHomeTwo.setMedicalFacilitiesAppId(medicalApplicationId);
		MedicalFacilitiesHomeTwoLocalServiceUtil.updateMedicalFacilitiesHomeTwo(medicalFacilitiesHomeTwo);
		jsonOBJ.put("medicalFacilitiesHomeTwoId", medicalFacilitiesHomeTwo.getMedicalFacilitiesHomeTwoId());
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