package com.nbp.factories.registration.application.form.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.factories.registration.application.form.services.model.FactoriesProductDetailsAdd;
import com.nbp.factories.registration.application.form.services.service.FactoriesProductDetailsAddLocalServiceUtil;
import com.nbp.factories.registration.application.form.web.constants.FactoriesRegistrationApplicationFormWebPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + FactoriesRegistrationApplicationFormWebPortletKeys.FACTORIESREGISTRATIONAPPLICATIONFORMWEB,
		"mvc.command.name=delete/product/detail"
}, service = MVCResourceCommand.class)
public class DeleteProductDetailResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		long productDetail=ParamUtil.getLong(resourceRequest, "productDetail");
		FactoriesProductDetailsAdd productDetailData=null;
		  try {
			  productDetailData=FactoriesProductDetailsAddLocalServiceUtil.deleteFactoriesProductDetailsAdd(productDetail);
		  } catch (Exception e) {
		  }
		return false;
	}

	

}
