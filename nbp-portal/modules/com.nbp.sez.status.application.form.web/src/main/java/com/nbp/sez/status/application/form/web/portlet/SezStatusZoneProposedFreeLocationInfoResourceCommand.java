package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.SezZoneLocationAdd;
import com.nbp.sez.status.application.form.service.service.SezZoneLocationAddLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/zone/proposed/freeLoc" }, service = MVCResourceCommand.class)
public class SezStatusZoneProposedFreeLocationInfoResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(SezStatusZoneProposedFreeLocationInfoResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String developerLocation = ParamUtil.getString(resourceRequest, "zoneUserSezDevLoc");
		String developerLocationDescription = ParamUtil.getString(resourceRequest, "zoneUserSezDevLocDesc");
		String counter = ParamUtil.getString(resourceRequest, "counter");
		long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		long zoneProposedFreeLocAppId = ParamUtil.getLong(resourceRequest, "zoneProposedFreeLocAppId");
		SezZoneLocationAdd sezZoneLocationAdd = null;
		if (Validator.isNotNull(zoneProposedFreeLocAppId)) {
			try {
				sezZoneLocationAdd = SezZoneLocationAddLocalServiceUtil.getSezZoneLocationAdd(zoneProposedFreeLocAppId);
			} catch (Exception e) {
			}
		} else {
			sezZoneLocationAdd = SezZoneLocationAddLocalServiceUtil
					.createSezZoneLocationAdd(CounterLocalServiceUtil.increment());
			sezZoneLocationAdd.setCounter(counter);
		}
		sezZoneLocationAdd.setDeveloperLocation(developerLocation);
		sezZoneLocationAdd.setDeveloperLocationDescription(developerLocationDescription);
		sezZoneLocationAdd.setSezStatusApplicationId(sezStatusApplicationId);
		SezZoneLocationAddLocalServiceUtil.updateSezZoneLocationAdd(sezZoneLocationAdd);
		jsonOBJ.put("zoneProposedFreeLocAppId", sezZoneLocationAdd.getSezZoneLocationAddId());
		jsonOBJ.put("counter", counter);
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (Exception e) {
			_log.error("An Error Occured", e);
		}
		return false;
	}
}
