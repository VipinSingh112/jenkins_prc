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
 * The base model interface for the FarmerCropPractice service. Represents a row in the &quot;farmer_crop_practice&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.farm.application.form.service.model.impl.FarmerCropPracticeModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.farm.application.form.service.model.impl.FarmerCropPracticeImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerCropPractice
 * @generated
 */
@ProviderType
public interface FarmerCropPracticeModel
	extends BaseModel<FarmerCropPractice>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a farmer crop practice model instance should use the {@link FarmerCropPractice} interface instead.
	 */

	/**
	 * Returns the primary key of this farmer crop practice.
	 *
	 * @return the primary key of this farmer crop practice
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this farmer crop practice.
	 *
	 * @param primaryKey the primary key of this farmer crop practice
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the farmer crop practice ID of this farmer crop practice.
	 *
	 * @return the farmer crop practice ID of this farmer crop practice
	 */
	public long getFarmerCropPracticeId();

	/**
	 * Sets the farmer crop practice ID of this farmer crop practice.
	 *
	 * @param farmerCropPracticeId the farmer crop practice ID of this farmer crop practice
	 */
	public void setFarmerCropPracticeId(long farmerCropPracticeId);

	/**
	 * Returns the group ID of this farmer crop practice.
	 *
	 * @return the group ID of this farmer crop practice
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this farmer crop practice.
	 *
	 * @param groupId the group ID of this farmer crop practice
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this farmer crop practice.
	 *
	 * @return the company ID of this farmer crop practice
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this farmer crop practice.
	 *
	 * @param companyId the company ID of this farmer crop practice
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this farmer crop practice.
	 *
	 * @return the user ID of this farmer crop practice
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this farmer crop practice.
	 *
	 * @param userId the user ID of this farmer crop practice
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this farmer crop practice.
	 *
	 * @return the user uuid of this farmer crop practice
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this farmer crop practice.
	 *
	 * @param userUuid the user uuid of this farmer crop practice
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this farmer crop practice.
	 *
	 * @return the user name of this farmer crop practice
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this farmer crop practice.
	 *
	 * @param userName the user name of this farmer crop practice
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this farmer crop practice.
	 *
	 * @return the create date of this farmer crop practice
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this farmer crop practice.
	 *
	 * @param createDate the create date of this farmer crop practice
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this farmer crop practice.
	 *
	 * @return the modified date of this farmer crop practice
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this farmer crop practice.
	 *
	 * @param modifiedDate the modified date of this farmer crop practice
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the crop1land prepration of this farmer crop practice.
	 *
	 * @return the crop1land prepration of this farmer crop practice
	 */
	@AutoEscape
	public String getCrop1landPrepration();

	/**
	 * Sets the crop1land prepration of this farmer crop practice.
	 *
	 * @param crop1landPrepration the crop1land prepration of this farmer crop practice
	 */
	public void setCrop1landPrepration(String crop1landPrepration);

	/**
	 * Returns the crop1 crop care of this farmer crop practice.
	 *
	 * @return the crop1 crop care of this farmer crop practice
	 */
	@AutoEscape
	public String getCrop1CropCare();

	/**
	 * Sets the crop1 crop care of this farmer crop practice.
	 *
	 * @param crop1CropCare the crop1 crop care of this farmer crop practice
	 */
	public void setCrop1CropCare(String crop1CropCare);

	/**
	 * Returns the crop1water of this farmer crop practice.
	 *
	 * @return the crop1water of this farmer crop practice
	 */
	@AutoEscape
	public String getCrop1water();

	/**
	 * Sets the crop1water of this farmer crop practice.
	 *
	 * @param crop1water the crop1water of this farmer crop practice
	 */
	public void setCrop1water(String crop1water);

	/**
	 * Returns the crop1post harvest of this farmer crop practice.
	 *
	 * @return the crop1post harvest of this farmer crop practice
	 */
	@AutoEscape
	public String getCrop1postHarvest();

	/**
	 * Sets the crop1post harvest of this farmer crop practice.
	 *
	 * @param crop1postHarvest the crop1post harvest of this farmer crop practice
	 */
	public void setCrop1postHarvest(String crop1postHarvest);

	/**
	 * Returns the crop02 of this farmer crop practice.
	 *
	 * @return the crop02 of this farmer crop practice
	 */
	@AutoEscape
	public String getCrop02();

	/**
	 * Sets the crop02 of this farmer crop practice.
	 *
	 * @param crop02 the crop02 of this farmer crop practice
	 */
	public void setCrop02(String crop02);

	/**
	 * Returns the crop03 of this farmer crop practice.
	 *
	 * @return the crop03 of this farmer crop practice
	 */
	@AutoEscape
	public String getCrop03();

	/**
	 * Sets the crop03 of this farmer crop practice.
	 *
	 * @param crop03 the crop03 of this farmer crop practice
	 */
	public void setCrop03(String crop03);

	/**
	 * Returns the crop practice counter of this farmer crop practice.
	 *
	 * @return the crop practice counter of this farmer crop practice
	 */
	@AutoEscape
	public String getCropPracticeCounter();

	/**
	 * Sets the crop practice counter of this farmer crop practice.
	 *
	 * @param cropPracticeCounter the crop practice counter of this farmer crop practice
	 */
	public void setCropPracticeCounter(String cropPracticeCounter);

	/**
	 * Returns the farmer application ID of this farmer crop practice.
	 *
	 * @return the farmer application ID of this farmer crop practice
	 */
	public long getFarmerApplicationId();

	/**
	 * Sets the farmer application ID of this farmer crop practice.
	 *
	 * @param farmerApplicationId the farmer application ID of this farmer crop practice
	 */
	public void setFarmerApplicationId(long farmerApplicationId);

	@Override
	public FarmerCropPractice cloneWithOriginalValues();

}