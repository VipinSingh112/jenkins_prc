package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.model.SealedSourcesAdd;
import com.nbp.hsra.application.service.service.SealedSourcesAddLocalServiceUtil;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/sealed/sources/detail/data/add/form" }, service = MVCResourceCommand.class)
public class HSRASealedSourcesDetailDataAddFormResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(HSRAUnsealedSourcesDetailDataAddFormResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("******calling hsra sealed sources Resource Command*******");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String sealedSourcesRadionuclide = ParamUtil.getString(resourceRequest, "sealedSourcesRadionuclide");
		String sealedSourcesMaxActivity = ParamUtil.getString(resourceRequest, "sealedSourcesMaxActivity");
		String sealedSourcesActivityDate = ParamUtil.getString(resourceRequest, "sealedSourcesActivityDate");
		String sealedSourcesCategories = ParamUtil.getString(resourceRequest, "sealedSourcesCategories");
		String sealedSourcesUse = ParamUtil.getString(resourceRequest, "sealedSourcesUse");
		String counterOfSealed = ParamUtil.getString(resourceRequest, "counterOfSealed");
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		long sealedSourcesDetailId = ParamUtil.getLong(resourceRequest, "sealedSourcesDetailId");

		SealedSourcesAdd sealedInfo = null;
		try {
			sealedInfo = SealedSourcesAddLocalServiceUtil.getSealedSourcesAdd(sealedSourcesDetailId);
		} catch (PortalException e1) {
		}
		if (sealedInfo == null) {
			sealedInfo = SealedSourcesAddLocalServiceUtil.createSealedSourcesAdd(CounterLocalServiceUtil.increment());
			sealedInfo.setCounter(counterOfSealed);
		}
		sealedInfo.setSealedSourcesRadionu(sealedSourcesRadionuclide);
		sealedInfo.setSealedSourcesMaxActivity(sealedSourcesMaxActivity);
		try {
			sealedInfo
					.setSealedSourcesActivityDate(new SimpleDateFormat("yyyy-MM-dd").parse(sealedSourcesActivityDate));
		} catch (ParseException e) {
		}
		sealedInfo.setSealedSourcesCategories(sealedSourcesCategories);
		sealedInfo.setSealedSourcesUse(sealedSourcesUse);
		sealedInfo.setHsraApplicationId(hsraApplicationId);
		SealedSourcesAddLocalServiceUtil.updateSealedSourcesAdd(sealedInfo);
		jsonOBJ.put("sealedSourcesId", sealedInfo.getSealedSourcesAddId());
		jsonOBJ.put("counter", sealedInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}

}
