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

package com.npm.cannabis.application.stages.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the CannabisConditionalLicensePreCondtions service. Represents a row in the &quot;nbp_cannabis_pre_conditions&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.npm.cannabis.application.stages.services.model.impl.CannabisConditionalLicensePreCondtionsModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.npm.cannabis.application.stages.services.model.impl.CannabisConditionalLicensePreCondtionsImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConditionalLicensePreCondtions
 * @generated
 */
@ProviderType
public interface CannabisConditionalLicensePreCondtionsModel
	extends BaseModel<CannabisConditionalLicensePreCondtions>, GroupedModel,
			ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a cannabis conditional license pre condtions model instance should use the {@link CannabisConditionalLicensePreCondtions} interface instead.
	 */

	/**
	 * Returns the primary key of this cannabis conditional license pre condtions.
	 *
	 * @return the primary key of this cannabis conditional license pre condtions
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this cannabis conditional license pre condtions.
	 *
	 * @param primaryKey the primary key of this cannabis conditional license pre condtions
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the cannabis preconditions ID of this cannabis conditional license pre condtions.
	 *
	 * @return the cannabis preconditions ID of this cannabis conditional license pre condtions
	 */
	public long getCannabisPreconditionsId();

	/**
	 * Sets the cannabis preconditions ID of this cannabis conditional license pre condtions.
	 *
	 * @param cannabisPreconditionsId the cannabis preconditions ID of this cannabis conditional license pre condtions
	 */
	public void setCannabisPreconditionsId(long cannabisPreconditionsId);

	/**
	 * Returns the group ID of this cannabis conditional license pre condtions.
	 *
	 * @return the group ID of this cannabis conditional license pre condtions
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this cannabis conditional license pre condtions.
	 *
	 * @param groupId the group ID of this cannabis conditional license pre condtions
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this cannabis conditional license pre condtions.
	 *
	 * @return the company ID of this cannabis conditional license pre condtions
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this cannabis conditional license pre condtions.
	 *
	 * @param companyId the company ID of this cannabis conditional license pre condtions
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this cannabis conditional license pre condtions.
	 *
	 * @return the user ID of this cannabis conditional license pre condtions
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this cannabis conditional license pre condtions.
	 *
	 * @param userId the user ID of this cannabis conditional license pre condtions
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this cannabis conditional license pre condtions.
	 *
	 * @return the user uuid of this cannabis conditional license pre condtions
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this cannabis conditional license pre condtions.
	 *
	 * @param userUuid the user uuid of this cannabis conditional license pre condtions
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this cannabis conditional license pre condtions.
	 *
	 * @return the user name of this cannabis conditional license pre condtions
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this cannabis conditional license pre condtions.
	 *
	 * @param userName the user name of this cannabis conditional license pre condtions
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this cannabis conditional license pre condtions.
	 *
	 * @return the create date of this cannabis conditional license pre condtions
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this cannabis conditional license pre condtions.
	 *
	 * @param createDate the create date of this cannabis conditional license pre condtions
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this cannabis conditional license pre condtions.
	 *
	 * @return the modified date of this cannabis conditional license pre condtions
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this cannabis conditional license pre condtions.
	 *
	 * @param modifiedDate the modified date of this cannabis conditional license pre condtions
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the case ID of this cannabis conditional license pre condtions.
	 *
	 * @return the case ID of this cannabis conditional license pre condtions
	 */
	@AutoEscape
	public String getCaseId();

	/**
	 * Sets the case ID of this cannabis conditional license pre condtions.
	 *
	 * @param caseId the case ID of this cannabis conditional license pre condtions
	 */
	public void setCaseId(String caseId);

	/**
	 * Returns the precondition of this cannabis conditional license pre condtions.
	 *
	 * @return the precondition of this cannabis conditional license pre condtions
	 */
	@AutoEscape
	public String getPrecondition();

	/**
	 * Sets the precondition of this cannabis conditional license pre condtions.
	 *
	 * @param precondition the precondition of this cannabis conditional license pre condtions
	 */
	public void setPrecondition(String precondition);

	/**
	 * Returns the status of this cannabis conditional license pre condtions.
	 *
	 * @return the status of this cannabis conditional license pre condtions
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this cannabis conditional license pre condtions.
	 *
	 * @param status the status of this cannabis conditional license pre condtions
	 */
	public void setStatus(String status);

	/**
	 * Returns the cannabis application ID of this cannabis conditional license pre condtions.
	 *
	 * @return the cannabis application ID of this cannabis conditional license pre condtions
	 */
	public long getCannabisApplicationId();

	/**
	 * Sets the cannabis application ID of this cannabis conditional license pre condtions.
	 *
	 * @param cannabisApplicationId the cannabis application ID of this cannabis conditional license pre condtions
	 */
	public void setCannabisApplicationId(long cannabisApplicationId);

	@Override
	public CannabisConditionalLicensePreCondtions cloneWithOriginalValues();

}