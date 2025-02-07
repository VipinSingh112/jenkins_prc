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

package com.npm.cannabis.application.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CannabisDeskVerification}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisDeskVerification
 * @generated
 */
public class CannabisDeskVerificationWrapper
	extends BaseModelWrapper<CannabisDeskVerification>
	implements CannabisDeskVerification,
			   ModelWrapper<CannabisDeskVerification> {

	public CannabisDeskVerificationWrapper(
		CannabisDeskVerification cannabisDeskVerification) {

		super(cannabisDeskVerification);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"cannabisDeskVerificationId", getCannabisDeskVerificationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("cannabisApplicationId", getCannabisApplicationId());
		attributes.put("documentStatus", getDocumentStatus());
		attributes.put("documentName", getDocumentName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cannabisDeskVerificationId = (Long)attributes.get(
			"cannabisDeskVerificationId");

		if (cannabisDeskVerificationId != null) {
			setCannabisDeskVerificationId(cannabisDeskVerificationId);
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

		Long cannabisApplicationId = (Long)attributes.get(
			"cannabisApplicationId");

		if (cannabisApplicationId != null) {
			setCannabisApplicationId(cannabisApplicationId);
		}

		String documentStatus = (String)attributes.get("documentStatus");

		if (documentStatus != null) {
			setDocumentStatus(documentStatus);
		}

		String documentName = (String)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}
	}

	@Override
	public CannabisDeskVerification cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the cannabis application ID of this cannabis desk verification.
	 *
	 * @return the cannabis application ID of this cannabis desk verification
	 */
	@Override
	public long getCannabisApplicationId() {
		return model.getCannabisApplicationId();
	}

	/**
	 * Returns the cannabis desk verification ID of this cannabis desk verification.
	 *
	 * @return the cannabis desk verification ID of this cannabis desk verification
	 */
	@Override
	public long getCannabisDeskVerificationId() {
		return model.getCannabisDeskVerificationId();
	}

	/**
	 * Returns the company ID of this cannabis desk verification.
	 *
	 * @return the company ID of this cannabis desk verification
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this cannabis desk verification.
	 *
	 * @return the create date of this cannabis desk verification
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the document name of this cannabis desk verification.
	 *
	 * @return the document name of this cannabis desk verification
	 */
	@Override
	public String getDocumentName() {
		return model.getDocumentName();
	}

	/**
	 * Returns the document status of this cannabis desk verification.
	 *
	 * @return the document status of this cannabis desk verification
	 */
	@Override
	public String getDocumentStatus() {
		return model.getDocumentStatus();
	}

	/**
	 * Returns the group ID of this cannabis desk verification.
	 *
	 * @return the group ID of this cannabis desk verification
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this cannabis desk verification.
	 *
	 * @return the modified date of this cannabis desk verification
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this cannabis desk verification.
	 *
	 * @return the primary key of this cannabis desk verification
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this cannabis desk verification.
	 *
	 * @return the user ID of this cannabis desk verification
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this cannabis desk verification.
	 *
	 * @return the user name of this cannabis desk verification
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this cannabis desk verification.
	 *
	 * @return the user uuid of this cannabis desk verification
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
	 * Sets the cannabis application ID of this cannabis desk verification.
	 *
	 * @param cannabisApplicationId the cannabis application ID of this cannabis desk verification
	 */
	@Override
	public void setCannabisApplicationId(long cannabisApplicationId) {
		model.setCannabisApplicationId(cannabisApplicationId);
	}

	/**
	 * Sets the cannabis desk verification ID of this cannabis desk verification.
	 *
	 * @param cannabisDeskVerificationId the cannabis desk verification ID of this cannabis desk verification
	 */
	@Override
	public void setCannabisDeskVerificationId(long cannabisDeskVerificationId) {
		model.setCannabisDeskVerificationId(cannabisDeskVerificationId);
	}

	/**
	 * Sets the company ID of this cannabis desk verification.
	 *
	 * @param companyId the company ID of this cannabis desk verification
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this cannabis desk verification.
	 *
	 * @param createDate the create date of this cannabis desk verification
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the document name of this cannabis desk verification.
	 *
	 * @param documentName the document name of this cannabis desk verification
	 */
	@Override
	public void setDocumentName(String documentName) {
		model.setDocumentName(documentName);
	}

	/**
	 * Sets the document status of this cannabis desk verification.
	 *
	 * @param documentStatus the document status of this cannabis desk verification
	 */
	@Override
	public void setDocumentStatus(String documentStatus) {
		model.setDocumentStatus(documentStatus);
	}

	/**
	 * Sets the group ID of this cannabis desk verification.
	 *
	 * @param groupId the group ID of this cannabis desk verification
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this cannabis desk verification.
	 *
	 * @param modifiedDate the modified date of this cannabis desk verification
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this cannabis desk verification.
	 *
	 * @param primaryKey the primary key of this cannabis desk verification
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this cannabis desk verification.
	 *
	 * @param userId the user ID of this cannabis desk verification
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this cannabis desk verification.
	 *
	 * @param userName the user name of this cannabis desk verification
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this cannabis desk verification.
	 *
	 * @param userUuid the user uuid of this cannabis desk verification
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected CannabisDeskVerificationWrapper wrap(
		CannabisDeskVerification cannabisDeskVerification) {

		return new CannabisDeskVerificationWrapper(cannabisDeskVerification);
	}

}