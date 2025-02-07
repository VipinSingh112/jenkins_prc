package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccInsBodiesOrganization;
import com.nbp.janaac.application.form.service.service.AccInsBodiesOrganizationLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/acc/inspection/bodies/org/info" }, service = MVCResourceCommand.class)
public class AddAccInsBodiesOrgResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(AddAccInsBodiesOrgResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accreditation inspection bodies organization info------ Started]");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String insLegalEntity=ParamUtil.getString(resourceRequest, "insLegalEntity");
		String insLegalStatusEntity=ParamUtil.getString(resourceRequest, "insLegalStatusEntity");
		String insBodyOrgPart=ParamUtil.getString(resourceRequest, "insBodyOrgPart");
		String insPersonnelName=ParamUtil.getString(resourceRequest, "insPersonnelName");
		String insPersonnelPosition=ParamUtil.getString(resourceRequest, "insPersonnelPosition");
		String insStaffSize=ParamUtil.getString(resourceRequest, "insStaffSize");
		String insStaffComplement=ParamUtil.getString(resourceRequest, "insStaffComplement");
		String insIncomeSource=ParamUtil.getString(resourceRequest, "insIncomeSource");
		String insOrgBodyType=ParamUtil.getString(resourceRequest, "insOrgBodyType");
		String insBodyOwnOrgClient=ParamUtil.getString(resourceRequest, "insBodyOwnOrgClient");
		String insBodyOtherOrgClient=ParamUtil.getString(resourceRequest, "insBodyOtherOrgClient");
		AccInsBodiesOrganization application=null;
		try {
			application = AccInsBodiesOrganizationLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccInsBodiesOrganizationLocalServiceUtil.createAccInsBodiesOrganization(CounterLocalServiceUtil.increment(AddAccInsBodiesOrgResourceCommand.class.getName()));
		}
		application.setInsLegalEntity(insLegalEntity);
		application.setInsLegalStatusEntity(insLegalStatusEntity);
		application.setInsBodyOrgPart(insBodyOrgPart);
		application.setInsPersonnelName(insPersonnelName);
		application.setInsPersonnelPosition(insPersonnelPosition);
		application.setInsStaffSize(insStaffSize);
		application.setInsStaffComplement(insStaffComplement);
		application.setInsIncomeSource(insIncomeSource);
		application.setInsOrgBodyType(insOrgBodyType);
		application.setInsBodyOwnOrgClient(insBodyOwnOrgClient);
		application.setInsBodyOtherOrgClient(insBodyOtherOrgClient);
		application.setJanaacApplicationId(janaacApplicationId);
		AccInsBodiesOrganizationLocalServiceUtil.updateAccInsBodiesOrganization(application);
		return false;
	}

}
