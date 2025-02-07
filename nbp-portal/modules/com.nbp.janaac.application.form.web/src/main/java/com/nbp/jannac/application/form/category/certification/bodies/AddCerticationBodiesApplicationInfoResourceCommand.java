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
import com.nbp.janaac.application.form.service.model.AddCerApplicationInfo;
import com.nbp.janaac.application.form.service.service.AddCerApplicationInfoLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;
import com.nbp.jannac.application.form.category.accreditation.lab.AddDescriptionOfActivityResourceCommand;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/add/cer/bodies/application/info" }, service = MVCResourceCommand.class)
public class AddCerticationBodiesApplicationInfoResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddDescriptionOfActivityResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------inside add description of form sec  -------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String certificationBodiesAppliName = ParamUtil.getString(resourceRequest, "certificationBodiesAppliName");
		String certificationBodiesAppliEmail = ParamUtil.getString(resourceRequest, "certificationBodiesAppliEmail");
		long uniqueId = ParamUtil.getLong(resourceRequest, "uniqueId");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String counterOfCerBodiesOfAppliInfo = ParamUtil.getString(resourceRequest, "counterOfCerBodiesOfAppliInfo");

		AddCerApplicationInfo creAppliInfo = null;
		try {
			creAppliInfo = AddCerApplicationInfoLocalServiceUtil.getAddCerApplicationInfo(uniqueId);
		} catch (PortalException e) {
		}

		if (Validator.isNull(creAppliInfo)) {
			_log.info("---------inside counter local service create-------");
			creAppliInfo = AddCerApplicationInfoLocalServiceUtil
					.createAddCerApplicationInfo(CounterLocalServiceUtil.increment());
			creAppliInfo.setCounter(counterOfCerBodiesOfAppliInfo);
		}
		creAppliInfo.setName(certificationBodiesAppliName);
		creAppliInfo.setEmail(certificationBodiesAppliEmail);
		creAppliInfo.setJanaacApplicationId(janaacApplicationId);
		AddCerApplicationInfoLocalServiceUtil.updateAddCerApplicationInfo(creAppliInfo);
		_log.info("---------update medicalDecSecInfo-------");
		jsonOBJ.put("uniqueId", creAppliInfo.getAddCerApplicationInfoId());
		jsonOBJ.put("counter", creAppliInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}

		return false;
	}
}