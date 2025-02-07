package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jtb.application.form.service.model.AttractionTravelHaltApp;
import com.nbp.jtb.application.form.service.service.AttractionTravelHaltAppLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/travel/halt/offered/info" }, service = MVCResourceCommand.class)
public class JtbTravelHaltOfferedResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(JtbTravelHaltOfferedResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Attraction TRAVEL HALT OFFERED Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
        String gasStation = ParamUtil.getString(resourceRequest, "gasStation");
        String refreshment = ParamUtil.getString(resourceRequest, "refreshment");
        String drinks = ParamUtil.getString(resourceRequest, "drinks");
        String restaurant = ParamUtil.getString(resourceRequest, "restaurant");
        String wirelessinternet = ParamUtil.getString(resourceRequest, "wirelessinternet");
        String restrooms = ParamUtil.getString(resourceRequest, "restrooms");


	    AttractionTravelHaltApp travelHalt =null;
		try {
			travelHalt=AttractionTravelHaltAppLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(Validator.isNull(travelHalt)) {
			travelHalt = AttractionTravelHaltAppLocalServiceUtil.createAttractionTravelHaltApp(CounterLocalServiceUtil.increment());
		}
        travelHalt.setGasStation(gasStation);
        travelHalt.setRefreshment(refreshment);
        travelHalt.setDrinks(drinks);
        travelHalt.setRestaurant(restaurant);
        travelHalt.setWirelessinternet(wirelessinternet);
        travelHalt.setRestrooms(restrooms);
	    travelHalt.setJtbApplicationId(jtbApplicationId);
	    AttractionTravelHaltAppLocalServiceUtil.updateAttractionTravelHaltApp(travelHalt);
		
		return false;
	}

}
