package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.exception.NoSuchSezZoneGeneralBussinessAddressException;
import com.nbp.sez.status.application.form.service.model.SezZoneGeneralBusinessInfo;
import com.nbp.sez.status.application.form.service.model.SezZoneGeneralBussinessAddress;
import com.nbp.sez.status.application.form.service.service.SezZoneGeneralBusinessInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezZoneGeneralBussinessAddressLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/zone/general/business" }, service = MVCResourceCommand.class)
public class SezStatusZoneGeneralBusinessInfoResourceCommand implements MVCResourceCommand {
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		String zoneUserAppDate = ParamUtil.getString(resourceRequest, "zoneUserAppDate");
		String sezZoneUserDevName = ParamUtil.getString(resourceRequest, "sezZoneUserDevName");
		String sezZoneUserLocName = ParamUtil.getString(resourceRequest, "sezZoneUserLocName");
		String sezZoneDevControlNum = ParamUtil.getString(resourceRequest, "sezZoneDevControlNum");
		String zoneUserCompanyName = ParamUtil.getString(resourceRequest, "zoneUserCompanyName");
		String zoneUserCompanyStreetAddress = ParamUtil.getString(resourceRequest, "zoneUserCompanyStreetAddress");
		String companyTown = ParamUtil.getString(resourceRequest, "zoneUserCompanyTown");
		String companyParish = ParamUtil.getString(resourceRequest, "zoneUserCompanyParish");
		String authorisedRepName = ParamUtil.getString(resourceRequest, "zoneUserAuthRepName");
		String authorisedRepStreetAddress = ParamUtil.getString(resourceRequest, "zoneUserAuthRepStreetAddress");
		String authorisedRepTown = ParamUtil.getString(resourceRequest, "zoneUserAuthRepTown");
		String authorisedRepZipCode = ParamUtil.getString(resourceRequest, "zoneUserAuthRepZipCode");
		String authorisedRepCountry = ParamUtil.getString(resourceRequest, "zoneUserAuthRepCountry");
		String sponsorComName = ParamUtil.getString(resourceRequest, "zoneUserSponsorComName");
		String sponsorStreetAddress = ParamUtil.getString(resourceRequest, "zoneUserSponsorStreetAddress");
		String sponsorTown = ParamUtil.getString(resourceRequest, "zoneUserSponsorTown");
		String sponsorZipCode = ParamUtil.getString(resourceRequest, "zoneUserSponsorZipCode");
		String sponsorCountry = ParamUtil.getString(resourceRequest, "zoneUserSponsorCountry");
		String existingCompany = ParamUtil.getString(resourceRequest, "zoneUserExistingCom");
		String articleForm = ParamUtil.getString(resourceRequest, "zoneUserFormArticle");
		String otherArticleForm = ParamUtil.getString(resourceRequest, "zoneUserFormArticleOther");
		String nonResidentCom = ParamUtil.getString(resourceRequest, "zoneUserNonResiCom");
		String taxRegisNum = ParamUtil.getString(resourceRequest, "zoneUserTRN");
		String genConsumptionNum = ParamUtil.getString(resourceRequest, "zoneUserGCT");
		String taxComplianceCertificateNum = ParamUtil.getString(resourceRequest, "zoneUserTCC");
		long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");

		SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo = null;
		try {
			sezZoneGeneralBusinessInfo = SezZoneGeneralBusinessInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(sezZoneGeneralBusinessInfo)) {
			sezZoneGeneralBusinessInfo = SezZoneGeneralBusinessInfoLocalServiceUtil
					.createSezZoneGeneralBusinessInfo(CounterLocalServiceUtil.increment());
		}
		try {
			if (Validator.isNotNull(zoneUserAppDate)) {
				sezZoneGeneralBusinessInfo
						.setApplicationDate(new SimpleDateFormat("yyyy-MM-dd").parse(zoneUserAppDate));
			}
		} catch (Exception e) {
		}
		sezZoneGeneralBusinessInfo.setDeveloperName(sezZoneUserDevName);
		sezZoneGeneralBusinessInfo.setLocationName(sezZoneUserLocName);
		sezZoneGeneralBusinessInfo.setControlNum(sezZoneDevControlNum);
		sezZoneGeneralBusinessInfo.setExistingCompany(existingCompany);
		sezZoneGeneralBusinessInfo.setArticleForm(articleForm);
		sezZoneGeneralBusinessInfo.setOtherArticleForm(otherArticleForm);
		sezZoneGeneralBusinessInfo.setNonResidentCom(nonResidentCom);
		sezZoneGeneralBusinessInfo.setTaxRegisNum(taxRegisNum);
		sezZoneGeneralBusinessInfo.setGenConsumptionNum(genConsumptionNum);
		sezZoneGeneralBusinessInfo.setTaxComplianceCertificateNum(taxComplianceCertificateNum);
		sezZoneGeneralBusinessInfo.setSezStatusApplicationId(sezStatusApplicationId);

		SezZoneGeneralBusinessInfoLocalServiceUtil.updateSezZoneGeneralBusinessInfo(sezZoneGeneralBusinessInfo);
		SezZoneGeneralBussinessAddress addressOfCompany = null;
		SezZoneGeneralBussinessAddress addressOfAuthorisedRepresentative = null;
		SezZoneGeneralBussinessAddress adddressSponsorOrRegisteredHeadOffice = null;
		try {
			addressOfCompany = SezZoneGeneralBussinessAddressLocalServiceUtil
					.getSezStatusBy_AT_SAI(sezStatusApplicationId, "Address of Applicant Firm/Company");
		} catch (Exception e) {
		}
		if (Validator.isNull(addressOfCompany)) {
			addressOfCompany = SezZoneGeneralBussinessAddressLocalServiceUtil
					.createSezZoneGeneralBussinessAddress(CounterLocalServiceUtil.increment());
			addressOfCompany.setAddresstype("Address of Applicant Firm/Company");
		}
		addressOfCompany.setZoneName(zoneUserCompanyName);
		addressOfCompany.setZoneStreetAddress(zoneUserCompanyStreetAddress);
		addressOfCompany.setZoneTown(companyTown);
		addressOfCompany.setZoneParish(companyParish);
		addressOfCompany.setSezStatusApplicationId(sezStatusApplicationId);
		addressOfCompany.setSezZoneGeneralBusinessInfoId(sezZoneGeneralBusinessInfo.getSezZoneGeneralBusinessInfoId());
		SezZoneGeneralBussinessAddressLocalServiceUtil.updateSezZoneGeneralBussinessAddress(addressOfCompany);

		try {
			addressOfAuthorisedRepresentative = SezZoneGeneralBussinessAddressLocalServiceUtil
					.getSezStatusBy_AT_SAI(sezStatusApplicationId, "Address of Authorised Representative");
		} catch (Exception e) {
		}
		if (Validator.isNull(addressOfAuthorisedRepresentative)) {
			addressOfAuthorisedRepresentative = SezZoneGeneralBussinessAddressLocalServiceUtil
					.createSezZoneGeneralBussinessAddress(CounterLocalServiceUtil.increment());
			addressOfAuthorisedRepresentative.setAddresstype("Address of Authorised Representative");
		}
		addressOfAuthorisedRepresentative.setZoneName(authorisedRepName);
		addressOfAuthorisedRepresentative.setZoneStreetAddress(authorisedRepStreetAddress);
		addressOfAuthorisedRepresentative.setZoneTown(authorisedRepTown);
		addressOfAuthorisedRepresentative.setZoneParish(authorisedRepZipCode);
		addressOfAuthorisedRepresentative.setZoneCountry(authorisedRepCountry);
		addressOfAuthorisedRepresentative.setSezStatusApplicationId(sezStatusApplicationId);
		addressOfAuthorisedRepresentative
				.setSezZoneGeneralBusinessInfoId(sezZoneGeneralBusinessInfo.getSezZoneGeneralBusinessInfoId());
		SezZoneGeneralBussinessAddressLocalServiceUtil
				.updateSezZoneGeneralBussinessAddress(addressOfAuthorisedRepresentative);

		try {
			adddressSponsorOrRegisteredHeadOffice = SezZoneGeneralBussinessAddressLocalServiceUtil
					.getSezStatusBy_AT_SAI(sezStatusApplicationId, "Address of Sponsor/Registered Head Office");
		} catch (Exception e) {
		}
		if (Validator.isNull(adddressSponsorOrRegisteredHeadOffice)) {
			System.out.println("---------inside head office-----------");
			adddressSponsorOrRegisteredHeadOffice = SezZoneGeneralBussinessAddressLocalServiceUtil
					.createSezZoneGeneralBussinessAddress(CounterLocalServiceUtil.increment());
			adddressSponsorOrRegisteredHeadOffice.setAddresstype("Address of Sponsor/Registered Head Office");
		}
		adddressSponsorOrRegisteredHeadOffice.setZoneName(sponsorComName);
		adddressSponsorOrRegisteredHeadOffice.setZoneStreetAddress(sponsorStreetAddress);
		adddressSponsorOrRegisteredHeadOffice.setZoneTown(sponsorTown);
		adddressSponsorOrRegisteredHeadOffice.setZoneParish(sponsorZipCode);
		adddressSponsorOrRegisteredHeadOffice.setZoneCountry(sponsorCountry);
		adddressSponsorOrRegisteredHeadOffice.setSezStatusApplicationId(sezStatusApplicationId);
		adddressSponsorOrRegisteredHeadOffice
				.setSezZoneGeneralBusinessInfoId(sezZoneGeneralBusinessInfo.getSezZoneGeneralBusinessInfoId());
		SezZoneGeneralBussinessAddressLocalServiceUtil
				.updateSezZoneGeneralBussinessAddress(adddressSponsorOrRegisteredHeadOffice);
		return false;
	}
}