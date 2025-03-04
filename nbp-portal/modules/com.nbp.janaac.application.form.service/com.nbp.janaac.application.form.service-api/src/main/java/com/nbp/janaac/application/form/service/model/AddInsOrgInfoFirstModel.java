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
 * The base model interface for the AddInsOrgInfoFirst service. Represents a row in the &quot;nbp_janaac_add_ins_org_first&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.janaac.application.form.service.model.impl.AddInsOrgInfoFirstModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.janaac.application.form.service.model.impl.AddInsOrgInfoFirstImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddInsOrgInfoFirst
 * @generated
 */
@ProviderType
public interface AddInsOrgInfoFirstModel
	extends BaseModel<AddInsOrgInfoFirst>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a add ins org info first model instance should use the {@link AddInsOrgInfoFirst} interface instead.
	 */

	/**
	 * Returns the primary key of this add ins org info first.
	 *
	 * @return the primary key of this add ins org info first
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this add ins org info first.
	 *
	 * @param primaryKey the primary key of this add ins org info first
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the add ins org info first ID of this add ins org info first.
	 *
	 * @return the add ins org info first ID of this add ins org info first
	 */
	public long getAddInsOrgInfoFirstId();

	/**
	 * Sets the add ins org info first ID of this add ins org info first.
	 *
	 * @param addInsOrgInfoFirstId the add ins org info first ID of this add ins org info first
	 */
	public void setAddInsOrgInfoFirstId(long addInsOrgInfoFirstId);

	/**
	 * Returns the group ID of this add ins org info first.
	 *
	 * @return the group ID of this add ins org info first
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this add ins org info first.
	 *
	 * @param groupId the group ID of this add ins org info first
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this add ins org info first.
	 *
	 * @return the company ID of this add ins org info first
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this add ins org info first.
	 *
	 * @param companyId the company ID of this add ins org info first
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this add ins org info first.
	 *
	 * @return the user ID of this add ins org info first
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this add ins org info first.
	 *
	 * @param userId the user ID of this add ins org info first
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this add ins org info first.
	 *
	 * @return the user uuid of this add ins org info first
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this add ins org info first.
	 *
	 * @param userUuid the user uuid of this add ins org info first
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this add ins org info first.
	 *
	 * @return the user name of this add ins org info first
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this add ins org info first.
	 *
	 * @param userName the user name of this add ins org info first
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this add ins org info first.
	 *
	 * @return the create date of this add ins org info first
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this add ins org info first.
	 *
	 * @param createDate the create date of this add ins org info first
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this add ins org info first.
	 *
	 * @return the modified date of this add ins org info first
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this add ins org info first.
	 *
	 * @param modifiedDate the modified date of this add ins org info first
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this add ins org info first.
	 *
	 * @return the name of this add ins org info first
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this add ins org info first.
	 *
	 * @param name the name of this add ins org info first
	 */
	public void setName(String name);

	/**
	 * Returns the position of this add ins org info first.
	 *
	 * @return the position of this add ins org info first
	 */
	@AutoEscape
	public String getPosition();

	/**
	 * Sets the position of this add ins org info first.
	 *
	 * @param position the position of this add ins org info first
	 */
	public void setPosition(String position);

	/**
	 * Returns the janaac application ID of this add ins org info first.
	 *
	 * @return the janaac application ID of this add ins org info first
	 */
	public long getJanaacApplicationId();

	/**
	 * Sets the janaac application ID of this add ins org info first.
	 *
	 * @param janaacApplicationId the janaac application ID of this add ins org info first
	 */
	public void setJanaacApplicationId(long janaacApplicationId);

	/**
	 * Returns the counter of this add ins org info first.
	 *
	 * @return the counter of this add ins org info first
	 */
	@AutoEscape
	public String getCounter();

	/**
	 * Sets the counter of this add ins org info first.
	 *
	 * @param counter the counter of this add ins org info first
	 */
	public void setCounter(String counter);

	@Override
	public AddInsOrgInfoFirst cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}