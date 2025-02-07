package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jtb.application.form.service.model.AttractionCarRentalLicence;
import com.nbp.jtb.application.form.service.service.AttractionCarRentalLicenceLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/car/rental/licence/info" }, service = MVCResourceCommand.class)
public class JtbCarRentalLicenceResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(JtbCarRentalLicenceResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Attraction Car Rental LICENCE Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		String carRentalLicenceApplicantName = ParamUtil.getString(resourceRequest, "carRentalLicenceApplicantName");
        String carRentalLicenceAddress = ParamUtil.getString(resourceRequest, "carRentalLicenceAddress");
        String carRentalLicenceCompanyName = ParamUtil.getString(resourceRequest, "carRentalLicenceCompanyName");
        String carRentalLicenceCompanyAddress = ParamUtil.getString(resourceRequest, "carRentalLicenceCompanyAddress");
        String carRentalLicenceTelephone = ParamUtil.getString(resourceRequest, "carRentalLicenceTelephone");
        String carRentalLicenceEmail = ParamUtil.getString(resourceRequest, "carRentalLicenceEmail");
        String carRentalLicenceDate = ParamUtil.getString(resourceRequest, "carRentalLicenceDate");
        String carRentalLicenceManagerName = ParamUtil.getString(resourceRequest, "carRentalLicenceManagerName");
        String carRentalLicenceVehiclesNo = ParamUtil.getString(resourceRequest, "carRentalLicenceVehiclesNo");
        String carRentalLicenceEmployeesNo = ParamUtil.getString(resourceRequest, "carRentalLicenceEmployeesNo");
        String carRentalLicenceOfficeLocation = ParamUtil.getString(resourceRequest, "carRentalLicenceOfficeLocation");
        String carRentalLicencePosition = ParamUtil.getString(resourceRequest, "carRentalLicencePosition");
        String carRentalLicenceSignDate = ParamUtil.getString(resourceRequest, "carRentalLicenceSignDate");


		AttractionCarRentalLicence carRentalLicence =null;
		try {
			carRentalLicence=AttractionCarRentalLicenceLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(Validator.isNull(carRentalLicence)) {
			carRentalLicence = AttractionCarRentalLicenceLocalServiceUtil.createAttractionCarRentalLicence(CounterLocalServiceUtil.increment());
		}
		carRentalLicence.setNcrApplicantName(carRentalLicenceApplicantName);
	    carRentalLicence.setNcrAddress(carRentalLicenceAddress);
	    carRentalLicence.setNcrCompanyName(carRentalLicenceCompanyName);
	    carRentalLicence.setNcrCompanyAddr(carRentalLicenceCompanyAddress);
	    carRentalLicence.setNcrTelephone(carRentalLicenceTelephone);
	    carRentalLicence.setNcrEmail(carRentalLicenceEmail);
	    try {
	    	 carRentalLicence.setNcrDate(new SimpleDateFormat("yyyy-MM-dd").parse(carRentalLicenceDate));
		} catch (Exception e) {
			// TODO: handle exception
		}
	    carRentalLicence.setNcrManagerName(carRentalLicenceManagerName);
	    carRentalLicence.setNcrVehiclesNo(carRentalLicenceVehiclesNo);
	    carRentalLicence.setNcrEmployeesNo(carRentalLicenceEmployeesNo);
	    carRentalLicence.setNcrOfficeLoc(carRentalLicenceOfficeLocation);
	    carRentalLicence.setNcrPosition(carRentalLicencePosition);
	    try {
	    	 carRentalLicence.setNcrSignDate(new SimpleDateFormat("yyyy-MM-dd").parse(carRentalLicenceSignDate));
		} catch (Exception e) {
			// TODO: handle exception
		}
		carRentalLicence.setJtbApplicationId(jtbApplicationId);
		AttractionCarRentalLicenceLocalServiceUtil.updateAttractionCarRentalLicence(carRentalLicence);
		
		return false;
	}

}
