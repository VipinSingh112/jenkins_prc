package com.nbp.ncbj.application.form.web.portlet;



import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
			"mvc.command.name=/company/detail/info"
		},
		service = MVCResourceCommand.class
	)
public class AddCompanyDetailsResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		
		String companyDetailVal = ParamUtil.getString(resourceRequest, "companyDetailVal");
		resourceRequest.setAttribute("companyDetailVal", companyDetailVal);
		
		try {
			resourceRequest.getPortletContext().getRequestDispatcher("/ncbj-forms/company-detail-info.jsp")
					.include(resourceRequest, resourceResponse);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
