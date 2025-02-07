package com.nbp.osi.services.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesInsolventPersoninfoException;
import com.nbp.osi.services.application.form.service.model.OsiServicesInsolventPersoninfo;
import com.nbp.osi.services.application.form.service.service.OsiServicesInsolventPersoninfoLocalServiceUtil;
import com.nbp.osi.services.application.form.web.constants.OSIServicesApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + OSIServicesApplicationFormPortletKeys.OSISERVICESAPPLICATIONFORM,
			"mvc.command.name=/insolvent/person/Detail/Info"
		},
		service = MVCResourceCommand.class
	)
public class OSIServiceInsolventPersonResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		 	String insolventPersonNature = ParamUtil.getString(resourceRequest, "insolventPersonNature");
		    String insolventIndiFirstName = ParamUtil.getString(resourceRequest, "insolventIndiFirstName");
		    String insolventIndiLastName = ParamUtil.getString(resourceRequest, "insolventIndiLastName");
		    String insolventCompanyName = ParamUtil.getString(resourceRequest, "insolventCompanyName");
		    String insolventAddress = ParamUtil.getString(resourceRequest, "insolventAddress");
		    String insolventParish = ParamUtil.getString(resourceRequest, "insolventParish");
		    String insolventEmailAddress = ParamUtil.getString(resourceRequest, "insolventEmailAddress");
		    String insolventTelephone = ParamUtil.getString(resourceRequest, "insolventTelephone");
		    String insolventTrnNumber = ParamUtil.getString(resourceRequest, "insolventTrnNumber");
		    long osiServicesApplicationId = ParamUtil.getLong(resourceRequest, "osiServicesApplicationId");
		    OsiServicesInsolventPersoninfo insolventPersoninfo=null;
		    try {
		    	insolventPersoninfo=OsiServicesInsolventPersoninfoLocalServiceUtil.getOsiServicesInsolventPersoninfoById(osiServicesApplicationId);
			} catch (NoSuchOsiServicesInsolventPersoninfoException e) {
			}
		    if(insolventPersoninfo==null) {
		    	insolventPersoninfo=  OsiServicesInsolventPersoninfoLocalServiceUtil.createOsiServicesInsolventPersoninfo(CounterLocalServiceUtil.increment());
		    }
		    insolventPersoninfo.setInsolventPersonNature(insolventPersonNature);
		    insolventPersoninfo.setInsolventIndiFirstName(insolventIndiFirstName);
		    insolventPersoninfo.setInsolventIndiLastName(insolventIndiLastName);
		    insolventPersoninfo.setInsolventCompanyName(insolventCompanyName);
		    insolventPersoninfo.setInsolventAddress(insolventAddress);
		    insolventPersoninfo.setInsolventEmailAddress(insolventEmailAddress);
		    insolventPersoninfo.setInsolventTelephone(insolventTelephone);
		    insolventPersoninfo.setInsolventParish(insolventParish);
		    //insolventPersoninfo.setInsolventApplicationDate(insolventApplicationDate);
		    insolventPersoninfo.setInsolventTrnNumber(insolventTrnNumber);
		    insolventPersoninfo.setOsiServicesApplicationId(osiServicesApplicationId);
		    OsiServicesInsolventPersoninfoLocalServiceUtil.updateOsiServicesInsolventPersoninfo(insolventPersoninfo);
		return false;
	}

}
