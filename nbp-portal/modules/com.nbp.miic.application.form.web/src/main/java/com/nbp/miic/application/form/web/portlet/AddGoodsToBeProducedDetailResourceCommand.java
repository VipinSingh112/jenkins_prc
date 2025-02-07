package com.nbp.miic.application.form.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.miic.application.form.web.constants.MIICApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + MIICApplicationFormPortletKeys.MIICAPPLICATIONFORM,
			"mvc.command.name=/goodsProduce/detail/info"
			             
		},
		service = MVCResourceCommand.class
	)
public class AddGoodsToBeProducedDetailResourceCommand implements MVCResourceCommand{
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		String goodsProducedDetailVal = ParamUtil.getString(resourceRequest, "goodsProducedDetailVal");
		resourceRequest.setAttribute("goodsProducedDetailVal", goodsProducedDetailVal);
		System.out.println("Inside class");
		try {
			resourceRequest.getPortletContext().getRequestDispatcher("/forms/goods-to-be-produce-detail-info.jsp").include(resourceRequest, resourceResponse);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
}
}