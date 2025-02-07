package com.nbp.sez.status.application.form.category.occupant;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.SezOccupantShareHoldingInfo;
import com.nbp.sez.status.application.form.service.service.SezOccupantShareHoldingInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

	@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/sez/status/sahre/holding" }, 
		service = MVCResourceCommand.class)
public class SezOccupantShareHoldingResourceCommand implements MVCResourceCommand {
		private static Log _log=LogFactoryUtil.getLog(SezOccupantShareHoldingResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String occAuthorised = ParamUtil.getString(resourceRequest, "occAuthorised");
		String occSubscribed = ParamUtil.getString(resourceRequest, "occSubscribed");
		String occPaidCapital = ParamUtil.getString(resourceRequest, "occPaidCapital");
		String counter = ParamUtil.getString(resourceRequest, "counterVal");
		
		long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		SezOccupantShareHoldingInfo shareHoldingInfo = null;
		try {
			shareHoldingInfo = SezOccupantShareHoldingInfoLocalServiceUtil.getSezStatusBy_App_Id(sezStatusApplicationId);	
		}catch (Exception e) {
		}
		if(Validator.isNull(shareHoldingInfo)) {
		shareHoldingInfo = SezOccupantShareHoldingInfoLocalServiceUtil
				.createSezOccupantShareHoldingInfo(CounterLocalServiceUtil.increment());
		}
		shareHoldingInfo.setOccAuthorised(occAuthorised);
		shareHoldingInfo.setOccSubscribed(occSubscribed);
		shareHoldingInfo.setOccPaidCapital(occPaidCapital);
		shareHoldingInfo.setOccShareHolderCounter(counter);
		// Set the application ID
		shareHoldingInfo.setSezStatusApplicationId(sezStatusApplicationId);
		// Save the entity to the database
		SezOccupantShareHoldingInfoLocalServiceUtil.updateSezOccupantShareHoldingInfo(shareHoldingInfo);
		return false;
	}

}
