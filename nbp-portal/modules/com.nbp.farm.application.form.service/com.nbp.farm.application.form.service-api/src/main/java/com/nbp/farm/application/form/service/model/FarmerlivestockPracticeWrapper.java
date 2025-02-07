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
 * This class is a wrapper for {@link FarmerlivestockPractice}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerlivestockPractice
 * @generated
 */
public class FarmerlivestockPracticeWrapper
	extends BaseModelWrapper<FarmerlivestockPractice>
	implements FarmerlivestockPractice, ModelWrapper<FarmerlivestockPractice> {

	public FarmerlivestockPracticeWrapper(
		FarmerlivestockPractice farmerlivestockPractice) {

		super(farmerlivestockPractice);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"farmerLivestockPracticeId", getFarmerLivestockPracticeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("husbandry", getHusbandry());
		attributes.put("liveStockCare", getLiveStockCare());
		attributes.put("nutrient", getNutrient());
		attributes.put("water", getWater());
		attributes.put("postHarvest", getPostHarvest());
		attributes.put("remarks", getRemarks());
		attributes.put(
			"livestockPracticeCounter", getLivestockPracticeCounter());
		attributes.put("farmerApplicationId", getFarmerApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long farmerLivestockPracticeId = (Long)attributes.get(
			"farmerLivestockPracticeId");

		if (farmerLivestockPracticeId != null) {
			setFarmerLivestockPracticeId(farmerLivestockPracticeId);
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

		String husbandry = (String)attributes.get("husbandry");

		if (husbandry != null) {
			setHusbandry(husbandry);
		}

		String liveStockCare = (String)attributes.get("liveStockCare");

		if (liveStockCare != null) {
			setLiveStockCare(liveStockCare);
		}

		String nutrient = (String)attributes.get("nutrient");

		if (nutrient != null) {
			setNutrient(nutrient);
		}

		String water = (String)attributes.get("water");

		if (water != null) {
			setWater(water);
		}

		String postHarvest = (String)attributes.get("postHarvest");

		if (postHarvest != null) {
			setPostHarvest(postHarvest);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		String livestockPracticeCounter = (String)attributes.get(
			"livestockPracticeCounter");

		if (livestockPracticeCounter != null) {
			setLivestockPracticeCounter(livestockPracticeCounter);
		}

		Long farmerApplicationId = (Long)attributes.get("farmerApplicationId");

		if (farmerApplicationId != null) {
			setFarmerApplicationId(farmerApplicationId);
		}
	}

	@Override
	public FarmerlivestockPractice cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this farmerlivestock practice.
	 *
	 * @return the company ID of this farmerlivestock practice
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this farmerlivestock practice.
	 *
	 * @return the create date of this farmerlivestock practice
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the farmer application ID of this farmerlivestock practice.
	 *
	 * @return the farmer application ID of this farmerlivestock practice
	 */
	@Override
	public long getFarmerApplicationId() {
		return model.getFarmerApplicationId();
	}

	/**
	 * Returns the farmer livestock practice ID of this farmerlivestock practice.
	 *
	 * @return the farmer livestock practice ID of this farmerlivestock practice
	 */
	@Override
	public long getFarmerLivestockPracticeId() {
		return model.getFarmerLivestockPracticeId();
	}

	/**
	 * Returns the group ID of this farmerlivestock practice.
	 *
	 * @return the group ID of this farmerlivestock practice
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the husbandry of this farmerlivestock practice.
	 *
	 * @return the husbandry of this farmerlivestock practice
	 */
	@Override
	public String getHusbandry() {
		return model.getHusbandry();
	}

	/**
	 * Returns the live stock care of this farmerlivestock practice.
	 *
	 * @return the live stock care of this farmerlivestock practice
	 */
	@Override
	public String getLiveStockCare() {
		return model.getLiveStockCare();
	}

	/**
	 * Returns the livestock practice counter of this farmerlivestock practice.
	 *
	 * @return the livestock practice counter of this farmerlivestock practice
	 */
	@Override
	public String getLivestockPracticeCounter() {
		return model.getLivestockPracticeCounter();
	}

	/**
	 * Returns the modified date of this farmerlivestock practice.
	 *
	 * @return the modified date of this farmerlivestock practice
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nutrient of this farmerlivestock practice.
	 *
	 * @return the nutrient of this farmerlivestock practice
	 */
	@Override
	public String getNutrient() {
		return model.getNutrient();
	}

	/**
	 * Returns the post harvest of this farmerlivestock practice.
	 *
	 * @return the post harvest of this farmerlivestock practice
	 */
	@Override
	public String getPostHarvest() {
		return model.getPostHarvest();
	}

	/**
	 * Returns the primary key of this farmerlivestock practice.
	 *
	 * @return the primary key of this farmerlivestock practice
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the remarks of this farmerlivestock practice.
	 *
	 * @return the remarks of this farmerlivestock practice
	 */
	@Override
	public String getRemarks() {
		return model.getRemarks();
	}

	/**
	 * Returns the user ID of this farmerlivestock practice.
	 *
	 * @return the user ID of this farmerlivestock practice
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this farmerlivestock practice.
	 *
	 * @return the user name of this farmerlivestock practice
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this farmerlivestock practice.
	 *
	 * @return the user uuid of this farmerlivestock practice
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the water of this farmerlivestock practice.
	 *
	 * @return the water of this farmerlivestock practice
	 */
	@Override
	public String getWater() {
		return model.getWater();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this farmerlivestock practice.
	 *
	 * @param companyId the company ID of this farmerlivestock practice
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this farmerlivestock practice.
	 *
	 * @param createDate the create date of this farmerlivestock practice
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the farmer application ID of this farmerlivestock practice.
	 *
	 * @param farmerApplicationId the farmer application ID of this farmerlivestock practice
	 */
	@Override
	public void setFarmerApplicationId(long farmerApplicationId) {
		model.setFarmerApplicationId(farmerApplicationId);
	}

	/**
	 * Sets the farmer livestock practice ID of this farmerlivestock practice.
	 *
	 * @param farmerLivestockPracticeId the farmer livestock practice ID of this farmerlivestock practice
	 */
	@Override
	public void setFarmerLivestockPracticeId(long farmerLivestockPracticeId) {
		model.setFarmerLivestockPracticeId(farmerLivestockPracticeId);
	}

	/**
	 * Sets the group ID of this farmerlivestock practice.
	 *
	 * @param groupId the group ID of this farmerlivestock practice
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the husbandry of this farmerlivestock practice.
	 *
	 * @param husbandry the husbandry of this farmerlivestock practice
	 */
	@Override
	public void setHusbandry(String husbandry) {
		model.setHusbandry(husbandry);
	}

	/**
	 * Sets the live stock care of this farmerlivestock practice.
	 *
	 * @param liveStockCare the live stock care of this farmerlivestock practice
	 */
	@Override
	public void setLiveStockCare(String liveStockCare) {
		model.setLiveStockCare(liveStockCare);
	}

	/**
	 * Sets the livestock practice counter of this farmerlivestock practice.
	 *
	 * @param livestockPracticeCounter the livestock practice counter of this farmerlivestock practice
	 */
	@Override
	public void setLivestockPracticeCounter(String livestockPracticeCounter) {
		model.setLivestockPracticeCounter(livestockPracticeCounter);
	}

	/**
	 * Sets the modified date of this farmerlivestock practice.
	 *
	 * @param modifiedDate the modified date of this farmerlivestock practice
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nutrient of this farmerlivestock practice.
	 *
	 * @param nutrient the nutrient of this farmerlivestock practice
	 */
	@Override
	public void setNutrient(String nutrient) {
		model.setNutrient(nutrient);
	}

	/**
	 * Sets the post harvest of this farmerlivestock practice.
	 *
	 * @param postHarvest the post harvest of this farmerlivestock practice
	 */
	@Override
	public void setPostHarvest(String postHarvest) {
		model.setPostHarvest(postHarvest);
	}

	/**
	 * Sets the primary key of this farmerlivestock practice.
	 *
	 * @param primaryKey the primary key of this farmerlivestock practice
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the remarks of this farmerlivestock practice.
	 *
	 * @param remarks the remarks of this farmerlivestock practice
	 */
	@Override
	public void setRemarks(String remarks) {
		model.setRemarks(remarks);
	}

	/**
	 * Sets the user ID of this farmerlivestock practice.
	 *
	 * @param userId the user ID of this farmerlivestock practice
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this farmerlivestock practice.
	 *
	 * @param userName the user name of this farmerlivestock practice
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this farmerlivestock practice.
	 *
	 * @param userUuid the user uuid of this farmerlivestock practice
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the water of this farmerlivestock practice.
	 *
	 * @param water the water of this farmerlivestock practice
	 */
	@Override
	public void setWater(String water) {
		model.setWater(water);
	}

	@Override
	protected FarmerlivestockPracticeWrapper wrap(
		FarmerlivestockPractice farmerlivestockPractice) {

		return new FarmerlivestockPracticeWrapper(farmerlivestockPractice);
	}

}