package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jtb.application.form.service.model.AttractionWaterEmployee;
import com.nbp.jtb.application.form.service.service.AttractionWaterEmployeeLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/water/employee/general/declareinfo" }, service = MVCResourceCommand.class)
public class JtbWaterEmployeeGeneralDeclarationResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(JtbWaterEmployeeGeneralDeclarationResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Attraction WATER SPORTS EMPLOYEE GENERAL DECLARATION Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
        String cpr =ParamUtil.getString(resourceRequest, "cpr");
        String firstAid =ParamUtil.getString(resourceRequest, "firstAid");
        String medicFirstAid =ParamUtil.getString(resourceRequest, "medicFirstAid");
        String lifeguard =ParamUtil.getString(resourceRequest, "lifeguard");
        String rescueDiver =ParamUtil.getString(resourceRequest, "rescueDiver");
        String otherRescue =ParamUtil.getString(resourceRequest, "otherRescue");
        String employeeSignatureDate =ParamUtil.getString(resourceRequest, "employeeSignatureDate");
        String timePeriod =ParamUtil.getString(resourceRequest, "timePeriod");

	    AttractionWaterEmployee waterEmpLic =null;
		try {
			waterEmpLic=AttractionWaterEmployeeLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(Validator.isNull(waterEmpLic)) {
			waterEmpLic = AttractionWaterEmployeeLocalServiceUtil.createAttractionWaterEmployee(CounterLocalServiceUtil.increment());
		}
        waterEmpLic.setCpr(cpr);
        waterEmpLic.setFirstAid(firstAid);
        waterEmpLic.setMedicFirstAid(medicFirstAid);
        waterEmpLic.setLifeguard(lifeguard);
        waterEmpLic.setRescueDiver(rescueDiver);
        waterEmpLic.setOtherRescue(otherRescue);
        try {
        	waterEmpLic.setEmployeeSignatureDate(new SimpleDateFormat("yyyy-MM-dd").parse(employeeSignatureDate));
		} catch (Exception e) {
			// TODO: handle exception
		}
	    waterEmpLic.setTimePeriod(timePeriod);
	    waterEmpLic.setJtbApplicationId(jtbApplicationId);
	    AttractionWaterEmployeeLocalServiceUtil.updateAttractionWaterEmployee(waterEmpLic);
		
		return false;
	}

}
