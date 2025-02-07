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
import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfService;
import com.nbp.jadsc.application.form.service.service.JADSCApplicationLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCCertificateOfServiceLocalServiceUtil;
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
		"mvc.command.name=set/Certificate/Of/Service/Info/Url" }, service = MVCResourceCommand.class)
public class JADSCApplicationCertificateofServingInfoResourceCommand implements MVCResourceCommand {
	private static Log _log=LogFactoryUtil.getLog(JADSCApplicationOathForRequestInfoResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("Started");
		String docSubmitDate = ParamUtil.getString(resourceRequest, "docSubmitDate");
		String signatoryName = ParamUtil.getString(resourceRequest, "signatoryName");
		String signatoryDate = ParamUtil.getString(resourceRequest, "signatoryDate");
		String signatoryTelephone = ParamUtil.getString(resourceRequest, "signatoryTelephone");
		String signatoryFax = ParamUtil.getString(resourceRequest, "signatoryFax");
		long jadscApplicationId = ParamUtil.getLong(resourceRequest, "jadscApplicationId");
		JADSCCertificateOfService certificateOfService = null;
		try {
			certificateOfService = JADSCCertificateOfServiceLocalServiceUtil.getJADSCBy_Id(jadscApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (certificateOfService == null) {
			certificateOfService = JADSCCertificateOfServiceLocalServiceUtil
					.createJADSCCertificateOfService(CounterLocalServiceUtil.increment());
		}
		try {
			if(Validator.isNotNull("docSubmitDate")){
			certificateOfService.setDocSubmitDate(new SimpleDateFormat("yyyy-MM-dd").parse(docSubmitDate));
		}}
		catch(ParseException e){
			e.printStackTrace();
		}
		certificateOfService.setSignatoryName(signatoryName);
		try {
			if(Validator.isNotNull("signatoryDate"))
			certificateOfService.setSignatoryDate(new SimpleDateFormat("yyyy-MM-dd").parse(signatoryDate));
		} catch (ParseException e) {
		}
		certificateOfService.setSignatoryTelephone(signatoryTelephone);
		certificateOfService.setSignatoryFax(signatoryFax);
		certificateOfService.setJadscApplicationId(jadscApplicationId);
		JADSCCertificateOfServiceLocalServiceUtil.updateJADSCCertificateOfService(certificateOfService);
		_log.info("End");
		return false;
	}

}
