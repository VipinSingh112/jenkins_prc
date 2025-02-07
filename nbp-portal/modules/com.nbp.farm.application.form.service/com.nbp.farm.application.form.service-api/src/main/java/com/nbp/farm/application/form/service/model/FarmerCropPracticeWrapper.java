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
 * This class is a wrapper for {@link FarmerCropPractice}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerCropPractice
 * @generated
 */
public class FarmerCropPracticeWrapper
	extends BaseModelWrapper<FarmerCropPractice>
	implements FarmerCropPractice, ModelWrapper<FarmerCropPractice> {

	public FarmerCropPracticeWrapper(FarmerCropPractice farmerCropPractice) {
		super(farmerCropPractice);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("farmerCropPracticeId", getFarmerCropPracticeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("crop1landPrepration", getCrop1landPrepration());
		attributes.put("crop1CropCare", getCrop1CropCare());
		attributes.put("crop1water", getCrop1water());
		attributes.put("crop1postHarvest", getCrop1postHarvest());
		attributes.put("crop02", getCrop02());
		attributes.put("crop03", getCrop03());
		attributes.put("cropPracticeCounter", getCropPracticeCounter());
		attributes.put("farmerApplicationId", getFarmerApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long farmerCropPracticeId = (Long)attributes.get(
			"farmerCropPracticeId");

		if (farmerCropPracticeId != null) {
			setFarmerCropPracticeId(farmerCropPracticeId);
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

		String crop1landPrepration = (String)attributes.get(
			"crop1landPrepration");

		if (crop1landPrepration != null) {
			setCrop1landPrepration(crop1landPrepration);
		}

		String crop1CropCare = (String)attributes.get("crop1CropCare");

		if (crop1CropCare != null) {
			setCrop1CropCare(crop1CropCare);
		}

		String crop1water = (String)attributes.get("crop1water");

		if (crop1water != null) {
			setCrop1water(crop1water);
		}

		String crop1postHarvest = (String)attributes.get("crop1postHarvest");

		if (crop1postHarvest != null) {
			setCrop1postHarvest(crop1postHarvest);
		}

		String crop02 = (String)attributes.get("crop02");

		if (crop02 != null) {
			setCrop02(crop02);
		}

		String crop03 = (String)attributes.get("crop03");

		if (crop03 != null) {
			setCrop03(crop03);
		}

		String cropPracticeCounter = (String)attributes.get(
			"cropPracticeCounter");

		if (cropPracticeCounter != null) {
			setCropPracticeCounter(cropPracticeCounter);
		}

		Long farmerApplicationId = (Long)attributes.get("farmerApplicationId");

		if (farmerApplicationId != null) {
			setFarmerApplicationId(farmerApplicationId);
		}
	}

	@Override
	public FarmerCropPractice cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this farmer crop practice.
	 *
	 * @return the company ID of this farmer crop practice
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this farmer crop practice.
	 *
	 * @return the create date of this farmer crop practice
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the crop02 of this farmer crop practice.
	 *
	 * @return the crop02 of this farmer crop practice
	 */
	@Override
	public String getCrop02() {
		return model.getCrop02();
	}

	/**
	 * Returns the crop03 of this farmer crop practice.
	 *
	 * @return the crop03 of this farmer crop practice
	 */
	@Override
	public String getCrop03() {
		return model.getCrop03();
	}

	/**
	 * Returns the crop1 crop care of this farmer crop practice.
	 *
	 * @return the crop1 crop care of this farmer crop practice
	 */
	@Override
	public String getCrop1CropCare() {
		return model.getCrop1CropCare();
	}

	/**
	 * Returns the crop1land prepration of this farmer crop practice.
	 *
	 * @return the crop1land prepration of this farmer crop practice
	 */
	@Override
	public String getCrop1landPrepration() {
		return model.getCrop1landPrepration();
	}

	/**
	 * Returns the crop1post harvest of this farmer crop practice.
	 *
	 * @return the crop1post harvest of this farmer crop practice
	 */
	@Override
	public String getCrop1postHarvest() {
		return model.getCrop1postHarvest();
	}

	/**
	 * Returns the crop1water of this farmer crop practice.
	 *
	 * @return the crop1water of this farmer crop practice
	 */
	@Override
	public String getCrop1water() {
		return model.getCrop1water();
	}

	/**
	 * Returns the crop practice counter of this farmer crop practice.
	 *
	 * @return the crop practice counter of this farmer crop practice
	 */
	@Override
	public String getCropPracticeCounter() {
		return model.getCropPracticeCounter();
	}

	/**
	 * Returns the farmer application ID of this farmer crop practice.
	 *
	 * @return the farmer application ID of this farmer crop practice
	 */
	@Override
	public long getFarmerApplicationId() {
		return model.getFarmerApplicationId();
	}

	/**
	 * Returns the farmer crop practice ID of this farmer crop practice.
	 *
	 * @return the farmer crop practice ID of this farmer crop practice
	 */
	@Override
	public long getFarmerCropPracticeId() {
		return model.getFarmerCropPracticeId();
	}

	/**
	 * Returns the group ID of this farmer crop practice.
	 *
	 * @return the group ID of this farmer crop practice
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this farmer crop practice.
	 *
	 * @return the modified date of this farmer crop practice
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this farmer crop practice.
	 *
	 * @return the primary key of this farmer crop practice
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this farmer crop practice.
	 *
	 * @return the user ID of this farmer crop practice
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this farmer crop practice.
	 *
	 * @return the user name of this farmer crop practice
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this farmer crop practice.
	 *
	 * @return the user uuid of this farmer crop practice
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
	 * Sets the company ID of this farmer crop practice.
	 *
	 * @param companyId the company ID of this farmer crop practice
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this farmer crop practice.
	 *
	 * @param createDate the create date of this farmer crop practice
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the crop02 of this farmer crop practice.
	 *
	 * @param crop02 the crop02 of this farmer crop practice
	 */
	@Override
	public void setCrop02(String crop02) {
		model.setCrop02(crop02);
	}

	/**
	 * Sets the crop03 of this farmer crop practice.
	 *
	 * @param crop03 the crop03 of this farmer crop practice
	 */
	@Override
	public void setCrop03(String crop03) {
		model.setCrop03(crop03);
	}

	/**
	 * Sets the crop1 crop care of this farmer crop practice.
	 *
	 * @param crop1CropCare the crop1 crop care of this farmer crop practice
	 */
	@Override
	public void setCrop1CropCare(String crop1CropCare) {
		model.setCrop1CropCare(crop1CropCare);
	}

	/**
	 * Sets the crop1land prepration of this farmer crop practice.
	 *
	 * @param crop1landPrepration the crop1land prepration of this farmer crop practice
	 */
	@Override
	public void setCrop1landPrepration(String crop1landPrepration) {
		model.setCrop1landPrepration(crop1landPrepration);
	}

	/**
	 * Sets the crop1post harvest of this farmer crop practice.
	 *
	 * @param crop1postHarvest the crop1post harvest of this farmer crop practice
	 */
	@Override
	public void setCrop1postHarvest(String crop1postHarvest) {
		model.setCrop1postHarvest(crop1postHarvest);
	}

	/**
	 * Sets the crop1water of this farmer crop practice.
	 *
	 * @param crop1water the crop1water of this farmer crop practice
	 */
	@Override
	public void setCrop1water(String crop1water) {
		model.setCrop1water(crop1water);
	}

	/**
	 * Sets the crop practice counter of this farmer crop practice.
	 *
	 * @param cropPracticeCounter the crop practice counter of this farmer crop practice
	 */
	@Override
	public void setCropPracticeCounter(String cropPracticeCounter) {
		model.setCropPracticeCounter(cropPracticeCounter);
	}

	/**
	 * Sets the farmer application ID of this farmer crop practice.
	 *
	 * @param farmerApplicationId the farmer application ID of this farmer crop practice
	 */
	@Override
	public void setFarmerApplicationId(long farmerApplicationId) {
		model.setFarmerApplicationId(farmerApplicationId);
	}

	/**
	 * Sets the farmer crop practice ID of this farmer crop practice.
	 *
	 * @param farmerCropPracticeId the farmer crop practice ID of this farmer crop practice
	 */
	@Override
	public void setFarmerCropPracticeId(long farmerCropPracticeId) {
		model.setFarmerCropPracticeId(farmerCropPracticeId);
	}

	/**
	 * Sets the group ID of this farmer crop practice.
	 *
	 * @param groupId the group ID of this farmer crop practice
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this farmer crop practice.
	 *
	 * @param modifiedDate the modified date of this farmer crop practice
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this farmer crop practice.
	 *
	 * @param primaryKey the primary key of this farmer crop practice
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this farmer crop practice.
	 *
	 * @param userId the user ID of this farmer crop practice
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this farmer crop practice.
	 *
	 * @param userName the user name of this farmer crop practice
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this farmer crop practice.
	 *
	 * @param userUuid the user uuid of this farmer crop practice
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected FarmerCropPracticeWrapper wrap(
		FarmerCropPractice farmerCropPractice) {

		return new FarmerCropPracticeWrapper(farmerCropPractice);
	}

}