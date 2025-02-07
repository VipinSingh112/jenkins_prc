package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.model.RadiationSafetyLowRisk;
import com.nbp.hsra.application.service.service.RadiationSafetyLowRiskLocalServiceUtil;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/hsra/radiation/safety/low/risk" }, service = MVCResourceCommand.class)

public class HsraRadiationSafetyLowRiskProgramResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		System.out.println("Radiation Safety low Risk Program******");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		String appendixRsoName = ParamUtil.getString(resourceRequest, "appendixRsoName");
		String appendixRsoTitle = ParamUtil.getString(resourceRequest, "appendixRsoTitle");
		String appendixRsoTeleNo = ParamUtil.getString(resourceRequest, "appendixRsoTeleNo");
		String appendixRsoExt = ParamUtil.getString(resourceRequest, "appendixRsoExt");
		String appendixRsoFax = ParamUtil.getString(resourceRequest, "appendixRsoFax");
		String appendixRsoEmail = ParamUtil.getString(resourceRequest, "appendixRsoEmail");
		String appendixRsoDetails = ParamUtil.getString(resourceRequest, "appendixRsoDetails");
		String qualifiedAppendixName = ParamUtil.getString(resourceRequest, "qualifiedAppendixName");
		String qualifiedAppendixTitle = ParamUtil.getString(resourceRequest, "qualifiedAppendixTitle");
		String qualifiedAppendixTele = ParamUtil.getString(resourceRequest, "qualifiedAppendixTele");
		String qualifiedAppendixExt = ParamUtil.getString(resourceRequest, "qualifiedAppendixExt");
		String qualifiedAppendixFax = ParamUtil.getString(resourceRequest, "qualifiedAppendixFax");
		String qualifiedAppendixEmail = ParamUtil.getString(resourceRequest, "qualifiedAppendixEmail");
		String qualifiedAppendixRegistrationNo = ParamUtil.getString(resourceRequest,
				"qualifiedAppendixRegistrationNo");
		String qualifiedAppendixDate = ParamUtil.getString(resourceRequest, "qualifiedAppendixDate");
		String qualifiedAppendixDetails = ParamUtil.getString(resourceRequest, "qualifiedAppendixDetails");
		String monitoringExposure = ParamUtil.getString(resourceRequest, "monitoringExposure");
		String recordSystem = ParamUtil.getString(resourceRequest, "recordSystem");
		String securityAccess = ParamUtil.getString(resourceRequest, "securityAccess");
		String trainingInformation = ParamUtil.getString(resourceRequest, "trainingInformation");
		String leakTesting = ParamUtil.getString(resourceRequest, "leakTesting");
		String emergencyProcedures = ParamUtil.getString(resourceRequest, "emergencyProcedures");
		String managementSourcesDis = ParamUtil.getString(resourceRequest, "managementSourcesDis");

		RadiationSafetyLowRisk lowRiskSafety = null;
		try {
			lowRiskSafety = RadiationSafetyLowRiskLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {
		}
		if (lowRiskSafety == null) {
			lowRiskSafety = RadiationSafetyLowRiskLocalServiceUtil
					.createRadiationSafetyLowRisk(CounterLocalServiceUtil.increment());
		}
		lowRiskSafety.setAppendixRsoName(appendixRsoName);
		lowRiskSafety.setAppendixRsoTitle(appendixRsoTitle);
		lowRiskSafety.setAppendixRsoTeleNo(appendixRsoTeleNo);
		lowRiskSafety.setAppendixRsoExt(appendixRsoExt);
		lowRiskSafety.setAppendixRsoFax(appendixRsoFax);
		lowRiskSafety.setAppendixRsoEmail(appendixRsoEmail);
		lowRiskSafety.setAppendixRsoDetails(appendixRsoDetails);
		lowRiskSafety.setQualifiedAppendixName(qualifiedAppendixName);
		lowRiskSafety.setQualifiedAppendixTitle(qualifiedAppendixTitle);
		lowRiskSafety.setQualifiedAppendixTele(qualifiedAppendixTele);
		lowRiskSafety.setQualifiedAppendixExt(qualifiedAppendixExt);
		lowRiskSafety.setQualifiedAppendixFax(qualifiedAppendixFax);
		lowRiskSafety.setQualifiedAppendixEmail(qualifiedAppendixEmail);
		lowRiskSafety.setQualifiedAppendixRegstNo(qualifiedAppendixRegistrationNo);

		try {
			if (Validator.isNotNull(qualifiedAppendixDate)) {
				lowRiskSafety
						.setQualifiedAppendixDate(new SimpleDateFormat("yyyy-MM-dd").parse(qualifiedAppendixDate));
			}
		} catch (Exception e) {
		}
		lowRiskSafety.setQualifiedAppendixDetails(qualifiedAppendixDetails);
		lowRiskSafety.setMonitoringExposure(monitoringExposure);
		lowRiskSafety.setRecordSystem(recordSystem);
		lowRiskSafety.setSecurityAccess(securityAccess);
		lowRiskSafety.setTrainingInformation(trainingInformation);
		lowRiskSafety.setLeakTesting(leakTesting);
		lowRiskSafety.setEmergencyProcedures(emergencyProcedures);
		lowRiskSafety.setManagementSourcesDis(managementSourcesDis);
		lowRiskSafety.setHsraApplicationId(hsraApplicationId);
		RadiationSafetyLowRiskLocalServiceUtil.updateRadiationSafetyLowRisk(lowRiskSafety);
		jsonOBJ.put("hsraApplicationId", lowRiskSafety.getHsraApplicationId());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		// TODO Auto-generated method stub
		return false;
	}

}
