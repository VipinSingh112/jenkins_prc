package com.nbp.mining.lease.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.mining.lease.application.form.web.constants.MiningLeaseApplicationFormPortletKeys;
import com.nbp.mining.lease.application.service.model.MiningRenewalLicence;
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
	"mvc.command.name=/renewal/licence/form/seven" }, service = MVCResourceCommand.class)

public class MiningLicRenewApplicantDetResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		long miningLeaseApplicationId = ParamUtil.getLong(resourceRequest, "miningLeaseApplicationId");
		String renewalApplicantName = ParamUtil.getString(resourceRequest, "renewalApplicantName");
		String renewalTrnNumber = ParamUtil.getString(resourceRequest, "renewalTrnNumber");
		String renewalApplicantLicenceNo = ParamUtil.getString(resourceRequest, "renewalApplicantLicenceNo");
		String renewalState = ParamUtil.getString(resourceRequest, "renewalState");
		String proslicRenewFeeCheck = ParamUtil.getString(resourceRequest, "proslicRenewFeeCheck");
		
		MiningRenewalLicence renewLicence= null;
		try {
			renewLicence = MiningRenewalLicenceLocalServiceUtil.getMiningById(miningLeaseApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (renewLicence == null) {
			renewLicence = MiningRenewalLicenceLocalServiceUtil.createMiningRenewalLicence(CounterLocalServiceUtil.increment());
		}
		renewLicence.setRenewApplicantName(renewalApplicantName);
		renewLicence.setRenewTrnNum(renewalTrnNumber);
		renewLicence.setRenewApplicantLicNum(renewalApplicantLicenceNo);
		renewLicence.setStateWhetherRenewIs(renewalState);
		renewLicence.setRenewFeeCheck(proslicRenewFeeCheck);
		renewLicence.setMiningLeaseApplicationId(miningLeaseApplicationId);
		MiningRenewalLicenceLocalServiceUtil.updateMiningRenewalLicence(renewLicence);
		
		return false;
	}

}
