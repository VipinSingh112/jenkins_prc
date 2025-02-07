/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccMediLabTestManageReq;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccMediLabTestManageReq in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccMediLabTestManageReqCacheModel
	implements CacheModel<AccMediLabTestManageReq>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccMediLabTestManageReqCacheModel)) {
			return false;
		}

		AccMediLabTestManageReqCacheModel accMediLabTestManageReqCacheModel =
			(AccMediLabTestManageReqCacheModel)object;

		if (accMediLabTestManageReqId ==
				accMediLabTestManageReqCacheModel.accMediLabTestManageReqId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accMediLabTestManageReqId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(147);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accMediLabTestManageReqId=");
		sb.append(accMediLabTestManageReqId);
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
		sb.append(", policiesForFulfil=");
		sb.append(policiesForFulfil);
		sb.append(", labDocRefPolicies=");
		sb.append(labDocRefPolicies);
		sb.append(", impartialityProvision=");
		sb.append(impartialityProvision);
		sb.append(", labDocRefImpartProv=");
		sb.append(labDocRefImpartProv);
		sb.append(", confidientialityProv=");
		sb.append(confidientialityProv);
		sb.append(", labDocRefConfid=");
		sb.append(labDocRefConfid);
		sb.append(", commitmentEvidence=");
		sb.append(commitmentEvidence);
		sb.append(", labDocRefCommitment=");
		sb.append(labDocRefCommitment);
		sb.append(", referenceEvidence=");
		sb.append(referenceEvidence);
		sb.append(", labDocRefReference=");
		sb.append(labDocRefReference);
		sb.append(", docDescribingRole=");
		sb.append(docDescribingRole);
		sb.append(", labDocRefDocDes=");
		sb.append(labDocRefDocDes);
		sb.append(", rolesofPersonnel=");
		sb.append(rolesofPersonnel);
		sb.append(", labDocRefRoles=");
		sb.append(labDocRefRoles);
		sb.append(", competenceReq=");
		sb.append(competenceReq);
		sb.append(", labDocRefCompetence=");
		sb.append(labDocRefCompetence);
		sb.append(", selectionOfPerson=");
		sb.append(selectionOfPerson);
		sb.append(", labDocRefSelection=");
		sb.append(labDocRefSelection);
		sb.append(", handlingEquip=");
		sb.append(handlingEquip);
		sb.append(", labDocRefHandling=");
		sb.append(labDocRefHandling);
		sb.append(", calibrationProgram=");
		sb.append(calibrationProgram);
		sb.append(", labDocRefCalibrat=");
		sb.append(labDocRefCalibrat);
		sb.append(", approvingReq=");
		sb.append(approvingReq);
		sb.append(", labDocRefApproving=");
		sb.append(labDocRefApproving);
		sb.append(", monitorPerformance=");
		sb.append(monitorPerformance);
		sb.append(", labDocRefMonitor=");
		sb.append(labDocRefMonitor);
		sb.append(", ensuringService=");
		sb.append(ensuringService);
		sb.append(", labDocRefEnsuring=");
		sb.append(labDocRefEnsuring);
		sb.append(", reviewOfRequest=");
		sb.append(reviewOfRequest);
		sb.append(", labDocRefRequest=");
		sb.append(labDocRefRequest);
		sb.append(", procedureForLab=");
		sb.append(procedureForLab);
		sb.append(", labDocRefProcedure=");
		sb.append(labDocRefProcedure);
		sb.append(", testMethodValidat=");
		sb.append(testMethodValidat);
		sb.append(", labDocRefTestMethod=");
		sb.append(labDocRefTestMethod);
		sb.append(", samplingPlan=");
		sb.append(samplingPlan);
		sb.append(", labDocRefSampling=");
		sb.append(labDocRefSampling);
		sb.append(", transportationReciept=");
		sb.append(transportationReciept);
		sb.append(", labDocRefTransport=");
		sb.append(labDocRefTransport);
		sb.append(", uncertainityMeasure=");
		sb.append(uncertainityMeasure);
		sb.append(", labDocRefUncertain=");
		sb.append(labDocRefUncertain);
		sb.append(", testResultValidity=");
		sb.append(testResultValidity);
		sb.append(", labDocReftestResult=");
		sb.append(labDocReftestResult);
		sb.append(", complaints=");
		sb.append(complaints);
		sb.append(", labDocRefComplaints=");
		sb.append(labDocRefComplaints);
		sb.append(", nonConformingWork=");
		sb.append(nonConformingWork);
		sb.append(", labDocRefNonConfirm=");
		sb.append(labDocRefNonConfirm);
		sb.append(", uniqueIdentification=");
		sb.append(uniqueIdentification);
		sb.append(", labDocRefUnique=");
		sb.append(labDocRefUnique);
		sb.append(", currentRevisionStatus=");
		sb.append(currentRevisionStatus);
		sb.append(", labDocRefCurrentRev=");
		sb.append(labDocRefCurrentRev);
		sb.append(", docChangeIdentify=");
		sb.append(docChangeIdentify);
		sb.append(", labDocRefDocChange=");
		sb.append(labDocRefDocChange);
		sb.append(", recordControl=");
		sb.append(recordControl);
		sb.append(", labDocRefRecordControl=");
		sb.append(labDocRefRecordControl);
		sb.append(", plannedAction=");
		sb.append(plannedAction);
		sb.append(", labDocRefPlanned=");
		sb.append(labDocRefPlanned);
		sb.append(", imporvementOpportunity=");
		sb.append(imporvementOpportunity);
		sb.append(", labDocRefImprovement=");
		sb.append(labDocRefImprovement);
		sb.append(", correctiveAction=");
		sb.append(correctiveAction);
		sb.append(", labDocRefCorrective=");
		sb.append(labDocRefCorrective);
		sb.append(", internalAudits=");
		sb.append(internalAudits);
		sb.append(", labDocRefInternal=");
		sb.append(labDocRefInternal);
		sb.append(", managementReview=");
		sb.append(managementReview);
		sb.append(", labDocRefManagement=");
		sb.append(labDocRefManagement);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccMediLabTestManageReq toEntityModel() {
		AccMediLabTestManageReqImpl accMediLabTestManageReqImpl =
			new AccMediLabTestManageReqImpl();

		if (uuid == null) {
			accMediLabTestManageReqImpl.setUuid("");
		}
		else {
			accMediLabTestManageReqImpl.setUuid(uuid);
		}

		accMediLabTestManageReqImpl.setAccMediLabTestManageReqId(
			accMediLabTestManageReqId);
		accMediLabTestManageReqImpl.setGroupId(groupId);
		accMediLabTestManageReqImpl.setCompanyId(companyId);
		accMediLabTestManageReqImpl.setUserId(userId);

		if (userName == null) {
			accMediLabTestManageReqImpl.setUserName("");
		}
		else {
			accMediLabTestManageReqImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accMediLabTestManageReqImpl.setCreateDate(null);
		}
		else {
			accMediLabTestManageReqImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accMediLabTestManageReqImpl.setModifiedDate(null);
		}
		else {
			accMediLabTestManageReqImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (policiesForFulfil == null) {
			accMediLabTestManageReqImpl.setPoliciesForFulfil("");
		}
		else {
			accMediLabTestManageReqImpl.setPoliciesForFulfil(policiesForFulfil);
		}

		if (labDocRefPolicies == null) {
			accMediLabTestManageReqImpl.setLabDocRefPolicies("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefPolicies(labDocRefPolicies);
		}

		if (impartialityProvision == null) {
			accMediLabTestManageReqImpl.setImpartialityProvision("");
		}
		else {
			accMediLabTestManageReqImpl.setImpartialityProvision(
				impartialityProvision);
		}

		if (labDocRefImpartProv == null) {
			accMediLabTestManageReqImpl.setLabDocRefImpartProv("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefImpartProv(
				labDocRefImpartProv);
		}

		if (confidientialityProv == null) {
			accMediLabTestManageReqImpl.setConfidientialityProv("");
		}
		else {
			accMediLabTestManageReqImpl.setConfidientialityProv(
				confidientialityProv);
		}

		if (labDocRefConfid == null) {
			accMediLabTestManageReqImpl.setLabDocRefConfid("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefConfid(labDocRefConfid);
		}

		if (commitmentEvidence == null) {
			accMediLabTestManageReqImpl.setCommitmentEvidence("");
		}
		else {
			accMediLabTestManageReqImpl.setCommitmentEvidence(
				commitmentEvidence);
		}

		if (labDocRefCommitment == null) {
			accMediLabTestManageReqImpl.setLabDocRefCommitment("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefCommitment(
				labDocRefCommitment);
		}

		if (referenceEvidence == null) {
			accMediLabTestManageReqImpl.setReferenceEvidence("");
		}
		else {
			accMediLabTestManageReqImpl.setReferenceEvidence(referenceEvidence);
		}

		if (labDocRefReference == null) {
			accMediLabTestManageReqImpl.setLabDocRefReference("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefReference(
				labDocRefReference);
		}

		if (docDescribingRole == null) {
			accMediLabTestManageReqImpl.setDocDescribingRole("");
		}
		else {
			accMediLabTestManageReqImpl.setDocDescribingRole(docDescribingRole);
		}

		if (labDocRefDocDes == null) {
			accMediLabTestManageReqImpl.setLabDocRefDocDes("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefDocDes(labDocRefDocDes);
		}

		if (rolesofPersonnel == null) {
			accMediLabTestManageReqImpl.setRolesofPersonnel("");
		}
		else {
			accMediLabTestManageReqImpl.setRolesofPersonnel(rolesofPersonnel);
		}

		if (labDocRefRoles == null) {
			accMediLabTestManageReqImpl.setLabDocRefRoles("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefRoles(labDocRefRoles);
		}

		if (competenceReq == null) {
			accMediLabTestManageReqImpl.setCompetenceReq("");
		}
		else {
			accMediLabTestManageReqImpl.setCompetenceReq(competenceReq);
		}

		if (labDocRefCompetence == null) {
			accMediLabTestManageReqImpl.setLabDocRefCompetence("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefCompetence(
				labDocRefCompetence);
		}

		if (selectionOfPerson == null) {
			accMediLabTestManageReqImpl.setSelectionOfPerson("");
		}
		else {
			accMediLabTestManageReqImpl.setSelectionOfPerson(selectionOfPerson);
		}

		if (labDocRefSelection == null) {
			accMediLabTestManageReqImpl.setLabDocRefSelection("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefSelection(
				labDocRefSelection);
		}

		if (handlingEquip == null) {
			accMediLabTestManageReqImpl.setHandlingEquip("");
		}
		else {
			accMediLabTestManageReqImpl.setHandlingEquip(handlingEquip);
		}

		if (labDocRefHandling == null) {
			accMediLabTestManageReqImpl.setLabDocRefHandling("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefHandling(labDocRefHandling);
		}

		if (calibrationProgram == null) {
			accMediLabTestManageReqImpl.setCalibrationProgram("");
		}
		else {
			accMediLabTestManageReqImpl.setCalibrationProgram(
				calibrationProgram);
		}

		if (labDocRefCalibrat == null) {
			accMediLabTestManageReqImpl.setLabDocRefCalibrat("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefCalibrat(labDocRefCalibrat);
		}

		if (approvingReq == null) {
			accMediLabTestManageReqImpl.setApprovingReq("");
		}
		else {
			accMediLabTestManageReqImpl.setApprovingReq(approvingReq);
		}

		if (labDocRefApproving == null) {
			accMediLabTestManageReqImpl.setLabDocRefApproving("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefApproving(
				labDocRefApproving);
		}

		if (monitorPerformance == null) {
			accMediLabTestManageReqImpl.setMonitorPerformance("");
		}
		else {
			accMediLabTestManageReqImpl.setMonitorPerformance(
				monitorPerformance);
		}

		if (labDocRefMonitor == null) {
			accMediLabTestManageReqImpl.setLabDocRefMonitor("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefMonitor(labDocRefMonitor);
		}

		if (ensuringService == null) {
			accMediLabTestManageReqImpl.setEnsuringService("");
		}
		else {
			accMediLabTestManageReqImpl.setEnsuringService(ensuringService);
		}

		if (labDocRefEnsuring == null) {
			accMediLabTestManageReqImpl.setLabDocRefEnsuring("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefEnsuring(labDocRefEnsuring);
		}

		if (reviewOfRequest == null) {
			accMediLabTestManageReqImpl.setReviewOfRequest("");
		}
		else {
			accMediLabTestManageReqImpl.setReviewOfRequest(reviewOfRequest);
		}

		if (labDocRefRequest == null) {
			accMediLabTestManageReqImpl.setLabDocRefRequest("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefRequest(labDocRefRequest);
		}

		if (procedureForLab == null) {
			accMediLabTestManageReqImpl.setProcedureForLab("");
		}
		else {
			accMediLabTestManageReqImpl.setProcedureForLab(procedureForLab);
		}

		if (labDocRefProcedure == null) {
			accMediLabTestManageReqImpl.setLabDocRefProcedure("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefProcedure(
				labDocRefProcedure);
		}

		if (testMethodValidat == null) {
			accMediLabTestManageReqImpl.setTestMethodValidat("");
		}
		else {
			accMediLabTestManageReqImpl.setTestMethodValidat(testMethodValidat);
		}

		if (labDocRefTestMethod == null) {
			accMediLabTestManageReqImpl.setLabDocRefTestMethod("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefTestMethod(
				labDocRefTestMethod);
		}

		if (samplingPlan == null) {
			accMediLabTestManageReqImpl.setSamplingPlan("");
		}
		else {
			accMediLabTestManageReqImpl.setSamplingPlan(samplingPlan);
		}

		if (labDocRefSampling == null) {
			accMediLabTestManageReqImpl.setLabDocRefSampling("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefSampling(labDocRefSampling);
		}

		if (transportationReciept == null) {
			accMediLabTestManageReqImpl.setTransportationReciept("");
		}
		else {
			accMediLabTestManageReqImpl.setTransportationReciept(
				transportationReciept);
		}

		if (labDocRefTransport == null) {
			accMediLabTestManageReqImpl.setLabDocRefTransport("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefTransport(
				labDocRefTransport);
		}

		if (uncertainityMeasure == null) {
			accMediLabTestManageReqImpl.setUncertainityMeasure("");
		}
		else {
			accMediLabTestManageReqImpl.setUncertainityMeasure(
				uncertainityMeasure);
		}

		if (labDocRefUncertain == null) {
			accMediLabTestManageReqImpl.setLabDocRefUncertain("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefUncertain(
				labDocRefUncertain);
		}

		if (testResultValidity == null) {
			accMediLabTestManageReqImpl.setTestResultValidity("");
		}
		else {
			accMediLabTestManageReqImpl.setTestResultValidity(
				testResultValidity);
		}

		if (labDocReftestResult == null) {
			accMediLabTestManageReqImpl.setLabDocReftestResult("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocReftestResult(
				labDocReftestResult);
		}

		if (complaints == null) {
			accMediLabTestManageReqImpl.setComplaints("");
		}
		else {
			accMediLabTestManageReqImpl.setComplaints(complaints);
		}

		if (labDocRefComplaints == null) {
			accMediLabTestManageReqImpl.setLabDocRefComplaints("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefComplaints(
				labDocRefComplaints);
		}

		if (nonConformingWork == null) {
			accMediLabTestManageReqImpl.setNonConformingWork("");
		}
		else {
			accMediLabTestManageReqImpl.setNonConformingWork(nonConformingWork);
		}

		if (labDocRefNonConfirm == null) {
			accMediLabTestManageReqImpl.setLabDocRefNonConfirm("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefNonConfirm(
				labDocRefNonConfirm);
		}

		if (uniqueIdentification == null) {
			accMediLabTestManageReqImpl.setUniqueIdentification("");
		}
		else {
			accMediLabTestManageReqImpl.setUniqueIdentification(
				uniqueIdentification);
		}

		if (labDocRefUnique == null) {
			accMediLabTestManageReqImpl.setLabDocRefUnique("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefUnique(labDocRefUnique);
		}

		if (currentRevisionStatus == null) {
			accMediLabTestManageReqImpl.setCurrentRevisionStatus("");
		}
		else {
			accMediLabTestManageReqImpl.setCurrentRevisionStatus(
				currentRevisionStatus);
		}

		if (labDocRefCurrentRev == null) {
			accMediLabTestManageReqImpl.setLabDocRefCurrentRev("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefCurrentRev(
				labDocRefCurrentRev);
		}

		if (docChangeIdentify == null) {
			accMediLabTestManageReqImpl.setDocChangeIdentify("");
		}
		else {
			accMediLabTestManageReqImpl.setDocChangeIdentify(docChangeIdentify);
		}

		if (labDocRefDocChange == null) {
			accMediLabTestManageReqImpl.setLabDocRefDocChange("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefDocChange(
				labDocRefDocChange);
		}

		if (recordControl == null) {
			accMediLabTestManageReqImpl.setRecordControl("");
		}
		else {
			accMediLabTestManageReqImpl.setRecordControl(recordControl);
		}

		if (labDocRefRecordControl == null) {
			accMediLabTestManageReqImpl.setLabDocRefRecordControl("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefRecordControl(
				labDocRefRecordControl);
		}

		if (plannedAction == null) {
			accMediLabTestManageReqImpl.setPlannedAction("");
		}
		else {
			accMediLabTestManageReqImpl.setPlannedAction(plannedAction);
		}

		if (labDocRefPlanned == null) {
			accMediLabTestManageReqImpl.setLabDocRefPlanned("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefPlanned(labDocRefPlanned);
		}

		if (imporvementOpportunity == null) {
			accMediLabTestManageReqImpl.setImporvementOpportunity("");
		}
		else {
			accMediLabTestManageReqImpl.setImporvementOpportunity(
				imporvementOpportunity);
		}

		if (labDocRefImprovement == null) {
			accMediLabTestManageReqImpl.setLabDocRefImprovement("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefImprovement(
				labDocRefImprovement);
		}

		if (correctiveAction == null) {
			accMediLabTestManageReqImpl.setCorrectiveAction("");
		}
		else {
			accMediLabTestManageReqImpl.setCorrectiveAction(correctiveAction);
		}

		if (labDocRefCorrective == null) {
			accMediLabTestManageReqImpl.setLabDocRefCorrective("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefCorrective(
				labDocRefCorrective);
		}

		if (internalAudits == null) {
			accMediLabTestManageReqImpl.setInternalAudits("");
		}
		else {
			accMediLabTestManageReqImpl.setInternalAudits(internalAudits);
		}

		if (labDocRefInternal == null) {
			accMediLabTestManageReqImpl.setLabDocRefInternal("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefInternal(labDocRefInternal);
		}

		if (managementReview == null) {
			accMediLabTestManageReqImpl.setManagementReview("");
		}
		else {
			accMediLabTestManageReqImpl.setManagementReview(managementReview);
		}

		if (labDocRefManagement == null) {
			accMediLabTestManageReqImpl.setLabDocRefManagement("");
		}
		else {
			accMediLabTestManageReqImpl.setLabDocRefManagement(
				labDocRefManagement);
		}

		accMediLabTestManageReqImpl.setJanaacApplicationId(janaacApplicationId);

		accMediLabTestManageReqImpl.resetOriginalValues();

		return accMediLabTestManageReqImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accMediLabTestManageReqId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		policiesForFulfil = objectInput.readUTF();
		labDocRefPolicies = objectInput.readUTF();
		impartialityProvision = objectInput.readUTF();
		labDocRefImpartProv = objectInput.readUTF();
		confidientialityProv = objectInput.readUTF();
		labDocRefConfid = objectInput.readUTF();
		commitmentEvidence = objectInput.readUTF();
		labDocRefCommitment = objectInput.readUTF();
		referenceEvidence = objectInput.readUTF();
		labDocRefReference = objectInput.readUTF();
		docDescribingRole = objectInput.readUTF();
		labDocRefDocDes = objectInput.readUTF();
		rolesofPersonnel = objectInput.readUTF();
		labDocRefRoles = objectInput.readUTF();
		competenceReq = objectInput.readUTF();
		labDocRefCompetence = objectInput.readUTF();
		selectionOfPerson = objectInput.readUTF();
		labDocRefSelection = objectInput.readUTF();
		handlingEquip = objectInput.readUTF();
		labDocRefHandling = objectInput.readUTF();
		calibrationProgram = objectInput.readUTF();
		labDocRefCalibrat = objectInput.readUTF();
		approvingReq = objectInput.readUTF();
		labDocRefApproving = objectInput.readUTF();
		monitorPerformance = objectInput.readUTF();
		labDocRefMonitor = objectInput.readUTF();
		ensuringService = objectInput.readUTF();
		labDocRefEnsuring = objectInput.readUTF();
		reviewOfRequest = objectInput.readUTF();
		labDocRefRequest = objectInput.readUTF();
		procedureForLab = objectInput.readUTF();
		labDocRefProcedure = objectInput.readUTF();
		testMethodValidat = objectInput.readUTF();
		labDocRefTestMethod = objectInput.readUTF();
		samplingPlan = objectInput.readUTF();
		labDocRefSampling = objectInput.readUTF();
		transportationReciept = objectInput.readUTF();
		labDocRefTransport = objectInput.readUTF();
		uncertainityMeasure = objectInput.readUTF();
		labDocRefUncertain = objectInput.readUTF();
		testResultValidity = objectInput.readUTF();
		labDocReftestResult = objectInput.readUTF();
		complaints = objectInput.readUTF();
		labDocRefComplaints = objectInput.readUTF();
		nonConformingWork = objectInput.readUTF();
		labDocRefNonConfirm = objectInput.readUTF();
		uniqueIdentification = objectInput.readUTF();
		labDocRefUnique = objectInput.readUTF();
		currentRevisionStatus = objectInput.readUTF();
		labDocRefCurrentRev = objectInput.readUTF();
		docChangeIdentify = objectInput.readUTF();
		labDocRefDocChange = objectInput.readUTF();
		recordControl = objectInput.readUTF();
		labDocRefRecordControl = objectInput.readUTF();
		plannedAction = objectInput.readUTF();
		labDocRefPlanned = objectInput.readUTF();
		imporvementOpportunity = objectInput.readUTF();
		labDocRefImprovement = objectInput.readUTF();
		correctiveAction = objectInput.readUTF();
		labDocRefCorrective = objectInput.readUTF();
		internalAudits = objectInput.readUTF();
		labDocRefInternal = objectInput.readUTF();
		managementReview = objectInput.readUTF();
		labDocRefManagement = objectInput.readUTF();

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

		objectOutput.writeLong(accMediLabTestManageReqId);

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

		if (policiesForFulfil == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(policiesForFulfil);
		}

		if (labDocRefPolicies == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefPolicies);
		}

		if (impartialityProvision == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(impartialityProvision);
		}

		if (labDocRefImpartProv == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefImpartProv);
		}

		if (confidientialityProv == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(confidientialityProv);
		}

		if (labDocRefConfid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefConfid);
		}

		if (commitmentEvidence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(commitmentEvidence);
		}

		if (labDocRefCommitment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefCommitment);
		}

		if (referenceEvidence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(referenceEvidence);
		}

		if (labDocRefReference == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefReference);
		}

		if (docDescribingRole == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(docDescribingRole);
		}

		if (labDocRefDocDes == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefDocDes);
		}

		if (rolesofPersonnel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rolesofPersonnel);
		}

		if (labDocRefRoles == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefRoles);
		}

		if (competenceReq == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(competenceReq);
		}

		if (labDocRefCompetence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefCompetence);
		}

		if (selectionOfPerson == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(selectionOfPerson);
		}

		if (labDocRefSelection == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefSelection);
		}

		if (handlingEquip == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(handlingEquip);
		}

		if (labDocRefHandling == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefHandling);
		}

		if (calibrationProgram == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(calibrationProgram);
		}

		if (labDocRefCalibrat == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefCalibrat);
		}

		if (approvingReq == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(approvingReq);
		}

		if (labDocRefApproving == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefApproving);
		}

		if (monitorPerformance == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(monitorPerformance);
		}

		if (labDocRefMonitor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefMonitor);
		}

		if (ensuringService == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ensuringService);
		}

		if (labDocRefEnsuring == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefEnsuring);
		}

		if (reviewOfRequest == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reviewOfRequest);
		}

		if (labDocRefRequest == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefRequest);
		}

		if (procedureForLab == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(procedureForLab);
		}

		if (labDocRefProcedure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefProcedure);
		}

		if (testMethodValidat == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testMethodValidat);
		}

		if (labDocRefTestMethod == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefTestMethod);
		}

		if (samplingPlan == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(samplingPlan);
		}

		if (labDocRefSampling == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefSampling);
		}

		if (transportationReciept == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transportationReciept);
		}

		if (labDocRefTransport == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefTransport);
		}

		if (uncertainityMeasure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uncertainityMeasure);
		}

		if (labDocRefUncertain == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefUncertain);
		}

		if (testResultValidity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testResultValidity);
		}

		if (labDocReftestResult == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocReftestResult);
		}

		if (complaints == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(complaints);
		}

		if (labDocRefComplaints == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefComplaints);
		}

		if (nonConformingWork == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nonConformingWork);
		}

		if (labDocRefNonConfirm == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefNonConfirm);
		}

		if (uniqueIdentification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uniqueIdentification);
		}

		if (labDocRefUnique == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefUnique);
		}

		if (currentRevisionStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(currentRevisionStatus);
		}

		if (labDocRefCurrentRev == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefCurrentRev);
		}

		if (docChangeIdentify == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(docChangeIdentify);
		}

		if (labDocRefDocChange == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefDocChange);
		}

		if (recordControl == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(recordControl);
		}

		if (labDocRefRecordControl == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefRecordControl);
		}

		if (plannedAction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(plannedAction);
		}

		if (labDocRefPlanned == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefPlanned);
		}

		if (imporvementOpportunity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(imporvementOpportunity);
		}

		if (labDocRefImprovement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefImprovement);
		}

		if (correctiveAction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(correctiveAction);
		}

		if (labDocRefCorrective == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefCorrective);
		}

		if (internalAudits == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(internalAudits);
		}

		if (labDocRefInternal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefInternal);
		}

		if (managementReview == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(managementReview);
		}

		if (labDocRefManagement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labDocRefManagement);
		}

		objectOutput.writeLong(janaacApplicationId);
	}

	public String uuid;
	public long accMediLabTestManageReqId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String policiesForFulfil;
	public String labDocRefPolicies;
	public String impartialityProvision;
	public String labDocRefImpartProv;
	public String confidientialityProv;
	public String labDocRefConfid;
	public String commitmentEvidence;
	public String labDocRefCommitment;
	public String referenceEvidence;
	public String labDocRefReference;
	public String docDescribingRole;
	public String labDocRefDocDes;
	public String rolesofPersonnel;
	public String labDocRefRoles;
	public String competenceReq;
	public String labDocRefCompetence;
	public String selectionOfPerson;
	public String labDocRefSelection;
	public String handlingEquip;
	public String labDocRefHandling;
	public String calibrationProgram;
	public String labDocRefCalibrat;
	public String approvingReq;
	public String labDocRefApproving;
	public String monitorPerformance;
	public String labDocRefMonitor;
	public String ensuringService;
	public String labDocRefEnsuring;
	public String reviewOfRequest;
	public String labDocRefRequest;
	public String procedureForLab;
	public String labDocRefProcedure;
	public String testMethodValidat;
	public String labDocRefTestMethod;
	public String samplingPlan;
	public String labDocRefSampling;
	public String transportationReciept;
	public String labDocRefTransport;
	public String uncertainityMeasure;
	public String labDocRefUncertain;
	public String testResultValidity;
	public String labDocReftestResult;
	public String complaints;
	public String labDocRefComplaints;
	public String nonConformingWork;
	public String labDocRefNonConfirm;
	public String uniqueIdentification;
	public String labDocRefUnique;
	public String currentRevisionStatus;
	public String labDocRefCurrentRev;
	public String docChangeIdentify;
	public String labDocRefDocChange;
	public String recordControl;
	public String labDocRefRecordControl;
	public String plannedAction;
	public String labDocRefPlanned;
	public String imporvementOpportunity;
	public String labDocRefImprovement;
	public String correctiveAction;
	public String labDocRefCorrective;
	public String internalAudits;
	public String labDocRefInternal;
	public String managementReview;
	public String labDocRefManagement;
	public long janaacApplicationId;

}