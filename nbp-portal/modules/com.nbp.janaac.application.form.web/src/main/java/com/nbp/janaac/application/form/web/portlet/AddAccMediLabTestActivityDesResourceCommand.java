package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccMediLabTestDescription;
import com.nbp.janaac.application.form.service.service.AccMediLabTestDescriptionLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/acc/medical/test/description" }, service = MVCResourceCommand.class)
public class AddAccMediLabTestActivityDesResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddAccMediLabTestActivityDesResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("Description Of Activities Started ");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String testingClinicalActivity=ParamUtil.getString(resourceRequest, "testingClinicalActivity");
		String testingLaboratoryWorkShifts=ParamUtil.getString(resourceRequest, "testingLaboratoryWorkShifts");
//		String testingSpecimenNumber=ParamUtil.getString(resourceRequest, "testingSpecimenNumber");
//		String testingSpecimenLocation=ParamUtil.getString(resourceRequest, "testingSpecimenLocation");
		AccMediLabTestDescription application=null;
		try {
			application = AccMediLabTestDescriptionLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccMediLabTestDescriptionLocalServiceUtil.createAccMediLabTestDescription(CounterLocalServiceUtil.increment(AddAccMediLabTestActivityDesResourceCommand.class.getName()));
		}
		application.setTestClinicalActivity(testingClinicalActivity);
		application.setTestLabShiftWork(testingLaboratoryWorkShifts);
//		application.setTestLabSpecimenNo(testingSpecimenNumber);
//		application.setTestSpecimenLocation(testingSpecimenLocation);
		application.setJanaacApplicationId(janaacApplicationId);
		AccMediLabTestDescriptionLocalServiceUtil.updateAccMediLabTestDescription(application);
		return false;
	}

}
