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
import com.nbp.janaac.application.form.service.model.AddLabResourceReqFirst;
import com.nbp.janaac.application.form.service.service.AddLabResourceReqFirstLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=add/lab/resource/req/first" }, service = MVCResourceCommand.class)
public class AddLabTestResourceRequirementsFirstResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddLabTestResourceRequirementsFirstResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------inside AddLabTestResourceRequirementsFirstResourceCommand started-------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String number = ParamUtil.getString(resourceRequest, "number");
		String location = ParamUtil.getString(resourceRequest, "locationAddress");
		String activityPerformedLocation = ParamUtil.getString(resourceRequest, "activityPerformedLocation");
		String contactDetails = ParamUtil.getString(resourceRequest, "contactDetails");
		String counterOfresourceReqFirst = ParamUtil.getString(resourceRequest, "counterOfresourceReqFirst");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		long uniqueId = ParamUtil.getLong(resourceRequest, "uniqueId");

		AddLabResourceReqFirst labResourceReqfirstInfo = null;
		try {
			labResourceReqfirstInfo = AddLabResourceReqFirstLocalServiceUtil.getAddLabResourceReqFirst(uniqueId);
		} catch (PortalException e1) {
		}
		if (Validator.isNull(labResourceReqfirstInfo)) {
			labResourceReqfirstInfo = AddLabResourceReqFirstLocalServiceUtil
					.createAddLabResourceReqFirst(CounterLocalServiceUtil.increment());
			labResourceReqfirstInfo.setCounter(counterOfresourceReqFirst);
		}
		labResourceReqfirstInfo.setNum(number);
		labResourceReqfirstInfo.setLocation(location);
		labResourceReqfirstInfo.setActivities(activityPerformedLocation);
		labResourceReqfirstInfo.setContactDetails(contactDetails);
		labResourceReqfirstInfo.setJanaacApplicationId(janaacApplicationId);
		AddLabResourceReqFirstLocalServiceUtil.updateAddLabResourceReqFirst(labResourceReqfirstInfo);
		jsonOBJ.put("uniqueId", labResourceReqfirstInfo.getAddLabResourceReqFirstId());
		jsonOBJ.put("counter", labResourceReqfirstInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}

}