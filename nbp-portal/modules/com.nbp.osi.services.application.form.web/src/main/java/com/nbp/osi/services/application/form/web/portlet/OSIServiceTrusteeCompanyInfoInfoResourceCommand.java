package com.nbp.osi.services.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesTrusteeCompanyinfoException;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeCompanyinfo;
import com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeCompanyinfoLocalServiceUtil;
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
			"mvc.command.name=/company/Details/Info/Url"
		},
		service = MVCResourceCommand.class
	)
public class OSIServiceTrusteeCompanyInfoInfoResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String comCorporationName = ParamUtil.getString(resourceRequest, "comCorporationName");
	    String comHeadOfficeAddress = ParamUtil.getString(resourceRequest, "comHeadOfficeAddress");
	    String comTeleNo = ParamUtil.getString(resourceRequest, "comTeleNo");
	    String comFaxNo = ParamUtil.getString(resourceRequest, "comFaxNo");
	    String comEmail = ParamUtil.getString(resourceRequest, "comEmail");
	    String otherCountry = ParamUtil.getString(resourceRequest, "otherCountry");
	    String comIncorporationDate = ParamUtil.getString(resourceRequest, "comIncorporationDate");
	    String comLicenceRequest = ParamUtil.getString(resourceRequest, "comLicenceRequest");
	    long osiServicesApplicationId = ParamUtil.getLong(resourceRequest, "osiServicesApplicationId");
	    
	    OsiServicesTrusteeCompanyinfo companyinfo=null;
	    try {
	    	companyinfo=	OsiServicesTrusteeCompanyinfoLocalServiceUtil.getOsiServicesTrusteeCompanyinfoById(osiServicesApplicationId);
		} catch (NoSuchOsiServicesTrusteeCompanyinfoException e) {
		}
	    if(companyinfo==null) {
	    	companyinfo=	OsiServicesTrusteeCompanyinfoLocalServiceUtil.createOsiServicesTrusteeCompanyinfo(CounterLocalServiceUtil.increment());
	    }
	    companyinfo.setComCorporationName(comCorporationName);
	    companyinfo.setComHeadOfficeAddress(comHeadOfficeAddress);
	    companyinfo.setComTeleNo(comTeleNo);
	    companyinfo.setComFaxNo(comFaxNo);
	    companyinfo.setComEmail(comEmail);
	    companyinfo.setOtherCountry(otherCountry);
	    try {
			companyinfo.setComIncorporationDate(new SimpleDateFormat("yyyy-MM-dd").parse(comIncorporationDate));
		} catch (ParseException e) {
		}
	    companyinfo.setComLicenceRequest(comLicenceRequest);
	    companyinfo.setOsiServicesApplicationId(osiServicesApplicationId);
	    OsiServicesTrusteeCompanyinfoLocalServiceUtil.updateOsiServicesTrusteeCompanyinfo(companyinfo);

		return false;
	}

}
