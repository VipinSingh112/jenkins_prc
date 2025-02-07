package com.nbp.jannac.application.form.category.inspection.bodies;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AddPhyResourceFirst;
import com.nbp.janaac.application.form.service.service.AddPhyResourceFirstLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=add/inspection/bodies/physical/resource/first" }, service = MVCResourceCommand.class)
public class AddInspectionPhysicalResourceFirstResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddInspectionPhysicalResourceFirstResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------inside add inspection physical resource first  -------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String inventoryNumber = ParamUtil.getString(resourceRequest, "inventoryNumber");
		String item = ParamUtil.getString(resourceRequest, "item");
		String manufacturer = ParamUtil.getString(resourceRequest, "manufacturer");
		String modelNumber = ParamUtil.getString(resourceRequest, "modelNumber");
		String calibrationInterval = ParamUtil.getString(resourceRequest, "calibrationInterval");
		String calibratedBy = ParamUtil.getString(resourceRequest, "calibratedBy");
		long uniqueId = ParamUtil.getLong(resourceRequest, "uniqueId");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String counterOfPhysicalResourceFirst = ParamUtil.getString(resourceRequest, "counterOfPhysicalResourceFirst");

		AddPhyResourceFirst phyResourceFirst = null;
		try {
			phyResourceFirst = AddPhyResourceFirstLocalServiceUtil.getAddPhyResourceFirst(uniqueId);
		} catch (PortalException e) {
		}

		if (Validator.isNull(phyResourceFirst)) {
			phyResourceFirst = AddPhyResourceFirstLocalServiceUtil
					.createAddPhyResourceFirst(CounterLocalServiceUtil.increment());
			phyResourceFirst.setCounter(counterOfPhysicalResourceFirst);
		}
		phyResourceFirst.setInventoryNumber(inventoryNumber);
		phyResourceFirst.setItem(item);
		phyResourceFirst.setManufacturer(manufacturer);
		phyResourceFirst.setModelNumber(modelNumber);
		phyResourceFirst.setCalibrationInterval(calibrationInterval);
		phyResourceFirst.setCalibratedBy(calibratedBy);
		phyResourceFirst.setJanaacApplicationId(janaacApplicationId);
		AddPhyResourceFirstLocalServiceUtil.updateAddPhyResourceFirst(phyResourceFirst);
		jsonOBJ.put("uniqueId", phyResourceFirst.getAddPhyResourceFirstId());
		jsonOBJ.put("counter", phyResourceFirst.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}

		return false;
	}
}
