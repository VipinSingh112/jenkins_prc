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
import com.nbp.janaac.application.form.service.model.AddInsOrgInfoFirst;
import com.nbp.janaac.application.form.service.service.AddInsOrgInfoFirstLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=add/inspection/bodies/organization/first" }, service = MVCResourceCommand.class)
public class AddInspectionOrganizationFirstResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddInspectionOrganizationFirstResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------inside add inspection organization first  -------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();

		String name = ParamUtil.getString(resourceRequest, "name");
		String position = ParamUtil.getString(resourceRequest, "position");
		long uniqueId = ParamUtil.getLong(resourceRequest, "uniqueId");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String counterOforganizationFirst = ParamUtil.getString(resourceRequest, "counterOforganizationFirst");
		AddInsOrgInfoFirst organFirst = null;
		try {
			organFirst = AddInsOrgInfoFirstLocalServiceUtil.getAddInsOrgInfoFirst(uniqueId);
		} catch (PortalException e) {
		}

		if (Validator.isNull(organFirst)) {
			organFirst = AddInsOrgInfoFirstLocalServiceUtil
					.createAddInsOrgInfoFirst(CounterLocalServiceUtil.increment());
			organFirst.setCounter(counterOforganizationFirst);
		}
		organFirst.setName(name);
		organFirst.setPosition(position);
		organFirst.setJanaacApplicationId(janaacApplicationId);
		AddInsOrgInfoFirstLocalServiceUtil.updateAddInsOrgInfoFirst(organFirst);
		_log.info("---------update medicalDecSecInfo-------");
		jsonOBJ.put("uniqueId", organFirst.getAddInsOrgInfoFirstId());
		jsonOBJ.put("counter", organFirst.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}

		return false;
	}
}
