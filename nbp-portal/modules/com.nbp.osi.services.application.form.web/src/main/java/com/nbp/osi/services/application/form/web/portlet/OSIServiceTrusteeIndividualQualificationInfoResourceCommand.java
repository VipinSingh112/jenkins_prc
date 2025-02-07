package com.nbp.osi.services.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesTrusteeIndividualQualificationinfoException;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeIndividualQualificationinfo;
import com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeIndividualQualificationinfoLocalServiceUtil;
import com.nbp.osi.services.application.form.web.constants.OSIServicesApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + OSIServicesApplicationFormPortletKeys.OSISERVICESAPPLICATIONFORM,
			"mvc.command.name=/org/Info/Url"
		},
		service = MVCResourceCommand.class
	)
public class OSIServiceTrusteeIndividualQualificationInfoResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {

	    long osiServicesApplicationId = ParamUtil.getLong(resourceRequest, "osiServicesApplicationId");
	    String orgMember = ParamUtil.getString(resourceRequest, "orgMember");
	    OsiServicesTrusteeIndividualQualificationinfo  individualQualificationinfo=null;
	    try {
			individualQualificationinfo= OsiServicesTrusteeIndividualQualificationinfoLocalServiceUtil.getOsiServicesTrusteeIndividualQualificationinfoById(osiServicesApplicationId);
		} catch (NoSuchOsiServicesTrusteeIndividualQualificationinfoException e) {
			// TODO Auto-generated catch block
		}
	    if (individualQualificationinfo==null) {
	    	individualQualificationinfo=	OsiServicesTrusteeIndividualQualificationinfoLocalServiceUtil.createOsiServicesTrusteeIndividualQualificationinfo(CounterLocalServiceUtil.increment());
		}
	    individualQualificationinfo.setOrgMember(orgMember);
	    individualQualificationinfo.setOsiServicesApplicationId(osiServicesApplicationId);
	    OsiServicesTrusteeIndividualQualificationinfoLocalServiceUtil.updateOsiServicesTrusteeIndividualQualificationinfo(individualQualificationinfo);
		return false;
	}

}