package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jtb.application.form.service.model.AttractionBikeRentalInfo;
import com.nbp.jtb.application.form.service.service.AttractionBikeRentalInfoLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/motor/bike/rental/info" }, service = MVCResourceCommand.class)
public class JtbMotorBikeRentalLicenceResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(JtbMotorBikeRentalLicenceResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Attraction BIKE RENTAL LICENCE Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		String applicantName = ParamUtil.getString(resourceRequest, "applicantName");
	    String address = ParamUtil.getString(resourceRequest, "address");
	    String companyName = ParamUtil.getString(resourceRequest, "companyName");
	    String exactLocation = ParamUtil.getString(resourceRequest, "exactLocation");
	    String telephone = ParamUtil.getString(resourceRequest, "telephone");
	    String email = ParamUtil.getString(resourceRequest, "email");
	    String registrationDate = ParamUtil.getString(resourceRequest, "registrationDate");
	    String managerName = ParamUtil.getString(resourceRequest, "managerName");
	    String numberOfBikes = ParamUtil.getString(resourceRequest, "numberOfBikes");
	    String numberOfHelmets = ParamUtil.getString(resourceRequest, "numberOfHelmets");
	    String numberOfEmployees = ParamUtil.getString(resourceRequest, "numberOfEmployees");
	    String signatureDate = ParamUtil.getString(resourceRequest, "signatureDate");

	    AttractionBikeRentalInfo bikeRental =null;
		try {
			bikeRental=AttractionBikeRentalInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(Validator.isNull(bikeRental)) {
			bikeRental = AttractionBikeRentalInfoLocalServiceUtil.createAttractionBikeRentalInfo(CounterLocalServiceUtil.increment());
		}
		bikeRental.setApplicantName(applicantName);
		bikeRental.setAddress(address);
		bikeRental.setCompanyName(companyName);
		bikeRental.setExactLocation(exactLocation);
		bikeRental.setTelephone(telephone);
		bikeRental.setEmail(email);
		try {
			bikeRental.setRegistrationDate(new SimpleDateFormat("yyyy-MM-dd").parse(registrationDate));
		} catch (Exception e) {
			// TODO: handle exception
		}
		bikeRental.setManagerName(managerName);
		bikeRental.setNumberOfBikes(numberOfBikes);
		bikeRental.setNumberOfHelmets(numberOfHelmets);
		bikeRental.setNumberOfEmployees(numberOfEmployees);
		try {
			bikeRental.setSignatureDate(new SimpleDateFormat("yyyy-MM-dd").parse(signatureDate));
		} catch (Exception e) {
			// TODO: handle exception
		}
	    bikeRental.setJtbApplicationId(jtbApplicationId);
	    AttractionBikeRentalInfoLocalServiceUtil.updateAttractionBikeRentalInfo(bikeRental);
		
		return false;
	}

}
