package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfo;
import com.nbp.ncbj.application.form.service.service.NcbjOrgDetailInfoLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
			"mvc.command.name=/organization/first/form/info"
		},
		service = MVCResourceCommand.class
	)

public class OrganizationDetailFirstFormResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String newCompanyName = ParamUtil.getString(resourceRequest, "newCompanyName");
		String companyEmail = ParamUtil.getString(resourceRequest, "companyEmail");
		String mailingAddress = ParamUtil.getString(resourceRequest, "mailingAddress");
		String city = ParamUtil.getString(resourceRequest, "city");
		String postalCode = ParamUtil.getString(resourceRequest, "postalCode");
		String country = ParamUtil.getString(resourceRequest, "country");
		String physicalAddress = ParamUtil.getString(resourceRequest, "physicalAddress");
		String physicalCity = ParamUtil.getString(resourceRequest, "physicalCity");
		String physicalPostalCode = ParamUtil.getString(resourceRequest, "physicalPostalCode");
		String physicalCountry = ParamUtil.getString(resourceRequest, "physicalCountry");
		String companyHead = ParamUtil.getString(resourceRequest, "companyHead");
		String companyTitle = ParamUtil.getString(resourceRequest, "companyTitle");
		String companyContact = ParamUtil.getString(resourceRequest, "companyContact");
		String companyContactTitle = ParamUtil.getString(resourceRequest, "companyContactTitle");
		String companyTelephone = ParamUtil.getString(resourceRequest, "companyTelephone");
		String companyFax = ParamUtil.getString(resourceRequest, "companyFax");
		String companyWebsite = ParamUtil.getString(resourceRequest, "companyWebsite");
		String certificationScope = ParamUtil.getString(resourceRequest, "certificationScope");
		String managementAccessibleToAuditDetail = ParamUtil.getString(resourceRequest, "managementAccessibleToAuditDetail");
		String keyActivity = ParamUtil.getString(resourceRequest, "keyActivity");
		String transferReason = ParamUtil.getString(resourceRequest, "transferReason");
		String indicateStandard = ParamUtil.getString(resourceRequest, "indicateStandard");
		String ceritificationBodyName = ParamUtil.getString(resourceRequest, "ceritificationBodyName");
		String consultingFirm = ParamUtil.getString(resourceRequest, "consultingFirm");
		String consultant = ParamUtil.getString(resourceRequest, "consultant");
		String telephone = ParamUtil.getString(resourceRequest, "telephone");
		String email = ParamUtil.getString(resourceRequest, "email");
		String relevantRequirementList = ParamUtil.getString(resourceRequest, "relevantRequirementList");
		String certificationScopeRadio = ParamUtil.getString(resourceRequest, "certificationScopeRadio");
		String outsourceProcess = ParamUtil.getString(resourceRequest, "outsourceProcess");
		String relevantRequirement = ParamUtil.getString(resourceRequest, "relevantRequirement");
		String managementAccessibleToAudit = ParamUtil.getString(resourceRequest, "managementAccessibleToAudit");
		String desiredCertification = ParamUtil.getString(resourceRequest, "desiredCertification");
		String surveillanceSchedule = ParamUtil.getString(resourceRequest, "surveillanceSchedule");
		String certifiedManagement = ParamUtil.getString(resourceRequest, "certifiedManagement");
		String certifiedAccreditedCertification = ParamUtil.getString(resourceRequest, "certifiedAccreditedCertification");
		String companyUsedConsultingService = ParamUtil.getString(resourceRequest, "companyUsedConsultingService");
		String pleaseManageDetail = ParamUtil.getString(resourceRequest, "pleaseManageDetail");
		long ncbjApplicationId=ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		
		NcbjOrgDetailInfo orgDetailInfo=null;
		
		try {
			orgDetailInfo= NcbjOrgDetailInfoLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (orgDetailInfo == null) {
			orgDetailInfo=NcbjOrgDetailInfoLocalServiceUtil.createNcbjOrgDetailInfo(CounterLocalServiceUtil.increment());
		}
		orgDetailInfo.setNewCompanyName(newCompanyName);
	    orgDetailInfo.setCompanyEmail(companyEmail);
	    orgDetailInfo.setMailingAddress(mailingAddress);
	    orgDetailInfo.setCity(city);
	    orgDetailInfo.setPostalCode(postalCode);
	    orgDetailInfo.setCountry(country);
	    orgDetailInfo.setPhysicalAddress(physicalAddress);
	    orgDetailInfo.setPhysicalCity(physicalCity);
	    orgDetailInfo.setPhysicalPostalCode(physicalPostalCode);
	    orgDetailInfo.setPhysicalCountry(physicalCountry);
	    orgDetailInfo.setCompanyHead(companyHead);
	    orgDetailInfo.setCompanyTitle(companyTitle);
	    orgDetailInfo.setCompanyContact(companyContact);
	    orgDetailInfo.setCompanyContactTitle(companyContactTitle);
	    orgDetailInfo.setCompanyTelephone(companyTelephone);
	    orgDetailInfo.setCompanyFax(companyFax);
	    orgDetailInfo.setCompanyWebsite(companyWebsite);
	    orgDetailInfo.setCertificationScope(certificationScope);
	    orgDetailInfo.setManageAccessToAuditDet(managementAccessibleToAuditDetail);
	    orgDetailInfo.setKeyActivity(keyActivity);
	    orgDetailInfo.setTransferReason(transferReason);
	    orgDetailInfo.setIndicateStandard(indicateStandard);
	    orgDetailInfo.setCeritificationBodyName(ceritificationBodyName);
	    orgDetailInfo.setConsultingFirm(consultingFirm);
	    orgDetailInfo.setConsultant(consultant);
	    orgDetailInfo.setTelephone(telephone);
	    orgDetailInfo.setEmail(email);
	    orgDetailInfo.setRelevantRequirementList(relevantRequirementList);
	    orgDetailInfo.setCertificationScopeRadio(certificationScopeRadio);
	    orgDetailInfo.setOutsourceProcess(outsourceProcess);
	    orgDetailInfo.setRelevantRequirement(relevantRequirement);
	    orgDetailInfo.setManagementAccessToAudit(managementAccessibleToAudit);
	    orgDetailInfo.setDesiredCertification(desiredCertification);
	    orgDetailInfo.setSurveillanceSchedule(surveillanceSchedule);
	    orgDetailInfo.setCertifiedManagement(certifiedManagement);
	    orgDetailInfo.setCertifiedAccreditedCerti(certifiedAccreditedCertification);
	    orgDetailInfo.setCompanyUsedConsulting(companyUsedConsultingService);
	    orgDetailInfo.setPleaseManageDetail(pleaseManageDetail);
	    orgDetailInfo.setNcbjApplicationId(ncbjApplicationId);
	    NcbjOrgDetailInfoLocalServiceUtil.updateNcbjOrgDetailInfo(orgDetailInfo);
		
		// TODO Auto-generated method stub
		return false;
	}

}
