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

package com.nbp.manufacturing.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ManuAdditionalComapnyInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuAdditionalComapnyInfo
 * @generated
 */
public class ManuAdditionalComapnyInfoWrapper
	extends BaseModelWrapper<ManuAdditionalComapnyInfo>
	implements ManuAdditionalComapnyInfo,
			   ModelWrapper<ManuAdditionalComapnyInfo> {

	public ManuAdditionalComapnyInfoWrapper(
		ManuAdditionalComapnyInfo manuAdditionalComapnyInfo) {

		super(manuAdditionalComapnyInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"manuAdditionalComapnyInfoId", getManuAdditionalComapnyInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"companyNameRepresentative", getCompanyNameRepresentative());
		attributes.put(
			"companySignatureRepresentative",
			getCompanySignatureRepresentative());
		attributes.put("signatureDate", getSignatureDate());
		attributes.put("customBrokerName", getCustomBrokerName());
		attributes.put("customBrokerAddress", getCustomBrokerAddress());
		attributes.put("telephoneNumber", getTelephoneNumber());
		attributes.put("brokerId", getBrokerId());
		attributes.put(
			"manufacturingApplicationId", getManufacturingApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long manuAdditionalComapnyInfoId = (Long)attributes.get(
			"manuAdditionalComapnyInfoId");

		if (manuAdditionalComapnyInfoId != null) {
			setManuAdditionalComapnyInfoId(manuAdditionalComapnyInfoId);
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

		String companyNameRepresentative = (String)attributes.get(
			"companyNameRepresentative");

		if (companyNameRepresentative != null) {
			setCompanyNameRepresentative(companyNameRepresentative);
		}

		String companySignatureRepresentative = (String)attributes.get(
			"companySignatureRepresentative");

		if (companySignatureRepresentative != null) {
			setCompanySignatureRepresentative(companySignatureRepresentative);
		}

		String signatureDate = (String)attributes.get("signatureDate");

		if (signatureDate != null) {
			setSignatureDate(signatureDate);
		}

		String customBrokerName = (String)attributes.get("customBrokerName");

		if (customBrokerName != null) {
			setCustomBrokerName(customBrokerName);
		}

		String customBrokerAddress = (String)attributes.get(
			"customBrokerAddress");

		if (customBrokerAddress != null) {
			setCustomBrokerAddress(customBrokerAddress);
		}

		String telephoneNumber = (String)attributes.get("telephoneNumber");

		if (telephoneNumber != null) {
			setTelephoneNumber(telephoneNumber);
		}

		String brokerId = (String)attributes.get("brokerId");

		if (brokerId != null) {
			setBrokerId(brokerId);
		}

		Long manufacturingApplicationId = (Long)attributes.get(
			"manufacturingApplicationId");

		if (manufacturingApplicationId != null) {
			setManufacturingApplicationId(manufacturingApplicationId);
		}
	}

	@Override
	public ManuAdditionalComapnyInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the broker ID of this manu additional comapny info.
	 *
	 * @return the broker ID of this manu additional comapny info
	 */
	@Override
	public String getBrokerId() {
		return model.getBrokerId();
	}

	/**
	 * Returns the company ID of this manu additional comapny info.
	 *
	 * @return the company ID of this manu additional comapny info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company name representative of this manu additional comapny info.
	 *
	 * @return the company name representative of this manu additional comapny info
	 */
	@Override
	public String getCompanyNameRepresentative() {
		return model.getCompanyNameRepresentative();
	}

	/**
	 * Returns the company signature representative of this manu additional comapny info.
	 *
	 * @return the company signature representative of this manu additional comapny info
	 */
	@Override
	public String getCompanySignatureRepresentative() {
		return model.getCompanySignatureRepresentative();
	}

	/**
	 * Returns the create date of this manu additional comapny info.
	 *
	 * @return the create date of this manu additional comapny info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the custom broker address of this manu additional comapny info.
	 *
	 * @return the custom broker address of this manu additional comapny info
	 */
	@Override
	public String getCustomBrokerAddress() {
		return model.getCustomBrokerAddress();
	}

	/**
	 * Returns the custom broker name of this manu additional comapny info.
	 *
	 * @return the custom broker name of this manu additional comapny info
	 */
	@Override
	public String getCustomBrokerName() {
		return model.getCustomBrokerName();
	}

	/**
	 * Returns the group ID of this manu additional comapny info.
	 *
	 * @return the group ID of this manu additional comapny info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the manu additional comapny info ID of this manu additional comapny info.
	 *
	 * @return the manu additional comapny info ID of this manu additional comapny info
	 */
	@Override
	public long getManuAdditionalComapnyInfoId() {
		return model.getManuAdditionalComapnyInfoId();
	}

	/**
	 * Returns the manufacturing application ID of this manu additional comapny info.
	 *
	 * @return the manufacturing application ID of this manu additional comapny info
	 */
	@Override
	public long getManufacturingApplicationId() {
		return model.getManufacturingApplicationId();
	}

	/**
	 * Returns the modified date of this manu additional comapny info.
	 *
	 * @return the modified date of this manu additional comapny info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this manu additional comapny info.
	 *
	 * @return the primary key of this manu additional comapny info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the signature date of this manu additional comapny info.
	 *
	 * @return the signature date of this manu additional comapny info
	 */
	@Override
	public String getSignatureDate() {
		return model.getSignatureDate();
	}

	/**
	 * Returns the telephone number of this manu additional comapny info.
	 *
	 * @return the telephone number of this manu additional comapny info
	 */
	@Override
	public String getTelephoneNumber() {
		return model.getTelephoneNumber();
	}

	/**
	 * Returns the user ID of this manu additional comapny info.
	 *
	 * @return the user ID of this manu additional comapny info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this manu additional comapny info.
	 *
	 * @return the user name of this manu additional comapny info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this manu additional comapny info.
	 *
	 * @return the user uuid of this manu additional comapny info
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
	 * Sets the broker ID of this manu additional comapny info.
	 *
	 * @param brokerId the broker ID of this manu additional comapny info
	 */
	@Override
	public void setBrokerId(String brokerId) {
		model.setBrokerId(brokerId);
	}

	/**
	 * Sets the company ID of this manu additional comapny info.
	 *
	 * @param companyId the company ID of this manu additional comapny info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company name representative of this manu additional comapny info.
	 *
	 * @param companyNameRepresentative the company name representative of this manu additional comapny info
	 */
	@Override
	public void setCompanyNameRepresentative(String companyNameRepresentative) {
		model.setCompanyNameRepresentative(companyNameRepresentative);
	}

	/**
	 * Sets the company signature representative of this manu additional comapny info.
	 *
	 * @param companySignatureRepresentative the company signature representative of this manu additional comapny info
	 */
	@Override
	public void setCompanySignatureRepresentative(
		String companySignatureRepresentative) {

		model.setCompanySignatureRepresentative(companySignatureRepresentative);
	}

	/**
	 * Sets the create date of this manu additional comapny info.
	 *
	 * @param createDate the create date of this manu additional comapny info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the custom broker address of this manu additional comapny info.
	 *
	 * @param customBrokerAddress the custom broker address of this manu additional comapny info
	 */
	@Override
	public void setCustomBrokerAddress(String customBrokerAddress) {
		model.setCustomBrokerAddress(customBrokerAddress);
	}

	/**
	 * Sets the custom broker name of this manu additional comapny info.
	 *
	 * @param customBrokerName the custom broker name of this manu additional comapny info
	 */
	@Override
	public void setCustomBrokerName(String customBrokerName) {
		model.setCustomBrokerName(customBrokerName);
	}

	/**
	 * Sets the group ID of this manu additional comapny info.
	 *
	 * @param groupId the group ID of this manu additional comapny info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the manu additional comapny info ID of this manu additional comapny info.
	 *
	 * @param manuAdditionalComapnyInfoId the manu additional comapny info ID of this manu additional comapny info
	 */
	@Override
	public void setManuAdditionalComapnyInfoId(
		long manuAdditionalComapnyInfoId) {

		model.setManuAdditionalComapnyInfoId(manuAdditionalComapnyInfoId);
	}

	/**
	 * Sets the manufacturing application ID of this manu additional comapny info.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID of this manu additional comapny info
	 */
	@Override
	public void setManufacturingApplicationId(long manufacturingApplicationId) {
		model.setManufacturingApplicationId(manufacturingApplicationId);
	}

	/**
	 * Sets the modified date of this manu additional comapny info.
	 *
	 * @param modifiedDate the modified date of this manu additional comapny info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this manu additional comapny info.
	 *
	 * @param primaryKey the primary key of this manu additional comapny info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the signature date of this manu additional comapny info.
	 *
	 * @param signatureDate the signature date of this manu additional comapny info
	 */
	@Override
	public void setSignatureDate(String signatureDate) {
		model.setSignatureDate(signatureDate);
	}

	/**
	 * Sets the telephone number of this manu additional comapny info.
	 *
	 * @param telephoneNumber the telephone number of this manu additional comapny info
	 */
	@Override
	public void setTelephoneNumber(String telephoneNumber) {
		model.setTelephoneNumber(telephoneNumber);
	}

	/**
	 * Sets the user ID of this manu additional comapny info.
	 *
	 * @param userId the user ID of this manu additional comapny info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this manu additional comapny info.
	 *
	 * @param userName the user name of this manu additional comapny info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this manu additional comapny info.
	 *
	 * @param userUuid the user uuid of this manu additional comapny info
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected ManuAdditionalComapnyInfoWrapper wrap(
		ManuAdditionalComapnyInfo manuAdditionalComapnyInfo) {

		return new ManuAdditionalComapnyInfoWrapper(manuAdditionalComapnyInfo);
	}

}