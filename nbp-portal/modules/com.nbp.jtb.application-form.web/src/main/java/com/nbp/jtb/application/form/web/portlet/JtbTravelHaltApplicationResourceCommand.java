package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jtb.application.form.service.model.AttractionTravelHaltApp;
import com.nbp.jtb.application.form.service.service.AttractionTravelHaltAppLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/travel/halt/info" }, service = MVCResourceCommand.class)
public class JtbTravelHaltApplicationResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(JtbTravelHaltApplicationResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Attraction TRAVEL HALT APPLICATION Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		String travelHaltApplicantName = ParamUtil.getString(resourceRequest, "travelHaltApplicantName");
        String travelHaltAddress = ParamUtil.getString(resourceRequest, "travelHaltAddress");
        String travelHaltTelephone = ParamUtil.getString(resourceRequest, "travelHaltTelephone");
        String travelHaltEmail = ParamUtil.getString(resourceRequest, "travelHaltEmail");
        String travelHaltName = ParamUtil.getString(resourceRequest, "travelHaltName");
        String travelHaltLocation = ParamUtil.getString(resourceRequest, "travelHaltLocation");
        String travelHaltTelephoneNum = ParamUtil.getString(resourceRequest, "travelHaltTelephoneNum");
        String travelHaltEmployeesNo = ParamUtil.getString(resourceRequest, "travelHaltEmployeesNo");
        String travelHaltSignDate = ParamUtil.getString(resourceRequest, "travelHaltSignDate");

	    AttractionTravelHaltApp travelHalt =null;
		try {
			travelHalt=AttractionTravelHaltAppLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(Validator.isNull(travelHalt)) {
			travelHalt = AttractionTravelHaltAppLocalServiceUtil.createAttractionTravelHaltApp(CounterLocalServiceUtil.increment());
		}
		travelHalt.setTravelHaltApplicantName(travelHaltApplicantName);
        travelHalt.setTravelHaltAddress(travelHaltAddress);
        travelHalt.setTravelHaltTelephone(travelHaltTelephone);
        travelHalt.setTravelHaltEmail(travelHaltEmail);
        travelHalt.setTravelHaltName(travelHaltName);
        travelHalt.setTravelHaltLocation(travelHaltLocation);
        travelHalt.setTravelHaltTelephoneNum(travelHaltTelephoneNum);
        travelHalt.setTravelHaltEmployeesNo(travelHaltEmployeesNo);
        try {
        	travelHalt.setTravelHaltSignDate(new SimpleDateFormat("yyyy-MM-dd").parse(travelHaltSignDate));
		} catch (Exception e) {
			// TODO: handle exception
		}
	    travelHalt.setJtbApplicationId(jtbApplicationId);
		AttractionTravelHaltAppLocalServiceUtil.updateAttractionTravelHaltApp(travelHalt);
		
		return false;
	}

}
