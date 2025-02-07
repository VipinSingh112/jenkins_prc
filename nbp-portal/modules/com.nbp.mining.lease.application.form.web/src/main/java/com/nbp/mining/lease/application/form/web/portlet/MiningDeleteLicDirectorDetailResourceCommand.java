package com.nbp.mining.lease.application.form.web.portlet;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.mining.lease.application.form.web.constants.MiningLeaseApplicationFormPortletKeys;
import com.nbp.mining.lease.application.service.model.MiningProspectingLicenseAdd;
import com.nbp.mining.lease.application.service.service.MiningProspectingLicenseAddLocalServiceUtil;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + MiningLeaseApplicationFormPortletKeys.MININGLEASEAPPLICATIONFORM,
	"mvc.command.name=/delete/director/detail/editForm" }, 
service = MVCResourceCommand.class)

public class MiningDeleteLicDirectorDetailResourceCommand implements MVCResourceCommand{
	private static Log _log=LogFactoryUtil.getLog(MiningDeleteLicDirectorDetailResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String counterLicDirector=ParamUtil.getString(resourceRequest, "counterLicDirector");
		long miningLeaseApplicationId=ParamUtil.getLong(resourceRequest, "miningLeaseApplicationId");
		/* hidden */
		long directorDetailId=ParamUtil.getLong(resourceRequest, "directorDetailId");
		
		MiningProspectingLicenseAdd directorDetails=null;
		  try {
			  directorDetails= MiningProspectingLicenseAddLocalServiceUtil.deleteMiningProspectingLicenseAdd(directorDetailId);
			  directorDetails.setCounter(counterLicDirector);
		  } catch (Exception e) {}
		  jsonOBJ.put("licDirectorDetailId", directorDetails.getMiningProspectingLicenseAddId());
			jsonOBJ.put("directorDetailValData", directorDetails.getCounter());
			jsonFeed.put("APP_DATA", jsonOBJ);
			resourceResponse.setContentType("application/json");
			try {
				resourceResponse.getWriter().write(jsonFeed.toString());
			} catch (IOException e) {
				_log.error("An Error Occured", e);
			}
		
		return false;
	}

}
