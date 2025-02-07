/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NcraFeeSubmission}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcraFeeSubmission
 * @generated
 */
public class NcraFeeSubmissionWrapper
	extends BaseModelWrapper<NcraFeeSubmission>
	implements ModelWrapper<NcraFeeSubmission>, NcraFeeSubmission {

	public NcraFeeSubmissionWrapper(NcraFeeSubmission ncraFeeSubmission) {
		super(ncraFeeSubmission);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ncraFeeSubmissionId", getNcraFeeSubmissionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("creditStatus", getCreditStatus());
		attributes.put("ncraApplicationId", getNcraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncraFeeSubmissionId = (Long)attributes.get("ncraFeeSubmissionId");

		if (ncraFeeSubmissionId != null) {
			setNcraFeeSubmissionId(ncraFeeSubmissionId);
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

		String creditStatus = (String)attributes.get("creditStatus");

		if (creditStatus != null) {
			setCreditStatus(creditStatus);
		}

		Long ncraApplicationId = (Long)attributes.get("ncraApplicationId");

		if (ncraApplicationId != null) {
			setNcraApplicationId(ncraApplicationId);
		}
	}

	@Override
	public NcraFeeSubmission cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this ncra fee submission.
	 *
	 * @return the company ID of this ncra fee submission
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this ncra fee submission.
	 *
	 * @return the create date of this ncra fee submission
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the credit status of this ncra fee submission.
	 *
	 * @return the credit status of this ncra fee submission
	 */
	@Override
	public String getCreditStatus() {
		return model.getCreditStatus();
	}

	/**
	 * Returns the group ID of this ncra fee submission.
	 *
	 * @return the group ID of this ncra fee submission
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this ncra fee submission.
	 *
	 * @return the modified date of this ncra fee submission
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncra application ID of this ncra fee submission.
	 *
	 * @return the ncra application ID of this ncra fee submission
	 */
	@Override
	public long getNcraApplicationId() {
		return model.getNcraApplicationId();
	}

	/**
	 * Returns the ncra fee submission ID of this ncra fee submission.
	 *
	 * @return the ncra fee submission ID of this ncra fee submission
	 */
	@Override
	public long getNcraFeeSubmissionId() {
		return model.getNcraFeeSubmissionId();
	}

	/**
	 * Returns the primary key of this ncra fee submission.
	 *
	 * @return the primary key of this ncra fee submission
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this ncra fee submission.
	 *
	 * @return the user ID of this ncra fee submission
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncra fee submission.
	 *
	 * @return the user name of this ncra fee submission
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncra fee submission.
	 *
	 * @return the user uuid of this ncra fee submission
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
	 * Sets the company ID of this ncra fee submission.
	 *
	 * @param companyId the company ID of this ncra fee submission
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this ncra fee submission.
	 *
	 * @param createDate the create date of this ncra fee submission
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the credit status of this ncra fee submission.
	 *
	 * @param creditStatus the credit status of this ncra fee submission
	 */
	@Override
	public void setCreditStatus(String creditStatus) {
		model.setCreditStatus(creditStatus);
	}

	/**
	 * Sets the group ID of this ncra fee submission.
	 *
	 * @param groupId the group ID of this ncra fee submission
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this ncra fee submission.
	 *
	 * @param modifiedDate the modified date of this ncra fee submission
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncra application ID of this ncra fee submission.
	 *
	 * @param ncraApplicationId the ncra application ID of this ncra fee submission
	 */
	@Override
	public void setNcraApplicationId(long ncraApplicationId) {
		model.setNcraApplicationId(ncraApplicationId);
	}

	/**
	 * Sets the ncra fee submission ID of this ncra fee submission.
	 *
	 * @param ncraFeeSubmissionId the ncra fee submission ID of this ncra fee submission
	 */
	@Override
	public void setNcraFeeSubmissionId(long ncraFeeSubmissionId) {
		model.setNcraFeeSubmissionId(ncraFeeSubmissionId);
	}

	/**
	 * Sets the primary key of this ncra fee submission.
	 *
	 * @param primaryKey the primary key of this ncra fee submission
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this ncra fee submission.
	 *
	 * @param userId the user ID of this ncra fee submission
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncra fee submission.
	 *
	 * @param userName the user name of this ncra fee submission
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncra fee submission.
	 *
	 * @param userUuid the user uuid of this ncra fee submission
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
	protected NcraFeeSubmissionWrapper wrap(
		NcraFeeSubmission ncraFeeSubmission) {

		return new NcraFeeSubmissionWrapper(ncraFeeSubmission);
	}

}