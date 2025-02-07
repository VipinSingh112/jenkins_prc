package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo;
import com.nbp.janaac.application.form.service.service.AccCerBodyMngReqTwoLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/acc/certi/bodies/manage/sys/req/two" }, service = MVCResourceCommand.class)

public class AddAccCerBodiesManageSysTwoResourceCommand implements MVCResourceCommand{

	private static Log _log = LogFactoryUtil.getLog(AddAccCerBodiesManageSysTwoResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accreditation certification bodies 17024-2015 standards management system requirement info------ Started]");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");		
		String optionFollow = ParamUtil.getString(resourceRequest, "optionFollow");
		String certiAgreement = ParamUtil.getString(resourceRequest, "certiAgreement");
		String qMRefCertiAgreement = ParamUtil.getString(resourceRequest, "qMRefCertiAgreement");
		String riskAssessment= ParamUtil.getString(resourceRequest, "riskAssessment");
		String qMRefRisk= ParamUtil.getString(resourceRequest, "qMRefRisk");
		String confidentiality= ParamUtil.getString(resourceRequest, "confidentiality");
		String qMRefConfidentiality= ParamUtil.getString(resourceRequest, "qMRefConfidentiality");
		String security= ParamUtil.getString(resourceRequest, "security");
		String qMRefSecurity= ParamUtil.getString(resourceRequest, "qMRefSecurity");
		String certificationScheme= ParamUtil.getString(resourceRequest, "certificationScheme");
		String qMRefCertifiScheme= ParamUtil.getString(resourceRequest, "qMRefCertifiScheme");
		String validCertification= ParamUtil.getString(resourceRequest, "validCertification");
		String qMRefValidCertification= ParamUtil.getString(resourceRequest, "qMRefValidCertification");
		String preRequisites= ParamUtil.getString(resourceRequest, "preRequisites");		
		String qMRefPrerequisites= ParamUtil.getString(resourceRequest, "qMRefPrerequisites");
		String infoProvided= ParamUtil.getString(resourceRequest, "infoProvided");
		String qMRefInfoProvided= ParamUtil.getString(resourceRequest, "qMRefInfoProvided");
		String handlingAppeals = ParamUtil.getString(resourceRequest, "handlingAppeals");
		String qMRefHandlingAppeals = ParamUtil.getString(resourceRequest, "qMRefHandlingAppeals");
		String handlingComplaints = ParamUtil.getString(resourceRequest, "handlingComplaints");
		String qMRefHandlingComplaint= ParamUtil.getString(resourceRequest, "qMRefHandlingComplaint");
		String orgStructure= ParamUtil.getString(resourceRequest, "orgStructure");
		String qMRefOrgStructure= ParamUtil.getString(resourceRequest, "qMRefOrgStructure");
		String formalRules= ParamUtil.getString(resourceRequest, "formalRules");
		String qMRefFormalRules= ParamUtil.getString(resourceRequest, "qMRefFormalRules");
		String safeguardingMechanism= ParamUtil.getString(resourceRequest, "safeguardingMechanism");
		String qMRefSafeguarding= ParamUtil.getString(resourceRequest, "qMRefSafeguarding");
		String managementProc= ParamUtil.getString(resourceRequest, "managementProc");
		String qMRefManagementProc= ParamUtil.getString(resourceRequest, "qMRefManagementProc");
		String contractExaminer= ParamUtil.getString(resourceRequest, "contractExaminer");
		String qMRefExaminer= ParamUtil.getString(resourceRequest, "qMRefExaminer");
		String contractBody= ParamUtil.getString(resourceRequest, "contractBody");		
		String qMRefContractBody= ParamUtil.getString(resourceRequest, "qMRefContractBody");
		String docPolicies= ParamUtil.getString(resourceRequest, "docPolicies");
		String qMRefDocPolicies= ParamUtil.getString(resourceRequest, "qMRefDocPolicies");
		String specifiedStandard= ParamUtil.getString(resourceRequest, "specifiedStandard");
		String qMRefSpecified= ParamUtil.getString(resourceRequest, "qMRefSpecified");
		String applicationForm= ParamUtil.getString(resourceRequest, "applicationForm");
		String qMRefAppliForm= ParamUtil.getString(resourceRequest, "qMRefAppliForm");		
		String applicationReview= ParamUtil.getString(resourceRequest, "applicationReview");
		String qMRefAppliReview= ParamUtil.getString(resourceRequest, "qMRefAppliReview");
		String assessmentPlan= ParamUtil.getString(resourceRequest, "assessmentPlan");
		String qMRefAssessmentPlan= ParamUtil.getString(resourceRequest, "qMRefAssessmentPlan");
		String examinationProcess= ParamUtil.getString(resourceRequest, "examinationProcess");
		String qMRefExamProcess= ParamUtil.getString(resourceRequest, "qMRefExamProcess");
		String certificationDecision= ParamUtil.getString(resourceRequest, "certificationDecision");
		String qMRefCertiDecision= ParamUtil.getString(resourceRequest, "qMRefCertiDecision");
		String certificationDoc= ParamUtil.getString(resourceRequest, "certificationDoc");
		String qMRefCertiDoc= ParamUtil.getString(resourceRequest, "qMRefCertiDoc");				
		String useOfCertificates= ParamUtil.getString(resourceRequest, "useOfCertificates");
		String qMRefUseOfCertificate= ParamUtil.getString(resourceRequest, "qMRefUseOfCertificate");
		String suspension= ParamUtil.getString(resourceRequest, "suspension");
		String qMRefSuspension= ParamUtil.getString(resourceRequest, "qMRefSuspension");
		String processToReceive= ParamUtil.getString(resourceRequest, "processToReceive");
		String qMRefReceiveProcess= ParamUtil.getString(resourceRequest, "qMRefReceiveProcess");
		String generalManage= ParamUtil.getString(resourceRequest, "generalManage");
		String qMRefGeneral= ParamUtil.getString(resourceRequest, "qMRefGeneral");
		String docControl= ParamUtil.getString(resourceRequest, "docControl");
		String qMRefDocControl= ParamUtil.getString(resourceRequest, "qMRefDocControl");
		String recordControl= ParamUtil.getString(resourceRequest, "recordControl");
		String qMRefRecControl= ParamUtil.getString(resourceRequest, "qMRefRecControl");
		String manageReview= ParamUtil.getString(resourceRequest, "manageReview");
		String qMRefManageReview= ParamUtil.getString(resourceRequest, "qMRefManageReview");
		String internalAudit= ParamUtil.getString(resourceRequest, "internalAudit");
		String qMRefInternal= ParamUtil.getString(resourceRequest, "qMRefInternal");
		String correctiveAction= ParamUtil.getString(resourceRequest, "correctiveAction");
		String qMRefCorrective= ParamUtil.getString(resourceRequest, "qMRefCorrective");
		String preventiveAction= ParamUtil.getString(resourceRequest, "preventiveAction");
		String qMRefPreventive= ParamUtil.getString(resourceRequest, "qMRefPreventive");
		String docInKeeping= ParamUtil.getString(resourceRequest, "docInKeeping");
		String qMRefDocInKeeping= ParamUtil.getString(resourceRequest, "qMRefDocInKeeping");
		AccCerBodyMngReqTwo application=null;
		try {
			application = AccCerBodyMngReqTwoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccCerBodyMngReqTwoLocalServiceUtil.createAccCerBodyMngReqTwo(CounterLocalServiceUtil.increment(AddAccCerBodiesManageSysTwoResourceCommand.class.getName()));
		}					
		application.setOptionFollow(optionFollow);
		application.setCertiAgreement(certiAgreement);
		application.setQMRefCertiAgreement(qMRefCertiAgreement);
		application.setRiskAssessment(riskAssessment);
		application.setQMRefRisk(qMRefRisk);
		application.setConfidentiality(confidentiality);
		application.setQMRefConfidentiality(qMRefConfidentiality);
		application.setSecurity(security);
		application.setQMRefSecurity(qMRefSecurity);
		application.setCertificationScheme(certificationScheme);
		application.setQMRefCertifiScheme(qMRefCertifiScheme);
		application.setValidCertification(validCertification);
		application.setQMRefValidCertification(qMRefValidCertification);
		application.setPreRequisites(preRequisites);
		application.setQMRefPrerequisites(qMRefPrerequisites);
		application.setInfoProvided(infoProvided);
		application.setQMRefInfoProvided(qMRefInfoProvided);
		application.setHandlingAppeals(handlingAppeals);
		application.setQMRefHandlingAppeals(qMRefHandlingAppeals);
		application.setHandlingComplaints(handlingComplaints);
		application.setQMRefHandlingComplaint(qMRefHandlingComplaint);
		application.setOrgStructure(orgStructure);
		application.setQMRefOrgStructure(qMRefOrgStructure);
		application.setFormalRules(formalRules);
		application.setQMRefFormalRules(qMRefFormalRules);
		application.setSafeguardingMechanism(safeguardingMechanism);
		application.setQMRefSafeguarding(qMRefSafeguarding);
		application.setManagementProc(managementProc);
		application.setQMRefManagementProc(qMRefManagementProc);
		application.setContractExaminer(contractExaminer);
		application.setQMRefExaminer(qMRefExaminer);
		application.setContractBody(contractBody);
		application.setQMRefContractBody(qMRefContractBody);
		application.setDocPolicies(docPolicies);
		application.setQMRefDocPolicies(qMRefDocPolicies);
		application.setSpecifiedStandard(specifiedStandard);
		application.setQMRefSpecified(qMRefSpecified);
		application.setApplicationForm(applicationForm);
		application.setQMRefAppliForm(qMRefAppliForm);
		application.setApplicationReview(applicationReview);
		application.setQMRefAppliReview(qMRefAppliReview);
		application.setAssessmentPlan(assessmentPlan);
		application.setQMRefAssessmentPlan(qMRefAssessmentPlan);
		application.setExaminationProcess(examinationProcess);
		application.setQMRefExamProcess(qMRefExamProcess);
		application.setCertificationDecision(certificationDecision);
		application.setQMRefCertiDecision(qMRefCertiDecision);
		application.setCertificationDoc(certificationDoc);
		application.setQMRefCertiDoc(qMRefCertiDoc);
		application.setUseOfCertificates(useOfCertificates);
		application.setQMRefUseOfCertificate(qMRefUseOfCertificate);
		application.setSuspension(suspension);
		application.setQMRefSuspension(qMRefSuspension);
		application.setProcessToReceive(processToReceive);
		application.setQMRefReceiveProcess(qMRefReceiveProcess);
		application.setGeneralManage(generalManage);
		application.setQMRefGeneral(qMRefGeneral);
		application.setDocControl(docControl);
		application.setQMRefDocControl(qMRefDocControl);
		application.setRecordControl(recordControl);
		application.setQMRefRecControl(qMRefRecControl);
		application.setManageReview(manageReview);
		application.setQMRefManageReview(qMRefManageReview);
		application.setInternalAudit(internalAudit);
		application.setQMRefInternal(qMRefInternal);
		application.setCorrectiveAction(correctiveAction);
		application.setQMRefCorrective(qMRefCorrective);
		application.setPreventiveAction(preventiveAction);
		application.setQMRefPreventive(qMRefPreventive);
		application.setDocInKeeping(docInKeeping);
		application.setQMRefDocInKeeping(qMRefDocInKeeping);
		application.setJanaacApplicationId(janaacApplicationId);
		AccCerBodyMngReqTwoLocalServiceUtil.updateAccCerBodyMngReqTwo(application);
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
