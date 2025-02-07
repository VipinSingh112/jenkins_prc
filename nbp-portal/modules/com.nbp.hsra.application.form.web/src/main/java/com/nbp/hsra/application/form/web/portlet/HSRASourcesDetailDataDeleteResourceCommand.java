package com.nbp.hsra.application.form.web.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/sources/detail/data/delete" }, service = MVCResourceCommand.class)
public class HSRASourcesDetailDataDeleteResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(HSRASourcesDetailDataDeleteResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		return false;
	}

}
