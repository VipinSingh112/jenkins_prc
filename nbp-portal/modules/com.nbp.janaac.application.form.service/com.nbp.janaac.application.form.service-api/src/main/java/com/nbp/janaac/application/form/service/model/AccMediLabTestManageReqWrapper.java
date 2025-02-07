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
 * This class is a wrapper for {@link AccMediLabTestManageReq}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestManageReq
 * @generated
 */
public class AccMediLabTestManageReqWrapper
	extends BaseModelWrapper<AccMediLabTestManageReq>
	implements AccMediLabTestManageReq, ModelWrapper<AccMediLabTestManageReq> {

	public AccMediLabTestManageReqWrapper(
		AccMediLabTestManageReq accMediLabTestManageReq) {

		super(accMediLabTestManageReq);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"accMediLabTestManageReqId", getAccMediLabTestManageReqId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("policiesForFulfil", getPoliciesForFulfil());
		attributes.put("labDocRefPolicies", getLabDocRefPolicies());
		attributes.put("impartialityProvision", getImpartialityProvision());
		attributes.put("labDocRefImpartProv", getLabDocRefImpartProv());
		attributes.put("confidientialityProv", getConfidientialityProv());
		attributes.put("labDocRefConfid", getLabDocRefConfid());
		attributes.put("commitmentEvidence", getCommitmentEvidence());
		attributes.put("labDocRefCommitment", getLabDocRefCommitment());
		attributes.put("referenceEvidence", getReferenceEvidence());
		attributes.put("labDocRefReference", getLabDocRefReference());
		attributes.put("docDescribingRole", getDocDescribingRole());
		attributes.put("labDocRefDocDes", getLabDocRefDocDes());
		attributes.put("rolesofPersonnel", getRolesofPersonnel());
		attributes.put("labDocRefRoles", getLabDocRefRoles());
		attributes.put("competenceReq", getCompetenceReq());
		attributes.put("labDocRefCompetence", getLabDocRefCompetence());
		attributes.put("selectionOfPerson", getSelectionOfPerson());
		attributes.put("labDocRefSelection", getLabDocRefSelection());
		attributes.put("handlingEquip", getHandlingEquip());
		attributes.put("labDocRefHandling", getLabDocRefHandling());
		attributes.put("calibrationProgram", getCalibrationProgram());
		attributes.put("labDocRefCalibrat", getLabDocRefCalibrat());
		attributes.put("approvingReq", getApprovingReq());
		attributes.put("labDocRefApproving", getLabDocRefApproving());
		attributes.put("monitorPerformance", getMonitorPerformance());
		attributes.put("labDocRefMonitor", getLabDocRefMonitor());
		attributes.put("ensuringService", getEnsuringService());
		attributes.put("labDocRefEnsuring", getLabDocRefEnsuring());
		attributes.put("reviewOfRequest", getReviewOfRequest());
		attributes.put("labDocRefRequest", getLabDocRefRequest());
		attributes.put("procedureForLab", getProcedureForLab());
		attributes.put("labDocRefProcedure", getLabDocRefProcedure());
		attributes.put("testMethodValidat", getTestMethodValidat());
		attributes.put("labDocRefTestMethod", getLabDocRefTestMethod());
		attributes.put("samplingPlan", getSamplingPlan());
		attributes.put("labDocRefSampling", getLabDocRefSampling());
		attributes.put("transportationReciept", getTransportationReciept());
		attributes.put("labDocRefTransport", getLabDocRefTransport());
		attributes.put("uncertainityMeasure", getUncertainityMeasure());
		attributes.put("labDocRefUncertain", getLabDocRefUncertain());
		attributes.put("testResultValidity", getTestResultValidity());
		attributes.put("labDocReftestResult", getLabDocReftestResult());
		attributes.put("complaints", getComplaints());
		attributes.put("labDocRefComplaints", getLabDocRefComplaints());
		attributes.put("nonConformingWork", getNonConformingWork());
		attributes.put("labDocRefNonConfirm", getLabDocRefNonConfirm());
		attributes.put("uniqueIdentification", getUniqueIdentification());
		attributes.put("labDocRefUnique", getLabDocRefUnique());
		attributes.put("currentRevisionStatus", getCurrentRevisionStatus());
		attributes.put("labDocRefCurrentRev", getLabDocRefCurrentRev());
		attributes.put("docChangeIdentify", getDocChangeIdentify());
		attributes.put("labDocRefDocChange", getLabDocRefDocChange());
		attributes.put("recordControl", getRecordControl());
		attributes.put("labDocRefRecordControl", getLabDocRefRecordControl());
		attributes.put("plannedAction", getPlannedAction());
		attributes.put("labDocRefPlanned", getLabDocRefPlanned());
		attributes.put("imporvementOpportunity", getImporvementOpportunity());
		attributes.put("labDocRefImprovement", getLabDocRefImprovement());
		attributes.put("correctiveAction", getCorrectiveAction());
		attributes.put("labDocRefCorrective", getLabDocRefCorrective());
		attributes.put("internalAudits", getInternalAudits());
		attributes.put("labDocRefInternal", getLabDocRefInternal());
		attributes.put("managementReview", getManagementReview());
		attributes.put("labDocRefManagement", getLabDocRefManagement());
		attributes.put("janaacApplicationId", getJanaacApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accMediLabTestManageReqId = (Long)attributes.get(
			"accMediLabTestManageReqId");

		if (accMediLabTestManageReqId != null) {
			setAccMediLabTestManageReqId(accMediLabTestManageReqId);
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

		String policiesForFulfil = (String)attributes.get("policiesForFulfil");

		if (policiesForFulfil != null) {
			setPoliciesForFulfil(policiesForFulfil);
		}

		String labDocRefPolicies = (String)attributes.get("labDocRefPolicies");

		if (labDocRefPolicies != null) {
			setLabDocRefPolicies(labDocRefPolicies);
		}

		String impartialityProvision = (String)attributes.get(
			"impartialityProvision");

		if (impartialityProvision != null) {
			setImpartialityProvision(impartialityProvision);
		}

		String labDocRefImpartProv = (String)attributes.get(
			"labDocRefImpartProv");

		if (labDocRefImpartProv != null) {
			setLabDocRefImpartProv(labDocRefImpartProv);
		}

		String confidientialityProv = (String)attributes.get(
			"confidientialityProv");

		if (confidientialityProv != null) {
			setConfidientialityProv(confidientialityProv);
		}

		String labDocRefConfid = (String)attributes.get("labDocRefConfid");

		if (labDocRefConfid != null) {
			setLabDocRefConfid(labDocRefConfid);
		}

		String commitmentEvidence = (String)attributes.get(
			"commitmentEvidence");

		if (commitmentEvidence != null) {
			setCommitmentEvidence(commitmentEvidence);
		}

		String labDocRefCommitment = (String)attributes.get(
			"labDocRefCommitment");

		if (labDocRefCommitment != null) {
			setLabDocRefCommitment(labDocRefCommitment);
		}

		String referenceEvidence = (String)attributes.get("referenceEvidence");

		if (referenceEvidence != null) {
			setReferenceEvidence(referenceEvidence);
		}

		String labDocRefReference = (String)attributes.get(
			"labDocRefReference");

		if (labDocRefReference != null) {
			setLabDocRefReference(labDocRefReference);
		}

		String docDescribingRole = (String)attributes.get("docDescribingRole");

		if (docDescribingRole != null) {
			setDocDescribingRole(docDescribingRole);
		}

		String labDocRefDocDes = (String)attributes.get("labDocRefDocDes");

		if (labDocRefDocDes != null) {
			setLabDocRefDocDes(labDocRefDocDes);
		}

		String rolesofPersonnel = (String)attributes.get("rolesofPersonnel");

		if (rolesofPersonnel != null) {
			setRolesofPersonnel(rolesofPersonnel);
		}

		String labDocRefRoles = (String)attributes.get("labDocRefRoles");

		if (labDocRefRoles != null) {
			setLabDocRefRoles(labDocRefRoles);
		}

		String competenceReq = (String)attributes.get("competenceReq");

		if (competenceReq != null) {
			setCompetenceReq(competenceReq);
		}

		String labDocRefCompetence = (String)attributes.get(
			"labDocRefCompetence");

		if (labDocRefCompetence != null) {
			setLabDocRefCompetence(labDocRefCompetence);
		}

		String selectionOfPerson = (String)attributes.get("selectionOfPerson");

		if (selectionOfPerson != null) {
			setSelectionOfPerson(selectionOfPerson);
		}

		String labDocRefSelection = (String)attributes.get(
			"labDocRefSelection");

		if (labDocRefSelection != null) {
			setLabDocRefSelection(labDocRefSelection);
		}

		String handlingEquip = (String)attributes.get("handlingEquip");

		if (handlingEquip != null) {
			setHandlingEquip(handlingEquip);
		}

		String labDocRefHandling = (String)attributes.get("labDocRefHandling");

		if (labDocRefHandling != null) {
			setLabDocRefHandling(labDocRefHandling);
		}

		String calibrationProgram = (String)attributes.get(
			"calibrationProgram");

		if (calibrationProgram != null) {
			setCalibrationProgram(calibrationProgram);
		}

		String labDocRefCalibrat = (String)attributes.get("labDocRefCalibrat");

		if (labDocRefCalibrat != null) {
			setLabDocRefCalibrat(labDocRefCalibrat);
		}

		String approvingReq = (String)attributes.get("approvingReq");

		if (approvingReq != null) {
			setApprovingReq(approvingReq);
		}

		String labDocRefApproving = (String)attributes.get(
			"labDocRefApproving");

		if (labDocRefApproving != null) {
			setLabDocRefApproving(labDocRefApproving);
		}

		String monitorPerformance = (String)attributes.get(
			"monitorPerformance");

		if (monitorPerformance != null) {
			setMonitorPerformance(monitorPerformance);
		}

		String labDocRefMonitor = (String)attributes.get("labDocRefMonitor");

		if (labDocRefMonitor != null) {
			setLabDocRefMonitor(labDocRefMonitor);
		}

		String ensuringService = (String)attributes.get("ensuringService");

		if (ensuringService != null) {
			setEnsuringService(ensuringService);
		}

		String labDocRefEnsuring = (String)attributes.get("labDocRefEnsuring");

		if (labDocRefEnsuring != null) {
			setLabDocRefEnsuring(labDocRefEnsuring);
		}

		String reviewOfRequest = (String)attributes.get("reviewOfRequest");

		if (reviewOfRequest != null) {
			setReviewOfRequest(reviewOfRequest);
		}

		String labDocRefRequest = (String)attributes.get("labDocRefRequest");

		if (labDocRefRequest != null) {
			setLabDocRefRequest(labDocRefRequest);
		}

		String procedureForLab = (String)attributes.get("procedureForLab");

		if (procedureForLab != null) {
			setProcedureForLab(procedureForLab);
		}

		String labDocRefProcedure = (String)attributes.get(
			"labDocRefProcedure");

		if (labDocRefProcedure != null) {
			setLabDocRefProcedure(labDocRefProcedure);
		}

		String testMethodValidat = (String)attributes.get("testMethodValidat");

		if (testMethodValidat != null) {
			setTestMethodValidat(testMethodValidat);
		}

		String labDocRefTestMethod = (String)attributes.get(
			"labDocRefTestMethod");

		if (labDocRefTestMethod != null) {
			setLabDocRefTestMethod(labDocRefTestMethod);
		}

		String samplingPlan = (String)attributes.get("samplingPlan");

		if (samplingPlan != null) {
			setSamplingPlan(samplingPlan);
		}

		String labDocRefSampling = (String)attributes.get("labDocRefSampling");

		if (labDocRefSampling != null) {
			setLabDocRefSampling(labDocRefSampling);
		}

		String transportationReciept = (String)attributes.get(
			"transportationReciept");

		if (transportationReciept != null) {
			setTransportationReciept(transportationReciept);
		}

		String labDocRefTransport = (String)attributes.get(
			"labDocRefTransport");

		if (labDocRefTransport != null) {
			setLabDocRefTransport(labDocRefTransport);
		}

		String uncertainityMeasure = (String)attributes.get(
			"uncertainityMeasure");

		if (uncertainityMeasure != null) {
			setUncertainityMeasure(uncertainityMeasure);
		}

		String labDocRefUncertain = (String)attributes.get(
			"labDocRefUncertain");

		if (labDocRefUncertain != null) {
			setLabDocRefUncertain(labDocRefUncertain);
		}

		String testResultValidity = (String)attributes.get(
			"testResultValidity");

		if (testResultValidity != null) {
			setTestResultValidity(testResultValidity);
		}

		String labDocReftestResult = (String)attributes.get(
			"labDocReftestResult");

		if (labDocReftestResult != null) {
			setLabDocReftestResult(labDocReftestResult);
		}

		String complaints = (String)attributes.get("complaints");

		if (complaints != null) {
			setComplaints(complaints);
		}

		String labDocRefComplaints = (String)attributes.get(
			"labDocRefComplaints");

		if (labDocRefComplaints != null) {
			setLabDocRefComplaints(labDocRefComplaints);
		}

		String nonConformingWork = (String)attributes.get("nonConformingWork");

		if (nonConformingWork != null) {
			setNonConformingWork(nonConformingWork);
		}

		String labDocRefNonConfirm = (String)attributes.get(
			"labDocRefNonConfirm");

		if (labDocRefNonConfirm != null) {
			setLabDocRefNonConfirm(labDocRefNonConfirm);
		}

		String uniqueIdentification = (String)attributes.get(
			"uniqueIdentification");

		if (uniqueIdentification != null) {
			setUniqueIdentification(uniqueIdentification);
		}

		String labDocRefUnique = (String)attributes.get("labDocRefUnique");

		if (labDocRefUnique != null) {
			setLabDocRefUnique(labDocRefUnique);
		}

		String currentRevisionStatus = (String)attributes.get(
			"currentRevisionStatus");

		if (currentRevisionStatus != null) {
			setCurrentRevisionStatus(currentRevisionStatus);
		}

		String labDocRefCurrentRev = (String)attributes.get(
			"labDocRefCurrentRev");

		if (labDocRefCurrentRev != null) {
			setLabDocRefCurrentRev(labDocRefCurrentRev);
		}

		String docChangeIdentify = (String)attributes.get("docChangeIdentify");

		if (docChangeIdentify != null) {
			setDocChangeIdentify(docChangeIdentify);
		}

		String labDocRefDocChange = (String)attributes.get(
			"labDocRefDocChange");

		if (labDocRefDocChange != null) {
			setLabDocRefDocChange(labDocRefDocChange);
		}

		String recordControl = (String)attributes.get("recordControl");

		if (recordControl != null) {
			setRecordControl(recordControl);
		}

		String labDocRefRecordControl = (String)attributes.get(
			"labDocRefRecordControl");

		if (labDocRefRecordControl != null) {
			setLabDocRefRecordControl(labDocRefRecordControl);
		}

		String plannedAction = (String)attributes.get("plannedAction");

		if (plannedAction != null) {
			setPlannedAction(plannedAction);
		}

		String labDocRefPlanned = (String)attributes.get("labDocRefPlanned");

		if (labDocRefPlanned != null) {
			setLabDocRefPlanned(labDocRefPlanned);
		}

		String imporvementOpportunity = (String)attributes.get(
			"imporvementOpportunity");

		if (imporvementOpportunity != null) {
			setImporvementOpportunity(imporvementOpportunity);
		}

		String labDocRefImprovement = (String)attributes.get(
			"labDocRefImprovement");

		if (labDocRefImprovement != null) {
			setLabDocRefImprovement(labDocRefImprovement);
		}

		String correctiveAction = (String)attributes.get("correctiveAction");

		if (correctiveAction != null) {
			setCorrectiveAction(correctiveAction);
		}

		String labDocRefCorrective = (String)attributes.get(
			"labDocRefCorrective");

		if (labDocRefCorrective != null) {
			setLabDocRefCorrective(labDocRefCorrective);
		}

		String internalAudits = (String)attributes.get("internalAudits");

		if (internalAudits != null) {
			setInternalAudits(internalAudits);
		}

		String labDocRefInternal = (String)attributes.get("labDocRefInternal");

		if (labDocRefInternal != null) {
			setLabDocRefInternal(labDocRefInternal);
		}

		String managementReview = (String)attributes.get("managementReview");

		if (managementReview != null) {
			setManagementReview(managementReview);
		}

		String labDocRefManagement = (String)attributes.get(
			"labDocRefManagement");

		if (labDocRefManagement != null) {
			setLabDocRefManagement(labDocRefManagement);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}
	}

	@Override
	public AccMediLabTestManageReq cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acc medi lab test manage req ID of this acc medi lab test manage req.
	 *
	 * @return the acc medi lab test manage req ID of this acc medi lab test manage req
	 */
	@Override
	public long getAccMediLabTestManageReqId() {
		return model.getAccMediLabTestManageReqId();
	}

	/**
	 * Returns the approving req of this acc medi lab test manage req.
	 *
	 * @return the approving req of this acc medi lab test manage req
	 */
	@Override
	public String getApprovingReq() {
		return model.getApprovingReq();
	}

	/**
	 * Returns the calibration program of this acc medi lab test manage req.
	 *
	 * @return the calibration program of this acc medi lab test manage req
	 */
	@Override
	public String getCalibrationProgram() {
		return model.getCalibrationProgram();
	}

	/**
	 * Returns the commitment evidence of this acc medi lab test manage req.
	 *
	 * @return the commitment evidence of this acc medi lab test manage req
	 */
	@Override
	public String getCommitmentEvidence() {
		return model.getCommitmentEvidence();
	}

	/**
	 * Returns the company ID of this acc medi lab test manage req.
	 *
	 * @return the company ID of this acc medi lab test manage req
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the competence req of this acc medi lab test manage req.
	 *
	 * @return the competence req of this acc medi lab test manage req
	 */
	@Override
	public String getCompetenceReq() {
		return model.getCompetenceReq();
	}

	/**
	 * Returns the complaints of this acc medi lab test manage req.
	 *
	 * @return the complaints of this acc medi lab test manage req
	 */
	@Override
	public String getComplaints() {
		return model.getComplaints();
	}

	/**
	 * Returns the confidientiality prov of this acc medi lab test manage req.
	 *
	 * @return the confidientiality prov of this acc medi lab test manage req
	 */
	@Override
	public String getConfidientialityProv() {
		return model.getConfidientialityProv();
	}

	/**
	 * Returns the corrective action of this acc medi lab test manage req.
	 *
	 * @return the corrective action of this acc medi lab test manage req
	 */
	@Override
	public String getCorrectiveAction() {
		return model.getCorrectiveAction();
	}

	/**
	 * Returns the create date of this acc medi lab test manage req.
	 *
	 * @return the create date of this acc medi lab test manage req
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the current revision status of this acc medi lab test manage req.
	 *
	 * @return the current revision status of this acc medi lab test manage req
	 */
	@Override
	public String getCurrentRevisionStatus() {
		return model.getCurrentRevisionStatus();
	}

	/**
	 * Returns the doc change identify of this acc medi lab test manage req.
	 *
	 * @return the doc change identify of this acc medi lab test manage req
	 */
	@Override
	public String getDocChangeIdentify() {
		return model.getDocChangeIdentify();
	}

	/**
	 * Returns the doc describing role of this acc medi lab test manage req.
	 *
	 * @return the doc describing role of this acc medi lab test manage req
	 */
	@Override
	public String getDocDescribingRole() {
		return model.getDocDescribingRole();
	}

	/**
	 * Returns the ensuring service of this acc medi lab test manage req.
	 *
	 * @return the ensuring service of this acc medi lab test manage req
	 */
	@Override
	public String getEnsuringService() {
		return model.getEnsuringService();
	}

	/**
	 * Returns the group ID of this acc medi lab test manage req.
	 *
	 * @return the group ID of this acc medi lab test manage req
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the handling equip of this acc medi lab test manage req.
	 *
	 * @return the handling equip of this acc medi lab test manage req
	 */
	@Override
	public String getHandlingEquip() {
		return model.getHandlingEquip();
	}

	/**
	 * Returns the impartiality provision of this acc medi lab test manage req.
	 *
	 * @return the impartiality provision of this acc medi lab test manage req
	 */
	@Override
	public String getImpartialityProvision() {
		return model.getImpartialityProvision();
	}

	/**
	 * Returns the imporvement opportunity of this acc medi lab test manage req.
	 *
	 * @return the imporvement opportunity of this acc medi lab test manage req
	 */
	@Override
	public String getImporvementOpportunity() {
		return model.getImporvementOpportunity();
	}

	/**
	 * Returns the internal audits of this acc medi lab test manage req.
	 *
	 * @return the internal audits of this acc medi lab test manage req
	 */
	@Override
	public String getInternalAudits() {
		return model.getInternalAudits();
	}

	/**
	 * Returns the janaac application ID of this acc medi lab test manage req.
	 *
	 * @return the janaac application ID of this acc medi lab test manage req
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the lab doc ref approving of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref approving of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefApproving() {
		return model.getLabDocRefApproving();
	}

	/**
	 * Returns the lab doc ref calibrat of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref calibrat of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefCalibrat() {
		return model.getLabDocRefCalibrat();
	}

	/**
	 * Returns the lab doc ref commitment of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref commitment of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefCommitment() {
		return model.getLabDocRefCommitment();
	}

	/**
	 * Returns the lab doc ref competence of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref competence of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefCompetence() {
		return model.getLabDocRefCompetence();
	}

	/**
	 * Returns the lab doc ref complaints of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref complaints of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefComplaints() {
		return model.getLabDocRefComplaints();
	}

	/**
	 * Returns the lab doc ref confid of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref confid of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefConfid() {
		return model.getLabDocRefConfid();
	}

	/**
	 * Returns the lab doc ref corrective of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref corrective of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefCorrective() {
		return model.getLabDocRefCorrective();
	}

	/**
	 * Returns the lab doc ref current rev of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref current rev of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefCurrentRev() {
		return model.getLabDocRefCurrentRev();
	}

	/**
	 * Returns the lab doc ref doc change of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref doc change of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefDocChange() {
		return model.getLabDocRefDocChange();
	}

	/**
	 * Returns the lab doc ref doc des of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref doc des of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefDocDes() {
		return model.getLabDocRefDocDes();
	}

	/**
	 * Returns the lab doc ref ensuring of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref ensuring of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefEnsuring() {
		return model.getLabDocRefEnsuring();
	}

	/**
	 * Returns the lab doc ref handling of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref handling of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefHandling() {
		return model.getLabDocRefHandling();
	}

	/**
	 * Returns the lab doc ref impart prov of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref impart prov of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefImpartProv() {
		return model.getLabDocRefImpartProv();
	}

	/**
	 * Returns the lab doc ref improvement of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref improvement of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefImprovement() {
		return model.getLabDocRefImprovement();
	}

	/**
	 * Returns the lab doc ref internal of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref internal of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefInternal() {
		return model.getLabDocRefInternal();
	}

	/**
	 * Returns the lab doc ref management of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref management of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefManagement() {
		return model.getLabDocRefManagement();
	}

	/**
	 * Returns the lab doc ref monitor of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref monitor of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefMonitor() {
		return model.getLabDocRefMonitor();
	}

	/**
	 * Returns the lab doc ref non confirm of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref non confirm of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefNonConfirm() {
		return model.getLabDocRefNonConfirm();
	}

	/**
	 * Returns the lab doc ref planned of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref planned of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefPlanned() {
		return model.getLabDocRefPlanned();
	}

	/**
	 * Returns the lab doc ref policies of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref policies of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefPolicies() {
		return model.getLabDocRefPolicies();
	}

	/**
	 * Returns the lab doc ref procedure of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref procedure of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefProcedure() {
		return model.getLabDocRefProcedure();
	}

	/**
	 * Returns the lab doc ref record control of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref record control of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefRecordControl() {
		return model.getLabDocRefRecordControl();
	}

	/**
	 * Returns the lab doc ref reference of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref reference of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefReference() {
		return model.getLabDocRefReference();
	}

	/**
	 * Returns the lab doc ref request of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref request of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefRequest() {
		return model.getLabDocRefRequest();
	}

	/**
	 * Returns the lab doc ref roles of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref roles of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefRoles() {
		return model.getLabDocRefRoles();
	}

	/**
	 * Returns the lab doc ref sampling of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref sampling of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefSampling() {
		return model.getLabDocRefSampling();
	}

	/**
	 * Returns the lab doc ref selection of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref selection of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefSelection() {
		return model.getLabDocRefSelection();
	}

	/**
	 * Returns the lab doc ref test method of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref test method of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefTestMethod() {
		return model.getLabDocRefTestMethod();
	}

	/**
	 * Returns the lab doc reftest result of this acc medi lab test manage req.
	 *
	 * @return the lab doc reftest result of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocReftestResult() {
		return model.getLabDocReftestResult();
	}

	/**
	 * Returns the lab doc ref transport of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref transport of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefTransport() {
		return model.getLabDocRefTransport();
	}

	/**
	 * Returns the lab doc ref uncertain of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref uncertain of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefUncertain() {
		return model.getLabDocRefUncertain();
	}

	/**
	 * Returns the lab doc ref unique of this acc medi lab test manage req.
	 *
	 * @return the lab doc ref unique of this acc medi lab test manage req
	 */
	@Override
	public String getLabDocRefUnique() {
		return model.getLabDocRefUnique();
	}

	/**
	 * Returns the management review of this acc medi lab test manage req.
	 *
	 * @return the management review of this acc medi lab test manage req
	 */
	@Override
	public String getManagementReview() {
		return model.getManagementReview();
	}

	/**
	 * Returns the modified date of this acc medi lab test manage req.
	 *
	 * @return the modified date of this acc medi lab test manage req
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the monitor performance of this acc medi lab test manage req.
	 *
	 * @return the monitor performance of this acc medi lab test manage req
	 */
	@Override
	public String getMonitorPerformance() {
		return model.getMonitorPerformance();
	}

	/**
	 * Returns the non conforming work of this acc medi lab test manage req.
	 *
	 * @return the non conforming work of this acc medi lab test manage req
	 */
	@Override
	public String getNonConformingWork() {
		return model.getNonConformingWork();
	}

	/**
	 * Returns the planned action of this acc medi lab test manage req.
	 *
	 * @return the planned action of this acc medi lab test manage req
	 */
	@Override
	public String getPlannedAction() {
		return model.getPlannedAction();
	}

	/**
	 * Returns the policies for fulfil of this acc medi lab test manage req.
	 *
	 * @return the policies for fulfil of this acc medi lab test manage req
	 */
	@Override
	public String getPoliciesForFulfil() {
		return model.getPoliciesForFulfil();
	}

	/**
	 * Returns the primary key of this acc medi lab test manage req.
	 *
	 * @return the primary key of this acc medi lab test manage req
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the procedure for lab of this acc medi lab test manage req.
	 *
	 * @return the procedure for lab of this acc medi lab test manage req
	 */
	@Override
	public String getProcedureForLab() {
		return model.getProcedureForLab();
	}

	/**
	 * Returns the record control of this acc medi lab test manage req.
	 *
	 * @return the record control of this acc medi lab test manage req
	 */
	@Override
	public String getRecordControl() {
		return model.getRecordControl();
	}

	/**
	 * Returns the reference evidence of this acc medi lab test manage req.
	 *
	 * @return the reference evidence of this acc medi lab test manage req
	 */
	@Override
	public String getReferenceEvidence() {
		return model.getReferenceEvidence();
	}

	/**
	 * Returns the review of request of this acc medi lab test manage req.
	 *
	 * @return the review of request of this acc medi lab test manage req
	 */
	@Override
	public String getReviewOfRequest() {
		return model.getReviewOfRequest();
	}

	/**
	 * Returns the rolesof personnel of this acc medi lab test manage req.
	 *
	 * @return the rolesof personnel of this acc medi lab test manage req
	 */
	@Override
	public String getRolesofPersonnel() {
		return model.getRolesofPersonnel();
	}

	/**
	 * Returns the sampling plan of this acc medi lab test manage req.
	 *
	 * @return the sampling plan of this acc medi lab test manage req
	 */
	@Override
	public String getSamplingPlan() {
		return model.getSamplingPlan();
	}

	/**
	 * Returns the selection of person of this acc medi lab test manage req.
	 *
	 * @return the selection of person of this acc medi lab test manage req
	 */
	@Override
	public String getSelectionOfPerson() {
		return model.getSelectionOfPerson();
	}

	/**
	 * Returns the test method validat of this acc medi lab test manage req.
	 *
	 * @return the test method validat of this acc medi lab test manage req
	 */
	@Override
	public String getTestMethodValidat() {
		return model.getTestMethodValidat();
	}

	/**
	 * Returns the test result validity of this acc medi lab test manage req.
	 *
	 * @return the test result validity of this acc medi lab test manage req
	 */
	@Override
	public String getTestResultValidity() {
		return model.getTestResultValidity();
	}

	/**
	 * Returns the transportation reciept of this acc medi lab test manage req.
	 *
	 * @return the transportation reciept of this acc medi lab test manage req
	 */
	@Override
	public String getTransportationReciept() {
		return model.getTransportationReciept();
	}

	/**
	 * Returns the uncertainity measure of this acc medi lab test manage req.
	 *
	 * @return the uncertainity measure of this acc medi lab test manage req
	 */
	@Override
	public String getUncertainityMeasure() {
		return model.getUncertainityMeasure();
	}

	/**
	 * Returns the unique identification of this acc medi lab test manage req.
	 *
	 * @return the unique identification of this acc medi lab test manage req
	 */
	@Override
	public String getUniqueIdentification() {
		return model.getUniqueIdentification();
	}

	/**
	 * Returns the user ID of this acc medi lab test manage req.
	 *
	 * @return the user ID of this acc medi lab test manage req
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acc medi lab test manage req.
	 *
	 * @return the user name of this acc medi lab test manage req
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acc medi lab test manage req.
	 *
	 * @return the user uuid of this acc medi lab test manage req
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acc medi lab test manage req.
	 *
	 * @return the uuid of this acc medi lab test manage req
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the acc medi lab test manage req ID of this acc medi lab test manage req.
	 *
	 * @param accMediLabTestManageReqId the acc medi lab test manage req ID of this acc medi lab test manage req
	 */
	@Override
	public void setAccMediLabTestManageReqId(long accMediLabTestManageReqId) {
		model.setAccMediLabTestManageReqId(accMediLabTestManageReqId);
	}

	/**
	 * Sets the approving req of this acc medi lab test manage req.
	 *
	 * @param approvingReq the approving req of this acc medi lab test manage req
	 */
	@Override
	public void setApprovingReq(String approvingReq) {
		model.setApprovingReq(approvingReq);
	}

	/**
	 * Sets the calibration program of this acc medi lab test manage req.
	 *
	 * @param calibrationProgram the calibration program of this acc medi lab test manage req
	 */
	@Override
	public void setCalibrationProgram(String calibrationProgram) {
		model.setCalibrationProgram(calibrationProgram);
	}

	/**
	 * Sets the commitment evidence of this acc medi lab test manage req.
	 *
	 * @param commitmentEvidence the commitment evidence of this acc medi lab test manage req
	 */
	@Override
	public void setCommitmentEvidence(String commitmentEvidence) {
		model.setCommitmentEvidence(commitmentEvidence);
	}

	/**
	 * Sets the company ID of this acc medi lab test manage req.
	 *
	 * @param companyId the company ID of this acc medi lab test manage req
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the competence req of this acc medi lab test manage req.
	 *
	 * @param competenceReq the competence req of this acc medi lab test manage req
	 */
	@Override
	public void setCompetenceReq(String competenceReq) {
		model.setCompetenceReq(competenceReq);
	}

	/**
	 * Sets the complaints of this acc medi lab test manage req.
	 *
	 * @param complaints the complaints of this acc medi lab test manage req
	 */
	@Override
	public void setComplaints(String complaints) {
		model.setComplaints(complaints);
	}

	/**
	 * Sets the confidientiality prov of this acc medi lab test manage req.
	 *
	 * @param confidientialityProv the confidientiality prov of this acc medi lab test manage req
	 */
	@Override
	public void setConfidientialityProv(String confidientialityProv) {
		model.setConfidientialityProv(confidientialityProv);
	}

	/**
	 * Sets the corrective action of this acc medi lab test manage req.
	 *
	 * @param correctiveAction the corrective action of this acc medi lab test manage req
	 */
	@Override
	public void setCorrectiveAction(String correctiveAction) {
		model.setCorrectiveAction(correctiveAction);
	}

	/**
	 * Sets the create date of this acc medi lab test manage req.
	 *
	 * @param createDate the create date of this acc medi lab test manage req
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the current revision status of this acc medi lab test manage req.
	 *
	 * @param currentRevisionStatus the current revision status of this acc medi lab test manage req
	 */
	@Override
	public void setCurrentRevisionStatus(String currentRevisionStatus) {
		model.setCurrentRevisionStatus(currentRevisionStatus);
	}

	/**
	 * Sets the doc change identify of this acc medi lab test manage req.
	 *
	 * @param docChangeIdentify the doc change identify of this acc medi lab test manage req
	 */
	@Override
	public void setDocChangeIdentify(String docChangeIdentify) {
		model.setDocChangeIdentify(docChangeIdentify);
	}

	/**
	 * Sets the doc describing role of this acc medi lab test manage req.
	 *
	 * @param docDescribingRole the doc describing role of this acc medi lab test manage req
	 */
	@Override
	public void setDocDescribingRole(String docDescribingRole) {
		model.setDocDescribingRole(docDescribingRole);
	}

	/**
	 * Sets the ensuring service of this acc medi lab test manage req.
	 *
	 * @param ensuringService the ensuring service of this acc medi lab test manage req
	 */
	@Override
	public void setEnsuringService(String ensuringService) {
		model.setEnsuringService(ensuringService);
	}

	/**
	 * Sets the group ID of this acc medi lab test manage req.
	 *
	 * @param groupId the group ID of this acc medi lab test manage req
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the handling equip of this acc medi lab test manage req.
	 *
	 * @param handlingEquip the handling equip of this acc medi lab test manage req
	 */
	@Override
	public void setHandlingEquip(String handlingEquip) {
		model.setHandlingEquip(handlingEquip);
	}

	/**
	 * Sets the impartiality provision of this acc medi lab test manage req.
	 *
	 * @param impartialityProvision the impartiality provision of this acc medi lab test manage req
	 */
	@Override
	public void setImpartialityProvision(String impartialityProvision) {
		model.setImpartialityProvision(impartialityProvision);
	}

	/**
	 * Sets the imporvement opportunity of this acc medi lab test manage req.
	 *
	 * @param imporvementOpportunity the imporvement opportunity of this acc medi lab test manage req
	 */
	@Override
	public void setImporvementOpportunity(String imporvementOpportunity) {
		model.setImporvementOpportunity(imporvementOpportunity);
	}

	/**
	 * Sets the internal audits of this acc medi lab test manage req.
	 *
	 * @param internalAudits the internal audits of this acc medi lab test manage req
	 */
	@Override
	public void setInternalAudits(String internalAudits) {
		model.setInternalAudits(internalAudits);
	}

	/**
	 * Sets the janaac application ID of this acc medi lab test manage req.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc medi lab test manage req
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the lab doc ref approving of this acc medi lab test manage req.
	 *
	 * @param labDocRefApproving the lab doc ref approving of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefApproving(String labDocRefApproving) {
		model.setLabDocRefApproving(labDocRefApproving);
	}

	/**
	 * Sets the lab doc ref calibrat of this acc medi lab test manage req.
	 *
	 * @param labDocRefCalibrat the lab doc ref calibrat of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefCalibrat(String labDocRefCalibrat) {
		model.setLabDocRefCalibrat(labDocRefCalibrat);
	}

	/**
	 * Sets the lab doc ref commitment of this acc medi lab test manage req.
	 *
	 * @param labDocRefCommitment the lab doc ref commitment of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefCommitment(String labDocRefCommitment) {
		model.setLabDocRefCommitment(labDocRefCommitment);
	}

	/**
	 * Sets the lab doc ref competence of this acc medi lab test manage req.
	 *
	 * @param labDocRefCompetence the lab doc ref competence of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefCompetence(String labDocRefCompetence) {
		model.setLabDocRefCompetence(labDocRefCompetence);
	}

	/**
	 * Sets the lab doc ref complaints of this acc medi lab test manage req.
	 *
	 * @param labDocRefComplaints the lab doc ref complaints of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefComplaints(String labDocRefComplaints) {
		model.setLabDocRefComplaints(labDocRefComplaints);
	}

	/**
	 * Sets the lab doc ref confid of this acc medi lab test manage req.
	 *
	 * @param labDocRefConfid the lab doc ref confid of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefConfid(String labDocRefConfid) {
		model.setLabDocRefConfid(labDocRefConfid);
	}

	/**
	 * Sets the lab doc ref corrective of this acc medi lab test manage req.
	 *
	 * @param labDocRefCorrective the lab doc ref corrective of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefCorrective(String labDocRefCorrective) {
		model.setLabDocRefCorrective(labDocRefCorrective);
	}

	/**
	 * Sets the lab doc ref current rev of this acc medi lab test manage req.
	 *
	 * @param labDocRefCurrentRev the lab doc ref current rev of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefCurrentRev(String labDocRefCurrentRev) {
		model.setLabDocRefCurrentRev(labDocRefCurrentRev);
	}

	/**
	 * Sets the lab doc ref doc change of this acc medi lab test manage req.
	 *
	 * @param labDocRefDocChange the lab doc ref doc change of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefDocChange(String labDocRefDocChange) {
		model.setLabDocRefDocChange(labDocRefDocChange);
	}

	/**
	 * Sets the lab doc ref doc des of this acc medi lab test manage req.
	 *
	 * @param labDocRefDocDes the lab doc ref doc des of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefDocDes(String labDocRefDocDes) {
		model.setLabDocRefDocDes(labDocRefDocDes);
	}

	/**
	 * Sets the lab doc ref ensuring of this acc medi lab test manage req.
	 *
	 * @param labDocRefEnsuring the lab doc ref ensuring of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefEnsuring(String labDocRefEnsuring) {
		model.setLabDocRefEnsuring(labDocRefEnsuring);
	}

	/**
	 * Sets the lab doc ref handling of this acc medi lab test manage req.
	 *
	 * @param labDocRefHandling the lab doc ref handling of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefHandling(String labDocRefHandling) {
		model.setLabDocRefHandling(labDocRefHandling);
	}

	/**
	 * Sets the lab doc ref impart prov of this acc medi lab test manage req.
	 *
	 * @param labDocRefImpartProv the lab doc ref impart prov of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefImpartProv(String labDocRefImpartProv) {
		model.setLabDocRefImpartProv(labDocRefImpartProv);
	}

	/**
	 * Sets the lab doc ref improvement of this acc medi lab test manage req.
	 *
	 * @param labDocRefImprovement the lab doc ref improvement of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefImprovement(String labDocRefImprovement) {
		model.setLabDocRefImprovement(labDocRefImprovement);
	}

	/**
	 * Sets the lab doc ref internal of this acc medi lab test manage req.
	 *
	 * @param labDocRefInternal the lab doc ref internal of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefInternal(String labDocRefInternal) {
		model.setLabDocRefInternal(labDocRefInternal);
	}

	/**
	 * Sets the lab doc ref management of this acc medi lab test manage req.
	 *
	 * @param labDocRefManagement the lab doc ref management of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefManagement(String labDocRefManagement) {
		model.setLabDocRefManagement(labDocRefManagement);
	}

	/**
	 * Sets the lab doc ref monitor of this acc medi lab test manage req.
	 *
	 * @param labDocRefMonitor the lab doc ref monitor of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefMonitor(String labDocRefMonitor) {
		model.setLabDocRefMonitor(labDocRefMonitor);
	}

	/**
	 * Sets the lab doc ref non confirm of this acc medi lab test manage req.
	 *
	 * @param labDocRefNonConfirm the lab doc ref non confirm of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefNonConfirm(String labDocRefNonConfirm) {
		model.setLabDocRefNonConfirm(labDocRefNonConfirm);
	}

	/**
	 * Sets the lab doc ref planned of this acc medi lab test manage req.
	 *
	 * @param labDocRefPlanned the lab doc ref planned of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefPlanned(String labDocRefPlanned) {
		model.setLabDocRefPlanned(labDocRefPlanned);
	}

	/**
	 * Sets the lab doc ref policies of this acc medi lab test manage req.
	 *
	 * @param labDocRefPolicies the lab doc ref policies of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefPolicies(String labDocRefPolicies) {
		model.setLabDocRefPolicies(labDocRefPolicies);
	}

	/**
	 * Sets the lab doc ref procedure of this acc medi lab test manage req.
	 *
	 * @param labDocRefProcedure the lab doc ref procedure of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefProcedure(String labDocRefProcedure) {
		model.setLabDocRefProcedure(labDocRefProcedure);
	}

	/**
	 * Sets the lab doc ref record control of this acc medi lab test manage req.
	 *
	 * @param labDocRefRecordControl the lab doc ref record control of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefRecordControl(String labDocRefRecordControl) {
		model.setLabDocRefRecordControl(labDocRefRecordControl);
	}

	/**
	 * Sets the lab doc ref reference of this acc medi lab test manage req.
	 *
	 * @param labDocRefReference the lab doc ref reference of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefReference(String labDocRefReference) {
		model.setLabDocRefReference(labDocRefReference);
	}

	/**
	 * Sets the lab doc ref request of this acc medi lab test manage req.
	 *
	 * @param labDocRefRequest the lab doc ref request of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefRequest(String labDocRefRequest) {
		model.setLabDocRefRequest(labDocRefRequest);
	}

	/**
	 * Sets the lab doc ref roles of this acc medi lab test manage req.
	 *
	 * @param labDocRefRoles the lab doc ref roles of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefRoles(String labDocRefRoles) {
		model.setLabDocRefRoles(labDocRefRoles);
	}

	/**
	 * Sets the lab doc ref sampling of this acc medi lab test manage req.
	 *
	 * @param labDocRefSampling the lab doc ref sampling of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefSampling(String labDocRefSampling) {
		model.setLabDocRefSampling(labDocRefSampling);
	}

	/**
	 * Sets the lab doc ref selection of this acc medi lab test manage req.
	 *
	 * @param labDocRefSelection the lab doc ref selection of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefSelection(String labDocRefSelection) {
		model.setLabDocRefSelection(labDocRefSelection);
	}

	/**
	 * Sets the lab doc ref test method of this acc medi lab test manage req.
	 *
	 * @param labDocRefTestMethod the lab doc ref test method of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefTestMethod(String labDocRefTestMethod) {
		model.setLabDocRefTestMethod(labDocRefTestMethod);
	}

	/**
	 * Sets the lab doc reftest result of this acc medi lab test manage req.
	 *
	 * @param labDocReftestResult the lab doc reftest result of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocReftestResult(String labDocReftestResult) {
		model.setLabDocReftestResult(labDocReftestResult);
	}

	/**
	 * Sets the lab doc ref transport of this acc medi lab test manage req.
	 *
	 * @param labDocRefTransport the lab doc ref transport of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefTransport(String labDocRefTransport) {
		model.setLabDocRefTransport(labDocRefTransport);
	}

	/**
	 * Sets the lab doc ref uncertain of this acc medi lab test manage req.
	 *
	 * @param labDocRefUncertain the lab doc ref uncertain of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefUncertain(String labDocRefUncertain) {
		model.setLabDocRefUncertain(labDocRefUncertain);
	}

	/**
	 * Sets the lab doc ref unique of this acc medi lab test manage req.
	 *
	 * @param labDocRefUnique the lab doc ref unique of this acc medi lab test manage req
	 */
	@Override
	public void setLabDocRefUnique(String labDocRefUnique) {
		model.setLabDocRefUnique(labDocRefUnique);
	}

	/**
	 * Sets the management review of this acc medi lab test manage req.
	 *
	 * @param managementReview the management review of this acc medi lab test manage req
	 */
	@Override
	public void setManagementReview(String managementReview) {
		model.setManagementReview(managementReview);
	}

	/**
	 * Sets the modified date of this acc medi lab test manage req.
	 *
	 * @param modifiedDate the modified date of this acc medi lab test manage req
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the monitor performance of this acc medi lab test manage req.
	 *
	 * @param monitorPerformance the monitor performance of this acc medi lab test manage req
	 */
	@Override
	public void setMonitorPerformance(String monitorPerformance) {
		model.setMonitorPerformance(monitorPerformance);
	}

	/**
	 * Sets the non conforming work of this acc medi lab test manage req.
	 *
	 * @param nonConformingWork the non conforming work of this acc medi lab test manage req
	 */
	@Override
	public void setNonConformingWork(String nonConformingWork) {
		model.setNonConformingWork(nonConformingWork);
	}

	/**
	 * Sets the planned action of this acc medi lab test manage req.
	 *
	 * @param plannedAction the planned action of this acc medi lab test manage req
	 */
	@Override
	public void setPlannedAction(String plannedAction) {
		model.setPlannedAction(plannedAction);
	}

	/**
	 * Sets the policies for fulfil of this acc medi lab test manage req.
	 *
	 * @param policiesForFulfil the policies for fulfil of this acc medi lab test manage req
	 */
	@Override
	public void setPoliciesForFulfil(String policiesForFulfil) {
		model.setPoliciesForFulfil(policiesForFulfil);
	}

	/**
	 * Sets the primary key of this acc medi lab test manage req.
	 *
	 * @param primaryKey the primary key of this acc medi lab test manage req
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the procedure for lab of this acc medi lab test manage req.
	 *
	 * @param procedureForLab the procedure for lab of this acc medi lab test manage req
	 */
	@Override
	public void setProcedureForLab(String procedureForLab) {
		model.setProcedureForLab(procedureForLab);
	}

	/**
	 * Sets the record control of this acc medi lab test manage req.
	 *
	 * @param recordControl the record control of this acc medi lab test manage req
	 */
	@Override
	public void setRecordControl(String recordControl) {
		model.setRecordControl(recordControl);
	}

	/**
	 * Sets the reference evidence of this acc medi lab test manage req.
	 *
	 * @param referenceEvidence the reference evidence of this acc medi lab test manage req
	 */
	@Override
	public void setReferenceEvidence(String referenceEvidence) {
		model.setReferenceEvidence(referenceEvidence);
	}

	/**
	 * Sets the review of request of this acc medi lab test manage req.
	 *
	 * @param reviewOfRequest the review of request of this acc medi lab test manage req
	 */
	@Override
	public void setReviewOfRequest(String reviewOfRequest) {
		model.setReviewOfRequest(reviewOfRequest);
	}

	/**
	 * Sets the rolesof personnel of this acc medi lab test manage req.
	 *
	 * @param rolesofPersonnel the rolesof personnel of this acc medi lab test manage req
	 */
	@Override
	public void setRolesofPersonnel(String rolesofPersonnel) {
		model.setRolesofPersonnel(rolesofPersonnel);
	}

	/**
	 * Sets the sampling plan of this acc medi lab test manage req.
	 *
	 * @param samplingPlan the sampling plan of this acc medi lab test manage req
	 */
	@Override
	public void setSamplingPlan(String samplingPlan) {
		model.setSamplingPlan(samplingPlan);
	}

	/**
	 * Sets the selection of person of this acc medi lab test manage req.
	 *
	 * @param selectionOfPerson the selection of person of this acc medi lab test manage req
	 */
	@Override
	public void setSelectionOfPerson(String selectionOfPerson) {
		model.setSelectionOfPerson(selectionOfPerson);
	}

	/**
	 * Sets the test method validat of this acc medi lab test manage req.
	 *
	 * @param testMethodValidat the test method validat of this acc medi lab test manage req
	 */
	@Override
	public void setTestMethodValidat(String testMethodValidat) {
		model.setTestMethodValidat(testMethodValidat);
	}

	/**
	 * Sets the test result validity of this acc medi lab test manage req.
	 *
	 * @param testResultValidity the test result validity of this acc medi lab test manage req
	 */
	@Override
	public void setTestResultValidity(String testResultValidity) {
		model.setTestResultValidity(testResultValidity);
	}

	/**
	 * Sets the transportation reciept of this acc medi lab test manage req.
	 *
	 * @param transportationReciept the transportation reciept of this acc medi lab test manage req
	 */
	@Override
	public void setTransportationReciept(String transportationReciept) {
		model.setTransportationReciept(transportationReciept);
	}

	/**
	 * Sets the uncertainity measure of this acc medi lab test manage req.
	 *
	 * @param uncertainityMeasure the uncertainity measure of this acc medi lab test manage req
	 */
	@Override
	public void setUncertainityMeasure(String uncertainityMeasure) {
		model.setUncertainityMeasure(uncertainityMeasure);
	}

	/**
	 * Sets the unique identification of this acc medi lab test manage req.
	 *
	 * @param uniqueIdentification the unique identification of this acc medi lab test manage req
	 */
	@Override
	public void setUniqueIdentification(String uniqueIdentification) {
		model.setUniqueIdentification(uniqueIdentification);
	}

	/**
	 * Sets the user ID of this acc medi lab test manage req.
	 *
	 * @param userId the user ID of this acc medi lab test manage req
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acc medi lab test manage req.
	 *
	 * @param userName the user name of this acc medi lab test manage req
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acc medi lab test manage req.
	 *
	 * @param userUuid the user uuid of this acc medi lab test manage req
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acc medi lab test manage req.
	 *
	 * @param uuid the uuid of this acc medi lab test manage req
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
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
	protected AccMediLabTestManageReqWrapper wrap(
		AccMediLabTestManageReq accMediLabTestManageReq) {

		return new AccMediLabTestManageReqWrapper(accMediLabTestManageReq);
	}

}