package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AddOutsourcedActivities;
import com.nbp.janaac.application.form.service.service.AddOutsourcedActivitiesLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=out/Sourced/Activities/Data" }, service = MVCResourceCommand.class)

public class AddOutSourcedActivitiesRespectiveInfoResourceCommand implements MVCResourceCommand {

	private static Log _log = LogFactoryUtil.getLog(AddOutSourcedActivitiesRespectiveInfoResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String outsourcedActivityCerBodies=ParamUtil.getString(resourceRequest, "outsourcedActivityCerBodies");
		String serviceProvdierCerBodies=ParamUtil.getString(resourceRequest, "serviceProvdierCerBodies");
		String serviceProvdierAddressCerBodies=ParamUtil.getString(resourceRequest, "serviceProvdierAddressCerBodies");
		String counterOfoutsourceActNatureCerBodies=ParamUtil.getString(resourceRequest, "counterOfoutsourceActNatureCerBodies");
		long uniqueId = ParamUtil.getLong(resourceRequest, "uniqueId");
		
		AddOutsourcedActivities outsourcedActivities=null;
		try {
			outsourcedActivities = AddOutsourcedActivitiesLocalServiceUtil.getAddOutsourcedActivities(uniqueId);
			
		} catch (Exception e) {
		}
		if (Validator.isNull(outsourcedActivities)) {
			outsourcedActivities = AddOutsourcedActivitiesLocalServiceUtil.createAddOutsourcedActivities(CounterLocalServiceUtil.increment());
			outsourcedActivities.setCounter(counterOfoutsourceActNatureCerBodies);
		}
		outsourcedActivities.setOutSourcedActivity(outsourcedActivityCerBodies);
		outsourcedActivities.setServiceProvider(serviceProvdierCerBodies);
		outsourcedActivities.setLocationAddress(serviceProvdierAddressCerBodies);
		outsourcedActivities.setJanaacApplicationId(janaacApplicationId);
		AddOutsourcedActivitiesLocalServiceUtil.updateAddOutsourcedActivities(outsourcedActivities);
		
		jsonOBJ.put("uniqueId", outsourcedActivities.getAddOutsourcedActivitiesId());
		jsonOBJ.put("counter", outsourcedActivities.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}

}
