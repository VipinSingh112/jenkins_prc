package com.nbp.jannac.application.form.category.accreditation.lab;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AddLabMedicalOrganSec;
import com.nbp.janaac.application.form.service.service.AddLabMedicalOrganSecLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/add/examinations/scope/detail/data" }, service = MVCResourceCommand.class)
public class AddLabTheOrganizationSecondResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddLabTheOrganizationSecondResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------inside add lab organization second resouce command-------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();

		String product = ParamUtil.getString(resourceRequest, "product");
		String examinations = ParamUtil.getString(resourceRequest, "examinations");
		String methods = ParamUtil.getString(resourceRequest, "methods");
		String equipment = ParamUtil.getString(resourceRequest, "equipment");
		String referenceRange = ParamUtil.getString(resourceRequest, "referenceRange");
		String measurementUncertainty = ParamUtil.getString(resourceRequest, "measurementUncertainty");
		long examinationsScopeId = ParamUtil.getLong(resourceRequest, "examinationsScopeId");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String counterOfExaminations = ParamUtil.getString(resourceRequest, "counterOfExaminations");
		AddLabMedicalOrganSec organLabSecInfo = null;
		try {
			organLabSecInfo = AddLabMedicalOrganSecLocalServiceUtil.getAddLabMedicalOrganSec(examinationsScopeId);
		} catch (Exception e) {
		}
		if (Validator.isNull(organLabSecInfo)) {
			organLabSecInfo = AddLabMedicalOrganSecLocalServiceUtil
					.createAddLabMedicalOrganSec(CounterLocalServiceUtil.increment());
			organLabSecInfo.setCounter(counterOfExaminations);
		}
		organLabSecInfo.setProduct(product);
		organLabSecInfo.setExamination(examinations);
		organLabSecInfo.setMethods(methods);
		organLabSecInfo.setEquipment(equipment);
		organLabSecInfo.setReferenceRange(referenceRange);
		organLabSecInfo.setMeasurementUncertainty(measurementUncertainty);
		organLabSecInfo.setJanaacApplicationId(janaacApplicationId);

		AddLabMedicalOrganSecLocalServiceUtil.updateAddLabMedicalOrganSec(organLabSecInfo);
		jsonOBJ.put("examinationsScopeId", organLabSecInfo.getAddLabMedicalOrganSecId());
		jsonOBJ.put("counter", organLabSecInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}

		return false;
	}
}