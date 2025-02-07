package com.nbp.jadsc.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.jadsc.application.form.service.model.JADSCApplication;
import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfVeracity;
import com.nbp.jadsc.application.form.service.service.JADSCApplicationLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCCertificateOfVeracityLocalServiceUtil;
import com.nbp.jadsc.application.form.web.constants.JADSCApplicationFormPortletKeys;
import com.nbp.jadsc.application.form.web.constants.JADSCApplicationWorkFlowConstants;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + JADSCApplicationFormPortletKeys.JADSCAPPLICATIONFORM,
		"mvc.command.name=set/Certification/Of/Veracity/Info/Url" }, service = MVCResourceCommand.class)
public class JADSCApplicationCertificateofVeracityInfoResourceCommand implements MVCResourceCommand {
	private static Log _log=LogFactoryUtil.getLog(JADSCApplicationOathForRequestInfoResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("Started");
	    String veracityComName = ParamUtil.getString(resourceRequest, "veracityComName");
	    String veracityComPosition = ParamUtil.getString(resourceRequest, "veracityComPosition");
	    String veracityComCompany = ParamUtil.getString(resourceRequest, "veracityComCompany");
	    String veracitySignedDate = ParamUtil.getString(resourceRequest, "veracitySignedDate");
	    String veracitySignedTelephone = ParamUtil.getString(resourceRequest, "veracitySignedTelephone");
	    String veracitySignedFax = ParamUtil.getString(resourceRequest, "veracitySignedFax");
	    String veracitySignedAddress = ParamUtil.getString(resourceRequest, "veracitySignedAddress");
	    long jadscApplicationId=ParamUtil.getLong(resourceRequest, "jadscApplicationId");
	    JADSCCertificateOfVeracity certificateOfVeracity=null;
	    try {
	    	certificateOfVeracity=JADSCCertificateOfVeracityLocalServiceUtil.getJADSCBy_Id(jadscApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
	    if(certificateOfVeracity==null) {
	    	certificateOfVeracity=JADSCCertificateOfVeracityLocalServiceUtil.createJADSCCertificateOfVeracity(CounterLocalServiceUtil.increment());
	    }
	    certificateOfVeracity.setVeracityComName(veracityComName);
	    certificateOfVeracity.setVeracityComPosition(veracityComPosition);
	    certificateOfVeracity.setVeracityComCompany(veracityComCompany);
	    try {
	    	certificateOfVeracity.setVeracitySignedDate(new SimpleDateFormat("yyyy-MM-dd").parse(veracitySignedDate));
		}
		catch(ParseException e){
			e.printStackTrace();
		}
	    certificateOfVeracity.setVeracitySignedTelephone(veracitySignedTelephone);
	    certificateOfVeracity.setVeracitySignedFax(veracitySignedFax);
	    certificateOfVeracity.setVeracitySignedAddress(veracitySignedAddress);
	    certificateOfVeracity.setJadscApplicationId(jadscApplicationId);
	    JADSCCertificateOfVeracityLocalServiceUtil.updateJADSCCertificateOfVeracity(certificateOfVeracity);
	    _log.info("ENd");
		return false;
	}

}
