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
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesComDetail;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesComDetailLocalServiceUtil;
import com.nbp.medical.facilities.application.form.web.constants.MedicalFacilitiesApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + MedicalFacilitiesApplicationFormPortletKeys.MEDICALFACILITIESAPPLICATIONFORM,
		"mvc.command.name=medical/facilities/company/detail" }, service = MVCResourceCommand.class)
public class MedicalFacilitiesCompanyDetailResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(MedicalFacilitiesNursingStaffDetailResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long medicalApplicationId = ParamUtil.getLong(resourceRequest, "medicalApplicationId");
		long medicalFacilitiesComDetailId = ParamUtil.getLong(resourceRequest, "medicalFacilitiesComDetailId");
		String comFullName = ParamUtil.getString(resourceRequest, "comFullName");
		String comAddress = ParamUtil.getString(resourceRequest, "comAddress");
		String comOffice = ParamUtil.getString(resourceRequest, "comOffice");		
		String counter = ParamUtil.getString(resourceRequest, "counter");
		String deleteKey = ParamUtil.getString(resourceRequest, "deleteKey");
		if(deleteKey.contains("deleteApplicant")) {
			try {
				MedicalFacilitiesComDetailLocalServiceUtil.deleteMedicalFacilitiesComDetail(medicalFacilitiesComDetailId);
			} catch (PortalException e) {
			}
		}else {
		MedicalFacilitiesComDetail medicalFacilitiesComDetail= null;
		
		if(Validator.isNotNull(medicalFacilitiesComDetailId)) {
		try {
			medicalFacilitiesComDetail=MedicalFacilitiesComDetailLocalServiceUtil.getMedicalFacilitiesComDetail(medicalFacilitiesComDetailId);
		} catch (Exception e) {}
		}else{
			medicalFacilitiesComDetail = MedicalFacilitiesComDetailLocalServiceUtil
					.createMedicalFacilitiesComDetail(CounterLocalServiceUtil.increment());
			medicalFacilitiesComDetail.setCounter(counter);
		}
		medicalFacilitiesComDetail.setFullName(comFullName);
		medicalFacilitiesComDetail.setPrivateAddress(comAddress);
		medicalFacilitiesComDetail.setRegisteredOffice(comOffice);
		
		medicalFacilitiesComDetail.setMedicalFacilitiesAppId(medicalApplicationId);		
		MedicalFacilitiesComDetailLocalServiceUtil.updateMedicalFacilitiesComDetail(medicalFacilitiesComDetail);
		jsonOBJ.put("medicalFacilitiesComDetailId", medicalFacilitiesComDetail.getMedicalFacilitiesComDetailId());
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
