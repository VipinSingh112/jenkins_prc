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
import com.nbp.janaac.application.form.service.model.AddLabMedicalDescOfActiSec;
import com.nbp.janaac.application.form.service.service.AddLabMedicalDescOfActiSecLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/add/point/care/testing/detail/data" }, service = MVCResourceCommand.class)
public class AddDescriptionOfActivityResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddDescriptionOfActivityResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------inside add description of form sec  -------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String pointCareTestingReqPoct = ParamUtil.getString(resourceRequest, "pointCareTestingReqPoct");
		String pointCareTestingLocation = ParamUtil.getString(resourceRequest, "pointCareTestingLocation");
		long pointCareTestingId = ParamUtil.getLong(resourceRequest, "pointCareTestingId");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String counterOfPointCareTesting = ParamUtil.getString(resourceRequest, "counterOfPointCareTesting");

		AddLabMedicalDescOfActiSec medicalDecSecInfo = null;
		try {
			medicalDecSecInfo = AddLabMedicalDescOfActiSecLocalServiceUtil.getAddLabMedicalDescOfActiSec(pointCareTestingId);
		} catch (PortalException e) {
		}

		if (Validator.isNull(medicalDecSecInfo)) {
			_log.info("---------inside counter local service create-------");
			medicalDecSecInfo = AddLabMedicalDescOfActiSecLocalServiceUtil
					.createAddLabMedicalDescOfActiSec(CounterLocalServiceUtil.increment());
			medicalDecSecInfo.setCounter(counterOfPointCareTesting);
		}
		medicalDecSecInfo.setRequestedPoct(pointCareTestingReqPoct);
		medicalDecSecInfo.setLocation(pointCareTestingLocation);
		medicalDecSecInfo.setJanaacApplicationId(janaacApplicationId);
		AddLabMedicalDescOfActiSecLocalServiceUtil.updateAddLabMedicalDescOfActiSec(medicalDecSecInfo);
		_log.info("---------update medicalDecSecInfo-------");
		jsonOBJ.put("pointCareId", medicalDecSecInfo.getAddLabMedicalDescOfActiSecId());
		jsonOBJ.put("counter", medicalDecSecInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}

		return false;
	}
}