package com.nbp.jannac.application.form.category.accreditation.lab;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalFirst;
import com.nbp.janaac.application.form.service.service.AddLabMedicalPhysicalFirstLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/add/major/equipement/detaiil/data" }, service = MVCResourceCommand.class)
public class AddLabMedicalPhysicalFirstResourceCommand  implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(AddLabMedicalPhysicalFirstResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------inside add lab AddLabMedicalPhysicalFirstResourceCommand resouce command-------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();

		String inventory = ParamUtil.getString(resourceRequest, "inventory");
		String item = ParamUtil.getString(resourceRequest, "item");
		String manufacturer = ParamUtil.getString(resourceRequest, "manufacturer");
		String model = ParamUtil.getString(resourceRequest, "model");
		String calibrationInterval = ParamUtil.getString(resourceRequest, "calibrationInterval");
		String calibratedBy = ParamUtil.getString(resourceRequest, "calibratedBy");
		long majorEquipmentId = ParamUtil.getLong(resourceRequest, "majorEquipmentId");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String counterOfMajorEquipment = ParamUtil.getString(resourceRequest, "counterOfMajorEquipment");
		
		
		AddLabMedicalPhysicalFirst physicalFirstInfo=null;
		try {
			physicalFirstInfo = AddLabMedicalPhysicalFirstLocalServiceUtil.getAddLabMedicalPhysicalFirst(majorEquipmentId);
		} catch (Exception e) {
		}
		if (Validator.isNull(physicalFirstInfo)) {
			physicalFirstInfo = AddLabMedicalPhysicalFirstLocalServiceUtil.createAddLabMedicalPhysicalFirst(CounterLocalServiceUtil.increment());
					physicalFirstInfo.setCounter(counterOfMajorEquipment);
		}
		physicalFirstInfo.setInventoryNum(inventory);
		physicalFirstInfo.setItem(item);
		physicalFirstInfo.setManufacturer(manufacturer);
		physicalFirstInfo.setModelNum(model);
		physicalFirstInfo.setCalibrationInterval(calibrationInterval);
		physicalFirstInfo.setCalibratedBy(calibratedBy);
		physicalFirstInfo.setJanaacApplicationId(janaacApplicationId);

		AddLabMedicalPhysicalFirstLocalServiceUtil.updateAddLabMedicalPhysicalFirst(physicalFirstInfo);
		jsonOBJ.put("examinationsScopeId", physicalFirstInfo.getAddLabMedicalPhysicalFirstId());
		jsonOBJ.put("counter", physicalFirstInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}

		return false;
	}
}