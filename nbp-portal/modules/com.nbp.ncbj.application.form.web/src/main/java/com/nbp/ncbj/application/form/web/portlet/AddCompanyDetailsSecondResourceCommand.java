package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
			"mvc.command.name=/section/one/company/info"
		},
		service = MVCResourceCommand.class
	)
public class AddCompanyDetailsSecondResourceCommand implements MVCResourceCommand{
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		
		String sectionOneCompanyDetailVal = ParamUtil.getString(resourceRequest, "sectionOneCompanyDetailVal");
		resourceRequest.setAttribute("sectionOneCompanyDetailVal", sectionOneCompanyDetailVal);
		
		try {
			resourceRequest.getPortletContext().getRequestDispatcher("/ncbj-forms/company-detail-second-info.jsp")
					.include(resourceRequest, resourceResponse);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
}
