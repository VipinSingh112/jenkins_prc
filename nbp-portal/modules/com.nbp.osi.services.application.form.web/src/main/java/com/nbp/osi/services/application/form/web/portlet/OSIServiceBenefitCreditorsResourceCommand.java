package com.nbp.osi.services.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.osi.services.application.form.service.model.OsiServicesGeneralBenefitOfCreditorsinfo;
import com.nbp.osi.services.application.form.service.service.OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceUtil;
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
			"mvc.command.name=/creditor/name/info"
		},
		service = MVCResourceCommand.class
	)
public class OSIServiceBenefitCreditorsResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
			String creditorName = ParamUtil.getString(resourceRequest, "creditorName");
		    String creditorDate = ParamUtil.getString(resourceRequest, "creditorDate");
		    String creditorAddress = ParamUtil.getString(resourceRequest, "creditorAddress");
		    long osiServicesApplicationId = ParamUtil.getLong(resourceRequest, "osiServicesApplicationId");
		    OsiServicesGeneralBenefitOfCreditorsinfo benefitOfCreditorsinfo=null;
		    try {
		    	 benefitOfCreditorsinfo=OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceUtil.getOsiServicesGeneralBenefitOfCreditorsinfoById(osiServicesApplicationId);
			} catch (Exception e) {
			}
		    
		    if (benefitOfCreditorsinfo==null) {
		    	benefitOfCreditorsinfo=OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceUtil.createOsiServicesGeneralBenefitOfCreditorsinfo(CounterLocalServiceUtil.increment());
			}
		    benefitOfCreditorsinfo.setCreditorName(creditorName);
		    try {
		    	benefitOfCreditorsinfo.setCreditorDate(new SimpleDateFormat("yyyy-MM-dd").parse(creditorDate));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    benefitOfCreditorsinfo.setCreditorAddress(creditorAddress);
		    benefitOfCreditorsinfo.setOsiServicesApplicationId(osiServicesApplicationId);
		    OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceUtil.updateOsiServicesGeneralBenefitOfCreditorsinfo(benefitOfCreditorsinfo);

		return false;
	}

}
