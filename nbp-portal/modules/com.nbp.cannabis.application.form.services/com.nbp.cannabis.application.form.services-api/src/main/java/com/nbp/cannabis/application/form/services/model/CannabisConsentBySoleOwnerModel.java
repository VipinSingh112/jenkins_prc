/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the CannabisConsentBySoleOwner service. Represents a row in the &quot;nbp_cannabis_cso&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.cannabis.application.form.services.model.impl.CannabisConsentBySoleOwnerModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.cannabis.application.form.services.model.impl.CannabisConsentBySoleOwnerImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConsentBySoleOwner
 * @generated
 */
@ProviderType
public interface CannabisConsentBySoleOwnerModel
	extends BaseModel<CannabisConsentBySoleOwner>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a cannabis consent by sole owner model instance should use the {@link CannabisConsentBySoleOwner} interface instead.
	 */

	/**
	 * Returns the primary key of this cannabis consent by sole owner.
	 *
	 * @return the primary key of this cannabis consent by sole owner
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this cannabis consent by sole owner.
	 *
	 * @param primaryKey the primary key of this cannabis consent by sole owner
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the cannabis consent by sole owner ID of this cannabis consent by sole owner.
	 *
	 * @return the cannabis consent by sole owner ID of this cannabis consent by sole owner
	 */
	public long getCannabisConsentBySoleOwnerId();

	/**
	 * Sets the cannabis consent by sole owner ID of this cannabis consent by sole owner.
	 *
	 * @param cannabisConsentBySoleOwnerId the cannabis consent by sole owner ID of this cannabis consent by sole owner
	 */
	public void setCannabisConsentBySoleOwnerId(
		long cannabisConsentBySoleOwnerId);

	/**
	 * Returns the group ID of this cannabis consent by sole owner.
	 *
	 * @return the group ID of this cannabis consent by sole owner
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this cannabis consent by sole owner.
	 *
	 * @param groupId the group ID of this cannabis consent by sole owner
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this cannabis consent by sole owner.
	 *
	 * @return the company ID of this cannabis consent by sole owner
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this cannabis consent by sole owner.
	 *
	 * @param companyId the company ID of this cannabis consent by sole owner
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this cannabis consent by sole owner.
	 *
	 * @return the user ID of this cannabis consent by sole owner
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this cannabis consent by sole owner.
	 *
	 * @param userId the user ID of this cannabis consent by sole owner
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this cannabis consent by sole owner.
	 *
	 * @return the user uuid of this cannabis consent by sole owner
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this cannabis consent by sole owner.
	 *
	 * @param userUuid the user uuid of this cannabis consent by sole owner
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this cannabis consent by sole owner.
	 *
	 * @return the user name of this cannabis consent by sole owner
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this cannabis consent by sole owner.
	 *
	 * @param userName the user name of this cannabis consent by sole owner
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this cannabis consent by sole owner.
	 *
	 * @return the create date of this cannabis consent by sole owner
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this cannabis consent by sole owner.
	 *
	 * @param createDate the create date of this cannabis consent by sole owner
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this cannabis consent by sole owner.
	 *
	 * @return the modified date of this cannabis consent by sole owner
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this cannabis consent by sole owner.
	 *
	 * @param modifiedDate the modified date of this cannabis consent by sole owner
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the owner name of this cannabis consent by sole owner.
	 *
	 * @return the owner name of this cannabis consent by sole owner
	 */
	@AutoEscape
	public String getOwnerName();

	/**
	 * Sets the owner name of this cannabis consent by sole owner.
	 *
	 * @param ownerName the owner name of this cannabis consent by sole owner
	 */
	public void setOwnerName(String ownerName);

	/**
	 * Returns the date of this cannabis consent by sole owner.
	 *
	 * @return the date of this cannabis consent by sole owner
	 */
	public Date getDate();

	/**
	 * Sets the date of this cannabis consent by sole owner.
	 *
	 * @param date the date of this cannabis consent by sole owner
	 */
	public void setDate(Date date);

	/**
	 * Returns the owner phone of this cannabis consent by sole owner.
	 *
	 * @return the owner phone of this cannabis consent by sole owner
	 */
	@AutoEscape
	public String getOwnerPhone();

	/**
	 * Sets the owner phone of this cannabis consent by sole owner.
	 *
	 * @param ownerPhone the owner phone of this cannabis consent by sole owner
	 */
	public void setOwnerPhone(String ownerPhone);

	/**
	 * Returns the owner address of this cannabis consent by sole owner.
	 *
	 * @return the owner address of this cannabis consent by sole owner
	 */
	@AutoEscape
	public String getOwnerAddress();

	/**
	 * Sets the owner address of this cannabis consent by sole owner.
	 *
	 * @param ownerAddress the owner address of this cannabis consent by sole owner
	 */
	public void setOwnerAddress(String ownerAddress);

	/**
	 * Returns the counter of this cannabis consent by sole owner.
	 *
	 * @return the counter of this cannabis consent by sole owner
	 */
	@AutoEscape
	public String getCounter();

	/**
	 * Sets the counter of this cannabis consent by sole owner.
	 *
	 * @param counter the counter of this cannabis consent by sole owner
	 */
	public void setCounter(String counter);

	/**
	 * Returns the cannabis application ID of this cannabis consent by sole owner.
	 *
	 * @return the cannabis application ID of this cannabis consent by sole owner
	 */
	public long getCannabisApplicationId();

	/**
	 * Sets the cannabis application ID of this cannabis consent by sole owner.
	 *
	 * @param cannabisApplicationId the cannabis application ID of this cannabis consent by sole owner
	 */
	public void setCannabisApplicationId(long cannabisApplicationId);

	@Override
	public CannabisConsentBySoleOwner cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}