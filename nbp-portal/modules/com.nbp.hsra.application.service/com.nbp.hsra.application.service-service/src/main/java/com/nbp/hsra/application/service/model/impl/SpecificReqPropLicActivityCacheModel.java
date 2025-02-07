/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.SpecificReqPropLicActivity;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SpecificReqPropLicActivity in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SpecificReqPropLicActivityCacheModel
	implements CacheModel<SpecificReqPropLicActivity>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SpecificReqPropLicActivityCacheModel)) {
			return false;
		}

		SpecificReqPropLicActivityCacheModel
			specificReqPropLicActivityCacheModel =
				(SpecificReqPropLicActivityCacheModel)object;

		if (specificReqPropLicActivityId ==
				specificReqPropLicActivityCacheModel.
					specificReqPropLicActivityId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, specificReqPropLicActivityId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(91);

		sb.append("{specificReqPropLicActivityId=");
		sb.append(specificReqPropLicActivityId);
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
		sb.append(", adminTreatment=");
		sb.append(adminTreatment);
		sb.append(", qualityProgramme=");
		sb.append(qualityProgramme);
		sb.append(", instructionsCaregivers=");
		sb.append(instructionsCaregivers);
		sb.append(", instructionsPatients=");
		sb.append(instructionsPatients);
		sb.append(", patientsRelease=");
		sb.append(patientsRelease);
		sb.append(", treatmentRooms=");
		sb.append(treatmentRooms);
		sb.append(", medicalEmergencies=");
		sb.append(medicalEmergencies);
		sb.append(", nuclearMedicine=");
		sb.append(nuclearMedicine);
		sb.append(", diagnosticStudies=");
		sb.append(diagnosticStudies);
		sb.append(", biomedicalResearch=");
		sb.append(biomedicalResearch);
		sb.append(", researchReview=");
		sb.append(researchReview);
		sb.append(", emergencyOperating=");
		sb.append(emergencyOperating);
		sb.append(", certificatePackages=");
		sb.append(certificatePackages);
		sb.append(", exposureDevices=");
		sb.append(exposureDevices);
		sb.append(", equipmentSafety=");
		sb.append(equipmentSafety);
		sb.append(", transportPlan=");
		sb.append(transportPlan);
		sb.append(", animalsTreatment=");
		sb.append(animalsTreatment);
		sb.append(", animalHousing=");
		sb.append(animalHousing);
		sb.append(", disposalWaste=");
		sb.append(disposalWaste);
		sb.append(", monitoringAnimalHousing=");
		sb.append(monitoringAnimalHousing);
		sb.append(", releaseAnimals=");
		sb.append(releaseAnimals);
		sb.append(", proceduresApp=");
		sb.append(proceduresApp);
		sb.append(", disposalsApp=");
		sb.append(disposalsApp);
		sb.append(", monitoringMaterialNu=");
		sb.append(monitoringMaterialNu);
		sb.append(", handlingProcedures=");
		sb.append(handlingProcedures);
		sb.append(", hoppersEntry=");
		sb.append(hoppersEntry);
		sb.append(", operatingConditions=");
		sb.append(operatingConditions);
		sb.append(", insertionType=");
		sb.append(insertionType);
		sb.append(", installationFixed=");
		sb.append(installationFixed);
		sb.append(", transportPlanGauge=");
		sb.append(transportPlanGauge);
		sb.append(", emergencyAddition=");
		sb.append(emergencyAddition);
		sb.append(", nuclearEnviroment=");
		sb.append(nuclearEnviroment);
		sb.append(", fishingTool=");
		sb.append(fishingTool);
		sb.append(", sealedSources=");
		sb.append(sealedSources);
		sb.append(", abandonmentZone=");
		sb.append(abandonmentZone);
		sb.append(", servicingCopy=");
		sb.append(servicingCopy);
		sb.append(", manufacturingDevelopment=");
		sb.append(manufacturingDevelopment);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SpecificReqPropLicActivity toEntityModel() {
		SpecificReqPropLicActivityImpl specificReqPropLicActivityImpl =
			new SpecificReqPropLicActivityImpl();

		specificReqPropLicActivityImpl.setSpecificReqPropLicActivityId(
			specificReqPropLicActivityId);
		specificReqPropLicActivityImpl.setGroupId(groupId);
		specificReqPropLicActivityImpl.setCompanyId(companyId);
		specificReqPropLicActivityImpl.setUserId(userId);

		if (userName == null) {
			specificReqPropLicActivityImpl.setUserName("");
		}
		else {
			specificReqPropLicActivityImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			specificReqPropLicActivityImpl.setCreateDate(null);
		}
		else {
			specificReqPropLicActivityImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			specificReqPropLicActivityImpl.setModifiedDate(null);
		}
		else {
			specificReqPropLicActivityImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (adminTreatment == null) {
			specificReqPropLicActivityImpl.setAdminTreatment("");
		}
		else {
			specificReqPropLicActivityImpl.setAdminTreatment(adminTreatment);
		}

		if (qualityProgramme == null) {
			specificReqPropLicActivityImpl.setQualityProgramme("");
		}
		else {
			specificReqPropLicActivityImpl.setQualityProgramme(
				qualityProgramme);
		}

		if (instructionsCaregivers == null) {
			specificReqPropLicActivityImpl.setInstructionsCaregivers("");
		}
		else {
			specificReqPropLicActivityImpl.setInstructionsCaregivers(
				instructionsCaregivers);
		}

		if (instructionsPatients == null) {
			specificReqPropLicActivityImpl.setInstructionsPatients("");
		}
		else {
			specificReqPropLicActivityImpl.setInstructionsPatients(
				instructionsPatients);
		}

		if (patientsRelease == null) {
			specificReqPropLicActivityImpl.setPatientsRelease("");
		}
		else {
			specificReqPropLicActivityImpl.setPatientsRelease(patientsRelease);
		}

		if (treatmentRooms == null) {
			specificReqPropLicActivityImpl.setTreatmentRooms("");
		}
		else {
			specificReqPropLicActivityImpl.setTreatmentRooms(treatmentRooms);
		}

		if (medicalEmergencies == null) {
			specificReqPropLicActivityImpl.setMedicalEmergencies("");
		}
		else {
			specificReqPropLicActivityImpl.setMedicalEmergencies(
				medicalEmergencies);
		}

		if (nuclearMedicine == null) {
			specificReqPropLicActivityImpl.setNuclearMedicine("");
		}
		else {
			specificReqPropLicActivityImpl.setNuclearMedicine(nuclearMedicine);
		}

		if (diagnosticStudies == null) {
			specificReqPropLicActivityImpl.setDiagnosticStudies("");
		}
		else {
			specificReqPropLicActivityImpl.setDiagnosticStudies(
				diagnosticStudies);
		}

		if (biomedicalResearch == null) {
			specificReqPropLicActivityImpl.setBiomedicalResearch("");
		}
		else {
			specificReqPropLicActivityImpl.setBiomedicalResearch(
				biomedicalResearch);
		}

		if (researchReview == null) {
			specificReqPropLicActivityImpl.setResearchReview("");
		}
		else {
			specificReqPropLicActivityImpl.setResearchReview(researchReview);
		}

		if (emergencyOperating == null) {
			specificReqPropLicActivityImpl.setEmergencyOperating("");
		}
		else {
			specificReqPropLicActivityImpl.setEmergencyOperating(
				emergencyOperating);
		}

		if (certificatePackages == null) {
			specificReqPropLicActivityImpl.setCertificatePackages("");
		}
		else {
			specificReqPropLicActivityImpl.setCertificatePackages(
				certificatePackages);
		}

		if (exposureDevices == null) {
			specificReqPropLicActivityImpl.setExposureDevices("");
		}
		else {
			specificReqPropLicActivityImpl.setExposureDevices(exposureDevices);
		}

		if (equipmentSafety == null) {
			specificReqPropLicActivityImpl.setEquipmentSafety("");
		}
		else {
			specificReqPropLicActivityImpl.setEquipmentSafety(equipmentSafety);
		}

		if (transportPlan == null) {
			specificReqPropLicActivityImpl.setTransportPlan("");
		}
		else {
			specificReqPropLicActivityImpl.setTransportPlan(transportPlan);
		}

		if (animalsTreatment == null) {
			specificReqPropLicActivityImpl.setAnimalsTreatment("");
		}
		else {
			specificReqPropLicActivityImpl.setAnimalsTreatment(
				animalsTreatment);
		}

		if (animalHousing == null) {
			specificReqPropLicActivityImpl.setAnimalHousing("");
		}
		else {
			specificReqPropLicActivityImpl.setAnimalHousing(animalHousing);
		}

		if (disposalWaste == null) {
			specificReqPropLicActivityImpl.setDisposalWaste("");
		}
		else {
			specificReqPropLicActivityImpl.setDisposalWaste(disposalWaste);
		}

		if (monitoringAnimalHousing == null) {
			specificReqPropLicActivityImpl.setMonitoringAnimalHousing("");
		}
		else {
			specificReqPropLicActivityImpl.setMonitoringAnimalHousing(
				monitoringAnimalHousing);
		}

		if (releaseAnimals == null) {
			specificReqPropLicActivityImpl.setReleaseAnimals("");
		}
		else {
			specificReqPropLicActivityImpl.setReleaseAnimals(releaseAnimals);
		}

		if (proceduresApp == null) {
			specificReqPropLicActivityImpl.setProceduresApp("");
		}
		else {
			specificReqPropLicActivityImpl.setProceduresApp(proceduresApp);
		}

		if (disposalsApp == null) {
			specificReqPropLicActivityImpl.setDisposalsApp("");
		}
		else {
			specificReqPropLicActivityImpl.setDisposalsApp(disposalsApp);
		}

		if (monitoringMaterialNu == null) {
			specificReqPropLicActivityImpl.setMonitoringMaterialNu("");
		}
		else {
			specificReqPropLicActivityImpl.setMonitoringMaterialNu(
				monitoringMaterialNu);
		}

		if (handlingProcedures == null) {
			specificReqPropLicActivityImpl.setHandlingProcedures("");
		}
		else {
			specificReqPropLicActivityImpl.setHandlingProcedures(
				handlingProcedures);
		}

		if (hoppersEntry == null) {
			specificReqPropLicActivityImpl.setHoppersEntry("");
		}
		else {
			specificReqPropLicActivityImpl.setHoppersEntry(hoppersEntry);
		}

		if (operatingConditions == null) {
			specificReqPropLicActivityImpl.setOperatingConditions("");
		}
		else {
			specificReqPropLicActivityImpl.setOperatingConditions(
				operatingConditions);
		}

		if (insertionType == null) {
			specificReqPropLicActivityImpl.setInsertionType("");
		}
		else {
			specificReqPropLicActivityImpl.setInsertionType(insertionType);
		}

		if (installationFixed == null) {
			specificReqPropLicActivityImpl.setInstallationFixed("");
		}
		else {
			specificReqPropLicActivityImpl.setInstallationFixed(
				installationFixed);
		}

		if (transportPlanGauge == null) {
			specificReqPropLicActivityImpl.setTransportPlanGauge("");
		}
		else {
			specificReqPropLicActivityImpl.setTransportPlanGauge(
				transportPlanGauge);
		}

		if (emergencyAddition == null) {
			specificReqPropLicActivityImpl.setEmergencyAddition("");
		}
		else {
			specificReqPropLicActivityImpl.setEmergencyAddition(
				emergencyAddition);
		}

		if (nuclearEnviroment == null) {
			specificReqPropLicActivityImpl.setNuclearEnviroment("");
		}
		else {
			specificReqPropLicActivityImpl.setNuclearEnviroment(
				nuclearEnviroment);
		}

		if (fishingTool == null) {
			specificReqPropLicActivityImpl.setFishingTool("");
		}
		else {
			specificReqPropLicActivityImpl.setFishingTool(fishingTool);
		}

		if (sealedSources == null) {
			specificReqPropLicActivityImpl.setSealedSources("");
		}
		else {
			specificReqPropLicActivityImpl.setSealedSources(sealedSources);
		}

		if (abandonmentZone == null) {
			specificReqPropLicActivityImpl.setAbandonmentZone("");
		}
		else {
			specificReqPropLicActivityImpl.setAbandonmentZone(abandonmentZone);
		}

		if (servicingCopy == null) {
			specificReqPropLicActivityImpl.setServicingCopy("");
		}
		else {
			specificReqPropLicActivityImpl.setServicingCopy(servicingCopy);
		}

		if (manufacturingDevelopment == null) {
			specificReqPropLicActivityImpl.setManufacturingDevelopment("");
		}
		else {
			specificReqPropLicActivityImpl.setManufacturingDevelopment(
				manufacturingDevelopment);
		}

		specificReqPropLicActivityImpl.setHsraApplicationId(hsraApplicationId);

		specificReqPropLicActivityImpl.resetOriginalValues();

		return specificReqPropLicActivityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		specificReqPropLicActivityId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		adminTreatment = objectInput.readUTF();
		qualityProgramme = objectInput.readUTF();
		instructionsCaregivers = objectInput.readUTF();
		instructionsPatients = objectInput.readUTF();
		patientsRelease = objectInput.readUTF();
		treatmentRooms = objectInput.readUTF();
		medicalEmergencies = objectInput.readUTF();
		nuclearMedicine = objectInput.readUTF();
		diagnosticStudies = objectInput.readUTF();
		biomedicalResearch = objectInput.readUTF();
		researchReview = objectInput.readUTF();
		emergencyOperating = objectInput.readUTF();
		certificatePackages = objectInput.readUTF();
		exposureDevices = objectInput.readUTF();
		equipmentSafety = objectInput.readUTF();
		transportPlan = objectInput.readUTF();
		animalsTreatment = objectInput.readUTF();
		animalHousing = objectInput.readUTF();
		disposalWaste = objectInput.readUTF();
		monitoringAnimalHousing = objectInput.readUTF();
		releaseAnimals = objectInput.readUTF();
		proceduresApp = objectInput.readUTF();
		disposalsApp = objectInput.readUTF();
		monitoringMaterialNu = objectInput.readUTF();
		handlingProcedures = objectInput.readUTF();
		hoppersEntry = objectInput.readUTF();
		operatingConditions = objectInput.readUTF();
		insertionType = objectInput.readUTF();
		installationFixed = objectInput.readUTF();
		transportPlanGauge = objectInput.readUTF();
		emergencyAddition = objectInput.readUTF();
		nuclearEnviroment = objectInput.readUTF();
		fishingTool = objectInput.readUTF();
		sealedSources = objectInput.readUTF();
		abandonmentZone = objectInput.readUTF();
		servicingCopy = objectInput.readUTF();
		manufacturingDevelopment = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(specificReqPropLicActivityId);

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

		if (adminTreatment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(adminTreatment);
		}

		if (qualityProgramme == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualityProgramme);
		}

		if (instructionsCaregivers == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(instructionsCaregivers);
		}

		if (instructionsPatients == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(instructionsPatients);
		}

		if (patientsRelease == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(patientsRelease);
		}

		if (treatmentRooms == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(treatmentRooms);
		}

		if (medicalEmergencies == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(medicalEmergencies);
		}

		if (nuclearMedicine == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearMedicine);
		}

		if (diagnosticStudies == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(diagnosticStudies);
		}

		if (biomedicalResearch == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(biomedicalResearch);
		}

		if (researchReview == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(researchReview);
		}

		if (emergencyOperating == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emergencyOperating);
		}

		if (certificatePackages == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificatePackages);
		}

		if (exposureDevices == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(exposureDevices);
		}

		if (equipmentSafety == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentSafety);
		}

		if (transportPlan == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transportPlan);
		}

		if (animalsTreatment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(animalsTreatment);
		}

		if (animalHousing == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(animalHousing);
		}

		if (disposalWaste == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(disposalWaste);
		}

		if (monitoringAnimalHousing == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(monitoringAnimalHousing);
		}

		if (releaseAnimals == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(releaseAnimals);
		}

		if (proceduresApp == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(proceduresApp);
		}

		if (disposalsApp == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(disposalsApp);
		}

		if (monitoringMaterialNu == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(monitoringMaterialNu);
		}

		if (handlingProcedures == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(handlingProcedures);
		}

		if (hoppersEntry == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hoppersEntry);
		}

		if (operatingConditions == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(operatingConditions);
		}

		if (insertionType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insertionType);
		}

		if (installationFixed == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(installationFixed);
		}

		if (transportPlanGauge == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transportPlanGauge);
		}

		if (emergencyAddition == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emergencyAddition);
		}

		if (nuclearEnviroment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearEnviroment);
		}

		if (fishingTool == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fishingTool);
		}

		if (sealedSources == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sealedSources);
		}

		if (abandonmentZone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(abandonmentZone);
		}

		if (servicingCopy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(servicingCopy);
		}

		if (manufacturingDevelopment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manufacturingDevelopment);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long specificReqPropLicActivityId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String adminTreatment;
	public String qualityProgramme;
	public String instructionsCaregivers;
	public String instructionsPatients;
	public String patientsRelease;
	public String treatmentRooms;
	public String medicalEmergencies;
	public String nuclearMedicine;
	public String diagnosticStudies;
	public String biomedicalResearch;
	public String researchReview;
	public String emergencyOperating;
	public String certificatePackages;
	public String exposureDevices;
	public String equipmentSafety;
	public String transportPlan;
	public String animalsTreatment;
	public String animalHousing;
	public String disposalWaste;
	public String monitoringAnimalHousing;
	public String releaseAnimals;
	public String proceduresApp;
	public String disposalsApp;
	public String monitoringMaterialNu;
	public String handlingProcedures;
	public String hoppersEntry;
	public String operatingConditions;
	public String insertionType;
	public String installationFixed;
	public String transportPlanGauge;
	public String emergencyAddition;
	public String nuclearEnviroment;
	public String fishingTool;
	public String sealedSources;
	public String abandonmentZone;
	public String servicingCopy;
	public String manufacturingDevelopment;
	public long hsraApplicationId;

}