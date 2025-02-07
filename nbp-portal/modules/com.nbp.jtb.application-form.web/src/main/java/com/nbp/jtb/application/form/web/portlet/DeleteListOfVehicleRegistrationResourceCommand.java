package com.nbp.jtb.application.form.web.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.jtb.application.form.service.model.JtbAddListVehicleRegst;
import com.nbp.jtb.application.form.service.service.JtbAddListVehicleRegstLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
	"mvc.command.name=/list/vehicle/regsitration/delete" }, 
service = MVCResourceCommand.class)

public class DeleteListOfVehicleRegistrationResourceCommand implements MVCResourceCommand{
	private static Log _log=LogFactoryUtil.getLog(DeleteListOfVehicleRegistrationResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		/* hidden */
		long contractVehicleRegisterDetailId=ParamUtil.getLong(resourceRequest, "contractVehicleRegisterDetailId");
		
		JtbAddListVehicleRegst vehicleRegst=null;
		  try {
			  vehicleRegst= JtbAddListVehicleRegstLocalServiceUtil.deleteJtbAddListVehicleRegst(contractVehicleRegisterDetailId);
		  } catch (Exception e) {}
		  
		
		return false;
	}

}
