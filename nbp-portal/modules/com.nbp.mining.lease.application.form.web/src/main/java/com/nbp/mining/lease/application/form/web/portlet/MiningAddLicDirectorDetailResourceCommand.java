package com.nbp.mining.lease.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
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
	"mvc.command.name=/licence/director/detail/edit" }, 
service = MVCResourceCommand.class)

public class MiningAddLicDirectorDetailResourceCommand implements MVCResourceCommand{
	private static Log _log=LogFactoryUtil.getLog(MiningAddLicDirectorDetailResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String companyDirectorName=ParamUtil.getString(resourceRequest, "companyDirectorName");
		String companyDirectorNationality=ParamUtil.getString(resourceRequest, "companyDirectorNationality");
		String companyDirectorPartnership=ParamUtil.getString(resourceRequest, "companyDirectorPartnership");
		String counter=ParamUtil.getString(resourceRequest, "counter");
		String deleteKey = ParamUtil.getString(resourceRequest, "deleteKey");
		long miningLeaseApplicationId=ParamUtil.getLong(resourceRequest, "miningLeaseApplicationId");
		/* hidden */
		long directorDetailId=ParamUtil.getLong(resourceRequest, "directorDetailId");
		
		if(deleteKey.contains("deleteApplicant")) {
			try {
				MiningProspectingLicenseAddLocalServiceUtil.deleteMiningProspectingLicenseAdd(directorDetailId);
			} catch (PortalException e) {
			}
		}else {
		MiningProspectingLicenseAdd directorDetails=null;
		  try {
			  directorDetails= MiningProspectingLicenseAddLocalServiceUtil.getMiningProspectingLicenseAdd(directorDetailId);
		  } catch (Exception e) {}
		  if(directorDetails==null) {
			directorDetails= MiningProspectingLicenseAddLocalServiceUtil.createMiningProspectingLicenseAdd(CounterLocalServiceUtil.increment());
			directorDetails.setCounter(counter);
		  }
		directorDetails.setName(companyDirectorName);
		directorDetails.setNationality(companyDirectorNationality);
		directorDetails.setDirectorsOfCompany(companyDirectorPartnership);
		directorDetails.setMiningLeaseApplicationId(miningLeaseApplicationId);
		MiningProspectingLicenseAddLocalServiceUtil.updateMiningProspectingLicenseAdd(directorDetails);
		
		jsonOBJ.put("directorDetailId", directorDetails.getMiningProspectingLicenseAddId());
		jsonOBJ.put("counter", directorDetails.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Occured", e);
		 }
		}
		return false;
	}

}
