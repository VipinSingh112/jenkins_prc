package com.nbp.hsra.application.form.web.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.service.SealedSourcesAddLocalServiceUtil;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
"mvc.command.name=/sealed/sources/detail/data/delete" }, service = MVCResourceCommand.class)
public class HSRASealedSourcesDetailDataDeleteFormResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(HSRASealedSourcesDetailDataDeleteFormResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("******calling hsra sealed sources delete Resource Command*******");
		long counterOfSealed = ParamUtil.getLong(resourceRequest, "counterOfSealed");
		_log.info("primary key value in hsra sealed source delete command*******"+counterOfSealed);
		try {
			SealedSourcesAddLocalServiceUtil.deleteSealedSourcesAdd(counterOfSealed);
			_log.info("***********after delete update hsra unsealed source resource command*******");
		} catch (Exception e) {
		}

		return false;
	}

}
