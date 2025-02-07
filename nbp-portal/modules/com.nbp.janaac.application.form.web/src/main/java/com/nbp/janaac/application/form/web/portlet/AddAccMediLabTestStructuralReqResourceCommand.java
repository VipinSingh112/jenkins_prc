package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccMediLabTestStructural;
import com.nbp.janaac.application.form.service.service.AccMediLabTestStructuralLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/acc/medical/test/structural/req" }, service = MVCResourceCommand.class)
public class AddAccMediLabTestStructuralReqResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddAccMediLabTestStructuralReqResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accreditation medical laboratory testing structural requirement info------ Started]");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String testingLaboratoryLegalEntity=ParamUtil.getString(resourceRequest, "testingLaboratoryLegalEntity");
		String testingLaboratoryLegalEntityDefine=ParamUtil.getString(resourceRequest, "testingLaboratoryLegalEntityDefine");
		String testingLaboratoryPartOfOrg=ParamUtil.getString(resourceRequest, "testingLaboratoryPartOfOrg");
		String testingLaboratoryPartOfOrgName=ParamUtil.getString(resourceRequest, "testingLaboratoryPartOfOrgName");
		String testingLaboratoryPartOfOrgPosition=ParamUtil.getString(resourceRequest, "testingLaboratoryPartOfOrgPosition");
		String testingManagerialStaffSize=ParamUtil.getString(resourceRequest, "testingManagerialStaffSize");
		String testingTechnicalStaffSize=ParamUtil.getString(resourceRequest, "testingTechnicalStaffSize");
		String testingRelevantDocuments=ParamUtil.getString(resourceRequest, "testingRelevantDocuments");
		String majorIncomeSourceTesting=ParamUtil.getString(resourceRequest, "majorIncomeSourceTesting");
		String testingLaboratoryClients=ParamUtil.getString(resourceRequest, "testingLaboratoryClients");
		AccMediLabTestStructural application=null;
		try {
			application = AccMediLabTestStructuralLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccMediLabTestStructuralLocalServiceUtil.createAccMediLabTestStructural(CounterLocalServiceUtil.increment(AddAccMediLabTestStructuralReqResourceCommand.class.getName()));
		}
		application.setTestLabLegalEntity(testingLaboratoryLegalEntity);
		application.setTestlegalStatus(testingLaboratoryLegalEntityDefine);
		application.setTestlabPartOfOrg(testingLaboratoryPartOfOrg);
		application.setTestlabPartOfOrgName(testingLaboratoryPartOfOrgName);
		application.setTestLabPartOfOrgPos(testingLaboratoryPartOfOrgPosition);
		application.setTestMangerialStaff(testingManagerialStaffSize);
		application.setTestTechnicalStaff(testingTechnicalStaffSize);
		application.setTestingRelevantDoc(testingRelevantDocuments);
		application.setTestMajorIncome(majorIncomeSourceTesting);
		application.setTestLabClients(testingLaboratoryClients);
		application.setJanaacApplicationId(janaacApplicationId);
		AccMediLabTestStructuralLocalServiceUtil.updateAccMediLabTestStructural(application);
		return false;
	}
}
