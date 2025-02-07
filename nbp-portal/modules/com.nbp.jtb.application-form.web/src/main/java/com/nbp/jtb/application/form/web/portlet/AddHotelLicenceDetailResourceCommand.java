package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jtb.application.form.service.model.AccoHotelLicence;
import com.nbp.jtb.application.form.service.service.AccoHotelLicenceLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/acco/hotel/licence" }, service = MVCResourceCommand.class)
public class AddHotelLicenceDetailResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(AddHotelLicenceDetailResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding ACCOMODAION hotel licence info Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		String newAccomadationOwnerName=ParamUtil.getString(resourceRequest, "newAccomadationOwnerName");
		String newAccomadationHotelName=ParamUtil.getString(resourceRequest, "newAccomadationHotelName");
		 String newAccomadationTelephone=ParamUtil.getString(resourceRequest, "newAccomadationTelephone");
		 String newAccomadationFaxNum=ParamUtil.getString(resourceRequest, "newAccomadationFaxNum");
		String newAccomadationEmail=ParamUtil.getString(resourceRequest, "newAccomadationEmail");
		String newAccomadationParish=ParamUtil.getString(resourceRequest, "newAccomadationParish");
		String newAccomadationAddress=ParamUtil.getString(resourceRequest, "newAccomadationAddress");

		AccoHotelLicence application =null;
		try {
			application=AccoHotelLicenceLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(Validator.isNull(application)) {
			application = AccoHotelLicenceLocalServiceUtil.createAccoHotelLicence(CounterLocalServiceUtil.increment());
		}
		application.setNameOfOwner(newAccomadationOwnerName);
		application.setNameOfHotel(newAccomadationHotelName);
		application.setTelephoneNo(newAccomadationTelephone);
		application.setFaxNo(newAccomadationFaxNum);
		application.setEmailAddress(newAccomadationEmail);
		application.setParish(newAccomadationParish);
		application.setAddress(newAccomadationAddress);
		application.setJtbApplicationId(jtbApplicationId);
		AccoHotelLicenceLocalServiceUtil.updateAccoHotelLicence(application);
		
		return false;
	}

}
