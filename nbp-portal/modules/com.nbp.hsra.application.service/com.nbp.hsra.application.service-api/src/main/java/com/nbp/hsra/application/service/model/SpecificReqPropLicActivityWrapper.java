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
 * This class is a wrapper for {@link SpecificReqPropLicActivity}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SpecificReqPropLicActivity
 * @generated
 */
public class SpecificReqPropLicActivityWrapper
	extends BaseModelWrapper<SpecificReqPropLicActivity>
	implements ModelWrapper<SpecificReqPropLicActivity>,
			   SpecificReqPropLicActivity {

	public SpecificReqPropLicActivityWrapper(
		SpecificReqPropLicActivity specificReqPropLicActivity) {

		super(specificReqPropLicActivity);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"specificReqPropLicActivityId", getSpecificReqPropLicActivityId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("adminTreatment", getAdminTreatment());
		attributes.put("qualityProgramme", getQualityProgramme());
		attributes.put("instructionsCaregivers", getInstructionsCaregivers());
		attributes.put("instructionsPatients", getInstructionsPatients());
		attributes.put("patientsRelease", getPatientsRelease());
		attributes.put("treatmentRooms", getTreatmentRooms());
		attributes.put("medicalEmergencies", getMedicalEmergencies());
		attributes.put("nuclearMedicine", getNuclearMedicine());
		attributes.put("diagnosticStudies", getDiagnosticStudies());
		attributes.put("biomedicalResearch", getBiomedicalResearch());
		attributes.put("researchReview", getResearchReview());
		attributes.put("emergencyOperating", getEmergencyOperating());
		attributes.put("certificatePackages", getCertificatePackages());
		attributes.put("exposureDevices", getExposureDevices());
		attributes.put("equipmentSafety", getEquipmentSafety());
		attributes.put("transportPlan", getTransportPlan());
		attributes.put("animalsTreatment", getAnimalsTreatment());
		attributes.put("animalHousing", getAnimalHousing());
		attributes.put("disposalWaste", getDisposalWaste());
		attributes.put("monitoringAnimalHousing", getMonitoringAnimalHousing());
		attributes.put("releaseAnimals", getReleaseAnimals());
		attributes.put("proceduresApp", getProceduresApp());
		attributes.put("disposalsApp", getDisposalsApp());
		attributes.put("monitoringMaterialNu", getMonitoringMaterialNu());
		attributes.put("handlingProcedures", getHandlingProcedures());
		attributes.put("hoppersEntry", getHoppersEntry());
		attributes.put("operatingConditions", getOperatingConditions());
		attributes.put("insertionType", getInsertionType());
		attributes.put("installationFixed", getInstallationFixed());
		attributes.put("transportPlanGauge", getTransportPlanGauge());
		attributes.put("emergencyAddition", getEmergencyAddition());
		attributes.put("nuclearEnviroment", getNuclearEnviroment());
		attributes.put("fishingTool", getFishingTool());
		attributes.put("sealedSources", getSealedSources());
		attributes.put("abandonmentZone", getAbandonmentZone());
		attributes.put("servicingCopy", getServicingCopy());
		attributes.put(
			"manufacturingDevelopment", getManufacturingDevelopment());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long specificReqPropLicActivityId = (Long)attributes.get(
			"specificReqPropLicActivityId");

		if (specificReqPropLicActivityId != null) {
			setSpecificReqPropLicActivityId(specificReqPropLicActivityId);
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

		String adminTreatment = (String)attributes.get("adminTreatment");

		if (adminTreatment != null) {
			setAdminTreatment(adminTreatment);
		}

		String qualityProgramme = (String)attributes.get("qualityProgramme");

		if (qualityProgramme != null) {
			setQualityProgramme(qualityProgramme);
		}

		String instructionsCaregivers = (String)attributes.get(
			"instructionsCaregivers");

		if (instructionsCaregivers != null) {
			setInstructionsCaregivers(instructionsCaregivers);
		}

		String instructionsPatients = (String)attributes.get(
			"instructionsPatients");

		if (instructionsPatients != null) {
			setInstructionsPatients(instructionsPatients);
		}

		String patientsRelease = (String)attributes.get("patientsRelease");

		if (patientsRelease != null) {
			setPatientsRelease(patientsRelease);
		}

		String treatmentRooms = (String)attributes.get("treatmentRooms");

		if (treatmentRooms != null) {
			setTreatmentRooms(treatmentRooms);
		}

		String medicalEmergencies = (String)attributes.get(
			"medicalEmergencies");

		if (medicalEmergencies != null) {
			setMedicalEmergencies(medicalEmergencies);
		}

		String nuclearMedicine = (String)attributes.get("nuclearMedicine");

		if (nuclearMedicine != null) {
			setNuclearMedicine(nuclearMedicine);
		}

		String diagnosticStudies = (String)attributes.get("diagnosticStudies");

		if (diagnosticStudies != null) {
			setDiagnosticStudies(diagnosticStudies);
		}

		String biomedicalResearch = (String)attributes.get(
			"biomedicalResearch");

		if (biomedicalResearch != null) {
			setBiomedicalResearch(biomedicalResearch);
		}

		String researchReview = (String)attributes.get("researchReview");

		if (researchReview != null) {
			setResearchReview(researchReview);
		}

		String emergencyOperating = (String)attributes.get(
			"emergencyOperating");

		if (emergencyOperating != null) {
			setEmergencyOperating(emergencyOperating);
		}

		String certificatePackages = (String)attributes.get(
			"certificatePackages");

		if (certificatePackages != null) {
			setCertificatePackages(certificatePackages);
		}

		String exposureDevices = (String)attributes.get("exposureDevices");

		if (exposureDevices != null) {
			setExposureDevices(exposureDevices);
		}

		String equipmentSafety = (String)attributes.get("equipmentSafety");

		if (equipmentSafety != null) {
			setEquipmentSafety(equipmentSafety);
		}

		String transportPlan = (String)attributes.get("transportPlan");

		if (transportPlan != null) {
			setTransportPlan(transportPlan);
		}

		String animalsTreatment = (String)attributes.get("animalsTreatment");

		if (animalsTreatment != null) {
			setAnimalsTreatment(animalsTreatment);
		}

		String animalHousing = (String)attributes.get("animalHousing");

		if (animalHousing != null) {
			setAnimalHousing(animalHousing);
		}

		String disposalWaste = (String)attributes.get("disposalWaste");

		if (disposalWaste != null) {
			setDisposalWaste(disposalWaste);
		}

		String monitoringAnimalHousing = (String)attributes.get(
			"monitoringAnimalHousing");

		if (monitoringAnimalHousing != null) {
			setMonitoringAnimalHousing(monitoringAnimalHousing);
		}

		String releaseAnimals = (String)attributes.get("releaseAnimals");

		if (releaseAnimals != null) {
			setReleaseAnimals(releaseAnimals);
		}

		String proceduresApp = (String)attributes.get("proceduresApp");

		if (proceduresApp != null) {
			setProceduresApp(proceduresApp);
		}

		String disposalsApp = (String)attributes.get("disposalsApp");

		if (disposalsApp != null) {
			setDisposalsApp(disposalsApp);
		}

		String monitoringMaterialNu = (String)attributes.get(
			"monitoringMaterialNu");

		if (monitoringMaterialNu != null) {
			setMonitoringMaterialNu(monitoringMaterialNu);
		}

		String handlingProcedures = (String)attributes.get(
			"handlingProcedures");

		if (handlingProcedures != null) {
			setHandlingProcedures(handlingProcedures);
		}

		String hoppersEntry = (String)attributes.get("hoppersEntry");

		if (hoppersEntry != null) {
			setHoppersEntry(hoppersEntry);
		}

		String operatingConditions = (String)attributes.get(
			"operatingConditions");

		if (operatingConditions != null) {
			setOperatingConditions(operatingConditions);
		}

		String insertionType = (String)attributes.get("insertionType");

		if (insertionType != null) {
			setInsertionType(insertionType);
		}

		String installationFixed = (String)attributes.get("installationFixed");

		if (installationFixed != null) {
			setInstallationFixed(installationFixed);
		}

		String transportPlanGauge = (String)attributes.get(
			"transportPlanGauge");

		if (transportPlanGauge != null) {
			setTransportPlanGauge(transportPlanGauge);
		}

		String emergencyAddition = (String)attributes.get("emergencyAddition");

		if (emergencyAddition != null) {
			setEmergencyAddition(emergencyAddition);
		}

		String nuclearEnviroment = (String)attributes.get("nuclearEnviroment");

		if (nuclearEnviroment != null) {
			setNuclearEnviroment(nuclearEnviroment);
		}

		String fishingTool = (String)attributes.get("fishingTool");

		if (fishingTool != null) {
			setFishingTool(fishingTool);
		}

		String sealedSources = (String)attributes.get("sealedSources");

		if (sealedSources != null) {
			setSealedSources(sealedSources);
		}

		String abandonmentZone = (String)attributes.get("abandonmentZone");

		if (abandonmentZone != null) {
			setAbandonmentZone(abandonmentZone);
		}

		String servicingCopy = (String)attributes.get("servicingCopy");

		if (servicingCopy != null) {
			setServicingCopy(servicingCopy);
		}

		String manufacturingDevelopment = (String)attributes.get(
			"manufacturingDevelopment");

		if (manufacturingDevelopment != null) {
			setManufacturingDevelopment(manufacturingDevelopment);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public SpecificReqPropLicActivity cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the abandonment zone of this specific req prop lic activity.
	 *
	 * @return the abandonment zone of this specific req prop lic activity
	 */
	@Override
	public String getAbandonmentZone() {
		return model.getAbandonmentZone();
	}

	/**
	 * Returns the admin treatment of this specific req prop lic activity.
	 *
	 * @return the admin treatment of this specific req prop lic activity
	 */
	@Override
	public String getAdminTreatment() {
		return model.getAdminTreatment();
	}

	/**
	 * Returns the animal housing of this specific req prop lic activity.
	 *
	 * @return the animal housing of this specific req prop lic activity
	 */
	@Override
	public String getAnimalHousing() {
		return model.getAnimalHousing();
	}

	/**
	 * Returns the animals treatment of this specific req prop lic activity.
	 *
	 * @return the animals treatment of this specific req prop lic activity
	 */
	@Override
	public String getAnimalsTreatment() {
		return model.getAnimalsTreatment();
	}

	/**
	 * Returns the biomedical research of this specific req prop lic activity.
	 *
	 * @return the biomedical research of this specific req prop lic activity
	 */
	@Override
	public String getBiomedicalResearch() {
		return model.getBiomedicalResearch();
	}

	/**
	 * Returns the certificate packages of this specific req prop lic activity.
	 *
	 * @return the certificate packages of this specific req prop lic activity
	 */
	@Override
	public String getCertificatePackages() {
		return model.getCertificatePackages();
	}

	/**
	 * Returns the company ID of this specific req prop lic activity.
	 *
	 * @return the company ID of this specific req prop lic activity
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this specific req prop lic activity.
	 *
	 * @return the create date of this specific req prop lic activity
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the diagnostic studies of this specific req prop lic activity.
	 *
	 * @return the diagnostic studies of this specific req prop lic activity
	 */
	@Override
	public String getDiagnosticStudies() {
		return model.getDiagnosticStudies();
	}

	/**
	 * Returns the disposals app of this specific req prop lic activity.
	 *
	 * @return the disposals app of this specific req prop lic activity
	 */
	@Override
	public String getDisposalsApp() {
		return model.getDisposalsApp();
	}

	/**
	 * Returns the disposal waste of this specific req prop lic activity.
	 *
	 * @return the disposal waste of this specific req prop lic activity
	 */
	@Override
	public String getDisposalWaste() {
		return model.getDisposalWaste();
	}

	/**
	 * Returns the emergency addition of this specific req prop lic activity.
	 *
	 * @return the emergency addition of this specific req prop lic activity
	 */
	@Override
	public String getEmergencyAddition() {
		return model.getEmergencyAddition();
	}

	/**
	 * Returns the emergency operating of this specific req prop lic activity.
	 *
	 * @return the emergency operating of this specific req prop lic activity
	 */
	@Override
	public String getEmergencyOperating() {
		return model.getEmergencyOperating();
	}

	/**
	 * Returns the equipment safety of this specific req prop lic activity.
	 *
	 * @return the equipment safety of this specific req prop lic activity
	 */
	@Override
	public String getEquipmentSafety() {
		return model.getEquipmentSafety();
	}

	/**
	 * Returns the exposure devices of this specific req prop lic activity.
	 *
	 * @return the exposure devices of this specific req prop lic activity
	 */
	@Override
	public String getExposureDevices() {
		return model.getExposureDevices();
	}

	/**
	 * Returns the fishing tool of this specific req prop lic activity.
	 *
	 * @return the fishing tool of this specific req prop lic activity
	 */
	@Override
	public String getFishingTool() {
		return model.getFishingTool();
	}

	/**
	 * Returns the group ID of this specific req prop lic activity.
	 *
	 * @return the group ID of this specific req prop lic activity
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the handling procedures of this specific req prop lic activity.
	 *
	 * @return the handling procedures of this specific req prop lic activity
	 */
	@Override
	public String getHandlingProcedures() {
		return model.getHandlingProcedures();
	}

	/**
	 * Returns the hoppers entry of this specific req prop lic activity.
	 *
	 * @return the hoppers entry of this specific req prop lic activity
	 */
	@Override
	public String getHoppersEntry() {
		return model.getHoppersEntry();
	}

	/**
	 * Returns the hsra application ID of this specific req prop lic activity.
	 *
	 * @return the hsra application ID of this specific req prop lic activity
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the insertion type of this specific req prop lic activity.
	 *
	 * @return the insertion type of this specific req prop lic activity
	 */
	@Override
	public String getInsertionType() {
		return model.getInsertionType();
	}

	/**
	 * Returns the installation fixed of this specific req prop lic activity.
	 *
	 * @return the installation fixed of this specific req prop lic activity
	 */
	@Override
	public String getInstallationFixed() {
		return model.getInstallationFixed();
	}

	/**
	 * Returns the instructions caregivers of this specific req prop lic activity.
	 *
	 * @return the instructions caregivers of this specific req prop lic activity
	 */
	@Override
	public String getInstructionsCaregivers() {
		return model.getInstructionsCaregivers();
	}

	/**
	 * Returns the instructions patients of this specific req prop lic activity.
	 *
	 * @return the instructions patients of this specific req prop lic activity
	 */
	@Override
	public String getInstructionsPatients() {
		return model.getInstructionsPatients();
	}

	/**
	 * Returns the manufacturing development of this specific req prop lic activity.
	 *
	 * @return the manufacturing development of this specific req prop lic activity
	 */
	@Override
	public String getManufacturingDevelopment() {
		return model.getManufacturingDevelopment();
	}

	/**
	 * Returns the medical emergencies of this specific req prop lic activity.
	 *
	 * @return the medical emergencies of this specific req prop lic activity
	 */
	@Override
	public String getMedicalEmergencies() {
		return model.getMedicalEmergencies();
	}

	/**
	 * Returns the modified date of this specific req prop lic activity.
	 *
	 * @return the modified date of this specific req prop lic activity
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the monitoring animal housing of this specific req prop lic activity.
	 *
	 * @return the monitoring animal housing of this specific req prop lic activity
	 */
	@Override
	public String getMonitoringAnimalHousing() {
		return model.getMonitoringAnimalHousing();
	}

	/**
	 * Returns the monitoring material nu of this specific req prop lic activity.
	 *
	 * @return the monitoring material nu of this specific req prop lic activity
	 */
	@Override
	public String getMonitoringMaterialNu() {
		return model.getMonitoringMaterialNu();
	}

	/**
	 * Returns the nuclear enviroment of this specific req prop lic activity.
	 *
	 * @return the nuclear enviroment of this specific req prop lic activity
	 */
	@Override
	public String getNuclearEnviroment() {
		return model.getNuclearEnviroment();
	}

	/**
	 * Returns the nuclear medicine of this specific req prop lic activity.
	 *
	 * @return the nuclear medicine of this specific req prop lic activity
	 */
	@Override
	public String getNuclearMedicine() {
		return model.getNuclearMedicine();
	}

	/**
	 * Returns the operating conditions of this specific req prop lic activity.
	 *
	 * @return the operating conditions of this specific req prop lic activity
	 */
	@Override
	public String getOperatingConditions() {
		return model.getOperatingConditions();
	}

	/**
	 * Returns the patients release of this specific req prop lic activity.
	 *
	 * @return the patients release of this specific req prop lic activity
	 */
	@Override
	public String getPatientsRelease() {
		return model.getPatientsRelease();
	}

	/**
	 * Returns the primary key of this specific req prop lic activity.
	 *
	 * @return the primary key of this specific req prop lic activity
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the procedures app of this specific req prop lic activity.
	 *
	 * @return the procedures app of this specific req prop lic activity
	 */
	@Override
	public String getProceduresApp() {
		return model.getProceduresApp();
	}

	/**
	 * Returns the quality programme of this specific req prop lic activity.
	 *
	 * @return the quality programme of this specific req prop lic activity
	 */
	@Override
	public String getQualityProgramme() {
		return model.getQualityProgramme();
	}

	/**
	 * Returns the release animals of this specific req prop lic activity.
	 *
	 * @return the release animals of this specific req prop lic activity
	 */
	@Override
	public String getReleaseAnimals() {
		return model.getReleaseAnimals();
	}

	/**
	 * Returns the research review of this specific req prop lic activity.
	 *
	 * @return the research review of this specific req prop lic activity
	 */
	@Override
	public String getResearchReview() {
		return model.getResearchReview();
	}

	/**
	 * Returns the sealed sources of this specific req prop lic activity.
	 *
	 * @return the sealed sources of this specific req prop lic activity
	 */
	@Override
	public String getSealedSources() {
		return model.getSealedSources();
	}

	/**
	 * Returns the servicing copy of this specific req prop lic activity.
	 *
	 * @return the servicing copy of this specific req prop lic activity
	 */
	@Override
	public String getServicingCopy() {
		return model.getServicingCopy();
	}

	/**
	 * Returns the specific req prop lic activity ID of this specific req prop lic activity.
	 *
	 * @return the specific req prop lic activity ID of this specific req prop lic activity
	 */
	@Override
	public long getSpecificReqPropLicActivityId() {
		return model.getSpecificReqPropLicActivityId();
	}

	/**
	 * Returns the transport plan of this specific req prop lic activity.
	 *
	 * @return the transport plan of this specific req prop lic activity
	 */
	@Override
	public String getTransportPlan() {
		return model.getTransportPlan();
	}

	/**
	 * Returns the transport plan gauge of this specific req prop lic activity.
	 *
	 * @return the transport plan gauge of this specific req prop lic activity
	 */
	@Override
	public String getTransportPlanGauge() {
		return model.getTransportPlanGauge();
	}

	/**
	 * Returns the treatment rooms of this specific req prop lic activity.
	 *
	 * @return the treatment rooms of this specific req prop lic activity
	 */
	@Override
	public String getTreatmentRooms() {
		return model.getTreatmentRooms();
	}

	/**
	 * Returns the user ID of this specific req prop lic activity.
	 *
	 * @return the user ID of this specific req prop lic activity
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this specific req prop lic activity.
	 *
	 * @return the user name of this specific req prop lic activity
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this specific req prop lic activity.
	 *
	 * @return the user uuid of this specific req prop lic activity
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the abandonment zone of this specific req prop lic activity.
	 *
	 * @param abandonmentZone the abandonment zone of this specific req prop lic activity
	 */
	@Override
	public void setAbandonmentZone(String abandonmentZone) {
		model.setAbandonmentZone(abandonmentZone);
	}

	/**
	 * Sets the admin treatment of this specific req prop lic activity.
	 *
	 * @param adminTreatment the admin treatment of this specific req prop lic activity
	 */
	@Override
	public void setAdminTreatment(String adminTreatment) {
		model.setAdminTreatment(adminTreatment);
	}

	/**
	 * Sets the animal housing of this specific req prop lic activity.
	 *
	 * @param animalHousing the animal housing of this specific req prop lic activity
	 */
	@Override
	public void setAnimalHousing(String animalHousing) {
		model.setAnimalHousing(animalHousing);
	}

	/**
	 * Sets the animals treatment of this specific req prop lic activity.
	 *
	 * @param animalsTreatment the animals treatment of this specific req prop lic activity
	 */
	@Override
	public void setAnimalsTreatment(String animalsTreatment) {
		model.setAnimalsTreatment(animalsTreatment);
	}

	/**
	 * Sets the biomedical research of this specific req prop lic activity.
	 *
	 * @param biomedicalResearch the biomedical research of this specific req prop lic activity
	 */
	@Override
	public void setBiomedicalResearch(String biomedicalResearch) {
		model.setBiomedicalResearch(biomedicalResearch);
	}

	/**
	 * Sets the certificate packages of this specific req prop lic activity.
	 *
	 * @param certificatePackages the certificate packages of this specific req prop lic activity
	 */
	@Override
	public void setCertificatePackages(String certificatePackages) {
		model.setCertificatePackages(certificatePackages);
	}

	/**
	 * Sets the company ID of this specific req prop lic activity.
	 *
	 * @param companyId the company ID of this specific req prop lic activity
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this specific req prop lic activity.
	 *
	 * @param createDate the create date of this specific req prop lic activity
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the diagnostic studies of this specific req prop lic activity.
	 *
	 * @param diagnosticStudies the diagnostic studies of this specific req prop lic activity
	 */
	@Override
	public void setDiagnosticStudies(String diagnosticStudies) {
		model.setDiagnosticStudies(diagnosticStudies);
	}

	/**
	 * Sets the disposals app of this specific req prop lic activity.
	 *
	 * @param disposalsApp the disposals app of this specific req prop lic activity
	 */
	@Override
	public void setDisposalsApp(String disposalsApp) {
		model.setDisposalsApp(disposalsApp);
	}

	/**
	 * Sets the disposal waste of this specific req prop lic activity.
	 *
	 * @param disposalWaste the disposal waste of this specific req prop lic activity
	 */
	@Override
	public void setDisposalWaste(String disposalWaste) {
		model.setDisposalWaste(disposalWaste);
	}

	/**
	 * Sets the emergency addition of this specific req prop lic activity.
	 *
	 * @param emergencyAddition the emergency addition of this specific req prop lic activity
	 */
	@Override
	public void setEmergencyAddition(String emergencyAddition) {
		model.setEmergencyAddition(emergencyAddition);
	}

	/**
	 * Sets the emergency operating of this specific req prop lic activity.
	 *
	 * @param emergencyOperating the emergency operating of this specific req prop lic activity
	 */
	@Override
	public void setEmergencyOperating(String emergencyOperating) {
		model.setEmergencyOperating(emergencyOperating);
	}

	/**
	 * Sets the equipment safety of this specific req prop lic activity.
	 *
	 * @param equipmentSafety the equipment safety of this specific req prop lic activity
	 */
	@Override
	public void setEquipmentSafety(String equipmentSafety) {
		model.setEquipmentSafety(equipmentSafety);
	}

	/**
	 * Sets the exposure devices of this specific req prop lic activity.
	 *
	 * @param exposureDevices the exposure devices of this specific req prop lic activity
	 */
	@Override
	public void setExposureDevices(String exposureDevices) {
		model.setExposureDevices(exposureDevices);
	}

	/**
	 * Sets the fishing tool of this specific req prop lic activity.
	 *
	 * @param fishingTool the fishing tool of this specific req prop lic activity
	 */
	@Override
	public void setFishingTool(String fishingTool) {
		model.setFishingTool(fishingTool);
	}

	/**
	 * Sets the group ID of this specific req prop lic activity.
	 *
	 * @param groupId the group ID of this specific req prop lic activity
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the handling procedures of this specific req prop lic activity.
	 *
	 * @param handlingProcedures the handling procedures of this specific req prop lic activity
	 */
	@Override
	public void setHandlingProcedures(String handlingProcedures) {
		model.setHandlingProcedures(handlingProcedures);
	}

	/**
	 * Sets the hoppers entry of this specific req prop lic activity.
	 *
	 * @param hoppersEntry the hoppers entry of this specific req prop lic activity
	 */
	@Override
	public void setHoppersEntry(String hoppersEntry) {
		model.setHoppersEntry(hoppersEntry);
	}

	/**
	 * Sets the hsra application ID of this specific req prop lic activity.
	 *
	 * @param hsraApplicationId the hsra application ID of this specific req prop lic activity
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the insertion type of this specific req prop lic activity.
	 *
	 * @param insertionType the insertion type of this specific req prop lic activity
	 */
	@Override
	public void setInsertionType(String insertionType) {
		model.setInsertionType(insertionType);
	}

	/**
	 * Sets the installation fixed of this specific req prop lic activity.
	 *
	 * @param installationFixed the installation fixed of this specific req prop lic activity
	 */
	@Override
	public void setInstallationFixed(String installationFixed) {
		model.setInstallationFixed(installationFixed);
	}

	/**
	 * Sets the instructions caregivers of this specific req prop lic activity.
	 *
	 * @param instructionsCaregivers the instructions caregivers of this specific req prop lic activity
	 */
	@Override
	public void setInstructionsCaregivers(String instructionsCaregivers) {
		model.setInstructionsCaregivers(instructionsCaregivers);
	}

	/**
	 * Sets the instructions patients of this specific req prop lic activity.
	 *
	 * @param instructionsPatients the instructions patients of this specific req prop lic activity
	 */
	@Override
	public void setInstructionsPatients(String instructionsPatients) {
		model.setInstructionsPatients(instructionsPatients);
	}

	/**
	 * Sets the manufacturing development of this specific req prop lic activity.
	 *
	 * @param manufacturingDevelopment the manufacturing development of this specific req prop lic activity
	 */
	@Override
	public void setManufacturingDevelopment(String manufacturingDevelopment) {
		model.setManufacturingDevelopment(manufacturingDevelopment);
	}

	/**
	 * Sets the medical emergencies of this specific req prop lic activity.
	 *
	 * @param medicalEmergencies the medical emergencies of this specific req prop lic activity
	 */
	@Override
	public void setMedicalEmergencies(String medicalEmergencies) {
		model.setMedicalEmergencies(medicalEmergencies);
	}

	/**
	 * Sets the modified date of this specific req prop lic activity.
	 *
	 * @param modifiedDate the modified date of this specific req prop lic activity
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the monitoring animal housing of this specific req prop lic activity.
	 *
	 * @param monitoringAnimalHousing the monitoring animal housing of this specific req prop lic activity
	 */
	@Override
	public void setMonitoringAnimalHousing(String monitoringAnimalHousing) {
		model.setMonitoringAnimalHousing(monitoringAnimalHousing);
	}

	/**
	 * Sets the monitoring material nu of this specific req prop lic activity.
	 *
	 * @param monitoringMaterialNu the monitoring material nu of this specific req prop lic activity
	 */
	@Override
	public void setMonitoringMaterialNu(String monitoringMaterialNu) {
		model.setMonitoringMaterialNu(monitoringMaterialNu);
	}

	/**
	 * Sets the nuclear enviroment of this specific req prop lic activity.
	 *
	 * @param nuclearEnviroment the nuclear enviroment of this specific req prop lic activity
	 */
	@Override
	public void setNuclearEnviroment(String nuclearEnviroment) {
		model.setNuclearEnviroment(nuclearEnviroment);
	}

	/**
	 * Sets the nuclear medicine of this specific req prop lic activity.
	 *
	 * @param nuclearMedicine the nuclear medicine of this specific req prop lic activity
	 */
	@Override
	public void setNuclearMedicine(String nuclearMedicine) {
		model.setNuclearMedicine(nuclearMedicine);
	}

	/**
	 * Sets the operating conditions of this specific req prop lic activity.
	 *
	 * @param operatingConditions the operating conditions of this specific req prop lic activity
	 */
	@Override
	public void setOperatingConditions(String operatingConditions) {
		model.setOperatingConditions(operatingConditions);
	}

	/**
	 * Sets the patients release of this specific req prop lic activity.
	 *
	 * @param patientsRelease the patients release of this specific req prop lic activity
	 */
	@Override
	public void setPatientsRelease(String patientsRelease) {
		model.setPatientsRelease(patientsRelease);
	}

	/**
	 * Sets the primary key of this specific req prop lic activity.
	 *
	 * @param primaryKey the primary key of this specific req prop lic activity
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the procedures app of this specific req prop lic activity.
	 *
	 * @param proceduresApp the procedures app of this specific req prop lic activity
	 */
	@Override
	public void setProceduresApp(String proceduresApp) {
		model.setProceduresApp(proceduresApp);
	}

	/**
	 * Sets the quality programme of this specific req prop lic activity.
	 *
	 * @param qualityProgramme the quality programme of this specific req prop lic activity
	 */
	@Override
	public void setQualityProgramme(String qualityProgramme) {
		model.setQualityProgramme(qualityProgramme);
	}

	/**
	 * Sets the release animals of this specific req prop lic activity.
	 *
	 * @param releaseAnimals the release animals of this specific req prop lic activity
	 */
	@Override
	public void setReleaseAnimals(String releaseAnimals) {
		model.setReleaseAnimals(releaseAnimals);
	}

	/**
	 * Sets the research review of this specific req prop lic activity.
	 *
	 * @param researchReview the research review of this specific req prop lic activity
	 */
	@Override
	public void setResearchReview(String researchReview) {
		model.setResearchReview(researchReview);
	}

	/**
	 * Sets the sealed sources of this specific req prop lic activity.
	 *
	 * @param sealedSources the sealed sources of this specific req prop lic activity
	 */
	@Override
	public void setSealedSources(String sealedSources) {
		model.setSealedSources(sealedSources);
	}

	/**
	 * Sets the servicing copy of this specific req prop lic activity.
	 *
	 * @param servicingCopy the servicing copy of this specific req prop lic activity
	 */
	@Override
	public void setServicingCopy(String servicingCopy) {
		model.setServicingCopy(servicingCopy);
	}

	/**
	 * Sets the specific req prop lic activity ID of this specific req prop lic activity.
	 *
	 * @param specificReqPropLicActivityId the specific req prop lic activity ID of this specific req prop lic activity
	 */
	@Override
	public void setSpecificReqPropLicActivityId(
		long specificReqPropLicActivityId) {

		model.setSpecificReqPropLicActivityId(specificReqPropLicActivityId);
	}

	/**
	 * Sets the transport plan of this specific req prop lic activity.
	 *
	 * @param transportPlan the transport plan of this specific req prop lic activity
	 */
	@Override
	public void setTransportPlan(String transportPlan) {
		model.setTransportPlan(transportPlan);
	}

	/**
	 * Sets the transport plan gauge of this specific req prop lic activity.
	 *
	 * @param transportPlanGauge the transport plan gauge of this specific req prop lic activity
	 */
	@Override
	public void setTransportPlanGauge(String transportPlanGauge) {
		model.setTransportPlanGauge(transportPlanGauge);
	}

	/**
	 * Sets the treatment rooms of this specific req prop lic activity.
	 *
	 * @param treatmentRooms the treatment rooms of this specific req prop lic activity
	 */
	@Override
	public void setTreatmentRooms(String treatmentRooms) {
		model.setTreatmentRooms(treatmentRooms);
	}

	/**
	 * Sets the user ID of this specific req prop lic activity.
	 *
	 * @param userId the user ID of this specific req prop lic activity
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this specific req prop lic activity.
	 *
	 * @param userName the user name of this specific req prop lic activity
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this specific req prop lic activity.
	 *
	 * @param userUuid the user uuid of this specific req prop lic activity
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected SpecificReqPropLicActivityWrapper wrap(
		SpecificReqPropLicActivity specificReqPropLicActivity) {

		return new SpecificReqPropLicActivityWrapper(
			specificReqPropLicActivity);
	}

}