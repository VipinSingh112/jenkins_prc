package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.model.MedicalPractitionerAdd;
import com.nbp.hsra.application.service.service.MedicalPractitionerAddLocalServiceUtil;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/medical/practitioner/detail/add/form" }, service = MVCResourceCommand.class)
public class HSRAMedicalPractitionerAddResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(HSRAMedicalPractitionerAddResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("******calling Add medical practitioner Resouce Command*******");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String medicalPractitionerName = ParamUtil.getString(resourceRequest, "medicalPractitionerName");
		String medicalPractitionerAddress = ParamUtil.getString(resourceRequest, "medicalPractitionerAddress");
		String medicalPractitionerTelephone = ParamUtil.getString(resourceRequest, "medicalPractitionerTelephone");
		String medicalPractitionerFax = ParamUtil.getString(resourceRequest, "medicalPractitionerFax");
		String medicalPractitionerEmail = ParamUtil.getString(resourceRequest, "medicalPractitionerEmail");
		String medicalPractitionerLicenceNo = ParamUtil.getString(resourceRequest, "medicalPractitionerLicenceNo");
		String counterOfPractitioner = ParamUtil.getString(resourceRequest, "counterOfPractitioner");
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		long medicalPractitionerDetailId = ParamUtil.getLong(resourceRequest, "medicalPractitionerDetailId");

		MedicalPractitionerAdd medicalInfo = null;
		try {
			medicalInfo = MedicalPractitionerAddLocalServiceUtil.getMedicalPractitionerAdd(medicalPractitionerDetailId);
		} catch (PortalException e1) {
		}
		if (Validator.isNull(medicalInfo)) {
			medicalInfo = MedicalPractitionerAddLocalServiceUtil
					.createMedicalPractitionerAdd(CounterLocalServiceUtil.increment());
			medicalInfo.setCounter(counterOfPractitioner);
		}
		medicalInfo.setMedicalPractitionerName(medicalPractitionerName);
		medicalInfo.setMedicalPractitionerAddress(medicalPractitionerAddress);
		medicalInfo.setMedicalPractitionerTelephone(medicalPractitionerTelephone);
		medicalInfo.setMedicalPractitionerFax(medicalPractitionerFax);
		medicalInfo.setMedicalPractitionerEmail(medicalPractitionerEmail);
		medicalInfo.setMedicalPractitionerLicenceNo(medicalPractitionerLicenceNo);
		medicalInfo.setHsraApplicationId(hsraApplicationId);
		MedicalPractitionerAddLocalServiceUtil.updateMedicalPractitionerAdd(medicalInfo);
		jsonOBJ.put("practitionerDetailId", medicalInfo.getMedicalPractitionerAddId());
		jsonOBJ.put("counter", medicalInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}
}
