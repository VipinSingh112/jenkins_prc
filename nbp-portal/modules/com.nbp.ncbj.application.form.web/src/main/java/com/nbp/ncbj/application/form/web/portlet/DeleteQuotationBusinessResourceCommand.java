package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncbj.application.form.service.model.NcbjBusinessDetail;
import com.nbp.ncbj.application.form.service.service.NcbjBusinessDetailLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
			"mvc.command.name=/delete/quotation/Business/Add"
		},
		service = MVCResourceCommand.class
	)
public class DeleteQuotationBusinessResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String counterquotationApplicantDetail=ParamUtil.getString(resourceRequest, "counterquotationApplicantDetail");
		long ncbjApplicationId=ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		/* hidden */
		long quotationApplicantDetailValId=ParamUtil.getLong(resourceRequest, "quotationApplicantDetailValId");
		
		NcbjBusinessDetail quotationBusinessDetail=null;
		
		try {
			quotationBusinessDetail= NcbjBusinessDetailLocalServiceUtil.deleteNcbjBusinessDetail(quotationApplicantDetailValId);
		  } catch (Exception e) {}
		return false;
	}

}
