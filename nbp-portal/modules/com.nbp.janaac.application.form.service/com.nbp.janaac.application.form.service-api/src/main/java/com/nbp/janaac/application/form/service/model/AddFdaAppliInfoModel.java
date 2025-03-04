/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the AddFdaAppliInfo service. Represents a row in the &quot;nbp_janaac_add_fda_Appli_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.janaac.application.form.service.model.impl.AddFdaAppliInfoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.janaac.application.form.service.model.impl.AddFdaAppliInfoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaAppliInfo
 * @generated
 */
@ProviderType
public interface AddFdaAppliInfoModel
	extends BaseModel<AddFdaAppliInfo>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a add fda appli info model instance should use the {@link AddFdaAppliInfo} interface instead.
	 */

	/**
	 * Returns the primary key of this add fda appli info.
	 *
	 * @return the primary key of this add fda appli info
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this add fda appli info.
	 *
	 * @param primaryKey the primary key of this add fda appli info
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the add fda appli info ID of this add fda appli info.
	 *
	 * @return the add fda appli info ID of this add fda appli info
	 */
	public long getAddFdaAppliInfoId();

	/**
	 * Sets the add fda appli info ID of this add fda appli info.
	 *
	 * @param addFdaAppliInfoId the add fda appli info ID of this add fda appli info
	 */
	public void setAddFdaAppliInfoId(long addFdaAppliInfoId);

	/**
	 * Returns the group ID of this add fda appli info.
	 *
	 * @return the group ID of this add fda appli info
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this add fda appli info.
	 *
	 * @param groupId the group ID of this add fda appli info
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this add fda appli info.
	 *
	 * @return the company ID of this add fda appli info
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this add fda appli info.
	 *
	 * @param companyId the company ID of this add fda appli info
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this add fda appli info.
	 *
	 * @return the user ID of this add fda appli info
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this add fda appli info.
	 *
	 * @param userId the user ID of this add fda appli info
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this add fda appli info.
	 *
	 * @return the user uuid of this add fda appli info
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this add fda appli info.
	 *
	 * @param userUuid the user uuid of this add fda appli info
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this add fda appli info.
	 *
	 * @return the user name of this add fda appli info
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this add fda appli info.
	 *
	 * @param userName the user name of this add fda appli info
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this add fda appli info.
	 *
	 * @return the create date of this add fda appli info
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this add fda appli info.
	 *
	 * @param createDate the create date of this add fda appli info
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this add fda appli info.
	 *
	 * @return the modified date of this add fda appli info
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this add fda appli info.
	 *
	 * @param modifiedDate the modified date of this add fda appli info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this add fda appli info.
	 *
	 * @return the name of this add fda appli info
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this add fda appli info.
	 *
	 * @param name the name of this add fda appli info
	 */
	public void setName(String name);

	/**
	 * Returns the email of this add fda appli info.
	 *
	 * @return the email of this add fda appli info
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this add fda appli info.
	 *
	 * @param email the email of this add fda appli info
	 */
	public void setEmail(String email);

	/**
	 * Returns the janaac application ID of this add fda appli info.
	 *
	 * @return the janaac application ID of this add fda appli info
	 */
	public long getJanaacApplicationId();

	/**
	 * Sets the janaac application ID of this add fda appli info.
	 *
	 * @param janaacApplicationId the janaac application ID of this add fda appli info
	 */
	public void setJanaacApplicationId(long janaacApplicationId);

	/**
	 * Returns the counter of this add fda appli info.
	 *
	 * @return the counter of this add fda appli info
	 */
	@AutoEscape
	public String getCounter();

	/**
	 * Sets the counter of this add fda appli info.
	 *
	 * @param counter the counter of this add fda appli info
	 */
	public void setCounter(String counter);

	@Override
	public AddFdaAppliInfo cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}