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

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the JtbBranchDetailInfo service. Represents a row in the &quot;nbp_jtb_branch_detail&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.jtb.application.form.service.model.impl.JtbBranchDetailInfoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.jtb.application.form.service.model.impl.JtbBranchDetailInfoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbBranchDetailInfo
 * @generated
 */
@ProviderType
public interface JtbBranchDetailInfoModel
	extends BaseModel<JtbBranchDetailInfo>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a jtb branch detail info model instance should use the {@link JtbBranchDetailInfo} interface instead.
	 */

	/**
	 * Returns the primary key of this jtb branch detail info.
	 *
	 * @return the primary key of this jtb branch detail info
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this jtb branch detail info.
	 *
	 * @param primaryKey the primary key of this jtb branch detail info
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the jtb branch detail info ID of this jtb branch detail info.
	 *
	 * @return the jtb branch detail info ID of this jtb branch detail info
	 */
	public long getJtbBranchDetailInfoId();

	/**
	 * Sets the jtb branch detail info ID of this jtb branch detail info.
	 *
	 * @param jtbBranchDetailInfoId the jtb branch detail info ID of this jtb branch detail info
	 */
	public void setJtbBranchDetailInfoId(long jtbBranchDetailInfoId);

	/**
	 * Returns the group ID of this jtb branch detail info.
	 *
	 * @return the group ID of this jtb branch detail info
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this jtb branch detail info.
	 *
	 * @param groupId the group ID of this jtb branch detail info
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this jtb branch detail info.
	 *
	 * @return the company ID of this jtb branch detail info
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this jtb branch detail info.
	 *
	 * @param companyId the company ID of this jtb branch detail info
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this jtb branch detail info.
	 *
	 * @return the user ID of this jtb branch detail info
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this jtb branch detail info.
	 *
	 * @param userId the user ID of this jtb branch detail info
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this jtb branch detail info.
	 *
	 * @return the user uuid of this jtb branch detail info
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this jtb branch detail info.
	 *
	 * @param userUuid the user uuid of this jtb branch detail info
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this jtb branch detail info.
	 *
	 * @return the user name of this jtb branch detail info
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this jtb branch detail info.
	 *
	 * @param userName the user name of this jtb branch detail info
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this jtb branch detail info.
	 *
	 * @return the create date of this jtb branch detail info
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this jtb branch detail info.
	 *
	 * @param createDate the create date of this jtb branch detail info
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this jtb branch detail info.
	 *
	 * @return the modified date of this jtb branch detail info
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this jtb branch detail info.
	 *
	 * @param modifiedDate the modified date of this jtb branch detail info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the counter of this jtb branch detail info.
	 *
	 * @return the counter of this jtb branch detail info
	 */
	@AutoEscape
	public String getCounter();

	/**
	 * Sets the counter of this jtb branch detail info.
	 *
	 * @param counter the counter of this jtb branch detail info
	 */
	public void setCounter(String counter);

	/**
	 * Returns the branch office details of this jtb branch detail info.
	 *
	 * @return the branch office details of this jtb branch detail info
	 */
	@AutoEscape
	public String getBranchOfficeDetails();

	/**
	 * Sets the branch office details of this jtb branch detail info.
	 *
	 * @param branchOfficeDetails the branch office details of this jtb branch detail info
	 */
	public void setBranchOfficeDetails(String branchOfficeDetails);

	/**
	 * Returns the jtb application ID of this jtb branch detail info.
	 *
	 * @return the jtb application ID of this jtb branch detail info
	 */
	public long getJtbApplicationId();

	/**
	 * Sets the jtb application ID of this jtb branch detail info.
	 *
	 * @param jtbApplicationId the jtb application ID of this jtb branch detail info
	 */
	public void setJtbApplicationId(long jtbApplicationId);

	@Override
	public JtbBranchDetailInfo cloneWithOriginalValues();

}