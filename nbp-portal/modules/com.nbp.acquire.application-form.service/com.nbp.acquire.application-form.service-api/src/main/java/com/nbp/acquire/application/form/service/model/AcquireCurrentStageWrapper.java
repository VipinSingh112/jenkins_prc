/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AcquireCurrentStage}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireCurrentStage
 * @generated
 */
public class AcquireCurrentStageWrapper
	extends BaseModelWrapper<AcquireCurrentStage>
	implements AcquireCurrentStage, ModelWrapper<AcquireCurrentStage> {

	public AcquireCurrentStageWrapper(AcquireCurrentStage acquireCurrentStage) {
		super(acquireCurrentStage);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("acquireCurrentStageId", getAcquireCurrentStageId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("currentStage", getCurrentStage());
		attributes.put("lastFormStage", getLastFormStage());
		attributes.put("acquireApplicationId", getAcquireApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long acquireCurrentStageId = (Long)attributes.get(
			"acquireCurrentStageId");

		if (acquireCurrentStageId != null) {
			setAcquireCurrentStageId(acquireCurrentStageId);
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

		String currentStage = (String)attributes.get("currentStage");

		if (currentStage != null) {
			setCurrentStage(currentStage);
		}

		String lastFormStage = (String)attributes.get("lastFormStage");

		if (lastFormStage != null) {
			setLastFormStage(lastFormStage);
		}

		Long acquireApplicationId = (Long)attributes.get(
			"acquireApplicationId");

		if (acquireApplicationId != null) {
			setAcquireApplicationId(acquireApplicationId);
		}
	}

	@Override
	public AcquireCurrentStage cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acquire application ID of this acquire current stage.
	 *
	 * @return the acquire application ID of this acquire current stage
	 */
	@Override
	public long getAcquireApplicationId() {
		return model.getAcquireApplicationId();
	}

	/**
	 * Returns the acquire current stage ID of this acquire current stage.
	 *
	 * @return the acquire current stage ID of this acquire current stage
	 */
	@Override
	public long getAcquireCurrentStageId() {
		return model.getAcquireCurrentStageId();
	}

	/**
	 * Returns the company ID of this acquire current stage.
	 *
	 * @return the company ID of this acquire current stage
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acquire current stage.
	 *
	 * @return the create date of this acquire current stage
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the current stage of this acquire current stage.
	 *
	 * @return the current stage of this acquire current stage
	 */
	@Override
	public String getCurrentStage() {
		return model.getCurrentStage();
	}

	/**
	 * Returns the group ID of this acquire current stage.
	 *
	 * @return the group ID of this acquire current stage
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the last form stage of this acquire current stage.
	 *
	 * @return the last form stage of this acquire current stage
	 */
	@Override
	public String getLastFormStage() {
		return model.getLastFormStage();
	}

	/**
	 * Returns the modified date of this acquire current stage.
	 *
	 * @return the modified date of this acquire current stage
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this acquire current stage.
	 *
	 * @return the primary key of this acquire current stage
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this acquire current stage.
	 *
	 * @return the user ID of this acquire current stage
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acquire current stage.
	 *
	 * @return the user name of this acquire current stage
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acquire current stage.
	 *
	 * @return the user uuid of this acquire current stage
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
	 * Sets the acquire application ID of this acquire current stage.
	 *
	 * @param acquireApplicationId the acquire application ID of this acquire current stage
	 */
	@Override
	public void setAcquireApplicationId(long acquireApplicationId) {
		model.setAcquireApplicationId(acquireApplicationId);
	}

	/**
	 * Sets the acquire current stage ID of this acquire current stage.
	 *
	 * @param acquireCurrentStageId the acquire current stage ID of this acquire current stage
	 */
	@Override
	public void setAcquireCurrentStageId(long acquireCurrentStageId) {
		model.setAcquireCurrentStageId(acquireCurrentStageId);
	}

	/**
	 * Sets the company ID of this acquire current stage.
	 *
	 * @param companyId the company ID of this acquire current stage
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acquire current stage.
	 *
	 * @param createDate the create date of this acquire current stage
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the current stage of this acquire current stage.
	 *
	 * @param currentStage the current stage of this acquire current stage
	 */
	@Override
	public void setCurrentStage(String currentStage) {
		model.setCurrentStage(currentStage);
	}

	/**
	 * Sets the group ID of this acquire current stage.
	 *
	 * @param groupId the group ID of this acquire current stage
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the last form stage of this acquire current stage.
	 *
	 * @param lastFormStage the last form stage of this acquire current stage
	 */
	@Override
	public void setLastFormStage(String lastFormStage) {
		model.setLastFormStage(lastFormStage);
	}

	/**
	 * Sets the modified date of this acquire current stage.
	 *
	 * @param modifiedDate the modified date of this acquire current stage
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this acquire current stage.
	 *
	 * @param primaryKey the primary key of this acquire current stage
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this acquire current stage.
	 *
	 * @param userId the user ID of this acquire current stage
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acquire current stage.
	 *
	 * @param userName the user name of this acquire current stage
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acquire current stage.
	 *
	 * @param userUuid the user uuid of this acquire current stage
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
	protected AcquireCurrentStageWrapper wrap(
		AcquireCurrentStage acquireCurrentStage) {

		return new AcquireCurrentStageWrapper(acquireCurrentStage);
	}

}