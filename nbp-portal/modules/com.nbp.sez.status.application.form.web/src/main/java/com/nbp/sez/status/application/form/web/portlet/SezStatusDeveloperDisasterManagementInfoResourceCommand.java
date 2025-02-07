package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.sez.status.application.form.service.model.SezDevDisasterManagement;
import com.nbp.sez.status.application.form.service.service.SezDevDisasterManagementLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/dev/disaster/management" }, service = MVCResourceCommand.class)
public class SezStatusDeveloperDisasterManagementInfoResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String devDisasterManagementInfo = ParamUtil.getString(resourceRequest, "comDisasterManagement");
		long sezStatusApplicationId=ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		
		
		SezDevDisasterManagement disasterManagement = null;
		try {
			disasterManagement = SezDevDisasterManagementLocalServiceUtil.getSezById(sezStatusApplicationId);	
		} catch (Exception e) {
		}
		if(disasterManagement==null) {
		disasterManagement = SezDevDisasterManagementLocalServiceUtil
				.createSezDevDisasterManagement(CounterLocalServiceUtil.increment());
		}
		disasterManagement.setDisasterManagement(devDisasterManagementInfo);
		disasterManagement.setSezStatusApplicationId(sezStatusApplicationId);
		SezDevDisasterManagementLocalServiceUtil.updateSezDevDisasterManagement(disasterManagement);
		return false;
	}

}
