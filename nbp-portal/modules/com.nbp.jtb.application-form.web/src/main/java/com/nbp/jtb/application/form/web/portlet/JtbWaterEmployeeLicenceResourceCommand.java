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
		"mvc.command.name=/water/employee/licence/info" }, service = MVCResourceCommand.class)
public class JtbWaterEmployeeLicenceResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(JtbWaterEmployeeLicenceResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Attraction WATER SPORTS EMPLOYEE LICENCE Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		String applicantName = ParamUtil.getString(resourceRequest, "applicantName");
        String applicantAddress =ParamUtil.getString(resourceRequest, "applicantAddress");
        String applicantAge =ParamUtil.getString(resourceRequest, "applicantAge");
        String applicantNationality =ParamUtil.getString(resourceRequest, "applicantNationality");
        String workPermitApplied =ParamUtil.getString(resourceRequest, "workPermitApplied");
        String workPermitDate =ParamUtil.getString(resourceRequest, "workPermitDate");
        String qualification =ParamUtil.getString(resourceRequest, "qualification");
        String placeOfEmployment =ParamUtil.getString(resourceRequest, "placeOfEmployment");
        String ownerName =ParamUtil.getString(resourceRequest, "ownerName");

	    AttractionWaterEmployee waterEmpLic =null;
		try {
			waterEmpLic=AttractionWaterEmployeeLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(Validator.isNull(waterEmpLic)) {
			waterEmpLic = AttractionWaterEmployeeLocalServiceUtil.createAttractionWaterEmployee(CounterLocalServiceUtil.increment());
		}
		waterEmpLic.setApplicantName(applicantName);
        waterEmpLic.setApplicantAddress(applicantAddress);
        waterEmpLic.setApplicantAge(applicantAge);
        waterEmpLic.setApplicantNationality(applicantNationality);
        waterEmpLic.setWorkPermitApplied(workPermitApplied);
        try {
			if (Validator.isNotNull(workPermitDate)) {
				waterEmpLic.setWorkPermitDate(new SimpleDateFormat("yyyy-MM-dd").parse(workPermitDate));
			}
		} catch (Exception e) {
		}
        waterEmpLic.setQualification(qualification);
        waterEmpLic.setPlaceOfEmployment(placeOfEmployment);
        waterEmpLic.setOwnerName(ownerName);
	    waterEmpLic.setJtbApplicationId(jtbApplicationId);
	    AttractionWaterEmployeeLocalServiceUtil.updateAttractionWaterEmployee(waterEmpLic);
		
		return false;
	}

}
