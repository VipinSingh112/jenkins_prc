/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CreativeApplicationCurrentStage}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeApplicationCurrentStage
 * @generated
 */
public class CreativeApplicationCurrentStageWrapper
	extends BaseModelWrapper<CreativeApplicationCurrentStage>
	implements CreativeApplicationCurrentStage,
			   ModelWrapper<CreativeApplicationCurrentStage> {

	public CreativeApplicationCurrentStageWrapper(
		CreativeApplicationCurrentStage creativeApplicationCurrentStage) {

		super(creativeApplicationCurrentStage);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"creativeAppliCurrentStageId", getCreativeAppliCurrentStageId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("currentStage", getCurrentStage());
		attributes.put("lastFormStep", getLastFormStep());
		attributes.put("CreativeApplicationId", getCreativeApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long creativeAppliCurrentStageId = (Long)attributes.get(
			"creativeAppliCurrentStageId");

		if (creativeAppliCurrentStageId != null) {
			setCreativeAppliCurrentStageId(creativeAppliCurrentStageId);
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

		String lastFormStep = (String)attributes.get("lastFormStep");

		if (lastFormStep != null) {
			setLastFormStep(lastFormStep);
		}

		Long CreativeApplicationId = (Long)attributes.get(
			"CreativeApplicationId");

		if (CreativeApplicationId != null) {
			setCreativeApplicationId(CreativeApplicationId);
		}
	}

	@Override
	public CreativeApplicationCurrentStage cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this creative application current stage.
	 *
	 * @return the company ID of this creative application current stage
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this creative application current stage.
	 *
	 * @return the create date of this creative application current stage
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the creative application ID of this creative application current stage.
	 *
	 * @return the creative application ID of this creative application current stage
	 */
	@Override
	public long getCreativeApplicationId() {
		return model.getCreativeApplicationId();
	}

	/**
	 * Returns the creative appli current stage ID of this creative application current stage.
	 *
	 * @return the creative appli current stage ID of this creative application current stage
	 */
	@Override
	public long getCreativeAppliCurrentStageId() {
		return model.getCreativeAppliCurrentStageId();
	}

	/**
	 * Returns the current stage of this creative application current stage.
	 *
	 * @return the current stage of this creative application current stage
	 */
	@Override
	public String getCurrentStage() {
		return model.getCurrentStage();
	}

	/**
	 * Returns the group ID of this creative application current stage.
	 *
	 * @return the group ID of this creative application current stage
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the last form step of this creative application current stage.
	 *
	 * @return the last form step of this creative application current stage
	 */
	@Override
	public String getLastFormStep() {
		return model.getLastFormStep();
	}

	/**
	 * Returns the modified date of this creative application current stage.
	 *
	 * @return the modified date of this creative application current stage
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this creative application current stage.
	 *
	 * @return the primary key of this creative application current stage
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this creative application current stage.
	 *
	 * @return the user ID of this creative application current stage
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this creative application current stage.
	 *
	 * @return the user name of this creative application current stage
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this creative application current stage.
	 *
	 * @return the user uuid of this creative application current stage
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
	 * Sets the company ID of this creative application current stage.
	 *
	 * @param companyId the company ID of this creative application current stage
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this creative application current stage.
	 *
	 * @param createDate the create date of this creative application current stage
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the creative application ID of this creative application current stage.
	 *
	 * @param CreativeApplicationId the creative application ID of this creative application current stage
	 */
	@Override
	public void setCreativeApplicationId(long CreativeApplicationId) {
		model.setCreativeApplicationId(CreativeApplicationId);
	}

	/**
	 * Sets the creative appli current stage ID of this creative application current stage.
	 *
	 * @param creativeAppliCurrentStageId the creative appli current stage ID of this creative application current stage
	 */
	@Override
	public void setCreativeAppliCurrentStageId(
		long creativeAppliCurrentStageId) {

		model.setCreativeAppliCurrentStageId(creativeAppliCurrentStageId);
	}

	/**
	 * Sets the current stage of this creative application current stage.
	 *
	 * @param currentStage the current stage of this creative application current stage
	 */
	@Override
	public void setCurrentStage(String currentStage) {
		model.setCurrentStage(currentStage);
	}

	/**
	 * Sets the group ID of this creative application current stage.
	 *
	 * @param groupId the group ID of this creative application current stage
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the last form step of this creative application current stage.
	 *
	 * @param lastFormStep the last form step of this creative application current stage
	 */
	@Override
	public void setLastFormStep(String lastFormStep) {
		model.setLastFormStep(lastFormStep);
	}

	/**
	 * Sets the modified date of this creative application current stage.
	 *
	 * @param modifiedDate the modified date of this creative application current stage
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this creative application current stage.
	 *
	 * @param primaryKey the primary key of this creative application current stage
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this creative application current stage.
	 *
	 * @param userId the user ID of this creative application current stage
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this creative application current stage.
	 *
	 * @param userName the user name of this creative application current stage
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this creative application current stage.
	 *
	 * @param userUuid the user uuid of this creative application current stage
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
	protected CreativeApplicationCurrentStageWrapper wrap(
		CreativeApplicationCurrentStage creativeApplicationCurrentStage) {

		return new CreativeApplicationCurrentStageWrapper(
			creativeApplicationCurrentStage);
	}

}