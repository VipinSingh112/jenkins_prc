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
import com.nbp.sez.status.application.form.service.model.SezDevProposedProjectAdd;
import com.nbp.sez.status.application.form.service.service.SezDevProposedProjectAddLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/project/please/state" }, service = MVCResourceCommand.class)
public class SezStatusDeveloperaAddProposedProjectResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(SezStatusDeveloperaAddProposedProjectResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String sezFreeCurrentZoneName = ParamUtil.getString(resourceRequest, "sezFreeCurrentZoneName");
		String sezFreeCurrentZoneParish = ParamUtil.getString(resourceRequest, "sezFreeCurrentZoneParish");
		long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		String count = ParamUtil.getString(resourceRequest, "count");
		/* hidden field */
		long devOperatingZoneLocationId = ParamUtil.getLong(resourceRequest, "devOperatingZoneLocationId");
		SezDevProposedProjectAdd proposedProject = null;
		if(Validator.isNotNull(devOperatingZoneLocationId)) {
			try {
				proposedProject = SezDevProposedProjectAddLocalServiceUtil.getSezDevProposedProjectAdd(devOperatingZoneLocationId);
			} catch (PortalException e) {
				_log.error("An Error Occured", e);
			}
		}else {
			proposedProject = SezDevProposedProjectAddLocalServiceUtil
					.createSezDevProposedProjectAdd(CounterLocalServiceUtil.increment());
			proposedProject.setCounter(count);
		}
		proposedProject.setNameOfZone(sezFreeCurrentZoneName);
		proposedProject.setParish(sezFreeCurrentZoneParish);
		proposedProject.setSezStatusApplicationId(sezStatusApplicationId);
		SezDevProposedProjectAddLocalServiceUtil.updateSezDevProposedProjectAdd(proposedProject);
		jsonOBJ.put("sezDevProposedProjectAddId", proposedProject.getSezDevProposedProjectAddId());
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