/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccMediLabManagementReq;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccMediLabManagementReq in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccMediLabManagementReqCacheModel
	implements CacheModel<AccMediLabManagementReq>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccMediLabManagementReqCacheModel)) {
			return false;
		}

		AccMediLabManagementReqCacheModel accMediLabManagementReqCacheModel =
			(AccMediLabManagementReqCacheModel)object;

		if (accMediLabManagementReqId ==
				accMediLabManagementReqCacheModel.accMediLabManagementReqId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accMediLabManagementReqId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(171);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accMediLabManagementReqId=");
		sb.append(accMediLabManagementReqId);
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
		sb.append(", managementEstablished=");
		sb.append(managementEstablished);
		sb.append(", qMRefManagement=");
		sb.append(qMRefManagement);
		sb.append(", personAware=");
		sb.append(personAware);
		sb.append(", qMRefPerson=");
		sb.append(qMRefPerson);
		sb.append(", policiesAcknowledged=");
		sb.append(policiesAcknowledged);
		sb.append(", qMRefPolicies=");
		sb.append(qMRefPolicies);
		sb.append(", controlledDocument=");
		sb.append(controlledDocument);
		sb.append(", qMRefControlDoc=");
		sb.append(qMRefControlDoc);
		sb.append(", laboratoryEstablished=");
		sb.append(laboratoryEstablished);
		sb.append(", qMReflabEstab=");
		sb.append(qMReflabEstab);
		sb.append(", identifiedRisks=");
		sb.append(identifiedRisks);
		sb.append(", qMRefRisks=");
		sb.append(qMRefRisks);
		sb.append(", havePersonnel=");
		sb.append(havePersonnel);
		sb.append(", qMRefPersonnel=");
		sb.append(qMRefPersonnel);
		sb.append(", authorizePersonnel=");
		sb.append(authorizePersonnel);
		sb.append(", qMRefAuthorize=");
		sb.append(qMRefAuthorize);
		sb.append(", labControlDocsFulfilment=");
		sb.append(labControlDocsFulfilment);
		sb.append(", otherRefFulfil=");
		sb.append(otherRefFulfil);
		sb.append(", legibleRecordsFulfil=");
		sb.append(legibleRecordsFulfil);
		sb.append(", otherRefLegibleRec=");
		sb.append(otherRefLegibleRec);
		sb.append(", proceduresInPlace=");
		sb.append(proceduresInPlace);
		sb.append(", otherRefProcedure=");
		sb.append(otherRefProcedure);
		sb.append(", communicatedRequirement=");
		sb.append(communicatedRequirement);
		sb.append(", otherRefRequirement=");
		sb.append(otherRefRequirement);
		sb.append(", procedureForSelection=");
		sb.append(procedureForSelection);
		sb.append(", otherRefSelection=");
		sb.append(otherRefSelection);
		sb.append(", arrangementInPlace=");
		sb.append(arrangementInPlace);
		sb.append(", otherRefArrange=");
		sb.append(otherRefArrange);
		sb.append(", processInPlace=");
		sb.append(processInPlace);
		sb.append(", otherRefProcess=");
		sb.append(otherRefProcess);
		sb.append(", labOperateProgramme=");
		sb.append(labOperateProgramme);
		sb.append(", otherRefLabOperate=");
		sb.append(otherRefLabOperate);
		sb.append(", identifyOpportunities=");
		sb.append(identifyOpportunities);
		sb.append(", otherRefOpportunity=");
		sb.append(otherRefOpportunity);
		sb.append(", demonstrateFulfilment=");
		sb.append(demonstrateFulfilment);
		sb.append(", otherRefDemonstrate=");
		sb.append(otherRefDemonstrate);
		sb.append(", ensureLabPlan=");
		sb.append(ensureLabPlan);
		sb.append(", otherRefEnsurePlan=");
		sb.append(otherRefEnsurePlan);
		sb.append(", plannedManageReview=");
		sb.append(plannedManageReview);
		sb.append(", otherRefPlanned=");
		sb.append(otherRefPlanned);
		sb.append(", availablePersonnel=");
		sb.append(availablePersonnel);
		sb.append(", manualRefAvailable=");
		sb.append(manualRefAvailable);
		sb.append(", educationProgramme=");
		sb.append(educationProgramme);
		sb.append(", manualRefEducation=");
		sb.append(manualRefEducation);
		sb.append(", ensureAccomodation=");
		sb.append(ensureAccomodation);
		sb.append(", manualRefAccom=");
		sb.append(manualRefAccom);
		sb.append(", processForSelection=");
		sb.append(processForSelection);
		sb.append(", manualRefSelection=");
		sb.append(manualRefSelection);
		sb.append(", verifyReagents=");
		sb.append(verifyReagents);
		sb.append(", manualRefReagents=");
		sb.append(manualRefReagents);
		sb.append(", docProcedure=");
		sb.append(docProcedure);
		sb.append(", manualRefDocProce=");
		sb.append(manualRefDocProce);
		sb.append(", useExamMethods=");
		sb.append(useExamMethods);
		sb.append(", manualRefExam=");
		sb.append(manualRefExam);
		sb.append(", monitoringValidity=");
		sb.append(monitoringValidity);
		sb.append(", manualRefValidity=");
		sb.append(manualRefValidity);
		sb.append(", validateExam=");
		sb.append(validateExam);
		sb.append(", manualRefValidateExam=");
		sb.append(manualRefValidateExam);
		sb.append(", uncertainityReview=");
		sb.append(uncertainityReview);
		sb.append(", manualRefUncertainity=");
		sb.append(manualRefUncertainity);
		sb.append(", preventResRelease=");
		sb.append(preventResRelease);
		sb.append(", manualRefPrevent=");
		sb.append(manualRefPrevent);
		sb.append(", equipmentMaintenance=");
		sb.append(equipmentMaintenance);
		sb.append(", manualRefMaintenance=");
		sb.append(manualRefMaintenance);
		sb.append(", equipCalibration=");
		sb.append(equipCalibration);
		sb.append(", manualRefCalibrat=");
		sb.append(manualRefCalibrat);
		sb.append(", proficencyTesting=");
		sb.append(proficencyTesting);
		sb.append(", manualRefProfiTest=");
		sb.append(manualRefProfiTest);
		sb.append(", postExamReliabilty=");
		sb.append(postExamReliabilty);
		sb.append(", manualRefPostExam=");
		sb.append(manualRefPostExam);
		sb.append(", reportedAccurately=");
		sb.append(reportedAccurately);
		sb.append(", manualRefReported=");
		sb.append(manualRefReported);
		sb.append(", responsiblitySpecified=");
		sb.append(responsiblitySpecified);
		sb.append(", manualRefSpecified=");
		sb.append(manualRefSpecified);
		sb.append(", ensureAuthorities=");
		sb.append(ensureAuthorities);
		sb.append(", manualRefAuthorities=");
		sb.append(manualRefAuthorities);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccMediLabManagementReq toEntityModel() {
		AccMediLabManagementReqImpl accMediLabManagementReqImpl =
			new AccMediLabManagementReqImpl();

		if (uuid == null) {
			accMediLabManagementReqImpl.setUuid("");
		}
		else {
			accMediLabManagementReqImpl.setUuid(uuid);
		}

		accMediLabManagementReqImpl.setAccMediLabManagementReqId(
			accMediLabManagementReqId);
		accMediLabManagementReqImpl.setGroupId(groupId);
		accMediLabManagementReqImpl.setCompanyId(companyId);
		accMediLabManagementReqImpl.setUserId(userId);

		if (userName == null) {
			accMediLabManagementReqImpl.setUserName("");
		}
		else {
			accMediLabManagementReqImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accMediLabManagementReqImpl.setCreateDate(null);
		}
		else {
			accMediLabManagementReqImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accMediLabManagementReqImpl.setModifiedDate(null);
		}
		else {
			accMediLabManagementReqImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (managementEstablished == null) {
			accMediLabManagementReqImpl.setManagementEstablished("");
		}
		else {
			accMediLabManagementReqImpl.setManagementEstablished(
				managementEstablished);
		}

		if (qMRefManagement == null) {
			accMediLabManagementReqImpl.setQMRefManagement("");
		}
		else {
			accMediLabManagementReqImpl.setQMRefManagement(qMRefManagement);
		}

		if (personAware == null) {
			accMediLabManagementReqImpl.setPersonAware("");
		}
		else {
			accMediLabManagementReqImpl.setPersonAware(personAware);
		}

		if (qMRefPerson == null) {
			accMediLabManagementReqImpl.setQMRefPerson("");
		}
		else {
			accMediLabManagementReqImpl.setQMRefPerson(qMRefPerson);
		}

		if (policiesAcknowledged == null) {
			accMediLabManagementReqImpl.setPoliciesAcknowledged("");
		}
		else {
			accMediLabManagementReqImpl.setPoliciesAcknowledged(
				policiesAcknowledged);
		}

		if (qMRefPolicies == null) {
			accMediLabManagementReqImpl.setQMRefPolicies("");
		}
		else {
			accMediLabManagementReqImpl.setQMRefPolicies(qMRefPolicies);
		}

		if (controlledDocument == null) {
			accMediLabManagementReqImpl.setControlledDocument("");
		}
		else {
			accMediLabManagementReqImpl.setControlledDocument(
				controlledDocument);
		}

		if (qMRefControlDoc == null) {
			accMediLabManagementReqImpl.setQMRefControlDoc("");
		}
		else {
			accMediLabManagementReqImpl.setQMRefControlDoc(qMRefControlDoc);
		}

		if (laboratoryEstablished == null) {
			accMediLabManagementReqImpl.setLaboratoryEstablished("");
		}
		else {
			accMediLabManagementReqImpl.setLaboratoryEstablished(
				laboratoryEstablished);
		}

		if (qMReflabEstab == null) {
			accMediLabManagementReqImpl.setQMReflabEstab("");
		}
		else {
			accMediLabManagementReqImpl.setQMReflabEstab(qMReflabEstab);
		}

		if (identifiedRisks == null) {
			accMediLabManagementReqImpl.setIdentifiedRisks("");
		}
		else {
			accMediLabManagementReqImpl.setIdentifiedRisks(identifiedRisks);
		}

		if (qMRefRisks == null) {
			accMediLabManagementReqImpl.setQMRefRisks("");
		}
		else {
			accMediLabManagementReqImpl.setQMRefRisks(qMRefRisks);
		}

		if (havePersonnel == null) {
			accMediLabManagementReqImpl.setHavePersonnel("");
		}
		else {
			accMediLabManagementReqImpl.setHavePersonnel(havePersonnel);
		}

		if (qMRefPersonnel == null) {
			accMediLabManagementReqImpl.setQMRefPersonnel("");
		}
		else {
			accMediLabManagementReqImpl.setQMRefPersonnel(qMRefPersonnel);
		}

		if (authorizePersonnel == null) {
			accMediLabManagementReqImpl.setAuthorizePersonnel("");
		}
		else {
			accMediLabManagementReqImpl.setAuthorizePersonnel(
				authorizePersonnel);
		}

		if (qMRefAuthorize == null) {
			accMediLabManagementReqImpl.setQMRefAuthorize("");
		}
		else {
			accMediLabManagementReqImpl.setQMRefAuthorize(qMRefAuthorize);
		}

		if (labControlDocsFulfilment == null) {
			accMediLabManagementReqImpl.setLabControlDocsFulfilment("");
		}
		else {
			accMediLabManagementReqImpl.setLabControlDocsFulfilment(
				labControlDocsFulfilment);
		}

		if (otherRefFulfil == null) {
			accMediLabManagementReqImpl.setOtherRefFulfil("");
		}
		else {
			accMediLabManagementReqImpl.setOtherRefFulfil(otherRefFulfil);
		}

		if (legibleRecordsFulfil == null) {
			accMediLabManagementReqImpl.setLegibleRecordsFulfil("");
		}
		else {
			accMediLabManagementReqImpl.setLegibleRecordsFulfil(
				legibleRecordsFulfil);
		}

		if (otherRefLegibleRec == null) {
			accMediLabManagementReqImpl.setOtherRefLegibleRec("");
		}
		else {
			accMediLabManagementReqImpl.setOtherRefLegibleRec(
				otherRefLegibleRec);
		}

		if (proceduresInPlace == null) {
			accMediLabManagementReqImpl.setProceduresInPlace("");
		}
		else {
			accMediLabManagementReqImpl.setProceduresInPlace(proceduresInPlace);
		}

		if (otherRefProcedure == null) {
			accMediLabManagementReqImpl.setOtherRefProcedure("");
		}
		else {
			accMediLabManagementReqImpl.setOtherRefProcedure(otherRefProcedure);
		}

		if (communicatedRequirement == null) {
			accMediLabManagementReqImpl.setCommunicatedRequirement("");
		}
		else {
			accMediLabManagementReqImpl.setCommunicatedRequirement(
				communicatedRequirement);
		}

		if (otherRefRequirement == null) {
			accMediLabManagementReqImpl.setOtherRefRequirement("");
		}
		else {
			accMediLabManagementReqImpl.setOtherRefRequirement(
				otherRefRequirement);
		}

		if (procedureForSelection == null) {
			accMediLabManagementReqImpl.setProcedureForSelection("");
		}
		else {
			accMediLabManagementReqImpl.setProcedureForSelection(
				procedureForSelection);
		}

		if (otherRefSelection == null) {
			accMediLabManagementReqImpl.setOtherRefSelection("");
		}
		else {
			accMediLabManagementReqImpl.setOtherRefSelection(otherRefSelection);
		}

		if (arrangementInPlace == null) {
			accMediLabManagementReqImpl.setArrangementInPlace("");
		}
		else {
			accMediLabManagementReqImpl.setArrangementInPlace(
				arrangementInPlace);
		}

		if (otherRefArrange == null) {
			accMediLabManagementReqImpl.setOtherRefArrange("");
		}
		else {
			accMediLabManagementReqImpl.setOtherRefArrange(otherRefArrange);
		}

		if (processInPlace == null) {
			accMediLabManagementReqImpl.setProcessInPlace("");
		}
		else {
			accMediLabManagementReqImpl.setProcessInPlace(processInPlace);
		}

		if (otherRefProcess == null) {
			accMediLabManagementReqImpl.setOtherRefProcess("");
		}
		else {
			accMediLabManagementReqImpl.setOtherRefProcess(otherRefProcess);
		}

		if (labOperateProgramme == null) {
			accMediLabManagementReqImpl.setLabOperateProgramme("");
		}
		else {
			accMediLabManagementReqImpl.setLabOperateProgramme(
				labOperateProgramme);
		}

		if (otherRefLabOperate == null) {
			accMediLabManagementReqImpl.setOtherRefLabOperate("");
		}
		else {
			accMediLabManagementReqImpl.setOtherRefLabOperate(
				otherRefLabOperate);
		}

		if (identifyOpportunities == null) {
			accMediLabManagementReqImpl.setIdentifyOpportunities("");
		}
		else {
			accMediLabManagementReqImpl.setIdentifyOpportunities(
				identifyOpportunities);
		}

		if (otherRefOpportunity == null) {
			accMediLabManagementReqImpl.setOtherRefOpportunity("");
		}
		else {
			accMediLabManagementReqImpl.setOtherRefOpportunity(
				otherRefOpportunity);
		}

		if (demonstrateFulfilment == null) {
			accMediLabManagementReqImpl.setDemonstrateFulfilment("");
		}
		else {
			accMediLabManagementReqImpl.setDemonstrateFulfilment(
				demonstrateFulfilment);
		}

		if (otherRefDemonstrate == null) {
			accMediLabManagementReqImpl.setOtherRefDemonstrate("");
		}
		else {
			accMediLabManagementReqImpl.setOtherRefDemonstrate(
				otherRefDemonstrate);
		}

		if (ensureLabPlan == null) {
			accMediLabManagementReqImpl.setEnsureLabPlan("");
		}
		else {
			accMediLabManagementReqImpl.setEnsureLabPlan(ensureLabPlan);
		}

		if (otherRefEnsurePlan == null) {
			accMediLabManagementReqImpl.setOtherRefEnsurePlan("");
		}
		else {
			accMediLabManagementReqImpl.setOtherRefEnsurePlan(
				otherRefEnsurePlan);
		}

		if (plannedManageReview == null) {
			accMediLabManagementReqImpl.setPlannedManageReview("");
		}
		else {
			accMediLabManagementReqImpl.setPlannedManageReview(
				plannedManageReview);
		}

		if (otherRefPlanned == null) {
			accMediLabManagementReqImpl.setOtherRefPlanned("");
		}
		else {
			accMediLabManagementReqImpl.setOtherRefPlanned(otherRefPlanned);
		}

		if (availablePersonnel == null) {
			accMediLabManagementReqImpl.setAvailablePersonnel("");
		}
		else {
			accMediLabManagementReqImpl.setAvailablePersonnel(
				availablePersonnel);
		}

		if (manualRefAvailable == null) {
			accMediLabManagementReqImpl.setManualRefAvailable("");
		}
		else {
			accMediLabManagementReqImpl.setManualRefAvailable(
				manualRefAvailable);
		}

		if (educationProgramme == null) {
			accMediLabManagementReqImpl.setEducationProgramme("");
		}
		else {
			accMediLabManagementReqImpl.setEducationProgramme(
				educationProgramme);
		}

		if (manualRefEducation == null) {
			accMediLabManagementReqImpl.setManualRefEducation("");
		}
		else {
			accMediLabManagementReqImpl.setManualRefEducation(
				manualRefEducation);
		}

		if (ensureAccomodation == null) {
			accMediLabManagementReqImpl.setEnsureAccomodation("");
		}
		else {
			accMediLabManagementReqImpl.setEnsureAccomodation(
				ensureAccomodation);
		}

		if (manualRefAccom == null) {
			accMediLabManagementReqImpl.setManualRefAccom("");
		}
		else {
			accMediLabManagementReqImpl.setManualRefAccom(manualRefAccom);
		}

		if (processForSelection == null) {
			accMediLabManagementReqImpl.setProcessForSelection("");
		}
		else {
			accMediLabManagementReqImpl.setProcessForSelection(
				processForSelection);
		}

		if (manualRefSelection == null) {
			accMediLabManagementReqImpl.setManualRefSelection("");
		}
		else {
			accMediLabManagementReqImpl.setManualRefSelection(
				manualRefSelection);
		}

		if (verifyReagents == null) {
			accMediLabManagementReqImpl.setVerifyReagents("");
		}
		else {
			accMediLabManagementReqImpl.setVerifyReagents(verifyReagents);
		}

		if (manualRefReagents == null) {
			accMediLabManagementReqImpl.setManualRefReagents("");
		}
		else {
			accMediLabManagementReqImpl.setManualRefReagents(manualRefReagents);
		}

		if (docProcedure == null) {
			accMediLabManagementReqImpl.setDocProcedure("");
		}
		else {
			accMediLabManagementReqImpl.setDocProcedure(docProcedure);
		}

		if (manualRefDocProce == null) {
			accMediLabManagementReqImpl.setManualRefDocProce("");
		}
		else {
			accMediLabManagementReqImpl.setManualRefDocProce(manualRefDocProce);
		}

		if (useExamMethods == null) {
			accMediLabManagementReqImpl.setUseExamMethods("");
		}
		else {
			accMediLabManagementReqImpl.setUseExamMethods(useExamMethods);
		}

		if (manualRefExam == null) {
			accMediLabManagementReqImpl.setManualRefExam("");
		}
		else {
			accMediLabManagementReqImpl.setManualRefExam(manualRefExam);
		}

		if (monitoringValidity == null) {
			accMediLabManagementReqImpl.setMonitoringValidity("");
		}
		else {
			accMediLabManagementReqImpl.setMonitoringValidity(
				monitoringValidity);
		}

		if (manualRefValidity == null) {
			accMediLabManagementReqImpl.setManualRefValidity("");
		}
		else {
			accMediLabManagementReqImpl.setManualRefValidity(manualRefValidity);
		}

		if (validateExam == null) {
			accMediLabManagementReqImpl.setValidateExam("");
		}
		else {
			accMediLabManagementReqImpl.setValidateExam(validateExam);
		}

		if (manualRefValidateExam == null) {
			accMediLabManagementReqImpl.setManualRefValidateExam("");
		}
		else {
			accMediLabManagementReqImpl.setManualRefValidateExam(
				manualRefValidateExam);
		}

		if (uncertainityReview == null) {
			accMediLabManagementReqImpl.setUncertainityReview("");
		}
		else {
			accMediLabManagementReqImpl.setUncertainityReview(
				uncertainityReview);
		}

		if (manualRefUncertainity == null) {
			accMediLabManagementReqImpl.setManualRefUncertainity("");
		}
		else {
			accMediLabManagementReqImpl.setManualRefUncertainity(
				manualRefUncertainity);
		}

		if (preventResRelease == null) {
			accMediLabManagementReqImpl.setPreventResRelease("");
		}
		else {
			accMediLabManagementReqImpl.setPreventResRelease(preventResRelease);
		}

		if (manualRefPrevent == null) {
			accMediLabManagementReqImpl.setManualRefPrevent("");
		}
		else {
			accMediLabManagementReqImpl.setManualRefPrevent(manualRefPrevent);
		}

		if (equipmentMaintenance == null) {
			accMediLabManagementReqImpl.setEquipmentMaintenance("");
		}
		else {
			accMediLabManagementReqImpl.setEquipmentMaintenance(
				equipmentMaintenance);
		}

		if (manualRefMaintenance == null) {
			accMediLabManagementReqImpl.setManualRefMaintenance("");
		}
		else {
			accMediLabManagementReqImpl.setManualRefMaintenance(
				manualRefMaintenance);
		}

		if (equipCalibration == null) {
			accMediLabManagementReqImpl.setEquipCalibration("");
		}
		else {
			accMediLabManagementReqImpl.setEquipCalibration(equipCalibration);
		}

		if (manualRefCalibrat == null) {
			accMediLabManagementReqImpl.setManualRefCalibrat("");
		}
		else {
			accMediLabManagementReqImpl.setManualRefCalibrat(manualRefCalibrat);
		}

		if (proficencyTesting == null) {
			accMediLabManagementReqImpl.setProficencyTesting("");
		}
		else {
			accMediLabManagementReqImpl.setProficencyTesting(proficencyTesting);
		}

		if (manualRefProfiTest == null) {
			accMediLabManagementReqImpl.setManualRefProfiTest("");
		}
		else {
			accMediLabManagementReqImpl.setManualRefProfiTest(
				manualRefProfiTest);
		}

		if (postExamReliabilty == null) {
			accMediLabManagementReqImpl.setPostExamReliabilty("");
		}
		else {
			accMediLabManagementReqImpl.setPostExamReliabilty(
				postExamReliabilty);
		}

		if (manualRefPostExam == null) {
			accMediLabManagementReqImpl.setManualRefPostExam("");
		}
		else {
			accMediLabManagementReqImpl.setManualRefPostExam(manualRefPostExam);
		}

		if (reportedAccurately == null) {
			accMediLabManagementReqImpl.setReportedAccurately("");
		}
		else {
			accMediLabManagementReqImpl.setReportedAccurately(
				reportedAccurately);
		}

		if (manualRefReported == null) {
			accMediLabManagementReqImpl.setManualRefReported("");
		}
		else {
			accMediLabManagementReqImpl.setManualRefReported(manualRefReported);
		}

		if (responsiblitySpecified == null) {
			accMediLabManagementReqImpl.setResponsiblitySpecified("");
		}
		else {
			accMediLabManagementReqImpl.setResponsiblitySpecified(
				responsiblitySpecified);
		}

		if (manualRefSpecified == null) {
			accMediLabManagementReqImpl.setManualRefSpecified("");
		}
		else {
			accMediLabManagementReqImpl.setManualRefSpecified(
				manualRefSpecified);
		}

		if (ensureAuthorities == null) {
			accMediLabManagementReqImpl.setEnsureAuthorities("");
		}
		else {
			accMediLabManagementReqImpl.setEnsureAuthorities(ensureAuthorities);
		}

		if (manualRefAuthorities == null) {
			accMediLabManagementReqImpl.setManualRefAuthorities("");
		}
		else {
			accMediLabManagementReqImpl.setManualRefAuthorities(
				manualRefAuthorities);
		}

		accMediLabManagementReqImpl.setJanaacApplicationId(janaacApplicationId);

		accMediLabManagementReqImpl.resetOriginalValues();

		return accMediLabManagementReqImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accMediLabManagementReqId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		managementEstablished = objectInput.readUTF();
		qMRefManagement = objectInput.readUTF();
		personAware = objectInput.readUTF();
		qMRefPerson = objectInput.readUTF();
		policiesAcknowledged = objectInput.readUTF();
		qMRefPolicies = objectInput.readUTF();
		controlledDocument = objectInput.readUTF();
		qMRefControlDoc = objectInput.readUTF();
		laboratoryEstablished = objectInput.readUTF();
		qMReflabEstab = objectInput.readUTF();
		identifiedRisks = objectInput.readUTF();
		qMRefRisks = objectInput.readUTF();
		havePersonnel = objectInput.readUTF();
		qMRefPersonnel = objectInput.readUTF();
		authorizePersonnel = objectInput.readUTF();
		qMRefAuthorize = objectInput.readUTF();
		labControlDocsFulfilment = objectInput.readUTF();
		otherRefFulfil = objectInput.readUTF();
		legibleRecordsFulfil = objectInput.readUTF();
		otherRefLegibleRec = objectInput.readUTF();
		proceduresInPlace = objectInput.readUTF();
		otherRefProcedure = objectInput.readUTF();
		communicatedRequirement = objectInput.readUTF();
		otherRefRequirement = objectInput.readUTF();
		procedureForSelection = objectInput.readUTF();
		otherRefSelection = objectInput.readUTF();
		arrangementInPlace = objectInput.readUTF();
		otherRefArrange = objectInput.readUTF();
		processInPlace = objectInput.readUTF();
		otherRefProcess = objectInput.readUTF();
		labOperateProgramme = objectInput.readUTF();
		otherRefLabOperate = objectInput.readUTF();
		identifyOpportunities = objectInput.readUTF();
		otherRefOpportunity = objectInput.readUTF();
		demonstrateFulfilment = objectInput.readUTF();
		otherRefDemonstrate = objectInput.readUTF();
		ensureLabPlan = objectInput.readUTF();
		otherRefEnsurePlan = objectInput.readUTF();
		plannedManageReview = objectInput.readUTF();
		otherRefPlanned = objectInput.readUTF();
		availablePersonnel = objectInput.readUTF();
		manualRefAvailable = objectInput.readUTF();
		educationProgramme = objectInput.readUTF();
		manualRefEducation = objectInput.readUTF();
		ensureAccomodation = objectInput.readUTF();
		manualRefAccom = objectInput.readUTF();
		processForSelection = objectInput.readUTF();
		manualRefSelection = objectInput.readUTF();
		verifyReagents = objectInput.readUTF();
		manualRefReagents = objectInput.readUTF();
		docProcedure = objectInput.readUTF();
		manualRefDocProce = objectInput.readUTF();
		useExamMethods = objectInput.readUTF();
		manualRefExam = objectInput.readUTF();
		monitoringValidity = objectInput.readUTF();
		manualRefValidity = objectInput.readUTF();
		validateExam = objectInput.readUTF();
		manualRefValidateExam = objectInput.readUTF();
		uncertainityReview = objectInput.readUTF();
		manualRefUncertainity = objectInput.readUTF();
		preventResRelease = objectInput.readUTF();
		manualRefPrevent = objectInput.readUTF();
		equipmentMaintenance = objectInput.readUTF();
		manualRefMaintenance = objectInput.readUTF();
		equipCalibration = objectInput.readUTF();
		manualRefCalibrat = objectInput.readUTF();
		proficencyTesting = objectInput.readUTF();
		manualRefProfiTest = objectInput.readUTF();
		postExamReliabilty = objectInput.readUTF();
		manualRefPostExam = objectInput.readUTF();
		reportedAccurately = objectInput.readUTF();
		manualRefReported = objectInput.readUTF();
		responsiblitySpecified = objectInput.readUTF();
		manualRefSpecified = objectInput.readUTF();
		ensureAuthorities = objectInput.readUTF();
		manualRefAuthorities = objectInput.readUTF();

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

		objectOutput.writeLong(accMediLabManagementReqId);

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

		if (managementEstablished == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(managementEstablished);
		}

		if (qMRefManagement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefManagement);
		}

		if (personAware == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personAware);
		}

		if (qMRefPerson == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefPerson);
		}

		if (policiesAcknowledged == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(policiesAcknowledged);
		}

		if (qMRefPolicies == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefPolicies);
		}

		if (controlledDocument == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(controlledDocument);
		}

		if (qMRefControlDoc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefControlDoc);
		}

		if (laboratoryEstablished == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(laboratoryEstablished);
		}

		if (qMReflabEstab == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMReflabEstab);
		}

		if (identifiedRisks == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(identifiedRisks);
		}

		if (qMRefRisks == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefRisks);
		}

		if (havePersonnel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(havePersonnel);
		}

		if (qMRefPersonnel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefPersonnel);
		}

		if (authorizePersonnel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(authorizePersonnel);
		}

		if (qMRefAuthorize == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qMRefAuthorize);
		}

		if (labControlDocsFulfilment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labControlDocsFulfilment);
		}

		if (otherRefFulfil == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherRefFulfil);
		}

		if (legibleRecordsFulfil == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(legibleRecordsFulfil);
		}

		if (otherRefLegibleRec == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherRefLegibleRec);
		}

		if (proceduresInPlace == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(proceduresInPlace);
		}

		if (otherRefProcedure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherRefProcedure);
		}

		if (communicatedRequirement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(communicatedRequirement);
		}

		if (otherRefRequirement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherRefRequirement);
		}

		if (procedureForSelection == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(procedureForSelection);
		}

		if (otherRefSelection == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherRefSelection);
		}

		if (arrangementInPlace == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(arrangementInPlace);
		}

		if (otherRefArrange == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherRefArrange);
		}

		if (processInPlace == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(processInPlace);
		}

		if (otherRefProcess == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherRefProcess);
		}

		if (labOperateProgramme == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labOperateProgramme);
		}

		if (otherRefLabOperate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherRefLabOperate);
		}

		if (identifyOpportunities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(identifyOpportunities);
		}

		if (otherRefOpportunity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherRefOpportunity);
		}

		if (demonstrateFulfilment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(demonstrateFulfilment);
		}

		if (otherRefDemonstrate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherRefDemonstrate);
		}

		if (ensureLabPlan == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ensureLabPlan);
		}

		if (otherRefEnsurePlan == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherRefEnsurePlan);
		}

		if (plannedManageReview == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(plannedManageReview);
		}

		if (otherRefPlanned == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherRefPlanned);
		}

		if (availablePersonnel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(availablePersonnel);
		}

		if (manualRefAvailable == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manualRefAvailable);
		}

		if (educationProgramme == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(educationProgramme);
		}

		if (manualRefEducation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manualRefEducation);
		}

		if (ensureAccomodation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ensureAccomodation);
		}

		if (manualRefAccom == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manualRefAccom);
		}

		if (processForSelection == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(processForSelection);
		}

		if (manualRefSelection == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manualRefSelection);
		}

		if (verifyReagents == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(verifyReagents);
		}

		if (manualRefReagents == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manualRefReagents);
		}

		if (docProcedure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(docProcedure);
		}

		if (manualRefDocProce == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manualRefDocProce);
		}

		if (useExamMethods == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(useExamMethods);
		}

		if (manualRefExam == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manualRefExam);
		}

		if (monitoringValidity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(monitoringValidity);
		}

		if (manualRefValidity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manualRefValidity);
		}

		if (validateExam == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(validateExam);
		}

		if (manualRefValidateExam == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manualRefValidateExam);
		}

		if (uncertainityReview == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uncertainityReview);
		}

		if (manualRefUncertainity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manualRefUncertainity);
		}

		if (preventResRelease == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(preventResRelease);
		}

		if (manualRefPrevent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manualRefPrevent);
		}

		if (equipmentMaintenance == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentMaintenance);
		}

		if (manualRefMaintenance == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manualRefMaintenance);
		}

		if (equipCalibration == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipCalibration);
		}

		if (manualRefCalibrat == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manualRefCalibrat);
		}

		if (proficencyTesting == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(proficencyTesting);
		}

		if (manualRefProfiTest == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manualRefProfiTest);
		}

		if (postExamReliabilty == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(postExamReliabilty);
		}

		if (manualRefPostExam == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manualRefPostExam);
		}

		if (reportedAccurately == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reportedAccurately);
		}

		if (manualRefReported == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manualRefReported);
		}

		if (responsiblitySpecified == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(responsiblitySpecified);
		}

		if (manualRefSpecified == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manualRefSpecified);
		}

		if (ensureAuthorities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ensureAuthorities);
		}

		if (manualRefAuthorities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manualRefAuthorities);
		}

		objectOutput.writeLong(janaacApplicationId);
	}

	public String uuid;
	public long accMediLabManagementReqId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String managementEstablished;
	public String qMRefManagement;
	public String personAware;
	public String qMRefPerson;
	public String policiesAcknowledged;
	public String qMRefPolicies;
	public String controlledDocument;
	public String qMRefControlDoc;
	public String laboratoryEstablished;
	public String qMReflabEstab;
	public String identifiedRisks;
	public String qMRefRisks;
	public String havePersonnel;
	public String qMRefPersonnel;
	public String authorizePersonnel;
	public String qMRefAuthorize;
	public String labControlDocsFulfilment;
	public String otherRefFulfil;
	public String legibleRecordsFulfil;
	public String otherRefLegibleRec;
	public String proceduresInPlace;
	public String otherRefProcedure;
	public String communicatedRequirement;
	public String otherRefRequirement;
	public String procedureForSelection;
	public String otherRefSelection;
	public String arrangementInPlace;
	public String otherRefArrange;
	public String processInPlace;
	public String otherRefProcess;
	public String labOperateProgramme;
	public String otherRefLabOperate;
	public String identifyOpportunities;
	public String otherRefOpportunity;
	public String demonstrateFulfilment;
	public String otherRefDemonstrate;
	public String ensureLabPlan;
	public String otherRefEnsurePlan;
	public String plannedManageReview;
	public String otherRefPlanned;
	public String availablePersonnel;
	public String manualRefAvailable;
	public String educationProgramme;
	public String manualRefEducation;
	public String ensureAccomodation;
	public String manualRefAccom;
	public String processForSelection;
	public String manualRefSelection;
	public String verifyReagents;
	public String manualRefReagents;
	public String docProcedure;
	public String manualRefDocProce;
	public String useExamMethods;
	public String manualRefExam;
	public String monitoringValidity;
	public String manualRefValidity;
	public String validateExam;
	public String manualRefValidateExam;
	public String uncertainityReview;
	public String manualRefUncertainity;
	public String preventResRelease;
	public String manualRefPrevent;
	public String equipmentMaintenance;
	public String manualRefMaintenance;
	public String equipCalibration;
	public String manualRefCalibrat;
	public String proficencyTesting;
	public String manualRefProfiTest;
	public String postExamReliabilty;
	public String manualRefPostExam;
	public String reportedAccurately;
	public String manualRefReported;
	public String responsiblitySpecified;
	public String manualRefSpecified;
	public String ensureAuthorities;
	public String manualRefAuthorities;
	public long janaacApplicationId;

}