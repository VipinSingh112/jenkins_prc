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
import com.nbp.janaac.application.form.service.model.AddCerScopeService;
import com.nbp.janaac.application.form.service.service.AddCerScopeServiceLocalServiceUtil;
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
		"mvc.command.name=/add/cer/bodies/Scope/service" }, service = MVCResourceCommand.class)
public class AddCerticationBodiesScopeServiceResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddCerticationBodiesScopeServiceResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------certication bodies scope service resource command started---------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String clientOrganization = ParamUtil.getString(resourceRequest, "clientOrganization");
		String certificationStandard = ParamUtil.getString(resourceRequest, "certificationStandard");
		String currentCertification = ParamUtil.getString(resourceRequest, "currentCertification");
		String clientOrgDate = ParamUtil.getString(resourceRequest, "clientOrgDate");
		long uniqueId = ParamUtil.getLong(resourceRequest, "uniqueId");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String counterOfCerBodiesOfAppliInfo = ParamUtil.getString(resourceRequest, "counterOfCerBodiesOfAppliInfo");

		AddCerScopeService scopeService = null;
		try {
			scopeService = AddCerScopeServiceLocalServiceUtil.getAddCerScopeService(uniqueId);
		} catch (PortalException e) {
		}

		if (Validator.isNull(scopeService)) {
			_log.info("---------inside counter local service create-------");
			scopeService = AddCerScopeServiceLocalServiceUtil.createAddCerScopeService(CounterLocalServiceUtil.increment());
			scopeService.setCounter(counterOfCerBodiesOfAppliInfo);
		}
		scopeService.setClientOrganization(clientOrganization);
		scopeService.setCertificationStandards(certificationStandard);
		scopeService.setCurrentCertification(currentCertification);
		try {
			if(Validator.isNotNull(clientOrgDate)) {
			scopeService.setDateFirstGranted(new SimpleDateFormat("yyyy-MM-dd").parse(clientOrgDate));
		}}catch (ParseException e1) {
		_log.error("an error occured"+e1);
		}
		scopeService.setJanaacApplicationId(janaacApplicationId);
		AddCerScopeServiceLocalServiceUtil.updateAddCerScopeService(scopeService);
		_log.info("---------update medicalDecSecInfo-------");
		jsonOBJ.put("uniqueId", scopeService.getAddCerScopeServiceId());
		jsonOBJ.put("counter", scopeService.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}

		return false;
	}
}