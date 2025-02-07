package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccInsBodiesPhyResource;
import com.nbp.janaac.application.form.service.service.AccInsBodiesPhyResourceLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/acc/ins/bodies/physical/resource" }, service = MVCResourceCommand.class)
public class AddAccInsBodiesPhysicalResourceCommand implements MVCResourceCommand {

	private static Log _log = LogFactoryUtil.getLog(AddAccInsBodiesPhysicalResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accreditation inspection bodies physical resource info------ Started]");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String insBodiesfacilities=ParamUtil.getString(resourceRequest, "insBodiesfacilities");
		String insSafetyFeatures=ParamUtil.getString(resourceRequest, "insSafetyFeatures");
		String insSecurityArrangements=ParamUtil.getString(resourceRequest, "insSecurityArrangements");
		AccInsBodiesPhyResource application=null;
		try {
			application = AccInsBodiesPhyResourceLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccInsBodiesPhyResourceLocalServiceUtil.createAccInsBodiesPhyResource(CounterLocalServiceUtil.increment(AddAccInsBodiesPhysicalResourceCommand.class.getName()));
		}
		application.setInsBodiesfacilities(insBodiesfacilities);
		application.setInsSafetyFeatures(insSafetyFeatures);
		application.setInsSecurityArrangements(insSecurityArrangements);
		application.setJanaacApplicationId(janaacApplicationId);
		AccInsBodiesPhyResourceLocalServiceUtil.updateAccInsBodiesPhyResource(application);
		return false;
	}

}
