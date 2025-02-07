package com.nbp.mining.lease.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
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
	"mvc.command.name=/form/nine/director/details" 
	}, service = MVCResourceCommand.class)

public class MiningTransferDirectorDetailResourceCommand implements MVCResourceCommand{
	private static Log _log=LogFactoryUtil.getLog(MiningTransferDirectorDetailResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String transferCompanyDirectorNationality=ParamUtil.getString(resourceRequest, "transferCompanyDirectorNationality");
		String transferCompanyDirectorName=ParamUtil.getString(resourceRequest, "transferCompanyDirectorName");
		String transferCompanyDirectorPartnership=ParamUtil.getString(resourceRequest, "transferCompanyDirectorPartnership");
		String count=ParamUtil.getString(resourceRequest, "count");
		long miningLeaseApplicationId=ParamUtil.getLong(resourceRequest, "miningLeaseApplicationId");
		/* hidden */
		long transferDirectorDetailId=ParamUtil.getLong(resourceRequest, "transferDirectorDetailId");
		
		MiningProspectingLicenseAdd directorDetails=null;
		if(Validator.isNotNull(transferDirectorDetailId)) {
		  try {
			  directorDetails= MiningProspectingLicenseAddLocalServiceUtil.getMiningProspectingLicenseAdd(transferDirectorDetailId);
		  } catch (Exception e) {}
		} else{
			directorDetails= MiningProspectingLicenseAddLocalServiceUtil.createMiningProspectingLicenseAdd(CounterLocalServiceUtil.increment());
			directorDetails.setCounter(count);
		  }
		directorDetails.setName(transferCompanyDirectorName);
		directorDetails.setNationality(transferCompanyDirectorNationality);
		directorDetails.setDirectorsOfCompany(transferCompanyDirectorPartnership);
		directorDetails.setMiningLeaseApplicationId(miningLeaseApplicationId);
		MiningProspectingLicenseAddLocalServiceUtil.updateMiningProspectingLicenseAdd(directorDetails);
		
		jsonOBJ.put("transferDirectorDetailId", directorDetails.getMiningProspectingLicenseAddId());
		jsonOBJ.put("count", count);
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Occured", e);
		}
		// TODO Auto-generated method stub
		return false;
	}

}
