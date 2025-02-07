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
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesNurseDetail;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesNurseDetailLocalServiceUtil;
import com.nbp.medical.facilities.application.form.web.constants.MedicalFacilitiesApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + MedicalFacilitiesApplicationFormPortletKeys.MEDICALFACILITIESAPPLICATIONFORM,
		"mvc.command.name=medical/facilities/medical/practitioner/detail" }, service = MVCResourceCommand.class)
public class MedicalFacilitiesMedicalPractitionerResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(MedicalFacilitiesMedicalPractitionerResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long medicalApplicationId = ParamUtil.getLong(resourceRequest, "medicalApplicationId");
		long medicalFacilitiesNurseDetailId = ParamUtil.getLong(resourceRequest, "medicalFacilitiesNurseDetailId");
		String medicalPractitionerName = ParamUtil.getString(resourceRequest, "medicalPractitionerName");
		String medicalPractitionerQualifications = ParamUtil.getString(resourceRequest, "medicalPractitionerQualifications");
		String medicalPractitionerQualifiesNurseRatio = ParamUtil.getString(resourceRequest, "medicalPractitionerQualifiesNurseRatio");		
		String counter = ParamUtil.getString(resourceRequest, "counter");
		String deleteKey = ParamUtil.getString(resourceRequest, "deleteKey");
		if(deleteKey.contains("deleteApplicant")) {
			try {
				MedicalFacilitiesNurseDetailLocalServiceUtil.deleteMedicalFacilitiesNurseDetail(medicalFacilitiesNurseDetailId);
			} catch (PortalException e) {
			}
		}else {
		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail =null;
		if(Validator.isNotNull(medicalFacilitiesNurseDetailId)) {
		try {
			medicalFacilitiesNurseDetail=MedicalFacilitiesNurseDetailLocalServiceUtil.getMedicalFacilitiesNurseDetail(medicalFacilitiesNurseDetailId);
		} catch (Exception e) {}
		}else{
			medicalFacilitiesNurseDetail = MedicalFacilitiesNurseDetailLocalServiceUtil
					.createMedicalFacilitiesNurseDetail(CounterLocalServiceUtil.increment(MedicalFacilitiesMedicalPractitionerResourceCommand.class.getName()));
			medicalFacilitiesNurseDetail.setCounter(counter);
		}
		medicalFacilitiesNurseDetail.setQNurseName(medicalPractitionerName);
		medicalFacilitiesNurseDetail.setQNurseQualification(medicalPractitionerQualifications);
		medicalFacilitiesNurseDetail.setRatioOfQNurses(medicalPractitionerQualifiesNurseRatio);
		
		medicalFacilitiesNurseDetail.setMedicalFacilitiesAppId(medicalApplicationId);
		MedicalFacilitiesNurseDetailLocalServiceUtil.updateMedicalFacilitiesNurseDetail(medicalFacilitiesNurseDetail);
		jsonOBJ.put("medicalFacilitiesNurseDetailId", medicalFacilitiesNurseDetail.getMedicalFacilitiesNurseDetailId());
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
