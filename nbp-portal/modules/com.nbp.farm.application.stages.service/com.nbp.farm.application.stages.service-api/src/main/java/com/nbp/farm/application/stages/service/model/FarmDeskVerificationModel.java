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

package com.nbp.farm.application.stages.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the FarmDeskVerification service. Represents a row in the &quot;nbp_farm_desk_verifica&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.farm.application.stages.service.model.impl.FarmDeskVerificationModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.farm.application.stages.service.model.impl.FarmDeskVerificationImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmDeskVerification
 * @generated
 */
@ProviderType
public interface FarmDeskVerificationModel
	extends BaseModel<FarmDeskVerification>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a farm desk verification model instance should use the {@link FarmDeskVerification} interface instead.
	 */

	/**
	 * Returns the primary key of this farm desk verification.
	 *
	 * @return the primary key of this farm desk verification
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this farm desk verification.
	 *
	 * @param primaryKey the primary key of this farm desk verification
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the farm desk verification ID of this farm desk verification.
	 *
	 * @return the farm desk verification ID of this farm desk verification
	 */
	public long getFarmDeskVerificationId();

	/**
	 * Sets the farm desk verification ID of this farm desk verification.
	 *
	 * @param farmDeskVerificationId the farm desk verification ID of this farm desk verification
	 */
	public void setFarmDeskVerificationId(long farmDeskVerificationId);

	/**
	 * Returns the group ID of this farm desk verification.
	 *
	 * @return the group ID of this farm desk verification
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this farm desk verification.
	 *
	 * @param groupId the group ID of this farm desk verification
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this farm desk verification.
	 *
	 * @return the company ID of this farm desk verification
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this farm desk verification.
	 *
	 * @param companyId the company ID of this farm desk verification
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this farm desk verification.
	 *
	 * @return the user ID of this farm desk verification
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this farm desk verification.
	 *
	 * @param userId the user ID of this farm desk verification
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this farm desk verification.
	 *
	 * @return the user uuid of this farm desk verification
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this farm desk verification.
	 *
	 * @param userUuid the user uuid of this farm desk verification
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this farm desk verification.
	 *
	 * @return the user name of this farm desk verification
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this farm desk verification.
	 *
	 * @param userName the user name of this farm desk verification
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this farm desk verification.
	 *
	 * @return the create date of this farm desk verification
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this farm desk verification.
	 *
	 * @param createDate the create date of this farm desk verification
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this farm desk verification.
	 *
	 * @return the modified date of this farm desk verification
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this farm desk verification.
	 *
	 * @param modifiedDate the modified date of this farm desk verification
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the farmer application ID of this farm desk verification.
	 *
	 * @return the farmer application ID of this farm desk verification
	 */
	public long getFarmerApplicationId();

	/**
	 * Sets the farmer application ID of this farm desk verification.
	 *
	 * @param farmerApplicationId the farmer application ID of this farm desk verification
	 */
	public void setFarmerApplicationId(long farmerApplicationId);

	/**
	 * Returns the document name of this farm desk verification.
	 *
	 * @return the document name of this farm desk verification
	 */
	@AutoEscape
	public String getDocumentName();

	/**
	 * Sets the document name of this farm desk verification.
	 *
	 * @param documentName the document name of this farm desk verification
	 */
	public void setDocumentName(String documentName);

	/**
	 * Returns the document status of this farm desk verification.
	 *
	 * @return the document status of this farm desk verification
	 */
	@AutoEscape
	public String getDocumentStatus();

	/**
	 * Sets the document status of this farm desk verification.
	 *
	 * @param documentStatus the document status of this farm desk verification
	 */
	public void setDocumentStatus(String documentStatus);

	@Override
	public FarmDeskVerification cloneWithOriginalValues();

}