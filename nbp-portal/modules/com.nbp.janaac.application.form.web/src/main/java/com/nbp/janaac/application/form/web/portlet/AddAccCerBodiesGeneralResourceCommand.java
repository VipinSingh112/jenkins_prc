package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccCerBodyGeneral;
import com.nbp.janaac.application.form.service.service.AccCerBodyGeneralLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/acc/cer/bodies/general" }, service = MVCResourceCommand.class)

public class AddAccCerBodiesGeneralResourceCommand implements MVCResourceCommand{

	private static Log _log = LogFactoryUtil.getLog(AddAccCerBodiesGeneralResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accreditation certification bodies general info------ Started]");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String cerLegalEntity=ParamUtil.getString(resourceRequest, "cerLegalEntity");
		String cerLegalStatusEntity=ParamUtil.getString(resourceRequest, "cerLegalStatusEntity");
		String cerMajorIncomeSources=ParamUtil.getString(resourceRequest, "cerMajorIncomeSources");
		AccCerBodyGeneral application=null;
		try {
			application = AccCerBodyGeneralLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
					} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccCerBodyGeneralLocalServiceUtil.createAccCerBodyGeneral(CounterLocalServiceUtil.increment(AddAccCerBodiesGeneralResourceCommand.class.getName()));
		}
		application.setCerLegalEntity(cerLegalEntity);
		application.setCerLegalStatusEntity(cerLegalStatusEntity);
		application.setCerMajorIncomeSources(cerMajorIncomeSources);
		application.setJanaacApplicationId(janaacApplicationId);
		AccCerBodyGeneralLocalServiceUtil.updateAccCerBodyGeneral(application);
		return false;
	}

}
