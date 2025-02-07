package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.SezDevEmployeeSafetyInfoAdd;
import com.nbp.sez.status.application.form.service.service.SezDevEmployeeSafetyInfoAddLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/dev/employee/safety/info" }, service = MVCResourceCommand.class)
public class SezStatusDeveloperAddEmployeeSafetyInfoResourceCommnad implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(SezStatusDeveloperAddEmployeeSafetyInfoResourceCommnad.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String securityMeasures = ParamUtil.getString(resourceRequest, "securityMeasures");
		long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		String count = ParamUtil.getString(resourceRequest, "count");
		/* hidden field */
		long devSecurityMeasuresId = ParamUtil.getLong(resourceRequest, "devSecurityMeasuresId");
		SezDevEmployeeSafetyInfoAdd employeeSafety = null;
		if (Validator.isNotNull(devSecurityMeasuresId)) {
			try {
				employeeSafety = SezDevEmployeeSafetyInfoAddLocalServiceUtil
						.getSezDevEmployeeSafetyInfoAdd(devSecurityMeasuresId);
			} catch (PortalException e) {
			}
		} else {
			employeeSafety = SezDevEmployeeSafetyInfoAddLocalServiceUtil
					.createSezDevEmployeeSafetyInfoAdd(CounterLocalServiceUtil.increment());
			employeeSafety.setCounter(count);
		}
		employeeSafety.setSecurityMeasures(securityMeasures);
		employeeSafety.setSezStatusApplicationId(sezStatusApplicationId);
		SezDevEmployeeSafetyInfoAddLocalServiceUtil.updateSezDevEmployeeSafetyInfoAdd(employeeSafety);
		jsonOBJ.put("sezDevEmployeeSafetyInfoAddId", employeeSafety.getSezDevEmployeeSafetyInfoAddId());
		jsonOBJ.put("counter", count);
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Occured", e);
		}
		return false;
	}

}
