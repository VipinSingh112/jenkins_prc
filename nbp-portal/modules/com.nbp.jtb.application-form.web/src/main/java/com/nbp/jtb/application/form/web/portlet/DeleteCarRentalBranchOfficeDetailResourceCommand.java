package com.nbp.jtb.application.form.web.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo;
import com.nbp.jtb.application.form.service.model.JtbAddCraftApplicantInfo;
import com.nbp.jtb.application.form.service.service.JtbAddBranchDetailInfoLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JtbAddCraftApplicantInfoLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
	"mvc.command.name=/car/rental/branch/office/delete" }, 
service = MVCResourceCommand.class)

public class DeleteCarRentalBranchOfficeDetailResourceCommand implements MVCResourceCommand{
	private static Log _log=LogFactoryUtil.getLog(DeleteCarRentalBranchOfficeDetailResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		//String counterOperator=ParamUtil.getString(resourceRequest, "counterOperator");
		long jtbApplicationId=ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		/* hidden */
		long carRentalBranchDetailId=ParamUtil.getLong(resourceRequest, "carRentalBranchDetailId");
		System.out.println("DELETE CAR RENTAL BRANCH DETAIL****");
		JtbAddBranchDetailInfo branchDetails=null;
		  try {
			  branchDetails= JtbAddBranchDetailInfoLocalServiceUtil.deleteJtbAddBranchDetailInfo(carRentalBranchDetailId);
		  } catch (Exception e) {
			  e.printStackTrace();
		  }
		  
		
		return false;
	}

}
