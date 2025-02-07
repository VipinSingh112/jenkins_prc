package com.nbp.miic.application.form.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.miic.application.form.web.constants.MIICApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + MIICApplicationFormPortletKeys.MIICAPPLICATIONFORM,
			"mvc.command.name=/cetSuspension/detail/info"
		},
		service = MVCResourceCommand.class
	)
public class AddCetSuspensionDetailResourceCommand implements MVCResourceCommand{
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		String cetSuspensionDetailVal = ParamUtil.getString(resourceRequest, "cetSuspensionDetailVal");
		resourceRequest.setAttribute("cetSuspensionDetailVal", cetSuspensionDetailVal);
		try {
			resourceRequest.getPortletContext().getRequestDispatcher("/forms/cet-suspension-detail-info.jsp").include(resourceRequest, resourceResponse);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
}
