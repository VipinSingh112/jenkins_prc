package com.nbp.hsra.application.form.web.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.model.RadionuclideAdd;
import com.nbp.hsra.application.service.service.RadionuclideAddLocalServiceUtil;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/radionulcide/Detail/Data" }, service = MVCResourceCommand.class)
public class HSRARadionuclideDetailDataResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(HSRARadionuclideDetailDataResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("******calling hsra radionuclide sources Resource Command*******");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String radionuclideDetails = ParamUtil.getString(resourceRequest, "radionuclideDetails");
		String activityDetails = ParamUtil.getString(resourceRequest, "activityDetails");
		String activityDate = ParamUtil.getString(resourceRequest, "activityDate");
		String chemicalDetailsForm = ParamUtil.getString(resourceRequest, "chemicalDetailsForm");
		String serialNo = ParamUtil.getString(resourceRequest, "serialNo");
		String radionuclideLocation = ParamUtil.getString(resourceRequest, "radionuclideLocation");
		String counterOfRadionuclideDetail = ParamUtil.getString(resourceRequest, "counterOfRadionuclideDetail");
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		long radionuclideDetailId = ParamUtil.getLong(resourceRequest, "radionuclideDetailId");
		RadionuclideAdd radionuclideInfo = null;
		try {
			radionuclideInfo = RadionuclideAddLocalServiceUtil.getRadionuclideAdd(radionuclideDetailId);
		} catch (PortalException e1) {
		}
		if (radionuclideInfo == null) {
			radionuclideInfo = RadionuclideAddLocalServiceUtil.createRadionuclideAdd(radionuclideDetailId);
			radionuclideInfo.setCounter(counterOfRadionuclideDetail);
		}
		radionuclideInfo.setRadionuclideDetails(radionuclideDetails);
		radionuclideInfo.setActivityDetails(activityDetails);
		try {
			if(Validator.isNotNull(activityDate)){
			radionuclideInfo.setActivityDate(new SimpleDateFormat("yyyy-MM-dd").parse(activityDate));
		}} catch (ParseException e) {
		}
		radionuclideInfo.setChemicalDetailsForm(chemicalDetailsForm);
		radionuclideInfo.setSerialNo(serialNo);
		radionuclideInfo.setRadionuclideLocation(radionuclideLocation);
		radionuclideInfo.setHsraApplicationId(hsraApplicationId);
		RadionuclideAddLocalServiceUtil.updateRadionuclideAdd(radionuclideInfo);
		jsonOBJ.put("radionuclideId", radionuclideInfo.getRadionuclideAddId());
		jsonOBJ.put("counter", radionuclideInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}

}
