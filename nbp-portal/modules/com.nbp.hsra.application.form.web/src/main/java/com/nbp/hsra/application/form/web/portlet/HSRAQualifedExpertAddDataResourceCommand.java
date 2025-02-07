package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.model.QualifedExpertAdd;
import com.nbp.hsra.application.service.service.QualifedExpertAddLocalServiceUtil;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/qualifed/expert/data" }, service = MVCResourceCommand.class)
public class HSRAQualifedExpertAddDataResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(HSRAQualifedExpertAddDataResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("********calling hsra Add Qualified expert data Resource Command*******");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String qualifedName = ParamUtil.getString(resourceRequest, "qualifedName");
		String qualifedTitle = ParamUtil.getString(resourceRequest, "qualifedTitle");
		String qualifedTelephone = ParamUtil.getString(resourceRequest, "qualifedTelephone");
		String qualifedExt = ParamUtil.getString(resourceRequest, "qualifedExt");
		String qualifedFax = ParamUtil.getString(resourceRequest, "qualifedFax");
		String qualifedEmailAdd = ParamUtil.getString(resourceRequest, "qualifedEmailAdd");
		String qualifedRegistrationNo = ParamUtil.getString(resourceRequest, "qualifedRegistrationNo");
		String qualifedExpirationDate = ParamUtil.getString(resourceRequest, "qualifedExpirationDate");
		String counterOfQualifedExpertDetail = ParamUtil.getString(resourceRequest, "counterOfQualifedExpertDetail");
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		long qualifedExpertDetailId = ParamUtil.getLong(resourceRequest, "qualifedExpertDetailId");
		QualifedExpertAdd expertInfo = null;
		try {
			expertInfo = QualifedExpertAddLocalServiceUtil.getQualifedExpertAdd(qualifedExpertDetailId);
		} catch (PortalException e1) {
		}
		if (Validator.isNull(expertInfo)) {
			expertInfo = QualifedExpertAddLocalServiceUtil.createQualifedExpertAdd(CounterLocalServiceUtil.increment());
			expertInfo.setCounter(counterOfQualifedExpertDetail);
		}
		expertInfo.setQualifedName(qualifedName);
		expertInfo.setQualifedTitle(qualifedTitle);
		expertInfo.setQualifedTelephone(qualifedTelephone);
		expertInfo.setQualifedExt(qualifedExt);
		expertInfo.setQualifedFax(qualifedFax);
		expertInfo.setQualifedEmailAdd(qualifedEmailAdd);
		expertInfo.setQualifedRegistrationNo(qualifedRegistrationNo);
		try {
			if(Validator.isNotNull(qualifedExpirationDate)) {
			expertInfo.setQualifedExpirationDate(new SimpleDateFormat("yyyy-MM-dd").parse(qualifedExpirationDate));
		} }catch (ParseException e) {
		}
		expertInfo.setHsraApplicationId(hsraApplicationId);
		QualifedExpertAddLocalServiceUtil.updateQualifedExpertAdd(expertInfo);
		jsonOBJ.put("qualifiedExpertId", expertInfo.getQualifedExpertAddId());
		jsonOBJ.put("counter", expertInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}
}