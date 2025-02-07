package com.nbp.jannac.application.form.category.accreditation.lab;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AddLabTestStructuralReqSec;
import com.nbp.janaac.application.form.service.service.AddLabTestStructuralReqSecLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=add/lab/test/structural/req/Sec" }, service = MVCResourceCommand.class)
public class AddLabTestStructuralRequirementSecResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddLabApplicationInfoResouceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------inside AddLabTestStructuralRequirementSecResourceCommand started-------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();

		String product = ParamUtil.getString(resourceRequest, "product");
		String tests = ParamUtil.getString(resourceRequest, "tests");
		String method = ParamUtil.getString(resourceRequest, "method");
		String equipment = ParamUtil.getString(resourceRequest, "equipment");
		String limitOfCapability = ParamUtil.getString(resourceRequest, "limitOfCapability");
		String counterOfStructuralReq = ParamUtil.getString(resourceRequest, "counterOfStructuralReq");
		String estimateOfMeasurement = ParamUtil.getString(resourceRequest, "estimateOfMeasurement");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		long uniqueId = ParamUtil.getLong(resourceRequest, "uniqueId");
		AddLabTestStructuralReqSec labStructInfo = null;
		try {
			labStructInfo = AddLabTestStructuralReqSecLocalServiceUtil.getAddLabTestStructuralReqSec(uniqueId);
		} catch (PortalException e1) {
		}
		if (Validator.isNull(labStructInfo)) {
			labStructInfo = AddLabTestStructuralReqSecLocalServiceUtil
					.createAddLabTestStructuralReqSec(CounterLocalServiceUtil.increment());
			labStructInfo.setCounter(counterOfStructuralReq);
		}
		labStructInfo.setProductMaterial(product);
		labStructInfo.setTests(tests);
		labStructInfo.setMethod(method);
		labStructInfo.setEquipment(equipment);
		labStructInfo.setListOfCapability(limitOfCapability);
		labStructInfo.setEstimateOfMeasurement(estimateOfMeasurement);
		labStructInfo.setJanaacApplicationId(janaacApplicationId);
		AddLabTestStructuralReqSecLocalServiceUtil.updateAddLabTestStructuralReqSec(labStructInfo);
		jsonOBJ.put("uniqueId", labStructInfo.getAddLabTestStructuralReqSecId());
		jsonOBJ.put("counter", labStructInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}

}
