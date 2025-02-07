package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.sez.status.application.form.service.model.SezDevShareholdingInfo;
import com.nbp.sez.status.application.form.service.service.SezDevShareholdingInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/developer/shareholding/info" }, service = MVCResourceCommand.class)
public class SezStatusDeveloperShareholdingPartnershipResourceCommnad implements MVCResourceCommand {
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String devEquityAuthorised = ParamUtil.getString(resourceRequest, "devEquityAuthorised");
		String devEquitySubscribed = ParamUtil.getString(resourceRequest, "devEquitySubscribed");
		String devEquityPaidCapital=ParamUtil.getString(resourceRequest, "devEquityPaidCapital");
		String comDirectorBankruptInvolve = ParamUtil.getString(resourceRequest, "comDirectorBankruptInvolve");
		long sezStatusApplicationId=ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		
		SezDevShareholdingInfo devShareholdingInfo = null;
		try {
			devShareholdingInfo = SezDevShareholdingInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(devShareholdingInfo==null) {
		devShareholdingInfo = SezDevShareholdingInfoLocalServiceUtil
				.createSezDevShareholdingInfo(CounterLocalServiceUtil.increment());
		}
		devShareholdingInfo.setAuthorised(devEquityAuthorised);
		devShareholdingInfo.setSubscribed(devEquitySubscribed);
		devShareholdingInfo.setPaidUpShareCapital(devEquityPaidCapital);
		devShareholdingInfo.setDirectorBankrupts(comDirectorBankruptInvolve);
		devShareholdingInfo.setSezStatusApplicationId(sezStatusApplicationId);
		SezDevShareholdingInfoLocalServiceUtil.updateSezDevShareholdingInfo(devShareholdingInfo);
		return false;
	}
}