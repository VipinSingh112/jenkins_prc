package com.nbp.miic.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.miic.application.form.services.model.MiicApplicantDetails;
import com.nbp.miic.application.form.services.service.MiicApplicantDetailsLocalServiceUtil;
import com.nbp.miic.application.form.web.constants.MIICApplicationFormPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + MIICApplicationFormPortletKeys.MIICAPPLICATIONFORM,
		"mvc.command.name=/miic/application/form/info" }, service = MVCResourceCommand.class)
public class MIICApplicantDetailResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(MIICApplicantDetailResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("inside Applicant Detail Resource command");
		String natureOfApplicant = ParamUtil.getString(resourceRequest, "natureOfApplicant");
		String applicantName = ParamUtil.getString(resourceRequest, "mainApplicantName");
		String nameOfProducer = ParamUtil.getString(resourceRequest, "mainProducerName");
		String companyName = ParamUtil.getString(resourceRequest, "maincompanyName");
		String firstName = ParamUtil.getString(resourceRequest, "mainFirstName");
		String lastName = ParamUtil.getString(resourceRequest, "mainLastName");
		String address = ParamUtil.getString(resourceRequest, "mainAddress");
		String email = ParamUtil.getString(resourceRequest, "mainEmail");
		String telephone = ParamUtil.getString(resourceRequest, "mainTelephone");
		String dateOfApplication = ParamUtil.getString(resourceRequest, "dateOfApplication");
		String trnNumber = ParamUtil.getString(resourceRequest, "mainTrnNumber");
		long miicApplicationId = ParamUtil.getLong(resourceRequest, "miicApplicationId");

		MiicApplicantDetails applicantDetail = null;
		try {
			applicantDetail=MiicApplicantDetailsLocalServiceUtil.getMiicById(miicApplicationId);
		}catch (Exception e) {
		}
		if(applicantDetail==null) {
			applicantDetail = MiicApplicantDetailsLocalServiceUtil
					.createMiicApplicantDetails(CounterLocalServiceUtil.increment());
		}
		applicantDetail.setNatureOfApplicant(natureOfApplicant);
		applicantDetail.setApplicantName(applicantName);
		applicantDetail.setNameOfProducer(nameOfProducer);
		applicantDetail.setCompanyName(companyName);
		applicantDetail.setFirstName(firstName);
		applicantDetail.setLastName(lastName);
		applicantDetail.setAddress(address);
		applicantDetail.setEmail(email);
		applicantDetail.setTelephone(telephone);
		if (Validator.isNotNull(dateOfApplication)) {
			try {
				applicantDetail.setDateOfApplication(new SimpleDateFormat("yyyy-MM-dd").parse(dateOfApplication));
			} catch (Exception e) {
			}
		}
		applicantDetail.setTrnNumber(trnNumber);
		applicantDetail.setMiicApplicationId(miicApplicationId);
		MiicApplicantDetailsLocalServiceUtil.updateMiicApplicantDetails(applicantDetail);
		return false;
	}
}