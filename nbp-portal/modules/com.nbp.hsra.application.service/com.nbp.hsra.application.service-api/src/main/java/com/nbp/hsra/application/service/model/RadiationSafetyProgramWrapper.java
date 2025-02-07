/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link RadiationSafetyProgram}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadiationSafetyProgram
 * @generated
 */
public class RadiationSafetyProgramWrapper
	extends BaseModelWrapper<RadiationSafetyProgram>
	implements ModelWrapper<RadiationSafetyProgram>, RadiationSafetyProgram {

	public RadiationSafetyProgramWrapper(
		RadiationSafetyProgram radiationSafetyProgram) {

		super(radiationSafetyProgram);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"radiationSafetyProgramId", getRadiationSafetyProgramId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nuclearRsoName", getNuclearRsoName());
		attributes.put("nuclearRsoTitle", getNuclearRsoTitle());
		attributes.put("nuclearRsoTeleNo", getNuclearRsoTeleNo());
		attributes.put("nuclearRsoExt", getNuclearRsoExt());
		attributes.put("nuclearRsoFax", getNuclearRsoFax());
		attributes.put("nuclearRsoEmail", getNuclearRsoEmail());
		attributes.put("rsoDetails", getRsoDetails());
		attributes.put("qualifiedExpertName", getQualifiedExpertName());
		attributes.put("qualifiedExpertTitle", getQualifiedExpertTitle());
		attributes.put("qualifiedExpertTele", getQualifiedExpertTele());
		attributes.put("qualifiedExpertExt", getQualifiedExpertExt());
		attributes.put("qualifiedExpertFax", getQualifiedExpertFax());
		attributes.put("qualifiedExpertEmail", getQualifiedExpertEmail());
		attributes.put("qualifiedExpertRegstNo", getQualifiedExpertRegstNo());
		attributes.put("qualifiedExpertDate", getQualifiedExpertDate());
		attributes.put("qualifiedDetails", getQualifiedDetails());
		attributes.put("applicantName", getApplicantName());
		attributes.put("applicantTitle", getApplicantTitle());
		attributes.put("otherLimitationAuth", getOtherLimitationAuth());
		attributes.put("otherDate", getOtherDate());
		attributes.put("classifiWorkersList", getClassifiWorkersList());
		attributes.put("respiPleaseSpecify", getRespiPleaseSpecify());
		attributes.put("tongsPleaseSpecify", getTongsPleaseSpecify());
		attributes.put("scopeOfActivities", getScopeOfActivities());
		attributes.put("managementSystem", getManagementSystem());
		attributes.put("workerRecordings", getWorkerRecordings());
		attributes.put("categoriesLicence", getCategoriesLicence());
		attributes.put("renewalsSummary", getRenewalsSummary());
		attributes.put("constraintsLimits", getConstraintsLimits());
		attributes.put("equipmentMonitoring", getEquipmentMonitoring());
		attributes.put("areasControl", getAreasControl());
		attributes.put("radioactiveSources", getRadioactiveSources());
		attributes.put("radiationiInstruments", getRadiationiInstruments());
		attributes.put("healthWorkers", getHealthWorkers());
		attributes.put("investigationLevel", getInvestigationLevel());
		attributes.put("policyDetails", getPolicyDetails());
		attributes.put("securityAccess", getSecurityAccess());
		attributes.put("raditionSources", getRaditionSources());
		attributes.put("workerTraining", getWorkerTraining());
		attributes.put("publicControl", getPublicControl());
		attributes.put("managementSources", getManagementSources());
		attributes.put("emergencyProcedure", getEmergencyProcedure());
		attributes.put("licenceLocation", getLicenceLocation());
		attributes.put("achievableProgram", getAchievableProgram());
		attributes.put("leakedTestingSources", getLeakedTestingSources());
		attributes.put("transferSources", getTransferSources());
		attributes.put("nuclearMaterials", getNuclearMaterials());
		attributes.put("transportPackaging", getTransportPackaging());
		attributes.put("internalReview", getInternalReview());
		attributes.put("sourcesActivities", getSourcesActivities());
		attributes.put(
			"individualProtectiveEquipment",
			getIndividualProtectiveEquipment());
		attributes.put("ResProPleaseSpecify", getResProPleaseSpecify());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long radiationSafetyProgramId = (Long)attributes.get(
			"radiationSafetyProgramId");

		if (radiationSafetyProgramId != null) {
			setRadiationSafetyProgramId(radiationSafetyProgramId);
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

		String nuclearRsoName = (String)attributes.get("nuclearRsoName");

		if (nuclearRsoName != null) {
			setNuclearRsoName(nuclearRsoName);
		}

		String nuclearRsoTitle = (String)attributes.get("nuclearRsoTitle");

		if (nuclearRsoTitle != null) {
			setNuclearRsoTitle(nuclearRsoTitle);
		}

		String nuclearRsoTeleNo = (String)attributes.get("nuclearRsoTeleNo");

		if (nuclearRsoTeleNo != null) {
			setNuclearRsoTeleNo(nuclearRsoTeleNo);
		}

		String nuclearRsoExt = (String)attributes.get("nuclearRsoExt");

		if (nuclearRsoExt != null) {
			setNuclearRsoExt(nuclearRsoExt);
		}

		String nuclearRsoFax = (String)attributes.get("nuclearRsoFax");

		if (nuclearRsoFax != null) {
			setNuclearRsoFax(nuclearRsoFax);
		}

		String nuclearRsoEmail = (String)attributes.get("nuclearRsoEmail");

		if (nuclearRsoEmail != null) {
			setNuclearRsoEmail(nuclearRsoEmail);
		}

		String rsoDetails = (String)attributes.get("rsoDetails");

		if (rsoDetails != null) {
			setRsoDetails(rsoDetails);
		}

		String qualifiedExpertName = (String)attributes.get(
			"qualifiedExpertName");

		if (qualifiedExpertName != null) {
			setQualifiedExpertName(qualifiedExpertName);
		}

		String qualifiedExpertTitle = (String)attributes.get(
			"qualifiedExpertTitle");

		if (qualifiedExpertTitle != null) {
			setQualifiedExpertTitle(qualifiedExpertTitle);
		}

		String qualifiedExpertTele = (String)attributes.get(
			"qualifiedExpertTele");

		if (qualifiedExpertTele != null) {
			setQualifiedExpertTele(qualifiedExpertTele);
		}

		String qualifiedExpertExt = (String)attributes.get(
			"qualifiedExpertExt");

		if (qualifiedExpertExt != null) {
			setQualifiedExpertExt(qualifiedExpertExt);
		}

		String qualifiedExpertFax = (String)attributes.get(
			"qualifiedExpertFax");

		if (qualifiedExpertFax != null) {
			setQualifiedExpertFax(qualifiedExpertFax);
		}

		String qualifiedExpertEmail = (String)attributes.get(
			"qualifiedExpertEmail");

		if (qualifiedExpertEmail != null) {
			setQualifiedExpertEmail(qualifiedExpertEmail);
		}

		String qualifiedExpertRegstNo = (String)attributes.get(
			"qualifiedExpertRegstNo");

		if (qualifiedExpertRegstNo != null) {
			setQualifiedExpertRegstNo(qualifiedExpertRegstNo);
		}

		Date qualifiedExpertDate = (Date)attributes.get("qualifiedExpertDate");

		if (qualifiedExpertDate != null) {
			setQualifiedExpertDate(qualifiedExpertDate);
		}

		String qualifiedDetails = (String)attributes.get("qualifiedDetails");

		if (qualifiedDetails != null) {
			setQualifiedDetails(qualifiedDetails);
		}

		String applicantName = (String)attributes.get("applicantName");

		if (applicantName != null) {
			setApplicantName(applicantName);
		}

		String applicantTitle = (String)attributes.get("applicantTitle");

		if (applicantTitle != null) {
			setApplicantTitle(applicantTitle);
		}

		String otherLimitationAuth = (String)attributes.get(
			"otherLimitationAuth");

		if (otherLimitationAuth != null) {
			setOtherLimitationAuth(otherLimitationAuth);
		}

		Date otherDate = (Date)attributes.get("otherDate");

		if (otherDate != null) {
			setOtherDate(otherDate);
		}

		String classifiWorkersList = (String)attributes.get(
			"classifiWorkersList");

		if (classifiWorkersList != null) {
			setClassifiWorkersList(classifiWorkersList);
		}

		String respiPleaseSpecify = (String)attributes.get(
			"respiPleaseSpecify");

		if (respiPleaseSpecify != null) {
			setRespiPleaseSpecify(respiPleaseSpecify);
		}

		String tongsPleaseSpecify = (String)attributes.get(
			"tongsPleaseSpecify");

		if (tongsPleaseSpecify != null) {
			setTongsPleaseSpecify(tongsPleaseSpecify);
		}

		String scopeOfActivities = (String)attributes.get("scopeOfActivities");

		if (scopeOfActivities != null) {
			setScopeOfActivities(scopeOfActivities);
		}

		String managementSystem = (String)attributes.get("managementSystem");

		if (managementSystem != null) {
			setManagementSystem(managementSystem);
		}

		String workerRecordings = (String)attributes.get("workerRecordings");

		if (workerRecordings != null) {
			setWorkerRecordings(workerRecordings);
		}

		String categoriesLicence = (String)attributes.get("categoriesLicence");

		if (categoriesLicence != null) {
			setCategoriesLicence(categoriesLicence);
		}

		String renewalsSummary = (String)attributes.get("renewalsSummary");

		if (renewalsSummary != null) {
			setRenewalsSummary(renewalsSummary);
		}

		String constraintsLimits = (String)attributes.get("constraintsLimits");

		if (constraintsLimits != null) {
			setConstraintsLimits(constraintsLimits);
		}

		String equipmentMonitoring = (String)attributes.get(
			"equipmentMonitoring");

		if (equipmentMonitoring != null) {
			setEquipmentMonitoring(equipmentMonitoring);
		}

		String areasControl = (String)attributes.get("areasControl");

		if (areasControl != null) {
			setAreasControl(areasControl);
		}

		String radioactiveSources = (String)attributes.get(
			"radioactiveSources");

		if (radioactiveSources != null) {
			setRadioactiveSources(radioactiveSources);
		}

		String radiationiInstruments = (String)attributes.get(
			"radiationiInstruments");

		if (radiationiInstruments != null) {
			setRadiationiInstruments(radiationiInstruments);
		}

		String healthWorkers = (String)attributes.get("healthWorkers");

		if (healthWorkers != null) {
			setHealthWorkers(healthWorkers);
		}

		String investigationLevel = (String)attributes.get(
			"investigationLevel");

		if (investigationLevel != null) {
			setInvestigationLevel(investigationLevel);
		}

		String policyDetails = (String)attributes.get("policyDetails");

		if (policyDetails != null) {
			setPolicyDetails(policyDetails);
		}

		String securityAccess = (String)attributes.get("securityAccess");

		if (securityAccess != null) {
			setSecurityAccess(securityAccess);
		}

		String raditionSources = (String)attributes.get("raditionSources");

		if (raditionSources != null) {
			setRaditionSources(raditionSources);
		}

		String workerTraining = (String)attributes.get("workerTraining");

		if (workerTraining != null) {
			setWorkerTraining(workerTraining);
		}

		String publicControl = (String)attributes.get("publicControl");

		if (publicControl != null) {
			setPublicControl(publicControl);
		}

		String managementSources = (String)attributes.get("managementSources");

		if (managementSources != null) {
			setManagementSources(managementSources);
		}

		String emergencyProcedure = (String)attributes.get(
			"emergencyProcedure");

		if (emergencyProcedure != null) {
			setEmergencyProcedure(emergencyProcedure);
		}

		String licenceLocation = (String)attributes.get("licenceLocation");

		if (licenceLocation != null) {
			setLicenceLocation(licenceLocation);
		}

		String achievableProgram = (String)attributes.get("achievableProgram");

		if (achievableProgram != null) {
			setAchievableProgram(achievableProgram);
		}

		String leakedTestingSources = (String)attributes.get(
			"leakedTestingSources");

		if (leakedTestingSources != null) {
			setLeakedTestingSources(leakedTestingSources);
		}

		String transferSources = (String)attributes.get("transferSources");

		if (transferSources != null) {
			setTransferSources(transferSources);
		}

		String nuclearMaterials = (String)attributes.get("nuclearMaterials");

		if (nuclearMaterials != null) {
			setNuclearMaterials(nuclearMaterials);
		}

		String transportPackaging = (String)attributes.get(
			"transportPackaging");

		if (transportPackaging != null) {
			setTransportPackaging(transportPackaging);
		}

		String internalReview = (String)attributes.get("internalReview");

		if (internalReview != null) {
			setInternalReview(internalReview);
		}

		String sourcesActivities = (String)attributes.get("sourcesActivities");

		if (sourcesActivities != null) {
			setSourcesActivities(sourcesActivities);
		}

		String individualProtectiveEquipment = (String)attributes.get(
			"individualProtectiveEquipment");

		if (individualProtectiveEquipment != null) {
			setIndividualProtectiveEquipment(individualProtectiveEquipment);
		}

		String ResProPleaseSpecify = (String)attributes.get(
			"ResProPleaseSpecify");

		if (ResProPleaseSpecify != null) {
			setResProPleaseSpecify(ResProPleaseSpecify);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public RadiationSafetyProgram cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the achievable program of this radiation safety program.
	 *
	 * @return the achievable program of this radiation safety program
	 */
	@Override
	public String getAchievableProgram() {
		return model.getAchievableProgram();
	}

	/**
	 * Returns the applicant name of this radiation safety program.
	 *
	 * @return the applicant name of this radiation safety program
	 */
	@Override
	public String getApplicantName() {
		return model.getApplicantName();
	}

	/**
	 * Returns the applicant title of this radiation safety program.
	 *
	 * @return the applicant title of this radiation safety program
	 */
	@Override
	public String getApplicantTitle() {
		return model.getApplicantTitle();
	}

	/**
	 * Returns the areas control of this radiation safety program.
	 *
	 * @return the areas control of this radiation safety program
	 */
	@Override
	public String getAreasControl() {
		return model.getAreasControl();
	}

	/**
	 * Returns the categories licence of this radiation safety program.
	 *
	 * @return the categories licence of this radiation safety program
	 */
	@Override
	public String getCategoriesLicence() {
		return model.getCategoriesLicence();
	}

	/**
	 * Returns the classifi workers list of this radiation safety program.
	 *
	 * @return the classifi workers list of this radiation safety program
	 */
	@Override
	public String getClassifiWorkersList() {
		return model.getClassifiWorkersList();
	}

	/**
	 * Returns the company ID of this radiation safety program.
	 *
	 * @return the company ID of this radiation safety program
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the constraints limits of this radiation safety program.
	 *
	 * @return the constraints limits of this radiation safety program
	 */
	@Override
	public String getConstraintsLimits() {
		return model.getConstraintsLimits();
	}

	/**
	 * Returns the create date of this radiation safety program.
	 *
	 * @return the create date of this radiation safety program
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the emergency procedure of this radiation safety program.
	 *
	 * @return the emergency procedure of this radiation safety program
	 */
	@Override
	public String getEmergencyProcedure() {
		return model.getEmergencyProcedure();
	}

	/**
	 * Returns the equipment monitoring of this radiation safety program.
	 *
	 * @return the equipment monitoring of this radiation safety program
	 */
	@Override
	public String getEquipmentMonitoring() {
		return model.getEquipmentMonitoring();
	}

	/**
	 * Returns the group ID of this radiation safety program.
	 *
	 * @return the group ID of this radiation safety program
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the health workers of this radiation safety program.
	 *
	 * @return the health workers of this radiation safety program
	 */
	@Override
	public String getHealthWorkers() {
		return model.getHealthWorkers();
	}

	/**
	 * Returns the hsra application ID of this radiation safety program.
	 *
	 * @return the hsra application ID of this radiation safety program
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the individual protective equipment of this radiation safety program.
	 *
	 * @return the individual protective equipment of this radiation safety program
	 */
	@Override
	public String getIndividualProtectiveEquipment() {
		return model.getIndividualProtectiveEquipment();
	}

	/**
	 * Returns the internal review of this radiation safety program.
	 *
	 * @return the internal review of this radiation safety program
	 */
	@Override
	public String getInternalReview() {
		return model.getInternalReview();
	}

	/**
	 * Returns the investigation level of this radiation safety program.
	 *
	 * @return the investigation level of this radiation safety program
	 */
	@Override
	public String getInvestigationLevel() {
		return model.getInvestigationLevel();
	}

	/**
	 * Returns the leaked testing sources of this radiation safety program.
	 *
	 * @return the leaked testing sources of this radiation safety program
	 */
	@Override
	public String getLeakedTestingSources() {
		return model.getLeakedTestingSources();
	}

	/**
	 * Returns the licence location of this radiation safety program.
	 *
	 * @return the licence location of this radiation safety program
	 */
	@Override
	public String getLicenceLocation() {
		return model.getLicenceLocation();
	}

	/**
	 * Returns the management sources of this radiation safety program.
	 *
	 * @return the management sources of this radiation safety program
	 */
	@Override
	public String getManagementSources() {
		return model.getManagementSources();
	}

	/**
	 * Returns the management system of this radiation safety program.
	 *
	 * @return the management system of this radiation safety program
	 */
	@Override
	public String getManagementSystem() {
		return model.getManagementSystem();
	}

	/**
	 * Returns the modified date of this radiation safety program.
	 *
	 * @return the modified date of this radiation safety program
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nuclear materials of this radiation safety program.
	 *
	 * @return the nuclear materials of this radiation safety program
	 */
	@Override
	public String getNuclearMaterials() {
		return model.getNuclearMaterials();
	}

	/**
	 * Returns the nuclear rso email of this radiation safety program.
	 *
	 * @return the nuclear rso email of this radiation safety program
	 */
	@Override
	public String getNuclearRsoEmail() {
		return model.getNuclearRsoEmail();
	}

	/**
	 * Returns the nuclear rso ext of this radiation safety program.
	 *
	 * @return the nuclear rso ext of this radiation safety program
	 */
	@Override
	public String getNuclearRsoExt() {
		return model.getNuclearRsoExt();
	}

	/**
	 * Returns the nuclear rso fax of this radiation safety program.
	 *
	 * @return the nuclear rso fax of this radiation safety program
	 */
	@Override
	public String getNuclearRsoFax() {
		return model.getNuclearRsoFax();
	}

	/**
	 * Returns the nuclear rso name of this radiation safety program.
	 *
	 * @return the nuclear rso name of this radiation safety program
	 */
	@Override
	public String getNuclearRsoName() {
		return model.getNuclearRsoName();
	}

	/**
	 * Returns the nuclear rso tele no of this radiation safety program.
	 *
	 * @return the nuclear rso tele no of this radiation safety program
	 */
	@Override
	public String getNuclearRsoTeleNo() {
		return model.getNuclearRsoTeleNo();
	}

	/**
	 * Returns the nuclear rso title of this radiation safety program.
	 *
	 * @return the nuclear rso title of this radiation safety program
	 */
	@Override
	public String getNuclearRsoTitle() {
		return model.getNuclearRsoTitle();
	}

	/**
	 * Returns the other date of this radiation safety program.
	 *
	 * @return the other date of this radiation safety program
	 */
	@Override
	public Date getOtherDate() {
		return model.getOtherDate();
	}

	/**
	 * Returns the other limitation auth of this radiation safety program.
	 *
	 * @return the other limitation auth of this radiation safety program
	 */
	@Override
	public String getOtherLimitationAuth() {
		return model.getOtherLimitationAuth();
	}

	/**
	 * Returns the policy details of this radiation safety program.
	 *
	 * @return the policy details of this radiation safety program
	 */
	@Override
	public String getPolicyDetails() {
		return model.getPolicyDetails();
	}

	/**
	 * Returns the primary key of this radiation safety program.
	 *
	 * @return the primary key of this radiation safety program
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the public control of this radiation safety program.
	 *
	 * @return the public control of this radiation safety program
	 */
	@Override
	public String getPublicControl() {
		return model.getPublicControl();
	}

	/**
	 * Returns the qualified details of this radiation safety program.
	 *
	 * @return the qualified details of this radiation safety program
	 */
	@Override
	public String getQualifiedDetails() {
		return model.getQualifiedDetails();
	}

	/**
	 * Returns the qualified expert date of this radiation safety program.
	 *
	 * @return the qualified expert date of this radiation safety program
	 */
	@Override
	public Date getQualifiedExpertDate() {
		return model.getQualifiedExpertDate();
	}

	/**
	 * Returns the qualified expert email of this radiation safety program.
	 *
	 * @return the qualified expert email of this radiation safety program
	 */
	@Override
	public String getQualifiedExpertEmail() {
		return model.getQualifiedExpertEmail();
	}

	/**
	 * Returns the qualified expert ext of this radiation safety program.
	 *
	 * @return the qualified expert ext of this radiation safety program
	 */
	@Override
	public String getQualifiedExpertExt() {
		return model.getQualifiedExpertExt();
	}

	/**
	 * Returns the qualified expert fax of this radiation safety program.
	 *
	 * @return the qualified expert fax of this radiation safety program
	 */
	@Override
	public String getQualifiedExpertFax() {
		return model.getQualifiedExpertFax();
	}

	/**
	 * Returns the qualified expert name of this radiation safety program.
	 *
	 * @return the qualified expert name of this radiation safety program
	 */
	@Override
	public String getQualifiedExpertName() {
		return model.getQualifiedExpertName();
	}

	/**
	 * Returns the qualified expert regst no of this radiation safety program.
	 *
	 * @return the qualified expert regst no of this radiation safety program
	 */
	@Override
	public String getQualifiedExpertRegstNo() {
		return model.getQualifiedExpertRegstNo();
	}

	/**
	 * Returns the qualified expert tele of this radiation safety program.
	 *
	 * @return the qualified expert tele of this radiation safety program
	 */
	@Override
	public String getQualifiedExpertTele() {
		return model.getQualifiedExpertTele();
	}

	/**
	 * Returns the qualified expert title of this radiation safety program.
	 *
	 * @return the qualified expert title of this radiation safety program
	 */
	@Override
	public String getQualifiedExpertTitle() {
		return model.getQualifiedExpertTitle();
	}

	/**
	 * Returns the radiationi instruments of this radiation safety program.
	 *
	 * @return the radiationi instruments of this radiation safety program
	 */
	@Override
	public String getRadiationiInstruments() {
		return model.getRadiationiInstruments();
	}

	/**
	 * Returns the radiation safety program ID of this radiation safety program.
	 *
	 * @return the radiation safety program ID of this radiation safety program
	 */
	@Override
	public long getRadiationSafetyProgramId() {
		return model.getRadiationSafetyProgramId();
	}

	/**
	 * Returns the radioactive sources of this radiation safety program.
	 *
	 * @return the radioactive sources of this radiation safety program
	 */
	@Override
	public String getRadioactiveSources() {
		return model.getRadioactiveSources();
	}

	/**
	 * Returns the radition sources of this radiation safety program.
	 *
	 * @return the radition sources of this radiation safety program
	 */
	@Override
	public String getRaditionSources() {
		return model.getRaditionSources();
	}

	/**
	 * Returns the renewals summary of this radiation safety program.
	 *
	 * @return the renewals summary of this radiation safety program
	 */
	@Override
	public String getRenewalsSummary() {
		return model.getRenewalsSummary();
	}

	/**
	 * Returns the respi please specify of this radiation safety program.
	 *
	 * @return the respi please specify of this radiation safety program
	 */
	@Override
	public String getRespiPleaseSpecify() {
		return model.getRespiPleaseSpecify();
	}

	/**
	 * Returns the res pro please specify of this radiation safety program.
	 *
	 * @return the res pro please specify of this radiation safety program
	 */
	@Override
	public String getResProPleaseSpecify() {
		return model.getResProPleaseSpecify();
	}

	/**
	 * Returns the rso details of this radiation safety program.
	 *
	 * @return the rso details of this radiation safety program
	 */
	@Override
	public String getRsoDetails() {
		return model.getRsoDetails();
	}

	/**
	 * Returns the scope of activities of this radiation safety program.
	 *
	 * @return the scope of activities of this radiation safety program
	 */
	@Override
	public String getScopeOfActivities() {
		return model.getScopeOfActivities();
	}

	/**
	 * Returns the security access of this radiation safety program.
	 *
	 * @return the security access of this radiation safety program
	 */
	@Override
	public String getSecurityAccess() {
		return model.getSecurityAccess();
	}

	/**
	 * Returns the sources activities of this radiation safety program.
	 *
	 * @return the sources activities of this radiation safety program
	 */
	@Override
	public String getSourcesActivities() {
		return model.getSourcesActivities();
	}

	/**
	 * Returns the tongs please specify of this radiation safety program.
	 *
	 * @return the tongs please specify of this radiation safety program
	 */
	@Override
	public String getTongsPleaseSpecify() {
		return model.getTongsPleaseSpecify();
	}

	/**
	 * Returns the transfer sources of this radiation safety program.
	 *
	 * @return the transfer sources of this radiation safety program
	 */
	@Override
	public String getTransferSources() {
		return model.getTransferSources();
	}

	/**
	 * Returns the transport packaging of this radiation safety program.
	 *
	 * @return the transport packaging of this radiation safety program
	 */
	@Override
	public String getTransportPackaging() {
		return model.getTransportPackaging();
	}

	/**
	 * Returns the user ID of this radiation safety program.
	 *
	 * @return the user ID of this radiation safety program
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this radiation safety program.
	 *
	 * @return the user name of this radiation safety program
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this radiation safety program.
	 *
	 * @return the user uuid of this radiation safety program
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the worker recordings of this radiation safety program.
	 *
	 * @return the worker recordings of this radiation safety program
	 */
	@Override
	public String getWorkerRecordings() {
		return model.getWorkerRecordings();
	}

	/**
	 * Returns the worker training of this radiation safety program.
	 *
	 * @return the worker training of this radiation safety program
	 */
	@Override
	public String getWorkerTraining() {
		return model.getWorkerTraining();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the achievable program of this radiation safety program.
	 *
	 * @param achievableProgram the achievable program of this radiation safety program
	 */
	@Override
	public void setAchievableProgram(String achievableProgram) {
		model.setAchievableProgram(achievableProgram);
	}

	/**
	 * Sets the applicant name of this radiation safety program.
	 *
	 * @param applicantName the applicant name of this radiation safety program
	 */
	@Override
	public void setApplicantName(String applicantName) {
		model.setApplicantName(applicantName);
	}

	/**
	 * Sets the applicant title of this radiation safety program.
	 *
	 * @param applicantTitle the applicant title of this radiation safety program
	 */
	@Override
	public void setApplicantTitle(String applicantTitle) {
		model.setApplicantTitle(applicantTitle);
	}

	/**
	 * Sets the areas control of this radiation safety program.
	 *
	 * @param areasControl the areas control of this radiation safety program
	 */
	@Override
	public void setAreasControl(String areasControl) {
		model.setAreasControl(areasControl);
	}

	/**
	 * Sets the categories licence of this radiation safety program.
	 *
	 * @param categoriesLicence the categories licence of this radiation safety program
	 */
	@Override
	public void setCategoriesLicence(String categoriesLicence) {
		model.setCategoriesLicence(categoriesLicence);
	}

	/**
	 * Sets the classifi workers list of this radiation safety program.
	 *
	 * @param classifiWorkersList the classifi workers list of this radiation safety program
	 */
	@Override
	public void setClassifiWorkersList(String classifiWorkersList) {
		model.setClassifiWorkersList(classifiWorkersList);
	}

	/**
	 * Sets the company ID of this radiation safety program.
	 *
	 * @param companyId the company ID of this radiation safety program
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the constraints limits of this radiation safety program.
	 *
	 * @param constraintsLimits the constraints limits of this radiation safety program
	 */
	@Override
	public void setConstraintsLimits(String constraintsLimits) {
		model.setConstraintsLimits(constraintsLimits);
	}

	/**
	 * Sets the create date of this radiation safety program.
	 *
	 * @param createDate the create date of this radiation safety program
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the emergency procedure of this radiation safety program.
	 *
	 * @param emergencyProcedure the emergency procedure of this radiation safety program
	 */
	@Override
	public void setEmergencyProcedure(String emergencyProcedure) {
		model.setEmergencyProcedure(emergencyProcedure);
	}

	/**
	 * Sets the equipment monitoring of this radiation safety program.
	 *
	 * @param equipmentMonitoring the equipment monitoring of this radiation safety program
	 */
	@Override
	public void setEquipmentMonitoring(String equipmentMonitoring) {
		model.setEquipmentMonitoring(equipmentMonitoring);
	}

	/**
	 * Sets the group ID of this radiation safety program.
	 *
	 * @param groupId the group ID of this radiation safety program
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the health workers of this radiation safety program.
	 *
	 * @param healthWorkers the health workers of this radiation safety program
	 */
	@Override
	public void setHealthWorkers(String healthWorkers) {
		model.setHealthWorkers(healthWorkers);
	}

	/**
	 * Sets the hsra application ID of this radiation safety program.
	 *
	 * @param hsraApplicationId the hsra application ID of this radiation safety program
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the individual protective equipment of this radiation safety program.
	 *
	 * @param individualProtectiveEquipment the individual protective equipment of this radiation safety program
	 */
	@Override
	public void setIndividualProtectiveEquipment(
		String individualProtectiveEquipment) {

		model.setIndividualProtectiveEquipment(individualProtectiveEquipment);
	}

	/**
	 * Sets the internal review of this radiation safety program.
	 *
	 * @param internalReview the internal review of this radiation safety program
	 */
	@Override
	public void setInternalReview(String internalReview) {
		model.setInternalReview(internalReview);
	}

	/**
	 * Sets the investigation level of this radiation safety program.
	 *
	 * @param investigationLevel the investigation level of this radiation safety program
	 */
	@Override
	public void setInvestigationLevel(String investigationLevel) {
		model.setInvestigationLevel(investigationLevel);
	}

	/**
	 * Sets the leaked testing sources of this radiation safety program.
	 *
	 * @param leakedTestingSources the leaked testing sources of this radiation safety program
	 */
	@Override
	public void setLeakedTestingSources(String leakedTestingSources) {
		model.setLeakedTestingSources(leakedTestingSources);
	}

	/**
	 * Sets the licence location of this radiation safety program.
	 *
	 * @param licenceLocation the licence location of this radiation safety program
	 */
	@Override
	public void setLicenceLocation(String licenceLocation) {
		model.setLicenceLocation(licenceLocation);
	}

	/**
	 * Sets the management sources of this radiation safety program.
	 *
	 * @param managementSources the management sources of this radiation safety program
	 */
	@Override
	public void setManagementSources(String managementSources) {
		model.setManagementSources(managementSources);
	}

	/**
	 * Sets the management system of this radiation safety program.
	 *
	 * @param managementSystem the management system of this radiation safety program
	 */
	@Override
	public void setManagementSystem(String managementSystem) {
		model.setManagementSystem(managementSystem);
	}

	/**
	 * Sets the modified date of this radiation safety program.
	 *
	 * @param modifiedDate the modified date of this radiation safety program
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nuclear materials of this radiation safety program.
	 *
	 * @param nuclearMaterials the nuclear materials of this radiation safety program
	 */
	@Override
	public void setNuclearMaterials(String nuclearMaterials) {
		model.setNuclearMaterials(nuclearMaterials);
	}

	/**
	 * Sets the nuclear rso email of this radiation safety program.
	 *
	 * @param nuclearRsoEmail the nuclear rso email of this radiation safety program
	 */
	@Override
	public void setNuclearRsoEmail(String nuclearRsoEmail) {
		model.setNuclearRsoEmail(nuclearRsoEmail);
	}

	/**
	 * Sets the nuclear rso ext of this radiation safety program.
	 *
	 * @param nuclearRsoExt the nuclear rso ext of this radiation safety program
	 */
	@Override
	public void setNuclearRsoExt(String nuclearRsoExt) {
		model.setNuclearRsoExt(nuclearRsoExt);
	}

	/**
	 * Sets the nuclear rso fax of this radiation safety program.
	 *
	 * @param nuclearRsoFax the nuclear rso fax of this radiation safety program
	 */
	@Override
	public void setNuclearRsoFax(String nuclearRsoFax) {
		model.setNuclearRsoFax(nuclearRsoFax);
	}

	/**
	 * Sets the nuclear rso name of this radiation safety program.
	 *
	 * @param nuclearRsoName the nuclear rso name of this radiation safety program
	 */
	@Override
	public void setNuclearRsoName(String nuclearRsoName) {
		model.setNuclearRsoName(nuclearRsoName);
	}

	/**
	 * Sets the nuclear rso tele no of this radiation safety program.
	 *
	 * @param nuclearRsoTeleNo the nuclear rso tele no of this radiation safety program
	 */
	@Override
	public void setNuclearRsoTeleNo(String nuclearRsoTeleNo) {
		model.setNuclearRsoTeleNo(nuclearRsoTeleNo);
	}

	/**
	 * Sets the nuclear rso title of this radiation safety program.
	 *
	 * @param nuclearRsoTitle the nuclear rso title of this radiation safety program
	 */
	@Override
	public void setNuclearRsoTitle(String nuclearRsoTitle) {
		model.setNuclearRsoTitle(nuclearRsoTitle);
	}

	/**
	 * Sets the other date of this radiation safety program.
	 *
	 * @param otherDate the other date of this radiation safety program
	 */
	@Override
	public void setOtherDate(Date otherDate) {
		model.setOtherDate(otherDate);
	}

	/**
	 * Sets the other limitation auth of this radiation safety program.
	 *
	 * @param otherLimitationAuth the other limitation auth of this radiation safety program
	 */
	@Override
	public void setOtherLimitationAuth(String otherLimitationAuth) {
		model.setOtherLimitationAuth(otherLimitationAuth);
	}

	/**
	 * Sets the policy details of this radiation safety program.
	 *
	 * @param policyDetails the policy details of this radiation safety program
	 */
	@Override
	public void setPolicyDetails(String policyDetails) {
		model.setPolicyDetails(policyDetails);
	}

	/**
	 * Sets the primary key of this radiation safety program.
	 *
	 * @param primaryKey the primary key of this radiation safety program
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the public control of this radiation safety program.
	 *
	 * @param publicControl the public control of this radiation safety program
	 */
	@Override
	public void setPublicControl(String publicControl) {
		model.setPublicControl(publicControl);
	}

	/**
	 * Sets the qualified details of this radiation safety program.
	 *
	 * @param qualifiedDetails the qualified details of this radiation safety program
	 */
	@Override
	public void setQualifiedDetails(String qualifiedDetails) {
		model.setQualifiedDetails(qualifiedDetails);
	}

	/**
	 * Sets the qualified expert date of this radiation safety program.
	 *
	 * @param qualifiedExpertDate the qualified expert date of this radiation safety program
	 */
	@Override
	public void setQualifiedExpertDate(Date qualifiedExpertDate) {
		model.setQualifiedExpertDate(qualifiedExpertDate);
	}

	/**
	 * Sets the qualified expert email of this radiation safety program.
	 *
	 * @param qualifiedExpertEmail the qualified expert email of this radiation safety program
	 */
	@Override
	public void setQualifiedExpertEmail(String qualifiedExpertEmail) {
		model.setQualifiedExpertEmail(qualifiedExpertEmail);
	}

	/**
	 * Sets the qualified expert ext of this radiation safety program.
	 *
	 * @param qualifiedExpertExt the qualified expert ext of this radiation safety program
	 */
	@Override
	public void setQualifiedExpertExt(String qualifiedExpertExt) {
		model.setQualifiedExpertExt(qualifiedExpertExt);
	}

	/**
	 * Sets the qualified expert fax of this radiation safety program.
	 *
	 * @param qualifiedExpertFax the qualified expert fax of this radiation safety program
	 */
	@Override
	public void setQualifiedExpertFax(String qualifiedExpertFax) {
		model.setQualifiedExpertFax(qualifiedExpertFax);
	}

	/**
	 * Sets the qualified expert name of this radiation safety program.
	 *
	 * @param qualifiedExpertName the qualified expert name of this radiation safety program
	 */
	@Override
	public void setQualifiedExpertName(String qualifiedExpertName) {
		model.setQualifiedExpertName(qualifiedExpertName);
	}

	/**
	 * Sets the qualified expert regst no of this radiation safety program.
	 *
	 * @param qualifiedExpertRegstNo the qualified expert regst no of this radiation safety program
	 */
	@Override
	public void setQualifiedExpertRegstNo(String qualifiedExpertRegstNo) {
		model.setQualifiedExpertRegstNo(qualifiedExpertRegstNo);
	}

	/**
	 * Sets the qualified expert tele of this radiation safety program.
	 *
	 * @param qualifiedExpertTele the qualified expert tele of this radiation safety program
	 */
	@Override
	public void setQualifiedExpertTele(String qualifiedExpertTele) {
		model.setQualifiedExpertTele(qualifiedExpertTele);
	}

	/**
	 * Sets the qualified expert title of this radiation safety program.
	 *
	 * @param qualifiedExpertTitle the qualified expert title of this radiation safety program
	 */
	@Override
	public void setQualifiedExpertTitle(String qualifiedExpertTitle) {
		model.setQualifiedExpertTitle(qualifiedExpertTitle);
	}

	/**
	 * Sets the radiationi instruments of this radiation safety program.
	 *
	 * @param radiationiInstruments the radiationi instruments of this radiation safety program
	 */
	@Override
	public void setRadiationiInstruments(String radiationiInstruments) {
		model.setRadiationiInstruments(radiationiInstruments);
	}

	/**
	 * Sets the radiation safety program ID of this radiation safety program.
	 *
	 * @param radiationSafetyProgramId the radiation safety program ID of this radiation safety program
	 */
	@Override
	public void setRadiationSafetyProgramId(long radiationSafetyProgramId) {
		model.setRadiationSafetyProgramId(radiationSafetyProgramId);
	}

	/**
	 * Sets the radioactive sources of this radiation safety program.
	 *
	 * @param radioactiveSources the radioactive sources of this radiation safety program
	 */
	@Override
	public void setRadioactiveSources(String radioactiveSources) {
		model.setRadioactiveSources(radioactiveSources);
	}

	/**
	 * Sets the radition sources of this radiation safety program.
	 *
	 * @param raditionSources the radition sources of this radiation safety program
	 */
	@Override
	public void setRaditionSources(String raditionSources) {
		model.setRaditionSources(raditionSources);
	}

	/**
	 * Sets the renewals summary of this radiation safety program.
	 *
	 * @param renewalsSummary the renewals summary of this radiation safety program
	 */
	@Override
	public void setRenewalsSummary(String renewalsSummary) {
		model.setRenewalsSummary(renewalsSummary);
	}

	/**
	 * Sets the respi please specify of this radiation safety program.
	 *
	 * @param respiPleaseSpecify the respi please specify of this radiation safety program
	 */
	@Override
	public void setRespiPleaseSpecify(String respiPleaseSpecify) {
		model.setRespiPleaseSpecify(respiPleaseSpecify);
	}

	/**
	 * Sets the res pro please specify of this radiation safety program.
	 *
	 * @param ResProPleaseSpecify the res pro please specify of this radiation safety program
	 */
	@Override
	public void setResProPleaseSpecify(String ResProPleaseSpecify) {
		model.setResProPleaseSpecify(ResProPleaseSpecify);
	}

	/**
	 * Sets the rso details of this radiation safety program.
	 *
	 * @param rsoDetails the rso details of this radiation safety program
	 */
	@Override
	public void setRsoDetails(String rsoDetails) {
		model.setRsoDetails(rsoDetails);
	}

	/**
	 * Sets the scope of activities of this radiation safety program.
	 *
	 * @param scopeOfActivities the scope of activities of this radiation safety program
	 */
	@Override
	public void setScopeOfActivities(String scopeOfActivities) {
		model.setScopeOfActivities(scopeOfActivities);
	}

	/**
	 * Sets the security access of this radiation safety program.
	 *
	 * @param securityAccess the security access of this radiation safety program
	 */
	@Override
	public void setSecurityAccess(String securityAccess) {
		model.setSecurityAccess(securityAccess);
	}

	/**
	 * Sets the sources activities of this radiation safety program.
	 *
	 * @param sourcesActivities the sources activities of this radiation safety program
	 */
	@Override
	public void setSourcesActivities(String sourcesActivities) {
		model.setSourcesActivities(sourcesActivities);
	}

	/**
	 * Sets the tongs please specify of this radiation safety program.
	 *
	 * @param tongsPleaseSpecify the tongs please specify of this radiation safety program
	 */
	@Override
	public void setTongsPleaseSpecify(String tongsPleaseSpecify) {
		model.setTongsPleaseSpecify(tongsPleaseSpecify);
	}

	/**
	 * Sets the transfer sources of this radiation safety program.
	 *
	 * @param transferSources the transfer sources of this radiation safety program
	 */
	@Override
	public void setTransferSources(String transferSources) {
		model.setTransferSources(transferSources);
	}

	/**
	 * Sets the transport packaging of this radiation safety program.
	 *
	 * @param transportPackaging the transport packaging of this radiation safety program
	 */
	@Override
	public void setTransportPackaging(String transportPackaging) {
		model.setTransportPackaging(transportPackaging);
	}

	/**
	 * Sets the user ID of this radiation safety program.
	 *
	 * @param userId the user ID of this radiation safety program
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this radiation safety program.
	 *
	 * @param userName the user name of this radiation safety program
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this radiation safety program.
	 *
	 * @param userUuid the user uuid of this radiation safety program
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the worker recordings of this radiation safety program.
	 *
	 * @param workerRecordings the worker recordings of this radiation safety program
	 */
	@Override
	public void setWorkerRecordings(String workerRecordings) {
		model.setWorkerRecordings(workerRecordings);
	}

	/**
	 * Sets the worker training of this radiation safety program.
	 *
	 * @param workerTraining the worker training of this radiation safety program
	 */
	@Override
	public void setWorkerTraining(String workerTraining) {
		model.setWorkerTraining(workerTraining);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected RadiationSafetyProgramWrapper wrap(
		RadiationSafetyProgram radiationSafetyProgram) {

		return new RadiationSafetyProgramWrapper(radiationSafetyProgram);
	}

}