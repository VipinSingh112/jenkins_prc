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
import com.nbp.janaac.application.form.service.model.AddInsOrgInfoSecond;
import com.nbp.janaac.application.form.service.service.AddInsOrgInfoSecondLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=add/inspection/bodies/organization/second" }, service = MVCResourceCommand.class)
public class AddInspectionOrganizationSecondResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddInspectionOrganizationSecondResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------inside add inspection Organization Second  -------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String nameOfStaf = ParamUtil.getString(resourceRequest, "nameOfStaf");
		String jobTitle = ParamUtil.getString(resourceRequest, "jobTitle");
		String majorResponsibility = ParamUtil.getString(resourceRequest, "majorResponsibility");
		String indicateInspector = ParamUtil.getString(resourceRequest, "indicateInspector");
		long uniqueId = ParamUtil.getLong(resourceRequest, "uniqueId");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String counterOforganizationSecond = ParamUtil.getString(resourceRequest, "counterOforganizationSecond");

		AddInsOrgInfoSecond orgInfoSec = null;
		try {
			orgInfoSec = AddInsOrgInfoSecondLocalServiceUtil.getAddInsOrgInfoSecond(uniqueId);
		} catch (PortalException e) {
		}

		if (Validator.isNull(orgInfoSec)) {
			orgInfoSec = AddInsOrgInfoSecondLocalServiceUtil
					.createAddInsOrgInfoSecond(CounterLocalServiceUtil.increment());
			orgInfoSec.setCounter(counterOforganizationSecond);
		}
		orgInfoSec.setNameOfStaff(nameOfStaf);
		orgInfoSec.setJobTitle(jobTitle);
		orgInfoSec.setMajorResponsibilities(majorResponsibility);
		orgInfoSec.setIndexInspector(indicateInspector);
		orgInfoSec.setJanaacApplicationId(janaacApplicationId);
		AddInsOrgInfoSecondLocalServiceUtil.updateAddInsOrgInfoSecond(orgInfoSec);
		jsonOBJ.put("uniqueId", orgInfoSec.getAddInsOrgInfoSecondId());
		jsonOBJ.put("counter", orgInfoSec.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}

		return false;
	}
}