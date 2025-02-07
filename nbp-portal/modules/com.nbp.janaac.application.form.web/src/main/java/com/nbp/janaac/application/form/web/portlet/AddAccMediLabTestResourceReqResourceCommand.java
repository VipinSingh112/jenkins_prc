package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccMediLabTestResourceReq;
import com.nbp.janaac.application.form.service.service.AccMediLabTestResourceReqLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/acc/medical/test/resource/req" }, service = MVCResourceCommand.class)
public class AddAccMediLabTestResourceReqResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(AddAccMediLabPhysicalResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accreditation medical laboratory testing resource requirement info------ Started]");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String testExternalPersonnel=ParamUtil.getString(resourceRequest, "testExternalPersonnel");
		String testCompetenceRequirements=ParamUtil.getString(resourceRequest, "testCompetenceRequirements");
		String testLabFacilities=ParamUtil.getString(resourceRequest, "testLabFacilities");
		String testLabContractedFacilities=ParamUtil.getString(resourceRequest, "testLabContractedFacilities");
		String testLabFacilityEnvReq=ParamUtil.getString(resourceRequest, "testLabFacilityEnvReq");
		String testSpecialEnvConditions=ParamUtil.getString(resourceRequest, "testSpecialEnvConditions");
		String testMonitoringActivities=ParamUtil.getString(resourceRequest, "testMonitoringActivities");
		String testLabRelatedEquipment=ParamUtil.getString(resourceRequest, "testLabRelatedEquipment");
		String testSecurityArrangements=ParamUtil.getString(resourceRequest, "testSecurityArrangements");
		AccMediLabTestResourceReq application=null;
		try {
			application = AccMediLabTestResourceReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccMediLabTestResourceReqLocalServiceUtil.createAccMediLabTestResourceReq(CounterLocalServiceUtil.increment(AddAccMediLabPhysicalResourceCommand.class.getName()));
		}
		application.setTestExternal(testExternalPersonnel);
		application.setTestCompetence(testCompetenceRequirements);
		application.setTestLabFacilities(testLabFacilities);
		application.setTestLabContracted(testLabContractedFacilities);
		application.setTestLabFacilityEnv(testLabFacilityEnvReq);
		application.setTestSpecialEnv(testSpecialEnvConditions);
		application.setTestMonitoringAct(testMonitoringActivities);
		application.setTestLabRelatedEquip(testLabRelatedEquipment);
		application.setTestSecurityArrange(testSecurityArrangements);
		application.setJanaacApplicationId(janaacApplicationId);
		AccMediLabTestResourceReqLocalServiceUtil.updateAccMediLabTestResourceReq(application);
		return false;
	}
}
