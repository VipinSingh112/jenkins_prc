package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jtb.application.form.service.model.AccoHomeStay;
import com.nbp.jtb.application.form.service.service.AccoHomeStayLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/acco/home/stay/licence" }, service = MVCResourceCommand.class)

public class AddAccoHomeStayLicenceResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(AddHotelLicenceDetailResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accomodation home stay licence info------ Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		String homeStayAccommodationName=ParamUtil.getString(resourceRequest, "homeStayAccommodationName");
		String homeStayAccomadationOwnerName=ParamUtil.getString(resourceRequest, "homeStayAccomadationOwnerName");
		String homeStayAccomadationPropertyAddress=ParamUtil.getString(resourceRequest, "homeStayAccomadationPropertyAddress");
		String homeStayAccomadationTel=ParamUtil.getString(resourceRequest, "homeStayAccomadationTel");
		String homeStayAccomadationMobileNum=ParamUtil.getString(resourceRequest, "homeStayAccomadationMobileNum");
		String homeStayAccomadationEmail=ParamUtil.getString(resourceRequest, "homeStayAccomadationEmail");
		String homeStayAccomadationEmployeesNum=ParamUtil.getString(resourceRequest, "homeStayAccomadationEmployeesNum");
		String homeStayAccomadationWebsiteName=ParamUtil.getString(resourceRequest, "homeStayAccomadationWebsiteName");
		String homeStayAccomadationDirection=ParamUtil.getString(resourceRequest, "homeStayAccomadationDirection");
		String homeStayAccomadationBedrooms=ParamUtil.getString(resourceRequest, "homeStayAccomadationBedrooms");
		String homeStayAccomadationAvailableBedrooms=ParamUtil.getString(resourceRequest, "homeStayAccomadationAvailableBedrooms");
		String homeStayAccomadationWithBathroom=ParamUtil.getString(resourceRequest, "homeStayAccomadationWithBathroom");
		String homeStayAccomadationSharedBedrooms=ParamUtil.getString(resourceRequest, "homeStayAccomadationSharedBedrooms");
		String homeStayAccomadationDate=ParamUtil.getString(resourceRequest, "homeStayAccomadationDate");
		String homeStayAccomadationCertified=ParamUtil.getString(resourceRequest, "homeStayAccomadationCertified");
		AccoHomeStay application=null;
		try {
			application = AccoHomeStayLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccoHomeStayLocalServiceUtil.createAccoHomeStay(CounterLocalServiceUtil.increment());
		}
		application.setHomeAccoName(homeStayAccommodationName);
		application.setHomeOwnerName(homeStayAccomadationOwnerName);
		application.setPropertyAddress(homeStayAccomadationPropertyAddress);
		application.setHomeTeleNo(homeStayAccomadationTel);
		application.setHomeMobile(homeStayAccomadationMobileNum);
		application.setHomeEmail(homeStayAccomadationEmail);
		application.setHomeEmployeeNo(homeStayAccomadationEmployeesNum);
		application.setWebsite(homeStayAccomadationWebsiteName);
		application.setPropDirection(homeStayAccomadationDirection);
		application.setNumOfBedrooms(homeStayAccomadationBedrooms);
		application.setNumOfGuestBedroom(homeStayAccomadationAvailableBedrooms);
		application.setWithBathroom(homeStayAccomadationWithBathroom);
		application.setSharedBathroom(homeStayAccomadationSharedBedrooms);
		if (Validator.isNotNull(homeStayAccomadationDate)) {
			try {
				application.setSignDate(new SimpleDateFormat("yyyy-MM-dd").parse(homeStayAccomadationDate));
			} catch (Exception e) {
			}
		}
		application.setCertifiedBy(homeStayAccomadationCertified);
		application.setJtbApplicationId(jtbApplicationId);
		AccoHomeStayLocalServiceUtil.updateAccoHomeStay(application);
		return false;
	}

}
