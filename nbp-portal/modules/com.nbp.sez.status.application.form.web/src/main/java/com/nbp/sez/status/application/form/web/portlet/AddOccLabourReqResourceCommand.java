package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=addOccLabourReqInfoUrl" }, 
	service = MVCResourceCommand.class
	)
public class AddOccLabourReqResourceCommand implements MVCResourceCommand{
@Override
public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws PortletException {
	// TODO Auto-generated method stub
	String occLabourReqVal = ParamUtil.getString(resourceRequest, "occLabourReqVal");
	resourceRequest.setAttribute("occLabourReqVal", occLabourReqVal);
	try {
		resourceRequest.getPortletContext().getRequestDispatcher("/forms/occLabourReqInfo.jsp")
				.include(resourceRequest, resourceResponse);
	} catch (IOException e) {
		e.printStackTrace();
	}
	return false;
}
}
