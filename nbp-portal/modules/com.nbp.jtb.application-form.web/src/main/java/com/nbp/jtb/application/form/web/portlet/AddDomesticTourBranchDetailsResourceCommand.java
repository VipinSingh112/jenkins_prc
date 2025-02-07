package com.nbp.jtb.application.form.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/domestic/tour/branch/detail/info" }, service = MVCResourceCommand.class)
public class AddDomesticTourBranchDetailsResourceCommand implements MVCResourceCommand{
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		String domesticTourBranchDetailVal = ParamUtil.getString(resourceRequest, "domesticTourBranchDetailVal");
		resourceRequest.setAttribute("domesticTourBranchDetailVal", domesticTourBranchDetailVal);
		try {
			resourceRequest.getPortletContext().getRequestDispatcher("/forms/domestic-tour-branch-detail-info.jsp").include(resourceRequest, resourceResponse);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
}
