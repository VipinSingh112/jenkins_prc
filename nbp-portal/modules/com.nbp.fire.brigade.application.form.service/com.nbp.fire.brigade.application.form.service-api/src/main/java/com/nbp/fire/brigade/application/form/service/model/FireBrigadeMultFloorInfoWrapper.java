/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FireBrigadeMultFloorInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeMultFloorInfo
 * @generated
 */
public class FireBrigadeMultFloorInfoWrapper
	extends BaseModelWrapper<FireBrigadeMultFloorInfo>
	implements FireBrigadeMultFloorInfo,
			   ModelWrapper<FireBrigadeMultFloorInfo> {

	public FireBrigadeMultFloorInfoWrapper(
		FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo) {

		super(fireBrigadeMultFloorInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"fireBrigadeMultFloorInfoId", getFireBrigadeMultFloorInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("floorAlternateExist", getFloorAlternateExist());
		attributes.put("buildingRisingMain", getBuildingRisingMain());
		attributes.put("equipmentConnection", getEquipmentConnection());
		attributes.put("buildingParkingGarage", getBuildingParkingGarage());
		attributes.put(
			"fireBrigadeApplicationId", getFireBrigadeApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fireBrigadeMultFloorInfoId = (Long)attributes.get(
			"fireBrigadeMultFloorInfoId");

		if (fireBrigadeMultFloorInfoId != null) {
			setFireBrigadeMultFloorInfoId(fireBrigadeMultFloorInfoId);
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

		String floorAlternateExist = (String)attributes.get(
			"floorAlternateExist");

		if (floorAlternateExist != null) {
			setFloorAlternateExist(floorAlternateExist);
		}

		String buildingRisingMain = (String)attributes.get(
			"buildingRisingMain");

		if (buildingRisingMain != null) {
			setBuildingRisingMain(buildingRisingMain);
		}

		String equipmentConnection = (String)attributes.get(
			"equipmentConnection");

		if (equipmentConnection != null) {
			setEquipmentConnection(equipmentConnection);
		}

		String buildingParkingGarage = (String)attributes.get(
			"buildingParkingGarage");

		if (buildingParkingGarage != null) {
			setBuildingParkingGarage(buildingParkingGarage);
		}

		Long fireBrigadeApplicationId = (Long)attributes.get(
			"fireBrigadeApplicationId");

		if (fireBrigadeApplicationId != null) {
			setFireBrigadeApplicationId(fireBrigadeApplicationId);
		}
	}

	@Override
	public FireBrigadeMultFloorInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the building parking garage of this fire brigade mult floor info.
	 *
	 * @return the building parking garage of this fire brigade mult floor info
	 */
	@Override
	public String getBuildingParkingGarage() {
		return model.getBuildingParkingGarage();
	}

	/**
	 * Returns the building rising main of this fire brigade mult floor info.
	 *
	 * @return the building rising main of this fire brigade mult floor info
	 */
	@Override
	public String getBuildingRisingMain() {
		return model.getBuildingRisingMain();
	}

	/**
	 * Returns the company ID of this fire brigade mult floor info.
	 *
	 * @return the company ID of this fire brigade mult floor info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this fire brigade mult floor info.
	 *
	 * @return the create date of this fire brigade mult floor info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the equipment connection of this fire brigade mult floor info.
	 *
	 * @return the equipment connection of this fire brigade mult floor info
	 */
	@Override
	public String getEquipmentConnection() {
		return model.getEquipmentConnection();
	}

	/**
	 * Returns the fire brigade application ID of this fire brigade mult floor info.
	 *
	 * @return the fire brigade application ID of this fire brigade mult floor info
	 */
	@Override
	public long getFireBrigadeApplicationId() {
		return model.getFireBrigadeApplicationId();
	}

	/**
	 * Returns the fire brigade mult floor info ID of this fire brigade mult floor info.
	 *
	 * @return the fire brigade mult floor info ID of this fire brigade mult floor info
	 */
	@Override
	public long getFireBrigadeMultFloorInfoId() {
		return model.getFireBrigadeMultFloorInfoId();
	}

	/**
	 * Returns the floor alternate exist of this fire brigade mult floor info.
	 *
	 * @return the floor alternate exist of this fire brigade mult floor info
	 */
	@Override
	public String getFloorAlternateExist() {
		return model.getFloorAlternateExist();
	}

	/**
	 * Returns the group ID of this fire brigade mult floor info.
	 *
	 * @return the group ID of this fire brigade mult floor info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this fire brigade mult floor info.
	 *
	 * @return the modified date of this fire brigade mult floor info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this fire brigade mult floor info.
	 *
	 * @return the primary key of this fire brigade mult floor info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this fire brigade mult floor info.
	 *
	 * @return the user ID of this fire brigade mult floor info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this fire brigade mult floor info.
	 *
	 * @return the user name of this fire brigade mult floor info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this fire brigade mult floor info.
	 *
	 * @return the user uuid of this fire brigade mult floor info
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
	 * Sets the building parking garage of this fire brigade mult floor info.
	 *
	 * @param buildingParkingGarage the building parking garage of this fire brigade mult floor info
	 */
	@Override
	public void setBuildingParkingGarage(String buildingParkingGarage) {
		model.setBuildingParkingGarage(buildingParkingGarage);
	}

	/**
	 * Sets the building rising main of this fire brigade mult floor info.
	 *
	 * @param buildingRisingMain the building rising main of this fire brigade mult floor info
	 */
	@Override
	public void setBuildingRisingMain(String buildingRisingMain) {
		model.setBuildingRisingMain(buildingRisingMain);
	}

	/**
	 * Sets the company ID of this fire brigade mult floor info.
	 *
	 * @param companyId the company ID of this fire brigade mult floor info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this fire brigade mult floor info.
	 *
	 * @param createDate the create date of this fire brigade mult floor info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the equipment connection of this fire brigade mult floor info.
	 *
	 * @param equipmentConnection the equipment connection of this fire brigade mult floor info
	 */
	@Override
	public void setEquipmentConnection(String equipmentConnection) {
		model.setEquipmentConnection(equipmentConnection);
	}

	/**
	 * Sets the fire brigade application ID of this fire brigade mult floor info.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID of this fire brigade mult floor info
	 */
	@Override
	public void setFireBrigadeApplicationId(long fireBrigadeApplicationId) {
		model.setFireBrigadeApplicationId(fireBrigadeApplicationId);
	}

	/**
	 * Sets the fire brigade mult floor info ID of this fire brigade mult floor info.
	 *
	 * @param fireBrigadeMultFloorInfoId the fire brigade mult floor info ID of this fire brigade mult floor info
	 */
	@Override
	public void setFireBrigadeMultFloorInfoId(long fireBrigadeMultFloorInfoId) {
		model.setFireBrigadeMultFloorInfoId(fireBrigadeMultFloorInfoId);
	}

	/**
	 * Sets the floor alternate exist of this fire brigade mult floor info.
	 *
	 * @param floorAlternateExist the floor alternate exist of this fire brigade mult floor info
	 */
	@Override
	public void setFloorAlternateExist(String floorAlternateExist) {
		model.setFloorAlternateExist(floorAlternateExist);
	}

	/**
	 * Sets the group ID of this fire brigade mult floor info.
	 *
	 * @param groupId the group ID of this fire brigade mult floor info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this fire brigade mult floor info.
	 *
	 * @param modifiedDate the modified date of this fire brigade mult floor info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this fire brigade mult floor info.
	 *
	 * @param primaryKey the primary key of this fire brigade mult floor info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this fire brigade mult floor info.
	 *
	 * @param userId the user ID of this fire brigade mult floor info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this fire brigade mult floor info.
	 *
	 * @param userName the user name of this fire brigade mult floor info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this fire brigade mult floor info.
	 *
	 * @param userUuid the user uuid of this fire brigade mult floor info
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
	protected FireBrigadeMultFloorInfoWrapper wrap(
		FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo) {

		return new FireBrigadeMultFloorInfoWrapper(fireBrigadeMultFloorInfo);
	}

}