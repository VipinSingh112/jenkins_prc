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
import com.nbp.hsra.application.service.model.GenEquipmentData;
import com.nbp.hsra.application.service.service.GenEquipmentDataLocalServiceUtil;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/gen/equipment/data" }, service = MVCResourceCommand.class)
public class HSRAGeneratingEquipmentAddDetailResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(HSRAGeneratingEquipmentAddDetailResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("******calling hsra Add unsealed sources Resource Command*******");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String manufacturerEquipment = ParamUtil.getString(resourceRequest, "manufacturerEquipment");
		String equipmentModel = ParamUtil.getString(resourceRequest, "equipmentModel");
		String equipmentSerial = ParamUtil.getString(resourceRequest, "equipmentSerial");
		String operatingPotential = ParamUtil.getString(resourceRequest, "operatingPotential");
		String natureEquipment = ParamUtil.getString(resourceRequest, "natureEquipment");
		String radiationGeneratingLoc = ParamUtil.getString(resourceRequest, "radiationGeneratingLoc");
		String equipmentModels = ParamUtil.getString(resourceRequest, "equipmentModels");
		String equipmentStatusDetail = ParamUtil.getString(resourceRequest, "equipmentStatusDetail");
		String equipmentDate = ParamUtil.getString(resourceRequest, "equipmentDate");
		String counterOfEquipmentDetail = ParamUtil.getString(resourceRequest, "counterOfEquipmentDetail");
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		long genEquipmentDetailId = ParamUtil.getLong(resourceRequest, "genEquipmentDetailId");
		GenEquipmentData genEquipInfo = null;
		try {
		try {
			genEquipInfo = GenEquipmentDataLocalServiceUtil.getGenEquipmentData(genEquipmentDetailId);
		} catch (PortalException e1) {
		}
		if (Validator.isNull(genEquipInfo)) {
			genEquipInfo = GenEquipmentDataLocalServiceUtil.createGenEquipmentData(CounterLocalServiceUtil.increment());
			genEquipInfo.setCounter(counterOfEquipmentDetail);
		}
		genEquipInfo.setManufacturerEquipment(manufacturerEquipment);
		genEquipInfo.setEquipmentModel(equipmentModel);
		genEquipInfo.setEquipmentSerial(equipmentSerial);
		genEquipInfo.setOperatingPotential(operatingPotential);
		genEquipInfo.setNatureEquipment(natureEquipment);
		genEquipInfo.setRadiationGeneratingLoc(radiationGeneratingLoc);
		genEquipInfo.setEquipmentModels(equipmentModels);
		genEquipInfo.setEquipmentStatusDetail(equipmentStatusDetail);
		try {
			if (Validator.isNotNull(equipmentDate)) {
				genEquipInfo.setEquipmentDate(new SimpleDateFormat("yyyy-MM-dd").parse(equipmentDate));
			}
		} catch (ParseException e1) {
		}
		genEquipInfo.setHsraApplicationId(hsraApplicationId);
		GenEquipmentDataLocalServiceUtil.updateGenEquipmentData(genEquipInfo);
		jsonOBJ.put("equipmentDetailId", genEquipInfo.getGenEquipmentDataId());
		jsonOBJ.put("counter", genEquipInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		}catch (Exception e) {
e.printStackTrace();
e.getCause();
		}
		return false;
	}
}