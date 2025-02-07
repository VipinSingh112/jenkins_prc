

package com.nbp.user.dashboard.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.cannabis.application.form.services.service.CannabisApplicationsLocalServiceUtil;
import com.nbp.user.dashboard.constants.UserDashboardPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
	    immediate = true,
	    property = {
	        "javax.portlet.name="+UserDashboardPortletKeys.USERDASHBOARD,
	        "mvc.command.name=agricultureApplicationOverview"
	    },
	    service = MVCResourceCommand.class
	)
public class AgricultureSingleApplicationOverviewResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		long agricultureApplicationID = ParamUtil.getLong(resourceRequest, "agricultureApplicationID");
		resourceRequest.setAttribute("agricultureApplicationID", agricultureApplicationID);
		try {
			resourceRequest.getPortletContext().getRequestDispatcher("/single-application-details/single-application-tabs.jsp").include(resourceRequest, resourceResponse);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
}
