package com.nbp.osi.services.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplicantinfo;
import com.nbp.osi.services.application.form.service.service.OsiServicesApplicantinfoLocalServiceUtil;
import com.nbp.osi.services.application.form.web.constants.OSIServicesApplicationFormPortletKeys;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + OSIServicesApplicationFormPortletKeys.OSISERVICESAPPLICATIONFORM,
			"mvc.command.name=/applicant/Detail/Info"
		},
		service = MVCResourceCommand.class
	)
public class OSIServiceApplicantDetailInfoResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {

		String applicantNature = ParamUtil.getString(resourceRequest, "applicantNature");
	    String indiFirstName = ParamUtil.getString(resourceRequest, "indiFirstName");
	    String indiLastName = ParamUtil.getString(resourceRequest, "indiLastName");
	    String companyName = ParamUtil.getString(resourceRequest, "companyName");
	    String address = ParamUtil.getString(resourceRequest, "address");
	    String emailAddress = ParamUtil.getString(resourceRequest, "emailAddress");
	    String telephone = ParamUtil.getString(resourceRequest, "telephone");
	    String applicationDate = ParamUtil.getString(resourceRequest, "applicationDate");
	    String trnNumber = ParamUtil.getString(resourceRequest, "trnNumber");
	    long osiServicesApplicationId = ParamUtil.getLong(resourceRequest, "osiServicesApplicationId");
	    
	    OsiServicesApplicantinfo applicantinfo=null;
	    
	    try {
	    	applicantinfo=OsiServicesApplicantinfoLocalServiceUtil.getOsiServiceApplicantInfoById(osiServicesApplicationId);
		} catch (Exception e) {
		}
	    
	    if(applicantinfo==null) {
	    	applicantinfo=OsiServicesApplicantinfoLocalServiceUtil.createOsiServicesApplicantinfo(CounterLocalServiceUtil.increment());
	    }
	    applicantinfo.setApplicantNature(applicantNature);
	    applicantinfo.setIndiFirstName(indiFirstName);
	    applicantinfo.setIndiLastName(indiLastName);
	    applicantinfo.setCompanyName(companyName);
	    applicantinfo.setAddress(address);
	    applicantinfo.setEmailAddress(emailAddress);
	    applicantinfo.setTelephone(telephone);
	    try {
			applicantinfo.setApplicationDate(new SimpleDateFormat("yyyy-MM-dd").parse(applicationDate));
		} catch (ParseException e) {
		}
	    applicantinfo.setTrnNumber(trnNumber);
	    applicantinfo.setOsiServicesApplicationId(osiServicesApplicationId);
	    OsiServicesApplicantinfoLocalServiceUtil.updateOsiServicesApplicantinfo(applicantinfo);
		
		return false;
	}

}
