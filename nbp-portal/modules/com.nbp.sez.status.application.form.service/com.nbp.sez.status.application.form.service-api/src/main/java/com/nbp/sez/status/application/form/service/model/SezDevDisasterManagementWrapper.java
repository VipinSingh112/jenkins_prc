/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SezDevDisasterManagement}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevDisasterManagement
 * @generated
 */
public class SezDevDisasterManagementWrapper
	extends BaseModelWrapper<SezDevDisasterManagement>
	implements ModelWrapper<SezDevDisasterManagement>,
			   SezDevDisasterManagement {

	public SezDevDisasterManagementWrapper(
		SezDevDisasterManagement sezDevDisasterManagement) {

		super(sezDevDisasterManagement);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"sezDevDisasterManagementId", getSezDevDisasterManagementId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("disasterManagement", getDisasterManagement());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezDevDisasterManagementId = (Long)attributes.get(
			"sezDevDisasterManagementId");

		if (sezDevDisasterManagementId != null) {
			setSezDevDisasterManagementId(sezDevDisasterManagementId);
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

		String disasterManagement = (String)attributes.get(
			"disasterManagement");

		if (disasterManagement != null) {
			setDisasterManagement(disasterManagement);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezDevDisasterManagement cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez dev disaster management.
	 *
	 * @return the company ID of this sez dev disaster management
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez dev disaster management.
	 *
	 * @return the create date of this sez dev disaster management
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the disaster management of this sez dev disaster management.
	 *
	 * @return the disaster management of this sez dev disaster management
	 */
	@Override
	public String getDisasterManagement() {
		return model.getDisasterManagement();
	}

	/**
	 * Returns the group ID of this sez dev disaster management.
	 *
	 * @return the group ID of this sez dev disaster management
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez dev disaster management.
	 *
	 * @return the modified date of this sez dev disaster management
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this sez dev disaster management.
	 *
	 * @return the primary key of this sez dev disaster management
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez dev disaster management ID of this sez dev disaster management.
	 *
	 * @return the sez dev disaster management ID of this sez dev disaster management
	 */
	@Override
	public long getSezDevDisasterManagementId() {
		return model.getSezDevDisasterManagementId();
	}

	/**
	 * Returns the sez status application ID of this sez dev disaster management.
	 *
	 * @return the sez status application ID of this sez dev disaster management
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the user ID of this sez dev disaster management.
	 *
	 * @return the user ID of this sez dev disaster management
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez dev disaster management.
	 *
	 * @return the user name of this sez dev disaster management
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez dev disaster management.
	 *
	 * @return the user uuid of this sez dev disaster management
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
	 * Sets the company ID of this sez dev disaster management.
	 *
	 * @param companyId the company ID of this sez dev disaster management
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez dev disaster management.
	 *
	 * @param createDate the create date of this sez dev disaster management
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the disaster management of this sez dev disaster management.
	 *
	 * @param disasterManagement the disaster management of this sez dev disaster management
	 */
	@Override
	public void setDisasterManagement(String disasterManagement) {
		model.setDisasterManagement(disasterManagement);
	}

	/**
	 * Sets the group ID of this sez dev disaster management.
	 *
	 * @param groupId the group ID of this sez dev disaster management
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez dev disaster management.
	 *
	 * @param modifiedDate the modified date of this sez dev disaster management
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this sez dev disaster management.
	 *
	 * @param primaryKey the primary key of this sez dev disaster management
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez dev disaster management ID of this sez dev disaster management.
	 *
	 * @param sezDevDisasterManagementId the sez dev disaster management ID of this sez dev disaster management
	 */
	@Override
	public void setSezDevDisasterManagementId(long sezDevDisasterManagementId) {
		model.setSezDevDisasterManagementId(sezDevDisasterManagementId);
	}

	/**
	 * Sets the sez status application ID of this sez dev disaster management.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez dev disaster management
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the user ID of this sez dev disaster management.
	 *
	 * @param userId the user ID of this sez dev disaster management
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez dev disaster management.
	 *
	 * @param userName the user name of this sez dev disaster management
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez dev disaster management.
	 *
	 * @param userUuid the user uuid of this sez dev disaster management
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
	protected SezDevDisasterManagementWrapper wrap(
		SezDevDisasterManagement sezDevDisasterManagement) {

		return new SezDevDisasterManagementWrapper(sezDevDisasterManagement);
	}

}