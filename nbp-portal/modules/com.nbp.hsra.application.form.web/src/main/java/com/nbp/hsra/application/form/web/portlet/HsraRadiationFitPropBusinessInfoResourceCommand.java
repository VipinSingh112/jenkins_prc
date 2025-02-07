package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.model.FitPropBusinessInfo;
import com.nbp.hsra.application.service.service.FitPropBusinessInfoLocalServiceUtil;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/hsra/fit/prop/business" }, service = MVCResourceCommand.class)

public class HsraRadiationFitPropBusinessInfoResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(HsraRadiationFitPropBusinessInfoResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("---------------Calling Fit Prop business------------");
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		String companyType = ParamUtil.getString(resourceRequest, "companyType");
		String applicantBusinessName = ParamUtil.getString(resourceRequest, "applicantBusinessName");
		String applicantcomName = ParamUtil.getString(resourceRequest, "applicantcomName");
		String applicantComAddress = ParamUtil.getString(resourceRequest, "applicantComAddress");
		String applicantComAddressParish = ParamUtil.getString(resourceRequest, "applicantComAddressParish");
		String applicantComNo = ParamUtil.getString(resourceRequest, "applicantComNo");
		String applicantComEmail = ParamUtil.getString(resourceRequest, "applicantComEmail");
		String applicantComTelephone = ParamUtil.getString(resourceRequest, "applicantComTelephone");
		String applicantComTitle = ParamUtil.getString(resourceRequest, "applicantComTitle");
		String materialTechnology = ParamUtil.getString(resourceRequest, "materialTechnology");
		String relevantBox = ParamUtil.getString(resourceRequest, "relevantBox");
		String corporateDirector = ParamUtil.getString(resourceRequest, "corporateDirector");
		String facilitySources = ParamUtil.getString(resourceRequest, "facilitySources");
		String criminalFraud = ParamUtil.getString(resourceRequest, "criminalFraud");
		String professionalSubject = ParamUtil.getString(resourceRequest, "professionalSubject");
		String employmentResign = ParamUtil.getString(resourceRequest, "employmentResign");
		String mentallyIll = ParamUtil.getString(resourceRequest, "mentallyIll");
		String bankruptAuthority = ParamUtil.getString(resourceRequest, "bankruptAuthority");
		String circumstancesEvent = ParamUtil.getString(resourceRequest, "circumstancesEvent");
		String partnershipHsra = ParamUtil.getString(resourceRequest, "partnershipHsra");
		String facilityAssociated = ParamUtil.getString(resourceRequest, "facilityAssociated");

		FitPropBusinessInfo businessInfo = null;
		try {
			businessInfo = FitPropBusinessInfoLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(businessInfo)) {
			businessInfo = FitPropBusinessInfoLocalServiceUtil
					.createFitPropBusinessInfo(CounterLocalServiceUtil.increment());
		}
		businessInfo.setCompanyType(companyType);
		businessInfo.setApplicantBusinessName(applicantBusinessName);
		businessInfo.setApplicantcomName(applicantcomName);
		businessInfo.setApplicantComAddress(applicantComAddress);
		businessInfo.setApplicantComAddressParish(applicantComAddressParish);
		businessInfo.setApplicantComNo(applicantComNo);
		businessInfo.setApplicantComEmail(applicantComEmail);
		businessInfo.setApplicantComTelephone(applicantComTelephone);
		businessInfo.setApplicantComTitle(applicantComTitle);
		businessInfo.setMaterialTechnology(materialTechnology);
		businessInfo.setRelevantBox(relevantBox);
		businessInfo.setCorporateDirector(corporateDirector);
		businessInfo.setFacilitySources(facilitySources);
		businessInfo.setCriminalFraud(criminalFraud);
		businessInfo.setProfessionalSubject(professionalSubject);
		businessInfo.setEmploymentResign(employmentResign);
		businessInfo.setMentallyIll(mentallyIll);
		businessInfo.setBankruptAuthority(bankruptAuthority);
		businessInfo.setCircumstancesEvent(circumstancesEvent);
		businessInfo.setPartnershipHsra(partnershipHsra);
		businessInfo.setFacilityAssociated(facilityAssociated);
		businessInfo.setHsraApplicationId(hsraApplicationId);
		FitPropBusinessInfoLocalServiceUtil.updateFitPropBusinessInfo(businessInfo);
		return false;
	}

}
