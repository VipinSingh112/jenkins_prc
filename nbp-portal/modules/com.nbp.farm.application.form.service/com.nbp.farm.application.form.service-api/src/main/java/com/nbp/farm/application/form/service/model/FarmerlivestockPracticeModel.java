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
 * The base model interface for the FarmerlivestockPractice service. Represents a row in the &quot;farmer_livestock_practice&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.farm.application.form.service.model.impl.FarmerlivestockPracticeModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.farm.application.form.service.model.impl.FarmerlivestockPracticeImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerlivestockPractice
 * @generated
 */
@ProviderType
public interface FarmerlivestockPracticeModel
	extends BaseModel<FarmerlivestockPractice>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a farmerlivestock practice model instance should use the {@link FarmerlivestockPractice} interface instead.
	 */

	/**
	 * Returns the primary key of this farmerlivestock practice.
	 *
	 * @return the primary key of this farmerlivestock practice
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this farmerlivestock practice.
	 *
	 * @param primaryKey the primary key of this farmerlivestock practice
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the farmer livestock practice ID of this farmerlivestock practice.
	 *
	 * @return the farmer livestock practice ID of this farmerlivestock practice
	 */
	public long getFarmerLivestockPracticeId();

	/**
	 * Sets the farmer livestock practice ID of this farmerlivestock practice.
	 *
	 * @param farmerLivestockPracticeId the farmer livestock practice ID of this farmerlivestock practice
	 */
	public void setFarmerLivestockPracticeId(long farmerLivestockPracticeId);

	/**
	 * Returns the group ID of this farmerlivestock practice.
	 *
	 * @return the group ID of this farmerlivestock practice
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this farmerlivestock practice.
	 *
	 * @param groupId the group ID of this farmerlivestock practice
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this farmerlivestock practice.
	 *
	 * @return the company ID of this farmerlivestock practice
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this farmerlivestock practice.
	 *
	 * @param companyId the company ID of this farmerlivestock practice
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this farmerlivestock practice.
	 *
	 * @return the user ID of this farmerlivestock practice
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this farmerlivestock practice.
	 *
	 * @param userId the user ID of this farmerlivestock practice
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this farmerlivestock practice.
	 *
	 * @return the user uuid of this farmerlivestock practice
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this farmerlivestock practice.
	 *
	 * @param userUuid the user uuid of this farmerlivestock practice
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this farmerlivestock practice.
	 *
	 * @return the user name of this farmerlivestock practice
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this farmerlivestock practice.
	 *
	 * @param userName the user name of this farmerlivestock practice
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this farmerlivestock practice.
	 *
	 * @return the create date of this farmerlivestock practice
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this farmerlivestock practice.
	 *
	 * @param createDate the create date of this farmerlivestock practice
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this farmerlivestock practice.
	 *
	 * @return the modified date of this farmerlivestock practice
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this farmerlivestock practice.
	 *
	 * @param modifiedDate the modified date of this farmerlivestock practice
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the husbandry of this farmerlivestock practice.
	 *
	 * @return the husbandry of this farmerlivestock practice
	 */
	@AutoEscape
	public String getHusbandry();

	/**
	 * Sets the husbandry of this farmerlivestock practice.
	 *
	 * @param husbandry the husbandry of this farmerlivestock practice
	 */
	public void setHusbandry(String husbandry);

	/**
	 * Returns the live stock care of this farmerlivestock practice.
	 *
	 * @return the live stock care of this farmerlivestock practice
	 */
	@AutoEscape
	public String getLiveStockCare();

	/**
	 * Sets the live stock care of this farmerlivestock practice.
	 *
	 * @param liveStockCare the live stock care of this farmerlivestock practice
	 */
	public void setLiveStockCare(String liveStockCare);

	/**
	 * Returns the nutrient of this farmerlivestock practice.
	 *
	 * @return the nutrient of this farmerlivestock practice
	 */
	@AutoEscape
	public String getNutrient();

	/**
	 * Sets the nutrient of this farmerlivestock practice.
	 *
	 * @param nutrient the nutrient of this farmerlivestock practice
	 */
	public void setNutrient(String nutrient);

	/**
	 * Returns the water of this farmerlivestock practice.
	 *
	 * @return the water of this farmerlivestock practice
	 */
	@AutoEscape
	public String getWater();

	/**
	 * Sets the water of this farmerlivestock practice.
	 *
	 * @param water the water of this farmerlivestock practice
	 */
	public void setWater(String water);

	/**
	 * Returns the post harvest of this farmerlivestock practice.
	 *
	 * @return the post harvest of this farmerlivestock practice
	 */
	@AutoEscape
	public String getPostHarvest();

	/**
	 * Sets the post harvest of this farmerlivestock practice.
	 *
	 * @param postHarvest the post harvest of this farmerlivestock practice
	 */
	public void setPostHarvest(String postHarvest);

	/**
	 * Returns the remarks of this farmerlivestock practice.
	 *
	 * @return the remarks of this farmerlivestock practice
	 */
	@AutoEscape
	public String getRemarks();

	/**
	 * Sets the remarks of this farmerlivestock practice.
	 *
	 * @param remarks the remarks of this farmerlivestock practice
	 */
	public void setRemarks(String remarks);

	/**
	 * Returns the livestock practice counter of this farmerlivestock practice.
	 *
	 * @return the livestock practice counter of this farmerlivestock practice
	 */
	@AutoEscape
	public String getLivestockPracticeCounter();

	/**
	 * Sets the livestock practice counter of this farmerlivestock practice.
	 *
	 * @param livestockPracticeCounter the livestock practice counter of this farmerlivestock practice
	 */
	public void setLivestockPracticeCounter(String livestockPracticeCounter);

	/**
	 * Returns the farmer application ID of this farmerlivestock practice.
	 *
	 * @return the farmer application ID of this farmerlivestock practice
	 */
	public long getFarmerApplicationId();

	/**
	 * Sets the farmer application ID of this farmerlivestock practice.
	 *
	 * @param farmerApplicationId the farmer application ID of this farmerlivestock practice
	 */
	public void setFarmerApplicationId(long farmerApplicationId);

	@Override
	public FarmerlivestockPractice cloneWithOriginalValues();

}