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

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/motor/bike/condition/info" }, service = MVCResourceCommand.class)
public class JtbMotorBikeRentalConditionProposedResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(JtbMotorBikeRentalConditionProposedResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Attraction BIKE RENTAL CONDITION PROPOSED Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
	    String motorBikeIndustry = ParamUtil.getString(resourceRequest, "motorBikeIndustry");

	    AttractionBikeRentalInfo bikeRental =null;
		try {
			bikeRental=AttractionBikeRentalInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(Validator.isNull(bikeRental)) {
			bikeRental = AttractionBikeRentalInfoLocalServiceUtil.createAttractionBikeRentalInfo(CounterLocalServiceUtil.increment());
		}
		bikeRental.setMotorBikeIndustry(motorBikeIndustry);
	    bikeRental.setJtbApplicationId(jtbApplicationId);
	    AttractionBikeRentalInfoLocalServiceUtil.updateAttractionBikeRentalInfo(bikeRental);
		
		return false;
	}

}
