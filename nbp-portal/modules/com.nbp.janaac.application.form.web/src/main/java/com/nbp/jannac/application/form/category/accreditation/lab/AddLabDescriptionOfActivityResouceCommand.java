package com.nbp.jannac.application.form.category.accreditation.lab;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AddLabDescOfActivity;
import com.nbp.janaac.application.form.service.service.AddLabDescOfActivityLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/add/lab/desc/of/activity" }, service = MVCResourceCommand.class)
public class AddLabDescriptionOfActivityResouceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddLabDescriptionOfActivityResouceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------inside add lab  Description od activity-------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String labDescOfActivityNum = ParamUtil.getString(resourceRequest, "labDescOfActivityNum");
		String labDescOfActivityLocation = ParamUtil.getString(resourceRequest, "labDescOfActivityLocation");
		long uniqueId = ParamUtil.getLong(resourceRequest, "uniqueId");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String counterOflabDecOfActivity = ParamUtil.getString(resourceRequest, "counterOflabDecOfActivity");

		AddLabDescOfActivity descOfActivity = null;
		try {
			descOfActivity = AddLabDescOfActivityLocalServiceUtil.getAddLabDescOfActivity(uniqueId);
		} catch (Exception e) {
		}
		if (Validator.isNull(descOfActivity)) {
			descOfActivity = AddLabDescOfActivityLocalServiceUtil
					.createAddLabDescOfActivity(CounterLocalServiceUtil.increment());
			descOfActivity.setCounter(counterOflabDecOfActivity);
		}
		descOfActivity.setNumber(labDescOfActivityNum);
		descOfActivity.setLocation(labDescOfActivityLocation);
		descOfActivity.setJanaacApplicationId(janaacApplicationId);
		AddLabDescOfActivityLocalServiceUtil.updateAddLabDescOfActivity(descOfActivity);
		jsonOBJ.put("uniqueId", descOfActivity.getAddLabDescOfActivityId());
		jsonOBJ.put("counter", descOfActivity.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}

		return false;
	}
}
