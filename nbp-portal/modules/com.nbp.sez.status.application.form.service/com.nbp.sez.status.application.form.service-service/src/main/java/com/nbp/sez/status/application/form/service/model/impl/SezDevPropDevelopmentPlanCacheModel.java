/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezDevPropDevelopmentPlan;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezDevPropDevelopmentPlan in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezDevPropDevelopmentPlanCacheModel
	implements CacheModel<SezDevPropDevelopmentPlan>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezDevPropDevelopmentPlanCacheModel)) {
			return false;
		}

		SezDevPropDevelopmentPlanCacheModel
			sezDevPropDevelopmentPlanCacheModel =
				(SezDevPropDevelopmentPlanCacheModel)object;

		if (sezDevPropDevelopmentPlanId ==
				sezDevPropDevelopmentPlanCacheModel.
					sezDevPropDevelopmentPlanId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezDevPropDevelopmentPlanId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(117);

		sb.append("{sezDevPropDevelopmentPlanId=");
		sb.append(sezDevPropDevelopmentPlanId);
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
		sb.append(", existingBuilding=");
		sb.append(existingBuilding);
		sb.append(", existingBuildingForBusiDetail=");
		sb.append(existingBuildingForBusiDetail);
		sb.append(", activitiesForSingleEntity=");
		sb.append(activitiesForSingleEntity);
		sb.append(", volume=");
		sb.append(volume);
		sb.append(", folio=");
		sb.append(folio);
		sb.append(", buildingNum=");
		sb.append(buildingNum);
		sb.append(", townCity=");
		sb.append(townCity);
		sb.append(", zipCode=");
		sb.append(zipCode);
		sb.append(", zoningClassification=");
		sb.append(zoningClassification);
		sb.append(", landUse=");
		sb.append(landUse);
		sb.append(", sezAreaHectares=");
		sb.append(sezAreaHectares);
		sb.append(", sezAreaAcres=");
		sb.append(sezAreaAcres);
		sb.append(", customsHectares=");
		sb.append(customsHectares);
		sb.append(", customsAcres=");
		sb.append(customsAcres);
		sb.append(", topography=");
		sb.append(topography);
		sb.append(", northBoundaries=");
		sb.append(northBoundaries);
		sb.append(", eastBoundaries=");
		sb.append(eastBoundaries);
		sb.append(", westBoundaries=");
		sb.append(westBoundaries);
		sb.append(", southBoundaries=");
		sb.append(southBoundaries);
		sb.append(", customLandMeasurement=");
		sb.append(customLandMeasurement);
		sb.append(", customPercent=");
		sb.append(customPercent);
		sb.append(", commonLandMeasurement=");
		sb.append(commonLandMeasurement);
		sb.append(", commonPercent=");
		sb.append(commonPercent);
		sb.append(", bufferLandMeasurement=");
		sb.append(bufferLandMeasurement);
		sb.append(", bufferPercent=");
		sb.append(bufferPercent);
		sb.append(", zoneLandMeasurement=");
		sb.append(zoneLandMeasurement);
		sb.append(", zonePercent=");
		sb.append(zonePercent);
		sb.append(", ResidentialLandMeasurement=");
		sb.append(ResidentialLandMeasurement);
		sb.append(", ResidentialPercent=");
		sb.append(ResidentialPercent);
		sb.append(", totalLandMeasurement=");
		sb.append(totalLandMeasurement);
		sb.append(", totalPercent=");
		sb.append(totalPercent);
		sb.append(", industrialProcess=");
		sb.append(industrialProcess);
		sb.append(", drinkingPurpose=");
		sb.append(drinkingPurpose);
		sb.append(", otherSpecify=");
		sb.append(otherSpecify);
		sb.append(", totalRequirement=");
		sb.append(totalRequirement);
		sb.append(", quantumAndNature=");
		sb.append(quantumAndNature);
		sb.append(", specifyWhetherOwn=");
		sb.append(specifyWhetherOwn);
		sb.append(", reqOfPower=");
		sb.append(reqOfPower);
		sb.append(", mainRoadRowWidth=");
		sb.append(mainRoadRowWidth);
		sb.append(", mainRoadTypeOfPavement=");
		sb.append(mainRoadTypeOfPavement);
		sb.append(", secondRowWidhth=");
		sb.append(secondRowWidhth);
		sb.append(", secondTypeOfPavement=");
		sb.append(secondTypeOfPavement);
		sb.append(", tertiaryRowWidhth=");
		sb.append(tertiaryRowWidhth);
		sb.append(", tertiaryTypeOfPavement=");
		sb.append(tertiaryTypeOfPavement);
		sb.append(", waterInstallationReq=");
		sb.append(waterInstallationReq);
		sb.append(", powerInstallationReq=");
		sb.append(powerInstallationReq);
		sb.append(", teleComInstallationReq=");
		sb.append(teleComInstallationReq);
		sb.append(", cctvInstallationReq=");
		sb.append(cctvInstallationReq);
		sb.append(", securityInterconnection=");
		sb.append(securityInterconnection);
		sb.append(", fireFightingInstallationReq=");
		sb.append(fireFightingInstallationReq);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezDevPropDevelopmentPlan toEntityModel() {
		SezDevPropDevelopmentPlanImpl sezDevPropDevelopmentPlanImpl =
			new SezDevPropDevelopmentPlanImpl();

		sezDevPropDevelopmentPlanImpl.setSezDevPropDevelopmentPlanId(
			sezDevPropDevelopmentPlanId);
		sezDevPropDevelopmentPlanImpl.setGroupId(groupId);
		sezDevPropDevelopmentPlanImpl.setCompanyId(companyId);
		sezDevPropDevelopmentPlanImpl.setUserId(userId);

		if (userName == null) {
			sezDevPropDevelopmentPlanImpl.setUserName("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezDevPropDevelopmentPlanImpl.setCreateDate(null);
		}
		else {
			sezDevPropDevelopmentPlanImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezDevPropDevelopmentPlanImpl.setModifiedDate(null);
		}
		else {
			sezDevPropDevelopmentPlanImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (existingBuilding == null) {
			sezDevPropDevelopmentPlanImpl.setExistingBuilding("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setExistingBuilding(existingBuilding);
		}

		if (existingBuildingForBusiDetail == null) {
			sezDevPropDevelopmentPlanImpl.setExistingBuildingForBusiDetail("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setExistingBuildingForBusiDetail(
				existingBuildingForBusiDetail);
		}

		if (activitiesForSingleEntity == null) {
			sezDevPropDevelopmentPlanImpl.setActivitiesForSingleEntity("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setActivitiesForSingleEntity(
				activitiesForSingleEntity);
		}

		if (volume == null) {
			sezDevPropDevelopmentPlanImpl.setVolume("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setVolume(volume);
		}

		if (folio == null) {
			sezDevPropDevelopmentPlanImpl.setFolio("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setFolio(folio);
		}

		if (buildingNum == null) {
			sezDevPropDevelopmentPlanImpl.setBuildingNum("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setBuildingNum(buildingNum);
		}

		if (townCity == null) {
			sezDevPropDevelopmentPlanImpl.setTownCity("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setTownCity(townCity);
		}

		if (zipCode == null) {
			sezDevPropDevelopmentPlanImpl.setZipCode("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setZipCode(zipCode);
		}

		if (zoningClassification == null) {
			sezDevPropDevelopmentPlanImpl.setZoningClassification("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setZoningClassification(
				zoningClassification);
		}

		if (landUse == null) {
			sezDevPropDevelopmentPlanImpl.setLandUse("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setLandUse(landUse);
		}

		if (sezAreaHectares == null) {
			sezDevPropDevelopmentPlanImpl.setSezAreaHectares("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setSezAreaHectares(sezAreaHectares);
		}

		if (sezAreaAcres == null) {
			sezDevPropDevelopmentPlanImpl.setSezAreaAcres("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setSezAreaAcres(sezAreaAcres);
		}

		if (customsHectares == null) {
			sezDevPropDevelopmentPlanImpl.setCustomsHectares("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setCustomsHectares(customsHectares);
		}

		if (customsAcres == null) {
			sezDevPropDevelopmentPlanImpl.setCustomsAcres("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setCustomsAcres(customsAcres);
		}

		if (topography == null) {
			sezDevPropDevelopmentPlanImpl.setTopography("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setTopography(topography);
		}

		if (northBoundaries == null) {
			sezDevPropDevelopmentPlanImpl.setNorthBoundaries("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setNorthBoundaries(northBoundaries);
		}

		if (eastBoundaries == null) {
			sezDevPropDevelopmentPlanImpl.setEastBoundaries("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setEastBoundaries(eastBoundaries);
		}

		if (westBoundaries == null) {
			sezDevPropDevelopmentPlanImpl.setWestBoundaries("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setWestBoundaries(westBoundaries);
		}

		if (southBoundaries == null) {
			sezDevPropDevelopmentPlanImpl.setSouthBoundaries("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setSouthBoundaries(southBoundaries);
		}

		if (customLandMeasurement == null) {
			sezDevPropDevelopmentPlanImpl.setCustomLandMeasurement("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setCustomLandMeasurement(
				customLandMeasurement);
		}

		if (customPercent == null) {
			sezDevPropDevelopmentPlanImpl.setCustomPercent("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setCustomPercent(customPercent);
		}

		if (commonLandMeasurement == null) {
			sezDevPropDevelopmentPlanImpl.setCommonLandMeasurement("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setCommonLandMeasurement(
				commonLandMeasurement);
		}

		if (commonPercent == null) {
			sezDevPropDevelopmentPlanImpl.setCommonPercent("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setCommonPercent(commonPercent);
		}

		if (bufferLandMeasurement == null) {
			sezDevPropDevelopmentPlanImpl.setBufferLandMeasurement("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setBufferLandMeasurement(
				bufferLandMeasurement);
		}

		if (bufferPercent == null) {
			sezDevPropDevelopmentPlanImpl.setBufferPercent("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setBufferPercent(bufferPercent);
		}

		if (zoneLandMeasurement == null) {
			sezDevPropDevelopmentPlanImpl.setZoneLandMeasurement("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setZoneLandMeasurement(
				zoneLandMeasurement);
		}

		if (zonePercent == null) {
			sezDevPropDevelopmentPlanImpl.setZonePercent("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setZonePercent(zonePercent);
		}

		if (ResidentialLandMeasurement == null) {
			sezDevPropDevelopmentPlanImpl.setResidentialLandMeasurement("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setResidentialLandMeasurement(
				ResidentialLandMeasurement);
		}

		if (ResidentialPercent == null) {
			sezDevPropDevelopmentPlanImpl.setResidentialPercent("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setResidentialPercent(
				ResidentialPercent);
		}

		if (totalLandMeasurement == null) {
			sezDevPropDevelopmentPlanImpl.setTotalLandMeasurement("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setTotalLandMeasurement(
				totalLandMeasurement);
		}

		if (totalPercent == null) {
			sezDevPropDevelopmentPlanImpl.setTotalPercent("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setTotalPercent(totalPercent);
		}

		if (industrialProcess == null) {
			sezDevPropDevelopmentPlanImpl.setIndustrialProcess("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setIndustrialProcess(
				industrialProcess);
		}

		if (drinkingPurpose == null) {
			sezDevPropDevelopmentPlanImpl.setDrinkingPurpose("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setDrinkingPurpose(drinkingPurpose);
		}

		if (otherSpecify == null) {
			sezDevPropDevelopmentPlanImpl.setOtherSpecify("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setOtherSpecify(otherSpecify);
		}

		if (totalRequirement == null) {
			sezDevPropDevelopmentPlanImpl.setTotalRequirement("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setTotalRequirement(totalRequirement);
		}

		if (quantumAndNature == null) {
			sezDevPropDevelopmentPlanImpl.setQuantumAndNature("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setQuantumAndNature(quantumAndNature);
		}

		if (specifyWhetherOwn == null) {
			sezDevPropDevelopmentPlanImpl.setSpecifyWhetherOwn("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setSpecifyWhetherOwn(
				specifyWhetherOwn);
		}

		if (reqOfPower == null) {
			sezDevPropDevelopmentPlanImpl.setReqOfPower("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setReqOfPower(reqOfPower);
		}

		if (mainRoadRowWidth == null) {
			sezDevPropDevelopmentPlanImpl.setMainRoadRowWidth("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setMainRoadRowWidth(mainRoadRowWidth);
		}

		if (mainRoadTypeOfPavement == null) {
			sezDevPropDevelopmentPlanImpl.setMainRoadTypeOfPavement("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setMainRoadTypeOfPavement(
				mainRoadTypeOfPavement);
		}

		if (secondRowWidhth == null) {
			sezDevPropDevelopmentPlanImpl.setSecondRowWidhth("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setSecondRowWidhth(secondRowWidhth);
		}

		if (secondTypeOfPavement == null) {
			sezDevPropDevelopmentPlanImpl.setSecondTypeOfPavement("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setSecondTypeOfPavement(
				secondTypeOfPavement);
		}

		if (tertiaryRowWidhth == null) {
			sezDevPropDevelopmentPlanImpl.setTertiaryRowWidhth("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setTertiaryRowWidhth(
				tertiaryRowWidhth);
		}

		if (tertiaryTypeOfPavement == null) {
			sezDevPropDevelopmentPlanImpl.setTertiaryTypeOfPavement("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setTertiaryTypeOfPavement(
				tertiaryTypeOfPavement);
		}

		if (waterInstallationReq == null) {
			sezDevPropDevelopmentPlanImpl.setWaterInstallationReq("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setWaterInstallationReq(
				waterInstallationReq);
		}

		if (powerInstallationReq == null) {
			sezDevPropDevelopmentPlanImpl.setPowerInstallationReq("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setPowerInstallationReq(
				powerInstallationReq);
		}

		if (teleComInstallationReq == null) {
			sezDevPropDevelopmentPlanImpl.setTeleComInstallationReq("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setTeleComInstallationReq(
				teleComInstallationReq);
		}

		if (cctvInstallationReq == null) {
			sezDevPropDevelopmentPlanImpl.setCctvInstallationReq("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setCctvInstallationReq(
				cctvInstallationReq);
		}

		if (securityInterconnection == null) {
			sezDevPropDevelopmentPlanImpl.setSecurityInterconnection("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setSecurityInterconnection(
				securityInterconnection);
		}

		if (fireFightingInstallationReq == null) {
			sezDevPropDevelopmentPlanImpl.setFireFightingInstallationReq("");
		}
		else {
			sezDevPropDevelopmentPlanImpl.setFireFightingInstallationReq(
				fireFightingInstallationReq);
		}

		sezDevPropDevelopmentPlanImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezDevPropDevelopmentPlanImpl.resetOriginalValues();

		return sezDevPropDevelopmentPlanImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezDevPropDevelopmentPlanId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		existingBuilding = objectInput.readUTF();
		existingBuildingForBusiDetail = objectInput.readUTF();
		activitiesForSingleEntity = objectInput.readUTF();
		volume = objectInput.readUTF();
		folio = objectInput.readUTF();
		buildingNum = objectInput.readUTF();
		townCity = objectInput.readUTF();
		zipCode = objectInput.readUTF();
		zoningClassification = objectInput.readUTF();
		landUse = objectInput.readUTF();
		sezAreaHectares = objectInput.readUTF();
		sezAreaAcres = objectInput.readUTF();
		customsHectares = objectInput.readUTF();
		customsAcres = objectInput.readUTF();
		topography = objectInput.readUTF();
		northBoundaries = objectInput.readUTF();
		eastBoundaries = objectInput.readUTF();
		westBoundaries = objectInput.readUTF();
		southBoundaries = objectInput.readUTF();
		customLandMeasurement = objectInput.readUTF();
		customPercent = objectInput.readUTF();
		commonLandMeasurement = objectInput.readUTF();
		commonPercent = objectInput.readUTF();
		bufferLandMeasurement = objectInput.readUTF();
		bufferPercent = objectInput.readUTF();
		zoneLandMeasurement = objectInput.readUTF();
		zonePercent = objectInput.readUTF();
		ResidentialLandMeasurement = objectInput.readUTF();
		ResidentialPercent = objectInput.readUTF();
		totalLandMeasurement = objectInput.readUTF();
		totalPercent = objectInput.readUTF();
		industrialProcess = objectInput.readUTF();
		drinkingPurpose = objectInput.readUTF();
		otherSpecify = objectInput.readUTF();
		totalRequirement = objectInput.readUTF();
		quantumAndNature = objectInput.readUTF();
		specifyWhetherOwn = objectInput.readUTF();
		reqOfPower = objectInput.readUTF();
		mainRoadRowWidth = objectInput.readUTF();
		mainRoadTypeOfPavement = objectInput.readUTF();
		secondRowWidhth = objectInput.readUTF();
		secondTypeOfPavement = objectInput.readUTF();
		tertiaryRowWidhth = objectInput.readUTF();
		tertiaryTypeOfPavement = objectInput.readUTF();
		waterInstallationReq = objectInput.readUTF();
		powerInstallationReq = objectInput.readUTF();
		teleComInstallationReq = objectInput.readUTF();
		cctvInstallationReq = objectInput.readUTF();
		securityInterconnection = objectInput.readUTF();
		fireFightingInstallationReq = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezDevPropDevelopmentPlanId);

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

		if (existingBuilding == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(existingBuilding);
		}

		if (existingBuildingForBusiDetail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(existingBuildingForBusiDetail);
		}

		if (activitiesForSingleEntity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(activitiesForSingleEntity);
		}

		if (volume == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(volume);
		}

		if (folio == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(folio);
		}

		if (buildingNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(buildingNum);
		}

		if (townCity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(townCity);
		}

		if (zipCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zipCode);
		}

		if (zoningClassification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zoningClassification);
		}

		if (landUse == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landUse);
		}

		if (sezAreaHectares == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sezAreaHectares);
		}

		if (sezAreaAcres == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sezAreaAcres);
		}

		if (customsHectares == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customsHectares);
		}

		if (customsAcres == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customsAcres);
		}

		if (topography == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(topography);
		}

		if (northBoundaries == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(northBoundaries);
		}

		if (eastBoundaries == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(eastBoundaries);
		}

		if (westBoundaries == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(westBoundaries);
		}

		if (southBoundaries == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(southBoundaries);
		}

		if (customLandMeasurement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customLandMeasurement);
		}

		if (customPercent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customPercent);
		}

		if (commonLandMeasurement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(commonLandMeasurement);
		}

		if (commonPercent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(commonPercent);
		}

		if (bufferLandMeasurement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bufferLandMeasurement);
		}

		if (bufferPercent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bufferPercent);
		}

		if (zoneLandMeasurement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zoneLandMeasurement);
		}

		if (zonePercent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zonePercent);
		}

		if (ResidentialLandMeasurement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ResidentialLandMeasurement);
		}

		if (ResidentialPercent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ResidentialPercent);
		}

		if (totalLandMeasurement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalLandMeasurement);
		}

		if (totalPercent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalPercent);
		}

		if (industrialProcess == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(industrialProcess);
		}

		if (drinkingPurpose == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(drinkingPurpose);
		}

		if (otherSpecify == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherSpecify);
		}

		if (totalRequirement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalRequirement);
		}

		if (quantumAndNature == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(quantumAndNature);
		}

		if (specifyWhetherOwn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(specifyWhetherOwn);
		}

		if (reqOfPower == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reqOfPower);
		}

		if (mainRoadRowWidth == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mainRoadRowWidth);
		}

		if (mainRoadTypeOfPavement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mainRoadTypeOfPavement);
		}

		if (secondRowWidhth == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondRowWidhth);
		}

		if (secondTypeOfPavement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondTypeOfPavement);
		}

		if (tertiaryRowWidhth == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tertiaryRowWidhth);
		}

		if (tertiaryTypeOfPavement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tertiaryTypeOfPavement);
		}

		if (waterInstallationReq == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(waterInstallationReq);
		}

		if (powerInstallationReq == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(powerInstallationReq);
		}

		if (teleComInstallationReq == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(teleComInstallationReq);
		}

		if (cctvInstallationReq == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cctvInstallationReq);
		}

		if (securityInterconnection == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securityInterconnection);
		}

		if (fireFightingInstallationReq == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fireFightingInstallationReq);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezDevPropDevelopmentPlanId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String existingBuilding;
	public String existingBuildingForBusiDetail;
	public String activitiesForSingleEntity;
	public String volume;
	public String folio;
	public String buildingNum;
	public String townCity;
	public String zipCode;
	public String zoningClassification;
	public String landUse;
	public String sezAreaHectares;
	public String sezAreaAcres;
	public String customsHectares;
	public String customsAcres;
	public String topography;
	public String northBoundaries;
	public String eastBoundaries;
	public String westBoundaries;
	public String southBoundaries;
	public String customLandMeasurement;
	public String customPercent;
	public String commonLandMeasurement;
	public String commonPercent;
	public String bufferLandMeasurement;
	public String bufferPercent;
	public String zoneLandMeasurement;
	public String zonePercent;
	public String ResidentialLandMeasurement;
	public String ResidentialPercent;
	public String totalLandMeasurement;
	public String totalPercent;
	public String industrialProcess;
	public String drinkingPurpose;
	public String otherSpecify;
	public String totalRequirement;
	public String quantumAndNature;
	public String specifyWhetherOwn;
	public String reqOfPower;
	public String mainRoadRowWidth;
	public String mainRoadTypeOfPavement;
	public String secondRowWidhth;
	public String secondTypeOfPavement;
	public String tertiaryRowWidhth;
	public String tertiaryTypeOfPavement;
	public String waterInstallationReq;
	public String powerInstallationReq;
	public String teleComInstallationReq;
	public String cctvInstallationReq;
	public String securityInterconnection;
	public String fireFightingInstallationReq;
	public long sezStatusApplicationId;

}