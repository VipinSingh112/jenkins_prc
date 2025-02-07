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
import com.nbp.hsra.application.service.model.AddMedicalPractitioner;
import com.nbp.hsra.application.service.service.AddMedicalPractitionerLocalServiceUtil;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
	"mvc.command.name=add/acknowledge/medical/detail" }, service = MVCResourceCommand.class)


public class AddAcknowledgementOfMedicalPractitionerResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddAcknowledgementOfMedicalPractitionerResourceCommand.class.getName());


	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		long id = ParamUtil.getLong(resourceRequest, "id");
		String acknowledgementMedicalDate = ParamUtil.getString(resourceRequest, "acknowledgementMedicalDate");
        String applicantSignatureDate = ParamUtil.getString(resourceRequest, "applicantSignatureDate");

		String counter = ParamUtil.getString(resourceRequest, "counter");
		String deleteKey = ParamUtil.getString(resourceRequest, "deleteKey");
		if(deleteKey.contains("deleteApplicant")) {
			try {
				AddMedicalPractitionerLocalServiceUtil.deleteAddMedicalPractitioner(id);
			} catch (PortalException e) {
			}
		}else {
			AddMedicalPractitioner medical = null;
		if (Validator.isNotNull(id)) {
			try {
				medical = AddMedicalPractitionerLocalServiceUtil.getAddMedicalPractitioner(id);
			} catch (PortalException e) {}
		} else {
			medical = AddMedicalPractitionerLocalServiceUtil.createAddMedicalPractitioner(CounterLocalServiceUtil.increment(AddAcknowledgementOfMedicalPractitionerResourceCommand.class.getName()));
			medical.setCounter(counter);
			medical.setHsraApplicationId(hsraApplicationId);
		}
		
		try {
			if (Validator.isNotNull(acknowledgementMedicalDate)) {
				medical.setMedicalPractitionerDate(new SimpleDateFormat("yyyy-MM-dd").parse(acknowledgementMedicalDate));
			}
		} catch (Exception e) {
		}
		try {
			if (Validator.isNotNull(applicantSignatureDate)) {
				System.out.println("-----------------inside date condition------------------");
				medical.setApplicantDate(new SimpleDateFormat("yyyy-MM-dd").parse(applicantSignatureDate));
			}
		} catch (Exception e) {
		}
		
		
		
		AddMedicalPractitionerLocalServiceUtil.updateAddMedicalPractitioner(medical);
		jsonOBJ.put("id",medical.getAddMedicalPractitionerId());
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
