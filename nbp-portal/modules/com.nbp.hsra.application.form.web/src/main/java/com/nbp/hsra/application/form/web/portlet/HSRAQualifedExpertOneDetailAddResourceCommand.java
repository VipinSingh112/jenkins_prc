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
import com.nbp.hsra.application.service.model.QualifedExpertOneAdd;
import com.nbp.hsra.application.service.service.QualifedExpertOneAddLocalServiceUtil;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/qualifed/expert/one/detail" }, service = MVCResourceCommand.class)
public class HSRAQualifedExpertOneDetailAddResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(HSRAQualifedExpertOneDetailAddResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("******calling hsra Add Qualified expert one detail Resource Command*******");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String qualifedOneName = ParamUtil.getString(resourceRequest, "qualifedOneName");
		String qualifedOneTitle = ParamUtil.getString(resourceRequest, "qualifedOneTitle");
		String qualifedOneTelephone = ParamUtil.getString(resourceRequest, "qualifedOneTelephone");
		String qualifedOneExt = ParamUtil.getString(resourceRequest, "qualifedOneExt");
		String qualifedOneFax = ParamUtil.getString(resourceRequest, "qualifedOneFax");
		String qualifedOneEmailAdd = ParamUtil.getString(resourceRequest, "qualifedOneEmailAdd");
		String qualifedOneRegistrationNo = ParamUtil.getString(resourceRequest, "qualifedOneRegistrationNo");
		String qualifedOneExpirationDate = ParamUtil.getString(resourceRequest, "qualifedOneExpirationDate");
		String counterOfQualifedExpertOneDetail = ParamUtil.getString(resourceRequest,
				"counterOfQualifedExpertOneDetail");
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		long qualifedExpertOneDetailId = ParamUtil.getLong(resourceRequest, "qualifedExpertOneDetailId");

		QualifedExpertOneAdd expertOneInfo = null;
		try {
			expertOneInfo = QualifedExpertOneAddLocalServiceUtil.getQualifedExpertOneAdd(qualifedExpertOneDetailId);
		} catch (PortalException e1) {
		}
		if (Validator.isNull(expertOneInfo)) {
			expertOneInfo = QualifedExpertOneAddLocalServiceUtil
					.createQualifedExpertOneAdd(CounterLocalServiceUtil.increment());
			expertOneInfo.setCounter(counterOfQualifedExpertOneDetail);
		}
		expertOneInfo.setQualifedOneName(qualifedOneName);
		expertOneInfo.setQualifedOneTitle(qualifedOneTitle);
		expertOneInfo.setQualifedOneTelephone(qualifedOneTelephone);
		expertOneInfo.setQualifedOneExt(qualifedOneExt);
		expertOneInfo.setQualifedOneFax(qualifedOneFax);
		expertOneInfo.setQualifedOneEmailAdd(qualifedOneEmailAdd);
		expertOneInfo.setQualifedOneRegistrationNo(qualifedOneRegistrationNo);
		try {
			if (Validator.isNotNull(expertOneInfo)) {
				expertOneInfo.setQualifedOneExpirationDate(
						new SimpleDateFormat("yyyy-MM-dd").parse(qualifedOneExpirationDate));
			}
		} catch (java.text.ParseException e) {
			e.printStackTrace();
		}
		expertOneInfo.setHsraApplicationId(hsraApplicationId);
		QualifedExpertOneAddLocalServiceUtil.updateQualifedExpertOneAdd(expertOneInfo);
		jsonOBJ.put("qualifedExpertOneId", expertOneInfo.getQualifedExpertOneAddId());
		jsonOBJ.put("counter", expertOneInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}
}