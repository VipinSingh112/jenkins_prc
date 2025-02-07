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
	"mvc.command.name=/add/form/ten/licence/surrender" }, service = MVCResourceCommand.class)


public class MiningSurrenderApplicantDetailResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		long miningLeaseApplicationId = ParamUtil.getLong(resourceRequest, "miningLeaseApplicationId");
		String applicantTelephonesurrender = ParamUtil.getString(resourceRequest, "applicantTelephonesurrender");
		String applicantEmailsurrender = ParamUtil.getString(resourceRequest, "applicantEmailsurrender");
		String datesurrender = ParamUtil.getString(resourceRequest, "datesurrender");
		
		MiningProspectingLicense surrenderLicence=null;
		try {
			surrenderLicence = MiningProspectingLicenseLocalServiceUtil.getMinningById(miningLeaseApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (surrenderLicence == null) {
			surrenderLicence = MiningProspectingLicenseLocalServiceUtil.createMiningProspectingLicense(CounterLocalServiceUtil.increment());
		}
		surrenderLicence.setTelephoneNumber(applicantTelephonesurrender);
		surrenderLicence.setEmailAddress(applicantEmailsurrender);
		try {
			surrenderLicence.setDateSurrender(new SimpleDateFormat("yyyy-MM-dd").parse(datesurrender));
		}catch(Exception e) {}
		surrenderLicence.setMiningLeaseApplicationId(miningLeaseApplicationId);
		MiningProspectingLicenseLocalServiceUtil.updateMiningProspectingLicense(surrenderLicence);
		
		// TODO Auto-generated method stub
		return false;
	}

}
