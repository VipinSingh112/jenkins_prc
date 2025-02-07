/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FarmerCurrentStage}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerCurrentStage
 * @generated
 */
public class FarmerCurrentStageWrapper
	extends BaseModelWrapper<FarmerCurrentStage>
	implements FarmerCurrentStage, ModelWrapper<FarmerCurrentStage> {

	public FarmerCurrentStageWrapper(FarmerCurrentStage farmerCurrentStage) {
		super(farmerCurrentStage);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("farmerCurrentStageId", getFarmerCurrentStageId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("currentStage", getCurrentStage());
		attributes.put("lastFormStage", getLastFormStage());
		attributes.put("farmerApplicationId", getFarmerApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long farmerCurrentStageId = (Long)attributes.get(
			"farmerCurrentStageId");

		if (farmerCurrentStageId != null) {
			setFarmerCurrentStageId(farmerCurrentStageId);
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

		String currentStage = (String)attributes.get("currentStage");

		if (currentStage != null) {
			setCurrentStage(currentStage);
		}

		String lastFormStage = (String)attributes.get("lastFormStage");

		if (lastFormStage != null) {
			setLastFormStage(lastFormStage);
		}

		Long farmerApplicationId = (Long)attributes.get("farmerApplicationId");

		if (farmerApplicationId != null) {
			setFarmerApplicationId(farmerApplicationId);
		}
	}

	@Override
	public FarmerCurrentStage cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this farmer current stage.
	 *
	 * @return the company ID of this farmer current stage
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this farmer current stage.
	 *
	 * @return the create date of this farmer current stage
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the current stage of this farmer current stage.
	 *
	 * @return the current stage of this farmer current stage
	 */
	@Override
	public String getCurrentStage() {
		return model.getCurrentStage();
	}

	/**
	 * Returns the farmer application ID of this farmer current stage.
	 *
	 * @return the farmer application ID of this farmer current stage
	 */
	@Override
	public long getFarmerApplicationId() {
		return model.getFarmerApplicationId();
	}

	/**
	 * Returns the farmer current stage ID of this farmer current stage.
	 *
	 * @return the farmer current stage ID of this farmer current stage
	 */
	@Override
	public long getFarmerCurrentStageId() {
		return model.getFarmerCurrentStageId();
	}

	/**
	 * Returns the group ID of this farmer current stage.
	 *
	 * @return the group ID of this farmer current stage
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the last form stage of this farmer current stage.
	 *
	 * @return the last form stage of this farmer current stage
	 */
	@Override
	public String getLastFormStage() {
		return model.getLastFormStage();
	}

	/**
	 * Returns the modified date of this farmer current stage.
	 *
	 * @return the modified date of this farmer current stage
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this farmer current stage.
	 *
	 * @return the primary key of this farmer current stage
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this farmer current stage.
	 *
	 * @return the user ID of this farmer current stage
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this farmer current stage.
	 *
	 * @return the user name of this farmer current stage
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this farmer current stage.
	 *
	 * @return the user uuid of this farmer current stage
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
	 * Sets the company ID of this farmer current stage.
	 *
	 * @param companyId the company ID of this farmer current stage
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this farmer current stage.
	 *
	 * @param createDate the create date of this farmer current stage
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the current stage of this farmer current stage.
	 *
	 * @param currentStage the current stage of this farmer current stage
	 */
	@Override
	public void setCurrentStage(String currentStage) {
		model.setCurrentStage(currentStage);
	}

	/**
	 * Sets the farmer application ID of this farmer current stage.
	 *
	 * @param farmerApplicationId the farmer application ID of this farmer current stage
	 */
	@Override
	public void setFarmerApplicationId(long farmerApplicationId) {
		model.setFarmerApplicationId(farmerApplicationId);
	}

	/**
	 * Sets the farmer current stage ID of this farmer current stage.
	 *
	 * @param farmerCurrentStageId the farmer current stage ID of this farmer current stage
	 */
	@Override
	public void setFarmerCurrentStageId(long farmerCurrentStageId) {
		model.setFarmerCurrentStageId(farmerCurrentStageId);
	}

	/**
	 * Sets the group ID of this farmer current stage.
	 *
	 * @param groupId the group ID of this farmer current stage
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the last form stage of this farmer current stage.
	 *
	 * @param lastFormStage the last form stage of this farmer current stage
	 */
	@Override
	public void setLastFormStage(String lastFormStage) {
		model.setLastFormStage(lastFormStage);
	}

	/**
	 * Sets the modified date of this farmer current stage.
	 *
	 * @param modifiedDate the modified date of this farmer current stage
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this farmer current stage.
	 *
	 * @param primaryKey the primary key of this farmer current stage
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this farmer current stage.
	 *
	 * @param userId the user ID of this farmer current stage
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this farmer current stage.
	 *
	 * @param userName the user name of this farmer current stage
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this farmer current stage.
	 *
	 * @param userUuid the user uuid of this farmer current stage
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected FarmerCurrentStageWrapper wrap(
		FarmerCurrentStage farmerCurrentStage) {

		return new FarmerCurrentStageWrapper(farmerCurrentStage);
	}

}