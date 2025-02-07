/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PharmaApplicationStages}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationStages
 * @generated
 */
public class PharmaApplicationStagesWrapper
	extends BaseModelWrapper<PharmaApplicationStages>
	implements ModelWrapper<PharmaApplicationStages>, PharmaApplicationStages {

	public PharmaApplicationStagesWrapper(
		PharmaApplicationStages pharmaApplicationStages) {

		super(pharmaApplicationStages);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"pharmaApplicationstageId", getPharmaApplicationstageId());
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
		attributes.put("pharmaApplicationId", getPharmaApplicationId());
		attributes.put("caseId", getCaseId());
		attributes.put("updatedBySource", getUpdatedBySource());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long pharmaApplicationstageId = (Long)attributes.get(
			"pharmaApplicationstageId");

		if (pharmaApplicationstageId != null) {
			setPharmaApplicationstageId(pharmaApplicationstageId);
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

		Long pharmaApplicationId = (Long)attributes.get("pharmaApplicationId");

		if (pharmaApplicationId != null) {
			setPharmaApplicationId(pharmaApplicationId);
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
	public PharmaApplicationStages cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this pharma application stages.
	 *
	 * @return the case ID of this pharma application stages
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this pharma application stages.
	 *
	 * @return the company ID of this pharma application stages
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this pharma application stages.
	 *
	 * @return the create date of this pharma application stages
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the duration of this pharma application stages.
	 *
	 * @return the duration of this pharma application stages
	 */
	@Override
	public String getDuration() {
		return model.getDuration();
	}

	/**
	 * Returns the group ID of this pharma application stages.
	 *
	 * @return the group ID of this pharma application stages
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this pharma application stages.
	 *
	 * @return the modified date of this pharma application stages
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pharma application ID of this pharma application stages.
	 *
	 * @return the pharma application ID of this pharma application stages
	 */
	@Override
	public long getPharmaApplicationId() {
		return model.getPharmaApplicationId();
	}

	/**
	 * Returns the pharma applicationstage ID of this pharma application stages.
	 *
	 * @return the pharma applicationstage ID of this pharma application stages
	 */
	@Override
	public long getPharmaApplicationstageId() {
		return model.getPharmaApplicationstageId();
	}

	/**
	 * Returns the primary key of this pharma application stages.
	 *
	 * @return the primary key of this pharma application stages
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the stage end date of this pharma application stages.
	 *
	 * @return the stage end date of this pharma application stages
	 */
	@Override
	public Date getStageEndDate() {
		return model.getStageEndDate();
	}

	/**
	 * Returns the stage name of this pharma application stages.
	 *
	 * @return the stage name of this pharma application stages
	 */
	@Override
	public String getStageName() {
		return model.getStageName();
	}

	/**
	 * Returns the stage start date of this pharma application stages.
	 *
	 * @return the stage start date of this pharma application stages
	 */
	@Override
	public Date getStageStartDate() {
		return model.getStageStartDate();
	}

	/**
	 * Returns the stage status of this pharma application stages.
	 *
	 * @return the stage status of this pharma application stages
	 */
	@Override
	public String getStageStatus() {
		return model.getStageStatus();
	}

	/**
	 * Returns the updated by source of this pharma application stages.
	 *
	 * @return the updated by source of this pharma application stages
	 */
	@Override
	public String getUpdatedBySource() {
		return model.getUpdatedBySource();
	}

	/**
	 * Returns the user ID of this pharma application stages.
	 *
	 * @return the user ID of this pharma application stages
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this pharma application stages.
	 *
	 * @return the user name of this pharma application stages
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this pharma application stages.
	 *
	 * @return the user uuid of this pharma application stages
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
	 * Sets the case ID of this pharma application stages.
	 *
	 * @param caseId the case ID of this pharma application stages
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this pharma application stages.
	 *
	 * @param companyId the company ID of this pharma application stages
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this pharma application stages.
	 *
	 * @param createDate the create date of this pharma application stages
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the duration of this pharma application stages.
	 *
	 * @param duration the duration of this pharma application stages
	 */
	@Override
	public void setDuration(String duration) {
		model.setDuration(duration);
	}

	/**
	 * Sets the group ID of this pharma application stages.
	 *
	 * @param groupId the group ID of this pharma application stages
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this pharma application stages.
	 *
	 * @param modifiedDate the modified date of this pharma application stages
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pharma application ID of this pharma application stages.
	 *
	 * @param pharmaApplicationId the pharma application ID of this pharma application stages
	 */
	@Override
	public void setPharmaApplicationId(long pharmaApplicationId) {
		model.setPharmaApplicationId(pharmaApplicationId);
	}

	/**
	 * Sets the pharma applicationstage ID of this pharma application stages.
	 *
	 * @param pharmaApplicationstageId the pharma applicationstage ID of this pharma application stages
	 */
	@Override
	public void setPharmaApplicationstageId(long pharmaApplicationstageId) {
		model.setPharmaApplicationstageId(pharmaApplicationstageId);
	}

	/**
	 * Sets the primary key of this pharma application stages.
	 *
	 * @param primaryKey the primary key of this pharma application stages
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the stage end date of this pharma application stages.
	 *
	 * @param stageEndDate the stage end date of this pharma application stages
	 */
	@Override
	public void setStageEndDate(Date stageEndDate) {
		model.setStageEndDate(stageEndDate);
	}

	/**
	 * Sets the stage name of this pharma application stages.
	 *
	 * @param stageName the stage name of this pharma application stages
	 */
	@Override
	public void setStageName(String stageName) {
		model.setStageName(stageName);
	}

	/**
	 * Sets the stage start date of this pharma application stages.
	 *
	 * @param stageStartDate the stage start date of this pharma application stages
	 */
	@Override
	public void setStageStartDate(Date stageStartDate) {
		model.setStageStartDate(stageStartDate);
	}

	/**
	 * Sets the stage status of this pharma application stages.
	 *
	 * @param stageStatus the stage status of this pharma application stages
	 */
	@Override
	public void setStageStatus(String stageStatus) {
		model.setStageStatus(stageStatus);
	}

	/**
	 * Sets the updated by source of this pharma application stages.
	 *
	 * @param updatedBySource the updated by source of this pharma application stages
	 */
	@Override
	public void setUpdatedBySource(String updatedBySource) {
		model.setUpdatedBySource(updatedBySource);
	}

	/**
	 * Sets the user ID of this pharma application stages.
	 *
	 * @param userId the user ID of this pharma application stages
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this pharma application stages.
	 *
	 * @param userName the user name of this pharma application stages
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this pharma application stages.
	 *
	 * @param userUuid the user uuid of this pharma application stages
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
	protected PharmaApplicationStagesWrapper wrap(
		PharmaApplicationStages pharmaApplicationStages) {

		return new PharmaApplicationStagesWrapper(pharmaApplicationStages);
	}

}