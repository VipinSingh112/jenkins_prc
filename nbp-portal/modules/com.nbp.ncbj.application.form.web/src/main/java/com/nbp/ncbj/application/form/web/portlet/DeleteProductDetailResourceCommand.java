package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetail;
import com.nbp.ncbj.application.form.service.service.NcbjProductServiceDetailLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
			"mvc.command.name=delete/product"
		},
		service = MVCResourceCommand.class
	)

public class DeleteProductDetailResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		long productServicesDetailId=ParamUtil.getLong(resourceRequest, "productServicesDetailId");
		NcbjProductServiceDetail productDetail=null;
		  try {
			  productDetail=NcbjProductServiceDetailLocalServiceUtil.deleteNcbjProductServiceDetail(productServicesDetailId);
		  } catch (Exception e) {
		  }
		return false;
	}

}
