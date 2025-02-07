package com.nbp.jannac.application.form.category.certification.bodies;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AddCerPersonnelFirst;
import com.nbp.janaac.application.form.service.service.AddCerPersonnelFirstLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/add/cer/bodies/personnel/and/reso/first" }, service = MVCResourceCommand.class)
public class AddCerticationBodiesPersonnelAndResourceFirstResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(AddCerticationBodiesPersonnelAndResourceFirstResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------inside add certi bodies personnel and resource First resource command -------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String name = ParamUtil.getString(resourceRequest, "name");
		String jobTitle = ParamUtil.getString(resourceRequest, "jobTitle");
		String majorResponsibilities = ParamUtil.getString(resourceRequest, "majorResponsibilities");
		String specificFunction = ParamUtil.getString(resourceRequest, "specificFunction");
		long uniqueId = ParamUtil.getLong(resourceRequest, "uniqueId");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String counterOfPersonnelFirst = ParamUtil.getString(resourceRequest, "counterOfPersonnelFirst");

		AddCerPersonnelFirst cerPersonnelFirst = null;
		try {
			cerPersonnelFirst = AddCerPersonnelFirstLocalServiceUtil.getAddCerPersonnelFirst(uniqueId);
		} catch (PortalException e) {
		}

		if (Validator.isNull(cerPersonnelFirst)) {
			cerPersonnelFirst = AddCerPersonnelFirstLocalServiceUtil
					.createAddCerPersonnelFirst(CounterLocalServiceUtil.increment());
			cerPersonnelFirst.setCounter(counterOfPersonnelFirst);
		}
		cerPersonnelFirst.setNameOfStaff(name);
		cerPersonnelFirst.setJobTitle(jobTitle);
		cerPersonnelFirst.setMajorResponsibility(majorResponsibilities);
		cerPersonnelFirst.setSpecificFunctions(specificFunction);
		cerPersonnelFirst.setJanaacApplicationId(janaacApplicationId);
		AddCerPersonnelFirstLocalServiceUtil.updateAddCerPersonnelFirst(cerPersonnelFirst);
		jsonOBJ.put("uniqueId", cerPersonnelFirst.getAddCerPersonnelFirstId());
		jsonOBJ.put("counter", cerPersonnelFirst.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}

		return false;
	}
}