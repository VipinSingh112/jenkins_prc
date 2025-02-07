package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.model.FitPropPersonalDetailInfo;
import com.nbp.hsra.application.service.service.FitPropPersonalDetailInfoLocalServiceUtil;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/hsra/fit/prop/personal/detail" }, service = MVCResourceCommand.class)

public class HsraRadiationFitPropPersonalDetailResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(HsraRadiationFitPropPersonalDetailResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("-----calling Fit Prop Personal Detail-------");
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		String applicantFirstName = ParamUtil.getString(resourceRequest, "applicantFirstName");
		String applicantMiddleName = ParamUtil.getString(resourceRequest, "applicantMiddleName");
		String applicantSurname = ParamUtil.getString(resourceRequest, "applicantSurname");
		String applicantFormerName = ParamUtil.getString(resourceRequest, "applicantFormerName");
		String applicantAlias = ParamUtil.getString(resourceRequest, "applicantAlias");
		String applicantStreetName = ParamUtil.getString(resourceRequest, "applicantStreetName");
		String applicantStreetNo = ParamUtil.getString(resourceRequest, "applicantStreetNo");
		String applicantPostalCode = ParamUtil.getString(resourceRequest, "applicantPostalCode");
		String applicantCountry = ParamUtil.getString(resourceRequest, "applicantCountry");
		String applicantTownName = ParamUtil.getString(resourceRequest, "applicantTownName");
		String applicantCity = ParamUtil.getString(resourceRequest, "applicantCity");
		String applicantParish = ParamUtil.getString(resourceRequest, "applicantParish");
		String applicantTelephoneNum = ParamUtil.getString(resourceRequest, "applicantTelephoneNum");
		String applicantEmailAdd = ParamUtil.getString(resourceRequest, "applicantEmailAdd");
		String applicantDateBirth = ParamUtil.getString(resourceRequest, "applicantDateBirth");
		String applicantPlaceOfBirthTown = ParamUtil.getString(resourceRequest, "applicantPlaceOfBirthTown");
		String applicantPlaceOfBirthParish = ParamUtil.getString(resourceRequest, "applicantPlaceOfBirthParish");
		String applicantPlaceOfBirthCountry = ParamUtil.getString(resourceRequest, "applicantPlaceOfBirthCountry");
		String applicantNationality = ParamUtil.getString(resourceRequest, "applicantNationality");
		String applicantNisNum = ParamUtil.getString(resourceRequest, "applicantNisNum");
		String applicantSocialNum = ParamUtil.getString(resourceRequest, "applicantSocialNum");
		String applicantNationalNum = ParamUtil.getString(resourceRequest, "applicantNationalNum");
		String applicantRegistrationNum = ParamUtil.getString(resourceRequest, "applicantRegistrationNum");
		String maritalStatusDetails = ParamUtil.getString(resourceRequest, "maritalStatusDetails");
		String applicantRelationship = ParamUtil.getString(resourceRequest, "applicantRelationship");
		String applicantSecTelephone = ParamUtil.getString(resourceRequest, "applicantSecTelephone");
		String applicantSecMail = ParamUtil.getString(resourceRequest, "applicantSecMail");
		String applicantSecAddress = ParamUtil.getString(resourceRequest, "applicantSecAddress");
		String applicantSecAddressParish = ParamUtil.getString(resourceRequest, "applicantSecAddressParish");

		FitPropPersonalDetailInfo applicant = null;
		try {
			applicant = FitPropPersonalDetailInfoLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(applicant)) {
			applicant = FitPropPersonalDetailInfoLocalServiceUtil
					.createFitPropPersonalDetailInfo(CounterLocalServiceUtil.increment());
		}
		applicant.setApplicantFirstName(applicantFirstName);
		applicant.setApplicantMiddleName(applicantMiddleName);
		applicant.setApplicantSurname(applicantSurname);
		applicant.setApplicantFormerName(applicantFormerName);
		applicant.setApplicantAlias(applicantAlias);
		applicant.setApplicantStreetName(applicantStreetName);
		applicant.setApplicantStreetNo(applicantStreetNo);
		applicant.setApplicantPostalCode(applicantPostalCode);
		applicant.setApplicantCountry(applicantCountry);
		applicant.setApplicantTownName(applicantTownName);
		applicant.setApplicantCity(applicantCity);
		applicant.setApplicantParish(applicantParish);
		applicant.setApplicantTelephoneNum(applicantTelephoneNum);
		applicant.setApplicantEmailAdd(applicantEmailAdd);
		applicant.setApplicantPlaceOfBirthTown(applicantPlaceOfBirthTown);
		applicant.setApplicantPlaceOfBirthParish(applicantPlaceOfBirthParish);
		applicant.setApplicantPlaceOfBirthCountry(applicantPlaceOfBirthCountry);
		applicant.setApplicantNationality(applicantNationality);
		applicant.setApplicantNisNum(applicantNisNum);
		applicant.setApplicantSocialNum(applicantSocialNum);
		applicant.setApplicantNationalNum(applicantNationalNum);
		applicant.setApplicantRegistrationNum(applicantRegistrationNum);
		applicant.setMaritalStatusDetails(maritalStatusDetails);
		applicant.setApplicantRelationship(applicantRelationship);
		applicant.setApplicantSecTelephone(applicantSecTelephone);
		applicant.setApplicantSecMail(applicantSecMail);
		applicant.setApplicantSecAddress(applicantSecAddress);
		applicant.setApplicantSecAddressParish(applicantSecAddressParish);
		try {
			if (Validator.isNotNull(applicantDateBirth)) {
				applicant.setApplicantDateBirth(new SimpleDateFormat("yyyy-MM-dd").parse(applicantDateBirth));
			}
		} catch (Exception e) {
		}
		applicant.setHsraApplicationId(hsraApplicationId);
		FitPropPersonalDetailInfoLocalServiceUtil.updateFitPropPersonalDetailInfo(applicant);
		return false;
	}
}
