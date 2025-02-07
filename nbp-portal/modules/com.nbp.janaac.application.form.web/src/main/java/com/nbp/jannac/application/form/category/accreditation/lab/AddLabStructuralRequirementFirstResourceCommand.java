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
import com.nbp.janaac.application.form.service.model.AddLabStructuralRequirement;
import com.nbp.janaac.application.form.service.service.AddLabStructuralRequirementLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=add/lab/structural/requirement" }, service = MVCResourceCommand.class)
public class AddLabStructuralRequirementFirstResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddLabApplicationInfoResouceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------inside AddLabStructuralRequirementFirstResourceCommand started-------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String nameOfStaf = ParamUtil.getString(resourceRequest, "nameOfStaf");
		String jobTitle = ParamUtil.getString(resourceRequest, "jobTitle");
		String majorResponsibilities = ParamUtil.getString(resourceRequest, "majorResponsibilities");
		String IndicateAnalysts = ParamUtil.getString(resourceRequest, "IndicateAnalysts");
		String counterOfStaff = ParamUtil.getString(resourceRequest, "counterOfStaff");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		long uniqueId = ParamUtil.getLong(resourceRequest, "uniqueId");

		AddLabStructuralRequirement labStuctInfo = null;
		try {
			labStuctInfo = AddLabStructuralRequirementLocalServiceUtil.getAddLabStructuralRequirement(uniqueId);
		} catch (PortalException e1) {
		}
		if (Validator.isNull(labStuctInfo)) {
			labStuctInfo = AddLabStructuralRequirementLocalServiceUtil.createAddLabStructuralRequirement(CounterLocalServiceUtil.increment());
			labStuctInfo.setCounter(counterOfStaff);
		}
		labStuctInfo.setNameOfStaff(nameOfStaf);
		labStuctInfo.setJobTitle(jobTitle);
		labStuctInfo.setMajorResponsibilities(majorResponsibilities);
		labStuctInfo.setIndicateAnalysts(IndicateAnalysts);
		labStuctInfo.setJanaacApplicationId(janaacApplicationId);
		
		AddLabStructuralRequirementLocalServiceUtil.updateAddLabStructuralRequirement(labStuctInfo);
		jsonOBJ.put("uniqueId", labStuctInfo.getAddLabStructuralRequirementId());
		jsonOBJ.put("counter", labStuctInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}
}
