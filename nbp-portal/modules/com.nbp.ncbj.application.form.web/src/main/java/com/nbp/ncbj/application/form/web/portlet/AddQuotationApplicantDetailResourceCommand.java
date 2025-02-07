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
			"mvc.command.name=/quotation/applicants/detail/info"
		},
		service = MVCResourceCommand.class
	)
public class AddQuotationApplicantDetailResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		String quotationApplicantDetailVal = ParamUtil.getString(resourceRequest, "quotationApplicantDetailVal");
		resourceRequest.setAttribute("quotationApplicantDetailVal", quotationApplicantDetailVal);
		
		try {
			resourceRequest.getPortletContext().getRequestDispatcher("/ncbj-forms/quotation-applicant-detail-info.jsp")
					.include(resourceRequest, resourceResponse);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
}

