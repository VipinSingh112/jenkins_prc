package com.nbp.mining.lease.application.form.web.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.mining.lease.application.form.web.constants.MiningLeaseApplicationFormPortletKeys;
import com.nbp.mining.lease.application.service.model.MiningProspectingLicenseAdd;
import com.nbp.mining.lease.application.service.service.MiningProspectingLicenseAddLocalServiceUtil;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + MiningLeaseApplicationFormPortletKeys.MININGLEASEAPPLICATIONFORM,
	"mvc.command.name=/delete/transfer/director/detail/editForm" }, 
service = MVCResourceCommand.class)

public class MiningDeleteTransferDirectorDetailResourceCommand implements MVCResourceCommand{
	private static Log _log=LogFactoryUtil.getLog(MiningDeleteTransferDirectorDetailResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String transferCounterDirector=ParamUtil.getString(resourceRequest, "transferCounterDirector");
		long miningLeaseApplicationId=ParamUtil.getLong(resourceRequest, "miningLeaseApplicationId");
		/* hidden */
		long transferDirectorDetailId=ParamUtil.getLong(resourceRequest, "transferDirectorDetailId");
		
		MiningProspectingLicenseAdd directorDetails=null;
		  try {
			  directorDetails= MiningProspectingLicenseAddLocalServiceUtil.deleteMiningProspectingLicenseAdd(transferDirectorDetailId);
		  } catch (Exception e) {}
		  
		
		return false;
	}

}
