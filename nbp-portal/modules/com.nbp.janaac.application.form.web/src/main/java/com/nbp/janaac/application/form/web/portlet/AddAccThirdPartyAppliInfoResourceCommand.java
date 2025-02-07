package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccThirdPartyAppliInfo;
import com.nbp.janaac.application.form.service.service.AccThirdPartyAppliInfoLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/acc/third/party/appli/info" }, service = MVCResourceCommand.class)
public class AddAccThirdPartyAppliInfoResourceCommand implements MVCResourceCommand{

	private static Log _log = LogFactoryUtil.getLog(AddAccThirdPartyAppliInfoResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("Third Party application Info Started------------");
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
		String accFdaScheme=ParamUtil.getString(resourceRequest, "accFdaScheme");
		String specifyOther=ParamUtil.getString(resourceRequest, "specifyOther");
		String supplementaryCertificate=ParamUtil.getString(resourceRequest, "supplementaryCertificate");		
		String supplementaryOther=ParamUtil.getString(resourceRequest, "supplementaryOther");
		String listOfStandard=ParamUtil.getString(resourceRequest, "listOfStandard");
		String authorizedPersonnelName=ParamUtil.getString(resourceRequest, "authorizedPersonnelName");
		String authorizedPersonnelPos=ParamUtil.getString(resourceRequest, "authorizedPersonnelPos");
		String authorizedPersonnelDate=ParamUtil.getString(resourceRequest, "authorizedPersonnelDate");
		AccThirdPartyAppliInfo application=null;
		try {
			application = AccThirdPartyAppliInfoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccThirdPartyAppliInfoLocalServiceUtil.createAccThirdPartyAppliInfo(CounterLocalServiceUtil.increment());
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
		application.setAccFdaScheme(accFdaScheme);
		application.setSpecifyOther(specifyOther);
		application.setSupplementaryCertificate(supplementaryCertificate);
		application.setSupplementaryOther(supplementaryOther);
		application.setListOfStandard(listOfStandard);
		application.setAuthorizedPersonnelName(authorizedPersonnelName);
		application.setAuthorizedPersonnelPos(authorizedPersonnelPos);
		if (Validator.isNotNull(authorizedPersonnelDate)) {
			try {
				application.setAuthorizedPersonnelDate(new SimpleDateFormat("yyyy-MM-dd").parse(authorizedPersonnelDate));
			} catch (Exception e) {
			}
		}
		application.setJanaacApplicationId(janaacApplicationId);
		AccThirdPartyAppliInfoLocalServiceUtil.updateAccThirdPartyAppliInfo(application);
		return false;
	}

}
