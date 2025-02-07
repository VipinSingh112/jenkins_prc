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
 * This class is a wrapper for {@link SezOccupantExistingProposedProjectBriefInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantExistingProposedProjectBriefInfo
 * @generated
 */
public class SezOccupantExistingProposedProjectBriefInfoWrapper
	extends BaseModelWrapper<SezOccupantExistingProposedProjectBriefInfo>
	implements ModelWrapper<SezOccupantExistingProposedProjectBriefInfo>,
			   SezOccupantExistingProposedProjectBriefInfo {

	public SezOccupantExistingProposedProjectBriefInfoWrapper(
		SezOccupantExistingProposedProjectBriefInfo
			sezOccupantExistingProposedProjectBriefInfo) {

		super(sezOccupantExistingProposedProjectBriefInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezOccExistPorpId", getSezOccExistPorpId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("occBusinessDesc", getOccBusinessDesc());
		attributes.put("occDeniedFreeZoneAppr", getOccDeniedFreeZoneAppr());
		attributes.put(
			"occDeniedFreeZoneApprDate", getOccDeniedFreeZoneApprDate());
		attributes.put(
			"occDeniedFreeZoneApprType", getOccDeniedFreeZoneApprType());
		attributes.put("occFreeZoneLocation", getOccFreeZoneLocation());
		attributes.put("occSezDevLoc", getOccSezDevLoc());
		attributes.put("occSezDevLocDesc", getOccSezDevLocDesc());
		attributes.put(
			"occSubConcessionBuilding", getOccSubConcessionBuilding());
		attributes.put("occSubConcessionTown", getOccSubConcessionTown());
		attributes.put("occSubConcessionParish", getOccSubConcessionParish());
		attributes.put(
			"occCompleteSurveyTechDesc", getOccCompleteSurveyTechDesc());
		attributes.put("occNorthBoundaries", getOccNorthBoundaries());
		attributes.put("occEastBoundaries", getOccEastBoundaries());
		attributes.put("occWestBoundaries", getOccWestBoundaries());
		attributes.put("occSouthBoundaries", getOccSouthBoundaries());
		attributes.put("occOwnership", getOccOwnership());
		attributes.put("occLeaseYears", getOccLeaseYears());
		attributes.put("occVolume", getOccVolume());
		attributes.put("occFolio", getOccFolio());
		attributes.put("occFloorNum", getOccFloorNum());
		attributes.put("occUndertakenService", getOccUndertakenService());
		attributes.put(
			"occUndertakenManufacturing", getOccUndertakenManufacturing());
		attributes.put("occSeaPortDistanceKM", getOccSeaPortDistanceKM());
		attributes.put("occSeaPortDistanceMI", getOccSeaPortDistanceMI());
		attributes.put("occAirportDistanceKM", getOccAirportDistanceKM());
		attributes.put("occAirportDistanceMI", getOccAirportDistanceMI());
		attributes.put("occRoadDistanceKM", getOccRoadDistanceKM());
		attributes.put("occRoadDistanceMI", getOccRoadDistanceMI());
		attributes.put("occRailDistanceKM", getOccRailDistanceKM());
		attributes.put("occRailDistanceMI", getOccRailDistanceMI());
		attributes.put("occCustomDistanceKM", getOccCustomDistanceKM());
		attributes.put("occCustomDistanceMI", getOccCustomDistanceMI());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezOccExistPorpId = (Long)attributes.get("sezOccExistPorpId");

		if (sezOccExistPorpId != null) {
			setSezOccExistPorpId(sezOccExistPorpId);
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

		String occBusinessDesc = (String)attributes.get("occBusinessDesc");

		if (occBusinessDesc != null) {
			setOccBusinessDesc(occBusinessDesc);
		}

		String occDeniedFreeZoneAppr = (String)attributes.get(
			"occDeniedFreeZoneAppr");

		if (occDeniedFreeZoneAppr != null) {
			setOccDeniedFreeZoneAppr(occDeniedFreeZoneAppr);
		}

		Date occDeniedFreeZoneApprDate = (Date)attributes.get(
			"occDeniedFreeZoneApprDate");

		if (occDeniedFreeZoneApprDate != null) {
			setOccDeniedFreeZoneApprDate(occDeniedFreeZoneApprDate);
		}

		String occDeniedFreeZoneApprType = (String)attributes.get(
			"occDeniedFreeZoneApprType");

		if (occDeniedFreeZoneApprType != null) {
			setOccDeniedFreeZoneApprType(occDeniedFreeZoneApprType);
		}

		String occFreeZoneLocation = (String)attributes.get(
			"occFreeZoneLocation");

		if (occFreeZoneLocation != null) {
			setOccFreeZoneLocation(occFreeZoneLocation);
		}

		String occSezDevLoc = (String)attributes.get("occSezDevLoc");

		if (occSezDevLoc != null) {
			setOccSezDevLoc(occSezDevLoc);
		}

		String occSezDevLocDesc = (String)attributes.get("occSezDevLocDesc");

		if (occSezDevLocDesc != null) {
			setOccSezDevLocDesc(occSezDevLocDesc);
		}

		String occSubConcessionBuilding = (String)attributes.get(
			"occSubConcessionBuilding");

		if (occSubConcessionBuilding != null) {
			setOccSubConcessionBuilding(occSubConcessionBuilding);
		}

		String occSubConcessionTown = (String)attributes.get(
			"occSubConcessionTown");

		if (occSubConcessionTown != null) {
			setOccSubConcessionTown(occSubConcessionTown);
		}

		String occSubConcessionParish = (String)attributes.get(
			"occSubConcessionParish");

		if (occSubConcessionParish != null) {
			setOccSubConcessionParish(occSubConcessionParish);
		}

		String occCompleteSurveyTechDesc = (String)attributes.get(
			"occCompleteSurveyTechDesc");

		if (occCompleteSurveyTechDesc != null) {
			setOccCompleteSurveyTechDesc(occCompleteSurveyTechDesc);
		}

		String occNorthBoundaries = (String)attributes.get(
			"occNorthBoundaries");

		if (occNorthBoundaries != null) {
			setOccNorthBoundaries(occNorthBoundaries);
		}

		String occEastBoundaries = (String)attributes.get("occEastBoundaries");

		if (occEastBoundaries != null) {
			setOccEastBoundaries(occEastBoundaries);
		}

		String occWestBoundaries = (String)attributes.get("occWestBoundaries");

		if (occWestBoundaries != null) {
			setOccWestBoundaries(occWestBoundaries);
		}

		String occSouthBoundaries = (String)attributes.get(
			"occSouthBoundaries");

		if (occSouthBoundaries != null) {
			setOccSouthBoundaries(occSouthBoundaries);
		}

		String occOwnership = (String)attributes.get("occOwnership");

		if (occOwnership != null) {
			setOccOwnership(occOwnership);
		}

		String occLeaseYears = (String)attributes.get("occLeaseYears");

		if (occLeaseYears != null) {
			setOccLeaseYears(occLeaseYears);
		}

		String occVolume = (String)attributes.get("occVolume");

		if (occVolume != null) {
			setOccVolume(occVolume);
		}

		String occFolio = (String)attributes.get("occFolio");

		if (occFolio != null) {
			setOccFolio(occFolio);
		}

		String occFloorNum = (String)attributes.get("occFloorNum");

		if (occFloorNum != null) {
			setOccFloorNum(occFloorNum);
		}

		String occUndertakenService = (String)attributes.get(
			"occUndertakenService");

		if (occUndertakenService != null) {
			setOccUndertakenService(occUndertakenService);
		}

		String occUndertakenManufacturing = (String)attributes.get(
			"occUndertakenManufacturing");

		if (occUndertakenManufacturing != null) {
			setOccUndertakenManufacturing(occUndertakenManufacturing);
		}

		String occSeaPortDistanceKM = (String)attributes.get(
			"occSeaPortDistanceKM");

		if (occSeaPortDistanceKM != null) {
			setOccSeaPortDistanceKM(occSeaPortDistanceKM);
		}

		String occSeaPortDistanceMI = (String)attributes.get(
			"occSeaPortDistanceMI");

		if (occSeaPortDistanceMI != null) {
			setOccSeaPortDistanceMI(occSeaPortDistanceMI);
		}

		String occAirportDistanceKM = (String)attributes.get(
			"occAirportDistanceKM");

		if (occAirportDistanceKM != null) {
			setOccAirportDistanceKM(occAirportDistanceKM);
		}

		String occAirportDistanceMI = (String)attributes.get(
			"occAirportDistanceMI");

		if (occAirportDistanceMI != null) {
			setOccAirportDistanceMI(occAirportDistanceMI);
		}

		String occRoadDistanceKM = (String)attributes.get("occRoadDistanceKM");

		if (occRoadDistanceKM != null) {
			setOccRoadDistanceKM(occRoadDistanceKM);
		}

		String occRoadDistanceMI = (String)attributes.get("occRoadDistanceMI");

		if (occRoadDistanceMI != null) {
			setOccRoadDistanceMI(occRoadDistanceMI);
		}

		String occRailDistanceKM = (String)attributes.get("occRailDistanceKM");

		if (occRailDistanceKM != null) {
			setOccRailDistanceKM(occRailDistanceKM);
		}

		String occRailDistanceMI = (String)attributes.get("occRailDistanceMI");

		if (occRailDistanceMI != null) {
			setOccRailDistanceMI(occRailDistanceMI);
		}

		String occCustomDistanceKM = (String)attributes.get(
			"occCustomDistanceKM");

		if (occCustomDistanceKM != null) {
			setOccCustomDistanceKM(occCustomDistanceKM);
		}

		String occCustomDistanceMI = (String)attributes.get(
			"occCustomDistanceMI");

		if (occCustomDistanceMI != null) {
			setOccCustomDistanceMI(occCustomDistanceMI);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezOccupantExistingProposedProjectBriefInfo
		cloneWithOriginalValues() {

		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez occupant existing proposed project brief info.
	 *
	 * @return the company ID of this sez occupant existing proposed project brief info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez occupant existing proposed project brief info.
	 *
	 * @return the create date of this sez occupant existing proposed project brief info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez occupant existing proposed project brief info.
	 *
	 * @return the group ID of this sez occupant existing proposed project brief info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez occupant existing proposed project brief info.
	 *
	 * @return the modified date of this sez occupant existing proposed project brief info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the occ airport distance km of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ airport distance km of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccAirportDistanceKM() {
		return model.getOccAirportDistanceKM();
	}

	/**
	 * Returns the occ airport distance mi of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ airport distance mi of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccAirportDistanceMI() {
		return model.getOccAirportDistanceMI();
	}

	/**
	 * Returns the occ business desc of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ business desc of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccBusinessDesc() {
		return model.getOccBusinessDesc();
	}

	/**
	 * Returns the occ complete survey tech desc of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ complete survey tech desc of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccCompleteSurveyTechDesc() {
		return model.getOccCompleteSurveyTechDesc();
	}

	/**
	 * Returns the occ custom distance km of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ custom distance km of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccCustomDistanceKM() {
		return model.getOccCustomDistanceKM();
	}

	/**
	 * Returns the occ custom distance mi of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ custom distance mi of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccCustomDistanceMI() {
		return model.getOccCustomDistanceMI();
	}

	/**
	 * Returns the occ denied free zone appr of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ denied free zone appr of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccDeniedFreeZoneAppr() {
		return model.getOccDeniedFreeZoneAppr();
	}

	/**
	 * Returns the occ denied free zone appr date of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ denied free zone appr date of this sez occupant existing proposed project brief info
	 */
	@Override
	public Date getOccDeniedFreeZoneApprDate() {
		return model.getOccDeniedFreeZoneApprDate();
	}

	/**
	 * Returns the occ denied free zone appr type of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ denied free zone appr type of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccDeniedFreeZoneApprType() {
		return model.getOccDeniedFreeZoneApprType();
	}

	/**
	 * Returns the occ east boundaries of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ east boundaries of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccEastBoundaries() {
		return model.getOccEastBoundaries();
	}

	/**
	 * Returns the occ floor num of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ floor num of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccFloorNum() {
		return model.getOccFloorNum();
	}

	/**
	 * Returns the occ folio of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ folio of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccFolio() {
		return model.getOccFolio();
	}

	/**
	 * Returns the occ free zone location of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ free zone location of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccFreeZoneLocation() {
		return model.getOccFreeZoneLocation();
	}

	/**
	 * Returns the occ lease years of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ lease years of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccLeaseYears() {
		return model.getOccLeaseYears();
	}

	/**
	 * Returns the occ north boundaries of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ north boundaries of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccNorthBoundaries() {
		return model.getOccNorthBoundaries();
	}

	/**
	 * Returns the occ ownership of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ ownership of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccOwnership() {
		return model.getOccOwnership();
	}

	/**
	 * Returns the occ rail distance km of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ rail distance km of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccRailDistanceKM() {
		return model.getOccRailDistanceKM();
	}

	/**
	 * Returns the occ rail distance mi of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ rail distance mi of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccRailDistanceMI() {
		return model.getOccRailDistanceMI();
	}

	/**
	 * Returns the occ road distance km of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ road distance km of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccRoadDistanceKM() {
		return model.getOccRoadDistanceKM();
	}

	/**
	 * Returns the occ road distance mi of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ road distance mi of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccRoadDistanceMI() {
		return model.getOccRoadDistanceMI();
	}

	/**
	 * Returns the occ sea port distance km of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ sea port distance km of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccSeaPortDistanceKM() {
		return model.getOccSeaPortDistanceKM();
	}

	/**
	 * Returns the occ sea port distance mi of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ sea port distance mi of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccSeaPortDistanceMI() {
		return model.getOccSeaPortDistanceMI();
	}

	/**
	 * Returns the occ sez dev loc of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ sez dev loc of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccSezDevLoc() {
		return model.getOccSezDevLoc();
	}

	/**
	 * Returns the occ sez dev loc desc of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ sez dev loc desc of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccSezDevLocDesc() {
		return model.getOccSezDevLocDesc();
	}

	/**
	 * Returns the occ south boundaries of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ south boundaries of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccSouthBoundaries() {
		return model.getOccSouthBoundaries();
	}

	/**
	 * Returns the occ sub concession building of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ sub concession building of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccSubConcessionBuilding() {
		return model.getOccSubConcessionBuilding();
	}

	/**
	 * Returns the occ sub concession parish of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ sub concession parish of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccSubConcessionParish() {
		return model.getOccSubConcessionParish();
	}

	/**
	 * Returns the occ sub concession town of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ sub concession town of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccSubConcessionTown() {
		return model.getOccSubConcessionTown();
	}

	/**
	 * Returns the occ undertaken manufacturing of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ undertaken manufacturing of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccUndertakenManufacturing() {
		return model.getOccUndertakenManufacturing();
	}

	/**
	 * Returns the occ undertaken service of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ undertaken service of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccUndertakenService() {
		return model.getOccUndertakenService();
	}

	/**
	 * Returns the occ volume of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ volume of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccVolume() {
		return model.getOccVolume();
	}

	/**
	 * Returns the occ west boundaries of this sez occupant existing proposed project brief info.
	 *
	 * @return the occ west boundaries of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getOccWestBoundaries() {
		return model.getOccWestBoundaries();
	}

	/**
	 * Returns the primary key of this sez occupant existing proposed project brief info.
	 *
	 * @return the primary key of this sez occupant existing proposed project brief info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez occ exist porp ID of this sez occupant existing proposed project brief info.
	 *
	 * @return the sez occ exist porp ID of this sez occupant existing proposed project brief info
	 */
	@Override
	public long getSezOccExistPorpId() {
		return model.getSezOccExistPorpId();
	}

	/**
	 * Returns the sez status application ID of this sez occupant existing proposed project brief info.
	 *
	 * @return the sez status application ID of this sez occupant existing proposed project brief info
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the user ID of this sez occupant existing proposed project brief info.
	 *
	 * @return the user ID of this sez occupant existing proposed project brief info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez occupant existing proposed project brief info.
	 *
	 * @return the user name of this sez occupant existing proposed project brief info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez occupant existing proposed project brief info.
	 *
	 * @return the user uuid of this sez occupant existing proposed project brief info
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
	 * Sets the company ID of this sez occupant existing proposed project brief info.
	 *
	 * @param companyId the company ID of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez occupant existing proposed project brief info.
	 *
	 * @param createDate the create date of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez occupant existing proposed project brief info.
	 *
	 * @param groupId the group ID of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez occupant existing proposed project brief info.
	 *
	 * @param modifiedDate the modified date of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the occ airport distance km of this sez occupant existing proposed project brief info.
	 *
	 * @param occAirportDistanceKM the occ airport distance km of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccAirportDistanceKM(String occAirportDistanceKM) {
		model.setOccAirportDistanceKM(occAirportDistanceKM);
	}

	/**
	 * Sets the occ airport distance mi of this sez occupant existing proposed project brief info.
	 *
	 * @param occAirportDistanceMI the occ airport distance mi of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccAirportDistanceMI(String occAirportDistanceMI) {
		model.setOccAirportDistanceMI(occAirportDistanceMI);
	}

	/**
	 * Sets the occ business desc of this sez occupant existing proposed project brief info.
	 *
	 * @param occBusinessDesc the occ business desc of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccBusinessDesc(String occBusinessDesc) {
		model.setOccBusinessDesc(occBusinessDesc);
	}

	/**
	 * Sets the occ complete survey tech desc of this sez occupant existing proposed project brief info.
	 *
	 * @param occCompleteSurveyTechDesc the occ complete survey tech desc of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccCompleteSurveyTechDesc(String occCompleteSurveyTechDesc) {
		model.setOccCompleteSurveyTechDesc(occCompleteSurveyTechDesc);
	}

	/**
	 * Sets the occ custom distance km of this sez occupant existing proposed project brief info.
	 *
	 * @param occCustomDistanceKM the occ custom distance km of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccCustomDistanceKM(String occCustomDistanceKM) {
		model.setOccCustomDistanceKM(occCustomDistanceKM);
	}

	/**
	 * Sets the occ custom distance mi of this sez occupant existing proposed project brief info.
	 *
	 * @param occCustomDistanceMI the occ custom distance mi of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccCustomDistanceMI(String occCustomDistanceMI) {
		model.setOccCustomDistanceMI(occCustomDistanceMI);
	}

	/**
	 * Sets the occ denied free zone appr of this sez occupant existing proposed project brief info.
	 *
	 * @param occDeniedFreeZoneAppr the occ denied free zone appr of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccDeniedFreeZoneAppr(String occDeniedFreeZoneAppr) {
		model.setOccDeniedFreeZoneAppr(occDeniedFreeZoneAppr);
	}

	/**
	 * Sets the occ denied free zone appr date of this sez occupant existing proposed project brief info.
	 *
	 * @param occDeniedFreeZoneApprDate the occ denied free zone appr date of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccDeniedFreeZoneApprDate(Date occDeniedFreeZoneApprDate) {
		model.setOccDeniedFreeZoneApprDate(occDeniedFreeZoneApprDate);
	}

	/**
	 * Sets the occ denied free zone appr type of this sez occupant existing proposed project brief info.
	 *
	 * @param occDeniedFreeZoneApprType the occ denied free zone appr type of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccDeniedFreeZoneApprType(String occDeniedFreeZoneApprType) {
		model.setOccDeniedFreeZoneApprType(occDeniedFreeZoneApprType);
	}

	/**
	 * Sets the occ east boundaries of this sez occupant existing proposed project brief info.
	 *
	 * @param occEastBoundaries the occ east boundaries of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccEastBoundaries(String occEastBoundaries) {
		model.setOccEastBoundaries(occEastBoundaries);
	}

	/**
	 * Sets the occ floor num of this sez occupant existing proposed project brief info.
	 *
	 * @param occFloorNum the occ floor num of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccFloorNum(String occFloorNum) {
		model.setOccFloorNum(occFloorNum);
	}

	/**
	 * Sets the occ folio of this sez occupant existing proposed project brief info.
	 *
	 * @param occFolio the occ folio of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccFolio(String occFolio) {
		model.setOccFolio(occFolio);
	}

	/**
	 * Sets the occ free zone location of this sez occupant existing proposed project brief info.
	 *
	 * @param occFreeZoneLocation the occ free zone location of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccFreeZoneLocation(String occFreeZoneLocation) {
		model.setOccFreeZoneLocation(occFreeZoneLocation);
	}

	/**
	 * Sets the occ lease years of this sez occupant existing proposed project brief info.
	 *
	 * @param occLeaseYears the occ lease years of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccLeaseYears(String occLeaseYears) {
		model.setOccLeaseYears(occLeaseYears);
	}

	/**
	 * Sets the occ north boundaries of this sez occupant existing proposed project brief info.
	 *
	 * @param occNorthBoundaries the occ north boundaries of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccNorthBoundaries(String occNorthBoundaries) {
		model.setOccNorthBoundaries(occNorthBoundaries);
	}

	/**
	 * Sets the occ ownership of this sez occupant existing proposed project brief info.
	 *
	 * @param occOwnership the occ ownership of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccOwnership(String occOwnership) {
		model.setOccOwnership(occOwnership);
	}

	/**
	 * Sets the occ rail distance km of this sez occupant existing proposed project brief info.
	 *
	 * @param occRailDistanceKM the occ rail distance km of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccRailDistanceKM(String occRailDistanceKM) {
		model.setOccRailDistanceKM(occRailDistanceKM);
	}

	/**
	 * Sets the occ rail distance mi of this sez occupant existing proposed project brief info.
	 *
	 * @param occRailDistanceMI the occ rail distance mi of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccRailDistanceMI(String occRailDistanceMI) {
		model.setOccRailDistanceMI(occRailDistanceMI);
	}

	/**
	 * Sets the occ road distance km of this sez occupant existing proposed project brief info.
	 *
	 * @param occRoadDistanceKM the occ road distance km of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccRoadDistanceKM(String occRoadDistanceKM) {
		model.setOccRoadDistanceKM(occRoadDistanceKM);
	}

	/**
	 * Sets the occ road distance mi of this sez occupant existing proposed project brief info.
	 *
	 * @param occRoadDistanceMI the occ road distance mi of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccRoadDistanceMI(String occRoadDistanceMI) {
		model.setOccRoadDistanceMI(occRoadDistanceMI);
	}

	/**
	 * Sets the occ sea port distance km of this sez occupant existing proposed project brief info.
	 *
	 * @param occSeaPortDistanceKM the occ sea port distance km of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccSeaPortDistanceKM(String occSeaPortDistanceKM) {
		model.setOccSeaPortDistanceKM(occSeaPortDistanceKM);
	}

	/**
	 * Sets the occ sea port distance mi of this sez occupant existing proposed project brief info.
	 *
	 * @param occSeaPortDistanceMI the occ sea port distance mi of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccSeaPortDistanceMI(String occSeaPortDistanceMI) {
		model.setOccSeaPortDistanceMI(occSeaPortDistanceMI);
	}

	/**
	 * Sets the occ sez dev loc of this sez occupant existing proposed project brief info.
	 *
	 * @param occSezDevLoc the occ sez dev loc of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccSezDevLoc(String occSezDevLoc) {
		model.setOccSezDevLoc(occSezDevLoc);
	}

	/**
	 * Sets the occ sez dev loc desc of this sez occupant existing proposed project brief info.
	 *
	 * @param occSezDevLocDesc the occ sez dev loc desc of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccSezDevLocDesc(String occSezDevLocDesc) {
		model.setOccSezDevLocDesc(occSezDevLocDesc);
	}

	/**
	 * Sets the occ south boundaries of this sez occupant existing proposed project brief info.
	 *
	 * @param occSouthBoundaries the occ south boundaries of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccSouthBoundaries(String occSouthBoundaries) {
		model.setOccSouthBoundaries(occSouthBoundaries);
	}

	/**
	 * Sets the occ sub concession building of this sez occupant existing proposed project brief info.
	 *
	 * @param occSubConcessionBuilding the occ sub concession building of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccSubConcessionBuilding(String occSubConcessionBuilding) {
		model.setOccSubConcessionBuilding(occSubConcessionBuilding);
	}

	/**
	 * Sets the occ sub concession parish of this sez occupant existing proposed project brief info.
	 *
	 * @param occSubConcessionParish the occ sub concession parish of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccSubConcessionParish(String occSubConcessionParish) {
		model.setOccSubConcessionParish(occSubConcessionParish);
	}

	/**
	 * Sets the occ sub concession town of this sez occupant existing proposed project brief info.
	 *
	 * @param occSubConcessionTown the occ sub concession town of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccSubConcessionTown(String occSubConcessionTown) {
		model.setOccSubConcessionTown(occSubConcessionTown);
	}

	/**
	 * Sets the occ undertaken manufacturing of this sez occupant existing proposed project brief info.
	 *
	 * @param occUndertakenManufacturing the occ undertaken manufacturing of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccUndertakenManufacturing(
		String occUndertakenManufacturing) {

		model.setOccUndertakenManufacturing(occUndertakenManufacturing);
	}

	/**
	 * Sets the occ undertaken service of this sez occupant existing proposed project brief info.
	 *
	 * @param occUndertakenService the occ undertaken service of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccUndertakenService(String occUndertakenService) {
		model.setOccUndertakenService(occUndertakenService);
	}

	/**
	 * Sets the occ volume of this sez occupant existing proposed project brief info.
	 *
	 * @param occVolume the occ volume of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccVolume(String occVolume) {
		model.setOccVolume(occVolume);
	}

	/**
	 * Sets the occ west boundaries of this sez occupant existing proposed project brief info.
	 *
	 * @param occWestBoundaries the occ west boundaries of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setOccWestBoundaries(String occWestBoundaries) {
		model.setOccWestBoundaries(occWestBoundaries);
	}

	/**
	 * Sets the primary key of this sez occupant existing proposed project brief info.
	 *
	 * @param primaryKey the primary key of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez occ exist porp ID of this sez occupant existing proposed project brief info.
	 *
	 * @param sezOccExistPorpId the sez occ exist porp ID of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setSezOccExistPorpId(long sezOccExistPorpId) {
		model.setSezOccExistPorpId(sezOccExistPorpId);
	}

	/**
	 * Sets the sez status application ID of this sez occupant existing proposed project brief info.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the user ID of this sez occupant existing proposed project brief info.
	 *
	 * @param userId the user ID of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez occupant existing proposed project brief info.
	 *
	 * @param userName the user name of this sez occupant existing proposed project brief info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez occupant existing proposed project brief info.
	 *
	 * @param userUuid the user uuid of this sez occupant existing proposed project brief info
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
	protected SezOccupantExistingProposedProjectBriefInfoWrapper wrap(
		SezOccupantExistingProposedProjectBriefInfo
			sezOccupantExistingProposedProjectBriefInfo) {

		return new SezOccupantExistingProposedProjectBriefInfoWrapper(
			sezOccupantExistingProposedProjectBriefInfo);
	}

}