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

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the SezZoneEmpInfo service. Represents a row in the &quot;nbp_sez_zone_emp_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneEmpInfoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneEmpInfoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneEmpInfo
 * @generated
 */
@ProviderType
public interface SezZoneEmpInfoModel
	extends BaseModel<SezZoneEmpInfo>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sez zone emp info model instance should use the {@link SezZoneEmpInfo} interface instead.
	 */

	/**
	 * Returns the primary key of this sez zone emp info.
	 *
	 * @return the primary key of this sez zone emp info
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sez zone emp info.
	 *
	 * @param primaryKey the primary key of this sez zone emp info
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the sez zone emp info ID of this sez zone emp info.
	 *
	 * @return the sez zone emp info ID of this sez zone emp info
	 */
	public long getSezZoneEmpInfoId();

	/**
	 * Sets the sez zone emp info ID of this sez zone emp info.
	 *
	 * @param sezZoneEmpInfoId the sez zone emp info ID of this sez zone emp info
	 */
	public void setSezZoneEmpInfoId(long sezZoneEmpInfoId);

	/**
	 * Returns the group ID of this sez zone emp info.
	 *
	 * @return the group ID of this sez zone emp info
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this sez zone emp info.
	 *
	 * @param groupId the group ID of this sez zone emp info
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this sez zone emp info.
	 *
	 * @return the company ID of this sez zone emp info
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this sez zone emp info.
	 *
	 * @param companyId the company ID of this sez zone emp info
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this sez zone emp info.
	 *
	 * @return the user ID of this sez zone emp info
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this sez zone emp info.
	 *
	 * @param userId the user ID of this sez zone emp info
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this sez zone emp info.
	 *
	 * @return the user uuid of this sez zone emp info
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this sez zone emp info.
	 *
	 * @param userUuid the user uuid of this sez zone emp info
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this sez zone emp info.
	 *
	 * @return the user name of this sez zone emp info
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this sez zone emp info.
	 *
	 * @param userName the user name of this sez zone emp info
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this sez zone emp info.
	 *
	 * @return the create date of this sez zone emp info
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this sez zone emp info.
	 *
	 * @param createDate the create date of this sez zone emp info
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this sez zone emp info.
	 *
	 * @return the modified date of this sez zone emp info
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this sez zone emp info.
	 *
	 * @param modifiedDate the modified date of this sez zone emp info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the labour requirement year of this sez zone emp info.
	 *
	 * @return the labour requirement year of this sez zone emp info
	 */
	@AutoEscape
	public String getLabourRequirementYear();

	/**
	 * Sets the labour requirement year of this sez zone emp info.
	 *
	 * @param labourRequirementYear the labour requirement year of this sez zone emp info
	 */
	public void setLabourRequirementYear(String labourRequirementYear);

	/**
	 * Returns the labour requirement direct of this sez zone emp info.
	 *
	 * @return the labour requirement direct of this sez zone emp info
	 */
	@AutoEscape
	public String getLabourRequirementDirect();

	/**
	 * Sets the labour requirement direct of this sez zone emp info.
	 *
	 * @param labourRequirementDirect the labour requirement direct of this sez zone emp info
	 */
	public void setLabourRequirementDirect(String labourRequirementDirect);

	/**
	 * Returns the labour requirement male of this sez zone emp info.
	 *
	 * @return the labour requirement male of this sez zone emp info
	 */
	@AutoEscape
	public String getLabourRequirementMale();

	/**
	 * Sets the labour requirement male of this sez zone emp info.
	 *
	 * @param labourRequirementMale the labour requirement male of this sez zone emp info
	 */
	public void setLabourRequirementMale(String labourRequirementMale);

	/**
	 * Returns the labour requirement female of this sez zone emp info.
	 *
	 * @return the labour requirement female of this sez zone emp info
	 */
	@AutoEscape
	public String getLabourRequirementFemale();

	/**
	 * Sets the labour requirement female of this sez zone emp info.
	 *
	 * @param labourRequirementFemale the labour requirement female of this sez zone emp info
	 */
	public void setLabourRequirementFemale(String labourRequirementFemale);

	/**
	 * Returns the labour requirement local of this sez zone emp info.
	 *
	 * @return the labour requirement local of this sez zone emp info
	 */
	@AutoEscape
	public String getLabourRequirementLocal();

	/**
	 * Sets the labour requirement local of this sez zone emp info.
	 *
	 * @param labourRequirementLocal the labour requirement local of this sez zone emp info
	 */
	public void setLabourRequirementLocal(String labourRequirementLocal);

	/**
	 * Returns the labour requirement foreign of this sez zone emp info.
	 *
	 * @return the labour requirement foreign of this sez zone emp info
	 */
	@AutoEscape
	public String getLabourRequirementForeign();

	/**
	 * Sets the labour requirement foreign of this sez zone emp info.
	 *
	 * @param labourRequirementForeign the labour requirement foreign of this sez zone emp info
	 */
	public void setLabourRequirementForeign(String labourRequirementForeign);

	/**
	 * Returns the counter of this sez zone emp info.
	 *
	 * @return the counter of this sez zone emp info
	 */
	@AutoEscape
	public String getCounter();

	/**
	 * Sets the counter of this sez zone emp info.
	 *
	 * @param counter the counter of this sez zone emp info
	 */
	public void setCounter(String counter);

	/**
	 * Returns the sez status application ID of this sez zone emp info.
	 *
	 * @return the sez status application ID of this sez zone emp info
	 */
	public long getSezStatusApplicationId();

	/**
	 * Sets the sez status application ID of this sez zone emp info.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez zone emp info
	 */
	public void setSezStatusApplicationId(long sezStatusApplicationId);

	@Override
	public SezZoneEmpInfo cloneWithOriginalValues();

}