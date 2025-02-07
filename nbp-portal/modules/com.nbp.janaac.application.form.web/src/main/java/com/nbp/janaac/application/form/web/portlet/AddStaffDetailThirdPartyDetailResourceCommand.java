package com.nbp.janaac.application.form.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=staff/detail/third/party/detail" 
			}, 
		service = MVCResourceCommand.class)
public class AddStaffDetailThirdPartyDetailResourceCommand implements MVCResourceCommand{
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		String staffDetailThirdPartyVal = ParamUtil.getString(resourceRequest, "staffDetailThirdPartyVal");
		resourceRequest.setAttribute("staffDetailThirdPartyVal", staffDetailThirdPartyVal);
		try {
			resourceRequest.getPortletContext().getRequestDispatcher("/additional-forms/staff-detail-third-party-info.jsp")
					.include(resourceRequest, resourceResponse);
		} catch (IOException e) {
		}
		return false;
	}
}