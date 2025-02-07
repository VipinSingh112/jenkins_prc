package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccCerBodyScope;
import com.nbp.janaac.application.form.service.service.AccCerBodyScopeLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/acc/cer/bodies/scope/service" }, service = MVCResourceCommand.class)
public class AddAccCerBodiesScopeServiceResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(AddAccCerBodiesScopeServiceResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accreditation certification bodies scope service info------ Started]");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String certificationStandard = ParamUtil.getString(resourceRequest, "certificationStandard");
		String expertiseField1 = ParamUtil.getString(resourceRequest, "expertiseField1");
		String expertiseField2 = ParamUtil.getString(resourceRequest, "expertiseField2");
		String expertiseField3= ParamUtil.getString(resourceRequest, "expertiseField3");
		String expertiseField4= ParamUtil.getString(resourceRequest, "expertiseField4");
		String expertiseField5= ParamUtil.getString(resourceRequest, "expertiseField5");
		String expertiseField6= ParamUtil.getString(resourceRequest, "expertiseField6");
		String expertiseField7= ParamUtil.getString(resourceRequest, "expertiseField7");
		String expertiseField8= ParamUtil.getString(resourceRequest, "expertiseField8");
		String expertiseField9= ParamUtil.getString(resourceRequest, "expertiseField9");
		String expertiseField10= ParamUtil.getString(resourceRequest, "expertiseField10");
		String expertiseField11= ParamUtil.getString(resourceRequest, "expertiseField11");
		String expertiseField12= ParamUtil.getString(resourceRequest, "expertiseField12");
		String expertiseField13= ParamUtil.getString(resourceRequest, "expertiseField13");
		String expertiseField14= ParamUtil.getString(resourceRequest, "expertiseField14");
		String cerIntrestedParties= ParamUtil.getString(resourceRequest, "cerIntrestedParties");
		String otherServices= ParamUtil.getString(resourceRequest, "otherServices");
		String otherServicesDescribe= ParamUtil.getString(resourceRequest, "otherServicesDescribe");
		String establishedRelation= ParamUtil.getString(resourceRequest, "establishedRelation");
		String establishedRelDesc= ParamUtil.getString(resourceRequest, "establishedRelDesc");
		String clientService= ParamUtil.getString(resourceRequest, "clientService");
		String certificationCerBody= ParamUtil.getString(resourceRequest, "certificationCerBody");
		String orgAccredited= ParamUtil.getString(resourceRequest, "orgAccredited");
		String responsibleBody= ParamUtil.getString(resourceRequest, "responsibleBody");
		String accExpDate= ParamUtil.getString(resourceRequest, "accExpDate");		
		String certBodyScope= ParamUtil.getString(resourceRequest, "certBodyScope");
		AccCerBodyScope application=null;
		try {
			application = AccCerBodyScopeLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccCerBodyScopeLocalServiceUtil.createAccCerBodyScope(CounterLocalServiceUtil.increment());
		}
		application.setCertificationStandard(certificationStandard);
		application.setExpertiseField1(expertiseField1);
		application.setExpertiseField2(expertiseField2);
		application.setExpertiseField3(expertiseField3);
		application.setExpertiseField4(expertiseField4);
		application.setExpertiseField5(expertiseField5);
		application.setExpertiseField6(expertiseField6);
		application.setExpertiseField7(expertiseField7);
		application.setExpertiseField8(expertiseField8);
		application.setExpertiseField9(expertiseField9);
		application.setExpertiseField10(expertiseField10);
		application.setExpertiseField11(expertiseField11);
		application.setExpertiseField12(expertiseField12);
		application.setExpertiseField13(expertiseField13);
		application.setExpertiseField14(expertiseField14);
		application.setCerIntrestedParties(cerIntrestedParties);
		application.setOtherServices(otherServices);
		application.setOtherServicesDescribe(otherServicesDescribe);
		application.setEstablishedRelation(establishedRelation);
		application.setEstablishedRelDesc(establishedRelDesc);
		application.setClientService(clientService);
		application.setCertificationCerBody(certificationCerBody);
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
		AccCerBodyScopeLocalServiceUtil.updateAccCerBodyScope(application);
		return false;
	}

}
