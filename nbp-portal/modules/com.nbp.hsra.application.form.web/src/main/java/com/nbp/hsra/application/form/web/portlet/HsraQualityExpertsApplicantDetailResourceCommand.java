package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.model.QualityApplicantDetail;
import com.nbp.hsra.application.service.service.QualityApplicantDetailLocalServiceUtil;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/hsra/quality/expert/details" }, service = MVCResourceCommand.class)

public class HsraQualityExpertsApplicantDetailResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(HsraQualityExpertsApplicantDetailResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("calling hsra Qiality Experts Resouce command*******");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		String expertSurname = ParamUtil.getString(resourceRequest, "expertSurname");
		String expertFirstName = ParamUtil.getString(resourceRequest, "expertFirstName");
		String expertId = ParamUtil.getString(resourceRequest, "expertId");
		String expertPosition = ParamUtil.getString(resourceRequest, "expertPosition");
		String expertTelephone = ParamUtil.getString(resourceRequest, "expertTelephone");
		String expertMobile = ParamUtil.getString(resourceRequest, "expertMobile");
		String expertEmail = ParamUtil.getString(resourceRequest, "expertEmail");
		String expertDate = ParamUtil.getString(resourceRequest, "expertDate");

		QualityApplicantDetail qualityApplicant = null;
		try {
			qualityApplicant = QualityApplicantDetailLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(qualityApplicant)) {
			qualityApplicant = QualityApplicantDetailLocalServiceUtil
					.createQualityApplicantDetail(CounterLocalServiceUtil.increment());
		}
		qualityApplicant.setExpertSurname(expertSurname);
		qualityApplicant.setExpertFirstName(expertFirstName);
		qualityApplicant.setExpertId(expertId);
		qualityApplicant.setExpertPosition(expertPosition);
		qualityApplicant.setExpertTelephone(expertTelephone);
		qualityApplicant.setExpertMobile(expertMobile);
		qualityApplicant.setExpertEmail(expertEmail);
		try {
			if (Validator.isNotNull(expertDate)) {
				qualityApplicant.setExpertDate(new SimpleDateFormat("yyyy-MM-dd").parse(expertDate));
			}
		} catch (Exception e) {
		}
		qualityApplicant.setHsraApplicationId(hsraApplicationId);
		QualityApplicantDetailLocalServiceUtil.updateQualityApplicantDetail(qualityApplicant);
		jsonOBJ.put("hsraApplicationId", qualityApplicant.getHsraApplicationId());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}

}
