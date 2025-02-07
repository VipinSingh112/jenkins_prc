package com.nbp.wra.application.form.web.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.wra.application.form.service.model.WRAReqIrrigation;
import com.nbp.wra.application.form.service.service.WRAReqIrrigationLocalServiceUtil;
import com.nbp.wra.application.form.web.constants.WRAApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + WRAApplicationFormPortletKeys.WRAAPPLICATIONFORM,
	"mvc.command.name=/water/required/irrigation/delete" }, 
service = MVCResourceCommand.class)

public class DeleteWaterRequiredIrrigationDataResourceCommand implements MVCResourceCommand{
	private static Log _log=LogFactoryUtil.getLog(DeleteWaterRequiredIrrigationDataResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		/* hidden */
		long waterIrrigationDetailId=ParamUtil.getLong(resourceRequest, "waterIrrigationDetailId");
		
		WRAReqIrrigation wraReqIrr=null;
		  try {
			  wraReqIrr= WRAReqIrrigationLocalServiceUtil.deleteWRAReqIrrigation(waterIrrigationDetailId);
		  } catch (Exception e) {}
		  
		
		return false;
	}

}
