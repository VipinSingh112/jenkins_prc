/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AddOutsourcedActivities}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddOutsourcedActivities
 * @generated
 */
public class AddOutsourcedActivitiesWrapper
	extends BaseModelWrapper<AddOutsourcedActivities>
	implements AddOutsourcedActivities, ModelWrapper<AddOutsourcedActivities> {

	public AddOutsourcedActivitiesWrapper(
		AddOutsourcedActivities addOutsourcedActivities) {

		super(addOutsourcedActivities);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"addOutsourcedActivitiesId", getAddOutsourcedActivitiesId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("outSourcedActivity", getOutSourcedActivity());
		attributes.put("serviceProvider", getServiceProvider());
		attributes.put("locationAddress", getLocationAddress());
		attributes.put("janaacApplicationId", getJanaacApplicationId());
		attributes.put("counter", getCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long addOutsourcedActivitiesId = (Long)attributes.get(
			"addOutsourcedActivitiesId");

		if (addOutsourcedActivitiesId != null) {
			setAddOutsourcedActivitiesId(addOutsourcedActivitiesId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String outSourcedActivity = (String)attributes.get(
			"outSourcedActivity");

		if (outSourcedActivity != null) {
			setOutSourcedActivity(outSourcedActivity);
		}

		String serviceProvider = (String)attributes.get("serviceProvider");

		if (serviceProvider != null) {
			setServiceProvider(serviceProvider);
		}

		String locationAddress = (String)attributes.get("locationAddress");

		if (locationAddress != null) {
			setLocationAddress(locationAddress);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}
	}

	@Override
	public AddOutsourcedActivities cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the add outsourced activities ID of this add outsourced activities.
	 *
	 * @return the add outsourced activities ID of this add outsourced activities
	 */
	@Override
	public long getAddOutsourcedActivitiesId() {
		return model.getAddOutsourcedActivitiesId();
	}

	/**
	 * Returns the company ID of this add outsourced activities.
	 *
	 * @return the company ID of this add outsourced activities
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this add outsourced activities.
	 *
	 * @return the counter of this add outsourced activities
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this add outsourced activities.
	 *
	 * @return the create date of this add outsourced activities
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this add outsourced activities.
	 *
	 * @return the group ID of this add outsourced activities
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this add outsourced activities.
	 *
	 * @return the janaac application ID of this add outsourced activities
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the location address of this add outsourced activities.
	 *
	 * @return the location address of this add outsourced activities
	 */
	@Override
	public String getLocationAddress() {
		return model.getLocationAddress();
	}

	/**
	 * Returns the modified date of this add outsourced activities.
	 *
	 * @return the modified date of this add outsourced activities
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the out sourced activity of this add outsourced activities.
	 *
	 * @return the out sourced activity of this add outsourced activities
	 */
	@Override
	public String getOutSourcedActivity() {
		return model.getOutSourcedActivity();
	}

	/**
	 * Returns the primary key of this add outsourced activities.
	 *
	 * @return the primary key of this add outsourced activities
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the service provider of this add outsourced activities.
	 *
	 * @return the service provider of this add outsourced activities
	 */
	@Override
	public String getServiceProvider() {
		return model.getServiceProvider();
	}

	/**
	 * Returns the user ID of this add outsourced activities.
	 *
	 * @return the user ID of this add outsourced activities
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this add outsourced activities.
	 *
	 * @return the user name of this add outsourced activities
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this add outsourced activities.
	 *
	 * @return the user uuid of this add outsourced activities
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the add outsourced activities ID of this add outsourced activities.
	 *
	 * @param addOutsourcedActivitiesId the add outsourced activities ID of this add outsourced activities
	 */
	@Override
	public void setAddOutsourcedActivitiesId(long addOutsourcedActivitiesId) {
		model.setAddOutsourcedActivitiesId(addOutsourcedActivitiesId);
	}

	/**
	 * Sets the company ID of this add outsourced activities.
	 *
	 * @param companyId the company ID of this add outsourced activities
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this add outsourced activities.
	 *
	 * @param counter the counter of this add outsourced activities
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this add outsourced activities.
	 *
	 * @param createDate the create date of this add outsourced activities
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this add outsourced activities.
	 *
	 * @param groupId the group ID of this add outsourced activities
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this add outsourced activities.
	 *
	 * @param janaacApplicationId the janaac application ID of this add outsourced activities
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the location address of this add outsourced activities.
	 *
	 * @param locationAddress the location address of this add outsourced activities
	 */
	@Override
	public void setLocationAddress(String locationAddress) {
		model.setLocationAddress(locationAddress);
	}

	/**
	 * Sets the modified date of this add outsourced activities.
	 *
	 * @param modifiedDate the modified date of this add outsourced activities
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the out sourced activity of this add outsourced activities.
	 *
	 * @param outSourcedActivity the out sourced activity of this add outsourced activities
	 */
	@Override
	public void setOutSourcedActivity(String outSourcedActivity) {
		model.setOutSourcedActivity(outSourcedActivity);
	}

	/**
	 * Sets the primary key of this add outsourced activities.
	 *
	 * @param primaryKey the primary key of this add outsourced activities
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the service provider of this add outsourced activities.
	 *
	 * @param serviceProvider the service provider of this add outsourced activities
	 */
	@Override
	public void setServiceProvider(String serviceProvider) {
		model.setServiceProvider(serviceProvider);
	}

	/**
	 * Sets the user ID of this add outsourced activities.
	 *
	 * @param userId the user ID of this add outsourced activities
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this add outsourced activities.
	 *
	 * @param userName the user name of this add outsourced activities
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this add outsourced activities.
	 *
	 * @param userUuid the user uuid of this add outsourced activities
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected AddOutsourcedActivitiesWrapper wrap(
		AddOutsourcedActivities addOutsourcedActivities) {

		return new AddOutsourcedActivitiesWrapper(addOutsourcedActivities);
	}

}