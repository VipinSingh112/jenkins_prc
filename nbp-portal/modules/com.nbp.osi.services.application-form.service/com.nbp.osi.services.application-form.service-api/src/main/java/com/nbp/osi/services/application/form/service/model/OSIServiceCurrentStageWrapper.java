/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OSIServiceCurrentStage}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OSIServiceCurrentStage
 * @generated
 */
public class OSIServiceCurrentStageWrapper
	extends BaseModelWrapper<OSIServiceCurrentStage>
	implements ModelWrapper<OSIServiceCurrentStage>, OSIServiceCurrentStage {

	public OSIServiceCurrentStageWrapper(
		OSIServiceCurrentStage osiServiceCurrentStage) {

		super(osiServiceCurrentStage);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("osiCurrentStageId", getOsiCurrentStageId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("currentStage", getCurrentStage());
		attributes.put("lastFormDetailsStep", getLastFormDetailsStep());
		attributes.put(
			"osiServicesApplicationId", getOsiServicesApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long osiCurrentStageId = (Long)attributes.get("osiCurrentStageId");

		if (osiCurrentStageId != null) {
			setOsiCurrentStageId(osiCurrentStageId);
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

		Long osiServicesApplicationId = (Long)attributes.get(
			"osiServicesApplicationId");

		if (osiServicesApplicationId != null) {
			setOsiServicesApplicationId(osiServicesApplicationId);
		}
	}

	@Override
	public OSIServiceCurrentStage cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this osi service current stage.
	 *
	 * @return the company ID of this osi service current stage
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi service current stage.
	 *
	 * @return the create date of this osi service current stage
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the current stage of this osi service current stage.
	 *
	 * @return the current stage of this osi service current stage
	 */
	@Override
	public String getCurrentStage() {
		return model.getCurrentStage();
	}

	/**
	 * Returns the group ID of this osi service current stage.
	 *
	 * @return the group ID of this osi service current stage
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the last form details step of this osi service current stage.
	 *
	 * @return the last form details step of this osi service current stage
	 */
	@Override
	public String getLastFormDetailsStep() {
		return model.getLastFormDetailsStep();
	}

	/**
	 * Returns the modified date of this osi service current stage.
	 *
	 * @return the modified date of this osi service current stage
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi current stage ID of this osi service current stage.
	 *
	 * @return the osi current stage ID of this osi service current stage
	 */
	@Override
	public long getOsiCurrentStageId() {
		return model.getOsiCurrentStageId();
	}

	/**
	 * Returns the osi services application ID of this osi service current stage.
	 *
	 * @return the osi services application ID of this osi service current stage
	 */
	@Override
	public long getOsiServicesApplicationId() {
		return model.getOsiServicesApplicationId();
	}

	/**
	 * Returns the primary key of this osi service current stage.
	 *
	 * @return the primary key of this osi service current stage
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this osi service current stage.
	 *
	 * @return the user ID of this osi service current stage
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi service current stage.
	 *
	 * @return the user name of this osi service current stage
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi service current stage.
	 *
	 * @return the user uuid of this osi service current stage
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
	 * Sets the company ID of this osi service current stage.
	 *
	 * @param companyId the company ID of this osi service current stage
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi service current stage.
	 *
	 * @param createDate the create date of this osi service current stage
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the current stage of this osi service current stage.
	 *
	 * @param currentStage the current stage of this osi service current stage
	 */
	@Override
	public void setCurrentStage(String currentStage) {
		model.setCurrentStage(currentStage);
	}

	/**
	 * Sets the group ID of this osi service current stage.
	 *
	 * @param groupId the group ID of this osi service current stage
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the last form details step of this osi service current stage.
	 *
	 * @param lastFormDetailsStep the last form details step of this osi service current stage
	 */
	@Override
	public void setLastFormDetailsStep(String lastFormDetailsStep) {
		model.setLastFormDetailsStep(lastFormDetailsStep);
	}

	/**
	 * Sets the modified date of this osi service current stage.
	 *
	 * @param modifiedDate the modified date of this osi service current stage
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi current stage ID of this osi service current stage.
	 *
	 * @param osiCurrentStageId the osi current stage ID of this osi service current stage
	 */
	@Override
	public void setOsiCurrentStageId(long osiCurrentStageId) {
		model.setOsiCurrentStageId(osiCurrentStageId);
	}

	/**
	 * Sets the osi services application ID of this osi service current stage.
	 *
	 * @param osiServicesApplicationId the osi services application ID of this osi service current stage
	 */
	@Override
	public void setOsiServicesApplicationId(long osiServicesApplicationId) {
		model.setOsiServicesApplicationId(osiServicesApplicationId);
	}

	/**
	 * Sets the primary key of this osi service current stage.
	 *
	 * @param primaryKey the primary key of this osi service current stage
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this osi service current stage.
	 *
	 * @param userId the user ID of this osi service current stage
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi service current stage.
	 *
	 * @param userName the user name of this osi service current stage
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi service current stage.
	 *
	 * @param userUuid the user uuid of this osi service current stage
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
	protected OSIServiceCurrentStageWrapper wrap(
		OSIServiceCurrentStage osiServiceCurrentStage) {

		return new OSIServiceCurrentStageWrapper(osiServiceCurrentStage);
	}

}