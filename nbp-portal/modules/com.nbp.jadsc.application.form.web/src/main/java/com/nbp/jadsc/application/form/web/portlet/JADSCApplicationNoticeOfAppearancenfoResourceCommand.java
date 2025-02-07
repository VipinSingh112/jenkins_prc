package com.nbp.jadsc.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance;
import com.nbp.jadsc.application.form.service.service.JADSCNoticeOfAppearanceLocalServiceUtil;
import com.nbp.jadsc.application.form.web.constants.JADSCApplicationFormPortletKeys;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + JADSCApplicationFormPortletKeys.JADSCAPPLICATIONFORM,
		"mvc.command.name=set/Notice/Of/Appearence/Info/Url" }, service = MVCResourceCommand.class)
public class JADSCApplicationNoticeOfAppearancenfoResourceCommand implements MVCResourceCommand {
	private static Log _log=LogFactoryUtil.getLog(JADSCApplicationOathForRequestInfoResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("Started");
		String appearanceNoticeFullName = ParamUtil.getString(resourceRequest, "appearanceNoticeFullName");
	    String appearanceNoticeAddressOne = ParamUtil.getString(resourceRequest, "appearanceNoticeAddressOne");
	    String appearanceNoticeDate = ParamUtil.getString(resourceRequest, "appearanceNoticeDate");
	    String appearanceNoticeName = ParamUtil.getString(resourceRequest, "appearanceNoticeName");
	    String appearanceNoticeFirm = ParamUtil.getString(resourceRequest, "appearanceNoticeFirm");
	    String appearanceNoticeAddress = ParamUtil.getString(resourceRequest, "appearanceNoticeAddress");
	    String appearanceNoticeTelephone = ParamUtil.getString(resourceRequest, "appearanceNoticeTelephone");
	    long jadscApplicationId = ParamUtil.getLong(resourceRequest, "jadscApplicationId");
	    JADSCNoticeOfAppearance jadscNoticeOfAppearance=null;
	    try {
	    	jadscNoticeOfAppearance=JADSCNoticeOfAppearanceLocalServiceUtil.getJADSCNoticeOfAppearanceBy_Id(jadscApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
	    if(jadscNoticeOfAppearance==null) {
	    	jadscNoticeOfAppearance=JADSCNoticeOfAppearanceLocalServiceUtil.createJADSCNoticeOfAppearance(CounterLocalServiceUtil.increment());
	    }
	    jadscNoticeOfAppearance.setFullName(appearanceNoticeFullName);
	    jadscNoticeOfAppearance.setAddressOne(appearanceNoticeAddressOne);
	    try {
	    	jadscNoticeOfAppearance.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(appearanceNoticeDate));
		}
		catch(ParseException e){
			e.printStackTrace();
		}
	    jadscNoticeOfAppearance.setName(appearanceNoticeName);
	    jadscNoticeOfAppearance.setFirm(appearanceNoticeFirm);
	    jadscNoticeOfAppearance.setAddress(appearanceNoticeAddress);
	    jadscNoticeOfAppearance.setTelephone(appearanceNoticeTelephone);
	    jadscNoticeOfAppearance.setJadscApplicationId(jadscApplicationId);
	    JADSCNoticeOfAppearanceLocalServiceUtil.updateJADSCNoticeOfAppearance(jadscNoticeOfAppearance);
	    _log.info("End");
		
		return false;
	}

}
