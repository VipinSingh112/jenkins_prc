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
import com.nbp.hsra.application.service.model.QualityDeclarationInfo;
import com.nbp.hsra.application.service.service.QualityDeclarationInfoLocalServiceUtil;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/hsra/quality/declaration" }, service = MVCResourceCommand.class)

public class HsraQualityExpertsDeclarationResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(HsraQualityExpertsDeclarationResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("calling QUALITY DECLARATION Resouce command*******");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		String declarationSignDate = ParamUtil.getString(resourceRequest, "declarationSignDate");

		QualityDeclarationInfo qualityDeclare = null;
		try {
			qualityDeclare = QualityDeclarationInfoLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(qualityDeclare)) {
			qualityDeclare = QualityDeclarationInfoLocalServiceUtil
					.createQualityDeclarationInfo(CounterLocalServiceUtil.increment());
		}
		try {
			if (Validator.isNotNull(declarationSignDate)) {
				qualityDeclare.setDeclarationSignDate(new SimpleDateFormat("yyyy-MM-dd").parse(declarationSignDate));
			}
		} catch (Exception e) {
		}
		qualityDeclare.setHsraApplicationId(hsraApplicationId);
		QualityDeclarationInfoLocalServiceUtil.updateQualityDeclarationInfo(qualityDeclare);
		jsonOBJ.put("hsraApplicationId", qualityDeclare.getHsraApplicationId());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}
}
