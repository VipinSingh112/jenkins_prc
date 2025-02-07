package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccMediLabActivitiesDesc;
import com.nbp.janaac.application.form.service.service.AccMediLabActivitiesDescLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/acc/medical/activity/description" }, service = MVCResourceCommand.class)

public class AddAccMediLabActivityDescResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(AddAccMediLabActivityDescResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accreditation medical laboratory description of activities info------ Started]");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String clinicalActivity=ParamUtil.getString(resourceRequest, "clinicalActivity");
		String laboratoryWorkShifts=ParamUtil.getString(resourceRequest, "laboratoryWorkShifts");
		String specimenNumber=ParamUtil.getString(resourceRequest, "specimenNumber");
		String specimenLocation=ParamUtil.getString(resourceRequest, "specimenLocation");
		String requestedPOCT=ParamUtil.getString(resourceRequest, "requestedPOCT");
		String requestedPOCTLocation=ParamUtil.getString(resourceRequest, "requestedPOCTLocation");
		AccMediLabActivitiesDesc application=null;
		try {
			application = AccMediLabActivitiesDescLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccMediLabActivitiesDescLocalServiceUtil.createAccMediLabActivitiesDesc(CounterLocalServiceUtil.increment(AddAccMediLabActivityDescResourceCommand.class.getName()));
		}
		application.setActivitiesDescription(clinicalActivity);
		application.setShiftWork(laboratoryWorkShifts);
		application.setSpecimenNo(specimenNumber);
		application.setSpecimenLocation(specimenLocation);
		application.setRequestedPOCT(requestedPOCT);
		application.setRequestedPOCTLocation(requestedPOCTLocation);
		application.setJanaacApplicationId(janaacApplicationId);
		AccMediLabActivitiesDescLocalServiceUtil.updateAccMediLabActivitiesDesc(application);
			return false;
	}

}
