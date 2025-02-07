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
 * This class is a wrapper for {@link FarmerLivestock}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerLivestock
 * @generated
 */
public class FarmerLivestockWrapper
	extends BaseModelWrapper<FarmerLivestock>
	implements FarmerLivestock, ModelWrapper<FarmerLivestock> {

	public FarmerLivestockWrapper(FarmerLivestock farmerLivestock) {
		super(farmerLivestock);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("farmerLiveStockId", getFarmerLiveStockId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("livestockBreed", getLivestockBreed());
		attributes.put("stageOflife", getStageOflife());
		attributes.put("count", getCount());
		attributes.put("colonies", getColonies());
		attributes.put("capacity", getCapacity());
		attributes.put("majorMarket", getMajorMarket());
		attributes.put("majorMarketSold", getMajorMarketSold());
		attributes.put("minorMarket", getMinorMarket());
		attributes.put("minorMarketSold", getMinorMarketSold());
		attributes.put("remarks", getRemarks());
		attributes.put("livestockCounter", getLivestockCounter());
		attributes.put("farmerApplicationId", getFarmerApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long farmerLiveStockId = (Long)attributes.get("farmerLiveStockId");

		if (farmerLiveStockId != null) {
			setFarmerLiveStockId(farmerLiveStockId);
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

		String livestockBreed = (String)attributes.get("livestockBreed");

		if (livestockBreed != null) {
			setLivestockBreed(livestockBreed);
		}

		String stageOflife = (String)attributes.get("stageOflife");

		if (stageOflife != null) {
			setStageOflife(stageOflife);
		}

		String count = (String)attributes.get("count");

		if (count != null) {
			setCount(count);
		}

		String colonies = (String)attributes.get("colonies");

		if (colonies != null) {
			setColonies(colonies);
		}

		String capacity = (String)attributes.get("capacity");

		if (capacity != null) {
			setCapacity(capacity);
		}

		String majorMarket = (String)attributes.get("majorMarket");

		if (majorMarket != null) {
			setMajorMarket(majorMarket);
		}

		String majorMarketSold = (String)attributes.get("majorMarketSold");

		if (majorMarketSold != null) {
			setMajorMarketSold(majorMarketSold);
		}

		String minorMarket = (String)attributes.get("minorMarket");

		if (minorMarket != null) {
			setMinorMarket(minorMarket);
		}

		String minorMarketSold = (String)attributes.get("minorMarketSold");

		if (minorMarketSold != null) {
			setMinorMarketSold(minorMarketSold);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		String livestockCounter = (String)attributes.get("livestockCounter");

		if (livestockCounter != null) {
			setLivestockCounter(livestockCounter);
		}

		Long farmerApplicationId = (Long)attributes.get("farmerApplicationId");

		if (farmerApplicationId != null) {
			setFarmerApplicationId(farmerApplicationId);
		}
	}

	@Override
	public FarmerLivestock cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the capacity of this farmer livestock.
	 *
	 * @return the capacity of this farmer livestock
	 */
	@Override
	public String getCapacity() {
		return model.getCapacity();
	}

	/**
	 * Returns the colonies of this farmer livestock.
	 *
	 * @return the colonies of this farmer livestock
	 */
	@Override
	public String getColonies() {
		return model.getColonies();
	}

	/**
	 * Returns the company ID of this farmer livestock.
	 *
	 * @return the company ID of this farmer livestock
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the count of this farmer livestock.
	 *
	 * @return the count of this farmer livestock
	 */
	@Override
	public String getCount() {
		return model.getCount();
	}

	/**
	 * Returns the create date of this farmer livestock.
	 *
	 * @return the create date of this farmer livestock
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the farmer application ID of this farmer livestock.
	 *
	 * @return the farmer application ID of this farmer livestock
	 */
	@Override
	public long getFarmerApplicationId() {
		return model.getFarmerApplicationId();
	}

	/**
	 * Returns the farmer live stock ID of this farmer livestock.
	 *
	 * @return the farmer live stock ID of this farmer livestock
	 */
	@Override
	public long getFarmerLiveStockId() {
		return model.getFarmerLiveStockId();
	}

	/**
	 * Returns the group ID of this farmer livestock.
	 *
	 * @return the group ID of this farmer livestock
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the livestock breed of this farmer livestock.
	 *
	 * @return the livestock breed of this farmer livestock
	 */
	@Override
	public String getLivestockBreed() {
		return model.getLivestockBreed();
	}

	/**
	 * Returns the livestock counter of this farmer livestock.
	 *
	 * @return the livestock counter of this farmer livestock
	 */
	@Override
	public String getLivestockCounter() {
		return model.getLivestockCounter();
	}

	/**
	 * Returns the major market of this farmer livestock.
	 *
	 * @return the major market of this farmer livestock
	 */
	@Override
	public String getMajorMarket() {
		return model.getMajorMarket();
	}

	/**
	 * Returns the major market sold of this farmer livestock.
	 *
	 * @return the major market sold of this farmer livestock
	 */
	@Override
	public String getMajorMarketSold() {
		return model.getMajorMarketSold();
	}

	/**
	 * Returns the minor market of this farmer livestock.
	 *
	 * @return the minor market of this farmer livestock
	 */
	@Override
	public String getMinorMarket() {
		return model.getMinorMarket();
	}

	/**
	 * Returns the minor market sold of this farmer livestock.
	 *
	 * @return the minor market sold of this farmer livestock
	 */
	@Override
	public String getMinorMarketSold() {
		return model.getMinorMarketSold();
	}

	/**
	 * Returns the modified date of this farmer livestock.
	 *
	 * @return the modified date of this farmer livestock
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this farmer livestock.
	 *
	 * @return the primary key of this farmer livestock
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the remarks of this farmer livestock.
	 *
	 * @return the remarks of this farmer livestock
	 */
	@Override
	public String getRemarks() {
		return model.getRemarks();
	}

	/**
	 * Returns the stage oflife of this farmer livestock.
	 *
	 * @return the stage oflife of this farmer livestock
	 */
	@Override
	public String getStageOflife() {
		return model.getStageOflife();
	}

	/**
	 * Returns the user ID of this farmer livestock.
	 *
	 * @return the user ID of this farmer livestock
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this farmer livestock.
	 *
	 * @return the user name of this farmer livestock
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this farmer livestock.
	 *
	 * @return the user uuid of this farmer livestock
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
	 * Sets the capacity of this farmer livestock.
	 *
	 * @param capacity the capacity of this farmer livestock
	 */
	@Override
	public void setCapacity(String capacity) {
		model.setCapacity(capacity);
	}

	/**
	 * Sets the colonies of this farmer livestock.
	 *
	 * @param colonies the colonies of this farmer livestock
	 */
	@Override
	public void setColonies(String colonies) {
		model.setColonies(colonies);
	}

	/**
	 * Sets the company ID of this farmer livestock.
	 *
	 * @param companyId the company ID of this farmer livestock
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the count of this farmer livestock.
	 *
	 * @param count the count of this farmer livestock
	 */
	@Override
	public void setCount(String count) {
		model.setCount(count);
	}

	/**
	 * Sets the create date of this farmer livestock.
	 *
	 * @param createDate the create date of this farmer livestock
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the farmer application ID of this farmer livestock.
	 *
	 * @param farmerApplicationId the farmer application ID of this farmer livestock
	 */
	@Override
	public void setFarmerApplicationId(long farmerApplicationId) {
		model.setFarmerApplicationId(farmerApplicationId);
	}

	/**
	 * Sets the farmer live stock ID of this farmer livestock.
	 *
	 * @param farmerLiveStockId the farmer live stock ID of this farmer livestock
	 */
	@Override
	public void setFarmerLiveStockId(long farmerLiveStockId) {
		model.setFarmerLiveStockId(farmerLiveStockId);
	}

	/**
	 * Sets the group ID of this farmer livestock.
	 *
	 * @param groupId the group ID of this farmer livestock
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the livestock breed of this farmer livestock.
	 *
	 * @param livestockBreed the livestock breed of this farmer livestock
	 */
	@Override
	public void setLivestockBreed(String livestockBreed) {
		model.setLivestockBreed(livestockBreed);
	}

	/**
	 * Sets the livestock counter of this farmer livestock.
	 *
	 * @param livestockCounter the livestock counter of this farmer livestock
	 */
	@Override
	public void setLivestockCounter(String livestockCounter) {
		model.setLivestockCounter(livestockCounter);
	}

	/**
	 * Sets the major market of this farmer livestock.
	 *
	 * @param majorMarket the major market of this farmer livestock
	 */
	@Override
	public void setMajorMarket(String majorMarket) {
		model.setMajorMarket(majorMarket);
	}

	/**
	 * Sets the major market sold of this farmer livestock.
	 *
	 * @param majorMarketSold the major market sold of this farmer livestock
	 */
	@Override
	public void setMajorMarketSold(String majorMarketSold) {
		model.setMajorMarketSold(majorMarketSold);
	}

	/**
	 * Sets the minor market of this farmer livestock.
	 *
	 * @param minorMarket the minor market of this farmer livestock
	 */
	@Override
	public void setMinorMarket(String minorMarket) {
		model.setMinorMarket(minorMarket);
	}

	/**
	 * Sets the minor market sold of this farmer livestock.
	 *
	 * @param minorMarketSold the minor market sold of this farmer livestock
	 */
	@Override
	public void setMinorMarketSold(String minorMarketSold) {
		model.setMinorMarketSold(minorMarketSold);
	}

	/**
	 * Sets the modified date of this farmer livestock.
	 *
	 * @param modifiedDate the modified date of this farmer livestock
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this farmer livestock.
	 *
	 * @param primaryKey the primary key of this farmer livestock
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the remarks of this farmer livestock.
	 *
	 * @param remarks the remarks of this farmer livestock
	 */
	@Override
	public void setRemarks(String remarks) {
		model.setRemarks(remarks);
	}

	/**
	 * Sets the stage oflife of this farmer livestock.
	 *
	 * @param stageOflife the stage oflife of this farmer livestock
	 */
	@Override
	public void setStageOflife(String stageOflife) {
		model.setStageOflife(stageOflife);
	}

	/**
	 * Sets the user ID of this farmer livestock.
	 *
	 * @param userId the user ID of this farmer livestock
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this farmer livestock.
	 *
	 * @param userName the user name of this farmer livestock
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this farmer livestock.
	 *
	 * @param userUuid the user uuid of this farmer livestock
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected FarmerLivestockWrapper wrap(FarmerLivestock farmerLivestock) {
		return new FarmerLivestockWrapper(farmerLivestock);
	}

}