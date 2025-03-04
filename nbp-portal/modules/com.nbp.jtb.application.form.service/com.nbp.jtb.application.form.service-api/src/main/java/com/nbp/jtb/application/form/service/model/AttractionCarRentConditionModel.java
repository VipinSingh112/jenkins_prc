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
 * The base model interface for the AttractionCarRentCondition service. Represents a row in the &quot;nbp_jtb_car_rent_condition&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.jtb.application.form.service.model.impl.AttractionCarRentConditionModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.jtb.application.form.service.model.impl.AttractionCarRentConditionImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCarRentCondition
 * @generated
 */
@ProviderType
public interface AttractionCarRentConditionModel
	extends BaseModel<AttractionCarRentCondition>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a attraction car rent condition model instance should use the {@link AttractionCarRentCondition} interface instead.
	 */

	/**
	 * Returns the primary key of this attraction car rent condition.
	 *
	 * @return the primary key of this attraction car rent condition
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this attraction car rent condition.
	 *
	 * @param primaryKey the primary key of this attraction car rent condition
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the attraction car ren condit ID of this attraction car rent condition.
	 *
	 * @return the attraction car ren condit ID of this attraction car rent condition
	 */
	public long getAttractionCarRenConditId();

	/**
	 * Sets the attraction car ren condit ID of this attraction car rent condition.
	 *
	 * @param attractionCarRenConditId the attraction car ren condit ID of this attraction car rent condition
	 */
	public void setAttractionCarRenConditId(long attractionCarRenConditId);

	/**
	 * Returns the group ID of this attraction car rent condition.
	 *
	 * @return the group ID of this attraction car rent condition
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this attraction car rent condition.
	 *
	 * @param groupId the group ID of this attraction car rent condition
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this attraction car rent condition.
	 *
	 * @return the company ID of this attraction car rent condition
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this attraction car rent condition.
	 *
	 * @param companyId the company ID of this attraction car rent condition
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this attraction car rent condition.
	 *
	 * @return the user ID of this attraction car rent condition
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this attraction car rent condition.
	 *
	 * @param userId the user ID of this attraction car rent condition
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this attraction car rent condition.
	 *
	 * @return the user uuid of this attraction car rent condition
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this attraction car rent condition.
	 *
	 * @param userUuid the user uuid of this attraction car rent condition
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this attraction car rent condition.
	 *
	 * @return the user name of this attraction car rent condition
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this attraction car rent condition.
	 *
	 * @param userName the user name of this attraction car rent condition
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this attraction car rent condition.
	 *
	 * @return the create date of this attraction car rent condition
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this attraction car rent condition.
	 *
	 * @param createDate the create date of this attraction car rent condition
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this attraction car rent condition.
	 *
	 * @return the modified date of this attraction car rent condition
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this attraction car rent condition.
	 *
	 * @param modifiedDate the modified date of this attraction car rent condition
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the ncr condition prop of this attraction car rent condition.
	 *
	 * @return the ncr condition prop of this attraction car rent condition
	 */
	@AutoEscape
	public String getNcrConditionProp();

	/**
	 * Sets the ncr condition prop of this attraction car rent condition.
	 *
	 * @param ncrConditionProp the ncr condition prop of this attraction car rent condition
	 */
	public void setNcrConditionProp(String ncrConditionProp);

	/**
	 * Returns the jtb application ID of this attraction car rent condition.
	 *
	 * @return the jtb application ID of this attraction car rent condition
	 */
	public long getJtbApplicationId();

	/**
	 * Sets the jtb application ID of this attraction car rent condition.
	 *
	 * @param jtbApplicationId the jtb application ID of this attraction car rent condition
	 */
	public void setJtbApplicationId(long jtbApplicationId);

	@Override
	public AttractionCarRentCondition cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}