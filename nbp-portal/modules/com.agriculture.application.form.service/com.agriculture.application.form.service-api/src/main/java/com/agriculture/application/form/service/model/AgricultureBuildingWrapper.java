/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AgricultureBuilding}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureBuilding
 * @generated
 */
public class AgricultureBuildingWrapper
	extends BaseModelWrapper<AgricultureBuilding>
	implements AgricultureBuilding, ModelWrapper<AgricultureBuilding> {

	public AgricultureBuildingWrapper(AgricultureBuilding agricultureBuilding) {
		super(agricultureBuilding);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("agricultureBuildingId", getAgricultureBuildingId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("buildingPurpose", getBuildingPurpose());
		attributes.put("buildingSize", getBuildingSize());
		attributes.put("machineryDescription", getMachineryDescription());
		attributes.put("dateOfAcquisition", getDateOfAcquisition());
		attributes.put("buildingCost", getBuildingCost());
		attributes.put("presentBookValue", getPresentBookValue());
		attributes.put("buildingCounter", getBuildingCounter());
		attributes.put(
			"agricultureApplicationId", getAgricultureApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long agricultureBuildingId = (Long)attributes.get(
			"agricultureBuildingId");

		if (agricultureBuildingId != null) {
			setAgricultureBuildingId(agricultureBuildingId);
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

		String buildingPurpose = (String)attributes.get("buildingPurpose");

		if (buildingPurpose != null) {
			setBuildingPurpose(buildingPurpose);
		}

		String buildingSize = (String)attributes.get("buildingSize");

		if (buildingSize != null) {
			setBuildingSize(buildingSize);
		}

		String machineryDescription = (String)attributes.get(
			"machineryDescription");

		if (machineryDescription != null) {
			setMachineryDescription(machineryDescription);
		}

		Date dateOfAcquisition = (Date)attributes.get("dateOfAcquisition");

		if (dateOfAcquisition != null) {
			setDateOfAcquisition(dateOfAcquisition);
		}

		String buildingCost = (String)attributes.get("buildingCost");

		if (buildingCost != null) {
			setBuildingCost(buildingCost);
		}

		String presentBookValue = (String)attributes.get("presentBookValue");

		if (presentBookValue != null) {
			setPresentBookValue(presentBookValue);
		}

		String buildingCounter = (String)attributes.get("buildingCounter");

		if (buildingCounter != null) {
			setBuildingCounter(buildingCounter);
		}

		Long agricultureApplicationId = (Long)attributes.get(
			"agricultureApplicationId");

		if (agricultureApplicationId != null) {
			setAgricultureApplicationId(agricultureApplicationId);
		}
	}

	@Override
	public AgricultureBuilding cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the agriculture application ID of this agriculture building.
	 *
	 * @return the agriculture application ID of this agriculture building
	 */
	@Override
	public long getAgricultureApplicationId() {
		return model.getAgricultureApplicationId();
	}

	/**
	 * Returns the agriculture building ID of this agriculture building.
	 *
	 * @return the agriculture building ID of this agriculture building
	 */
	@Override
	public long getAgricultureBuildingId() {
		return model.getAgricultureBuildingId();
	}

	/**
	 * Returns the building cost of this agriculture building.
	 *
	 * @return the building cost of this agriculture building
	 */
	@Override
	public String getBuildingCost() {
		return model.getBuildingCost();
	}

	/**
	 * Returns the building counter of this agriculture building.
	 *
	 * @return the building counter of this agriculture building
	 */
	@Override
	public String getBuildingCounter() {
		return model.getBuildingCounter();
	}

	/**
	 * Returns the building purpose of this agriculture building.
	 *
	 * @return the building purpose of this agriculture building
	 */
	@Override
	public String getBuildingPurpose() {
		return model.getBuildingPurpose();
	}

	/**
	 * Returns the building size of this agriculture building.
	 *
	 * @return the building size of this agriculture building
	 */
	@Override
	public String getBuildingSize() {
		return model.getBuildingSize();
	}

	/**
	 * Returns the company ID of this agriculture building.
	 *
	 * @return the company ID of this agriculture building
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this agriculture building.
	 *
	 * @return the create date of this agriculture building
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of acquisition of this agriculture building.
	 *
	 * @return the date of acquisition of this agriculture building
	 */
	@Override
	public Date getDateOfAcquisition() {
		return model.getDateOfAcquisition();
	}

	/**
	 * Returns the group ID of this agriculture building.
	 *
	 * @return the group ID of this agriculture building
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the machinery description of this agriculture building.
	 *
	 * @return the machinery description of this agriculture building
	 */
	@Override
	public String getMachineryDescription() {
		return model.getMachineryDescription();
	}

	/**
	 * Returns the modified date of this agriculture building.
	 *
	 * @return the modified date of this agriculture building
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the present book value of this agriculture building.
	 *
	 * @return the present book value of this agriculture building
	 */
	@Override
	public String getPresentBookValue() {
		return model.getPresentBookValue();
	}

	/**
	 * Returns the primary key of this agriculture building.
	 *
	 * @return the primary key of this agriculture building
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this agriculture building.
	 *
	 * @return the user ID of this agriculture building
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this agriculture building.
	 *
	 * @return the user name of this agriculture building
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this agriculture building.
	 *
	 * @return the user uuid of this agriculture building
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
	 * Sets the agriculture application ID of this agriculture building.
	 *
	 * @param agricultureApplicationId the agriculture application ID of this agriculture building
	 */
	@Override
	public void setAgricultureApplicationId(long agricultureApplicationId) {
		model.setAgricultureApplicationId(agricultureApplicationId);
	}

	/**
	 * Sets the agriculture building ID of this agriculture building.
	 *
	 * @param agricultureBuildingId the agriculture building ID of this agriculture building
	 */
	@Override
	public void setAgricultureBuildingId(long agricultureBuildingId) {
		model.setAgricultureBuildingId(agricultureBuildingId);
	}

	/**
	 * Sets the building cost of this agriculture building.
	 *
	 * @param buildingCost the building cost of this agriculture building
	 */
	@Override
	public void setBuildingCost(String buildingCost) {
		model.setBuildingCost(buildingCost);
	}

	/**
	 * Sets the building counter of this agriculture building.
	 *
	 * @param buildingCounter the building counter of this agriculture building
	 */
	@Override
	public void setBuildingCounter(String buildingCounter) {
		model.setBuildingCounter(buildingCounter);
	}

	/**
	 * Sets the building purpose of this agriculture building.
	 *
	 * @param buildingPurpose the building purpose of this agriculture building
	 */
	@Override
	public void setBuildingPurpose(String buildingPurpose) {
		model.setBuildingPurpose(buildingPurpose);
	}

	/**
	 * Sets the building size of this agriculture building.
	 *
	 * @param buildingSize the building size of this agriculture building
	 */
	@Override
	public void setBuildingSize(String buildingSize) {
		model.setBuildingSize(buildingSize);
	}

	/**
	 * Sets the company ID of this agriculture building.
	 *
	 * @param companyId the company ID of this agriculture building
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this agriculture building.
	 *
	 * @param createDate the create date of this agriculture building
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of acquisition of this agriculture building.
	 *
	 * @param dateOfAcquisition the date of acquisition of this agriculture building
	 */
	@Override
	public void setDateOfAcquisition(Date dateOfAcquisition) {
		model.setDateOfAcquisition(dateOfAcquisition);
	}

	/**
	 * Sets the group ID of this agriculture building.
	 *
	 * @param groupId the group ID of this agriculture building
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the machinery description of this agriculture building.
	 *
	 * @param machineryDescription the machinery description of this agriculture building
	 */
	@Override
	public void setMachineryDescription(String machineryDescription) {
		model.setMachineryDescription(machineryDescription);
	}

	/**
	 * Sets the modified date of this agriculture building.
	 *
	 * @param modifiedDate the modified date of this agriculture building
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the present book value of this agriculture building.
	 *
	 * @param presentBookValue the present book value of this agriculture building
	 */
	@Override
	public void setPresentBookValue(String presentBookValue) {
		model.setPresentBookValue(presentBookValue);
	}

	/**
	 * Sets the primary key of this agriculture building.
	 *
	 * @param primaryKey the primary key of this agriculture building
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this agriculture building.
	 *
	 * @param userId the user ID of this agriculture building
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this agriculture building.
	 *
	 * @param userName the user name of this agriculture building
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this agriculture building.
	 *
	 * @param userUuid the user uuid of this agriculture building
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
	protected AgricultureBuildingWrapper wrap(
		AgricultureBuilding agricultureBuilding) {

		return new AgricultureBuildingWrapper(agricultureBuilding);
	}

}