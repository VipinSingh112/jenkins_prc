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
import com.nbp.janaac.application.form.service.model.AddCerScopeServiceThird;
import com.nbp.janaac.application.form.service.service.AddCerScopeServiceThirdLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/add/cer/bodies/scope/service/client" }, service = MVCResourceCommand.class)
public class AddCertication17024BodiesScopeServiceResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(AddCertication17024BodiesScopeServiceResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------inside add description of form sec  -------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String clientOrganizationNameCerBodies = ParamUtil.getString(resourceRequest,"clientOrganizationNameCerBodies");
		String clientOrganizationAddressCerBodies = ParamUtil.getString(resourceRequest,"clientOrganizationAddressCerBodies");
		String certificationStandardCerBodies = ParamUtil.getString(resourceRequest,"certificationStandardCerBodies");
		String currentStatusCerBodies = ParamUtil.getString(resourceRequest, "currentStatusCerBodies");
		String firstGrantedDateCerBodies = ParamUtil.getString(resourceRequest, "firstGrantedDateCerBodies");
		String examinationDateCerBodies = ParamUtil.getString(resourceRequest, "examinationDateCerBodies");
		long registeredClientOrgCerBodiesId = ParamUtil.getLong(resourceRequest, "registeredClientOrgCerBodiesId");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String counterRegisteredClientOrgCerBodies = ParamUtil.getString(resourceRequest,"counterRegisteredClientOrgCerBodies");

		AddCerScopeServiceThird cerScopeScopeThird = null;
		try {
			cerScopeScopeThird = AddCerScopeServiceThirdLocalServiceUtil
					.getAddCerScopeServiceThird(registeredClientOrgCerBodiesId);
		} catch (PortalException e) {
		}
		if (Validator.isNull(cerScopeScopeThird)) {
			cerScopeScopeThird = AddCerScopeServiceThirdLocalServiceUtil
					.createAddCerScopeServiceThird(CounterLocalServiceUtil.increment());
			cerScopeScopeThird.setCounter(counterRegisteredClientOrgCerBodies);
		}
		cerScopeScopeThird.setOrganizationName(clientOrganizationNameCerBodies);
		cerScopeScopeThird.setOrganizationAddress(clientOrganizationAddressCerBodies);
		cerScopeScopeThird.setCurrentStatus(currentStatusCerBodies);
		cerScopeScopeThird.setCertificationScheme(certificationStandardCerBodies);
		try {
			if (Validator.isNotNull(firstGrantedDateCerBodies)) {
				cerScopeScopeThird
						.setDateFirstGranted(new SimpleDateFormat("yyyy-MM-dd").parse(firstGrantedDateCerBodies));
			}
		} catch (ParseException e1) {
			_log.error("an error occured" + e1);
		}
		try {
			if (Validator.isNotNull(examinationDateCerBodies)) {
				cerScopeScopeThird
						.setDateOfNextExamination(new SimpleDateFormat("yyyy-MM-dd").parse(examinationDateCerBodies));
			}
		} catch (ParseException e1) {
			_log.error("an error occured" + e1);
		}
		cerScopeScopeThird.setJanaacApplicationId(janaacApplicationId);
		AddCerScopeServiceThirdLocalServiceUtil.updateAddCerScopeServiceThird(cerScopeScopeThird);
		jsonOBJ.put("registeredClientOrgCerBodiesId", cerScopeScopeThird.getAddCerScopeServiceThirdId());
		jsonOBJ.put("counter", cerScopeScopeThird.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}

		return false;
	}
}