package com.nbp.osi.services.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeDeclerationAndSignatureinfo;
import com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeDeclerationAndSignatureinfoLocalServiceUtil;
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
			"mvc.command.name=/under/Signed/Info/Url"
		},
		service = MVCResourceCommand.class
	)
public class OSIServiceTrusteeIndividualDeclerationInfoResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {

	    long osiServicesApplicationId = ParamUtil.getLong(resourceRequest, "osiServicesApplicationId");
	    String indiUndersignedDated = ParamUtil.getString(resourceRequest, "indiUndersignedDated");
	    String indiUndersignedApplicantName = ParamUtil.getString(resourceRequest, "indiUndersignedApplicantName");
	    
	    OsiServicesTrusteeDeclerationAndSignatureinfo andSignatureinfo=null;
	    try {
			andSignatureinfo=  OsiServicesTrusteeDeclerationAndSignatureinfoLocalServiceUtil.getOsiServicesTrusteeDeclerationAndSignatureinfoById(osiServicesApplicationId);
		} catch (NoSuchOsiServicesTrusteeDeclerationAndSignatureinfoException e) {
			// TODO Auto-generated catch block
		}
	    if(andSignatureinfo==null) {
	    	andSignatureinfo=OsiServicesTrusteeDeclerationAndSignatureinfoLocalServiceUtil.createOsiServicesTrusteeDeclerationAndSignatureinfo(CounterLocalServiceUtil.increment());
	    }
	    try {
			andSignatureinfo.setIndiUndersignedDated(new SimpleDateFormat("yyyy-MM-dd").parse(indiUndersignedDated));
		} catch (ParseException e) {
		}
	    andSignatureinfo.setIndiUndersignedApplicantName(indiUndersignedApplicantName);
	    andSignatureinfo.setOsiServicesApplicationId(osiServicesApplicationId);
	    OsiServicesTrusteeDeclerationAndSignatureinfoLocalServiceUtil.updateOsiServicesTrusteeDeclerationAndSignatureinfo(andSignatureinfo);

		return false;
	}

}
