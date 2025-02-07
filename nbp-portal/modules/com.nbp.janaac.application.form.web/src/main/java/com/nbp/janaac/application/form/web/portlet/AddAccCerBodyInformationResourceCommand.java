package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccCerBodyInfo;
import com.nbp.janaac.application.form.service.service.AccCerBodyInfoLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/acc/cer/bodies/information" }, service = MVCResourceCommand.class)
public class AddAccCerBodyInformationResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(AddAccCerBodyInformationResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accreditation certification bodies information------ Started]");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String describeMechanism=ParamUtil.getString(resourceRequest, "describeMechanism");
		AccCerBodyInfo application=null;
		try {
			application = AccCerBodyInfoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccCerBodyInfoLocalServiceUtil.createAccCerBodyInfo(CounterLocalServiceUtil.increment(AddAccCerBodyInformationResourceCommand.class.getName()));
		}
		application.setDescribeMechanism(describeMechanism);
		application.setJanaacApplicationId(janaacApplicationId);
		AccCerBodyInfoLocalServiceUtil.updateAccCerBodyInfo(application);
		return false;
	}

}
