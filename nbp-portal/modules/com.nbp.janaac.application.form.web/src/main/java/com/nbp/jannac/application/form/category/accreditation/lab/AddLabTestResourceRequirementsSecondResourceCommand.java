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
import com.nbp.janaac.application.form.service.model.AddLabResourceReqSec;
import com.nbp.janaac.application.form.service.service.AddLabResourceReqSecLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=add/lab/resource/req/sec" }, service = MVCResourceCommand.class)
public class AddLabTestResourceRequirementsSecondResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddLabTestResourceRequirementsSecondResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------inside AddLabTestResourceRequirementsSecondResourceCommand started-------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String inventoryNumber = ParamUtil.getString(resourceRequest, "inventoryNumber");
		String item = ParamUtil.getString(resourceRequest, "item");
		String manufacturerCalibration = ParamUtil.getString(resourceRequest, "manufacturerCalibration");
		String modelCalibration = ParamUtil.getString(resourceRequest, "modelCalibration");
		String calibrationIntervalCalibration = ParamUtil.getString(resourceRequest, "calibrationIntervalCalibration");
		String calibratedByCalibration = ParamUtil.getString(resourceRequest, "calibratedByCalibration");
		String counterOfMajorEquipmentCallibration = ParamUtil.getString(resourceRequest, "counterOfMajorEquipmentCallibration");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		long uniqueId = ParamUtil.getLong(resourceRequest, "uniqueId");
		
		AddLabResourceReqSec labResourceReqSecInfo=null;
		try {
			labResourceReqSecInfo = AddLabResourceReqSecLocalServiceUtil.getAddLabResourceReqSec(uniqueId);
		} catch (PortalException e1) {
		}
		if (Validator.isNull(labResourceReqSecInfo)) {
			labResourceReqSecInfo = AddLabResourceReqSecLocalServiceUtil.createAddLabResourceReqSec(CounterLocalServiceUtil.increment());
			labResourceReqSecInfo.setCounter(counterOfMajorEquipmentCallibration);
		}
		labResourceReqSecInfo.setInventoryNumber(inventoryNumber);
		labResourceReqSecInfo.setItem(item);
		labResourceReqSecInfo.setManufacturer(manufacturerCalibration);
		labResourceReqSecInfo.setModelNumber(modelCalibration);
		labResourceReqSecInfo.setCalibrationInterval(calibrationIntervalCalibration);
		labResourceReqSecInfo.setCalibratedBy(calibratedByCalibration);
		labResourceReqSecInfo.setJanaacApplicationId(janaacApplicationId);
		AddLabResourceReqSecLocalServiceUtil.updateAddLabResourceReqSec(labResourceReqSecInfo);
		jsonOBJ.put("uniqueId", labResourceReqSecInfo.getAddLabResourceReqSecId());
		jsonOBJ.put("counter", labResourceReqSecInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}

}