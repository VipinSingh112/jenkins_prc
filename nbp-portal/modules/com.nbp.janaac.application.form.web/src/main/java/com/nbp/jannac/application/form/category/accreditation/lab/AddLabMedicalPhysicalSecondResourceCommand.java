package com.nbp.jannac.application.form.category.accreditation.lab;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalSec;
import com.nbp.janaac.application.form.service.service.AddLabMedicalPhysicalSecLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/add/application/activity/loc/detail/data" }, service = MVCResourceCommand.class)
public class AddLabMedicalPhysicalSecondResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddLabMedicalPhysicalFirstResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------inside add lab AddLabMedicalPhysicalSecondResourceCommand resouce command-------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();

		String activityNumber = ParamUtil.getString(resourceRequest, "activityNumber");
		String applicationActivityAddress = ParamUtil.getString(resourceRequest, "applicationActivityAddress");
		String activityPerformedLoc = ParamUtil.getString(resourceRequest, "activityPerformedLoc");
		String activityContactDetails = ParamUtil.getString(resourceRequest, "activityContactDetails");
		long applicationActivityLocId = ParamUtil.getLong(resourceRequest, "applicationActivityLocId");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String counterOfApplicationActivity = ParamUtil.getString(resourceRequest, "counterOfApplicationActivity");

		AddLabMedicalPhysicalSec physicalSecondInfo = null;
		try {
			physicalSecondInfo = AddLabMedicalPhysicalSecLocalServiceUtil
					.getAddLabMedicalPhysicalSec(applicationActivityLocId);
		} catch (Exception e) {
		}
		if (Validator.isNull(applicationActivityLocId)) {
			physicalSecondInfo = AddLabMedicalPhysicalSecLocalServiceUtil
					.createAddLabMedicalPhysicalSec(CounterLocalServiceUtil.increment());
			physicalSecondInfo.setCounter(counterOfApplicationActivity);
		}
		physicalSecondInfo.setNumber(activityNumber);
		physicalSecondInfo.setLocation(applicationActivityAddress);
		physicalSecondInfo.setActivitiesPerformed(activityPerformedLoc);
		physicalSecondInfo.setContactDetails(activityContactDetails);
		physicalSecondInfo.setJanaacApplicationId(janaacApplicationId);

		AddLabMedicalPhysicalSecLocalServiceUtil.updateAddLabMedicalPhysicalSec(physicalSecondInfo);
		jsonOBJ.put("applicationActivityLocId", physicalSecondInfo.getAddLabMedicalPhysicalSecId());
		jsonOBJ.put("counter", physicalSecondInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}

		return false;
	}
}