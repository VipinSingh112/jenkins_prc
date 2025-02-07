package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccMediLabManagementReq;
import com.nbp.janaac.application.form.service.service.AccMediLabManagementReqLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/acc/medical/management/req/info" }, service = MVCResourceCommand.class)

public class AddAccMediLabManageSysReqResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(AddAccMediLabManageSysReqResourceCommand.class.getName());
	

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accreditation medical laboratory management system requirement info------ Started]");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String managementEstablished = ParamUtil.getString(resourceRequest, "managementEstablished");
		String qMRefManagement = ParamUtil.getString(resourceRequest, "qMRefManagement");
		String personAware = ParamUtil.getString(resourceRequest, "personAware");
		String qMRefPerson= ParamUtil.getString(resourceRequest, "qMRefPerson");
		String policiesAcknowledged= ParamUtil.getString(resourceRequest, "policiesAcknowledged");
		String qMRefPolicies= ParamUtil.getString(resourceRequest, "qMRefPolicies");
		String controlledDocument= ParamUtil.getString(resourceRequest, "controlledDocument");
		String qMRefControlDoc= ParamUtil.getString(resourceRequest, "qMRefControlDoc");
		String laboratoryEstablished= ParamUtil.getString(resourceRequest, "laboratoryEstablished");
		String qMRefLabEstab= ParamUtil.getString(resourceRequest, "qMRefLabEstab");
		String identifiedRisks= ParamUtil.getString(resourceRequest, "identifiedRisks");
		String qMRefRisks= ParamUtil.getString(resourceRequest, "qMRefRisks");
		String havePersonnel= ParamUtil.getString(resourceRequest, "havePersonnel");
		String qMRefPersonnel= ParamUtil.getString(resourceRequest, "qMRefPersonnel");
		String authorizePersonnel= ParamUtil.getString(resourceRequest, "authorizePersonnel");
		String qMRefAuthorize= ParamUtil.getString(resourceRequest, "qMRefAuthorize");
		String labControlDocsFulfilment= ParamUtil.getString(resourceRequest, "labControlDocsFulfilment");
		String otherRefFulfil= ParamUtil.getString(resourceRequest, "otherRefFulfil");
		String legibleRecordsFulfil= ParamUtil.getString(resourceRequest, "legibleRecordsFulfil");
		String otherRefLegibleRec= ParamUtil.getString(resourceRequest, "otherRefLegibleRec");
		String proceduresInPlace = ParamUtil.getString(resourceRequest, "proceduresInPlace");
		String otherRefProcedure= ParamUtil.getString(resourceRequest, "otherRefProcedure");
		String communicatedRequirement= ParamUtil.getString(resourceRequest, "communicatedRequirement");
		String otherRefRequirement=ParamUtil.getString(resourceRequest, "otherRefRequirement");
		String procedureForSelection=ParamUtil.getString(resourceRequest, "procedureForSelection");
		String otherRefSelection=ParamUtil.getString(resourceRequest, "otherRefSelection");
		String arrangementInPlace=ParamUtil.getString(resourceRequest, "arrangementInPlace");
		String otherRefArrange=ParamUtil.getString(resourceRequest, "otherRefArrange");
		String processInPlace=ParamUtil.getString(resourceRequest, "processInPlace");
		String otherRefProcess=ParamUtil.getString(resourceRequest, "otherRefProcess");
		String labOperateProgramme=ParamUtil.getString(resourceRequest, "labOperateProgramme");
		String otherRefLabOperate=ParamUtil.getString(resourceRequest, "otherRefLabOperate");
		String identifyOpportunities=ParamUtil.getString(resourceRequest, "identifyOpportunities");
		String otherRefOpportunity=ParamUtil.getString(resourceRequest, "otherRefOpportunity");
		String demonstrateFulfilment=ParamUtil.getString(resourceRequest, "demonstrateFulfilment");
		String otherRefDemonstrate=ParamUtil.getString(resourceRequest, "otherRefDemonstrate");
		String ensureLabPlan=ParamUtil.getString(resourceRequest, "ensureLabPlan");
		String otherRefEnsurePlan=ParamUtil.getString(resourceRequest, "otherRefEnsurePlan");
		String plannedManageReview=ParamUtil.getString(resourceRequest, "plannedManageReview");
		String otherRefPlanned=ParamUtil.getString(resourceRequest, "otherRefPlanned");
		String availablePersonnel=ParamUtil.getString(resourceRequest, "availablePersonnel");
		String manualRefAvailable=ParamUtil.getString(resourceRequest, "manualRefAvailable");
		String educationProgramme= ParamUtil.getString(resourceRequest, "educationProgramme");
		String manualRefEducation= ParamUtil.getString(resourceRequest, "manualRefEducation");
		String ensureAccomodation= ParamUtil.getString(resourceRequest, "ensureAccomodation");
		String manualRefAccom= ParamUtil.getString(resourceRequest, "manualRefAccom");
		String processForSelection= ParamUtil.getString(resourceRequest, "processForSelection");
		String manualRefSelection = ParamUtil.getString(resourceRequest, "manualRefSelection");
		String verifyReagents =ParamUtil.getString(resourceRequest, "verifyReagents");
		String manualRefReagents=ParamUtil.getString(resourceRequest, "manualRefReagents");
		String docProcedure=ParamUtil.getString(resourceRequest, "docProcedure");
		String manualRefDocProce=ParamUtil.getString(resourceRequest, "manualRefDocProce");
		String useExamMethods=ParamUtil.getString(resourceRequest, "useExamMethods");
		String manualRefExam=ParamUtil.getString(resourceRequest, "manualRefExam");
		String monitoringValidity = ParamUtil.getString(resourceRequest, "monitoringValidity");
		String manualRefValidity = ParamUtil.getString(resourceRequest, "manualRefValidity");
		String validateExam = ParamUtil.getString(resourceRequest, "validateExam");
		String manualRefValidateExam = ParamUtil.getString(resourceRequest, "manualRefValidateExam");
		String uncertainityReview = ParamUtil.getString(resourceRequest, "uncertainityReview");
		String manualRefUncertainity = ParamUtil.getString(resourceRequest, "manualRefUncertainity");
		String preventResRelease = ParamUtil.getString(resourceRequest, "preventResRelease");
		String manualRefPrevent = ParamUtil.getString(resourceRequest, "manualRefPrevent");
		String equipmentMaintenance = ParamUtil.getString(resourceRequest, "equipmentMaintenance");
		String manualRefMaintenance = ParamUtil.getString(resourceRequest, "manualRefMaintenance");
		String equipCalibration = ParamUtil.getString(resourceRequest, "equipCalibration");
		String manualRefCalibrat = ParamUtil.getString(resourceRequest, "manualRefCalibrat");
		String proficencyTesting = ParamUtil.getString(resourceRequest, "proficencyTesting");
		String manualRefProfiTest = ParamUtil.getString(resourceRequest, "manualRefProfiTest");
		String postExamReliabilty = ParamUtil.getString(resourceRequest, "postExamReliabilty");
		String manualRefPostExam = ParamUtil.getString(resourceRequest, "manualRefPostExam");
		String reportedAccurately = ParamUtil.getString(resourceRequest, "reportedAccurately");
		String manualRefReported = ParamUtil.getString(resourceRequest, "manualRefReported");
		String responsiblitySpecified = ParamUtil.getString(resourceRequest, "responsiblitySpecified");
		String manualRefSpecified = ParamUtil.getString(resourceRequest, "manualRefSpecified");
		String ensureAuthorities = ParamUtil.getString(resourceRequest, "ensureAuthorities");
		String manualRefAuthorities = ParamUtil.getString(resourceRequest, "manualRefAuthorities");
		AccMediLabManagementReq application=null;
		try {
			application = AccMediLabManagementReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccMediLabManagementReqLocalServiceUtil.createAccMediLabManagementReq(CounterLocalServiceUtil.increment(AddAccMediLabManageSysReqResourceCommand.class.getName()));
		}
		application.setManagementEstablished(managementEstablished);
		application.setQMRefManagement(qMRefManagement);
		application.setPersonAware(personAware);
		application.setQMRefPerson(qMRefPerson);
		application.setPoliciesAcknowledged(policiesAcknowledged);
		application.setQMRefPolicies(qMRefPolicies);
		application.setControlledDocument(controlledDocument);
		application.setQMRefControlDoc(qMRefControlDoc);
		application.setLaboratoryEstablished(laboratoryEstablished);
		application.setQMReflabEstab(qMRefLabEstab);
		application.setIdentifiedRisks(identifiedRisks);
		application.setQMRefRisks(qMRefRisks);
		application.setHavePersonnel(havePersonnel);
		application.setQMRefPersonnel(qMRefPersonnel);
		application.setAuthorizePersonnel(authorizePersonnel);
		application.setQMRefAuthorize(qMRefAuthorize);
		application.setLabControlDocsFulfilment(labControlDocsFulfilment);
		application.setOtherRefFulfil(otherRefFulfil);
		application.setLegibleRecordsFulfil(legibleRecordsFulfil);
		application.setOtherRefLegibleRec(otherRefLegibleRec);
		application.setProceduresInPlace(proceduresInPlace);
		application.setOtherRefProcedure(otherRefProcedure);
		application.setCommunicatedRequirement(communicatedRequirement);
		application.setOtherRefRequirement(otherRefRequirement);
		application.setProcedureForSelection(procedureForSelection);
		application.setOtherRefSelection(otherRefSelection);
		application.setArrangementInPlace(arrangementInPlace);
		application.setOtherRefArrange(otherRefArrange);
		application.setProcessInPlace(processInPlace);
		application.setOtherRefProcess(otherRefProcess);
		application.setLabOperateProgramme(labOperateProgramme);
		application.setOtherRefLabOperate(otherRefLabOperate);
		application.setIdentifyOpportunities(identifyOpportunities);
		application.setOtherRefOpportunity(otherRefOpportunity);
		application.setDemonstrateFulfilment(demonstrateFulfilment);
		application.setOtherRefDemonstrate(otherRefDemonstrate);
		application.setEnsureLabPlan(ensureLabPlan);
		application.setOtherRefEnsurePlan(otherRefEnsurePlan);
		application.setPlannedManageReview(plannedManageReview);
		application.setOtherRefPlanned(otherRefPlanned);
		application.setAvailablePersonnel(availablePersonnel);
		application.setManualRefAvailable(manualRefAvailable);
		application.setEducationProgramme(educationProgramme);
		application.setManualRefEducation(manualRefEducation);
		application.setEnsureAccomodation(ensureAccomodation);
		application.setManualRefAccom(manualRefAccom);
		application.setProcessForSelection(processForSelection);
		application.setManualRefSelection(manualRefSelection);
		application.setVerifyReagents(verifyReagents);
		application.setManualRefReagents(manualRefReagents);
		application.setDocProcedure(docProcedure);
		application.setManualRefDocProce(manualRefDocProce);
		application.setUseExamMethods(useExamMethods);
		application.setManualRefExam(manualRefExam);
		application.setMonitoringValidity(monitoringValidity);
		application.setManualRefValidity(manualRefValidity);
		application.setValidateExam(validateExam);
		application.setManualRefValidateExam(manualRefValidateExam);
		application.setUncertainityReview(uncertainityReview);
		application.setManualRefUncertainity(manualRefUncertainity);
		application.setPreventResRelease(preventResRelease);
		application.setManualRefPrevent(manualRefPrevent);
		application.setEquipmentMaintenance(equipmentMaintenance);
		application.setManualRefMaintenance(manualRefMaintenance);
		application.setEquipCalibration(equipCalibration);
		application.setManualRefCalibrat(manualRefCalibrat);
		application.setProficencyTesting(proficencyTesting);
		application.setManualRefProfiTest(manualRefProfiTest);
		application.setPostExamReliabilty(postExamReliabilty);
		application.setManualRefPostExam(manualRefPostExam);
		application.setReportedAccurately(reportedAccurately);
		application.setManualRefReported(manualRefReported);
		application.setResponsiblitySpecified(responsiblitySpecified);
		application.setManualRefSpecified(manualRefSpecified);
		application.setEnsureAuthorities(ensureAuthorities);
		application.setManualRefAuthorities(manualRefAuthorities);
		application.setJanaacApplicationId(janaacApplicationId);
		AccMediLabManagementReqLocalServiceUtil.updateAccMediLabManagementReq(application);
		jsonOBJ.put("janaacApplicationId", application.getJanaacApplicationId());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("an error occured----"+e);
		}
		
		return false;
	}

}
