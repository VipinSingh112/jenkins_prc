package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccMediLabApplicationInfo;
import com.nbp.janaac.application.form.service.service.AccMediLabApplicationInfoLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/acc/medical/application/info" }, service = MVCResourceCommand.class)

public class AddAccMediLabApplicationInfoResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddAccMediLabApplicationInfoResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accreditation application medical Labs info------ Started");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String applicantName = ParamUtil.getString(resourceRequest, "applicantName");
		String applicantAddress = ParamUtil.getString(resourceRequest, "applicantAddress");
		String applicantTelephone = ParamUtil.getString(resourceRequest, "applicantTelephone");
		String applicantFaxNo = ParamUtil.getString(resourceRequest, "applicantFaxNo");
		String applicantWebsite = ParamUtil.getString(resourceRequest, "applicantWebsite");
		String laboratoryName = ParamUtil.getString(resourceRequest, "laboratoryName");
		String laboratoryAddress = ParamUtil.getString(resourceRequest, "laboratoryAddress");
		String personnelName = ParamUtil.getString(resourceRequest, "personnelName");
		String personnelEmail = ParamUtil.getString(resourceRequest, "personnelEmail");
		String personnelQMName = ParamUtil.getString(resourceRequest, "personnelQMName");
		String personnelQMEmail = ParamUtil.getString(resourceRequest, "personnelQMEmail");
		String deputyName = ParamUtil.getString(resourceRequest, "deputyName");
		String deputyEmail = ParamUtil.getString(resourceRequest, "deputyEmail");
		String personnelFMName = ParamUtil.getString(resourceRequest, "personnelFMName");
		String personnelFMEmail = ParamUtil.getString(resourceRequest, "personnelFMEmail");
		String accreditationRequest = ParamUtil.getString(resourceRequest, "accreditationRequest");
		String authorizedPersonnelName = ParamUtil.getString(resourceRequest, "authorizedPersonnelName");
		String authorizedPersonnelPosition = ParamUtil.getString(resourceRequest, "authorizedPersonnelPosition");
		String authorizedPersonnelDate = ParamUtil.getString(resourceRequest, "authorizedPersonnelDate");
		AccMediLabApplicationInfo application = null;
		try {
			application = AccMediLabApplicationInfoLocalServiceUtil.getApplicantInfo(janaacApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccMediLabApplicationInfoLocalServiceUtil.createAccMediLabApplicationInfo(
					CounterLocalServiceUtil.increment(AddAccMediLabApplicationInfoResourceCommand.class.getName()));
		}
		application.setNameOfApplicant(applicantName);
		application.setApplicantAddress(applicantAddress);
		application.setAppliTelephoneNo(applicantTelephone);
		application.setAppliFaxNo(applicantFaxNo);
		application.setAppliWebsite(applicantWebsite);
		application.setLaboratoryName(laboratoryName);
		application.setLaboratoryAddress(laboratoryAddress);
		application.setNameOfIncharge(personnelName);
		application.setEmailOfIncharge(personnelEmail);
		application.setPersonnelQMName(personnelQMName);
		application.setPersonnelQMEmail(personnelQMEmail);
		application.setDeputyInchargeName(deputyName);
		application.setDeputyInchargeEmail(deputyEmail);
		application.setPersonnelFMName(personnelFMName);
		application.setPersonnelFMEmail(personnelFMEmail);
		application.setAccRequestType(accreditationRequest);
		application.setAuthorizedPersonnelName(authorizedPersonnelName);
		application.setAuthorizedPosition(authorizedPersonnelPosition);
		application.setJanaacApplicationId(janaacApplicationId);
		if (Validator.isNotNull(authorizedPersonnelDate)) {
			try {
				application
						.setAuthorizedPersonnelDate(new SimpleDateFormat("yyyy-MM-dd").parse(authorizedPersonnelDate));
			} catch (Exception e) {
			}
		}
		AccMediLabApplicationInfoLocalServiceUtil.updateAccMediLabApplicationInfo(application);
		_log.info("after end first --------");
		jsonOBJ.put("janaacApplicationId", application.getJanaacApplicationId());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}

}
