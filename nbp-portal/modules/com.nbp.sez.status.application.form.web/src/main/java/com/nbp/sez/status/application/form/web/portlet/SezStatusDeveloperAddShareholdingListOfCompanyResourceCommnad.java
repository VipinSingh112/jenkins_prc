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
import com.nbp.sez.status.application.form.service.model.SezDevShareComDirectorShipAdd;
import com.nbp.sez.status.application.form.service.service.SezDevShareComDirectorShipAddLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/list/of/com/director" }, service = MVCResourceCommand.class)
public class SezStatusDeveloperAddShareholdingListOfCompanyResourceCommnad implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(SezStatusDeveloperAddShareholdingListOfCompanyResourceCommnad.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String comDirectorName = ParamUtil.getString(resourceRequest, "comDirectorName");
		String comDirectorCompanyName = ParamUtil.getString(resourceRequest, "comDirectorCompanyName");
		String comDirectorRelationship = ParamUtil.getString(resourceRequest, "comDirectorRelationship");
		long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		String count = ParamUtil.getString(resourceRequest, "count");
		/* hidden field */
		long devComDirectorId = ParamUtil.getLong(resourceRequest, "devComDirectorId");
		SezDevShareComDirectorShipAdd shareComDirectorShip = null;
		if (Validator.isNotNull(devComDirectorId)) {
			try {
				shareComDirectorShip = SezDevShareComDirectorShipAddLocalServiceUtil
						.getSezDevShareComDirectorShipAdd(devComDirectorId);
			} catch (PortalException e) {
			}
		} else {
			shareComDirectorShip = SezDevShareComDirectorShipAddLocalServiceUtil
					.createSezDevShareComDirectorShipAdd(CounterLocalServiceUtil.increment());
			shareComDirectorShip.setCounter(count);
		}
		shareComDirectorShip.setName(comDirectorName);
		shareComDirectorShip.setCompany(comDirectorCompanyName);
		shareComDirectorShip.setReplationship(comDirectorRelationship);
		shareComDirectorShip.setSezStatusApplicationId(sezStatusApplicationId);
		SezDevShareComDirectorShipAddLocalServiceUtil.updateSezDevShareComDirectorShipAdd(shareComDirectorShip);
		jsonOBJ.put("sezDevSharComDirectorShipAddId", shareComDirectorShip.getSezDevSharComDirectorShipAddId());
		jsonOBJ.put("counter", count);
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Has Occured", e);
		}
		return false;
	}
}
