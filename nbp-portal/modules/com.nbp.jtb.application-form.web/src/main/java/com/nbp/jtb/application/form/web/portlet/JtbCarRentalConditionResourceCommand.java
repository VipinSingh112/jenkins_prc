package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jtb.application.form.service.model.AttractionCarRentCondition;
import com.nbp.jtb.application.form.service.service.AttractionCarRentConditionLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/car/rental/condition/info" }, service = MVCResourceCommand.class)

public class JtbCarRentalConditionResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(JtbCarRentalConditionResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Attraction Car Rental CONDITION Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
        String touristIndustry = ParamUtil.getString(resourceRequest, "touristIndustry");

		AttractionCarRentCondition carRentalLicence =null;
		try {
			carRentalLicence=AttractionCarRentConditionLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(Validator.isNull(carRentalLicence)) {
			carRentalLicence = AttractionCarRentConditionLocalServiceUtil.createAttractionCarRentCondition(CounterLocalServiceUtil.increment());
		}
		carRentalLicence.setNcrConditionProp(touristIndustry);
		carRentalLicence.setJtbApplicationId(jtbApplicationId);
		AttractionCarRentConditionLocalServiceUtil.updateAttractionCarRentCondition(carRentalLicence);
		
		return false;
	}

}
