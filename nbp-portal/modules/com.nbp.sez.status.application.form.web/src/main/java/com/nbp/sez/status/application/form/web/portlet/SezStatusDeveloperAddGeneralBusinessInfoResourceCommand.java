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
import com.nbp.sez.status.application.form.service.model.SezDevGenBusinessInfoAdd;
import com.nbp.sez.status.application.form.service.service.SezDevGenBusinessInfoAddLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/developer/gen/business/parent/com/add" }, service = MVCResourceCommand.class)
public class SezStatusDeveloperAddGeneralBusinessInfoResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(SezStatusDeveloperAddGeneralBusinessInfoResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String devJointVenCompanyName = ParamUtil.getString(resourceRequest, "devJointVenCompanyName");
		String devJointVenStreetAddress = ParamUtil.getString(resourceRequest, "devJointVenStreetAddress");
		String devJointVenTown = ParamUtil.getString(resourceRequest, "devJointVenTown");
		String devJointVenZipCode = ParamUtil.getString(resourceRequest, "devJointVenZipCode");
		String devJointVenCountry = ParamUtil.getString(resourceRequest, "devJointVenCountry");
		String devJointVenTelephone = ParamUtil.getString(resourceRequest, "devJointVenTelephone");
		String devJointVenFax = ParamUtil.getString(resourceRequest, "devJointVenFax");
		String devJointVenEmail = ParamUtil.getString(resourceRequest, "devJointVenEmail");
		String count = ParamUtil.getString(resourceRequest, "count");
		long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		long devVentureAppId = ParamUtil.getLong(resourceRequest, "devVentureAppId");

		SezDevGenBusinessInfoAdd genBusinessInfoAdd = null;
		if (Validator.isNotNull(devVentureAppId)) {
    	   try {
			genBusinessInfoAdd=SezDevGenBusinessInfoAddLocalServiceUtil.getSezDevGenBusinessInfoAdd(devVentureAppId);
		} catch (PortalException e) {
		}
		}else{
			genBusinessInfoAdd = SezDevGenBusinessInfoAddLocalServiceUtil
					.createSezDevGenBusinessInfoAdd(CounterLocalServiceUtil.increment());
			genBusinessInfoAdd.setCounter(count);
		}
		genBusinessInfoAdd.setCompanyName(devJointVenCompanyName);
		genBusinessInfoAdd.setBuildingNum(devJointVenStreetAddress);
		genBusinessInfoAdd.setTownCity(devJointVenTown);
		genBusinessInfoAdd.setParish(devJointVenZipCode);
		genBusinessInfoAdd.setCountry(devJointVenCountry);
		genBusinessInfoAdd.setTelephoneNum(devJointVenTelephone);
		genBusinessInfoAdd.setFaxNum(devJointVenFax);
		genBusinessInfoAdd.setEmailAddress(devJointVenEmail);
		genBusinessInfoAdd.setSezStatusApplicationId(sezStatusApplicationId);
		SezDevGenBusinessInfoAddLocalServiceUtil.updateSezDevGenBusinessInfoAdd(genBusinessInfoAdd);
		jsonOBJ.put("sezDevGenBusinessInfoAddId", genBusinessInfoAdd.getSezDevGenBusinessInfoAddId());
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