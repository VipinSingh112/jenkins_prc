package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccMediLabOrganization;
import com.nbp.janaac.application.form.service.service.AccMediLabOrganizationLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/acc/medical/organization/info" }, service = MVCResourceCommand.class)
public class AddAccMediLabOrganizationResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(AddAccMediLabOrganizationResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accreditation medical laboratory organization info------ Started]");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String laboratoryLegalEntity=ParamUtil.getString(resourceRequest, "laboratoryLegalEntity");
		String laboratoryLegalEntityDefine=ParamUtil.getString(resourceRequest, "laboratoryLegalEntityDefine");
		String laboratoryPartOfOrg=ParamUtil.getString(resourceRequest, "laboratoryPartOfOrg");
		String laboratoryPartOfOrgName=ParamUtil.getString(resourceRequest, "laboratoryPartOfOrgName");
		String laboratoryPartOfOrgPosition=ParamUtil.getString(resourceRequest, "laboratoryPartOfOrgPosition");
		String analystsName=ParamUtil.getString(resourceRequest, "analystsName");
		String majorIncomeSource=ParamUtil.getString(resourceRequest, "majorIncomeSource");
		String laboratoryClients=ParamUtil.getString(resourceRequest, "laboratoryClients");
		AccMediLabOrganization application=null;
		try {
			application = AccMediLabOrganizationLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccMediLabOrganizationLocalServiceUtil.createAccMediLabOrganization(CounterLocalServiceUtil.increment(AddAccMediLabOrganizationResourceCommand.class.getName()));
		}
		application.setLaboratoryLegalEntity(laboratoryLegalEntity);
		application.setLegalStatus(laboratoryLegalEntityDefine);
		application.setLaboratoryPartOfOrg(laboratoryPartOfOrg);
		application.setLaboratoryPartOfOrgName(laboratoryPartOfOrgName);
		application.setLaboratoryPartOfOrgPos(laboratoryPartOfOrgPosition);
		application.setNameOfAnalysts(analystsName);
		application.setMajorIncomeSource(majorIncomeSource);
		application.setLaboratoryClients(laboratoryClients);
		application.setJanaacApplicationId(janaacApplicationId);
		AccMediLabOrganizationLocalServiceUtil.updateAccMediLabOrganization(application);
		return false;
	}

}
