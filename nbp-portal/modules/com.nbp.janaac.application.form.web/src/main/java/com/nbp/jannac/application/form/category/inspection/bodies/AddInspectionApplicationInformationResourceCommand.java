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
import com.nbp.janaac.application.form.service.model.AddInsApplicationInfo;
import com.nbp.janaac.application.form.service.service.AddInsApplicationInfoLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=add/inspection/bodies/application/info" }, service = MVCResourceCommand.class)
public class AddInspectionApplicationInformationResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddInspectionApplicationInformationResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------inside add description of form sec  -------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String name = ParamUtil.getString(resourceRequest, "name");
		String email = ParamUtil.getString(resourceRequest, "email");
		long uniqueId = ParamUtil.getLong(resourceRequest, "uniqueId");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String counterOfInspBodiesApplicationInfo = ParamUtil.getString(resourceRequest,
				"counterOfInspBodiesApplicationInfo");

		AddInsApplicationInfo inspApplicationInfo = null;
		try {
			inspApplicationInfo = AddInsApplicationInfoLocalServiceUtil.getAddInsApplicationInfo(uniqueId);
		} catch (PortalException e) {
		}

		if (Validator.isNull(inspApplicationInfo)) {
			inspApplicationInfo = AddInsApplicationInfoLocalServiceUtil
					.createAddInsApplicationInfo(CounterLocalServiceUtil.increment());
			inspApplicationInfo.setCounter(counterOfInspBodiesApplicationInfo);
		}
		inspApplicationInfo.setName(name);
		inspApplicationInfo.setEmail(email);
		inspApplicationInfo.setJanaacApplicationId(janaacApplicationId);
		AddInsApplicationInfoLocalServiceUtil.updateAddInsApplicationInfo(inspApplicationInfo);
		jsonOBJ.put("uniqueId", inspApplicationInfo.getAddInsApplicationInfoId());
		jsonOBJ.put("counter", inspApplicationInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}

		return false;
	}
}