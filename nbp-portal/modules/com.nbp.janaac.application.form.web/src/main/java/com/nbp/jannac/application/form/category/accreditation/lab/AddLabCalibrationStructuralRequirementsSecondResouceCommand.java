package com.nbp.jannac.application.form.category.accreditation.lab;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AddLabCalibraStrucReqSec;
import com.nbp.janaac.application.form.service.service.AddLabCalibraStrucReqSecLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=add/lab/cal/struct/requ/sec" }, service = MVCResourceCommand.class)
public class AddLabCalibrationStructuralRequirementsSecondResouceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(AddLabCalibrationStructuralRequirementsSecondResouceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------inside AddLabCalibrationStructuralRequirementsSecondResouceCommand started-------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String numCalibration = ParamUtil.getString(resourceRequest, "numCalibration");
		String qualificationCalibration = ParamUtil.getString(resourceRequest, "qualificationCalibration");
		String itemCalibration = ParamUtil.getString(resourceRequest, "itemCalibration");
		String rangeCalibration = ParamUtil.getString(resourceRequest, "rangeCalibration");
		String measurementProcedureCalibration = ParamUtil.getString(resourceRequest,
				"measurementProcedureCalibration");
		String measurementCalibration = ParamUtil.getString(resourceRequest, "measurementCalibration");
		String remarksCalibration = ParamUtil.getString(resourceRequest, "remarksCalibration");
		String counterOfScopeforCalibration = ParamUtil.getString(resourceRequest, "counterOfScopeforCalibration");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		long scopeForCalibrationsId = ParamUtil.getLong(resourceRequest, "scopeForCalibrationsId");
		AddLabCalibraStrucReqSec labCaliStrucInfo = null;
		try {
			labCaliStrucInfo = AddLabCalibraStrucReqSecLocalServiceUtil
					.getAddLabCalibraStrucReqSec(scopeForCalibrationsId);
		} catch (PortalException e1) {
		}
		if (Validator.isNull(labCaliStrucInfo)) {
			labCaliStrucInfo = AddLabCalibraStrucReqSecLocalServiceUtil
					.createAddLabCalibraStrucReqSec(CounterLocalServiceUtil.increment());
			labCaliStrucInfo.setCounter(counterOfScopeforCalibration);
		}
		labCaliStrucInfo.setNumber(numCalibration);
		labCaliStrucInfo.setMeasuredQuantity(qualificationCalibration);
		labCaliStrucInfo.setCalibrationItem(itemCalibration);
		labCaliStrucInfo.setRange(rangeCalibration);
		labCaliStrucInfo.setMeasurementProcedure(measurementProcedureCalibration);
		labCaliStrucInfo.setCalibration(measurementCalibration);
		labCaliStrucInfo.setRemarks(remarksCalibration);
		labCaliStrucInfo.setJanaacApplicationId(janaacApplicationId);
		AddLabCalibraStrucReqSecLocalServiceUtil.updateAddLabCalibraStrucReqSec(labCaliStrucInfo);
		jsonOBJ.put("scopeForCalibrationsId", labCaliStrucInfo.getAddLabCalibraStrucReqSecId());
		jsonOBJ.put("counter", labCaliStrucInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}

}
