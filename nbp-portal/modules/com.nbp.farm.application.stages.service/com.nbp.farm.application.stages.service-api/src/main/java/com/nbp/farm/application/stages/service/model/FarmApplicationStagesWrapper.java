/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.stages.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FarmApplicationStages}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmApplicationStages
 * @generated
 */
public class FarmApplicationStagesWrapper
	extends BaseModelWrapper<FarmApplicationStages>
	implements FarmApplicationStages, ModelWrapper<FarmApplicationStages> {

	public FarmApplicationStagesWrapper(
		FarmApplicationStages farmApplicationStages) {

		super(farmApplicationStages);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("farmApplicationStagesId", getFarmApplicationStagesId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("stageName", getStageName());
		attributes.put("duration", getDuration());
		attributes.put("stageStatus", getStageStatus());
		attributes.put("stageStartDate", getStageStartDate());
		attributes.put("stageEndDate", getStageEndDate());
		attributes.put("farmApplicationId", getFarmApplicationId());
		attributes.put("caseId", getCaseId());
		attributes.put("updatedBySource", getUpdatedBySource());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long farmApplicationStagesId = (Long)attributes.get(
			"farmApplicationStagesId");

		if (farmApplicationStagesId != null) {
			setFarmApplicationStagesId(farmApplicationStagesId);
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

		String stageName = (String)attributes.get("stageName");

		if (stageName != null) {
			setStageName(stageName);
		}

		String duration = (String)attributes.get("duration");

		if (duration != null) {
			setDuration(duration);
		}

		String stageStatus = (String)attributes.get("stageStatus");

		if (stageStatus != null) {
			setStageStatus(stageStatus);
		}

		Date stageStartDate = (Date)attributes.get("stageStartDate");

		if (stageStartDate != null) {
			setStageStartDate(stageStartDate);
		}

		Date stageEndDate = (Date)attributes.get("stageEndDate");

		if (stageEndDate != null) {
			setStageEndDate(stageEndDate);
		}

		Long farmApplicationId = (Long)attributes.get("farmApplicationId");

		if (farmApplicationId != null) {
			setFarmApplicationId(farmApplicationId);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		String updatedBySource = (String)attributes.get("updatedBySource");

		if (updatedBySource != null) {
			setUpdatedBySource(updatedBySource);
		}
	}

	@Override
	public FarmApplicationStages cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this farm application stages.
	 *
	 * @return the case ID of this farm application stages
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this farm application stages.
	 *
	 * @return the company ID of this farm application stages
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this farm application stages.
	 *
	 * @return the create date of this farm application stages
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the duration of this farm application stages.
	 *
	 * @return the duration of this farm application stages
	 */
	@Override
	public String getDuration() {
		return model.getDuration();
	}

	/**
	 * Returns the farm application ID of this farm application stages.
	 *
	 * @return the farm application ID of this farm application stages
	 */
	@Override
	public long getFarmApplicationId() {
		return model.getFarmApplicationId();
	}

	/**
	 * Returns the farm application stages ID of this farm application stages.
	 *
	 * @return the farm application stages ID of this farm application stages
	 */
	@Override
	public long getFarmApplicationStagesId() {
		return model.getFarmApplicationStagesId();
	}

	/**
	 * Returns the group ID of this farm application stages.
	 *
	 * @return the group ID of this farm application stages
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this farm application stages.
	 *
	 * @return the modified date of this farm application stages
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this farm application stages.
	 *
	 * @return the primary key of this farm application stages
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the stage end date of this farm application stages.
	 *
	 * @return the stage end date of this farm application stages
	 */
	@Override
	public Date getStageEndDate() {
		return model.getStageEndDate();
	}

	/**
	 * Returns the stage name of this farm application stages.
	 *
	 * @return the stage name of this farm application stages
	 */
	@Override
	public String getStageName() {
		return model.getStageName();
	}

	/**
	 * Returns the stage start date of this farm application stages.
	 *
	 * @return the stage start date of this farm application stages
	 */
	@Override
	public Date getStageStartDate() {
		return model.getStageStartDate();
	}

	/**
	 * Returns the stage status of this farm application stages.
	 *
	 * @return the stage status of this farm application stages
	 */
	@Override
	public String getStageStatus() {
		return model.getStageStatus();
	}

	/**
	 * Returns the updated by source of this farm application stages.
	 *
	 * @return the updated by source of this farm application stages
	 */
	@Override
	public String getUpdatedBySource() {
		return model.getUpdatedBySource();
	}

	/**
	 * Returns the user ID of this farm application stages.
	 *
	 * @return the user ID of this farm application stages
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this farm application stages.
	 *
	 * @return the user name of this farm application stages
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this farm application stages.
	 *
	 * @return the user uuid of this farm application stages
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this farm application stages.
	 *
	 * @return the uuid of this farm application stages
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the case ID of this farm application stages.
	 *
	 * @param caseId the case ID of this farm application stages
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this farm application stages.
	 *
	 * @param companyId the company ID of this farm application stages
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this farm application stages.
	 *
	 * @param createDate the create date of this farm application stages
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the duration of this farm application stages.
	 *
	 * @param duration the duration of this farm application stages
	 */
	@Override
	public void setDuration(String duration) {
		model.setDuration(duration);
	}

	/**
	 * Sets the farm application ID of this farm application stages.
	 *
	 * @param farmApplicationId the farm application ID of this farm application stages
	 */
	@Override
	public void setFarmApplicationId(long farmApplicationId) {
		model.setFarmApplicationId(farmApplicationId);
	}

	/**
	 * Sets the farm application stages ID of this farm application stages.
	 *
	 * @param farmApplicationStagesId the farm application stages ID of this farm application stages
	 */
	@Override
	public void setFarmApplicationStagesId(long farmApplicationStagesId) {
		model.setFarmApplicationStagesId(farmApplicationStagesId);
	}

	/**
	 * Sets the group ID of this farm application stages.
	 *
	 * @param groupId the group ID of this farm application stages
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this farm application stages.
	 *
	 * @param modifiedDate the modified date of this farm application stages
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this farm application stages.
	 *
	 * @param primaryKey the primary key of this farm application stages
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the stage end date of this farm application stages.
	 *
	 * @param stageEndDate the stage end date of this farm application stages
	 */
	@Override
	public void setStageEndDate(Date stageEndDate) {
		model.setStageEndDate(stageEndDate);
	}

	/**
	 * Sets the stage name of this farm application stages.
	 *
	 * @param stageName the stage name of this farm application stages
	 */
	@Override
	public void setStageName(String stageName) {
		model.setStageName(stageName);
	}

	/**
	 * Sets the stage start date of this farm application stages.
	 *
	 * @param stageStartDate the stage start date of this farm application stages
	 */
	@Override
	public void setStageStartDate(Date stageStartDate) {
		model.setStageStartDate(stageStartDate);
	}

	/**
	 * Sets the stage status of this farm application stages.
	 *
	 * @param stageStatus the stage status of this farm application stages
	 */
	@Override
	public void setStageStatus(String stageStatus) {
		model.setStageStatus(stageStatus);
	}

	/**
	 * Sets the updated by source of this farm application stages.
	 *
	 * @param updatedBySource the updated by source of this farm application stages
	 */
	@Override
	public void setUpdatedBySource(String updatedBySource) {
		model.setUpdatedBySource(updatedBySource);
	}

	/**
	 * Sets the user ID of this farm application stages.
	 *
	 * @param userId the user ID of this farm application stages
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this farm application stages.
	 *
	 * @param userName the user name of this farm application stages
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this farm application stages.
	 *
	 * @param userUuid the user uuid of this farm application stages
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this farm application stages.
	 *
	 * @param uuid the uuid of this farm application stages
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected FarmApplicationStagesWrapper wrap(
		FarmApplicationStages farmApplicationStages) {

		return new FarmApplicationStagesWrapper(farmApplicationStages);
	}

}