/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CreativeDeskVerification}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeDeskVerification
 * @generated
 */
public class CreativeDeskVerificationWrapper
	extends BaseModelWrapper<CreativeDeskVerification>
	implements CreativeDeskVerification,
			   ModelWrapper<CreativeDeskVerification> {

	public CreativeDeskVerificationWrapper(
		CreativeDeskVerification creativeDeskVerification) {

		super(creativeDeskVerification);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"creativeDeskVerificationId", getCreativeDeskVerificationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("creativeApplicationId", getCreativeApplicationId());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentStatus", getDocumentStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long creativeDeskVerificationId = (Long)attributes.get(
			"creativeDeskVerificationId");

		if (creativeDeskVerificationId != null) {
			setCreativeDeskVerificationId(creativeDeskVerificationId);
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

		Long creativeApplicationId = (Long)attributes.get(
			"creativeApplicationId");

		if (creativeApplicationId != null) {
			setCreativeApplicationId(creativeApplicationId);
		}

		String documentName = (String)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		String documentStatus = (String)attributes.get("documentStatus");

		if (documentStatus != null) {
			setDocumentStatus(documentStatus);
		}
	}

	@Override
	public CreativeDeskVerification cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this creative desk verification.
	 *
	 * @return the company ID of this creative desk verification
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this creative desk verification.
	 *
	 * @return the create date of this creative desk verification
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the creative application ID of this creative desk verification.
	 *
	 * @return the creative application ID of this creative desk verification
	 */
	@Override
	public long getCreativeApplicationId() {
		return model.getCreativeApplicationId();
	}

	/**
	 * Returns the creative desk verification ID of this creative desk verification.
	 *
	 * @return the creative desk verification ID of this creative desk verification
	 */
	@Override
	public long getCreativeDeskVerificationId() {
		return model.getCreativeDeskVerificationId();
	}

	/**
	 * Returns the document name of this creative desk verification.
	 *
	 * @return the document name of this creative desk verification
	 */
	@Override
	public String getDocumentName() {
		return model.getDocumentName();
	}

	/**
	 * Returns the document status of this creative desk verification.
	 *
	 * @return the document status of this creative desk verification
	 */
	@Override
	public String getDocumentStatus() {
		return model.getDocumentStatus();
	}

	/**
	 * Returns the group ID of this creative desk verification.
	 *
	 * @return the group ID of this creative desk verification
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this creative desk verification.
	 *
	 * @return the modified date of this creative desk verification
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this creative desk verification.
	 *
	 * @return the primary key of this creative desk verification
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this creative desk verification.
	 *
	 * @return the user ID of this creative desk verification
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this creative desk verification.
	 *
	 * @return the user name of this creative desk verification
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this creative desk verification.
	 *
	 * @return the user uuid of this creative desk verification
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
	 * Sets the company ID of this creative desk verification.
	 *
	 * @param companyId the company ID of this creative desk verification
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this creative desk verification.
	 *
	 * @param createDate the create date of this creative desk verification
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the creative application ID of this creative desk verification.
	 *
	 * @param creativeApplicationId the creative application ID of this creative desk verification
	 */
	@Override
	public void setCreativeApplicationId(long creativeApplicationId) {
		model.setCreativeApplicationId(creativeApplicationId);
	}

	/**
	 * Sets the creative desk verification ID of this creative desk verification.
	 *
	 * @param creativeDeskVerificationId the creative desk verification ID of this creative desk verification
	 */
	@Override
	public void setCreativeDeskVerificationId(long creativeDeskVerificationId) {
		model.setCreativeDeskVerificationId(creativeDeskVerificationId);
	}

	/**
	 * Sets the document name of this creative desk verification.
	 *
	 * @param documentName the document name of this creative desk verification
	 */
	@Override
	public void setDocumentName(String documentName) {
		model.setDocumentName(documentName);
	}

	/**
	 * Sets the document status of this creative desk verification.
	 *
	 * @param documentStatus the document status of this creative desk verification
	 */
	@Override
	public void setDocumentStatus(String documentStatus) {
		model.setDocumentStatus(documentStatus);
	}

	/**
	 * Sets the group ID of this creative desk verification.
	 *
	 * @param groupId the group ID of this creative desk verification
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this creative desk verification.
	 *
	 * @param modifiedDate the modified date of this creative desk verification
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this creative desk verification.
	 *
	 * @param primaryKey the primary key of this creative desk verification
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this creative desk verification.
	 *
	 * @param userId the user ID of this creative desk verification
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this creative desk verification.
	 *
	 * @param userName the user name of this creative desk verification
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this creative desk verification.
	 *
	 * @param userUuid the user uuid of this creative desk verification
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
	protected CreativeDeskVerificationWrapper wrap(
		CreativeDeskVerification creativeDeskVerification) {

		return new CreativeDeskVerificationWrapper(creativeDeskVerification);
	}

}