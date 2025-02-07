package com.nbp.jannac.application.form.category.inspection.bodies;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AddInsOrgInfoThird;
import com.nbp.janaac.application.form.service.service.AddInsOrgInfoThirdLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=add/inspection/bodies/organization/third" }, service = MVCResourceCommand.class)
public class AddInspectionOrganizationThirdResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddInspectionOrganizationThirdResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------inside add inspection Organization third  -------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String inspectionActivity = ParamUtil.getString(resourceRequest, "inspectionActivity");
		String fieldOfInspection = ParamUtil.getString(resourceRequest, "fieldOfInspection");
		String typeAndRangeOfInspection = ParamUtil.getString(resourceRequest, "typeAndRangeOfInspection");
		String methodAndProcedure = ParamUtil.getString(resourceRequest, "methodAndProcedure");
		String equipment = ParamUtil.getString(resourceRequest, "equipment");
		String limitsOfCapabilities = ParamUtil.getString(resourceRequest, "limitsOfCapabilities");
		long uniqueId = ParamUtil.getLong(resourceRequest, "uniqueId");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String counterOforganizationThird = ParamUtil.getString(resourceRequest, "counterOforganizationThird");

		AddInsOrgInfoThird orgInfoThird = null;
		try {
			orgInfoThird = AddInsOrgInfoThirdLocalServiceUtil.getAddInsOrgInfoThird(uniqueId);
		} catch (PortalException e) {
		}

		if (Validator.isNull(orgInfoThird)) {
			orgInfoThird = AddInsOrgInfoThirdLocalServiceUtil
					.createAddInsOrgInfoThird(CounterLocalServiceUtil.increment());
			orgInfoThird.setCounter(counterOforganizationThird);
		}
		orgInfoThird.setInspectionActivity(inspectionActivity);
		orgInfoThird.setFieldOfInspection(fieldOfInspection);
		orgInfoThird.setTypeOfInspection(typeAndRangeOfInspection);
		orgInfoThird.setMethod(methodAndProcedure);
		orgInfoThird.setEqipment(equipment);
		orgInfoThird.setLimitsOfCapabilities(limitsOfCapabilities);
		orgInfoThird.setJanaacApplicationId(janaacApplicationId);
		AddInsOrgInfoThirdLocalServiceUtil.updateAddInsOrgInfoThird(orgInfoThird);
		jsonOBJ.put("uniqueId", orgInfoThird.getAddInsOrgInfoThirdId());
		jsonOBJ.put("counter", orgInfoThird.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}

		return false;
	}
}
