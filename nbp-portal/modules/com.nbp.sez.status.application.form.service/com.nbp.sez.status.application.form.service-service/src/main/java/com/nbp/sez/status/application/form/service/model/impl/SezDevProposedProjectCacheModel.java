/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezDevProposedProject;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezDevProposedProject in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezDevProposedProjectCacheModel
	implements CacheModel<SezDevProposedProject>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezDevProposedProjectCacheModel)) {
			return false;
		}

		SezDevProposedProjectCacheModel sezDevProposedProjectCacheModel =
			(SezDevProposedProjectCacheModel)object;

		if (sezDevProposedProjectId ==
				sezDevProposedProjectCacheModel.sezDevProposedProjectId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezDevProposedProjectId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(79);

		sb.append("{sezDevProposedProjectId=");
		sb.append(sezDevProposedProjectId);
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
		sb.append(", previouslyFreeZone=");
		sb.append(previouslyFreeZone);
		sb.append(", curentlyOperatingZone=");
		sb.append(curentlyOperatingZone);
		sb.append(", businessConductedZone=");
		sb.append(businessConductedZone);
		sb.append(", locally=");
		sb.append(locally);
		sb.append(", overseas=");
		sb.append(overseas);
		sb.append(", proposedName=");
		sb.append(proposedName);
		sb.append(", specialEconomicZone=");
		sb.append(specialEconomicZone);
		sb.append(", pleaseDescribe=");
		sb.append(pleaseDescribe);
		sb.append(", seaPortKm=");
		sb.append(seaPortKm);
		sb.append(", seaPortMi=");
		sb.append(seaPortMi);
		sb.append(", airportKm=");
		sb.append(airportKm);
		sb.append(", airportMi=");
		sb.append(airportMi);
		sb.append(", roadKm=");
		sb.append(roadKm);
		sb.append(", roadMi=");
		sb.append(roadMi);
		sb.append(", railKm=");
		sb.append(railKm);
		sb.append(", railMi=");
		sb.append(railMi);
		sb.append(", customProcessingKm=");
		sb.append(customProcessingKm);
		sb.append(", customProcessingMi=");
		sb.append(customProcessingMi);
		sb.append(", indicateTheLandMeasurement=");
		sb.append(indicateTheLandMeasurement);
		sb.append(", building=");
		sb.append(building);
		sb.append(", landArea=");
		sb.append(landArea);
		sb.append(", ownerShip=");
		sb.append(ownerShip);
		sb.append(", otherPleaseSpecify=");
		sb.append(otherPleaseSpecify);
		sb.append(", landOwnerName=");
		sb.append(landOwnerName);
		sb.append(", lnadOwnerAddressOne=");
		sb.append(lnadOwnerAddressOne);
		sb.append(", lnadOwnerAddressTwo=");
		sb.append(lnadOwnerAddressTwo);
		sb.append(", lnadOwnerTenure=");
		sb.append(lnadOwnerTenure);
		sb.append(", stepToAcquireLand=");
		sb.append(stepToAcquireLand);
		sb.append(", stateWheatherTheProposedArea=");
		sb.append(stateWheatherTheProposedArea);
		sb.append(", applicantPreviously=");
		sb.append(applicantPreviously);
		sb.append(", pleaseProvideBrief=");
		sb.append(pleaseProvideBrief);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezDevProposedProject toEntityModel() {
		SezDevProposedProjectImpl sezDevProposedProjectImpl =
			new SezDevProposedProjectImpl();

		sezDevProposedProjectImpl.setSezDevProposedProjectId(
			sezDevProposedProjectId);
		sezDevProposedProjectImpl.setGroupId(groupId);
		sezDevProposedProjectImpl.setCompanyId(companyId);
		sezDevProposedProjectImpl.setUserId(userId);

		if (userName == null) {
			sezDevProposedProjectImpl.setUserName("");
		}
		else {
			sezDevProposedProjectImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezDevProposedProjectImpl.setCreateDate(null);
		}
		else {
			sezDevProposedProjectImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezDevProposedProjectImpl.setModifiedDate(null);
		}
		else {
			sezDevProposedProjectImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (previouslyFreeZone == null) {
			sezDevProposedProjectImpl.setPreviouslyFreeZone("");
		}
		else {
			sezDevProposedProjectImpl.setPreviouslyFreeZone(previouslyFreeZone);
		}

		if (curentlyOperatingZone == null) {
			sezDevProposedProjectImpl.setCurentlyOperatingZone("");
		}
		else {
			sezDevProposedProjectImpl.setCurentlyOperatingZone(
				curentlyOperatingZone);
		}

		if (businessConductedZone == null) {
			sezDevProposedProjectImpl.setBusinessConductedZone("");
		}
		else {
			sezDevProposedProjectImpl.setBusinessConductedZone(
				businessConductedZone);
		}

		if (locally == null) {
			sezDevProposedProjectImpl.setLocally("");
		}
		else {
			sezDevProposedProjectImpl.setLocally(locally);
		}

		if (overseas == null) {
			sezDevProposedProjectImpl.setOverseas("");
		}
		else {
			sezDevProposedProjectImpl.setOverseas(overseas);
		}

		if (proposedName == null) {
			sezDevProposedProjectImpl.setProposedName("");
		}
		else {
			sezDevProposedProjectImpl.setProposedName(proposedName);
		}

		if (specialEconomicZone == null) {
			sezDevProposedProjectImpl.setSpecialEconomicZone("");
		}
		else {
			sezDevProposedProjectImpl.setSpecialEconomicZone(
				specialEconomicZone);
		}

		if (pleaseDescribe == null) {
			sezDevProposedProjectImpl.setPleaseDescribe("");
		}
		else {
			sezDevProposedProjectImpl.setPleaseDescribe(pleaseDescribe);
		}

		if (seaPortKm == null) {
			sezDevProposedProjectImpl.setSeaPortKm("");
		}
		else {
			sezDevProposedProjectImpl.setSeaPortKm(seaPortKm);
		}

		if (seaPortMi == null) {
			sezDevProposedProjectImpl.setSeaPortMi("");
		}
		else {
			sezDevProposedProjectImpl.setSeaPortMi(seaPortMi);
		}

		if (airportKm == null) {
			sezDevProposedProjectImpl.setAirportKm("");
		}
		else {
			sezDevProposedProjectImpl.setAirportKm(airportKm);
		}

		if (airportMi == null) {
			sezDevProposedProjectImpl.setAirportMi("");
		}
		else {
			sezDevProposedProjectImpl.setAirportMi(airportMi);
		}

		if (roadKm == null) {
			sezDevProposedProjectImpl.setRoadKm("");
		}
		else {
			sezDevProposedProjectImpl.setRoadKm(roadKm);
		}

		if (roadMi == null) {
			sezDevProposedProjectImpl.setRoadMi("");
		}
		else {
			sezDevProposedProjectImpl.setRoadMi(roadMi);
		}

		if (railKm == null) {
			sezDevProposedProjectImpl.setRailKm("");
		}
		else {
			sezDevProposedProjectImpl.setRailKm(railKm);
		}

		if (railMi == null) {
			sezDevProposedProjectImpl.setRailMi("");
		}
		else {
			sezDevProposedProjectImpl.setRailMi(railMi);
		}

		if (customProcessingKm == null) {
			sezDevProposedProjectImpl.setCustomProcessingKm("");
		}
		else {
			sezDevProposedProjectImpl.setCustomProcessingKm(customProcessingKm);
		}

		if (customProcessingMi == null) {
			sezDevProposedProjectImpl.setCustomProcessingMi("");
		}
		else {
			sezDevProposedProjectImpl.setCustomProcessingMi(customProcessingMi);
		}

		if (indicateTheLandMeasurement == null) {
			sezDevProposedProjectImpl.setIndicateTheLandMeasurement("");
		}
		else {
			sezDevProposedProjectImpl.setIndicateTheLandMeasurement(
				indicateTheLandMeasurement);
		}

		if (building == null) {
			sezDevProposedProjectImpl.setBuilding("");
		}
		else {
			sezDevProposedProjectImpl.setBuilding(building);
		}

		if (landArea == null) {
			sezDevProposedProjectImpl.setLandArea("");
		}
		else {
			sezDevProposedProjectImpl.setLandArea(landArea);
		}

		if (ownerShip == null) {
			sezDevProposedProjectImpl.setOwnerShip("");
		}
		else {
			sezDevProposedProjectImpl.setOwnerShip(ownerShip);
		}

		if (otherPleaseSpecify == null) {
			sezDevProposedProjectImpl.setOtherPleaseSpecify("");
		}
		else {
			sezDevProposedProjectImpl.setOtherPleaseSpecify(otherPleaseSpecify);
		}

		if (landOwnerName == null) {
			sezDevProposedProjectImpl.setLandOwnerName("");
		}
		else {
			sezDevProposedProjectImpl.setLandOwnerName(landOwnerName);
		}

		if (lnadOwnerAddressOne == null) {
			sezDevProposedProjectImpl.setLnadOwnerAddressOne("");
		}
		else {
			sezDevProposedProjectImpl.setLnadOwnerAddressOne(
				lnadOwnerAddressOne);
		}

		if (lnadOwnerAddressTwo == null) {
			sezDevProposedProjectImpl.setLnadOwnerAddressTwo("");
		}
		else {
			sezDevProposedProjectImpl.setLnadOwnerAddressTwo(
				lnadOwnerAddressTwo);
		}

		if (lnadOwnerTenure == null) {
			sezDevProposedProjectImpl.setLnadOwnerTenure("");
		}
		else {
			sezDevProposedProjectImpl.setLnadOwnerTenure(lnadOwnerTenure);
		}

		if (stepToAcquireLand == null) {
			sezDevProposedProjectImpl.setStepToAcquireLand("");
		}
		else {
			sezDevProposedProjectImpl.setStepToAcquireLand(stepToAcquireLand);
		}

		if (stateWheatherTheProposedArea == null) {
			sezDevProposedProjectImpl.setStateWheatherTheProposedArea("");
		}
		else {
			sezDevProposedProjectImpl.setStateWheatherTheProposedArea(
				stateWheatherTheProposedArea);
		}

		if (applicantPreviously == null) {
			sezDevProposedProjectImpl.setApplicantPreviously("");
		}
		else {
			sezDevProposedProjectImpl.setApplicantPreviously(
				applicantPreviously);
		}

		if (pleaseProvideBrief == null) {
			sezDevProposedProjectImpl.setPleaseProvideBrief("");
		}
		else {
			sezDevProposedProjectImpl.setPleaseProvideBrief(pleaseProvideBrief);
		}

		sezDevProposedProjectImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezDevProposedProjectImpl.resetOriginalValues();

		return sezDevProposedProjectImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezDevProposedProjectId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		previouslyFreeZone = objectInput.readUTF();
		curentlyOperatingZone = objectInput.readUTF();
		businessConductedZone = objectInput.readUTF();
		locally = objectInput.readUTF();
		overseas = objectInput.readUTF();
		proposedName = objectInput.readUTF();
		specialEconomicZone = objectInput.readUTF();
		pleaseDescribe = objectInput.readUTF();
		seaPortKm = objectInput.readUTF();
		seaPortMi = objectInput.readUTF();
		airportKm = objectInput.readUTF();
		airportMi = objectInput.readUTF();
		roadKm = objectInput.readUTF();
		roadMi = objectInput.readUTF();
		railKm = objectInput.readUTF();
		railMi = objectInput.readUTF();
		customProcessingKm = objectInput.readUTF();
		customProcessingMi = objectInput.readUTF();
		indicateTheLandMeasurement = objectInput.readUTF();
		building = objectInput.readUTF();
		landArea = objectInput.readUTF();
		ownerShip = objectInput.readUTF();
		otherPleaseSpecify = objectInput.readUTF();
		landOwnerName = objectInput.readUTF();
		lnadOwnerAddressOne = objectInput.readUTF();
		lnadOwnerAddressTwo = objectInput.readUTF();
		lnadOwnerTenure = objectInput.readUTF();
		stepToAcquireLand = objectInput.readUTF();
		stateWheatherTheProposedArea = objectInput.readUTF();
		applicantPreviously = objectInput.readUTF();
		pleaseProvideBrief = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezDevProposedProjectId);

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

		if (previouslyFreeZone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(previouslyFreeZone);
		}

		if (curentlyOperatingZone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(curentlyOperatingZone);
		}

		if (businessConductedZone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(businessConductedZone);
		}

		if (locally == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(locally);
		}

		if (overseas == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(overseas);
		}

		if (proposedName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(proposedName);
		}

		if (specialEconomicZone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(specialEconomicZone);
		}

		if (pleaseDescribe == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pleaseDescribe);
		}

		if (seaPortKm == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(seaPortKm);
		}

		if (seaPortMi == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(seaPortMi);
		}

		if (airportKm == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(airportKm);
		}

		if (airportMi == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(airportMi);
		}

		if (roadKm == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(roadKm);
		}

		if (roadMi == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(roadMi);
		}

		if (railKm == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(railKm);
		}

		if (railMi == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(railMi);
		}

		if (customProcessingKm == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customProcessingKm);
		}

		if (customProcessingMi == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customProcessingMi);
		}

		if (indicateTheLandMeasurement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indicateTheLandMeasurement);
		}

		if (building == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(building);
		}

		if (landArea == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landArea);
		}

		if (ownerShip == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ownerShip);
		}

		if (otherPleaseSpecify == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherPleaseSpecify);
		}

		if (landOwnerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landOwnerName);
		}

		if (lnadOwnerAddressOne == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lnadOwnerAddressOne);
		}

		if (lnadOwnerAddressTwo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lnadOwnerAddressTwo);
		}

		if (lnadOwnerTenure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lnadOwnerTenure);
		}

		if (stepToAcquireLand == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(stepToAcquireLand);
		}

		if (stateWheatherTheProposedArea == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(stateWheatherTheProposedArea);
		}

		if (applicantPreviously == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantPreviously);
		}

		if (pleaseProvideBrief == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pleaseProvideBrief);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezDevProposedProjectId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String previouslyFreeZone;
	public String curentlyOperatingZone;
	public String businessConductedZone;
	public String locally;
	public String overseas;
	public String proposedName;
	public String specialEconomicZone;
	public String pleaseDescribe;
	public String seaPortKm;
	public String seaPortMi;
	public String airportKm;
	public String airportMi;
	public String roadKm;
	public String roadMi;
	public String railKm;
	public String railMi;
	public String customProcessingKm;
	public String customProcessingMi;
	public String indicateTheLandMeasurement;
	public String building;
	public String landArea;
	public String ownerShip;
	public String otherPleaseSpecify;
	public String landOwnerName;
	public String lnadOwnerAddressOne;
	public String lnadOwnerAddressTwo;
	public String lnadOwnerTenure;
	public String stepToAcquireLand;
	public String stateWheatherTheProposedArea;
	public String applicantPreviously;
	public String pleaseProvideBrief;
	public long sezStatusApplicationId;

}