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
 * The base model interface for the SezDevEmployeeSafetyInfoAdd service. Represents a row in the &quot;nbp_sez_dev_emp_safety_add&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.sez.status.application.form.service.model.impl.SezDevEmployeeSafetyInfoAddModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.sez.status.application.form.service.model.impl.SezDevEmployeeSafetyInfoAddImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevEmployeeSafetyInfoAdd
 * @generated
 */
@ProviderType
public interface SezDevEmployeeSafetyInfoAddModel
	extends BaseModel<SezDevEmployeeSafetyInfoAdd>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sez dev employee safety info add model instance should use the {@link SezDevEmployeeSafetyInfoAdd} interface instead.
	 */

	/**
	 * Returns the primary key of this sez dev employee safety info add.
	 *
	 * @return the primary key of this sez dev employee safety info add
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sez dev employee safety info add.
	 *
	 * @param primaryKey the primary key of this sez dev employee safety info add
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the sez dev employee safety info add ID of this sez dev employee safety info add.
	 *
	 * @return the sez dev employee safety info add ID of this sez dev employee safety info add
	 */
	public long getSezDevEmployeeSafetyInfoAddId();

	/**
	 * Sets the sez dev employee safety info add ID of this sez dev employee safety info add.
	 *
	 * @param sezDevEmployeeSafetyInfoAddId the sez dev employee safety info add ID of this sez dev employee safety info add
	 */
	public void setSezDevEmployeeSafetyInfoAddId(
		long sezDevEmployeeSafetyInfoAddId);

	/**
	 * Returns the group ID of this sez dev employee safety info add.
	 *
	 * @return the group ID of this sez dev employee safety info add
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this sez dev employee safety info add.
	 *
	 * @param groupId the group ID of this sez dev employee safety info add
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this sez dev employee safety info add.
	 *
	 * @return the company ID of this sez dev employee safety info add
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this sez dev employee safety info add.
	 *
	 * @param companyId the company ID of this sez dev employee safety info add
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this sez dev employee safety info add.
	 *
	 * @return the user ID of this sez dev employee safety info add
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this sez dev employee safety info add.
	 *
	 * @param userId the user ID of this sez dev employee safety info add
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this sez dev employee safety info add.
	 *
	 * @return the user uuid of this sez dev employee safety info add
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this sez dev employee safety info add.
	 *
	 * @param userUuid the user uuid of this sez dev employee safety info add
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this sez dev employee safety info add.
	 *
	 * @return the user name of this sez dev employee safety info add
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this sez dev employee safety info add.
	 *
	 * @param userName the user name of this sez dev employee safety info add
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this sez dev employee safety info add.
	 *
	 * @return the create date of this sez dev employee safety info add
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this sez dev employee safety info add.
	 *
	 * @param createDate the create date of this sez dev employee safety info add
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this sez dev employee safety info add.
	 *
	 * @return the modified date of this sez dev employee safety info add
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this sez dev employee safety info add.
	 *
	 * @param modifiedDate the modified date of this sez dev employee safety info add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the security measures of this sez dev employee safety info add.
	 *
	 * @return the security measures of this sez dev employee safety info add
	 */
	@AutoEscape
	public String getSecurityMeasures();

	/**
	 * Sets the security measures of this sez dev employee safety info add.
	 *
	 * @param securityMeasures the security measures of this sez dev employee safety info add
	 */
	public void setSecurityMeasures(String securityMeasures);

	/**
	 * Returns the counter of this sez dev employee safety info add.
	 *
	 * @return the counter of this sez dev employee safety info add
	 */
	@AutoEscape
	public String getCounter();

	/**
	 * Sets the counter of this sez dev employee safety info add.
	 *
	 * @param counter the counter of this sez dev employee safety info add
	 */
	public void setCounter(String counter);

	/**
	 * Returns the sez status application ID of this sez dev employee safety info add.
	 *
	 * @return the sez status application ID of this sez dev employee safety info add
	 */
	public long getSezStatusApplicationId();

	/**
	 * Sets the sez status application ID of this sez dev employee safety info add.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez dev employee safety info add
	 */
	public void setSezStatusApplicationId(long sezStatusApplicationId);

	@Override
	public SezDevEmployeeSafetyInfoAdd cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}