/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccCerBodyManageReq;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccCerBodyManageReq in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccCerBodyManageReqCacheModel
	implements CacheModel<AccCerBodyManageReq>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccCerBodyManageReqCacheModel)) {
			return false;
		}

		AccCerBodyManageReqCacheModel accCerBodyManageReqCacheModel =
			(AccCerBodyManageReqCacheModel)object;

		if (accCerBodyManageReqId ==
				accCerBodyManageReqCacheModel.accCerBodyManageReqId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accCerBodyManageReqId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(237);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accCerBodyManageReqId=");
		sb.append(accCerBodyManageReqId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", optionFollow=");
		sb.append(optionFollow);
		sb.append(", impartialityPolicy=");
		sb.append(impartialityPolicy);
		sb.append(", qMRefImpartiality=");
		sb.append(qMRefImpartiality);
		sb.append(", riskAssessment=");
		sb.append(riskAssessment);
		sb.append(", qMRefRisk=");
		sb.append(qMRefRisk);
		sb.append(", orgStructure=");
		sb.append(orgStructure);
		sb.append(", qMRefOrgStruct=");
		sb.append(qMRefOrgStruct);
		sb.append(", termsOfReference=");
		sb.append(termsOfReference);
		sb.append(", qMRefTerms=");
		sb.append(qMRefTerms);
		sb.append(", processForControl=");
		sb.append(processForControl);
		sb.append(", qMRefProcess=");
		sb.append(qMRefProcess);
		sb.append(", criteriaReq=");
		sb.append(criteriaReq);
		sb.append(", qMRefCriteria=");
		sb.append(qMRefCriteria);
		sb.append(", initialCompetence=");
		sb.append(initialCompetence);
		sb.append(", qMRefInitial=");
		sb.append(qMRefInitial);
		sb.append(", selectingTraining=");
		sb.append(selectingTraining);
		sb.append(", qMRefSelecting=");
		sb.append(qMRefSelecting);
		sb.append(", monitoringCompetence=");
		sb.append(monitoringCompetence);
		sb.append(", qMRefMonitoring=");
		sb.append(qMRefMonitoring);
		sb.append(", writtenAgreement=");
		sb.append(writtenAgreement);
		sb.append(", qMRefWritten=");
		sb.append(qMRefWritten);
		sb.append(", descOfProcess=");
		sb.append(descOfProcess);
		sb.append(", qMRefDescProcess=");
		sb.append(qMRefDescProcess);
		sb.append(", processForMonitor=");
		sb.append(processForMonitor);
		sb.append(", qMRefMonitorProcess=");
		sb.append(qMRefMonitorProcess);
		sb.append(", auditProcess=");
		sb.append(auditProcess);
		sb.append(", qMRefAuditProcess=");
		sb.append(qMRefAuditProcess);
		sb.append(", processGranting=");
		sb.append(processGranting);
		sb.append(", qMRefGranting=");
		sb.append(qMRefGranting);
		sb.append(", managemntSys=");
		sb.append(managemntSys);
		sb.append(", qMRefManagemnt=");
		sb.append(qMRefManagemnt);
		sb.append(", useOfCertification=");
		sb.append(useOfCertification);
		sb.append(", qMRefUseOfCerti=");
		sb.append(qMRefUseOfCerti);
		sb.append(", handlingReq=");
		sb.append(handlingReq);
		sb.append(", qMRefHandling=");
		sb.append(qMRefHandling);
		sb.append(", impartialityPolicies=");
		sb.append(impartialityPolicies);
		sb.append(", qMRefImpartPolicy=");
		sb.append(qMRefImpartPolicy);
		sb.append(", provisionInform=");
		sb.append(provisionInform);
		sb.append(", qMRefProvision=");
		sb.append(qMRefProvision);
		sb.append(", certificationDoc=");
		sb.append(certificationDoc);
		sb.append(", qMRefCertification=");
		sb.append(qMRefCertification);
		sb.append(", rulesGoverning=");
		sb.append(rulesGoverning);
		sb.append(", qMRefGoverning=");
		sb.append(qMRefGoverning);
		sb.append(", enforcableArrangements=");
		sb.append(enforcableArrangements);
		sb.append(", qMRefEnforcable=");
		sb.append(qMRefEnforcable);
		sb.append(", ensureConfidential=");
		sb.append(ensureConfidential);
		sb.append(", qMRefEnsureConfid=");
		sb.append(qMRefEnsureConfid);
		sb.append(", informingMechanism=");
		sb.append(informingMechanism);
		sb.append(", qMRefInforming=");
		sb.append(qMRefInforming);
		sb.append(", applicationProcess=");
		sb.append(applicationProcess);
		sb.append(", qMRefApplication=");
		sb.append(qMRefApplication);
		sb.append(", applicationReview=");
		sb.append(applicationReview);
		sb.append(", qMRefReview=");
		sb.append(qMRefReview);
		sb.append(", certificationCycle=");
		sb.append(certificationCycle);
		sb.append(", qMRefCertiCycle=");
		sb.append(qMRefCertiCycle);
		sb.append(", auditTime=");
		sb.append(auditTime);
		sb.append(", qMRefAuditTime=");
		sb.append(qMRefAuditTime);
		sb.append(", samplingProgram=");
		sb.append(samplingProgram);
		sb.append(", qMRefSampling=");
		sb.append(qMRefSampling);
		sb.append(", auditPlanning=");
		sb.append(auditPlanning);
		sb.append(", qMRefPlanning=");
		sb.append(qMRefPlanning);
		sb.append(", auditTeam=");
		sb.append(auditTeam);
		sb.append(", qMRefAuditTeam=");
		sb.append(qMRefAuditTeam);
		sb.append(", onSiteAudit=");
		sb.append(onSiteAudit);
		sb.append(", qMRefonSiteAudit=");
		sb.append(qMRefonSiteAudit);
		sb.append(", auditReport=");
		sb.append(auditReport);
		sb.append(", qMRefAuditReport=");
		sb.append(qMRefAuditReport);
		sb.append(", correctiveActions=");
		sb.append(correctiveActions);
		sb.append(", qMRefCorrective=");
		sb.append(qMRefCorrective);
		sb.append(", reviewPriorDecision=");
		sb.append(reviewPriorDecision);
		sb.append(", qMRefReviewPrior=");
		sb.append(qMRefReviewPrior);
		sb.append(", transferCertification=");
		sb.append(transferCertification);
		sb.append(", qMRefTransfer=");
		sb.append(qMRefTransfer);
		sb.append(", suspensionPolicies=");
		sb.append(suspensionPolicies);
		sb.append(", qMRefSuspension=");
		sb.append(qMRefSuspension);
		sb.append(", suspensionProcedure=");
		sb.append(suspensionProcedure);
		sb.append(", qMRefSuspensionProc=");
		sb.append(qMRefSuspensionProc);
		sb.append(", decisionOnAppeals=");
		sb.append(decisionOnAppeals);
		sb.append(", qMRefDecision=");
		sb.append(qMRefDecision);
		sb.append(", handlingComplaints=");
		sb.append(handlingComplaints);
		sb.append(", qMRefComplaints=");
		sb.append(qMRefComplaints);
		sb.append(", recordRetentionPolicy=");
		sb.append(recordRetentionPolicy);
		sb.append(", qMRefRetentionPolicy=");
		sb.append(qMRefRetentionPolicy);
		sb.append(", recordRetentionProc=");
		sb.append(recordRetentionProc);
		sb.append(", qMRefRetentionProc=");
		sb.append(qMRefRetentionProc);
		sb.append(", manageSysPolicies=");
		sb.append(manageSysPolicies);
		sb.append(", qMRefPolicies=");
		sb.append(qMRefPolicies);
		sb.append(", manageSysObjective=");
		sb.append(manageSysObjective);
		sb.append(", qMRefObjective=");
		sb.append(qMRefObjective);
		sb.append(", manageSysManual=");
		sb.append(manageSysManual);
		sb.append(", qMRefManual=");
		sb.append(qMRefManual);
		sb.append(", docControlProcedure=");
		sb.append(docControlProcedure);
		sb.append(", qMRefDocControl=");
		sb.append(qMRefDocControl);
		sb.append(", recControlProc=");
		sb.append(recControlProc);
		sb.append(", qMRefRecControl=");
		sb.append(qMRefRecControl);
		sb.append(", managementReview=");
		sb.append(managementReview);
		sb.append(", qMRefManagementRev=");
		sb.append(qMRefManagementRev);
		sb.append(", internalAudits=");
		sb.append(internalAudits);
		sb.append(", qMRefInternal=");
		sb.append(qMRefInternal);
		sb.append(", identificationProc=");
		sb.append(identificationProc);
		sb.append(", qMRefIdentification=");
		sb.append(qMRefIdentification);
		sb.append(", qMSScopeB=");
		sb.append(qMSScopeB);
		sb.append(", qMRefQMSScopeB=");
		sb.append(qMRefQMSScopeB);
		sb.append(", designDevB=");
		sb.append(designDevB);
		sb.append(", qMRefDesignB=");
		sb.append(qMRefDesignB);
		sb.append(", interestedPartyNeedsB=");
		sb.append(interestedPartyNeedsB);
		sb.append(", qMRefInterestedB=");
		sb.append(qMRefInterestedB);
		sb.append(", managementReviewB=");
		sb.append(managementReviewB);
		sb.append(", qMRefmanagementReviewB=");
		sb.append(qMRefmanagementReviewB);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccCerBodyManageReq toEntityModel() {
		AccCerBodyManageReqImpl accCerBodyManageReqImpl =
			new AccCerBodyManageReqImpl();

		if (uuid == null) {
			accCerBodyManageReqImpl.setUuid("");
		}
		else {
			accCerBodyManageReqImpl.setUuid(uuid);
		}

		accCerBodyManageReqImpl.setAccCerBodyManageReqId(accCerBodyManageReqId);
		accCerBodyManageReqImpl.setGroupId(groupId);
		accCerBodyManageReqImpl.setCompanyId(companyId);
		accCerBodyManageReqImpl.setUserId(userId);

		if (userName == null) {
			accCerBodyManageReqImpl.setUserName("");
		}
		else {
			accCerBodyManageReqImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accCerBodyManageReqImpl.setCreateDate(null);
		}
		else {
			accCerBodyManageReqImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accCerBodyManageReqImpl.setModifiedDate(null);
		}
		else {
			accCerBodyManageReqImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (optionFollow == null) {
			accCerBodyManageReqImpl.setOptionFollow("");
		}
		else {
			accCerBodyManageReqImpl.setOptionFollow(optionFollow);
		}

		if (impartialityPolicy == null) {
			accCerBodyManageReqImpl.setImpartialityPolicy("");
		}
		else {
			accCerBodyManageReqImpl.setImpartialityPolicy(impartialityPolicy);
		}

		if (qMRefImpartiality == null) {
			accCerBodyManageReqImpl.setQMRefImpartiality("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefImpartiality(qMRefImpartiality);
		}

		if (riskAssessment == null) {
			accCerBodyManageReqImpl.setRiskAssessment("");
		}
		else {
			accCerBodyManageReqImpl.setRiskAssessment(riskAssessment);
		}

		if (qMRefRisk == null) {
			accCerBodyManageReqImpl.setQMRefRisk("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefRisk(qMRefRisk);
		}

		if (orgStructure == null) {
			accCerBodyManageReqImpl.setOrgStructure("");
		}
		else {
			accCerBodyManageReqImpl.setOrgStructure(orgStructure);
		}

		if (qMRefOrgStruct == null) {
			accCerBodyManageReqImpl.setQMRefOrgStruct("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefOrgStruct(qMRefOrgStruct);
		}

		if (termsOfReference == null) {
			accCerBodyManageReqImpl.setTermsOfReference("");
		}
		else {
			accCerBodyManageReqImpl.setTermsOfReference(termsOfReference);
		}

		if (qMRefTerms == null) {
			accCerBodyManageReqImpl.setQMRefTerms("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefTerms(qMRefTerms);
		}

		if (processForControl == null) {
			accCerBodyManageReqImpl.setProcessForControl("");
		}
		else {
			accCerBodyManageReqImpl.setProcessForControl(processForControl);
		}

		if (qMRefProcess == null) {
			accCerBodyManageReqImpl.setQMRefProcess("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefProcess(qMRefProcess);
		}

		if (criteriaReq == null) {
			accCerBodyManageReqImpl.setCriteriaReq("");
		}
		else {
			accCerBodyManageReqImpl.setCriteriaReq(criteriaReq);
		}

		if (qMRefCriteria == null) {
			accCerBodyManageReqImpl.setQMRefCriteria("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefCriteria(qMRefCriteria);
		}

		if (initialCompetence == null) {
			accCerBodyManageReqImpl.setInitialCompetence("");
		}
		else {
			accCerBodyManageReqImpl.setInitialCompetence(initialCompetence);
		}

		if (qMRefInitial == null) {
			accCerBodyManageReqImpl.setQMRefInitial("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefInitial(qMRefInitial);
		}

		if (selectingTraining == null) {
			accCerBodyManageReqImpl.setSelectingTraining("");
		}
		else {
			accCerBodyManageReqImpl.setSelectingTraining(selectingTraining);
		}

		if (qMRefSelecting == null) {
			accCerBodyManageReqImpl.setQMRefSelecting("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefSelecting(qMRefSelecting);
		}

		if (monitoringCompetence == null) {
			accCerBodyManageReqImpl.setMonitoringCompetence("");
		}
		else {
			accCerBodyManageReqImpl.setMonitoringCompetence(
				monitoringCompetence);
		}

		if (qMRefMonitoring == null) {
			accCerBodyManageReqImpl.setQMRefMonitoring("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefMonitoring(qMRefMonitoring);
		}

		if (writtenAgreement == null) {
			accCerBodyManageReqImpl.setWrittenAgreement("");
		}
		else {
			accCerBodyManageReqImpl.setWrittenAgreement(writtenAgreement);
		}

		if (qMRefWritten == null) {
			accCerBodyManageReqImpl.setQMRefWritten("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefWritten(qMRefWritten);
		}

		if (descOfProcess == null) {
			accCerBodyManageReqImpl.setDescOfProcess("");
		}
		else {
			accCerBodyManageReqImpl.setDescOfProcess(descOfProcess);
		}

		if (qMRefDescProcess == null) {
			accCerBodyManageReqImpl.setQMRefDescProcess("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefDescProcess(qMRefDescProcess);
		}

		if (processForMonitor == null) {
			accCerBodyManageReqImpl.setProcessForMonitor("");
		}
		else {
			accCerBodyManageReqImpl.setProcessForMonitor(processForMonitor);
		}

		if (qMRefMonitorProcess == null) {
			accCerBodyManageReqImpl.setQMRefMonitorProcess("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefMonitorProcess(qMRefMonitorProcess);
		}

		if (auditProcess == null) {
			accCerBodyManageReqImpl.setAuditProcess("");
		}
		else {
			accCerBodyManageReqImpl.setAuditProcess(auditProcess);
		}

		if (qMRefAuditProcess == null) {
			accCerBodyManageReqImpl.setQMRefAuditProcess("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefAuditProcess(qMRefAuditProcess);
		}

		if (processGranting == null) {
			accCerBodyManageReqImpl.setProcessGranting("");
		}
		else {
			accCerBodyManageReqImpl.setProcessGranting(processGranting);
		}

		if (qMRefGranting == null) {
			accCerBodyManageReqImpl.setQMRefGranting("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefGranting(qMRefGranting);
		}

		if (managemntSys == null) {
			accCerBodyManageReqImpl.setManagemntSys("");
		}
		else {
			accCerBodyManageReqImpl.setManagemntSys(managemntSys);
		}

		if (qMRefManagemnt == null) {
			accCerBodyManageReqImpl.setQMRefManagemnt("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefManagemnt(qMRefManagemnt);
		}

		if (useOfCertification == null) {
			accCerBodyManageReqImpl.setUseOfCertification("");
		}
		else {
			accCerBodyManageReqImpl.setUseOfCertification(useOfCertification);
		}

		if (qMRefUseOfCerti == null) {
			accCerBodyManageReqImpl.setQMRefUseOfCerti("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefUseOfCerti(qMRefUseOfCerti);
		}

		if (handlingReq == null) {
			accCerBodyManageReqImpl.setHandlingReq("");
		}
		else {
			accCerBodyManageReqImpl.setHandlingReq(handlingReq);
		}

		if (qMRefHandling == null) {
			accCerBodyManageReqImpl.setQMRefHandling("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefHandling(qMRefHandling);
		}

		if (impartialityPolicies == null) {
			accCerBodyManageReqImpl.setImpartialityPolicies("");
		}
		else {
			accCerBodyManageReqImpl.setImpartialityPolicies(
				impartialityPolicies);
		}

		if (qMRefImpartPolicy == null) {
			accCerBodyManageReqImpl.setQMRefImpartPolicy("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefImpartPolicy(qMRefImpartPolicy);
		}

		if (provisionInform == null) {
			accCerBodyManageReqImpl.setProvisionInform("");
		}
		else {
			accCerBodyManageReqImpl.setProvisionInform(provisionInform);
		}

		if (qMRefProvision == null) {
			accCerBodyManageReqImpl.setQMRefProvision("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefProvision(qMRefProvision);
		}

		if (certificationDoc == null) {
			accCerBodyManageReqImpl.setCertificationDoc("");
		}
		else {
			accCerBodyManageReqImpl.setCertificationDoc(certificationDoc);
		}

		if (qMRefCertification == null) {
			accCerBodyManageReqImpl.setQMRefCertification("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefCertification(qMRefCertification);
		}

		if (rulesGoverning == null) {
			accCerBodyManageReqImpl.setRulesGoverning("");
		}
		else {
			accCerBodyManageReqImpl.setRulesGoverning(rulesGoverning);
		}

		if (qMRefGoverning == null) {
			accCerBodyManageReqImpl.setQMRefGoverning("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefGoverning(qMRefGoverning);
		}

		if (enforcableArrangements == null) {
			accCerBodyManageReqImpl.setEnforcableArrangements("");
		}
		else {
			accCerBodyManageReqImpl.setEnforcableArrangements(
				enforcableArrangements);
		}

		if (qMRefEnforcable == null) {
			accCerBodyManageReqImpl.setQMRefEnforcable("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefEnforcable(qMRefEnforcable);
		}

		if (ensureConfidential == null) {
			accCerBodyManageReqImpl.setEnsureConfidential("");
		}
		else {
			accCerBodyManageReqImpl.setEnsureConfidential(ensureConfidential);
		}

		if (qMRefEnsureConfid == null) {
			accCerBodyManageReqImpl.setQMRefEnsureConfid("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefEnsureConfid(qMRefEnsureConfid);
		}

		if (informingMechanism == null) {
			accCerBodyManageReqImpl.setInformingMechanism("");
		}
		else {
			accCerBodyManageReqImpl.setInformingMechanism(informingMechanism);
		}

		if (qMRefInforming == null) {
			accCerBodyManageReqImpl.setQMRefInforming("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefInforming(qMRefInforming);
		}

		if (applicationProcess == null) {
			accCerBodyManageReqImpl.setApplicationProcess("");
		}
		else {
			accCerBodyManageReqImpl.setApplicationProcess(applicationProcess);
		}

		if (qMRefApplication == null) {
			accCerBodyManageReqImpl.setQMRefApplication("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefApplication(qMRefApplication);
		}

		if (applicationReview == null) {
			accCerBodyManageReqImpl.setApplicationReview("");
		}
		else {
			accCerBodyManageReqImpl.setApplicationReview(applicationReview);
		}

		if (qMRefReview == null) {
			accCerBodyManageReqImpl.setQMRefReview("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefReview(qMRefReview);
		}

		if (certificationCycle == null) {
			accCerBodyManageReqImpl.setCertificationCycle("");
		}
		else {
			accCerBodyManageReqImpl.setCertificationCycle(certificationCycle);
		}

		if (qMRefCertiCycle == null) {
			accCerBodyManageReqImpl.setQMRefCertiCycle("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefCertiCycle(qMRefCertiCycle);
		}

		if (auditTime == null) {
			accCerBodyManageReqImpl.setAuditTime("");
		}
		else {
			accCerBodyManageReqImpl.setAuditTime(auditTime);
		}

		if (qMRefAuditTime == null) {
			accCerBodyManageReqImpl.setQMRefAuditTime("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefAuditTime(qMRefAuditTime);
		}

		if (samplingProgram == null) {
			accCerBodyManageReqImpl.setSamplingProgram("");
		}
		else {
			accCerBodyManageReqImpl.setSamplingProgram(samplingProgram);
		}

		if (qMRefSampling == null) {
			accCerBodyManageReqImpl.setQMRefSampling("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefSampling(qMRefSampling);
		}

		if (auditPlanning == null) {
			accCerBodyManageReqImpl.setAuditPlanning("");
		}
		else {
			accCerBodyManageReqImpl.setAuditPlanning(auditPlanning);
		}

		if (qMRefPlanning == null) {
			accCerBodyManageReqImpl.setQMRefPlanning("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefPlanning(qMRefPlanning);
		}

		if (auditTeam == null) {
			accCerBodyManageReqImpl.setAuditTeam("");
		}
		else {
			accCerBodyManageReqImpl.setAuditTeam(auditTeam);
		}

		if (qMRefAuditTeam == null) {
			accCerBodyManageReqImpl.setQMRefAuditTeam("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefAuditTeam(qMRefAuditTeam);
		}

		if (onSiteAudit == null) {
			accCerBodyManageReqImpl.setOnSiteAudit("");
		}
		else {
			accCerBodyManageReqImpl.setOnSiteAudit(onSiteAudit);
		}

		if (qMRefonSiteAudit == null) {
			accCerBodyManageReqImpl.setQMRefonSiteAudit("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefonSiteAudit(qMRefonSiteAudit);
		}

		if (auditReport == null) {
			accCerBodyManageReqImpl.setAuditReport("");
		}
		else {
			accCerBodyManageReqImpl.setAuditReport(auditReport);
		}

		if (qMRefAuditReport == null) {
			accCerBodyManageReqImpl.setQMRefAuditReport("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefAuditReport(qMRefAuditReport);
		}

		if (correctiveActions == null) {
			accCerBodyManageReqImpl.setCorrectiveActions("");
		}
		else {
			accCerBodyManageReqImpl.setCorrectiveActions(correctiveActions);
		}

		if (qMRefCorrective == null) {
			accCerBodyManageReqImpl.setQMRefCorrective("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefCorrective(qMRefCorrective);
		}

		if (reviewPriorDecision == null) {
			accCerBodyManageReqImpl.setReviewPriorDecision("");
		}
		else {
			accCerBodyManageReqImpl.setReviewPriorDecision(reviewPriorDecision);
		}

		if (qMRefReviewPrior == null) {
			accCerBodyManageReqImpl.setQMRefReviewPrior("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefReviewPrior(qMRefReviewPrior);
		}

		if (transferCertification == null) {
			accCerBodyManageReqImpl.setTransferCertification("");
		}
		else {
			accCerBodyManageReqImpl.setTransferCertification(
				transferCertification);
		}

		if (qMRefTransfer == null) {
			accCerBodyManageReqImpl.setQMRefTransfer("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefTransfer(qMRefTransfer);
		}

		if (suspensionPolicies == null) {
			accCerBodyManageReqImpl.setSuspensionPolicies("");
		}
		else {
			accCerBodyManageReqImpl.setSuspensionPolicies(suspensionPolicies);
		}

		if (qMRefSuspension == null) {
			accCerBodyManageReqImpl.setQMRefSuspension("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefSuspension(qMRefSuspension);
		}

		if (suspensionProcedure == null) {
			accCerBodyManageReqImpl.setSuspensionProcedure("");
		}
		else {
			accCerBodyManageReqImpl.setSuspensionProcedure(suspensionProcedure);
		}

		if (qMRefSuspensionProc == null) {
			accCerBodyManageReqImpl.setQMRefSuspensionProc("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefSuspensionProc(qMRefSuspensionProc);
		}

		if (decisionOnAppeals == null) {
			accCerBodyManageReqImpl.setDecisionOnAppeals("");
		}
		else {
			accCerBodyManageReqImpl.setDecisionOnAppeals(decisionOnAppeals);
		}

		if (qMRefDecision == null) {
			accCerBodyManageReqImpl.setQMRefDecision("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefDecision(qMRefDecision);
		}

		if (handlingComplaints == null) {
			accCerBodyManageReqImpl.setHandlingComplaints("");
		}
		else {
			accCerBodyManageReqImpl.setHandlingComplaints(handlingComplaints);
		}

		if (qMRefComplaints == null) {
			accCerBodyManageReqImpl.setQMRefComplaints("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefComplaints(qMRefComplaints);
		}

		if (recordRetentionPolicy == null) {
			accCerBodyManageReqImpl.setRecordRetentionPolicy("");
		}
		else {
			accCerBodyManageReqImpl.setRecordRetentionPolicy(
				recordRetentionPolicy);
		}

		if (qMRefRetentionPolicy == null) {
			accCerBodyManageReqImpl.setQMRefRetentionPolicy("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefRetentionPolicy(
				qMRefRetentionPolicy);
		}

		if (recordRetentionProc == null) {
			accCerBodyManageReqImpl.setRecordRetentionProc("");
		}
		else {
			accCerBodyManageReqImpl.setRecordRetentionProc(recordRetentionProc);
		}

		if (qMRefRetentionProc == null) {
			accCerBodyManageReqImpl.setQMRefRetentionProc("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefRetentionProc(qMRefRetentionProc);
		}

		if (manageSysPolicies == null) {
			accCerBodyManageReqImpl.setManageSysPolicies("");
		}
		else {
			accCerBodyManageReqImpl.setManageSysPolicies(manageSysPolicies);
		}

		if (qMRefPolicies == null) {
			accCerBodyManageReqImpl.setQMRefPolicies("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefPolicies(qMRefPolicies);
		}

		if (manageSysObjective == null) {
			accCerBodyManageReqImpl.setManageSysObjective("");
		}
		else {
			accCerBodyManageReqImpl.setManageSysObjective(manageSysObjective);
		}

		if (qMRefObjective == null) {
			accCerBodyManageReqImpl.setQMRefObjective("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefObjective(qMRefObjective);
		}

		if (manageSysManual == null) {
			accCerBodyManageReqImpl.setManageSysManual("");
		}
		else {
			accCerBodyManageReqImpl.setManageSysManual(manageSysManual);
		}

		if (qMRefManual == null) {
			accCerBodyManageReqImpl.setQMRefManual("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefManual(qMRefManual);
		}

		if (docControlProcedure == null) {
			accCerBodyManageReqImpl.setDocControlProcedure("");
		}
		else {
			accCerBodyManageReqImpl.setDocControlProcedure(docControlProcedure);
		}

		if (qMRefDocControl == null) {
			accCerBodyManageReqImpl.setQMRefDocControl("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefDocControl(qMRefDocControl);
		}

		if (recControlProc == null) {
			accCerBodyManageReqImpl.setRecControlProc("");
		}
		else {
			accCerBodyManageReqImpl.setRecControlProc(recControlProc);
		}

		if (qMRefRecControl == null) {
			accCerBodyManageReqImpl.setQMRefRecControl("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefRecControl(qMRefRecControl);
		}

		if (managementReview == null) {
			accCerBodyManageReqImpl.setManagementReview("");
		}
		else {
			accCerBodyManageReqImpl.setManagementReview(managementReview);
		}

		if (qMRefManagementRev == null) {
			accCerBodyManageReqImpl.setQMRefManagementRev("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefManagementRev(qMRefManagementRev);
		}

		if (internalAudits == null) {
			accCerBodyManageReqImpl.setInternalAudits("");
		}
		else {
			accCerBodyManageReqImpl.setInternalAudits(internalAudits);
		}

		if (qMRefInternal == null) {
			accCerBodyManageReqImpl.setQMRefInternal("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefInternal(qMRefInternal);
		}

		if (identificationProc == null) {
			accCerBodyManageReqImpl.setIdentificationProc("");
		}
		else {
			accCerBodyManageReqImpl.setIdentificationProc(identificationProc);
		}

		if (qMRefIdentification == null) {
			accCerBodyManageReqImpl.setQMRefIdentification("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefIdentification(qMRefIdentification);
		}

		if (qMSScopeB == null) {
			accCerBodyManageReqImpl.setQMSScopeB("");
		}
		else {
			accCerBodyManageReqImpl.setQMSScopeB(qMSScopeB);
		}

		if (qMRefQMSScopeB == null) {
			accCerBodyManageReqImpl.setQMRefQMSScopeB("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefQMSScopeB(qMRefQMSScopeB);
		}

		if (designDevB == null) {
			accCerBodyManageReqImpl.setDesignDevB("");
		}
		else {
			accCerBodyManageReqImpl.setDesignDevB(designDevB);
		}

		if (qMRefDesignB == null) {
			accCerBodyManageReqImpl.setQMRefDesignB("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefDesignB(qMRefDesignB);
		}

		if (interestedPartyNeedsB == null) {
			accCerBodyManageReqImpl.setInterestedPartyNeedsB("");
		}
		else {
			accCerBodyManageReqImpl.setInterestedPartyNeedsB(
				interestedPartyNeedsB);
		}

		if (qMRefInterestedB == null) {
			accCerBodyManageReqImpl.setQMRefInterestedB("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefInterestedB(qMRefInterestedB);
		}

		if (managementReviewB == null) {
			accCerBodyManageReqImpl.setManagementReviewB("");
		}
		else {
			accCerBodyManageReqImpl.setManagementReviewB(managementReviewB);
		}

		if (qMRefmanagementReviewB == null) {
			accCerBodyManageReqImpl.setQMRefmanagementReviewB("");
		}
		else {
			accCerBodyManageReqImpl.setQMRefmanagementReviewB(
				qMRefmanagementReviewB);
		}

		accCerBodyManageReqImpl.setJanaacApplicationId(janaacApplicationId);

		accCerBodyManageReqImpl.resetOriginalValues();

		return accCerBodyManageReqImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accCerBodyManageReqId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		optionFollow = objectInput.readUTF();
		impartialityPolicy = objectInput.readUTF();
		qMRefImpartiality = objectInput.readUTF();
		riskAssessment = objectInput.readUTF();
		qMRefRisk = objectInput.readUTF();
		orgStructure = objectInput.readUTF();
		qMRefOrgStruct = objectInput.readUTF();
		termsOfReference = objectInput.readUTF();
		qMRefTerms = objectInput.readUTF();
		processForControl = objectInput.readUTF();
		qMRefProcess = objectInput.readUTF();
		criteriaReq = objectInput.readUTF();
		qMRefCriteria = objectInput.readUTF();
		initialCompetence = objectInput.readUTF();
		qMRefInitial = objectInput.readUTF();
		selectingTraining = objectInput.readUTF();
		qMRefSelecting = objectInput.readUTF();
		monitoringCompetence = objectInput.readUTF();
		qMRefMonitoring = objectInput.readUTF();
		writtenAgreement = objectInput.readUTF();
		qMRefWritten = objectInput.readUTF();
		descOfProcess = objectInput.readUTF();
		qMRefDescProcess = objectInput.readUTF();
		processForMonitor = objectInput.readUTF();
		qMRefMonitorProcess = objectInput.readUTF();
		auditProcess = objectInput.readUTF();
		qMRefAuditProcess = objectInput.readUTF();
		processGranting = objectInput.readUTF();
		qMRefGranting = objectInput.readUTF();
		managemntSys = objectInput.readUTF();
		qMRefManagemnt = objectInput.readUTF();
		useOfCertification = objectInput.readUTF();
		qMRefUseOfCerti = objectInput.readUTF();
		handlingReq = objectInput.readUTF();
		qMRefHandling = objectInput.readUTF();
		impartialityPolicies = objectInput.readUTF();
		qMRefImpartPolicy = objectInput.readUTF();
		provisionInform = objectInput.readUTF();
		qMRefProvision = objectInput.readUTF();
		certificationDoc = objectInput.readUTF();
		qMRefCertification = objectInput.readUTF();
		rulesGoverning = objectInput.readUTF();
		qMRefGoverning = objectInput.readUTF();
		enforcableArrangements = objectInput.readUTF();
		qMRefEnforcable = objectInput.readUTF();
		ensureConfidential = objectInput.readUTF();
		qMRefEnsureConfid = objectInput.readUTF();
		informingMechanism = objectInput.readUTF();
		qMRefInforming = objectInput.readUTF();
		applicationProcess = objectInput.readUTF();
		qMRefApplication = objectInput.readUTF();
		applicationReview = objectInput.readUTF();
		qMRefReview = objectInput.readUTF();
		certificationCycle = objectInput.readUTF();
		qMRefCertiCycle = objectInput.readUTF();
		auditTime = objectInput.readUTF();
		qMRefAuditTime = objectInput.readUTF();
		samplingProgram = objectInput.readUTF();
		qMRefSampling = objectInput.readUTF();
		auditPlanning = objectInput.readUTF();
		qMRefPlanning = objectInput.readUTF();
		auditTeam = objectInput.readUTF();
		qMRefAuditTeam = objectInput.readUTF();
		onSiteAudit = objectInput.readUTF();
		qMRefonSiteAudit = objectInput.readUTF();
		auditReport = objectInput.readUTF();
		qMRefAuditReport = objectInput.readUTF();
		correctiveActions = objectInput.readUTF();
		qMRefCorrective = objectInput.readUTF();
		reviewPriorDecision = objectInput.readUTF();
		qMRefReviewPrior = objectInput.readUTF();
		transferCertification = objectInput.readUTF();
		qMRefTransfer = objectInput.readUTF();
		suspensionPolicies = objectInput.readUTF();
		qMRefSuspension = objectInput.readUTF();
		suspensionProcedure = objectInput.readUTF();
		qMRefSuspensionProc = objectInput.readUTF();
		decisionOnAppeals = objectInput.readUTF();
		qMRefDecision = objectInput.readUTF();
		handlingComplaints = objectInput.readUTF();
		qMRefComplaints = objectInput.readUTF();
		recordRetentionPolicy = objectInput.readUTF();
		qMRefRetentionPolicy = objectInput.readUTF();
		recordRetentionProc = objectInput.readUTF();
		qMRefRetentionProc = objectInput.readUTF();
		manageSysPolicies = objectInput.readUTF();
		qMRefPolicies = objectInput.readUTF();
		manageSysObjective = objectInput.readUTF();
		qMRefObjective = objectInput.readUTF();
		manageSysManual = objectInput.readUTF();
		qMRefManual = objectInput.readUTF();
		docControlProcedure = objectInput.readUTF();
		qMRefDocControl = objectInput.readUTF();
		recControlProc = objectInput.readUTF();
		qMRefRecControl = objectInput.readUTF();
		managementReview = objectInput.readUTF();
		qMRefManagementRev = objectInput.readUTF();
		internalAudits = objectInput.readUTF();
		qMRefInternal = objectInput.readUTF();
		identificationProc = objectInput.readUTF();
		qMRefIdentification = objectInput.readUTF();
		qMSScopeB = objectInput.readUTF();
		qMRefQMSScopeB = objectInput.readUTF();
		designDevB = objectInput.readUTF();
		qMRefDesignB = objectInput.readUTF();
		interestedPartyNeedsB = objectInput.readUTF();
		qMRefInterestedB = objectInput.readUTF();
		managementReviewB = objectInput.readUTF();
		qMRefmanagementReviewB = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(accCerBodyManageReqId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (optionFollow == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(optionFollow);
		}

		if (impartialityPolicy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(impartialityPolicy);
		}

		if (qMRefImpartiality == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefImpartiality);
		}

		if (riskAssessment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(riskAssessment);
		}

		if (qMRefRisk == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefRisk);
		}

		if (orgStructure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(orgStructure);
		}

		if (qMRefOrgStruct == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefOrgStruct);
		}

		if (termsOfReference == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(termsOfReference);
		}

		if (qMRefTerms == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefTerms);
		}

		if (processForControl == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(processForControl);
		}

		if (qMRefProcess == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefProcess);
		}

		if (criteriaReq == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(criteriaReq);
		}

		if (qMRefCriteria == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefCriteria);
		}

		if (initialCompetence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(initialCompetence);
		}

		if (qMRefInitial == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefInitial);
		}

		if (selectingTraining == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(selectingTraining);
		}

		if (qMRefSelecting == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefSelecting);
		}

		if (monitoringCompetence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(monitoringCompetence);
		}

		if (qMRefMonitoring == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefMonitoring);
		}

		if (writtenAgreement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(writtenAgreement);
		}

		if (qMRefWritten == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefWritten);
		}

		if (descOfProcess == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descOfProcess);
		}

		if (qMRefDescProcess == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefDescProcess);
		}

		if (processForMonitor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(processForMonitor);
		}

		if (qMRefMonitorProcess == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefMonitorProcess);
		}

		if (auditProcess == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(auditProcess);
		}

		if (qMRefAuditProcess == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefAuditProcess);
		}

		if (processGranting == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(processGranting);
		}

		if (qMRefGranting == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefGranting);
		}

		if (managemntSys == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(managemntSys);
		}

		if (qMRefManagemnt == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefManagemnt);
		}

		if (useOfCertification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(useOfCertification);
		}

		if (qMRefUseOfCerti == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefUseOfCerti);
		}

		if (handlingReq == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(handlingReq);
		}

		if (qMRefHandling == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefHandling);
		}

		if (impartialityPolicies == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(impartialityPolicies);
		}

		if (qMRefImpartPolicy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefImpartPolicy);
		}

		if (provisionInform == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(provisionInform);
		}

		if (qMRefProvision == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefProvision);
		}

		if (certificationDoc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificationDoc);
		}

		if (qMRefCertification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefCertification);
		}

		if (rulesGoverning == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rulesGoverning);
		}

		if (qMRefGoverning == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefGoverning);
		}

		if (enforcableArrangements == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(enforcableArrangements);
		}

		if (qMRefEnforcable == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefEnforcable);
		}

		if (ensureConfidential == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ensureConfidential);
		}

		if (qMRefEnsureConfid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefEnsureConfid);
		}

		if (informingMechanism == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(informingMechanism);
		}

		if (qMRefInforming == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefInforming);
		}

		if (applicationProcess == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationProcess);
		}

		if (qMRefApplication == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefApplication);
		}

		if (applicationReview == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationReview);
		}

		if (qMRefReview == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefReview);
		}

		if (certificationCycle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificationCycle);
		}

		if (qMRefCertiCycle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefCertiCycle);
		}

		if (auditTime == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(auditTime);
		}

		if (qMRefAuditTime == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefAuditTime);
		}

		if (samplingProgram == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(samplingProgram);
		}

		if (qMRefSampling == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefSampling);
		}

		if (auditPlanning == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(auditPlanning);
		}

		if (qMRefPlanning == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefPlanning);
		}

		if (auditTeam == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(auditTeam);
		}

		if (qMRefAuditTeam == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefAuditTeam);
		}

		if (onSiteAudit == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(onSiteAudit);
		}

		if (qMRefonSiteAudit == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefonSiteAudit);
		}

		if (auditReport == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(auditReport);
		}

		if (qMRefAuditReport == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefAuditReport);
		}

		if (correctiveActions == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(correctiveActions);
		}

		if (qMRefCorrective == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefCorrective);
		}

		if (reviewPriorDecision == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reviewPriorDecision);
		}

		if (qMRefReviewPrior == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefReviewPrior);
		}

		if (transferCertification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transferCertification);
		}

		if (qMRefTransfer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefTransfer);
		}

		if (suspensionPolicies == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(suspensionPolicies);
		}

		if (qMRefSuspension == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefSuspension);
		}

		if (suspensionProcedure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(suspensionProcedure);
		}

		if (qMRefSuspensionProc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefSuspensionProc);
		}

		if (decisionOnAppeals == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(decisionOnAppeals);
		}

		if (qMRefDecision == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefDecision);
		}

		if (handlingComplaints == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(handlingComplaints);
		}

		if (qMRefComplaints == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefComplaints);
		}

		if (recordRetentionPolicy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(recordRetentionPolicy);
		}

		if (qMRefRetentionPolicy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefRetentionPolicy);
		}

		if (recordRetentionProc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(recordRetentionProc);
		}

		if (qMRefRetentionProc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefRetentionProc);
		}

		if (manageSysPolicies == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manageSysPolicies);
		}

		if (qMRefPolicies == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefPolicies);
		}

		if (manageSysObjective == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manageSysObjective);
		}

		if (qMRefObjective == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefObjective);
		}

		if (manageSysManual == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manageSysManual);
		}

		if (qMRefManual == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefManual);
		}

		if (docControlProcedure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(docControlProcedure);
		}

		if (qMRefDocControl == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefDocControl);
		}

		if (recControlProc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(recControlProc);
		}

		if (qMRefRecControl == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefRecControl);
		}

		if (managementReview == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(managementReview);
		}

		if (qMRefManagementRev == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefManagementRev);
		}

		if (internalAudits == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(internalAudits);
		}

		if (qMRefInternal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefInternal);
		}

		if (identificationProc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(identificationProc);
		}

		if (qMRefIdentification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefIdentification);
		}

		if (qMSScopeB == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMSScopeB);
		}

		if (qMRefQMSScopeB == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefQMSScopeB);
		}

		if (designDevB == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(designDevB);
		}

		if (qMRefDesignB == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefDesignB);
		}

		if (interestedPartyNeedsB == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(interestedPartyNeedsB);
		}

		if (qMRefInterestedB == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefInterestedB);
		}

		if (managementReviewB == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(managementReviewB);
		}

		if (qMRefmanagementReviewB == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefmanagementReviewB);
		}

		objectOutput.writeLong(janaacApplicationId);
	}

	public String uuid;
	public long accCerBodyManageReqId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String optionFollow;
	public String impartialityPolicy;
	public String qMRefImpartiality;
	public String riskAssessment;
	public String qMRefRisk;
	public String orgStructure;
	public String qMRefOrgStruct;
	public String termsOfReference;
	public String qMRefTerms;
	public String processForControl;
	public String qMRefProcess;
	public String criteriaReq;
	public String qMRefCriteria;
	public String initialCompetence;
	public String qMRefInitial;
	public String selectingTraining;
	public String qMRefSelecting;
	public String monitoringCompetence;
	public String qMRefMonitoring;
	public String writtenAgreement;
	public String qMRefWritten;
	public String descOfProcess;
	public String qMRefDescProcess;
	public String processForMonitor;
	public String qMRefMonitorProcess;
	public String auditProcess;
	public String qMRefAuditProcess;
	public String processGranting;
	public String qMRefGranting;
	public String managemntSys;
	public String qMRefManagemnt;
	public String useOfCertification;
	public String qMRefUseOfCerti;
	public String handlingReq;
	public String qMRefHandling;
	public String impartialityPolicies;
	public String qMRefImpartPolicy;
	public String provisionInform;
	public String qMRefProvision;
	public String certificationDoc;
	public String qMRefCertification;
	public String rulesGoverning;
	public String qMRefGoverning;
	public String enforcableArrangements;
	public String qMRefEnforcable;
	public String ensureConfidential;
	public String qMRefEnsureConfid;
	public String informingMechanism;
	public String qMRefInforming;
	public String applicationProcess;
	public String qMRefApplication;
	public String applicationReview;
	public String qMRefReview;
	public String certificationCycle;
	public String qMRefCertiCycle;
	public String auditTime;
	public String qMRefAuditTime;
	public String samplingProgram;
	public String qMRefSampling;
	public String auditPlanning;
	public String qMRefPlanning;
	public String auditTeam;
	public String qMRefAuditTeam;
	public String onSiteAudit;
	public String qMRefonSiteAudit;
	public String auditReport;
	public String qMRefAuditReport;
	public String correctiveActions;
	public String qMRefCorrective;
	public String reviewPriorDecision;
	public String qMRefReviewPrior;
	public String transferCertification;
	public String qMRefTransfer;
	public String suspensionPolicies;
	public String qMRefSuspension;
	public String suspensionProcedure;
	public String qMRefSuspensionProc;
	public String decisionOnAppeals;
	public String qMRefDecision;
	public String handlingComplaints;
	public String qMRefComplaints;
	public String recordRetentionPolicy;
	public String qMRefRetentionPolicy;
	public String recordRetentionProc;
	public String qMRefRetentionProc;
	public String manageSysPolicies;
	public String qMRefPolicies;
	public String manageSysObjective;
	public String qMRefObjective;
	public String manageSysManual;
	public String qMRefManual;
	public String docControlProcedure;
	public String qMRefDocControl;
	public String recControlProc;
	public String qMRefRecControl;
	public String managementReview;
	public String qMRefManagementRev;
	public String internalAudits;
	public String qMRefInternal;
	public String identificationProc;
	public String qMRefIdentification;
	public String qMSScopeB;
	public String qMRefQMSScopeB;
	public String designDevB;
	public String qMRefDesignB;
	public String interestedPartyNeedsB;
	public String qMRefInterestedB;
	public String managementReviewB;
	public String qMRefmanagementReviewB;
	public long janaacApplicationId;

}