package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd;
import com.nbp.ncbj.application.form.service.service.NcbjSectionDetailAddLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;


@Component(immediate = true, property = {
		"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
		"mvc.command.name=/consent/licence/permit/info" 
		},service = MVCResourceCommand.class)

public class NcbjAddConsentLicenceDetailResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(NcbjAddConsentLicenceDetailResourceCommand.class.getName());
	
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("calling CONSENT LICENCE Resource Command");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long ncbjApplicationId = ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		long licenceListDetailId = ParamUtil.getLong(resourceRequest, "licenceListDetailId");
	    String consentsList = ParamUtil.getString(resourceRequest, "consentsList");

		String counter = ParamUtil.getString(resourceRequest, "counter");
		String deleteKey = ParamUtil.getString(resourceRequest, "deleteKey");
		if(deleteKey.contains("deleteApplicant")) {
			try {
				NcbjSectionDetailAddLocalServiceUtil.deleteNcbjSectionDetailAdd(licenceListDetailId);
			} catch (PortalException e) {
			}
		}else {
		NcbjSectionDetailAdd consentDetail = null;
			try {
				consentDetail = NcbjSectionDetailAddLocalServiceUtil.getNcbjSectionDetailAdd(licenceListDetailId);
			} catch (PortalException e) {}
		if(consentDetail==null) {
			consentDetail = NcbjSectionDetailAddLocalServiceUtil.createNcbjSectionDetailAdd(
					CounterLocalServiceUtil.increment());
			consentDetail.setCounter(counter);
		}
        consentDetail.setAddConsentLic(consentsList);
		consentDetail.setNcbjApplicationId(ncbjApplicationId);
		NcbjSectionDetailAddLocalServiceUtil.updateNcbjSectionDetailAdd(consentDetail);
		jsonOBJ.put("licenceListDetailId", consentDetail.getNcbjSectionDetailAddId());
		jsonOBJ.put("counter", counter);
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Has Occured", e);
		 }
		}
		return false;
	}

}
