package com.nbp.mining.lease.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
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
	"mvc.command.name=/transfer/director/detail/edit" }, 
service = MVCResourceCommand.class)

public class MiningAddTransferDirectorDetailResourceCommand implements MVCResourceCommand{
	private static Log _log=LogFactoryUtil.getLog(MiningAddTransferDirectorDetailResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String transferCompanyDirectorName=ParamUtil.getString(resourceRequest, "transferCompanyDirectorName");
		String transferCompanyDirectorNationality=ParamUtil.getString(resourceRequest, "transferCompanyDirectorNationality");
		String transferCompanyDirectorPartnership=ParamUtil.getString(resourceRequest, "transferCompanyDirectorPartnership");
		String transferCounterDirector=ParamUtil.getString(resourceRequest, "transferCounterDirector");
		long miningLeaseApplicationId=ParamUtil.getLong(resourceRequest, "miningLeaseApplicationId");
		/* hidden */
		long transferDirectorDetailId=ParamUtil.getLong(resourceRequest, "transferDirectorDetailId");
		
		MiningProspectingLicenseAdd transferDirectorDetails=null;
		  try {
			  transferDirectorDetails= MiningProspectingLicenseAddLocalServiceUtil.getMiningProspectingLicenseAdd(transferDirectorDetailId);
		  } catch (Exception e) {}
		  if(transferDirectorDetails==null) {
			  transferDirectorDetails= MiningProspectingLicenseAddLocalServiceUtil.createMiningProspectingLicenseAdd(CounterLocalServiceUtil.increment());
			  transferDirectorDetails.setCounter(transferCounterDirector);
		  }
		  transferDirectorDetails.setName(transferCompanyDirectorName);
		  transferDirectorDetails.setNationality(transferCompanyDirectorNationality);
		  transferDirectorDetails.setDirectorsOfCompany(transferCompanyDirectorPartnership);
		  transferDirectorDetails.setMiningLeaseApplicationId(miningLeaseApplicationId);
		MiningProspectingLicenseAddLocalServiceUtil.updateMiningProspectingLicenseAdd(transferDirectorDetails);
		
		jsonOBJ.put("transferDirectorDetailId", transferDirectorDetails.getMiningProspectingLicenseAddId());
		jsonOBJ.put("transferCounter", transferDirectorDetails.getCounter());
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
