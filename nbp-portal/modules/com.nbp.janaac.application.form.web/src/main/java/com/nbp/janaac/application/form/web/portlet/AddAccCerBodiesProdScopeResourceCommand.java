package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccCerBodyProdScope;
import com.nbp.janaac.application.form.service.service.AccCerBodyProdScopeLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/acc/cer/bodies/product/scope/service" }, service = MVCResourceCommand.class)
public class AddAccCerBodiesProdScopeResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(AddAccCerBodiesProdScopeResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accreditation certification bodies product scope service info------ Started]");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String cerIntrestedParties= ParamUtil.getString(resourceRequest, "cerIntrestedParties");
		String otherServices= ParamUtil.getString(resourceRequest, "otherServices");
		String otherServicesDescribe= ParamUtil.getString(resourceRequest, "otherServicesDescribe");
		String establishedRelation= ParamUtil.getString(resourceRequest, "establishedRelation");
		String establishedRelDesc= ParamUtil.getString(resourceRequest, "establishedRelDesc");
		String clientService= ParamUtil.getString(resourceRequest, "clientService");
		String orgAccredited= ParamUtil.getString(resourceRequest, "orgAccredited");
		String responsibleBody= ParamUtil.getString(resourceRequest, "responsibleBody");
		String accExpDate= ParamUtil.getString(resourceRequest, "accExpDate");		
		String certBodyScope= ParamUtil.getString(resourceRequest, "certBodyScope");
		AccCerBodyProdScope application=null;
		try {
			application = AccCerBodyProdScopeLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccCerBodyProdScopeLocalServiceUtil.createAccCerBodyProdScope(CounterLocalServiceUtil.increment(AddAccCerBodiesProdScopeResourceCommand.class.getName()));
		}
		application.setCerIntrestedParties(cerIntrestedParties);
		application.setOtherServices(otherServices);
		application.setOtherServicesDescribe(otherServicesDescribe);
		application.setEstablishedRelation(establishedRelation);
		application.setEstablishedRelDesc(establishedRelDesc);
		application.setClientService(clientService);
		application.setOrgAccredited(orgAccredited);
		application.setResponsibleBody(responsibleBody);
		if (Validator.isNotNull(accExpDate)) {
			try {
				application.setAccExpDate(new SimpleDateFormat("yyyy-MM-dd").parse(accExpDate));
			} catch (Exception e) {
			}
		}
		application.setCertBodyScope(certBodyScope);
		application.setJanaacApplicationId(janaacApplicationId);
		AccCerBodyProdScopeLocalServiceUtil.updateAccCerBodyProdScope(application);
		return false;
	}

}
