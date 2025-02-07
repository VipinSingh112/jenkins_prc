package com.nbp.osi.services.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.osi.services.application.form.service.model.OSIServiceComSign;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplicantinfo;
import com.nbp.osi.services.application.form.service.service.OSIServiceComSignLocalServiceUtil;
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
			"mvc.command.name=/sign/Date/Com/Trustee"
		},
		service = MVCResourceCommand.class
	)
public class OSIServiceApplicantTrusteeCompanySignDateResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {

	    String dateOfTrusteeComSign = ParamUtil.getString(resourceRequest, "dateOfTrusteeComSign");
	    long osiServicesApplicationId = ParamUtil.getLong(resourceRequest, "osiServicesApplicationId");
	    
	    OSIServiceComSign osiServiceComSign=null;
	    
	    try {
	    	osiServiceComSign=OSIServiceComSignLocalServiceUtil.getOsiServicesSignBy_Id(osiServicesApplicationId);
		} catch (Exception e) {
		}
	    
	    if(osiServiceComSign==null) {
	    	osiServiceComSign=OSIServiceComSignLocalServiceUtil.createOSIServiceComSign(CounterLocalServiceUtil.increment());
	    }
	    try {
	    	osiServiceComSign.setComSignDate(new SimpleDateFormat("yyyy-MM-dd").parse(dateOfTrusteeComSign));
		} catch (ParseException e) {
		}
	    osiServiceComSign.setOsiServicesApplicationId(osiServicesApplicationId);
	    OSIServiceComSignLocalServiceUtil.updateOSIServiceComSign(osiServiceComSign);
		
		return false;
	}

}
