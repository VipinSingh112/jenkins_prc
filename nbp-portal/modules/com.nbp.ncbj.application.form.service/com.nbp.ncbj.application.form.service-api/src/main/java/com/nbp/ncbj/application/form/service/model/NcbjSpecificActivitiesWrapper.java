/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NcbjSpecificActivities}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSpecificActivities
 * @generated
 */
public class NcbjSpecificActivitiesWrapper
	extends BaseModelWrapper<NcbjSpecificActivities>
	implements ModelWrapper<NcbjSpecificActivities>, NcbjSpecificActivities {

	public NcbjSpecificActivitiesWrapper(
		NcbjSpecificActivities ncbjSpecificActivities) {

		super(ncbjSpecificActivities);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"ncbjSpecificActivitiesId", getNcbjSpecificActivitiesId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("specificActivity", getSpecificActivity());
		attributes.put("specificActivityNumber", getSpecificActivityNumber());
		attributes.put("specificActivityChecked", getSpecificActivityChecked());
		attributes.put("ncbjApplicationId", getNcbjApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncbjSpecificActivitiesId = (Long)attributes.get(
			"ncbjSpecificActivitiesId");

		if (ncbjSpecificActivitiesId != null) {
			setNcbjSpecificActivitiesId(ncbjSpecificActivitiesId);
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

		String specificActivity = (String)attributes.get("specificActivity");

		if (specificActivity != null) {
			setSpecificActivity(specificActivity);
		}

		String specificActivityNumber = (String)attributes.get(
			"specificActivityNumber");

		if (specificActivityNumber != null) {
			setSpecificActivityNumber(specificActivityNumber);
		}

		String specificActivityChecked = (String)attributes.get(
			"specificActivityChecked");

		if (specificActivityChecked != null) {
			setSpecificActivityChecked(specificActivityChecked);
		}

		Long ncbjApplicationId = (Long)attributes.get("ncbjApplicationId");

		if (ncbjApplicationId != null) {
			setNcbjApplicationId(ncbjApplicationId);
		}
	}

	@Override
	public NcbjSpecificActivities cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this ncbj specific activities.
	 *
	 * @return the company ID of this ncbj specific activities
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this ncbj specific activities.
	 *
	 * @return the create date of this ncbj specific activities
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this ncbj specific activities.
	 *
	 * @return the group ID of this ncbj specific activities
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this ncbj specific activities.
	 *
	 * @return the modified date of this ncbj specific activities
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncbj application ID of this ncbj specific activities.
	 *
	 * @return the ncbj application ID of this ncbj specific activities
	 */
	@Override
	public long getNcbjApplicationId() {
		return model.getNcbjApplicationId();
	}

	/**
	 * Returns the ncbj specific activities ID of this ncbj specific activities.
	 *
	 * @return the ncbj specific activities ID of this ncbj specific activities
	 */
	@Override
	public long getNcbjSpecificActivitiesId() {
		return model.getNcbjSpecificActivitiesId();
	}

	/**
	 * Returns the primary key of this ncbj specific activities.
	 *
	 * @return the primary key of this ncbj specific activities
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the specific activity of this ncbj specific activities.
	 *
	 * @return the specific activity of this ncbj specific activities
	 */
	@Override
	public String getSpecificActivity() {
		return model.getSpecificActivity();
	}

	/**
	 * Returns the specific activity checked of this ncbj specific activities.
	 *
	 * @return the specific activity checked of this ncbj specific activities
	 */
	@Override
	public String getSpecificActivityChecked() {
		return model.getSpecificActivityChecked();
	}

	/**
	 * Returns the specific activity number of this ncbj specific activities.
	 *
	 * @return the specific activity number of this ncbj specific activities
	 */
	@Override
	public String getSpecificActivityNumber() {
		return model.getSpecificActivityNumber();
	}

	/**
	 * Returns the user ID of this ncbj specific activities.
	 *
	 * @return the user ID of this ncbj specific activities
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncbj specific activities.
	 *
	 * @return the user name of this ncbj specific activities
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncbj specific activities.
	 *
	 * @return the user uuid of this ncbj specific activities
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
	 * Sets the company ID of this ncbj specific activities.
	 *
	 * @param companyId the company ID of this ncbj specific activities
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this ncbj specific activities.
	 *
	 * @param createDate the create date of this ncbj specific activities
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this ncbj specific activities.
	 *
	 * @param groupId the group ID of this ncbj specific activities
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this ncbj specific activities.
	 *
	 * @param modifiedDate the modified date of this ncbj specific activities
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncbj application ID of this ncbj specific activities.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj specific activities
	 */
	@Override
	public void setNcbjApplicationId(long ncbjApplicationId) {
		model.setNcbjApplicationId(ncbjApplicationId);
	}

	/**
	 * Sets the ncbj specific activities ID of this ncbj specific activities.
	 *
	 * @param ncbjSpecificActivitiesId the ncbj specific activities ID of this ncbj specific activities
	 */
	@Override
	public void setNcbjSpecificActivitiesId(long ncbjSpecificActivitiesId) {
		model.setNcbjSpecificActivitiesId(ncbjSpecificActivitiesId);
	}

	/**
	 * Sets the primary key of this ncbj specific activities.
	 *
	 * @param primaryKey the primary key of this ncbj specific activities
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the specific activity of this ncbj specific activities.
	 *
	 * @param specificActivity the specific activity of this ncbj specific activities
	 */
	@Override
	public void setSpecificActivity(String specificActivity) {
		model.setSpecificActivity(specificActivity);
	}

	/**
	 * Sets the specific activity checked of this ncbj specific activities.
	 *
	 * @param specificActivityChecked the specific activity checked of this ncbj specific activities
	 */
	@Override
	public void setSpecificActivityChecked(String specificActivityChecked) {
		model.setSpecificActivityChecked(specificActivityChecked);
	}

	/**
	 * Sets the specific activity number of this ncbj specific activities.
	 *
	 * @param specificActivityNumber the specific activity number of this ncbj specific activities
	 */
	@Override
	public void setSpecificActivityNumber(String specificActivityNumber) {
		model.setSpecificActivityNumber(specificActivityNumber);
	}

	/**
	 * Sets the user ID of this ncbj specific activities.
	 *
	 * @param userId the user ID of this ncbj specific activities
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncbj specific activities.
	 *
	 * @param userName the user name of this ncbj specific activities
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncbj specific activities.
	 *
	 * @param userUuid the user uuid of this ncbj specific activities
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
	protected NcbjSpecificActivitiesWrapper wrap(
		NcbjSpecificActivities ncbjSpecificActivities) {

		return new NcbjSpecificActivitiesWrapper(ncbjSpecificActivities);
	}

}