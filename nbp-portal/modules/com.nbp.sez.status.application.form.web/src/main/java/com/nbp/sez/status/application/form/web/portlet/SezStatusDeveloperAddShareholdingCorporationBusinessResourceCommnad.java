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
import com.nbp.sez.status.application.form.service.model.SezDevShareCorporationBusAdd;
import com.nbp.sez.status.application.form.service.service.SezDevShareCorporationBusAddLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/corporation/business" }, service = MVCResourceCommand.class)
public class SezStatusDeveloperAddShareholdingCorporationBusinessResourceCommnad implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(SezStatusDeveloperAddShareholdingCorporationBusinessResourceCommnad.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String comCorporationPersonName = ParamUtil.getString(resourceRequest, "comCorporationPersonName");
		String comCorporationName = ParamUtil.getString(resourceRequest, "comCorporationName");
		String comCorporationRelationship = ParamUtil.getString(resourceRequest, "comCorporationRelationship");
		long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		String count = ParamUtil.getString(resourceRequest, "count");
		/* hidden field */
		long devCorporationBusinessId = ParamUtil.getLong(resourceRequest, "devCorporationBusinessId");
		SezDevShareCorporationBusAdd shareCorporationBusiness = null;
		if (Validator.isNotNull(devCorporationBusinessId)) {
			try {
				shareCorporationBusiness = SezDevShareCorporationBusAddLocalServiceUtil
						.getSezDevShareCorporationBusAdd(devCorporationBusinessId);
			} catch (PortalException e) {
			}
		} else {
			shareCorporationBusiness = SezDevShareCorporationBusAddLocalServiceUtil
					.createSezDevShareCorporationBusAdd(CounterLocalServiceUtil.increment());
			shareCorporationBusiness.setCounter(count);
		}
		shareCorporationBusiness.setName(comCorporationPersonName);
		shareCorporationBusiness.setCompany(comCorporationName);
		shareCorporationBusiness.setRelationship(comCorporationRelationship);
		shareCorporationBusiness.setSezStatusApplicationId(sezStatusApplicationId);
		SezDevShareCorporationBusAddLocalServiceUtil.updateSezDevShareCorporationBusAdd(shareCorporationBusiness);
		jsonOBJ.put("sezDevCorporationBusinessAddId", shareCorporationBusiness.getSezDevCorporationBusinessAddId());
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
