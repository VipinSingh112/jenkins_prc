package com.nbp.jadsc.application.form.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.jadsc.application.form.web.constants.JADSCApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + JADSCApplicationFormPortletKeys.JADSCAPPLICATIONFORM,
			"mvc.command.name=doc/served/address",
		},
		service = MVCResourceCommand.class
	)
public class AddServedAddressDetailResourceCommand implements MVCResourceCommand{
@Override
public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws PortletException {
	// TODO Auto-generated method stub
			String docServedAddressVal = ParamUtil.getString(resourceRequest, "docServedAddressVal");
			resourceRequest.setAttribute("docServedAddressVal", docServedAddressVal);
			try {
				resourceRequest.getPortletContext().getRequestDispatcher("/forms/served-address-detail-info.jsp")
						.include(resourceRequest, resourceResponse);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return false;
	}
}
