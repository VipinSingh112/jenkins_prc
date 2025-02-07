package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccMediLabOtherReq;
import com.nbp.janaac.application.form.service.service.AccMediLabOtherReqLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/acc/medical/other/req/info" }, service = MVCResourceCommand.class)
public class AddAccMediLabOtherReqResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(AddAccMediLabOtherReqResourceCommand.class.getName());
	

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accreditation medical laboratory other requirement info------ Started]");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String paymentMethod=ParamUtil.getString(resourceRequest, "paymentMethod");
		String representativeName=ParamUtil.getString(resourceRequest, "representativeName");
		String representativePosition=ParamUtil.getString(resourceRequest, "representativePosition");
		String signDate=ParamUtil.getString(resourceRequest, "signDate");
		AccMediLabOtherReq application=null;
		try {
			application = AccMediLabOtherReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccMediLabOtherReqLocalServiceUtil.createAccMediLabOtherReq(CounterLocalServiceUtil.increment(AddAccMediLabOtherReqResourceCommand.class.getName()));
		}
		application.setPaymentMethod(paymentMethod);
		application.setRepresentativeName(representativeName);
		application.setRepresentativePos(representativePosition);
		if (Validator.isNotNull(signDate)) {
			try {
				application.setSignDate(new SimpleDateFormat("yyyy-MM-dd").parse(signDate));
			} catch (Exception e) {
			}
		}
		application.setJanaacApplicationId(janaacApplicationId);
		AccMediLabOtherReqLocalServiceUtil.updateAccMediLabOtherReq(application);
		jsonOBJ.put("janaacApplicationId", application.getJanaacApplicationId());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
			return false;
	}

}
