/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AcquirePropertyDetails}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquirePropertyDetails
 * @generated
 */
public class AcquirePropertyDetailsWrapper
	extends BaseModelWrapper<AcquirePropertyDetails>
	implements AcquirePropertyDetails, ModelWrapper<AcquirePropertyDetails> {

	public AcquirePropertyDetailsWrapper(
		AcquirePropertyDetails acquirePropertyDetails) {

		super(acquirePropertyDetails);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"acquirePropertyDetailsId", getAcquirePropertyDetailsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("propertyTenureType", getPropertyTenureType());
		attributes.put("propertyIdentified", getPropertyIdentified());
		attributes.put("propertyAddr", getPropertyAddr());
		attributes.put("propertyDesiredLoc", getPropertyDesiredLoc());
		attributes.put("propertyVolume", getPropertyVolume());
		attributes.put("propertyFolio", getPropertyFolio());
		attributes.put("propertyValuationNum", getPropertyValuationNum());
		attributes.put("propertySketchAttached", getPropertySketchAttached());
		attributes.put("propertyCurrentUse", getPropertyCurrentUse());
		attributes.put("propertyCurrentUseOther", getPropertyCurrentUseOther());
		attributes.put(
			"propertyExistingBuilding", getPropertyExistingBuilding());
		attributes.put(
			"propertyExistingBuildingOther",
			getPropertyExistingBuildingOther());
		attributes.put(
			"propertyExistingInfrastructure",
			getPropertyExistingInfrastructure());
		attributes.put("propertyProposedUse", getPropertyProposedUse());
		attributes.put(
			"propertyProposedUseOther", getPropertyProposedUseOther());
		attributes.put(
			"propertyProposedInfrastructure",
			getPropertyProposedInfrastructure());
		attributes.put("propertyLandAreaHectare", getPropertyLandAreaHectare());
		attributes.put("propertyLandAreaAcres", getPropertyLandAreaAcres());
		attributes.put("propertyLandAreaRoods", getPropertyLandAreaRoods());
		attributes.put("propertyLandAreaPerches", getPropertyLandAreaPerches());
		attributes.put("propertyAdjoiningNorth", getPropertyAdjoiningNorth());
		attributes.put("propertyAdjoiningSouth", getPropertyAdjoiningSouth());
		attributes.put("propertyAdjoiningEast", getPropertyAdjoiningEast());
		attributes.put("propertyAdjoiningWest", getPropertyAdjoiningWest());
		attributes.put("propertyDate", getPropertyDate());
		attributes.put("propertyAdditionalInfo", getPropertyAdditionalInfo());
		attributes.put("acquireApplicationId", getAcquireApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long acquirePropertyDetailsId = (Long)attributes.get(
			"acquirePropertyDetailsId");

		if (acquirePropertyDetailsId != null) {
			setAcquirePropertyDetailsId(acquirePropertyDetailsId);
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

		String propertyTenureType = (String)attributes.get(
			"propertyTenureType");

		if (propertyTenureType != null) {
			setPropertyTenureType(propertyTenureType);
		}

		String propertyIdentified = (String)attributes.get(
			"propertyIdentified");

		if (propertyIdentified != null) {
			setPropertyIdentified(propertyIdentified);
		}

		String propertyAddr = (String)attributes.get("propertyAddr");

		if (propertyAddr != null) {
			setPropertyAddr(propertyAddr);
		}

		String propertyDesiredLoc = (String)attributes.get(
			"propertyDesiredLoc");

		if (propertyDesiredLoc != null) {
			setPropertyDesiredLoc(propertyDesiredLoc);
		}

		String propertyVolume = (String)attributes.get("propertyVolume");

		if (propertyVolume != null) {
			setPropertyVolume(propertyVolume);
		}

		String propertyFolio = (String)attributes.get("propertyFolio");

		if (propertyFolio != null) {
			setPropertyFolio(propertyFolio);
		}

		String propertyValuationNum = (String)attributes.get(
			"propertyValuationNum");

		if (propertyValuationNum != null) {
			setPropertyValuationNum(propertyValuationNum);
		}

		String propertySketchAttached = (String)attributes.get(
			"propertySketchAttached");

		if (propertySketchAttached != null) {
			setPropertySketchAttached(propertySketchAttached);
		}

		String propertyCurrentUse = (String)attributes.get(
			"propertyCurrentUse");

		if (propertyCurrentUse != null) {
			setPropertyCurrentUse(propertyCurrentUse);
		}

		String propertyCurrentUseOther = (String)attributes.get(
			"propertyCurrentUseOther");

		if (propertyCurrentUseOther != null) {
			setPropertyCurrentUseOther(propertyCurrentUseOther);
		}

		String propertyExistingBuilding = (String)attributes.get(
			"propertyExistingBuilding");

		if (propertyExistingBuilding != null) {
			setPropertyExistingBuilding(propertyExistingBuilding);
		}

		String propertyExistingBuildingOther = (String)attributes.get(
			"propertyExistingBuildingOther");

		if (propertyExistingBuildingOther != null) {
			setPropertyExistingBuildingOther(propertyExistingBuildingOther);
		}

		String propertyExistingInfrastructure = (String)attributes.get(
			"propertyExistingInfrastructure");

		if (propertyExistingInfrastructure != null) {
			setPropertyExistingInfrastructure(propertyExistingInfrastructure);
		}

		String propertyProposedUse = (String)attributes.get(
			"propertyProposedUse");

		if (propertyProposedUse != null) {
			setPropertyProposedUse(propertyProposedUse);
		}

		String propertyProposedUseOther = (String)attributes.get(
			"propertyProposedUseOther");

		if (propertyProposedUseOther != null) {
			setPropertyProposedUseOther(propertyProposedUseOther);
		}

		String propertyProposedInfrastructure = (String)attributes.get(
			"propertyProposedInfrastructure");

		if (propertyProposedInfrastructure != null) {
			setPropertyProposedInfrastructure(propertyProposedInfrastructure);
		}

		String propertyLandAreaHectare = (String)attributes.get(
			"propertyLandAreaHectare");

		if (propertyLandAreaHectare != null) {
			setPropertyLandAreaHectare(propertyLandAreaHectare);
		}

		String propertyLandAreaAcres = (String)attributes.get(
			"propertyLandAreaAcres");

		if (propertyLandAreaAcres != null) {
			setPropertyLandAreaAcres(propertyLandAreaAcres);
		}

		String propertyLandAreaRoods = (String)attributes.get(
			"propertyLandAreaRoods");

		if (propertyLandAreaRoods != null) {
			setPropertyLandAreaRoods(propertyLandAreaRoods);
		}

		String propertyLandAreaPerches = (String)attributes.get(
			"propertyLandAreaPerches");

		if (propertyLandAreaPerches != null) {
			setPropertyLandAreaPerches(propertyLandAreaPerches);
		}

		String propertyAdjoiningNorth = (String)attributes.get(
			"propertyAdjoiningNorth");

		if (propertyAdjoiningNorth != null) {
			setPropertyAdjoiningNorth(propertyAdjoiningNorth);
		}

		String propertyAdjoiningSouth = (String)attributes.get(
			"propertyAdjoiningSouth");

		if (propertyAdjoiningSouth != null) {
			setPropertyAdjoiningSouth(propertyAdjoiningSouth);
		}

		String propertyAdjoiningEast = (String)attributes.get(
			"propertyAdjoiningEast");

		if (propertyAdjoiningEast != null) {
			setPropertyAdjoiningEast(propertyAdjoiningEast);
		}

		String propertyAdjoiningWest = (String)attributes.get(
			"propertyAdjoiningWest");

		if (propertyAdjoiningWest != null) {
			setPropertyAdjoiningWest(propertyAdjoiningWest);
		}

		Date propertyDate = (Date)attributes.get("propertyDate");

		if (propertyDate != null) {
			setPropertyDate(propertyDate);
		}

		String propertyAdditionalInfo = (String)attributes.get(
			"propertyAdditionalInfo");

		if (propertyAdditionalInfo != null) {
			setPropertyAdditionalInfo(propertyAdditionalInfo);
		}

		Long acquireApplicationId = (Long)attributes.get(
			"acquireApplicationId");

		if (acquireApplicationId != null) {
			setAcquireApplicationId(acquireApplicationId);
		}
	}

	@Override
	public AcquirePropertyDetails cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acquire application ID of this acquire property details.
	 *
	 * @return the acquire application ID of this acquire property details
	 */
	@Override
	public long getAcquireApplicationId() {
		return model.getAcquireApplicationId();
	}

	/**
	 * Returns the acquire property details ID of this acquire property details.
	 *
	 * @return the acquire property details ID of this acquire property details
	 */
	@Override
	public long getAcquirePropertyDetailsId() {
		return model.getAcquirePropertyDetailsId();
	}

	/**
	 * Returns the company ID of this acquire property details.
	 *
	 * @return the company ID of this acquire property details
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acquire property details.
	 *
	 * @return the create date of this acquire property details
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this acquire property details.
	 *
	 * @return the group ID of this acquire property details
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this acquire property details.
	 *
	 * @return the modified date of this acquire property details
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this acquire property details.
	 *
	 * @return the primary key of this acquire property details
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the property additional info of this acquire property details.
	 *
	 * @return the property additional info of this acquire property details
	 */
	@Override
	public String getPropertyAdditionalInfo() {
		return model.getPropertyAdditionalInfo();
	}

	/**
	 * Returns the property addr of this acquire property details.
	 *
	 * @return the property addr of this acquire property details
	 */
	@Override
	public String getPropertyAddr() {
		return model.getPropertyAddr();
	}

	/**
	 * Returns the property adjoining east of this acquire property details.
	 *
	 * @return the property adjoining east of this acquire property details
	 */
	@Override
	public String getPropertyAdjoiningEast() {
		return model.getPropertyAdjoiningEast();
	}

	/**
	 * Returns the property adjoining north of this acquire property details.
	 *
	 * @return the property adjoining north of this acquire property details
	 */
	@Override
	public String getPropertyAdjoiningNorth() {
		return model.getPropertyAdjoiningNorth();
	}

	/**
	 * Returns the property adjoining south of this acquire property details.
	 *
	 * @return the property adjoining south of this acquire property details
	 */
	@Override
	public String getPropertyAdjoiningSouth() {
		return model.getPropertyAdjoiningSouth();
	}

	/**
	 * Returns the property adjoining west of this acquire property details.
	 *
	 * @return the property adjoining west of this acquire property details
	 */
	@Override
	public String getPropertyAdjoiningWest() {
		return model.getPropertyAdjoiningWest();
	}

	/**
	 * Returns the property current use of this acquire property details.
	 *
	 * @return the property current use of this acquire property details
	 */
	@Override
	public String getPropertyCurrentUse() {
		return model.getPropertyCurrentUse();
	}

	/**
	 * Returns the property current use other of this acquire property details.
	 *
	 * @return the property current use other of this acquire property details
	 */
	@Override
	public String getPropertyCurrentUseOther() {
		return model.getPropertyCurrentUseOther();
	}

	/**
	 * Returns the property date of this acquire property details.
	 *
	 * @return the property date of this acquire property details
	 */
	@Override
	public Date getPropertyDate() {
		return model.getPropertyDate();
	}

	/**
	 * Returns the property desired loc of this acquire property details.
	 *
	 * @return the property desired loc of this acquire property details
	 */
	@Override
	public String getPropertyDesiredLoc() {
		return model.getPropertyDesiredLoc();
	}

	/**
	 * Returns the property existing building of this acquire property details.
	 *
	 * @return the property existing building of this acquire property details
	 */
	@Override
	public String getPropertyExistingBuilding() {
		return model.getPropertyExistingBuilding();
	}

	/**
	 * Returns the property existing building other of this acquire property details.
	 *
	 * @return the property existing building other of this acquire property details
	 */
	@Override
	public String getPropertyExistingBuildingOther() {
		return model.getPropertyExistingBuildingOther();
	}

	/**
	 * Returns the property existing infrastructure of this acquire property details.
	 *
	 * @return the property existing infrastructure of this acquire property details
	 */
	@Override
	public String getPropertyExistingInfrastructure() {
		return model.getPropertyExistingInfrastructure();
	}

	/**
	 * Returns the property folio of this acquire property details.
	 *
	 * @return the property folio of this acquire property details
	 */
	@Override
	public String getPropertyFolio() {
		return model.getPropertyFolio();
	}

	/**
	 * Returns the property identified of this acquire property details.
	 *
	 * @return the property identified of this acquire property details
	 */
	@Override
	public String getPropertyIdentified() {
		return model.getPropertyIdentified();
	}

	/**
	 * Returns the property land area acres of this acquire property details.
	 *
	 * @return the property land area acres of this acquire property details
	 */
	@Override
	public String getPropertyLandAreaAcres() {
		return model.getPropertyLandAreaAcres();
	}

	/**
	 * Returns the property land area hectare of this acquire property details.
	 *
	 * @return the property land area hectare of this acquire property details
	 */
	@Override
	public String getPropertyLandAreaHectare() {
		return model.getPropertyLandAreaHectare();
	}

	/**
	 * Returns the property land area perches of this acquire property details.
	 *
	 * @return the property land area perches of this acquire property details
	 */
	@Override
	public String getPropertyLandAreaPerches() {
		return model.getPropertyLandAreaPerches();
	}

	/**
	 * Returns the property land area roods of this acquire property details.
	 *
	 * @return the property land area roods of this acquire property details
	 */
	@Override
	public String getPropertyLandAreaRoods() {
		return model.getPropertyLandAreaRoods();
	}

	/**
	 * Returns the property proposed infrastructure of this acquire property details.
	 *
	 * @return the property proposed infrastructure of this acquire property details
	 */
	@Override
	public String getPropertyProposedInfrastructure() {
		return model.getPropertyProposedInfrastructure();
	}

	/**
	 * Returns the property proposed use of this acquire property details.
	 *
	 * @return the property proposed use of this acquire property details
	 */
	@Override
	public String getPropertyProposedUse() {
		return model.getPropertyProposedUse();
	}

	/**
	 * Returns the property proposed use other of this acquire property details.
	 *
	 * @return the property proposed use other of this acquire property details
	 */
	@Override
	public String getPropertyProposedUseOther() {
		return model.getPropertyProposedUseOther();
	}

	/**
	 * Returns the property sketch attached of this acquire property details.
	 *
	 * @return the property sketch attached of this acquire property details
	 */
	@Override
	public String getPropertySketchAttached() {
		return model.getPropertySketchAttached();
	}

	/**
	 * Returns the property tenure type of this acquire property details.
	 *
	 * @return the property tenure type of this acquire property details
	 */
	@Override
	public String getPropertyTenureType() {
		return model.getPropertyTenureType();
	}

	/**
	 * Returns the property valuation num of this acquire property details.
	 *
	 * @return the property valuation num of this acquire property details
	 */
	@Override
	public String getPropertyValuationNum() {
		return model.getPropertyValuationNum();
	}

	/**
	 * Returns the property volume of this acquire property details.
	 *
	 * @return the property volume of this acquire property details
	 */
	@Override
	public String getPropertyVolume() {
		return model.getPropertyVolume();
	}

	/**
	 * Returns the user ID of this acquire property details.
	 *
	 * @return the user ID of this acquire property details
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acquire property details.
	 *
	 * @return the user name of this acquire property details
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acquire property details.
	 *
	 * @return the user uuid of this acquire property details
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
	 * Sets the acquire application ID of this acquire property details.
	 *
	 * @param acquireApplicationId the acquire application ID of this acquire property details
	 */
	@Override
	public void setAcquireApplicationId(long acquireApplicationId) {
		model.setAcquireApplicationId(acquireApplicationId);
	}

	/**
	 * Sets the acquire property details ID of this acquire property details.
	 *
	 * @param acquirePropertyDetailsId the acquire property details ID of this acquire property details
	 */
	@Override
	public void setAcquirePropertyDetailsId(long acquirePropertyDetailsId) {
		model.setAcquirePropertyDetailsId(acquirePropertyDetailsId);
	}

	/**
	 * Sets the company ID of this acquire property details.
	 *
	 * @param companyId the company ID of this acquire property details
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acquire property details.
	 *
	 * @param createDate the create date of this acquire property details
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this acquire property details.
	 *
	 * @param groupId the group ID of this acquire property details
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this acquire property details.
	 *
	 * @param modifiedDate the modified date of this acquire property details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this acquire property details.
	 *
	 * @param primaryKey the primary key of this acquire property details
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the property additional info of this acquire property details.
	 *
	 * @param propertyAdditionalInfo the property additional info of this acquire property details
	 */
	@Override
	public void setPropertyAdditionalInfo(String propertyAdditionalInfo) {
		model.setPropertyAdditionalInfo(propertyAdditionalInfo);
	}

	/**
	 * Sets the property addr of this acquire property details.
	 *
	 * @param propertyAddr the property addr of this acquire property details
	 */
	@Override
	public void setPropertyAddr(String propertyAddr) {
		model.setPropertyAddr(propertyAddr);
	}

	/**
	 * Sets the property adjoining east of this acquire property details.
	 *
	 * @param propertyAdjoiningEast the property adjoining east of this acquire property details
	 */
	@Override
	public void setPropertyAdjoiningEast(String propertyAdjoiningEast) {
		model.setPropertyAdjoiningEast(propertyAdjoiningEast);
	}

	/**
	 * Sets the property adjoining north of this acquire property details.
	 *
	 * @param propertyAdjoiningNorth the property adjoining north of this acquire property details
	 */
	@Override
	public void setPropertyAdjoiningNorth(String propertyAdjoiningNorth) {
		model.setPropertyAdjoiningNorth(propertyAdjoiningNorth);
	}

	/**
	 * Sets the property adjoining south of this acquire property details.
	 *
	 * @param propertyAdjoiningSouth the property adjoining south of this acquire property details
	 */
	@Override
	public void setPropertyAdjoiningSouth(String propertyAdjoiningSouth) {
		model.setPropertyAdjoiningSouth(propertyAdjoiningSouth);
	}

	/**
	 * Sets the property adjoining west of this acquire property details.
	 *
	 * @param propertyAdjoiningWest the property adjoining west of this acquire property details
	 */
	@Override
	public void setPropertyAdjoiningWest(String propertyAdjoiningWest) {
		model.setPropertyAdjoiningWest(propertyAdjoiningWest);
	}

	/**
	 * Sets the property current use of this acquire property details.
	 *
	 * @param propertyCurrentUse the property current use of this acquire property details
	 */
	@Override
	public void setPropertyCurrentUse(String propertyCurrentUse) {
		model.setPropertyCurrentUse(propertyCurrentUse);
	}

	/**
	 * Sets the property current use other of this acquire property details.
	 *
	 * @param propertyCurrentUseOther the property current use other of this acquire property details
	 */
	@Override
	public void setPropertyCurrentUseOther(String propertyCurrentUseOther) {
		model.setPropertyCurrentUseOther(propertyCurrentUseOther);
	}

	/**
	 * Sets the property date of this acquire property details.
	 *
	 * @param propertyDate the property date of this acquire property details
	 */
	@Override
	public void setPropertyDate(Date propertyDate) {
		model.setPropertyDate(propertyDate);
	}

	/**
	 * Sets the property desired loc of this acquire property details.
	 *
	 * @param propertyDesiredLoc the property desired loc of this acquire property details
	 */
	@Override
	public void setPropertyDesiredLoc(String propertyDesiredLoc) {
		model.setPropertyDesiredLoc(propertyDesiredLoc);
	}

	/**
	 * Sets the property existing building of this acquire property details.
	 *
	 * @param propertyExistingBuilding the property existing building of this acquire property details
	 */
	@Override
	public void setPropertyExistingBuilding(String propertyExistingBuilding) {
		model.setPropertyExistingBuilding(propertyExistingBuilding);
	}

	/**
	 * Sets the property existing building other of this acquire property details.
	 *
	 * @param propertyExistingBuildingOther the property existing building other of this acquire property details
	 */
	@Override
	public void setPropertyExistingBuildingOther(
		String propertyExistingBuildingOther) {

		model.setPropertyExistingBuildingOther(propertyExistingBuildingOther);
	}

	/**
	 * Sets the property existing infrastructure of this acquire property details.
	 *
	 * @param propertyExistingInfrastructure the property existing infrastructure of this acquire property details
	 */
	@Override
	public void setPropertyExistingInfrastructure(
		String propertyExistingInfrastructure) {

		model.setPropertyExistingInfrastructure(propertyExistingInfrastructure);
	}

	/**
	 * Sets the property folio of this acquire property details.
	 *
	 * @param propertyFolio the property folio of this acquire property details
	 */
	@Override
	public void setPropertyFolio(String propertyFolio) {
		model.setPropertyFolio(propertyFolio);
	}

	/**
	 * Sets the property identified of this acquire property details.
	 *
	 * @param propertyIdentified the property identified of this acquire property details
	 */
	@Override
	public void setPropertyIdentified(String propertyIdentified) {
		model.setPropertyIdentified(propertyIdentified);
	}

	/**
	 * Sets the property land area acres of this acquire property details.
	 *
	 * @param propertyLandAreaAcres the property land area acres of this acquire property details
	 */
	@Override
	public void setPropertyLandAreaAcres(String propertyLandAreaAcres) {
		model.setPropertyLandAreaAcres(propertyLandAreaAcres);
	}

	/**
	 * Sets the property land area hectare of this acquire property details.
	 *
	 * @param propertyLandAreaHectare the property land area hectare of this acquire property details
	 */
	@Override
	public void setPropertyLandAreaHectare(String propertyLandAreaHectare) {
		model.setPropertyLandAreaHectare(propertyLandAreaHectare);
	}

	/**
	 * Sets the property land area perches of this acquire property details.
	 *
	 * @param propertyLandAreaPerches the property land area perches of this acquire property details
	 */
	@Override
	public void setPropertyLandAreaPerches(String propertyLandAreaPerches) {
		model.setPropertyLandAreaPerches(propertyLandAreaPerches);
	}

	/**
	 * Sets the property land area roods of this acquire property details.
	 *
	 * @param propertyLandAreaRoods the property land area roods of this acquire property details
	 */
	@Override
	public void setPropertyLandAreaRoods(String propertyLandAreaRoods) {
		model.setPropertyLandAreaRoods(propertyLandAreaRoods);
	}

	/**
	 * Sets the property proposed infrastructure of this acquire property details.
	 *
	 * @param propertyProposedInfrastructure the property proposed infrastructure of this acquire property details
	 */
	@Override
	public void setPropertyProposedInfrastructure(
		String propertyProposedInfrastructure) {

		model.setPropertyProposedInfrastructure(propertyProposedInfrastructure);
	}

	/**
	 * Sets the property proposed use of this acquire property details.
	 *
	 * @param propertyProposedUse the property proposed use of this acquire property details
	 */
	@Override
	public void setPropertyProposedUse(String propertyProposedUse) {
		model.setPropertyProposedUse(propertyProposedUse);
	}

	/**
	 * Sets the property proposed use other of this acquire property details.
	 *
	 * @param propertyProposedUseOther the property proposed use other of this acquire property details
	 */
	@Override
	public void setPropertyProposedUseOther(String propertyProposedUseOther) {
		model.setPropertyProposedUseOther(propertyProposedUseOther);
	}

	/**
	 * Sets the property sketch attached of this acquire property details.
	 *
	 * @param propertySketchAttached the property sketch attached of this acquire property details
	 */
	@Override
	public void setPropertySketchAttached(String propertySketchAttached) {
		model.setPropertySketchAttached(propertySketchAttached);
	}

	/**
	 * Sets the property tenure type of this acquire property details.
	 *
	 * @param propertyTenureType the property tenure type of this acquire property details
	 */
	@Override
	public void setPropertyTenureType(String propertyTenureType) {
		model.setPropertyTenureType(propertyTenureType);
	}

	/**
	 * Sets the property valuation num of this acquire property details.
	 *
	 * @param propertyValuationNum the property valuation num of this acquire property details
	 */
	@Override
	public void setPropertyValuationNum(String propertyValuationNum) {
		model.setPropertyValuationNum(propertyValuationNum);
	}

	/**
	 * Sets the property volume of this acquire property details.
	 *
	 * @param propertyVolume the property volume of this acquire property details
	 */
	@Override
	public void setPropertyVolume(String propertyVolume) {
		model.setPropertyVolume(propertyVolume);
	}

	/**
	 * Sets the user ID of this acquire property details.
	 *
	 * @param userId the user ID of this acquire property details
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acquire property details.
	 *
	 * @param userName the user name of this acquire property details
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acquire property details.
	 *
	 * @param userUuid the user uuid of this acquire property details
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
	protected AcquirePropertyDetailsWrapper wrap(
		AcquirePropertyDetails acquirePropertyDetails) {

		return new AcquirePropertyDetailsWrapper(acquirePropertyDetails);
	}

}