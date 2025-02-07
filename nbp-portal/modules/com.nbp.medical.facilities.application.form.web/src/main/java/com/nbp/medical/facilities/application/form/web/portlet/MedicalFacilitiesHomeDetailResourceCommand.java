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
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesHomeInfo;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesAppliInfoLocalServiceUtil;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesHomeInfoLocalServiceUtil;
import com.nbp.medical.facilities.application.form.web.constants.MedicalFacilitiesApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + MedicalFacilitiesApplicationFormPortletKeys.MEDICALFACILITIESAPPLICATIONFORM,
		"mvc.command.name=medical/facilities/home/detail" }, service = MVCResourceCommand.class)
public class MedicalFacilitiesHomeDetailResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(MedicalFacilitiesApplicantDetailResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("calling Medical Facilities Home Detail Resource Command");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long medicalApplicationId = ParamUtil.getLong(resourceRequest, "medicalApplicationId");
		String homeCarriedName = ParamUtil.getString(resourceRequest, "homeCarriedName");
		String homeAddress = ParamUtil.getString(resourceRequest, "homeAddress");
		String homeEmailAddress = ParamUtil.getString(resourceRequest, "homeEmailAddress");
		String homeTelephone = ParamUtil.getString(resourceRequest, "homeTelephone");
		String homeSitutationDescription = ParamUtil.getString(resourceRequest, "homeSitutationDescription");		
		String homeOtherBusinessPremises = ParamUtil.getString(resourceRequest, "homeOtherBusinessPremises");	
		String maternityPatientNum = ParamUtil.getString(resourceRequest, "maternityPatientNum");
		String otherPatientNum = ParamUtil.getString(resourceRequest, "otherPatientNum");		
		String deleteKey = ParamUtil.getString(resourceRequest, "deleteKey");
		String counter = ParamUtil.getString(resourceRequest, "counter");
//		primary key of this entity
		long medicalFacilitiesHomeInfoId = ParamUtil.getLong(resourceRequest, "medicalFacilitiesHomeInfoId");
		if(deleteKey.contains("deleteApplicant")) {
			try {
				MedicalFacilitiesHomeInfoLocalServiceUtil.deleteMedicalFacilitiesHomeInfo(medicalFacilitiesHomeInfoId);
			} catch (PortalException e) {
			}
		}else {
		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo=null;
		//if(Validator.isNotNull(medicalFacilitiesHomeInfoId)) {
		try {
			medicalFacilitiesHomeInfo=MedicalFacilitiesHomeInfoLocalServiceUtil.getMedicalFacilities_ByAppId(medicalApplicationId);
		} catch (Exception e) {
		}
		//}
		
		if(medicalFacilitiesHomeInfo==null){
			medicalFacilitiesHomeInfo = MedicalFacilitiesHomeInfoLocalServiceUtil
					.createMedicalFacilitiesHomeInfo(CounterLocalServiceUtil.increment(MedicalFacilitiesHomeDetailResourceCommand.class.getName()));
			medicalFacilitiesHomeInfo.setCounter(counter);
		}
		medicalFacilitiesHomeInfo.setNameOfOwner(homeCarriedName);
		medicalFacilitiesHomeInfo.setHomeAddress(homeAddress);
		medicalFacilitiesHomeInfo.setHomeTelephoneNumber(homeTelephone);
		medicalFacilitiesHomeInfo.setHomeEmailAddress(homeEmailAddress);
		medicalFacilitiesHomeInfo.setDescription(homeSitutationDescription);
		medicalFacilitiesHomeInfo.setOtherBusinessDetails(homeOtherBusinessPremises);
		medicalFacilitiesHomeInfo.setMaternityPatients(maternityPatientNum);
		medicalFacilitiesHomeInfo.setOtherPatients(otherPatientNum);
		medicalFacilitiesHomeInfo.setMedicalFacilitiesAppId(medicalApplicationId);
		MedicalFacilitiesHomeInfoLocalServiceUtil.updateMedicalFacilitiesHomeInfo(medicalFacilitiesHomeInfo);
		jsonOBJ.put("medicalFacilitiesHomeInfoId", medicalFacilitiesHomeInfo.getMedicalFacilitiesHomeInfoId());
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
