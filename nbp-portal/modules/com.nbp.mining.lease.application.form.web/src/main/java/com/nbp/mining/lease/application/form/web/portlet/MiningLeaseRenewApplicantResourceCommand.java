package com.nbp.mining.lease.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.mining.lease.application.form.web.constants.MiningLeaseApplicationFormPortletKeys;
import com.nbp.mining.lease.application.service.model.MiningRenewalLicence;
import com.nbp.mining.lease.application.service.service.MiningRenewalLicenceLocalServiceUtil;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + MiningLeaseApplicationFormPortletKeys.MININGLEASEAPPLICATIONFORM,
	"mvc.command.name=/renewal/lease/form/fifteen" }, service = MVCResourceCommand.class)

public class MiningLeaseRenewApplicantResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		long miningLeaseApplicationId = ParamUtil.getLong(resourceRequest, "miningLeaseApplicationId");
		String renLeaseApplicantName = ParamUtil.getString(resourceRequest, "renLeaseApplicantName");
		String renLeaseTrnNumber = ParamUtil.getString(resourceRequest, "renLeaseTrnNumber");
		String renewalTelephone = ParamUtil.getString(resourceRequest, "renewalTelephone");
		String renewalApplicantMining = ParamUtil.getString(resourceRequest, "renewalApplicantMining");
		String renewalDesiresMine = ParamUtil.getString(resourceRequest, "renewalDesiresMine");
		String renewalEmailAddress = ParamUtil.getString(resourceRequest, "renewalEmailAddress");
		String renewalLenght = ParamUtil.getString(resourceRequest, "renewalLenght");
		String renewalDate = ParamUtil.getString(resourceRequest, "renewalDate");
		String miningLeaseRenewFeeCheck = ParamUtil.getString(resourceRequest, "miningLeaseRenewFeeCheck");
		MiningRenewalLicence renewLicence= null;
		try {
			renewLicence = MiningRenewalLicenceLocalServiceUtil.getMiningById(miningLeaseApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (renewLicence == null) {
			renewLicence = MiningRenewalLicenceLocalServiceUtil.createMiningRenewalLicence(CounterLocalServiceUtil.increment());
		}
		renewLicence.setRenewApplicantName(renLeaseApplicantName);
		renewLicence.setRenewTrnNum(renLeaseTrnNumber);
		renewLicence.setRenewTelephone(renewalTelephone);
		renewLicence.setRenewEmailAddr(renewalEmailAddress);
		renewLicence.setRenewNumOfApplicantLease(renewalApplicantMining);
		renewLicence.setRenApplicantDesireToMine(renewalDesiresMine);
		renewLicence.setRenewTermDesired(renewalLenght);
		renewLicence.setRenewFeeCheck(miningLeaseRenewFeeCheck);
		try {
			renewLicence.setRenewDate(new SimpleDateFormat("yyyy-MM-dd").parse(renewalDate));
		}catch(Exception e) {}
		renewLicence.setMiningLeaseApplicationId(miningLeaseApplicationId);
		MiningRenewalLicenceLocalServiceUtil.updateMiningRenewalLicence(renewLicence);
		
		return false;
	}

}
