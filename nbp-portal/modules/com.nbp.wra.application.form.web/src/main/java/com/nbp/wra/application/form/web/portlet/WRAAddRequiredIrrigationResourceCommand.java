package com.nbp.wra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.wra.application.form.service.model.WRAReqIrrigation;
import com.nbp.wra.application.form.service.service.WRAReqIrrigationLocalServiceUtil;
import com.nbp.wra.application.form.web.constants.WRAApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + WRAApplicationFormPortletKeys.WRAAPPLICATIONFORM,
	"mvc.command.name=/add/water/required/irrigation/edit" }, 
service = MVCResourceCommand.class)

public class WRAAddRequiredIrrigationResourceCommand implements MVCResourceCommand{
	private static Log _log=LogFactoryUtil.getLog(WRAAddRequiredIrrigationResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String abstractAreaIrrigated = ParamUtil.getString(resourceRequest, "abstractAreaIrrigated");
		String abstractSystemIrrigation = ParamUtil.getString(resourceRequest, "abstractSystemIrrigation");
		String counter=ParamUtil.getString(resourceRequest, "counter");
		String deleteKey = ParamUtil.getString(resourceRequest, "deleteKey");
		long wraApplicationId=ParamUtil.getLong(resourceRequest, "wraApplicationId");
		/* hidden */
		long waterIrrigationDetailId=ParamUtil.getLong(resourceRequest, "waterIrrigationDetailId");
		
		if(deleteKey.contains("deleteApplicant")) {
			try {
				WRAReqIrrigationLocalServiceUtil.deleteWRAReqIrrigation(waterIrrigationDetailId);
			} catch (PortalException e) {
			}
		}else {
		WRAReqIrrigation wraReqIrr=null;
		  try {
			  wraReqIrr= WRAReqIrrigationLocalServiceUtil.getWRAReqIrrigation(waterIrrigationDetailId);
		  } catch (Exception e) {}
		  if(wraReqIrr==null) {
			wraReqIrr= WRAReqIrrigationLocalServiceUtil.createWRAReqIrrigation(CounterLocalServiceUtil.increment());
			wraReqIrr.setCounter(counter);
		  }
		 wraReqIrr.setAbstractAreaIrrigated(abstractAreaIrrigated);
		 wraReqIrr.setAbstractSystemIrrigated(abstractSystemIrrigation);
		 wraReqIrr.setWraApplicationId(wraApplicationId);
		 WRAReqIrrigationLocalServiceUtil.updateWRAReqIrrigation(wraReqIrr);
		
		jsonOBJ.put("waterIrrigationDetailId", wraReqIrr.getWraReqIrrigationId());
		jsonOBJ.put("counter", wraReqIrr.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Occured", e);
		}
	}
		return false;
	}

}
