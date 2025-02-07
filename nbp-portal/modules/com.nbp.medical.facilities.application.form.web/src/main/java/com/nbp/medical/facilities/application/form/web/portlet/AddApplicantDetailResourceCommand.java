package com.nbp.medical.facilities.application.form.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.medical.facilities.application.form.web.constants.MedicalFacilitiesApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + MedicalFacilitiesApplicationFormPortletKeys.MEDICALFACILITIESAPPLICATIONFORM,
			"mvc.command.name=/applicant/detail/info"
		},
		service = MVCResourceCommand.class
	)
public class AddApplicantDetailResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		System.out.println("resource calling");
		String applicantDetailVal = ParamUtil.getString(resourceRequest, "applicantDetailVal");
		resourceRequest.setAttribute("applicantDetailVal", applicantDetailVal);
		System.out.println("applicantDetailVal --- "+applicantDetailVal);
		try {
			resourceRequest.getPortletContext().getRequestDispatcher("/forms/applicant-detail-info.jsp")
					.include(resourceRequest, resourceResponse);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
