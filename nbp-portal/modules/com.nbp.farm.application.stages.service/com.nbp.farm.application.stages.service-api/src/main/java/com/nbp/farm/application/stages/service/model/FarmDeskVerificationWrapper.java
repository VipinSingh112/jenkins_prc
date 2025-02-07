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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FarmDeskVerification}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmDeskVerification
 * @generated
 */
public class FarmDeskVerificationWrapper
	extends BaseModelWrapper<FarmDeskVerification>
	implements FarmDeskVerification, ModelWrapper<FarmDeskVerification> {

	public FarmDeskVerificationWrapper(
		FarmDeskVerification farmDeskVerification) {

		super(farmDeskVerification);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("farmDeskVerificationId", getFarmDeskVerificationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("farmerApplicationId", getFarmerApplicationId());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentStatus", getDocumentStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long farmDeskVerificationId = (Long)attributes.get(
			"farmDeskVerificationId");

		if (farmDeskVerificationId != null) {
			setFarmDeskVerificationId(farmDeskVerificationId);
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

		Long farmerApplicationId = (Long)attributes.get("farmerApplicationId");

		if (farmerApplicationId != null) {
			setFarmerApplicationId(farmerApplicationId);
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
	public FarmDeskVerification cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this farm desk verification.
	 *
	 * @return the company ID of this farm desk verification
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this farm desk verification.
	 *
	 * @return the create date of this farm desk verification
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the document name of this farm desk verification.
	 *
	 * @return the document name of this farm desk verification
	 */
	@Override
	public String getDocumentName() {
		return model.getDocumentName();
	}

	/**
	 * Returns the document status of this farm desk verification.
	 *
	 * @return the document status of this farm desk verification
	 */
	@Override
	public String getDocumentStatus() {
		return model.getDocumentStatus();
	}

	/**
	 * Returns the farm desk verification ID of this farm desk verification.
	 *
	 * @return the farm desk verification ID of this farm desk verification
	 */
	@Override
	public long getFarmDeskVerificationId() {
		return model.getFarmDeskVerificationId();
	}

	/**
	 * Returns the farmer application ID of this farm desk verification.
	 *
	 * @return the farmer application ID of this farm desk verification
	 */
	@Override
	public long getFarmerApplicationId() {
		return model.getFarmerApplicationId();
	}

	/**
	 * Returns the group ID of this farm desk verification.
	 *
	 * @return the group ID of this farm desk verification
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this farm desk verification.
	 *
	 * @return the modified date of this farm desk verification
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this farm desk verification.
	 *
	 * @return the primary key of this farm desk verification
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this farm desk verification.
	 *
	 * @return the user ID of this farm desk verification
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this farm desk verification.
	 *
	 * @return the user name of this farm desk verification
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this farm desk verification.
	 *
	 * @return the user uuid of this farm desk verification
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
	 * Sets the company ID of this farm desk verification.
	 *
	 * @param companyId the company ID of this farm desk verification
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this farm desk verification.
	 *
	 * @param createDate the create date of this farm desk verification
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the document name of this farm desk verification.
	 *
	 * @param documentName the document name of this farm desk verification
	 */
	@Override
	public void setDocumentName(String documentName) {
		model.setDocumentName(documentName);
	}

	/**
	 * Sets the document status of this farm desk verification.
	 *
	 * @param documentStatus the document status of this farm desk verification
	 */
	@Override
	public void setDocumentStatus(String documentStatus) {
		model.setDocumentStatus(documentStatus);
	}

	/**
	 * Sets the farm desk verification ID of this farm desk verification.
	 *
	 * @param farmDeskVerificationId the farm desk verification ID of this farm desk verification
	 */
	@Override
	public void setFarmDeskVerificationId(long farmDeskVerificationId) {
		model.setFarmDeskVerificationId(farmDeskVerificationId);
	}

	/**
	 * Sets the farmer application ID of this farm desk verification.
	 *
	 * @param farmerApplicationId the farmer application ID of this farm desk verification
	 */
	@Override
	public void setFarmerApplicationId(long farmerApplicationId) {
		model.setFarmerApplicationId(farmerApplicationId);
	}

	/**
	 * Sets the group ID of this farm desk verification.
	 *
	 * @param groupId the group ID of this farm desk verification
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this farm desk verification.
	 *
	 * @param modifiedDate the modified date of this farm desk verification
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this farm desk verification.
	 *
	 * @param primaryKey the primary key of this farm desk verification
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this farm desk verification.
	 *
	 * @param userId the user ID of this farm desk verification
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this farm desk verification.
	 *
	 * @param userName the user name of this farm desk verification
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this farm desk verification.
	 *
	 * @param userUuid the user uuid of this farm desk verification
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected FarmDeskVerificationWrapper wrap(
		FarmDeskVerification farmDeskVerification) {

		return new FarmDeskVerificationWrapper(farmDeskVerification);
	}

}