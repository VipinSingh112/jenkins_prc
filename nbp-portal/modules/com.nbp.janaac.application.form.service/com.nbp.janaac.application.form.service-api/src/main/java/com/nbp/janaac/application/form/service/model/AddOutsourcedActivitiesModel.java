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
 * The base model interface for the AddOutsourcedActivities service. Represents a row in the &quot;nbp_janaac_add_out_src_act&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.janaac.application.form.service.model.impl.AddOutsourcedActivitiesModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.janaac.application.form.service.model.impl.AddOutsourcedActivitiesImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddOutsourcedActivities
 * @generated
 */
@ProviderType
public interface AddOutsourcedActivitiesModel
	extends BaseModel<AddOutsourcedActivities>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a add outsourced activities model instance should use the {@link AddOutsourcedActivities} interface instead.
	 */

	/**
	 * Returns the primary key of this add outsourced activities.
	 *
	 * @return the primary key of this add outsourced activities
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this add outsourced activities.
	 *
	 * @param primaryKey the primary key of this add outsourced activities
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the add outsourced activities ID of this add outsourced activities.
	 *
	 * @return the add outsourced activities ID of this add outsourced activities
	 */
	public long getAddOutsourcedActivitiesId();

	/**
	 * Sets the add outsourced activities ID of this add outsourced activities.
	 *
	 * @param addOutsourcedActivitiesId the add outsourced activities ID of this add outsourced activities
	 */
	public void setAddOutsourcedActivitiesId(long addOutsourcedActivitiesId);

	/**
	 * Returns the group ID of this add outsourced activities.
	 *
	 * @return the group ID of this add outsourced activities
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this add outsourced activities.
	 *
	 * @param groupId the group ID of this add outsourced activities
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this add outsourced activities.
	 *
	 * @return the company ID of this add outsourced activities
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this add outsourced activities.
	 *
	 * @param companyId the company ID of this add outsourced activities
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this add outsourced activities.
	 *
	 * @return the user ID of this add outsourced activities
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this add outsourced activities.
	 *
	 * @param userId the user ID of this add outsourced activities
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this add outsourced activities.
	 *
	 * @return the user uuid of this add outsourced activities
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this add outsourced activities.
	 *
	 * @param userUuid the user uuid of this add outsourced activities
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this add outsourced activities.
	 *
	 * @return the user name of this add outsourced activities
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this add outsourced activities.
	 *
	 * @param userName the user name of this add outsourced activities
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this add outsourced activities.
	 *
	 * @return the create date of this add outsourced activities
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this add outsourced activities.
	 *
	 * @param createDate the create date of this add outsourced activities
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this add outsourced activities.
	 *
	 * @return the modified date of this add outsourced activities
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this add outsourced activities.
	 *
	 * @param modifiedDate the modified date of this add outsourced activities
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the out sourced activity of this add outsourced activities.
	 *
	 * @return the out sourced activity of this add outsourced activities
	 */
	@AutoEscape
	public String getOutSourcedActivity();

	/**
	 * Sets the out sourced activity of this add outsourced activities.
	 *
	 * @param outSourcedActivity the out sourced activity of this add outsourced activities
	 */
	public void setOutSourcedActivity(String outSourcedActivity);

	/**
	 * Returns the service provider of this add outsourced activities.
	 *
	 * @return the service provider of this add outsourced activities
	 */
	@AutoEscape
	public String getServiceProvider();

	/**
	 * Sets the service provider of this add outsourced activities.
	 *
	 * @param serviceProvider the service provider of this add outsourced activities
	 */
	public void setServiceProvider(String serviceProvider);

	/**
	 * Returns the location address of this add outsourced activities.
	 *
	 * @return the location address of this add outsourced activities
	 */
	@AutoEscape
	public String getLocationAddress();

	/**
	 * Sets the location address of this add outsourced activities.
	 *
	 * @param locationAddress the location address of this add outsourced activities
	 */
	public void setLocationAddress(String locationAddress);

	/**
	 * Returns the janaac application ID of this add outsourced activities.
	 *
	 * @return the janaac application ID of this add outsourced activities
	 */
	public long getJanaacApplicationId();

	/**
	 * Sets the janaac application ID of this add outsourced activities.
	 *
	 * @param janaacApplicationId the janaac application ID of this add outsourced activities
	 */
	public void setJanaacApplicationId(long janaacApplicationId);

	/**
	 * Returns the counter of this add outsourced activities.
	 *
	 * @return the counter of this add outsourced activities
	 */
	@AutoEscape
	public String getCounter();

	/**
	 * Sets the counter of this add outsourced activities.
	 *
	 * @param counter the counter of this add outsourced activities
	 */
	public void setCounter(String counter);

	@Override
	public AddOutsourcedActivities cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}