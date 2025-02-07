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
import com.nbp.hsra.application.service.model.SourcesDetailAdd;
import com.nbp.hsra.application.service.service.SourcesDetailAddLocalServiceUtil;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/sources/details/data/add/form" }, service = MVCResourceCommand.class)
public class HSRASourcesDetailAddResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(HSRASourcesDetailAddResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("******calling hsra Source Detail Resource Command*******");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String sourceIdentification = ParamUtil.getString(resourceRequest, "sourceIdentification");
		String stateActivity = ParamUtil.getString(resourceRequest, "stateActivity");
		String counterOfSource = ParamUtil.getString(resourceRequest, "counterOfSource");
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		long sourcesDetailId = ParamUtil.getLong(resourceRequest, "sourcesDetailId");
		
        SourcesDetailAdd sourceInfo = null;
		try {
			sourceInfo = SourcesDetailAddLocalServiceUtil.getSourcesDetailAdd(sourcesDetailId);
		} catch (PortalException e1) {
		}
		if (sourceInfo == null) {
			sourceInfo = SourcesDetailAddLocalServiceUtil.createSourcesDetailAdd(CounterLocalServiceUtil.increment());
			sourceInfo.setCounter(counterOfSource);
		}
		sourceInfo.setSourceIdentification(sourceIdentification);
		sourceInfo.setStateActivity(stateActivity);
		sourceInfo.setHsraApplicationId(hsraApplicationId);
		SourcesDetailAddLocalServiceUtil.updateSourcesDetailAdd(sourceInfo);
		jsonOBJ.put("sourcesDetailId", sourceInfo.getSourcesDetailAddId());
		jsonOBJ.put("counter", sourceInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}

}
