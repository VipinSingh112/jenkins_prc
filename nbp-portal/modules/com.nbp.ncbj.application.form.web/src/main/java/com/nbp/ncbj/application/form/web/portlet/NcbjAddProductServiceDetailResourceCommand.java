package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetail;
import com.nbp.ncbj.application.form.service.service.NcbjProductServiceDetailLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;


@Component(immediate = true, property = {
		"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
		"mvc.command.name=/product/services/info" 
		},service = MVCResourceCommand.class)

public class NcbjAddProductServiceDetailResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(NcbjAddProductServiceDetailResourceCommand.class.getName());
	
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("calling PRODUCT SERVICE Detail Resource Command");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long ncbjApplicationId = ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		long productServicesDetailId = ParamUtil.getLong(resourceRequest, "productServicesDetailId");
		String productType = ParamUtil.getString(resourceRequest, "productType");
		String productList = ParamUtil.getString(resourceRequest, "productList");
		String productLines = ParamUtil.getString(resourceRequest, "productLines");
		String counter = ParamUtil.getString(resourceRequest, "counter");
		
		NcbjProductServiceDetail productDetail = null;
			try {
				productDetail = NcbjProductServiceDetailLocalServiceUtil.getNcbjProductServiceDetail(productServicesDetailId);
			} catch (PortalException e) {}
		if(productDetail==null) {
			productDetail = NcbjProductServiceDetailLocalServiceUtil.createNcbjProductServiceDetail(
					CounterLocalServiceUtil.increment());
			productDetail.setCounter(counter);
		}
		productDetail.setProductType(productType);
		productDetail.setProductList(productList);
		productDetail.setProductLines(productLines);
		productDetail.setNcbjApplicationId(ncbjApplicationId);
		NcbjProductServiceDetailLocalServiceUtil.updateNcbjProductServiceDetail(productDetail);
		jsonOBJ.put("productServicesDetailId", productDetail.getNcbjProductServiceDetailId());
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
