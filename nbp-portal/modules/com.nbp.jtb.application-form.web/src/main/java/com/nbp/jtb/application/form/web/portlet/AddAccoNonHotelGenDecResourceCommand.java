package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec;
import com.nbp.jtb.application.form.service.service.AccoNonHotelGenDecLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/acco/non/hotel/gen/dec" }, service = MVCResourceCommand.class)
public class AddAccoNonHotelGenDecResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddHotelLicenceDetailResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accomodation non-hotel general declaration info------ Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		String accommodationNonHotelOperater=ParamUtil.getString(resourceRequest, "accommodationNonHotelOperater");
		String newHotelAccomadationFromDate=ParamUtil.getString(resourceRequest, "newHotelAccomadationFromDate");
		String newHotelAccomadationToDate=ParamUtil.getString(resourceRequest, "newHotelAccomadationToDate");
		String newAccomadationSince=ParamUtil.getString(resourceRequest, "newAccomadationSince");
		String newHotelAccomadationSignDate=ParamUtil.getString(resourceRequest, "newHotelAccomadationSignDate");
		AccoNonHotelGenDec application=null;
		try {
			application = AccoNonHotelGenDecLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccoNonHotelGenDecLocalServiceUtil.createAccoNonHotelGenDec(CounterLocalServiceUtil.increment());
		}
		
		application.setNhAccoOperatorName(accommodationNonHotelOperater);
		if (Validator.isNotNull(newHotelAccomadationFromDate)) {
			try {
				application.setDateFrom(new SimpleDateFormat("yyyy-MM-dd").parse(newHotelAccomadationFromDate));
			} catch (Exception e) {
			}
		}
		if (Validator.isNotNull(newHotelAccomadationToDate)) {
			try {
				application.setDateTo(new SimpleDateFormat("yyyy-MM-dd").parse(newHotelAccomadationToDate));
			} catch (Exception e) {
			}
		}
		if (Validator.isNotNull(newAccomadationSince)) {
			try {
				application.setNhAccoSince(new SimpleDateFormat("yyyy-MM-dd").parse(newAccomadationSince));
			} catch (Exception e) {
			}
		}
		if (Validator.isNotNull(newHotelAccomadationSignDate)) {
			try {
				application.setNhAccoDate(new SimpleDateFormat("yyyy-MM-dd").parse(newHotelAccomadationSignDate));
			} catch (Exception e) {
			}
		}
		application.setJtbApplicationId(jtbApplicationId);
		AccoNonHotelGenDecLocalServiceUtil.updateAccoNonHotelGenDec(application);
		return false;
	}

}
