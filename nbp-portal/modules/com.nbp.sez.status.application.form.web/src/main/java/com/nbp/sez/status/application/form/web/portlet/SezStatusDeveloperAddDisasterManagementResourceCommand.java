package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.SezDevDisasterManagementAdd;
import com.nbp.sez.status.application.form.service.service.SezDevDisasterManagementAddLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/developer/Disaster/Management/add" }, service = MVCResourceCommand.class)
public class SezStatusDeveloperAddDisasterManagementResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(SezStatusDeveloperAddDisasterManagementResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String disasterMitigationPlan = ParamUtil.getString(resourceRequest, "disasterMitigationPlan");
		long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		String count = ParamUtil.getString(resourceRequest, "count");
		/* hidden field */
		long disasterMitigationPlanId = ParamUtil.getLong(resourceRequest, "disasterMitigationPlanId");
		SezDevDisasterManagementAdd disManagementAdd = null;
		if (Validator.isNotNull(disasterMitigationPlanId)) {
			try {
				disManagementAdd = SezDevDisasterManagementAddLocalServiceUtil
						.getSezDevDisasterManagementAdd(disasterMitigationPlanId);
			} catch (PortalException e) {
			}
		} else {
			disManagementAdd = SezDevDisasterManagementAddLocalServiceUtil
					.createSezDevDisasterManagementAdd(CounterLocalServiceUtil.increment());
			disManagementAdd.setCounter(count);
		}
		disManagementAdd.setDisasterMitigationPlan(disasterMitigationPlan);
		disManagementAdd.setSezStatusApplicationId(sezStatusApplicationId);
		SezDevDisasterManagementAddLocalServiceUtil.updateSezDevDisasterManagementAdd(disManagementAdd);
		jsonOBJ.put("sezDevDisasterManagementAddId", disManagementAdd.getSezDevDisasterManagementAddId());
		jsonOBJ.put("counter", count);
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Occured", e);
		}
		return false;
	}

}
