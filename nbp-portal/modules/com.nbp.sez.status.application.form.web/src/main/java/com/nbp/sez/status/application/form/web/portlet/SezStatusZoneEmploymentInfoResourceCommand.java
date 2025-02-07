package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo;
import com.nbp.sez.status.application.form.service.service.SezZoneEmployInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/zone/employment" }, service = MVCResourceCommand.class)
public class SezStatusZoneEmploymentInfoResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(SezStatusZoneEmploymentInfoResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String labourRequirementYear = ParamUtil.getString(resourceRequest, "zoneUserLabourYear");
		String labourRequirementDirect = ParamUtil.getString(resourceRequest, "zoneUserLabourDirect");
		String labourRequirementMale = ParamUtil.getString(resourceRequest, "zoneUserLabourMale");
		String labourRequirementFemale = ParamUtil.getString(resourceRequest, "zoneUserLabourFemale");
		String labourRequirementLocal = ParamUtil.getString(resourceRequest, "zoneUserLabourLocal");
		String labourRequirementForeign = ParamUtil.getString(resourceRequest, "zoneUserLabourForeign");
		String counter = ParamUtil.getString(resourceRequest, "counter");
		long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		long sezZoneEmpInfoId = ParamUtil.getLong(resourceRequest, "sezZoneEmpInfoId");
		SezZoneEmployInfo sezZoneEmpInfo = null;
		if (Validator.isNotNull(sezZoneEmpInfoId)) {
			try {
				sezZoneEmpInfo = SezZoneEmployInfoLocalServiceUtil.getSezZoneEmployInfo(sezZoneEmpInfoId);
			} catch (PortalException e) {
			}
		} else {
			sezZoneEmpInfo = SezZoneEmployInfoLocalServiceUtil
					.createSezZoneEmployInfo(CounterLocalServiceUtil.increment());
			sezZoneEmpInfo.setCounter(counter);
		}

		sezZoneEmpInfo.setLabourRequirementYear(labourRequirementYear);
		sezZoneEmpInfo.setLabourRequirementDirect(labourRequirementDirect);
		sezZoneEmpInfo.setLabourRequirementMale(labourRequirementMale);
		sezZoneEmpInfo.setLabourRequirementFemale(labourRequirementFemale);
		sezZoneEmpInfo.setLabourRequirementLocal(labourRequirementLocal);
		sezZoneEmpInfo.setLabourRequirementForeign(labourRequirementForeign);
		sezZoneEmpInfo.setSezStatusApplicationId(sezStatusApplicationId);
		SezZoneEmployInfoLocalServiceUtil.updateSezZoneEmployInfo(sezZoneEmpInfo);
		jsonOBJ.put("sezZoneEmpIoyeenfoId", sezZoneEmpInfo.getSezZoneEmpInfoId());
		jsonOBJ.put("counter", counter);
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (Exception e) {
			_log.error("An Error Occured", e);
		}
		return false;
	}
}
