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
import com.nbp.janaac.application.form.service.model.AddCerPersonnelThird;
import com.nbp.janaac.application.form.service.service.AddCerPersonnelThirdLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/add/cer/bodies/personnel/and/reso/third" }, service = MVCResourceCommand.class)
public class AddCerticationBodiesPersonnelAndResourceThirdResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(AddCerticationBodiesPersonnelAndResourceThirdResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------inside add certi bodies personnel and resource third resource command -------------");

		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String activityPerformNum = ParamUtil.getString(resourceRequest, "activityPerformNum");
		String activityPerformLoc = ParamUtil.getString(resourceRequest, "activityPerformLoc");
		String activityPerformCertLoc = ParamUtil.getString(resourceRequest, "activityPerformCertLoc");
		String activityPerformContact = ParamUtil.getString(resourceRequest, "activityPerformContact");
		long activityPerformLocationsId = ParamUtil.getLong(resourceRequest, "activityPerformLocationsId");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String counterActivityPerformLocationsVal = ParamUtil.getString(resourceRequest,
				"counterActivityPerformLocationsVal");
		AddCerPersonnelThird cerPersonnelThird = null;
		try {
			cerPersonnelThird = AddCerPersonnelThirdLocalServiceUtil
					.getAddCerPersonnelThird(activityPerformLocationsId);
		} catch (PortalException e) {
		}

		if (Validator.isNull(cerPersonnelThird)) {
			cerPersonnelThird = AddCerPersonnelThirdLocalServiceUtil
					.createAddCerPersonnelThird(CounterLocalServiceUtil.increment());
			cerPersonnelThird.setCounter(counterActivityPerformLocationsVal);
		}
		cerPersonnelThird.setNumber(activityPerformNum);
		cerPersonnelThird.setLocation(activityPerformLoc);
		cerPersonnelThird.setCertificationActivities(activityPerformCertLoc);
		cerPersonnelThird.setContactDetails(activityPerformContact);
		cerPersonnelThird.setJanaacApplicationId(janaacApplicationId);
		AddCerPersonnelThirdLocalServiceUtil.updateAddCerPersonnelThird(cerPersonnelThird);
		jsonOBJ.put("uniqueId", cerPersonnelThird.getAddCerPersonnelThirdId());
		jsonOBJ.put("counter", cerPersonnelThird.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}

		return false;
	}
}