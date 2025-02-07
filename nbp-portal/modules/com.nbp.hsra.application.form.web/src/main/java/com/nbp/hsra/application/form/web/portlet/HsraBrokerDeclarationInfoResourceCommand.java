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
import com.nbp.hsra.application.service.model.BrokerDeclarationInfo;
import com.nbp.hsra.application.service.service.BrokerDeclarationInfoLocalServiceUtil;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/hsra/brokers/declaration" }, service = MVCResourceCommand.class)

public class HsraBrokerDeclarationInfoResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(HsraBrokerDeclarationInfoResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------------inside broker declaration------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		String brokerOperatorName = ParamUtil.getString(resourceRequest, "brokerOperatorName");
		String brokerTitle = ParamUtil.getString(resourceRequest, "brokerTitle");
		String signDate = ParamUtil.getString(resourceRequest, "signDate");

		BrokerDeclarationInfo brokerDeclare = null;
		try {
			brokerDeclare = BrokerDeclarationInfoLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {
		}
		if (brokerDeclare == null) {
			brokerDeclare = BrokerDeclarationInfoLocalServiceUtil
					.createBrokerDeclarationInfo(CounterLocalServiceUtil.increment());
		}
		brokerDeclare.setBrokerOperatorName(brokerOperatorName);
		brokerDeclare.setBrokerTitle(brokerTitle);
		try {
			if (Validator.isNotNull(signDate)) {
				brokerDeclare.setSignDate(new SimpleDateFormat("yyyy-MM-dd").parse(signDate));
			}
		} catch (Exception e) {
		}
		brokerDeclare.setHsraApplicationId(hsraApplicationId);
		BrokerDeclarationInfoLocalServiceUtil.updateBrokerDeclarationInfo(brokerDeclare);
		jsonOBJ.put("hsraApplicationId", brokerDeclare.getHsraApplicationId());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}

}
