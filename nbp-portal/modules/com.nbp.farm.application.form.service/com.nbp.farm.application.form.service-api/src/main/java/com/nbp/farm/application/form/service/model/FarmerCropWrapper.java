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
 * This class is a wrapper for {@link FarmerCrop}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerCrop
 * @generated
 */
public class FarmerCropWrapper
	extends BaseModelWrapper<FarmerCrop>
	implements FarmerCrop, ModelWrapper<FarmerCrop> {

	public FarmerCropWrapper(FarmerCrop farmerCrop) {
		super(farmerCrop);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("farmerCropId", getFarmerCropId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("cropAndVariety", getCropAndVariety());
		attributes.put("area", getArea());
		attributes.put("unit", getUnit());
		attributes.put("cropContent", getCropContent());
		attributes.put("plantingDate", getPlantingDate());
		attributes.put("majorMarket", getMajorMarket());
		attributes.put("majorMarketPercentSold", getMajorMarketPercentSold());
		attributes.put("minorMarket", getMinorMarket());
		attributes.put("minorMarketPercentSold", getMinorMarketPercentSold());
		attributes.put("remarks", getRemarks());
		attributes.put("propertyId02", getPropertyId02());
		attributes.put("propertyId03", getPropertyId03());
		attributes.put("cropCounter", getCropCounter());
		attributes.put("farmerApplicationId", getFarmerApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long farmerCropId = (Long)attributes.get("farmerCropId");

		if (farmerCropId != null) {
			setFarmerCropId(farmerCropId);
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

		String cropAndVariety = (String)attributes.get("cropAndVariety");

		if (cropAndVariety != null) {
			setCropAndVariety(cropAndVariety);
		}

		String area = (String)attributes.get("area");

		if (area != null) {
			setArea(area);
		}

		String unit = (String)attributes.get("unit");

		if (unit != null) {
			setUnit(unit);
		}

		String cropContent = (String)attributes.get("cropContent");

		if (cropContent != null) {
			setCropContent(cropContent);
		}

		Date plantingDate = (Date)attributes.get("plantingDate");

		if (plantingDate != null) {
			setPlantingDate(plantingDate);
		}

		String majorMarket = (String)attributes.get("majorMarket");

		if (majorMarket != null) {
			setMajorMarket(majorMarket);
		}

		String majorMarketPercentSold = (String)attributes.get(
			"majorMarketPercentSold");

		if (majorMarketPercentSold != null) {
			setMajorMarketPercentSold(majorMarketPercentSold);
		}

		String minorMarket = (String)attributes.get("minorMarket");

		if (minorMarket != null) {
			setMinorMarket(minorMarket);
		}

		String minorMarketPercentSold = (String)attributes.get(
			"minorMarketPercentSold");

		if (minorMarketPercentSold != null) {
			setMinorMarketPercentSold(minorMarketPercentSold);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		String propertyId02 = (String)attributes.get("propertyId02");

		if (propertyId02 != null) {
			setPropertyId02(propertyId02);
		}

		String propertyId03 = (String)attributes.get("propertyId03");

		if (propertyId03 != null) {
			setPropertyId03(propertyId03);
		}

		String cropCounter = (String)attributes.get("cropCounter");

		if (cropCounter != null) {
			setCropCounter(cropCounter);
		}

		Long farmerApplicationId = (Long)attributes.get("farmerApplicationId");

		if (farmerApplicationId != null) {
			setFarmerApplicationId(farmerApplicationId);
		}
	}

	@Override
	public FarmerCrop cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the area of this farmer crop.
	 *
	 * @return the area of this farmer crop
	 */
	@Override
	public String getArea() {
		return model.getArea();
	}

	/**
	 * Returns the company ID of this farmer crop.
	 *
	 * @return the company ID of this farmer crop
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this farmer crop.
	 *
	 * @return the create date of this farmer crop
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the crop and variety of this farmer crop.
	 *
	 * @return the crop and variety of this farmer crop
	 */
	@Override
	public String getCropAndVariety() {
		return model.getCropAndVariety();
	}

	/**
	 * Returns the crop content of this farmer crop.
	 *
	 * @return the crop content of this farmer crop
	 */
	@Override
	public String getCropContent() {
		return model.getCropContent();
	}

	/**
	 * Returns the crop counter of this farmer crop.
	 *
	 * @return the crop counter of this farmer crop
	 */
	@Override
	public String getCropCounter() {
		return model.getCropCounter();
	}

	/**
	 * Returns the farmer application ID of this farmer crop.
	 *
	 * @return the farmer application ID of this farmer crop
	 */
	@Override
	public long getFarmerApplicationId() {
		return model.getFarmerApplicationId();
	}

	/**
	 * Returns the farmer crop ID of this farmer crop.
	 *
	 * @return the farmer crop ID of this farmer crop
	 */
	@Override
	public long getFarmerCropId() {
		return model.getFarmerCropId();
	}

	/**
	 * Returns the group ID of this farmer crop.
	 *
	 * @return the group ID of this farmer crop
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the major market of this farmer crop.
	 *
	 * @return the major market of this farmer crop
	 */
	@Override
	public String getMajorMarket() {
		return model.getMajorMarket();
	}

	/**
	 * Returns the major market percent sold of this farmer crop.
	 *
	 * @return the major market percent sold of this farmer crop
	 */
	@Override
	public String getMajorMarketPercentSold() {
		return model.getMajorMarketPercentSold();
	}

	/**
	 * Returns the minor market of this farmer crop.
	 *
	 * @return the minor market of this farmer crop
	 */
	@Override
	public String getMinorMarket() {
		return model.getMinorMarket();
	}

	/**
	 * Returns the minor market percent sold of this farmer crop.
	 *
	 * @return the minor market percent sold of this farmer crop
	 */
	@Override
	public String getMinorMarketPercentSold() {
		return model.getMinorMarketPercentSold();
	}

	/**
	 * Returns the modified date of this farmer crop.
	 *
	 * @return the modified date of this farmer crop
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the planting date of this farmer crop.
	 *
	 * @return the planting date of this farmer crop
	 */
	@Override
	public Date getPlantingDate() {
		return model.getPlantingDate();
	}

	/**
	 * Returns the primary key of this farmer crop.
	 *
	 * @return the primary key of this farmer crop
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the property id02 of this farmer crop.
	 *
	 * @return the property id02 of this farmer crop
	 */
	@Override
	public String getPropertyId02() {
		return model.getPropertyId02();
	}

	/**
	 * Returns the property id03 of this farmer crop.
	 *
	 * @return the property id03 of this farmer crop
	 */
	@Override
	public String getPropertyId03() {
		return model.getPropertyId03();
	}

	/**
	 * Returns the remarks of this farmer crop.
	 *
	 * @return the remarks of this farmer crop
	 */
	@Override
	public String getRemarks() {
		return model.getRemarks();
	}

	/**
	 * Returns the unit of this farmer crop.
	 *
	 * @return the unit of this farmer crop
	 */
	@Override
	public String getUnit() {
		return model.getUnit();
	}

	/**
	 * Returns the user ID of this farmer crop.
	 *
	 * @return the user ID of this farmer crop
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this farmer crop.
	 *
	 * @return the user name of this farmer crop
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this farmer crop.
	 *
	 * @return the user uuid of this farmer crop
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
	 * Sets the area of this farmer crop.
	 *
	 * @param area the area of this farmer crop
	 */
	@Override
	public void setArea(String area) {
		model.setArea(area);
	}

	/**
	 * Sets the company ID of this farmer crop.
	 *
	 * @param companyId the company ID of this farmer crop
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this farmer crop.
	 *
	 * @param createDate the create date of this farmer crop
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the crop and variety of this farmer crop.
	 *
	 * @param cropAndVariety the crop and variety of this farmer crop
	 */
	@Override
	public void setCropAndVariety(String cropAndVariety) {
		model.setCropAndVariety(cropAndVariety);
	}

	/**
	 * Sets the crop content of this farmer crop.
	 *
	 * @param cropContent the crop content of this farmer crop
	 */
	@Override
	public void setCropContent(String cropContent) {
		model.setCropContent(cropContent);
	}

	/**
	 * Sets the crop counter of this farmer crop.
	 *
	 * @param cropCounter the crop counter of this farmer crop
	 */
	@Override
	public void setCropCounter(String cropCounter) {
		model.setCropCounter(cropCounter);
	}

	/**
	 * Sets the farmer application ID of this farmer crop.
	 *
	 * @param farmerApplicationId the farmer application ID of this farmer crop
	 */
	@Override
	public void setFarmerApplicationId(long farmerApplicationId) {
		model.setFarmerApplicationId(farmerApplicationId);
	}

	/**
	 * Sets the farmer crop ID of this farmer crop.
	 *
	 * @param farmerCropId the farmer crop ID of this farmer crop
	 */
	@Override
	public void setFarmerCropId(long farmerCropId) {
		model.setFarmerCropId(farmerCropId);
	}

	/**
	 * Sets the group ID of this farmer crop.
	 *
	 * @param groupId the group ID of this farmer crop
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the major market of this farmer crop.
	 *
	 * @param majorMarket the major market of this farmer crop
	 */
	@Override
	public void setMajorMarket(String majorMarket) {
		model.setMajorMarket(majorMarket);
	}

	/**
	 * Sets the major market percent sold of this farmer crop.
	 *
	 * @param majorMarketPercentSold the major market percent sold of this farmer crop
	 */
	@Override
	public void setMajorMarketPercentSold(String majorMarketPercentSold) {
		model.setMajorMarketPercentSold(majorMarketPercentSold);
	}

	/**
	 * Sets the minor market of this farmer crop.
	 *
	 * @param minorMarket the minor market of this farmer crop
	 */
	@Override
	public void setMinorMarket(String minorMarket) {
		model.setMinorMarket(minorMarket);
	}

	/**
	 * Sets the minor market percent sold of this farmer crop.
	 *
	 * @param minorMarketPercentSold the minor market percent sold of this farmer crop
	 */
	@Override
	public void setMinorMarketPercentSold(String minorMarketPercentSold) {
		model.setMinorMarketPercentSold(minorMarketPercentSold);
	}

	/**
	 * Sets the modified date of this farmer crop.
	 *
	 * @param modifiedDate the modified date of this farmer crop
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the planting date of this farmer crop.
	 *
	 * @param plantingDate the planting date of this farmer crop
	 */
	@Override
	public void setPlantingDate(Date plantingDate) {
		model.setPlantingDate(plantingDate);
	}

	/**
	 * Sets the primary key of this farmer crop.
	 *
	 * @param primaryKey the primary key of this farmer crop
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the property id02 of this farmer crop.
	 *
	 * @param propertyId02 the property id02 of this farmer crop
	 */
	@Override
	public void setPropertyId02(String propertyId02) {
		model.setPropertyId02(propertyId02);
	}

	/**
	 * Sets the property id03 of this farmer crop.
	 *
	 * @param propertyId03 the property id03 of this farmer crop
	 */
	@Override
	public void setPropertyId03(String propertyId03) {
		model.setPropertyId03(propertyId03);
	}

	/**
	 * Sets the remarks of this farmer crop.
	 *
	 * @param remarks the remarks of this farmer crop
	 */
	@Override
	public void setRemarks(String remarks) {
		model.setRemarks(remarks);
	}

	/**
	 * Sets the unit of this farmer crop.
	 *
	 * @param unit the unit of this farmer crop
	 */
	@Override
	public void setUnit(String unit) {
		model.setUnit(unit);
	}

	/**
	 * Sets the user ID of this farmer crop.
	 *
	 * @param userId the user ID of this farmer crop
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this farmer crop.
	 *
	 * @param userName the user name of this farmer crop
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this farmer crop.
	 *
	 * @param userUuid the user uuid of this farmer crop
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected FarmerCropWrapper wrap(FarmerCrop farmerCrop) {
		return new FarmerCropWrapper(farmerCrop);
	}

}