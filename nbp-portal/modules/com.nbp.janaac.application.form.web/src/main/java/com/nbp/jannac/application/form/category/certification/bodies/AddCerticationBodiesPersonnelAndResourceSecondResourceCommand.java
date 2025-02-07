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
import com.nbp.janaac.application.form.service.model.AddCerPersonnelSecond;
import com.nbp.janaac.application.form.service.service.AddCerPersonnelSecondLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/add/cer/bodies/personnel/and/reso/second" }, service = MVCResourceCommand.class)
public class AddCerticationBodiesPersonnelAndResourceSecondResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(AddCerticationBodiesPersonnelAndResourceSecondResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------inside add certi bodies personnel and resource second resource command -------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String name = ParamUtil.getString(resourceRequest, "name");
		String role = ParamUtil.getString(resourceRequest, "role");
		String certificationStandard = ParamUtil.getString(resourceRequest, "certificationStandard");
		String expertiseArea = ParamUtil.getString(resourceRequest, "expertiseArea");
		long uniqueId = ParamUtil.getLong(resourceRequest, "uniqueId");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String counterOfPersonnelSec = ParamUtil.getString(resourceRequest, "counterOfPersonnelSec");

		AddCerPersonnelSecond cerPersonnelSecond = null;
		try {
			cerPersonnelSecond = AddCerPersonnelSecondLocalServiceUtil.getAddCerPersonnelSecond(uniqueId);
		} catch (PortalException e) {
		}

		if (Validator.isNull(cerPersonnelSecond)) {
			cerPersonnelSecond = AddCerPersonnelSecondLocalServiceUtil
					.createAddCerPersonnelSecond(CounterLocalServiceUtil.increment());
			cerPersonnelSecond.setCounter(counterOfPersonnelSec);
		}
		cerPersonnelSecond.setName(name);
		cerPersonnelSecond.setRole(role);
		cerPersonnelSecond.setCertificateStandard(certificationStandard);
		cerPersonnelSecond.setAreaOfExpertise(expertiseArea);
		cerPersonnelSecond.setJanaacApplicationId(janaacApplicationId);
		AddCerPersonnelSecondLocalServiceUtil.updateAddCerPersonnelSecond(cerPersonnelSecond);
		jsonOBJ.put("uniqueId", cerPersonnelSecond.getAddCerPersonnelSecondId());
		jsonOBJ.put("counter", cerPersonnelSecond.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}

		return false;
	}
}