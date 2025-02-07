/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccCerBodyMngReqTwo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccCerBodyMngReqTwoCacheModel
	implements CacheModel<AccCerBodyMngReqTwo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccCerBodyMngReqTwoCacheModel)) {
			return false;
		}

		AccCerBodyMngReqTwoCacheModel accCerBodyMngReqTwoCacheModel =
			(AccCerBodyMngReqTwoCacheModel)object;

		if (accCerBodyMngReqTwoId ==
				accCerBodyMngReqTwoCacheModel.accCerBodyMngReqTwoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accCerBodyMngReqTwoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(161);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accCerBodyMngReqTwoId=");
		sb.append(accCerBodyMngReqTwoId);
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
		sb.append(", certiAgreement=");
		sb.append(certiAgreement);
		sb.append(", qMRefCertiAgreement=");
		sb.append(qMRefCertiAgreement);
		sb.append(", riskAssessment=");
		sb.append(riskAssessment);
		sb.append(", qMRefRisk=");
		sb.append(qMRefRisk);
		sb.append(", confidentiality=");
		sb.append(confidentiality);
		sb.append(", qMRefConfidentiality=");
		sb.append(qMRefConfidentiality);
		sb.append(", security=");
		sb.append(security);
		sb.append(", qMRefSecurity=");
		sb.append(qMRefSecurity);
		sb.append(", certificationScheme=");
		sb.append(certificationScheme);
		sb.append(", qMRefCertifiScheme=");
		sb.append(qMRefCertifiScheme);
		sb.append(", validCertification=");
		sb.append(validCertification);
		sb.append(", qMRefValidCertification=");
		sb.append(qMRefValidCertification);
		sb.append(", preRequisites=");
		sb.append(preRequisites);
		sb.append(", qMRefPrerequisites=");
		sb.append(qMRefPrerequisites);
		sb.append(", infoProvided=");
		sb.append(infoProvided);
		sb.append(", qMRefInfoProvided=");
		sb.append(qMRefInfoProvided);
		sb.append(", handlingAppeals=");
		sb.append(handlingAppeals);
		sb.append(", qMRefHandlingAppeals=");
		sb.append(qMRefHandlingAppeals);
		sb.append(", handlingComplaints=");
		sb.append(handlingComplaints);
		sb.append(", qMRefHandlingComplaint=");
		sb.append(qMRefHandlingComplaint);
		sb.append(", orgStructure=");
		sb.append(orgStructure);
		sb.append(", qMRefOrgStructure=");
		sb.append(qMRefOrgStructure);
		sb.append(", formalRules=");
		sb.append(formalRules);
		sb.append(", qMRefFormalRules=");
		sb.append(qMRefFormalRules);
		sb.append(", safeguardingMechanism=");
		sb.append(safeguardingMechanism);
		sb.append(", qMRefSafeguarding=");
		sb.append(qMRefSafeguarding);
		sb.append(", managementProc=");
		sb.append(managementProc);
		sb.append(", qMRefManagementProc=");
		sb.append(qMRefManagementProc);
		sb.append(", contractExaminer=");
		sb.append(contractExaminer);
		sb.append(", qMRefExaminer=");
		sb.append(qMRefExaminer);
		sb.append(", contractBody=");
		sb.append(contractBody);
		sb.append(", qMRefContractBody=");
		sb.append(qMRefContractBody);
		sb.append(", docPolicies=");
		sb.append(docPolicies);
		sb.append(", qMRefDocPolicies=");
		sb.append(qMRefDocPolicies);
		sb.append(", specifiedStandard=");
		sb.append(specifiedStandard);
		sb.append(", qMRefSpecified=");
		sb.append(qMRefSpecified);
		sb.append(", applicationForm=");
		sb.append(applicationForm);
		sb.append(", qMRefAppliForm=");
		sb.append(qMRefAppliForm);
		sb.append(", applicationReview=");
		sb.append(applicationReview);
		sb.append(", qMRefAppliReview=");
		sb.append(qMRefAppliReview);
		sb.append(", assessmentPlan=");
		sb.append(assessmentPlan);
		sb.append(", qMRefAssessmentPlan=");
		sb.append(qMRefAssessmentPlan);
		sb.append(", examinationProcess=");
		sb.append(examinationProcess);
		sb.append(", qMRefExamProcess=");
		sb.append(qMRefExamProcess);
		sb.append(", certificationDecision=");
		sb.append(certificationDecision);
		sb.append(", qMRefCertiDecision=");
		sb.append(qMRefCertiDecision);
		sb.append(", certificationDoc=");
		sb.append(certificationDoc);
		sb.append(", qMRefCertiDoc=");
		sb.append(qMRefCertiDoc);
		sb.append(", useOfCertificates=");
		sb.append(useOfCertificates);
		sb.append(", qMRefUseOfCertificate=");
		sb.append(qMRefUseOfCertificate);
		sb.append(", suspension=");
		sb.append(suspension);
		sb.append(", qMRefSuspension=");
		sb.append(qMRefSuspension);
		sb.append(", processToReceive=");
		sb.append(processToReceive);
		sb.append(", qMRefReceiveProcess=");
		sb.append(qMRefReceiveProcess);
		sb.append(", generalManage=");
		sb.append(generalManage);
		sb.append(", qMRefGeneral=");
		sb.append(qMRefGeneral);
		sb.append(", docControl=");
		sb.append(docControl);
		sb.append(", qMRefDocControl=");
		sb.append(qMRefDocControl);
		sb.append(", recordControl=");
		sb.append(recordControl);
		sb.append(", qMRefRecControl=");
		sb.append(qMRefRecControl);
		sb.append(", manageReview=");
		sb.append(manageReview);
		sb.append(", qMRefManageReview=");
		sb.append(qMRefManageReview);
		sb.append(", internalAudit=");
		sb.append(internalAudit);
		sb.append(", qMRefInternal=");
		sb.append(qMRefInternal);
		sb.append(", correctiveAction=");
		sb.append(correctiveAction);
		sb.append(", qMRefCorrective=");
		sb.append(qMRefCorrective);
		sb.append(", preventiveAction=");
		sb.append(preventiveAction);
		sb.append(", qMRefPreventive=");
		sb.append(qMRefPreventive);
		sb.append(", docInKeeping=");
		sb.append(docInKeeping);
		sb.append(", qMRefDocInKeeping=");
		sb.append(qMRefDocInKeeping);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccCerBodyMngReqTwo toEntityModel() {
		AccCerBodyMngReqTwoImpl accCerBodyMngReqTwoImpl =
			new AccCerBodyMngReqTwoImpl();

		if (uuid == null) {
			accCerBodyMngReqTwoImpl.setUuid("");
		}
		else {
			accCerBodyMngReqTwoImpl.setUuid(uuid);
		}

		accCerBodyMngReqTwoImpl.setAccCerBodyMngReqTwoId(accCerBodyMngReqTwoId);
		accCerBodyMngReqTwoImpl.setGroupId(groupId);
		accCerBodyMngReqTwoImpl.setCompanyId(companyId);
		accCerBodyMngReqTwoImpl.setUserId(userId);

		if (userName == null) {
			accCerBodyMngReqTwoImpl.setUserName("");
		}
		else {
			accCerBodyMngReqTwoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accCerBodyMngReqTwoImpl.setCreateDate(null);
		}
		else {
			accCerBodyMngReqTwoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accCerBodyMngReqTwoImpl.setModifiedDate(null);
		}
		else {
			accCerBodyMngReqTwoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (optionFollow == null) {
			accCerBodyMngReqTwoImpl.setOptionFollow("");
		}
		else {
			accCerBodyMngReqTwoImpl.setOptionFollow(optionFollow);
		}

		if (certiAgreement == null) {
			accCerBodyMngReqTwoImpl.setCertiAgreement("");
		}
		else {
			accCerBodyMngReqTwoImpl.setCertiAgreement(certiAgreement);
		}

		if (qMRefCertiAgreement == null) {
			accCerBodyMngReqTwoImpl.setQMRefCertiAgreement("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefCertiAgreement(qMRefCertiAgreement);
		}

		if (riskAssessment == null) {
			accCerBodyMngReqTwoImpl.setRiskAssessment("");
		}
		else {
			accCerBodyMngReqTwoImpl.setRiskAssessment(riskAssessment);
		}

		if (qMRefRisk == null) {
			accCerBodyMngReqTwoImpl.setQMRefRisk("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefRisk(qMRefRisk);
		}

		if (confidentiality == null) {
			accCerBodyMngReqTwoImpl.setConfidentiality("");
		}
		else {
			accCerBodyMngReqTwoImpl.setConfidentiality(confidentiality);
		}

		if (qMRefConfidentiality == null) {
			accCerBodyMngReqTwoImpl.setQMRefConfidentiality("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefConfidentiality(
				qMRefConfidentiality);
		}

		if (security == null) {
			accCerBodyMngReqTwoImpl.setSecurity("");
		}
		else {
			accCerBodyMngReqTwoImpl.setSecurity(security);
		}

		if (qMRefSecurity == null) {
			accCerBodyMngReqTwoImpl.setQMRefSecurity("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefSecurity(qMRefSecurity);
		}

		if (certificationScheme == null) {
			accCerBodyMngReqTwoImpl.setCertificationScheme("");
		}
		else {
			accCerBodyMngReqTwoImpl.setCertificationScheme(certificationScheme);
		}

		if (qMRefCertifiScheme == null) {
			accCerBodyMngReqTwoImpl.setQMRefCertifiScheme("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefCertifiScheme(qMRefCertifiScheme);
		}

		if (validCertification == null) {
			accCerBodyMngReqTwoImpl.setValidCertification("");
		}
		else {
			accCerBodyMngReqTwoImpl.setValidCertification(validCertification);
		}

		if (qMRefValidCertification == null) {
			accCerBodyMngReqTwoImpl.setQMRefValidCertification("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefValidCertification(
				qMRefValidCertification);
		}

		if (preRequisites == null) {
			accCerBodyMngReqTwoImpl.setPreRequisites("");
		}
		else {
			accCerBodyMngReqTwoImpl.setPreRequisites(preRequisites);
		}

		if (qMRefPrerequisites == null) {
			accCerBodyMngReqTwoImpl.setQMRefPrerequisites("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefPrerequisites(qMRefPrerequisites);
		}

		if (infoProvided == null) {
			accCerBodyMngReqTwoImpl.setInfoProvided("");
		}
		else {
			accCerBodyMngReqTwoImpl.setInfoProvided(infoProvided);
		}

		if (qMRefInfoProvided == null) {
			accCerBodyMngReqTwoImpl.setQMRefInfoProvided("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefInfoProvided(qMRefInfoProvided);
		}

		if (handlingAppeals == null) {
			accCerBodyMngReqTwoImpl.setHandlingAppeals("");
		}
		else {
			accCerBodyMngReqTwoImpl.setHandlingAppeals(handlingAppeals);
		}

		if (qMRefHandlingAppeals == null) {
			accCerBodyMngReqTwoImpl.setQMRefHandlingAppeals("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefHandlingAppeals(
				qMRefHandlingAppeals);
		}

		if (handlingComplaints == null) {
			accCerBodyMngReqTwoImpl.setHandlingComplaints("");
		}
		else {
			accCerBodyMngReqTwoImpl.setHandlingComplaints(handlingComplaints);
		}

		if (qMRefHandlingComplaint == null) {
			accCerBodyMngReqTwoImpl.setQMRefHandlingComplaint("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefHandlingComplaint(
				qMRefHandlingComplaint);
		}

		if (orgStructure == null) {
			accCerBodyMngReqTwoImpl.setOrgStructure("");
		}
		else {
			accCerBodyMngReqTwoImpl.setOrgStructure(orgStructure);
		}

		if (qMRefOrgStructure == null) {
			accCerBodyMngReqTwoImpl.setQMRefOrgStructure("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefOrgStructure(qMRefOrgStructure);
		}

		if (formalRules == null) {
			accCerBodyMngReqTwoImpl.setFormalRules("");
		}
		else {
			accCerBodyMngReqTwoImpl.setFormalRules(formalRules);
		}

		if (qMRefFormalRules == null) {
			accCerBodyMngReqTwoImpl.setQMRefFormalRules("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefFormalRules(qMRefFormalRules);
		}

		if (safeguardingMechanism == null) {
			accCerBodyMngReqTwoImpl.setSafeguardingMechanism("");
		}
		else {
			accCerBodyMngReqTwoImpl.setSafeguardingMechanism(
				safeguardingMechanism);
		}

		if (qMRefSafeguarding == null) {
			accCerBodyMngReqTwoImpl.setQMRefSafeguarding("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefSafeguarding(qMRefSafeguarding);
		}

		if (managementProc == null) {
			accCerBodyMngReqTwoImpl.setManagementProc("");
		}
		else {
			accCerBodyMngReqTwoImpl.setManagementProc(managementProc);
		}

		if (qMRefManagementProc == null) {
			accCerBodyMngReqTwoImpl.setQMRefManagementProc("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefManagementProc(qMRefManagementProc);
		}

		if (contractExaminer == null) {
			accCerBodyMngReqTwoImpl.setContractExaminer("");
		}
		else {
			accCerBodyMngReqTwoImpl.setContractExaminer(contractExaminer);
		}

		if (qMRefExaminer == null) {
			accCerBodyMngReqTwoImpl.setQMRefExaminer("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefExaminer(qMRefExaminer);
		}

		if (contractBody == null) {
			accCerBodyMngReqTwoImpl.setContractBody("");
		}
		else {
			accCerBodyMngReqTwoImpl.setContractBody(contractBody);
		}

		if (qMRefContractBody == null) {
			accCerBodyMngReqTwoImpl.setQMRefContractBody("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefContractBody(qMRefContractBody);
		}

		if (docPolicies == null) {
			accCerBodyMngReqTwoImpl.setDocPolicies("");
		}
		else {
			accCerBodyMngReqTwoImpl.setDocPolicies(docPolicies);
		}

		if (qMRefDocPolicies == null) {
			accCerBodyMngReqTwoImpl.setQMRefDocPolicies("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefDocPolicies(qMRefDocPolicies);
		}

		if (specifiedStandard == null) {
			accCerBodyMngReqTwoImpl.setSpecifiedStandard("");
		}
		else {
			accCerBodyMngReqTwoImpl.setSpecifiedStandard(specifiedStandard);
		}

		if (qMRefSpecified == null) {
			accCerBodyMngReqTwoImpl.setQMRefSpecified("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefSpecified(qMRefSpecified);
		}

		if (applicationForm == null) {
			accCerBodyMngReqTwoImpl.setApplicationForm("");
		}
		else {
			accCerBodyMngReqTwoImpl.setApplicationForm(applicationForm);
		}

		if (qMRefAppliForm == null) {
			accCerBodyMngReqTwoImpl.setQMRefAppliForm("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefAppliForm(qMRefAppliForm);
		}

		if (applicationReview == null) {
			accCerBodyMngReqTwoImpl.setApplicationReview("");
		}
		else {
			accCerBodyMngReqTwoImpl.setApplicationReview(applicationReview);
		}

		if (qMRefAppliReview == null) {
			accCerBodyMngReqTwoImpl.setQMRefAppliReview("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefAppliReview(qMRefAppliReview);
		}

		if (assessmentPlan == null) {
			accCerBodyMngReqTwoImpl.setAssessmentPlan("");
		}
		else {
			accCerBodyMngReqTwoImpl.setAssessmentPlan(assessmentPlan);
		}

		if (qMRefAssessmentPlan == null) {
			accCerBodyMngReqTwoImpl.setQMRefAssessmentPlan("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefAssessmentPlan(qMRefAssessmentPlan);
		}

		if (examinationProcess == null) {
			accCerBodyMngReqTwoImpl.setExaminationProcess("");
		}
		else {
			accCerBodyMngReqTwoImpl.setExaminationProcess(examinationProcess);
		}

		if (qMRefExamProcess == null) {
			accCerBodyMngReqTwoImpl.setQMRefExamProcess("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefExamProcess(qMRefExamProcess);
		}

		if (certificationDecision == null) {
			accCerBodyMngReqTwoImpl.setCertificationDecision("");
		}
		else {
			accCerBodyMngReqTwoImpl.setCertificationDecision(
				certificationDecision);
		}

		if (qMRefCertiDecision == null) {
			accCerBodyMngReqTwoImpl.setQMRefCertiDecision("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefCertiDecision(qMRefCertiDecision);
		}

		if (certificationDoc == null) {
			accCerBodyMngReqTwoImpl.setCertificationDoc("");
		}
		else {
			accCerBodyMngReqTwoImpl.setCertificationDoc(certificationDoc);
		}

		if (qMRefCertiDoc == null) {
			accCerBodyMngReqTwoImpl.setQMRefCertiDoc("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefCertiDoc(qMRefCertiDoc);
		}

		if (useOfCertificates == null) {
			accCerBodyMngReqTwoImpl.setUseOfCertificates("");
		}
		else {
			accCerBodyMngReqTwoImpl.setUseOfCertificates(useOfCertificates);
		}

		if (qMRefUseOfCertificate == null) {
			accCerBodyMngReqTwoImpl.setQMRefUseOfCertificate("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefUseOfCertificate(
				qMRefUseOfCertificate);
		}

		if (suspension == null) {
			accCerBodyMngReqTwoImpl.setSuspension("");
		}
		else {
			accCerBodyMngReqTwoImpl.setSuspension(suspension);
		}

		if (qMRefSuspension == null) {
			accCerBodyMngReqTwoImpl.setQMRefSuspension("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefSuspension(qMRefSuspension);
		}

		if (processToReceive == null) {
			accCerBodyMngReqTwoImpl.setProcessToReceive("");
		}
		else {
			accCerBodyMngReqTwoImpl.setProcessToReceive(processToReceive);
		}

		if (qMRefReceiveProcess == null) {
			accCerBodyMngReqTwoImpl.setQMRefReceiveProcess("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefReceiveProcess(qMRefReceiveProcess);
		}

		if (generalManage == null) {
			accCerBodyMngReqTwoImpl.setGeneralManage("");
		}
		else {
			accCerBodyMngReqTwoImpl.setGeneralManage(generalManage);
		}

		if (qMRefGeneral == null) {
			accCerBodyMngReqTwoImpl.setQMRefGeneral("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefGeneral(qMRefGeneral);
		}

		if (docControl == null) {
			accCerBodyMngReqTwoImpl.setDocControl("");
		}
		else {
			accCerBodyMngReqTwoImpl.setDocControl(docControl);
		}

		if (qMRefDocControl == null) {
			accCerBodyMngReqTwoImpl.setQMRefDocControl("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefDocControl(qMRefDocControl);
		}

		if (recordControl == null) {
			accCerBodyMngReqTwoImpl.setRecordControl("");
		}
		else {
			accCerBodyMngReqTwoImpl.setRecordControl(recordControl);
		}

		if (qMRefRecControl == null) {
			accCerBodyMngReqTwoImpl.setQMRefRecControl("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefRecControl(qMRefRecControl);
		}

		if (manageReview == null) {
			accCerBodyMngReqTwoImpl.setManageReview("");
		}
		else {
			accCerBodyMngReqTwoImpl.setManageReview(manageReview);
		}

		if (qMRefManageReview == null) {
			accCerBodyMngReqTwoImpl.setQMRefManageReview("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefManageReview(qMRefManageReview);
		}

		if (internalAudit == null) {
			accCerBodyMngReqTwoImpl.setInternalAudit("");
		}
		else {
			accCerBodyMngReqTwoImpl.setInternalAudit(internalAudit);
		}

		if (qMRefInternal == null) {
			accCerBodyMngReqTwoImpl.setQMRefInternal("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefInternal(qMRefInternal);
		}

		if (correctiveAction == null) {
			accCerBodyMngReqTwoImpl.setCorrectiveAction("");
		}
		else {
			accCerBodyMngReqTwoImpl.setCorrectiveAction(correctiveAction);
		}

		if (qMRefCorrective == null) {
			accCerBodyMngReqTwoImpl.setQMRefCorrective("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefCorrective(qMRefCorrective);
		}

		if (preventiveAction == null) {
			accCerBodyMngReqTwoImpl.setPreventiveAction("");
		}
		else {
			accCerBodyMngReqTwoImpl.setPreventiveAction(preventiveAction);
		}

		if (qMRefPreventive == null) {
			accCerBodyMngReqTwoImpl.setQMRefPreventive("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefPreventive(qMRefPreventive);
		}

		if (docInKeeping == null) {
			accCerBodyMngReqTwoImpl.setDocInKeeping("");
		}
		else {
			accCerBodyMngReqTwoImpl.setDocInKeeping(docInKeeping);
		}

		if (qMRefDocInKeeping == null) {
			accCerBodyMngReqTwoImpl.setQMRefDocInKeeping("");
		}
		else {
			accCerBodyMngReqTwoImpl.setQMRefDocInKeeping(qMRefDocInKeeping);
		}

		accCerBodyMngReqTwoImpl.setJanaacApplicationId(janaacApplicationId);

		accCerBodyMngReqTwoImpl.resetOriginalValues();

		return accCerBodyMngReqTwoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accCerBodyMngReqTwoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		optionFollow = objectInput.readUTF();
		certiAgreement = objectInput.readUTF();
		qMRefCertiAgreement = objectInput.readUTF();
		riskAssessment = objectInput.readUTF();
		qMRefRisk = objectInput.readUTF();
		confidentiality = objectInput.readUTF();
		qMRefConfidentiality = objectInput.readUTF();
		security = objectInput.readUTF();
		qMRefSecurity = objectInput.readUTF();
		certificationScheme = objectInput.readUTF();
		qMRefCertifiScheme = objectInput.readUTF();
		validCertification = objectInput.readUTF();
		qMRefValidCertification = objectInput.readUTF();
		preRequisites = objectInput.readUTF();
		qMRefPrerequisites = objectInput.readUTF();
		infoProvided = objectInput.readUTF();
		qMRefInfoProvided = objectInput.readUTF();
		handlingAppeals = objectInput.readUTF();
		qMRefHandlingAppeals = objectInput.readUTF();
		handlingComplaints = objectInput.readUTF();
		qMRefHandlingComplaint = objectInput.readUTF();
		orgStructure = objectInput.readUTF();
		qMRefOrgStructure = objectInput.readUTF();
		formalRules = objectInput.readUTF();
		qMRefFormalRules = objectInput.readUTF();
		safeguardingMechanism = objectInput.readUTF();
		qMRefSafeguarding = objectInput.readUTF();
		managementProc = objectInput.readUTF();
		qMRefManagementProc = objectInput.readUTF();
		contractExaminer = objectInput.readUTF();
		qMRefExaminer = objectInput.readUTF();
		contractBody = objectInput.readUTF();
		qMRefContractBody = objectInput.readUTF();
		docPolicies = objectInput.readUTF();
		qMRefDocPolicies = objectInput.readUTF();
		specifiedStandard = objectInput.readUTF();
		qMRefSpecified = objectInput.readUTF();
		applicationForm = objectInput.readUTF();
		qMRefAppliForm = objectInput.readUTF();
		applicationReview = objectInput.readUTF();
		qMRefAppliReview = objectInput.readUTF();
		assessmentPlan = objectInput.readUTF();
		qMRefAssessmentPlan = objectInput.readUTF();
		examinationProcess = objectInput.readUTF();
		qMRefExamProcess = objectInput.readUTF();
		certificationDecision = objectInput.readUTF();
		qMRefCertiDecision = objectInput.readUTF();
		certificationDoc = objectInput.readUTF();
		qMRefCertiDoc = objectInput.readUTF();
		useOfCertificates = objectInput.readUTF();
		qMRefUseOfCertificate = objectInput.readUTF();
		suspension = objectInput.readUTF();
		qMRefSuspension = objectInput.readUTF();
		processToReceive = objectInput.readUTF();
		qMRefReceiveProcess = objectInput.readUTF();
		generalManage = objectInput.readUTF();
		qMRefGeneral = objectInput.readUTF();
		docControl = objectInput.readUTF();
		qMRefDocControl = objectInput.readUTF();
		recordControl = objectInput.readUTF();
		qMRefRecControl = objectInput.readUTF();
		manageReview = objectInput.readUTF();
		qMRefManageReview = objectInput.readUTF();
		internalAudit = objectInput.readUTF();
		qMRefInternal = objectInput.readUTF();
		correctiveAction = objectInput.readUTF();
		qMRefCorrective = objectInput.readUTF();
		preventiveAction = objectInput.readUTF();
		qMRefPreventive = objectInput.readUTF();
		docInKeeping = objectInput.readUTF();
		qMRefDocInKeeping = objectInput.readUTF();

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

		objectOutput.writeLong(accCerBodyMngReqTwoId);

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

		if (certiAgreement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certiAgreement);
		}

		if (qMRefCertiAgreement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefCertiAgreement);
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

		if (confidentiality == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(confidentiality);
		}

		if (qMRefConfidentiality == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefConfidentiality);
		}

		if (security == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(security);
		}

		if (qMRefSecurity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefSecurity);
		}

		if (certificationScheme == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificationScheme);
		}

		if (qMRefCertifiScheme == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefCertifiScheme);
		}

		if (validCertification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(validCertification);
		}

		if (qMRefValidCertification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefValidCertification);
		}

		if (preRequisites == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(preRequisites);
		}

		if (qMRefPrerequisites == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefPrerequisites);
		}

		if (infoProvided == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(infoProvided);
		}

		if (qMRefInfoProvided == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefInfoProvided);
		}

		if (handlingAppeals == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(handlingAppeals);
		}

		if (qMRefHandlingAppeals == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefHandlingAppeals);
		}

		if (handlingComplaints == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(handlingComplaints);
		}

		if (qMRefHandlingComplaint == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefHandlingComplaint);
		}

		if (orgStructure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(orgStructure);
		}

		if (qMRefOrgStructure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefOrgStructure);
		}

		if (formalRules == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(formalRules);
		}

		if (qMRefFormalRules == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefFormalRules);
		}

		if (safeguardingMechanism == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(safeguardingMechanism);
		}

		if (qMRefSafeguarding == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefSafeguarding);
		}

		if (managementProc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(managementProc);
		}

		if (qMRefManagementProc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefManagementProc);
		}

		if (contractExaminer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contractExaminer);
		}

		if (qMRefExaminer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefExaminer);
		}

		if (contractBody == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contractBody);
		}

		if (qMRefContractBody == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefContractBody);
		}

		if (docPolicies == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(docPolicies);
		}

		if (qMRefDocPolicies == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefDocPolicies);
		}

		if (specifiedStandard == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(specifiedStandard);
		}

		if (qMRefSpecified == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefSpecified);
		}

		if (applicationForm == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationForm);
		}

		if (qMRefAppliForm == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefAppliForm);
		}

		if (applicationReview == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationReview);
		}

		if (qMRefAppliReview == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefAppliReview);
		}

		if (assessmentPlan == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assessmentPlan);
		}

		if (qMRefAssessmentPlan == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefAssessmentPlan);
		}

		if (examinationProcess == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(examinationProcess);
		}

		if (qMRefExamProcess == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefExamProcess);
		}

		if (certificationDecision == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificationDecision);
		}

		if (qMRefCertiDecision == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefCertiDecision);
		}

		if (certificationDoc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificationDoc);
		}

		if (qMRefCertiDoc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefCertiDoc);
		}

		if (useOfCertificates == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(useOfCertificates);
		}

		if (qMRefUseOfCertificate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefUseOfCertificate);
		}

		if (suspension == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(suspension);
		}

		if (qMRefSuspension == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefSuspension);
		}

		if (processToReceive == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(processToReceive);
		}

		if (qMRefReceiveProcess == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefReceiveProcess);
		}

		if (generalManage == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(generalManage);
		}

		if (qMRefGeneral == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefGeneral);
		}

		if (docControl == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(docControl);
		}

		if (qMRefDocControl == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefDocControl);
		}

		if (recordControl == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(recordControl);
		}

		if (qMRefRecControl == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefRecControl);
		}

		if (manageReview == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manageReview);
		}

		if (qMRefManageReview == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefManageReview);
		}

		if (internalAudit == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(internalAudit);
		}

		if (qMRefInternal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefInternal);
		}

		if (correctiveAction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(correctiveAction);
		}

		if (qMRefCorrective == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefCorrective);
		}

		if (preventiveAction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(preventiveAction);
		}

		if (qMRefPreventive == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefPreventive);
		}

		if (docInKeeping == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(docInKeeping);
		}

		if (qMRefDocInKeeping == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefDocInKeeping);
		}

		objectOutput.writeLong(janaacApplicationId);
	}

	public String uuid;
	public long accCerBodyMngReqTwoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String optionFollow;
	public String certiAgreement;
	public String qMRefCertiAgreement;
	public String riskAssessment;
	public String qMRefRisk;
	public String confidentiality;
	public String qMRefConfidentiality;
	public String security;
	public String qMRefSecurity;
	public String certificationScheme;
	public String qMRefCertifiScheme;
	public String validCertification;
	public String qMRefValidCertification;
	public String preRequisites;
	public String qMRefPrerequisites;
	public String infoProvided;
	public String qMRefInfoProvided;
	public String handlingAppeals;
	public String qMRefHandlingAppeals;
	public String handlingComplaints;
	public String qMRefHandlingComplaint;
	public String orgStructure;
	public String qMRefOrgStructure;
	public String formalRules;
	public String qMRefFormalRules;
	public String safeguardingMechanism;
	public String qMRefSafeguarding;
	public String managementProc;
	public String qMRefManagementProc;
	public String contractExaminer;
	public String qMRefExaminer;
	public String contractBody;
	public String qMRefContractBody;
	public String docPolicies;
	public String qMRefDocPolicies;
	public String specifiedStandard;
	public String qMRefSpecified;
	public String applicationForm;
	public String qMRefAppliForm;
	public String applicationReview;
	public String qMRefAppliReview;
	public String assessmentPlan;
	public String qMRefAssessmentPlan;
	public String examinationProcess;
	public String qMRefExamProcess;
	public String certificationDecision;
	public String qMRefCertiDecision;
	public String certificationDoc;
	public String qMRefCertiDoc;
	public String useOfCertificates;
	public String qMRefUseOfCertificate;
	public String suspension;
	public String qMRefSuspension;
	public String processToReceive;
	public String qMRefReceiveProcess;
	public String generalManage;
	public String qMRefGeneral;
	public String docControl;
	public String qMRefDocControl;
	public String recordControl;
	public String qMRefRecControl;
	public String manageReview;
	public String qMRefManageReview;
	public String internalAudit;
	public String qMRefInternal;
	public String correctiveAction;
	public String qMRefCorrective;
	public String preventiveAction;
	public String qMRefPreventive;
	public String docInKeeping;
	public String qMRefDocInKeeping;
	public long janaacApplicationId;

}