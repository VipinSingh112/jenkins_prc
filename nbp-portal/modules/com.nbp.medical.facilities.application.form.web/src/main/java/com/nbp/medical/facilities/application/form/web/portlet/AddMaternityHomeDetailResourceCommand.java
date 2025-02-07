package com.nbp.medical.facilities.application.form.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.medical.facilities.application.form.web.constants.MedicalFacilitiesApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + MedicalFacilitiesApplicationFormPortletKeys.MEDICALFACILITIESAPPLICATIONFORM,
			"mvc.command.name=/maternity/home/detail/info"
		},
		service = MVCResourceCommand.class
	)
public class AddMaternityHomeDetailResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		System.out.println("inside maternity resource");
		String maternityHomeDetailVal = ParamUtil.getString(resourceRequest, "maternityHomeDetailVal");
		resourceRequest.setAttribute("maternityHomeDetailVal", maternityHomeDetailVal);
		System.out.println("maternityHomeDetailVal - "+maternityHomeDetailVal);
		try {
			resourceRequest.getPortletContext().getRequestDispatcher("/forms/maternity-home-detail.jsp")
					.include(resourceRequest, resourceResponse);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

}
