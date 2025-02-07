/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OsiDeskVerification}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiDeskVerification
 * @generated
 */
public class OsiDeskVerificationWrapper
	extends BaseModelWrapper<OsiDeskVerification>
	implements ModelWrapper<OsiDeskVerification>, OsiDeskVerification {

	public OsiDeskVerificationWrapper(OsiDeskVerification osiDeskVerification) {
		super(osiDeskVerification);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("osiDeskVerificationId", getOsiDeskVerificationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("documentName", getDocumentName());
		attributes.put("status", getStatus());
		attributes.put("osiApplicationId", getOsiApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long osiDeskVerificationId = (Long)attributes.get(
			"osiDeskVerificationId");

		if (osiDeskVerificationId != null) {
			setOsiDeskVerificationId(osiDeskVerificationId);
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

		String documentName = (String)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long osiApplicationId = (Long)attributes.get("osiApplicationId");

		if (osiApplicationId != null) {
			setOsiApplicationId(osiApplicationId);
		}
	}

	@Override
	public OsiDeskVerification cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this osi desk verification.
	 *
	 * @return the company ID of this osi desk verification
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi desk verification.
	 *
	 * @return the create date of this osi desk verification
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the document name of this osi desk verification.
	 *
	 * @return the document name of this osi desk verification
	 */
	@Override
	public String getDocumentName() {
		return model.getDocumentName();
	}

	/**
	 * Returns the group ID of this osi desk verification.
	 *
	 * @return the group ID of this osi desk verification
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this osi desk verification.
	 *
	 * @return the modified date of this osi desk verification
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi application ID of this osi desk verification.
	 *
	 * @return the osi application ID of this osi desk verification
	 */
	@Override
	public long getOsiApplicationId() {
		return model.getOsiApplicationId();
	}

	/**
	 * Returns the osi desk verification ID of this osi desk verification.
	 *
	 * @return the osi desk verification ID of this osi desk verification
	 */
	@Override
	public long getOsiDeskVerificationId() {
		return model.getOsiDeskVerificationId();
	}

	/**
	 * Returns the primary key of this osi desk verification.
	 *
	 * @return the primary key of this osi desk verification
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this osi desk verification.
	 *
	 * @return the status of this osi desk verification
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this osi desk verification.
	 *
	 * @return the user ID of this osi desk verification
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi desk verification.
	 *
	 * @return the user name of this osi desk verification
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi desk verification.
	 *
	 * @return the user uuid of this osi desk verification
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
	 * Sets the company ID of this osi desk verification.
	 *
	 * @param companyId the company ID of this osi desk verification
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi desk verification.
	 *
	 * @param createDate the create date of this osi desk verification
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the document name of this osi desk verification.
	 *
	 * @param documentName the document name of this osi desk verification
	 */
	@Override
	public void setDocumentName(String documentName) {
		model.setDocumentName(documentName);
	}

	/**
	 * Sets the group ID of this osi desk verification.
	 *
	 * @param groupId the group ID of this osi desk verification
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this osi desk verification.
	 *
	 * @param modifiedDate the modified date of this osi desk verification
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi application ID of this osi desk verification.
	 *
	 * @param osiApplicationId the osi application ID of this osi desk verification
	 */
	@Override
	public void setOsiApplicationId(long osiApplicationId) {
		model.setOsiApplicationId(osiApplicationId);
	}

	/**
	 * Sets the osi desk verification ID of this osi desk verification.
	 *
	 * @param osiDeskVerificationId the osi desk verification ID of this osi desk verification
	 */
	@Override
	public void setOsiDeskVerificationId(long osiDeskVerificationId) {
		model.setOsiDeskVerificationId(osiDeskVerificationId);
	}

	/**
	 * Sets the primary key of this osi desk verification.
	 *
	 * @param primaryKey the primary key of this osi desk verification
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this osi desk verification.
	 *
	 * @param status the status of this osi desk verification
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this osi desk verification.
	 *
	 * @param userId the user ID of this osi desk verification
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi desk verification.
	 *
	 * @param userName the user name of this osi desk verification
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi desk verification.
	 *
	 * @param userUuid the user uuid of this osi desk verification
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
	protected OsiDeskVerificationWrapper wrap(
		OsiDeskVerification osiDeskVerification) {

		return new OsiDeskVerificationWrapper(osiDeskVerification);
	}

}