/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the CannabisConsentByPropertyOwner service. Represents a row in the &quot;nbp_cannabis_cpo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.cannabis.application.form.services.model.impl.CannabisConsentByPropertyOwnerModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.cannabis.application.form.services.model.impl.CannabisConsentByPropertyOwnerImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConsentByPropertyOwner
 * @generated
 */
@ProviderType
public interface CannabisConsentByPropertyOwnerModel
	extends BaseModel<CannabisConsentByPropertyOwner>, GroupedModel,
			ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a cannabis consent by property owner model instance should use the {@link CannabisConsentByPropertyOwner} interface instead.
	 */

	/**
	 * Returns the primary key of this cannabis consent by property owner.
	 *
	 * @return the primary key of this cannabis consent by property owner
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this cannabis consent by property owner.
	 *
	 * @param primaryKey the primary key of this cannabis consent by property owner
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this cannabis consent by property owner.
	 *
	 * @return the uuid of this cannabis consent by property owner
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this cannabis consent by property owner.
	 *
	 * @param uuid the uuid of this cannabis consent by property owner
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the cannabis cpo ID of this cannabis consent by property owner.
	 *
	 * @return the cannabis cpo ID of this cannabis consent by property owner
	 */
	public long getCannabisCPOId();

	/**
	 * Sets the cannabis cpo ID of this cannabis consent by property owner.
	 *
	 * @param cannabisCPOId the cannabis cpo ID of this cannabis consent by property owner
	 */
	public void setCannabisCPOId(long cannabisCPOId);

	/**
	 * Returns the group ID of this cannabis consent by property owner.
	 *
	 * @return the group ID of this cannabis consent by property owner
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this cannabis consent by property owner.
	 *
	 * @param groupId the group ID of this cannabis consent by property owner
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this cannabis consent by property owner.
	 *
	 * @return the company ID of this cannabis consent by property owner
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this cannabis consent by property owner.
	 *
	 * @param companyId the company ID of this cannabis consent by property owner
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this cannabis consent by property owner.
	 *
	 * @return the user ID of this cannabis consent by property owner
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this cannabis consent by property owner.
	 *
	 * @param userId the user ID of this cannabis consent by property owner
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this cannabis consent by property owner.
	 *
	 * @return the user uuid of this cannabis consent by property owner
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this cannabis consent by property owner.
	 *
	 * @param userUuid the user uuid of this cannabis consent by property owner
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this cannabis consent by property owner.
	 *
	 * @return the user name of this cannabis consent by property owner
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this cannabis consent by property owner.
	 *
	 * @param userName the user name of this cannabis consent by property owner
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this cannabis consent by property owner.
	 *
	 * @return the create date of this cannabis consent by property owner
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this cannabis consent by property owner.
	 *
	 * @param createDate the create date of this cannabis consent by property owner
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this cannabis consent by property owner.
	 *
	 * @return the modified date of this cannabis consent by property owner
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this cannabis consent by property owner.
	 *
	 * @param modifiedDate the modified date of this cannabis consent by property owner
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the type of property of this cannabis consent by property owner.
	 *
	 * @return the type of property of this cannabis consent by property owner
	 */
	@AutoEscape
	public String getTypeOfProperty();

	/**
	 * Sets the type of property of this cannabis consent by property owner.
	 *
	 * @param typeOfProperty the type of property of this cannabis consent by property owner
	 */
	public void setTypeOfProperty(String typeOfProperty);

	/**
	 * Returns the description of property of this cannabis consent by property owner.
	 *
	 * @return the description of property of this cannabis consent by property owner
	 */
	@AutoEscape
	public String getDescriptionOfProperty();

	/**
	 * Sets the description of property of this cannabis consent by property owner.
	 *
	 * @param descriptionOfProperty the description of property of this cannabis consent by property owner
	 */
	public void setDescriptionOfProperty(String descriptionOfProperty);

	/**
	 * Returns the description of intended use of this cannabis consent by property owner.
	 *
	 * @return the description of intended use of this cannabis consent by property owner
	 */
	@AutoEscape
	public String getDescriptionOfIntendedUse();

	/**
	 * Sets the description of intended use of this cannabis consent by property owner.
	 *
	 * @param descriptionOfIntendedUse the description of intended use of this cannabis consent by property owner
	 */
	public void setDescriptionOfIntendedUse(String descriptionOfIntendedUse);

	/**
	 * Returns the land type of this cannabis consent by property owner.
	 *
	 * @return the land type of this cannabis consent by property owner
	 */
	@AutoEscape
	public String getLandType();

	/**
	 * Sets the land type of this cannabis consent by property owner.
	 *
	 * @param landType the land type of this cannabis consent by property owner
	 */
	public void setLandType(String landType);

	/**
	 * Returns the owns property of this cannabis consent by property owner.
	 *
	 * @return the owns property of this cannabis consent by property owner
	 */
	@AutoEscape
	public String getOwnsProperty();

	/**
	 * Sets the owns property of this cannabis consent by property owner.
	 *
	 * @param ownsProperty the owns property of this cannabis consent by property owner
	 */
	public void setOwnsProperty(String ownsProperty);

	/**
	 * Returns the cannabis application ID of this cannabis consent by property owner.
	 *
	 * @return the cannabis application ID of this cannabis consent by property owner
	 */
	public long getCannabisApplicationId();

	/**
	 * Sets the cannabis application ID of this cannabis consent by property owner.
	 *
	 * @param cannabisApplicationId the cannabis application ID of this cannabis consent by property owner
	 */
	public void setCannabisApplicationId(long cannabisApplicationId);

	@Override
	public CannabisConsentByPropertyOwner cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}