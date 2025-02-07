/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link HealthCareDescriptionOfService}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareDescriptionOfService
 * @generated
 */
public class HealthCareDescriptionOfServiceWrapper
	extends BaseModelWrapper<HealthCareDescriptionOfService>
	implements HealthCareDescriptionOfService,
			   ModelWrapper<HealthCareDescriptionOfService> {

	public HealthCareDescriptionOfServiceWrapper(
		HealthCareDescriptionOfService healthCareDescriptionOfService) {

		super(healthCareDescriptionOfService);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("healthCareDescriptionId", getHealthCareDescriptionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("descriptionOfService", getDescriptionOfService());
		attributes.put("healthCareApplicationId", getHealthCareApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long healthCareDescriptionId = (Long)attributes.get(
			"healthCareDescriptionId");

		if (healthCareDescriptionId != null) {
			setHealthCareDescriptionId(healthCareDescriptionId);
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

		String descriptionOfService = (String)attributes.get(
			"descriptionOfService");

		if (descriptionOfService != null) {
			setDescriptionOfService(descriptionOfService);
		}

		Long healthCareApplicationId = (Long)attributes.get(
			"healthCareApplicationId");

		if (healthCareApplicationId != null) {
			setHealthCareApplicationId(healthCareApplicationId);
		}
	}

	@Override
	public HealthCareDescriptionOfService cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this health care description of service.
	 *
	 * @return the company ID of this health care description of service
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this health care description of service.
	 *
	 * @return the create date of this health care description of service
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of service of this health care description of service.
	 *
	 * @return the description of service of this health care description of service
	 */
	@Override
	public String getDescriptionOfService() {
		return model.getDescriptionOfService();
	}

	/**
	 * Returns the group ID of this health care description of service.
	 *
	 * @return the group ID of this health care description of service
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the health care application ID of this health care description of service.
	 *
	 * @return the health care application ID of this health care description of service
	 */
	@Override
	public long getHealthCareApplicationId() {
		return model.getHealthCareApplicationId();
	}

	/**
	 * Returns the health care description ID of this health care description of service.
	 *
	 * @return the health care description ID of this health care description of service
	 */
	@Override
	public long getHealthCareDescriptionId() {
		return model.getHealthCareDescriptionId();
	}

	/**
	 * Returns the modified date of this health care description of service.
	 *
	 * @return the modified date of this health care description of service
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this health care description of service.
	 *
	 * @return the primary key of this health care description of service
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this health care description of service.
	 *
	 * @return the user ID of this health care description of service
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this health care description of service.
	 *
	 * @return the user name of this health care description of service
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this health care description of service.
	 *
	 * @return the user uuid of this health care description of service
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
	 * Sets the company ID of this health care description of service.
	 *
	 * @param companyId the company ID of this health care description of service
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this health care description of service.
	 *
	 * @param createDate the create date of this health care description of service
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of service of this health care description of service.
	 *
	 * @param descriptionOfService the description of service of this health care description of service
	 */
	@Override
	public void setDescriptionOfService(String descriptionOfService) {
		model.setDescriptionOfService(descriptionOfService);
	}

	/**
	 * Sets the group ID of this health care description of service.
	 *
	 * @param groupId the group ID of this health care description of service
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the health care application ID of this health care description of service.
	 *
	 * @param healthCareApplicationId the health care application ID of this health care description of service
	 */
	@Override
	public void setHealthCareApplicationId(long healthCareApplicationId) {
		model.setHealthCareApplicationId(healthCareApplicationId);
	}

	/**
	 * Sets the health care description ID of this health care description of service.
	 *
	 * @param healthCareDescriptionId the health care description ID of this health care description of service
	 */
	@Override
	public void setHealthCareDescriptionId(long healthCareDescriptionId) {
		model.setHealthCareDescriptionId(healthCareDescriptionId);
	}

	/**
	 * Sets the modified date of this health care description of service.
	 *
	 * @param modifiedDate the modified date of this health care description of service
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this health care description of service.
	 *
	 * @param primaryKey the primary key of this health care description of service
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this health care description of service.
	 *
	 * @param userId the user ID of this health care description of service
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this health care description of service.
	 *
	 * @param userName the user name of this health care description of service
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this health care description of service.
	 *
	 * @param userUuid the user uuid of this health care description of service
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
	protected HealthCareDescriptionOfServiceWrapper wrap(
		HealthCareDescriptionOfService healthCareDescriptionOfService) {

		return new HealthCareDescriptionOfServiceWrapper(
			healthCareDescriptionOfService);
	}

}