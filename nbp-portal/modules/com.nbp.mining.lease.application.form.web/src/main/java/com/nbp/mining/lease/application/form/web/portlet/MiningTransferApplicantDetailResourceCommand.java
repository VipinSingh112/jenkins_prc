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
	"mvc.command.name=/add/form/nine/licence/transfer" }, service = MVCResourceCommand.class)


public class MiningTransferApplicantDetailResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		long miningLeaseApplicationId = ParamUtil.getLong(resourceRequest, "miningLeaseApplicationId");
		String applicantNametransfer = ParamUtil.getString(resourceRequest, "applicantNametransfer");
		String telephonetransfer = ParamUtil.getString(resourceRequest, "telephonetransfer");
		String applicantEmailtransfer = ParamUtil.getString(resourceRequest, "applicantEmailtransfer");
		String trnNumbertransfer = ParamUtil.getString(resourceRequest, "trnNumbertransfer");
		String applicantNationalitytransfer = ParamUtil.getString(resourceRequest, "applicantNationalitytransfer");
		String applicantAddresstransfer = ParamUtil.getString(resourceRequest, "applicantAddresstransfer");
		String datetransfer = ParamUtil.getString(resourceRequest, "datetransfer");
		
		MiningProspectingLicense transferLicence=null;
		try {
			transferLicence = MiningProspectingLicenseLocalServiceUtil.getMinningById(miningLeaseApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (transferLicence == null) {
			transferLicence = MiningProspectingLicenseLocalServiceUtil.createMiningProspectingLicense(CounterLocalServiceUtil.increment());
		}
		transferLicence.setNameOfApplicant(applicantNametransfer);
		transferLicence.setTrnNumber(trnNumbertransfer);
		transferLicence.setNationalityOfApplicant(applicantNationalitytransfer);
		transferLicence.setAddressInJamaica(applicantAddresstransfer);
		transferLicence.setTelephoneNumber(telephonetransfer);
		transferLicence.setEmailAddress(applicantEmailtransfer);
		try {
			transferLicence.setDateSurrender(new SimpleDateFormat("yyyy-MM-dd").parse(datetransfer));
		}catch(Exception e) {}
		transferLicence.setMiningLeaseApplicationId(miningLeaseApplicationId);
		MiningProspectingLicenseLocalServiceUtil.updateMiningProspectingLicense(transferLicence);
		// TODO Auto-generated method stub
		return false;
	}

}
