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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the FarmerCrop service. Represents a row in the &quot;farmer_crop&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.farm.application.form.service.model.impl.FarmerCropModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.farm.application.form.service.model.impl.FarmerCropImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerCrop
 * @generated
 */
@ProviderType
public interface FarmerCropModel
	extends BaseModel<FarmerCrop>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a farmer crop model instance should use the {@link FarmerCrop} interface instead.
	 */

	/**
	 * Returns the primary key of this farmer crop.
	 *
	 * @return the primary key of this farmer crop
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this farmer crop.
	 *
	 * @param primaryKey the primary key of this farmer crop
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the farmer crop ID of this farmer crop.
	 *
	 * @return the farmer crop ID of this farmer crop
	 */
	public long getFarmerCropId();

	/**
	 * Sets the farmer crop ID of this farmer crop.
	 *
	 * @param farmerCropId the farmer crop ID of this farmer crop
	 */
	public void setFarmerCropId(long farmerCropId);

	/**
	 * Returns the group ID of this farmer crop.
	 *
	 * @return the group ID of this farmer crop
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this farmer crop.
	 *
	 * @param groupId the group ID of this farmer crop
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this farmer crop.
	 *
	 * @return the company ID of this farmer crop
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this farmer crop.
	 *
	 * @param companyId the company ID of this farmer crop
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this farmer crop.
	 *
	 * @return the user ID of this farmer crop
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this farmer crop.
	 *
	 * @param userId the user ID of this farmer crop
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this farmer crop.
	 *
	 * @return the user uuid of this farmer crop
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this farmer crop.
	 *
	 * @param userUuid the user uuid of this farmer crop
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this farmer crop.
	 *
	 * @return the user name of this farmer crop
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this farmer crop.
	 *
	 * @param userName the user name of this farmer crop
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this farmer crop.
	 *
	 * @return the create date of this farmer crop
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this farmer crop.
	 *
	 * @param createDate the create date of this farmer crop
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this farmer crop.
	 *
	 * @return the modified date of this farmer crop
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this farmer crop.
	 *
	 * @param modifiedDate the modified date of this farmer crop
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the crop and variety of this farmer crop.
	 *
	 * @return the crop and variety of this farmer crop
	 */
	@AutoEscape
	public String getCropAndVariety();

	/**
	 * Sets the crop and variety of this farmer crop.
	 *
	 * @param cropAndVariety the crop and variety of this farmer crop
	 */
	public void setCropAndVariety(String cropAndVariety);

	/**
	 * Returns the area of this farmer crop.
	 *
	 * @return the area of this farmer crop
	 */
	@AutoEscape
	public String getArea();

	/**
	 * Sets the area of this farmer crop.
	 *
	 * @param area the area of this farmer crop
	 */
	public void setArea(String area);

	/**
	 * Returns the unit of this farmer crop.
	 *
	 * @return the unit of this farmer crop
	 */
	@AutoEscape
	public String getUnit();

	/**
	 * Sets the unit of this farmer crop.
	 *
	 * @param unit the unit of this farmer crop
	 */
	public void setUnit(String unit);

	/**
	 * Returns the crop content of this farmer crop.
	 *
	 * @return the crop content of this farmer crop
	 */
	@AutoEscape
	public String getCropContent();

	/**
	 * Sets the crop content of this farmer crop.
	 *
	 * @param cropContent the crop content of this farmer crop
	 */
	public void setCropContent(String cropContent);

	/**
	 * Returns the planting date of this farmer crop.
	 *
	 * @return the planting date of this farmer crop
	 */
	public Date getPlantingDate();

	/**
	 * Sets the planting date of this farmer crop.
	 *
	 * @param plantingDate the planting date of this farmer crop
	 */
	public void setPlantingDate(Date plantingDate);

	/**
	 * Returns the major market of this farmer crop.
	 *
	 * @return the major market of this farmer crop
	 */
	@AutoEscape
	public String getMajorMarket();

	/**
	 * Sets the major market of this farmer crop.
	 *
	 * @param majorMarket the major market of this farmer crop
	 */
	public void setMajorMarket(String majorMarket);

	/**
	 * Returns the major market percent sold of this farmer crop.
	 *
	 * @return the major market percent sold of this farmer crop
	 */
	@AutoEscape
	public String getMajorMarketPercentSold();

	/**
	 * Sets the major market percent sold of this farmer crop.
	 *
	 * @param majorMarketPercentSold the major market percent sold of this farmer crop
	 */
	public void setMajorMarketPercentSold(String majorMarketPercentSold);

	/**
	 * Returns the minor market of this farmer crop.
	 *
	 * @return the minor market of this farmer crop
	 */
	@AutoEscape
	public String getMinorMarket();

	/**
	 * Sets the minor market of this farmer crop.
	 *
	 * @param minorMarket the minor market of this farmer crop
	 */
	public void setMinorMarket(String minorMarket);

	/**
	 * Returns the minor market percent sold of this farmer crop.
	 *
	 * @return the minor market percent sold of this farmer crop
	 */
	@AutoEscape
	public String getMinorMarketPercentSold();

	/**
	 * Sets the minor market percent sold of this farmer crop.
	 *
	 * @param minorMarketPercentSold the minor market percent sold of this farmer crop
	 */
	public void setMinorMarketPercentSold(String minorMarketPercentSold);

	/**
	 * Returns the remarks of this farmer crop.
	 *
	 * @return the remarks of this farmer crop
	 */
	@AutoEscape
	public String getRemarks();

	/**
	 * Sets the remarks of this farmer crop.
	 *
	 * @param remarks the remarks of this farmer crop
	 */
	public void setRemarks(String remarks);

	/**
	 * Returns the property id02 of this farmer crop.
	 *
	 * @return the property id02 of this farmer crop
	 */
	@AutoEscape
	public String getPropertyId02();

	/**
	 * Sets the property id02 of this farmer crop.
	 *
	 * @param propertyId02 the property id02 of this farmer crop
	 */
	public void setPropertyId02(String propertyId02);

	/**
	 * Returns the property id03 of this farmer crop.
	 *
	 * @return the property id03 of this farmer crop
	 */
	@AutoEscape
	public String getPropertyId03();

	/**
	 * Sets the property id03 of this farmer crop.
	 *
	 * @param propertyId03 the property id03 of this farmer crop
	 */
	public void setPropertyId03(String propertyId03);

	/**
	 * Returns the crop counter of this farmer crop.
	 *
	 * @return the crop counter of this farmer crop
	 */
	@AutoEscape
	public String getCropCounter();

	/**
	 * Sets the crop counter of this farmer crop.
	 *
	 * @param cropCounter the crop counter of this farmer crop
	 */
	public void setCropCounter(String cropCounter);

	/**
	 * Returns the farmer application ID of this farmer crop.
	 *
	 * @return the farmer application ID of this farmer crop
	 */
	public long getFarmerApplicationId();

	/**
	 * Sets the farmer application ID of this farmer crop.
	 *
	 * @param farmerApplicationId the farmer application ID of this farmer crop
	 */
	public void setFarmerApplicationId(long farmerApplicationId);

	@Override
	public FarmerCrop cloneWithOriginalValues();

}