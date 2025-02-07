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
 * The base model interface for the AddFdaPersonnelFirst service. Represents a row in the &quot;nbp_janaac_add_fda_per_first&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelFirstModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelFirstImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelFirst
 * @generated
 */
@ProviderType
public interface AddFdaPersonnelFirstModel
	extends BaseModel<AddFdaPersonnelFirst>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a add fda personnel first model instance should use the {@link AddFdaPersonnelFirst} interface instead.
	 */

	/**
	 * Returns the primary key of this add fda personnel first.
	 *
	 * @return the primary key of this add fda personnel first
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this add fda personnel first.
	 *
	 * @param primaryKey the primary key of this add fda personnel first
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the add fda personnel first ID of this add fda personnel first.
	 *
	 * @return the add fda personnel first ID of this add fda personnel first
	 */
	public long getAddFdaPersonnelFirstId();

	/**
	 * Sets the add fda personnel first ID of this add fda personnel first.
	 *
	 * @param addFdaPersonnelFirstId the add fda personnel first ID of this add fda personnel first
	 */
	public void setAddFdaPersonnelFirstId(long addFdaPersonnelFirstId);

	/**
	 * Returns the group ID of this add fda personnel first.
	 *
	 * @return the group ID of this add fda personnel first
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this add fda personnel first.
	 *
	 * @param groupId the group ID of this add fda personnel first
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this add fda personnel first.
	 *
	 * @return the company ID of this add fda personnel first
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this add fda personnel first.
	 *
	 * @param companyId the company ID of this add fda personnel first
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this add fda personnel first.
	 *
	 * @return the user ID of this add fda personnel first
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this add fda personnel first.
	 *
	 * @param userId the user ID of this add fda personnel first
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this add fda personnel first.
	 *
	 * @return the user uuid of this add fda personnel first
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this add fda personnel first.
	 *
	 * @param userUuid the user uuid of this add fda personnel first
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this add fda personnel first.
	 *
	 * @return the user name of this add fda personnel first
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this add fda personnel first.
	 *
	 * @param userName the user name of this add fda personnel first
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this add fda personnel first.
	 *
	 * @return the create date of this add fda personnel first
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this add fda personnel first.
	 *
	 * @param createDate the create date of this add fda personnel first
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this add fda personnel first.
	 *
	 * @return the modified date of this add fda personnel first
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this add fda personnel first.
	 *
	 * @param modifiedDate the modified date of this add fda personnel first
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of staff of this add fda personnel first.
	 *
	 * @return the name of staff of this add fda personnel first
	 */
	@AutoEscape
	public String getNameOfStaff();

	/**
	 * Sets the name of staff of this add fda personnel first.
	 *
	 * @param nameOfStaff the name of staff of this add fda personnel first
	 */
	public void setNameOfStaff(String nameOfStaff);

	/**
	 * Returns the job title of this add fda personnel first.
	 *
	 * @return the job title of this add fda personnel first
	 */
	@AutoEscape
	public String getJobTitle();

	/**
	 * Sets the job title of this add fda personnel first.
	 *
	 * @param jobTitle the job title of this add fda personnel first
	 */
	public void setJobTitle(String jobTitle);

	/**
	 * Returns the major responsibilites of this add fda personnel first.
	 *
	 * @return the major responsibilites of this add fda personnel first
	 */
	@AutoEscape
	public String getMajorResponsibilites();

	/**
	 * Sets the major responsibilites of this add fda personnel first.
	 *
	 * @param majorResponsibilites the major responsibilites of this add fda personnel first
	 */
	public void setMajorResponsibilites(String majorResponsibilites);

	/**
	 * Returns the specific functions of this add fda personnel first.
	 *
	 * @return the specific functions of this add fda personnel first
	 */
	@AutoEscape
	public String getSpecificFunctions();

	/**
	 * Sets the specific functions of this add fda personnel first.
	 *
	 * @param specificFunctions the specific functions of this add fda personnel first
	 */
	public void setSpecificFunctions(String specificFunctions);

	/**
	 * Returns the janaac application ID of this add fda personnel first.
	 *
	 * @return the janaac application ID of this add fda personnel first
	 */
	public long getJanaacApplicationId();

	/**
	 * Sets the janaac application ID of this add fda personnel first.
	 *
	 * @param janaacApplicationId the janaac application ID of this add fda personnel first
	 */
	public void setJanaacApplicationId(long janaacApplicationId);

	/**
	 * Returns the counter of this add fda personnel first.
	 *
	 * @return the counter of this add fda personnel first
	 */
	@AutoEscape
	public String getCounter();

	/**
	 * Sets the counter of this add fda personnel first.
	 *
	 * @param counter the counter of this add fda personnel first
	 */
	public void setCounter(String counter);

	@Override
	public AddFdaPersonnelFirst cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}