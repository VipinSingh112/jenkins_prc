/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the JtbAddCraftEmployeeInfo service. Represents a row in the &quot;nbp_jtb_craft_employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.jtb.application.form.service.model.impl.JtbAddCraftEmployeeInfoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.jtb.application.form.service.model.impl.JtbAddCraftEmployeeInfoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddCraftEmployeeInfo
 * @generated
 */
@ProviderType
public interface JtbAddCraftEmployeeInfoModel
	extends BaseModel<JtbAddCraftEmployeeInfo>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a jtb add craft employee info model instance should use the {@link JtbAddCraftEmployeeInfo} interface instead.
	 */

	/**
	 * Returns the primary key of this jtb add craft employee info.
	 *
	 * @return the primary key of this jtb add craft employee info
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this jtb add craft employee info.
	 *
	 * @param primaryKey the primary key of this jtb add craft employee info
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the jtb add craft employee info ID of this jtb add craft employee info.
	 *
	 * @return the jtb add craft employee info ID of this jtb add craft employee info
	 */
	public long getJtbAddCraftEmployeeInfoId();

	/**
	 * Sets the jtb add craft employee info ID of this jtb add craft employee info.
	 *
	 * @param jtbAddCraftEmployeeInfoId the jtb add craft employee info ID of this jtb add craft employee info
	 */
	public void setJtbAddCraftEmployeeInfoId(long jtbAddCraftEmployeeInfoId);

	/**
	 * Returns the group ID of this jtb add craft employee info.
	 *
	 * @return the group ID of this jtb add craft employee info
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this jtb add craft employee info.
	 *
	 * @param groupId the group ID of this jtb add craft employee info
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this jtb add craft employee info.
	 *
	 * @return the company ID of this jtb add craft employee info
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this jtb add craft employee info.
	 *
	 * @param companyId the company ID of this jtb add craft employee info
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this jtb add craft employee info.
	 *
	 * @return the user ID of this jtb add craft employee info
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this jtb add craft employee info.
	 *
	 * @param userId the user ID of this jtb add craft employee info
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this jtb add craft employee info.
	 *
	 * @return the user uuid of this jtb add craft employee info
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this jtb add craft employee info.
	 *
	 * @param userUuid the user uuid of this jtb add craft employee info
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this jtb add craft employee info.
	 *
	 * @return the user name of this jtb add craft employee info
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this jtb add craft employee info.
	 *
	 * @param userName the user name of this jtb add craft employee info
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this jtb add craft employee info.
	 *
	 * @return the create date of this jtb add craft employee info
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this jtb add craft employee info.
	 *
	 * @param createDate the create date of this jtb add craft employee info
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this jtb add craft employee info.
	 *
	 * @return the modified date of this jtb add craft employee info
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this jtb add craft employee info.
	 *
	 * @param modifiedDate the modified date of this jtb add craft employee info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the counter of this jtb add craft employee info.
	 *
	 * @return the counter of this jtb add craft employee info
	 */
	@AutoEscape
	public String getCounter();

	/**
	 * Sets the counter of this jtb add craft employee info.
	 *
	 * @param counter the counter of this jtb add craft employee info
	 */
	public void setCounter(String counter);

	/**
	 * Returns the emp name of this jtb add craft employee info.
	 *
	 * @return the emp name of this jtb add craft employee info
	 */
	@AutoEscape
	public String getEmpName();

	/**
	 * Sets the emp name of this jtb add craft employee info.
	 *
	 * @param empName the emp name of this jtb add craft employee info
	 */
	public void setEmpName(String empName);

	/**
	 * Returns the emp address of this jtb add craft employee info.
	 *
	 * @return the emp address of this jtb add craft employee info
	 */
	@AutoEscape
	public String getEmpAddress();

	/**
	 * Sets the emp address of this jtb add craft employee info.
	 *
	 * @param empAddress the emp address of this jtb add craft employee info
	 */
	public void setEmpAddress(String empAddress);

	/**
	 * Returns the emp phone no of this jtb add craft employee info.
	 *
	 * @return the emp phone no of this jtb add craft employee info
	 */
	@AutoEscape
	public String getEmpPhoneNo();

	/**
	 * Sets the emp phone no of this jtb add craft employee info.
	 *
	 * @param empPhoneNo the emp phone no of this jtb add craft employee info
	 */
	public void setEmpPhoneNo(String empPhoneNo);

	/**
	 * Returns the jtb application ID of this jtb add craft employee info.
	 *
	 * @return the jtb application ID of this jtb add craft employee info
	 */
	public long getJtbApplicationId();

	/**
	 * Sets the jtb application ID of this jtb add craft employee info.
	 *
	 * @param jtbApplicationId the jtb application ID of this jtb add craft employee info
	 */
	public void setJtbApplicationId(long jtbApplicationId);

	@Override
	public JtbAddCraftEmployeeInfo cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}