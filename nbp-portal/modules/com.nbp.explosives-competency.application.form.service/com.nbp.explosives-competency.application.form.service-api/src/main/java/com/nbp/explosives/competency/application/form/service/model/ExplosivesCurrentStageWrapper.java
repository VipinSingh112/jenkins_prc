/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ExplosivesCurrentStage}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExplosivesCurrentStage
 * @generated
 */
public class ExplosivesCurrentStageWrapper
	extends BaseModelWrapper<ExplosivesCurrentStage>
	implements ExplosivesCurrentStage, ModelWrapper<ExplosivesCurrentStage> {

	public ExplosivesCurrentStageWrapper(
		ExplosivesCurrentStage explosivesCurrentStage) {

		super(explosivesCurrentStage);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("explosiveStageId", getExplosiveStageId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("currentStage", getCurrentStage());
		attributes.put("lastFormDetailsStep", getLastFormDetailsStep());
		attributes.put("explosivesApplicationId", getExplosivesApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long explosiveStageId = (Long)attributes.get("explosiveStageId");

		if (explosiveStageId != null) {
			setExplosiveStageId(explosiveStageId);
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

		String lastFormDetailsStep = (String)attributes.get(
			"lastFormDetailsStep");

		if (lastFormDetailsStep != null) {
			setLastFormDetailsStep(lastFormDetailsStep);
		}

		Long explosivesApplicationId = (Long)attributes.get(
			"explosivesApplicationId");

		if (explosivesApplicationId != null) {
			setExplosivesApplicationId(explosivesApplicationId);
		}
	}

	@Override
	public ExplosivesCurrentStage cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this explosives current stage.
	 *
	 * @return the company ID of this explosives current stage
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this explosives current stage.
	 *
	 * @return the create date of this explosives current stage
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the current stage of this explosives current stage.
	 *
	 * @return the current stage of this explosives current stage
	 */
	@Override
	public String getCurrentStage() {
		return model.getCurrentStage();
	}

	/**
	 * Returns the explosives application ID of this explosives current stage.
	 *
	 * @return the explosives application ID of this explosives current stage
	 */
	@Override
	public long getExplosivesApplicationId() {
		return model.getExplosivesApplicationId();
	}

	/**
	 * Returns the explosive stage ID of this explosives current stage.
	 *
	 * @return the explosive stage ID of this explosives current stage
	 */
	@Override
	public long getExplosiveStageId() {
		return model.getExplosiveStageId();
	}

	/**
	 * Returns the group ID of this explosives current stage.
	 *
	 * @return the group ID of this explosives current stage
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the last form details step of this explosives current stage.
	 *
	 * @return the last form details step of this explosives current stage
	 */
	@Override
	public String getLastFormDetailsStep() {
		return model.getLastFormDetailsStep();
	}

	/**
	 * Returns the modified date of this explosives current stage.
	 *
	 * @return the modified date of this explosives current stage
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this explosives current stage.
	 *
	 * @return the primary key of this explosives current stage
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this explosives current stage.
	 *
	 * @return the user ID of this explosives current stage
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this explosives current stage.
	 *
	 * @return the user name of this explosives current stage
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this explosives current stage.
	 *
	 * @return the user uuid of this explosives current stage
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
	 * Sets the company ID of this explosives current stage.
	 *
	 * @param companyId the company ID of this explosives current stage
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this explosives current stage.
	 *
	 * @param createDate the create date of this explosives current stage
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the current stage of this explosives current stage.
	 *
	 * @param currentStage the current stage of this explosives current stage
	 */
	@Override
	public void setCurrentStage(String currentStage) {
		model.setCurrentStage(currentStage);
	}

	/**
	 * Sets the explosives application ID of this explosives current stage.
	 *
	 * @param explosivesApplicationId the explosives application ID of this explosives current stage
	 */
	@Override
	public void setExplosivesApplicationId(long explosivesApplicationId) {
		model.setExplosivesApplicationId(explosivesApplicationId);
	}

	/**
	 * Sets the explosive stage ID of this explosives current stage.
	 *
	 * @param explosiveStageId the explosive stage ID of this explosives current stage
	 */
	@Override
	public void setExplosiveStageId(long explosiveStageId) {
		model.setExplosiveStageId(explosiveStageId);
	}

	/**
	 * Sets the group ID of this explosives current stage.
	 *
	 * @param groupId the group ID of this explosives current stage
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the last form details step of this explosives current stage.
	 *
	 * @param lastFormDetailsStep the last form details step of this explosives current stage
	 */
	@Override
	public void setLastFormDetailsStep(String lastFormDetailsStep) {
		model.setLastFormDetailsStep(lastFormDetailsStep);
	}

	/**
	 * Sets the modified date of this explosives current stage.
	 *
	 * @param modifiedDate the modified date of this explosives current stage
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this explosives current stage.
	 *
	 * @param primaryKey the primary key of this explosives current stage
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this explosives current stage.
	 *
	 * @param userId the user ID of this explosives current stage
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this explosives current stage.
	 *
	 * @param userName the user name of this explosives current stage
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this explosives current stage.
	 *
	 * @param userUuid the user uuid of this explosives current stage
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
	protected ExplosivesCurrentStageWrapper wrap(
		ExplosivesCurrentStage explosivesCurrentStage) {

		return new ExplosivesCurrentStageWrapper(explosivesCurrentStage);
	}

}