/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OsiInsolDataVerification}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolDataVerification
 * @generated
 */
public class OsiInsolDataVerificationWrapper
	extends BaseModelWrapper<OsiInsolDataVerification>
	implements ModelWrapper<OsiInsolDataVerification>,
			   OsiInsolDataVerification {

	public OsiInsolDataVerificationWrapper(
		OsiInsolDataVerification osiInsolDataVerification) {

		super(osiInsolDataVerification);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"osiInsolDataVerificationId", getOsiInsolDataVerificationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long osiInsolDataVerificationId = (Long)attributes.get(
			"osiInsolDataVerificationId");

		if (osiInsolDataVerificationId != null) {
			setOsiInsolDataVerificationId(osiInsolDataVerificationId);
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

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public OsiInsolDataVerification cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this osi insol data verification.
	 *
	 * @return the case ID of this osi insol data verification
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this osi insol data verification.
	 *
	 * @return the company ID of this osi insol data verification
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi insol data verification.
	 *
	 * @return the create date of this osi insol data verification
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this osi insol data verification.
	 *
	 * @return the group ID of this osi insol data verification
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this osi insol data verification.
	 *
	 * @return the modified date of this osi insol data verification
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insol data verification ID of this osi insol data verification.
	 *
	 * @return the osi insol data verification ID of this osi insol data verification
	 */
	@Override
	public long getOsiInsolDataVerificationId() {
		return model.getOsiInsolDataVerificationId();
	}

	/**
	 * Returns the primary key of this osi insol data verification.
	 *
	 * @return the primary key of this osi insol data verification
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this osi insol data verification.
	 *
	 * @return the status of this osi insol data verification
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this osi insol data verification.
	 *
	 * @return the user ID of this osi insol data verification
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi insol data verification.
	 *
	 * @return the user name of this osi insol data verification
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi insol data verification.
	 *
	 * @return the user uuid of this osi insol data verification
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
	 * Sets the case ID of this osi insol data verification.
	 *
	 * @param caseId the case ID of this osi insol data verification
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this osi insol data verification.
	 *
	 * @param companyId the company ID of this osi insol data verification
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi insol data verification.
	 *
	 * @param createDate the create date of this osi insol data verification
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this osi insol data verification.
	 *
	 * @param groupId the group ID of this osi insol data verification
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this osi insol data verification.
	 *
	 * @param modifiedDate the modified date of this osi insol data verification
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insol data verification ID of this osi insol data verification.
	 *
	 * @param osiInsolDataVerificationId the osi insol data verification ID of this osi insol data verification
	 */
	@Override
	public void setOsiInsolDataVerificationId(long osiInsolDataVerificationId) {
		model.setOsiInsolDataVerificationId(osiInsolDataVerificationId);
	}

	/**
	 * Sets the primary key of this osi insol data verification.
	 *
	 * @param primaryKey the primary key of this osi insol data verification
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this osi insol data verification.
	 *
	 * @param status the status of this osi insol data verification
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this osi insol data verification.
	 *
	 * @param userId the user ID of this osi insol data verification
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi insol data verification.
	 *
	 * @param userName the user name of this osi insol data verification
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi insol data verification.
	 *
	 * @param userUuid the user uuid of this osi insol data verification
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
	protected OsiInsolDataVerificationWrapper wrap(
		OsiInsolDataVerification osiInsolDataVerification) {

		return new OsiInsolDataVerificationWrapper(osiInsolDataVerification);
	}

}