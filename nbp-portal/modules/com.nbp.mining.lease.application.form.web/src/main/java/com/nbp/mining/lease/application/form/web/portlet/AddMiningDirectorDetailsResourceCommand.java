package com.nbp.mining.lease.application.form.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.mining.lease.application.form.web.constants.MiningLeaseApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + MiningLeaseApplicationFormPortletKeys.MININGLEASEAPPLICATIONFORM,
			"mvc.command.name=/mining/director/detail/info"
		},
		service = MVCResourceCommand.class
	)
public class AddMiningDirectorDetailsResourceCommand implements MVCResourceCommand{
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		String miningDirectorDetailVal = ParamUtil.getString(resourceRequest, "miningDirectorDetailVal");
		resourceRequest.setAttribute("miningDirectorDetailVal", miningDirectorDetailVal);
		try {
			resourceRequest.getPortletContext().getRequestDispatcher("/forms/mining-director-detail-info.jsp").include(resourceRequest, resourceResponse);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
}
