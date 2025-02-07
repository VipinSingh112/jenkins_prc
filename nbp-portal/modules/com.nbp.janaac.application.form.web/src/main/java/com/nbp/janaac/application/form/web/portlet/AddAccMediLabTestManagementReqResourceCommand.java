package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccMediLabTestManageReq;
import com.nbp.janaac.application.form.service.service.AccMediLabTestManageReqLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/acc/medical/test/management/req" }, service = MVCResourceCommand.class)

public class AddAccMediLabTestManagementReqResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddAccMediLabTestManagementReqResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accreditation medical laboratory testing management system requirement info------ Started]");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String policiesForFulfil = ParamUtil.getString(resourceRequest, "policiesForFulfil");
		String labDocRefPolicies = ParamUtil.getString(resourceRequest, "labDocRefPolicies");
		String impartialityProvision = ParamUtil.getString(resourceRequest, "impartialityProvision");
		String labDocRefImpartProv= ParamUtil.getString(resourceRequest, "labDocRefImpartProv");
		String confidientialityProv= ParamUtil.getString(resourceRequest, "confidientialityProv");
		String labDocRefConfid= ParamUtil.getString(resourceRequest, "labDocRefConfid");
		String commitmentEvidence= ParamUtil.getString(resourceRequest, "commitmentEvidence");
		String labDocRefCommitment= ParamUtil.getString(resourceRequest, "labDocRefCommitment");
		String referenceEvidence= ParamUtil.getString(resourceRequest, "referenceEvidence");
		String labDocRefReference= ParamUtil.getString(resourceRequest, "labDocRefReference");
		String docDescribingRole= ParamUtil.getString(resourceRequest, "docDescribingRole");
		String labDocRefDocDes= ParamUtil.getString(resourceRequest, "labDocRefDocDes");
		String rolesofPersonnel= ParamUtil.getString(resourceRequest, "rolesofPersonnel");
		String labDocRefRoles= ParamUtil.getString(resourceRequest, "labDocRefRoles");
		String competenceReq= ParamUtil.getString(resourceRequest, "competenceReq");
		String labDocRefCompetence= ParamUtil.getString(resourceRequest, "labDocRefCompetence");
		String selectionOfPerson= ParamUtil.getString(resourceRequest, "selectionOfPerson");
		String labDocRefSelection= ParamUtil.getString(resourceRequest, "labDocRefSelection");
		String handlingEquip= ParamUtil.getString(resourceRequest, "handlingEquip");
		String labDocRefHandling= ParamUtil.getString(resourceRequest, "labDocRefHandling");
		String calibrationProgram = ParamUtil.getString(resourceRequest, "calibrationProgram");
		String labDocRefCalibrat= ParamUtil.getString(resourceRequest, "labDocRefCalibrat");
		String approvingReq= ParamUtil.getString(resourceRequest, "approvingReq");
		String labDocRefApproving=ParamUtil.getString(resourceRequest, "labDocRefApproving");
		String monitorPerformance=ParamUtil.getString(resourceRequest, "monitorPerformance");
		String labDocRefMonitor=ParamUtil.getString(resourceRequest, "labDocRefMonitor");
		String ensuringService=ParamUtil.getString(resourceRequest, "ensuringService");
		String labDocRefEnsuring=ParamUtil.getString(resourceRequest, "labDocRefEnsuring");
		String reviewOfRequest=ParamUtil.getString(resourceRequest, "reviewOfRequest");
		String labDocRefRequest=ParamUtil.getString(resourceRequest, "labDocRefRequest");
		String procedureForLab=ParamUtil.getString(resourceRequest, "procedureForLab");
		String labDocRefProcedure=ParamUtil.getString(resourceRequest, "labDocRefProcedure");
		String testMethodValidat=ParamUtil.getString(resourceRequest, "testMethodValidat");
		String labDocRefTestMethod=ParamUtil.getString(resourceRequest, "labDocRefTestMethod");
		String samplingPlan= ParamUtil.getString(resourceRequest, "samplingPlan");
		String labDocRefSampling= ParamUtil.getString(resourceRequest, "labDocRefSampling");
		String transportationReciept= ParamUtil.getString(resourceRequest, "transportationReciept");
		String labDocRefTransport= ParamUtil.getString(resourceRequest, "labDocRefTransport");
		String uncertainityMeasure = ParamUtil.getString(resourceRequest, "uncertainityMeasure");
		String labDocRefUncertain= ParamUtil.getString(resourceRequest, "labDocRefUncertain");
		String testResultValidity= ParamUtil.getString(resourceRequest, "testResultValidity");
		String labDocReftestResult=ParamUtil.getString(resourceRequest, "labDocReftestResult");
		String complaints=ParamUtil.getString(resourceRequest, "complaints");
		String labDocRefComplaints=ParamUtil.getString(resourceRequest, "labDocRefComplaints");
		String nonConformingWork=ParamUtil.getString(resourceRequest, "nonConformingWork");
		String labDocRefNonConfirm=ParamUtil.getString(resourceRequest, "labDocRefNonConfirm");
		String uniqueIdentification=ParamUtil.getString(resourceRequest, "uniqueIdentification");
		String labDocRefUnique=ParamUtil.getString(resourceRequest, "labDocRefUnique");
		String currentRevisionStatus=ParamUtil.getString(resourceRequest, "currentRevisionStatus");
		String labDocRefCurrentRev=ParamUtil.getString(resourceRequest, "labDocRefCurrentRev");
		String docChangeIdentify=ParamUtil.getString(resourceRequest, "docChangeIdentify");
		String labDocRefDocChange=ParamUtil.getString(resourceRequest, "labDocRefDocChange");
		String recordControl=ParamUtil.getString(resourceRequest, "recordControl");
		String labDocRefRecordControl=ParamUtil.getString(resourceRequest, "labDocRefRecordControl");
		String plannedAction=ParamUtil.getString(resourceRequest, "plannedAction");
		String labDocRefPlanned=ParamUtil.getString(resourceRequest, "labDocRefPlanned");
		String imporvementOpportunity=ParamUtil.getString(resourceRequest, "imporvementOpportunity");
		String labDocRefImprovement=ParamUtil.getString(resourceRequest, "labDocRefImprovement");
		String correctiveAction=ParamUtil.getString(resourceRequest, "correctiveAction");
		String labDocRefCorrective=ParamUtil.getString(resourceRequest, "labDocRefCorrective");
		String internalAudits=ParamUtil.getString(resourceRequest, "internalAudits");
		String labDocRefInternal=ParamUtil.getString(resourceRequest, "labDocRefInternal");
		
		String managementReview=ParamUtil.getString(resourceRequest, "managementReview");
		String labDocRefManagement=ParamUtil.getString(resourceRequest, "labDocRefManagement");
		AccMediLabTestManageReq application=null;
		try {
			application = AccMediLabTestManageReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccMediLabTestManageReqLocalServiceUtil.createAccMediLabTestManageReq(CounterLocalServiceUtil.increment(AddAccMediLabTestManagementReqResourceCommand.class.getName()));
		}

		application.setPoliciesForFulfil(policiesForFulfil);
		application.setLabDocRefPolicies(labDocRefPolicies);
		application.setImpartialityProvision(impartialityProvision);
		application.setLabDocRefImpartProv(labDocRefImpartProv);
		application.setConfidientialityProv(confidientialityProv);
		application.setLabDocRefConfid(labDocRefConfid);
		application.setCommitmentEvidence(commitmentEvidence);
		application.setLabDocRefCommitment(labDocRefCommitment);
		application.setReferenceEvidence(referenceEvidence);
		application.setLabDocRefReference(labDocRefReference);
		application.setDocDescribingRole(docDescribingRole);
		application.setLabDocRefDocDes(labDocRefDocDes);
		application.setRolesofPersonnel(rolesofPersonnel);
		application.setLabDocRefRoles(labDocRefRoles);
		application.setCompetenceReq(competenceReq);
		application.setLabDocRefCompetence(labDocRefCompetence);
		application.setSelectionOfPerson(selectionOfPerson);
		application.setLabDocRefSelection(labDocRefSelection);
		application.setHandlingEquip(handlingEquip);
		application.setLabDocRefHandling(labDocRefHandling);
		application.setCalibrationProgram(calibrationProgram);
		application.setLabDocRefCalibrat(labDocRefCalibrat);
		application.setApprovingReq(approvingReq);
		application.setLabDocRefApproving(labDocRefApproving);
		application.setMonitorPerformance(monitorPerformance);
		application.setLabDocRefMonitor(labDocRefMonitor);
		application.setEnsuringService(ensuringService);
		application.setLabDocRefEnsuring(labDocRefEnsuring);
		application.setReviewOfRequest(reviewOfRequest);
		application.setLabDocRefRequest(labDocRefRequest);
		application.setProcedureForLab(procedureForLab);
		application.setLabDocRefProcedure(labDocRefProcedure);
		application.setTestMethodValidat(testMethodValidat);
		application.setLabDocRefTestMethod(labDocRefTestMethod);
		application.setSamplingPlan(samplingPlan);
		application.setLabDocRefSampling(labDocRefSampling);
		application.setTransportationReciept(transportationReciept);
		application.setLabDocRefTransport(labDocRefTransport);
		application.setUncertainityMeasure(uncertainityMeasure);
		application.setLabDocRefUncertain(labDocRefUncertain);
		application.setTestResultValidity(testResultValidity);
		application.setLabDocReftestResult(labDocReftestResult);
		application.setComplaints(complaints);
		application.setLabDocRefComplaints(labDocRefComplaints);
		application.setNonConformingWork(nonConformingWork);
		application.setLabDocRefNonConfirm(labDocRefNonConfirm);
		application.setUniqueIdentification(uniqueIdentification);
		application.setLabDocRefUnique(labDocRefUnique);
		application.setCurrentRevisionStatus(currentRevisionStatus);
		application.setLabDocRefCurrentRev(labDocRefCurrentRev);
		application.setDocChangeIdentify(docChangeIdentify);
		application.setLabDocRefDocChange(labDocRefDocChange);
		application.setRecordControl(recordControl);
		application.setLabDocRefRecordControl(labDocRefRecordControl);
		application.setPlannedAction(plannedAction);
		application.setLabDocRefPlanned(labDocRefPlanned);
		application.setImporvementOpportunity(imporvementOpportunity);
		application.setLabDocRefImprovement(labDocRefImprovement);
		application.setCorrectiveAction(correctiveAction);
		application.setLabDocRefCorrective(labDocRefCorrective);
		application.setInternalAudits(internalAudits);
		application.setLabDocRefInternal(labDocRefInternal);
		application.setManagementReview(managementReview);
		application.setLabDocRefManagement(labDocRefManagement);
		application.setJanaacApplicationId(janaacApplicationId);
		AccMediLabTestManageReqLocalServiceUtil.updateAccMediLabTestManageReq(application);
		jsonOBJ.put("janaacApplicationId", application.getJanaacApplicationId());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}

}
