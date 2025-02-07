package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccCerBodyApplicantInfo;
import com.nbp.janaac.application.form.service.service.AccCerBodyApplicantInfoLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/acc/cer/bodies/appli/info" }, service = MVCResourceCommand.class)

public class AddAccCerBodiesAppliInfoResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(AddAccCerBodiesAppliInfoResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accreditation certification application info------ Started]");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String applicantName=ParamUtil.getString(resourceRequest, "applicantName");
		String applicantAddress=ParamUtil.getString(resourceRequest, "applicantAddress");
		String applicantTelephone=ParamUtil.getString(resourceRequest, "applicantTelephone");
		String applicantFaxNo=ParamUtil.getString(resourceRequest, "applicantFaxNo");
		String applicantWebsite=ParamUtil.getString(resourceRequest, "applicantWebsite");
		String certificationName=ParamUtil.getString(resourceRequest, "certificationName");
		String certiAddress=ParamUtil.getString(resourceRequest, "certiAddress");
		String personnelName=ParamUtil.getString(resourceRequest, "personnelName");
		String personnelEmail=ParamUtil.getString(resourceRequest, "personnelEmail");
		String personnelContactName=ParamUtil.getString(resourceRequest, "personnelContactName");
		String personnelContactEmail=ParamUtil.getString(resourceRequest, "personnelContactEmail");
		String personnelFMName=ParamUtil.getString(resourceRequest, "personnelFMName");
		String personnelFMEmail=ParamUtil.getString(resourceRequest, "personnelFMEmail");
		String accreditationRequest=ParamUtil.getString(resourceRequest, "accreditationRequest");
		String managementSystem=ParamUtil.getString(resourceRequest, "managementSystem");
		String specifyOther=ParamUtil.getString(resourceRequest, "specifyOther");		
		String listOfStandard=ParamUtil.getString(resourceRequest, "listOfStandard");
		String authorizedPersonnelName=ParamUtil.getString(resourceRequest, "authorizedPersonnelName");
		String authorizedPersonnelPos=ParamUtil.getString(resourceRequest, "authorizedPersonnelPos");
		String authorizedPersonnelDate=ParamUtil.getString(resourceRequest, "authorizedPersonnelDate");
		AccCerBodyApplicantInfo application=null;
		try {
			application = AccCerBodyApplicantInfoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccCerBodyApplicantInfoLocalServiceUtil.createAccCerBodyApplicantInfo(CounterLocalServiceUtil.increment(AddAccCerBodiesAppliInfoResourceCommand.class.getName()));
		}
		application.setApplicantName(applicantName);
		application.setApplicantAddress(applicantAddress);
		application.setApplicantTelephone(applicantTelephone);
		application.setApplicantFaxNo(applicantFaxNo);
		application.setApplicantWebsite(applicantWebsite);
		application.setCertificationName(certificationName);
		application.setCertiAddress(certiAddress);
		application.setPersonnelName(personnelName);
		application.setPersonnelEmail(personnelEmail);
		application.setPersonnelContactName(personnelContactName);
		application.setPersonnelContactEmail(personnelContactEmail);
		application.setPersonnelFMName(personnelFMName);
		application.setPersonnelFMEmail(personnelFMEmail);
		application.setAccreditationRequest(accreditationRequest);
		application.setManagementSystem(managementSystem);
		application.setSpecifyOther(specifyOther);
		application.setListOfStandard(listOfStandard);
		application.setAuthorizedPersonnelName(authorizedPersonnelName);
		application.setAuthorizedPersonnelPos(authorizedPersonnelPos);
		application.setJanaacApplicationId(janaacApplicationId);
		if (Validator.isNotNull(authorizedPersonnelDate)) {
			try {
				application.setAuthorizedPersonnelDate(new SimpleDateFormat("yyyy-MM-dd").parse(authorizedPersonnelDate));
			} catch (Exception e) {
			}
		}
		AccCerBodyApplicantInfoLocalServiceUtil.updateAccCerBodyApplicantInfo(application);
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
