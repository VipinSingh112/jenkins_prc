package com.nbp.jtb.application.form.web.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.jtb.application.form.service.model.JtbAddCraftApplicantInfo;
import com.nbp.jtb.application.form.service.model.JtbAddListDriverInfo;
import com.nbp.jtb.application.form.service.service.JtbAddCraftApplicantInfoLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JtbAddListDriverInfoLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
	"mvc.command.name=/craft/trader/employee/delete" }, 
service = MVCResourceCommand.class)

public class DeleteCraftTraderEmployeeDataResourceCommand implements MVCResourceCommand{
	private static Log _log=LogFactoryUtil.getLog(DeleteCraftTraderEmployeeDataResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		/* hidden */
		long craftTradersEmployeeDetailId=ParamUtil.getLong(resourceRequest, "craftTradersEmployeeDetailId");
		
		JtbAddCraftApplicantInfo craftEmployee=null;
		  try {
			  craftEmployee= JtbAddCraftApplicantInfoLocalServiceUtil.deleteJtbAddCraftApplicantInfo(craftTradersEmployeeDetailId);
		  } catch (Exception e) {}
		  
		
		return false;
	}

}
