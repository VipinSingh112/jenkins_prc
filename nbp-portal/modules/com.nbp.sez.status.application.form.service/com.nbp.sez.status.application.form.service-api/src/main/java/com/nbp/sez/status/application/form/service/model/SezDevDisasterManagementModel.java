/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the SezDevDisasterManagement service. Represents a row in the &quot;nbp_sez_dev_disaster_manage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.sez.status.application.form.service.model.impl.SezDevDisasterManagementModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.sez.status.application.form.service.model.impl.SezDevDisasterManagementImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevDisasterManagement
 * @generated
 */
@ProviderType
public interface SezDevDisasterManagementModel
	extends BaseModel<SezDevDisasterManagement>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sez dev disaster management model instance should use the {@link SezDevDisasterManagement} interface instead.
	 */

	/**
	 * Returns the primary key of this sez dev disaster management.
	 *
	 * @return the primary key of this sez dev disaster management
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sez dev disaster management.
	 *
	 * @param primaryKey the primary key of this sez dev disaster management
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the sez dev disaster management ID of this sez dev disaster management.
	 *
	 * @return the sez dev disaster management ID of this sez dev disaster management
	 */
	public long getSezDevDisasterManagementId();

	/**
	 * Sets the sez dev disaster management ID of this sez dev disaster management.
	 *
	 * @param sezDevDisasterManagementId the sez dev disaster management ID of this sez dev disaster management
	 */
	public void setSezDevDisasterManagementId(long sezDevDisasterManagementId);

	/**
	 * Returns the group ID of this sez dev disaster management.
	 *
	 * @return the group ID of this sez dev disaster management
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this sez dev disaster management.
	 *
	 * @param groupId the group ID of this sez dev disaster management
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this sez dev disaster management.
	 *
	 * @return the company ID of this sez dev disaster management
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this sez dev disaster management.
	 *
	 * @param companyId the company ID of this sez dev disaster management
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this sez dev disaster management.
	 *
	 * @return the user ID of this sez dev disaster management
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this sez dev disaster management.
	 *
	 * @param userId the user ID of this sez dev disaster management
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this sez dev disaster management.
	 *
	 * @return the user uuid of this sez dev disaster management
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this sez dev disaster management.
	 *
	 * @param userUuid the user uuid of this sez dev disaster management
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this sez dev disaster management.
	 *
	 * @return the user name of this sez dev disaster management
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this sez dev disaster management.
	 *
	 * @param userName the user name of this sez dev disaster management
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this sez dev disaster management.
	 *
	 * @return the create date of this sez dev disaster management
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this sez dev disaster management.
	 *
	 * @param createDate the create date of this sez dev disaster management
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this sez dev disaster management.
	 *
	 * @return the modified date of this sez dev disaster management
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this sez dev disaster management.
	 *
	 * @param modifiedDate the modified date of this sez dev disaster management
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the disaster management of this sez dev disaster management.
	 *
	 * @return the disaster management of this sez dev disaster management
	 */
	@AutoEscape
	public String getDisasterManagement();

	/**
	 * Sets the disaster management of this sez dev disaster management.
	 *
	 * @param disasterManagement the disaster management of this sez dev disaster management
	 */
	public void setDisasterManagement(String disasterManagement);

	/**
	 * Returns the sez status application ID of this sez dev disaster management.
	 *
	 * @return the sez status application ID of this sez dev disaster management
	 */
	public long getSezStatusApplicationId();

	/**
	 * Sets the sez status application ID of this sez dev disaster management.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez dev disaster management
	 */
	public void setSezStatusApplicationId(long sezStatusApplicationId);

	@Override
	public SezDevDisasterManagement cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}