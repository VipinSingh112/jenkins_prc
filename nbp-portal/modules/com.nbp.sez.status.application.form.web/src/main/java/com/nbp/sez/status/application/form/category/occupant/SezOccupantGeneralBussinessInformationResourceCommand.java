package com.nbp.sez.status.application.form.category.occupant;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupantGeneralBussinessAddressException;
import com.nbp.sez.status.application.form.service.model.SezOccupantGeneralBussinessAddress;
import com.nbp.sez.status.application.form.service.model.SezOccupantGeneralBussinessInfo;
import com.nbp.sez.status.application.form.service.service.SezOccupantGeneralBussinessAddressLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezOccupantGeneralBussinessInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/sez/status/occupant/general/bussiness/detail" }, service = MVCResourceCommand.class)
public class SezOccupantGeneralBussinessInformationResourceCommand implements MVCResourceCommand{
	private static Log _log=LogFactoryUtil.getLog(SezOccupantGeneralBussinessInformationResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		
	     String occAppDate = ParamUtil.getString(resourceRequest, "occAppDate");
	        String occSezDevName = ParamUtil.getString(resourceRequest, "occSezDevName");
	        String occSezDevControlNum = ParamUtil.getString(resourceRequest, "occSezDevControlNum");
	        String occCompanyName = ParamUtil.getString(resourceRequest, "occCompanyName");
	        String occCompanyStreetAddress = ParamUtil.getString(resourceRequest, "occCompanyStreetAddress");
	        String occCompanyTown = ParamUtil.getString(resourceRequest, "occCompanyTown");
	        String occCompanyParish = ParamUtil.getString(resourceRequest, "occCompanyParish");
	        String occAuthRepName = ParamUtil.getString(resourceRequest, "occAuthRepName");
	        String occAuthRepStreetAddress = ParamUtil.getString(resourceRequest, "occAuthRepStreetAddress");
	        String occAuthRepTown = ParamUtil.getString(resourceRequest, "occAuthRepTown");
	        String occAuthRepZipCode = ParamUtil.getString(resourceRequest, "occAuthRepZipCode");
	        String occAuthRepCountry = ParamUtil.getString(resourceRequest, "occAuthRepCountry");
	        String occSponsorComName = ParamUtil.getString(resourceRequest, "occSponsorComName");
	        String occSponsorStreetAddress = ParamUtil.getString(resourceRequest, "occSponsorStreetAddress");
	        String occSponsorTown = ParamUtil.getString(resourceRequest, "occSponsorTown");
	        String occSponsorZipCode = ParamUtil.getString(resourceRequest, "occSponsorZipCode");
	        String occSponsorCountry = ParamUtil.getString(resourceRequest, "occSponsorCountry");
	        String occExistingCom = ParamUtil.getString(resourceRequest, "occExistingCom");
	        String occFormArticle = ParamUtil.getString(resourceRequest, "occFormArticle");
	        String occFormArticleOther = ParamUtil.getString(resourceRequest, "occFormArticleOther");
	        String occTRN = ParamUtil.getString(resourceRequest, "occTRN");
	        String occGCT = ParamUtil.getString(resourceRequest, "occGCT");
	        String occTCC = ParamUtil.getString(resourceRequest, "occTCC");
	        long sezApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
	        SezOccupantGeneralBussinessInfo bussinessInfo=null;
	        try {
	        	bussinessInfo=	SezOccupantGeneralBussinessInfoLocalServiceUtil.getSezStatusBy_Id(sezApplicationId);
	        }catch (Exception e) {
			}
	        if(Validator.isNull(bussinessInfo)) {
	        	bussinessInfo=SezOccupantGeneralBussinessInfoLocalServiceUtil.createSezOccupantGeneralBussinessInfo
	        			(CounterLocalServiceUtil.increment());
	        }
	        try {
				bussinessInfo.setOccAppDate(new SimpleDateFormat("yyyy-MM-dd").parse(occAppDate));
			} catch (ParseException e) {
			}
	        bussinessInfo.setOccSezDevName(occSezDevName);
	        bussinessInfo.setOccSezDevControlNum(occSezDevControlNum);
	        bussinessInfo.setOccExistingCom(occExistingCom);
	        bussinessInfo.setOccFormArticle(occFormArticle);
	        bussinessInfo.setOccFormArticleOther(occFormArticleOther);
	        bussinessInfo.setOccTRN(occTRN);
	        bussinessInfo.setOccGCT(occGCT);
	        bussinessInfo.setOccTCC(occTCC);
	        bussinessInfo.setSezStatusApplicationId(sezApplicationId);
	        // Save or update bussinessInfo
	        SezOccupantGeneralBussinessInfoLocalServiceUtil.updateSezOccupantGeneralBussinessInfo(bussinessInfo);
	        SezOccupantGeneralBussinessAddress addressOfCompany=null;
	        SezOccupantGeneralBussinessAddress adddressSponsorOrRegisteredHeadOffice=null;
	        SezOccupantGeneralBussinessAddress addressOfAuthorisedRepresentative=null;
	        
	        try {
				addressOfCompany=SezOccupantGeneralBussinessAddressLocalServiceUtil.
						getSezStatusBy_AT_SAI(sezApplicationId, "Address of Applicant Firm/Company");
			} catch (NoSuchSezOccupantGeneralBussinessAddressException e) {
			}
	        if(Validator.isNull(addressOfCompany)) {
	        	addressOfCompany=SezOccupantGeneralBussinessAddressLocalServiceUtil.createSezOccupantGeneralBussinessAddress
	        			(CounterLocalServiceUtil.increment());	
	        	addressOfCompany.setAddresstype("Address of Applicant Firm/Company");
	        }
	        addressOfCompany.setOccName(occCompanyName);
	        addressOfCompany.setOccStreetAddress(occCompanyStreetAddress);
	        addressOfCompany.setOccTown(occCompanyTown);
	        addressOfCompany.setOccParish(occCompanyParish);
	        addressOfCompany.setOccCountry("");
	        addressOfCompany.setSezStatusApplicationId(sezApplicationId);
	        addressOfCompany.setSezOccGenBussId(bussinessInfo.getSezOccGenBussId());
	        SezOccupantGeneralBussinessAddressLocalServiceUtil.updateSezOccupantGeneralBussinessAddress(addressOfCompany);
	        try {
	        	adddressSponsorOrRegisteredHeadOffice=SezOccupantGeneralBussinessAddressLocalServiceUtil.
						getSezStatusBy_AT_SAI(sezApplicationId, "Address of Sponsor/Registered Head Office");
			} catch (Exception e) {
			}
	        if(Validator.isNull(adddressSponsorOrRegisteredHeadOffice)) {
	        	adddressSponsorOrRegisteredHeadOffice=SezOccupantGeneralBussinessAddressLocalServiceUtil.createSezOccupantGeneralBussinessAddress
	        			(CounterLocalServiceUtil.increment());
	        	adddressSponsorOrRegisteredHeadOffice.setAddresstype(
	        			"Address of Sponsor/Registered Head Office");
	        }
	        adddressSponsorOrRegisteredHeadOffice.setOccName(occSponsorComName);
	        adddressSponsorOrRegisteredHeadOffice.setOccStreetAddress(occSponsorStreetAddress);
	        adddressSponsorOrRegisteredHeadOffice.setOccTown(occSponsorTown);
	        adddressSponsorOrRegisteredHeadOffice.setOccParish(occSponsorZipCode);
	        adddressSponsorOrRegisteredHeadOffice.setOccCountry(occSponsorCountry);
	        adddressSponsorOrRegisteredHeadOffice.setSezStatusApplicationId(sezApplicationId);
	        adddressSponsorOrRegisteredHeadOffice.setSezOccGenBussId(bussinessInfo.getSezOccGenBussId());
	        SezOccupantGeneralBussinessAddressLocalServiceUtil.updateSezOccupantGeneralBussinessAddress(adddressSponsorOrRegisteredHeadOffice);
	        try {
	        	addressOfAuthorisedRepresentative=SezOccupantGeneralBussinessAddressLocalServiceUtil.
						getSezStatusBy_AT_SAI(sezApplicationId, "Address of Authorised Representative");
			} catch (Exception e) {
			}
	        if(Validator.isNull(addressOfAuthorisedRepresentative)) {
	        	addressOfAuthorisedRepresentative=SezOccupantGeneralBussinessAddressLocalServiceUtil.createSezOccupantGeneralBussinessAddress
	        			(CounterLocalServiceUtil.increment());
	        	addressOfAuthorisedRepresentative.setAddresstype(
	        			"Address of Authorised Representative");
	        }
	        addressOfAuthorisedRepresentative.setOccName(occAuthRepName);
	        addressOfAuthorisedRepresentative.setOccStreetAddress(occAuthRepStreetAddress);
	        addressOfAuthorisedRepresentative.setOccTown(occAuthRepTown);
	        addressOfAuthorisedRepresentative.setOccParish(occAuthRepZipCode);
	        addressOfAuthorisedRepresentative.setOccCountry(occAuthRepCountry);
	        addressOfAuthorisedRepresentative.setSezStatusApplicationId(sezApplicationId);
	        addressOfAuthorisedRepresentative.setSezOccGenBussId(bussinessInfo.getSezOccGenBussId());
	        SezOccupantGeneralBussinessAddressLocalServiceUtil.updateSezOccupantGeneralBussinessAddress(addressOfAuthorisedRepresentative);
	        return false;
		
	}

}
