package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncbj.application.form.service.model.NcbjBusinessDetailAdd;
import com.nbp.ncbj.application.form.service.service.NcbjBusinessDetailAddLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
			"mvc.command.name=delete/information"
		},
		service = MVCResourceCommand.class
	)
public class DeleteBusinessDetailInfoResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		long applicantDetailValId=ParamUtil.getLong(resourceRequest, "applicantDetailValId");
		NcbjBusinessDetailAdd businessDetail=null;
		  try {
			  businessDetail= NcbjBusinessDetailAddLocalServiceUtil.deleteNcbjBusinessDetailAdd(applicantDetailValId);
		  } catch (Exception e) {
		  }
		return false;
	}

}
