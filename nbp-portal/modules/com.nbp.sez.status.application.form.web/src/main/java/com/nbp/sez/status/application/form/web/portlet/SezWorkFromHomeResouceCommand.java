package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.sez.status.application.form.service.model.SezStatusWorkFromHome;
import com.nbp.sez.status.application.form.service.service.SezStatusWorkFromHomeLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/work/from/home/info/in/sez"
		},
		service = MVCResourceCommand.class
		)
public class SezWorkFromHomeResouceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		System.out.println("after Portlet Resource Command");
		String companyName = ParamUtil.getString(resourceRequest, "companyName");
		String contactPersonName = ParamUtil.getString(resourceRequest, "contactPersonName");
		String contactPersonEmail = ParamUtil.getString(resourceRequest, "contactPersonEmail");
		String controlNumberWorkFromHome = ParamUtil.getString(resourceRequest, "controlNumberWorkFromHome");
		String workerUtillizingWorkFromHome = ParamUtil.getString(resourceRequest, "workerUtillizingWorkFromHome");
		String workerMonthsUtillizingWFH = ParamUtil.getString(resourceRequest, "workerMonthsUtillizingWFH");
		Long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		SezStatusWorkFromHome sezStatusWorkFromHome=null;
		try {
			sezStatusWorkFromHome=SezStatusWorkFromHomeLocalServiceUtil.createSezStatusWorkFromHome(CounterLocalServiceUtil.increment());
			sezStatusWorkFromHome.setCompanyName(companyName);
			sezStatusWorkFromHome.setContactPersonName(contactPersonName);
			sezStatusWorkFromHome.setContactPersonEmail(contactPersonEmail);
			sezStatusWorkFromHome.setControlNumber(controlNumberWorkFromHome);
			sezStatusWorkFromHome.setWorkerUtilizingIncentive(workerUtillizingWorkFromHome);
			sezStatusWorkFromHome.setSezStatusApplicationId(sezStatusApplicationId);
			sezStatusWorkFromHome.setWorkerUtilizingIncentiveMonth(workerMonthsUtillizingWFH);
			SezStatusWorkFromHomeLocalServiceUtil.updateSezStatusWorkFromHome(sezStatusWorkFromHome);
		}catch (Exception e) {
		}
		return false;
	}

}
