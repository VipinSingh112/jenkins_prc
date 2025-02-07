package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccMediLabPhysicalResource;
import com.nbp.janaac.application.form.service.service.AccMediLabPhysicalResourceLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/acc/medical/physical/resource/info" }, service = MVCResourceCommand.class)
public class AddAccMediLabPhysicalResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddAccMediLabPhysicalResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accreditation medical laboratory physical resource info------ Started]");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String laboratoryFacility=ParamUtil.getString(resourceRequest, "laboratoryFacility");
		String safetyFeatures=ParamUtil.getString(resourceRequest, "safetyFeatures");
		String specialEnvironmental=ParamUtil.getString(resourceRequest, "specialEnvironmental");
		String laboratoryMonitoringActivity=ParamUtil.getString(resourceRequest, "laboratoryMonitoringActivity");
		String securityArrangements=ParamUtil.getString(resourceRequest, "securityArrangements");
		String laboratoryDocumented=ParamUtil.getString(resourceRequest, "laboratoryDocumented");
		AccMediLabPhysicalResource application=null;
		try {
			application = AccMediLabPhysicalResourceLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccMediLabPhysicalResourceLocalServiceUtil.createAccMediLabPhysicalResource(CounterLocalServiceUtil.increment(AddAccMediLabPhysicalResourceCommand.class.getName()));
		}
		application.setLaboratoryfacilities(laboratoryFacility);
		application.setSafetyFeatures(safetyFeatures);
		application.setSpecialEnvironment(specialEnvironmental);
		application.setMonitoringActivities(laboratoryMonitoringActivity);
		application.setSecurityArrangements(securityArrangements);
		application.setLaboratoryDocumented(laboratoryDocumented);
		application.setJanaacApplicationId(janaacApplicationId);
		AccMediLabPhysicalResourceLocalServiceUtil.updateAccMediLabPhysicalResource(application);
		return false;
	}

}
