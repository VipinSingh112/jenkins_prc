package com.nbp.hsra.application.form.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
	"mvc.command.name=applicant/signature/detail" }, service = MVCResourceCommand.class)
public class AddApplicantSignatureDetailsResourceCommand implements MVCResourceCommand{
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		String applicantSignatureDetailVal = ParamUtil.getString(resourceRequest, "applicantSignatureDetailVal");
		resourceRequest.setAttribute("applicantSignatureDetailVal", applicantSignatureDetailVal);
		try {
			resourceRequest.getPortletContext().getRequestDispatcher("/forms/applicant-signature-detail-info.jsp")
					.include(resourceRequest, resourceResponse);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
}
