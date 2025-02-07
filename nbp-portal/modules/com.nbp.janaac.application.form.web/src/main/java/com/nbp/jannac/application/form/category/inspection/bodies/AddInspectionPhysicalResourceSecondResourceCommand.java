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
import com.nbp.janaac.application.form.service.model.AddPhyResourceSec;
import com.nbp.janaac.application.form.service.service.AddPhyResourceSecLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=add/inspection/bodies/physical/resource/second" }, service = MVCResourceCommand.class)
public class AddInspectionPhysicalResourceSecondResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddInspectionPhysicalResourceFirstResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------inside add inspection physical resource second  -------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String number = ParamUtil.getString(resourceRequest, "number");
		String location = ParamUtil.getString(resourceRequest, "location");
		String activiiesPerformedLocation = ParamUtil.getString(resourceRequest, "activiiesPerformedLocation");
		String contactDetails = ParamUtil.getString(resourceRequest, "contactDetails");
		long uniqueId = ParamUtil.getLong(resourceRequest, "uniqueId");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String counterOfPhysicalResourceSecond = ParamUtil.getString(resourceRequest,
				"counterOfPhysicalResourceSecond");

		AddPhyResourceSec phyResourceSecond = null;
		try {
			phyResourceSecond = AddPhyResourceSecLocalServiceUtil.getAddPhyResourceSec(uniqueId);
		} catch (PortalException e) {
		}

		if (Validator.isNull(phyResourceSecond)) {
			phyResourceSecond = AddPhyResourceSecLocalServiceUtil
					.createAddPhyResourceSec(CounterLocalServiceUtil.increment());
			phyResourceSecond.setCounter(counterOfPhysicalResourceSecond);
		}
		phyResourceSecond.setNumber(number);
		phyResourceSecond.setNumber(number);
		phyResourceSecond.setLocation(location);
		phyResourceSecond.setActivitiesPerformed(activiiesPerformedLocation);
		phyResourceSecond.setContactDetails(contactDetails);
		phyResourceSecond.setJanaacApplicationId(janaacApplicationId);
		AddPhyResourceSecLocalServiceUtil.updateAddPhyResourceSec(phyResourceSecond);
		jsonOBJ.put("uniqueId", phyResourceSecond.getAddPhyResourceSecId());
		jsonOBJ.put("counter", phyResourceSecond.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}

		return false;
	}
}
