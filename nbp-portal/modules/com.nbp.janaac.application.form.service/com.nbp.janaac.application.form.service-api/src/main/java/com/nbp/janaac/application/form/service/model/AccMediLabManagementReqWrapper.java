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
 * This class is a wrapper for {@link AccMediLabManagementReq}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabManagementReq
 * @generated
 */
public class AccMediLabManagementReqWrapper
	extends BaseModelWrapper<AccMediLabManagementReq>
	implements AccMediLabManagementReq, ModelWrapper<AccMediLabManagementReq> {

	public AccMediLabManagementReqWrapper(
		AccMediLabManagementReq accMediLabManagementReq) {

		super(accMediLabManagementReq);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"accMediLabManagementReqId", getAccMediLabManagementReqId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("managementEstablished", getManagementEstablished());
		attributes.put("qMRefManagement", getQMRefManagement());
		attributes.put("personAware", getPersonAware());
		attributes.put("qMRefPerson", getQMRefPerson());
		attributes.put("policiesAcknowledged", getPoliciesAcknowledged());
		attributes.put("qMRefPolicies", getQMRefPolicies());
		attributes.put("controlledDocument", getControlledDocument());
		attributes.put("qMRefControlDoc", getQMRefControlDoc());
		attributes.put("laboratoryEstablished", getLaboratoryEstablished());
		attributes.put("qMReflabEstab", getQMReflabEstab());
		attributes.put("identifiedRisks", getIdentifiedRisks());
		attributes.put("qMRefRisks", getQMRefRisks());
		attributes.put("havePersonnel", getHavePersonnel());
		attributes.put("qMRefPersonnel", getQMRefPersonnel());
		attributes.put("authorizePersonnel", getAuthorizePersonnel());
		attributes.put("qMRefAuthorize", getQMRefAuthorize());
		attributes.put(
			"labControlDocsFulfilment", getLabControlDocsFulfilment());
		attributes.put("otherRefFulfil", getOtherRefFulfil());
		attributes.put("legibleRecordsFulfil", getLegibleRecordsFulfil());
		attributes.put("otherRefLegibleRec", getOtherRefLegibleRec());
		attributes.put("proceduresInPlace", getProceduresInPlace());
		attributes.put("otherRefProcedure", getOtherRefProcedure());
		attributes.put("communicatedRequirement", getCommunicatedRequirement());
		attributes.put("otherRefRequirement", getOtherRefRequirement());
		attributes.put("procedureForSelection", getProcedureForSelection());
		attributes.put("otherRefSelection", getOtherRefSelection());
		attributes.put("arrangementInPlace", getArrangementInPlace());
		attributes.put("otherRefArrange", getOtherRefArrange());
		attributes.put("processInPlace", getProcessInPlace());
		attributes.put("otherRefProcess", getOtherRefProcess());
		attributes.put("labOperateProgramme", getLabOperateProgramme());
		attributes.put("otherRefLabOperate", getOtherRefLabOperate());
		attributes.put("identifyOpportunities", getIdentifyOpportunities());
		attributes.put("otherRefOpportunity", getOtherRefOpportunity());
		attributes.put("demonstrateFulfilment", getDemonstrateFulfilment());
		attributes.put("otherRefDemonstrate", getOtherRefDemonstrate());
		attributes.put("ensureLabPlan", getEnsureLabPlan());
		attributes.put("otherRefEnsurePlan", getOtherRefEnsurePlan());
		attributes.put("plannedManageReview", getPlannedManageReview());
		attributes.put("otherRefPlanned", getOtherRefPlanned());
		attributes.put("availablePersonnel", getAvailablePersonnel());
		attributes.put("manualRefAvailable", getManualRefAvailable());
		attributes.put("educationProgramme", getEducationProgramme());
		attributes.put("manualRefEducation", getManualRefEducation());
		attributes.put("ensureAccomodation", getEnsureAccomodation());
		attributes.put("manualRefAccom", getManualRefAccom());
		attributes.put("processForSelection", getProcessForSelection());
		attributes.put("manualRefSelection", getManualRefSelection());
		attributes.put("verifyReagents", getVerifyReagents());
		attributes.put("manualRefReagents", getManualRefReagents());
		attributes.put("docProcedure", getDocProcedure());
		attributes.put("manualRefDocProce", getManualRefDocProce());
		attributes.put("useExamMethods", getUseExamMethods());
		attributes.put("manualRefExam", getManualRefExam());
		attributes.put("monitoringValidity", getMonitoringValidity());
		attributes.put("manualRefValidity", getManualRefValidity());
		attributes.put("validateExam", getValidateExam());
		attributes.put("manualRefValidateExam", getManualRefValidateExam());
		attributes.put("uncertainityReview", getUncertainityReview());
		attributes.put("manualRefUncertainity", getManualRefUncertainity());
		attributes.put("preventResRelease", getPreventResRelease());
		attributes.put("manualRefPrevent", getManualRefPrevent());
		attributes.put("equipmentMaintenance", getEquipmentMaintenance());
		attributes.put("manualRefMaintenance", getManualRefMaintenance());
		attributes.put("equipCalibration", getEquipCalibration());
		attributes.put("manualRefCalibrat", getManualRefCalibrat());
		attributes.put("proficencyTesting", getProficencyTesting());
		attributes.put("manualRefProfiTest", getManualRefProfiTest());
		attributes.put("postExamReliabilty", getPostExamReliabilty());
		attributes.put("manualRefPostExam", getManualRefPostExam());
		attributes.put("reportedAccurately", getReportedAccurately());
		attributes.put("manualRefReported", getManualRefReported());
		attributes.put("responsiblitySpecified", getResponsiblitySpecified());
		attributes.put("manualRefSpecified", getManualRefSpecified());
		attributes.put("ensureAuthorities", getEnsureAuthorities());
		attributes.put("manualRefAuthorities", getManualRefAuthorities());
		attributes.put("janaacApplicationId", getJanaacApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accMediLabManagementReqId = (Long)attributes.get(
			"accMediLabManagementReqId");

		if (accMediLabManagementReqId != null) {
			setAccMediLabManagementReqId(accMediLabManagementReqId);
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

		String managementEstablished = (String)attributes.get(
			"managementEstablished");

		if (managementEstablished != null) {
			setManagementEstablished(managementEstablished);
		}

		String qMRefManagement = (String)attributes.get("qMRefManagement");

		if (qMRefManagement != null) {
			setQMRefManagement(qMRefManagement);
		}

		String personAware = (String)attributes.get("personAware");

		if (personAware != null) {
			setPersonAware(personAware);
		}

		String qMRefPerson = (String)attributes.get("qMRefPerson");

		if (qMRefPerson != null) {
			setQMRefPerson(qMRefPerson);
		}

		String policiesAcknowledged = (String)attributes.get(
			"policiesAcknowledged");

		if (policiesAcknowledged != null) {
			setPoliciesAcknowledged(policiesAcknowledged);
		}

		String qMRefPolicies = (String)attributes.get("qMRefPolicies");

		if (qMRefPolicies != null) {
			setQMRefPolicies(qMRefPolicies);
		}

		String controlledDocument = (String)attributes.get(
			"controlledDocument");

		if (controlledDocument != null) {
			setControlledDocument(controlledDocument);
		}

		String qMRefControlDoc = (String)attributes.get("qMRefControlDoc");

		if (qMRefControlDoc != null) {
			setQMRefControlDoc(qMRefControlDoc);
		}

		String laboratoryEstablished = (String)attributes.get(
			"laboratoryEstablished");

		if (laboratoryEstablished != null) {
			setLaboratoryEstablished(laboratoryEstablished);
		}

		String qMReflabEstab = (String)attributes.get("qMReflabEstab");

		if (qMReflabEstab != null) {
			setQMReflabEstab(qMReflabEstab);
		}

		String identifiedRisks = (String)attributes.get("identifiedRisks");

		if (identifiedRisks != null) {
			setIdentifiedRisks(identifiedRisks);
		}

		String qMRefRisks = (String)attributes.get("qMRefRisks");

		if (qMRefRisks != null) {
			setQMRefRisks(qMRefRisks);
		}

		String havePersonnel = (String)attributes.get("havePersonnel");

		if (havePersonnel != null) {
			setHavePersonnel(havePersonnel);
		}

		String qMRefPersonnel = (String)attributes.get("qMRefPersonnel");

		if (qMRefPersonnel != null) {
			setQMRefPersonnel(qMRefPersonnel);
		}

		String authorizePersonnel = (String)attributes.get(
			"authorizePersonnel");

		if (authorizePersonnel != null) {
			setAuthorizePersonnel(authorizePersonnel);
		}

		String qMRefAuthorize = (String)attributes.get("qMRefAuthorize");

		if (qMRefAuthorize != null) {
			setQMRefAuthorize(qMRefAuthorize);
		}

		String labControlDocsFulfilment = (String)attributes.get(
			"labControlDocsFulfilment");

		if (labControlDocsFulfilment != null) {
			setLabControlDocsFulfilment(labControlDocsFulfilment);
		}

		String otherRefFulfil = (String)attributes.get("otherRefFulfil");

		if (otherRefFulfil != null) {
			setOtherRefFulfil(otherRefFulfil);
		}

		String legibleRecordsFulfil = (String)attributes.get(
			"legibleRecordsFulfil");

		if (legibleRecordsFulfil != null) {
			setLegibleRecordsFulfil(legibleRecordsFulfil);
		}

		String otherRefLegibleRec = (String)attributes.get(
			"otherRefLegibleRec");

		if (otherRefLegibleRec != null) {
			setOtherRefLegibleRec(otherRefLegibleRec);
		}

		String proceduresInPlace = (String)attributes.get("proceduresInPlace");

		if (proceduresInPlace != null) {
			setProceduresInPlace(proceduresInPlace);
		}

		String otherRefProcedure = (String)attributes.get("otherRefProcedure");

		if (otherRefProcedure != null) {
			setOtherRefProcedure(otherRefProcedure);
		}

		String communicatedRequirement = (String)attributes.get(
			"communicatedRequirement");

		if (communicatedRequirement != null) {
			setCommunicatedRequirement(communicatedRequirement);
		}

		String otherRefRequirement = (String)attributes.get(
			"otherRefRequirement");

		if (otherRefRequirement != null) {
			setOtherRefRequirement(otherRefRequirement);
		}

		String procedureForSelection = (String)attributes.get(
			"procedureForSelection");

		if (procedureForSelection != null) {
			setProcedureForSelection(procedureForSelection);
		}

		String otherRefSelection = (String)attributes.get("otherRefSelection");

		if (otherRefSelection != null) {
			setOtherRefSelection(otherRefSelection);
		}

		String arrangementInPlace = (String)attributes.get(
			"arrangementInPlace");

		if (arrangementInPlace != null) {
			setArrangementInPlace(arrangementInPlace);
		}

		String otherRefArrange = (String)attributes.get("otherRefArrange");

		if (otherRefArrange != null) {
			setOtherRefArrange(otherRefArrange);
		}

		String processInPlace = (String)attributes.get("processInPlace");

		if (processInPlace != null) {
			setProcessInPlace(processInPlace);
		}

		String otherRefProcess = (String)attributes.get("otherRefProcess");

		if (otherRefProcess != null) {
			setOtherRefProcess(otherRefProcess);
		}

		String labOperateProgramme = (String)attributes.get(
			"labOperateProgramme");

		if (labOperateProgramme != null) {
			setLabOperateProgramme(labOperateProgramme);
		}

		String otherRefLabOperate = (String)attributes.get(
			"otherRefLabOperate");

		if (otherRefLabOperate != null) {
			setOtherRefLabOperate(otherRefLabOperate);
		}

		String identifyOpportunities = (String)attributes.get(
			"identifyOpportunities");

		if (identifyOpportunities != null) {
			setIdentifyOpportunities(identifyOpportunities);
		}

		String otherRefOpportunity = (String)attributes.get(
			"otherRefOpportunity");

		if (otherRefOpportunity != null) {
			setOtherRefOpportunity(otherRefOpportunity);
		}

		String demonstrateFulfilment = (String)attributes.get(
			"demonstrateFulfilment");

		if (demonstrateFulfilment != null) {
			setDemonstrateFulfilment(demonstrateFulfilment);
		}

		String otherRefDemonstrate = (String)attributes.get(
			"otherRefDemonstrate");

		if (otherRefDemonstrate != null) {
			setOtherRefDemonstrate(otherRefDemonstrate);
		}

		String ensureLabPlan = (String)attributes.get("ensureLabPlan");

		if (ensureLabPlan != null) {
			setEnsureLabPlan(ensureLabPlan);
		}

		String otherRefEnsurePlan = (String)attributes.get(
			"otherRefEnsurePlan");

		if (otherRefEnsurePlan != null) {
			setOtherRefEnsurePlan(otherRefEnsurePlan);
		}

		String plannedManageReview = (String)attributes.get(
			"plannedManageReview");

		if (plannedManageReview != null) {
			setPlannedManageReview(plannedManageReview);
		}

		String otherRefPlanned = (String)attributes.get("otherRefPlanned");

		if (otherRefPlanned != null) {
			setOtherRefPlanned(otherRefPlanned);
		}

		String availablePersonnel = (String)attributes.get(
			"availablePersonnel");

		if (availablePersonnel != null) {
			setAvailablePersonnel(availablePersonnel);
		}

		String manualRefAvailable = (String)attributes.get(
			"manualRefAvailable");

		if (manualRefAvailable != null) {
			setManualRefAvailable(manualRefAvailable);
		}

		String educationProgramme = (String)attributes.get(
			"educationProgramme");

		if (educationProgramme != null) {
			setEducationProgramme(educationProgramme);
		}

		String manualRefEducation = (String)attributes.get(
			"manualRefEducation");

		if (manualRefEducation != null) {
			setManualRefEducation(manualRefEducation);
		}

		String ensureAccomodation = (String)attributes.get(
			"ensureAccomodation");

		if (ensureAccomodation != null) {
			setEnsureAccomodation(ensureAccomodation);
		}

		String manualRefAccom = (String)attributes.get("manualRefAccom");

		if (manualRefAccom != null) {
			setManualRefAccom(manualRefAccom);
		}

		String processForSelection = (String)attributes.get(
			"processForSelection");

		if (processForSelection != null) {
			setProcessForSelection(processForSelection);
		}

		String manualRefSelection = (String)attributes.get(
			"manualRefSelection");

		if (manualRefSelection != null) {
			setManualRefSelection(manualRefSelection);
		}

		String verifyReagents = (String)attributes.get("verifyReagents");

		if (verifyReagents != null) {
			setVerifyReagents(verifyReagents);
		}

		String manualRefReagents = (String)attributes.get("manualRefReagents");

		if (manualRefReagents != null) {
			setManualRefReagents(manualRefReagents);
		}

		String docProcedure = (String)attributes.get("docProcedure");

		if (docProcedure != null) {
			setDocProcedure(docProcedure);
		}

		String manualRefDocProce = (String)attributes.get("manualRefDocProce");

		if (manualRefDocProce != null) {
			setManualRefDocProce(manualRefDocProce);
		}

		String useExamMethods = (String)attributes.get("useExamMethods");

		if (useExamMethods != null) {
			setUseExamMethods(useExamMethods);
		}

		String manualRefExam = (String)attributes.get("manualRefExam");

		if (manualRefExam != null) {
			setManualRefExam(manualRefExam);
		}

		String monitoringValidity = (String)attributes.get(
			"monitoringValidity");

		if (monitoringValidity != null) {
			setMonitoringValidity(monitoringValidity);
		}

		String manualRefValidity = (String)attributes.get("manualRefValidity");

		if (manualRefValidity != null) {
			setManualRefValidity(manualRefValidity);
		}

		String validateExam = (String)attributes.get("validateExam");

		if (validateExam != null) {
			setValidateExam(validateExam);
		}

		String manualRefValidateExam = (String)attributes.get(
			"manualRefValidateExam");

		if (manualRefValidateExam != null) {
			setManualRefValidateExam(manualRefValidateExam);
		}

		String uncertainityReview = (String)attributes.get(
			"uncertainityReview");

		if (uncertainityReview != null) {
			setUncertainityReview(uncertainityReview);
		}

		String manualRefUncertainity = (String)attributes.get(
			"manualRefUncertainity");

		if (manualRefUncertainity != null) {
			setManualRefUncertainity(manualRefUncertainity);
		}

		String preventResRelease = (String)attributes.get("preventResRelease");

		if (preventResRelease != null) {
			setPreventResRelease(preventResRelease);
		}

		String manualRefPrevent = (String)attributes.get("manualRefPrevent");

		if (manualRefPrevent != null) {
			setManualRefPrevent(manualRefPrevent);
		}

		String equipmentMaintenance = (String)attributes.get(
			"equipmentMaintenance");

		if (equipmentMaintenance != null) {
			setEquipmentMaintenance(equipmentMaintenance);
		}

		String manualRefMaintenance = (String)attributes.get(
			"manualRefMaintenance");

		if (manualRefMaintenance != null) {
			setManualRefMaintenance(manualRefMaintenance);
		}

		String equipCalibration = (String)attributes.get("equipCalibration");

		if (equipCalibration != null) {
			setEquipCalibration(equipCalibration);
		}

		String manualRefCalibrat = (String)attributes.get("manualRefCalibrat");

		if (manualRefCalibrat != null) {
			setManualRefCalibrat(manualRefCalibrat);
		}

		String proficencyTesting = (String)attributes.get("proficencyTesting");

		if (proficencyTesting != null) {
			setProficencyTesting(proficencyTesting);
		}

		String manualRefProfiTest = (String)attributes.get(
			"manualRefProfiTest");

		if (manualRefProfiTest != null) {
			setManualRefProfiTest(manualRefProfiTest);
		}

		String postExamReliabilty = (String)attributes.get(
			"postExamReliabilty");

		if (postExamReliabilty != null) {
			setPostExamReliabilty(postExamReliabilty);
		}

		String manualRefPostExam = (String)attributes.get("manualRefPostExam");

		if (manualRefPostExam != null) {
			setManualRefPostExam(manualRefPostExam);
		}

		String reportedAccurately = (String)attributes.get(
			"reportedAccurately");

		if (reportedAccurately != null) {
			setReportedAccurately(reportedAccurately);
		}

		String manualRefReported = (String)attributes.get("manualRefReported");

		if (manualRefReported != null) {
			setManualRefReported(manualRefReported);
		}

		String responsiblitySpecified = (String)attributes.get(
			"responsiblitySpecified");

		if (responsiblitySpecified != null) {
			setResponsiblitySpecified(responsiblitySpecified);
		}

		String manualRefSpecified = (String)attributes.get(
			"manualRefSpecified");

		if (manualRefSpecified != null) {
			setManualRefSpecified(manualRefSpecified);
		}

		String ensureAuthorities = (String)attributes.get("ensureAuthorities");

		if (ensureAuthorities != null) {
			setEnsureAuthorities(ensureAuthorities);
		}

		String manualRefAuthorities = (String)attributes.get(
			"manualRefAuthorities");

		if (manualRefAuthorities != null) {
			setManualRefAuthorities(manualRefAuthorities);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}
	}

	@Override
	public AccMediLabManagementReq cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acc medi lab management req ID of this acc medi lab management req.
	 *
	 * @return the acc medi lab management req ID of this acc medi lab management req
	 */
	@Override
	public long getAccMediLabManagementReqId() {
		return model.getAccMediLabManagementReqId();
	}

	/**
	 * Returns the arrangement in place of this acc medi lab management req.
	 *
	 * @return the arrangement in place of this acc medi lab management req
	 */
	@Override
	public String getArrangementInPlace() {
		return model.getArrangementInPlace();
	}

	/**
	 * Returns the authorize personnel of this acc medi lab management req.
	 *
	 * @return the authorize personnel of this acc medi lab management req
	 */
	@Override
	public String getAuthorizePersonnel() {
		return model.getAuthorizePersonnel();
	}

	/**
	 * Returns the available personnel of this acc medi lab management req.
	 *
	 * @return the available personnel of this acc medi lab management req
	 */
	@Override
	public String getAvailablePersonnel() {
		return model.getAvailablePersonnel();
	}

	/**
	 * Returns the communicated requirement of this acc medi lab management req.
	 *
	 * @return the communicated requirement of this acc medi lab management req
	 */
	@Override
	public String getCommunicatedRequirement() {
		return model.getCommunicatedRequirement();
	}

	/**
	 * Returns the company ID of this acc medi lab management req.
	 *
	 * @return the company ID of this acc medi lab management req
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the controlled document of this acc medi lab management req.
	 *
	 * @return the controlled document of this acc medi lab management req
	 */
	@Override
	public String getControlledDocument() {
		return model.getControlledDocument();
	}

	/**
	 * Returns the create date of this acc medi lab management req.
	 *
	 * @return the create date of this acc medi lab management req
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the demonstrate fulfilment of this acc medi lab management req.
	 *
	 * @return the demonstrate fulfilment of this acc medi lab management req
	 */
	@Override
	public String getDemonstrateFulfilment() {
		return model.getDemonstrateFulfilment();
	}

	/**
	 * Returns the doc procedure of this acc medi lab management req.
	 *
	 * @return the doc procedure of this acc medi lab management req
	 */
	@Override
	public String getDocProcedure() {
		return model.getDocProcedure();
	}

	/**
	 * Returns the education programme of this acc medi lab management req.
	 *
	 * @return the education programme of this acc medi lab management req
	 */
	@Override
	public String getEducationProgramme() {
		return model.getEducationProgramme();
	}

	/**
	 * Returns the ensure accomodation of this acc medi lab management req.
	 *
	 * @return the ensure accomodation of this acc medi lab management req
	 */
	@Override
	public String getEnsureAccomodation() {
		return model.getEnsureAccomodation();
	}

	/**
	 * Returns the ensure authorities of this acc medi lab management req.
	 *
	 * @return the ensure authorities of this acc medi lab management req
	 */
	@Override
	public String getEnsureAuthorities() {
		return model.getEnsureAuthorities();
	}

	/**
	 * Returns the ensure lab plan of this acc medi lab management req.
	 *
	 * @return the ensure lab plan of this acc medi lab management req
	 */
	@Override
	public String getEnsureLabPlan() {
		return model.getEnsureLabPlan();
	}

	/**
	 * Returns the equip calibration of this acc medi lab management req.
	 *
	 * @return the equip calibration of this acc medi lab management req
	 */
	@Override
	public String getEquipCalibration() {
		return model.getEquipCalibration();
	}

	/**
	 * Returns the equipment maintenance of this acc medi lab management req.
	 *
	 * @return the equipment maintenance of this acc medi lab management req
	 */
	@Override
	public String getEquipmentMaintenance() {
		return model.getEquipmentMaintenance();
	}

	/**
	 * Returns the group ID of this acc medi lab management req.
	 *
	 * @return the group ID of this acc medi lab management req
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the have personnel of this acc medi lab management req.
	 *
	 * @return the have personnel of this acc medi lab management req
	 */
	@Override
	public String getHavePersonnel() {
		return model.getHavePersonnel();
	}

	/**
	 * Returns the identified risks of this acc medi lab management req.
	 *
	 * @return the identified risks of this acc medi lab management req
	 */
	@Override
	public String getIdentifiedRisks() {
		return model.getIdentifiedRisks();
	}

	/**
	 * Returns the identify opportunities of this acc medi lab management req.
	 *
	 * @return the identify opportunities of this acc medi lab management req
	 */
	@Override
	public String getIdentifyOpportunities() {
		return model.getIdentifyOpportunities();
	}

	/**
	 * Returns the janaac application ID of this acc medi lab management req.
	 *
	 * @return the janaac application ID of this acc medi lab management req
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the lab control docs fulfilment of this acc medi lab management req.
	 *
	 * @return the lab control docs fulfilment of this acc medi lab management req
	 */
	@Override
	public String getLabControlDocsFulfilment() {
		return model.getLabControlDocsFulfilment();
	}

	/**
	 * Returns the lab operate programme of this acc medi lab management req.
	 *
	 * @return the lab operate programme of this acc medi lab management req
	 */
	@Override
	public String getLabOperateProgramme() {
		return model.getLabOperateProgramme();
	}

	/**
	 * Returns the laboratory established of this acc medi lab management req.
	 *
	 * @return the laboratory established of this acc medi lab management req
	 */
	@Override
	public String getLaboratoryEstablished() {
		return model.getLaboratoryEstablished();
	}

	/**
	 * Returns the legible records fulfil of this acc medi lab management req.
	 *
	 * @return the legible records fulfil of this acc medi lab management req
	 */
	@Override
	public String getLegibleRecordsFulfil() {
		return model.getLegibleRecordsFulfil();
	}

	/**
	 * Returns the management established of this acc medi lab management req.
	 *
	 * @return the management established of this acc medi lab management req
	 */
	@Override
	public String getManagementEstablished() {
		return model.getManagementEstablished();
	}

	/**
	 * Returns the manual ref accom of this acc medi lab management req.
	 *
	 * @return the manual ref accom of this acc medi lab management req
	 */
	@Override
	public String getManualRefAccom() {
		return model.getManualRefAccom();
	}

	/**
	 * Returns the manual ref authorities of this acc medi lab management req.
	 *
	 * @return the manual ref authorities of this acc medi lab management req
	 */
	@Override
	public String getManualRefAuthorities() {
		return model.getManualRefAuthorities();
	}

	/**
	 * Returns the manual ref available of this acc medi lab management req.
	 *
	 * @return the manual ref available of this acc medi lab management req
	 */
	@Override
	public String getManualRefAvailable() {
		return model.getManualRefAvailable();
	}

	/**
	 * Returns the manual ref calibrat of this acc medi lab management req.
	 *
	 * @return the manual ref calibrat of this acc medi lab management req
	 */
	@Override
	public String getManualRefCalibrat() {
		return model.getManualRefCalibrat();
	}

	/**
	 * Returns the manual ref doc proce of this acc medi lab management req.
	 *
	 * @return the manual ref doc proce of this acc medi lab management req
	 */
	@Override
	public String getManualRefDocProce() {
		return model.getManualRefDocProce();
	}

	/**
	 * Returns the manual ref education of this acc medi lab management req.
	 *
	 * @return the manual ref education of this acc medi lab management req
	 */
	@Override
	public String getManualRefEducation() {
		return model.getManualRefEducation();
	}

	/**
	 * Returns the manual ref exam of this acc medi lab management req.
	 *
	 * @return the manual ref exam of this acc medi lab management req
	 */
	@Override
	public String getManualRefExam() {
		return model.getManualRefExam();
	}

	/**
	 * Returns the manual ref maintenance of this acc medi lab management req.
	 *
	 * @return the manual ref maintenance of this acc medi lab management req
	 */
	@Override
	public String getManualRefMaintenance() {
		return model.getManualRefMaintenance();
	}

	/**
	 * Returns the manual ref post exam of this acc medi lab management req.
	 *
	 * @return the manual ref post exam of this acc medi lab management req
	 */
	@Override
	public String getManualRefPostExam() {
		return model.getManualRefPostExam();
	}

	/**
	 * Returns the manual ref prevent of this acc medi lab management req.
	 *
	 * @return the manual ref prevent of this acc medi lab management req
	 */
	@Override
	public String getManualRefPrevent() {
		return model.getManualRefPrevent();
	}

	/**
	 * Returns the manual ref profi test of this acc medi lab management req.
	 *
	 * @return the manual ref profi test of this acc medi lab management req
	 */
	@Override
	public String getManualRefProfiTest() {
		return model.getManualRefProfiTest();
	}

	/**
	 * Returns the manual ref reagents of this acc medi lab management req.
	 *
	 * @return the manual ref reagents of this acc medi lab management req
	 */
	@Override
	public String getManualRefReagents() {
		return model.getManualRefReagents();
	}

	/**
	 * Returns the manual ref reported of this acc medi lab management req.
	 *
	 * @return the manual ref reported of this acc medi lab management req
	 */
	@Override
	public String getManualRefReported() {
		return model.getManualRefReported();
	}

	/**
	 * Returns the manual ref selection of this acc medi lab management req.
	 *
	 * @return the manual ref selection of this acc medi lab management req
	 */
	@Override
	public String getManualRefSelection() {
		return model.getManualRefSelection();
	}

	/**
	 * Returns the manual ref specified of this acc medi lab management req.
	 *
	 * @return the manual ref specified of this acc medi lab management req
	 */
	@Override
	public String getManualRefSpecified() {
		return model.getManualRefSpecified();
	}

	/**
	 * Returns the manual ref uncertainity of this acc medi lab management req.
	 *
	 * @return the manual ref uncertainity of this acc medi lab management req
	 */
	@Override
	public String getManualRefUncertainity() {
		return model.getManualRefUncertainity();
	}

	/**
	 * Returns the manual ref validate exam of this acc medi lab management req.
	 *
	 * @return the manual ref validate exam of this acc medi lab management req
	 */
	@Override
	public String getManualRefValidateExam() {
		return model.getManualRefValidateExam();
	}

	/**
	 * Returns the manual ref validity of this acc medi lab management req.
	 *
	 * @return the manual ref validity of this acc medi lab management req
	 */
	@Override
	public String getManualRefValidity() {
		return model.getManualRefValidity();
	}

	/**
	 * Returns the modified date of this acc medi lab management req.
	 *
	 * @return the modified date of this acc medi lab management req
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the monitoring validity of this acc medi lab management req.
	 *
	 * @return the monitoring validity of this acc medi lab management req
	 */
	@Override
	public String getMonitoringValidity() {
		return model.getMonitoringValidity();
	}

	/**
	 * Returns the other ref arrange of this acc medi lab management req.
	 *
	 * @return the other ref arrange of this acc medi lab management req
	 */
	@Override
	public String getOtherRefArrange() {
		return model.getOtherRefArrange();
	}

	/**
	 * Returns the other ref demonstrate of this acc medi lab management req.
	 *
	 * @return the other ref demonstrate of this acc medi lab management req
	 */
	@Override
	public String getOtherRefDemonstrate() {
		return model.getOtherRefDemonstrate();
	}

	/**
	 * Returns the other ref ensure plan of this acc medi lab management req.
	 *
	 * @return the other ref ensure plan of this acc medi lab management req
	 */
	@Override
	public String getOtherRefEnsurePlan() {
		return model.getOtherRefEnsurePlan();
	}

	/**
	 * Returns the other ref fulfil of this acc medi lab management req.
	 *
	 * @return the other ref fulfil of this acc medi lab management req
	 */
	@Override
	public String getOtherRefFulfil() {
		return model.getOtherRefFulfil();
	}

	/**
	 * Returns the other ref lab operate of this acc medi lab management req.
	 *
	 * @return the other ref lab operate of this acc medi lab management req
	 */
	@Override
	public String getOtherRefLabOperate() {
		return model.getOtherRefLabOperate();
	}

	/**
	 * Returns the other ref legible rec of this acc medi lab management req.
	 *
	 * @return the other ref legible rec of this acc medi lab management req
	 */
	@Override
	public String getOtherRefLegibleRec() {
		return model.getOtherRefLegibleRec();
	}

	/**
	 * Returns the other ref opportunity of this acc medi lab management req.
	 *
	 * @return the other ref opportunity of this acc medi lab management req
	 */
	@Override
	public String getOtherRefOpportunity() {
		return model.getOtherRefOpportunity();
	}

	/**
	 * Returns the other ref planned of this acc medi lab management req.
	 *
	 * @return the other ref planned of this acc medi lab management req
	 */
	@Override
	public String getOtherRefPlanned() {
		return model.getOtherRefPlanned();
	}

	/**
	 * Returns the other ref procedure of this acc medi lab management req.
	 *
	 * @return the other ref procedure of this acc medi lab management req
	 */
	@Override
	public String getOtherRefProcedure() {
		return model.getOtherRefProcedure();
	}

	/**
	 * Returns the other ref process of this acc medi lab management req.
	 *
	 * @return the other ref process of this acc medi lab management req
	 */
	@Override
	public String getOtherRefProcess() {
		return model.getOtherRefProcess();
	}

	/**
	 * Returns the other ref requirement of this acc medi lab management req.
	 *
	 * @return the other ref requirement of this acc medi lab management req
	 */
	@Override
	public String getOtherRefRequirement() {
		return model.getOtherRefRequirement();
	}

	/**
	 * Returns the other ref selection of this acc medi lab management req.
	 *
	 * @return the other ref selection of this acc medi lab management req
	 */
	@Override
	public String getOtherRefSelection() {
		return model.getOtherRefSelection();
	}

	/**
	 * Returns the person aware of this acc medi lab management req.
	 *
	 * @return the person aware of this acc medi lab management req
	 */
	@Override
	public String getPersonAware() {
		return model.getPersonAware();
	}

	/**
	 * Returns the planned manage review of this acc medi lab management req.
	 *
	 * @return the planned manage review of this acc medi lab management req
	 */
	@Override
	public String getPlannedManageReview() {
		return model.getPlannedManageReview();
	}

	/**
	 * Returns the policies acknowledged of this acc medi lab management req.
	 *
	 * @return the policies acknowledged of this acc medi lab management req
	 */
	@Override
	public String getPoliciesAcknowledged() {
		return model.getPoliciesAcknowledged();
	}

	/**
	 * Returns the post exam reliabilty of this acc medi lab management req.
	 *
	 * @return the post exam reliabilty of this acc medi lab management req
	 */
	@Override
	public String getPostExamReliabilty() {
		return model.getPostExamReliabilty();
	}

	/**
	 * Returns the prevent res release of this acc medi lab management req.
	 *
	 * @return the prevent res release of this acc medi lab management req
	 */
	@Override
	public String getPreventResRelease() {
		return model.getPreventResRelease();
	}

	/**
	 * Returns the primary key of this acc medi lab management req.
	 *
	 * @return the primary key of this acc medi lab management req
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the procedure for selection of this acc medi lab management req.
	 *
	 * @return the procedure for selection of this acc medi lab management req
	 */
	@Override
	public String getProcedureForSelection() {
		return model.getProcedureForSelection();
	}

	/**
	 * Returns the procedures in place of this acc medi lab management req.
	 *
	 * @return the procedures in place of this acc medi lab management req
	 */
	@Override
	public String getProceduresInPlace() {
		return model.getProceduresInPlace();
	}

	/**
	 * Returns the process for selection of this acc medi lab management req.
	 *
	 * @return the process for selection of this acc medi lab management req
	 */
	@Override
	public String getProcessForSelection() {
		return model.getProcessForSelection();
	}

	/**
	 * Returns the process in place of this acc medi lab management req.
	 *
	 * @return the process in place of this acc medi lab management req
	 */
	@Override
	public String getProcessInPlace() {
		return model.getProcessInPlace();
	}

	/**
	 * Returns the proficency testing of this acc medi lab management req.
	 *
	 * @return the proficency testing of this acc medi lab management req
	 */
	@Override
	public String getProficencyTesting() {
		return model.getProficencyTesting();
	}

	/**
	 * Returns the q m ref authorize of this acc medi lab management req.
	 *
	 * @return the q m ref authorize of this acc medi lab management req
	 */
	@Override
	public String getQMRefAuthorize() {
		return model.getQMRefAuthorize();
	}

	/**
	 * Returns the q m ref control doc of this acc medi lab management req.
	 *
	 * @return the q m ref control doc of this acc medi lab management req
	 */
	@Override
	public String getQMRefControlDoc() {
		return model.getQMRefControlDoc();
	}

	/**
	 * Returns the q m reflab estab of this acc medi lab management req.
	 *
	 * @return the q m reflab estab of this acc medi lab management req
	 */
	@Override
	public String getQMReflabEstab() {
		return model.getQMReflabEstab();
	}

	/**
	 * Returns the q m ref management of this acc medi lab management req.
	 *
	 * @return the q m ref management of this acc medi lab management req
	 */
	@Override
	public String getQMRefManagement() {
		return model.getQMRefManagement();
	}

	/**
	 * Returns the q m ref person of this acc medi lab management req.
	 *
	 * @return the q m ref person of this acc medi lab management req
	 */
	@Override
	public String getQMRefPerson() {
		return model.getQMRefPerson();
	}

	/**
	 * Returns the q m ref personnel of this acc medi lab management req.
	 *
	 * @return the q m ref personnel of this acc medi lab management req
	 */
	@Override
	public String getQMRefPersonnel() {
		return model.getQMRefPersonnel();
	}

	/**
	 * Returns the q m ref policies of this acc medi lab management req.
	 *
	 * @return the q m ref policies of this acc medi lab management req
	 */
	@Override
	public String getQMRefPolicies() {
		return model.getQMRefPolicies();
	}

	/**
	 * Returns the q m ref risks of this acc medi lab management req.
	 *
	 * @return the q m ref risks of this acc medi lab management req
	 */
	@Override
	public String getQMRefRisks() {
		return model.getQMRefRisks();
	}

	/**
	 * Returns the reported accurately of this acc medi lab management req.
	 *
	 * @return the reported accurately of this acc medi lab management req
	 */
	@Override
	public String getReportedAccurately() {
		return model.getReportedAccurately();
	}

	/**
	 * Returns the responsiblity specified of this acc medi lab management req.
	 *
	 * @return the responsiblity specified of this acc medi lab management req
	 */
	@Override
	public String getResponsiblitySpecified() {
		return model.getResponsiblitySpecified();
	}

	/**
	 * Returns the uncertainity review of this acc medi lab management req.
	 *
	 * @return the uncertainity review of this acc medi lab management req
	 */
	@Override
	public String getUncertainityReview() {
		return model.getUncertainityReview();
	}

	/**
	 * Returns the use exam methods of this acc medi lab management req.
	 *
	 * @return the use exam methods of this acc medi lab management req
	 */
	@Override
	public String getUseExamMethods() {
		return model.getUseExamMethods();
	}

	/**
	 * Returns the user ID of this acc medi lab management req.
	 *
	 * @return the user ID of this acc medi lab management req
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acc medi lab management req.
	 *
	 * @return the user name of this acc medi lab management req
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acc medi lab management req.
	 *
	 * @return the user uuid of this acc medi lab management req
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acc medi lab management req.
	 *
	 * @return the uuid of this acc medi lab management req
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the validate exam of this acc medi lab management req.
	 *
	 * @return the validate exam of this acc medi lab management req
	 */
	@Override
	public String getValidateExam() {
		return model.getValidateExam();
	}

	/**
	 * Returns the verify reagents of this acc medi lab management req.
	 *
	 * @return the verify reagents of this acc medi lab management req
	 */
	@Override
	public String getVerifyReagents() {
		return model.getVerifyReagents();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the acc medi lab management req ID of this acc medi lab management req.
	 *
	 * @param accMediLabManagementReqId the acc medi lab management req ID of this acc medi lab management req
	 */
	@Override
	public void setAccMediLabManagementReqId(long accMediLabManagementReqId) {
		model.setAccMediLabManagementReqId(accMediLabManagementReqId);
	}

	/**
	 * Sets the arrangement in place of this acc medi lab management req.
	 *
	 * @param arrangementInPlace the arrangement in place of this acc medi lab management req
	 */
	@Override
	public void setArrangementInPlace(String arrangementInPlace) {
		model.setArrangementInPlace(arrangementInPlace);
	}

	/**
	 * Sets the authorize personnel of this acc medi lab management req.
	 *
	 * @param authorizePersonnel the authorize personnel of this acc medi lab management req
	 */
	@Override
	public void setAuthorizePersonnel(String authorizePersonnel) {
		model.setAuthorizePersonnel(authorizePersonnel);
	}

	/**
	 * Sets the available personnel of this acc medi lab management req.
	 *
	 * @param availablePersonnel the available personnel of this acc medi lab management req
	 */
	@Override
	public void setAvailablePersonnel(String availablePersonnel) {
		model.setAvailablePersonnel(availablePersonnel);
	}

	/**
	 * Sets the communicated requirement of this acc medi lab management req.
	 *
	 * @param communicatedRequirement the communicated requirement of this acc medi lab management req
	 */
	@Override
	public void setCommunicatedRequirement(String communicatedRequirement) {
		model.setCommunicatedRequirement(communicatedRequirement);
	}

	/**
	 * Sets the company ID of this acc medi lab management req.
	 *
	 * @param companyId the company ID of this acc medi lab management req
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the controlled document of this acc medi lab management req.
	 *
	 * @param controlledDocument the controlled document of this acc medi lab management req
	 */
	@Override
	public void setControlledDocument(String controlledDocument) {
		model.setControlledDocument(controlledDocument);
	}

	/**
	 * Sets the create date of this acc medi lab management req.
	 *
	 * @param createDate the create date of this acc medi lab management req
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the demonstrate fulfilment of this acc medi lab management req.
	 *
	 * @param demonstrateFulfilment the demonstrate fulfilment of this acc medi lab management req
	 */
	@Override
	public void setDemonstrateFulfilment(String demonstrateFulfilment) {
		model.setDemonstrateFulfilment(demonstrateFulfilment);
	}

	/**
	 * Sets the doc procedure of this acc medi lab management req.
	 *
	 * @param docProcedure the doc procedure of this acc medi lab management req
	 */
	@Override
	public void setDocProcedure(String docProcedure) {
		model.setDocProcedure(docProcedure);
	}

	/**
	 * Sets the education programme of this acc medi lab management req.
	 *
	 * @param educationProgramme the education programme of this acc medi lab management req
	 */
	@Override
	public void setEducationProgramme(String educationProgramme) {
		model.setEducationProgramme(educationProgramme);
	}

	/**
	 * Sets the ensure accomodation of this acc medi lab management req.
	 *
	 * @param ensureAccomodation the ensure accomodation of this acc medi lab management req
	 */
	@Override
	public void setEnsureAccomodation(String ensureAccomodation) {
		model.setEnsureAccomodation(ensureAccomodation);
	}

	/**
	 * Sets the ensure authorities of this acc medi lab management req.
	 *
	 * @param ensureAuthorities the ensure authorities of this acc medi lab management req
	 */
	@Override
	public void setEnsureAuthorities(String ensureAuthorities) {
		model.setEnsureAuthorities(ensureAuthorities);
	}

	/**
	 * Sets the ensure lab plan of this acc medi lab management req.
	 *
	 * @param ensureLabPlan the ensure lab plan of this acc medi lab management req
	 */
	@Override
	public void setEnsureLabPlan(String ensureLabPlan) {
		model.setEnsureLabPlan(ensureLabPlan);
	}

	/**
	 * Sets the equip calibration of this acc medi lab management req.
	 *
	 * @param equipCalibration the equip calibration of this acc medi lab management req
	 */
	@Override
	public void setEquipCalibration(String equipCalibration) {
		model.setEquipCalibration(equipCalibration);
	}

	/**
	 * Sets the equipment maintenance of this acc medi lab management req.
	 *
	 * @param equipmentMaintenance the equipment maintenance of this acc medi lab management req
	 */
	@Override
	public void setEquipmentMaintenance(String equipmentMaintenance) {
		model.setEquipmentMaintenance(equipmentMaintenance);
	}

	/**
	 * Sets the group ID of this acc medi lab management req.
	 *
	 * @param groupId the group ID of this acc medi lab management req
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the have personnel of this acc medi lab management req.
	 *
	 * @param havePersonnel the have personnel of this acc medi lab management req
	 */
	@Override
	public void setHavePersonnel(String havePersonnel) {
		model.setHavePersonnel(havePersonnel);
	}

	/**
	 * Sets the identified risks of this acc medi lab management req.
	 *
	 * @param identifiedRisks the identified risks of this acc medi lab management req
	 */
	@Override
	public void setIdentifiedRisks(String identifiedRisks) {
		model.setIdentifiedRisks(identifiedRisks);
	}

	/**
	 * Sets the identify opportunities of this acc medi lab management req.
	 *
	 * @param identifyOpportunities the identify opportunities of this acc medi lab management req
	 */
	@Override
	public void setIdentifyOpportunities(String identifyOpportunities) {
		model.setIdentifyOpportunities(identifyOpportunities);
	}

	/**
	 * Sets the janaac application ID of this acc medi lab management req.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc medi lab management req
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the lab control docs fulfilment of this acc medi lab management req.
	 *
	 * @param labControlDocsFulfilment the lab control docs fulfilment of this acc medi lab management req
	 */
	@Override
	public void setLabControlDocsFulfilment(String labControlDocsFulfilment) {
		model.setLabControlDocsFulfilment(labControlDocsFulfilment);
	}

	/**
	 * Sets the lab operate programme of this acc medi lab management req.
	 *
	 * @param labOperateProgramme the lab operate programme of this acc medi lab management req
	 */
	@Override
	public void setLabOperateProgramme(String labOperateProgramme) {
		model.setLabOperateProgramme(labOperateProgramme);
	}

	/**
	 * Sets the laboratory established of this acc medi lab management req.
	 *
	 * @param laboratoryEstablished the laboratory established of this acc medi lab management req
	 */
	@Override
	public void setLaboratoryEstablished(String laboratoryEstablished) {
		model.setLaboratoryEstablished(laboratoryEstablished);
	}

	/**
	 * Sets the legible records fulfil of this acc medi lab management req.
	 *
	 * @param legibleRecordsFulfil the legible records fulfil of this acc medi lab management req
	 */
	@Override
	public void setLegibleRecordsFulfil(String legibleRecordsFulfil) {
		model.setLegibleRecordsFulfil(legibleRecordsFulfil);
	}

	/**
	 * Sets the management established of this acc medi lab management req.
	 *
	 * @param managementEstablished the management established of this acc medi lab management req
	 */
	@Override
	public void setManagementEstablished(String managementEstablished) {
		model.setManagementEstablished(managementEstablished);
	}

	/**
	 * Sets the manual ref accom of this acc medi lab management req.
	 *
	 * @param manualRefAccom the manual ref accom of this acc medi lab management req
	 */
	@Override
	public void setManualRefAccom(String manualRefAccom) {
		model.setManualRefAccom(manualRefAccom);
	}

	/**
	 * Sets the manual ref authorities of this acc medi lab management req.
	 *
	 * @param manualRefAuthorities the manual ref authorities of this acc medi lab management req
	 */
	@Override
	public void setManualRefAuthorities(String manualRefAuthorities) {
		model.setManualRefAuthorities(manualRefAuthorities);
	}

	/**
	 * Sets the manual ref available of this acc medi lab management req.
	 *
	 * @param manualRefAvailable the manual ref available of this acc medi lab management req
	 */
	@Override
	public void setManualRefAvailable(String manualRefAvailable) {
		model.setManualRefAvailable(manualRefAvailable);
	}

	/**
	 * Sets the manual ref calibrat of this acc medi lab management req.
	 *
	 * @param manualRefCalibrat the manual ref calibrat of this acc medi lab management req
	 */
	@Override
	public void setManualRefCalibrat(String manualRefCalibrat) {
		model.setManualRefCalibrat(manualRefCalibrat);
	}

	/**
	 * Sets the manual ref doc proce of this acc medi lab management req.
	 *
	 * @param manualRefDocProce the manual ref doc proce of this acc medi lab management req
	 */
	@Override
	public void setManualRefDocProce(String manualRefDocProce) {
		model.setManualRefDocProce(manualRefDocProce);
	}

	/**
	 * Sets the manual ref education of this acc medi lab management req.
	 *
	 * @param manualRefEducation the manual ref education of this acc medi lab management req
	 */
	@Override
	public void setManualRefEducation(String manualRefEducation) {
		model.setManualRefEducation(manualRefEducation);
	}

	/**
	 * Sets the manual ref exam of this acc medi lab management req.
	 *
	 * @param manualRefExam the manual ref exam of this acc medi lab management req
	 */
	@Override
	public void setManualRefExam(String manualRefExam) {
		model.setManualRefExam(manualRefExam);
	}

	/**
	 * Sets the manual ref maintenance of this acc medi lab management req.
	 *
	 * @param manualRefMaintenance the manual ref maintenance of this acc medi lab management req
	 */
	@Override
	public void setManualRefMaintenance(String manualRefMaintenance) {
		model.setManualRefMaintenance(manualRefMaintenance);
	}

	/**
	 * Sets the manual ref post exam of this acc medi lab management req.
	 *
	 * @param manualRefPostExam the manual ref post exam of this acc medi lab management req
	 */
	@Override
	public void setManualRefPostExam(String manualRefPostExam) {
		model.setManualRefPostExam(manualRefPostExam);
	}

	/**
	 * Sets the manual ref prevent of this acc medi lab management req.
	 *
	 * @param manualRefPrevent the manual ref prevent of this acc medi lab management req
	 */
	@Override
	public void setManualRefPrevent(String manualRefPrevent) {
		model.setManualRefPrevent(manualRefPrevent);
	}

	/**
	 * Sets the manual ref profi test of this acc medi lab management req.
	 *
	 * @param manualRefProfiTest the manual ref profi test of this acc medi lab management req
	 */
	@Override
	public void setManualRefProfiTest(String manualRefProfiTest) {
		model.setManualRefProfiTest(manualRefProfiTest);
	}

	/**
	 * Sets the manual ref reagents of this acc medi lab management req.
	 *
	 * @param manualRefReagents the manual ref reagents of this acc medi lab management req
	 */
	@Override
	public void setManualRefReagents(String manualRefReagents) {
		model.setManualRefReagents(manualRefReagents);
	}

	/**
	 * Sets the manual ref reported of this acc medi lab management req.
	 *
	 * @param manualRefReported the manual ref reported of this acc medi lab management req
	 */
	@Override
	public void setManualRefReported(String manualRefReported) {
		model.setManualRefReported(manualRefReported);
	}

	/**
	 * Sets the manual ref selection of this acc medi lab management req.
	 *
	 * @param manualRefSelection the manual ref selection of this acc medi lab management req
	 */
	@Override
	public void setManualRefSelection(String manualRefSelection) {
		model.setManualRefSelection(manualRefSelection);
	}

	/**
	 * Sets the manual ref specified of this acc medi lab management req.
	 *
	 * @param manualRefSpecified the manual ref specified of this acc medi lab management req
	 */
	@Override
	public void setManualRefSpecified(String manualRefSpecified) {
		model.setManualRefSpecified(manualRefSpecified);
	}

	/**
	 * Sets the manual ref uncertainity of this acc medi lab management req.
	 *
	 * @param manualRefUncertainity the manual ref uncertainity of this acc medi lab management req
	 */
	@Override
	public void setManualRefUncertainity(String manualRefUncertainity) {
		model.setManualRefUncertainity(manualRefUncertainity);
	}

	/**
	 * Sets the manual ref validate exam of this acc medi lab management req.
	 *
	 * @param manualRefValidateExam the manual ref validate exam of this acc medi lab management req
	 */
	@Override
	public void setManualRefValidateExam(String manualRefValidateExam) {
		model.setManualRefValidateExam(manualRefValidateExam);
	}

	/**
	 * Sets the manual ref validity of this acc medi lab management req.
	 *
	 * @param manualRefValidity the manual ref validity of this acc medi lab management req
	 */
	@Override
	public void setManualRefValidity(String manualRefValidity) {
		model.setManualRefValidity(manualRefValidity);
	}

	/**
	 * Sets the modified date of this acc medi lab management req.
	 *
	 * @param modifiedDate the modified date of this acc medi lab management req
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the monitoring validity of this acc medi lab management req.
	 *
	 * @param monitoringValidity the monitoring validity of this acc medi lab management req
	 */
	@Override
	public void setMonitoringValidity(String monitoringValidity) {
		model.setMonitoringValidity(monitoringValidity);
	}

	/**
	 * Sets the other ref arrange of this acc medi lab management req.
	 *
	 * @param otherRefArrange the other ref arrange of this acc medi lab management req
	 */
	@Override
	public void setOtherRefArrange(String otherRefArrange) {
		model.setOtherRefArrange(otherRefArrange);
	}

	/**
	 * Sets the other ref demonstrate of this acc medi lab management req.
	 *
	 * @param otherRefDemonstrate the other ref demonstrate of this acc medi lab management req
	 */
	@Override
	public void setOtherRefDemonstrate(String otherRefDemonstrate) {
		model.setOtherRefDemonstrate(otherRefDemonstrate);
	}

	/**
	 * Sets the other ref ensure plan of this acc medi lab management req.
	 *
	 * @param otherRefEnsurePlan the other ref ensure plan of this acc medi lab management req
	 */
	@Override
	public void setOtherRefEnsurePlan(String otherRefEnsurePlan) {
		model.setOtherRefEnsurePlan(otherRefEnsurePlan);
	}

	/**
	 * Sets the other ref fulfil of this acc medi lab management req.
	 *
	 * @param otherRefFulfil the other ref fulfil of this acc medi lab management req
	 */
	@Override
	public void setOtherRefFulfil(String otherRefFulfil) {
		model.setOtherRefFulfil(otherRefFulfil);
	}

	/**
	 * Sets the other ref lab operate of this acc medi lab management req.
	 *
	 * @param otherRefLabOperate the other ref lab operate of this acc medi lab management req
	 */
	@Override
	public void setOtherRefLabOperate(String otherRefLabOperate) {
		model.setOtherRefLabOperate(otherRefLabOperate);
	}

	/**
	 * Sets the other ref legible rec of this acc medi lab management req.
	 *
	 * @param otherRefLegibleRec the other ref legible rec of this acc medi lab management req
	 */
	@Override
	public void setOtherRefLegibleRec(String otherRefLegibleRec) {
		model.setOtherRefLegibleRec(otherRefLegibleRec);
	}

	/**
	 * Sets the other ref opportunity of this acc medi lab management req.
	 *
	 * @param otherRefOpportunity the other ref opportunity of this acc medi lab management req
	 */
	@Override
	public void setOtherRefOpportunity(String otherRefOpportunity) {
		model.setOtherRefOpportunity(otherRefOpportunity);
	}

	/**
	 * Sets the other ref planned of this acc medi lab management req.
	 *
	 * @param otherRefPlanned the other ref planned of this acc medi lab management req
	 */
	@Override
	public void setOtherRefPlanned(String otherRefPlanned) {
		model.setOtherRefPlanned(otherRefPlanned);
	}

	/**
	 * Sets the other ref procedure of this acc medi lab management req.
	 *
	 * @param otherRefProcedure the other ref procedure of this acc medi lab management req
	 */
	@Override
	public void setOtherRefProcedure(String otherRefProcedure) {
		model.setOtherRefProcedure(otherRefProcedure);
	}

	/**
	 * Sets the other ref process of this acc medi lab management req.
	 *
	 * @param otherRefProcess the other ref process of this acc medi lab management req
	 */
	@Override
	public void setOtherRefProcess(String otherRefProcess) {
		model.setOtherRefProcess(otherRefProcess);
	}

	/**
	 * Sets the other ref requirement of this acc medi lab management req.
	 *
	 * @param otherRefRequirement the other ref requirement of this acc medi lab management req
	 */
	@Override
	public void setOtherRefRequirement(String otherRefRequirement) {
		model.setOtherRefRequirement(otherRefRequirement);
	}

	/**
	 * Sets the other ref selection of this acc medi lab management req.
	 *
	 * @param otherRefSelection the other ref selection of this acc medi lab management req
	 */
	@Override
	public void setOtherRefSelection(String otherRefSelection) {
		model.setOtherRefSelection(otherRefSelection);
	}

	/**
	 * Sets the person aware of this acc medi lab management req.
	 *
	 * @param personAware the person aware of this acc medi lab management req
	 */
	@Override
	public void setPersonAware(String personAware) {
		model.setPersonAware(personAware);
	}

	/**
	 * Sets the planned manage review of this acc medi lab management req.
	 *
	 * @param plannedManageReview the planned manage review of this acc medi lab management req
	 */
	@Override
	public void setPlannedManageReview(String plannedManageReview) {
		model.setPlannedManageReview(plannedManageReview);
	}

	/**
	 * Sets the policies acknowledged of this acc medi lab management req.
	 *
	 * @param policiesAcknowledged the policies acknowledged of this acc medi lab management req
	 */
	@Override
	public void setPoliciesAcknowledged(String policiesAcknowledged) {
		model.setPoliciesAcknowledged(policiesAcknowledged);
	}

	/**
	 * Sets the post exam reliabilty of this acc medi lab management req.
	 *
	 * @param postExamReliabilty the post exam reliabilty of this acc medi lab management req
	 */
	@Override
	public void setPostExamReliabilty(String postExamReliabilty) {
		model.setPostExamReliabilty(postExamReliabilty);
	}

	/**
	 * Sets the prevent res release of this acc medi lab management req.
	 *
	 * @param preventResRelease the prevent res release of this acc medi lab management req
	 */
	@Override
	public void setPreventResRelease(String preventResRelease) {
		model.setPreventResRelease(preventResRelease);
	}

	/**
	 * Sets the primary key of this acc medi lab management req.
	 *
	 * @param primaryKey the primary key of this acc medi lab management req
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the procedure for selection of this acc medi lab management req.
	 *
	 * @param procedureForSelection the procedure for selection of this acc medi lab management req
	 */
	@Override
	public void setProcedureForSelection(String procedureForSelection) {
		model.setProcedureForSelection(procedureForSelection);
	}

	/**
	 * Sets the procedures in place of this acc medi lab management req.
	 *
	 * @param proceduresInPlace the procedures in place of this acc medi lab management req
	 */
	@Override
	public void setProceduresInPlace(String proceduresInPlace) {
		model.setProceduresInPlace(proceduresInPlace);
	}

	/**
	 * Sets the process for selection of this acc medi lab management req.
	 *
	 * @param processForSelection the process for selection of this acc medi lab management req
	 */
	@Override
	public void setProcessForSelection(String processForSelection) {
		model.setProcessForSelection(processForSelection);
	}

	/**
	 * Sets the process in place of this acc medi lab management req.
	 *
	 * @param processInPlace the process in place of this acc medi lab management req
	 */
	@Override
	public void setProcessInPlace(String processInPlace) {
		model.setProcessInPlace(processInPlace);
	}

	/**
	 * Sets the proficency testing of this acc medi lab management req.
	 *
	 * @param proficencyTesting the proficency testing of this acc medi lab management req
	 */
	@Override
	public void setProficencyTesting(String proficencyTesting) {
		model.setProficencyTesting(proficencyTesting);
	}

	/**
	 * Sets the q m ref authorize of this acc medi lab management req.
	 *
	 * @param qMRefAuthorize the q m ref authorize of this acc medi lab management req
	 */
	@Override
	public void setQMRefAuthorize(String qMRefAuthorize) {
		model.setQMRefAuthorize(qMRefAuthorize);
	}

	/**
	 * Sets the q m ref control doc of this acc medi lab management req.
	 *
	 * @param qMRefControlDoc the q m ref control doc of this acc medi lab management req
	 */
	@Override
	public void setQMRefControlDoc(String qMRefControlDoc) {
		model.setQMRefControlDoc(qMRefControlDoc);
	}

	/**
	 * Sets the q m reflab estab of this acc medi lab management req.
	 *
	 * @param qMReflabEstab the q m reflab estab of this acc medi lab management req
	 */
	@Override
	public void setQMReflabEstab(String qMReflabEstab) {
		model.setQMReflabEstab(qMReflabEstab);
	}

	/**
	 * Sets the q m ref management of this acc medi lab management req.
	 *
	 * @param qMRefManagement the q m ref management of this acc medi lab management req
	 */
	@Override
	public void setQMRefManagement(String qMRefManagement) {
		model.setQMRefManagement(qMRefManagement);
	}

	/**
	 * Sets the q m ref person of this acc medi lab management req.
	 *
	 * @param qMRefPerson the q m ref person of this acc medi lab management req
	 */
	@Override
	public void setQMRefPerson(String qMRefPerson) {
		model.setQMRefPerson(qMRefPerson);
	}

	/**
	 * Sets the q m ref personnel of this acc medi lab management req.
	 *
	 * @param qMRefPersonnel the q m ref personnel of this acc medi lab management req
	 */
	@Override
	public void setQMRefPersonnel(String qMRefPersonnel) {
		model.setQMRefPersonnel(qMRefPersonnel);
	}

	/**
	 * Sets the q m ref policies of this acc medi lab management req.
	 *
	 * @param qMRefPolicies the q m ref policies of this acc medi lab management req
	 */
	@Override
	public void setQMRefPolicies(String qMRefPolicies) {
		model.setQMRefPolicies(qMRefPolicies);
	}

	/**
	 * Sets the q m ref risks of this acc medi lab management req.
	 *
	 * @param qMRefRisks the q m ref risks of this acc medi lab management req
	 */
	@Override
	public void setQMRefRisks(String qMRefRisks) {
		model.setQMRefRisks(qMRefRisks);
	}

	/**
	 * Sets the reported accurately of this acc medi lab management req.
	 *
	 * @param reportedAccurately the reported accurately of this acc medi lab management req
	 */
	@Override
	public void setReportedAccurately(String reportedAccurately) {
		model.setReportedAccurately(reportedAccurately);
	}

	/**
	 * Sets the responsiblity specified of this acc medi lab management req.
	 *
	 * @param responsiblitySpecified the responsiblity specified of this acc medi lab management req
	 */
	@Override
	public void setResponsiblitySpecified(String responsiblitySpecified) {
		model.setResponsiblitySpecified(responsiblitySpecified);
	}

	/**
	 * Sets the uncertainity review of this acc medi lab management req.
	 *
	 * @param uncertainityReview the uncertainity review of this acc medi lab management req
	 */
	@Override
	public void setUncertainityReview(String uncertainityReview) {
		model.setUncertainityReview(uncertainityReview);
	}

	/**
	 * Sets the use exam methods of this acc medi lab management req.
	 *
	 * @param useExamMethods the use exam methods of this acc medi lab management req
	 */
	@Override
	public void setUseExamMethods(String useExamMethods) {
		model.setUseExamMethods(useExamMethods);
	}

	/**
	 * Sets the user ID of this acc medi lab management req.
	 *
	 * @param userId the user ID of this acc medi lab management req
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acc medi lab management req.
	 *
	 * @param userName the user name of this acc medi lab management req
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acc medi lab management req.
	 *
	 * @param userUuid the user uuid of this acc medi lab management req
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acc medi lab management req.
	 *
	 * @param uuid the uuid of this acc medi lab management req
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the validate exam of this acc medi lab management req.
	 *
	 * @param validateExam the validate exam of this acc medi lab management req
	 */
	@Override
	public void setValidateExam(String validateExam) {
		model.setValidateExam(validateExam);
	}

	/**
	 * Sets the verify reagents of this acc medi lab management req.
	 *
	 * @param verifyReagents the verify reagents of this acc medi lab management req
	 */
	@Override
	public void setVerifyReagents(String verifyReagents) {
		model.setVerifyReagents(verifyReagents);
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
	protected AccMediLabManagementReqWrapper wrap(
		AccMediLabManagementReq accMediLabManagementReq) {

		return new AccMediLabManagementReqWrapper(accMediLabManagementReq);
	}

}