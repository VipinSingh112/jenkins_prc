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
	"mvc.command.name=/lease/director/detail/edit" }, 
service = MVCResourceCommand.class)

public class MiningAddLeaseDirectorDetailResourceCommand implements MVCResourceCommand{
	private static Log _log=LogFactoryUtil.getLog(MiningAddLeaseDirectorDetailResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String miningCompanyDirectorName=ParamUtil.getString(resourceRequest, "miningCompanyDirectorName");
		String miningCompanyDirectorNationality=ParamUtil.getString(resourceRequest, "miningCompanyDirectorNationality");
		String miningCompanyDirectorPartnership=ParamUtil.getString(resourceRequest, "miningCompanyDirectorPartnership");
		String leaseCounterDirector=ParamUtil.getString(resourceRequest, "leaseCounterDirector");
		long miningLeaseApplicationId=ParamUtil.getLong(resourceRequest, "miningLeaseApplicationId");
		/* hidden */
		long miningDirectorDetailId=ParamUtil.getLong(resourceRequest, "miningDirectorDetailId");
		
		MiningProspectingLicenseAdd leaseDirectorDetails=null;
		  try {
			  leaseDirectorDetails= MiningProspectingLicenseAddLocalServiceUtil.getMiningProspectingLicenseAdd(miningDirectorDetailId);
		  } catch (Exception e) {}
		  if(leaseDirectorDetails==null) {
			leaseDirectorDetails= MiningProspectingLicenseAddLocalServiceUtil.createMiningProspectingLicenseAdd(CounterLocalServiceUtil.increment());
			leaseDirectorDetails.setCounter(leaseCounterDirector);
		  }
		leaseDirectorDetails.setName(miningCompanyDirectorName);
		leaseDirectorDetails.setNationality(miningCompanyDirectorNationality);
		leaseDirectorDetails.setDirectorsOfCompany(miningCompanyDirectorPartnership);
		leaseDirectorDetails.setMiningLeaseApplicationId(miningLeaseApplicationId);
		MiningProspectingLicenseAddLocalServiceUtil.updateMiningProspectingLicenseAdd(leaseDirectorDetails);
		
		jsonOBJ.put("miningDirectorId", leaseDirectorDetails.getMiningProspectingLicenseAddId());
		jsonOBJ.put("leaseCounter", leaseDirectorDetails.getCounter());
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
