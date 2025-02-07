/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.RadiationSafetyProgram;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RadiationSafetyProgram in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RadiationSafetyProgramCacheModel
	implements CacheModel<RadiationSafetyProgram>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RadiationSafetyProgramCacheModel)) {
			return false;
		}

		RadiationSafetyProgramCacheModel radiationSafetyProgramCacheModel =
			(RadiationSafetyProgramCacheModel)object;

		if (radiationSafetyProgramId ==
				radiationSafetyProgramCacheModel.radiationSafetyProgramId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, radiationSafetyProgramId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(121);

		sb.append("{radiationSafetyProgramId=");
		sb.append(radiationSafetyProgramId);
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
		sb.append(", nuclearRsoName=");
		sb.append(nuclearRsoName);
		sb.append(", nuclearRsoTitle=");
		sb.append(nuclearRsoTitle);
		sb.append(", nuclearRsoTeleNo=");
		sb.append(nuclearRsoTeleNo);
		sb.append(", nuclearRsoExt=");
		sb.append(nuclearRsoExt);
		sb.append(", nuclearRsoFax=");
		sb.append(nuclearRsoFax);
		sb.append(", nuclearRsoEmail=");
		sb.append(nuclearRsoEmail);
		sb.append(", rsoDetails=");
		sb.append(rsoDetails);
		sb.append(", qualifiedExpertName=");
		sb.append(qualifiedExpertName);
		sb.append(", qualifiedExpertTitle=");
		sb.append(qualifiedExpertTitle);
		sb.append(", qualifiedExpertTele=");
		sb.append(qualifiedExpertTele);
		sb.append(", qualifiedExpertExt=");
		sb.append(qualifiedExpertExt);
		sb.append(", qualifiedExpertFax=");
		sb.append(qualifiedExpertFax);
		sb.append(", qualifiedExpertEmail=");
		sb.append(qualifiedExpertEmail);
		sb.append(", qualifiedExpertRegstNo=");
		sb.append(qualifiedExpertRegstNo);
		sb.append(", qualifiedExpertDate=");
		sb.append(qualifiedExpertDate);
		sb.append(", qualifiedDetails=");
		sb.append(qualifiedDetails);
		sb.append(", applicantName=");
		sb.append(applicantName);
		sb.append(", applicantTitle=");
		sb.append(applicantTitle);
		sb.append(", otherLimitationAuth=");
		sb.append(otherLimitationAuth);
		sb.append(", otherDate=");
		sb.append(otherDate);
		sb.append(", classifiWorkersList=");
		sb.append(classifiWorkersList);
		sb.append(", respiPleaseSpecify=");
		sb.append(respiPleaseSpecify);
		sb.append(", tongsPleaseSpecify=");
		sb.append(tongsPleaseSpecify);
		sb.append(", scopeOfActivities=");
		sb.append(scopeOfActivities);
		sb.append(", managementSystem=");
		sb.append(managementSystem);
		sb.append(", workerRecordings=");
		sb.append(workerRecordings);
		sb.append(", categoriesLicence=");
		sb.append(categoriesLicence);
		sb.append(", renewalsSummary=");
		sb.append(renewalsSummary);
		sb.append(", constraintsLimits=");
		sb.append(constraintsLimits);
		sb.append(", equipmentMonitoring=");
		sb.append(equipmentMonitoring);
		sb.append(", areasControl=");
		sb.append(areasControl);
		sb.append(", radioactiveSources=");
		sb.append(radioactiveSources);
		sb.append(", radiationiInstruments=");
		sb.append(radiationiInstruments);
		sb.append(", healthWorkers=");
		sb.append(healthWorkers);
		sb.append(", investigationLevel=");
		sb.append(investigationLevel);
		sb.append(", policyDetails=");
		sb.append(policyDetails);
		sb.append(", securityAccess=");
		sb.append(securityAccess);
		sb.append(", raditionSources=");
		sb.append(raditionSources);
		sb.append(", workerTraining=");
		sb.append(workerTraining);
		sb.append(", publicControl=");
		sb.append(publicControl);
		sb.append(", managementSources=");
		sb.append(managementSources);
		sb.append(", emergencyProcedure=");
		sb.append(emergencyProcedure);
		sb.append(", licenceLocation=");
		sb.append(licenceLocation);
		sb.append(", achievableProgram=");
		sb.append(achievableProgram);
		sb.append(", leakedTestingSources=");
		sb.append(leakedTestingSources);
		sb.append(", transferSources=");
		sb.append(transferSources);
		sb.append(", nuclearMaterials=");
		sb.append(nuclearMaterials);
		sb.append(", transportPackaging=");
		sb.append(transportPackaging);
		sb.append(", internalReview=");
		sb.append(internalReview);
		sb.append(", sourcesActivities=");
		sb.append(sourcesActivities);
		sb.append(", individualProtectiveEquipment=");
		sb.append(individualProtectiveEquipment);
		sb.append(", ResProPleaseSpecify=");
		sb.append(ResProPleaseSpecify);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RadiationSafetyProgram toEntityModel() {
		RadiationSafetyProgramImpl radiationSafetyProgramImpl =
			new RadiationSafetyProgramImpl();

		radiationSafetyProgramImpl.setRadiationSafetyProgramId(
			radiationSafetyProgramId);
		radiationSafetyProgramImpl.setGroupId(groupId);
		radiationSafetyProgramImpl.setCompanyId(companyId);
		radiationSafetyProgramImpl.setUserId(userId);

		if (userName == null) {
			radiationSafetyProgramImpl.setUserName("");
		}
		else {
			radiationSafetyProgramImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			radiationSafetyProgramImpl.setCreateDate(null);
		}
		else {
			radiationSafetyProgramImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			radiationSafetyProgramImpl.setModifiedDate(null);
		}
		else {
			radiationSafetyProgramImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nuclearRsoName == null) {
			radiationSafetyProgramImpl.setNuclearRsoName("");
		}
		else {
			radiationSafetyProgramImpl.setNuclearRsoName(nuclearRsoName);
		}

		if (nuclearRsoTitle == null) {
			radiationSafetyProgramImpl.setNuclearRsoTitle("");
		}
		else {
			radiationSafetyProgramImpl.setNuclearRsoTitle(nuclearRsoTitle);
		}

		if (nuclearRsoTeleNo == null) {
			radiationSafetyProgramImpl.setNuclearRsoTeleNo("");
		}
		else {
			radiationSafetyProgramImpl.setNuclearRsoTeleNo(nuclearRsoTeleNo);
		}

		if (nuclearRsoExt == null) {
			radiationSafetyProgramImpl.setNuclearRsoExt("");
		}
		else {
			radiationSafetyProgramImpl.setNuclearRsoExt(nuclearRsoExt);
		}

		if (nuclearRsoFax == null) {
			radiationSafetyProgramImpl.setNuclearRsoFax("");
		}
		else {
			radiationSafetyProgramImpl.setNuclearRsoFax(nuclearRsoFax);
		}

		if (nuclearRsoEmail == null) {
			radiationSafetyProgramImpl.setNuclearRsoEmail("");
		}
		else {
			radiationSafetyProgramImpl.setNuclearRsoEmail(nuclearRsoEmail);
		}

		if (rsoDetails == null) {
			radiationSafetyProgramImpl.setRsoDetails("");
		}
		else {
			radiationSafetyProgramImpl.setRsoDetails(rsoDetails);
		}

		if (qualifiedExpertName == null) {
			radiationSafetyProgramImpl.setQualifiedExpertName("");
		}
		else {
			radiationSafetyProgramImpl.setQualifiedExpertName(
				qualifiedExpertName);
		}

		if (qualifiedExpertTitle == null) {
			radiationSafetyProgramImpl.setQualifiedExpertTitle("");
		}
		else {
			radiationSafetyProgramImpl.setQualifiedExpertTitle(
				qualifiedExpertTitle);
		}

		if (qualifiedExpertTele == null) {
			radiationSafetyProgramImpl.setQualifiedExpertTele("");
		}
		else {
			radiationSafetyProgramImpl.setQualifiedExpertTele(
				qualifiedExpertTele);
		}

		if (qualifiedExpertExt == null) {
			radiationSafetyProgramImpl.setQualifiedExpertExt("");
		}
		else {
			radiationSafetyProgramImpl.setQualifiedExpertExt(
				qualifiedExpertExt);
		}

		if (qualifiedExpertFax == null) {
			radiationSafetyProgramImpl.setQualifiedExpertFax("");
		}
		else {
			radiationSafetyProgramImpl.setQualifiedExpertFax(
				qualifiedExpertFax);
		}

		if (qualifiedExpertEmail == null) {
			radiationSafetyProgramImpl.setQualifiedExpertEmail("");
		}
		else {
			radiationSafetyProgramImpl.setQualifiedExpertEmail(
				qualifiedExpertEmail);
		}

		if (qualifiedExpertRegstNo == null) {
			radiationSafetyProgramImpl.setQualifiedExpertRegstNo("");
		}
		else {
			radiationSafetyProgramImpl.setQualifiedExpertRegstNo(
				qualifiedExpertRegstNo);
		}

		if (qualifiedExpertDate == Long.MIN_VALUE) {
			radiationSafetyProgramImpl.setQualifiedExpertDate(null);
		}
		else {
			radiationSafetyProgramImpl.setQualifiedExpertDate(
				new Date(qualifiedExpertDate));
		}

		if (qualifiedDetails == null) {
			radiationSafetyProgramImpl.setQualifiedDetails("");
		}
		else {
			radiationSafetyProgramImpl.setQualifiedDetails(qualifiedDetails);
		}

		if (applicantName == null) {
			radiationSafetyProgramImpl.setApplicantName("");
		}
		else {
			radiationSafetyProgramImpl.setApplicantName(applicantName);
		}

		if (applicantTitle == null) {
			radiationSafetyProgramImpl.setApplicantTitle("");
		}
		else {
			radiationSafetyProgramImpl.setApplicantTitle(applicantTitle);
		}

		if (otherLimitationAuth == null) {
			radiationSafetyProgramImpl.setOtherLimitationAuth("");
		}
		else {
			radiationSafetyProgramImpl.setOtherLimitationAuth(
				otherLimitationAuth);
		}

		if (otherDate == Long.MIN_VALUE) {
			radiationSafetyProgramImpl.setOtherDate(null);
		}
		else {
			radiationSafetyProgramImpl.setOtherDate(new Date(otherDate));
		}

		if (classifiWorkersList == null) {
			radiationSafetyProgramImpl.setClassifiWorkersList("");
		}
		else {
			radiationSafetyProgramImpl.setClassifiWorkersList(
				classifiWorkersList);
		}

		if (respiPleaseSpecify == null) {
			radiationSafetyProgramImpl.setRespiPleaseSpecify("");
		}
		else {
			radiationSafetyProgramImpl.setRespiPleaseSpecify(
				respiPleaseSpecify);
		}

		if (tongsPleaseSpecify == null) {
			radiationSafetyProgramImpl.setTongsPleaseSpecify("");
		}
		else {
			radiationSafetyProgramImpl.setTongsPleaseSpecify(
				tongsPleaseSpecify);
		}

		if (scopeOfActivities == null) {
			radiationSafetyProgramImpl.setScopeOfActivities("");
		}
		else {
			radiationSafetyProgramImpl.setScopeOfActivities(scopeOfActivities);
		}

		if (managementSystem == null) {
			radiationSafetyProgramImpl.setManagementSystem("");
		}
		else {
			radiationSafetyProgramImpl.setManagementSystem(managementSystem);
		}

		if (workerRecordings == null) {
			radiationSafetyProgramImpl.setWorkerRecordings("");
		}
		else {
			radiationSafetyProgramImpl.setWorkerRecordings(workerRecordings);
		}

		if (categoriesLicence == null) {
			radiationSafetyProgramImpl.setCategoriesLicence("");
		}
		else {
			radiationSafetyProgramImpl.setCategoriesLicence(categoriesLicence);
		}

		if (renewalsSummary == null) {
			radiationSafetyProgramImpl.setRenewalsSummary("");
		}
		else {
			radiationSafetyProgramImpl.setRenewalsSummary(renewalsSummary);
		}

		if (constraintsLimits == null) {
			radiationSafetyProgramImpl.setConstraintsLimits("");
		}
		else {
			radiationSafetyProgramImpl.setConstraintsLimits(constraintsLimits);
		}

		if (equipmentMonitoring == null) {
			radiationSafetyProgramImpl.setEquipmentMonitoring("");
		}
		else {
			radiationSafetyProgramImpl.setEquipmentMonitoring(
				equipmentMonitoring);
		}

		if (areasControl == null) {
			radiationSafetyProgramImpl.setAreasControl("");
		}
		else {
			radiationSafetyProgramImpl.setAreasControl(areasControl);
		}

		if (radioactiveSources == null) {
			radiationSafetyProgramImpl.setRadioactiveSources("");
		}
		else {
			radiationSafetyProgramImpl.setRadioactiveSources(
				radioactiveSources);
		}

		if (radiationiInstruments == null) {
			radiationSafetyProgramImpl.setRadiationiInstruments("");
		}
		else {
			radiationSafetyProgramImpl.setRadiationiInstruments(
				radiationiInstruments);
		}

		if (healthWorkers == null) {
			radiationSafetyProgramImpl.setHealthWorkers("");
		}
		else {
			radiationSafetyProgramImpl.setHealthWorkers(healthWorkers);
		}

		if (investigationLevel == null) {
			radiationSafetyProgramImpl.setInvestigationLevel("");
		}
		else {
			radiationSafetyProgramImpl.setInvestigationLevel(
				investigationLevel);
		}

		if (policyDetails == null) {
			radiationSafetyProgramImpl.setPolicyDetails("");
		}
		else {
			radiationSafetyProgramImpl.setPolicyDetails(policyDetails);
		}

		if (securityAccess == null) {
			radiationSafetyProgramImpl.setSecurityAccess("");
		}
		else {
			radiationSafetyProgramImpl.setSecurityAccess(securityAccess);
		}

		if (raditionSources == null) {
			radiationSafetyProgramImpl.setRaditionSources("");
		}
		else {
			radiationSafetyProgramImpl.setRaditionSources(raditionSources);
		}

		if (workerTraining == null) {
			radiationSafetyProgramImpl.setWorkerTraining("");
		}
		else {
			radiationSafetyProgramImpl.setWorkerTraining(workerTraining);
		}

		if (publicControl == null) {
			radiationSafetyProgramImpl.setPublicControl("");
		}
		else {
			radiationSafetyProgramImpl.setPublicControl(publicControl);
		}

		if (managementSources == null) {
			radiationSafetyProgramImpl.setManagementSources("");
		}
		else {
			radiationSafetyProgramImpl.setManagementSources(managementSources);
		}

		if (emergencyProcedure == null) {
			radiationSafetyProgramImpl.setEmergencyProcedure("");
		}
		else {
			radiationSafetyProgramImpl.setEmergencyProcedure(
				emergencyProcedure);
		}

		if (licenceLocation == null) {
			radiationSafetyProgramImpl.setLicenceLocation("");
		}
		else {
			radiationSafetyProgramImpl.setLicenceLocation(licenceLocation);
		}

		if (achievableProgram == null) {
			radiationSafetyProgramImpl.setAchievableProgram("");
		}
		else {
			radiationSafetyProgramImpl.setAchievableProgram(achievableProgram);
		}

		if (leakedTestingSources == null) {
			radiationSafetyProgramImpl.setLeakedTestingSources("");
		}
		else {
			radiationSafetyProgramImpl.setLeakedTestingSources(
				leakedTestingSources);
		}

		if (transferSources == null) {
			radiationSafetyProgramImpl.setTransferSources("");
		}
		else {
			radiationSafetyProgramImpl.setTransferSources(transferSources);
		}

		if (nuclearMaterials == null) {
			radiationSafetyProgramImpl.setNuclearMaterials("");
		}
		else {
			radiationSafetyProgramImpl.setNuclearMaterials(nuclearMaterials);
		}

		if (transportPackaging == null) {
			radiationSafetyProgramImpl.setTransportPackaging("");
		}
		else {
			radiationSafetyProgramImpl.setTransportPackaging(
				transportPackaging);
		}

		if (internalReview == null) {
			radiationSafetyProgramImpl.setInternalReview("");
		}
		else {
			radiationSafetyProgramImpl.setInternalReview(internalReview);
		}

		if (sourcesActivities == null) {
			radiationSafetyProgramImpl.setSourcesActivities("");
		}
		else {
			radiationSafetyProgramImpl.setSourcesActivities(sourcesActivities);
		}

		if (individualProtectiveEquipment == null) {
			radiationSafetyProgramImpl.setIndividualProtectiveEquipment("");
		}
		else {
			radiationSafetyProgramImpl.setIndividualProtectiveEquipment(
				individualProtectiveEquipment);
		}

		if (ResProPleaseSpecify == null) {
			radiationSafetyProgramImpl.setResProPleaseSpecify("");
		}
		else {
			radiationSafetyProgramImpl.setResProPleaseSpecify(
				ResProPleaseSpecify);
		}

		radiationSafetyProgramImpl.setHsraApplicationId(hsraApplicationId);

		radiationSafetyProgramImpl.resetOriginalValues();

		return radiationSafetyProgramImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		radiationSafetyProgramId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nuclearRsoName = objectInput.readUTF();
		nuclearRsoTitle = objectInput.readUTF();
		nuclearRsoTeleNo = objectInput.readUTF();
		nuclearRsoExt = objectInput.readUTF();
		nuclearRsoFax = objectInput.readUTF();
		nuclearRsoEmail = objectInput.readUTF();
		rsoDetails = objectInput.readUTF();
		qualifiedExpertName = objectInput.readUTF();
		qualifiedExpertTitle = objectInput.readUTF();
		qualifiedExpertTele = objectInput.readUTF();
		qualifiedExpertExt = objectInput.readUTF();
		qualifiedExpertFax = objectInput.readUTF();
		qualifiedExpertEmail = objectInput.readUTF();
		qualifiedExpertRegstNo = objectInput.readUTF();
		qualifiedExpertDate = objectInput.readLong();
		qualifiedDetails = objectInput.readUTF();
		applicantName = objectInput.readUTF();
		applicantTitle = objectInput.readUTF();
		otherLimitationAuth = objectInput.readUTF();
		otherDate = objectInput.readLong();
		classifiWorkersList = objectInput.readUTF();
		respiPleaseSpecify = objectInput.readUTF();
		tongsPleaseSpecify = objectInput.readUTF();
		scopeOfActivities = objectInput.readUTF();
		managementSystem = objectInput.readUTF();
		workerRecordings = objectInput.readUTF();
		categoriesLicence = objectInput.readUTF();
		renewalsSummary = objectInput.readUTF();
		constraintsLimits = objectInput.readUTF();
		equipmentMonitoring = objectInput.readUTF();
		areasControl = objectInput.readUTF();
		radioactiveSources = objectInput.readUTF();
		radiationiInstruments = objectInput.readUTF();
		healthWorkers = objectInput.readUTF();
		investigationLevel = objectInput.readUTF();
		policyDetails = objectInput.readUTF();
		securityAccess = objectInput.readUTF();
		raditionSources = objectInput.readUTF();
		workerTraining = objectInput.readUTF();
		publicControl = objectInput.readUTF();
		managementSources = objectInput.readUTF();
		emergencyProcedure = objectInput.readUTF();
		licenceLocation = objectInput.readUTF();
		achievableProgram = objectInput.readUTF();
		leakedTestingSources = objectInput.readUTF();
		transferSources = objectInput.readUTF();
		nuclearMaterials = objectInput.readUTF();
		transportPackaging = objectInput.readUTF();
		internalReview = objectInput.readUTF();
		sourcesActivities = objectInput.readUTF();
		individualProtectiveEquipment = objectInput.readUTF();
		ResProPleaseSpecify = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(radiationSafetyProgramId);

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

		if (nuclearRsoName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearRsoName);
		}

		if (nuclearRsoTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearRsoTitle);
		}

		if (nuclearRsoTeleNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearRsoTeleNo);
		}

		if (nuclearRsoExt == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearRsoExt);
		}

		if (nuclearRsoFax == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearRsoFax);
		}

		if (nuclearRsoEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearRsoEmail);
		}

		if (rsoDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rsoDetails);
		}

		if (qualifiedExpertName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifiedExpertName);
		}

		if (qualifiedExpertTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifiedExpertTitle);
		}

		if (qualifiedExpertTele == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifiedExpertTele);
		}

		if (qualifiedExpertExt == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifiedExpertExt);
		}

		if (qualifiedExpertFax == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifiedExpertFax);
		}

		if (qualifiedExpertEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifiedExpertEmail);
		}

		if (qualifiedExpertRegstNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifiedExpertRegstNo);
		}

		objectOutput.writeLong(qualifiedExpertDate);

		if (qualifiedDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifiedDetails);
		}

		if (applicantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantName);
		}

		if (applicantTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantTitle);
		}

		if (otherLimitationAuth == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherLimitationAuth);
		}

		objectOutput.writeLong(otherDate);

		if (classifiWorkersList == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(classifiWorkersList);
		}

		if (respiPleaseSpecify == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(respiPleaseSpecify);
		}

		if (tongsPleaseSpecify == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tongsPleaseSpecify);
		}

		if (scopeOfActivities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(scopeOfActivities);
		}

		if (managementSystem == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(managementSystem);
		}

		if (workerRecordings == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workerRecordings);
		}

		if (categoriesLicence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(categoriesLicence);
		}

		if (renewalsSummary == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewalsSummary);
		}

		if (constraintsLimits == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(constraintsLimits);
		}

		if (equipmentMonitoring == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentMonitoring);
		}

		if (areasControl == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(areasControl);
		}

		if (radioactiveSources == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(radioactiveSources);
		}

		if (radiationiInstruments == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(radiationiInstruments);
		}

		if (healthWorkers == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(healthWorkers);
		}

		if (investigationLevel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(investigationLevel);
		}

		if (policyDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(policyDetails);
		}

		if (securityAccess == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securityAccess);
		}

		if (raditionSources == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(raditionSources);
		}

		if (workerTraining == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workerTraining);
		}

		if (publicControl == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(publicControl);
		}

		if (managementSources == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(managementSources);
		}

		if (emergencyProcedure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emergencyProcedure);
		}

		if (licenceLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licenceLocation);
		}

		if (achievableProgram == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(achievableProgram);
		}

		if (leakedTestingSources == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(leakedTestingSources);
		}

		if (transferSources == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transferSources);
		}

		if (nuclearMaterials == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearMaterials);
		}

		if (transportPackaging == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transportPackaging);
		}

		if (internalReview == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(internalReview);
		}

		if (sourcesActivities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sourcesActivities);
		}

		if (individualProtectiveEquipment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(individualProtectiveEquipment);
		}

		if (ResProPleaseSpecify == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ResProPleaseSpecify);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long radiationSafetyProgramId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nuclearRsoName;
	public String nuclearRsoTitle;
	public String nuclearRsoTeleNo;
	public String nuclearRsoExt;
	public String nuclearRsoFax;
	public String nuclearRsoEmail;
	public String rsoDetails;
	public String qualifiedExpertName;
	public String qualifiedExpertTitle;
	public String qualifiedExpertTele;
	public String qualifiedExpertExt;
	public String qualifiedExpertFax;
	public String qualifiedExpertEmail;
	public String qualifiedExpertRegstNo;
	public long qualifiedExpertDate;
	public String qualifiedDetails;
	public String applicantName;
	public String applicantTitle;
	public String otherLimitationAuth;
	public long otherDate;
	public String classifiWorkersList;
	public String respiPleaseSpecify;
	public String tongsPleaseSpecify;
	public String scopeOfActivities;
	public String managementSystem;
	public String workerRecordings;
	public String categoriesLicence;
	public String renewalsSummary;
	public String constraintsLimits;
	public String equipmentMonitoring;
	public String areasControl;
	public String radioactiveSources;
	public String radiationiInstruments;
	public String healthWorkers;
	public String investigationLevel;
	public String policyDetails;
	public String securityAccess;
	public String raditionSources;
	public String workerTraining;
	public String publicControl;
	public String managementSources;
	public String emergencyProcedure;
	public String licenceLocation;
	public String achievableProgram;
	public String leakedTestingSources;
	public String transferSources;
	public String nuclearMaterials;
	public String transportPackaging;
	public String internalReview;
	public String sourcesActivities;
	public String individualProtectiveEquipment;
	public String ResProPleaseSpecify;
	public long hsraApplicationId;

}