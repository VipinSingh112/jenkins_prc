package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.model.GenerateEquipmentInfo;
import com.nbp.hsra.application.service.service.GenerateEquipmentInfoLocalServiceUtil;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/hsra/generatin/equipment" }, service = MVCResourceCommand.class)

public class HsraRadiationNotificationGeneratingEquipmentResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(HsraRadiationNotificationGeneratingEquipmentResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("---------calling generation equipment----------------");
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		String manufacturerEquipment = ParamUtil.getString(resourceRequest, "manufacturerEquipment");
		String equipmentModel = ParamUtil.getString(resourceRequest, "equipmentModel");
		String equipmentSerial = ParamUtil.getString(resourceRequest, "equipmentSerial");
		String operatingPotential = ParamUtil.getString(resourceRequest, "operatingPotential");
		String equipmentModels = ParamUtil.getString(resourceRequest, "equipmentModels");
		String natureEquipment = ParamUtil.getString(resourceRequest, "natureEquipment");
		String equipmentStatusDetail = ParamUtil.getString(resourceRequest, "equipmentStatusDetail");
		String equipmentDate = ParamUtil.getString(resourceRequest, "equipmentDate");

		GenerateEquipmentInfo equipmentData = null;
		try {
			equipmentData = GenerateEquipmentInfoLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(equipmentData)) {
			equipmentData = GenerateEquipmentInfoLocalServiceUtil
					.createGenerateEquipmentInfo(CounterLocalServiceUtil.increment());
		}
		equipmentData.setManufacturerEquipment(manufacturerEquipment);
		equipmentData.setEquipmentModel(equipmentModel);
		equipmentData.setEquipmentSerial(equipmentSerial);
		equipmentData.setOperatingPotential(operatingPotential);
		equipmentData.setEquipmentModels(equipmentModels);
		equipmentData.setNatureEquipment(natureEquipment);
		equipmentData.setEquipmentStatusDetail(equipmentStatusDetail);
		try {
			if (Validator.isNotNull(equipmentDate)) {
				equipmentData.setEquipmentDate(new SimpleDateFormat("yyyy-MM-dd").parse(equipmentDate));
			}
		} catch (Exception e) {
		}
		equipmentData.setHsraApplicationId(hsraApplicationId);
		GenerateEquipmentInfoLocalServiceUtil.updateGenerateEquipmentInfo(equipmentData);
		return false;
	}
}