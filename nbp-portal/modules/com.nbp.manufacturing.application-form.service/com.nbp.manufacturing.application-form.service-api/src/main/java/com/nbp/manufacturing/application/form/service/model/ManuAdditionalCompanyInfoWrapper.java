/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ManuAdditionalCompanyInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuAdditionalCompanyInfo
 * @generated
 */
public class ManuAdditionalCompanyInfoWrapper
	extends BaseModelWrapper<ManuAdditionalCompanyInfo>
	implements ManuAdditionalCompanyInfo,
			   ModelWrapper<ManuAdditionalCompanyInfo> {

	public ManuAdditionalCompanyInfoWrapper(
		ManuAdditionalCompanyInfo manuAdditionalCompanyInfo) {

		super(manuAdditionalCompanyInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"manuAdditionalCompanyInfoId", getManuAdditionalCompanyInfoId());
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
		Long manuAdditionalCompanyInfoId = (Long)attributes.get(
			"manuAdditionalCompanyInfoId");

		if (manuAdditionalCompanyInfoId != null) {
			setManuAdditionalCompanyInfoId(manuAdditionalCompanyInfoId);
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

		Date signatureDate = (Date)attributes.get("signatureDate");

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
	public ManuAdditionalCompanyInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the broker ID of this manu additional company info.
	 *
	 * @return the broker ID of this manu additional company info
	 */
	@Override
	public String getBrokerId() {
		return model.getBrokerId();
	}

	/**
	 * Returns the company ID of this manu additional company info.
	 *
	 * @return the company ID of this manu additional company info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company name representative of this manu additional company info.
	 *
	 * @return the company name representative of this manu additional company info
	 */
	@Override
	public String getCompanyNameRepresentative() {
		return model.getCompanyNameRepresentative();
	}

	/**
	 * Returns the company signature representative of this manu additional company info.
	 *
	 * @return the company signature representative of this manu additional company info
	 */
	@Override
	public String getCompanySignatureRepresentative() {
		return model.getCompanySignatureRepresentative();
	}

	/**
	 * Returns the create date of this manu additional company info.
	 *
	 * @return the create date of this manu additional company info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the custom broker address of this manu additional company info.
	 *
	 * @return the custom broker address of this manu additional company info
	 */
	@Override
	public String getCustomBrokerAddress() {
		return model.getCustomBrokerAddress();
	}

	/**
	 * Returns the custom broker name of this manu additional company info.
	 *
	 * @return the custom broker name of this manu additional company info
	 */
	@Override
	public String getCustomBrokerName() {
		return model.getCustomBrokerName();
	}

	/**
	 * Returns the group ID of this manu additional company info.
	 *
	 * @return the group ID of this manu additional company info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the manu additional company info ID of this manu additional company info.
	 *
	 * @return the manu additional company info ID of this manu additional company info
	 */
	@Override
	public long getManuAdditionalCompanyInfoId() {
		return model.getManuAdditionalCompanyInfoId();
	}

	/**
	 * Returns the manufacturing application ID of this manu additional company info.
	 *
	 * @return the manufacturing application ID of this manu additional company info
	 */
	@Override
	public long getManufacturingApplicationId() {
		return model.getManufacturingApplicationId();
	}

	/**
	 * Returns the modified date of this manu additional company info.
	 *
	 * @return the modified date of this manu additional company info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this manu additional company info.
	 *
	 * @return the primary key of this manu additional company info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the signature date of this manu additional company info.
	 *
	 * @return the signature date of this manu additional company info
	 */
	@Override
	public Date getSignatureDate() {
		return model.getSignatureDate();
	}

	/**
	 * Returns the telephone number of this manu additional company info.
	 *
	 * @return the telephone number of this manu additional company info
	 */
	@Override
	public String getTelephoneNumber() {
		return model.getTelephoneNumber();
	}

	/**
	 * Returns the user ID of this manu additional company info.
	 *
	 * @return the user ID of this manu additional company info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this manu additional company info.
	 *
	 * @return the user name of this manu additional company info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this manu additional company info.
	 *
	 * @return the user uuid of this manu additional company info
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
	 * Sets the broker ID of this manu additional company info.
	 *
	 * @param brokerId the broker ID of this manu additional company info
	 */
	@Override
	public void setBrokerId(String brokerId) {
		model.setBrokerId(brokerId);
	}

	/**
	 * Sets the company ID of this manu additional company info.
	 *
	 * @param companyId the company ID of this manu additional company info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company name representative of this manu additional company info.
	 *
	 * @param companyNameRepresentative the company name representative of this manu additional company info
	 */
	@Override
	public void setCompanyNameRepresentative(String companyNameRepresentative) {
		model.setCompanyNameRepresentative(companyNameRepresentative);
	}

	/**
	 * Sets the company signature representative of this manu additional company info.
	 *
	 * @param companySignatureRepresentative the company signature representative of this manu additional company info
	 */
	@Override
	public void setCompanySignatureRepresentative(
		String companySignatureRepresentative) {

		model.setCompanySignatureRepresentative(companySignatureRepresentative);
	}

	/**
	 * Sets the create date of this manu additional company info.
	 *
	 * @param createDate the create date of this manu additional company info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the custom broker address of this manu additional company info.
	 *
	 * @param customBrokerAddress the custom broker address of this manu additional company info
	 */
	@Override
	public void setCustomBrokerAddress(String customBrokerAddress) {
		model.setCustomBrokerAddress(customBrokerAddress);
	}

	/**
	 * Sets the custom broker name of this manu additional company info.
	 *
	 * @param customBrokerName the custom broker name of this manu additional company info
	 */
	@Override
	public void setCustomBrokerName(String customBrokerName) {
		model.setCustomBrokerName(customBrokerName);
	}

	/**
	 * Sets the group ID of this manu additional company info.
	 *
	 * @param groupId the group ID of this manu additional company info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the manu additional company info ID of this manu additional company info.
	 *
	 * @param manuAdditionalCompanyInfoId the manu additional company info ID of this manu additional company info
	 */
	@Override
	public void setManuAdditionalCompanyInfoId(
		long manuAdditionalCompanyInfoId) {

		model.setManuAdditionalCompanyInfoId(manuAdditionalCompanyInfoId);
	}

	/**
	 * Sets the manufacturing application ID of this manu additional company info.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID of this manu additional company info
	 */
	@Override
	public void setManufacturingApplicationId(long manufacturingApplicationId) {
		model.setManufacturingApplicationId(manufacturingApplicationId);
	}

	/**
	 * Sets the modified date of this manu additional company info.
	 *
	 * @param modifiedDate the modified date of this manu additional company info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this manu additional company info.
	 *
	 * @param primaryKey the primary key of this manu additional company info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the signature date of this manu additional company info.
	 *
	 * @param signatureDate the signature date of this manu additional company info
	 */
	@Override
	public void setSignatureDate(Date signatureDate) {
		model.setSignatureDate(signatureDate);
	}

	/**
	 * Sets the telephone number of this manu additional company info.
	 *
	 * @param telephoneNumber the telephone number of this manu additional company info
	 */
	@Override
	public void setTelephoneNumber(String telephoneNumber) {
		model.setTelephoneNumber(telephoneNumber);
	}

	/**
	 * Sets the user ID of this manu additional company info.
	 *
	 * @param userId the user ID of this manu additional company info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this manu additional company info.
	 *
	 * @param userName the user name of this manu additional company info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this manu additional company info.
	 *
	 * @param userUuid the user uuid of this manu additional company info
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
	protected ManuAdditionalCompanyInfoWrapper wrap(
		ManuAdditionalCompanyInfo manuAdditionalCompanyInfo) {

		return new ManuAdditionalCompanyInfoWrapper(manuAdditionalCompanyInfo);
	}

}