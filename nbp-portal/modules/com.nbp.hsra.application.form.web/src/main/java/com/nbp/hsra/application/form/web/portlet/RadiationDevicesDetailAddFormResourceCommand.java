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
import com.nbp.hsra.application.service.model.RadiationDevicesAdd;
import com.nbp.hsra.application.service.service.RadiationDevicesAddLocalServiceUtil;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
	"mvc.command.name=/radiation/devices/detail/add/form" }, service = MVCResourceCommand.class)
public class RadiationDevicesDetailAddFormResourceCommand implements MVCResourceCommand{
	private static Log _log=LogFactoryUtil.getLog(HSRAUnsealedSourcesDetailDataAddFormResourceCommand.class.getName()); 
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("******calling hsra radition sources Resource Command*******");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String radiationDevicesRadio = ParamUtil.getString(resourceRequest, "radiationDevicesRadio");
        String radiationDevicesMaxActivity = ParamUtil.getString(resourceRequest, "radiationDevicesMaxActivity");
        String radiationDevicesManufacturer = ParamUtil.getString(resourceRequest, "radiationDevicesManufacturer");
        String radiationDevicesName = ParamUtil.getString(resourceRequest, "radiationDevicesName");
        String radiationDevicesModelNo = ParamUtil.getString(resourceRequest, "radiationDevicesModelNo");
        String radiationDevicesNumber = ParamUtil.getString(resourceRequest, "radiationDevicesNumber");
        String radiationDevicesUse = ParamUtil.getString(resourceRequest, "radiationDevicesUse");
        String counterOfRadiation = ParamUtil.getString(resourceRequest, "counterOfRadiation");
        long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
        long radiationDevicesDetailId = ParamUtil.getLong(resourceRequest, "radiationDevicesDetailId");
        RadiationDevicesAdd raditionDeviceInfo=null;
        try {
        	raditionDeviceInfo=RadiationDevicesAddLocalServiceUtil.getRadiationDevicesAdd(radiationDevicesDetailId);
        } catch (PortalException e1) {
		}
        if(raditionDeviceInfo==null) {
        	raditionDeviceInfo=RadiationDevicesAddLocalServiceUtil.createRadiationDevicesAdd(CounterLocalServiceUtil.increment());
        	raditionDeviceInfo.setCounter(counterOfRadiation);
        }
        raditionDeviceInfo.setRadiationDevicesRadio(radiationDevicesRadio);
        raditionDeviceInfo.setRadiationDevicesMaxActivity(radiationDevicesMaxActivity);
        raditionDeviceInfo.setRadiationDevicesManufacturer(radiationDevicesManufacturer);
        raditionDeviceInfo.setRadiationDevicesName(radiationDevicesName);
        raditionDeviceInfo.setRadiationDevicesModelNo(radiationDevicesModelNo);
        raditionDeviceInfo.setRadiationDevicesNumber(radiationDevicesNumber);
        raditionDeviceInfo.setRadiationDevicesUse(radiationDevicesUse);
        raditionDeviceInfo.setHsraApplicationId(hsraApplicationId);
        RadiationDevicesAddLocalServiceUtil.updateRadiationDevicesAdd(raditionDeviceInfo);
        jsonOBJ.put("radiationDeviceId",raditionDeviceInfo.getRadiationDevicesAddId());
        jsonOBJ.put("counter",raditionDeviceInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}

}
