/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.stages.services.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OgtApplicationStage}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OgtApplicationStage
 * @generated
 */
public class OgtApplicationStageWrapper
	extends BaseModelWrapper<OgtApplicationStage>
	implements ModelWrapper<OgtApplicationStage>, OgtApplicationStage {

	public OgtApplicationStageWrapper(OgtApplicationStage ogtApplicationStage) {
		super(ogtApplicationStage);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("ogtStagesId", getOgtStagesId());
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
		attributes.put("ogtApplicationId", getOgtApplicationId());
		attributes.put("caseId", getCaseId());
		attributes.put("updateBySource", getUpdateBySource());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long ogtStagesId = (Long)attributes.get("ogtStagesId");

		if (ogtStagesId != null) {
			setOgtStagesId(ogtStagesId);
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

		Long ogtApplicationId = (Long)attributes.get("ogtApplicationId");

		if (ogtApplicationId != null) {
			setOgtApplicationId(ogtApplicationId);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		String updateBySource = (String)attributes.get("updateBySource");

		if (updateBySource != null) {
			setUpdateBySource(updateBySource);
		}
	}

	@Override
	public OgtApplicationStage cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this ogt application stage.
	 *
	 * @return the case ID of this ogt application stage
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this ogt application stage.
	 *
	 * @return the company ID of this ogt application stage
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this ogt application stage.
	 *
	 * @return the create date of this ogt application stage
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the duration of this ogt application stage.
	 *
	 * @return the duration of this ogt application stage
	 */
	@Override
	public String getDuration() {
		return model.getDuration();
	}

	/**
	 * Returns the group ID of this ogt application stage.
	 *
	 * @return the group ID of this ogt application stage
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this ogt application stage.
	 *
	 * @return the modified date of this ogt application stage
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ogt application ID of this ogt application stage.
	 *
	 * @return the ogt application ID of this ogt application stage
	 */
	@Override
	public long getOgtApplicationId() {
		return model.getOgtApplicationId();
	}

	/**
	 * Returns the ogt stages ID of this ogt application stage.
	 *
	 * @return the ogt stages ID of this ogt application stage
	 */
	@Override
	public long getOgtStagesId() {
		return model.getOgtStagesId();
	}

	/**
	 * Returns the primary key of this ogt application stage.
	 *
	 * @return the primary key of this ogt application stage
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the stage end date of this ogt application stage.
	 *
	 * @return the stage end date of this ogt application stage
	 */
	@Override
	public Date getStageEndDate() {
		return model.getStageEndDate();
	}

	/**
	 * Returns the stage name of this ogt application stage.
	 *
	 * @return the stage name of this ogt application stage
	 */
	@Override
	public String getStageName() {
		return model.getStageName();
	}

	/**
	 * Returns the stage start date of this ogt application stage.
	 *
	 * @return the stage start date of this ogt application stage
	 */
	@Override
	public Date getStageStartDate() {
		return model.getStageStartDate();
	}

	/**
	 * Returns the stage status of this ogt application stage.
	 *
	 * @return the stage status of this ogt application stage
	 */
	@Override
	public String getStageStatus() {
		return model.getStageStatus();
	}

	/**
	 * Returns the update by source of this ogt application stage.
	 *
	 * @return the update by source of this ogt application stage
	 */
	@Override
	public String getUpdateBySource() {
		return model.getUpdateBySource();
	}

	/**
	 * Returns the user ID of this ogt application stage.
	 *
	 * @return the user ID of this ogt application stage
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ogt application stage.
	 *
	 * @return the user name of this ogt application stage
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ogt application stage.
	 *
	 * @return the user uuid of this ogt application stage
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this ogt application stage.
	 *
	 * @return the uuid of this ogt application stage
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
	 * Sets the case ID of this ogt application stage.
	 *
	 * @param caseId the case ID of this ogt application stage
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this ogt application stage.
	 *
	 * @param companyId the company ID of this ogt application stage
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this ogt application stage.
	 *
	 * @param createDate the create date of this ogt application stage
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the duration of this ogt application stage.
	 *
	 * @param duration the duration of this ogt application stage
	 */
	@Override
	public void setDuration(String duration) {
		model.setDuration(duration);
	}

	/**
	 * Sets the group ID of this ogt application stage.
	 *
	 * @param groupId the group ID of this ogt application stage
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this ogt application stage.
	 *
	 * @param modifiedDate the modified date of this ogt application stage
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ogt application ID of this ogt application stage.
	 *
	 * @param ogtApplicationId the ogt application ID of this ogt application stage
	 */
	@Override
	public void setOgtApplicationId(long ogtApplicationId) {
		model.setOgtApplicationId(ogtApplicationId);
	}

	/**
	 * Sets the ogt stages ID of this ogt application stage.
	 *
	 * @param ogtStagesId the ogt stages ID of this ogt application stage
	 */
	@Override
	public void setOgtStagesId(long ogtStagesId) {
		model.setOgtStagesId(ogtStagesId);
	}

	/**
	 * Sets the primary key of this ogt application stage.
	 *
	 * @param primaryKey the primary key of this ogt application stage
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the stage end date of this ogt application stage.
	 *
	 * @param stageEndDate the stage end date of this ogt application stage
	 */
	@Override
	public void setStageEndDate(Date stageEndDate) {
		model.setStageEndDate(stageEndDate);
	}

	/**
	 * Sets the stage name of this ogt application stage.
	 *
	 * @param stageName the stage name of this ogt application stage
	 */
	@Override
	public void setStageName(String stageName) {
		model.setStageName(stageName);
	}

	/**
	 * Sets the stage start date of this ogt application stage.
	 *
	 * @param stageStartDate the stage start date of this ogt application stage
	 */
	@Override
	public void setStageStartDate(Date stageStartDate) {
		model.setStageStartDate(stageStartDate);
	}

	/**
	 * Sets the stage status of this ogt application stage.
	 *
	 * @param stageStatus the stage status of this ogt application stage
	 */
	@Override
	public void setStageStatus(String stageStatus) {
		model.setStageStatus(stageStatus);
	}

	/**
	 * Sets the update by source of this ogt application stage.
	 *
	 * @param updateBySource the update by source of this ogt application stage
	 */
	@Override
	public void setUpdateBySource(String updateBySource) {
		model.setUpdateBySource(updateBySource);
	}

	/**
	 * Sets the user ID of this ogt application stage.
	 *
	 * @param userId the user ID of this ogt application stage
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ogt application stage.
	 *
	 * @param userName the user name of this ogt application stage
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ogt application stage.
	 *
	 * @param userUuid the user uuid of this ogt application stage
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this ogt application stage.
	 *
	 * @param uuid the uuid of this ogt application stage
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected OgtApplicationStageWrapper wrap(
		OgtApplicationStage ogtApplicationStage) {

		return new OgtApplicationStageWrapper(ogtApplicationStage);
	}

}