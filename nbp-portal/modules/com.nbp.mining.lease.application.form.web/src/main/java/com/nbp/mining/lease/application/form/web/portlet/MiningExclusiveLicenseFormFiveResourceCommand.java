package com.nbp.mining.lease.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.mining.lease.application.form.web.constants.MiningLeaseApplicationFormPortletKeys;
import com.nbp.mining.lease.application.service.model.MiningProspectingLicense;
import com.nbp.mining.lease.application.service.service.MiningProspectingLicenseLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningProspectingRightsLocalServiceUtil;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + MiningLeaseApplicationFormPortletKeys.MININGLEASEAPPLICATIONFORM,
	"mvc.command.name=/form/five/applicant/info" }, service = MVCResourceCommand.class)


public class MiningExclusiveLicenseFormFiveResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		System.out.println("Inside Minning Applicant detail Resource Command");
		long miningLeaseApplicationId = ParamUtil.getLong(resourceRequest, "miningLeaseApplicationId");
		String applicantNameLicence = ParamUtil.getString(resourceRequest, "applicantNameLicence");
		String trnNumberLicence = ParamUtil.getString(resourceRequest, "trnNumberLicence");
		String applicantNationalityLicence = ParamUtil.getString(resourceRequest, "applicantNationalityLicence");
		String applicantAddressLicence = ParamUtil.getString(resourceRequest, "applicantAddressLicence");
		String applicantTelephoneLicence = ParamUtil.getString(resourceRequest, "applicantTelephoneLicence");
		String applicantEmailLicence = ParamUtil.getString(resourceRequest, "applicantEmailLicence");
		String applicantNumberLicence = ParamUtil.getString(resourceRequest, "applicantNumberLicence");
		String agentNameLicence = ParamUtil.getString(resourceRequest, "agentNameLicence");
		String numProspectingLicence = ParamUtil.getString(resourceRequest, "numProspectingLicence");
		String agentNameLicenceGrant = ParamUtil.getString(resourceRequest, "agentNameLicenceGrant");
		String applicantLicence = ParamUtil.getString(resourceRequest, "applicantLicence");
		String justicePeaceParish = ParamUtil.getString(resourceRequest, "justicePeaceParish");
		String applicantLandmarkLicence = ParamUtil.getString(resourceRequest, "applicantLandmarkLicence");
		String applicantAreaLicence = ParamUtil.getString(resourceRequest, "applicantAreaLicence");
		String applicantDesires = ParamUtil.getString(resourceRequest, "applicantDesires");
		String dateLocationLic = ParamUtil.getString(resourceRequest, "dateLocationLic");
		String proslicenceFeeCheck = ParamUtil.getString(resourceRequest, "proslicenceFeeCheck");
		String incorporationLodged = ParamUtil.getString(resourceRequest, "incorporationLodged");
		
		MiningProspectingLicense prospectLicence=null;
		try {
			prospectLicence = MiningProspectingLicenseLocalServiceUtil.getMinningById(miningLeaseApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (prospectLicence == null) {
			prospectLicence = MiningProspectingLicenseLocalServiceUtil.createMiningProspectingLicense(CounterLocalServiceUtil.increment());
		}
		prospectLicence.setNameOfApplicant(applicantNameLicence);
		prospectLicence.setTrnNumber(trnNumberLicence);
		prospectLicence.setNationalityOfApplicant(applicantNationalityLicence);
		prospectLicence.setAddressInJamaica(applicantAddressLicence);
		prospectLicence.setTelephoneNumber(applicantTelephoneLicence);
		prospectLicence.setEmailAddress(applicantEmailLicence);
		prospectLicence.setNumberOfApplicant(applicantNumberLicence);
		prospectLicence.setNameOfTheAgent(agentNameLicence);
		prospectLicence.setNumberOfThisProspecting(numProspectingLicence);
		prospectLicence.setProspectingRight(agentNameLicenceGrant);
		prospectLicence.setParish(justicePeaceParish);
		prospectLicence.setLicence(applicantLicence);
		prospectLicence.setStateTheNearestLandmark(applicantLandmarkLicence);
		prospectLicence.setApproximateArea(applicantAreaLicence);
		prospectLicence.setMineralForWhichApplicant(applicantDesires);
		prospectLicence.setCopyOfArticle(incorporationLodged);
		prospectLicence.setProslicenceFeeCheck(proslicenceFeeCheck);
		prospectLicence.setMiningLeaseApplicationId(miningLeaseApplicationId);
		try {
			prospectLicence.setDateUponTheLocation(new SimpleDateFormat("yyyy-MM-dd").parse(dateLocationLic));
		}catch(Exception e) {}
		MiningProspectingLicenseLocalServiceUtil.updateMiningProspectingLicense(prospectLicence);
		// TODO Auto-generated method stub
		return false;
	}

}
