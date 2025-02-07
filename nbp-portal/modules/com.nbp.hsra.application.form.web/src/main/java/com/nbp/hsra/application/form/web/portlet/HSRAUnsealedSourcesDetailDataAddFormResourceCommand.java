package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.model.UnsealedSourceAdd;
import com.nbp.hsra.application.service.service.UnsealedSourceAddLocalServiceUtil;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
	"mvc.command.name=/unsealed/sources/detail/data/add/form" }, service = MVCResourceCommand.class)
public class HSRAUnsealedSourcesDetailDataAddFormResourceCommand implements MVCResourceCommand{
	private static Log _log=LogFactoryUtil.getLog(HSRAUnsealedSourcesDetailDataAddFormResourceCommand.class.getName()); 
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("******calling hsra unsealed sources Resource Command*******");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String unsealedSourcesRadionuclide = ParamUtil.getString(resourceRequest, "unsealedSourcesRadionuclide");
        String unsealedSourcesActivity = ParamUtil.getString(resourceRequest, "unsealedSourcesActivity");
        String unsealedSourcesTotalYear = ParamUtil.getString(resourceRequest, "unsealedSourcesTotalYear");
        String unsealedSourcesUse = ParamUtil.getString(resourceRequest, "unsealedSourcesUse");
        String counterOfUnsealed = ParamUtil.getString(resourceRequest, "counterOfUnsealed");
        long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
        long unsealedSourceAddId = ParamUtil.getLong(resourceRequest, "unsealedSourcesDetailId");
        
        UnsealedSourceAdd unsealedInfo=null;
        try {
        	unsealedInfo=UnsealedSourceAddLocalServiceUtil.getUnsealedSourceAdd(unsealedSourceAddId);
        } catch (PortalException e1) {
		}
        if(unsealedInfo==null) {
        	unsealedInfo=UnsealedSourceAddLocalServiceUtil.createUnsealedSourceAdd(CounterLocalServiceUtil.increment());
        	unsealedInfo.setCounter(counterOfUnsealed);
        }
        unsealedInfo.setUnsealedSourcesRadionu(unsealedSourcesRadionuclide);
        unsealedInfo.setUnsealedSourcesActivity(unsealedSourcesActivity);
        unsealedInfo.setUnsealedSourcesTotalYear(unsealedSourcesTotalYear);
        unsealedInfo.setUnsealedSourcesUse(unsealedSourcesUse);
        unsealedInfo.setHsraApplicationId(hsraApplicationId);
        UnsealedSourceAddLocalServiceUtil.updateUnsealedSourceAdd(unsealedInfo);
        jsonOBJ.put("unsealedSourcesId",unsealedInfo.getUnsealedSourceAddId());
        jsonOBJ.put("counter",unsealedInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}
}