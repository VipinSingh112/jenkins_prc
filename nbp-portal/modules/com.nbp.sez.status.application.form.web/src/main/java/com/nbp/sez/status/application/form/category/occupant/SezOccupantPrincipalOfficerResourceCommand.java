package com.nbp.sez.status.application.form.category.occupant;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.sez.status.application.form.service.model.SezOccupantPrincipleOfficer;
import com.nbp.sez.status.application.form.service.service.SezOccupantPrincipleOfficerLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/sez/status/occupant/principle/officer/add/form" }, service = MVCResourceCommand.class)
public class SezOccupantPrincipalOfficerResourceCommand implements MVCResourceCommand{
	private static Log _log=LogFactoryUtil.getLog(SezOccupantPrincipalOfficerResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		 String occPrincipalName = ParamUtil.getString(resourceRequest, "occPrincipalName");
		 String occPrincipalPosition = ParamUtil.getString(resourceRequest, "occPrincipalPosition");
		 String principleOfficerCounter = ParamUtil.getString(resourceRequest, "principleOfficerCounter");
		 long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		 long occPrincipleOfficerId = ParamUtil.getLong(resourceRequest, "occPrincipleOfficerId");
		 SezOccupantPrincipleOfficer occupantPrincipleOfficer=null;
		 try {
			 occupantPrincipleOfficer= SezOccupantPrincipleOfficerLocalServiceUtil.getSezOccupantPrincipleOfficer(occPrincipleOfficerId);
		} catch (Exception e) {
		}
		if(occupantPrincipleOfficer==null) {
			occupantPrincipleOfficer= SezOccupantPrincipleOfficerLocalServiceUtil.createSezOccupantPrincipleOfficer(CounterLocalServiceUtil.increment());
			occupantPrincipleOfficer.setPrinciplOfficerCounter(principleOfficerCounter);
		} 
		occupantPrincipleOfficer.setName(occPrincipalName);
		occupantPrincipleOfficer.setPosition(occPrincipalPosition);
		occupantPrincipleOfficer.setSezStatusApplicationId(sezStatusApplicationId);
		SezOccupantPrincipleOfficerLocalServiceUtil.updateSezOccupantPrincipleOfficer(occupantPrincipleOfficer);
		jsonOBJ.put("principleOfficerId", occupantPrincipleOfficer.getSezOccPrincOffId());
		jsonOBJ.put("principleCounter", occupantPrincipleOfficer.getPrinciplOfficerCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}

}
