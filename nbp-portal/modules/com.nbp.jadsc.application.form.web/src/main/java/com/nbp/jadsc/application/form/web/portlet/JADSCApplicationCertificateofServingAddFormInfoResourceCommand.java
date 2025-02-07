package com.nbp.jadsc.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfServiceAddForm;
import com.nbp.jadsc.application.form.service.service.JADSCCertificateOfServiceAddFormLocalServiceUtil;
import com.nbp.jadsc.application.form.web.constants.JADSCApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + JADSCApplicationFormPortletKeys.JADSCAPPLICATIONFORM,
		"mvc.command.name=set/Certification/Of/Service/Add/Form/Info/Url" }, service = MVCResourceCommand.class)
public class JADSCApplicationCertificateofServingAddFormInfoResourceCommand implements MVCResourceCommand {
	private static Log _log=LogFactoryUtil.getLog(JADSCApplicationOathForRequestInfoResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("Started ADD");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		
	    String docServeName = ParamUtil.getString(resourceRequest, "docServeName");
	    String docServeAddress = ParamUtil.getString(resourceRequest, "docServeAddress");
	    String docServeCom = ParamUtil.getString(resourceRequest, "docServeCom");
	    long jadscApplicationId=ParamUtil.getLong(resourceRequest, "jadscApplicationId");
	    long jadscCOSId=ParamUtil.getLong(resourceRequest, "jadscCOSId");
	    String deleteKey = ParamUtil.getString(resourceRequest, "deleteKey");
		String counter = ParamUtil.getString(resourceRequest, "counter");

	    if(deleteKey.contains("deleteApplicant")) {
			try {
				JADSCCertificateOfServiceAddFormLocalServiceUtil.deleteJADSCCertificateOfServiceAddForm(jadscCOSId);
			} catch (PortalException e) {
			}
		}else {
			
			JADSCCertificateOfServiceAddForm certificateOfServiceAddForm=null;
			if (Validator.isNotNull(jadscCOSId)) {
				try {
					certificateOfServiceAddForm = JADSCCertificateOfServiceAddFormLocalServiceUtil.getJADSCCertificateOfServiceAddForm(jadscCOSId);
				} catch (PortalException e) {}
			} else {
	    certificateOfServiceAddForm=JADSCCertificateOfServiceAddFormLocalServiceUtil.
	    		createJADSCCertificateOfServiceAddForm(CounterLocalServiceUtil.increment(JADSCApplicationOathForRequestInfoResourceCommand.class.getName()));
				 certificateOfServiceAddForm.setCounter(counter);
			}
	    certificateOfServiceAddForm.setDocServeName(docServeName);
	    certificateOfServiceAddForm.setDocServeCom(docServeCom);
	    certificateOfServiceAddForm.setDocServeAddress(docServeAddress);
	    certificateOfServiceAddForm.setJadscApplicationId(jadscApplicationId);
	    JADSCCertificateOfServiceAddFormLocalServiceUtil.updateJADSCCertificateOfServiceAddForm(certificateOfServiceAddForm);
	    
	    jsonOBJ.put("jadscCOSId", certificateOfServiceAddForm.getJadscCOSId());
		jsonOBJ.put("counter", counter);
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Has Occured", e);
		}
	    _log.info("End ");
		}
		return false;
	}

}
