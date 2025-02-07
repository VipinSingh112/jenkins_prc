package com.nbp.factories.registration.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.factories.registration.application.form.services.model.FactoriesProductDetailsAdd;
import com.nbp.factories.registration.application.form.services.service.FactoriesProductDetailsAddLocalServiceUtil;
import com.nbp.factories.registration.application.form.web.constants.FactoriesRegistrationApplicationFormWebPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + FactoriesRegistrationApplicationFormWebPortletKeys.FACTORIESREGISTRATIONAPPLICATIONFORMWEB,
		"mvc.command.name=product/detail/add" }, service = MVCResourceCommand.class)
public class FactoriesRegistrationAddProductDetailResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(FactoriesRegistrationAddProductDetailResourceCommand.class.getName());

	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("calling ADD PRODUCT DETAIL Resource Command--->>>");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long factoriesApplicationId = ParamUtil.getLong(resourceRequest, "factoriesApplicationId");
		long factoriesProductDetailsAddId = ParamUtil.getLong(resourceRequest, "factoriesProductDetailsAddId");
		
		String brand = ParamUtil.getString(resourceRequest, "brand");
		String product = ParamUtil.getString(resourceRequest, "product");
		String productSize = ParamUtil.getString(resourceRequest, "productSize");
		String measurementValue = ParamUtil.getString(resourceRequest, "measurementValue");
		String counter = ParamUtil.getString(resourceRequest, "counter");
		
		
		FactoriesProductDetailsAdd productDetail = null;
			try {
				productDetail = FactoriesProductDetailsAddLocalServiceUtil.getFactoriesProductDetailsAdd(factoriesProductDetailsAddId);
			} catch (PortalException e) {}
		if(productDetail==null) {
			productDetail = FactoriesProductDetailsAddLocalServiceUtil.createFactoriesProductDetailsAdd(
					CounterLocalServiceUtil.increment());
			productDetail.setCounter(counter);
		}
		productDetail.setProductBrand(brand);
		productDetail.setProduct(product);
		productDetail.setProductSize(productSize);
		productDetail.setProductMeasurementVal(measurementValue);
		productDetail.setFactoriesApplicationId(factoriesApplicationId);
		FactoriesProductDetailsAddLocalServiceUtil.updateFactoriesProductDetailsAdd(productDetail);
		jsonOBJ.put("factoriesProductDetailsAddId", productDetail.getFactoriesProductDetailsAddId());
		jsonOBJ.put("counter", counter);
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Has Occured", e);
		 }
		
		return false;
	}
}