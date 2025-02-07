package com.nbp.jannac.application.form.category.accreditation.lab;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AddLabMedicalOrganFirst;
import com.nbp.janaac.application.form.service.service.AddLabMedicalOrganFirstLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/add/signatory/authority/detail/data/url" }, service = MVCResourceCommand.class)
public class AddLabTheOrganizationFirstResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddLabTheOrganizationFirstResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------inside add lab  Description od activity-------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();

		String staffName = ParamUtil.getString(resourceRequest, "staffName");
		String jobTitle = ParamUtil.getString(resourceRequest, "jobTitle");
		String majorResponsibilities = ParamUtil.getString(resourceRequest, "majorResponsibilities");
		long signatoryAuthorityId = ParamUtil.getLong(resourceRequest, "signatoryAuthorityId");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String counterOfSpecimenCollection = ParamUtil.getString(resourceRequest, "counterOfSpecimenCollection");

		AddLabMedicalOrganFirst organLabFirstInfo = null;
		try {
		} catch (Exception e) {
			organLabFirstInfo = AddLabMedicalOrganFirstLocalServiceUtil
					.fetchAddLabMedicalOrganFirst(signatoryAuthorityId);
		}
		if (Validator.isNull(organLabFirstInfo)) {
			organLabFirstInfo = AddLabMedicalOrganFirstLocalServiceUtil
					.createAddLabMedicalOrganFirst(CounterLocalServiceUtil.increment());
			organLabFirstInfo.setCounter(counterOfSpecimenCollection);
		}
		organLabFirstInfo.setNameOfStaff(staffName);
		organLabFirstInfo.setJobTitle(jobTitle);
		organLabFirstInfo.setMajorResponsibilities(majorResponsibilities);
		organLabFirstInfo.setJanaacApplicationId(janaacApplicationId);

		AddLabMedicalOrganFirstLocalServiceUtil.updateAddLabMedicalOrganFirst(organLabFirstInfo);
		jsonOBJ.put("signatoryAutorityId", organLabFirstInfo.getAddLabMedicalOrganFirstId());
		jsonOBJ.put("counter", organLabFirstInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}

		return false;
	}
}