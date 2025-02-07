package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo;
import com.nbp.jtb.application.form.service.service.JtbAddBranchDetailInfoLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
	"mvc.command.name=/domestic/tour/branch/detail/edit" }, 
service = MVCResourceCommand.class)

public class JTBAddDomesticTourBranchDetailResourceCommand implements MVCResourceCommand{
	private static Log _log=LogFactoryUtil.getLog(JTBAddDomesticTourBranchDetailResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String domesticTourBranchTelephoneNo=ParamUtil.getString(resourceRequest, "domesticTourBranchTelephoneNo");
		String domesticTourOfficeLocation=ParamUtil.getString(resourceRequest, "domesticTourOfficeLocation");
		String counterDomesticTourBranch=ParamUtil.getString(resourceRequest, "counterDomesticTourBranch");
		long jtbApplicationId=ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		/* hidden */
		long domesticTourBranchDetailId=ParamUtil.getLong(resourceRequest, "domesticTourBranchDetailId");
		
		JtbAddBranchDetailInfo branchDetails=null;
		  try {
			  branchDetails= JtbAddBranchDetailInfoLocalServiceUtil.getJtbAddBranchDetailInfo(domesticTourBranchDetailId);
		  } catch (Exception e) {}
		  if(branchDetails==null) {
			branchDetails= JtbAddBranchDetailInfoLocalServiceUtil.createJtbAddBranchDetailInfo(CounterLocalServiceUtil.increment());
			branchDetails.setCounter(counterDomesticTourBranch);
		  }
		branchDetails.setBranchOfficeDetails(domesticTourBranchTelephoneNo);
		branchDetails.setBranchOfficeLocation(domesticTourOfficeLocation);
		branchDetails.setJtbApplicationId(jtbApplicationId);
		JtbAddBranchDetailInfoLocalServiceUtil.updateJtbAddBranchDetailInfo(branchDetails);
		
		jsonOBJ.put("domesticTourBranchDetailId", branchDetails.getJtbBranchDetailInfoId());
		jsonOBJ.put("counter", branchDetails.getCounter());
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
