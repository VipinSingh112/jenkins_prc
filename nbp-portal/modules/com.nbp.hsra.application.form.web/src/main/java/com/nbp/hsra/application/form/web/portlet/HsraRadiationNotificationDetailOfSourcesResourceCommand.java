package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.model.DetailOfSources;
import com.nbp.hsra.application.service.service.DetailOfSourcesLocalServiceUtil;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/hsra/detail/source/info" }, service = MVCResourceCommand.class)

public class HsraRadiationNotificationDetailOfSourcesResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(HsraRadiationNotificationDetailOfSourcesResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("---------calling hsra detail source info---------");
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		String sourceIdentification = ParamUtil.getString(resourceRequest, "sourceIdentification");
		String sourceLocation = ParamUtil.getString(resourceRequest, "sourceLocation");
		String stateActivity = ParamUtil.getString(resourceRequest, "stateActivity");

		DetailOfSources detailSources = null;
		try {
			detailSources = DetailOfSourcesLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(detailSources)) {
			detailSources = DetailOfSourcesLocalServiceUtil.createDetailOfSources(CounterLocalServiceUtil.increment());
		}
		detailSources.setSourceIdentification(sourceIdentification);
		detailSources.setSourceLocation(sourceLocation);
		detailSources.setStateActivity(stateActivity);
		detailSources.setHsraApplicationId(hsraApplicationId);
		DetailOfSourcesLocalServiceUtil.updateDetailOfSources(detailSources);
		return false;
	}
}