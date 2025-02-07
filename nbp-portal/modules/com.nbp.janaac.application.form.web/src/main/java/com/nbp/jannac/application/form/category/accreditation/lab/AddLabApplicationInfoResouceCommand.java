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
import com.nbp.janaac.application.form.service.model.AddLabAppliInfo;
import com.nbp.janaac.application.form.service.service.AddLabAppliInfoLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/add/lab/application/info" }, service = MVCResourceCommand.class)
public class AddLabApplicationInfoResouceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddLabApplicationInfoResouceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------inside add Lab Application info-------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();

		String labApplicationName = ParamUtil.getString(resourceRequest, "labApplicationName");
		String labApplicationEmail = ParamUtil.getString(resourceRequest, "labApplicationEmail");
		String counterOfLabApplication = ParamUtil.getString(resourceRequest, "counterOfLabApplication");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		long uniqueId = ParamUtil.getLong(resourceRequest, "uniqueId");
		AddLabAppliInfo LabAppliInfo = null;
		try {
			LabAppliInfo = AddLabAppliInfoLocalServiceUtil.getAddLabAppliInfo(uniqueId);
		} catch (PortalException e1) {
		}
		if (Validator.isNull(LabAppliInfo)) {
			LabAppliInfo = AddLabAppliInfoLocalServiceUtil.createAddLabAppliInfo(CounterLocalServiceUtil.increment());
			LabAppliInfo.setCounter(counterOfLabApplication);
		}
		LabAppliInfo.setName(labApplicationName);
		LabAppliInfo.setEmail(labApplicationEmail);
		LabAppliInfo.setJanaacApplicationId(janaacApplicationId);
		AddLabAppliInfoLocalServiceUtil.updateAddLabAppliInfo(LabAppliInfo);
		jsonOBJ.put("uniqueId", LabAppliInfo.getAddLabAppliInfoId());
		jsonOBJ.put("counter", LabAppliInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}
}
