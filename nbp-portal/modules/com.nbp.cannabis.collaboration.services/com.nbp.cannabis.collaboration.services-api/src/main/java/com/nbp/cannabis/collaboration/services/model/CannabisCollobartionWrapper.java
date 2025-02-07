/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.collaboration.services.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CannabisCollobartion}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisCollobartion
 * @generated
 */
public class CannabisCollobartionWrapper
	extends BaseModelWrapper<CannabisCollobartion>
	implements CannabisCollobartion, ModelWrapper<CannabisCollobartion> {

	public CannabisCollobartionWrapper(
		CannabisCollobartion cannabisCollobartion) {

		super(cannabisCollobartion);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("cannabisCollaborationId", getCannabisCollaborationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("cannabisStage", getCannabisStage());
		attributes.put("userType", getUserType());
		attributes.put("comment", getComment());
		attributes.put("status", getStatus());
		attributes.put("uploadedDocId", getUploadedDocId());
		attributes.put("caseId", getCaseId());
		attributes.put("applicationId", getApplicationId());
		attributes.put("archived", getArchived());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long cannabisCollaborationId = (Long)attributes.get(
			"cannabisCollaborationId");

		if (cannabisCollaborationId != null) {
			setCannabisCollaborationId(cannabisCollaborationId);
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

		String cannabisStage = (String)attributes.get("cannabisStage");

		if (cannabisStage != null) {
			setCannabisStage(cannabisStage);
		}

		String userType = (String)attributes.get("userType");

		if (userType != null) {
			setUserType(userType);
		}

		String comment = (String)attributes.get("comment");

		if (comment != null) {
			setComment(comment);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String uploadedDocId = (String)attributes.get("uploadedDocId");

		if (uploadedDocId != null) {
			setUploadedDocId(uploadedDocId);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		String applicationId = (String)attributes.get("applicationId");

		if (applicationId != null) {
			setApplicationId(applicationId);
		}

		Integer archived = (Integer)attributes.get("archived");

		if (archived != null) {
			setArchived(archived);
		}
	}

	@Override
	public CannabisCollobartion cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the application ID of this cannabis collobartion.
	 *
	 * @return the application ID of this cannabis collobartion
	 */
	@Override
	public String getApplicationId() {
		return model.getApplicationId();
	}

	/**
	 * Returns the archived of this cannabis collobartion.
	 *
	 * @return the archived of this cannabis collobartion
	 */
	@Override
	public int getArchived() {
		return model.getArchived();
	}

	/**
	 * Returns the cannabis collaboration ID of this cannabis collobartion.
	 *
	 * @return the cannabis collaboration ID of this cannabis collobartion
	 */
	@Override
	public long getCannabisCollaborationId() {
		return model.getCannabisCollaborationId();
	}

	/**
	 * Returns the cannabis stage of this cannabis collobartion.
	 *
	 * @return the cannabis stage of this cannabis collobartion
	 */
	@Override
	public String getCannabisStage() {
		return model.getCannabisStage();
	}

	/**
	 * Returns the case ID of this cannabis collobartion.
	 *
	 * @return the case ID of this cannabis collobartion
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the comment of this cannabis collobartion.
	 *
	 * @return the comment of this cannabis collobartion
	 */
	@Override
	public String getComment() {
		return model.getComment();
	}

	/**
	 * Returns the company ID of this cannabis collobartion.
	 *
	 * @return the company ID of this cannabis collobartion
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this cannabis collobartion.
	 *
	 * @return the create date of this cannabis collobartion
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this cannabis collobartion.
	 *
	 * @return the group ID of this cannabis collobartion
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this cannabis collobartion.
	 *
	 * @return the modified date of this cannabis collobartion
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this cannabis collobartion.
	 *
	 * @return the primary key of this cannabis collobartion
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this cannabis collobartion.
	 *
	 * @return the status of this cannabis collobartion
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the uploaded doc ID of this cannabis collobartion.
	 *
	 * @return the uploaded doc ID of this cannabis collobartion
	 */
	@Override
	public String getUploadedDocId() {
		return model.getUploadedDocId();
	}

	/**
	 * Returns the user ID of this cannabis collobartion.
	 *
	 * @return the user ID of this cannabis collobartion
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this cannabis collobartion.
	 *
	 * @return the user name of this cannabis collobartion
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user type of this cannabis collobartion.
	 *
	 * @return the user type of this cannabis collobartion
	 */
	@Override
	public String getUserType() {
		return model.getUserType();
	}

	/**
	 * Returns the user uuid of this cannabis collobartion.
	 *
	 * @return the user uuid of this cannabis collobartion
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this cannabis collobartion.
	 *
	 * @return the uuid of this cannabis collobartion
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
	 * Sets the application ID of this cannabis collobartion.
	 *
	 * @param applicationId the application ID of this cannabis collobartion
	 */
	@Override
	public void setApplicationId(String applicationId) {
		model.setApplicationId(applicationId);
	}

	/**
	 * Sets the archived of this cannabis collobartion.
	 *
	 * @param archived the archived of this cannabis collobartion
	 */
	@Override
	public void setArchived(int archived) {
		model.setArchived(archived);
	}

	/**
	 * Sets the cannabis collaboration ID of this cannabis collobartion.
	 *
	 * @param cannabisCollaborationId the cannabis collaboration ID of this cannabis collobartion
	 */
	@Override
	public void setCannabisCollaborationId(long cannabisCollaborationId) {
		model.setCannabisCollaborationId(cannabisCollaborationId);
	}

	/**
	 * Sets the cannabis stage of this cannabis collobartion.
	 *
	 * @param cannabisStage the cannabis stage of this cannabis collobartion
	 */
	@Override
	public void setCannabisStage(String cannabisStage) {
		model.setCannabisStage(cannabisStage);
	}

	/**
	 * Sets the case ID of this cannabis collobartion.
	 *
	 * @param caseId the case ID of this cannabis collobartion
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the comment of this cannabis collobartion.
	 *
	 * @param comment the comment of this cannabis collobartion
	 */
	@Override
	public void setComment(String comment) {
		model.setComment(comment);
	}

	/**
	 * Sets the company ID of this cannabis collobartion.
	 *
	 * @param companyId the company ID of this cannabis collobartion
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this cannabis collobartion.
	 *
	 * @param createDate the create date of this cannabis collobartion
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this cannabis collobartion.
	 *
	 * @param groupId the group ID of this cannabis collobartion
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this cannabis collobartion.
	 *
	 * @param modifiedDate the modified date of this cannabis collobartion
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this cannabis collobartion.
	 *
	 * @param primaryKey the primary key of this cannabis collobartion
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this cannabis collobartion.
	 *
	 * @param status the status of this cannabis collobartion
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the uploaded doc ID of this cannabis collobartion.
	 *
	 * @param uploadedDocId the uploaded doc ID of this cannabis collobartion
	 */
	@Override
	public void setUploadedDocId(String uploadedDocId) {
		model.setUploadedDocId(uploadedDocId);
	}

	/**
	 * Sets the user ID of this cannabis collobartion.
	 *
	 * @param userId the user ID of this cannabis collobartion
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this cannabis collobartion.
	 *
	 * @param userName the user name of this cannabis collobartion
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user type of this cannabis collobartion.
	 *
	 * @param userType the user type of this cannabis collobartion
	 */
	@Override
	public void setUserType(String userType) {
		model.setUserType(userType);
	}

	/**
	 * Sets the user uuid of this cannabis collobartion.
	 *
	 * @param userUuid the user uuid of this cannabis collobartion
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this cannabis collobartion.
	 *
	 * @param uuid the uuid of this cannabis collobartion
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
	protected CannabisCollobartionWrapper wrap(
		CannabisCollobartion cannabisCollobartion) {

		return new CannabisCollobartionWrapper(cannabisCollobartion);
	}

}