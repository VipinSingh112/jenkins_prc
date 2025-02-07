package com.nbp.osi.services.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeLicenseBreakdowninfo;
import com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeLicenseBreakdowninfoLocalServiceUtil;
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
			"mvc.command.name=/license/Breakdown/Info/Url"
		},
		service = MVCResourceCommand.class
	)
public class OSIServiceTrusteeIndividualLicenseBreakdownInfoResourceCommand implements MVCResourceCommand{
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String indiBreakdownApplicantName = ParamUtil.getString(resourceRequest, "indiBreakdownApplicantName");
	    String indiBreakdownFirm = ParamUtil.getString(resourceRequest, "indiBreakdownFirm");
	    String indiBreakdownDated = ParamUtil.getString(resourceRequest, "indiBreakdownDated");
	    String indiBreakdownTrusteeName = ParamUtil.getString(resourceRequest, "indiBreakdownTrusteeName");
	    String indiBreakdownTrusteeDate = ParamUtil.getString(resourceRequest, "indiBreakdownTrusteeDate");
	    long osiServicesApplicationId = ParamUtil.getLong(resourceRequest, "osiServicesApplicationId");
	    OsiServicesTrusteeLicenseBreakdowninfo breakdowninfo=null;
	    try {
	    	breakdowninfo=OsiServicesTrusteeLicenseBreakdowninfoLocalServiceUtil.getOsiServicesTrusteeLicenseBreakdowninfoById(osiServicesApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
	    if(breakdowninfo==null) {
	    	breakdowninfo=OsiServicesTrusteeLicenseBreakdowninfoLocalServiceUtil.createOsiServicesTrusteeLicenseBreakdowninfo(CounterLocalServiceUtil.increment());
	    }
	    breakdowninfo.setIndiBreakdownApplicantName(indiBreakdownApplicantName);
	    breakdowninfo.setIndiBreakdownFirm(indiBreakdownFirm);
	    try {
			breakdowninfo.setIndiBreakdownDated(new SimpleDateFormat("yyyy-MM-dd").parse(indiBreakdownDated));
		} catch (ParseException e) {
		}
	    breakdowninfo.setIndiBreakdownTrusteeName(indiBreakdownTrusteeName);
	    try {
			breakdowninfo.setIndiBreakdownTrusteeDate(new SimpleDateFormat("yyyy-MM-dd").parse(indiBreakdownTrusteeDate));
		} catch (ParseException e) {
		}
	    breakdowninfo.setOsiServicesApplicationId(osiServicesApplicationId);
	    OsiServicesTrusteeLicenseBreakdowninfoLocalServiceUtil.updateOsiServicesTrusteeLicenseBreakdowninfo(breakdowninfo);
		return false;
	}

}
