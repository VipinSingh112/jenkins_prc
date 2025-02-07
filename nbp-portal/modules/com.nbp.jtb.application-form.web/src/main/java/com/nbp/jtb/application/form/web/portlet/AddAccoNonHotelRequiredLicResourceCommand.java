package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jtb.application.form.service.model.AccoNonHotelRequiredLic;
import com.nbp.jtb.application.form.service.service.AccoNonHotelRequiredLicLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/acco/non/hotel/required/lic" }, service = MVCResourceCommand.class)
public class AddAccoNonHotelRequiredLicResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddHotelLicenceDetailResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accomodation non-hotel required licence info------ Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		String licenceRequirement=ParamUtil.getString(resourceRequest, "licenceRequirement");
		String reqBedrooms=ParamUtil.getString(resourceRequest, "reqBedrooms");
		String reqBathrooms=ParamUtil.getString(resourceRequest, "reqBathrooms");
		AccoNonHotelRequiredLic requiredLicence=null;
		try {
			requiredLicence= AccoNonHotelRequiredLicLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(Validator.isNull(requiredLicence)) {
			requiredLicence = AccoNonHotelRequiredLicLocalServiceUtil.createAccoNonHotelRequiredLic(CounterLocalServiceUtil.increment());
		}
		requiredLicence.setRequiredLicence(licenceRequirement);
		requiredLicence.setRequiredBedroom(reqBedrooms);
		requiredLicence.setRequiredBathroom(reqBathrooms);
		requiredLicence.setJtbApplicationId(jtbApplicationId);
		AccoNonHotelRequiredLicLocalServiceUtil.updateAccoNonHotelRequiredLic(requiredLicence);
		return false;
	}

}
