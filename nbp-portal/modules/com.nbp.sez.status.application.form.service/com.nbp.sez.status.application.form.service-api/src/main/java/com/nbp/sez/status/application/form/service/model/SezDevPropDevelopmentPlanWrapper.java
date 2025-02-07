/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SezDevPropDevelopmentPlan}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevPropDevelopmentPlan
 * @generated
 */
public class SezDevPropDevelopmentPlanWrapper
	extends BaseModelWrapper<SezDevPropDevelopmentPlan>
	implements ModelWrapper<SezDevPropDevelopmentPlan>,
			   SezDevPropDevelopmentPlan {

	public SezDevPropDevelopmentPlanWrapper(
		SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan) {

		super(sezDevPropDevelopmentPlan);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"sezDevPropDevelopmentPlanId", getSezDevPropDevelopmentPlanId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("existingBuilding", getExistingBuilding());
		attributes.put(
			"existingBuildingForBusiDetail",
			getExistingBuildingForBusiDetail());
		attributes.put(
			"activitiesForSingleEntity", getActivitiesForSingleEntity());
		attributes.put("volume", getVolume());
		attributes.put("folio", getFolio());
		attributes.put("buildingNum", getBuildingNum());
		attributes.put("townCity", getTownCity());
		attributes.put("zipCode", getZipCode());
		attributes.put("zoningClassification", getZoningClassification());
		attributes.put("landUse", getLandUse());
		attributes.put("sezAreaHectares", getSezAreaHectares());
		attributes.put("sezAreaAcres", getSezAreaAcres());
		attributes.put("customsHectares", getCustomsHectares());
		attributes.put("customsAcres", getCustomsAcres());
		attributes.put("topography", getTopography());
		attributes.put("northBoundaries", getNorthBoundaries());
		attributes.put("eastBoundaries", getEastBoundaries());
		attributes.put("westBoundaries", getWestBoundaries());
		attributes.put("southBoundaries", getSouthBoundaries());
		attributes.put("customLandMeasurement", getCustomLandMeasurement());
		attributes.put("customPercent", getCustomPercent());
		attributes.put("commonLandMeasurement", getCommonLandMeasurement());
		attributes.put("commonPercent", getCommonPercent());
		attributes.put("bufferLandMeasurement", getBufferLandMeasurement());
		attributes.put("bufferPercent", getBufferPercent());
		attributes.put("zoneLandMeasurement", getZoneLandMeasurement());
		attributes.put("zonePercent", getZonePercent());
		attributes.put(
			"ResidentialLandMeasurement", getResidentialLandMeasurement());
		attributes.put("ResidentialPercent", getResidentialPercent());
		attributes.put("totalLandMeasurement", getTotalLandMeasurement());
		attributes.put("totalPercent", getTotalPercent());
		attributes.put("industrialProcess", getIndustrialProcess());
		attributes.put("drinkingPurpose", getDrinkingPurpose());
		attributes.put("otherSpecify", getOtherSpecify());
		attributes.put("totalRequirement", getTotalRequirement());
		attributes.put("quantumAndNature", getQuantumAndNature());
		attributes.put("specifyWhetherOwn", getSpecifyWhetherOwn());
		attributes.put("reqOfPower", getReqOfPower());
		attributes.put("mainRoadRowWidth", getMainRoadRowWidth());
		attributes.put("mainRoadTypeOfPavement", getMainRoadTypeOfPavement());
		attributes.put("secondRowWidhth", getSecondRowWidhth());
		attributes.put("secondTypeOfPavement", getSecondTypeOfPavement());
		attributes.put("tertiaryRowWidhth", getTertiaryRowWidhth());
		attributes.put("tertiaryTypeOfPavement", getTertiaryTypeOfPavement());
		attributes.put("waterInstallationReq", getWaterInstallationReq());
		attributes.put("powerInstallationReq", getPowerInstallationReq());
		attributes.put("teleComInstallationReq", getTeleComInstallationReq());
		attributes.put("cctvInstallationReq", getCctvInstallationReq());
		attributes.put("securityInterconnection", getSecurityInterconnection());
		attributes.put(
			"fireFightingInstallationReq", getFireFightingInstallationReq());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezDevPropDevelopmentPlanId = (Long)attributes.get(
			"sezDevPropDevelopmentPlanId");

		if (sezDevPropDevelopmentPlanId != null) {
			setSezDevPropDevelopmentPlanId(sezDevPropDevelopmentPlanId);
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

		String existingBuilding = (String)attributes.get("existingBuilding");

		if (existingBuilding != null) {
			setExistingBuilding(existingBuilding);
		}

		String existingBuildingForBusiDetail = (String)attributes.get(
			"existingBuildingForBusiDetail");

		if (existingBuildingForBusiDetail != null) {
			setExistingBuildingForBusiDetail(existingBuildingForBusiDetail);
		}

		String activitiesForSingleEntity = (String)attributes.get(
			"activitiesForSingleEntity");

		if (activitiesForSingleEntity != null) {
			setActivitiesForSingleEntity(activitiesForSingleEntity);
		}

		String volume = (String)attributes.get("volume");

		if (volume != null) {
			setVolume(volume);
		}

		String folio = (String)attributes.get("folio");

		if (folio != null) {
			setFolio(folio);
		}

		String buildingNum = (String)attributes.get("buildingNum");

		if (buildingNum != null) {
			setBuildingNum(buildingNum);
		}

		String townCity = (String)attributes.get("townCity");

		if (townCity != null) {
			setTownCity(townCity);
		}

		String zipCode = (String)attributes.get("zipCode");

		if (zipCode != null) {
			setZipCode(zipCode);
		}

		String zoningClassification = (String)attributes.get(
			"zoningClassification");

		if (zoningClassification != null) {
			setZoningClassification(zoningClassification);
		}

		String landUse = (String)attributes.get("landUse");

		if (landUse != null) {
			setLandUse(landUse);
		}

		String sezAreaHectares = (String)attributes.get("sezAreaHectares");

		if (sezAreaHectares != null) {
			setSezAreaHectares(sezAreaHectares);
		}

		String sezAreaAcres = (String)attributes.get("sezAreaAcres");

		if (sezAreaAcres != null) {
			setSezAreaAcres(sezAreaAcres);
		}

		String customsHectares = (String)attributes.get("customsHectares");

		if (customsHectares != null) {
			setCustomsHectares(customsHectares);
		}

		String customsAcres = (String)attributes.get("customsAcres");

		if (customsAcres != null) {
			setCustomsAcres(customsAcres);
		}

		String topography = (String)attributes.get("topography");

		if (topography != null) {
			setTopography(topography);
		}

		String northBoundaries = (String)attributes.get("northBoundaries");

		if (northBoundaries != null) {
			setNorthBoundaries(northBoundaries);
		}

		String eastBoundaries = (String)attributes.get("eastBoundaries");

		if (eastBoundaries != null) {
			setEastBoundaries(eastBoundaries);
		}

		String westBoundaries = (String)attributes.get("westBoundaries");

		if (westBoundaries != null) {
			setWestBoundaries(westBoundaries);
		}

		String southBoundaries = (String)attributes.get("southBoundaries");

		if (southBoundaries != null) {
			setSouthBoundaries(southBoundaries);
		}

		String customLandMeasurement = (String)attributes.get(
			"customLandMeasurement");

		if (customLandMeasurement != null) {
			setCustomLandMeasurement(customLandMeasurement);
		}

		String customPercent = (String)attributes.get("customPercent");

		if (customPercent != null) {
			setCustomPercent(customPercent);
		}

		String commonLandMeasurement = (String)attributes.get(
			"commonLandMeasurement");

		if (commonLandMeasurement != null) {
			setCommonLandMeasurement(commonLandMeasurement);
		}

		String commonPercent = (String)attributes.get("commonPercent");

		if (commonPercent != null) {
			setCommonPercent(commonPercent);
		}

		String bufferLandMeasurement = (String)attributes.get(
			"bufferLandMeasurement");

		if (bufferLandMeasurement != null) {
			setBufferLandMeasurement(bufferLandMeasurement);
		}

		String bufferPercent = (String)attributes.get("bufferPercent");

		if (bufferPercent != null) {
			setBufferPercent(bufferPercent);
		}

		String zoneLandMeasurement = (String)attributes.get(
			"zoneLandMeasurement");

		if (zoneLandMeasurement != null) {
			setZoneLandMeasurement(zoneLandMeasurement);
		}

		String zonePercent = (String)attributes.get("zonePercent");

		if (zonePercent != null) {
			setZonePercent(zonePercent);
		}

		String ResidentialLandMeasurement = (String)attributes.get(
			"ResidentialLandMeasurement");

		if (ResidentialLandMeasurement != null) {
			setResidentialLandMeasurement(ResidentialLandMeasurement);
		}

		String ResidentialPercent = (String)attributes.get(
			"ResidentialPercent");

		if (ResidentialPercent != null) {
			setResidentialPercent(ResidentialPercent);
		}

		String totalLandMeasurement = (String)attributes.get(
			"totalLandMeasurement");

		if (totalLandMeasurement != null) {
			setTotalLandMeasurement(totalLandMeasurement);
		}

		String totalPercent = (String)attributes.get("totalPercent");

		if (totalPercent != null) {
			setTotalPercent(totalPercent);
		}

		String industrialProcess = (String)attributes.get("industrialProcess");

		if (industrialProcess != null) {
			setIndustrialProcess(industrialProcess);
		}

		String drinkingPurpose = (String)attributes.get("drinkingPurpose");

		if (drinkingPurpose != null) {
			setDrinkingPurpose(drinkingPurpose);
		}

		String otherSpecify = (String)attributes.get("otherSpecify");

		if (otherSpecify != null) {
			setOtherSpecify(otherSpecify);
		}

		String totalRequirement = (String)attributes.get("totalRequirement");

		if (totalRequirement != null) {
			setTotalRequirement(totalRequirement);
		}

		String quantumAndNature = (String)attributes.get("quantumAndNature");

		if (quantumAndNature != null) {
			setQuantumAndNature(quantumAndNature);
		}

		String specifyWhetherOwn = (String)attributes.get("specifyWhetherOwn");

		if (specifyWhetherOwn != null) {
			setSpecifyWhetherOwn(specifyWhetherOwn);
		}

		String reqOfPower = (String)attributes.get("reqOfPower");

		if (reqOfPower != null) {
			setReqOfPower(reqOfPower);
		}

		String mainRoadRowWidth = (String)attributes.get("mainRoadRowWidth");

		if (mainRoadRowWidth != null) {
			setMainRoadRowWidth(mainRoadRowWidth);
		}

		String mainRoadTypeOfPavement = (String)attributes.get(
			"mainRoadTypeOfPavement");

		if (mainRoadTypeOfPavement != null) {
			setMainRoadTypeOfPavement(mainRoadTypeOfPavement);
		}

		String secondRowWidhth = (String)attributes.get("secondRowWidhth");

		if (secondRowWidhth != null) {
			setSecondRowWidhth(secondRowWidhth);
		}

		String secondTypeOfPavement = (String)attributes.get(
			"secondTypeOfPavement");

		if (secondTypeOfPavement != null) {
			setSecondTypeOfPavement(secondTypeOfPavement);
		}

		String tertiaryRowWidhth = (String)attributes.get("tertiaryRowWidhth");

		if (tertiaryRowWidhth != null) {
			setTertiaryRowWidhth(tertiaryRowWidhth);
		}

		String tertiaryTypeOfPavement = (String)attributes.get(
			"tertiaryTypeOfPavement");

		if (tertiaryTypeOfPavement != null) {
			setTertiaryTypeOfPavement(tertiaryTypeOfPavement);
		}

		String waterInstallationReq = (String)attributes.get(
			"waterInstallationReq");

		if (waterInstallationReq != null) {
			setWaterInstallationReq(waterInstallationReq);
		}

		String powerInstallationReq = (String)attributes.get(
			"powerInstallationReq");

		if (powerInstallationReq != null) {
			setPowerInstallationReq(powerInstallationReq);
		}

		String teleComInstallationReq = (String)attributes.get(
			"teleComInstallationReq");

		if (teleComInstallationReq != null) {
			setTeleComInstallationReq(teleComInstallationReq);
		}

		String cctvInstallationReq = (String)attributes.get(
			"cctvInstallationReq");

		if (cctvInstallationReq != null) {
			setCctvInstallationReq(cctvInstallationReq);
		}

		String securityInterconnection = (String)attributes.get(
			"securityInterconnection");

		if (securityInterconnection != null) {
			setSecurityInterconnection(securityInterconnection);
		}

		String fireFightingInstallationReq = (String)attributes.get(
			"fireFightingInstallationReq");

		if (fireFightingInstallationReq != null) {
			setFireFightingInstallationReq(fireFightingInstallationReq);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezDevPropDevelopmentPlan cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the activities for single entity of this sez dev prop development plan.
	 *
	 * @return the activities for single entity of this sez dev prop development plan
	 */
	@Override
	public String getActivitiesForSingleEntity() {
		return model.getActivitiesForSingleEntity();
	}

	/**
	 * Returns the buffer land measurement of this sez dev prop development plan.
	 *
	 * @return the buffer land measurement of this sez dev prop development plan
	 */
	@Override
	public String getBufferLandMeasurement() {
		return model.getBufferLandMeasurement();
	}

	/**
	 * Returns the buffer percent of this sez dev prop development plan.
	 *
	 * @return the buffer percent of this sez dev prop development plan
	 */
	@Override
	public String getBufferPercent() {
		return model.getBufferPercent();
	}

	/**
	 * Returns the building num of this sez dev prop development plan.
	 *
	 * @return the building num of this sez dev prop development plan
	 */
	@Override
	public String getBuildingNum() {
		return model.getBuildingNum();
	}

	/**
	 * Returns the cctv installation req of this sez dev prop development plan.
	 *
	 * @return the cctv installation req of this sez dev prop development plan
	 */
	@Override
	public String getCctvInstallationReq() {
		return model.getCctvInstallationReq();
	}

	/**
	 * Returns the common land measurement of this sez dev prop development plan.
	 *
	 * @return the common land measurement of this sez dev prop development plan
	 */
	@Override
	public String getCommonLandMeasurement() {
		return model.getCommonLandMeasurement();
	}

	/**
	 * Returns the common percent of this sez dev prop development plan.
	 *
	 * @return the common percent of this sez dev prop development plan
	 */
	@Override
	public String getCommonPercent() {
		return model.getCommonPercent();
	}

	/**
	 * Returns the company ID of this sez dev prop development plan.
	 *
	 * @return the company ID of this sez dev prop development plan
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez dev prop development plan.
	 *
	 * @return the create date of this sez dev prop development plan
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the custom land measurement of this sez dev prop development plan.
	 *
	 * @return the custom land measurement of this sez dev prop development plan
	 */
	@Override
	public String getCustomLandMeasurement() {
		return model.getCustomLandMeasurement();
	}

	/**
	 * Returns the custom percent of this sez dev prop development plan.
	 *
	 * @return the custom percent of this sez dev prop development plan
	 */
	@Override
	public String getCustomPercent() {
		return model.getCustomPercent();
	}

	/**
	 * Returns the customs acres of this sez dev prop development plan.
	 *
	 * @return the customs acres of this sez dev prop development plan
	 */
	@Override
	public String getCustomsAcres() {
		return model.getCustomsAcres();
	}

	/**
	 * Returns the customs hectares of this sez dev prop development plan.
	 *
	 * @return the customs hectares of this sez dev prop development plan
	 */
	@Override
	public String getCustomsHectares() {
		return model.getCustomsHectares();
	}

	/**
	 * Returns the drinking purpose of this sez dev prop development plan.
	 *
	 * @return the drinking purpose of this sez dev prop development plan
	 */
	@Override
	public String getDrinkingPurpose() {
		return model.getDrinkingPurpose();
	}

	/**
	 * Returns the east boundaries of this sez dev prop development plan.
	 *
	 * @return the east boundaries of this sez dev prop development plan
	 */
	@Override
	public String getEastBoundaries() {
		return model.getEastBoundaries();
	}

	/**
	 * Returns the existing building of this sez dev prop development plan.
	 *
	 * @return the existing building of this sez dev prop development plan
	 */
	@Override
	public String getExistingBuilding() {
		return model.getExistingBuilding();
	}

	/**
	 * Returns the existing building for busi detail of this sez dev prop development plan.
	 *
	 * @return the existing building for busi detail of this sez dev prop development plan
	 */
	@Override
	public String getExistingBuildingForBusiDetail() {
		return model.getExistingBuildingForBusiDetail();
	}

	/**
	 * Returns the fire fighting installation req of this sez dev prop development plan.
	 *
	 * @return the fire fighting installation req of this sez dev prop development plan
	 */
	@Override
	public String getFireFightingInstallationReq() {
		return model.getFireFightingInstallationReq();
	}

	/**
	 * Returns the folio of this sez dev prop development plan.
	 *
	 * @return the folio of this sez dev prop development plan
	 */
	@Override
	public String getFolio() {
		return model.getFolio();
	}

	/**
	 * Returns the group ID of this sez dev prop development plan.
	 *
	 * @return the group ID of this sez dev prop development plan
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the industrial process of this sez dev prop development plan.
	 *
	 * @return the industrial process of this sez dev prop development plan
	 */
	@Override
	public String getIndustrialProcess() {
		return model.getIndustrialProcess();
	}

	/**
	 * Returns the land use of this sez dev prop development plan.
	 *
	 * @return the land use of this sez dev prop development plan
	 */
	@Override
	public String getLandUse() {
		return model.getLandUse();
	}

	/**
	 * Returns the main road row width of this sez dev prop development plan.
	 *
	 * @return the main road row width of this sez dev prop development plan
	 */
	@Override
	public String getMainRoadRowWidth() {
		return model.getMainRoadRowWidth();
	}

	/**
	 * Returns the main road type of pavement of this sez dev prop development plan.
	 *
	 * @return the main road type of pavement of this sez dev prop development plan
	 */
	@Override
	public String getMainRoadTypeOfPavement() {
		return model.getMainRoadTypeOfPavement();
	}

	/**
	 * Returns the modified date of this sez dev prop development plan.
	 *
	 * @return the modified date of this sez dev prop development plan
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the north boundaries of this sez dev prop development plan.
	 *
	 * @return the north boundaries of this sez dev prop development plan
	 */
	@Override
	public String getNorthBoundaries() {
		return model.getNorthBoundaries();
	}

	/**
	 * Returns the other specify of this sez dev prop development plan.
	 *
	 * @return the other specify of this sez dev prop development plan
	 */
	@Override
	public String getOtherSpecify() {
		return model.getOtherSpecify();
	}

	/**
	 * Returns the power installation req of this sez dev prop development plan.
	 *
	 * @return the power installation req of this sez dev prop development plan
	 */
	@Override
	public String getPowerInstallationReq() {
		return model.getPowerInstallationReq();
	}

	/**
	 * Returns the primary key of this sez dev prop development plan.
	 *
	 * @return the primary key of this sez dev prop development plan
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the quantum and nature of this sez dev prop development plan.
	 *
	 * @return the quantum and nature of this sez dev prop development plan
	 */
	@Override
	public String getQuantumAndNature() {
		return model.getQuantumAndNature();
	}

	/**
	 * Returns the req of power of this sez dev prop development plan.
	 *
	 * @return the req of power of this sez dev prop development plan
	 */
	@Override
	public String getReqOfPower() {
		return model.getReqOfPower();
	}

	/**
	 * Returns the residential land measurement of this sez dev prop development plan.
	 *
	 * @return the residential land measurement of this sez dev prop development plan
	 */
	@Override
	public String getResidentialLandMeasurement() {
		return model.getResidentialLandMeasurement();
	}

	/**
	 * Returns the residential percent of this sez dev prop development plan.
	 *
	 * @return the residential percent of this sez dev prop development plan
	 */
	@Override
	public String getResidentialPercent() {
		return model.getResidentialPercent();
	}

	/**
	 * Returns the second row widhth of this sez dev prop development plan.
	 *
	 * @return the second row widhth of this sez dev prop development plan
	 */
	@Override
	public String getSecondRowWidhth() {
		return model.getSecondRowWidhth();
	}

	/**
	 * Returns the second type of pavement of this sez dev prop development plan.
	 *
	 * @return the second type of pavement of this sez dev prop development plan
	 */
	@Override
	public String getSecondTypeOfPavement() {
		return model.getSecondTypeOfPavement();
	}

	/**
	 * Returns the security interconnection of this sez dev prop development plan.
	 *
	 * @return the security interconnection of this sez dev prop development plan
	 */
	@Override
	public String getSecurityInterconnection() {
		return model.getSecurityInterconnection();
	}

	/**
	 * Returns the sez area acres of this sez dev prop development plan.
	 *
	 * @return the sez area acres of this sez dev prop development plan
	 */
	@Override
	public String getSezAreaAcres() {
		return model.getSezAreaAcres();
	}

	/**
	 * Returns the sez area hectares of this sez dev prop development plan.
	 *
	 * @return the sez area hectares of this sez dev prop development plan
	 */
	@Override
	public String getSezAreaHectares() {
		return model.getSezAreaHectares();
	}

	/**
	 * Returns the sez dev prop development plan ID of this sez dev prop development plan.
	 *
	 * @return the sez dev prop development plan ID of this sez dev prop development plan
	 */
	@Override
	public long getSezDevPropDevelopmentPlanId() {
		return model.getSezDevPropDevelopmentPlanId();
	}

	/**
	 * Returns the sez status application ID of this sez dev prop development plan.
	 *
	 * @return the sez status application ID of this sez dev prop development plan
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the south boundaries of this sez dev prop development plan.
	 *
	 * @return the south boundaries of this sez dev prop development plan
	 */
	@Override
	public String getSouthBoundaries() {
		return model.getSouthBoundaries();
	}

	/**
	 * Returns the specify whether own of this sez dev prop development plan.
	 *
	 * @return the specify whether own of this sez dev prop development plan
	 */
	@Override
	public String getSpecifyWhetherOwn() {
		return model.getSpecifyWhetherOwn();
	}

	/**
	 * Returns the tele com installation req of this sez dev prop development plan.
	 *
	 * @return the tele com installation req of this sez dev prop development plan
	 */
	@Override
	public String getTeleComInstallationReq() {
		return model.getTeleComInstallationReq();
	}

	/**
	 * Returns the tertiary row widhth of this sez dev prop development plan.
	 *
	 * @return the tertiary row widhth of this sez dev prop development plan
	 */
	@Override
	public String getTertiaryRowWidhth() {
		return model.getTertiaryRowWidhth();
	}

	/**
	 * Returns the tertiary type of pavement of this sez dev prop development plan.
	 *
	 * @return the tertiary type of pavement of this sez dev prop development plan
	 */
	@Override
	public String getTertiaryTypeOfPavement() {
		return model.getTertiaryTypeOfPavement();
	}

	/**
	 * Returns the topography of this sez dev prop development plan.
	 *
	 * @return the topography of this sez dev prop development plan
	 */
	@Override
	public String getTopography() {
		return model.getTopography();
	}

	/**
	 * Returns the total land measurement of this sez dev prop development plan.
	 *
	 * @return the total land measurement of this sez dev prop development plan
	 */
	@Override
	public String getTotalLandMeasurement() {
		return model.getTotalLandMeasurement();
	}

	/**
	 * Returns the total percent of this sez dev prop development plan.
	 *
	 * @return the total percent of this sez dev prop development plan
	 */
	@Override
	public String getTotalPercent() {
		return model.getTotalPercent();
	}

	/**
	 * Returns the total requirement of this sez dev prop development plan.
	 *
	 * @return the total requirement of this sez dev prop development plan
	 */
	@Override
	public String getTotalRequirement() {
		return model.getTotalRequirement();
	}

	/**
	 * Returns the town city of this sez dev prop development plan.
	 *
	 * @return the town city of this sez dev prop development plan
	 */
	@Override
	public String getTownCity() {
		return model.getTownCity();
	}

	/**
	 * Returns the user ID of this sez dev prop development plan.
	 *
	 * @return the user ID of this sez dev prop development plan
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez dev prop development plan.
	 *
	 * @return the user name of this sez dev prop development plan
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez dev prop development plan.
	 *
	 * @return the user uuid of this sez dev prop development plan
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the volume of this sez dev prop development plan.
	 *
	 * @return the volume of this sez dev prop development plan
	 */
	@Override
	public String getVolume() {
		return model.getVolume();
	}

	/**
	 * Returns the water installation req of this sez dev prop development plan.
	 *
	 * @return the water installation req of this sez dev prop development plan
	 */
	@Override
	public String getWaterInstallationReq() {
		return model.getWaterInstallationReq();
	}

	/**
	 * Returns the west boundaries of this sez dev prop development plan.
	 *
	 * @return the west boundaries of this sez dev prop development plan
	 */
	@Override
	public String getWestBoundaries() {
		return model.getWestBoundaries();
	}

	/**
	 * Returns the zip code of this sez dev prop development plan.
	 *
	 * @return the zip code of this sez dev prop development plan
	 */
	@Override
	public String getZipCode() {
		return model.getZipCode();
	}

	/**
	 * Returns the zone land measurement of this sez dev prop development plan.
	 *
	 * @return the zone land measurement of this sez dev prop development plan
	 */
	@Override
	public String getZoneLandMeasurement() {
		return model.getZoneLandMeasurement();
	}

	/**
	 * Returns the zone percent of this sez dev prop development plan.
	 *
	 * @return the zone percent of this sez dev prop development plan
	 */
	@Override
	public String getZonePercent() {
		return model.getZonePercent();
	}

	/**
	 * Returns the zoning classification of this sez dev prop development plan.
	 *
	 * @return the zoning classification of this sez dev prop development plan
	 */
	@Override
	public String getZoningClassification() {
		return model.getZoningClassification();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the activities for single entity of this sez dev prop development plan.
	 *
	 * @param activitiesForSingleEntity the activities for single entity of this sez dev prop development plan
	 */
	@Override
	public void setActivitiesForSingleEntity(String activitiesForSingleEntity) {
		model.setActivitiesForSingleEntity(activitiesForSingleEntity);
	}

	/**
	 * Sets the buffer land measurement of this sez dev prop development plan.
	 *
	 * @param bufferLandMeasurement the buffer land measurement of this sez dev prop development plan
	 */
	@Override
	public void setBufferLandMeasurement(String bufferLandMeasurement) {
		model.setBufferLandMeasurement(bufferLandMeasurement);
	}

	/**
	 * Sets the buffer percent of this sez dev prop development plan.
	 *
	 * @param bufferPercent the buffer percent of this sez dev prop development plan
	 */
	@Override
	public void setBufferPercent(String bufferPercent) {
		model.setBufferPercent(bufferPercent);
	}

	/**
	 * Sets the building num of this sez dev prop development plan.
	 *
	 * @param buildingNum the building num of this sez dev prop development plan
	 */
	@Override
	public void setBuildingNum(String buildingNum) {
		model.setBuildingNum(buildingNum);
	}

	/**
	 * Sets the cctv installation req of this sez dev prop development plan.
	 *
	 * @param cctvInstallationReq the cctv installation req of this sez dev prop development plan
	 */
	@Override
	public void setCctvInstallationReq(String cctvInstallationReq) {
		model.setCctvInstallationReq(cctvInstallationReq);
	}

	/**
	 * Sets the common land measurement of this sez dev prop development plan.
	 *
	 * @param commonLandMeasurement the common land measurement of this sez dev prop development plan
	 */
	@Override
	public void setCommonLandMeasurement(String commonLandMeasurement) {
		model.setCommonLandMeasurement(commonLandMeasurement);
	}

	/**
	 * Sets the common percent of this sez dev prop development plan.
	 *
	 * @param commonPercent the common percent of this sez dev prop development plan
	 */
	@Override
	public void setCommonPercent(String commonPercent) {
		model.setCommonPercent(commonPercent);
	}

	/**
	 * Sets the company ID of this sez dev prop development plan.
	 *
	 * @param companyId the company ID of this sez dev prop development plan
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez dev prop development plan.
	 *
	 * @param createDate the create date of this sez dev prop development plan
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the custom land measurement of this sez dev prop development plan.
	 *
	 * @param customLandMeasurement the custom land measurement of this sez dev prop development plan
	 */
	@Override
	public void setCustomLandMeasurement(String customLandMeasurement) {
		model.setCustomLandMeasurement(customLandMeasurement);
	}

	/**
	 * Sets the custom percent of this sez dev prop development plan.
	 *
	 * @param customPercent the custom percent of this sez dev prop development plan
	 */
	@Override
	public void setCustomPercent(String customPercent) {
		model.setCustomPercent(customPercent);
	}

	/**
	 * Sets the customs acres of this sez dev prop development plan.
	 *
	 * @param customsAcres the customs acres of this sez dev prop development plan
	 */
	@Override
	public void setCustomsAcres(String customsAcres) {
		model.setCustomsAcres(customsAcres);
	}

	/**
	 * Sets the customs hectares of this sez dev prop development plan.
	 *
	 * @param customsHectares the customs hectares of this sez dev prop development plan
	 */
	@Override
	public void setCustomsHectares(String customsHectares) {
		model.setCustomsHectares(customsHectares);
	}

	/**
	 * Sets the drinking purpose of this sez dev prop development plan.
	 *
	 * @param drinkingPurpose the drinking purpose of this sez dev prop development plan
	 */
	@Override
	public void setDrinkingPurpose(String drinkingPurpose) {
		model.setDrinkingPurpose(drinkingPurpose);
	}

	/**
	 * Sets the east boundaries of this sez dev prop development plan.
	 *
	 * @param eastBoundaries the east boundaries of this sez dev prop development plan
	 */
	@Override
	public void setEastBoundaries(String eastBoundaries) {
		model.setEastBoundaries(eastBoundaries);
	}

	/**
	 * Sets the existing building of this sez dev prop development plan.
	 *
	 * @param existingBuilding the existing building of this sez dev prop development plan
	 */
	@Override
	public void setExistingBuilding(String existingBuilding) {
		model.setExistingBuilding(existingBuilding);
	}

	/**
	 * Sets the existing building for busi detail of this sez dev prop development plan.
	 *
	 * @param existingBuildingForBusiDetail the existing building for busi detail of this sez dev prop development plan
	 */
	@Override
	public void setExistingBuildingForBusiDetail(
		String existingBuildingForBusiDetail) {

		model.setExistingBuildingForBusiDetail(existingBuildingForBusiDetail);
	}

	/**
	 * Sets the fire fighting installation req of this sez dev prop development plan.
	 *
	 * @param fireFightingInstallationReq the fire fighting installation req of this sez dev prop development plan
	 */
	@Override
	public void setFireFightingInstallationReq(
		String fireFightingInstallationReq) {

		model.setFireFightingInstallationReq(fireFightingInstallationReq);
	}

	/**
	 * Sets the folio of this sez dev prop development plan.
	 *
	 * @param folio the folio of this sez dev prop development plan
	 */
	@Override
	public void setFolio(String folio) {
		model.setFolio(folio);
	}

	/**
	 * Sets the group ID of this sez dev prop development plan.
	 *
	 * @param groupId the group ID of this sez dev prop development plan
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the industrial process of this sez dev prop development plan.
	 *
	 * @param industrialProcess the industrial process of this sez dev prop development plan
	 */
	@Override
	public void setIndustrialProcess(String industrialProcess) {
		model.setIndustrialProcess(industrialProcess);
	}

	/**
	 * Sets the land use of this sez dev prop development plan.
	 *
	 * @param landUse the land use of this sez dev prop development plan
	 */
	@Override
	public void setLandUse(String landUse) {
		model.setLandUse(landUse);
	}

	/**
	 * Sets the main road row width of this sez dev prop development plan.
	 *
	 * @param mainRoadRowWidth the main road row width of this sez dev prop development plan
	 */
	@Override
	public void setMainRoadRowWidth(String mainRoadRowWidth) {
		model.setMainRoadRowWidth(mainRoadRowWidth);
	}

	/**
	 * Sets the main road type of pavement of this sez dev prop development plan.
	 *
	 * @param mainRoadTypeOfPavement the main road type of pavement of this sez dev prop development plan
	 */
	@Override
	public void setMainRoadTypeOfPavement(String mainRoadTypeOfPavement) {
		model.setMainRoadTypeOfPavement(mainRoadTypeOfPavement);
	}

	/**
	 * Sets the modified date of this sez dev prop development plan.
	 *
	 * @param modifiedDate the modified date of this sez dev prop development plan
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the north boundaries of this sez dev prop development plan.
	 *
	 * @param northBoundaries the north boundaries of this sez dev prop development plan
	 */
	@Override
	public void setNorthBoundaries(String northBoundaries) {
		model.setNorthBoundaries(northBoundaries);
	}

	/**
	 * Sets the other specify of this sez dev prop development plan.
	 *
	 * @param otherSpecify the other specify of this sez dev prop development plan
	 */
	@Override
	public void setOtherSpecify(String otherSpecify) {
		model.setOtherSpecify(otherSpecify);
	}

	/**
	 * Sets the power installation req of this sez dev prop development plan.
	 *
	 * @param powerInstallationReq the power installation req of this sez dev prop development plan
	 */
	@Override
	public void setPowerInstallationReq(String powerInstallationReq) {
		model.setPowerInstallationReq(powerInstallationReq);
	}

	/**
	 * Sets the primary key of this sez dev prop development plan.
	 *
	 * @param primaryKey the primary key of this sez dev prop development plan
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the quantum and nature of this sez dev prop development plan.
	 *
	 * @param quantumAndNature the quantum and nature of this sez dev prop development plan
	 */
	@Override
	public void setQuantumAndNature(String quantumAndNature) {
		model.setQuantumAndNature(quantumAndNature);
	}

	/**
	 * Sets the req of power of this sez dev prop development plan.
	 *
	 * @param reqOfPower the req of power of this sez dev prop development plan
	 */
	@Override
	public void setReqOfPower(String reqOfPower) {
		model.setReqOfPower(reqOfPower);
	}

	/**
	 * Sets the residential land measurement of this sez dev prop development plan.
	 *
	 * @param ResidentialLandMeasurement the residential land measurement of this sez dev prop development plan
	 */
	@Override
	public void setResidentialLandMeasurement(
		String ResidentialLandMeasurement) {

		model.setResidentialLandMeasurement(ResidentialLandMeasurement);
	}

	/**
	 * Sets the residential percent of this sez dev prop development plan.
	 *
	 * @param ResidentialPercent the residential percent of this sez dev prop development plan
	 */
	@Override
	public void setResidentialPercent(String ResidentialPercent) {
		model.setResidentialPercent(ResidentialPercent);
	}

	/**
	 * Sets the second row widhth of this sez dev prop development plan.
	 *
	 * @param secondRowWidhth the second row widhth of this sez dev prop development plan
	 */
	@Override
	public void setSecondRowWidhth(String secondRowWidhth) {
		model.setSecondRowWidhth(secondRowWidhth);
	}

	/**
	 * Sets the second type of pavement of this sez dev prop development plan.
	 *
	 * @param secondTypeOfPavement the second type of pavement of this sez dev prop development plan
	 */
	@Override
	public void setSecondTypeOfPavement(String secondTypeOfPavement) {
		model.setSecondTypeOfPavement(secondTypeOfPavement);
	}

	/**
	 * Sets the security interconnection of this sez dev prop development plan.
	 *
	 * @param securityInterconnection the security interconnection of this sez dev prop development plan
	 */
	@Override
	public void setSecurityInterconnection(String securityInterconnection) {
		model.setSecurityInterconnection(securityInterconnection);
	}

	/**
	 * Sets the sez area acres of this sez dev prop development plan.
	 *
	 * @param sezAreaAcres the sez area acres of this sez dev prop development plan
	 */
	@Override
	public void setSezAreaAcres(String sezAreaAcres) {
		model.setSezAreaAcres(sezAreaAcres);
	}

	/**
	 * Sets the sez area hectares of this sez dev prop development plan.
	 *
	 * @param sezAreaHectares the sez area hectares of this sez dev prop development plan
	 */
	@Override
	public void setSezAreaHectares(String sezAreaHectares) {
		model.setSezAreaHectares(sezAreaHectares);
	}

	/**
	 * Sets the sez dev prop development plan ID of this sez dev prop development plan.
	 *
	 * @param sezDevPropDevelopmentPlanId the sez dev prop development plan ID of this sez dev prop development plan
	 */
	@Override
	public void setSezDevPropDevelopmentPlanId(
		long sezDevPropDevelopmentPlanId) {

		model.setSezDevPropDevelopmentPlanId(sezDevPropDevelopmentPlanId);
	}

	/**
	 * Sets the sez status application ID of this sez dev prop development plan.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez dev prop development plan
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the south boundaries of this sez dev prop development plan.
	 *
	 * @param southBoundaries the south boundaries of this sez dev prop development plan
	 */
	@Override
	public void setSouthBoundaries(String southBoundaries) {
		model.setSouthBoundaries(southBoundaries);
	}

	/**
	 * Sets the specify whether own of this sez dev prop development plan.
	 *
	 * @param specifyWhetherOwn the specify whether own of this sez dev prop development plan
	 */
	@Override
	public void setSpecifyWhetherOwn(String specifyWhetherOwn) {
		model.setSpecifyWhetherOwn(specifyWhetherOwn);
	}

	/**
	 * Sets the tele com installation req of this sez dev prop development plan.
	 *
	 * @param teleComInstallationReq the tele com installation req of this sez dev prop development plan
	 */
	@Override
	public void setTeleComInstallationReq(String teleComInstallationReq) {
		model.setTeleComInstallationReq(teleComInstallationReq);
	}

	/**
	 * Sets the tertiary row widhth of this sez dev prop development plan.
	 *
	 * @param tertiaryRowWidhth the tertiary row widhth of this sez dev prop development plan
	 */
	@Override
	public void setTertiaryRowWidhth(String tertiaryRowWidhth) {
		model.setTertiaryRowWidhth(tertiaryRowWidhth);
	}

	/**
	 * Sets the tertiary type of pavement of this sez dev prop development plan.
	 *
	 * @param tertiaryTypeOfPavement the tertiary type of pavement of this sez dev prop development plan
	 */
	@Override
	public void setTertiaryTypeOfPavement(String tertiaryTypeOfPavement) {
		model.setTertiaryTypeOfPavement(tertiaryTypeOfPavement);
	}

	/**
	 * Sets the topography of this sez dev prop development plan.
	 *
	 * @param topography the topography of this sez dev prop development plan
	 */
	@Override
	public void setTopography(String topography) {
		model.setTopography(topography);
	}

	/**
	 * Sets the total land measurement of this sez dev prop development plan.
	 *
	 * @param totalLandMeasurement the total land measurement of this sez dev prop development plan
	 */
	@Override
	public void setTotalLandMeasurement(String totalLandMeasurement) {
		model.setTotalLandMeasurement(totalLandMeasurement);
	}

	/**
	 * Sets the total percent of this sez dev prop development plan.
	 *
	 * @param totalPercent the total percent of this sez dev prop development plan
	 */
	@Override
	public void setTotalPercent(String totalPercent) {
		model.setTotalPercent(totalPercent);
	}

	/**
	 * Sets the total requirement of this sez dev prop development plan.
	 *
	 * @param totalRequirement the total requirement of this sez dev prop development plan
	 */
	@Override
	public void setTotalRequirement(String totalRequirement) {
		model.setTotalRequirement(totalRequirement);
	}

	/**
	 * Sets the town city of this sez dev prop development plan.
	 *
	 * @param townCity the town city of this sez dev prop development plan
	 */
	@Override
	public void setTownCity(String townCity) {
		model.setTownCity(townCity);
	}

	/**
	 * Sets the user ID of this sez dev prop development plan.
	 *
	 * @param userId the user ID of this sez dev prop development plan
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez dev prop development plan.
	 *
	 * @param userName the user name of this sez dev prop development plan
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez dev prop development plan.
	 *
	 * @param userUuid the user uuid of this sez dev prop development plan
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the volume of this sez dev prop development plan.
	 *
	 * @param volume the volume of this sez dev prop development plan
	 */
	@Override
	public void setVolume(String volume) {
		model.setVolume(volume);
	}

	/**
	 * Sets the water installation req of this sez dev prop development plan.
	 *
	 * @param waterInstallationReq the water installation req of this sez dev prop development plan
	 */
	@Override
	public void setWaterInstallationReq(String waterInstallationReq) {
		model.setWaterInstallationReq(waterInstallationReq);
	}

	/**
	 * Sets the west boundaries of this sez dev prop development plan.
	 *
	 * @param westBoundaries the west boundaries of this sez dev prop development plan
	 */
	@Override
	public void setWestBoundaries(String westBoundaries) {
		model.setWestBoundaries(westBoundaries);
	}

	/**
	 * Sets the zip code of this sez dev prop development plan.
	 *
	 * @param zipCode the zip code of this sez dev prop development plan
	 */
	@Override
	public void setZipCode(String zipCode) {
		model.setZipCode(zipCode);
	}

	/**
	 * Sets the zone land measurement of this sez dev prop development plan.
	 *
	 * @param zoneLandMeasurement the zone land measurement of this sez dev prop development plan
	 */
	@Override
	public void setZoneLandMeasurement(String zoneLandMeasurement) {
		model.setZoneLandMeasurement(zoneLandMeasurement);
	}

	/**
	 * Sets the zone percent of this sez dev prop development plan.
	 *
	 * @param zonePercent the zone percent of this sez dev prop development plan
	 */
	@Override
	public void setZonePercent(String zonePercent) {
		model.setZonePercent(zonePercent);
	}

	/**
	 * Sets the zoning classification of this sez dev prop development plan.
	 *
	 * @param zoningClassification the zoning classification of this sez dev prop development plan
	 */
	@Override
	public void setZoningClassification(String zoningClassification) {
		model.setZoningClassification(zoningClassification);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected SezDevPropDevelopmentPlanWrapper wrap(
		SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan) {

		return new SezDevPropDevelopmentPlanWrapper(sezDevPropDevelopmentPlan);
	}

}