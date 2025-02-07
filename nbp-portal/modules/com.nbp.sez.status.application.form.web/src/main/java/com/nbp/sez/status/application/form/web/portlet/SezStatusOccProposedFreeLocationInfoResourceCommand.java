package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.SezOccLocationAdd;
import com.nbp.sez.status.application.form.service.service.SezOccLocationAddLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantPrincipleOfficerLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/occ/proposed/freeLoc" }, service = MVCResourceCommand.class)
public class SezStatusOccProposedFreeLocationInfoResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(SezStatusOccProposedFreeLocationInfoResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String developerLocation = ParamUtil.getString(resourceRequest, "occSezDevLoc");
		String developerLocationDescription = ParamUtil.getString(resourceRequest, "occSezDevLocDesc");
		System.out.println("-------developerLocation--------"+developerLocation);
		System.out.println("-------developerLocationDescription--------"+developerLocationDescription);
		String counter = ParamUtil.getString(resourceRequest, "counterOccFreeZoneLocVal");
		long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		long sezAppLocationId = ParamUtil.getLong(resourceRequest, "sezAppLocationId");
		SezOccLocationAdd sezOccLocationAdd = null;
	
			try {
				sezOccLocationAdd = SezOccLocationAddLocalServiceUtil.getSezOccLocationAdd(sezAppLocationId);
			} catch (Exception e) {
			}
			
			if(sezOccLocationAdd==null) {
				System.out.println("----------inside not null sezOccLocationAdd ------@@@@@@@@@@@@@@@");
				sezOccLocationAdd = SezOccLocationAddLocalServiceUtil
						.createSezOccLocationAdd(CounterLocalServiceUtil.increment());
				sezOccLocationAdd.setCounter(counter);
			} 
		
		sezOccLocationAdd.setDeveloperLocation(developerLocation);
		sezOccLocationAdd.setDeveloperLocationDescription(developerLocationDescription);
		sezOccLocationAdd.setSezStatusApplicationId(sezStatusApplicationId);
		SezOccLocationAddLocalServiceUtil.updateSezOccLocationAdd(sezOccLocationAdd);
		System.out.println("-------------after updating--------------");
		jsonOBJ.put("sezAppLocationId", sezOccLocationAdd.getSezOccLocationAddId());
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



