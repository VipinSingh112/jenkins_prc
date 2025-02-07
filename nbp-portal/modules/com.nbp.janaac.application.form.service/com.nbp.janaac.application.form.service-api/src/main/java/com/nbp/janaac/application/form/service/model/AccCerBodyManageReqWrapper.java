/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AccCerBodyManageReq}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyManageReq
 * @generated
 */
public class AccCerBodyManageReqWrapper
	extends BaseModelWrapper<AccCerBodyManageReq>
	implements AccCerBodyManageReq, ModelWrapper<AccCerBodyManageReq> {

	public AccCerBodyManageReqWrapper(AccCerBodyManageReq accCerBodyManageReq) {
		super(accCerBodyManageReq);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("accCerBodyManageReqId", getAccCerBodyManageReqId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("optionFollow", getOptionFollow());
		attributes.put("impartialityPolicy", getImpartialityPolicy());
		attributes.put("qMRefImpartiality", getQMRefImpartiality());
		attributes.put("riskAssessment", getRiskAssessment());
		attributes.put("qMRefRisk", getQMRefRisk());
		attributes.put("orgStructure", getOrgStructure());
		attributes.put("qMRefOrgStruct", getQMRefOrgStruct());
		attributes.put("termsOfReference", getTermsOfReference());
		attributes.put("qMRefTerms", getQMRefTerms());
		attributes.put("processForControl", getProcessForControl());
		attributes.put("qMRefProcess", getQMRefProcess());
		attributes.put("criteriaReq", getCriteriaReq());
		attributes.put("qMRefCriteria", getQMRefCriteria());
		attributes.put("initialCompetence", getInitialCompetence());
		attributes.put("qMRefInitial", getQMRefInitial());
		attributes.put("selectingTraining", getSelectingTraining());
		attributes.put("qMRefSelecting", getQMRefSelecting());
		attributes.put("monitoringCompetence", getMonitoringCompetence());
		attributes.put("qMRefMonitoring", getQMRefMonitoring());
		attributes.put("writtenAgreement", getWrittenAgreement());
		attributes.put("qMRefWritten", getQMRefWritten());
		attributes.put("descOfProcess", getDescOfProcess());
		attributes.put("qMRefDescProcess", getQMRefDescProcess());
		attributes.put("processForMonitor", getProcessForMonitor());
		attributes.put("qMRefMonitorProcess", getQMRefMonitorProcess());
		attributes.put("auditProcess", getAuditProcess());
		attributes.put("qMRefAuditProcess", getQMRefAuditProcess());
		attributes.put("processGranting", getProcessGranting());
		attributes.put("qMRefGranting", getQMRefGranting());
		attributes.put("managemntSys", getManagemntSys());
		attributes.put("qMRefManagemnt", getQMRefManagemnt());
		attributes.put("useOfCertification", getUseOfCertification());
		attributes.put("qMRefUseOfCerti", getQMRefUseOfCerti());
		attributes.put("handlingReq", getHandlingReq());
		attributes.put("qMRefHandling", getQMRefHandling());
		attributes.put("impartialityPolicies", getImpartialityPolicies());
		attributes.put("qMRefImpartPolicy", getQMRefImpartPolicy());
		attributes.put("provisionInform", getProvisionInform());
		attributes.put("qMRefProvision", getQMRefProvision());
		attributes.put("certificationDoc", getCertificationDoc());
		attributes.put("qMRefCertification", getQMRefCertification());
		attributes.put("rulesGoverning", getRulesGoverning());
		attributes.put("qMRefGoverning", getQMRefGoverning());
		attributes.put("enforcableArrangements", getEnforcableArrangements());
		attributes.put("qMRefEnforcable", getQMRefEnforcable());
		attributes.put("ensureConfidential", getEnsureConfidential());
		attributes.put("qMRefEnsureConfid", getQMRefEnsureConfid());
		attributes.put("informingMechanism", getInformingMechanism());
		attributes.put("qMRefInforming", getQMRefInforming());
		attributes.put("applicationProcess", getApplicationProcess());
		attributes.put("qMRefApplication", getQMRefApplication());
		attributes.put("applicationReview", getApplicationReview());
		attributes.put("qMRefReview", getQMRefReview());
		attributes.put("certificationCycle", getCertificationCycle());
		attributes.put("qMRefCertiCycle", getQMRefCertiCycle());
		attributes.put("auditTime", getAuditTime());
		attributes.put("qMRefAuditTime", getQMRefAuditTime());
		attributes.put("samplingProgram", getSamplingProgram());
		attributes.put("qMRefSampling", getQMRefSampling());
		attributes.put("auditPlanning", getAuditPlanning());
		attributes.put("qMRefPlanning", getQMRefPlanning());
		attributes.put("auditTeam", getAuditTeam());
		attributes.put("qMRefAuditTeam", getQMRefAuditTeam());
		attributes.put("onSiteAudit", getOnSiteAudit());
		attributes.put("qMRefonSiteAudit", getQMRefonSiteAudit());
		attributes.put("auditReport", getAuditReport());
		attributes.put("qMRefAuditReport", getQMRefAuditReport());
		attributes.put("correctiveActions", getCorrectiveActions());
		attributes.put("qMRefCorrective", getQMRefCorrective());
		attributes.put("reviewPriorDecision", getReviewPriorDecision());
		attributes.put("qMRefReviewPrior", getQMRefReviewPrior());
		attributes.put("transferCertification", getTransferCertification());
		attributes.put("qMRefTransfer", getQMRefTransfer());
		attributes.put("suspensionPolicies", getSuspensionPolicies());
		attributes.put("qMRefSuspension", getQMRefSuspension());
		attributes.put("suspensionProcedure", getSuspensionProcedure());
		attributes.put("qMRefSuspensionProc", getQMRefSuspensionProc());
		attributes.put("decisionOnAppeals", getDecisionOnAppeals());
		attributes.put("qMRefDecision", getQMRefDecision());
		attributes.put("handlingComplaints", getHandlingComplaints());
		attributes.put("qMRefComplaints", getQMRefComplaints());
		attributes.put("recordRetentionPolicy", getRecordRetentionPolicy());
		attributes.put("qMRefRetentionPolicy", getQMRefRetentionPolicy());
		attributes.put("recordRetentionProc", getRecordRetentionProc());
		attributes.put("qMRefRetentionProc", getQMRefRetentionProc());
		attributes.put("manageSysPolicies", getManageSysPolicies());
		attributes.put("qMRefPolicies", getQMRefPolicies());
		attributes.put("manageSysObjective", getManageSysObjective());
		attributes.put("qMRefObjective", getQMRefObjective());
		attributes.put("manageSysManual", getManageSysManual());
		attributes.put("qMRefManual", getQMRefManual());
		attributes.put("docControlProcedure", getDocControlProcedure());
		attributes.put("qMRefDocControl", getQMRefDocControl());
		attributes.put("recControlProc", getRecControlProc());
		attributes.put("qMRefRecControl", getQMRefRecControl());
		attributes.put("managementReview", getManagementReview());
		attributes.put("qMRefManagementRev", getQMRefManagementRev());
		attributes.put("internalAudits", getInternalAudits());
		attributes.put("qMRefInternal", getQMRefInternal());
		attributes.put("identificationProc", getIdentificationProc());
		attributes.put("qMRefIdentification", getQMRefIdentification());
		attributes.put("qMSScopeB", getQMSScopeB());
		attributes.put("qMRefQMSScopeB", getQMRefQMSScopeB());
		attributes.put("designDevB", getDesignDevB());
		attributes.put("qMRefDesignB", getQMRefDesignB());
		attributes.put("interestedPartyNeedsB", getInterestedPartyNeedsB());
		attributes.put("qMRefInterestedB", getQMRefInterestedB());
		attributes.put("managementReviewB", getManagementReviewB());
		attributes.put("qMRefmanagementReviewB", getQMRefmanagementReviewB());
		attributes.put("janaacApplicationId", getJanaacApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accCerBodyManageReqId = (Long)attributes.get(
			"accCerBodyManageReqId");

		if (accCerBodyManageReqId != null) {
			setAccCerBodyManageReqId(accCerBodyManageReqId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String optionFollow = (String)attributes.get("optionFollow");

		if (optionFollow != null) {
			setOptionFollow(optionFollow);
		}

		String impartialityPolicy = (String)attributes.get(
			"impartialityPolicy");

		if (impartialityPolicy != null) {
			setImpartialityPolicy(impartialityPolicy);
		}

		String qMRefImpartiality = (String)attributes.get("qMRefImpartiality");

		if (qMRefImpartiality != null) {
			setQMRefImpartiality(qMRefImpartiality);
		}

		String riskAssessment = (String)attributes.get("riskAssessment");

		if (riskAssessment != null) {
			setRiskAssessment(riskAssessment);
		}

		String qMRefRisk = (String)attributes.get("qMRefRisk");

		if (qMRefRisk != null) {
			setQMRefRisk(qMRefRisk);
		}

		String orgStructure = (String)attributes.get("orgStructure");

		if (orgStructure != null) {
			setOrgStructure(orgStructure);
		}

		String qMRefOrgStruct = (String)attributes.get("qMRefOrgStruct");

		if (qMRefOrgStruct != null) {
			setQMRefOrgStruct(qMRefOrgStruct);
		}

		String termsOfReference = (String)attributes.get("termsOfReference");

		if (termsOfReference != null) {
			setTermsOfReference(termsOfReference);
		}

		String qMRefTerms = (String)attributes.get("qMRefTerms");

		if (qMRefTerms != null) {
			setQMRefTerms(qMRefTerms);
		}

		String processForControl = (String)attributes.get("processForControl");

		if (processForControl != null) {
			setProcessForControl(processForControl);
		}

		String qMRefProcess = (String)attributes.get("qMRefProcess");

		if (qMRefProcess != null) {
			setQMRefProcess(qMRefProcess);
		}

		String criteriaReq = (String)attributes.get("criteriaReq");

		if (criteriaReq != null) {
			setCriteriaReq(criteriaReq);
		}

		String qMRefCriteria = (String)attributes.get("qMRefCriteria");

		if (qMRefCriteria != null) {
			setQMRefCriteria(qMRefCriteria);
		}

		String initialCompetence = (String)attributes.get("initialCompetence");

		if (initialCompetence != null) {
			setInitialCompetence(initialCompetence);
		}

		String qMRefInitial = (String)attributes.get("qMRefInitial");

		if (qMRefInitial != null) {
			setQMRefInitial(qMRefInitial);
		}

		String selectingTraining = (String)attributes.get("selectingTraining");

		if (selectingTraining != null) {
			setSelectingTraining(selectingTraining);
		}

		String qMRefSelecting = (String)attributes.get("qMRefSelecting");

		if (qMRefSelecting != null) {
			setQMRefSelecting(qMRefSelecting);
		}

		String monitoringCompetence = (String)attributes.get(
			"monitoringCompetence");

		if (monitoringCompetence != null) {
			setMonitoringCompetence(monitoringCompetence);
		}

		String qMRefMonitoring = (String)attributes.get("qMRefMonitoring");

		if (qMRefMonitoring != null) {
			setQMRefMonitoring(qMRefMonitoring);
		}

		String writtenAgreement = (String)attributes.get("writtenAgreement");

		if (writtenAgreement != null) {
			setWrittenAgreement(writtenAgreement);
		}

		String qMRefWritten = (String)attributes.get("qMRefWritten");

		if (qMRefWritten != null) {
			setQMRefWritten(qMRefWritten);
		}

		String descOfProcess = (String)attributes.get("descOfProcess");

		if (descOfProcess != null) {
			setDescOfProcess(descOfProcess);
		}

		String qMRefDescProcess = (String)attributes.get("qMRefDescProcess");

		if (qMRefDescProcess != null) {
			setQMRefDescProcess(qMRefDescProcess);
		}

		String processForMonitor = (String)attributes.get("processForMonitor");

		if (processForMonitor != null) {
			setProcessForMonitor(processForMonitor);
		}

		String qMRefMonitorProcess = (String)attributes.get(
			"qMRefMonitorProcess");

		if (qMRefMonitorProcess != null) {
			setQMRefMonitorProcess(qMRefMonitorProcess);
		}

		String auditProcess = (String)attributes.get("auditProcess");

		if (auditProcess != null) {
			setAuditProcess(auditProcess);
		}

		String qMRefAuditProcess = (String)attributes.get("qMRefAuditProcess");

		if (qMRefAuditProcess != null) {
			setQMRefAuditProcess(qMRefAuditProcess);
		}

		String processGranting = (String)attributes.get("processGranting");

		if (processGranting != null) {
			setProcessGranting(processGranting);
		}

		String qMRefGranting = (String)attributes.get("qMRefGranting");

		if (qMRefGranting != null) {
			setQMRefGranting(qMRefGranting);
		}

		String managemntSys = (String)attributes.get("managemntSys");

		if (managemntSys != null) {
			setManagemntSys(managemntSys);
		}

		String qMRefManagemnt = (String)attributes.get("qMRefManagemnt");

		if (qMRefManagemnt != null) {
			setQMRefManagemnt(qMRefManagemnt);
		}

		String useOfCertification = (String)attributes.get(
			"useOfCertification");

		if (useOfCertification != null) {
			setUseOfCertification(useOfCertification);
		}

		String qMRefUseOfCerti = (String)attributes.get("qMRefUseOfCerti");

		if (qMRefUseOfCerti != null) {
			setQMRefUseOfCerti(qMRefUseOfCerti);
		}

		String handlingReq = (String)attributes.get("handlingReq");

		if (handlingReq != null) {
			setHandlingReq(handlingReq);
		}

		String qMRefHandling = (String)attributes.get("qMRefHandling");

		if (qMRefHandling != null) {
			setQMRefHandling(qMRefHandling);
		}

		String impartialityPolicies = (String)attributes.get(
			"impartialityPolicies");

		if (impartialityPolicies != null) {
			setImpartialityPolicies(impartialityPolicies);
		}

		String qMRefImpartPolicy = (String)attributes.get("qMRefImpartPolicy");

		if (qMRefImpartPolicy != null) {
			setQMRefImpartPolicy(qMRefImpartPolicy);
		}

		String provisionInform = (String)attributes.get("provisionInform");

		if (provisionInform != null) {
			setProvisionInform(provisionInform);
		}

		String qMRefProvision = (String)attributes.get("qMRefProvision");

		if (qMRefProvision != null) {
			setQMRefProvision(qMRefProvision);
		}

		String certificationDoc = (String)attributes.get("certificationDoc");

		if (certificationDoc != null) {
			setCertificationDoc(certificationDoc);
		}

		String qMRefCertification = (String)attributes.get(
			"qMRefCertification");

		if (qMRefCertification != null) {
			setQMRefCertification(qMRefCertification);
		}

		String rulesGoverning = (String)attributes.get("rulesGoverning");

		if (rulesGoverning != null) {
			setRulesGoverning(rulesGoverning);
		}

		String qMRefGoverning = (String)attributes.get("qMRefGoverning");

		if (qMRefGoverning != null) {
			setQMRefGoverning(qMRefGoverning);
		}

		String enforcableArrangements = (String)attributes.get(
			"enforcableArrangements");

		if (enforcableArrangements != null) {
			setEnforcableArrangements(enforcableArrangements);
		}

		String qMRefEnforcable = (String)attributes.get("qMRefEnforcable");

		if (qMRefEnforcable != null) {
			setQMRefEnforcable(qMRefEnforcable);
		}

		String ensureConfidential = (String)attributes.get(
			"ensureConfidential");

		if (ensureConfidential != null) {
			setEnsureConfidential(ensureConfidential);
		}

		String qMRefEnsureConfid = (String)attributes.get("qMRefEnsureConfid");

		if (qMRefEnsureConfid != null) {
			setQMRefEnsureConfid(qMRefEnsureConfid);
		}

		String informingMechanism = (String)attributes.get(
			"informingMechanism");

		if (informingMechanism != null) {
			setInformingMechanism(informingMechanism);
		}

		String qMRefInforming = (String)attributes.get("qMRefInforming");

		if (qMRefInforming != null) {
			setQMRefInforming(qMRefInforming);
		}

		String applicationProcess = (String)attributes.get(
			"applicationProcess");

		if (applicationProcess != null) {
			setApplicationProcess(applicationProcess);
		}

		String qMRefApplication = (String)attributes.get("qMRefApplication");

		if (qMRefApplication != null) {
			setQMRefApplication(qMRefApplication);
		}

		String applicationReview = (String)attributes.get("applicationReview");

		if (applicationReview != null) {
			setApplicationReview(applicationReview);
		}

		String qMRefReview = (String)attributes.get("qMRefReview");

		if (qMRefReview != null) {
			setQMRefReview(qMRefReview);
		}

		String certificationCycle = (String)attributes.get(
			"certificationCycle");

		if (certificationCycle != null) {
			setCertificationCycle(certificationCycle);
		}

		String qMRefCertiCycle = (String)attributes.get("qMRefCertiCycle");

		if (qMRefCertiCycle != null) {
			setQMRefCertiCycle(qMRefCertiCycle);
		}

		String auditTime = (String)attributes.get("auditTime");

		if (auditTime != null) {
			setAuditTime(auditTime);
		}

		String qMRefAuditTime = (String)attributes.get("qMRefAuditTime");

		if (qMRefAuditTime != null) {
			setQMRefAuditTime(qMRefAuditTime);
		}

		String samplingProgram = (String)attributes.get("samplingProgram");

		if (samplingProgram != null) {
			setSamplingProgram(samplingProgram);
		}

		String qMRefSampling = (String)attributes.get("qMRefSampling");

		if (qMRefSampling != null) {
			setQMRefSampling(qMRefSampling);
		}

		String auditPlanning = (String)attributes.get("auditPlanning");

		if (auditPlanning != null) {
			setAuditPlanning(auditPlanning);
		}

		String qMRefPlanning = (String)attributes.get("qMRefPlanning");

		if (qMRefPlanning != null) {
			setQMRefPlanning(qMRefPlanning);
		}

		String auditTeam = (String)attributes.get("auditTeam");

		if (auditTeam != null) {
			setAuditTeam(auditTeam);
		}

		String qMRefAuditTeam = (String)attributes.get("qMRefAuditTeam");

		if (qMRefAuditTeam != null) {
			setQMRefAuditTeam(qMRefAuditTeam);
		}

		String onSiteAudit = (String)attributes.get("onSiteAudit");

		if (onSiteAudit != null) {
			setOnSiteAudit(onSiteAudit);
		}

		String qMRefonSiteAudit = (String)attributes.get("qMRefonSiteAudit");

		if (qMRefonSiteAudit != null) {
			setQMRefonSiteAudit(qMRefonSiteAudit);
		}

		String auditReport = (String)attributes.get("auditReport");

		if (auditReport != null) {
			setAuditReport(auditReport);
		}

		String qMRefAuditReport = (String)attributes.get("qMRefAuditReport");

		if (qMRefAuditReport != null) {
			setQMRefAuditReport(qMRefAuditReport);
		}

		String correctiveActions = (String)attributes.get("correctiveActions");

		if (correctiveActions != null) {
			setCorrectiveActions(correctiveActions);
		}

		String qMRefCorrective = (String)attributes.get("qMRefCorrective");

		if (qMRefCorrective != null) {
			setQMRefCorrective(qMRefCorrective);
		}

		String reviewPriorDecision = (String)attributes.get(
			"reviewPriorDecision");

		if (reviewPriorDecision != null) {
			setReviewPriorDecision(reviewPriorDecision);
		}

		String qMRefReviewPrior = (String)attributes.get("qMRefReviewPrior");

		if (qMRefReviewPrior != null) {
			setQMRefReviewPrior(qMRefReviewPrior);
		}

		String transferCertification = (String)attributes.get(
			"transferCertification");

		if (transferCertification != null) {
			setTransferCertification(transferCertification);
		}

		String qMRefTransfer = (String)attributes.get("qMRefTransfer");

		if (qMRefTransfer != null) {
			setQMRefTransfer(qMRefTransfer);
		}

		String suspensionPolicies = (String)attributes.get(
			"suspensionPolicies");

		if (suspensionPolicies != null) {
			setSuspensionPolicies(suspensionPolicies);
		}

		String qMRefSuspension = (String)attributes.get("qMRefSuspension");

		if (qMRefSuspension != null) {
			setQMRefSuspension(qMRefSuspension);
		}

		String suspensionProcedure = (String)attributes.get(
			"suspensionProcedure");

		if (suspensionProcedure != null) {
			setSuspensionProcedure(suspensionProcedure);
		}

		String qMRefSuspensionProc = (String)attributes.get(
			"qMRefSuspensionProc");

		if (qMRefSuspensionProc != null) {
			setQMRefSuspensionProc(qMRefSuspensionProc);
		}

		String decisionOnAppeals = (String)attributes.get("decisionOnAppeals");

		if (decisionOnAppeals != null) {
			setDecisionOnAppeals(decisionOnAppeals);
		}

		String qMRefDecision = (String)attributes.get("qMRefDecision");

		if (qMRefDecision != null) {
			setQMRefDecision(qMRefDecision);
		}

		String handlingComplaints = (String)attributes.get(
			"handlingComplaints");

		if (handlingComplaints != null) {
			setHandlingComplaints(handlingComplaints);
		}

		String qMRefComplaints = (String)attributes.get("qMRefComplaints");

		if (qMRefComplaints != null) {
			setQMRefComplaints(qMRefComplaints);
		}

		String recordRetentionPolicy = (String)attributes.get(
			"recordRetentionPolicy");

		if (recordRetentionPolicy != null) {
			setRecordRetentionPolicy(recordRetentionPolicy);
		}

		String qMRefRetentionPolicy = (String)attributes.get(
			"qMRefRetentionPolicy");

		if (qMRefRetentionPolicy != null) {
			setQMRefRetentionPolicy(qMRefRetentionPolicy);
		}

		String recordRetentionProc = (String)attributes.get(
			"recordRetentionProc");

		if (recordRetentionProc != null) {
			setRecordRetentionProc(recordRetentionProc);
		}

		String qMRefRetentionProc = (String)attributes.get(
			"qMRefRetentionProc");

		if (qMRefRetentionProc != null) {
			setQMRefRetentionProc(qMRefRetentionProc);
		}

		String manageSysPolicies = (String)attributes.get("manageSysPolicies");

		if (manageSysPolicies != null) {
			setManageSysPolicies(manageSysPolicies);
		}

		String qMRefPolicies = (String)attributes.get("qMRefPolicies");

		if (qMRefPolicies != null) {
			setQMRefPolicies(qMRefPolicies);
		}

		String manageSysObjective = (String)attributes.get(
			"manageSysObjective");

		if (manageSysObjective != null) {
			setManageSysObjective(manageSysObjective);
		}

		String qMRefObjective = (String)attributes.get("qMRefObjective");

		if (qMRefObjective != null) {
			setQMRefObjective(qMRefObjective);
		}

		String manageSysManual = (String)attributes.get("manageSysManual");

		if (manageSysManual != null) {
			setManageSysManual(manageSysManual);
		}

		String qMRefManual = (String)attributes.get("qMRefManual");

		if (qMRefManual != null) {
			setQMRefManual(qMRefManual);
		}

		String docControlProcedure = (String)attributes.get(
			"docControlProcedure");

		if (docControlProcedure != null) {
			setDocControlProcedure(docControlProcedure);
		}

		String qMRefDocControl = (String)attributes.get("qMRefDocControl");

		if (qMRefDocControl != null) {
			setQMRefDocControl(qMRefDocControl);
		}

		String recControlProc = (String)attributes.get("recControlProc");

		if (recControlProc != null) {
			setRecControlProc(recControlProc);
		}

		String qMRefRecControl = (String)attributes.get("qMRefRecControl");

		if (qMRefRecControl != null) {
			setQMRefRecControl(qMRefRecControl);
		}

		String managementReview = (String)attributes.get("managementReview");

		if (managementReview != null) {
			setManagementReview(managementReview);
		}

		String qMRefManagementRev = (String)attributes.get(
			"qMRefManagementRev");

		if (qMRefManagementRev != null) {
			setQMRefManagementRev(qMRefManagementRev);
		}

		String internalAudits = (String)attributes.get("internalAudits");

		if (internalAudits != null) {
			setInternalAudits(internalAudits);
		}

		String qMRefInternal = (String)attributes.get("qMRefInternal");

		if (qMRefInternal != null) {
			setQMRefInternal(qMRefInternal);
		}

		String identificationProc = (String)attributes.get(
			"identificationProc");

		if (identificationProc != null) {
			setIdentificationProc(identificationProc);
		}

		String qMRefIdentification = (String)attributes.get(
			"qMRefIdentification");

		if (qMRefIdentification != null) {
			setQMRefIdentification(qMRefIdentification);
		}

		String qMSScopeB = (String)attributes.get("qMSScopeB");

		if (qMSScopeB != null) {
			setQMSScopeB(qMSScopeB);
		}

		String qMRefQMSScopeB = (String)attributes.get("qMRefQMSScopeB");

		if (qMRefQMSScopeB != null) {
			setQMRefQMSScopeB(qMRefQMSScopeB);
		}

		String designDevB = (String)attributes.get("designDevB");

		if (designDevB != null) {
			setDesignDevB(designDevB);
		}

		String qMRefDesignB = (String)attributes.get("qMRefDesignB");

		if (qMRefDesignB != null) {
			setQMRefDesignB(qMRefDesignB);
		}

		String interestedPartyNeedsB = (String)attributes.get(
			"interestedPartyNeedsB");

		if (interestedPartyNeedsB != null) {
			setInterestedPartyNeedsB(interestedPartyNeedsB);
		}

		String qMRefInterestedB = (String)attributes.get("qMRefInterestedB");

		if (qMRefInterestedB != null) {
			setQMRefInterestedB(qMRefInterestedB);
		}

		String managementReviewB = (String)attributes.get("managementReviewB");

		if (managementReviewB != null) {
			setManagementReviewB(managementReviewB);
		}

		String qMRefmanagementReviewB = (String)attributes.get(
			"qMRefmanagementReviewB");

		if (qMRefmanagementReviewB != null) {
			setQMRefmanagementReviewB(qMRefmanagementReviewB);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}
	}

	@Override
	public AccCerBodyManageReq cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acc cer body manage req ID of this acc cer body manage req.
	 *
	 * @return the acc cer body manage req ID of this acc cer body manage req
	 */
	@Override
	public long getAccCerBodyManageReqId() {
		return model.getAccCerBodyManageReqId();
	}

	/**
	 * Returns the application process of this acc cer body manage req.
	 *
	 * @return the application process of this acc cer body manage req
	 */
	@Override
	public String getApplicationProcess() {
		return model.getApplicationProcess();
	}

	/**
	 * Returns the application review of this acc cer body manage req.
	 *
	 * @return the application review of this acc cer body manage req
	 */
	@Override
	public String getApplicationReview() {
		return model.getApplicationReview();
	}

	/**
	 * Returns the audit planning of this acc cer body manage req.
	 *
	 * @return the audit planning of this acc cer body manage req
	 */
	@Override
	public String getAuditPlanning() {
		return model.getAuditPlanning();
	}

	/**
	 * Returns the audit process of this acc cer body manage req.
	 *
	 * @return the audit process of this acc cer body manage req
	 */
	@Override
	public String getAuditProcess() {
		return model.getAuditProcess();
	}

	/**
	 * Returns the audit report of this acc cer body manage req.
	 *
	 * @return the audit report of this acc cer body manage req
	 */
	@Override
	public String getAuditReport() {
		return model.getAuditReport();
	}

	/**
	 * Returns the audit team of this acc cer body manage req.
	 *
	 * @return the audit team of this acc cer body manage req
	 */
	@Override
	public String getAuditTeam() {
		return model.getAuditTeam();
	}

	/**
	 * Returns the audit time of this acc cer body manage req.
	 *
	 * @return the audit time of this acc cer body manage req
	 */
	@Override
	public String getAuditTime() {
		return model.getAuditTime();
	}

	/**
	 * Returns the certification cycle of this acc cer body manage req.
	 *
	 * @return the certification cycle of this acc cer body manage req
	 */
	@Override
	public String getCertificationCycle() {
		return model.getCertificationCycle();
	}

	/**
	 * Returns the certification doc of this acc cer body manage req.
	 *
	 * @return the certification doc of this acc cer body manage req
	 */
	@Override
	public String getCertificationDoc() {
		return model.getCertificationDoc();
	}

	/**
	 * Returns the company ID of this acc cer body manage req.
	 *
	 * @return the company ID of this acc cer body manage req
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the corrective actions of this acc cer body manage req.
	 *
	 * @return the corrective actions of this acc cer body manage req
	 */
	@Override
	public String getCorrectiveActions() {
		return model.getCorrectiveActions();
	}

	/**
	 * Returns the create date of this acc cer body manage req.
	 *
	 * @return the create date of this acc cer body manage req
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the criteria req of this acc cer body manage req.
	 *
	 * @return the criteria req of this acc cer body manage req
	 */
	@Override
	public String getCriteriaReq() {
		return model.getCriteriaReq();
	}

	/**
	 * Returns the decision on appeals of this acc cer body manage req.
	 *
	 * @return the decision on appeals of this acc cer body manage req
	 */
	@Override
	public String getDecisionOnAppeals() {
		return model.getDecisionOnAppeals();
	}

	/**
	 * Returns the desc of process of this acc cer body manage req.
	 *
	 * @return the desc of process of this acc cer body manage req
	 */
	@Override
	public String getDescOfProcess() {
		return model.getDescOfProcess();
	}

	/**
	 * Returns the design dev b of this acc cer body manage req.
	 *
	 * @return the design dev b of this acc cer body manage req
	 */
	@Override
	public String getDesignDevB() {
		return model.getDesignDevB();
	}

	/**
	 * Returns the doc control procedure of this acc cer body manage req.
	 *
	 * @return the doc control procedure of this acc cer body manage req
	 */
	@Override
	public String getDocControlProcedure() {
		return model.getDocControlProcedure();
	}

	/**
	 * Returns the enforcable arrangements of this acc cer body manage req.
	 *
	 * @return the enforcable arrangements of this acc cer body manage req
	 */
	@Override
	public String getEnforcableArrangements() {
		return model.getEnforcableArrangements();
	}

	/**
	 * Returns the ensure confidential of this acc cer body manage req.
	 *
	 * @return the ensure confidential of this acc cer body manage req
	 */
	@Override
	public String getEnsureConfidential() {
		return model.getEnsureConfidential();
	}

	/**
	 * Returns the group ID of this acc cer body manage req.
	 *
	 * @return the group ID of this acc cer body manage req
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the handling complaints of this acc cer body manage req.
	 *
	 * @return the handling complaints of this acc cer body manage req
	 */
	@Override
	public String getHandlingComplaints() {
		return model.getHandlingComplaints();
	}

	/**
	 * Returns the handling req of this acc cer body manage req.
	 *
	 * @return the handling req of this acc cer body manage req
	 */
	@Override
	public String getHandlingReq() {
		return model.getHandlingReq();
	}

	/**
	 * Returns the identification proc of this acc cer body manage req.
	 *
	 * @return the identification proc of this acc cer body manage req
	 */
	@Override
	public String getIdentificationProc() {
		return model.getIdentificationProc();
	}

	/**
	 * Returns the impartiality policies of this acc cer body manage req.
	 *
	 * @return the impartiality policies of this acc cer body manage req
	 */
	@Override
	public String getImpartialityPolicies() {
		return model.getImpartialityPolicies();
	}

	/**
	 * Returns the impartiality policy of this acc cer body manage req.
	 *
	 * @return the impartiality policy of this acc cer body manage req
	 */
	@Override
	public String getImpartialityPolicy() {
		return model.getImpartialityPolicy();
	}

	/**
	 * Returns the informing mechanism of this acc cer body manage req.
	 *
	 * @return the informing mechanism of this acc cer body manage req
	 */
	@Override
	public String getInformingMechanism() {
		return model.getInformingMechanism();
	}

	/**
	 * Returns the initial competence of this acc cer body manage req.
	 *
	 * @return the initial competence of this acc cer body manage req
	 */
	@Override
	public String getInitialCompetence() {
		return model.getInitialCompetence();
	}

	/**
	 * Returns the interested party needs b of this acc cer body manage req.
	 *
	 * @return the interested party needs b of this acc cer body manage req
	 */
	@Override
	public String getInterestedPartyNeedsB() {
		return model.getInterestedPartyNeedsB();
	}

	/**
	 * Returns the internal audits of this acc cer body manage req.
	 *
	 * @return the internal audits of this acc cer body manage req
	 */
	@Override
	public String getInternalAudits() {
		return model.getInternalAudits();
	}

	/**
	 * Returns the janaac application ID of this acc cer body manage req.
	 *
	 * @return the janaac application ID of this acc cer body manage req
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the management review of this acc cer body manage req.
	 *
	 * @return the management review of this acc cer body manage req
	 */
	@Override
	public String getManagementReview() {
		return model.getManagementReview();
	}

	/**
	 * Returns the management review b of this acc cer body manage req.
	 *
	 * @return the management review b of this acc cer body manage req
	 */
	@Override
	public String getManagementReviewB() {
		return model.getManagementReviewB();
	}

	/**
	 * Returns the managemnt sys of this acc cer body manage req.
	 *
	 * @return the managemnt sys of this acc cer body manage req
	 */
	@Override
	public String getManagemntSys() {
		return model.getManagemntSys();
	}

	/**
	 * Returns the manage sys manual of this acc cer body manage req.
	 *
	 * @return the manage sys manual of this acc cer body manage req
	 */
	@Override
	public String getManageSysManual() {
		return model.getManageSysManual();
	}

	/**
	 * Returns the manage sys objective of this acc cer body manage req.
	 *
	 * @return the manage sys objective of this acc cer body manage req
	 */
	@Override
	public String getManageSysObjective() {
		return model.getManageSysObjective();
	}

	/**
	 * Returns the manage sys policies of this acc cer body manage req.
	 *
	 * @return the manage sys policies of this acc cer body manage req
	 */
	@Override
	public String getManageSysPolicies() {
		return model.getManageSysPolicies();
	}

	/**
	 * Returns the modified date of this acc cer body manage req.
	 *
	 * @return the modified date of this acc cer body manage req
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the monitoring competence of this acc cer body manage req.
	 *
	 * @return the monitoring competence of this acc cer body manage req
	 */
	@Override
	public String getMonitoringCompetence() {
		return model.getMonitoringCompetence();
	}

	/**
	 * Returns the on site audit of this acc cer body manage req.
	 *
	 * @return the on site audit of this acc cer body manage req
	 */
	@Override
	public String getOnSiteAudit() {
		return model.getOnSiteAudit();
	}

	/**
	 * Returns the option follow of this acc cer body manage req.
	 *
	 * @return the option follow of this acc cer body manage req
	 */
	@Override
	public String getOptionFollow() {
		return model.getOptionFollow();
	}

	/**
	 * Returns the org structure of this acc cer body manage req.
	 *
	 * @return the org structure of this acc cer body manage req
	 */
	@Override
	public String getOrgStructure() {
		return model.getOrgStructure();
	}

	/**
	 * Returns the primary key of this acc cer body manage req.
	 *
	 * @return the primary key of this acc cer body manage req
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the process for control of this acc cer body manage req.
	 *
	 * @return the process for control of this acc cer body manage req
	 */
	@Override
	public String getProcessForControl() {
		return model.getProcessForControl();
	}

	/**
	 * Returns the process for monitor of this acc cer body manage req.
	 *
	 * @return the process for monitor of this acc cer body manage req
	 */
	@Override
	public String getProcessForMonitor() {
		return model.getProcessForMonitor();
	}

	/**
	 * Returns the process granting of this acc cer body manage req.
	 *
	 * @return the process granting of this acc cer body manage req
	 */
	@Override
	public String getProcessGranting() {
		return model.getProcessGranting();
	}

	/**
	 * Returns the provision inform of this acc cer body manage req.
	 *
	 * @return the provision inform of this acc cer body manage req
	 */
	@Override
	public String getProvisionInform() {
		return model.getProvisionInform();
	}

	/**
	 * Returns the q m ref application of this acc cer body manage req.
	 *
	 * @return the q m ref application of this acc cer body manage req
	 */
	@Override
	public String getQMRefApplication() {
		return model.getQMRefApplication();
	}

	/**
	 * Returns the q m ref audit process of this acc cer body manage req.
	 *
	 * @return the q m ref audit process of this acc cer body manage req
	 */
	@Override
	public String getQMRefAuditProcess() {
		return model.getQMRefAuditProcess();
	}

	/**
	 * Returns the q m ref audit report of this acc cer body manage req.
	 *
	 * @return the q m ref audit report of this acc cer body manage req
	 */
	@Override
	public String getQMRefAuditReport() {
		return model.getQMRefAuditReport();
	}

	/**
	 * Returns the q m ref audit team of this acc cer body manage req.
	 *
	 * @return the q m ref audit team of this acc cer body manage req
	 */
	@Override
	public String getQMRefAuditTeam() {
		return model.getQMRefAuditTeam();
	}

	/**
	 * Returns the q m ref audit time of this acc cer body manage req.
	 *
	 * @return the q m ref audit time of this acc cer body manage req
	 */
	@Override
	public String getQMRefAuditTime() {
		return model.getQMRefAuditTime();
	}

	/**
	 * Returns the q m ref certi cycle of this acc cer body manage req.
	 *
	 * @return the q m ref certi cycle of this acc cer body manage req
	 */
	@Override
	public String getQMRefCertiCycle() {
		return model.getQMRefCertiCycle();
	}

	/**
	 * Returns the q m ref certification of this acc cer body manage req.
	 *
	 * @return the q m ref certification of this acc cer body manage req
	 */
	@Override
	public String getQMRefCertification() {
		return model.getQMRefCertification();
	}

	/**
	 * Returns the q m ref complaints of this acc cer body manage req.
	 *
	 * @return the q m ref complaints of this acc cer body manage req
	 */
	@Override
	public String getQMRefComplaints() {
		return model.getQMRefComplaints();
	}

	/**
	 * Returns the q m ref corrective of this acc cer body manage req.
	 *
	 * @return the q m ref corrective of this acc cer body manage req
	 */
	@Override
	public String getQMRefCorrective() {
		return model.getQMRefCorrective();
	}

	/**
	 * Returns the q m ref criteria of this acc cer body manage req.
	 *
	 * @return the q m ref criteria of this acc cer body manage req
	 */
	@Override
	public String getQMRefCriteria() {
		return model.getQMRefCriteria();
	}

	/**
	 * Returns the q m ref decision of this acc cer body manage req.
	 *
	 * @return the q m ref decision of this acc cer body manage req
	 */
	@Override
	public String getQMRefDecision() {
		return model.getQMRefDecision();
	}

	/**
	 * Returns the q m ref desc process of this acc cer body manage req.
	 *
	 * @return the q m ref desc process of this acc cer body manage req
	 */
	@Override
	public String getQMRefDescProcess() {
		return model.getQMRefDescProcess();
	}

	/**
	 * Returns the q m ref design b of this acc cer body manage req.
	 *
	 * @return the q m ref design b of this acc cer body manage req
	 */
	@Override
	public String getQMRefDesignB() {
		return model.getQMRefDesignB();
	}

	/**
	 * Returns the q m ref doc control of this acc cer body manage req.
	 *
	 * @return the q m ref doc control of this acc cer body manage req
	 */
	@Override
	public String getQMRefDocControl() {
		return model.getQMRefDocControl();
	}

	/**
	 * Returns the q m ref enforcable of this acc cer body manage req.
	 *
	 * @return the q m ref enforcable of this acc cer body manage req
	 */
	@Override
	public String getQMRefEnforcable() {
		return model.getQMRefEnforcable();
	}

	/**
	 * Returns the q m ref ensure confid of this acc cer body manage req.
	 *
	 * @return the q m ref ensure confid of this acc cer body manage req
	 */
	@Override
	public String getQMRefEnsureConfid() {
		return model.getQMRefEnsureConfid();
	}

	/**
	 * Returns the q m ref governing of this acc cer body manage req.
	 *
	 * @return the q m ref governing of this acc cer body manage req
	 */
	@Override
	public String getQMRefGoverning() {
		return model.getQMRefGoverning();
	}

	/**
	 * Returns the q m ref granting of this acc cer body manage req.
	 *
	 * @return the q m ref granting of this acc cer body manage req
	 */
	@Override
	public String getQMRefGranting() {
		return model.getQMRefGranting();
	}

	/**
	 * Returns the q m ref handling of this acc cer body manage req.
	 *
	 * @return the q m ref handling of this acc cer body manage req
	 */
	@Override
	public String getQMRefHandling() {
		return model.getQMRefHandling();
	}

	/**
	 * Returns the q m ref identification of this acc cer body manage req.
	 *
	 * @return the q m ref identification of this acc cer body manage req
	 */
	@Override
	public String getQMRefIdentification() {
		return model.getQMRefIdentification();
	}

	/**
	 * Returns the q m ref impartiality of this acc cer body manage req.
	 *
	 * @return the q m ref impartiality of this acc cer body manage req
	 */
	@Override
	public String getQMRefImpartiality() {
		return model.getQMRefImpartiality();
	}

	/**
	 * Returns the q m ref impart policy of this acc cer body manage req.
	 *
	 * @return the q m ref impart policy of this acc cer body manage req
	 */
	@Override
	public String getQMRefImpartPolicy() {
		return model.getQMRefImpartPolicy();
	}

	/**
	 * Returns the q m ref informing of this acc cer body manage req.
	 *
	 * @return the q m ref informing of this acc cer body manage req
	 */
	@Override
	public String getQMRefInforming() {
		return model.getQMRefInforming();
	}

	/**
	 * Returns the q m ref initial of this acc cer body manage req.
	 *
	 * @return the q m ref initial of this acc cer body manage req
	 */
	@Override
	public String getQMRefInitial() {
		return model.getQMRefInitial();
	}

	/**
	 * Returns the q m ref interested b of this acc cer body manage req.
	 *
	 * @return the q m ref interested b of this acc cer body manage req
	 */
	@Override
	public String getQMRefInterestedB() {
		return model.getQMRefInterestedB();
	}

	/**
	 * Returns the q m ref internal of this acc cer body manage req.
	 *
	 * @return the q m ref internal of this acc cer body manage req
	 */
	@Override
	public String getQMRefInternal() {
		return model.getQMRefInternal();
	}

	/**
	 * Returns the q m ref management rev of this acc cer body manage req.
	 *
	 * @return the q m ref management rev of this acc cer body manage req
	 */
	@Override
	public String getQMRefManagementRev() {
		return model.getQMRefManagementRev();
	}

	/**
	 * Returns the q m refmanagement review b of this acc cer body manage req.
	 *
	 * @return the q m refmanagement review b of this acc cer body manage req
	 */
	@Override
	public String getQMRefmanagementReviewB() {
		return model.getQMRefmanagementReviewB();
	}

	/**
	 * Returns the q m ref managemnt of this acc cer body manage req.
	 *
	 * @return the q m ref managemnt of this acc cer body manage req
	 */
	@Override
	public String getQMRefManagemnt() {
		return model.getQMRefManagemnt();
	}

	/**
	 * Returns the q m ref manual of this acc cer body manage req.
	 *
	 * @return the q m ref manual of this acc cer body manage req
	 */
	@Override
	public String getQMRefManual() {
		return model.getQMRefManual();
	}

	/**
	 * Returns the q m ref monitoring of this acc cer body manage req.
	 *
	 * @return the q m ref monitoring of this acc cer body manage req
	 */
	@Override
	public String getQMRefMonitoring() {
		return model.getQMRefMonitoring();
	}

	/**
	 * Returns the q m ref monitor process of this acc cer body manage req.
	 *
	 * @return the q m ref monitor process of this acc cer body manage req
	 */
	@Override
	public String getQMRefMonitorProcess() {
		return model.getQMRefMonitorProcess();
	}

	/**
	 * Returns the q m ref objective of this acc cer body manage req.
	 *
	 * @return the q m ref objective of this acc cer body manage req
	 */
	@Override
	public String getQMRefObjective() {
		return model.getQMRefObjective();
	}

	/**
	 * Returns the q m refon site audit of this acc cer body manage req.
	 *
	 * @return the q m refon site audit of this acc cer body manage req
	 */
	@Override
	public String getQMRefonSiteAudit() {
		return model.getQMRefonSiteAudit();
	}

	/**
	 * Returns the q m ref org struct of this acc cer body manage req.
	 *
	 * @return the q m ref org struct of this acc cer body manage req
	 */
	@Override
	public String getQMRefOrgStruct() {
		return model.getQMRefOrgStruct();
	}

	/**
	 * Returns the q m ref planning of this acc cer body manage req.
	 *
	 * @return the q m ref planning of this acc cer body manage req
	 */
	@Override
	public String getQMRefPlanning() {
		return model.getQMRefPlanning();
	}

	/**
	 * Returns the q m ref policies of this acc cer body manage req.
	 *
	 * @return the q m ref policies of this acc cer body manage req
	 */
	@Override
	public String getQMRefPolicies() {
		return model.getQMRefPolicies();
	}

	/**
	 * Returns the q m ref process of this acc cer body manage req.
	 *
	 * @return the q m ref process of this acc cer body manage req
	 */
	@Override
	public String getQMRefProcess() {
		return model.getQMRefProcess();
	}

	/**
	 * Returns the q m ref provision of this acc cer body manage req.
	 *
	 * @return the q m ref provision of this acc cer body manage req
	 */
	@Override
	public String getQMRefProvision() {
		return model.getQMRefProvision();
	}

	/**
	 * Returns the q m ref qms scope b of this acc cer body manage req.
	 *
	 * @return the q m ref qms scope b of this acc cer body manage req
	 */
	@Override
	public String getQMRefQMSScopeB() {
		return model.getQMRefQMSScopeB();
	}

	/**
	 * Returns the q m ref rec control of this acc cer body manage req.
	 *
	 * @return the q m ref rec control of this acc cer body manage req
	 */
	@Override
	public String getQMRefRecControl() {
		return model.getQMRefRecControl();
	}

	/**
	 * Returns the q m ref retention policy of this acc cer body manage req.
	 *
	 * @return the q m ref retention policy of this acc cer body manage req
	 */
	@Override
	public String getQMRefRetentionPolicy() {
		return model.getQMRefRetentionPolicy();
	}

	/**
	 * Returns the q m ref retention proc of this acc cer body manage req.
	 *
	 * @return the q m ref retention proc of this acc cer body manage req
	 */
	@Override
	public String getQMRefRetentionProc() {
		return model.getQMRefRetentionProc();
	}

	/**
	 * Returns the q m ref review of this acc cer body manage req.
	 *
	 * @return the q m ref review of this acc cer body manage req
	 */
	@Override
	public String getQMRefReview() {
		return model.getQMRefReview();
	}

	/**
	 * Returns the q m ref review prior of this acc cer body manage req.
	 *
	 * @return the q m ref review prior of this acc cer body manage req
	 */
	@Override
	public String getQMRefReviewPrior() {
		return model.getQMRefReviewPrior();
	}

	/**
	 * Returns the q m ref risk of this acc cer body manage req.
	 *
	 * @return the q m ref risk of this acc cer body manage req
	 */
	@Override
	public String getQMRefRisk() {
		return model.getQMRefRisk();
	}

	/**
	 * Returns the q m ref sampling of this acc cer body manage req.
	 *
	 * @return the q m ref sampling of this acc cer body manage req
	 */
	@Override
	public String getQMRefSampling() {
		return model.getQMRefSampling();
	}

	/**
	 * Returns the q m ref selecting of this acc cer body manage req.
	 *
	 * @return the q m ref selecting of this acc cer body manage req
	 */
	@Override
	public String getQMRefSelecting() {
		return model.getQMRefSelecting();
	}

	/**
	 * Returns the q m ref suspension of this acc cer body manage req.
	 *
	 * @return the q m ref suspension of this acc cer body manage req
	 */
	@Override
	public String getQMRefSuspension() {
		return model.getQMRefSuspension();
	}

	/**
	 * Returns the q m ref suspension proc of this acc cer body manage req.
	 *
	 * @return the q m ref suspension proc of this acc cer body manage req
	 */
	@Override
	public String getQMRefSuspensionProc() {
		return model.getQMRefSuspensionProc();
	}

	/**
	 * Returns the q m ref terms of this acc cer body manage req.
	 *
	 * @return the q m ref terms of this acc cer body manage req
	 */
	@Override
	public String getQMRefTerms() {
		return model.getQMRefTerms();
	}

	/**
	 * Returns the q m ref transfer of this acc cer body manage req.
	 *
	 * @return the q m ref transfer of this acc cer body manage req
	 */
	@Override
	public String getQMRefTransfer() {
		return model.getQMRefTransfer();
	}

	/**
	 * Returns the q m ref use of certi of this acc cer body manage req.
	 *
	 * @return the q m ref use of certi of this acc cer body manage req
	 */
	@Override
	public String getQMRefUseOfCerti() {
		return model.getQMRefUseOfCerti();
	}

	/**
	 * Returns the q m ref written of this acc cer body manage req.
	 *
	 * @return the q m ref written of this acc cer body manage req
	 */
	@Override
	public String getQMRefWritten() {
		return model.getQMRefWritten();
	}

	/**
	 * Returns the q ms scope b of this acc cer body manage req.
	 *
	 * @return the q ms scope b of this acc cer body manage req
	 */
	@Override
	public String getQMSScopeB() {
		return model.getQMSScopeB();
	}

	/**
	 * Returns the rec control proc of this acc cer body manage req.
	 *
	 * @return the rec control proc of this acc cer body manage req
	 */
	@Override
	public String getRecControlProc() {
		return model.getRecControlProc();
	}

	/**
	 * Returns the record retention policy of this acc cer body manage req.
	 *
	 * @return the record retention policy of this acc cer body manage req
	 */
	@Override
	public String getRecordRetentionPolicy() {
		return model.getRecordRetentionPolicy();
	}

	/**
	 * Returns the record retention proc of this acc cer body manage req.
	 *
	 * @return the record retention proc of this acc cer body manage req
	 */
	@Override
	public String getRecordRetentionProc() {
		return model.getRecordRetentionProc();
	}

	/**
	 * Returns the review prior decision of this acc cer body manage req.
	 *
	 * @return the review prior decision of this acc cer body manage req
	 */
	@Override
	public String getReviewPriorDecision() {
		return model.getReviewPriorDecision();
	}

	/**
	 * Returns the risk assessment of this acc cer body manage req.
	 *
	 * @return the risk assessment of this acc cer body manage req
	 */
	@Override
	public String getRiskAssessment() {
		return model.getRiskAssessment();
	}

	/**
	 * Returns the rules governing of this acc cer body manage req.
	 *
	 * @return the rules governing of this acc cer body manage req
	 */
	@Override
	public String getRulesGoverning() {
		return model.getRulesGoverning();
	}

	/**
	 * Returns the sampling program of this acc cer body manage req.
	 *
	 * @return the sampling program of this acc cer body manage req
	 */
	@Override
	public String getSamplingProgram() {
		return model.getSamplingProgram();
	}

	/**
	 * Returns the selecting training of this acc cer body manage req.
	 *
	 * @return the selecting training of this acc cer body manage req
	 */
	@Override
	public String getSelectingTraining() {
		return model.getSelectingTraining();
	}

	/**
	 * Returns the suspension policies of this acc cer body manage req.
	 *
	 * @return the suspension policies of this acc cer body manage req
	 */
	@Override
	public String getSuspensionPolicies() {
		return model.getSuspensionPolicies();
	}

	/**
	 * Returns the suspension procedure of this acc cer body manage req.
	 *
	 * @return the suspension procedure of this acc cer body manage req
	 */
	@Override
	public String getSuspensionProcedure() {
		return model.getSuspensionProcedure();
	}

	/**
	 * Returns the terms of reference of this acc cer body manage req.
	 *
	 * @return the terms of reference of this acc cer body manage req
	 */
	@Override
	public String getTermsOfReference() {
		return model.getTermsOfReference();
	}

	/**
	 * Returns the transfer certification of this acc cer body manage req.
	 *
	 * @return the transfer certification of this acc cer body manage req
	 */
	@Override
	public String getTransferCertification() {
		return model.getTransferCertification();
	}

	/**
	 * Returns the use of certification of this acc cer body manage req.
	 *
	 * @return the use of certification of this acc cer body manage req
	 */
	@Override
	public String getUseOfCertification() {
		return model.getUseOfCertification();
	}

	/**
	 * Returns the user ID of this acc cer body manage req.
	 *
	 * @return the user ID of this acc cer body manage req
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acc cer body manage req.
	 *
	 * @return the user name of this acc cer body manage req
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acc cer body manage req.
	 *
	 * @return the user uuid of this acc cer body manage req
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acc cer body manage req.
	 *
	 * @return the uuid of this acc cer body manage req
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the written agreement of this acc cer body manage req.
	 *
	 * @return the written agreement of this acc cer body manage req
	 */
	@Override
	public String getWrittenAgreement() {
		return model.getWrittenAgreement();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the acc cer body manage req ID of this acc cer body manage req.
	 *
	 * @param accCerBodyManageReqId the acc cer body manage req ID of this acc cer body manage req
	 */
	@Override
	public void setAccCerBodyManageReqId(long accCerBodyManageReqId) {
		model.setAccCerBodyManageReqId(accCerBodyManageReqId);
	}

	/**
	 * Sets the application process of this acc cer body manage req.
	 *
	 * @param applicationProcess the application process of this acc cer body manage req
	 */
	@Override
	public void setApplicationProcess(String applicationProcess) {
		model.setApplicationProcess(applicationProcess);
	}

	/**
	 * Sets the application review of this acc cer body manage req.
	 *
	 * @param applicationReview the application review of this acc cer body manage req
	 */
	@Override
	public void setApplicationReview(String applicationReview) {
		model.setApplicationReview(applicationReview);
	}

	/**
	 * Sets the audit planning of this acc cer body manage req.
	 *
	 * @param auditPlanning the audit planning of this acc cer body manage req
	 */
	@Override
	public void setAuditPlanning(String auditPlanning) {
		model.setAuditPlanning(auditPlanning);
	}

	/**
	 * Sets the audit process of this acc cer body manage req.
	 *
	 * @param auditProcess the audit process of this acc cer body manage req
	 */
	@Override
	public void setAuditProcess(String auditProcess) {
		model.setAuditProcess(auditProcess);
	}

	/**
	 * Sets the audit report of this acc cer body manage req.
	 *
	 * @param auditReport the audit report of this acc cer body manage req
	 */
	@Override
	public void setAuditReport(String auditReport) {
		model.setAuditReport(auditReport);
	}

	/**
	 * Sets the audit team of this acc cer body manage req.
	 *
	 * @param auditTeam the audit team of this acc cer body manage req
	 */
	@Override
	public void setAuditTeam(String auditTeam) {
		model.setAuditTeam(auditTeam);
	}

	/**
	 * Sets the audit time of this acc cer body manage req.
	 *
	 * @param auditTime the audit time of this acc cer body manage req
	 */
	@Override
	public void setAuditTime(String auditTime) {
		model.setAuditTime(auditTime);
	}

	/**
	 * Sets the certification cycle of this acc cer body manage req.
	 *
	 * @param certificationCycle the certification cycle of this acc cer body manage req
	 */
	@Override
	public void setCertificationCycle(String certificationCycle) {
		model.setCertificationCycle(certificationCycle);
	}

	/**
	 * Sets the certification doc of this acc cer body manage req.
	 *
	 * @param certificationDoc the certification doc of this acc cer body manage req
	 */
	@Override
	public void setCertificationDoc(String certificationDoc) {
		model.setCertificationDoc(certificationDoc);
	}

	/**
	 * Sets the company ID of this acc cer body manage req.
	 *
	 * @param companyId the company ID of this acc cer body manage req
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the corrective actions of this acc cer body manage req.
	 *
	 * @param correctiveActions the corrective actions of this acc cer body manage req
	 */
	@Override
	public void setCorrectiveActions(String correctiveActions) {
		model.setCorrectiveActions(correctiveActions);
	}

	/**
	 * Sets the create date of this acc cer body manage req.
	 *
	 * @param createDate the create date of this acc cer body manage req
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the criteria req of this acc cer body manage req.
	 *
	 * @param criteriaReq the criteria req of this acc cer body manage req
	 */
	@Override
	public void setCriteriaReq(String criteriaReq) {
		model.setCriteriaReq(criteriaReq);
	}

	/**
	 * Sets the decision on appeals of this acc cer body manage req.
	 *
	 * @param decisionOnAppeals the decision on appeals of this acc cer body manage req
	 */
	@Override
	public void setDecisionOnAppeals(String decisionOnAppeals) {
		model.setDecisionOnAppeals(decisionOnAppeals);
	}

	/**
	 * Sets the desc of process of this acc cer body manage req.
	 *
	 * @param descOfProcess the desc of process of this acc cer body manage req
	 */
	@Override
	public void setDescOfProcess(String descOfProcess) {
		model.setDescOfProcess(descOfProcess);
	}

	/**
	 * Sets the design dev b of this acc cer body manage req.
	 *
	 * @param designDevB the design dev b of this acc cer body manage req
	 */
	@Override
	public void setDesignDevB(String designDevB) {
		model.setDesignDevB(designDevB);
	}

	/**
	 * Sets the doc control procedure of this acc cer body manage req.
	 *
	 * @param docControlProcedure the doc control procedure of this acc cer body manage req
	 */
	@Override
	public void setDocControlProcedure(String docControlProcedure) {
		model.setDocControlProcedure(docControlProcedure);
	}

	/**
	 * Sets the enforcable arrangements of this acc cer body manage req.
	 *
	 * @param enforcableArrangements the enforcable arrangements of this acc cer body manage req
	 */
	@Override
	public void setEnforcableArrangements(String enforcableArrangements) {
		model.setEnforcableArrangements(enforcableArrangements);
	}

	/**
	 * Sets the ensure confidential of this acc cer body manage req.
	 *
	 * @param ensureConfidential the ensure confidential of this acc cer body manage req
	 */
	@Override
	public void setEnsureConfidential(String ensureConfidential) {
		model.setEnsureConfidential(ensureConfidential);
	}

	/**
	 * Sets the group ID of this acc cer body manage req.
	 *
	 * @param groupId the group ID of this acc cer body manage req
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the handling complaints of this acc cer body manage req.
	 *
	 * @param handlingComplaints the handling complaints of this acc cer body manage req
	 */
	@Override
	public void setHandlingComplaints(String handlingComplaints) {
		model.setHandlingComplaints(handlingComplaints);
	}

	/**
	 * Sets the handling req of this acc cer body manage req.
	 *
	 * @param handlingReq the handling req of this acc cer body manage req
	 */
	@Override
	public void setHandlingReq(String handlingReq) {
		model.setHandlingReq(handlingReq);
	}

	/**
	 * Sets the identification proc of this acc cer body manage req.
	 *
	 * @param identificationProc the identification proc of this acc cer body manage req
	 */
	@Override
	public void setIdentificationProc(String identificationProc) {
		model.setIdentificationProc(identificationProc);
	}

	/**
	 * Sets the impartiality policies of this acc cer body manage req.
	 *
	 * @param impartialityPolicies the impartiality policies of this acc cer body manage req
	 */
	@Override
	public void setImpartialityPolicies(String impartialityPolicies) {
		model.setImpartialityPolicies(impartialityPolicies);
	}

	/**
	 * Sets the impartiality policy of this acc cer body manage req.
	 *
	 * @param impartialityPolicy the impartiality policy of this acc cer body manage req
	 */
	@Override
	public void setImpartialityPolicy(String impartialityPolicy) {
		model.setImpartialityPolicy(impartialityPolicy);
	}

	/**
	 * Sets the informing mechanism of this acc cer body manage req.
	 *
	 * @param informingMechanism the informing mechanism of this acc cer body manage req
	 */
	@Override
	public void setInformingMechanism(String informingMechanism) {
		model.setInformingMechanism(informingMechanism);
	}

	/**
	 * Sets the initial competence of this acc cer body manage req.
	 *
	 * @param initialCompetence the initial competence of this acc cer body manage req
	 */
	@Override
	public void setInitialCompetence(String initialCompetence) {
		model.setInitialCompetence(initialCompetence);
	}

	/**
	 * Sets the interested party needs b of this acc cer body manage req.
	 *
	 * @param interestedPartyNeedsB the interested party needs b of this acc cer body manage req
	 */
	@Override
	public void setInterestedPartyNeedsB(String interestedPartyNeedsB) {
		model.setInterestedPartyNeedsB(interestedPartyNeedsB);
	}

	/**
	 * Sets the internal audits of this acc cer body manage req.
	 *
	 * @param internalAudits the internal audits of this acc cer body manage req
	 */
	@Override
	public void setInternalAudits(String internalAudits) {
		model.setInternalAudits(internalAudits);
	}

	/**
	 * Sets the janaac application ID of this acc cer body manage req.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc cer body manage req
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the management review of this acc cer body manage req.
	 *
	 * @param managementReview the management review of this acc cer body manage req
	 */
	@Override
	public void setManagementReview(String managementReview) {
		model.setManagementReview(managementReview);
	}

	/**
	 * Sets the management review b of this acc cer body manage req.
	 *
	 * @param managementReviewB the management review b of this acc cer body manage req
	 */
	@Override
	public void setManagementReviewB(String managementReviewB) {
		model.setManagementReviewB(managementReviewB);
	}

	/**
	 * Sets the managemnt sys of this acc cer body manage req.
	 *
	 * @param managemntSys the managemnt sys of this acc cer body manage req
	 */
	@Override
	public void setManagemntSys(String managemntSys) {
		model.setManagemntSys(managemntSys);
	}

	/**
	 * Sets the manage sys manual of this acc cer body manage req.
	 *
	 * @param manageSysManual the manage sys manual of this acc cer body manage req
	 */
	@Override
	public void setManageSysManual(String manageSysManual) {
		model.setManageSysManual(manageSysManual);
	}

	/**
	 * Sets the manage sys objective of this acc cer body manage req.
	 *
	 * @param manageSysObjective the manage sys objective of this acc cer body manage req
	 */
	@Override
	public void setManageSysObjective(String manageSysObjective) {
		model.setManageSysObjective(manageSysObjective);
	}

	/**
	 * Sets the manage sys policies of this acc cer body manage req.
	 *
	 * @param manageSysPolicies the manage sys policies of this acc cer body manage req
	 */
	@Override
	public void setManageSysPolicies(String manageSysPolicies) {
		model.setManageSysPolicies(manageSysPolicies);
	}

	/**
	 * Sets the modified date of this acc cer body manage req.
	 *
	 * @param modifiedDate the modified date of this acc cer body manage req
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the monitoring competence of this acc cer body manage req.
	 *
	 * @param monitoringCompetence the monitoring competence of this acc cer body manage req
	 */
	@Override
	public void setMonitoringCompetence(String monitoringCompetence) {
		model.setMonitoringCompetence(monitoringCompetence);
	}

	/**
	 * Sets the on site audit of this acc cer body manage req.
	 *
	 * @param onSiteAudit the on site audit of this acc cer body manage req
	 */
	@Override
	public void setOnSiteAudit(String onSiteAudit) {
		model.setOnSiteAudit(onSiteAudit);
	}

	/**
	 * Sets the option follow of this acc cer body manage req.
	 *
	 * @param optionFollow the option follow of this acc cer body manage req
	 */
	@Override
	public void setOptionFollow(String optionFollow) {
		model.setOptionFollow(optionFollow);
	}

	/**
	 * Sets the org structure of this acc cer body manage req.
	 *
	 * @param orgStructure the org structure of this acc cer body manage req
	 */
	@Override
	public void setOrgStructure(String orgStructure) {
		model.setOrgStructure(orgStructure);
	}

	/**
	 * Sets the primary key of this acc cer body manage req.
	 *
	 * @param primaryKey the primary key of this acc cer body manage req
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the process for control of this acc cer body manage req.
	 *
	 * @param processForControl the process for control of this acc cer body manage req
	 */
	@Override
	public void setProcessForControl(String processForControl) {
		model.setProcessForControl(processForControl);
	}

	/**
	 * Sets the process for monitor of this acc cer body manage req.
	 *
	 * @param processForMonitor the process for monitor of this acc cer body manage req
	 */
	@Override
	public void setProcessForMonitor(String processForMonitor) {
		model.setProcessForMonitor(processForMonitor);
	}

	/**
	 * Sets the process granting of this acc cer body manage req.
	 *
	 * @param processGranting the process granting of this acc cer body manage req
	 */
	@Override
	public void setProcessGranting(String processGranting) {
		model.setProcessGranting(processGranting);
	}

	/**
	 * Sets the provision inform of this acc cer body manage req.
	 *
	 * @param provisionInform the provision inform of this acc cer body manage req
	 */
	@Override
	public void setProvisionInform(String provisionInform) {
		model.setProvisionInform(provisionInform);
	}

	/**
	 * Sets the q m ref application of this acc cer body manage req.
	 *
	 * @param qMRefApplication the q m ref application of this acc cer body manage req
	 */
	@Override
	public void setQMRefApplication(String qMRefApplication) {
		model.setQMRefApplication(qMRefApplication);
	}

	/**
	 * Sets the q m ref audit process of this acc cer body manage req.
	 *
	 * @param qMRefAuditProcess the q m ref audit process of this acc cer body manage req
	 */
	@Override
	public void setQMRefAuditProcess(String qMRefAuditProcess) {
		model.setQMRefAuditProcess(qMRefAuditProcess);
	}

	/**
	 * Sets the q m ref audit report of this acc cer body manage req.
	 *
	 * @param qMRefAuditReport the q m ref audit report of this acc cer body manage req
	 */
	@Override
	public void setQMRefAuditReport(String qMRefAuditReport) {
		model.setQMRefAuditReport(qMRefAuditReport);
	}

	/**
	 * Sets the q m ref audit team of this acc cer body manage req.
	 *
	 * @param qMRefAuditTeam the q m ref audit team of this acc cer body manage req
	 */
	@Override
	public void setQMRefAuditTeam(String qMRefAuditTeam) {
		model.setQMRefAuditTeam(qMRefAuditTeam);
	}

	/**
	 * Sets the q m ref audit time of this acc cer body manage req.
	 *
	 * @param qMRefAuditTime the q m ref audit time of this acc cer body manage req
	 */
	@Override
	public void setQMRefAuditTime(String qMRefAuditTime) {
		model.setQMRefAuditTime(qMRefAuditTime);
	}

	/**
	 * Sets the q m ref certi cycle of this acc cer body manage req.
	 *
	 * @param qMRefCertiCycle the q m ref certi cycle of this acc cer body manage req
	 */
	@Override
	public void setQMRefCertiCycle(String qMRefCertiCycle) {
		model.setQMRefCertiCycle(qMRefCertiCycle);
	}

	/**
	 * Sets the q m ref certification of this acc cer body manage req.
	 *
	 * @param qMRefCertification the q m ref certification of this acc cer body manage req
	 */
	@Override
	public void setQMRefCertification(String qMRefCertification) {
		model.setQMRefCertification(qMRefCertification);
	}

	/**
	 * Sets the q m ref complaints of this acc cer body manage req.
	 *
	 * @param qMRefComplaints the q m ref complaints of this acc cer body manage req
	 */
	@Override
	public void setQMRefComplaints(String qMRefComplaints) {
		model.setQMRefComplaints(qMRefComplaints);
	}

	/**
	 * Sets the q m ref corrective of this acc cer body manage req.
	 *
	 * @param qMRefCorrective the q m ref corrective of this acc cer body manage req
	 */
	@Override
	public void setQMRefCorrective(String qMRefCorrective) {
		model.setQMRefCorrective(qMRefCorrective);
	}

	/**
	 * Sets the q m ref criteria of this acc cer body manage req.
	 *
	 * @param qMRefCriteria the q m ref criteria of this acc cer body manage req
	 */
	@Override
	public void setQMRefCriteria(String qMRefCriteria) {
		model.setQMRefCriteria(qMRefCriteria);
	}

	/**
	 * Sets the q m ref decision of this acc cer body manage req.
	 *
	 * @param qMRefDecision the q m ref decision of this acc cer body manage req
	 */
	@Override
	public void setQMRefDecision(String qMRefDecision) {
		model.setQMRefDecision(qMRefDecision);
	}

	/**
	 * Sets the q m ref desc process of this acc cer body manage req.
	 *
	 * @param qMRefDescProcess the q m ref desc process of this acc cer body manage req
	 */
	@Override
	public void setQMRefDescProcess(String qMRefDescProcess) {
		model.setQMRefDescProcess(qMRefDescProcess);
	}

	/**
	 * Sets the q m ref design b of this acc cer body manage req.
	 *
	 * @param qMRefDesignB the q m ref design b of this acc cer body manage req
	 */
	@Override
	public void setQMRefDesignB(String qMRefDesignB) {
		model.setQMRefDesignB(qMRefDesignB);
	}

	/**
	 * Sets the q m ref doc control of this acc cer body manage req.
	 *
	 * @param qMRefDocControl the q m ref doc control of this acc cer body manage req
	 */
	@Override
	public void setQMRefDocControl(String qMRefDocControl) {
		model.setQMRefDocControl(qMRefDocControl);
	}

	/**
	 * Sets the q m ref enforcable of this acc cer body manage req.
	 *
	 * @param qMRefEnforcable the q m ref enforcable of this acc cer body manage req
	 */
	@Override
	public void setQMRefEnforcable(String qMRefEnforcable) {
		model.setQMRefEnforcable(qMRefEnforcable);
	}

	/**
	 * Sets the q m ref ensure confid of this acc cer body manage req.
	 *
	 * @param qMRefEnsureConfid the q m ref ensure confid of this acc cer body manage req
	 */
	@Override
	public void setQMRefEnsureConfid(String qMRefEnsureConfid) {
		model.setQMRefEnsureConfid(qMRefEnsureConfid);
	}

	/**
	 * Sets the q m ref governing of this acc cer body manage req.
	 *
	 * @param qMRefGoverning the q m ref governing of this acc cer body manage req
	 */
	@Override
	public void setQMRefGoverning(String qMRefGoverning) {
		model.setQMRefGoverning(qMRefGoverning);
	}

	/**
	 * Sets the q m ref granting of this acc cer body manage req.
	 *
	 * @param qMRefGranting the q m ref granting of this acc cer body manage req
	 */
	@Override
	public void setQMRefGranting(String qMRefGranting) {
		model.setQMRefGranting(qMRefGranting);
	}

	/**
	 * Sets the q m ref handling of this acc cer body manage req.
	 *
	 * @param qMRefHandling the q m ref handling of this acc cer body manage req
	 */
	@Override
	public void setQMRefHandling(String qMRefHandling) {
		model.setQMRefHandling(qMRefHandling);
	}

	/**
	 * Sets the q m ref identification of this acc cer body manage req.
	 *
	 * @param qMRefIdentification the q m ref identification of this acc cer body manage req
	 */
	@Override
	public void setQMRefIdentification(String qMRefIdentification) {
		model.setQMRefIdentification(qMRefIdentification);
	}

	/**
	 * Sets the q m ref impartiality of this acc cer body manage req.
	 *
	 * @param qMRefImpartiality the q m ref impartiality of this acc cer body manage req
	 */
	@Override
	public void setQMRefImpartiality(String qMRefImpartiality) {
		model.setQMRefImpartiality(qMRefImpartiality);
	}

	/**
	 * Sets the q m ref impart policy of this acc cer body manage req.
	 *
	 * @param qMRefImpartPolicy the q m ref impart policy of this acc cer body manage req
	 */
	@Override
	public void setQMRefImpartPolicy(String qMRefImpartPolicy) {
		model.setQMRefImpartPolicy(qMRefImpartPolicy);
	}

	/**
	 * Sets the q m ref informing of this acc cer body manage req.
	 *
	 * @param qMRefInforming the q m ref informing of this acc cer body manage req
	 */
	@Override
	public void setQMRefInforming(String qMRefInforming) {
		model.setQMRefInforming(qMRefInforming);
	}

	/**
	 * Sets the q m ref initial of this acc cer body manage req.
	 *
	 * @param qMRefInitial the q m ref initial of this acc cer body manage req
	 */
	@Override
	public void setQMRefInitial(String qMRefInitial) {
		model.setQMRefInitial(qMRefInitial);
	}

	/**
	 * Sets the q m ref interested b of this acc cer body manage req.
	 *
	 * @param qMRefInterestedB the q m ref interested b of this acc cer body manage req
	 */
	@Override
	public void setQMRefInterestedB(String qMRefInterestedB) {
		model.setQMRefInterestedB(qMRefInterestedB);
	}

	/**
	 * Sets the q m ref internal of this acc cer body manage req.
	 *
	 * @param qMRefInternal the q m ref internal of this acc cer body manage req
	 */
	@Override
	public void setQMRefInternal(String qMRefInternal) {
		model.setQMRefInternal(qMRefInternal);
	}

	/**
	 * Sets the q m ref management rev of this acc cer body manage req.
	 *
	 * @param qMRefManagementRev the q m ref management rev of this acc cer body manage req
	 */
	@Override
	public void setQMRefManagementRev(String qMRefManagementRev) {
		model.setQMRefManagementRev(qMRefManagementRev);
	}

	/**
	 * Sets the q m refmanagement review b of this acc cer body manage req.
	 *
	 * @param qMRefmanagementReviewB the q m refmanagement review b of this acc cer body manage req
	 */
	@Override
	public void setQMRefmanagementReviewB(String qMRefmanagementReviewB) {
		model.setQMRefmanagementReviewB(qMRefmanagementReviewB);
	}

	/**
	 * Sets the q m ref managemnt of this acc cer body manage req.
	 *
	 * @param qMRefManagemnt the q m ref managemnt of this acc cer body manage req
	 */
	@Override
	public void setQMRefManagemnt(String qMRefManagemnt) {
		model.setQMRefManagemnt(qMRefManagemnt);
	}

	/**
	 * Sets the q m ref manual of this acc cer body manage req.
	 *
	 * @param qMRefManual the q m ref manual of this acc cer body manage req
	 */
	@Override
	public void setQMRefManual(String qMRefManual) {
		model.setQMRefManual(qMRefManual);
	}

	/**
	 * Sets the q m ref monitoring of this acc cer body manage req.
	 *
	 * @param qMRefMonitoring the q m ref monitoring of this acc cer body manage req
	 */
	@Override
	public void setQMRefMonitoring(String qMRefMonitoring) {
		model.setQMRefMonitoring(qMRefMonitoring);
	}

	/**
	 * Sets the q m ref monitor process of this acc cer body manage req.
	 *
	 * @param qMRefMonitorProcess the q m ref monitor process of this acc cer body manage req
	 */
	@Override
	public void setQMRefMonitorProcess(String qMRefMonitorProcess) {
		model.setQMRefMonitorProcess(qMRefMonitorProcess);
	}

	/**
	 * Sets the q m ref objective of this acc cer body manage req.
	 *
	 * @param qMRefObjective the q m ref objective of this acc cer body manage req
	 */
	@Override
	public void setQMRefObjective(String qMRefObjective) {
		model.setQMRefObjective(qMRefObjective);
	}

	/**
	 * Sets the q m refon site audit of this acc cer body manage req.
	 *
	 * @param qMRefonSiteAudit the q m refon site audit of this acc cer body manage req
	 */
	@Override
	public void setQMRefonSiteAudit(String qMRefonSiteAudit) {
		model.setQMRefonSiteAudit(qMRefonSiteAudit);
	}

	/**
	 * Sets the q m ref org struct of this acc cer body manage req.
	 *
	 * @param qMRefOrgStruct the q m ref org struct of this acc cer body manage req
	 */
	@Override
	public void setQMRefOrgStruct(String qMRefOrgStruct) {
		model.setQMRefOrgStruct(qMRefOrgStruct);
	}

	/**
	 * Sets the q m ref planning of this acc cer body manage req.
	 *
	 * @param qMRefPlanning the q m ref planning of this acc cer body manage req
	 */
	@Override
	public void setQMRefPlanning(String qMRefPlanning) {
		model.setQMRefPlanning(qMRefPlanning);
	}

	/**
	 * Sets the q m ref policies of this acc cer body manage req.
	 *
	 * @param qMRefPolicies the q m ref policies of this acc cer body manage req
	 */
	@Override
	public void setQMRefPolicies(String qMRefPolicies) {
		model.setQMRefPolicies(qMRefPolicies);
	}

	/**
	 * Sets the q m ref process of this acc cer body manage req.
	 *
	 * @param qMRefProcess the q m ref process of this acc cer body manage req
	 */
	@Override
	public void setQMRefProcess(String qMRefProcess) {
		model.setQMRefProcess(qMRefProcess);
	}

	/**
	 * Sets the q m ref provision of this acc cer body manage req.
	 *
	 * @param qMRefProvision the q m ref provision of this acc cer body manage req
	 */
	@Override
	public void setQMRefProvision(String qMRefProvision) {
		model.setQMRefProvision(qMRefProvision);
	}

	/**
	 * Sets the q m ref qms scope b of this acc cer body manage req.
	 *
	 * @param qMRefQMSScopeB the q m ref qms scope b of this acc cer body manage req
	 */
	@Override
	public void setQMRefQMSScopeB(String qMRefQMSScopeB) {
		model.setQMRefQMSScopeB(qMRefQMSScopeB);
	}

	/**
	 * Sets the q m ref rec control of this acc cer body manage req.
	 *
	 * @param qMRefRecControl the q m ref rec control of this acc cer body manage req
	 */
	@Override
	public void setQMRefRecControl(String qMRefRecControl) {
		model.setQMRefRecControl(qMRefRecControl);
	}

	/**
	 * Sets the q m ref retention policy of this acc cer body manage req.
	 *
	 * @param qMRefRetentionPolicy the q m ref retention policy of this acc cer body manage req
	 */
	@Override
	public void setQMRefRetentionPolicy(String qMRefRetentionPolicy) {
		model.setQMRefRetentionPolicy(qMRefRetentionPolicy);
	}

	/**
	 * Sets the q m ref retention proc of this acc cer body manage req.
	 *
	 * @param qMRefRetentionProc the q m ref retention proc of this acc cer body manage req
	 */
	@Override
	public void setQMRefRetentionProc(String qMRefRetentionProc) {
		model.setQMRefRetentionProc(qMRefRetentionProc);
	}

	/**
	 * Sets the q m ref review of this acc cer body manage req.
	 *
	 * @param qMRefReview the q m ref review of this acc cer body manage req
	 */
	@Override
	public void setQMRefReview(String qMRefReview) {
		model.setQMRefReview(qMRefReview);
	}

	/**
	 * Sets the q m ref review prior of this acc cer body manage req.
	 *
	 * @param qMRefReviewPrior the q m ref review prior of this acc cer body manage req
	 */
	@Override
	public void setQMRefReviewPrior(String qMRefReviewPrior) {
		model.setQMRefReviewPrior(qMRefReviewPrior);
	}

	/**
	 * Sets the q m ref risk of this acc cer body manage req.
	 *
	 * @param qMRefRisk the q m ref risk of this acc cer body manage req
	 */
	@Override
	public void setQMRefRisk(String qMRefRisk) {
		model.setQMRefRisk(qMRefRisk);
	}

	/**
	 * Sets the q m ref sampling of this acc cer body manage req.
	 *
	 * @param qMRefSampling the q m ref sampling of this acc cer body manage req
	 */
	@Override
	public void setQMRefSampling(String qMRefSampling) {
		model.setQMRefSampling(qMRefSampling);
	}

	/**
	 * Sets the q m ref selecting of this acc cer body manage req.
	 *
	 * @param qMRefSelecting the q m ref selecting of this acc cer body manage req
	 */
	@Override
	public void setQMRefSelecting(String qMRefSelecting) {
		model.setQMRefSelecting(qMRefSelecting);
	}

	/**
	 * Sets the q m ref suspension of this acc cer body manage req.
	 *
	 * @param qMRefSuspension the q m ref suspension of this acc cer body manage req
	 */
	@Override
	public void setQMRefSuspension(String qMRefSuspension) {
		model.setQMRefSuspension(qMRefSuspension);
	}

	/**
	 * Sets the q m ref suspension proc of this acc cer body manage req.
	 *
	 * @param qMRefSuspensionProc the q m ref suspension proc of this acc cer body manage req
	 */
	@Override
	public void setQMRefSuspensionProc(String qMRefSuspensionProc) {
		model.setQMRefSuspensionProc(qMRefSuspensionProc);
	}

	/**
	 * Sets the q m ref terms of this acc cer body manage req.
	 *
	 * @param qMRefTerms the q m ref terms of this acc cer body manage req
	 */
	@Override
	public void setQMRefTerms(String qMRefTerms) {
		model.setQMRefTerms(qMRefTerms);
	}

	/**
	 * Sets the q m ref transfer of this acc cer body manage req.
	 *
	 * @param qMRefTransfer the q m ref transfer of this acc cer body manage req
	 */
	@Override
	public void setQMRefTransfer(String qMRefTransfer) {
		model.setQMRefTransfer(qMRefTransfer);
	}

	/**
	 * Sets the q m ref use of certi of this acc cer body manage req.
	 *
	 * @param qMRefUseOfCerti the q m ref use of certi of this acc cer body manage req
	 */
	@Override
	public void setQMRefUseOfCerti(String qMRefUseOfCerti) {
		model.setQMRefUseOfCerti(qMRefUseOfCerti);
	}

	/**
	 * Sets the q m ref written of this acc cer body manage req.
	 *
	 * @param qMRefWritten the q m ref written of this acc cer body manage req
	 */
	@Override
	public void setQMRefWritten(String qMRefWritten) {
		model.setQMRefWritten(qMRefWritten);
	}

	/**
	 * Sets the q ms scope b of this acc cer body manage req.
	 *
	 * @param qMSScopeB the q ms scope b of this acc cer body manage req
	 */
	@Override
	public void setQMSScopeB(String qMSScopeB) {
		model.setQMSScopeB(qMSScopeB);
	}

	/**
	 * Sets the rec control proc of this acc cer body manage req.
	 *
	 * @param recControlProc the rec control proc of this acc cer body manage req
	 */
	@Override
	public void setRecControlProc(String recControlProc) {
		model.setRecControlProc(recControlProc);
	}

	/**
	 * Sets the record retention policy of this acc cer body manage req.
	 *
	 * @param recordRetentionPolicy the record retention policy of this acc cer body manage req
	 */
	@Override
	public void setRecordRetentionPolicy(String recordRetentionPolicy) {
		model.setRecordRetentionPolicy(recordRetentionPolicy);
	}

	/**
	 * Sets the record retention proc of this acc cer body manage req.
	 *
	 * @param recordRetentionProc the record retention proc of this acc cer body manage req
	 */
	@Override
	public void setRecordRetentionProc(String recordRetentionProc) {
		model.setRecordRetentionProc(recordRetentionProc);
	}

	/**
	 * Sets the review prior decision of this acc cer body manage req.
	 *
	 * @param reviewPriorDecision the review prior decision of this acc cer body manage req
	 */
	@Override
	public void setReviewPriorDecision(String reviewPriorDecision) {
		model.setReviewPriorDecision(reviewPriorDecision);
	}

	/**
	 * Sets the risk assessment of this acc cer body manage req.
	 *
	 * @param riskAssessment the risk assessment of this acc cer body manage req
	 */
	@Override
	public void setRiskAssessment(String riskAssessment) {
		model.setRiskAssessment(riskAssessment);
	}

	/**
	 * Sets the rules governing of this acc cer body manage req.
	 *
	 * @param rulesGoverning the rules governing of this acc cer body manage req
	 */
	@Override
	public void setRulesGoverning(String rulesGoverning) {
		model.setRulesGoverning(rulesGoverning);
	}

	/**
	 * Sets the sampling program of this acc cer body manage req.
	 *
	 * @param samplingProgram the sampling program of this acc cer body manage req
	 */
	@Override
	public void setSamplingProgram(String samplingProgram) {
		model.setSamplingProgram(samplingProgram);
	}

	/**
	 * Sets the selecting training of this acc cer body manage req.
	 *
	 * @param selectingTraining the selecting training of this acc cer body manage req
	 */
	@Override
	public void setSelectingTraining(String selectingTraining) {
		model.setSelectingTraining(selectingTraining);
	}

	/**
	 * Sets the suspension policies of this acc cer body manage req.
	 *
	 * @param suspensionPolicies the suspension policies of this acc cer body manage req
	 */
	@Override
	public void setSuspensionPolicies(String suspensionPolicies) {
		model.setSuspensionPolicies(suspensionPolicies);
	}

	/**
	 * Sets the suspension procedure of this acc cer body manage req.
	 *
	 * @param suspensionProcedure the suspension procedure of this acc cer body manage req
	 */
	@Override
	public void setSuspensionProcedure(String suspensionProcedure) {
		model.setSuspensionProcedure(suspensionProcedure);
	}

	/**
	 * Sets the terms of reference of this acc cer body manage req.
	 *
	 * @param termsOfReference the terms of reference of this acc cer body manage req
	 */
	@Override
	public void setTermsOfReference(String termsOfReference) {
		model.setTermsOfReference(termsOfReference);
	}

	/**
	 * Sets the transfer certification of this acc cer body manage req.
	 *
	 * @param transferCertification the transfer certification of this acc cer body manage req
	 */
	@Override
	public void setTransferCertification(String transferCertification) {
		model.setTransferCertification(transferCertification);
	}

	/**
	 * Sets the use of certification of this acc cer body manage req.
	 *
	 * @param useOfCertification the use of certification of this acc cer body manage req
	 */
	@Override
	public void setUseOfCertification(String useOfCertification) {
		model.setUseOfCertification(useOfCertification);
	}

	/**
	 * Sets the user ID of this acc cer body manage req.
	 *
	 * @param userId the user ID of this acc cer body manage req
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acc cer body manage req.
	 *
	 * @param userName the user name of this acc cer body manage req
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acc cer body manage req.
	 *
	 * @param userUuid the user uuid of this acc cer body manage req
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acc cer body manage req.
	 *
	 * @param uuid the uuid of this acc cer body manage req
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the written agreement of this acc cer body manage req.
	 *
	 * @param writtenAgreement the written agreement of this acc cer body manage req
	 */
	@Override
	public void setWrittenAgreement(String writtenAgreement) {
		model.setWrittenAgreement(writtenAgreement);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected AccCerBodyManageReqWrapper wrap(
		AccCerBodyManageReq accCerBodyManageReq) {

		return new AccCerBodyManageReqWrapper(accCerBodyManageReq);
	}

}