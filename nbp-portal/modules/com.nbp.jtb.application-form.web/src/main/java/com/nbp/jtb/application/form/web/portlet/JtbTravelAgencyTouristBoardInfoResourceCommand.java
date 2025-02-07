package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jtb.application.form.service.model.AttractionTravelAgency;
import com.nbp.jtb.application.form.service.service.AttractionTravelAgencyLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;


@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/domestic/travel/agency/info" }, service = MVCResourceCommand.class)
public class JtbTravelAgencyTouristBoardInfoResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(JtbTravelAgencyTouristBoardInfoResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Attraction TRAVEL AGENCY Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		String applicantName = ParamUtil.getString(resourceRequest, "applicantName");
        String agencyAddress =  ParamUtil.getString(resourceRequest, "agencyAddress");
        String agencyTelephone =  ParamUtil.getString(resourceRequest, "agencyTelephone");
        String agencyName =  ParamUtil.getString(resourceRequest, "agencyName");
        String agencyAddressSec =  ParamUtil.getString(resourceRequest, "agencyAddressSec");
        String agencyTelephoneNum =  ParamUtil.getString(resourceRequest, "agencyTelephoneNum");
        String isRegistered =  ParamUtil.getString(resourceRequest, "isRegistered");
        String registrationParticulars =  ParamUtil.getString(resourceRequest, "registrationParticulars");
        String proprietorName =  ParamUtil.getString(resourceRequest, "proprietorName");
        String managerName =  ParamUtil.getString(resourceRequest, "managerName");
        String managerAddress =  ParamUtil.getString(resourceRequest, "managerAddress");
        String secretaryName =  ParamUtil.getString(resourceRequest, "secretaryName");
        String secretaryAddress =  ParamUtil.getString(resourceRequest, "secretaryAddress");
        String bankerName =  ParamUtil.getString(resourceRequest, "bankerName");
        String bondingCompanyName =  ParamUtil.getString(resourceRequest, "bondingCompanyName");
        String bondingCompanyAddress =  ParamUtil.getString(resourceRequest, "bondingCompanyAddress");
        String auditorsName =  ParamUtil.getString(resourceRequest, "auditorsName");
        String auditorsAddress =  ParamUtil.getString(resourceRequest, "auditorsAddress");
        String numberOfEmployees =  ParamUtil.getString(resourceRequest, "numberOfEmployees");
        String signDate =  ParamUtil.getString(resourceRequest, "signDate");

		AttractionTravelAgency travelAgency =null;
		try {
			travelAgency=AttractionTravelAgencyLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(Validator.isNull(travelAgency)) {
			travelAgency = AttractionTravelAgencyLocalServiceUtil.createAttractionTravelAgency(CounterLocalServiceUtil.increment());
		}
		travelAgency.setApplicantName(applicantName);
        travelAgency.setAgencyAddress(agencyAddress);
        travelAgency.setAgencyTelephone(agencyTelephone);
        travelAgency.setAgencyName(agencyName);
        travelAgency.setAgencyAddressSec(agencyAddressSec);
        travelAgency.setAgencyTelephoneNum(agencyTelephoneNum);
        travelAgency.setIsRegistered(isRegistered);
        travelAgency.setRegstParticulars(registrationParticulars);
        travelAgency.setProprietorName(proprietorName);
        travelAgency.setManagerName(managerName);
        travelAgency.setManagerAddress(managerAddress);
        travelAgency.setSecretaryName(secretaryName);
        travelAgency.setSecretaryAddress(secretaryAddress);
        travelAgency.setBankerName(bankerName);
        travelAgency.setBondingCompanyName(bondingCompanyName);
        travelAgency.setBondingCompanyAddress(bondingCompanyAddress);
        travelAgency.setAuditorsName(auditorsName);
        travelAgency.setAuditorsAddress(auditorsAddress);
        travelAgency.setNumberOfEmployees(numberOfEmployees);
		    try {
		    	travelAgency.setSignDate(new SimpleDateFormat("yyyy-MM-dd").parse(signDate));
			} catch (Exception e) {
				// TODO: handle exception
			}
		travelAgency.setJtbApplicationId(jtbApplicationId);
		AttractionTravelAgencyLocalServiceUtil.updateAttractionTravelAgency(travelAgency);
		
		return false;
	}

}
