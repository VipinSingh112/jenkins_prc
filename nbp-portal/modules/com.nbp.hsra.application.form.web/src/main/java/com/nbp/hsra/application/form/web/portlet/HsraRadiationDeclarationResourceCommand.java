package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.model.RadiationDeclaration;
import com.nbp.hsra.application.service.service.RadiationDeclarationLocalServiceUtil;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/hsra/radiation/declaration" }, service = MVCResourceCommand.class)

public class HsraRadiationDeclarationResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(HsraRadiationDeclarationResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		
		_log.info("***********calling HSRA Radiation declaration******");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
	
		String legalOperatorName = ParamUtil.getString(resourceRequest, "legalOperatorName");
		String operatorTitle = ParamUtil.getString(resourceRequest, "operatorTitle");
		String operatorDate = ParamUtil.getString(resourceRequest, "operatorDate");

		RadiationDeclaration radiationDeclaration = null;
		try {
			radiationDeclaration = RadiationDeclarationLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(radiationDeclaration)) {
			radiationDeclaration = RadiationDeclarationLocalServiceUtil
					.createRadiationDeclaration(CounterLocalServiceUtil.increment());
		}
		radiationDeclaration.setLegalOperatorName(legalOperatorName);
		radiationDeclaration.setOperatorTitle(operatorTitle);
	
		try {
			if (Validator.isNotNull(operatorDate)) {
				radiationDeclaration.setOperatorDate(new SimpleDateFormat("yyyy-MM-dd").parse(operatorDate));
			}
		} catch (Exception e) {
		}
		
		radiationDeclaration.setHsraApplicationId(hsraApplicationId);
		RadiationDeclarationLocalServiceUtil.updateRadiationDeclaration(radiationDeclaration);
		jsonOBJ.put("hsraApplicationId", radiationDeclaration.getHsraApplicationId());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
	
		return false;
	}

}
