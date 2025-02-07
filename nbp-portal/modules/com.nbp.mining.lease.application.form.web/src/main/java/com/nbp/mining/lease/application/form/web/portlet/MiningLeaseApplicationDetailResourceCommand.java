package com.nbp.mining.lease.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.mining.lease.application.form.web.constants.MiningLeaseApplicationFormPortletKeys;
import com.nbp.mining.lease.application.service.model.MiningProspectingLicense;
import com.nbp.mining.lease.application.service.service.MiningProspectingLicenseLocalServiceUtil;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + MiningLeaseApplicationFormPortletKeys.MININGLEASEAPPLICATIONFORM,
	"mvc.command.name=/form/twelve/applicant/info" }, service = MVCResourceCommand.class)


public class MiningLeaseApplicationDetailResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
			long miningLeaseApplicationId = ParamUtil.getLong(resourceRequest, "miningLeaseApplicationId");
			String applicantNameLease = ParamUtil.getString(resourceRequest, "applicantNameLease");
			String applicantNationalityLease = ParamUtil.getString(resourceRequest, "applicantNationalityLease");
			String applicantAddressLease = ParamUtil.getString(resourceRequest, "applicantAddressLease");
			String applicantNumberLease = ParamUtil.getString(resourceRequest, "applicantNumberLease");
			String applicantLeaseArea = ParamUtil.getString(resourceRequest, "applicantLeaseArea");
			String justicePeaceParishLease = ParamUtil.getString(resourceRequest, "justicePeaceParishLease");
			String applicantLeaseDesires = ParamUtil.getString(resourceRequest, "applicantLeaseDesires");
			String applicantLenghtLease = ParamUtil.getString(resourceRequest, "applicantLenghtLease");
			String applicantDateLocation = ParamUtil.getString(resourceRequest, "applicantDateLocation");
			String miningLeaseFeeCheck = ParamUtil.getString(resourceRequest, "miningLeaseFeeCheck");
			
			MiningProspectingLicense prospectLicence=null;
			try {
				prospectLicence = MiningProspectingLicenseLocalServiceUtil.getMinningById(miningLeaseApplicationId);
			} catch (Exception e) {
				// TODO: handle exception
			}
			if (prospectLicence == null) {
				prospectLicence = MiningProspectingLicenseLocalServiceUtil.createMiningProspectingLicense(CounterLocalServiceUtil.increment());
			}
			prospectLicence.setNameOfApplicant(applicantNameLease);
			prospectLicence.setNationalityOfApplicant(applicantNationalityLease);
			prospectLicence.setAddressInJamaica(applicantAddressLease);
			prospectLicence.setNumberOfApplicant(applicantNumberLease);
			prospectLicence.setApproximateArea(applicantLeaseArea);
			prospectLicence.setParish(justicePeaceParishLease);
			prospectLicence.setApproximateArea(applicantLeaseArea);
			prospectLicence.setMineralForWhichApplicant(applicantLeaseDesires);
			prospectLicence.setLicence(applicantLenghtLease);
			prospectLicence.setProslicenceFeeCheck(miningLeaseFeeCheck);
			try {
				prospectLicence.setDateUponTheLocation(new SimpleDateFormat("yyyy-MM-dd").parse(applicantDateLocation));
			}catch(Exception e) {}
			prospectLicence.setMiningLeaseApplicationId(miningLeaseApplicationId);
			MiningProspectingLicenseLocalServiceUtil.updateMiningProspectingLicense(prospectLicence);
			// TODO Auto-generated method stub
			return false;
}

}
