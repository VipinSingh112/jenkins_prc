package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq;
import com.nbp.janaac.application.form.service.service.AccInsBodiesOtherReqLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/acc/ins/bodies/other/req" }, service = MVCResourceCommand.class)
public class AddAccInsBodiesOtherReqResourceCommand implements MVCResourceCommand {

	private static Log _log = LogFactoryUtil.getLog(AddAccInsBodiesOtherReqResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accreditation inspection bodies other requirement info------ Started]");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String applicationFees = ParamUtil.getString(resourceRequest, "applicationFees");
		String insPaymentMethod = ParamUtil.getString(resourceRequest, "insPaymentMethod");
		String applicantRepName = ParamUtil.getString(resourceRequest, "applicantRepName");
		String applicantRepPosition = ParamUtil.getString(resourceRequest, "applicantRepPosition");
		String signatureDate = ParamUtil.getString(resourceRequest, "signatureDate");
		AccInsBodiesOtherReq application = null;
		try {
			application = AccInsBodiesOtherReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccInsBodiesOtherReqLocalServiceUtil.createAccInsBodiesOtherReq(
					CounterLocalServiceUtil.increment(AddAccInsBodiesOtherReqResourceCommand.class.getName()));
		}
		application.setApplicationFees(applicationFees);
		application.setInsPaymentMethod(insPaymentMethod);
		application.setApplicantRepName(applicantRepName);
		application.setApplicantRepPosition(applicantRepPosition);
		if (Validator.isNotNull(signatureDate)) {
			try {
				application.setSignatureDate(new SimpleDateFormat("yyyy-MM-dd").parse(signatureDate));
			} catch (Exception e) {
			}
		}
		application.setJanaacApplicationId(janaacApplicationId);
		AccInsBodiesOtherReqLocalServiceUtil.updateAccInsBodiesOtherReq(application);
		_log.info("after end first --------");
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
